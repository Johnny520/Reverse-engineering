package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ia0 {

    /* JADX INFO: renamed from: α */
    public static android.app.AlertDialog f4971;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f4972 = null;

    static {
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1077936128(0x40400000, float:3.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = 1082130432(0x40800000, float:4.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4 = 1084227584(0x40a00000, float:5.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Float[] r0 = new java.lang.Float[]{r0, r1, r2, r3, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.ia0.f4972 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2688(android.view.View r6, p000.C1000xx r7) {
            java.lang.String r0 = r7.f12360
            java.lang.String r1 = r7.f12356
            java.lang.String r2 = r7.f12355
            boolean r3 = r6 instanceof android.widget.TextView
            if (r3 == 0) goto L5f
            boolean r3 = r6 instanceof android.widget.Button
            if (r3 != 0) goto L5f
            r3 = r6
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = r3.getId()
            r5 = 2131297096(0x7f090348, float:1.8212127E38)
            if (r4 != r5) goto L1c
        L1a:
            r0 = r2
            goto L58
        L1c:
            r5 = 2131297091(0x7f090343, float:1.8212117E38)
            if (r4 != r5) goto L23
        L21:
            r0 = r1
            goto L58
        L23:
            r5 = 2131297127(0x7f090367, float:1.821219E38)
            if (r4 != r5) goto L29
            goto L58
        L29:
            r5 = 2131297129(0x7f090369, float:1.8212194E38)
            if (r4 != r5) goto L31
            java.lang.String r0 = r7.f12366
            goto L58
        L31:
            r5 = 2131297134(0x7f09036e, float:1.8212204E38)
            if (r4 != r5) goto L37
            goto L58
        L37:
            r0 = 2131297095(0x7f090347, float:1.8212125E38)
            if (r4 == r0) goto L21
            r0 = 2131297093(0x7f090345, float:1.8212121E38)
            if (r4 == r0) goto L21
            r0 = 2131297051(0x7f09031b, float:1.8212036E38)
            if (r4 == r0) goto L21
            r0 = 2131297071(0x7f09032f, float:1.8212077E38)
            if (r4 == r0) goto L21
            r0 = 2131297098(0x7f09034a, float:1.8212131E38)
            if (r4 != r0) goto L51
            goto L21
        L51:
            r0 = 2131297092(0x7f090344, float:1.821212E38)
            if (r4 != r0) goto L1a
            java.lang.String r0 = r7.f12349
        L58:
            int r0 = android.graphics.Color.parseColor(r0)
            r3.setTextColor(r0)
        L5f:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L79
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L6a:
            if (r1 >= r0) goto L79
            android.view.View r2 = r6.getChildAt(r1)
            r2.getClass()
            m2688(r2, r7)
            int r1 = r1 + 1
            goto L6a
        L79:
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.fa0 m2689(android.app.Activity r12, p000.C1000xx r13, float r14, java.lang.String r15) {
            boolean r0 = r13.f12350
            java.lang.String r1 = "#339AF5"
            java.lang.String r2 = "#4AA3FF"
            if (r0 == 0) goto La
            r3 = r2
            goto Lb
        La:
            r3 = r1
        Lb:
            int r3 = android.graphics.Color.parseColor(r3)
            r4 = 1
            android.widget.LinearLayout r5 = p000.AbstractC0602nx.m4123(r12, r4)
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = m2690(r12, r6)
            r7 = 0
            r5.setPadding(r7, r6, r7, r7)
            r5.setClickable(r4)
            r5.setFocusable(r7)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r12)
            r6.setOrientation(r7)
            r8 = 16
            r6.setGravity(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r12)
            r8.setText(r15)
            r15 = 1095761920(0x41500000, float:13.0)
            r8.setTextSize(r15)
            r8.setIncludeFontPadding(r7)
            r15 = 0
            r8.setTypeface(r15, r4)
            java.lang.String r9 = r13.f12355
            int r9 = android.graphics.Color.parseColor(r9)
            r8.setTextColor(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r7, r10, r11)
            r6.addView(r8, r9)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r12)
            r9 = 1094713344(0x41400000, float:12.0)
            r8.setTextSize(r9)
            r8.setIncludeFontPadding(r7)
            r9 = 17
            r8.setGravity(r9)
            r8.setTypeface(r15, r4)
            r8.setTextColor(r3)
            r3 = 1091567616(0x41100000, float:9.0)
            int r9 = m2690(r12, r3)
            r10 = 1082130432(0x40800000, float:4.0)
            int r11 = m2690(r12, r10)
            int r3 = m2690(r12, r3)
            int r10 = m2690(r12, r10)
            r8.setPadding(r9, r11, r3, r10)
            java.lang.String r3 = r13.f12361
            int r3 = android.graphics.Color.parseColor(r3)
            r9 = 1120272384(0x42c60000, float:99.0)
            m2692(r9, r3, r8)
            r6.addView(r8)
            r5.addView(r6)
            x01 r3 = p000.x01.f11964
            android.view.LayoutInflater r3 = r3.m6477(r12)
            r6 = 2131492971(0x7f0c006b, float:1.8609409E38)
            android.view.View r3 = r3.inflate(r6, r5, r7)
            r6 = 2131296905(0x7f090289, float:1.821174E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.SeekBar r6 = (android.widget.SeekBar) r6
            if (r6 == 0) goto L125
            if (r0 == 0) goto Lb4
            r1 = r2
        Lb4:
            int r0 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> Ld2
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)     // Catch: java.lang.Throwable -> Ld2
            r6.setProgressTintList(r0)     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r13 = r13.f12371     // Catch: java.lang.Throwable -> Ld2
            int r13 = android.graphics.Color.parseColor(r13)     // Catch: java.lang.Throwable -> Ld2
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)     // Catch: java.lang.Throwable -> Ld2
            r6.setProgressBackgroundTintList(r13)     // Catch: java.lang.Throwable -> Ld2
            r6.setThumbTintList(r15)     // Catch: java.lang.Throwable -> Ld2
            r6.setHapticFeedbackEnabled(r4)     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r15 = 1111490560(0x42400000, float:48.0)
            int r15 = m2690(r12, r15)
            r0 = -1
            r13.<init>(r0, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            int r15 = m2690(r12, r15)
            r13.topMargin = r15
            r5.addView(r3, r13)
            fa0 r13 = new fa0
            r13.<init>(r5, r8, r6)
            w90 r15 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            float r14 = p000.C0381i2.m2601(r14)
            java.util.List r15 = com.example.dyhelper.p002ui.GestureAreaView.f2526
            int r0 = p000.AbstractC1021yh.m6858(r15)
            r6.setMax(r0)
            float r0 = p000.C0381i2.m2601(r14)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r15 = r15.indexOf(r0)
            if (r15 >= 0) goto L10c
            goto L10d
        L10c:
            r7 = r15
        L10d:
            r6.setProgress(r7)
            x01 r15 = p000.x01.f11964
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            r0 = 2131689541(0x7f0f0045, float:1.90081E38)
            java.lang.String r12 = r15.m6478(r12, r0, r14)
            r8.setText(r12)
            return r13
        L125:
            java.lang.String r12 = "倍速滑块 XML 缺少 seek_gesture_speed"
            p000.C1080.m7279(r12)
            return r15
    }

    /* JADX INFO: renamed from: γ */
    public static int m2690(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static void m2691(android.widget.TextView r0, java.lang.String r1, int r2, int r3) {
            r0.setText(r1)
            r0.setTextColor(r3)
            r1 = 17
            r0.setGravity(r1)
            r1 = 0
            r0.setIncludeFontPadding(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setColor(r2)
            android.content.Context r2 = r0.getContext()
            r2.getClass()
            r3 = 1120272384(0x42c60000, float:99.0)
            int r2 = m2690(r2, r3)
            float r2 = (float) r2
            r1.setCornerRadius(r2)
            r0.setBackground(r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m2692(float r1, int r2, android.view.View r3) {
            android.graphics.drawable.GradientDrawable r2 = p000.lz1.m3681(r2)
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            int r1 = m2690(r0, r1)
            float r1 = (float) r1
            r2.setCornerRadius(r1)
            r3.setBackground(r2)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m2693(android.view.View r2, int r3, int r4, float r5) {
            android.graphics.drawable.GradientDrawable r3 = p000.lz1.m3681(r3)
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = m2690(r0, r1)
            float r0 = (float) r0
            r3.setCornerRadius(r0)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L28
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            int r5 = m2690(r0, r5)
            r3.setStroke(r5, r4)
        L28:
            r2.setBackground(r3)
            return
    }

    /* JADX INFO: renamed from: η */
    public static final boolean m2694(com.example.dyhelper.p002ui.GestureAreaView r4, android.app.Activity r5) {
            java.lang.String r0 = "volume_key_enabled"
            r1 = 1
            boolean r0 = p000.ui1.m5887(r0, r1)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "share_panel_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            if (r0 == 0) goto L12
            goto L7a
        L12:
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r0 = "模块菜单"
            java.lang.String r0 = p000.C0381i2.m2598(r0)
            java.util.LinkedHashMap r4 = r4.f2536
            java.util.Collection r4 = r4.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r2 = r4 instanceof java.util.Collection
            if (r2 == 0) goto L30
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L30
            goto L6f
        L30:
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r4.next()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L54
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L54
            goto L34
        L54:
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = p000.C0381i2.m2598(r3)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L58
            goto L7a
        L6f:
            java.lang.String r4 = "请至少保留音量键、分享菜单或手势模块菜单中的一个入口"
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r5, r4, r0)
            r4.show()
            return r0
        L7a:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static final void m2695(android.widget.LinearLayout r1, com.example.dyhelper.p002ui.GestureAreaView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, java.lang.String r6) {
            if (r6 != 0) goto L8
            r2 = 8
            r1.setVisibility(r2)
            return
        L8:
            r0 = 0
            r1.setVisibility(r0)
            r2.getClass()
            java.util.LinkedHashMap r1 = r2.f2536
            java.lang.Object r1 = r1.get(r6)
            java.util.Map r1 = (java.util.Map) r1
            r2 = 0
            if (r1 == 0) goto L1f
            java.util.Map r1 = p000.ex0.m1975(r1)
            goto L20
        L1f:
            r1 = r2
        L20:
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            if (r1 == 0) goto L2d
            java.lang.String r0 = "double_tap"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L2e
        L2d:
            r0 = r2
        L2e:
            java.lang.String r0 = p000.C0381i2.m2591(r0)
            if (r1 == 0) goto L3d
            java.lang.String r2 = "long_press"
            java.lang.Object r1 = r1.get(r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L3d:
            java.lang.String r1 = p000.C0381i2.m2591(r2)
            java.lang.String r2 = "区域名称："
            java.lang.String r2 = r2.concat(r6)
            r3.setText(r2)
            java.lang.String r2 = "双击动作："
            java.lang.String r2 = r2.concat(r0)
            r4.setText(r2)
            java.lang.String r2 = "长按动作："
            java.lang.String r1 = r2.concat(r1)
            r5.setText(r1)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static final void m2696(com.example.dyhelper.p002ui.GestureAreaView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.Switch r7, android.widget.TextView r8, p000.C1000xx r9, android.widget.TextView r10) {
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            r0 = 0
            int r0 = r3.m1549(r0)
            java.lang.String r1 = "double_tap"
            int r1 = r3.m1549(r1)
            java.lang.String r2 = "long_press"
            int r3 = r3.m1549(r2)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r4.setText(r2)
            java.lang.String r4 = java.lang.String.valueOf(r1)
            r5.setText(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.setText(r3)
            boolean r3 = r7.isChecked()
            if (r0 > 0) goto L48
            r8.getClass()
            java.lang.String r3 = r9.f12367
            int r3 = android.graphics.Color.parseColor(r3)
            java.lang.String r4 = r9.f12366
            int r4 = android.graphics.Color.parseColor(r4)
            java.lang.String r5 = "未配置"
            m2691(r8, r5, r3, r4)
            java.lang.String r3 = "未配置任何区域动作时，Feed页不会触发手势功能"
            r10.setText(r3)
            return
        L48:
            java.lang.String r4 = "已配置 "
            if (r3 == 0) goto L75
            r8.getClass()
            java.lang.String r3 = r9.f12359
            int r3 = android.graphics.Color.parseColor(r3)
            java.lang.String r5 = r9.f12358
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.String r6 = "已启用"
            m2691(r8, r6, r3, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " 个动作，仅在Feed流视频页生效"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.setText(r3)
            return
        L75:
            r8.getClass()
            java.lang.String r3 = r9.f12371
            int r3 = android.graphics.Color.parseColor(r3)
            java.lang.String r5 = r9.f12356
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.String r6 = "未启用"
            m2691(r8, r6, r3, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " 个动作，但总开关未开启"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r10.setText(r3)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m2697(android.app.Activity r48, java.lang.String r49, java.lang.String r50, p000.a80 r51) {
            r1 = r48
            xx r2 = p000.jx0.m3049(r1)
            java.lang.String r3 = r2.f12359
            java.lang.String r4 = r2.f12353
            java.lang.String r5 = r2.f12357
            java.lang.String r6 = r2.f12356
            java.lang.String r7 = r2.f12355
            java.lang.String r8 = r2.f12358
            java.lang.String r9 = r2.f12352
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r10 = p000.C0381i2.m2598(r50)
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            r11 = 1132593152(0x43820000, float:260.0)
            int r11 = m2690(r1, r11)
            float r0 = (float) r0
            r12 = 1055286886(0x3ee66666, float:0.45)
            float r13 = r0 * r12
            int r13 = (int) r13
            if (r11 <= r13) goto L34
            r11 = r13
        L34:
            r13 = 1058977874(0x3f1eb852, float:0.62)
            float r0 = r0 * r13
            int r0 = (int) r0
            r13 = 1141637120(0x440c0000, float:560.0)
            int r13 = m2690(r1, r13)
            if (r0 <= r13) goto L42
            r0 = r13
        L42:
            if (r0 >= r11) goto L45
            goto L46
        L45:
            r11 = r0
        L46:
            r13 = 1
            android.widget.LinearLayout r14 = p000.AbstractC0602nx.m4123(r1, r13)
            r15 = 1092616192(0x41200000, float:10.0)
            int r0 = m2690(r1, r15)
            r12 = 1090519040(0x41000000, float:8.0)
            int r13 = m2690(r1, r12)
            int r12 = m2690(r1, r15)
            r17 = r3
            int r3 = m2690(r1, r15)
            r14.setPadding(r0, r13, r12, r3)
            java.lang.String r0 = r2.f12351
            int r0 = android.graphics.Color.parseColor(r0)
            r3 = 1096810496(0x41600000, float:14.0)
            m2692(r3, r0, r14)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            r3 = 1082130432(0x40800000, float:4.0)
            int r12 = m2690(r1, r3)
            int r13 = m2690(r1, r3)
            r3 = 0
            r0.setPadding(r12, r3, r13, r3)
            int r12 = android.graphics.Color.parseColor(r9)
            m2692(r15, r12, r0)
            android.widget.TextView r12 = new android.widget.TextView
            r12.<init>(r1)
            java.lang.String r13 = "选择"
            r15 = r49
            java.lang.String r13 = r13.concat(r15)
            r12.setText(r13)
            r13 = 1097859072(0x41700000, float:15.0)
            r12.setTextSize(r13)
            android.graphics.Typeface r13 = android.graphics.Typeface.DEFAULT_BOLD
            r12.setTypeface(r13)
            int r13 = android.graphics.Color.parseColor(r7)
            r12.setTextColor(r13)
            r13 = 17
            r12.setGravity(r13)
            r12.setIncludeFontPadding(r3)
            r15 = 1
            r12.setSingleLine(r15)
            r15 = 1116471296(0x428c0000, float:70.0)
            int r13 = m2690(r1, r15)
            int r15 = m2690(r1, r15)
            r12.setPadding(r13, r3, r15, r3)
            java.lang.String r13 = "取消"
            r15 = 1095761920(0x41500000, float:13.0)
            android.widget.TextView r13 = p000.lz1.m3683(r1, r13, r15)
            int r15 = android.graphics.Color.parseColor(r6)
            r13.setTextColor(r15)
            r15 = 17
            r13.setGravity(r15)
            r13.setIncludeFontPadding(r3)
            r18 = r4
            r15 = 1090519040(0x41000000, float:8.0)
            int r4 = m2690(r1, r15)
            r19 = r5
            int r5 = m2690(r1, r15)
            r13.setPadding(r4, r3, r5, r3)
            r15 = 1
            r13.setClickable(r15)
            r13.setFocusable(r15)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -1
            r15 = 17
            r4.<init>(r5, r5, r15)
            r0.addView(r12, r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r12 = 1115684864(0x42800000, float:64.0)
            int r12 = m2690(r1, r12)
            r15 = 8388627(0x800013, float:1.175497E-38)
            r4.<init>(r12, r5, r15)
            r0.addView(r13, r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r12 = 1109917696(0x42280000, float:42.0)
            int r12 = m2690(r1, r12)
            r4.<init>(r5, r12)
            r14.addView(r0, r4)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            java.lang.String r4 = "上下滑动查看更多动作，点击后立即保存"
            r0.setText(r4)
            r4 = 1093140480(0x41280000, float:10.5)
            r0.setTextSize(r4)
            int r4 = android.graphics.Color.parseColor(r19)
            r0.setTextColor(r4)
            r15 = 17
            r0.setGravity(r15)
            r0.setIncludeFontPadding(r3)
            r15 = 1090519040(0x41000000, float:8.0)
            int r4 = m2690(r1, r15)
            r12 = 1086324736(0x40c00000, float:6.0)
            int r3 = m2690(r1, r12)
            int r12 = m2690(r1, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            int r5 = m2690(r1, r15)
            r0.setPadding(r4, r3, r12, r5)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r5 = -1
            r3.<init>(r5, r4)
            r14.addView(r0, r3)
            android.widget.ScrollView r3 = new android.widget.ScrollView
            r3.<init>(r1)
            r5 = 0
            r3.setFillViewport(r5)
            r12 = 1
            r3.setVerticalScrollBarEnabled(r12)
            r3.setOverScrollMode(r12)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r3.setScrollBarStyle(r0)
            r3.setClipToPadding(r5)
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = m2690(r1, r0)
            r3.setPadding(r5, r5, r5, r0)
            int r0 = android.graphics.Color.parseColor(r9)
            r5 = 1092616192(0x41200000, float:10.0)
            m2692(r5, r0, r3)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r1)
            r5.setOrientation(r12)
            r12 = 1086324736(0x40c00000, float:6.0)
            int r0 = m2690(r1, r12)
            int r15 = m2690(r1, r12)
            int r4 = m2690(r1, r12)
            r20 = r6
            r12 = 1090519040(0x41000000, float:8.0)
            int r6 = m2690(r1, r12)
            r5.setPadding(r0, r15, r4, r6)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r6 = -1
            r0.<init>(r6, r4)
            r3.addView(r5, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r11)
            int r4 = m2690(r1, r12)
            r0.topMargin = r4
            r14.addView(r3, r0)
            um1 r4 = new um1
            r4.<init>()
            rm1 r6 = new rm1
            r6.<init>()
            java.lang.String r0 = "gesture_video_speed"
            android.content.SharedPreferences r11 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L1d8
            r12 = 1073741824(0x40000000, float:2.0)
            float r0 = r11.getFloat(r0, r12)     // Catch: java.lang.Throwable -> L1d8
            r12 = r0
            goto L1da
        L1d8:
            r12 = 1073741824(0x40000000, float:2.0)
        L1da:
            float r0 = p000.C0381i2.m2601(r12)
            r6.f9404 = r0
            java.lang.String r11 = "无"
            java.lang.String r12 = "发布按钮"
            java.lang.String r15 = "观看历史记录"
            r21 = r7
            java.lang.String r7 = "修改倍速"
            r22 = r8
            java.lang.String r8 = "不感兴趣"
            java.lang.String[] r0 = new java.lang.String[]{r11, r12, r15, r7, r8}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            r23 = r9
            l91 r9 = new l91
            r24 = r3
            java.lang.String r3 = "基础动作"
            r9.<init>(r3, r0)
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2527
            l91 r3 = new l91
            r25 = r13
            java.lang.String r13 = "作品互动"
            r3.<init>(r13, r0)
            java.lang.String r13 = "添加作品书签"
            r26 = r14
            java.lang.String r14 = "添加个人主页书签"
            java.lang.String[] r0 = new java.lang.String[]{r13, r14}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            r27 = r4
            l91 r4 = new l91
            r28 = r6
            java.lang.String r6 = "书签"
            r4.<init>(r6, r0)
            java.lang.String r6 = "一键已读"
            r29 = r15
            java.lang.String r15 = "一键续火花"
            r30 = r8
            java.lang.String r8 = "清爽模式开关"
            r31 = r12
            java.lang.String r12 = "切换隐藏联系人"
            r32 = r13
            java.lang.String r13 = "模块菜单"
            java.lang.String[] r0 = new java.lang.String[]{r6, r15, r8, r12, r13}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            r33 = r15
            l91 r15 = new l91
            r34 = r6
            java.lang.String r6 = "工具能力"
            r15.<init>(r6, r0)
            l91[] r0 = new p000.l91[]{r9, r3, r4, r15}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L25b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L26f
            java.lang.Object r6 = r4.next()
            l91 r6 = (p000.l91) r6
            java.lang.Object r6 = r6.f6503
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            p000.AbstractC0984xh.m6660(r3, r6)
            goto L25b
        L26f:
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r3)
            java.util.List r4 = com.example.dyhelper.p002ui.GestureAreaView.f2528
            java.util.ArrayList r6 = new java.util.ArrayList
            r9 = 10
            int r15 = p000.AbstractC1021yh.m6889(r4, r9)
            r6.<init>(r15)
            java.util.Iterator r4 = r4.iterator()
        L284:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L29a
            java.lang.Object r15 = r4.next()
            java.lang.String r15 = (java.lang.String) r15
            w90 r35 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r15 = p000.C0381i2.m2598(r15)
            r6.add(r15)
            goto L284
        L29a:
            java.util.Set r4 = p000.AbstractC0984xh.m6670(r6)
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2ab:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L2c4
            java.lang.Object r15 = r4.next()
            r9 = r15
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r3.contains(r9)
            if (r9 != 0) goto L2c1
            r6.add(r15)
        L2c1:
            r9 = 10
            goto L2ab
        L2c4:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L2d5
            l91 r3 = new l91
            java.lang.String r4 = "其他动作"
            r3.<init>(r4, r6)
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6650(r3, r0)
        L2d5:
            java.util.Iterator r3 = r0.iterator()
            r0 = 0
        L2da:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L8e9
            java.lang.Object r6 = r3.next()
            l91 r6 = (p000.l91) r6
            java.lang.Object r15 = r6.f6503
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r4 = new java.util.ArrayList
            r36 = r3
            r9 = 10
            int r3 = p000.AbstractC1021yh.m6889(r15, r9)
            r4.<init>(r3)
            java.util.Iterator r3 = r15.iterator()
        L2fb:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L311
            java.lang.Object r9 = r3.next()
            java.lang.String r9 = (java.lang.String) r9
            w90 r15 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r9 = p000.C0381i2.m2598(r9)
            r4.add(r9)
            goto L2fb
        L311:
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r4)
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L322:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L370
            java.lang.Object r9 = r3.next()
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            r37 = r3
            java.util.List r3 = com.example.dyhelper.p002ui.GestureAreaView.f2528
            r38 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r35 = r8
            r39 = r13
            r13 = 10
            int r8 = p000.AbstractC1021yh.m6889(r3, r13)
            r0.<init>(r8)
            java.util.Iterator r3 = r3.iterator()
        L348:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L35e
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            w90 r40 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r8 = p000.C0381i2.m2598(r8)
            r0.add(r8)
            goto L348
        L35e:
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L367
            r4.add(r9)
        L367:
            r8 = r35
            r3 = r37
            r0 = r38
            r13 = r39
            goto L322
        L370:
            r38 = r0
            r35 = r8
            r39 = r13
            r13 = 10
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L8d2
            java.lang.Object r0 = r6.f6502
            java.lang.String r0 = (java.lang.String) r0
            r3 = 1093664768(0x41300000, float:11.0)
            android.widget.TextView r0 = p000.lz1.m3683(r1, r0, r3)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r6)
            int r6 = android.graphics.Color.parseColor(r20)
            r0.setTextColor(r6)
            r6 = 0
            r0.setIncludeFontPadding(r6)
            r6 = 1086324736(0x40c00000, float:6.0)
            int r8 = m2690(r1, r6)
            r15 = 1090519040(0x41000000, float:8.0)
            int r9 = m2690(r1, r15)
            int r15 = m2690(r1, r6)
            r6 = 1077936128(0x40400000, float:3.0)
            int r13 = m2690(r1, r6)
            r0.setPadding(r8, r9, r15, r13)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r13 = -1
            r8.<init>(r13, r9)
            r5.addView(r0, r8)
            java.util.Iterator r4 = r4.iterator()
            r0 = r38
        L3c1:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L8ba
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = p000.ln0.m3626(r8, r7)
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L4d9
            java.lang.String r9 = "global_video_speed"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L3e0
            float r3 = r3.getFloat(r9, r15)     // Catch: java.lang.Throwable -> L3e0
            goto L3e1
        L3e0:
            r3 = r15
        L3e1:
            java.util.List r9 = p000.ia0.f4972
            xm0 r41 = p000.AbstractC1021yh.m6857(r9)
            java.util.Iterator r41 = r41.iterator()
            r15 = r41
            wm0 r15 = (p000.wm0) r15
            boolean r6 = r15.f11765
            if (r6 != 0) goto L3f7
            r45 = r0
            r6 = 0
            goto L442
        L3f7:
            java.lang.Object r6 = r15.next()
            boolean r13 = r15.f11765
            if (r13 != 0) goto L402
            r45 = r0
            goto L442
        L402:
            r13 = r6
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Object r13 = r9.get(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r13 = r13 - r3
            float r13 = java.lang.Math.abs(r13)
        L418:
            java.lang.Object r43 = r15.next()
            r44 = r43
            java.lang.Number r44 = (java.lang.Number) r44
            r45 = r0
            int r0 = r44.intValue()
            java.lang.Object r0 = r9.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r44 = java.lang.Float.compare(r13, r0)
            if (r44 <= 0) goto L43e
            r13 = r0
            r6 = r43
        L43e:
            boolean r0 = r15.f11765
            if (r0 != 0) goto L4d5
        L442:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L44b
            int r0 = r6.intValue()
            goto L44c
        L44b:
            r0 = 0
        L44c:
            java.lang.Object r3 = r9.get(r0)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.String r6 = "全局视频倍速"
            fa0 r3 = m2689(r1, r2, r3, r6)
            android.widget.LinearLayout r6 = r3.f3836
            android.widget.SeekBar r13 = r3.f3838
            int r15 = android.graphics.Color.parseColor(r23)
            r43 = r4
            int r4 = android.graphics.Color.parseColor(r18)
            r44 = r8
            r8 = 0
            m2693(r6, r15, r4, r8)
            r4 = 1094713344(0x41400000, float:12.0)
            int r15 = m2690(r1, r4)
            r46 = r2
            r8 = 1091567616(0x41100000, float:9.0)
            int r2 = m2690(r1, r8)
            r47 = r7
            int r7 = m2690(r1, r4)
            int r4 = m2690(r1, r8)
            r6.setPadding(r15, r2, r7, r4)
            int r2 = r9.size()
            r16 = 1
            int r2 = r2 + (-1)
            r13.setMax(r2)
            r13.setProgress(r0)
            android.widget.TextView r2 = r3.f3837
            java.lang.Object r4 = r9.get(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = "x"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r2.setText(r4)
            ha0 r2 = new ha0
            r2.<init>(r3, r0)
            r13.setOnSeekBarChangeListener(r2)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r13 = -1
            r0.<init>(r13, r4)
            r2 = 1086324736(0x40c00000, float:6.0)
            int r3 = m2690(r1, r2)
            r0.topMargin = r3
            r5.addView(r6, r0)
            goto L4e3
        L4d5:
            r0 = r45
            goto L418
        L4d9:
            r45 = r0
            r46 = r2
            r43 = r4
            r47 = r7
            r44 = r8
        L4e3:
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r2 = p000.C0381i2.m2598(r44)
            boolean r0 = r10.equals(r2)
            r15 = 1
            android.widget.LinearLayout r3 = p000.AbstractC0602nx.m4123(r1, r15)
            r4 = 1113063424(0x42580000, float:54.0)
            int r4 = m2690(r1, r4)
            r3.setMinimumHeight(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            int r6 = m2690(r1, r4)
            r8 = 1091567616(0x41100000, float:9.0)
            int r7 = m2690(r1, r8)
            int r4 = m2690(r1, r4)
            int r8 = m2690(r1, r8)
            r3.setPadding(r6, r7, r4, r8)
            r3.setClickable(r15)
            r3.setFocusable(r15)
            if (r0 == 0) goto L51f
            int r4 = android.graphics.Color.parseColor(r17)
            goto L523
        L51f:
            int r4 = android.graphics.Color.parseColor(r23)
        L523:
            if (r0 == 0) goto L52a
            int r6 = android.graphics.Color.parseColor(r22)
            goto L52e
        L52a:
            int r6 = android.graphics.Color.parseColor(r18)
        L52e:
            if (r0 == 0) goto L533
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L534
        L533:
            r13 = 0
        L534:
            m2693(r3, r4, r6, r13)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r1)
            r6 = 0
            r4.setOrientation(r6)
            r6 = 16
            r4.setGravity(r6)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r1)
            r15 = 1
            r7.setOrientation(r15)
            r7.setGravity(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r1)
            boolean r8 = r2.equals(r11)
            if (r8 == 0) goto L55f
            java.lang.String r8 = "不触发"
            goto L560
        L55f:
            r8 = r2
        L560:
            r6.setText(r8)
            r8 = 1096286208(0x41580000, float:13.5)
            r6.setTextSize(r8)
            android.graphics.Typeface r8 = android.graphics.Typeface.DEFAULT_BOLD
            r6.setTypeface(r8)
            if (r0 == 0) goto L572
            r9 = r22
            goto L574
        L572:
            r9 = r21
        L574:
            int r9 = android.graphics.Color.parseColor(r9)
            r6.setTextColor(r9)
            r9 = 0
            r6.setIncludeFontPadding(r9)
            r15 = 1
            r6.setMaxLines(r15)
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r1)
            java.lang.String r13 = p000.C0381i2.m2598(r2)
            int r15 = r13.hashCode()
            switch(r15) {
                case -1864099483: goto L76c;
                case -1763824809: goto L752;
                case -943367974: goto L734;
                case 619829985: goto L718;
                case 631146295: goto L6fe;
                case 631739728: goto L6e4;
                case 632348663: goto L6c8;
                case 635158013: goto L6aa;
                case 645556490: goto L694;
                case 648627390: goto L67e;
                case 663177879: goto L666;
                case 692437008: goto L650;
                case 805455358: goto L63a;
                case 831946447: goto L622;
                case 895108970: goto L60e;
                case 958306521: goto L5ee;
                case 1354647929: goto L5e2;
                case 1581080322: goto L5bc;
                case 1705654023: goto L5a3;
                default: goto L593;
            }
        L593:
            r42 = r11
            r15 = r32
            r11 = r33
            r41 = r35
            r35 = r0
            r32 = r10
        L59f:
            r10 = r47
            goto L780
        L5a3:
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L5aa
            goto L593
        L5aa:
            java.lang.String r13 = "添加当前作品作者的主页书签，并选择分类"
            r42 = r11
            r15 = r32
            r11 = r33
            r41 = r35
            r35 = r0
            r32 = r10
        L5b8:
            r10 = r47
            goto L785
        L5bc:
            r15 = r32
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L5d2
        L5c4:
            r32 = r10
            r42 = r11
            r11 = r33
            r41 = r35
            r10 = r47
            r35 = r0
            goto L780
        L5d2:
            java.lang.String r13 = "添加当前作品书签，已存在时不会取消"
        L5d4:
            r32 = r10
            r42 = r11
            r11 = r33
            r41 = r35
            r10 = r47
            r35 = r0
            goto L785
        L5e2:
            r15 = r32
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L5eb
            goto L5c4
        L5eb:
            java.lang.String r13 = "临时显示或恢复隐藏联系人，不修改总开关；退出抖音后按设置恢复隐藏"
            goto L5d4
        L5ee:
            r15 = r32
            r32 = r10
            r10 = r35
            boolean r13 = r13.equals(r10)
            if (r13 != 0) goto L603
            r35 = r0
        L5fc:
            r41 = r10
        L5fe:
            r42 = r11
            r11 = r33
            goto L59f
        L603:
            java.lang.String r13 = "切换清爽模式配置项"
            r35 = r0
        L607:
            r41 = r10
        L609:
            r42 = r11
            r11 = r33
            goto L5b8
        L60e:
            r15 = r32
            r32 = r10
            r10 = r35
            r35 = r0
            java.lang.String r0 = "点赞作品"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L61f
            goto L5fc
        L61f:
            java.lang.String r13 = "调用宿主原生点赞流程，不依赖点赞控件是否显示"
            goto L607
        L622:
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r39
            boolean r0 = r13.equals(r10)
            if (r0 != 0) goto L635
        L632:
            r39 = r10
            goto L5fe
        L635:
            java.lang.String r13 = "打开 DyHelper 模块菜单"
        L637:
            r39 = r10
            goto L609
        L63a:
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r39
            java.lang.String r0 = "收藏作品"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L64d
            goto L632
        L64d:
            java.lang.String r13 = "调用宿主原生收藏流程，不依赖收藏控件是否显示"
            goto L637
        L650:
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r39
            java.lang.String r0 = "打开作者主页"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L663
            goto L632
        L663:
            java.lang.String r13 = "调用宿主原生作者入口，不依赖头像控件是否显示"
            goto L637
        L666:
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r31
            boolean r0 = r13.equals(r10)
            if (r0 != 0) goto L679
        L676:
            r31 = r10
            goto L5fe
        L679:
            java.lang.String r13 = "直接调用发布入口，不依赖底部发布按钮是否显示"
        L67b:
            r31 = r10
            goto L609
        L67e:
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r31
            java.lang.String r0 = "关注作者"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L691
            goto L676
        L691:
            java.lang.String r13 = "调用宿主原生关注流程，不依赖关注控件是否显示"
            goto L67b
        L694:
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r31
            java.lang.String r0 = "分享作品"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L6a7
            goto L676
        L6a7:
            java.lang.String r13 = "调用宿主原生分享入口，不依赖分享控件是否显示"
            goto L67b
        L6aa:
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            boolean r0 = r13.equals(r10)
            if (r0 != 0) goto L6c0
            r42 = r11
        L6bc:
            r11 = r33
            goto L780
        L6c0:
            java.lang.String r13 = "把当前 Feed 视频切换到此选项内滑块选择的档位"
            r42 = r11
        L6c4:
            r11 = r33
            goto L785
        L6c8:
            r42 = r11
            r15 = r32
            r11 = r34
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            boolean r0 = r13.equals(r11)
            if (r0 != 0) goto L6df
        L6dc:
            r34 = r11
            goto L6bc
        L6df:
            java.lang.String r13 = "触发 IM 一键已读"
        L6e1:
            r34 = r11
            goto L6c4
        L6e4:
            r42 = r11
            r15 = r32
            r11 = r34
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            java.lang.String r0 = "下载音频"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L6fb
            goto L6dc
        L6fb:
            java.lang.String r13 = "下载当前作品携带的音乐或音频"
            goto L6e1
        L6fe:
            r42 = r11
            r15 = r32
            r11 = r34
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            java.lang.String r0 = "下载作品"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L715
            goto L6dc
        L715:
            java.lang.String r13 = "按当前作品类型下载视频、图片或动图"
            goto L6e1
        L718:
            r42 = r11
            r11 = r30
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            boolean r0 = r13.equals(r11)
            if (r0 != 0) goto L72f
            r30 = r11
            goto L6bc
        L72f:
            java.lang.String r13 = "标记当前视频为不感兴趣，优化推荐内容"
            r30 = r11
            goto L6c4
        L734:
            r42 = r11
            r11 = r29
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            boolean r0 = r13.equals(r11)
            if (r0 != 0) goto L74c
        L748:
            r29 = r11
            goto L6bc
        L74c:
            java.lang.String r13 = "打开宿主观看历史记录页面"
        L74e:
            r29 = r11
            goto L6c4
        L752:
            r42 = r11
            r11 = r29
            r15 = r32
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            java.lang.String r0 = "打开评论区"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L769
            goto L748
        L769:
            java.lang.String r13 = "调用宿主原生评论入口，不依赖评论控件是否显示"
            goto L74e
        L76c:
            r42 = r11
            r15 = r32
            r11 = r33
            r41 = r35
            r35 = r0
            r32 = r10
            r10 = r47
            boolean r0 = r13.equals(r11)
            if (r0 != 0) goto L783
        L780:
            java.lang.String r13 = "该手势不执行任何动作"
            goto L785
        L783:
            java.lang.String r13 = "触发火花好友一键续期"
        L785:
            r9.setText(r13)
            r13 = 1093664768(0x41300000, float:11.0)
            r9.setTextSize(r13)
            int r0 = android.graphics.Color.parseColor(r19)
            r9.setTextColor(r0)
            r13 = 0
            r9.setIncludeFontPadding(r13)
            r33 = r11
            r11 = 1077936128(0x40400000, float:3.0)
            int r0 = m2690(r1, r11)
            r9.setPadding(r13, r0, r13, r13)
            r11 = 2
            r9.setMaxLines(r11)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r13 = -1
            r0.<init>(r13, r11)
            r7.addView(r6, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r13, r11)
            r7.addView(r9, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r6 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r0.<init>(r13, r11, r6)
            r4.addView(r7, r0)
            if (r35 == 0) goto L816
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            java.lang.String r6 = "当前"
            r0.setText(r6)
            r7 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r7)
            r0.setTypeface(r8)
            r8 = 17
            r0.setGravity(r8)
            r0.setIncludeFontPadding(r13)
            r9 = 1088421888(0x40e00000, float:7.0)
            int r11 = m2690(r1, r9)
            r13 = 1073741824(0x40000000, float:2.0)
            int r7 = m2690(r1, r13)
            int r9 = m2690(r1, r9)
            int r8 = m2690(r1, r13)
            r0.setPadding(r11, r7, r9, r8)
            int r7 = android.graphics.Color.parseColor(r17)
            int r8 = android.graphics.Color.parseColor(r22)
            m2691(r0, r6, r7, r8)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r6.<init>(r9, r9)
            r7 = 1090519040(0x41000000, float:8.0)
            int r8 = m2690(r1, r7)
            r6.leftMargin = r8
            r4.addView(r0, r6)
            r45 = r3
            goto L81b
        L816:
            r7 = 1090519040(0x41000000, float:8.0)
            r9 = -2
            r13 = 1073741824(0x40000000, float:2.0)
        L81b:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r0.<init>(r6, r9)
            r3.addView(r4, r0)
            boolean r0 = r2.equals(r10)
            if (r0 == 0) goto L881
            r4 = r28
            float r0 = r4.f9404     // Catch: java.lang.Throwable -> L847
            x01 r6 = p000.x01.f11964     // Catch: java.lang.Throwable -> L847
            r9 = 0
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L843
            r11 = 2131689540(0x7f0f0044, float:1.9008098E38)
            java.lang.String r6 = r6.m6478(r1, r11, r8)     // Catch: java.lang.Throwable -> L843
            r8 = r46
            fa0 r0 = m2689(r1, r8, r0, r6)     // Catch: java.lang.Throwable -> L841
            goto L851
        L841:
            r0 = move-exception
            goto L84b
        L843:
            r0 = move-exception
            r8 = r46
            goto L84b
        L847:
            r0 = move-exception
            r8 = r46
            r9 = 0
        L84b:
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L851:
            java.lang.Throwable r6 = p000.fo1.m2190(r0)
            if (r6 == 0) goto L85e
            java.lang.String r11 = "DYHelper"
            java.lang.String r7 = "加载修改倍速动作滑块失败，已降级为普通动作项"
            p000.C0888ux.m5977(r11, r7, r6)
        L85e:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L863
            r0 = 0
        L863:
            fa0 r0 = (p000.fa0) r0
            if (r0 == 0) goto L87e
            android.widget.SeekBar r6 = r0.f3838
            ga0 r7 = new ga0
            r7.<init>(r4, r0, r1)
            r6.setOnSeekBarChangeListener(r7)
            android.widget.LinearLayout r0 = r0.f3836
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -1
            r11 = -2
            r6.<init>(r7, r11)
            r3.addView(r0, r6)
            goto L888
        L87e:
            r7 = -1
        L87f:
            r11 = -2
            goto L888
        L881:
            r4 = r28
            r8 = r46
            r7 = -1
            r9 = 0
            goto L87f
        L888:
            c9 r0 = new c9
            r6 = r51
            r9 = r27
            r0.<init>(r9, r6, r2)
            r3.setOnClickListener(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r7, r11)
            r2 = 1086324736(0x40c00000, float:6.0)
            int r11 = m2690(r1, r2)
            r0.topMargin = r11
            r5.addView(r3, r0)
            r28 = r4
            r2 = r8
            r7 = r10
            r10 = r32
            r35 = r41
            r11 = r42
            r4 = r43
            r0 = r45
            r3 = 1093664768(0x41300000, float:11.0)
            r6 = 1077936128(0x40400000, float:3.0)
            r32 = r15
            goto L3c1
        L8ba:
            r45 = r0
        L8bc:
            r6 = r51
            r8 = r2
            r42 = r11
            r9 = r27
            r4 = r28
            r15 = r32
            r41 = r35
            r2 = 1086324736(0x40c00000, float:6.0)
            r13 = 1073741824(0x40000000, float:2.0)
            r32 = r10
            r10 = r7
            r7 = -1
            goto L8d5
        L8d2:
            r0 = r38
            goto L8bc
        L8d5:
            r28 = r4
            r2 = r8
            r27 = r9
            r7 = r10
            r10 = r32
            r3 = r36
            r13 = r39
            r8 = r41
            r11 = r42
            r32 = r15
            goto L2da
        L8e9:
            r38 = r0
            r9 = r27
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r1)
            r2 = r26
            android.app.AlertDialog$Builder r0 = r0.setView(r2)
            r15 = 1
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r15)
            android.app.AlertDialog r0 = r0.create()
            r9.f10912 = r0
            sa r2 = new sa
            r3 = 7
            r2.<init>(r0, r3)
            r3 = r25
            r3.setOnClickListener(r2)
            r0.show()
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L93b
            r2 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r2)
            r2 = 1055286886(0x3ee66666, float:0.45)
            r0.setDimAmount(r2)
            r11 = 2
            r0.addFlags(r11)
            android.content.res.Resources r2 = r1.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r3 = 1063675494(0x3f666666, float:0.9)
            float r2 = r2 * r3
            int r2 = (int) r2
            r4 = -2
            r0.setLayout(r2, r4)
        L93b:
            if (r38 == 0) goto L949
            vu r0 = new vu
            r2 = r24
            r4 = r38
            r0.<init>(r4, r1, r2)
            r2.post(r0)
        L949:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m2698(android.widget.Button r6, boolean r7) {
            android.content.Context r0 = r6.getContext()
            r0.getClass()
            xx r0 = p000.jx0.m3049(r0)
            java.lang.String r1 = r0.f12348
            r2 = 0
            r6.setAllCaps(r2)
            r3 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT_BOLD
            r6.setTypeface(r3)
            r6.setIncludeFontPadding(r2)
            r3 = 17
            r6.setGravity(r3)
            r4 = 4
            r6.setTextAlignment(r4)
            r5 = 1
            r6.setMaxLines(r5)
            r6.setMinWidth(r2)
            r6.setMinHeight(r2)
            r6.setMinimumWidth(r2)
            r6.setMinimumHeight(r2)
            r5 = 10
            if (r7 == 0) goto L50
            r7 = -1
            r6.setTextColor(r7)
            android.content.Context r7 = r6.getContext()
            r7.getClass()
            java.lang.String r0 = r0.f12358
            android.graphics.drawable.RippleDrawable r7 = p000.jx0.m3059(r5, r7, r1, r0)
            r6.setBackground(r7)
            goto L69
        L50:
            java.lang.String r7 = r0.f12355
            int r7 = android.graphics.Color.parseColor(r7)
            r6.setTextColor(r7)
            android.content.Context r7 = r6.getContext()
            r7.getClass()
            java.lang.String r0 = r0.f12371
            android.graphics.drawable.RippleDrawable r7 = p000.jx0.m3059(r5, r7, r1, r0)
            r6.setBackground(r7)
        L69:
            android.content.Context r7 = r6.getContext()
            r7.getClass()
            r0 = 1092616192(0x41200000, float:10.0)
            int r7 = m2690(r7, r0)
            android.content.Context r1 = r6.getContext()
            r1.getClass()
            int r0 = m2690(r1, r0)
            r6.setPadding(r7, r2, r0, r2)
            r6.setGravity(r3)
            r6.setTextAlignment(r4)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m2699(android.widget.Switch r6, p000.C1000xx r7) {
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList     // Catch: java.lang.Throwable -> L48
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r2 = new int[]{r1}     // Catch: java.lang.Throwable -> L48
            r3 = 0
            int[] r4 = new int[r3]     // Catch: java.lang.Throwable -> L48
            int[][] r2 = new int[][]{r2, r4}     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r7.f12358     // Catch: java.lang.Throwable -> L48
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = r7.f12357     // Catch: java.lang.Throwable -> L48
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Throwable -> L48
            int[] r4 = new int[]{r4, r5}     // Catch: java.lang.Throwable -> L48
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L48
            r6.setThumbTintList(r0)     // Catch: java.lang.Throwable -> L48
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList     // Catch: java.lang.Throwable -> L48
            int[] r1 = new int[]{r1}     // Catch: java.lang.Throwable -> L48
            int[] r2 = new int[r3]     // Catch: java.lang.Throwable -> L48
            int[][] r1 = new int[][]{r1, r2}     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r7.f12359     // Catch: java.lang.Throwable -> L48
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = r7.f12371     // Catch: java.lang.Throwable -> L48
            int r7 = android.graphics.Color.parseColor(r7)     // Catch: java.lang.Throwable -> L48
            int[] r7 = new int[]{r2, r7}     // Catch: java.lang.Throwable -> L48
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L48
            r6.setTrackTintList(r0)     // Catch: java.lang.Throwable -> L48
        L48:
            return
    }
}
