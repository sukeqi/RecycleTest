package test.andoid.cn.recycletest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    private Context context;
    private int count;

    MyAdapter(Context context, int count) {
        this.count = count;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View root = null;
        if (viewType == MainActivity.RECYCLEVIEW_ITEM_TITLE) {
            root = LayoutInflater.from(context).inflate(R.layout.item_title, viewGroup, false);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_HEADER) {
            root = LayoutInflater.from(context).inflate(R.layout.item_head, viewGroup, false);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_FOOT) {
            root = LayoutInflater.from(context).inflate(R.layout.item_foot, viewGroup, false);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_PRODUCT) {
            root = LayoutInflater.from(context).inflate(R.layout.item_product, viewGroup, false);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_HEIGHT) {
            root = LayoutInflater.from(context).inflate(R.layout.item_height, viewGroup, false);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_SPEAK) {
            root = LayoutInflater.from(context).inflate(R.layout.item_speak, viewGroup, false);
        }
        return new MyHolder(root, viewType);
    }

    @Override
    public void onBindViewHolder(MyHolder myHolder, int position) {
        int itemViewType = getItemViewType(position);
        switch (itemViewType){
            case MainActivity.RECYCLERVIEW_ITEM_PRODUCT:
                myHolder.product_count.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context,ExpandViewActivity.class);
                        context.startActivity(intent);
                    }
                });
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return MainActivity.RECYCLEVIEW_ITEM_TITLE;
        } else if (position == 1) {
            return MainActivity.RECYCLERVIEW_ITEM_HEADER;
        } else if (position == 2) {
            return MainActivity.RECYCLERVIEW_ITEM_FOOT;
        } else if (position == 3) {
            return MainActivity.RECYCLERVIEW_ITEM_HEIGHT;
        } else if (position == 4) {
            return MainActivity.RECYCLEVIEW_ITEM_TITLE;
        } else if (position == 5) {
            return MainActivity.RECYCLERVIEW_ITEM_PRODUCT;
        } else if (position == 6) {
            return MainActivity.RECYCLERVIEW_ITEM_SPEAK;
        }
        return super.getItemViewType(position);

    }

    /**
     * 设置数据源总的条目
     *
     * @return
     */
    @Override
    public int getItemCount() {
        //返回条目数加头布局个数
        return count + 1;
    }

}
