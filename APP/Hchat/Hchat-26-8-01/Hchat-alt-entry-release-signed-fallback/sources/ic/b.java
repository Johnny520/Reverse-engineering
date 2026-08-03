package ic;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements hc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hc.c f6652g;

    public b(hc.c r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            hc.c r1 = (hc.c) r1
            r0.f6652g = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof ic.b
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            ic.b r2 = (ic.b) r2
            hc.c r2 = r2.f6652g
            hc.c r0 = r1.f6652g
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            hc.c r0 = r1.f6652g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 7
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            hc.c r0 = r3.f6652g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "NodeDeclareRef{"
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}
