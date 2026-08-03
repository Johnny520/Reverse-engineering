package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ca.e0 f1513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1515j;

    public /* synthetic */ i(ca.e0 r2, long r3, android.app.Activity r5) {
            r1 = this;
            r0 = 3
            r1.f1512g = r0
            r1.<init>()
            r1.f1513h = r2
            r1.f1515j = r3
            r1.f1514i = r5
            return
    }

    public /* synthetic */ i(ca.e0 r1, android.app.Activity r2, long r3, int r5) {
            r0 = this;
            r0.f1512g = r5
            r0.f1513h = r1
            r0.f1514i = r2
            r0.f1515j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f1512g
            switch(r1) {
                case 0: goto Lc0;
                case 1: goto L7c;
                case 2: goto L55;
                default: goto L7;
            }
        L7:
            r1 = r19
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L15
            r9 = r3
            goto L16
        L15:
            r9 = r2
        L16:
            ca.e0 r5 = r0.f1513h
            r5.getClass()
            db.a r1 = new db.a
            r4 = 7
            long r7 = r0.f1515j
            java.lang.String r6 = java.lang.String.valueOf(r7)
            r1.<init>(r4, r6)
            java.util.List r1 = a.a.x0(r1)
            java.lang.String r1 = a.a.a1(r9, r1)
            android.app.Activity r6 = r0.f1514i
            if (r1 == 0) goto L37
            r5.r(r6, r1)
            goto L52
        L37:
            if (r9 != r3) goto L3b
            r15 = r3
            goto L3c
        L3b:
            r15 = r2
        L3c:
            if (r15 == 0) goto L42
            java.lang.String r1 = "选择官方群发好友"
        L40:
            r13 = r1
            goto L45
        L42:
            java.lang.String r1 = "选择群发对象"
            goto L40
        L45:
            ca.u r4 = new ca.u
            r4.<init>(r5, r6, r7, r9)
            java.lang.String r14 = "发送"
            r12 = r4
            r10 = r5
            r11 = r6
            r10.p(r11, r12, r13, r14, r15)
        L52:
            sf.n r1 = sf.n.f12433a
            return r1
        L55:
            r5 = r19
            java.util.List r5 = (java.util.List) r5
            r5.getClass()
            ca.e0 r2 = r0.f1513h
            r2.getClass()
            db.a r1 = new db.a
            r3 = 7
            long r6 = r0.f1515j
            java.lang.String r4 = java.lang.String.valueOf(r6)
            r1.<init>(r3, r4)
            java.util.List r4 = a.a.x0(r1)
            android.app.Activity r3 = r0.f1514i
            r6 = 0
            java.lang.String r7 = "转发至标签"
            r2.n(r3, r4, r5, r6, r7)
        L79:
            sf.n r1 = sf.n.f12433a
            return r1
        L7c:
            r1 = r19
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = tf.n.e1(r1)
            r5.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L90:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r1.next()
            wb.jv r2 = (wb.jv) r2
            java.lang.String r2 = r2.f17140a
            r5.add(r2)
            goto L90
        La2:
            ca.e0 r2 = r0.f1513h
            r2.getClass()
            db.a r1 = new db.a
            r3 = 7
            long r6 = r0.f1515j
            java.lang.String r4 = java.lang.String.valueOf(r6)
            r1.<init>(r3, r4)
            java.util.List r4 = a.a.x0(r1)
            android.app.Activity r3 = r0.f1514i
            r6 = 0
            java.lang.String r7 = "转发给好友"
            r2.n(r3, r4, r5, r6, r7)
            goto L79
        Lc0:
            r1 = r19
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            ca.e0 r2 = r0.f1513h
            android.app.Activity r3 = r0.f1514i
            long r5 = r0.f1515j
            if (r1 == 0) goto L15e
            r4 = 1
            if (r1 == r4) goto L144
            r4 = 2
            if (r1 == r4) goto L12c
            r4 = 3
            if (r1 == r4) goto Lf6
            r4 = 4
            if (r1 == r4) goto Lde
            goto L174
        Lde:
            r2.getClass()
            r4 = r3
            r3 = r2
            ca.i r2 = new ca.i
            r7 = 2
            r2.<init>(r3, r4, r5, r7)
            ca.l r1 = new ca.l
            r1.<init>(r3, r4, r2)
            java.lang.String r2 = "转发至标签"
            r5 = 0
            r3.e(r4, r1, r2, r5)
            goto L174
        Lf6:
            r4 = r3
            r3 = r2
            r3.getClass()
            sf.e r1 = new sf.e
            java.lang.String r2 = "模块通道"
            java.lang.String r7 = "支持好友、群聊、公众号和标签"
            r1.<init>(r2, r7)
            sf.e r2 = new sf.e
            java.lang.String r7 = "微信原生群发助手"
            java.lang.String r8 = "仅选择好友并按原生队列发送"
            r2.<init>(r7, r8)
            sf.e[] r1 = new sf.e[]{r1, r2}
            java.util.List r1 = a.a.y0(r1)
            ca.i r7 = new ca.i
            r7.<init>(r3, r5, r4)
            bi.c r8 = new bi.c
            r2 = 7
            r8.<init>(r2)
            wb.lv r9 = wb.lv.f17583j
            r3 = r4
            java.lang.String r4 = "选择群发通道"
            java.lang.String r5 = ""
            r6 = r1
            wb.y2.Q1(r3, r4, r5, r6, r7, r8, r9)
            goto L174
        L12c:
            r4 = r3
            r3 = r2
            r3.getClass()
            r1 = r5
            ca.o r6 = new ca.o
            r5 = 0
            r6.<init>(r3, r4, r5)
            java.lang.String r7 = "分享收藏"
            r5 = r4
            r16 = r1
            r2 = r3
            r3 = r16
            r2.f(r3, r5, r6, r7)
            goto L174
        L144:
            r4 = r3
            r3 = r2
            r3.getClass()
            ca.i r2 = new ca.i
            r7 = 1
            r2.<init>(r3, r4, r5, r7)
            java.lang.String r5 = "选择转发对象"
            java.lang.String r6 = "转发"
            r7 = 0
            r16 = r4
            r4 = r2
            r2 = r3
            r3 = r16
            r2.p(r3, r4, r5, r6, r7)
            goto L174
        L15e:
            r4 = r3
            r3 = r2
            r3.getClass()
            r1 = r5
            ca.o r6 = new ca.o
            r6.<init>(r4, r3)
            java.lang.String r7 = "转发到朋友圈"
            r5 = r4
            r16 = r1
            r2 = r3
            r3 = r16
            r2.f(r3, r5, r6, r7)
        L174:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
