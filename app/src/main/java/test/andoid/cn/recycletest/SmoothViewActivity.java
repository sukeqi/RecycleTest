package test.andoid.cn.recycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import test.andoid.cn.recycletest.SmoothListView.SmoothListView;

public class SmoothViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smooth_view);
        SmoothListView smoothListView = (SmoothListView) findViewById(R.id.smoothView);


    }
}
