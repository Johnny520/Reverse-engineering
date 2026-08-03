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
    public volatile boolean f6031f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f6032g;

    /* JADX INFO: renamed from: h */
    public volatile IntentFilter f6033h;

    /* JADX INFO: renamed from: i */
    public volatile HandlerThread f6034i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f6035j;

    /* JADX INFO: renamed from: k */
    public final C2029a f6036k;

    /* JADX INFO: renamed from: l */
    public C1697g0 f6037l;

    public SystemEventsBreadcrumbsIntegration(Context r21) {
        String[] r1 = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        this.f6031f = false;
        this.f6032g = false;
        this.f6033h = null;
        this.f6034i = null;
        this.f6035j = new AtomicBoolean(false);
        this.f6036k = new C2029a();
        Context r2 = r21.getApplicationContext();
        if (r2 != null) goto L6;
        r2 = r21;
    L6:
        this.f6026a = r2;
        this.f6030e = r1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = this.f6036k.m4173a();
        this.f6031f = true;     // Catch: Throwable -> L6
        this.f6033h = null;     // Catch: Throwable -> L6
        if (this.f6034i == null) goto L8;
        this.f6034i.quit();     // Catch: Throwable -> L6
    L8:
        this.f6034i = null;     // Catch: Throwable -> L6
        r0.close();
        C1662E.f5959e.m3812l(this);
        SentryAndroidOptions r02 = this.f6028c;
        if (r02 != null) goto L26;
    L15:
        SentryAndroidOptions r03 = this.f6028c;
        if (r03 == null) goto L30;
        r03.getLogger().mo3680e(EnumC1657a2.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
        return;
    L30:
        return;
    L26:
        r02.getExecutorService().submit(new RunnableC1631S1(6, this));     // Catch: RejectedExecutionException -> L14
    L14:
        m3856l();
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L21
    L23:
        throw th;
    L21:
        th = move-exception;
        th.addSuppressed(th);
        goto L23
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: d */
    public final void mo3807d() {
        if (this.f6029d != null) goto L5;
        return;
    L5:
        if (this.f6028c == null) goto L10;
        this.f6032g = false;
        m3855i(this.f6029d, this.f6028c);
        return;
    }

    @Override // io.sentry.android.core.InterfaceC1659B
    /* JADX INFO: renamed from: f */
    public final void mo3808f() {
        SentryAndroidOptions r0 = this.f6028c;
        if (r0 != null) goto L9;
        return;
    L9:
        r0.getExecutorService().submit(new RunnableC1631S1(6, this));     // Catch: RejectedExecutionException -> L7
        return;
    L7:
        m3856l();
    }

    /* JADX INFO: renamed from: i */
    public final void m3855i(C2054w1 r3, SentryAndroidOptions r4) {
        if (r4.isEnableSystemEventBreadcrumbs() == true) goto L6;
        return;
    L6:
        if (this.f6031f == false) goto L8;
        return;
    L8:
        if (this.f6032g == false) goto L10;
        return;
    L10:
        if (this.f6027b != null) goto L21;
        r4.getExecutorService().submit(new RunnableC1684a0(this, r3, r4));     // Catch: Throwable -> L14
        return;
    L14:
        r4.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
        return;
    }

    /* JADX INFO: renamed from: l */
    public final void m3856l() {
        C1981r r0 = this.f6036k.m4173a();
        this.f6032g = true;     // Catch: Throwable -> L8
        C1699h0 r1 = this.f6027b;     // Catch: Throwable -> L8
        this.f6027b = null;     // Catch: Throwable -> L8
        r0.close();
        if (r1 == null) goto L18;
        this.f6026a.unregisterReceiver(r1);
        return;
    L18:
        return;
    L8:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L11
    L13:
        throw th;
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r4) {
        if ((r4 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r42 = (SentryAndroidOptions) r4;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r42);
        this.f6028c = r42;
        this.f6029d = C2054w1.f7276a;
        r42.getLogger().mo3680e(EnumC1657a2.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", new Object[]{Boolean.valueOf(this.f6028c.isEnableSystemEventBreadcrumbs())});
        if (this.f6028c.isEnableSystemEventBreadcrumbs() == false) goto L12;
        C1662E.f5959e.m3809d(this);
        if (AbstractC1665H.m3826d() == false) goto L13;
        m3855i(this.f6029d, this.f6028c);
        return;
    L13:
        return;
    L12:
        return;
    L5:
        r42 = null;
        goto L6
    }
}
