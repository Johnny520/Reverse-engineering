package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3856e;

    public y(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            j8.b.q(r1, r2, r3, r4, r5)
            r0.<init>()
            r0.f3852a = r1
            r0.f3853b = r2
            r0.f3854c = r3
            r0.f3855d = r4
            r0.f3856e = r5
            return
    }

    public static fb.y a(fb.y r6, java.lang.String r7) {
            java.lang.String r1 = r6.f3852a
            java.lang.String r3 = r6.f3854c
            java.lang.String r4 = r6.f3855d
            java.lang.String r5 = r6.f3856e
            r6.getClass()
            r1.getClass()
            r7.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            fb.y r0 = new fb.y
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fb.y
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.y r5 = (fb.y) r5
            java.lang.String r1 = r4.f3852a
            java.lang.String r3 = r5.f3852a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f3853b
            java.lang.String r3 = r5.f3853b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f3854c
            java.lang.String r3 = r5.f3854c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f3855d
            java.lang.String r3 = r5.f3855d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f3856e
            java.lang.String r5 = r5.f3856e
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3852a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3853b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3854c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3855d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3856e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", pluginId="
            java.lang.String r1 = ", infoProp="
            java.lang.String r2 = "ScriptPluginAgentDraft(pluginName="
            java.lang.String r3 = r5.f3852a
            java.lang.String r4 = r5.f3853b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", mainJava="
            java.lang.String r2 = ", summary="
            java.lang.String r3 = r5.f3854c
            java.lang.String r4 = r5.f3855d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f3856e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
