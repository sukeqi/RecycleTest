package test.andoid.cn.recycletest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import test.andoid.cn.recycletest.model.ChannelEntity;

/**
 * Created by jyd-pc006 on 16/7/19.
 */
public class HeaderChannelAdapter extends BaseListAdapter<ChannelEntity> {
    public HeaderChannelAdapter(Context context, List<ChannelEntity> list) {
        super(context, list);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_channel, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
            TextView textView_title = (TextView) view.findViewById(R.id.tv_title);
            TextView textView_tips = (TextView) view.findViewById(R.id.tv_tips);
        }
        return null;
    }


}
