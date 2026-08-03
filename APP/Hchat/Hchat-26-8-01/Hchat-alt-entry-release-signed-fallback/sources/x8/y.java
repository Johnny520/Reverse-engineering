package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21383c;

    public y(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f21381a = r3
            r0.f21382b = r1
            r0.f21383c = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof x8.y
            if (r0 != 0) goto L8
            goto L26
        L8:
            x8.y r3 = (x8.y) r3
            boolean r0 = r2.f21381a
            boolean r1 = r3.f21381a
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f21382b
            java.lang.String r1 = r3.f21382b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r0 = r2.f21383c
            java.lang.String r3 = r3.f21383c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f21381a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f21382b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f21383c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "XiaozhiMcpStatus(connected="
            r0.<init>(r1)
            boolean r1 = r3.f21381a
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r3.f21382b
            r0.append(r1)
            java.lang.String r1 = ", detail="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f21383c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
