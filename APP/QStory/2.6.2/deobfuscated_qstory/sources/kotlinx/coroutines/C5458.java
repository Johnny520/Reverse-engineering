package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractC4358;
import kotlin.coroutines.InterfaceC4356;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5458 extends AbstractC4358 implements InterfaceC5451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5458 f15108 = new C5458(C5452.f15105);

    @Override // kotlinx.coroutines.InterfaceC5451
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final InterfaceC5397 mo10554(InterfaceC6557 interfaceC6557) {
        return C5454.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final InterfaceC5435 mo10555(C5459 c5459) {
        return C5454.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC5397 mo10556(boolean z, boolean z2, InterfaceC6557 interfaceC6557) {
        return C5454.f15106;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo10557() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final Object mo10558(InterfaceC4356 interfaceC4356) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final CancellationException mo10559() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo10560() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC5451, kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10252(CancellationException cancellationException) {
    }
}
