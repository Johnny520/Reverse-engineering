package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.w f11450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.o f11451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4.d f11452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r4.p f11453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4.a f11456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z4.d f11460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f11461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p4.n[] f11463n;

    public n(p4.w r2, p4.o r3, r4.p r4, int r5, int r6, boolean r7, v4.y r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11458i = r0
            r0 = 1
            r1.f11459j = r0
            r1.f11450a = r2
            r1.f11451b = r3
            r1.f11453d = r4
            w4.a r2 = r8.f14090i
            r1.f11456g = r2
            r1.f11457h = r7
            r1.f11454e = r5
            r1.f11455f = r6
            z4.d r2 = new z4.d
            r2.<init>()
            r1.f11452c = r2
            p4.n[] r2 = new p4.n[r6]
            r1.f11463n = r2
            return
    }

    public static int b(int r2, int r3) {
            r0 = -4
            if (r2 < r0) goto Lf
            r1 = 10
            if (r2 > r1) goto Lf
            int r2 = r2 - r0
            r0 = 15
            int r2 = p.a.g(r3, r0, r2, r1)
            return r2
        Lf:
            java.lang.String r2 = "Parameter out of range"
            bsh.j.g(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String j(p4.n r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "v"
            r0.<init>(r1)
            u4.o r1 = r4.f10217i
            int r2 = r1.f13400g
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            u4.k r1 = r1.f13402i
            v4.c0 r1 = r1.f13393g
            java.lang.String r3 = "null"
            if (r1 != 0) goto L1f
            r0.append(r3)
            goto L26
        L1f:
            java.lang.String r1 = r1.a()
            r0.append(r1)
        L26:
            r0.append(r2)
            v4.d0 r1 = r4.f10218j
            if (r1 != 0) goto L31
            r0.append(r3)
            goto L3a
        L31:
            w4.c r1 = r1.f14088g
            java.lang.String r1 = r1.a()
            r0.append(r1)
        L3a:
            v4.c0 r4 = r4.b()
            if (r4 == 0) goto L4a
            r0.append(r2)
            java.lang.String r4 = r4.a()
            r0.append(r4)
        L4a:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public final void a(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = r2.f11461l
            if (r0 == 0) goto Lf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f11461l
            java.lang.String r4 = eh.a.r(r0, r1, r4)
        Lf:
            z4.d r0 = r2.f11460k
            if (r0 == 0) goto L1c
            boolean r1 = r2.f11462m
            if (r1 == 0) goto L18
            goto L19
        L18:
            r3 = 0
        L19:
            r0.b(r3, r4)
        L1c:
            return
    }

    public final byte[] c() {
            r18 = this;
            r0 = r18
            r1 = 0
            p4.w r2 = r0.f11450a
            if (r2 != 0) goto L9
            r3 = r1
            goto Lc
        L9:
            java.lang.Object[] r3 = r2.f22543h
            int r3 = r3.length
        Lc:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = r1
        L12:
            if (r5 >= r3) goto L20
            java.lang.Object r6 = r2.l(r5)
            p4.v r6 = (p4.v) r6
            r4.add(r6)
            int r5 = r5 + 1
            goto L12
        L20:
            r4.m r2 = new r4.m
            r3 = 0
            r2.<init>(r3)
            java.util.Collections.sort(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            w4.a r3 = r0.f11456g
            w4.b r5 = r3.f14845i
            java.lang.Object[] r5 = r5.f22543h
            int r5 = r5.length
            r2.<init>(r5)
            w4.b r5 = r3.f14845i
            int r5 = r5.o()
            int r6 = r0.f11455f
            int r5 = r6 - r5
            boolean r7 = r0.f11457h
            r8 = r7 ^ 1
            int r5 = r5 - r8
            java.util.BitSet r8 = new java.util.BitSet
            int r9 = r6 - r5
            r8.<init>(r9)
            p4.o r9 = r0.f11451b
            java.lang.Object[] r10 = r9.f22543h
            int r10 = r10.length
            r11 = r1
        L51:
            if (r11 >= r10) goto L71
            java.lang.Object r12 = r9.l(r11)
            p4.n r12 = (p4.n) r12
            u4.o r13 = r12.f10217i
            int r13 = r13.f13400g
            if (r13 >= r5) goto L60
            goto L6e
        L60:
            int r13 = r13 - r5
            boolean r14 = r8.get(r13)
            if (r14 == 0) goto L68
            goto L6e
        L68:
            r8.set(r13)
            r2.add(r12)
        L6e:
            int r11 = r11 + 1
            goto L51
        L71:
            r4.m r5 = new r4.m
            r8 = 1
            r5.<init>(r8)
            java.util.Collections.sort(r2, r5)
            z4.d r5 = r0.f11460k
            if (r5 != 0) goto L80
            r5 = r1
            goto L81
        L80:
            r5 = 1
        L81:
            z4.d r10 = r0.f11452c
            int r11 = r10.f22538c
            int r12 = r4.size()
            if (r12 <= 0) goto L97
            java.lang.Object r12 = r4.get(r1)
            p4.v r12 = (p4.v) r12
            u4.t r12 = r12.f10235b
            int r12 = r12.f13518c
            r0.f11459j = r12
        L97:
            int r12 = r0.f11459j
            r10.n(r12)
            if (r5 == 0) goto Lb4
            int r12 = r10.f22538c
            int r12 = r12 - r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "line_start: "
            r11.<init>(r13)
            int r13 = r0.f11459j
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            r0.a(r12, r11)
        Lb4:
            w4.b r11 = r3.f14845i
            int r11 = r11.o()
            int r6 = r6 - r11
            r11 = r7 ^ 1
            int r6 = r6 - r11
            w4.b r3 = r3.f14845i
            java.lang.Object[] r11 = r3.f22543h
            int r11 = r11.length
            p4.n[] r12 = r0.f11463n
            if (r7 != 0) goto Le1
            java.util.Iterator r7 = r2.iterator()
        Lcb:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto Ldf
            java.lang.Object r13 = r7.next()
            p4.n r13 = (p4.n) r13
            u4.o r14 = r13.f10217i
            int r14 = r14.f13400g
            if (r6 != r14) goto Lcb
            r12[r6] = r13
        Ldf:
            int r6 = r6 + 1
        Le1:
            int r7 = r10.f22538c
            r10.n(r11)
            if (r5 == 0) goto Lfc
            int r13 = r10.f22538c
            int r13 = r13 - r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r14 = "parameters_size: %04x"
            java.lang.String r7 = java.lang.String.format(r14, r7)
            r0.a(r13, r7)
        Lfc:
            r7 = r1
        Lfd:
            if (r7 >= r11) goto L17c
            java.lang.Object r13 = r3.l(r7)
            w4.c r13 = (w4.c) r13
            int r14 = r10.f22538c
            java.util.Iterator r15 = r2.iterator()
        L10b:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L138
            java.lang.Object r16 = r15.next()
            r8 = r16
            p4.n r8 = (p4.n) r8
            u4.o r1 = r8.f10217i
            int r1 = r1.f13400g
            if (r6 != r1) goto L136
            v4.c0 r1 = r8.b()
            if (r1 == 0) goto L12a
            r1 = 0
            r0.h(r1)
            goto L133
        L12a:
            u4.o r1 = r8.f10217i
            u4.k r1 = r1.f13402i
            v4.c0 r1 = r1.f13393g
            r0.h(r1)
        L133:
            r12[r6] = r8
            goto L139
        L136:
            r1 = 0
            goto L10b
        L138:
            r8 = 0
        L139:
            if (r8 != 0) goto L13f
            r1 = 0
            r0.h(r1)
        L13f:
            if (r5 == 0) goto L173
            if (r8 == 0) goto L155
            v4.c0 r1 = r8.b()
            if (r1 == 0) goto L14a
            goto L155
        L14a:
            u4.o r1 = r8.f10217i
            u4.k r1 = r1.f13402i
            v4.c0 r1 = r1.f13393g
            java.lang.String r1 = r1.a()
            goto L157
        L155:
            java.lang.String r1 = "<unnamed>"
        L157:
            int r8 = r10.f22538c
            int r8 = r8 - r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "parameter "
            r14.<init>(r15)
            r14.append(r1)
            java.lang.String r1 = " v"
            r14.append(r1)
            r14.append(r6)
            java.lang.String r1 = r14.toString()
            r0.a(r8, r1)
        L173:
            int r1 = r13.i()
            int r6 = r6 + r1
            int r7 = r7 + 1
            r1 = 0
            goto Lfd
        L17c:
            int r1 = r12.length
            r2 = 0
        L17e:
            if (r2 >= r1) goto L191
            r3 = r12[r2]
            if (r3 != 0) goto L185
            goto L18e
        L185:
            v4.c0 r5 = r3.b()
            if (r5 == 0) goto L18e
            r0.f(r3)
        L18e:
            int r2 = r2 + 1
            goto L17e
        L191:
            r1 = 7
            r10.j(r1)
            z4.d r1 = r0.f11460k
            if (r1 != 0) goto L19a
            goto L1ae
        L19a:
            int r1 = r0.f11458i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%04x: prologue end"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 1
            r0.a(r2, r1)
        L1ae:
            int r1 = r4.size()
            java.lang.Object[] r2 = r9.f22543h
            int r2 = r2.length
            r3 = 0
            r5 = 0
        L1b7:
            java.lang.Object[] r6 = r9.f22543h
            int r6 = r6.length
        L1ba:
            if (r3 >= r6) goto L2a5
            java.lang.Object r7 = r9.l(r3)
            p4.n r7 = (p4.n) r7
            int r7 = r7.f10215g
            int r8 = r0.f11458i
            if (r7 != r8) goto L2a5
            int r7 = r3 + 1
            java.lang.Object r3 = r9.l(r3)
            p4.n r3 = (p4.n) r3
            u4.o r8 = r3.f10217i
            int r11 = r8.f13400g
            r13 = r12[r11]
            if (r3 != r13) goto L1da
            goto L2a2
        L1da:
            r12[r11] = r3
            int r14 = r3.f10216h
            r15 = 1
            if (r14 != r15) goto L277
            if (r13 == 0) goto L221
            u4.o r14 = r13.f10217i
            boolean r14 = r8.i(r14)
            if (r14 == 0) goto L221
            int r8 = r13.f10216h
            if (r8 == r15) goto L21a
            int r8 = r10.f22538c
            r13 = 6
            r10.j(r13)
            r0.i(r11)
            z4.d r11 = r0.f11460k
            if (r11 != 0) goto L1fe
            goto L2a2
        L1fe:
            int r11 = r10.f22538c
            int r11 = r11 - r8
            int r8 = r0.f11458i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r3 = j(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r3}
            java.lang.String r8 = "%04x: +local restart %s"
            java.lang.String r3 = java.lang.String.format(r8, r3)
            r0.a(r11, r3)
            goto L2a2
        L21a:
            java.lang.String r1 = "shouldn't happen"
            bsh.j.g(r1)
            r1 = 0
            return r1
        L221:
            v4.c0 r13 = r3.b()
            if (r13 == 0) goto L22c
            r0.f(r3)
            goto L2a2
        L22c:
            int r13 = r10.f22538c
            r14 = 3
            r10.j(r14)
            r0.i(r11)
            u4.k r8 = r8.f13402i
            v4.c0 r8 = r8.f13393g
            r0.h(r8)
            v4.d0 r8 = r3.f10218j
            if (r8 == 0) goto L244
            r4.p r11 = r0.f11453d
            if (r11 != 0) goto L246
        L244:
            r8 = 0
            goto L254
        L246:
            r4.h0 r11 = r11.f11482g
            int r8 = r11.m(r8)
            r17 = 1
            int r8 = r8 + 1
            r10.n(r8)
            goto L257
        L254:
            r10.n(r8)
        L257:
            z4.d r8 = r0.f11460k
            if (r8 != 0) goto L25c
            goto L2a2
        L25c:
            int r8 = r10.f22538c
            int r8 = r8 - r13
            int r11 = r0.f11458i
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r3 = j(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r11, r3}
            java.lang.String r11 = "%04x: +local %s"
            java.lang.String r3 = java.lang.String.format(r11, r3)
            r0.a(r8, r3)
            goto L2a2
        L277:
            r8 = 3
            if (r14 == r8) goto L2a2
            int r8 = r10.f22538c
            r13 = 5
            r10.j(r13)
            r10.n(r11)
            z4.d r11 = r0.f11460k
            if (r11 != 0) goto L288
            goto L2a2
        L288:
            int r11 = r10.f22538c
            int r11 = r11 - r8
            int r8 = r0.f11458i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r3 = j(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r3}
            java.lang.String r8 = "%04x: -local %s"
            java.lang.String r3 = java.lang.String.format(r8, r3)
            r0.a(r11, r3)
        L2a2:
            r3 = r7
            goto L1ba
        L2a5:
            int r6 = r4.size()
        L2a9:
            if (r5 >= r6) goto L2c4
            java.lang.Object r7 = r4.get(r5)
            p4.v r7 = (p4.v) r7
            int r7 = r7.f10234a
            int r8 = r0.f11458i
            if (r7 != r8) goto L2c4
            int r7 = r5 + 1
            java.lang.Object r5 = r4.get(r5)
            p4.v r5 = (p4.v) r5
            r0.g(r5)
            r5 = r7
            goto L2a9
        L2c4:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r2) goto L2d2
            java.lang.Object r7 = r9.l(r3)
            p4.n r7 = (p4.n) r7
            int r7 = r7.f10215g
            goto L2d3
        L2d2:
            r7 = r6
        L2d3:
            if (r5 >= r1) goto L2de
            java.lang.Object r8 = r4.get(r5)
            p4.v r8 = (p4.v) r8
            int r8 = r8.f10234a
            goto L2df
        L2de:
            r8 = r6
        L2df:
            int r11 = java.lang.Math.min(r8, r7)
            if (r11 != r6) goto L2e7
        L2e5:
            r6 = 0
            goto L2f0
        L2e7:
            int r13 = r0.f11454e
            if (r11 != r13) goto L303
            if (r7 != r6) goto L303
            if (r8 != r6) goto L303
            goto L2e5
        L2f0:
            r10.j(r6)
            z4.d r1 = r0.f11460k
            if (r1 != 0) goto L2f8
            goto L2fe
        L2f8:
            java.lang.String r1 = "end sequence"
            r15 = 1
            r0.a(r15, r1)
        L2fe:
            byte[] r1 = r10.h()
            return r1
        L303:
            r6 = 0
            r15 = 1
            if (r11 != r8) goto L315
            int r7 = r5 + 1
            java.lang.Object r5 = r4.get(r5)
            p4.v r5 = (p4.v) r5
            r0.g(r5)
            r5 = r7
            goto L1b7
        L315:
            int r7 = r0.f11458i
            int r11 = r11 - r7
            r0.e(r11)
            goto L1b7
    }

    public final void d(int r4) {
            r3 = this;
            z4.d r0 = r3.f11452c
            int r1 = r0.f22538c
            r2 = 2
            r0.j(r2)
            r0.m(r4)
            int r2 = r3.f11459j
            int r2 = r2 + r4
            r3.f11459j = r2
            z4.d r4 = r3.f11460k
            if (r4 != 0) goto L15
            return
        L15:
            int r4 = r0.f22538c
            int r4 = r4 - r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "line = %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.a(r4, r0)
            return
    }

    public final void e(int r4) {
            r3 = this;
            z4.d r0 = r3.f11452c
            int r1 = r0.f22538c
            r2 = 1
            r0.j(r2)
            r0.n(r4)
            int r2 = r3.f11458i
            int r2 = r2 + r4
            r3.f11458i = r2
            z4.d r4 = r3.f11460k
            if (r4 != 0) goto L15
            return
        L15:
            int r4 = r0.f22538c
            int r4 = r4 - r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%04x: advance pc"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.a(r4, r0)
            return
    }

    public final void f(p4.n r5) {
            r4 = this;
            z4.d r0 = r4.f11452c
            int r1 = r0.f22538c
            r2 = 4
            r0.j(r2)
            u4.o r2 = r5.f10217i
            int r3 = r2.f13400g
            r4.i(r3)
            u4.k r2 = r2.f13402i
            v4.c0 r2 = r2.f13393g
            r4.h(r2)
            v4.d0 r2 = r5.f10218j
            if (r2 == 0) goto L2b
            r4.p r3 = r4.f11453d
            if (r3 != 0) goto L1f
            goto L2b
        L1f:
            r4.h0 r3 = r3.f11482g
            int r2 = r3.m(r2)
            int r2 = r2 + 1
            r0.n(r2)
            goto L2f
        L2b:
            r2 = 0
            r0.n(r2)
        L2f:
            v4.c0 r2 = r5.b()
            r4.h(r2)
            z4.d r2 = r4.f11460k
            if (r2 != 0) goto L3b
            return
        L3b:
            int r0 = r0.f22538c
            int r0 = r0 - r1
            int r1 = r4.f11458i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = j(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            java.lang.String r1 = "%04x: +localx %s"
            java.lang.String r5 = java.lang.String.format(r1, r5)
            r4.a(r0, r5)
            return
    }

    public final void g(p4.v r5) {
            r4 = this;
            u4.t r0 = r5.f10235b
            int r0 = r0.f13518c
            int r5 = r5.f10234a
            int r1 = r4.f11459j
            int r0 = r0 - r1
            int r1 = r4.f11458i
            int r5 = r5 - r1
            if (r5 < 0) goto L65
            r1 = -4
            r2 = 0
            if (r0 < r1) goto L16
            r1 = 10
            if (r0 <= r1) goto L1a
        L16:
            r4.d(r0)
            r0 = r2
        L1a:
            int r1 = b(r0, r5)
            r3 = r1 & (-256(0xffffffffffffff00, float:NaN))
            if (r3 <= 0) goto L37
            r4.e(r5)
            int r1 = b(r0, r2)
            r5 = r1 & (-256(0xffffffffffffff00, float:NaN))
            if (r5 <= 0) goto L36
            r4.d(r0)
            int r1 = b(r2, r2)
            r5 = r2
            goto L38
        L36:
            r5 = r2
        L37:
            r2 = r0
        L38:
            z4.d r0 = r4.f11452c
            r0.j(r1)
            int r0 = r4.f11459j
            int r0 = r0 + r2
            r4.f11459j = r0
            int r0 = r4.f11458i
            int r0 = r0 + r5
            r4.f11458i = r0
            z4.d r5 = r4.f11460k
            if (r5 != 0) goto L4c
            return
        L4c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r0 = r4.f11459j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0}
            java.lang.String r0 = "%04x: line %d"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r0 = 1
            r4.a(r0, r5)
            return
        L65:
            java.lang.String r5 = "Position entries must be in ascending address order"
            bsh.j.g(r5)
            return
    }

    public final void h(v4.c0 r3) {
            r2 = this;
            z4.d r0 = r2.f11452c
            if (r3 == 0) goto L15
            r4.p r1 = r2.f11453d
            if (r1 != 0) goto L9
            goto L15
        L9:
            r4.h0 r1 = r1.f11481f
            int r3 = r1.l(r3)
            int r3 = r3 + 1
            r0.n(r3)
            return
        L15:
            r3 = 0
            r0.n(r3)
            return
    }

    public final void i(int r2) {
            r1 = this;
            if (r2 < 0) goto L8
            z4.d r0 = r1.f11452c
            r0.n(r2)
            return
        L8:
            java.lang.String r0 = "Signed value where unsigned required: "
            java.lang.String r2 = eh.a.l(r2, r0)
            bsh.j.g(r2)
            return
    }
}
