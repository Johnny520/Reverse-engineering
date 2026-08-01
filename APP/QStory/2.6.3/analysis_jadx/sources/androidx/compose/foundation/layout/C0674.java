package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4339;
import p205.AbstractC7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0674 extends AbstractC0584 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0608 f1874;

    public C0674(InterfaceC0608 interfaceC0608) {
        this.f1874 = interfaceC0608;
    }

    @Override // androidx.compose.foundation.layout.AbstractC0584
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final InterfaceC0608 mo1357(InterfaceC0608 interfaceC0608) {
        return new C0609(interfaceC0608, this.f1874);
    }

    @Override // androidx.compose.foundation.layout.AbstractC0584
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo1358() {
        super.mo1358();
        AbstractC1785.m3350(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iMo1370 = this.f1633.mo1370(interfaceC1653, interfaceC1653.getLayoutDirection()) - this.f1632.mo1370(interfaceC1653, interfaceC1653.getLayoutDirection());
        int iMo1371 = this.f1633.mo1371(interfaceC1653) - this.f1632.mo1371(interfaceC1653);
        int iMo1373 = (this.f1633.mo1373(interfaceC1653, interfaceC1653.getLayoutDirection()) - this.f1632.mo1373(interfaceC1653, interfaceC1653.getLayoutDirection())) + iMo1370;
        int iMo1372 = (this.f1633.mo1372(interfaceC1653) - this.f1632.mo1372(interfaceC1653)) + iMo1371;
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(AbstractC7897.m13329(-iMo1373, -iMo1372, j));
        return interfaceC1653.mo1495(AbstractC7897.m13327(abstractC1724Mo3055.f4999 + iMo1373, j), AbstractC7897.m13320(abstractC1724Mo3055.f4997 + iMo1372, j), AbstractC4339.m8776(), new C0673(abstractC1724Mo3055, iMo1370, iMo1371, 0));
    }
}
