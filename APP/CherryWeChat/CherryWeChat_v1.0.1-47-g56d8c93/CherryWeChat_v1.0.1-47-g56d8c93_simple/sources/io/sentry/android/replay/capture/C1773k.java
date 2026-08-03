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

    public C1773k(C2059x2 r1, C1927m1 r2) {
        this.f6459a = r1;
        this.f6460b = r2;
    }

    /* JADX INFO: renamed from: a */
    public static void m3966a(C1773k r2, InterfaceC1651Z r3) {
        C1586H r0 = new C1586H();
        if (r3 == null) goto L6;
        C2059x2 r1 = r2.f6459a;
        r0.f5735g = r2.f6460b;
        r3.mo3721p(r1, r0);
        return;
    L6:
        r2.getClass();
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1773k) == true) goto L8;
        return false;
    L8:
        C1773k r52 = (C1773k) r5;
        if (AbstractC0585Nj.m1134a(this.f6459a, r52.f6459a) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.f6460b, r52.f6460b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f6459a.hashCode() * 31;
        return this.f6460b.hashCode() + r0;
    }

    public final String toString() {
        return "Created(replay=" + this.f6459a + ", recording=" + this.f6460b + ')';
    }
}
