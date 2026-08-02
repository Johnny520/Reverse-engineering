package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yw extends v3 {
    public final j20 j;
    public mn0 k;
    public jn l;
    public zt2 m;
    public boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yw(j20 j20Var, m22 m22Var) {
        super(m22Var);
        this.j = j20Var;
        this.k = new sb(2, null, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final void e() {
        jn jnVar = this.l;
        if (jnVar != null) {
            jnVar.g(new CancellationException("onBack cancelled"), true);
        }
        zt2 zt2Var = this.m;
        if (zt2Var != null) {
            zt2Var.c(null);
        }
        this.l = null;
        this.m = null;
        this.n = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final void f() {
        if (this.l != null && !this.n) {
            e();
        }
        t00 t00Var = null;
        if (this.l == null) {
            this.n = false;
            this.l = fg1.a(-2, 4, hn.h);
            this.m = p7.A(this.j, null, new a2(this, t00Var, 10), 3);
        }
        jn jnVar = this.l;
        if (jnVar != null) {
            jnVar.g(null, false);
        }
        this.n = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final void g(dj djVar) {
        jn jnVar = this.l;
        if (jnVar != null) {
            jnVar.s(djVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final void h() {
        e();
        if (super.d()) {
            this.n = true;
            this.l = fg1.a(-2, 4, hn.h);
            this.m = p7.A(this.j, null, new a2(this, null, 10), 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final void j(boolean z) {
        zt2 zt2Var;
        if (!z && super.d() && (zt2Var = this.m) != null && !zt2Var.b()) {
            e();
        }
        super.j(z);
    }
}
