package z2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends r9.e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f22509n;

    public d(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5) {
            r0 = this;
            r0.<init>()
            r0.f22505j = r1
            r0.f22506k = r2
            r0.f22507l = r3
            r0.f22508m = r4
            r0.f22509n = r5
            return
    }

    @Override // r9.e0
    public final void a0(z2.f r2, z2.f r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r1.f22506k
            r0.lazySet(r2, r3)
            return
    }

    @Override // r9.e0
    public final void b0(z2.f r2, java.lang.Thread r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r1.f22505j
            r0.lazySet(r2, r3)
            return
    }

    @Override // r9.e0
    public final boolean k(z2.g r3, z2.c r4) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f22508m
            z2.c r1 = z2.c.f22503b
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

    @Override // r9.e0
    public final boolean l(z2.g r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f22509n
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

    @Override // r9.e0
    public final boolean m(z2.g r3, z2.f r4, z2.f r5) {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r2.f22507l
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
