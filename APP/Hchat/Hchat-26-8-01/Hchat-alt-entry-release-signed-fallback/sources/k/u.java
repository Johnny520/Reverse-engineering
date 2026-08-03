package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class u extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n.k f7073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.y0 f7074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f7077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2.i f7078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fg.a f7079g;

    public u(n.k r1, k.y0 r2, boolean r3, boolean r4, java.lang.String r5, f2.i r6, fg.a r7) {
            r0 = this;
            r0.<init>()
            r0.f7073a = r1
            r0.f7074b = r2
            r0.f7075c = r3
            r0.f7076d = r4
            r0.f7077e = r5
            r0.f7078f = r6
            r0.f7079g = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L53
        L3:
            if (r3 != 0) goto L6
            goto L51
        L6:
            java.lang.Class<k.u> r0 = k.u.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L51
        Lf:
            k.u r3 = (k.u) r3
            n.k r0 = r2.f7073a
            n.k r1 = r3.f7073a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1c
            goto L51
        L1c:
            k.y0 r0 = r2.f7074b
            k.y0 r1 = r3.f7074b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L27
            goto L51
        L27:
            boolean r0 = r2.f7075c
            boolean r1 = r3.f7075c
            if (r0 == r1) goto L2e
            goto L51
        L2e:
            boolean r0 = r2.f7076d
            boolean r1 = r3.f7076d
            if (r0 == r1) goto L35
            goto L51
        L35:
            java.lang.String r0 = r2.f7077e
            java.lang.String r1 = r3.f7077e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L40
            goto L51
        L40:
            f2.i r0 = r2.f7078f
            f2.i r1 = r3.f7078f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L4b
            goto L51
        L4b:
            fg.a r0 = r2.f7079g
            fg.a r3 = r3.f7079g
            if (r0 == r3) goto L53
        L51:
            r3 = 0
            return r3
        L53:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r8 = this;
            k.w r0 = new k.w
            f2.i r6 = r8.f7078f
            fg.a r7 = r8.f7079g
            n.k r1 = r8.f7073a
            k.y0 r2 = r8.f7074b
            boolean r3 = r8.f7075c
            boolean r4 = r8.f7076d
            java.lang.String r5 = r8.f7077e
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r9) {
            r8 = this;
            r0 = r9
            k.w r0 = (k.w) r0
            f2.i r6 = r8.f7078f
            fg.a r7 = r8.f7079g
            n.k r1 = r8.f7073a
            k.y0 r2 = r8.f7074b
            boolean r3 = r8.f7075c
            boolean r4 = r8.f7076d
            java.lang.String r5 = r8.f7077e
            r0.z1(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            n.k r1 = r4.f7073a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            r2 = 31
            int r1 = r1 * r2
            k.y0 r3 = r4.f7074b
            if (r3 == 0) goto L17
            int r3 = r3.hashCode()
            goto L18
        L17:
            r3 = r0
        L18:
            int r1 = r1 + r3
            int r1 = r1 * r2
            boolean r3 = r4.f7075c
            int r1 = eh.a.h(r1, r2, r3)
            boolean r3 = r4.f7076d
            int r1 = eh.a.h(r1, r2, r3)
            java.lang.String r3 = r4.f7077e
            if (r3 == 0) goto L2f
            int r3 = r3.hashCode()
            goto L30
        L2f:
            r3 = r0
        L30:
            int r1 = r1 + r3
            int r1 = r1 * r2
            f2.i r3 = r4.f7078f
            if (r3 == 0) goto L3c
            int r0 = r3.f3155a
            int r0 = java.lang.Integer.hashCode(r0)
        L3c:
            int r1 = r1 + r0
            int r1 = r1 * r2
            fg.a r0 = r4.f7079g
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
