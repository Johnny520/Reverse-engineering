package p111;

import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6220;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8036 extends AbstractC6220 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8036 f19568;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ExecutorC8038 f19569;

    static {
        int i = AbstractC8046.f19607;
        int i2 = AbstractC8046.f19606;
        long j = AbstractC8046.f19605;
        String str = AbstractC8046.f19609;
        C8036 c8036 = new C8036();
        c8036.f19569 = new ExecutorC8038(i, i2, j, str);
        f19568 = c8036;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC6264
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        ExecutorC8038.m13000(this.f19569, runnable, 6);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10903(InterfaceC5192 interfaceC5192, Runnable runnable) {
        ExecutorC8038.m13000(this.f19569, runnable, 2);
    }
}
