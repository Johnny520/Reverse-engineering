package lc;

import ec.AbstractC2115c;
import ec.AbstractC2181s0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.C1050n0;
import p080f9.AbstractC2368o;
import p145jc.C3801d0;
import p145jc.C3834y;
import p172l8.C4700i0;
import p215oc.C5702a;
import p215oc.C5704b;
import p215oc.C5729x;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p376zd.C10028y0;

/* JADX INFO: renamed from: lc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC4735a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: q */
    public final int f14022q;

    /* JADX INFO: renamed from: r */
    public final int f14023r;

    /* JADX INFO: renamed from: s */
    public final long f14024s;

    /* JADX INFO: renamed from: t */
    public final String f14025t;

    /* JADX INFO: renamed from: u */
    public final C4738d f14026u;

    /* JADX INFO: renamed from: v */
    public final C4738d f14027v;

    /* JADX INFO: renamed from: w */
    public final C3834y f14028w;

    /* JADX INFO: renamed from: x */
    public static final a f14019x = new a(null);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicLongFieldUpdater f14020y = AtomicLongFieldUpdater.newUpdater(ExecutorC4735a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicLongFieldUpdater f14021z = AtomicLongFieldUpdater.newUpdater(ExecutorC4735a.class, "controlState$volatile");

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14017A = AtomicIntegerFieldUpdater.newUpdater(ExecutorC4735a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: B */
    public static final C3801d0 f14018B = new C3801d0("NOT_IN_STACK");

    /* JADX INFO: renamed from: lc.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14029a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f14041s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f14040r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f14039q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f14042t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f14043u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14029a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: lc.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: q */
        public static final d f14039q = new d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: r */
        public static final d f14040r = new d("BLOCKING", 1);

        /* JADX INFO: renamed from: s */
        public static final d f14041s = new d("PARKING", 2);

        /* JADX INFO: renamed from: t */
        public static final d f14042t = new d("DORMANT", 3);

        /* JADX INFO: renamed from: u */
        public static final d f14043u = new d("TERMINATED", 4);

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ d[] f14044v;

        /* JADX INFO: renamed from: w */
        public static final /* synthetic */ InterfaceC7197a f14045w;

        static {
            d[] dVarArrM18974a = m18974a();
            f14044v = dVarArrM18974a;
            f14045w = AbstractC7198b.m28437a(dVarArrM18974a);
        }

        public d(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ d[] m18974a() {
            return new d[]{f14039q, f14040r, f14041s, f14042t, f14043u};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f14044v.clone();
        }
    }

    public ExecutorC4735a(int i10, int i11, long j10, String str) {
        this.f14022q = i10;
        this.f14023r = i11;
        this.f14024s = j10;
        this.f14025t = str;
        if (i10 < 1) {
            C5704b.m23087a("Core pool size ", i10, " should be at least 1");
            throw null;
        }
        if (i11 < i10) {
            C10028y0.m38849a("Max pool size ", i11, " should be greater than or equals to core pool size ", i10);
            throw null;
        }
        if (i11 > 2097150) {
            C5704b.m23087a("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j10 <= 0) {
            C5702a.m23079a("Idle worker keep alive time ", j10, " must be positive");
            throw null;
        }
        this.f14026u = new C4738d();
        this.f14027v = new C4738d();
        this.f14028w = new C3834y((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ boolean m18932X(ExecutorC4735a executorC4735a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f14021z.get(executorC4735a);
        }
        return executorC4735a.m18946W(j10);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m18934m(ExecutorC4735a executorC4735a, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        executorC4735a.m18952l(runnable, z10, z11);
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicLongFieldUpdater m18935n() {
        return f14021z;
    }

    /* JADX INFO: renamed from: F */
    public final c m18938F() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14020y;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f14028w.m15267b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iM18953x = m18953x(cVar);
            if (iM18953x >= 0 && f14020y.compareAndSet(this, j10, ((long) iM18953x) | j11)) {
                cVar.m18968o(f14018B);
                return cVar;
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m18939G(c cVar) {
        long j10;
        int iM18960f;
        if (cVar.m18961g() != f14018B) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14020y;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iM18960f = cVar.m18960f();
            cVar.m18968o(this.f14028w.m15267b((int) (2097151 & j10)));
        } while (!f14020y.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iM18960f)));
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final void m18940K(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f14020y;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iM18953x = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iM18953x == i10) {
                iM18953x = i11 == 0 ? m18953x(cVar) : i11;
            }
            if (iM18953x >= 0) {
                if (f14020y.compareAndSet(this, j10, j11 | ((long) iM18953x))) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m18941L(AbstractRunnableC4742h abstractRunnableC4742h) {
        try {
            abstractRunnableC4742h.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC2115c.m7635a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18942P(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = m18937t()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            lc.a$c r0 = r7.m18951k()
            jc.y r1 = r7.f14028w
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = m18933c()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            jc.y r4 = r7.f14028w
            java.lang.Object r4 = r4.m15267b(r1)
            r4.getClass()
            lc.a$c r4 = (lc.ExecutorC4735a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            lc.l r4 = r4.f14031q
            lc.d r5 = r7.f14027v
            r4.m18990j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            lc.d r8 = r7.f14027v
            r8.m15236b()
            lc.d r8 = r7.f14026u
            r8.m15236b()
        L57:
            if (r0 == 0) goto L5f
            lc.h r8 = r0.m18959e(r2)
            if (r8 != 0) goto L8b
        L5f:
            lc.d r8 = r7.f14026u
            java.lang.Object r8 = r8.m15238e()
            lc.h r8 = (lc.AbstractRunnableC4742h) r8
            if (r8 != 0) goto L8b
            lc.d r8 = r7.f14027v
            java.lang.Object r8 = r8.m15238e()
            lc.h r8 = (lc.AbstractRunnableC4742h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            lc.a$d r8 = lc.ExecutorC4735a.d.f14043u
            r0.m18971r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m18936q()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = m18935n()
            r8.set(r7, r0)
            return
        L8b:
            r7.m18941L(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.ExecutorC4735a.m18942P(long):void");
    }

    /* JADX INFO: renamed from: R */
    public final void m18943R(long j10) {
        if (m18947b0() || m18946W(j10)) {
            return;
        }
        m18947b0();
    }

    /* JADX INFO: renamed from: T */
    public final void m18944T() {
        if (m18947b0() || m18932X(this, 0L, 1, null)) {
            return;
        }
        m18947b0();
    }

    /* JADX INFO: renamed from: V */
    public final AbstractRunnableC4742h m18945V(c cVar, AbstractRunnableC4742h abstractRunnableC4742h, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f14033s) == d.f14043u) {
            return abstractRunnableC4742h;
        }
        if (!abstractRunnableC4742h.f14056r && dVar == d.f14040r) {
            return abstractRunnableC4742h;
        }
        cVar.f14037w = true;
        return cVar.f14031q.m18985a(abstractRunnableC4742h, z10);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m18946W(long j10) {
        if (AbstractC2368o.m8578e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f14022q) {
            int iM18949h = m18949h();
            if (iM18949h == 1 && this.f14022q > 1) {
                m18949h();
            }
            if (iM18949h > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m18947b0() {
        c cVarM18938F;
        do {
            cVarM18938F = m18938F();
            if (cVarM18938F == null) {
                return false;
            }
        } while (!c.f14030y.compareAndSet(cVarM18938F, -1, 0));
        LockSupport.unpark(cVarM18938F);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m18942P(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m18934m(this, runnable, false, false, 6, null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18948f(AbstractRunnableC4742h abstractRunnableC4742h) {
        return abstractRunnableC4742h.f14056r ? this.f14027v.m15235a(abstractRunnableC4742h) : this.f14026u.m15235a(abstractRunnableC4742h);
    }

    /* JADX INFO: renamed from: h */
    public final int m18949h() {
        synchronized (this.f14028w) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f14021z.get(this);
                int i10 = (int) (j10 & 2097151);
                int iM8578e = AbstractC2368o.m8578e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iM8578e >= this.f14022q) {
                    return 0;
                }
                if (i10 >= this.f14023r) {
                    return 0;
                }
                int i11 = ((int) (m18935n().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f14028w.m15267b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f14028w.m15268c(i11, cVar);
                if (i11 != ((int) (2097151 & f14021z.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iM8578e + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isTerminated() {
        return f14017A.get(this) == 1;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractRunnableC4742h m18950j(Runnable runnable, boolean z10) {
        long jMo18975a = AbstractC4744j.f14063f.mo18975a();
        if (!(runnable instanceof AbstractRunnableC4742h)) {
            return AbstractC4744j.m18979b(runnable, jMo18975a, z10);
        }
        AbstractRunnableC4742h abstractRunnableC4742h = (AbstractRunnableC4742h) runnable;
        abstractRunnableC4742h.f14055q = jMo18975a;
        abstractRunnableC4742h.f14056r = z10;
        return abstractRunnableC4742h;
    }

    /* JADX INFO: renamed from: k */
    public final c m18951k() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !AbstractC1061t.m3842c(ExecutorC4735a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m18952l(Runnable runnable, boolean z10, boolean z11) {
        AbstractC2115c.m7635a();
        AbstractRunnableC4742h abstractRunnableC4742hM18950j = m18950j(runnable, z10);
        boolean z12 = abstractRunnableC4742hM18950j.f14056r;
        long jAddAndGet = z12 ? f14021z.addAndGet(this, 2097152L) : 0L;
        AbstractRunnableC4742h abstractRunnableC4742hM18945V = m18945V(m18951k(), abstractRunnableC4742hM18950j, z11);
        if (abstractRunnableC4742hM18945V == null || m18948f(abstractRunnableC4742hM18945V)) {
            if (z12) {
                m18943R(jAddAndGet);
                return;
            } else {
                m18944T();
                return;
            }
        }
        throw new RejectedExecutionException(this.f14025t + " was terminated");
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM15266a = this.f14028w.m15266a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iM15266a; i15++) {
            c cVar = (c) this.f14028w.m15267b(i15);
            if (cVar != null) {
                int iM18989i = cVar.f14031q.m18989i();
                int i16 = b.f14029a[cVar.f14033s.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM18989i);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iM18989i);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iM18989i > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iM18989i);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i16 != 5) {
                        C5729x.m23182a();
                        return null;
                    }
                    i14++;
                }
            }
        }
        long j10 = f14021z.get(this);
        return this.f14025t + '@' + AbstractC2181s0.m7899b(this) + "[Pool Size {core = " + this.f14022q + ", max = " + this.f14023r + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f14026u.m15237c() + ", global blocking queue size = " + this.f14027v.m15237c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f14022q - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: x */
    public final int m18953x(c cVar) {
        Object objM18961g = cVar.m18961g();
        while (objM18961g != f14018B) {
            if (objM18961g == null) {
                return 0;
            }
            c cVar2 = (c) objM18961g;
            int iM18960f = cVar2.m18960f();
            if (iM18960f != 0) {
                return iM18960f;
            }
            objM18961g = cVar2.m18961g();
        }
        return -1;
    }

    /* JADX INFO: renamed from: lc.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: lc.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class c extends Thread {

        /* JADX INFO: renamed from: y */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f14030y = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* JADX INFO: renamed from: q */
        public final C4746l f14031q;

        /* JADX INFO: renamed from: r */
        public final C1050n0 f14032r;

        /* JADX INFO: renamed from: s */
        public d f14033s;

        /* JADX INFO: renamed from: t */
        public long f14034t;

        /* JADX INFO: renamed from: u */
        public long f14035u;

        /* JADX INFO: renamed from: v */
        public int f14036v;

        /* JADX INFO: renamed from: w */
        public boolean f14037w;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC4735a.this.getClass().getClassLoader());
            this.f14031q = new C4746l();
            this.f14032r = new C1050n0();
            this.f14033s = d.f14042t;
            this.nextParkedWorker = ExecutorC4735a.f14018B;
            int iNanoTime = (int) System.nanoTime();
            this.f14036v = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: b */
        public final void m18956b(AbstractRunnableC4742h abstractRunnableC4742h) {
            this.f14034t = 0L;
            if (this.f14033s == d.f14041s) {
                this.f14033s = d.f14040r;
            }
            if (!abstractRunnableC4742h.f14056r) {
                ExecutorC4735a.this.m18941L(abstractRunnableC4742h);
                return;
            }
            if (m18971r(d.f14040r)) {
                ExecutorC4735a.this.m18944T();
            }
            ExecutorC4735a.this.m18941L(abstractRunnableC4742h);
            ExecutorC4735a.m18935n().addAndGet(ExecutorC4735a.this, -2097152L);
            if (this.f14033s != d.f14043u) {
                this.f14033s = d.f14042t;
            }
        }

        /* JADX INFO: renamed from: c */
        public final AbstractRunnableC4742h m18957c(boolean z10) {
            AbstractRunnableC4742h abstractRunnableC4742hM18965l;
            AbstractRunnableC4742h abstractRunnableC4742hM18965l2;
            if (z10) {
                boolean z11 = m18963j(ExecutorC4735a.this.f14022q * 2) == 0;
                if (z11 && (abstractRunnableC4742hM18965l2 = m18965l()) != null) {
                    return abstractRunnableC4742hM18965l2;
                }
                AbstractRunnableC4742h abstractRunnableC4742hM18991k = this.f14031q.m18991k();
                if (abstractRunnableC4742hM18991k != null) {
                    return abstractRunnableC4742hM18991k;
                }
                if (!z11 && (abstractRunnableC4742hM18965l = m18965l()) != null) {
                    return abstractRunnableC4742hM18965l;
                }
            } else {
                AbstractRunnableC4742h abstractRunnableC4742hM18965l3 = m18965l();
                if (abstractRunnableC4742hM18965l3 != null) {
                    return abstractRunnableC4742hM18965l3;
                }
            }
            return m18972s(3);
        }

        /* JADX INFO: renamed from: d */
        public final AbstractRunnableC4742h m18958d() {
            AbstractRunnableC4742h abstractRunnableC4742hM18992l = this.f14031q.m18992l();
            if (abstractRunnableC4742hM18992l != null) {
                return abstractRunnableC4742hM18992l;
            }
            AbstractRunnableC4742h abstractRunnableC4742h = (AbstractRunnableC4742h) ExecutorC4735a.this.f14027v.m15238e();
            return abstractRunnableC4742h == null ? m18972s(1) : abstractRunnableC4742h;
        }

        /* JADX INFO: renamed from: e */
        public final AbstractRunnableC4742h m18959e(boolean z10) {
            return m18969p() ? m18957c(z10) : m18958d();
        }

        /* JADX INFO: renamed from: f */
        public final int m18960f() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: g */
        public final Object m18961g() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m18962i() {
            return this.nextParkedWorker != ExecutorC4735a.f14018B;
        }

        /* JADX INFO: renamed from: j */
        public final int m18963j(int i10) {
            int i11 = this.f14036v;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f14036v = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        /* JADX INFO: renamed from: k */
        public final void m18964k() {
            if (this.f14034t == 0) {
                this.f14034t = System.nanoTime() + ExecutorC4735a.this.f14024s;
            }
            LockSupport.parkNanos(ExecutorC4735a.this.f14024s);
            if (System.nanoTime() - this.f14034t >= 0) {
                this.f14034t = 0L;
                m18973t();
            }
        }

        /* JADX INFO: renamed from: l */
        public final AbstractRunnableC4742h m18965l() {
            int iM18963j = m18963j(2);
            ExecutorC4735a executorC4735a = ExecutorC4735a.this;
            if (iM18963j == 0) {
                AbstractRunnableC4742h abstractRunnableC4742h = (AbstractRunnableC4742h) executorC4735a.f14026u.m15238e();
                return abstractRunnableC4742h != null ? abstractRunnableC4742h : (AbstractRunnableC4742h) ExecutorC4735a.this.f14027v.m15238e();
            }
            AbstractRunnableC4742h abstractRunnableC4742h2 = (AbstractRunnableC4742h) executorC4735a.f14027v.m15238e();
            return abstractRunnableC4742h2 != null ? abstractRunnableC4742h2 : (AbstractRunnableC4742h) ExecutorC4735a.this.f14026u.m15238e();
        }

        /* JADX INFO: renamed from: m */
        public final void m18966m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC4735a.this.isTerminated() && this.f14033s != d.f14043u) {
                    AbstractRunnableC4742h abstractRunnableC4742hM18959e = m18959e(this.f14037w);
                    if (abstractRunnableC4742hM18959e != null) {
                        this.f14035u = 0L;
                        m18956b(abstractRunnableC4742hM18959e);
                    } else {
                        this.f14037w = false;
                        if (this.f14035u == 0) {
                            m18970q();
                        } else if (z10) {
                            m18971r(d.f14041s);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f14035u);
                            this.f14035u = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            m18971r(d.f14043u);
        }

        /* JADX INFO: renamed from: n */
        public final void m18967n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC4735a.this.f14025t);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* JADX INFO: renamed from: o */
        public final void m18968o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m18969p() {
            long j10;
            if (this.f14033s == d.f14039q) {
                return true;
            }
            ExecutorC4735a executorC4735a = ExecutorC4735a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM18935n = ExecutorC4735a.m18935n();
            do {
                j10 = atomicLongFieldUpdaterM18935n.get(executorC4735a);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC4735a.m18935n().compareAndSet(executorC4735a, j10, j10 - 4398046511104L));
            this.f14033s = d.f14039q;
            return true;
        }

        /* JADX INFO: renamed from: q */
        public final void m18970q() {
            if (!m18962i()) {
                ExecutorC4735a.this.m18939G(this);
                return;
            }
            f14030y.set(this, -1);
            while (m18962i() && f14030y.get(this) == -1 && !ExecutorC4735a.this.isTerminated() && this.f14033s != d.f14043u) {
                m18971r(d.f14041s);
                Thread.interrupted();
                m18964k();
            }
        }

        /* JADX INFO: renamed from: r */
        public final boolean m18971r(d dVar) {
            d dVar2 = this.f14033s;
            boolean z10 = dVar2 == d.f14039q;
            if (z10) {
                ExecutorC4735a.m18935n().addAndGet(ExecutorC4735a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f14033s = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m18966m();
        }

        /* JADX INFO: renamed from: s */
        public final AbstractRunnableC4742h m18972s(int i10) {
            int i11 = (int) (ExecutorC4735a.m18935n().get(ExecutorC4735a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iM18963j = m18963j(i11);
            ExecutorC4735a executorC4735a = ExecutorC4735a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iM18963j++;
                if (iM18963j > i11) {
                    iM18963j = 1;
                }
                c cVar = (c) executorC4735a.f14028w.m15267b(iM18963j);
                if (cVar != null && cVar != this) {
                    long jM18998r = cVar.f14031q.m18998r(i10, this.f14032r);
                    if (jM18998r == -1) {
                        C1050n0 c1050n0 = this.f14032r;
                        AbstractRunnableC4742h abstractRunnableC4742h = (AbstractRunnableC4742h) c1050n0.f3208q;
                        c1050n0.f3208q = null;
                        return abstractRunnableC4742h;
                    }
                    if (jM18998r > 0) {
                        jMin = Math.min(jMin, jM18998r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f14035u = jMin;
            return null;
        }

        /* JADX INFO: renamed from: t */
        public final void m18973t() {
            ExecutorC4735a executorC4735a = ExecutorC4735a.this;
            synchronized (executorC4735a.f14028w) {
                try {
                    if (executorC4735a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC4735a.m18935n().get(executorC4735a) & 2097151)) <= executorC4735a.f14022q) {
                        return;
                    }
                    if (f14030y.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        m18967n(0);
                        executorC4735a.m18940K(this, i10, 0);
                        int andDecrement = (int) (ExecutorC4735a.m18935n().getAndDecrement(executorC4735a) & 2097151);
                        if (andDecrement != i10) {
                            Object objM15267b = executorC4735a.f14028w.m15267b(andDecrement);
                            objM15267b.getClass();
                            c cVar = (c) objM15267b;
                            executorC4735a.f14028w.m15268c(i10, cVar);
                            cVar.m18967n(i10);
                            executorC4735a.m18940K(cVar, andDecrement, i10);
                        }
                        executorC4735a.f14028w.m15268c(andDecrement, null);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                        this.f14033s = d.f14043u;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(ExecutorC4735a executorC4735a, int i10) {
            this();
            m18967n(i10);
        }
    }
}
