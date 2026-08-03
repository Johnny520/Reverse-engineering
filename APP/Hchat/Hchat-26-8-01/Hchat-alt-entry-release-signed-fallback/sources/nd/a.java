package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends oc.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ud.e f9346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qd.j f9347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9348i;

    public a(ud.e r1, qd.j r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f9346g = r1
            r0.f9347h = r2
            r0.f9348i = r3
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8853h
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            ud.e r0 = r6.f9346g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            qd.j r1 = r6.f9347h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 1
            int r3 = r6.f9348i
            if (r3 == r2) goto L1a
            r2 = 2
            if (r3 == r2) goto L17
            java.lang.String r2 = "null"
            goto L1c
        L17:
            java.lang.String r2 = "INSTANCE_FIELD"
            goto L1c
        L1a:
            java.lang.String r2 = "CONSTRUCTOR"
        L1c:
            java.lang.String r3 = ", base: "
            java.lang.String r4 = ", inline type: "
            java.lang.String r5 = "AnonymousClass{"
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            java.lang.String r1 = "}"
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
