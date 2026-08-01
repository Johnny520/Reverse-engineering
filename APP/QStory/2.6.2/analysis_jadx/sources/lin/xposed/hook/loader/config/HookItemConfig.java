package lin.xposed.hook.loader.config;

import com.bumptech.glide.AbstractC3056;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        return AbstractC3056.m6668(-3937637308527019431L) + this.itemPath + '\'' + AbstractC3056.m6668(-3937637282757215655L) + this.enabled + AbstractC3056.m6668(-3937637158203164071L) + this.bypassDefaultLoad + '}';
    }

    public HookItemConfig() {
        Boolean bool = Boolean.FALSE;
        this.enabled = bool;
        this.bypassDefaultLoad = bool;
    }
}
