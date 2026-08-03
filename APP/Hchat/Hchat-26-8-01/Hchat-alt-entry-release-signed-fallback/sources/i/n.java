package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5733b;

    public n(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f5732a = r1
            r0.f5733b = r2
            return
    }

    @Override // i.q
    public final float a(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r2 = 0
            return r2
        L7:
            float r2 = r1.f5733b
            return r2
        La:
            float r2 = r1.f5732a
            return r2
    }

    @Override // i.q
    public final int b() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // i.q
    public final i.q c() {
            r2 = this;
            i.n r0 = new i.n
            r1 = 0
            r0.<init>(r1, r1)
            return r0
    }

    @Override // i.q
    public final void d() {
            r1 = this;
            r0 = 0
            r1.f5732a = r0
            r1.f5733b = r0
            return
    }

    @Override // i.q
    public final void e(int r2, float r3) {
            r1 = this;
            if (r2 == 0) goto L9
            r0 = 1
            if (r2 == r0) goto L6
            return
        L6:
            r1.f5733b = r3
            return
        L9:
            r1.f5732a = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof i.n
            if (r0 == 0) goto L18
            i.n r3 = (i.n) r3
            float r0 = r3.f5732a
            float r1 = r2.f5732a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            float r3 = r3.f5733b
            float r0 = r2.f5733b
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f5732a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f5733b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector2D: v1 = "
            r0.<init>(r1)
            float r1 = r2.f5732a
            r0.append(r1)
            java.lang.String r1 = ", v2 = "
            r0.append(r1)
            float r1 = r2.f5733b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
