package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: h0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0266h0 extends pf1 {

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceFieldUpdater f2104l;

    /* JADX INFO: renamed from: m */
    public final AtomicReferenceFieldUpdater f2105m;

    /* JADX INFO: renamed from: n */
    public final AtomicReferenceFieldUpdater f2106n;

    /* JADX INFO: renamed from: o */
    public final AtomicReferenceFieldUpdater f2107o;

    /* JADX INFO: renamed from: p */
    public final AtomicReferenceFieldUpdater f2108p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0266h0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2104l = atomicReferenceFieldUpdater;
        this.f2105m = atomicReferenceFieldUpdater2;
        this.f2106n = atomicReferenceFieldUpdater3;
        this.f2107o = atomicReferenceFieldUpdater4;
        this.f2108p = atomicReferenceFieldUpdater5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: L */
    public final void mo1267L(C0338j0 c0338j0, C0338j0 c0338j02) {
        this.f2105m.lazySet(c0338j0, c0338j02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: M */
    public final void mo1268M(C0338j0 c0338j0, Thread thread) {
        this.f2104l.lazySet(c0338j0, thread);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: j */
    public final boolean mo1269j(AbstractFutureC0375k0 abstractFutureC0375k0, C0229g0 c0229g0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2107o;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0375k0, c0229g0, C0229g0.f1832b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0375k0) == c0229g0);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: k */
    public final boolean mo1270k(AbstractFutureC0375k0 abstractFutureC0375k0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2108p;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0375k0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0375k0) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.pf1
    /* JADX INFO: renamed from: l */
    public final boolean mo1271l(AbstractFutureC0375k0 abstractFutureC0375k0, C0338j0 c0338j0, C0338j0 c0338j02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2106n;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0375k0, c0338j0, c0338j02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0375k0) == c0338j0);
        return false;
    }
}
