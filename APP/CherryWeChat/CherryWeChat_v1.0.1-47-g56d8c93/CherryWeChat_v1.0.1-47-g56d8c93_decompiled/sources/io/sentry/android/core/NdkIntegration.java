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

    public NdkIntegration(Class cls) {
        this.f5991a = cls;
    }

    /* JADX INFO: renamed from: d */
    public static void m3845d(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f5992b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f5991a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f5992b.getLogger().mo3680e(EnumC1657a2.DEBUG, "NdkIntegration removed.", new Object[0]);
                        m3845d(this.f5992b);
                    } catch (NoSuchMethodException e) {
                        this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                        m3845d(this.f5992b);
                    }
                } catch (Throwable th) {
                    this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to close SentryNdk.", th);
                    m3845d(this.f5992b);
                }
            }
        } catch (Throwable th2) {
            m3845d(this.f5992b);
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f5992b = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f5992b.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.f5991a) == null) {
            m3845d(this.f5992b);
            return;
        }
        if (this.f5992b.getCacheDirPath() == null) {
            this.f5992b.getLogger().mo3680e(EnumC1657a2.ERROR, "No cache dir path is defined in options.", new Object[0]);
            m3845d(this.f5992b);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f5992b);
            this.f5992b.getLogger().mo3680e(enumC1657a2, "NdkIntegration installed.", new Object[0]);
            AbstractC1856a.m4055a("Ndk");
        } catch (NoSuchMethodException e) {
            m3845d(this.f5992b);
            this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            m3845d(this.f5992b);
            this.f5992b.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }
}
