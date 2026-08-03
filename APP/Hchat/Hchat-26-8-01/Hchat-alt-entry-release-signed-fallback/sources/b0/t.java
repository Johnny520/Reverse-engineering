package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f411h;

    public /* synthetic */ t(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f410g = r2
            r0.f411h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ t(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f410g = r2
            r0.f411h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            int r3 = r1.f410g
            r4 = 0
            r9 = 8
            r12 = 7
            r13 = 2
            r14 = 0
            r15 = 0
            r16 = 128(0x80, double:6.3E-322)
            r5 = 1
            switch(r3) {
                case 0: goto L722;
                case 1: goto L704;
                case 2: goto L6e6;
                case 3: goto L68a;
                case 4: goto L672;
                case 5: goto L65b;
                case 6: goto L649;
                case 7: goto L634;
                case 8: goto L5f4;
                case 9: goto L5d5;
                case 10: goto L531;
                case 11: goto L473;
                case 12: goto L3f0;
                case 13: goto L3e4;
                case 14: goto L3bd;
                case 15: goto L39d;
                case 16: goto L379;
                case 17: goto L361;
                case 18: goto L346;
                case 19: goto L328;
                case 20: goto L2b0;
                case 21: goto L23d;
                case 22: goto L228;
                case 23: goto L217;
                case 24: goto L202;
                case 25: goto L1a7;
                case 26: goto L192;
                case 27: goto L17c;
                case 28: goto Lb2;
                default: goto L15;
            }
        L15:
            java.lang.Object r3 = r1.f411h
            og.g r3 = (og.g) r3
            r9 = r0
            i0.h0 r9 = (i0.h0) r9
            r0 = r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = r0 & 3
            if (r2 == r13) goto L29
            r2 = r5
            goto L2a
        L29:
            r2 = r15
        L2a:
            r0 = r0 & r5
            boolean r0 = r9.S(r0, r2)
            if (r0 == 0) goto Lac
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L4c
            r0 = -646122448(0xffffffffd97cf430, float:-4.4500113E15)
            r9.a0(r0)
            java.lang.String r6 = "暂无异常结果"
            java.lang.String r7 = "正常好友不会逐项显示"
            r10 = 54
            r11 = 4
            r8 = 0
            wb.ho.B1(r6, r7, r8, r9, r10, r11)
            r9.p(r15)
            goto Laf
        L4c:
            r0 = -646021946(0xffffffffd97e7cc6, float:-4.4769896E15)
            r9.a0(r0)
            r0 = 50
            java.util.List r0 = tf.m.L1(r0, r3)
            java.util.Iterator r0 = r0.iterator()
            r2 = r15
        L5d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r0.next()
            int r6 = r2 + 1
            if (r2 < 0) goto La4
            rb.d r3 = (rb.d) r3
            if (r2 <= 0) goto L7c
            r2 = -916007779(0xffffffffc966d49d, float:-945481.8)
            r9.a0(r2)
            wb.ho.D1(r4, r9, r15, r5)
        L78:
            r9.p(r15)
            goto L83
        L7c:
            r2 = 1668543379(0x6373f393, float:4.5001102E21)
            r9.a0(r2)
            goto L78
        L83:
            rb.e r2 = r3.f11883c
            java.lang.String r7 = r3.f11884d
            rb.e r8 = rb.e.f11886h
            if (r2 != r8) goto L8e
            java.lang.String r2 = "好友关系异常"
            goto L90
        L8e:
            java.lang.String r2 = "检测失败"
        L90:
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto L97
            goto L9d
        L97:
            java.lang.String r8 = " · "
            java.lang.String r2 = wb.en.h(r2, r8, r7)
        L9d:
            java.lang.String r3 = r3.f11882b
            wb.ho.v4(r3, r2, r9, r15)
            r2 = r6
            goto L5d
        La4:
            a.a.Q0()
            throw r14
        La8:
            r9.p(r15)
            goto Laf
        Lac:
            r9.V()
        Laf:
            sf.n r0 = sf.n.f12433a
            return r0
        Lb2:
            java.lang.Object r3 = r1.f411h
            wb.h5 r3 = (wb.h5) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6 = r2 & 3
            if (r6 == r13) goto Lc4
            r6 = r5
            goto Lc5
        Lc4:
            r6 = r15
        Lc5:
            r2 = r2 & r5
            boolean r2 = r0.S(r2, r6)
            if (r2 == 0) goto L176
            r2 = 542554095(0x2056b7ef, float:1.8187364E-19)
            r0.a0(r2)
            java.util.ArrayList r2 = r3.f16490b
            r3 = 30
            java.util.List r6 = tf.m.L1(r3, r2)
            java.util.Iterator r6 = r6.iterator()
            r7 = r15
        Ldf:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L13b
            java.lang.Object r8 = r6.next()
            int r9 = r7 + 1
            if (r7 < 0) goto L137
            aa.a r8 = (aa.a) r8
            java.lang.String r10 = r8.f107d
            boolean r11 = og.m.t0(r10)
            if (r11 == 0) goto Lf9
            java.lang.String r10 = r8.f106c
        Lf9:
            java.lang.String r8 = wb.ho.l6(r8)
            java.lang.Object r11 = r0.P()
            i0.e r12 = i0.l.f5952a
            if (r11 != r12) goto L10f
            k.s1 r11 = new k.s1
            r12 = 25
            r11.<init>(r12)
            r0.k0(r11)
        L10f:
            fg.a r11 = (fg.a) r11
            r12 = 384(0x180, float:5.38E-43)
            wb.ho.x3(r10, r8, r11, r0, r12)
            int r8 = r2.size()
            int r8 = java.lang.Math.min(r8, r3)
            int r8 = r8 - r5
            if (r7 >= r8) goto L12e
            r7 = -729884227(0xffffffffd47ed9bd, float:-4.378299E12)
            r0.a0(r7)
            wb.ho.D1(r4, r0, r15, r5)
        L12a:
            r0.p(r15)
            goto L135
        L12e:
            r7 = -1151561101(0xffffffffbb5c9273, float:-0.0033656626)
            r0.a0(r7)
            goto L12a
        L135:
            r7 = r9
            goto Ldf
        L137:
            a.a.Q0()
            throw r14
        L13b:
            r0.p(r15)
            int r6 = r2.size()
            if (r6 <= r3) goto L16c
            r6 = -360243171(0xffffffffea87201d, float:-8.167832E25)
            r0.a0(r6)
            wb.ho.D1(r4, r0, r15, r5)
            int r2 = r2.size()
            int r2 = r2 - r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "还有 "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " 个名单项未展开显示"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            wb.ho.s0(r2, r0, r15)
            r0.p(r15)
            goto L179
        L16c:
            r2 = -360106709(0xffffffffea89352b, float:-8.293696E25)
            r0.a0(r2)
            r0.p(r15)
            goto L179
        L176:
            r0.V()
        L179:
            sf.n r0 = sf.n.f12433a
            return r0
        L17c:
            java.lang.Object r3 = r1.f411h
            i0.j1 r3 = (i0.j1) r3
            vb.a r0 = (vb.a) r0
            wb.c3 r2 = (wb.c3) r2
            r0.getClass()
            wb.s2 r4 = new wb.s2
            r4.<init>(r0, r2, r5)
            r3.setValue(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L192:
            java.lang.Object r3 = r1.f411h
            wb.y2 r3 = (wb.y2) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = i0.r.C(r12)
            r3.b(r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L1a7:
            java.lang.Object r3 = r1.f411h
            w0.s r3 = (w0.s) r3
            java.util.Set r0 = (java.util.Set) r0
            w0.f r2 = (w0.f) r2
            java.util.concurrent.atomic.AtomicReference r2 = r3.f14811b
        L1b1:
            java.lang.Object r4 = r2.get()
            if (r4 != 0) goto L1bb
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            goto L1d9
        L1bb:
            boolean r6 = r4 instanceof java.util.Set
            if (r6 == 0) goto L1ca
            java.util.Set[] r6 = new java.util.Set[r13]
            r6[r15] = r4
            r6[r5] = r0
            java.util.List r6 = a.a.y0(r6)
            goto L1d9
        L1ca:
            boolean r6 = r4 instanceof java.util.List
            if (r6 == 0) goto L1f9
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r7 = a.a.x0(r0)
            java.util.ArrayList r6 = tf.m.F1(r6, r7)
        L1d9:
            boolean r7 = r2.compareAndSet(r4, r6)
            if (r7 == 0) goto L1f2
            boolean r0 = r3.b()
            if (r0 == 0) goto L1ef
            fg.l r0 = r3.f14810a
            v0.a r2 = new v0.a
            r2.<init>(r3, r12)
            r0.invoke(r2)
        L1ef:
            sf.n r14 = sf.n.f12433a
            goto L201
        L1f2:
            java.lang.Object r7 = r2.get()
            if (r7 == r4) goto L1d9
            goto L1b1
        L1f9:
            java.lang.String r0 = "Unexpected notification"
            i0.m.b(r0)
            okio.a.c()
        L201:
            return r14
        L202:
            java.lang.Object r3 = r1.f411h
            w.n1 r3 = (w.n1) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = i0.r.C(r5)
            r3.a(r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L217:
            java.lang.Object r3 = r1.f411h
            w.y0 r3 = (w.y0) r3
            s1.t r0 = (s1.t) r0
            r0 = r2
            e1.b r0 = (e1.b) r0
            long r4 = r0.f2294a
            r3.e(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L228:
            java.lang.Object r3 = r1.f411h
            h0.d1 r3 = (h0.d1) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = i0.r.C(r5)
            w.s.j(r3, r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L23d:
            java.lang.Object r3 = r1.f411h
            ug.k r3 = (ug.k) r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            r0 = r2
            wf.e r0 = (wf.e) r0
            wf.f r2 = r0.getKey()
            wf.g r3 = r3.f13828h
            wf.e r3 = r3.s(r2)
            qg.q r5 = qg.q.f11090h
            if (r2 == r5) goto L260
            if (r0 == r3) goto L25d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L273
        L25d:
            int r4 = r4 + 1
            goto L273
        L260:
            qg.r0 r3 = (qg.r0) r3
            qg.r0 r0 = (qg.r0) r0
        L264:
            if (r0 != 0) goto L267
            goto L26f
        L267:
            if (r0 != r3) goto L26a
            goto L26e
        L26a:
            boolean r2 = r0 instanceof vg.p
            if (r2 != 0) goto L29d
        L26e:
            r14 = r0
        L26f:
            if (r14 != r3) goto L278
            if (r3 != 0) goto L25d
        L273:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        L278:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r2.<init>(r4)
            r2.append(r14)
            java.lang.String r4 = ", expected child of "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L29d:
            vg.p r0 = (vg.p) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = qg.y0.f11125h
            java.lang.Object r0 = r2.get(r0)
            qg.j r0 = (qg.j) r0
            if (r0 == 0) goto L2ae
            qg.r0 r0 = r0.getParent()
            goto L264
        L2ae:
            r0 = r14
            goto L264
        L2b0:
            java.lang.Object r3 = r1.f411h
            fg.q r3 = (fg.q) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r2 & 3
            if (r4 == r13) goto L2c1
            r15 = r5
        L2c1:
            r2 = r2 & r5
            boolean r2 = r0.S(r2, r15)
            if (r2 == 0) goto L322
            p.c r2 = p.j.f9925b
            y0.f r4 = y0.b.f21802q
            y0.l r6 = y0.l.f21818a
            r7 = 54
            p.e1 r2 = p.d1.a(r2, r4, r0, r7)
            long r7 = r0.T
            int r4 = java.lang.Long.hashCode(r7)
            s0.h r7 = r0.l()
            y0.o r6 = y0.a.c(r0, r6)
            x1.f r8 = x1.g.f20914f
            r8.getClass()
            x1.y r8 = x1.f.f20883b
            r0.d0()
            boolean r9 = r0.S
            if (r9 == 0) goto L2f4
            r0.k(r8)
            goto L2f7
        L2f4:
            r0.n0()
        L2f7:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r0, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r0, r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.t(r0, r2, r4)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r0)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r0, r6)
            p.f1 r2 = p.f1.f9898a
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.b(r2, r0, r4)
            r0.p(r5)
            goto L325
        L322:
            r0.V()
        L325:
            sf.n r0 = sf.n.f12433a
            return r0
        L328:
            java.lang.Object r3 = r1.f411h
            p8.d0 r3 = (p8.d0) r3
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.getClass()
            if (r2 != 0) goto L336
            goto L340
        L336:
            java.lang.String r2 = r2.getMessage()
            java.lang.String r4 = ": "
            java.lang.String r0 = wb.en.h(r0, r4, r2)
        L340:
            r3.l(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L346:
            java.lang.Object r3 = r1.f411h
            p8.c0 r3 = (p8.c0) r3
            java.lang.String r0 = (java.lang.String) r0
            p8.c0 r2 = (p8.c0) r2
            r0.getClass()
            r2.getClass()
            if (r2 == r3) goto L357
            goto L35f
        L357:
            int r0 = r2.f10321b
            int r0 = r0 + (-1)
            r2.f10321b = r0
            if (r0 <= 0) goto L360
        L35f:
            r14 = r2
        L360:
            return r14
        L361:
            java.lang.Object r3 = r1.f411h
            r4 = r3
            y0.g r4 = (y0.g) r4
            u2.l r0 = (u2.l) r0
            r9 = r2
            u2.m r9 = (u2.m) r9
            r5 = 0
            long r7 = r0.f13353a
            long r2 = r4.a(r5, r7, r9)
            u2.j r0 = new u2.j
            r0.<init>(r2)
            return r0
        L379:
            java.lang.Object r3 = r1.f411h
            char[] r3 = (char[]) r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            int r0 = og.m.s0(r0, r3, r2, r15)
            if (r0 >= 0) goto L38f
            goto L39c
        L38f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            sf.e r14 = new sf.e
            r14.<init>(r0, r2)
        L39c:
            return r14
        L39d:
            java.lang.Object r3 = r1.f411h
            m.h2 r3 = (m.h2) r3
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            qg.t r4 = r3.Y0()
            m.g2 r5 = new m.g2
            r5.<init>(r3, r0, r2, r14)
            r0 = 3
            qg.v.q(r4, r14, r5, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L3bd:
            java.lang.Object r3 = r1.f411h
            g1.d r3 = (g1.d) r3
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            android.graphics.RectF r2 = (android.graphics.RectF) r2
            e1.c r0 = f1.c0.y(r0)
            e1.c r2 = f1.c0.y(r2)
            int r3 = r3.f4067g
            switch(r3) {
                case 16: goto L3db;
                default: goto L3d2;
            }
        L3d2:
            long r3 = r0.b()
            boolean r0 = r2.a(r3)
            goto L3df
        L3db:
            boolean r0 = r0.g(r2)
        L3df:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3e4:
            java.lang.Object r3 = r1.f411h
            fg.l r3 = (fg.l) r3
            sf.n r2 = (sf.n) r2
            r3.invoke(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L3f0:
            java.lang.Object r3 = r1.f411h
            i0.f2 r3 = (i0.f2) r3
            java.util.Set r0 = (java.util.Set) r0
            w0.f r2 = (w0.f) r2
            java.lang.Object r2 = r3.f3080g
            monitor-enter(r2)
            f.l0 r4 = r3.f5884j     // Catch: java.lang.Throwable -> L40c
            if (r4 != 0) goto L412
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L40c
            java.lang.Object r4 = r3.f5882h     // Catch: java.lang.Throwable -> L40c
            boolean r0 = tf.m.o1(r0, r4)     // Catch: java.lang.Throwable -> L40c
            if (r0 == 0) goto L40f
            sg.p r14 = r3.f5886l     // Catch: java.lang.Throwable -> L40c
            goto L466
        L40c:
            r0 = move-exception
            goto L471
        L40f:
            r23 = r14
            goto L464
        L412:
            java.lang.Object[] r5 = r4.f2856b     // Catch: java.lang.Throwable -> L40c
            long[] r4 = r4.f2855a     // Catch: java.lang.Throwable -> L40c
            int r6 = r4.length     // Catch: java.lang.Throwable -> L40c
            int r6 = r6 - r13
            if (r6 < 0) goto L40f
            r13 = r15
            r18 = 255(0xff, double:1.26E-321)
        L41d:
            r7 = r4[r13]     // Catch: java.lang.Throwable -> L40c
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = ~r7     // Catch: java.lang.Throwable -> L40c
            long r10 = r10 << r12
            long r10 = r10 & r7
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L45b
            int r10 = r13 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L40c
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = r15
        L435:
            if (r11 >= r10) goto L456
            long r22 = r7 & r18
            int r22 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r22 >= 0) goto L44e
            int r22 = r13 << 3
            int r22 = r22 + r11
            r23 = r14
            r14 = r5[r22]     // Catch: java.lang.Throwable -> L40c
            boolean r14 = r0.contains(r14)     // Catch: java.lang.Throwable -> L40c
            if (r14 == 0) goto L450
            sg.p r14 = r3.f5886l     // Catch: java.lang.Throwable -> L40c
            goto L466
        L44e:
            r23 = r14
        L450:
            long r7 = r7 >> r9
            int r11 = r11 + 1
            r14 = r23
            goto L435
        L456:
            r23 = r14
            if (r10 != r9) goto L464
            goto L45d
        L45b:
            r23 = r14
        L45d:
            if (r13 == r6) goto L464
            int r13 = r13 + 1
            r14 = r23
            goto L41d
        L464:
            r14 = r23
        L466:
            monitor-exit(r2)
            if (r14 == 0) goto L46e
            sf.n r0 = sf.n.f12433a
            r14.p(r0)
        L46e:
            sf.n r0 = sf.n.f12433a
            return r0
        L471:
            monitor-exit(r2)
            throw r0
        L473:
            r23 = r14
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Object r3 = r1.f411h
            i0.y1 r3 = (i0.y1) r3
            java.util.Set r0 = (java.util.Set) r0
            w0.f r2 = (w0.f) r2
            java.lang.Object r2 = r3.f6098c
            monitor-enter(r2)
            tg.b0 r4 = r3.f6116u     // Catch: java.lang.Throwable -> L4db
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L4db
            i0.u1 r4 = (i0.u1) r4     // Catch: java.lang.Throwable -> L4db
            i0.u1 r6 = i0.u1.f6054k     // Catch: java.lang.Throwable -> L4db
            int r4 = r4.compareTo(r6)     // Catch: java.lang.Throwable -> L4db
            if (r4 < 0) goto L520
            f.l0 r4 = r3.f6103h     // Catch: java.lang.Throwable -> L4db
            boolean r6 = r0 instanceof j0.d     // Catch: java.lang.Throwable -> L4db
            if (r6 == 0) goto L4f9
            j0.d r0 = (j0.d) r0     // Catch: java.lang.Throwable -> L4db
            f.l0 r0 = r0.f6674g     // Catch: java.lang.Throwable -> L4db
            java.lang.Object[] r6 = r0.f2856b     // Catch: java.lang.Throwable -> L4db
            long[] r0 = r0.f2855a     // Catch: java.lang.Throwable -> L4db
            int r7 = r0.length     // Catch: java.lang.Throwable -> L4db
            int r7 = r7 - r13
            if (r7 < 0) goto L51b
            r8 = r15
        L4aa:
            r10 = r0[r8]     // Catch: java.lang.Throwable -> L4db
            long r13 = ~r10     // Catch: java.lang.Throwable -> L4db
            long r13 = r13 << r12
            long r13 = r13 & r10
            long r13 = r13 & r20
            int r13 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r13 == 0) goto L4ef
            int r13 = r8 - r7
            int r13 = ~r13     // Catch: java.lang.Throwable -> L4db
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r15
        L4bd:
            if (r14 >= r13) goto L4ea
            long r22 = r10 & r18
            int r22 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r22 >= 0) goto L4e1
            int r22 = r8 << 3
            int r22 = r22 + r14
            r24 = r12
            r12 = r6[r22]     // Catch: java.lang.Throwable -> L4db
            boolean r15 = r12 instanceof w0.v     // Catch: java.lang.Throwable -> L4db
            if (r15 == 0) goto L4dd
            r15 = r12
            w0.v r15 = (w0.v) r15     // Catch: java.lang.Throwable -> L4db
            boolean r15 = r15.e(r5)     // Catch: java.lang.Throwable -> L4db
            if (r15 != 0) goto L4dd
            goto L4e3
        L4db:
            r0 = move-exception
            goto L52f
        L4dd:
            r4.a(r12)     // Catch: java.lang.Throwable -> L4db
            goto L4e3
        L4e1:
            r24 = r12
        L4e3:
            long r10 = r10 >> r9
            int r14 = r14 + 1
            r12 = r24
            r15 = 0
            goto L4bd
        L4ea:
            r24 = r12
            if (r13 != r9) goto L51b
            goto L4f1
        L4ef:
            r24 = r12
        L4f1:
            if (r8 == r7) goto L51b
            int r8 = r8 + 1
            r12 = r24
            r15 = 0
            goto L4aa
        L4f9:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L4db
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4db
        L4ff:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L4db
            if (r6 == 0) goto L51b
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4db
            boolean r7 = r6 instanceof w0.v     // Catch: java.lang.Throwable -> L4db
            if (r7 == 0) goto L517
            r7 = r6
            w0.v r7 = (w0.v) r7     // Catch: java.lang.Throwable -> L4db
            boolean r7 = r7.e(r5)     // Catch: java.lang.Throwable -> L4db
            if (r7 != 0) goto L517
            goto L4ff
        L517:
            r4.a(r6)     // Catch: java.lang.Throwable -> L4db
            goto L4ff
        L51b:
            qg.f r14 = r3.y()     // Catch: java.lang.Throwable -> L4db
            goto L522
        L520:
            r14 = r23
        L522:
            monitor-exit(r2)
            if (r14 == 0) goto L52c
            sf.n r0 = sf.n.f12433a
            qg.g r14 = (qg.g) r14
            r14.resumeWith(r0)
        L52c:
            sf.n r0 = sf.n.f12433a
            return r0
        L52f:
            monitor-exit(r2)
            throw r0
        L531:
            r24 = r12
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Object r3 = r1.f411h
            i0.z0 r3 = (i0.z0) r3
            java.util.Set r0 = (java.util.Set) r0
            w0.f r2 = (w0.f) r2
            java.lang.Object r2 = r3.f3080g
            monitor-enter(r2)
            f.k0 r4 = r3.f6121h     // Catch: java.lang.Throwable -> L5bd
            c9.i r6 = new c9.i     // Catch: java.lang.Throwable -> L5bd
            r7 = 20
            r6.<init>(r0, r7, r3)     // Catch: java.lang.Throwable -> L5bd
            gg.x.c(r5, r6)     // Catch: java.lang.Throwable -> L5bd
            java.lang.Object[] r0 = r4.f2849b     // Catch: java.lang.Throwable -> L5bd
            long[] r4 = r4.f2848a     // Catch: java.lang.Throwable -> L5bd
            int r5 = r4.length     // Catch: java.lang.Throwable -> L5bd
            int r5 = r5 - r13
            if (r5 < 0) goto L589
            r7 = 0
        L55a:
            r10 = r4[r7]     // Catch: java.lang.Throwable -> L5bd
            long r14 = ~r10     // Catch: java.lang.Throwable -> L5bd
            long r14 = r14 << r24
            long r14 = r14 & r10
            long r14 = r14 & r20
            int r8 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r8 == 0) goto L584
            int r8 = r7 - r5
            int r8 = ~r8     // Catch: java.lang.Throwable -> L5bd
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r12 = 0
        L56e:
            if (r12 >= r8) goto L582
            long r14 = r10 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57e
            int r14 = r7 << 3
            int r14 = r14 + r12
            r14 = r0[r14]     // Catch: java.lang.Throwable -> L5bd
            r6.invoke(r14)     // Catch: java.lang.Throwable -> L5bd
        L57e:
            long r10 = r10 >> r9
            int r12 = r12 + 1
            goto L56e
        L582:
            if (r8 != r9) goto L589
        L584:
            if (r7 == r5) goto L589
            int r7 = r7 + 1
            goto L55a
        L589:
            f.l0 r0 = r3.f6123j     // Catch: java.lang.Throwable -> L5bd
            java.lang.Object[] r4 = r0.f2856b     // Catch: java.lang.Throwable -> L5bd
            long[] r0 = r0.f2855a     // Catch: java.lang.Throwable -> L5bd
            int r5 = r0.length     // Catch: java.lang.Throwable -> L5bd
            int r5 = r5 - r13
            if (r5 < 0) goto L5ca
            r6 = 0
        L594:
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L5bd
            long r10 = ~r7     // Catch: java.lang.Throwable -> L5bd
            long r10 = r10 << r24
            long r10 = r10 & r7
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L5c5
            int r10 = r6 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L5bd
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L5a8:
            if (r11 >= r10) goto L5c3
            long r12 = r7 & r18
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 >= 0) goto L5bf
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r4[r12]     // Catch: java.lang.Throwable -> L5bd
            sg.p r12 = (sg.p) r12     // Catch: java.lang.Throwable -> L5bd
            sf.n r13 = sf.n.f12433a     // Catch: java.lang.Throwable -> L5bd
            r12.p(r13)     // Catch: java.lang.Throwable -> L5bd
            goto L5bf
        L5bd:
            r0 = move-exception
            goto L5d3
        L5bf:
            long r7 = r7 >> r9
            int r11 = r11 + 1
            goto L5a8
        L5c3:
            if (r10 != r9) goto L5ca
        L5c5:
            if (r6 == r5) goto L5ca
            int r6 = r6 + 1
            goto L594
        L5ca:
            f.l0 r0 = r3.f6123j     // Catch: java.lang.Throwable -> L5bd
            r0.b()     // Catch: java.lang.Throwable -> L5bd
            monitor-exit(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L5d3:
            monitor-exit(r2)
            throw r0
        L5d5:
            r23 = r14
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            if (r3 == r13) goto L5e5
            r15 = r5
            goto L5e6
        L5e5:
            r15 = 0
        L5e6:
            r2 = r2 & r5
            boolean r2 = r0.S(r2, r15)
            if (r2 != 0) goto L5f3
            r0.V()
            sf.n r0 = sf.n.f12433a
            return r0
        L5f3:
            throw r23
        L5f4:
            java.lang.Object r3 = r1.f411h
            b5.i r3 = (b5.i) r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            boolean r0 = r2 instanceof i0.h
            if (r0 == 0) goto L61d
            r0 = r2
            i0.h r0 = (i0.h) r0
            java.lang.Object r4 = r3.f483i
            f.l0 r4 = (f.l0) r4
            if (r4 != 0) goto L613
            f.l0 r4 = f.s0.f2899a
            f.l0 r4 = new f.l0
            r4.<init>()
            r3.f483i = r4
        L613:
            r4.k(r0)
            java.lang.Object r4 = r3.f481g
            j0.b r4 = (j0.b) r4
            r4.b(r0)
        L61d:
            boolean r0 = r2 instanceof i0.k0
            if (r0 == 0) goto L627
            r0 = r2
            i0.k0 r0 = (i0.k0) r0
            r3.g(r0)
        L627:
            boolean r0 = r2 instanceof i0.r1
            if (r0 == 0) goto L631
            r0 = r2
            i0.r1 r0 = (i0.r1) r0
            r0.c()
        L631:
            sf.n r0 = sf.n.f12433a
            return r0
        L634:
            java.lang.Object r3 = r1.f411h
            i.g0 r3 = (i.g0) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = i0.r.C(r5)
            r3.a(r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L649:
            java.lang.Object r3 = r1.f411h
            gg.t r3 = (gg.t) r3
            s1.t r0 = (s1.t) r0
            e1.b r2 = (e1.b) r2
            r0.a()
            long r4 = r2.f2294a
            r3.f4563g = r4
            sf.n r0 = sf.n.f12433a
            return r0
        L65b:
            r24 = r12
            java.lang.Object r3 = r1.f411h
            ci.a r3 = (ci.a) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = i0.r.C(r24)
            r3.a(r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L672:
            java.lang.Object r3 = r1.f411h
            ca.f0 r3 = (ca.f0) r3
            android.app.Activity r0 = (android.app.Activity) r0
            p8.l r2 = (p8.l) r2
            r0.getClass()
            r2.getClass()
            b0.t r3 = r3.f1501c
            p8.v r2 = r2.f10392b
            r3.invoke(r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L68a:
            r24 = r12
            java.lang.Object r3 = r1.f411h
            ca.f r3 = (ca.f) r3
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            r0 = r2
            p8.v r0 = (p8.v) r0
            r4.getClass()
            r0.getClass()
            ca.e0 r2 = r3.f1497e
            if (r2 == 0) goto L6e3
            java.lang.String r5 = "转发[H]"
            java.lang.String r6 = ""
            java.lang.String r3 = "转发到朋友圈"
            java.lang.String r7 = ""
            sf.e r8 = new sf.e
            r8.<init>(r3, r7)
            java.lang.String r3 = "转发给好友"
            sf.e r9 = new sf.e
            r9.<init>(r3, r7)
            java.lang.String r3 = "分享"
            sf.e r10 = new sf.e
            r10.<init>(r3, r7)
            java.lang.String r3 = "群发助手"
            sf.e r11 = new sf.e
            r11.<init>(r3, r7)
            java.lang.String r3 = "转发至标签"
            sf.e r12 = new sf.e
            r12.<init>(r3, r7)
            sf.e[] r3 = new sf.e[]{r8, r9, r10, r11, r12}
            java.util.List r7 = a.a.y0(r3)
            ca.g r8 = new ca.g
            r3 = 0
            r8.<init>(r2, r4, r0, r3)
            bi.c r9 = new bi.c
            r0 = r24
            r9.<init>(r0)
            wb.lv r10 = wb.lv.f17583j
            wb.y2.Q1(r4, r5, r6, r7, r8, r9, r10)
        L6e3:
            sf.n r0 = sf.n.f12433a
            return r0
        L6e6:
            java.lang.Object r3 = r1.f411h
            android.app.RemoteAction r3 = (android.app.RemoteAction) r3
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.intValue()
            r2 = -1376593684(0xffffffffadf2d8ec, float:-2.7608547E-11)
            r0.a0(r2)
            java.lang.CharSequence r2 = r3.getTitle()
            java.lang.String r2 = r2.toString()
            r3 = 0
            r0.p(r3)
            return r2
        L704:
            r3 = r15
            java.lang.Object r4 = r1.f411h
            android.view.textclassifier.TextClassification r4 = (android.view.textclassifier.TextClassification) r4
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            r2 = 950061013(0x38a0c7d5, float:7.666616E-5)
            r0.a0(r2)
            java.lang.CharSequence r2 = r4.getLabel()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.p(r3)
            return r2
        L722:
            r3 = r15
            java.lang.Object r4 = r1.f411h
            z.d r4 = (z.d) r4
            i0.h0 r0 = (i0.h0) r0
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            r2 = 666084174(0x27b3a34e, float:4.9859536E-15)
            r0.a0(r2)
            java.lang.String r2 = r4.f22463b
            r0.p(r3)
            return r2
    }
}
