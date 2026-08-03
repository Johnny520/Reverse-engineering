package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1935o0;
import io.sentry.RunnableC1631S1;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC1935o0, Closeable, InterfaceC1659B {

    /* JADX INFO: renamed from: a */
    public final Context f6026a;

    /* JADX INFO: renamed from: b */
    public volatile C1699h0 f6027b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f6028c;

    /* JADX INFO: renamed from: d */
    public C2054w1 f6029d;

    /* JADX INFO: renamed from: e */
    public final String[] f6030e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f6031f = false;

    /* JADX INFO: renamed from: g */
    public volatile boolean f6032g = false;

    /* JADX INFO: renamed from: h */
    public volatile IntentFilter f6033h = null;

    /* JADX INFO: renamed from: i */
    public volatile HandlerThread f6034i = null;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f6035j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k */
    public final C2029a f6036k = new C2029a();

    /* JADX INFO: renamed from: l */
    public C1697g0 f6037l;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.f6026a = applicationContext == null ? context : applicationContext;
        this.f6030e = strArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = this.f6036k.m4173a();
        try {
            this.f6031f = true;
            this.f6033h = null;
            if (this.f6034i != null) {
                this.f6034i.quit();
            }
            this.f6034i = null;
            c1981rM4173a.close();
            C1662E.f5959e.m3812l(this);
            SentryAndroidOptions sentryAndroidOptions = this.f6028c;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new RunnableC1631S1(6, this));
                } catch (RejectedExecutionException unused) {
                    m3856l();
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.f6028c;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().mo3680e(EnumC1657a2.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: d */
    public final void mo3807d() {
        if (this.f6029d == null || this.f6028c == null) {
            return;
        }
        this.f6032g = false;
        m3855i(this.f6029d, this.f6028c);
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: f */
    public final void mo3808f() {
        SentryAndroidOptions sentryAndroidOptions = this.f6028c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC1631S1(6, this));
        } catch (RejectedExecutionException unused) {
            m3856l();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3855i(C2054w1 c2054w1, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f6031f && !this.f6032g && this.f6027b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new RunnableC1684a0(this, c2054w1, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3856l() {
        C1981r c1981rM4173a = this.f6036k.m4173a();
        try {
            this.f6032g = true;
            C1699h0 c1699h0 = this.f6027b;
            this.f6027b = null;
            c1981rM4173a.close();
            if (c1699h0 != null) {
                this.f6026a.unregisterReceiver(c1699h0);
            }
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
        this.f6028c = sentryAndroidOptions;
        this.f6029d = C2054w1.f7276a;
        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f6028c.isEnableSystemEventBreadcrumbs()));
        if (this.f6028c.isEnableSystemEventBreadcrumbs()) {
            C1662E.f5959e.m3809d(this);
            if (AbstractC1665H.m3826d()) {
                m3855i(this.f6029d, this.f6028c);
            }
        }
    }
}
