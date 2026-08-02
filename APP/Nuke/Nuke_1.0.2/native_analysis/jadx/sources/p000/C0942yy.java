package p000;

/* JADX INFO: renamed from: yy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0942yy {

    /* JADX INFO: renamed from: a */
    public final AbstractC0708su f13666a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0708su f13667b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0708su f13668c;

    /* JADX INFO: renamed from: d */
    public final float[] f13669d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0942yy(AbstractC0708su abstractC0708su, AbstractC0708su abstractC0708su2, int i) {
        float[] fArr;
        AbstractC0708su abstractC0708suM4720t = tp0.m5371s(abstractC0708su.f10369b, 12884901888L) ? s11.m4720t(abstractC0708su) : abstractC0708su;
        AbstractC0708su abstractC0708suM4720t2 = tp0.m5371s(abstractC0708su2.f10369b, 12884901888L) ? s11.m4720t(abstractC0708su2) : abstractC0708su2;
        float[] fArrM4147a = pp0.f8439h;
        if (i == 3) {
            boolean zM5371s = tp0.m5371s(abstractC0708su.f10369b, 12884901888L);
            boolean zM5371s2 = tp0.m5371s(abstractC0708su2.f10369b, 12884901888L);
            if (!(zM5371s && zM5371s2) && (zM5371s || zM5371s2)) {
                qd3 qd3Var = ((ka2) (zM5371s ? abstractC0708su : abstractC0708su2)).f5419d;
                float[] fArrM4147a2 = zM5371s ? qd3Var.m4147a() : fArrM4147a;
                fArrM4147a = zM5371s2 ? qd3Var.m4147a() : fArrM4147a;
                fArr = new float[]{fArrM4147a2[0] / fArrM4147a[0], fArrM4147a2[1] / fArrM4147a[1], fArrM4147a2[2] / fArrM4147a[2]};
            } else {
                fArr = null;
            }
        }
        this(abstractC0708su2, abstractC0708suM4720t, abstractC0708suM4720t2, fArr);
    }

    /* JADX INFO: renamed from: a */
    public long mo6020a(long j) {
        float fM2571h = C0363ju.m2571h(j);
        float fM2570g = C0363ju.m2570g(j);
        float fM2568e = C0363ju.m2568e(j);
        float fM2567d = C0363ju.m2567d(j);
        AbstractC0708su abstractC0708su = this.f13667b;
        long jMo1721d = abstractC0708su.mo1721d(fM2571h, fM2570g, fM2568e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo1721d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo1721d & 4294967295L));
        float fMo1722e = abstractC0708su.mo1722e(fM2571h, fM2570g, fM2568e);
        float[] fArr = this.f13669d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo1722e *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f13668c.mo1723f(f, f2, fMo1722e, fM2567d, this.f13666a);
    }

    public C0942yy(AbstractC0708su abstractC0708su, AbstractC0708su abstractC0708su2, AbstractC0708su abstractC0708su3, float[] fArr) {
        this.f13666a = abstractC0708su;
        this.f13667b = abstractC0708su2;
        this.f13668c = abstractC0708su3;
        this.f13669d = fArr;
    }
}
