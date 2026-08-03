package da;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2144c;

    public c(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f2142a = r1
            r0.f2143b = r2
            if (r1 == r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.f2144c = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof da.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            da.c r5 = (da.c) r5
            int r1 = r4.f2142a
            int r3 = r5.f2142a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f2143b
            int r5 = r5.f2143b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f2142a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.f2143b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", endColor="
            java.lang.String r1 = ")"
            int r2 = r5.f2142a
            int r3 = r5.f2143b
            java.lang.String r4 = "ColorSpec(startColor="
            java.lang.String r0 = eh.a.k(r2, r3, r4, r0, r1)
            return r0
    }
}
