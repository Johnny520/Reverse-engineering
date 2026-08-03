package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f5373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hb.i0 f5375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b.e f5376k;

    public /* synthetic */ f0(int r1, android.app.Activity r2, b.e r3, hb.i0 r4, java.util.List r5) {
            r0 = this;
            r0.f5372g = r1
            r0.f5373h = r2
            r0.f5375j = r4
            r0.f5374i = r5
            r0.f5376k = r3
            r0.<init>()
            return
    }

    public /* synthetic */ f0(android.app.Activity r2, java.util.List r3, hb.i0 r4, b.e r5) {
            r1 = this;
            r0 = 1
            r1.f5372g = r0
            r1.<init>()
            r1.f5373h = r2
            r1.f5374i = r3
            r1.f5375j = r4
            r1.f5376k = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f5372g
            switch(r0) {
                case 0: goto L19f;
                case 1: goto L10e;
                case 2: goto L8b;
                default: goto L5;
            }
        L5:
            android.app.Activity r5 = r14.f5373h
            hb.i0 r2 = r14.f5375j
            java.util.List r0 = r14.f5374i
            b.e r7 = r14.f5376k
            java.util.List r15 = (java.util.List) r15
            r15.getClass()
            gg.u r8 = new gg.u
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r3.<init>(r1)
            java.lang.String r4 = "Hchat_selected_messages_config"
            android.content.SharedPreferences r4 = ub.b.c(r5, r4)
            java.lang.String r6 = "selected_messages_background_silent_send"
            boolean r1 = r4.getBoolean(r6, r1)
            if (r1 == 0) goto L2e
            r1 = 0
        L2c:
            r4 = r1
            goto L3d
        L2e:
            ca.p r1 = new ca.p
            r4 = 2
            r1.<init>(r3, r8, r4)
            java.lang.String r4 = "模块群发"
            java.lang.String r6 = "正在发送..."
            wb.kv r1 = wb.y2.X1(r5, r1, r4, r6)
            goto L2c
        L3d:
            hb.r r9 = r2.f5406g
            java.util.ArrayList r10 = new java.util.ArrayList
            int r1 = tf.n.e1(r15)
            r10.<init>(r1)
            java.util.Iterator r15 = r15.iterator()
        L4c:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r15.next()
            wb.jv r1 = (wb.jv) r1
            java.lang.String r1 = r1.f17140a
            r10.add(r1)
            goto L4c
        L5e:
            hb.y r1 = new hb.y
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r9.getClass()
            hb.s r15 = r9.g(r0, r10, r1)
            r8.f4564g = r15
            if (r15 != 0) goto L7e
            r15 = 1
            r3.set(r15)
            if (r4 == 0) goto L78
            r4.close()
        L78:
            java.lang.String r15 = "模块群发启动失败"
            r2.e(r5, r15)
            goto L88
        L7e:
            ab.b r15 = r2.f5401b
            r7.r(r15)
            java.lang.String r15 = "已开始模块群发"
            r2.e(r5, r15)
        L88:
            sf.n r15 = sf.n.f12433a
            return r15
        L8b:
            android.app.Activity r4 = r14.f5373h
            hb.i0 r1 = r14.f5375j
            java.util.List r6 = r14.f5374i
            b.e r7 = r14.f5376k
            java.util.List r15 = (java.util.List) r15
            r15.getClass()
            gg.u r8 = new gg.u
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r2.<init>(r0)
            java.lang.String r3 = "Hchat_selected_messages_config"
            android.content.SharedPreferences r3 = ub.b.c(r4, r3)
            java.lang.String r5 = "selected_messages_background_silent_send"
            boolean r0 = r3.getBoolean(r5, r0)
            if (r0 == 0) goto Lb4
            r0 = 0
        Lb2:
            r3 = r0
            goto Lc3
        Lb4:
            ca.p r0 = new ca.p
            r3 = 3
            r0.<init>(r2, r8, r3)
            java.lang.String r3 = "微信原生群发助手"
            java.lang.String r5 = "正在发送..."
            wb.kv r0 = wb.y2.X1(r4, r0, r3, r5)
            goto Lb2
        Lc3:
            hb.k r9 = r1.f5408i
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = tf.n.e1(r15)
            r10.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        Ld2:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r15.next()
            wb.jv r0 = (wb.jv) r0
            java.lang.String r0 = r0.f17140a
            r10.add(r0)
            goto Ld2
        Le4:
            hb.y r0 = new hb.y
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            hb.s r15 = r9.f(r6, r10, r0)
            r8.f4564g = r15
            if (r15 != 0) goto L101
            r15 = 1
            r2.set(r15)
            if (r3 == 0) goto Lfb
            r3.close()
        Lfb:
            java.lang.String r15 = "微信原生群发助手启动失败"
            r1.e(r4, r15)
            goto L10b
        L101:
            ab.b r15 = r1.f5401b
            r7.r(r15)
            java.lang.String r15 = "已开始微信原生群发"
            r1.e(r4, r15)
        L10b:
            sf.n r15 = sf.n.f12433a
            return r15
        L10e:
            android.app.Activity r1 = r14.f5373h
            java.util.List r5 = r14.f5374i
            hb.i0 r0 = r14.f5375j
            b.e r3 = r14.f5376k
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            boolean r2 = r1.isFinishing()
            if (r2 == 0) goto L124
            goto L19c
        L124:
            r2 = 0
            r4 = 1
            if (r15 != r4) goto L12c
            r15 = r2
            r2 = r1
            r1 = r4
            goto L12f
        L12c:
            r15 = r2
            r2 = r1
            r1 = r15
        L12f:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L138
            java.lang.String r6 = "请选择发送内容"
            goto L175
        L138:
            hb.k0 r6 = a.a.f1g
            if (r6 == 0) goto L173
            if (r1 == r4) goto L140
            r6 = 0
            goto L175
        L140:
            hb.k r7 = r6.f5430c
            boolean r7 = r7.g()
            if (r7 != 0) goto L14b
            java.lang.String r6 = "微信原生群发助手通道不可用"
            goto L175
        L14b:
            hb.k r7 = r6.f5430c
            java.util.List r8 = r7.o(r5)
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L169
            r12 = 0
            r13 = 62
            java.lang.String r9 = "、"
            r10 = 0
            r11 = 0
            java.lang.String r6 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "微信原生群发助手不支持: "
            java.lang.String r6 = r7.concat(r6)
            goto L175
        L169:
            hb.k r6 = r6.f5430c
            r6.getClass()
            java.lang.String r6 = hb.k.j(r5)
            goto L175
        L173:
            java.lang.String r6 = "群发助手尚未就绪"
        L175:
            if (r6 == 0) goto L17b
            r0.e(r2, r6)
            goto L19c
        L17b:
            r0.getClass()
            if (r1 != r4) goto L181
            r15 = r4
        L181:
            if (r15 == 0) goto L188
            java.lang.String r4 = "选择定时群发好友"
        L185:
            r6 = r4
            r4 = r0
            goto L18b
        L188:
            java.lang.String r4 = "选择定时发送对象"
            goto L185
        L18b:
            hb.w r0 = new hb.w
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r1 = "下一步"
            r3 = r2
            r2 = r0
            r0 = r4
            r4 = r1
            r1 = r3
            r5 = r15
            r3 = r6
            r0.d(r1, r2, r3, r4, r5)
        L19c:
            sf.n r15 = sf.n.f12433a
            return r15
        L19f:
            android.app.Activity r1 = r14.f5373h
            hb.i0 r0 = r14.f5375j
            java.util.List r5 = r14.f5374i
            b.e r3 = r14.f5376k
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            boolean r2 = r1.isFinishing()
            if (r2 == 0) goto L1b4
            goto L20c
        L1b4:
            if (r15 != 0) goto L1ce
            r0.getClass()
            hb.f0 r2 = new hb.f0
            r4 = r0
            r0 = r2
            r2 = r1
            r1 = 3
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r3 = "选择群发对象"
            r1 = r2
            r2 = r0
            r0 = r4
            java.lang.String r4 = "发送"
            r5 = 0
            r0.d(r1, r2, r3, r4, r5)
            goto L20c
        L1ce:
            r4 = r0
            r2 = r1
            hb.k r15 = r4.f5408i
            java.util.List r6 = r15.o(r5)
            boolean r15 = r6.isEmpty()
            if (r15 != 0) goto L1f1
            r10 = 0
            r11 = 62
            java.lang.String r7 = "、"
            r8 = 0
            r9 = 0
            java.lang.String r15 = tf.m.A1(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "原生群发不支持: "
            java.lang.String r15 = r0.concat(r15)
            r4.e(r2, r15)
            goto L20c
        L1f1:
            java.lang.String r15 = hb.k.j(r5)
            if (r15 == 0) goto L1fb
            r4.e(r2, r15)
            goto L20c
        L1fb:
            hb.f0 r0 = new hb.f0
            r1 = 2
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r3 = "选择官方群发好友"
            r1 = r2
            r2 = r0
            r0 = r4
            java.lang.String r4 = "发送"
            r5 = 1
            r0.d(r1, r2, r3, r4, r5)
        L20c:
            sf.n r15 = sf.n.f12433a
            return r15
    }
}
