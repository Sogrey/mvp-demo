package top.sogrey.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import top.sogrey.mvp.base.p.BasePeresenter;
import top.sogrey.mvp.base.v.BaseView;

/**
 * 描述：
 * Created by Sogrey on 2018/11/13.
 */

public abstract class BaseActivity<V extends BaseView,T extends BasePeresenter<V>> extends Activity {
    private T iPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iPresenter = bindingPresenter();
        iPresenter.attachView((V) this);
        iPresenter.fetch();
    }

    protected abstract T bindingPresenter();

    @Override
    protected void onDestroy() {
        iPresenter.detachView();
        super.onDestroy();
    }
}
