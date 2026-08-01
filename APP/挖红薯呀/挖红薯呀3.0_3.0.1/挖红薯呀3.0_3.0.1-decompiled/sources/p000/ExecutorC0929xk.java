package p000;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: xk */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0929xk implements Executor, Closeable {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f7354k = AtomicLongFieldUpdater.newUpdater(ExecutorC0929xk.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater f7355l = AtomicLongFieldUpdater.newUpdater(ExecutorC0929xk.class, "controlState$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7356m = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0929xk.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: n */
    public static final C1014zr f7357n = new C1014zr("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final int f7358d;

    /* JADX INFO: renamed from: e */
    public final int f7359e;

    /* JADX INFO: renamed from: f */
    public final long f7360f;

    /* JADX INFO: renamed from: g */
    public final String f7361g;

    /* JADX INFO: renamed from: h */
    public final C0594ox f7362h;

    /* JADX INFO: renamed from: i */
    public final C0594ox f7363i;

    /* JADX INFO: renamed from: j */
    public final uu0 f7364j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExecutorC0929xk(int i, int i2, long j, String str) {
        this.f7358d = i;
        this.f7359e = i2;
        this.f7360f = j;
        this.f7361g = str;
        if (i < 1) {
            C0921xc.m5126g("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC0748t1.m4153k(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            C0921xc.m5126g("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f7362h = new C0594ox();
        this.f7363i = new C0594ox();
        this.f7364j = new uu0((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5137c(ExecutorC0929xk executorC0929xk, Runnable runnable, int i) {
        executorC0929xk.m5139b(runnable, false, (i & 4) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5138a() {
        synchronized (this.f7364j) {
            try {
                if (f7356m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7355l;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f7358d) {
                    return 0;
                }
                if (i >= this.f7359e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f7364j.m4357b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0855vk c0855vk = new C0855vk(this, i3);
                this.f7364j.m4358c(i3, c0855vk);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0855vk.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5139b(Runnable runnable, boolean z, boolean z2) {
        o61 p61Var;
        EnumC0892wk enumC0892wk;
        q61.f5077f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof o61) {
            p61Var = (o61) runnable;
            p61Var.f4469d = jNanoTime;
            p61Var.f4470e = z;
        } else {
            p61Var = new p61(runnable, jNanoTime, z);
        }
        boolean z3 = p61Var.f4470e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7355l;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0855vk c0855vk = null;
        C0855vk c0855vk2 = threadCurrentThread instanceof C0855vk ? (C0855vk) threadCurrentThread : null;
        if (c0855vk2 != null && c0855vk2.f6736k == this) {
            c0855vk = c0855vk2;
        }
        if (c0855vk != null && (enumC0892wk = c0855vk.f6731f) != EnumC0892wk.f7142h && (p61Var.f4470e || enumC0892wk != EnumC0892wk.f7139e)) {
            c0855vk.f6735j = true;
            p61Var = c0855vk.f6729d.m3233a(p61Var, z2);
        }
        if (p61Var != null) {
            if (!(p61Var.f4470e ? this.f7363i.m1572a(p61Var) : this.f7362h.m1572a(p61Var))) {
                throw new RejectedExecutionException(this.f7361g + " was terminated");
            }
        }
        boolean z4 = z2 && c0855vk != null;
        if (z3) {
            if (z4 || m5142f() || m5141e(jAddAndGet)) {
                return;
            }
            m5142f();
            return;
        }
        if (z4 || m5142f() || m5141e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m5142f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        o61 o61VarM4750a;
        if (f7356m.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0855vk c0855vk = null;
            C0855vk c0855vk2 = threadCurrentThread instanceof C0855vk ? (C0855vk) threadCurrentThread : null;
            if (c0855vk2 != null && c0855vk2.f6736k == this) {
                c0855vk = c0855vk2;
            }
            synchronized (this.f7364j) {
                i = (int) (f7355l.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM4357b = this.f7364j.m4357b(i2);
                    objM4357b.getClass();
                    C0855vk c0855vk3 = (C0855vk) objM4357b;
                    if (c0855vk3 != c0855vk) {
                        while (c0855vk3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0855vk3);
                            c0855vk3.join(10000L);
                        }
                        c0855vk3.f6729d.m3236d(this.f7363i);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f7363i.m1573b();
            this.f7362h.m1573b();
            while (true) {
                if (c0855vk == null) {
                    o61VarM4750a = (o61) this.f7362h.m1575d();
                    if (o61VarM4750a == null && (o61VarM4750a = (o61) this.f7363i.m1575d()) == null) {
                        break;
                    }
                } else {
                    o61VarM4750a = c0855vk.m4750a(true);
                    if (o61VarM4750a == null) {
                    }
                }
                try {
                    o61VarM4750a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0855vk != null) {
                c0855vk.m4757h(EnumC0892wk.f7142h);
            }
            f7354k.set(this, 0L);
            f7355l.set(this, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5140d(C0855vk c0855vk, int i, int i2) {
        while (true) {
            long j = f7354k.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM4752c = c0855vk.m4752c();
                    while (true) {
                        if (objM4752c == f7357n) {
                            i3 = -1;
                            break;
                        }
                        if (objM4752c == null) {
                            i3 = 0;
                            break;
                        }
                        C0855vk c0855vk2 = (C0855vk) objM4752c;
                        int iM4751b = c0855vk2.m4751b();
                        if (iM4751b != 0) {
                            i3 = iM4751b;
                            break;
                        }
                        objM4752c = c0855vk2.m4752c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ExecutorC0929xk executorC0929xk = this;
                if (f7354k.compareAndSet(executorC0929xk, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = executorC0929xk;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m5141e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f7358d;
        if (i < i2) {
            int iM5138a = m5138a();
            if (iM5138a == 1 && i2 > 1) {
                m5138a();
            }
            if (iM5138a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m5137c(this, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m5142f() {
        ExecutorC0929xk executorC0929xk;
        C1014zr c1014zr;
        int iM4751b;
        while (true) {
            long j = f7354k.get(this);
            C0855vk c0855vk = (C0855vk) this.f7364j.m4357b((int) (2097151 & j));
            if (c0855vk == null) {
                c0855vk = null;
                executorC0929xk = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM4752c = c0855vk.m4752c();
                while (true) {
                    c1014zr = f7357n;
                    if (objM4752c == c1014zr) {
                        iM4751b = -1;
                        break;
                    }
                    if (objM4752c == null) {
                        iM4751b = 0;
                        break;
                    }
                    C0855vk c0855vk2 = (C0855vk) objM4752c;
                    iM4751b = c0855vk2.m4751b();
                    if (iM4751b != 0) {
                        break;
                    }
                    objM4752c = c0855vk2.m4752c();
                    j = j;
                }
                if (iM4751b >= 0) {
                    ExecutorC0929xk executorC0929xk2 = this;
                    boolean zCompareAndSet = f7354k.compareAndSet(executorC0929xk2, j, ((long) iM4751b) | j2);
                    executorC0929xk = executorC0929xk2;
                    if (zCompareAndSet) {
                        c0855vk.m4756g(c1014zr);
                    }
                    this = executorC0929xk;
                } else {
                    continue;
                }
            }
            if (c0855vk == null) {
                return false;
            }
            if (C0855vk.f6728l.compareAndSet(c0855vk, -1, 0)) {
                LockSupport.unpark(c0855vk);
                return true;
            }
            this = executorC0929xk;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r11v1, 100 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r11v1, 98 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r11v1, 99 */
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        uu0 uu0Var = this.f7364j;
        int iM4356a = uu0Var.m4356a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM4356a; i6++) {
            C0855vk c0855vk = (C0855vk) uu0Var.m4357b(i6);
            if (c0855vk != null) {
                int iM3235c = c0855vk.f6729d.m3235c();
                int iOrdinal = c0855vk.f6731f.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM3235c);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM3235c);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iM3235c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM3235c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        C0921xc.m5129j();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f7355l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f7361g);
        sb4.append('@');
        sb4.append(AbstractC0398kl.m1927m(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.f7358d;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f7359e);
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
        sb4.append(this.f7362h.m1574c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f7363i.m1574c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
