package g4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.i f4256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f4257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g4.g f4258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g4.h f4260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f4261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f4262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u4.t f4263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f4264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w4.b f4265j;

    public b(g4.d r6) {
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f4257b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f4261f = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4262g = r1
            u4.t r1 = u4.t.f13515d
            r5.f4263h = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4264i = r1
            w4.b r1 = w4.b.f14847i
            r5.f4265j = r1
            g4.i r1 = r6.f4268a
            r5.f4256a = r1
            int r6 = r6.f4269b
            r6 = r6 & 8
            if (r6 == 0) goto L3a
            r6 = 0
            r5.f4260e = r6
            goto L46
        L3a:
            g4.j r6 = r1.f4294a
            g4.h r2 = new g4.h
            r2.<init>(r5, r6)
            r5.f4260e = r2
            r0.add(r2)
        L46:
            g4.k r6 = r1.f4297d
            g4.j[] r6 = r6.f4314a
            int r0 = r6.length
            r1 = 0
        L4c:
            if (r1 >= r0) goto L5d
            r2 = r6[r1]
            java.util.ArrayList r3 = r5.f4261f
            g4.h r4 = new g4.h
            r4.<init>(r5, r2)
            r3.add(r4)
            int r1 = r1 + 1
            goto L4c
        L5d:
            g4.g r6 = new g4.g
            r6.<init>()
            r5.f4258c = r6
            r5.b(r6)
            g4.g r6 = r5.f4258c
            r0 = 1
            r6.f4285c = r0
            return
    }

    public static void d(g4.h r3, g4.j r4) {
            g4.j r0 = r3.f4291b
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "requested "
            r1.<init>(r2)
            r1.append(r4)
            g4.j r3 = r3.f4291b
            java.lang.String r4 = " but was "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public final void a(u4.i r6, g4.g r7) {
            r5 = this;
            g4.g r0 = r5.f4258c
            if (r0 == 0) goto L85
            boolean r1 = r0.f4285c
            if (r1 == 0) goto L85
            java.util.ArrayList r0 = r0.f4283a
            r0.add(r6)
            u4.r r6 = r6.f13382g
            int r6 = r6.f13410e
            r0 = 1
            java.lang.String r1 = "unexpected branch: "
            if (r6 == r0) goto L7e
            r2 = 2
            r3 = 0
            if (r6 == r2) goto L75
            r2 = 3
            java.lang.String r4 = "branch == null"
            if (r6 == r2) goto L68
            r2 = 4
            if (r6 == r2) goto L4b
            r2 = 6
            if (r6 != r2) goto L47
            if (r7 != 0) goto L43
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList r7 = r5.f4264i
            r6.<init>(r7)
            g4.g r7 = new g4.g
            r7.<init>()
            r5.b(r7)
            g4.g r1 = r5.f4258c
            r1.f4287e = r7
            r1.f4288f = r3
            r1.f4286d = r6
            r5.f4258c = r7
            r7.f4285c = r0
            return
        L43:
            g1.d.f(r7, r1)
            return
        L47:
            j8.o.o()
            return
        L4b:
            if (r7 == 0) goto L64
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            g4.g r1 = new g4.g
            r1.<init>()
            r5.b(r1)
            g4.g r2 = r5.f4258c
            r2.f4287e = r1
            r2.f4288f = r7
            r2.f4286d = r6
            r5.f4258c = r1
            r1.f4285c = r0
            return
        L64:
            j8.o.t(r4)
            return
        L68:
            if (r7 == 0) goto L71
            g4.g r6 = r5.f4258c
            r6.f4287e = r7
            r5.f4258c = r3
            return
        L71:
            j8.o.t(r4)
            return
        L75:
            if (r7 != 0) goto L7a
            r5.f4258c = r3
            return
        L7a:
            g1.d.f(r7, r1)
            return
        L7e:
            if (r7 != 0) goto L81
            return
        L81:
            g1.d.f(r7, r1)
            return
        L85:
            java.lang.String r6 = "no current label"
            j8.o.A(r6)
            return
    }

    public final void b(g4.g r2) {
            r1 = this;
            g4.b r0 = r2.f4284b
            if (r0 != r1) goto L5
            return
        L5:
            if (r0 != 0) goto Lf
            r2.f4284b = r1
            java.util.ArrayList r0 = r1.f4257b
            r0.add(r2)
            return
        Lf:
            java.lang.String r2 = "Cannot adopt label; it belongs to another Code"
            j8.o.t(r2)
            return
    }

    public final void c(g4.h r10, g4.h r11) {
            r9 = this;
            g4.j r0 = r11.f4291b
            w4.c r1 = r0.f4312b
            boolean r1 = r1.t()
            r2 = 0
            if (r1 == 0) goto L2a
            u4.v r3 = new u4.v
            u4.r r4 = u4.s.f13444h2
            u4.o r11 = r11.a()
            u4.p r6 = u4.p.p(r11)
            g4.j r11 = r10.f4291b
            v4.d0 r8 = r11.f4313c
            u4.t r5 = r9.f4263h
            w4.b r7 = r9.f4265j
            r3.<init>(r4, r5, r6, r7, r8)
            r9.a(r3, r2)
            r11 = 1
            r9.j(r10, r11)
            return
        L2a:
            u4.m r1 = new u4.m
            w4.c r0 = r0.f4312b
            g4.j r3 = r10.f4291b
            w4.c r3 = r3.f4312b
            int r4 = r0.f14879h
            r5 = 6
            if (r4 != r5) goto L4d
            int r4 = r3.f14879h
            r5 = 2
            if (r4 == r5) goto L4a
            r5 = 3
            if (r4 == r5) goto L47
            r5 = 8
            if (r4 == r5) goto L44
            goto L4d
        L44:
            u4.r r0 = u4.s.f13498v1
            goto L51
        L47:
            u4.r r0 = u4.s.f13494u1
            goto L51
        L4a:
            u4.r r0 = u4.s.f13490t1
            goto L51
        L4d:
            u4.r r0 = u4.s.d(r3, r0)
        L51:
            u4.o r10 = r10.a()
            u4.o r11 = r11.a()
            u4.t r3 = r9.f4263h
            r1.<init>(r0, r3, r10, r11)
            r9.a(r1, r2)
            return
    }

    public final g4.h e(int r2, g4.j r3) {
            r1 = this;
            g4.h r0 = r1.f4260e
            if (r0 == 0) goto L6
            int r2 = r2 + 1
        L6:
            java.util.ArrayList r0 = r1.f4261f
            java.lang.Object r2 = r0.get(r2)
            g4.h r2 = (g4.h) r2
            d(r2, r3)
            return r2
    }

    public final void f() {
            r14 = this;
            boolean r0 = r14.f4259d
            if (r0 != 0) goto L86
            r0 = 1
            r14.f4259d = r0
            java.util.ArrayList r0 = r14.f4262g
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        Lf:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L30
            java.lang.Object r3 = r0.next()
            g4.h r3 = (g4.h) r3
            r3.f4292c = r2
            g4.j r5 = r3.f4291b
            w4.c r6 = r5.f4312b
            u4.o r4 = u4.o.k(r2, r6, r4)
            r3.f4293d = r4
            w4.c r3 = r5.f4312b
            int r3 = r3.i()
            int r2 = r2 + r3
            goto Lf
        L30:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = r14.f4261f
            java.util.Iterator r3 = r3.iterator()
            r5 = r2
        L3c:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r3.next()
            g4.h r6 = (g4.h) r6
            int r7 = r5 - r2
            v4.o r13 = v4.o.o(r7)
            r6.f4292c = r5
            g4.j r7 = r6.f4291b
            w4.c r8 = r7.f4312b
            u4.o r8 = u4.o.k(r5, r8, r4)
            r6.f4293d = r8
            w4.c r8 = r7.f4312b
            int r8 = r8.i()
            int r5 = r5 + r8
            u4.l r8 = new u4.l
            w4.c r7 = r7.f4312b
            u4.r r9 = u4.s.h(r7)
            u4.o r11 = r6.a()
            u4.p r12 = u4.p.f13403i
            u4.t r10 = r14.f4263h
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r8)
            goto L3c
        L78:
            java.util.ArrayList r2 = r14.f4257b
            java.lang.Object r2 = r2.get(r1)
            g4.g r2 = (g4.g) r2
            java.util.ArrayList r2 = r2.f4283a
            r2.addAll(r1, r0)
            return
        L86:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public final void g(u4.r r8, g4.i r9, g4.h r10, g4.h r11, g4.h... r12) {
            r7 = this;
            u4.v r0 = new u4.v
            r6 = 0
            if (r11 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = r6
        L8:
            u4.p r3 = new u4.p
            int r2 = r12.length
            int r2 = r2 + r1
            r3.<init>(r2)
            if (r11 == 0) goto L18
            u4.o r11 = r11.a()
            r3.m(r6, r11)
        L18:
            r11 = r6
        L19:
            int r2 = r12.length
            if (r11 >= r2) goto L2a
            int r2 = r11 + r1
            r4 = r12[r11]
            u4.o r4 = r4.a()
            r3.m(r2, r4)
            int r11 = r11 + 1
            goto L19
        L2a:
            w4.b r4 = r7.f4265j
            v4.y r5 = r9.f4298e
            u4.t r2 = r7.f4263h
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = 0
            r7.a(r0, r8)
            if (r10 == 0) goto L3d
            r7.j(r10, r6)
        L3d:
            return
    }

    public final void h(g4.i r9, g4.h r10, g4.h r11, g4.h... r12) {
            r8 = this;
            r0 = 1
            java.lang.String r0 = r9.a(r0)
            w4.a r0 = w4.a.d(r0)
            u4.r r1 = u4.s.f13413a
            u4.r r3 = new u4.r
            w4.b r0 = r0.c()
            w4.b r1 = w4.b.f14854p
            r2 = 51
            r3.<init>(r2, r0, r1)
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.g(r3, r4, r5, r6, r7)
            return
    }

    public final void i(g4.h r10, java.lang.Object r11) {
            r9 = this;
            if (r11 != 0) goto L6
            u4.r r0 = u4.s.f13481r
        L4:
            r2 = r0
            goto Lf
        L6:
            g4.j r0 = r10.f4291b
            w4.c r0 = r0.f4312b
            u4.r r0 = u4.s.c(r0)
            goto L4
        Lf:
            int r0 = r2.f13410e
            r7 = 0
            r8 = 1
            u4.t r3 = r9.f4263h
            if (r0 != r8) goto L2a
            u4.l r1 = new u4.l
            u4.o r4 = r10.a()
            u4.p r5 = u4.p.f13403i
            v4.f0 r6 = g4.a.s(r11)
            r1.<init>(r2, r3, r4, r5, r6)
            r9.a(r1, r7)
            return
        L2a:
            u4.v r1 = new u4.v
            u4.p r4 = u4.p.f13403i
            w4.b r5 = r9.f4265j
            v4.f0 r6 = g4.a.s(r11)
            r1.<init>(r2, r3, r4, r5, r6)
            r9.a(r1, r7)
            r9.j(r10, r8)
            return
    }

    public final void j(g4.h r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto Lb
            g4.j r5 = r4.f4291b
            w4.c r5 = r5.f4312b
            u4.r r5 = u4.s.j(r5)
            goto L13
        Lb:
            g4.j r5 = r4.f4291b
            w4.c r5 = r5.f4312b
            u4.r r5 = u4.s.i(r5)
        L13:
            u4.m r0 = new u4.m
            u4.o r4 = r4.a()
            u4.p r1 = u4.p.f13403i
            u4.t r2 = r3.f4263h
            r0.<init>(r5, r2, r4, r1)
            r4 = 0
            r3.a(r0, r4)
            return
    }

    public final g4.h k(g4.j r2) {
            r1 = this;
            boolean r0 = r1.f4259d
            if (r0 != 0) goto Lf
            g4.h r0 = new g4.h
            r0.<init>(r1, r2)
            java.util.ArrayList r2 = r1.f4262g
            r2.add(r0)
            return r0
        Lf:
            java.lang.String r2 = "Cannot allocate locals after adding instructions"
            j8.o.A(r2)
            r2 = 0
            return r2
    }

    public final void l(g4.h r5) {
            r4 = this;
            g4.j r0 = r5.f4291b
            g4.j r1 = r5.f4291b
            g4.i r2 = r4.f4256a
            g4.j r3 = r2.f4295b
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L28
            u4.m r0 = new u4.m
            w4.c r1 = r1.f4312b
            u4.r r1 = u4.s.l(r1)
            u4.o r5 = r5.a()
            u4.p r5 = u4.p.p(r5)
            u4.t r2 = r4.f4263h
            r3 = 0
            r0.<init>(r1, r2, r3, r5)
            r4.a(r0, r3)
            return
        L28:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            g4.j r0 = r2.f4295b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "declared "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " but returned "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r5.<init>(r0)
            throw r5
    }

    public final void m() {
            r5 = this;
            g4.i r0 = r5.f4256a
            g4.j r1 = r0.f4295b
            g4.j r2 = g4.j.f4307l
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1c
            u4.m r0 = new u4.m
            u4.r r1 = u4.s.f13502w1
            u4.t r2 = r5.f4263h
            u4.p r3 = u4.p.f13403i
            r4 = 0
            r0.<init>(r1, r2, r4, r3)
            r5.a(r0, r4)
            return
        L1c:
            g4.j r0 = r0.f4295b
            java.lang.String r1 = " but returned void"
            java.lang.String r2 = "declared "
            bsh.j.b(r0, r2, r1)
            return
    }
}
