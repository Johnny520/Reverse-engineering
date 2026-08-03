package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4142b;

    public t(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f4141a = r1
            r0.f4142b = r2
            return
    }

    public final float[] a() {
            r5 = this;
            float r0 = r5.f4141a
            float r1 = r5.f4142b
            float r2 = r0 / r1
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3 - r0
            float r0 = r0 - r1
            float r0 = r0 / r1
            r1 = 3
            float[] r1 = new float[r1]
            r4 = 0
            r1[r4] = r2
            r2 = 1
            r1[r2] = r3
            r2 = 2
            r1[r2] = r0
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof g1.t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g1.t r5 = (g1.t) r5
            float r1 = r4.f4141a
            float r3 = r5.f4141a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f4142b
            float r5 = r5.f4142b
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f4141a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f4142b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WhitePoint(x="
            r0.<init>(r1)
            float r1 = r3.f4141a
            r0.append(r1)
            java.lang.String r1 = ", y="
            r0.append(r1)
            float r1 = r3.f4142b
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
