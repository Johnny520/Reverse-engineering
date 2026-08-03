package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f19172c;

    public t5(java.lang.String r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f19170a = r1
            r0.f19171b = r2
            r0.f19172c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof wb.t5
            if (r0 != 0) goto L8
            goto L2a
        L8:
            wb.t5 r3 = (wb.t5) r3
            java.lang.String r0 = r2.f19170a
            java.lang.String r1 = r3.f19170a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f19171b
            java.lang.String r1 = r3.f19171b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.List r0 = r2.f19172c
            java.util.List r3 = r3.f19172c
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
            java.lang.String r0 = r3.f19170a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f19171b
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r1 = r3.f19172c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", contactIds="
            java.lang.String r2 = "MessageBlockLabelOption(id="
            java.lang.String r3 = r5.f19170a
            java.lang.String r4 = r5.f19171b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.util.List r1 = r5.f19172c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
