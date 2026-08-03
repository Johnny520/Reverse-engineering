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
    public final boolean f6044d = C1891i.m4094d(this.f6043c, "androidx.core.view.GestureDetectorCompat");

    /* JADX INFO: renamed from: e */
    public final boolean f6045e = C1891i.m4094d(this.f6043c, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(Application application, C1891i c1891i) {
        this.f6041a = application;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6041a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f6043c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3857d(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f6043c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f6042b == null || this.f6043c == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new WindowCallbackC1703b();
        }
        if (callback instanceof C1708g) {
            return;
        }
        window.setCallback(new C1708g(callback, activity, new GestureDetectorOnGestureListenerC1707f(activity, this.f6042b, this.f6043c), this.f6043c));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f6043c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C1708g) {
            C1708g c1708g = (C1708g) callback;
            c1708g.f6179c.m3882d(EnumC1605L2.CANCELLED);
            Window.Callback callback2 = c1708g.f6178b;
            if (callback2 instanceof WindowCallbackC1703b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m3857d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f6043c = sentryAndroidOptions;
        this.f6042b = C2054w1.f7276a;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f6043c.isEnableUserInteractionTracing();
        ILogger logger = this.f6043c.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (!this.f6044d) {
                c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f6041a.registerActivityLifecycleCallbacks(this);
            this.f6043c.getLogger().mo3680e(enumC1657a2, "UserInteractionIntegration installed.", new Object[0]);
            AbstractC1856a.m4055a("UserInteraction");
            if (this.f6045e) {
                WeakReference weakReference = (WeakReference) C1666I.f5973b.f5974a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof InterfaceC1061Yn) && ((C1185ao) ((InterfaceC1061Yn) activity).getLifecycle()).f4064c == EnumC0675Pn.f2151e) {
                    m3857d(activity);
                }
            }
        }
    }
}
