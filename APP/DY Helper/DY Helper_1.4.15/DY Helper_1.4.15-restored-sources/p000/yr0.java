package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yr0 implements p000.y50 {

    /* JADX INFO: renamed from: α */
    public final float f12769;

    public yr0(float r1) {
            r0 = this;
            r0.<init>()
            r0.f12769 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.yr0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yr0 r4 = (p000.yr0) r4
            float r3 = r3.f12769
            float r4 = r4.f12769
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.f12769
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LinearFontScaleConverter(fontScale="
            r0.<init>(r1)
            float r2 = r2.f12769
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.y50
    /* JADX INFO: renamed from: α */
    public final float mo43(float r1) {
            r0 = this;
            float r0 = r0.f12769
            float r1 = r1 / r0
            return r1
    }

    @Override // p000.y50
    /* JADX INFO: renamed from: β */
    public final float mo44(float r1) {
            r0 = this;
            float r0 = r0.f12769
            float r1 = r1 * r0
            return r1
    }
}
