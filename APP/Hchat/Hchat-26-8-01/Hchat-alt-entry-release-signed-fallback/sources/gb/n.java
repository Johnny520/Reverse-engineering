package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f4446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4448c;

    public n(uf.c r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f4446a = r1
            r0.f4447b = r2
            r0.f4448c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof gb.n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gb.n r5 = (gb.n) r5
            java.util.List r1 = r4.f4446a
            java.util.List r3 = r5.f4446a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f4447b
            int r3 = r5.f4447b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.f4448c
            int r5 = r5.f4448c
            if (r1 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f4446a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f4447b
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f4448c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PluginMarketPage(items="
            r0.<init>(r1)
            java.util.List r1 = r3.f4446a
            r0.append(r1)
            java.lang.String r1 = ", count="
            r0.append(r1)
            int r1 = r3.f4447b
            r0.append(r1)
            java.lang.String r1 = ", limit="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r3.f4448c
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
