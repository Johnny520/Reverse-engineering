package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.lazy.C1605;
import androidx.compose.foundation.text.selection.AbstractC1733;
import androidx.compose.foundation.text.selection.AbstractC1767;
import androidx.compose.foundation.text.selection.C1768;
import androidx.compose.foundation.text.selection.InterfaceC1756;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.semantics.AbstractC2783;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.C8732;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f3103 = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2444(InterfaceC2962 interfaceC2962, InterfaceC2208 interfaceC2208, int i, int i2) {
        int i3;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (c2159.m2903(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            AbstractC1469.m1983(c2159, AbstractC2280.m3144(AbstractC1460.m1946(interfaceC2962, f3103, 25.0f), new C1807(((C1768) c2159.m2943(AbstractC1767.f2983)).f2985, i5)));
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1605(interfaceC2962, i, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2445(InterfaceC1756 interfaceC1756, InterfaceC2962 interfaceC2962, final long j, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1776202187);
        int i3 = (c2159.m2920(interfaceC1756) ? 4 : 2) | i | (c2159.m2920(interfaceC2962) ? 32 : 16) | 128;
        if (c2159.m2903(i3 & 1, (i3 & 147) != 146)) {
            c2159.m2901();
            if ((i & 1) == 0 || c2159.m2913()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                c2159.m2899();
                i2 = i3 & (-897);
            }
            c2159.m2934();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM2905 = c2159.m2905();
            if (z || objM2905 == C2204.f4319) {
                objM2905 = new C1810(interfaceC1756, 0);
                c2159.m2946(objM2905);
            }
            final InterfaceC2962 interfaceC2962M4209 = AbstractC2783.m4209(interfaceC2962, false, (InterfaceC7387) objM2905);
            AbstractC1733.m2366(interfaceC1756, C2952.f6615, AbstractC2089.m2749(-1653527038, new InterfaceC7383() { // from class: androidx.compose.foundation.text.飘花落叶言子楪世苏兰哲
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C2159 c21592 = (C2159) interfaceC22082;
                    if (c21592.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = j;
                        InterfaceC2962 interfaceC29622 = interfaceC2962M4209;
                        if (j2 != 9205357640488583168L) {
                            c21592.m2952(-1244013944);
                            InterfaceC2962 interfaceC2962M1940 = AbstractC1460.m1940(interfaceC29622, C8732.m13912(j2), C8732.m13913(j2), 0.0f, 0.0f, 12);
                            InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6615, false);
                            int iHashCode = Long.hashCode(c21592.f4182);
                            C2088 c2088M2941 = c21592.m2941();
                            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21592, interfaceC2962M1940);
                            InterfaceC2619.f5567.getClass();
                            InterfaceC7372 interfaceC7372 = C2600.f5530;
                            c21592.m2956();
                            if (c21592.f4183) {
                                c21592.m2940(interfaceC7372);
                            } else {
                                c21592.m2950();
                            }
                            AbstractC2202.m3032(c21592, interfaceC2493M2011, C2600.f5526);
                            AbstractC2202.m3032(c21592, c2088M2941, C2600.f5527);
                            AbstractC2202.m3032(c21592, Integer.valueOf(iHashCode), C2600.f5533);
                            AbstractC2202.m3041(c21592, C2600.f5532);
                            AbstractC2202.m3032(c21592, interfaceC2962M4421, C2600.f5528);
                            AbstractC1806.m2444(null, c21592, 0, 1);
                            c21592.m2937(true);
                            c21592.m2937(false);
                        } else {
                            c21592.m2952(-1243644858);
                            AbstractC1806.m2444(interfaceC29622, c21592, 0, 0);
                            c21592.m2937(false);
                        }
                    } else {
                        c21592.m2899();
                    }
                    return C6008.f15084;
                }
            }, c2159), c2159, i4 | 432);
        } else {
            c2159.m2899();
        }
        long j2 = j;
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1808(interfaceC1756, interfaceC2962, j2, i, 0);
        }
    }
}
