package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.InterfaceC1348;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.C1517;
import androidx.compose.foundation.lazy.grid.C1518;
import androidx.compose.foundation.lazy.layout.InterfaceC1530;
import androidx.compose.foundation.lazy.staggeredgrid.AbstractC1578;
import androidx.compose.foundation.lazy.staggeredgrid.C1577;
import androidx.compose.foundation.lazy.staggeredgrid.C1579;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2233;
import com.alibaba.fastjson2.C3775;
import java.util.List;
import kotlin.collections.AbstractC5176;
import p321.C9452;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1593 implements InterfaceC1530, InterfaceC1348 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1354 f2521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1348 f2522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2523;

    public /* synthetic */ C1593(InterfaceC1348 interfaceC1348, InterfaceC1354 interfaceC1354, int i) {
        this.f2523 = i;
        this.f2521 = interfaceC1354;
        this.f2522 = interfaceC1348;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1348
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo1811(float f) {
        switch (this.f2523) {
        }
        return this.f2522.mo1811(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1530
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo2048(int i) {
        int i2;
        int size;
        int i3 = this.f2523;
        Object obj = null;
        InterfaceC1354 interfaceC1354 = this.f2521;
        switch (i3) {
            case 0:
                C1598 c1598M2111 = ((C1582) interfaceC1354).m2111();
                if (c1598M2111.f2558.isEmpty()) {
                    return 0;
                }
                int iMo2053 = mo2053();
                if (i > mo2052() || iMo2053 > i) {
                    return ((i - mo2053()) * AbstractC1600.m2127(c1598M2111)) - mo2050();
                }
                List list = c1598M2111.f2558;
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        Object obj2 = list.get(i4);
                        if (((C1590) obj2).f2507 == i) {
                            obj = obj2;
                        } else {
                            i4++;
                        }
                    }
                }
                C1590 c1590 = (C1590) obj;
                if (c1590 != null) {
                    return c1590.f2517;
                }
                return 0;
            case 1:
                C1517 c1517 = (C1517) interfaceC1354;
                C1518 c1518 = (C1518) ((AbstractC2182) c1517.f2225).getValue();
                List list2 = c1518.f2233;
                if (list2.isEmpty()) {
                    return 0;
                }
                int iMo20532 = mo2053();
                mo2052();
                if (i <= 0 && iMo20532 <= i) {
                    if (list2.size() <= 0) {
                        Orientation orientation = Orientation.Vertical;
                        return 0;
                    }
                    list2.get(0).getClass();
                    C3775.m6954();
                    return 0;
                }
                ((C1518) ((AbstractC2182) c1517.f2225).getValue()).getClass();
                if (c1518.f2232 == Orientation.Vertical) {
                }
                if (list2.isEmpty()) {
                    i2 = 0;
                } else {
                    if (list2.size() > 0) {
                        c1518.f2233.get(0).getClass();
                        C3775.m6954();
                        return 0;
                    }
                    i2 = 0 / 0;
                }
                return (((((-1) * (i < mo2053() ? -1 : 1)) + (i - mo2053())) / 0) * i2) - mo2050();
            default:
                C1577 c1577 = (C1577) interfaceC1354;
                C1579 c1579 = (C1579) ((AbstractC2182) c1577.f2421).getValue();
                List list3 = c1579.f2443;
                if (list3.isEmpty()) {
                    return 0;
                }
                if (list3.size() > 0) {
                    list3.get(0).getClass();
                    C3775.m6954();
                    return 0;
                }
                C1579 c15792 = AbstractC1578.f2433;
                if (list3.isEmpty()) {
                    size = 0;
                } else {
                    if (list3.size() > 0) {
                        if (list3.get(0) != null) {
                            C3775.m6954();
                            return 0;
                        }
                        if (c1579.f2442 == Orientation.Vertical) {
                            throw null;
                        }
                        throw null;
                    }
                    size = 0 / list3.size();
                }
                C9452 c9452 = ((C1579) ((AbstractC2182) c1577.f2421).getValue()).f2434;
                return (((i / 0) - (mo2053() / 0)) * size) - mo2050();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1530
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo2049() {
        switch (this.f2523) {
            case 0:
                break;
            case 1:
                ((C1518) ((AbstractC2182) ((C1517) this.f2521).f2225).getValue()).getClass();
                break;
            default:
                ((C1579) ((AbstractC2182) ((C1577) this.f2521).f2421).getValue()).getClass();
                break;
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1530
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo2050() {
        switch (this.f2523) {
            case 0:
                return ((C1582) this.f2521).f2450.m2118();
            case 1:
                return ((AbstractC2181) ((InterfaceC2233) ((C1517) this.f2521).f2226.f665)).m2992();
            default:
                return ((AbstractC2181) ((InterfaceC2233) ((C1577) this.f2521).f2422.f919)).m2992();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1530
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2051(int i, int i2) {
        switch (this.f2523) {
            case 0:
                ((C1582) this.f2521).m2113(i, i2);
                break;
            case 1:
                ((C1517) this.f2521).m2029(i, i2);
                break;
            default:
                ((C1577) this.f2521).m2104(i, i2);
                break;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1530
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo2052() {
        int i = this.f2523;
        InterfaceC1354 interfaceC1354 = this.f2521;
        switch (i) {
            case 0:
                C1590 c1590 = (C1590) AbstractC5176.m9371(((C1582) interfaceC1354).m2111().f2558);
                if (c1590 != null) {
                }
                break;
            case 1:
                if (AbstractC5176.m9371(((C1518) ((AbstractC2182) ((C1517) interfaceC1354).f2225).getValue()).f2233) != null) {
                    C3775.m6954();
                }
                break;
            default:
                if (AbstractC5176.m9371(((C1579) ((AbstractC2182) ((C1577) interfaceC1354).f2421).getValue()).f2443) != null) {
                    C3775.m6954();
                }
                break;
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1530
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo2053() {
        switch (this.f2523) {
            case 0:
                return ((C1582) this.f2521).f2450.m2120();
            case 1:
                return ((AbstractC2181) ((InterfaceC2233) ((C1517) this.f2521).f2226.f664)).m2992();
            default:
                return ((AbstractC2181) ((InterfaceC2233) ((C1577) this.f2521).f2422.f920)).m2992();
        }
    }
}
