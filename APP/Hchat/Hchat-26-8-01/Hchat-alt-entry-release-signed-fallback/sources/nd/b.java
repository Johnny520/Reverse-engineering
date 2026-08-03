package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f9351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f9352h;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            return
    }

    public b(java.util.List r1, java.util.HashMap r2) {
            r0 = this;
            r0.<init>()
            r0.f9351g = r1
            r0.f9352h = r2
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8852g
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.util.List r0 = r5.f9351g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.HashMap r1 = r5.f9352h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", super maps: "
            java.lang.String r3 = "}"
            java.lang.String r4 = "ClassTypeVarsAttr{"
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
