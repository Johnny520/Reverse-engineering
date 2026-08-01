package androidx.compose.material3;

import androidx.compose.animation.core.C1143;
import androidx.compose.animation.core.C1145;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.AbstractC1930;
import androidx.compose.foundation.C1894;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1420;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.foundation.layout.C1475;
import androidx.compose.foundation.selection.AbstractC1619;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.layout.C2532;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import io.ktor.util.C5043;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p134.AbstractC8187;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2039 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1143 f3801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final float f3802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float f3803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float f3804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float f3805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f3806;

    static {
        float f = AbstractC8187.f20028;
        f3806 = f;
        f3805 = AbstractC8187.f20023;
        f3804 = AbstractC8187.f20022;
        float f2 = AbstractC8187.f20027;
        f3803 = f2;
        f3802 = (f2 - f) / 2.0f;
        f3801 = new C1143();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2593(final InterfaceC2962 interfaceC2962, final boolean z, final boolean z2, final C2043 c2043, final InterfaceC1420 interfaceC1420, final InterfaceC2404 interfaceC2404, InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        long j;
        long j2;
        C1145 c1145;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-670917213);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2939(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2939(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c2159.m2920(c2043) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c2159.m2938(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c2159.m2920(interfaceC1420) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c2159.m2920(interfaceC2404) ? 1048576 : Opcodes.ASM8;
        }
        if (c2159.m2903(i2 & 1, (599187 & i2) != 599186)) {
            long j3 = z2 ? z ? c2043.f3818 : c2043.f3814 : z ? c2043.f3829 : c2043.f3820;
            long j4 = z2 ? z ? c2043.f3819 : c2043.f3815 : z ? c2043.f3828 : c2043.f3821;
            InterfaceC2404 interfaceC2404M2592 = AbstractC2037.m2592(AbstractC8187.f20019, c2159);
            float f = AbstractC8187.f20020;
            if (z2) {
                j = j4;
                j2 = z ? c2043.f3817 : c2043.f3825;
            } else {
                j = j4;
                j2 = z ? c2043.f3826 : c2043.f3822;
            }
            InterfaceC2962 interfaceC2962M2540 = AbstractC1910.m2540(interfaceC2962.mo4426(new C1894(f, new C2406(j2), interfaceC2404M2592)), j3, interfaceC2404M2592);
            InterfaceC2493 interfaceC2493M2011 = AbstractC1484.m2011(C2952.f6617, false);
            int iM3048 = AbstractC2202.m3048(c2159);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962M2540);
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC7372 = C2600.f5530;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            InterfaceC7383 interfaceC7383 = C2600.f5526;
            AbstractC2202.m3032(c2159, interfaceC2493M2011, interfaceC7383);
            InterfaceC7383 interfaceC73832 = C2600.f5527;
            AbstractC2202.m3032(c2159, c2088M2941, interfaceC73832);
            InterfaceC7383 interfaceC73833 = C2600.f5533;
            if (c2159.f4183 || !AbstractC5227.m9466(c2159.m2905(), Integer.valueOf(iM3048))) {
                c2159.m2946(Integer.valueOf(iM3048));
                c2159.m2924(Integer.valueOf(iM3048), interfaceC73833);
            }
            InterfaceC7383 interfaceC73834 = C2600.f5528;
            AbstractC2202.m3032(c2159, interfaceC2962M4421, interfaceC73834);
            InterfaceC2962 interfaceC2962M2010 = C1475.m2010(C2952.f6610);
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastSpatial;
            C1982 c1982 = (C1982) c2159.m2943(AbstractC1996.f3666);
            switch (AbstractC1981.f3630[motionSchemeKeyTokens.ordinal()]) {
                case 1:
                    c1982.getClass();
                    c1145 = C1982.f3635;
                    c1145.getClass();
                    break;
                case 2:
                    c1982.getClass();
                    c1145 = C1982.f3634;
                    c1145.getClass();
                    break;
                case 3:
                    c1982.getClass();
                    c1145 = C1982.f3633;
                    c1145.getClass();
                    break;
                case 4:
                    c1982.getClass();
                    c1145 = C1982.f3632;
                    c1145.getClass();
                    break;
                case 5:
                    c1982.getClass();
                    c1145 = C1982.f3631;
                    c1145.getClass();
                    break;
                case 6:
                    c1982.getClass();
                    c1145 = C1982.f3637;
                    c1145.getClass();
                    break;
                default:
                    C5043.m9170();
                    return;
            }
            InterfaceC2962 interfaceC2962M25402 = AbstractC1910.m2540(AbstractC1930.m2564(interfaceC2962M2010.mo4426(new C2007(interfaceC1420, z, c1145)), interfaceC1420, AbstractC1977.m2578(AbstractC8187.f20026 / 2.0f, 4)), j, interfaceC2404);
            InterfaceC2493 interfaceC2493M20112 = AbstractC1484.m2011(C2952.f6609, false);
            int iM30482 = AbstractC2202.m3048(c2159);
            C2088 c2088M29412 = c2159.m2941();
            InterfaceC2962 interfaceC2962M44212 = AbstractC2953.m4421(c2159, interfaceC2962M25402);
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, interfaceC2493M20112, interfaceC7383);
            AbstractC2202.m3032(c2159, c2088M29412, interfaceC73832);
            if (c2159.f4183 || !AbstractC5227.m9466(c2159.m2905(), Integer.valueOf(iM30482))) {
                c2159.m2946(Integer.valueOf(iM30482));
                c2159.m2924(Integer.valueOf(iM30482), interfaceC73833);
            }
            AbstractC2202.m3032(c2159, interfaceC2962M44212, interfaceC73834);
            c2159.m2952(1236071411);
            c2159.m2937(false);
            c2159.m2937(true);
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.material3.飘花落叶言子苏兰世楪哲
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2039.m2593(interfaceC2962, z, z2, c2043, interfaceC1420, interfaceC2404, (InterfaceC2208) obj, AbstractC2202.m3031(i | 1));
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2594(final boolean z, final InterfaceC7387 interfaceC7387, InterfaceC2962 interfaceC2962, boolean z2, final C2043 c2043, InterfaceC2208 interfaceC2208, final int i) {
        final InterfaceC2962 interfaceC29622;
        final boolean z3;
        boolean z4;
        InterfaceC2962 interfaceC29623;
        boolean z5;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-263339167);
        int i2 = i | (c2159.m2939(z) ? 4 : 2) | (c2159.m2938(interfaceC7387) ? 32 : 16) | 28032 | (c2159.m2920(c2043) ? 131072 : 65536) | 1572864;
        if (c2159.m2903(i2 & 1, (599187 & i2) != 599186)) {
            c2159.m2901();
            int i3 = i & 1;
            InterfaceC2962 interfaceC2962M2140 = C2958.f6621;
            if (i3 == 0 || c2159.m2913()) {
                z4 = true;
                interfaceC29623 = interfaceC2962M2140;
            } else {
                c2159.m2899();
                interfaceC29623 = interfaceC2962;
                z4 = z2;
            }
            c2159.m2934();
            c2159.m2952(1768604058);
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = new C1414();
                c2159.m2946(objM2905);
            }
            InterfaceC1421 interfaceC1421 = (InterfaceC1421) objM2905;
            c2159.m2937(false);
            if (interfaceC7387 != null) {
                C2532 c2532 = AbstractC1986.f3657;
                boolean z6 = z4;
                interfaceC2962M2140 = AbstractC1619.m2140(C1995.f3665, z, interfaceC1421, z6, new C2789(2), interfaceC7387);
                z5 = z6;
            } else {
                z5 = z4;
            }
            m2593(AbstractC1460.m1941(AbstractC1460.m1947(interfaceC29623.mo4426(interfaceC2962M2140)), f3804, f3803), z, z5, c2043, interfaceC1421, AbstractC2037.m2592(AbstractC8187.f20025, c2159), c2159, ((i2 << 3) & 112) | 384 | ((i2 >> 6) & 7168) | 24576);
            z3 = z5;
            interfaceC29622 = interfaceC29623;
        } else {
            c2159.m2899();
            interfaceC29622 = interfaceC2962;
            z3 = z2;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(z, interfaceC7387, interfaceC29622, z3, c2043, i) { // from class: androidx.compose.material3.飘花落叶言子苏兰楪哲世

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ C2043 f3830;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ boolean f3831;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7387 f3832;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2962 f3833;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ boolean f3834;

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(1);
                    AbstractC2039.m2594(this.f3834, this.f3832, this.f3833, this.f3831, this.f3830, (InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }
}
