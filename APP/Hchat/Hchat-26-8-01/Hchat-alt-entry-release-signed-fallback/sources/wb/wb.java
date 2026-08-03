package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19926i;

    public /* synthetic */ wb(android.content.SharedPreferences r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f19924g = r3
            r0.f19925h = r1
            r0.f19926i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ wb(i0.a1 r2, android.content.SharedPreferences r3) {
            r1 = this;
            r0 = 2
            r1.f19924g = r0
            r1.<init>()
            r1.f19926i = r2
            r1.f19925h = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f19924g
            switch(r0) {
                case 0: goto L21c;
                case 1: goto L200;
                case 2: goto L1b9;
                case 3: goto L184;
                case 4: goto L16f;
                case 5: goto L165;
                case 6: goto L15b;
                case 7: goto L151;
                case 8: goto L147;
                case 9: goto L13d;
                case 10: goto L133;
                case 11: goto L129;
                case 12: goto L11f;
                case 13: goto L115;
                case 14: goto L10b;
                case 15: goto Lf6;
                case 16: goto Lec;
                case 17: goto Le2;
                case 18: goto Ld8;
                case 19: goto L97;
                case 20: goto L8e;
                case 21: goto L85;
                case 22: goto L7c;
                case 23: goto L73;
                case 24: goto L6a;
                case 25: goto L61;
                case 26: goto L46;
                case 27: goto L2b;
                case 28: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19926i
            android.content.SharedPreferences r1 = r4.f19925h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "sdk_id"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
        L18:
            sf.n r5 = sf.n.f12433a
            return r5
        L1b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "enable"
        L23:
            i0.a1 r2 = r4.f19926i
            android.content.SharedPreferences r3 = r4.f19925h
            wb.en.m(r2, r5, r3, r1, r0)
            goto L18
        L2b:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f19926i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f19925h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "game_emoji_rps_result"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L18
        L46:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f19926i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f19925h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "game_emoji_dice_result"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L18
        L61:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "show_region"
            goto L23
        L6a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "show_gender"
            goto L23
        L73:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "global_prefix_enable"
            goto L23
        L7c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "message_bubble_separate_dark_mode"
            goto L23
        L85:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "message_bubble_enable"
            goto L23
        L8e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "fake_mini_program_base_lib_enable"
            goto L23
        L97:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            r0 = 10
            java.lang.Integer r0 = og.t.e0(r0, r5)
            r1 = 60
            r2 = 1
            if (r0 == 0) goto Lb6
            int r3 = r0.intValue()
            int r3 = r9.e0.r(r3, r2, r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            if (r3 == 0) goto Lb6
            r5 = r3
        Lb6:
            i0.a1 r3 = r4.f19926i
            r3.setValue(r5)
            if (r0 != 0) goto Lbe
            goto Ld5
        Lbe:
            android.content.SharedPreferences r5 = r4.f19925h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            int r0 = r0.intValue()
            int r0 = r9.e0.r(r0, r2, r1)
            java.lang.String r1 = "fake_voice_duration_seconds"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
        Ld5:
            sf.n r5 = sf.n.f12433a
            return r5
        Ld8:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "fake_voice_duration_enable"
            goto L23
        Le2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "sns_comment_custom_mark_enable"
            goto L23
        Lec:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "sns_custom_mark_enable"
            goto L23
        Lf6:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19926i
            android.content.SharedPreferences r1 = r4.f19925h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "moments_keyword_block_keywords"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L10b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "moments_keyword_block_enable"
            goto L23
        L115:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "round_avatar_enable"
            goto L23
        L11f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "fake_wallet_balance_enable_business"
            goto L23
        L129:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "fake_wallet_balance_enable_lqt"
            goto L23
        L133:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "fake_wallet_balance_enable_balance"
            goto L23
        L13d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "fake_location_enable"
            goto L23
        L147:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "skip_global_mini_program_splash_ads_enable"
            goto L23
        L151:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "skip_mini_program_video_ads_enable"
            goto L23
        L15b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "show_member"
            goto L23
        L165:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "enable"
            goto L23
        L16f:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19926i
            android.content.SharedPreferences r1 = r4.f19925h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "chat_time_format"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L184:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r0 = "custom"
            boolean r1 = r5.equals(r0)
            if (r1 == 0) goto L192
            goto L19d
        L192:
            java.lang.String r0 = "hidden"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L19b
            goto L19d
        L19b:
            java.lang.String r0 = "original"
        L19d:
            i0.a1 r5 = r4.f19926i
            r5.setValue(r0)
            android.content.SharedPreferences r0 = r4.f19925h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "chat_time_mode"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L1b9:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            r0 = 0
            if (r5 == 0) goto L1d4
            int r5 = r5.intValue()
            r1 = 1
            if (r5 >= r1) goto L1cf
            r5 = r1
        L1cf:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L1d5
        L1d4:
            r5 = r0
        L1d5:
            if (r5 == 0) goto L1df
            int r0 = r5.intValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L1df:
            if (r0 != 0) goto L1e3
            java.lang.String r0 = ""
        L1e3:
            i0.a1 r1 = r4.f19926i
            r1.setValue(r0)
            if (r5 == 0) goto L1fd
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f19925h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "fake_like_auto_select_count"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L1fd:
            sf.n r5 = sf.n.f12433a
            return r5
        L200:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            i0.a1 r1 = r4.f19926i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f19925h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "fake_like_auto_select"
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r0)
            r5.commit()
            goto L18
        L21c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            i0.a1 r1 = r4.f19926i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f19925h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "fake_like_random_order"
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r0)
            r5.commit()
            goto L18
    }
}
