package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i4.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f6408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f6409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f6410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f6411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f6412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.Object f6413m;

    @Override // i4.k
    public void a(int r3, int r4, w4.c r5) {
            r2 = this;
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 1
            if (r3 == r0) goto L46
            r0 = 112(0x70, float:1.57E-43)
            if (r3 == r0) goto L46
            r5 = 172(0xac, float:2.41E-43)
            r0 = 0
            if (r3 == r5) goto L3a
            r5 = 177(0xb1, float:2.48E-43)
            if (r3 == r5) goto L3a
            r5 = 190(0xbe, float:2.66E-43)
            if (r3 == r5) goto L33
            r5 = 191(0xbf, float:2.68E-43)
            if (r3 == r5) goto L2c
            r5 = 194(0xc2, float:2.72E-43)
            if (r3 == r5) goto L33
            r5 = 195(0xc3, float:2.73E-43)
            if (r3 == r5) goto L33
            switch(r3) {
                case 46: goto L33;
                case 47: goto L33;
                case 48: goto L33;
                case 49: goto L33;
                case 50: goto L33;
                case 51: goto L33;
                case 52: goto L33;
                case 53: goto L33;
                default: goto L25;
            }
        L25:
            switch(r3) {
                case 79: goto L33;
                case 80: goto L33;
                case 81: goto L33;
                case 82: goto L33;
                case 83: goto L33;
                case 84: goto L33;
                case 85: goto L33;
                case 86: goto L33;
                default: goto L28;
            }
        L28:
            r2.k(r4, r1, r1)
            return
        L2c:
            r2.k(r4, r1, r0)
            r2.l(r4, r1, r0)
            return
        L33:
            r2.k(r4, r1, r1)
            r2.l(r4, r1, r1)
            return
        L3a:
            r2.k(r4, r1, r0)
            java.lang.Object r3 = r2.f6412l
            z4.g[] r3 = (z4.g[]) r3
            z4.g r5 = z4.g.f22550k
            r3[r4] = r5
            return
        L46:
            r2.k(r4, r1, r1)
            w4.c r3 = w4.c.f14871t
            if (r5 == r3) goto L53
            w4.c r3 = w4.c.f14872u
            if (r5 != r3) goto L52
            goto L53
        L52:
            return
        L53:
            r2.l(r4, r1, r1)
            return
    }

    @Override // i4.k
    public void b(int r1, int r2, int r3, v4.a r4, int r5) {
            r0 = this;
            r1 = 1
            r0.k(r2, r3, r1)
            boolean r5 = r4 instanceof v4.w
            if (r5 != 0) goto L1e
            boolean r5 = r4 instanceof v4.d0
            if (r5 != 0) goto L1e
            boolean r5 = r4 instanceof v4.c0
            if (r5 != 0) goto L1e
            boolean r5 = r4 instanceof v4.q
            if (r5 != 0) goto L1e
            boolean r5 = r4 instanceof v4.x
            if (r5 != 0) goto L1e
            boolean r4 = r4 instanceof v4.a0
            if (r4 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            r0.l(r2, r3, r1)
            return
    }

    @Override // i4.k
    public void c(int r1, int r2, v4.d0 r3, java.util.ArrayList r4) {
            r0 = this;
            r3 = 1
            r0.k(r1, r2, r3)
            r0.l(r1, r2, r3)
            return
    }

    @Override // i4.k
    public void d(int r1, int r2) {
            r0 = this;
            r1 = 1
            r0.k(r2, r1, r1)
            return
    }

    public void e(int r2, boolean r3) {
            r1 = this;
            java.lang.Object r0 = r1.f6410j
            int[] r0 = (int[]) r0
            boolean r0 = x6.d.z(r0, r2)
            if (r0 != 0) goto L11
            java.lang.Object r0 = r1.f6409i
            int[] r0 = (int[]) r0
            x6.d.g0(r0, r2)
        L11:
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r1.f6411k
            int[] r3 = (int[]) r3
            x6.d.g0(r3, r2)
        L1a:
            return
    }

    @Override // i4.k
    public int f() {
            r1 = this;
            int r0 = r1.f6407g
            return r0
    }

    @Override // i4.k
    public void g(int r3, int r4, i4.n r5, int r6) {
            r2 = this;
            r6 = 0
            r2.k(r3, r4, r6)
            java.lang.Object r4 = r5.f6475k
            z4.g r4 = (z4.g) r4
            int r0 = r5.f6473i
            int r0 = r4.n(r0)
            r1 = 1
            r2.e(r0, r1)
            int r5 = r5.f6473i
        L14:
            if (r6 >= r5) goto L20
            int r0 = r4.n(r6)
            r2.e(r0, r1)
            int r6 = r6 + 1
            goto L14
        L20:
            java.lang.Object r5 = r2.f6412l
            z4.g[] r5 = (z4.g[]) r5
            r5[r3] = r4
            return
    }

    @Override // i4.k
    public void h(int r5, int r6, int r7, int r8) {
            r4 = this;
            java.lang.Object r0 = r4.f6412l
            z4.g[] r0 = (z4.g[]) r0
            r1 = 167(0xa7, float:2.34E-43)
            r2 = 0
            r3 = 1
            if (r5 == r1) goto L2b
            r1 = 168(0xa8, float:2.35E-43)
            if (r5 == r1) goto Lf
            goto L12
        Lf:
            r4.e(r6, r3)
        L12:
            int r5 = r6 + r7
            r4.k(r6, r7, r3)
            r4.e(r5, r3)
            z4.g r7 = new z4.g
            r1 = 2
            r7.<init>(r1)
            r7.l(r5)
            r7.l(r8)
            r7.f22555g = r2
            r0[r6] = r7
            goto L34
        L2b:
            r4.k(r6, r7, r2)
            z4.g r5 = z4.g.o(r8)
            r0[r6] = r5
        L34:
            r4.e(r8, r3)
            return
    }

    @Override // i4.k
    public void i(int r1, int r2, int r3, int r4, w4.c r5, int r6) {
            r0 = this;
            r4 = 169(0xa9, float:2.37E-43)
            if (r1 != r4) goto L11
            r1 = 0
            r0.k(r2, r3, r1)
            java.lang.Object r1 = r0.f6412l
            z4.g[] r1 = (z4.g[]) r1
            z4.g r3 = z4.g.f22550k
            r1[r2] = r3
            return
        L11:
            r1 = 1
            r0.k(r2, r3, r1)
            return
    }

    public void j() {
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.f6413m
            p4.i r1 = (p4.i) r1
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.Object r1 = r0.f6408h
            p4.u r1 = (p4.u) r1
            int r2 = r1.f10227b
            int r3 = r1.f10231f
            if (r3 >= 0) goto L5df
            java.util.ArrayList r3 = r1.f10228c
            int r3 = r3.size()
            p4.j[] r4 = new p4.j[r3]
            r5 = 0
            r6 = r5
        L1d:
            if (r6 >= r3) goto L2e
            java.util.ArrayList r7 = r1.f10228c
            java.lang.Object r7 = r7.get(r6)
            p4.h r7 = (p4.h) r7
            p4.j r7 = r7.f10114b
            r4[r6] = r7
            int r6 = r6 + 1
            goto L1d
        L2e:
            r1.f(r4)
            n4.a r3 = r1.f10226a
            r3.getClass()
            int r3 = r1.f10233h
        L38:
            int r6 = r1.f10231f
            int r6 = r6 + r2
            int r7 = r1.f10232g
            int r6 = r6 + r7
            int r6 = r6 - r3
            java.util.ArrayList r7 = r1.f10228c
            java.util.Iterator r7 = r7.iterator()
            r8 = r5
            r9 = r8
            r10 = r9
            r11 = r10
        L49:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L8f
            java.lang.Object r12 = r7.next()
            p4.h r12 = (p4.h) r12
            u4.p r12 = r12.f10116d
            r14 = r5
        L58:
            java.lang.Object[] r15 = r12.f22543h
            int r15 = r15.length
            if (r14 >= r15) goto L49
            java.lang.Object r15 = r12.l(r14)
            u4.o r15 = (u4.o) r15
            r16 = 1
            w4.d r13 = r15.f13401h
            w4.c r13 = r13.getType()
            boolean r13 = r13.r()
            if (r13 == 0) goto L8c
            int r13 = r15.f13400g
            if (r13 < r6) goto L78
            r15 = r16
            goto L79
        L78:
            r15 = r5
        L79:
            r13 = r13 & 1
            if (r13 != 0) goto L85
            if (r15 == 0) goto L82
            int r9 = r9 + 1
            goto L8c
        L82:
            int r11 = r11 + 1
            goto L8c
        L85:
            if (r15 == 0) goto L8a
            int r8 = r8 + 1
            goto L8c
        L8a:
            int r10 = r10 + 1
        L8c:
            int r14 = r14 + 1
            goto L58
        L8f:
            r16 = 1
            if (r8 <= r9) goto L99
            if (r10 <= r11) goto L99
            r1.c()
            goto Lab
        L99:
            if (r8 <= r9) goto L9f
            r1.b()
            goto Lab
        L9f:
            if (r10 <= r11) goto Lb1
            r1.c()
            if (r3 == 0) goto Lab
            if (r9 <= r8) goto Lab
            r1.b()
        Lab:
            boolean r6 = r1.f(r4)
            if (r6 != 0) goto L38
        Lb1:
            int r3 = r1.f10231f
            java.util.ArrayList r6 = r1.f10228c
            if (r3 != 0) goto Ldc
            int r3 = r6.size()
            r6 = r5
        Lbc:
            if (r6 >= r3) goto Ld8
            java.util.ArrayList r8 = r1.f10228c
            java.lang.Object r8 = r8.get(r6)
            p4.h r8 = (p4.h) r8
            p4.j r9 = r8.f10114b
            r10 = r4[r6]
            if (r9 == r10) goto Ld5
            java.util.ArrayList r9 = r1.f10228c
            p4.h r8 = r8.i(r10)
            r9.set(r6, r8)
        Ld5:
            int r6 = r6 + 1
            goto Lbc
        Ld8:
            r18 = r2
            goto L1eb
        Ldc:
            int r3 = r6.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r8 = r3 * 2
            r6.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r5
        Led:
            if (r9 >= r3) goto L1e7
            java.util.ArrayList r10 = r1.f10228c
            java.lang.Object r10 = r10.get(r9)
            p4.h r10 = (p4.h) r10
            p4.j r11 = r10.f10114b
            u4.t r12 = r10.f10115c
            u4.p r13 = r10.f10116d
            r14 = r4[r9]
            if (r14 == 0) goto L10d
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r9
            r3 = 0
            r4 = 0
            goto L199
        L10d:
            p4.j r14 = r1.d(r10)
            f8.i r15 = r14.f10121d
            java.util.BitSet r15 = r15.m(r10)
            boolean r7 = r15.get(r5)
            r18 = r2
            boolean r2 = r11.f10122e
            if (r2 == 0) goto L124
            r15.set(r5)
        L124:
            java.lang.Object[] r5 = r13.f22543h
            int r5 = r5.length
            int r19 = r15.cardinality()
            int r5 = r5 - r19
            if (r5 != 0) goto L139
            u4.p r5 = u4.p.f13403i
            r19 = r3
            r20 = r4
            r21 = r9
            r4 = 0
            goto L168
        L139:
            r19 = r3
            u4.p r3 = new u4.p
            r3.<init>(r5)
            r20 = r4
            r21 = r9
            r4 = 0
            r5 = 0
        L146:
            java.lang.Object[] r9 = r13.f22543h
            int r9 = r9.length
            if (r5 >= r9) goto L15d
            boolean r9 = r15.get(r5)
            if (r9 != 0) goto L15a
            java.lang.Object r9 = r13.l(r5)
            r3.m(r4, r9)
            int r4 = r4 + 1
        L15a:
            int r5 = r5 + 1
            goto L146
        L15d:
            boolean r4 = r13.f22555g
            if (r4 != 0) goto L166
            r4 = 0
            r3.f22555g = r4
        L164:
            r5 = r3
            goto L168
        L166:
            r4 = 0
            goto L164
        L168:
            if (r2 == 0) goto L16d
            r15.set(r4, r7)
        L16d:
            java.lang.Object[] r3 = r5.f22543h
            int r3 = r3.length
            if (r3 != 0) goto L174
            r3 = 0
            goto L179
        L174:
            p4.m r3 = new p4.m
            r3.<init>(r12, r5)
        L179:
            if (r2 == 0) goto L190
            boolean r5 = r15.get(r4)
            if (r5 != 0) goto L190
            java.lang.Object r5 = r13.l(r4)
            u4.o r5 = (u4.o) r5
            u4.o r7 = r5.o(r4)
            p4.z r4 = p4.h.h(r12, r5, r7)
            goto L191
        L190:
            r4 = 0
        L191:
            u4.p r2 = r13.r(r2, r15)
            p4.h r10 = r10.k(r2)
        L199:
            boolean r2 = r10 instanceof p4.f
            if (r2 == 0) goto L1a8
            r2 = r10
            p4.f r2 = (p4.f) r2
            boolean r5 = r2.f10109e
            if (r5 == 0) goto L1a8
            r8.add(r2)
            goto L1dc
        L1a8:
            if (r3 == 0) goto L1ad
            r6.add(r3)
        L1ad:
            boolean r2 = r10 instanceof p4.c0
            if (r2 != 0) goto L1ce
            int r2 = r8.size()
            if (r2 <= 0) goto L1ce
            java.util.Iterator r2 = r8.iterator()
        L1bb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1cb
            java.lang.Object r3 = r2.next()
            p4.f r3 = (p4.f) r3
            r6.add(r3)
            goto L1bb
        L1cb:
            r8.clear()
        L1ce:
            if (r14 == r11) goto L1d4
            p4.h r10 = r10.i(r14)
        L1d4:
            r6.add(r10)
            if (r4 == 0) goto L1dc
            r6.add(r4)
        L1dc:
            int r9 = r21 + 1
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            goto Led
        L1e7:
            r18 = r2
            r1.f10228c = r6
        L1eb:
            java.util.ArrayList r2 = r1.f10228c
            int r2 = r2.size()
            r3 = 0
            r4 = 0
        L1f3:
            java.util.ArrayList r5 = r1.f10228c
            if (r3 >= r2) goto L212
            java.lang.Object r5 = r5.get(r3)
            p4.h r5 = (p4.h) r5
            if (r4 < 0) goto L209
            r5.f10113a = r4
            int r5 = r5.b()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L1f3
        L209:
            r5.getClass()
            java.lang.String r1 = "address < 0"
            j8.o.t(r1)
            return
        L212:
            int r2 = r5.size()
            r3 = 0
            r4 = 0
        L218:
            if (r4 >= r2) goto L28a
            java.util.ArrayList r5 = r1.f10228c
            java.lang.Object r5 = r5.get(r4)
            p4.h r5 = (p4.h) r5
            boolean r6 = r5 instanceof p4.b0
            if (r6 != 0) goto L227
            goto L27b
        L227:
            p4.j r6 = r5.f10114b
            r7 = r5
            p4.b0 r7 = (p4.b0) r7
            f8.i r8 = r6.f10121d
            boolean r8 = r8.f(r7)
            if (r8 == 0) goto L235
            goto L27b
        L235:
            int r3 = r6.f10119b
            r8 = 40
            if (r3 != r8) goto L251
            p4.j r3 = r1.e(r5, r6)
            if (r3 == 0) goto L24b
            java.util.ArrayList r6 = r1.f10228c
            p4.h r3 = r5.i(r3)
            r6.set(r4, r3)
            goto L279
        L24b:
            java.lang.String r1 = "method too long"
            j8.o.w(r1)
            return
        L251:
            java.util.ArrayList r3 = r1.f10228c     // Catch: java.lang.ClassCastException -> L27e java.lang.IndexOutOfBoundsException -> L284
            int r5 = r4 + 1
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.ClassCastException -> L27e java.lang.IndexOutOfBoundsException -> L284
            p4.f r3 = (p4.f) r3     // Catch: java.lang.ClassCastException -> L27e java.lang.IndexOutOfBoundsException -> L284
            p4.b0 r6 = new p4.b0
            p4.j r8 = p4.k.I
            u4.t r9 = r7.f10115c
            u4.p r10 = u4.p.f13403i
            p4.f r11 = r7.f10103f
            r6.<init>(r8, r9, r10, r11)
            java.util.ArrayList r8 = r1.f10228c
            r8.set(r4, r6)
            java.util.ArrayList r6 = r1.f10228c
            p4.b0 r3 = r7.o(r3)
            r6.add(r4, r3)
            int r2 = r2 + 1
            r4 = r5
        L279:
            r3 = r16
        L27b:
            int r4 = r4 + 1
            goto L218
        L27e:
            java.lang.String r1 = "unpaired TargetInsn"
            j8.o.A(r1)
            return
        L284:
            java.lang.String r1 = "unpaired TargetInsn (dangling)"
            j8.o.A(r1)
            return
        L28a:
            if (r3 != 0) goto L1eb
            java.util.ArrayList r2 = r1.f10228c
            int r3 = r1.f10231f
            int r3 = r3 + r18
            int r1 = r1.f10232g
            int r3 = r3 + r1
            int r1 = r2.size()
            p4.i r4 = new p4.i
            r4.<init>(r1, r3)
            r3 = 0
        L29f:
            if (r3 >= r1) goto L2ad
            java.lang.Object r5 = r2.get(r3)
            p4.h r5 = (p4.h) r5
            r4.m(r3, r5)
            int r3 = r3 + 1
            goto L29f
        L2ad:
            r3 = 0
            r4.f22555g = r3
            r0.f6413m = r4
            int r1 = r0.f6407g
            p4.w r2 = p4.w.f10236i
            r2 = 3
            r3 = r16
            if (r1 == r3) goto L31a
            r3 = 2
            if (r1 == r3) goto L2c7
            if (r1 != r2) goto L2c1
            goto L2c7
        L2c1:
            java.lang.String r1 = "bogus howMuch"
            j8.o.t(r1)
            return
        L2c7:
            u4.t r3 = u4.t.f13515d
            java.lang.Object[] r5 = r4.f22543h
            int r5 = r5.length
            p4.v[] r6 = new p4.v[r5]
            r10 = r3
            r7 = 0
            r8 = 0
            r9 = 0
        L2d2:
            if (r8 >= r5) goto L306
            java.lang.Object r11 = r4.l(r8)
            p4.h r11 = (p4.h) r11
            boolean r12 = r11 instanceof p4.f
            if (r12 == 0) goto L2e0
            r7 = 1
            goto L303
        L2e0:
            u4.t r12 = r11.f10115c
            boolean r13 = r12.equals(r3)
            if (r13 != 0) goto L303
            int r13 = r12.f13518c
            int r14 = r10.f13518c
            if (r13 != r14) goto L2ef
            goto L303
        L2ef:
            if (r1 != r2) goto L2f4
            if (r7 != 0) goto L2f4
            goto L303
        L2f4:
            p4.v r7 = new p4.v
            int r10 = r11.e()
            r7.<init>(r10, r12)
            r6[r9] = r7
            int r9 = r9 + 1
            r10 = r12
            r7 = 0
        L303:
            int r8 = r8 + 1
            goto L2d2
        L306:
            p4.w r1 = new p4.w
            r1.<init>(r9)
            r3 = 0
        L30c:
            if (r3 >= r9) goto L316
            r4 = r6[r3]
            r1.m(r3, r4)
            int r3 = r3 + 1
            goto L30c
        L316:
            r3 = 0
            r1.f22555g = r3
            goto L31c
        L31a:
            p4.w r1 = p4.w.f10236i
        L31c:
            r0.f6411k = r1
            java.lang.Object r1 = r0.f6413m
            p4.i r1 = (p4.i) r1
            p4.o r3 = p4.o.f10219i
            java.lang.Object[] r3 = r1.f22543h
            int r3 = r3.length
            f1.h r4 = new f1.h
            r4.<init>(r3)
            r5 = 0
        L32d:
            r6 = -1
            java.lang.Object r7 = r4.f3058i
            if (r5 >= r3) goto L414
            java.lang.Object r8 = r1.l(r5)
            p4.h r8 = (p4.h) r8
            boolean r9 = r8 instanceof p4.p
            if (r9 != 0) goto L40e
            boolean r9 = r8 instanceof p4.q
            if (r9 == 0) goto L409
            int r8 = r8.e()
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r9 = 0
            int r10 = r9.f13400g
            u4.o r11 = f1.h.n(r9)
            r4.e(r8, r10)
            java.lang.Object r9 = r4.f3059j
            u4.q r9 = (u4.q) r9
            u4.o r9 = r9.l(r10)
            boolean r12 = r11.i(r9)
            if (r12 == 0) goto L360
            goto L409
        L360:
            java.lang.Object r12 = r4.f3059j
            u4.q r12 = (u4.q) r12
            u4.o[] r12 = r12.f13404h
            int r13 = r12.length
            r14 = 0
        L368:
            if (r14 >= r13) goto L379
            r15 = r12[r14]
            if (r15 != 0) goto L36f
            goto L376
        L36f:
            boolean r18 = r11.l(r15)
            if (r18 == 0) goto L376
            goto L37a
        L376:
            int r14 = r14 + 1
            goto L368
        L379:
            r15 = 0
        L37a:
            if (r15 == 0) goto L380
            r12 = 4
            r4.k(r8, r12, r15)
        L380:
            java.lang.Object r12 = r4.f3060k
            int[] r12 = (int[]) r12
            r12 = r12[r10]
            if (r9 == 0) goto L38c
            r4.j(r8, r2, r9)
            goto L3ca
        L38c:
            if (r12 < 0) goto L3ca
            java.lang.Object r9 = r7.get(r12)
            p4.n r9 = (p4.n) r9
            int r13 = r9.f10215g
            u4.o r14 = r9.f10217i
            if (r13 != r8) goto L3ca
            boolean r13 = r14.i(r11)
            if (r13 == 0) goto L3ba
            r13 = 0
            r7.set(r12, r13)
            int r7 = r4.f3057h
            r16 = 1
            int r7 = r7 + 1
            r4.f3057h = r7
            java.lang.Object r7 = r4.f3059j
            u4.q r7 = (u4.q) r7
            r7.m(r11)
            java.lang.Object r7 = r4.f3060k
            int[] r7 = (int[]) r7
            r7[r10] = r6
            goto L409
        L3ba:
            int r6 = r9.f10216h
            if (r2 != r6) goto L3bf
            goto L3c7
        L3bf:
            p4.n r6 = new p4.n
            int r9 = r9.f10215g
            r6.<init>(r9, r2, r14)
            r9 = r6
        L3c7:
            r7.set(r12, r9)
        L3ca:
            if (r10 <= 0) goto L3e8
            java.lang.Object r6 = r4.f3059j
            u4.q r6 = (u4.q) r6
            int r7 = r10 + (-1)
            u4.o r6 = r6.l(r7)
            if (r6 == 0) goto L3e8
            w4.d r7 = r6.f13401h
            w4.c r7 = r7.getType()
            boolean r7 = r7.r()
            if (r7 == 0) goto L3e8
            r7 = 6
            r4.k(r8, r7, r6)
        L3e8:
            w4.d r6 = r11.f13401h
            w4.c r6 = r6.getType()
            boolean r6 = r6.r()
            if (r6 == 0) goto L404
            java.lang.Object r6 = r4.f3059j
            u4.q r6 = (u4.q) r6
            int r10 = r10 + 1
            u4.o r6 = r6.l(r10)
            if (r6 == 0) goto L404
            r7 = 5
            r4.k(r8, r7, r6)
        L404:
            r6 = 1
            r4.j(r8, r6, r11)
            goto L40a
        L409:
            r6 = 1
        L40a:
            int r5 = r5 + 1
            goto L32d
        L40e:
            r8.e()
            r17 = 0
            throw r17
        L414:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r4.e(r1, r3)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r1 = r7.size()
            int r2 = r4.f3057h
            int r2 = r1 - r2
            if (r2 != 0) goto L42a
            p4.o r1 = p4.o.f10219i
            goto L461
        L42a:
            p4.n[] r3 = new p4.n[r2]
            if (r1 != r2) goto L432
            r7.toArray(r3)
            goto L44b
        L432:
            java.util.Iterator r1 = r7.iterator()
            r4 = 0
        L437:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L44b
            java.lang.Object r5 = r1.next()
            p4.n r5 = (p4.n) r5
            if (r5 == 0) goto L437
            int r7 = r4 + 1
            r3[r4] = r5
            r4 = r7
            goto L437
        L44b:
            java.util.Arrays.sort(r3)
            p4.o r1 = new p4.o
            r1.<init>(r2)
            r4 = 0
        L454:
            if (r4 >= r2) goto L45e
            r5 = r3[r4]
            r1.m(r4, r5)
            int r4 = r4 + 1
            goto L454
        L45e:
            r4 = 0
            r1.f22555g = r4
        L461:
            r0.f6412l = r1
            java.lang.Object r1 = r0.f6409i
            b5.c r1 = (b5.c) r1
            java.lang.Object r2 = r1.f469a
            f1.h r2 = (f1.h) r2
            java.lang.Object r3 = r1.f470b
            int[] r3 = (int[]) r3
            java.lang.Object r1 = r1.f471c
            b5.c r1 = (b5.c) r1
            int r4 = r3.length
            java.lang.Object r2 = r2.f3058i
            u4.c r2 = (u4.c) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            p4.c r7 = p4.c.f10104i
            r8 = r7
            r7 = 0
            r9 = 0
            r10 = 0
        L483:
            if (r7 >= r4) goto L591
            r11 = r3[r7]
            u4.b r11 = r2.s(r11)
            h4.u r12 = r11.f13366b
            u4.i r13 = r12.p()
            u4.r r13 = r13.f13382g
            boolean r13 = r13.a()
            if (r13 != 0) goto L4a1
            r18 = r2
            r19 = r3
            r20 = r4
            goto L586
        L4a1:
            z4.g r13 = r11.f13367c
            int r14 = r13.f22552i
            int r15 = r11.f13368d
            u4.i r12 = r12.p()
            w4.e r12 = r12.e()
            int r6 = r12.size()
            if (r6 != 0) goto L4bf
            p4.c r6 = p4.c.f10104i
            r18 = r2
            r19 = r3
            r20 = r4
            goto L52a
        L4bf:
            r18 = r2
            r2 = -1
            if (r15 != r2) goto L4c6
            if (r14 != r6) goto L4d3
        L4c6:
            if (r15 == r2) goto L4d9
            int r2 = r6 + 1
            if (r14 != r2) goto L4d3
            int r2 = r13.n(r6)
            if (r15 != r2) goto L4d3
            goto L4d9
        L4d3:
            java.lang.String r1 = "shouldn't happen: weird successors list"
            bsh.j.g(r1)
            return
        L4d9:
            r2 = 0
        L4da:
            if (r2 >= r6) goto L4ee
            w4.c r14 = r12.getType(r2)
            w4.c r15 = w4.c.E
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L4eb
            int r6 = r2 + 1
            goto L4ee
        L4eb:
            int r2 = r2 + 1
            goto L4da
        L4ee:
            p4.c r2 = new p4.c
            r2.<init>(r6)
            r14 = 0
        L4f4:
            if (r14 >= r6) goto L522
            v4.d0 r15 = new v4.d0
            r19 = r3
            w4.c r3 = r12.getType(r14)
            r15.<init>(r3)
            int r3 = r13.n(r14)
            r20 = r3
            java.lang.Object r3 = r1.f469a
            p4.f[] r3 = (p4.f[]) r3
            r3 = r3[r20]
            int r3 = r3.e()
            r20 = r4
            p4.b r4 = new p4.b
            r4.<init>(r15, r3)
            r2.m(r14, r4)
            int r14 = r14 + 1
            r3 = r19
            r4 = r20
            goto L4f4
        L522:
            r19 = r3
            r20 = r4
            r3 = 0
            r2.f22555g = r3
            r6 = r2
        L52a:
            java.lang.Object[] r2 = r8.f22543h
            int r2 = r2.length
            if (r2 != 0) goto L530
            goto L583
        L530:
            boolean r2 = r8.equals(r6)
            if (r2 == 0) goto L55e
            if (r9 == 0) goto L558
            java.lang.Object r2 = r1.f470b
            p4.f[] r2 = (p4.f[]) r2
            int r3 = r9.f13365a
            r2 = r2[r3]
            int r2 = r2.e()
            java.lang.Object r3 = r1.f471c
            p4.f[] r3 = (p4.f[]) r3
            int r4 = r11.f13365a
            r3 = r3[r4]
            int r3 = r3.e()
            int r3 = r3 - r2
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r2) goto L55e
            r10 = r11
            goto L586
        L558:
            java.lang.String r1 = "start == null"
            bsh.j.c(r1)
            return
        L55e:
            java.lang.Object[] r2 = r8.f22543h
            int r2 = r2.length
            if (r2 == 0) goto L583
            java.lang.Object r2 = r1.f470b
            p4.f[] r2 = (p4.f[]) r2
            int r3 = r9.f13365a
            r2 = r2[r3]
            java.lang.Object r3 = r1.f471c
            p4.f[] r3 = (p4.f[]) r3
            int r4 = r10.f13365a
            r3 = r3[r4]
            p4.d r4 = new p4.d
            int r2 = r2.e()
            int r3 = r3.e()
            r4.<init>(r2, r3, r8)
            r5.add(r4)
        L583:
            r8 = r6
            r9 = r11
            r10 = r9
        L586:
            int r7 = r7 + 1
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = -1
            goto L483
        L591:
            java.lang.Object[] r2 = r8.f22543h
            int r2 = r2.length
            if (r2 == 0) goto L5b6
            java.lang.Object r2 = r1.f470b
            p4.f[] r2 = (p4.f[]) r2
            int r3 = r9.f13365a
            r2 = r2[r3]
            java.lang.Object r1 = r1.f471c
            p4.f[] r1 = (p4.f[]) r1
            int r3 = r10.f13365a
            r1 = r1[r3]
            p4.d r3 = new p4.d
            int r2 = r2.e()
            int r1 = r1.e()
            r3.<init>(r2, r1, r8)
            r5.add(r3)
        L5b6:
            int r1 = r5.size()
            if (r1 != 0) goto L5bf
            p4.e r1 = p4.e.f10108i
            goto L5d7
        L5bf:
            p4.e r2 = new p4.e
            r2.<init>(r1)
            r4 = 0
        L5c5:
            if (r4 >= r1) goto L5d3
            java.lang.Object r3 = r5.get(r4)
            p4.d r3 = (p4.d) r3
            r2.m(r4, r3)
            int r4 = r4 + 1
            goto L5c5
        L5d3:
            r3 = 0
            r2.f22555g = r3
            r1 = r2
        L5d7:
            r0.f6410j = r1
            r9 = 0
            r0.f6408h = r9
            r0.f6409i = r9
            return
        L5df:
            java.lang.String r1 = "already processed"
            j8.o.w(r1)
            return
    }

    public void k(int r2, int r3, boolean r4) {
            r1 = this;
            java.lang.Object r0 = r1.f6410j
            int[] r0 = (int[]) r0
            x6.d.g0(r0, r2)
            if (r4 == 0) goto Lf
            int r2 = r2 + r3
            r3 = 0
            r1.e(r2, r3)
            return
        Lf:
            java.lang.Object r4 = r1.f6411k
            int[] r4 = (int[]) r4
            int r2 = r2 + r3
            x6.d.g0(r4, r2)
            return
    }

    public void l(int r13, int r14, boolean r15) {
            r12 = this;
            int r14 = r14 + r13
            r0 = 1
            if (r15 == 0) goto L7
            r12.e(r14, r0)
        L7:
            java.lang.Object r1 = r12.f6408h
            i4.m r1 = (i4.m) r1
            h4.c r1 = r1.f6469c
            i4.g r1 = r1.f5077e
            java.lang.Object[] r2 = r1.f22543h
            int r2 = r2.length
            i4.f[] r3 = new i4.f[r2]
            r4 = 0
            r5 = r4
            r6 = r5
        L17:
            if (r5 >= r2) goto L4b
            java.lang.Object r7 = r1.l(r5)
            i4.f r7 = (i4.f) r7
            int r8 = r7.f6454a
            if (r13 < r8) goto L48
            int r8 = r7.f6455b
            if (r13 >= r8) goto L48
            v4.d0 r8 = r7.f6457d
            if (r8 == 0) goto L2c
            goto L2e
        L2c:
            v4.d0 r8 = v4.d0.f14071j
        L2e:
            r9 = r4
        L2f:
            if (r9 >= r6) goto L44
            r10 = r3[r9]
            v4.d0 r10 = r10.f6457d
            if (r10 == 0) goto L38
            goto L3a
        L38:
            v4.d0 r10 = v4.d0.f14071j
        L3a:
            if (r10 == r8) goto L48
            v4.d0 r11 = v4.d0.f14071j
            if (r10 != r11) goto L41
            goto L48
        L41:
            int r9 = r9 + 1
            goto L2f
        L44:
            r3[r6] = r7
            int r6 = r6 + 1
        L48:
            int r5 = r5 + 1
            goto L17
        L4b:
            if (r6 != 0) goto L50
            i4.g r1 = i4.g.f6458i
            goto L6a
        L50:
            i4.g r1 = new i4.g
            r1.<init>(r6)
            r2 = r4
        L56:
            if (r2 >= r6) goto L68
            r5 = r3[r2]
            if (r5 == 0) goto L62
            r1.m(r2, r5)
            int r2 = r2 + 1
            goto L56
        L62:
            java.lang.String r13 = "item == null"
            bsh.j.c(r13)
            return
        L68:
            r1.f22555g = r4
        L6a:
            java.lang.Object r2 = r12.f6413m
            i4.g[] r2 = (i4.g[]) r2
            r2[r13] = r1
            java.lang.Object r2 = r12.f6412l
            z4.g[] r2 = (z4.g[]) r2
            r3 = -1
            if (r15 == 0) goto L78
            goto L79
        L78:
            r14 = r3
        L79:
            r1.getClass()
            if (r14 < r3) goto Lb4
            if (r14 < 0) goto L81
            goto L82
        L81:
            r0 = r4
        L82:
            java.lang.Object[] r15 = r1.f22543h
            int r15 = r15.length
            if (r15 != 0) goto L91
            if (r0 == 0) goto L8e
            z4.g r14 = z4.g.o(r14)
            goto Lb1
        L8e:
            z4.g r14 = z4.g.f22550k
            goto Lb1
        L91:
            z4.g r3 = new z4.g
            int r5 = r15 + r0
            r3.<init>(r5)
            r5 = r4
        L99:
            if (r5 >= r15) goto La9
            java.lang.Object r6 = r1.l(r5)
            i4.f r6 = (i4.f) r6
            int r6 = r6.f6456c
            r3.l(r6)
            int r5 = r5 + 1
            goto L99
        La9:
            if (r0 == 0) goto Lae
            r3.l(r14)
        Lae:
            r3.f22555g = r4
            r14 = r3
        Lb1:
            r2[r13] = r14
            return
        Lb4:
            java.lang.String r13 = "noException < -1"
            j8.o.t(r13)
            return
    }
}
