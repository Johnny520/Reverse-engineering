package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ba.n f557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.dj f558c;

    public d(android.app.Activity r1, ba.n r2, wb.dj r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f556a = r1
            r0.f557b = r2
            r0.f558c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof ba.d
            if (r0 != 0) goto L8
            goto L26
        L8:
            ba.d r3 = (ba.d) r3
            android.app.Activity r0 = r2.f556a
            android.app.Activity r1 = r3.f556a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            ba.n r0 = r2.f557b
            ba.n r1 = r3.f557b
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            wb.dj r0 = r2.f558c
            wb.dj r3 = r3.f558c
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
            r2 = this;
            android.app.Activity r0 = r2.f556a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ba.n r1 = r2.f557b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            wb.dj r0 = r2.f558c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pending(activity="
            r0.<init>(r1)
            android.app.Activity r1 = r2.f556a
            r0.append(r1)
            java.lang.String r1 = ", slot="
            r0.append(r1)
            ba.n r1 = r2.f557b
            r0.append(r1)
            java.lang.String r1 = ", callback="
            r0.append(r1)
            wb.dj r1 = r2.f558c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
