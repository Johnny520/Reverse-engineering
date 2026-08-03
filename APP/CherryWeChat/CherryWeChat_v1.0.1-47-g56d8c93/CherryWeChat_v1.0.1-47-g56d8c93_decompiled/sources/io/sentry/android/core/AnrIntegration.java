package io.sentry.android.core;

import android.content.Context;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1935o0;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.Closeable;
import p000.C0698Q9;
import p000.RunnableC2260n3;

/* JADX INFO: loaded from: classes.dex */
public final class AnrIntegration implements InterfaceC1935o0, Closeable {

    /* JADX INFO: renamed from: e */
    public static C1683a f5936e;

    /* JADX INFO: renamed from: f */
    public static final C2029a f5937f = new C2029a();

    /* JADX INFO: renamed from: a */
    public final Context f5938a;

    /* JADX INFO: renamed from: b */
    public boolean f5939b = false;

    /* JADX INFO: renamed from: c */
    public final C2029a f5940c = new C2029a();

    /* JADX INFO: renamed from: d */
    public C2046v2 f5941d;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5938a = applicationContext != null ? applicationContext : context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = this.f5940c.m4173a();
        try {
            this.f5939b = true;
            c1981rM4173a.close();
            c1981rM4173a = f5937f.m4173a();
            try {
                C1683a c1683a = f5936e;
                if (c1683a != null) {
                    c1683a.interrupt();
                    f5936e = null;
                    C2046v2 c2046v2 = this.f5941d;
                    if (c2046v2 != null) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                c1981rM4173a.close();
            } finally {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3805d(SentryAndroidOptions sentryAndroidOptions) {
        C1981r c1981rM4173a = f5937f.m4173a();
        try {
            if (f5936e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
                logger.mo3680e(enumC1657a2, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                C1683a c1683a = new C1683a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C0698Q9(7, this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f5938a);
                f5936e = c1683a;
                c1683a.start();
                sentryAndroidOptions.getLogger().mo3680e(enumC1657a2, "AnrIntegration installed.", new Object[0]);
            }
            c1981rM4173a.close();
        } finally {
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        this.f5941d = c2046v2;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c2046v2;
        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            AbstractC1856a.m4055a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new RunnableC2260n3(23, this, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }
}
