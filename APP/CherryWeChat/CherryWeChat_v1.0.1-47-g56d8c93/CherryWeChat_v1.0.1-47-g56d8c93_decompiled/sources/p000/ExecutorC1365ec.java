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
    public static final /* synthetic */ AtomicLongFieldUpdater f4879h = AtomicLongFieldUpdater.newUpdater(ExecutorC1365ec.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f4880i = AtomicLongFieldUpdater.newUpdater(ExecutorC1365ec.class, "controlState$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4881j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC1365ec.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k */
    public static final C2610v1 f4882k = new C2610v1("NOT_IN_STACK", 10);
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

    public ExecutorC1365ec(int i, int i2, long j, String str) {
        this.f4883a = i;
        this.f4884b = i2;
        this.f4885c = j;
        this.f4886d = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(AbstractC2374ph.m4813j(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f4887e = new C1100Zj();
        this.f4888f = new C1100Zj();
        this.f4889g = new C2295nw((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC1532iA abstractRunnableC1532iAM2572a;
        if (f4881j.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C1322dc c1322dc = threadCurrentThread instanceof C1322dc ? (C1322dc) threadCurrentThread : null;
            if (c1322dc == null || !AbstractC0585Nj.m1134a(c1322dc.f4798h, this)) {
                c1322dc = null;
            }
            synchronized (this.f4889g) {
                i = (int) (f4880i.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C1322dc c1322dc2 = (C1322dc) this.f4889g.m4629b(i2);
                    if (c1322dc2 != c1322dc) {
                        while (c1322dc2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c1322dc2);
                            c1322dc2.join(10000L);
                        }
                        C0661PF c0661pf = c1322dc2.f4791a;
                        C1100Zj c1100Zj = this.f4888f;
                        c0661pf.getClass();
                        AbstractRunnableC1532iA abstractRunnableC1532iA = (AbstractRunnableC1532iA) C0661PF.f2111b.getAndSet(c0661pf, null);
                        if (abstractRunnableC1532iA != null) {
                            c1100Zj.m2583a(abstractRunnableC1532iA);
                        }
                        while (true) {
                            AbstractRunnableC1532iA abstractRunnableC1532iAM1320a = c0661pf.m1320a();
                            if (abstractRunnableC1532iAM1320a == null) {
                                break;
                            } else {
                                c1100Zj.m2583a(abstractRunnableC1532iAM1320a);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f4888f.m2584b();
            this.f4887e.m2584b();
            while (true) {
                if (c1322dc == null) {
                    abstractRunnableC1532iAM2572a = (AbstractRunnableC1532iA) this.f4887e.m2586d();
                    if (abstractRunnableC1532iAM2572a == null && (abstractRunnableC1532iAM2572a = (AbstractRunnableC1532iA) this.f4888f.m2586d()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC1532iAM2572a = c1322dc.m2572a(true);
                    if (abstractRunnableC1532iAM2572a == null) {
                    }
                }
                try {
                    abstractRunnableC1532iAM2572a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c1322dc != null) {
                c1322dc.m2579h(5);
            }
            f4879h.set(this, 0L);
            f4880i.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2655d() {
        synchronized (this.f4889g) {
            try {
                if (f4881j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4880i;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f4883a) {
                    return 0;
                }
                if (i >= this.f4884b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f4889g.m4629b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C1322dc c1322dc = new C1322dc(this, i3);
                this.f4889g.m4630c(i3, c1322dc);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c1322dc.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m2656f(runnable, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m2656f(Runnable runnable, boolean z) {
        AbstractRunnableC1532iA c2089jA;
        int i;
        AbstractC2224mA.f7741f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC1532iA) {
            c2089jA = (AbstractRunnableC1532iA) runnable;
            c2089jA.f5414a = jNanoTime;
            c2089jA.f5415b = z;
        } else {
            c2089jA = new C2089jA(runnable, jNanoTime, z);
        }
        boolean z2 = c2089jA.f5415b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4880i;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C1322dc c1322dc = threadCurrentThread instanceof C1322dc ? (C1322dc) threadCurrentThread : null;
        if (c1322dc == null || !AbstractC0585Nj.m1134a(c1322dc.f4798h, this)) {
            c1322dc = null;
        }
        if (c1322dc != null && (i = c1322dc.f4793c) != 5 && (c2089jA.f5415b || i != 2)) {
            c1322dc.f4797g = true;
            C0661PF c0661pf = c1322dc.f4791a;
            c0661pf.getClass();
            c2089jA = (AbstractRunnableC1532iA) C0661PF.f2111b.getAndSet(c0661pf, c2089jA);
            if (c2089jA == null) {
                c2089jA = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = c0661pf.f2115a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0661PF.f2112c;
                if (atomicIntegerFieldUpdater.get(c0661pf) - C0661PF.f2113d.get(c0661pf) != 127) {
                    if (c2089jA.f5415b) {
                        C0661PF.f2114e.incrementAndGet(c0661pf);
                    }
                    int i2 = atomicIntegerFieldUpdater.get(c0661pf) & 127;
                    while (atomicReferenceArray.get(i2) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i2, c2089jA);
                    atomicIntegerFieldUpdater.incrementAndGet(c0661pf);
                    c2089jA = null;
                }
            }
        }
        if (c2089jA != null) {
            if (!(c2089jA.f5415b ? this.f4888f.m2583a(c2089jA) : this.f4887e.m2583a(c2089jA))) {
                throw new RejectedExecutionException(AbstractC0213Ey.m410h(new StringBuilder(), this.f4886d, " was terminated"));
            }
        }
        if (z2) {
            if (m2659m() || m2658l(jAddAndGet)) {
                return;
            }
            m2659m();
            return;
        }
        if (m2659m() || m2658l(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m2659m();
    }

    /* JADX INFO: renamed from: i */
    public final void m2657i(C1322dc c1322dc, int i, int i2) {
        while (true) {
            long j = f4879h.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM2574c = c1322dc.m2574c();
                    while (true) {
                        if (objM2574c == f4882k) {
                            i3 = -1;
                            break;
                        }
                        if (objM2574c == null) {
                            i3 = 0;
                            break;
                        }
                        C1322dc c1322dc2 = (C1322dc) objM2574c;
                        int iM2573b = c1322dc2.m2573b();
                        if (iM2573b != 0) {
                            i3 = iM2573b;
                            break;
                        }
                        objM2574c = c1322dc2.m2574c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f4879h.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2658l(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f4883a;
        if (i < i2) {
            int iM2655d = m2655d();
            if (iM2655d == 1 && i2 > 1) {
                m2655d();
            }
            if (iM2655d > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2659m() {
        C2610v1 c2610v1;
        int iM2573b;
        while (true) {
            long j = f4879h.get(this);
            C1322dc c1322dc = (C1322dc) this.f4889g.m4629b((int) (2097151 & j));
            if (c1322dc == null) {
                c1322dc = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM2574c = c1322dc.m2574c();
                while (true) {
                    c2610v1 = f4882k;
                    if (objM2574c == c2610v1) {
                        iM2573b = -1;
                        break;
                    }
                    if (objM2574c == null) {
                        iM2573b = 0;
                        break;
                    }
                    C1322dc c1322dc2 = (C1322dc) objM2574c;
                    iM2573b = c1322dc2.m2573b();
                    if (iM2573b != 0) {
                        break;
                    }
                    objM2574c = c1322dc2.m2574c();
                }
                if (iM2573b >= 0) {
                    if (f4879h.compareAndSet(this, j, ((long) iM2573b) | j2)) {
                        c1322dc.m2578g(c2610v1);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c1322dc == null) {
                return false;
            }
            if (C1322dc.f4790i.compareAndSet(c1322dc, -1, 0)) {
                LockSupport.unpark(c1322dc);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C2295nw c2295nw = this.f4889g;
        int iM4628a = c2295nw.m4628a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM4628a; i6++) {
            C1322dc c1322dc = (C1322dc) c2295nw.m4629b(i6);
            if (c1322dc != null) {
                C0661PF c0661pf = c1322dc.f4791a;
                c0661pf.getClass();
                int i7 = C0661PF.f2111b.get(c0661pf) != null ? (C0661PF.f2112c.get(c0661pf) - C0661PF.f2113d.get(c0661pf)) + 1 : C0661PF.f2112c.get(c0661pf) - C0661PF.f2113d.get(c0661pf);
                int iM424v = AbstractC0213Ey.m424v(c1322dc.f4793c);
                if (iM424v == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM424v == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM424v == 2) {
                    i3++;
                } else if (iM424v == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM424v != 4) {
                        throw new C0232Fa();
                    }
                    i5++;
                }
            }
        }
        long j = f4880i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f4886d);
        sb4.append('@');
        sb4.append(AbstractC0148Dc.m278l(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f4883a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f4884b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f4887e.m2585c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4888f.m2585c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
