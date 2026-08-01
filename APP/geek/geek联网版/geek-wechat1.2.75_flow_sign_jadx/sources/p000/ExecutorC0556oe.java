package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: oe */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0556oe implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final AtomicLongFieldUpdater f3439h = AtomicLongFieldUpdater.newUpdater(ExecutorC0556oe.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: i */
    public static final AtomicLongFieldUpdater f3440i = AtomicLongFieldUpdater.newUpdater(ExecutorC0556oe.class, "controlState");

    /* JADX INFO: renamed from: j */
    public static final AtomicIntegerFieldUpdater f3441j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0556oe.class, "_isTerminated");

    /* JADX INFO: renamed from: k */
    public static final C0431l0 f3442k = new C0431l0(27, "NOT_IN_STACK");
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a */
    public final int f3443a;

    /* JADX INFO: renamed from: b */
    public final int f3444b;

    /* JADX INFO: renamed from: c */
    public final long f3445c;
    private volatile long controlState;

    /* JADX INFO: renamed from: d */
    public final String f3446d;

    /* JADX INFO: renamed from: e */
    public final C0268go f3447e;

    /* JADX INFO: renamed from: f */
    public final C0268go f3448f;

    /* JADX INFO: renamed from: g */
    public final a10 f3449g;
    private volatile long parkedWorkersStack;

    public ExecutorC0556oe(int i, int i2, long j, String str) {
        this.f3443a = i;
        this.f3444b = i2;
        this.f3445c = j;
        this.f3446d = str;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f3447e = new C0268go();
        this.f3448f = new C0268go();
        this.f3449g = new a10((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX INFO: renamed from: a */
    public final int m2026a() {
        synchronized (this.f3449g) {
            try {
                if (f3441j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3440i;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f3443a) {
                    return 0;
                }
                if (i >= this.f3444b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f3449g.m15b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0519ne c0519ne = new C0519ne(this, i3);
                this.f3449g.m16c(i3, c0519ne);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0519ne.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2027b(Runnable runnable, b60 b60Var) {
        a60 c60Var;
        int i;
        d60.f1323f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof a60) {
            c60Var = (a60) runnable;
            c60Var.f44a = jNanoTime;
            c60Var.f45b = b60Var;
        } else {
            c60Var = new c60(runnable, jNanoTime, b60Var);
        }
        boolean z = c60Var.f45b.f686a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3440i;
        long jAddAndGet = z ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0519ne c0519ne = threadCurrentThread instanceof C0519ne ? (C0519ne) threadCurrentThread : null;
        if (c0519ne == null || !AbstractC0493mp.m1853c(c0519ne.f3285h, this)) {
            c0519ne = null;
        }
        if (c0519ne != null && (i = c0519ne.f3280c) != 5 && (c60Var.f45b.f686a != 0 || i != 2)) {
            c0519ne.f3284g = true;
            ed0 ed0Var = c0519ne.f3278a;
            ed0Var.getClass();
            c60Var = (a60) ed0.f1578b.getAndSet(ed0Var, c60Var);
            if (c60Var == null) {
                c60Var = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = ed0Var.f1582a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ed0.f1579c;
                if (atomicIntegerFieldUpdater.get(ed0Var) - ed0.f1580d.get(ed0Var) != 127) {
                    if (c60Var.f45b.f686a == 1) {
                        ed0.f1581e.incrementAndGet(ed0Var);
                    }
                    int i2 = atomicIntegerFieldUpdater.get(ed0Var) & 127;
                    while (atomicReferenceArray.get(i2) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i2, c60Var);
                    atomicIntegerFieldUpdater.incrementAndGet(ed0Var);
                    c60Var = null;
                }
            }
        }
        if (c60Var != null) {
            if (!(c60Var.f45b.f686a == 1 ? this.f3448f.m470a(c60Var) : this.f3447e.m470a(c60Var))) {
                throw new RejectedExecutionException(g40.m1149l(new StringBuilder(), this.f3446d, " was terminated"));
            }
        }
        if (z) {
            if (m2030e() || m2029d(jAddAndGet)) {
                return;
            }
            m2030e();
            return;
        }
        if (m2030e() || m2029d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m2030e();
    }

    /* JADX INFO: renamed from: c */
    public final void m2028c(C0519ne c0519ne, int i, int i2) {
        while (true) {
            long j = f3439h.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM1949c = c0519ne.m1949c();
                    while (true) {
                        if (objM1949c == f3442k) {
                            i3 = -1;
                            break;
                        }
                        if (objM1949c == null) {
                            i3 = 0;
                            break;
                        }
                        C0519ne c0519ne2 = (C0519ne) objM1949c;
                        int iM1948b = c0519ne2.m1948b();
                        if (iM1948b != 0) {
                            i3 = iM1948b;
                            break;
                        }
                        objM1949c = c0519ne2.m1949c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f3439h.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.ExecutorC0556oe.f3441j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p000.C0519ne
            r3 = 0
            if (r1 == 0) goto L17
            ne r0 = (p000.C0519ne) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            oe r1 = r0.f3285h
            boolean r1 = p000.AbstractC0493mp.m1853c(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            a10 r1 = r8.f3449g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.ExecutorC0556oe.f3440i     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L76
            r1 = r2
        L36:
            a10 r5 = r8.f3449g
            java.lang.Object r5 = r5.m15b(r1)
            p000.AbstractC0493mp.m1854d(r5)
            ne r5 = (p000.C0519ne) r5
            if (r5 == r0) goto L71
        L43:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L52:
            ed0 r5 = r5.f3278a
            go r6 = r8.f3448f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p000.ed0.f1578b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            a60 r7 = (p000.a60) r7
            if (r7 == 0) goto L66
            r6.m470a(r7)
        L66:
            a60 r7 = r5.m986a()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.m470a(r7)
            goto L66
        L71:
            if (r1 == r4) goto L76
            int r1 = r1 + 1
            goto L36
        L76:
            go r1 = r8.f3448f
            r1.m471b()
            go r1 = r8.f3447e
            r1.m471b()
        L80:
            if (r0 == 0) goto L88
            a60 r1 = r0.m1947a(r2)
            if (r1 != 0) goto Laf
        L88:
            go r1 = r8.f3447e
            java.lang.Object r1 = r1.m473d()
            a60 r1 = (p000.a60) r1
            if (r1 != 0) goto Laf
            go r1 = r8.f3448f
            java.lang.Object r1 = r1.m473d()
            a60 r1 = (p000.a60) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            r1 = 5
            r0.m1954h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0556oe.f3439h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0556oe.f3440i
            r0.set(r8, r1)
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L80
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lc0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ExecutorC0556oe.close():void");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2029d(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f3443a;
        if (i < i2) {
            int iM2026a = m2026a();
            if (iM2026a == 1 && i2 > 1) {
                m2026a();
            }
            if (iM2026a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2030e() {
        C0431l0 c0431l0;
        int iM1948b;
        while (true) {
            long j = f3439h.get(this);
            C0519ne c0519ne = (C0519ne) this.f3449g.m15b((int) (2097151 & j));
            if (c0519ne == null) {
                c0519ne = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM1949c = c0519ne.m1949c();
                while (true) {
                    c0431l0 = f3442k;
                    if (objM1949c == c0431l0) {
                        iM1948b = -1;
                        break;
                    }
                    if (objM1949c == null) {
                        iM1948b = 0;
                        break;
                    }
                    C0519ne c0519ne2 = (C0519ne) objM1949c;
                    iM1948b = c0519ne2.m1948b();
                    if (iM1948b != 0) {
                        break;
                    }
                    objM1949c = c0519ne2.m1949c();
                }
                if (iM1948b >= 0) {
                    if (f3439h.compareAndSet(this, j, ((long) iM1948b) | j2)) {
                        c0519ne.m1953g(c0431l0);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0519ne == null) {
                return false;
            }
            if (C0519ne.f3277i.compareAndSet(c0519ne, -1, 0)) {
                LockSupport.unpark(c0519ne);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m2027b(runnable, d60.f1324g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        a10 a10Var = this.f3449g;
        int iM14a = a10Var.m14a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM14a; i6++) {
            C0519ne c0519ne = (C0519ne) a10Var.m15b(i6);
            if (c0519ne != null) {
                ed0 ed0Var = c0519ne.f3278a;
                ed0Var.getClass();
                int i7 = ed0.f1578b.get(ed0Var) != null ? (ed0.f1579c.get(ed0Var) - ed0.f1580d.get(ed0Var)) + 1 : ed0.f1579c.get(ed0Var) - ed0.f1580d.get(ed0Var);
                int iM1158u = g40.m1158u(c0519ne.f3280c);
                if (iM1158u == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM1158u == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM1158u == 2) {
                    i3++;
                } else if (iM1158u == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iM1158u == 4) {
                    i5++;
                }
            }
        }
        long j = f3440i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3446d);
        sb4.append('@');
        sb4.append(AbstractC0259gf.m1262x(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f3443a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f3444b);
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
        sb4.append(this.f3447e.m472c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3448f.m472c());
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
