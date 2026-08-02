package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l61 extends zn1 {
    public static final q9 a0;
    public j61 Y;
    public k61 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        q9 q9VarI = pp0.i();
        int i = ju.h;
        q9VarI.k(ju.e);
        q9VarI.q(1.0f);
        q9VarI.r(1);
        a0 = q9VarI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: j61 */
    /* JADX WARN: Multi-variable type inference failed */
    public l61(r61 r61Var, j61 j61Var) {
        super(r61Var);
        this.Y = j61Var;
        this.Z = r61Var.o != null ? new k61(this) : null;
        if ((((th1) j61Var).h.j & AIChatConfig.DefaultMaxTokens) == 0) {
            return;
        }
        c80.g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int N(int i) {
        j61 j61Var = this.Y;
        zn1 zn1Var = this.w;
        zn1Var.getClass();
        return j61Var.U(this, zn1Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final void N0() {
        if (this.Z == null) {
            this.Z = new k61(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final md1 Q0() {
        return this.Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final th1 S0() {
        return ((th1) this.Y).h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int W(int i) {
        j61 j61Var = this.Y;
        zn1 zn1Var = this.w;
        zn1Var.getClass();
        return j61Var.g(this, zn1Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int X(int i) {
        j61 j61Var = this.Y;
        zn1 zn1Var = this.w;
        zn1Var.getClass();
        return j61Var.D(this, zn1Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final sz1 e(long j) {
        k0(j);
        j61 j61Var = this.Y;
        zn1 zn1Var = this.w;
        zn1Var.getClass();
        l1(j61Var.e(this, zn1Var, j));
        c1();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int f(int i) {
        j61 j61Var = this.Y;
        zn1 zn1Var = this.w;
        zn1Var.getClass();
        return j61Var.p(this, zn1Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1
    public final void f0(long j, float f, in0 in0Var) {
        i1(j, f, in0Var);
        if (this.q) {
            return;
        }
        d1();
        zn1 zn1Var = this.w;
        zn1Var.getClass();
        zn1Var.r = this.r;
        A0().b();
        zn1Var.r = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final void h1(qp qpVar, pq0 pq0Var) {
        zn1 zn1Var;
        zn1 zn1Var2 = this.w;
        zn1Var2.getClass();
        zn1Var2.L0(qpVar, pq0Var);
        if (!((b7) u61.a(this.v)).getShowLayoutBounds() || (zn1Var = this.w) == null) {
            return;
        }
        if (h11.a(this.j, zn1Var.j) && z01.a(zn1Var.G, 0L)) {
            return;
        }
        long j = this.j;
        qpVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, a0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final int m0(du0 du0Var) {
        k61 k61Var = this.Z;
        if (k61Var == null) {
            return t11.k(this, du0Var);
        }
        gk1 gk1Var = k61Var.A;
        int iD = gk1Var.d(du0Var);
        if (iD >= 0) {
            return gk1Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: j61 */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u1(j61 j61Var) {
        if (j61Var.equals(this.Y) || (((th1) j61Var).h.j & AIChatConfig.DefaultMaxTokens) == 0) {
            this.Y = j61Var;
        } else {
            c80.g();
        }
    }
}
