package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class me implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f17680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17681i;

    public /* synthetic */ me(android.content.SharedPreferences r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f17679g = r3
            r0.f17680h = r1
            r0.f17681i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ me(i0.a1 r2, android.content.SharedPreferences r3) {
            r1 = this;
            r0 = 3
            r1.f17679g = r0
            r1.<init>()
            r1.f17681i = r2
            r1.f17680h = r3
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f17679g
            switch(r0) {
                case 0: goto L1e3;
                case 1: goto L1d9;
                case 2: goto L1cf;
                case 3: goto L1a4;
                case 4: goto L19a;
                case 5: goto L185;
                case 6: goto L170;
                case 7: goto L154;
                case 8: goto L14a;
                case 9: goto L12e;
                case 10: goto L112;
                case 11: goto Lf6;
                case 12: goto Lec;
                case 13: goto Le2;
                case 14: goto Ld8;
                case 15: goto Lce;
                case 16: goto Lc4;
                case 17: goto Lba;
                case 18: goto Lb0;
                case 19: goto La6;
                case 20: goto L9c;
                case 21: goto L93;
                case 22: goto L8a;
                case 23: goto L70;
                case 24: goto L5c;
                case 25: goto L48;
                case 26: goto L3f;
                case 27: goto L2b;
                case 28: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17681i
            android.content.SharedPreferences r1 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "exclude_keywords"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
        L18:
            sf.n r5 = sf.n.f12433a
            return r5
        L1b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "exclude_keywords_enable"
        L23:
            i0.a1 r2 = r4.f17681i
            android.content.SharedPreferences r3 = r4.f17680h
            wb.en.m(r2, r5, r3, r1, r0)
            goto L18
        L2b:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17681i
            android.content.SharedPreferences r1 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "include_keywords"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "include_keywords_enable"
            goto L23
        L48:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17681i
            android.content.SharedPreferences r1 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "display_mode"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L5c:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17681i
            android.content.SharedPreferences r1 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "scope"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L70:
            java.util.Set r5 = (java.util.Set) r5
            r5.getClass()
            i0.a1 r0 = r4.f17681i
            r0.setValue(r5)
            android.content.SharedPreferences r0 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "fake_like_excluded_ids"
            android.content.SharedPreferences$Editor r5 = r0.putStringSet(r1, r5)
            r5.commit()
            goto L18
        L8a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_notify_failed_system_enable"
            goto L23
        L93:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_announce_enable"
            goto L23
        L9c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_notify_sound_enable"
            goto L23
        La6:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_notify_toast_enable"
            goto L23
        Lb0:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_notify_failed_toast_enable"
            goto L23
        Lba:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_notify_system_enable"
            goto L23
        Lc4:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_wish_enable"
            goto L23
        Lce:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "enable"
            goto L23
        Ld8:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "group_invite_detail_enable"
            goto L23
        Le2:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "group_leave_monitor_enable"
            goto L23
        Lec:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "hb_reply_enable"
            goto L23
        Lf6:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f17681i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f17680h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "transfer_keyword_mode"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L18
        L112:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f17681i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f17680h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "transfer_amount_action"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L18
        L12e:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f17681i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f17680h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "transfer_amount_cond"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L18
        L14a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "transfer_amount_enable"
            goto L23
        L154:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f17681i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f17680h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "transfer_mode"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L18
        L170:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17681i
            android.content.SharedPreferences r1 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "end_time"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L185:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17681i
            android.content.SharedPreferences r1 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "start_time"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L19a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "time_window_enable"
            goto L23
        L1a4:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f17681i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L1cc
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto L1c3
            r5 = 0
        L1c3:
            java.lang.String r1 = "interval_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L1cc:
            sf.n r5 = sf.n.f12433a
            return r5
        L1cf:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "enable"
            goto L23
        L1d9:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "floating_nav"
            goto L23
        L1e3:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f17681i
            android.content.SharedPreferences r1 = r4.f17680h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "sdk_app_name"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
    }
}
