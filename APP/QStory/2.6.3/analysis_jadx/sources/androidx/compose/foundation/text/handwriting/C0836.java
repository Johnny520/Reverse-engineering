package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.focus.InterfaceC1456;
import androidx.compose.ui.focus.InterfaceC1462;
import androidx.compose.ui.focus.InterfaceC1473;
import androidx.compose.ui.input.pointer.AbstractC1622;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC1763;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.C1809;
import androidx.compose.ui.node.InterfaceC1796;
import p052.InterfaceC6543;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0836 extends AbstractC1788 implements InterfaceC1796, InterfaceC1462, InterfaceC1473 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1627 f2371;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f2372;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC6543 f2373;

    public C0836(InterfaceC6543 interfaceC6543) {
        this.f2373 = interfaceC6543;
        C0837 c0837 = new C0837(this);
        C1652 c1652 = AbstractC1622.f4745;
        C1627 c1627 = new C1627(null, null, c0837);
        m3364(c1627);
        this.f2371 = c1627;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1224() {
        this.f2371.mo1224();
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        this.f2371.mo1291(c1652, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.focus.InterfaceC1462
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final void mo1648(InterfaceC1456 interfaceC1456) {
        this.f2372 = interfaceC1456.isFocused();
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long mo1649() {
        InterfaceC7896 interfaceC7896 = AbstractC1785.m3346(this).f5099;
        AbstractC0838.f2375.getClass();
        int i = AbstractC1763.f5179;
        return C1809.m3414(interfaceC7896.mo1343(10.0f), interfaceC7896.mo1343(40.0f), interfaceC7896.mo1343(10.0f), interfaceC7896.mo1343(40.0f));
    }
}
