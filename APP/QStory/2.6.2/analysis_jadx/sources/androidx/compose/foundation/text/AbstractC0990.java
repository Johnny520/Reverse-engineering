package androidx.compose.foundation.text;

import androidx.activity.C0016;
import androidx.activity.compose.C0004;
import androidx.collection.C0276;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2003;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2025;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p194.C7831;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0990 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f2886 = 0;

    static {
        AbstractC6560.m12023(40.0f, 40.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1903(final String str, final InterfaceC6557 interfaceC6557, final InterfaceC2129 interfaceC2129, boolean z, final C2031 c2031, C0940 c0940, C0941 c0941, final boolean z2, int i, int i2, C0276 c0276, InterfaceC6557 interfaceC65572, AbstractC1598 abstractC1598, InterfaceC6550 interfaceC6550, InterfaceC1373 interfaceC1373, final int i3) {
        C1324 c1324;
        final boolean z3;
        final C0940 c09402;
        final C0941 c09412;
        final int i4;
        final int i5;
        final C0276 c02762;
        final InterfaceC6557 interfaceC65573;
        final AbstractC1598 abstractC15982;
        final InterfaceC6550 interfaceC65502;
        int i6;
        AbstractC1598 c1571;
        InterfaceC6550 interfaceC65503;
        C0941 c09413;
        int i7;
        InterfaceC6557 interfaceC65574;
        C0940 c09403;
        C0276 c02763;
        boolean z4;
        int i8;
        C0276 c02764;
        int i9;
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2381(2026950908);
        int i10 = i3 | (c13242.m2350(str) ? 4 : 2) | (c13242.m2368(interfaceC6557) ? 32 : 16) | (c13242.m2350(interfaceC2129) ? 256 : 128) | 27648 | (c13242.m2350(c2031) ? 131072 : 65536) | 282591232;
        if (c13242.m2333(i10 & 1, (306783379 & i10) != 306783378)) {
            c13242.m2331();
            int i11 = i3 & 1;
            C1353 c1353 = C1369.f3973;
            if (i11 == 0 || c13242.m2343()) {
                int i12 = z2 ? 1 : Integer.MAX_VALUE;
                i6 = i10 & (-1879048193);
                Object objM2335 = c13242.m2335();
                if (objM2335 == c1353) {
                    objM2335 = new C0016(27);
                    c13242.m2376(objM2335);
                }
                c1571 = new C1571(C1599.f4695);
                C1242 c1242 = AbstractC0983.f2854;
                C0940 c09404 = C0940.f2658;
                interfaceC65503 = c1242;
                c09413 = C0941.f2659;
                i7 = i12;
                interfaceC65574 = (InterfaceC6557) objM2335;
                c09403 = c09404;
                c02763 = C2003.f5907;
                z4 = true;
                i8 = 1;
            } else {
                c13242.m2329();
                i6 = i10 & (-1879048193);
                z4 = z;
                c09403 = c0940;
                c09413 = c0941;
                i7 = i;
                i8 = i2;
                c02763 = c0276;
                interfaceC65574 = interfaceC65572;
                c1571 = abstractC1598;
                interfaceC65503 = interfaceC6550;
            }
            c13242.m2364();
            Object objM23352 = c13242.m2335();
            if (objM23352 == c1353) {
                c02764 = c02763;
                objM23352 = AbstractC1367.m2465(new C2013(6, 0L, str));
                c13242.m2376(objM23352);
            } else {
                c02764 = c02763;
            }
            InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM23352;
            C2013 c2013 = (C2013) interfaceC1395.getValue();
            C2013 c20132 = new C2013(new C2068(str), c2013.f5945, c2013.f5944);
            boolean zM2350 = c13242.m2350(c20132);
            Object objM23353 = c13242.m2335();
            if (zM2350 || objM23353 == c1353) {
                i9 = 4;
                objM23353 = new C0004(c20132, 4, interfaceC1395);
                c13242.m2376(objM23353);
            } else {
                i9 = 4;
            }
            AbstractC1367.m2492((InterfaceC6542) objM23353, c13242);
            boolean z5 = (i6 & 14) == i9;
            Object objM23354 = c13242.m2335();
            if (z5 || objM23354 == c1353) {
                objM23354 = AbstractC1367.m2465(str);
                c13242.m2376(objM23354);
            }
            InterfaceC1395 interfaceC13952 = (InterfaceC1395) objM23354;
            c09403.getClass();
            C2025 c2025 = new C2025(z2, 0, true, 1, 1, C7831.f21375);
            boolean z6 = !z2;
            int i13 = z2 ? 1 : i8;
            int i14 = z2 ? 1 : i7;
            int i15 = i13;
            boolean zM23502 = c13242.m2350(interfaceC13952) | ((i6 & 112) == 32);
            Object objM23355 = c13242.m2335();
            if (zM23502 || objM23355 == c1353) {
                objM23355 = new C0756(interfaceC6557, interfaceC1395, interfaceC13952);
                c13242.m2376(objM23355);
            }
            c1324 = c13242;
            AbstractC1598 abstractC15983 = c1571;
            C0276 c02765 = c02764;
            AbstractC0983.m1881(c20132, (InterfaceC6557) objM23355, interfaceC2129, c2031, c02765, interfaceC65574, abstractC15983, z6, i14, i15, c2025, c09413, z4, interfaceC65503, c1324, (i6 & 896) | ((i6 >> 6) & 7168) | 14376960, 224640);
            c02762 = c02765;
            interfaceC65573 = interfaceC65574;
            abstractC15982 = abstractC15983;
            c09412 = c09413;
            z3 = z4;
            interfaceC65502 = interfaceC65503;
            c09402 = c09403;
            i4 = i7;
            i5 = i8;
        } else {
            c1324 = c13242;
            c1324.m2329();
            z3 = z;
            c09402 = c0940;
            c09412 = c0941;
            i4 = i;
            i5 = i2;
            c02762 = c0276;
            interfaceC65573 = interfaceC65572;
            abstractC15982 = abstractC1598;
            interfaceC65502 = interfaceC6550;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(str, interfaceC6557, interfaceC2129, z3, c2031, c09402, c09412, z2, i4, i5, c02762, interfaceC65573, abstractC15982, interfaceC65502, i3) { // from class: androidx.compose.foundation.text.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6550 f2858;

                /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ AbstractC1598 f2859;

                /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6557 f2860;

                /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ C0276 f2861;

                /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
                public final /* synthetic */ int f2862;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ C2031 f2863;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ boolean f2864;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
                public final /* synthetic */ boolean f2865;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
                public final /* synthetic */ int f2866;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ C0940 f2867;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
                public final /* synthetic */ C0941 f2868;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6557 f2869;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2129 f2870;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ String f2871;

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(100663297);
                    AbstractC0990.m1903(this.f2871, this.f2869, this.f2870, this.f2864, this.f2863, this.f2867, this.f2868, this.f2865, this.f2866, this.f2862, this.f2861, this.f2860, this.f2859, this.f2858, (InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }
}
