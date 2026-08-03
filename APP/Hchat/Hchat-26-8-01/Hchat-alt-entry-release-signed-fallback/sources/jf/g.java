package jf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f6892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6893b;

    public g(java.util.List r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f6893b = r2
            r0.f6892a = r1
            return
    }

    @Override // mc.a
    public final java.util.List c() {
            r1 = this;
            java.util.List r0 = r1.f6892a
            return r0
    }

    @Override // mc.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.f6893b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof mc.a
            if (r0 != 0) goto L8
            goto L24
        L8:
            mc.a r3 = (mc.a) r3
            java.util.List r0 = r2.f6892a
            java.util.List r1 = r3.c()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.f6893b
            java.lang.String r3 = r3.e()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L24
        L22:
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.util.List r0 = r2.f6892a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f6893b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.f6892a
            java.lang.String r0 = ac.p.D(r0)
            java.lang.String r1 = "("
            java.lang.String r2 = ")"
            java.lang.String r3 = r4.f6893b
            java.lang.String r0 = bc.e.j(r1, r0, r2, r3)
            return r0
    }
}
