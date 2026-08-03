package y9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22343b;

    public f(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f22342a = r1
            r0.f22343b = r2
            return
    }

    public final java.lang.String a() {
            r6 = this;
            int r0 = r6.f22342a
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r0 & r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r4 = "#%06X"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            int r5 = r6.f22343b
            if (r0 == r5) goto L37
            r0 = r5 & r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = java.lang.String.format(r4, r0)
            java.lang.String r1 = ","
            java.lang.String r0 = wb.en.h(r2, r1, r0)
            return r0
        L37:
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof y9.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            y9.f r5 = (y9.f) r5
            int r1 = r4.f22342a
            int r3 = r5.f22342a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f22343b
            int r5 = r5.f22343b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f22342a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.f22343b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", endColor="
            java.lang.String r1 = ")"
            int r2 = r5.f22342a
            int r3 = r5.f22343b
            java.lang.String r4 = "ColorSpec(startColor="
            java.lang.String r0 = eh.a.k(r2, r3, r4, r0, r1)
            return r0
    }
}
