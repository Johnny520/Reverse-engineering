package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ig */
/* JADX INFO: loaded from: classes.dex */
public final class C1544ig implements InterfaceC1097Zg {

    /* JADX INFO: renamed from: w */
    public static final C2220m6 f5443w = new C2220m6(21);

    /* JADX INFO: renamed from: c */
    public final InterfaceC2193lg f5446c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1024Xt f5447d;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2102jg f5449f;

    /* JADX INFO: renamed from: g */
    public final ExecutorServiceC0971Wj f5450g;

    /* JADX INFO: renamed from: h */
    public final ExecutorServiceC0971Wj f5451h;

    /* JADX INFO: renamed from: i */
    public final ExecutorServiceC0971Wj f5452i;

    /* JADX INFO: renamed from: k */
    public C2146kg f5454k;

    /* JADX INFO: renamed from: l */
    public boolean f5455l;

    /* JADX INFO: renamed from: m */
    public boolean f5456m;

    /* JADX INFO: renamed from: n */
    public InterfaceC2389pw f5457n;

    /* JADX INFO: renamed from: o */
    public int f5458o;

    /* JADX INFO: renamed from: p */
    public boolean f5459p;

    /* JADX INFO: renamed from: q */
    public C0842Tj f5460q;

    /* JADX INFO: renamed from: r */
    public boolean f5461r;

    /* JADX INFO: renamed from: s */
    public C2236mg f5462s;

    /* JADX INFO: renamed from: t */
    public RunnableC0320Hc f5463t;

    /* JADX INFO: renamed from: u */
    public volatile boolean f5464u;

    /* JADX INFO: renamed from: v */
    public boolean f5465v;

    /* JADX INFO: renamed from: a */
    public final C1501hg f5444a = new C1501hg(new ArrayList(2));

    /* JADX INFO: renamed from: b */
    public final C1432fz f5445b = new C1432fz();

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f5453j = new AtomicInteger();

    /* JADX INFO: renamed from: e */
    public final C2220m6 f5448e = f5443w;

    public C1544ig(ExecutorServiceC0971Wj executorServiceC0971Wj, ExecutorServiceC0971Wj executorServiceC0971Wj2, ExecutorServiceC0971Wj executorServiceC0971Wj3, ExecutorServiceC0971Wj executorServiceC0971Wj4, C1264cg c1264cg, C1264cg c1264cg2, C2656w4 c2656w4) {
        this.f5450g = executorServiceC0971Wj;
        this.f5451h = executorServiceC0971Wj2;
        this.f5452i = executorServiceC0971Wj4;
        this.f5449f = c1264cg;
        this.f5446c = c1264cg2;
        this.f5447d = c2656w4;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2957a(C2563ty c2563ty, Executor executor) {
        try {
            this.f5445b.m2744a();
            this.f5444a.f5288a.add(new C1457gg(c2563ty, executor));
            if (this.f5459p) {
                m2960e(1);
                executor.execute(new RunnableC1413fg(this, c2563ty, 1));
            } else if (this.f5461r) {
                m2960e(1);
                executor.execute(new RunnableC1413fg(this, c2563ty, 0));
            } else {
                AbstractC0714Qj.m1484f("Cannot add callbacks to a cancelled EngineJob", !this.f5464u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2958b() {
        if (m2961f()) {
            return;
        }
        this.f5464u = true;
        RunnableC0320Hc runnableC0320Hc = this.f5463t;
        runnableC0320Hc.f1057B = true;
        InterfaceC2627vc interfaceC2627vc = runnableC0320Hc.f1087z;
        if (interfaceC2627vc != null) {
            interfaceC2627vc.cancel();
        }
        InterfaceC2102jg interfaceC2102jg = this.f5449f;
        C2146kg c2146kg = this.f5454k;
        C1264cg c1264cg = (C1264cg) interfaceC2102jg;
        synchronized (c1264cg) {
            C2756yc c2756yc = c1264cg.f4294a;
            c2756yc.getClass();
            HashMap map = c2756yc.f9385a;
            if (equals(map.get(c2146kg))) {
                map.remove(c2146kg);
            }
        }
    }

    @Override // p000.InterfaceC1097Zg
    /* JADX INFO: renamed from: c */
    public final C1432fz mo672c() {
        return this.f5445b;
    }

    /* JADX INFO: renamed from: d */
    public final void m2959d() {
        C2236mg c2236mg;
        synchronized (this) {
            try {
                this.f5445b.m2744a();
                AbstractC0714Qj.m1484f("Not yet complete!", m2961f());
                int iDecrementAndGet = this.f5453j.decrementAndGet();
                AbstractC0714Qj.m1484f("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c2236mg = this.f5462s;
                    m2962g();
                } else {
                    c2236mg = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2236mg != null) {
            c2236mg.m4540c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m2960e(int i) {
        C2236mg c2236mg;
        AbstractC0714Qj.m1484f("Not yet complete!", m2961f());
        if (this.f5453j.getAndAdd(i) == 0 && (c2236mg = this.f5462s) != null) {
            c2236mg.m4539a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2961f() {
        return this.f5461r || this.f5459p || this.f5464u;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2962g() {
        boolean zM559a;
        if (this.f5454k == null) {
            throw new IllegalArgumentException();
        }
        this.f5444a.f5288a.clear();
        this.f5454k = null;
        this.f5462s = null;
        this.f5457n = null;
        this.f5461r = false;
        this.f5464u = false;
        this.f5459p = false;
        this.f5465v = false;
        RunnableC0320Hc runnableC0320Hc = this.f5463t;
        C0277Gc c0277Gc = runnableC0320Hc.f1068g;
        synchronized (c0277Gc) {
            c0277Gc.f901a = true;
            zM559a = c0277Gc.m559a();
        }
        if (zM559a) {
            runnableC0320Hc.m679j();
        }
        this.f5463t = null;
        this.f5460q = null;
        this.f5458o = 0;
        this.f5447d.mo1934a(this);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m2963h(C2563ty c2563ty) {
        try {
            this.f5445b.m2744a();
            this.f5444a.f5288a.remove(new C1457gg(c2563ty, AbstractC0671Pj.f2140c));
            if (this.f5444a.f5288a.isEmpty()) {
                m2958b();
                if (this.f5459p || this.f5461r) {
                    if (this.f5453j.get() == 0) {
                        m2962g();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
