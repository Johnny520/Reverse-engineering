package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.EnumSet f9357g;

    public d() {
            r1 = this;
            r1.<init>()
            java.lang.Class<nd.c> r0 = nd.c.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            r1.f9357g = r0
            return
    }

    public static boolean b(ud.r r1, nd.c r2) {
            md.b r0 = md.b.f8866u
            md.f r1 = r1.f8877g
            oc.b r1 = r1.c(r0)
            nd.d r1 = (nd.d) r1
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            java.util.EnumSet r1 = r1.f9357g
            boolean r1 = r1.contains(r2)
            return r1
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8866u
            return r0
    }

    @Override // oc.b
    public final java.lang.String d() {
            r3 = this;
            java.util.EnumSet r0 = r3.f9357g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "CodeFeatures{"
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}
