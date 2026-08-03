package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f18650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18651i;

    public /* synthetic */ qg(android.content.SharedPreferences r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f18649g = r3
            r0.f18650h = r1
            r0.f18651i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ qg(i0.a1 r1, android.content.SharedPreferences r2, int r3) {
            r0 = this;
            r0.f18649g = r3
            r0.f18651i = r1
            r0.f18650h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f18649g
            switch(r0) {
                case 0: goto L2b0;
                case 1: goto L2a6;
                case 2: goto L29c;
                case 3: goto L292;
                case 4: goto L288;
                case 5: goto L273;
                case 6: goto L25e;
                case 7: goto L249;
                case 8: goto L22d;
                case 9: goto L202;
                case 10: goto L1d7;
                case 11: goto L1ac;
                case 12: goto L181;
                case 13: goto L177;
                case 14: goto L16d;
                case 15: goto L158;
                case 16: goto L14e;
                case 17: goto L131;
                case 18: goto L127;
                case 19: goto L10b;
                case 20: goto L101;
                case 21: goto Lf7;
                case 22: goto Ldb;
                case 23: goto Lb0;
                case 24: goto L94;
                case 25: goto L79;
                case 26: goto L5e;
                case 27: goto L44;
                case 28: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "system_notification"
        Ld:
            i0.a1 r2 = r4.f18651i
            android.content.SharedPreferences r3 = r4.f18650h
            wb.en.m(r2, r5, r3, r1, r0)
        L14:
            sf.n r5 = sf.n.f12433a
            return r5
        L17:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            i0.a1 r1 = r4.f18651i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f18650h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "enable"
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r0)
            if (r0 == 0) goto L38
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            goto L3a
        L38:
            r0 = 0
        L3a:
            java.lang.String r2 = "enabled_at_seconds"
            android.content.SharedPreferences$Editor r5 = r5.putLong(r2, r0)
            r5.apply()
            goto L14
        L44:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            lg.d r0 = new lg.d
            r1 = 5
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            android.content.SharedPreferences r1 = r4.f18650h
            java.lang.String r2 = "zombie_check_max_retries"
            wb.ho.s4(r1, r2, r5, r0)
            goto L14
        L5e:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            lg.d r0 = new lg.d
            r1 = 60
            r2 = 1
            r3 = 5
            r0.<init>(r3, r1, r2)
            android.content.SharedPreferences r1 = r4.f18650h
            java.lang.String r2 = "zombie_check_timeout_seconds"
            wb.ho.s4(r1, r2, r5, r0)
            goto L14
        L79:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            lg.d r0 = new lg.d
            r1 = 120(0x78, float:1.68E-43)
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            android.content.SharedPreferences r1 = r4.f18650h
            java.lang.String r2 = "zombie_check_max_delay_seconds"
            wb.ho.s4(r1, r2, r5, r0)
            goto L14
        L94:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            lg.d r0 = new lg.d
            r1 = 60
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            android.content.SharedPreferences r1 = r4.f18650h
            java.lang.String r2 = "zombie_check_min_delay_seconds"
            wb.ho.s4(r1, r2, r5, r0)
            goto L14
        Lb0:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto Ld8
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto Lcf
            r5 = 0
        Lcf:
            java.lang.String r1 = "daily_like_limit"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        Ld8:
            sf.n r5 = sf.n.f12433a
            return r5
        Ldb:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f18651i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f18650h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "list_mode"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L14
        Lf7:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "keyword_notify_filter_mode"
            goto Ld
        L101:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "zombie_check_keep_awake"
            goto Ld
        L10b:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            lg.d r0 = new lg.d
            r1 = 300(0x12c, float:4.2E-43)
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            android.content.SharedPreferences r1 = r4.f18650h
            java.lang.String r2 = "zombie_check_delete_delay_seconds"
            wb.ho.s4(r1, r2, r5, r0)
            goto L14
        L127:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "zombie_check_clear_record"
            goto Ld
        L131:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f18651i
            android.content.SharedPreferences r1 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "zombie_check_label_name"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        L14e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "zombie_check_auto_tag"
            goto Ld
        L158:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f18651i
            android.content.SharedPreferences r1 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "qq_music_order_triggers"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.commit()
            goto L14
        L16d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "text_voice_play_enable"
            goto Ld
        L177:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "text_voice_send_enable"
            goto Ld
        L181:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L1a9
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto L1a0
            r5 = 0
        L1a0:
            java.lang.String r1 = "daily_limit"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L1a9:
            sf.n r5 = sf.n.f12433a
            return r5
        L1ac:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L1d4
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto L1cb
            r5 = 0
        L1cb:
            java.lang.String r1 = "random_max_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L1d4:
            sf.n r5 = sf.n.f12433a
            return r5
        L1d7:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L1ff
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto L1f6
            r5 = 0
        L1f6:
            java.lang.String r1 = "random_min_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L1ff:
            sf.n r5 = sf.n.f12433a
            return r5
        L202:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            i0.a1 r0 = r4.f18651i
            r0.setValue(r5)
            r0 = 10
            java.lang.Integer r5 = og.t.e0(r0, r5)
            if (r5 == 0) goto L22a
            int r5 = r5.intValue()
            android.content.SharedPreferences r0 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r5 >= 0) goto L221
            r5 = 0
        L221:
            java.lang.String r1 = "fixed_delay_seconds"
            android.content.SharedPreferences$Editor r5 = r0.putInt(r1, r5)
            r5.apply()
        L22a:
            sf.n r5 = sf.n.f12433a
            return r5
        L22d:
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r5.intValue()
            i0.a1 r1 = r4.f18651i
            r1.setValue(r5)
            android.content.SharedPreferences r5 = r4.f18650h
            android.content.SharedPreferences$Editor r5 = r5.edit()
            java.lang.String r1 = "delay_mode"
            android.content.SharedPreferences$Editor r5 = r5.putInt(r1, r0)
            r5.apply()
            goto L14
        L249:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f18651i
            android.content.SharedPreferences r1 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "toast_template"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        L25e:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f18651i
            android.content.SharedPreferences r1 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "body_template"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        L273:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f18651i
            android.content.SharedPreferences r1 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "title_template"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
        L288:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "allow_live_photo"
            goto Ld
        L292:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "allow_video"
            goto Ld
        L29c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "allow_image"
            goto Ld
        L2a6:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = "allow_text"
            goto Ld
        L2b0:
            java.lang.String r5 = (java.lang.String) r5
            i0.a1 r0 = r4.f18651i
            android.content.SharedPreferences r1 = r4.f18650h
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r0, r5, r1)
            java.lang.String r1 = "content_template"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L14
    }
}
