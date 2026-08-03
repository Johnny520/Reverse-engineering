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
    public final C2029a f5995c;

    /* JADX INFO: renamed from: d */
    public volatile C1681Y f5996d;

    public NetworkBreadcrumbsIntegration(Context r2, C1666I r3) {
        this.f5995c = new C2029a();
        Context r0 = r2.getApplicationContext();
        if (r0 == null) goto L5;
        r2 = r0;
    L5:
        this.f5993a = r2;
        this.f5994b = r3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = this.f5995c.m4173a();
        C1681Y r1 = this.f5996d;     // Catch: Throwable -> L17
        this.f5996d = null;     // Catch: Throwable -> L17
        r0.close();
        if (r1 == null) goto L16;
        C1981r r02 = C1714b.f6207n.m4173a();
        C1714b.f6208o.remove(r1);     // Catch: Throwable -> L10
        r02.close();
        return;
    L10:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L16:
        return;
    L17:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L20
    L22:
        throw th;
    L20:
        th = move-exception;
        th.addSuppressed(th);
        goto L22
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r7) {
        if ((r7 instanceof SentryAndroidOptions) == false) goto L5;
        SentryAndroidOptions r0 = (SentryAndroidOptions) r7;
    L6:
        AbstractC1856a.m4048D("SentryAndroidOptions is required", r0);
        ILogger r1 = r7.getLogger();
        EnumC1657a2 r2 = EnumC1657a2.DEBUG;
        r1.mo3680e(r2, "NetworkBreadcrumbsIntegration enabled: %s", new Object[]{Boolean.valueOf(r0.isEnableNetworkEventBreadcrumbs())});
        if (r0.isEnableNetworkEventBreadcrumbs() == false) goto L22;
        this.f5994b.getClass();
        C1981r r02 = this.f5995c.m4173a();
        this.f5996d = new C1681Y(this.f5994b, r7.getDateProvider());     // Catch: Throwable -> L12
        if (C1714b.m3890i(this.f5993a, r7.getLogger(), this.f5994b, this.f5996d) == false) goto L14;
        r7.getLogger().mo3680e(r2, "NetworkBreadcrumbsIntegration installed.", new Object[0]);     // Catch: Throwable -> L12
        AbstractC1856a.m4055a("NetworkBreadcrumbs");     // Catch: Throwable -> L12
    L15:
        r02.close();
        return;
    L14:
        r7.getLogger().mo3680e(r2, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L19
    L21:
        throw th;
    L19:
        th = move-exception;
        th.addSuppressed(th);
        goto L21
    L22:
        return;
    L5:
        r0 = null;
        goto L6
    }
}
