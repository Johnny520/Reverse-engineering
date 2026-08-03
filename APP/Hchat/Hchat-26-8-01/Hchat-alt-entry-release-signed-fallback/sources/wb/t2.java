package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends wb.x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.c3 f19161a;

    public t2(wb.c3 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f19161a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof wb.t2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.t2 r4 = (wb.t2) r4
            wb.c3 r1 = r3.f19161a
            wb.c3 r4 = r4.f19161a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            wb.c3 r0 = r1.f19161a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FeatureGroup(group="
            r0.<init>(r1)
            wb.c3 r1 = r2.f19161a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
