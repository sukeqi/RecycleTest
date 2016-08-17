package test.andoid.cn.recycletest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewDebug;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by jyd-pc006 on 16/7/8.
 */
public class MyHolder extends RecyclerView.ViewHolder {
    //title
    public TextView title;

    //组合购商品
    public ImageView group_image;
    public TextView group_name;
    public TextView group_price;
    public LinearLayout add;
    public EditText count;
    public LinearLayout cut;

    //组合购优惠商品
    public ImageView group_image_item;
    public TextView group_name_item;
    public TextView group_price_item;
    public TextView group_old_price_item;
    public TextView group_count_item;

    //普通商品
    public ImageView product_image;
    public TextView product_name;
    public TextView product_price;
    public TextView product_old_price;
    public LinearLayout adds;
    public EditText product_count;
    public LinearLayout cuts;

    //间距
    public LinearLayout height;

    //商家留言
    public EditText speak_ed;

    private Context context;


    public MyHolder(View itemView, int viewType) {
        super(itemView);
        initView(itemView, viewType);
    }

    private void initView(View itemView, int viewType) {
        if (viewType == MainActivity.RECYCLEVIEW_ITEM_TITLE) {
            title = (TextView) itemView.findViewById(R.id.title);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_HEADER) {
            group_image = (ImageView) itemView.findViewById(R.id.image_group);
            group_name = (TextView) itemView.findViewById(R.id.group_name);
            group_price = (TextView) itemView.findViewById(R.id.group_price);
            add = (LinearLayout) itemView.findViewById(R.id.add);
            count = (EditText) itemView.findViewById(R.id.count_group);
            cut = (LinearLayout) itemView.findViewById(R.id.cut);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_FOOT) {
            group_image_item = (ImageView) itemView.findViewById(R.id.image);
            group_name_item = (TextView) itemView.findViewById(R.id.product_name);
            group_price_item = (TextView) itemView.findViewById(R.id.group_prices);
            group_old_price_item = (TextView) itemView.findViewById(R.id.old_price);
            group_count_item = (TextView) itemView.findViewById(R.id.count);
        } else if (viewType == MainActivity.RECYCLERVIEW_ITEM_PRODUCT) {
            product_image = (ImageView) itemView.findViewById(R.id.product_image);
            product_name = (TextView) itemView.findViewById(R.id.prduct_title);
            product_price = (TextView) itemView.findViewById(R.id.product_price);
            product_old_price = (TextView) itemView.findViewById(R.id.product_old_price);
            adds = (LinearLayout) itemView.findViewById(R.id.adds);
            product_count = (EditText) itemView.findViewById(R.id.product_count);
            cuts = (LinearLayout) itemView.findViewById(R.id.cuts);
        }else if (viewType == MainActivity.RECYCLERVIEW_ITEM_HEIGHT){
            height = (LinearLayout) itemView.findViewById(R.id.item_height);
        }else if (viewType == MainActivity.RECYCLERVIEW_ITEM_SPEAK){
            speak_ed = (EditText) itemView.findViewById(R.id.speak_ed);
        }
    }
}
