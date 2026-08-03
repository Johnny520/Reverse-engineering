package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bc.p f758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nf.a f759c;

    public o(java.lang.String r1, bc.p r2) {
            r0 = this;
            r0.<init>()
            r0.f757a = r1
            r0.f758b = r2
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            bc.p r0 = r5.f758b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "', type="
            java.lang.String r2 = "}"
            java.lang.String r3 = "ResourceFile{name='"
            java.lang.String r4 = r5.f757a
            java.lang.String r0 = bc.e.k(r3, r4, r1, r0, r2)
            return r0
    }
}
