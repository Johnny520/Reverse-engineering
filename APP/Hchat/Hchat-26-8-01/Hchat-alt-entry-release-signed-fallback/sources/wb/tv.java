package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class tv extends wb.vv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.wv f19341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.v0 f19342b;

    public tv(wb.wv r1, wb.v0 r2) {
            r0 = this;
            r0.<init>()
            r0.f19341a = r1
            r0.f19342b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof wb.tv
            if (r0 != 0) goto L8
            goto L1b
        L8:
            wb.tv r3 = (wb.tv) r3
            wb.wv r0 = r2.f19341a
            wb.wv r1 = r3.f19341a
            if (r0 == r1) goto L11
            goto L1b
        L11:
            wb.v0 r0 = r2.f19342b
            wb.v0 r3 = r3.f19342b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            wb.wv r0 = r2.f19341a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wb.v0 r1 = r2.f19342b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContactPicker(selection="
            r0.<init>(r1)
            wb.wv r1 = r2.f19341a
            r0.append(r1)
            java.lang.String r1 = ", request="
            r0.append(r1)
            wb.v0 r1 = r2.f19342b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
