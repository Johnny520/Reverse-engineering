package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c82 implements j20, a82 {
    public static final pp k = new pp(0);
    public final a20 h;
    public final c82 i = this;
    public volatile a20 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c82(a20 a20Var) {
        this.h = a20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        synchronized (this.i) {
            try {
                a20 a20Var = this.j;
                if (a20Var == null) {
                    this.j = k;
                } else {
                    mm0 mm0Var = new mm0(0);
                    k21 k21Var = (k21) a20Var.o(sn.K);
                    if (k21Var != null) {
                        k21Var.c(mm0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void d() {
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a82
    public final void f() {
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j20
    public final a20 g() {
        a20 a20VarK;
        a20 a20Var = this.j;
        if (a20Var == null || a20Var == k) {
            cy cyVar = (cy) this.h.o(cy.i);
            a20 b82Var = cyVar != null ? new b82(cyVar, this) : zd0.h;
            synchronized (this.i) {
                try {
                    a20 a20Var2 = this.j;
                    if (a20Var2 == null) {
                        a20 a20Var3 = this.h;
                        a20VarK = a20Var3.k(new m21((k21) a20Var3.o(sn.K))).k(zd0.h).k(b82Var);
                    } else if (a20Var2 == k) {
                        a20 a20Var4 = this.h;
                        m21 m21Var = new m21((k21) a20Var4.o(sn.K));
                        m21Var.z(new mm0(0));
                        a20VarK = a20Var4.k(m21Var).k(zd0.h).k(b82Var);
                    } else {
                        a20VarK = a20Var2;
                    }
                    this.j = a20VarK;
                } catch (Throwable th) {
                    throw th;
                }
            }
            a20Var = a20VarK;
        }
        a20Var.getClass();
        return a20Var;
    }

    @Override // defpackage.a82
    public final void a() {
    }
}
