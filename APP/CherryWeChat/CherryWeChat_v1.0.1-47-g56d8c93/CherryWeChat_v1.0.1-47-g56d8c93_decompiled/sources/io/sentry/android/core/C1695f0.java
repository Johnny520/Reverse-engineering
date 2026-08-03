package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.AbstractC1588H1;
import io.sentry.C1637U0;
import io.sentry.C1643W0;
import io.sentry.C1878g2;
import io.sentry.C1981r;
import io.sentry.InterfaceC1639V;
import io.sentry.InterfaceC1876g0;
import io.sentry.InterfaceC1895i0;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.android.core.internal.util.InterfaceC1726n;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import p000.C0454Kh;

/* JADX INFO: renamed from: io.sentry.android.core.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1695f0 implements InterfaceC1639V, InterfaceC1726n {

    /* JADX INFO: renamed from: h */
    public static final long f6111h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i */
    public static final C1878g2 f6112i = new C1878g2(new Date(0), 0);

    /* JADX INFO: renamed from: a */
    public final boolean f6113a;

    /* JADX INFO: renamed from: c */
    public final C1727o f6115c;

    /* JADX INFO: renamed from: d */
    public volatile String f6116d;

    /* JADX INFO: renamed from: b */
    public final C2029a f6114b = new C2029a();

    /* JADX INFO: renamed from: e */
    public final TreeSet f6117e = new TreeSet(new C0454Kh(1));

    /* JADX INFO: renamed from: f */
    public final ConcurrentSkipListSet f6118f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g */
    public long f6119g = 16666666;

    public C1695f0(SentryAndroidOptions sentryAndroidOptions, C1727o c1727o) {
        this.f6115c = c1727o;
        this.f6113a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    /* JADX INFO: renamed from: g */
    public static long m3869g(AbstractC1588H1 abstractC1588H1) {
        if (abstractC1588H1 instanceof C1878g2) {
            return abstractC1588H1.mo3670b(f6112i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - abstractC1588H1.mo3672d());
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC1726n
    /* JADX INFO: renamed from: c */
    public final void mo3870c(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f6118f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j5 = (long) (f6111h / ((double) f));
        this.f6119g = j5;
        if (z || z2) {
            concurrentSkipListSet.add(new C1693e0(j, j2, j3, j4, z, z2, j5));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3871d() {
        C1981r c1981rM4173a = this.f6114b.m4173a();
        try {
            if (this.f6116d != null) {
                this.f6115c.m3906a(this.f6116d);
                this.f6116d = null;
            }
            this.f6118f.clear();
            this.f6117e.clear();
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

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ec A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:78:0x0150, B:80:0x015a, B:82:0x015e, B:84:0x0166, B:90:0x0173, B:95:0x0182, B:99:0x018d, B:101:0x0199, B:104:0x01a5, B:106:0x01af, B:107:0x01b9, B:102:0x019e, B:108:0x01bb, B:110:0x01ec, B:58:0x00e5, B:62:0x010b, B:66:0x0116, B:68:0x011a, B:70:0x0121), top: B:142:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0170  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3872e(InterfaceC1876g0 interfaceC1876g0) throws Throwable {
        C1981r c1981r;
        Throwable th;
        boolean zRemove;
        ConcurrentSkipListSet concurrentSkipListSet;
        AbstractC1588H1 abstractC1588H1Mo3630p;
        TreeSet treeSet;
        C2029a c2029a;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long jLongValue;
        Field field;
        Iterator it;
        TreeSet treeSet2 = this.f6117e;
        if (!this.f6113a || (interfaceC1876g0 instanceof C1637U0) || (interfaceC1876g0 instanceof C1643W0)) {
            return;
        }
        C2029a c2029a2 = this.f6114b;
        C1981r c1981rM4173a = c2029a2.m4173a();
        try {
            if (!treeSet2.contains(interfaceC1876g0)) {
                c1981rM4173a.close();
                return;
            }
            c1981rM4173a.close();
            C1981r c1981rM4173a2 = c2029a2.m4173a();
            try {
                zRemove = treeSet2.remove(interfaceC1876g0);
                concurrentSkipListSet = this.f6118f;
            } catch (Throwable th2) {
                th = th2;
                c1981r = c1981rM4173a2;
            }
            if (zRemove && (abstractC1588H1Mo3630p = interfaceC1876g0.mo3630p()) != null) {
                long jM3869g = m3869g(interfaceC1876g0.mo3635u());
                long jM3869g2 = m3869g(abstractC1588H1Mo3630p);
                long j4 = jM3869g2 - jM3869g;
                if (j4 <= 0) {
                    c1981rM4173a2.close();
                    treeSet = treeSet2;
                    c2029a = c2029a2;
                } else {
                    long j5 = this.f6119g;
                    int i3 = 1;
                    if (concurrentSkipListSet.isEmpty()) {
                        treeSet = treeSet2;
                        c2029a = c2029a2;
                        c1981r = c1981rM4173a2;
                        i = 0;
                        i2 = 0;
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                    } else {
                        Iterator it2 = concurrentSkipListSet.tailSet(new C1693e0(jM3869g)).iterator();
                        i = 0;
                        i2 = 0;
                        j = 0;
                        j2 = 0;
                        j3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                treeSet = treeSet2;
                                c2029a = c2029a2;
                                break;
                            }
                            C1693e0 c1693e0 = (C1693e0) it2.next();
                            treeSet = treeSet2;
                            c2029a = c2029a2;
                            long j6 = c1693e0.f6103a;
                            long j7 = c1693e0.f6106d;
                            long j8 = c1693e0.f6109g;
                            long j9 = c1693e0.f6104b;
                            if (j6 > jM3869g2) {
                                break;
                            }
                            if (j6 < jM3869g || j9 > jM3869g2) {
                                if ((jM3869g > j6 && jM3869g < j9) || (jM3869g2 > j6 && jM3869g2 < j9)) {
                                    c1981r = c1981rM4173a2;
                                    it = it2;
                                    try {
                                        long jMin = Math.min(j7 - Math.max(0L, Math.max(0L, jM3869g - j6) - j8), j4);
                                        long jMin2 = Math.min(jM3869g2, j9) - Math.max(jM3869g, c1693e0.f6103a);
                                        int i4 = C1727o.f6256p;
                                        boolean z = jMin2 > j8;
                                        j += jMin2;
                                        if (jMin2 > C1727o.f6255o) {
                                            j3 += jMin;
                                            i2++;
                                        } else if (z) {
                                            j2 += jMin;
                                            i++;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                it2 = it;
                                treeSet2 = treeSet;
                                c2029a2 = c2029a;
                                c1981rM4173a2 = c1981r;
                                j5 = j8;
                            } else {
                                try {
                                    long j10 = c1693e0.f6105c;
                                    boolean z2 = c1693e0.f6107e;
                                    j += j10;
                                    if (c1693e0.f6108f) {
                                        j3 += j7;
                                        i2++;
                                    } else if (z2) {
                                        j2 += j7;
                                        i++;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c1981r = c1981rM4173a2;
                                }
                            }
                            c1981r = c1981rM4173a2;
                            it = it2;
                            it2 = it;
                            treeSet2 = treeSet;
                            c2029a2 = c2029a;
                            c1981rM4173a2 = c1981r;
                            j5 = j8;
                        }
                        c1981r = c1981rM4173a2;
                    }
                    int iCeil = i + i2;
                    C1727o c1727o = this.f6115c;
                    Choreographer choreographer = c1727o.f6266j;
                    if (choreographer == null || (field = c1727o.f6267k) == null) {
                        jLongValue = -1;
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jM3869g2 - jLongValue);
                            if (jMax > j5) {
                                boolean z3 = jMax > C1727o.f6255o;
                                long jMax2 = Math.max(0L, jMax - j5);
                                j += jMax;
                                if (z3) {
                                    j3 += jMax2;
                                    i2++;
                                } else {
                                    j2 += jMax2;
                                    i++;
                                }
                            } else {
                                i3 = 0;
                            }
                            long j11 = j4 - j;
                            iCeil = iCeil + i3 + (j11 > 0 ? (int) Math.ceil(j11 / j5) : 0);
                        }
                        double d = (j2 + j3) / 1.0E9d;
                        interfaceC1876g0.mo3618d("frames.total", Integer.valueOf(iCeil));
                        interfaceC1876g0.mo3618d("frames.slow", Integer.valueOf(i));
                        interfaceC1876g0.mo3618d("frames.frozen", Integer.valueOf(i2));
                        interfaceC1876g0.mo3618d("frames.delay", Double.valueOf(d));
                        if (interfaceC1876g0 instanceof InterfaceC1895i0) {
                            interfaceC1876g0.mo3624j(Integer.valueOf(iCeil), "frames_total");
                            interfaceC1876g0.mo3624j(Integer.valueOf(i), "frames_slow");
                            interfaceC1876g0.mo3624j(Integer.valueOf(i2), "frames_frozen");
                            interfaceC1876g0.mo3624j(Double.valueOf(d), "frames_delay");
                        }
                        c1981r.close();
                    } else {
                        try {
                            Long l = (Long) field.get(choreographer);
                            if (l != null) {
                                jLongValue = l.longValue();
                            }
                        } catch (IllegalAccessException unused) {
                        }
                        if (jLongValue != -1) {
                        }
                        double d2 = (j2 + j3) / 1.0E9d;
                        interfaceC1876g0.mo3618d("frames.total", Integer.valueOf(iCeil));
                        interfaceC1876g0.mo3618d("frames.slow", Integer.valueOf(i));
                        interfaceC1876g0.mo3618d("frames.frozen", Integer.valueOf(i2));
                        interfaceC1876g0.mo3618d("frames.delay", Double.valueOf(d2));
                        if (interfaceC1876g0 instanceof InterfaceC1895i0) {
                        }
                        c1981r.close();
                    }
                }
                th = th;
                try {
                    c1981r.close();
                    throw th;
                } catch (Throwable th5) {
                    th.addSuppressed(th5);
                    throw th;
                }
            }
            c1981rM4173a2.close();
            treeSet = treeSet2;
            c2029a = c2029a2;
            c1981rM4173a = c2029a.m4173a();
            try {
                if (treeSet.isEmpty()) {
                    m3871d();
                } else {
                    concurrentSkipListSet.headSet(new C1693e0(m3869g(((InterfaceC1876g0) treeSet.first()).mo3635u()))).clear();
                }
                c1981rM4173a.close();
            } catch (Throwable th6) {
            }
        } finally {
            try {
                c1981rM4173a.close();
                throw th6;
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3873f(InterfaceC1876g0 interfaceC1876g0) {
        String str;
        if (!this.f6113a || (interfaceC1876g0 instanceof C1637U0) || (interfaceC1876g0 instanceof C1643W0)) {
            return;
        }
        C1981r c1981rM4173a = this.f6114b.m4173a();
        try {
            this.f6117e.add(interfaceC1876g0);
            if (this.f6116d == null) {
                C1727o c1727o = this.f6115c;
                if (c1727o.f6263g) {
                    String strM4065k = AbstractC1856a.m4065k();
                    c1727o.f6262f.put(strM4065k, this);
                    c1727o.m3907b();
                    str = strM4065k;
                } else {
                    str = null;
                }
                this.f6116d = str;
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
