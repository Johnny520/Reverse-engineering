package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends AbstractC0708su {

    /* JADX INFO: renamed from: d */
    public static final float[] f3136d;

    /* JADX INFO: renamed from: e */
    public static final float[] f3137e;

    /* JADX INFO: renamed from: f */
    public static final float[] f3138f;

    /* JADX INFO: renamed from: g */
    public static final float[] f3139g;

    static {
        float[] fArrM4672Q = s11.m4672Q(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, s11.m4726y(C0337j5.f4892c.f4894b, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f3136d = fArrM4672Q;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f3137e = fArr;
        f3138f = s11.m4669N(fArrM4672Q);
        f3139g = s11.m4669N(fArr);
    }

    @Override // p000.AbstractC0708su
    /* JADX INFO: renamed from: a */
    public final float mo1719a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p000.AbstractC0708su
    /* JADX INFO: renamed from: b */
    public final float mo1720b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // p000.AbstractC0708su
    /* JADX INFO: renamed from: d */
    public final long mo1721d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f3139g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f3138f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    @Override // p000.AbstractC0708su
    /* JADX INFO: renamed from: e */
    public final float mo1722e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = f3139g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = f3138f;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    @Override // p000.AbstractC0708su
    /* JADX INFO: renamed from: f */
    public final long mo1723f(float f, float f2, float f3, float f4, AbstractC0708su abstractC0708su) {
        float[] fArr = f3136d;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fM4486v = rg3.m4486v(f5);
        float fM4486v2 = rg3.m4486v(f6);
        float fM4486v3 = rg3.m4486v(f7);
        float[] fArr2 = f3137e;
        return sp0.m4928a((fArr2[6] * fM4486v3) + (fArr2[3] * fM4486v2) + (fArr2[0] * fM4486v), (fArr2[7] * fM4486v3) + (fArr2[4] * fM4486v2) + (fArr2[1] * fM4486v), (fArr2[8] * fM4486v3) + (fArr2[5] * fM4486v2) + (fArr2[2] * fM4486v), f4, abstractC0708su);
    }
}
