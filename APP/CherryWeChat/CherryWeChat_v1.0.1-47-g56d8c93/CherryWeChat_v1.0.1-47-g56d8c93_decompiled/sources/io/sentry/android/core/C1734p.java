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

    /* JADX INFO: renamed from: b */
    public final File f6280b;

    /* JADX INFO: renamed from: c */
    public final int f6281c;

    /* JADX INFO: renamed from: f */
    public String f6284f;

    /* JADX INFO: renamed from: g */
    public final C1727o f6285g;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1833c0 f6290l;

    /* JADX INFO: renamed from: m */
    public final ILogger f6291m;

    /* JADX INFO: renamed from: a */
    public long f6279a = 0;

    /* JADX INFO: renamed from: d */
    public Future f6282d = null;

    /* JADX INFO: renamed from: e */
    public File f6283e = null;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f6286h = new ArrayDeque();

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f6287i = new ArrayDeque();

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f6288j = new ArrayDeque();

    /* JADX INFO: renamed from: k */
    public final HashMap f6289k = new HashMap();

    /* JADX INFO: renamed from: n */
    public boolean f6292n = false;

    /* JADX INFO: renamed from: o */
    public final C2029a f6293o = new C2029a();

    public C1734p(String str, int i, C1727o c1727o, InterfaceC1833c0 interfaceC1833c0, ILogger iLogger) {
        AbstractC1856a.m4048D("TracesFilesDirPath is required", str);
        this.f6280b = new File(str);
        this.f6281c = i;
        AbstractC1856a.m4048D("Logger is required", iLogger);
        this.f6291m = iLogger;
        this.f6290l = interfaceC1833c0;
        AbstractC1856a.m4048D("SentryFrameMetricsCollector is required", c1727o);
        this.f6285g = c1727o;
    }

    /* JADX INFO: renamed from: a */
    public final C1733o m3910a(List list, boolean z) {
        ArrayDeque arrayDeque = this.f6286h;
        ArrayDeque arrayDeque2 = this.f6288j;
        ArrayDeque arrayDeque3 = this.f6287i;
        C1981r c1981rM4173a = this.f6293o.m4173a();
        try {
            boolean z2 = this.f6292n;
            ILogger iLogger = this.f6291m;
            if (!z2) {
                iLogger.mo3680e(EnumC1657a2.WARNING, "Profiler not running", new Object[0]);
                c1981rM4173a.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.f6292n = false;
            this.f6285g.m3906a(this.f6284f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f6283e == null) {
                iLogger.mo3680e(EnumC1657a2.ERROR, "Trace file does not exists", new Object[0]);
                c1981rM4173a.close();
                return null;
            }
            boolean zIsEmpty = arrayDeque3.isEmpty();
            HashMap map = this.f6289k;
            if (!zIsEmpty) {
                map.put("slow_frame_renders", new C1942a("nanosecond", arrayDeque3));
            }
            if (!arrayDeque2.isEmpty()) {
                map.put("frozen_frame_renders", new C1942a("nanosecond", arrayDeque2));
            }
            if (!arrayDeque.isEmpty()) {
                map.put("screen_frame_rates", new C1942a("hz", arrayDeque));
            }
            m3911b(list);
            Future future = this.f6282d;
            if (future != null) {
                future.cancel(true);
                this.f6282d = null;
            }
            C1733o c1733o = new C1733o(jElapsedRealtimeNanos, elapsedCpuTime, z, this.f6283e, map);
            c1981rM4173a.close();
            return c1733o;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3911b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f6279a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C1827b1 c1827b1 = (C1827b1) it.next();
                        long j = c1827b1.f6604d;
                        long j2 = j + jElapsedRealtimeNanos;
                        Double d = c1827b1.f6601a;
                        Long l = c1827b1.f6602b;
                        Long l2 = c1827b1.f6603c;
                        if (d != null) {
                            arrayDeque3.add(new C1943b(Long.valueOf(j2), d, j));
                        }
                        if (l != null) {
                            arrayDeque.add(new C1943b(Long.valueOf(j2), l, j));
                        }
                        if (l2 != null) {
                            arrayDeque2.add(new C1943b(Long.valueOf(j2), l2, j));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f6289k.put("cpu_usage", new C1942a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f6289k.put("memory_footprint", new C1942a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.f6289k.put("memory_native_footprint", new C1942a("byte", arrayDeque2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0118Cp m3912c() {
        String strM4065k;
        C1981r c1981rM4173a = this.f6293o.m4173a();
        int i = this.f6281c;
        ILogger iLogger = this.f6291m;
        try {
            if (i == 0) {
                iLogger.mo3680e(EnumC1657a2.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                c1981rM4173a.close();
                return null;
            }
            if (this.f6292n) {
                iLogger.mo3680e(EnumC1657a2.WARNING, "Profiling has already started...", new Object[0]);
                c1981rM4173a.close();
                return null;
            }
            this.f6283e = new File(this.f6280b, AbstractC1856a.m4065k().concat(".trace"));
            this.f6289k.clear();
            this.f6286h.clear();
            this.f6287i.clear();
            this.f6288j.clear();
            C1727o c1727o = this.f6285g;
            C1732n c1732n = new C1732n(this);
            if (c1727o.f6263g) {
                strM4065k = AbstractC1856a.m4065k();
                c1727o.f6262f.put(strM4065k, c1732n);
                c1727o.m3907b();
            } else {
                strM4065k = null;
            }
            this.f6284f = strM4065k;
            try {
                InterfaceC1833c0 interfaceC1833c0 = this.f6290l;
                if (interfaceC1833c0 != null) {
                    this.f6282d = interfaceC1833c0.mo3703q(new RunnableC1631S1(4, this), 30000L);
                }
            } catch (RejectedExecutionException e) {
                iLogger.mo3683r(EnumC1657a2.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.f6279a = SystemClock.elapsedRealtimeNanos();
            Date dateM4067m = AbstractC1856a.m4067m();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f6283e.getPath(), 3000000, i);
                this.f6292n = true;
                C0118Cp c0118Cp = new C0118Cp(this.f6279a, elapsedCpuTime, dateM4067m);
                c1981rM4173a.close();
                return c0118Cp;
            } catch (Throwable th) {
                m3910a(null, false);
                iLogger.mo3683r(EnumC1657a2.ERROR, "Unable to start a profile: ", th);
                this.f6292n = false;
                c1981rM4173a.close();
                return null;
            }
        } finally {
        }
    }
}
