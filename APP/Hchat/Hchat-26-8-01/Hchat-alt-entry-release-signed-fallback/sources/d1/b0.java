package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends y0.n implements x1.h, x1.u, x1.m1, w1.c, x1.i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f1903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fg.p f1904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1906x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1907y;

    public b0(int r3, fg.p r4, int r5) {
            r2 = this;
            r0 = r5 & 1
            r1 = 1
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lb
            r1 = 0
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = 0
        L10:
            r2.<init>()
            r2.f1903u = r1
            r2.f1904v = r4
            r2.f1907y = r3
            return
    }

    public static /* synthetic */ boolean s1(d1.b0 r1) {
            r0 = 7
            boolean r1 = r1.r1(r0)
            return r1
    }

    @Override // x1.m1
    public final void C0() {
            r0 = this;
            r0.q1()
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y0.n
    public final void d1() {
            r4 = this;
            d1.z r0 = r4.p1()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L18
            r2 = 2
            if (r0 == r2) goto L39
            r1 = 3
            if (r0 != r1) goto L14
            goto L38
        L14:
            okio.a.k()
            return
        L18:
            x1.r1 r0 = x1.k.x(r4)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            d1.b0 r2 = d1.d.f(r4)
            if (r2 == 0) goto L38
            boolean r2 = r2.f1903u
            if (r2 != r1) goto L38
            d1.p r0 = (d1.p) r0
            y1.t r1 = r0.f1934a
            r1.H()
            d1.i r0 = r0.f1937d
            r0.a()
        L38:
            return
        L39:
            x1.r1 r0 = x1.k.x(r4)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            d1.p r0 = (d1.p) r0
            r2 = 8
            r3 = 0
            r0.b(r2, r1, r3)
            boolean r1 = r4.f1903u
            if (r1 == 0) goto L54
            y1.t r1 = r0.f1934a
            r1.H()
        L54:
            d1.i r0 = r0.f1937d
            r0.a()
            return
    }

    @Override // y0.n
    public final void e1() {
            r3 = this;
            d1.z r0 = r3.p1()
            boolean r0 = r0.a()
            if (r0 == 0) goto L1c
            x1.r1 r0 = x1.k.x(r3)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            r1 = 8
            d1.p r0 = (d1.p) r0
            r2 = 1
            r0.b(r1, r2, r2)
        L1c:
            return
    }

    public final boolean k1(int r3) {
            r2 = this;
            d1.b r3 = d1.d.v(r2, r3)
            int r3 = r3.ordinal()
            if (r3 == 0) goto L1c
            r0 = 1
            if (r3 == r0) goto L1a
            r1 = 2
            if (r3 == r1) goto L19
            r0 = 3
            if (r3 != r0) goto L14
            goto L1a
        L14:
            okio.a.k()
            r3 = 0
            return r3
        L19:
            return r0
        L1a:
            r3 = 0
            return r3
        L1c:
            boolean r3 = d1.d.w(r2)
            return r3
    }

    public final void l1(d1.z r12, d1.z r13) {
            r11 = this;
            x1.r1 r0 = x1.k.x(r11)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            d1.p r0 = (d1.p) r0
            d1.b0 r1 = r0.f()
            boolean r2 = r12.equals(r13)
            if (r2 != 0) goto L1d
            fg.p r2 = r11.f1904v
            if (r2 == 0) goto L1d
            r2.invoke(r12, r13)
        L1d:
            y0.n r12 = r11.f21819g
            boolean r2 = r12.f21832t
            if (r2 != 0) goto L28
            java.lang.String r2 = "visitAncestors called on an unattached node"
            u1.a.b(r2)
        L28:
            y0.n r2 = r11.f21819g
            x1.f0 r3 = x1.k.w(r11)
        L2e:
            if (r3 == 0) goto Lb6
            x1.b1 r4 = r3.L
            y0.n r4 = r4.f20844f
            int r4 = r4.f21822j
            r4 = r4 & 5120(0x1400, float:7.175E-42)
            r5 = 0
            if (r4 == 0) goto La5
        L3b:
            if (r2 == 0) goto La5
            int r4 = r2.f21821i
            r6 = r4 & 5120(0x1400, float:7.175E-42)
            if (r6 == 0) goto La2
            if (r2 == r12) goto L4b
            r6 = r4 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L4b
            goto Lb6
        L4b:
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto La2
            r4 = r2
            r6 = r5
        L51:
            if (r4 == 0) goto La2
            boolean r7 = r4 instanceof d1.g
            if (r7 == 0) goto L64
            d1.g r4 = (d1.g) r4
            d1.b0 r7 = r0.f()
            if (r1 == r7) goto L60
            goto L9d
        L60:
            r4.E(r13)
            goto L9d
        L64:
            int r7 = r4.f21821i
            r7 = r7 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L9d
            boolean r7 = r4 instanceof x1.j
            if (r7 == 0) goto L9d
            r7 = r4
            x1.j r7 = (x1.j) r7
            y0.n r7 = r7.f20950v
            r8 = 0
        L74:
            r9 = 1
            if (r7 == 0) goto L9a
            int r10 = r7.f21821i
            r10 = r10 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L97
            int r8 = r8 + 1
            if (r8 != r9) goto L83
            r4 = r7
            goto L97
        L83:
            if (r6 != 0) goto L8e
            j0.b r6 = new j0.b
            r9 = 16
            y0.n[] r9 = new y0.n[r9]
            r6.<init>(r9)
        L8e:
            if (r4 == 0) goto L94
            r6.b(r4)
            r4 = r5
        L94:
            r6.b(r7)
        L97:
            y0.n r7 = r7.f21824l
            goto L74
        L9a:
            if (r8 != r9) goto L9d
            goto L51
        L9d:
            y0.n r4 = x1.k.e(r6)
            goto L51
        La2:
            y0.n r2 = r2.f21823k
            goto L3b
        La5:
            x1.f0 r3 = r3.u()
            if (r3 == 0) goto Lb3
            x1.b1 r2 = r3.L
            if (r2 == 0) goto Lb3
            x1.b2 r2 = r2.f20843e
            goto L2e
        Lb3:
            r2 = r5
            goto L2e
        Lb6:
            return
    }

    public final d1.t m1() {
            r12 = this;
            d1.t r0 = new d1.t
            r0.<init>()
            r1 = 1
            r0.f1946a = r1
            d1.v r2 = d1.v.f1958b
            r0.f1947b = r2
            r0.f1948c = r2
            r0.f1949d = r2
            r0.f1950e = r2
            r0.f1951f = r2
            r0.f1952g = r2
            r0.f1953h = r2
            r0.f1954i = r2
            d1.s r2 = d1.s.f1943h
            r0.f1955j = r2
            d1.s r2 = d1.s.f1944i
            r0.f1956k = r2
            e1.c r2 = d1.q.f1942a
            r0.f1957l = r2
            int r2 = r12.f1907y
            r3 = 0
            if (r2 != r1) goto L2d
            r2 = r1
            goto L4e
        L2d:
            if (r2 != 0) goto L4a
            i0.m2 r2 = y1.h1.f21951m
            java.lang.Object r2 = x1.k.h(r12, r2)
            o1.b r2 = (o1.b) r2
            o1.c r2 = (o1.c) r2
            i0.j1 r2 = r2.f9500a
            java.lang.Object r2 = r2.getValue()
            o1.a r2 = (o1.a) r2
            int r2 = r2.f9499a
            if (r2 != r1) goto L47
            r2 = r1
            goto L48
        L47:
            r2 = r3
        L48:
            r2 = r2 ^ r1
            goto L4e
        L4a:
            r4 = 2
            if (r2 != r4) goto Le0
            r2 = r3
        L4e:
            r0.f1946a = r2
            y0.n r2 = r12.f21819g
            boolean r4 = r2.f21832t
            if (r4 != 0) goto L5b
            java.lang.String r4 = "visitAncestors called on an unattached node"
            u1.a.b(r4)
        L5b:
            y0.n r4 = r12.f21819g
            x1.f0 r5 = x1.k.w(r12)
        L61:
            if (r5 == 0) goto Ldf
            x1.b1 r6 = r5.L
            y0.n r6 = r6.f20844f
            int r6 = r6.f21822j
            r6 = r6 & 3072(0xc00, float:4.305E-42)
            r7 = 0
            if (r6 == 0) goto Ld0
        L6e:
            if (r4 == 0) goto Ld0
            int r6 = r4.f21821i
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 == 0) goto Lcd
            if (r4 == r2) goto L7e
            r8 = r6 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L7e
            goto Ldf
        L7e:
            r6 = r6 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto Lcd
            r6 = r4
            r8 = r7
        L84:
            if (r6 == 0) goto Lcd
            boolean r9 = r6 instanceof d1.u
            if (r9 == 0) goto L90
            d1.u r6 = (d1.u) r6
            r6.r0(r0)
            goto Lc8
        L90:
            int r9 = r6.f21821i
            r9 = r9 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto Lc8
            boolean r9 = r6 instanceof x1.j
            if (r9 == 0) goto Lc8
            r9 = r6
            x1.j r9 = (x1.j) r9
            y0.n r9 = r9.f20950v
            r10 = r3
        La0:
            if (r9 == 0) goto Lc5
            int r11 = r9.f21821i
            r11 = r11 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto Lc2
            int r10 = r10 + 1
            if (r10 != r1) goto Lae
            r6 = r9
            goto Lc2
        Lae:
            if (r8 != 0) goto Lb9
            j0.b r8 = new j0.b
            r11 = 16
            y0.n[] r11 = new y0.n[r11]
            r8.<init>(r11)
        Lb9:
            if (r6 == 0) goto Lbf
            r8.b(r6)
            r6 = r7
        Lbf:
            r8.b(r9)
        Lc2:
            y0.n r9 = r9.f21824l
            goto La0
        Lc5:
            if (r10 != r1) goto Lc8
            goto L84
        Lc8:
            y0.n r6 = x1.k.e(r8)
            goto L84
        Lcd:
            y0.n r4 = r4.f21823k
            goto L6e
        Ld0:
            x1.f0 r5 = r5.u()
            if (r5 == 0) goto Ldd
            x1.b1 r4 = r5.L
            if (r4 == 0) goto Ldd
            x1.b2 r4 = r4.f20843e
            goto L61
        Ldd:
            r4 = r7
            goto L61
        Ldf:
            return r0
        Le0:
            java.lang.String r0 = "Unknown Focusability"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public final e1.c n1(v1.t r5) {
            r4 = this;
            d1.t r0 = r4.m1()
            e1.c r0 = r0.f1957l
            e1.c r1 = d1.q.f1942a
            r2 = 0
            if (r0 == r1) goto L1c
            if (r5 != 0) goto Lf
            return r0
        Lf:
            x1.i1 r1 = x1.k.v(r4)
            long r1 = r5.W(r1, r2)
            e1.c r5 = r0.i(r1)
            return r5
        L1c:
            if (r5 == 0) goto L28
            x1.i1 r0 = x1.k.v(r4)
            r1 = 0
            e1.c r5 = r5.k0(r0, r1)
            return r5
        L28:
            x1.i1 r5 = x1.k.v(r4)
            long r0 = r5.f13902i
            long r0 = r9.e0.q0(r0)
            e1.c r5 = ac.p.a(r2, r0)
            return r5
    }

    public final s.r o1() {
            r7 = this;
            y0.n r0 = r7.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            u1.a.b(r0)
        Lb:
            y0.n r0 = r7.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r1 = x1.k.w(r7)
        L13:
            r2 = 0
            if (r1 == 0) goto L8b
            x1.b1 r3 = r1.L
            y0.n r3 = r3.f20844f
            int r3 = r3.f21822j
            r4 = 8388640(0x800020, float:1.1754988E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L7c
        L22:
            if (r0 == 0) goto L7c
            int r3 = r0.f21821i
            r5 = r3 & r4
            if (r5 == 0) goto L79
            r5 = 8388608(0x800000, float:1.1754944E-38)
            r5 = r5 & r3
            if (r5 == 0) goto L4f
            boolean r1 = r0 instanceof s.r
            if (r1 == 0) goto L34
            goto L4a
        L34:
            boolean r1 = r0 instanceof x1.j
            if (r1 == 0) goto L49
            x1.j r0 = (x1.j) r0
            y0.n r0 = r0.f20950v
            r1 = r2
        L3d:
            if (r0 == 0) goto L47
            boolean r3 = r0 instanceof s.r
            if (r3 == 0) goto L44
            r1 = r0
        L44:
            y0.n r0 = r0.f21824l
            goto L3d
        L47:
            r0 = r1
            goto L4a
        L49:
            r0 = r2
        L4a:
            s.r r0 = (s.r) r0
            if (r0 == 0) goto L8b
            return r0
        L4f:
            r3 = r3 & 32
            if (r3 == 0) goto L79
            boolean r3 = r0 instanceof w1.c
            if (r3 == 0) goto L59
            r5 = r0
            goto L6e
        L59:
            boolean r3 = r0 instanceof x1.j
            if (r3 == 0) goto L6d
            r3 = r0
            x1.j r3 = (x1.j) r3
            y0.n r3 = r3.f20950v
            r5 = r2
        L63:
            if (r3 == 0) goto L6e
            boolean r6 = r3 instanceof w1.c
            if (r6 == 0) goto L6a
            r5 = r3
        L6a:
            y0.n r3 = r3.f21824l
            goto L63
        L6d:
            r5 = r2
        L6e:
            w1.c r5 = (w1.c) r5
            if (r5 == 0) goto L79
            w1.a r3 = r5.o0()
            r3.getClass()
        L79:
            y0.n r0 = r0.f21823k
            goto L22
        L7c:
            x1.f0 r1 = r1.u()
            if (r1 == 0) goto L89
            x1.b1 r0 = r1.L
            if (r0 == 0) goto L89
            x1.b2 r0 = r0.f20843e
            goto L13
        L89:
            r0 = r2
            goto L13
        L8b:
            return r2
    }

    @Override // x1.u
    public final void p0(v1.t r1) {
            r0 = this;
            return
    }

    public final d1.z p1() {
            r10 = this;
            boolean r0 = r10.f21832t
            d1.z r1 = d1.z.f1966i
            if (r0 != 0) goto L7
            return r1
        L7:
            x1.r1 r0 = x1.k.x(r10)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            d1.p r0 = (d1.p) r0
            d1.b0 r0 = r0.f()
            if (r0 != 0) goto L1a
            return r1
        L1a:
            if (r10 != r0) goto L1f
            d1.z r0 = d1.z.f1964g
            return r0
        L1f:
            boolean r2 = r0.f21832t
            if (r2 == 0) goto Laa
            y0.n r2 = r0.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L2e
            java.lang.String r2 = "visitAncestors called on an unattached node"
            u1.a.b(r2)
        L2e:
            y0.n r2 = r0.f21819g
            y0.n r2 = r2.f21823k
            x1.f0 r0 = x1.k.w(r0)
        L36:
            if (r0 == 0) goto Laa
            x1.b1 r3 = r0.L
            y0.n r3 = r3.f20844f
            int r3 = r3.f21822j
            r3 = r3 & 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r3 == 0) goto L9b
        L43:
            if (r2 == 0) goto L9b
            int r3 = r2.f21821i
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L98
            r3 = r2
            r5 = r4
        L4d:
            if (r3 == 0) goto L98
            boolean r6 = r3 instanceof d1.b0
            if (r6 == 0) goto L5a
            d1.b0 r3 = (d1.b0) r3
            if (r10 != r3) goto L93
            d1.z r0 = d1.z.f1965h
            return r0
        L5a:
            int r6 = r3.f21821i
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L93
            boolean r6 = r3 instanceof x1.j
            if (r6 == 0) goto L93
            r6 = r3
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = 0
        L6a:
            r8 = 1
            if (r6 == 0) goto L90
            int r9 = r6.f21821i
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L8d
            int r7 = r7 + 1
            if (r7 != r8) goto L79
            r3 = r6
            goto L8d
        L79:
            if (r5 != 0) goto L84
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L84:
            if (r3 == 0) goto L8a
            r5.b(r3)
            r3 = r4
        L8a:
            r5.b(r6)
        L8d:
            y0.n r6 = r6.f21824l
            goto L6a
        L90:
            if (r7 != r8) goto L93
            goto L4d
        L93:
            y0.n r3 = x1.k.e(r5)
            goto L4d
        L98:
            y0.n r2 = r2.f21823k
            goto L43
        L9b:
            x1.f0 r0 = r0.u()
            if (r0 == 0) goto La8
            x1.b1 r2 = r0.L
            if (r2 == 0) goto La8
            x1.b2 r2 = r2.f20843e
            goto L36
        La8:
            r2 = r4
            goto L36
        Laa:
            return r1
    }

    public final void q1() {
            r4 = this;
            d1.z r0 = r4.p1()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 == r1) goto L43
            r2 = 2
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 != r1) goto L14
            goto L43
        L14:
            okio.a.k()
            return
        L18:
            gg.u r0 = new gg.u
            r0.<init>()
            c1.b r2 = new c1.b
            r3 = 2
            r2.<init>(r0, r3, r4)
            x1.k.r(r4, r2)
            java.lang.Object r0 = r0.f4564g
            if (r0 == 0) goto L44
            d1.r r0 = (d1.r) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto L43
            x1.r1 r0 = x1.k.x(r4)
            y1.t r0 = (y1.t) r0
            d1.l r0 = r0.getFocusOwner()
            d1.p r0 = (d1.p) r0
            r2 = 8
            r0.b(r2, r1, r1)
        L43:
            return
        L44:
            java.lang.String r0 = "focusProperties"
            gg.l.g(r0)
            r0 = 0
            throw r0
    }

    public final boolean r1(int r3) {
            r2 = this;
            java.lang.String r0 = "FocusTransactions:requestFocus"
            android.os.Trace.beginSection(r0)
            d1.t r0 = r2.m1()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.f1946a     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            boolean r3 = r2.k1(r3)     // Catch: java.lang.Throwable -> L15
            android.os.Trace.endSection()
            return r3
        L15:
            r3 = move-exception
            goto L25
        L17:
            d1.o r0 = new d1.o     // Catch: java.lang.Throwable -> L15
            r1 = 2
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L15
            boolean r3 = d1.d.h(r2, r3, r0)     // Catch: java.lang.Throwable -> L15
            android.os.Trace.endSection()
            return r3
        L25:
            android.os.Trace.endSection()
            throw r3
    }
}
