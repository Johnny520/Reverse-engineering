package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;

/* JADX INFO: renamed from: io.sentry.Z */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1651Z {
    /* JADX INFO: renamed from: a */
    void mo3707a(boolean r1);

    /* JADX INFO: renamed from: b */
    void mo3708b(long r1);

    /* JADX INFO: renamed from: c */
    C2021p mo3709c();

    InterfaceC1629S clone();

    /* JADX INFO: renamed from: d */
    InterfaceC1895i0 mo3710d();

    /* JADX INFO: renamed from: e */
    boolean mo3711e();

    /* JADX INFO: renamed from: f */
    void mo3712f(C1871f r1, C1586H r2);

    /* JADX INFO: renamed from: g */
    C1970t mo3713g(C1901c r1, C1586H r2);

    /* JADX INFO: renamed from: h */
    C1970t mo3714h(C1867e1 r1);

    /* JADX INFO: renamed from: i */
    void mo3715i();

    boolean isEnabled();

    /* JADX INFO: renamed from: j */
    void mo3716j();

    /* JADX INFO: renamed from: k */
    InterfaceC1895i0 mo3717k(C1621P2 r1, C1625Q2 r2);

    /* JADX INFO: renamed from: l */
    C2046v2 mo3718l();

    /* JADX INFO: renamed from: m */
    void mo3719m(InterfaceC2000s1 r1);

    /* JADX INFO: renamed from: n */
    default boolean mo3724n() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    C1970t mo3720o(C1944A r1, C1613N2 r2, C1586H r3, C1881h1 r4);

    /* JADX INFO: renamed from: p */
    C1970t mo3721p(C2059x2 r1, C1586H r2);

    /* JADX INFO: renamed from: q */
    InterfaceC1651Z mo3722q(String r1);

    /* JADX INFO: renamed from: r */
    C1970t mo3723r(C1627R1 r1, C1586H r2);
}
