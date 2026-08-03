package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f220h;

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            ac.r r2 = (ac.r) r2
            int r0 = r1.f219g
            int r2 = r2.f219g
            int r0 = r0 - r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Segment{start="
            r0.<init>(r1)
            int r1 = r3.f219g
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r3.f220h
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
