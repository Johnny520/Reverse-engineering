package lh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f8057g;

    public a(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            java.lang.String r1 = kh.b.e(r1)
            r0.f8057g = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof lh.a
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            lh.a r2 = (lh.a) r2
            java.lang.String r2 = r2.f8057g
            java.lang.String r0 = r1.f8057g
            boolean r2 = gg.l.a(r0, r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f8057g
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f8057g
            java.lang.String r0 = kh.b.g(r0)
            return r0
    }
}
