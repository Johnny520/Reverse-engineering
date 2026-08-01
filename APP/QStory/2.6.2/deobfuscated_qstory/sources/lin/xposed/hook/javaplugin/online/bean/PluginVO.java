package lin.xposed.hook.javaplugin.online.bean;

import com.alibaba.fastjson2.InterfaceC2915;
import java.io.Serializable;
import java.util.Date;
import lin.xposed.hook.javaplugin.bean.PluginInfo;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        return InterfaceC2915.m6317(this);
    }
}
