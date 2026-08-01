package p111;

import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.internal.AbstractC6185;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8043 extends AbstractC6264 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8043 f19596 = new C8043();

    @Override // kotlinx.coroutines.AbstractC6264
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final AbstractC6264 mo11086(int i) {
        AbstractC6185.m10926(i);
        return i >= AbstractC8046.f19606 ? this : super.mo11086(i);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        C8036.f19568.f19569.m13001(runnable, true, false);
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10903(InterfaceC5192 interfaceC5192, Runnable runnable) {
        C8036.f19568.f19569.m13001(runnable, true, true);
    }
}
