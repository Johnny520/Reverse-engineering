package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 extends wb.q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17997a;

    public o4(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f17997a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof wb.o4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.o4 r4 = (wb.o4) r4
            java.lang.String r1 = r3.f17997a
            java.lang.String r4 = r4.f17997a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f17997a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "KeywordEditor(oldKeyword="
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f17997a
            java.lang.String r0 = eh.a.n(r0, r2, r1)
            return r0
    }
}
