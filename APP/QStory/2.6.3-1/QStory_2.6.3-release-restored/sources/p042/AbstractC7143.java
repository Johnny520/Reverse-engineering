package p042;

import p049.AbstractC7166;
import p052.C7185;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7143 {
    private C7144 exceptionCollectionTool;
    private String itemPath;
    private boolean isLoad = false;
    private boolean hasUiPath = true;

    public final C7144 getExceptionCollectionToolInstance() {
        C7144 c7144 = this.exceptionCollectionTool;
        if (c7144 != null) {
            return c7144;
        }
        C7144 c71442 = new C7144(this);
        this.exceptionCollectionTool = c71442;
        return c71442;
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
        return this instanceof C7185;
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
            loadHook(AbstractC7166.f17805);
        } catch (Throwable th) {
            getExceptionCollectionToolInstance().m12391(th);
        }
    }

    public String toString() {
        return "BaseHookItem{itemPath='" + this.itemPath + '\'' + ", hasUiPath=" + this.hasUiPath + ", isLoad=" + this.isLoad + ", exceptionCollectionTool=" + this.exceptionCollectionTool + '}';
    }
}
