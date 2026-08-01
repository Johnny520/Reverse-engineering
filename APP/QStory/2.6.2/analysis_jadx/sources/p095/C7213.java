package p095;

import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.internal.AbstractC5352;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7213 extends AbstractC5431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7213 f19256 = new C7213();

    @Override // kotlinx.coroutines.AbstractC5431
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC5431 mo10523(int i) {
        AbstractC5352.m10363(i);
        return i >= AbstractC7216.f19266 ? this : super.mo10523(i);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        C7206.f19228.f19229.m12415(runnable, true, false);
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10340(InterfaceC4359 interfaceC4359, Runnable runnable) {
        C7206.f19228.f19229.m12415(runnable, true, true);
    }
}
