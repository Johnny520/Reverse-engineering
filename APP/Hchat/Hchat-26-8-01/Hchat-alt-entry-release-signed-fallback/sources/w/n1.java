package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.j1 f14575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i2.g f14576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0.p f14577c;

    public n1(i2.g r17) {
            r16 = this;
            r0 = r16
            r0.<init>()
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f14575a = r1
            r9.p r1 = new r9.p
            r2 = 27
            r1.<init>(r2)
            r17.getClass()
            i2.d r2 = new i2.d
            r3 = r17
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.ArrayList r4 = r2.f6261i
            int r5 = r4.size()
            r3.<init>(r5)
            int r5 = r4.size()
            r7 = 0
        L2d:
            if (r7 >= r5) goto L70
            java.lang.Object r8 = r4.get(r7)
            i2.c r8 = (i2.c) r8
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            i2.e r8 = r8.a(r9)
            java.lang.Object r8 = r1.invoke(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.size()
            r9.<init>(r10)
            int r10 = r8.size()
            r11 = 0
        L4f:
            if (r11 >= r10) goto L6a
            java.lang.Object r12 = r8.get(r11)
            i2.e r12 = (i2.e) r12
            i2.c r13 = new i2.c
            java.lang.Object r14 = r12.f6288a
            int r15 = r12.f6289b
            int r6 = r12.f6290c
            java.lang.String r12 = r12.f6291d
            r13.<init>(r12, r15, r6, r14)
            r9.add(r13)
            int r11 = r11 + 1
            goto L4f
        L6a:
            tf.r.h1(r3, r9)
            int r7 = r7 + 1
            goto L2d
        L70:
            r4.clear()
            r4.addAll(r3)
            i2.g r1 = r2.e()
            r0.f14576b = r1
            w0.p r1 = new w0.p
            r1.<init>()
            r0.f14577c = r1
            return
    }

    public static i2.e c(i2.e r2, i2.k0 r3) {
            i2.o r3 = r3.f6347b
            int r0 = r3.f6373f
            int r0 = r0 + (-1)
            r1 = 0
            int r3 = r3.c(r0, r1)
            int r0 = r2.f6289b
            r1 = 0
            if (r0 >= r3) goto L1d
            int r0 = r2.f6290c
            int r3 = java.lang.Math.min(r0, r3)
            r0 = 11
            i2.e r2 = i2.e.a(r2, r1, r3, r0)
            return r2
        L1d:
            return r1
    }

    public final void a(i0.h0 r27, int r28) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = 1154651354(0x44d294da, float:1684.6516)
            r1.b0(r3)
            boolean r3 = r1.h(r0)
            r5 = 2
            if (r3 == 0) goto L15
            r3 = 4
            goto L16
        L15:
            r3 = r5
        L16:
            r3 = r3 | r2
            r6 = r3 & 3
            if (r6 == r5) goto L1d
            r6 = 1
            goto L1e
        L1d:
            r6 = 0
        L1e:
            r9 = r3 & 1
            boolean r6 = r1.S(r9, r6)
            if (r6 == 0) goto L1d7
            i0.m2 r6 = y1.h1.f21957s
            java.lang.Object r6 = r1.j(r6)
            y1.p0 r6 = (y1.p0) r6
            i2.g r9 = r0.f14576b
            java.lang.String r10 = r9.f6314h
            int r10 = r10.length()
            java.util.List r9 = r9.a(r10)
            int r10 = r9.size()
            r11 = 0
        L3f:
            if (r11 >= r10) goto L1da
            java.lang.Object r12 = r9.get(r11)
            i2.e r12 = (i2.e) r12
            int r13 = r12.f6289b
            java.lang.Object r14 = r12.f6288a
            int r15 = r12.f6290c
            if (r13 == r15) goto L1c1
            r13 = 725478935(0x2b3dee17, float:6.7476705E-13)
            r1.a0(r13)
            java.lang.Object r13 = r1.P()
            i0.e r15 = i0.l.f5952a
            if (r13 != r15) goto L65
            n.k r13 = new n.k
            r13.<init>()
            r1.k0(r13)
        L65:
            n.k r13 = (n.k) r13
            r16 = 4
            m.b r4 = new m.b
            r17 = r5
            r5 = 25
            r4.<init>(r0, r5, r12)
            y0.l r5 = y0.l.f21818a
            y0.o r4 = f1.c0.m(r5, r4)
            java.lang.Object r5 = r1.P()
            if (r5 != r15) goto L88
            r9.p r5 = new r9.p
            r8 = 28
            r5.<init>(r8)
            r1.k0(r5)
        L88:
            fg.l r5 = (fg.l) r5
            y0.o r4 = f2.o.a(r4, r5)
            w.p1 r5 = new w.p1
            e9.a r8 = new e9.a
            r7 = 12
            r8.<init>(r0, r7, r12)
            r5.<init>(r8)
            y0.o r4 = r4.d(r5)
            r5 = 1
            y0.o r4 = k.n.n(r4, r13, r5)
            s1.p r5 = s1.q.f12286a
            r5.getClass()
            s1.a r5 = s1.s.f12289c
            y0.o r4 = s1.s.g(r4, r5)
            boolean r5 = r1.h(r0)
            boolean r7 = r1.f(r12)
            r5 = r5 | r7
            boolean r7 = r1.h(r6)
            r5 = r5 | r7
            java.lang.Object r7 = r1.P()
            if (r5 != 0) goto Lc4
            if (r7 != r15) goto Lcc
        Lc4:
            sh.v1 r7 = new sh.v1
            r7.<init>(r0, r12, r6)
            r1.k0(r7)
        Lcc:
            fg.a r7 = (fg.a) r7
            y0.o r4 = k.n.k(r4, r13, r7)
            r5 = 0
            p.o.a(r4, r1, r5)
            i2.m r14 = (i2.m) r14
            i2.l0 r4 = r14.a()
            if (r4 == 0) goto Lee
            i2.f0 r5 = r4.f6354a
            if (r5 != 0) goto Lf3
            i2.f0 r5 = r4.f6355b
            if (r5 != 0) goto Lf3
            i2.f0 r5 = r4.f6356c
            if (r5 != 0) goto Lf3
            i2.f0 r4 = r4.f6357d
            if (r4 != 0) goto Lf3
        Lee:
            r5 = 0
            r18 = 1
            goto L1b4
        Lf3:
            r4 = 726303039(0x2b4a813f, float:7.194418E-13)
            r1.a0(r4)
            java.lang.Object r4 = r1.P()
            if (r4 != r15) goto L107
            w.r0 r4 = new w.r0
            r4.<init>(r13)
            r1.k0(r4)
        L107:
            w.r0 r4 = (w.r0) r4
            java.lang.Object r5 = r1.P()
            r7 = 0
            if (r5 != r15) goto L11a
            ci.c r5 = new ci.c
            r8 = 12
            r5.<init>(r4, r7, r8)
            r1.k0(r5)
        L11a:
            fg.p r5 = (fg.p) r5
            sf.n r8 = sf.n.f12433a
            i0.r.f(r5, r1, r8)
            i0.g1 r5 = r4.f14636b
            i0.g1 r8 = r4.f14636b
            int r5 = r5.g()
            r5 = r5 & 2
            if (r5 == 0) goto L12f
            r5 = 1
            goto L130
        L12f:
            r5 = 0
        L130:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r5)
            int r5 = r8.g()
            r18 = 1
            r5 = r5 & 1
            if (r5 == 0) goto L141
            r5 = r18
            goto L142
        L141:
            r5 = 0
        L142:
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r5)
            int r5 = r8.g()
            r5 = r5 & 4
            if (r5 == 0) goto L151
            r5 = r18
            goto L152
        L151:
            r5 = 0
        L152:
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r5)
            i2.l0 r5 = r14.a()
            if (r5 == 0) goto L161
            i2.f0 r5 = r5.f6354a
            r22 = r5
            goto L163
        L161:
            r22 = r7
        L163:
            i2.l0 r5 = r14.a()
            if (r5 == 0) goto L16e
            i2.f0 r5 = r5.f6355b
            r23 = r5
            goto L170
        L16e:
            r23 = r7
        L170:
            i2.l0 r5 = r14.a()
            if (r5 == 0) goto L17b
            i2.f0 r5 = r5.f6356c
            r24 = r5
            goto L17d
        L17b:
            r24 = r7
        L17d:
            i2.l0 r5 = r14.a()
            if (r5 == 0) goto L185
            i2.f0 r7 = r5.f6357d
        L185:
            r25 = r7
            java.lang.Object[] r5 = new java.lang.Object[]{r19, r20, r21, r22, r23, r24, r25}
            boolean r7 = r1.h(r0)
            boolean r8 = r1.f(r12)
            r7 = r7 | r8
            java.lang.Object r8 = r1.P()
            if (r7 != 0) goto L19c
            if (r8 != r15) goto L1a6
        L19c:
            m.b r8 = new m.b
            r7 = 24
            r8.<init>(r0, r12, r4, r7)
            r1.k0(r8)
        L1a6:
            fg.l r8 = (fg.l) r8
            int r4 = r3 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r0.b(r5, r8, r1, r4)
            r5 = 0
            r1.p(r5)
            goto L1bd
        L1b4:
            r4 = 728331710(0x2b6975be, float:8.294163E-13)
            r1.a0(r4)
            r1.p(r5)
        L1bd:
            r1.p(r5)
            goto L1d1
        L1c1:
            r17 = r5
            r5 = 0
            r16 = 4
            r18 = 1
            r4 = 728345598(0x2b69abfe, float:8.3016916E-13)
            r1.a0(r4)
            r1.p(r5)
        L1d1:
            int r11 = r11 + 1
            r5 = r17
            goto L3f
        L1d7:
            r1.V()
        L1da:
            i0.r1 r1 = r1.t()
            if (r1 == 0) goto L1e9
            b0.t r3 = new b0.t
            r4 = 24
            r3.<init>(r2, r4, r0)
            r1.f6035d = r3
        L1e9:
            return
    }

    public final void b(java.lang.Object[] r8, fg.l r9, i0.h0 r10, int r11) {
            r7 = this;
            r0 = -2083052099(0xffffffff83d725bd, float:-1.2645229E-36)
            r10.b0(r0)
            r0 = r11 & 48
            r1 = 32
            if (r0 != 0) goto L18
            boolean r0 = r10.h(r9)
            if (r0 == 0) goto L14
            r0 = r1
            goto L16
        L14:
            r0 = 16
        L16:
            r0 = r0 | r11
            goto L19
        L18:
            r0 = r11
        L19:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L29
            boolean r2 = r10.h(r7)
            if (r2 == 0) goto L26
            r2 = 256(0x100, float:3.59E-43)
            goto L28
        L26:
            r2 = 128(0x80, float:1.8E-43)
        L28:
            r0 = r0 | r2
        L29:
            int r2 = r8.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r4 = -358306546(0xffffffffeaa4ad0e, float:-9.954053E25)
            r5 = 0
            r10.W(r4, r2, r3, r5)
            int r2 = r8.length
            boolean r2 = r10.d(r2)
            r3 = 4
            if (r2 == 0) goto L40
            r2 = r3
            goto L41
        L40:
            r2 = r5
        L41:
            r0 = r0 | r2
            int r2 = r8.length
            r4 = r5
        L44:
            if (r4 >= r2) goto L55
            r6 = r8[r4]
            boolean r6 = r10.h(r6)
            if (r6 == 0) goto L50
            r6 = r3
            goto L51
        L50:
            r6 = r5
        L51:
            r0 = r0 | r6
            int r4 = r4 + 1
            goto L44
        L55:
            r10.p(r5)
            r2 = r0 & 14
            if (r2 != 0) goto L5e
            r0 = r0 | 2
        L5e:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r4 = 1
            if (r2 == r3) goto L67
            r2 = r4
            goto L68
        L67:
            r2 = r5
        L68:
            r3 = r0 & 1
            boolean r2 = r10.S(r3, r2)
            if (r2 == 0) goto Lb6
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 2
            r2.<init>(r3)
            r2.add(r9)
            int r3 = r8.length
            if (r3 <= 0) goto L88
            int r3 = r2.size()
            int r6 = r8.length
            int r3 = r3 + r6
            r2.ensureCapacity(r3)
            java.util.Collections.addAll(r2, r8)
        L88:
            int r3 = r2.size()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            boolean r3 = r10.h(r7)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L9b
            r5 = r4
        L9b:
            r0 = r3 | r5
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto La7
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto Lb0
        La7:
            w.k r1 = new w.k
            r0 = 1
            r1.<init>(r7, r9, r0)
            r10.k0(r1)
        Lb0:
            fg.l r1 = (fg.l) r1
            i0.r.e(r2, r1, r10)
            goto Lb9
        Lb6:
            r10.V()
        Lb9:
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto Lcc
            b0.r r0 = new b0.r
            r5 = 10
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.f6035d = r0
        Lcc:
            return
    }
}
