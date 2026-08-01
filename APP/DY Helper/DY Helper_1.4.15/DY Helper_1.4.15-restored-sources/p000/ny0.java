package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ny0 extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7817;

    public /* synthetic */ ny0(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            r0.f7817 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r27) {
            r26 = this;
            r0 = r26
            int r1 = r0.f7817
            java.lang.String r2 = "X.C0IIU"
            java.lang.String r3 = "提醒文案"
            r6 = 18
            r7 = 60
            r8 = 100
            r9 = 7
            r10 = 5
            r11 = 15
            r12 = 20
            r13 = 3
            r14 = 2
            r15 = 4
            r4 = 1
            r5 = 0
            switch(r1) {
                case 0: goto L69f;
                case 1: goto L688;
                case 2: goto L671;
                case 3: goto L65e;
                case 4: goto L64b;
                case 5: goto L616;
                case 6: goto L5e1;
                case 7: goto L5ca;
                case 8: goto L5b3;
                case 9: goto L59c;
                case 10: goto L585;
                case 11: goto L579;
                case 12: goto L568;
                case 13: goto L555;
                case 14: goto L542;
                case 15: goto L4aa;
                case 16: goto L499;
                case 17: goto L482;
                case 18: goto L423;
                case 19: goto L40c;
                case 20: goto L38a;
                case 21: goto L373;
                case 22: goto L2eb;
                case 23: goto L1e5;
                case 24: goto L1ce;
                case 25: goto L123;
                case 26: goto Lb1;
                case 27: goto L5b;
                case 28: goto L33;
                default: goto L1c;
            }
        L1c:
            r1 = r27
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            ys1 r0 = p000.zs1.f13262
            java.lang.String r2 = "本功能关闭时不安装 Hook；与首页手势共用同一双击入口。开关即时同步，未命中时重启抖音触发 DexKit 适配"
            android.widget.LinearLayout r0 = p000.bv1.m1072(r1, r0, r2)
            return r0
        L33:
            r1 = r27
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.util.List r2 = p000.zs1.f13258
            p000.bv1.m1055(r0, r1, r2, r4)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "仅对带章节且宿主已标记广告/营销章节的视频生效；切换视频后读取最新开关状态"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            return r0
        L5b:
            r2 = r27
            android.app.Activity r2 = (android.app.Activity) r2
            r2.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r2)
            ys1 r1 = p000.zs1.f13261
            java.util.List r1 = p000.AbstractC1021yh.m6896(r1)
            p000.bv1.m1055(r0, r2, r1, r5)
            android.view.View r1 = p000.bv1.m1064(r2)
            r0.addView(r1)
            java.lang.String r1 = "host_long_press_speed"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L87
            int r14 = r3.getInt(r1, r14)     // Catch: java.lang.Throwable -> L87
        L87:
            int r4 = p000.j81.m2906(r14, r4, r10)
            dt1 r1 = new dt1
            r1.<init>(r9)
            java.lang.String r3 = "宿主左右侧长按倍速"
            r5 = 5
            r6 = 1
            java.lang.String r7 = "倍"
            java.lang.String r8 = "修改视频左右侧长按加速倍率；下次长按生效"
            r9 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r2)
            r0.addView(r1)
            java.lang.String r1 = "菜单扩展开关修改后需重启抖音；4 到 5 倍会自动启用播放器高倍速能力"
            android.widget.TextView r1 = p000.bv1.m1065(r2, r1)
            r0.addView(r1)
            return r0
        Lb1:
            r16 = r27
            android.app.Activity r16 = (android.app.Activity) r16
            r16.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r16)
            java.lang.String r1 = "profile_video_search_alpha"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lce
            int r1 = r2.getInt(r1, r8)     // Catch: java.lang.Throwable -> Lce
            goto Lcf
        Lce:
            r1 = r8
        Lcf:
            int r18 = p000.j81.m2906(r1, r5, r8)
            dt1 r1 = new dt1
            r1.<init>(r13)
            java.lang.String r17 = "顶部搜索框透明度"
            r19 = 100
            r20 = 0
            java.lang.String r21 = "%"
            java.lang.String r22 = "控制搜索框整体内容；0% 时不可见但点击区域仍保留"
            r23 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r16
            p000.AbstractC0602nx.m4141(r0, r1, r2)
            java.lang.String r1 = "profile_video_comment_bar_alpha"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lf8
            int r1 = r3.getInt(r1, r8)     // Catch: java.lang.Throwable -> Lf8
            goto Lf9
        Lf8:
            r1 = r8
        Lf9:
            int r4 = p000.j81.m2906(r1, r5, r8)
            dt1 r9 = new dt1
            r9.<init>(r15)
            java.lang.String r3 = "底部评论栏透明度"
            r5 = 100
            r6 = 0
            java.lang.String r7 = "%"
            java.lang.String r8 = "与宿主遮罩透明度相乘；0% 时不可见但输入区域仍保留"
            android.widget.LinearLayout r1 = p000.bv1.m1070(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r2)
            r0.addView(r1)
            java.lang.String r1 = "仅从本人或他人作者主页进入视频详情时生效"
            android.widget.TextView r1 = p000.bv1.m1065(r2, r1)
            r0.addView(r1)
            return r0
        L123:
            r2 = r27
            android.app.Activity r2 = (android.app.Activity) r2
            r2.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r2)
            java.lang.String r1 = "seekbar_time_enabled"
            boolean r1 = p000.ui1.m5887(r1, r5)
            hu1 r3 = new hu1
            r3.<init>(r4)
            java.lang.String r4 = "启用进度条时间显示"
            java.lang.String r10 = "在视频进度条下方显示当前时间/总时长"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r2, r4, r10, r1, r3)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r2)
            r0.addView(r1)
            java.lang.String r1 = "seekbar_time_text_size"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L15c
            int r9 = r3.getInt(r1, r9)     // Catch: java.lang.Throwable -> L15c
        L15c:
            int r14 = p000.j81.m2906(r9, r15, r12)
            eu1 r1 = new eu1
            r3 = 17
            r1.<init>(r3)
            java.lang.String r13 = "字体大小"
            r15 = 20
            r16 = 4
            java.lang.String r17 = "sp"
            java.lang.String r18 = "调节时间文字的字号，默认 7sp"
            r19 = r1
            r12 = r2
            android.widget.LinearLayout r1 = p000.bv1.m1070(r12, r13, r14, r15, r16, r17, r18, r19)
            p000.AbstractC0602nx.m4141(r0, r1, r2)
            java.lang.String r1 = "seekbar_time_alpha"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L185
            int r7 = r3.getInt(r1, r7)     // Catch: java.lang.Throwable -> L185
        L185:
            int r4 = p000.j81.m2906(r7, r5, r8)
            eu1 r9 = new eu1
            r9.<init>(r6)
            java.lang.String r3 = "文字透明度"
            r5 = 100
            r6 = 0
            java.lang.String r7 = "%"
            java.lang.String r8 = "控制时间文字的透明度（0=全透明，100=不透明）"
            android.widget.LinearLayout r1 = p000.bv1.m1070(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r2)
            r0.addView(r1)
            java.lang.String r1 = "seekbar_time_color"
            java.lang.String r3 = "#99FFFFFF"
            java.lang.String r1 = p000.ui1.m5893(r1, r3)
            jt1 r3 = new jt1
            r3.<init>(r2, r11)
            java.lang.String r4 = "文字颜色"
            java.lang.String r5 = "点击选择文字颜色"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r2, r4, r1, r5, r3)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r2)
            r0.addView(r1)
            java.lang.String r1 = "修改后重新打开视频页面生效"
            android.widget.TextView r1 = p000.bv1.m1065(r2, r1)
            r0.addView(r1)
            return r0
        L1ce:
            r1 = r27
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            ys1 r0 = p000.zs1.f13260
            java.lang.String r2 = "此功能会在视频播放完成后自动暂停，避免自动循环播放"
            android.widget.LinearLayout r0 = p000.bv1.m1072(r1, r0, r2)
            return r0
        L1e5:
            r6 = r27
            android.app.Activity r6 = (android.app.Activity) r6
            r6.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r6)
            java.lang.String r1 = "auto_scroll_next_enabled"
            boolean r1 = p000.ui1.m5887(r1, r5)
            hu1 r2 = new hu1
            r2.<init>(r14)
            java.lang.String r3 = "启用自动下滑"
            java.lang.String r4 = "视频播放完成，或图文/文章达到设定停留时间后，自动滑到下一个作品"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r6, r3, r4, r1, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r6)
            r0.addView(r1)
            java.lang.String r1 = "auto_scroll_delay_ms"
            r2 = 800(0x320, float:1.121E-42)
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L220
            int r2 = r3.getInt(r1, r2)     // Catch: java.lang.Throwable -> L220
        L220:
            r1 = 5000(0x1388, float:7.006E-42)
            int r20 = p000.j81.m2906(r2, r5, r1)
            eu1 r1 = new eu1
            r2 = 19
            r1.<init>(r2)
            java.lang.String r19 = "视频完成延迟"
            r21 = 5000(0x1388, float:7.006E-42)
            r22 = 0
            java.lang.String r23 = "ms"
            java.lang.String r24 = "视频播放完成后等待多少毫秒再自动下滑（0 = 立即）"
            r25 = r1
            r18 = r6
            android.widget.LinearLayout r1 = p000.bv1.m1070(r18, r19, r20, r21, r22, r23, r24, r25)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r6)
            r0.addView(r1)
            java.lang.String r1 = "auto_scroll_image_enabled"
            boolean r1 = p000.ui1.m5887(r1, r5)
            hu1 r2 = new hu1
            r2.<init>(r13)
            java.lang.String r3 = "图文自动下滑"
            java.lang.String r4 = "图文或 LivePhoto 停留达到设定时间后自动切换，默认关闭"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r6, r3, r4, r1, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r6)
            r0.addView(r1)
            java.lang.String r1 = "auto_scroll_image_dwell_seconds"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L273
            r3 = 10
            int r1 = r2.getInt(r1, r3)     // Catch: java.lang.Throwable -> L273
            goto L275
        L273:
            r1 = 10
        L275:
            int r18 = p000.j81.m2906(r1, r13, r7)
            eu1 r1 = new eu1
            r1.<init>(r12)
            java.lang.String r17 = "图文停留时长"
            r19 = 60
            r20 = 3
            java.lang.String r21 = "秒"
            java.lang.String r22 = "图文进入当前页后等待多久自动下滑，默认 10 秒"
            r23 = r1
            r16 = r6
            android.widget.LinearLayout r1 = p000.bv1.m1070(r16, r17, r18, r19, r20, r21, r22, r23)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r6)
            r0.addView(r1)
            java.lang.String r1 = "auto_scroll_article_enabled"
            boolean r1 = p000.ui1.m5887(r1, r5)
            hu1 r2 = new hu1
            r2.<init>(r15)
            java.lang.String r3 = "文章自动下滑"
            java.lang.String r4 = "文字或文章模式停留达到设定时间后自动切换，默认关闭"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r6, r3, r4, r1, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r6)
            r0.addView(r1)
            java.lang.String r1 = "auto_scroll_article_dwell_seconds"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2c1
            int r12 = r2.getInt(r1, r12)     // Catch: java.lang.Throwable -> L2c1
        L2c1:
            r1 = 120(0x78, float:1.68E-43)
            int r8 = p000.j81.m2906(r12, r10, r1)
            eu1 r13 = new eu1
            r1 = 21
            r13.<init>(r1)
            java.lang.String r7 = "文章停留时长"
            r9 = 120(0x78, float:1.68E-43)
            r10 = 5
            java.lang.String r11 = "秒"
            java.lang.String r12 = "文章进入当前页后等待多久自动下滑，默认 20 秒"
            android.widget.LinearLayout r1 = p000.bv1.m1070(r6, r7, r8, r9, r10, r11, r12, r13)
            p000.AbstractC0602nx.m4141(r0, r1, r6)
            java.util.List r1 = p000.zs1.f13257
            p000.bv1.m1055(r0, r6, r1, r5)
            android.view.View r1 = p000.bv1.m1064(r6)
            r0.addView(r1)
            return r0
        L2eb:
            r1 = r27
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.lang.String r2 = "video_length_alert_enabled"
            boolean r2 = p000.ui1.m5887(r2, r5)
            oq1 r5 = new oq1
            r6 = 22
            r5.<init>(r6)
            java.lang.String r6 = "启用长视频提醒"
            java.lang.String r7 = "当前播放视频总时长超过设定值时弹出提醒"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r6, r7, r2, r5)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "video_length_alert_minutes"
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L32b
            r6 = 10
            int r5 = r5.getInt(r2, r6)     // Catch: java.lang.Throwable -> L32d
        L328:
            r2 = 180(0xb4, float:2.52E-43)
            goto L32f
        L32b:
            r6 = 10
        L32d:
            r5 = r6
            goto L328
        L32f:
            int r18 = p000.j81.m2906(r5, r4, r2)
            dt1 r2 = new dt1
            r4 = 16
            r2.<init>(r4)
            java.lang.String r17 = "提醒阈值"
            r19 = 180(0xb4, float:2.52E-43)
            r20 = 1
            java.lang.String r21 = "分钟"
            java.lang.String r22 = "当视频总时长超过该值时提醒，默认 10 分钟"
            r16 = r1
            r23 = r2
            android.widget.LinearLayout r1 = p000.bv1.m1070(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r16
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r2)
            r0.addView(r1)
            java.lang.String r1 = "video_length_alert_toast_msg"
            java.lang.String r4 = "当前视频时长超过 %d 分钟"
            java.lang.String r1 = p000.ui1.m5893(r1, r4)
            java.lang.String r1 = p000.bv1.m1042(r1, r11)
            jt1 r4 = new jt1
            r4.<init>(r2, r15)
            java.lang.String r5 = "使用 %d 代表视频时长分钟数"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r2, r3, r1, r5, r4)
            r0.addView(r1)
            return r0
        L373:
            r1 = r27
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            ys1 r0 = p000.zs1.f13259
            java.lang.String r2 = "此功能会屏蔽抖音官方的防沉迷/时长提醒弹窗，与模块自己的时长提醒功能无关"
            android.widget.LinearLayout r0 = p000.bv1.m1072(r1, r0, r2)
            return r0
        L38a:
            r12 = r27
            android.app.Activity r12 = (android.app.Activity) r12
            r12.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r12)
            java.lang.String r1 = "duration_alert_enabled"
            boolean r1 = p000.ui1.m5887(r1, r5)
            oq1 r2 = new oq1
            r2.<init>(r6)
            java.lang.String r6 = "启用时长提醒"
            java.lang.String r7 = "当连续刷视频超过设定时间后弹窗提醒休息"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r12, r6, r7, r1, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "duration_alert_minutes"
            r2 = 30
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L3c5
            int r2 = r6.getInt(r1, r2)     // Catch: java.lang.Throwable -> L3c5
        L3c5:
            r1 = 180(0xb4, float:2.52E-43)
            int r14 = p000.j81.m2906(r2, r4, r1)
            dt1 r1 = new dt1
            r2 = 14
            r1.<init>(r2)
            java.lang.String r13 = "提醒时长"
            r15 = 180(0xb4, float:2.52E-43)
            r16 = 1
            java.lang.String r17 = "分钟"
            java.lang.String r18 = "连续使用超过此时长后提醒，推荐 20~60 分钟"
            r19 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r12, r13, r14, r15, r16, r17, r18, r19)
            p000.AbstractC0602nx.m4141(r0, r1, r12)
            java.util.List r1 = p000.zs1.f13256
            p000.bv1.m1055(r0, r12, r1, r5)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "duration_alert_message"
            java.lang.String r2 = "你已经刷了 %d 分钟了,休息一下吧~"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String r1 = p000.bv1.m1042(r1, r11)
            jt1 r2 = new jt1
            r2.<init>(r12, r5)
            java.lang.String r4 = "使用 %d 代表已观看分钟数"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r12, r3, r1, r4, r2)
            r0.addView(r1)
            return r0
        L40c:
            r1 = r27
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            ki1 r0 = (p000.ki1) r0
            r0.getClass()
            boolean r0 = p000.ki1.m3273(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L423:
            r7 r1 = p000.EnumC0751r7.f9280
            r7 r2 = p000.EnumC0751r7.f9279
            r3 = r27
            q7 r3 = (p000.C0714q7) r3
            r3.getClass()
            java.lang.Object r0 = r0.receiver
            sh1 r0 = (p000.sh1) r0
            sh1 r4 = p000.sh1.f9903
            r0.getClass()
            pq r4 = p000.C0696pq.f8651
            mq r4 = p000.C0696pq.m4566()
            if (r4 == 0) goto L481
            long r6 = r4.f7247
            long r3 = r3.f8893
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 != 0) goto L481
            java.lang.ref.WeakReference r3 = p000.sh1.f9912
            if (r3 == 0) goto L467
            java.lang.Object r3 = r3.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 != 0) goto L454
            goto L467
        L454:
            boolean r4 = p000.sh1.m5513(r3)
            java.lang.String r6 = "auto_scroll_show_toast"
            if (r4 == 0) goto L469
            boolean r0 = p000.ui1.m5887(r6, r5)
            if (r0 == 0) goto L467
            java.lang.String r0 = "DY Helper：检测到评论区/输入状态，已暂停自动下滑"
            p000.sh1.m5514(r3, r0)
        L467:
            r1 = r2
            goto L481
        L469:
            boolean r0 = r0.m5518(r3)
            boolean r2 = p000.ui1.m5887(r6, r5)
            if (r2 == 0) goto L47d
            if (r0 == 0) goto L478
            java.lang.String r2 = "DY Helper：已自动下滑到下一个作品"
            goto L47a
        L478:
            java.lang.String r2 = "DY Helper：未找到可切换的作品列表"
        L47a:
            p000.sh1.m5514(r3, r2)
        L47d:
            if (r0 == 0) goto L481
            r7 r1 = p000.EnumC0751r7.f9278
        L481:
            return r1
        L482:
            r1 = r27
            ky1 r1 = (p000.ky1) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            gf1 r0 = (p000.gf1) r0
            r0.getClass()
            boolean r0 = p000.gf1.m2302(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L499:
            r1 = r27
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.receiver
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            return r0
        L4aa:
            r1 = r27
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            pe1 r0 = (p000.pe1) r0
            r0.getClass()
            java.lang.String r0 = "behavior_id"
            java.lang.Integer r0 = p000.pe1.m4508(r0, r1)
            r2 = 0
            if (r0 == 0) goto L541
            int r3 = r0.intValue()
            if (r3 <= 0) goto L4c8
            goto L4c9
        L4c8:
            r0 = r2
        L4c9:
            if (r0 == 0) goto L541
            int r0 = r0.intValue()
            java.lang.String r3 = "behavior_name"
            java.lang.String r3 = r1.optString(r3)
            r3.getClass()
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            int r6 = r3.length()
            if (r6 <= 0) goto L4e7
            r2 = r3
        L4e7:
            java.lang.String r3 = "closeness"
            java.lang.String r6 = "delta_closeness"
            java.lang.String r7 = "amount"
            java.lang.String[] r3 = new java.lang.String[]{r7, r3, r6}
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            gd1 r6 = new gd1
            r6.<init>(r1, r14)
            y30 r3 = p000.us1.m5943(r3, r6)
            java.lang.Object r3 = p000.us1.m5953(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r6 = "is_claimable"
            java.lang.Object r1 = r1.opt(r6)
            boolean r6 = r1 instanceof java.lang.Boolean
            if (r6 == 0) goto L515
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r4 = r1.booleanValue()
            goto L53b
        L515:
            boolean r6 = r1 instanceof java.lang.Number
            if (r6 == 0) goto L524
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == 0) goto L522
            goto L53b
        L522:
            r4 = r5
            goto L53b
        L524:
            boolean r6 = r1 instanceof java.lang.String
            if (r6 == 0) goto L522
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "true"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 != 0) goto L53b
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L522
        L53b:
            ke1 r1 = new ke1
            r1.<init>(r0, r2, r3, r4)
            r2 = r1
        L541:
            return r2
        L542:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            kd1 r0 = (p000.kd1) r0
            r0.getClass()
            java.lang.String r0 = p000.kd1.m3190(r1)
            return r0
        L555:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            kd1 r0 = (p000.kd1) r0
            r0.getClass()
            java.lang.String r0 = p000.kd1.m3190(r1)
            return r0
        L568:
            r1 = r27
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.receiver
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            return r0
        L579:
            java.lang.Object r0 = r0.receiver
            lb1 r0 = (p000.lb1) r0
            r0.getClass()
            java.lang.Long r0 = p000.lb1.m3542(r27)
            return r0
        L585:
            r1 = r27
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            p81 r0 = (p000.p81) r0
            r0.getClass()
            int r0 = p000.p81.m4402(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L59c:
            r1 = r27
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            p81 r0 = (p000.p81) r0
            r0.getClass()
            int r0 = p000.p81.m4402(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L5b3:
            r1 = r27
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            p81 r0 = (p000.p81) r0
            r0.getClass()
            int r0 = p000.p81.m4401(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L5ca:
            r1 = r27
            java.lang.Class r1 = (java.lang.Class) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            p81 r0 = (p000.p81) r0
            r0.getClass()
            int r0 = p000.p81.m4401(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L5e1:
            r1 = r27
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            l41 r0 = (p000.l41) r0
            r0.getClass()
            boolean r0 = p000.l41.m3490(r1)
            if (r0 == 0) goto L610
            java.lang.Class r0 = r1.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L610
            java.util.Set r0 = p000.l41.f6418
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L610
            goto L611
        L610:
            r4 = r5
        L611:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L616:
            r1 = r27
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            l41 r0 = (p000.l41) r0
            r0.getClass()
            boolean r0 = p000.l41.m3489(r1)
            if (r0 == 0) goto L645
            java.lang.Class r0 = r1.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L645
            java.util.Set r0 = p000.l41.f6417
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L645
            goto L646
        L645:
            r4 = r5
        L646:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L64b:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            qy0 r0 = (p000.qy0) r0
            r0.getClass()
            java.lang.String r0 = p000.qy0.m5001(r1)
            return r0
        L65e:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            qy0 r0 = (p000.qy0) r0
            r0.getClass()
            java.lang.String r0 = p000.qy0.m5001(r1)
            return r0
        L671:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            pu0 r0 = (p000.pu0) r0
            r0.getClass()
            boolean r0 = p000.pu0.m4601(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L688:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            qy0 r0 = (p000.qy0) r0
            r0.getClass()
            boolean r0 = p000.jx0.m3016(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L69f:
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            pu0 r0 = (p000.pu0) r0
            r0.getClass()
            int r0 = p000.pu0.m4610(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
