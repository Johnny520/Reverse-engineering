package androidx.compose.p001ui.layout;

import androidx.collection.C1083;
import androidx.collection.C1089;
import androidx.compose.p001ui.node.C2573;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.C2059;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2501 implements InterfaceC2550, InterfaceC2488 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2496 f5234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2510 f5235;

    public C2501(C2496 c2496) {
        this.f5234 = c2496;
        this.f5235 = c2496.f5213;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    public final LayoutDirection getLayoutDirection() {
        return this.f5235.f5253;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1892(float f) {
        return f / this.f5235.mo1816();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2550
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final List mo3654(Object obj, InterfaceC7383 interfaceC7383) {
        C2496 c2496 = this.f5234;
        C2583 c2583 = c2496.f5219;
        C1083 c1083 = c2496.f5216;
        C2583 c25832 = (C2583) c1083.m1317(obj);
        if (c25832 != null && ((C2059) ((C1089) c2583.m3821()).f1239).m2614(c25832) < c2496.f5212) {
            return c25832.m3818();
        }
        C1083 c10832 = c2496.f5207;
        C1083 c10833 = c2496.f5209;
        C2059 c2059 = c2496.f5206;
        if (c2059.f3865 < c2496.f5211) {
            AbstractC8765.m13984("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C2583 c25833 = (C2583) c1083.m1317(obj);
        int i = c2059.f3865;
        int i2 = c2496.f5211;
        if (i == i2) {
            c2059.m2607(obj);
        } else {
            Object[] objArr = c2059.f3866;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        c2496.f5211++;
        boolean zM1313 = c10833.m1313(obj);
        if (zM1313 || c25833 != null) {
            if (!zM1313 && c25833 != null) {
                c2496.m3632(((C2059) ((C1089) c2583.m3821()).f1239).m2614(c25833), ((C2059) ((C1089) c2583.m3821()).f1239).f3865);
                c2496.f5204++;
                c1083.m1318(obj);
                c10833.m1315(obj, c25833);
                c10832.m1315(obj, c2496.m3623(obj));
                if (c2583.m3803()) {
                    c2496.m3627();
                }
            }
            C2583 c25834 = (C2583) c10833.m1317(obj);
            C2500 c2500 = c25834 != null ? (C2500) c2496.f5215.m1317(c25834) : null;
            if (c2500 != null && c2500.f5228) {
                c2496.m3626(c25834, obj, false, interfaceC7383);
            }
            if ((c2500 != null ? c2500.f5226 : null) != null) {
                c2496.m3624(c2500, true);
            }
        } else {
            c2496.m3629(obj, interfaceC7383, false);
            c10832.m1315(obj, c2496.m3623(obj));
        }
        C2583 c25835 = (C2583) c10833.m1317(obj);
        if (c25835 == null) {
            return EmptyList.INSTANCE;
        }
        List listM3736 = c25835.f5477.f5512.m3736();
        C1089 c1089 = (C1089) listM3736;
        int i3 = ((C2059) c1089.f1239).f3865;
        for (int i4 = 0; i4 < i3; i4++) {
            ((C2573) c1089.get(i4)).f5383.f5506 = true;
        }
        return listM3736;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1893(int i) {
        return this.f5235.mo1893(i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1894(float f) {
        return this.f5235.mo1894(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1895(long j) {
        return this.f5235.mo1895(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5235.f5251;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1899(long j) {
        return this.f5235.mo1899(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return this.f5235.mo1900(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        return this.f5235.mo1901(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1902(long j) {
        return this.f5235.mo1902(j);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final InterfaceC2492 mo2055(int i, int i2, Map map, InterfaceC7387 interfaceC7387) {
        return this.f5235.mo2056(i, i2, map, null, interfaceC7387);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1903(float f) {
        return this.f5235.mo1903(f);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC2492 mo2056(int i, int i2, Map map, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        return this.f5235.mo2056(i, i2, map, interfaceC7387, interfaceC73872);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5235.f5252;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo2057() {
        return this.f5235.mo2057();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1904(float f) {
        return this.f5235.mo1816() * f;
    }
}
