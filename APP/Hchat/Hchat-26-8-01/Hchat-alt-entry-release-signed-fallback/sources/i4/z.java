package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4.m f6500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.e f6501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i4.a0 f6504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i4.c0 f6505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b5.c[] f6506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f6507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f6508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i4.l[] f6509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f1.h[] f6511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i4.x f6513n;

    public z(i4.m r18, h4.u r19, n4.a r20) {
            r17 = this;
            r1 = r17
            r0 = r18
            r1.<init>()
            h4.c r2 = r0.f6469c
            r1.f6500a = r0
            i4.a r3 = new i4.a
            r3.<init>()
            r3.f6408h = r0
            h4.c r4 = r0.f6469c
            i4.l r4 = r4.f5076d
            java.lang.Object r4 = r4.f6465g
            g8.b r4 = (g8.b) r4
            int r4 = r4.f4344c
            int r4 = r4 + 1
            int[] r5 = x6.d.L(r4)
            r3.f6409i = r5
            int[] r5 = x6.d.L(r4)
            r3.f6410j = r5
            int[] r5 = x6.d.L(r4)
            r3.f6411k = r5
            z4.g[] r5 = new z4.g[r4]
            r3.f6412l = r5
            i4.g[] r4 = new i4.g[r4]
            r3.f6413m = r4
            r4 = -1
            r3.f6407g = r4
            java.lang.Object r4 = r3.f6410j
            int[] r4 = (int[]) r4
            i4.l r5 = r2.f5076d
            i4.g r6 = r2.f5077e
            java.lang.Object[] r7 = r6.f22543h
            int r7 = r7.length
            java.lang.Object r8 = r3.f6409i
            int[] r8 = (int[]) r8
            r9 = 0
            x6.d.g0(r8, r9)
            java.lang.Object r10 = r3.f6411k
            int[] r10 = (int[]) r10
            x6.d.g0(r10, r9)
        L55:
            int r11 = r8.length
            r12 = r9
        L57:
            if (r12 >= r11) goto L9f
            r13 = r8[r12]
            if (r13 == 0) goto L9c
            r5.getClass()     // Catch: java.lang.IllegalArgumentException -> L93
        L60:
            int r11 = x6.d.x(r8, r9)     // Catch: java.lang.IllegalArgumentException -> L93
            if (r11 >= 0) goto L8a
            r11 = r9
        L67:
            if (r11 >= r7) goto L55
            java.lang.Object r12 = r6.l(r11)
            i4.f r12 = (i4.f) r12
            int r13 = r12.f6454a
            int r14 = r12.f6455b
            int r15 = x6.d.x(r4, r13)
            if (r15 < 0) goto L87
            if (r15 >= r14) goto L87
            x6.d.g0(r10, r13)
            x6.d.g0(r10, r14)
            int r12 = r12.f6456c
            r13 = 1
            r3.e(r12, r13)
        L87:
            int r11 = r11 + 1
            goto L67
        L8a:
            x6.d.q(r8, r11)     // Catch: java.lang.IllegalArgumentException -> L93
            r5.a(r11, r3)     // Catch: java.lang.IllegalArgumentException -> L93
            r3.f6407g = r11     // Catch: java.lang.IllegalArgumentException -> L93
            goto L60
        L93:
            r0 = move-exception
            i4.b0 r2 = new i4.b0
            java.lang.String r3 = "flow of control falls off end of method"
            r2.<init>(r3, r0)
            throw r2
        L9c:
            int r12 = r12 + 1
            goto L57
        L9f:
            java.lang.Object r5 = r3.f6408h
            i4.m r5 = (i4.m) r5
            h4.c r5 = r5.f6469c
            i4.l r5 = r5.f5076d
            java.lang.Object r5 = r5.f6465g
            g8.b r5 = (g8.b) r5
            int r5 = r5.f4344c
            i4.d[] r5 = new i4.d[r5]
            r6 = r9
            r12 = r6
        Lb1:
            int r7 = r12 + 1
            int r14 = x6.d.x(r10, r7)
            if (r14 >= 0) goto L13b
            i4.e r3 = new i4.e
            r3.<init>(r6)
            r4 = r9
        Lbf:
            if (r4 >= r6) goto Lc9
            r7 = r5[r4]
            r3.q(r4, r7)
            int r4 = r4 + 1
            goto Lbf
        Lc9:
            r1.f6501b = r3
            int r4 = r3.o()
            r1.f6503d = r4
            int r5 = r2.f5075c
            r1.f6502c = r5
            i4.a0 r6 = new i4.a0
            r7 = r19
            r6.<init>(r1, r0, r7)
            r1.f6504e = r6
            i4.c0 r7 = new i4.c0
            r8 = r20
            r7.<init>(r6, r0, r8)
            r1.f6505f = r7
            b5.c[] r0 = new b5.c[r4]
            r1.f6506g = r0
            f1.h[] r6 = new f1.h[r4]
            r1.f6511l = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object[] r7 = r3.f22543h
            int r7 = r7.length
            int r7 = r7 * 2
            int r7 = r7 + 10
            r6.<init>(r7)
            r1.f6507h = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            java.lang.Object[] r3 = r3.f22543h
            int r3 = r3.length
            int r3 = r3 * 2
            int r3 = r3 + 10
            r6.<init>(r3)
            r1.f6508i = r6
            i4.l[] r3 = new i4.l[r4]
            r1.f6509j = r3
            r1.f6510k = r9
            b5.c r3 = new b5.c
            int r2 = r2.f5074b
            i4.u r6 = new i4.u
            r6.<init>(r5)
            i4.n r5 = new i4.n
            r7 = 0
            r5.<init>(r2, r7)
            z4.g r2 = z4.g.f22550k
            r3.<init>(r6, r5, r2)
            r0[r9] = r3
            i4.x r0 = new i4.x
            r0.<init>(r4)
            i4.m r2 = r1.f6500a
            h4.c r2 = r2.f6469c
            i4.g r2 = r2.f5077e
            java.lang.Object[] r2 = r2.f22543h
            int r2 = r2.length
            int r4 = r4 + r2
            r0.f6492h = r4
            r1.f6513n = r0
            return
        L13b:
            r7 = r19
            r8 = r20
            boolean r11 = x6.d.z(r4, r12)
            if (r11 == 0) goto L178
            int r11 = r14 + (-1)
            r13 = 0
        L148:
            if (r11 < r12) goto L156
            java.lang.Object r13 = r3.f6412l
            z4.g[] r13 = (z4.g[]) r13
            r13 = r13[r11]
            if (r13 == 0) goto L153
            goto L157
        L153:
            int r11 = r11 + (-1)
            goto L148
        L156:
            r11 = -1
        L157:
            if (r13 != 0) goto L163
            z4.g r13 = z4.g.o(r14)
            i4.g r11 = i4.g.f6458i
        L15f:
            r16 = r11
            r15 = r13
            goto L16e
        L163:
            java.lang.Object r15 = r3.f6413m
            i4.g[] r15 = (i4.g[]) r15
            r11 = r15[r11]
            if (r11 != 0) goto L15f
            i4.g r11 = i4.g.f6458i
            goto L15f
        L16e:
            i4.d r11 = new i4.d
            r13 = r12
            r11.<init>(r12, r13, r14, r15, r16)
            r5[r6] = r11
            int r6 = r6 + 1
        L178:
            r12 = r14
            goto Lb1
    }

    public static f1.h b(i4.m r6, h4.u r7, n4.a r8) {
            i4.z r0 = new i4.z     // Catch: i4.b0 -> L32
            r0.<init>(r6, r7, r8)     // Catch: i4.b0 -> L32
            r0.c()     // Catch: i4.b0 -> L32
            java.util.ArrayList r7 = r0.f6507h     // Catch: i4.b0 -> L32
            int r8 = r7.size()     // Catch: i4.b0 -> L32
            u4.c r1 = new u4.c     // Catch: i4.b0 -> L32
            r1.<init>(r8)     // Catch: i4.b0 -> L32
            r2 = 0
            r3 = r2
        L15:
            r4 = -1
            if (r3 >= r8) goto L26
            java.lang.Object r5 = r7.get(r3)     // Catch: i4.b0 -> L32
            u4.b r5 = (u4.b) r5     // Catch: i4.b0 -> L32
            r1.q(r3, r5)     // Catch: i4.b0 -> L32
            r1.f13369j = r4     // Catch: i4.b0 -> L32
            int r3 = r3 + 1
            goto L15
        L26:
            r1.f22555g = r2     // Catch: i4.b0 -> L32
            f1.h r7 = new f1.h     // Catch: i4.b0 -> L32
            int r8 = r0.f(r4)     // Catch: i4.b0 -> L32
            r7.<init>(r1, r8)     // Catch: i4.b0 -> L32
            return r7
        L32:
            r7 = move-exception
            l4.b r6 = r6.f6467a
            v4.z r6 = r6.d()
            java.lang.String r6 = r6.a()
            java.lang.String r8 = "...while working on method "
            java.lang.String r6 = r8.concat(r6)
            r7.a(r6)
            throw r7
    }

    public final void a(u4.b r2, z4.g r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.f6507h
            r0.add(r2)
            r3.k()
            java.util.ArrayList r2 = r1.f6508i
            r2.add(r3)
            return
    }

    public final void c() {
            r20 = this;
            r1 = r20
            int r0 = r1.f6503d
            int[] r2 = x6.d.L(r0)
            r3 = 0
            x6.d.g0(r2, r3)
            i4.m r4 = r1.f6500a
            i4.r r5 = r4.f6471e
            u4.t r8 = r4.f(r3)
            l4.b r12 = r4.f6467a
            w4.a r6 = r12.a()
            w4.b r13 = r6.f14845i
            java.lang.Object[] r6 = r13.f22543h
            int r14 = r6.length
            h4.u r15 = new h4.u
            int r6 = r14 + 1
            r15.<init>(r6)
            r6 = r3
            r7 = r6
        L28:
            r9 = 0
            if (r6 >= r14) goto L71
            java.lang.Object r10 = r13.l(r6)
            w4.c r10 = (w4.c) r10
            i4.q r11 = r5.o(r3, r7)
            if (r11 != 0) goto L3d
            u4.o r9 = u4.o.k(r7, r10, r9)
        L3b:
            r3 = r6
            goto L50
        L3d:
            v4.c0 r3 = r11.f6481c
            v4.c0 r11 = r11.f6483e
            if (r3 != 0) goto L46
            if (r11 != 0) goto L46
            goto L4b
        L46:
            u4.k r9 = new u4.k
            r9.<init>(r3, r11)
        L4b:
            u4.o r9 = u4.o.k(r7, r10, r9)
            goto L3b
        L50:
            u4.l r6 = new u4.l
            r11 = r7
            u4.r r7 = u4.s.h(r10)
            r17 = r10
            u4.p r10 = u4.p.f13403i
            r18 = r11
            v4.o r11 = v4.o.o(r18)
            r6.<init>(r7, r8, r9, r10, r11)
            r15.m(r3, r6)
            int r6 = r17.i()
            int r7 = r6 + r18
            int r6 = r3 + 1
            r3 = 0
            goto L28
        L71:
            u4.m r3 = new u4.m
            u4.r r5 = u4.s.f13484s
            u4.p r10 = u4.p.f13403i
            r3.<init>(r5, r8, r9, r10)
            r15.m(r14, r3)
            r3 = 0
            r15.f22555g = r3
            boolean r3 = r1.i()
            if (r3 == 0) goto L8d
            r6 = -4
            int r6 = r1.f(r6)
            r13 = r6
            goto L8e
        L8d:
            r13 = 0
        L8e:
            u4.b r6 = new u4.b
            r14 = -1
            int r7 = r1.f(r14)
            z4.g r11 = z4.g.o(r13)
            r6.<init>(r7, r15, r11, r13)
            z4.g r15 = z4.g.f22550k
            r1.a(r6, r15)
            int r6 = r1.f6502c
            r11 = 1
            if (r3 == 0) goto L174
            h4.c r3 = r4.f6469c
            int r3 = r3.f5074b
            int r3 = r3 + r6
            if (r3 >= r11) goto Lae
            r3 = r11
        Lae:
            w4.c r7 = w4.c.E
            u4.o r3 = u4.o.k(r3, r7, r9)
            boolean r7 = r1.g()
            if (r7 == 0) goto Le5
            r7 = r6
            u4.v r6 = new u4.v
            r5 = r7
            u4.r r7 = u4.s.f13477q
            r18 = r9
            r9 = r10
            w4.b r10 = w4.b.f14847i
            r19 = r11
            v4.d0 r11 = r12.b()
            r14 = r5
            r5 = r19
            r17 = 2
            r6.<init>(r7, r8, r9, r10, r11)
            h4.u r7 = new h4.u
            r7.<init>(r5)
            r10 = 0
            r7.m(r10, r6)
            r19 = r0
            r6 = r3
            r0 = r5
            r17 = r12
            r12 = r10
            r10 = 0
            goto L11b
        Le5:
            r14 = r6
            r9 = r10
            r19 = r11
            r6 = 2
            r10 = 0
            h4.u r7 = new h4.u
            r7.<init>(r6)
            r17 = r6
            u4.l r6 = new u4.l
            r11 = r7
            u4.r r7 = u4.s.f13457l
            r16 = r11
            v4.o r11 = v4.o.f14107j
            r17 = r19
            r19 = r0
            r0 = r17
            r17 = r12
            r12 = r10
            r10 = r9
            r9 = r3
            r3 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            r7 = r6
            r6 = r9
            r9 = r10
            r3.m(r12, r7)
            u4.m r7 = new u4.m
            r10 = 0
            r7.<init>(r5, r8, r10, r9)
            r3.m(r0, r7)
            r7 = r3
        L11b:
            r3 = -5
            int r3 = r1.f(r3)
            r7.f22555g = r12
            u4.b r5 = new u4.b
            z4.g r11 = z4.g.o(r3)
            r5.<init>(r13, r7, r11, r3)
            r1.a(r5, r15)
            h4.u r5 = new h4.u
            boolean r7 = r1.g()
            if (r7 == 0) goto L138
            r7 = 2
            goto L139
        L138:
            r7 = r0
        L139:
            r5.<init>(r7)
            boolean r7 = r1.g()
            if (r7 == 0) goto L150
            u4.m r7 = new u4.m
            u4.r r11 = u4.s.j(r6)
            r7.<init>(r11, r8, r6, r9)
            r12 = 0
            r5.m(r12, r7)
            goto L151
        L150:
            r12 = 0
        L151:
            u4.u r7 = new u4.u
            u4.r r9 = u4.s.E1
            u4.p r6 = u4.p.p(r6)
            w4.b r11 = w4.b.f14847i
            r7.<init>(r9, r8, r6, r11)
            boolean r6 = r1.g()
            r5.m(r6, r7)
            r5.f22555g = r12
            u4.b r6 = new u4.b
            z4.g r7 = z4.g.o(r12)
            r6.<init>(r3, r5, r7, r12)
            r1.a(r6, r15)
            goto L17c
        L174:
            r19 = r0
            r14 = r6
            r10 = r9
            r0 = r11
            r17 = r12
            r12 = 0
        L17c:
            w4.a r3 = r17.a()
            b5.c[] r5 = r1.f6506g
            r6 = r5[r12]
            w4.b r3 = r3.f14845i
            r6.getClass()
            java.lang.Object[] r7 = r3.f22543h
            int r7 = r7.length
            r8 = 0
            r9 = 0
        L18e:
            if (r8 >= r7) goto L1a5
            java.lang.Object r11 = r3.l(r8)
            w4.c r11 = (w4.c) r11
            java.lang.Object r12 = r6.f469a
            i4.s r12 = (i4.s) r12
            r12.s(r9, r11)
            int r11 = r11.i()
            int r9 = r9 + r11
            int r8 = r8 + 1
            goto L18e
        L1a5:
            r12 = 0
            r3 = r5[r12]
            java.lang.Object r6 = r3.f469a
            i4.s r6 = (i4.s) r6
            r6.i()
            java.lang.Object r3 = r3.f470b
            i4.n r3 = (i4.n) r3
            r3.f22555g = r12
        L1b5:
            int r3 = x6.d.x(r2, r12)
            if (r3 >= 0) goto L3f6
            i4.a0 r2 = r1.f6504e
            u4.r r3 = r2.C
            if (r3 != 0) goto L1c4
            r12 = 0
            goto L23e
        L1c4:
            u4.t r2 = r2.D
            r6 = -2
            int r6 = r1.f(r6)
            boolean r7 = r1.i()
            if (r7 == 0) goto L20b
            h4.u r7 = new h4.u
            r7.<init>(r0)
            u4.u r8 = new u4.u
            u4.r r9 = u4.s.F1
            h4.c r11 = r4.f6469c
            int r11 = r11.f5074b
            int r11 = r11 + r14
            if (r11 >= r0) goto L1e2
            r11 = r0
        L1e2:
            w4.c r12 = w4.c.E
            u4.o r11 = u4.o.k(r11, r12, r10)
            u4.p r11 = u4.p.p(r11)
            w4.b r12 = w4.b.f14847i
            r8.<init>(r9, r2, r11, r12)
            r12 = 0
            r7.m(r12, r8)
            r7.f22555g = r12
            r8 = -3
            int r8 = r1.f(r8)
            u4.b r9 = new u4.b
            z4.g r11 = z4.g.o(r8)
            r9.<init>(r6, r7, r11, r8)
            z4.g r6 = z4.g.f22550k
            r1.a(r9, r6)
            r6 = r8
        L20b:
            h4.u r7 = new h4.u
            r7.<init>(r0)
            w4.e r8 = r3.f13408c
            int r9 = r8.size()
            if (r9 != 0) goto L21c
            u4.p r8 = u4.p.f13403i
            r12 = 0
            goto L229
        L21c:
            r12 = 0
            w4.c r8 = r8.getType(r12)
            u4.o r8 = u4.o.k(r12, r8, r10)
            u4.p r8 = u4.p.p(r8)
        L229:
            u4.m r9 = new u4.m
            r9.<init>(r3, r2, r10, r8)
            r7.m(r12, r9)
            r7.f22555g = r12
            u4.b r2 = new u4.b
            z4.g r3 = z4.g.f22550k
            r8 = -1
            r2.<init>(r6, r7, r3, r8)
            r1.a(r2, r3)
        L23e:
            boolean r2 = r1.f6510k
            r3 = 4
            if (r2 != 0) goto L245
            goto L2c0
        L245:
            u4.t r2 = r4.f(r12)
            w4.c r6 = w4.c.H
            u4.o r7 = u4.o.k(r12, r6, r10)
            h4.u r8 = new h4.u
            r9 = 2
            r8.<init>(r9)
            u4.m r9 = new u4.m
            u4.r r11 = new u4.r
            r6.getClass()
            w4.b r13 = w4.b.f14847i
            r11.<init>(r3, r6, r13, r10)
            u4.p r6 = u4.p.f13403i
            r9.<init>(r11, r2, r7, r6)
            r8.m(r12, r9)
            u4.u r6 = new u4.u
            u4.r r9 = u4.s.F1
            h4.c r4 = r4.f6469c
            int r4 = r4.f5074b
            int r11 = r14 + r4
            if (r11 >= r0) goto L276
            r11 = r0
        L276:
            w4.c r4 = w4.c.E
            u4.o r4 = u4.o.k(r11, r4, r10)
            u4.p r4 = u4.p.p(r4)
            r6.<init>(r9, r2, r4, r13)
            r8.m(r0, r6)
            r12 = 0
            r8.f22555g = r12
            r4 = -7
            int r4 = r1.f(r4)
            u4.b r6 = new u4.b
            r9 = -6
            int r9 = r1.f(r9)
            z4.g r11 = z4.g.o(r4)
            r6.<init>(r9, r8, r11, r4)
            z4.g r8 = z4.g.f22550k
            r1.a(r6, r8)
            h4.u r6 = new h4.u
            r6.<init>(r0)
            u4.u r9 = new u4.u
            u4.r r11 = u4.s.D1
            u4.p r7 = u4.p.p(r7)
            r9.<init>(r11, r2, r7, r13)
            r12 = 0
            r6.m(r12, r9)
            r6.f22555g = r12
            u4.b r2 = new u4.b
            r7 = -1
            r2.<init>(r4, r6, r8, r7)
            r1.a(r2, r8)
        L2c0:
            i4.l[] r2 = r1.f6509j
            int r4 = r2.length
            r6 = 0
        L2c4:
            if (r6 >= r4) goto L33b
            r7 = r2[r6]
            if (r7 == 0) goto L337
            java.lang.Object r7 = r7.f6465g
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L2d6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L337
            java.lang.Object r8 = r7.next()
            i4.w r8 = (i4.w) r8
            u4.b r9 = r1.j(r6)
            h4.u r9 = r9.f13366b
            r12 = 0
            java.lang.Object r9 = r9.l(r12)
            u4.i r9 = (u4.i) r9
            u4.t r9 = r9.f13383h
            h4.u r11 = new h4.u
            r12 = 2
            r11.<init>(r12)
            u4.m r13 = new u4.m
            w4.c r15 = r8.f6490a
            u4.r r12 = new u4.r
            r15.getClass()
            w4.b r0 = w4.b.f14847i
            r12.<init>(r3, r15, r0, r10)
            w4.c r0 = r8.f6490a
            u4.o r0 = u4.o.k(r14, r0, r10)
            u4.p r15 = u4.p.f13403i
            r13.<init>(r12, r9, r0, r15)
            r12 = 0
            r11.m(r12, r13)
            u4.m r0 = new u4.m
            u4.r r13 = u4.s.f13484s
            r0.<init>(r13, r9, r10, r15)
            r9 = 1
            r11.m(r9, r0)
            r11.f22555g = r12
            u4.b r0 = new u4.b
            int r8 = r8.f6491b
            z4.g r9 = z4.g.o(r6)
            r0.<init>(r8, r11, r9, r6)
            r8 = r5[r6]
            java.lang.Object r8 = r8.f471c
            z4.g r8 = (z4.g) r8
            r1.a(r0, r8)
            r0 = 1
            goto L2d6
        L337:
            int r6 = r6 + 1
            r0 = 1
            goto L2c4
        L33b:
            boolean r0 = r1.f6512m
            if (r0 == 0) goto L3f5
            z4.g r0 = new z4.g
            r0.<init>(r3)
            i4.l r2 = new i4.l
            r2.<init>(r1, r0)
            r12 = 0
            u4.b r3 = r1.j(r12)
            java.util.BitSet r4 = new java.util.BitSet
            r6 = r19
            r4.<init>(r6)
            r1.d(r3, r2, r4)
            int r2 = r1.e()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = r12
        L362:
            if (r4 >= r2) goto L36a
            r3.add(r10)
            int r4 = r4 + 1
            goto L362
        L36a:
            r2 = r12
        L36b:
            java.util.ArrayList r4 = r1.f6507h
            int r5 = r4.size()
            java.util.ArrayList r7 = r1.f6508i
            if (r2 >= r5) goto L38c
            java.lang.Object r4 = r4.get(r2)
            u4.b r4 = (u4.b) r4
            if (r4 != 0) goto L37e
            goto L389
        L37e:
            java.lang.Object r5 = r7.get(r2)
            z4.g r5 = (z4.g) r5
            int r4 = r4.f13365a
            r3.set(r4, r5)
        L389:
            int r2 = r2 + 1
            goto L36b
        L38c:
            int r2 = r0.f22552i
        L38e:
            if (r12 >= r2) goto L3ac
            int r5 = r0.n(r12)
            i4.y r8 = new i4.y
            i4.i r9 = new i4.i
            int r10 = r1.e()
            r9.<init>(r10)
            r8.<init>(r1, r9, r3)
            u4.b r5 = r1.j(r5)
            r8.a(r5)
            int r12 = r12 + 1
            goto L38e
        L3ac:
            z4.g r0 = new z4.g
            int r2 = r4.size()
            r0.<init>(r2)
            r7.clear()
            r7 = -1
            int r2 = r1.f(r7)
            androidx.lifecycle.x r3 = new androidx.lifecycle.x
            r5 = 25
            r3.<init>(r0, r5)
            u4.b r2 = r1.j(r2)
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>(r6)
            r1.d(r2, r3, r5)
            r0.s()
            int r2 = r4.size()
            r19 = 1
            int r2 = r2 + (-1)
        L3db:
            if (r2 < 0) goto L3f5
            java.lang.Object r3 = r4.get(r2)
            u4.b r3 = (u4.b) r3
            int r3 = r3.f13365a
            int r8 = r0.m(r3)
            if (r8 < 0) goto L3ec
            goto L3ed
        L3ec:
            r8 = r7
        L3ed:
            if (r8 >= 0) goto L3f2
            r4.remove(r2)
        L3f2:
            int r2 = r2 + (-1)
            goto L3db
        L3f5:
            return
        L3f6:
            r6 = r19
            r7 = -1
            r12 = 0
            r19 = r0
            x6.d.q(r2, r3)
            i4.e r0 = r1.f6501b
            int r8 = r0.p(r3)
            if (r8 < 0) goto L427
            java.lang.Object r0 = r0.l(r8)
            i4.d r0 = (i4.d) r0
            r8 = r5[r3]
            r1.m(r0, r8, r2)     // Catch: i4.b0 -> L418
            r0 = r19
            r19 = r6
            goto L1b5
        L418:
            r0 = move-exception
            java.lang.String r2 = a.a.X0(r3)
            java.lang.String r3 = "...while working on block "
            java.lang.String r2 = r3.concat(r2)
            r0.a(r2)
            throw r0
        L427:
            java.lang.String r0 = a.a.X0(r3)
            java.lang.String r2 = "no such label: "
            java.lang.String r0 = r2.concat(r0)
            j8.o.t(r0)
            return
    }

    public final void d(u4.b r6, u4.a r7, java.util.BitSet r8) {
            r5 = this;
            r7.d(r6)
            int r0 = r6.f13365a
            r8.set(r0)
            z4.g r0 = r6.f13367c
            int r1 = r0.f22552i
            r2 = 0
        Ld:
            if (r2 >= r1) goto L37
            int r3 = r0.n(r2)
            boolean r4 = r8.get(r3)
            if (r4 == 0) goto L1a
            goto L34
        L1a:
            boolean r4 = r5.h(r6)
            if (r4 == 0) goto L23
            if (r2 <= 0) goto L23
            goto L34
        L23:
            int r3 = r5.k(r3)
            if (r3 < 0) goto L34
            java.util.ArrayList r4 = r5.f6507h
            java.lang.Object r3 = r4.get(r3)
            u4.b r3 = (u4.b) r3
            r5.d(r3, r7, r8)
        L34:
            int r2 = r2 + 1
            goto Ld
        L37:
            return
    }

    public final int e() {
            r3 = this;
            i4.m r0 = r3.f6500a
            h4.c r0 = r0.f6469c
            i4.g r0 = r0.f5077e
            java.lang.Object[] r0 = r0.f22543h
            int r0 = r0.length
            int r1 = r3.f6503d
            int r1 = r1 + r0
            int r1 = r1 + 7
            java.util.ArrayList r0 = r3.f6507h
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            u4.b r2 = (u4.b) r2
            int r2 = r2.f13365a
            if (r2 < r1) goto L14
            int r2 = r2 + 1
            r1 = r2
            goto L14
        L28:
            return r1
    }

    public final int f(int r3) {
            r2 = this;
            i4.m r0 = r2.f6500a
            h4.c r0 = r0.f6469c
            i4.g r0 = r0.f5077e
            java.lang.Object[] r0 = r0.f22543h
            int r0 = r0.length
            int r1 = r2.f6503d
            int r1 = r1 + r0
            int r3 = ~r3
            int r1 = r1 + r3
            return r1
    }

    public final boolean g() {
            r1 = this;
            i4.m r0 = r1.f6500a
            l4.b r0 = r0.f6467a
            int r0 = r0.c()
            r0 = r0 & 8
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final boolean h(u4.b r5) {
            r4 = this;
            z4.g r5 = r5.f13367c
            int r0 = r5.f22552i
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 1
            int r5 = r5.n(r0)
            f1.h[] r1 = r4.f6511l
            int r3 = r1.length
            if (r5 >= r3) goto L18
            r5 = r1[r5]
            if (r5 == 0) goto L18
            return r0
        L18:
            return r2
    }

    public final boolean i() {
            r1 = this;
            i4.m r0 = r1.f6500a
            l4.b r0 = r0.f6467a
            int r0 = r0.c()
            r0 = r0 & 32
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final u4.b j(int r2) {
            r1 = this;
            int r0 = r1.k(r2)
            if (r0 < 0) goto Lf
            java.util.ArrayList r2 = r1.f6507h
            java.lang.Object r2 = r2.get(r0)
            u4.b r2 = (u4.b) r2
            return r2
        Lf:
            java.lang.String r2 = a.a.X0(r2)
            java.lang.String r0 = "no such label "
            java.lang.String r2 = r0.concat(r2)
            j8.o.t(r2)
            r2 = 0
            return r2
    }

    public final int k(int r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f6507h
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L17
            java.lang.Object r3 = r0.get(r2)
            u4.b r3 = (u4.b) r3
            int r3 = r3.f13365a
            if (r3 != r5) goto L14
            return r2
        L14:
            int r2 = r2 + 1
            goto L7
        L17:
            r5 = -1
            return r5
    }

    public final void l(int r17, int r18, f1.h r19, b5.c r20, int[] r21) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r5 = r3.f471c
            z4.g r5 = (z4.g) r5
            java.lang.Object r6 = r3.f470b
            i4.n r6 = (i4.n) r6
            java.lang.Object r7 = r3.f469a
            i4.s r7 = (i4.s) r7
            r8 = r16
            b5.c[] r9 = r8.f6506g
            r10 = r9[r0]
            if (r10 == 0) goto L9e
            if (r2 == 0) goto L27
            int r2 = r2.f3057h
            b5.c r1 = r10.F(r2, r1, r3)
            goto L84
        L27:
            java.lang.Object r1 = r10.f469a
            i4.s r1 = (i4.s) r1
            i4.s r2 = r1.q(r7)
            java.lang.Object r3 = r10.f470b
            i4.n r3 = (i4.n) r3
            r3.getClass()
            i4.n r6 = x6.d.N(r3, r6)     // Catch: i4.b0 -> L8c
            java.lang.Object r7 = r10.f471c
            z4.g r7 = (z4.g) r7
            boolean r11 = r7.equals(r5)
            if (r11 == 0) goto L46
            r11 = r7
            goto L6a
        L46:
            z4.g r11 = new z4.g
            r12 = 4
            r11.<init>(r12)
            int r12 = r7.f22552i
            int r13 = r5.f22552i
            r15 = 0
        L51:
            if (r15 >= r12) goto L67
            if (r15 >= r13) goto L67
            int r14 = r7.n(r15)
            int r8 = r5.n(r15)
            if (r14 != r8) goto L67
            r11.l(r15)
            int r15 = r15 + 1
            r8 = r16
            goto L51
        L67:
            r5 = 0
            r11.f22555g = r5
        L6a:
            boolean r5 = r2 instanceof i4.t
            if (r5 != 0) goto L6f
            goto L77
        L6f:
            i4.t r2 = (i4.t) r2
            int r5 = r11.f22552i
            if (r5 != 0) goto L77
            i4.u r2 = r2.f6486h
        L77:
            if (r2 != r1) goto L7f
            if (r6 != r3) goto L7f
            if (r7 != r11) goto L7f
            r1 = r10
            goto L84
        L7f:
            b5.c r1 = new b5.c
            r1.<init>(r2, r6, r11)
        L84:
            if (r1 == r10) goto L8b
            r9[r0] = r1
            x6.d.g0(r4, r0)
        L8b:
            return
        L8c:
            r0 = move-exception
            java.lang.String r1 = "underlay stack:"
            r0.a(r1)
            r3.l(r0)
            java.lang.String r1 = "overlay stack:"
            r0.a(r1)
            r6.l(r0)
            throw r0
        L9e:
            if (r2 == 0) goto Lbb
            z4.g r2 = r5.p()
            r2.l(r0)
            b5.c r2 = new b5.c
            i4.u r5 = r7.o()
            z4.g r7 = z4.g.o(r0)
            r2.<init>(r5, r6, r7)
            b5.c r1 = r2.F(r0, r1, r3)
            r9[r0] = r1
            goto Lbd
        Lbb:
            r9[r0] = r3
        Lbd:
            x6.d.g0(r4, r0)
            return
    }

    public final void m(i4.d r31, b5.c r32, int[] r33) {
            r30 = this;
            r1 = r30
            r0 = r31
            r2 = r32
            i4.g r7 = r0.f6453e
            int r8 = r0.f6449a
            java.lang.Object[] r3 = r7.f22543h
            int r3 = r3.length
            r9 = 0
            if (r3 != 0) goto L13
            w4.b r3 = w4.b.f14847i
            goto L33
        L13:
            w4.b r4 = new w4.b
            r4.<init>(r3)
            r5 = r9
        L19:
            if (r5 >= r3) goto L30
            java.lang.Object r6 = r7.l(r5)
            i4.f r6 = (i4.f) r6
            v4.d0 r6 = r6.f6457d
            if (r6 == 0) goto L26
            goto L28
        L26:
            v4.d0 r6 = v4.d0.f14071j
        L28:
            w4.c r6 = r6.f14088g
            r4.m(r5, r6)
            int r5 = r5 + 1
            goto L19
        L30:
            r4.f22555g = r9
            r3 = r4
        L33:
            i4.a0 r10 = r1.f6504e
            r10.f6434u = r3
            java.util.ArrayList r11 = r10.f6433t
            r11.clear()
            r10.f6435v = r9
            r10.f6436w = r9
            r10.f6437x = r9
            r10.f6438y = r9
            r10.A = r9
            r10.f6439z = r9
            r12 = 0
            r10.B = r12
            b5.c r5 = new b5.c
            java.lang.Object r3 = r2.f469a
            i4.s r3 = (i4.s) r3
            i4.s r3 = r3.m()
            java.lang.Object r4 = r2.f470b
            i4.n r4 = (i4.n) r4
            i4.n r4 = r4.n()
            java.lang.Object r2 = r2.f471c
            z4.g r2 = (z4.g) r2
            r5.<init>(r3, r4, r2)
            java.lang.Object r2 = r5.f469a
            r13 = r2
            i4.s r13 = (i4.s) r13
            java.lang.Object r2 = r5.f470b
            r14 = r2
            i4.n r14 = (i4.n) r14
            java.lang.Object r2 = r5.f471c
            r15 = r2
            z4.g r15 = (z4.g) r15
            i4.c0 r2 = r1.f6505f
            r2.getClass()
            int r3 = r0.f6451c
            java.lang.Object r4 = r2.f6447e
            f1.h r4 = (f1.h) r4
            r4.f3059j = r5
            int r6 = r0.f6450b     // Catch: i4.b0 -> L94
        L82:
            if (r6 >= r3) goto L97
            r16 = r12
            java.lang.Object r12 = r2.f6444b     // Catch: i4.b0 -> L94
            i4.l r12 = (i4.l) r12     // Catch: i4.b0 -> L94
            int r12 = r12.a(r6, r4)     // Catch: i4.b0 -> L94
            r4.f3057h = r6     // Catch: i4.b0 -> L94
            int r6 = r6 + r12
            r12 = r16
            goto L82
        L94:
            r0 = move-exception
            goto L445
        L97:
            r16 = r12
            r13.i()
            r14.f22555g = r9
            int r12 = r10.f6438y
            int r2 = r11.size()
            java.lang.Object[] r3 = r7.f22543h
            int r3 = r3.length
            z4.g r4 = r0.f6452d
            boolean r6 = r10.f6439z
            f1.h[] r9 = r1.f6511l
            r32 = r9
            r9 = 1
            if (r6 == 0) goto Le3
            int r6 = r4.n(r9)
            r18 = r32[r6]
            if (r18 != 0) goto Lc4
            r18 = r9
            f1.h r9 = new f1.h
            r9.<init>(r1, r6)
            r32[r6] = r9
            goto Lc6
        Lc4:
            r18 = r9
        Lc6:
            r9 = r32[r6]
            java.lang.Object r9 = r9.f3058i
            java.util.BitSet r9 = (java.util.BitSet) r9
            r9.set(r8)
            r6 = r32[r6]
            r1 = r33
            r19 = r2
            r21 = r3
            r9 = r4
            r20 = r5
            r4 = r6
            r29 = r8
            r28 = r12
            r2 = r18
            goto L20c
        Le3:
            r18 = r9
            i4.v r6 = r10.B
            if (r6 == 0) goto L1f2
            int r4 = r6.f6489g
            r6 = r32[r4]
            if (r6 != 0) goto Lfe
            f1.h r6 = new f1.h
            r6.<init>(r1, r4)
            java.lang.Object r9 = r6.f3059j
            java.util.BitSet r9 = (java.util.BitSet) r9
            r9.set(r8)
            r32[r4] = r6
            goto L105
        Lfe:
            java.lang.Object r6 = r6.f3059j
            java.util.BitSet r6 = (java.util.BitSet) r6
            r6.set(r8)
        L105:
            r6 = r32[r4]
            r6.getClass()
            z4.g r9 = new z4.g
            java.lang.Object r1 = r6.f3058i
            java.util.BitSet r1 = (java.util.BitSet) r1
            r19 = r2
            int r2 = r1.size()
            r9.<init>(r2)
            r2 = 0
            int r17 = r1.nextSetBit(r2)
            r2 = r17
        L120:
            if (r2 < 0) goto L142
            r21 = r3
            java.lang.Object r3 = r6.f3060k
            i4.z r3 = (i4.z) r3
            u4.b r3 = r3.j(r2)
            z4.g r3 = r3.f13367c
            r17 = r2
            r2 = 0
            int r3 = r3.n(r2)
            r9.l(r3)
            int r3 = r17 + 1
            int r3 = r1.nextSetBit(r3)
            r2 = r3
            r3 = r21
            goto L120
        L142:
            r21 = r3
            r2 = 0
            r9.f22555g = r2
            r1 = r32[r4]
            java.lang.Object r3 = r1.f3058i
            java.util.BitSet r3 = (java.util.BitSet) r3
            java.lang.Object r4 = r1.f3060k
            i4.z r4 = (i4.z) r4
            int r6 = r3.nextSetBit(r2)
        L155:
            if (r6 < 0) goto L1e5
            r20 = r5
            u4.b r5 = r4.j(r6)
            z4.g r5 = r5.f13367c
            int r23 = r5.n(r2)
            int r2 = r1.f3057h
            java.lang.String r5 = "returning from invalid subroutine"
            r32 = r1
            boolean r1 = r13 instanceof i4.t
            if (r1 == 0) goto L182
            r1 = r13
            i4.t r1 = (i4.t) r1
            java.util.ArrayList r1 = r1.f6487i
            r22 = r4
            int r4 = r1.size()
            if (r6 < r4) goto L17b
            goto L184
        L17b:
            java.lang.Object r1 = r1.get(r6)
            i4.s r1 = (i4.s) r1
            goto L186
        L182:
            r22 = r4
        L184:
            r1 = r16
        L186:
            z4.g r4 = r15.p()     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            r4.j()     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            r28 = r12
            int r12 = r4.f22552i     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            int r12 = r12 + (-1)
            int r12 = r4.n(r12)     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            r29 = r8
            int r8 = r4.f22552i     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            int r8 = r8 + (-1)
            r4.f22552i = r8     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            if (r12 != r2) goto L1d5
            r2 = 0
            r4.f22555g = r2     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            if (r1 != 0) goto L1a9
            r26 = r16
            goto L1b0
        L1a9:
            b5.c r2 = new b5.c
            r2.<init>(r1, r14, r4)
            r26 = r2
        L1b0:
            if (r26 == 0) goto L1be
            r24 = -1
            r25 = 0
            r27 = r33
            r22.l(r23, r24, r25, r26, r27)
            r1 = r33
            goto L1c3
        L1be:
            r1 = r33
            x6.d.g0(r1, r6)
        L1c3:
            int r6 = r6 + 1
            int r6 = r3.nextSetBit(r6)
            r1 = r32
            r5 = r20
            r4 = r22
            r12 = r28
            r8 = r29
            r2 = 0
            goto L155
        L1d5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            r0.<init>(r5)     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
            throw r0     // Catch: java.lang.NullPointerException -> L1db java.lang.IndexOutOfBoundsException -> L1e1
        L1db:
            java.lang.String r0 = "can't return from non-subroutine"
            bsh.j.c(r0)
            return
        L1e1:
            bsh.j.g(r5)
            return
        L1e5:
            r1 = r33
            r20 = r5
            r29 = r8
            r28 = r12
            int r2 = r9.f22552i
            r4 = r16
            goto L20c
        L1f2:
            r1 = r33
            r19 = r2
            r21 = r3
            r20 = r5
            r29 = r8
            r28 = r12
            boolean r2 = r10.f6435v
            if (r2 == 0) goto L208
            r9 = r4
            r4 = r16
            r2 = r21
            goto L20c
        L208:
            r9 = r4
            r4 = r16
            r2 = 0
        L20c:
            int r8 = r9.f22552i
            r12 = r2
        L20f:
            if (r12 >= r8) goto L249
            int r2 = r9.n(r12)
            int r3 = r0.f6449a     // Catch: i4.b0 -> L238
            r6 = r1
            r22 = r8
            r8 = r19
            r5 = r20
            r1 = r30
            r19 = r9
            r9 = r21
            r1.l(r2, r3, r4, r5, r6)     // Catch: i4.b0 -> L236
            r20 = r5
            int r12 = r12 + 1
            r1 = r33
            r21 = r9
            r9 = r19
            r19 = r8
            r8 = r22
            goto L20f
        L236:
            r0 = move-exception
            goto L23b
        L238:
            r0 = move-exception
            r1 = r30
        L23b:
            java.lang.String r2 = a.a.X0(r2)
            java.lang.String r3 = "...while merging to block "
            java.lang.String r2 = r3.concat(r2)
            r0.a(r2)
            throw r0
        L249:
            r1 = r30
            r22 = r8
            r8 = r19
            r19 = r9
            r9 = r21
            if (r22 != 0) goto L265
            boolean r2 = r10.f6436w
            if (r2 == 0) goto L265
            r2 = -2
            int r2 = r1.f(r2)
            z4.g r2 = z4.g.o(r2)
            r3 = r18
            goto L269
        L265:
            r2 = r19
            r3 = r22
        L269:
            if (r3 != 0) goto L26d
            r4 = -1
            goto L275
        L26d:
            int r4 = r10.f6437x
            if (r4 < 0) goto L275
            int r4 = r2.n(r4)
        L275:
            boolean r5 = r1.i()
            if (r5 == 0) goto L282
            boolean r5 = r10.A
            if (r5 == 0) goto L282
            r10 = r18
            goto L283
        L282:
            r10 = 0
        L283:
            if (r10 != 0) goto L28b
            if (r9 == 0) goto L288
            goto L28b
        L288:
            r0 = r4
            goto L37d
        L28b:
            z4.g r2 = new z4.g
            r2.<init>(r3)
            r3 = 0
            r5 = 0
        L292:
            if (r3 >= r9) goto L343
            java.lang.Object r6 = r7.l(r3)
            i4.f r6 = (i4.f) r6
            v4.d0 r12 = r6.f6457d
            if (r12 == 0) goto L29f
            goto L2a1
        L29f:
            v4.d0 r12 = v4.d0.f14071j
        L2a1:
            int r6 = r6.f6456c
            v4.d0 r1 = v4.d0.f14071j
            if (r12 != r1) goto L2aa
            r1 = r18
            goto L2ab
        L2aa:
            r1 = 0
        L2ab:
            r19 = r5 | r1
            i4.n r1 = r14.n()
            r1.j()
            r20 = r2
            r5 = 0
        L2b7:
            int r2 = r1.f6473i
            if (r5 >= r2) goto L2cd
            java.lang.Object r2 = r1.f6474j
            w4.d[] r2 = (w4.d[]) r2
            r2[r5] = r16
            java.lang.Object r2 = r1.f6475k
            boolean[] r2 = (boolean[]) r2
            r21 = r2
            r2 = 0
            r21[r5] = r2
            int r5 = r5 + 1
            goto L2b7
        L2cd:
            r2 = 0
            r1.f6473i = r2
            r1.q(r12)
            b5.c r5 = new b5.c
            r5.<init>(r13, r1, r15)
            r1 = r3
            int r3 = r0.f6449a     // Catch: i4.b0 -> L331
            r2 = r4
            r4 = 0
            r0 = r20
            r20 = r7
            r7 = r0
            r21 = r1
            r0 = r2
            r2 = r6
            r1 = r30
            r6 = r33
            r1.l(r2, r3, r4, r5, r6)     // Catch: i4.b0 -> L32f
            i4.l[] r3 = r1.f6509j
            r4 = r3[r2]
            if (r4 != 0) goto L2fa
            i4.l r4 = new i4.l
            r4.<init>(r1)
            r3[r2] = r4
        L2fa:
            w4.c r2 = r12.f14088g
            java.lang.Object r3 = r4.f6465g
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r5 = r3.get(r2)
            i4.w r5 = (i4.w) r5
            if (r5 != 0) goto L31e
            java.lang.Object r4 = r4.f6466h
            i4.z r4 = (i4.z) r4
            i4.x r4 = r4.f6513n
            int r4 = r4.k()
            i4.w r5 = new i4.w
            r5.<init>()
            r5.f6490a = r2
            r5.f6491b = r4
            r3.put(r2, r5)
        L31e:
            int r2 = r5.f6491b
            r7.l(r2)
            int r3 = r21 + 1
            r4 = r0
            r2 = r7
            r5 = r19
            r7 = r20
            r0 = r31
            goto L292
        L32f:
            r0 = move-exception
            goto L335
        L331:
            r0 = move-exception
            r1 = r30
            r2 = r6
        L335:
            java.lang.String r2 = a.a.X0(r2)
            java.lang.String r3 = "...while merging exception to block "
            java.lang.String r2 = r3.concat(r2)
            r0.a(r2)
            throw r0
        L343:
            r7 = r2
            r0 = r4
            if (r10 == 0) goto L374
            if (r5 != 0) goto L374
            r2 = -6
            int r2 = r1.f(r2)
            r7.l(r2)
            r2 = r18
            r1.f6510k = r2
            int r3 = r8 - r28
            int r3 = r3 - r2
        L358:
            if (r3 >= r8) goto L374
            java.lang.Object r2 = r11.get(r3)
            u4.i r2 = (u4.i) r2
            u4.r r4 = r2.f13382g
            boolean r4 = r4.a()
            if (r4 == 0) goto L371
            w4.c r4 = w4.c.E
            u4.i r2 = r2.i(r4)
            r11.set(r3, r2)
        L371:
            int r3 = r3 + 1
            goto L358
        L374:
            if (r0 < 0) goto L379
            r7.l(r0)
        L379:
            r2 = 0
            r7.f22555g = r2
            r2 = r7
        L37d:
            int r3 = r2.m(r0)
            if (r3 < 0) goto L385
            r12 = r3
            goto L386
        L385:
            r12 = -1
        L386:
            r4 = r0
            r0 = r2
            r2 = r8
        L389:
            if (r28 <= 0) goto L3e1
            int r2 = r2 + (-1)
            java.lang.Object r3 = r11.get(r2)
            u4.i r3 = (u4.i) r3
            u4.r r5 = r3.f13382g
            int r5 = r5.f13410e
            r6 = 1
            if (r5 != r6) goto L39c
            r5 = 1
            goto L39d
        L39c:
            r5 = 0
        L39d:
            h4.u r6 = new h4.u
            if (r5 == 0) goto L3a3
            r7 = 2
            goto L3a4
        L3a3:
            r7 = 1
        L3a4:
            r6.<init>(r7)
            r7 = 0
            r6.m(r7, r3)
            if (r5 == 0) goto L3c3
            u4.m r5 = new u4.m
            u4.r r8 = u4.s.f13484s
            u4.t r3 = r3.f13383h
            u4.p r9 = u4.p.f13403i
            r10 = r16
            r5.<init>(r8, r3, r10, r9)
            r3 = 1
            r6.m(r3, r5)
            z4.g r3 = z4.g.o(r4)
            goto L3c4
        L3c3:
            r3 = r0
        L3c4:
            r6.f22555g = r7
            int r5 = r1.e()
            u4.b r8 = new u4.b
            r8.<init>(r5, r6, r3, r4)
            r1.a(r8, r15)
            z4.g r0 = r0.p()
            r0.q(r12, r5)
            r0.f22555g = r7
            int r28 = r28 + (-1)
            r4 = r5
            r16 = 0
            goto L389
        L3e1:
            if (r2 != 0) goto L3e5
            r10 = 0
            goto L3ee
        L3e5:
            int r3 = r2 + (-1)
            java.lang.Object r3 = r11.get(r3)
            r10 = r3
            u4.i r10 = (u4.i) r10
        L3ee:
            if (r10 == 0) goto L3f7
            u4.r r3 = r10.f13382g
            int r3 = r3.f13410e
            r6 = 1
            if (r3 != r6) goto L40d
        L3f7:
            if (r10 != 0) goto L3fc
            u4.t r3 = u4.t.f13515d
            goto L3fe
        L3fc:
            u4.t r3 = r10.f13383h
        L3fe:
            u4.m r5 = new u4.m
            u4.r r6 = u4.s.f13484s
            u4.p r7 = u4.p.f13403i
            r10 = 0
            r5.<init>(r6, r3, r10, r7)
            r11.add(r5)
            int r2 = r2 + 1
        L40d:
            h4.u r3 = new h4.u
            r3.<init>(r2)
            r5 = 0
        L413:
            if (r5 >= r2) goto L421
            java.lang.Object r6 = r11.get(r5)
            u4.i r6 = (u4.i) r6
            r3.m(r5, r6)
            int r5 = r5 + 1
            goto L413
        L421:
            r7 = 0
            r3.f22555g = r7
            u4.b r2 = new u4.b
            r5 = r29
            r2.<init>(r5, r3, r0, r4)
            int r0 = r2.f13365a
            int r0 = r1.k(r0)
            if (r0 >= 0) goto L434
            goto L437
        L434:
            r1.n(r0)
        L437:
            java.util.ArrayList r0 = r1.f6507h
            r0.add(r2)
            r15.k()
            java.util.ArrayList r0 = r1.f6508i
            r0.add(r15)
            return
        L445:
            r13.l(r0)
            r14.l(r0)
            throw r0
    }

    public final void n(int r6) {
            r5 = this;
            i4.m r0 = r5.f6500a
            h4.c r0 = r0.f6469c
            i4.g r0 = r0.f5077e
            java.lang.Object[] r0 = r0.f22543h
            int r0 = r0.length
            int r1 = r5.f6503d
            int r1 = r1 + r0
            int r1 = r1 + 7
            java.util.ArrayList r0 = r5.f6507h
            java.lang.Object r2 = r0.get(r6)
            u4.b r2 = (u4.b) r2
            z4.g r2 = r2.f13367c
            int r3 = r2.f22552i
            r0.remove(r6)
            java.util.ArrayList r0 = r5.f6508i
            r0.remove(r6)
            r6 = 0
        L23:
            if (r6 >= r3) goto L46
            int r0 = r2.n(r6)
            if (r0 < r1) goto L43
            int r4 = r5.k(r0)
            if (r4 < 0) goto L35
            r5.n(r4)
            goto L43
        L35:
            java.lang.String r6 = a.a.X0(r0)
            java.lang.String r0 = "Invalid label "
            java.lang.String r6 = r0.concat(r6)
            bsh.j.g(r6)
            return
        L43:
            int r6 = r6 + 1
            goto L23
        L46:
            return
    }
}
