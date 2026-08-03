package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5738c;

    public o(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f5736a = r1
            r0.f5737b = r2
            r0.f5738c = r3
            return
    }

    @Override // i.q
    public final float a(int r2) {
            r1 = this;
            if (r2 == 0) goto L10
            r0 = 1
            if (r2 == r0) goto Ld
            r0 = 2
            if (r2 == r0) goto La
            r2 = 0
            return r2
        La:
            float r2 = r1.f5738c
            return r2
        Ld:
            float r2 = r1.f5737b
            return r2
        L10:
            float r2 = r1.f5736a
            return r2
    }

    @Override // i.q
    public final int b() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // i.q
    public final i.q c() {
            r2 = this;
            i.o r0 = new i.o
            r1 = 0
            r0.<init>(r1, r1, r1)
            return r0
    }

    @Override // i.q
    public final void d() {
            r1 = this;
            r0 = 0
            r1.f5736a = r0
            r1.f5737b = r0
            r1.f5738c = r0
            return
    }

    @Override // i.q
    public final void e(int r2, float r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            r0 = 1
            if (r2 == r0) goto Lc
            r0 = 2
            if (r2 == r0) goto L9
            return
        L9:
            r1.f5738c = r3
            return
        Lc:
            r1.f5737b = r3
            return
        Lf:
            r1.f5736a = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof i.o
            if (r0 == 0) goto L20
            i.o r3 = (i.o) r3
            float r0 = r3.f5736a
            float r1 = r2.f5736a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            float r0 = r3.f5737b
            float r1 = r2.f5737b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            float r3 = r3.f5738c
            float r0 = r2.f5738c
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f5736a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5737b
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f5738c
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector3D: v1 = "
            r0.<init>(r1)
            float r1 = r2.f5736a
            r0.append(r1)
            java.lang.String r1 = ", v2 = "
            r0.append(r1)
            float r1 = r2.f5737b
            r0.append(r1)
            java.lang.String r1 = ", v3 = "
            r0.append(r1)
            float r1 = r2.f5738c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
