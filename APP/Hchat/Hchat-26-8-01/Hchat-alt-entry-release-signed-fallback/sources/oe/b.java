package oe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.p f9795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.r f9796b;

    public b(ud.p r1, qd.r r2) {
            r0 = this;
            r0.<init>()
            r0.f9795a = r1
            r0.f9796b = r2
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            qd.r r0 = r4.f9796b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.p r1 = r4.f9795a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "WrapInfo: "
            java.lang.String r3 = " -> "
            java.lang.String r0 = bc.e.j(r2, r0, r3, r1)
            return r0
    }
}
