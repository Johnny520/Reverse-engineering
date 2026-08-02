package p000;

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

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicLongFieldUpdater f4231o = AtomicLongFieldUpdater.newUpdater(i20.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicLongFieldUpdater f4232p = AtomicLongFieldUpdater.newUpdater(i20.class, "controlState$volatile");

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4233q = AtomicIntegerFieldUpdater.newUpdater(i20.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: r */
    public static final hh1 f4234r = new hh1(19, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: h */
    public final int f4235h;

    /* JADX INFO: renamed from: i */
    public final int f4236i;

    /* JADX INFO: renamed from: j */
    public final long f4237j;

    /* JADX INFO: renamed from: k */
    public final String f4238k;

    /* JADX INFO: renamed from: l */
    public final eq0 f4239l;

    /* JADX INFO: renamed from: m */
    public final eq0 f4240m;

    /* JADX INFO: renamed from: n */
    public final a92 f4241n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public i20(int i, int i2, long j, String str) {
        this.f4235h = i;
        this.f4236i = i2;
        this.f4237j = j;
        this.f4238k = str;
        if (i < 1) {
            C0676s.m4645c(hk1.m2208g(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C0676s.m4645c(vi0.m5689h("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        if (i2 > 2097150) {
            C0676s.m4645c(hk1.m2208g(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f4239l = new eq0();
        this.f4240m = new eq0();
        this.f4241n = new a92((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2248e(i20 i20Var, Runnable runnable, int i) {
        i20Var.m2250c(runnable, false, (i & 4) == 0);
    }

    /* JADX INFO: renamed from: b */
    public final int m2249b() {
        synchronized (this.f4241n) {
            try {
                if (f4233q.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4232p;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f4235h) {
                    return 0;
                }
                if (i >= this.f4236i) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f4241n.m115b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                g20 g20Var = new g20(this, i3);
                this.f4241n.m116c(i3, g20Var);
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

    /* JADX INFO: renamed from: c */
    public final void m2250c(Runnable runnable, boolean z, boolean z2) {
        fy2 gy2Var;
        h20 h20Var;
        jy2.f5282f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof fy2) {
            gy2Var = (fy2) runnable;
            gy2Var.f3197h = jNanoTime;
            gy2Var.f3198i = z;
        } else {
            gy2Var = new gy2(runnable, jNanoTime, z);
        }
        boolean z3 = gy2Var.f3198i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4232p;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        g20 g20Var = threadCurrentThread instanceof g20 ? (g20) threadCurrentThread : null;
        if (g20Var == null || g20Var.f3265o != this) {
            g20Var = null;
        }
        if (g20Var != null && (h20Var = g20Var.f3260j) != h20.f3792l && (gy2Var.f3198i || h20Var != h20.f3789i)) {
            g20Var.f3264n = true;
            zf3 zf3Var = g20Var.f3258h;
            if (z2) {
                gy2Var = zf3Var.m6412a(gy2Var);
            } else {
                zf3Var.getClass();
                fy2 fy2Var = (fy2) zf3.f13880b.getAndSet(zf3Var, gy2Var);
                gy2Var = fy2Var == null ? null : zf3Var.m6412a(fy2Var);
            }
        }
        if (gy2Var != null) {
            if (!(gy2Var.f3198i ? this.f4240m.m3847a(gy2Var) : this.f4239l.m3847a(gy2Var))) {
                throw new RejectedExecutionException(hk1.m2211j(new StringBuilder(), this.f4238k, " was terminated"));
            }
        }
        if (z3) {
            if (m2253j() || m2252h(jAddAndGet)) {
                return;
            }
            m2253j();
            return;
        }
        if (m2253j() || m2252h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m2253j();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        fy2 fy2VarM1779a;
        if (f4233q.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            g20 g20Var = threadCurrentThread instanceof g20 ? (g20) threadCurrentThread : null;
            if (g20Var == null || g20Var.f3265o != this) {
                g20Var = null;
            }
            synchronized (this.f4241n) {
                i = (int) (f4232p.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM115b = this.f4241n.m115b(i2);
                    objM115b.getClass();
                    g20 g20Var2 = (g20) objM115b;
                    if (g20Var2 != g20Var) {
                        while (g20Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(g20Var2);
                            g20Var2.join(10000L);
                        }
                        zf3 zf3Var = g20Var2.f3258h;
                        eq0 eq0Var = this.f4240m;
                        zf3Var.getClass();
                        fy2 fy2Var = (fy2) zf3.f13880b.getAndSet(zf3Var, null);
                        if (fy2Var != null) {
                            eq0Var.m3847a(fy2Var);
                        }
                        while (true) {
                            fy2 fy2VarM6413b = zf3Var.m6413b();
                            if (fy2VarM6413b == null) {
                                break;
                            } else {
                                eq0Var.m3847a(fy2VarM6413b);
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
            this.f4240m.m3848b();
            this.f4239l.m3848b();
            while (true) {
                if (g20Var == null) {
                    fy2VarM1779a = (fy2) this.f4239l.m3850d();
                    if (fy2VarM1779a == null && (fy2VarM1779a = (fy2) this.f4240m.m3850d()) == null) {
                        break;
                    }
                } else {
                    fy2VarM1779a = g20Var.m1779a(true);
                    if (fy2VarM1779a == null) {
                    }
                }
                try {
                    fy2VarM1779a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (g20Var != null) {
                g20Var.m1786h(h20.f3792l);
            }
            f4231o.set(this, 0L);
            f4232p.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m2248e(this, runnable, 6);
    }

    /* JADX INFO: renamed from: g */
    public final void m2251g(g20 g20Var, int i, int i2) {
        while (true) {
            long j = f4231o.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM1781c = g20Var.m1781c();
                    while (true) {
                        if (objM1781c == f4234r) {
                            i3 = -1;
                            break;
                        }
                        if (objM1781c == null) {
                            i3 = 0;
                            break;
                        }
                        g20 g20Var2 = (g20) objM1781c;
                        int iM1780b = g20Var2.m1780b();
                        if (iM1780b != 0) {
                            i3 = iM1780b;
                            break;
                        }
                        objM1781c = g20Var2.m1781c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                i20 i20Var = this;
                if (f4231o.compareAndSet(i20Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = i20Var;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2252h(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f4235h;
        if (i < i2) {
            int iM2249b = m2249b();
            if (iM2249b == 1 && i2 > 1) {
                m2249b();
            }
            if (iM2249b > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2253j() {
        i20 i20Var;
        hh1 hh1Var;
        int iM1780b;
        while (true) {
            long j = f4231o.get(this);
            g20 g20Var = (g20) this.f4241n.m115b((int) (2097151 & j));
            if (g20Var == null) {
                g20Var = null;
                i20Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM1781c = g20Var.m1781c();
                while (true) {
                    hh1Var = f4234r;
                    if (objM1781c == hh1Var) {
                        iM1780b = -1;
                        break;
                    }
                    if (objM1781c == null) {
                        iM1780b = 0;
                        break;
                    }
                    g20 g20Var2 = (g20) objM1781c;
                    iM1780b = g20Var2.m1780b();
                    if (iM1780b != 0) {
                        break;
                    }
                    objM1781c = g20Var2.m1781c();
                    j = j;
                }
                if (iM1780b >= 0) {
                    i20 i20Var2 = this;
                    boolean zCompareAndSet = f4231o.compareAndSet(i20Var2, j, ((long) iM1780b) | j2);
                    i20Var = i20Var2;
                    if (zCompareAndSet) {
                        g20Var.m1785g(hh1Var);
                    }
                    this = i20Var;
                } else {
                    continue;
                }
            }
            if (g20Var == null) {
                return false;
            }
            if (g20.f3257p.compareAndSet(g20Var, -1, 0)) {
                LockSupport.unpark(g20Var);
                return true;
            }
            this = i20Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        a92 a92Var = this.f4241n;
        int iM114a = a92Var.m114a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM114a; i6++) {
            g20 g20Var = (g20) a92Var.m115b(i6);
            if (g20Var != null) {
                zf3 zf3Var = g20Var.f3258h;
                zf3Var.getClass();
                int i7 = zf3.f13880b.get(zf3Var) != null ? (zf3.f13881c.get(zf3Var) - zf3.f13882d.get(zf3Var)) + 1 : zf3.f13881c.get(zf3Var) - zf3.f13882d.get(zf3Var);
                int iOrdinal = g20Var.f3260j.ordinal();
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
                        c80.m675s();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f4232p.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f4238k);
        sb4.append('@');
        sb4.append(p40.m3740x(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f4235h;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f4236i);
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
        sb4.append(this.f4239l.m3849c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4240m.m3849c());
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
