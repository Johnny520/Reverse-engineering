package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import kotlinx.coroutines.flow.internal.AbstractC5219;
import kotlinx.coroutines.flow.internal.AbstractC5220;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5266 extends AbstractC5218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f14850 = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractC5218
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4357[] mo10296(AbstractC5220 abstractC5220) {
        this.f14850.set(null);
        return AbstractC5219.f14808;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5218
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10297(AbstractC5220 abstractC5220) {
        AtomicReference atomicReference = this.f14850;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC5322.f14890);
        return true;
    }
}
