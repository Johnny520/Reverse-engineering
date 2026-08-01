package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.C4356;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.C5360;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5415 extends C5360 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ThreadLocal f15056;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5415(InterfaceC4357 interfaceC4357, InterfaceC4360 interfaceC4360) {
        C5411 c5411 = C5411.f15051;
        super(interfaceC4357, interfaceC4360.get(c5411) == null ? interfaceC4360.plus(c5411) : interfaceC4360);
        this.f15056 = new ThreadLocal();
        if (interfaceC4357.getContext().get(C4356.f12936) instanceof AbstractC5432) {
            return;
        }
        Object objM10368 = AbstractC5353.m10368(interfaceC4360, null);
        AbstractC5353.m10371(interfaceC4360, objM10368);
        m10516(interfaceC4360, objM10368);
    }

    @Override // kotlinx.coroutines.internal.C5360, kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo10384(Object obj) {
        m10515();
        Object objM10475 = AbstractC5399.m10475(obj);
        InterfaceC4357 interfaceC4357 = this.f14942;
        InterfaceC4360 context = interfaceC4357.getContext();
        Object objM10368 = AbstractC5353.m10368(context, null);
        C5415 c5415M10471 = objM10368 != AbstractC5353.f14928 ? AbstractC5399.m10471(interfaceC4357, context, objM10368) : null;
        try {
            interfaceC4357.resumeWith(objM10475);
            if (c5415M10471 == null || c5415M10471.m10517()) {
                AbstractC5353.m10371(context, objM10368);
            }
        } catch (Throwable th) {
            if (c5415M10471 == null || c5415M10471.m10517()) {
                AbstractC5353.m10371(context, objM10368);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void m10515() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f15056.get();
            if (pair != null) {
                AbstractC5353.m10371((InterfaceC4360) pair.component1(), pair.component2());
            }
            this.f15056.remove();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void m10516(InterfaceC4360 interfaceC4360, Object obj) {
        this.threadLocalIsSet = true;
        this.f15056.set(new Pair(interfaceC4360, obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final boolean m10517() {
        boolean z = this.threadLocalIsSet && this.f15056.get() == null;
        this.f15056.remove();
        return !z;
    }

    @Override // kotlinx.coroutines.internal.C5360
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo10385() {
        m10515();
    }
}
