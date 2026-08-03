package na;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements g8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9133b;

    public /* synthetic */ f(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f9132a = r2
            r0.f9133b = r1
            r0.<init>()
            return
    }

    @Override // g8.f
    public final void a(b.e r29) {
            r28 = this;
            r1 = r28
            r0 = r29
            int r2 = r1.f9132a
            switch(r2) {
                case 0: goto L69b;
                case 1: goto L301;
                default: goto L9;
            }
        L9:
            java.lang.Object r2 = r1.f9133b
            hb.r r2 = (hb.r) r2
            java.lang.Object r3 = r2.f5460g
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            tf.v r4 = tf.v.f13169g
            java.lang.Object r5 = r2.f5458e
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r6 = r2.f5456c
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            tf.t r7 = tf.t.f13167g
            boolean r8 = r0.w()
            java.lang.Object r9 = r0.f332h
            l8.a r9 = (l8.a) r9
            android.content.ContentValues r9 = r9.f7895d
            r10 = 1
            if (r9 == 0) goto L34
            java.lang.String r12 = "roomdata"
            boolean r9 = r9.containsKey(r12)
            if (r9 == 0) goto L34
            r9 = r10
            goto L35
        L34:
            r9 = 0
        L35:
            if (r8 != 0) goto L3b
            if (r9 != 0) goto L3b
            goto L300
        L3b:
            java.lang.String r9 = r0.n()
            r9.getClass()
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r13 = r9.toString()
            int r9 = r13.length()
            if (r9 != 0) goto L52
            goto L300
        L52:
            java.lang.Object r9 = r0.f333i
            h.Hchat.hooks.api.model.WeChatChatroom r9 = (h.Hchat.hooks.api.model.WeChatChatroom) r9
            if (r9 == 0) goto L5d
            java.util.List<java.lang.String> r9 = r9.memberIds
            if (r9 == 0) goto L5d
            goto L71
        L5d:
            g8.d r9 = j8.b.f()
            if (r9 == 0) goto L6c
            java.lang.String r14 = r0.n()
            java.util.List r9 = r9.i(r14)
            goto L6d
        L6c:
            r9 = 0
        L6d:
            if (r9 == 0) goto L70
            goto L71
        L70:
            r9 = r7
        L71:
            dg.n r14 = new dg.n
            r15 = 6
            r14.<init>(r9, r15)
            o9.e r9 = new o9.e
            r15 = 19
            r9.<init>(r15)
            ng.t r9 = ng.m.W(r14, r9)
            o9.e r14 = new o9.e
            r15 = 20
            r14.<init>(r15)
            ng.i r15 = new ng.i
            r15.<init>(r9, r10, r14)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            ng.m.a0(r15, r9)
            boolean r14 = r9.isEmpty()
            if (r14 == 0) goto L9e
            goto L300
        L9e:
            java.util.Map r0 = hb.r.f(r13, r9, r0)
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto Laa
            r14 = 0
            goto Lb4
        Laa:
            java.lang.Object r14 = r2.f5459f
            java.util.concurrent.ConcurrentHashMap r14 = (java.util.concurrent.ConcurrentHashMap) r14
            java.lang.Object r14 = r14.put(r13, r0)
            java.util.Map r14 = (java.util.Map) r14
        Lb4:
            if (r8 == 0) goto Lbd
            java.lang.Object r5 = r5.put(r13, r9)
            java.util.Set r5 = (java.util.Set) r5
            goto Lc9
        Lbd:
            java.lang.Object r15 = r5.get(r13)
            java.util.Set r15 = (java.util.Set) r15
            if (r15 != 0) goto Lc8
            r5.putIfAbsent(r13, r9)
        Lc8:
            r5 = r15
        Lc9:
            long r18 = java.lang.System.currentTimeMillis()
            if (r5 != 0) goto Ld1
            r15 = r4
            goto Ld8
        Ld1:
            r15 = r5
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Set r15 = tf.d0.T(r9, r15)
        Ld8:
            if (r5 != 0) goto Ldb
            goto Ldf
        Ldb:
            java.util.Set r4 = tf.d0.T(r5, r9)
        Ldf:
            java.lang.Object r16 = r3.get(r13)
            r10 = r16
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto Lf6
            long r20 = r10.longValue()
            int r16 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r16 > 0) goto Lf3
            r10 = 1
            goto Lf7
        Lf3:
            r3.remove(r13, r10)
        Lf6:
            r10 = 0
        Lf7:
            boolean r4 = r4.isEmpty()
            r12 = 10
            if (r4 == 0) goto L107
            int r4 = r15.size()
            if (r4 < r12) goto L107
            r4 = 1
            goto L108
        L107:
            r4 = 0
        L108:
            java.lang.String r15 = ""
            if (r10 != 0) goto L182
            if (r4 != 0) goto L182
            if (r14 == 0) goto L182
            if (r5 == 0) goto L182
            r10 = r5
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.LinkedHashSet r9 = tf.m.x1(r10, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L122:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L17f
            java.lang.Object r17 = r9.next()
            r11 = r17
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r17 = r14.get(r11)
            java.lang.String r17 = (java.lang.String) r17
            if (r17 == 0) goto L141
            java.lang.CharSequence r17 = og.m.R0(r17)
            java.lang.String r17 = r17.toString()
            goto L143
        L141:
            r17 = 0
        L143:
            if (r17 != 0) goto L147
            r12 = r15
            goto L149
        L147:
            r12 = r17
        L149:
            java.lang.Object r17 = r0.get(r11)
            java.lang.String r17 = (java.lang.String) r17
            if (r17 == 0) goto L15a
            java.lang.CharSequence r17 = og.m.R0(r17)
            java.lang.String r17 = r17.toString()
            goto L15c
        L15a:
            r17 = 0
        L15c:
            r21 = r0
            if (r17 != 0) goto L162
            r0 = r15
            goto L164
        L162:
            r0 = r17
        L164:
            boolean r17 = r12.equals(r0)
            r22 = r4
            if (r17 == 0) goto L16e
            r4 = 0
            goto L173
        L16e:
            q9.d r4 = new q9.d
            r4.<init>(r11, r12, r0)
        L173:
            if (r4 == 0) goto L178
            r10.add(r4)
        L178:
            r0 = r21
            r4 = r22
            r12 = 10
            goto L122
        L17f:
            r22 = r4
            goto L185
        L182:
            r22 = r4
            r10 = r7
        L185:
            int r0 = r10.size()
            r4 = 10
            if (r0 < r4) goto L18e
            r10 = 0
        L18e:
            if (r10 != 0) goto L191
            goto L192
        L191:
            r7 = r10
        L192:
            java.util.Iterator r4 = r7.iterator()
        L196:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2eb
            java.lang.Object r0 = r4.next()
            r7 = r0
            q9.d r7 = (q9.d) r7
            java.lang.String r0 = "group_rename_notice_enable"
            r9 = 0
            boolean r0 = r6.getBoolean(r0, r9)
            if (r0 == 0) goto L1d3
            java.lang.String r0 = "group_rename_notice_scope"
            java.lang.String r9 = "all"
            java.lang.String r0 = r6.getString(r0, r9)
            if (r0 == 0) goto L1b7
            r9 = r0
        L1b7:
            java.lang.String r0 = "specific"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L1dd
            java.lang.String r0 = "group_rename_notice_groups"
            java.lang.String r0 = r6.getString(r0, r15)
            if (r0 != 0) goto L1c8
            r0 = r15
        L1c8:
            java.util.Set r0 = hb.r.t(r0)
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L1d3
            goto L1dd
        L1d3:
            r29 = r4
            r21 = r5
            r23 = r8
        L1d9:
            r4 = r15
            r5 = 0
            goto L2b3
        L1dd:
            java.lang.Object r0 = r2.f5455b
            r9 = r0
            ia.t r9 = (ia.t) r9
            java.lang.String r0 = "改名系统消息插入失败: "
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.Object r12 = r2.f5461h
            java.util.concurrent.ConcurrentHashMap r12 = (java.util.concurrent.ConcurrentHashMap) r12
            int r14 = r12.size()
            r29 = r4
            r4 = 128(0x80, float:1.8E-43)
            if (r14 < r4) goto L210
            java.util.Set r4 = r12.entrySet()
            ca.c r14 = new ca.c
            r21 = r5
            r5 = 10
            r14.<init>(r10, r5)
            be.i r5 = new be.i
            r23 = r8
            r8 = 22
            r5.<init>(r14, r8)
            r4.removeIf(r5)
            goto L214
        L210:
            r21 = r5
            r23 = r8
        L214:
            java.lang.String r4 = r7.f10744a
            java.lang.String r5 = r7.f10745b
            java.lang.String r8 = r7.f10746c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r24 = r10
            java.lang.String r10 = "|"
            r14.append(r10)
            r14.append(r4)
            r14.append(r10)
            r14.append(r5)
            java.lang.String r4 = eh.a.r(r14, r10, r8)
            java.lang.Object r5 = r12.get(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L24b
            long r10 = r5.longValue()
            long r10 = r24 - r10
            r26 = 5000(0x1388, double:2.4703E-320)
            int r5 = (r10 > r26 ? 1 : (r10 == r26 ? 0 : -1))
            if (r5 >= 0) goto L24b
            goto L1d9
        L24b:
            java.lang.Long r5 = java.lang.Long.valueOf(r24)
            r12.put(r4, r5)
            i8.c r4 = h.Hchat.hooks.api.core.WeChatApis.message()
            r4.getClass()
            k8.e r12 = h.Hchat.hooks.api.core.WeChatApis.h()
            if (r12 != 0) goto L268
            java.lang.String r0 = "改名系统消息插入失败: 本地消息 API 未就绪"
            r4 = 0
            r9.invoke(r0, r4)
            r5 = r4
            r4 = r15
            goto L2b3
        L268:
            r4 = 0
            r12.c()     // Catch: java.lang.Throwable -> L29f
            java.lang.String r14 = r2.d(r13, r7)     // Catch: java.lang.Throwable -> L29f
            r17 = 1
            r5 = r4
            r4 = r15
            r15 = r24
            long r10 = r12.e(r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L29a
            r14 = 0
            int r8 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r8 > 0) goto L29c
            java.lang.String r8 = r7.f10744a     // Catch: java.lang.Throwable -> L29a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29a
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L29a
            r10.append(r13)     // Catch: java.lang.Throwable -> L29a
            java.lang.String r0 = "/"
            r10.append(r0)     // Catch: java.lang.Throwable -> L29a
            r10.append(r8)     // Catch: java.lang.Throwable -> L29a
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L29a
            r9.invoke(r0, r5)     // Catch: java.lang.Throwable -> L29a
            goto L29c
        L29a:
            r0 = move-exception
            goto L2a2
        L29c:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L29a
            goto L2a8
        L29f:
            r0 = move-exception
            r5 = r4
            r4 = r15
        L2a2:
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        L2a8:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L2b3
            java.lang.String r8 = "改名系统消息插入异常"
            r9.invoke(r8, r0)
        L2b3:
            java.lang.String r0 = "group_rename_send_enable"
            r9 = 0
            boolean r0 = r6.getBoolean(r0, r9)
            if (r0 != 0) goto L2bd
            goto L2e2
        L2bd:
            java.lang.String r0 = "group_rename_listen_groups"
            java.lang.String r15 = r6.getString(r0, r4)
            if (r15 != 0) goto L2c6
            r15 = r4
        L2c6:
            java.util.Set r0 = hb.r.t(r15)
            boolean r0 = r0.contains(r13)
            if (r0 != 0) goto L2d1
            goto L2e2
        L2d1:
            java.lang.Thread r0 = new java.lang.Thread
            ac.l r8 = new ac.l
            r10 = 27
            r8.<init>(r10, r2, r7, r13)
            java.lang.String r7 = "Hchat-GroupRenameMonitor"
            r0.<init>(r8, r7)
            r0.start()
        L2e2:
            r15 = r4
            r5 = r21
            r8 = r23
            r4 = r29
            goto L196
        L2eb:
            r21 = r5
            r23 = r8
            if (r21 == 0) goto L2f5
            if (r23 == 0) goto L300
            if (r22 == 0) goto L300
        L2f5:
            r4 = 15000(0x3a98, double:7.411E-320)
            long r18 = r18 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r3.put(r13, r0)
        L300:
            return
        L301:
            java.lang.Object r2 = r1.f9133b
            o9.p r2 = (o9.p) r2
            java.util.concurrent.ConcurrentHashMap r3 = r2.f9666e
            tf.t r4 = tf.t.f13167g
            java.util.concurrent.ConcurrentHashMap r5 = r2.f9669h
            long r6 = java.lang.System.currentTimeMillis()
            boolean r8 = r0.w()
            java.lang.Object r9 = r0.f333i
            h.Hchat.hooks.api.model.WeChatChatroom r9 = (h.Hchat.hooks.api.model.WeChatChatroom) r9
            java.lang.Object r10 = r0.f332h
            l8.a r10 = (l8.a) r10
            android.content.ContentValues r10 = r10.f7895d
            if (r10 == 0) goto L329
            java.lang.String r13 = "roomdata"
            boolean r10 = r10.containsKey(r13)
            if (r10 == 0) goto L329
            r10 = 1
            goto L32a
        L329:
            r10 = 0
        L32a:
            if (r8 != 0) goto L330
            if (r10 != 0) goto L330
            goto L69a
        L330:
            java.lang.String r13 = r0.n()
            r13.getClass()
            java.lang.CharSequence r13 = og.m.R0(r13)
            java.lang.String r15 = r13.toString()
            int r13 = r15.length()
            if (r13 != 0) goto L347
            goto L69a
        L347:
            java.lang.String r13 = "|"
            if (r10 == 0) goto L35e
            java.lang.Object r10 = r3.get(r15)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L367
            long r16 = r10.longValue()
            int r14 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r14 > 0) goto L364
            r2.g(r15)
        L35e:
            r17 = r4
            r18 = r6
            goto L3fb
        L364:
            r3.remove(r15, r10)
        L367:
            long r11 = java.lang.System.currentTimeMillis()
            boolean r14 = r5.isEmpty()
            if (r14 != 0) goto L389
            java.util.Set r14 = r5.entrySet()
            ca.c r10 = new ca.c
            r17 = r4
            r4 = 8
            r10.<init>(r11, r4)
            be.i r4 = new be.i
            r11 = 19
            r4.<init>(r10, r11)
            r14.removeIf(r4)
            goto L38b
        L389:
            r17 = r4
        L38b:
            java.lang.String r4 = r15.concat(r13)
            java.util.Set r10 = r5.entrySet()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L3a1:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L3c6
            java.lang.Object r12 = r10.next()
            r14 = r12
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r14 = r14.getKey()
            r14.getClass()
            java.lang.String r14 = (java.lang.String) r14
            r18 = r6
            r6 = 0
            boolean r7 = og.t.d0(r14, r4, r6)
            if (r7 == 0) goto L3c3
            r11.add(r12)
        L3c3:
            r6 = r18
            goto L3a1
        L3c6:
            r18 = r6
            java.util.Iterator r6 = r11.iterator()
        L3cc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L3fb
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r10 = r7.getKey()
            r10.getClass()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = og.m.A0(r10, r4)
            java.lang.Object r11 = r7.getValue()
            o9.l r11 = (o9.l) r11
            int r11 = r11.f9644a
            boolean r10 = r2.o(r11, r15, r10)
            if (r10 == 0) goto L3cc
            java.lang.Object r7 = r7.getKey()
            r5.remove(r7)
            goto L3cc
        L3fb:
            if (r8 != 0) goto L3ff
            goto L69a
        L3ff:
            java.util.concurrent.ConcurrentHashMap r4 = r2.f9667f
            if (r9 == 0) goto L4b0
            java.util.List<java.lang.String> r7 = r9.memberIds
            java.lang.String r8 = r9.rawDisplayNames
            int r10 = r7.size()
            boolean r11 = og.m.t0(r8)
            if (r11 == 0) goto L416
            r11 = r17
            r21 = 0
            goto L44d
        L416:
            java.lang.String r11 = "\n"
            java.lang.String r12 = ";"
            java.lang.String r14 = "\u0001"
            r21 = 0
            java.lang.String r6 = "\u0002"
            java.lang.String[] r6 = new java.lang.String[]{r14, r6, r11, r12}
            java.util.List r6 = a.a.y0(r6)
            java.util.Iterator r6 = r6.iterator()
        L42c:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L449
            java.lang.Object r11 = r6.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String[] r11 = new java.lang.String[]{r11}
            java.util.List r11 = og.m.G0(r8, r11)
            if (r10 <= 0) goto L44d
            int r12 = r11.size()
            if (r12 != r10) goto L42c
            goto L44d
        L449:
            java.util.List r11 = a.a.x0(r8)
        L44d:
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L4b2
            int r6 = r11.size()
            int r8 = r7.size()
            if (r6 == r8) goto L45e
            goto L4b2
        L45e:
            java.util.Iterator r6 = r7.iterator()
            r7 = 0
        L463:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L4b2
            java.lang.Object r8 = r6.next()
            int r10 = r7 + 1
            if (r7 < 0) goto L4ac
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = tf.m.w1(r7, r11)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L484
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            goto L486
        L484:
            r7 = r21
        L486:
            if (r7 != 0) goto L48a
            java.lang.String r7 = ""
        L48a:
            java.lang.String r12 = o9.p.e(r15, r8)
            r4.remove(r12)
            boolean r12 = og.m.t0(r8)
            if (r12 != 0) goto L4aa
            boolean r12 = og.m.t0(r7)
            if (r12 != 0) goto L4aa
            boolean r12 = r7.equals(r8)
            if (r12 != 0) goto L4aa
            java.lang.String r8 = o9.p.e(r15, r8)
            r4.put(r8, r7)
        L4aa:
            r7 = r10
            goto L463
        L4ac:
            a.a.Q0()
            throw r21
        L4b0:
            r21 = 0
        L4b2:
            if (r9 == 0) goto L4b9
            java.util.List<java.lang.String> r4 = r9.memberIds
            if (r4 == 0) goto L4b9
            goto L4d0
        L4b9:
            g8.d r4 = j8.b.f()
            if (r4 == 0) goto L4c8
            java.lang.String r0 = r0.n()
            java.util.List r0 = r4.i(r0)
            goto L4ca
        L4c8:
            r0 = r21
        L4ca:
            if (r0 == 0) goto L4ce
            r4 = r0
            goto L4d0
        L4ce:
            r4 = r17
        L4d0:
            dg.n r0 = new dg.n
            r6 = 6
            r0.<init>(r4, r6)
            o9.e r4 = new o9.e
            r6 = 3
            r4.<init>(r6)
            ng.t r0 = ng.m.W(r0, r4)
            o9.e r4 = new o9.e
            r6 = 4
            r4.<init>(r6)
            ng.i r6 = new ng.i
            r10 = 1
            r6.<init>(r0, r10, r4)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            ng.m.a0(r6, r0)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4fc
            goto L69a
        L4fc:
            r2.B(r15, r0)
            java.util.concurrent.ConcurrentHashMap r4 = r2.f9665d
            java.lang.Object r4 = r4.put(r15, r0)
            java.util.Set r4 = (java.util.Set) r4
            r6 = 15000(0x3a98, double:7.411E-320)
            if (r4 != 0) goto L519
            long r6 = r18 + r6
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.put(r15, r0)
            r2.g(r15)
            goto L69a
        L519:
            r8 = r4
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r8 = tf.d0.T(r0, r8)
            java.util.Set r0 = tf.d0.T(r4, r0)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L532
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L532
            goto L69a
        L532:
            java.lang.Object r4 = r3.get(r15)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L546
            long r11 = r4.longValue()
            int r9 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r9 > 0) goto L543
            goto L554
        L543:
            r3.remove(r15, r4)
        L546:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L565
            int r4 = r8.size()
            r9 = 10
            if (r4 < r9) goto L565
        L554:
            long r6 = r18 + r6
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.put(r15, r0)
            r2.g(r15)
            r2.g(r15)
            goto L69a
        L565:
            java.util.Iterator r3 = r0.iterator()
        L569:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L645
            java.lang.Object r0 = r3.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences r0 = r2.f9663b
            java.lang.String r6 = "group_leave_monitor_enable"
            r7 = 0
            boolean r0 = r0.getBoolean(r6, r7)
            if (r0 == 0) goto L636
            boolean r0 = r2.q(r15)
            if (r0 == 0) goto L636
            ia.t r6 = r2.f9662a
            java.lang.String r0 = "退群系统消息插入失败: "
            long r11 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r9 = r2.f9668g
            int r14 = r9.size()
            r7 = 128(0x80, float:1.8E-43)
            if (r14 >= r7) goto L59c
            r22 = r3
            goto L5b3
        L59c:
            java.util.Set r7 = r9.entrySet()
            ca.c r14 = new ca.c
            r10 = 9
            r14.<init>(r11, r10)
            be.i r10 = new be.i
            r22 = r3
            r3 = 20
            r10.<init>(r14, r3)
            r7.removeIf(r10)
        L5b3:
            java.lang.String r3 = wb.en.h(r15, r13, r4)
            java.lang.Object r7 = r9.get(r3)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L5cd
            long r16 = r7.longValue()
            long r16 = r11 - r16
            r18 = 5000(0x1388, double:2.4703E-320)
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 >= 0) goto L5cd
            goto L638
        L5cd:
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            r9.put(r3, r7)
            i8.c r3 = h.Hchat.hooks.api.core.WeChatApis.message()
            r3.getClass()
            k8.e r14 = h.Hchat.hooks.api.core.WeChatApis.h()
            if (r14 != 0) goto L5e9
            java.lang.String r0 = "本地消息 API 未就绪"
            r3 = r21
            r6.invoke(r0, r3)
            goto L63a
        L5e9:
            r14.c()     // Catch: java.lang.Throwable -> L61d
            o9.j r3 = r2.u(r15, r4)     // Catch: java.lang.Throwable -> L61d
            java.lang.String r16 = r2.d(r15, r3)     // Catch: java.lang.Throwable -> L61d
            r19 = 1
            r17 = r11
            long r9 = r14.e(r15, r16, r17, r19)     // Catch: java.lang.Throwable -> L61d
            r11 = 0
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 > 0) goto L620
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L61d
            r3.append(r15)     // Catch: java.lang.Throwable -> L61d
            java.lang.String r0 = "/"
            r3.append(r0)     // Catch: java.lang.Throwable -> L61d
            r3.append(r4)     // Catch: java.lang.Throwable -> L61d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L61d
            r3 = 0
            r6.invoke(r0, r3)     // Catch: java.lang.Throwable -> L61b
            goto L621
        L61b:
            r0 = move-exception
            goto L624
        L61d:
            r0 = move-exception
            r3 = 0
            goto L624
        L620:
            r3 = 0
        L621:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L61b
            goto L62a
        L624:
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        L62a:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L63a
            java.lang.String r7 = "退群系统消息插入异常"
            r6.invoke(r7, r0)
            goto L63a
        L636:
            r22 = r3
        L638:
            r3 = r21
        L63a:
            java.lang.String r0 = "left"
            r2.p(r0, r15, r4)
            r21 = r3
            r3 = r22
            goto L569
        L645:
            java.util.Iterator r0 = r8.iterator()
        L649:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L69a
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r10 = 1
            boolean r4 = r2.o(r10, r15, r3)
            if (r4 != 0) goto L694
            boolean r4 = o9.p.r(r15, r3)
            if (r4 != 0) goto L663
            goto L694
        L663:
            long r6 = java.lang.System.currentTimeMillis()
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L682
            java.util.Set r4 = r5.entrySet()
            ca.c r8 = new ca.c
            r9 = 8
            r8.<init>(r6, r9)
            be.i r9 = new be.i
            r11 = 19
            r9.<init>(r8, r11)
            r4.removeIf(r9)
        L682:
            java.lang.String r4 = wb.en.h(r15, r13, r3)
            o9.d r8 = new o9.d
            r8.<init>(r6)
            eb.v r6 = new eb.v
            r7 = 1
            r6.<init>(r7, r8)
            r5.compute(r4, r6)
        L694:
            java.lang.String r4 = "join"
            r2.p(r4, r15, r3)
            goto L649
        L69a:
            return
        L69b:
            java.lang.Object r2 = r1.f9133b
            na.g r2 = (na.g) r2
            r2.getClass()
            java.lang.String r3 = r0.n()
            java.lang.String r3 = na.g.a(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L6b2
            goto L7e3
        L6b2:
            java.lang.Object r4 = r0.f332h
            l8.a r4 = (l8.a) r4
            java.lang.String r4 = r4.f7892a
            java.lang.String r5 = "delete"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L6cf
            java.util.LinkedHashSet r0 = r2.c()
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L7e3
            r2.d(r0)
            goto L7e3
        L6cf:
            java.util.LinkedHashSet r5 = r2.c()
            boolean r6 = r5.add(r3)
            if (r6 != 0) goto L6db
            goto L7e3
        L6db:
            r2.d(r5)
            java.lang.String r5 = "insert"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L6ea
            boolean r4 = r2.f9137d
            if (r4 == 0) goto L7e3
        L6ea:
            l3.l r4 = r2.f9134a
            java.lang.String r5 = "hb_block_new_group_enable"
            r6 = 0
            android.content.SharedPreferences r4 = r4.b()     // Catch: java.lang.Throwable -> L6f8
            boolean r4 = r4.getBoolean(r5, r6)     // Catch: java.lang.Throwable -> L6f8
            goto L6f9
        L6f8:
            r4 = r6
        L6f9:
            if (r4 == 0) goto L7e3
            java.lang.Object r0 = r0.f333i
            h.Hchat.hooks.api.model.WeChatChatroom r0 = (h.Hchat.hooks.api.model.WeChatChatroom) r0
            l3.l r4 = r2.f9134a
            java.lang.String r9 = na.g.a(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 == 0) goto L70d
            goto L7e3
        L70d:
            java.lang.String r5 = "hb_rule_bindings_v1"
            java.lang.String r7 = ""
            java.lang.String r8 = r4.d(r5, r7)
            java.util.List r10 = a7.a.F(r8)
            java.util.Iterator r10 = r10.iterator()
        L71d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L73b
            java.lang.Object r11 = r10.next()
            na.i r11 = (na.i) r11
            java.lang.String r11 = r11.f9144b
            java.lang.String r11 = a7.a.e(r11)
            java.lang.String r12 = a7.a.e(r9)
            boolean r11 = android.text.TextUtils.equals(r11, r12)
            if (r11 == 0) goto L71d
            goto L7e3
        L73b:
            java.util.ArrayList r15 = new java.util.ArrayList
            java.util.List r8 = a7.a.F(r8)
            r15.<init>(r8)
            na.i r8 = new na.i
            r10 = r8
            java.lang.String r8 = a7.a.e(r9)
            if (r0 == 0) goto L758
            java.lang.String r11 = r0.name
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L758
            java.lang.String r0 = r0.name
            goto L76f
        L758:
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L76e
            r0.getClass()     // Catch: java.lang.Throwable -> L76e
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.c()     // Catch: java.lang.Throwable -> L76e
            java.lang.String r0 = r0.f(r9)     // Catch: java.lang.Throwable -> L76e
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L76e
            if (r11 != 0) goto L76e
            goto L76f
        L76e:
            r0 = r9
        L76f:
            java.lang.String r11 = "hb_rule_templates_v1"
            java.lang.String r11 = r4.d(r11, r7)
            java.util.List r11 = a7.a.M(r11)
            java.lang.String r12 = "hb_rule_default_template_id"
            java.lang.String r12 = r4.d(r12, r7)
            java.lang.String r12 = r12.trim()
            java.util.Iterator r13 = r11.iterator()
        L787:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L79c
            java.lang.Object r14 = r13.next()
            na.j r14 = (na.j) r14
            java.lang.String r14 = r14.f9150a
            boolean r14 = android.text.TextUtils.equals(r14, r12)
            if (r14 == 0) goto L787
            goto L7ac
        L79c:
            int r12 = r11.size()
            r13 = 1
            if (r12 != r13) goto L7ab
            java.lang.Object r6 = r11.get(r6)
            na.j r6 = (na.j) r6
            java.lang.String r7 = r6.f9150a
        L7ab:
            r12 = r7
        L7ac:
            r13 = 0
            r14 = 0
            r11 = 0
            r7 = r10
            r10 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.add(r7)
            android.content.SharedPreferences r0 = r4.b()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r4 = a7.a.q(r15)
            android.content.SharedPreferences$Editor r0 = r0.putString(r5, r4)
            r0.commit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "已自动加入新进群红包关闭规则: "
            r0.<init>(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            ae.g r2 = r2.f9135b
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L7e3
            r2.accept(r0)
        L7e3:
            return
    }
}
