package top.sogrey.demo.mvp.model;

import java.util.List;

import top.sogrey.demo.mvp.beans.ItemData;

/**
 * 描述：加载数据
 * Created by Sogrey on 2018/11/13.
 */

public interface IModel {
    void loadData(OnDataLoadedListener l);

    interface OnDataLoadedListener{
        void onComplete(List<ItemData> datas);
    }
}
