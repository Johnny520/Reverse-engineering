package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j03 extends th1 implements gy, j61 {
    public final m13 v;
    public m63 w;
    public h03 x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j03(m13 m13Var) {
        this.v = m13Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        m13 m13VarK0 = xe1.k0(this.v, sp0.c0(this).G);
        xl0 xl0Var = (xl0) p40.p(this, ly.k);
        M0(m13VarK0, xl0Var);
        d61 d61Var = sp0.c0(this).G;
        e70 e70Var = sp0.c0(this).F;
        m63 m63Var = this.w;
        if (m63Var != null) {
            this.x = new h03(d61Var, e70Var, xl0Var, m13VarK0, m63Var.h);
        } else {
            nz0.b("Font resolution state is not set.");
            s.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        this.w = null;
        this.x = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0(m13 m13Var, xl0 xl0Var) {
        lt2 lt2Var = m13Var.a;
        mx2 mx2Var = lt2Var.f;
        im0 im0Var = lt2Var.c;
        if (im0Var == null) {
            im0Var = im0.j;
        }
        gm0 gm0Var = lt2Var.d;
        int i = gm0Var != null ? gm0Var.a : 0;
        hm0 hm0Var = lt2Var.e;
        this.w = ((yl0) xl0Var).b(mx2Var, im0Var, i, hm0Var != null ? hm0Var.a : 65535);
        gf1.A(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60, defpackage.r12
    public final void a() {
        h03 h03Var = this.x;
        if (h03Var != null) {
            h03.a(h03Var, null, sp0.c0(this).F, null, 29);
        }
        gf1.A(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        h03 h03Var = this.x;
        if (h03Var == null) {
            nz0.b("Min size state is not set.");
            s.b();
            return null;
        }
        nx1 nx1Var = h03Var.f;
        m63 m63Var = this.w;
        if (m63Var == null) {
            nz0.b("Font resolution state is not set.");
            s.b();
            return null;
        }
        Object obj = m63Var.h;
        if (!t11.l(obj, h03Var.e)) {
            h03Var.e = obj;
            nx1Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) nx1Var.getValue()).booleanValue()) {
            h03Var.g = lz2.a(h03Var.d, h03Var.b, h03Var.c, lz2.a, 1);
            nx1Var.setValue(Boolean.FALSE);
        }
        long j2 = h03Var.g;
        sz1 sz1VarE = if1Var.e(gz.e(j, gz.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new pg(sz1VarE, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60
    public final void w0() {
        h03 h03Var = this.x;
        if (h03Var != null) {
            h03.a(h03Var, sp0.c0(this).G, null, null, 30);
        }
        gf1.A(this);
    }
}
