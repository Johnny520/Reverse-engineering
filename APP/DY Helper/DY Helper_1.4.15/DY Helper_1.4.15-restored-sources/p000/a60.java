package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a60 implements p000.y50 {

    /* JADX INFO: renamed from: α */
    public final float[] f75;

    /* JADX INFO: renamed from: β */
    public final float[] f76;

    static {
            return
    }

    public a60(float[] r3, float[] r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            int r1 = r4.length
            if (r0 != r1) goto Lf
            int r0 = r3.length
            if (r0 == 0) goto Lf
            r2.f75 = r3
            r2.f76 = r4
            return
        Lf:
            java.lang.String r2 = "Array lengths must match and be nonzero"
            p000.C1080.m7275(r2)
            r2 = 0
            throw r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            if (r3 != 0) goto L6
            goto L23
        L6:
            boolean r0 = r3 instanceof p000.a60
            if (r0 != 0) goto Lb
            goto L23
        Lb:
            a60 r3 = (p000.a60) r3
            float[] r0 = r3.f75
            float[] r1 = r2.f75
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L23
            float[] r2 = r2.f76
            float[] r3 = r3.f76
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L23
        L21:
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float[] r0 = r1.f75
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            float[] r1 = r1.f76
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FontScaleConverter{fromSpValues="
            r0.<init>(r1)
            float[] r1 = r2.f75
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r1.getClass()
            r0.append(r1)
            java.lang.String r1 = ", toDpValues="
            r0.append(r1)
            float[] r2 = r2.f76
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r2.getClass()
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.y50
    /* JADX INFO: renamed from: α */
    public final float mo43(float r2) {
            r1 = this;
            float[] r0 = r1.f76
            float[] r1 = r1.f75
            float r1 = p000.C0381i2.m2587(r2, r0, r1)
            return r1
    }

    @Override // p000.y50
    /* JADX INFO: renamed from: β */
    public final float mo44(float r2) {
            r1 = this;
            float[] r0 = r1.f75
            float[] r1 = r1.f76
            float r1 = p000.C0381i2.m2587(r2, r0, r1)
            return r1
    }
}
