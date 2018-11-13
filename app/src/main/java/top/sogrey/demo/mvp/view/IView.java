package top.sogrey.demo.mvp.view;

import java.util.List;

import top.sogrey.demo.mvp.beans.ItemData;

/**
 * 描述：view 定义出所有的UI逻辑
 * Created by Sogrey on 2018/11/13.
 */

public interface IView extends BaseView{
    void showDatas(List<ItemData> goodsList);
}
