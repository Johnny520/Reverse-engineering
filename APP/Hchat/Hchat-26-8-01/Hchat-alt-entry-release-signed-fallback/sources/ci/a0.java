package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class a0 extends x1.x0 {
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            if (r1 != r2) goto L4
            return r0
        L4:
            boolean r2 = r2 instanceof ci.a0
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r1 = this;
            ci.e0 r0 = new ci.e0
            r0.<init>()
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r4) {
            r3 = this;
            ci.e0 r4 = (ci.e0) r4
            r4.getClass()
            boolean r0 = r4.f1695w
            r1 = 1
            r2 = 0
            if (r0 == r1) goto Ld
            r0 = r1
            goto Le
        Ld:
            r0 = r2
        Le:
            r4.f1695w = r1
            r4.f1696x = r1
            if (r0 == 0) goto L1b
            boolean r0 = r4.f21832t
            if (r0 == 0) goto L1b
            r4.s1()
        L1b:
            x1.f0 r4 = x1.k.w(r4)
            r4.U(r2)
            return
    }

    public final int hashCode() {
            r2 = this;
            r0 = 1
            int r1 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 * 31
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "OverscrollElement(isVertical=true, nestedScrollToParent=true)"
            return r0
    }
}
