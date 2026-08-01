package p217p0;

import p179i4.AbstractC2352g;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: p0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2881l extends AbstractC2872c {

    /* JADX INFO: renamed from: d */
    public static final float[] f9110d;

    /* JADX INFO: renamed from: e */
    public static final float[] f9111e;

    /* JADX INFO: renamed from: f */
    public static final float[] f9112f;

    /* JADX INFO: renamed from: g */
    public static final float[] f9113g;

    static {
        float[] fArrM5087g = AbstractC2879j.m5087g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC2879j.m5083c(C2870a.f9061b.f9062a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f9110d = fArrM5087g;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f9111e = fArr;
        f9112f = AbstractC2879j.m5086f(fArrM5087g);
        f9113g = AbstractC2879j.m5086f(fArr);
    }

    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: a */
    public final float mo5070a(int i5) {
        return i5 == 0 ? 1.0f : 0.5f;
    }

    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: b */
    public final float mo5071b(int i5) {
        return i5 == 0 ? 0.0f : -0.5f;
    }

    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: d */
    public final long mo5073d(float f2, float f5, float f6) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        if (f5 > 0.5f) {
            f5 = 0.5f;
        }
        if (f6 < -0.5f) {
            f6 = -0.5f;
        }
        float f7 = f6 <= 0.5f ? f6 : 0.5f;
        float[] fArr = f9113g;
        float f8 = (fArr[6] * f7) + (fArr[3] * f5) + (fArr[0] * f2);
        float f9 = (fArr[7] * f7) + (fArr[4] * f5) + (fArr[1] * f2);
        float f10 = (fArr[8] * f7) + (fArr[5] * f5) + (fArr[2] * f2);
        float f11 = f8 * f8 * f8;
        float f12 = f9 * f9 * f9;
        float f13 = f10 * f10 * f10;
        float[] fArr2 = f9112f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f13) + (fArr2[4] * f12) + (fArr2[1] * f11))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f13) + ((fArr2[3] * f12) + (fArr2[0] * f11)))) << 32);
    }

    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: e */
    public final float mo5074e(float f2, float f5, float f6) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f5 < -0.5f) {
            f5 = -0.5f;
        }
        if (f5 > 0.5f) {
            f5 = 0.5f;
        }
        if (f6 < -0.5f) {
            f6 = -0.5f;
        }
        float f7 = f6 <= 0.5f ? f6 : 0.5f;
        float[] fArr = f9113g;
        float f8 = (fArr[6] * f7) + (fArr[3] * f5) + (fArr[0] * f2);
        float f9 = (fArr[7] * f7) + (fArr[4] * f5) + (fArr[1] * f2);
        float f10 = (fArr[8] * f7) + (fArr[5] * f5) + (fArr[2] * f2);
        float f11 = f8 * f8 * f8;
        float f12 = f9 * f9 * f9;
        float f13 = f10 * f10 * f10;
        float[] fArr2 = f9112f;
        return (fArr2[8] * f13) + (fArr2[5] * f12) + (fArr2[2] * f11);
    }

    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: f */
    public final long mo5075f(float f2, float f5, float f6, float f7, AbstractC2872c abstractC2872c) {
        float[] fArr = f9110d;
        float f8 = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f2);
        float f9 = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f2);
        float f10 = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f2);
        float fM4203p = AbstractC2352g.m4203p(f8);
        float fM4203p2 = AbstractC2352g.m4203p(f9);
        float fM4203p3 = AbstractC2352g.m4203p(f10);
        float[] fArr2 = f9111e;
        return AbstractC2767z.m4932b((fArr2[6] * fM4203p3) + (fArr2[3] * fM4203p2) + (fArr2[0] * fM4203p), (fArr2[7] * fM4203p3) + (fArr2[4] * fM4203p2) + (fArr2[1] * fM4203p), (fArr2[8] * fM4203p3) + (fArr2[5] * fM4203p2) + (fArr2[2] * fM4203p), f7, abstractC2872c);
    }
}
