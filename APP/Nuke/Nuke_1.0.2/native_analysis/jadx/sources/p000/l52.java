package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l52 extends vr2 {

    /* JADX INFO: renamed from: e */
    public final in0 f5939e;

    /* JADX INFO: renamed from: f */
    public int f5940f;

    public l52(long j, bs2 bs2Var, in0 in0Var) {
        super(j, bs2Var);
        this.f5939e = in0Var;
        this.f5940f = 1;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: c */
    public final void mo75c() {
        if (this.f12148c) {
            return;
        }
        mo83l();
        this.f12148c = true;
        synchronized (ds2.f2181c) {
            m5788o();
        }
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: e */
    public final in0 mo77e() {
        return this.f5939e;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: f */
    public final boolean mo78f() {
        return true;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: i */
    public final in0 mo81i() {
        return null;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: k */
    public final void mo82k() {
        this.f5940f++;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: l */
    public final void mo83l() {
        int i = this.f5940f - 1;
        this.f5940f = i;
        if (i == 0) {
            m5785a();
        }
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: n */
    public final void mo85n(pu2 pu2Var) {
        ml2 ml2Var = ds2.f2179a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: u */
    public final vr2 mo89u(in0 in0Var) {
        ds2.m1119c(this);
        return new pm1(this.f12147b, this.f12146a, ds2.m1127k(in0Var, this.f5939e, true), this);
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: m */
    public final void mo84m() {
    }
}
