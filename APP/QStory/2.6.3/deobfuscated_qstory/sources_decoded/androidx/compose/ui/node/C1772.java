package androidx.compose.ui.node;

import androidx.appcompat.app.C0076;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1658;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1772 extends AbstractC1745 {
    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3054(int i) {
        C0076 c0076M3251 = this.f5063.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1104(c1748.f5094.f5285, c1748.m3266(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3055(long j) {
        m3140(j);
        AbstractC1794 abstractC1794 = this.f5063;
        C1224 c1224M3239 = abstractC1794.f5259.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            C1747 c1747 = ((C1748) objArr[i2]).f5132.f5165;
            c1747.getClass();
            c1747.f5078 = LayoutNode$UsageByParent.NotUsed;
        }
        C1748 c1748 = abstractC1794.f5259;
        AbstractC1745.m3199(this, c1748.f5104.mo1106(this, c1748.m3266(), j));
        return this;
    }

    @Override // androidx.compose.ui.node.AbstractC1745
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo3207() {
        C1747 c1747 = this.f5063.f5259.f5132.f5165;
        c1747.getClass();
        c1747.m3212();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3057(int i) {
        C0076 c0076M3251 = this.f5063.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1108(c1748.f5094.f5285, c1748.m3266(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3058(int i) {
        C0076 c0076M3251 = this.f5063.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1105(c1748.f5094.f5285, c1748.m3266(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3059(int i) {
        C0076 c0076M3251 = this.f5063.f5259.m3251();
        InterfaceC1658 interfaceC1658M260 = c0076M3251.m260();
        C1748 c1748 = (C1748) c0076M3251.f227;
        return interfaceC1658M260.mo1107(c1748.f5094.f5285, c1748.m3266(), i);
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final int mo3286(AbstractC1689 abstractC1689) {
        C1747 c1747 = this.f5063.f5259.f5132.f5165;
        c1747.getClass();
        C1756 c1756 = c1747.f5087;
        LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5159;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.LookaheadMeasuring;
        C1759 c1759 = c1747.f5083;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            c1759.f5196 = true;
            if (c1759.f5198) {
                c1756.f5157 = true;
                c1756.f5169 = true;
            }
        } else {
            c1759.f5195 = true;
        }
        C1772 c1772 = c1747.mo3172().f5202;
        if (c1772 != null) {
            c1772.f5147 = true;
        }
        c1747.mo3167();
        C1772 c17722 = c1747.mo3172().f5202;
        if (c17722 != null) {
            c17722.f5147 = false;
        }
        Integer num = (Integer) c1759.f5200.get(abstractC1689);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f5058.m808(iIntValue, abstractC1689);
        return iIntValue;
    }
}
