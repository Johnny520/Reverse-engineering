package v;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13858a;

    public b(float r1) {
            r0 = this;
            r0.<init>()
            r0.f13858a = r1
            return
    }

    @Override // v.a
    public final float a(long r1, u2.c r3) {
            r0 = this;
            float r1 = r0.f13858a
            float r1 = r3.x0(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof v.b
            if (r0 != 0) goto L8
            goto L14
        L8:
            v.b r2 = (v.b) r2
            float r0 = r1.f13858a
            float r2 = r2.f13858a
            boolean r2 = u2.f.b(r0, r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f13858a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CornerSize(size = "
            r0.<init>(r1)
            float r1 = r2.f13858a
            r0.append(r1)
            java.lang.String r1 = ".dp)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
