package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends f1.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3121a;

    public t0(long r1) {
            r0 = this;
            r0.<init>()
            r0.f3121a = r1
            return
    }

    @Override // f1.s
    public final void a(float r3, long r4, f1.h r6) {
            r2 = this;
            r4 = 1065353216(0x3f800000, float:1.0)
            r6.u(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            long r0 = r2.f3121a
            if (r4 != 0) goto Lc
            goto L15
        Lc:
            float r4 = f1.w.d(r0)
            float r4 = r4 * r3
            long r0 = f1.w.b(r0, r4)
        L15:
            r6.w(r0)
            java.lang.Object r3 = r6.f3059j
            android.graphics.Shader r3 = (android.graphics.Shader) r3
            if (r3 == 0) goto L22
            r3 = 0
            r6.z(r3)
        L22:
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof f1.t0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f1.t0 r8 = (f1.t0) r8
            long r3 = r8.f3121a
            long r5 = r7.f3121a
            boolean r8 = f1.w.c(r5, r3)
            if (r8 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = f1.w.f3132h
            long r0 = r2.f3121a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SolidColor(value="
            r0.<init>(r1)
            long r1 = r3.f3121a
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
