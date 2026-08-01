package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class GestureAreaView extends android.view.View {

    /* JADX INFO: renamed from: ξ */
    public static final p000.w90 f2522 = null;

    /* JADX INFO: renamed from: ο */
    public static final p000.x90 f2523 = null;

    /* JADX INFO: renamed from: π */
    public static final java.util.List f2524 = null;

    /* JADX INFO: renamed from: ρ */
    public static final java.util.List f2525 = null;

    /* JADX INFO: renamed from: σ */
    public static final java.util.List f2526 = null;

    /* JADX INFO: renamed from: τ */
    public static final java.util.List f2527 = null;

    /* JADX INFO: renamed from: υ */
    public static final java.util.List f2528 = null;

    /* JADX INFO: renamed from: φ */
    public static final java.util.Set f2529 = null;

    /* JADX INFO: renamed from: ε */
    public final android.graphics.Paint f2530;

    /* JADX INFO: renamed from: ζ */
    public final android.graphics.Paint f2531;

    /* JADX INFO: renamed from: η */
    public final android.graphics.Paint f2532;

    /* JADX INFO: renamed from: θ */
    public final android.graphics.Paint f2533;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Object f2534;

    /* JADX INFO: renamed from: κ */
    public java.lang.String f2535;

    /* JADX INFO: renamed from: λ */
    public final java.util.LinkedHashMap f2536;

    /* JADX INFO: renamed from: μ */
    public p000.w90 f2537;

    /* JADX INFO: renamed from: ν */
    public p000.a80 f2538;

    static {
            w90 r0 = new w90
            r7 = 0
            r8 = 0
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            r2 = 1059760811(0x3f2aaaab, float:0.6666667)
            r3 = 1051372203(0x3eaaaaab, float:0.33333334)
            r4 = 1059760811(0x3f2aaaab, float:0.6666667)
            r5 = 0
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.example.dyhelper.p002ui.GestureAreaView.f2522 = r0
            x90 r0 = new x90
            r1 = 1
            r0.<init>(r1, r1)
            com.example.dyhelper.p002ui.GestureAreaView.f2523 = r0
            java.lang.String r9 = "底部区域"
            java.lang.String r10 = "右下区域"
            java.lang.String r2 = "左上区域"
            java.lang.String r3 = "顶部区域"
            java.lang.String r4 = "右上区域"
            java.lang.String r5 = "左侧互动区"
            java.lang.String r6 = "中间区域"
            java.lang.String r7 = "右侧互动区"
            java.lang.String r8 = "左下区域"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.p002ui.GestureAreaView.f2524 = r0
            java.lang.String r0 = "double_tap"
            java.lang.String r1 = "long_press"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.p002ui.GestureAreaView.f2525 = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 1061158912(0x3f400000, float:0.75)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r0 = 1067450368(0x3fa00000, float:1.25)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r0 = 1069547520(0x3fc00000, float:1.5)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = 1077936128(0x40400000, float:3.0)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r0 = new java.lang.Float[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.p002ui.GestureAreaView.f2526 = r0
            java.lang.String r5 = "打开作者主页"
            java.lang.String r6 = "关注作者"
            java.lang.String r1 = "点赞作品"
            java.lang.String r2 = "打开评论区"
            java.lang.String r3 = "收藏作品"
            java.lang.String r4 = "分享作品"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.p002ui.GestureAreaView.f2527 = r0
            java.lang.String r19 = "模块菜单"
            java.lang.String r20 = "不感兴趣"
            java.lang.String r1 = "无"
            java.lang.String r2 = "发布按钮"
            java.lang.String r3 = "观看历史记录"
            java.lang.String r4 = "下载作品"
            java.lang.String r5 = "下载音频"
            java.lang.String r6 = "添加作品书签"
            java.lang.String r7 = "添加个人主页书签"
            java.lang.String r8 = "修改倍速"
            java.lang.String r9 = "点赞作品"
            java.lang.String r10 = "打开评论区"
            java.lang.String r11 = "收藏作品"
            java.lang.String r12 = "分享作品"
            java.lang.String r13 = "打开作者主页"
            java.lang.String r14 = "关注作者"
            java.lang.String r15 = "一键已读"
            java.lang.String r16 = "一键续火花"
            java.lang.String r17 = "清爽模式开关"
            java.lang.String r18 = "切换隐藏联系人"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            com.example.dyhelper.p002ui.GestureAreaView.f2528 = r0
            java.lang.String r18 = "模块菜单"
            java.lang.String r19 = "不感兴趣"
            java.lang.String r1 = "发布按钮"
            java.lang.String r2 = "观看历史记录"
            java.lang.String r3 = "下载作品"
            java.lang.String r4 = "下载音频"
            java.lang.String r5 = "添加作品书签"
            java.lang.String r6 = "添加个人主页书签"
            java.lang.String r7 = "修改倍速"
            java.lang.String r8 = "点赞作品"
            java.lang.String r9 = "打开评论区"
            java.lang.String r10 = "收藏作品"
            java.lang.String r11 = "分享作品"
            java.lang.String r12 = "打开作者主页"
            java.lang.String r13 = "关注作者"
            java.lang.String r14 = "一键已读"
            java.lang.String r15 = "一键续火花"
            java.lang.String r16 = "清爽模式开关"
            java.lang.String r17 = "切换隐藏联系人"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            com.example.dyhelper.p002ui.GestureAreaView.f2529 = r0
            return
    }

    public GestureAreaView(android.content.Context r4) {
            r3 = this;
            r4.getClass()
            r0 = 6
            r1 = 0
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public GestureAreaView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r3.getClass()
            r0 = 4
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public GestureAreaView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r10.getClass()
            r9.<init>(r10, r11, r12)
            android.graphics.Paint r10 = new android.graphics.Paint
            r11 = 1
            r10.<init>(r11)
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.FILL
            r10.setStyle(r12)
            r9.f2530 = r10
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>(r11)
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.STROKE
            r10.setStyle(r12)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.m1547(r0)
            r10.setStrokeWidth(r0)
            r9.f2531 = r10
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>(r11)
            r0 = 1093140480(0x41280000, float:10.5)
            float r0 = r9.m1554(r0)
            r10.setTextSize(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r10.setTextAlign(r0)
            r9.f2532 = r10
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>(r11)
            r10.setStyle(r12)
            r11 = 1073741824(0x40000000, float:2.0)
            float r11 = r9.m1547(r11)
            r10.setStrokeWidth(r11)
            r9.f2533 = r10
            java.lang.String r10 = "#6E8FD9"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r0 = new l91
            java.lang.String r11 = "左上区域"
            r0.<init>(r11, r10)
            java.lang.String r10 = "#8E6BD9"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r1 = new l91
            java.lang.String r11 = "左侧互动区"
            r1.<init>(r11, r10)
            java.lang.String r10 = "#4A90D9"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r2 = new l91
            java.lang.String r11 = "顶部区域"
            r2.<init>(r11, r10)
            java.lang.String r10 = "#42A7A2"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r3 = new l91
            java.lang.String r11 = "右上区域"
            r3.<init>(r11, r10)
            java.lang.String r10 = "#6DBB75"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r4 = new l91
            java.lang.String r11 = "中间区域"
            r4.<init>(r11, r10)
            java.lang.String r10 = "#B889D6"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r5 = new l91
            java.lang.String r11 = "左下区域"
            r5.<init>(r11, r10)
            java.lang.String r10 = "#E2A34D"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r6 = new l91
            java.lang.String r11 = "底部区域"
            r6.<init>(r11, r10)
            java.lang.String r10 = "#D95F6A"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r7 = new l91
            java.lang.String r11 = "右侧互动区"
            r7.<init>(r11, r10)
            java.lang.String r10 = "#C9A23A"
            int r10 = android.graphics.Color.parseColor(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r8 = new l91
            java.lang.String r11 = "右下区域"
            r8.<init>(r11, r10)
            l91[] r10 = new p000.l91[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.Map r10 = p000.ex0.m1972(r10)
            r9.f2534 = r10
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            r9.f2536 = r10
            w90 r10 = p000.C0381i2.m2596()
            r9.f2537 = r10
            r9.m1548()
            boolean r10 = p000.ui1.m5867()
            if (r10 != 0) goto L10a
            goto L153
        L10a:
            java.util.List r10 = com.example.dyhelper.p002ui.GestureAreaView.f2524
            java.util.Iterator r10 = r10.iterator()
        L110:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L153
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.List r12 = com.example.dyhelper.p002ui.GestureAreaView.f2525
            java.util.Iterator r12 = r12.iterator()
        L122:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L110
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = p000.C0381i2.m2602(r11, r0)
            java.lang.String r2 = "无"
            java.lang.String r2 = p000.ui1.m5893(r1, r2)
            java.lang.String r3 = p000.C0381i2.m2598(r2)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L145
            p000.ui1.m5875(r1, r3)
        L145:
            java.util.LinkedHashMap r1 = r9.f2536
            java.lang.Object r1 = r1.get(r11)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L122
            r1.put(r0, r3)
            goto L122
        L153:
            r10 = 0
            r9.setWillNotDraw(r10)
            return
    }

    public /* synthetic */ GestureAreaView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public final p000.a80 getOnAreaSelectedListener() {
            r0 = this;
            a80 r0 = r0.f2538
            return r0
    }

    public final java.lang.String getSelectedArea() {
            r0 = this;
            java.lang.String r0 = r0.f2535
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r33) {
            r32 = this;
            r0 = r32
            r1 = r33
            r1.getClass()
            super.onDraw(r33)
            int r2 = r0.getWidth()
            float r2 = (float) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L484
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 > 0) goto L1f
            goto L484
        L1f:
            w90 r5 = r0.f2537
            v90 r6 = p000.C0381i2.m2589(r2, r3, r5)
            float r7 = r6.f11185
            float r8 = r6.f11184
            float r9 = r5.f11606
            float r10 = r6.m6140()
            float r10 = r10 * r9
            float r10 = r10 + r8
            float r9 = r5.f11607
            float r11 = r6.m6140()
            float r11 = r11 * r9
            float r11 = r11 + r8
            float r9 = r5.f11608
            float r12 = r6.m6139()
            float r12 = r12 * r9
            float r12 = r12 + r7
            float r5 = r5.f11609
            float r9 = r6.m6139()
            float r9 = r9 * r5
            float r9 = r9 + r7
            java.util.List r5 = com.example.dyhelper.p002ui.GestureAreaView.f2524
            java.util.Iterator r13 = r5.iterator()
            r15 = 0
        L50:
            boolean r16 = r13.hasNext()
            r17 = r4
            if (r16 == 0) goto L3f1
            java.lang.Object r16 = r13.next()
            int r19 = r15 + 1
            if (r15 < 0) goto L3eb
            r4 = r16
            java.lang.String r4 = (java.lang.String) r4
            int r14 = r15 / 3
            int r15 = r15 % 3
            if (r15 == 0) goto L75
            r21 = r7
            r7 = 1
            if (r15 == r7) goto L72
            r22 = r11
            goto L7a
        L72:
            r22 = r10
            goto L7a
        L75:
            r21 = r7
            r7 = 1
            r22 = r8
        L7a:
            if (r15 == 0) goto L83
            if (r15 == r7) goto L81
            float r15 = r6.f11186
            goto L84
        L81:
            r15 = r11
            goto L84
        L83:
            r15 = r10
        L84:
            if (r14 == 0) goto L8e
            if (r14 == r7) goto L8b
            r23 = r9
            goto L90
        L8b:
            r23 = r12
            goto L90
        L8e:
            r23 = r21
        L90:
            if (r14 == 0) goto L99
            if (r14 == r7) goto L97
            float r7 = r6.f11187
            goto L9a
        L97:
            r7 = r9
            goto L9a
        L99:
            r7 = r12
        L9a:
            android.content.Context r14 = r0.getContext()
            r14.getClass()
            xx r14 = p000.jx0.m3049(r14)
            r24 = r6
            java.lang.String r6 = r14.f12356
            r25 = r6
            r6 = 1077936128(0x40400000, float:3.0)
            float r6 = r0.m1547(r6)
            r26 = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r27 = r7
            float r7 = r22 + r26
            r22 = r8
            float r8 = r23 + r26
            float r15 = r15 - r26
            r23 = r9
            float r9 = r27 - r26
            r6.<init>(r7, r8, r15, r9)
            float r7 = r6.width()
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 <= 0) goto Ld6
            float r7 = r6.height()
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 > 0) goto Ldf
        Ld6:
            r28 = r10
        Ld8:
            r30 = r11
            r31 = r12
            r11 = 0
            goto L3d7
        Ldf:
            java.lang.Object r7 = r0.f2534
            java.lang.Object r7 = r7.get(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto Lee
            int r7 = r7.intValue()
            goto Lf1
        Lee:
            r7 = -7829368(0xffffffffff888888, float:NaN)
        Lf1:
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.FILL
            android.graphics.Paint r9 = r0.f2530
            r9.setStyle(r8)
            r9.setColor(r7)
            boolean r7 = r14.f12350
            if (r7 == 0) goto L102
            r7 = 72
            goto L104
        L102:
            r7 = 42
        L104:
            r9.setAlpha(r7)
            r7 = 1092616192(0x41200000, float:10.0)
            float r8 = r0.m1547(r7)
            float r15 = r0.m1547(r7)
            r1.drawRoundRect(r6, r8, r15, r9)
            r8 = 255(0xff, float:3.57E-43)
            r9.setAlpha(r8)
            java.lang.String r8 = r14.f12353
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.Paint r9 = r0.f2531
            r9.setColor(r8)
            float r8 = r0.m1547(r7)
            float r7 = r0.m1547(r7)
            r1.drawRoundRect(r6, r8, r7, r9)
            java.util.LinkedHashMap r7 = r0.f2536
            java.lang.Object r7 = r7.get(r4)
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L142
            java.lang.String r8 = "double_tap"
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L143
        L142:
            r8 = 0
        L143:
            java.lang.String r8 = p000.C0381i2.m2591(r8)
            if (r7 == 0) goto L152
            java.lang.String r9 = "long_press"
            java.lang.Object r7 = r7.get(r9)
            java.lang.String r7 = (java.lang.String) r7
            goto L153
        L152:
            r7 = 0
        L153:
            java.lang.String r7 = p000.C0381i2.m2591(r7)
            float r9 = r6.height()
            r15 = 1115160576(0x42780000, float:62.0)
            float r15 = r0.m1547(r15)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 >= 0) goto L167
            r9 = 1
            goto L168
        L167:
            r9 = 0
        L168:
            if (r9 == 0) goto L171
            r15 = 1092091904(0x41180000, float:9.5)
        L16c:
            float r15 = r0.m1554(r15)
            goto L175
        L171:
            r15 = 1093455053(0x412ccccd, float:10.8)
            goto L16c
        L175:
            r26 = r6
            if (r9 == 0) goto L181
            r6 = 1091148186(0x4109999a, float:8.6)
        L17c:
            float r6 = r0.m1554(r6)
            goto L185
        L181:
            r6 = 1092406477(0x411ccccd, float:9.8)
            goto L17c
        L185:
            if (r9 == 0) goto L191
            r9 = 1067030938(0x3f99999a, float:1.2)
            float r9 = r0.m1547(r9)
            r27 = r9
            goto L197
        L191:
            r9 = 1073741824(0x40000000, float:2.0)
            float r27 = r0.m1547(r9)
        L197:
            y90 r9 = new y90
            java.lang.String r14 = r14.f12355
            int r14 = android.graphics.Color.parseColor(r14)
            r28 = r10
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT_BOLD
            r10.getClass()
            r9.<init>(r4, r15, r14, r10)
            y90 r4 = new y90
            java.lang.String r10 = "双击："
            java.lang.String r8 = r10.concat(r8)
            int r10 = android.graphics.Color.parseColor(r25)
            android.graphics.Typeface r14 = android.graphics.Typeface.DEFAULT
            r14.getClass()
            r4.<init>(r8, r6, r10, r14)
            y90 r8 = new y90
            java.lang.String r10 = "长按："
            java.lang.String r7 = r10.concat(r7)
            int r10 = android.graphics.Color.parseColor(r25)
            r8.<init>(r7, r6, r10, r14)
            y90[] r4 = new p000.y90[]{r9, r4, r8}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L1dc
        L1da:
            goto Ld8
        L1dc:
            float r6 = r26.width()
            r7 = 1086324736(0x40c00000, float:6.0)
            float r7 = r0.m1547(r7)
            float r6 = r6 - r7
            int r7 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r7 >= 0) goto L1ed
            r6 = r17
        L1ed:
            float r7 = r26.height()
            r8 = 1082130432(0x40800000, float:4.0)
            float r8 = r0.m1547(r8)
            float r7 = r7 - r8
            int r8 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r8 >= 0) goto L1fe
            r7 = r17
        L1fe:
            int r8 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r8 <= 0) goto Ld8
            int r9 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r9 > 0) goto L207
            goto L1da
        L207:
            java.util.ArrayList r9 = r0.m1551(r4)
            java.util.ArrayList r10 = new java.util.ArrayList
            r14 = 10
            int r15 = p000.AbstractC1021yh.m6889(r9, r14)
            r10.<init>(r15)
            java.util.Iterator r15 = r9.iterator()
        L21a:
            boolean r25 = r15.hasNext()
            if (r25 == 0) goto L23b
            java.lang.Object r25 = r15.next()
            r14 = r25
            android.graphics.Paint$FontMetrics r14 = (android.graphics.Paint.FontMetrics) r14
            r25 = r6
            float r6 = r14.descent
            float r14 = r14.ascent
            float r6 = r6 - r14
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r10.add(r6)
            r6 = r25
            r14 = 10
            goto L21a
        L23b:
            r25 = r6
            java.util.Iterator r6 = r10.iterator()
            r14 = r17
        L243:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L255
            java.lang.Object r15 = r6.next()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            float r14 = r14 + r15
            goto L243
        L255:
            int r6 = r4.size()
            r16 = 1
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r27
            float r6 = r6 + r14
            int r14 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r14 <= 0) goto L2fb
            int r14 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r14 <= 0) goto L2fb
            float r7 = r7 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r9 <= 0) goto L271
            r7 = r6
        L271:
            java.util.ArrayList r6 = new java.util.ArrayList
            r9 = 10
            int r10 = p000.AbstractC1021yh.m6889(r4, r9)
            r6.<init>(r10)
            java.util.Iterator r4 = r4.iterator()
        L280:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L2a5
            java.lang.Object r9 = r4.next()
            y90 r9 = (p000.y90) r9
            float r10 = r9.f12501
            float r10 = r10 * r7
            java.lang.String r14 = r9.f12500
            int r15 = r9.f12502
            android.graphics.Typeface r9 = r9.f12503
            r14.getClass()
            r30 = r4
            y90 r4 = new y90
            r4.<init>(r14, r10, r15, r9)
            r6.add(r4)
            r4 = r30
            goto L280
        L2a5:
            float r9 = r27 * r7
            java.util.ArrayList r4 = r0.m1551(r6)
            java.util.ArrayList r10 = new java.util.ArrayList
            r7 = 10
            int r7 = p000.AbstractC1021yh.m6889(r4, r7)
            r10.<init>(r7)
            java.util.Iterator r7 = r4.iterator()
        L2ba:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L2d3
            java.lang.Object r14 = r7.next()
            android.graphics.Paint$FontMetrics r14 = (android.graphics.Paint.FontMetrics) r14
            float r15 = r14.descent
            float r14 = r14.ascent
            float r15 = r15 - r14
            java.lang.Float r14 = java.lang.Float.valueOf(r15)
            r10.add(r14)
            goto L2ba
        L2d3:
            java.util.Iterator r7 = r10.iterator()
            r14 = r17
        L2d9:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L2eb
            java.lang.Object r15 = r7.next()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            float r14 = r14 + r15
            goto L2d9
        L2eb:
            int r7 = r6.size()
            r16 = 1
            int r7 = r7 + (-1)
            float r7 = (float) r7
            float r7 = r7 * r9
            float r7 = r7 + r14
            r27 = r9
            r9 = r4
            r4 = r6
            r6 = r7
        L2fb:
            float r7 = r26.centerY()
            r20 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r20
            float r7 = r7 - r6
            java.lang.Object r6 = p000.AbstractC0984xh.m6638(r9)
            android.graphics.Paint$FontMetrics r6 = (android.graphics.Paint.FontMetrics) r6
            float r6 = r6.ascent
            float r7 = r7 - r6
            android.graphics.Paint$Align r6 = android.graphics.Paint.Align.CENTER
            android.graphics.Paint r9 = r0.f2532
            r9.setTextAlign(r6)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L319:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L3ab
            java.lang.Object r14 = r4.next()
            int r15 = r6 + 1
            if (r6 < 0) goto L3a5
            y90 r14 = (p000.y90) r14
            r20 = r4
            android.graphics.Typeface r4 = r14.f12503
            r9.setTypeface(r4)
            float r4 = r14.f12501
            r9.setTextSize(r4)
            int r4 = r14.f12502
            r9.setColor(r4)
            java.lang.String r4 = r14.f12500
            java.lang.String r14 = ""
            if (r8 > 0) goto L349
            r29 = r8
        L342:
            r30 = r11
            r31 = r12
            r4 = r14
        L347:
            r11 = 0
            goto L386
        L349:
            float r29 = r9.measureText(r4)
            int r29 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r29 > 0) goto L358
            r29 = r8
            r30 = r11
            r31 = r12
            goto L347
        L358:
            r29 = r8
            java.lang.String r8 = "…"
            float r30 = r9.measureText(r8)
            int r31 = (r30 > r25 ? 1 : (r30 == r25 ? 0 : -1))
            if (r31 <= 0) goto L365
            goto L342
        L365:
            float r14 = r25 - r30
            r30 = r11
            r31 = r12
            r11 = 0
            r12 = 1
            int r14 = r9.breakText(r4, r12, r14, r11)
            if (r14 > 0) goto L375
            r4 = r8
            goto L347
        L375:
            r11 = 0
            java.lang.String r4 = r4.substring(r11, r14)
            java.lang.CharSequence r4 = p000.q02.m4662(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = p000.AbstractC0602nx.m4129(r4, r8)
        L386:
            float r8 = r26.centerX()
            r1.drawText(r4, r8, r7, r9)
            java.lang.Object r4 = r10.get(r6)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = r4 + r27
            float r7 = r7 + r4
            r6 = r15
            r4 = r20
            r8 = r29
            r11 = r30
            r12 = r31
            goto L319
        L3a5:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L3ab:
            r30 = r11
            r31 = r12
            r11 = 0
            android.content.Context r4 = r0.getContext()
            r4.getClass()
            xx r4 = p000.jx0.m3049(r4)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
            r9.setTypeface(r6)
            r6 = 1093140480(0x41280000, float:10.5)
            float r6 = r0.m1554(r6)
            r9.setTextSize(r6)
            java.lang.String r4 = r4.f12355
            int r4 = android.graphics.Color.parseColor(r4)
            r9.setColor(r4)
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.CENTER
            r9.setTextAlign(r4)
        L3d7:
            r4 = r17
            r15 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r6 = r24
            r10 = r28
            r11 = r30
            r12 = r31
            goto L50
        L3eb:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L3f1:
            r18 = 0
            java.lang.String r4 = r0.f2535
            if (r4 == 0) goto L484
            android.content.Context r6 = r0.getContext()
            r6.getClass()
            xx r6 = p000.jx0.m3049(r6)
            java.lang.String r6 = r6.f12366
            int r6 = android.graphics.Color.parseColor(r6)
            android.graphics.Paint r7 = r0.f2533
            r7.setColor(r6)
            r9 = 1073741824(0x40000000, float:2.0)
            float r6 = r0.m1547(r9)
            int r4 = r5.indexOf(r4)
            if (r4 >= 0) goto L41c
            r14 = r18
            goto L474
        L41c:
            int r5 = r4 / 3
            int r4 = r4 % 3
            w90 r8 = r0.f2537
            v90 r2 = p000.C0381i2.m2589(r2, r3, r8)
            float r3 = r2.f11185
            float r9 = r2.f11184
            float r10 = r8.f11606
            float r11 = r2.m6140()
            float r11 = r11 * r10
            float r11 = r11 + r9
            float r10 = r8.f11607
            float r12 = r2.m6140()
            float r12 = r12 * r10
            float r12 = r12 + r9
            float r10 = r8.f11608
            float r13 = r2.m6139()
            float r13 = r13 * r10
            float r13 = r13 + r3
            float r8 = r8.f11609
            float r10 = r2.m6139()
            float r10 = r10 * r8
            float r10 = r10 + r3
            if (r4 == 0) goto L453
            r8 = 1
            if (r4 == r8) goto L451
            r9 = r12
            goto L454
        L451:
            r9 = r11
            goto L454
        L453:
            r8 = 1
        L454:
            if (r4 == 0) goto L45c
            if (r4 == r8) goto L45b
            float r11 = r2.f11186
            goto L45c
        L45b:
            r11 = r12
        L45c:
            if (r5 == 0) goto L463
            if (r5 == r8) goto L462
            r3 = r10
            goto L463
        L462:
            r3 = r13
        L463:
            if (r5 == 0) goto L46b
            if (r5 == r8) goto L46a
            float r13 = r2.f11187
            goto L46b
        L46a:
            r13 = r10
        L46b:
            android.graphics.RectF r14 = new android.graphics.RectF
            float r9 = r9 + r6
            float r3 = r3 + r6
            float r11 = r11 - r6
            float r13 = r13 - r6
            r14.<init>(r9, r3, r11, r13)
        L474:
            if (r14 != 0) goto L477
            goto L484
        L477:
            r2 = 1093664768(0x41300000, float:11.0)
            float r3 = r0.m1547(r2)
            float r0 = r0.m1547(r2)
            r1.drawRoundRect(r14, r3, r0, r7)
        L484:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
            r5 = this;
            r6.getClass()
            int r0 = r6.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 == r1) goto L14
            r2 = 3
            if (r0 == r2) goto L3e
            boolean r5 = super.onTouchEvent(r6)
            return r5
        L14:
            super.performClick()
            return r1
        L18:
            float r0 = r6.getX()
            float r6 = r6.getY()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            w90 r4 = r5.f2537
            java.lang.String r6 = p000.C0381i2.m2594(r0, r6, r2, r3, r4)
            if (r6 == 0) goto L3e
            r5.f2535 = r6
            r5.invalidate()
            a80 r5 = r5.f2538
            if (r5 == 0) goto L3e
            r5.invoke(r6)
        L3e:
            return r1
    }

    @Override // android.view.View
    public final boolean performClick() {
            r0 = this;
            super.performClick()
            r0 = 1
            return r0
    }

    public final void setGridBounds(p000.w90 r1) {
            r0 = this;
            r1.getClass()
            w90 r1 = p000.C0381i2.m2599(r1)
            r0.f2537 = r1
            r0.invalidate()
            return
    }

    public final void setOnAreaSelectedListener(p000.a80 r1) {
            r0 = this;
            r0.f2538 = r1
            return
    }

    public final void setSelectedArea(java.lang.String r1) {
            r0 = this;
            r0.f2535 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final float m1547(float r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m1548() {
            r6 = this;
            java.util.LinkedHashMap r6 = r6.f2536
            r6.clear()
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2524
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            l91 r2 = new l91
            java.lang.String r3 = "double_tap"
            java.lang.String r4 = "无"
            r2.<init>(r3, r4)
            l91 r3 = new l91
            java.lang.String r5 = "long_press"
            r3.<init>(r5, r4)
            l91[] r2 = new p000.l91[]{r2, r3}
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r4 = 2
            int r4 = p000.ex0.m1970(r4)
            r3.<init>(r4)
            p000.ex0.m1973(r3, r2)
            r6.put(r1, r3)
            goto Lb
        L3c:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final int m1549(java.lang.String r4) {
            r3 = this;
            java.util.LinkedHashMap r3 = r3.f2536
            java.util.Collection r3 = r3.values()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r3.next()
            java.util.Map r1 = (java.util.Map) r1
            if (r4 != 0) goto L3a
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.C0381i2.m2595(r2)
            if (r2 == 0) goto L25
            int r0 = r0 + 1
            goto L25
        L3a:
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.C0381i2.m2595(r1)
            if (r1 == 0) goto Ld
            int r0 = r0 + 1
            goto Ld
        L49:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.String m1550(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.f2536
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r0 = p000.C0381i2.m2598(r0)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList m1551(java.util.List r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r5.next()
            y90 r1 = (p000.y90) r1
            android.graphics.Typeface r2 = r1.f12503
            android.graphics.Paint r3 = r4.f2532
            r3.setTypeface(r2)
            float r1 = r1.f12501
            r3.setTextSize(r1)
            android.graphics.Paint$FontMetrics r1 = new android.graphics.Paint$FontMetrics
            r1.<init>()
            r3.getFontMetrics(r1)
            r0.add(r1)
            goto Lf
        L33:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1552() {
            r6 = this;
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L7
            goto L4b
        L7:
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2524
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r2 = com.example.dyhelper.p002ui.GestureAreaView.f2525
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.LinkedHashMap r4 = r6.f2536
            java.lang.Object r4 = r4.get(r1)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            goto L3d
        L3c:
            r4 = 0
        L3d:
            java.lang.String r4 = p000.C0381i2.m2598(r4)
            java.lang.Object r5 = p000.ui1.f10844
            java.lang.String r3 = p000.C0381i2.m2602(r1, r3)
            p000.ui1.m5875(r3, r4)
            goto L1f
        L4b:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m1553(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2524
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L9
            goto L11
        L9:
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2525
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L12
        L11:
            return
        L12:
            java.util.LinkedHashMap r0 = r2.f2536
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L22
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.put(r3, r1)
        L22:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r3 = p000.C0381i2.m2598(r5)
            r1.put(r4, r3)
            r2.invalidate()
            return
    }

    /* JADX INFO: renamed from: θ */
    public final float m1554(float r2) {
            r1 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 2
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            return r1
    }
}
