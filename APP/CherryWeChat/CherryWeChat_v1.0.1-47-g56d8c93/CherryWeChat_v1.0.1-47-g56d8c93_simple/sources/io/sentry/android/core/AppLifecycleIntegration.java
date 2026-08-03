package io.sentry.android.core;

import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1935o0;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AppLifecycleIntegration implements InterfaceC1935o0, Closeable {

    /* JADX INFO: renamed from: a */
    public final C2029a f5951a;

    /* JADX INFO: renamed from: b */
    public volatile C1678V f5952b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f5953c;

    public AppLifecycleIntegration() {
        this.f5951a = new C2029a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = this.f5951a.m4173a();
        C1678V r1 = this.f5952b;     // Catch: Throwable -> L11
        this.f5952b = null;     // Catch: Throwable -> L11
        r0.close();
        if (r1 == null) goto L9;
        C1662E.f5959e.m3812l(r1);
        SentryAndroidOptions r02 = this.f5953c;
        if (r02 == null) goto L9;
        r02.getLogger().mo3680e(EnumC1657a2.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
    L9:
        C1662E.f5959e.m3813m();
        return;
    L11:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r8) {
        if ((r8 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r0 = (SentryAndroidOptions) r8;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r0);
        this.f5953c = r0;
        ILogger r02 = r0.getLogger();
        EnumC1657a2 r1 = EnumC1657a2.DEBUG;
        r02.mo3680e(r1, "enableSessionTracking enabled: %s", new Object[]{Boolean.valueOf(this.f5953c.isEnableAutoSessionTracking())});
        this.f5953c.getLogger().mo3680e(r1, "enableAppLifecycleBreadcrumbs enabled: %s", new Object[]{Boolean.valueOf(this.f5953c.isEnableAppLifecycleBreadcrumbs())});
        if (this.f5953c.isEnableAutoSessionTracking() == false) goto L9;
    L12:
        C1981r r03 = this.f5951a.m4173a();
    L20:
        th = move-exception;
        r03.close();     // Catch: Throwable -> L23
    L25:
        throw th;
    L23:
        th = move-exception;
        th.addSuppressed(th);
        goto L25
    L14:
        if (this.f5952b == null) goto L17;
        r03.close();
        return;
    L17:
        this.f5952b = new C1678V(this.f5953c.getSessionTrackingIntervalMillis(), this.f5953c.isEnableAutoSessionTracking(), this.f5953c.isEnableAppLifecycleBreadcrumbs());     // Catch: Throwable -> L20
        C1662E.f5959e.m3809d(this.f5952b);     // Catch: Throwable -> L20
        r03.close();
        r8.getLogger().mo3680e(r1, "AppLifecycleIntegration installed.", new Object[0]);
        AbstractC1856a.m4055a("AppLifecycle");
        return;
    L9:
        if (this.f5953c.isEnableAppLifecycleBreadcrumbs() == true) goto L12;
        return;
    L5:
        r0 = null;
        goto L6
    }
}
