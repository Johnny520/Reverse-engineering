package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.p0 f12995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12996b;

    public b(f1.p0 r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f12995a = r1
            r0.f12996b = r2
            return
    }

    @Override // t2.o
    public final float a() {
            r1 = this;
            float r0 = r1.f12996b
            return r0
    }

    @Override // t2.o
    public final long b() {
            r2 = this;
            int r0 = f1.w.f3132h
            long r0 = f1.w.f3131g
            return r0
    }

    @Override // t2.o
    public final f1.s c() {
            r1 = this;
            f1.p0 r0 = r1.f12995a
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof t2.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t2.b r5 = (t2.b) r5
            f1.p0 r1 = r4.f12995a
            f1.p0 r3 = r5.f12995a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            float r1 = r4.f12996b
            float r5 = r5.f12996b
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            f1.p0 r0 = r2.f12995a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r2.f12996b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BrushStyle(value="
            r0.<init>(r1)
            f1.p0 r1 = r3.f12995a
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r3.f12996b
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
