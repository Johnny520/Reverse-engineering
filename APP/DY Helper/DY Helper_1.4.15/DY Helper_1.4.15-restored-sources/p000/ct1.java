package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct1 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2747;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.content.Context f2748;

    public /* synthetic */ ct1(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f2747 = r2
            r0.f2748 = r1
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f2747
            java.lang.String r1 = "该功能仅限内测用户使用"
            r2 = 1
            r3 = 4
            r4 = 0
            s62 r5 = p000.s62.f9751
            android.content.Context r6 = r6.f2748
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            android.widget.Switch r8 = (android.widget.Switch) r8
            switch(r0) {
                case 0: goto L2df;
                case 1: goto L2d6;
                case 2: goto L2cd;
                case 3: goto L29e;
                case 4: goto L26f;
                case 5: goto L240;
                case 6: goto L211;
                case 7: goto L208;
                case 8: goto L1ff;
                case 9: goto L1f6;
                case 10: goto L1ed;
                case 11: goto L1e4;
                case 12: goto L1db;
                case 13: goto L1d2;
                case 14: goto L1c9;
                case 15: goto L1b4;
                case 16: goto L19f;
                case 17: goto L196;
                case 18: goto L167;
                case 19: goto L146;
                case 20: goto L125;
                case 21: goto L104;
                case 22: goto Le3;
                case 23: goto La3;
                case 24: goto L74;
                case 25: goto L45;
                default: goto L16;
            }
        L16:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "clean_progress_bar_only_in_clean_mode"
            if (r0 != 0) goto L3e
            boolean r0 = p000.ui1.m5887(r1, r2)
            if (r7 == r0) goto L2f
            p000.i81.m2648(r6)
        L2f:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto L44
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto L44
        L3e:
            p000.ui1.m5871(r1, r7)
            p000.bv1.m1036(r1)
        L44:
            return r5
        L45:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "clean_progress_bar_restore_alpha_on_pause"
            if (r0 != 0) goto L6d
            boolean r0 = p000.ui1.m5887(r1, r2)
            if (r7 == r0) goto L5e
            p000.i81.m2648(r6)
        L5e:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto L73
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto L73
        L6d:
            p000.ui1.m5871(r1, r7)
            p000.bv1.m1036(r1)
        L73:
            return r5
        L74:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "clean_mode_enabled"
            if (r0 != 0) goto L9c
            boolean r0 = p000.ui1.m5887(r1, r4)
            if (r7 == r0) goto L8d
            p000.i81.m2648(r6)
        L8d:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto La2
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto La2
        L9c:
            p000.ui1.m5871(r1, r7)
            p000.bv1.m1036(r1)
        La2:
            return r5
        La3:
            bv1 r0 = p000.bv1.f1853
            r8.getClass()
            java.lang.String r0 = "spark_fake_days_enabled"
            if (r7 == 0) goto Lc0
            boolean r2 = p000.AbstractC0976x9.m6530()
            if (r2 != 0) goto Lc0
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r1, r4)
            r6.show()
            p000.ui1.m5871(r0, r4)
            r8.setChecked(r4)
            goto Le2
        Lc0:
            p000.ui1.m5871(r0, r7)
            ry1 r7 = p000.ry1.f9602
            java.util.concurrent.ConcurrentHashMap r7 = p000.ry1.f9620
            r7.clear()
            java.util.concurrent.ConcurrentHashMap r7 = p000.ry1.f9621
            r7.clear()
            java.util.concurrent.ConcurrentHashMap r7 = p000.ry1.f9596
            r7.clear()
            java.lang.String r7 = "火花数据已清除，等待重新收集"
            p000.ry1.m5276(r7)
            java.lang.String r7 = "请返回消息列表并重新进入以刷新火花显示"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r4)
            r6.show()
        Le2:
            return r5
        Le3:
            bv1 r0 = p000.bv1.f1853
            r8.getClass()
            java.lang.String r0 = "spark_custom_renew_enabled"
            if (r7 == 0) goto L100
            boolean r2 = p000.AbstractC0976x9.m6530()
            if (r2 != 0) goto L100
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r1, r4)
            r6.show()
            p000.ui1.m5871(r0, r4)
            r8.setChecked(r4)
            goto L103
        L100:
            p000.ui1.m5871(r0, r7)
        L103:
            return r5
        L104:
            bv1 r0 = p000.bv1.f1853
            r8.getClass()
            java.lang.String r0 = "spark_include_group_chat"
            if (r7 == 0) goto L121
            boolean r2 = p000.AbstractC0976x9.m6530()
            if (r2 != 0) goto L121
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r1, r4)
            r6.show()
            p000.ui1.m5871(r0, r4)
            r8.setChecked(r4)
            goto L124
        L121:
            p000.ui1.m5871(r0, r7)
        L124:
            return r5
        L125:
            bv1 r0 = p000.bv1.f1853
            r8.getClass()
            java.lang.String r0 = "pet_elf_auto_mutual_message_enabled"
            if (r7 == 0) goto L142
            boolean r3 = p000.AbstractC0976x9.m6529()
            if (r3 != 0) goto L142
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r1, r4)
            r6.show()
            p000.ui1.m5871(r0, r2)
            r8.setChecked(r4)
            goto L145
        L142:
            p000.ui1.m5871(r0, r7)
        L145:
            return r5
        L146:
            bv1 r0 = p000.bv1.f1853
            r8.getClass()
            java.lang.String r0 = "spark_auto_renew_enabled"
            if (r7 == 0) goto L163
            boolean r2 = p000.AbstractC0976x9.m6530()
            if (r2 != 0) goto L163
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r1, r4)
            r6.show()
            p000.ui1.m5871(r0, r4)
            r8.setChecked(r4)
            goto L166
        L163:
            p000.ui1.m5871(r0, r7)
        L166:
            return r5
        L167:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "toptab_skip_hidden_page_enabled"
            if (r0 != 0) goto L18f
            boolean r0 = p000.ui1.m5887(r1, r4)
            if (r7 == r0) goto L180
            p000.i81.m2648(r6)
        L180:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto L195
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto L195
        L18f:
            p000.ui1.m5871(r1, r7)
            p000.v71.m6043()
        L195:
            return r5
        L196:
            r8.getClass()
            java.lang.String r0 = "toptab_center_align"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L19f:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "share_panel_enabled"
            boolean r6 = p000.bv1.m1074(r6, r0, r7)
            if (r6 != 0) goto L1b0
            r8.setChecked(r2)
            goto L1b3
        L1b0:
            p000.ui1.m5871(r0, r7)
        L1b3:
            return r5
        L1b4:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "volume_key_enabled"
            boolean r6 = p000.bv1.m1074(r6, r0, r7)
            if (r6 != 0) goto L1c5
            r8.setChecked(r2)
            goto L1c8
        L1c5:
            p000.ui1.m5871(r0, r7)
        L1c8:
            return r5
        L1c9:
            r8.getClass()
            java.lang.String r0 = "feed_right_auto_scroll_button_enabled"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L1d2:
            r8.getClass()
            java.lang.String r0 = "feed_right_dislike_button_enabled"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L1db:
            r8.getClass()
            java.lang.String r0 = "voice_replace_confirm_before_send"
            p000.bv1.m1039(r6, r0, r7, r8, r2)
            return r5
        L1e4:
            r8.getClass()
            java.lang.String r0 = "voice_replace_enabled"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L1ed:
            r8.getClass()
            java.lang.String r0 = "idle_exit_show_countdown"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L1f6:
            r8.getClass()
            java.lang.String r0 = "idle_exit_lock_screen"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L1ff:
            r8.getClass()
            java.lang.String r0 = "idle_auto_exit_enabled"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L208:
            r8.getClass()
            java.lang.String r0 = "comment_bookmark_auto_scan_enabled"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L211:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "clean_progress_bar_enabled"
            if (r0 != 0) goto L239
            boolean r0 = p000.ui1.m5887(r1, r4)
            if (r7 == r0) goto L22a
            p000.i81.m2648(r6)
        L22a:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto L23f
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto L23f
        L239:
            p000.ui1.m5871(r1, r7)
            p000.bv1.m1036(r1)
        L23f:
            return r5
        L240:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "clean_pause_show_bottom_bar"
            if (r0 != 0) goto L268
            boolean r0 = p000.ui1.m5887(r1, r4)
            if (r7 == r0) goto L259
            p000.i81.m2648(r6)
        L259:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto L26e
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto L26e
        L268:
            p000.ui1.m5871(r1, r7)
            p000.bv1.m1036(r1)
        L26e:
            return r5
        L26f:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "clean_touch_restore_controls"
            if (r0 != 0) goto L297
            boolean r0 = p000.ui1.m5887(r1, r4)
            if (r7 == r0) goto L288
            p000.i81.m2648(r6)
        L288:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto L29d
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto L29d
        L297:
            p000.ui1.m5871(r1, r7)
            p000.bv1.m1036(r1)
        L29d:
            return r5
        L29e:
            r8.getClass()
            bv1 r0 = p000.bv1.f1853
            r6.getClass()
            boolean r0 = p000.i81.m2670(r6)
            java.lang.String r1 = "clean_auto_hide"
            if (r0 != 0) goto L2c6
            boolean r0 = p000.ui1.m5887(r1, r4)
            if (r7 == r0) goto L2b7
            p000.i81.m2648(r6)
        L2b7:
            boolean r6 = r8.isChecked()
            if (r6 == r0) goto L2cc
            jg r6 = new jg
            r6.<init>(r8, r0, r3)
            r8.post(r6)
            goto L2cc
        L2c6:
            p000.ui1.m5871(r1, r7)
            p000.bv1.m1036(r1)
        L2cc:
            return r5
        L2cd:
            r8.getClass()
            java.lang.String r0 = "hide_tab_publish"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L2d6:
            r8.getClass()
            java.lang.String r0 = "bottom_bar_hide_badge"
            p000.bv1.m1039(r6, r0, r7, r8, r4)
            return r5
        L2df:
            r8.getClass()
            java.lang.String r0 = "bottom_bar_show_text"
            p000.bv1.m1039(r6, r0, r7, r8, r2)
            return r5
    }
}
