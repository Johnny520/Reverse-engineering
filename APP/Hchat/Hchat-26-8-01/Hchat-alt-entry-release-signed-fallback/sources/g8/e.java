package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements o8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f4356b;

    public /* synthetic */ e(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f4355a = r2
            r0.f4356b = r1
            r0.<init>()
            return
    }

    @Override // o8.c
    public final void a(l8.a r30) {
            r29 = this;
            r1 = r29
            r0 = r30
            int r2 = r1.f4355a
            switch(r2) {
                case 0: goto L541;
                case 1: goto L462;
                case 2: goto L347;
                case 3: goto L2c2;
                case 4: goto L22f;
                case 5: goto L1aa;
                default: goto L9;
            }
        L9:
            java.lang.Object r2 = r1.f4356b
            k8.i r2 = (k8.i) r2
            android.content.ContentValues r3 = r0.f7895d
            java.lang.String r4 = "message"
            java.lang.String r5 = r0.f7893b
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L1b
            goto L1a9
        L1b:
            java.lang.String r4 = "msgid"
            java.lang.String r5 = "msgId"
            long r5 = k8.i.c(r3, r5)
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 0
            if (r9 <= 0) goto L2d
        L2a:
            r12 = r5
            goto L97
        L2d:
            long r5 = k8.i.c(r3, r4)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L36
            goto L2a
        L36:
            java.lang.String r5 = "_id"
            long r5 = k8.i.c(r3, r5)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L41
            goto L2a
        L41:
            java.lang.String r5 = "rowid"
            long r5 = k8.i.c(r3, r5)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L4c
            goto L2a
        L4c:
            java.lang.String r5 = "insert"
            java.lang.String r6 = r0.f7892a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L5d
            long r5 = r0.f7894c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L5d
            goto L2a
        L5d:
            java.lang.String r5 = r0.f7896e
            java.lang.String[] r6 = r0.f7897f
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto L96
            if (r6 == 0) goto L96
            int r9 = r6.length
            if (r9 != 0) goto L6d
            goto L96
        L6d:
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r9)
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L7a
            goto L96
        L7a:
            int r4 = r6.length
            r5 = r10
        L7c:
            if (r5 >= r4) goto L94
            r9 = r6[r5]
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 == 0) goto L87
            goto L91
        L87:
            long r11 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Throwable -> L91
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 <= 0) goto L91
            r5 = r11
            goto L2a
        L91:
            int r5 = r5 + 1
            goto L7c
        L94:
            r5 = r7
            goto L2a
        L96:
            r12 = r7
        L97:
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 <= 0) goto La7
            k8.s r4 = r2.f7425b
            if (r4 == 0) goto La7
            h.Hchat.hooks.api.model.WeChatMessage r4 = r4.c(r12)
            if (r4 == 0) goto La7
            goto L16b
        La7:
            r4 = 0
            if (r3 != 0) goto Lac
            goto L16b
        Lac:
            h.Hchat.hooks.api.model.WeChatMessage r11 = new h.Hchat.hooks.api.model.WeChatMessage
            java.lang.String r5 = "msgSvrId"
            long r14 = k8.i.c(r3, r5)
            java.lang.String r5 = "type"
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto Lc8
            boolean r6 = r3.containsKey(r5)
            if (r6 != 0) goto Lc3
            goto Lc8
        Lc3:
            java.lang.Long r5 = r3.getAsLong(r5)     // Catch: java.lang.Throwable -> Lc8
            goto Lc9
        Lc8:
            r5 = r4
        Lc9:
            if (r5 == 0) goto Ld2
            int r5 = r5.intValue()
            r16 = r5
            goto Ld4
        Ld2:
            r16 = r10
        Ld4:
            java.lang.String r5 = "status"
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto Le8
            boolean r6 = r3.containsKey(r5)
            if (r6 != 0) goto Le3
            goto Le8
        Le3:
            java.lang.Long r5 = r3.getAsLong(r5)     // Catch: java.lang.Throwable -> Le8
            goto Le9
        Le8:
            r5 = r4
        Le9:
            if (r5 == 0) goto Lf2
            int r5 = r5.intValue()
            r17 = r5
            goto Lf4
        Lf2:
            r17 = r10
        Lf4:
            java.lang.String r5 = "isSend"
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L108
            boolean r6 = r3.containsKey(r5)
            if (r6 != 0) goto L103
            goto L108
        L103:
            java.lang.Long r5 = r3.getAsLong(r5)     // Catch: java.lang.Throwable -> L108
            goto L109
        L108:
            r5 = r4
        L109:
            if (r5 == 0) goto L112
            int r5 = r5.intValue()
            r18 = r5
            goto L114
        L112:
            r18 = r10
        L114:
            java.lang.String r5 = "createTime"
            long r19 = k8.i.c(r3, r5)
            java.lang.String r5 = "talker"
            java.lang.String r21 = k8.i.d(r3, r5)
            java.lang.String r5 = "content"
            java.lang.String r22 = k8.i.d(r3, r5)
            java.lang.String r5 = "imgPath"
            java.lang.String r23 = k8.i.d(r3, r5)
            java.lang.String r5 = "reserved"
            java.lang.String r24 = k8.i.d(r3, r5)
            java.lang.String r5 = "transContent"
            java.lang.String r25 = k8.i.d(r3, r5)
            java.lang.String r5 = "flag"
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L14b
            boolean r6 = r3.containsKey(r5)
            if (r6 != 0) goto L147
            goto L14b
        L147:
            java.lang.Long r4 = r3.getAsLong(r5)     // Catch: java.lang.Throwable -> L14b
        L14b:
            if (r4 == 0) goto L151
            int r10 = r4.intValue()
        L151:
            r26 = r10
            java.lang.String r4 = "msgSource"
            java.lang.String r27 = k8.i.d(r3, r4)
            g8.a r3 = r2.f7426c
            if (r3 == 0) goto L164
            java.lang.String r3 = r3.c()
        L161:
            r28 = r3
            goto L167
        L164:
            java.lang.String r3 = ""
            goto L161
        L167:
            r11.<init>(r12, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = r11
        L16b:
            b.e r3 = new b.e
            r5 = 19
            r3.<init>(r0, r5, r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f7428e
            java.util.Iterator r4 = r0.iterator()
        L178:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1a9
            java.lang.Object r0 = r4.next()
            k8.h r0 = (k8.h) r0
            r0.a(r3)     // Catch: java.lang.Throwable -> L188
            goto L178
        L188:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "消息变更回调失败: "
            r5.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            i8.f r5 = r2.f7427d
            if (r5 == 0) goto L178
            java.lang.String r5 = "[WeChatMessageChangeApi] "
            java.lang.String r0 = r5.concat(r0)
            i8.i.f(r0)
            goto L178
        L1a9:
            return
        L1aa:
            java.lang.Object r2 = r1.f4356b
            ha.k r2 = (ha.k) r2
            java.lang.String r3 = r0.f7893b
            java.lang.String r4 = "SnsInfo"
            boolean r3 = og.t.X(r3, r4)
            if (r3 != 0) goto L1ba
            goto L22e
        L1ba:
            java.lang.String r3 = "delete"
            java.lang.String r4 = r0.f7892a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L22e
            java.lang.String r3 = r0.f7896e
            if (r3 != 0) goto L1ca
            java.lang.String r3 = ""
        L1ca:
            java.lang.String r4 = "snsId"
            r5 = 1
            boolean r4 = og.m.h0(r3, r4, r5)
            if (r4 != 0) goto L1d4
            goto L22e
        L1d4:
            java.lang.String[] r0 = r0.f7897f
            r4 = 0
            if (r0 == 0) goto L1e2
            java.lang.Object r0 = tf.l.z0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1e2
            goto L206
        L1e2:
            java.lang.String r0 = "snsId\\s*=\\s*['\"]?([0-9]+)"
            r6 = 66
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r4, r3)
            if (r0 == 0) goto L205
            java.util.List r0 = r0.a()
            java.lang.Object r0 = tf.m.w1(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L206
        L205:
            r0 = 0
        L206:
            java.lang.String r0 = oh.h.J(r0)
            if (r0 == 0) goto L22e
            java.util.concurrent.ConcurrentHashMap r3 = r2.f5253h
            java.lang.Object r3 = r3.remove(r0)
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3
            if (r3 == 0) goto L219
            r3.cancel(r4)
        L219:
            java.lang.Object r3 = r2.f5249d
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r2.f5251f     // Catch: java.lang.Throwable -> L22b
            java.lang.Object r0 = r4.remove(r0)     // Catch: java.lang.Throwable -> L22b
            ha.j r0 = (ha.j) r0     // Catch: java.lang.Throwable -> L22b
            monitor-exit(r3)
            java.lang.String r0 = "已取消被删除朋友圈的待点赞任务"
            r2.b(r0)
            goto L22e
        L22b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L22e:
            return
        L22f:
            java.lang.Object r2 = r1.f4356b
            ha.h r2 = (ha.h) r2
            java.lang.String r3 = r0.f7893b
            java.lang.String r4 = "SnsInfo"
            boolean r3 = og.t.X(r3, r4)
            if (r3 == 0) goto L2c1
            java.lang.String r3 = "delete"
            java.lang.String r4 = r0.f7892a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L249
            goto L2c1
        L249:
            java.lang.String r3 = r0.f7896e
            if (r3 != 0) goto L24f
            java.lang.String r3 = ""
        L24f:
            java.lang.String r4 = "snsId"
            r5 = 1
            boolean r4 = og.m.h0(r3, r4, r5)
            r6 = 0
            r7 = 0
            if (r4 != 0) goto L25b
            goto L290
        L25b:
            java.lang.String[] r0 = r0.f7897f
            if (r0 == 0) goto L269
            java.lang.Object r0 = tf.l.z0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L269
            r7 = r0
            goto L28c
        L269:
            java.lang.String r0 = "snsId\\s*=\\s*['\"]?([0-9-]+)"
            r4 = 66
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r4)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r6, r3)
            if (r0 == 0) goto L28c
            java.util.List r0 = r0.a()
            java.lang.Object r0 = tf.m.w1(r5, r0)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L28c:
            java.lang.String r7 = oh.h.J(r7)
        L290:
            if (r7 == 0) goto L2c1
            java.lang.Object r3 = r2.f5217e
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap r0 = r2.f5221i     // Catch: java.lang.Throwable -> L2ac
            java.lang.Object r0 = r0.remove(r7)     // Catch: java.lang.Throwable -> L2ac
            ha.g r0 = (ha.g) r0     // Catch: java.lang.Throwable -> L2ac
            if (r0 == 0) goto L2ae
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f5203e     // Catch: java.lang.Throwable -> L2ac
            r4.set(r5)     // Catch: java.lang.Throwable -> L2ac
            java.util.concurrent.ScheduledFuture r0 = r0.f5205g     // Catch: java.lang.Throwable -> L2ac
            if (r0 == 0) goto L2af
            r0.cancel(r5)     // Catch: java.lang.Throwable -> L2ac
            goto L2af
        L2ac:
            r0 = move-exception
            goto L2bf
        L2ae:
            r5 = r6
        L2af:
            boolean r0 = r2.f5222j     // Catch: java.lang.Throwable -> L2ac
            if (r0 == 0) goto L2b6
            r2.k(r7)     // Catch: java.lang.Throwable -> L2ac
        L2b6:
            monitor-exit(r3)
            if (r5 == 0) goto L2c1
            java.lang.String r0 = "已取消被删除朋友圈的待转发任务"
            r2.i(r0)
            goto L2c1
        L2bf:
            monitor-exit(r3)
            throw r0
        L2c1:
            return
        L2c2:
            java.lang.Object r2 = r1.f4356b
            ha.d r2 = (ha.d) r2
            java.lang.String r3 = r0.f7893b
            java.lang.String r4 = "SnsInfo"
            boolean r3 = og.t.X(r3, r4)
            if (r3 != 0) goto L2d2
            goto L346
        L2d2:
            java.lang.String r3 = "delete"
            java.lang.String r4 = r0.f7892a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L346
            java.lang.String r3 = r0.f7896e
            if (r3 != 0) goto L2e2
            java.lang.String r3 = ""
        L2e2:
            java.lang.String r4 = "snsId"
            r5 = 1
            boolean r4 = og.m.h0(r3, r4, r5)
            if (r4 != 0) goto L2ec
            goto L346
        L2ec:
            java.lang.String[] r0 = r0.f7897f
            r4 = 0
            if (r0 == 0) goto L2fa
            java.lang.Object r0 = tf.l.z0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2fa
            goto L31e
        L2fa:
            java.lang.String r0 = "snsId\\s*=\\s*['\"]?([0-9]+)"
            r6 = 66
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r6)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r4, r3)
            if (r0 == 0) goto L31d
            java.util.List r0 = r0.a()
            java.lang.Object r0 = tf.m.w1(r5, r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L31e
        L31d:
            r0 = 0
        L31e:
            java.lang.String r0 = oh.h.J(r0)
            if (r0 == 0) goto L346
            java.util.concurrent.ConcurrentHashMap r3 = r2.f5183h
            java.lang.Object r3 = r3.remove(r0)
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3
            if (r3 == 0) goto L331
            r3.cancel(r4)
        L331:
            java.lang.Object r3 = r2.f5179d
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r2.f5181f     // Catch: java.lang.Throwable -> L343
            java.lang.Object r0 = r4.remove(r0)     // Catch: java.lang.Throwable -> L343
            ha.b r0 = (ha.b) r0     // Catch: java.lang.Throwable -> L343
            monitor-exit(r3)
            java.lang.String r0 = "已取消被删除朋友圈的待评论任务"
            r2.c(r0)
            goto L346
        L343:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L346:
            return
        L347:
            java.lang.Object r2 = r1.f4356b
            h8.b r2 = (h8.b) r2
            r2.getClass()
            android.content.ContentValues r3 = r0.f7895d
            java.lang.String r4 = "rconversation"
            java.lang.String r5 = r0.f7893b
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L35c
            goto L461
        L35c:
            java.lang.String r4 = "username"
            java.lang.String r5 = ""
            java.lang.String r6 = h8.b.b(r3, r4)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r8 = 0
            if (r7 != 0) goto L36d
            r5 = r6
            goto L397
        L36d:
            java.lang.String r6 = r0.f7896e
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L397
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r7)
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L397
            java.lang.String[] r4 = r0.f7897f
            if (r4 != 0) goto L386
            goto L397
        L386:
            int r6 = r4.length
            r7 = r8
        L388:
            if (r7 >= r6) goto L397
            r9 = r4[r7]
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L394
            r5 = r9
            goto L397
        L394:
            int r7 = r7 + 1
            goto L388
        L397:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            r6 = 0
            if (r4 != 0) goto L3c5
            h8.a r4 = r2.f5140b
            if (r4 == 0) goto L3c5
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L3aa
        L3a8:
            r4 = r6
            goto L3c1
        L3aa:
            java.lang.String r7 = "SELECT username, unReadCount, status, isSend, conversationTime, content, msgType, flag, digest, digestUser, atCount, unReadMuteCount, hasTodo FROM rconversation WHERE username=? LIMIT 1"
            java.lang.String[] r9 = new java.lang.String[]{r5}
            java.util.ArrayList r4 = r4.i(r7, r9)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L3bb
            goto L3a8
        L3bb:
            java.lang.Object r4 = r4.get(r8)
            l8.b r4 = (l8.b) r4
        L3c1:
            if (r4 == 0) goto L3c5
            r6 = r4
            goto L423
        L3c5:
            if (r3 != 0) goto L3c8
            goto L423
        L3c8:
            l8.b r6 = new l8.b
            java.lang.String r4 = "unReadCount"
            h8.b.a(r3, r4)
            java.lang.String r4 = "status"
            h8.b.a(r3, r4)
            java.lang.String r4 = "isSend"
            h8.b.a(r3, r4)
            java.lang.String r4 = "conversationTime"
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L3eb
            boolean r7 = r3.containsKey(r4)
            if (r7 != 0) goto L3e8
            goto L3eb
        L3e8:
            r3.getAsLong(r4)     // Catch: java.lang.Throwable -> L3eb
        L3eb:
            java.lang.String r4 = "content"
            h8.b.b(r3, r4)
            java.lang.String r4 = "msgType"
            h8.b.b(r3, r4)
            java.lang.String r4 = "flag"
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L407
            boolean r7 = r3.containsKey(r4)
            if (r7 != 0) goto L404
            goto L407
        L404:
            r3.getAsLong(r4)     // Catch: java.lang.Throwable -> L407
        L407:
            java.lang.String r4 = "digest"
            h8.b.b(r3, r4)
            java.lang.String r4 = "digestUser"
            h8.b.b(r3, r4)
            java.lang.String r4 = "atCount"
            h8.b.a(r3, r4)
            java.lang.String r4 = "unReadMuteCount"
            h8.b.a(r3, r4)
            java.lang.String r4 = "hasTodo"
            h8.b.a(r3, r4)
            r6.<init>(r5)
        L423:
            b.e r3 = new b.e
            r4 = 10
            r3.<init>(r0, r4, r6)
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f5142d
            java.util.Iterator r4 = r0.iterator()
        L430:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L461
            java.lang.Object r0 = r4.next()
            c9.q1 r0 = (c9.q1) r0
            r0.a(r3)     // Catch: java.lang.Throwable -> L440
            goto L430
        L440:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "会话变更回调失败: "
            r5.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            g1.d r5 = r2.f5141c
            if (r5 == 0) goto L430
            java.lang.String r5 = "[WeChatConversationChangeApi] "
            java.lang.String r0 = r5.concat(r0)
            i8.i.f(r0)
            goto L430
        L461:
            return
        L462:
            java.lang.Object r2 = r1.f4356b
            g8.j r2 = (g8.j) r2
            r2.getClass()
            java.lang.String r3 = "rcontact"
            java.lang.String r4 = r0.f7893b
            boolean r5 = r3.equalsIgnoreCase(r4)
            if (r5 != 0) goto L47d
            java.lang.String r5 = "img_flag"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 != 0) goto L47d
            goto L51d
        L47d:
            android.content.ContentValues r0 = r0.f7895d
            java.lang.String r5 = "username"
            java.lang.String r7 = g8.j.a(r0, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L497
            g8.i r5 = r2.f4382b
            if (r5 == 0) goto L497
            h.Hchat.hooks.api.model.WeChatContact r5 = r5.n(r7)
            if (r5 == 0) goto L497
            goto L507
        L497:
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L507
            if (r0 != 0) goto L4a0
            goto L507
        L4a0:
            h.Hchat.hooks.api.model.WeChatContact r6 = new h.Hchat.hooks.api.model.WeChatContact
            java.lang.String r3 = "nickname"
            java.lang.String r8 = g8.j.a(r0, r3)
            java.lang.String r3 = "alias"
            java.lang.String r9 = g8.j.a(r0, r3)
            java.lang.String r3 = "conRemark"
            java.lang.String r10 = g8.j.a(r0, r3)
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r3 = "encryptUsername"
            java.lang.String r13 = g8.j.a(r0, r3)
            java.lang.String r3 = "province"
            java.lang.String r14 = g8.j.a(r0, r3)
            java.lang.String r3 = "city"
            java.lang.String r15 = g8.j.a(r0, r3)
            java.lang.String r3 = "sex"
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 != 0) goto L4e7
            boolean r4 = r0.containsKey(r3)
            if (r4 != 0) goto L4da
            goto L4e7
        L4da:
            java.lang.Long r3 = r0.getAsLong(r3)     // Catch: java.lang.Throwable -> L4e7
            if (r3 == 0) goto L4e7
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L4e7
            r16 = r3
            goto L4e9
        L4e7:
            r16 = r5
        L4e9:
            java.lang.String r3 = "type"
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L502
            boolean r4 = r0.containsKey(r3)
            if (r4 != 0) goto L4f8
            goto L502
        L4f8:
            java.lang.Long r0 = r0.getAsLong(r3)     // Catch: java.lang.Throwable -> L502
            if (r0 == 0) goto L502
            int r5 = r0.intValue()     // Catch: java.lang.Throwable -> L502
        L502:
            r17 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L507:
            java.util.concurrent.CopyOnWriteArrayList r0 = r2.f4384d
            java.util.Iterator r3 = r0.iterator()
        L50d:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L514
            goto L51d
        L514:
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L51e
            ah.a.d()
        L51d:
            return
        L51e:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L520
        L520:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "联系人变更回调失败: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            g1.d r4 = r2.f4383c
            if (r4 == 0) goto L50d
            java.lang.String r4 = "[WeChatContactChangeApi] "
            java.lang.String r0 = r4.concat(r0)
            i8.i.f(r0)
            goto L50d
        L541:
            java.lang.String r2 = "chatroomname"
            java.lang.Object r3 = r1.f4356b
            g8.g r3 = (g8.g) r3
            r3.getClass()
            java.lang.String r4 = "chatroom"
            java.lang.String r5 = r0.f7893b
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 != 0) goto L556
            goto L5df
        L556:
            android.content.ContentValues r4 = r0.f7895d
            java.lang.String r5 = ""
            if (r4 == 0) goto L573
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L573
            boolean r6 = r4.containsKey(r2)
            if (r6 != 0) goto L569
            goto L573
        L569:
            java.lang.Object r4 = r4.get(r2)
            if (r4 == 0) goto L573
            java.lang.String r5 = java.lang.String.valueOf(r4)
        L573:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L591
            java.lang.String r4 = r0.f7896e
            if (r4 == 0) goto L591
            java.lang.String r4 = r4.toLowerCase()
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L591
            java.lang.String[] r2 = r0.f7897f
            if (r2 == 0) goto L591
            int r4 = r2.length
            if (r4 <= 0) goto L591
            r4 = 0
            r5 = r2[r4]
        L591:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L5a0
            g8.d r2 = r3.f4358b
            if (r2 == 0) goto L5a0
            h.Hchat.hooks.api.model.WeChatChatroom r2 = r2.e(r5)
            goto L5a1
        L5a0:
            r2 = 0
        L5a1:
            b.e r4 = new b.e
            r5 = 8
            r4.<init>(r0, r5, r2)
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f4360d
            java.util.Iterator r2 = r0.iterator()
        L5ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5df
            java.lang.Object r0 = r2.next()
            g8.f r0 = (g8.f) r0
            r0.a(r4)     // Catch: java.lang.Throwable -> L5be
            goto L5ae
        L5be:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "群聊变更回调失败: "
            r5.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            g1.d r5 = r3.f4359c
            if (r5 == 0) goto L5ae
            java.lang.String r5 = "[WeChatChatroomChangeApi] "
            java.lang.String r0 = r5.concat(r0)
            i8.i.f(r0)
            goto L5ae
        L5df:
            return
    }
}
