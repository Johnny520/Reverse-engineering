package v;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13859a;

    public c(float r2) {
            r1 = this;
            r1.<init>()
            r1.f13859a = r2
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r0 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L11
            goto L12
        L11:
            return
        L12:
            java.lang.String r2 = "The percent should be in the range of [0, 100]"
            o.b.a(r2)
            return
    }

    @Override // v.a
    public final float a(long r1, u2.c r3) {
            r0 = this;
            float r1 = e1.e.b(r1)
            float r2 = r0.f13859a
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            float r2 = r2 * r1
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof v.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v.c r4 = (v.c) r4
            float r1 = r3.f13859a
            float r4 = r4.f13859a
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f13859a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CornerSize(size = "
            r0.<init>(r1)
            float r1 = r2.f13859a
            r0.append(r1)
            java.lang.String r1 = "%)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
