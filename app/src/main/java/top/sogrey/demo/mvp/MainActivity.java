package top.sogrey.demo.mvp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import top.sogrey.demo.mvp.adapter.ListAdapter;
import top.sogrey.demo.mvp.beans.ItemData;
import top.sogrey.demo.mvp.presenter.IPresenter;
import top.sogrey.demo.mvp.view.IView;
import top.sogrey.mvp.base.BaseActivity;
import top.sogrey.mvp.base.p.BasePeresenter;

public class MainActivity extends BaseActivity<IView, BasePeresenter<IView>> implements IView {
    ListView mListView;
    private ListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.lst_ListView);
    }

    @Override
    protected BasePeresenter<IView> bindingPresenter() {
        return new IPresenter();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "loading...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "loadinged", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDatas(List<ItemData> goodsList) {
        mAdapter = new ListAdapter(this, goodsList);
        mListView.setAdapter(mAdapter);
    }
}
