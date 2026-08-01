package androidx.compose.ui.layout;

import androidx.collection.C0236;
import androidx.collection.C0242;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.LayoutNode$LayoutState;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1675 implements InterfaceC1715 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public LayoutDirection f4907 = LayoutDirection.Rtl;

    public C1675(C1661 c1661) {
        this.f4904 = c1661;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f4907;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1715
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final List mo3084(Object obj, InterfaceC6553 interfaceC6553) {
        C1661 c1661 = this.f4904;
        c1661.m3057();
        C1748 c1748 = c1661.f4873;
        LayoutNode$LayoutState layoutNode$LayoutState = c1748.f5131.f5158;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        if (layoutNode$LayoutState != layoutNode$LayoutState2 && layoutNode$LayoutState != LayoutNode$LayoutState.LayingOut && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadMeasuring && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadLayingOut) {
            AbstractC7935.m13395("subcompose can only be used inside the measure or layout blocks");
        }
        C0236 c0236 = c1661.f4870;
        Object objM756 = c0236.m756(obj);
        if (objM756 == null) {
            objM756 = (C1748) c1661.f4863.m757(obj);
            if (objM756 != null) {
                if (c1661.f4858 <= 0) {
                    AbstractC7935.m13395("Check failed.");
                }
                c1661.f4858--;
            } else {
                objM756 = c1661.m3055(obj);
                if (objM756 == null) {
                    int i = c1661.f4866;
                    C1748 c17482 = new C1748(2);
                    c1748.f5113 = true;
                    c1748.m3227(i, c17482);
                    c1748.f5113 = false;
                    objM756 = c17482;
                }
            }
            c0236.m754(obj, objM756);
        }
        C1748 c17483 = (C1748) objM756;
        if (AbstractC4343.m8831(c1661.f4866, c1748.m3251()) != c17483) {
            int iM2044 = ((C1224) ((C0242) c1748.m3251()).f894).m2044(c17483);
            if (iM2044 < c1661.f4866) {
                AbstractC7935.m13397("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = c1661.f4866;
            if (i2 != iM2044) {
                c1661.m3062(iM2044, i2);
            }
        }
        c1661.f4866++;
        c1661.m3056(c17483, obj, false, interfaceC6553);
        return (layoutNode$LayoutState == layoutNode$LayoutState2 || layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut) ? c17483.m3248() : c17483.m3256();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f4905;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC1657 mo1486(int i, int i2, Map map, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC7935.m13395("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1676(i, i2, map, interfaceC6557, this, this.f4904, interfaceC65572);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f4906;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1487() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f4904.f4873.f5131.f5158;
        return layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadMeasuring;
    }
}
