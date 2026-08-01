package p158f0;

import p092S0.C1286x;
import p112W2.InterfaceC1601c;
import p136b0.AbstractC1848j;

/* JADX INFO: renamed from: f0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2068A extends AbstractC2074f {

    /* JADX INFO: renamed from: e */
    public final AbstractC2074f f6924e;

    /* JADX INFO: renamed from: f */
    public final boolean f6925f;

    /* JADX INFO: renamed from: g */
    public final boolean f6926g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1601c f6927h;

    /* JADX INFO: renamed from: i */
    public final long f6928i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2068A(AbstractC2074f abstractC2074f, InterfaceC1601c interfaceC1601c, boolean z5, boolean z6) {
        InterfaceC1601c interfaceC1601cMo3789e;
        super(0L, C2080l.f6962h);
        C1286x c1286x = AbstractC2082n.f6970a;
        this.f6924e = abstractC2074f;
        this.f6925f = z5;
        this.f6926g = z6;
        this.f6927h = AbstractC2082n.m3835k(interfaceC1601c, (abstractC2074f == null || (interfaceC1601cMo3789e = abstractC2074f.mo3789e()) == null) ? AbstractC2082n.f6979j.f6930e : interfaceC1601cMo3789e, z5);
        this.f6928i = AbstractC1848j.m3313b();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public final void mo3787c() {
        AbstractC2074f abstractC2074f;
        this.f6947c = true;
        if (!this.f6926g || (abstractC2074f = this.f6924e) == null) {
            return;
        }
        abstractC2074f.mo3787c();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: d */
    public final C2080l mo3788d() {
        return m3798v().mo3788d();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c mo3789e() {
        return this.f6927h;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: f */
    public final boolean mo3790f() {
        return m3798v().mo3790f();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: g */
    public final long mo3791g() {
        return m3798v().mo3791g();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: i */
    public final InterfaceC1601c mo3792i() {
        return null;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: k */
    public final void mo3793k() {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: l */
    public final void mo3794l() {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: m */
    public final void mo3795m() {
        m3798v().mo3795m();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: n */
    public final void mo3796n(InterfaceC2090v interfaceC2090v) {
        m3798v().mo3796n(interfaceC2090v);
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: u */
    public final AbstractC2074f mo3797u(InterfaceC1601c interfaceC1601c) {
        InterfaceC1601c interfaceC1601cM3835k = AbstractC2082n.m3835k(interfaceC1601c, this.f6927h, true);
        return !this.f6925f ? AbstractC2082n.m3831g(m3798v().mo3797u(null), interfaceC1601cM3835k, true) : m3798v().mo3797u(interfaceC1601cM3835k);
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC2074f m3798v() {
        AbstractC2074f abstractC2074f = this.f6924e;
        return abstractC2074f == null ? AbstractC2082n.f6979j : abstractC2074f;
    }
}
