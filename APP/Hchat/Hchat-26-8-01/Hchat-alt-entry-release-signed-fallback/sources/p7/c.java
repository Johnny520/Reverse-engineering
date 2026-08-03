package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends p7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.f f10273r;

    public c() {
            r2 = this;
            r0 = 515(0x203, float:7.22E-43)
            r2.<init>(r0)
            r7.f r0 = new r7.f
            r1 = 0
            r0.<init>(r1)
            r2.f10273r = r0
            r2.P(r0)
            return
    }

    @Override // p7.a
    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.Q()
            r1 = 15
            if (r0 == r1) goto Ld
            java.lang.String r0 = super.toString()
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<p7.c> r1 = p7.c.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " {count="
            r0.append(r1)
            r7.f r1 = r2.f10273r
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
