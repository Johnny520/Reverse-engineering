package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f1104a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f1105b = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            c9.b0.f1104a = r0
            c9.q r0 = new c9.q
            r1 = 0
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            c9.b0.f1105b = r0
            return
    }

    public static java.util.List a(android.app.Activity r1, java.lang.String r2) {
            java.util.List r1 = c9.o2.i(r1)
            c9.d2 r0 = c9.d2.f1137a
            java.util.LinkedHashSet r1 = c9.d2.j(r2, r1)
            java.util.List r1 = tf.m.P1(r1)
            return r1
    }

    public static java.util.List b(java.util.Collection r17) {
            r0 = r17
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            j8.b.r(r2, r1)
            goto L11
        L21:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L2a
            r0.add(r2)
            goto L2a
        L41:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r1 = tf.m.P1(r0)
            g8.i r0 = wb.en.c()
            tf.t r2 = tf.t.f13167g
            r3 = 0
            if (r0 == 0) goto L5e
            java.util.ArrayList r0 = r0.q(r1)     // Catch: java.lang.Throwable -> L57
            goto L5f
        L57:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            goto L64
        L5e:
            r0 = r3
        L5f:
            if (r0 != 0) goto L63
            r4 = r2
            goto L64
        L63:
            r4 = r0
        L64:
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L6a
            r4 = r2
        L6a:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            int r0 = tf.n.e1(r4)
            int r0 = tf.y.a0(r0)
            r5 = 16
            if (r0 >= r5) goto L79
            r0 = r5
        L79:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r0 = r4.iterator()
        L82:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r0.next()
            r6 = r4
            h.Hchat.hooks.api.model.WeChatContact r6 = (h.Hchat.hooks.api.model.WeChatContact) r6
            java.lang.String r6 = r6.wxId
            r5.put(r6, r4)
            goto L82
        L95:
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            if (r0 == 0) goto La0
            java.util.ArrayList r0 = r0.c()
            goto La1
        La0:
            r0 = r3
        La1:
            if (r0 != 0) goto La4
            goto La5
        La4:
            r2 = r0
        La5:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = tf.n.e1(r2)
            r0.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r6 = r4
        Lb4:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Ld8
            java.lang.Object r7 = r2.next()
            int r8 = r6 + 1
            if (r6 < 0) goto Ld4
            l8.b r7 = (l8.b) r7
            java.lang.String r7 = r7.f7898a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            sf.e r9 = new sf.e
            r9.<init>(r7, r6)
            r0.add(r9)
            r6 = r8
            goto Lb4
        Ld4:
            a.a.Q0()
            throw r3
        Ld8:
            java.util.Map r0 = tf.y.e0(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = tf.n.e1(r1)
            r2.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        Le9:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L1a4
            java.lang.Object r6 = r1.next()
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r5.get(r8)
            h.Hchat.hooks.api.model.WeChatContact r6 = (h.Hchat.hooks.api.model.WeChatContact) r6
            r7 = 1
            if (r6 == 0) goto L106
            boolean r9 = r6.isGroup()
            if (r9 != r7) goto L106
            goto L119
        L106:
            java.lang.String r9 = "@chatroom"
            boolean r9 = og.t.W(r8, r9, r4)
            if (r9 != 0) goto L119
            java.lang.String r9 = "@im.chatroom"
            boolean r9 = og.t.W(r8, r9, r4)
            if (r9 == 0) goto L117
            goto L119
        L117:
            r10 = r4
            goto L11a
        L119:
            r10 = r7
        L11a:
            if (r6 == 0) goto L121
            java.lang.String r7 = r6.displayName()
            goto L122
        L121:
            r7 = r3
        L122:
            java.lang.String r9 = ""
            if (r7 != 0) goto L127
            r7 = r9
        L127:
            boolean r11 = og.m.t0(r7)
            if (r11 == 0) goto L143
            h8.a r7 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            if (r7 == 0) goto L138
            java.lang.String r7 = r7.b(r8)
            goto L139
        L138:
            r7 = r3
        L139:
            if (r7 != 0) goto L13c
            r7 = r9
        L13c:
            boolean r11 = og.m.t0(r7)
            if (r11 == 0) goto L143
            r7 = r8
        L143:
            if (r6 == 0) goto L148
            java.lang.String r11 = r6.avatarUrl
            goto L149
        L148:
            r11 = r3
        L149:
            if (r11 != 0) goto L14c
            r11 = r9
        L14c:
            if (r6 == 0) goto L151
            java.lang.String r12 = r6.avatarBackupUrl
            goto L152
        L151:
            r12 = r3
        L152:
            if (r12 != 0) goto L155
            r12 = r9
        L155:
            java.lang.String r9 = "gh_"
            boolean r14 = og.t.d0(r8, r9, r4)
            if (r6 == 0) goto L160
            java.lang.String r9 = r6.nickname
            goto L161
        L160:
            r9 = r3
        L161:
            if (r6 == 0) goto L166
            java.lang.String r13 = r6.remarkName
            goto L167
        L166:
            r13 = r3
        L167:
            if (r6 == 0) goto L16c
            java.lang.String r6 = r6.customWxId
            goto L16d
        L16c:
            r6 = r3
        L16d:
            java.lang.String[] r6 = new java.lang.String[]{r9, r13, r6}
            java.util.ArrayList r6 = a.a.z0(r6)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r6 = r6.iterator()
        L17e:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L195
            java.lang.Object r9 = r6.next()
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = og.m.t0(r13)
            if (r13 != 0) goto L17e
            r15.add(r9)
            goto L17e
        L195:
            wb.jv r6 = new wb.jv
            r13 = 0
            r16 = 32
            r9 = r7
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.add(r7)
            goto Le9
        L1a4:
            c9.z r1 = new c9.z
            r3 = 0
            r1.<init>(r0, r3)
            c9.a0 r0 = new c9.a0
            r0.<init>(r1, r3)
            java.util.List r0 = tf.m.K1(r2, r0)
            return r0
    }

    public static c9.a c(android.app.Activity r4, java.lang.String r5) {
            java.util.List r0 = c9.o2.i(r4)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            r3 = r1
            c9.a r3 = (c9.a) r3
            java.lang.String r3 = r3.f1081a
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L8
            goto L20
        L1f:
            r1 = r2
        L20:
            c9.a r1 = (c9.a) r1
            if (r1 == 0) goto L25
            return r1
        L25:
            java.lang.String r5 = "聊天分组不存在"
            h(r4, r5)
            return r2
    }

    public static void d(android.app.Activity r7, java.lang.String r8, java.lang.String r9, fg.l r10, fg.l r11) {
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            c9.v r0 = new c9.v
            r1 = 0
            r0.<init>(r2, r1)
            wb.kv r4 = wb.y2.X1(r7, r0, r8, r9)
            c9.w r0 = new c9.w
            r5 = r7
            r3 = r8
            r1 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r7 = c9.b0.f1105b
            r7.execute(r0)
            return
    }

    public static void e(android.app.Activity r10, java.lang.String r11, boolean r12, aa.c r13) {
            java.util.List r3 = a(r10, r11)
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L10
            java.lang.String r11 = "当前分组没有会话"
            h(r10, r11)
            return
        L10:
            if (r12 == 0) goto L16
            java.lang.String r11 = "开启消息免打扰"
        L14:
            r2 = r11
            goto L19
        L16:
            java.lang.String r11 = "解除消息免打扰"
            goto L14
        L19:
            int r11 = r3.size()
            java.lang.String r0 = "将对当前分组及子分组内 "
            java.lang.String r1 = " 个会话执行此操作。"
            java.lang.String r6 = eh.a.m(r11, r0, r1)
            c9.u r0 = new c9.u
            r1 = r10
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            bi.c r8 = new bi.c
            r10 = 6
            r8.<init>(r10)
            wb.lv r9 = wb.lv.f17583j
            r7 = r0
            r4 = r1
            r5 = r2
            wb.y2.S1(r4, r5, r6, r7, r8, r9)
            return
    }

    public static void f(android.app.Activity r10, java.util.List r11, java.lang.String r12, java.lang.String r13, boolean r14, fg.l r15) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r11)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        Ld:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r11.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto Ld
        L1d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L26
            r11.add(r1)
            goto L26
        L3d:
            java.util.Set r11 = tf.m.T1(r11)
            java.util.List r1 = tf.m.P1(r11)
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L51
            java.lang.String r11 = "没有可选择的会话"
            h(r10, r11)
            return
        L51:
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r11 = 0
            r5.<init>(r11)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r11)
            c9.h r11 = new c9.h
            r0 = 0
            r11.<init>(r2, r5, r0)
            java.lang.String r0 = "正在载入会话..."
            wb.kv r3 = wb.y2.X1(r10, r11, r12, r0)
            c9.m r0 = new c9.m
            r4 = r10
            r7 = r12
            r8 = r13
            r9 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.concurrent.ExecutorService r10 = c9.b0.f1105b
            r10.execute(r0)
            return
    }

    public static void g(android.app.Activity r13, java.lang.String r14, aa.c r15) {
            c9.a r2 = c(r13, r14)
            if (r2 == 0) goto L7f
            java.lang.String r0 = c9.d2.F(r14)
            boolean r0 = d9.o.d(r13, r0)
            java.lang.String r6 = r2.f1082b
            boolean r1 = r2.f1087g
            java.lang.String r3 = "已关闭"
            java.lang.String r4 = "已开启"
            if (r1 == 0) goto L1a
            r1 = r4
            goto L1b
        L1a:
            r1 = r3
        L1b:
            sf.e r7 = new sf.e
            java.lang.String r5 = "主页置顶"
            r7.<init>(r5, r1)
            if (r0 == 0) goto L27
            java.lang.String r0 = "已设置"
            goto L29
        L27:
            java.lang.String r0 = "未设置"
        L29:
            sf.e r8 = new sf.e
            java.lang.String r1 = "自定义头像"
            r8.<init>(r1, r0)
            sf.e r9 = new sf.e
            java.lang.String r0 = "命名"
            r9.<init>(r0, r6)
            boolean r0 = r2.f1089i
            if (r0 == 0) goto L3d
            r0 = r4
            goto L3e
        L3d:
            r0 = r3
        L3e:
            sf.e r10 = new sf.e
            java.lang.String r1 = "显示未读数字"
            r10.<init>(r1, r0)
            boolean r0 = r2.f1090j
            if (r0 == 0) goto L4b
            r0 = r4
            goto L4c
        L4b:
            r0 = r3
        L4c:
            sf.e r11 = new sf.e
            java.lang.String r1 = "预览最新一条消息"
            r11.<init>(r1, r0)
            boolean r0 = r2.f1092l
            if (r0 == 0) goto L58
            r3 = r4
        L58:
            sf.e r12 = new sf.e
            java.lang.String r0 = "显示无消息"
            r12.<init>(r0, r3)
            sf.e[] r0 = new sf.e[]{r7, r8, r9, r10, r11, r12}
            java.util.List r7 = a.a.y0(r0)
            c9.n r0 = new c9.n
            r5 = 1
            r1 = r13
            r4 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            bi.c r8 = new bi.c
            r13 = 6
            r8.<init>(r13)
            java.lang.String r4 = "设置"
            r3 = r1
            r5 = r6
            r6 = r7
            r7 = r0
            wb.y2.W1(r3, r4, r5, r6, r7, r8)
        L7f:
            return
    }

    public static void h(android.app.Activity r2, java.lang.String r3) {
            c9.t r0 = new c9.t
            r1 = 0
            r0.<init>(r2, r3, r1)
            android.os.Handler r2 = c9.b0.f1104a
            r2.post(r0)
            return
    }

    public static void i(android.app.Activity r4, c9.y r5) {
            boolean r0 = r5.f1438d
            java.lang.String r1 = r5.f1437c
            if (r0 == 0) goto Ld
            java.lang.String r5 = "失败"
            java.lang.String r5 = bc.e.i(r1, r5)
            goto L4a
        Ld:
            int r0 = r5.f1435a
            int r5 = r5.f1436b
            java.lang.String r2 = "/"
            if (r0 != r5) goto L30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "完成: "
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            goto L4a
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "部分完成: "
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
        L4a:
            h(r4, r5)
            return
    }

    public static void j(android.app.Activity r1, c9.a r2, fg.a r3) {
            boolean r2 = c9.o2.u(r1, r2)
            if (r2 == 0) goto L9
            java.lang.String r0 = "设置已保存"
            goto Lb
        L9:
            java.lang.String r0 = "保存设置失败"
        Lb:
            h(r1, r0)
            if (r2 == 0) goto L13
            r3.invoke()
        L13:
            return
    }
}
