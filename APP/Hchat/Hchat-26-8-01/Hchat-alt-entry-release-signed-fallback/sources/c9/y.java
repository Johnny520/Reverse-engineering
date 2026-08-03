package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1438d;

    public y(java.lang.String r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f1435a = r2
            r0.f1436b = r3
            r0.f1437c = r1
            r0.f1438d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2b
        L3:
            boolean r0 = r3 instanceof c9.y
            if (r0 != 0) goto L8
            goto L29
        L8:
            c9.y r3 = (c9.y) r3
            int r0 = r2.f1435a
            int r1 = r3.f1435a
            if (r0 == r1) goto L11
            goto L29
        L11:
            int r0 = r2.f1436b
            int r1 = r3.f1436b
            if (r0 == r1) goto L18
            goto L29
        L18:
            java.lang.String r0 = r2.f1437c
            java.lang.String r1 = r3.f1437c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L23
            goto L29
        L23:
            boolean r0 = r2.f1438d
            boolean r3 = r3.f1438d
            if (r0 == r3) goto L2b
        L29:
            r3 = 0
            return r3
        L2b:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f1435a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f1436b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r3.f1437c
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f1438d
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", total="
            java.lang.String r1 = ", action="
            int r2 = r5.f1435a
            int r3 = r5.f1436b
            java.lang.String r4 = "BatchResult(success="
            java.lang.StringBuilder r0 = eh.a.s(r2, r3, r4, r0, r1)
            java.lang.String r1 = r5.f1437c
            r0.append(r1)
            java.lang.String r1 = ", failed="
            r0.append(r1)
            boolean r1 = r5.f1438d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
