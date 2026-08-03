package le;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f8014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd.a f8015b;

    public b() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f8014a = r0
            return
    }

    public b(le.b r2, xd.a r3) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            java.util.HashSet r2 = r2.f8014a
            r0.<init>(r2)
            r1.f8014a = r0
            r1.f8015b = r3
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            xd.a r0 = r4.f8015b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.HashSet r1 = r4.f8014a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Region: "
            java.lang.String r3 = ", exits: "
            java.lang.String r0 = bc.e.j(r2, r0, r3, r1)
            return r0
    }
}
