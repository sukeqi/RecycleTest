package test.andoid.cn.recycletest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ExpandViewActivity extends Activity {
    private ExpandableListView expandableListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand_view);
        expandableListView = (ExpandableListView) findViewById(R.id.expanded_menu);

        final ExpandableListAdapter adapter = new BaseExpandableListAdapter() {
            int[] logos = new int[]{R.mipmap.my,R.mipmap.my,R.mipmap.my};
            private String[] category = new String[]{"僵尸","魔法植物","远程植物"};
            private String[][] subcategory = new String[][]{
                    {"旗帜僵尸","铠甲僵尸","书生见识","铁桶僵尸","尸娃僵尸","舞蹈僵尸"},
                    {"黄金蘑菇","贪睡蘑菇","大头蘑菇","诱惑植物","多嘴蘑菇","七采蘑菇"},
                    {"满天星","风车植物","带刺植物","贪睡植物","双子植物","胆怯蘑菇"}
            };
            public int[][] sublogos = new int[][]{
                    {R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my},
                    {R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my},
                    {R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my,R.mipmap.my}
            };
            TextView getTextView(){
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,64);
                TextView textView = new TextView(ExpandViewActivity.this);
                textView.setLayoutParams(layoutParams);
                textView.setGravity(Gravity.CENTER_VERTICAL);
                textView.setPadding(36,0,0,0);
                textView.setTextColor(Color.BLACK);
                return textView;
            }

            @Override
            public int getGroupCount() {
                return category.length;
            }

            @Override
            public int getChildrenCount(int i) {
                return subcategory[i].length;
            }

            @Override
            public Object getGroup(int i) {
                return category[i];
            }

            @Override
            public Object getChild(int i, int i1) {
                return subcategory[i][i1];
            }

            @Override
            public long getGroupId(int i) {
                return i;
            }

            @Override
            public long getChildId(int i, int i1) {
                return i1;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }

            @Override
            public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
                LinearLayout layout = new LinearLayout(ExpandViewActivity.this);
                layout.setOrientation(LinearLayout.HORIZONTAL);
                ImageView logo = new ImageView(ExpandViewActivity.this);
                logo.setPadding(50,0,0,0);
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(96,46);
                logo.setLayoutParams(layoutParams);
                logo.setImageResource(logos[i]);
                layout.addView(logo);
                TextView textView = getTextView();
                textView.setTextSize(20);
                textView.setText(category[i]);
                layout.addView(textView);
                return layout;
            }

            @Override
            public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
                //定义一个LinearLayout用于存放ImageView、TextView
                LinearLayout ll=new LinearLayout(ExpandViewActivity.this);
                //设置子控件的显示方式为水平
                ll.setOrientation(LinearLayout.HORIZONTAL);
                //定义一个ImageView用于显示列表图片
                ImageView logo=new ImageView(ExpandViewActivity.this);
                logo.setPadding(0, 0, 0, 0);
                //设置logo的大小
                LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(40, 40);
                logo.setLayoutParams(lp);
                logo.setImageResource(sublogos[i][i1]);
                ll.addView(logo);
                TextView textView=getTextView();
                textView.setText(subcategory[i][i1]);
                ll.addView(textView);
                return ll;
            }

            @Override
            public boolean isChildSelectable(int i, int i1) {
                return true;
            }
        };
        expandableListView.setAdapter(adapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {

                return true;
            }
        });
    }

}
