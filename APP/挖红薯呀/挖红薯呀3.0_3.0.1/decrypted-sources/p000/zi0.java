package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 extends l21 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0742sw f7910e;

    /* JADX INFO: renamed from: f */
    public final l21 f7911f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zi0(long j, q21 q21Var, InterfaceC0742sw interfaceC0742sw, l21 l21Var) {
        super(j, q21Var);
        this.f7910e = interfaceC0742sw;
        this.f7911f = l21Var;
        l21Var.mo814k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: c */
    public final void mo807c() {
        l21 l21Var = this.f7911f;
        if (this.f3331c) {
            return;
        }
        if (this.f3330b != l21Var.mo811g()) {
            m1967a();
        }
        l21Var.mo815l();
        this.f3331c = true;
        synchronized (t21.f5893c) {
            m1970o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: e */
    public final InterfaceC0742sw mo809e() {
        return this.f7910e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: f */
    public final boolean mo810f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: i */
    public final InterfaceC0742sw mo813i() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: k */
    public final void mo814k() {
        w60.m4892N();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: l */
    public final void mo815l() {
        w60.m4892N();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: n */
    public final void mo817n(d41 d41Var) {
        sx0 sx0Var = t21.f5891a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: u */
    public final l21 mo821u(InterfaceC0742sw interfaceC0742sw) {
        return new zi0(this.f3330b, this.f3329a, t21.m4173k(interfaceC0742sw, this.f7910e, true), this.f7911f);
    }

    @Override // p000.l21
    /* JADX INFO: renamed from: m */
    public final void mo816m() {
    }
}
