package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C1586H;
import io.sentry.C1871f;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1935o0;
import io.sentry.android.core.internal.util.C1718f;
import io.sentry.config.AbstractC1856a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC1935o0, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e */
    public static final C1586H f5946e = new C1586H();

    /* JADX INFO: renamed from: a */
    public final Context f5947a;

    /* JADX INFO: renamed from: b */
    public C2054w1 f5948b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f5949c;

    /* JADX INFO: renamed from: d */
    public final C1718f f5950d = new C1718f(0, 60000);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5947a = applicationContext != null ? applicationContext : context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f5947a.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f5949c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo3682n(EnumC1657a2.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f5949c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().mo3680e(EnumC1657a2.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3806d(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f5949c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.f5949c.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        m3806d(new RunnableC1752z(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        if (i >= 40 && !this.f5950d.m3904a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            m3806d(new Runnable() { // from class: io.sentry.android.core.A
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.f5910a;
                    if (appComponentsBreadcrumbsIntegration.f5948b != null) {
                        C1871f c1871f = new C1871f(jCurrentTimeMillis);
                        c1871f.f6712e = "system";
                        c1871f.f6714g = "device.event";
                        c1871f.f6711d = "Low memory";
                        c1871f.m4093b("action", "LOW_MEMORY");
                        c1871f.m4093b("level", Integer.valueOf(i));
                        c1871f.f6716i = EnumC1657a2.WARNING;
                        appComponentsBreadcrumbsIntegration.f5948b.mo3712f(c1871f, AppComponentsBreadcrumbsIntegration.f5946e);
                    }
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        this.f5948b = C2054w1.f7276a;
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f5949c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f5949c.isEnableAppComponentBreadcrumbs()));
        if (this.f5949c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f5947a.registerComponentCallbacks(this);
                c2046v2.getLogger().mo3680e(enumC1657a2, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                AbstractC1856a.m4055a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.f5949c.setEnableAppComponentBreadcrumbs(false);
                c2046v2.getLogger().mo3682n(EnumC1657a2.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }
}
