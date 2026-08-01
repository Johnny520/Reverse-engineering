package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractC5191;
import kotlin.coroutines.InterfaceC5189;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6291 extends AbstractC5191 implements InterfaceC6284 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C6291 f15453 = new C6291(C6285.f15450);

    @Override // kotlinx.coroutines.InterfaceC6284
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo11117() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final InterfaceC6230 mo11118(InterfaceC7387 interfaceC7387) {
        return C6287.f15451;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final InterfaceC6268 mo11119(C6292 c6292) {
        return C6287.f15451;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC6230 mo11120(boolean z, boolean z2, InterfaceC7387 interfaceC7387) {
        return C6287.f15451;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo11121() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final CancellationException mo11122() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo11123(InterfaceC5189 interfaceC5189) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC6284, kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo10815(CancellationException cancellationException) {
    }
}
