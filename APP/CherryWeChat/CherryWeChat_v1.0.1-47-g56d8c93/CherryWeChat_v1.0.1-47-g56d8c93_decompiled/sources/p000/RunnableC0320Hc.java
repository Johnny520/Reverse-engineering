package p000;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

/* JADX INFO: renamed from: Hc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0320Hc implements InterfaceC2584uc, Runnable, Comparable, InterfaceC1097Zg {

    /* JADX INFO: renamed from: G */
    public static final C2601ut f1055G = new C2601ut("glide_thread_priority_override", null, C2601ut.f8986e);

    /* JADX INFO: renamed from: A */
    public volatile boolean f1056A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f1057B;

    /* JADX INFO: renamed from: C */
    public boolean f1058C;

    /* JADX INFO: renamed from: D */
    public int f1059D;

    /* JADX INFO: renamed from: E */
    public int f1060E;

    /* JADX INFO: renamed from: F */
    public int f1061F;

    /* JADX INFO: renamed from: d */
    public final C0061Bb f1065d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1024Xt f1066e;

    /* JADX INFO: renamed from: h */
    public C0756Rj f1069h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0802Sm f1070i;

    /* JADX INFO: renamed from: j */
    public EnumC2688wu f1071j;

    /* JADX INFO: renamed from: k */
    public C2146kg f1072k;

    /* JADX INFO: renamed from: l */
    public int f1073l;

    /* JADX INFO: renamed from: m */
    public int f1074m;

    /* JADX INFO: renamed from: n */
    public C0922Vd f1075n;

    /* JADX INFO: renamed from: o */
    public C2644vt f1076o;

    /* JADX INFO: renamed from: p */
    public C1544ig f1077p;

    /* JADX INFO: renamed from: q */
    public int f1078q;

    /* JADX INFO: renamed from: r */
    public Object f1079r;

    /* JADX INFO: renamed from: s */
    public C0132D2 f1080s;

    /* JADX INFO: renamed from: t */
    public Supplier f1081t;

    /* JADX INFO: renamed from: u */
    public Thread f1082u;

    /* JADX INFO: renamed from: v */
    public InterfaceC0802Sm f1083v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0802Sm f1084w;

    /* JADX INFO: renamed from: x */
    public Object f1085x;

    /* JADX INFO: renamed from: y */
    public InterfaceC2541tc f1086y;

    /* JADX INFO: renamed from: z */
    public volatile InterfaceC2627vc f1087z;

    /* JADX INFO: renamed from: a */
    public final C0234Fc f1062a = new C0234Fc();

    /* JADX INFO: renamed from: b */
    public final ArrayList f1063b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C1432fz f1064c = new C1432fz();

    /* JADX INFO: renamed from: f */
    public final C2656w4 f1067f = new C2656w4(9);

    /* JADX INFO: renamed from: g */
    public final C0277Gc f1068g = new C0277Gc();

    public RunnableC0320Hc(C0061Bb c0061Bb, C2656w4 c2656w4) {
        this.f1065d = c0061Bb;
        this.f1066e = c2656w4;
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: a */
    public final void mo670a(InterfaceC0802Sm interfaceC0802Sm, Exception exc, InterfaceC2541tc interfaceC2541tc, int i) {
        interfaceC2541tc.mo914c();
        C0842Tj c0842Tj = new C0842Tj("Fetching data failed", Collections.singletonList(exc));
        Class clsMo912a = interfaceC2541tc.mo912a();
        c0842Tj.f2684b = interfaceC0802Sm;
        c0842Tj.f2685c = i;
        c0842Tj.f2686d = clsMo912a;
        this.f1063b.add(c0842Tj);
        if (Thread.currentThread() != this.f1082u) {
            m680k(2);
        } else {
            m682m();
        }
    }

    @Override // p000.InterfaceC2584uc
    /* JADX INFO: renamed from: b */
    public final void mo671b(InterfaceC0802Sm interfaceC0802Sm, Object obj, InterfaceC2541tc interfaceC2541tc, int i, InterfaceC0802Sm interfaceC0802Sm2) {
        this.f1083v = interfaceC0802Sm;
        this.f1085x = obj;
        this.f1086y = interfaceC2541tc;
        this.f1061F = i;
        this.f1084w = interfaceC0802Sm2;
        this.f1058C = interfaceC0802Sm != this.f1062a.m473a().get(0);
        if (Thread.currentThread() != this.f1082u) {
            m680k(3);
        } else {
            m675f();
        }
    }

    @Override // p000.InterfaceC1097Zg
    /* JADX INFO: renamed from: c */
    public final C1432fz mo672c() {
        return this.f1064c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0320Hc runnableC0320Hc = (RunnableC0320Hc) obj;
        int iOrdinal = this.f1071j.ordinal() - runnableC0320Hc.f1071j.ordinal();
        return iOrdinal == 0 ? this.f1078q - runnableC0320Hc.f1078q : iOrdinal;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2389pw m673d(InterfaceC2541tc interfaceC2541tc, Object obj, int i) {
        if (obj == null) {
            interfaceC2541tc.mo914c();
            return null;
        }
        try {
            int i2 = AbstractC1510hp.f5351a;
            SystemClock.elapsedRealtimeNanos();
            InterfaceC2389pw interfaceC2389pwM674e = m674e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                interfaceC2389pwM674e.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f1072k);
                Thread.currentThread().getName();
            }
            return interfaceC2389pwM674e;
        } finally {
            interfaceC2541tc.mo914c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC2389pw m674e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C0234Fc c0234Fc = this.f1062a;
        C0590No c0590NoM475c = c0234Fc.m475c(cls);
        C2644vt c2644vt = this.f1076o;
        boolean z = i == 4 || c0234Fc.f750r;
        C2601ut c2601ut = C2543te.f8850i;
        Boolean bool = (Boolean) c2644vt.m5177c(c2601ut);
        if (bool == null || (bool.booleanValue() && !z)) {
            c2644vt = new C2644vt();
            C0007A6 c0007a6 = this.f1076o.f9156b;
            C0007A6 c0007a62 = c2644vt.f9156b;
            c0007a62.mo3g(c0007a6);
            c0007a62.put(c2601ut, Boolean.valueOf(z));
        }
        C2644vt c2644vt2 = c2644vt;
        InterfaceC2713xc interfaceC2713xcM1379g = this.f1069h.m1544a().m1379g(obj);
        try {
            return c0590NoM475c.m1162a(this.f1073l, this.f1074m, new C0307H5(i, this), interfaceC2713xcM1379g, c2644vt2);
        } finally {
            interfaceC2713xcM1379g.mo232c();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m675f() {
        InterfaceC2389pw interfaceC2389pwM673d;
        boolean zM559a;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f1085x + ", cache key: " + this.f1083v + ", fetcher: " + this.f1086y;
            int i = AbstractC1510hp.f5351a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f1072k);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        C1466gp c1466gp = null;
        if (((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class) && (supplier = this.f1081t) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f1081t.get()).intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.f1081t = null;
            }
        }
        try {
            interfaceC2389pwM673d = m673d(this.f1086y, this.f1085x, this.f1061F);
        } catch (C0842Tj e) {
            InterfaceC0802Sm interfaceC0802Sm = this.f1084w;
            int i2 = this.f1061F;
            e.f2684b = interfaceC0802Sm;
            e.f2685c = i2;
            e.f2686d = null;
            this.f1063b.add(e);
            interfaceC2389pwM673d = null;
        }
        if (interfaceC2389pwM673d == null) {
            m682m();
            return;
        }
        int i3 = this.f1061F;
        boolean z = this.f1058C;
        if (interfaceC2389pwM673d instanceof InterfaceC2284nl) {
            ((InterfaceC2284nl) interfaceC2389pwM673d).mo115a();
        }
        int i4 = 1;
        if (((C1466gp) this.f1067f.f9198d) != null) {
            c1466gp = (C1466gp) C1466gp.f5197e.mo1935c();
            c1466gp.f5201d = false;
            c1466gp.f5200c = true;
            c1466gp.f5199b = interfaceC2389pwM673d;
            interfaceC2389pwM673d = c1466gp;
        }
        if (((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class)) {
            m681l();
        }
        m684o();
        C1544ig c1544ig = this.f1077p;
        synchronized (c1544ig) {
            c1544ig.f5457n = interfaceC2389pwM673d;
            c1544ig.f5458o = i3;
            c1544ig.f5465v = z;
        }
        synchronized (c1544ig) {
            try {
                c1544ig.f5445b.m2744a();
                if (c1544ig.f5464u) {
                    c1544ig.f5457n.mo118e();
                    c1544ig.m2962g();
                } else {
                    if (c1544ig.f5444a.f5288a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c1544ig.f5459p) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C2220m6 c2220m6 = c1544ig.f5448e;
                    InterfaceC2389pw interfaceC2389pw = c1544ig.f5457n;
                    boolean z2 = c1544ig.f5455l;
                    C2146kg c2146kg = c1544ig.f5454k;
                    InterfaceC2193lg interfaceC2193lg = c1544ig.f5446c;
                    c2220m6.getClass();
                    c1544ig.f5462s = new C2236mg(interfaceC2389pw, z2, true, c2146kg, interfaceC2193lg);
                    c1544ig.f5459p = true;
                    C1501hg c1501hg = c1544ig.f5444a;
                    c1501hg.getClass();
                    ArrayList<C1457gg> arrayList = new ArrayList(c1501hg.f5288a);
                    c1544ig.m2960e(arrayList.size() + 1);
                    ((C1264cg) c1544ig.f5449f).m2403c(c1544ig, c1544ig.f5454k, c1544ig.f5462s);
                    for (C1457gg c1457gg : arrayList) {
                        c1457gg.f5176b.execute(new RunnableC1413fg(c1544ig, c1457gg.f5175a, i4));
                    }
                    c1544ig.m2959d();
                }
            } finally {
            }
        }
        this.f1059D = 5;
        try {
            C2656w4 c2656w4 = this.f1067f;
            if (((C1466gp) c2656w4.f9198d) != null) {
                C0061Bb c0061Bb = this.f1065d;
                C2644vt c2644vt = this.f1076o;
                c2656w4.getClass();
                try {
                    c0061Bb.m96a().mo1726d((InterfaceC0802Sm) c2656w4.f9196b, new C2656w4((InterfaceC2647vw) c2656w4.f9197c, (C1466gp) c2656w4.f9198d, c2644vt, 8));
                    ((C1466gp) c2656w4.f9198d).m2819a();
                } catch (Throwable th) {
                    ((C1466gp) c2656w4.f9198d).m2819a();
                    throw th;
                }
            }
            C0277Gc c0277Gc = this.f1068g;
            synchronized (c0277Gc) {
                c0277Gc.f902b = true;
                zM559a = c0277Gc.m559a();
            }
            if (zM559a) {
                m679j();
            }
        } finally {
            if (c1466gp != null) {
                c1466gp.m2819a();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC2627vc m676g() {
        int iM424v = AbstractC0213Ey.m424v(this.f1059D);
        C0234Fc c0234Fc = this.f1062a;
        if (iM424v == 1) {
            return new C2432qw(c0234Fc, this);
        }
        if (iM424v == 2) {
            return new C2412qc(c0234Fc.m473a(), c0234Fc, this);
        }
        if (iM424v == 3) {
            return new C0342Hy(c0234Fc, this);
        }
        if (iM424v == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC0213Ey.m425w(this.f1059D)));
    }

    /* JADX INFO: renamed from: h */
    public final int m677h(int i) {
        boolean z;
        boolean z2;
        int iM424v = AbstractC0213Ey.m424v(i);
        if (iM424v == 0) {
            switch (this.f1075n.f2882a) {
                case 0:
                default:
                    z = true;
                    break;
                case 1:
                case 2:
                    z = false;
                    break;
            }
            if (z) {
                return 2;
            }
            return m677h(2);
        }
        if (iM424v != 1) {
            if (iM424v == 2) {
                return 4;
            }
            if (iM424v == 3 || iM424v == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC0213Ey.m425w(i)));
        }
        switch (this.f1075n.f2882a) {
            case 0:
            case 2:
            default:
                z2 = true;
                break;
            case 1:
                z2 = false;
                break;
        }
        if (z2) {
            return 3;
        }
        return m677h(3);
    }

    /* JADX INFO: renamed from: i */
    public final void m678i() {
        boolean zM559a;
        if (((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class)) {
            m681l();
        }
        m684o();
        C0842Tj c0842Tj = new C0842Tj("Failed to load resource", new ArrayList(this.f1063b));
        C1544ig c1544ig = this.f1077p;
        synchronized (c1544ig) {
            c1544ig.f5460q = c0842Tj;
        }
        synchronized (c1544ig) {
            try {
                c1544ig.f5445b.m2744a();
                if (c1544ig.f5464u) {
                    c1544ig.m2962g();
                } else {
                    if (c1544ig.f5444a.f5288a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c1544ig.f5461r) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c1544ig.f5461r = true;
                    C2146kg c2146kg = c1544ig.f5454k;
                    C1501hg c1501hg = c1544ig.f5444a;
                    c1501hg.getClass();
                    ArrayList<C1457gg> arrayList = new ArrayList(c1501hg.f5288a);
                    c1544ig.m2960e(arrayList.size() + 1);
                    ((C1264cg) c1544ig.f5449f).m2403c(c1544ig, c2146kg, null);
                    for (C1457gg c1457gg : arrayList) {
                        c1457gg.f5176b.execute(new RunnableC1413fg(c1544ig, c1457gg.f5175a, 0));
                    }
                    c1544ig.m2959d();
                }
            } finally {
            }
        }
        C0277Gc c0277Gc = this.f1068g;
        synchronized (c0277Gc) {
            c0277Gc.f903c = true;
            zM559a = c0277Gc.m559a();
        }
        if (zM559a) {
            m679j();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m679j() {
        C0277Gc c0277Gc = this.f1068g;
        synchronized (c0277Gc) {
            c0277Gc.f902b = false;
            c0277Gc.f901a = false;
            c0277Gc.f903c = false;
        }
        C2656w4 c2656w4 = this.f1067f;
        c2656w4.f9196b = null;
        c2656w4.f9197c = null;
        c2656w4.f9198d = null;
        C0234Fc c0234Fc = this.f1062a;
        c0234Fc.f735c = null;
        c0234Fc.f736d = null;
        c0234Fc.f746n = null;
        c0234Fc.f739g = null;
        c0234Fc.f743k = null;
        c0234Fc.f741i = null;
        c0234Fc.f747o = null;
        c0234Fc.f742j = null;
        c0234Fc.f748p = null;
        c0234Fc.f733a.clear();
        c0234Fc.f744l = false;
        c0234Fc.f734b.clear();
        c0234Fc.f745m = false;
        this.f1056A = false;
        this.f1069h = null;
        this.f1070i = null;
        this.f1076o = null;
        this.f1071j = null;
        this.f1072k = null;
        this.f1077p = null;
        this.f1059D = 0;
        this.f1087z = null;
        this.f1082u = null;
        this.f1083v = null;
        this.f1085x = null;
        this.f1061F = 0;
        this.f1086y = null;
        this.f1057B = false;
        this.f1079r = null;
        this.f1063b.clear();
        this.f1066e.mo1934a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m680k(int i) {
        this.f1060E = i;
        C1544ig c1544ig = this.f1077p;
        (c1544ig.f5456m ? c1544ig.f5452i : c1544ig.f5451h).execute(this);
    }

    /* JADX INFO: renamed from: l */
    public final void m681l() {
        if (!((Map) this.f1080s.f328b).containsKey(AbstractC0671Pj.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f1081t;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.f1081t = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m682m() {
        this.f1082u = Thread.currentThread();
        int i = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        boolean zMo727c = false;
        while (!this.f1057B && this.f1087z != null && !(zMo727c = this.f1087z.mo727c())) {
            this.f1059D = m677h(this.f1059D);
            this.f1087z = m676g();
            if (this.f1059D == 4) {
                m680k(2);
                return;
            }
        }
        if ((this.f1059D == 6 || this.f1057B) && !zMo727c) {
            m678i();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m683n() {
        int iM424v = AbstractC0213Ey.m424v(this.f1060E);
        if (iM424v == 0) {
            this.f1059D = m677h(1);
            this.f1087z = m676g();
            m682m();
        } else if (iM424v == 1) {
            m682m();
        } else if (iM424v == 2) {
            m675f();
        } else {
            int i = this.f1060E;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m684o() {
        Throwable th;
        this.f1064c.m2744a();
        if (!this.f1056A) {
            this.f1056A = true;
            return;
        }
        if (this.f1063b.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f1063b;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2541tc interfaceC2541tc = this.f1086y;
        try {
            try {
                if (this.f1057B) {
                    m678i();
                    if (interfaceC2541tc != null) {
                        interfaceC2541tc.mo914c();
                        return;
                    }
                    return;
                }
                m683n();
                if (interfaceC2541tc != null) {
                    interfaceC2541tc.mo914c();
                }
            } catch (Throwable th) {
                if (interfaceC2541tc != null) {
                    interfaceC2541tc.mo914c();
                }
                throw th;
            }
        } catch (C0265G6 e) {
            throw e;
        } catch (Throwable th2) {
            if (this.f1059D != 5) {
                this.f1063b.add(th2);
                m678i();
            }
            if (!this.f1057B) {
                throw th2;
            }
            throw th2;
        }
    }
}
