package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21835a;

    public r(float r1) {
            r0 = this;
            r0.<init>()
            r0.f21835a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof y0.r
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            y0.r r4 = (y0.r) r4
            float r1 = r3.f21835a
            float r4 = r4.f21835a
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 == 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            y0.s r0 = new y0.s
            r0.<init>()
            float r1 = r2.f21835a
            r0.f21836u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            y0.s r2 = (y0.s) r2
            float r0 = r1.f21835a
            r2.f21836u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f21835a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ZIndexElement(zIndex="
            r0.<init>(r1)
            float r1 = r3.f21835a
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
