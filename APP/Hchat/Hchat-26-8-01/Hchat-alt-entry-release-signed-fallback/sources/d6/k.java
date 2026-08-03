package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements java.util.Map.Entry {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6.i f2028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Short f2029h;

    public k(d6.i r1, java.lang.Short r2) {
            r0 = this;
            r0.<init>()
            r0.f2028g = r1
            r0.f2029h = r2
            return
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            d6.i r0 = r1.f2028g
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Short r0 = r1.f2029h
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
