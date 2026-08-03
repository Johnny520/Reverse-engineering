package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2610l;

    public /* synthetic */ o(android.app.Activity r2, ia.q r3, java.lang.String r4, wb.jv r5, p8.l r6) {
            r1 = this;
            r0 = 2
            r1.f2605g = r0
            r1.<init>()
            r1.f2607i = r2
            r1.f2608j = r3
            r1.f2606h = r4
            r1.f2609k = r5
            r1.f2610l = r6
            return
    }

    public /* synthetic */ o(fb.b r2, java.lang.String r3, i0.a1 r4, i0.a1 r5, i0.a1 r6) {
            r1 = this;
            r0 = 20
            r1.f2605g = r0
            r1.<init>()
            r1.f2607i = r2
            r1.f2606h = r3
            r1.f2608j = r4
            r1.f2609k = r5
            r1.f2610l = r6
            return
    }

    public /* synthetic */ o(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f2605g = r6
            r0.f2606h = r1
            r0.f2607i = r2
            r0.f2608j = r3
            r0.f2609k = r4
            r0.f2610l = r5
            r0.<init>()
            return
    }

    public /* synthetic */ o(java.util.List r2, java.lang.String r3, java.lang.String r4, fg.l r5, android.content.Context r6) {
            r1 = this;
            r0 = 10
            r1.f2605g = r0
            r1.<init>()
            r1.f2608j = r2
            r1.f2606h = r3
            r1.f2607i = r4
            r1.f2609k = r5
            r1.f2610l = r6
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r47) {
            r46 = this;
            r1 = r46
            int r0 = r1.f2605g
            java.lang.String r5 = "规则已保存"
            r6 = 7
            r7 = 6
            r8 = 3
            r9 = 1
            r10 = 0
            r11 = 0
            sf.n r12 = sf.n.f12433a
            java.lang.Object r13 = r1.f2610l
            java.lang.Object r14 = r1.f2609k
            java.lang.Object r15 = r1.f2608j
            r16 = 32
            java.lang.Object r2 = r1.f2607i
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.Object r3 = r1.f2606h
            switch(r0) {
                case 0: goto Lb3c;
                case 1: goto Lb03;
                case 2: goto Lad3;
                case 3: goto La68;
                case 4: goto La48;
                case 5: goto L91a;
                case 6: goto L8c1;
                case 7: goto L86c;
                case 8: goto L7cf;
                case 9: goto L759;
                case 10: goto L6fd;
                case 11: goto L697;
                case 12: goto L5ec;
                case 13: goto L439;
                case 14: goto L33b;
                case 15: goto L2e1;
                case 16: goto L250;
                case 17: goto L1fe;
                case 18: goto L171;
                case 19: goto Le4;
                case 20: goto L66;
                default: goto L22;
            }
        L22:
            fb.d1 r3 = (fb.d1) r3
            java.lang.String r0 = r3.f3483a
            fg.l r2 = (fg.l) r2
            i0.a1 r15 = (i0.a1) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r3 = r47
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L41
            r15.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.setValue(r0)
            goto L65
        L41:
            java.lang.Object r3 = r15.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = gg.l.a(r3, r0)
            if (r0 == 0) goto L65
            r15.setValue(r10)
            java.lang.Object r0 = r14.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r13.getValue()
            java.util.List r0 = (java.util.List) r0
            r2.invoke(r0)
        L65:
            return r12
        L66:
            fb.b r2 = (fb.b) r2
            r17 = r3
            java.lang.String r17 = (java.lang.String) r17
            r19 = r15
            i0.a1 r19 = (i0.a1) r19
            r20 = r14
            i0.a1 r20 = (i0.a1) r20
            r21 = r13
            i0.a1 r21 = (i0.a1) r21
            r0 = r47
            fb.k2 r0 = (fb.k2) r0
            r0.getClass()
            wb.au r3 = new wb.au
            r3.<init>(r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            ca.x r16 = new ca.x
            r22 = 18
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r4 = r16
            r14 = r20
            r13 = r21
            r0.post(r4)
        L9f:
            java.util.concurrent.CountDownLatch r0 = r3.f15127c     // Catch: java.lang.Throwable -> Ld1
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Ld1
            r5 = 200(0xc8, double:9.9E-322)
            boolean r0 = r0.await(r5, r4)     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto Laf
            r2.d()     // Catch: java.lang.Throwable -> Ld1
            goto L9f
        Laf:
            r2.d()     // Catch: java.lang.Throwable -> Ld1
            java.util.concurrent.atomic.AtomicReference r0 = r3.f15126b     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Ld1
            fb.u2 r0 = (fb.u2) r0     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto Lbd
            goto Lbf
        Lbd:
            fb.u2 r0 = fb.u2.f3819g     // Catch: java.lang.Throwable -> Ld1
        Lbf:
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2.<init>(r4)
            r8.b r4 = new r8.b
            r4.<init>(r3, r14, r13, r7)
            r2.post(r4)
            return r0
        Ld1:
            r0 = move-exception
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2.<init>(r4)
            r8.b r4 = new r8.b
            r4.<init>(r3, r14, r13, r7)
            r2.post(r4)
            throw r0
        Le4:
            wb.no r3 = (wb.no) r3
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            i0.a1 r15 = (i0.a1) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L102:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L114
            java.lang.Object r5 = r0.next()
            wb.s0 r5 = (wb.s0) r5
            java.lang.String r5 = r5.f18970a
            r4.add(r5)
            goto L102
        L114:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L11d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L134
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L11d
            r0.add(r5)
            goto L11d
        L134:
            java.util.Set r0 = tf.m.U1(r0)
            wb.lo r3 = (wb.lo) r3
            int r3 = r3.f17534a
            if (r3 != r9) goto L155
            r15.setValue(r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = wb.ho.D5(r0)
            java.lang.String r3 = "comment_blacklist"
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)
            r0.apply()
            goto L16b
        L155:
            r14.setValue(r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = wb.ho.D5(r0)
            java.lang.String r3 = "comment_whitelist"
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)
            r0.apply()
        L16b:
            wb.mo r0 = wb.mo.f17734a
            r13.setValue(r0)
            return r12
        L171:
            wb.to r3 = (wb.to) r3
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            i0.a1 r15 = (i0.a1) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = tf.n.e1(r0)
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L18f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1a1
            java.lang.Object r5 = r0.next()
            wb.s0 r5 = (wb.s0) r5
            java.lang.String r5 = r5.f18970a
            r4.add(r5)
            goto L18f
        L1a1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1aa:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1c1
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L1aa
            r0.add(r5)
            goto L1aa
        L1c1:
            java.util.Set r0 = tf.m.U1(r0)
            wb.ro r3 = (wb.ro) r3
            int r3 = r3.f18928a
            if (r3 != r9) goto L1e2
            r15.setValue(r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = wb.ho.D5(r0)
            java.lang.String r3 = "blacklist"
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)
            r0.apply()
            goto L1f8
        L1e2:
            r14.setValue(r0)
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = wb.ho.D5(r0)
            java.lang.String r3 = "whitelist"
            android.content.SharedPreferences$Editor r0 = r2.putString(r3, r0)
            r0.apply()
        L1f8:
            wb.so r0 = wb.so.f19123a
            r13.setValue(r0)
            return r12
        L1fe:
            android.content.Context r3 = (android.content.Context) r3
            i0.a1 r2 = (i0.a1) r2
            x8.r r15 = (x8.r) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            x8.b r0 = (x8.b) r0
            r0.getClass()
            java.lang.Object r4 = r2.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r4)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L222:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L23d
            java.lang.Object r7 = r4.next()
            x8.b r7 = (x8.b) r7
            java.lang.String r8 = r7.f21231a
            java.lang.String r9 = r0.f21231a
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L239
            r7 = r0
        L239:
            r6.add(r7)
            goto L222
        L23d:
            wb.ho.B(r15, r2, r6)
            r14.setValue(r10)
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r5, r11)
            r0.show()
            java.lang.String r0 = "rules"
            r13.setValue(r0)
            return r12
        L250:
            android.content.Context r3 = (android.content.Context) r3
            i0.a1 r2 = (i0.a1) r2
            i0.a1 r15 = (i0.a1) r15
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14
            java.util.Map r13 = (java.util.Map) r13
            r0 = r47
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L26a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L27c
            java.lang.Object r6 = r5.next()
            wb.s0 r6 = (wb.s0) r6
            java.lang.String r6 = r6.f18970a
            r4.add(r6)
            goto L26a
        L27c:
            java.lang.Object r5 = r2.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r5 = wb.ho.y6(r5)
            java.util.Set r5 = tf.d0.T(r5, r4)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.String r5 = wb.ho.D5(r5)
            java.lang.Object r6 = r15.getValue()
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L29f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L2b8
            java.lang.Object r8 = r6.next()
            r9 = r8
            o9.r r9 = (o9.r) r9
            java.lang.String r9 = r9.f9698a
            boolean r9 = r4.contains(r9)
            if (r9 != 0) goto L29f
            r7.add(r8)
            goto L29f
        L2b8:
            java.util.Iterator r4 = r4.iterator()
        L2bc:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2cf
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            wb.ho.i5(r14, r6, r5, r7)
            r13.remove(r6)
            goto L2bc
        L2cf:
            r2.setValue(r5)
            r15.setValue(r7)
            int r0 = r0.size()
            java.lang.String r2 = "已删除 "
            java.lang.String r4 = " 个监听群"
            wb.en.o(r2, r0, r4, r3, r11)
            return r12
        L2e1:
            wb.c4 r3 = (wb.c4) r3
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            android.content.Context r15 = (android.content.Context) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            o9.q r0 = (o9.q) r0
            r0.getClass()
            java.lang.Object r4 = r14.getValue()
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r3 = r3.f15339a
            if (r3 < 0) goto L310
            if (r3 >= r4) goto L310
            java.lang.Object r4 = r14.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r4 = tf.m.R1(r4)
            r4.set(r3, r0)
            goto L31a
        L310:
            java.lang.Object r3 = r14.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = tf.m.G1(r3, r0)
        L31a:
            r14.setValue(r4)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r2 = "group_member_reply_templates"
            java.lang.String r3 = r9.e0.D(r4)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            r0.apply()
            java.lang.String r0 = "模板已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r0, r11)
            r0.show()
            r13.setValue(r10)
            return r12
        L33b:
            android.content.Context r3 = (android.content.Context) r3
            i0.a1 r2 = (i0.a1) r2
            v8.r r15 = (v8.r) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            v8.a r0 = (v8.a) r0
            r0.getClass()
            java.lang.String r4 = r0.f14202b
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r17 = r4.toString()
            java.util.Set r4 = r0.f14206f
            java.util.Set r6 = r0.f14205e
            java.util.LinkedHashSet r21 = wb.ho.P6(r4, r6)
            r30 = 0
            r31 = 16349(0x3fdd, float:2.291E-41)
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r16 = r0
            v8.a r0 = v8.a.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31)
            java.lang.String r4 = r0.f14201a
            java.lang.String r6 = r0.f14202b
            boolean r6 = og.m.t0(r6)
            if (r6 == 0) goto L391
            java.lang.String r0 = "请输入规则名称"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r11)
            r0.show()
            goto L438
        L391:
            java.util.Set r6 = r0.f14205e
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L3a4
            java.lang.String r0 = "请选择监听会话"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r11)
            r0.show()
            goto L438
        L3a4:
            java.util.Set r6 = r0.f14207g
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L3b7
            java.lang.String r0 = "请选择转发会话"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r11)
            r0.show()
            goto L438
        L3b7:
            java.util.Set r6 = r0.f14208h
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L3c9
            java.lang.String r0 = "至少选择一种消息类型"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r11)
            r0.show()
            goto L438
        L3c9:
            java.lang.Object r6 = r2.getValue()
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L3d8
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L3d8
            goto L41c
        L3d8:
            java.util.Iterator r6 = r6.iterator()
        L3dc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L41c
            java.lang.Object r7 = r6.next()
            v8.a r7 = (v8.a) r7
            java.lang.String r7 = r7.f14201a
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L3dc
            java.lang.Object r6 = r2.getValue()
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = tf.n.e1(r6)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L403:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L426
            java.lang.Object r8 = r6.next()
            v8.a r8 = (v8.a) r8
            java.lang.String r9 = r8.f14201a
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L418
            r8 = r0
        L418:
            r7.add(r8)
            goto L403
        L41c:
            java.lang.Object r4 = r2.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r7 = tf.m.G1(r4, r0)
        L426:
            wb.ho.k(r15, r3, r2, r7)
            r14.setValue(r10)
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r5, r11)
            r0.show()
            wb.g r0 = wb.g.f16287h
            r13.setValue(r0)
        L438:
            return r12
        L439:
            wb.r2 r3 = (wb.r2) r3
            i0.a1 r2 = (i0.a1) r2
            android.content.Context r15 = (android.content.Context) r15
            e9.s r14 = (e9.s) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            wb.p2 r3 = (wb.p2) r3
            java.lang.String r4 = r3.f18397a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L457:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L4f8
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            r8 = 4
            r19 = r9
            char[] r9 = new char[r8]
            r9 = {x0b82: FILL_ARRAY_DATA , data: [47, 35, 58, -230} // fill-array
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            r7 = r11
        L479:
            if (r7 >= r8) goto L48f
            char r8 = r9[r7]
            r1 = 6
            int r8 = og.m.q0(r6, r8, r11, r1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.add(r8)
            int r7 = r7 + 1
            r1 = r46
            r8 = 4
            goto L479
        L48f:
            r1 = 6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r10.iterator()
        L499:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4b0
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 <= 0) goto L499
            r7.add(r9)
            goto L499
        L4b0:
            java.lang.Comparable r7 = tf.m.D1(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L4e5
            int r7 = r7.intValue()
            java.lang.String r8 = r6.substring(r11, r7)
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            int r7 = r7 + 1
            java.lang.String r6 = r6.substring(r7)
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            boolean r7 = gg.l.a(r8, r4)
            if (r7 == 0) goto L4e3
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L4e3
            goto L4eb
        L4e3:
            r6 = 0
            goto L4eb
        L4e5:
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L4e3
        L4eb:
            if (r6 == 0) goto L4f0
            r5.add(r6)
        L4f0:
            r7 = r1
            r9 = r19
            r10 = 0
            r1 = r46
            goto L457
        L4f8:
            java.util.Set r0 = tf.m.T1(r5)
            java.util.List r5 = tf.m.P1(r0)
            r9 = 0
            r10 = 62
            java.lang.String r6 = ","
            r7 = 0
            r8 = 0
            java.lang.String r43 = tf.m.A1(r5, r6, r7, r8, r9, r10)
            wb.d4 r0 = r3.f18398b
            java.lang.String r0 = r0.f15604a
            java.lang.Object r1 = r2.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L519:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L530
            java.lang.Object r3 = r1.next()
            r5 = r3
            e9.c r5 = (e9.c) r5
            java.lang.String r5 = r5.f2391b
            boolean r5 = gg.l.a(r5, r4)
            if (r5 == 0) goto L519
            r10 = r3
            goto L531
        L530:
            r10 = 0
        L531:
            r21 = r10
            e9.c r21 = (e9.c) r21
            if (r21 == 0) goto L5e3
            java.lang.String r1 = "屏蔽"
            boolean r0 = og.m.h0(r0, r1, r11)
            if (r0 == 0) goto L575
            r44 = r43
            r43 = 0
            r45 = 4194303(0x3fffff, float:5.87747E-39)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            e9.c r0 = e9.c.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            goto L5ab
        L575:
            r44 = r43
            r0 = 0
            r45 = 6291455(0x5fffff, float:8.816206E-39)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r44 = r0
            e9.c r0 = e9.c.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
        L5ab:
            java.lang.Object r1 = r2.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = tf.n.e1(r1)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L5be:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5d7
            java.lang.Object r5 = r1.next()
            e9.c r5 = (e9.c) r5
            java.lang.String r6 = r5.f2391b
            boolean r6 = gg.l.a(r6, r4)
            if (r6 == 0) goto L5d3
            r5 = r0
        L5d3:
            r3.add(r5)
            goto L5be
        L5d7:
            wb.ho.m0(r14, r2, r3)
            java.lang.String r0 = "成员规则已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r0, r11)
            r0.show()
        L5e3:
            wb.q2 r0 = new wb.q2
            r0.<init>(r4)
            r13.setValue(r0)
            return r12
        L5ec:
            android.content.Context r3 = (android.content.Context) r3
            wb.q4 r2 = (wb.q4) r2
            i0.a1 r15 = (i0.a1) r15
            x9.e r14 = (x9.e) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            x9.f r0 = (x9.f) r0
            r0.getClass()
            java.lang.String r1 = r0.f21416a
            boolean r4 = og.m.t0(r1)
            if (r4 == 0) goto L610
            java.lang.String r0 = "关键词不能为空"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r11)
            r0.show()
            goto L696
        L610:
            wb.o4 r2 = (wb.o4) r2
            java.lang.String r2 = r2.f17997a
            boolean r4 = gg.l.a(r2, r1)
            if (r4 != 0) goto L64b
            java.lang.Object r4 = r15.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L629
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L629
            goto L64b
        L629:
            java.util.Iterator r4 = r4.iterator()
        L62d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L64b
            java.lang.Object r5 = r4.next()
            x9.f r5 = (x9.f) r5
            java.lang.String r5 = r5.f21416a
            boolean r5 = gg.l.a(r5, r1)
            if (r5 == 0) goto L62d
            java.lang.String r0 = "该关键词已存在"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r11)
            r0.show()
            goto L696
        L64b:
            if (r2 != 0) goto L658
            java.lang.Object r1 = r15.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = tf.m.G1(r1, r0)
            goto L685
        L658:
            java.lang.Object r1 = r15.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = tf.n.e1(r1)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L66b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L684
            java.lang.Object r5 = r1.next()
            x9.f r5 = (x9.f) r5
            java.lang.String r6 = r5.f21416a
            boolean r6 = gg.l.a(r6, r2)
            if (r6 == 0) goto L680
            r5 = r0
        L680:
            r4.add(r5)
            goto L66b
        L684:
            r0 = r4
        L685:
            wb.ho.K1(r14, r15, r0)
            java.lang.String r0 = "关键词已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r11)
            r0.show()
            wb.p4 r0 = wb.p4.f18399a
            r13.setValue(r0)
        L696:
            return r12
        L697:
            wb.l4 r3 = (wb.l4) r3
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            android.content.Context r15 = (android.content.Context) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            q9.g r0 = (q9.g) r0
            r0.getClass()
            java.lang.Object r1 = r14.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            wb.k4 r3 = (wb.k4) r3
            int r4 = r3.f17192a
            if (r4 < 0) goto L6ca
            if (r4 >= r1) goto L6ca
            java.lang.Object r1 = r14.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            int r3 = r3.f17192a
            r1.set(r3, r0)
            goto L6d4
        L6ca:
            java.lang.Object r1 = r14.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.G1(r1, r0)
        L6d4:
            r14.setValue(r1)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.Object r1 = r14.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r1 = x6.d.v(r1)
            java.lang.String r2 = "group_rename_templates"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            java.lang.String r0 = "改名模板已保存"
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r0, r11)
            r0.show()
            wb.h4 r0 = wb.h4.f16488d
            r13.setValue(r0)
            return r12
        L6fd:
            java.util.List r15 = (java.util.List) r15
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = (java.lang.String) r2
            fg.l r14 = (fg.l) r14
            android.content.Context r13 = (android.content.Context) r13
            r0 = r47
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L736
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r15.iterator()
        L71d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L743
            java.lang.Object r4 = r2.next()
            r5 = r4
            o9.r r5 = (o9.r) r5
            java.lang.String r5 = r5.f9698a
            boolean r5 = gg.l.a(r5, r3)
            if (r5 != 0) goto L71d
            r1.add(r4)
            goto L71d
        L736:
            o9.r r1 = new o9.r
            r1.<init>(r3, r2, r0)
            java.util.List r1 = a.a.x0(r1)
            java.util.List r1 = wb.ho.q7(r15, r1)
        L743:
            r14.invoke(r1)
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L74f
            java.lang.String r0 = "已取消模板绑定"
            goto L751
        L74f:
            java.lang.String r0 = "模板已绑定"
        L751:
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r11)
            r0.show()
            return r12
        L759:
            r19 = r9
            x8.b r3 = (x8.b) r3
            r4 = r2
            fg.l r4 = (fg.l) r4
            fg.l r15 = (fg.l) r15
            r5 = r14
            fg.l r5 = (fg.l) r5
            fg.a r13 = (fg.a) r13
            r0 = r47
            r.h r0 = (r.h) r0
            r0.getClass()
            s0.d r1 = wb.p0.T0
            r7 = 0
            r.h.a(r0, r7, r1, r8)
            wb.xh r1 = new wb.xh
            r1.<init>(r11, r4, r3)
            s0.d r2 = new s0.d
            r6 = -1753861390(0xffffffff977632f2, float:-7.955119E-25)
            r2.<init>(r6, r1, r9)
            r.h.a(r0, r7, r2, r8)
            s0.d r1 = wb.p0.U0
            r.h.a(r0, r7, r1, r8)
            c9.k0 r1 = new c9.k0
            r6 = 17
            r2 = r3
            r3 = r4
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            s0.d r4 = new s0.d
            r5 = -599469964(0xffffffffdc44d074, float:-2.2159317E17)
            r4.<init>(r5, r1, r9)
            r.h.a(r0, r7, r4, r8)
            s0.d r1 = wb.p0.V0
            r.h.a(r0, r7, r1, r8)
            wb.xh r1 = new wb.xh
            r1.<init>(r9, r3, r2)
            s0.d r4 = new s0.d
            r5 = 554921462(0x21136df6, float:4.995107E-19)
            r4.<init>(r5, r1, r9)
            r.h.a(r0, r7, r4, r8)
            s0.d r1 = wb.p0.W0
            r.h.a(r0, r7, r1, r8)
            c9.h0 r1 = new c9.h0
            r4 = r3
            r3 = r2
            r2 = 24
            r6 = 0
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            s0.d r2 = new s0.d
            r3 = 1709312888(0x65e20b78, float:1.334333E23)
            r2.<init>(r3, r1, r9)
            r.h.a(r0, r7, r2, r8)
            return r12
        L7cf:
            r7 = r10
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            i0.a1 r2 = (i0.a1) r2
            i0.a1 r15 = (i0.a1) r15
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            r.h r0 = (r.h) r0
            r0.getClass()
            s0.d r1 = wb.p0.X0
            r.h.a(r0, r7, r1, r8)
            wb.s1 r1 = new wb.s1
            r4 = 19
            r1.<init>(r2, r4)
            s0.d r2 = new s0.d
            r4 = -2020699171(0xffffffff878e93dd, float:-2.1452692E-34)
            r9 = 1
            r2.<init>(r4, r1, r9)
            r.h.a(r0, r7, r2, r8)
            s0.d r1 = wb.p0.Y0
            r.h.a(r0, r7, r1, r8)
            java.lang.Object r1 = r15.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L810
            s0.d r1 = wb.p0.f18207a1
            r.h.a(r0, r7, r1, r8)
            goto L86b
        L810:
            java.lang.Object r1 = r14.getValue()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L831
            wb.s1 r1 = new wb.s1
            r2 = 20
            r1.<init>(r14, r2)
            s0.d r2 = new s0.d
            r3 = -1779912077(0xffffffff95e8b273, float:-9.39856E-26)
            r9 = 1
            r2.<init>(r3, r1, r9)
            r7 = 0
            r.h.a(r0, r7, r2, r8)
            goto L86b
        L831:
            r7 = 0
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L83e
            s0.d r1 = wb.p0.f18222c1
            r.h.a(r0, r7, r1, r8)
            goto L86b
        L83e:
            java.util.Iterator r1 = r3.iterator()
        L842:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86b
            java.lang.Object r2 = r1.next()
            h.Hchat.hooks.api.model.ContactLabelBean r2 = (h.Hchat.hooks.api.model.ContactLabelBean) r2
            java.lang.String r3 = r2.labelName
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L858
            java.lang.String r3 = r2.labelId
        L858:
            wb.wd r4 = new wb.wd
            r4.<init>(r3, r2, r13, r11)
            s0.d r2 = new s0.d
            r3 = -1795760110(0xffffffff94f6e012, float:-2.4928032E-26)
            r9 = 1
            r2.<init>(r3, r4, r9)
            r7 = 0
            r.h.a(r0, r7, r2, r8)
            goto L842
        L86b:
            return r12
        L86c:
            wb.h5 r3 = (wb.h5) r3
            i0.a1 r2 = (i0.a1) r2
            i0.a1 r15 = (i0.a1) r15
            java.util.List r14 = (java.util.List) r14
            i0.a1 r13 = (i0.a1) r13
            r0 = r47
            r.h r0 = (r.h) r0
            r0.getClass()
            s0.d r1 = wb.p0.S2
            r7 = 0
            r.h.a(r0, r7, r1, r8)
            c9.h0 r1 = new c9.h0
            r4 = 18
            r1.<init>(r3, r2, r15, r4)
            s0.d r2 = new s0.d
            r4 = 1155830236(0x44e491dc, float:1828.5581)
            r9 = 1
            r2.<init>(r4, r1, r9)
            r.h.a(r0, r7, r2, r8)
            s0.d r1 = wb.p0.T2
            r.h.a(r0, r7, r1, r8)
            wb.qc r1 = new wb.qc
            r1.<init>(r14, r13, r8)
            s0.d r2 = new s0.d
            r4 = 470062618(0x1c04961a, float:4.386914E-22)
            r2.<init>(r4, r1, r9)
            r.h.a(r0, r7, r2, r8)
            s0.d r1 = wb.p0.U2
            r.h.a(r0, r7, r1, r8)
            f0.h r1 = new f0.h
            r1.<init>(r3, r6)
            s0.d r2 = new s0.d
            r3 = -215705000(0xfffffffff3249a58, float:-1.3041186E31)
            r2.<init>(r3, r1, r9)
            r.h.a(r0, r7, r2, r8)
            return r12
        L8c1:
            r7 = r10
            wb.mu r3 = (wb.mu) r3
            i0.a1 r2 = (i0.a1) r2
            i0.a1 r15 = (i0.a1) r15
            java.util.List r14 = (java.util.List) r14
            fg.a r13 = (fg.a) r13
            r0 = r47
            r.h r0 = (r.h) r0
            r0.getClass()
            s0.d r1 = wb.p0.f18352t5
            r.h.a(r0, r7, r1, r8)
            db.f r1 = new db.f
            r1.<init>(r3, r6, r2)
            s0.d r2 = new s0.d
            r4 = 1217160669(0x488c65dd, float:287534.9)
            r9 = 1
            r2.<init>(r4, r1, r9)
            r.h.a(r0, r7, r2, r8)
            s0.d r1 = wb.p0.f18359u5
            r.h.a(r0, r7, r1, r8)
            wb.qc r1 = new wb.qc
            r1.<init>(r15, r14, r9)
            s0.d r2 = new s0.d
            r4 = 733766043(0x2bbc619b, float:1.3385294E-12)
            r2.<init>(r4, r1, r9)
            r.h.a(r0, r7, r2, r8)
            boolean r1 = r3.f17792c
            if (r1 == 0) goto L919
            s0.d r1 = wb.p0.f18366v5
            r.h.a(r0, r7, r1, r8)
            wb.x6 r1 = new wb.x6
            r2 = 12
            r1.<init>(r13, r2)
            s0.d r2 = new s0.d
            r3 = -759746590(0xffffffffd2b72fe2, float:-3.9339118E11)
            r2.<init>(r3, r1, r9)
            r.h.a(r0, r7, r2, r8)
        L919:
            return r12
        L91a:
            f0.j r3 = (f0.j) r3
            b5.k r2 = (b5.k) r2
            n2.s r15 = (n2.s) r15
            w.q0 r14 = (w.q0) r14
            f1.s r13 = (f1.s) r13
            r0 = r47
            x1.h0 r0 = (x1.h0) r0
            r0.e()
            h1.b r1 = r0.f20932g
            i0.f1 r3 = r3.f2966c
            float r3 = r3.g()
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 != 0) goto L93a
            goto La47
        L93a:
            long r5 = r15.f8977b
            int r7 = i2.m0.f6359c
            long r5 = r5 >> r16
            int r5 = (int) r5
            r2.l(r5)
            w.m1 r2 = r14.d()
            if (r2 == 0) goto L951
            i2.k0 r2 = r2.f14569a
            e1.c r2 = r2.c(r5)
            goto L956
        L951:
            e1.c r2 = new e1.c
            r2.<init>(r4, r4, r4, r4)
        L956:
            float r4 = w.z0.f14746a
            float r0 = r0.x0(r4)
            double r4 = (double) r0
            double r4 = java.lang.Math.floor(r4)
            float r0 = (float) r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 >= 0) goto L969
            r0 = r4
        L969:
            float r4 = r2.f2296a
            r5 = 2
            float r6 = (float) r5
            float r6 = r0 / r6
            float r4 = r4 + r6
            long r9 = r1.a()
            long r9 = r9 >> r16
            int r7 = (int) r9
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 - r6
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L981
            r4 = r7
        L981:
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto L986
            goto L987
        L986:
            r6 = r4
        L987:
            int r4 = (int) r0
            int r4 = r4 % r5
            r9 = 1
            if (r4 != r9) goto L996
            double r4 = (double) r6
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            goto L99c
        L996:
            double r4 = (double) r6
            double r4 = java.lang.Math.rint(r4)
            float r4 = (float) r4
        L99c:
            float r5 = r2.f2297b
            int r6 = java.lang.Float.floatToRawIntBits(r4)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r9 = (long) r5
            long r5 = r6 << r16
            long r9 = r9 & r17
            long r22 = r5 | r9
            float r2 = r2.f2299d
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r2
            long r4 = r4 << r16
            long r6 = r6 & r17
            long r24 = r4 | r6
            h1.a r2 = r1.f5037g
            f1.u r2 = r2.f5035c
            f1.h r4 = r1.f5040j
            if (r4 != 0) goto L9d2
            f1.h r4 = f1.c0.f()
            r9 = 1
            r4.D(r9)
            r1.f5040j = r4
        L9d2:
            java.lang.Object r5 = r4.f3058i
            android.graphics.Paint r5 = (android.graphics.Paint) r5
            if (r13 == 0) goto L9e0
            long r6 = r1.a()
            r13.a(r3, r6, r4)
            goto L9f0
        L9e0:
            int r1 = r5.getAlpha()
            float r1 = (float) r1
            r6 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L9ed
            goto L9f0
        L9ed:
            r4.u(r3)
        L9f0:
            java.lang.Object r1 = r4.f3060k
            f1.n r1 = (f1.n) r1
            r7 = 0
            boolean r1 = gg.l.a(r1, r7)
            if (r1 != 0) goto L9fe
            r4.x(r7)
        L9fe:
            int r1 = r4.f3057h
            if (r1 != r8) goto La03
            goto La06
        La03:
            r4.v(r8)
        La06:
            float r1 = r5.getStrokeWidth()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto La0f
            goto La12
        La0f:
            r4.C(r0)
        La12:
            float r0 = r5.getStrokeMiter()
            r1 = 1082130432(0x40800000, float:4.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La1d
            goto La20
        La1d:
            r5.setStrokeMiter(r1)
        La20:
            int r0 = r4.p()
            if (r0 != 0) goto La27
            goto La2a
        La27:
            r4.A(r11)
        La2a:
            int r0 = r4.q()
            if (r0 != 0) goto La31
            goto La34
        La31:
            r4.B(r11)
        La34:
            boolean r0 = r5.isFilterBitmap()
            r9 = 1
            if (r0 != r9) goto La40
        La3b:
            r21 = r2
            r26 = r4
            goto La44
        La40:
            r4.y(r9)
            goto La3b
        La44:
            r21.o(r22, r24, r26)
        La47:
            return r12
        La48:
            fg.l r3 = (fg.l) r3
            qb.k r2 = (qb.k) r2
            android.app.Activity r15 = (android.app.Activity) r15
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            b.e r13 = (b.e) r13
            r0 = r47
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            if (r3 == 0) goto La5f
            r3.invoke(r0)
            goto La67
        La5f:
            r2.H(r15, r14, r0)
            ia.t r0 = r2.f10835b
            r13.r(r0)
        La67:
            return r12
        La68:
            m.l1 r3 = (m.l1) r3
            gg.u r2 = (gg.u) r2
            gg.r r15 = (gg.r) r15
            m.o2 r14 = (m.o2) r14
            gg.q r13 = (gg.q) r13
            r0 = r47
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            sg.c r1 = r3.f8255g
            m.h1 r1 = m.l1.g(r1)
            if (r1 == 0) goto Lac6
            b.e r3 = r3.f8304e
            long r4 = r1.f8183b
            long r6 = r1.f8182a
            java.lang.Object r8 = r3.f332h
            t1.d r8 = (t1.d) r8
            long r9 = r6 >> r16
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r8.a(r4, r9)
            java.lang.Object r3 = r3.f333i
            t1.d r3 = (t1.d) r3
            long r6 = r6 & r17
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r3.a(r4, r6)
            java.lang.Object r3 = r2.f4564g
            m.h1 r3 = (m.h1) r3
            m.h1 r3 = r3.a(r1)
            r2.f4564g = r3
            long r2 = r3.f8182a
            long r2 = r14.e(r2)
            float r2 = r14.i(r2)
            r15.f4561g = r2
            float r2 = r2 - r0
            boolean r0 = m.m1.a(r2)
            r19 = 1
            r0 = r0 ^ 1
            r13.f4560g = r0
            goto Lac8
        Lac6:
            r19 = 1
        Lac8:
            if (r1 == 0) goto Lacd
            r9 = r19
            goto Lace
        Lacd:
            r9 = r11
        Lace:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        Lad3:
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
            ia.q r15 = (ia.q) r15
            java.lang.String r3 = (java.lang.String) r3
            r16 = r14
            wb.jv r16 = (wb.jv) r16
            r19 = r13
            p8.l r19 = (p8.l) r19
            r17 = r47
            java.lang.String r17 = (java.lang.String) r17
            r17.getClass()
            r14 = r15
            r15 = r3
            long r3 = java.lang.System.currentTimeMillis()
            eb.p r5 = new eb.p
            r18 = r1
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19)
            k.s1 r0 = new k.s1
            r0.<init>(r6)
            java.lang.String r2 = "设置评论时间"
            r6 = r0
            wb.y2.V1(r1, r2, r3, r5, r6)
            return r12
        Lb03:
            r7 = r10
            n2.s r3 = (n2.s) r3
            f0.c r2 = (f0.c) r2
            n2.j r15 = (n2.j) r15
            b0.s r14 = (b0.s) r14
            fg.l r13 = (fg.l) r13
            r0 = r47
            f0.u r0 = (f0.u) r0
            f0.p r1 = r2.f2939a
            r0.f3006h = r3
            r0.f3007i = r15
            r0.f3001c = r14
            r0.f3002d = r13
            if (r1 == 0) goto Lb21
            w.q0 r2 = r1.f2977v
            goto Lb22
        Lb21:
            r2 = r7
        Lb22:
            r0.f3003e = r2
            if (r1 == 0) goto Lb29
            h0.d1 r2 = r1.f2978w
            goto Lb2a
        Lb29:
            r2 = r7
        Lb2a:
            r0.f3004f = r2
            if (r1 == 0) goto Lb38
            i0.m2 r2 = y1.h1.f21958t
            java.lang.Object r1 = x1.k.h(r1, r2)
            r10 = r1
            y1.l2 r10 = (y1.l2) r10
            goto Lb39
        Lb38:
            r10 = r7
        Lb39:
            r0.f3005g = r10
            return r12
        Lb3c:
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r3 = r15
            java.lang.String r3 = (java.lang.String) r3
            r4 = r14
            h.Hchat.hooks.items.script.ScriptPluginBridge r4 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r4
            r5 = r13
            java.util.function.Consumer r5 = (java.util.function.Consumer) r5
            r6 = r47
            android.app.Activity r6 = (android.app.Activity) r6
            sf.n r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.j(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
