package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13340h;

    public d(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f13339g = r1
            r0.f13340h = r2
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            float r0 = r1.f13339g
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof u2.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            u2.d r5 = (u2.d) r5
            float r1 = r4.f13339g
            float r3 = r5.f13339g
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f13340h
            float r5 = r5.f13340h
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f13339g
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f13340h
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            float r0 = r1.f13340h
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DensityImpl(density="
            r0.<init>(r1)
            float r1 = r3.f13339g
            r0.append(r1)
            java.lang.String r1 = ", fontScale="
            r0.append(r1)
            float r1 = r3.f13340h
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
