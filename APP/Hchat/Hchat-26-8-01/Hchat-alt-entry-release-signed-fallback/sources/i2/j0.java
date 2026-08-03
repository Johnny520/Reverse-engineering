package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.g f6334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.n0 f6335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f6336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u2.c f6340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u2.m f6341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m2.d f6342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6343j;

    public j0(i2.g r1, i2.n0 r2, java.util.List r3, int r4, boolean r5, int r6, u2.c r7, u2.m r8, m2.d r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.f6334a = r1
            r0.f6335b = r2
            r0.f6336c = r3
            r0.f6337d = r4
            r0.f6338e = r5
            r0.f6339f = r6
            r0.f6340g = r7
            r0.f6341h = r8
            r0.f6342i = r9
            r0.f6343j = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L69
        L4:
            boolean r0 = r5 instanceof i2.j0
            if (r0 != 0) goto La
            goto L6b
        La:
            i2.j0 r5 = (i2.j0) r5
            i2.g r0 = r5.f6334a
            i2.g r1 = r4.f6334a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L17
            goto L6b
        L17:
            i2.n0 r0 = r4.f6335b
            i2.n0 r1 = r5.f6335b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L22
            goto L6b
        L22:
            java.util.List r0 = r4.f6336c
            java.util.List r1 = r5.f6336c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2d
            goto L6b
        L2d:
            int r0 = r4.f6337d
            int r1 = r5.f6337d
            if (r0 == r1) goto L34
            goto L6b
        L34:
            boolean r0 = r4.f6338e
            boolean r1 = r5.f6338e
            if (r0 == r1) goto L3b
            goto L6b
        L3b:
            int r0 = r4.f6339f
            int r1 = r5.f6339f
            if (r0 != r1) goto L6b
            u2.c r0 = r4.f6340g
            u2.c r1 = r5.f6340g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L4c
            goto L6b
        L4c:
            u2.m r0 = r4.f6341h
            u2.m r1 = r5.f6341h
            if (r0 == r1) goto L53
            goto L6b
        L53:
            m2.d r0 = r4.f6342i
            m2.d r1 = r5.f6342i
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L5e
            goto L6b
        L5e:
            long r0 = r4.f6343j
            long r2 = r5.f6343j
            boolean r5 = u2.a.b(r0, r2)
            if (r5 != 0) goto L69
            goto L6b
        L69:
            r5 = 1
            return r5
        L6b:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r3 = this;
            i2.g r0 = r3.f6334a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            i2.n0 r2 = r3.f6335b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r3.f6336c
            int r0 = j8.b.e(r0, r2, r1)
            int r2 = r3.f6337d
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r3.f6338e
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f6339f
            int r0 = eh.a.e(r2, r0, r1)
            u2.c r2 = r3.f6340g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            u2.m r0 = r3.f6341h
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            m2.d r2 = r3.f6342i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r0 = r3.f6343j
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextLayoutInput(text="
            r0.<init>(r1)
            i2.g r1 = r3.f6334a
            r0.append(r1)
            java.lang.String r1 = ", style="
            r0.append(r1)
            i2.n0 r1 = r3.f6335b
            r0.append(r1)
            java.lang.String r1 = ", placeholders="
            r0.append(r1)
            java.util.List r1 = r3.f6336c
            r0.append(r1)
            java.lang.String r1 = ", maxLines="
            r0.append(r1)
            int r1 = r3.f6337d
            r0.append(r1)
            java.lang.String r1 = ", softWrap="
            r0.append(r1)
            boolean r1 = r3.f6338e
            r0.append(r1)
            java.lang.String r1 = ", overflow="
            r0.append(r1)
            r1 = 1
            int r2 = r3.f6339f
            if (r2 != r1) goto L41
            java.lang.String r1 = "Clip"
            goto L5b
        L41:
            r1 = 2
            if (r2 != r1) goto L47
            java.lang.String r1 = "Ellipsis"
            goto L5b
        L47:
            r1 = 5
            if (r2 != r1) goto L4d
            java.lang.String r1 = "MiddleEllipsis"
            goto L5b
        L4d:
            r1 = 3
            if (r2 != r1) goto L53
            java.lang.String r1 = "Visible"
            goto L5b
        L53:
            r1 = 4
            if (r2 != r1) goto L59
            java.lang.String r1 = "StartEllipsis"
            goto L5b
        L59:
            java.lang.String r1 = "Invalid"
        L5b:
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            u2.c r1 = r3.f6340g
            r0.append(r1)
            java.lang.String r1 = ", layoutDirection="
            r0.append(r1)
            u2.m r1 = r3.f6341h
            r0.append(r1)
            java.lang.String r1 = ", fontFamilyResolver="
            r0.append(r1)
            m2.d r1 = r3.f6342i
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            long r1 = r3.f6343j
            java.lang.String r1 = u2.a.k(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
