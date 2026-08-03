package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1869a;
import io.sentry.hints.EnumC1887e;
import io.sentry.protocol.C1961k;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC1935o0, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: e */
    public static final C2029a f5875e = null;

    /* JADX INFO: renamed from: a */
    public Thread.UncaughtExceptionHandler f5876a;

    /* JADX INFO: renamed from: b */
    public C2054w1 f5877b;

    /* JADX INFO: renamed from: c */
    public C2046v2 f5878c;

    /* JADX INFO: renamed from: d */
    public boolean f5879d;

    static {
        f5875e = new C2029a();
    }

    public UncaughtExceptionHandlerIntegration() {
        this.f5879d = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = f5875e.m4173a();
    L8:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L15
    L17:
        throw th;
    L15:
        th = move-exception;
        th.addSuppressed(th);
        goto L17
    L4:
        if (this != Thread.getDefaultUncaughtExceptionHandler()) goto L10;
        Thread.setDefaultUncaughtExceptionHandler(this.f5876a);     // Catch: Throwable -> L8
        C2046v2 r1 = this.f5878c;     // Catch: Throwable -> L8
        if (r1 == null) goto L11;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);     // Catch: Throwable -> L8
    L11:
        r0.close();
        return;
    L10:
        m3747d(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());     // Catch: Throwable -> L8
        goto L11
    }

    /* JADX INFO: renamed from: d */
    public final void m3747d(Thread.UncaughtExceptionHandler r3, HashSet r4) {
        if (r3 != null) goto L9;
        C2046v2 r32 = this.f5878c;
        if (r32 == null) goto L25;
        r32.getLogger().mo3680e(EnumC1657a2.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
        return;
    L25:
        return;
    L9:
        if (r4.add(r3) == true) goto L15;
        C2046v2 r33 = this.f5878c;
        if (r33 == null) goto L26;
        r33.getLogger().mo3680e(EnumC1657a2.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
        return;
    L26:
        return;
    L15:
        if ((r3 instanceof UncaughtExceptionHandlerIntegration) == false) goto L28;
        UncaughtExceptionHandlerIntegration r34 = (UncaughtExceptionHandlerIntegration) r3;
        Thread.UncaughtExceptionHandler r1 = r34.f5876a;
        if (this != r1) goto L23;
        r34.f5876a = this.f5876a;
        C2046v2 r35 = this.f5878c;
        if (r35 == null) goto L27;
        r35.getLogger().mo3680e(EnumC1657a2.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
        return;
    L27:
        return;
    L23:
        m3747d(r1, r4);
        return;
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r7) {
        C2054w1 r0 = C2054w1.f7276a;
        if (this.f5879d == false) goto L6;
        r7.getLogger().mo3680e(EnumC1657a2.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
        return;
    L6:
        this.f5879d = true;
        this.f5877b = r0;
        this.f5878c = r7;
        ILogger r72 = r7.getLogger();
        EnumC1657a2 r02 = EnumC1657a2.DEBUG;
        r72.mo3680e(r02, "UncaughtExceptionHandlerIntegration enabled: %s", new Object[]{Boolean.valueOf(this.f5878c.isEnableUncaughtExceptionHandler())});
        if (this.f5878c.isEnableUncaughtExceptionHandler() == false) goto L28;
        C1981r r73 = f5875e.m4173a();
        Thread.UncaughtExceptionHandler r2 = Thread.getDefaultUncaughtExceptionHandler();     // Catch: Throwable -> L16
        if (r2 == null) goto L20;
        this.f5878c.getLogger().mo3680e(r02, "default UncaughtExceptionHandler class='" + r2.getClass().getName() + "'", new Object[0]);     // Catch: Throwable -> L16
        if ((r2 instanceof UncaughtExceptionHandlerIntegration) == false) goto L19;
        UncaughtExceptionHandlerIntegration r1 = (UncaughtExceptionHandlerIntegration) r2;     // Catch: Throwable -> L16
        C2054w1 r4 = r1.f5877b;     // Catch: Throwable -> L16
        if (r4 == null) goto L18;
        InterfaceC1655a0 r22 = AbstractC2066z1.f7298a;     // Catch: Throwable -> L16
        r4.getClass();     // Catch: Throwable -> L16
        this.f5876a = r1.f5876a;     // Catch: Throwable -> L16
        goto L20
    L18:
        this.f5876a = r2;     // Catch: Throwable -> L16
        goto L20
    L19:
        this.f5876a = r2;     // Catch: Throwable -> L16
    L20:
        Thread.setDefaultUncaughtExceptionHandler(this);     // Catch: Throwable -> L16
        r73.close();
        this.f5878c.getLogger().mo3680e(r02, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
        AbstractC1856a.m4055a("UncaughtExceptionHandler");
        return;
    L16:
        th = move-exception;
        r73.close();     // Catch: Throwable -> L25
    L27:
        throw th;
    L25:
        th = move-exception;
        th.addSuppressed(th);
        goto L27
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread r8, Throwable r9) {
        C2046v2 r0 = this.f5878c;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.f5877b == null) goto L33;
        r0.getLogger().mo3680e(EnumC1657a2.INFO, "Uncaught exception received.", new Object[0]);
        C1628R2 r02 = new C1628R2(this.f5878c.getFlushTimeoutMillis(), this.f5878c.getLogger());     // Catch: Throwable -> L12
        C1961k r1 = new C1961k();     // Catch: Throwable -> L12
        r1.f6957d = Boolean.FALSE;     // Catch: Throwable -> L12
        r1.f6954a = "UncaughtExceptionHandler";     // Catch: Throwable -> L12
        C1627R1 r12 = new C1627R1(new C1869a(r1, r9, r8, false));     // Catch: Throwable -> L12
        r12.f5850u = EnumC1657a2.FATAL;     // Catch: Throwable -> L12
        if (this.f5877b.mo3710d() != null) goto L14;
        C1970t r2 = r12.f5604a;     // Catch: Throwable -> L12
        if (r2 == null) goto L14;
        r02.mo3741g(r2);     // Catch: Throwable -> L12
    L14:
        C1586H r22 = AbstractC1856a.m4059e(r02);     // Catch: Throwable -> L12
        boolean r4 = this.f5877b.mo3723r(r12, r22).equals(C1970t.f7011b);     // Catch: Throwable -> L12
        EnumC1887e r23 = (EnumC1887e) r22.m3667b(EnumC1887e.class, "sentry:eventDropReason");     // Catch: Throwable -> L12
        if (r4 == false) goto L19;
        if (EnumC1887e.MULTITHREADED_DEDUPLICATION.equals(r23) == true) goto L19;
    L24:
        if (this.f5876a == null) goto L27;
        this.f5878c.getLogger().mo3680e(EnumC1657a2.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
        this.f5876a.uncaughtException(r8, r9);
        return;
    L27:
        if (this.f5878c.isPrintUncaughtStackTrace() == false) goto L35;
        r9.printStackTrace();
        return;
    L35:
        return;
    L19:
        if (r02.mo3849d() == true) goto L24;
        this.f5878c.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", new Object[]{r12.f5604a});     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        this.f5878c.getLogger().mo3683r(EnumC1657a2.ERROR, "Error sending uncaught exception to Sentry.", th);
        goto L24
    }
}
