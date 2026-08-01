package androidx.compose.animation;

import androidx.compose.animation.core.C1200;
import androidx.compose.animation.core.C1210;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/animation/飘花落叶言子世楪苏哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;", "animation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1238 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC1242 f1658;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1200 f1659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1237 f1660;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC1240 f1661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC7372 f1662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1200 f1663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1200 f1664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1210 f1665;

    public C1238(C1210 c1210, C1200 c1200, C1200 c12002, C1200 c12003, AbstractC1242 abstractC1242, AbstractC1240 abstractC1240, InterfaceC7372 interfaceC7372, C1237 c1237) {
        this.f1665 = c1210;
        this.f1663 = c1200;
        this.f1664 = c12002;
        this.f1659 = c12003;
        this.f1658 = abstractC1242;
        this.f1661 = abstractC1240;
        this.f1662 = interfaceC7372;
        this.f1660 = c1237;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1238)) {
            return false;
        }
        C1238 c1238 = (C1238) obj;
        return AbstractC5227.m9466(c1238.f1665, this.f1665) && AbstractC5227.m9466(c1238.f1663, this.f1663) && AbstractC5227.m9466(c1238.f1664, this.f1664) && AbstractC5227.m9466(c1238.f1659, this.f1659) && c1238.f1658.equals(this.f1658) && AbstractC5227.m9466(c1238.f1661, this.f1661) && c1238.f1662 == this.f1662 && AbstractC5227.m9466(c1238.f1660, this.f1660);
    }

    public final int hashCode() {
        int iHashCode = this.f1665.hashCode() * 31;
        C1200 c1200 = this.f1663;
        int iHashCode2 = (iHashCode + (c1200 != null ? c1200.hashCode() : 0)) * 31;
        C1200 c12002 = this.f1664;
        int iHashCode3 = (iHashCode2 + (c12002 != null ? c12002.hashCode() : 0)) * 31;
        C1200 c12003 = this.f1659;
        return this.f1660.hashCode() + ((this.f1662.hashCode() + ((this.f1661.hashCode() + ((this.f1658.hashCode() + ((iHashCode3 + (c12003 != null ? c12003.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1243 c1243 = (C1243) abstractC2961;
        c1243.f1676 = this.f1665;
        c1243.f1682 = this.f1663;
        c1243.f1681 = this.f1664;
        c1243.f1680 = this.f1659;
        c1243.f1679 = this.f1658;
        c1243.f1678 = this.f1661;
        c1243.f1677 = this.f1662;
        c1243.f1673 = this.f1660;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2961 mo1657() {
        return new C1243(this.f1665, this.f1663, this.f1664, this.f1659, this.f1658, this.f1661, this.f1662, this.f1660);
    }
}
