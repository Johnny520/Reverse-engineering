package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l8 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17411h;

    public /* synthetic */ l8(android.content.SharedPreferences r1, int r2) {
            r0 = this;
            r0.f17410g = r2
            r0.f17411h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f17410g
            switch(r0) {
                case 0: goto L58e;
                case 1: goto L552;
                case 2: goto L524;
                case 3: goto L4f6;
                case 4: goto L4c8;
                case 5: goto L49a;
                case 6: goto L46c;
                case 7: goto L430;
                case 8: goto L402;
                case 9: goto L3d4;
                case 10: goto L3a6;
                case 11: goto L36a;
                case 12: goto L33c;
                case 13: goto L30e;
                case 14: goto L2e0;
                case 15: goto L2b2;
                case 16: goto L284;
                case 17: goto L23b;
                case 18: goto L20d;
                case 19: goto L1df;
                case 20: goto L1b1;
                case 21: goto L183;
                case 22: goto L155;
                case 23: goto L127;
                case 24: goto Lf9;
                case 25: goto Lcb;
                case 26: goto L9d;
                case 27: goto L61;
                case 28: goto L33;
                default: goto L5;
            }
        L5:
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L16
            r11 = r1
            goto L17
        L16:
            r11 = 0
        L17:
            r10 = r10 & r1
            boolean r10 = r6.S(r10, r11)
            if (r10 == 0) goto L2d
            r5 = 0
            r7 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r1 = r9.f17411h
            java.lang.String r2 = "fake_scan_camera_enable"
            java.lang.String r3 = "模拟相机扫码"
            java.lang.String r4 = "让相册识别二维码按相机扫码来源处理"
            wb.ho.O3(r1, r2, r3, r4, r5, r6, r7)
            goto L30
        L2d:
            r6.V()
        L30:
            sf.n r10 = sf.n.f12433a
            return r10
        L33:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L44
            r11 = r1
            goto L45
        L44:
            r11 = 0
        L45:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L5b
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "disable_hot_update_enable"
            java.lang.String r2 = "屏蔽热更新"
            java.lang.String r3 = "阻止微信加载和应用热更新补丁"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L5e
        L5b:
            r5.V()
        L5e:
            sf.n r10 = sf.n.f12433a
            return r10
        L61:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L73
            r11 = r8
            goto L74
        L73:
            r11 = r7
        L74:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L97
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "message_forward_enable"
            java.lang.String r2 = "转发菜单"
            java.lang.String r3 = "在消息长按菜单中显示转发[H]"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "message_forward_multi_moments_enable"
            java.lang.String r2 = "多选转发到朋友圈"
            java.lang.String r3 = "在多选消息菜单中显示转发到朋友圈[H]"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L9a
        L97:
            r5.V()
        L9a:
            sf.n r10 = sf.n.f12433a
            return r10
        L9d:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto Lae
            r11 = r1
            goto Laf
        Lae:
            r11 = 0
        Laf:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto Lc5
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "quote_delete_clear_enable"
            java.lang.String r2 = "删除键清引用"
            java.lang.String r3 = "输入框为空且已引用消息时，按输入法删除键直接取消引用"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto Lc8
        Lc5:
            r5.V()
        Lc8:
            sf.n r10 = sf.n.f12433a
            return r10
        Lcb:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto Ldc
            r11 = r1
            goto Ldd
        Ldc:
            r11 = 0
        Ldd:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto Lf3
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "edit_message_enable"
            java.lang.String r2 = "修改聊天记录"
            java.lang.String r3 = "长按文字、引用或转账消息后可修改本地记录"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto Lf6
        Lf3:
            r5.V()
        Lf6:
            sf.n r10 = sf.n.f12433a
            return r10
        Lf9:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L10a
            r11 = r1
            goto L10b
        L10a:
            r11 = 0
        L10b:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L121
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "profile_id_enable"
            java.lang.String r2 = "显示好友/群聊ID"
            java.lang.String r3 = "在好友和群聊资料页显示可点击复制的 ID"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L124
        L121:
            r5.V()
        L124:
            sf.n r10 = sf.n.f12433a
            return r10
        L127:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L138
            r11 = r1
            goto L139
        L138:
            r11 = 0
        L139:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L14f
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "emoji_save_enable"
            java.lang.String r2 = "保存表情"
            java.lang.String r3 = "长按聊天表情后显示保存入口"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L152
        L14f:
            r5.V()
        L152:
            sf.n r10 = sf.n.f12433a
            return r10
        L155:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L166
            r11 = r1
            goto L167
        L166:
            r11 = 0
        L167:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L17d
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "message_forward_sns_enable"
            java.lang.String r2 = "朋友圈转发"
            java.lang.String r3 = "在发现页或好友个人主页长按朋友圈后显示转发[H]"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L180
        L17d:
            r5.V()
        L180:
            sf.n r10 = sf.n.f12433a
            return r10
        L183:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L194
            r11 = r1
            goto L195
        L194:
            r11 = 0
        L195:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L1ab
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "remove_moments_ads_enable"
            java.lang.String r2 = "去除朋友圈广告"
            java.lang.String r3 = "阻止朋友圈广告信息解析和展示"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L1ae
        L1ab:
            r5.V()
        L1ae:
            sf.n r10 = sf.n.f12433a
            return r10
        L1b1:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L1c2
            r11 = r1
            goto L1c3
        L1c2:
            r11 = 0
        L1c3:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L1d9
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "plugin_agent_plus_menu_enable"
            java.lang.String r2 = "插件 Agent 入口"
            java.lang.String r3 = "在微信右上角加号菜单中显示插件 Agent，重启微信后生效"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L1dc
        L1d9:
            r5.V()
        L1dc:
            sf.n r10 = sf.n.f12433a
            return r10
        L1df:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L1f0
            r11 = r1
            goto L1f1
        L1f0:
            r11 = 0
        L1f1:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L207
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "tablet_enable"
            java.lang.String r2 = "平板模式"
            java.lang.String r3 = "开启平板模式，退出微信登陆生效"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L20a
        L207:
            r5.V()
        L20a:
            sf.n r10 = sf.n.f12433a
            return r10
        L20d:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L21e
            r11 = r1
            goto L21f
        L21e:
            r11 = 0
        L21f:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L235
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "enable"
            java.lang.String r2 = "视频号媒体下载"
            java.lang.String r3 = "在视频号分享菜单增加复制链接和下载入口，媒体保存到 Hchat/Finder"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L238
        L235:
            r5.V()
        L238:
            sf.n r10 = sf.n.f12433a
            return r10
        L23b:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L24d
            r11 = r8
            goto L24e
        L24d:
            r11 = r7
        L24e:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L27e
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "enable"
            java.lang.String r2 = "实名尾字"
            java.lang.String r3 = "在群聊昵称后显示已查询到的实名尾字"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            r4 = 1
            java.lang.String r1 = "message_query"
            java.lang.String r2 = "消息触发查询"
            java.lang.String r3 = "收到群成员消息后自动补查"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "visible_query"
            java.lang.String r2 = "可见成员查询"
            java.lang.String r3 = "聊天页出现未缓存成员时自动补查"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L281
        L27e:
            r5.V()
        L281:
            sf.n r10 = sf.n.f12433a
            return r10
        L284:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L295
            r11 = r1
            goto L296
        L295:
            r11 = 0
        L296:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L2ac
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "multi_recall_enable"
            java.lang.String r2 = "多选撤回"
            java.lang.String r3 = "在多选消息的分享菜单中显示批量撤回"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L2af
        L2ac:
            r5.V()
        L2af:
            sf.n r10 = sf.n.f12433a
            return r10
        L2b2:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L2c3
            r11 = r1
            goto L2c4
        L2c3:
            r11 = 0
        L2c4:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L2da
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "status_text_limit_enable"
            java.lang.String r2 = "解除状态词长度限制"
            java.lang.String r3 = "开启后个人状态词可超过微信默认 10 字限制"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L2dd
        L2da:
            r5.V()
        L2dd:
            sf.n r10 = sf.n.f12433a
            return r10
        L2e0:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L2f1
            r11 = r1
            goto L2f2
        L2f1:
            r11 = 0
        L2f2:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L308
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "call_media_limit_enable"
            java.lang.String r2 = "移除通话媒体限制"
            java.lang.String r3 = "通话时允许播放语音和视频，并打开聊天拍摄"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L30b
        L308:
            r5.V()
        L30b:
            sf.n r10 = sf.n.f12433a
            return r10
        L30e:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L31f
            r11 = r1
            goto L320
        L31f:
            r11 = 0
        L320:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L336
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "block_typing_report_enable"
            java.lang.String r2 = "拦截正在输入上报"
            java.lang.String r3 = "输入文字时不向对方显示正在输入状态"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L339
        L336:
            r5.V()
        L339:
            sf.n r10 = sf.n.f12433a
            return r10
        L33c:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L34d
            r11 = r1
            goto L34e
        L34d:
            r11 = 0
        L34e:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L364
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "quick_contact_edit_enable"
            java.lang.String r2 = "快捷设置备注和标签"
            java.lang.String r3 = "长按私聊会话或好友朋友圈头像时显示备注和标签设置入口"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L367
        L364:
            r5.V()
        L367:
            sf.n r10 = sf.n.f12433a
            return r10
        L36a:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L37c
            r11 = r8
            goto L37d
        L37c:
            r11 = r7
        L37d:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L3a0
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "swipe_repeat_enable"
            java.lang.String r2 = "右滑复读"
            java.lang.String r3 = "右滑消息后复读到当前聊天"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "repeat_menu_enable"
            java.lang.String r2 = "长按菜单复读"
            java.lang.String r3 = "长按消息后点击 +1 复读到当前聊天"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L3a3
        L3a0:
            r5.V()
        L3a3:
            sf.n r10 = sf.n.f12433a
            return r10
        L3a6:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L3b7
            r11 = r1
            goto L3b8
        L3b7:
            r11 = 0
        L3b8:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L3ce
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "swipe_quote_enable"
            java.lang.String r2 = "左滑引用回复"
            java.lang.String r3 = "左滑消息后调用微信原生引用入口"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L3d1
        L3ce:
            r5.V()
        L3d1:
            sf.n r10 = sf.n.f12433a
            return r10
        L3d4:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L3e5
            r11 = r1
            goto L3e6
        L3e5:
            r11 = 0
        L3e6:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L3fc
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "disable_pat_enable"
            java.lang.String r2 = "禁止拍一拍"
            java.lang.String r3 = "双击聊天头像时不发送拍一拍"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L3ff
        L3fc:
            r5.V()
        L3ff:
            sf.n r10 = sf.n.f12433a
            return r10
        L402:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L413
            r11 = r1
            goto L414
        L413:
            r11 = 0
        L414:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L42a
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "quick_terminate_enable"
            java.lang.String r2 = "快捷终止"
            java.lang.String r3 = "在微信右上角加号菜单中添加快捷终止，重启微信后生效"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L42d
        L42a:
            r5.V()
        L42d:
            sf.n r10 = sf.n.f12433a
            return r10
        L430:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L442
            r11 = r8
            goto L443
        L442:
            r11 = r7
        L443:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L466
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "drag_read_enable"
            java.lang.String r2 = "拖拽已读"
            java.lang.String r3 = "在微信底部未读角标向上拖动后，清空全部会话未读"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "plus_menu_read_enable"
            java.lang.String r2 = "注入加号菜单已读"
            java.lang.String r3 = "在右上角加号菜单添加“全部已读”，重启微信后生效"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L469
        L466:
            r5.V()
        L469:
            sf.n r10 = sf.n.f12433a
            return r10
        L46c:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L47d
            r11 = r1
            goto L47e
        L47d:
            r11 = 0
        L47e:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L494
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "message_forward_favorite_enable"
            java.lang.String r2 = "转发收藏"
            java.lang.String r3 = "长按收藏后显示转发[H]"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L497
        L494:
            r5.V()
        L497:
            sf.n r10 = sf.n.f12433a
            return r10
        L49a:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L4ab
            r11 = r1
            goto L4ac
        L4ab:
            r11 = 0
        L4ac:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L4c2
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "message_text_color_enable"
            java.lang.String r2 = "启用消息文本颜色"
            java.lang.String r3 = "处理聊天里的文本消息和引用消息正文"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L4c5
        L4c2:
            r5.V()
        L4c5:
            sf.n r10 = sf.n.f12433a
            return r10
        L4c8:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L4d9
            r11 = r1
            goto L4da
        L4d9:
            r11 = 0
        L4da:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L4f0
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "hide_wechat_bottom_bar_enable"
            java.lang.String r2 = "隐藏微信底栏"
            java.lang.String r3 = "隐藏底部的微信、通讯录、发现和我"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L4f3
        L4f0:
            r5.V()
        L4f3:
            sf.n r10 = sf.n.f12433a
            return r10
        L4f6:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L507
            r11 = r1
            goto L508
        L507:
            r11 = 0
        L508:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L51e
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "auto_original_image_enable"
            java.lang.String r2 = "自动勾选原图"
            java.lang.String r3 = "进入聊天图片发送界面时自动选择原图"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L521
        L51e:
            r5.V()
        L521:
            sf.n r10 = sf.n.f12433a
            return r10
        L524:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L535
            r11 = r1
            goto L536
        L535:
            r11 = 0
        L536:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L54c
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "remove_forward_limit_enable"
            java.lang.String r2 = "移除转发限制"
            java.lang.String r3 = "允许微信原生转发选择超过 9 个会话；大量目标仍受微信发送能力限制"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L54f
        L54c:
            r5.V()
        L54f:
            sf.n r10 = sf.n.f12433a
            return r10
        L552:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L564
            r11 = r8
            goto L565
        L564:
            r11 = r7
        L565:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L588
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "plus_menu_enable"
            java.lang.String r2 = "注入加号菜单"
            java.lang.String r3 = "在微信右上角加号菜单中显示 Hchat 入口，重启微信后生效"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "plus_long_press_enable"
            java.lang.String r2 = "长按加号入口"
            java.lang.String r3 = "长按微信右上角加号打开 Hchat 设置，重启微信后生效"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L58b
        L588:
            r5.V()
        L58b:
            sf.n r10 = sf.n.f12433a
            return r10
        L58e:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L5a0
            r11 = r8
            goto L5a1
        L5a0:
            r11 = r7
        L5a1:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L5c4
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f17411h
            java.lang.String r1 = "hide_chat_avatar_self"
            java.lang.String r2 = "隐藏自己的头像"
            java.lang.String r3 = "在群聊和私聊中隐藏自己发送消息的头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "hide_chat_avatar_other"
            java.lang.String r2 = "隐藏对方的头像"
            java.lang.String r3 = "在群聊和私聊中隐藏对方发送消息的头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L5c7
        L5c4:
            r5.V()
        L5c7:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
