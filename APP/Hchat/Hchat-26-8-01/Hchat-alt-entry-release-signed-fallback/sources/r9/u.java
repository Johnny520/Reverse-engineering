package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f11799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.View f11800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.View f11801c;

    public u(android.view.ViewGroup r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            r0.<init>()
            r0.f11799a = r1
            r0.f11800b = r2
            r0.f11801c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof r9.u
            if (r0 != 0) goto L8
            goto L2a
        L8:
            r9.u r3 = (r9.u) r3
            android.view.ViewGroup r0 = r2.f11799a
            android.view.ViewGroup r1 = r3.f11799a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            android.view.View r0 = r2.f11800b
            android.view.View r1 = r3.f11800b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            android.view.View r0 = r2.f11801c
            android.view.View r3 = r3.f11801c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            android.view.ViewGroup r0 = r2.f11799a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.view.View r1 = r2.f11800b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.view.View r0 = r2.f11801c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BottomDetailsAnchor(parent="
            r0.<init>(r1)
            android.view.ViewGroup r1 = r2.f11799a
            r0.append(r1)
            java.lang.String r1 = ", layoutView="
            r0.append(r1)
            android.view.View r1 = r2.f11800b
            r0.append(r1)
            java.lang.String r1 = ", alignmentView="
            r0.append(r1)
            android.view.View r1 = r2.f11801c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
