package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: dc */
/* JADX INFO: loaded from: classes.dex */
public final class C1322dc extends Thread {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4790i = null;

    /* JADX INFO: renamed from: a */
    public final C0661PF f4791a;

    /* JADX INFO: renamed from: b */
    public final C0382Iv f4792b;

    /* JADX INFO: renamed from: c */
    public int f4793c;

    /* JADX INFO: renamed from: d */
    public long f4794d;

    /* JADX INFO: renamed from: e */
    public long f4795e;

    /* JADX INFO: renamed from: f */
    public int f4796f;

    /* JADX INFO: renamed from: g */
    public boolean f4797g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ExecutorC1365ec f4798h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    static {
        f4790i = AtomicIntegerFieldUpdater.newUpdater(C1322dc.class, "workerCtl$volatile");
    }

    public C1322dc(ExecutorC1365ec r3, int r4) {
        this.f4798h = r3;
        setDaemon(true);
        setContextClassLoader(ExecutorC1365ec.class.getClassLoader());
        this.f4791a = new C0661PF();
        this.f4792b = new C0382Iv();
        this.f4793c = 4;
        this.nextParkedWorker = ExecutorC1365ec.f4882k;
        int r32 = (int) System.nanoTime();
        if (r32 != 0) goto L6;
        r32 = 42;
    L6:
        this.f4796f = r32;
        m2577f(r4);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC1532iA m2572a(boolean r11) {
        int r0 = this.f4793c;
        ExecutorC1365ec r2 = this.f4798h;
        AbstractRunnableC1532iA r7 = null;
        boolean r8 = true;
        C0661PF r9 = this.f4791a;
        if (r0 == 1) goto L37;
        AtomicLongFieldUpdater r02 = ExecutorC1365ec.f4880i;
    L6:
        long r3 = r02.get(r2);
        if (((int) ((9223367638808264704L & r3) >> 42)) == 0) goto L8;
        if (ExecutorC1365ec.f4880i.compareAndSet(r2, r3, r3 - 4398046511104L) == false) goto L6;
        this.f4793c = 1;
        goto L37
    L8:
        r9.getClass();
    L9:
        AtomicReferenceFieldUpdater r112 = C0661PF.f2111b;
        AbstractRunnableC1532iA r03 = (AbstractRunnableC1532iA) r112.get(r9);
        if (r03 == null) goto L20;
        if (r03.f5415b != true) goto L20;
    L15:
        if (r112.compareAndSet(r9, r03, null) == true) goto L16;
        if (r112.get(r9) == r03) goto L15;
    L16:
        r7 = r03;
    L28:
        if (r7 != null) goto L33;
        AbstractRunnableC1532iA r113 = (AbstractRunnableC1532iA) r2.f4888f.m2586d();
        if (r113 == null) goto L32;
        return r113;
    L32:
        return m2580i(1);
    L33:
        return r7;
    L20:
        int r114 = C0661PF.f2113d.get(r9);
        int r04 = C0661PF.f2112c.get(r9);
    L21:
        if (r114 == r04) goto L28;
        if (C0661PF.f2114e.get(r9) == 0) goto L28;
        r04 = r04 - 1;
        AbstractRunnableC1532iA r1 = r9.m1321b(r04, true);
        if (r1 == null) goto L21;
        r7 = r1;
    L37:
        if (r11 == true) goto L39;
        AbstractRunnableC1532iA r115 = m2576e();
        if (r115 == null) goto L59;
        return r115;
    L59:
        return m2580i(3);
    L39:
        if (m2575d(r2.f4883a * 2) == 0) goto L42;
        r8 = false;
    L42:
        if (r8 == false) goto L46;
        AbstractRunnableC1532iA r116 = m2576e();
        if (r116 == null) goto L46;
        return r116;
    L46:
        r9.getClass();
        AbstractRunnableC1532iA r117 = (AbstractRunnableC1532iA) C0661PF.f2111b.getAndSet(r9, null);
        if (r117 != null) goto L49;
        r117 = r9.m1320a();
    L49:
        if (r117 == null) goto L51;
        return r117;
    L51:
        if (r8 == true) goto L59;
        AbstractRunnableC1532iA r118 = m2576e();
        if (r118 == null) goto L59;
        return r118;
    }

    /* JADX INFO: renamed from: b */
    public final int m2573b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m2574c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m2575d(int r4) {
        int r0 = this.f4796f;
        int r02 = r0 ^ (r0 << 13);
        int r03 = r02 ^ (r02 >> 17);
        int r04 = r03 ^ (r03 << 5);
        this.f4796f = r04;
        int r1 = r4 - 1;
        if ((r1 & r4) != 0) goto L7;
        return r04 & r1;
    L7:
        return (r04 & Integer.MAX_VALUE) % r4;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC1532iA m2576e() {
        int r0 = m2575d(2);
        ExecutorC1365ec r1 = this.f4798h;
        if (r0 != 0) goto L9;
        AbstractRunnableC1532iA r02 = (AbstractRunnableC1532iA) r1.f4887e.m2586d();
        if (r02 == null) goto L8;
        return r02;
    L8:
        return (AbstractRunnableC1532iA) r1.f4888f.m2586d();
    L9:
        AbstractRunnableC1532iA r03 = (AbstractRunnableC1532iA) r1.f4888f.m2586d();
        if (r03 == null) goto L13;
        return r03;
    L13:
        return (AbstractRunnableC1532iA) r1.f4887e.m2586d();
    }

    /* JADX INFO: renamed from: f */
    public final void m2577f(int r3) {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.f4798h.f4886d);
        r0.append("-worker-");
        if (r3 != 0) goto L5;
        String r1 = "TERMINATED";
    L6:
        r0.append(r1);
        setName(r0.toString());
        this.indexInArray = r3;
        return;
    L5:
        r1 = String.valueOf(r3);
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final void m2578g(Object r1) {
        this.nextParkedWorker = r1;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2579h(int r7) {
        int r0 = this.f4793c;
        boolean r1 = true;
        if (r0 == 1) goto L6;
        r1 = false;
    L6:
        if (r1 == false) goto L8;
        ExecutorC1365ec.f4880i.addAndGet(this.f4798h, 4398046511104L);
    L8:
        if (r0 == r7) goto L10;
        this.f4793c = r7;
    L10:
        return r1;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractRunnableC1532iA m2580i(int r26) {
        AtomicLongFieldUpdater r2 = ExecutorC1365ec.f4880i;
        ExecutorC1365ec r3 = this.f4798h;
        int r22 = (int) (r2.get(r3) & 2097151);
        AbstractRunnableC1532iA r4 = null;
        if (r22 >= 2) goto L5;
        return null;
    L5:
        int r6 = m2575d(r22);
        int r10 = 0;
        long r11 = Long.MAX_VALUE;
    L6:
        if (r10 >= r22) goto L63;
        r6 = r6 + 1;
        if (r6 <= r22) goto L10;
        r6 = 1;
    L10:
        C1322dc r5 = (C1322dc) r3.f4889g.m4629b(r6);
        if (r5 == null) goto L61;
        if (r5 == this) goto L61;
        C0661PF r52 = r5.f4791a;
        if (r26 != 3) goto L16;
        AbstractRunnableC1532iA r7 = r52.m1320a();
        long r18 = 0;
    L30:
        C0382Iv r13 = this.f4792b;
        if (r7 == null) goto L33;
        r13.f1315a = r7;
        AbstractRunnableC1532iA r53 = r4;
        long r72 = -1;
        long r20 = -1;
    L51:
        if (r72 == r20) goto L52;
        if (r72 <= r18) goto L61;
        r11 = Math.min(r11, r72);
        goto L61
    L52:
        AbstractRunnableC1532iA r1 = (AbstractRunnableC1532iA) r13.f1315a;
        r13.f1315a = r53;
        return r1;
    L33:
        AtomicReferenceFieldUpdater r73 = C0661PF.f2111b;
        AbstractRunnableC1532iA r14 = (AbstractRunnableC1532iA) r73.get(r52);
        if (r14 == null) goto L35;
        r20 = -1;
        if (r14.f5415b == false) goto L39;
        int r8 = 1;
    L41:
        if ((r8 & r26) == 0) goto L42;
        AbstractC2224mA.f7741f.getClass();
        C0661PF r23 = r52;
        long r82 = System.nanoTime() - r14.f5414a;
        long r42 = AbstractC2224mA.f7737b;
        if (r82 < r42) goto L45;
    L47:
        r53 = null;
        if (r73.compareAndSet(r23, r14, null) == true) goto L49;
        if (r73.get(r23) == r14) goto L47;
        r52 = r23;
        r4 = null;
        goto L33
    L49:
        r13.f1315a = r14;
        r72 = -1;
        goto L51
    L45:
        r72 = r42 - r82;
        r53 = null;
    L42:
        r72 = -2;
        r53 = r4;
        goto L51
    L39:
        r8 = 2;
        goto L41
    L35:
        r20 = -1;
        goto L42
    L16:
        r52.getClass();
        int r74 = C0661PF.f2113d.get(r52);
        int r83 = C0661PF.f2112c.get(r52);
        if (r26 != 1) goto L19;
        boolean r9 = true;
    L20:
        if (r74 == r83) goto L29;
        r18 = 0;
        if (r9 == true) goto L24;
    L26:
        int r132 = r74 + 1;
        r7 = r52.m1321b(r74, r9);
        if (r7 != null) goto L30;
        r74 = r132;
        goto L20
    L24:
        if (C0661PF.f2114e.get(r52) != 0) goto L26;
    L25:
        r7 = r4;
        goto L30
    L29:
        r18 = 0;
        goto L25
    L19:
        r9 = false;
    L61:
        r10 = r10 + 1;
        r4 = null;
        goto L6
    L63:
        if (r11 != Long.MAX_VALUE) goto L66;
        r11 = 0;
    L66:
        this.f4795e = r11;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
    L3:
        boolean r0 = false;
    L5:
        if (ExecutorC1365ec.f4881j.get(this.f4798h) == 1) goto L95;
        if (this.f4793c == 5) goto L95;
        AbstractRunnableC1532iA r3 = m2572a(this.f4797g);
        if (r3 != null) goto L11;
        this.f4797g = false;
        if (this.f4795e != 0) goto L38;
        Object r32 = this.nextParkedWorker;
        C2610v1 r11 = ExecutorC1365ec.f4882k;
        if (r32 != r11) goto L43;
        ExecutorC1365ec r33 = this.f4798h;
        if (this.nextParkedWorker != r11) goto L5;
        AtomicLongFieldUpdater r5 = ExecutorC1365ec.f4879h;
    L91:
        long r20 = r5.get(r33);
        int r6 = this.indexInArray;
        this.nextParkedWorker = r33.f4889g.m4629b((int) (r20 & 2097151));
        ExecutorC1365ec r19 = r33;
        if (ExecutorC1365ec.f4879h.compareAndSet(r19, r20, ((r20 + 2097152) & (-2097152)) | ((long) r6)) == true) goto L5;
        r33 = r19;
        goto L91
    L43:
        f4790i.set(this, -1);
    L45:
        if (this.nextParkedWorker == ExecutorC1365ec.f4882k) goto L5;
        AtomicIntegerFieldUpdater r34 = f4790i;
        if (r34.get(this) != (-1)) goto L5;
        ExecutorC1365ec r8 = this.f4798h;
        AtomicIntegerFieldUpdater r112 = ExecutorC1365ec.f4881j;
        if (r112.get(r8) == 1) goto L5;
        if (this.f4793c == 5) goto L5;
        m2579h(3);
        Thread.interrupted();
        if (this.f4794d != 0) goto L57;
        long r16 = 2097151;
        this.f4794d = System.nanoTime() + this.f4798h.f4885c;
    L58:
        LockSupport.parkNanos(this.f4798h.f4885c);
        if ((System.nanoTime() - this.f4794d) < 0) goto L45;
        this.f4794d = 0;
        ExecutorC1365ec r82 = this.f4798h;
        C2295nw r12 = r82.f4889g;
        monitor-enter(r12);
        if (r112.get(r82) != 1) goto L65;
        boolean r113 = true;
    L66:
        if (r113 == true) goto L67;
        AtomicLongFieldUpdater r114 = ExecutorC1365ec.f4880i;     // Catch: Throwable -> L80
        if (((int) (r114.get(r82) & r16)) <= r82.f4883a) goto L71;
        if (r34.compareAndSet(this, -1, 1) == false) goto L75;
        int r35 = this.indexInArray;     // Catch: Throwable -> L80
        m2577f(0);     // Catch: Throwable -> L80
        r82.m2657i(this, r35, 0);     // Catch: Throwable -> L80
        int r115 = (int) (r114.getAndDecrement(r82) & r16);     // Catch: Throwable -> L80
        if (r115 == r35) goto L82;
        C1322dc r13 = (C1322dc) r82.f4889g.m4629b(r115);     // Catch: Throwable -> L80
        r82.f4889g.m4630c(r35, r13);     // Catch: Throwable -> L80
        r13.m2577f(r35);     // Catch: Throwable -> L80
        r82.m2657i(r13, r115, r35);     // Catch: Throwable -> L80
    L82:
        r82.f4889g.m4630c(r115, null);     // Catch: Throwable -> L80
        monitor-exit(r12);
        this.f4793c = 5;
        goto L45
    L75:
        monitor-exit(r12);
        goto L45
    L71:
        monitor-exit(r12);
        goto L45
    L67:
        monitor-exit(r12);
        goto L45
    L65:
        r113 = false;
    L80:
        th = move-exception;
        throw th;
    L57:
        r16 = 2097151;
        goto L58
    L38:
        if (r0 == true) goto L40;
        r0 = true;
        goto L5
    L40:
        m2579h(3);
        Thread.interrupted();
        LockSupport.parkNanos(this.f4795e);
        this.f4795e = 0;
        goto L3
    L11:
        this.f4795e = 0;
        ExecutorC1365ec r52 = this.f4798h;
        this.f4794d = 0;
        if (this.f4793c != 3) goto L15;
        this.f4793c = 2;
    L15:
        if (r3.f5415b == true) goto L17;
        r3.run();     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        Thread r36 = Thread.currentThread();
        r36.getUncaughtExceptionHandler().uncaughtException(r36, th);
        goto L3
    L17:
        if (m2579h(2) == true) goto L19;
    L99:
        r3.run();     // Catch: Throwable -> L27
    L29:
        ExecutorC1365ec.f4880i.addAndGet(r52, -2097152);
        if (this.f4793c == 5) goto L3;
        this.f4793c = 4;
    L27:
        th = move-exception;
        Thread r37 = Thread.currentThread();
        r37.getUncaughtExceptionHandler().uncaughtException(r37, th);
        goto L29
    L19:
        if (r52.m2659m() == true) goto L99;
        if (r52.m2658l(ExecutorC1365ec.f4880i.get(r52)) == true) goto L99;
        r52.m2659m();
    L95:
        m2579h(5);
    }
}
