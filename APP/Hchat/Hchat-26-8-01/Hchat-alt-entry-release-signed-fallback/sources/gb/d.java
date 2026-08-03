package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb.c f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4417b;

    public d(gb.c r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f4416a = r1
            r0.f4417b = r2
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof gb.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gb.d r8 = (gb.d) r8
            gb.c r1 = r7.f4416a
            gb.c r3 = r8.f4416a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f4417b
            long r5 = r8.f4417b
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            gb.c r0 = r3.f4416a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            long r1 = r3.f4417b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PluginMarketCommentMutation(comment="
            r0.<init>(r1)
            gb.c r1 = r3.f4416a
            r0.append(r1)
            java.lang.String r1 = ", commentCount="
            r0.append(r1)
            long r1 = r3.f4417b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
