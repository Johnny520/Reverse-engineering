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
    public static final long f5942d = 0;

    /* JADX INFO: renamed from: a */
    public final Context f5943a;

    /* JADX INFO: renamed from: b */
    public final C2009d f5944b;

    /* JADX INFO: renamed from: c */
    public SentryAndroidOptions f5945c;

    static {
        f5942d = TimeUnit.DAYS.toMillis(91);
    }

    public AnrV2Integration(Context r2) {
        Context r0 = r2.getApplicationContext();
        if (r0 == null) goto L5;
        r2 = r0;
    L5:
        this.f5943a = r2;
        this.f5944b = C2009d.f7188a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions r0 = this.f5945c;
        if (r0 == null) goto L6;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrV2Integration removed.", new Object[0]);
        return;
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r7) {
        if ((r7 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r0 = (SentryAndroidOptions) r7;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r0);
        this.f5945c = r0;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrIntegration enabled: %s", new Object[]{Boolean.valueOf(this.f5945c.isAnrEnabled())});
        if (this.f5945c.getCacheDirPath() != null) goto L11;
        this.f5945c.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
        return;
    L11:
        if (this.f5945c.isAnrEnabled() == false) goto L20;
        r7.getExecutorService().submit(new RunnableC1749w(this.f5943a, this.f5945c, this.f5944b));     // Catch: Throwable -> L14
    L16:
        r7.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrV2Integration installed.", new Object[0]);
        AbstractC1856a.m4055a("AnrV2");
        return;
    L14:
        th = move-exception;
        r7.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to start AnrProcessor.", th);
        goto L16
    L20:
        return;
    L5:
        r0 = null;
        goto L6
    }
}
