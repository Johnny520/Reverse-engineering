package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ aa.c f1328j;

    public /* synthetic */ r(android.app.Activity r1, java.lang.String r2, aa.c r3, int r4) {
            r0 = this;
            r0.f1325g = r4
            r0.f1326h = r1
            r0.f1327i = r2
            r0.f1328j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r23) {
            r22 = this;
            r1 = r22
            int r0 = r1.f1325g
            r2 = 0
            java.lang.String r3 = " 个会话"
            aa.c r4 = r1.f1328j
            java.lang.String r5 = r1.f1327i
            sf.n r6 = sf.n.f12433a
            r7 = 6
            switch(r0) {
                case 0: goto L14c;
                case 1: goto L106;
                case 2: goto L60;
                default: goto L11;
            }
        L11:
            r0 = r23
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r11.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            wb.jv r2 = (wb.jv) r2
            java.lang.String r2 = r2.f17140a
            r11.add(r2)
            goto L25
        L37:
            int r0 = r11.size()
            java.lang.String r2 = "将清空所选 "
            java.lang.String r3 = " 个会话的本地聊天记录，联系人、群聊和聊天分组归属不会删除。此操作无法撤销。"
            java.lang.String r14 = eh.a.m(r0, r2, r3)
            c9.k r15 = new c9.k
            r13 = 0
            android.app.Activity r9 = r1.f1326h
            java.lang.String r10 = r1.f1327i
            aa.c r12 = r1.f1328j
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            bi.c r0 = new bi.c
            r0.<init>(r7)
            wb.lv r17 = wb.lv.f17583j
            java.lang.String r13 = "清空聊天记录"
            r16 = r0
            r12 = r9
            wb.y2.S1(r12, r13, r14, r15, r16, r17)
            return r6
        L60:
            r0 = r23
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            android.app.Activity r8 = r1.f1326h
            java.util.List r9 = c9.o2.i(r8)
            sf.e r10 = new sf.e
            java.lang.String r11 = "微信首页"
            r10.<init>(r2, r11)
            java.util.List r2 = a.a.x0(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L81:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L9a
            java.lang.Object r11 = r9.next()
            r12 = r11
            c9.a r12 = (c9.a) r12
            java.lang.String r12 = r12.f1081a
            boolean r12 = gg.l.a(r12, r5)
            if (r12 != 0) goto L81
            r10.add(r11)
            goto L81
        L9a:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r9 = tf.n.e1(r10)
            r5.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        La7:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lc0
            java.lang.Object r10 = r9.next()
            c9.a r10 = (c9.a) r10
            java.lang.String r11 = r10.f1081a
            java.lang.String r10 = r10.f1082b
            sf.e r12 = new sf.e
            r12.<init>(r11, r10)
            r5.add(r12)
            goto La7
        Lc0:
            java.util.ArrayList r2 = tf.m.F1(r2, r5)
            int r5 = r0.size()
            java.lang.String r9 = "已选择 "
            java.lang.String r10 = eh.a.m(r5, r9, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r3 = tf.n.e1(r2)
            r11.<init>(r3)
            java.util.Iterator r3 = r2.iterator()
        Ldb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lf6
            java.lang.Object r5 = r3.next()
            sf.e r5 = (sf.e) r5
            java.lang.Object r5 = r5.f12419h
            java.lang.String r5 = (java.lang.String) r5
            sf.e r9 = new sf.e
            java.lang.String r12 = ""
            r9.<init>(r5, r12)
            r11.add(r9)
            goto Ldb
        Lf6:
            c9.k r12 = new c9.k
            r12.<init>(r2, r8, r0, r4)
            bi.c r13 = new bi.c
            r13.<init>(r7)
            java.lang.String r9 = "移至"
            wb.y2.W1(r8, r9, r10, r11, r12, r13)
            return r6
        L106:
            r0 = r23
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = tf.n.e1(r0)
            r2.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
        L11a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L12c
            java.lang.Object r8 = r7.next()
            wb.jv r8 = (wb.jv) r8
            java.lang.String r8 = r8.f17140a
            r2.add(r8)
            goto L11a
        L12c:
            android.app.Activity r7 = r1.f1326h
            boolean r2 = c9.o2.t(r7, r5, r2)
            android.os.Handler r5 = c9.b0.f1104a
            if (r2 == 0) goto L141
            int r0 = r0.size()
            java.lang.String r5 = "已添加 "
            java.lang.String r0 = eh.a.m(r0, r5, r3)
            goto L143
        L141:
            java.lang.String r0 = "添加会话失败"
        L143:
            c9.b0.h(r7, r0)
            if (r2 == 0) goto L14b
            r4.invoke()
        L14b:
            return r6
        L14c:
            r0 = r23
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.os.Handler r8 = c9.b0.f1104a
            r8 = 2
            r9 = 1
            android.app.Activity r10 = r1.f1326h
            java.lang.String r11 = "当前分组没有会话"
            r12 = 0
            tf.t r13 = tf.t.f13167g
            switch(r0) {
                case 0: goto L396;
                case 1: goto L36c;
                case 2: goto L359;
                case 3: goto L355;
                case 4: goto L351;
                case 5: goto L31b;
                case 6: goto L228;
                case 7: goto L1b4;
                case 8: goto L198;
                case 9: goto L17c;
                case 10: goto L169;
                case 11: goto L164;
                default: goto L162;
            }
        L162:
            goto L399
        L164:
            c9.b0.g(r10, r5, r4)
            goto L399
        L169:
            java.util.List r11 = c9.b0.a(r10, r5)
            b4.b r15 = new b4.b
            r15.<init>(r9)
            java.lang.String r12 = "搜索分组会话"
            java.lang.String r13 = "打开"
            r14 = 1
            c9.b0.f(r10, r11, r12, r13, r14, r15)
            goto L399
        L17c:
            c9.a r0 = c9.b0.c(r10, r5)
            if (r0 == 0) goto L184
            java.util.List r2 = r0.f1085e
        L184:
            if (r2 != 0) goto L188
            r11 = r13
            goto L189
        L188:
            r11 = r2
        L189:
            c9.r r15 = new c9.r
            r15.<init>(r10, r5, r4, r8)
            r14 = 0
            java.lang.String r12 = "选择要移动的会话"
            java.lang.String r13 = "下一步"
            c9.b0.f(r10, r11, r12, r13, r14, r15)
            goto L399
        L198:
            c9.a r0 = c9.b0.c(r10, r5)
            if (r0 == 0) goto L1a0
            java.util.List r2 = r0.f1085e
        L1a0:
            if (r2 != 0) goto L1a4
            r11 = r13
            goto L1a5
        L1a4:
            r11 = r2
        L1a5:
            c9.l r15 = new c9.l
            r15.<init>(r10, r4)
            r14 = 0
            java.lang.String r12 = "移出当前分组"
            java.lang.String r13 = "移出"
            c9.b0.f(r10, r11, r12, r13, r14, r15)
            goto L399
        L1b4:
            java.util.List r0 = c9.b0.a(r10, r5)
            h8.a r3 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            if (r3 == 0) goto L1c2
            java.util.ArrayList r2 = r3.c()
        L1c2:
            if (r2 != 0) goto L1c5
            goto L1c6
        L1c5:
            r13 = r2
        L1c6:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r13)
            r2.<init>(r3)
            java.util.Iterator r3 = r13.iterator()
        L1d3:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L1e5
            java.lang.Object r7 = r3.next()
            l8.b r7 = (l8.b) r7
            java.lang.String r7 = r7.f7898a
            r2.add(r7)
            goto L1d3
        L1e5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1ee:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L211
            java.lang.Object r7 = r2.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            boolean r11 = og.m.t0(r8)
            if (r11 != 0) goto L1ee
            boolean r11 = c9.d2.q(r8)
            if (r11 != 0) goto L1ee
            boolean r8 = r0.contains(r8)
            if (r8 != 0) goto L1ee
            r3.add(r7)
            goto L1ee
        L211:
            java.util.Set r0 = tf.m.T1(r3)
            java.util.List r11 = tf.m.P1(r0)
            c9.r r15 = new c9.r
            r15.<init>(r10, r5, r4, r9)
            r14 = 0
            java.lang.String r12 = "添加到当前分组"
            java.lang.String r13 = "添加"
            c9.b0.f(r10, r11, r12, r13, r14, r15)
            goto L399
        L228:
            java.util.List r0 = c9.b0.a(r10, r5)
            g8.i r3 = wb.en.c()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L239:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L271
            java.lang.Object r11 = r5.next()
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            if (r3 == 0) goto L252
            boolean r0 = r3.H(r0)     // Catch: java.lang.Throwable -> L250
            if (r0 != r9) goto L252
            r0 = r9
            goto L253
        L250:
            r0 = move-exception
            goto L258
        L252:
            r0 = r12
        L253:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L250
            goto L25e
        L258:
            sf.f r14 = new sf.f
            r14.<init>(r0)
            r0 = r14
        L25e:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            boolean r15 = r0 instanceof sf.f
            if (r15 == 0) goto L265
            r0 = r14
        L265:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L239
            r4.add(r11)
            goto L239
        L271:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L27e
            java.lang.String r0 = "当前分组没有可邀请的好友"
            c9.b0.h(r10, r0)
            goto L399
        L27e:
            if (r3 == 0) goto L28c
            java.util.ArrayList r2 = r3.x()     // Catch: java.lang.Throwable -> L285
            goto L28c
        L285:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            goto L28f
        L28c:
            if (r2 != 0) goto L28f
            r2 = r13
        L28f:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L294
            goto L295
        L294:
            r13 = r2
        L295:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = tf.n.e1(r13)
            r11.<init>(r0)
            java.util.Iterator r0 = r13.iterator()
        L2a4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2fe
            java.lang.Object r2 = r0.next()
            h.Hchat.hooks.api.model.WeChatContact r2 = (h.Hchat.hooks.api.model.WeChatContact) r2
            java.lang.String r13 = r2.wxId
            java.lang.String r14 = r2.displayName()
            java.lang.String r3 = r2.avatarUrl
            java.lang.String r5 = r2.avatarBackupUrl
            java.lang.String r9 = r2.nickname
            java.lang.String r12 = r2.remarkName
            java.lang.String r2 = r2.customWxId
            java.lang.String[] r2 = new java.lang.String[]{r9, r12, r2}
            java.util.List r2 = a.a.y0(r2)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L2d1:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L2e8
            java.lang.Object r12 = r2.next()
            r15 = r12
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = og.m.t0(r15)
            if (r15 != 0) goto L2d1
            r9.add(r12)
            goto L2d1
        L2e8:
            wb.jv r12 = new wb.jv
            r15 = 1
            r18 = 0
            r19 = 0
            r21 = 96
            r16 = r3
            r17 = r5
            r20 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11.add(r12)
            goto L2a4
        L2fe:
            c9.i r12 = new c9.i
            r12.<init>(r10, r8, r4)
            bi.c r13 = new bi.c
            r13.<init>(r7)
            r19 = 1
            r20 = 3008(0xbc0, float:4.215E-42)
            java.lang.String r14 = "选择群聊"
            java.lang.String r15 = "下一步"
            r16 = 0
            r17 = 0
            r18 = 0
            wb.y2.U1(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L399
        L31b:
            java.util.List r0 = c9.b0.a(r10, r5)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L32a
            c9.b0.h(r10, r11)
            goto L399
        L32a:
            int r2 = r0.size()
            java.lang.String r4 = "发送给当前分组及子分组内 "
            java.lang.String r12 = eh.a.m(r2, r4, r3)
            c9.s r2 = new c9.s
            r2.<init>(r10, r0)
            bi.c r0 = new bi.c
            r0.<init>(r7)
            r19 = 584(0x248, float:8.18E-43)
            java.lang.String r11 = "发送"
            r13 = 0
            java.lang.String r14 = "输入要发送的文字"
            r15 = 5000(0x1388, float:7.006E-42)
            r16 = 0
            r18 = r0
            r17 = r2
            wb.y2.c2(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L399
        L351:
            c9.b0.e(r10, r5, r12, r4)
            goto L399
        L355:
            c9.b0.e(r10, r5, r9, r4)
            goto L399
        L359:
            java.util.List r11 = c9.b0.a(r10, r5)
            c9.r r15 = new c9.r
            r0 = 3
            r15.<init>(r10, r5, r4, r0)
            r14 = 0
            java.lang.String r12 = "批量删除消息"
            java.lang.String r13 = "继续"
            c9.b0.f(r10, r11, r12, r13, r14, r15)
            goto L399
        L36c:
            java.util.List r0 = c9.b0.a(r10, r5)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L37a
            c9.b0.h(r10, r11)
            goto L399
        L37a:
            int r2 = r0.size()
            java.lang.String r3 = "正在标记 "
            java.lang.String r5 = " 个会话..."
            java.lang.String r2 = eh.a.m(r2, r3, r5)
            c9.s r3 = new c9.s
            r3.<init>(r0, r10)
            c9.l r0 = new c9.l
            r0.<init>(r4, r10, r9)
            java.lang.String r4 = "所有消息标为已读"
            c9.b0.d(r10, r4, r2, r3, r0)
            goto L399
        L396:
            a7.a.S(r10, r2, r12)
        L399:
            return r6
    }
}
