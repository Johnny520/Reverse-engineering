package r8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11601j;

    public /* synthetic */ b(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f11598g = r4
            r0.f11600i = r1
            r0.f11599h = r2
            r0.f11601j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ b(r9.d0 r2, android.widget.TextView r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.f11598g = r0
            r1.<init>()
            r1.f11600i = r2
            r1.f11601j = r3
            r1.f11599h = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r20 = this;
            r1 = r20
            int r0 = r1.f11598g
            r2 = 0
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L4ae;
                case 1: goto L493;
                case 2: goto L44d;
                case 3: goto L412;
                case 4: goto L1e8;
                case 5: goto L1d3;
                case 6: goto L1b8;
                case 7: goto L104;
                case 8: goto Lb2;
                case 9: goto L7a;
                case 10: goto L4f;
                case 11: goto L21;
                default: goto La;
            }
        La:
            java.lang.Object r0 = r1.f11600i
            xa.m r0 = (xa.m) r0
            java.lang.Object r2 = r1.f11599h
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r4 = r1.f11601j
            xa.h r4 = (xa.h) r4
            xa.i r5 = new xa.i
            java.lang.String r4 = r4.f21435b
            r5.<init>(r2, r4, r3)
            r0.i(r5)
            return
        L21:
            java.lang.Object r0 = r1.f11600i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f11599h
            x8.r r2 = (x8.r) r2
            java.lang.Object r3 = r1.f11601j
            k8.o r3 = (k8.o) r3
            java.util.concurrent.ExecutorService r4 = x8.q.f21329a
            x8.q.p(r0, r2, r3)     // Catch: java.lang.Throwable -> L38
            x8.q.o(r0, r2, r3)     // Catch: java.lang.Throwable -> L38
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L3f:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L4e
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:AutoReply] 处理消息失败: "
            eh.a.x(r3, r2, r0)
        L4e:
            return
        L4f:
            java.lang.Object r0 = r1.f11600i
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r3 = r1.f11599h
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            java.lang.Object r4 = r1.f11601j
            gg.u r4 = (gg.u) r4
            boolean r0 = r0.get()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r3.get()
            x8.n r0 = (x8.n) r0
            if (r0 == 0) goto L79
            java.lang.Object r3 = r4.f4564g
            if (r3 == 0) goto L73
            x8.m r3 = (x8.m) r3
            r0.b(r3)
            goto L79
        L73:
            java.lang.String r0 = "socketRequest"
            gg.l.g(r0)
            throw r2
        L79:
            return
        L7a:
            java.lang.Object r0 = r1.f11600i
            java.io.Serializable r0 = (java.io.Serializable) r0
            java.lang.Object r2 = r1.f11599h
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r5 = r1.f11601j
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.setValue(r6)
            boolean r2 = r0 instanceof sf.f
            if (r2 != 0) goto L9b
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = "连接成功"
            android.widget.Toast r2 = android.widget.Toast.makeText(r5, r2, r4)
            r2.show()
        L9b:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto Lb1
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto La8
            goto Laa
        La8:
            java.lang.String r0 = "连接失败"
        Laa:
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r3)
            r0.show()
        Lb1:
            return
        Lb2:
            java.lang.Object r0 = r1.f11600i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r1.f11599h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r4 = r1.f11601j
            i0.a1 r4 = (i0.a1) r4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Ld4
        Lc2:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> Ld4
            if (r5 == 0) goto Ld6
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> Ld4
            fb.d1 r5 = (fb.d1) r5     // Catch: java.lang.Throwable -> Ld4
            fb.g1 r6 = fb.g1.f3523a     // Catch: java.lang.Throwable -> Ld4
            fb.g1.n(r2, r5)     // Catch: java.lang.Throwable -> Ld4
            goto Lc2
        Ld4:
            r0 = move-exception
            goto Ld9
        Ld6:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Ld4
            goto Ldf
        Ld9:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Ldf:
            boolean r2 = r0 instanceof sf.f
            if (r2 != 0) goto Lf8
            r2 = r0
            sf.n r2 = (sf.n) r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r2.<init>(r5)
            wb.uk r5 = new wb.uk
            r5.<init>(r4, r3)
            r2.post(r5)
        Lf8:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L103
            java.lang.String r2 = "[Hchat:ScriptAgent] 保存历史会话排序失败"
            fb.v0.n(r2, r0)
        L103:
            return
        L104:
            java.lang.Object r0 = r1.f11600i
            fb.v r0 = (fb.v) r0
            java.lang.Object r5 = r1.f11599h
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r1.f11601j
            android.content.Context r6 = (android.content.Context) r6
            java.util.Set r7 = fb.u.f3810a
            java.lang.String r7 = r0.f3826d
            java.lang.String r8 = r0.f3823a     // Catch: java.lang.Throwable -> L17d
            boolean r8 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L17d
            if (r8 != 0) goto L187
            boolean r8 = og.m.t0(r7)     // Catch: java.lang.Throwable -> L17d
            if (r8 != 0) goto L17f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17d
            r8.<init>()     // Catch: java.lang.Throwable -> L17d
            java.lang.String r9 = "model"
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> L17d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L17d
            r8.put(r9, r7)     // Catch: java.lang.Throwable -> L17d
            java.lang.String r7 = "stream"
            r8.put(r7, r4)     // Catch: java.lang.Throwable -> L17d
            java.lang.String r7 = "messages"
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L17d
            r9.<init>()     // Catch: java.lang.Throwable -> L17d
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17d
            r10.<init>()     // Catch: java.lang.Throwable -> L17d
            java.lang.String r11 = "role"
            java.lang.String r12 = "user"
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L17d
            java.lang.String r11 = "content"
            java.lang.String r12 = "只回复 OK"
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L17d
            r9.put(r10)     // Catch: java.lang.Throwable -> L17d
            r8.put(r7, r9)     // Catch: java.lang.Throwable -> L17d
            java.lang.String r7 = fb.u.i0(r0)     // Catch: java.lang.Throwable -> L17d
            java.util.concurrent.ConcurrentHashMap$KeySetView r9 = fb.u.f3811b     // Catch: java.lang.Throwable -> L17d
            boolean r10 = r9.contains(r7)     // Catch: java.lang.Throwable -> L17d
            r3 = r3 ^ r10
            java.lang.String r2 = fb.u.w(r0, r8, r2, r3)     // Catch: fb.n -> L169 java.lang.Throwable -> L17d
            goto L170
        L169:
            java.lang.String r2 = fb.u.w(r0, r8, r2, r4)     // Catch: java.lang.Throwable -> L17d
            r9.add(r7)     // Catch: java.lang.Throwable -> L17d
        L170:
            java.lang.String r0 = fb.u.x(r0, r2)     // Catch: java.lang.Throwable -> L17d
            boolean r2 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L17d
            if (r2 == 0) goto L195
            java.lang.String r0 = "连接成功"
            goto L195
        L17d:
            r0 = move-exception
            goto L18f
        L17f:
            java.lang.String r0 = "请填写模型"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17d
            throw r2     // Catch: java.lang.Throwable -> L17d
        L187:
            java.lang.String r0 = "请填写 API 地址"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L17d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17d
            throw r2     // Catch: java.lang.Throwable -> L17d
        L18f:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L195:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto L1a4
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = "[Hchat:ScriptAgent] 测试连接失败: "
            eh.a.x(r4, r3, r2)
        L1a4:
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r8.b r3 = new r8.b
            r4 = 9
            r3.<init>(r0, r5, r6, r4)
            r2.post(r3)
            return
        L1b8:
            java.lang.Object r0 = r1.f11600i
            wb.au r0 = (wb.au) r0
            java.lang.Object r3 = r1.f11599h
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r1.f11601j
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r3.getValue()
            wb.au r6 = (wb.au) r6
            if (r6 != r0) goto L1d2
            r3.setValue(r2)
            wb.y2.S0(r5, r4)
        L1d2:
            return
        L1d3:
            java.lang.Object r0 = r1.f11600i
            wb.la r0 = (wb.la) r0
            java.lang.Object r3 = r1.f11599h
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.f11601j
            java.util.List r4 = (java.util.List) r4
            wb.j5 r5 = new wb.j5
            r5.<init>(r3, r4)
            r0.invoke(r5, r2)
            return
        L1e8:
            wb.l5 r5 = wb.l5.f17390i
            wb.l5 r6 = wb.l5.f17389h
            wb.l5 r7 = wb.l5.f17388g
            java.lang.Object r0 = r1.f11600i
            r8 = r0
            g8.i r8 = (g8.i) r8
            java.lang.Object r0 = r1.f11599h
            r9 = r0
            android.os.Handler r9 = (android.os.Handler) r9
            java.lang.Object r0 = r1.f11601j
            r10 = r0
            wb.la r10 = (wb.la) r10
            tf.t r11 = tf.t.f13167g
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L257
            r12.<init>()     // Catch: java.lang.Throwable -> L257
            java.util.ArrayList r0 = r8.p()     // Catch: java.lang.Throwable -> L209
            goto L210
        L209:
            r0 = move-exception
            sf.f r13 = new sf.f     // Catch: java.lang.Throwable -> L257
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L257
            r0 = r13
        L210:
            boolean r13 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L257
            if (r13 == 0) goto L216
            r0 = r11
        L216:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L257
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L257
            r13.<init>()     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Throwable -> L257
        L221:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r0 == 0) goto L311
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L257
            h.Hchat.hooks.api.model.ContactLabelBean r0 = (h.Hchat.hooks.api.model.ContactLabelBean) r0     // Catch: java.lang.Throwable -> L257
            java.lang.String r15 = r0.labelId     // Catch: java.lang.Throwable -> L257
            java.lang.CharSequence r15 = og.m.R0(r15)     // Catch: java.lang.Throwable -> L257
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L257
            java.lang.String r2 = r0.labelName     // Catch: java.lang.Throwable -> L257
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L257
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L257
            boolean r16 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L257
            if (r16 == 0) goto L248
            r2 = r15
        L248:
            boolean r16 = og.m.t0(r15)     // Catch: java.lang.Throwable -> L257
            if (r16 == 0) goto L25a
            boolean r16 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L257
            if (r16 == 0) goto L25a
            r3 = 0
            goto L307
        L257:
            r0 = move-exception
            goto L407
        L25a:
            java.util.List<java.lang.String> r0 = r0.userNameList     // Catch: java.lang.Throwable -> L257
            boolean r16 = r0.isEmpty()     // Catch: java.lang.Throwable -> L257
            if (r16 == 0) goto L27e
            boolean r0 = og.m.t0(r15)     // Catch: java.lang.Throwable -> L257
            if (r0 == 0) goto L26a
            r0 = r11
            goto L27e
        L26a:
            java.util.ArrayList r0 = r8.o(r15)     // Catch: java.lang.Throwable -> L26f
            goto L276
        L26f:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L257
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L257
            r0 = r3
        L276:
            boolean r3 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L257
            if (r3 == 0) goto L27c
            r0 = r11
        L27c:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L257
        L27e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L257
            int r4 = tf.n.e1(r0)     // Catch: java.lang.Throwable -> L257
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L257
        L28b:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r4 == 0) goto L2a3
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L257
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L257
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L257
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L257
            r3.add(r4)     // Catch: java.lang.Throwable -> L257
            goto L28b
        L2a3:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L257
            r0.<init>()     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L257
        L2ac:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r4 == 0) goto L2c4
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L257
            r18 = r4
            java.lang.String r18 = (java.lang.String) r18     // Catch: java.lang.Throwable -> L257
            int r18 = r18.length()     // Catch: java.lang.Throwable -> L257
            if (r18 <= 0) goto L2ac
            r0.add(r4)     // Catch: java.lang.Throwable -> L257
            goto L2ac
        L2c4:
            java.util.Set r0 = tf.m.T1(r0)     // Catch: java.lang.Throwable -> L257
            java.util.List r0 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L257
        L2d0:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r4 == 0) goto L2fb
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L257
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L257
            java.lang.Object r18 = r12.get(r4)     // Catch: java.lang.Throwable -> L257
            if (r18 != 0) goto L2ef
            r19 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L257
            r3.<init>()     // Catch: java.lang.Throwable -> L257
            r12.put(r4, r3)     // Catch: java.lang.Throwable -> L257
            r18 = r3
            goto L2f1
        L2ef:
            r19 = r3
        L2f1:
            r3 = r18
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L257
            r3.add(r2)     // Catch: java.lang.Throwable -> L257
            r3 = r19
            goto L2d0
        L2fb:
            boolean r3 = og.m.t0(r15)     // Catch: java.lang.Throwable -> L257
            if (r3 == 0) goto L302
            r15 = r2
        L302:
            wb.t5 r3 = new wb.t5     // Catch: java.lang.Throwable -> L257
            r3.<init>(r15, r2, r0)     // Catch: java.lang.Throwable -> L257
        L307:
            if (r3 == 0) goto L30c
            r13.add(r3)     // Catch: java.lang.Throwable -> L257
        L30c:
            r2 = 0
            r3 = 1
            r4 = 0
            goto L221
        L311:
            wb.e2 r0 = new wb.e2     // Catch: java.lang.Throwable -> L257
            r2 = 8
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L257
            java.util.List r0 = tf.m.K1(r13, r0)     // Catch: java.lang.Throwable -> L257
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L257
            r3.<init>()     // Catch: java.lang.Throwable -> L257
            java.util.ArrayList r4 = r8.y()     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L257
        L329:
            boolean r11 = r4.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r11 == 0) goto L33a
            java.lang.Object r11 = r4.next()     // Catch: java.lang.Throwable -> L257
            h.Hchat.hooks.api.model.WeChatContact r11 = (h.Hchat.hooks.api.model.WeChatContact) r11     // Catch: java.lang.Throwable -> L257
            r13 = 0
            wb.ho.f6(r3, r12, r11, r7, r13)     // Catch: java.lang.Throwable -> L257
            goto L329
        L33a:
            java.util.ArrayList r4 = r8.x()     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L257
        L342:
            boolean r11 = r4.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r11 == 0) goto L353
            java.lang.Object r11 = r4.next()     // Catch: java.lang.Throwable -> L257
            h.Hchat.hooks.api.model.WeChatContact r11 = (h.Hchat.hooks.api.model.WeChatContact) r11     // Catch: java.lang.Throwable -> L257
            r13 = 1
            wb.ho.f6(r3, r12, r11, r6, r13)     // Catch: java.lang.Throwable -> L257
            goto L342
        L353:
            java.lang.String r4 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"
            r11 = 0
            java.util.ArrayList r4 = r8.U(r4, r11)     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L257
        L35e:
            boolean r11 = r4.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r11 == 0) goto L36f
            java.lang.Object r11 = r4.next()     // Catch: java.lang.Throwable -> L257
            h.Hchat.hooks.api.model.WeChatContact r11 = (h.Hchat.hooks.api.model.WeChatContact) r11     // Catch: java.lang.Throwable -> L257
            r13 = 0
            wb.ho.f6(r3, r12, r11, r5, r13)     // Catch: java.lang.Throwable -> L257
            goto L35e
        L36f:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L257
            r4.<init>()     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> L257
        L378:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r13 == 0) goto L38a
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Throwable -> L257
            wb.t5 r13 = (wb.t5) r13     // Catch: java.lang.Throwable -> L257
            java.util.List r13 = r13.f19172c     // Catch: java.lang.Throwable -> L257
            tf.r.h1(r4, r13)     // Catch: java.lang.Throwable -> L257
            goto L378
        L38a:
            java.util.Set r4 = tf.m.T1(r4)     // Catch: java.lang.Throwable -> L257
            java.util.List r4 = tf.m.P1(r4)     // Catch: java.lang.Throwable -> L257
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L257
            r11.<init>()     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L257
        L39b:
            boolean r13 = r4.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r13 == 0) goto L3b2
            java.lang.Object r13 = r4.next()     // Catch: java.lang.Throwable -> L257
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L257
            boolean r14 = r3.containsKey(r14)     // Catch: java.lang.Throwable -> L257
            if (r14 != 0) goto L39b
            r11.add(r13)     // Catch: java.lang.Throwable -> L257
            goto L39b
        L3b2:
            boolean r4 = r11.isEmpty()     // Catch: java.lang.Throwable -> L257
            if (r4 != 0) goto L3e5
            java.util.ArrayList r4 = r8.q(r11)     // Catch: java.lang.Throwable -> L257
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L257
        L3c0:
            boolean r8 = r4.hasNext()     // Catch: java.lang.Throwable -> L257
            if (r8 == 0) goto L3e5
            java.lang.Object r8 = r4.next()     // Catch: java.lang.Throwable -> L257
            h.Hchat.hooks.api.model.WeChatContact r8 = (h.Hchat.hooks.api.model.WeChatContact) r8     // Catch: java.lang.Throwable -> L257
            boolean r11 = r8.isGroup()     // Catch: java.lang.Throwable -> L257
            if (r11 == 0) goto L3d4
            r11 = r6
            goto L3dd
        L3d4:
            boolean r11 = r8.isOfficialAccount()     // Catch: java.lang.Throwable -> L257
            if (r11 == 0) goto L3dc
            r11 = r5
            goto L3dd
        L3dc:
            r11 = r7
        L3dd:
            boolean r13 = r8.isGroup()     // Catch: java.lang.Throwable -> L257
            wb.ho.f6(r3, r12, r8, r11, r13)     // Catch: java.lang.Throwable -> L257
            goto L3c0
        L3e5:
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L257
            r3.getClass()     // Catch: java.lang.Throwable -> L257
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L257
            wb.e2 r4 = new wb.e2     // Catch: java.lang.Throwable -> L257
            r5 = 7
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L257
            wb.kn r5 = new wb.kn     // Catch: java.lang.Throwable -> L257
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L257
            java.util.List r2 = tf.m.K1(r3, r5)     // Catch: java.lang.Throwable -> L257
            r8.b r3 = new r8.b     // Catch: java.lang.Throwable -> L257
            r4 = 5
            r3.<init>(r10, r2, r0, r4)     // Catch: java.lang.Throwable -> L257
            r9.post(r3)     // Catch: java.lang.Throwable -> L257
            goto L411
        L407:
            rb.g r2 = new rb.g
            r3 = 10
            r2.<init>(r10, r3, r0)
            r9.post(r2)
        L411:
            return
        L412:
            java.lang.Object r0 = r1.f11600i
            ra.c r0 = (ra.c) r0
            java.lang.Object r2 = r1.f11599h
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f11601j
            java.lang.String r3 = (java.lang.String) r3
            sa.b r4 = new sa.b
            r13 = 0
            r4.<init>(r13, r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L42e
            r0.o(r4)
            goto L44c
        L42e:
            boolean r2 = r0.f11834a
            if (r2 == 0) goto L442
            java.lang.Object r2 = r0.f11843j
            android.speech.tts.TextToSpeech r2 = (android.speech.tts.TextToSpeech) r2
            if (r2 == 0) goto L442
            boolean r2 = r0.v(r4)
            if (r2 != 0) goto L44c
            r0.s(r4)
            goto L44c
        L442:
            java.lang.Object r2 = r0.f11840g
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            r2.offer(r4)
            r0.f()
        L44c:
            return
        L44d:
            java.lang.Object r0 = r1.f11600i
            r2 = r0
            r9.d0 r2 = (r9.d0) r2
            java.lang.Object r0 = r1.f11599h
            r9.y r0 = (r9.y) r0
            java.lang.Object r3 = r1.f11601j
            r5 = r3
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.util.WeakHashMap r3 = r2.f11674v
            monitor-enter(r3)
            java.util.WeakHashMap r4 = r2.f11674v     // Catch: java.lang.Throwable -> L490
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L490
            r9.y r4 = (r9.y) r4     // Catch: java.lang.Throwable -> L490
            monitor-exit(r3)
            if (r4 == r0) goto L46a
            goto L48f
        L46a:
            android.view.ViewParent r3 = r5.getParent()
            if (r3 == 0) goto L48f
            java.lang.Object r3 = r5.getTag()
            java.lang.String r4 = "hchat_message_details_view"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L48f
            java.lang.Object r3 = r0.f11813d
            r11 = 0
            r13 = 0
            r9.f0 r8 = r2.X(r3, r11, r13)
            android.view.View r3 = r0.f11810a
            android.widget.TextView r4 = r0.f11811b
            java.lang.Object r6 = r0.f11812c
            java.lang.Object r7 = r0.f11813d
            r2.E(r3, r4, r5, r6, r7, r8)
        L48f:
            return
        L490:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L493:
            java.lang.Object r0 = r1.f11600i
            r9.d0 r0 = (r9.d0) r0
            java.lang.Object r2 = r1.f11601j
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r3 = r1.f11599h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "red_packet_details_enable"
            android.content.SharedPreferences r0 = r0.f11655c
            r13 = 0
            boolean r0 = r0.getBoolean(r4, r13)
            if (r0 == 0) goto L4ad
            r2.setText(r3)
        L4ad:
            return
        L4ae:
            java.lang.Object r0 = r1.f11600i
            r2 = r0
            r8.d r2 = (r8.d) r2
            java.lang.Object r0 = r1.f11599h
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r1.f11601j
            fg.a r0 = (fg.a) r0
            java.lang.String r4 = "[Hchat:DexInstall] "
            java.lang.Object r5 = r8.e.f11618d     // Catch: java.lang.Throwable -> L4e0
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4e0
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L4e2
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4e2
            r0.getClass()     // Catch: java.lang.Throwable -> L4e2
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e0
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4e0
            if (r0 == 0) goto L4d7
            java.util.concurrent.atomic.AtomicBoolean r4 = r2.f11611e
            r13 = 1
            r4.set(r13)
        L4d7:
            java.util.concurrent.atomic.AtomicBoolean r4 = r2.f11612f
            r13 = 0
            r4.set(r13)
            r17 = r0
            goto L50a
        L4e0:
            r0 = move-exception
            goto L4e5
        L4e2:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e0
            throw r0     // Catch: java.lang.Throwable -> L4e0
        L4e5:
            java.lang.String r5 = r2.f11607a     // Catch: java.lang.Throwable -> L56a
            java.lang.String r6 = r0.getMessage()     // Catch: java.lang.Throwable -> L56a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56a
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L56a
            r7.append(r5)     // Catch: java.lang.Throwable -> L56a
            java.lang.String r4 = " 安装异常: "
            r7.append(r4)     // Catch: java.lang.Throwable -> L56a
            r7.append(r6)     // Catch: java.lang.Throwable -> L56a
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L56a
            fb.v0.n(r4, r0)     // Catch: java.lang.Throwable -> L56a
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f11612f
            r13 = 0
            r0.set(r13)
            r17 = r13
        L50a:
            if (r17 != 0) goto L569
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f11611e
            boolean r0 = r0.get()
            if (r0 == 0) goto L515
            goto L569
        L515:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f11613g
            r4 = 1
            boolean r0 = r0.compareAndSet(r13, r4)
            if (r0 != 0) goto L51f
            goto L569
        L51f:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f11614h
            int r0 = r0.getAndIncrement()
            r4 = 6
            if (r0 < r4) goto L546
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f11613g
            r0.set(r13)
            java.lang.String r0 = r2.f11607a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:DexInstall] "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " 多次安装失败，停止本轮重试"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            fb.v0.m(r0)
            goto L569
        L546:
            android.os.Handler r4 = r8.e.f11615a
            a1.d r5 = new a1.d
            r6 = 28
            r5.<init>(r2, r6, r3)
            if (r0 > 0) goto L554
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L566
        L554:
            r2 = 3000(0xbb8, double:1.482E-320)
            r13 = 1
            if (r0 != r13) goto L55a
            goto L566
        L55a:
            r6 = 1
            int r0 = r0 - r13
            long r6 = r6 << r0
            long r6 = r6 * r2
            r2 = 60000(0xea60, double:2.9644E-319)
            long r2 = java.lang.Math.min(r2, r6)
        L566:
            r4.postDelayed(r5, r2)
        L569:
            return
        L56a:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f11612f
            r13 = 0
            r2.set(r13)
            throw r0
    }
}
