package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8081i;

    public /* synthetic */ b(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f8079g = r2
            r0.f8080h = r1
            r0.f8081i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ b(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f8079g = r4
            r0.f8080h = r2
            r0.f8081i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ b(java.util.ArrayList r1, hb.r r2, java.lang.String r3) {
            r0 = this;
            r2 = 9
            r0.f8079g = r2
            r0.<init>()
            r0.f8080h = r1
            r0.f8081i = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r27) {
            r26 = this;
            r0 = r26
            int r1 = r0.f8079g
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 2
            r4 = 5
            r5 = 4
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 32
            r13 = 0
            r14 = 1
            sf.n r15 = sf.n.f12433a
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.Object r8 = r0.f8081i
            java.lang.Object r9 = r0.f8080h
            switch(r1) {
                case 0: goto L625;
                case 1: goto L5f9;
                case 2: goto L5d2;
                case 3: goto L5bb;
                case 4: goto L59c;
                case 5: goto L56d;
                case 6: goto L543;
                case 7: goto L532;
                case 8: goto L51b;
                case 9: goto L48d;
                case 10: goto L44d;
                case 11: goto L43f;
                case 12: goto L409;
                case 13: goto L3f7;
                case 14: goto L3e9;
                case 15: goto L3d0;
                case 16: goto L3ac;
                case 17: goto L394;
                case 18: goto L36e;
                case 19: goto L349;
                case 20: goto L2de;
                case 21: goto L2cc;
                case 22: goto L293;
                case 23: goto L25c;
                case 24: goto L1b7;
                case 25: goto L135;
                case 26: goto Le5;
                case 27: goto Ld1;
                case 28: goto L37;
                default: goto L1f;
            }
        L1f:
            i0.j1 r9 = (i0.j1) r9
            wb.x2 r8 = (wb.x2) r8
            r1 = r27
            vb.a r1 = (vb.a) r1
            r1.getClass()
            wb.s2 r2 = new wb.s2
            wb.t2 r8 = (wb.t2) r8
            wb.c3 r3 = r8.f19161a
            r2.<init>(r1, r3, r5)
            r9.setValue(r2)
            return r15
        L37:
            wb.x4 r9 = (wb.x4) r9
            android.content.Context r8 = (android.content.Context) r8
            r1 = r27
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "https://"
            i2.g r3 = r9.f20080a
            java.util.List r3 = r3.f6313g
            if (r3 == 0) goto L8f
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            r4.<init>(r5)
            int r5 = r3.size()
            r6 = r13
        L59:
            if (r6 >= r5) goto L91
            java.lang.Object r7 = r3.get(r6)
            i2.e r7 = (i2.e) r7
            java.lang.Object r9 = r7.f6288a
            int r10 = r7.f6290c
            int r11 = r7.f6289b
            java.lang.String r12 = r7.f6291d
            boolean r9 = r9 instanceof i2.h0
            if (r9 == 0) goto L8c
            java.lang.String r9 = "md_link"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L8c
            boolean r9 = i2.h.b(r1, r1, r11, r10)
            if (r9 == 0) goto L8c
            i2.e r9 = new i2.e
            java.lang.Object r7 = r7.f6288a
            r7.getClass()
            i2.h0 r7 = (i2.h0) r7
            java.lang.String r7 = r7.f6322a
            r9.<init>(r12, r11, r10, r7)
            r4.add(r9)
        L8c:
            int r6 = r6 + 1
            goto L59
        L8f:
            tf.t r4 = tf.t.f13167g
        L91:
            java.lang.Object r1 = tf.m.v1(r4)
            i2.e r1 = (i2.e) r1
            if (r1 == 0) goto Ld0
            java.lang.Object r1 = r1.f6288a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto Lac
            goto Ld0
        Lac:
            java.lang.String r3 = "://"
            boolean r3 = og.m.h0(r1, r3, r13)     // Catch: java.lang.Throwable -> Ld0
            if (r3 == 0) goto Lb5
            goto Lb9
        Lb5:
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Ld0
        Lb9:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> Ld0
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Ld0
            r1 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r1 = r2.addFlags(r1)     // Catch: java.lang.Throwable -> Ld0
            r1.getClass()     // Catch: java.lang.Throwable -> Ld0
            r8.startActivity(r1)     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            return r15
        Ld1:
            uh.b r9 = (uh.b) r9
            xb.i r8 = (xb.i) r8
            r1 = r27
            th.g r1 = (th.g) r1
            r1.getClass()
            float r1 = r8.a()
            uh.b r1 = uh.b.a(r9, r1, r11, r4)
            return r1
        Le5:
            java.util.List r9 = (java.util.List) r9
            java.util.List r8 = (java.util.List) r8
            r1 = r27
            v1.a1 r1 = (v1.a1) r1
            if (r9 == 0) goto L10c
            int r2 = r9.size()
            r3 = r13
        Lf4:
            if (r3 >= r2) goto L10c
            java.lang.Object r4 = r9.get(r3)
            sf.e r4 = (sf.e) r4
            java.lang.Object r5 = r4.f12418g
            v1.b1 r5 = (v1.b1) r5
            java.lang.Object r4 = r4.f12419h
            u2.j r4 = (u2.j) r4
            long r10 = r4.f13347a
            v1.a1.C(r1, r5, r10)
            int r3 = r3 + 1
            goto Lf4
        L10c:
            if (r8 == 0) goto L134
            int r2 = r8.size()
        L112:
            if (r13 >= r2) goto L134
            java.lang.Object r3 = r8.get(r13)
            sf.e r3 = (sf.e) r3
            java.lang.Object r4 = r3.f12418g
            v1.b1 r4 = (v1.b1) r4
            java.lang.Object r3 = r3.f12419h
            fg.a r3 = (fg.a) r3
            if (r3 == 0) goto L12d
            java.lang.Object r3 = r3.invoke()
            u2.j r3 = (u2.j) r3
            long r9 = r3.f13347a
            goto L12e
        L12d:
            r9 = r6
        L12e:
            v1.a1.C(r1, r4, r9)
            int r13 = r13 + 1
            goto L112
        L134:
            return r15
        L135:
            w.n1 r9 = (w.n1) r9
            i2.e r8 = (i2.e) r8
            r1 = r27
            f1.d0 r1 = (f1.d0) r1
            i2.g r2 = r9.f14576b
            i0.j1 r3 = r9.f14575a
            java.lang.Object r4 = r3.getValue()
            i2.k0 r4 = (i2.k0) r4
            if (r4 == 0) goto L150
            i2.j0 r4 = r4.f6346a
            if (r4 == 0) goto L150
            i2.g r4 = r4.f6334a
            goto L151
        L150:
            r4 = r11
        L151:
            boolean r2 = gg.l.a(r2, r4)
            if (r2 != 0) goto L159
        L157:
            r6 = r11
            goto L1a7
        L159:
            java.lang.Object r2 = r3.getValue()
            i2.k0 r2 = (i2.k0) r2
            if (r2 == 0) goto L157
            i2.o r3 = r2.f6347b
            i2.e r4 = w.n1.c(r8, r2)
            if (r4 != 0) goto L16a
            goto L157
        L16a:
            int r5 = r4.f6290c
            int r4 = r4.f6289b
            f1.j r6 = r2.i(r4, r5)
            e1.c r7 = r2.b(r4)
            int r5 = r5 - r14
            e1.c r2 = r2.b(r5)
            int r4 = r3.d(r4)
            int r3 = r3.d(r5)
            if (r4 != r3) goto L18d
            float r2 = r2.f2296a
            float r3 = r7.f2296a
            float r10 = java.lang.Math.min(r2, r3)
        L18d:
            float r2 = r7.f2297b
            int r3 = java.lang.Float.floatToRawIntBits(r10)
            long r3 = (long) r3
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r2
            long r2 = r3 << r12
            long r4 = r7 & r16
            long r2 = r2 | r4
            r4 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r2 = r2 ^ r4
            r6.i(r2)
        L1a7:
            if (r6 == 0) goto L1ae
            vh.e r11 = new vh.e
            r11.<init>(r6, r14)
        L1ae:
            if (r11 == 0) goto L1b6
            r1.Q0(r11)
            r1.r(r14)
        L1b6:
            return r15
        L1b7:
            i2.e r9 = (i2.e) r9
            w.r0 r8 = (w.r0) r8
            i0.g1 r1 = r8.f14636b
            r2 = r27
            w.v0 r2 = (w.v0) r2
            java.lang.Object r4 = r9.f6288a
            i2.m r4 = (i2.m) r4
            i2.l0 r6 = r4.a()
            if (r6 == 0) goto L1ce
            i2.f0 r6 = r6.f6354a
            goto L1cf
        L1ce:
            r6 = r11
        L1cf:
            int r7 = r1.g()
            r7 = r7 & r14
            if (r7 == 0) goto L1df
            i2.l0 r7 = r4.a()
            if (r7 == 0) goto L1df
            i2.f0 r7 = r7.f6355b
            goto L1e0
        L1df:
            r7 = r11
        L1e0:
            if (r6 == 0) goto L1e6
            i2.f0 r7 = r6.c(r7)
        L1e6:
            int r6 = r1.g()
            r3 = r3 & r6
            if (r3 == 0) goto L1f6
            i2.l0 r3 = r4.a()
            if (r3 == 0) goto L1f6
            i2.f0 r3 = r3.f6356c
            goto L1f7
        L1f6:
            r3 = r11
        L1f7:
            if (r7 == 0) goto L1fd
            i2.f0 r3 = r7.c(r3)
        L1fd:
            int r1 = r1.g()
            r1 = r1 & r5
            if (r1 == 0) goto L20c
            i2.l0 r1 = r4.a()
            if (r1 == 0) goto L20c
            i2.f0 r11 = r1.f6357d
        L20c:
            if (r3 == 0) goto L212
            i2.f0 r11 = r3.c(r11)
        L212:
            gg.q r1 = new gg.q
            r1.<init>()
            i2.g r3 = r2.f14686a
            b0.s r4 = new b0.s
            r5 = 22
            r4.<init>(r1, r9, r11, r5)
            r3.getClass()
            i2.d r1 = new i2.d
            r1.<init>(r3)
            java.util.ArrayList r3 = r1.f6261i
            int r5 = r3.size()
        L22e:
            if (r13 >= r5) goto L255
            java.lang.Object r6 = r3.get(r13)
            i2.c r6 = (i2.c) r6
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            i2.e r6 = r6.a(r7)
            java.lang.Object r6 = r4.invoke(r6)
            i2.e r6 = (i2.e) r6
            i2.c r7 = new i2.c
            java.lang.Object r8 = r6.f6288a
            int r9 = r6.f6289b
            int r10 = r6.f6290c
            java.lang.String r6 = r6.f6291d
            r7.<init>(r6, r9, r10, r8)
            r3.set(r13, r7)
            int r13 = r13 + 1
            goto L22e
        L255:
            i2.g r1 = r1.e()
            r2.f14687b = r1
            return r15
        L25c:
            java.util.List r9 = (java.util.List) r9
            w.s0 r8 = (w.s0) r8
            r1 = r27
            v1.a1 r1 = (v1.a1) r1
            fg.a r2 = r8.f14650a
            java.util.ArrayList r2 = w.s.m(r9, r2)
            if (r2 == 0) goto L292
            int r3 = r2.size()
        L270:
            if (r13 >= r3) goto L292
            java.lang.Object r4 = r2.get(r13)
            sf.e r4 = (sf.e) r4
            java.lang.Object r5 = r4.f12418g
            v1.b1 r5 = (v1.b1) r5
            java.lang.Object r4 = r4.f12419h
            fg.a r4 = (fg.a) r4
            if (r4 == 0) goto L28b
            java.lang.Object r4 = r4.invoke()
            u2.j r4 = (u2.j) r4
            long r8 = r4.f13347a
            goto L28c
        L28b:
            r8 = r6
        L28c:
            v1.a1.C(r1, r5, r8)
            int r13 = r13 + 1
            goto L270
        L292:
            return r15
        L293:
            w.q0 r9 = (w.q0) r9
            r17 = r8
            f1.s r17 = (f1.s) r17
            r16 = r27
            x1.h0 r16 = (x1.h0) r16
            r16.e()
            i0.j1 r1 = r9.f14618s
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2bc
            i0.j1 r1 = r9.f14619t
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2cb
        L2bc:
            r24 = 0
            r25 = 126(0x7e, float:1.77E-43)
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            h1.d.V0(r16, r17, r18, r20, r22, r23, r24, r25)
        L2cb:
            return r15
        L2cc:
            n2.s r9 = (n2.s) r9
            fg.l r8 = (fg.l) r8
            r1 = r27
            n2.s r1 = (n2.s) r1
            boolean r2 = gg.l.a(r9, r1)
            if (r2 != 0) goto L2dd
            r8.invoke(r1)
        L2dd:
            return r15
        L2de:
            gg.s r9 = (gg.s) r9
            android.app.Activity r8 = (android.app.Activity) r8
            r1 = r27
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.getClass()
            int r2 = r9.f4562g
            if (r2 != 0) goto L307
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r2 != r12) goto L302
            r2 = 235(0xeb, float:3.3E-43)
            int r2 = android.graphics.Color.rgb(r2, r2, r2)
            goto L31f
        L302:
            int r2 = android.graphics.Color.rgb(r12, r12, r12)
            goto L31f
        L307:
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r2 != r12) goto L31c
            r2 = 128(0x80, float:1.8E-43)
        L317:
            int r2 = android.graphics.Color.rgb(r2, r2, r2)
            goto L31f
        L31c:
            r2 = 178(0xb2, float:2.5E-43)
            goto L317
        L31f:
            int r3 = r9.f4562g
            if (r3 != 0) goto L327
            r3 = 16842806(0x1010036, float:2.369371E-38)
            goto L32a
        L327:
            r3 = 16842808(0x1010038, float:2.3693715E-38)
        L32a:
            android.content.res.Resources$Theme r4 = r8.getTheme()
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r3 = r4.obtainStyledAttributes(r3)
            r3.getClass()
            int r2 = r3.getColor(r13, r2)     // Catch: java.lang.Throwable -> L33d
        L33d:
            r3.recycle()
            r1.setTextColor(r2)
            int r1 = r9.f4562g
            int r1 = r1 + r14
            r9.f4562g = r1
            return r15
        L349:
            th.i r9 = (th.i) r9
            r17 = r8
            v1.b1 r17 = (v1.b1) r17
            r16 = r27
            v1.a1 r16 = (v1.a1) r16
            r16.getClass()
            boolean r1 = r9.A
            if (r1 == 0) goto L366
            nb.a r1 = r9.I
            r21 = 2
            r18 = 0
            r20 = r1
            v1.a1.H(r16, r17, r18, r20, r21)
            goto L36d
        L366:
            r1 = r16
            r8 = r17
            v1.a1.C(r1, r8, r6)
        L36d:
            return r15
        L36e:
            i.c r9 = (i.c) r9
            i.c r8 = (i.c) r8
            r1 = r27
            f1.d0 r1 = (f1.d0) r1
            r1.getClass()
            java.lang.Object r2 = r9.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r1.n(r2)
            java.lang.Object r2 = r8.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r1.g(r2)
            return r15
        L394:
            i0.g1 r9 = (i0.g1) r9
            i0.g1 r8 = (i0.g1) r8
            r1 = r27
            u2.l r1 = (u2.l) r1
            long r2 = r1.f13353a
            long r2 = r2 >> r12
            int r2 = (int) r2
            r9.h(r2)
            long r1 = r1.f13353a
            long r1 = r1 & r16
            int r1 = (int) r1
            r8.h(r1)
            return r15
        L3ac:
            lg.a r9 = (lg.a) r9
            i0.a1 r8 = (i0.a1) r8
            r1 = r27
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r2 = r9.f8040a
            float r3 = r9.f8041b
            float r1 = r9.e0.q(r1, r2, r3)
            java.lang.Object r2 = r8.getValue()
            fg.l r2 = (fg.l) r2
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.invoke(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L3d0:
            sh.e0 r9 = (sh.e0) r9
            p.r1 r8 = (p.r1) r8
            r1 = r27
            p.r1 r1 = (p.r1) r1
            r1.getClass()
            p.z r2 = new p.z
            r2.<init>(r8, r1)
            r9.getClass()
            i0.j1 r1 = r9.f12568a
            r1.setValue(r2)
            return r15
        L3e9:
            v0.f r9 = (v0.f) r9
            v0.d r8 = (v0.d) r8
            r1 = r27
            java.util.Map r1 = (java.util.Map) r1
            s.x0 r2 = new s.x0
            r2.<init>(r9, r1, r8)
            return r2
        L3f7:
            s.x0 r9 = (s.x0) r9
            r1 = r27
            i0.a0 r1 = (i0.a0) r1
            f.l0 r1 = r9.f12137i
            r1.i(r8)
            ci.w r1 = new ci.w
            r2 = 6
            r1.<init>(r9, r2, r8)
            return r1
        L409:
            s.d r9 = (s.d) r9
            s.e r8 = (s.e) r8
            r1 = r27
            g2.c r1 = (g2.c) r1
            g2.d r1 = r9.f11993u
            if (r1 == 0) goto L418
            r1.b()
        L418:
            r9.f11993u = r11
            qg.l r1 = r8.f12002b
            if (r1 == 0) goto L43c
            r1.getClass()
        L421:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = qg.y0.f11124g
            java.lang.Object r2 = r2.get(r1)
            java.lang.Object r2 = r1.Y(r2, r15)
            l3.q r3 = qg.v.f11105d
            if (r2 != r3) goto L430
            goto L43c
        L430:
            l3.q r3 = qg.v.f11106e
            if (r2 != r3) goto L435
            goto L43c
        L435:
            l3.q r3 = qg.v.f11107f
            if (r2 == r3) goto L421
            r1.r(r2)
        L43c:
            r8.f12002b = r11
            return r15
        L43f:
            rg.e r9 = (rg.e) r9
            rg.d r8 = (rg.d) r8
            r1 = r27
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            android.os.Handler r1 = r9.f11957i
            r1.removeCallbacks(r8)
            return r15
        L44d:
            java.util.Set r9 = (java.util.Set) r9
            java.lang.String r8 = (java.lang.String) r8
            r1 = r27
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.getClass()
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r9.d0.c0(r1)
            boolean r2 = r9.contains(r1)
            if (r2 != 0) goto L487
            r8.getClass()
            boolean r2 = og.t.W(r1, r8, r13)
            if (r2 == 0) goto L488
            int r2 = r1.length()
            r3 = 20
            if (r2 > r3) goto L488
            java.lang.String r2 = "元"
            boolean r2 = og.m.h0(r1, r2, r13)
            if (r2 != 0) goto L488
            java.lang.String r2 = "/"
            boolean r1 = og.m.h0(r1, r2, r13)
            if (r1 != 0) goto L488
        L487:
            r13 = r14
        L488:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            return r1
        L48d:
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.String r8 = (java.lang.String) r8
            r1 = r27
            og.f r1 = (og.f) r1
            r1.getClass()
            og.i r1 = (og.i) r1
            java.util.List r1 = r1.a()
            java.lang.Object r1 = tf.m.w1(r14, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L4af
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            goto L4b0
        L4af:
            r1 = r11
        L4b0:
            java.lang.String r2 = ""
            if (r1 != 0) goto L4b5
            r1 = r2
        L4b5:
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L4bc
            goto L51a
        L4bc:
            r9.add(r1)
            java.lang.String r2 = "notify@all"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4ca
            java.lang.String r1 = "所有人"
            goto L512
        L4ca:
            g8.i r2 = wb.en.c()
            if (r2 == 0) goto L4d5
            h.Hchat.hooks.api.model.WeChatContact r3 = r2.n(r1)
            goto L4d6
        L4d5:
            r3 = r11
        L4d6:
            if (r2 == 0) goto L4dd
            java.lang.String r2 = r2.v(r8, r1)
            goto L4de
        L4dd:
            r2 = r11
        L4de:
            if (r3 == 0) goto L4e3
            java.lang.String r4 = r3.nickname
            goto L4e4
        L4e3:
            r4 = r11
        L4e4:
            if (r3 == 0) goto L4e8
            java.lang.String r11 = r3.customWxId
        L4e8:
            java.lang.String[] r2 = new java.lang.String[]{r2, r4, r11, r1}
            java.lang.String r2 = hb.r.i(r2)
            r3 = 10
            java.lang.String r2 = r2.replace(r3, r12)
            r2.getClass()
            r3 = 13
            java.lang.String r2 = r2.replace(r3, r12)
            r2.getClass()
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L511
            goto L512
        L511:
            r1 = r2
        L512:
            java.lang.String r2 = "@"
            java.lang.String r3 = "\u2005"
            java.lang.String r2 = eh.a.n(r2, r1, r3)
        L51a:
            return r2
        L51b:
            java.io.RandomAccessFile r9 = (java.io.RandomAccessFile) r9
            java.io.File r8 = (java.io.File) r8
            r1 = r27
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            p8.b r3 = p8.b.f10312a
            long r3 = r8.length()
            p8.a r1 = p8.b.d(r9, r3, r1)
            return r1
        L532:
            p.s1 r9 = (p.s1) r9
            android.view.View r8 = (android.view.View) r8
            r1 = r27
            i0.a0 r1 = (i0.a0) r1
            r9.a(r8)
            ci.w r1 = new ci.w
            r1.<init>(r9, r4, r8)
            return r1
        L543:
            p.w0 r9 = (p.w0) r9
            v1.b1 r8 = (v1.b1) r8
            r1 = r27
            v1.a1 r1 = (v1.a1) r1
            boolean r2 = r9.f10034y
            float r3 = r9.f10030u
            if (r2 == 0) goto L55f
            int r2 = r1.G0(r3)
            float r3 = r9.f10031v
            int r3 = r1.G0(r3)
            v1.a1.E(r1, r8, r2, r3)
            goto L56c
        L55f:
            int r2 = r1.G0(r3)
            float r3 = r9.f10031v
            int r3 = r1.G0(r3)
            r1.A(r8, r2, r3, r10)
        L56c:
            return r15
        L56d:
            p.u0 r9 = (p.u0) r9
            r2 = r8
            v1.b1 r2 = (v1.b1) r2
            r1 = r27
            v1.a1 r1 = (v1.a1) r1
            fg.l r3 = r9.f10015u
            java.lang.Object r3 = r3.invoke(r1)
            u2.j r3 = (u2.j) r3
            long r3 = r3.f13347a
            boolean r5 = r9.f10016v
            if (r5 == 0) goto L58e
            long r5 = r3 >> r12
            int r5 = (int) r5
            long r3 = r3 & r16
            int r3 = (int) r3
            v1.a1.F(r1, r2, r5, r3)
            goto L59b
        L58e:
            long r5 = r3 >> r12
            int r5 = (int) r5
            long r3 = r3 & r16
            int r4 = (int) r3
            r3 = r5
            r5 = 0
            r6 = 12
            v1.a1.G(r1, r2, r3, r4, r5, r6)
        L59b:
            return r15
        L59c:
            o9.p r9 = (o9.p) r9
            java.lang.String r8 = (java.lang.String) r8
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            eb.g0 r3 = new eb.g0
            r3.<init>(r9, r8, r1)
            r2.post(r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L5bb:
            m.g3 r9 = (m.g3) r9
            fg.l r8 = (fg.l) r8
            r1 = r27
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            float r1 = r9.f8175e
            r9.f8175e = r10
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r8.invoke(r1)
            return r15
        L5d2:
            m.m2 r9 = (m.m2) r9
            m.o2 r8 = (m.o2) r8
            r1 = r27
            m.y r1 = (m.y) r1
            boolean r4 = r1.f8425b
            if (r4 == 0) goto L5e0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L5e0:
            long r4 = r1.f8424a
            m.p1 r1 = r8.f8308d
            m.p1 r6 = m.p1.f8325h
            if (r1 != r6) goto L5ed
            long r3 = e1.b.a(r4, r10, r14)
            goto L5f1
        L5ed:
            long r3 = e1.b.a(r4, r10, r3)
        L5f1:
            long r1 = e1.b.f(r3, r2)
            r9.a(r14, r1)
            return r15
        L5f9:
            m.m r9 = (m.m) r9
            m.t0 r8 = (m.t0) r8
            r1 = r27
            m.y r1 = (m.y) r1
            long r3 = r1.f8424a
            long r1 = e1.b.f(r3, r2)
            m.p1 r3 = r8.Q
            m.r0 r4 = m.s0.f8356a
            m.p1 r4 = m.p1.f8324g
            if (r3 != r4) goto L617
            long r1 = r1 & r16
        L611:
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            goto L619
        L617:
            long r1 = r1 >> r12
            goto L611
        L619:
            m.n r2 = r9.f8265a
            b0.l r2 = r2.f8274a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.invoke(r1)
            return r15
        L625:
            m.c r9 = (m.c) r9
            m.i r8 = (m.i) r8
            r1 = r27
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            j0.b r1 = r9.f8101a
            r1.j(r8)
            return r15
    }
}
