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
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1666 implements InterfaceC1715, InterfaceC1653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1661 f4888;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1675 f4889;

    public C1666(C1661 c1661) {
        this.f4888 = c1661;
        this.f4889 = c1661.f4867;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f4889.f4907;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1322(float f) {
        return f / this.f4889.mo1246();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1715
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final List mo3084(Object obj, InterfaceC6553 interfaceC6553) {
        C1661 c1661 = this.f4888;
        C1748 c1748 = c1661.f4873;
        C0236 c0236 = c1661.f4870;
        C1748 c17482 = (C1748) c0236.m756(obj);
        if (c17482 != null && ((C1224) ((C0242) c1748.m3251()).f894).m2044(c17482) < c1661.f4866) {
            return c17482.m3248();
        }
        C0236 c02362 = c1661.f4861;
        C0236 c02363 = c1661.f4863;
        C1224 c1224 = c1661.f4860;
        if (c1224.f3519 < c1661.f4865) {
            AbstractC7935.m13397("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C1748 c17483 = (C1748) c0236.m756(obj);
        int i = c1224.f3519;
        int i2 = c1661.f4865;
        if (i == i2) {
            c1224.m2037(obj);
        } else {
            Object[] objArr = c1224.f3520;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        c1661.f4865++;
        boolean zM752 = c02363.m752(obj);
        if (zM752 || c17483 != null) {
            if (!zM752 && c17483 != null) {
                c1661.m3062(((C1224) ((C0242) c1748.m3251()).f894).m2044(c17483), ((C1224) ((C0242) c1748.m3251()).f894).f3519);
                c1661.f4858++;
                c0236.m757(obj);
                c02363.m754(obj, c17483);
                c02362.m754(obj, c1661.m3053(obj));
                if (c1748.m3233()) {
                    c1661.m3057();
                }
            }
            C1748 c17484 = (C1748) c02363.m756(obj);
            C1665 c1665 = c17484 != null ? (C1665) c1661.f4869.m756(c17484) : null;
            if (c1665 != null && c1665.f4882) {
                c1661.m3056(c17484, obj, false, interfaceC6553);
            }
            if ((c1665 != null ? c1665.f4880 : null) != null) {
                c1661.m3054(c1665, true);
            }
        } else {
            c1661.m3059(obj, interfaceC6553, false);
            c02362.m754(obj, c1661.m3053(obj));
        }
        C1748 c17485 = (C1748) c02363.m756(obj);
        if (c17485 == null) {
            return EmptyList.INSTANCE;
        }
        List listM3166 = c17485.f5131.f5166.m3166();
        C0242 c0242 = (C0242) listM3166;
        int i3 = ((C1224) c0242.f894).f3519;
        for (int i4 = 0; i4 < i3; i4++) {
            ((C1738) c0242.get(i4)).f5037.f5160 = true;
        }
        return listM3166;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1323(int i) {
        return this.f4889.mo1323(i);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1324(float f) {
        return this.f4889.mo1324(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1325(long j) {
        return this.f4889.mo1325(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f4889.f4905;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1329(long j) {
        return this.f4889.mo1329(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1330(float f) {
        return this.f4889.mo1330(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1331(long j) {
        return this.f4889.mo1331(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1332(long j) {
        return this.f4889.mo1332(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final InterfaceC1657 mo1485(int i, int i2, Map map, InterfaceC6557 interfaceC6557) {
        return this.f4889.mo1486(i, i2, map, null, interfaceC6557);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1333(float f) {
        return this.f4889.mo1333(f);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC1657 mo1486(int i, int i2, Map map, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        return this.f4889.mo1486(i, i2, map, interfaceC6557, interfaceC65572);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f4889.f4906;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1487() {
        return this.f4889.mo1487();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1334(float f) {
        return this.f4889.mo1246() * f;
    }
}
