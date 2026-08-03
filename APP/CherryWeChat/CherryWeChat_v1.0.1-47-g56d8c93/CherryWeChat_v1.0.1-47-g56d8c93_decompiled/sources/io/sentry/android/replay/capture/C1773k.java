package io.sentry.android.replay.capture;

import io.sentry.C1586H;
import io.sentry.C1927m1;
import io.sentry.C2059x2;
import io.sentry.InterfaceC1651Z;
import p000.AbstractC0585Nj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1773k extends AbstractC1775m {

    /* JADX INFO: renamed from: a */
    public final C2059x2 f6459a;

    /* JADX INFO: renamed from: b */
    public final C1927m1 f6460b;

    public C1773k(C2059x2 c2059x2, C1927m1 c1927m1) {
        this.f6459a = c2059x2;
        this.f6460b = c1927m1;
    }

    /* JADX INFO: renamed from: a */
    public static void m3966a(C1773k c1773k, InterfaceC1651Z interfaceC1651Z) {
        C1586H c1586h = new C1586H();
        if (interfaceC1651Z == null) {
            c1773k.getClass();
            return;
        }
        C2059x2 c2059x2 = c1773k.f6459a;
        c1586h.f5735g = c1773k.f6460b;
        interfaceC1651Z.mo3721p(c2059x2, c1586h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1773k)) {
            return false;
        }
        C1773k c1773k = (C1773k) obj;
        return AbstractC0585Nj.m1134a(this.f6459a, c1773k.f6459a) && AbstractC0585Nj.m1134a(this.f6460b, c1773k.f6460b);
    }

    public final int hashCode() {
        return this.f6460b.hashCode() + (this.f6459a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.f6459a + ", recording=" + this.f6460b + ')';
    }
}
