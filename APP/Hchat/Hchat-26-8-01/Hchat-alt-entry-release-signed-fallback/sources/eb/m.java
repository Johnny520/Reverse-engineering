package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2586n;

    public /* synthetic */ m(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, int r8) {
            r0 = this;
            r0.f2579g = r8
            r0.f2580h = r1
            r0.f2581i = r2
            r0.f2582j = r3
            r0.f2585m = r4
            r0.f2586n = r5
            r0.f2583k = r6
            r0.f2584l = r7
            r0.<init>()
            return
    }

    public /* synthetic */ m(java.lang.String r2, java.lang.String r3, java.util.ArrayList r4, java.util.Set r5, java.lang.String r6, h.Hchat.hooks.items.script.ScriptPluginBridge r7, java.util.function.Consumer r8) {
            r1 = this;
            r0 = 1
            r1.f2579g = r0
            r1.<init>()
            r1.f2580h = r2
            r1.f2581i = r3
            r1.f2585m = r4
            r1.f2586n = r5
            r1.f2582j = r6
            r1.f2583k = r7
            r1.f2584l = r8
            return
    }

    public /* synthetic */ m(wb.hq r2, java.lang.String r3, i0.a1 r4, i0.a1 r5, java.util.List r6, fg.a r7, android.content.Context r8) {
            r1 = this;
            r0 = 5
            r1.f2579g = r0
            r1.<init>()
            r1.f2581i = r2
            r1.f2580h = r3
            r1.f2582j = r4
            r1.f2585m = r5
            r1.f2586n = r6
            r1.f2583k = r7
            r1.f2584l = r8
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r30) {
            r29 = this;
            r1 = r29
            int r0 = r1.f2579g
            switch(r0) {
                case 0: goto L751;
                case 1: goto L725;
                case 2: goto L5e1;
                case 3: goto L571;
                case 4: goto L4c6;
                case 5: goto L456;
                case 6: goto L3a1;
                case 7: goto L30f;
                case 8: goto L217;
                case 9: goto La9;
                case 10: goto L79;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f2580h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.f2581i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f2582j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f2585m
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f2586n
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r1.f2583k
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r1.f2584l
            i0.a1 r7 = (i0.a1) r7
            r8 = r30
            i0.a0 r8 = (i0.a0) r8
            r8.getClass()
            if (r0 == 0) goto L73
            boolean r9 = og.m.t0(r0)
            if (r9 == 0) goto L33
            goto L73
        L33:
            android.media.MediaPlayer r9 = new android.media.MediaPlayer     // Catch: java.lang.Throwable -> L5a
            r9.<init>()     // Catch: java.lang.Throwable -> L5a
            r9.setDataSource(r0)     // Catch: java.lang.Throwable -> L5a
            wb.fv r0 = new wb.fv     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L5a
            r9.setOnPreparedListener(r0)     // Catch: java.lang.Throwable -> L5a
            wb.gv r0 = new wb.gv     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r8, r4, r5)     // Catch: java.lang.Throwable -> L5a
            r9.setOnCompletionListener(r0)     // Catch: java.lang.Throwable -> L5a
            wb.hv r0 = new wb.hv     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r3, r4, r6)     // Catch: java.lang.Throwable -> L5a
            r9.setOnErrorListener(r0)     // Catch: java.lang.Throwable -> L5a
            r7.setValue(r9)     // Catch: java.lang.Throwable -> L5a
            r9.prepareAsync()     // Catch: java.lang.Throwable -> L5a
            goto L60
        L5a:
            r0 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r0)
        L60:
            java.lang.Throwable r0 = sf.g.b(r9)
            if (r0 == 0) goto L73
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            r4.setValue(r0)
            java.lang.String r0 = "预览播放失败"
            r6.setValue(r0)
        L73:
            w.g1 r0 = new w.g1
            r0.<init>(r7, r8)
            return r0
        L79:
            java.lang.Object r0 = r1.f2580h
            r3 = r0
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.Object r0 = r1.f2581i
            r4 = r0
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r0 = r1.f2582j
            r5 = r0
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r0 = r1.f2585m
            r6 = r0
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r0 = r1.f2586n
            r7 = r0
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r0 = r1.f2583k
            r8 = r0
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r0 = r1.f2584l
            r9 = r0
            i0.a1 r9 = (i0.a1) r9
            r0 = r30
            i0.a0 r0 = (i0.a0) r0
            r0.getClass()
            wb.tn r2 = new wb.tn
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        La9:
            java.lang.Object r0 = r1.f2580h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f2581i
            r4 = r2
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r1.f2582j
            r5 = r2
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r2 = r1.f2585m
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f2586n
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.Object r6 = r1.f2583k
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r1.f2584l
            r11 = r7
            i0.a1 r11 = (i0.a1) r11
            r7 = r30
            java.util.List r7 = (java.util.List) r7
            r7.getClass()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r8 = tf.n.e1(r7)
            r12.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        Ldc:
            boolean r8 = r7.hasNext()
            r9 = 1
            if (r8 == 0) goto L190
            java.lang.Object r8 = r7.next()
            wb.m5 r8 = (wb.m5) r8
            java.lang.Object r10 = r4.getValue()
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r15 = r5.getValue()
            java.util.List r15 = (java.util.List) r15
            wb.s0 r13 = r8.f17595a
            java.lang.String r13 = r13.f18970a
            java.lang.String r13 = a7.a.e(r13)
            java.util.Iterator r15 = r15.iterator()
        L101:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L11c
            java.lang.Object r16 = r15.next()
            r14 = r16
            na.i r14 = (na.i) r14
            java.lang.String r14 = r14.f9144b
            java.lang.String r14 = a7.a.e(r14)
            boolean r14 = gg.l.a(r14, r13)
            if (r14 == 0) goto L101
            goto L11e
        L11c:
            r16 = 0
        L11e:
            r13 = r16
            na.i r13 = (na.i) r13
            wb.s0 r8 = r8.f17595a
            java.lang.String r14 = r8.f18970a
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r20 = r14.toString()
            if (r13 == 0) goto L137
            java.lang.String r14 = r13.f9143a
            if (r14 == 0) goto L137
        L134:
            r19 = r14
            goto L13c
        L137:
            java.lang.String r14 = a7.a.e(r20)
            goto L134
        L13c:
            if (r13 == 0) goto L14f
            java.lang.String r14 = r13.f9145c
            if (r14 == 0) goto L14f
            boolean r15 = og.m.t0(r14)
            if (r15 != 0) goto L149
            goto L14a
        L149:
            r14 = 0
        L14a:
            if (r14 == 0) goto L14f
        L14c:
            r21 = r14
            goto L15c
        L14f:
            java.lang.String r8 = r8.f18971b
            boolean r14 = og.m.t0(r8)
            if (r14 == 0) goto L15a
            r14 = r20
            goto L14c
        L15a:
            r14 = r8
            goto L14c
        L15c:
            if (r13 == 0) goto L163
            boolean r14 = r13.f9146d
            r22 = r14
            goto L165
        L163:
            r22 = 0
        L165:
            if (r13 == 0) goto L16e
            java.lang.String r8 = r13.f9147e
            if (r8 == 0) goto L16e
        L16b:
            r23 = r8
            goto L180
        L16e:
            int r8 = r10.size()
            if (r8 != r9) goto L17d
            java.lang.Object r8 = tf.m.t1(r10)
            na.j r8 = (na.j) r8
            java.lang.String r8 = r8.f9150a
            goto L16b
        L17d:
            java.lang.String r8 = ""
            goto L16b
        L180:
            na.i r18 = new na.i
            r24 = 0
            r25 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r8 = r18
            r12.add(r8)
            goto Ldc
        L190:
            int r7 = r12.size()
            if (r7 != r9) goto L1ea
            java.lang.Object r0 = tf.m.t1(r12)
            na.i r0 = (na.i) r0
            java.lang.Object r3 = r5.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L1a7:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1c1
            java.lang.Object r6 = r3.next()
            na.i r6 = (na.i) r6
            java.lang.String r6 = r6.f9144b
            java.lang.String r7 = r0.f9144b
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L1be
            goto L1c2
        L1be:
            int r4 = r4 + 1
            goto L1a7
        L1c1:
            r4 = -1
        L1c2:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r4 < 0) goto L1c9
            goto L1ca
        L1c9:
            r3 = 0
        L1ca:
            if (r3 == 0) goto L1d1
            int r3 = r3.intValue()
            goto L1db
        L1d1:
            java.lang.Object r3 = r5.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
        L1db:
            if (r4 < 0) goto L1df
            r14 = r9
            goto L1e0
        L1df:
            r14 = 0
        L1e0:
            wb.hq r4 = new wb.hq
            r4.<init>(r3, r0, r14)
            r2.setValue(r4)
        L1e8:
            r0 = 0
            goto L211
        L1ea:
            boolean r2 = r12.isEmpty()
            if (r2 != 0) goto L1e8
            java.lang.Object r2 = r5.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r8 = wb.ho.t7(r2, r12)
            r5.setValue(r8)
            r9 = 0
            r10 = 80
            r7 = 0
            wb.ho.Y2(r3, r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.size()
            java.lang.String r3 = "已添加 "
            java.lang.String r4 = " 个适用聊天"
            r5 = 0
            wb.en.o(r3, r2, r4, r0, r5)
            goto L1e8
        L211:
            r11.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L217:
            java.lang.Object r0 = r1.f2580h
            x8.r r0 = (x8.r) r0
            java.lang.Object r2 = r1.f2581i
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f2582j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f2585m
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f2586n
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r1.f2583k
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r1.f2584l
            i0.a1 r7 = (i0.a1) r7
            r27 = r30
            java.util.List r27 = (java.util.List) r27
            r27.getClass()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r8 = "autoAccept"
            boolean r8 = gg.l.a(r3, r8)
            r9 = 0
            if (r8 == 0) goto L258
            r0.getClass()
            java.lang.String r3 = "auto_accept_steps_v1"
            java.lang.String r4 = r9.e0.B(r27)
            r0.k(r3, r4)
        L255:
            r4 = r9
            goto L2ff
        L258:
            java.lang.String r8 = "greetAccepted"
            boolean r3 = gg.l.a(r3, r8)
            if (r3 == 0) goto L26d
            r0.getClass()
            java.lang.String r3 = "greet_accepted_steps_v1"
            java.lang.String r4 = r9.e0.B(r27)
            r0.k(r3, r4)
            goto L255
        L26d:
            java.lang.Object r3 = r4.getValue()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L255
            java.lang.Object r4 = r5.getValue()
            x8.b r4 = (x8.b) r4
            if (r4 == 0) goto L27f
        L27d:
            r8 = r4
            goto L2a4
        L27f:
            java.lang.Object r4 = r6.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L289:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L29f
            java.lang.Object r8 = r4.next()
            r10 = r8
            x8.b r10 = (x8.b) r10
            java.lang.String r10 = r10.f21231a
            boolean r10 = gg.l.a(r10, r3)
            if (r10 == 0) goto L289
            goto L2a0
        L29f:
            r8 = r9
        L2a0:
            r4 = r8
            x8.b r4 = (x8.b) r4
            goto L27d
        L2a4:
            if (r8 == 0) goto L2ca
            r26 = 0
            r28 = 262143(0x3ffff, float:3.6734E-40)
            r4 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            x8.b r9 = x8.b.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            goto L2cb
        L2ca:
            r4 = r9
        L2cb:
            if (r9 == 0) goto L2ff
            r5.setValue(r9)
            java.lang.Object r5 = r6.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = tf.n.e1(r5)
            r8.<init>(r10)
            java.util.Iterator r5 = r5.iterator()
        L2e3:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L2fc
            java.lang.Object r10 = r5.next()
            x8.b r10 = (x8.b) r10
            java.lang.String r11 = r10.f21231a
            boolean r11 = gg.l.a(r11, r3)
            if (r11 == 0) goto L2f8
            r10 = r9
        L2f8:
            r8.add(r10)
            goto L2e3
        L2fc:
            wb.ho.B(r0, r6, r8)
        L2ff:
            java.lang.String r0 = "回复步骤已保存"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            r7.setValue(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L30f:
            java.lang.Object r0 = r1.f2580h
            r5 = r0
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r0 = r1.f2581i
            r4 = r0
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.Object r0 = r1.f2582j
            r7 = r0
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r0 = r1.f2585m
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r1.f2586n
            r6 = r0
            fg.p r6 = (fg.p) r6
            java.lang.Object r0 = r1.f2583k
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r1.f2584l
            r9 = r2
            fg.l r9 = (fg.l) r9
            r10 = r30
            r.h r10 = (r.h) r10
            r10.getClass()
            java.lang.Object r2 = r5.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            r11 = 3
            r12 = 0
            r13 = 1
            if (r2 == 0) goto L358
            wb.t7 r0 = new wb.t7
            r0.<init>(r4, r5, r7)
            s0.d r2 = new s0.d
            r3 = 1453046780(0x569bbbfc, float:8.5615845E13)
            r2.<init>(r3, r0, r13)
            r.h.a(r10, r12, r2, r11)
            goto L39e
        L358:
            wb.nd r2 = new wb.nd
            r8 = 4
            r2.<init>(r8, r3)
            s0.d r8 = new s0.d
            r14 = -201818235(0xfffffffff3f87f85, float:-3.93761E31)
            r8.<init>(r14, r2, r13)
            r.h.a(r10, r12, r8, r11)
            wb.xc r2 = new wb.xc
            r8 = 10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            s0.d r3 = new s0.d
            r6 = -1860152964(0xffffffff9120517c, float:-1.2646884E-28)
            r3.<init>(r6, r2, r13)
            r.h.a(r10, r12, r3, r11)
            wb.nd r2 = new wb.nd
            r3 = 5
            r2.<init>(r3, r0)
            s0.d r3 = new s0.d
            r6 = 303149245(0x1211b0bd, float:4.597178E-28)
            r3.<init>(r6, r2, r13)
            r.h.a(r10, r12, r3, r11)
            wb.xc r2 = new wb.xc
            r3 = r0
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            s0.d r0 = new s0.d
            r3 = -1828515842(0xffffffff93030ffe, float:-1.654241E-27)
            r0.<init>(r3, r2, r13)
            r.h.a(r10, r12, r0, r11)
        L39e:
            sf.n r0 = sf.n.f12433a
            return r0
        L3a1:
            java.lang.Object r0 = r1.f2580h
            wb.nu r0 = (wb.nu) r0
            java.lang.Object r2 = r1.f2581i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f2582j
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.f2585m
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f2586n
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r1.f2583k
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r1.f2584l
            fg.a r7 = (fg.a) r7
            r8 = r30
            r.h r8 = (r.h) r8
            r8.getClass()
            s0.d r9 = wb.p0.f18379x5
            r10 = 0
            r11 = 3
            r.h.a(r8, r10, r9, r11)
            wb.s1 r9 = new wb.s1
            r12 = 13
            r9.<init>(r2, r12)
            s0.d r12 = new s0.d
            r13 = 233409089(0xde98a41, float:1.4393017E-30)
            r14 = 1
            r12.<init>(r13, r9, r14)
            r.h.a(r8, r10, r12, r11)
            s0.d r9 = wb.p0.f18386y5
            r.h.a(r8, r10, r9, r11)
            wb.qc r9 = new wb.qc
            r12 = 2
            r9.<init>(r3, r2, r12)
            s0.d r3 = new s0.d
            r12 = 1615550275(0x604b5743, float:5.8609014E19)
            r3.<init>(r12, r9, r14)
            r.h.a(r8, r10, r3, r11)
            s0.d r3 = wb.p0.f18392z5
            r.h.a(r8, r10, r3, r11)
            wb.t1 r3 = new wb.t1
            r9 = 9
            r3.<init>(r9, r2, r4)
            s0.d r4 = new s0.d
            r9 = -1297275835(0xffffffffb2ad2445, float:-2.0156344E-8)
            r4.<init>(r9, r3, r14)
            r.h.a(r8, r10, r4, r11)
            s0.d r3 = wb.p0.A5
            r.h.a(r8, r10, r3, r11)
            wb.t1 r3 = new wb.t1
            r4 = 10
            r3.<init>(r4, r2, r5)
            s0.d r4 = new s0.d
            r5 = 84865351(0x50ef147, float:6.7211236E-36)
            r4.<init>(r5, r3, r14)
            r.h.a(r8, r10, r4, r11)
            s0.d r3 = wb.p0.B5
            r.h.a(r8, r10, r3, r11)
            wb.oa r3 = new wb.oa
            r4 = 2
            r3.<init>(r6, r2, r4)
            s0.d r2 = new s0.d
            r4 = 1467006537(0x5770be49, float:2.6470006E14)
            r2.<init>(r4, r3, r14)
            r.h.a(r8, r10, r2, r11)
            boolean r0 = r0.f17987c
            if (r0 == 0) goto L453
            s0.d r0 = wb.p0.C5
            r.h.a(r8, r10, r0, r11)
            wb.x6 r0 = new wb.x6
            r2 = 16
            r0.<init>(r7, r2)
            s0.d r2 = new s0.d
            r3 = -2013690276(0xffffffff87f9865c, float:-3.7544325E-34)
            r2.<init>(r3, r0, r14)
            r.h.a(r8, r10, r2, r11)
        L453:
            sf.n r0 = sf.n.f12433a
            return r0
        L456:
            java.lang.Object r0 = r1.f2581i
            wb.hq r0 = (wb.hq) r0
            java.lang.Object r2 = r1.f2580h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f2582j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f2585m
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f2586n
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r1.f2583k
            fg.a r6 = (fg.a) r6
            java.lang.Object r7 = r1.f2584l
            android.content.Context r7 = (android.content.Context) r7
            r8 = r30
            r.h r8 = (r.h) r8
            r8.getClass()
            s0.d r9 = wb.p0.P4
            r10 = 0
            r11 = 3
            r.h.a(r8, r10, r9, r11)
            c9.h0 r9 = new c9.h0
            r12 = 22
            r9.<init>(r12, r0, r3, r2)
            s0.d r2 = new s0.d
            r3 = 1333967688(0x4f82bb48, float:4.3866235E9)
            r12 = 1
            r2.<init>(r3, r9, r12)
            r.h.a(r8, r10, r2, r11)
            s0.d r2 = wb.p0.Q4
            r.h.a(r8, r10, r2, r11)
            wb.qc r2 = new wb.qc
            r3 = 5
            r2.<init>(r4, r5, r3)
            s0.d r3 = new s0.d
            r4 = -284015098(0xffffffffef124606, float:-4.5269465E28)
            r3.<init>(r4, r2, r12)
            r.h.a(r8, r10, r3, r11)
            boolean r0 = r0.f16680c
            if (r0 == 0) goto L4c3
            s0.d r0 = wb.p0.R4
            r.h.a(r8, r10, r0, r11)
            wb.dc r0 = new wb.dc
            r2 = 3
            r0.<init>(r6, r7, r2)
            s0.d r2 = new s0.d
            r3 = -1648013363(0xffffffff9dc54fcd, float:-5.2227978E-21)
            r2.<init>(r3, r0, r12)
            r.h.a(r8, r10, r2, r11)
        L4c3:
            sf.n r0 = sf.n.f12433a
            return r0
        L4c6:
            java.lang.Object r0 = r1.f2580h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r1.f2581i
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.f2582j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f2585m
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f2586n
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r1.f2583k
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r1.f2584l
            i0.a1 r7 = (i0.a1) r7
            r8 = r30
            r.h r8 = (r.h) r8
            r8.getClass()
            wb.u1 r9 = new wb.u1
            r10 = 2
            r9.<init>(r2, r3, r4, r10)
            s0.d r2 = new s0.d
            r3 = -750269058(0xffffffffd347cd7e, float:-8.581461E11)
            r4 = 1
            r2.<init>(r3, r9, r4)
            r3 = 0
            r9 = 3
            r.h.a(r8, r3, r2, r9)
            wb.s1 r2 = new wb.s1
            r10 = 17
            r2.<init>(r5, r10)
            s0.d r10 = new s0.d
            r11 = 619113077(0x24e6ea75, float:1.00143786E-16)
            r10.<init>(r11, r2, r4)
            r.h.a(r8, r3, r10, r9)
            java.lang.Object r2 = r6.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L521
            s0.d r0 = wb.p0.D3
            r.h.a(r8, r3, r0, r9)
            goto L56e
        L521:
            java.lang.Object r2 = r7.getValue()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L540
            wb.s1 r0 = new wb.s1
            r2 = 18
            r0.<init>(r7, r2)
            s0.d r2 = new s0.d
            r5 = 1042522399(0x3e23a11f, float:0.15979432)
            r2.<init>(r5, r0, r4)
            r.h.a(r8, r3, r2, r9)
            goto L56e
        L540:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L54c
            s0.d r0 = wb.p0.F3
            r.h.a(r8, r3, r0, r9)
            goto L56e
        L54c:
            java.util.Iterator r0 = r0.iterator()
        L550:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L56e
            java.lang.Object r2 = r0.next()
            wb.s0 r2 = (wb.s0) r2
            wb.v1 r6 = new wb.v1
            r7 = 1
            r6.<init>(r2, r5, r7)
            s0.d r2 = new s0.d
            r7 = 1117928861(0x42a23d9d, float:81.12034)
            r2.<init>(r7, r6, r4)
            r.h.a(r8, r3, r2, r9)
            goto L550
        L56e:
            sf.n r0 = sf.n.f12433a
            return r0
        L571:
            java.lang.Object r0 = r1.f2580h
            r3 = r0
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.Object r0 = r1.f2581i
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r2 = r1.f2582j
            fg.a r2 = (fg.a) r2
            java.lang.Object r4 = r1.f2585m
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r1.f2586n
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r1.f2583k
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r1.f2584l
            i0.a1 r7 = (i0.a1) r7
            r8 = r30
            r.h r8 = (r.h) r8
            r8.getClass()
            s0.d r9 = wb.p0.T1
            r10 = 0
            r11 = 3
            r.h.a(r8, r10, r9, r11)
            c9.h0 r9 = new c9.h0
            r12 = 19
            r9.<init>(r3, r0, r2, r12)
            s0.d r0 = new s0.d
            r2 = 1600118507(0x5f5fdeeb, float:1.6131589E19)
            r12 = 1
            r0.<init>(r2, r9, r12)
            r.h.a(r8, r10, r0, r11)
            s0.d r0 = wb.p0.U1
            r.h.a(r8, r10, r0, r11)
            wb.vc r0 = new wb.vc
            r2 = 1
            r0.<init>(r3, r4, r2)
            s0.d r2 = new s0.d
            r4 = -862466579(0xffffffffcc97cded, float:-7.9589224E7)
            r2.<init>(r4, r0, r12)
            r.h.a(r8, r10, r2, r11)
            s0.d r0 = wb.p0.V1
            r.h.a(r8, r10, r0, r11)
            wb.pa r2 = new wb.pa
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            s0.d r0 = new s0.d
            r3 = 969915631(0x39cfbcef, float:3.9622883E-4)
            r0.<init>(r3, r2, r12)
            r.h.a(r8, r10, r0, r11)
            sf.n r0 = sf.n.f12433a
            return r0
        L5e1:
            java.lang.Object r0 = r1.f2580h
            r3 = r0
            i0.l2 r3 = (i0.l2) r3
            java.lang.Object r0 = r1.f2581i
            r4 = r0
            i0.l2 r4 = (i0.l2) r4
            java.lang.Object r0 = r1.f2582j
            r5 = r0
            i0.l2 r5 = (i0.l2) r5
            java.lang.Object r0 = r1.f2585m
            r6 = r0
            i0.l2 r6 = (i0.l2) r6
            java.lang.Object r0 = r1.f2586n
            r7 = r0
            i0.l2 r7 = (i0.l2) r7
            java.lang.Object r0 = r1.f2583k
            r8 = r0
            i0.l2 r8 = (i0.l2) r8
            java.lang.Object r0 = r1.f2584l
            r9 = r0
            f1.j r9 = (f1.j) r9
            r0 = r30
            c1.d r0 = (c1.d) r0
            r0.getClass()
            c1.a r2 = r0.f979g
            long r10 = r2.a()
            r2 = 32
            long r10 = r10 >> r2
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r11 = 1035489772(0x3db851ec, float:0.09)
            float r21 = r10 * r11
            c1.a r10 = r0.f979g
            long r10 = r10.a()
            long r10 = r10 >> r2
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r11 = 2
            float r11 = (float) r11
            float r19 = r10 / r11
            c1.a r10 = r0.f979g
            long r12 = r10.a()
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r10 = (int) r12
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r20 = r10 / r11
            r10 = 1102577664(0x41b80000, float:23.0)
            float r11 = r10 / r11
            r12 = 1084227584(0x40a00000, float:5.0)
            float r12 = r12 - r11
            float r12 = r12 / r10
            c1.a r13 = r0.f979g
            long r16 = r13.a()
            r30 = r2
            r22 = r3
            long r2 = r16 >> r30
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 * r12
            float r2 = r2 + r19
            r3 = 1091987046(0x41166666, float:9.4)
            float r3 = r3 - r11
            float r3 = r3 / r10
            c1.a r12 = r0.f979g
            long r12 = r12.a()
            long r12 = r12 & r14
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = r12 * r3
            float r12 = r12 + r20
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r12
            long r2 = r2 << r30
            long r12 = r12 & r14
            long r2 = r2 | r12
            r12 = 1092930765(0x4124cccd, float:10.3)
            float r12 = r12 - r11
            float r12 = r12 / r10
            c1.a r13 = r0.f979g
            long r16 = r13.a()
            r13 = r10
            r18 = r11
            long r10 = r16 >> r30
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 * r12
            float r10 = r10 + r19
            r11 = 1097754214(0x416e6666, float:14.9)
            float r11 = r11 - r18
            float r11 = r11 / r13
            c1.a r12 = r0.f979g
            long r16 = r12.a()
            r12 = r13
            r23 = r14
            long r13 = r16 & r23
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r13 = r13 * r11
            float r13 = r13 + r20
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r10 = (long) r10
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r13 = (long) r13
            long r10 = r10 << r30
            long r13 = r13 & r23
            long r15 = r10 | r13
            r10 = 1099903795(0x418f3333, float:17.9)
            float r10 = r10 - r18
            float r10 = r10 / r12
            c1.a r11 = r0.f979g
            long r13 = r11.a()
            long r13 = r13 >> r30
            int r11 = (int) r13
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 * r10
            float r11 = r11 + r19
            r10 = 1084437299(0x40a33333, float:5.1)
            float r10 = r10 - r18
            float r10 = r10 / r12
            c1.a r12 = r0.f979g
            long r12 = r12.a()
            long r12 = r12 & r23
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = r12 * r10
            float r12 = r12 + r20
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r12
            long r10 = r10 << r30
            long r12 = r12 & r23
            long r17 = r10 | r12
            sh.l r10 = new sh.l
            r13 = r2
            r12 = r10
            r12.<init>(r13, r15, r17, r19, r20, r21)
            h1.g r11 = new h1.g
            r14 = 1092616192(0x41200000, float:10.0)
            r17 = 16
            r15 = 1
            r16 = 1
            r12 = r11
            r13 = r21
            r12.<init>(r13, r14, r15, r16, r17)
            i0.w1 r2 = new i0.w1
            r12 = 1
            r3 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            b1.f r3 = new b1.f
            r4 = 1
            r3.<init>(r2, r4)
            androidx.lifecycle.x r0 = r0.e(r3)
            return r0
        L725:
            java.lang.Object r0 = r1.f2580h
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.f2581i
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r1.f2585m
            r4 = r0
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r0 = r1.f2586n
            r5 = r0
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r0 = r1.f2582j
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r1.f2583k
            r7 = r0
            h.Hchat.hooks.items.script.ScriptPluginBridge r7 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r7
            java.lang.Object r0 = r1.f2584l
            r8 = r0
            java.util.function.Consumer r8 = (java.util.function.Consumer) r8
            r9 = r30
            android.app.Activity r9 = (android.app.Activity) r9
            sf.n r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L751:
            java.lang.Object r0 = r1.f2580h
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.f2581i
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r1.f2582j
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r1.f2585m
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r1.f2586n
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r1.f2583k
            r7 = r0
            h.Hchat.hooks.items.script.ScriptPluginBridge r7 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r7
            java.lang.Object r0 = r1.f2584l
            r8 = r0
            java.util.function.Consumer r8 = (java.util.function.Consumer) r8
            r9 = r30
            android.app.Activity r9 = (android.app.Activity) r9
            sf.n r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.m(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
