package p158f0;

import p092S0.C1286x;
import p112W2.InterfaceC1601c;
import p136b0.AbstractC1848j;
import p186k.C2409F;

/* JADX INFO: renamed from: f0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2094z extends C2070b {

    /* JADX INFO: renamed from: o */
    public final C2070b f7016o;

    /* JADX INFO: renamed from: p */
    public final boolean f7017p;

    /* JADX INFO: renamed from: q */
    public final boolean f7018q;

    /* JADX INFO: renamed from: r */
    public InterfaceC1601c f7019r;

    /* JADX INFO: renamed from: s */
    public InterfaceC1601c f7020s;

    /* JADX INFO: renamed from: t */
    public final long f7021t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2094z(C2070b c2070b, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2, boolean z5, boolean z6) {
        InterfaceC1601c interfaceC1601cMo3792i;
        InterfaceC1601c interfaceC1601cMo3789e;
        C1286x c1286x = AbstractC2082n.f6970a;
        super(0L, C2080l.f6962h, AbstractC2082n.m3835k(interfaceC1601c, (c2070b == null || (interfaceC1601cMo3789e = c2070b.mo3789e()) == null) ? AbstractC2082n.f6979j.f6930e : interfaceC1601cMo3789e, z5), AbstractC2082n.m3836l(interfaceC1601c2, (c2070b == null || (interfaceC1601cMo3792i = c2070b.mo3792i()) == null) ? AbstractC2082n.f6979j.f6931f : interfaceC1601cMo3792i));
        this.f7016o = c2070b;
        this.f7017p = z5;
        this.f7018q = z6;
        this.f7019r = this.f6930e;
        this.f7020s = this.f6931f;
        this.f7021t = AbstractC1848j.m3313b();
    }

    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: B */
    public final void mo3802B(C2409F c2409f) {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: C */
    public final C2070b mo3799C(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        InterfaceC1601c interfaceC1601cM3835k = AbstractC2082n.m3835k(interfaceC1601c, this.f7019r, true);
        InterfaceC1601c interfaceC1601cM3836l = AbstractC2082n.m3836l(interfaceC1601c2, this.f7020s);
        return !this.f7017p ? new C2094z(m3872D().mo3799C(null, interfaceC1601cM3836l), interfaceC1601cM3835k, interfaceC1601cM3836l, false, true) : m3872D().mo3799C(interfaceC1601cM3835k, interfaceC1601cM3836l);
    }

    /* JADX INFO: renamed from: D */
    public final C2070b m3872D() {
        C2070b c2070b = this.f7016o;
        return c2070b == null ? AbstractC2082n.f6979j : c2070b;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public final void mo3787c() {
        C2070b c2070b;
        this.f6947c = true;
        if (!this.f7018q || (c2070b = this.f7016o) == null) {
            return;
        }
        c2070b.mo3787c();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: d */
    public final C2080l mo3788d() {
        return m3872D().mo3788d();
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c mo3789e() {
        return this.f7019r;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: f */
    public final boolean mo3790f() {
        return m3872D().mo3790f();
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: g */
    public final long mo3791g() {
        return m3872D().mo3791g();
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: h */
    public final int mo3804h() {
        return m3872D().mo3804h();
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: i */
    public final InterfaceC1601c mo3792i() {
        return this.f7020s;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: k */
    public final void mo3793k() {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: l */
    public final void mo3794l() {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: m */
    public final void mo3795m() {
        m3872D().mo3795m();
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: n */
    public final void mo3796n(InterfaceC2090v interfaceC2090v) {
        m3872D().mo3796n(interfaceC2090v);
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: r */
    public final void mo3815r(C2080l c2080l) {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: s */
    public final void mo3816s(long j5) {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: t */
    public final void mo3806t(int i5) {
        m3872D().mo3806t(i5);
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: u */
    public final AbstractC2074f mo3797u(InterfaceC1601c interfaceC1601c) {
        InterfaceC1601c interfaceC1601cM3835k = AbstractC2082n.m3835k(interfaceC1601c, this.f7019r, true);
        return !this.f7017p ? AbstractC2082n.m3831g(m3872D().mo3797u(null), interfaceC1601cM3835k, true) : m3872D().mo3797u(interfaceC1601cM3835k);
    }

    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: w */
    public final AbstractC2086r mo3800w() {
        return m3872D().mo3800w();
    }

    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: x */
    public final C2409F mo3808x() {
        return m3872D().mo3808x();
    }

    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: y */
    public final InterfaceC1601c mo3789e() {
        return this.f7019r;
    }
}
