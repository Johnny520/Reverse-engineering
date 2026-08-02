package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 implements a82, d20 {
    public final a20 h;
    public final mn0 i;
    public final s00 j;
    public zt2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y51(a20 a20Var, mn0 mn0Var) {
        this.h = a20Var;
        this.i = mn0Var;
        this.j = te.e(a20Var.k(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void a() {
        zt2 zt2Var = this.k;
        if (zt2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            zt2Var.c(cancellationException);
        }
        this.k = p7.A(this.j, null, this.i, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void d() {
        zt2 zt2Var = this.k;
        if (zt2Var != null) {
            zt2Var.D(new mm0(1));
        }
        this.k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void f() {
        zt2 zt2Var = this.k;
        if (zt2Var != null) {
            zt2Var.D(new mm0(1));
        }
        this.k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y10
    public final z10 getKey() {
        return gd3.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 k(a20 a20Var) {
        return xe1.f0(this, a20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final y10 o(z10 z10Var) {
        return xe1.u(this, z10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d20
    public final void p(a20 a20Var, Throwable th) throws Throwable {
        cy cyVar = (cy) a20Var.o(cy.i);
        if (cyVar != null) {
            se.R(th, new r1(12, cyVar, this));
        }
        d20 d20Var = (d20) this.h.o(gd3.q);
        if (d20Var == null) {
            throw th;
        }
        d20Var.p(a20Var, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final Object r(mn0 mn0Var, Object obj) {
        return mn0Var.g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 u(z10 z10Var) {
        return xe1.W(this, z10Var);
    }
}
