package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3865d;

    public z(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f3862a = r1
            r0.f3863b = r2
            r0.f3864c = r3
            r0.f3865d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof fb.z
            if (r0 != 0) goto L8
            goto L35
        L8:
            fb.z r3 = (fb.z) r3
            java.lang.String r0 = r2.f3862a
            java.lang.String r1 = r3.f3862a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f3863b
            java.lang.String r1 = r3.f3863b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f3864c
            java.lang.String r1 = r3.f3864c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r0 = r2.f3865d
            java.lang.String r3 = r3.f3865d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3862a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3863b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3864c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3865d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", pluginName="
            java.lang.String r1 = ", infoProp="
            java.lang.String r2 = "ScriptPluginAgentExisting(pluginId="
            java.lang.String r3 = r5.f3862a
            java.lang.String r4 = r5.f3863b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", mainJava="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f3864c
            java.lang.String r4 = r5.f3865d
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
