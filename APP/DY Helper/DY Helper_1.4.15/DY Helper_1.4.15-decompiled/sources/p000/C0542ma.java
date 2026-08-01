package p000;

/* JADX INFO: renamed from: ma */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0542ma extends p000.AbstractC0401in {

    /* JADX INFO: renamed from: β */
    public final float f7041;

    /* JADX INFO: renamed from: γ */
    public final float f7042;

    /* JADX INFO: renamed from: δ */
    public final int f7043;

    public C0542ma(float r1, float r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7041 = r1
            r0.f7042 = r2
            r0.f7043 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            boolean r0 = r3 instanceof p000.C0542ma
            if (r0 != 0) goto L8
            goto L22
        L8:
            ma r3 = (p000.C0542ma) r3
            float r0 = r3.f7041
            float r1 = r2.f7041
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L22
            float r0 = r2.f7042
            float r1 = r3.f7042
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            int r2 = r2.f7043
            int r3 = r3.f7043
            if (r2 != r3) goto L22
        L20:
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f7041
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f7042
            int r0 = p000.lz1.m3676(r2, r0, r1)
            int r3 = r3.f7043
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlurEffect(renderEffect=null, radiusX="
            r0.<init>(r1)
            float r1 = r2.f7041
            r0.append(r1)
            java.lang.String r1 = ", radiusY="
            r0.append(r1)
            float r1 = r2.f7042
            r0.append(r1)
            java.lang.String r1 = ", edgeTreatment="
            r0.append(r1)
            int r2 = r2.f7043
            if (r2 != 0) goto L22
            java.lang.String r2 = "Clamp"
            goto L36
        L22:
            r1 = 1
            if (r2 != r1) goto L28
            java.lang.String r2 = "Repeated"
            goto L36
        L28:
            r1 = 2
            if (r2 != r1) goto L2e
            java.lang.String r2 = "Mirror"
            goto L36
        L2e:
            r1 = 3
            if (r2 != r1) goto L34
            java.lang.String r2 = "Decal"
            goto L36
        L34:
            java.lang.String r2 = "Unknown"
        L36:
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.AbstractC0401in
    /* JADX INFO: renamed from: ε */
    public final android.graphics.RenderEffect mo26() {
            r4 = this;
            float r0 = r4.f7041
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            float r3 = r4.f7042
            if (r2 != 0) goto L12
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            android.graphics.RenderEffect r4 = p000.AbstractC0671p1.m4356()
            return r4
        L12:
            int r4 = r4.f7043
            if (r4 != 0) goto L19
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            goto L38
        L19:
            r1 = 1
            if (r4 != r1) goto L1f
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.REPEAT
            goto L38
        L1f:
            r1 = 2
            if (r4 != r1) goto L25
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.MIRROR
            goto L38
        L25:
            r1 = 3
            if (r4 != r1) goto L36
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L33
            android.graphics.Shader$TileMode r4 = p000.k42.m3162()
            goto L38
        L33:
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            goto L38
        L36:
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
        L38:
            android.graphics.RenderEffect r4 = p000.AbstractC0671p1.m4357(r0, r3, r4)
            return r4
    }
}
