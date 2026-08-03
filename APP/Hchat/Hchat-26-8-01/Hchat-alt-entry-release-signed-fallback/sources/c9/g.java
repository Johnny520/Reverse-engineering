package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1194e;

    public /* synthetic */ g(int r1) {
            r0 = this;
            r0.f1194e = r1
            r0.<init>()
            return
    }

    public static void k(r8.g r5) {
            android.os.Handler r0 = r8.e.f11615a
            c9.f r0 = new c9.f
            r1 = 1
            r0.<init>(r5, r1)
            r1 = 8
            java.lang.String r2 = "shared:send_button"
            java.lang.String r3 = "聊天发送按钮"
            r8.c r4 = r8.c.f11604j
            r8.e.f(r1, r0, r2, r3, r4)
            c9.f r0 = new c9.f
            r2 = 2
            r0.<init>(r5, r2)
            java.lang.String r2 = "script_plugin:message"
            java.lang.String r3 = "脚本插件-消息监听"
            r8.e.f(r1, r0, r2, r3, r4)
            c9.f r0 = new c9.f
            r2 = 3
            r0.<init>(r5, r2)
            java.lang.String r2 = "script_plugin:new_friend"
            java.lang.String r3 = "脚本插件-好友申请"
            r8.e.f(r1, r0, r2, r3, r4)
            c9.f r0 = new c9.f
            r2 = 4
            r0.<init>(r5, r2)
            java.lang.String r5 = "script_plugin:member_change"
            java.lang.String r2 = "脚本插件-成员变动"
            r8.e.f(r1, r0, r5, r2, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            int r0 = r1.f1194e
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L17;
                case 9: goto L14;
                case 10: goto L11;
                case 11: goto Le;
                case 12: goto Lb;
                case 13: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "quick_terminate"
            return r0
        L8:
            java.lang.String r0 = "message_affix"
            return r0
        Lb:
            java.lang.String r0 = "keyword_notification"
            return r0
        Le:
            java.lang.String r0 = "auto_reply"
            return r0
        L11:
            java.lang.String r0 = "protobuf_packet"
            return r0
        L14:
            java.lang.String r0 = "wechat_keep_alive"
            return r0
        L17:
            java.lang.String r0 = "auto_original_image"
            return r0
        L1a:
            java.lang.String r0 = "audio_transform"
            return r0
        L1d:
            java.lang.String r0 = "block_at_all_notification"
            return r0
        L20:
            java.lang.String r0 = "group_chat_label"
            return r0
        L23:
            java.lang.String r0 = "floating_shortcut_menu"
            return r0
        L26:
            java.lang.String r0 = "sns_anti_recall"
            return r0
        L29:
            java.lang.String r0 = "script_plugin"
            return r0
        L2c:
            java.lang.String r0 = "custom_notification"
            return r0
        L2f:
            java.lang.String r0 = "conversation_group"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            int r0 = r4.f1194e
            r5.getClass()
            switch(r0) {
                case 0: goto Lf6;
                case 1: goto Le5;
                case 2: goto Ld4;
                case 3: goto Lc3;
                case 4: goto Lb2;
                case 5: goto La1;
                case 6: goto L90;
                case 7: goto L7f;
                case 8: goto L6e;
                case 9: goto L5d;
                case 10: goto L4c;
                case 11: goto L3b;
                case 12: goto L2a;
                case 13: goto L19;
                default: goto L8;
            }
        L8:
            s8.d r5 = new s8.d
            java.lang.String r0 = "从微信右上角加号菜单快速结束微信进程"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "quick_terminate"
            java.lang.String r3 = "快捷终止"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L19:
            s8.d r5 = new s8.d
            java.lang.String r0 = "自定义聊天文字消息的发送格式"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "message_affix"
            java.lang.String r3 = "发送文本格式"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L2a:
            s8.d r5 = new s8.d
            java.lang.String r0 = "按关键词、@我或@所有人提醒指定聊天消息，支持铃声和震动"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "keyword_notification"
            java.lang.String r3 = "关键词通知"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L3b:
            s8.d r5 = new s8.d
            java.lang.String r0 = "按规则回复消息，处理好友申请和通过后的欢迎语"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "auto_reply"
            java.lang.String r3 = "自动回复"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L4c:
            s8.d r5 = new s8.d
            java.lang.String r0 = "抓包和自定义发包"
            java.lang.String r1 = "entertainment"
            java.lang.String r2 = "protobuf_packet"
            java.lang.String r3 = "Protobuf"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L5d:
            s8.d r5 = new s8.d
            java.lang.String r0 = "前台服务、WakeLock 和 Root 白名单提高息屏存活率"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "wechat_keep_alive"
            java.lang.String r3 = "微信强保活"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L6e:
            s8.d r5 = new s8.d
            java.lang.String r0 = "发送聊天图片时自动勾选原图"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "auto_original_image"
            java.lang.String r3 = "自动勾选原图"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L7f:
            s8.d r5 = new s8.d
            java.lang.String r0 = "任意音频转 Silk 保存/发送，或把 Silk 导出为 MP3/M4A 保存"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "audio_transform"
            java.lang.String r3 = "音频转换"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L90:
            s8.d r5 = new s8.d
            java.lang.String r0 = "按选择的群聊拦截艾特所有人通知"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "block_at_all_notification"
            java.lang.String r3 = "屏蔽艾特所有人"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        La1:
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "分类管理群聊，在名单选择器中按标签批量选择"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "group_chat_label"
            java.lang.String r3 = "群聊标签"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        Lb2:
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "展开插件 Agent、自定义快捷项或微信页面"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "floating_shortcut_menu"
            java.lang.String r3 = "悬浮快捷菜单"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        Lc3:
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "已缓存的朋友圈在对方删除或限制可见范围后继续显示"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "sns_anti_recall"
            java.lang.String r3 = "朋友圈防撤回"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        Ld4:
            aa.g r5 = new aa.g
            java.lang.String r0 = "启动时自动加载已启用插件"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "script_plugin"
            java.lang.String r3 = "插件总开关"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        Le5:
            aa.g r5 = new aa.g
            java.lang.String r0 = "按默认规则或会话规则接管微信通知，支持铃声、震动、静默、群成员过滤、已读和快捷回复"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "custom_notification"
            java.lang.String r3 = "自定义通知"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        Lf6:
            aa.g r5 = new aa.g
            java.lang.String r0 = "按自定义分组整理聊天，支持多级分类"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "conversation_group"
            java.lang.String r3 = "聊天分组"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r1.f1194e
            r4 = 19
            r5 = 1
            r6 = 10
            r7 = 8
            r8 = 0
            switch(r2) {
                case 0: goto L35b;
                case 1: goto L348;
                case 2: goto L32f;
                case 3: goto L1d4;
                case 4: goto L15d;
                case 5: goto L159;
                case 6: goto L146;
                case 7: goto L142;
                case 8: goto Lb1;
                case 9: goto La6;
                case 10: goto L85;
                case 11: goto L75;
                case 12: goto L5b;
                case 13: goto L15;
                default: goto L11;
            }
        L11:
            r0.getClass()
            return
        L15:
            r0.getClass()
            android.content.Context r2 = r0.f11620a
            java.lang.String r3 = "Hchat_message_affix_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            q9.a r3 = new q9.a
            r3.<init>(r2, r1)
            java.util.concurrent.CopyOnWriteArrayList r2 = eb.m0.f2594h
            e9.h r5 = new e9.h
            r5.<init>(r4)
            tf.r.i1(r5, r2)
            eb.k0 r4 = new eb.k0
            r4.<init>(r3)
            r2.add(r4)
            a2.a r2 = new a2.a
            r2.<init>(r6)
            r1.j(r2)
            android.os.Handler r2 = r8.e.f11615a
            java.lang.String r2 = "shared:send_button"
            java.lang.String r3 = "聊天发送按钮"
            r8.c r4 = r8.c.f11604j
            c9.f r5 = new c9.f
            r5.<init>(r0, r6)
            r8.e.f(r7, r5, r2, r3, r4)
            java.lang.Class<f8.e> r2 = f8.e.class
            eb.s r3 = new eb.s
            r4 = 3
            r3.<init>(r1, r0, r4)
            r1.i(r2, r3)
            return
        L5b:
            r0.getClass()
            java.lang.Class<f8.e> r2 = f8.e.class
            e9.a r3 = new e9.a
            r4 = 15
            r3.<init>(r1, r4, r0)
            r1.i(r2, r3)
            java.lang.Class<f8.f> r2 = f8.f.class
            eb.s r3 = new eb.s
            r3.<init>(r0)
            r1.i(r2, r3)
            return
        L75:
            r0.getClass()
            java.lang.Class<f8.e> r2 = f8.e.class
            e9.a r3 = new e9.a
            r4 = 14
            r3.<init>(r1, r4, r0)
            r1.i(r2, r3)
            return
        L85:
            r0.getClass()
            android.os.Handler r2 = r8.e.f11615a
            java.lang.String r2 = "protobuf_packet"
            java.lang.String r3 = "Protobuf"
            r8.c r4 = r8.c.f11604j
            sh.v1 r5 = new sh.v1
            r6 = 5
            r5.<init>(r0, r6, r1)
            r8.e.f(r7, r5, r2, r3, r4)
            java.lang.Class<f8.e> r2 = f8.e.class
            e9.a r3 = new e9.a
            r4 = 13
            r3.<init>(r1, r4, r0)
            r1.i(r2, r3)
            return
        La6:
            r0.getClass()
            android.content.Context r2 = r0.f11620a
            android.content.Context r0 = r0.f11621b
            w9.a.a(r2, r0)
            return
        Lb1:
            r0.getClass()
            w8.a r2 = new w8.a
            r2.<init>(r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = r2.f14888c
            java.util.List r0 = w8.a.f14885d
            java.util.Iterator r4 = r0.iterator()
            r5 = r8
        Lc2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L13a
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            r8.g r6 = r2.f14886a
            java.lang.ClassLoader r6 = r6.f11622c
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r6)
            if (r0 == 0) goto Lc2
            java.lang.String r6 = "onCreate"
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r6, r7)
            if (r6 == 0) goto Lc2
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto Lef
        Lec:
            int r5 = r5 + 1
            goto Lc2
        Lef:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L136
            java.lang.Class r0 = r6.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L104
            goto L136
        L104:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L116
            b9.e r7 = new b9.e     // Catch: java.lang.Throwable -> L116
            r9 = 28
            r7.<init>(r2, r9)     // Catch: java.lang.Throwable -> L116
            r0.b(r6, r7)     // Catch: java.lang.Throwable -> L116
            r3.add(r6)     // Catch: java.lang.Throwable -> L116
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L116
            goto L11d
        L116:
            r0 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        L11d:
            java.lang.Throwable r7 = sf.g.b(r0)
            if (r7 != 0) goto L124
            goto L12f
        L124:
            java.lang.String r0 = r6.toGenericString()
            java.lang.String r6 = "[Hchat:AutoOriginalImage] 安装图片发送页面 Hook 失败: "
            eh.a.x(r6, r0, r7)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L12f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L137
        L136:
            r0 = r8
        L137:
            if (r0 == 0) goto Lc2
            goto Lec
        L13a:
            if (r5 != 0) goto L141
            java.lang.String r0 = "[Hchat:AutoOriginalImage] 未找到图片发送页面 onCreate Hook 入口"
            fb.v0.m(r0)
        L141:
            return
        L142:
            r0.getClass()
            return
        L146:
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r2 = e9.q.f2460a
            e9.q.i(r0)
            java.lang.Class<f8.e> r2 = f8.e.class
            e9.a r3 = new e9.a
            r3.<init>(r1, r7, r0)
            r1.i(r2, r3)
            return
        L159:
            r0.getClass()
            return
        L15d:
            r0.getClass()
            k9.r r2 = k9.r.f7530a
            android.content.Context r0 = r0.f11620a
            monitor-enter(r2)
            boolean r6 = k9.r.f7534e     // Catch: java.lang.Throwable -> L1d1
            if (r6 == 0) goto L16b
            monitor-exit(r2)
            goto L186
        L16b:
            oh.h.L(r0)     // Catch: java.lang.Throwable -> L1d1
            java.lang.String r6 = "floating_shortcut_menu"
            android.content.SharedPreferences r0 = ub.b.c(r0, r6)     // Catch: java.lang.Throwable -> L1d1
            k9.k r6 = k9.r.f7540k     // Catch: java.lang.Throwable -> L1d1
            r0.registerOnSharedPreferenceChangeListener(r6)     // Catch: java.lang.Throwable -> L1d1
            java.lang.String r6 = "enable"
            boolean r6 = r0.getBoolean(r6, r8)     // Catch: java.lang.Throwable -> L1d1
            k9.r.f7533d = r6     // Catch: java.lang.Throwable -> L1d1
            k9.r.f7532c = r0     // Catch: java.lang.Throwable -> L1d1
            k9.r.f7534e = r5     // Catch: java.lang.Throwable -> L1d1
            monitor-exit(r2)
        L186:
            q8.q r0 = h.Hchat.hooks.api.core.WeChatApis.lifecycle()
            if (r0 == 0) goto L19e
            k9.a r2 = new k9.a
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f10733b
            r0.addIfAbsent(r2)
            l3.w r0 = new l3.w
            r2 = 20
            r0.<init>(r2)
            goto L19f
        L19e:
            r0 = 0
        L19f:
            r1.j(r0)
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r0 == 0) goto L1b8
            k9.b r2 = new k9.b
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f10721g
            r0.addIfAbsent(r2)
            l3.w r3 = new l3.w
            r3.<init>(r4)
            goto L1b9
        L1b8:
            r3 = 0
        L1b9:
            r1.j(r3)
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L1d0
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L1d0
            k9.p r2 = new k9.p
            r2.<init>(r0, r8)
            k9.r.p(r2)
        L1d0:
            return
        L1d1:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d1
            throw r0
        L1d4:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0.getClass()
            ha.j0 r4 = new ha.j0
            r4.<init>(r0)
            r8.g r7 = r4.f5240a
            h.Hchat.dexkit.DexFinder r9 = r0.f11624e
            java.lang.Class<?> r9 = r9.sqliteDbWrapperClass
        L1e4:
            if (r9 == 0) goto L1f6
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L1f6
            r4.h(r9)
            java.lang.Class r9 = r9.getSuperclass()
            goto L1e4
        L1f6:
            java.lang.String r9 = "com.tencent.wcdb.database.SQLiteDatabase"
            java.lang.ClassLoader r10 = r7.f11622c     // Catch: java.lang.Throwable -> L201
            java.lang.Class r9 = h.Hchat.utils.KavaReflector.loadClass(r9, r10)     // Catch: java.lang.Throwable -> L201
            r4.h(r9)     // Catch: java.lang.Throwable -> L201
        L201:
            java.lang.String r9 = "com.tencent.wcdb.compat.SQLiteDatabase"
            java.lang.ClassLoader r10 = r7.f11622c     // Catch: java.lang.Throwable -> L20c
            java.lang.Class r9 = h.Hchat.utils.KavaReflector.loadClass(r9, r10)     // Catch: java.lang.Throwable -> L20c
            r4.h(r9)     // Catch: java.lang.Throwable -> L20c
        L20c:
            java.lang.String r9 = "android.database.sqlite.SQLiteDatabase"
            java.lang.ClassLoader r7 = r7.f11622c     // Catch: java.lang.Throwable -> L217
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r9, r7)     // Catch: java.lang.Throwable -> L217
            r4.h(r7)     // Catch: java.lang.Throwable -> L217
        L217:
            android.content.SharedPreferences r7 = r4.f5242c
            java.lang.String r9 = ""
            java.lang.String r10 = "enable_flutter_sns_page"
            android.content.Context r11 = r0.f11620a
            java.lang.ClassLoader r12 = r0.f11622c
            r12.getClass()
            l8.i r11 = o8.k.a(r11, r12)
            java.lang.String r11 = r11.f7933h
            boolean r13 = og.m.t0(r11)
            if (r13 != 0) goto L231
            goto L232
        L231:
            r11 = 0
        L232:
            if (r11 == 0) goto L23b
            java.lang.String r13 = "|sns_anti_recall_v2"
            java.lang.String r11 = r11.concat(r13)
            goto L23c
        L23b:
            r11 = 0
        L23c:
            if (r11 != 0) goto L23f
            r11 = r9
        L23f:
            java.lang.reflect.Method r13 = e8.b.c(r7, r11, r12, r10)
            if (r13 == 0) goto L25f
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14.getClass()
            int r14 = r14.length
            if (r14 != 0) goto L25a
            java.lang.Class r14 = r13.getReturnType()
            boolean r14 = gg.l.a(r14, r2)
            if (r14 == 0) goto L25a
            goto L25b
        L25a:
            r13 = 0
        L25b:
            if (r13 == 0) goto L25f
            goto L30e
        L25f:
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L2a0
            ch.e r13 = new ch.e     // Catch: java.lang.Throwable -> L2a0
            r13.<init>()     // Catch: java.lang.Throwable -> L2a0
            fh.k r14 = new fh.k     // Catch: java.lang.Throwable -> L2a0
            r14.<init>()     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r15 = "enableFlutterSNSPage"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.router.SnsRouter"
            java.lang.String[] r3 = new java.lang.String[]{r15, r3}     // Catch: java.lang.Throwable -> L2a0
            r14.r0(r3)     // Catch: java.lang.Throwable -> L2a0
            r13.f1666h = r14     // Catch: java.lang.Throwable -> L2a0
            hh.p r0 = r0.findMethod(r13)     // Catch: java.lang.Throwable -> L2a0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a0
            r3.<init>()     // Catch: java.lang.Throwable -> L2a0
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2a0
        L285:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a0
            if (r13 == 0) goto L2a2
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Throwable -> L2a0
            hh.o r13 = (hh.o) r13     // Catch: java.lang.Throwable -> L2a0
            r13.getClass()     // Catch: java.lang.Throwable -> L2a0
            lh.d r13 = r13.p()     // Catch: java.lang.Throwable -> L2a0
            java.lang.reflect.Method r13 = r13.b(r12)     // Catch: java.lang.Throwable -> L2a0
            r3.add(r13)     // Catch: java.lang.Throwable -> L2a0
            goto L285
        L2a0:
            r0 = move-exception
            goto L2d1
        L2a2:
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L2a0
        L2a6:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L2a0
            if (r3 == 0) goto L2cd
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L2a0
            r12 = r3
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> L2a0
            java.lang.Class[] r13 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> L2a0
            r13.getClass()     // Catch: java.lang.Throwable -> L2a0
            int r13 = r13.length     // Catch: java.lang.Throwable -> L2a0
            if (r13 != 0) goto L2c9
            java.lang.Class r12 = r12.getReturnType()     // Catch: java.lang.Throwable -> L2a0
            boolean r12 = gg.l.a(r12, r2)     // Catch: java.lang.Throwable -> L2a0
            if (r12 == 0) goto L2c9
            r12 = r5
            goto L2ca
        L2c9:
            r12 = r8
        L2ca:
            if (r12 == 0) goto L2a6
            goto L2ce
        L2cd:
            r3 = 0
        L2ce:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L2a0
            goto L2d6
        L2d1:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L2d6:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 != 0) goto L2dd
            goto L2e7
        L2dd:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:SnsAntiRecall] 定位旧版朋友圈主页开关失败: "
            eh.a.x(r3, r2, r0)
            r3 = 0
        L2e7:
            r13 = r3
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L2f0
            e8.b.h(r7, r11, r10, r13)
            goto L30e
        L2f0:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r2 = r7.edit()     // Catch: java.lang.Throwable -> L30e
            java.lang.String r3 = r7.getString(r0, r9)     // Catch: java.lang.Throwable -> L30e
            boolean r3 = gg.l.a(r3, r11)     // Catch: java.lang.Throwable -> L30e
            if (r3 != 0) goto L307
            android.content.SharedPreferences$Editor r3 = r2.clear()     // Catch: java.lang.Throwable -> L30e
            r3.putString(r0, r11)     // Catch: java.lang.Throwable -> L30e
        L307:
            android.content.SharedPreferences$Editor r0 = r2.remove(r10)     // Catch: java.lang.Throwable -> L30e
            r0.apply()     // Catch: java.lang.Throwable -> L30e
        L30e:
            if (r13 == 0) goto L32e
            java.util.Set r0 = r4.f5243d
            boolean r0 = r0.add(r13)
            if (r0 != 0) goto L319
            goto L32e
        L319:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L324
            b9.e r2 = new b9.e     // Catch: java.lang.Throwable -> L324
            r2.<init>(r4, r6)     // Catch: java.lang.Throwable -> L324
            r0.b(r13, r2)     // Catch: java.lang.Throwable -> L324
            goto L32e
        L324:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:SnsAntiRecall] Hook旧版朋友圈主页开关失败: "
            eh.a.x(r3, r2, r0)
        L32e:
            return
        L32f:
            r0.getClass()
            ya.i.a(r0)
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            r2.install(r0)
            k(r0)
            java.lang.Class<f8.e> r2 = f8.e.class
            eb.s r3 = new eb.s
            r3.<init>(r1, r0, r8)
            r1.i(r2, r3)
            return
        L348:
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r2 = e9.q.f2460a
            e9.q.i(r0)
            java.lang.Class<f8.e> r2 = f8.e.class
            e9.a r3 = new e9.a
            r3.<init>(r1, r8, r0)
            r1.i(r2, r3)
            return
        L35b:
            r0.getClass()
            android.os.Handler r2 = r8.e.f11615a
            java.lang.String r2 = "conversation_group"
            java.lang.String r3 = "聊天分组"
            r8.c r4 = r8.c.f11603i
            c9.f r5 = new c9.f
            r5.<init>(r0, r8)
            r8.e.f(r7, r5, r2, r3, r4)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            int r0 = r1.f1194e
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L17;
                case 9: goto L14;
                case 10: goto L11;
                case 11: goto Le;
                case 12: goto Lb;
                case 13: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "快捷终止"
            return r0
        L8:
            java.lang.String r0 = "发送文本格式"
            return r0
        Lb:
            java.lang.String r0 = "关键词通知"
            return r0
        Le:
            java.lang.String r0 = "自动回复"
            return r0
        L11:
            java.lang.String r0 = "Protobuf"
            return r0
        L14:
            java.lang.String r0 = "微信强保活"
            return r0
        L17:
            java.lang.String r0 = "自动勾选原图"
            return r0
        L1a:
            java.lang.String r0 = "音频转换"
            return r0
        L1d:
            java.lang.String r0 = "屏蔽艾特所有人"
            return r0
        L20:
            java.lang.String r0 = "群聊标签"
            return r0
        L23:
            java.lang.String r0 = "悬浮快捷菜单"
            return r0
        L26:
            java.lang.String r0 = "朋友圈防撤回"
            return r0
        L29:
            java.lang.String r0 = "脚本插件"
            return r0
        L2c:
            java.lang.String r0 = "自定义通知"
            return r0
        L2f:
            java.lang.String r0 = "聊天分组"
            return r0
    }
}
