package p089g1;

import p071f1.AbstractC0996c0;
import p071f1.C1034w;

/* JADX INFO: renamed from: g1.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1278g extends C1279h {

    /* JADX INFO: renamed from: e */
    public final C1289r f4261e;

    /* JADX INFO: renamed from: f */
    public final C1289r f4262f;

    /* JADX INFO: renamed from: g */
    public final float[] f4263g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1278g(C1289r c1289r, C1289r c1289r2) {
        float[] fArrM3428g;
        super(c1289r2, c1289r, c1289r2, null);
        this.f4261e = c1289r;
        this.f4262f = c1289r2;
        float[] fArr = C1272a.f4224b.f4225a;
        C1291t c1291t = c1289r.f4288d;
        float[] fArr2 = c1289r.f4293i;
        C1291t c1291t2 = c1289r2.f4288d;
        float[] fArr3 = c1289r2.f4294j;
        if (AbstractC1282k.m3425d(c1291t, c1291t2)) {
            fArrM3428g = AbstractC1282k.m3428g(fArr3, fArr2);
        } else {
            float[] fArrM3430a = c1291t.m3430a();
            float[] fArrM3430a2 = c1291t2.m3430a();
            C1291t c1291t3 = AbstractC1282k.f4270b;
            fArrM3428g = AbstractC1282k.m3428g(AbstractC1282k.m3425d(c1291t2, c1291t3) ? fArr3 : AbstractC1282k.m3427f(AbstractC1282k.m3428g(AbstractC1282k.m3424c(fArr, fArrM3430a2, new float[]{0.964212f, 1.0f, 0.825188f}), c1289r2.f4293i)), AbstractC1282k.m3425d(c1291t, c1291t3) ? fArr2 : AbstractC1282k.m3428g(AbstractC1282k.m3424c(fArr, fArrM3430a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f4263g = fArrM3428g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p089g1.C1279h
    /* JADX INFO: renamed from: a */
    public final long mo3421a(long j3) {
        float fM2640h = C1034w.m2640h(j3);
        float fM2639g = C1034w.m2639g(j3);
        float fM2637e = C1034w.m2637e(j3);
        float fM2636d = C1034w.m2636d(j3);
        C1285n c1285n = this.f4261e.f4300p;
        float fMo469c = (float) c1285n.mo469c(fM2640h);
        float fMo469c2 = (float) c1285n.mo469c(fM2639g);
        float fMo469c3 = (float) c1285n.mo469c(fM2637e);
        float[] fArr = this.f4263g;
        float f3 = (fArr[6] * fMo469c3) + (fArr[3] * fMo469c2) + (fArr[0] * fMo469c);
        float f10 = (fArr[7] * fMo469c3) + (fArr[4] * fMo469c2) + (fArr[1] * fMo469c);
        float f11 = (fArr[8] * fMo469c3) + (fArr[5] * fMo469c2) + (fArr[2] * fMo469c);
        C1289r c1289r = this.f4262f;
        float fMo469c4 = (float) c1289r.f4297m.mo469c(f3);
        C1285n c1285n2 = c1289r.f4297m;
        return AbstractC0996c0.m2506b(fMo469c4, (float) c1285n2.mo469c(f10), (float) c1285n2.mo469c(f11), fM2636d, c1289r);
    }
}
