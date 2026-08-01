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
import kotlin.C5176;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p118.AbstractC7354;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0341 f3284 = AbstractC7354.f19581;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2019(InterfaceC1504 interfaceC1504, float f, float f2, long j, C1509 c1509) {
        float f3 = c1509.f4294 / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1504.mo2705() >> 32)) - (2.0f * f3);
        interfaceC1504.mo2707(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), c1509);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2020(final InterfaceC2129 interfaceC2129, final long j, final float f, long j2, int i, float f2, InterfaceC1373 interfaceC1373, final int i2) {
        final long j3;
        final int i3;
        final float f3;
        long j4;
        int i4;
        final float f4;
        int i5;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(333154241);
        int i6 = i2 | (c1324.m2360(interfaceC2129) ? 4 : 2) | (c1324.m2361(j) ? 32 : 16) | 222208;
        if (c1324.m2343(i6 & 1, (74899 & i6) != 74898)) {
            c1324.m2341();
            if ((i2 & 1) == 0 || c1324.m2353()) {
                j4 = C1599.f4698;
                i4 = i6 & (-7169);
                f4 = 4.0f;
                i5 = 1;
            } else {
                c1324.m2339();
                i4 = i6 & (-7169);
                j4 = j2;
                i5 = i;
                f4 = f2;
            }
            c1324.m2374();
            final C1509 c1509 = new C1509(((InterfaceC7896) c1324.m2383(AbstractC1902.f5588)).mo1344(f), 0.0f, i5, 0, null, 26);
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (objM2345 == c1353) {
                objM2345 = new C0315();
                c1324.m2386(objM2345);
            }
            C0315 c0315 = (C0315) objM2345;
            c0315.m939(c1324, 0);
            final long j5 = j4;
            final C0316 c0316M1027 = AbstractC0330.m1027(c0315, 0.0f, 1080.0f, AbstractC0330.m1019(AbstractC0330.m1013(6000, 2, AbstractC0336.f1141), null, 0L, 6), c1324);
            C0995 c0995 = new C0995(8);
            C0312 c0312 = new C0312();
            c0995.invoke(c0312);
            final C0316 c0316M10272 = AbstractC0330.m1027(c0315, 0.0f, 360.0f, AbstractC0330.m1019(new C0303(c0312), null, 0L, 6), c1324);
            C0312 c03122 = new C0312();
            c03122.f1050 = 6000;
            c03122.m938(Float.valueOf(0.87f), 3000).f1051 = f3284;
            c03122.m938(Float.valueOf(0.1f), 6000);
            final C0316 c0316M10273 = AbstractC0330.m1027(c0315, 0.1f, 0.87f, AbstractC0330.m1019(new C0303(c03122), null, 0L, 6), c1324);
            InterfaceC2129 interfaceC2129M1379 = AbstractC0619.m1379(AbstractC1948.m3649(interfaceC2129, true, new C1077(4)), 40.0f);
            boolean zM2360 = c1324.m2360(c0316M10273) | c1324.m2360(c0316M1027) | c1324.m2360(c0316M10272) | c1324.m2361(j5) | c1324.m2378(c1509) | ((((i4 & 112) ^ 48) > 32 && c1324.m2361(j)) || (i4 & 48) == 32);
            Object objM23452 = c1324.m2345();
            if (zM2360 || objM23452 == c1353) {
                final int i7 = i5;
                InterfaceC6558 interfaceC6558 = new InterfaceC6558() { // from class: androidx.compose.material3.飘花落叶言子世哲苏楪兰
                    @Override // p052.InterfaceC6558
                    public final Object invoke(Object obj) {
                        long j6 = j5;
                        C1509 c15092 = c1509;
                        long j7 = j;
                        InterfaceC1504 interfaceC1504 = (InterfaceC1504) obj;
                        float fFloatValue = ((Number) c0316M10273.getValue()).floatValue() * 360.0f;
                        int i8 = i7;
                        float f5 = f4;
                        if (i8 != 0 && Float.intBitsToFloat((int) (interfaceC1504.mo2705() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC1504.mo2705() >> 32))) {
                            f5 += f;
                        }
                        float fMo1332 = (f5 / ((float) (((double) interfaceC1504.mo1332(Float.intBitsToFloat((int) (interfaceC1504.mo2705() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) c0316M10272.getValue()).floatValue() + ((Number) c0316M1027.getValue()).floatValue();
                        long jMo2708 = interfaceC1504.mo2708();
                        C0108 c0108Mo2706 = interfaceC1504.mo2706();
                        long jM368 = c0108Mo2706.m368();
                        c0108Mo2706.m386().mo2677();
                        try {
                            ((C0113) c0108Mo2706.f319).m434(fFloatValue2, jMo2708);
                            AbstractC1144.m2019(interfaceC1504, Math.min(fFloatValue, fMo1332) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo1332) * 2.0f), j6, c15092);
                            AbstractC1144.m2019(interfaceC1504, 0.0f, fFloatValue, j7, c15092);
                            c0108Mo2706.m386().mo2689();
                            c0108Mo2706.m361(jM368);
                            return C5176.f14739;
                        } catch (Throwable th) {
                            c0108Mo2706.m386().mo2689();
                            c0108Mo2706.m361(jM368);
                            throw th;
                        }
                    }
                };
                c1324.m2386(interfaceC6558);
                objM23452 = interfaceC6558;
            }
            AbstractC1072.m1984(interfaceC2129M1379, (InterfaceC6558) objM23452, c1324, 0);
            f3 = f4;
            j3 = j5;
            i3 = i5;
        } else {
            c1324.m2339();
            j3 = j2;
            i3 = i;
            f3 = f2;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554(j, f, j3, i3, f3, i2) { // from class: androidx.compose.material3.飘花落叶言子世哲苏兰楪

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ int f3293;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ long f3294;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ float f3295;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ long f3296;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ float f3297;

                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2471 = AbstractC1367.m2471(385);
                    AbstractC1144.m2020(this.f3298, this.f3296, this.f3297, this.f3294, this.f3293, this.f3295, (InterfaceC1373) obj, iM2471);
                    return C5176.f14739;
                }
            };
        }
    }
}
