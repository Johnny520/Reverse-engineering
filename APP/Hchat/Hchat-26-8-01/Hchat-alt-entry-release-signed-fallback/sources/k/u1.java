package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends y0.n implements x1.v, x1.z1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k.w1 f7081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7082v;

    @Override // x1.v
    public final int G(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            boolean r1 = r0.f7082v
            if (r1 == 0) goto L7
            r3 = 2147483647(0x7fffffff, float:NaN)
        L7:
            int r1 = r2.G(r3)
            return r1
    }

    @Override // x1.v
    public final int K0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            boolean r1 = r0.f7082v
            if (r1 == 0) goto L5
            goto L8
        L5:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L8:
            int r1 = r2.p0(r3)
            return r1
    }

    @Override // x1.v
    public final int Q(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            boolean r1 = r0.f7082v
            if (r1 == 0) goto L7
            r3 = 2147483647(0x7fffffff, float:NaN)
        L7:
            int r1 = r2.M(r3)
            return r1
    }

    @Override // x1.v
    public final int R0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            boolean r1 = r0.f7082v
            if (r1 == 0) goto L5
            goto L8
        L5:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L8:
            int r1 = r2.j(r3)
            return r1
    }

    @Override // x1.z1
    public final void X0(f2.y r5) {
            r4 = this;
            f2.w.f(r5)
            f2.j r0 = new f2.j
            k.t1 r1 = new k.t1
            r2 = 0
            r1.<init>(r4, r2)
            k.t1 r2 = new k.t1
            r3 = 1
            r2.<init>(r4, r3)
            r0.<init>(r1, r2)
            boolean r1 = r4.f7082v
            if (r1 == 0) goto L24
            f2.x r1 = f2.u.f3244v
            mg.d[] r2 = f2.w.f3251a
            r3 = 13
            r2 = r2[r3]
            r5.a(r1, r0)
            return
        L24:
            f2.x r1 = f2.u.f3243u
            mg.d[] r2 = f2.w.f3251a
            r3 = 12
            r2 = r2[r3]
            r5.a(r1, r0)
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r10, v1.m0 r11, long r12) {
            r9 = this;
            boolean r0 = r9.f7082v
            if (r0 == 0) goto L7
            m.p1 r0 = m.p1.f8324g
            goto L9
        L7:
            m.p1 r0 = m.p1.f8325h
        L9:
            k.n.h(r12, r0)
            boolean r0 = r9.f7082v
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L15
            r7 = r1
            goto L1a
        L15:
            int r0 = u2.a.g(r12)
            r7 = r0
        L1a:
            boolean r0 = r9.f7082v
            if (r0 == 0) goto L22
            int r1 = u2.a.h(r12)
        L22:
            r5 = r1
            r6 = 0
            r8 = 5
            r4 = 0
            r2 = r12
            long r12 = u2.a.a(r2, r4, r5, r6, r7, r8)
            v1.b1 r11 = r11.Q(r12)
            int r12 = r11.f13900g
            int r13 = u2.a.h(r2)
            if (r12 <= r13) goto L38
            r12 = r13
        L38:
            int r13 = r11.f13901h
            int r0 = u2.a.g(r2)
            if (r13 <= r0) goto L41
            r13 = r0
        L41:
            int r0 = r11.f13901h
            int r0 = r0 - r13
            int r1 = r11.f13900g
            int r1 = r1 - r12
            boolean r2 = r9.f7082v
            if (r2 == 0) goto L4c
            goto L4d
        L4c:
            r0 = r1
        L4d:
            k.w1 r1 = r9.f7081u
            i0.g1 r2 = r1.f7097e
            i0.g1 r1 = r1.f7093a
            r2.h(r0)
            w0.f r2 = w0.q.e()
            if (r2 == 0) goto L61
            fg.l r3 = r2.e()
            goto L62
        L61:
            r3 = 0
        L62:
            w0.f r4 = w0.q.h(r2)
            int r5 = r1.g()     // Catch: java.lang.Throwable -> L70
            if (r5 <= r0) goto L73
            r1.h(r0)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r0 = move-exception
            r10 = r0
            goto La1
        L73:
            w0.q.k(r2, r4, r3)
            k.w1 r1 = r9.f7081u
            boolean r2 = r9.f7082v
            if (r2 == 0) goto L7e
            r2 = r13
            goto L7f
        L7e:
            r2 = r12
        L7f:
            i0.g1 r1 = r1.f7094b
            r1.h(r2)
            k.w1 r1 = r9.f7081u
            boolean r2 = r9.f7082v
            if (r2 == 0) goto L8d
            int r2 = r11.f13901h
            goto L8f
        L8d:
            int r2 = r11.f13900g
        L8f:
            i0.g1 r1 = r1.f7095c
            r1.h(r2)
            eb.v0 r1 = new eb.v0
            r2 = 2
            r1.<init>(r9, r0, r11, r2)
            tf.u r11 = tf.u.f13168g
            v1.o0 r10 = r10.z(r12, r13, r11, r1)
            return r10
        La1:
            w0.q.k(r2, r4, r3)
            throw r10
    }
}
