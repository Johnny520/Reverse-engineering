package g4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.j f4294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4.j f4295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g4.k f4297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v4.y f4298e;

    public i(g4.j r2, g4.j r3, java.lang.String r4, g4.k r5) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto L2d
            if (r4 == 0) goto L2d
            r1.f4294a = r2
            r1.f4295b = r3
            r1.f4296c = r4
            r1.f4297d = r5
            v4.z r3 = new v4.z
            v4.c0 r5 = new v4.c0
            r5.<init>(r4)
            v4.c0 r4 = new v4.c0
            r0 = 0
            java.lang.String r0 = r1.a(r0)
            r4.<init>(r0)
            r3.<init>(r5, r4)
            v4.y r4 = new v4.y
            v4.d0 r2 = r2.f4313c
            r4.<init>(r2, r3)
            r1.f4298e = r4
            return
        L2d:
            r2 = 0
            throw r2
    }

    public final java.lang.String a(boolean r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            if (r5 == 0) goto L10
            g4.j r5 = r4.f4294a
            java.lang.String r5 = r5.f4311a
            r0.append(r5)
        L10:
            g4.k r5 = r4.f4297d
            g4.j[] r5 = r5.f4314a
            int r1 = r5.length
            r2 = 0
        L16:
            if (r2 >= r1) goto L22
            r3 = r5[r2]
            java.lang.String r3 = r3.f4311a
            r0.append(r3)
            int r2 = r2 + 1
            goto L16
        L22:
            java.lang.String r5 = ")"
            r0.append(r5)
            g4.j r5 = r4.f4295b
            java.lang.String r5 = r5.f4311a
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof g4.i
            if (r0 == 0) goto L30
            g4.i r3 = (g4.i) r3
            g4.j r0 = r3.f4294a
            g4.j r1 = r2.f4294a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            java.lang.String r0 = r3.f4296c
            java.lang.String r1 = r2.f4296c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            g4.k r0 = r3.f4297d
            g4.k r1 = r2.f4297d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            g4.j r3 = r3.f4295b
            g4.j r0 = r2.f4295b
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L30
            r3 = 1
            return r3
        L30:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            g4.j r0 = r3.f4294a
            java.lang.String r0 = r0.f4311a
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = eh.a.g(r1, r2, r0)
            java.lang.String r1 = r3.f4296c
            int r0 = eh.a.g(r0, r2, r1)
            g4.k r1 = r3.f4297d
            g4.j[] r1 = r1.f4314a
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * r2
            g4.j r0 = r3.f4295b
            java.lang.String r0 = r0.f4311a
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            g4.j r1 = r2.f4294a
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = r2.f4296c
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            g4.k r1 = r2.f4297d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
