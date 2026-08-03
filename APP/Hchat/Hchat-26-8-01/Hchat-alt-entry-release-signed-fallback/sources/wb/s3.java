package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends wb.v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.a f18984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18985b;

    public s3(n9.a r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f18984a = r1
            r0.f18985b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof wb.s3
            if (r0 != 0) goto L8
            goto L1b
        L8:
            wb.s3 r3 = (wb.s3) r3
            n9.a r0 = r2.f18984a
            n9.a r1 = r3.f18984a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r0 = r2.f18985b
            boolean r3 = r3.f18985b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            n9.a r0 = r2.f18984a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f18985b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Editor(label="
            r0.<init>(r1)
            n9.a r1 = r2.f18984a
            r0.append(r1)
            java.lang.String r1 = ", existing="
            r0.append(r1)
            boolean r1 = r2.f18985b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
