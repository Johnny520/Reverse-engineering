package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.μ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0169 {

    /* JADX INFO: renamed from: α */
    public static final int[] f2655 = null;

    static {
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-65536, -47872, -29696, -10496, -8586240, -16725935, -16728876, -14575885, -12627531, -6543440, -1499549, -119723, -1, -3355444, -7829368, -16777216} // fill-array
            com.example.dyhelper.p002ui.C0169.f2655 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m1581(android.graphics.Canvas r8, float r9, float r10, android.graphics.Paint r11, int r12, int r13) {
            r11.setColor(r12)
            r1 = 0
            r2 = 0
            r0 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.drawRect(r1, r2, r3, r4, r5)
            r5.setColor(r13)
            r9 = 1073741824(0x40000000, float:2.0)
            float r10 = r4 / r9
            r0 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto L1b
            r1 = r0
            goto L1c
        L1b:
            r1 = r10
        L1c:
            float r9 = r3 / r1
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r2 = (int) r9
            r3 = 0
            r4 = r3
        L26:
            r6 = 2
            if (r4 >= r6) goto L4a
            r7 = r3
        L2a:
            if (r7 >= r2) goto L47
            int r9 = r4 + r7
            int r9 = r9 % r6
            if (r9 != 0) goto L44
            float r9 = (float) r7
            r10 = r9
            float r9 = r10 * r1
            float r11 = (float) r4
            r12 = r10
            float r10 = r11 * r1
            float r12 = r12 + r0
            float r12 = r12 * r1
            float r11 = r11 + r0
            float r11 = r11 * r1
            r13 = r12
            r12 = r11
            r11 = r13
            r13 = r5
            r8.drawRect(r9, r10, r11, r12, r13)
        L44:
            int r7 = r7 + 1
            goto L2a
        L47:
            int r4 = r4 + 1
            goto L26
        L4a:
            return
    }

    /* JADX INFO: renamed from: β */
    public static final boolean m1582(android.view.View r4, android.view.MotionEvent r5, p000.a80 r6) {
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3f
            if (r0 == r2) goto L2d
            r3 = 2
            if (r0 == r3) goto L20
            r5 = 3
            if (r0 == r5) goto L11
            goto L5e
        L11:
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L1a
            r5.requestDisallowInterceptTouchEvent(r1)
        L1a:
            ii r4 = (p000.InterfaceC0396ii) r4
            r4.mo1530(r1)
            return r2
        L20:
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L29
            r4.requestDisallowInterceptTouchEvent(r2)
        L29:
            r6.invoke(r5)
            return r2
        L2d:
            r6.invoke(r5)
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L39
            r5.requestDisallowInterceptTouchEvent(r1)
        L39:
            ii r4 = (p000.InterfaceC0396ii) r4
            r4.mo1530(r1)
            return r2
        L3f:
            int r0 = r4.getWidth()
            if (r0 <= 0) goto L5e
            int r0 = r4.getHeight()
            if (r0 > 0) goto L4c
            goto L5e
        L4c:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L55
            r0.requestDisallowInterceptTouchEvent(r2)
        L55:
            ii r4 = (p000.InterfaceC0396ii) r4
            r4.mo1530(r2)
            r6.invoke(r5)
            return r2
        L5e:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static android.widget.TextView m1583(android.content.Context r1, java.lang.String r2, p000.C1000xx r3, boolean r4, p000.p70 r5) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            r0.setText(r2)
            r2 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r2)
            r2 = 17
            r0.setGravity(r2)
            r2 = 0
            r0.setIncludeFontPadding(r2)
            r2 = 1
            r0.setClickable(r2)
            r0.setFocusable(r2)
            android.graphics.Typeface r2 = r0.getTypeface()
            r0.setTypeface(r2, r4)
            if (r4 == 0) goto L29
            java.lang.String r2 = "#FFFFFF"
            goto L2b
        L29:
            java.lang.String r2 = r3.f12355
        L2b:
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r2)
            java.lang.String r2 = r3.f12348
            if (r4 == 0) goto L39
            java.lang.String r3 = r3.f12358
            goto L3b
        L39:
            java.lang.String r3 = r3.f12371
        L3b:
            r4 = 10
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r4, r1, r2, r3)
            r0.setBackground(r1)
            b9 r1 = new b9
            r2 = 3
            r1.<init>(r2, r5)
            r0.setOnClickListener(r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static void m1584(android.content.Context r16, java.lang.String r17, int r18, boolean r19, p000.a80 r20) {
            r0 = r16
            r1 = r19
            r0.getClass()
            xx r2 = p000.jx0.m3049(r0)
            if (r1 == 0) goto L10
            r3 = r18
            goto L14
        L10:
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r18 | r3
        L14:
            com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView r4 = new com.example.dyhelper.ui.ColorPickerDialog$ColorPickerView
            r4.<init>(r0, r3, r1, r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r5 = 1
            r1.setOrientation(r5)
            java.lang.String r6 = r2.f12351
            r7 = 14
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r7, r0, r6)
            r1.setBackground(r6)
            um1 r6 = new um1
            r6.<init>()
            ei r8 = new ei
            r9 = 0
            r8.<init>(r6, r9)
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            r9.<init>(r0)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = 52
            int r12 = p000.jx0.m3056(r0, r11)
            r13 = -1
            r10.<init>(r13, r12)
            r9.setLayoutParams(r10)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r0)
            r12 = r17
            r10.setText(r12)
            r12 = 1098907648(0x41800000, float:16.0)
            r10.setTextSize(r12)
            r12 = 17
            r10.setGravity(r12)
            r14 = 0
            r10.setIncludeFontPadding(r14)
            r10.setMaxLines(r5)
            android.text.TextUtils$TruncateAt r15 = android.text.TextUtils.TruncateAt.END
            r10.setEllipsize(r15)
            java.lang.String r15 = r2.f12355
            int r15 = android.graphics.Color.parseColor(r15)
            r10.setTextColor(r15)
            android.graphics.Typeface r15 = r10.getTypeface()
            r10.setTypeface(r15, r5)
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r15.<init>(r13, r13)
            int r7 = p000.jx0.m3056(r0, r11)
            r15.leftMargin = r7
            int r7 = p000.jx0.m3056(r0, r11)
            r15.rightMargin = r7
            r15.gravity = r12
            r9.addView(r10, r15)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            java.lang.String r10 = "×"
            r7.setText(r10)
            r10 = 1103626240(0x41c80000, float:25.0)
            r7.setTextSize(r10)
            r7.setGravity(r12)
            r7.setIncludeFontPadding(r14)
            java.lang.String r10 = "关闭颜色选择器"
            r7.setContentDescription(r10)
            java.lang.String r10 = "关闭"
            r7.setTooltipText(r10)
            r7.setClickable(r5)
            r7.setFocusable(r5)
            java.lang.String r10 = r2.f12356
            int r10 = android.graphics.Color.parseColor(r10)
            r7.setTextColor(r10)
            java.lang.String r10 = r2.f12348
            java.lang.String r11 = "#00000000"
            r12 = 22
            android.graphics.drawable.RippleDrawable r10 = p000.jx0.m3059(r12, r0, r10, r11)
            r7.setBackground(r10)
            hi r10 = new hi
            r11 = 0
            r10.<init>(r11, r8)
            r7.setOnClickListener(r10)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r10 = 44
            int r11 = p000.jx0.m3056(r0, r10)
            int r10 = p000.jx0.m3056(r0, r10)
            r8.<init>(r11, r10)
            r10 = 8388627(0x800013, float:1.175497E-38)
            r8.gravity = r10
            r10 = 6
            int r10 = p000.jx0.m3056(r0, r10)
            r8.leftMargin = r10
            r9.addView(r7, r8)
            r1.addView(r9)
            android.view.View r7 = new android.view.View
            r7.<init>(r0)
            java.lang.String r8 = r2.f12353
            int r8 = android.graphics.Color.parseColor(r8)
            r7.setBackgroundColor(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            int r9 = p000.jx0.m3056(r0, r5)
            r8.<init>(r13, r9)
            r7.setLayoutParams(r8)
            r1.addView(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.heightPixels
            float r7 = (float) r7
            r8 = 1060320051(0x3f333333, float:0.7)
            float r7 = r7 * r8
            int r7 = p000.jx0.m3061(r7)
            com.example.dyhelper.ui.ColorPickerDialog$MaxHeightScrollView r8 = new com.example.dyhelper.ui.ColorPickerDialog$MaxHeightScrollView
            r8.<init>(r0, r7)
            r8.setFillViewport(r14)
            r8.setOverScrollMode(r5)
            r8.setVerticalScrollBarEnabled(r14)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r9 = -2
            r7.<init>(r13, r9)
            r8.addView(r4, r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r13, r9)
            r1.addView(r8, r7)
            com.example.dyhelper.ui.α r7 = new com.example.dyhelper.ui.α
            r7.<init>(r4, r3)
            java.lang.String r3 = "重置"
            android.widget.TextView r3 = m1583(r0, r3, r2, r14, r7)
            com.example.dyhelper.ui.β r7 = new com.example.dyhelper.ui.β
            r8 = 0
            r9 = r20
            r7.<init>(r4, r9, r6, r8)
            java.lang.String r8 = "确定"
            android.widget.TextView r2 = m1583(r0, r8, r2, r5, r7)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r14)
            r8 = 14
            int r9 = p000.jx0.m3056(r0, r8)
            r10 = 10
            int r10 = p000.jx0.m3056(r0, r10)
            int r11 = p000.jx0.m3056(r0, r8)
            int r8 = p000.jx0.m3056(r0, r8)
            r7.setPadding(r9, r10, r11, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 42
            int r10 = p000.jx0.m3056(r0, r9)
            r11 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r14, r10, r11)
            r10 = 5
            int r12 = p000.jx0.m3056(r0, r10)
            r8.rightMargin = r12
            r7.addView(r3, r8)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r8 = p000.jx0.m3056(r0, r9)
            r3.<init>(r14, r8, r11)
            int r8 = p000.jx0.m3056(r0, r10)
            r3.leftMargin = r8
            r7.addView(r2, r3)
            r1.addView(r7)
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r0)
            android.app.AlertDialog$Builder r1 = r3.setView(r1)
            android.app.AlertDialog r1 = r1.create()
            r1.getClass()
            r6.f10912 = r1
            r1.setCanceledOnTouchOutside(r5)
            fi r1 = new fi
            r3 = 0
            r1.<init>(r2, r3)
            r4.f2469 = r1
            boolean r2 = r4.f2468
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.invoke(r2)
            java.lang.Object r1 = r6.f10912
            r2 = 0
            java.lang.String r3 = "dialog"
            if (r1 == 0) goto L1f0
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            gi r4 = new gi
            r5 = 0
            r4.<init>(r6, r0, r5)
            r1.setOnShowListener(r4)
            java.lang.Object r0 = r6.f10912
            if (r0 == 0) goto L1ec
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            r0.show()
            return
        L1ec:
            p000.ln0.m3650(r3)
            throw r2
        L1f0:
            p000.ln0.m3650(r3)
            throw r2
    }
}
