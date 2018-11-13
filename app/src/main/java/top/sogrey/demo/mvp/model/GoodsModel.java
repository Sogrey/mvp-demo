package top.sogrey.demo.mvp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

import top.sogrey.demo.mvp.beans.ItemData;

/**
 * 描述：
 * Created by Sogrey on 2018/11/13.
 */

public class GoodsModel implements IModel {
    List<ItemData> mDatas = new ArrayList<>();
    @Override
    public void loadData(final OnDataLoadedListener l) {
                mDatas.clear();
        String[] urls = new String[]{
                "http://t00img.yangkeduo.com/goods/images/2018-09-28/206dee152efa13fae56a874c5342b7ad.jpeg",
                "https://img.alicdn.com/imgextra/i1/1985944998/O1CN011mn80E9PYNjJIoC_!!0-item_pic.jpg_430x430q90.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/2991/5/9934/99306/5bc94107E48c48d0b/a9c34bf48300f2b6.jpg",
                "https://m.360buyimg.com/babel/jfs/t8284/363/1326459580/71585/6d3e8013/59b857f2N6ca75622.jpg",
                "https://m.360buyimg.com/babel/jfs/t25840/8/2188225594/108024/4474a3d3/5bc5995eNda6e4ce5.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/4398/28/6190/281470/5ba1ee9bE38ae264d/19f155adacf55419.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/1369/25/7029/245040/5ba4ad7eEa86d80da/d6b393da124e4330.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/4528/10/3590/153299/5b997bf5E4a513949/45ab3dd6c35d981b.jpg",
                "https://m.360buyimg.com/babel/jfs/t18466/109/2664524430/303081/920d9053/5b03c9cdN6952ec76.jpg",
                "https://m.360buyimg.com/babel/jfs/t18010/146/1398225495/135604/98e3f438/5ac97f24N23cf7029.jpg",
                "https://m.360buyimg.com/babel/jfs/t26656/235/1418063339/138744/2e3e10a4/5bc830eeN7b86bddf.jpg",
                "https://m.360buyimg.com/babel/jfs/t26605/363/1067389721/87989/848c4592/5bc0649bNd95b771f.jpg",
                "https://m.360buyimg.com/babel/jfs/t13477/21/1215896547/291694/9d6ef8f3/5a1d1affN1f283217.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/7054/36/5652/75223/5bdeb96fEe675c7c3/0d11e682de5a95f0.jpg",
                "https://m.360buyimg.com/babel/jfs/t27034/221/176037470/88681/c3ce51a8/5b8896ccN159be897.jpg",
                "https://m.360buyimg.com/babel/jfs/t21703/149/1191859135/241626/d976c9df/5b2227b2N7b96f5f3.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/1101/33/3550/159308/5b99d3d3E4a5121a9/13d4fe63f48a31ea.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/3989/18/7034/558337/5ba48634Ea03d2640/8e1b0845a5a19491.png",
                "https://m.360buyimg.com/babel/jfs/t24415/18/2228898349/88176/24f43db7/5b7a336eNba529e0f.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/4612/33/6098/133435/5ba1bd7fE58c59e22/905b3fc9d36dd805.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/1958/17/3593/560610/5b99efe2Ec854eedf/602a2d83d59cab58.png",
                "https://m.360buyimg.com/babel/jfs/t20539/99/866783694/290037/e66bc59c/5b18dc34N7ff424bb.jpg",
                "https://m.360buyimg.com/babel/jfs/t10198/341/2049136605/181101/89253dbc/59ec3325N906f107e.jpg",
                "https://m.360buyimg.com/babel/jfs/t25954/134/1930444050/488286/31587d0d/5bbf1fc9N3ced3749.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/2229/36/3553/161866/5b99c427E66c1e35b/65a75b3319acb86f.jpg",
                "https://m.360buyimg.com/babel/jfs/t27859/107/350902023/338765/69ed2f3b/5bb03f57N061c4934.jpg",
                "https://m.360buyimg.com/babel/jfs/t5788/109/303405944/29483/746c05ad/591e91bbN94518d37.jpg",
                "https://m.360buyimg.com/babel/jfs/t3298/58/1622979569/120892/64989235/57d0d400Nfd249af4.jpg",
                "https://m.360buyimg.com/babel/jfs/t9880/177/333364654/245675/56d9062a/59cc88c9Ncdc29e48.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/1468/11/3377/138213/5b997bf3Eda5b24a4/0ace3ed19582dbe6.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/4317/23/3708/75223/5b99fd36E332edc38/97974d7031d56ef9.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/943/13/5977/152711/5ba0a33fE46576886/43056600372f6d2b.jpg",
                "https://m.360buyimg.com/babel/jfs/t25792/215/1911566869/331199/4e1aa140/5bbf1d23N3a4d87c5.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/1623/13/3641/145596/5b99de6bEaa996acb/947b8f968b591879.jpg",
                "https://m.360buyimg.com/babel/jfs/t19213/322/2042210884/71608/94425578/5ae09cd3N83d87dda.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/5974/9/10577/725113/5bcbf1a1E21bf3454/1d35df7e703826ce.png",
                "https://m.360buyimg.com/mobilecms/jfs/t25570/250/1718645335/440018/9ce4841e/5bba0c43Nb5a9e350.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/2617/6/6143/237736/5ba1f42aE71124526/e242e3e39ec95d66.jpg",
                "https://m.360buyimg.com/babel/jfs/t1/1302/5/6838/329465/5ba48007E8a526947/282d2735abead66a.png",
                "https://m.360buyimg.com/babel/jfs/t1/2533/19/5800/382950/5ba0b1b7Eb550a26e/934ebb6f3f60e2e6.jpg",
        };
        for (int i = 0; i < urls.length; i++) {
            mDatas.add(new ItemData(urls[i], "玩3C手机，手机卖场--" + i));
        }
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                l.onComplete(mDatas);
            }
        }, 3000);
    }
}
