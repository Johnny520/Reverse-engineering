package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.flow.internal.AbstractC6050;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import kotlinx.coroutines.flow.internal.AbstractC6052;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6098 extends AbstractC6050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicReference f15195 = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractC6050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC5189[] mo10855(AbstractC6052 abstractC6052) {
        this.f15195.set(null);
        return AbstractC6051.f15153;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6050
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10856(AbstractC6052 abstractC6052) {
        AtomicReference atomicReference = this.f15195;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC6154.f15235);
        return true;
    }
}
