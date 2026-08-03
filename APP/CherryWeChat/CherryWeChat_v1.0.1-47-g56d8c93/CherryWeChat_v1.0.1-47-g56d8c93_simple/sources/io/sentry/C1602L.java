package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;

/* JADX INFO: renamed from: io.sentry.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1602L implements InterfaceC1629S {

    /* JADX INFO: renamed from: a */
    public final C2045v1 f5782a;

    public C1602L(C2045v1 r1) {
        this.f5782a = r1;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: a */
    public final void mo3707a(boolean r2) {
        this.f5782a.mo3707a(r2);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: b */
    public final void mo3708b(long r2) {
        this.f5782a.mo3708b(r2);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: c */
    public final C2021p mo3709c() {
        return this.f5782a.mo3709c();
    }

    @Override // io.sentry.InterfaceC1651Z
    public final InterfaceC1629S clone() {
        return this.f5782a.clone();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: d */
    public final InterfaceC1895i0 mo3710d() {
        return this.f5782a.mo3710d();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: e */
    public final boolean mo3711e() {
        return this.f5782a.mo3711e();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: f */
    public final void mo3712f(C1871f r2, C1586H r3) {
        this.f5782a.mo3712f(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: g */
    public final C1970t mo3713g(C1901c r2, C1586H r3) {
        return this.f5782a.mo3713g(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: h */
    public final C1970t mo3714h(C1867e1 r2) {
        return this.f5782a.mo3714h(r2);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: i */
    public final void mo3715i() {
        this.f5782a.mo3715i();
    }

    @Override // io.sentry.InterfaceC1651Z
    public final boolean isEnabled() {
        return this.f5782a.isEnabled();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: j */
    public final void mo3716j() {
        this.f5782a.mo3716j();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: k */
    public final InterfaceC1895i0 mo3717k(C1621P2 r2, C1625Q2 r3) {
        return this.f5782a.mo3717k(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: l */
    public final C2046v2 mo3718l() {
        return this.f5782a.mo3718l();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: m */
    public final void mo3719m(InterfaceC2000s1 r2) {
        this.f5782a.mo3719m(r2);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: o */
    public final C1970t mo3720o(C1944A r2, C1613N2 r3, C1586H r4, C1881h1 r5) {
        return this.f5782a.mo3720o(r2, r3, r4, r5);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: p */
    public final C1970t mo3721p(C2059x2 r2, C1586H r3) {
        return this.f5782a.mo3721p(r2, r3);
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: q */
    public final InterfaceC1651Z mo3722q(String r2) {
        return this.f5782a.mo3722q("getCurrentScopes");
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: r */
    public final C1970t mo3723r(C1627R1 r2, C1586H r3) {
        return this.f5782a.mo3723r(r2, r3);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m5480clone() {
        return this.f5782a.clone();
    }
}
