package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;

/* JADX INFO: renamed from: io.sentry.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2054w1 implements InterfaceC1651Z {

    /* JADX INFO: renamed from: a */
    public static final C2054w1 f7276a = null;

    static {
        f7276a = new C2054w1();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: a */
    public final void mo3707a(boolean r1) {
        AbstractC2066z1.m4232a();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: b */
    public final void mo3708b(long r2) {
        AbstractC2066z1.m4233b().mo3708b(r2);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: c */
    public final C2021p mo3709c() {
        return AbstractC2066z1.m4233b().mo3709c();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object m5486clone() {
        return clone();
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
    public final void mo3712f(C1871f r2, C1586H r3) {
        AbstractC2066z1.m4233b().mo3712f(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: g */
    public final C1970t mo3713g(C1901c r2, C1586H r3) {
        return AbstractC2066z1.m4233b().mo3713g(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: h */
    public final C1970t mo3714h(C1867e1 r2) {
        return AbstractC2066z1.m4233b().mo3714h(r2);
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
    public final InterfaceC1895i0 mo3717k(C1621P2 r2, C1625Q2 r3) {
        return AbstractC2066z1.m4233b().mo3717k(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: l */
    public final C2046v2 mo3718l() {
        return AbstractC2066z1.m4233b().mo3718l();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: m */
    public final void mo3719m(InterfaceC2000s1 r2) {
        AbstractC2066z1.m4233b().mo3719m(r2);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: o */
    public final C1970t mo3720o(C1944A r2, C1613N2 r3, C1586H r4, C1881h1 r5) {
        return AbstractC2066z1.m4233b().mo3720o(r2, r3, r4, r5);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: p */
    public final C1970t mo3721p(C2059x2 r2, C1586H r3) {
        return AbstractC2066z1.m4233b().mo3721p(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: q */
    public final InterfaceC1651Z mo3722q(String r2) {
        return AbstractC2066z1.m4233b().mo3722q("getCurrentScopes");
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: r */
    public final C1970t mo3723r(C1627R1 r2, C1586H r3) {
        return AbstractC2066z1.m4233b().mo3723r(r2, r3);
    }

    /* JADX INFO: renamed from: s */
    public final void m4224s(C1871f r2) {
        mo3712f(r2, new C1586H());
    }

    @Override // io.sentry.InterfaceC1651Z
    public final InterfaceC1629S clone() {
        return AbstractC2066z1.m4233b().clone();
    }
}
