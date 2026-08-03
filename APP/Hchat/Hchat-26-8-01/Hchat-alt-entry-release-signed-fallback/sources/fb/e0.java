package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f3510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f3511c;

    public e0(java.lang.String r1, java.util.List r2, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.f3509a = r1
            r0.f3510b = r2
            r0.f3511c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof fb.e0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fb.e0 r3 = (fb.e0) r3
            java.lang.String r0 = r2.f3509a
            java.lang.String r1 = r3.f3509a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.util.List r0 = r2.f3510b
            java.util.List r1 = r3.f3510b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.List r0 = r2.f3511c
            java.util.List r3 = r3.f3511c
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
            java.lang.String r0 = r3.f3509a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f3510b
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r1 = r3.f3511c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ReadResult(context="
            r0.<init>(r1)
            java.lang.String r1 = r2.f3509a
            r0.append(r1)
            java.lang.String r1 = ", imagePaths="
            r0.append(r1)
            java.util.List r1 = r2.f3510b
            r0.append(r1)
            java.lang.String r1 = ", notes="
            r0.append(r1)
            java.util.List r1 = r2.f3511c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
