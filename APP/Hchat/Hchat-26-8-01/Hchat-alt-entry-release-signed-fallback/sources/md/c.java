package md;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final md.b f8872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f8873h;

    public c(md.b r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8873h = r0
            r1.f8872g = r2
            return
    }

    @Override // oc.b
    public final oc.a a() {
            r1 = this;
            md.b r0 = r1.f8872g
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.ArrayList r0 = r2.f8873h
            java.lang.String r1 = ", "
            java.lang.String r0 = xe.s.j(r0, r1)
            return r0
    }
}
