package androidx.compose.foundation.text;

import androidx.activity.C0863;
import androidx.activity.compose.C0851;
import androidx.collection.C1123;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2837;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p210.C8661;
import p267.AbstractC9004;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1828 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f3232 = 0;

    static {
        AbstractC9004.m14193(40.0f, 40.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2473(final String str, final InterfaceC7387 interfaceC7387, final InterfaceC2962 interfaceC2962, boolean z, final C2865 c2865, C1778 c1778, C1779 c1779, final boolean z2, int i, int i2, C1123 c1123, InterfaceC7387 interfaceC73872, AbstractC2433 abstractC2433, InterfaceC7380 interfaceC7380, InterfaceC2208 interfaceC2208, final int i3) {
        C2159 c2159;
        final boolean z3;
        final C1778 c17782;
        final C1779 c17792;
        final int i4;
        final int i5;
        final C1123 c11232;
        final InterfaceC7387 interfaceC73873;
        final AbstractC2433 abstractC24332;
        final InterfaceC7380 interfaceC73802;
        int i6;
        AbstractC2433 c2406;
        InterfaceC7380 interfaceC73803;
        C1779 c17793;
        int i7;
        InterfaceC7387 interfaceC73874;
        C1778 c17783;
        C1123 c11233;
        boolean z4;
        int i8;
        C1123 c11234;
        int i9;
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2951(2026950908);
        int i10 = i3 | (c21592.m2920(str) ? 4 : 2) | (c21592.m2938(interfaceC7387) ? 32 : 16) | (c21592.m2920(interfaceC2962) ? 256 : 128) | 27648 | (c21592.m2920(c2865) ? 131072 : 65536) | 282591232;
        if (c21592.m2903(i10 & 1, (306783379 & i10) != 306783378)) {
            c21592.m2901();
            int i11 = i3 & 1;
            C2188 c2188 = C2204.f4319;
            if (i11 == 0 || c21592.m2913()) {
                int i12 = z2 ? 1 : Integer.MAX_VALUE;
                i6 = i10 & (-1879048193);
                Object objM2905 = c21592.m2905();
                if (objM2905 == c2188) {
                    objM2905 = new C0863(27);
                    c21592.m2946(objM2905);
                }
                c2406 = new C2406(C2434.f5041);
                C2077 c2077 = AbstractC1821.f3200;
                C1778 c17784 = C1778.f3004;
                interfaceC73803 = c2077;
                c17793 = C1779.f3005;
                i7 = i12;
                interfaceC73874 = (InterfaceC7387) objM2905;
                c17783 = c17784;
                c11233 = C2837.f6253;
                z4 = true;
                i8 = 1;
            } else {
                c21592.m2899();
                i6 = i10 & (-1879048193);
                z4 = z;
                c17783 = c1778;
                c17793 = c1779;
                i7 = i;
                i8 = i2;
                c11233 = c1123;
                interfaceC73874 = interfaceC73872;
                c2406 = abstractC2433;
                interfaceC73803 = interfaceC7380;
            }
            c21592.m2934();
            Object objM29052 = c21592.m2905();
            if (objM29052 == c2188) {
                c11234 = c11233;
                objM29052 = AbstractC2202.m3034(new C2847(6, 0L, str));
                c21592.m2946(objM29052);
            } else {
                c11234 = c11233;
            }
            InterfaceC2230 interfaceC2230 = (InterfaceC2230) objM29052;
            C2847 c2847 = (C2847) interfaceC2230.getValue();
            C2847 c28472 = new C2847(new C2902(str), c2847.f6291, c2847.f6290);
            boolean zM2920 = c21592.m2920(c28472);
            Object objM29053 = c21592.m2905();
            if (zM2920 || objM29053 == c2188) {
                i9 = 4;
                objM29053 = new C0851(c28472, 4, interfaceC2230);
                c21592.m2946(objM29053);
            } else {
                i9 = 4;
            }
            AbstractC2202.m3062((InterfaceC7372) objM29053, c21592);
            boolean z5 = (i6 & 14) == i9;
            Object objM29054 = c21592.m2905();
            if (z5 || objM29054 == c2188) {
                objM29054 = AbstractC2202.m3034(str);
                c21592.m2946(objM29054);
            }
            InterfaceC2230 interfaceC22302 = (InterfaceC2230) objM29054;
            c17783.getClass();
            C2859 c2859 = new C2859(z2, 0, true, 1, 1, C8661.f21717);
            boolean z6 = !z2;
            int i13 = z2 ? 1 : i8;
            int i14 = z2 ? 1 : i7;
            int i15 = i13;
            boolean zM29202 = c21592.m2920(interfaceC22302) | ((i6 & 112) == 32);
            Object objM29055 = c21592.m2905();
            if (zM29202 || objM29055 == c2188) {
                objM29055 = new C1597(interfaceC7387, interfaceC2230, interfaceC22302);
                c21592.m2946(objM29055);
            }
            c2159 = c21592;
            AbstractC2433 abstractC24333 = c2406;
            C1123 c11235 = c11234;
            AbstractC1821.m2451(c28472, (InterfaceC7387) objM29055, interfaceC2962, c2865, c11235, interfaceC73874, abstractC24333, z6, i14, i15, c2859, c17793, z4, interfaceC73803, c2159, (i6 & 896) | ((i6 >> 6) & 7168) | 14376960, 224640);
            c11232 = c11235;
            interfaceC73873 = interfaceC73874;
            abstractC24332 = abstractC24333;
            c17792 = c17793;
            z3 = z4;
            interfaceC73802 = interfaceC73803;
            c17782 = c17783;
            i4 = i7;
            i5 = i8;
        } else {
            c2159 = c21592;
            c2159.m2899();
            z3 = z;
            c17782 = c1778;
            c17792 = c1779;
            i4 = i;
            i5 = i2;
            c11232 = c1123;
            interfaceC73873 = interfaceC73872;
            abstractC24332 = abstractC2433;
            interfaceC73802 = interfaceC7380;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(str, interfaceC7387, interfaceC2962, z3, c2865, c17782, c17792, z2, i4, i5, c11232, interfaceC73873, abstractC24332, interfaceC73802, i3) { // from class: androidx.compose.foundation.text.飘花落叶言子楪苏世兰哲

                /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7380 f3204;

                /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
                public final /* synthetic */ AbstractC2433 f3205;

                /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7387 f3206;

                /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
                public final /* synthetic */ C1123 f3207;

                /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
                public final /* synthetic */ int f3208;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ C2865 f3209;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ boolean f3210;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
                public final /* synthetic */ boolean f3211;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
                public final /* synthetic */ int f3212;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ C1778 f3213;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
                public final /* synthetic */ C1779 f3214;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC7387 f3215;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2962 f3216;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
                public final /* synthetic */ String f3217;

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(100663297);
                    AbstractC1828.m2473(this.f3217, this.f3215, this.f3216, this.f3210, this.f3209, this.f3213, this.f3214, this.f3211, this.f3212, this.f3208, this.f3207, this.f3206, this.f3205, this.f3204, (InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }
}
