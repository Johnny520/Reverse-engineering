package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class v90 {

    /* JADX INFO: renamed from: α */
    public final float f11184;

    /* JADX INFO: renamed from: β */
    public final float f11185;

    /* JADX INFO: renamed from: γ */
    public final float f11186;

    /* JADX INFO: renamed from: δ */
    public final float f11187;

    public v90(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f11184 = r1
            r0.f11185 = r2
            r0.f11186 = r3
            r0.f11187 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.v90
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v90 r5 = (p000.v90) r5
            float r1 = r4.f11184
            float r3 = r5.f11184
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f11185
            float r3 = r5.f11185
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f11186
            float r3 = r5.f11186
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r4 = r4.f11187
            float r5 = r5.f11187
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f11184
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f11185
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f11186
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f11187
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActiveRect(left="
            r0.<init>(r1)
            float r1 = r2.f11184
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r2.f11185
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            float r1 = r2.f11186
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r2 = r2.f11187
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final float m6139() {
            r1 = this;
            float r0 = r1.f11187
            float r1 = r1.f11185
            float r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final float m6140() {
            r1 = this;
            float r0 = r1.f11186
            float r1 = r1.f11184
            float r0 = r0 - r1
            return r0
    }
}
