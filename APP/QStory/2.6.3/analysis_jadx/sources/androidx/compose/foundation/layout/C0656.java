package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4339;
import p205.AbstractC7897;
import p205.AbstractC7907;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0656 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public IntrinsicSize f1832;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f1833;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return interfaceC1698.mo3057(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return this.f1832 == IntrinsicSize.Min ? interfaceC1698.mo3059(i) : interfaceC1698.mo3058(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return interfaceC1698.mo3054(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1077(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        return this.f1832 == IntrinsicSize.Min ? interfaceC1698.mo3059(i) : interfaceC1698.mo3058(i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iMo3059 = this.f1832 == IntrinsicSize.Min ? interfaceC1655.mo3059(C7898.m13338(j)) : interfaceC1655.mo3058(C7898.m13338(j));
        if (iMo3059 < 0) {
            iMo3059 = 0;
        }
        if (iMo3059 < 0) {
            AbstractC7907.m13360("width must be >= 0");
        }
        long jM13326 = AbstractC7897.m13326(iMo3059, iMo3059, 0, Integer.MAX_VALUE);
        if (this.f1833) {
            jM13326 = AbstractC7897.m13321(j, jM13326);
        }
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(jM13326);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C0595(abstractC1724Mo3055, 1));
    }
}
