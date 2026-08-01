package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3280;

    public /* synthetic */ dt1(int r1) {
            r0 = this;
            r0.f3280 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r12 = r12.f3280
            java.lang.String r0 = "host_long_press_speed"
            r1 = 100
            r2 = 1
            s62 r3 = p000.s62.f9751
            r4 = 0
            switch(r12) {
                case 0: goto L2aa;
                case 1: goto L2a1;
                case 2: goto L293;
                case 3: goto L281;
                case 4: goto L26f;
                case 5: goto L266;
                case 6: goto L245;
                case 7: goto L234;
                case 8: goto L226;
                case 9: goto L218;
                case 10: goto L20a;
                case 11: goto L1f8;
                case 12: goto L1c1;
                case 13: goto L1b3;
                case 14: goto L1a1;
                case 15: goto L198;
                case 16: goto L186;
                case 17: goto L17d;
                case 18: goto L16f;
                case 19: goto L166;
                case 20: goto L154;
                case 21: goto L120;
                case 22: goto L106;
                case 23: goto Lfd;
                case 24: goto Lf4;
                case 25: goto Lda;
                case 26: goto Ld1;
                case 27: goto Lc8;
                case 28: goto Lac;
                default: goto Ld;
            }
        Ld:
            r6 = r13
            th0 r6 = (p000.th0) r6
            r6.getClass()
            java.lang.String r12 = r6.f10373
            long r0 = r6.f10375
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = r6.f10378
            java.lang.String r7 = p000.bv1.m1035(r13)
            boolean r2 = p000.q02.m4671(r7)
            if (r2 == 0) goto L28
            r12 = 0
            goto Lab
        L28:
            java.lang.String r8 = r6.m5712()
            java.lang.String r2 = r6.f10377
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto L36
            r9 = r13
            goto L37
        L36:
            r9 = r2
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r3 = " # "
            r2.append(r3)
            boolean r3 = p000.q02.m4671(r8)
            r4 = 0
            if (r3 == 0) goto L61
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L57
            java.lang.String r12 = "UID: "
            java.lang.String r12 = p000.AbstractC0602nx.m4126(r0, r12)
            goto L62
        L57:
            boolean r3 = p000.q02.m4671(r12)
            if (r3 != 0) goto L5e
            goto L62
        L5e:
            java.lang.String r12 = "未知会话"
            goto L62
        L61:
            r12 = r8
        L62:
            r2.append(r12)
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L71
            java.lang.String r3 = " UID:"
            r2.append(r3)
            r2.append(r0)
        L71:
            java.lang.String r11 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r3 = 32
            r2.append(r3)
            r2.append(r9)
            r2.append(r3)
            java.lang.String r4 = r6.f10379
            r2.append(r4)
            r2.append(r3)
            r2.append(r13)
            r2.append(r3)
            if (r12 <= 0) goto L9b
            r2.append(r0)
        L9b:
            java.lang.String r12 = r2.toString()
            java.util.Locale r13 = java.util.Locale.US
            java.lang.String r10 = p000.AbstractC0602nx.m4134(r13, r12, r13)
            lu1 r5 = new lu1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12 = r5
        Lab:
            return r12
        Lac:
            android.app.Activity r13 = (android.app.Activity) r13
            r13.getClass()
            java.lang.String r12 = "profile_uid_show_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 != 0) goto Lc3
            java.lang.String r12 = "profile_bookmark_show_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 == 0) goto Lc2
            goto Lc3
        Lc2:
            r2 = r4
        Lc3:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        Lc8:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "immersive_status_bar_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        Ld1:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "liquid_glass_bottom_bar_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        Lda:
            android.app.Activity r13 = (android.app.Activity) r13
            r13.getClass()
            java.lang.String r12 = "comment_audio_download_trigger_mode"
            android.content.SharedPreferences r13 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lea
            int r12 = r13.getInt(r12, r2)     // Catch: java.lang.Throwable -> Lea
            goto Leb
        Lea:
            r12 = r2
        Leb:
            if (r12 == r2) goto Lee
            goto Lef
        Lee:
            r2 = r4
        Lef:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        Lf4:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "comment_image_watermark_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        Lfd:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "precise_time_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        L106:
            android.app.Activity r13 = (android.app.Activity) r13
            r13.getClass()
            java.lang.String r12 = "comment_bg_mode"
            android.content.SharedPreferences r13 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L116
            int r12 = r13.getInt(r12, r4)     // Catch: java.lang.Throwable -> L116
            goto L117
        L116:
            r12 = r4
        L117:
            if (r12 == 0) goto L11a
            goto L11b
        L11a:
            r2 = r4
        L11b:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L120:
            android.app.Activity r13 = (android.app.Activity) r13
            r13.getClass()
            java.lang.String r12 = "force_legacy_comment_panel_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 != 0) goto L14f
            java.lang.String r12 = "hide_comment_input_bar_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 != 0) goto L14f
            java.lang.String r12 = "hide_comment_related_search_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 != 0) goto L14f
            java.lang.String r12 = "hide_comment_keyboard_entrance_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 != 0) goto L14f
            java.lang.String r12 = "hide_comment_search_entry_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 == 0) goto L14e
            goto L14f
        L14e:
            r2 = r4
        L14f:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L154:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            java.lang.Object r13 = p000.ui1.f10844
            java.lang.String r13 = "download_top_notification_alpha"
            int r12 = p000.j81.m2906(r12, r4, r1)
            p000.ui1.m5873(r13, r12)
            return r3
        L166:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "comment_control_custom_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        L16f:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "comment_bg_image_alpha"
            p000.ui1.m5873(r13, r12)
            return r3
        L17d:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "live_room_audience_exact_count_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        L186:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            if (r12 >= r2) goto L191
            goto L192
        L191:
            r2 = r12
        L192:
            java.lang.String r12 = "video_length_alert_minutes"
            p000.ui1.m5873(r12, r2)
            return r3
        L198:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "feed_follow_confirm_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        L1a1:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            if (r12 >= r2) goto L1ac
            goto L1ad
        L1ac:
            r2 = r12
        L1ad:
            java.lang.String r12 = "duration_alert_minutes"
            p000.ui1.m5873(r12, r2)
            return r3
        L1b3:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "group_apply_auto_approval_interval_seconds"
            p000.ui1.m5873(r13, r12)
            return r3
        L1c1:
            android.app.Activity r13 = (android.app.Activity) r13
            r13.getClass()
            bv1 r12 = p000.bv1.f1853
            java.util.List r12 = p000.bv1.m1077()
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L1d3
            goto L1f2
        L1d3:
            java.util.Iterator r12 = r12.iterator()
        L1d7:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1f2
            java.lang.Object r13 = r12.next()
            ku1 r13 = (p000.ku1) r13
            java.lang.String r13 = r13.f6118
            java.lang.String r0 = "feed_right_control_hide_"
            java.lang.String r13 = r0.concat(r13)
            boolean r13 = p000.ui1.m5887(r13, r4)
            if (r13 == 0) goto L1d7
            goto L1f3
        L1f2:
            r2 = r4
        L1f3:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L1f8:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            if (r12 >= r2) goto L203
            goto L204
        L203:
            r2 = r12
        L204:
            java.lang.String r12 = "im_auto_read_interval_minutes"
            p000.ui1.m5873(r12, r2)
            return r3
        L20a:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "filter_min_digg"
            p000.ui1.m5873(r13, r12)
            return r3
        L218:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "filter_max_duration_sec"
            p000.ui1.m5873(r13, r12)
            return r3
        L226:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "filter_min_duration_sec"
            p000.ui1.m5873(r13, r12)
            return r3
        L234:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            r13 = 5
            int r12 = p000.j81.m2906(r12, r2, r13)
            p000.ui1.m5873(r0, r12)
            return r3
        L245:
            android.app.Activity r13 = (android.app.Activity) r13
            r13.getClass()
            java.lang.String r12 = "offline_cache_count_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            java.lang.String r13 = "offline_cache_count"
            android.content.SharedPreferences r0 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L25a
            int r1 = r0.getInt(r13, r1)     // Catch: java.lang.Throwable -> L25a
        L25a:
            r13 = 10
            r0 = 500(0x1f4, float:7.0E-43)
            p000.j81.m2906(r1, r13, r0)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L266:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "feed_enable_preload"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        L26f:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "profile_video_comment_bar_alpha"
            int r12 = p000.j81.m2906(r12, r4, r1)
            p000.ui1.m5873(r13, r12)
            return r3
        L281:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "profile_video_search_alpha"
            int r12 = p000.j81.m2906(r12, r4, r1)
            p000.ui1.m5873(r13, r12)
            return r3
        L293:
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            bv1 r13 = p000.bv1.f1853
            java.lang.String r13 = "info_bar_text_size"
            p000.ui1.m5873(r13, r12)
            return r3
        L2a1:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r12 = "feed_double_tap_like_block_enabled"
            java.lang.Boolean r12 = p000.AbstractC0602nx.m4124(r13, r12, r4)
            return r12
        L2aa:
            android.app.Activity r13 = (android.app.Activity) r13
            r13.getClass()
            java.lang.String r12 = "video_speed_hook_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            if (r12 != 0) goto L2c6
            r12 = 2
            android.content.SharedPreferences r13 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2c1
            int r13 = r13.getInt(r0, r12)     // Catch: java.lang.Throwable -> L2c1
            goto L2c2
        L2c1:
            r13 = r12
        L2c2:
            if (r13 == r12) goto L2c5
            goto L2c6
        L2c5:
            r2 = r4
        L2c6:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
    }
}
