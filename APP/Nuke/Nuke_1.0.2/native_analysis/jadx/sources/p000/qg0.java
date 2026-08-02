package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qg0 extends lg0 implements r60 {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8957n = AtomicReferenceFieldUpdater.newUpdater(qg0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8958o = AtomicReferenceFieldUpdater.newUpdater(qg0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8959p = AtomicIntegerFieldUpdater.newUpdater(qg0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p000.c20
    /* JADX INFO: renamed from: D */
    public final void mo612D(a20 a20Var, Runnable runnable) {
        mo2602L(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // p000.lg0
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo2907J() {
        Runnable runnable;
        og0 og0Var;
        hh1 hh1Var = tp0.f10883j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8957n;
        if (!m2908K()) {
            m4181M();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof rc1)) {
                    if (obj != hh1Var) {
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
                rc1 rc1Var = (rc1) obj;
                Object objM4431d = rc1Var.m4431d();
                if (objM4431d != rc1.f9506g) {
                    runnable = (Runnable) objM4431d;
                    break;
                }
                rc1 rc1VarM4430c = rc1Var.m4430c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rc1VarM4430c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C0017ag c0017ag = this.f6109l;
            if (((c0017ag == null || c0017ag.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof rc1) {
                        long j = rc1.f9505f.get((rc1) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == hh1Var) {
                        return Long.MAX_VALUE;
                    }
                }
                pg0 pg0Var = (pg0) f8958o.get(this);
                if (pg0Var != null) {
                    synchronized (pg0Var) {
                        og0[] og0VarArr = pg0Var.f1121a;
                        og0Var = og0VarArr != null ? og0VarArr[0] : null;
                    }
                    if (og0Var != null) {
                        long jNanoTime = og0Var.f7670h - System.nanoTime();
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

    /* JADX INFO: renamed from: L */
    public void mo2602L(Runnable runnable) {
        m4181M();
        if (!m4182N(runnable)) {
            k50.f5346q.mo2602L(runnable);
            return;
        }
        Thread threadMo2217O = mo2217O();
        if (Thread.currentThread() != threadMo2217O) {
            LockSupport.unpark(threadMo2217O);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4181M() {
        og0 og0VarM616b;
        pg0 pg0Var = (pg0) f8958o.get(this);
        if (pg0Var == null || c23.f1120b.get(pg0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (pg0Var) {
                try {
                    og0[] og0VarArr = pg0Var.f1121a;
                    og0VarM616b = null;
                    og0 og0Var = og0VarArr != null ? og0VarArr[0] : null;
                    if (og0Var != null) {
                        if (jNanoTime - og0Var.f7670h >= 0 ? m4182N(og0Var) : false) {
                            og0VarM616b = pg0Var.m616b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (og0VarM616b != null);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m4182N(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8957n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f8959p.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof rc1)) {
                        if (obj != tp0.f10883j) {
                            rc1 rc1Var = new rc1(8, true);
                            rc1Var.m4428a((Runnable) obj);
                            rc1Var.m4428a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rc1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    rc1 rc1Var2 = (rc1) obj;
                    int iM4428a = rc1Var2.m4428a(runnable);
                    if (iM4428a == 0) {
                        break;
                    }
                    if (iM4428a == 1) {
                        rc1 rc1VarM4430c = rc1Var2.m4430c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rc1VarM4430c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM4428a == 2) {
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

    /* JADX INFO: renamed from: O */
    public abstract Thread mo2217O();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4183P() {
        C0017ag c0017ag = this.f6109l;
        if (c0017ag != null ? c0017ag.isEmpty() : true) {
            pg0 pg0Var = (pg0) f8958o.get(this);
            if (pg0Var == null) {
                Object obj = f8957n.get(this);
                if (obj != null) {
                    if (obj instanceof rc1) {
                        long j = rc1.f9505f.get((rc1) obj);
                        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                    }
                    if (obj == tp0.f10883j) {
                    }
                }
                return true;
            }
            if (c23.f1120b.get(pg0Var) == 0) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public void mo2603Q(long j, og0 og0Var) {
        k50.f5346q.m4184R(j, og0Var);
    }

    /* JADX INFO: renamed from: R */
    public final void m4184R(long j, og0 og0Var) {
        int iM3561b;
        Thread threadMo2217O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8958o;
        if (f8959p.get(this) == 1) {
            iM3561b = 1;
        } else {
            pg0 pg0Var = (pg0) atomicReferenceFieldUpdater.get(this);
            if (pg0Var == null) {
                pg0 pg0Var2 = new pg0();
                pg0Var2.f8307c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pg0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                pg0Var = (pg0) obj;
            }
            iM3561b = og0Var.m3561b(j, pg0Var, this);
        }
        if (iM3561b != 0) {
            if (iM3561b == 1) {
                mo2603Q(j, og0Var);
                return;
            } else {
                if (iM3561b == 2) {
                    return;
                }
                C0676s.m4653l("unexpected result");
                return;
            }
        }
        pg0 pg0Var3 = (pg0) atomicReferenceFieldUpdater.get(this);
        if (pg0Var3 != null) {
            synchronized (pg0Var3) {
                og0[] og0VarArr = pg0Var3.f1121a;
                og0Var = og0VarArr != null ? og0VarArr[0] : null;
            }
        }
        if (og0Var != og0Var || Thread.currentThread() == (threadMo2217O = mo2217O())) {
            return;
        }
        LockSupport.unpark(threadMo2217O);
    }

    @Override // p000.r60
    /* JADX INFO: renamed from: h */
    public final void mo4185h(long j, C0469mp c0469mp) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            mg0 mg0Var = new mg0(this, j2 + jNanoTime, c0469mp);
            m4184R(jNanoTime, mg0Var);
            c0469mp.m3154x(new C0285hp(1, mg0Var));
        }
    }

    @Override // p000.lg0
    public void shutdown() {
        og0 og0VarM616b;
        a23.f41a.set(null);
        f8959p.set(this, 1);
        hh1 hh1Var = tp0.f10883j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8957n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof rc1)) {
                    if (obj != hh1Var) {
                        rc1 rc1Var = new rc1(8, true);
                        rc1Var.m4428a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rc1Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((rc1) obj).m4429b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, hh1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo2907J() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            pg0 pg0Var = (pg0) f8958o.get(this);
            if (pg0Var == null) {
                return;
            }
            synchronized (pg0Var) {
                og0VarM616b = c23.f1120b.get(pg0Var) > 0 ? pg0Var.m616b(0) : null;
            }
            if (og0VarM616b == null) {
                return;
            } else {
                mo2603Q(jNanoTime, og0VarM616b);
            }
        }
    }
}
