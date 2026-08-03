package l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l.d f7652a = null;

    static {
            i0.u r0 = y2.m.f22242a
            l.d r1 = new l.d
            long r2 = f1.w.f3127c
            long r4 = f1.w.f3126b
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            long r8 = f1.w.b(r4, r0)
            long r10 = f1.w.b(r4, r0)
            r6 = r4
            r1.<init>(r2, r4, r6, r8, r10)
            l.i.f7652a = r1
            return
    }

    public static final void a(l.d r17, y0.o r18, s0.d r19, i0.h0 r20, int r21) {
            r1 = r17
            r2 = r18
            r3 = r19
            r0 = r20
            r4 = r21
            r5 = -527864079(0xffffffffe0896ef1, float:-7.922494E19)
            r0.b0(r5)
            r5 = r4 & 6
            if (r5 != 0) goto L1f
            boolean r5 = r0.f(r1)
            if (r5 == 0) goto L1c
            r5 = 4
            goto L1d
        L1c:
            r5 = 2
        L1d:
            r5 = r5 | r4
            goto L20
        L1f:
            r5 = r4
        L20:
            r6 = r4 & 48
            if (r6 != 0) goto L30
            boolean r6 = r0.f(r2)
            if (r6 == 0) goto L2d
            r6 = 32
            goto L2f
        L2d:
            r6 = 16
        L2f:
            r5 = r5 | r6
        L30:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L40
            boolean r6 = r0.h(r3)
            if (r6 == 0) goto L3d
            r6 = 256(0x100, float:3.59E-43)
            goto L3f
        L3d:
            r6 = 128(0x80, float:1.8E-43)
        L3f:
            r5 = r5 | r6
        L40:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            r8 = 0
            r9 = 1
            if (r6 == r7) goto L4a
            r6 = r9
            goto L4b
        L4a:
            r6 = r8
        L4b:
            r7 = r5 & 1
            boolean r6 = r0.S(r7, r6)
            if (r6 == 0) goto Lf8
            float r6 = l.f.f7628d
            float r7 = l.f.f7629e
            v.d r11 = v.e.a(r7)
            float r7 = (float) r8
            int r10 = u2.f.a(r6, r7)
            if (r10 <= 0) goto L64
            r12 = r9
            goto L65
        L64:
            r12 = r8
        L65:
            long r13 = f1.e0.f3045a
            int r6 = u2.f.a(r6, r7)
            if (r6 > 0) goto L72
            if (r12 == 0) goto L70
            goto L72
        L70:
            r6 = r2
            goto L7c
        L72:
            c1.p r10 = new c1.p
            r15 = r13
            r10.<init>(r11, r12, r13, r15)
            y0.o r6 = r2.d(r10)
        L7c:
            long r10 = r1.f7619a
            f1.m0 r7 = f1.c0.f3038b
            y0.o r6 = k.n.g(r6, r10, r7)
            p.n0 r7 = p.n0.f9956h
            y0.o r6 = p.d.s(r6, r7)
            r7 = 0
            float r10 = l.f.f7633i
            y0.o r6 = p.d.n(r6, r7, r10, r9)
            k.w1 r7 = k.n.q(r0)
            y0.o r6 = k.n.r(r6, r7, r9, r9)
            int r5 = r5 << 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            p.e r7 = p.j.f9926c
            y0.e r10 = y0.b.f21804s
            p.t r7 = p.s.a(r7, r10, r0, r8)
            long r10 = r0.T
            int r8 = java.lang.Long.hashCode(r10)
            s0.h r10 = r0.l()
            y0.o r6 = y0.a.c(r0, r6)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r0.d0()
            boolean r12 = r0.S
            if (r12 == 0) goto Lc5
            r0.k(r11)
            goto Lc8
        Lc5:
            r0.n0()
        Lc8:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r0, r7)
            x1.e r7 = x1.f.f20885d
            i0.r.A(r7, r0, r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r0, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r0)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r0, r6)
            int r5 = r5 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            p.u r6 = p.u.f10014a
            r3.b(r6, r0, r5)
            r0.p(r9)
            goto Lfb
        Lf8:
            r0.V()
        Lfb:
            i0.r1 r6 = r0.t()
            if (r6 == 0) goto L109
            b0.r r0 = new b0.r
            r5 = 5
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L109:
            return
    }

    public static final void b(y0.o r8, l.d r9, fg.l r10, i0.h0 r11, int r12, int r13) {
            r0 = -625529233(0xffffffffdab72e6f, float:-2.5780488E16)
            r11.b0(r0)
            r0 = r13 & 1
            if (r0 == 0) goto Ld
            r1 = r12 | 6
            goto L17
        Ld:
            boolean r1 = r11.f(r8)
            if (r1 == 0) goto L15
            r1 = 4
            goto L16
        L15:
            r1 = 2
        L16:
            r1 = r1 | r12
        L17:
            r2 = r13 & 2
            if (r2 == 0) goto L1e
            r1 = r1 | 48
            goto L2a
        L1e:
            boolean r3 = r11.f(r9)
            if (r3 == 0) goto L27
            r3 = 32
            goto L29
        L27:
            r3 = 16
        L29:
            r1 = r1 | r3
        L2a:
            boolean r3 = r11.h(r10)
            if (r3 == 0) goto L33
            r3 = 256(0x100, float:3.59E-43)
            goto L35
        L33:
            r3 = 128(0x80, float:1.8E-43)
        L35:
            r1 = r1 | r3
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 == r4) goto L3e
            r3 = 1
            goto L3f
        L3e:
            r3 = 0
        L3f:
            r4 = r1 & 1
            boolean r3 = r11.S(r4, r3)
            if (r3 == 0) goto L6d
            if (r0 == 0) goto L4b
            y0.l r8 = y0.l.f21818a
        L4b:
            if (r2 == 0) goto L4f
            l.d r9 = l.i.f7652a
        L4f:
            db.f r0 = new db.f
            r2 = 1
            r0.<init>(r10, r2, r9)
            r2 = -250345048(0xfffffffff11409a8, float:-7.330473E29)
            s0.d r0 = s0.i.e(r2, r0, r11)
            int r2 = r1 >> 3
            r2 = r2 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            int r1 = r1 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            a(r9, r8, r0, r11, r1)
        L6a:
            r3 = r8
            r4 = r9
            goto L71
        L6d:
            r11.V()
            goto L6a
        L71:
            i0.r1 r8 = r11.t()
            if (r8 == 0) goto L81
            b0.r r2 = new b0.r
            r5 = r10
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f6035d = r2
        L81:
            return
    }

    public static final void c(java.lang.String r32, boolean r33, l.d r34, y0.o r35, fg.q r36, fg.a r37, i0.h0 r38, int r39) {
            r1 = r33
            r6 = r34
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r0 = -2001167027(0xffffffff88b89d4d, float:-1.1111078E-33)
            r9.b0(r0)
            r0 = r10 & 6
            r2 = r32
            if (r0 != 0) goto L23
            boolean r0 = r9.f(r2)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = 2
        L21:
            r0 = r0 | r10
            goto L24
        L23:
            r0 = r10
        L24:
            r3 = r10 & 48
            r4 = 32
            if (r3 != 0) goto L35
            boolean r3 = r9.g(r1)
            if (r3 == 0) goto L32
            r3 = r4
            goto L34
        L32:
            r3 = 16
        L34:
            r0 = r0 | r3
        L35:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L45
            boolean r3 = r9.f(r6)
            if (r3 == 0) goto L42
            r3 = 256(0x100, float:3.59E-43)
            goto L44
        L42:
            r3 = 128(0x80, float:1.8E-43)
        L44:
            r0 = r0 | r3
        L45:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L58
            r3 = r35
            boolean r5 = r9.f(r3)
            if (r5 == 0) goto L54
            r5 = 2048(0x800, float:2.87E-42)
            goto L56
        L54:
            r5 = 1024(0x400, float:1.435E-42)
        L56:
            r0 = r0 | r5
            goto L5a
        L58:
            r3 = r35
        L5a:
            r5 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L6a
            boolean r5 = r9.h(r7)
            if (r5 == 0) goto L67
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L69
        L67:
            r5 = 8192(0x2000, float:1.148E-41)
        L69:
            r0 = r0 | r5
        L6a:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r10
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r5 != 0) goto L7c
            boolean r5 = r9.h(r8)
            if (r5 == 0) goto L79
            r5 = r12
            goto L7b
        L79:
            r5 = 65536(0x10000, float:9.1835E-41)
        L7b:
            r0 = r0 | r5
        L7c:
            r13 = r0
            r0 = 74899(0x12493, float:1.04956E-40)
            r0 = r0 & r13
            r5 = 74898(0x12492, float:1.04954E-40)
            r14 = 0
            if (r0 == r5) goto L89
            r0 = 1
            goto L8a
        L89:
            r0 = r14
        L8a:
            r5 = r13 & 1
            boolean r0 = r9.S(r5, r0)
            if (r0 == 0) goto L1eb
            y0.f r0 = l.f.f7630f
            p.c r5 = p.j.f9924a
            float r5 = l.f.f7632h
            p.h r15 = p.j.g(r5)
            r11 = r13 & 112(0x70, float:1.57E-43)
            if (r11 != r4) goto La2
            r4 = 1
            goto La3
        La2:
            r4 = r14
        La3:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            if (r11 != r12) goto Laa
            r11 = 1
            goto Lab
        Laa:
            r11 = r14
        Lab:
            r4 = r4 | r11
            java.lang.Object r11 = r9.P()
            if (r4 != 0) goto Lb6
            i0.e r4 = i0.l.f5952a
            if (r11 != r4) goto Lbe
        Lb6:
            l.g r11 = new l.g
            r11.<init>(r1, r8, r14)
            r9.k0(r11)
        Lbe:
            r4 = r11
            fg.a r4 = (fg.a) r4
            r11 = r5
            r5 = 12
            r3 = 0
            r12 = r11
            r11 = r0
            r0 = r35
            y0.o r3 = k.n.j(r0, r1, r2, r3, r4, r5)
            r0 = 1065353216(0x3f800000, float:1.0)
            y0.o r1 = p.h1.d(r3, r0)
            float r2 = l.f.f7625a
            float r3 = l.f.f7626b
            float r4 = l.f.f7627c
            y0.o r1 = p.h1.l(r1, r2, r4, r3, r4)
            r2 = 0
            r3 = 2
            y0.o r1 = p.d.n(r1, r12, r2, r3)
            r2 = 54
            p.e1 r2 = p.d1.a(r15, r11, r9, r2)
            long r3 = r9.T
            int r3 = java.lang.Long.hashCode(r3)
            s0.h r4 = r9.l()
            y0.o r1 = y0.a.c(r9, r1)
            x1.f r5 = x1.g.f20914f
            r5.getClass()
            x1.y r5 = x1.f.f20883b
            r9.d0()
            boolean r11 = r9.S
            if (r11 == 0) goto L109
            r9.k(r5)
            goto L10c
        L109:
            r9.n0()
        L10c:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r9, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r9, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            x1.e r4 = x1.f.f20887f
            i0.r.A(r4, r9, r3)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r9)
            x1.e r12 = x1.f.f20884c
            i0.r.A(r12, r9, r1)
            if (r7 != 0) goto L135
            r1 = -1597947094(0xffffffffa0c1432a, float:-3.2739917E-19)
            r9.a0(r1)
            r9.p(r14)
            goto L19c
        L135:
            r1 = -1597947093(0xffffffffa0c1432b, float:-3.273992E-19)
            r9.a0(r1)
            float r18 = l.f.f7634j
            r19 = 0
            r22 = 2
            y0.l r17 = y0.l.f21818a
            r20 = r18
            r21 = r18
            y0.o r1 = p.h1.i(r17, r18, r19, r20, r21, r22)
            y0.g r15 = y0.b.f21792g
            v1.n0 r15 = p.o.d(r15, r14)
            r17 = r14
            r18 = r15
            long r14 = r9.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r9.l()
            y0.o r1 = y0.a.c(r9, r1)
            r9.d0()
            boolean r0 = r9.S
            if (r0 == 0) goto L170
            r9.k(r5)
        L16d:
            r0 = r18
            goto L174
        L170:
            r9.n0()
            goto L16d
        L174:
            i0.r.A(r11, r9, r0)
            i0.r.A(r2, r9, r15)
            j8.b.p(r14, r9, r4, r9, r3)
            i0.r.A(r12, r9, r1)
            if (r33 == 0) goto L185
            long r0 = r6.f7621c
            goto L187
        L185:
            long r0 = r6.f7623e
        L187:
            f1.w r2 = new f1.w
            r2.<init>(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r7.b(r2, r9, r0)
            r0 = 1
            r9.p(r0)
            r0 = r17
            r9.p(r0)
        L19c:
            if (r33 == 0) goto L1a3
            long r0 = r6.f7620b
        L1a0:
            r21 = r0
            goto L1a6
        L1a3:
            long r0 = r6.f7622d
            goto L1a0
        L1a6:
            int r28 = l.f.f7631g
            long r23 = l.f.f7637m
            m2.k r25 = l.f.f7638n
            long r29 = l.f.f7639o
            long r26 = l.f.f7640p
            i2.n0 r11 = new i2.n0
            r31 = 16613240(0xfd7f78, float:2.3280108E-38)
            r20 = r11
            r20.<init>(r21, r23, r25, r26, r28, r29, r31)
            r0 = 1065353216(0x3f800000, float:1.0)
            double r1 = (double) r0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1c4
            goto L1c9
        L1c4:
            java.lang.String r1 = "invalid weight; must be greater than zero"
            q.a.a(r1)
        L1c9:
            p.q0 r10 = new p.q0
            r1 = 1
            r10.<init>(r0, r1)
            r0 = r13 & 14
            r2 = 1572864(0x180000, float:2.204052E-39)
            r18 = r0 | r2
            r19 = 952(0x3b8, float:1.334E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 0
            r0 = r1
            r17 = r9
            r9 = r32
            w.s.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9 = r17
            r9.p(r0)
            goto L1ee
        L1eb:
            r9.V()
        L1ee:
            i0.r1 r9 = r9.t()
            if (r9 == 0) goto L206
            l.h r0 = new l.h
            r1 = r32
            r2 = r33
            r4 = r35
            r3 = r6
            r5 = r7
            r6 = r8
            r7 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f6035d = r0
        L206:
            return
    }
}
