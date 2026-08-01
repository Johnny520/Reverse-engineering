package androidx.compose.ui.layout;

import androidx.collection.C0236;
import androidx.collection.C0242;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.node.C1738;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1666 implements InterfaceC1715, InterfaceC1653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4889;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1675 f4890;

    public C1666(C1661 c1661) {
        this.f4889 = c1661;
        this.f4890 = c1661.f4868;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f4890.f4908;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1332(float f) {
        return f / this.f4890.mo1256();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1715
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final List mo3094(Object obj, InterfaceC6554 interfaceC6554) {
        C1661 c1661 = this.f4889;
        C1748 c1748 = c1661.f4874;
        C0236 c0236 = c1661.f4871;
        C1748 c17482 = (C1748) c0236.m757(obj);
        if (c17482 != null && ((C1224) ((C0242) c1748.m3261()).f894).m2054(c17482) < c1661.f4867) {
            return c17482.m3258();
        }
        C0236 c02362 = c1661.f4862;
        C0236 c02363 = c1661.f4864;
        C1224 c1224 = c1661.f4861;
        if (c1224.f3520 < c1661.f4866) {
            AbstractC7936.m13425("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C1748 c17483 = (C1748) c0236.m757(obj);
        int i = c1224.f3520;
        int i2 = c1661.f4866;
        if (i == i2) {
            c1224.m2047(obj);
        } else {
            Object[] objArr = c1224.f3521;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        c1661.f4866++;
        boolean zM753 = c02363.m753(obj);
        if (zM753 || c17483 != null) {
            if (!zM753 && c17483 != null) {
                c1661.m3072(((C1224) ((C0242) c1748.m3261()).f894).m2054(c17483), ((C1224) ((C0242) c1748.m3261()).f894).f3520);
                c1661.f4859++;
                c0236.m758(obj);
                c02363.m755(obj, c17483);
                c02362.m755(obj, c1661.m3063(obj));
                if (c1748.m3243()) {
                    c1661.m3067();
                }
            }
            C1748 c17484 = (C1748) c02363.m757(obj);
            C1665 c1665 = c17484 != null ? (C1665) c1661.f4870.m757(c17484) : null;
            if (c1665 != null && c1665.f4883) {
                c1661.m3066(c17484, obj, false, interfaceC6554);
            }
            if ((c1665 != null ? c1665.f4881 : null) != null) {
                c1661.m3064(c1665, true);
            }
        } else {
            c1661.m3069(obj, interfaceC6554, false);
            c02362.m755(obj, c1661.m3063(obj));
        }
        C1748 c17485 = (C1748) c02363.m757(obj);
        if (c17485 == null) {
            return EmptyList.INSTANCE;
        }
        List listM3176 = c17485.f5132.f5167.m3176();
        C0242 c0242 = (C0242) listM3176;
        int i3 = ((C1224) c0242.f894).f3520;
        for (int i4 = 0; i4 < i3; i4++) {
            ((C1738) c0242.get(i4)).f5038.f5161 = true;
        }
        return listM3176;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1333(int i) {
        return this.f4890.mo1333(i);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1334(float f) {
        return this.f4890.mo1334(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1335(long j) {
        return this.f4890.mo1335(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f4890.f4906;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1339(long j) {
        return this.f4890.mo1339(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1340(float f) {
        return this.f4890.mo1340(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1341(long j) {
        return this.f4890.mo1341(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1342(long j) {
        return this.f4890.mo1342(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final InterfaceC1657 mo1495(int i, int i2, Map map, InterfaceC6558 interfaceC6558) {
        return this.f4890.mo1496(i, i2, map, null, interfaceC6558);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1343(float f) {
        return this.f4890.mo1343(f);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC1657 mo1496(int i, int i2, Map map, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        return this.f4890.mo1496(i, i2, map, interfaceC6558, interfaceC65582);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f4890.f4907;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1497() {
        return this.f4890.mo1497();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1344(float f) {
        return this.f4890.mo1256() * f;
    }
}
