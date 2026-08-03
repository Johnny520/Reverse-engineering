package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p.y f10027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public fg.p f10028v;

    @Override // x1.v
    public final v1.o0 j(v1.p0 r9, v1.m0 r10, long r11) {
            r8 = this;
            p.y r0 = r8.f10027u
            p.y r1 = p.y.f10036g
            r2 = 0
            if (r0 == r1) goto L9
            r0 = r2
            goto Ld
        L9:
            int r0 = u2.a.j(r11)
        Ld:
            p.y r1 = r8.f10027u
            p.y r3 = p.y.f10037h
            if (r1 == r3) goto L14
            goto L18
        L14:
            int r2 = u2.a.i(r11)
        L18:
            int r1 = u2.a.h(r11)
            int r3 = u2.a.g(r11)
            long r0 = u2.b.a(r0, r1, r2, r3)
            v1.b1 r5 = r10.Q(r0)
            int r10 = r5.f13900g
            int r0 = u2.a.j(r11)
            int r1 = u2.a.h(r11)
            int r4 = r9.e0.r(r10, r0, r1)
            int r10 = r5.f13901h
            int r0 = u2.a.i(r11)
            int r11 = u2.a.g(r11)
            int r6 = r9.e0.r(r10, r0, r11)
            p.u1 r2 = new p.u1
            r3 = r8
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            tf.u r9 = tf.u.f13168g
            v1.o0 r9 = r7.z(r4, r6, r9, r2)
            return r9
    }
}
