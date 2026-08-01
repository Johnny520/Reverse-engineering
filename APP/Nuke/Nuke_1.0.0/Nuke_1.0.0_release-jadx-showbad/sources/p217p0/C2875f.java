package p217p0;

import p211o0.AbstractC2767z;
import p211o0.C2762u;

/* JADX INFO: renamed from: p0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2875f extends C2876g {

    /* JADX INFO: renamed from: e */
    public final C2886q f9096e;

    /* JADX INFO: renamed from: f */
    public final C2886q f9097f;

    /* JADX INFO: renamed from: g */
    public final float[] f9098g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2875f(C2886q c2886q, C2886q c2886q2) {
        float[] fArrM5087g;
        super(c2886q2, c2886q, c2886q2, null);
        this.f9096e = c2886q;
        this.f9097f = c2886q2;
        float[] fArr = C2870a.f9061b.f9062a;
        C2888s c2888s = c2886q.f9123d;
        float[] fArr2 = c2886q.f9128i;
        C2888s c2888s2 = c2886q2.f9123d;
        float[] fArr3 = c2886q2.f9129j;
        if (AbstractC2879j.m5084d(c2888s, c2888s2)) {
            fArrM5087g = AbstractC2879j.m5087g(fArr3, fArr2);
        } else {
            float[] fArrM5089a = c2888s.m5089a();
            float[] fArrM5089a2 = c2888s2.m5089a();
            C2888s c2888s3 = AbstractC2879j.f9105b;
            fArrM5087g = AbstractC2879j.m5087g(AbstractC2879j.m5084d(c2888s2, c2888s3) ? fArr3 : AbstractC2879j.m5086f(AbstractC2879j.m5087g(AbstractC2879j.m5083c(fArr, fArrM5089a2, new float[]{0.964212f, 1.0f, 0.825188f}), c2886q2.f9128i)), AbstractC2879j.m5084d(c2888s, c2888s3) ? fArr2 : AbstractC2879j.m5087g(AbstractC2879j.m5083c(fArr, fArrM5089a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f9098g = fArrM5087g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.C2876g
    /* JADX INFO: renamed from: a */
    public final long mo5080a(long j5) {
        float fM4926h = C2762u.m4926h(j5);
        float fM4925g = C2762u.m4925g(j5);
        float fM4923e = C2762u.m4923e(j5);
        float fM4922d = C2762u.m4922d(j5);
        C2882m c2882m = this.f9096e.f9135p;
        float fMo601b = (float) c2882m.mo601b(fM4926h);
        float fMo601b2 = (float) c2882m.mo601b(fM4925g);
        float fMo601b3 = (float) c2882m.mo601b(fM4923e);
        float[] fArr = this.f9098g;
        float f2 = (fArr[6] * fMo601b3) + (fArr[3] * fMo601b2) + (fArr[0] * fMo601b);
        float f5 = (fArr[7] * fMo601b3) + (fArr[4] * fMo601b2) + (fArr[1] * fMo601b);
        float f6 = (fArr[8] * fMo601b3) + (fArr[5] * fMo601b2) + (fArr[2] * fMo601b);
        C2886q c2886q = this.f9097f;
        float fMo601b4 = (float) c2886q.f9132m.mo601b(f2);
        C2882m c2882m2 = c2886q.f9132m;
        return AbstractC2767z.m4932b(fMo601b4, (float) c2882m2.mo601b(f5), (float) c2882m2.mo601b(f6), fM4922d, c2886q);
    }
}
