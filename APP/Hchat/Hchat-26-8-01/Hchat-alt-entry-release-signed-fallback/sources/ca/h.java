package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ca.e0 f1509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hb.t f1511j;

    public /* synthetic */ h(ca.e0 r1, android.app.Activity r2, hb.t r3, int r4) {
            r0 = this;
            r0.f1508g = r4
            r0.f1509h = r1
            r0.f1510i = r2
            r0.f1511j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ h(hb.t r2, ca.e0 r3, android.app.Activity r4) {
            r1 = this;
            r0 = 2
            r1.f1508g = r0
            r1.<init>()
            r1.f1511j = r2
            r1.f1509h = r3
            r1.f1510i = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f1508g
            switch(r0) {
                case 0: goto Lcf;
                case 1: goto L9d;
                case 2: goto L1a;
                default: goto L5;
            }
        L5:
            ca.e0 r1 = r14.f1509h
            android.app.Activity r2 = r14.f1510i
            hb.t r3 = r14.f1511j
            r4 = r15
            java.util.List r4 = (java.util.List) r4
            r4.getClass()
            r5 = 0
            java.lang.String r6 = "转发至标签"
            r1.o(r2, r3, r4, r5, r6)
        L17:
            sf.n r15 = sf.n.f12433a
            return r15
        L1a:
            hb.t r3 = r14.f1511j
            ca.e0 r1 = r14.f1509h
            android.app.Activity r2 = r14.f1510i
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0 = 0
            r4 = 1
            if (r15 != r4) goto L2c
            r15 = r4
            goto L2e
        L2c:
            r15 = r4
            r4 = r0
        L2e:
            java.util.List r5 = a.a.x0(r3)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3b
            java.lang.String r5 = "请选择发送内容"
            goto L78
        L3b:
            hb.k0 r6 = a.a.f1g
            if (r6 == 0) goto L76
            if (r4 == r15) goto L43
            r5 = 0
            goto L78
        L43:
            hb.k r7 = r6.f5430c
            boolean r7 = r7.g()
            if (r7 != 0) goto L4e
            java.lang.String r5 = "微信原生群发助手通道不可用"
            goto L78
        L4e:
            hb.k r7 = r6.f5430c
            java.util.List r8 = r7.o(r5)
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L6c
            r12 = 0
            r13 = 62
            java.lang.String r9 = "、"
            r10 = 0
            r11 = 0
            java.lang.String r5 = tf.m.A1(r8, r9, r10, r11, r12, r13)
            java.lang.String r6 = "微信原生群发助手不支持: "
            java.lang.String r5 = r6.concat(r5)
            goto L78
        L6c:
            hb.k r6 = r6.f5430c
            r6.getClass()
            java.lang.String r5 = hb.k.j(r5)
            goto L78
        L76:
            java.lang.String r5 = "群发助手尚未就绪"
        L78:
            if (r5 == 0) goto L7e
            r1.r(r2, r5)
            goto L9a
        L7e:
            if (r4 != r15) goto L82
            r9 = r15
            goto L83
        L82:
            r9 = r0
        L83:
            if (r9 == 0) goto L89
            java.lang.String r15 = "选择官方群发好友"
        L87:
            r7 = r15
            goto L8c
        L89:
            java.lang.String r15 = "选择群发对象"
            goto L87
        L8c:
            ca.k r0 = new ca.k
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r8 = "发送"
            r6 = r0
            r4 = r1
            r5 = r2
            r4.p(r5, r6, r7, r8, r9)
        L9a:
            sf.n r15 = sf.n.f12433a
            return r15
        L9d:
            ca.e0 r0 = r14.f1509h
            android.app.Activity r1 = r14.f1510i
            hb.t r2 = r14.f1511j
            java.util.List r15 = (java.util.List) r15
            r15.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = tf.n.e1(r15)
            r3.<init>(r4)
            java.util.Iterator r15 = r15.iterator()
        Lb5:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto Lc7
            java.lang.Object r4 = r15.next()
            wb.jv r4 = (wb.jv) r4
            java.lang.String r4 = r4.f17140a
            r3.add(r4)
            goto Lb5
        Lc7:
            r4 = 0
            java.lang.String r5 = "转发给好友"
            r0.o(r1, r2, r3, r4, r5)
            goto L17
        Lcf:
            ca.e0 r0 = r14.f1509h
            android.app.Activity r1 = r14.f1510i
            hb.t r2 = r14.f1511j
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            if (r15 == 0) goto L1f2
            r3 = 1
            if (r15 == r3) goto L1df
            r4 = 2
            r5 = 3
            if (r15 == r4) goto L134
            if (r15 == r5) goto L101
            r3 = 4
            if (r15 == r3) goto Leb
            goto L20b
        Leb:
            r0.getClass()
            ca.h r15 = new ca.h
            r3 = 3
            r15.<init>(r0, r1, r2, r3)
            ca.l r2 = new ca.l
            r2.<init>(r0, r1, r15)
            java.lang.String r15 = "转发至标签"
            r3 = 0
            r0.e(r1, r2, r15, r3)
            goto L20b
        L101:
            r0.getClass()
            sf.e r15 = new sf.e
            java.lang.String r3 = "模块通道"
            java.lang.String r4 = "支持好友、群聊、公众号和标签"
            r15.<init>(r3, r4)
            sf.e r3 = new sf.e
            java.lang.String r4 = "微信原生群发助手"
            java.lang.String r5 = "仅选择好友并按原生队列发送"
            r3.<init>(r4, r5)
            sf.e[] r15 = new sf.e[]{r15, r3}
            java.util.List r4 = a.a.y0(r15)
            ca.h r5 = new ca.h
            r5.<init>(r2, r0, r1)
            bi.c r6 = new bi.c
            r15 = 7
            r6.<init>(r15)
            wb.lv r7 = wb.lv.f17583j
            java.lang.String r2 = "选择群发通道"
            java.lang.String r3 = ""
            wb.y2.Q1(r1, r2, r3, r4, r5, r6, r7)
            goto L20b
        L134:
            androidx.lifecycle.x r15 = r0.f1495o
            r15.getClass()
            int r4 = r2.f5465b
            r6 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r6
            k8.t r6 = r2.f5470g
            java.lang.String r7 = ""
            r8 = 0
            if (r4 != r3) goto L15e
            if (r6 == 0) goto L14a
            java.lang.String r8 = r6.f7474c
        L14a:
            if (r8 != 0) goto L14d
            goto L14e
        L14d:
            r7 = r8
        L14e:
            boolean r15 = og.m.t0(r7)
            if (r15 == 0) goto L156
            java.lang.String r7 = r2.f5467d
        L156:
            java.lang.String r15 = "消息内容为空"
            java.lang.String r15 = androidx.lifecycle.x.a0(r1, r7, r15)
            goto L1d9
        L15e:
            r3 = 62
            r9 = 47
            r10 = 43
            r11 = 34
            if (r4 == r5) goto L17e
            if (r4 == r11) goto L17b
            if (r4 == r10) goto L17e
            if (r4 == r9) goto L172
            if (r4 == r3) goto L17e
        L170:
            r2 = r7
            goto L187
        L172:
            if (r6 == 0) goto L177
            java.lang.String r2 = r6.f7477f
            goto L178
        L177:
            r2 = r8
        L178:
            if (r2 != 0) goto L187
            goto L170
        L17b:
            java.lang.String r2 = r2.f5471h
            goto L187
        L17e:
            if (r6 == 0) goto L183
            java.lang.String r2 = r6.f7477f
            goto L184
        L183:
            r2 = r8
        L184:
            if (r2 != 0) goto L187
            goto L170
        L187:
            boolean r6 = og.m.t0(r2)
            if (r6 != 0) goto L18e
            goto L18f
        L18e:
            r2 = r8
        L18f:
            if (r2 == 0) goto L196
            java.io.File r8 = new java.io.File
            r8.<init>(r2)
        L196:
            if (r8 == 0) goto L1d7
            boolean r2 = r8.isFile()
            if (r2 != 0) goto L1a1
            java.lang.String r15 = "分享文件不存在"
            goto L1d9
        L1a1:
            if (r4 == r5) goto L1cc
            if (r4 == r11) goto L1c9
            if (r4 == r10) goto L1c6
            if (r4 == r9) goto L1cc
            if (r4 == r3) goto L1c6
            java.lang.String r2 = dg.l.c0(r8)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r3.getMimeTypeFromExtension(r2)
            if (r2 == 0) goto L1c3
            goto L1ce
        L1c3:
            java.lang.String r2 = "application/octet-stream"
            goto L1ce
        L1c6:
            java.lang.String r2 = "video/*"
            goto L1ce
        L1c9:
            java.lang.String r2 = "audio/*"
            goto L1ce
        L1cc:
            java.lang.String r2 = "image/*"
        L1ce:
            java.util.List r3 = a.a.x0(r8)
            java.lang.String r15 = r15.Y(r1, r3, r2, r7)
            goto L1d9
        L1d7:
            java.lang.String r15 = "该消息暂不支持系统分享"
        L1d9:
            if (r15 == 0) goto L20b
            r0.r(r1, r15)
            goto L20b
        L1df:
            r0.getClass()
            r15 = r2
            ca.h r2 = new ca.h
            r3 = 1
            r2.<init>(r0, r1, r15, r3)
            java.lang.String r3 = "选择转发对象"
            java.lang.String r4 = "转发"
            r5 = 0
            r0.p(r1, r2, r3, r4, r5)
            goto L20b
        L1f2:
            r15 = r2
            r0.getClass()
            java.util.List r15 = a.a.x0(r15)
            ca.c0 r15 = r0.j(r1, r15)
            android.content.Intent r2 = r15.f1468a
            if (r2 != 0) goto L208
            java.lang.String r15 = r15.f1469b
            r0.r(r1, r15)
            goto L20b
        L208:
            r0.q(r1, r2)
        L20b:
            sf.n r15 = sf.n.f12433a
            return r15
    }
}
