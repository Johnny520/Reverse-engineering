package p026;

import com.bumptech.glide.AbstractC3056;
import p032.AbstractC6318;
import p035.C6338;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6296 {
    private C6297 exceptionCollectionTool;
    private String itemPath;
    private boolean isLoad = false;
    private boolean hasUiPath = true;

    public final C6297 getExceptionCollectionToolInstance() {
        C6297 c6297 = this.exceptionCollectionTool;
        if (c6297 != null) {
            return c6297;
        }
        C6297 c62972 = new C6297(this);
        this.exceptionCollectionTool = c62972;
        return c62972;
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
        return this instanceof C6338;
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
            loadHook(AbstractC6318.f17411);
        } catch (Throwable th) {
            getExceptionCollectionToolInstance().m11804(th);
        }
    }

    public String toString() {
        return AbstractC3056.m6668(-3937637935592244647L) + this.itemPath + '\'' + AbstractC3056.m6668(-3937637901232506279L) + this.hasUiPath + AbstractC3056.m6668(-3937637819628127655L) + this.isLoad + AbstractC3056.m6668(-3937637725138847143L) + this.exceptionCollectionTool + '}';
    }
}
