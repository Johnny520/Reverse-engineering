package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class do2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(do2.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(do2.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(do2.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(do2.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(do2.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final wt0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public do2(int i) {
        this.a = i;
        if (i <= 0) {
            s.c(vi0.g("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            s.c(vi0.g("The number of acquired permits should be in 0..", i));
            throw null;
        }
        go2 go2Var = new go2(0L, null, 2);
        this.head$volatile = go2Var;
        this.tail$volatile = go2Var;
        this._availablePermits$volatile = i;
        this.b = new wt0(9, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(gc3 gc3Var) {
        Object objR;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        go2 go2Var = (go2) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        bo2 bo2Var = bo2.o;
        long j = andIncrement / ((long) fo2.f);
        loop0: while (true) {
            objR = xe1.r(go2Var, j, bo2Var);
            if (!te.R(objR)) {
                lm2 lm2VarJ = te.J(objR);
                while (true) {
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.c >= lm2VarJ.c) {
                        break loop0;
                    }
                    if (!lm2VarJ.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarJ)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (lm2VarJ.f()) {
                                lm2VarJ.e();
                            }
                        }
                    }
                    if (lm2Var.f()) {
                        lm2Var.e();
                    }
                }
            } else {
                break;
            }
        }
        go2 go2Var2 = (go2) te.J(objR);
        AtomicReferenceArray atomicReferenceArray = go2Var2.e;
        int i = (int) (andIncrement % ((long) fo2.f));
        while (!atomicReferenceArray.compareAndSet(i, null, gc3Var)) {
            if (atomicReferenceArray.get(i) != null) {
                hh1 hh1Var = fo2.b;
                hh1 hh1Var2 = fo2.c;
                while (!atomicReferenceArray.compareAndSet(i, hh1Var, hh1Var2)) {
                    if (atomicReferenceArray.get(i) != hh1Var) {
                        return false;
                    }
                }
                ((lp) gc3Var).i(a83.a, this.b);
                return true;
            }
        }
        gc3Var.a(go2Var2, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i;
        Object objR;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            go2 go2Var = (go2) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / ((long) fo2.f);
            co2 co2Var = co2.o;
            while (true) {
                objR = xe1.r(go2Var, j, co2Var);
                if (te.R(objR)) {
                    break;
                }
                lm2 lm2VarJ = te.J(objR);
                while (true) {
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.c >= lm2VarJ.c) {
                        break;
                    }
                    if (!lm2VarJ.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarJ)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (lm2VarJ.f()) {
                                lm2VarJ.e();
                            }
                        }
                    }
                    if (lm2Var.f()) {
                        lm2Var.e();
                    }
                }
            }
            go2 go2Var2 = (go2) te.J(objR);
            AtomicReferenceArray atomicReferenceArray = go2Var2.e;
            go2Var2.b();
            z = false;
            if (go2Var2.c <= j) {
                int i3 = (int) (andIncrement2 % ((long) fo2.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, fo2.b);
                if (andSet == null) {
                    int i4 = fo2.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == fo2.c) {
                            z = true;
                            break;
                        }
                    }
                    hh1 hh1Var = fo2.b;
                    hh1 hh1Var2 = fo2.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, hh1Var, hh1Var2)) {
                            if (atomicReferenceArray.get(i3) != hh1Var) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != fo2.e) {
                    if (!(andSet instanceof lp)) {
                        c80.u("unexpected: ", andSet);
                        return;
                    }
                    lp lpVar = (lp) andSet;
                    hh1 hh1VarL = lpVar.l(a83.a, this.b);
                    if (hh1VarL != null) {
                        lpVar.C(hh1VarL);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
