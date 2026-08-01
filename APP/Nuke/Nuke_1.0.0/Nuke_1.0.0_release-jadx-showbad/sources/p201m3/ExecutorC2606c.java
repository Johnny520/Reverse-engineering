package p201m3;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p160f3.AbstractC2162v;
import p190k3.C2468p;

/* JADX INFO: renamed from: m3.c */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2606c implements Executor, Closeable {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicLongFieldUpdater f8292k = AtomicLongFieldUpdater.newUpdater(ExecutorC2606c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater f8293l = AtomicLongFieldUpdater.newUpdater(ExecutorC2606c.class, "controlState$volatile");

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8294m = AtomicIntegerFieldUpdater.newUpdater(ExecutorC2606c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: n */
    public static final C1753n f8295n = new C1753n(10, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final int f8296d;

    /* JADX INFO: renamed from: e */
    public final int f8297e;

    /* JADX INFO: renamed from: f */
    public final long f8298f;

    /* JADX INFO: renamed from: g */
    public final String f8299g;

    /* JADX INFO: renamed from: h */
    public final C2609f f8300h;

    /* JADX INFO: renamed from: i */
    public final C2609f f8301i;

    /* JADX INFO: renamed from: j */
    public final C2468p f8302j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExecutorC2606c(int i5, int i6, long j5, String str) {
        this.f8296d = i5;
        this.f8297e = i6;
        this.f8298f = j5;
        this.f8299g = str;
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Core pool size ", " should be at least 1").toString());
        }
        if (i6 < i5) {
            throw new IllegalArgumentException(AbstractC0231b.m399j("Max pool size ", i6, " should be greater than or equals to core pool size ", i5).toString());
        }
        if (i6 > 2097150) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i6, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j5 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
        }
        this.f8300h = new C2609f();
        this.f8301i = new C2609f();
        this.f8302j = new C2468p((i5 + 1) * 2);
        this.controlState$volatile = ((long) i5) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4558d(ExecutorC2606c executorC2606c, Runnable runnable, int i5) {
        executorC2606c.m4560c(runnable, false, (i5 & 4) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m4559b() {
        synchronized (this.f8302j) {
            try {
                if (f8294m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f8293l;
                long j5 = atomicLongFieldUpdater.get(this);
                int i5 = (int) (j5 & 2097151);
                int i6 = i5 - ((int) ((j5 & 4398044413952L) >> 21));
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i6 >= this.f8296d) {
                    return 0;
                }
                if (i5 >= this.f8297e) {
                    return 0;
                }
                int i7 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i7 <= 0 || this.f8302j.m4403b(i7) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C2604a c2604a = new C2604a(this, i7);
                this.f8302j.m4404c(i7, c2604a);
                if (i7 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i8 = i6 + 1;
                c2604a.start();
                return i8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4560c(Runnable runnable, boolean z5, boolean z6) {
        AbstractRunnableC2612i c2613j;
        EnumC2605b enumC2605b;
        AbstractC2614k.f8316f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC2612i) {
            c2613j = (AbstractRunnableC2612i) runnable;
            c2613j.f8308d = jNanoTime;
            c2613j.f8309e = z5;
        } else {
            c2613j = new C2613j(runnable, jNanoTime, z5);
        }
        boolean z7 = c2613j.f8309e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8293l;
        long jAddAndGet = z7 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C2604a c2604a = threadCurrentThread instanceof C2604a ? (C2604a) threadCurrentThread : null;
        if (c2604a == null || !AbstractC1665j.m2981a(c2604a.f8285k, this)) {
            c2604a = null;
        }
        if (c2604a != null && (enumC2605b = c2604a.f8280f) != EnumC2605b.f8290h && (c2613j.f8309e || enumC2605b != EnumC2605b.f8287e)) {
            c2604a.f8284j = true;
            C2616m c2616m = c2604a.f8278d;
            if (z6) {
                c2613j = c2616m.m4564a(c2613j);
            } else {
                c2616m.getClass();
                AbstractRunnableC2612i abstractRunnableC2612i = (AbstractRunnableC2612i) C2616m.f8318b.getAndSet(c2616m, c2613j);
                c2613j = abstractRunnableC2612i == null ? null : c2616m.m4564a(abstractRunnableC2612i);
            }
        }
        if (c2613j != null) {
            if (!(c2613j.f8309e ? this.f8301i.m4394a(c2613j) : this.f8300h.m4394a(c2613j))) {
                throw new RejectedExecutionException(AbstractC0231b.m403n(new StringBuilder(), this.f8299g, " was terminated"));
            }
        }
        boolean z8 = z6 && c2604a != null;
        if (z7) {
            if (z8 || m4563j() || m4562h(jAddAndGet)) {
                return;
            }
            m4563j();
            return;
        }
        if (z8 || m4563j() || m4562h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m4563j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i5;
        AbstractRunnableC2612i abstractRunnableC2612iM4549a;
        if (f8294m.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C2604a c2604a = threadCurrentThread instanceof C2604a ? (C2604a) threadCurrentThread : null;
            if (c2604a == null || !AbstractC1665j.m2981a(c2604a.f8285k, this)) {
                c2604a = null;
            }
            synchronized (this.f8302j) {
                i5 = (int) (f8293l.get(this) & 2097151);
            }
            if (1 <= i5) {
                int i6 = 1;
                while (true) {
                    Object objM4403b = this.f8302j.m4403b(i6);
                    AbstractC1665j.m2982b(objM4403b);
                    C2604a c2604a2 = (C2604a) objM4403b;
                    if (c2604a2 != c2604a) {
                        while (c2604a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c2604a2);
                            c2604a2.join(10000L);
                        }
                        C2616m c2616m = c2604a2.f8278d;
                        C2609f c2609f = this.f8301i;
                        c2616m.getClass();
                        AbstractRunnableC2612i abstractRunnableC2612i = (AbstractRunnableC2612i) C2616m.f8318b.getAndSet(c2616m, null);
                        if (abstractRunnableC2612i != null) {
                            c2609f.m4394a(abstractRunnableC2612i);
                        }
                        while (true) {
                            AbstractRunnableC2612i abstractRunnableC2612iM4565b = c2616m.m4565b();
                            if (abstractRunnableC2612iM4565b == null) {
                                break;
                            } else {
                                c2609f.m4394a(abstractRunnableC2612iM4565b);
                            }
                        }
                    }
                    if (i6 == i5) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.f8301i.m4395b();
            this.f8300h.m4395b();
            while (true) {
                if (c2604a == null) {
                    abstractRunnableC2612iM4549a = (AbstractRunnableC2612i) this.f8300h.m4397d();
                    if (abstractRunnableC2612iM4549a == null && (abstractRunnableC2612iM4549a = (AbstractRunnableC2612i) this.f8301i.m4397d()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC2612iM4549a = c2604a.m4549a(true);
                    if (abstractRunnableC2612iM4549a == null) {
                    }
                }
                try {
                    abstractRunnableC2612iM4549a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c2604a != null) {
                c2604a.m4556h(EnumC2605b.f8290h);
            }
            f8292k.set(this, 0L);
            f8293l.set(this, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m4558d(this, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4561f(C2604a c2604a, int i5, int i6) {
        while (true) {
            long j5 = f8292k.get(this);
            int i7 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & (-2097152);
            if (i7 == i5) {
                if (i6 == 0) {
                    Object objM4551c = c2604a.m4551c();
                    while (true) {
                        if (objM4551c == f8295n) {
                            i7 = -1;
                            break;
                        }
                        if (objM4551c == null) {
                            i7 = 0;
                            break;
                        }
                        C2604a c2604a2 = (C2604a) objM4551c;
                        int iM4550b = c2604a2.m4550b();
                        if (iM4550b != 0) {
                            i7 = iM4550b;
                            break;
                        }
                        objM4551c = c2604a2.m4551c();
                    }
                } else {
                    i7 = i6;
                }
            }
            if (i7 >= 0) {
                if (f8292k.compareAndSet(this, j5, ((long) i7) | j6)) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4562h(long j5) {
        int i5 = ((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21));
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = this.f8296d;
        if (i5 < i6) {
            int iM4559b = m4559b();
            if (iM4559b == 1 && i6 > 1) {
                m4559b();
            }
            if (iM4559b > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4563j() {
        C1753n c1753n;
        int iM4550b;
        while (true) {
            long j5 = f8292k.get(this);
            C2604a c2604a = (C2604a) this.f8302j.m4403b((int) (2097151 & j5));
            if (c2604a == null) {
                c2604a = null;
            } else {
                long j6 = (2097152 + j5) & (-2097152);
                Object objM4551c = c2604a.m4551c();
                while (true) {
                    c1753n = f8295n;
                    if (objM4551c == c1753n) {
                        iM4550b = -1;
                        break;
                    }
                    if (objM4551c == null) {
                        iM4550b = 0;
                        break;
                    }
                    C2604a c2604a2 = (C2604a) objM4551c;
                    iM4550b = c2604a2.m4550b();
                    if (iM4550b != 0) {
                        break;
                    }
                    objM4551c = c2604a2.m4551c();
                }
                if (iM4550b >= 0) {
                    if (f8292k.compareAndSet(this, j5, ((long) iM4550b) | j6)) {
                        c2604a.m4555g(c1753n);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c2604a == null) {
                return false;
            }
            if (C2604a.f8277l.compareAndSet(c2604a, -1, 0)) {
                LockSupport.unpark(c2604a);
                return true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 100 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 98 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v5, 99 */
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C2468p c2468p = this.f8302j;
        int iM4402a = c2468p.m4402a();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < iM4402a; i10++) {
            C2604a c2604a = (C2604a) c2468p.m4403b(i10);
            if (c2604a != null) {
                C2616m c2616m = c2604a.f8278d;
                c2616m.getClass();
                int i11 = C2616m.f8318b.get(c2616m) != null ? (C2616m.f8319c.get(c2616m) - C2616m.f8320d.get(c2616m)) + 1 : C2616m.f8319c.get(c2616m) - C2616m.f8320d.get(c2616m);
                int iOrdinal = c2604a.f8280f.ordinal();
                if (iOrdinal == 0) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i11);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i6++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i7++;
                } else if (iOrdinal == 3) {
                    i8++;
                    if (i11 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i11);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C0330q();
                    }
                    i9++;
                }
            }
        }
        long j5 = f8293l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f8299g);
        sb4.append('@');
        sb4.append(AbstractC2162v.m3987i(this));
        sb4.append("[Pool Size {core = ");
        int i12 = this.f8296d;
        sb4.append(i12);
        sb4.append(", max = ");
        sb4.append(this.f8297e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i5);
        sb4.append(", blocking = ");
        sb4.append(i6);
        sb4.append(", parked = ");
        sb4.append(i7);
        sb4.append(", dormant = ");
        sb4.append(i8);
        sb4.append(", terminated = ");
        sb4.append(i9);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f8300h.m4396c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f8301i.m4396c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j5));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j5) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i12 - ((int) ((j5 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
