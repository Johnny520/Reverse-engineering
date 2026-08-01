package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.node.AbstractC2589;
import androidx.compose.p001ui.node.InterfaceC2608;
import kotlin.collections.AbstractC5171;
import p221.AbstractC8726;
import p221.AbstractC8736;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1497 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public IntrinsicSize f2177;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f2178;

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1634(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return interfaceC2533.mo3617(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1635(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return this.f2177 == IntrinsicSize.Min ? interfaceC2533.mo3619(i) : interfaceC2533.mo3618(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1636(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return interfaceC2533.mo3614(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1637(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        return this.f2177 == IntrinsicSize.Min ? interfaceC2533.mo3619(i) : interfaceC2533.mo3618(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        int iMo3619 = this.f2177 == IntrinsicSize.Min ? interfaceC2490.mo3619(C8727.m13897(j)) : interfaceC2490.mo3618(C8727.m13897(j));
        if (iMo3619 < 0) {
            iMo3619 = 0;
        }
        if (iMo3619 < 0) {
            AbstractC8736.m13919("width must be >= 0");
        }
        long jM13885 = AbstractC8726.m13885(iMo3619, iMo3619, 0, Integer.MAX_VALUE);
        if (this.f2178) {
            jM13885 = AbstractC8726.m13880(j, jM13885);
        }
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(jM13885);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C1436(abstractC2559Mo3615, 1));
    }
}
