package test.andoid.cn.recycletest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private LinearLayoutManager manager;

    public static final int RECYCLEVIEW_ITEM_TITLE = 0;
    //头布局
    public static final int RECYCLERVIEW_ITEM_HEADER = 1;
    //组合购之下的商品
    public static final int RECYCLERVIEW_ITEM_FOOT = 2;
    //普通商品
    public static final int RECYCLERVIEW_ITEM_PRODUCT = 3;
    //间距
    public static final int RECYCLERVIEW_ITEM_HEIGHT = 4;
    //商家留言
    public static final int RECYCLERVIEW_ITEM_SPEAK = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        manager = new LinearLayoutManager(this);
        manager.setOrientation(OrientationHelper.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter = new MyAdapter(MainActivity.this, 10);
        recyclerView.setAdapter(adapter);

    }
}
