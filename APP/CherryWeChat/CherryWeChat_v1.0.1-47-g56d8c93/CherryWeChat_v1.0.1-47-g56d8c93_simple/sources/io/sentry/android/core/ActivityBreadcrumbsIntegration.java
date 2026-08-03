package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C1586H;
import io.sentry.C1871f;
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
public final class ActivityBreadcrumbsIntegration implements InterfaceC1935o0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f5913a;

    /* JADX INFO: renamed from: b */
    public C2054w1 f5914b;

    /* JADX INFO: renamed from: c */
    public boolean f5915c;

    /* JADX INFO: renamed from: d */
    public final C2029a f5916d;

    public ActivityBreadcrumbsIntegration(Application r2) {
        this.f5916d = new C2029a();
        this.f5913a = r2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5915c == false) goto L8;
        this.f5913a.unregisterActivityLifecycleCallbacks(this);
        C2054w1 r0 = this.f5914b;
        if (r0 == null) goto L9;
        r0.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m3798d(String r3, Activity r4) {
        if (this.f5914b != null) goto L5;
        return;
    L5:
        C1871f r0 = new C1871f();
        r0.f6712e = "navigation";
        r0.m4093b("state", r3);
        r0.m4093b("screen", r4.getClass().getSimpleName());
        r0.f6714g = "ui.lifecycle";
        r0.f6716i = EnumC1657a2.INFO;
        C1586H r32 = new C1586H();
        r32.m3668c("android:activity", r4);
        this.f5914b.mo3712f(r0, r32);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r2, Bundle r3) {
        C1981r r32 = this.f5916d.m4173a();
        m3798d("created", r2);     // Catch: Throwable -> L6
        r32.close();
        return;
    L6:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r3) {
        C1981r r0 = this.f5916d.m4173a();
        m3798d("destroyed", r3);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r3) {
        C1981r r0 = this.f5916d.m4173a();
        m3798d("paused", r3);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r3) {
        C1981r r0 = this.f5916d.m4173a();
        m3798d("resumed", r3);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r2, Bundle r3) {
        C1981r r32 = this.f5916d.m4173a();
        m3798d("saveInstanceState", r2);     // Catch: Throwable -> L6
        r32.close();
        return;
    L6:
        th = move-exception;
        r32.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r3) {
        C1981r r0 = this.f5916d.m4173a();
        m3798d("started", r3);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r3) {
        C1981r r0 = this.f5916d.m4173a();
        m3798d("stopped", r3);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r5) {
        if ((r5 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r0 = (SentryAndroidOptions) r5;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r0);
        this.f5914b = C2054w1.f7276a;
        this.f5915c = r0.isEnableActivityLifecycleBreadcrumbs();
        ILogger r02 = r5.getLogger();
        EnumC1657a2 r1 = EnumC1657a2.DEBUG;
        r02.mo3680e(r1, "ActivityBreadcrumbsIntegration enabled: %s", new Object[]{Boolean.valueOf(this.f5915c)});
        if (this.f5915c == false) goto L10;
        this.f5913a.registerActivityLifecycleCallbacks(this);
        r5.getLogger().mo3680e(r1, "ActivityBreadcrumbIntegration installed.", new Object[0]);
        AbstractC1856a.m4055a("ActivityBreadcrumbs");
        return;
    L10:
        return;
    L5:
        r0 = null;
        goto L6
    }
}
