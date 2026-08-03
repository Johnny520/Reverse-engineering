package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ca.e0 f1531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f1532j;

    public /* synthetic */ l(android.app.Activity r2, ca.e0 r3, fg.l r4) {
            r1 = this;
            r0 = 1
            r1.f1529g = r0
            r1.<init>()
            r1.f1530h = r2
            r1.f1531i = r3
            r1.f1532j = r4
            return
    }

    public /* synthetic */ l(ca.e0 r2, android.app.Activity r3, fg.l r4) {
            r1 = this;
            r0 = 0
            r1.f1529g = r0
            r1.<init>()
            r1.f1531i = r2
            r1.f1530h = r3
            r1.f1532j = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f1529g
            java.util.List r15 = (java.util.List) r15
            switch(r0) {
                case 0: goto L2f;
                default: goto L7;
            }
        L7:
            r15.getClass()
            android.app.Activity r0 = r14.f1530h
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L2c
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L19
            goto L2c
        L19:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L27
            java.lang.String r15 = "没有可用联系人"
            ca.e0 r1 = r14.f1531i
            r1.r(r0, r15)
            goto L2c
        L27:
            fg.l r0 = r14.f1532j
            r0.invoke(r15)
        L2c:
            sf.n r15 = sf.n.f12433a
            return r15
        L2f:
            r15.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r15.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            r3 = r2
            wb.jv r3 = (wb.jv) r3
            boolean r4 = r3.f17142c
            if (r4 != 0) goto L3b
            boolean r4 = r3.f17146g
            if (r4 != 0) goto L3b
            java.util.List r3 = r3.f17145f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L3b
            r0.add(r2)
            goto L3b
        L5c:
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r15, r2)
            b4.b r15 = new b4.b
            r2 = 14
            r15.<init>(r2)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r1, r3, r15)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            ng.h r15 = new ng.h
            r15.<init>(r2)
        L79:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r15.next()
            r2 = r1
            wb.jv r2 = (wb.jv) r2
            java.lang.String r2 = r2.f17140a
            r6.put(r2, r1)
            goto L79
        L8c:
            uf.c r15 = a.a.E()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L99:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r2.next()
            wb.jv r4 = (wb.jv) r4
            java.util.List r4 = r4.f17145f
            tf.r.h1(r1, r4)
            goto L99
        Lab:
            java.util.Set r1 = tf.m.T1(r1)
            java.util.List r1 = tf.m.P1(r1)
            java.util.List r1 = tf.m.J1(r1)
            java.util.Iterator r1 = r1.iterator()
        Lbb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L10a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            dg.n r4 = new dg.n
            r5 = 6
            r4.<init>(r0, r5)
            ca.s r5 = new ca.s
            r7 = 0
            r5.<init>(r2, r7)
            ng.i r7 = new ng.i
            r7.<init>(r4, r3, r5)
            b4.b r4 = new b4.b
            r5 = 15
            r4.<init>(r5)
            ng.t r4 = ng.m.W(r7, r4)
            ng.c r4 = ng.m.S(r4)
            java.util.List r4 = ng.m.b0(r4)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto Lbb
            ca.a0 r5 = new ca.a0
            java.lang.String r7 = "好友标签 · "
            java.lang.String r2 = wb.en.g(r7, r2)
            int r7 = r4.size()
            java.lang.String r8 = " 人"
            java.lang.String r7 = p.a.i(r7, r8)
            r5.<init>(r2, r7, r4)
            r15.add(r5)
            goto Lbb
        L10a:
            ca.e0 r0 = r14.f1531i
            r8.g r1 = r0.f1481a
            android.content.Context r1 = r1.f11620a
            java.util.List r1 = x6.d.K(r1)
            java.util.Iterator r1 = r1.iterator()
        L118:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L170
            java.lang.Object r2 = r1.next()
            n9.a r2 = (n9.a) r2
            java.util.Set r4 = r2.f9071c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            dg.n r13 = new dg.n
            r5 = 6
            r13.<init>(r4, r5)
            c0.f r4 = new c0.f
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.Class r7 = eh.a.i(r5)
            r11 = 0
            r12 = 11
            r5 = 1
            java.lang.String r8 = "containsKey"
            java.lang.String r9 = "containsKey(Ljava/lang/Object;)Z"
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            ng.i r5 = new ng.i
            r5.<init>(r13, r3, r4)
            ng.c r4 = ng.m.S(r5)
            java.util.List r4 = ng.m.b0(r4)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L118
            ca.a0 r5 = new ca.a0
            java.lang.String r2 = r2.f9070b
            java.lang.String r7 = "群聊标签 · "
            java.lang.String r2 = wb.en.g(r7, r2)
            int r7 = r4.size()
            java.lang.String r8 = " 个群聊"
            java.lang.String r7 = p.a.i(r7, r8)
            r5.<init>(r2, r7, r4)
            r15.add(r5)
            goto L118
        L170:
            uf.c r15 = a.a.t(r15)
            boolean r1 = r15.isEmpty()
            android.app.Activity r2 = r14.f1530h
            if (r1 == 0) goto L182
            java.lang.String r15 = "没有可用的标签"
            r0.r(r2, r15)
            goto L1c4
        L182:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = tf.n.e1(r15)
            r5.<init>(r0)
            r0 = 0
            java.util.ListIterator r0 = r15.listIterator(r0)
        L190:
            r1 = r0
            uf.a r1 = (uf.a) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1ac
            java.lang.Object r1 = r1.next()
            ca.a0 r1 = (ca.a0) r1
            java.lang.String r3 = r1.f1459a
            java.lang.String r1 = r1.f1460b
            sf.e r4 = new sf.e
            r4.<init>(r3, r1)
            r5.add(r4)
            goto L190
        L1ac:
            c9.i r7 = new c9.i
            r0 = 5
            fg.l r1 = r14.f1532j
            r7.<init>(r15, r0, r1)
            bi.c r8 = new bi.c
            r15 = 7
            r8.<init>(r15)
            r9 = 304(0x130, float:4.26E-43)
            java.lang.String r3 = "选择标签"
            java.lang.String r4 = ""
            r6 = 0
            wb.y2.Z1(r2, r3, r4, r5, r6, r7, r8, r9)
        L1c4:
            sf.n r15 = sf.n.f12433a
            return r15
    }
}
