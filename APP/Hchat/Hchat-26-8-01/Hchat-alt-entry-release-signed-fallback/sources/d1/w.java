package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class w extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1.v f1962a;

    public w(d1.v r1) {
            r0 = this;
            r0.<init>()
            r0.f1962a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof d1.w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d1.w r4 = (d1.w) r4
            d1.v r1 = r3.f1962a
            d1.v r4 = r4.f1962a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            d1.y r0 = new d1.y
            r0.<init>()
            d1.v r1 = r2.f1962a
            r0.f1963u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            d1.y r2 = (d1.y) r2
            d1.v r0 = r2.f1963u
            j0.b r0 = r0.f1961a
            r0.j(r2)
            d1.v r0 = r1.f1962a
            r2.f1963u = r0
            j0.b r0 = r0.f1961a
            r0.b(r2)
            return
    }

    public final int hashCode() {
            r1 = this;
            d1.v r0 = r1.f1962a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FocusRequesterElement(focusRequester="
            r0.<init>(r1)
            d1.v r1 = r2.f1962a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
