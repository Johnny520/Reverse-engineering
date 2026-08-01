package p095;

import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5388;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7207 extends AbstractC5388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7207 f19223;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ExecutorC7209 f19224;

    static {
        int i = AbstractC7217.f19262;
        int i2 = AbstractC7217.f19261;
        long j = AbstractC7217.f19260;
        String str = AbstractC7217.f19264;
        C7207 c7207 = new C7207();
        c7207.f19224 = new ExecutorC7209(i, i2, j, str);
        f19223 = c7207;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.AbstractC5432
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        ExecutorC7209.m12441(this.f19224, runnable, 6);
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10344(InterfaceC4360 interfaceC4360, Runnable runnable) {
        ExecutorC7209.m12441(this.f19224, runnable, 2);
    }
}
