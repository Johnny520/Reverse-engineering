package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5468 extends AbstractC5450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15127 = AtomicIntegerFieldUpdater.newUpdater(C5468.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6558 f15128;

    public C5468(InterfaceC6558 interfaceC6558) {
        this.f15128 = interfaceC6558;
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10468(Throwable th) {
        if (f15127.compareAndSet(this, 0, 1)) {
            this.f15128.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10469() {
        return true;
    }
}
