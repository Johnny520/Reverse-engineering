package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kl1 extends do2 implements il1 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5630h = AtomicReferenceFieldUpdater.newUpdater(kl1.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public kl1() {
        super(1);
        this.owner$volatile = ci0.f1566v;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2719c() {
        return Math.max(do2.f2135g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0.mo2510i(r1, r4.f2137b);
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2720d(u00 u00Var) {
        boolean zM2721e = m2721e();
        a83 a83Var = a83.f116a;
        if (!zM2721e) {
            C0469mp c0469mpM4221B = qp0.m4221B(gf1.m1908z(u00Var));
            try {
                jl1 jl1Var = new jl1(this, c0469mpM4221B);
                while (true) {
                    int andDecrement = do2.f2135g.getAndDecrement(this);
                    if (andDecrement <= this.f2136a) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (m1063a(jl1Var)) {
                            break;
                        }
                    }
                }
                Object objM3150t = c0469mpM4221B.m3150t();
                k20 k20Var = k20.f5323h;
                if (objM3150t != k20Var) {
                    objM3150t = a83Var;
                }
                if (objM3150t == k20Var) {
                    return objM3150t;
                }
            } catch (Throwable th) {
                c0469mpM4221B.m3140D();
                throw th;
            }
        }
        return a83Var;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2721e() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = do2.f2135g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f2136a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f5630h.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2722f(Object obj) {
        while (m2719c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5630h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            hh1 hh1Var = ci0.f1566v;
            if (obj2 != hh1Var) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, hh1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m1064b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        C0676s.m4653l("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + p40.m3740x(this) + "[isLocked=" + m2719c() + ",owner=" + f5630h.get(this) + ']';
    }
}
