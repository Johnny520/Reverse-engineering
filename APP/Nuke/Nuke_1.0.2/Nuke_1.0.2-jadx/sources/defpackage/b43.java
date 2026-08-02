package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b43 extends vr2 {
    public final vr2 e;
    public final boolean f;
    public final boolean g;
    public in0 h;
    public final long i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(vr2 vr2Var, in0 in0Var, boolean z, boolean z2) {
        in0 in0VarE;
        super(0L, bs2.l);
        ml2 ml2Var = ds2.a;
        this.e = vr2Var;
        this.f = z;
        this.g = z2;
        this.h = ds2.k(in0Var, (vr2Var == null || (in0VarE = vr2Var.e()) == null) ? ds2.j.e : in0VarE, z);
        this.i = v93.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void c() {
        vr2 vr2Var;
        this.c = true;
        if (!this.g || (vr2Var = this.e) == null) {
            return;
        }
        vr2Var.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final bs2 d() {
        return v().d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final in0 e() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final boolean f() {
        return v().f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final long g() {
        return v().g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final in0 i() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void k() {
        p40.b0();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void l() {
        p40.b0();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void m() {
        v().m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void n(pu2 pu2Var) {
        v().n(pu2Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final vr2 u(in0 in0Var) {
        in0 in0VarK = ds2.k(in0Var, this.h, true);
        return !this.f ? ds2.g(v().u(null), in0VarK, true) : v().u(in0VarK);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final vr2 v() {
        vr2 vr2Var = this.e;
        return vr2Var == null ? ds2.j : vr2Var;
    }
}
