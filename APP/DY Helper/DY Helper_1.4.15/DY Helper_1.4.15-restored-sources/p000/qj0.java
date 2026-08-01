package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9020;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f9021;

    public /* synthetic */ qj0(int r1, boolean r2) {
            r0 = this;
            r0.f9020 = r1
            r0.f9021 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f9020
            switch(r0) {
                case 0: goto L309;
                case 1: goto L2f8;
                case 2: goto L2cc;
                case 3: goto L2ae;
                case 4: goto L29b;
                case 5: goto L278;
                case 6: goto L260;
                case 7: goto L240;
                case 8: goto L1f8;
                case 9: goto L1e0;
                case 10: goto L1c8;
                case 11: goto L16d;
                case 12: goto Lf8;
                case 13: goto Le0;
                case 14: goto L7f;
                case 15: goto L57;
                case 16: goto L3e;
                case 17: goto L25;
                default: goto L5;
            }
        L5:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L20
            java.lang.String r6 = "group_apply_auto_approval_cold_start_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L1f
            java.lang.String r6 = "group_apply_auto_approval_polling_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L20
        L1f:
            r7 = 1
        L20:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L25:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            if (r6 == 0) goto L38
            java.lang.String r6 = "im_conversation_delete_entry_enabled"
            r7 = 1
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L38
            goto L39
        L38:
            r7 = 0
        L39:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L3e:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            if (r6 == 0) goto L51
            be0 r6 = p000.be0.f1670
            boolean r6 = r6.m938()
            if (r6 == 0) goto L51
            r6 = 1
            goto L52
        L51:
            r6 = 0
        L52:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L57:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L7a
            java.lang.String r6 = "pet_elf_camp_auto_harvest"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L79
            java.lang.String r6 = "pet_elf_camp_auto_plant"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L79
            java.lang.String r6 = "pet_elf_camp_auto_water"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L7a
        L79:
            r7 = 1
        L7a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L7f:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto Ldb
            java.lang.String r6 = "spark_auto_mode"
            boolean r6 = p000.ui1.m5887(r6, r7)
            r0 = 1
            if (r6 != 0) goto Lda
            java.lang.String r6 = "spark_auto_renew_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "pet_elf_auto_task_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "pet_elf_auto_claim_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "pet_elf_closeness_auto_claim_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "pet_elf_auto_feed_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "pet_elf_auto_success_toast_enabled"
            boolean r6 = p000.ui1.m5887(r6, r0)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "spark_include_group_chat"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "spark_custom_renew_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto Lda
            java.lang.String r6 = "spark_fake_days_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto Ldb
        Lda:
            r7 = r0
        Ldb:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        Le0:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto Lf3
            java.lang.String r6 = "idle_auto_exit_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto Lf3
            r7 = 1
        Lf3:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        Lf8:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L168
            java.lang.String r6 = "toptab_discovered_tabs"
            java.lang.String r0 = "[]"
            java.lang.String r6 = p000.ui1.m5893(r6, r0)
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L168
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L168
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L168
            xm0 r6 = p000.j81.m2893(r7, r6)     // Catch: java.lang.Throwable -> L168
            boolean r1 = r6 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L168
            r2 = 1
            if (r1 == 0) goto L127
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L168
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L168
            if (r1 == 0) goto L127
        L125:
            r6 = r7
            goto L155
        L127:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L168
        L12b:
            r1 = r6
            wm0 r1 = (p000.wm0) r1     // Catch: java.lang.Throwable -> L168
            boolean r1 = r1.f11765     // Catch: java.lang.Throwable -> L168
            if (r1 == 0) goto L125
            r1 = r6
            wm0 r1 = (p000.wm0) r1     // Catch: java.lang.Throwable -> L168
            int r1 = r1.nextInt()     // Catch: java.lang.Throwable -> L168
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L168
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L168
            r3.<init>()     // Catch: java.lang.Throwable -> L168
            java.lang.String r4 = "toptab_hide_"
            r3.append(r4)     // Catch: java.lang.Throwable -> L168
            r3.append(r1)     // Catch: java.lang.Throwable -> L168
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L168
            boolean r1 = p000.ui1.m5887(r1, r7)     // Catch: java.lang.Throwable -> L168
            if (r1 == 0) goto L12b
            r6 = r2
        L155:
            java.lang.String r0 = "toptab_center_align"
            boolean r0 = p000.ui1.m5887(r0, r7)     // Catch: java.lang.Throwable -> L168
            java.lang.String r1 = "toptab_skip_hidden_page_enabled"
            boolean r1 = p000.ui1.m5887(r1, r7)     // Catch: java.lang.Throwable -> L168
            if (r6 != 0) goto L167
            if (r0 != 0) goto L167
            if (r1 != 0) goto L168
        L167:
            r7 = r2
        L168:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L16d:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L1c3
            java.lang.String r6 = "clean_mode_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L1c2
            java.lang.String r6 = "bottom_bar_hidden"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L1c2
            java.lang.String r6 = "clean_auto_hide"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L1c2
            java.lang.String r6 = "clean_touch_restore_controls"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L1c2
            java.lang.String r6 = "clean_pause_show_bottom_bar"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L1c2
            rz r6 = p000.EnumC0077bh.f1715
            if (r6 == 0) goto L1aa
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L1aa
            goto L1c3
        L1aa:
            java.util.Iterator r6 = r6.iterator()
        L1ae:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1c3
            java.lang.Object r0 = r6.next()
            bh r0 = (p000.EnumC0077bh) r0
            ch r0 = p000.AbstractC0782s1.m5339(r0)
            boolean r0 = r0.f2110
            if (r0 == 0) goto L1ae
        L1c2:
            r7 = 1
        L1c3:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L1c8:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L1db
            java.lang.String r6 = "comment_bookmark_auto_scan_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L1db
            r7 = 1
        L1db:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L1e0:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L1f3
            java.lang.String r6 = "voice_replace_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L1f3
            r7 = 1
        L1f3:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L1f8:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L23b
            java.lang.String r6 = "hide_tab_familiar"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L23a
            java.lang.String r6 = "hide_tab_publish"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L23a
            java.lang.String r6 = "hide_tab_notification"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L23a
            java.lang.String r6 = "hide_tab_profile"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L23a
            java.lang.String r6 = "hide_tab_explore"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L23a
            java.lang.String r6 = "hide_tab_mall"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L23a
            java.lang.String r6 = "hide_tab_nearby"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L23b
        L23a:
            r7 = 1
        L23b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L240:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L25b
            java.lang.String r6 = "feed_right_dislike_button_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 != 0) goto L25a
            java.lang.String r6 = "feed_right_auto_scroll_button_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L25b
        L25a:
            r7 = 1
        L25b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L260:
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            boolean r6 = r6.f9021
            r7 = 0
            if (r6 == 0) goto L273
            java.lang.String r6 = "chapter_ad_skip_enabled"
            boolean r6 = p000.ui1.m5887(r6, r7)
            if (r6 == 0) goto L273
            r7 = 1
        L273:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        L278:
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r7 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF4518038363F602FB27277D72D3045CBD1C0F1AC2CEC712C69EB23AA4EB3FE0BEAAF173013EA92E0C5"
            java.lang.String r1 = p000.jf0.m2957(r7)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            boolean r6 = r6.f9021
            if (r6 == 0) goto L298
            r4 = 6
            r5 = 0
            java.lang.String r1 = "onRefreshInteractiveNoticeEvent"
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.name$default(r0, r1, r2, r3, r4, r5)
        L298:
            s62 r6 = p000.s62.f9751
            return r6
        L29b:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r7 = (org.luckypray.dexkit.query.matchers.MethodsMatcher) r7
            r7.getClass()
            qj0 r0 = new qj0
            r1 = 5
            boolean r6 = r6.f9021
            r0.<init>(r1, r6)
            r7.add(r0)
        L2ab:
            s62 r6 = p000.s62.f9751
            return r6
        L2ae:
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = "int"
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            r0.paramTypes()
            qj0 r7 = new qj0
            r1 = 4
            boolean r6 = r6.f9021
            r7.<init>(r1, r6)
            r0.callerMethods(r7)
            goto L2ab
        L2cc:
            r0 = r7
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = "bolts.Task"
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.String r7 = r7.getName()
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r0.paramTypes(r7)
            boolean r6 = r6.f9021
            if (r6 == 0) goto L2f5
            java.lang.String r6 = "/aweme/v1/notice/del/"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r0.usingStrings(r6)
        L2f5:
            s62 r6 = p000.s62.f9751
            return r6
        L2f8:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            qj0 r0 = new qj0
            r1 = 2
            boolean r6 = r6.f9021
            r0.<init>(r1, r6)
            r7.matcher(r0)
            goto L2ab
        L309:
            org.luckypray.dexkit.query.FindMethod r7 = (org.luckypray.dexkit.query.FindMethod) r7
            r7.getClass()
            qj0 r0 = new qj0
            r1 = 3
            boolean r6 = r6.f9021
            r0.<init>(r1, r6)
            r7.matcher(r0)
            goto L2ab
    }
}
