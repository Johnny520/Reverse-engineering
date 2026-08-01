package p160f3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p061L2.C0971k;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p190k3.C2465m;
import p190k3.C2473u;

/* JADX INFO: renamed from: f3.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2108K extends AbstractC2109L implements InterfaceC2165y {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7039j = AtomicReferenceFieldUpdater.newUpdater(AbstractC2108K.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7040k = AtomicReferenceFieldUpdater.newUpdater(AbstractC2108K.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7041l = AtomicIntegerFieldUpdater.newUpdater(AbstractC2108K.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2153p
    /* JADX INFO: renamed from: D */
    public final void mo1207D(InterfaceC1051i interfaceC1051i, Runnable runnable) {
        mo3891N(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // p160f3.AbstractC2109L
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo3890K() {
        Runnable runnable;
        AbstractRunnableC2106I abstractRunnableC2106I;
        C1753n c1753n = AbstractC2162v.f7112c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7039j;
        if (!m3902L()) {
            m3892O();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C2465m)) {
                    if (obj != c1753n) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                C2465m c2465m = (C2465m) obj;
                Object objM4401d = c2465m.m4401d();
                if (objM4401d != C2465m.f7949g) {
                    runnable = (Runnable) objM4401d;
                    break;
                }
                C2465m c2465mM4400c = c2465m.m4400c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2465mM4400c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0971k c0971k = this.f7045h;
            if (((c0971k == null || c0971k.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C2465m) {
                        long j5 = C2465m.f7948f.get((C2465m) obj2);
                        if (((int) (1073741823 & j5)) != ((int) ((j5 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c1753n) {
                        return Long.MAX_VALUE;
                    }
                }
                C2107J c2107j = (C2107J) f7040k.get(this);
                if (c2107j != null) {
                    synchronized (c2107j) {
                        AbstractRunnableC2106I[] abstractRunnableC2106IArr = c2107j.f7962a;
                        abstractRunnableC2106I = abstractRunnableC2106IArr != null ? abstractRunnableC2106IArr[0] : null;
                    }
                    if (abstractRunnableC2106I != null) {
                        long jNanoTime = abstractRunnableC2106I.f7036d - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public void mo3891N(Runnable runnable) {
        m3892O();
        if (!m3893P(runnable)) {
            RunnableC2163w.f7120m.mo3891N(runnable);
            return;
        }
        Thread threadMo3900I = mo3900I();
        if (Thread.currentThread() != threadMo3900I) {
            LockSupport.unpark(threadMo3900I);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final void m3892O() {
        AbstractRunnableC2106I abstractRunnableC2106IM4409b;
        C2107J c2107j = (C2107J) f7040k.get(this);
        if (c2107j == null || C2473u.f7961b.get(c2107j) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c2107j) {
                try {
                    AbstractRunnableC2106I[] abstractRunnableC2106IArr = c2107j.f7962a;
                    AbstractRunnableC2106I abstractRunnableC2106I = abstractRunnableC2106IArr != null ? abstractRunnableC2106IArr[0] : null;
                    if (abstractRunnableC2106I != null) {
                        abstractRunnableC2106IM4409b = ((jNanoTime - abstractRunnableC2106I.f7036d) > 0L ? 1 : ((jNanoTime - abstractRunnableC2106I.f7036d) == 0L ? 0 : -1)) >= 0 ? m3893P(abstractRunnableC2106I) : false ? c2107j.m4409b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC2106IM4409b != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3893P(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7039j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f7041l.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof C2465m)) {
                        if (obj != AbstractC2162v.f7112c) {
                            C2465m c2465m = new C2465m(8, true);
                            c2465m.m4398a((Runnable) obj);
                            c2465m.m4398a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2465m)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    C2465m c2465m2 = (C2465m) obj;
                    int iM4398a = c2465m2.m4398a(runnable);
                    if (iM4398a == 0) {
                        break;
                    }
                    if (iM4398a == 1) {
                        C2465m c2465mM4400c = c2465m2.m4400c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2465mM4400c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM4398a == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3894Q() {
        C0971k c0971k = this.f7045h;
        if (c0971k != null ? c0971k.isEmpty() : true) {
            C2107J c2107j = (C2107J) f7040k.get(this);
            if (c2107j == null) {
                Object obj = f7039j.get(this);
                if (obj != null) {
                    if (obj instanceof C2465m) {
                        long j5 = C2465m.f7948f.get((C2465m) obj);
                        return ((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30));
                    }
                    if (obj == AbstractC2162v.f7112c) {
                    }
                }
                return true;
            }
            if (C2473u.f7961b.get(c2107j) == 0) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m3895R(long j5, AbstractRunnableC2106I abstractRunnableC2106I) {
        int iM3888b;
        Thread threadMo3900I;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7040k;
        if (f7041l.get(this) != 0) {
            iM3888b = 1;
        } else {
            C2107J c2107j = (C2107J) atomicReferenceFieldUpdater.get(this);
            if (c2107j == null) {
                C2107J c2107j2 = new C2107J();
                c2107j2.f7038c = j5;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2107j2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC1665j.m2982b(obj);
                c2107j = (C2107J) obj;
            }
            iM3888b = abstractRunnableC2106I.m3888b(j5, c2107j, this);
        }
        if (iM3888b != 0) {
            if (iM3888b == 1) {
                mo3903M(j5, abstractRunnableC2106I);
                return;
            } else {
                if (iM3888b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C2107J c2107j3 = (C2107J) atomicReferenceFieldUpdater.get(this);
        if (c2107j3 != null) {
            synchronized (c2107j3) {
                AbstractRunnableC2106I[] abstractRunnableC2106IArr = c2107j3.f7962a;
                abstractRunnableC2106I = abstractRunnableC2106IArr != null ? abstractRunnableC2106IArr[0] : null;
            }
        }
        if (abstractRunnableC2106I != abstractRunnableC2106I || Thread.currentThread() == (threadMo3900I = mo3900I())) {
            return;
        }
        LockSupport.unpark(threadMo3900I);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: d */
    public final void mo3896d(long j5, C2135g c2135g) {
        long j6 = j5 > 0 ? j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5 : 0L;
        if (j6 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C2104G c2104g = new C2104G(this, j6 + jNanoTime, c2135g);
            m3895R(jNanoTime, c2104g);
            c2135g.m3971x(new C2131e(1, c2104g));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: f */
    public InterfaceC2101D mo3897f(long j5, RunnableC2148m0 runnableC2148m0, InterfaceC1051i interfaceC1051i) {
        return AbstractC2164x.f7122a.mo3897f(j5, runnableC2148m0, interfaceC1051i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2109L
    public void shutdown() {
        AbstractRunnableC2106I abstractRunnableC2106IM4409b;
        AbstractC2144k0.f7083a.set(null);
        f7041l.set(this, 1);
        C1753n c1753n = AbstractC2162v.f7112c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7039j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C2465m)) {
                    if (obj != c1753n) {
                        C2465m c2465m = new C2465m(8, true);
                        c2465m.m4398a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2465m)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C2465m) obj).m4399b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1753n)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo3890K() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C2107J c2107j = (C2107J) f7040k.get(this);
            if (c2107j == null) {
                return;
            }
            synchronized (c2107j) {
                abstractRunnableC2106IM4409b = C2473u.f7961b.get(c2107j) > 0 ? c2107j.m4409b(0) : null;
            }
            if (abstractRunnableC2106IM4409b == null) {
                return;
            } else {
                mo3903M(jNanoTime, abstractRunnableC2106IM4409b);
            }
        }
    }
}
