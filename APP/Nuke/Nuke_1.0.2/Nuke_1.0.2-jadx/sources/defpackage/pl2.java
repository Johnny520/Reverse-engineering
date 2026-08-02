package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pl2 extends u60 implements gy, os1 {
    public n50 A;
    public bk1 B;
    public boolean C;
    public s8 D;
    public am2 E;
    public t60 F;
    public t8 G;
    public s8 H;
    public boolean I;
    public bm2 x;
    public qv1 y;
    public boolean z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        this.I = Q0();
        P0();
        if (this.E == null) {
            bm2 bm2Var = this.x;
            am2 am2Var = new am2(this.C ? this.H : this.D, this.A, this.B, this.y, bm2Var, this.z, this.I);
            M0(am2Var);
            this.E = am2Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        t60 t60Var = this.F;
        if (t60Var != null) {
            N0(t60Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        t8 t8Var = (t8) p40.p(this, xv1.a);
        if (t11.l(t8Var, this.G)) {
            return;
        }
        this.G = t8Var;
        this.H = null;
        t60 t60Var = this.F;
        if (t60Var != null) {
            N0(t60Var);
        }
        this.F = null;
        P0();
        am2 am2Var = this.E;
        if (am2Var != null) {
            bm2 bm2Var = this.x;
            qv1 qv1Var = this.y;
            am2Var.d1(this.C ? this.H : this.D, this.A, this.B, qv1Var, bm2Var, this.z, this.I);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P0() {
        t60 t60Var = this.F;
        if (t60Var != null) {
            if (((th1) t60Var).h.u) {
                return;
            }
            M0(t60Var);
            return;
        }
        if (this.C) {
            s11.S(this, new ta(22, this));
        }
        s8 s8Var = this.C ? this.H : this.D;
        if (s8Var != null) {
            u60 u60Var = s8Var.i;
            if (u60Var.h.u) {
                return;
            }
            M0(u60Var);
            this.F = u60Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean Q0() {
        return (this.u ? sp0.c0(this).G : d61.h) != d61.i || this.y == qv1.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R0(s8 s8Var, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        boolean z3;
        this.x = bm2Var;
        this.y = qv1Var;
        boolean z4 = true;
        if (this.C != z) {
            this.C = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (t11.l(this.D, s8Var)) {
            z4 = false;
        } else {
            this.D = s8Var;
        }
        if (z3 || (z4 && !z)) {
            t60 t60Var = this.F;
            if (t60Var != null) {
                N0(t60Var);
            }
            this.F = null;
            P0();
        }
        this.z = z2;
        this.A = n50Var;
        this.B = bk1Var;
        boolean zQ0 = Q0();
        this.I = zQ0;
        am2 am2Var = this.E;
        if (am2Var != null) {
            am2Var.d1(this.C ? this.H : this.D, n50Var, bk1Var, qv1Var, bm2Var, z2, zQ0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60
    public final void w0() {
        boolean zQ0 = Q0();
        if (this.I != zQ0) {
            this.I = zQ0;
            bm2 bm2Var = this.x;
            qv1 qv1Var = this.y;
            boolean z = this.C;
            R0(z ? this.H : this.D, this.A, this.B, qv1Var, bm2Var, z, this.z);
        }
    }
}
