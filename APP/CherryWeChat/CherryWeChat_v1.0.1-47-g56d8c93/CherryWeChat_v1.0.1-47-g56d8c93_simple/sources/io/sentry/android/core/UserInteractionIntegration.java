package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1605L2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1935o0;
import io.sentry.android.core.internal.gestures.C1708g;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1707f;
import io.sentry.android.core.internal.gestures.WindowCallbackC1703b;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.C1891i;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import p000.C1185ao;
import p000.EnumC0675Pn;
import p000.InterfaceC1061Yn;

/* JADX INFO: loaded from: classes.dex */
public final class UserInteractionIntegration implements InterfaceC1935o0, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final Application f6041a;

    /* JADX INFO: renamed from: b */
    public C2054w1 f6042b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f6043c;

    /* JADX INFO: renamed from: d */
    public final boolean f6044d;

    /* JADX INFO: renamed from: e */
    public final boolean f6045e;

    public UserInteractionIntegration(Application r1, C1891i r2) {
        this.f6041a = r1;
        this.f6044d = C1891i.m4094d(this.f6043c, "androidx.core.view.GestureDetectorCompat");
        this.f6045e = C1891i.m4094d(this.f6043c, "androidx.lifecycle.Lifecycle");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6041a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions r0 = this.f6043c;
        if (r0 == null) goto L6;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m3857d(Activity r6) {
        Window r0 = r6.getWindow();
        if (r0 != null) goto L9;
        SentryAndroidOptions r62 = this.f6043c;
        if (r62 == null) goto L20;
        r62.getLogger().mo3680e(EnumC1657a2.INFO, "Window was null in startTracking", new Object[0]);
        return;
    L20:
        return;
    L9:
        if (this.f6042b != null) goto L11;
        return;
    L11:
        if (this.f6043c == null) goto L22;
        Window.Callback r1 = r0.getCallback();
        if (r1 != null) goto L16;
        r1 = new WindowCallbackC1703b();
    L16:
        if ((r1 instanceof C1708g) == true) goto L23;
        r0.setCallback(new C1708g(r1, r6, new GestureDetectorOnGestureListenerC1707f(r6, this.f6042b, this.f6043c), this.f6043c));
        return;
    L23:
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r4) {
        Window r42 = r4.getWindow();
        if (r42 != null) goto L8;
        SentryAndroidOptions r43 = this.f6043c;
        if (r43 == null) goto L16;
        r43.getLogger().mo3680e(EnumC1657a2.INFO, "Window was null in stopTracking", new Object[0]);
        return;
    L16:
        return;
    L8:
        Window.Callback r0 = r42.getCallback();
        if ((r0 instanceof C1708g) == false) goto L17;
        C1708g r02 = (C1708g) r0;
        r02.f6179c.m3882d(EnumC1605L2.CANCELLED);
        Window.Callback r03 = r02.f6178b;
        if ((r03 instanceof WindowCallbackC1703b) == false) goto L14;
        r42.setCallback(null);
        return;
    L14:
        r42.setCallback(r03);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r1) {
        m3857d(r1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r1) {
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r8) {
        Activity r1 = null;
        if ((r8 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r0 = (SentryAndroidOptions) r8;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r0);
        this.f6043c = r0;
        this.f6042b = C2054w1.f7276a;
        if (r0.isEnableUserInteractionBreadcrumbs() == false) goto L9;
    L12:
        boolean r02 = true;
    L13:
        ILogger r3 = this.f6043c.getLogger();
        EnumC1657a2 r4 = EnumC1657a2.DEBUG;
        r3.mo3680e(r4, "UserInteractionIntegration enabled: %s", new Object[]{Boolean.valueOf(r02)});
        if (r02 == true) goto L16;
        return;
    L16:
        if (this.f6044d == false) goto L28;
        this.f6041a.registerActivityLifecycleCallbacks(this);
        this.f6043c.getLogger().mo3680e(r4, "UserInteractionIntegration installed.", new Object[0]);
        AbstractC1856a.m4055a("UserInteraction");
        if (this.f6045e == false) goto L31;
        WeakReference r82 = (WeakReference) C1666I.f5973b.f5974a;
        if (r82 == null) goto L23;
        r1 = (Activity) r82.get();
    L23:
        if ((r1 instanceof InterfaceC1061Yn) == true) goto L25;
        return;
    L25:
        if (((C1185ao) ((InterfaceC1061Yn) r1).getLifecycle()).f4064c != EnumC0675Pn.f2151e) goto L33;
        m3857d(r1);
        return;
    L33:
        return;
    L31:
        return;
    L28:
        r8.getLogger().mo3680e(EnumC1657a2.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
        return;
    L9:
        if (this.f6043c.isEnableUserInteractionTracing() == true) goto L12;
        r02 = false;
        goto L13
    L5:
        r0 = null;
        goto L6
    }
}
