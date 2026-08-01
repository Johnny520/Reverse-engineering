package p201m3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p121Y1.C1753n;

/* JADX INFO: renamed from: m3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2604a extends Thread {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8277l = AtomicIntegerFieldUpdater.newUpdater(C2604a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: d */
    public final C2616m f8278d;

    /* JADX INFO: renamed from: e */
    public final C1675t f8279e;

    /* JADX INFO: renamed from: f */
    public EnumC2605b f8280f;

    /* JADX INFO: renamed from: g */
    public long f8281g;

    /* JADX INFO: renamed from: h */
    public long f8282h;

    /* JADX INFO: renamed from: i */
    public int f8283i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j */
    public boolean f8284j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ExecutorC2606c f8285k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2604a(ExecutorC2606c executorC2606c, int i5) {
        this.f8285k = executorC2606c;
        setDaemon(true);
        setContextClassLoader(ExecutorC2606c.class.getClassLoader());
        this.f8278d = new C2616m();
        this.f8279e = new C1675t();
        this.f8280f = EnumC2605b.f8289g;
        this.nextParkedWorker = ExecutorC2606c.f8295n;
        int iNanoTime = (int) System.nanoTime();
        this.f8283i = iNanoTime == 0 ? 42 : iNanoTime;
        m4554f(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = p201m3.C2616m.f8320d.get(r9);
        r0 = p201m3.C2616m.f8319c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p201m3.C2616m.f8321e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.m4566c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC2612i m4549a(boolean z5) {
        AbstractRunnableC2612i abstractRunnableC2612iM4553e;
        AbstractRunnableC2612i abstractRunnableC2612iM4553e2;
        long j5;
        EnumC2605b enumC2605b = this.f8280f;
        ExecutorC2606c executorC2606c = this.f8285k;
        AbstractRunnableC2612i abstractRunnableC2612i = null;
        C2616m c2616m = this.f8278d;
        EnumC2605b enumC2605b2 = EnumC2605b.f8286d;
        if (enumC2605b != enumC2605b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2606c.f8293l;
            do {
                j5 = atomicLongFieldUpdater.get(executorC2606c);
                if (((int) ((9223367638808264704L & j5) >> 42)) == 0) {
                    c2616m.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2616m.f8318b;
                        AbstractRunnableC2612i abstractRunnableC2612i2 = (AbstractRunnableC2612i) atomicReferenceFieldUpdater.get(c2616m);
                        if (abstractRunnableC2612i2 == null || !abstractRunnableC2612i2.f8309e) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(c2616m, abstractRunnableC2612i2, null)) {
                            if (atomicReferenceFieldUpdater.get(c2616m) != abstractRunnableC2612i2) {
                                break;
                            }
                        }
                        abstractRunnableC2612i = abstractRunnableC2612i2;
                        break loop1;
                    }
                    if (abstractRunnableC2612i != null) {
                        return abstractRunnableC2612i;
                    }
                    AbstractRunnableC2612i abstractRunnableC2612i3 = (AbstractRunnableC2612i) executorC2606c.f8301i.m4397d();
                    return abstractRunnableC2612i3 == null ? m4557i(1) : abstractRunnableC2612i3;
                }
            } while (!ExecutorC2606c.f8293l.compareAndSet(executorC2606c, j5, j5 - 4398046511104L));
            this.f8280f = enumC2605b2;
        }
        if (z5) {
            boolean z6 = m4552d(executorC2606c.f8296d * 2) == 0;
            if (z6 && (abstractRunnableC2612iM4553e2 = m4553e()) != null) {
                return abstractRunnableC2612iM4553e2;
            }
            c2616m.getClass();
            AbstractRunnableC2612i abstractRunnableC2612iM4565b = (AbstractRunnableC2612i) C2616m.f8318b.getAndSet(c2616m, null);
            if (abstractRunnableC2612iM4565b == null) {
                abstractRunnableC2612iM4565b = c2616m.m4565b();
            }
            if (abstractRunnableC2612iM4565b != null) {
                return abstractRunnableC2612iM4565b;
            }
            if (!z6 && (abstractRunnableC2612iM4553e = m4553e()) != null) {
                return abstractRunnableC2612iM4553e;
            }
        } else {
            AbstractRunnableC2612i abstractRunnableC2612iM4553e3 = m4553e();
            if (abstractRunnableC2612iM4553e3 != null) {
                return abstractRunnableC2612iM4553e3;
            }
        }
        return m4557i(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m4550b() {
        return this.indexInArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m4551c() {
        return this.nextParkedWorker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4552d(int i5) {
        int i6 = this.f8283i;
        int i7 = i6 ^ (i6 << 13);
        int i8 = i7 ^ (i7 >> 17);
        int i9 = i8 ^ (i8 << 5);
        this.f8283i = i9;
        int i10 = i5 - 1;
        return (i10 & i5) == 0 ? i9 & i10 : (i9 & Integer.MAX_VALUE) % i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC2612i m4553e() {
        int iM4552d = m4552d(2);
        ExecutorC2606c executorC2606c = this.f8285k;
        if (iM4552d == 0) {
            AbstractRunnableC2612i abstractRunnableC2612i = (AbstractRunnableC2612i) executorC2606c.f8300h.m4397d();
            return abstractRunnableC2612i != null ? abstractRunnableC2612i : (AbstractRunnableC2612i) executorC2606c.f8301i.m4397d();
        }
        AbstractRunnableC2612i abstractRunnableC2612i2 = (AbstractRunnableC2612i) executorC2606c.f8301i.m4397d();
        return abstractRunnableC2612i2 != null ? abstractRunnableC2612i2 : (AbstractRunnableC2612i) executorC2606c.f8300h.m4397d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4554f(int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8285k.f8299g);
        sb.append("-worker-");
        sb.append(i5 == 0 ? "TERMINATED" : String.valueOf(i5));
        setName(sb.toString());
        this.indexInArray = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4555g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4556h(EnumC2605b enumC2605b) {
        EnumC2605b enumC2605b2 = this.f8280f;
        boolean z5 = enumC2605b2 == EnumC2605b.f8286d;
        if (z5) {
            ExecutorC2606c.f8293l.addAndGet(this.f8285k, 4398046511104L);
        }
        if (enumC2605b2 != enumC2605b) {
            this.f8280f = enumC2605b;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    public final AbstractRunnableC2612i m4557i(int i5) {
        long j5;
        AbstractRunnableC2612i abstractRunnableC2612iM4566c;
        long j6;
        long j7;
        AbstractRunnableC2612i abstractRunnableC2612i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2606c.f8293l;
        ExecutorC2606c executorC2606c = this.f8285k;
        int i6 = (int) (atomicLongFieldUpdater.get(executorC2606c) & 2097151);
        AbstractRunnableC2612i abstractRunnableC2612i2 = null;
        if (i6 < 2) {
            return null;
        }
        int iM4552d = m4552d(i6);
        int i7 = 0;
        long jMin = Long.MAX_VALUE;
        while (i7 < i6) {
            iM4552d++;
            if (iM4552d > i6) {
                iM4552d = 1;
            }
            C2604a c2604a = (C2604a) executorC2606c.f8302j.m4403b(iM4552d);
            if (c2604a != null && c2604a != this) {
                C2616m c2616m = c2604a.f8278d;
                if (i5 != 3) {
                    c2616m.getClass();
                    int i8 = C2616m.f8320d.get(c2616m);
                    int i9 = C2616m.f8319c.get(c2616m);
                    boolean z5 = i5 == 1;
                    while (true) {
                        if (i8 == i9) {
                            j5 = 0;
                            break;
                        }
                        j5 = 0;
                        if (!z5 || C2616m.f8321e.get(c2616m) != 0) {
                            int i10 = i8 + 1;
                            abstractRunnableC2612iM4566c = c2616m.m4566c(i8, z5);
                            if (abstractRunnableC2612iM4566c != null) {
                                break;
                            }
                            i8 = i10;
                        } else {
                            break;
                        }
                    }
                } else {
                    abstractRunnableC2612iM4566c = c2616m.m4565b();
                    j5 = 0;
                }
                C1675t c1675t = this.f8279e;
                if (abstractRunnableC2612iM4566c != null) {
                    c1675t.f5710e = abstractRunnableC2612iM4566c;
                    abstractRunnableC2612i = abstractRunnableC2612i2;
                    j7 = -1;
                    j6 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2616m.f8318b;
                        AbstractRunnableC2612i abstractRunnableC2612i3 = (AbstractRunnableC2612i) atomicReferenceFieldUpdater.get(c2616m);
                        if (abstractRunnableC2612i3 == null) {
                            j6 = -1;
                            break;
                        }
                        j6 = -1;
                        if (((abstractRunnableC2612i3.f8309e ? 1 : 2) & i5) == 0) {
                            break;
                        }
                        AbstractC2614k.f8316f.getClass();
                        C2616m c2616m2 = c2616m;
                        long jNanoTime = System.nanoTime() - abstractRunnableC2612i3.f8308d;
                        long j8 = AbstractC2614k.f8312b;
                        if (jNanoTime < j8) {
                            j7 = j8 - jNanoTime;
                            abstractRunnableC2612i = null;
                            break;
                        }
                        do {
                            abstractRunnableC2612i = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(c2616m2, abstractRunnableC2612i3, null)) {
                                c1675t.f5710e = abstractRunnableC2612i3;
                                j7 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c2616m2) == abstractRunnableC2612i3);
                        c2616m = c2616m2;
                        abstractRunnableC2612i2 = null;
                    }
                }
                if (j7 == j6) {
                    AbstractRunnableC2612i abstractRunnableC2612i4 = (AbstractRunnableC2612i) c1675t.f5710e;
                    c1675t.f5710e = abstractRunnableC2612i;
                    return abstractRunnableC2612i4;
                }
                if (j7 > j5) {
                    jMin = Math.min(jMin, j7);
                }
            }
            i7++;
            abstractRunnableC2612i2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f8282h = jMin;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j5;
        loop0: while (true) {
            boolean z5 = false;
            while (ExecutorC2606c.f8294m.get(this.f8285k) == 0) {
                EnumC2605b enumC2605b = this.f8280f;
                EnumC2605b enumC2605b2 = EnumC2605b.f8290h;
                if (enumC2605b == enumC2605b2) {
                    break loop0;
                }
                AbstractRunnableC2612i abstractRunnableC2612iM4549a = m4549a(this.f8284j);
                if (abstractRunnableC2612iM4549a != null) {
                    this.f8282h = 0L;
                    ExecutorC2606c executorC2606c = this.f8285k;
                    this.f8281g = 0L;
                    if (this.f8280f == EnumC2605b.f8288f) {
                        this.f8280f = EnumC2605b.f8287e;
                    }
                    if (abstractRunnableC2612iM4549a.f8309e) {
                        if (m4556h(EnumC2605b.f8287e) && !executorC2606c.m4563j() && !executorC2606c.m4562h(ExecutorC2606c.f8293l.get(executorC2606c))) {
                            executorC2606c.m4563j();
                        }
                        try {
                            abstractRunnableC2612iM4549a.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        ExecutorC2606c.f8293l.addAndGet(executorC2606c, -2097152L);
                        if (this.f8280f != enumC2605b2) {
                            this.f8280f = EnumC2605b.f8289g;
                        }
                    } else {
                        try {
                            abstractRunnableC2612iM4549a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.f8284j = false;
                    if (this.f8282h == 0) {
                        Object obj = this.nextParkedWorker;
                        C1753n c1753n = ExecutorC2606c.f8295n;
                        if (obj != c1753n) {
                            f8277l.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC2606c.f8295n) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8277l;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC2606c executorC2606c2 = this.f8285k;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC2606c.f8294m;
                                    if (atomicIntegerFieldUpdater2.get(executorC2606c2) != 0) {
                                        break;
                                    }
                                    EnumC2605b enumC2605b3 = this.f8280f;
                                    EnumC2605b enumC2605b4 = EnumC2605b.f8290h;
                                    if (enumC2605b3 == enumC2605b4) {
                                        break;
                                    }
                                    m4556h(EnumC2605b.f8288f);
                                    Thread.interrupted();
                                    if (this.f8281g == 0) {
                                        j5 = 2097151;
                                        this.f8281g = System.nanoTime() + this.f8285k.f8298f;
                                    } else {
                                        j5 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f8285k.f8298f);
                                    if (System.nanoTime() - this.f8281g >= 0) {
                                        this.f8281g = 0L;
                                        ExecutorC2606c executorC2606c3 = this.f8285k;
                                        synchronized (executorC2606c3.f8302j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(executorC2606c3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2606c.f8293l;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC2606c3) & j5)) > executorC2606c3.f8296d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i5 = this.indexInArray;
                                                            m4554f(0);
                                                            executorC2606c3.m4561f(this, i5, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC2606c3) & j5);
                                                            if (andDecrement != i5) {
                                                                Object objM4403b = executorC2606c3.f8302j.m4403b(andDecrement);
                                                                AbstractC1665j.m2982b(objM4403b);
                                                                C2604a c2604a = (C2604a) objM4403b;
                                                                executorC2606c3.f8302j.m4404c(i5, c2604a);
                                                                c2604a.m4554f(i5);
                                                                executorC2606c3.m4561f(c2604a, andDecrement, i5);
                                                            }
                                                            executorC2606c3.f8302j.m4404c(andDecrement, null);
                                                            this.f8280f = enumC2605b4;
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
                        } else {
                            ExecutorC2606c executorC2606c4 = this.f8285k;
                            if (this.nextParkedWorker == c1753n) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC2606c.f8292k;
                                while (true) {
                                    long j6 = atomicLongFieldUpdater2.get(executorC2606c4);
                                    int i6 = this.indexInArray;
                                    this.nextParkedWorker = executorC2606c4.f8302j.m4403b((int) (j6 & 2097151));
                                    ExecutorC2606c executorC2606c5 = executorC2606c4;
                                    if (ExecutorC2606c.f8292k.compareAndSet(executorC2606c5, j6, ((j6 + 2097152) & (-2097152)) | ((long) i6))) {
                                        break;
                                    } else {
                                        executorC2606c4 = executorC2606c5;
                                    }
                                }
                            }
                        }
                    } else if (z5) {
                        m4556h(EnumC2605b.f8288f);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f8282h);
                        this.f8282h = 0L;
                    } else {
                        z5 = true;
                    }
                }
            }
            break loop0;
        }
        m4556h(EnumC2605b.f8290h);
    }
}
