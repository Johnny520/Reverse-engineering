package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1382l;

    public /* synthetic */ u(android.app.Activity r2, fg.l r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r1 = this;
            r0 = 1
            r1.f1377g = r0
            r1.<init>()
            r1.f1378h = r2
            r1.f1381k = r3
            r1.f1379i = r4
            r1.f1382l = r5
            r1.f1380j = r6
            return
    }

    public /* synthetic */ u(android.app.Activity r2, java.lang.String r3, java.util.List r4, boolean r5, aa.c r6) {
            r1 = this;
            r0 = 0
            r1.f1377g = r0
            r1.<init>()
            r1.f1378h = r2
            r1.f1379i = r3
            r1.f1381k = r4
            r1.f1380j = r5
            r1.f1382l = r6
            return
    }

    public /* synthetic */ u(ia.q r2, java.lang.String r3, boolean r4, android.app.Activity r5, p8.l r6) {
            r1 = this;
            r0 = 2
            r1.f1377g = r0
            r1.<init>()
            r1.f1381k = r2
            r1.f1379i = r3
            r1.f1380j = r4
            r1.f1378h = r5
            r1.f1382l = r6
            return
    }

    public /* synthetic */ u(java.lang.Object r1, java.lang.Object r2, boolean r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f1377g = r6
            r0.f1378h = r1
            r0.f1379i = r2
            r0.f1380j = r3
            r0.f1381k = r4
            r0.f1382l = r5
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r28) {
            r27 = this;
            r0 = r27
            int r1 = r0.f1377g
            r3 = 0
            sf.n r4 = sf.n.f12433a
            r5 = 1
            boolean r6 = r0.f1380j
            java.lang.Object r7 = r0.f1382l
            java.lang.Object r8 = r0.f1381k
            java.lang.Object r9 = r0.f1379i
            java.lang.Object r10 = r0.f1378h
            switch(r1) {
                case 0: goto L2d0;
                case 1: goto L2a3;
                case 2: goto Ldf;
                case 3: goto L74;
                default: goto L15;
            }
        L15:
            wb.m3 r10 = (wb.m3) r10
            u2.c r9 = (u2.c) r9
            i0.f1 r8 = (i0.f1) r8
            i0.f1 r7 = (i0.f1) r7
            r1 = r28
            e1.b r1 = (e1.b) r1
            xb.i r2 = r10.f17593a
            if (r2 == 0) goto L6e
            float r4 = r8.g()
            r10 = 0
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 != 0) goto L2f
            goto L6f
        L2f:
            float r2 = r2.c()
            float r4 = r8.g()
            float r4 = r4 * r2
            r2 = 4
            float r2 = (float) r2
            float r2 = r9.x0(r2)
            r9 = 32
            if (r6 == 0) goto L4e
            float r2 = r2 + r4
            long r11 = r1.f2294a
            long r8 = r11 >> r9
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r2
            goto L62
        L4e:
            float r6 = r7.g()
            float r6 = r6 - r2
            float r2 = r8.g()
            float r6 = r6 - r2
            float r6 = r6 - r4
            long r1 = r1.f2294a
            long r1 = r1 >> r9
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r6
        L62:
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 > 0) goto L6f
            float r2 = r7.g()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L6f
        L6e:
            r3 = r5
        L6f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            return r1
        L74:
            w.q0 r10 = (w.q0) r10
            d1.v r9 = (d1.v) r9
            h0.d1 r8 = (h0.d1) r8
            b5.k r7 = (b5.k) r7
            r1 = r28
            e1.b r1 = (e1.b) r1
            boolean r2 = r10.b()
            if (r2 != 0) goto L8a
            d1.v.a(r9)
            goto L93
        L8a:
            y1.g2 r2 = r10.f14602c
            if (r2 == 0) goto L93
            y1.i1 r2 = (y1.i1) r2
            r2.b()
        L93:
            boolean r2 = r10.b()
            if (r2 == 0) goto Lde
            if (r6 == 0) goto Lde
            w.h0 r2 = r10.a()
            w.h0 r3 = w.h0.f14485h
            if (r2 == r3) goto Ldb
            w.m1 r2 = r10.d()
            if (r2 == 0) goto Lde
            long r8 = r1.f2294a
            b.e r1 = r10.f14603d
            w.w r3 = r10.f14621v
            int r2 = r2.b(r8, r5)
            r7.n(r2)
            java.lang.Object r1 = r1.f332h
            n2.s r1 = (n2.s) r1
            long r5 = i2.e0.b(r2, r2)
            r2 = 5
            r7 = 0
            n2.s r1 = n2.s.a(r1, r7, r5, r2)
            r3.invoke(r1)
            w.x0 r1 = r10.f14600a
            i2.g r1 = r1.f14710a
            java.lang.String r1 = r1.f6314h
            int r1 = r1.length()
            if (r1 <= 0) goto Lde
            w.h0 r1 = w.h0.f14486i
            i0.j1 r2 = r10.f14610k
            r2.setValue(r1)
            goto Lde
        Ldb:
            r8.g(r1)
        Lde:
            return r4
        Ldf:
            ia.q r8 = (ia.q) r8
            java.lang.String r9 = (java.lang.String) r9
            r6 = r10
            android.app.Activity r6 = (android.app.Activity) r6
            p8.l r7 = (p8.l) r7
            r12 = r28
            java.util.List r12 = (java.util.List) r12
            r12.getClass()
            b5.c r1 = r8.f6621a
            android.content.SharedPreferences r10 = r8.f6624d
            ia.c r11 = r1.l(r9)
            java.util.List r1 = r11.f6558a
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Iterator r13 = r12.iterator()
        L102:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L114
            java.lang.Object r14 = r13.next()
            wb.jv r14 = (wb.jv) r14
            java.lang.String r14 = r14.f17140a
            r9.add(r14)
            goto L102
        L114:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r1.iterator()
        L11d:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L136
            java.lang.Object r15 = r14.next()
            r2 = r15
            ia.d r2 = (ia.d) r2
            java.lang.String r2 = r2.f6562a
            boolean r2 = r9.contains(r2)
            if (r2 != 0) goto L11d
            r13.add(r15)
            goto L11d
        L136:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r9 = tf.n.e1(r13)
            r2.<init>(r9)
            java.util.Iterator r9 = r13.iterator()
        L143:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L182
            java.lang.Object r13 = r9.next()
            ia.d r13 = (ia.d) r13
            wb.jv r17 = new wb.jv
            java.lang.String r14 = r13.f6562a
            java.lang.String r13 = r13.f6563b
            java.lang.String r15 = "wxid_hchat_fake_like_"
            boolean r15 = og.t.d0(r14, r15, r3)
            if (r15 == 0) goto L166
            java.lang.String r15 = "虚拟点赞人"
            java.util.List r15 = a.a.x0(r15)
        L163:
            r25 = r15
            goto L169
        L166:
            tf.t r15 = tf.t.f13167g
            goto L163
        L169:
            r26 = 120(0x78, float:1.68E-43)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r19 = r13
            r18 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = r17
            r2.add(r13)
            goto L143
        L182:
            java.util.ArrayList r2 = tf.m.F1(r2, r12)
            java.lang.String r9 = "fake_like_auto_select"
            boolean r9 = r10.getBoolean(r9, r3)
            boolean r13 = r0.f1380j
            java.lang.String r14 = " 人"
            if (r9 == 0) goto L21d
            java.lang.String r1 = "fake_like_auto_select_count"
            r9 = 50
            int r1 = r10.getInt(r1, r9)
            if (r1 >= r5) goto L19d
            r1 = r5
        L19d:
            java.util.List r3 = r8.d(r12, r1, r13, r3)
            r11 = r3
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L1b1
            java.lang.String r1 = "没有可自动勾选的点赞人"
            ia.q.j(r6, r1)
            goto L2a2
        L1b1:
            java.util.ArrayList r2 = tf.m.F1(r3, r2)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r5 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1c4:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L1dd
            java.lang.Object r9 = r2.next()
            r10 = r9
            wb.jv r10 = (wb.jv) r10
            java.lang.String r10 = r10.f17140a
            boolean r10 = r3.add(r10)
            if (r10 == 0) goto L1c4
            r8.add(r9)
            goto L1c4
        L1dd:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.Iterator r2 = r11.iterator()
        L1e6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1f8
            java.lang.Object r3 = r2.next()
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17140a
            r9.add(r3)
            goto L1e6
        L1f8:
            java.lang.String r10 = "自动勾选伪集赞"
            r5.h(r6, r7, r8, r9, r10)
            int r2 = r11.size()
            if (r2 >= r1) goto L2a2
            int r1 = r11.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "可选人数不足，已勾选 "
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            ia.q.j(r6, r1)
            goto L2a2
        L21d:
            r5 = r8
            uf.c r3 = a.a.E()
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L230
            if (r13 == 0) goto L22d
            java.lang.String r8 = "从好友及非好友中手动选择"
            goto L23a
        L22d:
            java.lang.String r8 = "从好友列表手动选择"
            goto L23a
        L230:
            int r8 = r1.size()
            java.lang.String r9 = "当前已选择 "
            java.lang.String r8 = eh.a.m(r8, r9, r14)
        L23a:
            sf.e r9 = new sf.e
            java.lang.String r10 = "选择点赞好友"
            r9.<init>(r10, r8)
            r3.add(r9)
            sf.e r8 = new sf.e
            java.lang.String r9 = "随机选择好友"
            java.lang.String r10 = "按数量随机勾选，候选不足时可生成虚拟点赞人"
            r8.<init>(r9, r10)
            r3.add(r8)
            sf.e r8 = new sf.e
            java.lang.String r9 = "凭空生成点赞"
            java.lang.String r10 = "无需真实好友，随机生成指定数量的虚拟点赞人"
            r8.<init>(r9, r10)
            r3.add(r8)
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L26e
            sf.e r8 = new sf.e
            java.lang.String r9 = "清空伪集赞"
            java.lang.String r10 = "移除该朋友圈的全部本地点赞"
            r8.<init>(r9, r10)
            r3.add(r8)
        L26e:
            uf.c r14 = a.a.t(r3)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L27b
            java.lang.String r1 = "选择好友或按数量随机生成"
            goto L287
        L27b:
            int r1 = r1.size()
            java.lang.String r3 = "当前共 "
            java.lang.String r8 = " 个伪造点赞"
            java.lang.String r1 = eh.a.m(r1, r3, r8)
        L287:
            ia.n r15 = new ia.n
            r10 = r2
            r8 = r6
            r9 = r7
            r6 = r14
            r7 = r5
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = r8
            k.s1 r2 = new k.s1
            r3 = 7
            r2.<init>(r3)
            java.lang.String r12 = "朋友圈伪集赞"
            r13 = r1
            r16 = r2
            r11 = r6
            wb.y2.W1(r11, r12, r13, r14, r15, r16)
        L2a2:
            return r4
        L2a3:
            android.app.Activity r10 = (android.app.Activity) r10
            r18 = r8
            fg.l r18 = (fg.l) r18
            r20 = r9
            java.lang.String r20 = (java.lang.String) r20
            r21 = r7
            java.lang.String r21 = (java.lang.String) r21
            r17 = r28
            java.util.List r17 = (java.util.List) r17
            r17.getClass()
            bi.c r1 = new bi.c
            r3 = 7
            r1.<init>(r3)
            r22 = r6 ^ 1
            r25 = 0
            r26 = 3968(0xf80, float:5.56E-42)
            r23 = 0
            r24 = 0
            r19 = r1
            r16 = r10
            wb.y2.U1(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r4
        L2d0:
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.String r9 = (java.lang.String) r9
            java.util.List r8 = (java.util.List) r8
            aa.c r7 = (aa.c) r7
            r1 = r28
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2e3
            goto L2ff
        L2e3:
            android.os.Handler r1 = c9.b0.f1104a
            int r1 = r8.size()
            java.lang.String r2 = "正在处理 "
            java.lang.String r5 = " 个会话..."
            java.lang.String r1 = eh.a.m(r1, r2, r5)
            c9.x r2 = new c9.x
            r2.<init>(r3, r8, r9, r6)
            c9.l r3 = new c9.l
            r5 = 3
            r3.<init>(r7, r10, r5)
            c9.b0.d(r10, r9, r1, r2, r3)
        L2ff:
            return r4
    }
}
