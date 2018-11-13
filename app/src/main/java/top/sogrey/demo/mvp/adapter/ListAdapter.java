package top.sogrey.demo.mvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import top.sogrey.demo.mvp.R;
import top.sogrey.demo.mvp.beans.ItemData;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * 描述：
 * Created by Sogrey on 2018/11/12.
 */

public class ListAdapter extends BaseAdapter {
    List<ItemData> mDatas;
    Context mContext;

    public ListAdapter(Context context, List<ItemData> datas) {
        mContext = context;
        mDatas = datas;
    }

    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public ItemData getItem(int i) {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mDatas.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHodler hodler = null;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) viewGroup.getContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list, null);
            hodler = new ViewHodler();
            hodler.imgIconItem = view.findViewById(R.id.item_img);
            hodler.txtDescItem = view.findViewById(R.id.item_deac);
            view.setTag(hodler);
        } else {
            hodler = (ViewHodler) view.getTag();
        }

        Picasso.with(viewGroup.getContext()).load(getItem(i).getUrl()).into(hodler.imgIconItem);
        hodler.txtDescItem.setText(getItem(i).getDeac());
        return view;
    }

    class ViewHodler {
        ImageView imgIconItem;
        TextView txtDescItem;
    }

}
