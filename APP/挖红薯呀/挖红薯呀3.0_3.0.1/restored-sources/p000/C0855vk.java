package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: vk */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0855vk extends Thread {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6728l = AtomicIntegerFieldUpdater.newUpdater(C0855vk.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: d */
    public final qe1 f6729d;

    /* JADX INFO: renamed from: e */
    public final zt0 f6730e;

    /* JADX INFO: renamed from: f */
    public EnumC0892wk f6731f;

    /* JADX INFO: renamed from: g */
    public long f6732g;

    /* JADX INFO: renamed from: h */
    public long f6733h;

    /* JADX INFO: renamed from: i */
    public int f6734i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j */
    public boolean f6735j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ExecutorC0929xk f6736k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0855vk(ExecutorC0929xk executorC0929xk, int i) {
        this.f6736k = executorC0929xk;
        setDaemon(true);
        setContextClassLoader(ExecutorC0929xk.class.getClassLoader());
        this.f6729d = new qe1();
        this.f6730e = new zt0();
        this.f6731f = EnumC0892wk.f7141g;
        this.nextParkedWorker = ExecutorC0929xk.f7357n;
        int iNanoTime = (int) System.nanoTime();
        this.f6734i = iNanoTime == 0 ? 42 : iNanoTime;
        m4755f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final o61 m4750a(boolean z) {
        o61 o61VarM4754e;
        o61 o61VarM4754e2;
        long j;
        EnumC0892wk enumC0892wk = this.f6731f;
        ExecutorC0929xk executorC0929xk = this.f6736k;
        qe1 qe1Var = this.f6729d;
        EnumC0892wk enumC0892wk2 = EnumC0892wk.f7138d;
        if (enumC0892wk != enumC0892wk2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0929xk.f7355l;
            do {
                j = atomicLongFieldUpdater.get(executorC0929xk);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    o61 o61VarM3239g = qe1Var.m3239g();
                    return (o61VarM3239g == null && (o61VarM3239g = (o61) executorC0929xk.f7363i.m1575d()) == null) ? m4758i(1) : o61VarM3239g;
                }
            } while (!ExecutorC0929xk.f7355l.compareAndSet(executorC0929xk, j, j - 4398046511104L));
            this.f6731f = enumC0892wk2;
        }
        if (z) {
            boolean z2 = m4753d(executorC0929xk.f7358d * 2) == 0;
            if (z2 && (o61VarM4754e2 = m4754e()) != null) {
                return o61VarM4754e2;
            }
            o61 o61VarM3237e = qe1Var.m3237e();
            if (o61VarM3237e != null) {
                return o61VarM3237e;
            }
            if (!z2 && (o61VarM4754e = m4754e()) != null) {
                return o61VarM4754e;
            }
        } else {
            o61 o61VarM4754e3 = m4754e();
            if (o61VarM4754e3 != null) {
                return o61VarM4754e3;
            }
        }
        return m4758i(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m4751b() {
        return this.indexInArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m4752c() {
        return this.nextParkedWorker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4753d(int i) {
        int i2 = this.f6734i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f6734i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final o61 m4754e() {
        int iM4753d = m4753d(2);
        ExecutorC0929xk executorC0929xk = this.f6736k;
        C0594ox c0594ox = executorC0929xk.f7363i;
        C0594ox c0594ox2 = executorC0929xk.f7362h;
        if (iM4753d == 0) {
            o61 o61Var = (o61) c0594ox2.m1575d();
            return o61Var != null ? o61Var : (o61) c0594ox.m1575d();
        }
        o61 o61Var2 = (o61) c0594ox.m1575d();
        return o61Var2 != null ? o61Var2 : (o61) c0594ox2.m1575d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4755f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6736k.f7361g);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4756g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4757h(EnumC0892wk enumC0892wk) {
        EnumC0892wk enumC0892wk2 = this.f6731f;
        boolean z = enumC0892wk2 == EnumC0892wk.f7138d;
        if (z) {
            ExecutorC0929xk.f7355l.addAndGet(this.f6736k, 4398046511104L);
        }
        if (enumC0892wk2 != enumC0892wk) {
            this.f6731f = enumC0892wk;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final o61 m4758i(int i) {
        o61 o61VarM3240h;
        long jM3241i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0929xk.f7355l;
        ExecutorC0929xk executorC0929xk = this.f6736k;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC0929xk) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM4753d = m4753d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM4753d++;
            if (iM4753d > i2) {
                iM4753d = 1;
            }
            C0855vk c0855vk = (C0855vk) executorC0929xk.f7364j.m4357b(iM4753d);
            if (c0855vk != null && c0855vk != this) {
                qe1 qe1Var = c0855vk.f6729d;
                if (i == 3) {
                    o61VarM3240h = qe1Var.m3238f();
                } else {
                    qe1Var.getClass();
                    int i4 = qe1.f5134d.get(qe1Var);
                    int i5 = qe1.f5133c.get(qe1Var);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || qe1.f5135e.get(qe1Var) != 0)) {
                        int i6 = i4 + 1;
                        o61VarM3240h = qe1Var.m3240h(i4, z);
                        if (o61VarM3240h != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    o61VarM3240h = null;
                }
                zt0 zt0Var = this.f6730e;
                if (o61VarM3240h != null) {
                    zt0Var.f7995d = o61VarM3240h;
                    jM3241i = -1;
                } else {
                    jM3241i = qe1Var.m3241i(i, zt0Var);
                }
                if (jM3241i == -1) {
                    o61 o61Var = (o61) zt0Var.f7995d;
                    zt0Var.f7995d = null;
                    return o61Var;
                }
                if (jM3241i > 0) {
                    jMin = Math.min(jMin, jM3241i);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f6733h = jMin;
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
        long j;
        loop0: while (true) {
            boolean z = false;
            while (ExecutorC0929xk.f7356m.get(this.f6736k) == 0) {
                EnumC0892wk enumC0892wk = this.f6731f;
                EnumC0892wk enumC0892wk2 = EnumC0892wk.f7142h;
                if (enumC0892wk == enumC0892wk2) {
                    break loop0;
                }
                o61 o61VarM4750a = m4750a(this.f6735j);
                if (o61VarM4750a != null) {
                    this.f6733h = 0L;
                    ExecutorC0929xk executorC0929xk = this.f6736k;
                    this.f6732g = 0L;
                    if (this.f6731f == EnumC0892wk.f7140f) {
                        this.f6731f = EnumC0892wk.f7139e;
                    }
                    if (o61VarM4750a.f4470e) {
                        if (m4757h(EnumC0892wk.f7139e) && !executorC0929xk.m5142f() && !executorC0929xk.m5141e(ExecutorC0929xk.f7355l.get(executorC0929xk))) {
                            executorC0929xk.m5142f();
                        }
                        try {
                            o61VarM4750a.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        ExecutorC0929xk.f7355l.addAndGet(executorC0929xk, -2097152L);
                        if (this.f6731f != enumC0892wk2) {
                            this.f6731f = EnumC0892wk.f7141g;
                        }
                    } else {
                        try {
                            o61VarM4750a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.f6735j = false;
                    if (this.f6733h == 0) {
                        Object obj = this.nextParkedWorker;
                        C1014zr c1014zr = ExecutorC0929xk.f7357n;
                        if (obj != c1014zr) {
                            f6728l.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC0929xk.f7357n) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6728l;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC0929xk executorC0929xk2 = this.f6736k;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC0929xk.f7356m;
                                    if (atomicIntegerFieldUpdater2.get(executorC0929xk2) != 0) {
                                        break;
                                    }
                                    EnumC0892wk enumC0892wk3 = this.f6731f;
                                    EnumC0892wk enumC0892wk4 = EnumC0892wk.f7142h;
                                    if (enumC0892wk3 == enumC0892wk4) {
                                        break;
                                    }
                                    m4757h(EnumC0892wk.f7140f);
                                    Thread.interrupted();
                                    if (this.f6732g == 0) {
                                        j = 2097151;
                                        this.f6732g = System.nanoTime() + this.f6736k.f7360f;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f6736k.f7360f);
                                    if (System.nanoTime() - this.f6732g >= 0) {
                                        this.f6732g = 0L;
                                        ExecutorC0929xk executorC0929xk3 = this.f6736k;
                                        synchronized (executorC0929xk3.f7364j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(executorC0929xk3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0929xk.f7355l;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC0929xk3) & j)) > executorC0929xk3.f7358d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            m4755f(0);
                                                            executorC0929xk3.m5140d(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0929xk3) & j);
                                                            if (andDecrement != i) {
                                                                Object objM4357b = executorC0929xk3.f7364j.m4357b(andDecrement);
                                                                objM4357b.getClass();
                                                                C0855vk c0855vk = (C0855vk) objM4357b;
                                                                executorC0929xk3.f7364j.m4358c(i, c0855vk);
                                                                c0855vk.m4755f(i);
                                                                executorC0929xk3.m5140d(c0855vk, andDecrement, i);
                                                            }
                                                            executorC0929xk3.f7364j.m4358c(andDecrement, null);
                                                            this.f6731f = enumC0892wk4;
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
                            ExecutorC0929xk executorC0929xk4 = this.f6736k;
                            if (this.nextParkedWorker == c1014zr) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0929xk.f7354k;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(executorC0929xk4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = executorC0929xk4.f7364j.m4357b((int) (j2 & 2097151));
                                    ExecutorC0929xk executorC0929xk5 = executorC0929xk4;
                                    if (ExecutorC0929xk.f7354k.compareAndSet(executorC0929xk5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        executorC0929xk4 = executorC0929xk5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        m4757h(EnumC0892wk.f7140f);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f6733h);
                        this.f6733h = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        m4757h(EnumC0892wk.f7142h);
    }
}
