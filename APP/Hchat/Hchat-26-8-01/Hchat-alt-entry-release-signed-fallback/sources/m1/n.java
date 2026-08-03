package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends m1.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8646d;

    public n(float r2, float r3) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r1.f8645c = r2
            r1.f8646d = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof m1.n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m1.n r5 = (m1.n) r5
            float r1 = r4.f8645c
            float r3 = r5.f8645c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f8646d
            float r5 = r5.f8646d
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f8645c
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f8646d
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MoveTo(x="
            r0.<init>(r1)
            float r1 = r3.f8645c
            r0.append(r1)
            java.lang.String r1 = ", y="
            r0.append(r1)
            float r1 = r3.f8646d
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
