package top.sogrey.demo.mvp.presenter;

import java.lang.ref.WeakReference;

import top.sogrey.demo.mvp.view.BaseView;

/**
 * 描述：
 * Created by Sogrey on 2018/11/13.
 */

public abstract class BasePeresenter<T extends BaseView>  {
    //View层应用
    protected WeakReference<T> mViewRef;

    //绑定
    public void attachView(T view) {
        mViewRef = new WeakReference<>(view);
    }

    //解绑
    public void detachView() {
        mViewRef.clear();
    }

    public abstract void fetch();
}
