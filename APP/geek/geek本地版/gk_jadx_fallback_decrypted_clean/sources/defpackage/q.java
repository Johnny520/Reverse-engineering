package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q extends defpackage.ff {
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater A;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater B;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater C;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater D;
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater E;

    public q(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.C = r3
            r0.D = r4
            r0.E = r5
            return
    }

    @Override // defpackage.ff
    public final void F(defpackage.s r2, defpackage.s r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r1.B
            r0.lazySet(r2, r3)
            return
    }

    @Override // defpackage.ff
    public final void G(defpackage.s r2, java.lang.Thread r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r1.A
            r0.lazySet(r2, r3)
            return
    }

    @Override // defpackage.ff
    public final boolean e(defpackage.t r3, defpackage.p r4) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.D
            p r1 = defpackage.p.b
            boolean r1 = r0.compareAndSet(r3, r4, r1)
            if (r1 == 0) goto Lc
            r3 = 1
            return r3
        Lc:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r3 = 0
            return r3
    }

    @Override // defpackage.ff
    public final boolean f(defpackage.t r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.E
            boolean r1 = r0.compareAndSet(r3, r4, r5)
            if (r1 == 0) goto La
            r3 = 1
            return r3
        La:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r3 = 0
            return r3
    }

    @Override // defpackage.ff
    public final boolean g(defpackage.t r3, defpackage.s r4, defpackage.s r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.C
            boolean r1 = r0.compareAndSet(r3, r4, r5)
            if (r1 == 0) goto La
            r3 = 1
            return r3
        La:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r3 = 0
            return r3
    }
}
