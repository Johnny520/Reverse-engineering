package p322w0;

import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: w0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4654e extends AbstractC4655f {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1231l f15487e;

    /* JADX INFO: renamed from: f */
    public int f15488f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4654e(long j3, C4659j c4659j, InterfaceC1231l interfaceC1231l) {
        super(j3, c4659j);
        this.f15487e = interfaceC1231l;
        this.f15488f = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: c */
    public final void mo9086c() {
        if (this.f15491c) {
            return;
        }
        mo9088l();
        this.f15491c = true;
        synchronized (AbstractC4662m.f15512c) {
            m9111o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: e */
    public final InterfaceC1231l mo9095e() {
        return this.f15487e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: f */
    public final boolean mo9096f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: i */
    public final InterfaceC1231l mo9098i() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: k */
    public final void mo9087k() {
        this.f15488f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: l */
    public final void mo9088l() {
        int i9 = this.f15488f - 1;
        this.f15488f = i9;
        if (i9 == 0) {
            m9107a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: n */
    public final void mo9099n(InterfaceC4670u interfaceC4670u) {
        C4661l c4661l = AbstractC4662m.f15510a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: u */
    public final AbstractC4655f mo9090u(InterfaceC1231l interfaceC1231l) {
        AbstractC4662m.m9122c(this);
        return new C4653d(this.f15490b, this.f15489a, AbstractC4662m.m9130k(interfaceC1231l, this.f15487e, true), this);
    }

    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: m */
    public final void mo9089m() {
    }
}
