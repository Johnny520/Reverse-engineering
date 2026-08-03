package uh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh.c f13855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13857c;

    public d(uh.c r3, float r4) {
            r2 = this;
            long r0 = f1.w.f3127c
            r2.<init>(r3, r0, r4)
            return
    }

    public d(uh.c r1, long r2, float r4) {
            r0 = this;
            r0.<init>()
            r0.f13855a = r1
            r0.f13856b = r2
            r0.f13857c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof uh.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            uh.d r8 = (uh.d) r8
            uh.c r1 = r7.f13855a
            uh.c r3 = r8.f13855a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f13856b
            long r5 = r8.f13856b
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L22
            return r2
        L22:
            float r1 = r7.f13857c
            float r8 = r8.f13857c
            int r8 = java.lang.Float.compare(r1, r8)
            if (r8 == 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            uh.c r0 = r4.f13855a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = f1.w.f3132h
            long r2 = r4.f13856b
            int r0 = eh.a.f(r0, r1, r2)
            float r1 = r4.f13857c
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            long r0 = r3.f13856b
            java.lang.String r0 = f1.w.i(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LightSource(position="
            r1.<init>(r2)
            uh.c r2 = r3.f13855a
            r1.append(r2)
            java.lang.String r2 = ", color="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", intensity="
            r1.append(r0)
            float r0 = r3.f13857c
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
