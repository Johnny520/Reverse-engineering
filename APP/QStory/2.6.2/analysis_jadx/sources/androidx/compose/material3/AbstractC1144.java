package androidx.compose.material3;

import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.AbstractC0336;
import androidx.compose.animation.core.C0303;
import androidx.compose.animation.core.C0312;
import androidx.compose.animation.core.C0315;
import androidx.compose.animation.core.C0316;
import androidx.compose.animation.core.C0341;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.C1077;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.text.C0995;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.drawscope.C1509;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.semantics.AbstractC1948;
import kotlin.C5175;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p118.AbstractC7353;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0341 f3283 = AbstractC7353.f19586;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2009(InterfaceC1504 interfaceC1504, float f, float f2, long j, C1509 c1509) {
        float f3 = c1509.f4293 / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1504.mo2695() >> 32)) - (2.0f * f3);
        interfaceC1504.mo2697(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), c1509);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2010(final InterfaceC2129 interfaceC2129, final long j, final float f, long j2, int i, float f2, InterfaceC1373 interfaceC1373, final int i2) {
        final long j3;
        final int i3;
        final float f3;
        long j4;
        int i4;
        final float f4;
        int i5;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(333154241);
        int i6 = i2 | (c1324.m2350(interfaceC2129) ? 4 : 2) | (c1324.m2351(j) ? 32 : 16) | 222208;
        if (c1324.m2333(i6 & 1, (74899 & i6) != 74898)) {
            c1324.m2331();
            if ((i2 & 1) == 0 || c1324.m2343()) {
                j4 = C1599.f4697;
                i4 = i6 & (-7169);
                f4 = 4.0f;
                i5 = 1;
            } else {
                c1324.m2329();
                i4 = i6 & (-7169);
                j4 = j2;
                i5 = i;
                f4 = f2;
            }
            c1324.m2364();
            final C1509 c1509 = new C1509(((InterfaceC7895) c1324.m2373(AbstractC1902.f5587)).mo1334(f), 0.0f, i5, 0, null, 26);
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (objM2335 == c1353) {
                objM2335 = new C0315();
                c1324.m2376(objM2335);
            }
            C0315 c0315 = (C0315) objM2335;
            c0315.m938(c1324, 0);
            final long j5 = j4;
            final C0316 c0316M1026 = AbstractC0330.m1026(c0315, 0.0f, 1080.0f, AbstractC0330.m1018(AbstractC0330.m1012(6000, 2, AbstractC0336.f1141), null, 0L, 6), c1324);
            C0995 c0995 = new C0995(8);
            C0312 c0312 = new C0312();
            c0995.invoke(c0312);
            final C0316 c0316M10262 = AbstractC0330.m1026(c0315, 0.0f, 360.0f, AbstractC0330.m1018(new C0303(c0312), null, 0L, 6), c1324);
            C0312 c03122 = new C0312();
            c03122.f1050 = 6000;
            c03122.m937(Float.valueOf(0.87f), 3000).f1051 = f3283;
            c03122.m937(Float.valueOf(0.1f), 6000);
            final C0316 c0316M10263 = AbstractC0330.m1026(c0315, 0.1f, 0.87f, AbstractC0330.m1018(new C0303(c03122), null, 0L, 6), c1324);
            InterfaceC2129 interfaceC2129M1369 = AbstractC0619.m1369(AbstractC1948.m3639(interfaceC2129, true, new C1077(4)), 40.0f);
            boolean zM2350 = c1324.m2350(c0316M10263) | c1324.m2350(c0316M1026) | c1324.m2350(c0316M10262) | c1324.m2351(j5) | c1324.m2368(c1509) | ((((i4 & 112) ^ 48) > 32 && c1324.m2351(j)) || (i4 & 48) == 32);
            Object objM23352 = c1324.m2335();
            if (zM2350 || objM23352 == c1353) {
                final int i7 = i5;
                InterfaceC6557 interfaceC6557 = new InterfaceC6557() { // from class: androidx.compose.material3.飘花落叶言子世哲苏楪兰
                    @Override // p052.InterfaceC6557
                    public final Object invoke(Object obj) {
                        long j6 = j5;
                        C1509 c15092 = c1509;
                        long j7 = j;
                        InterfaceC1504 interfaceC1504 = (InterfaceC1504) obj;
                        float fFloatValue = ((Number) c0316M10263.getValue()).floatValue() * 360.0f;
                        int i8 = i7;
                        float f5 = f4;
                        if (i8 != 0 && Float.intBitsToFloat((int) (interfaceC1504.mo2695() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC1504.mo2695() >> 32))) {
                            f5 += f;
                        }
                        float fMo1322 = (f5 / ((float) (((double) interfaceC1504.mo1322(Float.intBitsToFloat((int) (interfaceC1504.mo2695() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) c0316M10262.getValue()).floatValue() + ((Number) c0316M1026.getValue()).floatValue();
                        long jMo2698 = interfaceC1504.mo2698();
                        C0108 c0108Mo2696 = interfaceC1504.mo2696();
                        long jM367 = c0108Mo2696.m367();
                        c0108Mo2696.m385().mo2667();
                        try {
                            ((C0113) c0108Mo2696.f319).m433(fFloatValue2, jMo2698);
                            AbstractC1144.m2009(interfaceC1504, Math.min(fFloatValue, fMo1322) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo1322) * 2.0f), j6, c15092);
                            AbstractC1144.m2009(interfaceC1504, 0.0f, fFloatValue, j7, c15092);
                            c0108Mo2696.m385().mo2679();
                            c0108Mo2696.m360(jM367);
                            return C5175.f14739;
                        } catch (Throwable th) {
                            c0108Mo2696.m385().mo2679();
                            c0108Mo2696.m360(jM367);
                            throw th;
                        }
                    }
                };
                c1324.m2376(interfaceC6557);
                objM23352 = interfaceC6557;
            }
            AbstractC1072.m1974(interfaceC2129M1369, (InterfaceC6557) objM23352, c1324, 0);
            f3 = f4;
            j3 = j5;
            i3 = i5;
        } else {
            c1324.m2329();
            j3 = j2;
            i3 = i;
            f3 = f2;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(j, f, j3, i3, f3, i2) { // from class: androidx.compose.material3.飘花落叶言子世哲苏兰楪

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ int f3292;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ long f3293;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ float f3294;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ long f3295;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ float f3296;

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(385);
                    AbstractC1144.m2010(this.f3297, this.f3295, this.f3296, this.f3293, this.f3292, this.f3294, (InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }
}
