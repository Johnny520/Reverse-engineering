package io.sentry;

import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1972v;

/* JADX INFO: renamed from: io.sentry.A2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1561A2 implements InterfaceC1566C {

    /* JADX INFO: renamed from: a */
    public final String f5595a;

    /* JADX INFO: renamed from: b */
    public final String f5596b;

    public C1561A2() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f5595a = property;
        this.f5596b = property2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3583a(AbstractC1568C1 abstractC1568C1) {
        C1953c c1953c = abstractC1568C1.f5605b;
        if (c1953c.mo4125g() == null) {
            c1953c.mo4136r(new C1972v());
        }
        C1972v c1972vMo4125g = c1953c.mo4125g();
        if (c1972vMo4125g != null && c1972vMo4125g.f7016a == null && c1972vMo4125g.f7017b == null) {
            c1972vMo4125g.f7016a = this.f5596b;
            c1972vMo4125g.f7017b = this.f5595a;
        }
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A c1944a, C1586H c1586h) {
        m3583a(c1944a);
        return c1944a;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 c1627r1, C1586H c1586h) {
        m3583a(c1627r1);
        return c1627r1;
    }
}
