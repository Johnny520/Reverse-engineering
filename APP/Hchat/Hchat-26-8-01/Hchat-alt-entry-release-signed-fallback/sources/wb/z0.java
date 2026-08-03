package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends wb.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.a f20511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20512b;

    public z0(c9.a r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f20511a = r1
            r0.f20512b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof wb.z0
            if (r0 != 0) goto L8
            goto L1b
        L8:
            wb.z0 r3 = (wb.z0) r3
            c9.a r0 = r2.f20511a
            c9.a r1 = r3.f20511a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r0 = r2.f20512b
            boolean r3 = r3.f20512b
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
            c9.a r0 = r2.f20511a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f20512b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParentPicker(group="
            r0.<init>(r1)
            c9.a r1 = r2.f20511a
            r0.append(r1)
            java.lang.String r1 = ", existing="
            r0.append(r1)
            boolean r1 = r2.f20512b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
