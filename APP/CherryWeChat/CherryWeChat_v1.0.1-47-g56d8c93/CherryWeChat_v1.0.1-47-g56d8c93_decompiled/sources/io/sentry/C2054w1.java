package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;

/* JADX INFO: renamed from: io.sentry.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2054w1 implements InterfaceC1651Z {

    /* JADX INFO: renamed from: a */
    public static final C2054w1 f7276a = new C2054w1();

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: a */
    public final void mo3707a(boolean z) {
        AbstractC2066z1.m4232a();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: b */
    public final void mo3708b(long j) {
        AbstractC2066z1.m4233b().mo3708b(j);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: c */
    public final C2021p mo3709c() {
        return AbstractC2066z1.m4233b().mo3709c();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: d */
    public final InterfaceC1895i0 mo3710d() {
        return AbstractC2066z1.m4233b().mo3710d();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: e */
    public final boolean mo3711e() {
        return AbstractC2066z1.m4233b().mo3711e();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: f */
    public final void mo3712f(C1871f c1871f, C1586H c1586h) {
        AbstractC2066z1.m4233b().mo3712f(c1871f, c1586h);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: g */
    public final C1970t mo3713g(C1901c c1901c, C1586H c1586h) {
        return AbstractC2066z1.m4233b().mo3713g(c1901c, c1586h);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: h */
    public final C1970t mo3714h(C1867e1 c1867e1) {
        return AbstractC2066z1.m4233b().mo3714h(c1867e1);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: i */
    public final void mo3715i() {
        AbstractC2066z1.m4233b().mo3715i();
    }

    @Override // io.sentry.InterfaceC1651Z
    public final boolean isEnabled() {
        return AbstractC2066z1.m4233b().isEnabled();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: j */
    public final void mo3716j() {
        AbstractC2066z1.m4233b().mo3716j();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: k */
    public final InterfaceC1895i0 mo3717k(C1621P2 c1621p2, C1625Q2 c1625q2) {
        return AbstractC2066z1.m4233b().mo3717k(c1621p2, c1625q2);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: l */
    public final C2046v2 mo3718l() {
        return AbstractC2066z1.m4233b().mo3718l();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: m */
    public final void mo3719m(InterfaceC2000s1 interfaceC2000s1) {
        AbstractC2066z1.m4233b().mo3719m(interfaceC2000s1);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: o */
    public final C1970t mo3720o(C1944A c1944a, C1613N2 c1613n2, C1586H c1586h, C1881h1 c1881h1) {
        return AbstractC2066z1.m4233b().mo3720o(c1944a, c1613n2, c1586h, c1881h1);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: p */
    public final C1970t mo3721p(C2059x2 c2059x2, C1586H c1586h) {
        return AbstractC2066z1.m4233b().mo3721p(c2059x2, c1586h);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: q */
    public final InterfaceC1651Z mo3722q(String str) {
        return AbstractC2066z1.m4233b().mo3722q("getCurrentScopes");
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: r */
    public final C1970t mo3723r(C1627R1 c1627r1, C1586H c1586h) {
        return AbstractC2066z1.m4233b().mo3723r(c1627r1, c1586h);
    }

    /* JADX INFO: renamed from: s */
    public final void m4224s(C1871f c1871f) {
        mo3712f(c1871f, new C1586H());
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1629S m5486clone() {
        return AbstractC2066z1.m4233b().m5485clone();
    }
}
