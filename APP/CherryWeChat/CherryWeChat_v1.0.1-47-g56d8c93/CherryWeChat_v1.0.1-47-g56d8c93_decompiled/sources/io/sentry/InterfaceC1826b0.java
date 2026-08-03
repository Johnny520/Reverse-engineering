package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2021p;

/* JADX INFO: renamed from: io.sentry.b0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1826b0 {
    /* JADX INFO: renamed from: a */
    void mo3643a(boolean z);

    /* JADX INFO: renamed from: b */
    void mo3644b(long j);

    /* JADX INFO: renamed from: c */
    C2021p mo3645c();

    /* JADX INFO: renamed from: d */
    void mo3646d(C1581F2 c1581f2, C1586H c1586h);

    /* JADX INFO: renamed from: e */
    default boolean mo3647e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    C1970t mo3648f(C2059x2 c2059x2, InterfaceC1645X interfaceC1645X, C1586H c1586h);

    /* JADX INFO: renamed from: g */
    C1970t mo3649g(C1901c c1901c, C1586H c1586h);

    /* JADX INFO: renamed from: h */
    C1970t mo3650h(C1867e1 c1867e1);

    /* JADX INFO: renamed from: i */
    C1970t mo3651i(C1944A c1944a, C1613N2 c1613n2, InterfaceC1645X interfaceC1645X, C1586H c1586h, C1881h1 c1881h1);

    boolean isEnabled();

    /* JADX INFO: renamed from: j */
    C1970t mo3652j(C1627R1 c1627r1, InterfaceC1645X interfaceC1645X, C1586H c1586h);
}
