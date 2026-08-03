package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends oc.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.BitSet f9369g;

    public g0(ud.r r2) {
            r1 = this;
            r1.<init>()
            java.util.BitSet r0 = new java.util.BitSet
            od.d r2 = r2.f13717k
            java.util.List r2 = r2.f9779i
            int r2 = r2.size()
            r0.<init>(r2)
            r1.f9369g = r0
            return
    }

    public static void b(ud.r r2, int r3) {
            md.b r0 = md.b.f8862q
            md.f r1 = r2.f8877g
            oc.b r0 = r1.c(r0)
            nd.g0 r0 = (nd.g0) r0
            if (r0 != 0) goto L14
            nd.g0 r0 = new nd.g0
            r0.<init>(r2)
            r2.y(r0)
        L14:
            java.util.BitSet r2 = r0.f9369g
            r2.set(r3)
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.f8862q
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.BitSet r0 = r2.f9369g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "SKIP_MTH_ARGS: "
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}
