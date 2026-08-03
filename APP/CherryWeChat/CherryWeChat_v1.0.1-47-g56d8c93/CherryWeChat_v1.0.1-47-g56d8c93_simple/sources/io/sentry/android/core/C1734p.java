package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C1827b1;
import io.sentry.C1981r;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1833c0;
import io.sentry.RunnableC1631S1;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.config.AbstractC1856a;
import io.sentry.profilemeasurements.C1942a;
import io.sentry.profilemeasurements.C1943b;
import io.sentry.util.C2029a;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p000.C0118Cp;

/* JADX INFO: renamed from: io.sentry.android.core.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1734p {

    /* JADX INFO: renamed from: a */
    public long f6279a;

    /* JADX INFO: renamed from: b */
    public final File f6280b;

    /* JADX INFO: renamed from: c */
    public final int f6281c;

    /* JADX INFO: renamed from: d */
    public Future f6282d;

    /* JADX INFO: renamed from: e */
    public File f6283e;

    /* JADX INFO: renamed from: f */
    public String f6284f;

    /* JADX INFO: renamed from: g */
    public final C1727o f6285g;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f6286h;

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f6287i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f6288j;

    /* JADX INFO: renamed from: k */
    public final HashMap f6289k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1833c0 f6290l;

    /* JADX INFO: renamed from: m */
    public final ILogger f6291m;

    /* JADX INFO: renamed from: n */
    public boolean f6292n;

    /* JADX INFO: renamed from: o */
    public final C2029a f6293o;

    public C1734p(String r3, int r4, C1727o r5, InterfaceC1833c0 r6, ILogger r7) {
        this.f6279a = 0;
        this.f6282d = null;
        this.f6283e = null;
        this.f6286h = new ArrayDeque();
        this.f6287i = new ArrayDeque();
        this.f6288j = new ArrayDeque();
        this.f6289k = new HashMap();
        this.f6292n = false;
        this.f6293o = new C2029a();
        AbstractC1856a.m4048D("TracesFilesDirPath is required", r3);
        this.f6280b = new File(r3);
        this.f6281c = r4;
        AbstractC1856a.m4048D("Logger is required", r7);
        this.f6291m = r7;
        this.f6290l = r6;
        AbstractC1856a.m4048D("SentryFrameMetricsCollector is required", r5);
        this.f6285g = r5;
    }

    /* JADX INFO: renamed from: a */
    public final C1733o m3910a(List r19, boolean r20) {
        ArrayDeque r2 = this.f6286h;
        ArrayDeque r3 = this.f6288j;
        ArrayDeque r4 = this.f6287i;
        C1981r r5 = this.f6293o.m4173a();
        boolean r0 = this.f6292n;     // Catch: Throwable -> L9
        ILogger r7 = this.f6291m;
        if (r0 == true) goto L49;
        r7.mo3680e(EnumC1657a2.WARNING, "Profiler not running", new Object[0]);     // Catch: Throwable -> L9
        r5.close();
        return null;
    L49:
        Debug.stopMethodTracing();     // Catch: Throwable -> L13
    L15:
        this.f6292n = false;     // Catch: Throwable -> L9
        this.f6285g.m3906a(this.f6284f);     // Catch: Throwable -> L9
        long r11 = SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L9
        long r13 = Process.getElapsedCpuTime();     // Catch: Throwable -> L9
        if (this.f6283e != null) goto L20;
        r7.mo3680e(EnumC1657a2.ERROR, "Trace file does not exists", new Object[0]);     // Catch: Throwable -> L9
        r5.close();
        return null;
    L20:
        boolean r02 = r4.isEmpty();     // Catch: Throwable -> L9
        HashMap r8 = this.f6289k;
        if (r02 == true) goto L25;
        r8.put("slow_frame_renders", new C1942a("nanosecond", r4));     // Catch: Throwable -> L9
    L25:
        if (r3.isEmpty() == true) goto L28;
        r8.put("frozen_frame_renders", new C1942a("nanosecond", r3));     // Catch: Throwable -> L9
    L28:
        if (r2.isEmpty() == true) goto L30;
        r8.put("screen_frame_rates", new C1942a("hz", r2));     // Catch: Throwable -> L9
    L30:
        m3911b(r19);     // Catch: Throwable -> L9
        Future r03 = this.f6282d;     // Catch: Throwable -> L9
        if (r03 == null) goto L33;
        r03.cancel(true);     // Catch: Throwable -> L9
        this.f6282d = null;     // Catch: Throwable -> L9
    L33:
        C1733o r10 = new C1733o(r11, r13, r20, this.f6283e, r8);     // Catch: Throwable -> L9
        r5.close();
        return r10;
    L13:
        th = move-exception;
        r7.mo3683r(EnumC1657a2.ERROR, "Error while stopping profiling: ", th);     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        this.f6292n = false;     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r5.close();     // Catch: Throwable -> L41
        throw th;
    L41:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m3911b(List r17) {
        long r2 = (SystemClock.elapsedRealtimeNanos() - this.f6279a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (r17 == null) goto L31;
        ArrayDeque r0 = new ArrayDeque(r17.size());
        ArrayDeque r4 = new ArrayDeque(r17.size());
        ArrayDeque r5 = new ArrayDeque(r17.size());
        monitor-enter(r17);
        Iterator r6 = r17.iterator();     // Catch: Throwable -> L12
    L8:
        if (r6.hasNext() == false) goto L18;
        C1827b1 r7 = (C1827b1) r6.next();     // Catch: Throwable -> L12
        long r8 = r7.f6604d;     // Catch: Throwable -> L12
        long r10 = r8 + r2;     // Catch: Throwable -> L12
        Double r12 = r7.f6601a;     // Catch: Throwable -> L12
        Long r13 = r7.f6602b;     // Catch: Throwable -> L12
        Long r72 = r7.f6603c;     // Catch: Throwable -> L12
        if (r12 == null) goto L14;
        r5.add(new C1943b(Long.valueOf(r10), r12, r8));     // Catch: Throwable -> L12
    L14:
        if (r13 == null) goto L16;
        r0.add(new C1943b(Long.valueOf(r10), r13, r8));     // Catch: Throwable -> L12
    L16:
        if (r72 == null) goto L8;
        r4.add(new C1943b(Long.valueOf(r10), r72, r8));     // Catch: Throwable -> L12
        goto L8
    L18:
        monitor-exit(r17);     // Catch: Throwable -> L12
        if (r5.isEmpty() == true) goto L23;
        this.f6289k.put("cpu_usage", new C1942a("percent", r5));
    L23:
        if (r0.isEmpty() == true) goto L26;
        this.f6289k.put("memory_footprint", new C1942a("byte", r0));
    L26:
        if (r4.isEmpty() == true) goto L39;
        this.f6289k.put("memory_native_footprint", new C1942a("byte", r4));
        return;
    L39:
        return;
    L12:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final C0118Cp m3912c() {
        C1981r r1 = this.f6293o.m4173a();
        int r2 = this.f6281c;
        ILogger r4 = this.f6291m;
        if (r2 != 0) goto L10;
        r4.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because intervaUs is set to %d", new Object[]{Integer.valueOf(r2)});     // Catch: Throwable -> L7
        r1.close();
        return null;
    L10:
        if (this.f6292n == false) goto L14;
        r4.mo3680e(EnumC1657a2.WARNING, "Profiling has already started...", new Object[0]);     // Catch: Throwable -> L7
        r1.close();
        return null;
    L14:
        this.f6283e = new File(this.f6280b, AbstractC1856a.m4065k().concat(".trace"));     // Catch: Throwable -> L7
        this.f6289k.clear();     // Catch: Throwable -> L7
        this.f6286h.clear();     // Catch: Throwable -> L7
        this.f6287i.clear();     // Catch: Throwable -> L7
        this.f6288j.clear();     // Catch: Throwable -> L7
        C1727o r0 = this.f6285g;     // Catch: Throwable -> L7
        C1732n r5 = new C1732n(this);     // Catch: Throwable -> L7
        if (r0.f6263g == true) goto L17;
        String r7 = null;
    L18:
        this.f6284f = r7;     // Catch: Throwable -> L7
        InterfaceC1833c0 r02 = this.f6290l;     // Catch: Throwable -> L7 RejectedExecutionException -> L23
        if (r02 == null) goto L25;
        this.f6282d = r02.mo3703q(new RunnableC1631S1(4, this), 30000);     // Catch: Throwable -> L7 RejectedExecutionException -> L23
    L25:
        this.f6279a = SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L7
        Date r14 = AbstractC1856a.m4067m();     // Catch: Throwable -> L7
        long r12 = Process.getElapsedCpuTime();     // Catch: Throwable -> L7
        Debug.startMethodTracingSampling(this.f6283e.getPath(), 3000000, r2);     // Catch: Throwable -> L29
        this.f6292n = true;     // Catch: Throwable -> L29
        C0118Cp r9 = new C0118Cp(this.f6279a, r12, r14);     // Catch: Throwable -> L29
        r1.close();
        return r9;
    L29:
        th = move-exception;
        m3910a(null, false);     // Catch: Throwable -> L7
        r4.mo3683r(EnumC1657a2.ERROR, "Unable to start a profile: ", th);     // Catch: Throwable -> L7
        this.f6292n = false;     // Catch: Throwable -> L7
        r1.close();
        return null;
    L23:
        e = move-exception;
        r4.mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);     // Catch: Throwable -> L7
        goto L25
    L17:
        r7 = AbstractC1856a.m4065k();     // Catch: Throwable -> L7
        r0.f6262f.put(r7, r5);     // Catch: Throwable -> L7
        r0.m3907b();     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L35
        throw th;
    L35:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }
}
