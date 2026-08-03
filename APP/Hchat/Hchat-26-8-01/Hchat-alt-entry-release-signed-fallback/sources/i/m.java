package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5728a;

    public m(float r1) {
            r0 = this;
            r0.<init>()
            r0.f5728a = r1
            return
    }

    @Override // i.q
    public final float a(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            float r1 = r0.f5728a
            return r1
        L5:
            r1 = 0
            return r1
    }

    @Override // i.q
    public final int b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // i.q
    public final i.q c() {
            r2 = this;
            i.m r0 = new i.m
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // i.q
    public final void d() {
            r1 = this;
            r0 = 0
            r1.f5728a = r0
            return
    }

    @Override // i.q
    public final void e(int r1, float r2) {
            r0 = this;
            if (r1 != 0) goto L4
            r0.f5728a = r2
        L4:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof i.m
            if (r0 == 0) goto L10
            i.m r2 = (i.m) r2
            float r2 = r2.f5728a
            float r0 = r1.f5728a
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f5728a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationVector1D: value = "
            r0.<init>(r1)
            float r1 = r2.f5728a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
