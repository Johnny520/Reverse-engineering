package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: i3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0300i3 extends tp0 {

    /* JADX INFO: renamed from: r */
    public final AtomicReferenceFieldUpdater f4245r;

    /* JADX INFO: renamed from: s */
    public final AtomicReferenceFieldUpdater f4246s;

    /* JADX INFO: renamed from: t */
    public final AtomicReferenceFieldUpdater f4247t;

    /* JADX INFO: renamed from: u */
    public final AtomicReferenceFieldUpdater f4248u;

    /* JADX INFO: renamed from: v */
    public final AtomicReferenceFieldUpdater f4249v;

    public C0300i3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4245r = atomicReferenceFieldUpdater;
        this.f4246s = atomicReferenceFieldUpdater2;
        this.f4247t = atomicReferenceFieldUpdater3;
        this.f4248u = atomicReferenceFieldUpdater4;
        this.f4249v = atomicReferenceFieldUpdater5;
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: F */
    public final void mo2254F(C0373k3 c0373k3, C0373k3 c0373k32) {
        this.f4246s.lazySet(c0373k3, c0373k32);
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: G */
    public final void mo2255G(C0373k3 c0373k3, Thread thread) {
        this.f4245r.lazySet(c0373k3, thread);
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: j */
    public final boolean mo2256j(AbstractFutureC0410l3 abstractFutureC0410l3, C0263h3 c0263h3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4248u;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0410l3, c0263h3, C0263h3.f3808b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0410l3) == c0263h3);
        return false;
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: k */
    public final boolean mo2257k(AbstractFutureC0410l3 abstractFutureC0410l3, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4249v;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0410l3, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0410l3) == obj);
        return false;
    }

    @Override // p000.tp0
    /* JADX INFO: renamed from: l */
    public final boolean mo2258l(AbstractFutureC0410l3 abstractFutureC0410l3, C0373k3 c0373k3, C0373k3 c0373k32) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4247t;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0410l3, c0373k3, c0373k32)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0410l3) == c0373k3);
        return false;
    }
}
