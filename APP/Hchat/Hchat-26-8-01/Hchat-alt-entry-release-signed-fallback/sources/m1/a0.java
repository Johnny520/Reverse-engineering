package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends m1.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8501c;

    public a0(float r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            r1.f8501c = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof m1.a0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m1.a0 r4 = (m1.a0) r4
            float r1 = r3.f8501c
            float r4 = r4.f8501c
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f8501c
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VerticalTo(y="
            r0.<init>(r1)
            float r1 = r3.f8501c
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
