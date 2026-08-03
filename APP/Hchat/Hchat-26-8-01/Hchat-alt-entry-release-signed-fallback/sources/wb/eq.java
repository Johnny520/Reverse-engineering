package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class eq extends wb.gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.v0 f16005a;

    public eq(wb.v0 r1) {
            r0 = this;
            r0.<init>()
            r0.f16005a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof wb.eq
            if (r0 != 0) goto L8
            goto L14
        L8:
            wb.eq r2 = (wb.eq) r2
            wb.v0 r0 = r1.f16005a
            wb.v0 r2 = r2.f16005a
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            wb.v0 r0 = r1.f16005a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContactPicker(request="
            r0.<init>(r1)
            wb.v0 r1 = r2.f16005a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
