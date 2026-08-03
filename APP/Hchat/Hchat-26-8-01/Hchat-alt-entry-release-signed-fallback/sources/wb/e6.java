package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f15835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f15836c;

    public e6(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f15834a = r1
            r0.f15835b = r2
            r0.f15836c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof wb.e6
            if (r0 != 0) goto L8
            goto L2a
        L8:
            wb.e6 r3 = (wb.e6) r3
            java.lang.String r0 = r2.f15834a
            java.lang.String r1 = r3.f15834a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f15835b
            java.lang.String r1 = r3.f15835b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r0 = r2.f15836c
            java.lang.String r3 = r3.f15836c
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
            r3 = this;
            java.lang.String r0 = r3.f15834a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f15835b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f15836c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", summary="
            java.lang.String r2 = "MessageBlockTypeOption(key="
            java.lang.String r3 = r5.f15834a
            java.lang.String r4 = r5.f15835b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f15836c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
