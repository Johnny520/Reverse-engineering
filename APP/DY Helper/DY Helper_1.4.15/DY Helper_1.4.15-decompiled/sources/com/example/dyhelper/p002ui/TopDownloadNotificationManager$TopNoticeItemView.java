package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class TopDownloadNotificationManager$TopNoticeItemView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: Γ */
    public static final /* synthetic */ int f2601 = 0;

    /* JADX INFO: renamed from: Α */
    public float f2602;

    /* JADX INFO: renamed from: Β */
    public int f2603;

    /* JADX INFO: renamed from: ε */
    public final p000.g52 f2604;

    /* JADX INFO: renamed from: ζ */
    public final int f2605;

    /* JADX INFO: renamed from: η */
    public final int f2606;

    /* JADX INFO: renamed from: θ */
    public final int f2607;

    /* JADX INFO: renamed from: ι */
    public final int f2608;

    /* JADX INFO: renamed from: κ */
    public final int f2609;

    /* JADX INFO: renamed from: λ */
    public int f2610;

    /* JADX INFO: renamed from: μ */
    public p000.f52 f2611;

    /* JADX INFO: renamed from: ν */
    public float f2612;

    /* JADX INFO: renamed from: ξ */
    public android.animation.ValueAnimator f2613;

    /* JADX INFO: renamed from: ο */
    public final android.view.animation.PathInterpolator f2614;

    /* JADX INFO: renamed from: π */
    public final android.widget.FrameLayout f2615;

    /* JADX INFO: renamed from: ρ */
    public final com.example.dyhelper.p002ui.TopDownloadNotificationManager$BackgroundLayerView f2616;

    /* JADX INFO: renamed from: σ */
    public final android.widget.LinearLayout f2617;

    /* JADX INFO: renamed from: τ */
    public final com.example.dyhelper.p002ui.TopDownloadNotificationManager$ProgressDotView f2618;

    /* JADX INFO: renamed from: υ */
    public final android.widget.TextView f2619;

    /* JADX INFO: renamed from: φ */
    public final android.widget.TextView f2620;

    /* JADX INFO: renamed from: χ */
    public final android.widget.TextView f2621;

    /* JADX INFO: renamed from: ψ */
    public final com.example.dyhelper.p002ui.TopDownloadNotificationManager$CloseButtonView f2622;

    /* JADX INFO: renamed from: ω */
    public final com.example.dyhelper.p002ui.TopDownloadNotificationManager$ProgressLineView f2623;

    public TopDownloadNotificationManager$TopNoticeItemView(android.content.Context r18, p000.g52 r19, p000.tv1 r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r2.getClass()
            r20.getClass()
            r17.<init>(r18)
            r0.f2604 = r2
            android.content.res.Resources r3 = r0.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            r4 = 1105199104(0x41e00000, float:28.0)
            int r5 = r0.m1578(r4)
            int r3 = r3 - r5
            r5 = 1136263168(0x43ba0000, float:372.0)
            int r5 = r0.m1578(r5)
            int r3 = java.lang.Math.min(r3, r5)
            r0.f2605 = r3
            r5 = 1116995584(0x42940000, float:74.0)
            int r5 = r0.m1578(r5)
            r0.f2606 = r5
            r6 = 1113063424(0x42580000, float:54.0)
            int r6 = r0.m1578(r6)
            r0.f2607 = r6
            r6 = 1108869120(0x42180000, float:38.0)
            int r7 = r0.m1578(r6)
            r0.f2608 = r7
            int r4 = r0.m1578(r4)
            r0.f2609 = r4
            r4 = -1
            r0.f2610 = r4
            f52 r8 = p000.f52.f3753
            r0.f2611 = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.f2612 = r8
            android.view.animation.PathInterpolator r9 = new android.view.animation.PathInterpolator
            r10 = 1042536202(0x3e23d70a, float:0.16)
            r11 = 1050253722(0x3e99999a, float:0.3)
            r9.<init>(r10, r8, r11, r8)
            r0.f2614 = r9
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            r9.<init>(r1)
            r10 = 1096810496(0x41600000, float:14.0)
            int r11 = r0.m1578(r10)
            float r11 = (float) r11
            r9.setElevation(r11)
            r11 = 1
            r9.setClipChildren(r11)
            r9.setClipToPadding(r11)
            r9.setClipToOutline(r11)
            android.view.ViewOutlineProvider r12 = android.view.ViewOutlineProvider.BACKGROUND
            r9.setOutlineProvider(r12)
            r0.f2615 = r9
            com.example.dyhelper.ui.TopDownloadNotificationManager$BackgroundLayerView r12 = new com.example.dyhelper.ui.TopDownloadNotificationManager$BackgroundLayerView
            r12.<init>(r1, r2)
            r0.f2616 = r12
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r13 = 0
            r2.setOrientation(r13)
            r14 = 16
            r2.setGravity(r14)
            r14 = 1095761920(0x41500000, float:13.0)
            int r15 = r0.m1578(r14)
            r8 = 1091567616(0x41100000, float:9.0)
            int r4 = r0.m1578(r8)
            int r14 = r0.m1578(r14)
            int r8 = r0.m1578(r8)
            r2.setPadding(r15, r4, r14, r8)
            r0.f2617 = r2
            com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressDotView r4 = new com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressDotView
            r4.<init>(r1)
            r0.f2618 = r4
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r1)
            r8.setTextSize(r10)
            r10 = -15656921(0xffffffffff111827, float:-1.9286347E38)
            r8.setTextColor(r10)
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT_BOLD
            r8.setTypeface(r10)
            r8.setMaxLines(r11)
            r8.setIncludeFontPadding(r13)
            r0.f2619 = r8
            android.widget.TextView r14 = new android.widget.TextView
            r14.<init>(r1)
            r15 = 1094713344(0x41400000, float:12.0)
            r14.setTextSize(r15)
            r6 = -10525069(0xffffffffff5f6673, float:-2.9694979E38)
            r14.setTextColor(r6)
            r14.setMaxLines(r11)
            r14.setIncludeFontPadding(r13)
            r0.f2620 = r14
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            r6.setTextSize(r15)
            r15 = -15103494(0xffffffffff1989fa, float:-2.040883E38)
            r6.setTextColor(r15)
            r6.setTypeface(r10)
            r10 = 17
            r6.setGravity(r10)
            r10 = 1108869120(0x42180000, float:38.0)
            int r10 = r0.m1578(r10)
            r6.setMinWidth(r10)
            r6.setIncludeFontPadding(r13)
            r0.f2621 = r6
            com.example.dyhelper.ui.TopDownloadNotificationManager$CloseButtonView r10 = new com.example.dyhelper.ui.TopDownloadNotificationManager$CloseButtonView
            r10.<init>(r1)
            java.lang.String r15 = "关闭通知"
            r10.setContentDescription(r15)
            r10.setClickable(r11)
            r10.setFocusable(r11)
            com.example.dyhelper.ui.ω r15 = new com.example.dyhelper.ui.ω
            r15.<init>(r10, r11)
            r10.setOnTouchListener(r15)
            com.example.dyhelper.ui.η r11 = new com.example.dyhelper.ui.η
            r15 = 1
            r13 = r20
            r11.<init>(r15, r13)
            r10.setOnClickListener(r11)
            r0.f2622 = r10
            com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressLineView r11 = new com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressLineView
            r11.<init>(r1)
            r0.f2623 = r11
            r13 = 0
            r0.setClipChildren(r13)
            r0.setClipToPadding(r13)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            r13.<init>(r1)
            r1 = 1
            r13.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            r16 = r3
            r3 = -1
            r1.<init>(r3, r15)
            r13.addView(r8, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r3, r15)
            r8 = 1084227584(0x40a00000, float:5.0)
            int r8 = r0.m1578(r8)
            r1.topMargin = r8
            r13.addView(r14, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r8 = 1082130432(0x40800000, float:4.0)
            int r8 = r0.m1578(r8)
            r1.<init>(r3, r8)
            r3 = 1090519040(0x41000000, float:8.0)
            int r8 = r0.m1578(r3)
            r1.topMargin = r8
            r13.addView(r11, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r7, r7)
            r2.addView(r4, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r1.<init>(r7, r15, r4)
            r4 = 1093664768(0x41300000, float:11.0)
            int r4 = r0.m1578(r4)
            r1.leftMargin = r4
            int r3 = r0.m1578(r3)
            r1.rightMargin = r3
            r2.addView(r13, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r15)
            r2.addView(r6, r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = 1104150528(0x41d00000, float:26.0)
            int r4 = r0.m1578(r3)
            int r3 = r0.m1578(r3)
            r1.<init>(r4, r3)
            r3 = 1086324736(0x40c00000, float:6.0)
            int r3 = r0.m1578(r3)
            r1.leftMargin = r3
            r2.addView(r10, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r1.<init>(r3, r3)
            r9.addView(r12, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r3)
            r9.addView(r2, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 49
            r3 = r16
            r1.<init>(r3, r5, r2)
            r0.addView(r9, r1)
            r4 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r0.m1576(r13, r4)
            r0.f2602 = r4
            return
    }

    /* JADX INFO: renamed from: δ */
    public static float m1575(float r2, float r3, float r4) {
            float r3 = r3 - r2
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = p000.j81.m2905(r4, r0, r1)
            float r4 = r4 * r3
            float r4 = r4 + r2
            return r4
    }

    /* JADX INFO: renamed from: α */
    public final void m1576(int r3, float r4) {
            r2 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.j81.m2905(r4, r0, r1)
            r2.f2602 = r0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.m1577(r4, r3)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1577(java.lang.Float r14, java.lang.Integer r15) {
            r13 = this;
            if (r14 == 0) goto L7
            float r14 = r14.floatValue()
            goto L9
        L7:
            float r14 = r13.f2602
        L9:
            if (r15 == 0) goto L10
            int r15 = r15.intValue()
            goto L12
        L10:
            int r15 = r13.f2603
        L12:
            r13.f2603 = r15
            float r0 = r13.f2612
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.j81.m2905(r0, r1, r2)
            if (r15 != 0) goto L20
            goto L22
        L20:
            float r1 = r2 - r14
        L22:
            r3 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 1
            r5 = 1043878380(0x3e3851ec, float:0.18)
            r6 = 0
            if (r3 < 0) goto L31
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 >= 0) goto L3a
        L31:
            r3 = 1060655596(0x3f3851ec, float:0.72)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L3a
            r3 = r4
            goto L3b
        L3a:
            r3 = r6
        L3b:
            int r7 = r13.f2608
            float r8 = (float) r7
            int r9 = r13.f2606
            int r9 = r9 - r7
            float r9 = (float) r9
            float r9 = r9 * r14
            float r9 = r9 + r8
            int r10 = r13.f2609
            float r11 = (float) r10
            int r12 = r13.f2607
            int r12 = r12 - r10
            float r12 = (float) r12
            float r12 = r12 * r14
            float r12 = r12 + r11
            float r12 = m1575(r12, r9, r1)
            float r9 = m1575(r12, r9, r0)
            int r12 = r13.f2605
            int r7 = r12 - r7
            float r7 = (float) r7
            float r7 = r7 * r14
            float r7 = r7 + r8
            r8 = 1107296256(0x42000000, float:32.0)
            int r8 = r13.m1578(r8)
            int r12 = r12 - r8
            int r12 = r12 - r10
            float r8 = (float) r12
            float r8 = r8 * r14
            float r8 = r8 + r11
            float r8 = m1575(r8, r7, r1)
            float r7 = m1575(r8, r7, r0)
            android.widget.FrameLayout r8 = r13.f2615
            android.view.ViewGroup$LayoutParams r10 = r8.getLayoutParams()
            r10.getClass()
            android.widget.FrameLayout$LayoutParams r10 = (android.widget.FrameLayout.LayoutParams) r10
            int r7 = (int) r7
            r10.width = r7
            int r7 = (int) r9
            r10.height = r7
            r8.setLayoutParams(r10)
            float r7 = (float) r15
            r9 = 1111490560(0x42400000, float:48.0)
            float r7 = r7 * r9
            r9 = 1123024896(0x42f00000, float:120.0)
            int r10 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r10 <= 0) goto L8e
            r7 = r9
        L8e:
            int r7 = r13.m1578(r7)
            int r7 = -r7
            float r7 = (float) r7
            float r7 = r7 * r1
            r1 = 1088421888(0x40e00000, float:7.0)
            int r1 = r13.m1578(r1)
            float r1 = (float) r1
            r9 = 1099956224(0x41900000, float:18.0)
            int r9 = r13.m1578(r9)
            float r9 = (float) r9
            float r1 = m1575(r1, r9, r0)
            float r9 = r2 - r14
            float r1 = r1 * r9
            float r7 = r7 - r1
            r8.setTranslationY(r7)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r14
            r7 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 + r7
            r7 = 1062333317(0x3f51eb85, float:0.82)
            float r5 = r5 * r14
            float r5 = r5 + r7
            float r7 = m1575(r1, r5, r0)
            r8.setScaleX(r7)
            float r1 = m1575(r1, r5, r0)
            r8.setScaleY(r1)
            r1 = 1046562734(0x3e6147ae, float:0.22)
            r5 = 1061662228(0x3f47ae14, float:0.78)
            if (r15 != 0) goto Ld4
            float r1 = r1 * r14
            float r1 = r1 + r5
            goto Ld7
        Ld4:
            float r1 = r1 * r14
            float r1 = r1 + r5
            float r1 = r1 * r14
        Ld7:
            r8.setAlpha(r1)
            r1 = 1095761920(0x41500000, float:13.0)
            int r1 = r13.m1578(r1)
            float r1 = (float) r1
            float r1 = r1 * r14
            int r1 = (int) r1
            r5 = 1091567616(0x41100000, float:9.0)
            int r7 = r13.m1578(r5)
            int r5 = r13.m1578(r5)
            android.widget.LinearLayout r10 = r13.f2617
            r10.setPadding(r1, r7, r1, r5)
            r1 = 1095237632(0x41480000, float:12.5)
            r5 = 1096810496(0x41600000, float:14.0)
            float r1 = m1575(r1, r5, r0)
            android.widget.TextView r5 = r13.f2619
            r5.setTextSize(r1)
            r1 = 1093664768(0x41300000, float:11.0)
            r5 = 1094713344(0x41400000, float:12.0)
            float r7 = m1575(r1, r5, r0)
            android.widget.TextView r10 = r13.f2620
            r10.setTextSize(r7)
            float r1 = m1575(r1, r5, r0)
            android.widget.TextView r5 = r13.f2621
            r5.setTextSize(r1)
            if (r15 != 0) goto L119
            r1 = r14
            goto L11b
        L119:
            float r1 = r14 * r14
        L11b:
            r10.setAlpha(r1)
            r5.setAlpha(r1)
            com.example.dyhelper.ui.TopDownloadNotificationManager$CloseButtonView r5 = r13.f2622
            r5.setAlpha(r1)
            r7 = 1051931443(0x3eb33333, float:0.35)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L12e
            goto L12f
        L12e:
            r4 = r6
        L12f:
            r5.setEnabled(r4)
            com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressLineView r1 = r13.f2623
            float r4 = r14 * r0
            r1.setAlpha(r4)
            com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressDotView r1 = r13.f2618
            r1.f2577 = r3
            if (r15 != 0) goto L140
            goto L141
        L140:
            r2 = r14
        L141:
            r1.setAlpha(r2)
            r1.invalidate()
            g52 r15 = r13.f2604
            int r15 = r15.f4256
            r1 = 100
            int r15 = p000.j81.m2906(r15, r6, r1)
            float r15 = (float) r15
            r1 = 1120403456(0x42c80000, float:100.0)
            float r15 = r15 / r1
            r1 = 218(0xda, float:3.05E-43)
            float r2 = (float) r1
            r3 = 142(0x8e, float:1.99E-43)
            float r3 = (float) r3
            float r3 = r3 * r15
            float r2 = r2 - r3
            int r15 = (int) r2
            r2 = 64
            int r15 = p000.j81.m2906(r15, r2, r1)
            r1 = 44
            float r1 = (float) r1
            float r9 = r9 * r1
            int r1 = (int) r9
            int r15 = r15 + r1
            r1 = 240(0xf0, float:3.36E-43)
            if (r15 <= r1) goto L16f
            r15 = r1
        L16f:
            r1 = 255(0xff, float:3.57E-43)
            int r15 = android.graphics.Color.argb(r15, r1, r1, r1)
            r2 = 1097859072(0x41700000, float:15.0)
            int r2 = r13.m1578(r2)
            float r2 = (float) r2
            r3 = 1100480512(0x41980000, float:19.0)
            int r3 = r13.m1578(r3)
            float r3 = (float) r3
            float r2 = m1575(r2, r3, r0)
            r3 = 1102053376(0x41b00000, float:22.0)
            int r3 = r13.m1578(r3)
            float r3 = (float) r3
            r4 = 1105199104(0x41e00000, float:28.0)
            int r4 = r13.m1578(r4)
            float r4 = (float) r4
            float r0 = m1575(r3, r4, r0)
            float r0 = r0 - r2
            float r0 = r0 * r14
            float r0 = r0 + r2
            android.os.Handler r14 = com.example.dyhelper.p002ui.C0182.f2694
            r14 = 1060320051(0x3f333333, float:0.7)
            int r14 = r13.m1578(r14)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setColor(r6)
            r2.setCornerRadius(r0)
            r3 = 26
            int r1 = android.graphics.Color.argb(r3, r1, r1, r1)
            r2.setStroke(r14, r1)
            r8.setBackground(r2)
            com.example.dyhelper.ui.TopDownloadNotificationManager$BackgroundLayerView r13 = r13.f2616
            r13.f2574 = r15
            r13.f2575 = r0
            r13.invalidate()
            return
    }

    /* JADX INFO: renamed from: γ */
    public final int m1578(float r2) {
            r1 = this;
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            android.content.Context r1 = r1.getContext()
            r1.getClass()
            int r1 = com.example.dyhelper.p002ui.C0182.m1589(r1, r2)
            return r1
    }
}
