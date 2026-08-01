package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes.dex */
public final class C0616q extends AbstractC0222ff {

    /* JADX INFO: renamed from: A */
    public final AtomicReferenceFieldUpdater f3964A;

    /* JADX INFO: renamed from: B */
    public final AtomicReferenceFieldUpdater f3965B;

    /* JADX INFO: renamed from: C */
    public final AtomicReferenceFieldUpdater f3966C;

    /* JADX INFO: renamed from: D */
    public final AtomicReferenceFieldUpdater f3967D;

    /* JADX INFO: renamed from: E */
    public final AtomicReferenceFieldUpdater f3968E;

    public C0616q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3964A = atomicReferenceFieldUpdater;
        this.f3965B = atomicReferenceFieldUpdater2;
        this.f3966C = atomicReferenceFieldUpdater3;
        this.f3967D = atomicReferenceFieldUpdater4;
        this.f3968E = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: F */
    public final void mo1206F(C0690s c0690s, C0690s c0690s2) {
        this.f3965B.lazySet(c0690s, c0690s2);
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: G */
    public final void mo1207G(C0690s c0690s, Thread thread) {
        this.f3964A.lazySet(c0690s, thread);
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: e */
    public final boolean mo1208e(AbstractFutureC0727t abstractFutureC0727t, C0578p c0578p) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3967D;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0727t, c0578p, C0578p.f3625b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0727t) == c0578p);
        return false;
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: f */
    public final boolean mo1209f(AbstractFutureC0727t abstractFutureC0727t, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3968E;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0727t, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0727t) == obj);
        return false;
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: g */
    public final boolean mo1210g(AbstractFutureC0727t abstractFutureC0727t, C0690s c0690s, C0690s c0690s2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3966C;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0727t, c0690s, c0690s2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0727t) == c0690s);
        return false;
    }
}
