package p000;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xs */
/* JADX INFO: loaded from: classes.dex */
public final class C2729xs {

    /* JADX INFO: renamed from: b */
    public static final C2729xs f9326b = null;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9327a;

    static {
        f9326b = new C2729xs();
    }

    public C2729xs() {
        this.f9327a = new AtomicReference(new C2430qu(new C0649P3(26)));
    }

    /* JADX INFO: renamed from: a */
    public final Class m5294a(Class r4) {
        HashMap r0 = ((C2430qu) this.f9327a.get()).f8525b;
        if (r0.containsKey(r4) == false) goto L7;
        return ((InterfaceC2602uu) r0.get(r4)).mo28a();
    L7:
        throw new GeneralSecurityException("No input primitive class for " + r4 + " available");
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5295b(C2207lu r3) {
        monitor-enter(this);
        C0649P3 r0 = new C0649P3((C2430qu) this.f9327a.get());     // Catch: Throwable -> L6
        r0.m1284O(r3);     // Catch: Throwable -> L6
        C2430qu r32 = new C2430qu(r0);     // Catch: Throwable -> L6
        this.f9327a.set(r32);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
