package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p.y f9866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f9867v;

    @Override // x1.v
    public final v1.o0 j(v1.p0 r5, v1.m0 r6, long r7) {
            r4 = this;
            boolean r0 = u2.a.d(r7)
            if (r0 == 0) goto L29
            p.y r0 = r4.f9866u
            p.y r1 = p.y.f10036g
            if (r0 == r1) goto L29
            int r0 = u2.a.h(r7)
            float r0 = (float) r0
            float r1 = r4.f9867v
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r1 = u2.a.j(r7)
            int r2 = u2.a.h(r7)
            if (r0 >= r1) goto L23
            r0 = r1
        L23:
            if (r0 <= r2) goto L26
            goto L27
        L26:
            r2 = r0
        L27:
            r0 = r2
            goto L31
        L29:
            int r2 = u2.a.j(r7)
            int r0 = u2.a.h(r7)
        L31:
            boolean r1 = u2.a.c(r7)
            if (r1 == 0) goto L5a
            p.y r1 = r4.f9866u
            p.y r3 = p.y.f10037h
            if (r1 == r3) goto L5a
            int r1 = u2.a.g(r7)
            float r1 = (float) r1
            float r3 = r4.f9867v
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            int r3 = u2.a.i(r7)
            int r7 = u2.a.g(r7)
            if (r1 >= r3) goto L54
            r1 = r3
        L54:
            if (r1 <= r7) goto L57
            goto L58
        L57:
            r7 = r1
        L58:
            r8 = r7
            goto L64
        L5a:
            int r1 = u2.a.i(r7)
            int r7 = u2.a.g(r7)
            r8 = r7
            r7 = r1
        L64:
            long r7 = u2.b.a(r2, r0, r7, r8)
            v1.b1 r6 = r6.Q(r7)
            int r7 = r6.f13900g
            int r8 = r6.f13901h
            g0.g r0 = new g0.g
            r1 = 2
            r0.<init>(r6, r1)
            tf.u r6 = tf.u.f13168g
            v1.o0 r5 = r5.z(r7, r8, r6, r0)
            return r5
    }
}
