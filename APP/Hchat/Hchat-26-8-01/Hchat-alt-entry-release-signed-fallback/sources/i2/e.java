package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f6288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f6291d;

    public e(int r2, int r3, java.lang.Object r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public e(java.lang.String r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f6288a = r4
            r0.f6289b = r2
            r0.f6290c = r3
            r0.f6291d = r1
            if (r2 > r3) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L17
            java.lang.String r1 = "Reversed range is not supported"
            o2.a.a(r1)
        L17:
            return
    }

    public static i2.e a(i2.e r1, i2.u r2, int r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L6
            java.lang.Object r2 = r1.f6288a
        L6:
            int r0 = r1.f6289b
            r4 = r4 & 4
            if (r4 == 0) goto Le
            int r3 = r1.f6290c
        Le:
            java.lang.String r1 = r1.f6291d
            i2.e r4 = new i2.e
            r4.<init>(r1, r0, r3, r2)
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof i2.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.e r5 = (i2.e) r5
            java.lang.Object r1 = r4.f6288a
            java.lang.Object r3 = r5.f6288a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f6289b
            int r3 = r5.f6289b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.f6290c
            int r3 = r5.f6290c
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r4.f6291d
            java.lang.String r5 = r5.f6291d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f6288a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f6289b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f6290c
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r1 = r3.f6291d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Range(item="
            r0.<init>(r1)
            java.lang.Object r1 = r3.f6288a
            r0.append(r1)
            java.lang.String r1 = ", start="
            r0.append(r1)
            int r1 = r3.f6289b
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r3.f6290c
            r0.append(r1)
            java.lang.String r1 = ", tag="
            r0.append(r1)
            java.lang.String r1 = r3.f6291d
            r2 = 41
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
