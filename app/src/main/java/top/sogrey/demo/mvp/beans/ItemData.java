package top.sogrey.demo.mvp.beans;

/**
 * 描述：
 * Created by Sogrey on 2018/11/12.
 */

public class ItemData {
    String url="";
    String deac="";

    public ItemData(String url, String deac) {
        this.url = url;
        this.deac = deac;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDeac() {
        return deac;
    }

    public void setDeac(String deac) {
        this.deac = deac;
    }
}
