package p322w0;

import p085fg.InterfaceC1231l;
import p266s0.AbstractC3879i;

/* JADX INFO: renamed from: w0.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4675z extends AbstractC4655f {

    /* JADX INFO: renamed from: e */
    public final AbstractC4655f f15562e;

    /* JADX INFO: renamed from: f */
    public final boolean f15563f;

    /* JADX INFO: renamed from: g */
    public final boolean f15564g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1231l f15565h;

    /* JADX INFO: renamed from: i */
    public final long f15566i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4675z(AbstractC4655f abstractC4655f, InterfaceC1231l interfaceC1231l, boolean z9, boolean z10) {
        InterfaceC1231l interfaceC1231lMo9095e;
        super(0L, C4659j.f15501k);
        C4661l c4661l = AbstractC4662m.f15510a;
        this.f15562e = abstractC4655f;
        this.f15563f = z9;
        this.f15564g = z10;
        this.f15565h = AbstractC4662m.m9130k(interfaceC1231l, (abstractC4655f == null || (interfaceC1231lMo9095e = abstractC4655f.mo9095e()) == null) ? AbstractC4662m.f15519j.f15474e : interfaceC1231lMo9095e, z9);
        this.f15566i = AbstractC3879i.m8069c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: c */
    public final void mo9086c() {
        AbstractC4655f abstractC4655f;
        this.f15491c = true;
        if (!this.f15564g || (abstractC4655f = this.f15562e) == null) {
            return;
        }
        abstractC4655f.mo9086c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: d */
    public final C4659j mo9108d() {
        return m9168v().mo9108d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: e */
    public final InterfaceC1231l mo9095e() {
        return this.f15565h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: f */
    public final boolean mo9096f() {
        return m9168v().mo9096f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: g */
    public final long mo9109g() {
        return m9168v().mo9109g();
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
        AbstractC4666q.m9155l();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: l */
    public final void mo9088l() {
        AbstractC4666q.m9155l();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: m */
    public final void mo9089m() {
        m9168v().mo9089m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: n */
    public final void mo9099n(InterfaceC4670u interfaceC4670u) {
        m9168v().mo9099n(interfaceC4670u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: u */
    public final AbstractC4655f mo9090u(InterfaceC1231l interfaceC1231l) {
        InterfaceC1231l interfaceC1231lM9130k = AbstractC4662m.m9130k(interfaceC1231l, this.f15565h, true);
        return !this.f15563f ? AbstractC4662m.m9126g(m9168v().mo9090u(null), interfaceC1231lM9130k, true) : m9168v().mo9090u(interfaceC1231lM9130k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final AbstractC4655f m9168v() {
        AbstractC4655f abstractC4655f = this.f15562e;
        return abstractC4655f == null ? AbstractC4662m.f15519j : abstractC4655f;
    }
}
