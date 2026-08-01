package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends android.app.Activity {

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ int f2568 = 0;

    /* JADX INFO: renamed from: ε */
    public final p000.h22 f2569;

    /* JADX INFO: renamed from: ζ */
    public final p000.h22 f2570;

    public MainActivity() {
            r2 = this;
            r2.<init>()
            mw0 r0 = new mw0
            r1 = 1
            r0.<init>(r2, r1)
            h22 r1 = new h22
            r1.<init>(r0)
            r2.f2569 = r1
            mw0 r0 = new mw0
            r1 = 2
            r0.<init>(r2, r1)
            h22 r1 = new h22
            r1.<init>(r0)
            r2.f2570 = r1
            return
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle r51) {
            r50 = this;
            r0 = r50
            super.onCreate(r51)
            android.view.Window r1 = r0.getWindow()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r2)
            boolean r2 = r0.m1568()
            java.lang.String r3 = "#FAFAFA"
            java.lang.String r4 = "#121212"
            if (r2 == 0) goto L1d
            int r2 = android.graphics.Color.parseColor(r4)
            goto L21
        L1d:
            int r2 = android.graphics.Color.parseColor(r3)
        L21:
            r1.setStatusBarColor(r2)
            boolean r2 = r0.m1568()
            if (r2 == 0) goto L2f
            int r2 = android.graphics.Color.parseColor(r4)
            goto L33
        L2f:
            int r2 = android.graphics.Color.parseColor(r3)
        L33:
            r1.setNavigationBarColor(r2)
            boolean r2 = r0.m1568()
            if (r2 != 0) goto L45
            android.view.View r1 = r1.getDecorView()
            r2 = 8208(0x2010, float:1.1502E-41)
            r1.setSystemUiVisibility(r2)
        L45:
            r1 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 20
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 16
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 14
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r12 = r0.m1568()
            if (r12 == 0) goto La4
            nw0 r13 = new nw0
            java.lang.String r28 = "#332196F3"
            java.lang.String r29 = "#337C4DFF"
            java.lang.String r14 = "#121212"
            java.lang.String r15 = "#1E1E1E"
            java.lang.String r16 = "#2A2A2A"
            java.lang.String r17 = "#FFFFFF"
            java.lang.String r18 = "#E0E0E0"
            java.lang.String r19 = "#9A9AA0"
            java.lang.String r20 = "#33FE2C55"
            java.lang.String r21 = "#2AFFFFFF"
            java.lang.String r22 = "#333333"
            java.lang.String r23 = "#4CAF50"
            java.lang.String r24 = "#334CAF50"
            java.lang.String r25 = "#FF9800"
            java.lang.String r26 = "#33FF9800"
            java.lang.String r27 = "#2196F3"
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto Lca
        La4:
            nw0 r14 = new nw0
            java.lang.String r29 = "#1A007AFF"
            java.lang.String r30 = "#1A7C4DFF"
            java.lang.String r15 = "#FAFAFA"
            java.lang.String r16 = "#FFFFFF"
            java.lang.String r17 = "#F5F5F7"
            java.lang.String r18 = "#1A1A2E"
            java.lang.String r19 = "#3D3D5C"
            java.lang.String r20 = "#8E8E93"
            java.lang.String r21 = "#1AFE2C55"
            java.lang.String r22 = "#12000000"
            java.lang.String r23 = "#E8E8ED"
            java.lang.String r24 = "#34C759"
            java.lang.String r25 = "#1A34C759"
            java.lang.String r26 = "#FF9500"
            java.lang.String r27 = "#1AFF9500"
            java.lang.String r28 = "#007AFF"
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r14
        Lca:
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r0)
            r12.setOrientation(r10)
            java.lang.String r14 = r13.f7781
            int r14 = android.graphics.Color.parseColor(r14)
            r12.setBackgroundColor(r14)
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r15 = -1
            r14.<init>(r15, r15)
            r12.setLayoutParams(r14)
            android.widget.ScrollView r14 = new android.widget.ScrollView
            r14.<init>(r0)
            r15 = 2
            r14.setOverScrollMode(r15)
            r15 = 0
            r14.setVerticalScrollBarEnabled(r15)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r7.<init>(r15, r15)
            r14.setLayoutParams(r7)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r10)
            a80 r15 = r0.m1567()
            java.lang.Object r15 = r15.invoke(r6)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            a80 r10 = r0.m1567()
            r18 = 48
            r19 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r18)
            java.lang.Object r10 = r10.invoke(r12)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            a80 r12 = r0.m1567()
            java.lang.Object r6 = r12.invoke(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            a80 r12 = r0.m1567()
            r18 = 36
            r20 = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
            java.lang.Object r12 = r12.invoke(r14)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r7.setPadding(r15, r10, r6, r12)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r10 = 1
            r6.setOrientation(r10)
            r10 = 17
            r6.setGravity(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r14 = -1
            r10.<init>(r14, r12)
            a80 r12 = r0.m1567()
            r14 = 22
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r12 = r12.invoke(r14)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r10.bottomMargin = r12
            r6.setLayoutParams(r10)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            r12 = 17
            r10.setGravity(r12)
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r14 = 1
            r12.setShape(r14)
            java.lang.String r14 = "#FE2C55"
            int r15 = android.graphics.Color.parseColor(r14)
            r12.setColor(r15)
            r10.setBackground(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            a80 r15 = r0.m1567()
            r18 = 72
            r21 = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
            java.lang.Object r15 = r15.invoke(r14)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r18 = r1
            a80 r1 = r0.m1567()
            java.lang.Object r1 = r1.invoke(r14)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12.<init>(r15, r1)
            r14 = 1
            r12.gravity = r14
            a80 r1 = r0.m1567()
            java.lang.Object r1 = r1.invoke(r9)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r12.bottomMargin = r1
            r10.setLayoutParams(r12)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r12 = "DY"
            r1.setText(r12)
            r12 = 1104150528(0x41d00000, float:26.0)
            r1.setTextSize(r12)
            r12 = -1
            r1.setTextColor(r12)
            r12 = 0
            r14 = 1
            r1.setTypeface(r12, r14)
            r12 = 17
            r1.setGravity(r12)
            r10.addView(r1)
            r6.addView(r10)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r10 = "DY Helper"
            r1.setText(r10)
            r10 = 1105199104(0x41e00000, float:28.0)
            r1.setTextSize(r10)
            java.lang.String r10 = r13.f7784
            int r12 = android.graphics.Color.parseColor(r10)
            r1.setTextColor(r12)
            r12 = 0
            r14 = 1
            r1.setTypeface(r12, r14)
            r12 = 17
            r1.setGravity(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            r12.<init>(r15, r15)
            r12.gravity = r14
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r5)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r12.bottomMargin = r14
            r1.setLayoutParams(r12)
            r6.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r12 = "DY 视频 / 图文 / 评论 / 私信增强模块"
            r1.setText(r12)
            r12 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r12)
            java.lang.String r12 = r13.f7786
            int r14 = android.graphics.Color.parseColor(r12)
            r1.setTextColor(r14)
            r14 = 17
            r1.setGravity(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r15, r15)
            r15 = 1
            r14.gravity = r15
            r1.setLayoutParams(r14)
            r6.addView(r1)
            r7.addView(r6)
            java.lang.String r1 = "正式功能"
            android.widget.TextView r1 = r0.m1566(r1, r13)
            r7.addView(r1)
            pw0 r22 = new pw0
            java.lang.String r26 = "Feed 流手势配置"
            java.lang.String r27 = "可为不同屏幕区域配置双击 / 长按动作；预览模式支持调整上下左右屏幕间距与触发面积。"
            java.lang.String r23 = "手势"
            java.lang.String r1 = r13.f7794
            java.lang.String r6 = r13.f7795
            r24 = r1
            r25 = r6
            r22.<init>(r23, r24, r25, r26, r27)
            r1 = r22
            r30 = r24
            r31 = r25
            pw0 r28 = new pw0
            java.lang.String r32 = "书签与原生互动动作"
            java.lang.String r33 = "手势可添加当前作品书签或作者主页书签，也可调用点赞、评论、收藏、分享、作者主页和关注；对应右侧控件被隐藏后仍可触发。"
            java.lang.String r29 = "动作"
            r28.<init>(r29, r30, r31, r32, r33)
            r6 = r28
            pw0 r28 = new pw0
            java.lang.String r32 = "禁用双击点赞"
            java.lang.String r33 = "可单独拦截 Feed 原生双击点赞；已配置的模块双击手势仍优先执行。"
            java.lang.String r29 = "双击"
            r28.<init>(r29, r30, r31, r32, r33)
            r14 = r28
            pw0 r28 = new pw0
            java.lang.String r32 = "音量键组合唤出"
            java.lang.String r33 = "先按音量+，再按音量-，快速唤出 DY Helper 操作菜单。"
            java.lang.String r29 = "音量"
            r28.<init>(r29, r30, r31, r32, r33)
            r15 = r28
            pw0 r28 = new pw0
            java.lang.String r32 = "分享界面注入"
            java.lang.String r33 = "在抖音分享面板中添加 DY Helper 快捷下载入口。"
            java.lang.String r29 = "分享"
            r28.<init>(r29, r30, r31, r32, r33)
            r22 = r10
            r10 = r28
            pw0[] r1 = new p000.pw0[]{r1, r6, r14, r15, r10}
            java.util.List r34 = p000.AbstractC1021yh.m6897(r1)
            ow0 r35 = new ow0
            r33 = r31
            java.lang.String r31 = "手势、音量键、分享面板入口"
            r28 = r35
            r35 = 1
            java.lang.String r29 = "入口"
            r32 = r30
            java.lang.String r30 = "激活菜单"
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            r1 = r28
            r30 = r32
            r31 = r33
            ow0 r32 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "视频 / 图片下载目录"
            java.lang.String r28 = "保留 /sdcard/dy/{nickname}_{currentTime} 等绝对共享存储路径语义，并兼容应用分身空间；无法精确写入时会提示重新选择目录。"
            java.lang.String r24 = "目录"
            java.lang.String r25 = "#FE2C55"
            java.lang.String r6 = r13.f7787
            r26 = r6
            r23.<init>(r24, r25, r26, r27, r28)
            r36 = r26
            pw0 r33 = new pw0
            java.lang.String r37 = "视频 / 图片命名规则"
            java.lang.String r38 = "视频、图片、动图、LivePhoto、音乐和评论媒体统一使用最终名称决策；确认弹窗输入优先，并自动处理非法字符与扩展名。"
            java.lang.String r34 = "命名"
            java.lang.String r35 = "#FE2C55"
            r33.<init>(r34, r35, r36, r37, r38)
            r24 = r33
            pw0 r33 = new pw0
            java.lang.String r37 = "统一媒体路径创建"
            java.lang.String r38 = "视频、图片、动图、LivePhoto、音乐、评论语音和评论表情共用同一套路径创建与失败提示逻辑。"
            java.lang.String r34 = "路径"
            java.lang.String r35 = "#FE2C55"
            r33.<init>(r34, r35, r36, r37, r38)
            r25 = r33
            pw0 r33 = new pw0
            java.lang.String r37 = "主页批量下载"
            java.lang.String r38 = "可主动查询个人主页作品数据并自动分页加载后批量下载，无需手动下滑加载作品列表。"
            java.lang.String r34 = "批量"
            java.lang.String r35 = "#FE2C55"
            r33.<init>(r34, r35, r36, r37, r38)
            r26 = r33
            pw0 r33 = new pw0
            java.lang.String r37 = "音频下载目录与命名"
            java.lang.String r38 = "音频可单独设置保存目录和文件命名规则。"
            java.lang.String r34 = "音频"
            java.lang.String r35 = "#FE2C55"
            r33.<init>(r34, r35, r36, r37, r38)
            r27 = r33
            pw0 r33 = new pw0
            java.lang.String r37 = "动图下载后合并"
            java.lang.String r38 = "下载图片、视频、音频后合成为小米格式 Motion Photo。"
            java.lang.String r34 = "动图"
            java.lang.String r35 = "#FE2C55"
            r33.<init>(r34, r35, r36, r37, r38)
            r28 = r33
            pw0 r33 = new pw0
            java.lang.String r37 = "下载通知"
            java.lang.String r38 = "下载时可在通知栏显示下载进度。"
            java.lang.String r34 = "通知"
            java.lang.String r35 = "#FE2C55"
            r33.<init>(r34, r35, r36, r37, r38)
            r29 = r33
            pw0[] r6 = new p000.pw0[]{r23, r24, r25, r26, r27, r28, r29}
            java.util.List r38 = p000.AbstractC1021yh.m6897(r6)
            r39 = 0
            java.lang.String r33 = "下载"
            java.lang.String r34 = "下载设置"
            java.lang.String r35 = "视频、图文、音频、动图保存"
            r37 = r36
            java.lang.String r36 = "#FE2C55"
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r36 = r32
            ow0 r37 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "启用视频流过滤"
            java.lang.String r28 = "在推荐流数据层过滤不想看的内容。"
            java.lang.String r24 = "总开"
            java.lang.String r6 = r13.f7792
            java.lang.String r10 = r13.f7793
            r25 = r6
            r26 = r10
            r23.<init>(r24, r25, r26, r27, r28)
            r40 = r25
            r41 = r26
            pw0 r38 = new pw0
            java.lang.String r42 = "仅过滤推荐流"
            java.lang.String r43 = "开启后不影响关注、收藏等其他页面。"
            java.lang.String r39 = "推荐"
            r38.<init>(r39, r40, r41, r42, r43)
            r24 = r38
            pw0 r38 = new pw0
            java.lang.String r42 = "过滤广告 / 直播 / 图文"
            java.lang.String r43 = "可分别移除广告卡片、直播推流和图文内容。"
            java.lang.String r39 = "广告"
            r38.<init>(r39, r40, r41, r42, r43)
            r25 = r38
            pw0 r38 = new pw0
            java.lang.String r42 = "过滤长视频 / 短视频"
            java.lang.String r43 = "支持按视频时长过滤过长或过短的视频。"
            java.lang.String r39 = "长短"
            r38.<init>(r39, r40, r41, r42, r43)
            r26 = r38
            pw0 r38 = new pw0
            java.lang.String r42 = "关键词与 UID 黑名单"
            java.lang.String r43 = "包含指定关键词或来自指定 UID 的视频会被过滤。"
            java.lang.String r39 = "黑名"
            r38.<init>(r39, r40, r41, r42, r43)
            r27 = r38
            pw0 r38 = new pw0
            java.lang.String r42 = "时长与点赞数条件"
            java.lang.String r43 = "支持设置最短时长、最长时长和最低点赞数过滤条件。"
            java.lang.String r39 = "条件"
            r38.<init>(r39, r40, r41, r42, r43)
            r28 = r38
            pw0[] r6 = new p000.pw0[]{r23, r24, r25, r26, r27, r28}
            java.util.List r43 = p000.AbstractC1021yh.m6897(r6)
            r44 = 0
            java.lang.String r38 = "过滤"
            java.lang.String r39 = "视频流过滤"
            r25 = r40
            java.lang.String r40 = "减少不想看的 Feed 内容"
            r42 = r41
            r41 = r25
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            r40 = r41
            r41 = r42
            ow0 r38 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "时长提醒"
            java.lang.String r28 = "连续刷视频超过设定时间后提醒休息，支持重复提醒、振动和自定义文案。"
            java.lang.String r24 = "时长"
            java.lang.String r6 = r13.f7790
            java.lang.String r10 = r13.f7791
            r25 = r6
            r26 = r10
            r23.<init>(r24, r25, r26, r27, r28)
            r44 = r25
            r45 = r26
            pw0 r24 = new pw0
            java.lang.String r46 = "屏蔽抖音官方时长提醒弹窗"
            java.lang.String r47 = "阻止抖音自身的使用时长 / 防沉迷类 Feed 弹窗。"
            java.lang.String r43 = "官方"
            r42 = r24
            r42.<init>(r43, r44, r45, r46, r47)
            pw0 r25 = new pw0
            java.lang.String r46 = "长视频提醒"
            java.lang.String r47 = "当前视频总时长超过设定阈值时弹出提醒。"
            java.lang.String r43 = "长片"
            r42 = r25
            r42.<init>(r43, r44, r45, r46, r47)
            pw0 r42 = new pw0
            java.lang.String r46 = "自动下滑"
            java.lang.String r47 = "当前视频播放完成后自动滑到下一个作品，支持延迟和评论区控制。"
            java.lang.String r43 = "下滑"
            r42.<init>(r43, r44, r45, r46, r47)
            r26 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "播放完成自动暂停"
            java.lang.String r47 = "视频播放完成后自动暂停，避免自动循环播放。"
            java.lang.String r43 = "暂停"
            r42.<init>(r43, r44, r45, r46, r47)
            r27 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "进度条时间显示"
            java.lang.String r47 = "在进度条附近显示当前时间 / 总时长，支持字体大小、颜色和透明度。"
            java.lang.String r43 = "进度"
            r42.<init>(r43, r44, r45, r46, r47)
            r28 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "视频倍速扩展"
            java.lang.String r47 = "扩展宿主播放倍速选项，支持 0.25、0.5、2.5、3.0 等额外速度。"
            java.lang.String r43 = "倍速"
            r42.<init>(r43, r44, r45, r46, r47)
            r29 = r42
            pw0[] r6 = new p000.pw0[]{r23, r24, r25, r26, r27, r28, r29}
            java.util.List r48 = p000.AbstractC1021yh.m6897(r6)
            r49 = 0
            java.lang.String r43 = "播放"
            r46 = r44
            java.lang.String r44 = "播放增强"
            r47 = r45
            java.lang.String r45 = "提醒、下滑、暂停、进度条"
            r42 = r38
            r42.<init>(r43, r44, r45, r46, r47, r48, r49)
            r6 = r42
            r44 = r46
            r45 = r47
            ow0 r39 = new ow0
            pw0 r42 = new pw0
            java.lang.String r46 = "Feed 流预加载控制"
            java.lang.String r47 = "可控制视频预加载开关、预加载数量、清晰度和调试日志。"
            java.lang.String r43 = "预载"
            r42.<init>(r43, r44, r45, r46, r47)
            r10 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "Feed 右侧控件屏蔽"
            java.lang.String r47 = "自定义隐藏头像、点赞、收藏、评论、分享、音乐、不感兴趣等右侧控件。"
            java.lang.String r43 = "右侧"
            r42.<init>(r43, r44, r45, r46, r47)
            r14 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "直播间精确人数显示"
            java.lang.String r47 = "将直播间在线人数从“1万”“1.2万”等模糊数字显示为具体数字。"
            java.lang.String r43 = "直播"
            r42.<init>(r43, r44, r45, r46, r47)
            r15 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "个人主页增强"
            java.lang.String r47 = "在个人主页显示数字 UID，提供主页书签入口，并支持主动获取主页作品数据。"
            java.lang.String r43 = "主页"
            r42.<init>(r43, r44, r45, r46, r47)
            r23 = r1
            r1 = r42
            pw0[] r1 = new p000.pw0[]{r10, r14, r15, r1}
            java.util.List r48 = p000.AbstractC1021yh.m6897(r1)
            java.lang.String r43 = "Feed"
            r46 = r44
            java.lang.String r44 = "Feed 页面增强"
            r47 = r45
            java.lang.String r45 = "预加载、右侧控件、直播人数、主页"
            r42 = r39
            r42.<init>(r43, r44, r45, r46, r47, r48, r49)
            r1 = r42
            r44 = r46
            r45 = r47
            ow0 r10 = new ow0
            pw0 r28 = new pw0
            java.lang.String r32 = "评论区样式"
            java.lang.String r33 = "已迁移至评论区控件管理，可隐藏评论头像、昵称、内容、回复、时间、点赞、踩和发布地点，并配置评论染色范围。"
            java.lang.String r29 = "染色"
            r28.<init>(r29, r30, r31, r32, r33)
            r14 = r28
            pw0 r28 = new pw0
            java.lang.String r32 = "评论区背景"
            java.lang.String r33 = "支持默认、纯色和自定义图片背景，可调整图片透明度并生成高斯模糊缓存。"
            java.lang.String r29 = "背景"
            r28.<init>(r29, r30, r31, r32, r33)
            r15 = r28
            pw0 r28 = new pw0
            java.lang.String r32 = "评论精确时间"
            java.lang.String r33 = "将评论区相对时间替换为精确时间，支持自定义格式。"
            java.lang.String r29 = "时间"
            r28.<init>(r29, r30, r31, r32, r33)
            r24 = r1
            r1 = r28
            pw0 r28 = new pw0
            java.lang.String r32 = "评论区图片无水印下载"
            java.lang.String r33 = "自动拦截评论区带水印图片，替换为无水印原图链接。"
            java.lang.String r29 = "图片"
            r28.<init>(r29, r30, r31, r32, r33)
            r25 = r6
            r6 = r28
            pw0[] r1 = new p000.pw0[]{r14, r15, r1, r6}
            java.util.List r34 = p000.AbstractC1021yh.m6897(r1)
            r35 = 0
            java.lang.String r29 = "评论"
            r32 = r30
            java.lang.String r30 = "评论区增强"
            r33 = r31
            java.lang.String r31 = "样式、背景、时间、图片"
            r28 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34, r35)
            ow0 r1 = new ow0
            pw0 r42 = new pw0
            java.lang.String r46 = "沉浸式状态栏"
            java.lang.String r47 = "隐藏顶部系统状态栏，也可选择同时隐藏导航栏 / 手势条。"
            java.lang.String r43 = "沉浸"
            r42.<init>(r43, r44, r45, r46, r47)
            r6 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "视频信息条"
            java.lang.String r47 = "在视频描述下方显示发布时间和位置信息，支持字体大小、颜色和霓虹彩虹色。"
            java.lang.String r43 = "信息"
            r42.<init>(r43, r44, r45, r46, r47)
            r10 = r42
            pw0[] r6 = new p000.pw0[]{r6, r10}
            java.util.List r48 = p000.AbstractC1021yh.m6897(r6)
            java.lang.String r43 = "外观"
            r46 = r44
            java.lang.String r44 = "外观与信息显示"
            r47 = r45
            java.lang.String r45 = "状态栏、信息条"
            r42 = r1
            r42.<init>(r43, r44, r45, r46, r47, r48, r49)
            ow0 r6 = new ow0
            pw0 r38 = new pw0
            java.lang.String r42 = "DexKit 缓存管理"
            java.lang.String r43 = "可清除 DexKit 方法 / 类 / 字段查询缓存，下次启动重新适配。"
            java.lang.String r39 = "缓存"
            r38.<init>(r39, r40, r41, r42, r43)
            r10 = r38
            pw0 r38 = new pw0
            java.lang.String r42 = "DyLog 日志查看与导出"
            java.lang.String r43 = "查看模块运行日志，支持刷新、查看详情和导出日志文件。"
            java.lang.String r39 = "日志"
            r38.<init>(r39, r40, r41, r42, r43)
            r14 = r38
            pw0 r38 = new pw0
            java.lang.String r42 = "清除全部用户配置"
            java.lang.String r43 = "可清除当前账号、其他账号、元数据、内测状态等全部 DYHelper 用户配置。"
            java.lang.String r39 = "重置"
            r38.<init>(r39, r40, r41, r42, r43)
            r15 = r38
            pw0[] r10 = new p000.pw0[]{r10, r14, r15}
            java.util.List r44 = p000.AbstractC1021yh.m6897(r10)
            r45 = 0
            java.lang.String r39 = "工具"
            r42 = r40
            java.lang.String r40 = "工具与诊断"
            r26 = r41
            java.lang.String r41 = "缓存、日志"
            r38 = r6
            r43 = r26
            r38.<init>(r39, r40, r41, r42, r43, r44, r45)
            ow0 r6 = new ow0
            pw0 r42 = new pw0
            r44 = r46
            java.lang.String r46 = "私信防撤回"
            r45 = r47
            java.lang.String r47 = "防止私信消息被撤回，保留原始消息内容。"
            java.lang.String r43 = "防撤"
            r42.<init>(r43, r44, r45, r46, r47)
            r10 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "私信时间标签"
            java.lang.String r47 = "在私信消息下方显示精确发送时间，并可显示撤回标记。"
            java.lang.String r43 = "时间"
            r42.<init>(r43, r44, r45, r46, r47)
            r14 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "私信状态隐私"
            java.lang.String r47 = "关闭已读状态上报和正在输入 / 录音中等临时状态上报。"
            java.lang.String r43 = "隐私"
            r42.<init>(r43, r44, r45, r46, r47)
            r15 = r42
            pw0 r42 = new pw0
            java.lang.String r46 = "私信自动已读"
            java.lang.String r47 = "按设定间隔自动将私信标记为已读，支持互动消息、白名单和黑名单。"
            java.lang.String r43 = "已读"
            r42.<init>(r43, r44, r45, r46, r47)
            r41 = r1
            r1 = r42
            pw0[] r1 = new p000.pw0[]{r10, r14, r15, r1}
            java.util.List r48 = p000.AbstractC1021yh.m6897(r1)
            java.lang.String r43 = "私信"
            r46 = r44
            java.lang.String r44 = "私信增强"
            r47 = r45
            java.lang.String r45 = "防撤回、时间、隐私、已读、隐藏"
            r42 = r6
            r42.<init>(r43, r44, r45, r46, r47, r48, r49)
            r35 = r23
            r39 = r24
            r40 = r28
            r43 = r42
            r42 = r38
            r38 = r25
            ow0[] r1 = new p000.ow0[]{r35, r36, r37, r38, r39, r40, r41, r42, r43}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            android.widget.LinearLayout r1 = r0.m1565(r1, r13)
            r7.addView(r1)
            java.lang.String r1 = "内测功能"
            android.widget.TextView r1 = r0.m1566(r1, r13)
            r7.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r14 = 1
            r1.setOrientation(r14)
            a80 r6 = r0.m1567()
            java.lang.Object r6 = r6.invoke(r8)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            a80 r10 = r0.m1567()
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r8)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            a80 r15 = r0.m1567()
            java.lang.Object r15 = r15.invoke(r9)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r1.setPadding(r6, r10, r14, r15)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            java.lang.String r10 = r13.f7796
            int r14 = android.graphics.Color.parseColor(r10)
            r6.setColor(r14)
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r4)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            float r14 = (float) r14
            r6.setCornerRadius(r14)
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r11)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.String r15 = "#7C4DFF"
            r26 = r10
            int r10 = android.graphics.Color.parseColor(r15)
            r6.setStroke(r14, r10)
            r1.setBackground(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r14 = -1
            r6.<init>(r14, r10)
            a80 r10 = r0.m1567()
            java.lang.Object r10 = r10.invoke(r3)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r6.bottomMargin = r10
            r1.setLayoutParams(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r10 = "以下功能正在内测中"
            r6.setText(r10)
            r10 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r10)
            r10 = 0
            r14 = 1
            p000.lz1.m3699(r15, r6, r10, r14)
            r1.addView(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r10 = "内测功能需要当前抖音账号通过内测校验后才能使用。具体状态以抖音内设置页顶部显示和各功能开关校验结果为准。"
            r6.setText(r10)
            r10 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r10)
            int r10 = android.graphics.Color.parseColor(r15)
            r6.setTextColor(r10)
            a80 r10 = r0.m1567()
            java.lang.Object r5 = r10.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r10 = 0
            r6.setPadding(r10, r5, r10, r10)
            a80 r5 = r0.m1567()
            java.lang.Object r5 = r5.invoke(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            r10 = 1065353216(0x3f800000, float:1.0)
            r6.setLineSpacing(r5, r10)
            r1.addView(r6)
            r7.addView(r1)
            pw0 r23 = new pw0
            java.lang.String r27 = "底栏 TAB 过滤"
            java.lang.String r28 = "隐藏朋友、发布、消息、我的、探索、商城、同城等底栏入口。"
            java.lang.String r24 = "底栏"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r1 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "顶栏 TAB 过滤"
            java.lang.String r28 = "自动扫描首页顶部频道 TAB，可隐藏指定频道、跳过隐藏页面并设置居中对齐，同时兼容嵌入式顶部栏。"
            java.lang.String r24 = "顶栏"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r5 = r23
            pw0[] r1 = new p000.pw0[]{r1, r5}
            java.util.List r29 = p000.AbstractC1021yh.m6897(r1)
            ow0 r30 = new ow0
            r28 = r26
            java.lang.String r26 = "底栏与顶栏入口过滤"
            r23 = r30
            r30 = 1
            java.lang.String r24 = "TAB"
            java.lang.String r25 = "TAB 过滤"
            java.lang.String r27 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r1 = r23
            r26 = r28
            ow0 r31 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "播放页控件透明度"
            java.lang.String r28 = "可调节右侧互动区、底部信息区、顶栏和杂项栏透明度。"
            java.lang.String r24 = "透明"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r5 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "视频暂停显示控件"
            java.lang.String r28 = "视频暂停时临时恢复控件显示，继续播放后恢复清爽透明度。"
            java.lang.String r24 = "暂停"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r6 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "进度条透明度控制"
            java.lang.String r28 = "自定义视频播放时进度条透明度，并可设置暂停时恢复不透明。"
            java.lang.String r24 = "进度"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r10 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "底栏隐藏与底栏文字透明度"
            java.lang.String r28 = "可隐藏底栏、隐藏加号按钮、控制底栏文字显示和透明度。"
            java.lang.String r24 = "底栏"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r14 = r23
            pw0[] r5 = new p000.pw0[]{r5, r6, r10, r14}
            java.util.List r29 = p000.AbstractC1021yh.m6897(r5)
            r30 = 0
            java.lang.String r24 = "清爽"
            java.lang.String r25 = "清爽模式"
            r28 = r26
            java.lang.String r26 = "播放页沉浸净化"
            java.lang.String r27 = "#7C4DFF"
            r23 = r31
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r26 = r28
            ow0 r32 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "Feed 右侧不感兴趣按钮"
            java.lang.String r28 = "在视频右侧操作栏添加快速标记「不感兴趣」的按钮，需要重启抖音生效。"
            java.lang.String r24 = "不感"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            java.util.List r29 = p000.AbstractC1021yh.m6896(r23)
            java.lang.String r24 = "右侧"
            java.lang.String r25 = "右侧不感兴趣按钮"
            r28 = r26
            java.lang.String r26 = "快速标记不喜欢"
            java.lang.String r27 = "#7C4DFF"
            r23 = r32
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r26 = r28
            ow0 r33 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "进入抖音自动扫描书签评论"
            java.lang.String r28 = "启动后自动查询所有书签评论的新回复，并通过系统通知提醒。"
            java.lang.String r24 = "扫描"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            java.util.List r29 = p000.AbstractC1021yh.m6896(r23)
            java.lang.String r24 = "书签"
            java.lang.String r25 = "评论书签自动扫描"
            r28 = r26
            java.lang.String r26 = "自动查询新回复"
            java.lang.String r27 = "#7C4DFF"
            r23 = r33
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r26 = r28
            ow0 r34 = new ow0
            pw0 r35 = new pw0
            java.lang.String r27 = "火花自动续期"
            java.lang.String r28 = "到达设定时间后自动发送续期消息，支持日期切换或指定小时触发。"
            java.lang.String r24 = "自动"
            java.lang.String r25 = "#7C4DFF"
            r23 = r35
            r23.<init>(r24, r25, r26, r27, r28)
            pw0 r36 = new pw0
            java.lang.String r27 = "启动延迟与续期文案"
            java.lang.String r28 = "可设置打开抖音后的执行延迟和自动发送的续期消息内容。"
            java.lang.String r24 = "延迟"
            java.lang.String r25 = "#7C4DFF"
            r23 = r36
            r23.<init>(r24, r25, r26, r27, r28)
            pw0 r37 = new pw0
            java.lang.String r27 = "自定义人员续火"
            java.lang.String r28 = "可从已识别火花会话选择人员，或手动填写 cid / uid / name 规则。"
            java.lang.String r24 = "人员"
            java.lang.String r25 = "#7C4DFF"
            r23 = r37
            r23.<init>(r24, r25, r26, r27, r28)
            pw0 r38 = new pw0
            java.lang.String r27 = "自动领取火星奖励"
            java.lang.String r28 = "仅遍历身份完整的单聊并领取全部待领取奖励，按会话与任务去重；启动检查支持会话未就绪重试，自动营地批次后还可静默补领。"
            java.lang.String r24 = "领取"
            java.lang.String r25 = "#7C4DFF"
            r23 = r38
            r23.<init>(r24, r25, r26, r27, r28)
            pw0 r23 = new pw0
            java.lang.String r27 = "自动完成火星任务"
            java.lang.String r28 = "按服务端实时要求完成互发消息或图片任务；支持全局与人员规则、48 字消息内容、30MB 以内任务图片，以及完成后领取。"
            java.lang.String r24 = "任务"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r39 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "小火人投喂"
            java.lang.String r28 = "支持手动和每进程一次的自动投喂，食物列表项可点击修改；固定或智能选食均会逐人员复核实时目录、活动状态和价格。"
            java.lang.String r24 = "投喂"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r40 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "投喂智能选择与价格上限"
            java.lang.String r28 = "免费食物优先，付费食物按亲密度 / 火星价格选择；单次上限为 0 时仅允许免费食物，服务端改价时安全跳过且不自动换食物。"
            java.lang.String r24 = "智能"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r41 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "火花 / 火星进度与成功提醒"
            java.lang.String r28 = "自动流程按账号和本地自然日限制顶部提示频率；手动任务保留真实进度，投喂、经验或火星实际成功时可独立显示 Toast。"
            java.lang.String r24 = "提醒"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r42 = r23
            pw0[] r5 = new p000.pw0[]{r35, r36, r37, r38, r39, r40, r41, r42}
            java.util.List r29 = p000.AbstractC1021yh.m6897(r5)
            java.lang.String r24 = "火花"
            java.lang.String r25 = "火花续期"
            r28 = r26
            java.lang.String r26 = "续火、火星任务与自定义人员"
            java.lang.String r27 = "#7C4DFF"
            r23 = r34
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r26 = r28
            ow0 r35 = new ow0
            pw0 r36 = new pw0
            java.lang.String r27 = "营地管理与状态刷新"
            java.lang.String r28 = "统一管理当前账号识别到的单聊营地，可强制刷新并区分可用、无小火人、无营地、待刷新和网络失败；长按查看逐地块详情。"
            java.lang.String r24 = "人员"
            java.lang.String r25 = "#7C4DFF"
            r23 = r36
            r23.<init>(r24, r25, r26, r27, r28)
            pw0 r37 = new pw0
            java.lang.String r27 = "近期收益统计"
            java.lang.String r28 = "营地面板展示近期收益统计和折线图，并适配浅色与深色模式；人员列表汇总等级、作物、生长进度及地块状态。"
            java.lang.String r24 = "统计"
            java.lang.String r25 = "#7C4DFF"
            r23 = r37
            r23.<init>(r24, r25, r26, r27, r28)
            pw0 r38 = new pw0
            java.lang.String r27 = "手动批量收菜、种地与浇水"
            java.lang.String r28 = "执行前强制刷新最新状态；最多并行处理 4 个不同会话，同一会话严格顺序，可中途停止并保留真实进度和结果。"
            java.lang.String r24 = "手动"
            java.lang.String r25 = "#7C4DFF"
            r23 = r38
            r23.<init>(r24, r25, r26, r27, r28)
            pw0 r23 = new pw0
            java.lang.String r27 = "独立自动任务与定向刷新"
            java.lang.String r28 = "自动收菜、种地、浇水相互独立，支持 0~300 秒进入延迟；仅刷新到期或存在候选操作的最小会话范围。"
            java.lang.String r24 = "自动"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r39 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "种子目录与种植策略"
            java.lang.String r28 = "支持未设置、智能选择和固定种子；智能模式按实时等级、余额、在售与活动状态筛选，免费优先，付费种子按收益 / 价格排序。"
            java.lang.String r24 = "种子"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r40 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "人员独立规则"
            java.lang.String r28 = "每位人员可分别覆盖收菜、种地、浇水和种子策略，并维护只影响智能选种的独立排除名单。"
            java.lang.String r24 = "规则"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r41 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "营地安全限制与降级"
            java.lang.String r28 = "支持每日收获 / 种植限额、智能价格上限和同会话操作间隔；余额、等级、目录、网络或状态不满足时安全跳过。"
            java.lang.String r24 = "安全"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r42 = r23
            pw0[] r5 = new p000.pw0[]{r36, r37, r38, r39, r40, r41, r42}
            java.util.List r29 = p000.AbstractC1021yh.m6897(r5)
            java.lang.String r24 = "营地"
            java.lang.String r25 = "小火人口袋营地"
            r28 = r26
            java.lang.String r26 = "适配宿主 39.3，管理、统计与自动任务"
            java.lang.String r27 = "#7C4DFF"
            r23 = r35
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r26 = r28
            ow0 r36 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "聊天记录导出"
            java.lang.String r28 = "支持 TXT / JSON 格式和自选保存目录；完整导出会读取到最早一条消息并显示阶段进度，因此会比仅导出当前已加载消息更慢。"
            java.lang.String r24 = "导出"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r5 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "骰子点数控制"
            java.lang.String r28 = "可将下一次聊天骰子锁定为 1~6 点，发送后对方看到相同结果，也可随时恢复宿主随机模式。"
            java.lang.String r24 = "骰子"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r6 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "一键已读"
            java.lang.String r28 = "从操作菜单将消息列表中的全部会话批量标记为已读。"
            java.lang.String r24 = "已读"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r10 = r23
            pw0[] r5 = new p000.pw0[]{r5, r6, r10}
            java.util.List r29 = p000.AbstractC1021yh.m6897(r5)
            java.lang.String r24 = "聊天"
            java.lang.String r25 = "聊天工具"
            r28 = r26
            java.lang.String r26 = "记录导出、骰子与批量已读"
            java.lang.String r27 = "#7C4DFF"
            r23 = r36
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r26 = r28
            ow0 r37 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "视频章节广告跳过"
            java.lang.String r28 = "播放带章节的视频时，识别章节进度条中的广告或营销片段并尝试自动跳过；宿主页面差异较大，未命中时保留原始播放行为。"
            java.lang.String r24 = "章节"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            java.util.List r29 = p000.AbstractC1021yh.m6896(r23)
            java.lang.String r24 = "实验"
            java.lang.String r25 = "实验性播放功能"
            r28 = r26
            java.lang.String r26 = "章节内容识别与跳过"
            java.lang.String r27 = "#7C4DFF"
            r23 = r37
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r26 = r28
            ow0 r38 = new ow0
            pw0 r23 = new pw0
            java.lang.String r27 = "启用空闲退出"
            java.lang.String r28 = "超过设定时间无操作后自动退出抖音。"
            java.lang.String r24 = "计时"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r5 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "退出后锁屏"
            java.lang.String r28 = "退出抖音时可尝试锁屏，需要 Root。"
            java.lang.String r24 = "锁屏"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r6 = r23
            pw0 r23 = new pw0
            java.lang.String r27 = "退出前倒计时提示"
            java.lang.String r28 = "空闲超时前显示倒计时，触摸可取消退出。"
            java.lang.String r24 = "倒计"
            java.lang.String r25 = "#7C4DFF"
            r23.<init>(r24, r25, r26, r27, r28)
            r10 = r23
            pw0[] r5 = new p000.pw0[]{r5, r6, r10}
            java.util.List r29 = p000.AbstractC1021yh.m6897(r5)
            java.lang.String r24 = "退出"
            java.lang.String r25 = "空闲退出"
            r28 = r26
            java.lang.String r26 = "无操作自动退出"
            java.lang.String r27 = "#7C4DFF"
            r23 = r38
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r30 = r1
            ow0[] r1 = new p000.ow0[]{r30, r31, r32, r33, r34, r35, r36, r37, r38}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            android.widget.LinearLayout r1 = r0.m1565(r1, r13)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            r5.getClass()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            a80 r6 = r0.m1567()
            r10 = 28
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r6 = r6.invoke(r10)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5.bottomMargin = r6
            r1.setLayoutParams(r5)
            r7.addView(r1)
            java.lang.String r1 = "菜单呼出方式"
            android.widget.TextView r1 = r0.m1566(r1, r13)
            r7.addView(r1)
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            l91 r5 = new l91
            java.lang.String r6 = "Feed 流手势"
            java.lang.String r10 = "可在抖音内设置页配置不同区域的双击 / 长按动作。"
            r5.<init>(r6, r10)
            l91 r6 = new l91
            java.lang.String r10 = "音量键组合"
            java.lang.String r14 = "先按一下音量+，再按一下音量-，即可呼出 DY Helper 操作菜单。"
            r6.<init>(r10, r14)
            l91 r10 = new l91
            java.lang.String r14 = "分享面板"
            java.lang.String r15 = "点击视频分享，在分享面板中找到 DY Helper 快捷入口。"
            r10.<init>(r14, r15)
            l91[] r5 = new p000.l91[]{r5, r6, r10}
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r14 = 1
            r6.setOrientation(r14)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            java.lang.String r14 = r13.f7782
            int r14 = android.graphics.Color.parseColor(r14)
            r10.setColor(r14)
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r8)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            float r14 = (float) r14
            r10.setCornerRadius(r14)
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r11)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.String r15 = r13.f7789
            r23 = r5
            int r5 = android.graphics.Color.parseColor(r15)
            r10.setStroke(r14, r5)
            r6.setBackground(r10)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r14 = -1
            r5.<init>(r14, r10)
            a80 r10 = r0.m1567()
            r14 = r18
            java.lang.Object r10 = r10.invoke(r14)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r5.bottomMargin = r10
            r6.setLayoutParams(r5)
            java.util.Iterator r5 = r23.iterator()
            r10 = 0
        La65:
            boolean r18 = r5.hasNext()
            if (r18 == 0) goto Lbe1
            java.lang.Object r18 = r5.next()
            int r24 = r10 + 1
            if (r10 < 0) goto Lbdc
            r25 = r5
            r5 = r18
            l91 r5 = (p000.l91) r5
            r18 = r12
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r0)
            r26 = r15
            r15 = 0
            r12.setOrientation(r15)
            r15 = 16
            r12.setGravity(r15)
            a80 r15 = r0.m1567()
            java.lang.Object r15 = r15.invoke(r8)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r27 = r3
            a80 r3 = r0.m1567()
            java.lang.Object r3 = r3.invoke(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r28 = r2
            a80 r2 = r0.m1567()
            java.lang.Object r2 = r2.invoke(r8)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r29 = r14
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r1)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r12.setPadding(r15, r3, r2, r14)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "›"
            r2.setText(r3)
            r3 = 1099956224(0x41900000, float:18.0)
            r2.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r21)
            r2.setTextColor(r3)
            r3 = 0
            r14 = 1
            r2.setTypeface(r3, r14)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r14 = -2
            r3.<init>(r14, r14)
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r4)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r3.rightMargin = r14
            r2.setLayoutParams(r3)
            r12.addView(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r14 = 1
            r2.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = -2
            r30 = r1
            r1 = 0
            r3.<init>(r1, r15, r14)
            r2.setLayoutParams(r3)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.Object r3 = r5.f6502
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            r3 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r22)
            r1.setTextColor(r3)
            r3 = 0
            r14 = 1
            r1.setTypeface(r3, r14)
            r2.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.Object r3 = r5.f6503
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r18)
            r1.setTextColor(r3)
            a80 r3 = r0.m1567()
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r3 = r3.invoke(r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r15 = 0
            r1.setPadding(r15, r3, r15, r15)
            r2.addView(r1)
            r12.addView(r2)
            r6.addView(r12)
            int r1 = r23.size()
            r17 = 1
            int r1 = r1 + (-1)
            if (r10 >= r1) goto Lbca
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            java.lang.String r2 = r13.f7788
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setBackgroundColor(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            a80 r3 = r0.m1567()
            java.lang.Object r3 = r3.invoke(r11)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r5 = -1
            r2.<init>(r5, r3)
            a80 r3 = r0.m1567()
            r5 = 40
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r3 = r3.invoke(r5)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.leftMargin = r3
            a80 r3 = r0.m1567()
            java.lang.Object r3 = r3.invoke(r8)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.rightMargin = r3
            r1.setLayoutParams(r2)
            r6.addView(r1)
        Lbca:
            r12 = r18
            r10 = r24
            r5 = r25
            r15 = r26
            r3 = r27
            r2 = r28
            r14 = r29
            r1 = r30
            goto La65
        Lbdc:
            p000.AbstractC1021yh.m6917()
            r0 = 0
            throw r0
        Lbe1:
            r28 = r2
            r27 = r3
            r29 = r14
            r26 = r15
            r15 = 0
            r7.addView(r6)
            java.lang.String r1 = "使用说明"
            android.widget.TextView r1 = r0.m1566(r1, r13)
            r7.addView(r1)
            java.lang.String r36 = "⑦ 火星功能说明：自动领取会在每次打开抖音时执行，每个自然日首次显示通知；自动完成支持互发消息和图片任务。"
            java.lang.String r37 = "⑧ 如遇适配异常，可在设置页的缓存管理中查看 DyLog 日志或清除 DexKit 缓存。"
            java.lang.String r30 = "① 在 LSPosed 管理器中启用本模块，作用域勾选「抖音」。"
            java.lang.String r31 = "② 强制停止抖音后重新打开，模块开始生效。"
            java.lang.String r32 = "③ 大部分功能可在抖音内通过 DY Helper 设置页开启、关闭或调整参数。"
            java.lang.String r33 = "④ 下载类功能可通过分享面板、音量键组合或手势菜单呼出。"
            java.lang.String r34 = "⑤ 部分设置需要切换页面或重启抖音后才会完全生效。"
            java.lang.String r35 = "⑥ 内测功能需要当前抖音账号通过内测验证，实际状态以设置页显示为准。"
            java.lang.String[] r1 = new java.lang.String[]{r30, r31, r32, r33, r34, r35, r36, r37}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r14 = 1
            r2.setOrientation(r14)
            a80 r3 = r0.m1567()
            r4 = 18
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.invoke(r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            a80 r5 = r0.m1567()
            java.lang.Object r5 = r5.invoke(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            a80 r6 = r0.m1567()
            java.lang.Object r4 = r6.invoke(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            a80 r6 = r0.m1567()
            java.lang.Object r6 = r6.invoke(r8)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r2.setPadding(r3, r5, r4, r6)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            java.lang.String r4 = r13.f7783
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColor(r4)
            a80 r4 = r0.m1567()
            java.lang.Object r4 = r4.invoke(r9)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r3.setCornerRadius(r4)
            a80 r4 = r0.m1567()
            java.lang.Object r4 = r4.invoke(r11)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r5 = android.graphics.Color.parseColor(r26)
            r3.setStroke(r4, r5)
            r2.setBackground(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r5 = -1
            r3.<init>(r5, r4)
            a80 r4 = r0.m1567()
            r14 = r29
            java.lang.Object r4 = r4.invoke(r14)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.bottomMargin = r4
            r2.setLayoutParams(r3)
            java.util.Iterator r3 = r1.iterator()
        Lcb0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld23
            java.lang.Object r4 = r3.next()
            int r5 = r15 + 1
            if (r15 < 0) goto Ld1e
            java.lang.String r4 = (java.lang.String) r4
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            r6.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r4)
            java.lang.String r4 = r13.f7785
            int r4 = android.graphics.Color.parseColor(r4)
            r6.setTextColor(r4)
            a80 r4 = r0.m1567()
            r8 = r28
            java.lang.Object r4 = r4.invoke(r8)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r9 = 1065353216(0x3f800000, float:1.0)
            r6.setLineSpacing(r4, r9)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r10 = -1
            r4.<init>(r10, r9)
            int r9 = r1.size()
            r17 = 1
            int r9 = r9 + (-1)
            if (r15 >= r9) goto Ld10
            a80 r9 = r0.m1567()
            r10 = r27
            java.lang.Object r9 = r9.invoke(r10)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r4.bottomMargin = r9
            goto Ld12
        Ld10:
            r10 = r27
        Ld12:
            r6.setLayoutParams(r4)
            r2.addView(r6)
            r15 = r5
            r28 = r8
            r27 = r10
            goto Lcb0
        Ld1e:
            p000.AbstractC1021yh.m6917()
            r0 = 0
            throw r0
        Ld23:
            r7.addView(r2)
            java.lang.String r1 = "快捷操作"
            android.widget.TextView r1 = r0.m1566(r1, r13)
            r7.addView(r1)
            r1 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            r9 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r8.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = -1
            r14 = -2
            r11.<init>(r12, r14)
            a80 r15 = r0.m1567()
            r16 = 12
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            java.lang.Object r9 = r15.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r11.bottomMargin = r9
            r8.setLayoutParams(r11)
            r9 = 0
            android.content.pm.PackageManager r11 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Ld8a
            h22 r15 = r0.f2570     // Catch: java.lang.Throwable -> Ld8a
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> Ld8a
            android.content.ComponentName r15 = (android.content.ComponentName) r15     // Catch: java.lang.Throwable -> Ld8a
            int r11 = r11.getComponentEnabledSetting(r15)     // Catch: java.lang.Throwable -> Ld8a
            if (r11 == r5) goto Ld8c
            r5 = 3
            if (r11 != r5) goto Ld8a
            goto Ld8c
        Ld8a:
            r5 = r9
            goto Ld8d
        Ld8c:
            r5 = 1
        Ld8d:
            lw0 r11 = new lw0
            r15 = 0
            r11.<init>(r0, r15)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r0)
            r15.setOrientation(r9)
            r15.setGravity(r3)
            a80 r3 = r0.m1567()
            java.lang.Object r3 = r3.invoke(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            a80 r9 = r0.m1567()
            java.lang.Object r9 = r9.invoke(r4)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            a80 r12 = r0.m1567()
            java.lang.Object r12 = r12.invoke(r2)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            a80 r14 = r0.m1567()
            java.lang.Object r14 = r14.invoke(r4)
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r15.setPadding(r3, r9, r12, r14)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            java.lang.String r9 = r13.f7782
            int r12 = android.graphics.Color.parseColor(r9)
            r3.setColor(r12)
            a80 r12 = r0.m1567()
            java.lang.Object r12 = r12.invoke(r1)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            r3.setCornerRadius(r12)
            a80 r12 = r0.m1567()
            java.lang.Object r12 = r12.invoke(r10)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.String r14 = r13.f7789
            r22 = r9
            int r9 = android.graphics.Color.parseColor(r14)
            r3.setStroke(r12, r9)
            r15.setBackground(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r12 = -2
            r3.<init>(r9, r12)
            r15.setLayoutParams(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r9 = 1
            r3.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r23 = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            r24 = r7
            r7 = 0
            r9.<init>(r7, r12, r14)
            r3.setLayoutParams(r9)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            java.lang.String r9 = "隐藏桌面图标"
            r7.setText(r9)
            r9 = 1097859072(0x41700000, float:15.0)
            r7.setTextSize(r9)
            java.lang.String r12 = r13.f7784
            int r9 = android.graphics.Color.parseColor(r12)
            r7.setTextColor(r9)
            r9 = 0
            r14 = 1
            r7.setTypeface(r9, r14)
            r3.addView(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            java.lang.String r14 = "隐藏后需从 LSPosed 管理器或系统应用详情中打开本应用"
            r7.setText(r14)
            r14 = 1094713344(0x41400000, float:12.0)
            r7.setTextSize(r14)
            java.lang.String r14 = r13.f7786
            int r9 = android.graphics.Color.parseColor(r14)
            r7.setTextColor(r9)
            a80 r9 = r0.m1567()
            java.lang.Object r9 = r9.invoke(r6)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r29 = r12
            r12 = 0
            r7.setPadding(r12, r9, r12, r12)
            r3.addView(r7)
            r15.addView(r3)
            android.widget.Switch r3 = new android.widget.Switch
            r3.<init>(r0)
            r3.setChecked(r5)
            yg r5 = new yg
            r7 = 1
            r5.<init>(r11, r7)
            r3.setOnCheckedChangeListener(r5)
            r15.addView(r3)
            r8.addView(r15)
            android.view.View r3 = new android.view.View
            r3.<init>(r0)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            a80 r7 = r0.m1567()
            r9 = 10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r7 = r7.invoke(r9)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r9 = -1
            r5.<init>(r9, r7)
            r3.setLayoutParams(r5)
            r8.addView(r3)
            mw0 r3 = new mw0
            r5 = 0
            r3.<init>(r0, r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r7 = 0
            r5.setOrientation(r7)
            r7 = 16
            r5.setGravity(r7)
            a80 r7 = r0.m1567()
            java.lang.Object r7 = r7.invoke(r2)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            a80 r9 = r0.m1567()
            java.lang.Object r9 = r9.invoke(r4)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            a80 r11 = r0.m1567()
            java.lang.Object r2 = r11.invoke(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            a80 r11 = r0.m1567()
            java.lang.Object r4 = r11.invoke(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5.setPadding(r7, r9, r2, r4)
            r9 = 1
            r5.setClickable(r9)
            r5.setFocusable(r9)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r4 = android.graphics.Color.parseColor(r22)
            r2.setColor(r4)
            a80 r4 = r0.m1567()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            r2.setCornerRadius(r1)
            a80 r1 = r0.m1567()
            java.lang.Object r1 = r1.invoke(r10)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r4 = android.graphics.Color.parseColor(r23)
            r2.setStroke(r1, r4)
            android.graphics.drawable.RippleDrawable r1 = new android.graphics.drawable.RippleDrawable
            java.lang.String r4 = r13.f7788
            int r4 = android.graphics.Color.parseColor(r4)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r7 = 0
            r1.<init>(r4, r2, r7)
            r5.setBackground(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r12 = -2
            r1.<init>(r9, r12)
            r5.setLayoutParams(r1)
            hi r1 = new hi
            r2 = 5
            r1.<init>(r2, r3)
            r5.setOnClickListener(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r9 = 1
            r1.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r2.<init>(r7, r12, r3)
            r1.setLayoutParams(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "关于"
            r2.setText(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r29)
            r2.setTextColor(r3)
            r7 = 0
            r2.setTypeface(r7, r9)
            r1.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "版本信息与开发者联系方式"
            r2.setText(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r14)
            r2.setTextColor(r3)
            a80 r3 = r0.m1567()
            java.lang.Object r3 = r3.invoke(r6)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r7 = 0
            r2.setPadding(r7, r3, r7, r7)
            r1.addView(r2)
            r5.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r2 = "›"
            r1.setText(r2)
            r2 = 1101004800(0x41a00000, float:20.0)
            r1.setTextSize(r2)
            int r2 = android.graphics.Color.parseColor(r14)
            r1.setTextColor(r2)
            r2 = 17
            r1.setGravity(r2)
            r5.addView(r1)
            r8.addView(r5)
            r1 = r24
            r1.addView(r8)
            r2 = r20
            r2.addView(r1)
            r1 = r19
            r1.addView(r2)
            r0.setContentView(r1)
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.widget.LinearLayout m1565(java.util.List r34, p000.nw0 r35) {
            r33 = this;
            r0 = r33
            r1 = r35
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.setOrientation(r6)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            java.lang.String r9 = r1.f7782
            java.lang.String r10 = r1.f7784
            java.lang.String r11 = r1.f7788
            java.lang.String r12 = r1.f7786
            int r9 = android.graphics.Color.parseColor(r9)
            r8.setColor(r9)
            a80 r9 = r0.m1567()
            r13 = 16
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.Object r9 = r9.invoke(r14)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            r8.setCornerRadius(r9)
            a80 r9 = r0.m1567()
            java.lang.Object r9 = r9.invoke(r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.String r1 = r1.f7789
            int r1 = android.graphics.Color.parseColor(r1)
            r8.setStroke(r9, r1)
            r5.setBackground(r8)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r1.<init>(r8, r9)
            a80 r15 = r0.m1567()
            r16 = 20
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r15.invoke(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.bottomMargin = r8
            r5.setLayoutParams(r1)
            java.util.Iterator r1 = r34.iterator()
            r15 = 0
        L8d:
            boolean r16 = r1.hasNext()
            if (r16 == 0) goto L549
            java.lang.Object r16 = r1.next()
            int r17 = r15 + 1
            if (r15 < 0) goto L543
            r9 = r16
            ow0 r9 = (p000.ow0) r9
            java.util.List r13 = r9.f8284
            int r8 = r13.size()
            if (r8 != r6) goto La9
            r8 = r6
            goto Laa
        La9:
            r8 = 0
        Laa:
            qm1 r6 = new qm1
            r6.<init>()
            r21 = r1
            boolean r1 = r9.f8285
            if (r1 != 0) goto Lba
            if (r8 == 0) goto Lb8
            goto Lba
        Lb8:
            r1 = 0
            goto Lbb
        Lba:
            r1 = 1
        Lbb:
            r6.f9050 = r1
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r22 = r8
            r8 = 1
            r1.setOrientation(r8)
            a80 r8 = r0.m1567()
            r23 = 8
            r24 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)
            java.lang.Object r8 = r8.invoke(r10)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r10 = 0
            r1.setPadding(r10, r10, r10, r8)
            java.util.Iterator r8 = r13.iterator()
            r10 = 0
        Le7:
            boolean r25 = r8.hasNext()
            r26 = r8
            if (r25 == 0) goto L2c6
            java.lang.Object r25 = r26.next()
            int r27 = r10 + 1
            if (r10 < 0) goto L2c1
            r8 = r25
            pw0 r8 = (p000.pw0) r8
            r25 = r11
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r11.<init>(r0)
            r28 = r12
            r12 = 0
            r11.setOrientation(r12)
            r12 = 16
            r11.setGravity(r12)
            a80 r12 = r0.m1567()
            java.lang.Object r12 = r12.invoke(r14)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r29 = r13
            a80 r13 = r0.m1567()
            r30 = 9
            r31 = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r30)
            java.lang.Object r13 = r13.invoke(r15)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r30 = r5
            a80 r5 = r0.m1567()
            java.lang.Object r5 = r5.invoke(r14)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r32 = r6
            a80 r6 = r0.m1567()
            java.lang.Object r6 = r6.invoke(r15)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r11.setPadding(r12, r13, r5, r6)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r6 = r8.f8742
            r5.setText(r6)
            r6 = 1091043328(0x41080000, float:8.5)
            r5.setTextSize(r6)
            java.lang.String r6 = r8.f8743
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setTextColor(r6)
            r6 = 0
            r12 = 1
            r5.setTypeface(r6, r12)
            r6 = 17
            r5.setGravity(r6)
            r12 = 0
            r5.setIncludeFontPadding(r12)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            java.lang.String r12 = r8.f8744
            int r12 = android.graphics.Color.parseColor(r12)
            r6.setColor(r12)
            a80 r12 = r0.m1567()
            r13 = 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r12.invoke(r13)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            r6.setCornerRadius(r12)
            r5.setBackground(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            a80 r12 = r0.m1567()
            r13 = 34
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r12.invoke(r13)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            a80 r13 = r0.m1567()
            java.lang.Object r13 = r13.invoke(r3)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r6.<init>(r12, r13)
            a80 r12 = r0.m1567()
            java.lang.Object r12 = r12.invoke(r4)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r6.rightMargin = r12
            r5.setLayoutParams(r6)
            r11.addView(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r12 = 1
            r5.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = -2
            r15 = 0
            r6.<init>(r15, r13, r12)
            r5.setLayoutParams(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r12 = r8.f8745
            r6.setText(r12)
            r12 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r12)
            int r12 = android.graphics.Color.parseColor(r24)
            r6.setTextColor(r12)
            r12 = 0
            r13 = 1
            r6.setTypeface(r12, r13)
            r5.addView(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r8 = r8.f8746
            r6.setText(r8)
            r8 = 1094189056(0x41380000, float:11.5)
            r6.setTextSize(r8)
            int r8 = android.graphics.Color.parseColor(r28)
            r6.setTextColor(r8)
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r12 = 0
            r6.setPadding(r12, r8, r12, r12)
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            r12 = 1065353216(0x3f800000, float:1.0)
            r6.setLineSpacing(r8, r12)
            r5.addView(r6)
            r11.addView(r5)
            r1.addView(r11)
            int r5 = r29.size()
            r20 = 1
            int r5 = r5 + (-1)
            if (r10 >= r5) goto L2af
            android.view.View r5 = new android.view.View
            r5.<init>(r0)
            int r6 = android.graphics.Color.parseColor(r25)
            r5.setBackgroundColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r10 = -1
            r6.<init>(r10, r8)
            a80 r8 = r0.m1567()
            r10 = 62
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r8 = r8.invoke(r10)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r6.leftMargin = r8
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r14)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r6.rightMargin = r8
            r5.setLayoutParams(r6)
            r1.addView(r5)
        L2af:
            r11 = r25
            r8 = r26
            r10 = r27
            r12 = r28
            r13 = r29
            r5 = r30
            r15 = r31
            r6 = r32
            goto Le7
        L2c1:
            p000.AbstractC1021yh.m6917()
            r6 = 0
            throw r6
        L2c6:
            r30 = r5
            r32 = r6
            r25 = r11
            r28 = r12
            r29 = r13
            r31 = r15
            r6 = 0
            if (r22 != 0) goto L4d6
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            r8 = 1101004800(0x41a00000, float:20.0)
            r5.setTextSize(r8)
            r12 = 1
            r5.setTypeface(r6, r12)
            int r6 = android.graphics.Color.parseColor(r28)
            r5.setTextColor(r6)
            r6 = 17
            r5.setGravity(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r3)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            a80 r10 = r0.m1567()
            java.lang.Object r10 = r10.invoke(r3)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r6.<init>(r8, r10)
            r5.setLayoutParams(r6)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r12 = 0
            r6.setOrientation(r12)
            r12 = 16
            r6.setGravity(r12)
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r14)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            a80 r10 = r0.m1567()
            java.lang.Object r10 = r10.invoke(r4)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            a80 r11 = r0.m1567()
            r13 = 14
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r11 = r11.invoke(r13)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            a80 r13 = r0.m1567()
            java.lang.Object r13 = r13.invoke(r4)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r6.setPadding(r8, r10, r11, r13)
            r13 = 1
            r6.setClickable(r13)
            r6.setFocusable(r13)
            int r8 = android.graphics.Color.parseColor(r25)
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r19 = 0
            android.graphics.drawable.GradientDrawable r10 = p000.lz1.m3681(r19)
            a80 r11 = r0.m1567()
            java.lang.Object r11 = r11.invoke(r4)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            r10.setCornerRadius(r11)
            android.graphics.drawable.RippleDrawable r11 = new android.graphics.drawable.RippleDrawable
            r13 = 0
            r11.<init>(r8, r10, r13)
            r6.setBackground(r11)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r13 = -2
            r8.<init>(r10, r13)
            r6.setLayoutParams(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r0)
            java.lang.String r10 = r9.f8279
            r8.setText(r10)
            r10 = 1091567616(0x41100000, float:9.0)
            r8.setTextSize(r10)
            java.lang.String r10 = r9.f8282
            int r10 = android.graphics.Color.parseColor(r10)
            r8.setTextColor(r10)
            r10 = 1
            r13 = 0
            r8.setTypeface(r13, r10)
            r10 = 17
            r8.setGravity(r10)
            r15 = 0
            r8.setIncludeFontPadding(r15)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            java.lang.String r11 = r9.f8283
            int r11 = android.graphics.Color.parseColor(r11)
            r10.setColor(r11)
            a80 r11 = r0.m1567()
            r13 = 7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r11 = r11.invoke(r13)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            r10.setCornerRadius(r11)
            r8.setBackground(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            a80 r11 = r0.m1567()
            r13 = 38
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r11 = r11.invoke(r13)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            a80 r13 = r0.m1567()
            r15 = 28
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Object r13 = r13.invoke(r15)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r10.<init>(r11, r13)
            a80 r11 = r0.m1567()
            java.lang.Object r11 = r11.invoke(r4)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r10.rightMargin = r11
            r8.setLayoutParams(r10)
            r6.addView(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            r13 = 1
            r8.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = -2
            r15 = 0
            r10.<init>(r15, r13, r11)
            r8.setLayoutParams(r10)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r0)
            java.lang.String r11 = r9.f8280
            r10.setText(r11)
            r11 = 1096810496(0x41600000, float:14.0)
            r10.setTextSize(r11)
            int r11 = android.graphics.Color.parseColor(r24)
            r10.setTextColor(r11)
            r11 = 0
            r15 = 1
            r10.setTypeface(r11, r15)
            r8.addView(r10)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r0)
            java.lang.String r9 = r9.f8281
            int r11 = r29.size()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            java.lang.String r9 = " · "
            r15.append(r9)
            r15.append(r11)
            java.lang.String r9 = " 项"
            r15.append(r9)
            java.lang.String r9 = r15.toString()
            r10.setText(r9)
            r9 = 1094189056(0x41380000, float:11.5)
            r10.setTextSize(r9)
            int r9 = android.graphics.Color.parseColor(r28)
            r10.setTextColor(r9)
            a80 r9 = r0.m1567()
            java.lang.Object r9 = r9.invoke(r2)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r15 = 0
            r10.setPadding(r15, r9, r15, r15)
            r8.addView(r10)
            r6.addView(r8)
            r6.addView(r5)
            c9 r8 = new c9
            r9 = 7
            r10 = r32
            r8.<init>(r10, r1, r5, r9)
            r6.setOnClickListener(r8)
            boolean r8 = r10.f9050
            if (r8 == 0) goto L4bf
            r8 = r15
            goto L4c1
        L4bf:
            r8 = r23
        L4c1:
            r1.setVisibility(r8)
            boolean r8 = r10.f9050
            if (r8 == 0) goto L4cb
            java.lang.String r8 = "⌄"
            goto L4cd
        L4cb:
            java.lang.String r8 = "›"
        L4cd:
            r5.setText(r8)
            r5 = r30
            r5.addView(r6)
            goto L4dc
        L4d6:
            r5 = r30
            r12 = 16
            r13 = -2
            r15 = 0
        L4dc:
            r5.addView(r1)
            int r1 = r34.size()
            r20 = 1
            int r1 = r1 + (-1)
            r8 = r31
            if (r8 >= r1) goto L532
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            int r6 = android.graphics.Color.parseColor(r25)
            r1.setBackgroundColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r10 = -1
            r6.<init>(r10, r8)
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r14)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r6.leftMargin = r8
            a80 r8 = r0.m1567()
            java.lang.Object r8 = r8.invoke(r14)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r6.rightMargin = r8
            r1.setLayoutParams(r6)
            r5.addView(r1)
            goto L533
        L532:
            r10 = -1
        L533:
            r9 = r13
            r15 = r17
            r6 = r20
            r1 = r21
            r10 = r24
            r11 = r25
            r13 = r12
            r12 = r28
            goto L8d
        L543:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L549:
            return r5
    }

    /* JADX INFO: renamed from: β */
    public final android.widget.TextView m1566(java.lang.String r3, p000.nw0 r4) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r3)
            java.lang.String r3 = r4.f7784
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setTextColor(r3)
            r3 = 0
            r4 = 1
            r0.setTypeface(r3, r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1 = -2
            r3.<init>(r4, r1)
            a80 r4 = r2.m1567()
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r4.invoke(r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.topMargin = r4
            a80 r2 = r2.m1567()
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.invoke(r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3.bottomMargin = r2
            r0.setLayoutParams(r3)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final p000.a80 m1567() {
            r0 = this;
            h22 r0 = r0.f2569
            java.lang.Object r0 = r0.getValue()
            a80 r0 = (p000.a80) r0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m1568() {
            r1 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r0 = 32
            if (r1 != r0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }
}
