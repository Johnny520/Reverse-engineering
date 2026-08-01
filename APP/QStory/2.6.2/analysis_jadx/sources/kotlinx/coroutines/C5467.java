package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5467 extends AbstractC5449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15127 = AtomicIntegerFieldUpdater.newUpdater(C5467.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6557 f15128;

    public C5467(InterfaceC6557 interfaceC6557) {
        this.f15128 = interfaceC6557;
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10464(Throwable th) {
        if (f15127.compareAndSet(this, 0, 1)) {
            this.f15128.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10465() {
        return true;
    }
}
