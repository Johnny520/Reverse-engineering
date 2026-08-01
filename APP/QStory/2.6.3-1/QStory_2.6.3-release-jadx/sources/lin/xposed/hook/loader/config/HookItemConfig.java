package lin.xposed.hook.loader.config;

import java.io.Serializable;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class HookItemConfig implements Serializable {
    private Boolean bypassDefaultLoad;
    private Boolean enabled;
    private String itemPath;

    public HookItemConfig(String str) {
        Boolean bool = Boolean.FALSE;
        this.enabled = bool;
        this.bypassDefaultLoad = bool;
        this.itemPath = str;
    }

    public Boolean getBypassDefaultLoad() {
        return this.bypassDefaultLoad;
    }

    public String getItemPath() {
        return this.itemPath;
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public void setBypassDefaultLoad(Boolean bool) {
        this.bypassDefaultLoad = bool;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public void setItemPath(String str) {
        this.itemPath = str;
    }

    public String toString() {
        return AbstractC9234.m14531(782) + this.itemPath + '\'' + AbstractC9234.m14531(783) + this.enabled + AbstractC9234.m14531(784) + this.bypassDefaultLoad + '}';
    }

    public HookItemConfig() {
        Boolean bool = Boolean.FALSE;
        this.enabled = bool;
        this.bypassDefaultLoad = bool;
    }
}
