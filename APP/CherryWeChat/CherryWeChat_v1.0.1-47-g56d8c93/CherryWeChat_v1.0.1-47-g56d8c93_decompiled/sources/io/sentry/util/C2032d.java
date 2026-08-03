package io.sentry.util;

import io.sentry.C1981r;

/* JADX INFO: renamed from: io.sentry.util.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2032d {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2031c f7217b;

    /* JADX INFO: renamed from: a */
    public volatile Object f7216a = null;

    /* JADX INFO: renamed from: c */
    public final C2029a f7218c = new C2029a();

    public C2032d(InterfaceC2031c interfaceC2031c) {
        this.f7217b = interfaceC2031c;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4175a() {
        if (this.f7216a == null) {
            C1981r c1981rM4173a = this.f7218c.m4173a();
            try {
                if (this.f7216a == null) {
                    this.f7216a = this.f7217b.mo3688c();
                }
                c1981rM4173a.close();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.f7216a;
    }

    /* JADX INFO: renamed from: b */
    public final void m4176b(Object obj) {
        C1981r c1981rM4173a = this.f7218c.m4173a();
        try {
            this.f7216a = obj;
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
