package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g20 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(g20.class, "workerCtl$volatile");
    public final zf3 h;
    public final o72 i;
    private volatile int indexInArray;
    public h20 j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    private volatile Object nextParkedWorker;
    public final /* synthetic */ i20 o;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g20(i20 i20Var, int i) {
        this.o = i20Var;
        setDaemon(true);
        setContextClassLoader(i20.class.getClassLoader());
        this.h = new zf3();
        this.i = new o72();
        this.j = h20.k;
        this.nextParkedWorker = i20.r;
        int iNanoTime = (int) System.nanoTime();
        this.m = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = defpackage.zf3.d.get(r9);
        r0 = defpackage.zf3.c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (defpackage.zf3.e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fy2 a(boolean z) {
        fy2 fy2VarE;
        fy2 fy2VarE2;
        long j;
        h20 h20Var = this.j;
        i20 i20Var = this.o;
        fy2 fy2Var = null;
        zf3 zf3Var = this.h;
        h20 h20Var2 = h20.h;
        if (h20Var != h20Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i20.p;
            do {
                j = atomicLongFieldUpdater.get(i20Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    zf3Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zf3.b;
                        fy2 fy2Var2 = (fy2) atomicReferenceFieldUpdater.get(zf3Var);
                        if (fy2Var2 == null || !fy2Var2.i) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(zf3Var, fy2Var2, null)) {
                            if (atomicReferenceFieldUpdater.get(zf3Var) != fy2Var2) {
                                break;
                            }
                        }
                        fy2Var = fy2Var2;
                        break loop1;
                    }
                    if (fy2Var != null) {
                        return fy2Var;
                    }
                    fy2 fy2Var3 = (fy2) i20Var.m.d();
                    return fy2Var3 == null ? i(1) : fy2Var3;
                }
            } while (!i20.p.compareAndSet(i20Var, j, j - 4398046511104L));
            this.j = h20Var2;
        }
        if (z) {
            boolean z2 = d(i20Var.h * 2) == 0;
            if (z2 && (fy2VarE2 = e()) != null) {
                return fy2VarE2;
            }
            zf3Var.getClass();
            fy2 fy2VarB = (fy2) zf3.b.getAndSet(zf3Var, null);
            if (fy2VarB == null) {
                fy2VarB = zf3Var.b();
            }
            if (fy2VarB != null) {
                return fy2VarB;
            }
            if (!z2 && (fy2VarE = e()) != null) {
                return fy2VarE;
            }
        } else {
            fy2 fy2VarE3 = e();
            if (fy2VarE3 != null) {
                return fy2VarE3;
            }
        }
        return i(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return this.indexInArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c() {
        return this.nextParkedWorker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(int i) {
        int i2 = this.m;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.m = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fy2 e() {
        int iD = d(2);
        i20 i20Var = this.o;
        eq0 eq0Var = i20Var.m;
        eq0 eq0Var2 = i20Var.l;
        if (iD == 0) {
            fy2 fy2Var = (fy2) eq0Var2.d();
            return fy2Var != null ? fy2Var : (fy2) eq0Var.d();
        }
        fy2 fy2Var2 = (fy2) eq0Var.d();
        return fy2Var2 != null ? fy2Var2 : (fy2) eq0Var2.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.o.k);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(h20 h20Var) {
        h20 h20Var2 = this.j;
        boolean z = h20Var2 == h20.h;
        if (z) {
            i20.p.addAndGet(this.o, 4398046511104L);
        }
        if (h20Var2 != h20Var) {
            this.j = h20Var;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fy2 i(int i) {
        long j;
        fy2 fy2VarB;
        long j2;
        long j3;
        fy2 fy2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i20.p;
        i20 i20Var = this.o;
        int i2 = (int) (atomicLongFieldUpdater.get(i20Var) & 2097151);
        fy2 fy2Var2 = null;
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            g20 g20Var = (g20) i20Var.n.b(iD);
            if (g20Var != null && g20Var != this) {
                zf3 zf3Var = g20Var.h;
                zf3Var.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = zf3.d.get(zf3Var);
                    int i5 = zf3.c.get(zf3Var);
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || zf3.e.get(zf3Var) != 0) {
                            int i6 = i4 + 1;
                            fy2 fy2VarC = zf3Var.c(i4, z);
                            if (fy2VarC != null) {
                                fy2VarB = fy2VarC;
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                } else {
                    fy2VarB = zf3Var.b();
                    j = 0;
                }
                o72 o72Var = this.i;
                if (fy2VarB != null) {
                    o72Var.i = fy2VarB;
                    fy2Var = fy2Var2;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zf3.b;
                        fy2 fy2Var3 = (fy2) atomicReferenceFieldUpdater.get(zf3Var);
                        if (fy2Var3 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((fy2Var3.i ? 1 : 2) & i) == 0) {
                            break;
                        }
                        jy2.f.getClass();
                        zf3 zf3Var2 = zf3Var;
                        long jNanoTime = System.nanoTime() - fy2Var3.h;
                        long j4 = jy2.b;
                        if (jNanoTime < j4) {
                            j3 = j4 - jNanoTime;
                            fy2Var = null;
                            break;
                        }
                        do {
                            fy2Var = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(zf3Var2, fy2Var3, null)) {
                                o72Var.i = fy2Var3;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(zf3Var2) == fy2Var3);
                        zf3Var = zf3Var2;
                        fy2Var2 = null;
                    }
                }
                if (j3 == j2) {
                    fy2 fy2Var4 = (fy2) o72Var.i;
                    o72Var.i = fy2Var;
                    return fy2Var4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            fy2Var2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.l = jMin;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
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
            while (i20.q.get(this.o) != 1) {
                h20 h20Var = this.j;
                h20 h20Var2 = h20.l;
                if (h20Var == h20Var2) {
                    break loop0;
                }
                fy2 fy2VarA = a(this.n);
                if (fy2VarA != null) {
                    this.l = 0L;
                    i20 i20Var = this.o;
                    this.k = 0L;
                    if (this.j == h20.j) {
                        this.j = h20.i;
                    }
                    if (fy2VarA.i) {
                        if (h(h20.i) && !i20Var.j() && !i20Var.h(i20.p.get(i20Var))) {
                            i20Var.j();
                        }
                        try {
                            fy2VarA.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        i20.p.addAndGet(i20Var, -2097152L);
                        if (this.j != h20Var2) {
                            this.j = h20.k;
                        }
                    } else {
                        try {
                            fy2VarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.n = false;
                    if (this.l == 0) {
                        Object obj = this.nextParkedWorker;
                        hh1 hh1Var = i20.r;
                        if (obj != hh1Var) {
                            p.set(this, -1);
                            while (this.nextParkedWorker != i20.r) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    i20 i20Var2 = this.o;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = i20.q;
                                    if (atomicIntegerFieldUpdater2.get(i20Var2) == 1) {
                                        break;
                                    }
                                    h20 h20Var3 = this.j;
                                    h20 h20Var4 = h20.l;
                                    if (h20Var3 == h20Var4) {
                                        break;
                                    }
                                    h(h20.j);
                                    Thread.interrupted();
                                    if (this.k == 0) {
                                        j = 2097151;
                                        this.k = System.nanoTime() + this.o.j;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.o.j);
                                    if (System.nanoTime() - this.k >= 0) {
                                        this.k = 0L;
                                        i20 i20Var3 = this.o;
                                        synchronized (i20Var3.n) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(i20Var3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = i20.p;
                                                    if (((int) (atomicLongFieldUpdater.get(i20Var3) & j)) > i20Var3.h && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        i20Var3.g(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(i20Var3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = i20Var3.n.b(andDecrement);
                                                            objB.getClass();
                                                            g20 g20Var = (g20) objB;
                                                            i20Var3.n.c(i, g20Var);
                                                            g20Var.f(i);
                                                            i20Var3.g(g20Var, andDecrement, i);
                                                        }
                                                        i20Var3.n.c(andDecrement, null);
                                                        this.j = h20Var4;
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
                            i20 i20Var4 = this.o;
                            if (this.nextParkedWorker == hh1Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = i20.o;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(i20Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = i20Var4.n.b((int) (j2 & 2097151));
                                    i20 i20Var5 = i20Var4;
                                    if (i20.o.compareAndSet(i20Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        i20Var4 = i20Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(h20.j);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.l);
                        this.l = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(h20.l);
    }
}
