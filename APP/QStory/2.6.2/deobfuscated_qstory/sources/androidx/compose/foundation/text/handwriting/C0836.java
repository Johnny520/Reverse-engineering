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
import p052.InterfaceC6542;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0836 extends AbstractC1788 implements InterfaceC1796, InterfaceC1462, InterfaceC1473 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1627 f2370;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f2371;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC6542 f2372;

    public C0836(InterfaceC6542 interfaceC6542) {
        this.f2372 = interfaceC6542;
        C0837 c0837 = new C0837(this);
        C1652 c1652 = AbstractC1622.f4744;
        C1627 c1627 = new C1627(null, null, c0837);
        m3354(c1627);
        this.f2370 = c1627;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1214() {
        this.f2370.mo1214();
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        this.f2370.mo1281(c1652, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.focus.InterfaceC1462
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final void mo1638(InterfaceC1456 interfaceC1456) {
        this.f2371 = interfaceC1456.isFocused();
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long mo1639() {
        InterfaceC7895 interfaceC7895 = AbstractC1785.m3336(this).f5098;
        AbstractC0838.f2374.getClass();
        int i = AbstractC1763.f5178;
        return C1809.m3404(interfaceC7895.mo1333(10.0f), interfaceC7895.mo1333(40.0f), interfaceC7895.mo1333(10.0f), interfaceC7895.mo1333(40.0f));
    }
}
