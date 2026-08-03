package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d6.e f2022e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Comparable f2023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Comparable f2024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2026d;

    static {
            d6.e r0 = new d6.e
            r1 = 1
            r0.<init>(r1)
            d6.i.f2022e = r0
            return
    }

    public i(java.lang.Comparable r1, java.lang.Comparable r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f2023a = r1
            r0.f2024b = r2
            r0.f2025c = r3
            r1 = 0
            r0.f2026d = r1
            return
    }

    public static d6.i a() {
            d6.i r0 = new d6.i
            r0.<init>()
            r1 = 1
            r0.f2026d = r1
            r1 = 0
            r0.f2023a = r1
            r0.f2024b = r1
            r1 = 0
            r0.f2025c = r1
            return r0
    }

    public static d6.i g() {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.compareTo(r0)
            if (r1 > 0) goto L12
            d6.i r1 = new d6.i
            r2 = 1
            r1.<init>(r0, r0, r2)
            return r1
        L12:
            java.lang.String r0 = "lowerBound must be <= upperBound"
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    public final boolean b(java.lang.Integer r4) {
            r3 = this;
            java.lang.Comparable r0 = r3.f2024b
            java.lang.Comparable r1 = r3.f2023a
            boolean r2 = r3.f2026d
            if (r2 == 0) goto L9
            goto L27
        L9:
            if (r1 == 0) goto L1d
            boolean r2 = r3.f2025c
            if (r2 == 0) goto L16
            int r2 = r4.compareTo(r1)
            if (r2 != 0) goto L16
            goto L25
        L16:
            int r1 = r4.compareTo(r1)
            if (r1 >= 0) goto L1d
            goto L25
        L1d:
            if (r0 == 0) goto L27
            int r4 = r4.compareTo(r0)
            if (r4 <= 0) goto L27
        L25:
            r4 = 0
            return r4
        L27:
            r4 = 1
            return r4
    }

    public final boolean c() {
            r1 = this;
            java.lang.Comparable r0 = r1.f2023a
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean d() {
            r1 = this;
            java.lang.Comparable r0 = r1.f2024b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean e(d6.i r3) {
            r2 = this;
            boolean r0 = r2.c()
            if (r0 == 0) goto L16
            boolean r0 = r3.d()
            if (r0 == 0) goto L16
            java.lang.Comparable r0 = r2.f2023a
            java.lang.Comparable r1 = r3.f2024b
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L2d
        L16:
            boolean r0 = r2.d()
            if (r0 == 0) goto L2f
            boolean r0 = r3.c()
            if (r0 == 0) goto L2f
            java.lang.Comparable r3 = r3.f2023a
            java.lang.Comparable r0 = r2.f2024b
            int r3 = r3.compareTo(r0)
            if (r3 > 0) goto L2d
            goto L2f
        L2d:
            r3 = 0
            return r3
        L2f:
            r3 = 1
            return r3
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof d6.i
            if (r1 != 0) goto L9
            goto L2d
        L9:
            d6.i r4 = (d6.i) r4
            boolean r1 = r3.f2026d
            boolean r2 = r4.f2026d
            if (r1 == r2) goto L12
            goto L2d
        L12:
            java.lang.Comparable r1 = r3.f2023a
            java.lang.Comparable r2 = r4.f2023a
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.Comparable r1 = r3.f2024b
            java.lang.Comparable r2 = r4.f2024b
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
            boolean r1 = r3.f2025c
            boolean r4 = r4.f2025c
            if (r1 != r4) goto L2d
            return r0
        L2d:
            r4 = 0
            return r4
    }

    public final boolean f() {
            r2 = this;
            boolean r0 = r2.f2026d
            if (r0 != 0) goto L15
            java.lang.Comparable r0 = r2.f2023a
            java.lang.Comparable r1 = r2.f2024b
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L15
            boolean r0 = r2.f2025c
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            boolean r0 = r2.f2026d
            if (r0 == 0) goto L7
            java.lang.String r0 = "[*]"
            return r0
        L7:
            boolean r0 = r2.f2025c
            if (r0 == 0) goto Le
            java.lang.String r0 = "("
            goto L10
        Le:
            java.lang.String r0 = "["
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.Comparable r0 = r2.f2023a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = ", "
            java.lang.String r0 = r0.concat(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.Comparable r0 = r2.f2024b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "]"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }
}
