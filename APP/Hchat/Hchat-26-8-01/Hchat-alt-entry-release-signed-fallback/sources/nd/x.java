package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends oc.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f9402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.SortedSet f9403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f9404i;

    public x(java.util.List r1, java.util.SortedSet r2, java.util.HashSet r3) {
            r0 = this;
            r0.<init>()
            r0.f9402g = r1
            r0.f9403h = r2
            r0.f9404i = r3
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8863r
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.HashSet r0 = r2.f9404i
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "METHOD_OVERRIDE: "
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}
