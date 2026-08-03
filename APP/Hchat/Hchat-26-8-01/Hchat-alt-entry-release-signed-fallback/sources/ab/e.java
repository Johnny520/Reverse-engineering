package ab;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f152j;

    public /* synthetic */ e(i0.h0 r1, m0.a r2, l0.g r3, i0.v0 r4) {
            r0 = this;
            r4 = 8
            r0.f149g = r4
            r0.<init>()
            r0.f150h = r1
            r0.f151i = r2
            r0.f152j = r3
            return
    }

    public /* synthetic */ e(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f149g = r4
            r0.f150h = r1
            r0.f151i = r2
            r0.f152j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r14 = this;
            int r0 = r14.f149g
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r0) {
                case 0: goto L602;
                case 1: goto L5ee;
                case 2: goto L5c8;
                case 3: goto L4f5;
                case 4: goto L4e0;
                case 5: goto L4cf;
                case 6: goto L4be;
                case 7: goto L4ad;
                case 8: goto L479;
                case 9: goto L400;
                case 10: goto L3a2;
                case 11: goto L379;
                case 12: goto L34d;
                case 13: goto L315;
                case 14: goto L2fd;
                case 15: goto L2d9;
                case 16: goto L29d;
                case 17: goto L27a;
                case 18: goto L256;
                case 19: goto L1e6;
                case 20: goto L1b0;
                case 21: goto L170;
                case 22: goto L13d;
                case 23: goto L10a;
                case 24: goto Lce;
                case 25: goto L88;
                case 26: goto L71;
                case 27: goto L55;
                case 28: goto L3a;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r14.f150h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r14.f151i
            fg.a r1 = (fg.a) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r2.getValue()
            rb.m r4 = (rb.m) r4
            boolean r4 = r4.f11930b
            if (r4 != 0) goto L2e
            java.lang.Object r2 = r2.getValue()
            rb.m r2 = (rb.m) r2
            boolean r2 = r2.f11937i
            if (r2 == 0) goto L2a
            goto L2e
        L2a:
            r1.invoke()
            goto L37
        L2e:
            java.lang.String r1 = "请先停止当前任务"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r0.show()
        L37:
            sf.n r0 = sf.n.f12433a
            return r0
        L3a:
            java.lang.Object r0 = r14.f150h
            wb.bp r0 = (wb.bp) r0
            java.lang.Object r1 = r14.f151i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            int r3 = r0.f15271b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setValue(r3)
            r1.invoke(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L55:
            java.lang.Object r0 = r14.f150h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r14.f151i
            db.c r1 = (db.c) r1
            java.lang.Object r2 = r14.f152j
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            tf.t r3 = tf.t.f13167g
            db.c r1 = wb.ho.o7(r1, r2, r3)
            r0.invoke(r1)
            sf.n r0 = sf.n.f12433a
            return r0
        L71:
            java.lang.Object r0 = r14.f150h
            wb.t5 r0 = (wb.t5) r0
            java.lang.Object r1 = r14.f151i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            r1.setValue(r0)
            java.lang.String r0 = ""
            r2.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L88:
            java.lang.Object r0 = r14.f150h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r14.f151i
            k9.j r1 = (k9.j) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            java.lang.String r3 = r1.f7507e
            ig.a.m(r0, r3)
            java.lang.String r3 = r1.f7508f
            ig.a.m(r0, r3)
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lad:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lc8
            java.lang.Object r5 = r3.next()
            r6 = r5
            k9.j r6 = (k9.j) r6
            java.lang.String r6 = r6.f7503a
            java.lang.String r7 = r1.f7503a
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto Lad
            r4.add(r5)
            goto Lad
        Lc8:
            wb.ho.V0(r0, r2, r4)
            sf.n r0 = sf.n.f12433a
            return r0
        Lce:
            java.lang.Object r0 = r14.f150h
            wb.b3 r0 = (wb.b3) r0
            java.lang.Object r1 = r14.f151i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            boolean r0 = r0.f15149d
            if (r0 == 0) goto L100
            java.lang.Object r0 = r2.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lf5
            java.lang.Object r0 = r2.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.LinkedHashSet r0 = tf.d0.S(r0, r1)
            goto L104
        Lf5:
            java.lang.Object r0 = r2.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.LinkedHashSet r0 = tf.d0.V(r0, r1)
            goto L104
        L100:
            java.util.Set r0 = ac.p.N(r1)
        L104:
            r2.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L10a:
            java.lang.Object r0 = r14.f150h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r14.f151i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.f152j
            fg.a r2 = (fg.a) r2
            java.lang.String r5 = "clipboard"
            java.lang.Object r5 = r0.getSystemService(r5)
            boolean r6 = r5 instanceof android.content.ClipboardManager
            if (r6 == 0) goto L123
            r4 = r5
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
        L123:
            if (r4 == 0) goto L12e
            java.lang.String r5 = "HchatScriptDir"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r5, r1)
            r4.setPrimaryClip(r1)
        L12e:
            java.lang.String r1 = "已复制"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r0.show()
            r2.invoke()
            sf.n r0 = sf.n.f12433a
            return r0
        L13d:
            java.lang.Object r0 = r14.f150h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r5 = r14.f151i
            wb.s0 r5 = (wb.s0) r5
            java.lang.Object r6 = r14.f152j
            i0.a1 r6 = (i0.a1) r6
            boolean r7 = r0 instanceof android.app.Activity
            if (r7 == 0) goto L150
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
        L150:
            if (r4 != 0) goto L15c
            java.lang.String r1 = "当前页面无法打开图片选择器"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r3)
            r0.show()
            goto L16d
        L15c:
            java.lang.String r3 = r5.f18970a
            wb.q1 r5 = new wb.q1
            r5.<init>(r0, r6, r1)
            d9.f r0 = d9.f.f2096a
            r3.getClass()
            d9.f r0 = d9.f.f2096a
            r0.b(r4, r5, r3, r2)
        L16d:
            sf.n r0 = sf.n.f12433a
            return r0
        L170:
            java.lang.Object r0 = r14.f150h
            wb.v0 r0 = (wb.v0) r0
            java.lang.Object r1 = r14.f151i
            wb.s0 r1 = (wb.s0) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            boolean r0 = r0.f19585c
            if (r0 == 0) goto L1a4
            java.lang.Object r0 = r2.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r1 = r1.f18970a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L199
            java.lang.Object r0 = r2.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.LinkedHashSet r0 = tf.d0.S(r0, r1)
            goto L1aa
        L199:
            java.lang.Object r0 = r2.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.LinkedHashSet r0 = tf.d0.V(r0, r1)
            goto L1aa
        L1a4:
            java.lang.String r0 = r1.f18970a
            java.util.Set r0 = ac.p.N(r0)
        L1aa:
            r2.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L1b0:
            java.lang.Object r0 = r14.f150h
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Object r1 = r14.f151i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r14.f152j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2 = r2 ^ r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.setValue(r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Object r2 = r3.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.apply()
            sf.n r0 = sf.n.f12433a
            return r0
        L1e6:
            java.lang.Object r0 = r14.f150h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r14.f151i
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r4 = r14.f152j
            fg.a r4 = (fg.a) r4
            if (r0 != 0) goto L1fe
            java.lang.String r0 = "当前页面无法打开文件管理器"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
            goto L250
        L1fe:
            wb.r0 r1 = wb.r0.f18746a
            monitor-enter(r1)
            r4.getClass()     // Catch: java.lang.Throwable -> L253
            wb.r0.f18748c = r4     // Catch: java.lang.Throwable -> L253
            wb.r0.f18749d = r0     // Catch: java.lang.Throwable -> L253
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L253
            r1.a(r3)     // Catch: java.lang.Throwable -> L253
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r1.a(r3)     // Catch: java.lang.Throwable -> L253
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L253
            java.lang.String r4 = "android.intent.action.OPEN_DOCUMENT"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L253
            java.lang.String r4 = "android.intent.category.OPENABLE"
            r3.addCategory(r4)     // Catch: java.lang.Throwable -> L253
            java.lang.String r4 = "*/*"
            r3.setType(r4)     // Catch: java.lang.Throwable -> L253
            r3.addFlags(r2)     // Catch: java.lang.Throwable -> L253
            wb.ho.B4(r0, r3)     // Catch: java.lang.Throwable -> L253
            r4 = 1212371545(0x48435259, float:200009.39)
            r0.startActivityForResult(r3, r4)     // Catch: java.lang.Throwable -> L232
            goto L24f
        L232:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L253
            java.lang.String r5 = "android.intent.action.GET_CONTENT"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L253
            java.lang.String r5 = "android.intent.category.OPENABLE"
            r3.addCategory(r5)     // Catch: java.lang.Throwable -> L253
            java.lang.String r5 = "*/*"
            r3.setType(r5)     // Catch: java.lang.Throwable -> L253
            r3.addFlags(r2)     // Catch: java.lang.Throwable -> L253
            java.lang.String r2 = "选择 Hchat 配置文件"
            android.content.Intent r2 = android.content.Intent.createChooser(r3, r2)     // Catch: java.lang.Throwable -> L253
            r0.startActivityForResult(r2, r4)     // Catch: java.lang.Throwable -> L253
        L24f:
            monitor-exit(r1)
        L250:
            sf.n r0 = sf.n.f12433a
            return r0
        L253:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L253
            throw r0
        L256:
            java.lang.Object r0 = r14.f150h
            n9.a r0 = (n9.a) r0
            java.lang.Object r1 = r14.f151i
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r14.f152j
            fg.l r2 = (fg.l) r2
            java.lang.String r4 = r0.f9070b
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L274
            java.lang.String r0 = "请输入标签名称"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
            goto L277
        L274:
            r2.invoke(r0)
        L277:
            sf.n r0 = sf.n.f12433a
            return r0
        L27a:
            java.lang.Object r0 = r14.f150h
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r14.f151i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.getValue()
            wb.s0 r3 = (wb.s0) r3
            if (r3 != 0) goto L292
            r0.invoke()
            goto L29a
        L292:
            r1.setValue(r4)
            java.lang.String r0 = ""
            r2.setValue(r0)
        L29a:
            sf.n r0 = sf.n.f12433a
            return r0
        L29d:
            java.lang.Object r0 = r14.f150h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r14.f151i
            fg.l r1 = (fg.l) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2d3
            java.lang.Object r4 = r0.next()
            r5 = r4
            wb.m5 r5 = (wb.m5) r5
            java.lang.Object r6 = r2.getValue()
            java.util.Set r6 = (java.util.Set) r6
            wb.s0 r5 = r5.f17595a
            java.lang.String r5 = r5.f18970a
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L2b2
            r3.add(r4)
            goto L2b2
        L2d3:
            r1.invoke(r3)
            sf.n r0 = sf.n.f12433a
            return r0
        L2d9:
            java.lang.Object r0 = r14.f150h
            c9.a r0 = (c9.a) r0
            java.lang.Object r1 = r14.f151i
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r14.f152j
            fg.l r2 = (fg.l) r2
            java.lang.String r4 = r0.f1082b
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L2f7
            java.lang.String r0 = "请输入分组名称"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
            goto L2fa
        L2f7:
            r2.invoke(r0)
        L2fa:
            sf.n r0 = sf.n.f12433a
            return r0
        L2fd:
            java.lang.Object r0 = r14.f150h
            v8.h r0 = (v8.h) r0
            java.lang.Object r1 = r14.f151i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r14.f152j
            v8.q r4 = (v8.q) r4
            r0.f14260q = r3
            r0.f14261r = r2
            r0.f14262s = r1
            r4.k(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L315:
            java.lang.Object r0 = r14.f150h
            t.h r0 = (t.h) r0
            java.lang.Object r1 = r14.f151i
            x1.i1 r1 = (x1.i1) r1
            java.lang.Object r2 = r14.f152j
            c1.b r2 = (c1.b) r2
            e1.c r6 = t.h.k1(r0, r1, r2)
            if (r6 == 0) goto L34c
            m.k r5 = r0.f12970u
            long r0 = r5.A
            long r2 = m.l.f8250a
            boolean r0 = u2.l.a(r0, r2)
            if (r0 == 0) goto L338
            java.lang.String r0 = "Expected BringIntoViewRequester to not be used before parents are placed."
            o.b.c(r0)
        L338:
            long r7 = r5.l1()
            r9 = 0
            long r0 = r5.o1(r6, r7, r9)
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r0 = r0 ^ r2
            e1.c r4 = r6.i(r0)
        L34c:
            return r4
        L34d:
            java.lang.Object r0 = r14.f150h
            s0.b r0 = (s0.b) r0
            java.lang.Object r1 = r14.f151i
            be.k r1 = (be.k) r1
            java.lang.Object r2 = r14.f152j
            gg.s r2 = (gg.s) r2
            r0.a()
            java.lang.Object r0 = r1.f814c
            s0.a r0 = (s0.a) r0
            int r1 = r2.f4562g
        L362:
            int r2 = r0.get()
            int r3 = r2 >>> 27
            r3 = r3 & 15
            if (r3 != r1) goto L36f
            int r3 = r2 + (-1)
            goto L370
        L36f:
            r3 = r2
        L370:
            boolean r2 = r0.compareAndSet(r2, r3)
            if (r2 == 0) goto L362
            sf.n r0 = sf.n.f12433a
            return r0
        L379:
            java.lang.Object r0 = r14.f150h
            i0.x r0 = (i0.x) r0
            java.lang.Object r1 = r14.f151i
            r.z r1 = (r.z) r1
            java.lang.Object r2 = r14.f152j
            r.d r2 = (r.d) r2
            java.lang.Object r0 = r0.getValue()
            r.h r0 = (r.h) r0
            ac.k r3 = new ac.k
            b.f r4 = r1.f11284e
            java.lang.Object r4 = r4.f338e
            s.g0 r4 = (s.g0) r4
            java.lang.Object r4 = r4.getValue()
            lg.d r4 = (lg.d) r4
            r3.<init>(r4, r0)
            r.k r4 = new r.k
            r4.<init>(r1, r0, r2, r3)
            return r4
        L3a2:
            java.lang.Object r0 = r14.f150h
            l0.b r0 = (l0.b) r0
            java.lang.Object r1 = r14.f151i
            l0.k r1 = (l0.k) r1
            java.lang.Object r3 = r14.f152j
            m0.k0 r3 = (m0.k0) r3
            if (r0 == 0) goto L3ba
            int r0 = r1.c(r0)
            int r5 = r1.f7713t
            int r0 = r0 - r5
            r1.a(r0)
        L3ba:
            int r0 = r1.f7713t
            java.util.List r0 = g4.a.h(r1, r4, r0, r4)
            java.lang.Object r1 = tf.m.C1(r0)
            x0.b r1 = (x0.b) r1
            if (r1 == 0) goto L3cb
            java.lang.Integer r1 = r1.f20824b
            goto L3cc
        L3cb:
            r1 = r4
        L3cc:
            java.util.List r5 = r3.f(r1)
            if (r1 == 0) goto L3f2
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3d9
            goto L3f2
        L3d9:
            java.lang.Object r6 = tf.m.t1(r5)
            x0.b r6 = (x0.b) r6
            java.util.List r2 = tf.m.q1(r2, r5)
            int r5 = r6.f20823a
            x0.b r6 = new x0.b
            r6.<init>(r5, r4, r1)
            java.util.List r1 = a.a.x0(r6)
            java.util.ArrayList r5 = tf.m.F1(r1, r2)
        L3f2:
            x0.a r1 = new x0.a
            java.util.ArrayList r0 = tf.m.F1(r0, r5)
            boolean r2 = r3.j()
            r1.<init>(r0, r2)
            return r1
        L400:
            java.lang.Object r0 = r14.f150h
            r5 = r0
            m.k r5 = (m.k) r5
            java.lang.Object r0 = r14.f151i
            m.g3 r0 = (m.g3) r0
            java.lang.Object r1 = r14.f152j
            m.f r1 = (m.f) r1
            sf.n r12 = sf.n.f12433a
            m.c r13 = r5.f8237y
        L411:
            j0.b r6 = r13.f8101a
            int r7 = r6.f6673i
            if (r7 == 0) goto L44f
            if (r7 == 0) goto L449
            int r7 = r7 + (-1)
            java.lang.Object[] r6 = r6.f6671g
            r6 = r6[r7]
            m.i r6 = (m.i) r6
            t.f r6 = r6.f8186a
            java.lang.Object r6 = r6.invoke()
            e1.c r6 = (e1.c) r6
            if (r6 != 0) goto L42d
            r6 = r2
            goto L436
        L42d:
            r9 = 0
            r11 = 3
            r7 = 0
            boolean r6 = m.k.m1(r5, r6, r7, r9, r11)
        L436:
            if (r6 == 0) goto L44f
            j0.b r6 = r13.f8101a
            int r7 = r6.f6673i
            int r7 = r7 - r2
            java.lang.Object r6 = r6.k(r7)
            m.i r6 = (m.i) r6
            qg.g r6 = r6.f8187b
            r6.resumeWith(r12)
            goto L411
        L449:
            java.lang.String r0 = "MutableVector is empty."
            j8.o.l(r0)
            goto L478
        L44f:
            boolean r4 = r5.f8238z
            if (r4 == 0) goto L46f
            m.c2 r4 = r5.f8236x
            java.lang.Object r4 = r4.invoke()
            r6 = r4
            e1.c r6 = (e1.c) r6
            if (r6 == 0) goto L46a
            r9 = 0
            r11 = 3
            r7 = 0
            boolean r4 = m.k.m1(r5, r6, r7, r9, r11)
            if (r4 != r2) goto L46a
            goto L46b
        L46a:
            r2 = r3
        L46b:
            if (r2 == 0) goto L46f
            r5.f8238z = r3
        L46f:
            r2 = 0
            float r1 = m.k.k1(r5, r1, r2)
            r0.f8175e = r1
            r4 = r12
        L478:
            return r4
        L479:
            java.lang.Object r0 = r14.f150h
            r1 = r0
            i0.h0 r1 = (i0.h0) r1
            java.lang.Object r0 = r14.f151i
            m0.a r0 = (m0.a) r0
            java.lang.Object r2 = r14.f152j
            l0.g r2 = (l0.g) r2
            m0.b r5 = r1.M
            m0.a r6 = r5.f8440b
            r5.f8440b = r0     // Catch: java.lang.Throwable -> L4a9
            l0.g r7 = r1.G     // Catch: java.lang.Throwable -> L4a9
            int[] r8 = r1.f5908o     // Catch: java.lang.Throwable -> L4a9
            f.w r9 = r1.f5915v     // Catch: java.lang.Throwable -> L4a9
            r1.f5908o = r4     // Catch: java.lang.Throwable -> L4a9
            r1.f5915v = r4     // Catch: java.lang.Throwable -> L4a9
            r1.G = r2     // Catch: java.lang.Throwable -> L4a1
            boolean r2 = r5.f8443e     // Catch: java.lang.Throwable -> L4a1
            r5.f8443e = r3     // Catch: java.lang.Throwable -> L49d
            throw r4     // Catch: java.lang.Throwable -> L49d
        L49d:
            r0 = move-exception
            r5.f8443e = r2     // Catch: java.lang.Throwable -> L4a1
            throw r0     // Catch: java.lang.Throwable -> L4a1
        L4a1:
            r0 = move-exception
            r1.G = r7     // Catch: java.lang.Throwable -> L4a9
            r1.f5908o = r8     // Catch: java.lang.Throwable -> L4a9
            r1.f5915v = r9     // Catch: java.lang.Throwable -> L4a9
            throw r0     // Catch: java.lang.Throwable -> L4a9
        L4a9:
            r0 = move-exception
            r5.f8440b = r6
            throw r0
        L4ad:
            java.lang.Object r0 = r14.f150h
            java.util.function.Consumer r0 = (java.util.function.Consumer) r0
            java.lang.Object r1 = r14.f151i
            h.Hchat.hooks.items.script.ScriptWaBridge r1 = (h.Hchat.hooks.items.script.ScriptWaBridge) r1
            java.lang.Object r2 = r14.f152j
            java.lang.String r2 = (java.lang.String) r2
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.q(r0, r1, r2)
            return r0
        L4be:
            java.lang.Object r0 = r14.f150h
            java.util.function.Consumer r0 = (java.util.function.Consumer) r0
            java.lang.Object r1 = r14.f151i
            h.Hchat.hooks.items.script.ScriptWaBridge r1 = (h.Hchat.hooks.items.script.ScriptWaBridge) r1
            java.lang.Object r2 = r14.f152j
            java.util.List r2 = (java.util.List) r2
            sf.n r0 = h.Hchat.hooks.items.script.ScriptWaBridge.L(r0, r1, r2)
            return r0
        L4cf:
            java.lang.Object r0 = r14.f150h
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r1 = r14.f151i
            h.Hchat.hooks.items.script.ScriptPluginBridge r1 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r1
            java.lang.Object r2 = r14.f152j
            java.lang.String r2 = (java.lang.String) r2
            sf.n r0 = h.Hchat.hooks.items.script.ScriptPluginBridge.q(r0, r1, r2)
            return r0
        L4e0:
            java.lang.Object r0 = r14.f150h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r14.f151i
            java.lang.Object r2 = r14.f152j
            android.content.Context r2 = (android.content.Context) r2
            c9.d2.y(r0)
            c9.d2 r0 = c9.d2.f1137a
            c9.d2.w(r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L4f5:
            java.lang.Object r0 = r14.f150h
            r6 = r0
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r0 = r14.f151i
            r3 = r0
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r14.f152j
            r5 = r0
            fg.a r5 = (fg.a) r5
            java.lang.String r7 = "[Hchat:ConversationGroup] 导出当前账号的聊天分组失败: "
            r6.getClass()
            java.lang.Object r8 = c9.o2.f1298a
            monitor-enter(r8)
            java.lang.String r0 = c9.o2.a()     // Catch: java.lang.Throwable -> L5c5
            boolean r9 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L5c5
            if (r9 == 0) goto L517
            goto L56e
        L517:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54a
            r9.<init>()     // Catch: java.lang.Throwable -> L54a
            java.lang.String r10 = "format"
            java.lang.String r11 = "HchatConversationGroups"
            r9.put(r10, r11)     // Catch: java.lang.Throwable -> L54a
            java.lang.String r10 = "schema"
            java.lang.String r11 = "HchatConversationGroups"
            r9.put(r10, r11)     // Catch: java.lang.Throwable -> L54a
            java.lang.String r10 = "version"
            r9.put(r10, r2)     // Catch: java.lang.Throwable -> L54a
            java.lang.String r2 = "exportedAt"
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L54a
            r9.put(r2, r10)     // Catch: java.lang.Throwable -> L54a
            java.lang.String r2 = "groups"
            java.util.List r0 = c9.o2.j(r6, r0)     // Catch: java.lang.Throwable -> L54a
            org.json.JSONArray r0 = c9.o2.g(r0)     // Catch: java.lang.Throwable -> L54a
            r9.put(r2, r0)     // Catch: java.lang.Throwable -> L54a
            java.lang.String r0 = r9.toString(r1)     // Catch: java.lang.Throwable -> L54a
            goto L551
        L54a:
            r0 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L5c5
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5c5
            r0 = r2
        L551:
            java.lang.Throwable r2 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L5c5
            if (r2 != 0) goto L559
            r4 = r0
            goto L56c
        L559:
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L5c5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c5
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L5c5
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c5
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L5c5
            fb.v0.n(r0, r2)     // Catch: java.lang.Throwable -> L5c5
        L56c:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5c5
        L56e:
            monitor-exit(r8)
            if (r4 != 0) goto L577
            java.lang.String r0 = "导出聊天分组失败"
            c9.j1.p(r6, r0)
            goto L5c2
        L577:
            r3.invoke()
            r2 = r5
            c9.e r5 = c9.e.f1154a
            c9.i r9 = new c9.i
            r0 = 3
            r9.<init>(r2, r0, r6)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMdd_HHmmss"
            java.util.Locale r3 = java.util.Locale.US
            r0.<init>(r2, r3)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r0 = r0.format(r2)
            java.lang.String r2 = "Hchat_chat_groups_"
            java.lang.String r3 = ".json"
            java.lang.String r0 = eh.a.n(r2, r0, r3)
            c9.b r7 = new c9.b
            r7.<init>(r4)
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.CREATE_DOCUMENT"
            r8.<init>(r2)
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r8.addCategory(r2)
            java.lang.String r2 = "application/json"
            r8.setType(r2)
            java.lang.String r2 = "android.intent.extra.TITLE"
            r8.putExtra(r2, r0)
            r8.addFlags(r1)
            c9.e.b(r6, r8)
            r10 = 0
            r5.a(r6, r7, r8, r9, r10)
        L5c2:
            sf.n r0 = sf.n.f12433a
            return r0
        L5c5:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L5c8:
            java.lang.Object r0 = r14.f150h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r14.f151i
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r14.f152j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5e6
            java.lang.String r0 = "请至少选择一个分组"
            c9.j1.p(r1, r0)
            goto L5eb
        L5e6:
            c9.e1 r0 = c9.e1.f1175l
            r2.setValue(r0)
        L5eb:
            sf.n r0 = sf.n.f12433a
            return r0
        L5ee:
            java.lang.Object r0 = r14.f150h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r14.f151i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.f152j
            fg.a r2 = (fg.a) r2
            c9.j1 r3 = c9.j1.f1228a
            c9.j1.v(r0, r1, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L602:
            java.lang.Object r0 = r14.f150h
            ab.f r0 = (ab.f) r0
            java.lang.Object r1 = r14.f151i
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r2 = r14.f152j
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            r8.g r5 = r0.f153a
            android.content.Context r5 = r5.f11620a
            java.lang.String r6 = "Hchat_quote_delete_clear_config"
            android.content.SharedPreferences r5 = ub.b.c(r5, r6)
            java.lang.String r6 = "quote_delete_clear_enable"
            boolean r5 = r5.getBoolean(r6, r3)
            if (r5 != 0) goto L622
            goto L68c
        L622:
            java.lang.CharSequence r5 = r1.getText()
            if (r5 == 0) goto L62e
            int r5 = r5.length()
            if (r5 != 0) goto L68c
        L62e:
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L64c
            boolean r5 = r2 instanceof android.view.View
            if (r5 == 0) goto L648
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L648
            boolean r5 = ab.f.g(r2)
            if (r5 == 0) goto L648
            goto L649
        L648:
            r2 = r4
        L649:
            if (r2 == 0) goto L64c
            goto L688
        L64c:
            android.view.View r2 = ab.f.c(r1)
            if (r2 == 0) goto L654
        L652:
            r4 = r2
            goto L685
        L654:
            java.lang.ref.WeakReference r2 = r0.f157e
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L670
            boolean r5 = r2 instanceof android.view.View
            if (r5 == 0) goto L670
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L670
            boolean r5 = ab.f.g(r2)
            if (r5 == 0) goto L670
            goto L671
        L670:
            r2 = r4
        L671:
            if (r2 == 0) goto L685
            boolean r5 = r2 instanceof android.view.View
            if (r5 == 0) goto L685
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            android.view.View r5 = r5.getRootView()
            android.view.View r1 = r1.getRootView()
            if (r5 != r1) goto L685
            goto L652
        L685:
            if (r4 == 0) goto L68c
            r2 = r4
        L688:
            boolean r3 = r0.a(r2)
        L68c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
    }
}
