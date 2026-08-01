package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4338;
import p205.AbstractC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0674 extends AbstractC0584 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public InterfaceC0608 f1873;

    public C0674(InterfaceC0608 interfaceC0608) {
        this.f1873 = interfaceC0608;
    }

    @Override // androidx.compose.foundation.layout.AbstractC0584
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final InterfaceC0608 mo1347(InterfaceC0608 interfaceC0608) {
        return new C0609(interfaceC0608, this.f1873);
    }

    @Override // androidx.compose.foundation.layout.AbstractC0584
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final void mo1348() {
        super.mo1348();
        AbstractC1785.m3340(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iMo1360 = this.f1632.mo1360(interfaceC1653, interfaceC1653.getLayoutDirection()) - this.f1631.mo1360(interfaceC1653, interfaceC1653.getLayoutDirection());
        int iMo1361 = this.f1632.mo1361(interfaceC1653) - this.f1631.mo1361(interfaceC1653);
        int iMo1363 = (this.f1632.mo1363(interfaceC1653, interfaceC1653.getLayoutDirection()) - this.f1631.mo1363(interfaceC1653, interfaceC1653.getLayoutDirection())) + iMo1360;
        int iMo1362 = (this.f1632.mo1362(interfaceC1653) - this.f1631.mo1362(interfaceC1653)) + iMo1361;
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(AbstractC7896.m13301(-iMo1363, -iMo1362, j));
        return interfaceC1653.mo1485(AbstractC7896.m13299(abstractC1724Mo3045.f4998 + iMo1363, j), AbstractC7896.m13292(abstractC1724Mo3045.f4996 + iMo1362, j), AbstractC4338.m8781(), new C0673(abstractC1724Mo3045, iMo1360, iMo1361, 0));
    }
}
