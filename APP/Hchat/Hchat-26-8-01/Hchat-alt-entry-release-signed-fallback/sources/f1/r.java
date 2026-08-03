package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f3112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f3113i;

    public r(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f3112h = r1
            r0.f3113i = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1a
        L3:
            boolean r0 = r3 instanceof f1.r
            if (r0 != 0) goto L8
            goto L1c
        L8:
            f1.r r3 = (f1.r) r3
            float r0 = r3.f3112h
            float r1 = r2.f3112h
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L1c
            float r0 = r2.f3113i
            float r3 = r3.f3113i
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f3112h
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f3113i
            int r0 = eh.a.d(r2, r0, r1)
            r1 = 3
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // f1.n0
    public final android.graphics.RenderEffect i() {
            r4 = this;
            float r0 = r4.f3112h
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            float r3 = r4.f3113i
            if (r2 != 0) goto L12
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            android.graphics.RenderEffect r0 = a1.c.e()
            return r0
        L12:
            r1 = 3
            android.graphics.Shader$TileMode r1 = f1.c0.v(r1)
            android.graphics.RenderEffect r0 = a1.c.f(r0, r3, r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlurEffect(renderEffect=null, radiusX="
            r0.<init>(r1)
            float r1 = r2.f3112h
            r0.append(r1)
            java.lang.String r1 = ", radiusY="
            r0.append(r1)
            float r1 = r2.f3113i
            r0.append(r1)
            java.lang.String r1 = ", edgeTreatment="
            r0.append(r1)
            java.lang.String r1 = "Decal"
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
