package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C1560A1;
import io.sentry.C1571D0;
import io.sentry.C1617O2;
import io.sentry.C1638U1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.android.core.performance.C1740f;
import io.sentry.util.C2029a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import p000.C2648vx;

/* JADX INFO: loaded from: classes.dex */
public final class SentryPerformanceProvider extends AbstractC1671N {

    /* JADX INFO: renamed from: e */
    public static final long f6022e = 0;

    /* JADX INFO: renamed from: b */
    public Application f6023b;

    /* JADX INFO: renamed from: c */
    public final C1743q f6024c;

    /* JADX INFO: renamed from: d */
    public final C1666I f6025d;

    static {
        f6022e = SystemClock.uptimeMillis();
    }

    public SentryPerformanceProvider() {
        new C2029a();
        C1743q r0 = new C1743q(3);
        this.f6024c = r0;
        this.f6025d = new C1666I(r0);
    }

    /* JADX INFO: renamed from: a */
    public final void m3853a(Context r10, C1560A1 r11, C1740f r12) {
        boolean r0 = r11.f5590i;
        C1743q r5 = this.f6024c;
        if (r0 == true) goto L6;
        r5.mo3680e(EnumC1657a2.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
        return;
    L6:
        C1727o r4 = new C1727o(r10.getApplicationContext(), r5, this.f6025d);
        String r6 = r11.f5586e;
        int r7 = r11.f5589h;
        C1638U1 r8 = new C1638U1();
        C1696g r2 = new C1696g(this.f6025d, r4, r5, r6, r7, r8);
        r12.f6313h = null;
        r12.f6314i = r2;
        r5.mo3680e(EnumC1657a2.DEBUG, "App start continuous profiling started.", new Object[0]);
        C2046v2 r102 = C2046v2.empty();
        if (r11.f5590i == false) goto L9;
        double r02 = 1.0d;
    L10:
        r102.setProfileSessionSampleRate(Double.valueOf(r02));
        r2.mo3696h(r11.f5593l, new C1617O2(r102));
        return;
    L9:
        r02 = 0.0d;
        goto L10
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context r3, ProviderInfo r4) {
        if (SentryPerformanceProvider.class.getName().equals(r4.authority) == true) goto L7;
        super.attachInfo(r3, r4);
        return;
    L7:
        throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
    }

    /* JADX INFO: renamed from: b */
    public final void m3854b(Context r20, C1560A1 r21, C1740f r22) {
        boolean r9 = r21.f5584c;
        C2648vx r3 = new C2648vx(Boolean.valueOf(r9), r21.f5585d, null, Boolean.valueOf(r21.f5582a), r21.f5583b);
        r22.f6315j = r3;
        boolean r32 = ((Boolean) r3.f9165d).booleanValue();
        C1743q r14 = this.f6024c;
        if (r32 == false) goto L8;
        if (r9 == false) goto L8;
        C1727o r13 = new C1727o(r20, r14, this.f6025d);
        String r15 = r21.f5586e;
        boolean r33 = r21.f5587f;
        int r1 = r21.f5589h;
        C1638U1 r18 = new C1638U1();
        C1744r r10 = new C1744r(r20, this.f6025d, r13, r14, r15, r33, r1, r18);
        r22.f6314i = null;
        r22.f6313h = r10;
        r14.mo3680e(EnumC1657a2.DEBUG, "App start profiling started.", new Object[0]);
        r10.start();
        return;
    L8:
        r14.mo3680e(EnumC1657a2.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r1) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C1740f r0 = C1740f.m3914b();
        Context r1 = getContext();
        r0.f6309d.m3920c(f6022e);
        this.f6025d.getClass();
        r0.f6308c.m3920c(Process.getStartUptimeMillis());
        if ((r1 instanceof Application) == false) goto L5;
        this.f6023b = (Application) r1;
    L5:
        Application r12 = this.f6023b;
        if (r12 == null) goto L9;
        r0.m3917d(r12);
    L9:
        Context r13 = getContext();
        C1743q r3 = this.f6024c;
        if (r13 != null) goto L12;
        r3.mo3680e(EnumC1657a2.FATAL, "App. Context from ContentProvider is null", new Object[0]);
        return true;
    L12:
        File r5 = new File(new File(r13.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (r5.exists() == true) goto L15;
        return true;
    L15:
        if (r5.canRead() == false) goto L57;
        BufferedReader r4 = new BufferedReader(new InputStreamReader(new FileInputStream(r5)));     // Catch: Throwable -> L23 FileNotFoundException -> L25
        C1560A1 r52 = (C1560A1) new C1571D0(C2046v2.empty()).mo3607a(r4, C1560A1.class);     // Catch: Throwable -> L27
        if (r52 != null) goto L30;
        r3.mo3680e(EnumC1657a2.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);     // Catch: Throwable -> L27
    L21:
        r4.close();     // Catch: Throwable -> L23 FileNotFoundException -> L25
        return true;
    L30:
        if (r52.f5588g == false) goto L35;
        if (r52.f5592k == false) goto L35;
        m3853a(r13, r52, r0);     // Catch: Throwable -> L27
    L35:
        if (r52.f5587f == true) goto L38;
        r3.mo3680e(EnumC1657a2.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);     // Catch: Throwable -> L27
        goto L21
    L38:
        if (r52.f5591j == false) goto L21;
        m3854b(r13, r52, r0);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L43
    L45:
        throw th;     // Catch: Throwable -> L23 FileNotFoundException -> L25
    L43:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L23 FileNotFoundException -> L25
    L25:
        e = move-exception;
        r3.mo3683r(EnumC1657a2.ERROR, "App start profiling config file not found. ", e);
        return true;
    L23:
        th = move-exception;
        r3.mo3683r(EnumC1657a2.ERROR, "Error reading app start profiling config file. ", th);
        return true;
    L57:
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        C1981r r0 = C1740f.f6305q.m4173a();
        C1744r r1 = C1740f.m3914b().f6313h;     // Catch: Throwable -> L6
        if (r1 == null) goto L8;
        r1.close();     // Catch: Throwable -> L6
    L8:
        C1696g r12 = C1740f.m3914b().f6314i;     // Catch: Throwable -> L6
        if (r12 == null) goto L11;
        r12.mo3690a(true);     // Catch: Throwable -> L6
    L11:
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L15
    L17:
        throw th;
    L15:
        th = move-exception;
        th.addSuppressed(th);
        goto L17
    }
}
