package a4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54d;

    static {
            a4.a r0 = new a4.a
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            return
    }

    public a(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f51a = r1
            r0.f52b = r2
            r0.f53c = r3
            r0.f54d = r4
            if (r1 > r3) goto L1d
            if (r2 > r4) goto L10
            return
        L10:
            java.lang.String r1 = "top must be less than or equal to bottom, top: "
            java.lang.String r3 = ", bottom: "
            java.lang.String r1 = p.a.j(r2, r1, r3, r4)
            j8.o.q(r1)
            r1 = 0
            throw r1
        L1d:
            java.lang.String r2 = "Left must be less than or equal to right, left: "
            java.lang.String r4 = ", right: "
            java.lang.String r1 = p.a.j(r1, r2, r4, r3)
            j8.o.q(r1)
            r1 = 0
            throw r1
    }

    public a(android.graphics.Rect r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.<init>(r0, r1, r2, r4)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<a4.a> r2 = a4.a.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r5.getClass()
            a4.a r5 = (a4.a) r5
            int r1 = r4.f51a
            int r3 = r5.f51a
            if (r1 == r3) goto L22
            return r2
        L22:
            int r1 = r4.f52b
            int r3 = r5.f52b
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r4.f53c
            int r3 = r5.f53c
            if (r1 == r3) goto L30
            return r2
        L30:
            int r1 = r4.f54d
            int r5 = r5.f54d
            if (r1 == r5) goto L37
            return r2
        L37:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f51a
            int r0 = r0 * 31
            int r1 = r2.f52b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f53c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f54d
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<a4.a> r1 = a4.a.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " { ["
            r0.append(r1)
            int r1 = r3.f51a
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r2 = r3.f52b
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.f53c
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f54d
            java.lang.String r2 = "] }"
            java.lang.String r0 = j8.b.j(r0, r1, r2)
            return r0
    }
}
