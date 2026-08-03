package md;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends oc.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ud.r f8882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ud.p f8883h;

    public h(ud.r r1, ud.p r2) {
            r0 = this;
            r0.<init>()
            r0.f8882g = r1
            java.util.Objects.requireNonNull(r2)
            r0.f8883h = r2
            return
    }

    @Override // oc.b
    public final oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8856k
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            ud.p r0 = r3.f8883h
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "INIT{"
            java.lang.String r2 = "}"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}
