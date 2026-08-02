package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qg0 extends lg0 implements r60 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(qg0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(qg0.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(qg0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c20
    public final void D(a20 a20Var, Runnable runnable) {
        L(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // defpackage.lg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long J() {
        Runnable runnable;
        og0 og0Var;
        hh1 hh1Var = tp0.j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        if (!K()) {
            M();
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
                Object objD = rc1Var.d();
                if (objD != rc1.g) {
                    runnable = (Runnable) objD;
                    break;
                }
                rc1 rc1VarC = rc1Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rc1VarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ag agVar = this.l;
            if (((agVar == null || agVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof rc1) {
                        long j = rc1.f.get((rc1) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == hh1Var) {
                        return Long.MAX_VALUE;
                    }
                }
                pg0 pg0Var = (pg0) o.get(this);
                if (pg0Var != null) {
                    synchronized (pg0Var) {
                        og0[] og0VarArr = pg0Var.a;
                        og0Var = og0VarArr != null ? og0VarArr[0] : null;
                    }
                    if (og0Var != null) {
                        long jNanoTime = og0Var.h - System.nanoTime();
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
    public void L(Runnable runnable) {
        M();
        if (!N(runnable)) {
            k50.q.L(runnable);
            return;
        }
        Thread threadO = O();
        if (Thread.currentThread() != threadO) {
            LockSupport.unpark(threadO);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M() {
        og0 og0VarB;
        pg0 pg0Var = (pg0) o.get(this);
        if (pg0Var == null || c23.b.get(pg0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (pg0Var) {
                try {
                    og0[] og0VarArr = pg0Var.a;
                    og0VarB = null;
                    og0 og0Var = og0VarArr != null ? og0VarArr[0] : null;
                    if (og0Var != null) {
                        if (jNanoTime - og0Var.h >= 0 ? N(og0Var) : false) {
                            og0VarB = pg0Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (og0VarB != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean N(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (p.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof rc1)) {
                        if (obj != tp0.j) {
                            rc1 rc1Var = new rc1(8, true);
                            rc1Var.a((Runnable) obj);
                            rc1Var.a(runnable);
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
                    int iA = rc1Var2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        rc1 rc1VarC = rc1Var2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rc1VarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
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

    public abstract Thread O();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P() {
        ag agVar = this.l;
        if (agVar != null ? agVar.isEmpty() : true) {
            pg0 pg0Var = (pg0) o.get(this);
            if (pg0Var == null) {
                Object obj = n.get(this);
                if (obj != null) {
                    if (obj instanceof rc1) {
                        long j = rc1.f.get((rc1) obj);
                        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                    }
                    if (obj == tp0.j) {
                    }
                }
                return true;
            }
            if (c23.b.get(pg0Var) == 0) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void Q(long j, og0 og0Var) {
        k50.q.R(j, og0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(long j, og0 og0Var) {
        int iB;
        Thread threadO;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
        if (p.get(this) == 1) {
            iB = 1;
        } else {
            pg0 pg0Var = (pg0) atomicReferenceFieldUpdater.get(this);
            if (pg0Var == null) {
                pg0 pg0Var2 = new pg0();
                pg0Var2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pg0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                pg0Var = (pg0) obj;
            }
            iB = og0Var.b(j, pg0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                Q(j, og0Var);
                return;
            } else {
                if (iB == 2) {
                    return;
                }
                s.l("unexpected result");
                return;
            }
        }
        pg0 pg0Var3 = (pg0) atomicReferenceFieldUpdater.get(this);
        if (pg0Var3 != null) {
            synchronized (pg0Var3) {
                og0[] og0VarArr = pg0Var3.a;
                og0Var = og0VarArr != null ? og0VarArr[0] : null;
            }
        }
        if (og0Var != og0Var || Thread.currentThread() == (threadO = O())) {
            return;
        }
        LockSupport.unpark(threadO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r60
    public final void h(long j, mp mpVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            mg0 mg0Var = new mg0(this, j2 + jNanoTime, mpVar);
            R(jNanoTime, mg0Var);
            mpVar.x(new hp(1, mg0Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lg0
    public void shutdown() {
        og0 og0VarB;
        a23.a.set(null);
        p.set(this, 1);
        hh1 hh1Var = tp0.j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof rc1)) {
                    if (obj != hh1Var) {
                        rc1 rc1Var = new rc1(8, true);
                        rc1Var.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rc1Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((rc1) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, hh1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (J() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            pg0 pg0Var = (pg0) o.get(this);
            if (pg0Var == null) {
                return;
            }
            synchronized (pg0Var) {
                og0VarB = c23.b.get(pg0Var) > 0 ? pg0Var.b(0) : null;
            }
            if (og0VarB == null) {
                return;
            } else {
                Q(jNanoTime, og0VarB);
            }
        }
    }
}
