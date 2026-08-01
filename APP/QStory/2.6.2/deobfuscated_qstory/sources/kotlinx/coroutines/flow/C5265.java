package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.flow.internal.AbstractC5217;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import kotlinx.coroutines.flow.internal.AbstractC5219;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5265 extends AbstractC5217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f14850 = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4356[] mo10292(AbstractC5219 abstractC5219) {
        this.f14850.set(null);
        return AbstractC5218.f14808;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10293(AbstractC5219 abstractC5219) {
        AtomicReference atomicReference = this.f14850;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC5321.f14890);
        return true;
    }
}
