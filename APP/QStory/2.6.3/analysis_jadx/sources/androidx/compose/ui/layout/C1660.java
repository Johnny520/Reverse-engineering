package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1745;
import androidx.compose.ui.node.AbstractC1794;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1660 implements InterfaceC1659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC6543 f4858;

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC1695 mo1121(AbstractC1708 abstractC1708) {
        InterfaceC6543 interfaceC6543 = this.f4858;
        interfaceC6543.getClass();
        return (InterfaceC1695) interfaceC6543.invoke();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC1695 mo1122(InterfaceC1695 interfaceC1695) {
        C1663 c1663;
        C1663 c16632 = interfaceC1695 instanceof C1663 ? (C1663) interfaceC1695 : null;
        if (c16632 != null) {
            return c16632;
        }
        interfaceC1695.getClass();
        AbstractC1794 abstractC1794 = (AbstractC1794) interfaceC1695;
        AbstractC1745 abstractC1745Mo3285 = abstractC1794.mo3285();
        return (abstractC1745Mo3285 == null || (c1663 = abstractC1745Mo3285.f5060) == null) ? abstractC1794 : c1663;
    }
}
