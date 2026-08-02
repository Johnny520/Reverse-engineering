package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends tp0 {
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;
    public final AtomicReferenceFieldUpdater v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.r = atomicReferenceFieldUpdater;
        this.s = atomicReferenceFieldUpdater2;
        this.t = atomicReferenceFieldUpdater3;
        this.u = atomicReferenceFieldUpdater4;
        this.v = atomicReferenceFieldUpdater5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final void F(k3 k3Var, k3 k3Var2) {
        this.s.lazySet(k3Var, k3Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final void G(k3 k3Var, Thread thread) {
        this.r.lazySet(k3Var, thread);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final boolean j(l3 l3Var, h3 h3Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(l3Var, h3Var, h3.b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l3Var) == h3Var);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final boolean k(l3 l3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.v;
            if (atomicReferenceFieldUpdater.compareAndSet(l3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l3Var) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tp0
    public final boolean l(l3 l3Var, k3 k3Var, k3 k3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(l3Var, k3Var, k3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l3Var) == k3Var);
        return false;
    }
}
