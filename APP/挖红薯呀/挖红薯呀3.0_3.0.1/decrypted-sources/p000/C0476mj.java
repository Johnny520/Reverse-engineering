package p000;

/* JADX INFO: renamed from: mj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class C0476mj {

    /* JADX INFO: renamed from: a */
    public final AbstractC0549of f3989a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0549of f3990b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0549of f3991c;

    /* JADX INFO: renamed from: d */
    public final float[] f3992d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0476mj(AbstractC0549of abstractC0549of, AbstractC0549of abstractC0549of2, int i) {
        float[] fArr;
        AbstractC0549of abstractC0549ofM4044i = rd0.m3487p(abstractC0549of.f4545b, 12884901888L) ? s91.m4044i(abstractC0549of) : abstractC0549of;
        AbstractC0549of abstractC0549ofM4044i2 = rd0.m3487p(abstractC0549of2.f4545b, 12884901888L) ? s91.m4044i(abstractC0549of2) : abstractC0549of2;
        float[] fArrM509a = rd0.f5371j;
        if (i == 3) {
            boolean zM3487p = rd0.m3487p(abstractC0549of.f4545b, 12884901888L);
            boolean zM3487p2 = rd0.m3487p(abstractC0549of2.f4545b, 12884901888L);
            if (!(zM3487p && zM3487p2) && (zM3487p || zM3487p2)) {
                cd1 cd1Var = ((nv0) (zM3487p ? abstractC0549of : abstractC0549of2)).f4348d;
                float[] fArrM509a2 = zM3487p ? cd1Var.m509a() : fArrM509a;
                fArrM509a = zM3487p2 ? cd1Var.m509a() : fArrM509a;
                fArr = new float[]{fArrM509a2[0] / fArrM509a[0], fArrM509a2[1] / fArrM509a[1], fArrM509a2[2] / fArrM509a[2]};
            } else {
                fArr = null;
            }
        }
        this(abstractC0549of2, abstractC0549ofM4044i, abstractC0549ofM4044i2, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public long mo1908a(long j) {
        float fM1099h = C0207ff.m1099h(j);
        float fM1098g = C0207ff.m1098g(j);
        float fM1096e = C0207ff.m1096e(j);
        float fM1095d = C0207ff.m1095d(j);
        AbstractC0549of abstractC0549of = this.f3990b;
        long jMo255d = abstractC0549of.mo255d(fM1099h, fM1098g, fM1096e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo255d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo255d & 4294967295L));
        float fMo256e = abstractC0549of.mo256e(fM1099h, fM1098g, fM1096e);
        float[] fArr = this.f3992d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo256e *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f3991c.mo257f(f, f2, fMo256e, fM1095d, this.f3989a);
    }

    public C0476mj(AbstractC0549of abstractC0549of, AbstractC0549of abstractC0549of2, AbstractC0549of abstractC0549of3, float[] fArr) {
        this.f3989a = abstractC0549of;
        this.f3990b = abstractC0549of2;
        this.f3991c = abstractC0549of3;
        this.f3992d = fArr;
    }
}
