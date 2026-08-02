package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tz2 {

    /* JADX INFO: renamed from: g */
    public static final dq1 f11012g;

    /* JADX INFO: renamed from: a */
    public final jx1 f11013a;

    /* JADX INFO: renamed from: b */
    public final jx1 f11014b = new jx1(0.0f);

    /* JADX INFO: renamed from: c */
    public final kx1 f11015c = new kx1(0);

    /* JADX INFO: renamed from: d */
    public o62 f11016d = o62.f7535e;

    /* JADX INFO: renamed from: e */
    public long f11017e = f13.f2737b;

    /* JADX INFO: renamed from: f */
    public final nx1 f11018f;

    static {
        yc2 yc2Var = new yc2(25);
        kx2 kx2Var = new kx2(7);
        lt0 lt0Var = new lt0(1, yc2Var);
        xe1.m6119f(1, kx2Var);
        f11012g = new dq1(10, lt0Var, kx2Var);
    }

    public tz2(qv1 qv1Var, float f) {
        this.f11013a = new jx1(f);
        this.f11018f = new nx1(qv1Var, C0700sn.f10216T);
    }

    /* JADX INFO: renamed from: a */
    public final void m5449a(qv1 qv1Var, o62 o62Var, int i, int i2) {
        float f = i2 - i;
        this.f11014b.m2592h(f);
        float f2 = o62Var.f7536a;
        float f3 = o62Var.f7537b;
        o62 o62Var2 = this.f11016d;
        float f4 = o62Var2.f7536a;
        jx1 jx1Var = this.f11013a;
        if (f2 != f4 || f3 != o62Var2.f7537b) {
            boolean z = qv1Var == qv1.f9205h;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? o62Var.f7539d : o62Var.f7538c;
            float fM2591g = jx1Var.m2591g();
            float f6 = i;
            float f7 = fM2591g + f6;
            jx1Var.m2592h(jx1Var.m2591g() + ((f5 <= f7 && (f2 >= fM2591g || f5 - f2 <= f6)) ? (f2 >= fM2591g || f5 - f2 > f6) ? 0.0f : f2 - fM2591g : f5 - f7));
            this.f11016d = o62Var;
        }
        jx1Var.m2592h(ci0.m778C(jx1Var.m2591g(), 0.0f, f));
        this.f11015c.m2760h(i);
    }
}
