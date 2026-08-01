package p026;

import p033.AbstractC6337;
import p036.C6356;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6314 {
    private C6315 exceptionCollectionTool;
    private String itemPath;
    private boolean isLoad = false;
    private boolean hasUiPath = true;

    public final C6315 getExceptionCollectionToolInstance() {
        C6315 c6315 = this.exceptionCollectionTool;
        if (c6315 != null) {
            return c6315;
        }
        C6315 c63152 = new C6315(this);
        this.exceptionCollectionTool = c63152;
        return c63152;
    }

    public final String getItemPath() {
        return this.itemPath;
    }

    public boolean hasPath() {
        return this.hasUiPath;
    }

    public int hashCode() {
        return getItemPath().hashCode();
    }

    public final void initPath(String str) {
        this.itemPath = str;
    }

    public boolean isLoadedByDefault() {
        return this instanceof C6356;
    }

    public abstract void loadHook(ClassLoader classLoader);

    public void setHasUiPath(boolean z) {
        this.hasUiPath = z;
    }

    public void startLoadHook() {
        if (this.isLoad) {
            return;
        }
        try {
            this.isLoad = true;
            loadHook(AbstractC6337.f17460);
        } catch (Throwable th) {
            getExceptionCollectionToolInstance().m11832(th);
        }
    }

    public String toString() {
        return AbstractC8405.m13972(774) + this.itemPath + '\'' + AbstractC8405.m13972(775) + this.hasUiPath + AbstractC8405.m13972(776) + this.isLoad + AbstractC8405.m13972(777) + this.exceptionCollectionTool + '}';
    }
}
