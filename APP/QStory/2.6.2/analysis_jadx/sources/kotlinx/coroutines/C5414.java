package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.C4355;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.C5359;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5414 extends C5359 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ThreadLocal f15056;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5414(InterfaceC4356 interfaceC4356, InterfaceC4359 interfaceC4359) {
        C5410 c5410 = C5410.f15051;
        super(interfaceC4356, interfaceC4359.get(c5410) == null ? interfaceC4359.plus(c5410) : interfaceC4359);
        this.f15056 = new ThreadLocal();
        if (interfaceC4356.getContext().get(C4355.f12932) instanceof AbstractC5431) {
            return;
        }
        Object objM10364 = AbstractC5352.m10364(interfaceC4359, null);
        AbstractC5352.m10367(interfaceC4359, objM10364);
        m10512(interfaceC4359, objM10364);
    }

    @Override // kotlinx.coroutines.internal.C5359, kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo10380(Object obj) {
        m10511();
        Object objM10471 = AbstractC5398.m10471(obj);
        InterfaceC4356 interfaceC4356 = this.f14942;
        InterfaceC4359 context = interfaceC4356.getContext();
        Object objM10364 = AbstractC5352.m10364(context, null);
        C5414 c5414M10467 = objM10364 != AbstractC5352.f14928 ? AbstractC5398.m10467(interfaceC4356, context, objM10364) : null;
        try {
            interfaceC4356.resumeWith(objM10471);
            if (c5414M10467 == null || c5414M10467.m10513()) {
                AbstractC5352.m10367(context, objM10364);
            }
        } catch (Throwable th) {
            if (c5414M10467 == null || c5414M10467.m10513()) {
                AbstractC5352.m10367(context, objM10364);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void m10511() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f15056.get();
            if (pair != null) {
                AbstractC5352.m10367((InterfaceC4359) pair.component1(), pair.component2());
            }
            this.f15056.remove();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void m10512(InterfaceC4359 interfaceC4359, Object obj) {
        this.threadLocalIsSet = true;
        this.f15056.set(new Pair(interfaceC4359, obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final boolean m10513() {
        boolean z = this.threadLocalIsSet && this.f15056.get() == null;
        this.f15056.remove();
        return !z;
    }

    @Override // kotlinx.coroutines.internal.C5359
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo10381() {
        m10511();
    }
}
