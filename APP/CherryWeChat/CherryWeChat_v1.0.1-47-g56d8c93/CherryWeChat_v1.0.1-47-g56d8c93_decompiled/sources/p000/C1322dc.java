package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: dc */
/* JADX INFO: loaded from: classes.dex */
public final class C1322dc extends Thread {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4790i = AtomicIntegerFieldUpdater.newUpdater(C1322dc.class, "workerCtl$volatile");

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

    public C1322dc(ExecutorC1365ec executorC1365ec, int i) {
        this.f4798h = executorC1365ec;
        setDaemon(true);
        setContextClassLoader(ExecutorC1365ec.class.getClassLoader());
        this.f4791a = new C0661PF();
        this.f4792b = new C0382Iv();
        this.f4793c = 4;
        this.nextParkedWorker = ExecutorC1365ec.f4882k;
        int iNanoTime = (int) System.nanoTime();
        this.f4796f = iNanoTime == 0 ? 42 : iNanoTime;
        m2577f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r11 = p000.C0661PF.f2113d.get(r9);
        r0 = p000.C0661PF.f2112c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r11 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (p000.C0661PF.f2114e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r0 = r0 - 1;
        r1 = r9.m1321b(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        r7 = r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC1532iA m2572a(boolean z) {
        AbstractRunnableC1532iA abstractRunnableC1532iAM2576e;
        AbstractRunnableC1532iA abstractRunnableC1532iAM2576e2;
        long j;
        int i = this.f4793c;
        ExecutorC1365ec executorC1365ec = this.f4798h;
        AbstractRunnableC1532iA abstractRunnableC1532iA = null;
        C0661PF c0661pf = this.f4791a;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1365ec.f4880i;
            do {
                j = atomicLongFieldUpdater.get(executorC1365ec);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c0661pf.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0661PF.f2111b;
                        AbstractRunnableC1532iA abstractRunnableC1532iA2 = (AbstractRunnableC1532iA) atomicReferenceFieldUpdater.get(c0661pf);
                        if (abstractRunnableC1532iA2 == null || !abstractRunnableC1532iA2.f5415b) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(c0661pf, abstractRunnableC1532iA2, null)) {
                            if (atomicReferenceFieldUpdater.get(c0661pf) != abstractRunnableC1532iA2) {
                                break;
                            }
                        }
                        abstractRunnableC1532iA = abstractRunnableC1532iA2;
                        break loop1;
                    }
                    if (abstractRunnableC1532iA != null) {
                        return abstractRunnableC1532iA;
                    }
                    AbstractRunnableC1532iA abstractRunnableC1532iA3 = (AbstractRunnableC1532iA) executorC1365ec.f4888f.m2586d();
                    return abstractRunnableC1532iA3 == null ? m2580i(1) : abstractRunnableC1532iA3;
                }
            } while (!ExecutorC1365ec.f4880i.compareAndSet(executorC1365ec, j, j - 4398046511104L));
            this.f4793c = 1;
        }
        if (z) {
            boolean z2 = m2575d(executorC1365ec.f4883a * 2) == 0;
            if (z2 && (abstractRunnableC1532iAM2576e2 = m2576e()) != null) {
                return abstractRunnableC1532iAM2576e2;
            }
            c0661pf.getClass();
            AbstractRunnableC1532iA abstractRunnableC1532iAM1320a = (AbstractRunnableC1532iA) C0661PF.f2111b.getAndSet(c0661pf, null);
            if (abstractRunnableC1532iAM1320a == null) {
                abstractRunnableC1532iAM1320a = c0661pf.m1320a();
            }
            if (abstractRunnableC1532iAM1320a != null) {
                return abstractRunnableC1532iAM1320a;
            }
            if (!z2 && (abstractRunnableC1532iAM2576e = m2576e()) != null) {
                return abstractRunnableC1532iAM2576e;
            }
        } else {
            AbstractRunnableC1532iA abstractRunnableC1532iAM2576e3 = m2576e();
            if (abstractRunnableC1532iAM2576e3 != null) {
                return abstractRunnableC1532iAM2576e3;
            }
        }
        return m2580i(3);
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
    public final int m2575d(int i) {
        int i2 = this.f4796f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f4796f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC1532iA m2576e() {
        int iM2575d = m2575d(2);
        ExecutorC1365ec executorC1365ec = this.f4798h;
        if (iM2575d == 0) {
            AbstractRunnableC1532iA abstractRunnableC1532iA = (AbstractRunnableC1532iA) executorC1365ec.f4887e.m2586d();
            return abstractRunnableC1532iA != null ? abstractRunnableC1532iA : (AbstractRunnableC1532iA) executorC1365ec.f4888f.m2586d();
        }
        AbstractRunnableC1532iA abstractRunnableC1532iA2 = (AbstractRunnableC1532iA) executorC1365ec.f4888f.m2586d();
        return abstractRunnableC1532iA2 != null ? abstractRunnableC1532iA2 : (AbstractRunnableC1532iA) executorC1365ec.f4887e.m2586d();
    }

    /* JADX INFO: renamed from: f */
    public final void m2577f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4798h.f4886d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m2578g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2579h(int i) {
        int i2 = this.f4793c;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC1365ec.f4880i.addAndGet(this.f4798h, 4398046511104L);
        }
        if (i2 != i) {
            this.f4793c = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC1532iA m2580i(int i) {
        long j;
        AbstractRunnableC1532iA abstractRunnableC1532iAM1321b;
        long j2;
        long j3;
        AbstractRunnableC1532iA abstractRunnableC1532iA;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1365ec.f4880i;
        ExecutorC1365ec executorC1365ec = this.f4798h;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC1365ec) & 2097151);
        AbstractRunnableC1532iA abstractRunnableC1532iA2 = null;
        if (i2 < 2) {
            return null;
        }
        int iM2575d = m2575d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iM2575d++;
            if (iM2575d > i2) {
                iM2575d = 1;
            }
            C1322dc c1322dc = (C1322dc) executorC1365ec.f4889g.m4629b(iM2575d);
            if (c1322dc != null && c1322dc != this) {
                C0661PF c0661pf = c1322dc.f4791a;
                if (i != 3) {
                    c0661pf.getClass();
                    int i4 = C0661PF.f2113d.get(c0661pf);
                    int i5 = C0661PF.f2112c.get(c0661pf);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || C0661PF.f2114e.get(c0661pf) != 0) {
                            int i6 = i4 + 1;
                            abstractRunnableC1532iAM1321b = c0661pf.m1321b(i4, z);
                            if (abstractRunnableC1532iAM1321b != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                } else {
                    abstractRunnableC1532iAM1321b = c0661pf.m1320a();
                    j = 0;
                }
                C0382Iv c0382Iv = this.f4792b;
                if (abstractRunnableC1532iAM1321b != null) {
                    c0382Iv.f1315a = abstractRunnableC1532iAM1321b;
                    abstractRunnableC1532iA = abstractRunnableC1532iA2;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0661PF.f2111b;
                        AbstractRunnableC1532iA abstractRunnableC1532iA3 = (AbstractRunnableC1532iA) atomicReferenceFieldUpdater.get(c0661pf);
                        if (abstractRunnableC1532iA3 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((abstractRunnableC1532iA3.f5415b ? 1 : 2) & i) == 0) {
                            break;
                        }
                        AbstractC2224mA.f7741f.getClass();
                        C0661PF c0661pf2 = c0661pf;
                        long jNanoTime = System.nanoTime() - abstractRunnableC1532iA3.f5414a;
                        long j4 = AbstractC2224mA.f7737b;
                        if (jNanoTime < j4) {
                            j3 = j4 - jNanoTime;
                            abstractRunnableC1532iA = null;
                            break;
                        }
                        do {
                            abstractRunnableC1532iA = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(c0661pf2, abstractRunnableC1532iA3, null)) {
                                c0382Iv.f1315a = abstractRunnableC1532iA3;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c0661pf2) == abstractRunnableC1532iA3);
                        c0661pf = c0661pf2;
                        abstractRunnableC1532iA2 = null;
                    }
                }
                if (j3 == j2) {
                    AbstractRunnableC1532iA abstractRunnableC1532iA4 = (AbstractRunnableC1532iA) c0382Iv.f1315a;
                    c0382Iv.f1315a = abstractRunnableC1532iA;
                    return abstractRunnableC1532iA4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            abstractRunnableC1532iA2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f4795e = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (ExecutorC1365ec.f4881j.get(this.f4798h) != 1 && this.f4793c != 5) {
                AbstractRunnableC1532iA abstractRunnableC1532iAM2572a = m2572a(this.f4797g);
                if (abstractRunnableC1532iAM2572a != null) {
                    this.f4795e = 0L;
                    ExecutorC1365ec executorC1365ec = this.f4798h;
                    this.f4794d = 0L;
                    if (this.f4793c == 3) {
                        this.f4793c = 2;
                    }
                    if (abstractRunnableC1532iAM2572a.f5415b) {
                        if (m2579h(2) && !executorC1365ec.m2659m() && !executorC1365ec.m2658l(ExecutorC1365ec.f4880i.get(executorC1365ec))) {
                            executorC1365ec.m2659m();
                        }
                        try {
                            abstractRunnableC1532iAM2572a.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        ExecutorC1365ec.f4880i.addAndGet(executorC1365ec, -2097152L);
                        if (this.f4793c != 5) {
                            this.f4793c = 4;
                        }
                    } else {
                        try {
                            abstractRunnableC1532iAM2572a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.f4797g = false;
                    if (this.f4795e == 0) {
                        Object obj = this.nextParkedWorker;
                        C2610v1 c2610v1 = ExecutorC1365ec.f4882k;
                        if (obj != c2610v1) {
                            f4790i.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC1365ec.f4882k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4790i;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC1365ec executorC1365ec2 = this.f4798h;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC1365ec.f4881j;
                                    if (atomicIntegerFieldUpdater2.get(executorC1365ec2) != 1 && this.f4793c != 5) {
                                        m2579h(3);
                                        Thread.interrupted();
                                        if (this.f4794d == 0) {
                                            j = 2097151;
                                            this.f4794d = System.nanoTime() + this.f4798h.f4885c;
                                        } else {
                                            j = 2097151;
                                        }
                                        LockSupport.parkNanos(this.f4798h.f4885c);
                                        if (System.nanoTime() - this.f4794d >= 0) {
                                            this.f4794d = 0L;
                                            ExecutorC1365ec executorC1365ec3 = this.f4798h;
                                            synchronized (executorC1365ec3.f4889g) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(executorC1365ec3) == 1)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC1365ec.f4880i;
                                                        if (((int) (atomicLongFieldUpdater.get(executorC1365ec3) & j)) > executorC1365ec3.f4883a) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i = this.indexInArray;
                                                                m2577f(0);
                                                                executorC1365ec3.m2657i(this, i, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC1365ec3) & j);
                                                                if (andDecrement != i) {
                                                                    C1322dc c1322dc = (C1322dc) executorC1365ec3.f4889g.m4629b(andDecrement);
                                                                    executorC1365ec3.f4889g.m4630c(i, c1322dc);
                                                                    c1322dc.m2577f(i);
                                                                    executorC1365ec3.m2657i(c1322dc, andDecrement, i);
                                                                }
                                                                executorC1365ec3.f4889g.m4630c(andDecrement, null);
                                                                this.f4793c = 5;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC1365ec executorC1365ec4 = this.f4798h;
                            if (this.nextParkedWorker == c2610v1) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC1365ec.f4879h;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(executorC1365ec4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = executorC1365ec4.f4889g.m4629b((int) (j2 & 2097151));
                                    ExecutorC1365ec executorC1365ec5 = executorC1365ec4;
                                    if (ExecutorC1365ec.f4879h.compareAndSet(executorC1365ec5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        executorC1365ec4 = executorC1365ec5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        m2579h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f4795e);
                        this.f4795e = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        m2579h(5);
    }
}
