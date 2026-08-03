package g7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d7.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d7.f f4336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d7.e f4337o;

    public c() {
            r5 = this;
            r0 = 3
            r1 = 0
            r5.<init>(r0, r1)
            d7.f r0 = new d7.f
            r0.<init>()
            r5.f4336n = r0
            d7.e r2 = new d7.e
            r3 = 0
            r2.<init>(r3, r1)
            r5.f4337o = r2
            d7.b r1 = new d7.b
            r3 = 0
            r4 = 0
            r1.<init>(r3, r4)
            r5.P(r0)
            r5.P(r2)
            r5.P(r1)
            return
    }

    @Override // d7.j
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", sig="
            r0.append(r1)
            d7.f r1 = r2.f4336n
            r0.append(r1)
            java.lang.String r1 = ", certs="
            r0.append(r1)
            d7.e r1 = r2.f4337o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
