package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6637c;

    public v(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f6635a = r1
            r0.f6636b = r2
            r0.f6637c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof ia.v
            if (r0 != 0) goto L8
            goto L22
        L8:
            ia.v r3 = (ia.v) r3
            java.lang.String r0 = r2.f6635a
            java.lang.String r1 = r3.f6635a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L22
        L15:
            int r0 = r2.f6636b
            int r1 = r3.f6636b
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            int r0 = r2.f6637c
            int r3 = r3.f6637c
            if (r0 == r3) goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6635a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f6636b
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f6637c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", type="
            java.lang.String r1 = ", commentId="
            int r2 = r5.f6636b
            java.lang.String r3 = "Node(username="
            java.lang.String r4 = r5.f6635a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = ")"
            int r2 = r5.f6637c
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
