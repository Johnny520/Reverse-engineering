package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(i20.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(i20.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater q = AtomicIntegerFieldUpdater.newUpdater(i20.class, "_isTerminated$volatile");
    public static final hh1 r = new hh1(19, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int h;
    public final int i;
    public final long j;
    public final String k;
    public final eq0 l;
    public final eq0 m;
    public final a92 n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i20(int i, int i2, long j, String str) {
        this.h = i;
        this.i = i2;
        this.j = j;
        this.k = str;
        if (i < 1) {
            s.c(hk1.g(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            s.c(vi0.h("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        if (i2 > 2097150) {
            s.c(hk1.g(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.l = new eq0();
        this.m = new eq0();
        this.n = new a92((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void e(i20 i20Var, Runnable runnable, int i) {
        i20Var.c(runnable, false, (i & 4) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        synchronized (this.n) {
            try {
                if (q.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = p;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.h) {
                    return 0;
                }
                if (i >= this.i) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.n.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                g20 g20Var = new g20(this, i3);
                this.n.c(i3, g20Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                g20Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Runnable runnable, boolean z, boolean z2) {
        fy2 gy2Var;
        h20 h20Var;
        jy2.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof fy2) {
            gy2Var = (fy2) runnable;
            gy2Var.h = jNanoTime;
            gy2Var.i = z;
        } else {
            gy2Var = new gy2(runnable, jNanoTime, z);
        }
        boolean z3 = gy2Var.i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = p;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        g20 g20Var = threadCurrentThread instanceof g20 ? (g20) threadCurrentThread : null;
        if (g20Var == null || g20Var.o != this) {
            g20Var = null;
        }
        if (g20Var != null && (h20Var = g20Var.j) != h20.l && (gy2Var.i || h20Var != h20.i)) {
            g20Var.n = true;
            zf3 zf3Var = g20Var.h;
            if (z2) {
                gy2Var = zf3Var.a(gy2Var);
            } else {
                zf3Var.getClass();
                fy2 fy2Var = (fy2) zf3.b.getAndSet(zf3Var, gy2Var);
                gy2Var = fy2Var == null ? null : zf3Var.a(fy2Var);
            }
        }
        if (gy2Var != null) {
            if (!(gy2Var.i ? this.m.a(gy2Var) : this.l.a(gy2Var))) {
                throw new RejectedExecutionException(hk1.j(new StringBuilder(), this.k, " was terminated"));
            }
        }
        if (z3) {
            if (j() || h(jAddAndGet)) {
                return;
            }
            j();
            return;
        }
        if (j() || h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        fy2 fy2VarA;
        if (q.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            g20 g20Var = threadCurrentThread instanceof g20 ? (g20) threadCurrentThread : null;
            if (g20Var == null || g20Var.o != this) {
                g20Var = null;
            }
            synchronized (this.n) {
                i = (int) (p.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.n.b(i2);
                    objB.getClass();
                    g20 g20Var2 = (g20) objB;
                    if (g20Var2 != g20Var) {
                        while (g20Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(g20Var2);
                            g20Var2.join(10000L);
                        }
                        zf3 zf3Var = g20Var2.h;
                        eq0 eq0Var = this.m;
                        zf3Var.getClass();
                        fy2 fy2Var = (fy2) zf3.b.getAndSet(zf3Var, null);
                        if (fy2Var != null) {
                            eq0Var.a(fy2Var);
                        }
                        while (true) {
                            fy2 fy2VarB = zf3Var.b();
                            if (fy2VarB == null) {
                                break;
                            } else {
                                eq0Var.a(fy2VarB);
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
            this.m.b();
            this.l.b();
            while (true) {
                if (g20Var == null) {
                    fy2VarA = (fy2) this.l.d();
                    if (fy2VarA == null && (fy2VarA = (fy2) this.m.d()) == null) {
                        break;
                    }
                } else {
                    fy2VarA = g20Var.a(true);
                    if (fy2VarA == null) {
                    }
                }
                try {
                    fy2VarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (g20Var != null) {
                g20Var.h(h20.l);
            }
            o.set(this, 0L);
            p.set(this, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(g20 g20Var, int i, int i2) {
        while (true) {
            long j = o.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = g20Var.c();
                    while (true) {
                        if (objC == r) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        g20 g20Var2 = (g20) objC;
                        int iB = g20Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = g20Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                i20 i20Var = this;
                if (o.compareAndSet(i20Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = i20Var;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.h;
        if (i < i2) {
            int iB = b();
            if (iB == 1 && i2 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j() {
        i20 i20Var;
        hh1 hh1Var;
        int iB;
        while (true) {
            long j = o.get(this);
            g20 g20Var = (g20) this.n.b((int) (2097151 & j));
            if (g20Var == null) {
                g20Var = null;
                i20Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = g20Var.c();
                while (true) {
                    hh1Var = r;
                    if (objC == hh1Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    g20 g20Var2 = (g20) objC;
                    iB = g20Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = g20Var2.c();
                    j = j;
                }
                if (iB >= 0) {
                    i20 i20Var2 = this;
                    boolean zCompareAndSet = o.compareAndSet(i20Var2, j, ((long) iB) | j2);
                    i20Var = i20Var2;
                    if (zCompareAndSet) {
                        g20Var.g(hh1Var);
                    }
                    this = i20Var;
                } else {
                    continue;
                }
            }
            if (g20Var == null) {
                return false;
            }
            if (g20.p.compareAndSet(g20Var, -1, 0)) {
                LockSupport.unpark(g20Var);
                return true;
            }
            this = i20Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 100 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 98 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 99 */
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        a92 a92Var = this.n;
        int iA = a92Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            g20 g20Var = (g20) a92Var.b(i6);
            if (g20Var != null) {
                zf3 zf3Var = g20Var.h;
                zf3Var.getClass();
                int i7 = zf3.b.get(zf3Var) != null ? (zf3.c.get(zf3Var) - zf3.d.get(zf3Var)) + 1 : zf3.c.get(zf3Var) - zf3.d.get(zf3Var);
                int iOrdinal = g20Var.j.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        c80.s();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = p.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.k);
        sb4.append('@');
        sb4.append(p40.x(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.h;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.i);
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
        sb4.append(this.l.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.m.c());
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
