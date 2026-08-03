package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f7505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f7506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f7507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f7508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7509g;

    public j(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r0 = this;
            j8.b.q(r1, r2, r3, r4, r5)
            r6.getClass()
            r0.<init>()
            r0.f7503a = r1
            r0.f7504b = r2
            r0.f7505c = r3
            r0.f7506d = r4
            r0.f7507e = r5
            r0.f7508f = r6
            r0.f7509g = r7
            return
    }

    public static k9.j a(k9.j r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, int r9) {
            r0 = r3
            java.lang.String r3 = r2.f7503a
            r1 = r9 & 2
            if (r1 == 0) goto L9
            java.lang.String r0 = r2.f7504b
        L9:
            r1 = r9 & 4
            if (r1 == 0) goto Lf
            java.lang.String r4 = r2.f7505c
        Lf:
            r1 = r9 & 8
            if (r1 == 0) goto L15
            java.lang.String r5 = r2.f7506d
        L15:
            r1 = r9 & 16
            if (r1 == 0) goto L1b
            java.lang.String r6 = r2.f7507e
        L1b:
            r1 = r9 & 32
            if (r1 == 0) goto L21
            java.lang.String r7 = r2.f7508f
        L21:
            r9 = r9 & 64
            if (r9 == 0) goto L27
            boolean r8 = r2.f7509g
        L27:
            r9 = r8
            r2.getClass()
            r3.getClass()
            r0.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            k9.j r2 = new k9.j
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof k9.j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k9.j r5 = (k9.j) r5
            java.lang.String r1 = r4.f7503a
            java.lang.String r3 = r5.f7503a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f7504b
            java.lang.String r3 = r5.f7504b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f7505c
            java.lang.String r3 = r5.f7505c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f7506d
            java.lang.String r3 = r5.f7506d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f7507e
            java.lang.String r3 = r5.f7507e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f7508f
            java.lang.String r3 = r5.f7508f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            boolean r1 = r4.f7509g
            boolean r5 = r5.f7509g
            if (r1 == r5) goto L55
            return r2
        L55:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7503a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7504b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7505c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7506d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7507e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7508f
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f7509g
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", actionType="
            java.lang.String r2 = "FloatingShortcutItem(id="
            java.lang.String r3 = r5.f7503a
            java.lang.String r4 = r5.f7504b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", target="
            java.lang.String r2 = ", iconPath="
            java.lang.String r3 = r5.f7505c
            java.lang.String r4 = r5.f7506d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", darkIconPath="
            java.lang.String r2 = ", enabled="
            java.lang.String r3 = r5.f7507e
            java.lang.String r4 = r5.f7508f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r2 = r5.f7509g
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
