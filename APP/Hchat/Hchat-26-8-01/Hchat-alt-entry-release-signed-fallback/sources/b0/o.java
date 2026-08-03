package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0.d f392a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0.d f393b = null;

    static {
            b0.n r0 = new b0.n
            r1 = 0
            r0.<init>(r1)
            s0.d r1 = new s0.d
            r2 = 636288403(0x25ecfd93, float:4.1111303E-16)
            r3 = 0
            r1.<init>(r2, r0, r3)
            b0.o.f392a = r1
            b0.n r0 = new b0.n
            r1 = 1
            r0.<init>(r1)
            s0.d r1 = new s0.d
            r2 = -1357803046(0xffffffffaf1191da, float:-1.323949E-10)
            r1.<init>(r2, r0, r3)
            b0.o.f393b = r1
            return
    }

    public static final void a(y0.o r9, s0.d r10, i0.h0 r11, int r12) {
            r0 = 790527681(0x2f1e7ec1, float:1.4415048E-10)
            r11.b0(r0)
            r0 = r12 & 6
            r7 = 4
            r2 = 2
            if (r0 != 0) goto L17
            boolean r0 = r11.f(r9)
            if (r0 == 0) goto L14
            r0 = r7
            goto L15
        L14:
            r0 = r2
        L15:
            r0 = r0 | r12
            goto L18
        L17:
            r0 = r12
        L18:
            r4 = r12 & 48
            if (r4 != 0) goto L28
            boolean r4 = r11.h(r10)
            if (r4 == 0) goto L25
            r4 = 32
            goto L27
        L25:
            r4 = 16
        L27:
            r0 = r0 | r4
        L28:
            r4 = r0 & 19
            r5 = 18
            r6 = 1
            if (r4 == r5) goto L31
            r4 = r6
            goto L32
        L31:
            r4 = 0
        L32:
            r0 = r0 & r6
            boolean r0 = r11.S(r0, r4)
            if (r0 == 0) goto L92
            java.lang.Object r0 = r11.P()
            i0.e r4 = i0.l.f5952a
            if (r0 != r4) goto L4d
            i0.e r0 = i0.e.f5867j
            i0.j1 r5 = new i0.j1
            r8 = 0
            r5.<init>(r8, r0)
            r11.k0(r5)
            r0 = r5
        L4d:
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r5 = r11.P()
            if (r5 != r4) goto L5d
            b0.j r5 = new b0.j
            r5.<init>(r0, r6)
            r11.k0(r5)
        L5d:
            fg.a r5 = (fg.a) r5
            y2.c0 r4 = b0.w.f415a
            s0.d r4 = b0.o.f393b
            r6 = 6
            d0.c r4 = r9.e0.j(r4, r11, r6)
            b0.h r2 = e(r5, r11, r2)
            i0.u r6 = d0.f.f1895b
            i0.q1 r2 = r6.a(r2)
            i0.u r6 = d0.f.f1894a
            i0.q1 r6 = r6.a(r4)
            i0.q1[] r8 = new i0.q1[]{r2, r6}
            r2 = r0
            b0.z r0 = new b0.z
            r6 = 0
            r1 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = 1070596993(0x3fd00381, float:1.6251069)
            s0.d r0 = s0.i.e(r2, r0, r11)
            r2 = 56
            i0.r.b(r8, r0, r11, r2)
            goto L95
        L92:
            r11.V()
        L95:
            i0.r1 r0 = r11.t()
            if (r0 == 0) goto La2
            b0.i r2 = new b0.i
            r2.<init>(r9, r10, r12, r7)
            r0.f6035d = r2
        La2:
            return
    }

    public static final void b(y0.o r9, s0.d r10, i0.h0 r11, int r12) {
            r0 = 155925518(0x94b3c0e, float:2.4463474E-33)
            r11.b0(r0)
            r0 = r12 & 6
            if (r0 != 0) goto L15
            boolean r0 = r11.f(r9)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r12
            goto L16
        L15:
            r0 = r12
        L16:
            r1 = r12 & 48
            if (r1 != 0) goto L26
            boolean r1 = r11.h(r10)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r0 & 19
            r2 = 18
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L30
            r1 = r4
            goto L31
        L30:
            r1 = r3
        L31:
            r2 = r0 & 1
            boolean r1 = r11.S(r2, r1)
            if (r1 == 0) goto Le2
            i0.u r1 = d0.f.f1894a
            java.lang.Object r1 = r11.j(r1)
            if (r1 == 0) goto L43
            r1 = r4
            goto L44
        L43:
            r1 = r3
        L44:
            i0.u r2 = d0.f.f1895b
            java.lang.Object r2 = r11.j(r2)
            if (r2 == 0) goto L4e
            r2 = r4
            goto L4f
        L4e:
            r2 = r3
        L4f:
            if (r1 == 0) goto Lb1
            if (r2 == 0) goto Lb1
            r1 = -1977187922(0xffffffff8a2681ae, float:-8.016999E-33)
            r11.a0(r1)
            y0.g r1 = y0.b.f21792g
            v1.n0 r1 = p.o.d(r1, r4)
            long r5 = r11.T
            int r2 = java.lang.Long.hashCode(r5)
            s0.h r5 = r11.l()
            y0.o r6 = y0.a.c(r11, r9)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r11.d0()
            boolean r8 = r11.S
            if (r8 == 0) goto L7f
            r11.k(r7)
            goto L82
        L7f:
            r11.n0()
        L82:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r11, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r11, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r11, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r11)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r11, r6)
            int r0 = r0 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.invoke(r11, r0)
            r11.p(r4)
            r11.p(r3)
            goto Le5
        Lb1:
            if (r1 == 0) goto Lc2
            r1 = -1976997706(0xffffffff8a2968b6, float:-8.156748E-33)
            r11.a0(r1)
            r0 = r0 & 126(0x7e, float:1.77E-43)
            c(r9, r10, r11, r0)
            r11.p(r3)
            goto Le5
        Lc2:
            if (r2 == 0) goto Ld3
            r1 = -1976846922(0xffffffff8a2bb5b6, float:-8.2675265E-33)
            r11.a0(r1)
            r0 = r0 & 126(0x7e, float:1.77E-43)
            b0.w.d(r9, r10, r11, r0)
            r11.p(r3)
            goto Le5
        Ld3:
            r1 = -1976716505(0xffffffff8a2db327, float:-8.363342E-33)
            r11.a0(r1)
            r0 = r0 & 126(0x7e, float:1.77E-43)
            a(r9, r10, r11, r0)
            r11.p(r3)
            goto Le5
        Le2:
            r11.V()
        Le5:
            i0.r1 r11 = r11.t()
            if (r11 == 0) goto Lf3
            b0.i r0 = new b0.i
            r1 = 3
            r0.<init>(r9, r10, r12, r1)
            r11.f6035d = r0
        Lf3:
            return
    }

    public static final void c(y0.o r3, s0.d r4, i0.h0 r5, int r6) {
            r0 = 2064964257(0x7b14daa1, float:7.7289426E35)
            r5.b0(r0)
            r0 = r6 & 6
            if (r0 != 0) goto L15
            boolean r0 = r5.f(r3)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r6
            goto L16
        L15:
            r0 = r6
        L16:
            r1 = r6 & 48
            if (r1 != 0) goto L26
            boolean r1 = r5.h(r4)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r0 & 19
            r2 = 18
            if (r1 == r2) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r2 = r0 & 1
            boolean r1 = r5.S(r2, r1)
            if (r1 == 0) goto L44
            r1 = r0 & 14
            r1 = r1 | 48
            int r0 = r0 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            d(r3, r4, r5, r0)
            goto L47
        L44:
            r5.V()
        L47:
            i0.r1 r5 = r5.t()
            if (r5 == 0) goto L55
            b0.i r0 = new b0.i
            r1 = 0
            r0.<init>(r3, r4, r6, r1)
            r5.f6035d = r0
        L55:
            return
    }

    public static final void d(y0.o r6, s0.d r7, i0.h0 r8, int r9) {
            r0 = 771959668(0x2e032b74, float:2.9824546E-11)
            r8.b0(r0)
            r0 = r9 & 6
            if (r0 != 0) goto L15
            boolean r0 = r8.f(r6)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r9
            goto L16
        L15:
            r0 = r9
        L16:
            r1 = r9 & 48
            r2 = 0
            if (r1 != 0) goto L27
            boolean r1 = r8.h(r2)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r9 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L37
            boolean r1 = r8.h(r7)
            if (r1 == 0) goto L34
            r1 = 256(0x100, float:3.59E-43)
            goto L36
        L34:
            r1 = 128(0x80, float:1.8E-43)
        L36:
            r0 = r0 | r1
        L37:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r4 = 0
            r5 = 1
            if (r1 == r3) goto L41
            r1 = r5
            goto L42
        L41:
            r1 = r4
        L42:
            r0 = r0 & r5
            boolean r0 = r8.S(r0, r1)
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r8.P()
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto L5c
            i0.e r0 = i0.e.f5867j
            i0.j1 r3 = new i0.j1
            r3.<init>(r2, r0)
            r8.k0(r3)
            r0 = r3
        L5c:
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r2 = r8.P()
            if (r2 != r1) goto L6d
            b0.j r2 = new b0.j
            r1 = 0
            r2.<init>(r0, r1)
            r8.k0(r2)
        L6d:
            fg.a r2 = (fg.a) r2
            b0.h r1 = e(r2, r8, r4)
            i0.u r2 = d0.f.f1895b
            i0.q1 r1 = r2.a(r1)
            b0.k r2 = new b0.k
            r3 = 0
            r2.<init>(r6, r0, r7, r3)
            r0 = -291176396(0xffffffffeea50034, float:-2.5532636E28)
            s0.d r0 = s0.i.e(r0, r2, r8)
            r2 = 56
            i0.r.a(r1, r0, r8, r2)
            goto L8f
        L8c:
            r8.V()
        L8f:
            i0.r1 r8 = r8.t()
            if (r8 == 0) goto L9d
            b0.i r0 = new b0.i
            r1 = 1
            r0.<init>(r6, r7, r9, r1)
            r8.f6035d = r0
        L9d:
            return
    }

    public static final b0.h e(fg.a r3, i0.h0 r4, int r5) {
            i0.m2 r5 = y1.i0.f21970f
            java.lang.Object r5 = r4.j(r5)
            android.view.View r5 = (android.view.View) r5
            boolean r0 = r4.f(r5)
            java.lang.Object r1 = r4.P()
            i0.e r2 = i0.l.f5952a
            if (r0 != 0) goto L16
            if (r1 != r2) goto L1f
        L16:
            b0.h r1 = new b0.h
            r0 = 0
            r1.<init>(r5, r0, r3)
            r4.k0(r1)
        L1f:
            b0.h r1 = (b0.h) r1
            boolean r3 = r4.h(r1)
            java.lang.Object r5 = r4.P()
            if (r3 != 0) goto L2d
            if (r5 != r2) goto L36
        L2d:
            b0.a r5 = new b0.a
            r3 = 3
            r5.<init>(r1, r3)
            r4.k0(r5)
        L36:
            fg.l r5 = (fg.l) r5
            i0.r.c(r1, r5, r4)
            return r1
    }
}
