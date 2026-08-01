package p217p0;

/* JADX INFO: renamed from: p0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2879j {

    /* JADX INFO: renamed from: a */
    public static final C2888s f9104a = new C2888s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b */
    public static final C2888s f9105b = new C2888s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c */
    public static final C2888s f9106c = new C2888s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d */
    public static final C2888s f9107d = new C2888s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e */
    public static final float[] f9108e = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: a */
    public static AbstractC2872c m5081a(AbstractC2872c abstractC2872c) {
        if (AbstractC2871b.m5068a(abstractC2872c.f9069b, AbstractC2871b.f9063a)) {
            C2886q c2886q = (C2886q) abstractC2872c;
            C2888s c2888s = c2886q.f9123d;
            C2888s c2888s2 = f9105b;
            if (!m5084d(c2888s, c2888s2)) {
                return new C2886q(c2886q.f9068a, c2886q.f9127h, c2888s2, m5087g(m5083c(C2870a.f9061b.f9062a, c2888s.m5089a(), c2888s2.m5089a()), c2886q.f9128i), c2886q.f9130k, c2886q.f9133n, c2886q.f9124e, c2886q.f9125f, c2886q.f9126g, -1);
            }
        }
        return abstractC2872c;
    }

    /* JADX INFO: renamed from: b */
    public static float m5082b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = (((((f6 * f9) + ((f5 * f8) + (f2 * f7))) - (f7 * f8)) - (f5 * f6)) - (f2 * f9)) * 0.5f;
        return f10 < 0.0f ? -f10 : f10;
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m5083c(float[] fArr, float[] fArr2, float[] fArr3) {
        m5088h(fArr, fArr2);
        m5088h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM5086f = m5086f(fArr);
        float f2 = fArr4[0];
        float f5 = fArr[0] * f2;
        float f6 = fArr4[1];
        float f7 = fArr[1] * f6;
        float f8 = fArr4[2];
        return m5087g(fArrM5086f, new float[]{f5, f7, fArr[2] * f8, fArr[3] * f2, fArr[4] * f6, fArr[5] * f8, f2 * fArr[6], f6 * fArr[7], f8 * fArr[8]});
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m5084d(C2888s c2888s, C2888s c2888s2) {
        if (c2888s == c2888s2) {
            return true;
        }
        return Math.abs(c2888s.f9144a - c2888s2.f9144a) < 0.001f && Math.abs(c2888s.f9145b - c2888s2.f9145b) < 0.001f;
    }

    /* JADX INFO: renamed from: e */
    public static final C2876g m5085e(AbstractC2872c abstractC2872c, AbstractC2872c abstractC2872c2) {
        if (abstractC2872c == abstractC2872c2) {
            return new C2874e(abstractC2872c, abstractC2872c, 1);
        }
        long j5 = abstractC2872c.f9069b;
        long j6 = AbstractC2871b.f9063a;
        return (AbstractC2871b.m5068a(j5, j6) && AbstractC2871b.m5068a(abstractC2872c2.f9069b, j6)) ? new C2875f((C2886q) abstractC2872c, (C2886q) abstractC2872c2) : new C2876g(abstractC2872c, abstractC2872c2, 0);
    }

    /* JADX INFO: renamed from: f */
    public static final float[] m5086f(float[] fArr) {
        float f2 = fArr[0];
        float f5 = fArr[3];
        float f6 = fArr[6];
        float f7 = fArr[1];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = fArr[2];
        float f11 = fArr[5];
        float f12 = fArr[8];
        float f13 = (f8 * f12) - (f9 * f11);
        float f14 = (f9 * f10) - (f7 * f12);
        float f15 = (f7 * f11) - (f8 * f10);
        float f16 = (f6 * f15) + (f5 * f14) + (f2 * f13);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f13 / f16;
        fArr2[1] = f14 / f16;
        fArr2[2] = f15 / f16;
        fArr2[3] = ((f6 * f11) - (f5 * f12)) / f16;
        fArr2[4] = ((f12 * f2) - (f6 * f10)) / f16;
        fArr2[5] = ((f10 * f5) - (f11 * f2)) / f16;
        fArr2[6] = ((f5 * f9) - (f6 * f8)) / f16;
        fArr2[7] = ((f6 * f7) - (f9 * f2)) / f16;
        fArr2[8] = ((f2 * f8) - (f5 * f7)) / f16;
        return fArr2;
    }

    /* JADX INFO: renamed from: g */
    public static final float[] m5087g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f5 = fArr[3];
        float f6 = fArr2[1];
        float f7 = fArr[6];
        float f8 = fArr2[2];
        fArr3[0] = (f7 * f8) + (f5 * f6) + f2;
        float f9 = fArr[1];
        float f10 = fArr2[0];
        float f11 = fArr[4];
        float f12 = fArr[7];
        float f13 = f12 * f8;
        fArr3[1] = f13 + (f6 * f11) + (f9 * f10);
        float f14 = fArr[2] * f10;
        float f15 = fArr[5];
        float f16 = (fArr2[1] * f15) + f14;
        float f17 = fArr[8];
        fArr3[2] = (f8 * f17) + f16;
        float f18 = fArr[0];
        float f19 = fArr2[3] * f18;
        float f20 = fArr2[4];
        float f21 = (f5 * f20) + f19;
        float f22 = fArr2[5];
        fArr3[3] = (f7 * f22) + f21;
        float f23 = fArr[1];
        float f24 = fArr2[3];
        float f25 = f11 * f20;
        fArr3[4] = (f12 * f22) + f25 + (f23 * f24);
        float f26 = fArr[2];
        float f27 = f22 * f17;
        fArr3[5] = f27 + (f15 * fArr2[4]) + (f24 * f26);
        float f28 = f18 * fArr2[6];
        float f29 = fArr[3];
        float f30 = fArr2[7];
        float f31 = (f29 * f30) + f28;
        float f32 = fArr2[8];
        fArr3[6] = (f7 * f32) + f31;
        float f33 = fArr2[6];
        float f34 = f12 * f32;
        fArr3[7] = f34 + (fArr[4] * f30) + (f23 * f33);
        float f35 = f17 * f32;
        fArr3[8] = f35 + (fArr[5] * fArr2[7]) + (f26 * f33);
        return fArr3;
    }

    /* JADX INFO: renamed from: h */
    public static final float[] m5088h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f5 = fArr2[1];
        float f6 = fArr2[2];
        fArr2[0] = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f2);
        return fArr2;
    }
}
