package p000;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ec */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1365ec implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f4879h = null;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f4880i = null;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4881j = null;

    /* JADX INFO: renamed from: k */
    public static final C2610v1 f4882k = null;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f4883a;

    /* JADX INFO: renamed from: b */
    public final int f4884b;

    /* JADX INFO: renamed from: c */
    public final long f4885c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f4886d;

    /* JADX INFO: renamed from: e */
    public final C1100Zj f4887e;

    /* JADX INFO: renamed from: f */
    public final C1100Zj f4888f;

    /* JADX INFO: renamed from: g */
    public final C2295nw f4889g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        f4879h = AtomicLongFieldUpdater.newUpdater(ExecutorC1365ec.class, "parkedWorkersStack$volatile");
        f4880i = AtomicLongFieldUpdater.newUpdater(ExecutorC1365ec.class, "controlState$volatile");
        f4881j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC1365ec.class, "_isTerminated$volatile");
        f4882k = new C2610v1("NOT_IN_STACK", 10);
    }

    public ExecutorC1365ec(int r3, int r4, long r5, String r7) {
        this.f4883a = r3;
        this.f4884b = r4;
        this.f4885c = r5;
        this.f4886d = r7;
        if (r3 < 1) goto L19;
        if (r4 < r3) goto L17;
        if (r4 > 2097150) goto L15;
        if (r5 <= 0) goto L13;
        this.f4887e = new C1100Zj();
        this.f4888f = new C1100Zj();
        this.f4889g = new C2295nw((r3 + 1) * 2);
        this.controlState$volatile = ((long) r3) << 42;
        return;
    L13:
        throw new IllegalArgumentException(("Idle worker keep alive time " + r5 + " must be positive").toString());
    L15:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
    L17:
        throw new IllegalArgumentException(("Max pool size " + r4 + " should be greater than or equals to core pool size " + r3).toString());
    L19:
        throw new IllegalArgumentException(AbstractC2374ph.m4813j(r3, "Core pool size ", " should be at least 1").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f4881j.compareAndSet(this, 0, 1) == true) goto L5;
        return;
    L5:
        Thread r0 = Thread.currentThread();
        if ((r0 instanceof C1322dc) == false) goto L8;
        C1322dc r02 = (C1322dc) r0;
    L9:
        if (r02 != null) goto L11;
    L13:
        r02 = null;
    L14:
        C2295nw r1 = this.f4889g;
        monitor-enter(r1);
        int r4 = (int) (f4880i.get(this) & 2097151);
        monitor-exit(r1);
        if (1 > r4) goto L35;
        int r12 = 1;
    L21:
        C1322dc r5 = (C1322dc) this.f4889g.m4629b(r12);
        if (r5 != r02) goto L24;
    L33:
        if (r12 == r4) goto L35;
        r12 = r12 + 1;
    L24:
        if (r5.getState() == Thread.State.TERMINATED) goto L26;
        LockSupport.unpark(r5);
        r5.join(10000);
        goto L24
    L26:
        C0661PF r52 = r5.f4791a;
        C1100Zj r6 = this.f4888f;
        r52.getClass();
        AbstractRunnableC1532iA r7 = (AbstractRunnableC1532iA) C0661PF.f2111b.getAndSet(r52, null);
        if (r7 == null) goto L29;
        r6.m2583a(r7);
    L29:
        AbstractRunnableC1532iA r72 = r52.m1320a();
        if (r72 == null) goto L33;
        r6.m2583a(r72);
    L35:
        this.f4888f.m2584b();
        this.f4887e.m2584b();
    L36:
        if (r02 == null) goto L39;
        AbstractRunnableC1532iA r13 = r02.m2572a(true);
        if (r13 == null) goto L39;
    L54:
        r13.run();     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        Thread r3 = Thread.currentThread();
        r3.getUncaughtExceptionHandler().uncaughtException(r3, th);
    L39:
        r13 = (AbstractRunnableC1532iA) this.f4887e.m2586d();
        if (r13 != null) goto L54;
        r13 = (AbstractRunnableC1532iA) this.f4888f.m2586d();
        if (r13 != null) goto L54;
        if (r02 == null) goto L45;
        r02.m2579h(5);
    L45:
        f4879h.set(this, 0);
        f4880i.set(this, 0);
        return;
    L51:
        th = move-exception;
        throw th;
    L11:
        if (AbstractC0585Nj.m1134a(r02.f4798h, this) == false) goto L13;
    L8:
        r02 = null;
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public final int m2655d() {
        C2295nw r0 = this.f4889g;
        monitor-enter(r0);
    L37:
        th = move-exception;
        throw th;
    L6:
        if (f4881j.get(this) != 1) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L13;
        monitor-exit(r0);
        return -1;
    L13:
        AtomicLongFieldUpdater r12 = f4880i;     // Catch: Throwable -> L37
        long r4 = r12.get(this);     // Catch: Throwable -> L37
        int r8 = (int) (r4 & 2097151);     // Catch: Throwable -> L37
        int r42 = r8 - ((int) ((r4 & 4398044413952L) >> 21));     // Catch: Throwable -> L37
        if (r42 >= 0) goto L17;
        r42 = 0;
    L17:
        if (r42 < this.f4883a) goto L21;
        monitor-exit(r0);
        return 0;
    L21:
        if (r8 < this.f4884b) goto L24;
        monitor-exit(r0);
        return 0;
    L24:
        int r3 = ((int) (r12.get(this) & 2097151)) + 1;     // Catch: Throwable -> L37
        if (r3 <= 0) goto L40;
        if (this.f4889g.m4629b(r3) != null) goto L40;
        C1322dc r5 = new C1322dc(this, r3);     // Catch: Throwable -> L37
        this.f4889g.m4630c(r3, r5);     // Catch: Throwable -> L37
        if (r3 != ((int) (2097151 & r12.incrementAndGet(this)))) goto L36;
        int r43 = r42 + 1;
        monitor-exit(r0);
        r5.start();
        return r43;
    L36:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L37
    L40:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L37
    L8:
        r1 = false;
        goto L9
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        m2656f(r2, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m2656f(Runnable r9, boolean r10) {
        AbstractC2224mA.f7741f.getClass();
        long r0 = System.nanoTime();
        if ((r9 instanceof AbstractRunnableC1532iA) == false) goto L5;
        AbstractRunnableC1532iA r92 = (AbstractRunnableC1532iA) r9;
        r92.f5414a = r0;
        r92.f5415b = r10;
    L6:
        boolean r102 = r92.f5415b;
        AtomicLongFieldUpdater r02 = f4880i;
        if (r102 == false) goto L9;
        long r1 = r02.addAndGet(this, 2097152);
    L10:
        Thread r3 = Thread.currentThread();
        if ((r3 instanceof C1322dc) == false) goto L13;
        C1322dc r32 = (C1322dc) r3;
    L14:
        if (r32 != null) goto L16;
    L18:
        r32 = null;
    L19:
        if (r32 == null) goto L43;
        int r4 = r32.f4793c;
        if (r4 == 5) goto L43;
        if (r92.f5415b == false) goto L27;
    L29:
        r32.f4797g = true;
        C0661PF r33 = r32.f4791a;
        r33.getClass();
        r92 = (AbstractRunnableC1532iA) C0661PF.f2111b.getAndSet(r33, r92);
        if (r92 != null) goto L32;
        r92 = null;
        goto L43
    L32:
        AtomicReferenceArray r42 = r33.f2115a;
        AtomicIntegerFieldUpdater r5 = C0661PF.f2112c;
        if ((r5.get(r33) - C0661PF.f2113d.get(r33)) == 127) goto L43;
        if (r92.f5415b == false) goto L38;
        C0661PF.f2114e.incrementAndGet(r33);
    L38:
        int r6 = r5.get(r33) & 127;
    L40:
        if (r42.get(r6) == null) goto L42;
        Thread.yield();
        goto L40
    L42:
        r42.lazySet(r6, r92);
        r5.incrementAndGet(r33);
        r92 = null;
        goto L43
    L27:
        if (r4 != 2) goto L29;
    L43:
        if (r92 != null) goto L45;
    L52:
        if (r102 == false) goto L62;
        if (m2659m() == false) goto L57;
        return;
    L57:
        if (m2658l(r1) == true) goto L71;
        m2659m();
        return;
    L71:
        return;
    L62:
        if (m2659m() == false) goto L65;
        return;
    L65:
        if (m2658l(r02.get(this)) == false) goto L67;
        return;
    L67:
        m2659m();
        return;
    L45:
        if (r92.f5415b == false) goto L47;
        boolean r93 = this.f4888f.m2583a(r92);
    L48:
        if (r93 == true) goto L52;
        throw new RejectedExecutionException(AbstractC0213Ey.m410h(new StringBuilder(), this.f4886d, " was terminated"));
    L47:
        r93 = this.f4887e.m2583a(r92);
        goto L48
    L16:
        if (AbstractC0585Nj.m1134a(r32.f4798h, this) == false) goto L18;
    L13:
        r32 = null;
        goto L14
    L9:
        r1 = 0;
        goto L10
    L5:
        r92 = new C2089jA(r9, r0, r10);
        goto L6
    }

    /* JADX INFO: renamed from: i */
    public final void m2657i(C1322dc r8, int r9, int r10) {
    L2:
        long r3 = f4879h.get(this);
        int r0 = (int) (2097151 & r3);
        long r1 = (2097152 + r3) & (-2097152);
        if (r0 != r9) goto L16;
        if (r10 != 0) goto L15;
        Object r02 = r8.m2574c();
    L7:
        if (r02 == f4882k) goto L8;
        if (r02 == null) goto L10;
        C1322dc r03 = (C1322dc) r02;
        int r5 = r03.m2573b();
        if (r5 != 0) goto L13;
        r02 = r03.m2574c();
        goto L7
    L13:
        r0 = r5;
        goto L16
    L10:
        r0 = 0;
        goto L16
    L8:
        r0 = -1;
        goto L16
    L15:
        r0 = r10;
    L16:
        if (r0 < 0) goto L2;
        long r52 = ((long) r0) | r1;
        if (f4879h.compareAndSet(this, r3, r52) == false) goto L2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2658l(long r4) {
        int r0 = ((int) (2097151 & r4)) - ((int) ((r4 & 4398044413952L) >> 21));
        if (r0 >= 0) goto L5;
        r0 = 0;
    L5:
        int r5 = this.f4883a;
        if (r0 >= r5) goto L13;
        int r02 = m2655d();
        if (r02 != 1) goto L11;
        if (r5 <= 1) goto L11;
        m2655d();
    L11:
        if (r02 <= 0) goto L13;
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2659m() {
    L2:
        long r3 = f4879h.get(this);
        C1322dc r0 = (C1322dc) this.f4889g.m4629b((int) (2097151 & r3));
        if (r0 == null) goto L4;
        long r1 = (2097152 + r3) & (-2097152);
        Object r5 = r0.m2574c();
    L6:
        C2610v1 r9 = f4882k;
        if (r5 == r9) goto L8;
        if (r5 == null) goto L10;
        C1322dc r52 = (C1322dc) r5;
        int r6 = r52.m2573b();
        if (r6 != 0) goto L13;
        r5 = r52.m2574c();
    L13:
        if (r6 < 0) goto L2;
        if (f4879h.compareAndSet(this, r3, ((long) r6) | r1) == false) goto L2;
        r0.m2578g(r9);
    L17:
        if (r0 == null) goto L18;
        if (C1322dc.f4790i.compareAndSet(r0, -1, 0) == false) goto L2;
        LockSupport.unpark(r0);
        return true;
    L18:
        return false;
    L10:
        r6 = 0;
        goto L13
    L8:
        r6 = -1;
        goto L13
    L4:
        r0 = null;
        goto L17
    }

    public final String toString() {
        ArrayList r0 = new ArrayList();
        C2295nw r1 = this.f4889g;
        int r2 = r1.m4628a();
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 1;
    L3:
        if (r9 >= r2) goto L30;
        C1322dc r10 = (C1322dc) r1.m4629b(r9);
        if (r10 == null) goto L29;
        C0661PF r11 = r10.f4791a;
        r11.getClass();
        if (C0661PF.f2111b.get(r11) == null) goto L10;
        int r12 = (C0661PF.f2112c.get(r11) - C0661PF.f2113d.get(r11)) + 1;
    L11:
        int r102 = AbstractC0213Ey.m424v(r10.f4793c);
        if (r102 == 0) goto L28;
        if (r102 != 1) goto L15;
        r5 = r5 + 1;
        StringBuilder r103 = new StringBuilder();
        r103.append(r12);
        r103.append('b');
        r0.add(r103.toString());
        goto L29
    L15:
        if (r102 != 2) goto L17;
        r6 = r6 + 1;
        goto L29
    L17:
        if (r102 != 3) goto L19;
        r7 = r7 + 1;
        if (r12 <= 0) goto L29;
        StringBuilder r104 = new StringBuilder();
        r104.append(r12);
        r104.append('d');
        r0.add(r104.toString());
        goto L29
    L19:
        if (r102 != 4) goto L22;
        r8 = r8 + 1;
        goto L29
    L22:
        throw new C0232Fa();
    L28:
        r3 = r3 + 1;
        StringBuilder r105 = new StringBuilder();
        r105.append(r12);
        r105.append('c');
        r0.add(r105.toString());
        goto L29
    L10:
        r12 = C0661PF.f2112c.get(r11) - C0661PF.f2113d.get(r11);
    L29:
        r9 = r9 + 1;
        goto L3
    L30:
        long r13 = f4880i.get(this);
        StringBuilder r4 = new StringBuilder();
        r4.append(this.f4886d);
        r4.append('@');
        r4.append(AbstractC0148Dc.m278l(this));
        r4.append("[Pool Size {core = ");
        int r92 = this.f4883a;
        r4.append(r92);
        r4.append(", max = ");
        r4.append(this.f4884b);
        r4.append("}, Worker States {CPU = ");
        r4.append(r3);
        r4.append(", blocking = ");
        r4.append(r5);
        r4.append(", parked = ");
        r4.append(r6);
        r4.append(", dormant = ");
        r4.append(r7);
        r4.append(", terminated = ");
        r4.append(r8);
        r4.append("}, running workers queues = ");
        r4.append(r0);
        r4.append(", global CPU queue size = ");
        r4.append(this.f4887e.m2585c());
        r4.append(", global blocking queue size = ");
        r4.append(this.f4888f.m2585c());
        r4.append(", Control State {created workers= ");
        r4.append((int) (2097151 & r13));
        r4.append(", blocking tasks = ");
        r4.append((int) ((4398044413952L & r13) >> 21));
        r4.append(", CPUs acquired = ");
        r4.append(r92 - ((int) ((r13 & 9223367638808264704L) >> 42)));
        r4.append("}]");
        return r4.toString();
    }
}
