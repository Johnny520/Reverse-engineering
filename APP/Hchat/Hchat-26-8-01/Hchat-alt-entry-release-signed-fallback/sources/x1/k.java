package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1.o1 f20969a = null;

    static {
            x1.o1 r0 = new x1.o1
            r1 = 1
            r0.<init>(r1)
            x1.k.f20969a = r0
            return
    }

    public static final void A(x1.e2 r11, fg.l r12) {
            r0 = r11
            y0.n r0 = (y0.n) r0
            y0.n r1 = r0.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto Le
            java.lang.String r1 = "visitAncestors called on an unattached node"
            u1.a.b(r1)
        Le:
            y0.n r0 = r0.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r1 = w(r11)
        L16:
            if (r1 == 0) goto Lbf
            x1.b1 r2 = r1.L
            y0.n r2 = r2.f20844f
            int r2 = r2.f21822j
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r3
            r4 = 0
            if (r2 == 0) goto Lae
        L24:
            if (r0 == 0) goto Lae
            int r2 = r0.f21821i
            r2 = r2 & r3
            if (r2 == 0) goto Laa
            r2 = r0
            r5 = r4
        L2d:
            if (r2 == 0) goto Laa
            boolean r6 = r2 instanceof x1.e2
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L62
            r6 = r2
            x1.e2 r6 = (x1.e2) r6
            java.lang.Object r9 = r11.F()
            java.lang.Object r10 = r6.F()
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L5b
            java.lang.Class r9 = r11.getClass()
            java.lang.Class r10 = r6.getClass()
            if (r9 != r10) goto L5b
            java.lang.Object r6 = r12.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L5c
        L5b:
            r6 = r8
        L5c:
            if (r6 != 0) goto L60
            goto Lbf
        L60:
            r6 = r7
            goto L63
        L62:
            r6 = r8
        L63:
            if (r6 == 0) goto La5
            int r6 = r2.f21821i
            r6 = r6 & r3
            if (r6 == 0) goto L6c
            r6 = r8
            goto L6d
        L6c:
            r6 = r7
        L6d:
            if (r6 == 0) goto La5
            boolean r6 = r2 instanceof x1.j
            if (r6 == 0) goto La5
            r6 = r2
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r9 = r7
        L79:
            if (r6 == 0) goto La2
            int r10 = r6.f21821i
            r10 = r10 & r3
            if (r10 == 0) goto L82
            r10 = r8
            goto L83
        L82:
            r10 = r7
        L83:
            if (r10 == 0) goto L9f
            int r9 = r9 + 1
            if (r9 != r8) goto L8b
            r2 = r6
            goto L9f
        L8b:
            if (r5 != 0) goto L96
            j0.b r5 = new j0.b
            r10 = 16
            y0.n[] r10 = new y0.n[r10]
            r5.<init>(r10)
        L96:
            if (r2 == 0) goto L9c
            r5.b(r2)
            r2 = r4
        L9c:
            r5.b(r6)
        L9f:
            y0.n r6 = r6.f21824l
            goto L79
        La2:
            if (r9 != r8) goto La5
            goto L2d
        La5:
            y0.n r2 = e(r5)
            goto L2d
        Laa:
            y0.n r0 = r0.f21823k
            goto L24
        Lae:
            x1.f0 r1 = r1.u()
            if (r1 == 0) goto Lbc
            x1.b1 r0 = r1.L
            if (r0 == 0) goto Lbc
            x1.b2 r0 = r0.f20843e
            goto L16
        Lbc:
            r0 = r4
            goto L16
        Lbf:
            return
    }

    public static final void B(x1.e2 r12, fg.l r13) {
            r0 = r12
            y0.n r0 = (y0.n) r0
            y0.n r1 = r0.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto Le
            java.lang.String r1 = "visitSubtreeIf called on an unattached node"
            u1.a.b(r1)
        Le:
            j0.b r1 = new j0.b
            r2 = 16
            y0.n[] r3 = new y0.n[r2]
            r1.<init>(r3)
            y0.n r0 = r0.f21819g
            y0.n r3 = r0.f21824l
            if (r3 != 0) goto L21
            b(r1, r0)
            goto L24
        L21:
            r1.b(r3)
        L24:
            int r0 = r1.f6673i
            if (r0 == 0) goto Lbb
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.k(r0)
            y0.n r0 = (y0.n) r0
            int r3 = r0.f21822j
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto Lb6
            r3 = r0
        L38:
            if (r3 == 0) goto Lb6
            boolean r5 = r3.f21832t
            if (r5 == 0) goto Lb6
            int r5 = r3.f21821i
            r5 = r5 & r4
            if (r5 == 0) goto Lb3
            r5 = 0
            r6 = r3
            r7 = r5
        L46:
            if (r6 == 0) goto Lb3
            boolean r8 = r6 instanceof x1.e2
            if (r8 == 0) goto L79
            x1.e2 r6 = (x1.e2) r6
            java.lang.Object r8 = r12.F()
            java.lang.Object r9 = r6.F()
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L6d
            java.lang.Class r8 = r12.getClass()
            java.lang.Class r9 = r6.getClass()
            if (r8 != r9) goto L6d
            java.lang.Object r6 = r13.invoke(r6)
            x1.d2 r6 = (x1.d2) r6
            goto L6f
        L6d:
            x1.d2 r6 = x1.d2.f20872g
        L6f:
            x1.d2 r8 = x1.d2.f20874i
            if (r6 != r8) goto L74
            goto Lbb
        L74:
            x1.d2 r8 = x1.d2.f20873h
            if (r6 == r8) goto L24
            goto Lae
        L79:
            int r8 = r6.f21821i
            r8 = r8 & r4
            if (r8 == 0) goto Lae
            boolean r8 = r6 instanceof x1.j
            if (r8 == 0) goto Lae
            r8 = r6
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = 0
        L88:
            r10 = 1
            if (r8 == 0) goto Lab
            int r11 = r8.f21821i
            r11 = r11 & r4
            if (r11 == 0) goto La8
            int r9 = r9 + 1
            if (r9 != r10) goto L96
            r6 = r8
            goto La8
        L96:
            if (r7 != 0) goto L9f
            j0.b r7 = new j0.b
            y0.n[] r10 = new y0.n[r2]
            r7.<init>(r10)
        L9f:
            if (r6 == 0) goto La5
            r7.b(r6)
            r6 = r5
        La5:
            r7.b(r8)
        La8:
            y0.n r8 = r8.f21824l
            goto L88
        Lab:
            if (r9 != r10) goto Lae
            goto L46
        Lae:
            y0.n r6 = e(r7)
            goto L46
        Lb3:
            y0.n r3 = r3.f21824l
            goto L38
        Lb6:
            b(r1, r0)
            goto L24
        Lbb:
            return
    }

    public static final void C(y0.n r11, java.lang.String r12, fg.l r13) {
            y0.n r0 = r11.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            u1.a.b(r0)
        Lb:
            j0.b r0 = new j0.b
            r1 = 16
            y0.n[] r2 = new y0.n[r1]
            r0.<init>(r2)
            y0.n r11 = r11.f21819g
            y0.n r2 = r11.f21824l
            if (r2 != 0) goto L1e
            b(r0, r11)
            goto L21
        L1e:
            r0.b(r2)
        L21:
            int r11 = r0.f6673i
            if (r11 == 0) goto Laa
            int r11 = r11 + (-1)
            java.lang.Object r11 = r0.k(r11)
            y0.n r11 = (y0.n) r11
            int r2 = r11.f21822j
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r3
            if (r2 == 0) goto La5
            r2 = r11
        L35:
            if (r2 == 0) goto La5
            boolean r4 = r2.f21832t
            if (r4 == 0) goto La5
            int r4 = r2.f21821i
            r4 = r4 & r3
            if (r4 == 0) goto La2
            r4 = 0
            r5 = r2
            r6 = r4
        L43:
            if (r5 == 0) goto La2
            boolean r7 = r5 instanceof x1.e2
            if (r7 == 0) goto L68
            x1.e2 r5 = (x1.e2) r5
            java.lang.Object r7 = r5.F()
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L5c
            java.lang.Object r5 = r13.invoke(r5)
            x1.d2 r5 = (x1.d2) r5
            goto L5e
        L5c:
            x1.d2 r5 = x1.d2.f20872g
        L5e:
            x1.d2 r7 = x1.d2.f20874i
            if (r5 != r7) goto L63
            goto Laa
        L63:
            x1.d2 r7 = x1.d2.f20873h
            if (r5 == r7) goto L21
            goto L9d
        L68:
            int r7 = r5.f21821i
            r7 = r7 & r3
            if (r7 == 0) goto L9d
            boolean r7 = r5 instanceof x1.j
            if (r7 == 0) goto L9d
            r7 = r5
            x1.j r7 = (x1.j) r7
            y0.n r7 = r7.f20950v
            r8 = 0
        L77:
            r9 = 1
            if (r7 == 0) goto L9a
            int r10 = r7.f21821i
            r10 = r10 & r3
            if (r10 == 0) goto L97
            int r8 = r8 + 1
            if (r8 != r9) goto L85
            r5 = r7
            goto L97
        L85:
            if (r6 != 0) goto L8e
            j0.b r6 = new j0.b
            y0.n[] r9 = new y0.n[r1]
            r6.<init>(r9)
        L8e:
            if (r5 == 0) goto L94
            r6.b(r5)
            r5 = r4
        L94:
            r6.b(r7)
        L97:
            y0.n r7 = r7.f21824l
            goto L77
        L9a:
            if (r8 != r9) goto L9d
            goto L43
        L9d:
            y0.n r5 = e(r6)
            goto L43
        La2:
            y0.n r2 = r2.f21824l
            goto L35
        La5:
            b(r0, r11)
            goto L21
        Laa:
            return
    }

    public static final long a(float r4, boolean r5, boolean r6) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            r2 = 0
            if (r5 == 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = r2
        Ld:
            if (r6 == 0) goto L11
            r2 = 2
        L11:
            long r4 = r4 | r2
            r6 = 32
            long r0 = r0 << r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    public static final void b(j0.b r2, y0.n r3) {
            x1.f0 r3 = w(r3)
            j0.b r3 = r3.y()
            int r0 = r3.f6673i
            int r0 = r0 + (-1)
            java.lang.Object[] r3 = r3.f6671g
            int r1 = r3.length
            if (r0 >= r1) goto L21
        L11:
            if (r0 < 0) goto L21
            r1 = r3[r0]
            x1.f0 r1 = (x1.f0) r1
            x1.b1 r1 = r1.L
            y0.n r1 = r1.f20844f
            r2.b(r1)
            int r0 = r0 + (-1)
            goto L11
        L21:
            return
    }

    public static final int c(x1.n0 r4, v1.j r5) {
            x1.n0 r0 = r4.S0()
            if (r0 == 0) goto L7
            goto L1d
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Child of "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " cannot be null when calculating alignment line"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            u1.a.b(r1)
        L1d:
            v1.o0 r1 = r4.Z0()
            java.util.Map r1 = r1.e()
            boolean r1 = r1.containsKey(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L42
            v1.o0 r4 = r4.Z0()
            java.util.Map r4 = r4.e()
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L48
            int r4 = r4.intValue()
            return r4
        L42:
            int r1 = r0.R0(r5)
            if (r1 != r2) goto L49
        L48:
            return r2
        L49:
            r2 = 1
            r0.f20998p = r2
            r4.f20999q = r2
            r4.f1()
            r2 = 0
            r0.f20998p = r2
            r4.f20999q = r2
            boolean r4 = r5 instanceof v1.j
            if (r4 == 0) goto L67
            long r4 = r0.b1()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
        L64:
            int r4 = (int) r4
            int r1 = r1 + r4
            return r1
        L67:
            long r4 = r0.b1()
            r0 = 32
            long r4 = r4 >> r0
            goto L64
    }

    public static final y0.n d(x1.i r2, int r3) {
            y0.n r2 = (y0.n) r2
            y0.n r2 = r2.f21819g
            y0.n r2 = r2.f21824l
            if (r2 != 0) goto L9
            goto L1f
        L9:
            int r0 = r2.f21822j
            r0 = r0 & r3
            if (r0 != 0) goto Lf
            goto L1f
        Lf:
            if (r2 == 0) goto L1f
            int r0 = r2.f21821i
            r1 = r0 & 2
            if (r1 == 0) goto L18
            goto L1f
        L18:
            r0 = r0 & r3
            if (r0 == 0) goto L1c
            return r2
        L1c:
            y0.n r2 = r2.f21824l
            goto Lf
        L1f:
            r2 = 0
            return r2
    }

    public static final y0.n e(j0.b r1) {
            if (r1 == 0) goto L10
            int r0 = r1.f6673i
            if (r0 != 0) goto L7
            goto L10
        L7:
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.k(r0)
            y0.n r1 = (y0.n) r1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final x1.v f(y0.n r2) {
            int r0 = r2.f21821i
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L31
            boolean r0 = r2 instanceof x1.v
            if (r0 == 0) goto Le
            x1.v r2 = (x1.v) r2
            return r2
        Le:
            boolean r0 = r2 instanceof x1.j
            if (r0 == 0) goto L31
            x1.j r2 = (x1.j) r2
            y0.n r2 = r2.f20950v
        L16:
            if (r2 == 0) goto L31
            boolean r0 = r2 instanceof x1.v
            if (r0 == 0) goto L1f
            x1.v r2 = (x1.v) r2
            return r2
        L1f:
            boolean r0 = r2 instanceof x1.j
            if (r0 == 0) goto L2e
            int r0 = r2.f21821i
            r0 = r0 & 2
            if (r0 == 0) goto L2e
            x1.j r2 = (x1.j) r2
            y0.n r2 = r2.f20950v
            goto L16
        L2e:
            y0.n r2 = r2.f21824l
            goto L16
        L31:
            return r1
    }

    public static final int g(long r5, long r7) {
            boolean r0 = p(r5)
            boolean r1 = p(r7)
            r2 = 1
            r3 = -1
            if (r0 == r1) goto L10
            if (r0 == 0) goto Lf
            return r3
        Lf:
            return r2
        L10:
            float r0 = k(r5)
            float r1 = k(r7)
            float r0 = r0 - r1
            float r0 = java.lang.Math.signum(r0)
            int r0 = (int) r0
            float r1 = k(r5)
            float r4 = k(r7)
            float r1 = java.lang.Math.min(r1, r4)
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L30
            goto L42
        L30:
            boolean r1 = o(r5)
            boolean r7 = o(r7)
            if (r1 == r7) goto L42
            boolean r5 = o(r5)
            if (r5 == 0) goto L41
            return r3
        L41:
            return r2
        L42:
            return r0
    }

    public static final java.lang.Object h(x1.h r1, i0.p1 r2) {
            r0 = r1
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Le
            java.lang.String r0 = "Cannot read CompositionLocal because the Modifier node is not currently attached."
            u1.a.b(r0)
        Le:
            x1.f0 r1 = w(r1)
            i0.t r1 = r1.H
            s0.h r1 = (s0.h) r1
            r1.getClass()
            java.lang.Object r1 = i0.r.v(r1, r2)
            return r1
    }

    public static final e1.c i(y0.n r1, boolean r2, boolean r3) {
            y0.n r0 = r1.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto L9
            e1.c r1 = e1.c.f2295e
            return r1
        L9:
            r0 = 8
            if (r2 != 0) goto L1a
            x1.i1 r1 = t(r1, r0)
            v1.t r2 = v1.w.h(r1)
            e1.c r1 = r2.k0(r1, r3)
            return r1
        L1a:
            x1.i1 r1 = t(r1, r0)
            e1.c r1 = r1.N1()
            return r1
    }

    public static final x1.e2 j(x1.j r9, java.lang.Object r10) {
            y0.n r0 = r9.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            u1.a.b(r0)
        Lb:
            y0.n r0 = r9.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r9 = w(r9)
        L13:
            r1 = 0
            if (r9 == 0) goto L8c
            x1.b1 r2 = r9.L
            y0.n r2 = r2.f20844f
            int r2 = r2.f21822j
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r3
            if (r2 == 0) goto L7d
        L21:
            if (r0 == 0) goto L7d
            int r2 = r0.f21821i
            r2 = r2 & r3
            if (r2 == 0) goto L7a
            r2 = r0
            r4 = r1
        L2a:
            if (r2 == 0) goto L7a
            boolean r5 = r2 instanceof x1.e2
            if (r5 == 0) goto L3e
            r5 = r2
            x1.e2 r5 = (x1.e2) r5
            java.lang.Object r6 = r5.F()
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L3e
            return r5
        L3e:
            int r5 = r2.f21821i
            r5 = r5 & r3
            if (r5 == 0) goto L75
            boolean r5 = r2 instanceof x1.j
            if (r5 == 0) goto L75
            r5 = r2
            x1.j r5 = (x1.j) r5
            y0.n r5 = r5.f20950v
            r6 = 0
        L4d:
            r7 = 1
            if (r5 == 0) goto L72
            int r8 = r5.f21821i
            r8 = r8 & r3
            if (r8 == 0) goto L6f
            int r6 = r6 + 1
            if (r6 != r7) goto L5b
            r2 = r5
            goto L6f
        L5b:
            if (r4 != 0) goto L66
            j0.b r4 = new j0.b
            r7 = 16
            y0.n[] r7 = new y0.n[r7]
            r4.<init>(r7)
        L66:
            if (r2 == 0) goto L6c
            r4.b(r2)
            r2 = r1
        L6c:
            r4.b(r5)
        L6f:
            y0.n r5 = r5.f21824l
            goto L4d
        L72:
            if (r6 != r7) goto L75
            goto L2a
        L75:
            y0.n r2 = e(r4)
            goto L2a
        L7a:
            y0.n r0 = r0.f21823k
            goto L21
        L7d:
            x1.f0 r9 = r9.u()
            if (r9 == 0) goto L8a
            x1.b1 r0 = r9.L
            if (r0 == 0) goto L8a
            x1.b2 r0 = r0.f20843e
            goto L13
        L8a:
            r0 = r1
            goto L13
        L8c:
            return r1
    }

    public static final float k(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public static final void l(x1.m r1) {
            r0 = r1
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            boolean r0 = r0.f21832t
            if (r0 == 0) goto L11
            r0 = 1
            x1.i1 r1 = t(r1, r0)
            r1.y1()
        L11:
            return
    }

    public static final void m(x1.v r0) {
            x1.f0 r0 = w(r0)
            r0.D()
            return
    }

    public static final void n(x1.z1 r0) {
            x1.f0 r0 = w(r0)
            r0.E()
            return
    }

    public static final boolean o(long r2) {
            r0 = 2
            long r2 = r2 & r0
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static final boolean p(long r2) {
            r0 = 1
            long r2 = r2 & r0
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static final boolean q(x1.f0 r1) {
            x1.f0 r0 = r1.f20896n
            if (r0 == 0) goto L18
            x1.f0 r0 = r1.u()
            if (r0 == 0) goto Ld
            x1.f0 r0 = r0.f20896n
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            x1.j0 r1 = r1.M
            boolean r1 = r1.f20952b
            if (r1 == 0) goto L18
        L16:
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static final void r(y0.n r2, fg.a r3) {
            x1.n1 r0 = r2.f21825m
            if (r0 != 0) goto Le
            x1.n1 r0 = new x1.n1
            r1 = r2
            x1.m1 r1 = (x1.m1) r1
            r0.<init>(r1)
            r2.f21825m = r0
        Le:
            x1.r1 r2 = x(r2)
            y1.t r2 = (y1.t) r2
            x1.t1 r2 = r2.getSnapshotObserver()
            x1.d r1 = x1.d.f20859l
            w0.s r2 = r2.f21066a
            r2.c(r0, r1, r3)
            return
    }

    public static final void s(x1.i r4) {
            x1.f0 r4 = w(r4)
            boolean r0 = r4.f20908z
            if (r0 == 0) goto L9
            goto L21
        L9:
            x1.r1 r0 = x1.i0.a(r4)
            y1.t r0 = (y1.t) r0
            z0.c r0 = r0.T
            if (r0 == 0) goto L21
            g2.b r1 = r0.f22481j
            ac.k r1 = r1.f4147b
            int r2 = r4.f20890h
            z0.b r3 = new z0.b
            r3.<init>(r0, r4)
            r1.P(r2, r3)
        L21:
            return
    }

    public static final x1.i1 t(x1.i r2, int r3) {
            r0 = r2
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            x1.i1 r0 = r0.f21826n
            r0.getClass()
            y0.n r1 = r0.r1()
            if (r1 == r2) goto L11
            goto L1d
        L11:
            boolean r2 = x1.j1.g(r3)
            if (r2 == 0) goto L1d
            x1.i1 r2 = r0.f20944v
            r2.getClass()
            return r2
        L1d:
            return r0
    }

    public static final f1.z u(y0.n r0) {
            x1.r1 r0 = x(r0)
            y1.t r0 = (y1.t) r0
            f1.z r0 = r0.getGraphicsContext()
            return r0
    }

    public static final x1.i1 v(x1.i r1) {
            r0 = r1
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Le
            java.lang.String r0 = "Cannot get LayoutCoordinates, Modifier.Node is not attached."
            u1.a.b(r0)
        Le:
            r0 = 2
            x1.i1 r1 = t(r1, r0)
            y0.n r0 = r1.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto L20
            java.lang.String r0 = "LayoutCoordinates is not attached."
            u1.a.b(r0)
        L20:
            return r1
    }

    public static final x1.f0 w(x1.i r0) {
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            x1.i1 r0 = r0.f21826n
            if (r0 == 0) goto Lb
            x1.f0 r0 = r0.f20943u
            return r0
        Lb:
            java.lang.String r0 = "Cannot obtain node coordinator. Is the Modifier.Node attached?"
            af.d r0 = wb.en.a(r0)
            throw r0
    }

    public static final x1.r1 x(x1.i r0) {
            x1.f0 r0 = w(r0)
            x1.r1 r0 = r0.f20902t
            if (r0 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "This node does not have an owner."
            af.d r0 = wb.en.a(r0)
            throw r0
    }

    public static final android.view.View y(x1.i r1) {
            r0 = r1
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Le
            java.lang.String r0 = "Cannot get View because the Modifier node is not currently attached."
            u1.a.b(r0)
        Le:
            x1.f0 r1 = w(r1)
            x1.r1 r1 = x1.i0.a(r1)
            android.view.View r1 = (android.view.View) r1
            return r1
    }

    public static final void z(x1.i r10, java.lang.Object r11, fg.l r12) {
            r0 = r10
            y0.n r0 = (y0.n) r0
            y0.n r1 = r0.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto Le
            java.lang.String r1 = "visitAncestors called on an unattached node"
            u1.a.b(r1)
        Le:
            y0.n r0 = r0.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r10 = w(r10)
        L16:
            if (r10 == 0) goto Lb0
            x1.b1 r1 = r10.L
            y0.n r1 = r1.f20844f
            int r1 = r1.f21822j
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r2
            r3 = 0
            if (r1 == 0) goto L9f
        L24:
            if (r0 == 0) goto L9f
            int r1 = r0.f21821i
            r1 = r1 & r2
            if (r1 == 0) goto L9c
            r1 = r0
            r4 = r3
        L2d:
            if (r1 == 0) goto L9c
            boolean r5 = r1 instanceof x1.e2
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L54
            r5 = r1
            x1.e2 r5 = (x1.e2) r5
            java.lang.Object r8 = r5.F()
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L4d
            java.lang.Object r5 = r12.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L4e
        L4d:
            r5 = r7
        L4e:
            if (r5 != 0) goto L52
            goto Lb0
        L52:
            r5 = r6
            goto L55
        L54:
            r5 = r7
        L55:
            if (r5 == 0) goto L97
            int r5 = r1.f21821i
            r5 = r5 & r2
            if (r5 == 0) goto L5e
            r5 = r7
            goto L5f
        L5e:
            r5 = r6
        L5f:
            if (r5 == 0) goto L97
            boolean r5 = r1 instanceof x1.j
            if (r5 == 0) goto L97
            r5 = r1
            x1.j r5 = (x1.j) r5
            y0.n r5 = r5.f20950v
            r8 = r6
        L6b:
            if (r5 == 0) goto L94
            int r9 = r5.f21821i
            r9 = r9 & r2
            if (r9 == 0) goto L74
            r9 = r7
            goto L75
        L74:
            r9 = r6
        L75:
            if (r9 == 0) goto L91
            int r8 = r8 + 1
            if (r8 != r7) goto L7d
            r1 = r5
            goto L91
        L7d:
            if (r4 != 0) goto L88
            j0.b r4 = new j0.b
            r9 = 16
            y0.n[] r9 = new y0.n[r9]
            r4.<init>(r9)
        L88:
            if (r1 == 0) goto L8e
            r4.b(r1)
            r1 = r3
        L8e:
            r4.b(r5)
        L91:
            y0.n r5 = r5.f21824l
            goto L6b
        L94:
            if (r8 != r7) goto L97
            goto L2d
        L97:
            y0.n r1 = e(r4)
            goto L2d
        L9c:
            y0.n r0 = r0.f21823k
            goto L24
        L9f:
            x1.f0 r10 = r10.u()
            if (r10 == 0) goto Lad
            x1.b1 r0 = r10.L
            if (r0 == 0) goto Lad
            x1.b2 r0 = r0.f20843e
            goto L16
        Lad:
            r0 = r3
            goto L16
        Lb0:
            return
    }
}
