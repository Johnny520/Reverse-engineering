package androidx.compose.ui.node;

import androidx.compose.ui.AbstractC2128;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1790 implements InterfaceC1804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC6557 f5228 = new InterfaceC6557() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public final void invoke(C1790 c1790) {
            if (c1790.mo3245()) {
                c1790.f5229.mo1126();
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1790) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1791 f5229;

    public C1790(InterfaceC1791 interfaceC1791) {
        this.f5229 = interfaceC1791;
    }

    @Override // androidx.compose.ui.node.InterfaceC1804
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3245() {
        return ((AbstractC2128) this.f5229).f6291.f6278;
    }
}
