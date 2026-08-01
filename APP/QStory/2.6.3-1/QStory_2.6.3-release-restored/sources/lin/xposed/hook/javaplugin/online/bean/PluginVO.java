package lin.xposed.hook.javaplugin.online.bean;

import com.alibaba.fastjson2.InterfaceC3749;
import java.io.Serializable;
import java.util.Date;
import lin.xposed.hook.javaplugin.bean.PluginInfo;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginVO implements Serializable {
    private String app;
    private long cloudId;
    private Date createTime;
    private int downloadCount;
    private PluginInfo pluginInfo;
    private int type;

    public String getApp() {
        return this.app;
    }

    public long getCloudId() {
        return this.cloudId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public int getDownloadCount() {
        return this.downloadCount;
    }

    public PluginInfo getPluginInfo() {
        return this.pluginInfo;
    }

    public int getType() {
        return this.type;
    }

    public void setApp(String str) {
        this.app = str;
    }

    public void setCloudId(long j) {
        this.cloudId = j;
    }

    public void setCreateTime(Date date) {
        this.createTime = date;
    }

    public void setDownloadCount(int i) {
        this.downloadCount = i;
    }

    public void setPluginInfo(PluginInfo pluginInfo) {
        this.pluginInfo = pluginInfo;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return InterfaceC3749.m6935(this);
    }
}
