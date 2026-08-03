package p089g1;

/* JADX INFO: renamed from: g1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1282k {

    /* JADX INFO: renamed from: a */
    public static final C1291t f4269a = new C1291t(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b */
    public static final C1291t f4270b = new C1291t(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c */
    public static final C1291t f4271c = new C1291t(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d */
    public static final C1291t f4272d = new C1291t(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e */
    public static final float[] f4273e = {0.964212f, 1.0f, 0.825188f};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static AbstractC1274c m3422a(AbstractC1274c abstractC1274c) {
        if (AbstractC1273b.m3403a(abstractC1274c.f4232b, AbstractC1273b.f4226a)) {
            C1289r c1289r = (C1289r) abstractC1274c;
            C1291t c1291t = c1289r.f4288d;
            C1291t c1291t2 = f4270b;
            if (!m3425d(c1291t, c1291t2)) {
                return new C1289r(c1289r.f4231a, c1289r.f4292h, c1291t2, m3428g(m3424c(C1272a.f4224b.f4225a, c1291t.m3430a(), c1291t2.m3430a()), c1289r.f4293i), c1289r.f4295k, c1289r.f4298n, c1289r.f4289e, c1289r.f4290f, c1289r.f4291g, -1);
            }
        }
        return abstractC1274c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static float m3423b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f3 * f12))) - (f12 * f13)) - (f10 * f11)) - (f3 * f14)) * 0.5f;
        return f15 < 0.0f ? -f15 : f15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float[] m3424c(float[] fArr, float[] fArr2, float[] fArr3) {
        m3429h(fArr, fArr2);
        m3429h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM3427f = m3427f(fArr);
        float f3 = fArr4[0];
        float f10 = fArr[0] * f3;
        float f11 = fArr4[1];
        float f12 = fArr[1] * f11;
        float f13 = fArr4[2];
        return m3428g(fArrM3427f, new float[]{f10, f12, fArr[2] * f13, fArr[3] * f3, fArr[4] * f11, fArr[5] * f13, f3 * fArr[6], f11 * fArr[7], f13 * fArr[8]});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m3425d(C1291t c1291t, C1291t c1291t2) {
        if (c1291t == c1291t2) {
            return true;
        }
        return Math.abs(c1291t.f4309a - c1291t2.f4309a) < 0.001f && Math.abs(c1291t.f4310b - c1291t2.f4310b) < 0.001f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C1279h m3426e(AbstractC1274c abstractC1274c, AbstractC1274c abstractC1274c2) {
        if (abstractC1274c == abstractC1274c2) {
            return new C1277f(abstractC1274c, abstractC1274c, 1);
        }
        long j3 = abstractC1274c.f4232b;
        long j4 = AbstractC1273b.f4226a;
        return (AbstractC1273b.m3403a(j3, j4) && AbstractC1273b.m3403a(abstractC1274c2.f4232b, j4)) ? new C1278g((C1289r) abstractC1274c, (C1289r) abstractC1274c2) : new C1279h(abstractC1274c, abstractC1274c2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final float[] m3427f(float[] fArr) {
        float f3 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f3 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f3) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f3)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f3)) / f21;
        fArr2[8] = ((f3 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final float[] m3428g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f3 = fArr[0] * fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        fArr3[0] = (f12 * f13) + (f10 * f11) + f3;
        float f14 = fArr[1];
        float f15 = fArr2[0];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = f17 * f13;
        fArr3[1] = f18 + (f11 * f16) + (f14 * f15);
        float f19 = fArr[2] * f15;
        float f20 = fArr[5];
        float f21 = (fArr2[1] * f20) + f19;
        float f22 = fArr[8];
        fArr3[2] = (f13 * f22) + f21;
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = (f10 * f25) + f24;
        float f27 = fArr2[5];
        fArr3[3] = (f12 * f27) + f26;
        float f28 = fArr[1];
        float f29 = fArr2[3];
        float f30 = f16 * f25;
        fArr3[4] = (f17 * f27) + f30 + (f28 * f29);
        float f31 = fArr[2];
        float f32 = f27 * f22;
        fArr3[5] = f32 + (f20 * fArr2[4]) + (f29 * f31);
        float f33 = f23 * fArr2[6];
        float f34 = fArr[3];
        float f35 = fArr2[7];
        float f36 = (f34 * f35) + f33;
        float f37 = fArr2[8];
        fArr3[6] = (f12 * f37) + f36;
        float f38 = fArr2[6];
        float f39 = f17 * f37;
        fArr3[7] = f39 + (fArr[4] * f35) + (f28 * f38);
        float f40 = f22 * f37;
        fArr3[8] = f40 + (fArr[5] * fArr2[7]) + (f31 * f38);
        return fArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final float[] m3429h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f3 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f3);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f3);
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f3);
        return fArr2;
    }
}
