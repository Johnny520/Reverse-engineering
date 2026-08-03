package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2.p f13021c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13023b;

    static {
            t2.p r0 = new t2.p
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.<init>(r1, r2)
            t2.p.f13021c = r0
            return
    }

    public p(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f13022a = r1
            r0.f13023b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof t2.p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t2.p r5 = (t2.p) r5
            float r1 = r5.f13022a
            float r3 = r4.f13022a
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1d
            float r1 = r4.f13023b
            float r5 = r5.f13023b
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f13022a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f13023b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextGeometricTransform(scaleX="
            r0.<init>(r1)
            float r1 = r3.f13022a
            r0.append(r1)
            java.lang.String r1 = ", skewX="
            r0.append(r1)
            float r1 = r3.f13023b
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
