package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb.b0 f3391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3393c;

    public a0(fb.b0 r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f3391a = r1
            r0.f3392b = r2
            r0.f3393c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fb.a0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.a0 r5 = (fb.a0) r5
            fb.b0 r1 = r4.f3391a
            fb.b0 r3 = r5.f3391a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f3392b
            java.lang.String r3 = r5.f3392b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f3393c
            boolean r5 = r5.f3393c
            if (r1 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            fb.b0 r0 = r3.f3391a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3392b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f3393c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScriptPluginAgentIssue(level="
            r0.<init>(r1)
            fb.b0 r1 = r3.f3391a
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r3.f3392b
            r0.append(r1)
            java.lang.String r1 = ", risky="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f3393c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
