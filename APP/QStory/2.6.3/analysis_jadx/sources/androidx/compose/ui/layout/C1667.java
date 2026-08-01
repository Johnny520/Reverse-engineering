package androidx.compose.ui.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.InterfaceC1773;
import p052.InterfaceC6551;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1667 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC6551 f4891;

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f4891 + ')';
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        return (InterfaceC1657) this.f4891.invoke(interfaceC1653, interfaceC1655, new C7898(j));
    }
}
