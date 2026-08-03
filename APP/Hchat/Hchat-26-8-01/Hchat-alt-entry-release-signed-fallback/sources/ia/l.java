package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6597l;

    public /* synthetic */ l(android.app.Activity r2, boolean r3, wb.kv r4, java.util.Set r5, wb.me r6) {
            r1 = this;
            r0 = 5
            r1.f6592g = r0
            r1.<init>()
            r1.f6594i = r2
            r1.f6595j = r3
            r1.f6596k = r4
            r1.f6593h = r5
            r1.f6597l = r6
            return
    }

    public /* synthetic */ l(java.lang.Object r1, java.lang.Object r2, boolean r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f6592g = r6
            r0.f6593h = r1
            r0.f6594i = r2
            r0.f6595j = r3
            r0.f6596k = r4
            r0.f6597l = r5
            r0.<init>()
            return
    }

    public /* synthetic */ l(java.lang.Object r2, boolean r3, android.content.Context r4, i0.a1 r5, i0.a1 r6) {
            r1 = this;
            r0 = 4
            r1.f6592g = r0
            r1.<init>()
            r1.f6593h = r2
            r1.f6595j = r3
            r1.f6594i = r4
            r1.f6596k = r5
            r1.f6597l = r6
            return
    }

    public /* synthetic */ l(boolean r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f6592g = r6
            r0.f6595j = r1
            r0.f6593h = r2
            r0.f6594i = r3
            r0.f6596k = r4
            r0.f6597l = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.f6592g
            switch(r0) {
                case 0: goto L2dd;
                case 1: goto L29b;
                case 2: goto L275;
                case 3: goto L245;
                case 4: goto L1fc;
                case 5: goto L1c5;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r15.f6593h
            r1 = r0
            wb.u0 r1 = (wb.u0) r1
            java.lang.Object r0 = r15.f6594i
            r2 = r0
            g8.i r2 = (g8.i) r2
            java.lang.Object r0 = r15.f6596k
            r3 = r0
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Object r0 = r15.f6597l
            r4 = r0
            fg.p r4 = (fg.p) r4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r5.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L58
            r6.<init>()     // Catch: java.lang.Throwable -> L58
            boolean r0 = r15.f6595j
            tf.t r7 = tf.t.f13167g
            if (r0 == 0) goto L8e
            java.util.ArrayList r0 = r2.p()     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r0 = move-exception
            sf.f r8 = new sf.f     // Catch: java.lang.Throwable -> L58
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L58
            r0 = r8
        L35:
            boolean r8 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L58
            if (r8 == 0) goto L3b
            r0 = r7
        L3b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        L41:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r8 == 0) goto L8e
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L58
            h.Hchat.hooks.api.model.ContactLabelBean r8 = (h.Hchat.hooks.api.model.ContactLabelBean) r8     // Catch: java.lang.Throwable -> L58
            java.lang.String r9 = r8.labelName     // Catch: java.lang.Throwable -> L58
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L58
            if (r10 == 0) goto L5b
            java.lang.String r9 = r8.labelId     // Catch: java.lang.Throwable -> L58
            goto L5b
        L58:
            r0 = move-exception
            goto L1bb
        L5b:
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L58
            if (r10 == 0) goto L62
            goto L41
        L62:
            java.util.List<java.lang.String> r8 = r8.userNameList     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L58
        L68:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r10 == 0) goto L41
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L58
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L58
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L58
            if (r11 != 0) goto L68
            java.lang.Object r11 = r6.get(r10)     // Catch: java.lang.Throwable -> L58
            if (r11 != 0) goto L88
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r11.<init>()     // Catch: java.lang.Throwable -> L58
            r6.put(r10, r11)     // Catch: java.lang.Throwable -> L58
        L88:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L58
            r11.add(r9)     // Catch: java.lang.Throwable -> L58
            goto L68
        L8e:
            wb.u0 r0 = wb.u0.f19344g     // Catch: java.lang.Throwable -> L58
            wb.u0 r8 = wb.u0.f19346i
            r9 = 0
            wb.u0 r10 = wb.u0.f19347j
            if (r1 == r0) goto L9b
            if (r1 == r8) goto L9b
            if (r1 != r10) goto Lcd
        L9b:
            java.util.ArrayList r0 = r2.y()     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r11.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        La8:
            boolean r12 = r0.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r12 == 0) goto Lca
            java.lang.Object r12 = r0.next()     // Catch: java.lang.Throwable -> L58
            h.Hchat.hooks.api.model.WeChatContact r12 = (h.Hchat.hooks.api.model.WeChatContact) r12     // Catch: java.lang.Throwable -> L58
            java.lang.String r13 = r12.wxId     // Catch: java.lang.Throwable -> L58
            java.lang.Object r13 = r6.get(r13)     // Catch: java.lang.Throwable -> L58
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L58
            if (r13 != 0) goto Lbf
            r13 = r7
        Lbf:
            r14 = 4
            wb.s0 r12 = wb.ho.j7(r12, r9, r13, r14)     // Catch: java.lang.Throwable -> L58
            if (r12 == 0) goto La8
            r11.add(r12)     // Catch: java.lang.Throwable -> L58
            goto La8
        Lca:
            tf.r.h1(r5, r11)     // Catch: java.lang.Throwable -> L58
        Lcd:
            wb.u0 r0 = wb.u0.f19345h     // Catch: java.lang.Throwable -> L58
            r6 = 0
            if (r1 == r0) goto Ld6
            if (r1 == r8) goto Ld6
            if (r1 != r10) goto Lfe
        Ld6:
            java.util.ArrayList r0 = r2.x()     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r8.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        Le3:
            boolean r11 = r0.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r11 == 0) goto Lfb
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L58
            h.Hchat.hooks.api.model.WeChatContact r11 = (h.Hchat.hooks.api.model.WeChatContact) r11     // Catch: java.lang.Throwable -> L58
            r12 = 6
            r13 = 1
            wb.s0 r11 = wb.ho.j7(r11, r13, r6, r12)     // Catch: java.lang.Throwable -> L58
            if (r11 == 0) goto Le3
            r8.add(r11)     // Catch: java.lang.Throwable -> L58
            goto Le3
        Lfb:
            tf.r.h1(r5, r8)     // Catch: java.lang.Throwable -> L58
        Lfe:
            if (r1 != r10) goto L129
            java.lang.String r0 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"
            java.util.ArrayList r0 = r2.U(r0, r6)     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        L10f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L126
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L58
            h.Hchat.hooks.api.model.WeChatContact r2 = (h.Hchat.hooks.api.model.WeChatContact) r2     // Catch: java.lang.Throwable -> L58
            r8 = 2
            wb.s0 r2 = wb.ho.j7(r2, r9, r6, r8)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L10f
            r1.add(r2)     // Catch: java.lang.Throwable -> L58
            goto L10f
        L126:
            tf.r.h1(r5, r1)     // Catch: java.lang.Throwable -> L58
        L129:
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversations()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L134
            java.util.ArrayList r0 = r0.c()     // Catch: java.lang.Throwable -> L58
            goto L135
        L134:
            r0 = r6
        L135:
            if (r0 != 0) goto L138
            goto L139
        L138:
            r7 = r0
        L139:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            int r1 = tf.n.e1(r7)     // Catch: java.lang.Throwable -> L58
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r1 = r7.iterator()     // Catch: java.lang.Throwable -> L58
        L146:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L16a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L58
            int r7 = r9 + 1
            if (r9 < 0) goto L166
            l8.b r2 = (l8.b) r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = r2.f7898a     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L58
            sf.e r9 = new sf.e     // Catch: java.lang.Throwable -> L58
            r9.<init>(r2, r8)     // Catch: java.lang.Throwable -> L58
            r0.add(r9)     // Catch: java.lang.Throwable -> L58
            r9 = r7
            goto L146
        L166:
            a.a.Q0()     // Catch: java.lang.Throwable -> L58
            throw r6     // Catch: java.lang.Throwable -> L58
        L16a:
            java.util.Map r0 = tf.y.e0(r0)     // Catch: java.lang.Throwable -> L58
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L58
            r1.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L58
        L17c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L195
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L58
            r7 = r6
            wb.s0 r7 = (wb.s0) r7     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = r7.f18970a     // Catch: java.lang.Throwable -> L58
            boolean r7 = r1.add(r7)     // Catch: java.lang.Throwable -> L58
            if (r7 == 0) goto L17c
            r2.add(r6)     // Catch: java.lang.Throwable -> L58
            goto L17c
        L195:
            c9.z r1 = new c9.z     // Catch: java.lang.Throwable -> L58
            r5 = 4
            r1.<init>(r0, r5)     // Catch: java.lang.Throwable -> L58
            wb.kn r0 = new wb.kn     // Catch: java.lang.Throwable -> L58
            r5 = 5
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L58
            wb.kn r1 = new wb.kn     // Catch: java.lang.Throwable -> L58
            r5 = 6
            r1.<init>(r0, r5)     // Catch: java.lang.Throwable -> L58
            wb.kn r0 = new wb.kn     // Catch: java.lang.Throwable -> L58
            r5 = 7
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L58
            java.util.List r0 = tf.m.K1(r2, r0)     // Catch: java.lang.Throwable -> L58
            rb.g r1 = new rb.g     // Catch: java.lang.Throwable -> L58
            r2 = 6
            r1.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L58
            r3.post(r1)     // Catch: java.lang.Throwable -> L58
            goto L1c4
        L1bb:
            rb.g r1 = new rb.g
            r2 = 7
            r1.<init>(r4, r2, r0)
            r3.post(r1)
        L1c4:
            return
        L1c5:
            java.lang.Object r0 = r15.f6594i
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r0 = r15.f6595j
            java.lang.Object r1 = r15.f6596k
            r2 = r1
            wb.kv r2 = (wb.kv) r2
            java.lang.Object r1 = r15.f6593h
            r5 = r1
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r1 = r15.f6597l
            r6 = r1
            wb.me r6 = (wb.me) r6
            java.util.List r0 = be.h.J(r0)     // Catch: java.lang.Throwable -> L1e0
            goto L1e7
        L1e0:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L1e7:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L1ee
            tf.t r0 = tf.t.f13167g
        L1ee:
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            ca.x r1 = new ca.x
            r7 = 16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3.runOnUiThread(r1)
            return
        L1fc:
            java.lang.Object r0 = r15.f6594i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r15.f6596k
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r15.f6597l
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r15.f6593h
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L23a
            boolean r2 = r15.f6595j
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
            java.lang.Throwable r1 = sf.g.b(r3)
            if (r1 == 0) goto L222
            java.lang.String r1 = r1.getMessage()
            goto L223
        L222:
            r1 = 0
        L223:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "切换失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L244
        L23a:
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r1 = 1
            p.a.u(r0, r1, r2)
        L244:
            return
        L245:
            java.lang.Object r0 = r15.f6593h
            r4 = r0
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r0 = r15.f6594i
            r5 = r0
            eb.c0 r5 = (eb.c0) r5
            java.lang.Object r0 = r15.f6596k
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r15.f6597l
            r6 = r0
            i0.a1 r6 = (i0.a1) r6
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r1 = r5.f2506a
            boolean r2 = r15.f6595j
            java.lang.Object r2 = r0.m16setPluginEnabled0E7RQCE(r4, r1, r2)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ca.x r1 = new ca.x
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r1)
            return
        L275:
            java.lang.Object r0 = r15.f6593h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r15.f6594i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r15.f6596k
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r15.f6597l
            i0.a1 r3 = (i0.a1) r3
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.setValue(r4)
            boolean r1 = r15.f6595j
            if (r1 == 0) goto L295
            java.lang.String r1 = "已发送到 "
            java.lang.String r0 = wb.en.g(r1, r0)
            goto L297
        L295:
            java.lang.String r0 = "发送失败，请稍后重试"
        L297:
            wb.ho.h(r2, r3, r0)
            return
        L29b:
            java.lang.Object r0 = r15.f6593h
            r1 = r0
            ia.q r1 = (ia.q) r1
            java.lang.Object r0 = r15.f6594i
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r15.f6595j
            java.lang.Object r2 = r15.f6596k
            r3 = r2
            wb.kv r3 = (wb.kv) r3
            java.lang.Object r2 = r15.f6597l
            r5 = r2
            c9.u r5 = (c9.u) r5
            java.util.List r0 = be.h.J(r0)     // Catch: java.lang.Throwable -> L2b6
            goto L2bd
        L2b6:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L2bd:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto L2ca
            ab.b r1 = r1.f6623c
            java.lang.String r6 = "加载朋友圈伪集赞候选人失败"
            r1.invoke(r6, r2)
        L2ca:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L2d0
            tf.t r0 = tf.t.f13167g
        L2d0:
            r6 = r0
            java.util.List r6 = (java.util.List) r6
            b9.c r2 = new b9.c
            r7 = 6
            r2.<init>(r3, r4, r5, r6, r7)
            r4.runOnUiThread(r2)
            return
        L2dd:
            java.lang.Object r0 = r15.f6593h
            r5 = r0
            ia.q r5 = (ia.q) r5
            java.lang.Object r0 = r15.f6594i
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            boolean r0 = r15.f6595j
            java.lang.Object r1 = r15.f6596k
            r2 = r1
            wb.kv r2 = (wb.kv) r2
            java.lang.Object r1 = r15.f6597l
            r6 = r1
            ia.j r6 = (ia.j) r6
            java.util.List r0 = be.h.J(r0)     // Catch: java.lang.Throwable -> L2f8
            goto L2ff
        L2f8:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L2ff:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L30c
            ab.b r4 = r5.f6623c
            java.lang.String r7 = "加载朋友圈伪互动好友失败"
            r4.invoke(r7, r1)
        L30c:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L312
            tf.t r0 = tf.t.f13167g
        L312:
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            ca.x r1 = new ca.x
            r7 = 8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r3.runOnUiThread(r1)
            return
    }
}
