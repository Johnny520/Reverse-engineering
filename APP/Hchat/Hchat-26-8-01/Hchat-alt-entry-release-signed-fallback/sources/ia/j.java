package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ia.q f6582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f6583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f6584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p8.l f6585k;

    public /* synthetic */ j(android.app.Activity r1, ia.q r2, java.lang.String r3, p8.l r4, int r5) {
            r0 = this;
            r0.f6581g = r5
            r0.f6584j = r1
            r0.f6582h = r2
            r0.f6583i = r3
            r0.f6585k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ j(ia.q r2, java.lang.String r3, android.app.Activity r4, p8.l r5) {
            r1 = this;
            r0 = 1
            r1.f6581g = r0
            r1.<init>()
            r1.f6582h = r2
            r1.f6583i = r3
            r1.f6584j = r4
            r1.f6585k = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f6581g
            switch(r1) {
                case 0: goto L97;
                case 1: goto L33;
                default: goto L7;
            }
        L7:
            r3 = r18
            java.util.List r3 = (java.util.List) r3
            r3.getClass()
            ia.j r4 = new ia.j
            r9 = 0
            android.app.Activity r2 = r0.f6584j
            ia.q r6 = r0.f6582h
            java.lang.String r7 = r0.f6583i
            p8.l r8 = r0.f6585k
            r5 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            k.s1 r5 = new k.s1
            r1 = 7
            r5.<init>(r1)
            r11 = 1
            r12 = 2944(0xb80, float:4.125E-42)
            java.lang.String r6 = "选择评论好友"
            java.lang.String r7 = "下一步"
            r8 = 0
            r9 = 0
            r10 = 0
            wb.y2.U1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L30:
            sf.n r1 = sf.n.f12433a
            return r1
        L33:
            r1 = r18
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            ia.q r2 = r0.f6582h
            b5.c r3 = r2.f6621a
            java.lang.String r4 = r0.f6583i
            ia.c r5 = r3.l(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r1)
            r6.<init>(r7)
            java.util.Iterator r7 = r1.iterator()
        L51:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r7.next()
            wb.jv r8 = (wb.jv) r8
            ia.d r9 = new ia.d
            java.lang.String r10 = r8.f17140a
            java.lang.String r8 = r8.f17141b
            r9.<init>(r10, r8)
            r6.add(r9)
            goto L51
        L6a:
            android.content.SharedPreferences r7 = r2.f6624d
            java.lang.String r8 = "fake_like_random_order"
            r9 = 0
            boolean r7 = r7.getBoolean(r8, r9)
            if (r7 == 0) goto L7c
            java.util.List r6 = tf.m.S1(r6)
            java.util.Collections.shuffle(r6)
        L7c:
            r3.T(r4, r6)
            ia.a0 r2 = r2.f6622b
            android.app.Activity r3 = r0.f6584j
            p8.l r4 = r0.f6585k
            r2.a(r3, r4, r5)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L91
            java.lang.String r1 = "已恢复真实点赞"
            goto L93
        L91:
            java.lang.String r1 = "伪集赞已更新"
        L93:
            ia.q.j(r3, r1)
            goto L30
        L97:
            r1 = r18
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            java.lang.Object r1 = tf.m.I1(r1)
            r6 = r1
            wb.jv r6 = (wb.jv) r6
            if (r6 == 0) goto Lcb
            java.lang.String r9 = r6.f17141b
            eb.o r14 = new eb.o
            android.app.Activity r3 = r0.f6584j
            ia.q r4 = r0.f6582h
            java.lang.String r5 = r0.f6583i
            p8.l r7 = r0.f6585k
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            k.s1 r15 = new k.s1
            r1 = 7
            r15.<init>(r1)
            r16 = 584(0x248, float:8.18E-43)
            java.lang.String r8 = "填写伪评论"
            r10 = 0
            java.lang.String r11 = "请输入评论内容"
            r12 = 1000(0x3e8, float:1.401E-42)
            r13 = 0
            r7 = r3
            wb.y2.c2(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Lcb:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
