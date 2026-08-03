package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f16451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.io.File f16452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.ns f16453c;

    public gr(android.app.Activity r1, java.io.File r2, wb.ns r3) {
            r0 = this;
            r0.<init>()
            r0.f16451a = r1
            r0.f16452b = r2
            r0.f16453c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof wb.gr
            if (r0 != 0) goto L8
            goto L2a
        L8:
            wb.gr r3 = (wb.gr) r3
            android.app.Activity r0 = r2.f16451a
            android.app.Activity r1 = r3.f16451a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.io.File r0 = r2.f16452b
            java.io.File r1 = r3.f16452b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            wb.ns r0 = r2.f16453c
            wb.ns r3 = r3.f16453c
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
            android.app.Activity r0 = r2.f16451a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.io.File r1 = r2.f16452b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            wb.ns r0 = r2.f16453c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PendingResult(activity="
            r0.<init>(r1)
            android.app.Activity r1 = r2.f16451a
            r0.append(r1)
            java.lang.String r1 = ", directory="
            r0.append(r1)
            java.io.File r1 = r2.f16452b
            r0.append(r1)
            java.lang.String r1 = ", callback="
            r0.append(r1)
            wb.ns r1 = r2.f16453c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
