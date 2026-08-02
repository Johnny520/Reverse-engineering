package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tz2 {
    public static final dq1 g;
    public final jx1 a;
    public final jx1 b = new jx1(0.0f);
    public final kx1 c = new kx1(0);
    public o62 d = o62.e;
    public long e = f13.b;
    public final nx1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        yc2 yc2Var = new yc2(25);
        kx2 kx2Var = new kx2(7);
        lt0 lt0Var = new lt0(1, yc2Var);
        xe1.f(1, kx2Var);
        g = new dq1(10, lt0Var, kx2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tz2(qv1 qv1Var, float f) {
        this.a = new jx1(f);
        this.f = new nx1(qv1Var, sn.T);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(qv1 qv1Var, o62 o62Var, int i, int i2) {
        float f = i2 - i;
        this.b.h(f);
        float f2 = o62Var.a;
        float f3 = o62Var.b;
        o62 o62Var2 = this.d;
        float f4 = o62Var2.a;
        jx1 jx1Var = this.a;
        if (f2 != f4 || f3 != o62Var2.b) {
            boolean z = qv1Var == qv1.h;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? o62Var.d : o62Var.c;
            float fG = jx1Var.g();
            float f6 = i;
            float f7 = fG + f6;
            jx1Var.h(jx1Var.g() + ((f5 <= f7 && (f2 >= fG || f5 - f2 <= f6)) ? (f2 >= fG || f5 - f2 > f6) ? 0.0f : f2 - fG : f5 - f7));
            this.d = o62Var;
        }
        jx1Var.h(ci0.C(jx1Var.g(), 0.0f, f));
        this.c.h(i);
    }
}
