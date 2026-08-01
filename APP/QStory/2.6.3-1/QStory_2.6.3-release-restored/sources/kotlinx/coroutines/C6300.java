package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6300 extends AbstractC6282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15472 = AtomicIntegerFieldUpdater.newUpdater(C6300.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC7387 f15473;

    public C6300(InterfaceC7387 interfaceC7387) {
        this.f15473 = interfaceC7387;
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11027(Throwable th) {
        if (f15472.compareAndSet(this, 0, 1)) {
            this.f15473.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo11028() {
        return true;
    }
}
