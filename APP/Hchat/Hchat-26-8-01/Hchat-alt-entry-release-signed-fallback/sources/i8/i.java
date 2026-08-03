package i8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements r8.f {
    public static void e(java.lang.String r1, java.lang.Runnable r2) {
            r2.run()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = " API安装失败: "
            java.lang.StringBuilder r1 = bc.e.n(r1, r0)
            java.lang.String r2 = r2.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            f(r1)
            return
    }

    public static void f(java.lang.String r1) {
            if (r1 != 0) goto L3
            goto L5c
        L3:
            java.lang.String r0 = "失败"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "异常"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "未找到"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "为空"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "不可用"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "未就绪"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "未解析"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "缺失"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "无合适"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "ERROR"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "error"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            return
        L5d:
            java.lang.String r0 = "[Hchat:WechatApi] "
            java.lang.String r1 = r0.concat(r1)
            de.robv.android.xposed.XposedBridge.log(r1)
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "wechat_api"
            return r0
    }

    @Override // r8.f
    public final boolean b(r8.g r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // r8.f
    public final void c(r8.g r46) {
            r45 = this;
            r1 = r45
            r2 = r46
            m8.c r5 = new m8.c
            g1.d r0 = new g1.d
            r3 = 19
            r0.<init>(r1, r3)
            r5.<init>(r0)
            o8.a r13 = new o8.a
            android.content.Context r0 = r2.f11620a
            r13.<init>(r0)
            m8.a r14 = new m8.a
            g1.d r0 = new g1.d
            r3 = 27
            r0.<init>(r1, r3)
            r14.<init>(r5, r0)
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = new h.Hchat.hooks.api.runtime.WeChatDatabaseApi
            h.Hchat.dexkit.DexFinder r4 = r2.f11624e
            i8.f r3 = new i8.f
            r6 = 2
            r3.<init>(r1, r6)
            r0.<init>(r4, r3)
            g8.a r8 = new g8.a
            android.content.Context r12 = r2.f11620a
            java.lang.ClassLoader r15 = r2.f11622c
            i8.f r3 = new i8.f
            r6 = 4
            r3.<init>(r1, r6)
            r8.<init>(r12, r15, r0, r3)
            g8.i r9 = new g8.i
            i8.f r3 = new i8.f
            r6 = 5
            r3.<init>(r1, r6)
            r9.<init>(r0, r4, r5, r3)
            q8.r r11 = new q8.r
            i8.f r3 = new i8.f
            r6 = 6
            r3.<init>(r1, r6)
            r11.<init>(r12, r3)
            q8.s r3 = new q8.s
            r3.<init>(r12)
            k8.s r10 = new k8.s
            i8.f r6 = new i8.f
            r7 = 7
            r6.<init>(r1, r7)
            r10.<init>(r0, r8, r4, r6)
            k8.g r6 = new k8.g
            r7 = r9
            f8.c r9 = r2.f11625f
            r21 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            i8.f r10 = new i8.f
            r16 = r0
            r0 = 8
            r10.<init>(r1, r0)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r17 = r3
            r0 = r6
            r3 = r8
            k8.e r6 = new k8.e
            i8.f r8 = new i8.f
            r9 = 0
            r8.<init>(r1, r9)
            r6.<init>(r4, r8)
            r6.g()
            r20 = r6
            h8.a r6 = new h8.a
            r9 = r11
            i8.f r11 = new i8.f
            r8 = 3
            r11.<init>(r1, r8)
            r10 = r4
            r8 = r7
            r7 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            r11 = r6
            r16 = r9
            r9 = r8
            g8.k r10 = new g8.k
            r10.<init>(r0, r9)
            r8 = r3
            g8.d r3 = new g8.d
            r6 = r8
            i8.f r8 = new i8.f
            r18 = r0
            r0 = 9
            r8.<init>(r1, r0)
            r0 = r6
            r6 = r4
            r4 = r7
            r7 = r5
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r44 = r6
            r6 = r3
            r3 = r4
            r4 = r44
            r44 = r7
            r7 = r5
            r5 = r44
            o8.g r8 = new o8.g
            r8.<init>(r3)
            k8.q r9 = new k8.q
            r9.<init>()
            k8.k r19 = new k8.k
            r22 = r10
            f8.c r10 = r2.f11625f
            r23 = r11
            i8.f r11 = new i8.f
            r24 = r3
            r3 = 10
            r11.<init>(r1, r3)
            r3 = r13
            r13 = r6
            r6 = r19
            r19 = r17
            r17 = r8
            r8 = r18
            r18 = r3
            r3 = r7
            r7 = r4
            r4 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            r25 = r6
            r23 = r9
            o8.f r26 = new o8.f
            r26.<init>()
            o8.d r6 = new o8.d
            i8.f r9 = new i8.f
            r10 = 11
            r9.<init>(r1, r10)
            r6.<init>(r7, r15, r9)
            q8.o r11 = new q8.o
            i8.f r9 = new i8.f
            r10 = 12
            r9.<init>(r1, r10)
            r11.<init>(r9)
            r9 = r6
            j8.p r6 = new j8.p
            r10 = r9
            java.lang.ClassLoader r9 = r2.f11622c
            r27 = r10
            org.luckypray.dexkit.DexKitBridge r10 = r2.f11623d
            r28 = r8
            r8 = r7
            r7 = r12
            i8.f r12 = new i8.f
            r29 = r6
            r6 = 13
            r12.<init>(r1, r6)
            r30 = r14
            r2 = r27
            r14 = r28
            r6 = r29
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6 = r8
            r27 = r11
            q8.i r8 = new q8.i
            i8.f r9 = new i8.f
            r10 = 14
            r9.<init>(r1, r10)
            r8.<init>(r9)
            k8.i r9 = new k8.i
            i8.f r10 = new i8.f
            r11 = 15
            r10.<init>(r1, r11)
            r9.<init>(r2, r0, r14, r10)
            h8.b r10 = new h8.b
            g1.d r11 = new g1.d
            r12 = 20
            r11.<init>(r1, r12)
            r10.<init>(r2, r4, r11)
            g8.j r11 = new g8.j
            g1.d r12 = new g1.d
            r28 = r0
            r0 = 21
            r12.<init>(r1, r0)
            r11.<init>(r2, r3, r12)
            g8.g r0 = new g8.g
            g1.d r12 = new g1.d
            r31 = r3
            r3 = 22
            r12.<init>(r1, r3)
            r0.<init>(r2, r13, r12)
            q8.q r3 = new q8.q
            g1.d r12 = new g1.d
            r32 = r2
            r2 = 23
            r12.<init>(r1, r2)
            r3.<init>(r12)
            r2 = r32
            o8.e r32 = new o8.e
            r32.<init>()
            o8.j r12 = new o8.j
            r33 = r2
            g1.d r2 = new g1.d
            r34 = r3
            r3 = 24
            r2.<init>(r1, r3)
            r12.<init>(r7, r2)
            o8.k r2 = new o8.k
            r2.<init>(r7, r15)
            r3 = r7
            k8.p r7 = new k8.p
            r15 = r12
            g1.d r12 = new g1.d
            r36 = r2
            r2 = 25
            r12.<init>(r1, r2)
            r2 = r14
            r14 = r10
            r10 = r23
            r23 = r33
            r33 = r15
            r15 = r11
            r11 = r2
            r2 = r8
            r8 = r25
            r7.<init>(r8, r9, r10, r11, r12)
            r25 = r11
            r35 = r16
            r37 = r19
            r11 = r7
            r19 = r8
            r7 = r9
            r16 = r13
            r13 = r18
            r18 = r10
            q8.m r12 = new q8.m
            r8 = r6
            r6 = r12
            g1.d r12 = new g1.d
            r9 = 26
            r12.<init>(r1, r9)
            r9 = r27
            r27 = r7
            r7 = r8
            r8 = r9
            r10 = r2
            r9 = r34
            r34 = r11
            r11 = r31
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r12 = r8
            r31 = r9
            r9 = r11
            n8.c r8 = new n8.c
            g1.d r10 = new g1.d
            r11 = 28
            r10.<init>(r1, r11)
            r8.<init>(r7, r5, r10)
            g8.l r10 = new g8.l
            g1.d r11 = new g1.d
            r38 = r2
            r2 = 29
            r11.<init>(r1, r2)
            r10.<init>(r7, r5, r11)
            p8.d0 r2 = new p8.d0
            r5 = r46
            java.lang.ClassLoader r11 = r5.f11622c
            r39 = r6
            org.luckypray.dexkit.DexKitBridge r6 = r5.f11623d
            r5 = r11
            i8.f r11 = new i8.f
            r40 = r2
            r2 = 1
            r11.<init>(r1, r2)
            r1 = r37
            r37 = r8
            r8 = r25
            r25 = r13
            r13 = r27
            r27 = r1
            r1 = r23
            r41 = r31
            r42 = r34
            r43 = r39
            r2 = r40
            r23 = r4
            r4 = r7
            r7 = r30
            r30 = r10
            r10 = r46
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3 = r7
            r7 = r9
            r3.a(r4)
            r19.a()
            a1.a r4 = new a1.a
            r5 = 12
            r4.<init>(r1, r5)
            java.lang.String r5 = "databaseChanges"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 13
            r4.<init>(r13, r5)
            java.lang.String r5 = "messageChanges"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 14
            r4.<init>(r14, r5)
            java.lang.String r5 = "conversationChanges"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 15
            r4.<init>(r15, r5)
            java.lang.String r5 = "contactChanges"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 16
            r4.<init>(r0, r5)
            java.lang.String r5 = "chatroomChanges"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 17
            r4.<init>(r12, r5)
            java.lang.String r5 = "currentActivity"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 18
            r10 = r38
            r4.<init>(r10, r5)
            java.lang.String r5 = "activityStart"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 19
            r9 = r41
            r4.<init>(r9, r5)
            java.lang.String r5 = "lifecycle"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 20
            r11 = r42
            r4.<init>(r11, r5)
            java.lang.String r5 = "messageObserve"
            e(r5, r4)
            a1.a r4 = new a1.a
            r5 = 21
            r6 = r43
            r4.<init>(r6, r5)
            java.lang.String r5 = "chatPage"
            e(r5, r4)
            r31 = r35
            r35 = r6
            r6 = r27
            r27 = r13
            r13 = r25
            r25 = r12
            r12 = r31
            r31 = r29
            r29 = r15
            r15 = r22
            r22 = r31
            r39 = r2
            r31 = r9
            r34 = r11
            r11 = r23
            r23 = r26
            r38 = r30
            r30 = r0
            r9 = r7
            r26 = r10
            r7 = r24
            r10 = r28
            r24 = r1
            r28 = r14
            r14 = r3
            h.Hchat.hooks.api.core.WeChatApis.init(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r2 = r24
            r7 = r27
            r14 = r28
            r15 = r29
            r11 = r34
            r6 = r35
            r4 = r39
            i8.g r0 = new i8.g
            r1 = r45
            r12 = r6
            r8 = r14
            r9 = r15
            r5 = r19
            r10 = r30
            r6 = r2
            r2 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            i.e0 r1 = new i.e0
            r3 = 14
            r1.<init>(r0, r3)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r3 = "wechat_api:warmup"
            java.lang.String r4 = "微信公共API预热"
            r8.c r5 = r8.c.f11603i
            r8.e.e(r0, r1, r3, r4, r5)
            fd.b r0 = new fd.b
            r1 = 2
            r0.<init>(r2, r1)
            i.e0 r1 = new i.e0
            r2 = 14
            r1.<init>(r0, r2)
            r0 = 0
            java.lang.String r2 = "wechat_api:private_conversation_mute"
            java.lang.String r3 = "私聊免打扰API补定位"
            r8.c r4 = r8.c.f11604j
            r8.e.e(r0, r1, r2, r3, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "微信公共API"
            return r0
    }
}
