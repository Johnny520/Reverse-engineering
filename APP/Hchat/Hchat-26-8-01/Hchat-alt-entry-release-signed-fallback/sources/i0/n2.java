package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements i0.p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f5984a;

    public n2(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f5984a = r1
            return
    }

    @Override // i0.p2
    public final java.lang.Object a(s0.h r1) {
            r0 = this;
            java.lang.Object r1 = r0.f5984a
            return r1
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof i0.n2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i0.n2 r4 = (i0.n2) r4
            java.lang.Object r1 = r3.f5984a
            java.lang.Object r4 = r4.f5984a
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f5984a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StaticValueHolder(value="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f5984a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
