package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 extends wb.b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20519b;

    public z3(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f20518a = r1
            r0.f20519b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.z3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.z3 r5 = (wb.z3) r5
            java.lang.String r1 = r4.f20518a
            java.lang.String r3 = r5.f20518a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f20519b
            java.lang.String r5 = r5.f20519b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f20518a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f20519b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", label="
            java.lang.String r1 = ")"
            java.lang.String r2 = "GroupEditor(groupId="
            java.lang.String r3 = r5.f20518a
            java.lang.String r4 = r5.f20519b
            java.lang.String r0 = bc.e.k(r2, r3, r0, r4, r1)
            return r0
    }
}
