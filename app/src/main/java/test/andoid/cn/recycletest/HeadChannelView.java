package test.andoid.cn.recycletest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

import test.andoid.cn.recycletest.model.ChannelEntity;
import test.andoid.cn.recycletest.weidget.CustomExpandableListView;

public class HeadChannelView extends HeaderViewInterface<List<ChannelEntity>> {

    public HeadChannelView(Activity mContext) {
        super(mContext);
    }
    private CustomExpandableListView expandableListView;

    @Override
    protected void getView(List<ChannelEntity> channelEntities, ListView listView) {
        View view = mInflate.inflate(R.layout.activity_head_channel_view,listView,false);
        expandableListView = (CustomExpandableListView) view.findViewById(R.id.expandView);
        dealWithTheView(channelEntities);
        listView.addHeaderView(view);
    }

    private void dealWithTheView(List<ChannelEntity> channelEntities) {
        int size = channelEntities.size();
        expandableListView.expandGroup(size);

        HeaderChannelAdapter adapter = new HeaderChannelAdapter(mContext,channelEntities);
        expandableListView.setAdapter(adapter);
    }

}
