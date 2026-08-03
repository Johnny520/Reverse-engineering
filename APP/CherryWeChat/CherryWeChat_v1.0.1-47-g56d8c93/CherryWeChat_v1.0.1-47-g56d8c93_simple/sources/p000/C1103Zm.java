package p000;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Zm */
/* JADX INFO: loaded from: classes.dex */
public final class C1103Zm {

    /* JADX INFO: renamed from: b */
    public static final Logger f3494b = null;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f3495a;

    static {
        f3494b = Logger.getLogger(C1103Zm.class.getName());
    }

    public C1103Zm(C1103Zm r2) {
        this.f3495a = new ConcurrentHashMap(r2.f3495a);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1060Ym m2025a(String r4) {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.f3495a.containsKey(r4) == false) goto L12;
        C1060Ym r42 = (C1060Ym) this.f3495a.get(r4);     // Catch: Throwable -> L9
        monitor-exit(this);
        return r42;
    L12:
        throw new GeneralSecurityException("No key manager found for key type " + r4);     // Catch: Throwable -> L9
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2026b(AbstractC1551in r4) {
        monitor-enter(this);
        int r1 = r4.mo2969a();     // Catch: Throwable -> L12
        if (r1 == 1) goto L7;
        boolean r12 = AbstractC2374ph.m4806c(r1);     // Catch: Throwable -> L12
    L8:
        if (r12 == false) goto L15;
        m2027c(new C1060Ym(r4));     // Catch: Throwable -> L12
        monitor-exit(this);
        return;
    L15:
        throw new GeneralSecurityException("failed to register key manager " + r4.getClass() + " as it is not FIPS compatible.");     // Catch: Throwable -> L12
    L7:
        r12 = AbstractC2374ph.m4805b(r1);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m2027c(C1060Ym r7) {
        monitor-enter(this);
        AbstractC1551in r2 = r7.f3368a;     // Catch: Throwable -> L18
        Class r3 = r2.f5510c;     // Catch: Throwable -> L18
        if (r2.f5509b.keySet().contains(r3) == false) goto L7;
    L11:
        String r22 = r2.mo2970b();     // Catch: Throwable -> L18
        C1060Ym r32 = (C1060Ym) this.f3495a.get(r22);     // Catch: Throwable -> L18
        if (r32 != null) goto L14;
    L20:
        this.f3495a.putIfAbsent(r22, r7);     // Catch: Throwable -> L18
        monitor-exit(this);
        return;
    L14:
        if (r32.f3368a.getClass().equals(r7.f3368a.getClass()) == true) goto L20;
        f3494b.warning("Attempted overwrite of a registered key manager for key type ".concat(r22));     // Catch: Throwable -> L18
        throw new GeneralSecurityException("typeUrl (" + r22 + ") is already registered with " + r32.f3368a.getClass().getName() + ", cannot be re-registered with " + r7.f3368a.getClass().getName());     // Catch: Throwable -> L18
    L7:
        if (Void.class.equals(r3) == true) goto L11;
        throw new IllegalArgumentException("Given internalKeyMananger " + r2.toString() + " does not support primitive class " + r3.getName());     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    public C1103Zm() {
        this.f3495a = new ConcurrentHashMap();
    }
}
