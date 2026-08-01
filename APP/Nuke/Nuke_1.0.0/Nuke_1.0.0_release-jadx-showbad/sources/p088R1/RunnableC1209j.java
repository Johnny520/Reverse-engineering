package p088R1;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.AbstractC1925g;
import com.bumptech.glide.C1927i;
import com.bumptech.glide.EnumC1928j;
import com.bumptech.glide.load.data.InterfaceC1934d;
import com.bumptech.glide.load.data.InterfaceC1936f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;
import me.dartcv.nuke.BuildConfig;
import p000A.C0072l0;
import p002A1.C0115D;
import p011B4.AbstractC0231b;
import p013C0.C0236c;
import p042H1.AbstractC0636d;
import p078P1.C1146h;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1150l;
import p121Y1.C1753n;
import p121Y1.C1757r;
import p195l2.AbstractC2505i;
import p195l2.C2499c;
import p200m2.C2603d;
import p200m2.InterfaceC2601b;
import p223q1.InterfaceC2909c;

/* JADX INFO: renamed from: R1.j */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1209j implements InterfaceC1205f, Runnable, Comparable, InterfaceC2601b {

    /* JADX INFO: renamed from: K */
    public static final C1146h f3981K = new C1146h("glide_thread_priority_override", null, C1146h.f3780e);

    /* JADX INFO: renamed from: A */
    public InterfaceC1144f f3982A;

    /* JADX INFO: renamed from: B */
    public Object f3983B;

    /* JADX INFO: renamed from: C */
    public InterfaceC1934d f3984C;

    /* JADX INFO: renamed from: D */
    public volatile InterfaceC1206g f3985D;

    /* JADX INFO: renamed from: E */
    public volatile boolean f3986E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f3987F;

    /* JADX INFO: renamed from: G */
    public boolean f3988G;

    /* JADX INFO: renamed from: H */
    public int f3989H;

    /* JADX INFO: renamed from: I */
    public int f3990I;

    /* JADX INFO: renamed from: J */
    public int f3991J;

    /* JADX INFO: renamed from: g */
    public final C1213n f3995g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2909c f3996h;

    /* JADX INFO: renamed from: k */
    public C1927i f3999k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1144f f4000l;

    /* JADX INFO: renamed from: m */
    public EnumC1928j f4001m;

    /* JADX INFO: renamed from: n */
    public C1220u f4002n;

    /* JADX INFO: renamed from: o */
    public int f4003o;

    /* JADX INFO: renamed from: p */
    public int f4004p;

    /* JADX INFO: renamed from: q */
    public C1211l f4005q;

    /* JADX INFO: renamed from: r */
    public C1147i f4006r;

    /* JADX INFO: renamed from: s */
    public C1218s f4007s;

    /* JADX INFO: renamed from: t */
    public int f4008t;

    /* JADX INFO: renamed from: u */
    public long f4009u;

    /* JADX INFO: renamed from: v */
    public Object f4010v;

    /* JADX INFO: renamed from: w */
    public C1753n f4011w;

    /* JADX INFO: renamed from: x */
    public Supplier f4012x;

    /* JADX INFO: renamed from: y */
    public Thread f4013y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1144f f4014z;

    /* JADX INFO: renamed from: d */
    public final C1207h f3992d = new C1207h();

    /* JADX INFO: renamed from: e */
    public final ArrayList f3993e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final C2603d f3994f = new C2603d();

    /* JADX INFO: renamed from: i */
    public final C0072l0 f3997i = new C0072l0(5);

    /* JADX INFO: renamed from: j */
    public final C1208i f3998j = new C1208i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC1209j(C1213n c1213n, C0072l0 c0072l0) {
        this.f3995g = c1213n;
        this.f3996h = c0072l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1205f
    /* JADX INFO: renamed from: a */
    public final void mo2263a(InterfaceC1144f interfaceC1144f, Exception exc, InterfaceC1934d interfaceC1934d, int i5) {
        interfaceC1934d.mo2223b();
        C1224y c1224y = new C1224y("Fetching data failed", Collections.singletonList(exc));
        Class clsMo2222a = interfaceC1934d.mo2222a();
        c1224y.f4090e = interfaceC1144f;
        c1224y.f4091f = i5;
        c1224y.f4092g = clsMo2222a;
        this.f3993e.add(c1224y);
        if (Thread.currentThread() != this.f4013y) {
            m2280l(2);
        } else {
            m2282n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p200m2.InterfaceC2601b
    /* JADX INFO: renamed from: b */
    public final C2603d mo2253b() {
        return this.f3994f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1205f
    /* JADX INFO: renamed from: c */
    public final void mo2264c(InterfaceC1144f interfaceC1144f, Object obj, InterfaceC1934d interfaceC1934d, int i5, InterfaceC1144f interfaceC1144f2) {
        this.f4014z = interfaceC1144f;
        this.f3983B = obj;
        this.f3984C = interfaceC1934d;
        this.f3991J = i5;
        this.f3982A = interfaceC1144f2;
        this.f3988G = interfaceC1144f != this.f3992d.m2266a().get(0);
        if (Thread.currentThread() != this.f4013y) {
            m2280l(3);
        } else {
            m2274f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC1209j runnableC1209j = (RunnableC1209j) obj;
        int iOrdinal = this.f4001m.ordinal() - runnableC1209j.f4001m.ordinal();
        return iOrdinal == 0 ? this.f4008t - runnableC1209j.f4008t : iOrdinal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final InterfaceC1194D m2272d(InterfaceC1934d interfaceC1934d, Object obj, int i5) {
        if (obj == null) {
            return null;
        }
        try {
            int i6 = AbstractC2505i.f8018b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC1194D interfaceC1194DM2273e = m2273e(i5, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m2277i("Decoded result " + interfaceC1194DM2273e, jElapsedRealtimeNanos, null);
            }
            return interfaceC1194DM2273e;
        } finally {
            interfaceC1934d.mo2223b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final InterfaceC1194D m2273e(int i5, Object obj) {
        Class<?> cls = obj.getClass();
        C1207h c1207h = this.f3992d;
        C1192B c1192bM2268c = c1207h.m2268c(cls);
        C1147i c1147i = this.f4006r;
        boolean z5 = i5 == 4 || c1207h.f3977r;
        C1146h c1146h = C1757r.f6043i;
        Boolean bool = (Boolean) c1147i.m2201c(c1146h);
        if (bool == null || (bool.booleanValue() && !z5)) {
            c1147i = new C1147i();
            C2499c c2499c = this.f4006r.f3785b;
            C2499c c2499c2 = c1147i.f3785b;
            c2499c2.mo4305g(c2499c);
            c2499c2.put(c1146h, Boolean.valueOf(z5));
        }
        C1147i c1147i2 = c1147i;
        InterfaceC1936f interfaceC1936fM3593g = this.f3999k.m3586a().m3593g(obj);
        try {
            return c1192bM2268c.m2251a(this.f4003o, this.f4004p, new C0236c(i5, 1, this), c1147i2, interfaceC1936fM3593g);
        } finally {
            interfaceC1936fM3593g.mo3101b();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2274f() {
        InterfaceC1194D interfaceC1194DM2272d;
        boolean zM2271a;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m2277i("Retrieved data", this.f4009u, "data: " + this.f3983B + ", cache key: " + this.f4014z + ", fetcher: " + this.f3984C);
        }
        C1193C c1193c = null;
        if (((Map) this.f4011w.f6028e).containsKey(AbstractC1925g.class) && (supplier = this.f4012x) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f4012x.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e5) {
                this.f4012x = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e5);
                }
            }
        }
        try {
            interfaceC1194DM2272d = m2272d(this.f3984C, this.f3983B, this.f3991J);
        } catch (C1224y e6) {
            InterfaceC1144f interfaceC1144f = this.f3982A;
            int i5 = this.f3991J;
            e6.f4090e = interfaceC1144f;
            e6.f4091f = i5;
            e6.f4092g = null;
            this.f3993e.add(e6);
            interfaceC1194DM2272d = null;
        }
        if (interfaceC1194DM2272d == null) {
            m2282n();
            return;
        }
        int i6 = this.f3991J;
        boolean z5 = this.f3988G;
        if (interfaceC1194DM2272d instanceof InterfaceC1225z) {
            ((InterfaceC1225z) interfaceC1194DM2272d).mo2310a();
        }
        if (((C1193C) this.f3997i.f309g) != null) {
            c1193c = (C1193C) C1193C.f3913h.mo99c();
            c1193c.f3917g = false;
            c1193c.f3916f = true;
            c1193c.f3915e = interfaceC1194DM2272d;
            interfaceC1194DM2272d = c1193c;
        }
        if (((Map) this.f4011w.f6028e).containsKey(AbstractC1925g.class)) {
            m2281m();
        }
        m2284p();
        C1218s c1218s = this.f4007s;
        synchronized (c1218s) {
            c1218s.f4061q = interfaceC1194DM2272d;
            c1218s.f4062r = i6;
            c1218s.f4069y = z5;
        }
        synchronized (c1218s) {
            try {
                c1218s.f4049e.m4548a();
                if (c1218s.f4068x) {
                    c1218s.f4061q.mo2256e();
                    c1218s.m2301g();
                } else {
                    if (c1218s.f4048d.f4046d.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c1218s.f4063s) {
                        throw new IllegalStateException("Already have resource");
                    }
                    C0115D c0115d = c1218s.f4052h;
                    InterfaceC1194D interfaceC1194D = c1218s.f4061q;
                    boolean z6 = c1218s.f4059o;
                    C1220u c1220u = c1218s.f4058n;
                    InterfaceC1221v interfaceC1221v = c1218s.f4050f;
                    c0115d.getClass();
                    c1218s.f4066v = new C1222w(interfaceC1194D, z6, true, c1220u, interfaceC1221v);
                    c1218s.f4063s = true;
                    C1217r c1217r = c1218s.f4048d;
                    c1217r.getClass();
                    ArrayList<C1216q> arrayList = new ArrayList(c1217r.f4046d);
                    c1218s.m2299e(arrayList.size() + 1);
                    ((C1214o) c1218s.f4053i).m2293d(c1218s, c1218s.f4058n, c1218s.f4066v);
                    for (C1216q c1216q : arrayList) {
                        c1216q.f4045b.execute(new RunnableC1215p(c1218s, c1216q.f4044a, 1));
                    }
                    c1218s.m2298d();
                }
            } finally {
            }
        }
        this.f3989H = 5;
        try {
            C0072l0 c0072l0 = this.f3997i;
            if (((C1193C) c0072l0.f309g) != null) {
                C1213n c1213n = this.f3995g;
                C1147i c1147i = this.f4006r;
                c0072l0.getClass();
                try {
                    c1213n.m2288a().mo156h((InterfaceC1144f) c0072l0.f307e, new C0072l0((InterfaceC1150l) c0072l0.f308f, (C1193C) c0072l0.f309g, c1147i, 4));
                    ((C1193C) c0072l0.f309g).m2252a();
                } catch (Throwable th) {
                    ((C1193C) c0072l0.f309g).m2252a();
                    throw th;
                }
            }
            C1208i c1208i = this.f3998j;
            synchronized (c1208i) {
                c1208i.f3979b = true;
                zM2271a = c1208i.m2271a();
            }
            if (zM2271a) {
                m2279k();
            }
        } finally {
            if (c1193c != null) {
                c1193c.m2252a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final InterfaceC1206g m2275g() {
        int iM1088a = AbstractC0636d.m1088a(this.f3989H);
        C1207h c1207h = this.f3992d;
        if (iM1088a == 1) {
            return new C1195E(c1207h, this);
        }
        if (iM1088a == 2) {
            return new C1203d(c1207h.m2266a(), c1207h, this);
        }
        if (iM1088a == 3) {
            return new C1199I(c1207h, this);
        }
        if (iM1088a == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(AbstractC0231b.m411v(this.f3989H)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m2276h(int i5) {
        boolean z5;
        boolean z6;
        int iM1088a = AbstractC0636d.m1088a(i5);
        if (iM1088a == 0) {
            switch (this.f4005q.f4023a) {
                case 0:
                case BuildConfig.VERSION_CODE /* 1 */:
                    z5 = false;
                    break;
                default:
                    z5 = true;
                    break;
            }
            if (z5) {
                return 2;
            }
            return m2276h(2);
        }
        if (iM1088a != 1) {
            if (iM1088a == 2) {
                return 4;
            }
            if (iM1088a == 3 || iM1088a == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(AbstractC0231b.m411v(i5)));
        }
        switch (this.f4005q.f4023a) {
            case 0:
                z6 = false;
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
            default:
                z6 = true;
                break;
        }
        if (z6) {
            return 3;
        }
        return m2276h(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m2277i(String str, long j5, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AbstractC2505i.m4446a(j5));
        sb.append(", load key: ");
        sb.append(this.f4002n);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m2278j() {
        boolean zM2271a;
        if (((Map) this.f4011w.f6028e).containsKey(AbstractC1925g.class)) {
            m2281m();
        }
        m2284p();
        C1224y c1224y = new C1224y("Failed to load resource", new ArrayList(this.f3993e));
        C1218s c1218s = this.f4007s;
        synchronized (c1218s) {
            c1218s.f4064t = c1224y;
        }
        synchronized (c1218s) {
            try {
                c1218s.f4049e.m4548a();
                if (c1218s.f4068x) {
                    c1218s.m2301g();
                } else {
                    if (c1218s.f4048d.f4046d.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c1218s.f4065u) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c1218s.f4065u = true;
                    C1220u c1220u = c1218s.f4058n;
                    C1217r c1217r = c1218s.f4048d;
                    c1217r.getClass();
                    ArrayList<C1216q> arrayList = new ArrayList(c1217r.f4046d);
                    c1218s.m2299e(arrayList.size() + 1);
                    ((C1214o) c1218s.f4053i).m2293d(c1218s, c1220u, null);
                    for (C1216q c1216q : arrayList) {
                        c1216q.f4045b.execute(new RunnableC1215p(c1218s, c1216q.f4044a, 0));
                    }
                    c1218s.m2298d();
                }
            } finally {
            }
        }
        C1208i c1208i = this.f3998j;
        synchronized (c1208i) {
            c1208i.f3980c = true;
            zM2271a = c1208i.m2271a();
        }
        if (zM2271a) {
            m2279k();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m2279k() {
        C1208i c1208i = this.f3998j;
        synchronized (c1208i) {
            c1208i.f3979b = false;
            c1208i.f3978a = false;
            c1208i.f3980c = false;
        }
        C0072l0 c0072l0 = this.f3997i;
        c0072l0.f307e = null;
        c0072l0.f308f = null;
        c0072l0.f309g = null;
        C1207h c1207h = this.f3992d;
        c1207h.f3962c = null;
        c1207h.f3963d = null;
        c1207h.f3973n = null;
        c1207h.f3966g = null;
        c1207h.f3970k = null;
        c1207h.f3968i = null;
        c1207h.f3974o = null;
        c1207h.f3969j = null;
        c1207h.f3975p = null;
        c1207h.f3960a.clear();
        c1207h.f3971l = false;
        c1207h.f3961b.clear();
        c1207h.f3972m = false;
        this.f3986E = false;
        this.f3999k = null;
        this.f4000l = null;
        this.f4006r = null;
        this.f4001m = null;
        this.f4002n = null;
        this.f4007s = null;
        this.f3989H = 0;
        this.f3985D = null;
        this.f4013y = null;
        this.f4014z = null;
        this.f3983B = null;
        this.f3991J = 0;
        this.f3984C = null;
        this.f4009u = 0L;
        this.f3987F = false;
        this.f4010v = null;
        this.f3993e.clear();
        this.f3996h.mo97a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m2280l(int i5) {
        this.f3990I = i5;
        C1218s c1218s = this.f4007s;
        (c1218s.f4060p ? c1218s.f4056l : c1218s.f4055k).execute(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2281m() {
        if (!((Map) this.f4011w.f6028e).containsKey(AbstractC1925g.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f4012x;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e5) {
            this.f4012x = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m2282n() {
        this.f4013y = Thread.currentThread();
        int i5 = AbstractC2505i.f8018b;
        this.f4009u = SystemClock.elapsedRealtimeNanos();
        boolean zMo2257b = false;
        while (!this.f3987F && this.f3985D != null && !(zMo2257b = this.f3985D.mo2257b())) {
            this.f3989H = m2276h(this.f3989H);
            this.f3985D = m2275g();
            if (this.f3989H == 4) {
                m2280l(2);
                return;
            }
        }
        if ((this.f3989H == 6 || this.f3987F) && !zMo2257b) {
            m2278j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m2283o() {
        int iM1088a = AbstractC0636d.m1088a(this.f3990I);
        if (iM1088a == 0) {
            this.f3989H = m2276h(1);
            this.f3985D = m2275g();
            m2282n();
        } else if (iM1088a == 1) {
            m2282n();
        } else if (iM1088a == 2) {
            m2274f();
        } else {
            int i5 = this.f3990I;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m2284p() {
        Throwable th;
        this.f3994f.m4548a();
        if (!this.f3986E) {
            this.f3986E = true;
            return;
        }
        if (this.f3993e.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f3993e;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1934d interfaceC1934d = this.f3984C;
        try {
            try {
                if (this.f3987F) {
                    m2278j();
                    if (interfaceC1934d != null) {
                        interfaceC1934d.mo2223b();
                        return;
                    }
                    return;
                }
                m2283o();
                if (interfaceC1934d != null) {
                    interfaceC1934d.mo2223b();
                }
            } catch (Throwable th) {
                if (interfaceC1934d != null) {
                    interfaceC1934d.mo2223b();
                }
                throw th;
            }
        } catch (C1202c e5) {
            throw e5;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f3987F + ", stage: " + AbstractC0231b.m411v(this.f3989H), th2);
            }
            if (this.f3989H != 5) {
                this.f3993e.add(th2);
                m2278j();
            }
            if (!this.f3987F) {
                throw th2;
            }
            throw th2;
        }
    }
}
