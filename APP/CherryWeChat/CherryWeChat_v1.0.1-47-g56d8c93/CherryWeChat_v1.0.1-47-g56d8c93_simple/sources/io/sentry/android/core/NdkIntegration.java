package io.sentry.android.core;

import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1935o0;
import io.sentry.config.AbstractC1856a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NdkIntegration implements InterfaceC1935o0, Closeable {

    /* JADX INFO: renamed from: a */
    public final Class f5991a;

    /* JADX INFO: renamed from: b */
    public SentryAndroidOptions f5992b;

    public NdkIntegration(Class r1) {
        this.f5991a = r1;
    }

    /* JADX INFO: renamed from: d */
    public static void m3845d(SentryAndroidOptions r1) {
        r1.setEnableNdk(false);
        r1.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions r0 = this.f5992b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isEnableNdk() == false) goto L27;
        Class r02 = this.f5991a;
        if (r02 == null) goto L28;
        r02.getMethod("close", null).invoke(null, null);     // Catch: Throwable -> L11 NoSuchMethodException -> L13
        this.f5992b.getLogger().mo3680e(EnumC1657a2.DEBUG, "NdkIntegration removed.", new Object[0]);     // Catch: Throwable -> L11 NoSuchMethodException -> L13
        m3845d(this.f5992b);
        return;
    L13:
        e = move-exception;
        this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to invoke the SentryNdk.close method.", e);     // Catch: Throwable -> L17
    L16:
        m3845d(this.f5992b);
        return;
    L11:
        th = move-exception;
        this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to close SentryNdk.", th);     // Catch: Throwable -> L17
        goto L16
    L28:
        return;
    L17:
        th = move-exception;
        m3845d(this.f5992b);
        throw th;
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r6) {
        if ((r6 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r62 = (SentryAndroidOptions) r6;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r62);
        this.f5992b = r62;
        boolean r63 = r62.isEnableNdk();
        ILogger r0 = this.f5992b.getLogger();
        EnumC1657a2 r2 = EnumC1657a2.DEBUG;
        r0.mo3680e(r2, "NdkIntegration enabled: %s", new Object[]{Boolean.valueOf(r63)});
        if (r63 == false) goto L23;
        Class r64 = this.f5991a;
        if (r64 == null) goto L23;
        if (this.f5992b.getCacheDirPath() != null) goto L25;
        this.f5992b.getLogger().mo3680e(EnumC1657a2.ERROR, "No cache dir path is defined in options.", new Object[0]);
        m3845d(this.f5992b);
        return;
    L25:
        r64.getMethod("init", new Class[]{SentryAndroidOptions.class}).invoke(null, new Object[]{this.f5992b});     // Catch: Throwable -> L16 NoSuchMethodException -> L18
        this.f5992b.getLogger().mo3680e(r2, "NdkIntegration installed.", new Object[0]);     // Catch: Throwable -> L16 NoSuchMethodException -> L18
        AbstractC1856a.m4055a("Ndk");     // Catch: Throwable -> L16 NoSuchMethodException -> L18
        return;
    L18:
        e = move-exception;
        m3845d(this.f5992b);
        this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        return;
    L16:
        th = move-exception;
        m3845d(this.f5992b);
        this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to initialize SentryNdk.", th);
        return;
    L23:
        m3845d(this.f5992b);
        return;
    L5:
        r62 = null;
        goto L6
    }
}
