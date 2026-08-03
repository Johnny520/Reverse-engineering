package vh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14373c;

    public b(float r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f14371a = r2
            r0.f14372b = r3
            r0.f14373c = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof vh.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vh.b r5 = (vh.b) r5
            int r1 = r4.f14371a
            int r3 = r5.f14371a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f14372b
            int r3 = r5.f14372b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            float r1 = r4.f14373c
            float r5 = r5.f14373c
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f14371a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f14372b
            int r0 = eh.a.e(r2, r0, r1)
            float r1 = r3.f14373c
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", expHi="
            java.lang.String r1 = ", blend="
            int r2 = r5.f14371a
            int r3 = r5.f14372b
            java.lang.String r4 = "DownScaleBlend(expLo="
            java.lang.StringBuilder r0 = eh.a.s(r2, r3, r4, r0, r1)
            float r1 = r5.f14373c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
