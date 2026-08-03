package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19962i;

    public /* synthetic */ wh(android.content.SharedPreferences r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f19960g = r3
            r0.f19961h = r1
            r0.f19962i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ wh(i0.a1 r1, android.content.SharedPreferences r2, int r3) {
            r0 = this;
            r0.f19960g = r3
            r0.f19962i = r1
            r0.f19961h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f19960g
            switch(r0) {
                case 0: goto L253;
                case 1: goto L225;
                case 2: goto L21b;
                case 3: goto L211;
                case 4: goto L1f6;
                case 5: goto L1db;
                case 6: goto L1d1;
                case 7: goto L1c7;
                case 8: goto L1b2;
                case 9: goto L1a8;
                case 10: goto L19e;
                case 11: goto L194;
                case 12: goto L18a;
                case 13: goto L175;
                case 14: goto L160;
                case 15: goto L144;
                case 16: goto L119;
                case 17: goto Lee;
                case 18: goto Lc3;
                case 19: goto Lb9;
                case 20: goto La4;
                case 21: goto L8f;
                case 22: goto L63;
                case 23: goto L5a;
                case 24: goto L51;
                case 25: goto L48;
                case 26: goto L3f;
                case 27: goto L2b;
                case 28: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "exclude_keywords_image_text"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
        L18:
            sf.n r5 = sf.n.f12433a
            return r5
        L1b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "keyword_image"
        L23:
            i0.a1 r2 = r4.f19962i
            android.content.SharedPreferences r3 = r4.f19961h
            wb.en.m(r2, r5, r3, r1, r0)
            goto L18
        L2b:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "exclude_keywords_text"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "keyword_text"
            goto L23
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "allow_video"
            goto L23
        L51:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "allow_image"
            goto L23
        L5a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "allow_text"
            goto L23
        L63:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f19962i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L8c
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = 1
            if (r5 >= r1) goto L83
            r5 = r1
        L83:
            java.lang.String r1 = "max_age_hours"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L8c:
            sf.n r5 = sf.n.f12433a
            return r5
        L8f:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "end_time"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        La4:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "start_time"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        Lb9:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "time_window_enable"
            goto L23
        Lc3:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f19962i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto Leb
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto Le2
            r5 = 0
        Le2:
            java.lang.String r1 = "random_max_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        Leb:
            sf.n r5 = sf.n.f12433a
            return r5
        Lee:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f19962i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L116
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto L10d
            r5 = 0
        L10d:
            java.lang.String r1 = "random_min_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L116:
            sf.n r5 = sf.n.f12433a
            return r5
        L119:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f19962i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L141
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto L138
            r5 = 0
        L138:
            java.lang.String r1 = "fixed_delay_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L141:
            sf.n r5 = sf.n.f12433a
            return r5
        L144:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f19962i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f19961h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "delay_mode"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L18
        L160:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "text_speech_quiet_end"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L175:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "text_speech_quiet_start"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L18a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "text_speech_quiet_enable"
            goto L23
        L194:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "text_speech_announce_sender"
            goto L23
        L19e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "text_speech_volume_control"
            goto L23
        L1a8:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "text_speech_play_voice_messages"
            goto L23
        L1b2:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "text_speech_tts_voice"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L18
        L1c7:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "text_speech_enable"
            goto L23
        L1d1:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "log_enable"
            goto L23
        L1db:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r5 = wb.en.b(r5, r0, r5, r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "keyword_notify_quiet_end"
            android.content.SharedPreferences$Editor r5 = r5.putString(r1, r0)
            r5.apply()
            goto L18
        L1f6:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f19962i
            android.content.SharedPreferences r1 = r4.f19961h
            android.content.SharedPreferences$Editor r5 = wb.en.b(r5, r0, r5, r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "keyword_notify_quiet_start"
            android.content.SharedPreferences$Editor r5 = r5.putString(r1, r0)
            r5.apply()
            goto L18
        L211:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "keyword_notify_quiet"
            goto L23
        L21b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "log_enable"
            goto L23
        L225:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            i0.a1 r1 = r4.f19962i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f19961h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "enable"
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r0)
            if (r0 == 0) goto L246
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            goto L248
        L246:
            r0 = 0
        L248:
            java.lang.String r2 = "enabled_at_seconds"
            android.content.SharedPreferences$Editor r5 = r5.putLong(r2, r0)
            r5.apply()
            goto L18
        L253:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "toast"
            goto L23
    }
}
