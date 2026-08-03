package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.String f9365g;

    public f0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f9365g = r1
            return
    }

    public f0(nd.b0 r2) {
            r1 = this;
            r1.<init>()
            md.b r0 = md.b.f8847b
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r0)
            nd.f0 r2 = (nd.f0) r2
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.f9365g
            r1.f9365g = r2
            return
        L14:
            java.lang.String r2 = ""
            r1.f9365g = r2
            return
    }

    public f0(nd.b0 r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto La
            java.lang.String r1 = "not valid java name"
            r0.b(r1)
        La:
            if (r3 == 0) goto L11
            java.lang.String r1 = "contains not printable characters"
            r0.b(r1)
        L11:
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8847b
            return r0
    }

    public final void b(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.f9365g
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = r2.f9365g
            if (r0 == 0) goto L11
            java.lang.String r3 = bc.e.i(r1, r3)
            r2.f9365g = r3
            return
        L11:
            java.lang.String r0 = " and "
            java.lang.String r3 = wb.en.h(r1, r0, r3)
            r2.f9365g = r3
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f9365g
            java.lang.String r1 = "RENAME_REASON:"
            java.lang.String r0 = wb.en.g(r1, r0)
            return r0
    }
}
