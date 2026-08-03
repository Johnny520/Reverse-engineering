package a7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f76g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c7.e f77h;

    public e(c7.e r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f77h = r1
            r0.f76g = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof a7.e
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            a7.e r2 = (a7.e) r2
            c7.e r0 = r1.f77h
            java.lang.String r0 = r0.a()
            c7.e r2 = r2.f77h
            java.lang.String r2 = r2.a()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            c7.e r0 = r1.f77h
            java.lang.String r0 = r0.a()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.List r0 = r1.f76g
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            c7.e r0 = r1.f77h
            java.lang.String r0 = r0.a()
            return r0
    }
}
