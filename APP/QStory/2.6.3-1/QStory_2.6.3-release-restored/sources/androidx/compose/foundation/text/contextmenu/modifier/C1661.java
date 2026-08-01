package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.p001ui.input.pointer.AbstractC2457;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.InterfaceC2617;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2230;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1661 extends AbstractC2623 implements InterfaceC2618, InterfaceC2617 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC2230 f2681 = AbstractC2202.m3035(null, C2188.f4265);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC7383 f2682;

    public C1661(InterfaceC7383 interfaceC7383) {
        this.f2682 = interfaceC7383;
        C1655 c1655 = new C1655(this);
        C2487 c2487 = AbstractC2457.f5090;
        m3924(new C2462(null, null, c1655));
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2617
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final void mo2198(AbstractC2629 abstractC2629) {
        ((AbstractC2182) this.f2681).setValue(abstractC2629);
    }
}
