package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h03 {
    public d61 a;
    public e70 b;
    public xl0 c;
    public m13 d;
    public Object e;
    public final nx1 f = op0.u(Boolean.TRUE);
    public long g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h03(d61 d61Var, e70 e70Var, xl0 xl0Var, m13 m13Var, Object obj) {
        this.a = d61Var;
        this.b = e70Var;
        this.c = xl0Var;
        this.d = m13Var;
        this.e = obj;
        this.g = lz2.a(this.d, this.b, this.c, lz2.a, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(h03 h03Var, d61 d61Var, e70 e70Var, m13 m13Var, int i) {
        if ((i & 1) != 0) {
            d61Var = h03Var.a;
        }
        if ((i & 2) != 0) {
            e70Var = h03Var.b;
        }
        xl0 xl0Var = h03Var.c;
        if ((i & 8) != 0) {
            m13Var = h03Var.d;
        }
        Object obj = h03Var.e;
        d61 d61Var2 = h03Var.a;
        nx1 nx1Var = h03Var.f;
        if (d61Var == d61Var2 && t11.l(e70Var, h03Var.b) && t11.l(xl0Var, h03Var.c) && t11.l(m13Var, h03Var.d)) {
            if (t11.l(obj, h03Var.e)) {
                return;
            }
            h03Var.e = obj;
            nx1Var.setValue(Boolean.TRUE);
            return;
        }
        h03Var.a = d61Var;
        h03Var.b = e70Var;
        h03Var.c = xl0Var;
        h03Var.d = m13Var;
        nx1Var.setValue(Boolean.TRUE);
    }
}
