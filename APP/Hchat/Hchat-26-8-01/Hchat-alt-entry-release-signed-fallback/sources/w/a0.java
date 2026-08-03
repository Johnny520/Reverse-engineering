package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w.q0 f14396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.l f14397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2.s f14398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b5.k f14399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u2.c f14400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14401f;

    public a0(w.q0 r1, fg.l r2, n2.s r3, b5.k r4, u2.c r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f14396a = r1
            r0.f14397b = r2
            r0.f14398c = r3
            r0.f14399d = r4
            r0.f14400e = r5
            r0.f14401f = r6
            return
    }

    @Override // v1.n0
    public final int a(v1.o r1, java.util.List r2, int r3) {
            r0 = this;
            w.q0 r2 = r0.f14396a
            w.x0 r3 = r2.f14600a
            u2.m r1 = r1.getLayoutDirection()
            r3.a(r1)
            w.x0 r1 = r2.f14600a
            be.k r1 = r1.f14719j
            if (r1 == 0) goto L1a
            float r1 = r1.c()
            int r1 = w.s.n(r1)
            return r1
        L1a:
            java.lang.String r1 = "layoutIntrinsics must be called first"
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r30, java.util.List r31, long r32) {
            r29 = this;
            r1 = r29
            w.q0 r0 = r1.f14396a
            w0.f r2 = w0.q.e()
            if (r2 == 0) goto Lf
            fg.l r3 = r2.e()
            goto L10
        Lf:
            r3 = 0
        L10:
            w0.f r4 = w0.q.h(r2)
            w.m1 r15 = r0.d()     // Catch: java.lang.Throwable -> L24a
            w0.q.k(r2, r4, r3)
            if (r15 == 0) goto L20
            i2.k0 r2 = r15.f14569a
            goto L21
        L20:
            r2 = 0
        L21:
            w.x0 r3 = r0.f14600a
            u2.m r10 = r30.getLayoutDirection()
            int r4 = r3.f14715f
            boolean r5 = r3.f14714e
            int r6 = r3.f14712c
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r18 = 32
            if (r2 == 0) goto Lfc
            i2.o r11 = r2.f6347b
            i2.j0 r12 = r2.f6346a
            i2.g r13 = r3.f14710a
            i2.n0 r7 = r3.f14711b
            java.util.List r8 = r3.f14718i
            u2.c r14 = r3.f14716g
            m2.d r9 = r3.f14717h
            r21 = r2
            be.k r2 = r11.f6368a
            boolean r2 = r2.a()
            if (r2 == 0) goto L54
            r12 = r32
            r22 = r0
            goto Lf9
        L54:
            i2.g r2 = r12.f6334a
            r22 = r0
            long r0 = r12.f6343j
            boolean r2 = gg.l.a(r2, r13)
            if (r2 == 0) goto Lf7
            i2.n0 r2 = r12.f6335b
            boolean r2 = r2.b(r7)
            if (r2 == 0) goto Lf7
            java.util.List r2 = r12.f6336c
            boolean r2 = gg.l.a(r2, r8)
            if (r2 == 0) goto Lf7
            int r2 = r12.f6337d
            if (r2 != r6) goto Lf7
            boolean r2 = r12.f6338e
            if (r2 != r5) goto Lf7
            int r2 = r12.f6339f
            if (r2 != r4) goto Lf7
            u2.c r2 = r12.f6340g
            boolean r2 = gg.l.a(r2, r14)
            if (r2 == 0) goto Lf7
            u2.m r2 = r12.f6341h
            if (r2 != r10) goto Lf7
            m2.d r2 = r12.f6342i
            boolean r2 = gg.l.a(r2, r9)
            if (r2 != 0) goto L91
            goto Lf7
        L91:
            int r2 = u2.a.j(r32)
            int r7 = u2.a.j(r0)
            if (r2 == r7) goto L9c
            goto Lf7
        L9c:
            if (r5 != 0) goto La1
            r2 = 2
            if (r4 != r2) goto Lb5
        La1:
            int r2 = u2.a.h(r32)
            int r7 = u2.a.h(r0)
            if (r2 != r7) goto Lf7
            int r2 = u2.a.g(r32)
            int r0 = u2.a.g(r0)
            if (r2 != r0) goto Lf7
        Lb5:
            i2.j0 r2 = new i2.j0
            i2.g r0 = r12.f6334a
            i2.n0 r4 = r3.f14711b
            java.util.List r5 = r12.f6336c
            int r6 = r12.f6337d
            boolean r7 = r12.f6338e
            int r8 = r12.f6339f
            u2.c r9 = r12.f6340g
            u2.m r10 = r12.f6341h
            m2.d r1 = r12.f6342i
            r3 = r11
            r11 = r1
            r1 = r3
            r12 = r32
            r3 = r0
            r14 = r21
            r0 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            float r3 = r1.f6371d
            int r3 = w.s.n(r3)
            float r4 = r1.f6372e
            int r4 = w.s.n(r4)
            long r5 = (long) r3
            long r5 = r5 << r18
            long r3 = (long) r4
            long r3 = r3 & r16
            long r3 = r3 | r5
            long r3 = u2.b.d(r12, r3)
            i2.k0 r5 = new i2.k0
            r5.<init>(r2, r1, r3)
            r23 = r14
            r31 = r15
            goto L198
        Lf7:
            r12 = r32
        Lf9:
            r14 = r21
            goto L101
        Lfc:
            r12 = r32
            r22 = r0
            r14 = r2
        L101:
            r0 = 0
            r3.a(r10)
            int r1 = u2.a.j(r12)
            if (r5 != 0) goto L10e
            r2 = 2
            if (r4 != r2) goto L119
        L10e:
            boolean r2 = u2.a.d(r12)
            if (r2 == 0) goto L119
            int r2 = u2.a.h(r12)
            goto L11c
        L119:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L11c:
            if (r5 != 0) goto L124
            r5 = 2
            if (r4 != r5) goto L124
            r27 = 1
            goto L126
        L124:
            r27 = r6
        L126:
            java.lang.String r4 = "layoutIntrinsics must be called first"
            if (r1 != r2) goto L12b
            goto L13b
        L12b:
            be.k r5 = r3.f14719j
            if (r5 == 0) goto L243
            float r5 = r5.c()
            int r5 = w.s.n(r5)
            int r2 = r9.e0.r(r5, r1, r2)
        L13b:
            i2.o r23 = new i2.o
            be.k r1 = r3.f14719j
            if (r1 == 0) goto L23c
            int r4 = u2.a.g(r12)
            long r25 = f8.i.u(r0, r2, r0, r4)
            int r2 = r3.f14715f
            r24 = r1
            r28 = r2
            r23.<init>(r24, r25, r27, r28)
            r1 = r23
            float r2 = r1.f6371d
            int r2 = w.s.n(r2)
            float r4 = r1.f6372e
            int r4 = w.s.n(r4)
            long r5 = (long) r2
            long r5 = r5 << r18
            long r7 = (long) r4
            long r7 = r7 & r16
            long r4 = r5 | r7
            long r4 = u2.b.d(r12, r4)
            i2.k0 r2 = new i2.k0
            r6 = r2
            i2.j0 r2 = new i2.j0
            i2.g r7 = r3.f14710a
            r8 = r4
            i2.n0 r4 = r3.f14711b
            java.util.List r5 = r3.f14718i
            r11 = r6
            int r6 = r3.f14712c
            r19 = r7
            boolean r7 = r3.f14714e
            r20 = r8
            int r8 = r3.f14715f
            u2.c r9 = r3.f14716g
            m2.d r3 = r3.f14717h
            r0 = r11
            r23 = r14
            r31 = r15
            r14 = r20
            r11 = r3
            r3 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.<init>(r2, r1, r14)
            r5 = r0
        L198:
            long r0 = r5.f6348c
            long r2 = r0 >> r18
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r0 = r0 & r16
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r2.intValue()
            int r0 = r0.intValue()
            r14 = r23
            boolean r2 = gg.l.a(r14, r5)
            if (r2 != 0) goto L1de
            w.m1 r2 = new w.m1
            if (r31 == 0) goto L1c1
            r3 = r31
            v1.t r14 = r3.f14571c
            goto L1c2
        L1c1:
            r14 = 0
        L1c2:
            r2.<init>(r5, r14)
            r3 = r22
            i0.j1 r4 = r3.f14608i
            r4.setValue(r2)
            r2 = 0
            r3.f14615p = r2
            r6 = r29
            fg.l r4 = r6.f14397b
            r4.invoke(r5)
            n2.s r4 = r6.f14398c
            b5.k r7 = r6.f14399d
            w.s.w(r3, r4, r7)
            goto L1e3
        L1de:
            r6 = r29
            r3 = r22
            r2 = 0
        L1e3:
            int r4 = r6.f14401f
            r7 = 1
            if (r4 != r7) goto L1f3
            i2.o r4 = r5.f6347b
            float r2 = r4.b(r2)
            int r8 = w.s.n(r2)
            goto L1f4
        L1f3:
            r8 = r2
        L1f4:
            u2.c r2 = r6.f14400e
            float r2 = r2.i0(r8)
            i0.j1 r3 = r3.f14606g
            u2.f r4 = new u2.f
            r4.<init>(r2)
            r3.setValue(r4)
            v1.j r2 = v1.c.f13905a
            float r3 = r5.f6349d
            int r3 = java.lang.Math.round(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            sf.e r4 = new sf.e
            r4.<init>(r2, r3)
            v1.j r2 = v1.c.f13906b
            float r3 = r5.f6350e
            int r3 = java.lang.Math.round(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            sf.e r5 = new sf.e
            r5.<init>(r2, r3)
            sf.e[] r2 = new sf.e[]{r4, r5}
            java.util.Map r2 = tf.y.b0(r2)
            i2.z r3 = new i2.z
            r4 = 14
            r3.<init>(r4)
            r4 = r30
            v1.o0 r0 = r4.z(r1, r0, r2, r3)
            return r0
        L23c:
            r6 = r29
            j8.o.A(r4)
            r0 = 0
            return r0
        L243:
            r6 = r29
            j8.o.A(r4)
            r0 = 0
            return r0
        L24a:
            r0 = move-exception
            r6 = r1
            w0.q.k(r2, r4, r3)
            throw r0
    }
}
