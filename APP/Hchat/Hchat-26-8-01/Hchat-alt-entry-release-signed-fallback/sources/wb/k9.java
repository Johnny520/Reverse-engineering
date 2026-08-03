package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k9 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17228j;

    public /* synthetic */ k9(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17225g = r4
            r0.f17226h = r1
            r0.f17227i = r2
            r0.f17228j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ k9(i0.a1 r1, android.content.SharedPreferences r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17225g = r4
            r0.f17227i = r1
            r0.f17226h = r2
            r0.f17228j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r54 = this;
            r0 = r54
            int r1 = r0.f17225g
            switch(r1) {
                case 0: goto L607;
                case 1: goto L5e1;
                case 2: goto L557;
                case 3: goto L52b;
                case 4: goto L3c6;
                case 5: goto L212;
                case 6: goto L1ed;
                default: goto L7;
            }
        L7:
            wb.uq r1 = new wb.uq
            i0.a1 r2 = r0.f17227i
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 + r4
            android.content.SharedPreferences r5 = r0.f17226h
            java.lang.String r6 = "hb_reply_enable"
            r7 = 0
            boolean r6 = r5.getBoolean(r6, r7)
            if (r6 == 0) goto L33
            java.lang.String r6 = "hb_reply_type"
            int r6 = r5.getInt(r6, r4)
            goto L34
        L33:
            r6 = r7
        L34:
            java.util.List r34 = wb.ho.d6(r5)
            java.lang.Object r8 = tf.m.v1(r34)
            na.h r8 = (na.h) r8
            boolean r9 = wb.ho.K6(r6)
            java.lang.String r10 = ""
            if (r9 == 0) goto L5c
            java.lang.String r9 = "hb_reply_text"
            java.lang.String r11 = "谢谢老板"
            java.lang.String r9 = r5.getString(r9, r11)
            if (r9 == 0) goto L51
            goto L52
        L51:
            r9 = r11
        L52:
            java.lang.String r12 = "hb_reply_templates"
            java.lang.String r9 = r5.getString(r12, r9)
            if (r9 == 0) goto L66
            r11 = r9
            goto L66
        L5c:
            java.lang.String r9 = "hb_reply_media_paths"
            java.lang.String r11 = r5.getString(r9, r10)
            if (r11 == 0) goto L65
            goto L66
        L65:
            r11 = r10
        L66:
            na.j r9 = new na.j
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r12 = "_"
            r14.append(r12)
            r14.append(r2)
            java.lang.String r12 = r14.toString()
            java.lang.String r13 = "模板 "
            java.lang.String r2 = eh.a.l(r2, r13)
            java.lang.String r13 = "hb_grab_mode"
            int r13 = r5.getInt(r13, r4)
            r14 = r9
            r9 = r12
            r12 = r13
            int r13 = wb.ho.E6(r5)
            java.lang.String r15 = "hb_auto_delay_value"
            int r15 = r5.getInt(r15, r7)
            if (r15 >= 0) goto L9c
            r15 = r7
        L9c:
            r16 = r2
            java.lang.String r2 = "hb_auto_delay_unit"
            int r2 = r5.getInt(r2, r7)
            r17 = r8
            long r7 = (long) r15
            if (r2 != r4) goto Lad
            r18 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r18
        Lad:
            java.lang.String r15 = "hb_auto_delay_random_min"
            r2 = 500(0x1f4, float:7.0E-43)
            int r2 = r5.getInt(r15, r2)
            if (r2 >= 0) goto Lb8
            r2 = 0
        Lb8:
            r19 = r5
            long r4 = (long) r2
            java.lang.String r2 = "hb_auto_delay_random_max"
            r15 = 3000(0xbb8, float:4.204E-42)
            r21 = r4
            r4 = r19
            int r2 = r4.getInt(r2, r15)
            if (r2 >= 0) goto Lca
            r2 = 0
        Lca:
            r23 = r7
            long r7 = (long) r2
            java.lang.String r2 = "hb_skip_self"
            r5 = 0
            boolean r15 = r4.getBoolean(r2, r5)
            java.lang.String r2 = "hb_kw_mode"
            int r18 = r4.getInt(r2, r5)
            java.lang.String r5 = "hb_keywords"
            java.lang.String r5 = r4.getString(r5, r10)
            if (r5 == 0) goto Le5
            r25 = r5
            goto Le7
        Le5:
            r25 = r10
        Le7:
            if (r17 == 0) goto Lf0
            r5 = r17
            int r2 = r5.f9139b
            r29 = r2
            goto Lfc
        Lf0:
            r5 = r17
            r2 = 2
            if (r6 != r2) goto Lf8
            r20 = 1
            goto Lfa
        Lf8:
            r20 = r6
        Lfa:
            r29 = r20
        Lfc:
            if (r5 == 0) goto L105
            java.lang.String r2 = r5.f9140c
            if (r2 == 0) goto L105
        L102:
            r30 = r2
            goto L10a
        L105:
            java.lang.String r2 = wb.ho.s6(r6, r11)
            goto L102
        L10a:
            r19 = r7
            if (r5 == 0) goto L113
            long r6 = r5.f9141d
        L110:
            r31 = r6
            goto L118
        L113:
            long r6 = wb.ho.H6(r4)
            goto L110
        L118:
            if (r5 == 0) goto L120
            boolean r2 = r5.f9142e
            r5 = 0
        L11d:
            r33 = r2
            goto L128
        L120:
            java.lang.String r2 = "hb_reply_random"
            r5 = 0
            boolean r2 = r4.getBoolean(r2, r5)
            goto L11d
        L128:
            java.util.List r35 = wb.ho.c6(r4)
            java.lang.String r2 = "hb_notify_system_enable"
            boolean r37 = r4.getBoolean(r2, r5)
            java.lang.String r2 = "hb_notify_toast_enable"
            boolean r38 = r4.getBoolean(r2, r5)
            java.lang.String r2 = "hb_notify_sound_enable"
            boolean r39 = r4.getBoolean(r2, r5)
            java.lang.String r2 = "hb_notify_sound_mode"
            int r40 = r4.getInt(r2, r5)
            java.lang.String r2 = "hb_notify_vibrate_enable"
            boolean r41 = r4.getBoolean(r2, r5)
            java.lang.String r5 = "hb_notify_sound_uri"
            java.lang.String r5 = r4.getString(r5, r10)
            if (r5 == 0) goto L155
            r42 = r5
            goto L157
        L155:
            r42 = r10
        L157:
            java.lang.String r5 = "hb_notify_text"
            java.lang.String r6 = "抢到红包 {amount} 元"
            java.lang.String r7 = r4.getString(r5, r6)
            if (r7 == 0) goto L164
            r43 = r7
            goto L166
        L164:
            r43 = r6
        L166:
            java.lang.String r5 = r4.getString(r5, r6)
            if (r5 == 0) goto L16d
            goto L16e
        L16d:
            r5 = r6
        L16e:
            java.lang.String r7 = "hb_notify_toast_text"
            java.lang.String r5 = r4.getString(r7, r5)
            if (r5 == 0) goto L179
            r44 = r5
            goto L17b
        L179:
            r44 = r6
        L17b:
            java.lang.String r5 = "hb_notify_failed_system_enable"
            r2 = 0
            boolean r45 = r4.getBoolean(r5, r2)
            java.lang.String r5 = "hb_notify_failed_toast_enable"
            boolean r46 = r4.getBoolean(r5, r2)
            java.lang.String r5 = "hb_notify_failed_text"
            java.lang.String r7 = "未抢到红包"
            java.lang.String r8 = r4.getString(r5, r7)
            if (r8 == 0) goto L195
            r47 = r8
            goto L197
        L195:
            r47 = r7
        L197:
            java.lang.String r5 = r4.getString(r5, r7)
            if (r5 == 0) goto L19e
            goto L19f
        L19e:
            r5 = r7
        L19f:
            java.lang.String r8 = "hb_notify_failed_toast_text"
            java.lang.String r5 = r4.getString(r8, r5)
            if (r5 == 0) goto L1aa
            r48 = r5
            goto L1ac
        L1aa:
            r48 = r7
        L1ac:
            java.lang.String r5 = "hb_announce_enable"
            r2 = 0
            boolean r49 = r4.getBoolean(r5, r2)
            java.lang.String r5 = "hb_announce_text"
            java.lang.String r4 = r4.getString(r5, r6)
            if (r4 == 0) goto L1be
            r50 = r4
            goto L1c0
        L1be:
            r50 = r6
        L1c0:
            r11 = 0
            r10 = r16
            r16 = r21
            r21 = 0
            java.lang.String r22 = ""
            r8 = r14
            r52 = r19
            r20 = r15
            r14 = r23
            r24 = r18
            r18 = r52
            java.lang.String r23 = ""
            r26 = 0
            r27 = 0
            r28 = 0
            r36 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r2 = 0
            r1.<init>(r3, r8, r2)
            i0.a1 r2 = r0.f17228j
            r2.setValue(r1)
        L1ea:
            sf.n r1 = sf.n.f12433a
            return r1
        L1ed:
            wb.v0 r2 = new wb.v0
            i0.a1 r1 = r0.f17227i
            java.lang.Object r3 = r1.getValue()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            wb.di r7 = new wb.di
            r3 = 18
            android.content.SharedPreferences r4 = r0.f17226h
            r7.<init>(r4, r1, r3)
            r8 = 0
            r9 = 224(0xe0, float:3.14E-43)
            java.lang.String r3 = "选择监听群"
            wb.u0 r4 = wb.u0.f19345h
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            i0.a1 r1 = r0.f17228j
            r1.setValue(r2)
            goto L1ea
        L212:
            wb.c4 r1 = new wb.c4
            i0.a1 r2 = r0.f17227i
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 + r4
            o9.q r5 = new o9.q
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "_"
            r8.append(r6)
            r8.append(r2)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = "模板 "
            java.lang.String r7 = eh.a.l(r2, r7)
            java.lang.String r2 = "group_member_reply_join_enable"
            android.content.SharedPreferences r8 = r0.f17226h
            boolean r9 = r8.getBoolean(r2, r4)
            java.lang.String r2 = "group_member_reply_left_enable"
            boolean r10 = r8.getBoolean(r2, r4)
            java.lang.String r2 = "group_member_reply_prompt_type"
            java.lang.String r4 = "text"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L266
            r11 = r2
            goto L267
        L266:
            r11 = r4
        L267:
            java.lang.String r2 = "group_member_reply_both_order"
            java.lang.String r4 = "text_first"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L273
            r12 = r2
            goto L274
        L273:
            r12 = r4
        L274:
            java.lang.String r2 = "group_member_reply_join_text"
            java.lang.String r4 = "[AtWx=%userWxid%]\n欢迎进群\n时间：%time%\n群昵称：%groupName%\n进群者微信昵称：%userName%\n进群者群内昵称：%groupNickname%\n进群者ID：%userWxid%"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L280
            r13 = r2
            goto L281
        L280:
            r13 = r4
        L281:
            java.lang.String r2 = "group_member_reply_left_text"
            java.lang.String r4 = "退群通知：\n时间：%time%\n群昵称：%groupName%\n退群者微信昵称：%userName%\n退群者群内昵称：%groupNickname%\n退群者ID：%userWxid%"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L28d
            r14 = r2
            goto L28e
        L28d:
            r14 = r4
        L28e:
            java.lang.String r2 = "group_member_reply_join_card_title"
            java.lang.String r4 = "欢迎：%userName%"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L29a
            r15 = r2
            goto L29b
        L29a:
            r15 = r4
        L29b:
            java.lang.String r2 = "group_member_reply_join_card_desc"
            java.lang.String r4 = "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L2a8
            r16 = r2
            goto L2aa
        L2a8:
            r16 = r4
        L2aa:
            java.lang.String r2 = "group_member_reply_left_card_title"
            r17 = r5
            java.lang.String r5 = "离群：%userName%"
            java.lang.String r2 = r8.getString(r2, r5)
            if (r2 == 0) goto L2b7
            r5 = r2
        L2b7:
            java.lang.String r2 = "group_member_reply_left_card_desc"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L2c2
            r18 = r2
            goto L2c4
        L2c2:
            r18 = r4
        L2c4:
            java.lang.String r2 = "group_member_reply_media_order"
            java.lang.String r4 = "none"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L2d1
            r20 = r2
            goto L2d3
        L2d1:
            r20 = r4
        L2d3:
            java.lang.String r2 = "group_member_reply_media_sequence"
            java.lang.String r4 = "image,voice,emoji,video,file,favorite"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 == 0) goto L2e0
            r21 = r2
            goto L2e2
        L2e0:
            r21 = r4
        L2e2:
            java.lang.String r2 = "group_member_reply_join_image_paths"
            java.lang.String r4 = ""
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L2ef
            r22 = r4
            goto L2f1
        L2ef:
            r22 = r2
        L2f1:
            java.lang.String r2 = "group_member_reply_left_image_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L2fc
            r23 = r4
            goto L2fe
        L2fc:
            r23 = r2
        L2fe:
            java.lang.String r2 = "group_member_reply_join_voice_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L309
            r24 = r4
            goto L30b
        L309:
            r24 = r2
        L30b:
            java.lang.String r2 = "group_member_reply_left_voice_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L316
            r25 = r4
            goto L318
        L316:
            r25 = r2
        L318:
            java.lang.String r2 = "group_member_reply_join_emoji_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L323
            r26 = r4
            goto L325
        L323:
            r26 = r2
        L325:
            java.lang.String r2 = "group_member_reply_left_emoji_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L330
            r27 = r4
            goto L332
        L330:
            r27 = r2
        L332:
            java.lang.String r2 = "group_member_reply_join_video_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L33d
            r28 = r4
            goto L33f
        L33d:
            r28 = r2
        L33f:
            java.lang.String r2 = "group_member_reply_left_video_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L34a
            r29 = r4
            goto L34c
        L34a:
            r29 = r2
        L34c:
            java.lang.String r2 = "group_member_reply_join_file_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L357
            r30 = r4
            goto L359
        L357:
            r30 = r2
        L359:
            java.lang.String r2 = "group_member_reply_left_file_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L364
            r31 = r4
            goto L366
        L364:
            r31 = r2
        L366:
            java.lang.String r2 = "group_member_reply_join_favorite_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L371
            r32 = r4
            goto L373
        L371:
            r32 = r2
        L373:
            java.lang.String r2 = "group_member_reply_left_favorite_paths"
            java.lang.String r2 = r8.getString(r2, r4)
            if (r2 != 0) goto L37e
            r33 = r4
            goto L380
        L37e:
            r33 = r2
        L380:
            java.lang.String r2 = "group_member_reply_prompt_delay_ms"
            r4 = 0
            int r35 = r8.getInt(r2, r4)
            java.lang.String r2 = "group_member_reply_image_delay_ms"
            r4 = 100
            int r36 = r8.getInt(r2, r4)
            java.lang.String r2 = "group_member_reply_voice_delay_ms"
            int r37 = r8.getInt(r2, r4)
            java.lang.String r2 = "group_member_reply_emoji_delay_ms"
            int r38 = r8.getInt(r2, r4)
            java.lang.String r2 = "group_member_reply_video_delay_ms"
            int r39 = r8.getInt(r2, r4)
            java.lang.String r2 = "group_member_reply_file_delay_ms"
            int r40 = r8.getInt(r2, r4)
            java.lang.String r2 = "group_member_reply_favorite_delay_ms"
            int r41 = r8.getInt(r2, r4)
            r8 = 1
            java.lang.String r19 = "custom"
            java.lang.String r34 = "custom"
            r52 = r17
            r17 = r5
            r5 = r52
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r2 = 0
            r1.<init>(r3, r5, r2)
            i0.a1 r2 = r0.f17228j
            r2.setValue(r1)
            goto L1ea
        L3c6:
            wb.nu r1 = new wb.nu
            i0.a1 r2 = r0.f17227i
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 + r4
            java.lang.String r5 = "transfer_delay_random_min"
            r6 = 500(0x1f4, double:2.47E-321)
            android.content.SharedPreferences r8 = r0.f17226h
            long r9 = r8.getLong(r5, r6)
            r11 = 0
            r13 = 600000(0x927c0, double:2.964394E-318)
            long r17 = r9.e0.s(r9, r11, r13)
            java.lang.String r5 = "transfer_delay_random_max"
            r6 = 3000(0xbb8, double:1.482E-320)
            long r15 = r8.getLong(r5, r6)
            r19 = 600000(0x927c0, double:2.964394E-318)
            long r24 = r9.e0.s(r15, r17, r19)
            ua.i r15 = new ua.i
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "transfer_"
            r7.<init>(r9)
            r7.append(r5)
            java.lang.String r5 = "_"
            r7.append(r5)
            r7.append(r2)
            java.lang.String r16 = r7.toString()
            java.lang.String r5 = "收款模板 "
            java.lang.String r2 = eh.a.l(r2, r5)
            java.lang.String r5 = "transfer_delay_mode"
            r6 = 2
            int r19 = r8.getInt(r5, r6)
            java.lang.String r5 = "transfer_delay_ms"
            r6 = 0
            long r9 = r8.getLong(r5, r6)
            long r20 = r9.e0.s(r9, r11, r13)
            java.lang.String r5 = "transfer_receive_account"
            java.lang.String r6 = "default"
            java.lang.String r5 = r8.getString(r5, r6)
            if (r5 == 0) goto L444
            r26 = r5
            goto L446
        L444:
            r26 = r6
        L446:
            java.lang.String r5 = "transfer_mode"
            r6 = 0
            int r27 = r8.getInt(r5, r6)
            java.lang.String r5 = "transfer_whitelist"
            java.lang.String r7 = ""
            java.lang.String r5 = r8.getString(r5, r7)
            if (r5 != 0) goto L45a
            r28 = r7
            goto L45c
        L45a:
            r28 = r5
        L45c:
            java.lang.String r5 = "transfer_blacklist"
            java.lang.String r5 = r8.getString(r5, r7)
            if (r5 != 0) goto L467
            r29 = r7
            goto L469
        L467:
            r29 = r5
        L469:
            java.lang.String r5 = "transfer_amount_enable"
            boolean r30 = r8.getBoolean(r5, r6)
            java.lang.String r5 = "transfer_amount_cond"
            int r31 = r8.getInt(r5, r4)
            java.lang.String r4 = "transfer_amount_value"
            java.lang.String r5 = "0"
            java.lang.String r4 = r8.getString(r4, r5)
            if (r4 == 0) goto L482
            r32 = r4
            goto L484
        L482:
            r32 = r5
        L484:
            java.lang.String r4 = "transfer_amount_action"
            int r33 = r8.getInt(r4, r6)
            java.lang.String r4 = "transfer_keyword_mode"
            int r34 = r8.getInt(r4, r6)
            java.lang.String r4 = "transfer_keywords"
            java.lang.String r4 = r8.getString(r4, r7)
            if (r4 != 0) goto L49b
            r35 = r7
            goto L49d
        L49b:
            r35 = r4
        L49d:
            java.lang.String r4 = "transfer_quiet_enable"
            boolean r36 = r8.getBoolean(r4, r6)
            java.lang.String r4 = "transfer_quiet_start_second"
            int r37 = r8.getInt(r4, r6)
            java.lang.String r4 = "transfer_quiet_end_second"
            int r38 = r8.getInt(r4, r6)
            java.lang.String r4 = "transfer_refund_rejected"
            boolean r39 = r8.getBoolean(r4, r6)
            java.util.List r40 = wb.ho.e6(r8)
            java.lang.String r4 = "transfer_notify_system_enable"
            boolean r42 = r8.getBoolean(r4, r6)
            java.lang.String r4 = "transfer_notify_toast_enable"
            boolean r43 = r8.getBoolean(r4, r6)
            java.lang.String r4 = "transfer_notify_sound_enable"
            boolean r44 = r8.getBoolean(r4, r6)
            java.lang.String r4 = "transfer_notify_sound_mode"
            int r45 = r8.getInt(r4, r6)
            java.lang.String r4 = "transfer_notify_vibrate_enable"
            boolean r46 = r8.getBoolean(r4, r6)
            java.lang.String r4 = "transfer_notify_sound_uri"
            java.lang.String r4 = r8.getString(r4, r7)
            if (r4 != 0) goto L4e2
            r47 = r7
            goto L4e4
        L4e2:
            r47 = r4
        L4e4:
            java.lang.String r4 = "transfer_notify_text"
            java.lang.String r5 = "已收款 {amount} 元"
            java.lang.String r4 = r8.getString(r4, r5)
            if (r4 == 0) goto L4f1
            r48 = r4
            goto L4f3
        L4f1:
            r48 = r5
        L4f3:
            java.lang.String r4 = "transfer_notify_toast_text"
            java.lang.String r4 = r8.getString(r4, r5)
            if (r4 == 0) goto L4fe
            r49 = r4
            goto L500
        L4fe:
            r49 = r5
        L500:
            java.lang.String r4 = "transfer_announce_enable"
            boolean r50 = r8.getBoolean(r4, r6)
            java.lang.String r4 = "transfer_announce_text"
            java.lang.String r5 = "收到转账 {amount} 元"
            java.lang.String r4 = r8.getString(r4, r5)
            if (r4 == 0) goto L515
            r51 = r4
        L512:
            r22 = r17
            goto L518
        L515:
            r51 = r5
            goto L512
        L518:
            r18 = 1
            r41 = 1
            r17 = r2
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r1.<init>(r3, r15, r6)
            i0.a1 r2 = r0.f17228j
            r2.setValue(r1)
            goto L1ea
        L52b:
            wb.i4 r1 = new wb.i4
            wb.v0 r2 = new wb.v0
            i0.a1 r3 = r0.f17227i
            java.lang.Object r4 = r3.getValue()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            wb.di r7 = new wb.di
            r4 = 19
            android.content.SharedPreferences r5 = r0.f17226h
            r7.<init>(r5, r3, r4)
            r8 = 0
            r9 = 224(0xe0, float:3.14E-43)
            java.lang.String r3 = "选择改名监听群"
            wb.u0 r4 = wb.u0.f19345h
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r3 = 0
            r1.<init>(r2, r3)
            i0.a1 r2 = r0.f17228j
            r2.setValue(r1)
            goto L1ea
        L557:
            wb.k4 r1 = new wb.k4
            i0.a1 r2 = r0.f17227i
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            int r2 = r2 + 1
            q9.g r4 = new q9.g
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "rename_"
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = "_"
            r7.append(r5)
            r7.append(r2)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "改名模板 "
            java.lang.String r6 = eh.a.l(r2, r6)
            android.content.SharedPreferences r2 = r0.f17226h
            java.lang.String r7 = "group_rename_delay_seconds"
            r14 = 0
            int r8 = r2.getInt(r7, r14)
            java.lang.String r7 = "group_rename_prompt_type"
            java.lang.String r9 = "text"
            java.lang.String r7 = r2.getString(r7, r9)
            if (r7 == 0) goto L5a7
            r9 = r7
        L5a7:
            java.lang.String r7 = "group_rename_both_order"
            java.lang.String r10 = "text_first"
            java.lang.String r7 = r2.getString(r7, r10)
            if (r7 == 0) goto L5b2
            r10 = r7
        L5b2:
            java.lang.String r7 = "group_rename_text"
            java.lang.String r11 = "%userName% 将群内昵称从“%oldGroupNickname%”修改为“%newGroupNickname%”"
            java.lang.String r7 = r2.getString(r7, r11)
            if (r7 == 0) goto L5bd
            r11 = r7
        L5bd:
            java.lang.String r7 = "group_rename_card_title"
            java.lang.String r12 = "%userName% 修改了群内昵称"
            java.lang.String r7 = r2.getString(r7, r12)
            if (r7 == 0) goto L5c8
            r12 = r7
        L5c8:
            java.lang.String r7 = "group_rename_card_desc"
            java.lang.String r13 = "旧昵称：%oldGroupNickname%\n新昵称：%newGroupNickname%\n时间：%time%"
            java.lang.String r2 = r2.getString(r7, r13)
            if (r2 == 0) goto L5d3
            r13 = r2
        L5d3:
            r7 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.<init>(r3, r4, r14)
            i0.a1 r2 = r0.f17228j
            r2.setValue(r1)
            goto L1ea
        L5e1:
            java.lang.String r1 = "last_time"
            r2 = 0
            android.content.SharedPreferences r4 = r0.f17226h
            long r1 = r4.getLong(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            i0.a1 r2 = r0.f17227i
            r2.setValue(r1)
            java.lang.String r1 = "last_result"
            java.lang.String r2 = ""
            java.lang.String r1 = r4.getString(r1, r2)
            if (r1 != 0) goto L5ff
            goto L600
        L5ff:
            r2 = r1
        L600:
            i0.a1 r1 = r0.f17228j
            r1.setValue(r2)
            goto L1ea
        L607:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "zombie_check_auto_delete"
            i0.a1 r3 = r0.f17227i
            android.content.SharedPreferences r4 = r0.f17226h
            r5 = 1
            wb.en.m(r3, r1, r4, r2, r5)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.a1 r2 = r0.f17228j
            r2.setValue(r1)
            goto L1ea
    }
}
