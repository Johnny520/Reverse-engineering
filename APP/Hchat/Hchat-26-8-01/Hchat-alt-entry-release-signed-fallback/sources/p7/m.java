package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.f f10305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.f f10306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10307t;

    public m(int r3) {
            r2 = this;
            short r0 = j8.b.c(r3)
            r2.<init>(r0)
            r2.f10307t = r3
            r7.f r3 = new r7.f
            r0 = 0
            r3.<init>(r0)
            r2.f10305r = r3
            r7.f r0 = new r7.f
            r1 = -1
            r0.<init>(r1)
            r2.f10306s = r0
            r2.P(r3)
            r2.P(r0)
            return
    }

    @Override // p7.a
    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.Q()
            int r1 = r2.f10307t
            if (r0 == r1) goto Ld
            java.lang.String r0 = super.toString()
            return r0
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<p7.m> r1 = p7.m.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " {lineNumber="
            r0.append(r1)
            r7.f r1 = r2.f10305r
            r0.append(r1)
            java.lang.String r1 = ", commentReference="
            r0.append(r1)
            r7.f r1 = r2.f10306s
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
