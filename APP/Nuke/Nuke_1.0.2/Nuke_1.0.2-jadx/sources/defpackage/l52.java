package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l52 extends vr2 {
    public final in0 e;
    public int f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l52(long j, bs2 bs2Var, in0 in0Var) {
        super(j, bs2Var);
        this.e = in0Var;
        this.f = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vr2
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
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
        ds2.c(this);
        return new pm1(this.b, this.a, ds2.k(in0Var, this.e, true), this);
    }

    @Override // defpackage.vr2
    public final void m() {
    }
}
