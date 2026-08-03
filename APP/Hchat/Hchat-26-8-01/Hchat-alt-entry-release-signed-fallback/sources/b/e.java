package b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i0.f, hc.b, k2.d, l3.o, m0.k0, r7.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f333i;

    public e(int r2) {
            r1 = this;
            r1.f331g = r2
            switch(r2) {
                case 11: goto L4b;
                case 12: goto L39;
                case 22: goto L26;
                case 25: goto L10;
                default: goto L5;
            }
        L5:
            r1.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f332h = r2
            return
        L10:
            r1.<init>()
            l3.w r2 = new l3.w
            r0 = 17
            r2.<init>(r0)
            r1.f332h = r2
            f.r r2 = new f.r
            r0 = 16
            r2.<init>(r0)
            r1.f333i = r2
            return
        L26:
            r1.<init>()
            t1.d r2 = new t1.d
            r0 = 0
            r2.<init>(r0)
            r1.f332h = r2
            t1.d r2 = new t1.d
            r2.<init>(r0)
            r1.f333i = r2
            return
        L39:
            r1.<init>()
            f.k0 r2 = new f.k0
            r2.<init>()
            r1.f332h = r2
            f.k0 r2 = new f.k0
            r2.<init>()
            r1.f333i = r2
            return
        L4b:
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            i0.j1 r2 = i0.r.u(r2)
            r1.f332h = r2
            return
    }

    public /* synthetic */ e(int r1, boolean r2) {
            r0 = this;
            r0.f331g = r1
            r0.<init>()
            return
    }

    public e(ab.e r2) {
            r1 = this;
            r0 = 13
            r1.f331g = r0
            r1.<init>()
            r1.f332h = r2
            s0.a r2 = new s0.a
            r0 = 0
            r2.<init>(r0)
            r1.f333i = r2
            return
    }

    public e(android.view.WindowInsetsAnimation.Bounds r2) {
            r1 = this;
            r0 = 6
            r1.f331g = r0
            r1.<init>()
            android.graphics.Insets r0 = g3.h.f(r2)
            b3.a r0 = b3.a.c(r0)
            r1.f332h = r0
            android.graphics.Insets r2 = g3.h.v(r2)
            b3.a r2 = b3.a.c(r2)
            r1.f333i = r2
            return
    }

    public e(b.f r2, b.g r3) {
            r1 = this;
            r0 = 0
            r1.f331g = r0
            r1.<init>()
            r1.f333i = r2
            r1.f332h = r3
            return
    }

    public e(java.lang.Object r2) {
            r1 = this;
            r0 = 11
            r1.f331g = r0
            r1.<init>(r0)
            i0.j1 r0 = i0.r.u(r2)
            r1.f333i = r0
            i0.r.u(r2)
            return
    }

    public /* synthetic */ e(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f331g = r2
            r0.f332h = r1
            r0.f333i = r3
            r0.<init>()
            return
    }

    public e(java.lang.Object r2, java.lang.reflect.Method r3) {
            r1 = this;
            r0 = 18
            r1.f331g = r0
            r3.getClass()
            r1.<init>()
            r1.f332h = r2
            r1.f333i = r3
            return
    }

    public e(java.util.ArrayList r9, fb.b r10) {
            r8 = this;
            r0 = 4
            r8.f331g = r0
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        Lf:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r9.next()
            r2 = r1
            fb.r0 r2 = (fb.r0) r2
            boolean r2 = r2.f3746c
            if (r2 == 0) goto Lf
            r0.add(r1)
            goto Lf
        L24:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = tf.n.e1(r0)
            r9.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb8
            java.lang.Object r1 = r0.next()
            fb.r0 r1 = (fb.r0) r1
            fb.p0 r2 = new fb.p0
            r1.getClass()
            java.lang.String r3 = r1.f3745b
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.String r4 = "[^a-z0-9_-]+"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r4.getClass()
            java.util.regex.Matcher r3 = r4.matcher(r3)
            java.lang.String r4 = "_"
            java.lang.String r3 = r3.replaceAll(r4)
            r3.getClass()
            r5 = 1
            char[] r5 = new char[r5]
            r6 = 95
            r7 = 0
            r5[r7] = r6
            java.lang.String r3 = og.m.S0(r3, r5)
            r5 = 24
            java.lang.String r3 = og.m.P0(r5, r3)
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto L7d
            java.lang.String r3 = "server"
        L7d:
            java.lang.String r5 = r1.f3744a
            java.lang.String r6 = "[^A-Za-z0-9]+"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            r6.getClass()
            java.lang.String r7 = ""
            java.util.regex.Matcher r5 = r6.matcher(r5)
            java.lang.String r5 = r5.replaceAll(r7)
            r5.getClass()
            r6 = 10
            java.lang.String r5 = og.m.P0(r6, r5)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto La3
            java.lang.String r5 = "mcp"
        La3:
            java.lang.String r3 = wb.en.h(r3, r4, r5)
            fb.o0 r4 = new fb.o0
            java.lang.String r5 = r1.f3747d
            java.lang.String r6 = r1.f3748e
            r4.<init>(r5, r6, r10)
            r2.<init>(r1, r3, r4)
            r9.add(r2)
            goto L31
        Lb8:
            fb.r r10 = new fb.r
            r0 = 6
            r10.<init>(r0)
            c9.a0 r0 = new c9.a0
            r1 = 11
            r0.<init>(r10, r1)
            java.util.List r9 = tf.m.K1(r9, r0)
            r8.f332h = r9
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r8.f333i = r9
            return
    }

    public e(k4.b r2, int r3, int r4) {
            r1 = this;
            r0 = 17
            r1.f331g = r0
            r1.<init>()
            if (r2 == 0) goto L24
            r2.d()
            v4.e0 r0 = r2.f7150d
            r1.f332h = r0
            g8.b r2 = r2.f7148b
            int r4 = r4 + r3
            g8.b r2 = r2.n(r3, r4)
            z4.a r3 = new z4.a
            z4.b r4 = new z4.b
            r4.<init>(r2)
            r3.<init>(r4)
            r1.f333i = r3
            return
        L24:
            java.lang.String r2 = "cf == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public t4.c A(int r10) {
            r9 = this;
            java.lang.Object r0 = r9.f333i
            z4.a r0 = (z4.a) r0
            int r1 = r0.readUnsignedByte()     // Catch: java.io.IOException -> L44
            t4.c r2 = new t4.c     // Catch: java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.io.IOException -> L44
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r1) goto L32
            int r5 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L44
            t4.b r6 = new t4.b     // Catch: java.io.IOException -> L44
            r6.<init>()     // Catch: java.io.IOException -> L44
            r7 = r3
        L1b:
            if (r7 >= r5) goto L27
            t4.a r8 = r9.x(r10)     // Catch: java.io.IOException -> L44
            r6.l(r8)     // Catch: java.io.IOException -> L44
            int r7 = r7 + 1
            goto L1b
        L27:
            r6.f22555g = r3     // Catch: java.io.IOException -> L44
            r6.k()     // Catch: java.io.IOException -> L44
            r2.m(r4, r6)     // Catch: java.io.IOException -> L44
            int r4 = r4 + 1
            goto Lf
        L32:
            r2.f22555g = r3     // Catch: java.io.IOException -> L44
            int r10 = r0.available()     // Catch: java.io.IOException -> L44
            if (r10 != 0) goto L3b
            return r2
        L3b:
            l4.c r10 = new l4.c     // Catch: java.io.IOException -> L44
            java.lang.String r0 = "extra data in attribute"
            r1 = 0
            r10.<init>(r0, r1)     // Catch: java.io.IOException -> L44
            throw r10     // Catch: java.io.IOException -> L44
        L44:
            r10 = move-exception
            java.lang.String r0 = "shouldn't happen"
            ah.a.p(r0, r10)
            r10 = 0
            return r10
    }

    public v4.a B() {
            r6 = this;
            java.lang.Object r0 = r6.f332h
            v4.e0 r0 = (v4.e0) r0
            java.lang.Object r1 = r6.f333i
            z4.a r1 = (z4.a) r1
            int r2 = r1.readUnsignedByte()
            r3 = 64
            r4 = 4
            if (r2 == r3) goto L131
            r3 = 70
            if (r2 == r3) goto L12a
            r3 = 83
            if (r2 == r3) goto L10e
            r3 = 99
            if (r2 == r3) goto Lf8
            r3 = 101(0x65, float:1.42E-43)
            r5 = 0
            if (r2 == r3) goto Lcb
            r0 = 115(0x73, float:1.61E-43)
            if (r2 == r0) goto Lc6
            r0 = 73
            if (r2 == r0) goto Lbf
            r0 = 74
            if (r2 == r0) goto Lb8
            r0 = 90
            if (r2 == r0) goto Lab
            r0 = 91
            if (r2 == r0) goto L88
            switch(r2) {
                case 66: goto L6c;
                case 67: goto L50;
                case 68: goto L49;
                default: goto L39;
            }
        L39:
            l4.c r0 = new l4.c
            java.lang.String r1 = a.a.W0(r2)
            java.lang.String r2 = "unknown annotation tag: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1, r5)
            throw r0
        L49:
            v4.a r0 = r6.z()
            v4.k r0 = (v4.k) r0
            return r0
        L50:
            v4.a r0 = r6.z()
            v4.o r0 = (v4.o) r0
            int r0 = r0.f14121g
            char r1 = (char) r0
            if (r1 != r0) goto L61
            v4.j r0 = new v4.j
            r0.<init>(r1)
            return r0
        L61:
            java.lang.String r1 = "bogus char value: "
            java.lang.String r0 = eh.a.l(r0, r1)
            j8.o.t(r0)
            r0 = 0
            return r0
        L6c:
            v4.a r0 = r6.z()
            v4.o r0 = (v4.o) r0
            int r0 = r0.f14121g
            byte r1 = (byte) r0
            if (r1 != r0) goto L7d
            v4.g r0 = new v4.g
            r0.<init>(r1)
            return r0
        L7d:
            java.lang.String r1 = "bogus byte value: "
            java.lang.String r0 = eh.a.l(r0, r1)
            j8.o.t(r0)
            r0 = 0
            return r0
        L88:
            r0 = 2
            r6.C(r0)
            int r0 = r1.readUnsignedShort()
            v4.c r1 = new v4.c
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L97:
            if (r3 >= r0) goto La3
            v4.a r4 = r6.B()
            r1.m(r3, r4)
            int r3 = r3 + 1
            goto L97
        La3:
            r1.f22555g = r2
            v4.d r0 = new v4.d
            r0.<init>(r1)
            return r0
        Lab:
            v4.a r0 = r6.z()
            v4.o r0 = (v4.o) r0
            int r0 = r0.f14121g
            v4.f r0 = v4.f.n(r0)
            return r0
        Lb8:
            v4.a r0 = r6.z()
            v4.v r0 = (v4.v) r0
            return r0
        Lbf:
            v4.a r0 = r6.z()
            v4.o r0 = (v4.o) r0
            return r0
        Lc6:
            v4.a r0 = r6.z()
            return r0
        Lcb:
            r6.C(r4)
            int r2 = r1.readUnsignedShort()
            int r1 = r1.readUnsignedShort()
            v4.a r2 = r0.l(r2)
            v4.c0 r2 = (v4.c0) r2
            v4.a r0 = r0.l(r1)
            v4.c0 r0 = (v4.c0) r0
            v4.l r1 = new v4.l
            v4.z r3 = new v4.z
            r3.<init>(r0, r2)
            v4.d0 r0 = new v4.d0
            w4.c r2 = r3.k()
            r0.<init>(r2)
            r1.<init>(r0, r3)
            r1.f14101i = r5
            return r1
        Lf8:
            int r1 = r1.readUnsignedShort()
            v4.a r0 = r0.l(r1)
            v4.c0 r0 = (v4.c0) r0
            java.lang.String r0 = r0.f14067g
            w4.c r0 = w4.c.o(r0)
            v4.d0 r1 = new v4.d0
            r1.<init>(r0)
            return r1
        L10e:
            v4.a r0 = r6.z()
            v4.o r0 = (v4.o) r0
            int r0 = r0.f14121g
            short r1 = (short) r0
            if (r1 != r0) goto L11f
            v4.b0 r0 = new v4.b0
            r0.<init>(r1)
            return r0
        L11f:
            java.lang.String r1 = "bogus short value: "
            java.lang.String r0 = eh.a.l(r0, r1)
            j8.o.t(r0)
            r0 = 0
            return r0
        L12a:
            v4.a r0 = r6.z()
            v4.n r0 = (v4.n) r0
            return r0
        L131:
            t4.a r0 = r6.x(r4)
            v4.b r1 = new v4.b
            r1.<init>(r0)
            return r1
    }

    public void C(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f333i
            z4.a r0 = (z4.a) r0
            int r0 = r0.available()
            if (r0 < r3) goto Lb
            return
        Lb:
            l4.c r3 = new l4.c
            java.lang.String r0 = "truncated annotation attribute"
            r1 = 0
            r3.<init>(r0, r1)
            throw r3
    }

    @Override // l3.o
    public boolean a(java.lang.CharSequence r4, int r5, int r6, l3.u r7) {
            r3 = this;
            int r0 = r7.f7828c
            r0 = r0 & 4
            r1 = 1
            if (r0 <= 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r3.f332h
            l3.y r0 = (l3.y) r0
            if (r0 != 0) goto L22
            l3.y r0 = new l3.y
            boolean r2 = r4 instanceof android.text.Spannable
            if (r2 == 0) goto L17
            android.text.Spannable r4 = (android.text.Spannable) r4
            goto L1d
        L17:
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r4)
            r4 = r2
        L1d:
            r0.<init>(r4)
            r3.f332h = r0
        L22:
            java.lang.Object r4 = r3.f333i
            a2.a r4 = (a2.a) r4
            r4.getClass()
            l3.v r4 = new l3.v
            r4.<init>(r7)
            java.lang.Object r7 = r3.f332h
            l3.y r7 = (l3.y) r7
            r0 = 33
            r7.setSpan(r4, r5, r6, r0)
            return r1
    }

    @Override // k2.d
    public int b(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f332h
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L4:
            java.lang.Object r1 = r3.f333i
            c8.a r1 = (c8.a) r1
            int r4 = r1.i(r4)
            r1 = -1
            if (r4 == r1) goto L21
            int r2 = r0.length()
            if (r4 != r2) goto L16
            goto L21
        L16:
            char r1 = r0.charAt(r4)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 != 0) goto L4
            return r4
        L21:
            return r1
    }

    @Override // k2.d
    public int c(int r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.f333i
            c8.a r0 = (c8.a) r0
            int r3 = r0.j(r3)
            r0 = -1
            if (r3 == r0) goto L1e
            if (r3 == 0) goto L1e
            java.lang.Object r0 = r2.f332h
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r3 + (-1)
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L0
            return r3
        L1e:
            return r0
    }

    @Override // i0.f
    public void cancel() {
            r3 = this;
            int r0 = r3.f331g
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f333i
            s0.a r0 = (s0.a) r0
            r1 = 1
            boolean r0 = r0.compareAndSet(r1, r1)
            if (r0 != 0) goto L17
            java.lang.Object r0 = r3.f332h
            ab.e r0 = (ab.e) r0
            r0.invoke()
        L17:
            return
        L18:
            java.lang.Object r0 = r3.f333i
            b.f r0 = (b.f) r0
            java.lang.Object r1 = r0.f336c
            tf.k r1 = (tf.k) r1
            java.lang.Object r2 = r3.f332h
            b.g r2 = (b.g) r2
            r1.remove(r2)
            java.util.concurrent.CopyOnWriteArrayList r1 = r2.f339a
            r1.remove(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L35
            r0.d()
        L35:
            return
    }

    @Override // l3.o
    public java.lang.Object e() {
            r1 = this;
            java.lang.Object r0 = r1.f332h
            l3.y r0 = (l3.y) r0
            return r0
    }

    @Override // m0.k0
    public java.util.List f(java.lang.Integer r5) {
            r4 = this;
            java.lang.Object r0 = r4.f332h
            m0.k0 r0 = (m0.k0) r0
            r1 = 0
            java.util.List r0 = r0.f(r1)
            java.lang.Object r1 = r4.f333i
            l0.k r1 = (l0.k) r1
            int r2 = r1.f7715v
            if (r2 >= 0) goto L12
            return r0
        L12:
            int[] r3 = r1.f7695b
            int r3 = r1.E(r3, r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.List r5 = g4.a.h(r1, r5, r2, r3)
            java.util.ArrayList r5 = tf.m.F1(r5, r0)
            return r5
    }

    @Override // k2.d
    public int g(int r2) {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.f333i
            c8.a r0 = (c8.a) r0
            int r2 = r0.j(r2)
            r0 = -1
            if (r2 != r0) goto Lc
            return r0
        Lc:
            java.lang.Object r0 = r1.f332h
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r0 = r0.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L0
            return r2
    }

    @Override // r7.g
    public int get() {
            r4 = this;
            java.lang.Object r0 = r4.f333i
            r7.a r0 = (r7.a) r0
            int r1 = r0.f11551o
            r2 = 20
            if (r1 >= r2) goto L18
            java.lang.Object r3 = r4.f332h
            m7.t r3 = (m7.t) r3
            r7.a r3 = r3.f8765s
            int r3 = r3.f11551o
            if (r3 == 0) goto L18
            r0.k(r2)
            return r2
        L18:
            return r1
    }

    @Override // k2.d
    public int h(int r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.f333i
            c8.a r0 = (c8.a) r0
            int r3 = r0.i(r3)
            r0 = -1
            if (r3 != r0) goto Lc
            return r0
        Lc:
            java.lang.Object r0 = r2.f332h
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r3 + (-1)
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 != 0) goto L0
            return r3
    }

    public void i(md.i r4, fc.f r5) {
            r3 = this;
            md.e r4 = (md.e) r4
            md.f r4 = r4.f8877g
            oc.c r0 = oc.c.f9755a
            oc.b r4 = r4.c(r0)
            pc.d r4 = (pc.d) r4
            if (r4 == 0) goto L3c
            java.util.HashMap r4 = r4.f10463g
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L17
            goto L3c
        L17:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            nc.b r0 = (nc.b) r0
            java.lang.String r1 = r0.f9344b
            java.lang.String r2 = "Ljava/lang/Override;"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1f
            r5.p()
            r3.s(r5, r0)
            goto L1f
        L3c:
            return
    }

    @Override // m0.k0
    public boolean j() {
            r1 = this;
            java.lang.Object r0 = r1.f332h
            m0.k0 r0 = (m0.k0) r0
            boolean r0 = r0.j()
            return r0
    }

    @Override // r7.g
    public void k(int r8) {
            r7 = this;
            java.lang.Object r0 = r7.f333i
            r7.a r0 = (r7.a) r0
            r0.k(r8)
            java.lang.Object r0 = r7.f332h
            m7.t r0 = (m7.t) r0
            m7.d r0 = r0.f8769w
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r1) goto L33
            k7.a r4 = r0.Q(r3)
            m7.c r4 = (m7.c) r4
            int r5 = r8 + (-12)
            int r6 = r4.f14162n
            int r5 = r5 + r6
            r4.M(r5, r2)
            int r5 = r4.p()
            int r5 = r5 - r6
            byte[] r4 = r4.f11553k
            short r5 = (short) r5
            k7.a.F(r4, r6, r5)
            int r3 = r3 + 1
            goto L15
        L33:
            return
    }

    public n2.s l(java.util.List r8) {
            r7 = this;
            r0 = 0
            int r1 = r8.size()     // Catch: java.lang.Exception -> L72
            r2 = 0
            r3 = r0
        L7:
            if (r2 >= r1) goto L1f
            java.lang.Object r4 = r8.get(r2)     // Catch: java.lang.Exception -> L1d
            n2.g r4 = (n2.g) r4     // Catch: java.lang.Exception -> L1d
            java.lang.Object r3 = r7.f333i     // Catch: java.lang.Exception -> L1a
            k5.n r3 = (k5.n) r3     // Catch: java.lang.Exception -> L1a
            r4.a(r3)     // Catch: java.lang.Exception -> L1a
            int r2 = r2 + 1
            r3 = r4
            goto L7
        L1a:
            r0 = move-exception
            r3 = r4
            goto L75
        L1d:
            r0 = move-exception
            goto L75
        L1f:
            java.lang.Object r8 = r7.f333i
            k5.n r8 = (k5.n) r8
            r8.getClass()
            i2.g r1 = new i2.g
            java.lang.Object r8 = r8.f7242l
            c8.a r8 = (c8.a) r8
            java.lang.String r8 = r8.toString()
            r1.<init>(r8)
            java.lang.Object r8 = r7.f333i
            k5.n r8 = (k5.n) r8
            int r2 = r8.f7238h
            int r8 = r8.f7239i
            long r2 = i2.e0.b(r2, r8)
            i2.m0 r8 = new i2.m0
            r8.<init>(r2)
            java.lang.Object r4 = r7.f332h
            n2.s r4 = (n2.s) r4
            long r4 = r4.f8977b
            boolean r4 = i2.m0.g(r4)
            if (r4 != 0) goto L51
            r0 = r8
        L51:
            if (r0 == 0) goto L56
            long r2 = r0.f6360a
            goto L62
        L56:
            int r8 = i2.m0.e(r2)
            int r0 = i2.m0.f(r2)
            long r2 = i2.e0.b(r8, r0)
        L62:
            java.lang.Object r8 = r7.f333i
            k5.n r8 = (k5.n) r8
            i2.m0 r8 = r8.c()
            n2.s r0 = new n2.s
            r0.<init>(r1, r2, r8)
            r7.f332h = r0
            return r0
        L72:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L75:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Error while applying EditCommand batch to buffer (length="
            r4.<init>(r5)
            java.lang.Object r5 = r7.f333i
            k5.n r5 = (k5.n) r5
            java.lang.Object r5 = r5.f7242l
            c8.a r5 = (c8.a) r5
            int r5 = r5.b()
            r4.append(r5)
            java.lang.String r5 = ", composition="
            r4.append(r5)
            java.lang.Object r5 = r7.f333i
            k5.n r5 = (k5.n) r5
            i2.m0 r5 = r5.c()
            r4.append(r5)
            java.lang.String r5 = ", selection="
            r4.append(r5)
            java.lang.Object r5 = r7.f333i
            k5.n r5 = (k5.n) r5
            int r6 = r5.f7238h
            int r5 = r5.f7239i
            long r5 = i2.e0.b(r6, r5)
            java.lang.String r5 = i2.m0.h(r5)
            r4.append(r5)
            java.lang.String r5 = "):"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            r4 = 10
            r2.append(r4)
            b0.d0 r4 = new b0.d0
            r5 = 29
            r4.<init>(r3, r5, r7)
            r3 = 60
            java.lang.String r5 = "\n"
            tf.m.z1(r8, r2, r5, r4, r3)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
    }

    public java.lang.String m(java.lang.String r4, org.json.JSONObject r5) {
            r3 = this;
            r4.getClass()
            java.lang.Object r0 = r3.f333i
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r4)
            fb.q0 r0 = (fb.q0) r0
            if (r0 == 0) goto L40
            fb.o0 r4 = r0.f3719a
            java.lang.String r0 = r0.f3720b
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L39
            r4.a()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "name"
            r1.put(r2, r0)
            java.lang.String r0 = "arguments"
            r1.put(r0, r5)
            java.lang.String r5 = "tools/call"
            org.json.JSONObject r4 = r4.d(r5, r1)
            java.lang.String r4 = r4.toString()
            r4.getClass()
            return r4
        L39:
            java.lang.String r4 = "MCP 工具名为空"
            j8.o.t(r4)
            r4 = 0
            return r4
        L40:
            java.lang.String r5 = "没有找到已启用 MCP 工具: "
            java.lang.String r4 = r5.concat(r4)
            j8.o.t(r4)
            r4 = 0
            return r4
    }

    public java.lang.String n() {
            r5 = this;
            java.lang.Object r0 = r5.f332h
            l8.a r0 = (l8.a) r0
            java.lang.Object r1 = r5.f333i
            h.Hchat.hooks.api.model.WeChatChatroom r1 = (h.Hchat.hooks.api.model.WeChatChatroom) r1
            if (r1 == 0) goto Ld
            java.lang.String r0 = r1.chatroomId
            return r0
        Ld:
            android.content.ContentValues r1 = r0.f7895d
            java.lang.String r2 = ""
            java.lang.String r3 = "chatroomname"
            if (r1 == 0) goto L2d
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L2d
            boolean r4 = r1.containsKey(r3)
            if (r4 != 0) goto L22
            goto L2d
        L22:
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L2d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L2e
        L2d:
            r1 = r2
        L2e:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L35
            return r1
        L35:
            java.lang.String[] r1 = r0.f7897f
            if (r1 == 0) goto L50
            int r4 = r1.length
            if (r4 <= 0) goto L50
            java.lang.String r0 = r0.f7896e
            if (r0 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L50
            r0 = 0
            r0 = r1[r0]
            return r0
        L50:
            return r2
    }

    public g4.b o(g4.i r4) {
            r3 = this;
            g4.j r0 = r4.f4294a
            java.lang.String r1 = r4.f4296c
            g4.e r0 = r3.u(r0)
            java.util.LinkedHashMap r0 = r0.f4279i
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L31
            java.lang.String r2 = "<init>"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L23
            java.lang.String r2 = "<clinit>"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 1
            goto L26
        L23:
            r1 = 65537(0x10001, float:9.1837E-41)
        L26:
            g4.d r2 = new g4.d
            r2.<init>(r4, r1)
            r0.put(r4, r2)
            g4.b r4 = r2.f4270c
            return r4
        L31:
            java.lang.String r0 = "already declared: "
            g1.d.g(r4, r0)
            r4 = 0
            return r4
    }

    public void p(g4.f r3, int r4) {
            r2 = this;
            g4.j r0 = r3.f4280a
            g4.e r0 = r2.u(r0)
            java.util.LinkedHashMap r0 = r0.f4278h
            boolean r1 = r0.containsKey(r3)
            if (r1 != 0) goto L17
            g4.c r1 = new g4.c
            r1.<init>(r3, r4)
            r0.put(r3, r1)
            return
        L17:
            java.lang.String r4 = "already declared: "
            g1.d.g(r3, r4)
            return
    }

    public void q(ud.u r11, fc.f r12, nc.a r13) {
            r10 = this;
            java.lang.Object r0 = r10.f332h
            ud.e r0 = (ud.e) r0
            java.lang.Object r1 = r10.f333i
            fd.a r1 = (fd.a) r1
            ud.e r2 = r1.f3887a
            java.lang.String r3 = "null"
            if (r13 != 0) goto L12
            r12.e(r3)
            return
        L12:
            int r4 = r13.f9341g
            ud.u r5 = r0.f13688k
            xe.q r5 = r5.f13744c
            java.lang.Object r6 = r13.f9342h
            int r7 = t3.c.b(r4)
            r8 = 1
            r9 = 0
            switch(r7) {
                case 0: goto L165;
                case 1: goto L154;
                case 2: goto L145;
                case 3: goto L120;
                case 4: goto L10f;
                case 5: goto Lea;
                case 6: goto Ldc;
                case 7: goto Lce;
                case 8: goto Lc0;
                case 9: goto Lb6;
                case 10: goto La7;
                case 11: goto L6d;
                case 12: goto L6d;
                case 13: goto L6c;
                case 14: goto L23;
                case 15: goto L23;
                case 16: goto L3f;
                case 17: goto L39;
                default: goto L23;
            }
        L23:
            java.lang.String r11 = j8.b.w(r4)
            java.lang.String r12 = java.lang.String.valueOf(r13)
            java.lang.String r13 = " ("
            java.lang.String r0 = ")"
            java.lang.String r1 = "Can't decode value: "
            java.lang.String r11 = bc.e.k(r1, r11, r13, r12, r0)
            ah.a.k(r11)
            return
        L39:
            nc.b r6 = (nc.b) r6
            r10.s(r12, r6)
            return
        L3f:
            r11 = 123(0x7b, float:1.72E-43)
            r12.d(r11)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r11 = r6.iterator()
        L4a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L67
            java.lang.Object r13 = r11.next()
            nc.a r13 = (nc.a) r13
            ud.u r1 = r0.f13688k
            r10.q(r1, r12, r13)
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L4a
            java.lang.String r13 = ", "
            r12.e(r13)
            goto L4a
        L67:
            r11 = 125(0x7d, float:1.75E-43)
            r12.d(r11)
        L6c:
            return
        L6d:
            boolean r13 = r6 instanceof jf.d
            if (r13 == 0) goto L83
            jf.d r6 = (jf.d) r6
            od.c r11 = od.c.a(r11, r6)
            java.util.EnumSet r13 = fd.e.f3904e
            ud.u r13 = r2.f13688k
            ud.g r13 = r13.h(r11)
            fd.e.m(r12, r11, r13, r1)
            return
        L83:
            boolean r11 = r6 instanceof od.c
            if (r11 == 0) goto L95
            od.c r6 = (od.c) r6
            java.util.EnumSet r11 = fd.e.f3904e
            ud.u r11 = r2.f13688k
            ud.g r11 = r11.h(r6)
            fd.e.m(r12, r6, r11, r1)
            return
        L95:
            java.lang.Class r11 = r6.getClass()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "Unexpected field type class: "
            java.lang.String r11 = r12.concat(r11)
            ah.a.k(r11)
            return
        La7:
            java.lang.String r6 = (java.lang.String) r6
            qd.j r11 = qd.j.z(r6)
            r1.s(r12, r11)
            java.lang.String r11 = ".class"
            r12.e(r11)
            return
        Lb6:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r11 = r5.i(r6)
            r12.e(r11)
            return
        Lc0:
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            java.lang.String r11 = xe.q.b(r0)
            r12.e(r11)
            return
        Lce:
            java.lang.Float r6 = (java.lang.Float) r6
            float r11 = r6.floatValue()
            java.lang.String r11 = xe.q.c(r11)
            r12.e(r11)
            return
        Ldc:
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            java.lang.String r11 = r5.d(r0, r9)
            r12.e(r11)
            return
        Lea:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r11 = r6.intValue()
            long r0 = (long) r11
            int r11 = r5.f21575a
            if (r11 != r8) goto L106
            int r11 = (int) r0
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r13) goto L103
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r11 == r13) goto L100
            goto L106
        L100:
            java.lang.String r11 = "Integer.MAX_VALUE"
            goto L10b
        L103:
            java.lang.String r11 = "Integer.MIN_VALUE"
            goto L10b
        L106:
            r11 = 4
            java.lang.String r11 = r5.e(r11, r0, r9)
        L10b:
            r12.e(r11)
            return
        L10f:
            java.lang.Character r6 = (java.lang.Character) r6
            char r11 = r6.charValue()
            r5.getClass()
            java.lang.String r11 = xe.q.h(r11, r9)
            r12.e(r11)
            return
        L120:
            java.lang.Short r6 = (java.lang.Short) r6
            short r11 = r6.shortValue()
            long r0 = (long) r11
            int r11 = r5.f21575a
            if (r11 != r8) goto L13c
            int r11 = (int) r0
            short r11 = (short) r11
            r13 = -32768(0xffffffffffff8000, float:NaN)
            if (r11 == r13) goto L139
            r13 = 32767(0x7fff, float:4.5916E-41)
            if (r11 == r13) goto L136
            goto L13c
        L136:
            java.lang.String r11 = "Short.MAX_VALUE"
            goto L141
        L139:
            java.lang.String r11 = "Short.MIN_VALUE"
            goto L141
        L13c:
            r11 = 2
            java.lang.String r11 = r5.e(r11, r0, r9)
        L141:
            r12.e(r11)
            return
        L145:
            java.lang.Byte r6 = (java.lang.Byte) r6
            byte r11 = r6.byteValue()
            long r0 = (long) r11
            java.lang.String r11 = r5.e(r8, r0, r9)
            r12.e(r11)
            return
        L154:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L15f
            java.lang.String r11 = "true"
            goto L161
        L15f:
            java.lang.String r11 = "false"
        L161:
            r12.e(r11)
            return
        L165:
            r12.e(r3)
            return
    }

    public void r(fg.p r4) {
            r3 = this;
            r4.getClass()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a1.d r1 = new a1.d
            r2 = 21
            r1.<init>(r3, r2, r4)
            r0.post(r1)
            return
    }

    public void s(fc.f r8, nc.b r9) {
            r7 = this;
            r0 = 64
            r8.d(r0)
            java.lang.Object r0 = r7.f332h
            ud.e r0 = (ud.e) r0
            ud.u r1 = r0.f13688k
            java.lang.String r2 = r9.f9344b
            r1.getClass()
            od.a r2 = od.a.d(r1, r2)
            ud.e r1 = r1.f(r2)
            java.lang.Object r2 = r7.f333i
            fd.a r2 = (fd.a) r2
            if (r1 == 0) goto L2f
            r8.j(r1)
            od.a r3 = r1.f13690m
            ud.e r4 = r2.f3887a
            od.a r4 = r4.f13690m
            java.lang.String r2 = r2.q(r4, r3)
            r8.e(r2)
            goto L38
        L2f:
            java.lang.String r3 = r9.f9344b
            qd.j r3 = qd.j.x(r3)
            r2.p(r8, r3)
        L38:
            java.util.LinkedHashMap r9 = r9.f9345c
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L9f
            r2 = 40
            r8.d(r2)
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            if (r1 == 0) goto L6b
            ud.r r5 = r1.n0(r4)
            if (r5 == 0) goto L6b
            od.d r4 = r5.f13717k
            java.lang.String r4 = r4.f9784n
        L6b:
            java.lang.String r5 = "value"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7b
            int r5 = r9.size()
            r6 = 1
            if (r5 != r6) goto L7b
            goto L83
        L7b:
            r8.e(r4)
            java.lang.String r4 = " = "
            r8.e(r4)
        L83:
            ud.u r4 = r0.f13688k
            java.lang.Object r3 = r3.getValue()
            nc.a r3 = (nc.a) r3
            r7.q(r4, r8, r3)
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4d
            java.lang.String r3 = ", "
            r8.e(r3)
            goto L4d
        L9a:
            r9 = 41
            r8.d(r9)
        L9f:
            return
    }

    public java.lang.ClassLoader t(java.io.File r5, java.io.File r6, java.lang.ClassLoader r7) {
            r4 = this;
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 0
            if (r7 == 0) goto L8
            goto L9
        L8:
            r7 = r2
        L9:
            java.lang.String r3 = "dalvik.system.BaseDexClassLoader"
            java.lang.Class.forName(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.String r3 = "dalvik.system.DexClassLoader"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r1, r1, r0}     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.String r5 = r5.getPath()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r2, r7}     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.Object r5 = r0.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.IllegalAccessException -> L33 java.lang.NoSuchMethodException -> L39 java.lang.InstantiationException -> L3f
            return r5
        L2f:
            r5 = move-exception
            goto L45
        L31:
            r5 = move-exception
            goto L4f
        L33:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L39:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L45:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.Throwable r5 = r5.getCause()
            r6.<init>(r5)
            throw r6
        L4f:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "load() requires a Dalvik VM"
            r6.<init>(r7, r5)
            throw r6
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f331g
            switch(r0) {
                case 6: goto L3a;
                case 15: goto L15;
                case 26: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r5.f333i
            r7.a r0 = (r7.a) r0
            int r0 = r0.f11551o
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L15:
            java.lang.Object r0 = r5.f332h
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r5.f333i
            java.util.NavigableMap r1 = (java.util.NavigableMap) r1
            java.util.NavigableMap r1 = r1.descendingMap()
            java.util.Set r1 = r1.entrySet()
            java.lang.String r2 = "\n "
            java.lang.String r1 = xe.s.j(r1, r2)
            java.lang.String r2 = "\nannotations=\n "
            java.lang.String r3 = "\n}"
            java.lang.String r4 = "CodeMetadata{\nlines="
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bounds{lower="
            r0.<init>(r1)
            java.lang.Object r1 = r5.f332h
            b3.a r1 = (b3.a) r1
            r0.append(r1)
            java.lang.String r1 = " upper="
            r0.append(r1)
            java.lang.Object r1 = r5.f333i
            b3.a r1 = (b3.a) r1
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public g4.e u(g4.j r3) {
            r2 = this;
            java.lang.Object r0 = r2.f332h
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r3)
            g4.e r1 = (g4.e) r1
            if (r1 != 0) goto L14
            g4.e r1 = new g4.e
            r1.<init>(r3)
            r0.put(r3, r1)
        L14:
            return r1
    }

    public java.lang.String v() {
            r25 = this;
            r1 = r25
            java.lang.Object r0 = r1.f333i
            r2 = r0
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            r2.clear()
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r0 = r1.f332h
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r7 = r6.iterator()
        L22:
            boolean r0 = r7.hasNext()
            java.lang.String r8 = "tools"
            if (r0 == 0) goto L1e2
            java.lang.Object r0 = r7.next()
            fb.p0 r0 = (fb.p0) r0
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            fb.r0 r10 = r0.f3697a
            fb.o0 r12 = r0.f3699c
            java.lang.String r13 = r0.f3698b
            java.lang.String r14 = r10.f3745b
            java.lang.String r0 = r10.f3744a
            java.lang.String r10 = "id"
            r9.put(r10, r0)
            java.lang.String r10 = "name"
            r9.put(r10, r14)
            java.lang.String r0 = "namespace"
            r9.put(r0, r13)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L58
            java.lang.String r15 = r12.b()     // Catch: java.lang.Throwable -> L58
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L58
            goto L5f
        L58:
            r0 = move-exception
            sf.f r15 = new sf.f
            r15.<init>(r0)
            r0 = r15
        L5f:
            boolean r15 = r0 instanceof sf.f
            r16 = 0
            java.lang.String r11 = "toolCount"
            r17 = r0
            if (r15 != 0) goto L19e
            r15 = r17
            org.json.JSONObject r15 = (org.json.JSONObject) r15
            java.lang.String r0 = "instructions"
            java.lang.String r1 = ""
            java.lang.String r19 = r15.optString(r0, r1)
            r19.getClass()
            boolean r20 = og.m.t0(r19)
            if (r20 != 0) goto L86
            r24 = r19
            r19 = r6
            r6 = r24
            goto L8a
        L86:
            r19 = r6
            r6 = r16
        L8a:
            if (r6 == 0) goto L8f
            r9.put(r0, r6)
        L8f:
            org.json.JSONArray r0 = r15.optJSONArray(r8)
            if (r0 == 0) goto L96
            goto L9b
        L96:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L9b:
            int r6 = r0.length()
            r8 = 0
            lg.d r6 = r9.e0.r0(r8, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lad:
            r15 = r6
            lg.c r15 = (lg.c) r15
            r16 = r6
            boolean r6 = r15.f8047i
            if (r6 == 0) goto Lcc
            java.lang.Object r6 = r15.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            org.json.JSONObject r6 = r0.optJSONObject(r6)
            if (r6 == 0) goto Lc9
            r8.add(r6)
        Lc9:
            r6 = r16
            goto Lad
        Lcc:
            fb.r r6 = new fb.r
            r15 = 5
            r6.<init>(r15)
            java.util.List r6 = tf.m.K1(r8, r6)
            java.util.Iterator r6 = r6.iterator()
        Lda:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L192
            java.lang.Object r8 = r6.next()
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.String r15 = bc.e.l(r10, r1, r8)
            boolean r16 = og.m.t0(r15)
            if (r16 == 0) goto Lf1
            goto Lda
        Lf1:
            r16 = r0
            java.lang.String r0 = "[^A-Za-z0-9_-]+"
            r20 = r6
            java.lang.String r6 = "_"
            java.lang.String r0 = j8.b.h(r0, r15, r6)
            r21 = r7
            r7 = 1
            r22 = r8
            char[] r8 = new char[r7]
            r23 = 95
            r18 = 0
            r8[r18] = r23
            java.lang.String r0 = og.m.S0(r0, r8)
            boolean r8 = og.m.t0(r0)
            if (r8 == 0) goto L116
            java.lang.String r0 = "tool"
        L116:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r23 = r7
            java.lang.String r7 = "mcp__"
            r8.<init>(r7)
            r8.append(r13)
            java.lang.String r7 = "__"
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r7 = 2
        L12f:
            boolean r8 = r2.containsKey(r0)
            if (r8 == 0) goto L14a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            int r7 = r7 + 1
            goto L12f
        L14a:
            fb.q0 r6 = new fb.q0
            r6.<init>(r12, r15)
            r2.put(r0, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            java.lang.String r7 = r22.toString()
            r6.<init>(r7)
            r6.put(r10, r0)
            java.lang.String r0 = "description"
            java.lang.String r7 = r6.optString(r0, r1)
            r7.getClass()
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto L17c
            java.lang.String r7 = " 提供的工具"
            java.lang.String r7 = r14.concat(r7)
            goto L184
        L17c:
            java.lang.String r8 = "["
            java.lang.String r15 = "] "
            java.lang.String r7 = bc.e.j(r8, r14, r15, r7)
        L184:
            r6.put(r0, r7)
            r3.put(r6)
            r0 = r16
            r6 = r20
            r7 = r21
            goto Lda
        L192:
            r16 = r0
            r21 = r7
            int r0 = r16.length()
            r9.put(r11, r0)
            goto L1a2
        L19e:
            r19 = r6
            r21 = r7
        L1a2:
            java.lang.Throwable r0 = sf.g.b(r17)
            if (r0 == 0) goto L1d7
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L1af
            goto L1b7
        L1af:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
        L1b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r6 = ": "
            r0.append(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            java.lang.String r0 = "error"
            r9.put(r0, r1)
            r8 = 0
            r9.put(r11, r8)
        L1d7:
            r4.put(r9)
            r1 = r25
            r6 = r19
            r7 = r21
            goto L22
        L1e2:
            r19 = r6
            r16 = 0
            int r0 = r5.size()
            int r1 = r19.size()
            if (r0 != r1) goto L20c
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L1f7
            goto L20c
        L1f7:
            r9 = 0
            r10 = 62
            java.lang.String r6 = "；"
            r7 = 0
            r8 = 0
            java.lang.String r0 = tf.m.A1(r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = "MCP 连接失败: "
            java.lang.String r0 = r1.concat(r0)
            j8.o.A(r0)
            return r16
        L20c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "servers"
            r0.put(r1, r4)
            r0.put(r8, r3)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
    }

    public boolean w() {
            r2 = this;
            java.lang.Object r0 = r2.f332h
            l8.a r0 = (l8.a) r0
            android.content.ContentValues r0 = r0.f7895d
            if (r0 == 0) goto L12
            java.lang.String r1 = "memberlist"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public t4.a x(int r9) {
            r8 = this;
            r0 = 4
            r8.C(r0)
            java.lang.Object r0 = r8.f333i
            z4.a r0 = (z4.a) r0
            int r1 = r0.readUnsignedShort()
            int r2 = r0.readUnsignedShort()
            java.lang.Object r3 = r8.f332h
            v4.e0 r3 = (v4.e0) r3
            v4.a r1 = r3.l(r1)
            v4.c0 r1 = (v4.c0) r1
            v4.d0 r4 = new v4.d0
            java.lang.String r1 = r1.f14067g
            w4.c r1 = w4.c.m(r1)
            r4.<init>(r1)
            t4.a r1 = new t4.a
            r1.<init>(r4, r9)
            r9 = 0
            r4 = r9
        L2c:
            if (r4 >= r2) goto L4b
            r5 = 5
            r8.C(r5)
            int r5 = r0.readUnsignedShort()
            v4.a r5 = r3.l(r5)
            v4.c0 r5 = (v4.c0) r5
            v4.a r6 = r8.B()
            t4.d r7 = new t4.d
            r7.<init>(r5, r6)
            r1.l(r7)
            int r4 = r4 + 1
            goto L2c
        L4b:
            r1.f22555g = r9
            return r1
    }

    public t4.b y(int r7) {
            r6 = this;
            java.lang.Object r0 = r6.f333i
            z4.a r0 = (z4.a) r0
            int r1 = r0.readUnsignedShort()     // Catch: java.io.IOException -> L2d
            t4.b r2 = new t4.b     // Catch: java.io.IOException -> L2d
            r2.<init>()     // Catch: java.io.IOException -> L2d
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r1) goto L1b
            t4.a r5 = r6.x(r7)     // Catch: java.io.IOException -> L2d
            r2.l(r5)     // Catch: java.io.IOException -> L2d
            int r4 = r4 + 1
            goto Lf
        L1b:
            r2.f22555g = r3     // Catch: java.io.IOException -> L2d
            int r7 = r0.available()     // Catch: java.io.IOException -> L2d
            if (r7 != 0) goto L24
            return r2
        L24:
            l4.c r7 = new l4.c     // Catch: java.io.IOException -> L2d
            java.lang.String r0 = "extra data in attribute"
            r1 = 0
            r7.<init>(r0, r1)     // Catch: java.io.IOException -> L2d
            throw r7     // Catch: java.io.IOException -> L2d
        L2d:
            r7 = move-exception
            java.lang.String r0 = "shouldn't happen"
            ah.a.p(r0, r7)
            r7 = 0
            return r7
    }

    public v4.a z() {
            r2 = this;
            java.lang.Object r0 = r2.f333i
            z4.a r0 = (z4.a) r0
            int r0 = r0.readUnsignedShort()
            java.lang.Object r1 = r2.f332h
            v4.e0 r1 = (v4.e0) r1
            v4.a r0 = r1.l(r0)
            return r0
    }
}
