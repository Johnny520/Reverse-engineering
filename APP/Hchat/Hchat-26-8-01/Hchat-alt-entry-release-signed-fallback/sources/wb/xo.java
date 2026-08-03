package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.Activity f20238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.sc f20239b;

    public xo(android.app.Activity r1, wb.sc r2) {
            r0 = this;
            r0.<init>()
            r0.f20238a = r1
            r0.f20239b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof wb.xo
            if (r0 != 0) goto L8
            goto L1f
        L8:
            wb.xo r3 = (wb.xo) r3
            android.app.Activity r0 = r2.f20238a
            android.app.Activity r1 = r3.f20238a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            wb.sc r0 = r2.f20239b
            wb.sc r3 = r3.f20239b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            android.app.Activity r0 = r2.f20238a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wb.sc r1 = r2.f20239b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PendingResult(activity="
            r0.<init>(r1)
            android.app.Activity r1 = r2.f20238a
            r0.append(r1)
            java.lang.String r1 = ", callback="
            r0.append(r1)
            wb.sc r1 = r2.f20239b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
