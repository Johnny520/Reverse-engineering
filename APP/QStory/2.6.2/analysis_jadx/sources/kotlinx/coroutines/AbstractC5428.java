package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5428 extends C5459 implements InterfaceC4356, InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4359 f15073;

    public AbstractC5428(InterfaceC4359 interfaceC4359, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m10577((InterfaceC5451) interfaceC4359.get(C5452.f15105));
        }
        this.f15073 = interfaceC4359.plus(this);
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f15073;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(obj);
        if (thM8758exceptionOrNullimpl != null) {
            obj = new C5429(thM8758exceptionOrNullimpl, false);
        }
        Object objM10586 = m10586(obj);
        if (objM10586 == AbstractC5398.f15034) {
            return;
        }
        mo10380(objM10586);
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final String mo10519() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f15073;
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void mo10520(CompletionHandlerException completionHandlerException) {
        AbstractC5398.m10492(this.f15073, completionHandlerException);
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo10521(Object obj) {
        if (!(obj instanceof C5429)) {
            mo10271(obj);
        } else {
            C5429 c5429 = (C5429) obj;
            mo10272(c5429.f15075, C5429.f15074.get(c5429) == 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public void mo10271(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public void mo10272(Throwable th, boolean z) {
    }
}
