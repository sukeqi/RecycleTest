package test.andoid.cn.recycletest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.List;

/**
 * Created by jyd-pc006 on 16/7/19.
 */
public abstract class HeaderViewInterface<T> {
    protected Activity mContext;
    protected LayoutInflater mInflate;
    protected T mEntity;

    public HeaderViewInterface(Activity mContext) {
        this.mContext = mContext;
        mInflate = LayoutInflater.from(mContext);
    }
    public boolean fillView(T t, ListView listView){
        if (t==null){
            return false;
        }
        if ((t instanceof List)&&((List)t).size()==0){
            return false;
        }
        this.mEntity = t;
        getView(t,listView);
        return true;
    }

    protected abstract void getView(T t, ListView listView);

}
