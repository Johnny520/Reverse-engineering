package io.sentry.android.core;

import io.sentry.C1656a1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1622Q;
import io.sentry.InterfaceC1866e0;
import io.sentry.InterfaceC1935o0;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC1935o0, Closeable {

    /* JADX INFO: renamed from: a */
    public FileObserverC1673P f5964a;

    /* JADX INFO: renamed from: b */
    public ILogger f5965b;

    /* JADX INFO: renamed from: c */
    public boolean f5966c;

    /* JADX INFO: renamed from: d */
    public final C2029a f5967d;

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int r1) {
            this();
        }
    }

    public EnvelopeFileObserverIntegration() {
        this.f5966c = false;
        this.f5967d = new C2029a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = this.f5967d.m4173a();
        this.f5966c = true;     // Catch: Throwable -> L10
        r0.close();
        FileObserverC1673P r02 = this.f5964a;
        if (r02 == null) goto L20;
        r02.stopWatching();
        ILogger r03 = this.f5965b;
        if (r03 == null) goto L21;
        r03.mo3680e(EnumC1657a2.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
        return;
    L21:
        return;
    L20:
        return;
    L10:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    }

    /* JADX INFO: renamed from: d */
    public final void m3814d(C2046v2 r9, String r10) {
        InterfaceC1622Q r2 = r9.getEnvelopeReader();
        InterfaceC1866e0 r3 = r9.getSerializer();
        ILogger r4 = r9.getLogger();
        long r5 = r9.getFlushTimeoutMillis();
        int r7 = r9.getMaxQueueSize();
        FileObserverC1673P r1 = new FileObserverC1673P(r10, new C1656a1(C2054w1.f7276a, r2, r3, r4, r5, r7), r9.getLogger(), r9.getFlushTimeoutMillis());
        this.f5964a = r1;
        r1.startWatching();     // Catch: Throwable -> L5
        r9.getLogger().mo3680e(EnumC1657a2.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);     // Catch: Throwable -> L5
        AbstractC1856a.m4055a("EnvelopeFileObserver");     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        r9.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r6) {
        this.f5965b = r6.getLogger();
        String r0 = r6.getOutboxPath();
        if (r0 != null) goto L6;
        this.f5965b.mo3680e(EnumC1657a2.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
        return;
    L6:
        this.f5965b.mo3680e(EnumC1657a2.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", new Object[]{r0});
        r6.getExecutorService().submit(new RunnableC1684a0(this, r6, r0, 3));     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        this.f5965b.mo3683r(EnumC1657a2.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
    }
}
