package p148k;

import p121i3.InterfaceC3175e;
import p163l.AbstractC4278c0;
import p163l.InterfaceC4266a0;

/* JADX INFO: renamed from: k.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3889m0 {
    /* JADX INFO: renamed from: b */
    public static final void m15438b(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = 0.0f;
        int i11 = 0;
        float f20 = 0.0f;
        while (true) {
            float f21 = 1.0f;
            if (i11 >= i10) {
                fArr2[i10] = 1.0f;
                fArr[i10] = 1.0f;
                return;
            }
            float f22 = i11 / i10;
            float f23 = 1.0f;
            while (true) {
                f10 = ((f23 - f19) / 2.0f) + f19;
                f11 = f21 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f24 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                f14 = f21;
                if (Math.abs(f24 - f22) < 1.0E-5d) {
                    break;
                }
                if (f24 > f22) {
                    f23 = f10;
                } else {
                    f19 = f10;
                }
                f21 = f14;
            }
            float f25 = 0.5f;
            fArr[i11] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f26 = f14;
            while (true) {
                f15 = ((f26 - f20) / 2.0f) + f20;
                f16 = f14 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float f27 = (((f16 * f25) + f15) * f17) + f18;
                float f28 = f22;
                if (Math.abs(f27 - f22) >= 1.0E-5d) {
                    if (f27 > f28) {
                        f26 = f15;
                    } else {
                        f20 = f15;
                    }
                    f22 = f28;
                    f25 = 0.5f;
                }
            }
            fArr2[i11] = (f17 * ((f16 * 0.175f) + (f15 * 0.35000002f))) + f18;
            i11++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4266a0 m15439c(InterfaceC3175e interfaceC3175e) {
        return AbstractC4278c0.m16828d(new C3891n0(interfaceC3175e));
    }
}
