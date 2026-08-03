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
        String r0 = System.getProperty("java.version");
        String r1 = System.getProperty("java.vendor");
        this.f5595a = r0;
        this.f5596b = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m3583a(AbstractC1568C1 r2) {
        C1953c r22 = r2.f5605b;
        if (r22.mo4125g() != null) goto L5;
        r22.mo4136r(new C1972v());
    L5:
        C1972v r23 = r22.mo4125g();
        if (r23 != null) goto L8;
        return;
    L8:
        if (r23.f7016a == null) goto L10;
        return;
    L10:
        if (r23.f7017b != null) goto L15;
        r23.f7016a = this.f5596b;
        r23.f7017b = this.f5595a;
        return;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A r1, C1586H r2) {
        m3583a(r1);
        return r1;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 r1, C1586H r2) {
        m3583a(r1);
        return r1;
    }
}
