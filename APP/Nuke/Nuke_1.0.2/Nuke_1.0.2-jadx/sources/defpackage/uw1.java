package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uw1 {
    public String a;
    public m13 b;
    public xl0 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public e70 i;
    public t9 j;
    public boolean k;
    public bh1 m;
    public tw1 n;
    public d61 o;
    public long s;
    public long h = oz0.a;
    public long l = 0;
    public long p = gz.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uw1(String str, m13 m13Var, xl0 xl0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = m13Var;
        this.c = xl0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long f(uw1 uw1Var, long j, d61 d61Var) {
        int i;
        m13 m13Var = uw1Var.b;
        bh1 bh1Var = uw1Var.m;
        e70 e70Var = uw1Var.i;
        e70Var.getClass();
        bh1 bh1VarI = ci0.I(bh1Var, d61Var, m13Var, e70Var, uw1Var.c);
        uw1Var.m = bh1VarI;
        int i2 = uw1Var.g;
        h70 h70Var = bh1VarI.c;
        float f = bh1VarI.g;
        float fB = bh1VarI.f;
        if (Float.isNaN(f) || Float.isNaN(fB)) {
            float fB2 = ci0.r(ch1.a, bh1VarI.e, gz.b(0, 0, 0, 0, 15), h70Var, bh1VarI.d, 1, 96).b();
            fB = ci0.r(ch1.b, bh1VarI.e, gz.b(0, 0, 0, 0, 15), h70Var, bh1VarI.d, 2, 96).b() - fB2;
            bh1VarI.g = fB2;
            bh1VarI.f = fB;
            f = fB2;
        }
        if (i2 != 1) {
            int iRound = Math.round((fB * (i2 - 1)) + f);
            i = iRound >= 0 ? iRound : 0;
            int iG = fz.g(j);
            if (i > iG) {
                i = iG;
            }
        } else {
            i = fz.i(j);
        }
        return gz.a(fz.j(j), fz.h(j), i, fz.g(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i, d61 d61Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = gz.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = f(this, jA, d61Var);
        }
        tw1 tw1VarE = e(d61Var);
        long jQ = xe1.q(jA, this.e, this.d, tw1VarE.c());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iL = qp0.l(new t9((x9) tw1VarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jQ).b());
        int i6 = fz.i(jA);
        if (iL < i6) {
            iL = i6;
        }
        this.q = i;
        this.r = iL;
        return iL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(long j, d61 d61Var) {
        tw1 tw1Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jF = this.g > 1 ? f(this, j, d61Var) : j;
        t9 t9Var = this.j;
        boolean z2 = false;
        if (t9Var != null && (tw1Var = this.n) != null && !tw1Var.b() && d61Var == this.o && (fz.b(jF, this.p) || (fz.h(jF) == fz.h(this.p) && fz.j(jF) == fz.j(this.p) && fz.g(jF) >= t9Var.b() && !t9Var.d.d))) {
            if (!fz.b(jF, this.p)) {
                t9 t9Var2 = this.j;
                t9Var2.getClass();
                this.l = gz.d(jF, (((long) qp0.l(Math.min(t9Var2.a.i.c(), t9Var2.d()))) << 32) | (((long) qp0.l(t9Var2.b())) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= t9Var2.d() && ((int) (4294967295L & r12)) >= t9Var2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jF;
            }
            return false;
        }
        tw1 tw1VarE = e(d61Var);
        long jQ = xe1.q(jF, this.e, this.d, tw1VarE.c());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        t9 t9Var3 = new t9((x9) tw1VarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jQ);
        this.p = jF;
        this.l = gz.d(jF, (((long) qp0.l(t9Var3.b())) & 4294967295L) | (((long) qp0.l(t9Var3.d())) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < t9Var3.d() || ((int) (r1 & 4294967295L)) < t9Var3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = t9Var3;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = gz.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(e70 e70Var) {
        long jA;
        e70 e70Var2 = this.i;
        if (e70Var != null) {
            int i = oz0.b;
            jA = oz0.a(e70Var.b(), e70Var.m());
        } else {
            jA = oz0.a;
        }
        if (e70Var2 == null) {
            this.i = e70Var;
            this.h = jA;
        } else if (e70Var == null || this.h != jA) {
            this.i = e70Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final tw1 e(d61 d61Var) {
        tw1 x9Var = this.n;
        if (x9Var == null || d61Var != this.o || x9Var.b()) {
            this.o = d61Var;
            String str = this.a;
            m13 m13VarK0 = xe1.k0(this.b, d61Var);
            e70 e70Var = this.i;
            e70Var.getClass();
            xl0 xl0Var = this.c;
            be0 be0Var = be0.h;
            x9Var = new x9(str, m13VarK0, be0Var, be0Var, xl0Var, e70Var);
        }
        this.n = x9Var;
        return x9Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) oz0.b(this.h));
        sb.append(", history=");
        sb.append(this.s);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
