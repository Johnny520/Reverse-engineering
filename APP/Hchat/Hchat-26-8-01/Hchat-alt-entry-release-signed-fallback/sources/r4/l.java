package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends r4.l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v4.y f11437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i4.a f11438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r4.i f11439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f11440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w4.e f11441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r4.o f11442p;

    public l(v4.y r3, i4.a r4, boolean r5, w4.e r6) {
            r2 = this;
            r0 = 4
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto L27
            if (r4 == 0) goto L20
            if (r6 == 0) goto L19
            r2.f11437k = r3
            r2.f11438l = r4
            r2.f11440n = r5
            r2.f11441o = r6
            r3 = 0
            r2.f11439m = r3
            r2.f11442p = r3
            return
        L19:
            java.lang.String r3 = "throwsList == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L20:
            java.lang.String r3 = "code == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
        L27:
            java.lang.String r3 = "ref == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    @Override // r4.a0
    public final void a(r4.p r13) {
            r12 = this;
            r4.k0 r0 = r13.f11490o
            r4.h0 r1 = r13.f11482g
            i4.a r2 = r12.f11438l
            int r3 = r2.f6407g
            r4 = 1
            if (r3 == r4) goto L14
            java.lang.Object r3 = r2.f6408h
            p4.u r3 = (p4.u) r3
            boolean r3 = r3.f10229d
            if (r3 == 0) goto L14
            goto L1c
        L14:
            java.lang.Object r3 = r2.f6408h
            p4.u r3 = (p4.u) r3
            boolean r3 = r3.f10230e
            if (r3 == 0) goto L2a
        L1c:
            r4.o r3 = new r4.o
            boolean r4 = r12.f11440n
            v4.y r5 = r12.f11437k
            r3.<init>(r2, r4, r5)
            r12.f11442p = r3
            r0.k(r3)
        L2a:
            java.lang.Object r0 = r2.f6409i
            b5.c r0 = (b5.c) r0
            java.lang.Object r0 = r0.f469a
            f1.h r0 = (f1.h) r0
            java.lang.Object r0 = r0.f3058i
            u4.c r0 = (u4.c) r0
            java.lang.Object[] r3 = r0.f22543h
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L3b:
            r6 = 20
            if (r5 >= r3) goto Lb2
            java.lang.Object r7 = r0.l(r5)
            u4.b r7 = (u4.b) r7
            h4.u r7 = r7.f13366b
            u4.i r7 = r7.p()
            w4.e r7 = r7.e()
            int r7 = r7.size()
            if (r7 == 0) goto Laf
            java.lang.Object r0 = r2.f6409i
            b5.c r0 = (b5.c) r0
            r0.getClass()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r6)
            java.lang.Object r0 = r0.f469a
            f1.h r0 = (f1.h) r0
            java.lang.Object r0 = r0.f3058i
            u4.c r0 = (u4.c) r0
            java.lang.Object[] r5 = r0.f22543h
            int r5 = r5.length
            r7 = r4
        L6d:
            if (r7 >= r5) goto L93
            java.lang.Object r8 = r0.l(r7)
            u4.b r8 = (u4.b) r8
            h4.u r8 = r8.f13366b
            u4.i r8 = r8.p()
            w4.e r8 = r8.e()
            int r9 = r8.size()
            r10 = r4
        L84:
            if (r10 >= r9) goto L90
            w4.c r11 = r8.getType(r10)
            r3.add(r11)
            int r10 = r10 + 1
            goto L84
        L90:
            int r7 = r7 + 1
            goto L6d
        L93:
            java.util.Iterator r0 = r3.iterator()
        L97:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La7
            java.lang.Object r3 = r0.next()
            w4.c r3 = (w4.c) r3
            r1.t(r3)
            goto L97
        La7:
            r4.i r0 = new r4.i
            r0.<init>(r2)
            r12.f11439m = r0
            goto Lb2
        Laf:
            int r5 = r5 + 1
            goto L3b
        Lb2:
            java.lang.Object r0 = r2.f6408h
            p4.u r0 = (p4.u) r0
            r0.getClass()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r6)
            java.util.ArrayList r0 = r0.f10228c
            java.util.Iterator r0 = r0.iterator()
        Lc4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf9
            java.lang.Object r2 = r0.next()
            p4.h r2 = (p4.h) r2
            boolean r3 = r2 instanceof p4.g
            if (r3 == 0) goto Ldc
            p4.g r2 = (p4.g) r2
            v4.a r2 = r2.f10110f
            r1.add(r2)
            goto Lc4
        Ldc:
            boolean r3 = r2 instanceof p4.r
            if (r3 == 0) goto Lf0
            p4.r r2 = (p4.r) r2
            r3 = r4
        Le3:
            v4.a[] r5 = r2.f10220f
            int r6 = r5.length
            if (r3 >= r6) goto Lc4
            r5 = r5[r3]
            r1.add(r5)
            int r3 = r3 + 1
            goto Le3
        Lf0:
            boolean r3 = r2 instanceof p4.p
            if (r3 != 0) goto Lf7
            boolean r2 = r2 instanceof p4.q
            goto Lc4
        Lf7:
            r13 = 0
            throw r13
        Lf9:
            java.util.Iterator r0 = r1.iterator()
        Lfd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10d
            java.lang.Object r1 = r0.next()
            v4.a r1 = (v4.a) r1
            r13.b(r1)
            goto Lfd
        L10d:
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11371x
            return r0
    }

    @Override // r4.l0
    public final void j(r4.k0 r11, int r12) {
            r10 = this;
            r4.p r11 = r11.f11472b
            m.a r12 = new m.a
            r0 = 14
            r12.<init>(r11, r0)
            i4.a r0 = r10.f11438l
            java.lang.Object r1 = r0.f6408h
            p4.u r1 = (p4.u) r1
            java.util.ArrayList r1 = r1.f10228c
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r1.next()
            p4.h r2 = (p4.h) r2
            boolean r4 = r2 instanceof p4.g
            if (r4 == 0) goto L45
            p4.g r2 = (p4.g) r2
            v4.a r3 = r2.f10110f
            int r4 = r12.q(r3)
            if (r4 < 0) goto L33
            r2.o(r4)
        L33:
            boolean r4 = r3 instanceof v4.w
            if (r4 == 0) goto L15
            v4.w r3 = (v4.w) r3
            v4.d0 r3 = r3.f14125g
            int r3 = r12.q(r3)
            if (r3 < 0) goto L15
            r2.n(r3)
            goto L15
        L45:
            boolean r4 = r2 instanceof p4.r
            if (r4 == 0) goto L15
            p4.r r2 = (p4.r) r2
        L4b:
            v4.a[] r4 = r2.f10220f
            int r5 = r4.length
            if (r3 >= r5) goto L15
            r4 = r4[r3]
            int r5 = r12.q(r4)
            java.lang.String r6 = "index < 0"
            if (r5 < 0) goto L8b
            int[] r7 = r2.f10221g
            r8 = r7[r3]
            r9 = -1
            if (r8 != r9) goto L85
            r7[r3] = r5
            boolean r5 = r4 instanceof v4.w
            if (r5 == 0) goto L82
            v4.w r4 = (v4.w) r4
            v4.d0 r4 = r4.f14125g
            int r4 = r12.q(r4)
            if (r4 < 0) goto L7e
            int r5 = r2.f10222h
            if (r5 != r9) goto L78
            r2.f10222h = r4
            goto L82
        L78:
            java.lang.String r11 = "class index already set"
            j8.o.A(r11)
            return
        L7e:
            j8.o.t(r6)
            return
        L82:
            int r3 = r3 + 1
            goto L4b
        L85:
            java.lang.String r11 = "index already set"
            j8.o.A(r11)
            return
        L8b:
            j8.o.t(r6)
            return
        L8f:
            r4.i r12 = r10.f11439m
            if (r12 == 0) goto L165
            r12.a()
            r4.h0 r11 = r11.f11482g
            p4.e r1 = r12.f11411b
            java.lang.Object[] r1 = r1.f22543h
            int r1 = r1.length
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r12.f11414e = r2
            r2 = r3
        La5:
            java.util.TreeMap r4 = r12.f11414e
            if (r2 >= r1) goto Lba
            p4.e r5 = r12.f11411b
            java.lang.Object r5 = r5.l(r2)
            p4.d r5 = (p4.d) r5
            p4.c r5 = r5.f10107i
            r6 = 0
            r4.put(r5, r6)
            int r2 = r2 + 1
            goto La5
        Lba:
            int r1 = r4.size()
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r2) goto L15f
            z4.d r1 = new z4.d
            r1.<init>()
            java.util.TreeMap r2 = r12.f11414e
            int r2 = r2.size()
            int r2 = r1.n(r2)
            r12.f11413d = r2
            java.util.TreeMap r2 = r12.f11414e
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Lde:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L147
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            p4.c r5 = (p4.c) r5
            java.lang.Object[] r6 = r5.f22543h
            int r7 = r6.length
            int r6 = r6.length
            if (r6 != 0) goto Lf8
            r6 = r3
            goto L108
        Lf8:
            int r6 = r6 + (-1)
            java.lang.Object r6 = r5.l(r6)
            p4.b r6 = (p4.b) r6
            v4.d0 r6 = r6.f10101g
            v4.d0 r8 = v4.d0.f14071j
            boolean r6 = r6.equals(r8)
        L108:
            int r8 = r1.f22538c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.setValue(r8)
            if (r6 == 0) goto L11c
            int r4 = r7 + (-1)
            int r4 = -r4
            r1.m(r4)
            int r7 = r7 + (-1)
            goto L11f
        L11c:
            r1.m(r7)
        L11f:
            r4 = r3
        L120:
            if (r4 >= r7) goto L139
            java.lang.Object r8 = r5.l(r4)
            p4.b r8 = (p4.b) r8
            v4.d0 r9 = r8.f10101g
            int r9 = r11.m(r9)
            r1.n(r9)
            int r8 = r8.f10102h
            r1.n(r8)
            int r4 = r4 + 1
            goto L120
        L139:
            if (r6 == 0) goto Lde
            java.lang.Object r4 = r5.l(r7)
            p4.b r4 = (p4.b) r4
            int r4 = r4.f10102h
            r1.n(r4)
            goto Lde
        L147:
            byte[] r11 = r1.h()
            r12.f11412c = r11
            r4.i r11 = r10.f11439m
            r11.a()
            p4.e r12 = r11.f11411b
            java.lang.Object[] r12 = r12.f22543h
            int r12 = r12.length
            int r12 = r12 * 8
            byte[] r11 = r11.f11412c
            int r11 = r11.length
            int r3 = r12 + r11
            goto L165
        L15f:
            java.lang.String r11 = "too many catch handlers"
            j8.o.w(r11)
            return
        L165:
            r0.j()
            java.lang.Object r11 = r0.f6413m
            p4.i r11 = (p4.i) r11
            int r11 = r11.o()
            r12 = r11 & 1
            if (r12 == 0) goto L176
            int r11 = r11 + 1
        L176:
            int r11 = r11 * 2
            int r11 = r11 + 16
            int r11 = r11 + r3
            r10.k(r11)
            return
    }

    @Override // r4.l0
    public final java.lang.String l() {
            r1 = this;
            v4.y r0 = r1.f11437k
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // r4.l0
    public final void m(r4.p r19, z4.d r20) {
            r18 = this;
            r1 = r18
            r0 = r20
            boolean r2 = r0.d()
            i4.a r3 = r1.f11438l
            r3.j()
            java.lang.Object r4 = r3.f6413m
            p4.i r4 = (p4.i) r4
            int r4 = r4.f10117i
            r3.j()
            java.lang.Object r5 = r3.f6413m
            p4.i r5 = (p4.i) r5
            java.lang.Object[] r6 = r5.f22543h
            int r6 = r6.length
            r7 = 0
            r8 = r7
            r9 = r8
        L20:
            r10 = 1
            if (r8 >= r6) goto L9b
            java.lang.Object r11 = r5.l(r8)
            p4.h r11 = (p4.h) r11
            boolean r12 = r11 instanceof p4.g
            if (r12 == 0) goto L71
            r12 = r11
            p4.g r12 = (p4.g) r12
            v4.a r12 = r12.f10110f
            boolean r13 = r12 instanceof v4.e
            if (r13 == 0) goto L5e
            v4.e r12 = (v4.e) r12
            p4.j r11 = r11.f10114b
            int r11 = r11.f10119b
            r13 = 113(0x71, float:1.58E-43)
            if (r11 != r13) goto L41
            goto L42
        L41:
            r10 = r7
        L42:
            w4.a r11 = r12.f14090i
            if (r10 == 0) goto L47
            goto L57
        L47:
            w4.a r10 = r12.f14091j
            if (r10 != 0) goto L55
            v4.d0 r10 = r12.f14125g
            w4.c r10 = r10.f14088g
            w4.a r10 = r11.e(r10)
            r12.f14091j = r10
        L55:
            w4.a r11 = r12.f14091j
        L57:
            w4.b r10 = r11.f14845i
            int r10 = r10.o()
            goto L8e
        L5e:
            boolean r10 = r12 instanceof v4.i
            if (r10 == 0) goto L6f
            v4.i r12 = (v4.i) r12
            v4.q r10 = r12.f14096g
            w4.a r10 = r10.f14116i
            w4.b r10 = r10.f14845i
            int r10 = r10.o()
            goto L8e
        L6f:
            r10 = r7
            goto L8e
        L71:
            boolean r12 = r11 instanceof p4.r
            if (r12 == 0) goto L98
            p4.j r12 = r11.f10114b
            int r12 = r12.f10119b
            r13 = 250(0xfa, float:3.5E-43)
            if (r12 != r13) goto L92
            p4.r r11 = (p4.r) r11
            v4.a[] r11 = r11.f10220f
            r11 = r11[r10]
            v4.a0 r11 = (v4.a0) r11
            w4.a r11 = r11.f14064g
            w4.b r11 = r11.f14845i
            int r11 = r11.o()
            int r10 = r10 + r11
        L8e:
            if (r10 <= r9) goto L98
            r9 = r10
            goto L98
        L92:
            java.lang.String r0 = "Expecting invoke-polymorphic"
            bsh.j.g(r0)
            return
        L98:
            int r8 = r8 + 1
            goto L20
        L9b:
            v4.y r5 = r1.f11437k
            w4.a r6 = r5.f14090i
            boolean r8 = r1.f11440n
            if (r8 == 0) goto La4
            goto Lb4
        La4:
            w4.a r8 = r5.f14091j
            if (r8 != 0) goto Lb2
            v4.d0 r8 = r5.f14125g
            w4.c r8 = r8.f14088g
            w4.a r6 = r6.e(r8)
            r5.f14091j = r6
        Lb2:
            w4.a r6 = r5.f14091j
        Lb4:
            w4.b r6 = r6.f14845i
            int r6 = r6.o()
            r3.j()
            java.lang.Object r8 = r3.f6413m
            p4.i r8 = (p4.i) r8
            int r8 = r8.o()
            r11 = r8 & 1
            if (r11 == 0) goto Lca
            goto Lcb
        Lca:
            r10 = r7
        Lcb:
            r4.i r11 = r1.f11439m
            if (r11 != 0) goto Ld1
            r11 = r7
            goto Ld9
        Ld1:
            r11.a()
            p4.e r11 = r11.f11411b
            java.lang.Object[] r11 = r11.f22543h
            int r11 = r11.length
        Ld9:
            r4.o r12 = r1.f11442p
            if (r12 != 0) goto Ldf
            r12 = r7
            goto Le3
        Ldf:
            int r12 = r12.f()
        Le3:
            r13 = 2
            if (r2 == 0) goto L1a7
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r1.g()
            r14.append(r15)
            r15 = 32
            r14.append(r15)
            java.lang.String r15 = r5.a()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r0.b(r7, r14)
            java.lang.String r14 = a.a.X0(r4)
            java.lang.String r15 = "  registers_size: "
            java.lang.String r14 = r15.concat(r14)
            r0.b(r13, r14)
            java.lang.String r14 = a.a.X0(r6)
            java.lang.String r15 = "  ins_size:       "
            java.lang.String r14 = r15.concat(r14)
            r0.b(r13, r14)
            java.lang.String r14 = a.a.X0(r9)
            java.lang.String r15 = "  outs_size:      "
            java.lang.String r14 = r15.concat(r14)
            r0.b(r13, r14)
            java.lang.String r14 = a.a.X0(r11)
            java.lang.String r15 = "  tries_size:     "
            java.lang.String r14 = r15.concat(r14)
            r0.b(r13, r14)
            java.lang.String r14 = a.a.Y0(r12)
            java.lang.String r15 = "  debug_off:      "
            java.lang.String r14 = r15.concat(r14)
            r15 = 4
            r0.b(r15, r14)
            java.lang.String r14 = a.a.Y0(r8)
            java.lang.String r13 = "  insns_size:     "
            java.lang.String r13 = r13.concat(r14)
            r0.b(r15, r13)
            w4.e r13 = r1.f11441o
            int r14 = r13.size()
            if (r14 == 0) goto L1a7
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "  throws "
            r14.<init>(r15)
            int r15 = r13.size()
            if (r15 != 0) goto L170
            java.lang.String r13 = "<empty>"
            r16 = r2
            r17 = r5
            goto L19b
        L170:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r16 = r2
            r2 = 100
            r7.<init>(r2)
            r2 = 0
        L17a:
            if (r2 >= r15) goto L195
            r17 = r5
            if (r2 == 0) goto L185
            java.lang.String r5 = ", "
            r7.append(r5)
        L185:
            w4.c r5 = r13.getType(r2)
            java.lang.String r5 = r5.a()
            r7.append(r5)
            int r2 = r2 + 1
            r5 = r17
            goto L17a
        L195:
            r17 = r5
            java.lang.String r13 = r7.toString()
        L19b:
            r14.append(r13)
            java.lang.String r2 = r14.toString()
            r5 = 0
            r0.b(r5, r2)
            goto L1ab
        L1a7:
            r16 = r2
            r17 = r5
        L1ab:
            r0.l(r4)
            r0.l(r6)
            r0.l(r9)
            r0.l(r11)
            r0.k(r12)
            r0.k(r8)
            r3.j()
            java.lang.Object r2 = r3.f6413m
            p4.i r2 = (p4.i) r2
            r2.p(r0)     // Catch: java.lang.RuntimeException -> L322
            r4.i r2 = r1.f11439m
            java.lang.String r3 = "    "
            if (r2 == 0) goto L30e
            if (r10 == 0) goto L1db
            if (r16 == 0) goto L1d7
            java.lang.String r2 = "  padding: 0"
            r4 = 2
            r0.b(r4, r2)
        L1d7:
            r5 = 0
            r0.l(r5)
        L1db:
            r4.i r2 = r1.f11439m
            r2.a()
            boolean r4 = r0.d()
            java.lang.String r5 = ".."
            if (r4 == 0) goto L2b3
            r2.a()
            p4.e r4 = r2.f11411b
            java.lang.Object[] r4 = r4.f22543h
            int r4 = r4.length
            java.lang.String r6 = "  tries:"
            r7 = 0
            r0.b(r7, r6)
            r6 = 0
        L1f7:
            if (r6 >= r4) goto L244
            p4.e r7 = r2.f11411b
            java.lang.Object r7 = r7.l(r6)
            p4.d r7 = (p4.d) r7
            p4.c r8 = r7.f10107i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "    try "
            r9.<init>(r10)
            int r10 = r7.f10105g
            char r11 = (char) r10
            if (r10 != r11) goto L214
            java.lang.String r10 = a.a.X0(r10)
            goto L218
        L214:
            java.lang.String r10 = a.a.Y0(r10)
        L218:
            r9.append(r10)
            r9.append(r5)
            int r7 = r7.f10106h
            char r10 = (char) r7
            if (r7 != r10) goto L228
            java.lang.String r7 = a.a.X0(r7)
            goto L22c
        L228:
            java.lang.String r7 = a.a.Y0(r7)
        L22c:
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = ""
            java.lang.String r8 = r8.p(r3, r9)
            r9 = 6
            r0.b(r9, r7)
            r7 = 2
            r0.b(r7, r8)
            int r6 = r6 + 1
            goto L1f7
        L244:
            java.lang.String r4 = "  handlers:"
            r7 = 0
            r0.b(r7, r4)
            int r4 = r2.f11413d
            java.util.TreeMap r6 = r2.f11414e
            int r6 = r6.size()
            java.lang.String r6 = a.a.X0(r6)
            java.lang.String r7 = "    size: "
            java.lang.String r6 = r7.concat(r6)
            r0.b(r4, r6)
            java.util.TreeMap r4 = r2.f11414e
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = r6
            r6 = 0
        L26c:
            boolean r8 = r4.hasNext()
            java.lang.String r9 = ": "
            if (r8 == 0) goto L2a0
            java.lang.Object r8 = r4.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            p4.c r10 = (p4.c) r10
            java.lang.Object r8 = r8.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r7 == 0) goto L29d
            int r11 = r8 - r6
            java.lang.String r6 = a.a.X0(r6)
            java.lang.String r6 = r6.concat(r9)
            java.lang.String r6 = r7.p(r3, r6)
            r0.b(r11, r6)
        L29d:
            r6 = r8
            r7 = r10
            goto L26c
        L2a0:
            byte[] r4 = r2.f11412c
            int r4 = r4.length
            int r4 = r4 - r6
            java.lang.String r6 = a.a.X0(r6)
            java.lang.String r6 = r6.concat(r9)
            java.lang.String r6 = r7.p(r3, r6)
            r0.b(r4, r6)
        L2b3:
            p4.e r4 = r2.f11411b
            java.lang.Object[] r4 = r4.f22543h
            int r4 = r4.length
            r6 = 0
        L2b9:
            if (r6 >= r4) goto L309
            p4.e r7 = r2.f11411b
            java.lang.Object r7 = r7.l(r6)
            p4.d r7 = (p4.d) r7
            int r8 = r7.f10105g
            int r9 = r7.f10106h
            int r10 = r9 - r8
            r11 = 65536(0x10000, float:9.1835E-41)
            if (r10 >= r11) goto L2e7
            r0.k(r8)
            r0.l(r10)
            java.util.TreeMap r8 = r2.f11414e
            p4.c r7 = r7.f10107i
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.l(r7)
            int r6 = r6 + 1
            goto L2b9
        L2e7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = a.a.Y0(r8)
            java.lang.String r3 = a.a.Y0(r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "bogus exception range: "
            r4.<init>(r6)
            r4.append(r2)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L309:
            byte[] r2 = r2.f11412c
            r0.i(r2)
        L30e:
            if (r16 == 0) goto L321
            r4.o r2 = r1.f11442p
            if (r2 == 0) goto L321
            java.lang.String r2 = "  debug info"
            r5 = 0
            r0.b(r5, r2)
            r4.o r2 = r1.f11442p
            r4 = r19
            r2.n(r4, r3, r0, r5)
        L321:
            return
        L322:
            r0 = move-exception
            java.lang.String r2 = r17.a()
            java.lang.String r3 = "...while writing instructions for "
            java.lang.String r2 = r3.concat(r2)
            f4.a r0 = f4.a.b(r2, r0)
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CodeItem{"
            r0.<init>(r1)
            v4.y r1 = r2.f11437k
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
