package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4762c;

    public u0(float r1, float r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f4760a = r1
            r0.f4761b = r2
            r0.f4762c = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h.u0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.u0 r8 = (h.u0) r8
            float r1 = r7.f4760a
            float r3 = r8.f4760a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r7.f4761b
            float r3 = r8.f4761b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            long r3 = r7.f4762c
            long r5 = r8.f4762c
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L2b
            return r2
        L2b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f4760a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f4761b
            int r0 = eh.a.d(r2, r0, r1)
            long r1 = r3.f4762c
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FlingInfo(initialVelocity="
            r0.<init>(r1)
            float r1 = r3.f4760a
            r0.append(r1)
            java.lang.String r1 = ", distance="
            r0.append(r1)
            float r1 = r3.f4761b
            r0.append(r1)
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r3.f4762c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
