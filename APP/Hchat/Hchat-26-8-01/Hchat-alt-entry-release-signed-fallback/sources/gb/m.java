package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gb.p f4445c;

    public m(java.lang.String r1, java.lang.String r2, gb.p r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f4443a = r1
            r0.f4444b = r2
            r0.f4445c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof gb.m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gb.m r5 = (gb.m) r5
            java.lang.String r1 = r4.f4443a
            java.lang.String r3 = r5.f4443a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f4444b
            java.lang.String r3 = r5.f4444b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            gb.p r1 = r4.f4445c
            gb.p r5 = r5.f4445c
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4443a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4444b
            int r0 = eh.a.g(r0, r1, r2)
            gb.p r1 = r3.f4445c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", ownerToken="
            java.lang.String r1 = ", reviewStatus="
            java.lang.String r2 = "PluginMarketOwnership(remotePluginId="
            java.lang.String r3 = r5.f4443a
            java.lang.String r4 = r5.f4444b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            gb.p r1 = r5.f4445c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
