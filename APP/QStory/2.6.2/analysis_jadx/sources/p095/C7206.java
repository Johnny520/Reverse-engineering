package p095;

import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5387;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7206 extends AbstractC5387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7206 f19228;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ExecutorC7208 f19229;

    static {
        int i = AbstractC7216.f19267;
        int i2 = AbstractC7216.f19266;
        long j = AbstractC7216.f19265;
        String str = AbstractC7216.f19269;
        C7206 c7206 = new C7206();
        c7206.f19229 = new ExecutorC7208(i, i2, j, str);
        f19228 = c7206;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC5431
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        ExecutorC7208.m12414(this.f19229, runnable, 6);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10340(InterfaceC4359 interfaceC4359, Runnable runnable) {
        ExecutorC7208.m12414(this.f19229, runnable, 2);
    }
}
