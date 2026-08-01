package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.ο */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0172 {
    /* JADX INFO: renamed from: α */
    public static android.widget.CheckBox m1585(android.app.Activity r3, java.lang.String r4, boolean r5) {
            android.widget.CheckBox r0 = new android.widget.CheckBox
            r0.<init>(r3)
            r0.setText(r4)
            r3 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r3)
            r3 = -1
            r0.setTextColor(r3)
            r3 = 17
            r0.setGravity(r3)
            r0.setChecked(r5)
            r3 = 1
            r0.setFocusable(r3)
            r0.setContentDescription(r4)
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r4 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r4 = new int[]{r4}
            r5 = 0
            int[] r5 = new int[r5]
            int[][] r4 = new int[][]{r4, r5}
            r5 = 154(0x9a, float:2.16E-43)
            r1 = 255(0xff, float:3.57E-43)
            r2 = 76
            int r5 = android.graphics.Color.rgb(r2, r5, r1)
            r1 = 210(0xd2, float:2.94E-43)
            r2 = 214(0xd6, float:3.0E-43)
            int r1 = android.graphics.Color.rgb(r1, r1, r2)
            int[] r5 = new int[]{r5, r1}
            r3.<init>(r4, r5)
            r0.setButtonTintList(r3)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static int m1586(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m1587(android.app.Activity r24) {
            r1 = r24
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L34b
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L10
            goto L34b
        L10:
            android.view.Window r0 = r1.getWindow()
            r7 = 0
            if (r0 == 0) goto L1c
            android.view.View r0 = r0.getDecorView()
            goto L1d
        L1c:
            r0 = r7
        L1d:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L25
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r9 = r0
            goto L26
        L25:
            r9 = r7
        L26:
            if (r9 == 0) goto L346
            java.lang.String r0 = "dyhelper_gesture_position_preview"
            android.view.View r2 = r9.findViewWithTag(r0)
            if (r2 != 0) goto L31
            goto L42
        L31:
            android.view.ViewParent r3 = r2.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L3c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L3d
        L3c:
            r3 = r7
        L3d:
            if (r3 == 0) goto L42
            r3.removeView(r2)
        L42:
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r1)
            r10.setTag(r0)
            r8 = 20
            r11 = 0
            int r0 = android.graphics.Color.argb(r8, r11, r11, r11)
            r10.setBackgroundColor(r0)
            r12 = 1
            r10.setClickable(r12)
            r10.setFocusable(r12)
            r10.setFocusableInTouchMode(r12)
            r10.setImportantForAccessibility(r12)
            java.lang.String r0 = "手势拦截位置预览"
            r10.setContentDescription(r0)
            r0 = 1107296256(0x42000000, float:32.0)
            int r0 = m1586(r1, r0)
            float r0 = (float) r0
            r10.setElevation(r0)
            um1 r2 = new um1
            r2.<init>()
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            w90 r0 = p000.C0381i2.m2596()
            r2.f10912 = r0
            um1 r3 = new um1
            r3.<init>()
            r3.f10912 = r0
            um1 r4 = new um1
            r4.<init>()
            x90 r0 = p000.C0381i2.m2597()
            r4.f10912 = r0
            um1 r5 = new um1
            r5.<init>()
            r5.f10912 = r0
            com.example.dyhelper.ui.GestureAreaView r13 = new com.example.dyhelper.ui.GestureAreaView
            r0 = 6
            r13.<init>(r1, r7, r0, r11)
            r13.setEnabled(r11)
            r14 = 2
            r13.setImportantForAccessibility(r14)
            java.lang.Object r0 = r3.f10912
            w90 r0 = (p000.w90) r0
            r13.setGridBounds(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r15 = -1
            r0.<init>(r15, r15)
            r10.addView(r13, r0)
            r6 = r4
            r4 = r2
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            java.lang.String r0 = "保存"
            r2.setText(r0)
            r0 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r0)
            r2.setTextColor(r15)
            r11 = 17
            r2.setGravity(r11)
            r2.setTypeface(r7, r12)
            r2.setFocusable(r12)
            java.lang.String r0 = "保存手势区域位置"
            r2.setContentDescription(r0)
            r0 = 1090519040(0x41000000, float:8.0)
            int r8 = m1586(r1, r0)
            float r8 = (float) r8
            r2.setElevation(r8)
            r8 = r0
            la0 r0 = new la0
            r8 = 1097859072(0x41700000, float:15.0)
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r23 = r2
            r2 = r0
            r0 = r23
            com.example.dyhelper.ui.GesturePositionPreviewOverlay$GestureGridDividerEditorView r8 = new com.example.dyhelper.ui.GesturePositionPreviewOverlay$GestureGridDividerEditorView
            java.lang.Object r7 = r3.f10912
            w90 r7 = (p000.w90) r7
            java.lang.Object r12 = r5.f10912
            x90 r12 = (p000.x90) r12
            m3 r11 = new m3
            r11.<init>(r3, r13, r2, r14)
            r8.<init>(r1, r7, r12, r11)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r15, r15)
            r10.addView(r8, r7)
            android.widget.TextView r11 = new android.widget.TextView
            r11.<init>(r1)
            java.lang.String r7 = "拖动内部分割线和四周边界调整实际手势区域\n↔ 左右拖动，↕ 上下拖动；边距外不会触发手势\n底部可切换左右、上下边距同步，保存后立即生效"
            r11.setText(r7)
            r7 = 1095237632(0x41480000, float:12.5)
            r11.setTextSize(r7)
            r11.setTextColor(r15)
            r7 = 17
            r11.setGravity(r7)
            r7 = 1
            r12 = 0
            r11.setTypeface(r12, r7)
            r7 = 1096810496(0x41600000, float:14.0)
            int r12 = m1586(r1, r7)
            r14 = 1092616192(0x41200000, float:10.0)
            int r15 = m1586(r1, r14)
            r19 = r3
            int r3 = m1586(r1, r7)
            int r7 = m1586(r1, r14)
            r11.setPadding(r12, r15, r3, r7)
            r3 = 215(0xd7, float:3.01E-43)
            r7 = 24
            r12 = 20
            int r3 = android.graphics.Color.argb(r3, r12, r12, r7)
            r12 = 1096810496(0x41600000, float:14.0)
            int r12 = m1586(r1, r12)
            android.graphics.drawable.GradientDrawable r3 = p000.lz1.m3681(r3)
            float r12 = (float) r12
            r3.setCornerRadius(r12)
            r11.setBackground(r3)
            r3 = 1082130432(0x40800000, float:4.0)
            int r12 = m1586(r1, r3)
            float r12 = (float) r12
            r11.setElevation(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r15 = 49
            r7 = -2
            r3 = -1
            r12.<init>(r3, r7, r15)
            r3 = 1098907648(0x41800000, float:16.0)
            int r15 = m1586(r1, r3)
            r12.leftMargin = r15
            int r15 = m1586(r1, r3)
            r12.topMargin = r15
            int r15 = m1586(r1, r3)
            r12.rightMargin = r15
            r10.addView(r11, r12)
            java.lang.Object r15 = r5.f10912
            x90 r15 = (p000.x90) r15
            com.example.dyhelper.ui.ν r7 = new com.example.dyhelper.ui.ν
            r7.<init>(r5, r8, r2)
            java.lang.String r3 = "左右边距同步"
            boolean r14 = r15.f12079
            android.widget.CheckBox r3 = m1585(r1, r3, r14)
            java.lang.String r14 = "上下边距同步"
            boolean r15 = r15.f12080
            android.widget.CheckBox r14 = m1585(r1, r14, r15)
            ka0 r15 = new ka0
            r22 = r2
            r2 = 1
            r15.<init>(r7, r14, r2)
            r3.setOnCheckedChangeListener(r15)
            ka0 r2 = new ka0
            r15 = 0
            r2.<init>(r7, r3, r15)
            r14.setOnCheckedChangeListener(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r2.setOrientation(r15)
            r7 = 17
            r2.setGravity(r7)
            r7 = 1092616192(0x41200000, float:10.0)
            int r15 = m1586(r1, r7)
            r21 = r4
            r20 = r5
            r4 = 1082130432(0x40800000, float:4.0)
            int r5 = m1586(r1, r4)
            int r7 = m1586(r1, r7)
            int r4 = m1586(r1, r4)
            r2.setPadding(r15, r5, r7, r4)
            r4 = 220(0xdc, float:3.08E-43)
            r5 = 20
            r7 = 24
            int r4 = android.graphics.Color.argb(r4, r5, r5, r7)
            r5 = 1098907648(0x41800000, float:16.0)
            int r7 = m1586(r1, r5)
            android.graphics.drawable.GradientDrawable r4 = p000.lz1.m3681(r4)
            float r5 = (float) r7
            r4.setCornerRadius(r5)
            r2.setBackground(r4)
            r4 = 1088421888(0x40e00000, float:7.0)
            int r4 = m1586(r1, r4)
            float r4 = (float) r4
            r2.setElevation(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 1109917696(0x42280000, float:42.0)
            int r7 = m1586(r1, r5)
            r15 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r4.<init>(r5, r7, r15)
            r2.addView(r3, r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 1109917696(0x42280000, float:42.0)
            int r4 = m1586(r1, r4)
            r3.<init>(r5, r4, r15)
            r2.addView(r14, r3)
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            r3 = 81
            r4 = -1
            r5 = -2
            r14.<init>(r4, r5, r3)
            r5 = 1098907648(0x41800000, float:16.0)
            int r4 = m1586(r1, r5)
            r14.leftMargin = r4
            int r4 = m1586(r1, r5)
            r14.rightMargin = r4
            r4 = 1118830592(0x42b00000, float:88.0)
            int r4 = m1586(r1, r4)
            r14.bottomMargin = r4
            r10.addView(r2, r14)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r1)
            java.lang.String r4 = "退出预览"
            r15.setText(r4)
            r4 = 1097859072(0x41700000, float:15.0)
            r15.setTextSize(r4)
            r4 = -1
            r15.setTextColor(r4)
            r7 = 17
            r15.setGravity(r7)
            r4 = 0
            r7 = 1
            r15.setTypeface(r4, r7)
            r15.setClickable(r7)
            r15.setFocusable(r7)
            java.lang.String r4 = "退出手势位置预览"
            r15.setContentDescription(r4)
            r4 = 61
            r5 = 91
            r7 = 232(0xe8, float:3.25E-43)
            int r4 = android.graphics.Color.rgb(r7, r4, r5)
            r5 = 1103101952(0x41c00000, float:24.0)
            int r5 = m1586(r1, r5)
            android.graphics.drawable.GradientDrawable r4 = p000.lz1.m3681(r4)
            float r5 = (float) r5
            r4.setCornerRadius(r5)
            r15.setBackground(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = m1586(r1, r4)
            float r4 = (float) r4
            r15.setElevation(r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r1)
            r5 = 0
            r4.setOrientation(r5)
            r7 = 17
            r4.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = 1124335616(0x43040000, float:132.0)
            int r3 = m1586(r1, r7)
            r7 = 1111490560(0x42400000, float:48.0)
            r18 = r2
            int r2 = m1586(r1, r7)
            r5.<init>(r3, r2)
            r2 = 1086324736(0x40c00000, float:6.0)
            int r3 = m1586(r1, r2)
            r5.rightMargin = r3
            r4.addView(r0, r5)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 1124335616(0x43040000, float:132.0)
            int r5 = m1586(r1, r5)
            int r7 = m1586(r1, r7)
            r3.<init>(r5, r7)
            int r2 = m1586(r1, r2)
            r3.leftMargin = r2
            r4.addView(r15, r3)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r5 = -2
            r7 = 81
            r2.<init>(r3, r5, r7)
            r5 = 1098907648(0x41800000, float:16.0)
            int r3 = m1586(r1, r5)
            r2.leftMargin = r3
            int r3 = m1586(r1, r5)
            r2.rightMargin = r3
            r3 = 1105199104(0x41e00000, float:28.0)
            int r3 = m1586(r1, r3)
            r2.bottomMargin = r3
            r10.addView(r4, r2)
            r3 = r0
            com.example.dyhelper.ui.ξ r0 = new com.example.dyhelper.ui.ξ
            r17 = r2
            r16 = r4
            r4 = r6
            r6 = r8
            r5 = r13
            r2 = r21
            r7 = r22
            r8 = r1
            r13 = r3
            r1 = r19
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = r0
            r0 = r7
            r1 = r8
            r13.setOnClickListener(r2)
            r0.invoke()
            ma0 r0 = new ma0
            r5 = 0
            r0.<init>(r1, r5)
            r15.setOnClickListener(r0)
            na0 r0 = new na0
            r0.<init>(r1)
            r10.setOnKeyListener(r0)
            oa0 r0 = new oa0
            r2 = r1
            r3 = r11
            r1 = r12
            r4 = r14
            r7 = r16
            r6 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setOnApplyWindowInsetsListener(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r0.<init>(r3, r3)
            r9.addView(r10, r0)
            r10.bringToFront()
            r10.requestFocus()
            r10.requestApplyInsets()
            return
        L346:
            java.lang.String r0 = "宿主 DecorView 不支持添加预览层"
            p000.C1080.m7279(r0)
        L34b:
            return
    }
}
