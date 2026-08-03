package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: renamed from: cg */
/* JADX INFO: loaded from: classes.dex */
public final class C1264cg implements InterfaceC2102jg, InterfaceC2193lg {

    /* JADX INFO: renamed from: h */
    public static final boolean f4293h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final C2756yc f4294a;

    /* JADX INFO: renamed from: b */
    public final C2220m6 f4295b;

    /* JADX INFO: renamed from: c */
    public final C0204Ep f4296c;

    /* JADX INFO: renamed from: d */
    public final C0089C2 f4297d;

    /* JADX INFO: renamed from: e */
    public final C1037Y5 f4298e;

    /* JADX INFO: renamed from: f */
    public final C0477L3 f4299f;

    /* JADX INFO: renamed from: g */
    public final C2428qs f4300g;

    public C1264cg(C0204Ep c0204Ep, C0132D2 c0132d2, ExecutorServiceC0971Wj executorServiceC0971Wj, ExecutorServiceC0971Wj executorServiceC0971Wj2, ExecutorServiceC0971Wj executorServiceC0971Wj3, ExecutorServiceC0971Wj executorServiceC0971Wj4) throws Throwable {
        this.f4296c = c0204Ep;
        C0061Bb c0061Bb = new C0061Bb(c0132d2);
        C2428qs c2428qs = new C2428qs(2);
        this.f4300g = c2428qs;
        synchronized (this) {
            try {
                try {
                    synchronized (c2428qs) {
                        try {
                            c2428qs.f8523d = this;
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
                    this.f4295b = new C2220m6(22);
                    this.f4294a = new C2756yc(2);
                    this.f4297d = new C0089C2(executorServiceC0971Wj, executorServiceC0971Wj2, executorServiceC0971Wj3, executorServiceC0971Wj4, this, this);
                    this.f4299f = new C0477L3(c0061Bb);
                    this.f4298e = new C1037Y5();
                    c0204Ep.f611d = this;
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

    /* JADX INFO: renamed from: e */
    public static void m2400e(InterfaceC2389pw interfaceC2389pw) {
        if (!(interfaceC2389pw instanceof C2236mg)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C2236mg) interfaceC2389pw).m4540c();
    }

    /* JADX INFO: renamed from: a */
    public final C2656w4 m2401a(C0756Rj c0756Rj, Object obj, InterfaceC0802Sm interfaceC0802Sm, int i, int i2, Class cls, Class cls2, EnumC2688wu enumC2688wu, C0922Vd c0922Vd, C0007A6 c0007a6, boolean z, boolean z2, C2644vt c2644vt, boolean z3, boolean z4, C2563ty c2563ty, ExecutorC2346p3 executorC2346p3) {
        long jElapsedRealtimeNanos;
        if (f4293h) {
            int i3 = AbstractC1510hp.f5351a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f4295b.getClass();
        C2146kg c2146kg = new C2146kg(obj, interfaceC0802Sm, i, i2, c0007a6, cls, cls2, c2644vt);
        synchronized (this) {
            try {
                C2236mg c2236mgM2402b = m2402b(c2146kg, z3, jElapsedRealtimeNanos);
                if (c2236mgM2402b == null) {
                    return m2405f(c0756Rj, obj, interfaceC0802Sm, i, i2, cls, cls2, enumC2688wu, c0922Vd, c0007a6, z, z2, c2644vt, z3, z4, c2563ty, executorC2346p3, c2146kg, jElapsedRealtimeNanos);
                }
                c2563ty.m5048g(c2236mgM2402b, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: b */
    public final C2236mg m2402b(C2146kg c2146kg, boolean z, long j) throws Throwable {
        Throwable th;
        C2236mg c2236mg;
        Object obj;
        C1264cg c1264cg;
        C2146kg c2146kg2;
        C2236mg c2236mg2;
        if (z) {
            C2428qs c2428qs = this.f4300g;
            synchronized (c2428qs) {
                try {
                    C0517M0 c0517m0 = (C0517M0) ((HashMap) c2428qs.f8521b).get(c2146kg);
                    if (c0517m0 == null) {
                        c2236mg = null;
                    } else {
                        c2236mg = (C2236mg) c0517m0.get();
                        if (c2236mg == null) {
                            try {
                                c2428qs.m4874l(c0517m0);
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
                    if (c2236mg != null) {
                        c2236mg.m4539a();
                    }
                    if (c2236mg != null) {
                        if (f4293h) {
                            int i = AbstractC1510hp.f5351a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(c2146kg);
                        }
                        return c2236mg;
                    }
                    C0204Ep c0204Ep = this.f4296c;
                    synchronized (c0204Ep) {
                        try {
                            C0075Bp c0075Bp = (C0075Bp) ((LinkedHashMap) c0204Ep.f289c).remove(c2146kg);
                            if (c0075Bp == null) {
                                obj = null;
                            } else {
                                c0204Ep.f288b -= (long) c0075Bp.f176b;
                                obj = c0075Bp.f175a;
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
                    InterfaceC2389pw interfaceC2389pw = (InterfaceC2389pw) obj;
                    if (interfaceC2389pw == null) {
                        c1264cg = this;
                        c2146kg2 = c2146kg;
                        c2236mg2 = null;
                    } else if (interfaceC2389pw instanceof C2236mg) {
                        c2236mg2 = (C2236mg) interfaceC2389pw;
                        c1264cg = this;
                        c2146kg2 = c2146kg;
                    } else {
                        c1264cg = this;
                        c2146kg2 = c2146kg;
                        c2236mg2 = new C2236mg(interfaceC2389pw, true, true, c2146kg2, c1264cg);
                    }
                    if (c2236mg2 != null) {
                        c2236mg2.m4539a();
                        c1264cg.f4300g.m4867a(c2146kg2, c2236mg2);
                    }
                    if (c2236mg2 != null) {
                        if (f4293h) {
                            int i2 = AbstractC1510hp.f5351a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(c2146kg2);
                        }
                        return c2236mg2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m2403c(C1544ig c1544ig, InterfaceC0802Sm interfaceC0802Sm, C2236mg c2236mg) {
        if (c2236mg != null) {
            try {
                if (c2236mg.f7877a) {
                    this.f4300g.m4867a(interfaceC0802Sm, c2236mg);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2756yc c2756yc = this.f4294a;
        c2756yc.getClass();
        c1544ig.getClass();
        HashMap map = c2756yc.f9385a;
        if (c1544ig.equals(map.get(interfaceC0802Sm))) {
            map.remove(interfaceC0802Sm);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2404d(InterfaceC0802Sm interfaceC0802Sm, C2236mg c2236mg) {
        C2428qs c2428qs = this.f4300g;
        synchronized (c2428qs) {
            C0517M0 c0517m0 = (C0517M0) ((HashMap) c2428qs.f8521b).remove(interfaceC0802Sm);
            if (c0517m0 != null) {
                c0517m0.f1685c = null;
                c0517m0.clear();
            }
        }
        if (c2236mg.f7877a) {
        } else {
            this.f4298e.m1986d(c2236mg, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C2656w4 m2405f(C0756Rj c0756Rj, Object obj, InterfaceC0802Sm interfaceC0802Sm, int i, int i2, Class cls, Class cls2, EnumC2688wu enumC2688wu, C0922Vd c0922Vd, Map map, boolean z, boolean z2, C2644vt c2644vt, boolean z3, boolean z4, C2563ty c2563ty, Executor executor, C2146kg c2146kg, long j) {
        C1544ig c1544ig = (C1544ig) this.f4294a.f9385a.get(c2146kg);
        if (c1544ig != null) {
            c1544ig.m2957a(c2563ty, executor);
            if (f4293h) {
                int i3 = AbstractC1510hp.f5351a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c2146kg);
            }
            return new C2656w4(this, c2563ty, c1544ig);
        }
        C1544ig c1544ig2 = (C1544ig) ((C2656w4) this.f4297d.f202h).mo1935c();
        synchronized (c1544ig2) {
            c1544ig2.f5454k = c2146kg;
            c1544ig2.f5455l = z3;
            c1544ig2.f5456m = z4;
        }
        C0477L3 c0477l3 = this.f4299f;
        RunnableC0320Hc runnableC0320Hc = (RunnableC0320Hc) ((C2656w4) c0477l3.f1576d).mo1935c();
        int i4 = c0477l3.f1574b;
        c0477l3.f1574b = i4 + 1;
        C0234Fc c0234Fc = runnableC0320Hc.f1062a;
        C0061Bb c0061Bb = runnableC0320Hc.f1065d;
        c0234Fc.f735c = c0756Rj;
        c0234Fc.f736d = obj;
        c0234Fc.f746n = interfaceC0802Sm;
        c0234Fc.f737e = i;
        c0234Fc.f738f = i2;
        c0234Fc.f748p = c0922Vd;
        c0234Fc.f739g = cls;
        c0234Fc.f740h = c0061Bb;
        c0234Fc.f743k = cls2;
        c0234Fc.f747o = enumC2688wu;
        c0234Fc.f741i = c2644vt;
        c0234Fc.f742j = map;
        c0234Fc.f749q = z;
        c0234Fc.f750r = z2;
        runnableC0320Hc.f1069h = c0756Rj;
        runnableC0320Hc.f1070i = interfaceC0802Sm;
        runnableC0320Hc.f1071j = enumC2688wu;
        runnableC0320Hc.f1072k = c2146kg;
        runnableC0320Hc.f1073l = i;
        runnableC0320Hc.f1074m = i2;
        runnableC0320Hc.f1075n = c0922Vd;
        runnableC0320Hc.f1076o = c2644vt;
        runnableC0320Hc.f1077p = c1544ig2;
        runnableC0320Hc.f1078q = i4;
        runnableC0320Hc.f1060E = 1;
        runnableC0320Hc.f1079r = obj;
        runnableC0320Hc.f1080s = c0756Rj.f2403h;
        runnableC0320Hc.f1081t = (Supplier) c2644vt.m5177c(RunnableC0320Hc.f1055G);
        C2756yc c2756yc = this.f4294a;
        c2756yc.getClass();
        c2756yc.f9385a.put(c2146kg, c1544ig2);
        c1544ig2.m2957a(c2563ty, executor);
        synchronized (c1544ig2) {
            c1544ig2.f5463t = runnableC0320Hc;
            int iM677h = runnableC0320Hc.m677h(1);
            ((iM677h == 2 || iM677h == 3) ? c1544ig2.f5450g : c1544ig2.f5456m ? c1544ig2.f5452i : c1544ig2.f5451h).execute(runnableC0320Hc);
        }
        if (f4293h) {
            int i5 = AbstractC1510hp.f5351a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(c2146kg);
        }
        return new C2656w4(this, c2563ty, c1544ig2);
    }
}
