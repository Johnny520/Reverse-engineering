package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4065c;

    public c(int r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f4063a = r2
            r0.f4064b = r3
            r0.f4065c = r1
            int r2 = r2.length()
            if (r2 == 0) goto L1e
            r2 = -1
            if (r1 < r2) goto L17
            r2 = 63
            if (r1 > r2) goto L17
            return
        L17:
            java.lang.String r1 = "The id must be between -1 and 63"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L1e:
            java.lang.String r1 = "The name of a color space cannot be null and must contain at least 1 character"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    public abstract float a(int r1);

    public abstract float b(int r1);

    public boolean c() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract long d(float r1, float r2, float r3);

    public abstract float e(float r1, float r2, float r3);

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            r5 = 1
            return r5
        L4:
            if (r5 == 0) goto L2e
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            if (r0 == r1) goto L11
            goto L2e
        L11:
            g1.c r5 = (g1.c) r5
            int r0 = r4.f4065c
            int r1 = r5.f4065c
            if (r0 == r1) goto L1a
            goto L2e
        L1a:
            java.lang.String r0 = r4.f4063a
            java.lang.String r1 = r5.f4063a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            goto L2e
        L25:
            long r0 = r4.f4064b
            long r2 = r5.f4064b
            boolean r5 = g1.b.a(r0, r2)
            return r5
        L2e:
            r5 = 0
            return r5
    }

    public abstract long f(float r1, float r2, float r3, float r4, g1.c r5);

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f4063a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = g1.b.f4062e
            long r2 = r4.f4064b
            int r0 = eh.a.f(r0, r1, r2)
            int r1 = r4.f4065c
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f4063a
            r0.append(r1)
            java.lang.String r1 = " (id="
            r0.append(r1)
            int r1 = r5.f4065c
            r0.append(r1)
            java.lang.String r1 = ", model="
            r0.append(r1)
            long r1 = g1.b.f4058a
            long r3 = r5.f4064b
            boolean r1 = g1.b.a(r3, r1)
            if (r1 == 0) goto L26
            java.lang.String r1 = "Rgb"
            goto L49
        L26:
            long r1 = g1.b.f4059b
            boolean r1 = g1.b.a(r3, r1)
            if (r1 == 0) goto L31
            java.lang.String r1 = "Xyz"
            goto L49
        L31:
            long r1 = g1.b.f4060c
            boolean r1 = g1.b.a(r3, r1)
            if (r1 == 0) goto L3c
            java.lang.String r1 = "Lab"
            goto L49
        L3c:
            long r1 = g1.b.f4061d
            boolean r1 = g1.b.a(r3, r1)
            if (r1 == 0) goto L47
            java.lang.String r1 = "Cmyk"
            goto L49
        L47:
            java.lang.String r1 = "Unknown"
        L49:
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
