package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.h f7694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f7695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f7696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f7697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.HashMap f7698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f.w f7699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0.m0 f7709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0.m0 f7710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0.m0 f7711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f.w f7712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f.v f7717x;

    public k(l0.h r4) {
            r3 = this;
            r3.<init>()
            r3.f7694a = r4
            int[] r0 = r4.f7680g
            r3.f7695b = r0
            java.lang.Object[] r1 = r4.f7682i
            r3.f7696c = r1
            java.util.ArrayList r2 = r4.f7688o
            r3.f7697d = r2
            java.util.HashMap r2 = r4.f7689p
            r3.f7698e = r2
            f.w r2 = r4.f7690q
            r3.f7699f = r2
            int r2 = r4.f7681h
            r3.f7700g = r2
            int r0 = r0.length
            int r0 = r0 / 5
            int r0 = r0 - r2
            r3.f7701h = r0
            int r4 = r4.f7683j
            r3.f7704k = r4
            int r0 = r1.length
            int r0 = r0 - r4
            r3.f7705l = r0
            r3.f7706m = r2
            i0.m0 r4 = new i0.m0
            r4.<init>()
            r3.f7709p = r4
            i0.m0 r4 = new i0.m0
            r4.<init>()
            r3.f7710q = r4
            i0.m0 r4 = new i0.m0
            r4.<init>()
            r3.f7711r = r4
            r3.f7714u = r2
            r4 = -1
            r3.f7715v = r4
            return
    }

    public static int i(int r0, int r1, int r2, int r3) {
            if (r0 <= r1) goto L7
            int r3 = r3 - r2
            int r3 = r3 - r0
            int r3 = r3 + 1
            int r0 = -r3
        L7:
            return r0
    }

    public static void z(l0.k r6) {
            int r0 = r6.f7715v
            int r1 = r6.r(r0)
            int[] r2 = r6.f7695b
            int r1 = r1 * 5
            int r1 = r1 + 1
            r3 = r2[r1]
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            goto L21
        L15:
            r5 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            r3 = r3 & r5
            r3 = r3 | r4
            r2[r1] = r3
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r3
            if (r1 == 0) goto L22
        L21:
            return
        L22:
            int r0 = r6.E(r2, r0)
            r6.T(r0)
            return
    }

    public final void A(l0.h r16, int r17) {
            r15 = this;
            r0 = r16
            int r1 = r15.f7707n
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "Check failed"
            i0.m.a(r1)
        Lc:
            r7 = 0
            if (r17 != 0) goto L62
            int r1 = r15.f7713t
            if (r1 != 0) goto L62
            l0.h r1 = r15.f7694a
            int r1 = r1.f7681h
            if (r1 != 0) goto L62
            int[] r1 = r0.f7680g
            int r2 = r17 * 5
            int r2 = r2 + 3
            r2 = r1[r2]
            int r4 = r0.f7681h
            if (r2 != r4) goto L62
            int[] r2 = r15.f7695b
            java.lang.Object[] r5 = r15.f7696c
            java.util.ArrayList r6 = r15.f7697d
            java.util.HashMap r8 = r15.f7698e
            f.w r9 = r15.f7699f
            java.lang.Object[] r10 = r0.f7682i
            int r11 = r0.f7683j
            java.util.HashMap r12 = r0.f7689p
            f.w r13 = r0.f7690q
            r15.f7695b = r1
            r15.f7696c = r10
            java.util.ArrayList r14 = r0.f7688o
            r15.f7697d = r14
            r15.f7700g = r4
            int r1 = r1.length
            int r1 = r1 / 5
            int r1 = r1 - r4
            r15.f7701h = r1
            r15.f7704k = r11
            int r1 = r10.length
            int r1 = r1 - r11
            r15.f7705l = r1
            r15.f7706m = r4
            r15.f7698e = r12
            r15.f7699f = r13
            r0.f7680g = r2
            r0.f7681h = r7
            r0.f7682i = r5
            r0.f7683j = r7
            r0.f7688o = r6
            r0.f7689p = r8
            r0.f7690q = r9
            return
        L62:
            l0.k r1 = r0.e()
            r4 = 1
            r5 = 1
            r6 = 0
            r3 = r15
            r2 = r17
            ig.a.O(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L74
            r0 = 1
            r1.e(r0)
            return
        L74:
            r0 = move-exception
            r1.e(r7)
            throw r0
    }

    public final void B(int r9) {
            r8 = this;
            int r0 = r8.f7701h
            int r1 = r8.f7700g
            if (r1 == r9) goto Lab
            java.util.ArrayList r2 = r8.f7697d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L59
            int r2 = r8.f7701h
            int r3 = r8.o()
            int r3 = r3 - r2
            java.util.ArrayList r2 = r8.f7697d
            if (r1 >= r9) goto L39
            int r2 = l0.j.a(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.f7697d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f7697d
            java.lang.Object r4 = r4.get(r2)
            l0.b r4 = (l0.b) r4
            int r5 = r4.f7654a
            if (r5 >= 0) goto L59
            int r5 = r5 + r3
            if (r5 >= r9) goto L59
            r4.f7654a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            int r2 = l0.j.a(r2, r9, r3)
        L3d:
            java.util.ArrayList r4 = r8.f7697d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f7697d
            java.lang.Object r4 = r4.get(r2)
            l0.b r4 = (l0.b) r4
            int r5 = r4.f7654a
            if (r5 < 0) goto L59
            int r5 = r3 - r5
            int r5 = -r5
            r4.f7654a = r5
            int r2 = r2 + 1
            goto L3d
        L59:
            if (r0 <= 0) goto L70
            int[] r2 = r8.f7695b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6a
            int r4 = r4 + r3
            tf.l.p0(r2, r2, r4, r3, r5)
            goto L70
        L6a:
            int r6 = r5 + r4
            int r3 = r3 + r4
            tf.l.p0(r2, r2, r5, r6, r3)
        L70:
            if (r9 >= r1) goto L74
            int r1 = r9 + r0
        L74:
            int r2 = r8.o()
            if (r1 >= r2) goto L7b
            goto L80
        L7b:
            java.lang.String r3 = "Check failed"
            i0.m.a(r3)
        L80:
            if (r1 >= r2) goto Lab
            int[] r3 = r8.f7695b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L8f
            r6 = r3
            goto L95
        L8f:
            int r6 = r8.p()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L95:
            if (r6 >= r9) goto L98
            goto L9f
        L98:
            int r7 = r8.p()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        L9f:
            if (r6 == r3) goto La5
            int[] r3 = r8.f7695b
            r3[r4] = r6
        La5:
            int r1 = r1 + 1
            if (r1 != r9) goto L80
            int r1 = r1 + r0
            goto L80
        Lab:
            r8.f7700g = r9
            return
    }

    public final void C(int r8, int r9) {
            r7 = this;
            int r0 = r7.f7705l
            int r1 = r7.f7704k
            int r2 = r7.f7706m
            if (r1 == r8) goto L1b
            java.lang.Object[] r3 = r7.f7696c
            if (r8 >= r1) goto L13
            int r4 = r8 + r0
            int r1 = r1 - r8
            java.lang.System.arraycopy(r3, r8, r3, r4, r1)
            goto L1b
        L13:
            int r4 = r1 + r0
            int r5 = r8 + r0
            int r5 = r5 - r4
            java.lang.System.arraycopy(r3, r4, r3, r1, r5)
        L1b:
            int r9 = r9 + 1
            int r1 = r7.p()
            int r9 = java.lang.Math.min(r9, r1)
            if (r2 == r9) goto L87
            java.lang.Object[] r1 = r7.f7696c
            int r1 = r1.length
            int r1 = r1 - r0
            if (r9 >= r2) goto L5a
            int r0 = r7.r(r9)
            int r2 = r7.r(r2)
            int r3 = r7.f7700g
        L37:
            if (r0 >= r2) goto L85
            int[] r4 = r7.f7695b
            int r5 = r0 * 5
            int r5 = r5 + 4
            r4 = r4[r5]
            if (r4 < 0) goto L44
            goto L49
        L44:
            java.lang.String r6 = "Unexpected anchor value, expected a positive anchor"
            i0.m.a(r6)
        L49:
            int[] r6 = r7.f7695b
            int r4 = r1 - r4
            int r4 = r4 + 1
            int r4 = -r4
            r6[r5] = r4
            int r0 = r0 + 1
            if (r0 != r3) goto L37
            int r4 = r7.f7701h
            int r0 = r0 + r4
            goto L37
        L5a:
            int r0 = r7.r(r2)
            int r2 = r7.r(r9)
        L62:
            if (r0 >= r2) goto L85
            int[] r3 = r7.f7695b
            int r4 = r0 * 5
            int r4 = r4 + 4
            r3 = r3[r4]
            if (r3 >= 0) goto L6f
            goto L74
        L6f:
            java.lang.String r5 = "Unexpected anchor value, expected a negative anchor"
            i0.m.a(r5)
        L74:
            int[] r5 = r7.f7695b
            int r3 = r3 + r1
            int r3 = r3 + 1
            r5[r4] = r3
            int r0 = r0 + 1
            int r3 = r7.f7700g
            if (r0 != r3) goto L62
            int r3 = r7.f7701h
            int r0 = r0 + r3
            goto L62
        L85:
            r7.f7706m = r9
        L87:
            r7.f7704k = r8
            return
    }

    public final java.lang.Object D(int r4) {
            r3 = this;
            int r4 = r3.r(r4)
            int[] r0 = r3.f7695b
            int r1 = r4 * 5
            int r1 = r1 + 1
            r1 = r0[r1]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L1e
            java.lang.Object[] r1 = r3.f7696c
            int r4 = r3.g(r0, r4)
            int r4 = r3.h(r4)
            r4 = r1[r4]
            return r4
        L1e:
            r4 = 0
            return r4
    }

    public final int E(int[] r2, int r3) {
            r1 = this;
            int r3 = r1.r(r3)
            int r3 = r3 * 5
            int r3 = r3 + 2
            r2 = r2[r3]
            r3 = -2
            if (r2 <= r3) goto Le
            return r2
        Le:
            int r0 = r1.p()
            int r0 = r0 + r2
            int r0 = r0 - r3
            return r0
    }

    public final java.lang.Object F(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f7707n
            r1 = 1
            if (r0 <= 0) goto La
            int r0 = r4.f7715v
            r4.x(r1, r0)
        La:
            java.lang.Object[] r0 = r4.f7696c
            int r2 = r4.f7702i
            int r3 = r2 + 1
            r4.f7702i = r3
            int r2 = r4.h(r2)
            r0 = r0[r2]
            int r2 = r4.f7702i
            int r3 = r4.f7703j
            if (r2 > r3) goto L1f
            goto L24
        L1f:
            java.lang.String r2 = "Writing to an invalid slot"
            i0.m.a(r2)
        L24:
            java.lang.Object[] r2 = r4.f7696c
            int r3 = r4.f7702i
            int r3 = r3 - r1
            int r1 = r4.h(r3)
            r2[r1] = r5
            return r0
    }

    public final void G() {
            r9 = this;
            f.v r0 = r9.f7717x
            if (r0 == 0) goto L56
        L4:
            int r1 = r0.f2916b
            if (r1 == 0) goto L56
            int r1 = g4.a.L(r0)
            int r2 = r9.r(r1)
            int r3 = r1 + 1
            int r4 = r9.u(r1)
            int r4 = r4 + r1
        L17:
            r5 = 0
            r6 = 1
            if (r3 >= r4) goto L33
            int[] r7 = r9.f7695b
            int r8 = r9.r(r3)
            int r8 = r8 * 5
            int r8 = r8 + r6
            r7 = r7[r8]
            r8 = 201326592(0xc000000, float:9.8607613E-32)
            r7 = r7 & r8
            if (r7 == 0) goto L2d
            r3 = r6
            goto L34
        L2d:
            int r5 = r9.u(r3)
            int r3 = r3 + r5
            goto L17
        L33:
            r3 = r5
        L34:
            int[] r4 = r9.f7695b
            int r2 = r2 * 5
            int r2 = r2 + r6
            r7 = r4[r2]
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = r8 & r7
            if (r8 == 0) goto L41
            r5 = r6
        L41:
            if (r5 == r3) goto L4
            r5 = -67108865(0xfffffffffbffffff, float:-2.6584558E36)
            r5 = r5 & r7
            int r3 = r3 << 26
            r3 = r3 | r5
            r4[r2] = r3
            int r1 = r9.E(r4, r1)
            if (r1 < 0) goto L4
            g4.a.e(r0, r1)
            goto L4
        L56:
            return
    }

    public final boolean H() {
            r7 = this;
            int r0 = r7.f7707n
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot remove group while inserting"
            i0.m.a(r0)
        La:
            int r0 = r7.f7713t
            int r1 = r7.f7702i
            int[] r2 = r7.f7695b
            int r3 = r7.r(r0)
            int r2 = r7.g(r2, r3)
            int r3 = r7.L()
            int r4 = r7.f7715v
            r7.O(r4)
            f.v r4 = r7.f7717x
            if (r4 == 0) goto L3d
        L25:
            int r5 = r4.f2916b
            if (r5 == 0) goto L3d
            if (r5 == 0) goto L36
            int[] r5 = r4.f2915a
            r6 = 0
            r5 = r5[r6]
            if (r5 < r0) goto L3d
            g4.a.L(r4)
            goto L25
        L36:
            java.lang.String r0 = "IntList is empty."
            j8.o.l(r0)
            r0 = 0
            return r0
        L3d:
            int r4 = r7.f7713t
            int r4 = r4 - r0
            boolean r4 = r7.I(r0, r4)
            int r5 = r7.f7702i
            int r5 = r5 - r2
            int r6 = r0 + (-1)
            r7.J(r2, r5, r6)
            r7.f7713t = r0
            r7.f7702i = r1
            int r0 = r7.f7708o
            int r0 = r0 - r3
            r7.f7708o = r0
            return r4
    }

    public final boolean I(int r10, int r11) {
            r9 = this;
            r0 = 0
            if (r11 <= 0) goto L93
            java.util.ArrayList r1 = r9.f7697d
            r9.B(r10)
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 != 0) goto L61
            java.util.HashMap r1 = r9.f7698e
            int r3 = r9.f7701h
            int r4 = r10 + r11
            int r5 = r9.o()
            int r5 = r5 - r3
            java.util.ArrayList r3 = r9.f7697d
            int r3 = l0.j.a(r3, r4, r5)
            java.util.ArrayList r5 = r9.f7697d
            int r5 = r5.size()
            if (r3 < r5) goto L2a
            int r3 = r3 + (-1)
        L2a:
            int r5 = r3 + 1
            r6 = r0
        L2d:
            if (r3 < 0) goto L53
            java.util.ArrayList r7 = r9.f7697d
            java.lang.Object r7 = r7.get(r3)
            l0.b r7 = (l0.b) r7
            int r8 = r9.c(r7)
            if (r8 < r10) goto L53
            if (r8 >= r4) goto L50
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.f7654a = r5
            if (r1 == 0) goto L4b
            java.lang.Object r5 = r1.remove(r7)
            l0.c r5 = (l0.c) r5
        L4b:
            if (r6 != 0) goto L4f
            int r6 = r3 + 1
        L4f:
            r5 = r3
        L50:
            int r3 = r3 + (-1)
            goto L2d
        L53:
            if (r5 >= r6) goto L56
            r0 = r2
        L56:
            if (r0 == 0) goto L61
            java.util.ArrayList r1 = r9.f7697d
            java.util.List r1 = r1.subList(r5, r6)
            r1.clear()
        L61:
            r9.f7700g = r10
            int r1 = r9.f7701h
            int r1 = r1 + r11
            r9.f7701h = r1
            int r1 = r9.f7706m
            if (r1 <= r10) goto L73
            int r1 = r1 - r11
            int r10 = java.lang.Math.max(r10, r1)
            r9.f7706m = r10
        L73:
            int r10 = r9.f7714u
            int r1 = r9.f7700g
            if (r10 < r1) goto L7c
            int r10 = r10 - r11
            r9.f7714u = r10
        L7c:
            int r10 = r9.f7715v
            if (r10 < 0) goto L93
            int[] r11 = r9.f7695b
            int r1 = r9.r(r10)
            int r1 = r1 * 5
            int r1 = r1 + r2
            r11 = r11[r1]
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r11 = r11 & r1
            if (r11 == 0) goto L93
            r9.T(r10)
        L93:
            return r0
    }

    public final void J(int r3, int r4, int r5) {
            r2 = this;
            if (r4 <= 0) goto L1b
            int r0 = r2.f7705l
            int r1 = r3 + r4
            r2.C(r1, r5)
            r2.f7704k = r3
            int r0 = r0 + r4
            r2.f7705l = r0
            java.lang.Object[] r5 = r2.f7696c
            r0 = 0
            java.util.Arrays.fill(r5, r3, r1, r0)
            int r5 = r2.f7703j
            if (r5 < r3) goto L1b
            int r5 = r5 - r4
            r2.f7703j = r5
        L1b:
            return
    }

    public final java.lang.Object K(int r4, int r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.r(r4)
            int[] r1 = r3.f7695b
            int r0 = r3.N(r1, r0)
            int[] r1 = r3.f7695b
            int r2 = r4 + 1
            int r2 = r3.r(r2)
            int r1 = r3.g(r1, r2)
            int r2 = r0 + r5
            if (r2 < r0) goto L1d
            if (r2 >= r1) goto L1d
            goto L36
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Write to an invalid slot index "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " for group "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            i0.m.a(r4)
        L36:
            int r4 = r3.h(r2)
            java.lang.Object[] r5 = r3.f7696c
            r0 = r5[r4]
            r5[r4] = r6
            return r0
    }

    public final int L() {
            r4 = this;
            int r0 = r4.f7713t
            int r0 = r4.r(r0)
            int r1 = r4.f7713t
            int[] r2 = r4.f7695b
            int r0 = r0 * 5
            int r3 = r0 + 3
            r3 = r2[r3]
            int r3 = r3 + r1
            r4.f7713t = r3
            int r1 = r4.r(r3)
            int r1 = r4.g(r2, r1)
            r4.f7702i = r1
            int[] r1 = r4.f7695b
            r2 = 1
            int r0 = r0 + r2
            r0 = r1[r0]
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L29
            return r2
        L29:
            r1 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r1
            return r0
    }

    public final void M() {
            r2 = this;
            int r0 = r2.f7714u
            r2.f7713t = r0
            int[] r1 = r2.f7695b
            int r0 = r2.r(r0)
            int r0 = r2.g(r1, r0)
            r2.f7702i = r0
            return
    }

    public final int N(int[] r2, int r3) {
            r1 = this;
            int r0 = r1.o()
            if (r3 < r0) goto Ld
            java.lang.Object[] r2 = r1.f7696c
            int r2 = r2.length
            int r3 = r1.f7705l
            int r2 = r2 - r3
            return r2
        Ld:
            int r2 = l0.j.b(r2, r3)
            int r3 = r1.f7705l
            java.lang.Object[] r0 = r1.f7696c
            int r0 = r0.length
            if (r2 >= 0) goto L1d
            int r0 = r0 - r3
            int r0 = r0 + r2
            int r0 = r0 + 1
            return r0
        L1d:
            return r2
    }

    public final l0.c O(int r3) {
            r2 = this;
            java.util.HashMap r0 = r2.f7698e
            r1 = 0
            if (r0 == 0) goto L12
            l0.b r3 = r2.R(r3)
            if (r3 == 0) goto L12
            java.lang.Object r3 = r0.get(r3)
            l0.c r3 = (l0.c) r3
            return r3
        L12:
            return r1
    }

    public final void P() {
            r2 = this;
            int r0 = r2.f7707n
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Key must be supplied when inserting"
            i0.m.a(r0)
        La:
            i0.e r0 = i0.l.f5952a
            r1 = 0
            r2.Q(r1, r0, r0, r1)
            return
    }

    public final void Q(int r12, java.lang.Object r13, java.lang.Object r14, boolean r15) {
            r11 = this;
            int r0 = r11.f7715v
            int r1 = r11.f7707n
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            i0.m0 r4 = r11.f7711r
            int r5 = r11.f7708o
            r4.c(r5)
            i0.e r4 = i0.l.f5952a
            if (r1 == 0) goto La4
            int r1 = r11.f7713t
            int[] r5 = r11.f7695b
            int r6 = r11.r(r1)
            int r5 = r11.g(r5, r6)
            r11.w(r3)
            r11.f7702i = r5
            r11.f7703j = r5
            int r6 = r11.r(r1)
            if (r13 == r4) goto L31
            r7 = r3
            goto L32
        L31:
            r7 = r2
        L32:
            if (r15 != 0) goto L38
            if (r14 == r4) goto L38
            r4 = r3
            goto L39
        L38:
            r4 = r2
        L39:
            int r8 = r11.f7705l
            int r9 = r11.f7704k
            java.lang.Object[] r10 = r11.f7696c
            int r10 = r10.length
            int r5 = i(r5, r9, r8, r10)
            if (r5 < 0) goto L53
            int r8 = r11.f7706m
            if (r8 >= r1) goto L53
            java.lang.Object[] r8 = r11.f7696c
            int r8 = r8.length
            int r9 = r11.f7705l
            int r8 = r8 - r9
            int r8 = r8 - r5
            int r8 = r8 + r3
            int r5 = -r8
        L53:
            int[] r3 = r11.f7695b
            int r8 = r11.f7715v
            int r6 = r6 * 5
            r3[r6] = r12
            int r12 = r6 + 1
            int r9 = r15 << 30
            int r10 = r7 << 29
            r9 = r9 | r10
            int r10 = r4 << 28
            r9 = r9 | r10
            r3[r12] = r9
            int r12 = r6 + 2
            r3[r12] = r8
            int r12 = r6 + 3
            r3[r12] = r2
            int r6 = r6 + 4
            r3[r6] = r5
            int r12 = r15 + r7
            int r12 = r12 + r4
            if (r12 <= 0) goto L96
            r11.x(r12, r1)
            java.lang.Object[] r12 = r11.f7696c
            int r3 = r11.f7702i
            if (r15 == 0) goto L86
            int r15 = r3 + 1
            r12[r3] = r14
            r3 = r15
        L86:
            if (r7 == 0) goto L8d
            int r15 = r3 + 1
            r12[r3] = r13
            r3 = r15
        L8d:
            if (r4 == 0) goto L94
            int r13 = r3 + 1
            r12[r3] = r14
            r3 = r13
        L94:
            r11.f7702i = r3
        L96:
            r11.f7708o = r2
            int r12 = r1 + 1
            r11.f7715v = r1
            r11.f7713t = r12
            if (r0 < 0) goto Lff
            r11.O(r0)
            goto Lff
        La4:
            i0.m0 r12 = r11.f7709p
            r12.c(r0)
            int r12 = r11.o()
            int r13 = r11.f7701h
            int r12 = r12 - r13
            int r13 = r11.f7714u
            int r12 = r12 - r13
            i0.m0 r13 = r11.f7710q
            r13.c(r12)
            int r12 = r11.f7713t
            int r13 = r11.r(r12)
            boolean r0 = gg.l.a(r14, r4)
            if (r0 != 0) goto Lcf
            if (r15 == 0) goto Lcc
            int r15 = r11.f7713t
            r11.U(r15, r14)
            goto Lcf
        Lcc:
            r11.S(r14)
        Lcf:
            int[] r14 = r11.f7695b
            int r14 = r11.N(r14, r13)
            r11.f7702i = r14
            int[] r14 = r11.f7695b
            int r15 = r11.f7713t
            int r15 = r15 + r3
            int r15 = r11.r(r15)
            int r14 = r11.g(r14, r15)
            r11.f7703j = r14
            int[] r14 = r11.f7695b
            int r13 = r13 * 5
            int r15 = r13 + 1
            r15 = r14[r15]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r15 = r15 & r0
            r11.f7708o = r15
            r11.f7715v = r12
            int r15 = r12 + 1
            r11.f7713t = r15
            int r13 = r13 + 3
            r13 = r14[r13]
            int r12 = r12 + r13
        Lff:
            r11.f7714u = r12
            return
    }

    public final l0.b R(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L1c
            int r1 = r3.p()
            if (r4 >= r1) goto L1c
            java.util.ArrayList r1 = r3.f7697d
            int r2 = r3.p()
            int r4 = l0.j.e(r1, r4, r2)
            if (r4 < 0) goto L1c
            java.lang.Object r4 = r1.get(r4)
            l0.b r4 = (l0.b) r4
            return r4
        L1c:
            return r0
    }

    public final void S(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f7713t
            int r0 = r4.r(r0)
            int[] r1 = r4.f7695b
            int r2 = r0 * 5
            int r2 = r2 + 1
            r1 = r1[r2]
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r3
            if (r1 == 0) goto L14
            goto L19
        L14:
            java.lang.String r1 = "Updating the data of a group that was not created with a data slot"
            i0.m.a(r1)
        L19:
            java.lang.Object[] r1 = r4.f7696c
            int[] r3 = r4.f7695b
            int r0 = r4.g(r3, r0)
            r2 = r3[r2]
            int r2 = r2 >> 29
            int r2 = java.lang.Integer.bitCount(r2)
            int r2 = r2 + r0
            int r0 = r4.h(r2)
            r1[r0] = r5
            return
    }

    public final void T(int r2) {
            r1 = this;
            if (r2 < 0) goto L10
            f.v r0 = r1.f7717x
            if (r0 != 0) goto Ld
            f.v r0 = new f.v
            r0.<init>()
            r1.f7717x = r0
        Ld:
            g4.a.e(r0, r2)
        L10:
            return
    }

    public final void U(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.r(r4)
            int[] r1 = r3.f7695b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            int r2 = r2 + 1
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L2b
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            i0.m.a(r4)
        L2b:
            java.lang.Object[] r4 = r3.f7696c
            int[] r1 = r3.f7695b
            int r0 = r3.g(r1, r0)
            int r0 = r3.h(r0)
            r4[r0] = r5
            return
    }

    public final void a(int r3) {
            r2 = this;
            if (r3 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "Cannot seek backwards"
            i0.m.a(r0)
        L8:
            int r0 = r2.f7707n
            if (r0 > 0) goto Ld
            goto L12
        Ld:
            java.lang.String r0 = "Cannot call seek() while inserting"
            i0.n1.b(r0)
        L12:
            if (r3 != 0) goto L15
            return
        L15:
            int r0 = r2.f7713t
            int r0 = r0 + r3
            int r3 = r2.f7715v
            if (r0 < r3) goto L21
            int r3 = r2.f7714u
            if (r0 > r3) goto L21
            goto L43
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot seek outside the current group ("
            r3.<init>(r1)
            int r1 = r2.f7715v
            r3.append(r1)
            r1 = 45
            r3.append(r1)
            int r1 = r2.f7714u
            r3.append(r1)
            r1 = 41
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            i0.m.a(r3)
        L43:
            r2.f7713t = r0
            int[] r3 = r2.f7695b
            int r0 = r2.r(r0)
            int r3 = r2.g(r3, r0)
            r2.f7702i = r3
            r2.f7703j = r3
            return
    }

    public final l0.b b(int r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f7697d
            int r1 = r4.p()
            int r1 = l0.j.e(r0, r5, r1)
            if (r1 >= 0) goto L23
            l0.b r2 = new l0.b
            int r3 = r4.f7700g
            if (r5 > r3) goto L13
            goto L19
        L13:
            int r3 = r4.p()
            int r3 = r3 - r5
            int r5 = -r3
        L19:
            r2.<init>(r5)
            int r1 = r1 + 1
            int r5 = -r1
            r0.add(r5, r2)
            return r2
        L23:
            java.lang.Object r5 = r0.get(r1)
            l0.b r5 = (l0.b) r5
            return r5
    }

    public final int c(l0.b r2) {
            r1 = this;
            int r2 = r2.f7654a
            if (r2 >= 0) goto La
            int r0 = r1.p()
            int r0 = r0 + r2
            return r0
        La:
            return r2
    }

    public final void d() {
            r2 = this;
            int r0 = r2.f7707n
            int r1 = r0 + 1
            r2.f7707n = r1
            if (r0 != 0) goto L17
            int r0 = r2.o()
            int r1 = r2.f7701h
            int r0 = r0 - r1
            int r1 = r2.f7714u
            int r0 = r0 - r1
            i0.m0 r1 = r2.f7710q
            r1.c(r0)
        L17:
            return
    }

    public final void e(boolean r9) {
            r8 = this;
            r0 = 1
            r8.f7716w = r0
            if (r9 == 0) goto L2b
            i0.m0 r9 = r8.f7709p
            int r9 = r9.f5972b
            if (r9 != 0) goto L2b
            int r9 = r8.p()
            r8.B(r9)
            java.lang.Object[] r9 = r8.f7696c
            int r9 = r9.length
            int r0 = r8.f7705l
            int r9 = r9 - r0
            int r0 = r8.f7700g
            r8.C(r9, r0)
            int r9 = r8.f7704k
            int r0 = r8.f7705l
            int r0 = r0 + r9
            java.lang.Object[] r1 = r8.f7696c
            r2 = 0
            java.util.Arrays.fill(r1, r9, r0, r2)
            r8.G()
        L2b:
            int[] r9 = r8.f7695b
            int r0 = r8.f7700g
            java.lang.Object[] r1 = r8.f7696c
            int r2 = r8.f7704k
            java.util.ArrayList r3 = r8.f7697d
            java.util.HashMap r4 = r8.f7698e
            f.w r5 = r8.f7699f
            l0.h r6 = r8.f7694a
            boolean r7 = r6.f7686m
            if (r7 == 0) goto L40
            goto L45
        L40:
            java.lang.String r7 = "Unexpected writer close()"
            i0.n1.a(r7)
        L45:
            r7 = 0
            r6.f7686m = r7
            r6.f7680g = r9
            r6.f7681h = r0
            r6.f7682i = r1
            r6.f7683j = r2
            r6.f7688o = r3
            r6.f7689p = r4
            r6.f7690q = r5
            return
    }

    public final int f(int r2) {
            r1 = this;
            int[] r0 = r1.f7695b
            int r2 = r1.r(r2)
            int r2 = r1.g(r0, r2)
            return r2
    }

    public final int g(int[] r2, int r3) {
            r1 = this;
            int r0 = r1.o()
            if (r3 < r0) goto Ld
            java.lang.Object[] r2 = r1.f7696c
            int r2 = r2.length
            int r3 = r1.f7705l
            int r2 = r2 - r3
            return r2
        Ld:
            int r3 = r3 * 5
            int r3 = r3 + 4
            r2 = r2[r3]
            int r3 = r1.f7705l
            java.lang.Object[] r0 = r1.f7696c
            int r0 = r0.length
            if (r2 >= 0) goto L1f
            int r0 = r0 - r3
            int r0 = r0 + r2
            int r0 = r0 + 1
            return r0
        L1f:
            return r2
    }

    public final int h(int r3) {
            r2 = this;
            int r0 = r2.f7705l
            int r1 = r2.f7704k
            if (r3 >= r1) goto L8
            r1 = 0
            goto L9
        L8:
            r1 = 1
        L9:
            int r0 = r0 * r1
            int r0 = r0 + r3
            return r0
    }

    public final void j() {
            r14 = this;
            int r0 = r14.f7707n
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r3 = r14.f7713t
            int r4 = r14.f7714u
            int r5 = r14.f7715v
            int r6 = r14.r(r5)
            int r7 = r14.f7708o
            int r8 = r3 - r5
            int[] r9 = r14.f7695b
            int r10 = r6 * 5
            int r11 = r10 + 1
            r9 = r9[r11]
            r12 = 1073741824(0x40000000, float:2.0)
            r9 = r9 & r12
            if (r9 == 0) goto L26
            r9 = r2
            goto L27
        L26:
            r9 = r1
        L27:
            i0.m0 r13 = r14.f7711r
            if (r0 == 0) goto L81
            f.w r0 = r14.f7712s
            if (r0 == 0) goto L4c
            java.lang.Object r3 = r0.b(r5)
            f.f0 r3 = (f.f0) r3
            if (r3 == 0) goto L4c
            java.lang.Object[] r4 = r3.f2803a
            int r3 = r3.f2804b
            r11 = r1
        L3c:
            if (r11 >= r3) goto L46
            r12 = r4[r11]
            r14.F(r12)
            int r11 = r11 + 1
            goto L3c
        L46:
            java.lang.Object r0 = r0.g(r5)
            f.f0 r0 = (f.f0) r0
        L4c:
            int[] r0 = r14.f7695b
            int r10 = r10 + 3
            r0[r10] = r8
            l0.j.c(r0, r6, r7)
            int r0 = r13.b()
            if (r9 == 0) goto L5c
            r7 = r2
        L5c:
            int r0 = r0 + r7
            r14.f7708o = r0
            int[] r0 = r14.f7695b
            int r0 = r14.E(r0, r5)
            r14.f7715v = r0
            if (r0 >= 0) goto L6e
            int r0 = r14.p()
            goto L73
        L6e:
            int r0 = r0 + r2
            int r0 = r14.r(r0)
        L73:
            if (r0 >= 0) goto L76
            goto L7c
        L76:
            int[] r1 = r14.f7695b
            int r1 = r14.g(r1, r0)
        L7c:
            r14.f7702i = r1
            r14.f7703j = r1
            return
        L81:
            if (r3 != r4) goto L84
            goto L89
        L84:
            java.lang.String r0 = "Expected to be at the end of a group"
            i0.m.a(r0)
        L89:
            int[] r0 = r14.f7695b
            int r10 = r10 + 3
            r3 = r0[r10]
            r4 = r0[r11]
            r11 = 67108863(0x3ffffff, float:1.5046327E-36)
            r4 = r4 & r11
            r0[r10] = r8
            l0.j.c(r0, r6, r7)
            i0.m0 r0 = r14.f7709p
            int r0 = r0.b()
            int r6 = r14.o()
            int r10 = r14.f7701h
            int r6 = r6 - r10
            i0.m0 r10 = r14.f7710q
            int r10 = r10.b()
            int r6 = r6 - r10
            r14.f7714u = r6
            r14.f7715v = r0
            int[] r6 = r14.f7695b
            int r5 = r14.E(r6, r5)
            int r6 = r13.b()
            r14.f7708o = r6
            if (r5 != r0) goto Lc9
            if (r9 == 0) goto Lc3
            goto Lc5
        Lc3:
            int r1 = r7 - r4
        Lc5:
            int r6 = r6 + r1
            r14.f7708o = r6
            return
        Lc9:
            int r8 = r8 - r3
            if (r9 == 0) goto Lce
            r7 = r1
            goto Lcf
        Lce:
            int r7 = r7 - r4
        Lcf:
            if (r8 != 0) goto Ld3
            if (r7 == 0) goto L10a
        Ld3:
            if (r5 == 0) goto L10a
            if (r5 == r0) goto L10a
            if (r7 != 0) goto Ldb
            if (r8 == 0) goto L10a
        Ldb:
            int r3 = r14.r(r5)
            if (r8 == 0) goto Lec
            int[] r4 = r14.f7695b
            int r6 = r3 * 5
            int r6 = r6 + 3
            r9 = r4[r6]
            int r9 = r9 + r8
            r4[r6] = r9
        Lec:
            if (r7 == 0) goto Lfa
            int[] r4 = r14.f7695b
            int r6 = r3 * 5
            int r6 = r6 + r2
            r6 = r4[r6]
            r6 = r6 & r11
            int r6 = r6 + r7
            l0.j.c(r4, r3, r6)
        Lfa:
            int[] r4 = r14.f7695b
            int r3 = r3 * 5
            int r3 = r3 + r2
            r3 = r4[r3]
            r3 = r3 & r12
            if (r3 == 0) goto L105
            r7 = r1
        L105:
            int r5 = r14.E(r4, r5)
            goto Ld3
        L10a:
            int r0 = r14.f7708o
            int r0 = r0 + r7
            r14.f7708o = r0
            return
    }

    public final void k() {
            r2 = this;
            int r0 = r2.f7707n
            if (r0 <= 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Unbalanced begin/end insert"
            i0.n1.b(r0)
        La:
            int r0 = r2.f7707n
            int r0 = r0 + (-1)
            r2.f7707n = r0
            if (r0 != 0) goto L32
            i0.m0 r0 = r2.f7711r
            int r0 = r0.f5972b
            i0.m0 r1 = r2.f7709p
            int r1 = r1.f5972b
            if (r0 != r1) goto L1d
            goto L22
        L1d:
            java.lang.String r0 = "startGroup/endGroup mismatch while inserting"
            i0.m.a(r0)
        L22:
            int r0 = r2.o()
            int r1 = r2.f7701h
            int r0 = r0 - r1
            i0.m0 r1 = r2.f7710q
            int r1 = r1.b()
            int r0 = r0 - r1
            r2.f7714u = r0
        L32:
            return
    }

    public final void l(int r5) {
            r4 = this;
            int r0 = r4.f7707n
            r1 = 0
            r2 = 1
            if (r0 > 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "Cannot call ensureStarted() while inserting"
            i0.m.a(r0)
        L10:
            int r0 = r4.f7715v
            if (r0 == r5) goto L47
            if (r5 < r0) goto L1b
            int r3 = r4.f7714u
            if (r5 >= r3) goto L1b
            r1 = r2
        L1b:
            if (r1 != 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Started group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " must be a subgroup of the group at "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            i0.m.a(r0)
        L36:
            int r0 = r4.f7713t
            int r1 = r4.f7702i
            int r2 = r4.f7703j
            r4.f7713t = r5
            r4.P()
            r4.f7713t = r0
            r4.f7702i = r1
            r4.f7703j = r2
        L47:
            return
    }

    public final void m(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.f7700g
            if (r3 >= r0) goto L5
            goto Ld
        L5:
            int r0 = r2.p()
            int r0 = r0 - r3
            int r0 = r0 + 2
            int r3 = -r0
        Ld:
            if (r5 >= r4) goto L2f
            int[] r0 = r2.f7695b
            int r1 = r2.r(r5)
            int r1 = r1 * 5
            int r1 = r1 + 2
            r0[r1] = r3
            int[] r0 = r2.f7695b
            int r1 = r2.r(r5)
            int r1 = r1 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r5
            int r1 = r5 + 1
            r2.m(r5, r0, r1)
            r5 = r0
            goto Ld
        L2f:
            return
    }

    public final void n(int r20, fg.p r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = r0.f7695b
            int r3 = r0.E(r3, r1)
            int r4 = r0.p()
            int r5 = r19.u(r20)
            int r5 = r5 + r1
            r7 = r1
            r8 = 0
            r9 = 0
        L18:
            if (r7 >= r5) goto L149
            int r10 = r0.f(r7)
            int r11 = r7 + 1
            int r12 = r0.f(r11)
        L24:
            if (r10 >= r12) goto La2
            int r14 = r0.h(r10)
            java.lang.Object[] r15 = r0.f7696c
            r14 = r15[r14]
            boolean r15 = r14 instanceof i0.k0
            if (r15 == 0) goto L8a
            r15 = r14
            i0.k0 r15 = (i0.k0) r15
            boolean r6 = r15 instanceof i0.k0
            if (r6 == 0) goto L3a
            goto L3b
        L3a:
            r15 = 0
        L3b:
            if (r15 == 0) goto L8d
            int r6 = r15.f5945b
            if (r6 < 0) goto L8a
            int r14 = r0.u(r7)
            int r14 = r14 + r7
            r15 = r11
            r13 = 0
        L48:
            if (r15 >= r14) goto L6e
            if (r13 >= r6) goto L6e
            int r16 = r0.r(r15)
            r17 = r3
            int[] r3 = r0.f7695b
            int r16 = r16 * 5
            int r18 = r16 + 3
            r18 = r3[r18]
            int r15 = r18 + r15
            if (r15 >= r14) goto L6b
            int r16 = r16 + 1
            r3 = r3[r16]
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r16
            if (r3 == 0) goto L69
            goto L6b
        L69:
            int r13 = r13 + 1
        L6b:
            r3 = r17
            goto L48
        L6e:
            r17 = r3
            if (r8 != 0) goto L79
            int[] r3 = f.m.f2860a
            f.x r8 = new f.x
            r8.<init>()
        L79:
            if (r9 != 0) goto L80
            f.v r9 = new f.v
            r9.<init>()
        L80:
            r8.a(r15)
            r9.a(r15)
            r9.a(r10)
            goto L9d
        L8a:
            r17 = r3
            goto L96
        L8d:
            java.lang.String r1 = "Inconsistent composition"
            i0.m.b(r1)
            okio.a.c()
            return
        L96:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.invoke(r3, r14)
        L9d:
            int r10 = r10 + 1
            r3 = r17
            goto L24
        La2:
            r17 = r3
            if (r11 >= r4) goto Lad
            int[] r3 = r0.f7695b
            int r3 = r0.E(r3, r11)
            goto Lae
        Lad:
            r3 = -1
        Lae:
            if (r3 == r7) goto L140
            r6 = r17
        Lb2:
            if (r9 == 0) goto L12c
            if (r8 == 0) goto L12c
            boolean r10 = r8.e(r7)
            if (r10 == 0) goto L12c
            int r10 = r9.f2916b
            int r12 = r10 / 2
            r14 = 0
            r15 = 0
        Lc2:
            if (r14 >= r12) goto L100
            int r13 = r14 * 2
            r17 = r4
            int r4 = r9.c(r13)
            if (r4 != r7) goto Le4
            int r13 = r13 + 1
            int r4 = r9.c(r13)
            java.lang.Object[] r13 = r0.f7696c
            int r18 = r0.h(r4)
            r13 = r13[r18]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.invoke(r4, r13)
            goto Lf9
        Le4:
            if (r13 == r15) goto Lf7
            int r2 = r15 + 1
            r9.e(r15, r4)
            int r15 = r15 + 2
            int r13 = r13 + 1
            int r4 = r9.c(r13)
            r9.e(r2, r4)
            goto Lf9
        Lf7:
            int r15 = r15 + 2
        Lf9:
            int r14 = r14 + 1
            r2 = r21
            r4 = r17
            goto Lc2
        L100:
            r17 = r4
            if (r15 == r10) goto L12e
            if (r15 < 0) goto L126
            int r2 = r9.f2916b
            if (r15 > r2) goto L126
            if (r10 < 0) goto L126
            if (r10 > r2) goto L126
            if (r10 < r15) goto L120
            if (r10 == r15) goto L12e
            if (r10 >= r2) goto L119
            int[] r4 = r9.f2915a
            tf.l.p0(r4, r4, r15, r10, r2)
        L119:
            int r2 = r9.f2916b
            int r10 = r10 - r15
            int r2 = r2 - r10
            r9.f2916b = r2
            goto L12e
        L120:
            java.lang.String r1 = "The end index must be < start index"
            j8.o.t(r1)
            return
        L126:
            java.lang.String r1 = "Index must be between 0 and size"
            okio.a.i(r1)
            return
        L12c:
            r17 = r4
        L12e:
            if (r7 == r1) goto L142
            if (r6 == r3) goto L142
            int[] r2 = r0.f7695b
            int r2 = r0.E(r2, r6)
            r7 = r6
            r4 = r17
            r6 = r2
            r2 = r21
            goto Lb2
        L140:
            r17 = r4
        L142:
            r2 = r21
            r7 = r11
            r4 = r17
            goto L18
        L149:
            return
    }

    public final int o() {
            r1 = this;
            int[] r0 = r1.f7695b
            int r0 = r0.length
            int r0 = r0 / 5
            return r0
    }

    public final int p() {
            r2 = this;
            int r0 = r2.o()
            int r1 = r2.f7701h
            int r0 = r0 - r1
            return r0
    }

    public final java.lang.Object q(int r5) {
            r4 = this;
            int r5 = r4.r(r5)
            int[] r0 = r4.f7695b
            int r1 = r5 * 5
            int r1 = r1 + 1
            r2 = r0[r1]
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2 = r2 & r3
            if (r2 == 0) goto L23
            java.lang.Object[] r2 = r4.f7696c
            int r5 = r4.g(r0, r5)
            r0 = r0[r1]
            int r0 = r0 >> 29
            int r0 = java.lang.Integer.bitCount(r0)
            int r0 = r0 + r5
            r5 = r2[r0]
            return r5
        L23:
            i0.e r5 = i0.l.f5952a
            return r5
    }

    public final int r(int r3) {
            r2 = this;
            int r0 = r2.f7701h
            int r1 = r2.f7700g
            if (r3 >= r1) goto L8
            r1 = 0
            goto L9
        L8:
            r1 = 1
        L9:
            int r0 = r0 * r1
            int r0 = r0 + r3
            return r0
    }

    public final int s(int r2) {
            r1 = this;
            int[] r0 = r1.f7695b
            int r2 = r1.r(r2)
            int r2 = r2 * 5
            r2 = r0[r2]
            return r2
    }

    public final java.lang.Object t(int r4) {
            r3 = this;
            int r4 = r3.r(r4)
            int[] r0 = r3.f7695b
            int r4 = r4 * 5
            int r1 = r4 + 1
            r1 = r0[r1]
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r1
            if (r2 == 0) goto L21
            java.lang.Object[] r2 = r3.f7696c
            int r4 = r4 + 4
            r4 = r0[r4]
            int r0 = r1 >> 30
            int r0 = java.lang.Integer.bitCount(r0)
            int r0 = r0 + r4
            r4 = r2[r0]
            return r4
        L21:
            r4 = 0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SlotWriter(current = "
            r0.<init>(r1)
            int r1 = r3.f7713t
            r0.append(r1)
            java.lang.String r1 = " end="
            r0.append(r1)
            int r1 = r3.f7714u
            r0.append(r1)
            java.lang.String r1 = " size = "
            r0.append(r1)
            int r1 = r3.p()
            r0.append(r1)
            java.lang.String r1 = " gap="
            r0.append(r1)
            int r1 = r3.f7700g
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            int r1 = r3.f7700g
            int r2 = r3.f7701h
            int r1 = r1 + r2
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int u(int r2) {
            r1 = this;
            int[] r0 = r1.f7695b
            int r2 = r1.r(r2)
            int r2 = r2 * 5
            int r2 = r2 + 3
            r2 = r0[r2]
            return r2
    }

    public final boolean v(int r6, int r7) {
            r5 = this;
            int r0 = r5.f7715v
            r1 = 0
            if (r7 != r0) goto L8
            int r0 = r5.f7714u
            goto L40
        L8:
            i0.m0 r0 = r5.f7709p
            int r2 = r0.a(r1)
            if (r7 <= r2) goto L16
            int r0 = r5.u(r7)
        L14:
            int r0 = r0 + r7
            goto L40
        L16:
            int[] r2 = r0.f5971a
            int r3 = r2.length
            int r0 = r0.f5972b
            int r0 = java.lang.Math.min(r3, r0)
            r3 = r1
        L20:
            if (r3 >= r0) goto L2a
            r4 = r2[r3]
            if (r4 != r7) goto L27
            goto L2b
        L27:
            int r3 = r3 + 1
            goto L20
        L2a:
            r3 = -1
        L2b:
            if (r3 >= 0) goto L32
            int r0 = r5.u(r7)
            goto L14
        L32:
            int r0 = r5.o()
            int r2 = r5.f7701h
            int r0 = r0 - r2
            i0.m0 r2 = r5.f7710q
            int[] r2 = r2.f5971a
            r2 = r2[r3]
            int r0 = r0 - r2
        L40:
            if (r6 <= r7) goto L46
            if (r6 >= r0) goto L46
            r6 = 1
            return r6
        L46:
            return r1
    }

    public final void w(int r12) {
            r11 = this;
            if (r12 <= 0) goto L78
            int r0 = r11.f7713t
            r11.B(r0)
            int r1 = r11.f7700g
            int r2 = r11.f7701h
            int[] r3 = r11.f7695b
            int r4 = r3.length
            int r4 = r4 / 5
            int r5 = r4 - r2
            r6 = 0
            if (r2 >= r12) goto L3c
            int r7 = r4 * 2
            int r8 = r5 + r12
            int r7 = java.lang.Math.max(r7, r8)
            r8 = 32
            int r7 = java.lang.Math.max(r7, r8)
            int r8 = r7 * 5
            int[] r8 = new int[r8]
            int r7 = r7 - r5
            int r2 = r2 + r1
            int r9 = r1 + r7
            int r10 = r1 * 5
            tf.l.p0(r3, r8, r6, r6, r10)
            int r9 = r9 * 5
            int r2 = r2 * 5
            int r4 = r4 * 5
            tf.l.p0(r3, r8, r9, r2, r4)
            r11.f7695b = r8
            r2 = r7
        L3c:
            int r3 = r11.f7714u
            if (r3 < r1) goto L43
            int r3 = r3 + r12
            r11.f7714u = r3
        L43:
            int r3 = r1 + r12
            r11.f7700g = r3
            int r2 = r2 - r12
            r11.f7701h = r2
            if (r5 <= 0) goto L52
            int r0 = r0 + r12
            int r0 = r11.f(r0)
            goto L53
        L52:
            r0 = r6
        L53:
            int r2 = r11.f7706m
            if (r2 >= r1) goto L58
            goto L5a
        L58:
            int r6 = r11.f7704k
        L5a:
            int r2 = r11.f7705l
            java.lang.Object[] r4 = r11.f7696c
            int r4 = r4.length
            int r0 = i(r0, r6, r2, r4)
            r2 = r1
        L64:
            if (r2 >= r3) goto L71
            int[] r4 = r11.f7695b
            int r5 = r2 * 5
            int r5 = r5 + 4
            r4[r5] = r0
            int r2 = r2 + 1
            goto L64
        L71:
            int r0 = r11.f7706m
            if (r0 < r1) goto L78
            int r0 = r0 + r12
            r11.f7706m = r0
        L78:
            return
    }

    public final void x(int r10, int r11) {
            r9 = this;
            if (r10 <= 0) goto L47
            int r0 = r9.f7702i
            r9.C(r0, r11)
            int r11 = r9.f7704k
            int r0 = r9.f7705l
            if (r0 >= r10) goto L3a
            java.lang.Object[] r1 = r9.f7696c
            int r2 = r1.length
            int r3 = r2 - r0
            int r4 = r2 * 2
            int r5 = r3 + r10
            int r4 = java.lang.Math.max(r4, r5)
            r5 = 32
            int r4 = java.lang.Math.max(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r7 = r6
        L24:
            if (r7 >= r4) goto L2c
            r8 = 0
            r5[r7] = r8
            int r7 = r7 + 1
            goto L24
        L2c:
            int r4 = r4 - r3
            int r0 = r0 + r11
            int r3 = r11 + r4
            java.lang.System.arraycopy(r1, r6, r5, r6, r11)
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r5, r3, r2)
            r9.f7696c = r5
            r0 = r4
        L3a:
            int r1 = r9.f7703j
            if (r1 < r11) goto L41
            int r1 = r1 + r10
            r9.f7703j = r1
        L41:
            int r11 = r11 + r10
            r9.f7704k = r11
            int r0 = r0 - r10
            r9.f7705l = r0
        L47:
            return
    }

    public final boolean y(int r3) {
            r2 = this;
            int[] r0 = r2.f7695b
            int r3 = r2.r(r3)
            int r3 = r3 * 5
            r1 = 1
            int r3 = r3 + r1
            r3 = r0[r3]
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r0
            if (r3 == 0) goto L12
            return r1
        L12:
            r3 = 0
            return r3
    }
}
