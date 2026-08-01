package androidx.compose.foundation.text.contextmenu.internal;

import android.view.View;
import androidx.appcompat.widget.C1041;
import androidx.compose.animation.core.C1212;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.text.contextmenu.provider.AbstractC1673;
import androidx.compose.foundation.text.contextmenu.provider.C1670;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.window.C2923;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import com.bumptech.glide.AbstractC3888;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2077 f2652 = new C2077(636288403, false, new C1647(0));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2077 f2651 = new C2077(-1357803046, false, new C1647(1));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1654 m2191(InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        View view = (View) c2159.m2943(AbstractC2670.f5677);
        boolean zM2920 = c2159.m2920(view);
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (zM2920 || objM2905 == c2188) {
            objM2905 = new C1654(view, null, interfaceC7372);
            c2159.m2946(objM2905);
        }
        C1654 c1654 = (C1654) objM2905;
        boolean zM2938 = c2159.m2938(c1654);
        Object objM29052 = c2159.m2905();
        if (zM2938 || objM29052 == c2188) {
            objM29052 = new C1636(c1654, 3);
            c2159.m2946(objM29052);
        }
        AbstractC2202.m3044(c1654, (InterfaceC7387) objM29052, c2159);
        return c1654;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m2192(final InterfaceC2962 interfaceC2962, final C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(771959668);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(c2077) ? 256 : 128;
        }
        int i3 = 1;
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (objM2905 == c2188) {
                objM2905 = AbstractC2202.m3035(null, C2188.f4265);
                c2159.m2946(objM2905);
            }
            final InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
            Object objM29052 = c2159.m2905();
            if (objM29052 == c2188) {
                objM29052 = new C1652(interfaceC2230, 0);
                c2159.m2946(objM29052);
            }
            AbstractC2202.m3047(AbstractC1673.f2713.mo2988(m2191((InterfaceC7372) objM29052, c2159, 0)), AbstractC2089.m2749(-291176396, new InterfaceC7383() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪哲世苏兰
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C2159 c21592 = (C2159) interfaceC22082;
                    if (c21592.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objM29053 = c21592.m2905();
                        if (objM29053 == C2204.f4319) {
                            objM29053 = new C1643(interfaceC2230, 0);
                            c21592.m2946(objM29053);
                        }
                        InterfaceC2962 interfaceC2962M3665 = AbstractC2505.m3665(interfaceC2962, (InterfaceC7387) objM29053);
                        InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, true);
                        int iHashCode = Long.hashCode(c21592.f4182);
                        C2088 c2088M2941 = c21592.m2941();
                        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c21592, interfaceC2962M3665);
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
                        c2077.invoke(c21592, 0);
                        c21592.m2937(true);
                    } else {
                        c21592.m2899();
                    }
                    return C6008.f15084;
                }
            }, c2159), c2159, 56);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1651(interfaceC2962, c2077, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2193(InterfaceC2962 interfaceC2962, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(2064964257);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c2077) ? 32 : 16;
        }
        int i3 = 0;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            m2192(interfaceC2962, c2077, c2159, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1651(interfaceC2962, c2077, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2194(InterfaceC2962 interfaceC2962, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(155925518);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c2077) ? 32 : 16;
        }
        int i3 = 3;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            boolean z = c2159.m2943(AbstractC1673.f2714) != null;
            boolean z2 = c2159.m2943(AbstractC1673.f2713) != null;
            if (z && z2) {
                c2159.m2952(-1977187922);
                InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, true);
                int iHashCode = Long.hashCode(c2159.f4182);
                C2088 c2088M2941 = c2159.m2941();
                InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962);
                InterfaceC2619.f5567.getClass();
                InterfaceC7372 interfaceC7372 = C2600.f5530;
                c2159.m2956();
                if (c2159.f4183) {
                    c2159.m2940(interfaceC7372);
                } else {
                    c2159.m2950();
                }
                AbstractC2202.m3032(c2159, interfaceC2493M2011, C2600.f5526);
                AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
                AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
                AbstractC2202.m3041(c2159, C2600.f5532);
                AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
                c2077.invoke(c2159, Integer.valueOf((i2 >> 3) & 14));
                c2159.m2937(true);
                c2159.m2937(false);
            } else if (z) {
                c2159.m2952(-1976997706);
                m2193(interfaceC2962, c2077, c2159, i2 & 126);
                c2159.m2937(false);
            } else if (z2) {
                c2159.m2952(-1976846922);
                AbstractC1642.m2187(interfaceC2962, c2077, c2159, i2 & 126);
                c2159.m2937(false);
            } else {
                c2159.m2952(-1976716505);
                m2195(interfaceC2962, c2077, c2159, i2 & 126);
                c2159.m2937(false);
            }
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1651(interfaceC2962, c2077, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2195(InterfaceC2962 interfaceC2962, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c2077) ? 32 : 16;
        }
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (objM2905 == c2188) {
                objM2905 = AbstractC2202.m3035(null, C2188.f4265);
                c2159.m2946(objM2905);
            }
            InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM2905;
            Object objM29052 = c2159.m2905();
            if (objM29052 == c2188) {
                objM29052 = new C1652(interfaceC2230, 1);
                c2159.m2946(objM29052);
            }
            InterfaceC7372 interfaceC7372 = (InterfaceC7372) objM29052;
            C2923 c2923 = AbstractC1642.f2637;
            C1670 c1670M7263 = AbstractC3888.m7263(f2651, c2159, 6);
            AbstractC2202.m3046(new C1041[]{AbstractC1673.f2713.mo2988(m2191(interfaceC7372, c2159, 2)), AbstractC1673.f2714.mo2988(c1670M7263)}, AbstractC2089.m2749(1070596993, new C1212(interfaceC2962, interfaceC2230, c2077, c1670M7263, interfaceC7372, 1), c2159), c2159, 56);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1651(interfaceC2962, c2077, i, i3);
        }
    }
}
