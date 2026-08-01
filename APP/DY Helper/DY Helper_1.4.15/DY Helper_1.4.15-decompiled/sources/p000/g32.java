package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g32 {

    /* JADX INFO: renamed from: γ */
    public static final p000.g32 f4224 = null;

    /* JADX INFO: renamed from: α */
    public final float f4225;

    /* JADX INFO: renamed from: β */
    public final float f4226;

    static {
            g32 r0 = new g32
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.<init>(r1, r2)
            p000.g32.f4224 = r0
            return
    }

    public g32(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f4225 = r1
            r0.f4226 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.g32
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g32 r5 = (p000.g32) r5
            float r1 = r5.f4225
            float r3 = r4.f4225
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1d
            float r4 = r4.f4226
            float r5 = r5.f4226
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f4225
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.f4226
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextGeometricTransform(scaleX="
            r0.<init>(r1)
            float r1 = r2.f4225
            r0.append(r1)
            java.lang.String r1 = ", skewX="
            r0.append(r1)
            float r2 = r2.f4226
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
