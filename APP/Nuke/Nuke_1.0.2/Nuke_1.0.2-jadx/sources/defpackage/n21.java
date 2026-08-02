package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n21 extends oc1 implements ca0, cy0 {
    public r21 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ca0
    public final void a() {
        r21 r21VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r21.h;
            Object obj = atomicReferenceFieldUpdater.get(r21VarJ);
            if (obj instanceof n21) {
                if (obj != this) {
                    return;
                }
                xd0 xd0Var = eu.k;
                while (!atomicReferenceFieldUpdater.compareAndSet(r21VarJ, obj, xd0Var)) {
                    if (atomicReferenceFieldUpdater.get(r21VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof cy0) || ((cy0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = oc1.h;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof d82) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                oc1 oc1Var = (oc1) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = oc1.j;
                d82 d82Var = (d82) atomicReferenceFieldUpdater3.get(oc1Var);
                if (d82Var == null) {
                    d82Var = new d82(oc1Var);
                    atomicReferenceFieldUpdater3.set(oc1Var, d82Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, d82Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                oc1Var.f();
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cy0
    public final boolean b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cy0
    public final bo1 d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k21 getParent() {
        return j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r21 j() {
        r21 r21Var = this.k;
        if (r21Var != null) {
            return r21Var;
        }
        t11.S("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.oc1
    public final String toString() {
        return getClass().getSimpleName() + '@' + p40.x(this) + "[job@" + p40.x(j()) + ']';
    }
}
