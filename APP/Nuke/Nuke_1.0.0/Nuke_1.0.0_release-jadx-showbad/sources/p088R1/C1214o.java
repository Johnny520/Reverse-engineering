package p088R1;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C1927i;
import com.bumptech.glide.EnumC1928j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import p000A.C0066i0;
import p000A.C0072l0;
import p002A1.C0115D;
import p049I2.C0793k;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p097T1.C1417f;
import p102U1.ExecutorServiceC1475e;
import p171h2.C2239f;
import p195l2.AbstractC2505i;
import p195l2.C2499c;
import p195l2.C2506j;
import p195l2.ExecutorC2502f;

/* JADX INFO: renamed from: R1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1214o implements InterfaceC1219t, InterfaceC1221v {

    /* JADX INFO: renamed from: h */
    public static final boolean f4033h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final C1191A f4034a;

    /* JADX INFO: renamed from: b */
    public final C0115D f4035b;

    /* JADX INFO: renamed from: c */
    public final C1417f f4036c;

    /* JADX INFO: renamed from: d */
    public final C1212m f4037d;

    /* JADX INFO: renamed from: e */
    public final C1198H f4038e;

    /* JADX INFO: renamed from: f */
    public final C0793k f4039f;

    /* JADX INFO: renamed from: g */
    public final C0072l0 f4040g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1214o(C1417f c1417f, C0066i0 c0066i0, ExecutorServiceC1475e executorServiceC1475e, ExecutorServiceC1475e executorServiceC1475e2, ExecutorServiceC1475e executorServiceC1475e3, ExecutorServiceC1475e executorServiceC1475e4) throws Throwable {
        this.f4036c = c1417f;
        C1213n c1213n = new C1213n(c0066i0);
        C0072l0 c0072l0 = new C0072l0(3);
        this.f4040g = c0072l0;
        synchronized (this) {
            try {
                try {
                    synchronized (c0072l0) {
                        try {
                            c0072l0.f309g = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.f4035b = new C0115D(20);
                    this.f4034a = new C1191A(0);
                    this.f4037d = new C1212m(executorServiceC1475e, executorServiceC1475e2, executorServiceC1475e3, executorServiceC1475e4, this, this);
                    this.f4039f = new C0793k(c1213n);
                    this.f4038e = new C1198H();
                    c1417f.f5068d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2289c(String str, long j5, C1220u c1220u) {
        Log.v("Engine", str + " in " + AbstractC2505i.m4446a(j5) + "ms, key: " + c1220u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m2290f(InterfaceC1194D interfaceC1194D) {
        if (!(interfaceC1194D instanceof C1222w)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C1222w) interfaceC1194D).m2304b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0072l0 m2291a(C1927i c1927i, Object obj, InterfaceC1144f interfaceC1144f, int i5, int i6, Class cls, Class cls2, EnumC1928j enumC1928j, C1211l c1211l, C2499c c2499c, boolean z5, boolean z6, C1147i c1147i, boolean z7, boolean z8, C2239f c2239f, ExecutorC2502f executorC2502f) {
        long jElapsedRealtimeNanos;
        if (f4033h) {
            int i7 = AbstractC2505i.f8018b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f4035b.getClass();
        C1220u c1220u = new C1220u(obj, interfaceC1144f, i5, i6, c2499c, cls, cls2, c1147i);
        synchronized (this) {
            try {
                C1222w c1222wM2292b = m2292b(c1220u, z7, jElapsedRealtimeNanos);
                if (c1222wM2292b == null) {
                    return m2295g(c1927i, obj, interfaceC1144f, i5, i6, cls, cls2, enumC1928j, c1211l, c2499c, z5, z6, c1147i, z7, z8, c2239f, executorC2502f, c1220u, jElapsedRealtimeNanos);
                }
                c2239f.m4065j(c1222wM2292b, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[MOVE, MOVE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:57:0x0092) to fix multi-entry loop: BACK_EDGE: B:57:0x0092 -> B:66:0x0093 */
    /* JADX DEBUG: Incorrect finally slice size: {[MOVE, MOVE, CHECK_CAST] complete}, expected: {[MOVE, MOVE] complete} */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C1222w m2292b(C1220u c1220u, boolean z5, long j5) throws Throwable {
        Throwable th;
        C1222w c1222w;
        Object obj;
        C1214o c1214o;
        C1220u c1220u2;
        C1222w c1222w2;
        if (z5) {
            C0072l0 c0072l0 = this.f4040g;
            synchronized (c0072l0) {
                try {
                    C1201b c1201b = (C1201b) ((HashMap) c0072l0.f307e).get(c1220u);
                    if (c1201b == null) {
                        c1222w = null;
                    } else {
                        c1222w = (C1222w) c1201b.get();
                        if (c1222w == null) {
                            try {
                                c0072l0.m102f(c1201b);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (c1222w != null) {
                        c1222w.m2303a();
                    }
                    if (c1222w != null) {
                        if (f4033h) {
                            m2289c("Loaded resource from active resources", j5, c1220u);
                        }
                        return c1222w;
                    }
                    C1417f c1417f = this.f4036c;
                    synchronized (c1417f) {
                        try {
                            C2506j c2506j = (C2506j) c1417f.f8021a.remove(c1220u);
                            if (c2506j == null) {
                                obj = null;
                            } else {
                                c1417f.f8023c -= (long) c2506j.f8020b;
                                obj = c2506j.f8019a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    }
                    InterfaceC1194D interfaceC1194D = (InterfaceC1194D) obj;
                    if (interfaceC1194D == null) {
                        c1214o = this;
                        c1220u2 = c1220u;
                        c1222w2 = null;
                    } else if (interfaceC1194D instanceof C1222w) {
                        c1222w2 = (C1222w) interfaceC1194D;
                        c1214o = this;
                        c1220u2 = c1220u;
                    } else {
                        c1214o = this;
                        c1220u2 = c1220u;
                        c1222w2 = new C1222w(interfaceC1194D, true, true, c1220u2, c1214o);
                    }
                    if (c1222w2 != null) {
                        c1222w2.m2303a();
                        c1214o.f4040g.m100d(c1220u2, c1222w2);
                    }
                    if (c1222w2 != null) {
                        if (f4033h) {
                            m2289c("Loaded resource from cache", j5, c1220u2);
                        }
                        return c1222w2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized void m2293d(C1218s c1218s, InterfaceC1144f interfaceC1144f, C1222w c1222w) {
        if (c1222w != null) {
            try {
                if (c1222w.f4079d) {
                    this.f4040g.m100d(interfaceC1144f, c1222w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1191A c1191a = this.f4034a;
        c1191a.getClass();
        c1218s.getClass();
        HashMap map = c1191a.f3909a;
        if (c1218s.equals(map.get(interfaceC1144f))) {
            map.remove(interfaceC1144f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2294e(InterfaceC1144f interfaceC1144f, C1222w c1222w) {
        C0072l0 c0072l0 = this.f4040g;
        synchronized (c0072l0) {
            C1201b c1201b = (C1201b) ((HashMap) c0072l0.f307e).remove(interfaceC1144f);
            if (c1201b != null) {
                c1201b.f3948c = null;
                c1201b.clear();
            }
        }
        if (c1222w.f4079d) {
        } else {
            this.f4038e.m2260c(c1222w, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C0072l0 m2295g(C1927i c1927i, Object obj, InterfaceC1144f interfaceC1144f, int i5, int i6, Class cls, Class cls2, EnumC1928j enumC1928j, C1211l c1211l, Map map, boolean z5, boolean z6, C1147i c1147i, boolean z7, boolean z8, C2239f c2239f, Executor executor, C1220u c1220u, long j5) {
        C1218s c1218s = (C1218s) this.f4034a.f3909a.get(c1220u);
        if (c1218s != null) {
            c1218s.m2296a(c2239f, executor);
            if (f4033h) {
                m2289c("Added to existing load", j5, c1220u);
            }
            return new C0072l0(this, c2239f, c1218s);
        }
        C1218s c1218s2 = (C1218s) this.f4037d.f4030g.mo99c();
        synchronized (c1218s2) {
            c1218s2.f4058n = c1220u;
            c1218s2.f4059o = z7;
            c1218s2.f4060p = z8;
        }
        C0793k c0793k = this.f4039f;
        RunnableC1209j runnableC1209j = (RunnableC1209j) ((C0072l0) c0793k.f2539g).mo99c();
        int i7 = c0793k.f2537e;
        c0793k.f2537e = i7 + 1;
        C1207h c1207h = runnableC1209j.f3992d;
        C1213n c1213n = runnableC1209j.f3995g;
        c1207h.f3962c = c1927i;
        c1207h.f3963d = obj;
        c1207h.f3973n = interfaceC1144f;
        c1207h.f3964e = i5;
        c1207h.f3965f = i6;
        c1207h.f3975p = c1211l;
        c1207h.f3966g = cls;
        c1207h.f3967h = c1213n;
        c1207h.f3970k = cls2;
        c1207h.f3974o = enumC1928j;
        c1207h.f3968i = c1147i;
        c1207h.f3969j = map;
        c1207h.f3976q = z5;
        c1207h.f3977r = z6;
        runnableC1209j.f3999k = c1927i;
        runnableC1209j.f4000l = interfaceC1144f;
        runnableC1209j.f4001m = enumC1928j;
        runnableC1209j.f4002n = c1220u;
        runnableC1209j.f4003o = i5;
        runnableC1209j.f4004p = i6;
        runnableC1209j.f4005q = c1211l;
        runnableC1209j.f4006r = c1147i;
        runnableC1209j.f4007s = c1218s2;
        runnableC1209j.f4008t = i7;
        runnableC1209j.f3990I = 1;
        runnableC1209j.f4010v = obj;
        runnableC1209j.f4011w = c1927i.f6544h;
        runnableC1209j.f4012x = (Supplier) c1147i.m2201c(RunnableC1209j.f3981K);
        C1191A c1191a = this.f4034a;
        c1191a.getClass();
        c1191a.f3909a.put(c1220u, c1218s2);
        c1218s2.m2296a(c2239f, executor);
        synchronized (c1218s2) {
            c1218s2.f4067w = runnableC1209j;
            int iM2276h = runnableC1209j.m2276h(1);
            ((iM2276h == 2 || iM2276h == 3) ? c1218s2.f4054j : c1218s2.f4060p ? c1218s2.f4056l : c1218s2.f4055k).execute(runnableC1209j);
        }
        if (f4033h) {
            m2289c("Started new load", j5, c1220u);
        }
        return new C0072l0(this, c2239f, c1218s2);
    }
}
