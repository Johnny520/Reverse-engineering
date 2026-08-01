package p217p0;

import p211o0.C2762u;

/* JADX INFO: renamed from: p0.g */
/* JADX INFO: loaded from: classes.dex */
public class C2876g {

    /* JADX INFO: renamed from: a */
    public final AbstractC2872c f9099a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2872c f9100b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2872c f9101c;

    /* JADX INFO: renamed from: d */
    public final float[] f9102d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2876g(AbstractC2872c abstractC2872c, AbstractC2872c abstractC2872c2, AbstractC2872c abstractC2872c3, float[] fArr) {
        this.f9099a = abstractC2872c;
        this.f9100b = abstractC2872c2;
        this.f9101c = abstractC2872c3;
        this.f9102d = fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public long mo5080a(long j5) {
        float fM4926h = C2762u.m4926h(j5);
        float fM4925g = C2762u.m4925g(j5);
        float fM4923e = C2762u.m4923e(j5);
        float fM4922d = C2762u.m4922d(j5);
        AbstractC2872c abstractC2872c = this.f9100b;
        long jMo5073d = abstractC2872c.mo5073d(fM4926h, fM4925g, fM4923e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo5073d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo5073d & 4294967295L));
        float fMo5074e = abstractC2872c.mo5074e(fM4926h, fM4925g, fM4923e);
        float[] fArr = this.f9102d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo5074e *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f5 = fIntBitsToFloat2;
        return this.f9101c.mo5075f(f2, f5, fMo5074e, fM4922d, this.f9099a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2876g(AbstractC2872c abstractC2872c, AbstractC2872c abstractC2872c2, int i5) {
        float[] fArr;
        long j5 = abstractC2872c.f9069b;
        long j6 = AbstractC2871b.f9063a;
        AbstractC2872c abstractC2872cM5081a = AbstractC2871b.m5068a(j5, j6) ? AbstractC2879j.m5081a(abstractC2872c) : abstractC2872c;
        AbstractC2872c abstractC2872cM5081a2 = AbstractC2871b.m5068a(abstractC2872c2.f9069b, j6) ? AbstractC2879j.m5081a(abstractC2872c2) : abstractC2872c2;
        if (i5 == 3) {
            boolean zM5068a = AbstractC2871b.m5068a(abstractC2872c.f9069b, j6);
            boolean zM5068a2 = AbstractC2871b.m5068a(abstractC2872c2.f9069b, j6);
            if (!(zM5068a && zM5068a2) && (zM5068a || zM5068a2)) {
                C2888s c2888s = ((C2886q) (zM5068a ? abstractC2872c : abstractC2872c2)).f9123d;
                float[] fArrM5089a = AbstractC2879j.f9108e;
                float[] fArrM5089a2 = zM5068a ? c2888s.m5089a() : fArrM5089a;
                fArrM5089a = zM5068a2 ? c2888s.m5089a() : fArrM5089a;
                fArr = new float[]{fArrM5089a2[0] / fArrM5089a[0], fArrM5089a2[1] / fArrM5089a[1], fArrM5089a2[2] / fArrM5089a[2]};
            } else {
                fArr = null;
            }
        }
        this(abstractC2872c2, abstractC2872cM5081a, abstractC2872cM5081a2, fArr);
    }
}
