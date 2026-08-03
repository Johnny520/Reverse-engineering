package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15727i;

    public /* synthetic */ di(android.content.SharedPreferences r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f15725g = r3
            r0.f15726h = r1
            r0.f15727i = r2
            r0.<init>()
            return
    }

    public /* synthetic */ di(i0.a1 r1, android.content.SharedPreferences r2, int r3) {
            r0 = this;
            r0.f15725g = r3
            r0.f15727i = r1
            r0.f15726h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f15725g
            switch(r0) {
                case 0: goto L350;
                case 1: goto L33b;
                case 2: goto L31f;
                case 3: goto L30a;
                case 4: goto L2f5;
                case 5: goto L2c7;
                case 6: goto L2b9;
                case 7: goto L2ab;
                case 8: goto L296;
                case 9: goto L277;
                case 10: goto L253;
                case 11: goto L237;
                case 12: goto L213;
                case 13: goto L1f4;
                case 14: goto L1db;
                case 15: goto L1b7;
                case 16: goto L1a2;
                case 17: goto L178;
                case 18: goto L163;
                case 19: goto L14e;
                case 20: goto L132;
                case 21: goto L107;
                case 22: goto Ldc;
                case 23: goto Lb1;
                case 24: goto La1;
                case 25: goto L8d;
                case 26: goto L79;
                case 27: goto L4d;
                case 28: goto L30;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r6.f15727i
            android.content.SharedPreferences r1 = r6.f15726h
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            r0.setValue(r7)
            r0 = 10
            java.lang.Integer r7 = og.t.e0(r0, r7)
            if (r7 == 0) goto L2d
            int r7 = r7.intValue()
            android.content.SharedPreferences$Editor r0 = r1.edit()
            if (r7 >= 0) goto L24
            r7 = 0
        L24:
            java.lang.String r1 = "daily_comment_limit"
            android.content.SharedPreferences$Editor r7 = r0.putInt(r1, r7)
            r7.apply()
        L2d:
            sf.n r7 = sf.n.f12433a
            return r7
        L30:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r2 = r7.intValue()
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r7 = r0.edit()
            java.lang.String r0 = "comment_list_mode"
            android.content.SharedPreferences$Editor r7 = r7.putInt(r0, r2)
            r7.apply()
        L4a:
            sf.n r7 = sf.n.f12433a
            return r7
        L4d:
            i0.a1 r0 = r6.f15727i
            android.content.SharedPreferences r1 = r6.f15726h
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            r0.setValue(r7)
            r0 = 10
            java.lang.Integer r7 = og.t.e0(r0, r7)
            if (r7 == 0) goto L76
            int r7 = r7.intValue()
            android.content.SharedPreferences$Editor r0 = r1.edit()
            r1 = 1
            if (r7 >= r1) goto L6d
            r7 = r1
        L6d:
            java.lang.String r1 = "comment_max_age_hours"
            android.content.SharedPreferences$Editor r7 = r0.putInt(r1, r7)
            r7.apply()
        L76:
            sf.n r7 = sf.n.f12433a
            return r7
        L79:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "comment_end_time"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L8d:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "comment_start_time"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        La1:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            java.lang.String r3 = "comment_time_window_enable"
        Lad:
            wb.en.m(r1, r7, r0, r3, r2)
            goto L4a
        Lb1:
            i0.a1 r0 = r6.f15727i
            android.content.SharedPreferences r1 = r6.f15726h
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            r0.setValue(r7)
            r0 = 10
            java.lang.Integer r7 = og.t.e0(r0, r7)
            if (r7 == 0) goto Ld9
            int r7 = r7.intValue()
            android.content.SharedPreferences$Editor r0 = r1.edit()
            if (r7 >= 0) goto Ld0
            r7 = 0
        Ld0:
            java.lang.String r1 = "comment_random_max_seconds"
            android.content.SharedPreferences$Editor r7 = r0.putInt(r1, r7)
            r7.apply()
        Ld9:
            sf.n r7 = sf.n.f12433a
            return r7
        Ldc:
            i0.a1 r0 = r6.f15727i
            android.content.SharedPreferences r1 = r6.f15726h
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            r0.setValue(r7)
            r0 = 10
            java.lang.Integer r7 = og.t.e0(r0, r7)
            if (r7 == 0) goto L104
            int r7 = r7.intValue()
            android.content.SharedPreferences$Editor r0 = r1.edit()
            if (r7 >= 0) goto Lfb
            r7 = 0
        Lfb:
            java.lang.String r1 = "comment_random_min_seconds"
            android.content.SharedPreferences$Editor r7 = r0.putInt(r1, r7)
            r7.apply()
        L104:
            sf.n r7 = sf.n.f12433a
            return r7
        L107:
            i0.a1 r0 = r6.f15727i
            android.content.SharedPreferences r1 = r6.f15726h
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            r0.setValue(r7)
            r0 = 10
            java.lang.Integer r7 = og.t.e0(r0, r7)
            if (r7 == 0) goto L12f
            int r7 = r7.intValue()
            android.content.SharedPreferences$Editor r0 = r1.edit()
            if (r7 >= 0) goto L126
            r7 = 0
        L126:
            java.lang.String r1 = "comment_fixed_delay_seconds"
            android.content.SharedPreferences$Editor r7 = r0.putInt(r1, r7)
            r7.apply()
        L12f:
            sf.n r7 = sf.n.f12433a
            return r7
        L132:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r2 = r7.intValue()
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r7 = r0.edit()
            java.lang.String r0 = "comment_delay_mode"
            android.content.SharedPreferences$Editor r7 = r7.putInt(r0, r2)
            r7.apply()
            goto L4a
        L14e:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "group_rename_listen_groups"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L163:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "group_member_reply_listen_groups"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L178:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            wb.bp r7 = (wb.bp) r7
            r7.getClass()
            java.util.List r2 = ob.p.f9754a
            int r7 = r7.f15271b
            java.lang.Object r7 = tf.m.w1(r7, r2)
            ob.o r7 = (ob.o) r7
            if (r7 == 0) goto L19f
            java.lang.String r7 = r7.f9751a
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "text_voice_voice"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
        L19f:
            sf.n r7 = sf.n.f12433a
            return r7
        L1a2:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "text_voice_tts_voice"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L1b7:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            r.h r7 = (r.h) r7
            r7.getClass()
            s0.d r2 = wb.p0.f18356u2
            r3 = 0
            r4 = 3
            r.h.a(r7, r3, r2, r4)
            wb.vc r2 = new wb.vc
            r5 = 2
            r2.<init>(r0, r1, r5)
            s0.d r0 = new s0.d
            r1 = -302101041(0xffffffffedfe4dcf, float:-9.837907E27)
            r5 = 1
            r0.<init>(r1, r2, r5)
            r.h.a(r7, r3, r0, r4)
            goto L4a
        L1db:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            java.lang.String r3 = "scheduled_task_enable"
            wb.en.m(r1, r7, r0, r3, r2)
            cb.f r7 = be.h.f798a
            if (r7 == 0) goto L1f1
            r7.r()
        L1f1:
            sf.n r7 = sf.n.f12433a
            return r7
        L1f4:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.util.List r7 = (java.util.List) r7
            r7.getClass()
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "group_member_reply_template_bindings"
            java.lang.String r7 = r9.e0.A(r7)
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L213:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            r.h r7 = (r.h) r7
            r7.getClass()
            s0.d r2 = wb.p0.f18349t2
            r3 = 0
            r4 = 3
            r.h.a(r7, r3, r2, r4)
            wb.vc r2 = new wb.vc
            r5 = 6
            r2.<init>(r0, r1, r5)
            s0.d r0 = new s0.d
            r1 = -276622072(0xffffffffef831508, float:-8.113592E28)
            r5 = 1
            r0.<init>(r1, r2, r5)
            r.h.a(r7, r3, r0, r4)
            goto L4a
        L237:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r2 = r7.intValue()
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r7 = r0.edit()
            java.lang.String r0 = "audio_transform_mode"
            android.content.SharedPreferences$Editor r7 = r7.putInt(r0, r2)
            r7.apply()
            goto L4a
        L253:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            r.h r7 = (r.h) r7
            r7.getClass()
            s0.d r2 = wb.p0.f18341s2
            r3 = 0
            r4 = 3
            r.h.a(r7, r3, r2, r4)
            wb.vc r2 = new wb.vc
            r5 = 5
            r2.<init>(r0, r1, r5)
            s0.d r0 = new s0.d
            r1 = -1207687151(0xffffffffb8042811, float:-3.1508567E-5)
            r5 = 1
            r0.<init>(r1, r2, r5)
            r.h.a(r7, r3, r0, r4)
            goto L4a
        L277:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.util.List r7 = (java.util.List) r7
            r7.getClass()
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "group_rename_template_bindings"
            java.lang.String r7 = x6.d.t(r7)
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L296:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "excluded_talkers"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L2ab:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            java.lang.String r3 = "excluded_talkers_enable"
            goto Lad
        L2b9:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            java.lang.String r3 = "like_self"
            goto Lad
        L2c7:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r7 = r0.edit()
            java.lang.String r0 = "enable"
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r0, r2)
            if (r2 == 0) goto L2e8
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            goto L2ea
        L2e8:
            r0 = 0
        L2ea:
            java.lang.String r2 = "enabled_at_seconds"
            android.content.SharedPreferences$Editor r7 = r7.putLong(r2, r0)
            r7.apply()
            goto L4a
        L2f5:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "qq_music_order_app_id"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.commit()
            goto L4a
        L30a:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "qq_music_order_default_singer"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.commit()
            goto L4a
        L31f:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            r1.setValue(r7)
            android.content.SharedPreferences$Editor r7 = r0.edit()
            java.lang.String r0 = "qq_music_order_custom_singer"
            android.content.SharedPreferences$Editor r7 = r7.putBoolean(r0, r2)
            r7.commit()
            goto L4a
        L33b:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences$Editor r0 = wb.en.b(r7, r1, r7, r0)
            java.lang.String r1 = "exclude_keywords_video_text"
            android.content.SharedPreferences$Editor r7 = r0.putString(r1, r7)
            r7.apply()
            goto L4a
        L350:
            android.content.SharedPreferences r0 = r6.f15726h
            i0.a1 r1 = r6.f15727i
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r2 = r7.booleanValue()
            java.lang.String r3 = "keyword_video"
            goto Lad
    }
}
