package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class TopDownloadNotificationManager$TopNoticeHostView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: σ */
    public static final /* synthetic */ int f2587 = 0;

    /* JADX INFO: renamed from: ε */
    public final p000.g52 f2588;

    /* JADX INFO: renamed from: ζ */
    public final p000.tv1 f2589;

    /* JADX INFO: renamed from: η */
    public final android.view.animation.PathInterpolator f2590;

    /* JADX INFO: renamed from: θ */
    public final android.view.animation.PathInterpolator f2591;

    /* JADX INFO: renamed from: ι */
    public final android.widget.LinearLayout f2592;

    /* JADX INFO: renamed from: κ */
    public final java.util.LinkedHashMap f2593;

    /* JADX INFO: renamed from: λ */
    public final java.util.LinkedHashMap f2594;

    /* JADX INFO: renamed from: μ */
    public final android.widget.TextView f2595;

    /* JADX INFO: renamed from: ν */
    public boolean f2596;

    /* JADX INFO: renamed from: ξ */
    public float f2597;

    /* JADX INFO: renamed from: ο */
    public boolean f2598;

    /* JADX INFO: renamed from: π */
    public android.animation.ValueAnimator f2599;

    /* JADX INFO: renamed from: ρ */
    public float f2600;

    public TopDownloadNotificationManager$TopNoticeHostView(android.app.Activity r8, p000.g52 r9, p000.tv1 r10) {
            r7 = this;
            r8.getClass()
            r7.<init>(r8)
            r7.f2588 = r9
            r7.f2589 = r10
            android.view.animation.PathInterpolator r9 = new android.view.animation.PathInterpolator
            r10 = 1050253722(0x3e99999a, float:0.3)
            r0 = 1042536202(0x3e23d70a, float:0.16)
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r0, r1, r10, r1)
            r7.f2590 = r9
            android.view.animation.PathInterpolator r9 = new android.view.animation.PathInterpolator
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            r0 = 0
            r9.<init>(r10, r0, r0, r1)
            r7.f2591 = r9
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r8)
            r10 = 1
            r9.setOrientation(r10)
            r9.setGravity(r10)
            r0 = 0
            r9.setClipChildren(r0)
            r9.setClipToPadding(r0)
            r7.f2592 = r9
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r7.f2593 = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r7.f2594 = r2
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r8)
            r8 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r8)
            r8 = -10525069(0xffffffffff5f6673, float:-2.9694979E38)
            r2.setTextColor(r8)
            android.graphics.Typeface r8 = android.graphics.Typeface.DEFAULT_BOLD
            r2.setTypeface(r8)
            r8 = 17
            r2.setGravity(r8)
            r2.setIncludeFontPadding(r0)
            android.os.Handler r8 = com.example.dyhelper.p002ui.C0182.f2694
            r8 = 205(0xcd, float:2.87E-43)
            r3 = 255(0xff, float:3.57E-43)
            int r8 = android.graphics.Color.argb(r8, r3, r3, r3)
            r4 = 1096810496(0x41600000, float:14.0)
            int r4 = r7.m1571(r4)
            float r4 = (float) r4
            r5 = 1060320051(0x3f333333, float:0.7)
            int r5 = r7.m1571(r5)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r6.setColor(r8)
            r6.setCornerRadius(r4)
            r8 = 26
            int r8 = android.graphics.Color.argb(r8, r3, r3, r3)
            r6.setStroke(r5, r8)
            r2.setBackground(r6)
            r8 = 1090519040(0x41000000, float:8.0)
            int r3 = r7.m1571(r8)
            float r3 = (float) r3
            r2.setElevation(r3)
            r3 = 8
            r2.setVisibility(r3)
            r7.f2595 = r2
            r7.f2596 = r10
            r7.f2600 = r1
            r7.setClipChildren(r0)
            r7.setClipToPadding(r0)
            int r8 = r7.m1571(r8)
            r7.setPadding(r0, r0, r0, r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r10 = -2
            r1 = 48
            r3 = -1
            r8.<init>(r3, r10, r1)
            r7.addView(r9, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = 1125515264(0x43160000, float:150.0)
            int r10 = r7.m1571(r10)
            r1 = 1105199104(0x41e00000, float:28.0)
            int r1 = r7.m1571(r1)
            r8.<init>(r10, r1)
            r10 = 1086324736(0x40c00000, float:6.0)
            int r10 = r7.m1571(r10)
            r8.topMargin = r10
            r9.addView(r2, r8)
            com.example.dyhelper.ui.ω r8 = new com.example.dyhelper.ui.ω
            r8.<init>(r7, r0)
            r7.setOnTouchListener(r8)
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m1569(float r5) {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.f2599
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            float r0 = r4.f2600
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r5
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
            float r1 = r4.f2600
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 560(0x230, double:2.767E-321)
            goto L21
        L1f:
            r1 = 420(0x1a4, double:2.075E-321)
        L21:
            r0.setDuration(r1)
            float r1 = r4.f2600
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L2d
            android.view.animation.PathInterpolator r5 = r4.f2590
            goto L38
        L2d:
            android.view.animation.PathInterpolator r5 = new android.view.animation.PathInterpolator
            r1 = 1053609165(0x3ecccccd, float:0.4)
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r1, r2, r3, r3)
        L38:
            r0.setInterpolator(r5)
            com.example.dyhelper.ui.δ r5 = new com.example.dyhelper.ui.δ
            r1 = 3
            r5.<init>(r4, r1)
            r0.addUpdateListener(r5)
            r0.start()
            r4.f2599 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1570(float r5) {
            r4 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r5 = p000.j81.m2905(r5, r0, r1)
            r4.f2600 = r5
            java.util.LinkedHashMap r5 = r4.f2593
            java.util.Collection r5 = r5.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L19:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r5.next()
            int r2 = r0 + 1
            if (r0 < 0) goto L30
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r1 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r1
            float r3 = r4.f2600
            r1.m1576(r0, r3)
            r0 = r2
            goto L19
        L30:
            p000.AbstractC1021yh.m6917()
            r4 = 0
            throw r4
        L35:
            java.util.LinkedHashMap r5 = r4.f2594
            java.util.Collection r5 = r5.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L44:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r5.next()
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r0 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r0
            float r1 = r4.f2600
            r2 = 1
            r0.m1576(r2, r1)
            goto L44
        L57:
            float r5 = r4.f2600
            android.widget.TextView r0 = r4.f2595
            r0.setAlpha(r5)
            r5 = 1041865114(0x3e19999a, float:0.15)
            float r4 = r4.f2600
            float r4 = r4 * r5
            r5 = 1062836634(0x3f59999a, float:0.85)
            float r4 = r4 + r5
            r0.setScaleY(r4)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final int m1571(float r2) {
            r1 = this;
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            android.content.Context r1 = r1.getContext()
            r1.getClass()
            int r1 = com.example.dyhelper.p002ui.C0182.m1589(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m1572(p000.p70 r5) {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.f2599
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r2 = 1098907648(0x41800000, float:16.0)
            int r4 = r4.m1571(r2)
            float r4 = (float) r4
            float r4 = -r4
            android.view.ViewPropertyAnimator r4 = r0.translationY(r4)
            r0 = 1064849900(0x3f7851ec, float:0.97)
            android.view.ViewPropertyAnimator r4 = r4.scaleX(r0)
            android.view.ViewPropertyAnimator r4 = r4.scaleY(r0)
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r1, r3, r3)
            android.view.ViewPropertyAnimator r4 = r4.setInterpolator(r0)
            r0 = 260(0x104, double:1.285E-321)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r0)
            com.example.dyhelper.ui.κ r0 = new com.example.dyhelper.ui.κ
            r1 = 2
            r0.<init>(r1, r5)
            android.view.ViewPropertyAnimator r4 = r4.withEndAction(r0)
            r4.start()
            return
    }

    /* JADX INFO: renamed from: ε */
    public final android.widget.LinearLayout.LayoutParams m1573(int r3) {
            r2 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            if (r3 != 0) goto Lf
            r3 = 1088421888(0x40e00000, float:7.0)
        La:
            int r2 = r2.m1571(r3)
            goto L12
        Lf:
            r3 = 1086324736(0x40c00000, float:6.0)
            goto La
        L12:
            r0.topMargin = r2
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1574(java.util.List r20, int r21, boolean r22) {
            r19 = this;
            r0 = r19
            r1 = r21
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashMap r3 = r0.f2593
            java.util.Set r4 = r3.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r5 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r5
            android.view.ViewParent r7 = r5.getParent()
            if (r7 == 0) goto L13
            int r7 = r5.getTop()
            float r7 = (float) r7
            float r5 = r5.getTranslationY()
            float r5 = r5 + r7
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r2.put(r6, r5)
            goto L13
        L43:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            r6 = r20
            int r5 = p000.AbstractC1021yh.m6889(r6, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L54:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L66
            java.lang.Object r7 = r5.next()
            e52 r7 = (p000.e52) r7
            java.lang.String r7 = r7.f3412
            r4.add(r7)
            goto L54
        L66:
            java.util.Set r4 = p000.AbstractC0984xh.m6671(r4)
            java.util.Set r5 = r3.keySet()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L80:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L97
            java.lang.Object r8 = r5.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r4.contains(r9)
            if (r9 != 0) goto L80
            r7.add(r8)
            goto L80
        L97:
            java.util.Iterator r4 = r7.iterator()
        L9b:
            boolean r5 = r4.hasNext()
            r7 = 4
            java.util.LinkedHashMap r8 = r0.f2594
            r9 = 1
            r10 = 0
            android.widget.LinearLayout r11 = r0.f2592
            if (r5 == 0) goto L131
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r3.remove(r5)
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r12 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r12
            if (r12 == 0) goto L9b
            java.lang.Object r13 = r2.get(r5)
            java.lang.Float r13 = (java.lang.Float) r13
            if (r13 == 0) goto Lc3
            float r13 = r13.floatValue()
            goto Lc8
        Lc3:
            int r13 = r12.getTop()
            float r13 = (float) r13
        Lc8:
            java.lang.Object r14 = r8.get(r5)
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r14 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r14
            if (r14 == 0) goto Ld3
            r11.removeView(r14)
        Ld3:
            r8.put(r5, r12)
            int r8 = r12.getTop()
            float r8 = (float) r8
            float r13 = r13 - r8
            r12.setTranslationY(r13)
            com.example.dyhelper.ui.β r8 = new com.example.dyhelper.ui.β
            r8.<init>(r0, r5, r12, r9)
            android.animation.ValueAnimator r5 = r12.f2613
            if (r5 == 0) goto Leb
            r5.cancel()
        Leb:
            android.view.ViewPropertyAnimator r5 = r12.animate()
            android.view.ViewPropertyAnimator r5 = r5.alpha(r10)
            float r9 = r12.getTranslationY()
            r11 = 1090519040(0x41000000, float:8.0)
            int r11 = r12.m1578(r11)
            float r11 = (float) r11
            float r9 = r9 - r11
            android.view.ViewPropertyAnimator r5 = r5.translationY(r9)
            r9 = 1062333317(0x3f51eb85, float:0.82)
            android.view.ViewPropertyAnimator r5 = r5.scaleX(r9)
            android.view.ViewPropertyAnimator r5 = r5.scaleY(r9)
            android.view.animation.PathInterpolator r9 = new android.view.animation.PathInterpolator
            r11 = 1050924810(0x3ea3d70a, float:0.32)
            r12 = 1059816735(0x3f2b851f, float:0.67)
            r9.<init>(r11, r10, r12, r10)
            android.view.ViewPropertyAnimator r5 = r5.setInterpolator(r9)
            r9 = 260(0x104, double:1.285E-321)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r9)
            com.example.dyhelper.ui.κ r9 = new com.example.dyhelper.ui.κ
            r9.<init>(r7, r8)
            android.view.ViewPropertyAnimator r5 = r5.withEndAction(r9)
            r5.start()
            goto L9b
        L131:
            java.util.Iterator r4 = r6.iterator()
            r6 = 0
        L136:
            boolean r12 = r4.hasNext()
            android.view.animation.PathInterpolator r13 = r0.f2591
            if (r12 == 0) goto L2be
            java.lang.Object r12 = r4.next()
            int r15 = r6 + 1
            r20 = 0
            if (r6 < 0) goto L2b8
            e52 r12 = (p000.e52) r12
            java.lang.String r7 = r12.f3412
            java.lang.Object r16 = r3.get(r7)
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r16 = (com.example.dyhelper.p002ui.TopDownloadNotificationManager$TopNoticeItemView) r16
            if (r16 != 0) goto L168
            com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView r5 = new com.example.dyhelper.ui.TopDownloadNotificationManager$TopNoticeItemView
            android.content.Context r10 = r0.getContext()
            r10.getClass()
            g52 r14 = r0.f2588
            tv1 r9 = r0.f2589
            r5.<init>(r10, r14, r9)
            r3.put(r7, r5)
            goto L16a
        L168:
            r5 = r16
        L16a:
            if (r6 != 0) goto L16e
            r9 = 1
            goto L170
        L16e:
            r9 = r20
        L170:
            int r10 = r12.f3415
            r14 = -1
            r16 = r3
            r3 = 100
            int r3 = p000.j81.m2906(r10, r14, r3)
            r5.f2610 = r3
            f52 r3 = r12.f3416
            r5.f2611 = r3
            android.widget.TextView r3 = r5.f2619
            java.lang.String r10 = r12.f3413
            r3.setText(r10)
            android.widget.TextView r3 = r5.f2620
            java.lang.String r10 = r12.f3414
            r3.setText(r10)
            android.widget.TextView r3 = r5.f2621
            f52 r10 = r5.f2611
            f52 r12 = p000.f52.f3754
            if (r10 != r12) goto L19a
            java.lang.String r10 = "完成"
            goto L1ae
        L19a:
            f52 r12 = p000.f52.f3755
            if (r10 != r12) goto L1a1
            java.lang.String r10 = "失败"
            goto L1ae
        L1a1:
            int r10 = r5.f2610
            if (r10 < 0) goto L1ac
            java.lang.String r12 = "%"
            java.lang.String r10 = p000.lz1.m3686(r12, r10)
            goto L1ae
        L1ac:
            java.lang.String r10 = "..."
        L1ae:
            r3.setText(r10)
            f52 r10 = r5.f2611
            int r10 = r10.ordinal()
            r12 = 2
            if (r10 == 0) goto L1cb
            r14 = 1
            if (r10 == r14) goto L1c7
            if (r10 != r12) goto L1c3
            r10 = -1750963(0xffffffffffe5484d, float:NaN)
            goto L1ce
        L1c3:
            p000.C1080.m7272()
            return
        L1c7:
            r10 = -15163304(0xffffffffff18a058, float:-2.028752E38)
            goto L1ce
        L1cb:
            r10 = -15103494(0xffffffffff1989fa, float:-2.040883E38)
        L1ce:
            r3.setTextColor(r10)
            com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressDotView r3 = r5.f2618
            int r14 = r5.f2610
            f52 r12 = r5.f2611
            r3.getClass()
            r12.getClass()
            r3.f2578 = r14
            r3.f2579 = r10
            r3.f2580 = r12
            r3.invalidate()
            com.example.dyhelper.ui.TopDownloadNotificationManager$ProgressLineView r3 = r5.f2623
            int r12 = r5.f2610
            f52 r14 = r5.f2611
            r3.getClass()
            r14.getClass()
            r3.f2583 = r12
            r3.f2584 = r10
            r3.f2585 = r14
            r3.invalidate()
            if (r9 == 0) goto L203
            r3 = 1065353216(0x3f800000, float:1.0)
        L1ff:
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            goto L205
        L203:
            r3 = 0
            goto L1ff
        L205:
            float r3 = p000.j81.m2905(r3, r10, r9)
            float r9 = r5.f2612
            float r9 = r9 - r3
            float r9 = java.lang.Math.abs(r9)
            r10 = 1008981770(0x3c23d70a, float:0.01)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L21f
            r5.f2612 = r3
            r3 = 0
            r5.m1577(r3, r3)
            r10 = 4
            goto L24d
        L21f:
            android.animation.ValueAnimator r9 = r5.f2613
            if (r9 == 0) goto L226
            r9.cancel()
        L226:
            float r9 = r5.f2612
            r10 = 2
            float[] r10 = new float[r10]
            r10[r20] = r9
            r18 = 1
            r10[r18] = r3
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r10)
            r9 = 480(0x1e0, double:2.37E-321)
            r3.setDuration(r9)
            android.view.animation.PathInterpolator r9 = r5.f2614
            r3.setInterpolator(r9)
            com.example.dyhelper.ui.δ r9 = new com.example.dyhelper.ui.δ
            r10 = 4
            r9.<init>(r5, r10)
            r3.addUpdateListener(r9)
            r3.start()
            r5.f2613 = r3
        L24d:
            android.view.ViewParent r3 = r5.getParent()
            if (r3 != 0) goto L298
            r8.remove(r7)
            android.widget.LinearLayout$LayoutParams r3 = r0.m1573(r6)
            r11.addView(r5, r6, r3)
            r3 = 0
            r5.setAlpha(r3)
            r6 = 1094713344(0x41400000, float:12.0)
            int r6 = r0.m1571(r6)
            float r6 = (float) r6
            r5.setTranslationY(r6)
            r6 = 1064766013(0x3f770a3d, float:0.965)
            r5.setScaleX(r6)
            r5.setScaleY(r6)
            android.view.ViewPropertyAnimator r5 = r5.animate()
            r9 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r5 = r5.alpha(r9)
            android.view.ViewPropertyAnimator r5 = r5.translationY(r3)
            android.view.ViewPropertyAnimator r3 = r5.scaleX(r9)
            android.view.ViewPropertyAnimator r3 = r3.scaleY(r9)
            android.view.ViewPropertyAnimator r3 = r3.setInterpolator(r13)
            r5 = 360(0x168, double:1.78E-321)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r5)
            r3.start()
            goto L2b0
        L298:
            int r3 = r11.indexOfChild(r5)
            if (r3 == r6) goto L2a9
            r11.removeView(r5)
            android.widget.LinearLayout$LayoutParams r3 = r0.m1573(r6)
            r11.addView(r5, r6, r3)
            goto L2b0
        L2a9:
            android.widget.LinearLayout$LayoutParams r3 = r0.m1573(r6)
            r5.setLayoutParams(r3)
        L2b0:
            r7 = r10
            r6 = r15
            r3 = r16
            r9 = 1
            r10 = 0
            goto L136
        L2b8:
            p000.AbstractC1021yh.m6917()
            r17 = 0
            throw r17
        L2be:
            r20 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "还有 "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = " 个任务"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.widget.TextView r4 = r0.f2595
            r4.setText(r3)
            if (r1 <= 0) goto L2dc
            r14 = 1
            goto L2de
        L2dc:
            r14 = r20
        L2de:
            r1 = 1062836634(0x3f59999a, float:0.85)
            if (r14 == 0) goto L318
            int r3 = r4.getVisibility()
            if (r3 == 0) goto L318
            r3 = r20
            r4.setVisibility(r3)
            r3 = 0
            r4.setAlpha(r3)
            r4.setScaleY(r1)
            android.view.ViewPropertyAnimator r3 = r4.animate()
            float r5 = r0.f2600
            android.view.ViewPropertyAnimator r3 = r3.alpha(r5)
            r5 = 1041865114(0x3e19999a, float:0.15)
            float r6 = r0.f2600
            float r6 = r6 * r5
            float r6 = r6 + r1
            android.view.ViewPropertyAnimator r1 = r3.scaleY(r6)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r13)
            r5 = 320(0x140, double:1.58E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r5)
            r1.start()
            goto L34e
        L318:
            if (r14 != 0) goto L34e
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L34e
            android.view.ViewPropertyAnimator r3 = r4.animate()
            r10 = 0
            android.view.ViewPropertyAnimator r3 = r3.alpha(r10)
            android.view.ViewPropertyAnimator r1 = r3.scaleY(r1)
            android.view.animation.PathInterpolator r3 = new android.view.animation.PathInterpolator
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r9 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r5, r10, r9, r9)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r3)
            r5 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r5)
            com.example.dyhelper.ui.κ r3 = new com.example.dyhelper.ui.κ
            r5 = 3
            r3.<init>(r5, r0)
            android.view.ViewPropertyAnimator r1 = r1.withEndAction(r3)
            r1.start()
        L34e:
            r4.bringToFront()
            if (r22 == 0) goto L35b
            r14 = 1
            r0.f2596 = r14
            r9 = 1065353216(0x3f800000, float:1.0)
            r0.m1569(r9)
        L35b:
            float r1 = r0.f2600
            r0.m1570(r1)
            com.example.dyhelper.ui.ψ r1 = new com.example.dyhelper.ui.ψ
            r1.<init>(r0, r2)
            r0.post(r1)
            return
    }
}
