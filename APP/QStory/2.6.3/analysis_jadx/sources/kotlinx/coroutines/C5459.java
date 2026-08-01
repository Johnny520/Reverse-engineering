package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractC4359;
import kotlin.coroutines.InterfaceC4357;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5459 extends AbstractC4359 implements InterfaceC5452 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5459 f15108 = new C5459(C5453.f15105);

    @Override // kotlinx.coroutines.InterfaceC5452
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo10558() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final InterfaceC5398 mo10559(InterfaceC6558 interfaceC6558) {
        return C5455.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final InterfaceC5436 mo10560(C5460 c5460) {
        return C5455.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC5398 mo10561(boolean z, boolean z2, InterfaceC6558 interfaceC6558) {
        return C5455.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo10562() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final CancellationException mo10563() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo10564(InterfaceC4357 interfaceC4357) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC5452, kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10256(CancellationException cancellationException) {
    }
}
