package p193;

import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.C1878;
import androidx.compose.foundation.C1912;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.layout.AbstractC1474;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.layout.AbstractC1499;
import androidx.compose.foundation.layout.C1471;
import androidx.compose.foundation.layout.C1477;
import androidx.compose.foundation.layout.C1479;
import androidx.compose.foundation.layout.C1490;
import androidx.compose.foundation.layout.C1496;
import androidx.compose.foundation.layout.C1501;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.lazy.layout.C1536;
import androidx.compose.foundation.selection.C1618;
import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2948;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.C2277;
import androidx.compose.p001ui.graphics.AbstractC2414;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.window.AbstractC2924;
import androidx.compose.p001ui.window.SecureFlagPolicy;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p132.AbstractC8176;
import p197.AbstractC8584;
import p197.C8585;
import p221.C8722;
import top.suzhelan.qstory.p015ui.components.C6807;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8575 f21371;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        C2193 c2193 = AbstractC2924.f6543;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.Inherit;
        long j = C2434.f5039;
        long j2 = C2434.f5041;
        f21371 = new C8575(j, j2, j2, C2434.m3510(0.38f, j2), C2434.m3510(0.38f, j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m13665(final String str, final boolean z, final C8575 c8575, final InterfaceC2962 interfaceC2962, final InterfaceC7380 interfaceC7380, final InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        C2159 c2159;
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2951(-2001167027);
        if ((i & 6) == 0) {
            i2 = (c21592.m2920(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c21592.m2939(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c21592.m2920(c8575) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c21592.m2920(interfaceC2962) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c21592.m2938(interfaceC7380) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c21592.m2938(interfaceC7372) ? 131072 : 65536;
        }
        int i3 = i2;
        if (c21592.m2903(i3 & 1, (74899 & i3) != 74898)) {
            C2948 c2948 = AbstractC8572.f21353;
            float f = AbstractC8572.f21351;
            C1490 c1490 = new C1490(f, new C1471());
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objM2905 = c21592.m2905();
            if (z2 || objM2905 == C2204.f4319) {
                objM2905 = new C1618(interfaceC7372, 2, z);
                c21592.m2946(objM2905);
            }
            InterfaceC2962 interfaceC2962M1998 = AbstractC1469.m1998(AbstractC1460.m1945(AbstractC1460.m1944(AbstractC1910.m2548(interfaceC2962, z, str, null, (InterfaceC7372) objM2905, 12), 1.0f)), f, 0.0f, 2);
            C1501 c1501M2020 = AbstractC1499.m2020(c1490, c2948, c21592, 54);
            int iHashCode = Long.hashCode(c21592.f4182);
            C2088 c2088M2941 = c21592.m2941();
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21592, interfaceC2962M1998);
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC73722 = C2600.f5530;
            c21592.m2956();
            if (c21592.f4183) {
                c21592.m2940(interfaceC73722);
            } else {
                c21592.m2950();
            }
            InterfaceC7383 interfaceC7383 = C2600.f5526;
            AbstractC2202.m3032(c21592, c1501M2020, interfaceC7383);
            InterfaceC7383 interfaceC73832 = C2600.f5527;
            AbstractC2202.m3032(c21592, c2088M2941, interfaceC73832);
            Integer numValueOf = Integer.valueOf(iHashCode);
            InterfaceC7383 interfaceC73833 = C2600.f5533;
            AbstractC2202.m3032(c21592, numValueOf, interfaceC73833);
            InterfaceC7387 interfaceC7387 = C2600.f5532;
            AbstractC2202.m3041(c21592, interfaceC7387);
            InterfaceC7383 interfaceC73834 = C2600.f5528;
            AbstractC2202.m3032(c21592, interfaceC2962M4421, interfaceC73834);
            if (interfaceC7380 == null) {
                c21592.m2952(-1597947094);
                c21592.m2937(false);
            } else {
                c21592.m2952(-1597947093);
                float f2 = AbstractC8572.f21349;
                InterfaceC2962 interfaceC2962M1940 = AbstractC1460.m1940(C2958.f6621, f2, 0.0f, f2, f2, 2);
                InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, false);
                int iHashCode2 = Long.hashCode(c21592.f4182);
                C2088 c2088M29412 = c21592.m2941();
                InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c21592, interfaceC2962M1940);
                c21592.m2956();
                if (c21592.f4183) {
                    c21592.m2940(interfaceC73722);
                } else {
                    c21592.m2950();
                }
                AbstractC2202.m3032(c21592, interfaceC2493M2011, interfaceC7383);
                AbstractC2202.m3032(c21592, c2088M29412, interfaceC73832);
                AbstractC2202.m3032(c21592, Integer.valueOf(iHashCode2), interfaceC73833);
                AbstractC2202.m3041(c21592, interfaceC7387);
                AbstractC2202.m3032(c21592, interfaceC2962M44212, interfaceC73834);
                interfaceC7380.invoke(new C2434(z ? c8575.f21366 : c8575.f21364), c21592, 0);
                c21592.m2937(true);
                c21592.m2937(false);
            }
            long j = z ? c8575.f21367 : c8575.f21365;
            AbstractC1821.m2454(str, new C1496(1.0f, true), new C2865(j, AbstractC8572.f21354, AbstractC8572.f21357, AbstractC8572.f21356, 0L, AbstractC8572.f21352, AbstractC8572.f21358, 16613240), null, 0, false, 1, 0, c21592, (i3 & 14) | 1572864, 952);
            c2159 = c21592;
            c2159.m2937(true);
        } else {
            c2159 = c21592;
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪苏世哲兰
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC8578.m13665(str, z, c8575, interfaceC2962, interfaceC7380, interfaceC7372, (InterfaceC2208) obj, AbstractC2202.m3031(i | 1));
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m13666(InterfaceC2962 interfaceC2962, C8575 c8575, InterfaceC7387 interfaceC7387, InterfaceC2208 interfaceC2208, int i, int i2) {
        int i3;
        int i4;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c2159.m2920(c8575) ? 32 : 16);
        }
        int i7 = i4 | (c2159.m2938(interfaceC7387) ? 256 : 128);
        if (c2159.m2903(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                interfaceC2962 = C2958.f6621;
            }
            if (i6 != 0) {
                c8575 = f21371;
            }
            m13667(c8575, interfaceC2962, AbstractC2089.m2749(-250345048, new C6807(interfaceC7387, c8575), c2159), c2159, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            c2159.m2899();
        }
        InterfaceC2962 interfaceC29622 = interfaceC2962;
        C8575 c85752 = c8575;
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(interfaceC29622, c85752, interfaceC7387, i, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13667(C8575 c8575, InterfaceC2962 interfaceC2962, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-527864079);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(c8575) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2920(interfaceC2962) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(c2077) ? 256 : 128;
        }
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            C2948 c2948 = AbstractC8572.f21353;
            C8585 c8585M13671 = AbstractC8584.m13671(4.0f);
            boolean z = C8722.m13878(3.0f, 0.0f) > 0;
            long j = AbstractC2414.f5003;
            InterfaceC2962 interfaceC2962M1998 = AbstractC1469.m1998(AbstractC1469.m1992(AbstractC1910.m2540((C8722.m13878(3.0f, 0.0f) > 0 || z) ? interfaceC2962.mo4426(new C2277(c8585M13671, z, j, j)) : interfaceC2962, c8575.f21368, AbstractC2416.f5007), IntrinsicSize.Max), 0.0f, AbstractC8572.f21350, 1);
            Object[] objArr = new Object[0];
            boolean zM2922 = c2159.m2922(0);
            Object objM2905 = c2159.m2905();
            if (zM2922 || objM2905 == C2204.f4319) {
                objM2905 = new C1912(3);
                c2159.m2946(objM2905);
            }
            InterfaceC2962 interfaceC2962M2545 = AbstractC1910.m2545(interfaceC2962M1998, (C1878) AbstractC8176.m13097(objArr, C1878.f3400, (InterfaceC7372) objM2905, c2159, 0));
            int i3 = (i2 << 3) & 7168;
            C1479 c1479M2009 = AbstractC1474.m2009(AbstractC1469.f2109, C2952.f6604, c2159, 0);
            int iHashCode = Long.hashCode(c2159.f4182);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M2545);
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC7372 = C2600.f5530;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, c1479M2009, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            c2077.invoke(C1477.f2131, c2159, Integer.valueOf(((i3 >> 6) & 112) | 6));
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(c8575, interfaceC2962, c2077, i, 9);
        }
    }
}
