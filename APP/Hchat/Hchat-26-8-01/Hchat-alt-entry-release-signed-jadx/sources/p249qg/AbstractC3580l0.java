package p249qg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p136j8.C2104o;
import p162l3.C2463q;
import tf.C4164k;
import vg.C4563l;
import vg.C4572u;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3580l0 extends AbstractC3565g0 implements InterfaceC3609y {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11588m = AtomicReferenceFieldUpdater.newUpdater(AbstractC3580l0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11589n = AtomicReferenceFieldUpdater.newUpdater(AbstractC3580l0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11590o = AtomicIntegerFieldUpdater.newUpdater(AbstractC3580l0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // p249qg.AbstractC3565g0
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo7524C() {
        Runnable runnable;
        AbstractRunnableC3574j0 abstractRunnableC3574j0;
        C2463q c2463q = AbstractC3603v.f11621c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11588m;
        if (!m7525D()) {
            m7532F();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C4563l)) {
                    if (obj != c2463q) {
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
                C4563l c4563l = (C4563l) obj;
                Object objM9010d = c4563l.m9010d();
                if (objM9010d != C4563l.f15044g) {
                    runnable = (Runnable) objM9010d;
                    break;
                }
                C4563l c4563lM9009c = c4563l.m9009c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4563lM9009c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C4164k c4164k = this.f11571k;
            if (((c4164k == null || c4164k.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C4563l) {
                        long j3 = C4563l.f15043f.get((C4563l) obj2);
                        if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c2463q) {
                        return Long.MAX_VALUE;
                    }
                }
                C3577k0 c3577k0 = (C3577k0) f11589n.get(this);
                if (c3577k0 != null) {
                    synchronized (c3577k0) {
                        AbstractRunnableC3574j0[] abstractRunnableC3574j0Arr = c3577k0.f15058a;
                        abstractRunnableC3574j0 = abstractRunnableC3574j0Arr != null ? abstractRunnableC3574j0Arr[0] : null;
                    }
                    if (abstractRunnableC3574j0 != null) {
                        long jNanoTime = abstractRunnableC3574j0.f11580g - System.nanoTime();
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
    /* JADX INFO: renamed from: E */
    public void mo7531E(Runnable runnable) {
        m7532F();
        if (!m7533G(runnable)) {
            RunnableC3605w.f11630p.mo7531E(runnable);
            return;
        }
        Thread threadMo7494H = mo7494H();
        if (Thread.currentThread() != threadMo7494H) {
            LockSupport.unpark(threadMo7494H);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m7532F() {
        AbstractRunnableC3574j0 abstractRunnableC3574j0M9018b;
        C3577k0 c3577k0 = (C3577k0) f11589n.get(this);
        if (c3577k0 == null || C4572u.f15057b.get(c3577k0) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c3577k0) {
                try {
                    AbstractRunnableC3574j0[] abstractRunnableC3574j0Arr = c3577k0.f15058a;
                    AbstractRunnableC3574j0 abstractRunnableC3574j0 = abstractRunnableC3574j0Arr != null ? abstractRunnableC3574j0Arr[0] : null;
                    if (abstractRunnableC3574j0 != null) {
                        abstractRunnableC3574j0M9018b = ((jNanoTime - abstractRunnableC3574j0.f11580g) > 0L ? 1 : ((jNanoTime - abstractRunnableC3574j0.f11580g) == 0L ? 0 : -1)) >= 0 ? m7533G(abstractRunnableC3574j0) : false ? c3577k0.m9018b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (abstractRunnableC3574j0M9018b != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7533G(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11588m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f11590o.get(this) == 0) {
                if (obj != null) {
                    if (!(obj instanceof C4563l)) {
                        if (obj != AbstractC3603v.f11621c) {
                            C4563l c4563l = new C4563l(8, true);
                            c4563l.m9007a((Runnable) obj);
                            c4563l.m9007a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4563l)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    C4563l c4563l2 = (C4563l) obj;
                    int iM9007a = c4563l2.m9007a(runnable);
                    if (iM9007a == 0) {
                        break;
                    }
                    if (iM9007a == 1) {
                        C4563l c4563lM9009c = c4563l2.m9009c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4563lM9009c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM9007a == 2) {
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

    /* JADX INFO: renamed from: H */
    public abstract Thread mo7494H();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public void mo7534I(long j3, AbstractRunnableC3574j0 abstractRunnableC3574j0) {
        RunnableC3605w.f11630p.m7535J(j3, abstractRunnableC3574j0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m7535J(long j3, AbstractRunnableC3574j0 abstractRunnableC3574j0) {
        int iM7528b;
        Thread threadMo7494H;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11589n;
        if (f11590o.get(this) != 0) {
            iM7528b = 1;
        } else {
            C3577k0 c3577k0 = (C3577k0) atomicReferenceFieldUpdater.get(this);
            if (c3577k0 == null) {
                C3577k0 c3577k02 = new C3577k0();
                c3577k02.f11584c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c3577k02) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                c3577k0 = (C3577k0) obj;
            }
            iM7528b = abstractRunnableC3574j0.m7528b(j3, c3577k0, this);
        }
        if (iM7528b != 0) {
            if (iM7528b == 1) {
                mo7534I(j3, abstractRunnableC3574j0);
                return;
            } else {
                if (iM7528b == 2) {
                    return;
                }
                C2104o.m5276A("unexpected result");
                return;
            }
        }
        C3577k0 c3577k03 = (C3577k0) atomicReferenceFieldUpdater.get(this);
        if (c3577k03 != null) {
            synchronized (c3577k03) {
                AbstractRunnableC3574j0[] abstractRunnableC3574j0Arr = c3577k03.f15058a;
                abstractRunnableC3574j0 = abstractRunnableC3574j0Arr != null ? abstractRunnableC3574j0Arr[0] : null;
            }
        }
        if (abstractRunnableC3574j0 != abstractRunnableC3574j0 || Thread.currentThread() == (threadMo7494H = mo7494H())) {
            return;
        }
        LockSupport.unpark(threadMo7494H);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEmpty() {
        C4164k c4164k = this.f11571k;
        if (c4164k != null ? c4164k.isEmpty() : true) {
            C3577k0 c3577k0 = (C3577k0) f11589n.get(this);
            if (c3577k0 == null) {
                Object obj = f11588m.get(this);
                if (obj != null) {
                    if (obj instanceof C4563l) {
                        long j3 = C4563l.f15043f.get((C4563l) obj);
                        return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
                    }
                    if (obj == AbstractC3603v.f11621c) {
                    }
                }
                return true;
            }
            if (C4572u.f15057b.get(c3577k0) == 0) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3609y
    /* JADX INFO: renamed from: q */
    public InterfaceC3556d0 mo7536q(long j3, RunnableC3575j1 runnableC3575j1, InterfaceC5561g interfaceC5561g) {
        return AbstractC3607x.f11636a.mo7536q(j3, runnableC3575j1, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3565g0
    public void shutdown() {
        AbstractRunnableC3574j0 abstractRunnableC3574j0M9018b;
        AbstractC3569h1.f11575a.set(null);
        f11590o.set(this, 1);
        C2463q c2463q = AbstractC3603v.f11621c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11588m;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C4563l)) {
                    if (obj != c2463q) {
                        C4563l c4563l = new C4563l(8, true);
                        c4563l.m9007a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4563l)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C4563l) obj).m9008b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2463q)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo7524C() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C3577k0 c3577k0 = (C3577k0) f11589n.get(this);
            if (c3577k0 == null) {
                return;
            }
            synchronized (c3577k0) {
                abstractRunnableC3574j0M9018b = C4572u.f15057b.get(c3577k0) > 0 ? c3577k0.m9018b(0) : null;
            }
            if (abstractRunnableC3574j0M9018b == null) {
                return;
            } else {
                mo7534I(jNanoTime, abstractRunnableC3574j0M9018b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3609y
    /* JADX INFO: renamed from: u */
    public final void mo7537u(long j3, C3564g c3564g) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C3568h0 c3568h0 = new C3568h0(this, j4 + jNanoTime, c3564g);
            m7535J(jNanoTime, c3568h0);
            c3564g.m7516s(new C3558e(c3568h0, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3591p
    /* JADX INFO: renamed from: w */
    public final void mo7538w(InterfaceC5561g interfaceC5561g, Runnable runnable) {
        mo7531E(runnable);
    }
}
