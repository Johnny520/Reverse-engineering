package p089g1;

import p071f1.AbstractC0996c0;
import p080fb.AbstractC1184v0;

/* JADX INFO: renamed from: g1.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1284m extends AbstractC1274c {

    /* JADX INFO: renamed from: d */
    public static final float[] f4275d;

    /* JADX INFO: renamed from: e */
    public static final float[] f4276e;

    /* JADX INFO: renamed from: f */
    public static final float[] f4277f;

    /* JADX INFO: renamed from: g */
    public static final float[] f4278g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float[] fArrM3428g = AbstractC1282k.m3428g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1282k.m3424c(C1272a.f4224b.f4225a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f4275d = fArrM3428g;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f4276e = fArr;
        f4277f = AbstractC1282k.m3427f(fArrM3428g);
        f4278g = AbstractC1282k.m3427f(fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: a */
    public final float mo3404a(int i9) {
        return i9 == 0 ? 1.0f : 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: b */
    public final float mo3405b(int i9) {
        return i9 == 0 ? 0.0f : -0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: d */
    public final long mo3407d(float f3, float f10, float f11) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f4278g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f3);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f4277f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f18) + (fArr2[4] * f17) + (fArr2[1] * f16))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f18) + ((fArr2[3] * f17) + (fArr2[0] * f16)))) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: e */
    public final float mo3408e(float f3, float f10, float f11) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f4278g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f3);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f4277f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.AbstractC1274c
    /* JADX INFO: renamed from: f */
    public final long mo3409f(float f3, float f10, float f11, float f12, AbstractC1274c abstractC1274c) {
        float[] fArr = f4275d;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        float fM3205o = AbstractC1184v0.m3205o(f13);
        float fM3205o2 = AbstractC1184v0.m3205o(f14);
        float fM3205o3 = AbstractC1184v0.m3205o(f15);
        float[] fArr2 = f4276e;
        return AbstractC0996c0.m2506b((fArr2[6] * fM3205o3) + (fArr2[3] * fM3205o2) + (fArr2[0] * fM3205o), (fArr2[7] * fM3205o3) + (fArr2[4] * fM3205o2) + (fArr2[1] * fM3205o), (fArr2[8] * fM3205o3) + (fArr2[5] * fM3205o2) + (fArr2[2] * fM3205o), f12, abstractC1274c);
    }
}
