package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends p7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.f f10276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.f f10277s;

    public e() {
            r3 = this;
            r0 = 517(0x205, float:7.24E-43)
            r3.<init>(r0)
            r7.f r0 = new r7.f
            r1 = 0
            r0.<init>(r1)
            r3.f10276r = r0
            r7.f r2 = new r7.f
            r2.<init>(r1)
            r3.f10277s = r2
            r3.P(r0)
            r3.P(r2)
            return
    }

    @Override // p7.a
    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.Q()
            r1 = 17
            if (r0 == r1) goto Ld
            java.lang.String r0 = super.toString()
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<p7.e> r1 = p7.e.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " {flags="
            r0.append(r1)
            r7.f r1 = r3.f10276r
            int r1 = r1.f11560n
            r2 = 8
            java.lang.String r1 = y7.a.k(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", entryCount="
            r0.append(r1)
            r7.f r1 = r3.f10277s
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
