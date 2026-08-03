package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12836d;

    public t(long r1, long r3, long r5, long r7) {
            r0 = this;
            r0.<init>()
            r0.f12833a = r1
            r0.f12834b = r3
            r0.f12835c = r5
            r0.f12836d = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof sh.t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sh.t r8 = (sh.t) r8
            long r3 = r7.f12833a
            long r5 = r8.f12833a
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f12834b
            long r5 = r8.f12834b
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.f12835c
            long r5 = r8.f12835c
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r7.f12836d
            long r5 = r8.f12836d
            boolean r8 = f1.w.c(r3, r5)
            if (r8 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = f1.w.f3132h
            long r0 = r4.f12833a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f12834b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12835c
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f12836d
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r7 = this;
            long r0 = r7.f12833a
            java.lang.String r0 = f1.w.i(r0)
            long r1 = r7.f12834b
            java.lang.String r1 = f1.w.i(r1)
            long r2 = r7.f12835c
            java.lang.String r2 = f1.w.i(r2)
            long r3 = r7.f12836d
            java.lang.String r3 = f1.w.i(r3)
            java.lang.String r4 = ", containerColor="
            java.lang.String r5 = ", selectedContentColor="
            java.lang.String r6 = "DropdownColors(contentColor="
            java.lang.StringBuilder r0 = bc.e.p(r6, r0, r4, r1, r5)
            java.lang.String r1 = ", selectedContainerColor="
            java.lang.String r4 = ")"
            java.lang.String r0 = j8.b.k(r0, r2, r1, r3, r4)
            return r0
    }
}
