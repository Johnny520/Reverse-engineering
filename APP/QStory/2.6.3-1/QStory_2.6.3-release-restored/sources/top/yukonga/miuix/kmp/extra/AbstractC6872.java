package top.yukonga.miuix.kmp.extra;

import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.C1507;
import androidx.compose.foundation.layout.InterfaceC1500;
import androidx.compose.foundation.lazy.C1605;
import androidx.compose.foundation.text.C1822;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.vector.AbstractC2374;
import androidx.compose.p001ui.graphics.vector.AbstractC2382;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.p001ui.graphics.vector.C2379;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.p001ui.layout.C2539;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import com.android.p002dx.p005io.Opcodes;
import kotlin.collections.EmptyList;
import p050.AbstractC7173;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p360.AbstractC9653;
import p360.C9654;
import top.suzhelan.qstory.p015ui.components.C6807;
import top.yukonga.miuix.kmp.basic.AbstractC6844;
import top.yukonga.miuix.kmp.basic.AbstractC6862;
import top.yukonga.miuix.kmp.basic.C6845;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2077 f16868 = new C2077(-265524605, false, new C1822(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11963(InterfaceC1500 interfaceC1500, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-977806500);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC1500) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2939(true) ? 32 : 16;
        }
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            C2169 c2169 = AbstractC9653.f25177;
            long j = ((C2434) ((AbstractC2182) ((C9654) c2159.m2943(c2169)).f25189).getValue()).f5045;
            long j2 = ((C2434) ((AbstractC2182) ((C9654) c2159.m2943(c2169)).f25210).getValue()).f5045;
            boolean zM2921 = c2159.m2921(j) | c2159.m2921(j2);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (zM2921 || objM2905 == c2188) {
                objM2905 = new C6871(j, j2);
                c2159.m2946(objM2905);
            }
            C6871 c6871 = (C6871) objM2905;
            boolean zM2920 = c2159.m2920(c6871) | ((i2 & 112) == 32);
            Object objM29052 = c2159.m2905();
            if (zM2920 || objM29052 == c2188) {
                C2442 c2442 = new C2442(c6871.f16867, 5);
                c2159.m2946(c2442);
                objM29052 = c2442;
            }
            C2442 c24422 = (C2442) objM29052;
            LayoutDirection layoutDirection = (LayoutDirection) c2159.m2943(AbstractC2737.f5927);
            InterfaceC2962 interfaceC2962M1946 = AbstractC1460.m1946(C2958.f6621, 10.0f, 16.0f);
            boolean zM2922 = c2159.m2922(layoutDirection.ordinal());
            Object objM29053 = c2159.m2905();
            if (zM2922 || objM29053 == c2188) {
                objM29053 = new C6874(layoutDirection, 2);
                c2159.m2946(objM29053);
            }
            InterfaceC2962 interfaceC2962Mo1927 = interfaceC1500.mo1927(AbstractC2416.m3455(interfaceC2962M1946, (InterfaceC7387) objM29053));
            C2378 c2378M3383 = AbstractC7173.f17822;
            if (c2378M3383 == null) {
                C2379 c2379 = new C2379("ArrowRight", 10.0f, 16.0f, 10.0f, 16.0f, 0L, 0, false, Opcodes.SHL_INT_LIT8);
                C2406 c2406 = new C2406(C2434.f5041);
                EmptyList emptyList = AbstractC2374.f4814;
                C2397 c2397 = new C2397(0, false);
                c2397.m3403(1.65f, 1.469f);
                c2397.m3396(1.929f, 1.19f, 2.381f, 1.19f, 2.66f, 1.469f);
                c2397.m3407(8.721f, 7.53f);
                c2397.m3396(9.0f, 7.809f, 9.0f, 8.261f, 8.721f, 8.54f);
                c2397.m3407(2.66f, 14.601f);
                c2397.m3396(2.381f, 14.88f, 1.929f, 14.88f, 1.65f, 14.601f);
                c2397.m3396(1.371f, 14.322f, 1.371f, 13.87f, 1.65f, 13.591f);
                c2397.m3407(7.205f, 8.035f);
                c2397.m3407(1.65f, 2.479f);
                c2397.m3396(1.371f, 2.2f, 1.371f, 1.748f, 1.65f, 1.469f);
                c2397.m3397();
                C2379.m3382(c2379, c2397.f4945, 1, c2406, 0.0f, 0, 4.0f);
                c2378M3383 = c2379.m3383();
                AbstractC7173.f17822 = c2378M3383;
            }
            AbstractC1910.m2543(AbstractC2382.m3394(c2378M3383, c2159), interfaceC2962Mo1927, C2952.f6609, C2539.f5320, 1.0f, c24422, c2159, 56, 0);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1605(interfaceC1500, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11964(String str, InterfaceC7372 interfaceC7372, C2159 c2159, int i) {
        C1507 c1507 = AbstractC6844.f16780;
        C2169 c2169 = AbstractC9653.f25177;
        long j = ((C2434) ((AbstractC2182) ((C9654) c2159.m2943(c2169)).f25200).getValue()).f5045;
        long j2 = ((C2434) ((AbstractC2182) ((C9654) c2159.m2943(c2169)).f25210).getValue()).f5045;
        boolean zM2921 = c2159.m2921(j) | c2159.m2921(j2);
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (zM2921 || objM2905 == c2188) {
            objM2905 = new C6845(j, j2);
            c2159.m2946(objM2905);
        }
        C6845 c6845 = (C6845) objM2905;
        long j3 = ((C2434) ((AbstractC2182) ((C9654) c2159.m2943(c2169)).f25186).getValue()).f5045;
        long j4 = ((C2434) ((AbstractC2182) ((C9654) c2159.m2943(c2169)).f25210).getValue()).f5045;
        boolean zM29212 = c2159.m2921(j3) | c2159.m2921(j4);
        Object objM29052 = c2159.m2905();
        if (zM29212 || objM29052 == c2188) {
            objM29052 = new C6845(j3, j4);
            c2159.m2946(objM29052);
        }
        C1507 c15072 = AbstractC6844.f16780;
        AbstractC6862.m11946(C2958.f6621, AbstractC2089.m2749(564428325, new C1822(7), c2159), c15072, interfaceC7372, AbstractC2089.m2749(-682683637, new C6807(str, c6845, (C6845) objM29052), c2159), c2159, 805306752 | ((((1879048192 & i) | 1572912) >> 12) & net.bytebuddy.jar.asm.Opcodes.ASM7));
    }
}
