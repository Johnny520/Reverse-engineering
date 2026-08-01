package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ff {
    public final AtomicReferenceFieldUpdater A;
    public final AtomicReferenceFieldUpdater B;
    public final AtomicReferenceFieldUpdater C;
    public final AtomicReferenceFieldUpdater D;
    public final AtomicReferenceFieldUpdater E;

    public q(AtomicReferenceFieldUpdater r1, AtomicReferenceFieldUpdater r2, AtomicReferenceFieldUpdater r3, AtomicReferenceFieldUpdater r4, AtomicReferenceFieldUpdater r5) {
        this.A = r1;
        this.B = r2;
        this.C = r3;
        this.D = r4;
        this.E = r5;
    }

    @Override // defpackage.ff
    public final void F(s r2, s r3) {
        this.B.lazySet(r2, r3);
    }

    @Override // defpackage.ff
    public final void G(s r2, Thread r3) {
        this.A.lazySet(r2, r3);
    }

    @Override // defpackage.ff
    public final boolean e(t r3, p r4) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.D;
        if (r0.compareAndSet(r3, r4, p.b) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.ff
    public final boolean f(t r3, Object r4, Object r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.E;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }

    @Override // defpackage.ff
    public final boolean g(t r3, s r4, s r5) {
    L2:
        AtomicReferenceFieldUpdater r0 = this.C;
        if (r0.compareAndSet(r3, r4, r5) == true) goto L4;
        if (r0.get(r3) == r4) goto L2;
        return false;
    L4:
        return true;
    }
}
