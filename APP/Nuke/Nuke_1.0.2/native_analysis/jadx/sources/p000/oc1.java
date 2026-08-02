package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class oc1 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7625h = AtomicReferenceFieldUpdater.newUpdater(oc1.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7626i = AtomicReferenceFieldUpdater.newUpdater(oc1.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7627j = AtomicReferenceFieldUpdater.newUpdater(oc1.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: e */
    public final boolean m3556e(oc1 oc1Var, int i) {
        while (true) {
            oc1 oc1VarM3557f = m3557f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7626i;
            if (oc1VarM3557f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    oc1VarM3557f = (oc1) obj;
                    if (!oc1VarM3557f.mo580i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(oc1VarM3557f);
                }
            }
            if (oc1VarM3557f instanceof qb1) {
                return (((qb1) oc1VarM3557f).f8872k & i) == 0 && oc1VarM3557f.m3556e(oc1Var, i);
            }
            atomicReferenceFieldUpdater.set(oc1Var, oc1VarM3557f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7625h;
            atomicReferenceFieldUpdater2.set(oc1Var, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(oc1VarM3557f, this, oc1Var)) {
                if (atomicReferenceFieldUpdater2.get(oc1VarM3557f) != this) {
                    break;
                }
            }
            oc1Var.m3558g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((p000.d82) r6).f1911a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oc1 m3557f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7626i;
            oc1 oc1Var = (oc1) atomicReferenceFieldUpdater.get(this);
            oc1 oc1Var2 = oc1Var;
            while (true) {
                oc1 oc1Var3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7625h;
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
                    if (mo580i()) {
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

    /* JADX INFO: renamed from: g */
    public final void m3558g(oc1 oc1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7626i;
            oc1 oc1Var2 = (oc1) atomicReferenceFieldUpdater.get(oc1Var);
            if (f7625h.get(this) != oc1Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(oc1Var, oc1Var2, this)) {
                if (atomicReferenceFieldUpdater.get(oc1Var) != oc1Var2) {
                    break;
                }
            }
            if (mo580i()) {
                oc1Var.m3557f();
                return;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: h */
    public final oc1 m3559h() {
        Object obj = f7625h.get(this);
        d82 d82Var = obj instanceof d82 ? (d82) obj : null;
        if (d82Var != null) {
            return d82Var.f1911a;
        }
        obj.getClass();
        return (oc1) obj;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo580i() {
        return f7625h.get(this) instanceof d82;
    }

    public String toString() {
        return new u81(1, 1, p40.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + p40.m3740x(this);
    }
}
