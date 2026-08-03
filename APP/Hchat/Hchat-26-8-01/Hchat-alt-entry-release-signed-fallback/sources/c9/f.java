package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r8.g f1181h;

    public /* synthetic */ f(r8.g r1, int r2) {
            r0 = this;
            r0.f1180g = r2
            r0.f1181h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r25 = this;
            r1 = r25
            int r0 = r1.f1180g
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L111;
                case 1: goto L104;
                case 2: goto Lc7;
                case 3: goto Lbd;
                case 4: goto L55;
                case 5: goto L48;
                case 6: goto L3b;
                case 7: goto L36;
                case 8: goto L31;
                case 9: goto L16;
                default: goto L9;
            }
        L9:
            r8.g r0 = r1.f1181h
            eb.m0 r2 = eb.m0.f2587a
            boolean r0 = r2.g(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L16:
            r8.g r0 = r1.f1181h
            java.lang.reflect.Method r0 = ya.i.d(r0, r3)
            if (r0 == 0) goto L2b
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r2 == 0) goto L2b
            java.lang.Object r0 = ya.i.g(r2, r0)
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L31:
            r8.g r0 = r1.f1181h
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d
            return r0
        L36:
            r8.g r0 = r1.f1181h
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d
            return r0
        L3b:
            r8.g r0 = r1.f1181h
            eb.m0 r2 = eb.m0.f2587a
            boolean r0 = r2.g(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L48:
            r8.g r0 = r1.f1181h
            eb.m0 r2 = eb.m0.f2587a
            boolean r0 = r2.g(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L55:
            r8.g r0 = r1.f1181h
            eb.d r5 = eb.d.f2520a
            monitor-enter(r5)
            r0.getClass()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = eb.d.f2521b     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L63
            monitor-exit(r5)
            goto Lb6
        L63:
            g8.g r0 = h.Hchat.hooks.api.core.WeChatApis.chatroomChanges()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto Lb4
            o8.d r6 = r0.f4357a     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto L75
            boolean r6 = r6.f()     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto L75
            r6 = r3
            goto L76
        L75:
            r6 = r4
        L76:
            if (r6 != 0) goto L79
            goto Lb4
        L79:
            eb.d.g()     // Catch: java.lang.Throwable -> L7c
        L7c:
            eb.a r6 = new eb.a     // Catch: java.lang.Throwable -> Lae
            r6.<init>()     // Catch: java.lang.Throwable -> Lae
            r0.a(r6)     // Catch: java.lang.Throwable -> Lae
            k8.p r0 = h.Hchat.hooks.api.core.WeChatApis.messageObserve()     // Catch: java.lang.Throwable -> L89
            goto L90
        L89:
            r0 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> Lae
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lae
            r0 = r6
        L90:
            boolean r6 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto L97
            r2 = 0
            goto L98
        L97:
            r2 = r0
        L98:
            k8.p r2 = (k8.p) r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto Lb0
            boolean r0 = r2.c()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto Lb0
            r2.b()     // Catch: java.lang.Throwable -> La5
        La5:
            eb.b r0 = new eb.b     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lae
            r2.e(r0)     // Catch: java.lang.Throwable -> Lae
            goto Lb0
        Lae:
            r0 = move-exception
            goto Lbb
        Lb0:
            eb.d.f2521b = r3     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r5)
            goto Lb6
        Lb4:
            monitor-exit(r5)
            r3 = r4
        Lb6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        Lbb:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lae
            throw r0
        Lbd:
            r8.g r0 = r1.f1181h
            eb.k r2 = eb.k.f2567a
            r2.j(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        Lc7:
            r8.g r0 = r1.f1181h
            eb.f r4 = eb.f.f2540a
            monitor-enter(r4)
            r0.getClass()     // Catch: java.lang.Throwable -> Lf8
            boolean r0 = eb.f.f2542c     // Catch: java.lang.Throwable -> Lf8
            if (r0 == 0) goto Ld5
            monitor-exit(r4)
            goto Lfd
        Ld5:
            i8.c r0 = h.Hchat.hooks.api.core.WeChatApis.message()     // Catch: java.lang.Throwable -> Le1
            r0.getClass()     // Catch: java.lang.Throwable -> Le1
            k8.i r2 = h.Hchat.hooks.api.core.WeChatApis.k()     // Catch: java.lang.Throwable -> Le1
            goto Le2
        Le1:
            r2 = 0
        Le2:
            if (r2 == 0) goto Lfa
            boolean r0 = r2.b()     // Catch: java.lang.Throwable -> Lf8
            if (r0 == 0) goto Lfa
            r2.a()     // Catch: java.lang.Throwable -> Led
        Led:
            eb.e r0 = new eb.e     // Catch: java.lang.Throwable -> Lf8
            r0.<init>()     // Catch: java.lang.Throwable -> Lf8
            r2.e(r0)     // Catch: java.lang.Throwable -> Lf8
            eb.f.f2542c = r3     // Catch: java.lang.Throwable -> Lf8
            goto Lfa
        Lf8:
            r0 = move-exception
            goto L102
        Lfa:
            boolean r3 = eb.f.f2542c     // Catch: java.lang.Throwable -> Lf8
            monitor-exit(r4)
        Lfd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L102:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf8
            throw r0
        L104:
            r8.g r0 = r1.f1181h
            eb.m0 r2 = eb.m0.f2587a
            boolean r0 = r2.g(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L111:
            java.lang.String r5 = "void"
            r8.g r6 = r1.f1181h
            c9.d2 r0 = c9.d2.f1137a
            java.lang.String r7 = "com.tencent.mm.ui.conversation."
            java.lang.String r0 = "com.tencent.mm.storage."
            r6.getClass()
            c9.d2 r10 = c9.d2.f1137a
            java.lang.String r8 = "main_conversation_query"
            java.lang.Class<c9.d2> r17 = c9.d2.class
            gg.f r9 = gg.v.a(r17)
            java.lang.Class r9 = r9.a()
            r9.getClass()
            android.content.Context r9 = r6.f11620a
            java.lang.String r11 = "Hchat_conversation_group_method_cache"
            android.content.SharedPreferences r9 = ub.b.c(r9, r11)
            android.content.Context r12 = r6.f11620a
            java.lang.ClassLoader r13 = r6.f11622c
            java.lang.String r12 = e8.b.g(r12, r13)
            java.lang.reflect.Method r9 = e8.b.c(r9, r12, r13, r8)
            if (r9 == 0) goto L14c
            boolean r12 = c9.d2.g(r10, r9)
            if (r12 == 0) goto L14c
            goto L14d
        L14c:
            r9 = 0
        L14d:
            if (r9 == 0) goto L152
            r4 = r11
        L150:
            r2 = r9
            goto L19b
        L152:
            ch.e r9 = new ch.e
            r9.<init>()
            fh.k r12 = new fh.k
            r12.<init>()
            r12.l0(r3, r0)
            java.lang.String r13 = "select unReadCount, status, isSend, conversationTime, rconversation.username, content"
            java.lang.String r14 = "parentRef is null"
            java.lang.String r15 = "message_fold"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14, r15}
            java.util.List r13 = a.a.y0(r13)
            fh.k.u0(r12, r13)
            r9.f1666h = r12
            r12 = r8
            c0.f r8 = new c0.f
            r13 = r11
            java.lang.Class r11 = eh.a.i(r17)
            r14 = r12
            java.lang.String r12 = "isQueryMethod"
            r15 = r13
            java.lang.String r13 = "isQueryMethod(Ljava/lang/reflect/Method;)Z"
            r16 = r15
            r15 = 0
            r18 = r16
            r16 = 9
            r19 = r9
            r9 = 1
            r20 = r14
            r14 = 0
            r4 = r18
            r3 = r19
            r2 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r9 = r10.r(r6, r2, r3, r8)
            goto L150
        L19b:
            if (r2 == 0) goto L819
            java.lang.String r3 = "conversation_parent_update"
            gg.f r8 = gg.v.a(r17)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            android.content.Context r8 = r6.f11620a
            android.content.SharedPreferences r8 = ub.b.c(r8, r4)
            android.content.Context r9 = r6.f11620a
            java.lang.ClassLoader r11 = r6.f11622c
            java.lang.String r9 = e8.b.g(r9, r11)
            java.lang.reflect.Method r8 = e8.b.c(r8, r9, r11, r3)
            if (r8 == 0) goto L1c5
            boolean r9 = c9.d2.f(r10, r8)
            if (r9 == 0) goto L1c5
            goto L1c6
        L1c5:
            r8 = 0
        L1c6:
            if (r8 == 0) goto L1ca
        L1c8:
            r1 = r8
            goto L206
        L1ca:
            ch.e r8 = new ch.e
            r8.<init>()
            fh.k r9 = new fh.k
            r9.<init>()
            r11 = 1
            r9.l0(r11, r0)
            java.lang.String r11 = "Update rconversation set parentRef = '"
            java.lang.String r12 = "' where 1 != 1 "
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            java.util.List r11 = a.a.y0(r11)
            fh.k.u0(r9, r11)
            r8.f1666h = r9
            r9 = r8
            c0.f r8 = new c0.f
            java.lang.Class r11 = eh.a.i(r17)
            java.lang.String r12 = "isParentUpdateMethod"
            java.lang.String r13 = "isParentUpdateMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r16 = 8
            r14 = r9
            r9 = 1
            r20 = r14
            r14 = 0
            r1 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r8 = r10.r(r6, r3, r1, r8)
            goto L1c8
        L206:
            if (r1 == 0) goto L819
            java.lang.String r3 = "main_conversation_click"
            gg.f r8 = gg.v.a(r17)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            android.content.Context r8 = r6.f11620a
            android.content.SharedPreferences r8 = ub.b.c(r8, r4)
            android.content.Context r9 = r6.f11620a
            java.lang.ClassLoader r11 = r6.f11622c
            java.lang.String r9 = e8.b.g(r9, r11)
            java.lang.reflect.Method r8 = e8.b.c(r8, r9, r11, r3)
            if (r8 == 0) goto L230
            boolean r9 = c9.d2.a(r10, r8)
            if (r9 == 0) goto L230
            goto L231
        L230:
            r8 = 0
        L231:
            if (r8 == 0) goto L237
            r21 = r2
        L235:
            r2 = r8
            goto L275
        L237:
            ch.e r8 = new ch.e
            r8.<init>()
            fh.k r9 = new fh.k
            r9.<init>()
            r11 = 1
            r9.l0(r11, r7)
            java.lang.String r11 = "MicroMsg.ConversationClickListener"
            java.lang.String r12 = "null user at position = "
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            java.util.List r11 = a.a.y0(r11)
            fh.k.u0(r9, r11)
            r8.f1666h = r9
            r9 = r8
            c0.f r8 = new c0.f
            java.lang.Class r11 = eh.a.i(r17)
            java.lang.String r12 = "isClickMethod"
            java.lang.String r13 = "isClickMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r16 = 2
            r14 = r9
            r9 = 1
            r20 = r14
            r14 = 0
            r21 = r2
            r2 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r8 = r10.r(r6, r3, r2, r8)
            goto L235
        L275:
            if (r2 == 0) goto L819
            java.lang.String r3 = "fold_group_conversation_query"
            gg.f r8 = gg.v.a(r17)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            android.content.Context r8 = r6.f11620a
            android.content.SharedPreferences r8 = ub.b.c(r8, r4)
            android.content.Context r9 = r6.f11620a
            java.lang.ClassLoader r11 = r6.f11622c
            java.lang.String r9 = e8.b.g(r9, r11)
            java.lang.reflect.Method r8 = e8.b.c(r8, r9, r11, r3)
            if (r8 == 0) goto L29f
            boolean r9 = c9.d2.c(r10, r8)
            if (r9 == 0) goto L29f
            goto L2a0
        L29f:
            r8 = 0
        L2a0:
            if (r8 == 0) goto L2a6
            r22 = r2
        L2a4:
            r2 = r8
            goto L2e4
        L2a6:
            ch.e r8 = new ch.e
            r8.<init>()
            fh.k r9 = new fh.k
            r9.<init>()
            r11 = 1
            r9.l0(r11, r0)
            java.lang.String r11 = "select * from rconversation where"
            java.lang.String r12 = "parentRef = '"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            java.util.List r11 = a.a.y0(r11)
            fh.k.u0(r9, r11)
            r8.f1666h = r9
            r9 = r8
            c0.f r8 = new c0.f
            java.lang.Class r11 = eh.a.i(r17)
            java.lang.String r12 = "isNativeGroupQueryMethod"
            java.lang.String r13 = "isNativeGroupQueryMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r16 = 5
            r14 = r9
            r9 = 1
            r20 = r14
            r14 = 0
            r22 = r2
            r2 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r8 = r10.r(r6, r3, r2, r8)
            goto L2a4
        L2e4:
            if (r2 == 0) goto L819
            java.lang.String r3 = "fold_group_conversation_click"
            gg.f r8 = gg.v.a(r17)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            android.content.Context r8 = r6.f11620a
            android.content.SharedPreferences r8 = ub.b.c(r8, r4)
            android.content.Context r9 = r6.f11620a
            java.lang.ClassLoader r11 = r6.f11622c
            java.lang.String r9 = e8.b.g(r9, r11)
            java.lang.reflect.Method r8 = e8.b.c(r8, r9, r11, r3)
            if (r8 == 0) goto L30e
            boolean r9 = c9.d2.a(r10, r8)
            if (r9 == 0) goto L30e
            goto L30f
        L30e:
            r8 = 0
        L30f:
            if (r8 == 0) goto L315
            r23 = r2
        L313:
            r2 = r8
            goto L357
        L315:
            ch.e r8 = new ch.e
            r8.<init>()
            fh.k r9 = new fh.k
            r9.<init>()
            r11 = 1
            r9.l0(r11, r7)
            java.lang.String r11 = "MicroMsg.ConvBoxServiceConversationFmUI"
            java.lang.String r12 = "user should not be null. position:%d, size:%d"
            java.lang.String r13 = "specific_chat_from_scene"
            java.lang.String r14 = "chat_from_scene_for_group_chats"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14}
            java.util.List r11 = a.a.y0(r11)
            fh.k.u0(r9, r11)
            r8.f1666h = r9
            r9 = r8
            c0.f r8 = new c0.f
            java.lang.Class r11 = eh.a.i(r17)
            java.lang.String r12 = "isClickMethod"
            java.lang.String r13 = "isClickMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r16 = 3
            r14 = r9
            r9 = 1
            r20 = r14
            r14 = 0
            r23 = r2
            r2 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r8 = r10.r(r6, r3, r2, r8)
            goto L313
        L357:
            if (r2 == 0) goto L819
            java.lang.String r3 = "fold_group_adapter_refresh"
            gg.f r8 = gg.v.a(r17)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            android.content.Context r8 = r6.f11620a
            android.content.SharedPreferences r8 = ub.b.c(r8, r4)
            android.content.Context r9 = r6.f11620a
            java.lang.ClassLoader r11 = r6.f11622c
            java.lang.String r9 = e8.b.g(r9, r11)
            java.lang.reflect.Method r8 = e8.b.c(r8, r9, r11, r3)
            if (r8 == 0) goto L381
            boolean r9 = c9.d2.d(r10, r8)
            if (r9 == 0) goto L381
            goto L382
        L381:
            r8 = 0
        L382:
            if (r8 == 0) goto L388
            r24 = r2
        L386:
            r2 = r8
            goto L3c0
        L388:
            ch.e r8 = new ch.e
            r8.<init>()
            fh.k r9 = new fh.k
            r9.<init>()
            r11 = 1
            r9.l0(r11, r7)
            java.lang.String r11 = "conversationboxservice"
            java.lang.String[] r11 = new java.lang.String[]{r11}
            r9.r0(r11)
            r8.f1666h = r9
            r9 = r8
            c0.f r8 = new c0.f
            java.lang.Class r11 = eh.a.i(r17)
            java.lang.String r12 = "isNativeGroupRefreshMethod"
            java.lang.String r13 = "isNativeGroupRefreshMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r16 = 6
            r14 = r9
            r9 = 1
            r20 = r14
            r14 = 0
            r24 = r2
            r2 = r20
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r8 = r10.r(r6, r3, r2, r8)
            goto L386
        L3c0:
            if (r2 == 0) goto L819
            java.lang.String r3 = "fold_group_mark_read"
            gg.f r8 = gg.v.a(r17)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            android.content.Context r8 = r6.f11620a
            android.content.SharedPreferences r8 = ub.b.c(r8, r4)
            android.content.Context r9 = r6.f11620a
            java.lang.ClassLoader r11 = r6.f11622c
            java.lang.String r9 = e8.b.g(r9, r11)
            java.lang.reflect.Method r8 = e8.b.c(r8, r9, r11, r3)
            if (r8 == 0) goto L3ea
            boolean r9 = c9.d2.b(r10, r8)
            if (r9 == 0) goto L3ea
            goto L3eb
        L3ea:
            r8 = 0
        L3eb:
            if (r8 == 0) goto L3ef
        L3ed:
            r3 = r8
            goto L426
        L3ef:
            ch.e r8 = new ch.e
            r8.<init>()
            fh.k r9 = new fh.k
            r9.<init>()
            r11 = 1
            r9.l0(r11, r0)
            java.lang.String r0 = "update conversation failed"
            java.lang.String r11 = "updateUnreadByTalker %s"
            java.lang.String[] r0 = new java.lang.String[]{r0, r11}
            java.util.List r0 = a.a.y0(r0)
            fh.k.u0(r9, r0)
            r8.f1666h = r9
            r0 = r8
            c0.f r8 = new c0.f
            java.lang.Class r11 = eh.a.i(r17)
            java.lang.String r12 = "isNativeGroupMarkReadMethod"
            java.lang.String r13 = "isNativeGroupMarkReadMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r16 = 4
            r9 = 1
            r14 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r8 = r10.r(r6, r3, r0, r8)
            goto L3ed
        L426:
            if (r3 == 0) goto L819
            java.lang.String r0 = "fold_group_status_notify"
            gg.f r8 = gg.v.a(r17)
            java.lang.Class r8 = r8.a()
            r8.getClass()
            android.content.Context r8 = r6.f11620a
            android.content.SharedPreferences r8 = ub.b.c(r8, r4)
            android.content.Context r9 = r6.f11620a
            java.lang.ClassLoader r11 = r6.f11622c
            java.lang.String r9 = e8.b.g(r9, r11)
            java.lang.reflect.Method r8 = e8.b.c(r8, r9, r11, r0)
            if (r8 == 0) goto L450
            boolean r9 = c9.d2.e(r10, r8)
            if (r9 == 0) goto L450
            goto L451
        L450:
            r8 = 0
        L451:
            if (r8 == 0) goto L456
            r20 = r3
            goto L489
        L456:
            ch.e r8 = new ch.e
            r8.<init>()
            fh.k r9 = new fh.k
            r9.<init>()
            java.lang.String r11 = "enterSession %s %s"
            java.lang.String[] r11 = new java.lang.String[]{r11}
            r9.r0(r11)
            r8.f1666h = r9
            r9 = r8
            c0.f r8 = new c0.f
            java.lang.Class r11 = eh.a.i(r17)
            java.lang.String r12 = "isNativeGroupStatusNotifyMethod"
            java.lang.String r13 = "isNativeGroupStatusNotifyMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r16 = 7
            r14 = r9
            r9 = 1
            r17 = r14
            r14 = 0
            r20 = r3
            r3 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.reflect.Method r8 = r10.r(r6, r0, r3, r8)
        L489:
            android.content.Context r0 = r6.f11620a
            org.luckypray.dexkit.DexKitBridge r3 = r6.f11623d
            android.content.SharedPreferences r4 = ub.b.c(r0, r4)
            android.content.Context r0 = r6.f11620a
            java.lang.ClassLoader r9 = r6.f11622c
            java.lang.String r10 = e8.b.g(r0, r9)
            java.lang.String r11 = "fold_group_menu_create"
            java.lang.reflect.Method r0 = e8.b.c(r4, r10, r9, r11)
            java.lang.String r12 = "fold_group_menu_click"
            java.lang.reflect.Method r13 = e8.b.c(r4, r10, r9, r12)
            r14 = 2
            r15 = 5
            if (r0 == 0) goto L4ba
            if (r13 == 0) goto L4ba
            java.lang.Class r16 = c9.d2.u(r0, r13)
            if (r16 == 0) goto L4ba
            c9.w1 r3 = new c9.w1
            r3.<init>(r0, r13)
            r17 = r8
            goto L683
        L4ba:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L64b
            r0.<init>()     // Catch: java.lang.Throwable -> L64b
            fh.k r13 = new fh.k     // Catch: java.lang.Throwable -> L64b
            r13.<init>()     // Catch: java.lang.Throwable -> L64b
            r13.l0(r14, r7)     // Catch: java.lang.Throwable -> L64b
            java.lang.String r14 = "onCreateContextMenu"
            r17 = r8
            gh.c r8 = new gh.c     // Catch: java.lang.Throwable -> L51e
            r8.<init>(r14, r15)     // Catch: java.lang.Throwable -> L51e
            r13.f3950g = r8     // Catch: java.lang.Throwable -> L51e
            fh.k.q0(r13, r5)     // Catch: java.lang.Throwable -> L51e
            java.lang.String r8 = "android.view.ContextMenu"
            java.lang.String r14 = "android.view.View"
            java.lang.String r15 = "android.view.ContextMenu$ContextMenuInfo"
            java.lang.String[] r8 = new java.lang.String[]{r8, r14, r15}     // Catch: java.lang.Throwable -> L51e
            r13.o0(r8)     // Catch: java.lang.Throwable -> L51e
            r0.f1666h = r13     // Catch: java.lang.Throwable -> L51e
            hh.p r0 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L51e
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51e
            r8.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.Iterator r13 = r0.iterator()     // Catch: java.lang.Throwable -> L51e
        L4f1:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> L51e
            if (r0 == 0) goto L521
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> L51e
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L51e
            r0.getClass()     // Catch: java.lang.Throwable -> L509
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L509
            java.lang.reflect.Method r0 = r0.b(r9)     // Catch: java.lang.Throwable -> L509
            goto L510
        L509:
            r0 = move-exception
            sf.f r14 = new sf.f     // Catch: java.lang.Throwable -> L51e
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L51e
            r0 = r14
        L510:
            boolean r14 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L51e
            if (r14 == 0) goto L516
            r0 = 0
        L516:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L51e
            if (r0 == 0) goto L4f1
            r8.add(r0)     // Catch: java.lang.Throwable -> L51e
            goto L4f1
        L51e:
            r0 = move-exception
            goto L64e
        L521:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51e
            r13.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.Iterator r0 = r8.iterator()     // Catch: java.lang.Throwable -> L51e
        L52a:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L51e
            if (r8 == 0) goto L541
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L51e
            r14 = r8
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> L51e
            boolean r14 = c9.d2.p(r14)     // Catch: java.lang.Throwable -> L51e
            if (r14 == 0) goto L52a
            r13.add(r8)     // Catch: java.lang.Throwable -> L51e
            goto L52a
        L541:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L51e
            r0.<init>()     // Catch: java.lang.Throwable -> L51e
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L51e
            r8.<init>()     // Catch: java.lang.Throwable -> L51e
            r14 = 2
            r8.l0(r14, r7)     // Catch: java.lang.Throwable -> L51e
            java.lang.String r7 = "onMMMenuItemSelected"
            gh.c r14 = new gh.c     // Catch: java.lang.Throwable -> L51e
            r15 = 5
            r14.<init>(r7, r15)     // Catch: java.lang.Throwable -> L51e
            r8.f3950g = r14     // Catch: java.lang.Throwable -> L51e
            fh.k.q0(r8, r5)     // Catch: java.lang.Throwable -> L51e
            java.lang.String r5 = "android.view.MenuItem"
            java.lang.String r7 = "int"
            java.lang.String[] r5 = new java.lang.String[]{r5, r7}     // Catch: java.lang.Throwable -> L51e
            r8.o0(r5)     // Catch: java.lang.Throwable -> L51e
            r0.f1666h = r8     // Catch: java.lang.Throwable -> L51e
            hh.p r0 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L51e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51e
            r3.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L51e
        L576:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L51e
            if (r0 == 0) goto L5a3
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L51e
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L51e
            r0.getClass()     // Catch: java.lang.Throwable -> L58e
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L58e
            java.lang.reflect.Method r0 = r0.b(r9)     // Catch: java.lang.Throwable -> L58e
            goto L595
        L58e:
            r0 = move-exception
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> L51e
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L51e
            r0 = r7
        L595:
            boolean r7 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L51e
            if (r7 == 0) goto L59b
            r0 = 0
        L59b:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L51e
            if (r0 == 0) goto L576
            r3.add(r0)     // Catch: java.lang.Throwable -> L51e
            goto L576
        L5a3:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51e
            r0.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L51e
        L5ac:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L51e
            if (r5 == 0) goto L5c3
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L51e
            r7 = r5
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L51e
            boolean r7 = c9.d2.o(r7)     // Catch: java.lang.Throwable -> L51e
            if (r7 == 0) goto L5ac
            r0.add(r5)     // Catch: java.lang.Throwable -> L51e
            goto L5ac
        L5c3:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51e
            r3.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.Iterator r5 = r13.iterator()     // Catch: java.lang.Throwable -> L51e
        L5cc:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L51e
            if (r7 == 0) goto L604
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L51e
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L51e
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51e
            r8.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L51e
        L5e1:
            boolean r13 = r9.hasNext()     // Catch: java.lang.Throwable -> L51e
            if (r13 == 0) goto L600
            java.lang.Object r13 = r9.next()     // Catch: java.lang.Throwable -> L51e
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> L51e
            java.lang.Class r14 = c9.d2.u(r7, r13)     // Catch: java.lang.Throwable -> L51e
            if (r14 == 0) goto L5f9
            c9.w1 r14 = new c9.w1     // Catch: java.lang.Throwable -> L51e
            r14.<init>(r7, r13)     // Catch: java.lang.Throwable -> L51e
            goto L5fa
        L5f9:
            r14 = 0
        L5fa:
            if (r14 == 0) goto L5e1
            r8.add(r14)     // Catch: java.lang.Throwable -> L51e
            goto L5e1
        L600:
            tf.r.h1(r3, r8)     // Catch: java.lang.Throwable -> L51e
            goto L5cc
        L604:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L51e
            r0.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51e
            r5.<init>()     // Catch: java.lang.Throwable -> L51e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L51e
        L612:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L51e
            if (r7 == 0) goto L644
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L51e
            r8 = r7
            c9.w1 r8 = (c9.w1) r8     // Catch: java.lang.Throwable -> L51e
            java.lang.reflect.Method r9 = r8.f1424a     // Catch: java.lang.Throwable -> L51e
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L51e
            java.lang.reflect.Method r8 = r8.f1425b     // Catch: java.lang.Throwable -> L51e
            java.lang.String r8 = r8.toGenericString()     // Catch: java.lang.Throwable -> L51e
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51e
            r13.<init>()     // Catch: java.lang.Throwable -> L51e
            r13.append(r9)     // Catch: java.lang.Throwable -> L51e
            r13.append(r8)     // Catch: java.lang.Throwable -> L51e
            java.lang.String r8 = r13.toString()     // Catch: java.lang.Throwable -> L51e
            boolean r8 = r0.add(r8)     // Catch: java.lang.Throwable -> L51e
            if (r8 == 0) goto L612
            r5.add(r7)     // Catch: java.lang.Throwable -> L51e
            goto L612
        L644:
            java.lang.Object r0 = tf.m.I1(r5)     // Catch: java.lang.Throwable -> L51e
            c9.w1 r0 = (c9.w1) r0     // Catch: java.lang.Throwable -> L51e
            goto L654
        L64b:
            r0 = move-exception
            r17 = r8
        L64e:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L654:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto L663
            java.lang.String r5 = r3.getMessage()
            java.lang.String r7 = "[Hchat:ConversationGroup] 定位微信原生分组长按菜单失败: "
            eh.a.x(r7, r5, r3)
        L663:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L668
            r0 = 0
        L668:
            r3 = r0
            c9.w1 r3 = (c9.w1) r3
            if (r3 != 0) goto L679
            e8.b.a(r4, r10, r11)
            e8.b.a(r4, r10, r12)
            java.lang.String r0 = "[Hchat:ConversationGroup] 微信原生分组长按菜单缺失或候选不唯一"
            fb.v0.m(r0)
            goto L683
        L679:
            java.lang.reflect.Method r0 = r3.f1424a
            e8.b.h(r4, r10, r11, r0)
            java.lang.reflect.Method r0 = r3.f1425b
            e8.b.h(r4, r10, r12, r0)
        L683:
            xa.a r0 = xa.a.f21418a
            c9.n1 r4 = new c9.n1
            r5 = 0
            r4.<init>(r5, r5)
            java.lang.reflect.Method r0 = r0.d(r6, r4)
            if (r0 == 0) goto L817
            c9.d2.f1151o = r1
            c9.d2.f1152p = r2
            java.util.concurrent.atomic.AtomicBoolean r4 = c9.d2.f1138b
            r11 = 1
            boolean r4 = r4.compareAndSet(r5, r11)
            if (r4 != 0) goto L69f
            goto L6c4
        L69f:
            android.content.Context r4 = r6.f11620a
            java.lang.String r5 = "Hchat_conversation_groups"
            android.content.SharedPreferences r4 = ub.b.c(r4, r5)
            b9.b r5 = new b9.b
            r5.<init>(r6, r11)
            r4.registerOnSharedPreferenceChangeListener(r5)
            h8.b r4 = h.Hchat.hooks.api.core.WeChatApis.conversationChanges()
            if (r4 == 0) goto L6bf
            c9.q1 r5 = new c9.q1
            r5.<init>(r6)
            java.util.concurrent.CopyOnWriteArrayList r4 = r4.f5142d
            r4.addIfAbsent(r5)
        L6bf:
            android.content.Context r4 = r6.f11620a
            c9.d2.y(r4)
        L6c4:
            c9.b2 r4 = new c9.b2
            r4.<init>(r1, r6)
            r9 = r21
            boolean r1 = c9.d2.m(r9, r4)
            ba.f r4 = new ba.f
            r14 = 2
            r4.<init>(r14)
            r8 = r22
            boolean r4 = c9.d2.m(r8, r4)
            c9.a2 r5 = new c9.a2
            r7 = 0
            r5.<init>(r6, r7)
            r8 = r23
            boolean r5 = c9.d2.m(r8, r5)
            ba.f r7 = new ba.f
            r8 = 11
            r7.<init>(r8)
            r8 = r24
            boolean r7 = c9.d2.m(r8, r7)
            ba.f r8 = new ba.f
            r9 = 7
            r8.<init>(r9)
            boolean r2 = c9.d2.m(r2, r8)
            ba.f r8 = new ba.f
            r9 = 6
            r8.<init>(r9)
            r9 = r20
            boolean r8 = c9.d2.m(r9, r8)
            if (r17 == 0) goto L71a
            ba.f r9 = new ba.f
            r10 = 8
            r9.<init>(r10)
            r10 = r17
            boolean r11 = c9.d2.m(r10, r9)
            goto L71b
        L71a:
            r11 = 1
        L71b:
            java.lang.String r9 = "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"
            java.lang.ClassLoader r10 = r6.f11622c
            java.lang.Class r9 = h.Hchat.utils.KavaReflector.loadClass(r9, r10)
            if (r9 == 0) goto L7c6
            java.lang.String r10 = "onActivityCreated"
            java.lang.Class<android.os.Bundle> r12 = android.os.Bundle.class
            java.lang.Class[] r12 = new java.lang.Class[]{r12}
            java.lang.reflect.Method r10 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r9, r10, r12)
            if (r10 == 0) goto L7c6
            java.lang.String r12 = "com.tencent.mm.ui.FragmentActivitySupport"
            java.lang.ClassLoader r13 = r6.f11622c
            java.lang.Class r12 = h.Hchat.utils.KavaReflector.loadClass(r12, r13)
            if (r12 == 0) goto L7c6
            java.lang.String r13 = "getStringExtra"
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Class[] r14 = new java.lang.Class[]{r14}
            java.lang.reflect.Method r12 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r12, r13, r14)
            if (r12 == 0) goto L7c6
            ba.f r13 = new ba.f
            r14 = 10
            r13.<init>(r14)
            boolean r12 = c9.d2.m(r12, r13)
            c9.a2 r13 = new c9.a2
            r14 = 1
            r13.<init>(r6, r14)
            boolean r10 = c9.d2.m(r10, r13)
            java.lang.String r13 = "onPause"
            java.lang.String r15 = "onResume"
            java.lang.String[] r13 = new java.lang.String[]{r13, r15}
            java.util.List r13 = a.a.y0(r13)
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L779
            r16 = r1
            r17 = r2
            r1 = r14
            r14 = 0
            goto L7b1
        L779:
            java.util.Iterator r13 = r13.iterator()
        L77d:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L7ab
            java.lang.Object r15 = r13.next()
            java.lang.String r15 = (java.lang.String) r15
            r16 = r1
            r14 = 0
            java.lang.Class[] r1 = new java.lang.Class[r14]
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r9, r15, r1)
            r17 = r2
            if (r1 == 0) goto L7a0
            c9.c2 r2 = new c9.c2
            r2.<init>(r15, r14, r6)
            boolean r1 = c9.d2.m(r1, r2)
            goto L7a1
        L7a0:
            r1 = r14
        L7a1:
            if (r1 != 0) goto L7a5
            r1 = r14
            goto L7b1
        L7a5:
            r1 = r16
            r2 = r17
            r14 = 1
            goto L77d
        L7ab:
            r16 = r1
            r17 = r2
            r14 = 0
            r1 = 1
        L7b1:
            if (r12 == 0) goto L7b7
            if (r10 == 0) goto L7b7
            if (r1 != 0) goto L7bc
        L7b7:
            java.lang.String r2 = "[Hchat:ConversationGroup] 微信原生分组页面 Hook 安装不完整: fragment=com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"
            fb.v0.m(r2)
        L7bc:
            if (r12 == 0) goto L7c4
            if (r10 == 0) goto L7c4
            if (r1 == 0) goto L7c4
            r1 = 1
            goto L7cc
        L7c4:
            r1 = r14
            goto L7cc
        L7c6:
            r16 = r1
            r17 = r2
            r14 = 0
            goto L7c4
        L7cc:
            if (r3 == 0) goto L7f6
            java.lang.reflect.Method r2 = r3.f1425b
            ba.f r6 = new ba.f
            r9 = 3
            r6.<init>(r9)
            boolean r2 = c9.d2.m(r2, r6)
            if (r2 == 0) goto L7ec
            java.lang.reflect.Method r3 = r3.f1424a
            ba.f r6 = new ba.f
            r9 = 4
            r6.<init>(r9)
            boolean r3 = c9.d2.m(r3, r6)
            if (r3 == 0) goto L7ec
            r3 = 1
            goto L7ed
        L7ec:
            r3 = r14
        L7ed:
            if (r2 == 0) goto L7f1
            if (r3 != 0) goto L7f6
        L7f1:
            java.lang.String r2 = "[Hchat:ConversationGroup] 微信原生分组长按菜单 Hook 安装不完整，已保留原生菜单"
            fb.v0.m(r2)
        L7f6:
            ba.f r2 = new ba.f
            r15 = 5
            r2.<init>(r15)
            boolean r0 = c9.d2.m(r0, r2)
            if (r16 == 0) goto L814
            if (r4 == 0) goto L814
            if (r5 == 0) goto L814
            if (r7 == 0) goto L814
            if (r17 == 0) goto L814
            if (r8 == 0) goto L814
            if (r11 == 0) goto L814
            if (r1 == 0) goto L814
            if (r0 == 0) goto L814
            r3 = 1
            goto L815
        L814:
            r3 = r14
        L815:
            r4 = r3
            goto L81b
        L817:
            r14 = r5
            goto L81a
        L819:
            r14 = 0
        L81a:
            r4 = r14
        L81b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
    }
}
