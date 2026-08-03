package io.sentry.android.core;

import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.C2058x1;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1610N;
import io.sentry.InterfaceC1614O;
import io.sentry.InterfaceC1935o0;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import io.sentry.util.C2032d;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C1542id;

/* JADX INFO: loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC1935o0, InterfaceC1610N, Closeable {

    /* JADX INFO: renamed from: a */
    public final C2058x1 f6012a;

    /* JADX INFO: renamed from: b */
    public final C2032d f6013b;

    /* JADX INFO: renamed from: d */
    public InterfaceC1614O f6015d;

    /* JADX INFO: renamed from: e */
    public C2054w1 f6016e;

    /* JADX INFO: renamed from: f */
    public SentryAndroidOptions f6017f;

    /* JADX INFO: renamed from: g */
    public C1542id f6018g;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f6014c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f6019h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f6020i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j */
    public final C2029a f6021j = new C2029a();

    public SendCachedEnvelopeIntegration(C2058x1 c2058x1, C2032d c2032d) {
        this.f6012a = c2058x1;
        this.f6013b = c2032d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6020i.set(true);
        InterfaceC1614O interfaceC1614O = this.f6015d;
        if (interfaceC1614O != null) {
            interfaceC1614O.mo3687n(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3852d(C2054w1 c2054w1, SentryAndroidOptions sentryAndroidOptions) {
        try {
            C1981r c1981rM4173a = this.f6021j.m4173a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new RunnableC1684a0(this, sentryAndroidOptions, c2054w1, 0));
                if (((Boolean) this.f6013b.m4175a()).booleanValue() && this.f6014c.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                c1981rM4173a.close();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    @Override // io.sentry.InterfaceC1610N
    /* JADX INFO: renamed from: i */
    public final void mo3725i(EnumC1606M enumC1606M) {
        SentryAndroidOptions sentryAndroidOptions;
        C2054w1 c2054w1 = this.f6016e;
        if (c2054w1 == null || (sentryAndroidOptions = this.f6017f) == null || enumC1606M == EnumC1606M.DISCONNECTED) {
            return;
        }
        m3852d(c2054w1, sentryAndroidOptions);
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        C2054w1 c2054w1 = C2054w1.f7276a;
        this.f6016e = c2054w1;
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f6017f = sentryAndroidOptions;
        String cacheDirPath = c2046v2.getCacheDirPath();
        ILogger logger = c2046v2.getLogger();
        this.f6012a.getClass();
        if (!C2058x1.m4225b(cacheDirPath, logger)) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            AbstractC1856a.m4055a("SendCachedEnvelope");
            m3852d(c2054w1, this.f6017f);
        }
    }
}
