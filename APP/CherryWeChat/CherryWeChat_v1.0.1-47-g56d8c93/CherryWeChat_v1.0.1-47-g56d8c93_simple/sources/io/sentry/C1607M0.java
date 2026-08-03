package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;

/* JADX INFO: renamed from: io.sentry.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1607M0 implements InterfaceC1629S {

    /* JADX INFO: renamed from: b */
    public static final C1607M0 f5787b = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f5788a;

    static {
        f5787b = new C1607M0();
    }

    public C1607M0() {
        this.f5788a = C2046v2.empty();
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: a */
    public final void mo3707a(boolean r1) {
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: b */
    public final void mo3708b(long r1) {
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: c */
    public final C2021p mo3709c() {
        return null;
    }

    @Override // io.sentry.InterfaceC1651Z
    public final InterfaceC1629S clone() {
        return f5787b;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: d */
    public final InterfaceC1895i0 mo3710d() {
        return null;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: e */
    public final boolean mo3711e() {
        return true;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: f */
    public final void mo3712f(C1871f r1, C1586H r2) {
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: g */
    public final C1970t mo3713g(C1901c r1, C1586H r2) {
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: h */
    public final C1970t mo3714h(C1867e1 r1) {
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: i */
    public final void mo3715i() {
    }

    @Override // io.sentry.InterfaceC1651Z
    public final boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: j */
    public final void mo3716j() {
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: k */
    public final InterfaceC1895i0 mo3717k(C1621P2 r1, C1625Q2 r2) {
        return C1643W0.f5888a;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: l */
    public final C2046v2 mo3718l() {
        return this.f5788a;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: m */
    public final void mo3719m(InterfaceC2000s1 r1) {
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: n */
    public final boolean mo3724n() {
        return true;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: o */
    public final C1970t mo3720o(C1944A r1, C1613N2 r2, C1586H r3, C1881h1 r4) {
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: p */
    public final C1970t mo3721p(C2059x2 r1, C1586H r2) {
        return C1970t.f7011b;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: q */
    public final InterfaceC1651Z mo3722q(String r1) {
        return C1615O0.f5812b;
    }

    @Override // io.sentry.InterfaceC1651Z
    /* JADX INFO: renamed from: r */
    public final C1970t mo3723r(C1627R1 r1, C1586H r2) {
        return C1970t.f7011b;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m5481clone() {
        return f5787b;
    }
}
