package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends l21 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0742sw f1808e;

    /* JADX INFO: renamed from: f */
    public int f1809f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ft0(long j, q21 q21Var, InterfaceC0742sw interfaceC0742sw) {
        super(j, q21Var);
        this.f1808e = interfaceC0742sw;
        this.f1809f = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: c */
    public final void mo807c() {
        if (this.f3331c) {
            return;
        }
        mo815l();
        this.f3331c = true;
        synchronized (t21.f5893c) {
            m1970o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: e */
    public final InterfaceC0742sw mo809e() {
        return this.f1808e;
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
        this.f1809f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.l21
    /* JADX INFO: renamed from: l */
    public final void mo815l() {
        int i = this.f1809f - 1;
        this.f1809f = i;
        if (i == 0) {
            m1967a();
        }
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
        t21.m4165c(this);
        return new zi0(this.f3330b, this.f3329a, t21.m4173k(interfaceC0742sw, this.f1808e, true), this);
    }

    @Override // p000.l21
    /* JADX INFO: renamed from: m */
    public final void mo816m() {
    }
}
