package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.h2 f16481a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Set f16482b = null;

    static {
            wb.h2 r0 = new wb.h2
            r0.<init>()
            wb.h2.f16481a = r0
            java.lang.String r6 = "qmessage"
            java.lang.String r7 = "floatbottle"
            java.lang.String r1 = "message_fold"
            java.lang.String r2 = "conversationboxservice"
            java.lang.String r3 = "officialaccounts"
            java.lang.String r4 = "appbrand_notify_message"
            java.lang.String r5 = "notifymessage"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.util.Set r0 = tf.d0.W(r0)
            wb.h2.f16482b = r0
            return
    }

    public static final wb.f2 f(java.lang.String r25, java.util.List r26) {
            h8.a r1 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            if (r1 == 0) goto L4c2
            g8.i r2 = wb.en.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r26.iterator()
        L13:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L25
            java.lang.Object r4 = r3.next()
            c9.a r4 = (c9.a) r4
            java.util.List r4 = r4.f1085e
            tf.r.h1(r0, r4)
            goto L13
        L25:
            java.util.Set r3 = tf.m.U1(r0)
            tf.t r4 = tf.t.f13167g
            r5 = 0
            if (r2 == 0) goto L35
            java.util.ArrayList r0 = r2.y()     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            goto L85
        L35:
            r0 = r5
        L36:
            if (r0 != 0) goto L39
            r0 = r4
        L39:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            int r7 = tf.n.e1(r0)     // Catch: java.lang.Throwable -> L33
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L33
        L46:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L60
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L33
            h.Hchat.hooks.api.model.WeChatContact r7 = (h.Hchat.hooks.api.model.WeChatContact) r7     // Catch: java.lang.Throwable -> L33
            java.lang.String r7 = r7.wxId     // Catch: java.lang.Throwable -> L33
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> L33
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L33
            r6.add(r7)     // Catch: java.lang.Throwable -> L33
            goto L46
        L60:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L33
        L69:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L80
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L33
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L33
            if (r8 != 0) goto L69
            r0.add(r7)     // Catch: java.lang.Throwable -> L33
            goto L69
        L80:
            java.util.Set r0 = tf.m.U1(r0)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L85:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L8b:
            boolean r6 = r0 instanceof sf.f
            tf.v r7 = tf.v.f13169g
            if (r6 == 0) goto L93
            r0 = r7
        L93:
            r6 = r0
            java.util.Set r6 = (java.util.Set) r6
            if (r2 == 0) goto L9f
            java.lang.String r0 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"
            java.util.ArrayList r0 = r2.U(r0, r5)     // Catch: java.lang.Throwable -> Lca
            goto La0
        L9f:
            r0 = r5
        La0:
            if (r0 != 0) goto La3
            r0 = r4
        La3:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lca
            int r9 = tf.n.e1(r0)     // Catch: java.lang.Throwable -> Lca
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lca
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lca
        Lb0:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> Lca
            if (r9 == 0) goto Lcc
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> Lca
            h.Hchat.hooks.api.model.WeChatContact r9 = (h.Hchat.hooks.api.model.WeChatContact) r9     // Catch: java.lang.Throwable -> Lca
            java.lang.String r9 = r9.wxId     // Catch: java.lang.Throwable -> Lca
            java.lang.CharSequence r9 = og.m.R0(r9)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lca
            r8.add(r9)     // Catch: java.lang.Throwable -> Lca
            goto Lb0
        Lca:
            r0 = move-exception
            goto Lf1
        Lcc:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lca
            r0.<init>()     // Catch: java.lang.Throwable -> Lca
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lca
        Ld5:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> Lca
            if (r9 == 0) goto Lec
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> Lca
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lca
            boolean r10 = og.m.t0(r10)     // Catch: java.lang.Throwable -> Lca
            if (r10 != 0) goto Ld5
            r0.add(r9)     // Catch: java.lang.Throwable -> Lca
            goto Ld5
        Lec:
            java.util.Set r0 = tf.m.U1(r0)     // Catch: java.lang.Throwable -> Lca
            goto Lf7
        Lf1:
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        Lf7:
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto Lfd
            goto Lfe
        Lfd:
            r7 = r0
        Lfe:
            java.util.Set r7 = (java.util.Set) r7
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            if (r2 == 0) goto L113
            java.util.ArrayList r0 = r2.p()     // Catch: java.lang.Throwable -> L10c
            goto L114
        L10c:
            r0 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r0)
            goto L119
        L113:
            r0 = r5
        L114:
            if (r0 != 0) goto L118
            r9 = r4
            goto L119
        L118:
            r9 = r0
        L119:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L11f
            r9 = r4
        L11f:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r0 = r9.iterator()
        L125:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L16e
            java.lang.Object r9 = r0.next()
            h.Hchat.hooks.api.model.ContactLabelBean r9 = (h.Hchat.hooks.api.model.ContactLabelBean) r9
            java.lang.String r10 = r9.labelName
            boolean r11 = og.m.t0(r10)
            if (r11 == 0) goto L13b
            java.lang.String r10 = r9.labelId
        L13b:
            boolean r11 = og.m.t0(r10)
            if (r11 == 0) goto L142
            goto L125
        L142:
            java.util.List<java.lang.String> r9 = r9.userNameList
            java.util.Iterator r9 = r9.iterator()
        L148:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L125
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L148
            java.lang.Object r12 = r8.get(r11)
            if (r12 != 0) goto L168
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r8.put(r11, r12)
        L168:
            java.util.List r12 = (java.util.List) r12
            r12.add(r10)
            goto L148
        L16e:
            java.util.ArrayList r0 = g(r26)
            int r9 = tf.n.e1(r0)
            int r9 = tf.y.a0(r9)
            r10 = 16
            if (r9 >= r10) goto L17f
            r9 = r10
        L17f:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r9)
            java.util.Iterator r0 = r0.iterator()
        L188:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L19e
            java.lang.Object r9 = r0.next()
            wb.g2 r9 = (wb.g2) r9
            c9.a r11 = r9.f16297a
            java.lang.String r11 = r11.f1081a
            java.lang.String r9 = r9.f16299c
            r10.put(r11, r9)
            goto L188
        L19e:
            uf.g r0 = new uf.g
            r0.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r11 = r26.iterator()
        L1ac:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1c7
            java.lang.Object r12 = r11.next()
            r13 = r12
            c9.a r13 = (c9.a) r13
            java.lang.String r13 = r13.f1081a
            r14 = r25
            boolean r13 = gg.l.a(r13, r14)
            if (r13 != 0) goto L1ac
            r9.add(r12)
            goto L1ac
        L1c7:
            java.util.Iterator r9 = r9.iterator()
        L1cb:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L207
            java.lang.Object r11 = r9.next()
            c9.a r11 = (c9.a) r11
            java.util.List r12 = r11.f1085e
            java.util.Iterator r12 = r12.iterator()
        L1dd:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1cb
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = r11.f1081a
            java.lang.Object r14 = r10.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L1dd
            boolean r15 = og.m.t0(r14)
            if (r15 != 0) goto L1fa
            goto L1fb
        L1fa:
            r14 = r5
        L1fb:
            if (r14 == 0) goto L1dd
            java.lang.String r15 = "已在："
            java.lang.String r14 = r15.concat(r14)
            r0.put(r13, r14)
            goto L1dd
        L207:
            uf.g r9 = r0.c()
            java.util.ArrayList r0 = r1.c()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L218:
            boolean r0 = r11.hasNext()
            java.lang.String r12 = ""
            r14 = 1
            if (r0 == 0) goto L338
            java.lang.Object r0 = r11.next()
            l8.b r0 = (l8.b) r0
            java.lang.String r0 = r0.f7898a
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r15 = r0.toString()
            boolean r0 = og.m.t0(r15)
            if (r0 != 0) goto L335
            boolean r0 = c9.d2.q(r15)
            if (r0 != 0) goto L335
            java.util.Set r0 = wb.h2.f16482b
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L247
            goto L335
        L247:
            if (r2 == 0) goto L255
            h.Hchat.hooks.api.model.WeChatContact r0 = r2.n(r15)     // Catch: java.lang.Throwable -> L24e
            goto L256
        L24e:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            goto L257
        L255:
            r0 = 0
        L256:
            r5 = r0
        L257:
            boolean r0 = r5 instanceof sf.f
            if (r0 == 0) goto L25d
            r5 = 0
        L25d:
            h.Hchat.hooks.api.model.WeChatContact r5 = (h.Hchat.hooks.api.model.WeChatContact) r5
            if (r5 != 0) goto L271
            java.lang.String r0 = "filehelper"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L271
            boolean r0 = r3.contains(r15)
            if (r0 != 0) goto L271
            goto L335
        L271:
            if (r5 == 0) goto L27b
            boolean r0 = r5.isGroup()
            if (r0 != r14) goto L27b
            r0 = r14
            goto L27c
        L27b:
            r0 = 0
        L27c:
            if (r5 == 0) goto L283
            java.lang.String r16 = r9.e0.Z(r5, r0)
            goto L285
        L283:
            r16 = 0
        L285:
            if (r16 != 0) goto L289
            r16 = r12
        L289:
            boolean r17 = og.m.t0(r16)
            if (r17 == 0) goto L29b
            java.lang.String r16 = r1.b(r15)
            boolean r17 = og.m.t0(r16)
            if (r17 == 0) goto L29b
            r16 = r15
        L29b:
            r17 = r16
            if (r5 == 0) goto L2a2
            java.lang.String r13 = r5.avatarUrl
            goto L2a3
        L2a2:
            r13 = 0
        L2a3:
            if (r13 != 0) goto L2a8
            r19 = r12
            goto L2aa
        L2a8:
            r19 = r13
        L2aa:
            if (r5 == 0) goto L2af
            java.lang.String r13 = r5.avatarBackupUrl
            goto L2b0
        L2af:
            r13 = 0
        L2b0:
            if (r13 != 0) goto L2b5
            r20 = r12
            goto L2b7
        L2b5:
            r20 = r13
        L2b7:
            java.lang.Object r13 = r8.get(r15)
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L2c0
            r13 = r4
        L2c0:
            java.util.Set r13 = tf.m.T1(r13)
            java.util.List r21 = tf.m.P1(r13)
            if (r5 == 0) goto L2d6
            boolean r13 = r5.isOfficialAccount()
            if (r13 != r14) goto L2d2
            r13 = r14
            goto L2d3
        L2d2:
            r13 = 0
        L2d3:
            r22 = r13
            goto L2d8
        L2d6:
            r22 = 0
        L2d8:
            java.lang.Object r13 = r9.get(r15)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L2e3
            r23 = r12
            goto L2e5
        L2e3:
            r23 = r13
        L2e5:
            if (r5 == 0) goto L2ea
            java.lang.String r12 = r5.remarkName
            goto L2eb
        L2ea:
            r12 = 0
        L2eb:
            if (r5 == 0) goto L2f0
            java.lang.String r13 = r5.nickname
            goto L2f1
        L2f0:
            r13 = 0
        L2f1:
            if (r5 == 0) goto L2f6
            java.lang.String r5 = r5.customWxId
            goto L2f7
        L2f6:
            r5 = 0
        L2f7:
            java.lang.String[] r5 = new java.lang.String[]{r12, r13, r5, r15}
            java.util.ArrayList r5 = a.a.z0(r5)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r5 = r5.iterator()
        L308:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L31f
            java.lang.Object r13 = r5.next()
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = og.m.t0(r14)
            if (r14 != 0) goto L308
            r12.add(r13)
            goto L308
        L31f:
            java.util.Set r5 = tf.m.T1(r12)
            java.util.List r24 = tf.m.P1(r5)
            r16 = r15
            wb.s0 r15 = new wb.s0
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = r16
            r10.put(r5, r15)
        L335:
            r5 = 0
            goto L218
        L338:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L343:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L35a
            java.lang.Object r5 = r3.next()
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r10.containsKey(r11)
            if (r11 != 0) goto L343
            r0.add(r5)
            goto L343
        L35a:
            java.util.Iterator r3 = r0.iterator()
        L35e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L465
            java.lang.Object r0 = r3.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L379
            h.Hchat.hooks.api.model.WeChatContact r0 = r2.n(r5)     // Catch: java.lang.Throwable -> L372
            goto L37a
        L372:
            r0 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r0)
            goto L37b
        L379:
            r0 = 0
        L37a:
            r11 = r0
        L37b:
            boolean r0 = r11 instanceof sf.f
            if (r0 == 0) goto L381
            r11 = 0
        L381:
            h.Hchat.hooks.api.model.WeChatContact r11 = (h.Hchat.hooks.api.model.WeChatContact) r11
            if (r11 == 0) goto L38c
            boolean r0 = r11.isGroup()
            if (r0 != r14) goto L38c
            goto L3a0
        L38c:
            java.lang.String r0 = "@chatroom"
            r13 = 0
            boolean r0 = og.t.W(r5, r0, r13)
            if (r0 != 0) goto L3a0
            java.lang.String r0 = "@im.chatroom"
            boolean r0 = og.t.W(r5, r0, r13)
            if (r0 == 0) goto L39e
            goto L3a0
        L39e:
            r13 = 0
            goto L3a1
        L3a0:
            r13 = r14
        L3a1:
            if (r11 == 0) goto L3a8
            java.lang.String r0 = r9.e0.Z(r11, r13)
            goto L3a9
        L3a8:
            r0 = 0
        L3a9:
            if (r0 != 0) goto L3ac
            r0 = r12
        L3ac:
            boolean r15 = og.m.t0(r0)
            if (r15 == 0) goto L3bd
            java.lang.String r0 = r1.b(r5)
            boolean r15 = og.m.t0(r0)
            if (r15 == 0) goto L3bd
            r0 = r5
        L3bd:
            r17 = r0
            r17.getClass()
            if (r11 == 0) goto L3c7
            java.lang.String r0 = r11.avatarUrl
            goto L3c8
        L3c7:
            r0 = 0
        L3c8:
            if (r0 != 0) goto L3cd
            r19 = r12
            goto L3cf
        L3cd:
            r19 = r0
        L3cf:
            if (r11 == 0) goto L3d4
            java.lang.String r0 = r11.avatarBackupUrl
            goto L3d5
        L3d4:
            r0 = 0
        L3d5:
            if (r0 != 0) goto L3da
            r20 = r12
            goto L3dc
        L3da:
            r20 = r0
        L3dc:
            java.lang.Object r0 = r8.get(r5)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L3e5
            r0 = r4
        L3e5:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r21 = tf.m.P1(r0)
            if (r11 == 0) goto L3f7
            boolean r0 = r11.isOfficialAccount()
            if (r0 != r14) goto L3f7
            r15 = 0
            goto L400
        L3f7:
            java.lang.String r0 = "gh_"
            r15 = 0
            boolean r0 = og.t.d0(r5, r0, r15)
            if (r0 == 0) goto L403
        L400:
            r22 = r14
            goto L405
        L403:
            r22 = r15
        L405:
            java.lang.Object r0 = r9.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L410
            r23 = r12
            goto L412
        L410:
            r23 = r0
        L412:
            if (r11 == 0) goto L417
            java.lang.String r0 = r11.remarkName
            goto L418
        L417:
            r0 = 0
        L418:
            if (r11 == 0) goto L41d
            java.lang.String r14 = r11.nickname
            goto L41e
        L41d:
            r14 = 0
        L41e:
            if (r11 == 0) goto L423
            java.lang.String r11 = r11.customWxId
            goto L424
        L423:
            r11 = 0
        L424:
            java.lang.String[] r0 = new java.lang.String[]{r0, r14, r11, r5}
            java.util.ArrayList r0 = a.a.z0(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L435:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L44d
            java.lang.Object r14 = r0.next()
            r16 = r14
            java.lang.String r16 = (java.lang.String) r16
            boolean r16 = og.m.t0(r16)
            if (r16 != 0) goto L435
            r11.add(r14)
            goto L435
        L44d:
            java.util.Set r0 = tf.m.T1(r11)
            java.util.List r24 = tf.m.P1(r0)
            r11 = r15
            wb.s0 r15 = new wb.s0
            r16 = r5
            r18 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r10.put(r5, r15)
            r14 = 1
            goto L35e
        L465:
            java.util.Collection r0 = r10.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = tf.m.P1(r0)
            java.util.Collection r1 = r10.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L484:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L499
            java.lang.Object r3 = r1.next()
            r4 = r3
            wb.s0 r4 = (wb.s0) r4
            boolean r4 = r4.f18976g
            if (r4 == 0) goto L484
            r2.add(r3)
            goto L484
        L499:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = tf.n.e1(r2)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L4a6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4b8
            java.lang.Object r3 = r2.next()
            wb.s0 r3 = (wb.s0) r3
            java.lang.String r3 = r3.f18970a
            r1.add(r3)
            goto L4a6
        L4b8:
            java.util.LinkedHashSet r1 = tf.d0.U(r7, r1)
            wb.f2 r2 = new wb.f2
            r2.<init>(r0, r6, r1)
            return r2
        L4c2:
            java.lang.String r0 = "会话列表不可用"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    public static java.util.ArrayList g(java.util.List r6) {
            java.util.ArrayList r6 = c9.o2.l(r6)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Ld:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r6.next()
            r2 = r1
            c9.a r2 = (c9.a) r2
            java.lang.String r2 = r2.f1083c
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L2a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L2a:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto Ld
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r4 = 0
            tf.t r5 = tf.t.f13167g
            r3 = 0
            h(r0, r1, r2, r3, r4, r5)
            return r2
    }

    public static final void h(java.util.LinkedHashMap r8, java.util.HashSet r9, java.util.ArrayList r10, java.lang.String r11, int r12, java.util.List r13) {
            java.lang.Object r11 = r8.get(r11)
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto La
            tf.t r11 = tf.t.f13167g
        La:
            wb.e2 r0 = new wb.e2
            r1 = 1
            r0.<init>(r1)
            java.util.List r11 = tf.m.K1(r11, r0)
            java.util.Iterator r11 = r11.iterator()
        L18:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r11.next()
            c9.a r0 = (c9.a) r0
            java.lang.String r1 = r0.f1081a
            boolean r1 = r9.add(r1)
            if (r1 != 0) goto L30
            r2 = r8
            r3 = r9
            r4 = r10
            goto L54
        L30:
            java.lang.String r1 = r0.f1082b
            java.util.ArrayList r2 = tf.m.G1(r13, r1)
            wb.g2 r1 = new wb.g2
            r6 = 0
            r7 = 62
            java.lang.String r3 = " / "
            r4 = 0
            r5 = 0
            java.lang.String r3 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            r1.<init>(r0, r12, r3)
            r10.add(r1)
            java.lang.String r5 = r0.f1081a
            int r6 = r12 + 1
            r3 = r9
            r4 = r10
            r7 = r2
            r2 = r8
            h(r2, r3, r4, r5, r6, r7)
        L54:
            r8 = r2
            r9 = r3
            r10 = r4
            goto L18
        L58:
            return
    }

    public final void a(android.content.Context r30, c9.a r31, java.util.List r32, fg.a r33, fg.l r34, i0.h0 r35, int r36) {
            r29 = this;
            r3 = r31
            r4 = r32
            r8 = r35
            r0 = -2123217869(0xffffffff81724433, float:-4.449731E-38)
            r8.b0(r0)
            boolean r0 = r8.f(r3)
            r1 = 32
            if (r0 == 0) goto L16
            r0 = r1
            goto L18
        L16:
            r0 = 16
        L18:
            r0 = r36 | r0
            boolean r2 = r8.f(r4)
            if (r2 == 0) goto L23
            r2 = 256(0x100, float:3.59E-43)
            goto L25
        L23:
            r2 = 128(0x80, float:1.8E-43)
        L25:
            r0 = r0 | r2
            r12 = r33
            boolean r2 = r8.h(r12)
            if (r2 == 0) goto L31
            r2 = 2048(0x800, float:2.87E-42)
            goto L33
        L31:
            r2 = 1024(0x400, float:1.435E-42)
        L33:
            r0 = r0 | r2
            r10 = r34
            boolean r2 = r8.h(r10)
            if (r2 == 0) goto L3f
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L41
        L3f:
            r2 = 8192(0x2000, float:1.148E-41)
        L41:
            r0 = r0 | r2
            r2 = r0 & 9361(0x2491, float:1.3118E-41)
            r6 = 9360(0x2490, float:1.3116E-41)
            if (r2 == r6) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            r6 = r0 & 1
            boolean r2 = r8.S(r6, r2)
            if (r2 == 0) goto L370
            java.lang.String r13 = r3.f1081a
            boolean r2 = r8.f(r13)
            java.lang.Object r6 = r8.P()
            i0.e r14 = i0.l.f5952a
            if (r2 != 0) goto L63
            if (r6 != r14) goto L6c
        L63:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            i0.j1 r6 = i0.r.u(r2)
            r8.k0(r6)
        L6c:
            i0.a1 r6 = (i0.a1) r6
            boolean r2 = r8.f(r13)
            java.lang.Object r7 = r8.P()
            java.lang.String r15 = ""
            if (r2 != 0) goto L7c
            if (r7 != r14) goto L83
        L7c:
            i0.j1 r7 = i0.r.u(r15)
            r8.k0(r7)
        L83:
            r2 = r7
            i0.a1 r2 = (i0.a1) r2
            boolean r7 = r8.f(r13)
            java.lang.Object r9 = r8.P()
            if (r7 != 0) goto L92
            if (r9 != r14) goto La2
        L92:
            wb.f2 r7 = new wb.f2
            tf.v r9 = tf.v.f13169g
            tf.t r11 = tf.t.f13167g
            r7.<init>(r11, r9, r9)
            i0.j1 r9 = i0.r.u(r7)
            r8.k0(r9)
        La2:
            i0.a1 r9 = (i0.a1) r9
            boolean r7 = r8.f(r13)
            java.lang.Object r11 = r8.P()
            if (r7 != 0) goto Lb0
            if (r11 != r14) goto Lb7
        Lb0:
            i0.j1 r11 = i0.r.u(r15)
            r8.k0(r11)
        Lb7:
            r19 = r11
            i0.a1 r19 = (i0.a1) r19
            boolean r7 = r8.f(r13)
            java.lang.Object r11 = r8.P()
            if (r7 != 0) goto Lc7
            if (r11 != r14) goto Ld0
        Lc7:
            wb.t0 r7 = wb.t0.f19154m
            i0.j1 r11 = i0.r.u(r7)
            r8.k0(r11)
        Ld0:
            i0.a1 r11 = (i0.a1) r11
            boolean r7 = r8.f(r13)
            java.lang.Object r5 = r8.P()
            if (r7 != 0) goto Lde
            if (r5 != r14) goto Le5
        Lde:
            i0.j1 r5 = i0.r.u(r15)
            r8.k0(r5)
        Le5:
            r15 = r5
            i0.a1 r15 = (i0.a1) r15
            r5 = r0 & 112(0x70, float:1.57E-43)
            if (r5 == r1) goto Lee
            r7 = 0
            goto Lef
        Lee:
            r7 = 1
        Lef:
            java.lang.Object r1 = r8.P()
            if (r7 != 0) goto Lf7
            if (r1 != r14) goto L100
        Lf7:
            java.util.List r1 = r3.f1085e
            java.util.Set r1 = tf.m.U1(r1)
            r8.k0(r1)
        L100:
            java.util.Set r1 = (java.util.Set) r1
            r7 = 32
            if (r5 == r7) goto L10a
            r7 = 0
        L107:
            r21 = r1
            goto L10c
        L10a:
            r7 = 1
            goto L107
        L10c:
            java.lang.Object r1 = r8.P()
            if (r7 != 0) goto L114
            if (r1 != r14) goto L11b
        L114:
            i0.j1 r1 = i0.r.u(r21)
            r8.k0(r1)
        L11b:
            r26 = r1
            i0.a1 r26 = (i0.a1) r26
            r27 = 1
            r.z r17 = r.b0.a(r8)
            r28 = 0
            sh.x r16 = sh.s.i(r8)
            boolean r1 = r8.f(r6)
            boolean r7 = r8.f(r2)
            r1 = r1 | r7
            r0 = r0 & 896(0x380, float:1.256E-42)
            r7 = 256(0x100, float:3.59E-43)
            if (r0 == r7) goto L13d
            r0 = r28
            goto L13f
        L13d:
            r0 = r27
        L13f:
            r0 = r0 | r1
            r7 = 32
            if (r5 == r7) goto L147
            r1 = r28
            goto L149
        L147:
            r1 = r27
        L149:
            r0 = r0 | r1
            boolean r1 = r8.f(r9)
            r0 = r0 | r1
            java.lang.Object r1 = r8.P()
            if (r0 != 0) goto L15e
            if (r1 != r14) goto L158
            goto L15e
        L158:
            r0 = r1
            r1 = r4
            r5 = r9
            r9 = r21
            goto L171
        L15e:
            f0.b r0 = new f0.b
            r1 = r6
            r6 = 0
            r7 = 7
            r5 = r4
            r4 = r3
            r3 = r5
            r5 = r9
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r6 = r1
            r1 = r3
            r8.k0(r0)
        L171:
            fg.p r0 = (fg.p) r0
            i0.r.g(r13, r1, r0, r8)
            java.lang.Object r0 = r5.getValue()
            wb.f2 r0 = (wb.f2) r0
            java.util.List r0 = r0.f16053a
            boolean r3 = r8.f(r0)
            java.lang.Object r4 = r8.P()
            if (r3 != 0) goto L18a
            if (r4 != r14) goto L1ba
        L18a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L193:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L1a5
            java.lang.Object r7 = r4.next()
            wb.s0 r7 = (wb.s0) r7
            java.util.List r7 = r7.f18975f
            tf.r.h1(r3, r7)
            goto L193
        L1a5:
            java.util.Set r3 = tf.m.T1(r3)
            java.util.List r3 = tf.m.P1(r3)
            wb.e2 r4 = new wb.e2
            r7 = 0
            r4.<init>(r7)
            java.util.List r4 = tf.m.K1(r3, r4)
            r8.k0(r4)
        L1ba:
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r11.getValue()
            wb.t0 r3 = (wb.t0) r3
            boolean r7 = r8.f(r11)
            boolean r13 = r8.f(r15)
            r7 = r7 | r13
            boolean r13 = r8.h(r4)
            r7 = r7 | r13
            java.lang.Object r13 = r8.P()
            if (r7 != 0) goto L1de
            if (r13 != r14) goto L1d9
            goto L1de
        L1d9:
            r18 = r11
            r21 = r15
            goto L1f6
        L1de:
            wb.d2 r20 = new wb.d2
            r25 = 0
            r24 = 0
            r21 = r4
            r22 = r11
            r23 = r15
            r20.<init>(r21, r22, r23, r24, r25)
            r13 = r20
            r18 = r22
            r21 = r23
            r8.k0(r13)
        L1f6:
            fg.p r13 = (fg.p) r13
            i0.r.g(r3, r4, r13, r8)
            java.lang.Object r3 = r19.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r3 = j8.b.l(r7, r3, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L218:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L2a1
            java.lang.Object r11 = r0.next()
            r13 = r11
            wb.s0 r13 = (wb.s0) r13
            java.lang.Object r15 = r18.getValue()
            wb.t0 r15 = (wb.t0) r15
            int r15 = r15.ordinal()
            if (r15 == 0) goto L286
            r20 = r0
            r0 = r27
            if (r15 == r0) goto L283
            r0 = 2
            if (r15 == r0) goto L274
            r0 = 3
            if (r15 == r0) goto L246
            r0 = 4
            if (r15 != r0) goto L242
        L240:
            r0 = 1
            goto L296
        L242:
            okio.a.k()
            return
        L246:
            java.lang.Object r0 = r21.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L271
            java.lang.Object r0 = r5.getValue()
            wb.f2 r0 = (wb.f2) r0
            java.util.Set r0 = r0.f16054b
            java.lang.String r15 = r13.f18970a
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L271
            java.util.List r0 = r13.f18975f
            java.lang.Object r13 = r21.getValue()
            java.lang.String r13 = (java.lang.String) r13
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L271
            goto L240
        L271:
            r0 = r28
            goto L296
        L274:
            java.lang.Object r0 = r5.getValue()
            wb.f2 r0 = (wb.f2) r0
            java.util.Set r0 = r0.f16055c
            java.lang.String r13 = r13.f18970a
            boolean r0 = r0.contains(r13)
            goto L296
        L283:
            boolean r0 = r13.f18972c
            goto L296
        L286:
            r20 = r0
            java.lang.Object r0 = r5.getValue()
            wb.f2 r0 = (wb.f2) r0
            java.util.Set r0 = r0.f16054b
            java.lang.String r13 = r13.f18970a
            boolean r0 = r0.contains(r13)
        L296:
            if (r0 == 0) goto L29b
            r7.add(r11)
        L29b:
            r0 = r20
            r27 = 1
            goto L218
        L2a1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r7.iterator()
        L2aa:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L2c1
            java.lang.Object r7 = r5.next()
            r11 = r7
            wb.s0 r11 = (wb.s0) r11
            boolean r11 = wb.ho.i6(r11, r3)
            if (r11 == 0) goto L2aa
            r0.add(r7)
            goto L2aa
        L2c1:
            boolean r3 = r8.h(r9)
            java.lang.Object r5 = r8.P()
            if (r3 != 0) goto L2cd
            if (r5 != r14) goto L2d6
        L2cd:
            ia.p r5 = new ia.p
            r3 = 1
            r5.<init>(r9, r3)
            r8.k0(r5)
        L2d6:
            fg.l r5 = (fg.l) r5
            java.util.ArrayList r22 = wb.ho.f7(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = tf.n.e1(r22)
            r0.<init>(r3)
            java.util.Iterator r3 = r22.iterator()
        L2e9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2fb
            java.lang.Object r5 = r3.next()
            wb.s0 r5 = (wb.s0) r5
            java.lang.String r5 = r5.f18970a
            r0.add(r5)
            goto L2e9
        L2fb:
            java.util.Set r13 = tf.m.U1(r0)
            r0 = r13
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L338
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r3 = r26.getValue()
            java.util.Set r3 = (java.util.Set) r3
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L31f
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L31f
            goto L336
        L31f:
            java.util.Iterator r0 = r0.iterator()
        L323:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L336
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L323
            goto L338
        L336:
            r14 = 1
            goto L33a
        L338:
            r14 = r28
        L33a:
            sh.m r9 = new sh.m
            r15 = 1
            r11 = r26
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r25 = r11
            r0 = 468628114(0x1beeb292, float:3.9489196E-22)
            s0.d r5 = s0.i.e(r0, r9, r8)
            wb.d1 r15 = new wb.d1
            r24 = r2
            r20 = r4
            r23 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = -1788958376(0xffffffff955ea958, float:-4.4966132E-26)
            s0.d r6 = s0.i.e(r0, r15, r8)
            r8 = 1769526(0x1b0036, float:2.479634E-39)
            r9 = 24
            java.lang.String r0 = "选择分组会话"
            java.lang.String r1 = "选择分组会话"
            r3 = 0
            r4 = 0
            r7 = r35
            r2 = r16
            wb.ho.B2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L373
        L370:
            r35.V()
        L373:
            i0.r1 r8 = r35.t()
            if (r8 == 0) goto L38e
            c9.z0 r0 = new c9.z0
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L38e:
            return
    }

    public final void b(android.content.Context r35, c9.a r36, java.util.List r37, boolean r38, fg.a r39, fg.l r40, fg.l r41, fg.l r42, fg.a r43, i0.h0 r44, int r45) {
            r34 = this;
            r7 = r36
            r13 = r38
            r14 = r43
            r15 = r44
            r0 = 110994553(0x69da479, float:5.9298507E-35)
            r15.b0(r0)
            r0 = r35
            boolean r1 = r15.h(r0)
            if (r1 == 0) goto L18
            r1 = 4
            goto L19
        L18:
            r1 = 2
        L19:
            r1 = r45 | r1
            boolean r2 = r15.f(r7)
            r3 = 32
            if (r2 == 0) goto L25
            r2 = r3
            goto L27
        L25:
            r2 = 16
        L27:
            r1 = r1 | r2
            r2 = r37
            boolean r4 = r15.f(r2)
            if (r4 == 0) goto L33
            r4 = 256(0x100, float:3.59E-43)
            goto L35
        L33:
            r4 = 128(0x80, float:1.8E-43)
        L35:
            r1 = r1 | r4
            boolean r4 = r15.g(r13)
            if (r4 == 0) goto L3f
            r4 = 2048(0x800, float:2.87E-42)
            goto L41
        L3f:
            r4 = 1024(0x400, float:1.435E-42)
        L41:
            r1 = r1 | r4
            r4 = r40
            boolean r5 = r15.h(r4)
            if (r5 == 0) goto L4d
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L4f
        L4d:
            r5 = 65536(0x10000, float:9.1835E-41)
        L4f:
            r1 = r1 | r5
            r5 = r41
            boolean r6 = r15.h(r5)
            if (r6 == 0) goto L5b
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L5d
        L5b:
            r6 = 524288(0x80000, float:7.34684E-40)
        L5d:
            r1 = r1 | r6
            r6 = r42
            boolean r8 = r15.h(r6)
            if (r8 == 0) goto L69
            r8 = 8388608(0x800000, float:1.1754944E-38)
            goto L6b
        L69:
            r8 = 4194304(0x400000, float:5.877472E-39)
        L6b:
            r1 = r1 | r8
            boolean r8 = r15.h(r14)
            if (r8 == 0) goto L75
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            goto L77
        L75:
            r8 = 33554432(0x2000000, float:9.403955E-38)
        L77:
            r1 = r1 | r8
            r8 = 38347923(0x2492493, float:1.4777644E-37)
            r8 = r8 & r1
            r9 = 38347922(0x2492492, float:1.4777643E-37)
            r10 = 1
            r11 = 0
            if (r8 == r9) goto L85
            r8 = r10
            goto L86
        L85:
            r8 = r11
        L86:
            r9 = r1 & 1
            boolean r8 = r15.S(r9, r8)
            if (r8 == 0) goto L1e3
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 == r3) goto L93
            r10 = r11
        L93:
            java.lang.Object r1 = r15.P()
            i0.e r3 = i0.l.f5952a
            if (r10 != 0) goto L9d
            if (r1 != r3) goto La6
        L9d:
            java.lang.String r1 = r7.f1082b
            i0.j1 r1 = i0.r.u(r1)
            r15.k0(r1)
        La6:
            r16 = r1
            i0.a1 r16 = (i0.a1) r16
            java.lang.String r1 = r7.f1081a
            boolean r1 = r15.f(r1)
            java.lang.Object r8 = r15.P()
            if (r1 != 0) goto Lb8
            if (r8 != r3) goto Lc1
        Lb8:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.j1 r8 = i0.r.u(r1)
            r15.k0(r8)
        Lc1:
            r17 = r8
            i0.a1 r17 = (i0.a1) r17
            r.z r18 = r.b0.a(r15)
            sh.x r19 = sh.s.i(r15)
            java.lang.Object r1 = r16.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            r8 = r11
            r11 = 0
            r12 = 4093(0xffd, float:5.736E-42)
            r2 = r1
            r1 = 0
            r9 = r3
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = r8
            r8 = 0
            r20 = r9
            r9 = 0
            r21 = r10
            r10 = 0
            r0 = r36
            r13 = r20
            c9.a r6 = c9.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r7 = r0
            java.lang.String r0 = r7.f1083c
            java.lang.String r1 = ""
            r2 = 0
            if (r0 == 0) goto L129
            java.util.ArrayList r3 = g(r37)
            java.util.Iterator r3 = r3.iterator()
        L107:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L11f
            java.lang.Object r4 = r3.next()
            r5 = r4
            wb.g2 r5 = (wb.g2) r5
            c9.a r5 = r5.f16297a
            java.lang.String r5 = r5.f1081a
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L107
            goto L120
        L11f:
            r4 = r2
        L120:
            wb.g2 r4 = (wb.g2) r4
            if (r4 == 0) goto L126
            java.lang.String r2 = r4.f16299c
        L126:
            if (r2 != 0) goto L129
            r2 = r1
        L129:
            if (r2 != 0) goto L12d
            r0 = r1
            goto L12e
        L12d:
            r0 = r2
        L12e:
            java.lang.String r1 = "新增聊天分组"
            java.lang.String r2 = "编辑聊天分组"
            if (r38 == 0) goto L136
            r11 = r2
            goto L137
        L136:
            r11 = r1
        L137:
            if (r38 == 0) goto L13b
            r12 = r2
            goto L13c
        L13b:
            r12 = r1
        L13c:
            c9.k0 r1 = new c9.k0
            r2 = r6
            r6 = 4
            r3 = r35
            r5 = r39
            r4 = r42
            r1.<init>(r2, r3, r4, r5, r6)
            r3 = 1482803736(0x5861ca18, float:9.930324E14)
            s0.d r20 = s0.i.e(r3, r1, r15)
            r4 = r0
            wb.j1 r0 = new wb.j1
            r9 = r38
            r5 = r40
            r8 = r41
            r6 = r2
            r3 = r16
            r10 = r17
            r2 = r18
            r1 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r8 = r10
            r10 = r7
            r2 = 266155358(0xfdd355e, float:2.1812839E-29)
            s0.d r6 = s0.i.e(r2, r0, r15)
            r0 = r8
            r8 = 1769472(0x1b0000, float:2.479558E-39)
            r9 = 24
            r3 = 0
            r4 = 0
            r2 = r11
            r11 = r0
            r0 = r2
            r2 = r1
            r1 = r12
            r7 = r15
            r5 = r20
            wb.ho.B2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r11.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d8
            r0 = -483188608(0xffffffffe3332080, float:-3.304309E21)
            r7.a0(r0)
            boolean r0 = r7.f(r11)
            java.lang.Object r1 = r7.P()
            if (r0 != 0) goto L19e
            if (r1 != r13) goto L1a8
        L19e:
            b0.j r1 = new b0.j
            r0 = 16
            r1.<init>(r11, r0)
            r7.k0(r1)
        L1a8:
            r24 = r1
            fg.a r24 = (fg.a) r24
            b0.k r0 = new b0.k
            r1 = 5
            r0.<init>(r10, r11, r14, r1)
            r1 = -1926522721(0xffffffff8d2b989f, float:-5.2877154E-31)
            s0.d r30 = s0.i.e(r1, r0, r7)
            r32 = 390(0x186, float:5.47E-43)
            r33 = 3072(0xc00, float:4.305E-42)
            r15 = 0
            java.lang.String r16 = "删除聊天分组"
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = r7
            oh.h.d(r15, r16, r17, r19, r21, r23, r24, r25, r27, r29, r30, r31, r32, r33)
            r8 = 0
            r7.p(r8)
            goto L1e8
        L1d8:
            r8 = 0
            r0 = -481826871(0xffffffffe347e7c9, float:-3.687604E21)
            r7.a0(r0)
            r7.p(r8)
            goto L1e8
        L1e3:
            r10 = r7
            r7 = r15
            r7.V()
        L1e8:
            i0.r1 r12 = r7.t()
            if (r12 == 0) goto L209
            wb.k1 r0 = new wb.k1
            r1 = r34
            r2 = r35
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r11 = r45
            r3 = r10
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f6035d = r0
        L209:
            return
    }

    public final void c(java.lang.String r25, boolean r26, java.util.List r27, fg.l r28, fg.a r29, fg.a r30, fg.l r31, i0.h0 r32, int r33) {
            r24 = this;
            r6 = r29
            r14 = r32
            r0 = -1043104329(0xffffffffc1d37db7, float:-26.436384)
            r14.b0(r0)
            r7 = r25
            boolean r0 = r14.f(r7)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r33 | r0
            r3 = r26
            boolean r1 = r14.g(r3)
            if (r1 == 0) goto L22
            r1 = 32
            goto L24
        L22:
            r1 = 16
        L24:
            r0 = r0 | r1
            r4 = r27
            boolean r1 = r14.f(r4)
            r2 = 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L31
            r1 = r2
            goto L33
        L31:
            r1 = 128(0x80, float:1.8E-43)
        L33:
            r0 = r0 | r1
            r5 = r28
            boolean r1 = r14.h(r5)
            if (r1 == 0) goto L3f
            r1 = 2048(0x800, float:2.87E-42)
            goto L41
        L3f:
            r1 = 1024(0x400, float:1.435E-42)
        L41:
            r0 = r0 | r1
            boolean r1 = r14.h(r6)
            if (r1 == 0) goto L4b
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L4d
        L4b:
            r1 = 8192(0x2000, float:1.148E-41)
        L4d:
            r0 = r0 | r1
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r0
            r8 = 599186(0x92492, float:8.39638E-40)
            r9 = 1
            r10 = 0
            if (r1 == r8) goto L5b
            r1 = r9
            goto L5c
        L5b:
            r1 = r10
        L5c:
            r8 = r0 & 1
            boolean r1 = r14.S(r8, r1)
            if (r1 == 0) goto L124
            java.lang.Object r1 = r14.P()
            i0.e r8 = i0.l.f5952a
            if (r1 != r8) goto L75
            java.lang.String r1 = ""
            i0.j1 r1 = i0.r.u(r1)
            r14.k0(r1)
        L75:
            r23 = r1
            i0.a1 r23 = (i0.a1) r23
            r.z r17 = r.b0.a(r14)
            sh.x r16 = sh.s.i(r14)
            r1 = r0 & 896(0x380, float:1.256E-42)
            if (r1 == r2) goto L87
            r1 = r10
            goto L88
        L87:
            r1 = r9
        L88:
            java.lang.Object r2 = r14.P()
            if (r1 != 0) goto L90
            if (r2 != r8) goto L97
        L90:
            java.util.ArrayList r2 = g(r4)
            r14.k0(r2)
        L97:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r23.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r1 = j8.b.l(r8, r1, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lb6:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto Le8
            java.lang.Object r11 = r2.next()
            r12 = r11
            wb.g2 r12 = (wb.g2) r12
            int r13 = r1.length()
            if (r13 != 0) goto Lca
            goto Le1
        Lca:
            c9.a r13 = r12.f16297a
            java.lang.String r13 = r13.f1082b
            java.util.Locale r15 = java.util.Locale.US
            boolean r13 = bc.e.u(r15, r13, r15, r1, r10)
            if (r13 != 0) goto Le1
            java.lang.String r12 = r12.f16299c
            boolean r12 = bc.e.t(r12, r15, r1, r10)
            if (r12 == 0) goto Ldf
            goto Le1
        Ldf:
            r12 = r10
            goto Le2
        Le1:
            r12 = r9
        Le2:
            if (r12 == 0) goto Lb6
            r8.add(r11)
            goto Lb6
        Le8:
            wb.g1 r1 = new wb.g1
            r2 = 0
            r9 = r30
            r1.<init>(r9, r6, r2)
            r2 = 9785336(0x954ff8, float:1.3712176E-38)
            s0.d r12 = s0.i.e(r2, r1, r14)
            wb.h1 r15 = new wb.h1
            r22 = r31
            r18 = r3
            r20 = r4
            r19 = r5
            r21 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 2055976306(0x7a8bb572, float:3.627047E35)
            s0.d r13 = s0.i.e(r1, r15, r14)
            r1 = r0 & 14
            r2 = 1769472(0x1b0000, float:2.479558E-39)
            r1 = r1 | r2
            int r0 = r0 << 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r15 = r1 | r0
            r9 = r16
            r16 = 24
            r10 = 0
            r11 = 0
            r8 = r25
            wb.ho.B2(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L127
        L124:
            r32.V()
        L127:
            i0.r1 r10 = r32.t()
            if (r10 == 0) goto L144
            wb.i1 r0 = new wb.i1
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r7 = r30
            r8 = r31
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L144:
            return
    }

    public final void d(c9.a r16, java.util.List r17, fg.a r18, fg.l r19, i0.h0 r20, int r21) {
            r15 = this;
            r2 = r16
            r3 = r17
            r4 = r18
            r9 = r19
            r12 = r20
            r0 = -1431763793(0xffffffffaaa904af, float:-3.002368E-13)
            r12.b0(r0)
            boolean r0 = r12.f(r2)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r21 | r0
            boolean r1 = r12.f(r3)
            r5 = 32
            if (r1 == 0) goto L25
            r1 = r5
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
            boolean r1 = r12.h(r4)
            if (r1 == 0) goto L31
            r1 = 256(0x100, float:3.59E-43)
            goto L33
        L31:
            r1 = 128(0x80, float:1.8E-43)
        L33:
            r0 = r0 | r1
            boolean r1 = r12.h(r9)
            if (r1 == 0) goto L3d
            r1 = 2048(0x800, float:2.87E-42)
            goto L3f
        L3d:
            r1 = 1024(0x400, float:1.435E-42)
        L3f:
            r0 = r0 | r1
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r7 = 0
            r8 = 1
            if (r1 == r6) goto L4a
            r1 = r8
            goto L4b
        L4a:
            r1 = r7
        L4b:
            r6 = r0 & 1
            boolean r1 = r12.S(r6, r1)
            if (r1 == 0) goto Le9
            java.lang.String r1 = r2.f1081a
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 == r5) goto L5b
            r6 = r7
            goto L5c
        L5b:
            r6 = r8
        L5c:
            boolean r10 = r12.f(r1)
            r6 = r6 | r10
            java.lang.Object r10 = r12.P()
            i0.e r11 = i0.l.f5952a
            if (r6 != 0) goto L6b
            if (r10 != r11) goto L76
        L6b:
            java.util.Set r6 = c9.o2.f(r1, r3)
            java.util.LinkedHashSet r10 = tf.d0.V(r6, r1)
            r12.k0(r10)
        L76:
            java.util.Set r10 = (java.util.Set) r10
            if (r0 == r5) goto L7b
            goto L7c
        L7b:
            r7 = r8
        L7c:
            boolean r0 = r12.f(r10)
            r0 = r0 | r7
            java.lang.Object r1 = r12.P()
            if (r0 != 0) goto L89
            if (r1 != r11) goto Lb4
        L89:
            java.util.ArrayList r0 = g(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L96:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lb1
            java.lang.Object r5 = r0.next()
            r6 = r5
            wb.g2 r6 = (wb.g2) r6
            c9.a r6 = r6.f16297a
            java.lang.String r6 = r6.f1081a
            boolean r6 = r10.contains(r6)
            if (r6 != 0) goto L96
            r1.add(r5)
            goto L96
        Lb1:
            r12.k0(r1)
        Lb4:
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r.z r7 = r.b0.a(r12)
            sh.x r6 = sh.s.i(r12)
            h0.j0 r0 = new h0.j0
            r0.<init>(r9, r4)
            r1 = 1059222862(0x3f22754e, float:0.6346024)
            s0.d r0 = s0.i.e(r1, r0, r12)
            wb.f1 r5 = new wb.f1
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r1 = 40836756(0x26f1e94, float:1.7567722E-37)
            s0.d r11 = s0.i.e(r1, r5, r12)
            r13 = 1769526(0x1b0036, float:2.479634E-39)
            r14 = 24
            java.lang.String r5 = "选择上级分组"
            r7 = r6
            java.lang.String r6 = "选择上级分组"
            r8 = 0
            r9 = 0
            r10 = r0
            wb.ho.B2(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lec
        Le9:
            r20.V()
        Lec:
            i0.r1 r8 = r20.t()
            if (r8 == 0) goto Lff
            b0.z r0 = new b0.z
            r7 = 1
            r1 = r15
            r5 = r19
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        Lff:
            return
    }

    public final void e(android.content.Context r13, vb.a r14, fg.a r15, i0.h0 r16, int r17) {
            r12 = this;
            r8 = r16
            r9 = r17
            r14.getClass()
            r15.getClass()
            r0 = 2101163619(0x7d3d3663, float:1.5719155E37)
            r8.b0(r0)
            r0 = r9 & 6
            if (r0 != 0) goto L1f
            boolean r0 = r8.h(r13)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r9
            goto L20
        L1f:
            r0 = r9
        L20:
            r3 = r9 & 48
            if (r3 != 0) goto L39
            r3 = r9 & 64
            if (r3 != 0) goto L2d
            boolean r3 = r8.f(r14)
            goto L31
        L2d:
            boolean r3 = r8.h(r14)
        L31:
            if (r3 == 0) goto L36
            r3 = 32
            goto L38
        L36:
            r3 = 16
        L38:
            r0 = r0 | r3
        L39:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L49
            boolean r4 = r8.h(r15)
            if (r4 == 0) goto L46
            r4 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r4 = 128(0x80, float:1.8E-43)
        L48:
            r0 = r0 | r4
        L49:
            r4 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L53
            r4 = r7
            goto L54
        L53:
            r4 = r6
        L54:
            r0 = r0 & r7
            boolean r0 = r8.S(r0, r4)
            if (r0 == 0) goto Ldb
            java.lang.Object r0 = r8.P()
            i0.e r4 = i0.l.f5952a
            if (r0 != r4) goto L7a
            java.lang.String r0 = "Hchat_conversation_groups"
            android.content.SharedPreferences r0 = ub.b.c(r13, r0)
            java.lang.String r5 = "enabled"
            boolean r0 = r0.getBoolean(r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i0.j1 r0 = i0.r.u(r0)
            r8.k0(r0)
        L7a:
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r5 = r8.P()
            if (r5 != r4) goto L8d
            java.util.List r5 = c9.o2.i(r13)
            i0.j1 r5 = i0.r.u(r5)
            r8.k0(r5)
        L8d:
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r8.P()
            if (r6 != r4) goto L9e
            wb.y0 r6 = wb.y0.f20278a
            i0.j1 r6 = i0.r.u(r6)
            r8.k0(r6)
        L9e:
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r7 = r6.getValue()
            r10 = r7
            wb.a1 r10 = (wb.a1) r10
            java.lang.Object r7 = r8.P()
            if (r7 != r4) goto Lb6
            w0.l r7 = new w0.l
            r4 = 1
            r7.<init>(r4)
            r8.k0(r7)
        Lb6:
            r11 = r7
            fg.l r11 = (fg.l) r11
            r4 = r0
            wb.e1 r0 = new wb.e1
            r7 = 0
            r2 = r13
            r1 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = -657345589(0xffffffffd8d1b3cb, float:-1.8445611E15)
            s0.d r5 = s0.i.e(r1, r0, r8)
            r7 = 200064(0x30d80, float:2.8035E-40)
            r8 = 18
            r1 = 0
            java.lang.String r2 = "ConversationGroupRoute"
            r4 = 0
            r6 = r16
            r0 = r10
            r3 = r11
            wb.ho.E3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto Lde
        Ldb:
            r16.V()
        Lde:
            i0.r1 r7 = r16.t()
            if (r7 == 0) goto Lf1
            s0.c r0 = new s0.c
            r6 = 1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        Lf1:
            return
    }
}
