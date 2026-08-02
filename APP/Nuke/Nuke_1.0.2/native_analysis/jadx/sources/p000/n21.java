package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n21 extends oc1 implements ca0, cy0 {

    /* JADX INFO: renamed from: k */
    public r21 f6970k;

    @Override // p000.ca0
    /* JADX INFO: renamed from: a */
    public final void mo717a() {
        r21 r21VarM3225j = m3225j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r21.f9330h;
            Object obj = atomicReferenceFieldUpdater.get(r21VarM3225j);
            if (obj instanceof n21) {
                if (obj != this) {
                    return;
                }
                xd0 xd0Var = AbstractC0179eu.f2637k;
                while (!atomicReferenceFieldUpdater.compareAndSet(r21VarM3225j, obj, xd0Var)) {
                    if (atomicReferenceFieldUpdater.get(r21VarM3225j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof cy0) || ((cy0) obj).mo303d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = oc1.f7625h;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof d82) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                oc1 oc1Var = (oc1) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = oc1.f7627j;
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
                oc1Var.m3557f();
                return;
            }
        }
    }

    @Override // p000.cy0
    /* JADX INFO: renamed from: b */
    public final boolean mo302b() {
        return true;
    }

    @Override // p000.cy0
    /* JADX INFO: renamed from: d */
    public final bo1 mo303d() {
        return null;
    }

    public k21 getParent() {
        return m3225j();
    }

    /* JADX INFO: renamed from: j */
    public final r21 m3225j() {
        r21 r21Var = this.f6970k;
        if (r21Var != null) {
            return r21Var;
        }
        t11.m5067S("job");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1214k();

    /* JADX INFO: renamed from: l */
    public abstract void mo1215l(Throwable th);

    @Override // p000.oc1
    public final String toString() {
        return getClass().getSimpleName() + '@' + p40.m3740x(this) + "[job@" + p40.m3740x(m3225j()) + ']';
    }
}
