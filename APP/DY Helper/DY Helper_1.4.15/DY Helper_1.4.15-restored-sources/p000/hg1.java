package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4729;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f4730;

    public /* synthetic */ hg1(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f4729 = r2
            r0.f4730 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m2508() {
            r5 = this;
            android.app.Activity r5 = r5.f4730
            r0 = 0
            boolean r1 = p000.AbstractC0976x9.m6530()     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            java.lang.String r1 = "火花与火星功能仅限内测用户使用"
            android.widget.Toast r1 = android.widget.Toast.makeText(r5, r1, r0)     // Catch: java.lang.Throwable -> L13
            r1.show()     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            goto L22
        L15:
            boolean r1 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1e
            p000.ui1.m5896(r5)     // Catch: java.lang.Throwable -> L13
        L1e:
            p000.jz1.m3094(r5)     // Catch: java.lang.Throwable -> L13
            return
        L22:
            java.lang.String r2 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "火花弹窗异常: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "DYHelper"
            p000.C0888ux.m5977(r3, r2, r1)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "火花功能异常: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r0)
            r5.show()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r65 = this;
            r0 = r65
            int r1 = r0.f4729
            r4 = 19
            r7 = 13
            r8 = 10
            r9 = 14
            r10 = 15
            r11 = 5
            r12 = 0
            r13 = 0
            r14 = 1
            switch(r1) {
                case 0: goto Laa8;
                case 1: goto L9c7;
                case 2: goto L94a;
                case 3: goto L7ef;
                case 4: goto L7e2;
                case 5: goto L7d5;
                case 6: goto L7cd;
                case 7: goto L7b4;
                case 8: goto L773;
                case 9: goto L2a;
                case 10: goto L26;
                default: goto L15;
            }
        L15:
            android.app.Activity r0 = r0.f4730
            ry1 r1 = p000.ry1.f9602
            java.lang.String r1 = r1.m5303(r0)
            xx0 r2 = new xx0
            r2.<init>(r0, r1, r9)
            r0.runOnUiThread(r2)
            return
        L26:
            r0.m2508()
            return
        L2a:
            android.app.Activity r0 = r0.f4730
            bv1 r17 = p000.bv1.f1853
            android.widget.LinearLayout r1 = p000.bv1.f1863
            if (r1 != 0) goto L34
            goto L772
        L34:
            android.widget.LinearLayout r15 = p000.bv1.f1865
            if (r15 != 0) goto L3a
            goto L772
        L3a:
            boolean r16 = r0.isFinishing()
            if (r16 != 0) goto L772
            boolean r16 = r0.isDestroyed()
            if (r16 == 0) goto L48
            goto L772
        L48:
            boolean r13 = p000.i81.m2670(r13)
            ou1 r23 = new ou1
            pu1 r25 = p000.pu1.f8720
            eu1 r5 = new eu1
            r6 = 22
            r5.<init>(r6)
            tu1 r24 = new tu1
            r21 = 0
            r22 = 0
            r16 = 1
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildActivationMenuSection"
            java.lang.String r20 = "buildActivationMenuSection(Landroid/app/Activity;)Landroid/view/View;"
            r6 = r15
            r15 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r20 = "activation_menu"
            java.lang.String r21 = "激活菜单"
            java.lang.String r22 = "激活菜单 浮窗按钮 音量键组合 分享界面注入 快捷操作"
            r18 = r23
            r19 = r25
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r5 = r18
            ou1 r24 = new ou1
            qj0 r15 = new qj0
            r2 = 8
            r15.<init>(r2, r13)
            tu1 r30 = new tu1
            r21 = 0
            r22 = 11
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildTabFilterSection"
            java.lang.String r20 = "buildTabFilterSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "bottom_tab_filter"
            java.lang.String r27 = "底栏Tab过滤"
            java.lang.String r28 = "底栏Tab过滤 隐藏tab 朋友 发布 消息 我的 探索 商城 同城 底部导航"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r2 = r24
            ou1 r24 = new ou1
            qj0 r15 = new qj0
            r3 = 12
            r15.<init>(r3, r13)
            tu1 r30 = new tu1
            r22 = 22
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildTopTabFilterSection"
            java.lang.String r20 = "buildTopTabFilterSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "top_tab_filter"
            java.lang.String r27 = "顶栏Tab过滤"
            java.lang.String r28 = "顶栏Tab过滤 隐藏顶栏 关注 热点 直播 精选 商城 经验 团购 同城 自适应"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r3 = r24
            ou1 r24 = new ou1
            eu1 r15 = new eu1
            r15.<init>(r11)
            uu1 r30 = new uu1
            r22 = 3
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildVideoFilterSection"
            java.lang.String r20 = "buildVideoFilterSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "video_filter"
            java.lang.String r27 = "视频流过滤"
            java.lang.String r28 = "视频流过滤 过滤广告 过滤直播 过滤图文 关键词黑名单 用户UID黑名单 最短时长 最长时长 最低点赞数 仅推荐流"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r34 = r24
            ou1 r24 = new ou1
            eu1 r15 = new eu1
            r15.<init>(r8)
            ny0 r30 = new ny0
            r22 = 20
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildDurationAlertSection"
            java.lang.String r20 = "buildDurationAlertSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "duration_alert"
            java.lang.String r27 = "时长提醒"
            java.lang.String r28 = "时长提醒 连续使用 提醒休息 重复提醒 振动 提醒文案"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r35 = r24
            ou1 r24 = new ou1
            eu1 r15 = new eu1
            r8 = 11
            r15.<init>(r8)
            ny0 r30 = new ny0
            r22 = 21
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildBlockDouyinDurationReminderSection"
            java.lang.String r20 = "buildBlockDouyinDurationReminderSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "block_douyin_duration_reminder"
            java.lang.String r27 = "屏蔽抖音官方时长提醒弹窗"
            java.lang.String r28 = "屏蔽抖音官方时长提醒弹窗"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r23 = r24
            r8 = 3
            ou1 r24 = new ou1
            eu1 r15 = new eu1
            r8 = 12
            r15.<init>(r8)
            ny0 r30 = new ny0
            r22 = 22
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildLongVideoAlertSection"
            java.lang.String r20 = "buildLongVideoAlertSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "long_video_alert"
            java.lang.String r27 = "长视频提醒"
            java.lang.String r28 = "长视频提醒 视频时长 超长视频 提醒阈值"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r8 = r24
            ou1 r24 = new ou1
            eu1 r15 = new eu1
            r15.<init>(r7)
            ny0 r30 = new ny0
            r22 = 23
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildAutoScrollSection"
            java.lang.String r20 = "buildAutoScrollSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "auto_scroll"
            java.lang.String r27 = "自动下滑"
            java.lang.String r28 = "自动下滑 自动播放下一个 视频 图文 文章 停留时长 触摸重新计时 滑动提示"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r37 = r24
            ou1 r24 = new ou1
            eu1 r15 = new eu1
            r15.<init>(r9)
            ny0 r30 = new ny0
            r22 = 24
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildAutoPauseSection"
            java.lang.String r20 = "buildAutoPauseSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "auto_pause"
            java.lang.String r27 = "播放完成自动暂停"
            java.lang.String r28 = "播放完成自动暂停 暂停视频 显示提示 Toast"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r38 = r24
            ou1 r24 = new ou1
            eu1 r15 = new eu1
            r15.<init>(r10)
            ny0 r30 = new ny0
            r22 = 25
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildSeekBarTimeSection"
            java.lang.String r20 = "buildSeekBarTimeSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "seekbar_time"
            java.lang.String r27 = "进度条时间显示"
            java.lang.String r28 = "进度条时间 当前时间/总时长 字体大小 颜色 透明度"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r39 = r24
            ou1 r24 = new ou1
            nq1 r15 = new nq1
            r9 = 27
            r15.<init>(r9)
            ny0 r30 = new ny0
            r22 = 26
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildProfileVideoOverlayAlphaSection"
            java.lang.String r20 = "buildProfileVideoOverlayAlphaSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "profile_video_overlay_alpha"
            java.lang.String r27 = "主页视频界面透明度"
            java.lang.String r28 = "作者主页 视频详情 搜索框 评论输入框 底栏 透明度"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r9 = r24
            ou1 r24 = new ou1
            dt1 r15 = new dt1
            r15.<init>(r12)
            ny0 r30 = new ny0
            r22 = 27
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildVideoSpeedSection"
            java.lang.String r20 = "buildVideoSpeedSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "video_speed"
            java.lang.String r27 = "视频倍速扩展"
            java.lang.String r28 = "视频倍速扩展 倍速 播放速度 长按 左右侧 1-5倍"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r41 = r24
            ou1 r24 = new ou1
            qj0 r15 = new qj0
            r7 = 6
            r15.<init>(r7, r13)
            ny0 r30 = new ny0
            r22 = 28
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildChapterAdSkipSection"
            java.lang.String r20 = "buildChapterAdSkipSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "chapter_ad_skip"
            java.lang.String r27 = "视频章节广告跳过"
            java.lang.String r28 = "视频章节广告跳过 章节 节点进度条 广告 营销章节 自动跳过"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r7 = r24
            ou1 r24 = new ou1
            dt1 r15 = new dt1
            r15.<init>(r14)
            ny0 r30 = new ny0
            r22 = 29
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildFeedDoubleTapLikeBlockSection"
            java.lang.String r20 = "buildFeedDoubleTapLikeBlockSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "feed_double_tap_like_block"
            java.lang.String r27 = "禁用双击点赞"
            java.lang.String r28 = "禁用双击点赞 双击误触 点赞拦截 Feed 双击手势"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r31 = r24
            r43 = 16
            ou1 r24 = new ou1
            dt1 r15 = new dt1
            r15.<init>(r11)
            tu1 r30 = new tu1
            r22 = 1
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildFeedPreloadSection"
            java.lang.String r20 = "buildFeedPreloadSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "feed_preload"
            java.lang.String r27 = "Feed流预加载控制"
            java.lang.String r28 = "Feed流预加载 视频预加载 预加载数量 预加载清晰度 标清 高清 超清 极清"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r32 = r24
            r11 = 4
            ou1 r24 = new ou1
            dt1 r15 = new dt1
            r11 = 6
            r15.<init>(r11)
            tu1 r30 = new tu1
            r22 = 2
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildOfflineCacheCountSection"
            java.lang.String r20 = "buildOfflineCacheCountSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "offline_cache_count"
            java.lang.String r27 = "离线缓存视频数量"
            java.lang.String r28 = "离线缓存 视频数量 自动缓存 缓存上限 10 500"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r33 = r24
            r11 = 24
            ou1 r24 = new ou1
            qj0 r15 = new qj0
            r11 = 7
            r15.<init>(r11, r13)
            tu1 r30 = new tu1
            r22 = 3
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildFeedRightDislikeButtonSection"
            java.lang.String r20 = "buildFeedRightDislikeButtonSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "feed_right_dislike_button"
            java.lang.String r27 = "右侧按钮管理器"
            java.lang.String r28 = "右侧按钮管理器 不感兴趣按钮 自动连播 连播开关 Feed右侧按钮"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r11 = r34
            r34 = r24
            ou1 r24 = new ou1
            dt1 r15 = new dt1
            r14 = 12
            r15.<init>(r14)
            tu1 r30 = new tu1
            r22 = 4
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildFeedRightControlsHideSection"
            java.lang.String r20 = "buildFeedRightControlsHideSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "feed_right_controls_hide"
            java.lang.String r27 = "Feed右侧控件屏蔽"
            java.lang.String r28 = "Feed右侧控件屏蔽 点赞 评论 收藏 分享 头像 关注 日常圆圈"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r14 = r35
            r35 = r24
            ou1 r24 = new ou1
            dt1 r15 = new dt1
            r15.<init>(r10)
            tu1 r30 = new tu1
            r22 = 5
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildFeedFollowConfirmSection"
            java.lang.String r20 = "buildFeedFollowConfirmSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "feed_follow_confirm"
            java.lang.String r27 = "Feed关注二次确认"
            java.lang.String r28 = "Feed关注二次确认 关注确认 防误触 只拦截Feed流"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r36 = r24
            r47 = 10
            ou1 r24 = new ou1
            dt1 r15 = new dt1
            r10 = 17
            r15.<init>(r10)
            tu1 r30 = new tu1
            r22 = 6
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildLiveRoomAudienceExactCountSection"
            java.lang.String r20 = "buildLiveRoomAudienceExactCountSection(Landroid/app/Activity;)Landroid/view/View;"
            r29 = r15
            r15 = r30
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r26 = "live_room_audience_exact_count"
            java.lang.String r27 = "直播间精确人数显示"
            java.lang.String r28 = "直播间精确人数 在线人数 具体数字 万人显示 真实人数"
            r24.<init>(r25, r26, r27, r28, r29, r30)
            ou1 r49 = new ou1
            pu1 r51 = p000.pu1.f8721
            dt1 r10 = new dt1
            r10.<init>(r4)
            tu1 r15 = new tu1
            r22 = 7
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCommentControlSection"
            java.lang.String r20 = "buildCommentControlSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r50 = r51
            java.lang.String r51 = "comment_control"
            java.lang.String r52 = "评论区控件管理"
            java.lang.String r53 = "评论区控件管理 隐藏头像 隐藏昵称 隐藏内容 隐藏回复 隐藏时间 隐藏点赞 隐藏踩 评论区透明度 发布地点 IP属地 展开评论"
            r54 = r10
            r55 = r15
            r49.<init>(r50, r51, r52, r53, r54, r55)
            r51 = r50
            ou1 r50 = new ou1
            dt1 r4 = new dt1
            r10 = 21
            r4.<init>(r10)
            tu1 r15 = new tu1
            r22 = 8
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCommentPanelUiControlSection"
            java.lang.String r20 = "buildCommentPanelUiControlSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r52 = "comment_panel_ui_control"
            java.lang.String r53 = "评论区界面控制"
            java.lang.String r54 = "评论区界面控制 旧版评论区 XML Compose KMP 隐藏输入框 大家都在搜 搜索推荐 同时发布为作品 预览作品 搜索按钮"
            r55 = r4
            r56 = r15
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r27 = r39
            r39 = r50
            ou1 r50 = new ou1
            dt1 r4 = new dt1
            r10 = 22
            r4.<init>(r10)
            tu1 r15 = new tu1
            r22 = 9
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCommentBgSection"
            java.lang.String r20 = "buildCommentBgSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r52 = "comment_bg"
            java.lang.String r53 = "评论区背景"
            java.lang.String r54 = "评论区背景 纯色背景 自定义图片 高斯模糊 背景模式 透明度"
            r55 = r4
            r56 = r15
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r40 = r50
            r4 = 14
            ou1 r50 = new ou1
            dt1 r10 = new dt1
            r15 = 23
            r10.<init>(r15)
            tu1 r15 = new tu1
            r22 = 10
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildPreciseTimeSection"
            java.lang.String r20 = "buildPreciseTimeSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r52 = "precise_time"
            java.lang.String r53 = "评论精确时间"
            java.lang.String r54 = "评论精确时间 显示真实时间 替换相对时间 时间格式"
            r55 = r10
            r56 = r15
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r29 = r41
            r41 = r50
            ou1 r50 = new ou1
            dt1 r10 = new dt1
            r15 = 24
            r10.<init>(r15)
            tu1 r15 = new tu1
            r22 = 12
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCommentImageWatermarkSection"
            java.lang.String r20 = "buildCommentImageWatermarkSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r52 = "comment_image_watermark"
            java.lang.String r53 = "评论区图片无水印下载"
            java.lang.String r54 = "自动拦截评论区带水印图片，替换为无水印原图"
            r55 = r10
            r56 = r15
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r42 = r50
            r10 = 13
            ou1 r50 = new ou1
            dt1 r15 = new dt1
            r4 = 25
            r15.<init>(r4)
            tu1 r56 = new tu1
            r22 = 13
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCommentAudioDownloadSection"
            java.lang.String r20 = "buildCommentAudioDownloadSection(Landroid/app/Activity;)Landroid/view/View;"
            r55 = r15
            r15 = r56
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r52 = "comment_audio_download"
            java.lang.String r53 = "评论语音下载"
            java.lang.String r54 = "评论语音下载 双击播放控件 绿色下载按钮 WAV 捕获"
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r4 = r43
            r43 = r50
            ou1 r50 = new ou1
            qj0 r15 = new qj0
            r4 = 9
            r15.<init>(r4, r13)
            tu1 r56 = new tu1
            r22 = 14
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildVoiceReplaceSection"
            java.lang.String r20 = "buildVoiceReplaceSection(Landroid/app/Activity;)Landroid/view/View;"
            r55 = r15
            r15 = r56
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r52 = "voice_replace"
            java.lang.String r53 = "语音替换"
            java.lang.String r54 = "语音替换 MP3 音乐 评论语音 私信语音 录音替换"
            r50.<init>(r51, r52, r53, r54, r55, r56)
            r44 = r50
            r4 = 4
            ou1 r50 = new ou1
            qj0 r15 = new qj0
            r4 = r47
            r15.<init>(r4, r13)
            tu1 r56 = new tu1
            r22 = 15
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCommentBookmarkSection"
            java.lang.String r20 = "buildCommentBookmarkSection(Landroid/app/Activity;)Landroid/view/View;"
            r55 = r15
            r15 = r56
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r52 = "comment_bookmark"
            java.lang.String r53 = "评论书签"
            java.lang.String r54 = "评论书签 自动扫描 新回复提醒 书签列表 主动查询"
            r50.<init>(r51, r52, r53, r54, r55, r56)
            ou1 r51 = new ou1
            pu1 r53 = p000.pu1.f8722
            dt1 r4 = new dt1
            r15 = 26
            r4.<init>(r15)
            tu1 r15 = new tu1
            r22 = 16
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildLiquidGlassBottomBarSection"
            java.lang.String r20 = "buildLiquidGlassBottomBarSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r52 = r53
            java.lang.String r53 = "liquid_glass_bottom_bar"
            java.lang.String r54 = "液态玻璃底栏"
            java.lang.String r55 = "液态玻璃底栏 MIUIX 模糊 毛玻璃 底部导航 KernelSU 缩放 大小 尺寸"
            r56 = r4
            r57 = r15
            r51.<init>(r52, r53, r54, r55, r56, r57)
            r53 = r52
            ou1 r47 = new ou1
            qj0 r4 = new qj0
            r15 = 11
            r4.<init>(r15, r13)
            tu1 r15 = new tu1
            r22 = 17
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCleanModeSection"
            java.lang.String r20 = "buildCleanModeSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r54 = "clean_mode"
            java.lang.String r55 = "清爽模式"
            java.lang.String r56 = "清爽模式 沉浸式 透明度 右侧互动区 底部信息区 视频暂停显示控件 触控恢复控件显示 触摸恢复控件显示 底栏隐藏 底栏占位 底栏是否占位 显示底栏文字 底栏文字透明度 消息红点 数字角标 杂项控件管理 合集 全屏观看 弹幕按钮 淡出 进度条 进度条透明度 播放进度"
            r57 = r4
            r58 = r15
            r52 = r47
            r52.<init>(r53, r54, r55, r56, r57, r58)
            ou1 r52 = new ou1
            dt1 r4 = new dt1
            r15 = 27
            r4.<init>(r15)
            tu1 r15 = new tu1
            r22 = 18
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildImmersiveStatusBarSection"
            java.lang.String r20 = "buildImmersiveStatusBarSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r54 = "immersive_status_bar"
            java.lang.String r55 = "沉浸式状态栏"
            java.lang.String r56 = "沉浸式状态栏 隐藏状态栏 全屏显示 系统状态栏"
            r57 = r4
            r58 = r15
            r52.<init>(r53, r54, r55, r56, r57, r58)
            r48 = r52
            r4 = 15
            ou1 r52 = new ou1
            dt1 r15 = new dt1
            r4 = 28
            r15.<init>(r4)
            tu1 r58 = new tu1
            r22 = 19
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildProfileInjectSection"
            java.lang.String r20 = "buildProfileInjectSection(Landroid/app/Activity;)Landroid/view/View;"
            r57 = r15
            r15 = r58
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r54 = "profile_inject"
            java.lang.String r55 = "个人主页增强"
            java.lang.String r56 = "个人主页增强 UID展示 书签按钮 抖音号下方注入"
            r52.<init>(r53, r54, r55, r56, r57, r58)
            r26 = r38
            r38 = r49
            r49 = r52
            r4 = 16
            ou1 r52 = new ou1
            eu1 r15 = new eu1
            r15.<init>(r12)
            tu1 r58 = new tu1
            r22 = 20
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildInfoBarSection"
            java.lang.String r20 = "buildInfoBarSection(Landroid/app/Activity;)Landroid/view/View;"
            r57 = r15
            r15 = r58
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r54 = "info_bar"
            java.lang.String r55 = "视频信息条"
            java.lang.String r56 = "视频信息条 发布时间 位置信息 字体大小 字体颜色 颜色预设"
            r52.<init>(r53, r54, r55, r56, r57, r58)
            ou1 r53 = new ou1
            pu1 r55 = p000.pu1.f8723
            qj0 r12 = new qj0
            r12.<init>(r10, r13)
            tu1 r15 = new tu1
            r22 = 21
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildIdleExitSection"
            java.lang.String r20 = "buildIdleExitSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r54 = r55
            java.lang.String r55 = "idle_exit"
            java.lang.String r56 = "空闲退出"
            java.lang.String r57 = "空闲退出 自动退出 锁屏 倒计时 空闲时长 内测"
            r58 = r12
            r59 = r15
            r53.<init>(r54, r55, r56, r57, r58, r59)
            r55 = r54
            ou1 r54 = new ou1
            eu1 r10 = new eu1
            r12 = 1
            r10.<init>(r12)
            tu1 r15 = new tu1
            r22 = 23
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildTopNotificationManagerSection"
            java.lang.String r20 = "buildTopNotificationManagerSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r56 = "top_notification_manager"
            java.lang.String r57 = "顶部通知管理器"
            java.lang.String r58 = "顶部通知管理器 下载进度 火花续期 火星 营地 通透度"
            r59 = r10
            r60 = r15
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r45 = r50
            r50 = r52
            r52 = r54
            ou1 r54 = new ou1
            eu1 r10 = new eu1
            r12 = 2
            r10.<init>(r12)
            tu1 r15 = new tu1
            r22 = 24
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildDownloadSection"
            java.lang.String r20 = "buildDownloadSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r56 = "download"
            java.lang.String r57 = "下载设置"
            java.lang.String r58 = "下载设置 下载目录 文件命名 下载通知 保存路径"
            r59 = r10
            r60 = r15
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r46 = r51
            r51 = r53
            r53 = r54
            ou1 r54 = new ou1
            eu1 r10 = new eu1
            r12 = 3
            r10.<init>(r12)
            tu1 r15 = new tu1
            r22 = 25
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildVersionUpdateSection"
            java.lang.String r20 = "buildVersionUpdateSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r56 = "version_update"
            java.lang.String r57 = "版本更新"
            java.lang.String r58 = "版本更新 检查更新 下载更新 跳过版本"
            r59 = r10
            r60 = r15
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r10 = r54
            ou1 r54 = new ou1
            qj0 r12 = new qj0
            r15 = 14
            r12.<init>(r15, r13)
            tu1 r15 = new tu1
            r22 = 26
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildSparkSection"
            java.lang.String r20 = "buildSparkSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r56 = "spark"
            java.lang.String r57 = "火花与火星"
            java.lang.String r58 = "火花续期 自动续期 续期消息 火花 火星 小火人 亲密度 经验 自动任务 互发消息 图片 自动领取 自动投喂 食物 伪装火花天数"
            r59 = r12
            r60 = r15
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r12 = r54
            ou1 r54 = new ou1
            qj0 r15 = new qj0
            r4 = 15
            r15.<init>(r4, r13)
            tu1 r60 = new tu1
            r22 = 27
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCampSection"
            java.lang.String r20 = "buildCampSection(Landroid/app/Activity;)Landroid/view/View;"
            r59 = r15
            r15 = r60
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r56 = "pet_elf_camp"
            java.lang.String r57 = "小火人口袋营地"
            java.lang.String r58 = "口袋营地 营地管理 自动收菜 自动种地 自动浇水 作物 收获 种植 成熟 空闲地块 种子 小火人"
            r54.<init>(r55, r56, r57, r58, r59, r60)
            r4 = r54
            ou1 r54 = new ou1
            eu1 r15 = new eu1
            r25 = r2
            r2 = 4
            r15.<init>(r2)
            tu1 r60 = new tu1
            r22 = 28
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildCacheManagementSection"
            java.lang.String r20 = "buildCacheManagementSection(Landroid/app/Activity;)Landroid/view/View;"
            r59 = r15
            r15 = r60
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r56 = "cache"
            java.lang.String r57 = "缓存管理"
            java.lang.String r58 = "清除缓存 DexKit缓存 用户配置缓存 重置设置 日志 DyLog"
            r54.<init>(r55, r56, r57, r58, r59, r60)
            ou1 r55 = new ou1
            pu1 r57 = p000.pu1.f8724
            qj0 r2 = new qj0
            r15 = 16
            r2.<init>(r15, r13)
            tu1 r15 = new tu1
            r22 = 29
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildHiddenContactSection"
            java.lang.String r20 = "buildHiddenContactSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r56 = r57
            java.lang.String r57 = "hidden_contacts"
            java.lang.String r58 = "隐藏联系人"
            java.lang.String r59 = "隐藏联系人 关注 粉丝 消息 搜索 聊天记录 分享 联系人"
            r60 = r2
            r61 = r15
            r55.<init>(r56, r57, r58, r59, r60, r61)
            r57 = r56
            ou1 r56 = new ou1
            qj0 r2 = new qj0
            r15 = 17
            r2.<init>(r15, r13)
            uu1 r15 = new uu1
            r22 = 0
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildIMConversationDeleteEntrySection"
            java.lang.String r20 = "buildIMConversationDeleteEntrySection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r58 = "im_conversation_delete_entry"
            java.lang.String r59 = "会话批量删除"
            java.lang.String r60 = "消息页 顶部 注入 会话 批量删除 入口"
            r61 = r2
            r62 = r15
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r2 = r56
            ou1 r56 = new ou1
            eu1 r15 = new eu1
            r65 = r2
            r2 = 6
            r15.<init>(r2)
            uu1 r62 = new uu1
            r22 = 1
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildIMAntiRecallSection"
            java.lang.String r20 = "buildIMAntiRecallSection(Landroid/app/Activity;)Landroid/view/View;"
            r61 = r15
            r15 = r62
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r58 = "im_anti_recall"
            java.lang.String r59 = "私信防撤回"
            java.lang.String r60 = "私信防撤回 防撤回 撤回标记"
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r2 = r56
            ou1 r56 = new ou1
            eu1 r15 = new eu1
            r28 = r2
            r2 = 7
            r15.<init>(r2)
            uu1 r62 = new uu1
            r22 = 2
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildIMTimeLabelSection"
            java.lang.String r20 = "buildIMTimeLabelSection(Landroid/app/Activity;)Landroid/view/View;"
            r61 = r15
            r15 = r62
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r58 = "im_time_label"
            java.lang.String r59 = "聊天时间标签"
            java.lang.String r60 = "聊天时间标签 精确时间 撤回标记 时间格式 显示文字 换行"
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r2 = r56
            ou1 r56 = new ou1
            eu1 r15 = new eu1
            r30 = r2
            r2 = 8
            r15.<init>(r2)
            uu1 r62 = new uu1
            r22 = 4
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildIMPrivacyStatusSection"
            java.lang.String r20 = "buildIMPrivacyStatusSection(Landroid/app/Activity;)Landroid/view/View;"
            r61 = r15
            r15 = r62
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r58 = "im_privacy_status"
            java.lang.String r59 = "聊天状态隐私"
            java.lang.String r60 = "已读状态 已读回执 上报关闭"
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r2 = r56
            ou1 r63 = new ou1
            qj0 r15 = new qj0
            r64 = r2
            r2 = 18
            r15.<init>(r2, r13)
            uu1 r62 = new uu1
            r22 = 5
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildGroupApplyAutoApprovalSection"
            java.lang.String r20 = "buildGroupApplyAutoApprovalSection(Landroid/app/Activity;)Landroid/view/View;"
            r61 = r15
            r15 = r62
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r58 = "group_apply_auto_approval"
            java.lang.String r59 = "群管理入群自动审批"
            java.lang.String r60 = "群申请 入群申请 自动审批 冷启动 轮询 间隔 秒 群管理入群自动审批 入群"
            r56 = r63
            r56.<init>(r57, r58, r59, r60, r61, r62)
            ou1 r56 = new ou1
            eu1 r2 = new eu1
            r13 = 9
            r2.<init>(r13)
            uu1 r15 = new uu1
            r22 = 6
            java.lang.Class<bv1> r18 = p000.bv1.class
            java.lang.String r19 = "buildIMAutoReadSection"
            java.lang.String r20 = "buildIMAutoReadSection(Landroid/app/Activity;)Landroid/view/View;"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r58 = "im_auto_read"
            java.lang.String r59 = "聊天自动已读"
            java.lang.String r60 = "定时已读 自动已读 互动消息 白名单 黑名单"
            r61 = r2
            r62 = r15
            r56.<init>(r57, r58, r59, r60, r61, r62)
            r59 = r65
            r20 = r3
            r18 = r5
            r21 = r11
            r22 = r14
            r19 = r25
            r60 = r28
            r61 = r30
            r25 = r37
            r57 = r54
            r58 = r55
            r62 = r64
            r30 = r7
            r28 = r9
            r54 = r10
            r55 = r12
            r37 = r24
            r64 = r56
            r56 = r4
            r24 = r8
            ou1[] r2 = new p000.ou1[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            sm1 r3 = new sm1
            r3.<init>()
            p000.bv1.m1071(r0, r3, r2, r1, r6)
        L772:
            return
        L773:
            android.app.Activity r1 = r0.f4730
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L77f
            if (r0 != 0) goto L781
            p000.ui1.m5897(r1)     // Catch: java.lang.Throwable -> L77f
            goto L781
        L77f:
            r0 = move-exception
            goto L7a3
        L781:
            bv1 r0 = p000.bv1.f1853     // Catch: java.lang.Throwable -> L77f
            r1.getClass()     // Catch: java.lang.Throwable -> L77f
            boolean r2 = p000.i81.f4958     // Catch: java.lang.Throwable -> L77f
            if (r2 == 0) goto L78b
            goto L79f
        L78b:
            r46 = 1
            p000.i81.f4958 = r46     // Catch: java.lang.Throwable -> L77f
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.Throwable -> L77f
            r4 r3 = new r4     // Catch: java.lang.Throwable -> L77f
            r8 = 3
            r3.<init>(r1, r8)     // Catch: java.lang.Throwable -> L77f
            java.lang.String r4 = "DY-Settings-BetaWarmup"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L77f
            r2.start()     // Catch: java.lang.Throwable -> L77f
        L79f:
            r0.m1080(r1)     // Catch: java.lang.Throwable -> L77f
            goto L7b3
        L7a3:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "设置 XML UI 打开失败: "
            java.lang.String r4 = "DYHelper"
            p000.AbstractC0602nx.m4145(r3, r2, r4, r0)
            java.lang.String r2 = "设置"
            p000.u81.m5815(r1, r2, r0)
        L7b3:
            return
        L7b4:
            android.app.Activity r1 = r0.f4730
            si1 r0 = p000.ui1.m5883()     // Catch: java.lang.Throwable -> L7bb
            goto L7c2
        L7bb:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L7c2:
            ii0 r2 = new ii0
            r15 = 24
            r2.<init>(r1, r15, r0)
            r1.runOnUiThread(r2)
            return
        L7cd:
            android.app.Activity r0 = r0.f4730
            dk1 r1 = p000.dk1.f3201
            p000.dk1.m1769(r0)
            return
        L7d5:
            android.app.Activity r0 = r0.f4730
            java.lang.String r1 = "主动获取失败：接口未返回可下载作品"
            r12 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r12)
            r0.show()
            return
        L7e2:
            r12 = r14
            android.app.Activity r0 = r0.f4730
            java.lang.String r1 = "调试获取失败：接口未返回作品"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r12)
            r0.show()
            return
        L7ef:
            android.app.Activity r7 = r0.f4730
            cj1 r0 = p000.cj1.f2169
            zi1 r0 = r0.m1237(r7)     // Catch: java.lang.Throwable -> L7f8
            goto L7ff
        L7f8:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L7ff:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 == 0) goto L80c
            java.lang.String r2 = "ra339ec5cc82687ca"
            java.lang.String r3 = "debug active profile load failed"
            p000.C0888ux.m5977(r2, r3, r1)
        L80c:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L813
            goto L865
        L813:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = p000.cj1.m1234()
            zi1 r14 = new zi1
            if (r0 != 0) goto L848
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r33 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            r52 = 65528(0xfff8, float:9.1824E-41)
            r53 = 0
            java.lang.String r34 = ""
            java.lang.String r35 = ""
            java.lang.String r36 = ""
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r43 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r15 = r33
            goto L849
        L848:
            r15 = r0
        L849:
            jz r17 = p000.C0450jz.f5672
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L859
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
        L859:
            r20 = r0
            java.lang.String r16 = "error"
            r18 = r17
            r19 = r17
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0 = r14
        L865:
            zi1 r0 = (p000.zi1) r0
            java.lang.Object r1 = r0.f13106
            java.util.List r2 = r0.f13105
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L88e
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L88e
            java.lang.String r3 = r0.f13108
            if (r3 == 0) goto L87c
            goto L88e
        L87c:
            java.lang.String r0 = "调试获取失败"
            java.lang.String r1 = "未获取到作品信息"
            com.example.dyhelper.p002ui.C0182.m1591(r7, r0, r1)
            hg1 r0 = new hg1
            r2 = 4
            r0.<init>(r7, r2)
            r7.runOnUiThread(r0)
            goto L949
        L88e:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L895
            goto L8bb
        L895:
            java.util.Iterator r3 = r2.iterator()
            r4 = r12
        L89a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L8bb
            java.lang.Object r5 = r3.next()
            f8 r5 = (p000.C0276f8) r5
            h8 r6 = r5.f3798
            h8 r8 = p000.EnumC0350h8.f4617
            if (r6 == r8) goto L8b2
            boolean r5 = r5.m2051()
            if (r5 == 0) goto L89a
        L8b2:
            int r4 = r4 + 1
            if (r4 < 0) goto L8b7
            goto L89a
        L8b7:
            p000.AbstractC1021yh.m6916()
            throw r13
        L8bb:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L8c2
            goto L8e2
        L8c2:
            java.util.Iterator r3 = r2.iterator()
            r4 = r12
        L8c7:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L8e2
            java.lang.Object r5 = r3.next()
            f8 r5 = (p000.C0276f8) r5
            h8 r5 = r5.f3798
            h8 r6 = p000.EnumC0350h8.f4615
            if (r5 != r6) goto L8c7
            int r4 = r4 + 1
            if (r4 < 0) goto L8de
            goto L8c7
        L8de:
            p000.AbstractC1021yh.m6916()
            throw r13
        L8e2:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L8e9
            goto L908
        L8e9:
            java.util.Iterator r3 = r2.iterator()
        L8ed:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L908
            java.lang.Object r4 = r3.next()
            f8 r4 = (p000.C0276f8) r4
            h8 r4 = r4.f3798
            h8 r5 = p000.EnumC0350h8.f4616
            if (r4 != r5) goto L8ed
            int r12 = r12 + 1
            if (r12 < 0) goto L904
            goto L8ed
        L904:
            p000.AbstractC1021yh.m6916()
            throw r13
        L908:
            r2.size()
            r1.size()
            int r3 = com.example.dyhelper.MainHook.f2222
            android.os.Handler r3 = com.example.dyhelper.p002ui.C0182.f2694
            int r2 = r2.size()
            int r1 = r1.size()
            java.lang.String r3 = " 个，未识别 "
            java.lang.String r4 = " 个"
            java.lang.String r5 = "识别 "
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r5, r2, r3, r1, r4)
            r7.getClass()
            java.lang.String r3 = "调试获取完成"
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1592(r3)
            java.lang.String r2 = com.example.dyhelper.p002ui.C0182.m1593(r1)
            f52 r6 = p000.f52.f3754
            d52 r1 = new d52
            r5 = 100
            r8 = 1600(0x640, double:7.905E-321)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.example.dyhelper.p002ui.C0182.m1597(r1)
            ii0 r1 = new ii0
            r2 = 18
            r1.<init>(r7, r2, r0)
            r7.runOnUiThread(r1)
        L949:
            return
        L94a:
            android.app.Activity r14 = r0.f4730
            cj1 r0 = p000.cj1.f2169
            java.util.List r0 = r0.m1236(r14)     // Catch: java.lang.Throwable -> L953
            goto L95a
        L953:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L95a:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 == 0) goto L967
            java.lang.String r2 = "ra339ec5cc82687ca"
            java.lang.String r3 = "active profile load failed"
            p000.C0888ux.m5977(r2, r3, r1)
        L967:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L96c
            goto L96d
        L96c:
            r13 = r0
        L96d:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L973
            jz r13 = p000.C0450jz.f5672
        L973:
            r0 = r13
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L9b7
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "共 "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " 个作品，请选择下载"
            r2.append(r1)
            java.lang.String r11 = r2.toString()
            r14.getClass()
            java.lang.String r10 = "获取完成"
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1592(r10)
            java.lang.String r9 = com.example.dyhelper.p002ui.C0182.m1593(r1)
            f52 r13 = p000.f52.f3754
            d52 r8 = new d52
            r12 = 100
            r15 = 900(0x384, double:4.447E-321)
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            com.example.dyhelper.p002ui.C0182.m1597(r8)
            ii0 r1 = new ii0
            r1.<init>(r0, r4, r14)
            r14.runOnUiThread(r1)
            goto L9c6
        L9b7:
            java.lang.String r0 = "主动获取失败"
            java.lang.String r1 = "未获取到可下载作品"
            com.example.dyhelper.p002ui.C0182.m1591(r14, r0, r1)
            hg1 r0 = new hg1
            r0.<init>(r14, r11)
            r14.runOnUiThread(r0)
        L9c6:
            return
        L9c7:
            android.app.Activity r0 = r0.f4730
            boolean r1 = p000.AbstractC0976x9.m6529()
            if (r1 != 0) goto L9da
            java.lang.String r1 = "火星发送测试仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r12)
            r0.show()
            goto Laa7
        L9da:
            java.util.concurrent.ConcurrentHashMap r1 = p000.ry1.f9620
            java.util.Map r1 = p000.ex0.m1975(r1)
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            f7 r1 = p000.AbstractC0984xh.m6661(r1)
            cf1 r2 = new cf1
            r10 = 13
            r2.<init>(r10)
            y30 r3 = new y30
            r4 = 1
            r3.<init>(r1, r4, r2)
            ib1 r1 = new ib1
            r4 = 16
            r1.<init>(r4)
            java.util.List r2 = p000.us1.m5949(r3)
            p000.AbstractC0019ai.m168(r2, r1)
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto La12
            jz r1 = p000.C0450jz.f5672
            goto La34
        La12:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto La21
            java.util.List r1 = p000.AbstractC1021yh.m6896(r2)
            goto La34
        La21:
            java.util.ArrayList r2 = p000.lz1.m3696(r2)
        La25:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La33
            java.lang.Object r3 = r1.next()
            r2.add(r3)
            goto La25
        La33:
            r1 = r2
        La34:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto La45
            java.lang.String r1 = "没有已识别的单聊会话，请先进入私信列表"
            r12 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r12)
            r0.show()
            goto Laa7
        La45:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r4)
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        La54:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La80
            java.lang.Object r4 = r3.next()
            ky1 r4 = (p000.ky1) r4
            ry1 r5 = p000.ry1.f9602
            java.lang.String r5 = p000.ry1.m5197(r4)
            long r6 = r4.f6324
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = " · UID "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r2.add(r4)
            goto La54
        La80:
            java.lang.String[] r3 = new java.lang.String[r12]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r0)
            java.lang.String r4 = "选择火星测试会话"
            android.app.AlertDialog$Builder r3 = r3.setTitle(r4)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            bc0 r4 = new bc0
            r4.<init>(r0, r11, r1)
            android.app.AlertDialog$Builder r0 = r3.setItems(r2, r4)
            java.lang.String r1 = "取消"
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r13)
            r0.show()
        Laa7:
            return
        Laa8:
            android.app.Activity r0 = r0.f4730
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.pg1.f8551
            java.lang.String r2 = "r86c859e3375e752"
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.pg1.f8554
            java.lang.String r4 = "营地完成后火星领取结束: 会话="
            boolean r5 = p000.pg1.m4530()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 == 0) goto Lad4
            boolean r5 = p000.AbstractC0976x9.m6529()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 != 0) goto Labf
            goto Lad4
        Labf:
            kt0 r5 = new kt0     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r6 = 15
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r6 = 60
            boolean r5 = p000.pg1.m4540(r6, r5)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 != 0) goto Ladc
            java.lang.String r0 = "营地完成后领取等待会话超时，跳过本次检查"
            r4 = 4
            p000.C0888ux.m5988(r2, r0, r13, r4, r13)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
        Lad4:
            r3.set(r12)
            goto Lb9c
        Lad9:
            r0 = move-exception
            goto Lb8a
        Ladc:
            if (r0 == 0) goto Laee
            boolean r5 = r0.isFinishing()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 != 0) goto Laea
            boolean r5 = r0.isDestroyed()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 == 0) goto Laeb
        Laea:
            r0 = r13
        Laeb:
            if (r0 == 0) goto Laee
            goto Lb16
        Laee:
            java.util.concurrent.atomic.AtomicReference r0 = p000.pg1.f8557     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r0 == 0) goto Lb0c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r0 == 0) goto Lb0c
            boolean r5 = r0.isFinishing()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 != 0) goto Lb0c
            boolean r5 = r0.isDestroyed()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 == 0) goto Lb0d
        Lb0c:
            r0 = r13
        Lb0d:
            if (r0 != 0) goto Lb16
            java.lang.String r0 = "营地完成后领取缺少前台 Activity，跳过本次检查"
            r4 = 4
            p000.C0888ux.m5988(r2, r0, r13, r4, r13)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            goto Lad4
        Lb16:
            kt0 r5 = new kt0     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r15 = 16
            r5.<init>(r15)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r6 = 90
            boolean r5 = p000.pg1.m4540(r6, r5)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 != 0) goto Lb2c
            java.lang.String r0 = "营地完成后领取等待火星执行锁超时，跳过本次检查"
            r4 = 4
            p000.C0888ux.m5988(r2, r0, r13, r4, r13)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            goto Lad4
        Lb2c:
            r5 = 1
            boolean r5 = r1.compareAndSet(r12, r5)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            if (r5 != 0) goto Lb3a
            java.lang.String r0 = "营地完成后领取竞争执行锁失败，跳过本次检查"
            r4 = 4
            p000.C0888ux.m5988(r2, r0, r13, r4, r13)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            goto Lad4
        Lb3a:
            lg1 r14 = new lg1     // Catch: java.lang.Throwable -> Lb85
            kg1 r15 = p000.kg1.f5912     // Catch: java.lang.Throwable -> Lb85
            r22 = 0
            r23 = 224(0xe0, float:3.14E-43)
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lb85
            mg1 r5 = p000.pg1.m4527(r0, r14)     // Catch: java.lang.Throwable -> Lb85
            int r6 = r5.f7125     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r1.set(r12)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            java.lang.String r1 = r5.f7129     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            p000.pg1.m4535(r0, r1, r6)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            int r0 = r5.f7122     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            int r1 = r5.f7127     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r5.append(r0)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            java.lang.String r0 = " 领取="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r5.append(r6)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            java.lang.String r0 = " 失败="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r5.append(r1)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            r4 = 4
            p000.C0888ux.m5988(r2, r0, r13, r4, r13)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            goto Lad4
        Lb85:
            r0 = move-exception
            r1.set(r12)     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
            throw r0     // Catch: java.lang.Throwable -> Lad9 java.lang.InterruptedException -> Lb93
        Lb8a:
            java.lang.String r1 = "营地完成后火星领取异常"
            p000.C0888ux.m5977(r2, r1, r0)     // Catch: java.lang.Throwable -> Lb91
            goto Lad4
        Lb91:
            r0 = move-exception
            goto Lb9d
        Lb93:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb91
            r0.interrupt()     // Catch: java.lang.Throwable -> Lb91
            goto Lad4
        Lb9c:
            return
        Lb9d:
            r3.set(r12)
            throw r0
    }
}
