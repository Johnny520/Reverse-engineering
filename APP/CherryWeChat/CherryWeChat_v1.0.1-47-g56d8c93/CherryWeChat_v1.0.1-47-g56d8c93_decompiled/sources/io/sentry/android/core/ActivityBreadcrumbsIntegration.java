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
    public final C2029a f5916d = new C2029a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f5913a = application;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5915c) {
            this.f5913a.unregisterActivityLifecycleCallbacks(this);
            C2054w1 c2054w1 = this.f5914b;
            if (c2054w1 != null) {
                c2054w1.mo3718l().getLogger().mo3680e(EnumC1657a2.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3798d(String str, Activity activity) {
        if (this.f5914b == null) {
            return;
        }
        C1871f c1871f = new C1871f();
        c1871f.f6712e = "navigation";
        c1871f.m4093b("state", str);
        c1871f.m4093b("screen", activity.getClass().getSimpleName());
        c1871f.f6714g = "ui.lifecycle";
        c1871f.f6716i = EnumC1657a2.INFO;
        C1586H c1586h = new C1586H();
        c1586h.m3668c("android:activity", activity);
        this.f5914b.mo3712f(c1871f, c1586h);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1981r c1981rM4173a = this.f5916d.m4173a();
        try {
            m3798d("created", activity);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1981r c1981rM4173a = this.f5916d.m4173a();
        try {
            m3798d("destroyed", activity);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1981r c1981rM4173a = this.f5916d.m4173a();
        try {
            m3798d("paused", activity);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1981r c1981rM4173a = this.f5916d.m4173a();
        try {
            m3798d("resumed", activity);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C1981r c1981rM4173a = this.f5916d.m4173a();
        try {
            m3798d("saveInstanceState", activity);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C1981r c1981rM4173a = this.f5916d.m4173a();
        try {
            m3798d("started", activity);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C1981r c1981rM4173a = this.f5916d.m4173a();
        try {
            m3798d("stopped", activity);
            c1981rM4173a.close();
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
        this.f5914b = C2054w1.f7276a;
        this.f5915c = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = c2046v2.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f5915c));
        if (this.f5915c) {
            this.f5913a.registerActivityLifecycleCallbacks(this);
            c2046v2.getLogger().mo3680e(enumC1657a2, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            AbstractC1856a.m4055a("ActivityBreadcrumbs");
        }
    }
}
