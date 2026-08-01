package androidx.compose.ui.node;

import androidx.appcompat.app.C0076;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1658;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1772 extends AbstractC1745 {
    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3044(int i) {
        C0076 c0076M3241 = this.f5062.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1103(c1748.f5093.f5284, c1748.m3256(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC1724 mo3045(long j) {
        m3130(j);
        AbstractC1794 abstractC1794 = this.f5062;
        C1224 c1224M3229 = abstractC1794.f5258.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1747 c1747 = ((C1748) objArr[i2]).f5131.f5164;
            c1747.getClass();
            c1747.f5077 = LayoutNode$UsageByParent.NotUsed;
        }
        C1748 c1748 = abstractC1794.f5258;
        AbstractC1745.m3189(this, c1748.f5103.mo1105(this, c1748.m3256(), j));
        return this;
    }

    @Override // androidx.compose.ui.node.AbstractC1745
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo3197() {
        C1747 c1747 = this.f5062.f5258.f5131.f5164;
        c1747.getClass();
        c1747.m3202();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3047(int i) {
        C0076 c0076M3241 = this.f5062.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1107(c1748.f5093.f5284, c1748.m3256(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3048(int i) {
        C0076 c0076M3241 = this.f5062.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1104(c1748.f5093.f5284, c1748.m3256(), i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3049(int i) {
        C0076 c0076M3241 = this.f5062.f5258.m3241();
        InterfaceC1658 interfaceC1658M259 = c0076M3241.m259();
        C1748 c1748 = (C1748) c0076M3241.f227;
        return interfaceC1658M259.mo1106(c1748.f5093.f5284, c1748.m3256(), i);
    }

    @Override // androidx.compose.ui.node.AbstractC1754
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final int mo3276(AbstractC1689 abstractC1689) {
        C1747 c1747 = this.f5062.f5258.f5131.f5164;
        c1747.getClass();
        C1756 c1756 = c1747.f5086;
        LayoutNode$LayoutState layoutNode$LayoutState = c1756.f5158;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.LookaheadMeasuring;
        C1759 c1759 = c1747.f5082;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            c1759.f5195 = true;
            if (c1759.f5197) {
                c1756.f5156 = true;
                c1756.f5168 = true;
            }
        } else {
            c1759.f5194 = true;
        }
        C1772 c1772 = c1747.mo3162().f5201;
        if (c1772 != null) {
            c1772.f5146 = true;
        }
        c1747.mo3157();
        C1772 c17722 = c1747.mo3162().f5201;
        if (c17722 != null) {
            c17722.f5146 = false;
        }
        Integer num = (Integer) c1759.f5199.get(abstractC1689);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f5057.m807(iIntValue, abstractC1689);
        return iIntValue;
    }
}
