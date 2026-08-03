package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.List f17594a = null;

    static {
            java.lang.String r60 = "Hchat_real_name_tail_config"
            java.lang.String r61 = "Hchat_group_nickname_color_config"
            java.lang.String r1 = "Hchat_miuix_ui"
            java.lang.String r2 = "Hchat_call_media_limit_config"
            java.lang.String r3 = "Hchat_fake_location_config"
            java.lang.String r4 = "Hchat_finder_media_download"
            java.lang.String r5 = "Hchat_extra_config"
            java.lang.String r6 = "Hchat_status_text_limit_config"
            java.lang.String r7 = "Hchat_edit_message_config"
            java.lang.String r8 = "Hchat_disable_hot_update_config"
            java.lang.String r9 = "Hchat_remove_moments_ads_config"
            java.lang.String r10 = "Hchat_moments_auto_comment_config"
            java.lang.String r11 = "Hchat_moments_auto_like_config"
            java.lang.String r12 = "Hchat_moments_auto_forward_config"
            java.lang.String r13 = "Hchat_moments_auto_refresh_config"
            java.lang.String r14 = "Hchat_moments_bottom_detail_config"
            java.lang.String r15 = "Hchat_moments_post_notification_config"
            java.lang.String r16 = "Hchat_moments_fake_interaction_config"
            java.lang.String r17 = "Hchat_profile_id_config"
            java.lang.String r18 = "settings_entry"
            java.lang.String r19 = "floating_shortcut_menu"
            java.lang.String r20 = "Hchat_quick_mark_read_config"
            java.lang.String r21 = "Hchat_custom_notification"
            java.lang.String r22 = "Hchat_conversation_groups"
            java.lang.String r23 = "Hchat_auto_reply_config"
            java.lang.String r24 = "Hchat_message_affix_config"
            java.lang.String r25 = "Hchat_auto_original_image_config"
            java.lang.String r26 = "Hchat_auto_view_original_config"
            java.lang.String r27 = "Hchat_block_at_all_notification_config"
            java.lang.String r28 = "Hchat_keyword_notification_config"
            java.lang.String r29 = "Hchat_text_speech_config"
            java.lang.String r30 = "Hchat_text_voice_config"
            java.lang.String r31 = "Hchat_zombie_check_config"
            java.lang.String r32 = "Hchat_wechat_keep_alive_config"
            java.lang.String r33 = "Hchat_quote_delete_clear_config"
            java.lang.String r34 = "Hchat_chat_time_style_config"
            java.lang.String r35 = "Hchat_emoji_save_config"
            java.lang.String r36 = "Hchat_swipe_quote_config"
            java.lang.String r37 = "Hchat_audio_transform_config"
            java.lang.String r38 = "Hchat_fake_voice_duration_config"
            java.lang.String r39 = "Hchat_message_bubble_config"
            java.lang.String r40 = "Hchat_message_text_color_config"
            java.lang.String r41 = "Hchat_hide_chat_avatar_config"
            java.lang.String r42 = "Hchat_hide_chat_menu_config"
            java.lang.String r43 = "Hchat_quick_contact_edit_config"
            java.lang.String r44 = "Hchat_round_avatar_config"
            java.lang.String r45 = "Hchat_custom_friend_avatar_config"
            java.lang.String r46 = "Hchat_message_block_config"
            java.lang.String r47 = "Hchat_group_leave_monitor_config"
            java.lang.String r48 = "Hchat_group_rename_monitor_config"
            java.lang.String r49 = "Hchat_multi_recall_config"
            java.lang.String r50 = "Hchat_voice_forward_config"
            java.lang.String r51 = "Hchat_fake_scan_camera_config"
            java.lang.String r52 = "Hchat_redpacket_config"
            java.lang.String r53 = "Hchat_anti_recall_config"
            java.lang.String r54 = "Hchat_protobuf_packet_config"
            java.lang.String r55 = "Hchat_script_plugin_config"
            java.lang.String r56 = "Hchat_wechat_tablet_config"
            java.lang.String r57 = "Hchat_transfer_config"
            java.lang.String r58 = "Hchat_fake_wallet_balance_config"
            java.lang.String r59 = "Hchat_member_title_config"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61}
            java.util.List r0 = a.a.y0(r0)
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            wb.m4.f17594a = r0
            return
    }

    public static boolean a(android.content.SharedPreferences.Editor r7, java.lang.String r8, org.json.JSONObject r9) {
            r0 = 0
            java.lang.String r1 = "type"
            java.lang.String r1 = r9.optString(r1)     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L9c
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L9c
            r3 = 1
            java.lang.String r4 = ""
            java.lang.String r5 = "value"
            switch(r2) {
                case -1572742348: goto L6f;
                case -891985903: goto L5e;
                case 104431: goto L4d;
                case 3327612: goto L3c;
                case 64711720: goto L2a;
                case 97526364: goto L17;
                default: goto L15;
            }
        L15:
            goto L9c
        L17:
            java.lang.String r2 = "float"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L21
            goto L9c
        L21:
            double r1 = r9.optDouble(r5)     // Catch: java.lang.Throwable -> L9c
            float r9 = (float) r1     // Catch: java.lang.Throwable -> L9c
            r7.putFloat(r8, r9)     // Catch: java.lang.Throwable -> L9c
            return r3
        L2a:
            java.lang.String r2 = "boolean"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L34
            goto L9c
        L34:
            boolean r9 = r9.optBoolean(r5)     // Catch: java.lang.Throwable -> L9c
            r7.putBoolean(r8, r9)     // Catch: java.lang.Throwable -> L9c
            return r3
        L3c:
            java.lang.String r2 = "long"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L45
            goto L9c
        L45:
            long r1 = r9.optLong(r5)     // Catch: java.lang.Throwable -> L9c
            r7.putLong(r8, r1)     // Catch: java.lang.Throwable -> L9c
            return r3
        L4d:
            java.lang.String r2 = "int"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L56
            goto L9c
        L56:
            int r9 = r9.optInt(r5)     // Catch: java.lang.Throwable -> L9c
            r7.putInt(r8, r9)     // Catch: java.lang.Throwable -> L9c
            return r3
        L5e:
            java.lang.String r2 = "string"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L67
            goto L9c
        L67:
            java.lang.String r9 = r9.optString(r5, r4)     // Catch: java.lang.Throwable -> L9c
            r7.putString(r8, r9)     // Catch: java.lang.Throwable -> L9c
            return r3
        L6f:
            java.lang.String r2 = "string_set"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L78
            goto L9c
        L78:
            org.json.JSONArray r9 = r9.optJSONArray(r5)     // Catch: java.lang.Throwable -> L9c
            if (r9 != 0) goto L81
            tf.v r9 = tf.v.f13169g     // Catch: java.lang.Throwable -> L9c
            goto L8e
        L81:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            int r2 = r9.length()     // Catch: java.lang.Throwable -> L9c
            r5 = r0
        L8b:
            if (r5 < r2) goto L92
            r9 = r1
        L8e:
            r7.putStringSet(r8, r9)     // Catch: java.lang.Throwable -> L9c
            return r3
        L92:
            java.lang.String r6 = r9.optString(r5, r4)     // Catch: java.lang.Throwable -> L9c
            r1.add(r6)     // Catch: java.lang.Throwable -> L9c
            int r5 = r5 + 1
            goto L8b
        L9c:
            return r0
    }

    public static org.json.JSONObject b(java.lang.Object r6) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r6 instanceof java.lang.Boolean
            java.lang.String r2 = "value"
            java.lang.String r3 = "type"
            if (r1 == 0) goto L1c
            java.lang.String r1 = "boolean"
            r0.put(r3, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.put(r2, r6)
            return r0
        L1c:
            boolean r1 = r6 instanceof java.lang.Integer
            if (r1 == 0) goto L2f
            java.lang.String r1 = "int"
            r0.put(r3, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.put(r2, r6)
            return r0
        L2f:
            boolean r1 = r6 instanceof java.lang.Long
            if (r1 == 0) goto L42
            java.lang.String r1 = "long"
            r0.put(r3, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            r0.put(r2, r3)
            return r0
        L42:
            boolean r1 = r6 instanceof java.lang.Float
            if (r1 == 0) goto L56
            java.lang.String r1 = "float"
            r0.put(r3, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            double r3 = (double) r6
            r0.put(r2, r3)
            return r0
        L56:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L63
            java.lang.String r1 = "string"
            r0.put(r3, r1)
            r0.put(r2, r6)
            return r0
        L63:
            boolean r1 = r6 instanceof java.util.Set
            if (r1 == 0) goto La6
            java.lang.String r1 = "string_set"
            r0.put(r3, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        L7c:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r6.next()
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L7c
            r3.add(r4)
            goto L7c
        L8e:
            java.util.Iterator r6 = r3.iterator()
        L92:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto La2
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r3)
            goto L92
        La2:
            r0.put(r2, r1)
            return r0
        La6:
            r6 = 0
            return r6
    }
}
