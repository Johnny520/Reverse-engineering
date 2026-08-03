package io.sentry.android.core;

import io.sentry.C1656a1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
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
    public boolean f5966c = false;

    /* JADX INFO: renamed from: d */
    public final C2029a f5967d = new C2029a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i) {
            this();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = this.f5967d.m4173a();
        try {
            this.f5966c = true;
            c1981rM4173a.close();
            FileObserverC1673P fileObserverC1673P = this.f5964a;
            if (fileObserverC1673P != null) {
                fileObserverC1673P.stopWatching();
                ILogger iLogger = this.f5965b;
                if (iLogger != null) {
                    iLogger.mo3680e(EnumC1657a2.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
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
    public final void m3814d(C2046v2 c2046v2, String str) {
        FileObserverC1673P fileObserverC1673P = new FileObserverC1673P(str, new C1656a1(C2054w1.f7276a, c2046v2.getEnvelopeReader(), c2046v2.getSerializer(), c2046v2.getLogger(), c2046v2.getFlushTimeoutMillis(), c2046v2.getMaxQueueSize()), c2046v2.getLogger(), c2046v2.getFlushTimeoutMillis());
        this.f5964a = fileObserverC1673P;
        try {
            fileObserverC1673P.startWatching();
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            AbstractC1856a.m4055a("EnvelopeFileObserver");
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        this.f5965b = c2046v2.getLogger();
        String outboxPath = c2046v2.getOutboxPath();
        if (outboxPath == null) {
            this.f5965b.mo3680e(EnumC1657a2.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f5965b.mo3680e(EnumC1657a2.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            c2046v2.getExecutorService().submit(new RunnableC1684a0(this, c2046v2, outboxPath, 3));
        } catch (Throwable th) {
            this.f5965b.mo3683r(EnumC1657a2.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }
}
