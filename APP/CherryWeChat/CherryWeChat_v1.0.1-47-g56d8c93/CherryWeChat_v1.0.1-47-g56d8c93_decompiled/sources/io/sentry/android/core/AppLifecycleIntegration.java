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
    public final C2029a f5951a = new C2029a();

    /* JADX INFO: renamed from: b */
    public volatile C1678V f5952b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f5953c;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = this.f5951a.m4173a();
        try {
            C1678V c1678v = this.f5952b;
            this.f5952b = null;
            c1981rM4173a.close();
            if (c1678v != null) {
                C1662E.f5959e.m3812l(c1678v);
                SentryAndroidOptions sentryAndroidOptions = this.f5953c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            C1662E.f5959e.m3813m();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f5953c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f5953c.isEnableAutoSessionTracking()));
        this.f5953c.getLogger().mo3680e(enumC1657a2, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f5953c.isEnableAppLifecycleBreadcrumbs()));
        if (this.f5953c.isEnableAutoSessionTracking() || this.f5953c.isEnableAppLifecycleBreadcrumbs()) {
            C1981r c1981rM4173a = this.f5951a.m4173a();
            try {
                if (this.f5952b != null) {
                    c1981rM4173a.close();
                    return;
                }
                this.f5952b = new C1678V(this.f5953c.getSessionTrackingIntervalMillis(), this.f5953c.isEnableAutoSessionTracking(), this.f5953c.isEnableAppLifecycleBreadcrumbs());
                C1662E.f5959e.m3809d(this.f5952b);
                c1981rM4173a.close();
                c2046v2.getLogger().mo3680e(enumC1657a2, "AppLifecycleIntegration installed.", new Object[0]);
                AbstractC1856a.m4055a("AppLifecycle");
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
}
