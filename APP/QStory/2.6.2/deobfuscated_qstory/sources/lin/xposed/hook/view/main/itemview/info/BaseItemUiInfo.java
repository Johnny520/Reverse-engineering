package lin.xposed.hook.view.main.itemview.info;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseItemUiInfo {
    protected String[] paths;

    public BaseItemUiInfo(String[] strArr) {
        this.paths = strArr;
    }

    public String getItemName() {
        return this.paths[r1.length - 1];
    }

    public final int getType() {
        int length = this.paths.length;
        if (length == 4 || length == 3) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        return length == 1 ? -1 : -2;
    }
}
