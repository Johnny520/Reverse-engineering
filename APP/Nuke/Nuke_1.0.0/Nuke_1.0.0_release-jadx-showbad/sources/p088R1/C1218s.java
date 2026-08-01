package p088R1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p000A.C0072l0;
import p002A1.C0115D;
import p102U1.ExecutorServiceC1475e;
import p171h2.C2239f;
import p195l2.AbstractC2503g;
import p200m2.C2603d;
import p200m2.InterfaceC2601b;
import p223q1.InterfaceC2909c;

/* JADX INFO: renamed from: R1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1218s implements InterfaceC2601b {

    /* JADX INFO: renamed from: z */
    public static final C0115D f4047z = new C0115D(19);

    /* JADX INFO: renamed from: f */
    public final InterfaceC1221v f4050f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2909c f4051g;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1219t f4053i;

    /* JADX INFO: renamed from: j */
    public final ExecutorServiceC1475e f4054j;

    /* JADX INFO: renamed from: k */
    public final ExecutorServiceC1475e f4055k;

    /* JADX INFO: renamed from: l */
    public final ExecutorServiceC1475e f4056l;

    /* JADX INFO: renamed from: n */
    public C1220u f4058n;

    /* JADX INFO: renamed from: o */
    public boolean f4059o;

    /* JADX INFO: renamed from: p */
    public boolean f4060p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1194D f4061q;

    /* JADX INFO: renamed from: r */
    public int f4062r;

    /* JADX INFO: renamed from: s */
    public boolean f4063s;

    /* JADX INFO: renamed from: t */
    public C1224y f4064t;

    /* JADX INFO: renamed from: u */
    public boolean f4065u;

    /* JADX INFO: renamed from: v */
    public C1222w f4066v;

    /* JADX INFO: renamed from: w */
    public RunnableC1209j f4067w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f4068x;

    /* JADX INFO: renamed from: y */
    public boolean f4069y;

    /* JADX INFO: renamed from: d */
    public final C1217r f4048d = new C1217r(new ArrayList(2));

    /* JADX INFO: renamed from: e */
    public final C2603d f4049e = new C2603d();

    /* JADX INFO: renamed from: m */
    public final AtomicInteger f4057m = new AtomicInteger();

    /* JADX INFO: renamed from: h */
    public final C0115D f4052h = f4047z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1218s(ExecutorServiceC1475e executorServiceC1475e, ExecutorServiceC1475e executorServiceC1475e2, ExecutorServiceC1475e executorServiceC1475e3, ExecutorServiceC1475e executorServiceC1475e4, C1214o c1214o, C1214o c1214o2, C0072l0 c0072l0) {
        this.f4054j = executorServiceC1475e;
        this.f4055k = executorServiceC1475e2;
        this.f4056l = executorServiceC1475e4;
        this.f4053i = c1214o;
        this.f4050f = c1214o2;
        this.f4051g = c0072l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m2296a(C2239f c2239f, Executor executor) {
        try {
            this.f4049e.m4548a();
            this.f4048d.f4046d.add(new C1216q(c2239f, executor));
            if (this.f4063s) {
                m2299e(1);
                executor.execute(new RunnableC1215p(this, c2239f, 1));
            } else if (this.f4065u) {
                m2299e(1);
                executor.execute(new RunnableC1215p(this, c2239f, 0));
            } else {
                AbstractC2503g.m4443a("Cannot add callbacks to a cancelled EngineJob", !this.f4068x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p200m2.InterfaceC2601b
    /* JADX INFO: renamed from: b */
    public final C2603d mo2253b() {
        return this.f4049e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2297c() {
        if (m2300f()) {
            return;
        }
        this.f4068x = true;
        RunnableC1209j runnableC1209j = this.f4067w;
        runnableC1209j.f3987F = true;
        InterfaceC1206g interfaceC1206g = runnableC1209j.f3985D;
        if (interfaceC1206g != null) {
            interfaceC1206g.cancel();
        }
        InterfaceC1219t interfaceC1219t = this.f4053i;
        C1220u c1220u = this.f4058n;
        C1214o c1214o = (C1214o) interfaceC1219t;
        synchronized (c1214o) {
            C1191A c1191a = c1214o.f4034a;
            c1191a.getClass();
            HashMap map = c1191a.f3909a;
            if (equals(map.get(c1220u))) {
                map.remove(c1220u);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2298d() {
        C1222w c1222w;
        synchronized (this) {
            try {
                this.f4049e.m4548a();
                AbstractC2503g.m4443a("Not yet complete!", m2300f());
                int iDecrementAndGet = this.f4057m.decrementAndGet();
                AbstractC2503g.m4443a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c1222w = this.f4066v;
                    m2301g();
                } else {
                    c1222w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1222w != null) {
            c1222w.m2304b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized void m2299e(int i5) {
        C1222w c1222w;
        AbstractC2503g.m4443a("Not yet complete!", m2300f());
        if (this.f4057m.getAndAdd(i5) == 0 && (c1222w = this.f4066v) != null) {
            c1222w.m2303a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m2300f() {
        return this.f4065u || this.f4063s || this.f4068x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m2301g() {
        boolean zM2271a;
        if (this.f4058n == null) {
            throw new IllegalArgumentException();
        }
        this.f4048d.f4046d.clear();
        this.f4058n = null;
        this.f4066v = null;
        this.f4061q = null;
        this.f4065u = false;
        this.f4068x = false;
        this.f4063s = false;
        this.f4069y = false;
        RunnableC1209j runnableC1209j = this.f4067w;
        C1208i c1208i = runnableC1209j.f3998j;
        synchronized (c1208i) {
            c1208i.f3978a = true;
            zM2271a = c1208i.m2271a();
        }
        if (zM2271a) {
            runnableC1209j.m2279k();
        }
        this.f4067w = null;
        this.f4064t = null;
        this.f4062r = 0;
        this.f4051g.mo97a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m2302h(C2239f c2239f) {
        try {
            this.f4049e.m4548a();
            this.f4048d.f4046d.remove(new C1216q(c2239f, AbstractC2503g.f8016b));
            if (this.f4048d.f4046d.isEmpty()) {
                m2297c();
                if (this.f4063s || this.f4065u) {
                    if (this.f4057m.get() == 0) {
                        m2301g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
