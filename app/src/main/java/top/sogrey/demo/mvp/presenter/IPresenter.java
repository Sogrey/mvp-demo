package top.sogrey.demo.mvp.presenter;

import java.lang.ref.WeakReference;
import java.util.List;

import top.sogrey.demo.mvp.beans.ItemData;
import top.sogrey.demo.mvp.model.GoodsModel;
import top.sogrey.demo.mvp.model.IModel;
import top.sogrey.demo.mvp.view.IView;

/**
 * 描述：表示层
 * Created by Sogrey on 2018/11/13.
 */

public class IPresenter extends BasePeresenter {
    //Model层应用
    IModel iModel = new GoodsModel();

    public IPresenter() {
    }

    @Override
    public void fetch() {
        if (mViewRef.get() != null) ((IView) (mViewRef.get())).showLoading();
        if (iModel != null) {
            iModel.loadData(new IModel.OnDataLoadedListener() {
                @Override
                public void onComplete(List<ItemData> datas) {
                    if (mViewRef.get() != null) {
                        ((IView) (mViewRef.get())).showDatas(datas);
                        ((IView) (mViewRef.get())).hideLoading();
                    }
                }
            });
        }
    }
}
