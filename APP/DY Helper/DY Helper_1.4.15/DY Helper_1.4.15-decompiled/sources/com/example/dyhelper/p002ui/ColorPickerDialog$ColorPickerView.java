package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class ColorPickerDialog$ColorPickerView extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: Θ */
    public static final p000.ym1 f2454 = null;

    /* JADX INFO: renamed from: Ι */
    public static final p000.ym1 f2455 = null;

    /* JADX INFO: renamed from: Α */
    public final android.widget.SeekBar f2456;

    /* JADX INFO: renamed from: Β */
    public final android.widget.TextView f2457;

    /* JADX INFO: renamed from: Γ */
    public final android.widget.TextView f2458;

    /* JADX INFO: renamed from: Δ */
    public final android.widget.TextView f2459;

    /* JADX INFO: renamed from: Ε */
    public final android.widget.LinearLayout f2460;

    /* JADX INFO: renamed from: Ζ */
    public final android.widget.TextView f2461;

    /* JADX INFO: renamed from: Η */
    public final android.widget.LinearLayout f2462;

    /* JADX INFO: renamed from: ε */
    public final boolean f2463;

    /* JADX INFO: renamed from: ζ */
    public final p000.C1000xx f2464;

    /* JADX INFO: renamed from: η */
    public int f2465;

    /* JADX INFO: renamed from: θ */
    public final float[] f2466;

    /* JADX INFO: renamed from: ι */
    public int f2467;

    /* JADX INFO: renamed from: κ */
    public boolean f2468;

    /* JADX INFO: renamed from: λ */
    public p000.C0286fi f2469;

    /* JADX INFO: renamed from: μ */
    public boolean f2470;

    /* JADX INFO: renamed from: ν */
    public boolean f2471;

    /* JADX INFO: renamed from: ξ */
    public final com.example.dyhelper.p002ui.ColorPickerDialog$SvPanel f2472;

    /* JADX INFO: renamed from: ο */
    public final com.example.dyhelper.p002ui.ColorPickerDialog$HueBar f2473;

    /* JADX INFO: renamed from: π */
    public final com.example.dyhelper.p002ui.ColorPickerDialog$AlphaBar f2474;

    /* JADX INFO: renamed from: ρ */
    public final com.example.dyhelper.p002ui.ColorPickerDialog$ColorPreviewView f2475;

    /* JADX INFO: renamed from: σ */
    public final java.util.ArrayList f2476;

    /* JADX INFO: renamed from: τ */
    public final android.widget.TextView f2477;

    /* JADX INFO: renamed from: υ */
    public final android.widget.TextView f2478;

    /* JADX INFO: renamed from: φ */
    public final android.widget.EditText f2479;

    /* JADX INFO: renamed from: χ */
    public final android.widget.TextView f2480;

    /* JADX INFO: renamed from: ψ */
    public final android.widget.SeekBar f2481;

    /* JADX INFO: renamed from: ω */
    public final android.widget.SeekBar f2482;

    static {
            ym1 r0 = new ym1
            java.lang.String r1 = "^#[0-9A-Fa-f]{6}$"
            r0.<init>(r1)
            com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView.f2454 = r0
            ym1 r0 = new ym1
            java.lang.String r1 = "^#[0-9A-Fa-f]{8}$"
            r0.<init>(r1)
            com.example.dyhelper.p002ui.ColorPickerDialog$ColorPickerView.f2455 = r0
            return
    }

    public ColorPickerDialog$ColorPickerView(android.content.Context r19, int r20, boolean r21, p000.C1000xx r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r1.getClass()
            r18.<init>(r19)
            r0.f2463 = r3
            r0.f2464 = r4
            r0.f2465 = r2
            r5 = 3
            float[] r6 = new float[r5]
            r0.f2466 = r6
            if (r3 == 0) goto L22
            int r7 = android.graphics.Color.alpha(r2)
            goto L24
        L22:
            r7 = 255(0xff, float:3.57E-43)
        L24:
            r0.f2467 = r7
            r7 = 1
            r0.f2468 = r7
            com.example.dyhelper.ui.ColorPickerDialog$SvPanel r8 = new com.example.dyhelper.ui.ColorPickerDialog$SvPanel
            r8.<init>(r1, r4)
            r0.f2472 = r8
            com.example.dyhelper.ui.ColorPickerDialog$HueBar r9 = new com.example.dyhelper.ui.ColorPickerDialog$HueBar
            r9.<init>(r1, r4)
            r0.f2473 = r9
            com.example.dyhelper.ui.ColorPickerDialog$AlphaBar r10 = new com.example.dyhelper.ui.ColorPickerDialog$AlphaBar
            r10.<init>(r1, r4)
            r0.f2474 = r10
            com.example.dyhelper.ui.ColorPickerDialog$ColorPreviewView r11 = new com.example.dyhelper.ui.ColorPickerDialog$ColorPreviewView
            r11.<init>(r1, r2, r4)
            com.example.dyhelper.ui.ColorPickerDialog$ColorPreviewView r12 = new com.example.dyhelper.ui.ColorPickerDialog$ColorPreviewView
            r12.<init>(r1, r2, r4)
            r0.f2475 = r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0.f2476 = r13
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 | r13
            android.graphics.Color.colorToHSV(r2, r6)
            r0.setOrientation(r7)
            r2 = 14
            int r6 = p000.jx0.m3056(r1, r2)
            r13 = 12
            int r14 = p000.jx0.m3056(r1, r13)
            int r2 = p000.jx0.m3056(r1, r2)
            r15 = 4
            int r15 = p000.jx0.m3056(r1, r15)
            r0.setPadding(r6, r14, r2, r15)
            android.widget.LinearLayout r2 = r18.m1537(r19)
            java.lang.String r6 = "颜色"
            android.widget.TextView r6 = r0.m1539(r1, r6)
            r2.addView(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r14 = 196(0xc4, float:2.75E-43)
            int r14 = p000.jx0.m3056(r1, r14)
            r15 = -1
            r6.<init>(r15, r14)
            r14 = 10
            int r5 = p000.jx0.m3056(r1, r14)
            r6.topMargin = r5
            int r5 = p000.jx0.m3056(r1, r13)
            r6.bottomMargin = r5
            r8.setLayoutParams(r6)
            r2.addView(r8)
            android.widget.TextView r5 = r18.m1540(r19)
            r0.f2477 = r5
            java.lang.String r6 = "色相"
            android.widget.LinearLayout r5 = r0.m1536(r1, r6, r5)
            r2.addView(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 36
            int r8 = p000.jx0.m3056(r1, r6)
            r5.<init>(r15, r8)
            r8 = 5
            int r7 = p000.jx0.m3056(r1, r8)
            r5.topMargin = r7
            r9.setLayoutParams(r5)
            r2.addView(r9)
            r5 = -2
            if (r3 == 0) goto Lf8
            android.widget.TextView r7 = r18.m1540(r19)
            r0.f2478 = r7
            java.lang.String r9 = "透明度"
            android.widget.LinearLayout r7 = r0.m1536(r1, r9, r7)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r15, r5)
            int r13 = p000.jx0.m3056(r1, r14)
            r9.topMargin = r13
            r2.addView(r7, r9)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r6 = p000.jx0.m3056(r1, r6)
            r7.<init>(r15, r6)
            int r6 = p000.jx0.m3056(r1, r8)
            r7.topMargin = r6
            r10.setLayoutParams(r7)
            r2.addView(r10)
        Lf8:
            r0.addView(r2)
            android.widget.LinearLayout r2 = r18.m1537(r19)
            java.lang.String r6 = "颜色预览"
            android.widget.TextView r6 = r0.m1539(r1, r6)
            r2.addView(r6)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r1)
            r7 = 0
            r6.setOrientation(r7)
            java.lang.String r9 = "原色"
            android.widget.LinearLayout r9 = r0.m1535(r1, r9, r11)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r7, r5, r11)
            int r13 = p000.jx0.m3056(r1, r8)
            r10.rightMargin = r13
            r6.addView(r9, r10)
            java.lang.String r9 = "当前"
            android.widget.LinearLayout r9 = r0.m1535(r1, r9, r12)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r7, r5, r11)
            int r12 = p000.jx0.m3056(r1, r8)
            r10.leftMargin = r12
            r6.addView(r9, r10)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r15, r5)
            r10 = 8
            int r12 = p000.jx0.m3056(r1, r10)
            r9.topMargin = r12
            r2.addView(r6, r9)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            java.lang.String r9 = "颜色代码"
            r6.setText(r9)
            r9 = 1093664768(0x41300000, float:11.0)
            r6.setTextSize(r9)
            r6.setIncludeFontPadding(r7)
            java.lang.String r9 = r4.f12356
            int r9 = android.graphics.Color.parseColor(r9)
            r6.setTextColor(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r5, r5)
            r12 = 12
            int r13 = p000.jx0.m3056(r1, r12)
            r9.topMargin = r13
            r12 = 6
            int r13 = p000.jx0.m3056(r1, r12)
            r9.bottomMargin = r13
            r2.addView(r6, r9)
            android.widget.EditText r6 = new android.widget.EditText
            r6.<init>(r1)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r13 = 44
            int r11 = p000.jx0.m3056(r1, r13)
            r9.<init>(r15, r11)
            r6.setLayoutParams(r9)
            r9 = 12
            int r11 = p000.jx0.m3056(r1, r9)
            int r9 = p000.jx0.m3056(r1, r9)
            r6.setPadding(r11, r7, r9, r7)
            r9 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r9)
            r9 = 16
            r6.setGravity(r9)
            r6.setIncludeFontPadding(r7)
            r11 = 1
            r6.setSingleLine(r11)
            android.graphics.Typeface r11 = android.graphics.Typeface.MONOSPACE
            r6.setTypeface(r11)
            r11 = 4241(0x1091, float:5.943E-42)
            r6.setInputType(r11)
            r6.setImeOptions(r12)
            java.lang.String r11 = "#0123456789ABCDEFabcdef"
            android.text.method.DigitsKeyListener r11 = android.text.method.DigitsKeyListener.getInstance(r11)
            r6.setKeyListener(r11)
            android.text.InputFilter$LengthFilter r11 = new android.text.InputFilter$LengthFilter
            r12 = 7
            if (r3 == 0) goto L1ce
            r17 = 9
            r14 = r17
            goto L1cf
        L1ce:
            r14 = r12
        L1cf:
            r11.<init>(r14)
            android.text.InputFilter$LengthFilter[] r11 = new android.text.InputFilter.LengthFilter[]{r11}
            android.text.InputFilter[] r11 = (android.text.InputFilter[]) r11
            r6.setFilters(r11)
            if (r3 == 0) goto L1e0
            java.lang.String r11 = "#AARRGGBB"
            goto L1e2
        L1e0:
            java.lang.String r11 = "#RRGGBB"
        L1e2:
            r6.setHint(r11)
            r11 = 1
            r6.setSelectAllOnFocus(r11)
            java.lang.String r11 = r4.f12355
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setTextColor(r11)
            java.lang.String r11 = r4.f12357
            int r11 = android.graphics.Color.parseColor(r11)
            r6.setHintTextColor(r11)
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r7)
            r6.setBackgroundTintList(r11)
            r0.f2479 = r6
            r2.addView(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            if (r3 == 0) goto L211
            java.lang.String r3 = "请输入完整的 #AARRGGBB"
            goto L213
        L211:
            java.lang.String r3 = "请输入完整的 #RRGGBB"
        L213:
            r6.setText(r3)
            r3 = 1092616192(0x41200000, float:10.0)
            r6.setTextSize(r3)
            r6.setIncludeFontPadding(r7)
            r6.setVisibility(r10)
            java.lang.String r3 = r4.f12366
            int r3 = android.graphics.Color.parseColor(r3)
            r6.setTextColor(r3)
            r0.f2480 = r6
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r5, r5)
            int r4 = p000.jx0.m3056(r1, r8)
            r3.topMargin = r4
            r2.addView(r6, r3)
            r0.addView(r2)
            android.widget.LinearLayout r2 = r18.m1537(r19)
            java.lang.String r3 = "预设颜色"
            android.widget.TextView r3 = r0.m1539(r1, r3)
            r2.addView(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r3.setOrientation(r7)
            r4 = 2
            int r6 = p000.jx0.m3056(r1, r4)
            int r8 = p000.jx0.m3056(r1, r4)
            r3.setPadding(r7, r6, r7, r8)
            r6 = r7
        L25f:
            if (r6 >= r9) goto L2f6
            int[] r8 = com.example.dyhelper.p002ui.C0169.f2655
            r8 = r8[r6]
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r1)
            r14 = 42
            int r14 = p000.jx0.m3056(r1, r14)
            android.view.ViewGroup$MarginLayoutParams r13 = new android.view.ViewGroup$MarginLayoutParams
            r13.<init>(r14, r14)
            int r14 = p000.jx0.m3056(r1, r10)
            r13.rightMargin = r14
            r11.setLayoutParams(r13)
            r13 = 1
            r11.setClickable(r13)
            r11.setFocusable(r13)
            android.view.View r14 = new android.view.View
            r14.<init>(r1)
            java.lang.String r16 = m1532(r8, r13)
            xx r9 = r0.f2464
            java.lang.String r9 = r9.f12353
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            int r5 = android.graphics.Color.parseColor(r16)
            r10.setColor(r5)
            int r5 = p000.jx0.m3056(r1, r12)
            float r5 = (float) r5
            r10.setCornerRadius(r5)
            int r5 = p000.jx0.m3056(r1, r13)
            int r9 = android.graphics.Color.parseColor(r9)
            r10.setStroke(r5, r9)
            r14.setBackground(r10)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r15, r15)
            r9 = 3
            int r10 = p000.jx0.m3056(r1, r9)
            int r13 = p000.jx0.m3056(r1, r9)
            int r12 = p000.jx0.m3056(r1, r9)
            int r15 = p000.jx0.m3056(r1, r9)
            r5.setMargins(r10, r13, r12, r15)
            r11.addView(r14, r5)
            com.example.dyhelper.ui.ε r5 = new com.example.dyhelper.ui.ε
            r5.<init>(r0, r8)
            r11.setOnClickListener(r5)
            java.util.ArrayList r5 = r0.f2476
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            l91 r10 = new l91
            r10.<init>(r8, r11)
            r5.add(r10)
            r3.addView(r11)
            int r6 = r6 + 1
            r5 = -2
            r9 = 16
            r10 = 8
            r12 = 7
            r13 = 44
            r15 = -1
            goto L25f
        L2f6:
            android.widget.HorizontalScrollView r5 = new android.widget.HorizontalScrollView
            r5.<init>(r1)
            r5.setHorizontalScrollBarEnabled(r7)
            r5.setOverScrollMode(r4)
            r5.addView(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r6 = -1
            r3.<init>(r6, r4)
            r4 = 8
            int r6 = p000.jx0.m3056(r1, r4)
            r3.topMargin = r6
            r2.addView(r5, r3)
            r0.addView(r2)
            int r2 = r0.f2465
            int r2 = android.graphics.Color.red(r2)
            xx r3 = r0.f2464
            java.lang.String r4 = r3.f12366
            java.lang.String r5 = r3.f12360
            java.lang.String r6 = r3.f12358
            java.lang.String r8 = "R"
            android.widget.TextView r2 = m1533(r2, r1, r8, r4)
            r0.f2457 = r2
            int r2 = r0.f2465
            int r2 = android.graphics.Color.green(r2)
            java.lang.String r4 = "G"
            android.widget.TextView r2 = m1533(r2, r1, r4, r6)
            r0.f2458 = r2
            int r2 = r0.f2465
            int r2 = android.graphics.Color.blue(r2)
            java.lang.String r4 = "B"
            android.widget.TextView r2 = m1533(r2, r1, r4, r5)
            r0.f2459 = r2
            int r2 = r0.f2465
            int r2 = android.graphics.Color.red(r2)
            java.lang.String r4 = r3.f12366
            com.example.dyhelper.ui.ζ r8 = new com.example.dyhelper.ui.ζ
            r9 = 0
            r8.<init>(r0, r9)
            android.widget.SeekBar r2 = r0.m1538(r1, r2, r4, r8)
            r0.f2481 = r2
            int r2 = r0.f2465
            int r2 = android.graphics.Color.green(r2)
            com.example.dyhelper.ui.ζ r4 = new com.example.dyhelper.ui.ζ
            r8 = 1
            r4.<init>(r0, r8)
            android.widget.SeekBar r2 = r0.m1538(r1, r2, r6, r4)
            r0.f2482 = r2
            int r2 = r0.f2465
            int r2 = android.graphics.Color.blue(r2)
            com.example.dyhelper.ui.ζ r4 = new com.example.dyhelper.ui.ζ
            r6 = 2
            r4.<init>(r0, r6)
            android.widget.SeekBar r2 = r0.m1538(r1, r2, r5, r4)
            r0.f2456 = r2
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r1)
            r11 = 1
            r2.setOrientation(r11)
            r4 = 8
            r2.setVisibility(r4)
            android.widget.TextView r4 = r0.f2457
            r5 = 0
            if (r4 == 0) goto L4ff
            android.widget.SeekBar r6 = r0.f2481
            if (r6 == 0) goto L4f9
            android.widget.LinearLayout r4 = m1531(r1, r4, r6, r11)
            r2.addView(r4)
            android.widget.TextView r4 = r0.f2458
            if (r4 == 0) goto L4f3
            android.widget.SeekBar r6 = r0.f2482
            if (r6 == 0) goto L4ed
            android.widget.LinearLayout r4 = m1531(r1, r4, r6, r11)
            r2.addView(r4)
            android.widget.TextView r4 = r0.f2459
            if (r4 == 0) goto L4e7
            android.widget.SeekBar r6 = r0.f2456
            if (r6 == 0) goto L4e1
            android.widget.LinearLayout r4 = m1531(r1, r4, r6, r7)
            r2.addView(r4)
            r0.f2460 = r2
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            java.lang.String r4 = "⌄"
            r2.setText(r4)
            r4 = 1102053376(0x41b00000, float:22.0)
            r2.setTextSize(r4)
            r4 = 17
            r2.setGravity(r4)
            r2.setIncludeFontPadding(r7)
            java.lang.String r4 = r3.f12356
            int r4 = android.graphics.Color.parseColor(r4)
            r2.setTextColor(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = 32
            int r8 = p000.jx0.m3056(r1, r6)
            int r6 = p000.jx0.m3056(r1, r6)
            r4.<init>(r8, r6)
            r2.setLayoutParams(r4)
            r0.f2461 = r2
            android.widget.LinearLayout r2 = r18.m1537(r19)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r1)
            r4.setOrientation(r7)
            r6 = 16
            r4.setGravity(r6)
            r6 = 44
            int r6 = p000.jx0.m3056(r1, r6)
            r4.setMinimumHeight(r6)
            r11 = 1
            r4.setClickable(r11)
            r4.setFocusable(r11)
            java.lang.String r6 = "展开 RGB 精确调整"
            r4.setContentDescription(r6)
            java.lang.String r6 = r3.f12348
            java.lang.String r8 = r3.f12352
            r9 = 10
            android.graphics.drawable.RippleDrawable r6 = p000.jx0.m3059(r9, r1, r6, r8)
            r4.setBackground(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            java.lang.String r8 = "RGB 精确调整"
            r6.setText(r8)
            r8 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r8)
            r6.setIncludeFontPadding(r7)
            android.graphics.Typeface r8 = r6.getTypeface()
            r11 = 1
            r6.setTypeface(r8, r11)
            java.lang.String r3 = r3.f12355
            int r3 = android.graphics.Color.parseColor(r3)
            r6.setTextColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -2
            r3.<init>(r7, r9, r8)
            r4.addView(r6, r3)
            android.widget.TextView r3 = r0.f2461
            if (r3 == 0) goto L4db
            r4.addView(r3)
            com.example.dyhelper.ui.η r3 = new com.example.dyhelper.ui.η
            r6 = 0
            r3.<init>(r6, r0)
            r4.setOnClickListener(r3)
            r0.f2462 = r4
            r2.addView(r4)
            android.widget.LinearLayout r3 = r0.f2460
            if (r3 == 0) goto L4d5
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r9 = -2
            r4.<init>(r6, r9)
            r6 = 8
            int r1 = p000.jx0.m3056(r1, r6)
            r4.topMargin = r1
            r2.addView(r3, r4)
            r0.addView(r2)
            com.example.dyhelper.ui.ColorPickerDialog$SvPanel r1 = r0.f2472
            com.example.dyhelper.ui.ι r2 = new com.example.dyhelper.ui.ι
            r2.<init>(r0)
            r1.getClass()
            r1.f2508 = r2
            com.example.dyhelper.ui.ColorPickerDialog$HueBar r1 = r0.f2473
            com.example.dyhelper.ui.ζ r2 = new com.example.dyhelper.ui.ζ
            r3 = 3
            r2.<init>(r0, r3)
            r1.getClass()
            r1.f2493 = r2
            boolean r1 = r0.f2463
            if (r1 == 0) goto L4ae
            com.example.dyhelper.ui.ColorPickerDialog$AlphaBar r1 = r0.f2474
            com.example.dyhelper.ui.ζ r2 = new com.example.dyhelper.ui.ζ
            r3 = 4
            r2.<init>(r0, r3)
            r1.getClass()
            r1.f2440 = r2
        L4ae:
            android.widget.EditText r1 = r0.f2479
            java.lang.String r2 = "hexInput"
            if (r1 == 0) goto L4d1
            com.example.dyhelper.ui.λ r3 = new com.example.dyhelper.ui.λ
            r3.<init>(r0)
            r1.addTextChangedListener(r3)
            android.widget.EditText r1 = r0.f2479
            if (r1 == 0) goto L4cd
            com.example.dyhelper.ui.θ r2 = new com.example.dyhelper.ui.θ
            r2.<init>(r0)
            r1.setOnEditorActionListener(r2)
            r11 = 1
            r0.m1541(r11)
            return
        L4cd:
            p000.ln0.m3650(r2)
            throw r5
        L4d1:
            p000.ln0.m3650(r2)
            throw r5
        L4d5:
            java.lang.String r0 = "advancedContent"
            p000.ln0.m3650(r0)
            throw r5
        L4db:
            java.lang.String r0 = "advancedChevron"
            p000.ln0.m3650(r0)
            throw r5
        L4e1:
            java.lang.String r0 = "seekB"
            p000.ln0.m3650(r0)
            throw r5
        L4e7:
            java.lang.String r0 = "labelB"
            p000.ln0.m3650(r0)
            throw r5
        L4ed:
            java.lang.String r0 = "seekG"
            p000.ln0.m3650(r0)
            throw r5
        L4f3:
            java.lang.String r0 = "labelG"
            p000.ln0.m3650(r0)
            throw r5
        L4f9:
            java.lang.String r0 = "seekR"
            p000.ln0.m3650(r0)
            throw r5
        L4ff:
            java.lang.String r0 = "labelR"
            p000.ln0.m3650(r0)
            throw r5
    }

    /* JADX INFO: renamed from: γ */
    public static android.widget.LinearLayout m1531(android.content.Context r4, android.widget.TextView r5, android.widget.SeekBar r6, boolean r7) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 0
            r0.setOrientation(r1)
            r1 = 16
            r0.setGravity(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = 38
            int r2 = p000.jx0.m3056(r4, r2)
            r3 = -1
            r1.<init>(r3, r2)
            if (r7 == 0) goto L23
            r7 = 4
            int r4 = p000.jx0.m3056(r4, r7)
            r1.bottomMargin = r4
        L23:
            r0.setLayoutParams(r1)
            r0.addView(r5)
            r0.addView(r6)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m1532(int r2, boolean r3) {
            r0 = 1
            if (r3 == 0) goto L18
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "#%08X"
            java.lang.String r2 = java.lang.String.format(r3, r0, r2)
            return r2
        L18:
            java.util.Locale r3 = java.util.Locale.US
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "#%06X"
            java.lang.String r2 = java.lang.String.format(r3, r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static android.widget.TextView m1533(int r2, android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            r4 = 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String r4 = "%s  %3d"
            java.lang.String r2 = java.lang.String.format(r1, r4, r2)
            r0.setText(r2)
            r2 = 1093664768(0x41300000, float:11.0)
            r0.setTextSize(r2)
            r2 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r2)
            r2 = 0
            r0.setIncludeFontPadding(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            r4 = 1
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r4)
            r0.setTypeface(r2)
            int r2 = android.graphics.Color.parseColor(r5)
            r0.setTextColor(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = 58
            int r3 = p000.jx0.m3056(r3, r4)
            r4 = -1
            r2.<init>(r3, r4)
            r0.setLayoutParams(r2)
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final void m1534(int r3, int r4, int r5, boolean r6) {
            r2 = this;
            r0 = 0
            r1 = 255(0xff, float:3.57E-43)
            int r3 = p000.j81.m2906(r3, r0, r1)
            int r4 = p000.j81.m2906(r4, r0, r1)
            int r5 = p000.j81.m2906(r5, r0, r1)
            int r0 = r2.f2467
            int r0 = android.graphics.Color.argb(r0, r3, r4, r5)
            r2.f2465 = r0
            int r3 = android.graphics.Color.rgb(r3, r4, r5)
            float[] r4 = r2.f2466
            android.graphics.Color.colorToHSV(r3, r4)
            r2.m1541(r6)
            return
    }

    /* JADX INFO: renamed from: β */
    public final android.widget.LinearLayout m1535(android.content.Context r4, java.lang.String r5, com.example.dyhelper.p002ui.ColorPickerDialog$ColorPreviewView r6) {
            r3 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 1
            r0.setOrientation(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r4)
            r1.setText(r5)
            r5 = 1092616192(0x41200000, float:10.0)
            r1.setTextSize(r5)
            r5 = 17
            r1.setGravity(r5)
            r5 = 0
            r1.setIncludeFontPadding(r5)
            xx r3 = r3.f2464
            java.lang.String r3 = r3.f12356
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setTextColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r2 = -1
            r3.<init>(r2, r5)
            r5 = 5
            int r5 = p000.jx0.m3056(r4, r5)
            r3.bottomMargin = r5
            r0.addView(r1, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 48
            int r4 = p000.jx0.m3056(r4, r5)
            r3.<init>(r2, r4)
            r0.addView(r6, r3)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final android.widget.LinearLayout m1536(android.content.Context r4, java.lang.String r5, android.widget.TextView r6) {
            r3 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            r2.setText(r5)
            r4 = 1093664768(0x41300000, float:11.0)
            r2.setTextSize(r4)
            r2.setIncludeFontPadding(r1)
            xx r3 = r3.f2464
            java.lang.String r3 = r3.f12356
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setTextColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r1, r4, r5)
            r0.addView(r2, r3)
            r0.addView(r6)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final android.widget.LinearLayout m1537(android.content.Context r7) {
            r6 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            r1 = 12
            int r2 = p000.jx0.m3056(r7, r1)
            int r3 = p000.jx0.m3056(r7, r1)
            int r4 = p000.jx0.m3056(r7, r1)
            int r5 = p000.jx0.m3056(r7, r1)
            r0.setPadding(r2, r3, r4, r5)
            xx r6 = r6.f2464
            java.lang.String r6 = r6.f12352
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r1, r7, r6)
            r0.setBackground(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r2 = -2
            r6.<init>(r1, r2)
            r1 = 10
            int r7 = p000.jx0.m3056(r7, r1)
            r6.bottomMargin = r7
            r0.setLayoutParams(r6)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final android.widget.SeekBar m1538(android.content.Context r3, int r4, java.lang.String r5, p000.a80 r6) {
            r2 = this;
            android.widget.SeekBar r0 = new android.widget.SeekBar
            r0.<init>(r3)
            r1 = 255(0xff, float:3.57E-43)
            r0.setMax(r1)
            r0.setProgress(r4)
            r4 = 0
            r0.setSplitTrack(r4)
            int r1 = android.graphics.Color.parseColor(r5)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setProgressTintList(r1)
            xx r2 = r2.f2464
            java.lang.String r2 = r2.f12354
            int r2 = android.graphics.Color.parseColor(r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setProgressBackgroundTintList(r2)
            int r2 = android.graphics.Color.parseColor(r5)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setThumbTintList(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r5 = 36
            int r3 = p000.jx0.m3056(r3, r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r4, r3, r5)
            r0.setLayoutParams(r2)
            ah r2 = new ah
            r3 = 1
            r2.<init>(r6, r3, r0)
            r0.setOnSeekBarChangeListener(r2)
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final android.widget.TextView m1539(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r3)
            r2 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r2)
            r2 = 0
            r0.setIncludeFontPadding(r2)
            android.graphics.Typeface r2 = r0.getTypeface()
            r3 = 1
            r0.setTypeface(r2, r3)
            xx r1 = r1.f2464
            java.lang.String r1 = r1.f12355
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final android.widget.TextView m1540(android.content.Context r2) {
            r1 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r2 = 1093664768(0x41300000, float:11.0)
            r0.setTextSize(r2)
            r2 = 0
            r0.setIncludeFontPadding(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            r0.setTypeface(r2)
            xx r1 = r1.f2464
            java.lang.String r1 = r1.f12356
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final void m1541(boolean r21) {
            r20 = this;
            r1 = r20
            float[] r0 = r1.f2466
            r2 = 1
            r1.f2470 = r2
            r3 = 0
            com.example.dyhelper.ui.ColorPickerDialog$SvPanel r4 = r1.f2472     // Catch: java.lang.Throwable -> Le2
            r5 = r0[r3]     // Catch: java.lang.Throwable -> Le2
            r6 = r0[r2]     // Catch: java.lang.Throwable -> Le2
            r7 = 2
            r8 = r0[r7]     // Catch: java.lang.Throwable -> Le2
            float r9 = r4.f2505     // Catch: java.lang.Throwable -> Le2
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 != 0) goto L19
            r9 = r2
            goto L1a
        L19:
            r9 = r3
        L1a:
            r10 = 1135869952(0x43b40000, float:360.0)
            r11 = 0
            float r5 = p000.j81.m2905(r5, r11, r10)     // Catch: java.lang.Throwable -> Le2
            r4.f2505 = r5     // Catch: java.lang.Throwable -> Le2
            r5 = 1065353216(0x3f800000, float:1.0)
            float r6 = p000.j81.m2905(r6, r11, r5)     // Catch: java.lang.Throwable -> Le2
            r4.f2506 = r6     // Catch: java.lang.Throwable -> Le2
            float r6 = p000.j81.m2905(r8, r11, r5)     // Catch: java.lang.Throwable -> Le2
            r4.f2507 = r6     // Catch: java.lang.Throwable -> Le2
            if (r9 != 0) goto L5c
            int r6 = r4.getWidth()     // Catch: java.lang.Throwable -> Le2
            if (r6 <= 0) goto L5c
            int r6 = r4.getWidth()     // Catch: java.lang.Throwable -> Le2
            float r15 = (float) r6     // Catch: java.lang.Throwable -> Le2
            android.graphics.LinearGradient r12 = new android.graphics.LinearGradient     // Catch: java.lang.Throwable -> Le2
            float r6 = r4.f2505     // Catch: java.lang.Throwable -> Le2
            r8 = 3
            float[] r8 = new float[r8]     // Catch: java.lang.Throwable -> Le2
            r8[r3] = r6     // Catch: java.lang.Throwable -> Le2
            r8[r2] = r5     // Catch: java.lang.Throwable -> Le2
            r8[r7] = r5     // Catch: java.lang.Throwable -> Le2
            int r18 = android.graphics.Color.HSVToColor(r8)     // Catch: java.lang.Throwable -> Le2
            android.graphics.Shader$TileMode r19 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> Le2
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = -1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Le2
            r4.f2509 = r12     // Catch: java.lang.Throwable -> Le2
        L5c:
            r4.invalidate()     // Catch: java.lang.Throwable -> Le2
            com.example.dyhelper.ui.ColorPickerDialog$HueBar r4 = r1.f2473     // Catch: java.lang.Throwable -> Le2
            r5 = r0[r3]     // Catch: java.lang.Throwable -> Le2
            r4.getClass()     // Catch: java.lang.Throwable -> Le2
            float r5 = p000.j81.m2905(r5, r11, r10)     // Catch: java.lang.Throwable -> Le2
            r4.f2492 = r5     // Catch: java.lang.Throwable -> Le2
            r4.invalidate()     // Catch: java.lang.Throwable -> Le2
            android.widget.TextView r4 = r1.f2477     // Catch: java.lang.Throwable -> Le2
            r5 = 0
            if (r4 == 0) goto L106
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le2
            java.lang.String r7 = "%d°"
            r0 = r0[r3]     // Catch: java.lang.Throwable -> Le2
            int r0 = p000.jx0.m3061(r0)     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Le2
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Le2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r0 = java.lang.String.format(r6, r7, r0)     // Catch: java.lang.Throwable -> Le2
            r4.setText(r0)     // Catch: java.lang.Throwable -> Le2
            boolean r0 = r1.f2463     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Lea
            com.example.dyhelper.ui.ColorPickerDialog$AlphaBar r0 = r1.f2474     // Catch: java.lang.Throwable -> Le2
            int r4 = r1.f2467     // Catch: java.lang.Throwable -> Le2
            int r7 = r1.f2465     // Catch: java.lang.Throwable -> Le2
            r0.getClass()     // Catch: java.lang.Throwable -> Le2
            r8 = 255(0xff, float:3.57E-43)
            int r4 = p000.j81.m2906(r4, r3, r8)     // Catch: java.lang.Throwable -> Le2
            r0.f2438 = r4     // Catch: java.lang.Throwable -> Le2
            int r4 = android.graphics.Color.red(r7)     // Catch: java.lang.Throwable -> Le2
            int r8 = android.graphics.Color.green(r7)     // Catch: java.lang.Throwable -> Le2
            int r7 = android.graphics.Color.blue(r7)     // Catch: java.lang.Throwable -> Le2
            int r4 = android.graphics.Color.rgb(r4, r8, r7)     // Catch: java.lang.Throwable -> Le2
            r0.f2439 = r4     // Catch: java.lang.Throwable -> Le2
            r0.invalidate()     // Catch: java.lang.Throwable -> Le2
            android.widget.TextView r0 = r1.f2478     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Le4
            java.lang.String r4 = "%d%%"
            int r5 = r1.f2467     // Catch: java.lang.Throwable -> Le2
            float r5 = (float) r5     // Catch: java.lang.Throwable -> Le2
            r7 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r7
            int r5 = p000.jx0.m3061(r5)     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Le2
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Le2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = java.lang.String.format(r6, r4, r2)     // Catch: java.lang.Throwable -> Le2
            r0.setText(r2)     // Catch: java.lang.Throwable -> Le2
            goto Lea
        Le2:
            r0 = move-exception
            goto L10c
        Le4:
            java.lang.String r0 = "alphaValueLabel"
            p000.ln0.m3650(r0)     // Catch: java.lang.Throwable -> Le2
            throw r5     // Catch: java.lang.Throwable -> Le2
        Lea:
            r1.m1546()     // Catch: java.lang.Throwable -> Le2
            com.example.dyhelper.ui.ColorPickerDialog$ColorPreviewView r0 = r1.f2475     // Catch: java.lang.Throwable -> Le2
            int r2 = r1.f2465     // Catch: java.lang.Throwable -> Le2
            int r4 = r0.f2483     // Catch: java.lang.Throwable -> Le2
            if (r4 != r2) goto Lf6
            goto Lfb
        Lf6:
            r0.f2483 = r2     // Catch: java.lang.Throwable -> Le2
            r0.invalidate()     // Catch: java.lang.Throwable -> Le2
        Lfb:
            r1.m1545()     // Catch: java.lang.Throwable -> Le2
            if (r21 == 0) goto L103
            r1.m1544()     // Catch: java.lang.Throwable -> Le2
        L103:
            r1.f2470 = r3
            return
        L106:
            java.lang.String r0 = "hueValueLabel"
            p000.ln0.m3650(r0)     // Catch: java.lang.Throwable -> Le2
            throw r5     // Catch: java.lang.Throwable -> Le2
        L10c:
            r1.f2470 = r3
            throw r0
    }

    /* JADX INFO: renamed from: μ */
    public final void m1542(boolean r10) {
            r9 = this;
            boolean r0 = r9.f2468
            r1 = 0
            r2 = 1
            if (r0 == r10) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r9.f2468 = r10
            r3 = 0
            android.widget.EditText r4 = r9.f2479
            if (r4 == 0) goto L69
            android.content.Context r5 = r9.getContext()
            r5.getClass()
            xx r6 = r9.f2464
            java.lang.String r7 = r6.f12351
            if (r10 == 0) goto L20
            java.lang.String r6 = r6.f12353
            goto L22
        L20:
            java.lang.String r6 = r6.f12366
        L22:
            if (r10 == 0) goto L25
            goto L26
        L25:
            r2 = 2
        L26:
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            int r7 = android.graphics.Color.parseColor(r7)
            r8.setColor(r7)
            r7 = 9
            int r7 = p000.jx0.m3056(r5, r7)
            float r7 = (float) r7
            r8.setCornerRadius(r7)
            int r2 = p000.jx0.m3056(r5, r2)
            int r5 = android.graphics.Color.parseColor(r6)
            r8.setStroke(r2, r5)
            r4.setBackground(r8)
            android.widget.TextView r2 = r9.f2480
            if (r2 == 0) goto L63
            if (r10 == 0) goto L52
            r1 = 8
        L52:
            r2.setVisibility(r1)
            if (r0 == 0) goto L62
            fi r9 = r9.f2469
            if (r9 == 0) goto L62
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.invoke(r10)
        L62:
            return
        L63:
            java.lang.String r9 = "hexErrorLabel"
            p000.ln0.m3650(r9)
            throw r3
        L69:
            java.lang.String r9 = "hexInput"
            p000.ln0.m3650(r9)
            throw r3
    }

    /* JADX INFO: renamed from: ν */
    public final void m1543() {
            r4 = this;
            float[] r0 = r4.f2466
            int r0 = android.graphics.Color.HSVToColor(r0)
            int r1 = r4.f2467
            int r2 = android.graphics.Color.red(r0)
            int r3 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            int r0 = android.graphics.Color.argb(r1, r2, r3, r0)
            r4.f2465 = r0
            r0 = 1
            r4.m1541(r0)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m1544() {
            r6 = this;
            int r0 = r6.f2465
            boolean r1 = r6.f2463
            java.lang.String r0 = m1532(r0, r1)
            java.lang.String r1 = "hexInput"
            r2 = 0
            android.widget.EditText r3 = r6.f2479
            if (r3 == 0) goto L4b
            android.text.Editable r3 = r3.getText()
            if (r3 == 0) goto L1a
            java.lang.String r3 = r3.toString()
            goto L1b
        L1a:
            r3 = r2
        L1b:
            boolean r3 = p000.ln0.m3626(r3, r0)
            r4 = 1
            if (r3 != 0) goto L47
            boolean r3 = r6.f2470
            r6.f2470 = r4
            android.widget.EditText r5 = r6.f2479
            if (r5 == 0) goto L43
            r5.setText(r0)
            android.widget.EditText r0 = r6.f2479
            if (r0 == 0) goto L3f
            android.text.Editable r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
            r6.f2470 = r3
            goto L47
        L3f:
            p000.ln0.m3650(r1)
            throw r2
        L43:
            p000.ln0.m3650(r1)
            throw r2
        L47:
            r6.m1542(r4)
            return
        L4b:
            p000.ln0.m3650(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ο */
    public final void m1545() {
            r10 = this;
            java.util.ArrayList r0 = r10.f2476
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()
            l91 r1 = (p000.l91) r1
            java.lang.Object r2 = r1.f6502
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.f6503
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            int r3 = r10.f2465
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L26
            r3 = r5
            goto L27
        L26:
            r3 = r4
        L27:
            android.content.Context r6 = r10.getContext()
            r6.getClass()
            xx r7 = r10.f2464
            if (r3 == 0) goto L35
            java.lang.String r7 = r7.f12358
            goto L37
        L35:
            java.lang.String r7 = r7.f12353
        L37:
            if (r3 == 0) goto L3a
            r5 = 2
        L3a:
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            java.lang.String r9 = "#00000000"
            int r9 = android.graphics.Color.parseColor(r9)
            r8.setColor(r9)
            r9 = 9
            int r9 = p000.jx0.m3056(r6, r9)
            float r9 = (float) r9
            r8.setCornerRadius(r9)
            int r5 = p000.jx0.m3056(r6, r5)
            int r6 = android.graphics.Color.parseColor(r7)
            r8.setStroke(r5, r6)
            r1.setBackground(r8)
            java.lang.String r2 = m1532(r2, r4)
            if (r3 == 0) goto L6f
            java.lang.String r4 = "预设颜色 "
            java.lang.String r5 = "，已选择"
            java.lang.String r2 = p000.lz1.m3674(r4, r2, r5)
            goto L75
        L6f:
            java.lang.String r4 = "选择预设颜色 "
            java.lang.String r2 = r4.concat(r2)
        L75:
            r1.setContentDescription(r2)
            r1.setSelected(r3)
            goto L6
        L7c:
            return
    }

    /* JADX INFO: renamed from: π */
    public final void m1546() {
            r8 = this;
            int r0 = r8.f2465
            int r0 = android.graphics.Color.red(r0)
            int r1 = r8.f2465
            int r1 = android.graphics.Color.green(r1)
            int r2 = r8.f2465
            int r2 = android.graphics.Color.blue(r2)
            r3 = 0
            android.widget.SeekBar r4 = r8.f2481
            if (r4 == 0) goto L95
            r4.setProgress(r0)
            android.widget.SeekBar r4 = r8.f2482
            if (r4 == 0) goto L8f
            r4.setProgress(r1)
            android.widget.SeekBar r4 = r8.f2456
            if (r4 == 0) goto L89
            r4.setProgress(r2)
            android.widget.TextView r4 = r8.f2457
            if (r4 == 0) goto L83
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r7 = "R  %3d"
            java.lang.String r0 = java.lang.String.format(r5, r7, r0)
            r4.setText(r0)
            android.widget.TextView r0 = r8.f2458
            if (r0 == 0) goto L7d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r6)
            java.lang.String r4 = "G  %3d"
            java.lang.String r1 = java.lang.String.format(r5, r4, r1)
            r0.setText(r1)
            android.widget.TextView r8 = r8.f2459
            if (r8 == 0) goto L77
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r1 = "B  %3d"
            java.lang.String r0 = java.lang.String.format(r5, r1, r0)
            r8.setText(r0)
            return
        L77:
            java.lang.String r8 = "labelB"
            p000.ln0.m3650(r8)
            throw r3
        L7d:
            java.lang.String r8 = "labelG"
            p000.ln0.m3650(r8)
            throw r3
        L83:
            java.lang.String r8 = "labelR"
            p000.ln0.m3650(r8)
            throw r3
        L89:
            java.lang.String r8 = "seekB"
            p000.ln0.m3650(r8)
            throw r3
        L8f:
            java.lang.String r8 = "seekG"
            p000.ln0.m3650(r8)
            throw r3
        L95:
            java.lang.String r8 = "seekR"
            p000.ln0.m3650(r8)
            throw r3
    }
}
