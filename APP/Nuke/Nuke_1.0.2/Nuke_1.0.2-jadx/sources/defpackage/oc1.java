package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class oc1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(oc1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(oc1.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(oc1.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x000e */
    public final boolean e(oc1 oc1Var, int i2) {
        while (true) {
            oc1 oc1VarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            if (oc1VarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    oc1VarF = (oc1) obj;
                    if (!oc1VarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(oc1VarF);
                }
            }
            if (oc1VarF instanceof qb1) {
                return (((qb1) oc1VarF).k & i2) == 0 && oc1VarF.e(oc1Var, i2);
            }
            atomicReferenceFieldUpdater.set(oc1Var, oc1VarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
            atomicReferenceFieldUpdater2.set(oc1Var, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(oc1VarF, this, oc1Var)) {
                if (atomicReferenceFieldUpdater2.get(oc1VarF) != this) {
                    break;
                }
            }
            oc1Var.g(this);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((defpackage.d82) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oc1 f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            oc1 oc1Var = (oc1) atomicReferenceFieldUpdater.get(this);
            oc1 oc1Var2 = oc1Var;
            while (true) {
                oc1 oc1Var3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    Object obj = atomicReferenceFieldUpdater2.get(oc1Var2);
                    if (obj == this) {
                        if (oc1Var != oc1Var2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, oc1Var, oc1Var2)) {
                                if (atomicReferenceFieldUpdater.get(this) != oc1Var) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof d82)) {
                        obj.getClass();
                        oc1Var3 = oc1Var2;
                        oc1Var2 = (oc1) obj;
                    } else {
                        if (oc1Var3 != null) {
                            break;
                        }
                        oc1Var2 = (oc1) atomicReferenceFieldUpdater.get(oc1Var2);
                    }
                }
                oc1Var2 = oc1Var3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(oc1 oc1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            oc1 oc1Var2 = (oc1) atomicReferenceFieldUpdater.get(oc1Var);
            if (h.get(this) != oc1Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(oc1Var, oc1Var2, this)) {
                if (atomicReferenceFieldUpdater.get(oc1Var) != oc1Var2) {
                    break;
                }
            }
            if (i()) {
                oc1Var.f();
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final oc1 h() {
        Object obj = h.get(this);
        d82 d82Var = obj instanceof d82 ? (d82) obj : null;
        if (d82Var != null) {
            return d82Var.a;
        }
        obj.getClass();
        return (oc1) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean i() {
        return h.get(this) instanceof d82;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return new u81(1, 1, p40.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + p40.x(this);
    }
}
