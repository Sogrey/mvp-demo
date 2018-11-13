package top.sogrey.demo.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import top.sogrey.demo.mvp.presenter.BasePeresenter;
import top.sogrey.demo.mvp.view.BaseView;

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
