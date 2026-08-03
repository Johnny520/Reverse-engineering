package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p.x0 f9861u;

    @Override // x1.v
    public final v1.o0 j(v1.p0 r10, v1.m0 r11, long r12) {
            r9 = this;
            p.x0 r0 = r9.f9861u
            u2.m r1 = r10.getLayoutDirection()
            float r0 = r0.d(r1)
            p.x0 r1 = r9.f9861u
            float r1 = r1.c()
            p.x0 r2 = r9.f9861u
            u2.m r3 = r10.getLayoutDirection()
            float r2 = r2.b(r3)
            p.x0 r3 = r9.f9861u
            float r3 = r3.a()
            r4 = 0
            float r5 = (float) r4
            int r6 = u2.f.a(r0, r5)
            r7 = 1
            if (r6 < 0) goto L2b
            r6 = r7
            goto L2c
        L2b:
            r6 = r4
        L2c:
            int r8 = u2.f.a(r1, r5)
            if (r8 < 0) goto L34
            r8 = r7
            goto L35
        L34:
            r8 = r4
        L35:
            r6 = r6 & r8
            int r8 = u2.f.a(r2, r5)
            if (r8 < 0) goto L3e
            r8 = r7
            goto L3f
        L3e:
            r8 = r4
        L3f:
            r6 = r6 & r8
            int r5 = u2.f.a(r3, r5)
            if (r5 < 0) goto L47
            r4 = r7
        L47:
            r4 = r4 & r6
            if (r4 != 0) goto L4f
            java.lang.String r4 = "Padding must be non-negative"
            q.a.a(r4)
        L4f:
            int r0 = r10.G0(r0)
            int r2 = r10.G0(r2)
            int r2 = r2 + r0
            int r1 = r10.G0(r1)
            int r3 = r10.G0(r3)
            int r3 = r3 + r1
            int r4 = -r2
            int r5 = -r3
            long r4 = u2.b.i(r4, r5, r12)
            v1.b1 r11 = r11.Q(r4)
            int r4 = r11.f13900g
            int r4 = r4 + r2
            int r2 = u2.b.g(r4, r12)
            int r4 = r11.f13901h
            int r4 = r4 + r3
            int r12 = u2.b.f(r4, r12)
            p.h0 r13 = new p.h0
            r3 = 1
            r13.<init>(r11, r0, r1, r3)
            tf.u r11 = tf.u.f13168g
            v1.o0 r10 = r10.z(r2, r12, r11, r13)
            return r10
    }
}
