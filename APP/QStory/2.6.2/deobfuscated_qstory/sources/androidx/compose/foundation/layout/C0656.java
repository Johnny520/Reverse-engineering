package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4338;
import p205.AbstractC7896;
import p205.AbstractC7906;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0656 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public IntrinsicSize f1831;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f1832;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1073(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return interfaceC1698.mo3047(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return this.f1831 == IntrinsicSize.Min ? interfaceC1698.mo3049(i) : interfaceC1698.mo3048(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return interfaceC1698.mo3044(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return this.f1831 == IntrinsicSize.Min ? interfaceC1698.mo3049(i) : interfaceC1698.mo3048(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iMo3049 = this.f1831 == IntrinsicSize.Min ? interfaceC1655.mo3049(C7897.m13310(j)) : interfaceC1655.mo3048(C7897.m13310(j));
        if (iMo3049 < 0) {
            iMo3049 = 0;
        }
        if (iMo3049 < 0) {
            AbstractC7906.m13332("width must be >= 0");
        }
        long jM13298 = AbstractC7896.m13298(iMo3049, iMo3049, 0, Integer.MAX_VALUE);
        if (this.f1832) {
            jM13298 = AbstractC7896.m13293(j, jM13298);
        }
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(jM13298);
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C0595(abstractC1724Mo3045, 1));
    }
}
