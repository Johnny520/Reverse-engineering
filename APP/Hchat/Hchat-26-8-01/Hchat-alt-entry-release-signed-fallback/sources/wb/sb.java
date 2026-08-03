package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19049h;

    public /* synthetic */ sb(android.content.SharedPreferences r1, int r2) {
            r0 = this;
            r2 = 4
            r0.f19048g = r2
            r0.<init>()
            r0.f19049h = r1
            return
    }

    public /* synthetic */ sb(android.content.SharedPreferences r1, int r2, byte r3) {
            r0 = this;
            r0.f19048g = r2
            r0.f19049h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f19048g
            switch(r0) {
                case 0: goto L25b;
                case 1: goto L22d;
                case 2: goto L1f1;
                case 3: goto L16d;
                case 4: goto L159;
                case 5: goto L12b;
                case 6: goto Lfd;
                case 7: goto L79;
                case 8: goto L3d;
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
            if (r10 == 0) goto L37
            r5 = 1
            r7 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r1 = r9.f19049h
            java.lang.String r2 = "selected_messages_enable"
            java.lang.String r3 = "群发助手"
            java.lang.String r4 = "在多选消息菜单中显示群发助手[H]和定时转发[H]"
            wb.ho.O3(r1, r2, r3, r4, r5, r6, r7)
            r5 = 0
            java.lang.String r2 = "selected_messages_background_silent_send"
            java.lang.String r3 = "后台静默发送"
            java.lang.String r4 = "群发时不显示发送进度窗口"
            wb.ho.O3(r1, r2, r3, r4, r5, r6, r7)
            goto L3a
        L37:
            r6.V()
        L3a:
            sf.n r10 = sf.n.f12433a
            return r10
        L3d:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L4f
            r11 = r8
            goto L50
        L4f:
            r11 = r7
        L50:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L73
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f19049h
            java.lang.String r1 = "hb_fake_packet_enable"
            java.lang.String r2 = "开启假红包"
            java.lang.String r3 = "发送假红包时修正请求和响应"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "hb_fake_packet_receive_enable"
            java.lang.String r2 = "领取假红包"
            java.lang.String r3 = "收到异常群 ID 红包时尝试修正"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L76
        L73:
            r5.V()
        L76:
            sf.n r10 = sf.n.f12433a
            return r10
        L79:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L8b
            r11 = r8
            goto L8c
        L8b:
            r11 = r7
        L8c:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto Lf7
            r4 = 1
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f19049h
            java.lang.String r1 = "scope_chat"
            java.lang.String r2 = "聊天消息"
            java.lang.String r3 = "替换群聊和私聊消息头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "scope_conversation"
            java.lang.String r2 = "会话列表"
            java.lang.String r3 = "替换微信首页的好友头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "scope_contacts"
            java.lang.String r2 = "通讯录"
            java.lang.String r3 = "替换通讯录中的好友头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "scope_profile"
            java.lang.String r2 = "好友资料页"
            java.lang.String r3 = "替换好友资料页中的头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "scope_moments"
            java.lang.String r2 = "朋友圈"
            java.lang.String r3 = "替换朋友圈中的好友头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "scope_other_ui"
            java.lang.String r2 = "其他微信界面"
            java.lang.String r3 = "替换收藏、搜索等界面中的好友头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "scope_notifications"
            java.lang.String r2 = "消息通知"
            java.lang.String r3 = "替换微信原生通知和 Hchat 通知中的好友头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "scope_moments_notifications"
            java.lang.String r2 = "朋友圈通知"
            java.lang.String r3 = "替换朋友圈发布通知中的好友头像"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto Lfa
        Lf7:
            r5.V()
        Lfa:
            sf.n r10 = sf.n.f12433a
            return r10
        Lfd:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L10e
            r11 = r1
            goto L10f
        L10e:
            r11 = 0
        L10f:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L125
            r4 = 1
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f19049h
            java.lang.String r1 = "conversation_menu"
            java.lang.String r2 = "会话列表长按菜单"
            java.lang.String r3 = "长按好友会话时显示设置头像入口"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L128
        L125:
            r5.V()
        L128:
            sf.n r10 = sf.n.f12433a
            return r10
        L12b:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L13c
            r11 = r1
            goto L13d
        L13c:
            r11 = 0
        L13d:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L153
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f19049h
            java.lang.String r1 = "message_block_enable"
            java.lang.String r2 = "启用屏蔽消息"
            java.lang.String r3 = "总开关开启后，仅命中启用模板的新消息会被拦截"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L156
        L153:
            r5.V()
        L156:
            sf.n r10 = sf.n.f12433a
            return r10
        L159:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r11 = 1
            int r11 = i0.r.C(r11)
            android.content.SharedPreferences r0 = r9.f19049h
            wb.ho.L3(r0, r10, r11)
            sf.n r10 = sf.n.f12433a
            return r10
        L16d:
            r3 = r10
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r6 = 1
            r7 = 0
            if (r11 == r0) goto L17f
            r11 = r6
            goto L180
        L17f:
            r11 = r7
        L180:
            r10 = r10 & r6
            boolean r10 = r3.S(r10, r11)
            if (r10 == 0) goto L1eb
            java.lang.String r10 = "hb_stats_count"
            android.content.SharedPreferences r11 = r9.f19049h
            int r10 = r11.getInt(r10, r7)
            java.lang.String r8 = " 个"
            java.lang.String r1 = p.a.i(r10, r8)
            r4 = 6
            r5 = 4
            java.lang.String r0 = "已抢红包"
            r2 = 0
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            r10 = 0
            wb.ho.D1(r10, r3, r7, r6)
            java.lang.String r0 = "hb_stats_amount"
            int r0 = r11.getInt(r0, r7)
            double r0 = (double) r0
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r1 = "%.2f 元"
            java.lang.String r1 = java.lang.String.format(r1, r0)
            r4 = 6
            r5 = 4
            java.lang.String r0 = "累计金额"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r10, r3, r7, r6)
            java.lang.String r0 = "hb_stats_today"
            int r0 = r11.getInt(r0, r7)
            java.lang.String r1 = p.a.i(r0, r8)
            java.lang.String r0 = "今日抢到"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            wb.ho.D1(r10, r3, r7, r6)
            java.lang.String r10 = "hb_stats_failed"
            int r10 = r11.getInt(r10, r7)
            java.lang.String r11 = " 次"
            java.lang.String r1 = p.a.i(r10, r11)
            java.lang.String r0 = "失败次数"
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            goto L1ee
        L1eb:
            r3.V()
        L1ee:
            sf.n r10 = sf.n.f12433a
            return r10
        L1f1:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L203
            r11 = r8
            goto L204
        L203:
            r11 = r7
        L204:
            r10 = r10 & r8
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L227
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f19049h
            java.lang.String r1 = "call_block_incoming_ringtone"
            java.lang.String r2 = "屏蔽通话呼入铃声"
            java.lang.String r3 = "收到微信语音或视频通话时不播放来电铃声"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r5, r7, r8)
            java.lang.String r1 = "call_block_outgoing_ringtone"
            java.lang.String r2 = "屏蔽通话呼出铃声"
            java.lang.String r3 = "拨打微信语音或视频通话时不播放等待铃声"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L22a
        L227:
            r5.V()
        L22a:
            sf.n r10 = sf.n.f12433a
            return r10
        L22d:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L23e
            r11 = r1
            goto L23f
        L23e:
            r11 = 0
        L23f:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L255
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f19049h
            java.lang.String r1 = "auto_view_original_enable"
            java.lang.String r2 = "自动查看原图"
            java.lang.String r3 = "打开聊天图片或视频时自动查看原图或原视频"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L258
        L255:
            r5.V()
        L258:
            sf.n r10 = sf.n.f12433a
            return r10
        L25b:
            r5 = r10
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r1 = 1
            if (r11 == r0) goto L26c
            r11 = r1
            goto L26d
        L26c:
            r11 = 0
        L26d:
            r10 = r10 & r1
            boolean r10 = r5.S(r10, r11)
            if (r10 == 0) goto L283
            r4 = 0
            r6 = 28080(0x6db0, float:3.9348E-41)
            android.content.SharedPreferences r0 = r9.f19049h
            java.lang.String r1 = "original_moments_upload_enable"
            java.lang.String r2 = "原图上传"
            java.lang.String r3 = "发布朋友圈图片和视频时尽量跳过微信压缩"
            wb.ho.O3(r0, r1, r2, r3, r4, r5, r6)
            goto L286
        L283:
            r5.V()
        L286:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
