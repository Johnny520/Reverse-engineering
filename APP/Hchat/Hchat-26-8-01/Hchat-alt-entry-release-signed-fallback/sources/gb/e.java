package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f4418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4420c;

    public e(uf.c r1, long r2, int r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f4418a = r1
            r0.f4419b = r2
            r0.f4420c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof gb.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gb.e r8 = (gb.e) r8
            java.util.List r1 = r7.f4418a
            java.util.List r3 = r8.f4418a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f4419b
            long r5 = r8.f4419b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            int r1 = r7.f4420c
            int r8 = r8.f4420c
            if (r1 == r8) goto L27
            return r2
        L27:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.util.List r0 = r4.f4418a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f4419b
            int r0 = eh.a.f(r0, r1, r2)
            int r1 = r4.f4420c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PluginMarketCommentPage(items="
            r0.<init>(r1)
            java.util.List r1 = r3.f4418a
            r0.append(r1)
            java.lang.String r1 = ", total="
            r0.append(r1)
            long r1 = r3.f4419b
            r0.append(r1)
            java.lang.String r1 = ", limit="
            r0.append(r1)
            int r1 = r3.f4420c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
