package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f11237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0.e f11239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0.f f11240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u2.m f11241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11243h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11244i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f11246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f11247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s.z f11248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f11251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f11258w;

    public q(int r4, java.util.List r5, boolean r6, y0.e r7, y0.f r8, u2.m r9, int r10, int r11, int r12, long r13, java.lang.Object r15, java.lang.Object r16, s.z r17, long r18) {
            r3 = this;
            r3.<init>()
            r3.f11236a = r4
            r3.f11237b = r5
            r3.f11238c = r6
            r3.f11239d = r7
            r3.f11240e = r8
            r3.f11241f = r9
            r3.f11242g = r10
            r3.f11243h = r11
            r3.f11244i = r12
            r3.f11245j = r13
            r3.f11246k = r15
            r4 = r16
            r3.f11247l = r4
            r4 = r17
            r3.f11248m = r4
            r6 = r18
            r3.f11249n = r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f11255t = r4
            int r4 = r5.size()
            r6 = 0
            r7 = r6
            r8 = r7
            r9 = r8
        L31:
            if (r7 >= r4) goto L51
            java.lang.Object r0 = r5.get(r7)
            v1.b1 r0 = (v1.b1) r0
            boolean r1 = r3.f11238c
            if (r1 == 0) goto L40
            int r2 = r0.f13901h
            goto L42
        L40:
            int r2 = r0.f13900g
        L42:
            int r8 = r8 + r2
            if (r1 != 0) goto L48
            int r0 = r0.f13901h
            goto L4a
        L48:
            int r0 = r0.f13900g
        L4a:
            int r9 = java.lang.Math.max(r9, r0)
            int r7 = r7 + 1
            goto L31
        L51:
            r3.f11251p = r8
            int r4 = r3.f11244i
            int r8 = r8 + r4
            if (r8 >= 0) goto L59
            goto L5a
        L59:
            r6 = r8
        L5a:
            r3.f11252q = r6
            r3.f11253r = r9
            java.util.List r4 = r3.f11237b
            int r4 = r4.size()
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            r3.f11258w = r4
            return
    }

    public final int a(long r3) {
            r2 = this;
            boolean r0 = r2.f11238c
            if (r0 == 0) goto Lc
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
        La:
            int r3 = (int) r3
            return r3
        Lc:
            r0 = 32
            long r3 = r3 >> r0
            goto La
    }

    public final long b(int r7) {
            r6 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            if (r7 != 0) goto L25
            java.util.List r3 = r6.f11237b
            int r3 = r3.size()
            if (r3 != 0) goto L25
            int r7 = r6.f11250o
            r3 = 0
            boolean r4 = r6.f11238c
            if (r4 == 0) goto L1f
            long r3 = (long) r3
            long r2 = r3 << r2
            long r4 = (long) r7
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
        L1f:
            long r4 = (long) r7
            long r4 = r4 << r2
            long r2 = (long) r3
            long r0 = r0 & r2
            long r0 = r0 | r4
            return r0
        L25:
            int r7 = r7 * 2
            int[] r3 = r6.f11258w
            r4 = r3[r7]
            int r7 = r7 + 1
            r7 = r3[r7]
            long r3 = (long) r4
            long r2 = r3 << r2
            long r4 = (long) r7
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public final void c(v1.a1 r18, boolean r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f11255t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto Lb
            goto L10
        Lb:
            java.lang.String r2 = "position() should be called first"
            o.b.a(r2)
        L10:
            java.util.List r7 = r0.f11237b
            int r8 = r7.size()
            r2 = 0
            r9 = r2
        L18:
            if (r9 >= r8) goto L15b
            java.lang.Object r2 = r7.get(r9)
            v1.b1 r2 = (v1.b1) r2
            int r3 = r0.f11256u
            boolean r4 = r0.f11238c
            if (r4 == 0) goto L29
            int r5 = r2.f13901h
            goto L2b
        L29:
            int r5 = r2.f13900g
        L2b:
            int r3 = r3 - r5
            int r5 = r0.f11257v
            long r10 = r0.b(r9)
            java.lang.Object r6 = r0.f11246k
            s.z r12 = r0.f11248m
            f.k0 r12 = r12.f12146a
            java.lang.Object r6 = r12.g(r6)
            s.x r6 = (s.x) r6
            r12 = 0
            if (r6 == 0) goto L46
            s.t[] r6 = r6.f12127a
            r6 = r6[r9]
            goto L47
        L46:
            r6 = r12
        L47:
            if (r6 == 0) goto La4
            if (r19 == 0) goto L51
            r6.f12110p = r10
            r15 = r7
            r16 = r8
            goto La1
        L51:
            long r13 = r6.f12110p
            r15 = r7
            r16 = r8
            long r7 = s.t.f12093q
            boolean r7 = u2.j.b(r13, r7)
            if (r7 != 0) goto L60
            long r10 = r6.f12110p
        L60:
            i0.j1 r7 = r6.f12109o
            java.lang.Object r7 = r7.getValue()
            u2.j r7 = (u2.j) r7
            long r7 = r7.f13347a
            long r7 = u2.j.d(r10, r7)
            int r13 = r0.a(r10)
            if (r13 > r3) goto L7a
            int r13 = r0.a(r7)
            if (r13 <= r3) goto L86
        L7a:
            int r3 = r0.a(r10)
            if (r3 < r5) goto La0
            int r3 = r0.a(r7)
            if (r3 < r5) goto La0
        L86:
            i0.j1 r3 = r6.f12100f
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto La0
            qg.t r3 = r6.f12095a
            s.s r5 = new s.s
            r10 = 1
            r5.<init>(r6, r12, r10)
            r10 = 3
            qg.v.q(r3, r12, r5, r10)
        La0:
            r10 = r7
        La1:
            i1.b r12 = r6.f12106l
            goto La7
        La4:
            r15 = r7
            r16 = r8
        La7:
            long r7 = r0.f11245j
            long r7 = u2.j.d(r10, r7)
            if (r19 != 0) goto Lb3
            if (r6 == 0) goto Lb3
            r6.f12105k = r7
        Lb3:
            r3 = 0
            if (r4 == 0) goto Ld1
            if (r12 == 0) goto Lc9
            r1.getClass()
            v1.a1.e(r1, r2)
            long r4 = r2.f13904k
            long r4 = u2.j.d(r7, r4)
            r2.B0(r4, r3, r12)
            goto L154
        Lc9:
            r5 = 0
            r6 = 6
            r3 = r7
            v1.a1.H(r1, r2, r3, r5, r6)
            goto L154
        Ld1:
            r4 = r7
            u2.m r6 = u2.m.f13354g
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 32
            if (r12 == 0) goto L117
            u2.m r11 = r1.m()
            if (r11 == r6) goto L10a
            int r6 = r1.w()
            if (r6 != 0) goto Lea
            goto L10a
        Lea:
            int r6 = r1.w()
            int r11 = r2.f13900g
            int r6 = r6 - r11
            long r13 = r4 >> r10
            int r11 = (int) r13
            int r6 = r6 - r11
            long r4 = r4 & r7
            int r4 = (int) r4
            long r5 = (long) r6
            long r5 = r5 << r10
            long r10 = (long) r4
            long r7 = r7 & r10
            long r4 = r5 | r7
            v1.a1.e(r1, r2)
            long r6 = r2.f13904k
            long r4 = u2.j.d(r4, r6)
            r2.B0(r4, r3, r12)
            goto L154
        L10a:
            v1.a1.e(r1, r2)
            long r6 = r2.f13904k
            long r4 = u2.j.d(r4, r6)
            r2.B0(r4, r3, r12)
            goto L154
        L117:
            int r11 = v1.d1.f13922b
            v1.c1 r11 = v1.c1.f13914h
            u2.m r12 = r1.m()
            if (r12 == r6) goto L148
            int r6 = r1.w()
            if (r6 != 0) goto L128
            goto L148
        L128:
            int r6 = r1.w()
            int r12 = r2.f13900g
            int r6 = r6 - r12
            long r12 = r4 >> r10
            int r12 = (int) r12
            int r6 = r6 - r12
            long r4 = r4 & r7
            int r4 = (int) r4
            long r5 = (long) r6
            long r5 = r5 << r10
            long r12 = (long) r4
            long r7 = r7 & r12
            long r4 = r5 | r7
            v1.a1.e(r1, r2)
            long r6 = r2.f13904k
            long r4 = u2.j.d(r4, r6)
            r2.A0(r4, r3, r11)
            goto L154
        L148:
            v1.a1.e(r1, r2)
            long r6 = r2.f13904k
            long r4 = u2.j.d(r4, r6)
            r2.A0(r4, r3, r11)
        L154:
            int r9 = r9 + 1
            r7 = r15
            r8 = r16
            goto L18
        L15b:
            return
    }

    public final void d(int r11, int r12, int r13) {
            r10 = this;
            r10.f11250o = r11
            boolean r0 = r10.f11238c
            if (r0 == 0) goto L8
            r1 = r13
            goto L9
        L8:
            r1 = r12
        L9:
            r10.f11255t = r1
            java.util.List r1 = r10.f11237b
            int r2 = r1.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L5e
            java.lang.Object r4 = r1.get(r3)
            v1.b1 r4 = (v1.b1) r4
            int r5 = r3 * 2
            int[] r6 = r10.f11258w
            if (r0 == 0) goto L3f
            y0.e r7 = r10.f11239d
            if (r7 == 0) goto L36
            int r8 = r4.f13900g
            u2.m r9 = r10.f11241f
            int r7 = r7.a(r8, r12, r9)
            r6[r5] = r7
            int r5 = r5 + 1
            r6[r5] = r11
            int r4 = r4.f13901h
        L34:
            int r11 = r11 + r4
            goto L52
        L36:
            java.lang.String r11 = "null horizontalAlignment when isVertical == true"
            o.b.b(r11)
            okio.a.c()
            return
        L3f:
            r6[r5] = r11
            int r5 = r5 + 1
            y0.f r7 = r10.f11240e
            if (r7 == 0) goto L55
            int r8 = r4.f13901h
            int r7 = r7.a(r8, r13)
            r6[r5] = r7
            int r4 = r4.f13900g
            goto L34
        L52:
            int r3 = r3 + 1
            goto L12
        L55:
            java.lang.String r11 = "null verticalAlignment when isVertical == false"
            o.b.b(r11)
            okio.a.c()
            return
        L5e:
            int r11 = r10.f11242g
            int r11 = -r11
            r10.f11256u = r11
            int r11 = r10.f11255t
            int r12 = r10.f11243h
            int r11 = r11 + r12
            r10.f11257v = r11
            return
    }
}
