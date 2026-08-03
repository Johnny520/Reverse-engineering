package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f6132y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.d f6133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u2.c f6134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u2.m f6135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fg.l f6136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1.f f6137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.graphics.Outline f6138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f1.c0 f6143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f1.j f6144l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f1.j f6145m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h1.b f6147o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f1.h f6148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b.f f6150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6151s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f6154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public android.graphics.RectF f6156x;

    static {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "robolectric"
            r0.equals(r1)
            return
    }

    public b(i1.d r6) {
            r5 = this;
            r5.<init>()
            r5.f6133a = r6
            u2.d r0 = h1.c.f5041a
            r5.f6134b = r0
            u2.m r0 = u2.m.f13354g
            r5.f6135c = r0
            i1.a r0 = i1.a.f6129h
            r5.f6136d = r0
            b1.f r0 = new b1.f
            r1 = 13
            r0.<init>(r5, r1)
            r5.f6137e = r0
            r0 = 1
            r5.f6139g = r0
            r0 = 0
            r5.f6140h = r0
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.f6141i = r2
            b.f r4 = new b.f
            r4.<init>()
            r5.f6150r = r4
            r4 = 0
            r6.r(r4)
            r5.f6152t = r0
            r5.f6153u = r0
            r5.f6154v = r2
            return
    }

    public final void a() {
            r17 = this;
            r0 = r17
            boolean r1 = r0.f6139g
            r2 = 0
            if (r1 == 0) goto L14c
            boolean r1 = r0.f6155w
            r3 = 0
            i1.d r4 = r0.f6133a
            if (r1 != 0) goto L22
            float r1 = r4.M()
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L18
            goto L22
        L18:
            r4.r(r2)
            r5 = 0
            r4.e(r3, r5)
            goto L14c
        L22:
            f1.j r1 = r0.f6144l
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 32
            if (r1 == 0) goto Lca
            android.graphics.RectF r8 = r0.f6156x
            if (r8 != 0) goto L38
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r0.f6156x = r8
        L38:
            boolean r9 = r1 instanceof f1.j
            java.lang.String r10 = "Unable to obtain android.graphics.Path"
            if (r9 == 0) goto Lc6
            android.graphics.Path r11 = r1.f3067a
            r11.computeBounds(r8, r2)
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            r13 = 1
            if (r11 > r12) goto L5e
            android.graphics.Path r12 = r1.f3067a
            boolean r12 = r12.isConvex()
            if (r12 == 0) goto L53
            goto L5e
        L53:
            android.graphics.Outline r9 = r0.f6138f
            if (r9 == 0) goto L5a
            r9.setEmpty()
        L5a:
            r0.f6146n = r13
            r12 = r3
            goto L87
        L5e:
            android.graphics.Outline r12 = r0.f6138f
            if (r12 != 0) goto L69
            android.graphics.Outline r12 = new android.graphics.Outline
            r12.<init>()
            r0.f6138f = r12
        L69:
            r14 = 30
            if (r11 < r14) goto L79
            if (r9 == 0) goto L75
            android.graphics.Path r9 = r1.f3067a
            g3.o0.k(r12, r9)
            goto L80
        L75:
            j8.o.w(r10)
            return
        L79:
            if (r9 == 0) goto Lc2
            android.graphics.Path r9 = r1.f3067a
            r12.setConvexPath(r9)
        L80:
            boolean r9 = r12.canClip()
            r9 = r9 ^ r13
            r0.f6146n = r9
        L87:
            r0.f6144l = r1
            if (r12 == 0) goto L93
            float r1 = r4.a()
            r12.setAlpha(r1)
            r3 = r12
        L93:
            float r1 = r8.width()
            int r1 = java.lang.Math.round(r1)
            float r8 = r8.height()
            int r8 = java.lang.Math.round(r8)
            long r9 = (long) r1
            long r9 = r9 << r7
            long r7 = (long) r8
            long r5 = r5 & r7
            long r5 = r5 | r9
            r4.e(r3, r5)
            boolean r1 = r0.f6146n
            if (r1 == 0) goto Lbb
            boolean r1 = r0.f6155w
            if (r1 == 0) goto Lbb
            r4.r(r2)
            r4.j()
            goto L14c
        Lbb:
            boolean r1 = r0.f6155w
            r4.r(r1)
            goto L14c
        Lc2:
            j8.o.w(r10)
            return
        Lc6:
            j8.o.w(r10)
            return
        Lca:
            boolean r1 = r0.f6155w
            r4.r(r1)
            android.graphics.Outline r1 = r0.f6138f
            if (r1 != 0) goto Lda
            android.graphics.Outline r1 = new android.graphics.Outline
            r1.<init>()
            r0.f6138f = r1
        Lda:
            r8 = r1
            long r9 = r0.f6153u
            long r9 = r9.e0.q0(r9)
            long r11 = r0.f6140h
            long r13 = r0.f6141i
            r15 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r1 != 0) goto Lef
            goto Lf0
        Lef:
            r9 = r13
        Lf0:
            long r13 = r11 >> r7
            int r1 = (int) r13
            float r3 = java.lang.Float.intBitsToFloat(r1)
            int r3 = java.lang.Math.round(r3)
            long r11 = r11 & r5
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = java.lang.Math.round(r12)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r13 = r9 >> r7
            int r14 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r14)
            float r13 = r13 + r1
            int r1 = java.lang.Math.round(r13)
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r9 = r9 & r5
            int r15 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r15)
            float r9 = r9 + r11
            int r9 = java.lang.Math.round(r9)
            float r13 = r0.f6142j
            r11 = r1
            r10 = r12
            r12 = r9
            r9 = r3
            r8.setRoundRect(r9, r10, r11, r12, r13)
            float r1 = r4.a()
            r8.setAlpha(r1)
            float r1 = java.lang.Float.intBitsToFloat(r14)
            int r1 = java.lang.Math.round(r1)
            float r3 = java.lang.Float.intBitsToFloat(r15)
            int r3 = java.lang.Math.round(r3)
            long r9 = (long) r1
            long r9 = r9 << r7
            long r11 = (long) r3
            long r5 = r5 & r11
            long r5 = r5 | r9
            r4.e(r8, r5)
        L14c:
            r0.f6139g = r2
            return
    }

    public final void b() {
            r15 = this;
            boolean r0 = r15.f6151s
            if (r0 == 0) goto L75
            int r0 = r15.f6149q
            if (r0 != 0) goto L75
            b.f r0 = r15.f6150r
            java.lang.Object r1 = r0.f335b
            i1.b r1 = (i1.b) r1
            if (r1 == 0) goto L1c
            int r2 = r1.f6149q
            int r2 = r2 + (-1)
            r1.f6149q = r2
            r1.b()
            r1 = 0
            r0.f335b = r1
        L1c:
            java.lang.Object r0 = r0.f337d
            f.l0 r0 = (f.l0) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.f2856b
            long[] r2 = r0.f2855a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            i1.b r11 = (i1.b) r11
            int r12 = r11.f6149q
            int r12 = r12 + (-1)
            r11.f6149q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            i1.d r0 = r15.f6133a
            r0.j()
        L75:
            return
    }

    public final void c(h1.d r15) {
            r14 = this;
            b.f r0 = r14.f6150r
            java.lang.Object r1 = r0.f335b
            i1.b r1 = (i1.b) r1
            r0.f336c = r1
            java.lang.Object r1 = r0.f337d
            f.l0 r1 = (f.l0) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f338e
            f.l0 r2 = (f.l0) r2
            if (r2 != 0) goto L23
            f.l0 r2 = f.s0.f2899a
            f.l0 r2 = new f.l0
            r2.<init>()
            r0.f338e = r2
        L23:
            r2.j(r1)
            r1.b()
        L29:
            r1 = 1
            r0.f334a = r1
            fg.l r1 = r14.f6136d
            r1.invoke(r15)
            r15 = 0
            r0.f334a = r15
            java.lang.Object r1 = r0.f336c
            i1.b r1 = (i1.b) r1
            if (r1 == 0) goto L43
            int r2 = r1.f6149q
            int r2 = r2 + (-1)
            r1.f6149q = r2
            r1.b()
        L43:
            java.lang.Object r0 = r0.f338e
            f.l0 r0 = (f.l0) r0
            if (r0 == 0) goto L9c
            boolean r1 = r0.h()
            if (r1 == 0) goto L9c
            java.lang.Object[] r1 = r0.f2856b
            long[] r2 = r0.f2855a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L99
            r4 = r15
        L59:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L94
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L73:
            if (r9 >= r7) goto L92
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L8e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            i1.b r10 = (i1.b) r10
            int r11 = r10.f6149q
            int r11 = r11 + (-1)
            r10.f6149q = r11
            r10.b()
        L8e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L73
        L92:
            if (r7 != r8) goto L99
        L94:
            if (r4 == r3) goto L99
            int r4 = r4 + 1
            goto L59
        L99:
            r0.b()
        L9c:
            return
    }

    public final f1.c0 d() {
            r14 = this;
            f1.c0 r0 = r14.f6143k
            f1.j r1 = r14.f6144l
            if (r0 == 0) goto L7
            return r0
        L7:
            if (r1 == 0) goto L11
            f1.j0 r0 = new f1.j0
            r0.<init>(r1)
            r14.f6143k = r0
            return r0
        L11:
            long r0 = r14.f6153u
            long r0 = r9.e0.q0(r0)
            long r2 = r14.f6140h
            long r4 = r14.f6141i
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L25
            goto L26
        L25:
            r0 = r4
        L26:
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r7
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r9 = r0 >> r4
            int r3 = (int) r9
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 + r6
            long r0 = r0 & r7
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r9 = r0 + r2
            float r0 = r14.f6142j
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6c
            f1.l0 r1 = new f1.l0
            int r5 = java.lang.Float.floatToRawIntBits(r0)
            long r10 = (long) r5
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r12 = (long) r0
            long r4 = r10 << r4
            long r7 = r7 & r12
            long r10 = r4 | r7
            r7 = r2
            r8 = r3
            e1.d r0 = be.h.b(r6, r7, r8, r9, r10)
            r1.<init>(r0)
            goto L78
        L6c:
            r7 = r2
            r8 = r3
            f1.k0 r1 = new f1.k0
            e1.c r0 = new e1.c
            r0.<init>(r6, r7, r8, r9)
            r1.<init>(r0)
        L78:
            r14.f6143k = r1
            return r1
    }

    public final void e(u2.c r7, u2.m r8, long r9, fg.l r11) {
            r6 = this;
            long r0 = r6.f6153u
            boolean r0 = u2.l.a(r0, r9)
            i1.d r1 = r6.f6133a
            if (r0 != 0) goto L2e
            r6.f6153u = r9
            long r2 = r6.f6152t
            r0 = 32
            long r4 = r2 >> r0
            int r0 = (int) r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            r1.y(r0, r2, r9)
            long r9 = r6.f6141i
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 != 0) goto L2e
            r9 = 1
            r6.f6139g = r9
            r6.a()
        L2e:
            r6.f6134b = r7
            r6.f6135c = r8
            r6.f6136d = r11
            b1.f r9 = r6.f6137e
            r1.m(r7, r8, r6, r9)
            return
    }

    public final void f(float r3) {
            r2 = this;
            i1.d r0 = r2.f6133a
            float r1 = r0.a()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Lb
            return
        Lb:
            r0.n(r3)
            return
    }

    public final void g(f1.n0 r3) {
            r2 = this;
            i1.d r0 = r2.f6133a
            f1.n0 r1 = r0.d()
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto Lf
            r0.L(r3)
        Lf:
            return
    }

    public final void h(float r3, long r4, long r6) {
            r2 = this;
            long r0 = r2.f6140h
            boolean r0 = e1.b.b(r0, r4)
            if (r0 == 0) goto L1c
            long r0 = r2.f6141i
            boolean r0 = e1.e.a(r0, r6)
            if (r0 == 0) goto L1c
            float r0 = r2.f6142j
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            f1.j r0 = r2.f6144l
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            r0 = 0
            r2.f6143k = r0
            r2.f6144l = r0
            r0 = 1
            r2.f6139g = r0
            r0 = 0
            r2.f6146n = r0
            r2.f6140h = r4
            r2.f6141i = r6
            r2.f6142j = r3
            r2.a()
            return
    }

    public final void i(long r6) {
            r5 = this;
            long r0 = r5.f6152t
            boolean r0 = u2.j.b(r0, r6)
            if (r0 != 0) goto L1d
            r5.f6152t = r6
            long r0 = r5.f6153u
            r2 = 32
            long r2 = r6 >> r2
            int r2 = (int) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            int r6 = (int) r6
            i1.d r7 = r5.f6133a
            r7.y(r2, r6, r0)
        L1d:
            return
    }
}
