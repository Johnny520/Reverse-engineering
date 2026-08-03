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

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f6014c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1614O f6015d;

    /* JADX INFO: renamed from: e */
    public C2054w1 f6016e;

    /* JADX INFO: renamed from: f */
    public SentryAndroidOptions f6017f;

    /* JADX INFO: renamed from: g */
    public C1542id f6018g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f6019h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f6020i;

    /* JADX INFO: renamed from: j */
    public final C2029a f6021j;

    public SendCachedEnvelopeIntegration(C2058x1 r3, C2032d r4) {
        this.f6014c = new AtomicBoolean(false);
        this.f6019h = new AtomicBoolean(false);
        this.f6020i = new AtomicBoolean(false);
        this.f6021j = new C2029a();
        this.f6012a = r3;
        this.f6013b = r4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6020i.set(true);
        InterfaceC1614O r0 = this.f6015d;
        if (r0 == null) goto L6;
        r0.mo3687n(this);
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m3852d(C2054w1 r7, SentryAndroidOptions r8) {
        C1981r r0 = this.f6021j.m4173a();     // Catch: Throwable -> L16 RejectedExecutionException -> L18
        Future r72 = r8.getExecutorService().submit(new RunnableC1684a0(this, r8, r7, 0));     // Catch: Throwable -> L10
        if (((Boolean) this.f6013b.m4175a()).booleanValue() == true) goto L6;
    L13:
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);     // Catch: Throwable -> L10
        r0.close();     // Catch: Throwable -> L16 RejectedExecutionException -> L18
        return;
    L6:
        if (this.f6014c.compareAndSet(false, true) == false) goto L13;
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);     // Catch: Throwable -> L10
        r72.get(r8.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);     // Catch: Throwable -> L10 TimeoutException -> L12
    L12:
        r8.getLogger().mo3680e(EnumC1657a2.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L22
    L24:
        throw th;     // Catch: Throwable -> L16 RejectedExecutionException -> L18
    L22:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L16 RejectedExecutionException -> L18
    L18:
        e = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        return;
    L16:
        th = move-exception;
        r8.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Cached events will not be sent", th);
    }

    @Override // io.sentry.InterfaceC1610N
    /* JADX INFO: renamed from: i */
    public final void mo3725i(EnumC1606M r4) {
        C2054w1 r0 = this.f6016e;
        if (r0 == null) goto L10;
        SentryAndroidOptions r1 = this.f6017f;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r4 == EnumC1606M.DISCONNECTED) goto L12;
        m3852d(r0, r1);
        return;
    L12:
        return;
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r5) {
        C2054w1 r0 = C2054w1.f7276a;
        this.f6016e = r0;
        if ((r5 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r1 = (SentryAndroidOptions) r5;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r1);
        this.f6017f = r1;
        String r12 = r5.getCacheDirPath();
        ILogger r2 = r5.getLogger();
        this.f6012a.getClass();
        if (C2058x1.m4225b(r12, r2) == true) goto L10;
        r5.getLogger().mo3680e(EnumC1657a2.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return;
    L10:
        AbstractC1856a.m4055a("SendCachedEnvelope");
        m3852d(r0, this.f6017f);
        return;
    L5:
        r1 = null;
        goto L6
    }
}
