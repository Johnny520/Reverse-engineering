package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m1.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f8625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8627h;

    public k(float r2, float r3, float r4, float r5, float r6, float r7) {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            r1.f8622c = r2
            r1.f8623d = r3
            r1.f8624e = r4
            r1.f8625f = r5
            r1.f8626g = r6
            r1.f8627h = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof m1.k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m1.k r5 = (m1.k) r5
            float r1 = r4.f8622c
            float r3 = r5.f8622c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f8623d
            float r3 = r5.f8623d
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f8624e
            float r3 = r5.f8624e
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r1 = r4.f8625f
            float r3 = r5.f8625f
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L38
            return r2
        L38:
            float r1 = r4.f8626g
            float r3 = r5.f8626g
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L43
            return r2
        L43:
            float r1 = r4.f8627h
            float r5 = r5.f8627h
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L4e
            return r2
        L4e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f8622c
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f8623d
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8624e
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8625f
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8626g
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f8627h
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CurveTo(x1="
            r0.<init>(r1)
            float r1 = r3.f8622c
            r0.append(r1)
            java.lang.String r1 = ", y1="
            r0.append(r1)
            float r1 = r3.f8623d
            r0.append(r1)
            java.lang.String r1 = ", x2="
            r0.append(r1)
            float r1 = r3.f8624e
            r0.append(r1)
            java.lang.String r1 = ", y2="
            r0.append(r1)
            float r1 = r3.f8625f
            r0.append(r1)
            java.lang.String r1 = ", x3="
            r0.append(r1)
            float r1 = r3.f8626g
            r0.append(r1)
            java.lang.String r1 = ", y3="
            r0.append(r1)
            float r1 = r3.f8627h
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
