package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1745;
import androidx.compose.ui.node.AbstractC1794;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1660 implements InterfaceC1659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC6542 f4857;

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC1695 mo1120(AbstractC1708 abstractC1708) {
        InterfaceC6542 interfaceC6542 = this.f4857;
        interfaceC6542.getClass();
        return (InterfaceC1695) interfaceC6542.invoke();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC1695 mo1121(InterfaceC1695 interfaceC1695) {
        C1663 c1663;
        C1663 c16632 = interfaceC1695 instanceof C1663 ? (C1663) interfaceC1695 : null;
        if (c16632 != null) {
            return c16632;
        }
        interfaceC1695.getClass();
        AbstractC1794 abstractC1794 = (AbstractC1794) interfaceC1695;
        AbstractC1745 abstractC1745Mo3275 = abstractC1794.mo3275();
        return (abstractC1745Mo3275 == null || (c1663 = abstractC1745Mo3275.f5059) == null) ? abstractC1794 : c1663;
    }
}
