package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1935o0;
import io.sentry.config.AbstractC1856a;
import io.sentry.transport.C2009d;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements InterfaceC1935o0, Closeable {

    /* JADX INFO: renamed from: d */
    public static final long f5942d = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: a */
    public final Context f5943a;

    /* JADX INFO: renamed from: b */
    public final C2009d f5944b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f5945c;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5943a = applicationContext != null ? applicationContext : context;
        this.f5944b = C2009d.f7188a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f5945c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f5945c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f5945c.isAnrEnabled()));
        if (this.f5945c.getCacheDirPath() == null) {
            this.f5945c.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f5945c.isAnrEnabled()) {
            try {
                c2046v2.getExecutorService().submit(new RunnableC1749w(this.f5943a, this.f5945c, this.f5944b));
            } catch (Throwable th) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to start AnrProcessor.", th);
            }
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrV2Integration installed.", new Object[0]);
            AbstractC1856a.m4055a("AnrV2");
        }
    }
}
