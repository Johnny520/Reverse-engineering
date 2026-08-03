package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.AbstractC2066z1;
import io.sentry.C1573D2;
import io.sentry.C1881h1;
import io.sentry.C1896i1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.CallableC1590I;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1833c0;
import io.sentry.InterfaceC1895i0;
import io.sentry.InterfaceC1911j0;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p000.C0118Cp;

/* JADX INFO: renamed from: io.sentry.android.core.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1744r implements InterfaceC1911j0 {

    /* JADX INFO: renamed from: a */
    public final Context f6328a;

    /* JADX INFO: renamed from: b */
    public final ILogger f6329b;

    /* JADX INFO: renamed from: c */
    public final String f6330c;

    /* JADX INFO: renamed from: d */
    public final boolean f6331d;

    /* JADX INFO: renamed from: e */
    public final int f6332e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1833c0 f6333f;

    /* JADX INFO: renamed from: g */
    public final C1666I f6334g;

    /* JADX INFO: renamed from: h */
    public boolean f6335h;

    /* JADX INFO: renamed from: i */
    public int f6336i;

    /* JADX INFO: renamed from: j */
    public final C1727o f6337j;

    /* JADX INFO: renamed from: k */
    public C1896i1 f6338k;

    /* JADX INFO: renamed from: l */
    public C1734p f6339l;

    /* JADX INFO: renamed from: m */
    public long f6340m;

    /* JADX INFO: renamed from: n */
    public long f6341n;

    /* JADX INFO: renamed from: o */
    public Date f6342o;

    /* JADX INFO: renamed from: p */
    public final C2029a f6343p;

    public C1744r(Context r2, C1666I r3, C1727o r4, ILogger r5, String r6, boolean r7, int r8, InterfaceC1833c0 r9) {
        this.f6335h = false;
        this.f6336i = 0;
        this.f6339l = null;
        this.f6343p = new C2029a();
        Context r0 = r2.getApplicationContext();
        if (r0 == null) goto L5;
        r2 = r0;
    L5:
        this.f6328a = r2;
        AbstractC1856a.m4048D("ILogger is required", r5);
        this.f6329b = r5;
        this.f6337j = r4;
        AbstractC1856a.m4048D("The BuildInfoProvider is required.", r3);
        this.f6334g = r3;
        this.f6330c = r6;
        this.f6331d = r7;
        this.f6332e = r8;
        AbstractC1856a.m4048D("The ISentryExecutorService is required.", r9);
        this.f6333f = r9;
        this.f6342o = AbstractC1856a.m4067m();
    }

    /* JADX INFO: renamed from: a */
    public final void m3921a() {
        if (this.f6335h == false) goto L5;
        return;
    L5:
        this.f6335h = true;
        boolean r0 = this.f6331d;
        ILogger r2 = this.f6329b;
        if (r0 == true) goto L9;
        r2.mo3680e(EnumC1657a2.INFO, "Profiling is disabled in options.", new Object[0]);
        return;
    L9:
        String r5 = this.f6330c;
        if (r5 != null) goto L13;
        r2.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
        return;
    L13:
        int r02 = this.f6332e;
        if (r02 > 0) goto L17;
        r2.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because trace rate is set to %d", new Object[]{Integer.valueOf(r02)});
        return;
    L17:
        int r6 = ((int) TimeUnit.SECONDS.toMicros(1)) / r02;
        InterfaceC1833c0 r8 = this.f6333f;
        ILogger r9 = this.f6329b;
        this.f6339l = new C1734p(r5, r6, this.f6337j, r8, r9);
    }

    @Override // io.sentry.InterfaceC1911j0
    /* JADX INFO: renamed from: b */
    public final C1881h1 mo3691b(C1573D2 r10, List r11, C2046v2 r12) {
        C1981r r1 = this.f6343p.m4173a();
        C1881h1 r102 = m3922c(r10.f5632e, r10.f5628a.toString(), r10.f5629b.f5719c.f5738a.toString(), false, r11, r12);     // Catch: Throwable -> L6
        r1.close();
        return r102;
    L6:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L10
        throw th;
    L10:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final C1881h1 m3922c(String r25, String r26, String r27, boolean r28, List r29, C2046v2 r30) {
        C1666I r2 = this.f6334g;
        C1981r r23 = this.f6343p.m4173a();
    L17:
        th = move-exception;
        r23.close();     // Catch: Throwable -> L64
        throw th;
    L64:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L4:
        Long r4 = null;
        if (this.f6339l != null) goto L8;
        r23.close();
        return null;
    L8:
        r2.getClass();     // Catch: Throwable -> L17
        C1896i1 r3 = this.f6338k;     // Catch: Throwable -> L17
        ILogger r5 = this.f6329b;
        if (r3 != null) goto L12;
    L59:
        r5.mo3680e(EnumC1657a2.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", new Object[]{r25, r27});     // Catch: Throwable -> L17
        r23.close();
        return null;
    L12:
        if (r3.f6765a.equals(r26) == false) goto L59;
        int r32 = this.f6336i;     // Catch: Throwable -> L17
        if (r32 <= 0) goto L19;
        this.f6336i = r32 - 1;     // Catch: Throwable -> L17
    L19:
        r5.mo3680e(EnumC1657a2.DEBUG, "Transaction %s (%s) finished.", new Object[]{r25, r27});     // Catch: Throwable -> L17
        if (this.f6336i == 0) goto L26;
        C1896i1 r0 = this.f6338k;     // Catch: Throwable -> L17
        if (r0 == null) goto L24;
        r0.m4097a(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.f6340m), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.f6341n));     // Catch: Throwable -> L17
    L24:
        r23.close();
        return null;
    L26:
        boolean r52 = false;
        C1733o r33 = this.f6339l.m3910a(r29, false);     // Catch: Throwable -> L17
        if (r33 != null) goto L30;
        r23.close();
        return null;
    L30:
        long r10 = r33.f6274a;     // Catch: Throwable -> L17
        long r12 = r10 - this.f6340m;     // Catch: Throwable -> L17
        ArrayList r14 = new ArrayList(1);     // Catch: Throwable -> L17
        C1896i1 r9 = this.f6338k;     // Catch: Throwable -> L17
        if (r9 == null) goto L33;
        r14.add(r9);     // Catch: Throwable -> L17
    L33:
        this.f6338k = null;     // Catch: Throwable -> L17
        this.f6336i = 0;     // Catch: Throwable -> L17
        String r92 = "0";
        if ((r30 instanceof SentryAndroidOptions) == false) goto L36;
        r4 = C1670M.m3842c(this.f6328a, (SentryAndroidOptions) r30).f5989h;     // Catch: Throwable -> L17
    L36:
        if (r4 == null) goto L38;
        r92 = Long.toString(r4.longValue());     // Catch: Throwable -> L17
    L38:
        String r17 = r92;
        String[] r42 = Build.SUPPORTED_ABIS;     // Catch: Throwable -> L17
        Iterator r93 = r14.iterator();     // Catch: Throwable -> L17
    L40:
        if (r93.hasNext() == false) goto L42;
        boolean r16 = r52;
        ((C1896i1) r93.next()).m4097a(Long.valueOf(r10), Long.valueOf(this.f6340m), Long.valueOf(r33.f6275b), Long.valueOf(this.f6341n));     // Catch: Throwable -> L17
        r93 = r93;
        r52 = r16;
        goto L40
    L42:
        boolean r162 = r52;
        File r6 = r33.f6276c;     // Catch: Throwable -> L17
        Date r7 = this.f6342o;     // Catch: Throwable -> L17
        String r94 = Long.toString(r12);     // Catch: Throwable -> L17
        int r102 = Build.VERSION.SDK_INT;     // Catch: Throwable -> L17
        if (r42 != null) goto L45;
    L48:
        String r43 = "";
    L47:
        String r11 = r43;
        CallableC1590I r122 = new CallableC1590I(3);     // Catch: Throwable -> L17
        String r13 = Build.MANUFACTURER;     // Catch: Throwable -> L17
        String r142 = Build.MODEL;     // Catch: Throwable -> L17
        String r15 = Build.VERSION.RELEASE;     // Catch: Throwable -> L17
        Boolean r163 = r2.m3834b();     // Catch: Throwable -> L17
        String r18 = r30.getProguardUuid();     // Catch: Throwable -> L17
        String r19 = r30.getRelease();     // Catch: Throwable -> L17
        String r20 = r30.getEnvironment();     // Catch: Throwable -> L17
        if (r33.f6278e == true) goto L55;
        if (r28 == true) goto L55;
        String r02 = "normal";
    L54:
        String r21 = r02;
        C1881h1 r22 = new C1881h1(r6, r7, r14, r25, r26, r27, r94, r102, r11, r122, r13, r142, r15, r163, r17, r18, r19, r20, r21, r33.f6277d);     // Catch: Throwable -> L17
        r23.close();
        return r22;
    L55:
        r02 = "timeout";
        goto L54
    L45:
        if (r42.length <= 0) goto L48;
        r43 = r42[r162 ? 1 : 0];     // Catch: Throwable -> L17
        goto L47
    }

    @Override // io.sentry.InterfaceC1911j0
    public final void close() {
        C1896i1 r0 = this.f6338k;
        if (r0 == null) goto L5;
        C1744r r2 = this;
        r2.m3922c(r0.f6767c, r0.f6765a, r0.f6766b, true, null, AbstractC2066z1.m4233b().mo3718l());
    L8:
        C1734p r02 = r2.f6339l;
        if (r02 == null) goto L26;
        C1981r r3 = r02.f6293o.m4173a();
        Future r4 = r02.f6282d;     // Catch: Throwable -> L14
        if (r4 == null) goto L17;
        r4.cancel(true);     // Catch: Throwable -> L14
        r02.f6282d = null;     // Catch: Throwable -> L14
    L17:
        if (r02.f6292n == false) goto L19;
        r02.m3910a(null, true);     // Catch: Throwable -> L14
    L19:
        r3.close();
        return;
    L14:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L23
        throw th;
    L23:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L26:
        return;
    L5:
        r2 = this;
        int r03 = r2.f6336i;
        if (r03 == 0) goto L8;
        r2.f6336i = r03 - 1;
        goto L8
    }

    @Override // io.sentry.InterfaceC1911j0
    public final boolean isRunning() {
        if (this.f6336i == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // io.sentry.InterfaceC1911j0
    public final void start() {
        C1981r r0 = this.f6343p.m4173a();
        this.f6334g.getClass();     // Catch: Throwable -> L13
        m3921a();     // Catch: Throwable -> L13
        int r1 = this.f6336i + 1;     // Catch: Throwable -> L13
        this.f6336i = r1;     // Catch: Throwable -> L13
        ILogger r3 = this.f6329b;
        if (r1 != 1) goto L15;
        C1734p r12 = this.f6339l;     // Catch: Throwable -> L13
        if (r12 == null) goto L15;
        C0118Cp r13 = r12.m3912c();     // Catch: Throwable -> L13
        if (r13 == null) goto L15;
        this.f6340m = r13.f287a;     // Catch: Throwable -> L13
        this.f6341n = r13.f288b;     // Catch: Throwable -> L13
        this.f6342o = (Date) r13.f289c;     // Catch: Throwable -> L13
        r3.mo3680e(EnumC1657a2.DEBUG, "Profiler started.", new Object[0]);     // Catch: Throwable -> L13
    L16:
        r0.close();
        return;
    L15:
        this.f6336i--;
        r3.mo3680e(EnumC1657a2.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L20
    L22:
        throw th;
    L20:
        th = move-exception;
        th.addSuppressed(th);
        goto L22
    }

    @Override // io.sentry.InterfaceC1911j0
    /* JADX INFO: renamed from: u */
    public final void mo3706u(InterfaceC1895i0 r6) {
        C1981r r0 = this.f6343p.m4173a();
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L15
    L17:
        throw th;
    L15:
        th = move-exception;
        th.addSuppressed(th);
        goto L17
    L4:
        if (this.f6336i > 0) goto L6;
    L11:
        r0.close();
        return;
    L6:
        if (this.f6338k != null) goto L11;
        this.f6338k = new C1896i1(r6, Long.valueOf(this.f6340m), Long.valueOf(this.f6341n));     // Catch: Throwable -> L9
        goto L11
    }
}
