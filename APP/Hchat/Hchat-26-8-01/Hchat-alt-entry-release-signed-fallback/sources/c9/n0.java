package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1286k;

    public /* synthetic */ n0(fg.l r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1282g = r5
            r0.f1286k = r1
            r0.f1283h = r2
            r0.f1284i = r3
            r0.f1285j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ n0(java.lang.Object r1, java.lang.Object r2, fg.l r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1282g = r5
            r0.f1283h = r1
            r0.f1284i = r2
            r0.f1286k = r3
            r0.f1285j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ n0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1282g = r5
            r0.f1283h = r1
            r0.f1284i = r2
            r0.f1285j = r3
            r0.f1286k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ n0(java.lang.Object r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f1282g = r5
            r0.f1283h = r1
            r0.f1285j = r3
            r0.f1286k = r4
            r0.f1284i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ n0(qb.k r2, qb.i r3, java.lang.String r4, android.app.Activity r5) {
            r1 = this;
            r0 = 8
            r1.f1282g = r0
            r1.<init>()
            r1.f1283h = r2
            r1.f1285j = r3
            r1.f1284i = r4
            r1.f1286k = r5
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r22 = this;
            r1 = r22
            int r0 = r1.f1282g
            r2 = 2
            r3 = 64
            r4 = 0
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L90d;
                case 1: goto L8c9;
                case 2: goto L8b4;
                case 3: goto L89f;
                case 4: goto L7f2;
                case 5: goto L7b1;
                case 6: goto L78c;
                case 7: goto L76b;
                case 8: goto L73f;
                case 9: goto L6fc;
                case 10: goto L6cc;
                case 11: goto L6ab;
                case 12: goto L609;
                case 13: goto L5b1;
                case 14: goto L56d;
                case 15: goto L4c6;
                case 16: goto L4b0;
                case 17: goto L474;
                case 18: goto L36c;
                case 19: goto L325;
                case 20: goto L2a7;
                case 21: goto L255;
                case 22: goto L202;
                case 23: goto L1d7;
                case 24: goto L123;
                case 25: goto Lde;
                case 26: goto L99;
                case 27: goto L79;
                case 28: goto L42;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r0 = r1.f1283h
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.Object r2 = r1.f1284i
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r1.f1285j
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r1.f1286k
            fg.l r4 = (fg.l) r4
            if (r0 == 0) goto L3f
            long r7 = r0.longValue()
            r2.invoke()
            q2.e r0 = new q2.e
            r0.<init>(r4, r7, r6)
            android.view.Window r2 = r3.getWindow()
            if (r2 == 0) goto L3f
            android.view.View r2 = r2.getDecorView()
            if (r2 == 0) goto L3f
            wb.vu r4 = new wb.vu
            r4.<init>(r3, r0)
            r2.postOnAnimation(r4)
        L3f:
            sf.n r0 = sf.n.f12433a
            return r0
        L42:
            java.lang.Object r0 = r1.f1283h
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f1284i
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r1.f1285j
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r1.f1286k
            fg.l r4 = (fg.l) r4
            boolean r0 = r0.compareAndSet(r5, r6)
            if (r0 == 0) goto L76
            r2.invoke()
            c9.o0 r0 = new c9.o0
            r2 = 10
            r0.<init>(r4, r2)
            android.view.Window r2 = r3.getWindow()
            if (r2 == 0) goto L76
            android.view.View r2 = r2.getDecorView()
            if (r2 == 0) goto L76
            wb.vu r4 = new wb.vu
            r4.<init>(r3, r0)
            r2.postOnAnimation(r4)
        L76:
            sf.n r0 = sf.n.f12433a
            return r0
        L79:
            java.lang.Object r0 = r1.f1283h
            fb.d1 r0 = (fb.d1) r0
            java.lang.Object r2 = r1.f1284i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r1.f1286k
            i0.a1 r5 = (i0.a1) r5
            java.lang.String r6 = r0.f3484b
            r2.setValue(r6)
            java.lang.String r0 = r0.f3483a
            r3.setValue(r0)
            r5.setValue(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L99:
            java.lang.Object r0 = r1.f1286k
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f1283h
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r1.f1284i
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1285j
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r3.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = og.m.t0(r5)
            if (r5 != 0) goto Ldb
            java.lang.Object r5 = r4.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "rename"
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto Lcd
            java.lang.Object r2 = r3.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r0.invoke(r2)
            goto Ld6
        Lcd:
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2.invoke(r0)
        Ld6:
            java.lang.String r0 = ""
            r4.setValue(r0)
        Ldb:
            sf.n r0 = sf.n.f12433a
            return r0
        Lde:
            java.lang.Object r0 = r1.f1283h
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r1.f1284i
            r.z r2 = (r.z) r2
            java.lang.Object r3 = r1.f1286k
            fg.l r3 = (fg.l) r3
            java.lang.Object r6 = r1.f1285j
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r6.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r6.setValue(r4)
            if (r7 == 0) goto L120
            java.util.Iterator r0 = r0.iterator()
        Lfd:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L117
            java.lang.Object r4 = r0.next()
            wb.ut r4 = (wb.ut) r4
            fb.c r4 = r4.f19576b
            java.lang.String r4 = r4.f3433c
            boolean r4 = gg.l.a(r4, r7)
            if (r4 == 0) goto L114
            goto L118
        L114:
            int r5 = r5 + 1
            goto Lfd
        L117:
            r5 = -1
        L118:
            if (r5 < 0) goto L11d
            r.z.l(r2, r5)
        L11d:
            r3.invoke(r7)
        L120:
            sf.n r0 = sf.n.f12433a
            return r0
        L123:
            java.lang.Object r0 = r1.f1283h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r7 = r1.f1284i
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.f1285j
            i0.j1 r8 = (i0.j1) r8
            java.lang.Object r9 = r1.f1286k
            i0.j1 r9 = (i0.j1) r9
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L141
            goto L1d1
        L141:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L148
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
        L148:
            if (r4 != 0) goto L155
            java.lang.String r2 = "当前页面无法打开文件选择器"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r5)
            r0.show()
            goto L1d1
        L155:
            wb.hr r5 = wb.hr.f16681a
            fb.g1 r8 = fb.g1.f3523a
            r7.getClass()
            java.io.File r8 = new java.io.File
            java.io.File r10 = fb.g1.a(r0)
            java.lang.String r7 = fb.g1.m(r7)
            r8.<init>(r10, r7)
            r8.mkdirs()
            wb.ns r7 = new wb.ns
            r7.<init>(r0, r9, r2)
            monitor-enter(r5)
            r8.mkdirs()     // Catch: java.lang.Throwable -> L1d4
            wb.gr r0 = new wb.gr     // Catch: java.lang.Throwable -> L1d4
            r0.<init>(r4, r8, r7)     // Catch: java.lang.Throwable -> L1d4
            wb.hr.f16683c = r0     // Catch: java.lang.Throwable -> L1d4
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L1d4
            r5.a(r0)     // Catch: java.lang.Throwable -> L1d4
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r5.a(r0)     // Catch: java.lang.Throwable -> L1d4
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r0.addCategory(r2)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r2 = "*/*"
            r0.setType(r2)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r2 = "android.intent.extra.ALLOW_MULTIPLE"
            r0.putExtra(r2, r6)     // Catch: java.lang.Throwable -> L1d4
            r0.addFlags(r6)     // Catch: java.lang.Throwable -> L1d4
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L1d4
            wb.ho.B4(r4, r0)     // Catch: java.lang.Throwable -> L1d4
            r2 = 1212371550(0x4843525e, float:200009.47)
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L1ae
            goto L1d0
        L1ae:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r3 = "android.intent.action.GET_CONTENT"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r3 = "android.intent.category.OPENABLE"
            r0.addCategory(r3)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r3 = "*/*"
            r0.setType(r3)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
            r0.putExtra(r3, r6)     // Catch: java.lang.Throwable -> L1d4
            r0.addFlags(r6)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r3 = "选择文件或图片"
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r3)     // Catch: java.lang.Throwable -> L1d4
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L1d4
        L1d0:
            monitor-exit(r5)
        L1d1:
            sf.n r0 = sf.n.f12433a
            return r0
        L1d4:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1d4
            throw r0
        L1d7:
            java.lang.Object r0 = r1.f1283h
            fg.p r0 = (fg.p) r0
            java.lang.Object r2 = r1.f1284i
            fb.d1 r2 = (fb.d1) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r1.f1286k
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r3.getValue()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L1ff
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.invoke(r2, r3)
            r5.setValue(r4)
        L1ff:
            sf.n r0 = sf.n.f12433a
            return r0
        L202:
            java.lang.Object r0 = r1.f1283h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1284i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1285j
            wb.v3 r3 = (wb.v3) r3
            java.lang.Object r4 = r1.f1286k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r6 = r2.getValue()
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L221:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L241
            java.lang.Object r8 = r6.next()
            r9 = r8
            n9.a r9 = (n9.a) r9
            java.lang.String r9 = r9.f9069a
            r10 = r3
            wb.s3 r10 = (wb.s3) r10
            n9.a r10 = r10.f18984a
            java.lang.String r10 = r10.f9069a
            boolean r9 = gg.l.a(r9, r10)
            if (r9 != 0) goto L221
            r7.add(r8)
            goto L221
        L241:
            wb.ho.e1(r0, r2, r7)
            java.lang.String r2 = "群聊标签已删除"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r5)
            r0.show()
            wb.u3 r0 = wb.u3.f19354a
            r4.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L255:
            java.lang.Object r0 = r1.f1283h
            v8.r r0 = (v8.r) r0
            java.lang.Object r2 = r1.f1284i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1286k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            int r2 = r2 + r6
            r0.getClass()
            v8.a r5 = new v8.a
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r6 = r0.toString()
            r6.getClass()
            java.lang.String r0 = "转发规则 "
            java.lang.String r7 = eh.a.l(r2, r0)
            java.lang.String r18 = ""
            tf.v r10 = tf.v.f13169g
            java.util.LinkedHashSet r13 = v8.r.f14283b
            r17 = 0
            r19 = 0
            r8 = 1
            r9 = 0
            r14 = 0
            r15 = 0
            r11 = r10
            r12 = r10
            r20 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            r3.setValue(r5)
            wb.g r0 = wb.g.f16288i
            r4.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L2a7:
            java.lang.Object r0 = r1.f1283h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1284i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r5 = r1.f1285j
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r7 = r1.f1286k
            i0.a1 r7 = (i0.a1) r7
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L2be
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
        L2be:
            if (r4 != 0) goto L2c6
            java.lang.String r3 = "当前页面无法打开文件选择器"
            wb.ho.h(r0, r2, r3)
            goto L31f
        L2c6:
            wb.d r8 = wb.d.f15580a
            wb.la r0 = new wb.la
            r9 = 14
            r0.<init>(r5, r7, r2, r9)
            monitor-enter(r8)
            wb.d.f15582c = r0     // Catch: java.lang.Throwable -> L322
            wb.d.f15584e = r4     // Catch: java.lang.Throwable -> L322
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L322
            r8.a(r0)     // Catch: java.lang.Throwable -> L322
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r8.a(r0)     // Catch: java.lang.Throwable -> L322
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L322
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L322
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r0.addCategory(r2)     // Catch: java.lang.Throwable -> L322
            java.lang.String r2 = "*/*"
            r0.setType(r2)     // Catch: java.lang.Throwable -> L322
            r0.addFlags(r6)     // Catch: java.lang.Throwable -> L322
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L322
            wb.ho.B4(r4, r0)     // Catch: java.lang.Throwable -> L322
            r2 = 1212371547(0x4843525b, float:200009.42)
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L301
            goto L31e
        L301:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L322
            java.lang.String r3 = "android.intent.action.GET_CONTENT"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L322
            java.lang.String r3 = "android.intent.category.OPENABLE"
            r0.addCategory(r3)     // Catch: java.lang.Throwable -> L322
            java.lang.String r3 = "*/*"
            r0.setType(r3)     // Catch: java.lang.Throwable -> L322
            r0.addFlags(r6)     // Catch: java.lang.Throwable -> L322
            java.lang.String r3 = "选择音频文件"
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r3)     // Catch: java.lang.Throwable -> L322
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L322
        L31e:
            monitor-exit(r8)
        L31f:
            sf.n r0 = sf.n.f12433a
            return r0
        L322:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L322
            throw r0
        L325:
            java.lang.Object r0 = r1.f1283h
            wb.i5 r0 = (wb.i5) r0
            java.lang.Object r2 = r1.f1284i
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r1.f1286k
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r3.getValue()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int r0 = r0.f16718a
            if (r0 < 0) goto L366
            if (r0 >= r6) goto L366
            java.lang.Object r6 = r3.getValue()
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r6 = tf.m.R1(r6)
            r6.remove(r0)
            r3.setValue(r6)
            android.content.SharedPreferences$Editor r0 = r2.edit()
            java.lang.String r2 = "message_block_bindings"
            java.lang.String r3 = a2.a.e(r6)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            r0.apply()
        L366:
            r5.setValue(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L36c:
            java.lang.Object r0 = r1.f1283h
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = "我同意"
            java.lang.Object r3 = r1.f1284i
            fg.a r3 = (fg.a) r3
            java.lang.Object r4 = r1.f1285j
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r7 = r1.f1286k
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r8 = r4.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 <= 0) goto L39e
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r3 = "请等待 "
            java.lang.String r4 = " 秒后继续"
            wb.en.o(r3, r0, r4, r2, r5)
            goto L471
        L39e:
            java.lang.Object r4 = r7.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r0 = gg.l.a(r4, r0)
            if (r0 == 0) goto L468
            java.lang.String r4 = "[Hchat:Storage] 关闭失效配置失败: Hchat_global_config "
            java.lang.String r7 = "Hchat_global_config"
            java.util.concurrent.ConcurrentHashMap r0 = ub.b.f13669a
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 == 0) goto L3c0
            r8 = r0
            goto L3c1
        L3c0:
            r8 = r2
        L3c1:
            java.io.File r0 = ub.b.d(r8)
            boolean r9 = ub.b.b(r0)
            if (r9 == 0) goto L3d0
            android.content.SharedPreferences r0 = ub.b.c(r8, r7)
            goto L428
        L3d0:
            java.lang.String r9 = r8.getPackageName()
            java.lang.String r10 = ":Hchat_global_config"
            java.lang.String r9 = bc.e.i(r9, r10)
            java.util.concurrent.ConcurrentHashMap r10 = ub.b.f13669a
            monitor-enter(r10)
            boolean r0 = ub.b.b(r0)     // Catch: java.lang.Throwable -> L3e9
            if (r0 == 0) goto L3ec
            android.content.SharedPreferences r0 = ub.b.c(r8, r7)     // Catch: java.lang.Throwable -> L3e9
        L3e7:
            monitor-exit(r10)
            goto L428
        L3e9:
            r0 = move-exception
            goto L466
        L3ec:
            java.lang.Object r0 = r10.remove(r9)     // Catch: java.lang.Throwable -> L3e9
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Throwable -> L3e9
            boolean r11 = r0 instanceof ac.o     // Catch: java.lang.Throwable -> L3e9
            if (r11 == 0) goto L41e
            ac.o r0 = (ac.o) r0     // Catch: java.lang.Throwable -> L3fe
            r0.c()     // Catch: java.lang.Throwable -> L3fe
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3fe
            goto L405
        L3fe:
            r0 = move-exception
            sf.f r11 = new sf.f     // Catch: java.lang.Throwable -> L3e9
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L3e9
            r0 = r11
        L405:
            java.lang.Throwable r0 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L3e9
            if (r0 == 0) goto L41e
            java.lang.String r11 = r0.getMessage()     // Catch: java.lang.Throwable -> L3e9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e9
            r12.<init>(r4)     // Catch: java.lang.Throwable -> L3e9
            r12.append(r11)     // Catch: java.lang.Throwable -> L3e9
            java.lang.String r4 = r12.toString()     // Catch: java.lang.Throwable -> L3e9
            fb.v0.n(r4, r0)     // Catch: java.lang.Throwable -> L3e9
        L41e:
            ac.o r0 = ub.b.a(r8, r7)     // Catch: java.lang.Throwable -> L3e9
            java.util.concurrent.ConcurrentHashMap r4 = ub.b.f13669a     // Catch: java.lang.Throwable -> L3e9
            r4.put(r9, r0)     // Catch: java.lang.Throwable -> L3e9
            goto L3e7
        L428:
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch: java.lang.Throwable -> L452
            java.lang.String r7 = "terms_accepted"
            android.content.SharedPreferences$Editor r4 = r4.putBoolean(r7, r6)     // Catch: java.lang.Throwable -> L452
            java.lang.String r7 = "terms_version"
            android.content.SharedPreferences$Editor r4 = r4.putInt(r7, r6)     // Catch: java.lang.Throwable -> L452
            boolean r4 = r4.commit()     // Catch: java.lang.Throwable -> L452
            if (r4 == 0) goto L45c
            java.lang.String r4 = "terms_accepted"
            boolean r4 = r0.getBoolean(r4, r5)     // Catch: java.lang.Throwable -> L452
            if (r4 == 0) goto L45c
            java.lang.String r4 = "terms_version"
            int r0 = r0.getInt(r4, r5)     // Catch: java.lang.Throwable -> L452
            if (r0 != r6) goto L45c
            r3.invoke()
            goto L471
        L452:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "[Hchat:TermsGate] 保存协议状态失败: "
            eh.a.x(r4, r3, r0)
        L45c:
            java.lang.String r0 = "协议状态保存失败，请重试"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r5)
            r0.show()
            goto L471
        L466:
            monitor-exit(r10)
            throw r0
        L468:
            java.lang.String r0 = "请输入“我同意”后继续"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r5)
            r0.show()
        L471:
            sf.n r0 = sf.n.f12433a
            return r0
        L474:
            java.lang.Object r0 = r1.f1286k
            fg.l r0 = (fg.l) r0
            java.lang.Object r3 = r1.f1283h
            x8.s r3 = (x8.s) r3
            java.lang.Object r4 = r1.f1284i
            r9 = r4
            wb.u0 r9 = (wb.u0) r9
            java.lang.Object r4 = r1.f1285j
            fg.l r4 = (fg.l) r4
            wb.v0 r7 = new wb.v0
            int r8 = r3.f21345b
            java.lang.String r8 = wb.ho.N4(r8)
            java.lang.String r10 = r3.f21346c
            java.util.ArrayList r10 = wb.ho.P4(r10)
            java.lang.String r11 = wb.ho.D5(r10)
            wb.kj r12 = new wb.kj
            r12.<init>(r4, r3, r2)
            int r2 = r3.f21345b
            r3 = 6
            if (r2 != r3) goto L4a3
            r13 = r6
            goto L4a4
        L4a3:
            r13 = r5
        L4a4:
            r14 = 192(0xc0, float:2.69E-43)
            r10 = 1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.invoke(r7)
            sf.n r0 = sf.n.f12433a
            return r0
        L4b0:
            java.lang.Object r0 = r1.f1283h
            qg.t r0 = (qg.t) r0
            java.lang.Object r2 = r1.f1284i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1286k
            i0.a1 r4 = (i0.a1) r4
            wb.ho.s(r0, r2, r3, r4, r6)
            sf.n r0 = sf.n.f12433a
            return r0
        L4c6:
            java.lang.Object r0 = r1.f1283h
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r0 = r1.f1284i
            ba.n r0 = (ba.n) r0
            java.lang.Object r4 = r1.f1285j
            fg.a r4 = (fg.a) r4
            java.lang.Object r7 = r1.f1286k
            android.content.Context r7 = (android.content.Context) r7
            wb.dj r8 = new wb.dj
            r8.<init>(r4, r7, r0, r6)
            ba.g r4 = ba.g.f563a
            sf.n r4 = sf.n.f12433a
            r0.getClass()
            ba.g r7 = ba.g.f563a
            java.lang.Class r9 = r2.getClass()
            r7.a(r9)
            java.lang.Class<android.app.Activity> r9 = android.app.Activity.class
            r7.a(r9)
            java.util.concurrent.atomic.AtomicInteger r7 = ba.g.f564b
            ba.c r9 = new ba.c
            r9.<init>(r5)
            int r5 = r7.updateAndGet(r9)
            java.util.concurrent.ConcurrentHashMap r7 = ba.g.f565c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            ba.d r10 = new ba.d
            r10.<init>(r2, r0, r8)
            r7.put(r9, r10)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r8)
            java.lang.String r8 = "android.intent.category.OPENABLE"
            r0.addCategory(r8)
            java.lang.String r9 = "image/*"
            r0.setType(r9)
            r0.addFlags(r6)
            r0.addFlags(r3)
            r2.startActivityForResult(r0, r5)     // Catch: java.lang.Throwable -> L526
            r3 = r4
            goto L52c
        L526:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L52c:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 == 0) goto L56c
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.GET_CONTENT"
            r0.<init>(r3)
            r0.addCategory(r8)
            r0.setType(r9)
            r0.addFlags(r6)
            java.lang.String r3 = "选择消息气泡图片"
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r3)     // Catch: java.lang.Throwable -> L54d
            r2.startActivityForResult(r0, r5)     // Catch: java.lang.Throwable -> L54d
            r2 = r4
            goto L553
        L54d:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
        L553:
            java.lang.Throwable r0 = sf.g.b(r2)
            if (r0 == 0) goto L56c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r7.remove(r0)
            ba.d r0 = (ba.d) r0
            if (r0 == 0) goto L56c
            wb.dj r0 = r0.f558c
            ba.b r2 = ba.b.f553i
            r0.invoke(r2)
        L56c:
            return r4
        L56d:
            java.lang.Object r0 = r1.f1283h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1284i
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.f1286k
            fg.l r3 = (fg.l) r3
            java.lang.Object r6 = r1.f1285j
            db.c r6 = (db.c) r6
            boolean r7 = r0 instanceof android.app.Activity
            if (r7 == 0) goto L584
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
        L584:
            if (r4 != 0) goto L590
            java.lang.String r2 = "当前页面无法打开时间选择器"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r5)
            r0.show()
            goto L5ae
        L590:
            java.lang.Object r0 = tf.m.C1(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r7 = 300000(0x493e0, double:1.482197E-318)
            if (r0 == 0) goto L5a1
            long r9 = r0.longValue()
        L59f:
            long r9 = r9 + r7
            goto L5a6
        L5a1:
            long r9 = java.lang.System.currentTimeMillis()
            goto L59f
        L5a6:
            wb.dj r0 = new wb.dj
            r0.<init>(r3, r6, r2, r5)
            wb.ho.g7(r4, r9, r0)
        L5ae:
            sf.n r0 = sf.n.f12433a
            return r0
        L5b1:
            java.lang.Object r0 = r1.f1283h
            r7 = r0
            wb.s0 r7 = (wb.s0) r7
            java.lang.Object r0 = r1.f1284i
            r8 = r0
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r0 = r1.f1285j
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r2 = r1.f1286k
            r9 = r2
            i0.a1 r9 = (i0.a1) r9
            java.lang.String r2 = r7.f18970a
            r0.setValue(r2)
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L5d0
            r4 = r8
            android.app.Activity r4 = (android.app.Activity) r4
        L5d0:
            r6 = r4
            if (r6 == 0) goto L606
            java.lang.String r11 = r7.f18971b
            java.lang.String r12 = "管理自定义好友头像"
            java.lang.String r0 = "更换头像"
            java.lang.String r2 = "重新选择一张本地图片"
            sf.e r3 = new sf.e
            r3.<init>(r0, r2)
            java.lang.String r0 = "恢复微信头像"
            java.lang.String r2 = "删除当前自定义头像"
            sf.e r4 = new sf.e
            r4.<init>(r0, r2)
            sf.e[] r0 = new sf.e[]{r3, r4}
            java.util.List r13 = a.a.y0(r0)
            c9.k r5 = new c9.k
            r10 = 17
            r5.<init>(r6, r7, r8, r9, r10)
            k.s1 r15 = new k.s1
            r0 = 25
            r15.<init>(r0)
            wb.lv r16 = wb.lv.f17583j
            r14 = r5
            r10 = r6
            wb.y2.Q1(r10, r11, r12, r13, r14, r15, r16)
        L606:
            sf.n r0 = sf.n.f12433a
            return r0
        L609:
            java.lang.Object r0 = r1.f1283h
            wb.b3 r0 = (wb.b3) r0
            java.lang.Object r2 = r1.f1284i
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f1285j
            fg.a r3 = (fg.a) r3
            java.lang.Object r4 = r1.f1286k
            i0.a1 r4 = (i0.a1) r4
            boolean r6 = r0.f15149d
            if (r6 != 0) goto L634
            java.lang.Object r6 = r4.getValue()
            java.util.Set r6 = (java.util.Set) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L634
            java.lang.String r0 = "请选择收藏"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r5)
            r0.show()
            goto L6a8
        L634:
            fg.l r2 = r0.f15148c
            java.lang.Object r4 = r4.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r6 = r0.f15150e
            boolean r0 = r0.f15149d
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = tf.n.e1(r4)
            r5.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L64f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L65f
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            j8.b.r(r7, r5)
            goto L64f
        L65f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L668:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L67f
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.length()
            if (r8 <= 0) goto L668
            r4.add(r7)
            goto L668
        L67f:
            java.util.Set r4 = tf.m.T1(r4)
            java.util.List r5 = tf.m.P1(r4)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L690
            java.lang.String r0 = ""
            goto L6a2
        L690:
            if (r0 == 0) goto L69c
            r9 = 0
            r10 = 62
            r7 = 0
            r8 = 0
            java.lang.String r0 = tf.m.A1(r5, r6, r7, r8, r9, r10)
            goto L6a2
        L69c:
            java.lang.Object r0 = tf.m.t1(r5)
            java.lang.String r0 = (java.lang.String) r0
        L6a2:
            r2.invoke(r0)
            r3.invoke()
        L6a8:
            sf.n r0 = sf.n.f12433a
            return r0
        L6ab:
            java.lang.Object r0 = r1.f1283h
            wb.t5 r0 = (wb.t5) r0
            java.lang.Object r2 = r1.f1284i
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r1.f1286k
            i0.a1 r5 = (i0.a1) r5
            if (r0 != 0) goto L6c1
            r2.invoke()
            goto L6c9
        L6c1:
            r3.setValue(r4)
            java.lang.String r0 = ""
            r5.setValue(r0)
        L6c9:
            sf.n r0 = sf.n.f12433a
            return r0
        L6cc:
            java.lang.Object r0 = r1.f1283h
            fg.q r0 = (fg.q) r0
            java.lang.Object r2 = r1.f1284i
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1286k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = a7.a.j(r3)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = a7.a.j(r4)
            r0.b(r2, r3, r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L6fc:
            java.lang.Object r0 = r1.f1283h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f1284i
            wb.a1 r2 = (wb.a1) r2
            java.lang.Object r3 = r1.f1285j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f1286k
            i0.a1 r4 = (i0.a1) r4
            wb.x0 r2 = (wb.x0) r2
            c9.a r2 = r2.f20074a
            java.lang.String r2 = r2.f1081a
            r2.getClass()
            java.util.List r2 = a.a.x0(r2)
            boolean r2 = c9.o2.e(r0, r2)
            if (r2 == 0) goto L722
            java.lang.String r6 = "分组已删除"
            goto L724
        L722:
            java.lang.String r6 = "分组删除失败"
        L724:
            android.widget.Toast r5 = android.widget.Toast.makeText(r0, r6, r5)
            r5.show()
            if (r2 == 0) goto L73c
            java.util.List r2 = c9.o2.i(r0)
            r3.setValue(r2)
            c9.d2.y(r0)
            wb.y0 r0 = wb.y0.f20278a
            r4.setValue(r0)
        L73c:
            sf.n r0 = sf.n.f12433a
            return r0
        L73f:
            java.lang.Object r0 = r1.f1283h
            qb.k r0 = (qb.k) r0
            java.lang.Object r2 = r1.f1285j
            qb.i r2 = (qb.i) r2
            java.lang.Object r3 = r1.f1284i
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f1286k
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r0.G(r2, r3)
            if (r0 == 0) goto L758
            java.lang.String r2 = "收藏语音已发送"
            goto L75a
        L758:
            java.lang.String r2 = "收藏语音发送失败"
        L75a:
            qb.k.N(r4, r2)
            if (r0 == 0) goto L768
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L768
            r4.finish()
        L768:
            sf.n r0 = sf.n.f12433a
            return r0
        L76b:
            java.lang.Object r0 = r1.f1283h
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f1284i
            qb.k r2 = (qb.k) r2
            java.lang.Object r3 = r1.f1285j
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r1.f1286k
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r0.get()
            if (r0 != 0) goto L784
            qb.k.e(r3)
        L784:
            java.util.Set r0 = r2.f10845l
            r0.remove(r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L78c:
            java.lang.Object r0 = r1.f1283h
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f1284i
            gg.t r2 = (gg.t) r2
            java.lang.Object r3 = r1.f1285j
            gg.u r3 = (gg.u) r3
            java.lang.Object r4 = r1.f1286k
            gg.u r4 = (gg.u) r4
            boolean r0 = r0.compareAndSet(r5, r6)
            if (r0 == 0) goto L7ae
            android.os.Handler r0 = nb.f0.f9261a
            ac.l r5 = new ac.l
            r6 = 22
            r5.<init>(r2, r3, r4, r6)
            r0.post(r5)
        L7ae:
            sf.n r0 = sf.n.f12433a
            return r0
        L7b1:
            java.lang.Object r0 = r1.f1283h
            r10 = r0
            java.lang.Float r10 = (java.lang.Float) r10
            java.lang.Object r0 = r1.f1284i
            i.d0 r0 = (i.d0) r0
            java.lang.Object r2 = r1.f1285j
            r11 = r2
            java.lang.Float r11 = (java.lang.Float) r11
            java.lang.Object r2 = r1.f1286k
            r8 = r2
            i.c0 r8 = (i.c0) r8
            java.lang.Float r2 = r0.f5637g
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L7d4
            java.lang.Float r2 = r0.f5638h
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L7ef
        L7d4:
            r0.f5637g = r10
            r0.f5638h = r11
            i.z0 r7 = new i.z0
            i.m1 r9 = i.d.f5628j
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r0.f5640j = r7
            i.g0 r2 = r0.f5644n
            i0.j1 r2 = r2.f5663b
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.setValue(r3)
            r0.f5641k = r5
            r0.f5642l = r6
        L7ef:
            sf.n r0 = sf.n.f12433a
            return r0
        L7f2:
            java.lang.Object r0 = r1.f1283h
            f9.e r0 = (f9.e) r0
            java.lang.Object r2 = r1.f1284i
            f9.h r2 = (f9.h) r2
            java.lang.Object r3 = r1.f1285j
            f9.c r3 = (f9.c) r3
            java.lang.Object r7 = r1.f1286k
            android.app.Activity r7 = (android.app.Activity) r7
            r8.g r0 = r0.f3359a
            android.content.Context r0 = r0.f11620a
            long r8 = r2.f3376a
            java.lang.Object r2 = r3.f3355b
            java.lang.String r3 = "Hchat_edit_message_backup"
            android.content.SharedPreferences r10 = ub.b.c(r0, r3)
            java.lang.String r11 = be.h.l(r8)
            java.lang.String r12 = ""
            java.lang.String r10 = r10.getString(r11, r12)
            if (r10 == 0) goto L882
            int r11 = r10.length()
            if (r11 <= 0) goto L823
            r4 = r10
        L823:
            if (r4 == 0) goto L882
            i8.c r10 = h.Hchat.hooks.api.core.WeChatApis.message()
            if (r10 == 0) goto L87c
            k8.s r10 = h.Hchat.hooks.api.core.WeChatApis.m()
            if (r10 == 0) goto L87c
            h.Hchat.hooks.api.model.WeChatMessage r10 = r10.c(r8)
            if (r10 == 0) goto L87c
            java.lang.String r15 = r10.content
            f9.f r2 = be.h.f0(r10, r4, r2)
            boolean r11 = r2.f3366a
            if (r11 == 0) goto L857
            be.h.a0(r10, r4)
            android.content.SharedPreferences r0 = ub.b.c(r0, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = be.h.l(r8)
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)
            r0.apply()
        L857:
            f9.g r12 = new f9.g
            boolean r0 = r2.f3366a
            if (r0 == 0) goto L864
            boolean r2 = r2.f3367b
            if (r2 != 0) goto L864
            r20 = r6
            goto L866
        L864:
            r20 = r5
        L866:
            long r13 = r10.msgId
            boolean r21 = r10.isTransfer()
            java.lang.String r17 = be.h.s(r10, r15)
            java.lang.String r18 = be.h.s(r10, r4)
            r19 = r0
            r16 = r4
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21)
            goto L887
        L87c:
            f9.g r12 = new f9.g
            r12.<init>()
            goto L887
        L882:
            f9.g r12 = new f9.g
            r12.<init>()
        L887:
            boolean r0 = r12.f3368a
            if (r0 != 0) goto L88e
            java.lang.String r2 = "没有可恢复内容"
            goto L897
        L88e:
            boolean r2 = r12.f3369b
            if (r2 == 0) goto L895
            java.lang.String r2 = "已恢复，退出重进聊天后生效"
            goto L897
        L895:
            java.lang.String r2 = "已恢复"
        L897:
            f9.e.d(r7, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L89f:
            java.lang.Object r0 = r1.f1283h
            java.util.function.Consumer r0 = (java.util.function.Consumer) r0
            java.lang.Object r2 = r1.f1285j
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = (h.Hchat.hooks.items.script.ScriptWaBridge) r2
            java.lang.Object r3 = r1.f1286k
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.f1284i
            java.lang.String r4 = (java.lang.String) r4
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.E(r0, r2, r3, r4)
            return r0
        L8b4:
            java.lang.Object r0 = r1.f1283h
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r0
            java.lang.Object r2 = r1.f1285j
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r3 = r1.f1286k
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r1.f1284i
            java.lang.String r4 = (java.lang.String) r4
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.r(r0, r2, r3, r4)
            return r0
        L8c9:
            java.lang.Object r0 = r1.f1283h
            fg.a r0 = (fg.a) r0
            java.lang.Object r2 = r1.f1284i
            r8 = r2
            android.app.Activity r8 = (android.app.Activity) r8
            java.lang.Object r2 = r1.f1285j
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r1.f1286k
            fg.a r3 = (fg.a) r3
            r0.invoke()
            c9.e r7 = c9.e.f1154a
            b0.s r11 = new b0.s
            r0 = 3
            r11.<init>(r2, r8, r3, r0)
            r8.getClass()
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r10.<init>(r0)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r10.addCategory(r0)
            java.lang.String r0 = "application/json"
            r10.setType(r0)
            r10.addFlags(r6)
            c9.e.b(r8, r10)
            c9.c r9 = c9.c.f1110b
            bi.c r12 = new bi.c
            r0 = 5
            r12.<init>(r0)
            r7.a(r8, r9, r10, r11, r12)
            sf.n r0 = sf.n.f12433a
            return r0
        L90d:
            java.lang.Object r0 = r1.f1283h
            c9.o2 r0 = (c9.o2) r0
            java.lang.Object r2 = r1.f1284i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f1285j
            c9.c1 r3 = (c9.c1) r3
            java.lang.String r3 = r3.f1118a
            java.lang.Object r5 = r1.f1286k
            fg.l r5 = (fg.l) r5
            boolean r0 = r0 instanceof c9.f1
            if (r0 == 0) goto L92d
            boolean r0 = gg.l.a(r2, r3)
            if (r0 == 0) goto L92d
            r5.invoke(r4)
            goto L930
        L92d:
            r5.invoke(r3)
        L930:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
