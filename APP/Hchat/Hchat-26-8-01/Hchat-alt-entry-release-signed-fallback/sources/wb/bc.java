package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bc implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f15194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15196j;

    public /* synthetic */ bc(android.content.SharedPreferences r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f15193g = r4
            r0.f15194h = r1
            r0.f15195i = r2
            r0.f15196j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f15193g
            switch(r0) {
                case 0: goto L2d9;
                case 1: goto L29f;
                case 2: goto L265;
                case 3: goto L232;
                case 4: goto L213;
                case 5: goto L1ea;
                case 6: goto L178;
                case 7: goto L13f;
                case 8: goto L117;
                case 9: goto La5;
                case 10: goto L7e;
                case 11: goto L56;
                case 12: goto L2e;
                default: goto L5;
            }
        L5:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            i0.a1 r0 = r7.f15195i
            r0.setValue(r8)
            i0.a1 r0 = r7.f15196j
            java.lang.String r1 = ""
            r0.setValue(r1)
            android.content.SharedPreferences r0 = r7.f15194h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "text_voice_engine"
            android.content.SharedPreferences$Editor r8 = r0.putString(r2, r8)
            java.lang.String r0 = "text_voice_tts_voice"
            android.content.SharedPreferences$Editor r8 = r8.putString(r0, r1)
            r8.apply()
            sf.n r8 = sf.n.f12433a
            return r8
        L2e:
            r.h r8 = (r.h) r8
            r8.getClass()
            s0.d r0 = wb.p0.G2
            r1 = 0
            r2 = 3
            r.h.a(r8, r1, r0, r2)
            wb.t7 r0 = new wb.t7
            r3 = 11
            android.content.SharedPreferences r4 = r7.f15194h
            i0.a1 r5 = r7.f15195i
            i0.a1 r6 = r7.f15196j
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = -1836299073(0xffffffff928c4cbf, float:-8.8541615E-28)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r8, r1, r3, r2)
            sf.n r8 = sf.n.f12433a
            return r8
        L56:
            r.h r8 = (r.h) r8
            r8.getClass()
            s0.d r0 = wb.p0.r2
            r1 = 0
            r2 = 3
            r.h.a(r8, r1, r0, r2)
            wb.t7 r0 = new wb.t7
            r3 = 10
            android.content.SharedPreferences r4 = r7.f15194h
            i0.a1 r5 = r7.f15195i
            i0.a1 r6 = r7.f15196j
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = -751119238(0xffffffffd33ad47a, float:-8.024287E11)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r8, r1, r3, r2)
            sf.n r8 = sf.n.f12433a
            return r8
        L7e:
            r.h r8 = (r.h) r8
            r8.getClass()
            s0.d r0 = wb.p0.J2
            r1 = 0
            r2 = 3
            r.h.a(r8, r1, r0, r2)
            wb.t7 r0 = new wb.t7
            r3 = 5
            android.content.SharedPreferences r4 = r7.f15194h
            i0.a1 r5 = r7.f15195i
            i0.a1 r6 = r7.f15196j
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = -907854332(0xffffffffc9e33e04, float:-1861568.5)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r8, r1, r3, r2)
            sf.n r8 = sf.n.f12433a
            return r8
        La5:
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r8)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        Lb7:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r8.next()
            wb.s0 r1 = (wb.s0) r1
            java.lang.String r1 = r1.f18970a
            r0.add(r1)
            goto Lb7
        Lc9:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto Ld2
            r8.add(r1)
            goto Ld2
        Le9:
            java.util.Set r8 = tf.m.U1(r8)
            i0.a1 r0 = r7.f15195i
            r0.setValue(r8)
            android.content.SharedPreferences r8 = r7.f15194h
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = wb.ho.D5(r0)
            java.lang.String r1 = "targets"
            android.content.SharedPreferences$Editor r8 = r8.putString(r1, r0)
            r8.apply()
            wb.po r8 = wb.po.f18500a
            i0.a1 r0 = r7.f15196j
            r0.setValue(r8)
            sf.n r8 = sf.n.f12433a
            return r8
        L117:
            r.h r8 = (r.h) r8
            r8.getClass()
            s0.d r0 = wb.p0.f18206a0
            r1 = 0
            r2 = 3
            r.h.a(r8, r1, r0, r2)
            wb.t7 r0 = new wb.t7
            r3 = 8
            android.content.SharedPreferences r4 = r7.f15194h
            i0.a1 r5 = r7.f15195i
            i0.a1 r6 = r7.f15196j
            r0.<init>(r4, r5, r6, r3)
            s0.d r3 = new s0.d
            r4 = -2000869548(0xffffffff88bd2754, float:-1.138427E-33)
            r5 = 1
            r3.<init>(r4, r0, r5)
            r.h.a(r8, r1, r3, r2)
            sf.n r8 = sf.n.f12433a
            return r8
        L13f:
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
            java.lang.Object r8 = tf.m.v1(r8)
            wb.s0 r8 = (wb.s0) r8
            if (r8 == 0) goto L14f
            java.lang.String r8 = r8.f18970a
            goto L150
        L14f:
            r8 = 0
        L150:
            if (r8 != 0) goto L154
            java.lang.String r8 = ""
        L154:
            i0.a1 r0 = r7.f15195i
            r0.setValue(r8)
            android.content.SharedPreferences r8 = r7.f15194h
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "audio_transform_last_talker"
            android.content.SharedPreferences$Editor r8 = r8.putString(r1, r0)
            r8.apply()
            wb.e r8 = wb.e.f15817b
            i0.a1 r0 = r7.f15196j
            r0.setValue(r8)
            sf.n r8 = sf.n.f12433a
            return r8
        L178:
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r8)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L18a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L19c
            java.lang.Object r1 = r8.next()
            wb.s0 r1 = (wb.s0) r1
            java.lang.String r1 = r1.f18970a
            r0.add(r1)
            goto L18a
        L19c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1bc
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L1a5
            r8.add(r1)
            goto L1a5
        L1bc:
            java.util.Set r8 = tf.m.U1(r8)
            i0.a1 r0 = r7.f15195i
            r0.setValue(r8)
            android.content.SharedPreferences r8 = r7.f15194h
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r0 = wb.ho.D5(r0)
            java.lang.String r1 = "targets"
            android.content.SharedPreferences$Editor r8 = r8.putString(r1, r0)
            r8.apply()
            wb.vo r8 = wb.vo.f19791a
            i0.a1 r0 = r7.f15196j
            r0.setValue(r8)
            sf.n r8 = sf.n.f12433a
            return r8
        L1ea:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            i0.a1 r0 = r7.f15195i
            r0.setValue(r8)
            i0.a1 r0 = r7.f15196j
            java.lang.String r1 = ""
            r0.setValue(r1)
            android.content.SharedPreferences r0 = r7.f15194h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "text_speech_tts_engine"
            android.content.SharedPreferences$Editor r8 = r0.putString(r2, r8)
            java.lang.String r0 = "text_speech_tts_voice"
            android.content.SharedPreferences$Editor r8 = r8.putString(r0, r1)
            r8.apply()
            sf.n r8 = sf.n.f12433a
            return r8
        L213:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L223
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            i0.a1 r0 = r7.f15195i
            r0.setValue(r8)
            goto L22f
        L223:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.String r0 = "zombie_check_auto_delete"
            i0.a1 r1 = r7.f15196j
            android.content.SharedPreferences r2 = r7.f15194h
            r3 = 0
            wb.en.m(r1, r8, r2, r0, r3)
        L22f:
            sf.n r8 = sf.n.f12433a
            return r8
        L232:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            i0.a1 r1 = r7.f15195i
            r1.setValue(r8)
            android.content.SharedPreferences r8 = r7.f15194h
            android.content.SharedPreferences$Editor r1 = r8.edit()
            java.lang.String r2 = "block_at_all_notification_enable"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r0)
            if (r0 == 0) goto L25f
            java.lang.String r0 = "block_at_all_notification_groups"
            boolean r8 = r8.contains(r0)
            if (r8 != 0) goto L25f
            java.lang.String r8 = ""
            r1.putString(r0, r8)
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            i0.a1 r0 = r7.f15196j
            r0.setValue(r8)
        L25f:
            r1.apply()
            sf.n r8 = sf.n.f12433a
            return r8
        L265:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            i0.a1 r1 = r7.f15195i
            r1.setValue(r8)
            i0.a1 r8 = r7.f15196j
            if (r0 == 0) goto L279
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r8.setValue(r1)
        L279:
            android.content.SharedPreferences r1 = r7.f15194h
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "game_emoji_pick_before_send"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r0)
            if (r0 == 0) goto L289
            r8 = 0
            goto L293
        L289:
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
        L293:
            java.lang.String r0 = "game_emoji_fixed_result"
            android.content.SharedPreferences$Editor r8 = r1.putBoolean(r0, r8)
            r8.apply()
            sf.n r8 = sf.n.f12433a
            return r8
        L29f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            i0.a1 r1 = r7.f15195i
            r1.setValue(r8)
            i0.a1 r8 = r7.f15196j
            if (r0 == 0) goto L2b3
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r8.setValue(r1)
        L2b3:
            android.content.SharedPreferences r1 = r7.f15194h
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "game_emoji_fixed_result"
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r0)
            if (r0 == 0) goto L2c3
            r8 = 0
            goto L2cd
        L2c3:
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
        L2cd:
            java.lang.String r0 = "game_emoji_pick_before_send"
            android.content.SharedPreferences$Editor r8 = r1.putBoolean(r0, r8)
            r8.apply()
            sf.n r8 = sf.n.f12433a
            return r8
        L2d9:
            i0.a0 r8 = (i0.a0) r8
            r8.getClass()
            h.f r8 = new h.f
            r0 = 2
            android.content.SharedPreferences r1 = r7.f15194h
            i0.a1 r2 = r7.f15195i
            i0.a1 r3 = r7.f15196j
            r8.<init>(r1, r2, r3, r0)
            return r8
    }
}
