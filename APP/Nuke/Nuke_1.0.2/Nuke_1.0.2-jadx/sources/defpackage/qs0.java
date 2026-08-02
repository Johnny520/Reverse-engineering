package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends th1 implements gy, j61, os1 {
    public int A;
    public m13 B;
    public m63 C;
    public m13 v;
    public int w;
    public int x;
    public boolean y;
    public int z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        xl0 xl0Var = (xl0) p40.p(this, ly.k);
        this.B = xe1.k0(this.v, sp0.c0(this).G);
        mx2 mx2Var = M0().a.f;
        im0 im0Var = M0().a.c;
        if (im0Var == null) {
            im0Var = im0.j;
        }
        gm0 gm0Var = M0().a.d;
        int i = gm0Var != null ? gm0Var.a : 0;
        hm0 hm0Var = M0().a.e;
        this.C = ((yl0) xl0Var).b(mx2Var, im0Var, i, hm0Var != null ? hm0Var.a : 65535);
        s11.S(this, new ps0(this, 0));
        this.y = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        this.B = null;
        this.C = null;
        this.y = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        if (this.C != null) {
            s11.S(this, new ps0(this, 1));
        }
        this.y = true;
        gf1.A(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m13 M0() {
        m13 m13Var = this.B;
        if (m13Var != null) {
            return m13Var;
        }
        nz0.b("Resolved style is not set.");
        s.b();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60, defpackage.r12
    public final void a() {
        this.y = true;
        gf1.A(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        if (this.y) {
            m13 m13VarM0 = M0();
            xl0 xl0Var = (xl0) p40.p(this, ly.k);
            String str = lz2.a;
            int iA = (int) (lz2.a(m13VarM0, pf1Var, xl0Var, str, 1) & 4294967295L);
            int iA2 = ((int) (lz2.a(m13VarM0, pf1Var, xl0Var, str + '\n' + str, 2) & 4294967295L)) - iA;
            int i = this.w;
            this.z = i == 1 ? -1 : ((i - 1) * iA2) + iA;
            int i2 = this.x;
            this.A = i2 == Integer.MAX_VALUE ? -1 : ((i2 - 1) * iA2) + iA;
            this.y = false;
        }
        int i3 = this.z;
        int iD = i3 != -1 ? ci0.D(i3, fz.i(j), fz.g(j)) : fz.i(j);
        int i4 = this.A;
        sz1 sz1VarE = if1Var.e(fz.a(j, 0, 0, iD, i4 != -1 ? ci0.D(i4, fz.i(j), fz.g(j)) : fz.g(j), 3));
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new pg(sz1VarE, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60
    public final void w0() {
        this.B = xe1.k0(this.v, sp0.c0(this).G);
        this.y = true;
        gf1.A(this);
    }
}
