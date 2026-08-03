package io.sentry.util;

import io.sentry.C1981r;

/* JADX INFO: renamed from: io.sentry.util.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2032d {

    /* JADX INFO: renamed from: a */
    public volatile Object f7216a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2031c f7217b;

    /* JADX INFO: renamed from: c */
    public final C2029a f7218c;

    public C2032d(InterfaceC2031c r2) {
        this.f7216a = null;
        this.f7218c = new C2029a();
        this.f7217b = r2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4175a() {
        if (this.f7216a != null) goto L18;
        C1981r r0 = this.f7218c.m4173a();
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L6:
        if (this.f7216a != null) goto L11;
        this.f7216a = this.f7217b.mo3688c();     // Catch: Throwable -> L9
    L11:
        r0.close();
    L18:
        return this.f7216a;
    }

    /* JADX INFO: renamed from: b */
    public final void m4176b(Object r2) {
        C1981r r0 = this.f7218c.m4173a();
        this.f7216a = r2;     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }
}
