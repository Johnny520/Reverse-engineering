package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.c f10286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.f f10287s;

    public g() {
            r5 = this;
            r0 = 514(0x202, float:7.2E-43)
            r5.<init>(r0)
            r7.c r0 = new r7.c
            r1 = 1
            r2 = 1
            r0.<init>(r2, r1)
            r5.f10286r = r0
            r7.c r1 = new r7.c
            r3 = 1
            r1.<init>(r2, r3)
            r7.a r2 = new r7.a
            r4 = 0
            r2.<init>(r3, r4)
            r7.f r3 = new r7.f
            r3.<init>(r4)
            r5.f10287s = r3
            r5.P(r0)
            r5.P(r1)
            r5.P(r2)
            r5.P(r3)
            return
    }

    @Override // p7.a
    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.Q()
            r1 = 14
            if (r0 == r1) goto Ld
            java.lang.String r0 = super.toString()
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<p7.g> r1 = p7.g.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " {id="
            r0.append(r1)
            r7.c r1 = r3.f10286r
            byte[] r1 = r1.f11553k
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = y7.a.n(r1)
            r0.append(r1)
            java.lang.String r1 = ", entryCount="
            r0.append(r1)
            r7.f r1 = r3.f10287s
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
