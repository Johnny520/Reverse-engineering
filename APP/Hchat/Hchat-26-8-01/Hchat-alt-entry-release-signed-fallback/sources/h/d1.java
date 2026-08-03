package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends h.x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i.r0 f4644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f4645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f4646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4647y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i0.j1 f4648z;

    public d1(i.r0 r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r2.f4644v = r3
            long r0 = h.d0.f4643a
            r2.f4645w = r0
            r3 = 0
            r0 = 15
            long r0 = u2.b.b(r3, r3, r3, r3, r0)
            r2.f4646x = r0
            r3 = 0
            i0.j1 r3 = i0.r.u(r3)
            r2.f4648z = r3
            return
    }

    @Override // y0.n
    public final void c1() {
            r2 = this;
            long r0 = h.d0.f4643a
            r2.f4645w = r0
            r0 = 0
            r2.f4647y = r0
            return
    }

    @Override // y0.n
    public final void e1() {
            r2 = this;
            r0 = 0
            i0.j1 r1 = r2.f4648z
            r1.setValue(r0)
            return
    }

    @Override // h.x0, x1.v
    public final v1.o0 j(v1.p0 r21, v1.m0 r22, long r23) {
            r20 = this;
            r1 = r20
            r6 = r23
            boolean r0 = r21.u0()
            r2 = 1
            if (r0 == 0) goto L15
            r1.f4646x = r6
            r1.f4647y = r2
            v1.b1 r0 = r22.Q(r23)
        L13:
            r8 = r0
            goto L25
        L15:
            boolean r0 = r1.f4647y
            if (r0 == 0) goto L1e
            long r3 = r1.f4646x
        L1b:
            r0 = r22
            goto L20
        L1e:
            r3 = r6
            goto L1b
        L20:
            v1.b1 r0 = r0.Q(r3)
            goto L13
        L25:
            int r0 = r8.f13900g
            int r3 = r8.f13901h
            long r4 = (long) r0
            r9 = 32
            long r4 = r4 << r9
            long r10 = (long) r3
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            long r10 = r10 | r4
            boolean r0 = r21.u0()
            if (r0 == 0) goto L44
            r1.f4645w = r10
            r22 = r9
            r0 = r10
            r16 = r0
            goto Le7
        L44:
            long r3 = r1.f4645w
            long r14 = h.d0.f4643a
            boolean r0 = u2.l.a(r3, r14)
            if (r0 != 0) goto L51
            long r3 = r1.f4645w
            goto L52
        L51:
            r3 = r10
        L52:
            i0.j1 r14 = r1.f4648z
            java.lang.Object r0 = r14.getValue()
            h.a1 r0 = (h.a1) r0
            if (r0 == 0) goto Lb4
            i.c r5 = r0.f4612a
            java.lang.Object r15 = r5.d()
            u2.l r15 = (u2.l) r15
            r22 = r9
            r16 = r10
            long r9 = r15.f13353a
            boolean r9 = u2.l.a(r3, r9)
            if (r9 != 0) goto L7f
            i0.j1 r9 = r5.f5605d
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L7f
            goto L80
        L7f:
            r2 = 0
        L80:
            i0.j1 r9 = r5.f5606e
            java.lang.Object r9 = r9.getValue()
            u2.l r9 = (u2.l) r9
            long r9 = r9.f13353a
            boolean r9 = u2.l.a(r3, r9)
            if (r9 == 0) goto L95
            if (r2 == 0) goto L93
            goto L95
        L93:
            r1 = r0
            goto Lb2
        L95:
            java.lang.Object r2 = r5.d()
            u2.l r2 = (u2.l) r2
            long r9 = r2.f13353a
            r0.f4613b = r9
            qg.t r9 = r1.Y0()
            r1 = r0
            h.b1 r0 = new h.b1
            r5 = 0
            r2 = r3
            r4 = r20
            r0.<init>(r1, r2, r4, r5)
            r2 = 3
            r3 = 0
            qg.v.q(r9, r3, r0, r2)
        Lb2:
            r0 = r1
            goto Ld6
        Lb4:
            r22 = r9
            r16 = r10
            h.a1 r0 = new h.a1
            i.c r1 = new i.c
            u2.l r5 = new u2.l
            r5.<init>(r3)
            i.m1 r9 = i.d.f5635q
            long r10 = (long) r2
            long r18 = r10 << r22
            long r10 = r10 & r12
            long r10 = r18 | r10
            u2.l r2 = new u2.l
            r2.<init>(r10)
            r10 = 8
            r1.<init>(r5, r9, r2, r10)
            r0.<init>(r1, r3)
        Ld6:
            r14.setValue(r0)
            i.c r0 = r0.f4612a
            java.lang.Object r0 = r0.d()
            u2.l r0 = (u2.l) r0
            long r0 = r0.f13353a
            long r0 = u2.b.d(r6, r0)
        Le7:
            long r2 = r0 >> r22
            int r4 = (int) r2
            long r0 = r0 & r12
            int r5 = (int) r0
            h.c1 r0 = new h.c1
            r1 = r20
            r6 = r21
            r7 = r8
            r2 = r16
            r0.<init>(r1, r2, r4, r5, r6, r7)
            tf.u r1 = tf.u.f13168g
            v1.o0 r0 = r6.z(r4, r5, r1, r0)
            return r0
    }
}
