package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ge1 extends th1 implements dq0, mc0, on2, os1 {
    public e02 A;
    public n70 C;
    public h11 E;
    public jn F;
    public gp1 v;
    public f03 w;
    public f02 x;
    public View y;
    public e70 z;
    public final nx1 B = new nx1(null, gd3.C);
    public long D = 9205357640488583168L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ge1(gp1 gp1Var, f03 f03Var, f02 f02Var) {
        this.v = gp1Var;
        this.w = f03Var;
        this.x = f02Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        L();
        this.F = fg1.a(0, 7, null);
        p7.A(A0(), null, new h50(this, (t00) null, 4), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        e02 e02Var = this.A;
        if (e02Var != null) {
            ((g02) e02Var).b();
        }
        this.A = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        s11.S(this, new fe1(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long M0() {
        if (this.C == null) {
            this.C = op0.m(new fe1(this, 2));
        }
        n70 n70Var = this.C;
        if (n70Var != null) {
            return ((rs1) n70Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N0() {
        e02 e02Var = this.A;
        if (e02Var != null) {
            ((g02) e02Var).b();
        }
        View viewH = this.y;
        if (viewH == null) {
            viewH = tp0.H(this);
        }
        this.y = viewH;
        e70 e70Var = this.z;
        if (e70Var == null) {
            e70Var = sp0.c0(this).F;
        }
        this.z = e70Var;
        this.A = this.x.b(viewH, e70Var);
        P0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O0() {
        e70 e70Var = this.z;
        if (e70Var == null) {
            e70Var = sp0.c0(this).F;
            this.z = e70Var;
        }
        long j = ((rs1) this.v.j(e70Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & M0()) == 9205357640488583168L) {
            this.D = 9205357640488583168L;
            e02 e02Var = this.A;
            if (e02Var != null) {
                ((g02) e02Var).b();
                return;
            }
            return;
        }
        this.D = rs1.e(M0(), j);
        if (this.A == null) {
            N0();
        }
        e02 e02Var2 = this.A;
        if (e02Var2 != null) {
            e02Var2.a(this.D, 9205357640488583168L);
        }
        P0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        t61Var.a();
        jn jnVar = this.F;
        if (jnVar != null) {
            jnVar.s(a83.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P0() {
        e70 e70Var;
        e02 e02Var = this.A;
        if (e02Var == null || (e70Var = this.z) == null) {
            return;
        }
        g02 g02Var = (g02) e02Var;
        long jC = g02Var.c();
        h11 h11Var = this.E;
        if (h11Var != null && jC == h11Var.a) {
            return;
        }
        this.w.j(new cb0(e70Var.y(s11.q0(g02Var.c()))));
        this.E = new h11(g02Var.c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        zn2Var.a(he1.a, new fe1(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dq0
    public final void w(zn1 zn1Var) {
        this.B.setValue(zn1Var);
    }
}
