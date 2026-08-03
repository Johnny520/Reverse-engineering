package b9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f524f;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f523e = r1
            r0.<init>()
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            int r0 = r1.f523e
            switch(r0) {
                case 0: goto L26;
                case 1: goto L23;
                case 2: goto L20;
                case 3: goto L1d;
                case 4: goto L1a;
                case 5: goto L17;
                case 6: goto L14;
                case 7: goto L11;
                case 8: goto Le;
                case 9: goto Lb;
                case 10: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "auto_message_forward"
            return r0
        L8:
            java.lang.String r0 = "hide_chat_menu"
            return r0
        Lb:
            java.lang.String r0 = "hide_chat_avatar"
            return r0
        Le:
            java.lang.String r0 = "fake_wallet_balance"
            return r0
        L11:
            java.lang.String r0 = "text_speech"
            return r0
        L14:
            java.lang.String r0 = "auto_redpacket"
            return r0
        L17:
            java.lang.String r0 = "fake_scan_camera"
            return r0
        L1a:
            java.lang.String r0 = "original_moments_upload"
            return r0
        L1d:
            java.lang.String r0 = "message_text_color"
            return r0
        L20:
            java.lang.String r0 = "round_avatar"
            return r0
        L23:
            java.lang.String r0 = "message_bubble"
            return r0
        L26:
            java.lang.String r0 = "chat_time_style"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            int r0 = r4.f523e
            r5.getClass()
            switch(r0) {
                case 0: goto Lc6;
                case 1: goto Lb5;
                case 2: goto La4;
                case 3: goto L93;
                case 4: goto L82;
                case 5: goto L71;
                case 6: goto L5d;
                case 7: goto L4c;
                case 8: goto L3b;
                case 9: goto L2a;
                case 10: goto L19;
                default: goto L8;
            }
        L8:
            s8.d r5 = new s8.d
            java.lang.String r0 = "按会话、消息类型和关键词自动转发收到的消息"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "auto_message_forward"
            java.lang.String r3 = "消息自动转发"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L19:
            s8.d r5 = new s8.d
            java.lang.String r0 = "隐藏聊天消息长按菜单中的指定项目"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "hide_chat_menu"
            java.lang.String r3 = "隐藏聊天菜单"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L2a:
            s8.d r5 = new s8.d
            java.lang.String r0 = "分别隐藏聊天中自己或对方的头像"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "hide_chat_avatar"
            java.lang.String r3 = "隐藏头像"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L3b:
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "自定义零钱、零钱通和经营账户显示"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "fake_wallet_balance"
            java.lang.String r3 = "伪造零钱"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L4c:
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "自动播报允许名单内收到的文字或语音消息"
            java.lang.String r1 = "enhance"
            java.lang.String r2 = "text_speech"
            java.lang.String r3 = "文字转语音播报"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L5d:
            ib.a r5 = new ib.a
            r0 = 2
            r5.<init>(r0)
            r4.h(r5)
            j8.o r5 = new j8.o
            r5.<init>()
            java.lang.Class<f8.i> r0 = f8.i.class
            r4.i(r0, r5)
            return
        L71:
            ha.k0 r5 = new ha.k0
            java.lang.String r0 = "让相册识别二维码按相机扫码来源处理"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "fake_scan_camera"
            java.lang.String r3 = "模拟相机扫码"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L82:
            aa.g r5 = new aa.g
            java.lang.String r0 = "发布朋友圈图片和视频时尽量保留原始文件"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "original_moments_upload"
            java.lang.String r3 = "朋友圈原图上传"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        L93:
            aa.g r5 = new aa.g
            java.lang.String r0 = "自定义聊天文本消息左右侧颜色"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "message_text_color"
            java.lang.String r3 = "消息文本颜色"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        La4:
            aa.g r5 = new aa.g
            java.lang.String r0 = "统一设置微信头像的圆角弧度"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "round_avatar"
            java.lang.String r3 = "圆角头像"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        Lb5:
            aa.g r5 = new aa.g
            java.lang.String r0 = "分别替换聊天左右侧气泡并适配深色模式"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "message_bubble"
            java.lang.String r3 = "消息气泡"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
        Lc6:
            aa.g r5 = new aa.g
            java.lang.String r0 = "自定义或隐藏聊天记录中的微信时间"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "chat_time_style"
            java.lang.String r3 = "会话时间样式"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r14) {
            r13 = this;
            int r0 = r13.f523e
            r1 = 4
            r2 = 6
            r3 = 11
            r4 = 0
            r5 = 1
            r6 = 12
            r7 = 0
            java.lang.Class<f8.e> r8 = f8.e.class
            r14.getClass()
            switch(r0) {
                case 0: goto L21c;
                case 1: goto L207;
                case 2: goto L150;
                case 3: goto L13a;
                case 4: goto L113;
                case 5: goto Lee;
                case 6: goto Ld0;
                case 7: goto L82;
                case 8: goto L6e;
                case 9: goto L50;
                case 10: goto L1c;
                default: goto L13;
            }
        L13:
            e9.a r0 = new e9.a
            r0.<init>(r13, r3, r14)
            r13.i(r8, r0)
            return
        L1c:
            b5.c r0 = new b5.c
            r14.getClass()
            r0.<init>()
            r0.f469a = r14
            android.content.Context r14 = r14.f11620a
            java.lang.String r1 = "Hchat_hide_chat_menu_config"
            android.content.SharedPreferences r14 = ub.b.c(r14, r1)
            r0.f470b = r14
            java.util.Set r14 = j8.b.o()
            r0.f471c = r14
            r13.f524f = r0
            i.e0 r14 = new i.e0
            r0 = 24
            r14.<init>(r13, r0)
            java.lang.String r0 = "hide_chat_menu"
            java.lang.String r1 = "隐藏长按菜单"
            r8.e.f(r6, r14, r0, r1, r7)
            q9.a r14 = new q9.a
            r0 = 7
            r14.<init>(r13, r0)
            r13.i(r8, r14)
            return
        L50:
            s9.b r0 = new s9.b
            r0.<init>(r14)
            r13.f524f = r0
            i.e0 r14 = new i.e0
            r0 = 20
            r14.<init>(r13, r0)
            java.lang.String r0 = "hide_chat_avatar"
            java.lang.String r1 = "隐藏头像"
            r8.e.f(r6, r14, r0, r1, r7)
            q9.a r14 = new q9.a
            r14.<init>(r13, r2)
            r13.i(r8, r14)
            return
        L6e:
            qa.f r0 = new qa.f
            r0.<init>(r14)
            r13.f524f = r0
            i.e0 r14 = new i.e0
            r14.<init>(r13, r6)
            java.lang.String r0 = "fake_wallet_balance"
            java.lang.String r1 = "伪造零钱"
            r8.e.f(r6, r14, r0, r1, r7)
            return
        L82:
            nb.w r0 = new nb.w
            android.content.Context r14 = r14.f11620a
            r0.<init>(r14)
            r13.f524f = r0
            java.lang.Class<android.view.KeyEvent> r14 = android.view.KeyEvent.class
            java.lang.Class[] r14 = new java.lang.Class[]{r14}
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "dispatchKeyEvent"
            java.lang.reflect.Method r14 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r1, r14)
            if (r14 != 0) goto La1
            java.lang.String r14 = "[Hchat:TextSpeech] 未找到 Activity.dispatchKeyEvent"
            fb.v0.m(r14)
            goto Lc5
        La1:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> Laf
            b9.e r1 = new b9.e     // Catch: java.lang.Throwable -> Laf
            r2 = 19
            r1.<init>(r13, r2)     // Catch: java.lang.Throwable -> Laf
            de.robv.android.xposed.XC_MethodHook$Unhook r14 = r0.b(r14, r1)     // Catch: java.lang.Throwable -> Laf
            goto Lb6
        Laf:
            r14 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r14)
            r14 = r0
        Lb6:
            java.lang.Throwable r14 = sf.g.b(r14)
            if (r14 == 0) goto Lc5
            java.lang.String r0 = r14.getMessage()
            java.lang.String r1 = "[Hchat:TextSpeech] 音量键 Hook 安装失败: "
            eh.a.x(r1, r0, r14)
        Lc5:
            ke.h r14 = new ke.h
            r0 = 26
            r14.<init>(r13, r0)
            r13.i(r8, r14)
            return
        Ld0:
            android.os.Handler r0 = r8.e.f11615a
            aa.c r0 = new aa.c
            r1 = 22
            r0.<init>(r13, r1, r14)
            r1 = 8
            java.lang.String r2 = "auto_redpacket"
            java.lang.String r3 = "自动抢红包"
            r8.c r4 = r8.c.f11604j
            r8.e.f(r1, r0, r2, r3, r4)
            e9.a r0 = new e9.a
            r1 = 2
            r0.<init>(r13, r1, r14)
            r13.i(r8, r0)
            return
        Lee:
            ea.c r0 = new ea.c
            r0.<init>(r14)
            r13.f524f = r0
            boolean r14 = r0.a(r4)
            if (r14 != r5) goto Lfc
            goto L108
        Lfc:
            i.e0 r14 = new i.e0
            r14.<init>(r13, r5)
            java.lang.String r0 = "fake_scan_camera"
            java.lang.String r2 = "模拟相机扫码"
            r8.e.f(r1, r14, r0, r2, r7)
        L108:
            ke.h r14 = new ke.h
            r0 = 16
            r14.<init>(r13, r0)
            r13.i(r8, r14)
            return
        L113:
            ha.g0 r0 = new ha.g0
            r0.<init>(r14)
            r13.f524f = r0
            boolean r14 = r0.b(r4)
            if (r14 != r5) goto L121
            goto L12f
        L121:
            ab.a r14 = new ab.a
            r0 = 28
            r14.<init>(r13, r0)
            java.lang.String r0 = "original_moments_upload"
            java.lang.String r1 = "朋友圈原图上传"
            r8.e.f(r6, r14, r0, r1, r7)
        L12f:
            ke.h r14 = new ke.h
            r0 = 14
            r14.<init>(r13, r0)
            r13.i(r8, r14)
            return
        L13a:
            da.h r0 = new da.h
            r0.<init>(r14)
            r13.f524f = r0
            ab.a r14 = new ab.a
            r0 = 13
            r14.<init>(r13, r0)
            java.lang.String r0 = "message_text_color"
            java.lang.String r1 = "消息文本颜色"
            r8.e.f(r6, r14, r0, r1, r7)
            return
        L150:
            cb.f r0 = new cb.f
            r0.<init>(r14)
            java.lang.Object r14 = r0.f1625f
            java.util.concurrent.ConcurrentHashMap$KeySetView r14 = (java.util.concurrent.ConcurrentHashMap.KeySetView) r14
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.Class<android.app.Notification$Builder> r9 = android.app.Notification.Builder.class
            java.lang.String r10 = "setLargeIcon"
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r9, r10, r1)
            if (r1 == 0) goto L195
            boolean r11 = r14.add(r1)
            if (r11 != 0) goto L170
            goto L195
        L170:
            r8.i r11 = r8.i.f11631b     // Catch: java.lang.Throwable -> L17c
            cb.d r12 = new cb.d     // Catch: java.lang.Throwable -> L17c
            r12.<init>(r0, r4)     // Catch: java.lang.Throwable -> L17c
            de.robv.android.xposed.XC_MethodHook$Unhook r4 = r11.b(r1, r12)     // Catch: java.lang.Throwable -> L17c
            goto L183
        L17c:
            r4 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r4)
            r4 = r11
        L183:
            java.lang.Throwable r4 = sf.g.b(r4)
            if (r4 == 0) goto L195
            r14.remove(r1)
            java.lang.String r1 = r4.getMessage()
            java.lang.String r11 = "[Hchat:RoundAvatar] 安装通知 Bitmap 头像 Hook 失败: "
            eh.a.x(r11, r1, r4)
        L195:
            java.lang.Class<android.graphics.drawable.Icon> r1 = android.graphics.drawable.Icon.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r9, r10, r1)
            if (r1 == 0) goto L1cd
            boolean r4 = r14.add(r1)
            if (r4 != 0) goto L1a8
            goto L1cd
        L1a8:
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1b4
            cb.d r9 = new cb.d     // Catch: java.lang.Throwable -> L1b4
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L1b4
            de.robv.android.xposed.XC_MethodHook$Unhook r4 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L1b4
            goto L1bb
        L1b4:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L1bb:
            java.lang.Throwable r4 = sf.g.b(r4)
            if (r4 == 0) goto L1cd
            r14.remove(r1)
            java.lang.String r14 = r4.getMessage()
            java.lang.String r1 = "[Hchat:RoundAvatar] 安装通知 Icon 头像 Hook 失败: "
            eh.a.x(r1, r14, r4)
        L1cd:
            java.lang.Class r14 = java.lang.Integer.TYPE
            r14.getClass()
            java.lang.Class<android.app.Notification> r1 = android.app.Notification.class
            java.lang.Class[] r4 = new java.lang.Class[]{r14, r1}
            java.lang.Class<android.app.NotificationManager> r5 = android.app.NotificationManager.class
            java.lang.String r9 = "notify"
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r5, r9, r4)
            r0.e(r4)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r14 = new java.lang.Class[]{r4, r14, r1}
            java.lang.reflect.Method r14 = h.Hchat.utils.KavaReflector.findMethod(r5, r9, r14)
            r0.e(r14)
            r13.f524f = r0
            ab.a r14 = new ab.a
            r14.<init>(r13, r3)
            java.lang.String r0 = "round_avatar"
            java.lang.String r1 = "圆角头像"
            r8.e.f(r6, r14, r0, r1, r7)
            ke.h r14 = new ke.h
            r14.<init>(r13, r2)
            r13.i(r8, r14)
            return
        L207:
            ba.m r0 = new ba.m
            r0.<init>(r14)
            r13.f524f = r0
            ab.a r14 = new ab.a
            r0 = 5
            r14.<init>(r13, r0)
            java.lang.String r0 = "message_bubble"
            java.lang.String r1 = "消息气泡"
            r8.e.f(r6, r14, r0, r1, r7)
            return
        L21c:
            b9.f r0 = new b9.f
            r0.<init>(r14)
            r13.f524f = r0
            ab.a r14 = new ab.a
            r14.<init>(r13, r1)
            java.lang.String r0 = "chat_time_style"
            java.lang.String r1 = "会话时间样式"
            r8.e.f(r6, r14, r0, r1, r7)
            ke.h r14 = new ke.h
            r0 = 3
            r14.<init>(r13, r0)
            r13.i(r8, r14)
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            int r0 = r1.f523e
            switch(r0) {
                case 0: goto L26;
                case 1: goto L23;
                case 2: goto L20;
                case 3: goto L1d;
                case 4: goto L1a;
                case 5: goto L17;
                case 6: goto L14;
                case 7: goto L11;
                case 8: goto Le;
                case 9: goto Lb;
                case 10: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "消息自动转发"
            return r0
        L8:
            java.lang.String r0 = "隐藏长按菜单"
            return r0
        Lb:
            java.lang.String r0 = "隐藏头像"
            return r0
        Le:
            java.lang.String r0 = "伪造零钱"
            return r0
        L11:
            java.lang.String r0 = "文字转语音播报"
            return r0
        L14:
            java.lang.String r0 = "自动抢红包"
            return r0
        L17:
            java.lang.String r0 = "模拟相机扫码"
            return r0
        L1a:
            java.lang.String r0 = "朋友圈原图上传"
            return r0
        L1d:
            java.lang.String r0 = "消息文本颜色"
            return r0
        L20:
            java.lang.String r0 = "圆角头像"
            return r0
        L23:
            java.lang.String r0 = "消息气泡"
            return r0
        L26:
            java.lang.String r0 = "会话时间样式"
            return r0
    }
}
