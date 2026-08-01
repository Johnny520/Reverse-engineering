package defpackage;

/* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1736 extends defpackage.AbstractC0397 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7688;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7689;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7690;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7691;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7692;

    public C1736(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5) {
            r0 = this;
            r0.<init>()
            r0.f7690 = r1
            r0.f7691 = r2
            r0.f7692 = r3
            r0.f7688 = r4
            r0.f7689 = r5
            return
    }

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final boolean mo1154(defpackage.AbstractFutureC2017 r3, defpackage.C2246 r4, defpackage.C2246 r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f7692
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

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final boolean mo1155(defpackage.AbstractFutureC2017 r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f7689
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

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo1156(defpackage.AbstractFutureC2017 r3, defpackage.C1317 r4) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f7688
            ᛷᛷᲀᛴ r1 = defpackage.C1317.f5828
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

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᲁᲈᲇᲁ */
    public final void mo1157(defpackage.C2246 r1, java.lang.Thread r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r0.f7690
            r0.lazySet(r1, r2)
            return
    }

    @Override // defpackage.AbstractC0397
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public final void mo1158(defpackage.C2246 r1, defpackage.C2246 r2) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r0.f7691
            r0.lazySet(r1, r2)
            return
    }
}
