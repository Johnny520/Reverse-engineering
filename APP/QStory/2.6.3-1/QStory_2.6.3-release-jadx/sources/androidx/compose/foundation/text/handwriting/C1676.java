package androidx.compose.foundation.text.handwriting;

import androidx.compose.p001ui.focus.InterfaceC2291;
import androidx.compose.p001ui.focus.InterfaceC2297;
import androidx.compose.p001ui.focus.InterfaceC2308;
import androidx.compose.p001ui.input.pointer.AbstractC2457;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2598;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2644;
import androidx.compose.p001ui.node.InterfaceC2631;
import p068.InterfaceC7372;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1676 extends AbstractC2623 implements InterfaceC2631, InterfaceC2297, InterfaceC2308 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2462 f2716;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f2717;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC7372 f2718;

    public C1676(InterfaceC7372 interfaceC7372) {
        this.f2718 = interfaceC7372;
        C1677 c1677 = new C1677(this);
        C2487 c2487 = AbstractC2457.f5090;
        C2462 c2462 = new C2462(null, null, c1677);
        m3924(c2462);
        this.f2716 = c2462;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        this.f2716.mo1784();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        this.f2716.mo1851(c2487, pointerEventPass, j);
    }

    @Override // androidx.compose.p001ui.focus.InterfaceC2297
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final void mo2208(InterfaceC2291 interfaceC2291) {
        this.f2717 = interfaceC2291.isFocused();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long mo2209() {
        InterfaceC8725 interfaceC8725 = AbstractC2620.m3906(this).f5444;
        AbstractC1678.f2720.getClass();
        int i = AbstractC2598.f5524;
        return C2644.m3974(interfaceC8725.mo1903(10.0f), interfaceC8725.mo1903(40.0f), interfaceC8725.mo1903(10.0f), interfaceC8725.mo1903(40.0f));
    }
}
