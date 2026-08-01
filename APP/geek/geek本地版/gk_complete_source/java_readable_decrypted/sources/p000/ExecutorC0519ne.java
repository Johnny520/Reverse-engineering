package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ne */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0519ne implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final AtomicLongFieldUpdater f3399h = AtomicLongFieldUpdater.newUpdater(ExecutorC0519ne.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: i */
    public static final AtomicLongFieldUpdater f3400i = AtomicLongFieldUpdater.newUpdater(ExecutorC0519ne.class, "controlState");

    /* JADX INFO: renamed from: j */
    public static final AtomicIntegerFieldUpdater f3401j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0519ne.class, "_isTerminated");

    /* JADX INFO: renamed from: k */
    public static final C0431l0 f3402k = new C0431l0(27, "NOT_IN_STACK");
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a */
    public final int f3403a;

    /* JADX INFO: renamed from: b */
    public final int f3404b;

    /* JADX INFO: renamed from: c */
    public final long f3405c;
    private volatile long controlState;

    /* JADX INFO: renamed from: d */
    public final String f3406d;

    /* JADX INFO: renamed from: e */
    public final C0075bo f3407e;

    /* JADX INFO: renamed from: f */
    public final C0075bo f3408f;

    /* JADX INFO: renamed from: g */
    public final t00 f3409g;
    private volatile long parkedWorkersStack;

    public ExecutorC0519ne(int i, int i2, long j, String str) {
        this.f3403a = i;
        this.f3404b = i2;
        this.f3405c = j;
        this.f3406d = str;
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
        this.f3407e = new C0075bo();
        this.f3408f = new C0075bo();
        this.f3409g = new t00((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX INFO: renamed from: a */
    public final int m1940a() {
        synchronized (this.f3409g) {
            try {
                if (f3401j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3400i;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f3403a) {
                    return 0;
                }
                if (i >= this.f3404b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f3409g.m2348b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0482me c0482me = new C0482me(this, i3);
                this.f3409g.m2349c(i3, c0482me);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c0482me.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1941b(Runnable runnable, v50 v50Var) {
        u50 w50Var;
        int i;
        x50.f5101f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof u50) {
            w50Var = (u50) runnable;
            w50Var.f4668a = jNanoTime;
            w50Var.f4669b = v50Var;
        } else {
            w50Var = new w50(runnable, jNanoTime, v50Var);
        }
        boolean z = w50Var.f4669b.f4807a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3400i;
        long jAddAndGet = z ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0482me c0482me = threadCurrentThread instanceof C0482me ? (C0482me) threadCurrentThread : null;
        if (c0482me == null || !AbstractC0346ip.m1497i(c0482me.f3204h, this)) {
            c0482me = null;
        }
        if (c0482me != null && (i = c0482me.f3199c) != 5 && (w50Var.f4669b.f4807a != 0 || i != 2)) {
            c0482me.f3203g = true;
            zc0 zc0Var = c0482me.f3197a;
            zc0Var.getClass();
            w50Var = (u50) zc0.f5534b.getAndSet(zc0Var, w50Var);
            if (w50Var == null) {
                w50Var = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = zc0Var.f5538a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = zc0.f5535c;
                if (atomicIntegerFieldUpdater.get(zc0Var) - zc0.f5536d.get(zc0Var) != 127) {
                    if (w50Var.f4669b.f4807a == 1) {
                        zc0.f5537e.incrementAndGet(zc0Var);
                    }
                    int i2 = atomicIntegerFieldUpdater.get(zc0Var) & 127;
                    while (atomicReferenceArray.get(i2) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i2, w50Var);
                    atomicIntegerFieldUpdater.incrementAndGet(zc0Var);
                    w50Var = null;
                }
            }
        }
        if (w50Var != null) {
            if (!(w50Var.f4669b.f4807a == 1 ? this.f3408f.m2595a(w50Var) : this.f3407e.m2595a(w50Var))) {
                throw new RejectedExecutionException(z30.m2767l(new StringBuilder(), this.f3406d, " was terminated"));
            }
        }
        if (z) {
            if (m1944e() || m1943d(jAddAndGet)) {
                return;
            }
            m1944e();
            return;
        }
        if (m1944e() || m1943d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m1944e();
    }

    /* JADX INFO: renamed from: c */
    public final void m1942c(C0482me c0482me, int i, int i2) {
        while (true) {
            long j = f3399h.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM1822c = c0482me.m1822c();
                    while (true) {
                        if (objM1822c == f3402k) {
                            i3 = -1;
                            break;
                        }
                        if (objM1822c == null) {
                            i3 = 0;
                            break;
                        }
                        C0482me c0482me2 = (C0482me) objM1822c;
                        int iM1821b = c0482me2.m1821b();
                        if (iM1821b != 0) {
                            i3 = iM1821b;
                            break;
                        }
                        objM1822c = c0482me2.m1822c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f3399h.compareAndSet(this, j, ((long) i3) | j2)) {
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.ExecutorC0519ne.f3401j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p000.C0482me
            r3 = 0
            if (r1 == 0) goto L17
            me r0 = (p000.C0482me) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            ne r1 = r0.f3204h
            boolean r1 = p000.AbstractC0346ip.m1497i(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            t00 r1 = r8.f3409g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p000.ExecutorC0519ne.f3400i     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L76
            r1 = r2
        L36:
            t00 r5 = r8.f3409g
            java.lang.Object r5 = r5.m2348b(r1)
            p000.AbstractC0346ip.m1500l(r5)
            me r5 = (p000.C0482me) r5
            if (r5 == r0) goto L71
        L43:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L52:
            zc0 r5 = r5.f3197a
            bo r6 = r8.f3408f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p000.zc0.f5534b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            u50 r7 = (p000.u50) r7
            if (r7 == 0) goto L66
            r6.m2595a(r7)
        L66:
            u50 r7 = r5.m2800a()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.m2595a(r7)
            goto L66
        L71:
            if (r1 == r4) goto L76
            int r1 = r1 + 1
            goto L36
        L76:
            bo r1 = r8.f3408f
            r1.m2596b()
            bo r1 = r8.f3407e
            r1.m2596b()
        L80:
            if (r0 == 0) goto L88
            u50 r1 = r0.m1820a(r2)
            if (r1 != 0) goto Laf
        L88:
            bo r1 = r8.f3407e
            java.lang.Object r1 = r1.m2598d()
            u50 r1 = (p000.u50) r1
            if (r1 != 0) goto Laf
            bo r1 = r8.f3408f
            java.lang.Object r1 = r1.m2598d()
            u50 r1 = (p000.u50) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            r1 = 5
            r0.m1827h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0519ne.f3399h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p000.ExecutorC0519ne.f3400i
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
        throw new UnsupportedOperationException("Method not decompiled: p000.ExecutorC0519ne.close():void");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1943d(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f3403a;
        if (i < i2) {
            int iM1940a = m1940a();
            if (iM1940a == 1 && i2 > 1) {
                m1940a();
            }
            if (iM1940a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1944e() {
        C0431l0 c0431l0;
        int iM1821b;
        while (true) {
            long j = f3399h.get(this);
            C0482me c0482me = (C0482me) this.f3409g.m2348b((int) (2097151 & j));
            if (c0482me == null) {
                c0482me = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM1822c = c0482me.m1822c();
                while (true) {
                    c0431l0 = f3402k;
                    if (objM1822c == c0431l0) {
                        iM1821b = -1;
                        break;
                    }
                    if (objM1822c == null) {
                        iM1821b = 0;
                        break;
                    }
                    C0482me c0482me2 = (C0482me) objM1822c;
                    iM1821b = c0482me2.m1821b();
                    if (iM1821b != 0) {
                        break;
                    }
                    objM1822c = c0482me2.m1822c();
                }
                if (iM1821b >= 0) {
                    if (f3399h.compareAndSet(this, j, ((long) iM1821b) | j2)) {
                        c0482me.m1826g(c0431l0);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0482me == null) {
                return false;
            }
            if (C0482me.f3196i.compareAndSet(c0482me, -1, 0)) {
                LockSupport.unpark(c0482me);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m1941b(runnable, x50.f5102g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t00 t00Var = this.f3409g;
        int iM2347a = t00Var.m2347a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM2347a; i6++) {
            C0482me c0482me = (C0482me) t00Var.m2348b(i6);
            if (c0482me != null) {
                zc0 zc0Var = c0482me.f3197a;
                zc0Var.getClass();
                int i7 = zc0.f5534b.get(zc0Var) != null ? (zc0.f5535c.get(zc0Var) - zc0.f5536d.get(zc0Var)) + 1 : zc0.f5535c.get(zc0Var) - zc0.f5536d.get(zc0Var);
                int iM2775t = z30.m2775t(c0482me.f3199c);
                if (iM2775t == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM2775t == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM2775t == 2) {
                    i3++;
                } else if (iM2775t == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iM2775t == 4) {
                    i5++;
                }
            }
        }
        long j = f3400i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3406d);
        sb4.append('@');
        sb4.append(AbstractC0222ff.m1197s(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f3403a;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f3404b);
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
        sb4.append(this.f3407e.m2597c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f3408f.m2597c());
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
