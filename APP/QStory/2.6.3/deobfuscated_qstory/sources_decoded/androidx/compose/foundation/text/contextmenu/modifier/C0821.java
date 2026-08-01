package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.input.pointer.AbstractC1622;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.InterfaceC1782;
import androidx.compose.ui.node.InterfaceC1783;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0821 extends AbstractC1788 implements InterfaceC1783, InterfaceC1782 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC1395 f2336 = AbstractC1367.m2475(null, C1353.f3920);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC6554 f2337;

    public C0821(InterfaceC6554 interfaceC6554) {
        this.f2337 = interfaceC6554;
        C0815 c0815 = new C0815(this);
        C1652 c1652 = AbstractC1622.f4745;
        m3364(new C1627(null, null, c0815));
    }

    @Override // androidx.compose.ui.node.InterfaceC1782
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final void mo1638(AbstractC1794 abstractC1794) {
        ((AbstractC1347) this.f2336).setValue(abstractC1794);
    }
}
