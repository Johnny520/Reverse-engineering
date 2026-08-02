package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 extends vr2 {

    /* JADX INFO: renamed from: e */
    public final in0 f8407e;

    /* JADX INFO: renamed from: f */
    public final vr2 f8408f;

    public pm1(long j, bs2 bs2Var, in0 in0Var, vr2 vr2Var) {
        super(j, bs2Var);
        this.f8407e = in0Var;
        this.f8408f = vr2Var;
        vr2Var.mo82k();
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: c */
    public final void mo75c() {
        vr2 vr2Var = this.f8408f;
        if (this.f12148c) {
            return;
        }
        if (this.f12147b != vr2Var.mo79g()) {
            m5785a();
        }
        vr2Var.mo83l();
        this.f12148c = true;
        synchronized (ds2.f2181c) {
            m5788o();
        }
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: e */
    public final in0 mo77e() {
        return this.f8407e;
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
        p40.m3719b0();
        throw null;
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: l */
    public final void mo83l() {
        p40.m3719b0();
        throw null;
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
        return new pm1(this.f12147b, this.f12146a, ds2.m1127k(in0Var, this.f8407e, true), this.f8408f);
    }

    @Override // p000.vr2
    /* JADX INFO: renamed from: m */
    public final void mo84m() {
    }
}
