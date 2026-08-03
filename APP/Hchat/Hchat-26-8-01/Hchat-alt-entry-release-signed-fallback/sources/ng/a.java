package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ng.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f9423a;

    public a(ng.j r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f9423a = r0
            return
    }

    @Override // ng.j
    public final java.util.Iterator iterator() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f9423a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            ng.j r0 = (ng.j) r0
            if (r0 == 0) goto L10
            java.util.Iterator r0 = r0.iterator()
            return r0
        L10:
            java.lang.String r0 = "This sequence can be consumed only once."
            j8.o.A(r0)
            r0 = 0
            return r0
    }
}
