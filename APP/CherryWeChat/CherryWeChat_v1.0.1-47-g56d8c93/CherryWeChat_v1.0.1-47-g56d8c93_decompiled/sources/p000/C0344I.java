package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: I */
/* JADX INFO: loaded from: classes.dex */
public final class C0344I extends AbstractC0628Oj {

    /* JADX INFO: renamed from: p */
    public final AtomicReferenceFieldUpdater f1156p;

    /* JADX INFO: renamed from: q */
    public final AtomicReferenceFieldUpdater f1157q;

    /* JADX INFO: renamed from: r */
    public final AtomicReferenceFieldUpdater f1158r;

    /* JADX INFO: renamed from: s */
    public final AtomicReferenceFieldUpdater f1159s;

    /* JADX INFO: renamed from: t */
    public final AtomicReferenceFieldUpdater f1160t;

    public C0344I(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1156p = atomicReferenceFieldUpdater;
        this.f1157q = atomicReferenceFieldUpdater2;
        this.f1158r = atomicReferenceFieldUpdater3;
        this.f1159s = atomicReferenceFieldUpdater4;
        this.f1160t = atomicReferenceFieldUpdater5;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: O */
    public final void mo730O(C0430K c0430k, C0430K c0430k2) {
        this.f1157q.lazySet(c0430k, c0430k2);
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: P */
    public final void mo731P(C0430K c0430k, Thread thread) {
        this.f1156p.lazySet(c0430k, thread);
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: f */
    public final boolean mo732f(AbstractFutureC0473L abstractFutureC0473L, C0301H c0301h) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1159s;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0473L, c0301h, C0301H.f1014b)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0473L) == c0301h);
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: g */
    public final boolean mo733g(AbstractFutureC0473L abstractFutureC0473L, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1160t;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0473L, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0473L) == obj);
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: h */
    public final boolean mo734h(AbstractFutureC0473L abstractFutureC0473L, C0430K c0430k, C0430K c0430k2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1158r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0473L, c0430k, c0430k2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0473L) == c0430k);
        return false;
    }
}
