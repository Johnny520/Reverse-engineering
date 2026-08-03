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

    public C0344I(AtomicReferenceFieldUpdater r1, AtomicReferenceFieldUpdater r2, AtomicReferenceFieldUpdater r3, AtomicReferenceFieldUpdater r4, AtomicReferenceFieldUpdater r5) {
        this.f1156p = r1;
        this.f1157q = r2;
        this.f1158r = r3;
        this.f1159s = r4;
        this.f1160t = r5;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: O */
    public final void mo730O(C0430K r2, C0430K r3) {
        this.f1157q.lazySet(r2, r3);
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: P */
    public final void mo731P(C0430K r2, Thread r3) {
        this.f1156p.lazySet(r2, r3);
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: f */
    public final boolean mo732f(AbstractFutureC0473L r3, C0301H r4) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.f1159s;
        if (r0.compareAndSet(r3, r4, C0301H.f1014b) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: g */
    public final boolean mo733g(AbstractFutureC0473L r3, Object r4, Object r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.f1160t;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: h */
    public final boolean mo734h(AbstractFutureC0473L r3, C0430K r4, C0430K r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.f1158r;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }
}
