package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.C1586H;
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
    public static final C1586H f5946e = null;

    /* JADX INFO: renamed from: a */
    public final Context f5947a;

    /* JADX INFO: renamed from: b */
    public C2054w1 f5948b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f5949c;

    /* JADX INFO: renamed from: d */
    public final C1718f f5950d;

    static {
        f5946e = new C1586H();
    }

    public AppComponentsBreadcrumbsIntegration(Context r5) {
        this.f5950d = new C1718f(0, 60000);
        Context r0 = r5.getApplicationContext();
        if (r0 == null) goto L5;
        r5 = r0;
    L5:
        this.f5947a = r5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5947a.unregisterComponentCallbacks(this);     // Catch: Throwable -> L5
    L9:
        SentryAndroidOptions r1 = this.f5949c;
        if (r1 == null) goto L15;
        r1.getLogger().mo3680e(EnumC1657a2.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        return;
    L15:
        return;
    L5:
        th = move-exception;
        SentryAndroidOptions r2 = this.f5949c;
        if (r2 == null) goto L9;
        r2.getLogger().mo3682n(EnumC1657a2.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final void m3806d(Runnable r5) {
        SentryAndroidOptions r0 = this.f5949c;
        if (r0 == null) goto L11;
        r0.getExecutorService().submit(r5);     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        this.f5949c.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
        return;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r4) {
        m3806d(new RunnableC1752z(this, System.currentTimeMillis(), r4));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int r4) {
        if (r4 >= 40) goto L6;
        return;
    L6:
        if (this.f5950d.m3904a() == false) goto L8;
        return;
    L8:
        final long r0 = System.currentTimeMillis();
        m3806d(new RunnableC1658A(this, r0, r4));
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r6) {
        this.f5948b = C2054w1.f7276a;
        if ((r6 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r0 = (SentryAndroidOptions) r6;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r0);
        this.f5949c = r0;
        ILogger r02 = r0.getLogger();
        EnumC1657a2 r1 = EnumC1657a2.DEBUG;
        r02.mo3680e(r1, "AppComponentsBreadcrumbsIntegration enabled: %s", new Object[]{Boolean.valueOf(this.f5949c.isEnableAppComponentBreadcrumbs())});
        if (this.f5949c.isEnableAppComponentBreadcrumbs() == true) goto L14;
        return;
    L14:
        this.f5947a.registerComponentCallbacks(this);     // Catch: Throwable -> L11
        r6.getLogger().mo3680e(r1, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);     // Catch: Throwable -> L11
        AbstractC1856a.m4055a("AppComponentsBreadcrumbs");     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        this.f5949c.setEnableAppComponentBreadcrumbs(false);
        r6.getLogger().mo3682n(EnumC1657a2.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
        return;
    L5:
        r0 = null;
        goto L6
    }
}
