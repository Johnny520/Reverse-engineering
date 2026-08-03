package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f21224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f21225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21227g;

    public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, boolean r7) {
            r0 = this;
            j8.b.q(r1, r2, r3, r4, r5)
            r0.<init>()
            r0.f21221a = r1
            r0.f21222b = r2
            r0.f21223c = r3
            r0.f21224d = r4
            r0.f21225e = r5
            r0.f21226f = r6
            r0.f21227g = r7
            return
    }

    public static x8.a a(x8.a r8, boolean r9) {
            java.lang.String r1 = r8.f21221a
            java.lang.String r2 = r8.f21222b
            java.lang.String r3 = r8.f21223c
            java.lang.String r4 = r8.f21224d
            java.lang.String r5 = r8.f21225e
            int r6 = r8.f21226f
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            x8.a r0 = new x8.a
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof x8.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x8.a r5 = (x8.a) r5
            java.lang.String r1 = r4.f21221a
            java.lang.String r3 = r5.f21221a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f21222b
            java.lang.String r3 = r5.f21222b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f21223c
            java.lang.String r3 = r5.f21223c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f21224d
            java.lang.String r3 = r5.f21224d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f21225e
            java.lang.String r3 = r5.f21225e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            int r1 = r4.f21226f
            int r3 = r5.f21226f
            if (r1 == r3) goto L4a
            return r2
        L4a:
            boolean r1 = r4.f21227g
            boolean r5 = r5.f21227g
            if (r1 == r5) goto L51
            return r2
        L51:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f21221a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f21222b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21223c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21224d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f21225e
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f21226f
            int r0 = eh.a.e(r2, r0, r1)
            boolean r1 = r3.f21227g
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", apiBaseUrl="
            java.lang.String r1 = ", apiPath="
            java.lang.String r2 = "AutoReplyAiConfig(apiKey="
            java.lang.String r3 = r5.f21221a
            java.lang.String r4 = r5.f21222b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", model="
            java.lang.String r2 = ", systemPrompt="
            java.lang.String r3 = r5.f21223c
            java.lang.String r4 = r5.f21224d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f21225e
            r0.append(r1)
            java.lang.String r1 = ", contextLimit="
            r0.append(r1)
            int r1 = r5.f21226f
            r0.append(r1)
            java.lang.String r1 = ", stream="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r5.f21227g
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
