package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.InterfaceC2608;
import p068.InterfaceC7380;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2502 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7380 f5236;

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f5236 + ')';
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        return (InterfaceC2492) this.f5236.invoke(interfaceC2488, interfaceC2490, new C8727(j));
    }
}
