package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: tg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2545tg extends AbstractC2588ug implements InterfaceC2413qd {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8861e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2545tg.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8862f = AtomicReferenceFieldUpdater.newUpdater(AbstractC2545tg.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8863g = AtomicIntegerFieldUpdater.newUpdater(AbstractC2545tg.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: B */
    public void mo1323B(Runnable runnable) {
        m5026C();
        if (!m5027D(runnable)) {
            RunnableC0664Pc.f2120h.mo1323B(runnable);
            return;
        }
        Thread threadMo1325x = mo1325x();
        if (Thread.currentThread() != threadMo1325x) {
            LockSupport.unpark(threadMo1325x);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m5026C() {
        AbstractRunnableC2459rg abstractRunnableC2459rgM2331b;
        C2502sg c2502sg = (C2502sg) f8862f.get(this);
        if (c2502sg == null || C1209bB.f4139b.get(c2502sg) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c2502sg) {
                try {
                    AbstractRunnableC2459rg[] abstractRunnableC2459rgArr = c2502sg.f4140a;
                    AbstractRunnableC2459rg abstractRunnableC2459rg = abstractRunnableC2459rgArr != null ? abstractRunnableC2459rgArr[0] : null;
                    if (abstractRunnableC2459rg != null) {
                        abstractRunnableC2459rgM2331b = ((jNanoTime - abstractRunnableC2459rg.f8666a) > 0L ? 1 : ((jNanoTime - abstractRunnableC2459rg.f8666a) == 0L ? 0 : -1)) >= 0 ? m5027D(abstractRunnableC2459rg) : false ? c2502sg.m2331b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC2459rgM2331b != null);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5027D(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8861e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f8863g.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof C1422fp)) {
                        if (obj != AbstractC0628Oj.f2012f) {
                            C1422fp c1422fp = new C1422fp(8, true);
                            c1422fp.m2732a((Runnable) obj);
                            c1422fp.m2732a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1422fp)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    C1422fp c1422fp2 = (C1422fp) obj;
                    int iM2732a = c1422fp2.m2732a(runnable);
                    if (iM2732a == 0) {
                        break;
                    }
                    if (iM2732a == 1) {
                        C1422fp c1422fpM2734c = c1422fp2.m2734c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1422fpM2734c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM2732a == 2) {
                        return false;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5028E() {
        C0134D4 c0134d4 = this.f8959d;
        if (c0134d4 != null ? c0134d4.isEmpty() : true) {
            C2502sg c2502sg = (C2502sg) f8862f.get(this);
            if (c2502sg == null) {
                Object obj = f8861e.get(this);
                if (obj != null) {
                    if (obj instanceof C1422fp) {
                        long j = C1422fp.f5016f.get((C1422fp) obj);
                        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                    }
                    if (obj == AbstractC0628Oj.f2012f) {
                    }
                }
                return true;
            }
            if (C1209bB.f4139b.get(c2502sg) == 0) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5029F() {
        Runnable runnable;
        AbstractRunnableC2459rg abstractRunnableC2459rg;
        C2610v1 c2610v1 = AbstractC0628Oj.f2012f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8861e;
        if (!m5097z()) {
            m5026C();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof C1422fp)) {
                    if (obj != c2610v1) {
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
                C1422fp c1422fp = (C1422fp) obj;
                Object objM2735d = c1422fp.m2735d();
                if (objM2735d != C1422fp.f5017g) {
                    runnable = (Runnable) objM2735d;
                    break;
                }
                C1422fp c1422fpM2734c = c1422fp.m2734c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1422fpM2734c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0134D4 c0134d4 = this.f8959d;
            if (((c0134d4 == null || c0134d4.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C1422fp) {
                        long j = C1422fp.f5016f.get((C1422fp) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c2610v1) {
                        return Long.MAX_VALUE;
                    }
                }
                C2502sg c2502sg = (C2502sg) f8862f.get(this);
                if (c2502sg != null) {
                    synchronized (c2502sg) {
                        AbstractRunnableC2459rg[] abstractRunnableC2459rgArr = c2502sg.f4140a;
                        abstractRunnableC2459rg = abstractRunnableC2459rgArr != null ? abstractRunnableC2459rgArr[0] : null;
                    }
                    if (abstractRunnableC2459rg != null) {
                        long jNanoTime = abstractRunnableC2459rg.f8666a - System.nanoTime();
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

    /* JADX INFO: renamed from: G */
    public final void m5030G(long j, AbstractRunnableC2459rg abstractRunnableC2459rg) {
        int iM4950c;
        Thread threadMo1325x;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8862f;
        if (f8863g.get(this) == 1) {
            iM4950c = 1;
        } else {
            C2502sg c2502sg = (C2502sg) atomicReferenceFieldUpdater.get(this);
            if (c2502sg == null) {
                C2502sg c2502sg2 = new C2502sg();
                c2502sg2.f8789c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2502sg2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                c2502sg = (C2502sg) atomicReferenceFieldUpdater.get(this);
            }
            iM4950c = abstractRunnableC2459rg.m4950c(j, c2502sg, this);
        }
        if (iM4950c != 0) {
            if (iM4950c == 1) {
                mo1322A(j, abstractRunnableC2459rg);
                return;
            } else {
                if (iM4950c != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C2502sg c2502sg3 = (C2502sg) atomicReferenceFieldUpdater.get(this);
        if (c2502sg3 != null) {
            synchronized (c2502sg3) {
                AbstractRunnableC2459rg[] abstractRunnableC2459rgArr = c2502sg3.f4140a;
                abstractRunnableC2459rg = abstractRunnableC2459rgArr != null ? abstractRunnableC2459rgArr[0] : null;
            }
        }
        if (abstractRunnableC2459rg != abstractRunnableC2459rg || Thread.currentThread() == (threadMo1325x = mo1325x())) {
            return;
        }
        LockSupport.unpark(threadMo1325x);
    }

    @Override // p000.InterfaceC2413qd
    /* JADX INFO: renamed from: f */
    public final void mo2668f(long j, C0523M6 c0523m6) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C2416qg c2416qg = new C2416qg(this, j2 + jNanoTime, c0523m6);
            m5030G(jNanoTime, c2416qg);
            AbstractC0828TB.m1649r(c0523m6, new C0394J6(1, c2416qg));
        }
    }

    @Override // p000.AbstractC2588ug
    public void shutdown() {
        AbstractRunnableC2459rg abstractRunnableC2459rgM2331b;
        AbstractC1129aB.f3579a.set(null);
        f8863g.set(this, 1);
        C2610v1 c2610v1 = AbstractC0628Oj.f2012f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8861e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C1422fp)) {
                    if (obj != c2610v1) {
                        C1422fp c1422fp = new C1422fp(8, true);
                        c1422fp.m2732a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1422fp)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C1422fp) obj).m2733b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2610v1)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m5029F() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C2502sg c2502sg = (C2502sg) f8862f.get(this);
            if (c2502sg == null) {
                return;
            }
            synchronized (c2502sg) {
                abstractRunnableC2459rgM2331b = C1209bB.f4139b.get(c2502sg) > 0 ? c2502sg.m2331b(0) : null;
            }
            if (abstractRunnableC2459rgM2331b == null) {
                return;
            } else {
                mo1322A(jNanoTime, abstractRunnableC2459rgM2331b);
            }
        }
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac interfaceC1137ac, Runnable runnable) {
        mo1323B(runnable);
    }
}
