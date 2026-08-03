package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ig */
/* JADX INFO: loaded from: classes.dex */
public final class C1544ig implements InterfaceC1097Zg {

    /* JADX INFO: renamed from: w */
    public static final C2220m6 f5443w = null;

    /* JADX INFO: renamed from: a */
    public final C1501hg f5444a;

    /* JADX INFO: renamed from: b */
    public final C1432fz f5445b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2193lg f5446c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1024Xt f5447d;

    /* JADX INFO: renamed from: e */
    public final C2220m6 f5448e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2102jg f5449f;

    /* JADX INFO: renamed from: g */
    public final ExecutorServiceC0971Wj f5450g;

    /* JADX INFO: renamed from: h */
    public final ExecutorServiceC0971Wj f5451h;

    /* JADX INFO: renamed from: i */
    public final ExecutorServiceC0971Wj f5452i;

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f5453j;

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

    static {
        f5443w = new C2220m6(21);
    }

    public C1544ig(ExecutorServiceC0971Wj r3, ExecutorServiceC0971Wj r4, ExecutorServiceC0971Wj r5, ExecutorServiceC0971Wj r6, C1264cg r7, C1264cg r8, C2656w4 r9) {
        this.f5444a = new C1501hg(new ArrayList(2));
        this.f5445b = new C1432fz();
        this.f5453j = new AtomicInteger();
        this.f5450g = r3;
        this.f5451h = r4;
        this.f5452i = r6;
        this.f5449f = r7;
        this.f5446c = r8;
        this.f5447d = r9;
        this.f5448e = f5443w;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m2957a(C2563ty r3, Executor r4) {
        monitor-enter(this);
        this.f5445b.m2744a();     // Catch: Throwable -> L6
        this.f5444a.f5288a.add(new C1457gg(r3, r4));     // Catch: Throwable -> L6
        if (this.f5459p == false) goto L9;
        m2960e(1);     // Catch: Throwable -> L6
        r4.execute(new RunnableC1413fg(this, r3, 1));     // Catch: Throwable -> L6
    L12:
        monitor-exit(this);
        return;
    L9:
        if (this.f5461r == false) goto L11;
        m2960e(1);     // Catch: Throwable -> L6
        r4.execute(new RunnableC1413fg(this, r3, 0));     // Catch: Throwable -> L6
        goto L12
    L11:
        AbstractC0714Qj.m1484f("Cannot add callbacks to a cancelled EngineJob", !this.f5464u);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m2958b() {
        if (m2961f() == false) goto L5;
        return;
    L5:
        this.f5464u = true;
        RunnableC0320Hc r1 = this.f5463t;
        r1.f1057B = true;
        InterfaceC2627vc r0 = r1.f1087z;
        if (r0 == null) goto L8;
        r0.cancel();
    L8:
        InterfaceC2102jg r02 = this.f5449f;
        C2146kg r12 = this.f5454k;
        C1264cg r03 = (C1264cg) r02;
        monitor-enter(r03);
        C2756yc r2 = r03.f4294a;     // Catch: Throwable -> L15
        r2.getClass();     // Catch: Throwable -> L15
        HashMap r22 = r2.f9385a;     // Catch: Throwable -> L15
        if (equals(r22.get(r12)) == false) goto L13;
        r22.remove(r12);     // Catch: Throwable -> L15
    L13:
        monitor-exit(r03);
        return;
    L15:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC1097Zg
    /* JADX INFO: renamed from: c */
    public final C1432fz mo672c() {
        return this.f5445b;
    }

    /* JADX INFO: renamed from: d */
    public final void m2959d() {
        monitor-enter(this);
        this.f5445b.m2744a();     // Catch: Throwable -> L10
        AbstractC0714Qj.m1484f("Not yet complete!", m2961f());     // Catch: Throwable -> L10
        int r0 = this.f5453j.decrementAndGet();     // Catch: Throwable -> L10
        if (r0 < 0) goto L6;
        boolean r1 = true;
    L7:
        AbstractC0714Qj.m1484f("Can't decrement below 0", r1);     // Catch: Throwable -> L10
        if (r0 != 0) goto L12;
        C2236mg r02 = this.f5462s;     // Catch: Throwable -> L10
        m2962g();     // Catch: Throwable -> L10
    L13:
        monitor-exit(this);     // Catch: Throwable -> L10
        if (r02 == null) goto L21;
        r02.m4540c();
        return;
    L21:
        return;
    L12:
        r02 = null;
        goto L13
    L6:
        r1 = false;
    L10:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m2960e(int r3) {
        monitor-enter(this);
        AbstractC0714Qj.m1484f("Not yet complete!", m2961f());     // Catch: Throwable -> L9
        if (this.f5453j.getAndAdd(r3) != 0) goto L11;
        C2236mg r32 = this.f5462s;     // Catch: Throwable -> L9
        if (r32 == null) goto L11;
        r32.m4539a();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2961f() {
        if (this.f5461r == false) goto L5;
        return true;
    L5:
        if (this.f5459p == false) goto L7;
        return true;
    L7:
        if (this.f5464u == true) goto L14;
        return false;
    L14:
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2962g() {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.f5454k == null) goto L21;
        this.f5444a.f5288a.clear();     // Catch: Throwable -> L15
        this.f5454k = null;     // Catch: Throwable -> L15
        this.f5462s = null;     // Catch: Throwable -> L15
        this.f5457n = null;     // Catch: Throwable -> L15
        this.f5461r = false;     // Catch: Throwable -> L15
        this.f5464u = false;     // Catch: Throwable -> L15
        this.f5459p = false;     // Catch: Throwable -> L15
        this.f5465v = false;     // Catch: Throwable -> L15
        RunnableC0320Hc r2 = this.f5463t;     // Catch: Throwable -> L15
        C0277Gc r3 = r2.f1068g;     // Catch: Throwable -> L15
        monitor-enter(r3);     // Catch: Throwable -> L15
        r3.f901a = true;     // Catch: Throwable -> L17
        boolean r4 = r3.m559a();     // Catch: Throwable -> L17
        monitor-exit(r3);     // Catch: Throwable -> L15
        if (r4 == false) goto L12;
        r2.m679j();     // Catch: Throwable -> L15
    L12:
        this.f5463t = null;     // Catch: Throwable -> L15
        this.f5460q = null;     // Catch: Throwable -> L15
        this.f5458o = 0;     // Catch: Throwable -> L15
        this.f5447d.mo1934a(this);     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L21:
        throw new IllegalArgumentException();     // Catch: Throwable -> L15
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m2963h(C2563ty r4) {
        monitor-enter(this);
        this.f5445b.m2744a();     // Catch: Throwable -> L10
        this.f5444a.f5288a.remove(new C1457gg(r4, AbstractC0671Pj.f2140c));     // Catch: Throwable -> L10
        if (this.f5444a.f5288a.isEmpty() == false) goto L15;
        m2958b();     // Catch: Throwable -> L10
        if (this.f5459p == true) goto L13;
        if (this.f5461r == false) goto L15;
    L13:
        if (this.f5453j.get() != 0) goto L15;
        m2962g();     // Catch: Throwable -> L10
    L15:
        monitor-exit(this);
        return;
    L10:
        th = move-exception;
        throw th;
    }
}
