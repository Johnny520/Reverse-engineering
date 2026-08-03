package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class f1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.m0 f12012a;

    public f1(s.m0 r1) {
            r0 = this;
            r0.<init>()
            r0.f12012a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof s.f1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.f1 r4 = (s.f1) r4
            s.m0 r1 = r3.f12012a
            s.m0 r4 = r4.f12012a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            s.g1 r0 = new s.g1
            r0.<init>()
            s.m0 r1 = r2.f12012a
            r0.f12016u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            s.g1 r2 = (s.g1) r2
            s.m0 r0 = r1.f12012a
            r2.f12016u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            s.m0 r0 = r1.f12012a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TraversablePrefetchStateModifierElement(prefetchState="
            r0.<init>(r1)
            s.m0 r1 = r2.f12012a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
