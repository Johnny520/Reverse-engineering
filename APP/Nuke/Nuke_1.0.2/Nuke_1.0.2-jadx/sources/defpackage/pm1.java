package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 extends vr2 {
    public final in0 e;
    public final vr2 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pm1(long j, bs2 bs2Var, in0 in0Var, vr2 vr2Var) {
        super(j, bs2Var);
        this.e = in0Var;
        this.f = vr2Var;
        vr2Var.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void c() {
        vr2 vr2Var = this.f;
        if (this.c) {
            return;
        }
        if (this.b != vr2Var.g()) {
            a();
        }
        vr2Var.l();
        this.c = true;
        synchronized (ds2.c) {
            o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final in0 e() {
        return this.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final boolean f() {
        return true;
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
    public final void n(pu2 pu2Var) {
        ml2 ml2Var = ds2.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final vr2 u(in0 in0Var) {
        return new pm1(this.b, this.a, ds2.k(in0Var, this.e, true), this.f);
    }

    @Override // defpackage.vr2
    public final void m() {
    }
}
