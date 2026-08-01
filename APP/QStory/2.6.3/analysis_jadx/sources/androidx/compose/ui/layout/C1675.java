package androidx.compose.ui.layout;

import androidx.collection.C0236;
import androidx.collection.C0242;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.LayoutNode$LayoutState;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1675 implements InterfaceC1715 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public LayoutDirection f4908 = LayoutDirection.Rtl;

    public C1675(C1661 c1661) {
        this.f4905 = c1661;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f4908;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1715
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final List mo3094(Object obj, InterfaceC6554 interfaceC6554) {
        C1661 c1661 = this.f4905;
        c1661.m3067();
        C1748 c1748 = c1661.f4874;
        LayoutNode$LayoutState layoutNode$LayoutState = c1748.f5132.f5159;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        if (layoutNode$LayoutState != layoutNode$LayoutState2 && layoutNode$LayoutState != LayoutNode$LayoutState.LayingOut && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadMeasuring && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadLayingOut) {
            AbstractC7936.m13423("subcompose can only be used inside the measure or layout blocks");
        }
        C0236 c0236 = c1661.f4871;
        Object objM757 = c0236.m757(obj);
        if (objM757 == null) {
            objM757 = (C1748) c1661.f4864.m758(obj);
            if (objM757 != null) {
                if (c1661.f4859 <= 0) {
                    AbstractC7936.m13423("Check failed.");
                }
                c1661.f4859--;
            } else {
                objM757 = c1661.m3065(obj);
                if (objM757 == null) {
                    int i = c1661.f4867;
                    C1748 c17482 = new C1748(2);
                    c1748.f5114 = true;
                    c1748.m3237(i, c17482);
                    c1748.f5114 = false;
                    objM757 = c17482;
                }
            }
            c0236.m755(obj, objM757);
        }
        C1748 c17483 = (C1748) objM757;
        if (AbstractC4344.m8818(c1661.f4867, c1748.m3261()) != c17483) {
            int iM2054 = ((C1224) ((C0242) c1748.m3261()).f894).m2054(c17483);
            if (iM2054 < c1661.f4867) {
                AbstractC7936.m13425("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = c1661.f4867;
            if (i2 != iM2054) {
                c1661.m3072(iM2054, i2);
            }
        }
        c1661.f4867++;
        c1661.m3066(c17483, obj, false, interfaceC6554);
        return (layoutNode$LayoutState == layoutNode$LayoutState2 || layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut) ? c17483.m3258() : c17483.m3266();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f4906;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC1657 mo1496(int i, int i2, Map map, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC7936.m13423("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1676(i, i2, map, interfaceC6558, this, this.f4905, interfaceC65582);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f4907;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1497() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f4905.f4874.f5132.f5159;
        return layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadMeasuring;
    }
}
