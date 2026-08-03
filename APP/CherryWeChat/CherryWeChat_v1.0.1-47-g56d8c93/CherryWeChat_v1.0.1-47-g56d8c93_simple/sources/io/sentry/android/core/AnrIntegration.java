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
    public static final C2029a f5937f = null;

    /* JADX INFO: renamed from: a */
    public final Context f5938a;

    /* JADX INFO: renamed from: b */
    public boolean f5939b;

    /* JADX INFO: renamed from: c */
    public final C2029a f5940c;

    /* JADX INFO: renamed from: d */
    public C2046v2 f5941d;

    static {
        f5937f = new C2029a();
    }

    public AnrIntegration(Context r2) {
        this.f5939b = false;
        this.f5940c = new C2029a();
        Context r0 = r2.getApplicationContext();
        if (r0 == null) goto L5;
        r2 = r0;
    L5:
        this.f5938a = r2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r r0 = this.f5940c.m4173a();
        this.f5939b = true;     // Catch: Throwable -> L20
        r0.close();
        C1981r r02 = f5937f.m4173a();
        C1683a r1 = f5936e;     // Catch: Throwable -> L11
        if (r1 == null) goto L13;
        r1.interrupt();     // Catch: Throwable -> L11
        f5936e = null;     // Catch: Throwable -> L11
        C2046v2 r12 = this.f5941d;     // Catch: Throwable -> L11
        if (r12 == null) goto L13;
        r12.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrIntegration removed.", new Object[0]);     // Catch: Throwable -> L11
    L13:
        r02.close();
        return;
    L11:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
    L20:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L23
    L25:
        throw th;
    L23:
        th = move-exception;
        th.addSuppressed(th);
        goto L25
    }

    /* JADX INFO: renamed from: d */
    public final void m3805d(SentryAndroidOptions r13) {
        C1981r r1 = f5937f.m4173a();
    L7:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L13
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L4:
        if (f5936e != null) goto L9;
        ILogger r0 = r13.getLogger();     // Catch: Throwable -> L7
        EnumC1657a2 r2 = EnumC1657a2.DEBUG;     // Catch: Throwable -> L7
        r0.mo3680e(r2, "ANR timeout in milliseconds: %d", new Object[]{Long.valueOf(r13.getAnrTimeoutIntervalMillis())});     // Catch: Throwable -> L7
        C1683a r5 = new C1683a(r13.getAnrTimeoutIntervalMillis(), r13.isAnrReportInDebug(), new C0698Q9(7, this, r13), r13.getLogger(), this.f5938a);     // Catch: Throwable -> L7
        f5936e = r5;     // Catch: Throwable -> L7
        r5.start();     // Catch: Throwable -> L7
        r13.getLogger().mo3680e(r2, "AnrIntegration installed.", new Object[0]);     // Catch: Throwable -> L7
    L9:
        r1.close();
    }

    @Override // io.sentry.InterfaceC1935o0
    /* JADX INFO: renamed from: p */
    public final void mo3742p(C2046v2 r5) {
        this.f5941d = r5;
        SentryAndroidOptions r52 = (SentryAndroidOptions) r5;
        r52.getLogger().mo3680e(EnumC1657a2.DEBUG, "AnrIntegration enabled: %s", new Object[]{Boolean.valueOf(r52.isAnrEnabled())});
        if (r52.isAnrEnabled() == false) goto L12;
        AbstractC1856a.m4055a("Anr");
        r52.getExecutorService().submit(new RunnableC2260n3(23, this, r52));     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        r52.getLogger().mo3683r(EnumC1657a2.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
        return;
    }
}
