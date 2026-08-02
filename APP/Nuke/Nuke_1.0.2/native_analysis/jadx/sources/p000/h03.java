package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h03 {

    /* JADX INFO: renamed from: a */
    public d61 f3757a;

    /* JADX INFO: renamed from: b */
    public e70 f3758b;

    /* JADX INFO: renamed from: c */
    public xl0 f3759c;

    /* JADX INFO: renamed from: d */
    public m13 f3760d;

    /* JADX INFO: renamed from: e */
    public Object f3761e;

    /* JADX INFO: renamed from: f */
    public final nx1 f3762f = op0.m3598u(Boolean.TRUE);

    /* JADX INFO: renamed from: g */
    public long f3763g;

    public h03(d61 d61Var, e70 e70Var, xl0 xl0Var, m13 m13Var, Object obj) {
        this.f3757a = d61Var;
        this.f3758b = e70Var;
        this.f3759c = xl0Var;
        this.f3760d = m13Var;
        this.f3761e = obj;
        this.f3763g = lz2.m3020a(this.f3760d, this.f3758b, this.f3759c, lz2.f6414a, 1);
    }

    /* JADX INFO: renamed from: a */
    public static void m2040a(h03 h03Var, d61 d61Var, e70 e70Var, m13 m13Var, int i) {
        if ((i & 1) != 0) {
            d61Var = h03Var.f3757a;
        }
        if ((i & 2) != 0) {
            e70Var = h03Var.f3758b;
        }
        xl0 xl0Var = h03Var.f3759c;
        if ((i & 8) != 0) {
            m13Var = h03Var.f3760d;
        }
        Object obj = h03Var.f3761e;
        d61 d61Var2 = h03Var.f3757a;
        nx1 nx1Var = h03Var.f3762f;
        if (d61Var == d61Var2 && t11.m5086l(e70Var, h03Var.f3758b) && t11.m5086l(xl0Var, h03Var.f3759c) && t11.m5086l(m13Var, h03Var.f3760d)) {
            if (t11.m5086l(obj, h03Var.f3761e)) {
                return;
            }
            h03Var.f3761e = obj;
            nx1Var.setValue(Boolean.TRUE);
            return;
        }
        h03Var.f3757a = d61Var;
        h03Var.f3758b = e70Var;
        h03Var.f3759c = xl0Var;
        h03Var.f3760d = m13Var;
        nx1Var.setValue(Boolean.TRUE);
    }
}
