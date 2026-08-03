package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21809a;

    public e(float r1) {
            r0 = this;
            r0.<init>()
            r0.f21809a = r1
            return
    }

    public final int a(int r2, int r3, u2.m r4) {
            r1 = this;
            int r3 = r3 - r2
            float r2 = (float) r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            u2.m r3 = u2.m.f13354g
            float r0 = r1.f21809a
            if (r4 != r3) goto Lc
            goto Lf
        Lc:
            r3 = -1
            float r3 = (float) r3
            float r0 = r0 * r3
        Lf:
            r3 = 1
            float r3 = (float) r3
            float r3 = r3 + r0
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof y0.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            y0.e r4 = (y0.e) r4
            float r1 = r3.f21809a
            float r4 = r4.f21809a
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f21809a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Horizontal(bias="
            r0.<init>(r1)
            float r1 = r3.f21809a
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
