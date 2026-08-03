package v2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f14061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f14062b;

    static {
            return
    }

    public c(float[] r3, float[] r4) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            int r1 = r4.length
            if (r0 != r1) goto Lf
            int r0 = r3.length
            if (r0 == 0) goto Lf
            r2.f14061a = r3
            r2.f14062b = r4
            return
        Lf:
            java.lang.String r3 = "Array lengths must match and be nonzero"
            j8.o.t(r3)
            r3 = 0
            throw r3
    }

    @Override // v2.a
    public final float a(float r3) {
            r2 = this;
            float[] r0 = r2.f14062b
            float[] r1 = r2.f14061a
            float r3 = uf.d.c(r3, r0, r1)
            return r3
    }

    @Override // v2.a
    public final float b(float r3) {
            r2 = this;
            float[] r0 = r2.f14061a
            float[] r1 = r2.f14062b
            float r3 = uf.d.c(r3, r0, r1)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            if (r3 != 0) goto L6
            goto L23
        L6:
            boolean r0 = r3 instanceof v2.c
            if (r0 != 0) goto Lb
            goto L23
        Lb:
            v2.c r3 = (v2.c) r3
            float[] r0 = r3.f14061a
            float[] r1 = r2.f14061a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L23
            float[] r0 = r2.f14062b
            float[] r3 = r3.f14062b
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L23
        L21:
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            float[] r0 = r2.f14061a
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            float[] r1 = r2.f14062b
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FontScaleConverter{fromSpValues="
            r0.<init>(r1)
            float[] r1 = r2.f14061a
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r1.getClass()
            r0.append(r1)
            java.lang.String r1 = ", toDpValues="
            r0.append(r1)
            float[] r1 = r2.f14062b
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r1.getClass()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
