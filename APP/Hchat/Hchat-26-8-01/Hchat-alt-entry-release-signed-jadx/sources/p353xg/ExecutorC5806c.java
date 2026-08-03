package p353xg;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p162l3.C2463q;
import p222p.AbstractC3199a;
import p249qg.AbstractC3603v;
import p332wb.AbstractC4855en;
import vg.C4566o;

/* JADX INFO: renamed from: xg.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5806c implements Executor, Closeable {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicLongFieldUpdater f23572n = AtomicLongFieldUpdater.newUpdater(ExecutorC5806c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicLongFieldUpdater f23573o = AtomicLongFieldUpdater.newUpdater(ExecutorC5806c.class, "controlState$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23574p = AtomicIntegerFieldUpdater.newUpdater(ExecutorC5806c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: q */
    public static final C2463q f23575q = new C2463q("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: g */
    public final int f23576g;

    /* JADX INFO: renamed from: h */
    public final int f23577h;

    /* JADX INFO: renamed from: i */
    public final long f23578i;

    /* JADX INFO: renamed from: j */
    public final String f23579j;

    /* JADX INFO: renamed from: k */
    public final C5809f f23580k;

    /* JADX INFO: renamed from: l */
    public final C5809f f23581l;

    /* JADX INFO: renamed from: m */
    public final C4566o f23582m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExecutorC5806c(int i9, int i10, long j3, String str) {
        this.f23576g = i9;
        this.f23577h = i10;
        this.f23578i = j3;
        this.f23579j = str;
        if (i9 < 1) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i10 < i9) {
            C2104o.m5291q(AbstractC3199a.m6837j(i10, "Max pool size ", " should be greater than or equals to core pool size ", i9));
            throw null;
        }
        if (i10 > 2097150) {
            C2104o.m5291q(AbstractC0921a.m2250m(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j3 <= 0) {
            C3193a.m6817f(j3, "Idle worker keep alive time ", " must be positive");
            throw null;
        }
        this.f23580k = new C5809f();
        this.f23581l = new C5809f();
        this.f23582m = new C4566o((i9 + 1) * 2);
        this.controlState$volatile = ((long) i9) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10530c(ExecutorC5806c executorC5806c, Runnable runnable, int i9) {
        executorC5806c.m10532b(runnable, false, (i9 & 4) == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m10531a() {
        synchronized (this.f23582m) {
            try {
                if (f23574p.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f23573o;
                long j3 = atomicLongFieldUpdater.get(this);
                int i9 = (int) (j3 & 2097151);
                int i10 = i9 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f23576g) {
                    return 0;
                }
                if (i9 >= this.f23577h) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f23582m.m9012b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C5804a c5804a = new C5804a(this, i11);
                this.f23582m.m9013c(i11, c5804a);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                c5804a.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10532b(Runnable runnable, boolean z9, boolean z10) {
        AbstractRunnableC5811h c5812i;
        EnumC5805b enumC5805b;
        AbstractC5813j.f23596f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC5811h) {
            c5812i = (AbstractRunnableC5811h) runnable;
            c5812i.f23588g = jNanoTime;
            c5812i.f23589h = z9;
        } else {
            c5812i = new C5812i(runnable, jNanoTime, z9);
        }
        boolean z11 = c5812i.f23589h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23573o;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C5804a c5804a = threadCurrentThread instanceof C5804a ? (C5804a) threadCurrentThread : null;
        if (c5804a == null || !c5804a.f23565n.equals(this)) {
            c5804a = null;
        }
        if (c5804a != null && (enumC5805b = c5804a.f23560i) != EnumC5805b.f23570k && (c5812i.f23589h || enumC5805b != EnumC5805b.f23567h)) {
            c5804a.f23564m = true;
            C5815l c5815l = c5804a.f23558g;
            if (z10) {
                c5812i = c5815l.m10536a(c5812i);
            } else {
                c5815l.getClass();
                AbstractRunnableC5811h abstractRunnableC5811h = (AbstractRunnableC5811h) C5815l.f23598b.getAndSet(c5815l, c5812i);
                c5812i = abstractRunnableC5811h == null ? null : c5815l.m10536a(abstractRunnableC5811h);
            }
        }
        if (c5812i != null) {
            if (!(c5812i.f23589h ? this.f23581l.m9003a(c5812i) : this.f23580k.m9003a(c5812i))) {
                throw new RejectedExecutionException(AbstractC0921a.m2255r(new StringBuilder(), this.f23579j, " was terminated"));
            }
        }
        boolean z12 = z10 && c5804a != null;
        if (z11) {
            if (z12 || m10535h() || m10534g(jAddAndGet)) {
                return;
            }
            m10535h();
            return;
        }
        if (z12 || m10535h() || m10534g(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m10535h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i9;
        AbstractRunnableC5811h abstractRunnableC5811hM10521a;
        if (f23574p.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C5804a c5804a = threadCurrentThread instanceof C5804a ? (C5804a) threadCurrentThread : null;
            if (c5804a == null || !c5804a.f23565n.equals(this)) {
                c5804a = null;
            }
            synchronized (this.f23582m) {
                i9 = (int) (f23573o.get(this) & 2097151);
            }
            if (1 <= i9) {
                int i10 = 1;
                while (true) {
                    Object objM9012b = this.f23582m.m9012b(i10);
                    objM9012b.getClass();
                    C5804a c5804a2 = (C5804a) objM9012b;
                    if (c5804a2 != c5804a) {
                        while (c5804a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c5804a2);
                            c5804a2.join(10000L);
                        }
                        C5815l c5815l = c5804a2.f23558g;
                        C5809f c5809f = this.f23581l;
                        c5815l.getClass();
                        AbstractRunnableC5811h abstractRunnableC5811h = (AbstractRunnableC5811h) C5815l.f23598b.getAndSet(c5815l, null);
                        if (abstractRunnableC5811h != null) {
                            c5809f.m9003a(abstractRunnableC5811h);
                        }
                        while (true) {
                            AbstractRunnableC5811h abstractRunnableC5811hM10537b = c5815l.m10537b();
                            if (abstractRunnableC5811hM10537b == null) {
                                break;
                            } else {
                                c5809f.m9003a(abstractRunnableC5811hM10537b);
                            }
                        }
                    }
                    if (i10 == i9) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f23581l.m9004b();
            this.f23580k.m9004b();
            while (true) {
                if (c5804a == null) {
                    abstractRunnableC5811hM10521a = (AbstractRunnableC5811h) this.f23580k.m9006d();
                    if (abstractRunnableC5811hM10521a == null && (abstractRunnableC5811hM10521a = (AbstractRunnableC5811h) this.f23581l.m9006d()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC5811hM10521a = c5804a.m10521a(true);
                    if (abstractRunnableC5811hM10521a == null) {
                    }
                }
                try {
                    abstractRunnableC5811hM10521a.run();
                } catch (Throwable th2) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                }
            }
            if (c5804a != null) {
                c5804a.m10528h(EnumC5805b.f23570k);
            }
            f23572n.set(this, 0L);
            f23573o.set(this, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10533e(C5804a c5804a, int i9, int i10) {
        while (true) {
            long j3 = f23572n.get(this);
            int i11 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i11 == i9) {
                if (i10 == 0) {
                    Object objM10523c = c5804a.m10523c();
                    while (true) {
                        if (objM10523c == f23575q) {
                            i11 = -1;
                            break;
                        }
                        if (objM10523c == null) {
                            i11 = 0;
                            break;
                        }
                        C5804a c5804a2 = (C5804a) objM10523c;
                        int iM10522b = c5804a2.m10522b();
                        if (iM10522b != 0) {
                            i11 = iM10522b;
                            break;
                        }
                        objM10523c = c5804a2.m10523c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f23572n.compareAndSet(this, j3, ((long) i11) | j4)) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m10530c(this, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m10534g(long j3) {
        int i9 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = this.f23576g;
        if (i9 < i10) {
            int iM10531a = m10531a();
            if (iM10531a == 1 && i10 > 1) {
                m10531a();
            }
            if (iM10531a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m10535h() {
        C2463q c2463q;
        int iM10522b;
        while (true) {
            long j3 = f23572n.get(this);
            C5804a c5804a = (C5804a) this.f23582m.m9012b((int) (2097151 & j3));
            if (c5804a == null) {
                c5804a = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object objM10523c = c5804a.m10523c();
                while (true) {
                    c2463q = f23575q;
                    if (objM10523c == c2463q) {
                        iM10522b = -1;
                        break;
                    }
                    if (objM10523c == null) {
                        iM10522b = 0;
                        break;
                    }
                    C5804a c5804a2 = (C5804a) objM10523c;
                    iM10522b = c5804a2.m10522b();
                    if (iM10522b != 0) {
                        break;
                    }
                    objM10523c = c5804a2.m10523c();
                }
                if (iM10522b >= 0) {
                    if (f23572n.compareAndSet(this, j3, ((long) iM10522b) | j4)) {
                        c5804a.m10527g(c2463q);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c5804a == null) {
                return false;
            }
            if (C5804a.f23557o.compareAndSet(c5804a, -1, 0)) {
                LockSupport.unpark(c5804a);
                return true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v6, 100 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v6, 98 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r12v6, 99 */
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C4566o c4566o = this.f23582m;
        int iM9011a = c4566o.m9011a();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iM9011a; i14++) {
            C5804a c5804a = (C5804a) c4566o.m9012b(i14);
            if (c5804a != null) {
                C5815l c5815l = c5804a.f23558g;
                c5815l.getClass();
                int i15 = C5815l.f23598b.get(c5815l) != null ? (C5815l.f23599c.get(c5815l) - C5815l.f23600d.get(c5815l)) + 1 : C5815l.f23599c.get(c5815l) - C5815l.f23600d.get(c5815l);
                int iOrdinal = c5804a.f23560i.ordinal();
                if (iOrdinal == 0) {
                    i9++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        C3193a.m6822k();
                        return null;
                    }
                    i13++;
                }
            }
        }
        long j3 = f23573o.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f23579j);
        sb5.append('@');
        sb5.append(AbstractC3603v.m7556j(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f23576g;
        sb5.append(i16);
        sb5.append(", max = ");
        AbstractC4855en.m9272p(sb5, this.f23577h, "}, Worker States {CPU = ", i9, ", blocking = ");
        AbstractC4855en.m9272p(sb5, i10, ", parked = ", i11, ", dormant = ");
        AbstractC4855en.m9272p(sb5, i12, ", terminated = ", i13, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f23580k.m9005c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f23581l.m9005c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j3));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j3) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
