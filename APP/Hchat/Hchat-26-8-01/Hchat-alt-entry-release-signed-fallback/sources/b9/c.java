package b9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f531k;

    public /* synthetic */ c(bb.g r2, android.widget.TextView r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 1
            r1.f527g = r0
            r1.<init>()
            r1.f530j = r2
            r1.f528h = r3
            r1.f529i = r4
            r1.f531k = r5
            return
    }

    public /* synthetic */ c(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f527g = r5
            r0.f528h = r1
            r0.f530j = r2
            r0.f531k = r3
            r0.f529i = r4
            r0.<init>()
            return
    }

    public /* synthetic */ c(java.lang.Object r1, java.lang.String r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f527g = r5
            r0.f528h = r1
            r0.f529i = r2
            r0.f530j = r3
            r0.f531k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ c(java.lang.String r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f527g = r5
            r0.f529i = r1
            r0.f528h = r2
            r0.f530j = r3
            r0.f531k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ c(ob.n r2, ob.k r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 14
            r1.f527g = r0
            r1.<init>()
            r1.f528h = r2
            r1.f530j = r3
            r1.f529i = r4
            r1.f531k = r5
            return
    }

    public /* synthetic */ c(qg.t r1, g8.i r2, i0.a1 r3, i0.a1 r4, i0.a1 r5) {
            r0 = this;
            r1 = 22
            r0.f527g = r1
            r0.<init>()
            r0.f528h = r2
            r0.f530j = r3
            r0.f531k = r4
            r0.f529i = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r21 = this;
            r1 = r21
            int r0 = r1.f527g
            r2 = 15
            r3 = 8
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            switch(r0) {
                case 0: goto L847;
                case 1: goto L818;
                case 2: goto L7f7;
                case 3: goto L7d4;
                case 4: goto L7aa;
                case 5: goto L77b;
                case 6: goto L753;
                case 7: goto L70f;
                case 8: goto L6d0;
                case 9: goto L693;
                case 10: goto L664;
                case 11: goto L5ff;
                case 12: goto L57c;
                case 13: goto L554;
                case 14: goto L47a;
                case 15: goto L447;
                case 16: goto L410;
                case 17: goto L3c3;
                case 18: goto L39a;
                case 19: goto L37d;
                case 20: goto L29d;
                case 21: goto L215;
                case 22: goto L1e1;
                case 23: goto L177;
                case 24: goto L14e;
                case 25: goto L121;
                case 26: goto L83;
                case 27: goto L41;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r1.f528h
            wb.kv r0 = (wb.kv) r0
            java.lang.Object r2 = r1.f530j
            xa.m r2 = (xa.m) r2
            java.lang.Object r3 = r1.f531k
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r1.f529i
            xa.j r4 = (xa.j) r4
            r0.close()
            wb.zh r0 = new wb.zh
            r5 = 14
            r0.<init>(r2, r3, r4, r5)
            r2.getClass()
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L40
            android.view.View r4 = r4.getDecorView()
            if (r4 == 0) goto L40
            wb.vu r5 = new wb.vu
            r5.<init>(r2, r3, r0)
            r4.postOnAnimation(r5)
        L40:
            return
        L41:
            java.lang.Object r0 = r1.f528h
            fg.a r0 = (fg.a) r0
            java.lang.Object r2 = r1.f530j
            r9 = r2
            xa.m r9 = (xa.m) r9
            java.lang.Object r2 = r1.f531k
            r8 = r2
            wb.kv r8 = (wb.kv) r8
            java.lang.Object r2 = r1.f529i
            r10 = r2
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L60:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto L67
            goto L73
        L67:
            ia.t r0 = r9.f21446b
            java.lang.String r3 = "更新好友资料失败"
            r0.invoke(r3, r2)
            xa.j r0 = new xa.j
            r0.<init>(r6, r3)
        L73:
            r11 = r0
            xa.j r11 = (xa.j) r11
            android.os.Handler r0 = r9.f21448d
            b9.c r7 = new b9.c
            r12 = 28
            r7.<init>(r8, r9, r10, r11, r12)
            r0.post(r7)
            return
        L83:
            java.lang.Object r0 = r1.f528h
            r4 = r0
            xa.m r4 = (xa.m) r4
            java.lang.Object r0 = r1.f530j
            r3 = r0
            wb.kv r3 = (wb.kv) r3
            java.lang.Object r0 = r1.f531k
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r0 = r1.f529i
            r7 = r0
            xa.i r7 = (xa.i) r7
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> Lc8
            if (r0 == 0) goto L108
            java.util.ArrayList r0 = r0.p()     // Catch: java.lang.Throwable -> Lc8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc8
            r2.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc8
        Laa:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lce
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> Lc8
            r8 = r6
            h.Hchat.hooks.api.model.ContactLabelBean r8 = (h.Hchat.hooks.api.model.ContactLabelBean) r8     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r9 = r8.labelName     // Catch: java.lang.Throwable -> Lc8
            boolean r9 = og.m.t0(r9)     // Catch: java.lang.Throwable -> Lc8
            if (r9 == 0) goto Lca
            java.lang.String r8 = r8.labelId     // Catch: java.lang.Throwable -> Lc8
            boolean r8 = og.m.t0(r8)     // Catch: java.lang.Throwable -> Lc8
            if (r8 != 0) goto Laa
            goto Lca
        Lc8:
            r0 = move-exception
            goto L110
        Lca:
            r2.add(r6)     // Catch: java.lang.Throwable -> Lc8
            goto Laa
        Lce:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lc8
            r0.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc8
            r6.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lc8
        Ldc:
            boolean r8 = r2.hasNext()     // Catch: java.lang.Throwable -> Lc8
            if (r8 == 0) goto Lfd
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> Lc8
            r9 = r8
            h.Hchat.hooks.api.model.ContactLabelBean r9 = (h.Hchat.hooks.api.model.ContactLabelBean) r9     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r10 = r9.labelName     // Catch: java.lang.Throwable -> Lc8
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> Lc8
            if (r11 == 0) goto Lf3
            java.lang.String r10 = r9.labelId     // Catch: java.lang.Throwable -> Lc8
        Lf3:
            boolean r9 = r0.add(r10)     // Catch: java.lang.Throwable -> Lc8
            if (r9 == 0) goto Ldc
            r6.add(r8)     // Catch: java.lang.Throwable -> Lc8
            goto Ldc
        Lfd:
            xa.l r0 = new xa.l     // Catch: java.lang.Throwable -> Lc8
            r0.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.util.List r0 = tf.m.K1(r6, r0)     // Catch: java.lang.Throwable -> Lc8
            r6 = r0
            goto L116
        L108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = "联系人标签不可用"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc8
            throw r0     // Catch: java.lang.Throwable -> Lc8
        L110:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r6 = r2
        L116:
            android.os.Handler r0 = r4.f21448d
            ca.x r2 = new ca.x
            r2.<init>(r3, r4, r5, r6, r7)
            r0.post(r2)
            return
        L121:
            java.lang.Object r0 = r1.f528h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f530j
            x9.e r2 = (x9.e) r2
            java.lang.Object r3 = r1.f531k
            k8.o r3 = (k8.o) r3
            java.lang.Object r4 = r1.f529i
            java.lang.String r4 = (java.lang.String) r4
            x9.d.d(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L137
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L137
            goto L13e
        L137:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L13e:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L14d
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:KeywordNotification] 处理消息失败: "
            eh.a.x(r3, r2, r0)
        L14d:
            return
        L14e:
            java.lang.Object r0 = r1.f529i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.f528h
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f530j
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r1.f531k
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = gg.l.a(r2, r0)
            if (r0 == 0) goto L176
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.setValue(r0)
            long r2 = java.lang.System.currentTimeMillis()
            wb.y2.L0(r4, r2)
        L176:
            return
        L177:
            java.lang.Object r0 = r1.f528h
            java.io.Serializable r0 = (java.io.Serializable) r0
            java.lang.Object r2 = r1.f530j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f531k
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r6 = r1.f529i
            i0.a1 r6 = (i0.a1) r6
            tf.t r7 = tf.t.f13167g
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto L18e
            goto L18f
        L18e:
            r7 = r0
        L18f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L19a:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L1bb
            java.lang.Object r9 = r7.next()
            r10 = r9
            h.Hchat.hooks.api.model.ContactLabelBean r10 = (h.Hchat.hooks.api.model.ContactLabelBean) r10
            java.lang.String r11 = r10.labelName
            boolean r11 = og.m.t0(r11)
            if (r11 == 0) goto L1b7
            java.lang.String r10 = r10.labelId
            boolean r10 = og.m.t0(r10)
            if (r10 != 0) goto L19a
        L1b7:
            r8.add(r9)
            goto L19a
        L1bb:
            wb.e2 r7 = new wb.e2
            r9 = 2
            r7.<init>(r9)
            java.util.List r7 = tf.m.K1(r8, r7)
            og.k r8 = wb.ho.f16633a
            r2.setValue(r7)
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L1d4
            java.lang.String r5 = r0.getMessage()
        L1d4:
            if (r5 != 0) goto L1d7
            goto L1d8
        L1d7:
            r4 = r5
        L1d8:
            r3.setValue(r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.setValue(r0)
            return
        L1e1:
            java.lang.Object r0 = r1.f528h
            g8.i r0 = (g8.i) r0
            java.lang.Object r2 = r1.f530j
            r5 = r2
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r2 = r1.f531k
            r6 = r2
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r2 = r1.f529i
            r7 = r2
            i0.a1 r7 = (i0.a1) r7
            java.util.ArrayList r0 = r0.p()     // Catch: java.lang.Throwable -> L1fa
            r4 = r0
            goto L201
        L1fa:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r4 = r2
        L201:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            b9.c r3 = new b9.c
            r8 = 23
            r3.<init>(r4, r5, r6, r7, r8)
            r0.post(r3)
            return
        L215:
            java.lang.Object r0 = r1.f528h
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r0 = r1.f530j
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r1.f531k
            r15 = r0
            java.util.Set r15 = (java.util.Set) r15
            java.lang.Object r0 = r1.f529i
            wb.me r0 = (wb.me) r0
            boolean r3 = r7.isFinishing()
            if (r3 != 0) goto L29c
            boolean r3 = r7.isDestroyed()
            if (r3 == 0) goto L235
            goto L29c
        L235:
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L245
            java.lang.String r0 = "没有可选择的联系人"
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r6)
            r0.show()
            goto L29c
        L245:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r4 = r8.iterator()
        L24e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L260
            java.lang.Object r5 = r4.next()
            wb.jv r5 = (wb.jv) r5
            java.lang.String r5 = r5.f17140a
            r3.add(r5)
            goto L24e
        L260:
            r4 = r15
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L26c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L283
            java.lang.Object r6 = r4.next()
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r3.contains(r9)
            if (r9 != 0) goto L26c
            r5.add(r6)
            goto L26c
        L283:
            wb.l7 r9 = new wb.l7
            r9.<init>(r0, r2, r5)
            k.s1 r10 = new k.s1
            r0 = 25
            r10.<init>(r0)
            r16 = 0
            r17 = 1152(0x480, float:1.614E-42)
            java.lang.String r11 = "设置排除名单"
            java.lang.String r12 = "保存"
            r13 = 0
            r14 = 0
            wb.y2.U1(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L29c:
            return
        L29d:
            java.lang.Object r0 = r1.f528h
            g8.i r0 = (g8.i) r0
            java.lang.Object r2 = r1.f530j
            wb.s0 r2 = (wb.s0) r2
            java.lang.Object r4 = r1.f531k
            android.os.Handler r4 = (android.os.Handler) r4
            java.lang.Object r6 = r1.f529i
            wb.la r6 = (wb.la) r6
            java.lang.String r7 = r2.f18970a     // Catch: java.lang.Throwable -> L2ff
            java.util.LinkedHashMap r7 = r0.w(r7)     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r2 = r2.f18970a     // Catch: java.lang.Throwable -> L2ff
            boolean r8 = g8.i.I(r2)     // Catch: java.lang.Throwable -> L2ff
            if (r8 != 0) goto L2c1
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ff
            r0.<init>()     // Catch: java.lang.Throwable -> L2ff
            goto L2c9
        L2c1:
            java.util.ArrayList r2 = r0.u(r2)     // Catch: java.lang.Throwable -> L2ff
            java.util.ArrayList r0 = r0.q(r2)     // Catch: java.lang.Throwable -> L2ff
        L2c9:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ff
            r2.<init>()     // Catch: java.lang.Throwable -> L2ff
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2ff
        L2d2:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L2ff
            if (r8 == 0) goto L35f
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L2ff
            h.Hchat.hooks.api.model.WeChatContact r8 = (h.Hchat.hooks.api.model.WeChatContact) r8     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r9 = r8.wxId     // Catch: java.lang.Throwable -> L2ff
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L2ff
            if (r10 != 0) goto L2e8
            r12 = r9
            goto L2e9
        L2e8:
            r12 = r5
        L2e9:
            if (r12 == 0) goto L357
            java.lang.Object r9 = r7.get(r12)     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L2ff
            if (r9 == 0) goto L302
            boolean r10 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L2ff
            if (r10 != 0) goto L2fa
            goto L2fb
        L2fa:
            r9 = r5
        L2fb:
            if (r9 == 0) goto L302
        L2fd:
            r13 = r9
            goto L30e
        L2ff:
            r0 = move-exception
            goto L372
        L302:
            java.lang.String r9 = r8.displayName()     // Catch: java.lang.Throwable -> L2ff
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L2ff
            if (r10 != 0) goto L2fd
            r9 = r12
            goto L2fd
        L30e:
            java.lang.String r15 = r8.avatarUrl     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r9 = r8.avatarBackupUrl     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r10 = r8.remarkName     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r11 = r8.nickname     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r8 = r8.customWxId     // Catch: java.lang.Throwable -> L2ff
            java.lang.String[] r8 = new java.lang.String[]{r10, r11, r8}     // Catch: java.lang.Throwable -> L2ff
            java.util.List r8 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L2ff
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ff
            r10.<init>()     // Catch: java.lang.Throwable -> L2ff
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2ff
        L329:
            boolean r11 = r8.hasNext()     // Catch: java.lang.Throwable -> L2ff
            if (r11 == 0) goto L340
            java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> L2ff
            r14 = r11
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L2ff
            boolean r14 = og.m.t0(r14)     // Catch: java.lang.Throwable -> L2ff
            if (r14 != 0) goto L329
            r10.add(r11)     // Catch: java.lang.Throwable -> L2ff
            goto L329
        L340:
            java.util.Set r8 = tf.m.T1(r10)     // Catch: java.lang.Throwable -> L2ff
            java.util.List r19 = tf.m.P1(r8)     // Catch: java.lang.Throwable -> L2ff
            wb.s0 r11 = new wb.s0     // Catch: java.lang.Throwable -> L2ff
            r14 = 0
            r17 = 0
            r18 = 0
            r20 = 224(0xe0, float:3.14E-43)
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L2ff
            goto L358
        L357:
            r11 = r5
        L358:
            if (r11 == 0) goto L2d2
            r2.add(r11)     // Catch: java.lang.Throwable -> L2ff
            goto L2d2
        L35f:
            wb.e2 r0 = new wb.e2     // Catch: java.lang.Throwable -> L2ff
            r5 = 6
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2ff
            java.util.List r0 = tf.m.K1(r2, r0)     // Catch: java.lang.Throwable -> L2ff
            rb.g r2 = new rb.g     // Catch: java.lang.Throwable -> L2ff
            r2.<init>(r6, r3, r0)     // Catch: java.lang.Throwable -> L2ff
            r4.post(r2)     // Catch: java.lang.Throwable -> L2ff
            goto L37c
        L372:
            rb.g r2 = new rb.g
            r3 = 9
            r2.<init>(r6, r3, r0)
            r4.post(r2)
        L37c:
            return
        L37d:
            java.lang.Object r0 = r1.f528h
            sf.e r0 = (sf.e) r0
            java.lang.Object r2 = r1.f530j
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r1.f531k
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r1.f529i
            i0.a1 r4 = (i0.a1) r4
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r2.setValue(r5)
            java.lang.Object r0 = r0.f12419h
            java.lang.String r0 = (java.lang.String) r0
            wb.ho.h(r3, r4, r0)
            return
        L39a:
            java.lang.Object r0 = r1.f528h
            v8.h r0 = (v8.h) r0
            java.lang.Object r2 = r1.f530j
            v8.q r2 = (v8.q) r2
            java.lang.Object r3 = r1.f531k
            fg.a r3 = (fg.a) r3
            java.lang.Object r4 = r1.f529i
            fg.a r4 = (fg.a) r4
            boolean r5 = r0.f14260q
            if (r5 == 0) goto L3bd
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r2.f14278e
            java.lang.String r0 = r0.f14244a
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L3b9
            goto L3bd
        L3b9:
            r4.invoke()
            goto L3c2
        L3bd:
            if (r3 == 0) goto L3c2
            r3.invoke()
        L3c2:
            return
        L3c3:
            java.lang.Object r0 = r1.f528h
            ra.c r0 = (ra.c) r0
            java.lang.Object r2 = r1.f529i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f530j
            java.lang.Object r4 = r1.f531k
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f11838e
            na.k r5 = (na.k) r5
            java.util.Set r7 = r5.f9191p
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L40f
            java.util.Set r5 = r5.f9192q
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L3e6
            goto L40f
        L3e6:
            java.lang.Object r5 = r0.f11839f
            m8.c r5 = (m8.c) r5
            boolean r3 = r5.j(r3)
            if (r3 == 0) goto L401
            java.lang.String r3 = "redpacket_open_timeout:"
            java.lang.String r3 = wb.en.g(r3, r2)
            ra.a r4 = new ra.a
            r4.<init>(r0, r2, r6)
            r5 = 4500(0x1194, double:2.2233E-320)
            ra.c.t(r3, r5, r4)
            goto L40f
        L401:
            java.lang.String r3 = "拆红包重试发包失败"
            boolean r5 = r0.p(r4, r2, r3)
            if (r5 != 0) goto L40f
            r0.n(r3, r4)
            r0.d(r2)
        L40f:
            return
        L410:
            java.lang.Object r0 = r1.f528h
            r4 = r0
            qb.k r4 = (qb.k) r4
            java.lang.Object r0 = r1.f530j
            r8 = r0
            android.os.Handler r8 = (android.os.Handler) r8
            java.lang.Object r0 = r1.f531k
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r0 = r1.f529i
            r6 = r0
            qb.i r6 = (qb.i) r6
            java.util.List r0 = qb.k.v()     // Catch: java.lang.Throwable -> L435
            qb.f r2 = new qb.f     // Catch: java.lang.Throwable -> L435
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L435
            r2.<init>(r0, r9)     // Catch: java.lang.Throwable -> L435
            r4.f10851r = r2     // Catch: java.lang.Throwable -> L435
            r5 = r0
            goto L43c
        L435:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r5 = r2
        L43c:
            b9.c r2 = new b9.c
            r7 = 15
            r2.<init>(r3, r4, r5, r6, r7)
            r8.post(r2)
            return
        L447:
            java.lang.Object r0 = r1.f528h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f530j
            qb.k r2 = (qb.k) r2
            java.util.Set r3 = r2.f10845l
            java.lang.Object r4 = r1.f531k
            java.lang.Object r5 = r1.f529i
            qb.i r5 = (qb.i) r5
            boolean r6 = r0.isFinishing()
            if (r6 == 0) goto L461
            r3.remove(r0)
            goto L479
        L461:
            boolean r6 = r4 instanceof sf.f
            if (r6 != 0) goto L46b
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            r2.L(r0, r5, r6)
        L46b:
            java.lang.Throwable r2 = sf.g.b(r4)
            if (r2 == 0) goto L479
            r3.remove(r0)
            java.lang.String r2 = "联系人列表不可用"
            qb.k.N(r0, r2)
        L479:
            return
        L47a:
            java.lang.Object r0 = r1.f528h
            r2 = r0
            ob.n r2 = (ob.n) r2
            java.lang.Object r0 = r1.f530j
            ob.k r0 = (ob.k) r0
            java.lang.Object r3 = r1.f529i
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f531k
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "文字转语音发送失败"
            java.lang.String r6 = ".part"
            java.io.File r7 = r2.c(r0)
            java.util.concurrent.atomic.AtomicBoolean r8 = r2.f9743g
            r2.k(r3, r0, r7)     // Catch: java.lang.Throwable -> L4d7
            boolean r0 = r8.get()     // Catch: java.lang.Throwable -> L4d7
            if (r0 != 0) goto L4b7
            r7.delete()
            java.io.File r0 = new java.io.File
            java.io.File r2 = r7.getParentFile()
            java.lang.String r3 = r7.getName()
            java.lang.String r3 = bc.e.i(r3, r6)
            r0.<init>(r2, r3)
        L4b2:
            r0.delete()
            goto L53b
        L4b7:
            boolean r0 = r2.i()     // Catch: java.lang.Throwable -> L4d7
            if (r0 != 0) goto L4d9
            eb.m0 r0 = eb.m0.f2587a     // Catch: java.lang.Throwable -> L4d7
            eb.m0.k(r4, r3)     // Catch: java.lang.Throwable -> L4d7
            r7.delete()
            java.io.File r0 = new java.io.File
            java.io.File r2 = r7.getParentFile()
            java.lang.String r3 = r7.getName()
            java.lang.String r3 = bc.e.i(r3, r6)
            r0.<init>(r2, r3)
            goto L4b2
        L4d7:
            r0 = move-exception
            goto L50b
        L4d9:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L4d7
            if (r0 == 0) goto L503
            j8.y r0 = r0.f6816b     // Catch: java.lang.Throwable -> L4d7
            if (r0 == 0) goto L503
            java.lang.String r9 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L4d7
            boolean r0 = r0.t(r4, r9)     // Catch: java.lang.Throwable -> L4d7
            r9 = 1
            if (r0 != r9) goto L503
            r7.delete()
            java.io.File r0 = new java.io.File
            java.io.File r2 = r7.getParentFile()
            java.lang.String r3 = r7.getName()
            java.lang.String r3 = bc.e.i(r3, r6)
            r0.<init>(r2, r3)
            goto L4b2
        L503:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4d7
            java.lang.String r9 = "微信语音发送失败"
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L4d7
            throw r0     // Catch: java.lang.Throwable -> L4d7
        L50b:
            boolean r8 = r8.get()     // Catch: java.lang.Throwable -> L523
            if (r8 == 0) goto L525
            ia.t r8 = r2.f9738b     // Catch: java.lang.Throwable -> L523
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L523
            eb.m0 r8 = eb.m0.f2587a     // Catch: java.lang.Throwable -> L523
            eb.m0.k(r4, r3)     // Catch: java.lang.Throwable -> L523
            java.lang.String r0 = ob.n.m(r5, r0)     // Catch: java.lang.Throwable -> L523
            r2.l(r0)     // Catch: java.lang.Throwable -> L523
            goto L525
        L523:
            r0 = move-exception
            goto L53c
        L525:
            r7.delete()
            java.io.File r0 = new java.io.File
            java.io.File r2 = r7.getParentFile()
            java.lang.String r3 = r7.getName()
            java.lang.String r3 = bc.e.i(r3, r6)
            r0.<init>(r2, r3)
            goto L4b2
        L53b:
            return
        L53c:
            r7.delete()
            java.io.File r2 = new java.io.File
            java.io.File r3 = r7.getParentFile()
            java.lang.String r4 = r7.getName()
            java.lang.String r4 = bc.e.i(r4, r6)
            r2.<init>(r3, r4)
            r2.delete()
            throw r0
        L554:
            java.lang.Object r0 = r1.f529i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.f528h
            o8.j r2 = (o8.j) r2
            java.lang.Object r3 = r1.f530j
            gg.u r3 = (gg.u) r3
            java.lang.Object r4 = r1.f531k
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            if (r0 == 0) goto L578
            java.util.concurrent.ConcurrentHashMap r6 = r2.f9604c
            java.lang.Object r3 = r3.f4564g
            if (r3 == 0) goto L572
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r6.remove(r0, r3)
            goto L578
        L572:
            java.lang.String r0 = "wrapped"
            gg.l.g(r0)
            throw r5
        L578:
            r2.g(r4)
            return
        L57c:
            m9.c r0 = m9.c.f8791i
            java.lang.Object r2 = r1.f528h
            r7 = r2
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object r2 = r1.f530j
            m9.e r2 = (m9.e) r2
            java.lang.Object r8 = r1.f531k
            r14 = r8
            m9.d r14 = (m9.d) r14
            java.lang.Object r8 = r1.f529i
            m9.c r8 = (m9.c) r8
            boolean r9 = r7.isFinishing()
            if (r9 != 0) goto L5f6
            boolean r9 = r7.isDestroyed()
            if (r9 == 0) goto L59d
            goto L5f6
        L59d:
            r2.getClass()
            if (r8 != r0) goto L5a5
            java.util.List r9 = m9.e.f8800j
            goto L5a7
        L5a5:
            java.util.List r9 = m9.e.f8799i
        L5a7:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = tf.n.e1(r9)
            r10.<init>(r11)
            java.util.Iterator r9 = r9.iterator()
        L5b4:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L5cb
            java.lang.Object r11 = r9.next()
            m9.b r11 = (m9.b) r11
            java.lang.String r11 = r11.f8786b
            sf.e r12 = new sf.e
            r12.<init>(r11, r4)
            r10.add(r12)
            goto L5b4
        L5cb:
            if (r8 != r0) goto L5d0
            java.lang.String r0 = "选择骰子点数"
            goto L5d2
        L5d0:
            java.lang.String r0 = "选择猜拳结果"
        L5d2:
            b0.s r11 = new b0.s
            r4 = 11
            r11.<init>(r2, r8, r14, r4)
            i.e0 r12 = new i.e0
            r12.<init>(r2, r3)
            wb.lv r13 = wb.lv.f17583j
            java.lang.String r9 = ""
            r8 = r0
            wb.kv r0 = wb.y2.Q1(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r0.a()
            if (r0 != 0) goto L5fe
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f8807e
            r0.set(r6)
            r2.c(r14, r5)
            goto L5fe
        L5f6:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f8807e
            r0.set(r6)
            r2.c(r14, r5)
        L5fe:
            return
        L5ff:
            java.lang.Object r0 = r1.f528h
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            java.lang.Object r2 = r1.f530j
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.Object r4 = r1.f531k
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r5 = r1.f529i
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            java.lang.ref.WeakReference r7 = k9.r.f7538i
            java.lang.Object r7 = r7.get()
            if (r7 != r0) goto L663
            android.view.ViewParent r7 = r0.getParent()
            if (r7 != r2) goto L663
            android.view.ViewPropertyAnimator r2 = r0.animate()
            r2.cancel()
            r2 = 0
            r0.setAlpha(r2)
            r7 = 1063339950(0x3f6147ae, float:0.88)
            r0.setScaleX(r7)
            r0.setScaleY(r7)
            k9.r r7 = k9.r.f7530a
            int r3 = k9.r.f(r4, r3)
            float r3 = (float) r3
            r0.setTranslationY(r3)
            r0.setVisibility(r6)
            r0.bringToFront()
            r5.bringToFront()
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r3)
            android.view.ViewPropertyAnimator r0 = r0.scaleX(r3)
            android.view.ViewPropertyAnimator r0 = r0.scaleY(r3)
            android.view.ViewPropertyAnimator r0 = r0.translationY(r2)
            r2 = 180(0xb4, double:8.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            r0.start()
        L663:
            return
        L664:
            java.lang.Object r0 = r1.f529i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.f528h
            k8.f r2 = (k8.f) r2
            java.lang.Object r3 = r1.f530j
            f8.c r3 = (f8.c) r3
            java.lang.Object r4 = r1.f531k
            f8.g r4 = (f8.g) r4
            java.util.concurrent.ConcurrentHashMap r5 = k8.g.f7416t
            java.lang.Object r7 = r5.get(r0)
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            if (r7 != 0) goto L67f
            goto L68c
        L67f:
            boolean r6 = r7.remove(r2)
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L68c
            r5.remove(r0, r7)
        L68c:
            if (r6 != 0) goto L68f
            goto L692
        L68f:
            r3.b(r4)     // Catch: java.lang.Throwable -> L692
        L692:
            return
        L693:
            java.lang.Object r0 = r1.f528h
            r2 = r0
            j8.y r2 = (j8.y) r2
            java.lang.Object r0 = r1.f530j
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r3 = r1.f531k
            j8.w r3 = (j8.w) r3
            java.lang.Object r4 = r1.f529i
            java.util.concurrent.CountDownLatch r4 = (java.util.concurrent.CountDownLatch) r4
            java.lang.String r5 = "语音主线程任务执行异常: "
            boolean r3 = r3.run()     // Catch: java.lang.Throwable -> L6b5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L6b5
            r0.set(r3)     // Catch: java.lang.Throwable -> L6b5
        L6b1:
            r4.countDown()
            goto L6ca
        L6b5:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6cb
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6cb
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L6cb
            r3.append(r0)     // Catch: java.lang.Throwable -> L6cb
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L6cb
            r2.m(r0)     // Catch: java.lang.Throwable -> L6cb
            goto L6b1
        L6ca:
            return
        L6cb:
            r0 = move-exception
            r4.countDown()
            throw r0
        L6d0:
            java.lang.Object r0 = r1.f528h
            j8.h r0 = (j8.h) r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r0.f6798l
            java.lang.Object r3 = r1.f529i
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f530j
            java.lang.Object r5 = r1.f531k
            java.lang.String r5 = (java.lang.String) r5
        L6e0:
            r7 = 120(0x78, float:1.68E-43)
            if (r6 >= r7) goto L704
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r7)     // Catch: java.lang.Throwable -> L6fb
            j8.c r7 = r0.y(r4)     // Catch: java.lang.Throwable -> L6fb
            if (r7 == 0) goto L701
            boolean r0 = r0.B(r5, r7)     // Catch: java.lang.Throwable -> L6fb
            if (r0 != 0) goto L6fd
            java.lang.String r0 = "发送收藏语音失败: 下载完成后语音发送未成功"
            i8.i.f(r0)     // Catch: java.lang.Throwable -> L6fb
            goto L6fd
        L6fb:
            r0 = move-exception
            goto L70b
        L6fd:
            r2.remove(r3)
            goto L70a
        L701:
            int r6 = r6 + 1
            goto L6e0
        L704:
            java.lang.String r0 = "发送收藏语音失败: 等待收藏语音下载超时"
            i8.i.f(r0)     // Catch: java.lang.Throwable -> L6fb
            goto L6fd
        L70a:
            return
        L70b:
            r2.remove(r3)
            throw r0
        L70f:
            java.lang.Object r0 = r1.f528h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f530j
            ia.a0 r2 = (ia.a0) r2
            java.lang.Object r3 = r1.f531k
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r4 = r1.f529i
            android.view.View r4 = (android.view.View) r4
            boolean r5 = r0.isFinishing()
            if (r5 != 0) goto L752
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L72c
            goto L752
        L72c:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L749
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            boolean r5 = r2.l(r0)
            if (r5 == 0) goto L73a
            goto L74c
        L73a:
            boolean r5 = r3 instanceof android.widget.AbsListView
            if (r5 == 0) goto L744
            android.widget.AbsListView r3 = (android.widget.AbsListView) r3
            r3.invalidateViews()
            goto L74c
        L744:
            android.view.ViewParent r3 = r0.getParent()
            goto L72c
        L749:
            r2.k(r4)
        L74c:
            r4.requestLayout()
            r4.invalidate()
        L752:
            return
        L753:
            java.lang.Object r0 = r1.f528h
            wb.kv r0 = (wb.kv) r0
            java.lang.Object r3 = r1.f530j
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r1.f531k
            c9.u r4 = (c9.u) r4
            java.lang.Object r5 = r1.f529i
            java.util.List r5 = (java.util.List) r5
            r0.close()
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L77a
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L77a
            ac.l r6 = new ac.l
            r6.<init>(r3, r4, r5, r2)
            r0.postOnAnimation(r6)
        L77a:
            return
        L77b:
            java.lang.Object r0 = r1.f528h
            hb.k r0 = (hb.k) r0
            java.lang.Object r2 = r1.f530j
            java.lang.Object r3 = r1.f531k
            hb.j r3 = (hb.j) r3
            java.lang.Object r4 = r1.f529i
            hb.i r4 = (hb.i) r4
            java.lang.Object r7 = r0.f5425h
            if (r7 != r2) goto L7a9
            ab.b r2 = r0.f5419b
            hb.t r3 = r3.f5409a
            int r3 = r3.f5465b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "微信原生群发助手等待发送完成超时: type="
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r2.invoke(r3, r5)
            r0.f5425h = r5
            r0.a(r4, r6)
        L7a9:
            return
        L7aa:
            java.lang.Object r0 = r1.f528h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f529i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f530j
            java.lang.Object r5 = r1.f531k
            android.content.Context r5 = (android.content.Context) r5
            boolean r6 = r0.isFinishing()
            if (r6 != 0) goto L7d3
            boolean r6 = r0.isDestroyed()
            if (r6 != 0) goto L7d3
            c9.j1 r6 = c9.j1.f1228a
            if (r2 != 0) goto L7c9
            goto L7ca
        L7c9:
            r4 = r2
        L7ca:
            ab.e r2 = new ab.e
            r6 = 4
            r2.<init>(r0, r3, r5, r6)
            c9.j1.v(r0, r4, r2)
        L7d3:
            return
        L7d4:
            java.lang.Object r0 = r1.f528h
            wb.kv r0 = (wb.kv) r0
            java.lang.Object r2 = r1.f530j
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r1.f531k
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r1.f529i
            c9.y r4 = (c9.y) r4
            r0.close()
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L7f6
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L7f6
            r3.invoke(r4)
        L7f6:
            return
        L7f7:
            java.lang.Object r0 = r1.f528h
            bb.k r0 = (bb.k) r0
            java.lang.Object r2 = r1.f529i
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f530j
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f531k
            java.lang.String r4 = (java.lang.String) r4
            java.util.concurrent.ConcurrentHashMap r5 = r0.f684j
            r5.remove(r2)
            bb.l r2 = r0.f675a
            boolean r2 = r2.e(r3)
            if (r2 != 0) goto L817
            r0.c(r4, r3)
        L817:
            return
        L818:
            java.lang.Object r0 = r1.f530j
            bb.g r0 = (bb.g) r0
            java.lang.Object r2 = r1.f528h
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r3 = r1.f529i
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.f531k
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map r5 = r0.f657g
            java.lang.Object r5 = r5.get(r2)
            boolean r5 = gg.l.a(r5, r3)
            if (r5 == 0) goto L846
            r0.c(r2, r3, r4)
            ib.b r3 = r0.f653c
            android.content.SharedPreferences r3 = r3.f6650a
            java.lang.String r4 = "enable"
            boolean r3 = r3.getBoolean(r4, r6)
            if (r3 == 0) goto L846
            r0.b(r2)
        L846:
            return
        L847:
            java.lang.Object r0 = r1.f528h
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r2 = r1.f530j
            b9.f r2 = (b9.f) r2
            java.lang.Object r3 = r1.f531k
            b9.d r3 = (b9.d) r3
            java.lang.Object r4 = r1.f529i
            java.lang.String r4 = (java.lang.String) r4
            android.view.ViewParent r5 = r0.getParent()
            if (r5 == 0) goto L863
            r3.getClass()
            r2.a(r0, r3, r4)
        L863:
            return
    }
}
