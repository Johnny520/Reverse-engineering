package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class do2 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2131c = AtomicReferenceFieldUpdater.newUpdater(do2.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f2132d = AtomicLongFieldUpdater.newUpdater(do2.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2133e = AtomicReferenceFieldUpdater.newUpdater(do2.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f2134f = AtomicLongFieldUpdater.newUpdater(do2.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2135g = AtomicIntegerFieldUpdater.newUpdater(do2.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final int f2136a;

    /* JADX INFO: renamed from: b */
    public final wt0 f2137b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public do2(int i) {
        this.f2136a = i;
        if (i <= 0) {
            C0676s.m4645c(vi0.m5688g("Semaphore should have at least 1 permit, but had ", i));
            throw null;
        }
        if (i < 0) {
            C0676s.m4645c(vi0.m5688g("The number of acquired permits should be in 0..", i));
            throw null;
        }
        go2 go2Var = new go2(0L, null, 2);
        this.head$volatile = go2Var;
        this.tail$volatile = go2Var;
        this._availablePermits$volatile = i;
        this.f2137b = new wt0(9, this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1063a(gc3 gc3Var) {
        Object objM6141r;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2133e;
        go2 go2Var = (go2) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f2134f.getAndIncrement(this);
        bo2 bo2Var = bo2.f961o;
        long j = andIncrement / ((long) fo2.f3085f);
        loop0: while (true) {
            objM6141r = xe1.m6141r(go2Var, j, bo2Var);
            if (!AbstractC0731te.m5189R(objM6141r)) {
                lm2 lm2VarM5181J = AbstractC0731te.m5181J(objM6141r);
                while (true) {
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.f6198c >= lm2VarM5181J.f6198c) {
                        break loop0;
                    }
                    if (!lm2VarM5181J.m2946j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarM5181J)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (lm2VarM5181J.m2944f()) {
                                lm2VarM5181J.m3668e();
                            }
                        }
                    }
                    if (lm2Var.m2944f()) {
                        lm2Var.m3668e();
                    }
                }
            } else {
                break;
            }
        }
        go2 go2Var2 = (go2) AbstractC0731te.m5181J(objM6141r);
        AtomicReferenceArray atomicReferenceArray = go2Var2.f3643e;
        int i = (int) (andIncrement % ((long) fo2.f3085f));
        while (!atomicReferenceArray.compareAndSet(i, null, gc3Var)) {
            if (atomicReferenceArray.get(i) != null) {
                hh1 hh1Var = fo2.f3081b;
                hh1 hh1Var2 = fo2.f3082c;
                while (!atomicReferenceArray.compareAndSet(i, hh1Var, hh1Var2)) {
                    if (atomicReferenceArray.get(i) != hh1Var) {
                        return false;
                    }
                }
                ((InterfaceC0432lp) gc3Var).mo2510i(a83.f116a, this.f2137b);
                return true;
            }
        }
        gc3Var.mo1829a(go2Var2, i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1064b() {
        int i;
        Object objM6141r;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2135g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f2136a;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2131c;
            go2 go2Var = (go2) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f2132d.getAndIncrement(this);
            long j = andIncrement2 / ((long) fo2.f3085f);
            co2 co2Var = co2.f1640o;
            while (true) {
                objM6141r = xe1.m6141r(go2Var, j, co2Var);
                if (AbstractC0731te.m5189R(objM6141r)) {
                    break;
                }
                lm2 lm2VarM5181J = AbstractC0731te.m5181J(objM6141r);
                while (true) {
                    lm2 lm2Var = (lm2) atomicReferenceFieldUpdater.get(this);
                    if (lm2Var.f6198c >= lm2VarM5181J.f6198c) {
                        break;
                    }
                    if (!lm2VarM5181J.m2946j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, lm2Var, lm2VarM5181J)) {
                        if (atomicReferenceFieldUpdater.get(this) != lm2Var) {
                            if (lm2VarM5181J.m2944f()) {
                                lm2VarM5181J.m3668e();
                            }
                        }
                    }
                    if (lm2Var.m2944f()) {
                        lm2Var.m3668e();
                    }
                }
            }
            go2 go2Var2 = (go2) AbstractC0731te.m5181J(objM6141r);
            AtomicReferenceArray atomicReferenceArray = go2Var2.f3643e;
            go2Var2.m3666b();
            z = false;
            if (go2Var2.f6198c <= j) {
                int i3 = (int) (andIncrement2 % ((long) fo2.f3085f));
                Object andSet = atomicReferenceArray.getAndSet(i3, fo2.f3081b);
                if (andSet == null) {
                    int i4 = fo2.f3080a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == fo2.f3082c) {
                            z = true;
                            break;
                        }
                    }
                    hh1 hh1Var = fo2.f3081b;
                    hh1 hh1Var2 = fo2.f3083d;
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
                } else if (andSet != fo2.f3084e) {
                    if (!(andSet instanceof InterfaceC0432lp)) {
                        c80.m677u("unexpected: ", andSet);
                        return;
                    }
                    InterfaceC0432lp interfaceC0432lp = (InterfaceC0432lp) andSet;
                    hh1 hh1VarMo2511l = interfaceC0432lp.mo2511l(a83.f116a, this.f2137b);
                    if (hh1VarMo2511l != null) {
                        interfaceC0432lp.mo2507C(hh1VarMo2511l);
                        z = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z);
    }
}
