package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends i.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5745d;

    public p(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f5742a = r1
            r0.f5743b = r2
            r0.f5744c = r3
            r0.f5745d = r4
            return
    }

    @Override // i.q
    public final float a(int r2) {
            r1 = this;
            if (r2 == 0) goto L16
            r0 = 1
            if (r2 == r0) goto L13
            r0 = 2
            if (r2 == r0) goto L10
            r0 = 3
            if (r2 == r0) goto Ld
            r2 = 0
            return r2
        Ld:
            float r2 = r1.f5745d
            return r2
        L10:
            float r2 = r1.f5744c
            return r2
        L13:
            float r2 = r1.f5743b
            return r2
        L16:
            float r2 = r1.f5742a
            return r2
    }

    @Override // i.q
    public final int b() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // i.q
    public final i.q c() {
            r2 = this;
            i.p r0 = new i.p
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            return r0
    }

    @Override // i.q
    public final void d() {
            r1 = this;
            r0 = 0
            r1.f5742a = r0
            r1.f5743b = r0
            r1.f5744c = r0
            r1.f5745d = r0
            return
    }

    @Override // i.q
    public final void e(int r2, float r3) {
            r1 = this;
            if (r2 == 0) goto L15
            r0 = 1
            if (r2 == r0) goto L12
            r0 = 2
            if (r2 == r0) goto Lf
            r0 = 3
            if (r2 == r0) goto Lc
            return
        Lc:
            r1.f5745d = r3
            return
        Lf:
            r1.f5744c = r3
            return
        L12:
            r1.f5743b = r3
            return
        L15:
            r1.f5742a = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof i.p
            if (r0 == 0) goto L28
            i.p r3 = (i.p) r3
            float r0 = r3.f5742a
            float r1 = r2.f5742a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r3.f5743b
            float r1 = r2.f5743b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r0 = r3.f5744c
            float r1 = r2.f5744c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
            float r3 = r3.f5745d
            float r0 = r2.f5745d
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f5742a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5743b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f5744c
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f5745d
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector4D: v1 = "
            r0.<init>(r1)
            float r1 = r2.f5742a
            r0.append(r1)
            java.lang.String r1 = ", v2 = "
            r0.append(r1)
            float r1 = r2.f5743b
            r0.append(r1)
            java.lang.String r1 = ", v3 = "
            r0.append(r1)
            float r1 = r2.f5744c
            r0.append(r1)
            java.lang.String r1 = ", v4 = "
            r0.append(r1)
            float r1 = r2.f5745d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
