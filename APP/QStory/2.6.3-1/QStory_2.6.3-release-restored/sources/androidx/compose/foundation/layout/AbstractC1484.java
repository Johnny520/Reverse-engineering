package androidx.compose.foundation.layout;

import androidx.collection.C1083;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2964;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1083 f2155 = m2012(true);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1083 f2154 = m2012(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1480 f2153 = C1480.f2140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC2493 m2011(C2964 c2964, boolean z) {
        InterfaceC2493 interfaceC2493 = (InterfaceC2493) (z ? f2155 : f2154).m1317(c2964);
        return interfaceC2493 == null ? new C1483(c2964, z) : interfaceC2493;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1083 m2012(boolean z) {
        C1083 c1083 = new C1083(9);
        C2964 c2964 = C2952.f6617;
        c1083.m1315(c2964, new C1483(c2964, z));
        C2964 c29642 = C2952.f6615;
        c1083.m1315(c29642, new C1483(c29642, z));
        C2964 c29643 = C2952.f6616;
        c1083.m1315(c29643, new C1483(c29643, z));
        C2964 c29644 = C2952.f6610;
        c1083.m1315(c29644, new C1483(c29644, z));
        C2964 c29645 = C2952.f6609;
        c1083.m1315(c29645, new C1483(c29645, z));
        C2964 c29646 = C2952.f6613;
        c1083.m1315(c29646, new C1483(c29646, z));
        C2964 c29647 = C2952.f6614;
        c1083.m1315(c29647, new C1483(c29647, z));
        C2964 c29648 = C2952.f6611;
        c1083.m1315(c29648, new C1483(c29648, z));
        C2964 c29649 = C2952.f6612;
        c1083.m1315(c29649, new C1483(c29649, z));
        return c1083;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2013(AbstractC2543 abstractC2543, AbstractC2559 abstractC2559, InterfaceC2490 interfaceC2490, LayoutDirection layoutDirection, int i, int i2, C2964 c2964) {
        C2964 c29642;
        Object objMo3616 = interfaceC2490.mo3616();
        C1489 c1489 = objMo3616 instanceof C1489 ? (C1489) objMo3616 : null;
        AbstractC2543.m3694(abstractC2543, abstractC2559, ((c1489 == null || (c29642 = c1489.f2164) == null) ? c2964 : c29642).mo4419((((long) abstractC2559.f5344) << 32) | (((long) abstractC2559.f5342) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), layoutDirection));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2014(InterfaceC2962 interfaceC2962, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-211209833);
        int i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c2159.f4182);
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC7372 = C2600.f5530;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, f2153, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1481(interfaceC2962, i, 0);
        }
    }
}
