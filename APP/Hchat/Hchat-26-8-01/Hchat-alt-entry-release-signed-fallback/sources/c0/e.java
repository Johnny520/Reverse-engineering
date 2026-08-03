package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class e extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.u0 f942a;

    public e(h0.u0 r1) {
            r0 = this;
            r0.<init>()
            r0.f942a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof c0.e
            if (r0 != 0) goto L8
            goto L10
        L8:
            c0.e r2 = (c0.e) r2
            h0.u0 r2 = r2.f942a
            h0.u0 r0 = r1.f942a
            if (r0 == r2) goto L12
        L10:
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            c0.j r0 = new c0.j
            h0.u0 r1 = r2.f942a
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            c0.j r2 = (c0.j) r2
            h0.u0 r0 = r1.f942a
            r2.f954w = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            h0.u0 r0 = r1.f942a
            int r0 = r0.hashCode()
            return r0
    }
}
