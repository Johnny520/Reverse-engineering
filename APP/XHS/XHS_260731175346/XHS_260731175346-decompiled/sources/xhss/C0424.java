package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲈᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0424 extends xhss.AbstractC0473 {

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f1499;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f1500;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f1501;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f1502;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f1503;

    public C0424(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5) {
            r0 = this;
            r0.<init>()
            r0.f1501 = r1
            r0.f1503 = r2
            r0.f1499 = r3
            r0.f1500 = r4
            r0.f1502 = r5
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final boolean mo600(xhss.AbstractFutureC1123 r3, xhss.C0734 r4) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f1500
            xhss.ᛸᛲᛷᛱ r1 = xhss.C0734.f2466
            boolean r1 = r0.compareAndSet(r3, r4, r1)
            if (r1 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final boolean mo601(xhss.AbstractFutureC1123 r3, xhss.C0926 r4, xhss.C0926 r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f1499
            boolean r1 = r0.compareAndSet(r3, r4, r5)
            if (r1 == 0) goto La
            r2 = 1
            return r2
        La:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛸᛲᛷᛱ */
    public final void mo602(xhss.C0926 r1, java.lang.Thread r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r0.f1501
            r0.lazySet(r1, r2)
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛸᛶᛴᲈ */
    public final void mo603(xhss.C0926 r1, xhss.C0926 r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r0.f1503
            r0.lazySet(r1, r2)
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final boolean mo604(xhss.AbstractFutureC1123 r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f1502
            boolean r1 = r0.compareAndSet(r3, r4, r5)
            if (r1 == 0) goto La
            r2 = 1
            return r2
        La:
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r4) goto L0
            r2 = 0
            return r2
    }
}
