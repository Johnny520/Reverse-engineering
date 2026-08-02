package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t91 {
    public final nx1 A;
    public final nx1 B;
    public iz2 a;
    public final b62 b;
    public final bt2 c;
    public final sz0 d;
    public t03 e;
    public final nx1 f;
    public final nx1 g;
    public c61 h;
    public final nx1 i;
    public sd j;
    public final nx1 k;
    public final nx1 l;
    public final nx1 m;
    public final nx1 n;
    public final nx1 o;
    public boolean p;
    public final nx1 q;
    public final b5 r;
    public final nx1 s;
    public final nx1 t;
    public in0 u;
    public final n10 v;
    public final n10 w;
    public final n10 x;
    public final q9 y;
    public long z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t91(iz2 iz2Var, b62 b62Var, bt2 bt2Var) {
        this.a = iz2Var;
        this.b = b62Var;
        this.c = bt2Var;
        sz0 sz0Var = new sz0(16, false);
        sd sdVar = td.a;
        long j = f13.b;
        k03 k03Var = new k03(sdVar, j, (f13) null);
        sz0Var.i = k03Var;
        sz0Var.j = new sd0(sdVar, k03Var.b);
        this.d = sz0Var;
        Boolean bool = Boolean.FALSE;
        this.f = op0.u(bool);
        this.g = op0.u(new za0(0.0f));
        this.i = op0.u(null);
        this.k = op0.u(tr0.h);
        this.l = op0.u(bool);
        this.m = op0.u(bool);
        this.n = op0.u(bool);
        this.o = op0.u(bool);
        this.p = true;
        this.q = op0.u(Boolean.TRUE);
        this.r = new b5(bt2Var);
        this.s = op0.u(bool);
        this.t = op0.u(bool);
        this.u = new nx0(15);
        this.v = new n10(this, 1);
        this.w = new n10(this, 2);
        this.x = new n10(this, 3);
        this.y = pp0.i();
        this.z = ju.g;
        this.A = op0.u(new f13(j));
        this.B = op0.u(new f13(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final tr0 a() {
        return (tr0) this.k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c61 c() {
        c61 c61Var = this.h;
        if (c61Var == null || !c61Var.w()) {
            return null;
        }
        return c61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final z03 d() {
        return (z03) this.i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j) {
        this.B.setValue(new f13(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(long j) {
        this.A.setValue(new f13(j));
    }
}
