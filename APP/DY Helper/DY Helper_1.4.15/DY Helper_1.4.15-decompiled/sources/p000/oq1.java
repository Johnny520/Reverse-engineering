package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq1 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8175;

    public /* synthetic */ oq1(int r1) {
            r0 = this;
            r0.f8175 = r1
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
            r19 = this;
            r0 = r19
            int r0 = r0.f8175
            r1 = 4
            java.lang.String r2 = "DYHelper"
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<il0> r4 = p000.il0.class
            r5 = 0
            s62 r6 = p000.s62.f9751
            switch(r0) {
                case 0: goto L3d0;
                case 1: goto L35a;
                case 2: goto L34f;
                case 3: goto L2b9;
                case 4: goto L28e;
                case 5: goto L268;
                case 6: goto L259;
                case 7: goto L24a;
                case 8: goto L226;
                case 9: goto L217;
                case 10: goto L200;
                case 11: goto L1e9;
                case 12: goto L1d4;
                case 13: goto L1bf;
                case 14: goto L1a8;
                case 15: goto L193;
                case 16: goto L17c;
                case 17: goto L165;
                case 18: goto L14e;
                case 19: goto L137;
                case 20: goto Lfe;
                case 21: goto Lc5;
                case 22: goto Lae;
                case 23: goto L97;
                case 24: goto L80;
                case 25: goto L69;
                case 26: goto L52;
                case 27: goto L3d;
                case 28: goto L28;
                default: goto L11;
            }
        L11:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "live_room_audience_exact_count_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L28:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            java.lang.String r1 = "spark_show_top_notification"
            p000.ui1.m5871(r1, r0)
            return r6
        L3d:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            java.lang.String r1 = "download_show_top_notification"
            p000.ui1.m5871(r1, r0)
            return r6
        L52:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "feed_follow_confirm_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L69:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "profile_bookmark_show_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L80:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "profile_bookmark_hook_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L97:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "profile_uid_show_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        Lae:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "video_length_alert_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        Lc5:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            r8 = r21
            android.widget.Switch r8 = (android.widget.Switch) r8
            r8.getClass()
            bv1 r8 = p000.bv1.f1853
            java.lang.String r8 = "immersive_navigation_bar_enabled"
            p000.ui1.m5871(r8, r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.il0.f5108     // Catch: java.lang.Exception -> Lef
            java.lang.String r7 = "setNavigationBarEnabled"
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> Lef
            java.lang.reflect.Method r3 = r4.getMethod(r7, r3)     // Catch: java.lang.Exception -> Lef
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> Lef
            r3.invoke(r5, r0)     // Catch: java.lang.Exception -> Lef
            goto Lfd
        Lef:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "通知沉浸式导航栏 Hook 失败: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r2, r0, r5, r1, r5)
        Lfd:
            return r6
        Lfe:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            r8 = r21
            android.widget.Switch r8 = (android.widget.Switch) r8
            r8.getClass()
            bv1 r8 = p000.bv1.f1853
            java.lang.String r8 = "immersive_status_bar_enabled"
            p000.ui1.m5871(r8, r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.il0.f5108     // Catch: java.lang.Exception -> L128
            java.lang.String r7 = "setEnabled"
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L128
            java.lang.reflect.Method r3 = r4.getMethod(r7, r3)     // Catch: java.lang.Exception -> L128
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L128
            r3.invoke(r5, r0)     // Catch: java.lang.Exception -> L128
            goto L136
        L128:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "通知沉浸式状态栏 Hook 失败: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r2, r0, r5, r1, r5)
        L136:
            return r6
        L137:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "precise_time_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L14e:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "duration_alert_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L165:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "im_auto_read_include_interactive"
            p000.ui1.m5871(r1, r0)
            return r6
        L17c:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "im_auto_read_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L193:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            java.lang.String r1 = "offline_cache_count_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L1a8:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "comment_control_custom_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L1bf:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            java.lang.String r1 = "live_photo_merge_after_download"
            p000.ui1.m5871(r1, r0)
            return r6
        L1d4:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            java.lang.String r1 = "comment_emoji_convert_format_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L1e9:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "feed_preload_debug_log"
            p000.ui1.m5871(r1, r0)
            return r6
        L200:
            r0 = r20
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r21
            android.widget.Switch r1 = (android.widget.Switch) r1
            r1.getClass()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "comment_panel_hook_enabled"
            p000.ui1.m5871(r1, r0)
            return r6
        L217:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r0 = r21
            p32 r0 = (p000.p32) r0
            int r0 = r0.f8413
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L226:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r1 = r21
            q32 r1 = (p000.q32) r1
            int r2 = r1.f8848
            p32 r3 = new p32
            r3.<init>(r2)
            n5 r2 = p000.jx0.f5630
            java.lang.Object r0 = p000.rq1.m5121(r3, r2, r0)
            boolean r1 = r1.f8849
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6879(r0)
            return r0
        L24a:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r0 = r21
            rr0 r0 = (p000.rr0) r0
            int r0 = r0.f9470
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L259:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r0 = r21
            xy r0 = (p000.C1001xy) r0
            int r0 = r0.f12379
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L268:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r1 = r21
            kh1 r1 = (p000.kh1) r1
            boolean r2 = r1.f5928
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            n5 r3 = p000.rq1.f9445
            int r1 = r1.f5929
            xy r3 = new xy
            r3.<init>(r1)
            n5 r1 = p000.jx0.f5627
            java.lang.Object r0 = p000.rq1.m5121(r3, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6879(r0)
            return r0
        L28e:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r1 = r21
            o32 r1 = (p000.o32) r1
            ux1 r2 = r1.f7935
            n5 r3 = p000.rq1.f9452
            java.lang.Object r2 = p000.rq1.m5121(r2, r3, r0)
            ux1 r4 = r1.f7936
            java.lang.Object r4 = p000.rq1.m5121(r4, r3, r0)
            ux1 r5 = r1.f7937
            java.lang.Object r5 = p000.rq1.m5121(r5, r3, r0)
            ux1 r1 = r1.f7938
            java.lang.Object r0 = p000.rq1.m5121(r1, r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r4, r5, r0}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6879(r0)
            return r0
        L2b9:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r1 = r21
            ux1 r1 = (p000.ux1) r1
            f32 r2 = r1.f10996
            long r2 = r2.mo2033()
            ci r4 = new ci
            r4.<init>(r2)
            qq1 r2 = p000.rq1.f9460
            java.lang.Object r5 = p000.rq1.m5121(r4, r2, r0)
            long r3 = r1.f10997
            y32 r6 = new y32
            r6.<init>(r3)
            qq1 r3 = p000.rq1.f9466
            java.lang.Object r6 = p000.rq1.m5121(r6, r3, r0)
            d60 r4 = r1.f10998
            d60 r7 = p000.d60.f2920
            n5 r7 = p000.rq1.f9457
            java.lang.Object r7 = p000.rq1.m5121(r4, r7, r0)
            b60 r4 = r1.f10999
            n5 r8 = p000.rq1.f9464
            java.lang.Object r8 = p000.rq1.m5121(r4, r8, r0)
            c60 r4 = r1.f11000
            n5 r9 = p000.rq1.f9465
            java.lang.Object r9 = p000.rq1.m5121(r4, r9, r0)
            r4 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.String r11 = r1.f11002
            long r12 = r1.f11003
            y32 r4 = new y32
            r4.<init>(r12)
            java.lang.Object r12 = p000.rq1.m5121(r4, r3, r0)
            r8 r3 = r1.f11004
            n5 r4 = p000.rq1.f9458
            java.lang.Object r13 = p000.rq1.m5121(r3, r4, r0)
            g32 r3 = r1.f11005
            n5 r4 = p000.rq1.f9455
            java.lang.Object r14 = p000.rq1.m5121(r3, r4, r0)
            av0 r3 = r1.f11006
            av0 r4 = p000.av0.f1319
            n5 r4 = p000.rq1.f9439
            java.lang.Object r15 = p000.rq1.m5121(r3, r4, r0)
            long r3 = r1.f11007
            r19 = r5
            ci r5 = new ci
            r5.<init>(r3)
            java.lang.Object r16 = p000.rq1.m5121(r5, r2, r0)
            c32 r2 = r1.f11008
            n5 r3 = p000.rq1.f9454
            java.lang.Object r17 = p000.rq1.m5121(r2, r3, r0)
            fv1 r1 = r1.f11009
            fv1 r2 = p000.fv1.f4142
            n5 r2 = p000.rq1.f9459
            java.lang.Object r18 = p000.rq1.m5121(r1, r2, r0)
            r5 = r19
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6879(r0)
            return r0
        L34f:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r0 = r21
            a72 r0 = (p000.a72) r0
            java.lang.String r0 = r0.f93
            return r0
        L35a:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r1 = r21
            r91 r1 = (p000.r91) r1
            int r2 = r1.f9301
            z22 r3 = new z22
            r3.<init>(r2)
            qq1 r2 = p000.rq1.f9461
            java.lang.Object r4 = p000.rq1.m5121(r3, r2, r0)
            int r2 = r1.f9302
            e32 r3 = new e32
            r3.<init>(r2)
            qq1 r2 = p000.rq1.f9462
            java.lang.Object r5 = p000.rq1.m5121(r3, r2, r0)
            long r2 = r1.f9303
            y32 r6 = new y32
            r6.<init>(r2)
            qq1 r2 = p000.rq1.f9466
            java.lang.Object r6 = p000.rq1.m5121(r6, r2, r0)
            h32 r2 = r1.f9304
            h32 r3 = p000.h32.f4565
            n5 r3 = p000.rq1.f9456
            java.lang.Object r7 = p000.rq1.m5121(r2, r3, r0)
            kh1 r2 = r1.f9305
            n5 r3 = p000.jx0.f5626
            java.lang.Object r8 = p000.rq1.m5121(r2, r3, r0)
            wr0 r2 = r1.f9306
            wr0 r3 = p000.wr0.f11805
            n5 r3 = p000.rq1.f9441
            java.lang.Object r9 = p000.rq1.m5121(r2, r3, r0)
            int r2 = r1.f9307
            rr0 r3 = new rr0
            r3.<init>(r2)
            n5 r2 = p000.jx0.f5628
            java.lang.Object r10 = p000.rq1.m5121(r3, r2, r0)
            int r2 = r1.f9308
            rg0 r3 = new rg0
            r3.<init>(r2)
            qq1 r2 = p000.rq1.f9463
            java.lang.Object r11 = p000.rq1.m5121(r3, r2, r0)
            q32 r1 = r1.f9309
            n5 r2 = p000.jx0.f5629
            java.lang.Object r12 = p000.rq1.m5121(r1, r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6879(r0)
            return r0
        L3d0:
            r0 = r20
            wp1 r0 = (p000.wp1) r0
            r0 = r21
            q72 r0 = (p000.q72) r0
            java.lang.String r0 = r0.f8902
            return r0
    }
}
