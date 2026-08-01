package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes.dex */
public final class C0615q extends AbstractC0259gf {

    /* JADX INFO: renamed from: A */
    public final AtomicReferenceFieldUpdater f3762A;

    /* JADX INFO: renamed from: B */
    public final AtomicReferenceFieldUpdater f3763B;

    /* JADX INFO: renamed from: C */
    public final AtomicReferenceFieldUpdater f3764C;

    /* JADX INFO: renamed from: y */
    public final AtomicReferenceFieldUpdater f3765y;

    /* JADX INFO: renamed from: z */
    public final AtomicReferenceFieldUpdater f3766z;

    public C0615q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3765y = atomicReferenceFieldUpdater;
        this.f3766z = atomicReferenceFieldUpdater2;
        this.f3762A = atomicReferenceFieldUpdater3;
        this.f3763B = atomicReferenceFieldUpdater4;
        this.f3764C = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: O */
    public final void mo1267O(C0689s c0689s, C0689s c0689s2) {
        this.f3766z.lazySet(c0689s, c0689s2);
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: P */
    public final void mo1268P(C0689s c0689s, Thread thread) {
        this.f3765y.lazySet(c0689s, thread);
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: m */
    public final boolean mo1270m(AbstractFutureC0726t abstractFutureC0726t, C0578p c0578p) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3763B;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0726t, c0578p, C0578p.f3557b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0726t) == c0578p);
        return false;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: n */
    public final boolean mo1271n(AbstractFutureC0726t abstractFutureC0726t, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3764C;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0726t, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0726t) == obj);
        return false;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: o */
    public final boolean mo1272o(AbstractFutureC0726t abstractFutureC0726t, C0689s c0689s, C0689s c0689s2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3762A;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0726t, c0689s, c0689s2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0726t) == c0689s);
        return false;
    }
}
