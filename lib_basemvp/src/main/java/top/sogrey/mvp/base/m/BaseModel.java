package top.sogrey.mvp.base.m;

import java.util.List;

/**
 * 描述：
 * Created by Sogrey on 2018/11/15.
 */

public interface BaseModel{
    void loadData(OnDataLoadedListener l);

    interface OnDataLoadedListener<T>{
        void onComplete(List<T> datas);
    }
}
