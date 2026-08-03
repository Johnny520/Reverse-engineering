package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ro extends wb.to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.v0 f18929b;

    public ro(int r1, wb.v0 r2) {
            r0 = this;
            r0.<init>()
            r0.f18928a = r1
            r0.f18929b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof wb.ro
            if (r0 != 0) goto L8
            goto L1b
        L8:
            wb.ro r3 = (wb.ro) r3
            int r0 = r2.f18928a
            int r1 = r3.f18928a
            if (r0 == r1) goto L11
            goto L1b
        L11:
            wb.v0 r0 = r2.f18929b
            wb.v0 r3 = r3.f18929b
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
            int r0 = r2.f18928a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            wb.v0 r1 = r2.f18929b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContactPicker(listMode="
            r0.<init>(r1)
            int r1 = r2.f18928a
            r0.append(r1)
            java.lang.String r1 = ", request="
            r0.append(r1)
            wb.v0 r1 = r2.f18929b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
