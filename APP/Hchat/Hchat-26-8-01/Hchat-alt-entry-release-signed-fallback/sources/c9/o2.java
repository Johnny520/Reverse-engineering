package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f1298a = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            c9.o2.f1298a = r0
            return
    }

    public static final java.lang.String a() {
            java.lang.String r0 = ""
            g8.a r1 = h.Hchat.hooks.api.core.WeChatApis.account()     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r1 = move-exception
            goto L1c
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L13
            r1 = r0
        L13:
            java.lang.CharSequence r1 = og.m.R0(r1)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ld
            goto L22
        L1c:
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L22:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 != 0) goto L2a
            r0 = r1
            goto L33
        L2a:
            java.lang.String r1 = r2.getMessage()
            java.lang.String r3 = "[Hchat:ConversationGroup] 读取当前账号失败: "
            eh.a.x(r3, r1, r2)
        L33:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static final boolean b(android.content.Context r29, c9.a r30) {
            r0 = r29
            r1 = r30
            r0.getClass()
            r1.getClass()
            java.lang.Object r14 = c9.o2.f1298a
            monitor-enter(r14)
            java.lang.String r15 = a()     // Catch: java.lang.Throwable -> L4f
            boolean r2 = og.m.t0(r15)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L1a
        L17:
            r3 = 0
            goto L18f
        L1a:
            java.util.List r2 = j(r0, r15)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r1.f1081a     // Catch: java.lang.Throwable -> L4f
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r1.f1082b     // Catch: java.lang.Throwable -> L4f
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r1.f1083c     // Catch: java.lang.Throwable -> L4f
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L52
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L52
            int r9 = r6.length()     // Catch: java.lang.Throwable -> L4f
            if (r9 <= 0) goto L4a
            r9 = r8
            goto L4b
        L4a:
            r9 = 0
        L4b:
            if (r9 == 0) goto L52
            r7 = r6
            goto L52
        L4f:
            r0 = move-exception
            goto L191
        L52:
            boolean r6 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L4f
            if (r6 != 0) goto L17
            boolean r6 = og.m.t0(r5)     // Catch: java.lang.Throwable -> L4f
            if (r6 != 0) goto L17
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L65
            goto L7e
        L65:
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L4f
        L69:
            boolean r9 = r6.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L7e
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L4f
            c9.a r9 = (c9.a) r9     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = r9.f1081a     // Catch: java.lang.Throwable -> L4f
            boolean r9 = gg.l.a(r9, r4)     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L69
            goto L17
        L7e:
            if (r7 == 0) goto L9f
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L87
            goto L17
        L87:
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L4f
        L8b:
            boolean r9 = r6.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L17
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L4f
            c9.a r9 = (c9.a) r9     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = r9.f1081a     // Catch: java.lang.Throwable -> L4f
            boolean r9 = gg.l.a(r9, r7)     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L8b
        L9f:
            java.util.List r6 = r1.f1085e     // Catch: java.lang.Throwable -> L4f
            dg.n r6 = tf.m.m1(r6)     // Catch: java.lang.Throwable -> L4f
            c9.l2 r9 = c9.l2.f1258n     // Catch: java.lang.Throwable -> L4f
            ng.t r6 = ng.m.W(r6, r9)     // Catch: java.lang.Throwable -> L4f
            c9.m2 r9 = c9.m2.f1276n     // Catch: java.lang.Throwable -> L4f
            r9.getClass()     // Catch: java.lang.Throwable -> L4f
            ng.i r10 = new ng.i     // Catch: java.lang.Throwable -> L4f
            r10.<init>(r6, r8, r9)     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L4f
            r6.<init>()     // Catch: java.lang.Throwable -> L4f
            ng.m.a0(r10, r6)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            int r9 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> L4f
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4f
        Lca:
            boolean r9 = r2.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r9 == 0) goto L13c
            java.lang.Object r9 = r2.next()     // Catch: java.lang.Throwable -> L4f
            c9.a r9 = (c9.a) r9     // Catch: java.lang.Throwable -> L4f
            java.util.List r10 = r9.f1085e     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r11.<init>()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L4f
        Le1:
            boolean r12 = r10.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r12 == 0) goto Lf8
            java.lang.Object r12 = r10.next()     // Catch: java.lang.Throwable -> L4f
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L4f
            boolean r13 = r6.contains(r13)     // Catch: java.lang.Throwable -> L4f
            if (r13 != 0) goto Le1
            r11.add(r12)     // Catch: java.lang.Throwable -> L4f
            goto Le1
        Lf8:
            java.util.List r10 = r9.f1086f     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r12.<init>()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L4f
        L103:
            boolean r13 = r10.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r13 == 0) goto L11a
            java.lang.Object r13 = r10.next()     // Catch: java.lang.Throwable -> L4f
            r3 = r13
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r6.contains(r3)     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L103
            r12.add(r13)     // Catch: java.lang.Throwable -> L4f
            goto L103
        L11a:
            r27 = 0
            r28 = 4047(0xfcf, float:5.671E-42)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r16 = r9
            r21 = r11
            r22 = r12
            c9.a r3 = c9.a.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L4f
            r8.add(r3)     // Catch: java.lang.Throwable -> L4f
            goto Lca
        L13c:
            int r2 = r1.f1084d     // Catch: java.lang.Throwable -> L4f
            if (r2 >= 0) goto L142
            r3 = 0
            goto L143
        L142:
            r3 = r2
        L143:
            java.util.List r2 = tf.m.P1(r6)     // Catch: java.lang.Throwable -> L4f
            java.util.List r9 = r1.f1086f     // Catch: java.lang.Throwable -> L4f
            r10 = r2
            r2 = r4
            r4 = r7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r7.<init>()     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L4f
        L155:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r11 == 0) goto L16c
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L4f
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L4f
            boolean r12 = r6.contains(r12)     // Catch: java.lang.Throwable -> L4f
            if (r12 == 0) goto L155
            r7.add(r11)     // Catch: java.lang.Throwable -> L4f
            goto L155
        L16c:
            r12 = 0
            r13 = 4032(0xfc0, float:5.65E-42)
            r6 = r8
            r8 = 0
            r9 = 0
            r11 = r6
            r6 = r10
            r10 = 0
            r16 = r11
            r11 = 0
            r0 = r5
            r5 = r3
            r3 = r0
            r0 = r16
            c9.a r1 = c9.a.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r0 = tf.m.G1(r0, r1)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r0 = l(r0)     // Catch: java.lang.Throwable -> L4f
            r1 = r29
            boolean r3 = r(r1, r15, r0)     // Catch: java.lang.Throwable -> L4f
        L18f:
            monitor-exit(r14)
            return r3
        L191:
            monitor-exit(r14)
            throw r0
    }

    public static boolean c(org.json.JSONObject r0, java.lang.String r1, boolean r2) {
            java.lang.Object r0 = r0.opt(r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto Lb
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            boolean r0 = r0.booleanValue()
            return r0
        L13:
            return r2
    }

    public static final java.lang.String d(java.lang.String r3, java.util.List r4) {
            r4.getClass()
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r0 = og.m.t0(r3)
            r1 = 0
            if (r0 == 0) goto L16
            goto L3c
        L16:
            java.util.ArrayList r4 = l(r4)
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()
            r2 = r0
            c9.a r2 = (c9.a) r2
            java.util.List r2 = r2.f1085e
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L1e
            goto L35
        L34:
            r0 = r1
        L35:
            c9.a r0 = (c9.a) r0
            if (r0 == 0) goto L3c
            java.lang.String r3 = r0.f1081a
            return r3
        L3c:
            return r1
    }

    public static final boolean e(android.content.Context r8, java.util.Collection r9) {
            r8.getClass()
            r9.getClass()
            java.lang.Object r0 = c9.o2.f1298a
            monitor-enter(r0)
            java.lang.String r1 = a()     // Catch: java.lang.Throwable -> L52
            boolean r2 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L52
            r3 = 0
            if (r2 == 0) goto L16
            goto L89
        L16:
            java.util.List r2 = j(r8, r1)     // Catch: java.lang.Throwable -> L52
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L52
            dg.n r4 = new dg.n     // Catch: java.lang.Throwable -> L52
            r5 = 6
            r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> L52
            c9.g2 r9 = c9.g2.f1199n     // Catch: java.lang.Throwable -> L52
            ng.t r9 = ng.m.W(r4, r9)     // Catch: java.lang.Throwable -> L52
            c9.h2 r4 = c9.h2.f1208n     // Catch: java.lang.Throwable -> L52
            r4.getClass()     // Catch: java.lang.Throwable -> L52
            ng.i r5 = new ng.i     // Catch: java.lang.Throwable -> L52
            r6 = 1
            r5.<init>(r9, r6, r4)     // Catch: java.lang.Throwable -> L52
            java.util.Set r9 = ng.m.c0(r5)     // Catch: java.lang.Throwable -> L52
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L52
            r4.<init>()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r5 = r2.iterator()     // Catch: java.lang.Throwable -> L52
        L40:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L54
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L52
            c9.a r6 = (c9.a) r6     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.f1081a     // Catch: java.lang.Throwable -> L52
            r4.add(r6)     // Catch: java.lang.Throwable -> L52
            goto L40
        L52:
            r8 = move-exception
            goto L8b
        L54:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L52
            r5.<init>()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L52
        L5f:
            boolean r6 = r9.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L76
            java.lang.Object r6 = r9.next()     // Catch: java.lang.Throwable -> L52
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L52
            boolean r7 = r4.contains(r7)     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L5f
            r5.add(r6)     // Catch: java.lang.Throwable -> L52
            goto L5f
        L76:
            boolean r9 = r5.isEmpty()     // Catch: java.lang.Throwable -> L52
            if (r9 == 0) goto L7d
            goto L89
        L7d:
            java.util.List r9 = o(r2, r5)     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r9 = l(r9)     // Catch: java.lang.Throwable -> L52
            boolean r3 = r(r8, r1, r9)     // Catch: java.lang.Throwable -> L52
        L89:
            monitor-exit(r0)
            return r3
        L8b:
            monitor-exit(r0)
            throw r8
    }

    public static final java.util.Set f(java.lang.String r6, java.util.List r7) {
            r7.getClass()
            r6.getClass()
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L15
            goto L80
        L15:
            java.util.ArrayList r7 = l(r7)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L20
            goto L80
        L20:
            java.util.Iterator r0 = r7.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            c9.a r1 = (c9.a) r1
            java.lang.String r1 = r1.f1081a
            boolean r1 = gg.l.a(r1, r6)
            if (r1 == 0) goto L24
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            gg.u r1 = new gg.u
            r1.<init>()
            java.util.Set r2 = ac.p.N(r6)
            r1.f4564g = r2
        L48:
            java.lang.Object r2 = r1.f4564g
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L7c
            dg.n r2 = new dg.n
            r3 = 6
            r2.<init>(r7, r3)
            c9.i r3 = new c9.i
            r4 = 4
            r3.<init>(r1, r4, r0)
            ng.i r4 = new ng.i
            r5 = 1
            r4.<init>(r2, r5, r3)
            b4.b r2 = new b4.b
            r3 = 6
            r2.<init>(r3)
            ng.t r2 = ng.m.W(r4, r2)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            ng.m.a0(r2, r3)
            r0.addAll(r3)
            r1.f4564g = r3
            goto L48
        L7c:
            r0.remove(r6)
            return r0
        L80:
            tf.v r6 = tf.v.f13169g
            return r6
    }

    public static org.json.JSONArray g(java.util.List r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r6.next()
            c9.a r1 = (c9.a) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "id"
            java.lang.String r4 = r1.f1081a
            r2.put(r3, r4)
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.f1082b
            r2.put(r3, r4)
            java.lang.String r3 = r1.f1083c
            if (r3 == 0) goto L2d
            goto L2f
        L2d:
            java.lang.Object r3 = org.json.JSONObject.NULL
        L2f:
            java.lang.String r4 = "parentId"
            r2.put(r4, r3)
            java.lang.String r3 = "order"
            int r4 = r1.f1084d
            r2.put(r3, r4)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.List r4 = r1.f1085e
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r3.put(r5)
            goto L46
        L56:
            java.lang.String r4 = "conversationIds"
            r2.put(r4, r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.List r4 = r1.f1086f
            java.util.Iterator r4 = r4.iterator()
        L66:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r3.put(r5)
            goto L66
        L76:
            java.lang.String r4 = "pinnedConversationIds"
            r2.put(r4, r3)
            java.lang.String r3 = "pinned"
            boolean r4 = r1.f1087g
            r2.put(r3, r4)
            java.lang.String r3 = "avatarPath"
            java.lang.String r4 = r1.f1088h
            r2.put(r3, r4)
            java.lang.String r3 = "showUnreadCount"
            boolean r4 = r1.f1089i
            r2.put(r3, r4)
            java.lang.String r3 = "previewLatestMessage"
            boolean r4 = r1.f1090j
            r2.put(r3, r4)
            java.lang.String r3 = "roundAvatar"
            boolean r4 = r1.f1091k
            r2.put(r3, r4)
            java.lang.String r3 = "showEmpty"
            boolean r1 = r1.f1092l
            r2.put(r3, r1)
            r0.put(r2)
            goto L9
        Laa:
            return r0
    }

    public static final c9.f2 h(android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = "[Hchat:ConversationGroup] 校验聊天分组导入文件失败: "
            java.lang.String r1 = "已导入 "
            java.lang.Object r2 = c9.o2.f1298a
            monitor-enter(r2)
            java.lang.String r3 = a()     // Catch: java.lang.Throwable -> L1a
            boolean r4 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L1a
            r5 = 0
            if (r4 == 0) goto L1c
            c9.f2 r6 = new c9.f2     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = "当前微信账号尚未就绪"
            r6.<init>(r7, r5, r5)     // Catch: java.lang.Throwable -> L1a
            goto L7f
        L1a:
            r6 = move-exception
            goto L81
        L1c:
            java.util.ArrayList r7 = n(r7)     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r7 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L1a
            r7 = r4
        L28:
            java.lang.Throwable r4 = sf.g.b(r7)     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L5e
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L1a
            boolean r6 = r(r6, r3, r7)     // Catch: java.lang.Throwable -> L1a
            if (r6 != 0) goto L3e
            c9.f2 r6 = new c9.f2     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = "保存聊天分组失败"
            r6.<init>(r7, r5, r5)     // Catch: java.lang.Throwable -> L1a
            goto L7f
        L3e:
            c9.f2 r6 = new c9.f2     // Catch: java.lang.Throwable -> L1a
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L1a
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            r3.append(r7)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = " 个分组"
            r3.append(r7)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            r6.<init>(r7, r0, r1)     // Catch: java.lang.Throwable -> L1a
            goto L7f
        L5e:
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L1a
            r7.append(r6)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L1a
            fb.v0.n(r6, r4)     // Catch: java.lang.Throwable -> L1a
            c9.f2 r6 = new c9.f2     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r4.getMessage()     // Catch: java.lang.Throwable -> L1a
            if (r7 == 0) goto L7a
            goto L7c
        L7a:
            java.lang.String r7 = "导入文件格式错误"
        L7c:
            r6.<init>(r7, r5, r5)     // Catch: java.lang.Throwable -> L1a
        L7f:
            monitor-exit(r2)
            return r6
        L81:
            monitor-exit(r2)
            throw r6
    }

    public static final java.util.List i(android.content.Context r3) {
            r3.getClass()
            java.lang.Object r0 = c9.o2.f1298a
            monitor-enter(r0)
            java.lang.String r1 = a()     // Catch: java.lang.Throwable -> L13
            boolean r2 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            tf.t r3 = tf.t.f13167g     // Catch: java.lang.Throwable -> L13
            goto L19
        L13:
            r3 = move-exception
            goto L1b
        L15:
            java.util.List r3 = j(r3, r1)     // Catch: java.lang.Throwable -> L13
        L19:
            monitor-exit(r0)
            return r3
        L1b:
            monitor-exit(r0)
            throw r3
    }

    public static java.util.List j(android.content.Context r9, java.lang.String r10) {
            java.lang.String r0 = "accounts"
            java.lang.String r1 = "[Hchat:ConversationGroup] 保存账号 "
            java.lang.String r2 = "Hchat_conversation_groups"
            android.content.SharedPreferences r9 = ub.b.c(r9, r2)
            java.lang.String r2 = "groups_v1"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.getString(r2, r3)
            if (r4 != 0) goto L15
            goto L16
        L15:
            r3 = r4
        L16:
            boolean r4 = og.m.t0(r3)
            tf.t r5 = tf.t.f13167g
            if (r4 == 0) goto L1f
            return r5
        L1f:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L73
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L73
            org.json.JSONObject r3 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L75
            org.json.JSONArray r6 = r3.optJSONArray(r10)     // Catch: java.lang.Throwable -> L73
            java.util.List r6 = m(r6)     // Catch: java.lang.Throwable -> L73
            java.util.ArrayList r7 = l(r6)     // Catch: java.lang.Throwable -> L73
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L73
            if (r6 != 0) goto L7c
            org.json.JSONArray r6 = g(r7)     // Catch: java.lang.Throwable -> L73
            r3.put(r10, r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "schemaVersion"
            r8 = 1
            r4.put(r6, r8)     // Catch: java.lang.Throwable -> L73
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L73
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L73
            android.content.SharedPreferences$Editor r9 = r9.putString(r2, r0)     // Catch: java.lang.Throwable -> L73
            boolean r9 = r9.commit()     // Catch: java.lang.Throwable -> L73
            if (r9 != 0) goto L7c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L73
            r9.append(r10)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = " 的修复结果失败"
            r9.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L73
            fb.v0.m(r9)     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r9 = move-exception
            goto L77
        L75:
            r7 = r5
            goto L7c
        L77:
            sf.f r7 = new sf.f
            r7.<init>(r9)
        L7c:
            java.lang.Throwable r9 = sf.g.b(r7)
            if (r9 != 0) goto L84
            r5 = r7
            goto L8f
        L84:
            java.lang.String r0 = r9.getMessage()
            java.lang.String r1 = "[Hchat:ConversationGroup] 读取账号 "
            java.lang.String r2 = " 的聊天分组失败: "
            eh.a.w(r1, r10, r2, r0, r9)
        L8f:
            java.util.List r5 = (java.util.List) r5
            return r5
    }

    public static final c9.a k(java.lang.String r14) {
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r2 = r0.toString()
            r2.getClass()
            r0 = 0
            if (r14 == 0) goto L2c
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            if (r14 == 0) goto L2c
            int r1 = r14.length()
            if (r1 <= 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2c
            r0 = r14
        L2c:
            r4 = r0
            c9.a r1 = new c9.a
            r12 = 1
            r13 = 0
            java.lang.String r3 = ""
            r5 = 0
            tf.t r6 = tf.t.f13167g
            r8 = 0
            java.lang.String r9 = ""
            r10 = 1
            r11 = 1
            r7 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
    }

    public static final java.util.ArrayList l(java.util.List r26) {
            r26.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r26.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto Lf6
            java.lang.Object r2 = r1.next()
            r6 = r2
            c9.a r6 = (c9.a) r6
            java.lang.String r2 = r6.f1081a
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r7 = r2.toString()
            java.lang.String r2 = r6.f1082b
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r8 = r2.toString()
            boolean r2 = og.m.t0(r7)
            if (r2 != 0) goto Lc
            boolean r2 = og.m.t0(r8)
            if (r2 == 0) goto L3d
            goto Lc
        L3d:
            java.util.List r2 = r6.f1085e
            dg.n r2 = tf.m.m1(r2)
            c9.i2 r9 = c9.i2.f1217n
            ng.t r2 = ng.m.W(r2, r9)
            c9.j2 r9 = c9.j2.f1230n
            r9.getClass()
            ng.i r10 = new ng.i
            r10.<init>(r2, r3, r9)
            ng.c r2 = ng.m.S(r10)
            java.util.List r11 = ng.m.b0(r2)
            java.util.List r2 = r6.f1086f
            dg.n r2 = tf.m.m1(r2)
            c9.k2 r9 = c9.k2.f1243n
            ng.t r2 = ng.m.W(r2, r9)
            b0.d0 r9 = new b0.d0
            r10 = 4
            r9.<init>(r11, r10)
            ng.i r10 = new ng.i
            r10.<init>(r2, r3, r9)
            ng.c r2 = ng.m.S(r10)
            java.util.List r12 = ng.m.b0(r2)
            java.lang.Object r2 = r0.get(r7)
            r13 = r2
            c9.a r13 = (c9.a) r13
            if (r13 != 0) goto Lbf
            java.lang.String r2 = r6.f1083c
            if (r2 == 0) goto L9c
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L9c
            int r9 = r2.length()
            if (r9 <= 0) goto L98
            goto L99
        L98:
            r3 = r5
        L99:
            if (r3 == 0) goto L9c
            r4 = r2
        L9c:
            r9 = r4
            int r2 = r6.f1084d
            if (r2 >= 0) goto La3
            r10 = r5
            goto La4
        La3:
            r10 = r2
        La4:
            java.lang.String r2 = r6.f1088h
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r14 = r2.toString()
            r17 = 0
            r18 = 3904(0xf40, float:5.47E-42)
            r13 = 0
            r15 = 0
            r16 = 0
            c9.a r2 = c9.a.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.put(r7, r2)
            goto Lc
        Lbf:
            java.util.List r2 = r13.f1085e
            java.util.ArrayList r2 = tf.m.F1(r2, r11)
            java.util.Set r2 = tf.m.T1(r2)
            java.util.List r18 = tf.m.P1(r2)
            java.util.List r2 = r13.f1086f
            java.util.ArrayList r2 = tf.m.F1(r2, r12)
            java.util.Set r2 = tf.m.T1(r2)
            java.util.List r19 = tf.m.P1(r2)
            r24 = 0
            r25 = 4047(0xfcf, float:5.671E-42)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            c9.a r2 = c9.a.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.put(r7, r2)
            goto Lc
        Lf6:
            java.util.Set r1 = r0.keySet()
            r1.getClass()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r6 = r0.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L10e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L145
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r7.getValue()
            c9.a r7 = (c9.a) r7
            java.lang.String r7 = r7.f1083c
            if (r7 == 0) goto L140
            boolean r9 = r7.equals(r9)
            if (r9 != 0) goto L13c
            boolean r9 = r1.contains(r7)
            if (r9 == 0) goto L13c
            r9 = r3
            goto L13d
        L13c:
            r9 = r5
        L13d:
            if (r9 == 0) goto L140
            goto L141
        L140:
            r7 = r4
        L141:
            r2.put(r8, r7)
            goto L10e
        L145:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r3 = r2.keySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L154:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L164
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            q(r1, r2, r6)
            goto L154
        L164:
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = tf.n.e1(r0)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L17a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1a9
            java.lang.Object r3 = r0.next()
            r6 = r3
            c9.a r6 = (c9.a) r6
            r6.getClass()
            java.lang.String r3 = r6.f1081a
            java.lang.Object r3 = r2.get(r3)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r17 = 0
            r18 = 4091(0xffb, float:5.733E-42)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            c9.a r3 = c9.a.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.add(r3)
            goto L17a
        L1a9:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            ng.d r3 = new ng.d
            java.util.Iterator r6 = r1.iterator()
            r3.<init>(r6)
        L1bc:
            java.util.Iterator r6 = r3.f9432i
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L1e5
            java.lang.Object r6 = r3.next()
            r7 = r6
            tf.w r7 = (tf.w) r7
            java.lang.Object r7 = r7.f13171b
            c9.a r7 = (c9.a) r7
            java.lang.String r7 = r7.f1083c
            java.lang.Object r8 = r2.get(r7)
            if (r8 != 0) goto L1df
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.put(r7, r8)
        L1df:
            java.util.List r8 = (java.util.List) r8
            r8.add(r6)
            goto L1bc
        L1e5:
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L1ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L233
            java.lang.Object r3 = r2.next()
            java.util.List r3 = (java.util.List) r3
            c9.h1 r6 = new c9.h1
            r7 = 2
            r6.<init>(r7)
            c9.a0 r7 = new c9.a0
            r8 = 1
            r7.<init>(r6, r8)
            java.util.List r3 = tf.m.K1(r3, r7)
            java.util.Iterator r3 = r3.iterator()
            r6 = r5
        L210:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L1ef
            java.lang.Object r7 = r3.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L22f
            tf.w r7 = (tf.w) r7
            java.lang.Object r7 = r7.f13171b
            c9.a r7 = (c9.a) r7
            java.lang.String r7 = r7.f1081a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r7, r6)
            r6 = r8
            goto L210
        L22f:
            a.a.Q0()
            throw r4
        L233:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r1)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L240:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L274
            java.lang.Object r3 = r1.next()
            r6 = r3
            c9.a r6 = (c9.a) r6
            java.lang.String r3 = r6.f1081a
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L25d
            int r3 = r3.intValue()
            r10 = r3
            goto L25e
        L25d:
            r10 = r5
        L25e:
            r17 = 0
            r18 = 4087(0xff7, float:5.727E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            c9.a r3 = c9.a.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.add(r3)
            goto L240
        L274:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L27d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a1
            java.lang.Object r3 = r1.next()
            c9.a r3 = (c9.a) r3
            java.util.List r4 = r3.f1085e
            java.util.Iterator r4 = r4.iterator()
        L28f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L27d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r3.f1081a
            r0.put(r5, r6)
            goto L28f
        L2a1:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = tf.n.e1(r2)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L2ae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L318
            java.lang.Object r3 = r2.next()
            r4 = r3
            c9.a r4 = (c9.a) r4
            java.util.List r3 = r4.f1085e
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2c6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2e3
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r7 = r4.f1081a
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L2c6
            r9.add(r5)
            goto L2c6
        L2e3:
            java.util.List r3 = r4.f1086f
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2ee:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L305
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r9.contains(r6)
            if (r6 == 0) goto L2ee
            r10.add(r5)
            goto L2ee
        L305:
            r15 = 0
            r16 = 4047(0xfcf, float:5.671E-42)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            c9.a r3 = c9.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.add(r3)
            goto L2ae
        L318:
            return r1
    }

    public static java.util.List m(org.json.JSONArray r24) {
            r0 = r24
            if (r0 != 0) goto L7
            tf.t r0 = tf.t.f13167g
            return r0
        L7:
            uf.c r1 = a.a.E()
            int r2 = r0.length()
            r3 = 0
            r4 = r3
        L11:
            if (r4 < r2) goto L18
            uf.c r0 = a.a.t(r1)
            return r0
        L18:
            org.json.JSONObject r5 = r0.optJSONObject(r4)
            if (r5 == 0) goto Lf2
            uf.c r6 = a.a.E()
            java.lang.String r7 = "conversationIds"
            org.json.JSONArray r7 = r5.optJSONArray(r7)
            if (r7 == 0) goto L2b
            goto L30
        L2b:
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
        L30:
            int r8 = r7.length()
            r9 = r3
        L35:
            r10 = 0
            if (r9 < r8) goto Lde
            uf.c r16 = a.a.t(r6)
            uf.c r11 = a.a.E()
            java.lang.String r6 = "pinnedConversationIds"
            org.json.JSONArray r6 = r5.optJSONArray(r6)
            if (r6 == 0) goto L4a
        L48:
            r12 = r6
            goto L50
        L4a:
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            goto L48
        L50:
            int r13 = r12.length()
            r6 = r3
        L55:
            if (r6 < r13) goto Lc9
            uf.c r17 = a.a.t(r11)
            java.lang.String r6 = "id"
            java.lang.String r12 = r5.optString(r6)
            r12.getClass()
            java.lang.String r6 = "name"
            java.lang.String r13 = r5.optString(r6)
            r13.getClass()
            java.lang.String r6 = "parentId"
            java.lang.String r6 = r5.optString(r6)
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L7b
            r14 = r6
            goto L7c
        L7b:
            r14 = r10
        L7c:
            java.lang.String r6 = "order"
            int r15 = r5.optInt(r6, r4)
            java.lang.String r6 = "pinned"
            boolean r18 = c(r5, r6, r3)
            java.lang.String r6 = "avatarPath"
            java.lang.Object r6 = r5.opt(r6)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L95
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
        L95:
            if (r10 == 0) goto La4
            java.lang.CharSequence r6 = og.m.R0(r10)
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto La4
        La1:
            r19 = r6
            goto La7
        La4:
            java.lang.String r6 = ""
            goto La1
        La7:
            java.lang.String r6 = "showUnreadCount"
            r7 = 1
            boolean r20 = c(r5, r6, r7)
            java.lang.String r6 = "previewLatestMessage"
            boolean r21 = c(r5, r6, r7)
            java.lang.String r6 = "roundAvatar"
            boolean r22 = c(r5, r6, r7)
            java.lang.String r6 = "showEmpty"
            boolean r23 = c(r5, r6, r3)
            c9.a r11 = new c9.a
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.add(r11)
            goto Lf2
        Lc9:
            java.lang.String r7 = r12.optString(r6)
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto Ld4
            goto Ld5
        Ld4:
            r7 = r10
        Ld5:
            if (r7 == 0) goto Lda
            r11.add(r7)
        Lda:
            int r6 = r6 + 1
            goto L55
        Lde:
            java.lang.String r11 = r7.optString(r9)
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto Le9
            r10 = r11
        Le9:
            if (r10 == 0) goto Lee
            r6.add(r10)
        Lee:
            int r9 = r9 + 1
            goto L35
        Lf2:
            int r4 = r4 + 1
            goto L11
    }

    public static java.util.ArrayList n(java.lang.String r31) {
            boolean r0 = og.m.t0(r31)
            if (r0 != 0) goto L35d
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r31
            r0.<init>(r1)
            java.lang.String r1 = "format"
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r2 = "HchatConversationGroups"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L356
            java.lang.String r1 = "schema"
            java.lang.Object r3 = r0.opt(r1)
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L356
            java.lang.String r1 = r0.optString(r1)
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L356
            java.lang.String r1 = "version"
            java.lang.Object r2 = r0.opt(r1)
            boolean r2 = r2 instanceof java.lang.Number
            if (r2 == 0) goto L34f
            r2 = -1
            int r1 = r0.optInt(r1, r2)
            r2 = 1
            if (r1 != r2) goto L34f
            java.lang.String r1 = "groups"
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            if (r0 == 0) goto L348
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            uf.c r3 = a.a.E()
            int r4 = r0.length()
            r5 = 0
            r6 = r5
        L58:
            java.lang.String r7 = "分组 "
            if (r6 < r4) goto L90
            uf.c r0 = a.a.t(r3)
            java.util.ListIterator r2 = r0.listIterator(r5)
        L64:
            r3 = r2
            uf.a r3 = (uf.a) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8b
            java.lang.Object r3 = r3.next()
            c9.a r3 = (c9.a) r3
            java.lang.String r4 = r3.f1083c
            if (r4 == 0) goto L64
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L7e
            goto L64
        L7e:
            java.lang.String r0 = r3.f1082b
            java.lang.String r1 = " 的上级分组不存在"
            java.lang.String r0 = eh.a.n(r7, r0, r1)
            j8.o.q(r0)
        L89:
            r0 = 0
            return r0
        L8b:
            java.util.ArrayList r0 = l(r0)
            return r0
        L90:
            org.json.JSONObject r8 = r0.optJSONObject(r6)
            java.lang.String r9 = "第 "
            if (r8 == 0) goto L329
            java.lang.String r10 = "id"
            java.lang.Object r11 = r8.opt(r10)
            boolean r11 = r11 instanceof java.lang.String
            if (r11 == 0) goto L31a
            java.lang.String r11 = "name"
            java.lang.Object r12 = r8.opt(r11)
            boolean r12 = r12 instanceof java.lang.String
            if (r12 == 0) goto L31a
            java.lang.String r14 = wb.en.j(r10, r8)
            java.lang.String r15 = wb.en.j(r11, r8)
            boolean r10 = og.m.t0(r14)
            if (r10 != 0) goto L30b
            boolean r10 = og.m.t0(r15)
            if (r10 != 0) goto L2fc
            boolean r9 = r1.add(r14)
            if (r9 == 0) goto L2f5
            java.lang.String r9 = "parentId"
            boolean r10 = r8.isNull(r9)
            if (r10 == 0) goto Ld1
            r16 = 0
            goto Lec
        Ld1:
            java.lang.Object r10 = r8.opt(r9)
            boolean r10 = r10 instanceof java.lang.String
            if (r10 == 0) goto L2ea
            java.lang.String r9 = wb.en.j(r9, r8)
            int r10 = r9.length()
            if (r10 <= 0) goto Le5
            r10 = r2
            goto Le6
        Le5:
            r10 = r5
        Le6:
            if (r10 == 0) goto Le9
            goto Lea
        Le9:
            r9 = 0
        Lea:
            r16 = r9
        Lec:
            java.lang.String r9 = "conversationIds"
            org.json.JSONArray r9 = r8.optJSONArray(r9)
            if (r9 == 0) goto L2e3
            java.lang.String r10 = "pinnedConversationIds"
            boolean r12 = r8.has(r10)
            if (r12 == 0) goto L112
            java.lang.Object r10 = r8.opt(r10)
            boolean r12 = r10 instanceof org.json.JSONArray
            if (r12 == 0) goto L107
            org.json.JSONArray r10 = (org.json.JSONArray) r10
            goto L117
        L107:
            java.lang.String r0 = " 的置顶会话列表格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L112:
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
        L117:
            java.lang.String r12 = "order"
            boolean r13 = r8.has(r12)
            if (r13 == 0) goto L133
            java.lang.Object r13 = r8.opt(r12)
            boolean r13 = r13 instanceof java.lang.Number
            if (r13 == 0) goto L128
            goto L133
        L128:
            java.lang.String r0 = " 的排序字段格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L133:
            java.lang.String r13 = "pinned"
            boolean r17 = r8.has(r13)
            if (r17 == 0) goto L14f
            java.lang.Object r11 = r8.opt(r13)
            boolean r11 = r11 instanceof java.lang.Boolean
            if (r11 == 0) goto L144
            goto L14f
        L144:
            java.lang.String r0 = " 的主页置顶字段格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L14f:
            java.lang.String r11 = "avatarPath"
            boolean r17 = r8.has(r11)
            if (r17 == 0) goto L16b
            java.lang.Object r2 = r8.opt(r11)
            boolean r2 = r2 instanceof java.lang.String
            if (r2 == 0) goto L160
            goto L16b
        L160:
            java.lang.String r0 = " 的头像路径字段格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L16b:
            java.lang.String r2 = "showUnreadCount"
            boolean r17 = r8.has(r2)
            if (r17 == 0) goto L187
            java.lang.Object r5 = r8.opt(r2)
            boolean r5 = r5 instanceof java.lang.Boolean
            if (r5 == 0) goto L17c
            goto L187
        L17c:
            java.lang.String r0 = " 的未读数字字段格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L187:
            java.lang.String r5 = "previewLatestMessage"
            boolean r17 = r8.has(r5)
            r28 = r0
            if (r17 == 0) goto L1a5
            java.lang.Object r0 = r8.opt(r5)
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L19a
            goto L1a5
        L19a:
            java.lang.String r0 = " 的最新消息预览字段格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L1a5:
            java.lang.String r0 = "roundAvatar"
            boolean r17 = r8.has(r0)
            r29 = r1
            if (r17 == 0) goto L1c3
            java.lang.Object r1 = r8.opt(r0)
            boolean r1 = r1 instanceof java.lang.Boolean
            if (r1 == 0) goto L1b8
            goto L1c3
        L1b8:
            java.lang.String r0 = " 的圆形头像字段格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L1c3:
            java.lang.String r1 = "showEmpty"
            boolean r17 = r8.has(r1)
            r30 = r4
            if (r17 == 0) goto L1e1
            java.lang.Object r4 = r8.opt(r1)
            boolean r4 = r4 instanceof java.lang.Boolean
            if (r4 == 0) goto L1d6
            goto L1e1
        L1d6:
            java.lang.String r0 = " 的空分组显示字段格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L1e1:
            uf.c r4 = a.a.E()
            r17 = r14
            int r14 = r9.length()
            r18 = r15
            r15 = 0
        L1ee:
            if (r15 < r14) goto L299
            r15 = r18
            uf.c r18 = a.a.t(r4)
            uf.c r4 = a.a.E()
            int r9 = r10.length()
            r14 = 0
        L1ff:
            if (r14 < r9) goto L25b
            uf.c r19 = a.a.t(r4)
            c9.a r4 = new c9.a
            int r7 = r8.optInt(r12, r6)
            if (r7 >= 0) goto L20e
            r7 = 0
        L20e:
            r9 = 0
            boolean r20 = c(r8, r13, r9)
            java.lang.Object r9 = r8.opt(r11)
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L21f
            r11 = r9
            java.lang.String r11 = (java.lang.String) r11
            goto L220
        L21f:
            r11 = 0
        L220:
            if (r11 == 0) goto L230
            java.lang.CharSequence r9 = og.m.R0(r11)
            java.lang.String r9 = r9.toString()
            if (r9 == 0) goto L230
        L22c:
            r21 = r9
            r9 = 1
            goto L233
        L230:
            java.lang.String r9 = ""
            goto L22c
        L233:
            boolean r22 = c(r8, r2, r9)
            boolean r23 = c(r8, r5, r9)
            boolean r24 = c(r8, r0, r9)
            r0 = 0
            boolean r25 = c(r8, r1, r0)
            r13 = r4
            r14 = r17
            r17 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3.add(r13)
            int r6 = r6 + 1
            r5 = r0
            r0 = r28
            r1 = r29
            r4 = r30
            r2 = 1
            goto L58
        L25b:
            r19 = r0
            r27 = 0
            java.lang.Object r0 = r10.opt(r14)
            r20 = r1
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L28e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 <= 0) goto L27b
            r1 = 1
            goto L27d
        L27b:
            r1 = r27
        L27d:
            if (r1 == 0) goto L280
            goto L281
        L280:
            r0 = 0
        L281:
            if (r0 == 0) goto L286
            r4.add(r0)
        L286:
            int r14 = r14 + 1
            r0 = r19
            r1 = r20
            goto L1ff
        L28e:
            java.lang.String r0 = " 的置顶会话数据格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L299:
            r19 = r18
            r18 = r14
            r14 = r15
            r15 = r19
            r19 = r0
            r20 = r1
            r27 = 0
            java.lang.Object r0 = r9.opt(r14)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L2d8
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 <= 0) goto L2c0
            r1 = 1
            goto L2c2
        L2c0:
            r1 = r27
        L2c2:
            if (r1 == 0) goto L2c5
            goto L2c6
        L2c5:
            r0 = 0
        L2c6:
            if (r0 == 0) goto L2cb
            r4.add(r0)
        L2cb:
            int r0 = r14 + 1
            r14 = r18
            r1 = r20
            r18 = r15
            r15 = r0
            r0 = r19
            goto L1ee
        L2d8:
            java.lang.String r0 = " 的会话数据格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L2e3:
            java.lang.String r0 = " 缺少会话列表"
            okio.a.m(r15, r7, r0)
            goto L89
        L2ea:
            java.lang.String r0 = " 的上级分组格式错误"
            java.lang.String r0 = eh.a.n(r7, r15, r0)
            j8.o.q(r0)
            goto L89
        L2f5:
            java.lang.String r0 = "导入文件包含重复分组 ID"
            j8.o.t(r0)
            goto L89
        L2fc:
            r26 = r2
            int r6 = r6 + 1
            java.lang.String r0 = " 个分组缺少名称"
            java.lang.String r0 = eh.a.m(r6, r9, r0)
            j8.o.q(r0)
            goto L89
        L30b:
            r26 = r2
            int r6 = r6 + 1
            java.lang.String r0 = " 个分组缺少 ID"
            java.lang.String r0 = eh.a.m(r6, r9, r0)
            j8.o.q(r0)
            goto L89
        L31a:
            r26 = r2
            int r6 = r6 + 1
            java.lang.String r0 = " 个分组字段格式错误"
            java.lang.String r0 = eh.a.m(r6, r9, r0)
            j8.o.q(r0)
            goto L89
        L329:
            r26 = r2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r6 = r6 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r6)
            java.lang.String r2 = " 个分组格式错误"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L348:
            java.lang.String r0 = "导入文件缺少分组数据"
            j8.o.A(r0)
            goto L89
        L34f:
            java.lang.String r0 = "不支持的聊天分组文件版本"
            j8.o.t(r0)
            goto L89
        L356:
            java.lang.String r0 = "不是 Hchat 聊天分组文件"
            j8.o.t(r0)
            goto L89
        L35d:
            java.lang.String r0 = "导入文件为空"
            j8.o.t(r0)
            goto L89
    }

    public static java.util.List o(java.util.List r6, java.util.LinkedHashSet r7) {
            int r0 = tf.n.e1(r6)
            int r0 = tf.y.a0(r0)
            r1 = 16
            if (r0 >= r1) goto Ld
            r0 = r1
        Ld:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r0 = r6.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            r3 = r2
            c9.a r3 = (c9.a) r3
            java.lang.String r3 = r3.f1081a
            r1.put(r3, r2)
            goto L16
        L29:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            dg.n r2 = new dg.n
            r3 = 6
            r2.<init>(r6, r3)
            c9.e2 r3 = new c9.e2
            r4 = 0
            r3.<init>(r7, r4)
            ng.i r4 = new ng.i
            r5 = 1
            r4.<init>(r2, r5, r3)
            ng.h r2 = new ng.h
            r2.<init>(r4)
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r2.next()
            c9.a r3 = (c9.a) r3
            java.lang.String r4 = r3.f1083c
            java.lang.String r4 = p(r1, r7, r4)
            if (r4 == 0) goto L45
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L67
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.put(r4, r5)
        L67:
            java.util.List r5 = (java.util.List) r5
            java.util.List r3 = r3.f1085e
            r5.addAll(r3)
            goto L45
        L6f:
            dg.n r2 = new dg.n
            r3 = 6
            r2.<init>(r6, r3)
            c9.e2 r6 = new c9.e2
            r3 = 1
            r6.<init>(r7, r3)
            ng.i r3 = new ng.i
            r4 = 0
            r3.<init>(r2, r4, r6)
            b0.s r6 = new b0.s
            r2 = 5
            r6.<init>(r0, r1, r7, r2)
            ng.t r6 = ng.m.W(r3, r6)
            java.util.List r6 = ng.m.b0(r6)
            return r6
    }

    public static final java.lang.String p(java.util.LinkedHashMap r3, java.util.LinkedHashSet r4, java.lang.String r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r5 == 0) goto L21
            boolean r1 = r0.add(r5)
            if (r1 == 0) goto L21
            java.lang.Object r5 = r3.get(r5)
            c9.a r5 = (c9.a) r5
            if (r5 == 0) goto L21
            java.lang.String r1 = r5.f1081a
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L1e
            return r1
        L1e:
            java.lang.String r5 = r5.f1083c
            goto L5
        L21:
            r3 = 0
            return r3
    }

    public static final void q(java.util.HashMap r4, java.util.LinkedHashMap r5, java.lang.String r6) {
            java.lang.Object r0 = r4.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 1
            if (r0 != 0) goto La
            goto L10
        La:
            int r2 = r0.intValue()
            if (r2 == r1) goto L48
        L10:
            r2 = 2
            if (r0 != 0) goto L14
            goto L1b
        L14:
            int r0 = r0.intValue()
            if (r0 != r2) goto L1b
            goto L48
        L1b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.put(r6, r0)
            java.lang.Object r0 = r5.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L41
            java.lang.Object r3 = r4.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L33
            goto L3e
        L33:
            int r3 = r3.intValue()
            if (r3 != r1) goto L3e
            r0 = 0
            r5.put(r6, r0)
            goto L41
        L3e:
            q(r4, r5, r0)
        L41:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.put(r6, r5)
        L48:
            return
    }

    public static boolean r(android.content.Context r5, java.lang.String r6, java.util.List r7) {
            java.lang.String r0 = "Hchat_conversation_groups"
            android.content.SharedPreferences r5 = ub.b.c(r5, r0)
            java.lang.String r0 = "groups_v1"
            java.lang.String r1 = ""
            java.lang.String r2 = r5.getString(r0, r1)
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = r2
        L12:
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L1e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            goto L33
        L1e:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L24
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L24
            goto L2a
        L24:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
        L2a:
            java.lang.Throwable r1 = sf.g.b(r2)
            if (r1 != 0) goto L7a
            r1 = r2
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L33:
            java.lang.String r2 = "accounts"
            org.json.JSONObject r3 = r1.optJSONObject(r2)
            if (r3 == 0) goto L3c
            goto L41
        L3c:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L41:
            org.json.JSONArray r7 = g(r7)
            r3.put(r6, r7)
            java.lang.String r7 = "schemaVersion"
            r4 = 1
            r1.put(r7, r4)
            r1.put(r2, r3)
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r7 = r1.toString()
            android.content.SharedPreferences$Editor r5 = r5.putString(r0, r7)
            boolean r5 = r5.commit()
            if (r5 != 0) goto L79
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "[Hchat:ConversationGroup] 保存账号 "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = " 的聊天分组失败"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            fb.v0.m(r6)
        L79:
            return r5
        L7a:
            java.lang.String r5 = r1.getMessage()
            java.lang.String r6 = "[Hchat:ConversationGroup] 配置已损坏，拒绝覆盖现有账号数据: "
            eh.a.x(r6, r5, r1)
            r5 = 0
            return r5
    }

    public static final boolean s(android.content.Context r21, java.lang.String r22, java.lang.String r23) {
            r0 = r21
            r0.getClass()
            r22.getClass()
            java.lang.Object r1 = c9.o2.f1298a
            monitor-enter(r1)
            java.lang.String r2 = a()     // Catch: java.lang.Throwable -> L33
            java.lang.CharSequence r3 = og.m.R0(r22)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L33
            r4 = 0
            r5 = 1
            r6 = 0
            if (r23 == 0) goto L36
            java.lang.CharSequence r7 = og.m.R0(r23)     // Catch: java.lang.Throwable -> L33
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L36
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L33
            if (r8 <= 0) goto L2e
            r8 = r5
            goto L2f
        L2e:
            r8 = r6
        L2f:
            if (r8 == 0) goto L36
            r4 = r7
            goto L36
        L33:
            r0 = move-exception
            goto L120
        L36:
            boolean r7 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L33
            if (r7 != 0) goto L71
            boolean r7 = og.m.t0(r3)     // Catch: java.lang.Throwable -> L33
            if (r7 != 0) goto L71
            java.lang.String r7 = "wxid_hchat_group_"
            boolean r7 = og.t.d0(r3, r7, r6)     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L4b
            goto L71
        L4b:
            java.util.List r7 = j(r0, r2)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L74
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L58
            goto L71
        L58:
            java.util.Iterator r8 = r7.iterator()     // Catch: java.lang.Throwable -> L33
        L5c:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L71
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L33
            c9.a r9 = (c9.a) r9     // Catch: java.lang.Throwable -> L33
            java.lang.String r9 = r9.f1081a     // Catch: java.lang.Throwable -> L33
            boolean r9 = gg.l.a(r9, r4)     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L5c
            goto L74
        L71:
            r5 = r6
            goto L11e
        L74:
            java.lang.String r6 = d(r3, r7)     // Catch: java.lang.Throwable -> L33
            boolean r6 = gg.l.a(r6, r4)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L80
            goto L11e
        L80:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            int r6 = tf.n.e1(r7)     // Catch: java.lang.Throwable -> L33
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r6 = r7.iterator()     // Catch: java.lang.Throwable -> L33
        L8d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L116
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L33
            r8 = r7
            c9.a r8 = (c9.a) r8     // Catch: java.lang.Throwable -> L33
            java.util.List r7 = r8.f1085e     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            r13.<init>()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L33
        La5:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto Lbc
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L33
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L33
            boolean r10 = gg.l.a(r10, r3)     // Catch: java.lang.Throwable -> L33
            if (r10 != 0) goto La5
            r13.add(r9)     // Catch: java.lang.Throwable -> L33
            goto La5
        Lbc:
            java.util.List r7 = r8.f1086f     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            r14.<init>()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L33
        Lc7:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto Lde
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L33
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L33
            boolean r10 = gg.l.a(r10, r3)     // Catch: java.lang.Throwable -> L33
            if (r10 != 0) goto Lc7
            r14.add(r9)     // Catch: java.lang.Throwable -> L33
            goto Lc7
        Lde:
            java.lang.String r7 = r8.f1081a     // Catch: java.lang.Throwable -> L33
            boolean r7 = gg.l.a(r7, r4)     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto Lfe
            java.util.ArrayList r13 = tf.m.G1(r13, r3)     // Catch: java.lang.Throwable -> L33
            r19 = 0
            r20 = 4047(0xfcf, float:5.671E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            c9.a r7 = c9.a.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L33
            goto L111
        Lfe:
            r19 = 0
            r20 = 4047(0xfcf, float:5.671E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            c9.a r7 = c9.a.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L33
        L111:
            r5.add(r7)     // Catch: java.lang.Throwable -> L33
            goto L8d
        L116:
            java.util.ArrayList r3 = l(r5)     // Catch: java.lang.Throwable -> L33
            boolean r5 = r(r0, r2, r3)     // Catch: java.lang.Throwable -> L33
        L11e:
            monitor-exit(r1)
            return r5
        L120:
            monitor-exit(r1)
            throw r0
    }

    public static final boolean t(android.content.Context r21, java.lang.String r22, java.util.ArrayList r23) {
            r0 = r21
            java.lang.Object r1 = c9.o2.f1298a
            monitor-enter(r1)
            java.lang.String r2 = a()     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r4 = 1
            r5 = 0
            if (r22 == 0) goto L28
            java.lang.CharSequence r6 = og.m.R0(r22)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L28
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L25
            if (r7 <= 0) goto L20
            r7 = r4
            goto L21
        L20:
            r7 = r5
        L21:
            if (r7 == 0) goto L28
            r3 = r6
            goto L28
        L25:
            r0 = move-exception
            goto L125
        L28:
            dg.n r6 = new dg.n     // Catch: java.lang.Throwable -> L25
            r7 = 6
            r8 = r23
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L25
            c9.n2 r7 = c9.n2.f1288n     // Catch: java.lang.Throwable -> L25
            ng.t r6 = ng.m.W(r6, r7)     // Catch: java.lang.Throwable -> L25
            b4.b r7 = new b4.b     // Catch: java.lang.Throwable -> L25
            r8 = 7
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L25
            ng.i r8 = new ng.i     // Catch: java.lang.Throwable -> L25
            r8.<init>(r6, r4, r7)     // Catch: java.lang.Throwable -> L25
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L25
            r4.<init>()     // Catch: java.lang.Throwable -> L25
            ng.m.a0(r8, r4)     // Catch: java.lang.Throwable -> L25
            boolean r6 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L25
            if (r6 != 0) goto L123
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L57
            goto L123
        L57:
            java.util.List r6 = j(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L7d
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r7 == 0) goto L65
            goto L123
        L65:
            java.util.Iterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L25
        L69:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L123
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L25
            c9.a r8 = (c9.a) r8     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = r8.f1081a     // Catch: java.lang.Throwable -> L25
            boolean r8 = gg.l.a(r8, r3)     // Catch: java.lang.Throwable -> L25
            if (r8 == 0) goto L69
        L7d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
            int r7 = tf.n.e1(r6)     // Catch: java.lang.Throwable -> L25
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L25
        L8a:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r7 == 0) goto L11b
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L25
            r8 = r7
            c9.a r8 = (c9.a) r8     // Catch: java.lang.Throwable -> L25
            java.util.List r7 = r8.f1085e     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
            r13.<init>()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L25
        La2:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r9 == 0) goto Lb9
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L25
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L25
            boolean r10 = r4.contains(r10)     // Catch: java.lang.Throwable -> L25
            if (r10 != 0) goto La2
            r13.add(r9)     // Catch: java.lang.Throwable -> L25
            goto La2
        Lb9:
            java.util.List r7 = r8.f1086f     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25
            r14.<init>()     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L25
        Lc4:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r9 == 0) goto Ldb
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L25
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L25
            boolean r10 = r4.contains(r10)     // Catch: java.lang.Throwable -> L25
            if (r10 != 0) goto Lc4
            r14.add(r9)     // Catch: java.lang.Throwable -> L25
            goto Lc4
        Ldb:
            java.lang.String r7 = r8.f1081a     // Catch: java.lang.Throwable -> L25
            boolean r7 = gg.l.a(r7, r3)     // Catch: java.lang.Throwable -> L25
            if (r7 == 0) goto L103
            java.util.ArrayList r7 = tf.m.F1(r13, r4)     // Catch: java.lang.Throwable -> L25
            java.util.Set r7 = tf.m.T1(r7)     // Catch: java.lang.Throwable -> L25
            java.util.List r13 = tf.m.P1(r7)     // Catch: java.lang.Throwable -> L25
            r19 = 0
            r20 = 4047(0xfcf, float:5.671E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            c9.a r7 = c9.a.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L25
            goto L116
        L103:
            r19 = 0
            r20 = 4047(0xfcf, float:5.671E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            c9.a r7 = c9.a.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L25
        L116:
            r5.add(r7)     // Catch: java.lang.Throwable -> L25
            goto L8a
        L11b:
            java.util.ArrayList r3 = l(r5)     // Catch: java.lang.Throwable -> L25
            boolean r5 = r(r0, r2, r3)     // Catch: java.lang.Throwable -> L25
        L123:
            monitor-exit(r1)
            return r5
        L125:
            monitor-exit(r1)
            throw r0
    }

    public static final boolean u(android.content.Context r35, c9.a r36) {
            r0 = r35
            r1 = r36
            r0.getClass()
            r1.getClass()
            java.lang.Object r14 = c9.o2.f1298a
            monitor-enter(r14)
            java.lang.String r15 = a()     // Catch: java.lang.Throwable -> L48
            boolean r2 = og.m.t0(r15)     // Catch: java.lang.Throwable -> L48
            r16 = 0
            if (r2 == 0) goto L1b
            goto L1e9
        L1b:
            java.util.List r2 = j(r0, r15)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r1.f1081a     // Catch: java.lang.Throwable -> L48
            java.lang.CharSequence r3 = og.m.R0(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L48
            r5 = r16
        L2f:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L48
            c9.a r6 = (c9.a) r6     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.f1081a     // Catch: java.lang.Throwable -> L48
            boolean r6 = gg.l.a(r6, r3)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L45
        L43:
            r4 = r5
            goto L4d
        L45:
            int r5 = r5 + 1
            goto L2f
        L48:
            r0 = move-exception
            goto L1eb
        L4b:
            r5 = -1
            goto L43
        L4d:
            if (r4 < 0) goto L1e9
            java.lang.String r5 = r1.f1082b     // Catch: java.lang.Throwable -> L48
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L48
            boolean r5 = og.m.t0(r5)     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L61
            goto L1e9
        L61:
            java.lang.String r5 = r1.f1083c     // Catch: java.lang.Throwable -> L48
            r17 = 0
            r6 = 1
            if (r5 == 0) goto L7f
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L7f
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L48
            if (r7 <= 0) goto L7a
            r7 = r6
            goto L7c
        L7a:
            r7 = r16
        L7c:
            if (r7 == 0) goto L7f
            goto L81
        L7f:
            r5 = r17
        L81:
            if (r5 != 0) goto L85
            r7 = r6
            goto Lb6
        L85:
            boolean r7 = r5.equals(r3)     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto Lb4
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L92
            goto Lb4
        L92:
            java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> L48
        L96:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r8 == 0) goto Lb4
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L48
            c9.a r8 = (c9.a) r8     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = r8.f1081a     // Catch: java.lang.Throwable -> L48
            boolean r8 = gg.l.a(r8, r5)     // Catch: java.lang.Throwable -> L48
            if (r8 == 0) goto L96
            java.util.Set r7 = f(r3, r2)     // Catch: java.lang.Throwable -> L48
            boolean r7 = r7.contains(r5)     // Catch: java.lang.Throwable -> L48
            r7 = r7 ^ r6
            goto Lb6
        Lb4:
            r7 = r16
        Lb6:
            if (r7 != 0) goto Lba
            goto L1e9
        Lba:
            java.util.List r7 = r1.f1085e     // Catch: java.lang.Throwable -> L48
            dg.n r7 = tf.m.m1(r7)     // Catch: java.lang.Throwable -> L48
            c9.l2 r8 = c9.l2.f1258n     // Catch: java.lang.Throwable -> L48
            ng.t r7 = ng.m.W(r7, r8)     // Catch: java.lang.Throwable -> L48
            c9.m2 r8 = c9.m2.f1276n     // Catch: java.lang.Throwable -> L48
            r8.getClass()     // Catch: java.lang.Throwable -> L48
            ng.i r9 = new ng.i     // Catch: java.lang.Throwable -> L48
            r9.<init>(r7, r6, r8)     // Catch: java.lang.Throwable -> L48
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L48
            r6.<init>()     // Catch: java.lang.Throwable -> L48
            ng.m.a0(r9, r6)     // Catch: java.lang.Throwable -> L48
            java.util.List r7 = r1.f1086f     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r8.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L48
        Le3:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r9 == 0) goto Lfa
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L48
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L48
            boolean r10 = r6.contains(r10)     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto Le3
            r8.add(r9)     // Catch: java.lang.Throwable -> L48
            goto Le3
        Lfa:
            java.util.Set r7 = tf.m.T1(r8)     // Catch: java.lang.Throwable -> L48
            java.util.List r7 = tf.m.P1(r7)     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            int r9 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> L48
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r18 = r2.iterator()     // Catch: java.lang.Throwable -> L48
            r2 = r16
        L111:
            boolean r9 = r18.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r9 == 0) goto L1da
            java.lang.Object r9 = r18.next()     // Catch: java.lang.Throwable -> L48
            int r19 = r2 + 1
            if (r2 < 0) goto L1d6
            c9.a r9 = (c9.a) r9     // Catch: java.lang.Throwable -> L48
            if (r2 != r4) goto L159
            java.lang.String r2 = r1.f1082b     // Catch: java.lang.Throwable -> L48
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L48
            int r9 = r1.f1084d     // Catch: java.lang.Throwable -> L48
            if (r9 >= 0) goto L133
            r9 = r16
        L133:
            r10 = r6
            java.util.List r6 = tf.m.P1(r10)     // Catch: java.lang.Throwable -> L48
            r12 = 0
            r13 = 4032(0xfc0, float:5.65E-42)
            r11 = r8
            r8 = 0
            r20 = r4
            r4 = r5
            r5 = r9
            r9 = 0
            r21 = r10
            r10 = 0
            r22 = r11
            r11 = 0
            r0 = r3
            r3 = r2
            r2 = r0
            r34 = r15
            r33 = r20
            r0 = r21
            r15 = r22
            c9.a r3 = c9.a.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L48
            goto L1c3
        L159:
            r2 = r3
            r33 = r4
            r4 = r5
            r0 = r6
            r34 = r15
            r15 = r8
            java.util.List r1 = r9.f1085e     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L48
        L16c:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L183
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L48
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L48
            boolean r6 = r0.contains(r6)     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L16c
            r3.add(r5)     // Catch: java.lang.Throwable -> L48
            goto L16c
        L183:
            java.util.List r1 = r9.f1086f     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r5.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L48
        L18e:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L1a5
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L48
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L48
            boolean r8 = r0.contains(r8)     // Catch: java.lang.Throwable -> L48
            if (r8 != 0) goto L18e
            r5.add(r6)     // Catch: java.lang.Throwable -> L48
            goto L18e
        L1a5:
            r31 = 0
            r32 = 4047(0xfcf, float:5.671E-42)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r25 = r3
            r26 = r5
            r20 = r9
            c9.a r3 = c9.a.a(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> L48
        L1c3:
            r15.add(r3)     // Catch: java.lang.Throwable -> L48
            r1 = r36
            r6 = r0
            r3 = r2
            r5 = r4
            r8 = r15
            r2 = r19
            r4 = r33
            r15 = r34
            r0 = r35
            goto L111
        L1d6:
            a.a.Q0()     // Catch: java.lang.Throwable -> L48
            throw r17     // Catch: java.lang.Throwable -> L48
        L1da:
            r34 = r15
            r15 = r8
            java.util.ArrayList r0 = l(r15)     // Catch: java.lang.Throwable -> L48
            r1 = r35
            r2 = r34
            boolean r16 = r(r1, r2, r0)     // Catch: java.lang.Throwable -> L48
        L1e9:
            monitor-exit(r14)
            return r16
        L1eb:
            monitor-exit(r14)
            throw r0
    }
}
