package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class v extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14048a;

    public v(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f14048a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof v1.v
            if (r0 != 0) goto L8
            goto L14
        L8:
            v1.v r2 = (v1.v) r2
            java.lang.String r0 = r1.f14048a
            java.lang.String r2 = r2.f14048a
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            v1.x r0 = new v1.x
            r0.<init>()
            java.lang.String r1 = r2.f14048a
            r0.f14054u = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            v1.x r2 = (v1.x) r2
            java.lang.String r0 = r1.f14048a
            r2.f14054u = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f14048a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutIdElement(layoutId="
            r0.<init>(r1)
            java.lang.String r1 = r2.f14048a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
