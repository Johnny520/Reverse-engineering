package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.k f6368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f6374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f6375h;

    public o(be.k r20, long r21, int r23, int r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            r0.<init>()
            r0.f6368a = r1
            r2 = r23
            r0.f6369b = r2
            int r2 = u2.a.j(r21)
            if (r2 != 0) goto L1a
            int r2 = u2.a.i(r21)
            if (r2 != 0) goto L1a
            goto L1f
        L1a:
            java.lang.String r2 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            o2.a.a(r2)
        L1f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r1 = r1.f812a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            r5 = 0
            r12 = r5
            r5 = 0
            r10 = 0
        L30:
            if (r5 >= r3) goto Laa
            java.lang.Object r6 = r1.get(r5)
            i2.s r6 = (i2.s) r6
            q2.d r14 = r6.f6388a
            int r7 = u2.a.h(r21)
            boolean r8 = u2.a.c(r21)
            if (r8 == 0) goto L56
            int r8 = u2.a.g(r21)
            r23 = r5
            double r4 = (double) r12
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            int r8 = r8 - r4
            if (r8 >= 0) goto L5c
            r8 = 0
            goto L5c
        L56:
            r23 = r5
            int r8 = u2.a.g(r21)
        L5c:
            r4 = 5
            r5 = 0
            long r17 = u2.b.b(r5, r7, r5, r8, r4)
            int r4 = r0.f6369b
            int r15 = r4 - r10
            i2.a r13 = new i2.a
            r16 = r24
            r13.<init>(r14, r15, r16, r17)
            float r4 = r13.b()
            float r4 = r4 + r12
            j2.k r14 = r13.f6248d
            int r7 = r14.f6701g
            int r11 = r10 + r7
            i2.r r7 = new i2.r
            int r8 = r6.f6389b
            int r9 = r6.f6390c
            r6 = r7
            r7 = r13
            r13 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.add(r6)
            boolean r4 = r14.f6698d
            if (r4 != 0) goto La6
            int r4 = r0.f6369b
            if (r11 != r4) goto L9e
            be.k r4 = r0.f6368a
            java.lang.Object r4 = r4.f812a
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = a.a.b0(r4)
            r6 = r23
            if (r6 == r4) goto La0
            goto La6
        L9e:
            r6 = r23
        La0:
            int r4 = r6 + 1
            r5 = r4
            r10 = r11
            r12 = r13
            goto L30
        La6:
            r1 = 1
            r10 = r11
            r12 = r13
            goto Lac
        Laa:
            r5 = 0
            r1 = r5
        Lac:
            r0.f6372e = r12
            r0.f6373f = r10
            r0.f6370c = r1
            r0.f6375h = r2
            int r1 = u2.a.h(r21)
            float r1 = (float) r1
            r0.f6371d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r2.size()
            r1.<init>(r3)
            int r3 = r2.size()
            r4 = r5
        Lc9:
            r6 = 0
            if (r4 >= r3) goto L100
            java.lang.Object r7 = r2.get(r4)
            i2.r r7 = (i2.r) r7
            i2.a r8 = r7.f6381a
            java.lang.Object r8 = r8.f6250f
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.size()
            r9.<init>(r10)
            int r10 = r8.size()
            r11 = r5
        Le4:
            if (r11 >= r10) goto Lfa
            java.lang.Object r12 = r8.get(r11)
            e1.c r12 = (e1.c) r12
            if (r12 == 0) goto Lf3
            e1.c r12 = r7.a(r12)
            goto Lf4
        Lf3:
            r12 = r6
        Lf4:
            r9.add(r12)
            int r11 = r11 + 1
            goto Le4
        Lfa:
            tf.r.h1(r1, r9)
            int r4 = r4 + 1
            goto Lc9
        L100:
            int r2 = r1.size()
            be.k r3 = r0.f6368a
            java.lang.Object r3 = r3.f814c
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            if (r2 >= r3) goto L131
            be.k r2 = r0.f6368a
            java.lang.Object r2 = r2.f814c
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            int r3 = r1.size()
            int r2 = r2 - r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = r5
        L125:
            if (r4 >= r2) goto L12d
            r3.add(r6)
            int r4 = r4 + 1
            goto L125
        L12d:
            java.util.ArrayList r1 = tf.m.F1(r1, r3)
        L131:
            r0.f6374g = r1
            return
    }

    public static void i(i2.o r10, f1.u r11, long r12, f1.q0 r14, t2.l r15, h1.c r16) {
            r11.e()
            java.util.ArrayList r10 = r10.f6375h
            int r0 = r10.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L2a
            java.lang.Object r2 = r10.get(r1)
            i2.r r2 = (i2.r) r2
            i2.a r3 = r2.f6381a
            r4 = r11
            r5 = r12
            r7 = r14
            r8 = r15
            r9 = r16
            r3.f(r4, r5, r7, r8, r9)
            i2.a r2 = r2.f6381a
            float r2 = r2.b()
            r3 = 0
            r11.m(r3, r2)
            int r1 = r1 + 1
            goto La
        L2a:
            r11.p()
            return
    }

    public static void j(i2.o r9, f1.u r10, f1.s r11, float r12, f1.q0 r13, t2.l r14, h1.c r15) {
            r10.e()
            java.util.ArrayList r0 = r9.f6375h
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L11
            q2.j.b(r9, r10, r11, r12, r13, r14, r15)
            goto L90
        L11:
            boolean r1 = r11 instanceof f1.t0
            if (r1 == 0) goto L1a
            q2.j.b(r9, r10, r11, r12, r13, r14, r15)
            goto L90
        L1a:
            boolean r9 = r11 instanceof f1.p0
            if (r9 == 0) goto L94
            int r9 = r0.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
            r5 = r4
        L27:
            if (r3 >= r9) goto L43
            java.lang.Object r6 = r0.get(r3)
            i2.r r6 = (i2.r) r6
            i2.a r7 = r6.f6381a
            float r7 = r7.b()
            float r5 = r5 + r7
            i2.a r6 = r6.f6381a
            float r6 = r6.d()
            float r4 = java.lang.Math.max(r4, r6)
            int r3 = r3 + 1
            goto L27
        L43:
            f1.p0 r11 = (f1.p0) r11
            int r9 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r9
            r9 = 32
            long r3 = r3 << r9
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r3 = r3 | r5
            android.graphics.Shader r3 = r11.b(r3)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r3.getLocalMatrix(r4)
            int r5 = r0.size()
        L69:
            if (r1 >= r5) goto L90
            java.lang.Object r9 = r0.get(r1)
            i2.r r9 = (i2.r) r9
            i2.a r9 = r9.f6381a
            f1.t r11 = new f1.t
            r11.<init>(r3)
            r9.g(r10, r11, r12, r13, r14, r15)
            float r11 = r9.b()
            r10.m(r2, r11)
            float r9 = r9.b()
            float r9 = -r9
            r4.setTranslate(r2, r9)
            r3.setLocalMatrix(r4)
            int r1 = r1 + 1
            goto L69
        L90:
            r10.p()
            return
        L94:
            okio.a.k()
            return
    }

    public final void a(long r8, float[] r10) {
            r7 = this;
            int r0 = i2.m0.f(r8)
            r7.k(r0)
            int r0 = i2.m0.e(r8)
            r7.l(r0)
            gg.s r5 = new gg.s
            r5.<init>()
            r0 = 0
            r5.f4562g = r0
            gg.r r6 = new gg.r
            r6.<init>()
            hb.c0 r1 = new hb.c0
            r2 = r8
            r4 = r10
            r1.<init>(r2, r4, r5, r6)
            java.util.ArrayList r8 = r7.f6375h
            i2.e0.g(r8, r2, r1)
            return
    }

    public final float b(int r4) {
            r3 = this;
            r3.m(r4)
            java.util.ArrayList r0 = r3.f6375h
            int r1 = i2.e0.e(r4, r0)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r2 = r0.f6384d
            int r4 = r4 - r2
            j2.k r1 = r1.f6248d
            float r4 = r1.e(r4)
            float r0 = r0.f6386f
            float r4 = r4 + r0
            return r4
    }

    public final int c(int r5, boolean r6) {
            r4 = this;
            r4.m(r5)
            java.util.ArrayList r0 = r4.f6375h
            int r1 = i2.e0.e(r5, r0)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r2 = r0.f6384d
            int r5 = r5 - r2
            j2.k r1 = r1.f6248d
            if (r6 == 0) goto L47
            android.text.Layout r6 = r1.f6700f
            java.lang.ThreadLocal r2 = j2.l.f6712a
            int r2 = r6.getEllipsisCount(r5)
            if (r2 <= 0) goto L32
            android.text.TextUtils$TruncateAt r2 = r1.f6696b
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            if (r2 != r3) goto L32
            int r1 = r6.getLineStart(r5)
            int r5 = r6.getEllipsisStart(r5)
            int r5 = r5 + r1
            goto L4b
        L32:
            be.k r6 = r1.c()
            java.lang.Object r1 = r6.f813b
            android.text.Layout r1 = (android.text.Layout) r1
            int r2 = r1.getLineEnd(r5)
            int r5 = r1.getLineStart(r5)
            int r5 = r6.l(r2, r5)
            goto L4b
        L47:
            int r5 = r1.f(r5)
        L4b:
            int r6 = r0.f6382b
            int r5 = r5 + r6
            return r5
    }

    public final int d(int r3) {
            r2 = this;
            be.k r0 = r2.f6368a
            java.lang.Object r0 = r0.f813b
            i2.g r0 = (i2.g) r0
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            java.util.ArrayList r1 = r2.f6375h
            if (r3 < r0) goto L15
            int r0 = a.a.b0(r1)
            goto L1d
        L15:
            if (r3 >= 0) goto L19
            r0 = 0
            goto L1d
        L19:
            int r0 = i2.e0.d(r3, r1)
        L1d:
            java.lang.Object r0 = r1.get(r0)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r3 = r0.d(r3)
            j2.k r1 = r1.f6248d
            android.text.Layout r1 = r1.f6700f
            int r3 = r1.getLineForOffset(r3)
            int r0 = r0.f6384d
            int r3 = r3 + r0
            return r3
    }

    public final int e(float r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.f6375h
            int r1 = i2.e0.f(r0, r4)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            int r1 = r0.f6383c
            int r2 = r0.f6382b
            int r1 = r1 - r2
            int r2 = r0.f6384d
            if (r1 != 0) goto L16
            return r2
        L16:
            i2.a r1 = r0.f6381a
            float r0 = r0.f6386f
            float r4 = r4 - r0
            j2.k r0 = r1.f6248d
            int r4 = (int) r4
            android.text.Layout r1 = r0.f6700f
            int r0 = r0.f6702h
            int r4 = r4 - r0
            int r4 = r1.getLineForVertical(r4)
            int r4 = r4 + r2
            return r4
    }

    public final float f(int r4) {
            r3 = this;
            r3.m(r4)
            java.util.ArrayList r0 = r3.f6375h
            int r1 = i2.e0.e(r4, r0)
            java.lang.Object r0 = r0.get(r1)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            int r2 = r0.f6384d
            int r4 = r4 - r2
            j2.k r1 = r1.f6248d
            float r4 = r1.g(r4)
            float r0 = r0.f6386f
            float r4 = r4 + r0
            return r4
    }

    public final int g(long r8) {
            r7 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r8 & r0
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            java.util.ArrayList r4 = r7.f6375h
            int r3 = i2.e0.f(r4, r3)
            java.lang.Object r3 = r4.get(r3)
            i2.r r3 = (i2.r) r3
            int r4 = r3.f6383c
            int r5 = r3.f6382b
            int r4 = r4 - r5
            if (r4 != 0) goto L20
            return r5
        L20:
            i2.a r4 = r3.f6381a
            r6 = 32
            long r8 = r8 >> r6
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r3.f6386f
            float r9 = r9 - r2
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r2 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            long r2 = r2 << r6
            long r8 = r8 & r0
            long r8 = r8 | r2
            j2.k r2 = r4.f6248d
            long r0 = r0 & r8
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (int) r0
            android.text.Layout r1 = r2.f6700f
            int r3 = r2.f6702h
            int r0 = r0 - r3
            int r0 = r1.getLineForVertical(r0)
            long r8 = r8 >> r6
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            android.text.Layout r9 = r2.f6700f
            r1 = -1
            float r1 = (float) r1
            float r2 = r2.b(r0)
            float r2 = r2 * r1
            float r2 = r2 + r8
            int r8 = r9.getOffsetForHorizontal(r0, r2)
            int r8 = r8 + r5
            return r8
    }

    public final long h(e1.c r12, int r13, g1.d r14) {
            r11 = this;
            float r0 = r12.f2297b
            java.util.ArrayList r1 = r11.f6375h
            int r0 = i2.e0.f(r1, r0)
            java.lang.Object r2 = r1.get(r0)
            i2.r r2 = (i2.r) r2
            float r2 = r2.f6387g
            float r3 = r12.f2299d
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            if (r2 >= 0) goto L85
            int r2 = a.a.b0(r1)
            if (r0 != r2) goto L1e
            goto L85
        L1e:
            int r2 = i2.e0.f(r1, r3)
            long r5 = i2.m0.f6358b
        L24:
            long r7 = i2.m0.f6358b
            boolean r3 = i2.m0.b(r5, r7)
            if (r3 == 0) goto L45
            if (r0 > r2) goto L45
            java.lang.Object r3 = r1.get(r0)
            i2.r r3 = (i2.r) r3
            i2.a r5 = r3.f6381a
            e1.c r6 = r3.c(r12)
            long r5 = r5.c(r6, r13, r14)
            long r5 = r3.b(r5, r4)
            int r0 = r0 + 1
            goto L24
        L45:
            boolean r3 = i2.m0.b(r5, r7)
            if (r3 == 0) goto L4c
            return r7
        L4c:
            long r9 = i2.m0.f6358b
            boolean r3 = i2.m0.b(r7, r9)
            if (r3 == 0) goto L6d
            if (r0 > r2) goto L6d
            java.lang.Object r3 = r1.get(r2)
            i2.r r3 = (i2.r) r3
            i2.a r7 = r3.f6381a
            e1.c r8 = r3.c(r12)
            long r7 = r7.c(r8, r13, r14)
            long r7 = r3.b(r7, r4)
            int r2 = r2 + (-1)
            goto L4c
        L6d:
            boolean r12 = i2.m0.b(r7, r9)
            if (r12 == 0) goto L74
            return r5
        L74:
            r12 = 32
            long r12 = r5 >> r12
            int r12 = (int) r12
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r7
            int r13 = (int) r13
            long r12 = i2.e0.b(r12, r13)
            return r12
        L85:
            java.lang.Object r0 = r1.get(r0)
            i2.r r0 = (i2.r) r0
            i2.a r1 = r0.f6381a
            e1.c r12 = r0.c(r12)
            long r12 = r1.c(r12, r13, r14)
            long r12 = r0.b(r12, r4)
            return r12
    }

    public final void k(int r4) {
            r3 = this;
            be.k r0 = r3.f6368a
            java.lang.Object r0 = r0.f813b
            i2.g r0 = (i2.g) r0
            if (r4 < 0) goto L11
            java.lang.String r1 = r0.f6314h
            int r1 = r1.length()
            if (r4 >= r1) goto L11
            return
        L11:
            java.lang.String r1 = "offset("
            java.lang.String r2 = ") is out of bounds [0, "
            java.lang.StringBuilder r4 = eh.a.t(r4, r1, r2)
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            r4.append(r0)
            r0 = 41
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            o2.a.a(r4)
            return
    }

    public final void l(int r4) {
            r3 = this;
            be.k r0 = r3.f6368a
            java.lang.Object r0 = r0.f813b
            i2.g r0 = (i2.g) r0
            if (r4 < 0) goto L11
            java.lang.String r1 = r0.f6314h
            int r1 = r1.length()
            if (r4 > r1) goto L11
            return
        L11:
            java.lang.String r1 = "offset("
            java.lang.String r2 = ") is out of bounds [0, "
            java.lang.StringBuilder r4 = eh.a.t(r4, r1, r2)
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            r4.append(r0)
            r0 = 93
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            o2.a.a(r4)
            return
    }

    public final void m(int r4) {
            r3 = this;
            r0 = 0
            int r1 = r3.f6373f
            if (r4 < 0) goto L8
            if (r4 >= r1) goto L8
            r0 = 1
        L8:
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "lineIndex("
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = ") is out of bounds [0, "
            r0.append(r4)
            r0.append(r1)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            o2.a.a(r4)
        L28:
            return
    }
}
