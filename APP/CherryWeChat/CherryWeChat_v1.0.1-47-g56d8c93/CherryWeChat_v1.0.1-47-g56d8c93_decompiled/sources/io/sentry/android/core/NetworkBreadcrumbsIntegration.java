package io.sentry.android.core;

import android.content.Context;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1935o0;
import io.sentry.android.core.internal.util.C1714b;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC1935o0, Closeable {

    /* JADX INFO: renamed from: a */
    public final Context f5993a;

    /* JADX INFO: renamed from: b */
    public final C1666I f5994b;

    /* JADX INFO: renamed from: c */
    public final C2029a f5995c = new C2029a();

    /* JADX INFO: renamed from: d */
    public volatile C1681Y f5996d;

    public NetworkBreadcrumbsIntegration(Context context, C1666I c1666i) {
        Context applicationContext = context.getApplicationContext();
        this.f5993a = applicationContext != null ? applicationContext : context;
        this.f5994b = c1666i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = this.f5995c.m4173a();
        try {
            C1681Y c1681y = this.f5996d;
            this.f5996d = null;
            c1981rM4173a.close();
            if (c1681y != null) {
                C1981r c1981rM4173a2 = C1714b.f6207n.m4173a();
                try {
                    C1714b.f6208o.remove(c1681y);
                    c1981rM4173a2.close();
                } catch (Throwable th) {
                    try {
                        c1981rM4173a2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 c2046v2) {
        SentryAndroidOptions sentryAndroidOptions = c2046v2 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c2046v2 : null;
        AbstractC1856a.m4048D("SentryAndroidOptions is required", sentryAndroidOptions);
        ILogger logger = c2046v2.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        logger.mo3680e(enumC1657a2, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f5994b.getClass();
            C1981r c1981rM4173a = this.f5995c.m4173a();
            try {
                this.f5996d = new C1681Y(this.f5994b, c2046v2.getDateProvider());
                if (C1714b.m3890i(this.f5993a, c2046v2.getLogger(), this.f5994b, this.f5996d)) {
                    c2046v2.getLogger().mo3680e(enumC1657a2, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    AbstractC1856a.m4055a("NetworkBreadcrumbs");
                } else {
                    c2046v2.getLogger().mo3680e(enumC1657a2, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
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
    }
}
