package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends h.x0 {
    public h.s0 A;
    public fg.a B;
    public h.h0 C;
    public long D;
    public y0.c E;
    public final h.p0 F;
    public final h.p0 G;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i.k1 f4737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i.d1 f4738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.d1 f4739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i.d1 f4740y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h.r0 f4741z;

    public q0(i.k1 r2, i.d1 r3, i.d1 r4, i.d1 r5, h.r0 r6, h.s0 r7, fg.a r8, h.h0 r9) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f4737v = r2
            r1.f4738w = r3
            r1.f4739x = r4
            r1.f4740y = r5
            r1.f4741z = r6
            r1.A = r7
            r1.B = r8
            r1.C = r9
            long r2 = h.d0.f4643a
            r1.D = r2
            r2 = 0
            r3 = 15
            u2.b.b(r2, r2, r2, r2, r3)
            h.p0 r2 = new h.p0
            r3 = 0
            r2.<init>(r1, r3)
            r1.F = r2
            h.p0 r2 = new h.p0
            r3 = 1
            r2.<init>(r1, r3)
            r1.G = r2
            return
    }

    @Override // y0.n
    public final void c1() {
            r2 = this;
            long r0 = h.d0.f4643a
            r2.D = r0
            return
    }

    @Override // h.x0, x1.v
    public final v1.o0 j(v1.p0 r25, v1.m0 r26, long r27) {
            r24 = this;
            r0 = r24
            r1 = r25
            i.k1 r2 = r0.f4737v
            java.lang.Object r2 = r2.c()
            i.k1 r3 = r0.f4737v
            i0.j1 r3 = r3.f5710d
            java.lang.Object r3 = r3.getValue()
            r4 = 0
            if (r2 != r3) goto L18
            r0.E = r4
            goto L26
        L18:
            y0.c r2 = r0.E
            if (r2 != 0) goto L26
            y0.c r2 = r0.m1()
            if (r2 != 0) goto L24
            y0.g r2 = y0.b.f21792g
        L24:
            r0.E = r2
        L26:
            boolean r2 = r1.u0()
            tf.u r3 = tf.u.f13168g
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 32
            if (r2 == 0) goto L55
            v1.b1 r2 = r26.Q(r27)
            int r4 = r2.f13900g
            int r8 = r2.f13901h
            long r9 = (long) r4
            long r9 = r9 << r7
            long r11 = (long) r8
            long r11 = r11 & r5
            long r8 = r9 | r11
            r0.D = r8
            long r10 = r8 >> r7
            int r4 = (int) r10
            long r5 = r5 & r8
            int r5 = (int) r5
            c1.n r6 = new c1.n
            r7 = 2
            r6.<init>(r2, r7)
            v1.o0 r1 = r1.z(r4, r5, r3, r6)
            return r1
        L55:
            fg.a r2 = r0.B
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L15a
            h.h0 r2 = r0.C
            i.d1 r8 = r2.f4684a
            i.d1 r9 = r2.f4685b
            i.k1 r10 = r2.f4686c
            h.r0 r11 = r2.f4687d
            h.s0 r12 = r2.f4688e
            i.d1 r2 = r2.f4689f
            if (r8 == 0) goto L84
            h.i0 r13 = new h.i0
            r14 = 0
            r13.<init>(r11, r12, r14)
            h.i0 r14 = new h.i0
            r15 = 1
            r14.<init>(r11, r12, r15)
            i.c1 r8 = r8.a(r13, r14)
            goto L85
        L84:
            r8 = r4
        L85:
            if (r9 == 0) goto L98
            h.i0 r13 = new h.i0
            r14 = 2
            r13.<init>(r11, r12, r14)
            h.i0 r14 = new h.i0
            r15 = 3
            r14.<init>(r11, r12, r15)
            i.c1 r9 = r9.a(r13, r14)
            goto L99
        L98:
            r9 = r4
        L99:
            java.lang.Object r10 = r10.c()
            h.f0 r13 = h.f0.f4659g
            if (r10 != r13) goto La4
            h.h1 r10 = r12.f4753a
            goto La6
        La4:
            h.h1 r10 = r12.f4753a
        La6:
            if (r2 == 0) goto Lb5
            h.c r10 = h.c.f4625m
            b1.g r13 = new b1.g
            r14 = 4
            r13.<init>(r4, r11, r12, r14)
            i.c1 r2 = r2.a(r10, r13)
            goto Lb6
        Lb5:
            r2 = r4
        Lb6:
            b1.g r10 = new b1.g
            r11 = 3
            r10.<init>(r8, r9, r2, r11)
            v1.b1 r11 = r26.Q(r27)
            int r2 = r11.f13900g
            int r8 = r11.f13901h
            long r12 = (long) r2
            long r12 = r12 << r7
            long r8 = (long) r8
            long r8 = r8 & r5
            long r8 = r8 | r12
            long r12 = r0.D
            long r14 = h.d0.f4643a
            boolean r2 = u2.l.a(r12, r14)
            if (r2 != 0) goto Ld6
            long r12 = r0.D
            goto Ld7
        Ld6:
            r12 = r8
        Ld7:
            i.d1 r2 = r0.f4738w
            if (r2 == 0) goto Le7
            h.o0 r4 = new h.o0
            r14 = 0
            r4.<init>(r0, r12, r14)
            h.p0 r14 = r0.F
            i.c1 r4 = r2.a(r14, r4)
        Le7:
            if (r4 == 0) goto Lf1
            java.lang.Object r2 = r4.getValue()
            u2.l r2 = (u2.l) r2
            long r8 = r2.f13353a
        Lf1:
            r14 = r27
            long r17 = u2.b.d(r14, r8)
            i.d1 r2 = r0.f4739x
            r8 = 0
            if (r2 == 0) goto L114
            h.c r4 = h.c.f4626n
            h.o0 r14 = new h.o0
            r15 = 1
            r14.<init>(r0, r12, r15)
            i.c1 r2 = r2.a(r4, r14)
            java.lang.Object r2 = r2.getValue()
            u2.j r2 = (u2.j) r2
            long r14 = r2.f13347a
            r20 = r14
            goto L116
        L114:
            r20 = r8
        L116:
            i.d1 r2 = r0.f4740y
            if (r2 == 0) goto L12f
            h.o0 r4 = new h.o0
            r14 = 2
            r4.<init>(r0, r12, r14)
            h.p0 r14 = r0.G
            i.c1 r2 = r2.a(r14, r4)
            java.lang.Object r2 = r2.getValue()
            u2.j r2 = (u2.j) r2
            long r14 = r2.f13347a
            goto L130
        L12f:
            r14 = r8
        L130:
            y0.c r2 = r0.E
            if (r2 == 0) goto L141
            u2.m r19 = u2.m.f13354g
            r22 = r14
            r15 = r12
            r12 = r22
            r14 = r2
            long r8 = r14.a(r15, r17, r19)
            goto L142
        L141:
            r12 = r14
        L142:
            long r12 = u2.j.d(r8, r12)
            long r7 = r17 >> r7
            int r2 = (int) r7
            long r4 = r17 & r5
            int r4 = (int) r4
            r16 = r10
            h.n0 r10 = new h.n0
            r14 = r20
            r10.<init>(r11, r12, r14, r16)
            v1.o0 r1 = r1.z(r2, r4, r3, r10)
            return r1
        L15a:
            r14 = r27
            v1.b1 r2 = r26.Q(r27)
            int r4 = r2.f13900g
            int r5 = r2.f13901h
            c1.n r6 = new c1.n
            r7 = 3
            r6.<init>(r2, r7)
            v1.o0 r1 = r1.z(r4, r5, r3, r6)
            return r1
    }

    public final y0.c m1() {
            r3 = this;
            i.k1 r0 = r3.f4737v
            i.e1 r0 = r0.f()
            h.f0 r1 = h.f0.f4659g
            h.f0 r2 = h.f0.f4660h
            boolean r0 = r0.a(r1, r2)
            if (r0 == 0) goto L15
            h.s0 r0 = r3.A
            h.h1 r0 = r0.f4753a
            goto L19
        L15:
            h.s0 r0 = r3.A
            h.h1 r0 = r0.f4753a
        L19:
            r0 = 0
            return r0
    }
}
