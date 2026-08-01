package androidx.compose.ui.node;

import androidx.compose.ui.AbstractC2128;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1790 implements InterfaceC1804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC6558 f5229 = new InterfaceC6558() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public final void invoke(C1790 c1790) {
            if (c1790.mo3255()) {
                c1790.f5230.mo1127();
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C1790) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1791 f5230;

    public C1790(InterfaceC1791 interfaceC1791) {
        this.f5230 = interfaceC1791;
    }

    @Override // androidx.compose.ui.node.InterfaceC1804
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3255() {
        return ((AbstractC2128) this.f5230).f6292.f6279;
    }
}
