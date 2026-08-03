package p089g1;

import p071f1.C1034w;

/* JADX INFO: renamed from: g1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1279h {

    /* JADX INFO: renamed from: a */
    public final AbstractC1274c f4264a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1274c f4265b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1274c f4266c;

    /* JADX INFO: renamed from: d */
    public final float[] f4267d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1279h(AbstractC1274c abstractC1274c, AbstractC1274c abstractC1274c2, int i9) {
        float[] fArr;
        long j3 = abstractC1274c.f4232b;
        long j4 = AbstractC1273b.f4226a;
        AbstractC1274c abstractC1274cM3422a = AbstractC1273b.m3403a(j3, j4) ? AbstractC1282k.m3422a(abstractC1274c) : abstractC1274c;
        AbstractC1274c abstractC1274cM3422a2 = AbstractC1273b.m3403a(abstractC1274c2.f4232b, j4) ? AbstractC1282k.m3422a(abstractC1274c2) : abstractC1274c2;
        if (i9 == 3) {
            boolean zM3403a = AbstractC1273b.m3403a(abstractC1274c.f4232b, j4);
            boolean zM3403a2 = AbstractC1273b.m3403a(abstractC1274c2.f4232b, j4);
            if (!(zM3403a && zM3403a2) && (zM3403a || zM3403a2)) {
                C1291t c1291t = ((C1289r) (zM3403a ? abstractC1274c : abstractC1274c2)).f4288d;
                float[] fArrM3430a = AbstractC1282k.f4273e;
                float[] fArrM3430a2 = zM3403a ? c1291t.m3430a() : fArrM3430a;
                fArrM3430a = zM3403a2 ? c1291t.m3430a() : fArrM3430a;
                fArr = new float[]{fArrM3430a2[0] / fArrM3430a[0], fArrM3430a2[1] / fArrM3430a[1], fArrM3430a2[2] / fArrM3430a[2]};
            } else {
                fArr = null;
            }
        }
        this(abstractC1274c2, abstractC1274cM3422a, abstractC1274cM3422a2, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public long mo3421a(long j3) {
        float fM2640h = C1034w.m2640h(j3);
        float fM2639g = C1034w.m2639g(j3);
        float fM2637e = C1034w.m2637e(j3);
        float fM2636d = C1034w.m2636d(j3);
        AbstractC1274c abstractC1274c = this.f4265b;
        long jMo3407d = abstractC1274c.mo3407d(fM2640h, fM2639g, fM2637e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3407d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3407d & 4294967295L));
        float fMo3408e = abstractC1274c.mo3408e(fM2640h, fM2639g, fM2637e);
        float[] fArr = this.f4267d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo3408e *= fArr[2];
        }
        float f3 = fIntBitsToFloat;
        float f10 = fIntBitsToFloat2;
        return this.f4266c.mo3409f(f3, f10, fMo3408e, fM2636d, this.f4264a);
    }

    public C1279h(AbstractC1274c abstractC1274c, AbstractC1274c abstractC1274c2, AbstractC1274c abstractC1274c3, float[] fArr) {
        this.f4264a = abstractC1274c;
        this.f4265b = abstractC1274c2;
        this.f4266c = abstractC1274c3;
        this.f4267d = fArr;
    }
}
