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
    public static final C2029a f5875e = new C2029a();

    /* JADX INFO: renamed from: a */
    public Thread.UncaughtExceptionHandler f5876a;

    /* JADX INFO: renamed from: b */
    public C2054w1 f5877b;

    /* JADX INFO: renamed from: c */
    public C2046v2 f5878c;

    /* JADX INFO: renamed from: d */
    public boolean f5879d = false;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = f5875e.m4173a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.f5876a);
                C2046v2 c2046v2 = this.f5878c;
                if (c2046v2 != null) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                m3747d(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    /* JADX INFO: renamed from: d */
    public final void m3747d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            C2046v2 c2046v2 = this.f5878c;
            if (c2046v2 != null) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            C2046v2 c2046v22 = this.f5878c;
            if (c2046v22 != null) {
                c2046v22.getLogger().mo3680e(EnumC1657a2.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f5876a;
            if (this != uncaughtExceptionHandler2) {
                m3747d(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.f5876a = this.f5876a;
            C2046v2 c2046v23 = this.f5878c;
            if (c2046v23 != null) {
                c2046v23.getLogger().mo3680e(EnumC1657a2.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        C2054w1 c2054w1;
        C2054w1 c2054w12 = C2054w1.f7276a;
        if (this.f5879d) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f5879d = true;
        this.f5877b = c2054w12;
        this.f5878c = c2046v2;
        ILogger logger = c2046v2.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f5878c.isEnableUncaughtExceptionHandler()));
        if (this.f5878c.isEnableUncaughtExceptionHandler()) {
            C1981r c1981rM4173a = f5875e.m4173a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.f5878c.getLogger().mo3680e(enumC1657a2, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (c2054w1 = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).f5877b) == null) {
                        this.f5876a = defaultUncaughtExceptionHandler;
                    } else {
                        InterfaceC1655a0 interfaceC1655a0 = AbstractC2066z1.f7298a;
                        c2054w1.getClass();
                        this.f5876a = uncaughtExceptionHandlerIntegration.f5876a;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                c1981rM4173a.close();
                this.f5878c.getLogger().mo3680e(enumC1657a2, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                AbstractC1856a.m4055a("UncaughtExceptionHandler");
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C1970t c1970t;
        C2046v2 c2046v2 = this.f5878c;
        if (c2046v2 == null || this.f5877b == null) {
            return;
        }
        c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Uncaught exception received.", new Object[0]);
        try {
            C1628R2 c1628r2 = new C1628R2(this.f5878c.getFlushTimeoutMillis(), this.f5878c.getLogger());
            C1961k c1961k = new C1961k();
            c1961k.f6957d = Boolean.FALSE;
            c1961k.f6954a = "UncaughtExceptionHandler";
            C1627R1 c1627r1 = new C1627R1(new C1869a(c1961k, th, thread, false));
            c1627r1.f5850u = EnumC1657a2.FATAL;
            if (this.f5877b.mo3710d() == null && (c1970t = c1627r1.f5604a) != null) {
                c1628r2.mo3741g(c1970t);
            }
            C1586H c1586hM4059e = AbstractC1856a.m4059e(c1628r2);
            boolean zEquals = this.f5877b.mo3723r(c1627r1, c1586hM4059e).equals(C1970t.f7011b);
            EnumC1887e enumC1887e = (EnumC1887e) c1586hM4059e.m3667b(EnumC1887e.class, "sentry:eventDropReason");
            if ((!zEquals || EnumC1887e.MULTITHREADED_DEDUPLICATION.equals(enumC1887e)) && !c1628r2.mo3849d()) {
                this.f5878c.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c1627r1.f5604a);
            }
        } catch (Throwable th2) {
            this.f5878c.getLogger().mo3683r(EnumC1657a2.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f5876a != null) {
            this.f5878c.getLogger().mo3680e(EnumC1657a2.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f5876a.uncaughtException(thread, th);
        } else if (this.f5878c.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
