package p201m3;

import java.io.Closeable;
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

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4558d(ExecutorC2606c executorC2606c, Runnable runnable, int i5) {
        executorC2606c.m4560c(runnable, false, (i5 & 4) == 0);
    }

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

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p201m3.ExecutorC2606c.f8294m
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p201m3.C2604a
            r3 = 0
            if (r1 == 0) goto L17
            m3.a r0 = (p201m3.C2604a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            m3.c r1 = r0.f8285k
            boolean r1 = p117X2.AbstractC1665j.m2981a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            k3.p r1 = r8.f8302j
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p201m3.ExecutorC2606c.f8293l     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            k3.p r5 = r8.f8302j
            java.lang.Object r5 = r5.m4403b(r1)
            p117X2.AbstractC1665j.m2982b(r5)
            m3.a r5 = (p201m3.C2604a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            m3.m r5 = r5.f8278d
            m3.f r6 = r8.f8301i
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p201m3.C2616m.f8318b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            m3.i r7 = (p201m3.AbstractRunnableC2612i) r7
            if (r7 == 0) goto L68
            r6.m4394a(r7)
        L68:
            m3.i r7 = r5.m4565b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.m4394a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            m3.f r1 = r8.f8301i
            r1.m4395b()
            m3.f r1 = r8.f8300h
            r1.m4395b()
        L82:
            if (r0 == 0) goto L8a
            m3.i r1 = r0.m4549a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            m3.f r1 = r8.f8300h
            java.lang.Object r1 = r1.m4397d()
            m3.i r1 = (p201m3.AbstractRunnableC2612i) r1
            if (r1 != 0) goto Lb2
            m3.f r1 = r8.f8301i
            java.lang.Object r1 = r1.m4397d()
            m3.i r1 = (p201m3.AbstractRunnableC2612i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            m3.b r1 = p201m3.EnumC2605b.f8290h
            r0.m4556h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p201m3.ExecutorC2606c.f8292k
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p201m3.ExecutorC2606c.f8293l
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p201m3.ExecutorC2606c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m4558d(this, runnable, 6);
    }

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
