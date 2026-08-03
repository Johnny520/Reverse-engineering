package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements i.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f5771c;

    public r0(float r1, float r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f5769a = r1
            r0.f5770b = r2
            r0.f5771c = r3
            return
    }

    public /* synthetic */ r0(java.lang.Object r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1153138688(0x44bb8000, float:1500.0)
            r2.<init>(r0, r1, r3)
            return
    }

    @Override // i.k
    public final i.n1 a(i.m1 r4) {
            r3 = this;
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            java.lang.Object r1 = r3.f5771c
            if (r1 != 0) goto L8
            r4 = 0
            goto L10
        L8:
            fg.l r4 = r4.f5730a
            java.lang.Object r4 = r4.invoke(r1)
            i.q r4 = (i.q) r4
        L10:
            float r1 = r3.f5769a
            float r2 = r3.f5770b
            r0.<init>(r1, r2, r4)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof i.r0
            r1 = 0
            if (r0 == 0) goto L23
            i.r0 r4 = (i.r0) r4
            float r0 = r4.f5769a
            float r2 = r3.f5769a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            float r0 = r4.f5770b
            float r2 = r3.f5770b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            java.lang.Object r4 = r4.f5771c
            java.lang.Object r0 = r3.f5771c
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L23
            r4 = 1
            return r4
        L23:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f5771c
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5769a
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r3.f5770b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
