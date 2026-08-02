package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g20 extends Thread {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3257p = AtomicIntegerFieldUpdater.newUpdater(g20.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: h */
    public final zf3 f3258h;

    /* JADX INFO: renamed from: i */
    public final o72 f3259i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j */
    public h20 f3260j;

    /* JADX INFO: renamed from: k */
    public long f3261k;

    /* JADX INFO: renamed from: l */
    public long f3262l;

    /* JADX INFO: renamed from: m */
    public int f3263m;

    /* JADX INFO: renamed from: n */
    public boolean f3264n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ i20 f3265o;
    private volatile /* synthetic */ int workerCtl$volatile;

    public g20(i20 i20Var, int i) {
        this.f3265o = i20Var;
        setDaemon(true);
        setContextClassLoader(i20.class.getClassLoader());
        this.f3258h = new zf3();
        this.f3259i = new o72();
        this.f3260j = h20.f3791k;
        this.nextParkedWorker = i20.f4234r;
        int iNanoTime = (int) System.nanoTime();
        this.f3263m = iNanoTime == 0 ? 42 : iNanoTime;
        m1784f(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = p000.zf3.f13882d.get(r9);
        r0 = p000.zf3.f13881c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p000.zf3.f13883e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.m6414c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fy2 m1779a(boolean z) {
        fy2 fy2VarM1783e;
        fy2 fy2VarM1783e2;
        long j;
        h20 h20Var = this.f3260j;
        i20 i20Var = this.f3265o;
        fy2 fy2Var = null;
        zf3 zf3Var = this.f3258h;
        h20 h20Var2 = h20.f3788h;
        if (h20Var != h20Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i20.f4232p;
            do {
                j = atomicLongFieldUpdater.get(i20Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    zf3Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zf3.f13880b;
                        fy2 fy2Var2 = (fy2) atomicReferenceFieldUpdater.get(zf3Var);
                        if (fy2Var2 == null || !fy2Var2.f3198i) {
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
                    fy2 fy2Var3 = (fy2) i20Var.f4240m.m3850d();
                    return fy2Var3 == null ? m1787i(1) : fy2Var3;
                }
            } while (!i20.f4232p.compareAndSet(i20Var, j, j - 4398046511104L));
            this.f3260j = h20Var2;
        }
        if (z) {
            boolean z2 = m1782d(i20Var.f4235h * 2) == 0;
            if (z2 && (fy2VarM1783e2 = m1783e()) != null) {
                return fy2VarM1783e2;
            }
            zf3Var.getClass();
            fy2 fy2VarM6413b = (fy2) zf3.f13880b.getAndSet(zf3Var, null);
            if (fy2VarM6413b == null) {
                fy2VarM6413b = zf3Var.m6413b();
            }
            if (fy2VarM6413b != null) {
                return fy2VarM6413b;
            }
            if (!z2 && (fy2VarM1783e = m1783e()) != null) {
                return fy2VarM1783e;
            }
        } else {
            fy2 fy2VarM1783e3 = m1783e();
            if (fy2VarM1783e3 != null) {
                return fy2VarM1783e3;
            }
        }
        return m1787i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m1780b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1781c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m1782d(int i) {
        int i2 = this.f3263m;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f3263m = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: e */
    public final fy2 m1783e() {
        int iM1782d = m1782d(2);
        i20 i20Var = this.f3265o;
        eq0 eq0Var = i20Var.f4240m;
        eq0 eq0Var2 = i20Var.f4239l;
        if (iM1782d == 0) {
            fy2 fy2Var = (fy2) eq0Var2.m3850d();
            return fy2Var != null ? fy2Var : (fy2) eq0Var.m3850d();
        }
        fy2 fy2Var2 = (fy2) eq0Var.m3850d();
        return fy2Var2 != null ? fy2Var2 : (fy2) eq0Var2.m3850d();
    }

    /* JADX INFO: renamed from: f */
    public final void m1784f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3265o.f4238k);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m1785g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1786h(h20 h20Var) {
        h20 h20Var2 = this.f3260j;
        boolean z = h20Var2 == h20.f3788h;
        if (z) {
            i20.f4232p.addAndGet(this.f3265o, 4398046511104L);
        }
        if (h20Var2 != h20Var) {
            this.f3260j = h20Var;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fy2 m1787i(int i) {
        long j;
        fy2 fy2VarM6413b;
        long j2;
        long j3;
        fy2 fy2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i20.f4232p;
        i20 i20Var = this.f3265o;
        int i2 = (int) (atomicLongFieldUpdater.get(i20Var) & 2097151);
        fy2 fy2Var2 = null;
        if (i2 < 2) {
            return null;
        }
        int iM1782d = m1782d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iM1782d++;
            if (iM1782d > i2) {
                iM1782d = 1;
            }
            g20 g20Var = (g20) i20Var.f4241n.m115b(iM1782d);
            if (g20Var != null && g20Var != this) {
                zf3 zf3Var = g20Var.f3258h;
                zf3Var.getClass();
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = zf3.f13882d.get(zf3Var);
                    int i5 = zf3.f13881c.get(zf3Var);
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || zf3.f13883e.get(zf3Var) != 0) {
                            int i6 = i4 + 1;
                            fy2 fy2VarM6414c = zf3Var.m6414c(i4, z);
                            if (fy2VarM6414c != null) {
                                fy2VarM6413b = fy2VarM6414c;
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                } else {
                    fy2VarM6413b = zf3Var.m6413b();
                    j = 0;
                }
                o72 o72Var = this.f3259i;
                if (fy2VarM6413b != null) {
                    o72Var.f7574i = fy2VarM6413b;
                    fy2Var = fy2Var2;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zf3.f13880b;
                        fy2 fy2Var3 = (fy2) atomicReferenceFieldUpdater.get(zf3Var);
                        if (fy2Var3 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((fy2Var3.f3198i ? 1 : 2) & i) == 0) {
                            break;
                        }
                        jy2.f5282f.getClass();
                        zf3 zf3Var2 = zf3Var;
                        long jNanoTime = System.nanoTime() - fy2Var3.f3197h;
                        long j4 = jy2.f5278b;
                        if (jNanoTime < j4) {
                            j3 = j4 - jNanoTime;
                            fy2Var = null;
                            break;
                        }
                        do {
                            fy2Var = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(zf3Var2, fy2Var3, null)) {
                                o72Var.f7574i = fy2Var3;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(zf3Var2) == fy2Var3);
                        zf3Var = zf3Var2;
                        fy2Var2 = null;
                    }
                }
                if (j3 == j2) {
                    fy2 fy2Var4 = (fy2) o72Var.f7574i;
                    o72Var.f7574i = fy2Var;
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
        this.f3262l = jMin;
        return null;
    }

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
            while (i20.f4233q.get(this.f3265o) != 1) {
                h20 h20Var = this.f3260j;
                h20 h20Var2 = h20.f3792l;
                if (h20Var == h20Var2) {
                    break loop0;
                }
                fy2 fy2VarM1779a = m1779a(this.f3264n);
                if (fy2VarM1779a != null) {
                    this.f3262l = 0L;
                    i20 i20Var = this.f3265o;
                    this.f3261k = 0L;
                    if (this.f3260j == h20.f3790j) {
                        this.f3260j = h20.f3789i;
                    }
                    if (fy2VarM1779a.f3198i) {
                        if (m1786h(h20.f3789i) && !i20Var.m2253j() && !i20Var.m2252h(i20.f4232p.get(i20Var))) {
                            i20Var.m2253j();
                        }
                        try {
                            fy2VarM1779a.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        i20.f4232p.addAndGet(i20Var, -2097152L);
                        if (this.f3260j != h20Var2) {
                            this.f3260j = h20.f3791k;
                        }
                    } else {
                        try {
                            fy2VarM1779a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.f3264n = false;
                    if (this.f3262l == 0) {
                        Object obj = this.nextParkedWorker;
                        hh1 hh1Var = i20.f4234r;
                        if (obj != hh1Var) {
                            f3257p.set(this, -1);
                            while (this.nextParkedWorker != i20.f4234r) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3257p;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    i20 i20Var2 = this.f3265o;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = i20.f4233q;
                                    if (atomicIntegerFieldUpdater2.get(i20Var2) == 1) {
                                        break;
                                    }
                                    h20 h20Var3 = this.f3260j;
                                    h20 h20Var4 = h20.f3792l;
                                    if (h20Var3 == h20Var4) {
                                        break;
                                    }
                                    m1786h(h20.f3790j);
                                    Thread.interrupted();
                                    if (this.f3261k == 0) {
                                        j = 2097151;
                                        this.f3261k = System.nanoTime() + this.f3265o.f4237j;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f3265o.f4237j);
                                    if (System.nanoTime() - this.f3261k >= 0) {
                                        this.f3261k = 0L;
                                        i20 i20Var3 = this.f3265o;
                                        synchronized (i20Var3.f4241n) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(i20Var3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = i20.f4232p;
                                                    if (((int) (atomicLongFieldUpdater.get(i20Var3) & j)) > i20Var3.f4235h && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        m1784f(0);
                                                        i20Var3.m2251g(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(i20Var3) & j);
                                                        if (andDecrement != i) {
                                                            Object objM115b = i20Var3.f4241n.m115b(andDecrement);
                                                            objM115b.getClass();
                                                            g20 g20Var = (g20) objM115b;
                                                            i20Var3.f4241n.m116c(i, g20Var);
                                                            g20Var.m1784f(i);
                                                            i20Var3.m2251g(g20Var, andDecrement, i);
                                                        }
                                                        i20Var3.f4241n.m116c(andDecrement, null);
                                                        this.f3260j = h20Var4;
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
                            i20 i20Var4 = this.f3265o;
                            if (this.nextParkedWorker == hh1Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = i20.f4231o;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(i20Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = i20Var4.f4241n.m115b((int) (j2 & 2097151));
                                    i20 i20Var5 = i20Var4;
                                    if (i20.f4231o.compareAndSet(i20Var5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        i20Var4 = i20Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        m1786h(h20.f3790j);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f3262l);
                        this.f3262l = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        m1786h(h20.f3792l);
    }
}
