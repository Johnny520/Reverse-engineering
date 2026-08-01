package androidx.compose.p001ui.node;

import androidx.compose.p001ui.AbstractC2961;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2625 implements InterfaceC2639 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC7387 f5574 = new InterfaceC7387() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public final void invoke(C2625 c2625) {
            if (c2625.mo3815()) {
                c2625.f5575.mo1687();
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C2625) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2626 f5575;

    public C2625(InterfaceC2626 interfaceC2626) {
        this.f5575 = interfaceC2626;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2639
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3815() {
        return ((AbstractC2961) this.f5575).f6637.f6624;
    }
}
