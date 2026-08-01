package androidx.compose.material3;

import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1484;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.draw.AbstractC2280;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.graphics.vector.AbstractC2382;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.p001ui.layout.C2539;
import androidx.compose.p001ui.platform.AbstractC2744;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import p128.C8155;
import p134.AbstractC8188;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1988 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC2962 f3658 = AbstractC1460.m1939(C2958.f6621, AbstractC8188.f20036);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2581(C2378 c2378, InterfaceC2962 interfaceC2962, long j, InterfaceC2208 interfaceC2208, int i, int i2) {
        int i3;
        long j2;
        InterfaceC2962 interfaceC29622;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-126890956);
        int i4 = (c2159.m2920(c2378) ? 4 : 2) | i;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (c2159.m2920(interfaceC2962) ? 256 : 128);
        }
        int i6 = i3 | (((i2 & 8) == 0 && c2159.m2921(j)) ? 2048 : 1024);
        if (c2159.m2903(i6 & 1, (i6 & 1171) != 1170)) {
            c2159.m2901();
            if ((i & 1) == 0 || c2159.m2913()) {
                if (i5 != 0) {
                    interfaceC2962 = C2958.f6621;
                }
                if ((i2 & 8) != 0) {
                    j = ((C2434) c2159.m2943(AbstractC2030.f3794)).f5045;
                    i6 &= -7169;
                }
                InterfaceC2962 interfaceC29623 = interfaceC2962;
                long j3 = j;
                c2159.m2934();
                m2582(AbstractC2382.m3394(c2378, c2159), interfaceC29623, j3, c2159, (i6 & 896) | 56 | (i6 & 7168));
                interfaceC29622 = interfaceC29623;
                j2 = j3;
            } else {
                c2159.m2899();
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
                InterfaceC2962 interfaceC296232 = interfaceC2962;
                long j32 = j;
                c2159.m2934();
                m2582(AbstractC2382.m3394(c2378, c2159), interfaceC296232, j32, c2159, (i6 & 896) | 56 | (i6 & 7168));
                interfaceC29622 = interfaceC296232;
                j2 = j32;
            }
        } else {
            c2159.m2899();
            j2 = j;
            interfaceC29622 = interfaceC2962;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1989(c2378, interfaceC29622, j2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2582(AbstractC2363 abstractC2363, InterfaceC2962 interfaceC2962, long j, InterfaceC2208 interfaceC2208, int i) {
        AbstractC2363 abstractC23632;
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-2142239481);
        if ((i & 6) == 0) {
            abstractC23632 = abstractC2363;
            i2 = (c2159.m2938(abstractC23632) ? 4 : 2) | i;
        } else {
            abstractC23632 = abstractC2363;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2920(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2920(interfaceC2962) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c2159.m2921(j) ? 2048 : 1024;
        }
        boolean z = true;
        if (c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
            c2159.m2901();
            if ((i & 1) != 0 && !c2159.m2913()) {
                c2159.m2899();
            }
            c2159.m2934();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !c2159.m2921(j)) && (i2 & 3072) != 2048) {
                z = false;
            }
            Object objM2905 = c2159.m2905();
            if (z || objM2905 == C2204.f4319) {
                C2442 c2442 = C2434.m3509(j, C2434.f5042) ? null : new C2442(j, 5);
                c2159.m2946(c2442);
                objM2905 = c2442;
            }
            C2442 c24422 = (C2442) objM2905;
            c2159.m2952(-536832197);
            c2159.m2937(false);
            int i3 = AbstractC2744.f5973;
            boolean zM13074 = C8155.m13074(abstractC23632.mo3368(), 9205357640488583168L);
            C2958 c2958 = C2958.f6621;
            if (!zM13074) {
                long jMo3368 = abstractC23632.mo3368();
                InterfaceC2962 interfaceC29622 = (Float.isInfinite(Float.intBitsToFloat((int) (jMo3368 >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jMo3368 & 4294967295L)))) ? f3658 : c2958;
                AbstractC1484.m2014(AbstractC2280.m3142(interfaceC2962.mo4426(interfaceC29622), abstractC23632, null, C2539.f5320, 0.0f, c24422, 22).mo4426(c2958), c2159, 0);
            }
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1989(abstractC2363, interfaceC2962, j, i);
        }
    }
}
