package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AboutActivity extends android.app.Activity {

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ int f2435 = 0;

    /* JADX INFO: renamed from: ε */
    public final p000.h22 f2436;

    public AboutActivity() {
            r2 = this;
            r2.<init>()
            η r0 = new η
            r1 = 0
            r0.<init>(r1, r2)
            h22 r1 = new h22
            r1.<init>(r0)
            r2.f2436 = r1
            return
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle r77) {
            r76 = this;
            r0 = r76
            r1 = 20
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r1 = 4
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r1 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            super.onCreate(r77)
            android.view.Window r2 = r0.getWindow()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.addFlags(r3)
            boolean r3 = r0.m1529()
            java.lang.String r4 = "#FAFAFA"
            java.lang.String r5 = "#121212"
            if (r3 == 0) goto L33
            int r3 = android.graphics.Color.parseColor(r5)
            goto L37
        L33:
            int r3 = android.graphics.Color.parseColor(r4)
        L37:
            r2.setStatusBarColor(r3)
            boolean r3 = r0.m1529()
            if (r3 != 0) goto L49
            android.view.View r2 = r2.getDecorView()
            r3 = 8192(0x2000, float:1.148E-41)
            r2.setSystemUiVisibility(r3)
        L49:
            r2 = 40
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r2 = 14
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r2 = 18
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r2 = 8
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7 = 24
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r16 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            boolean r17 = r0.m1529()
            if (r17 == 0) goto L85
            r4 = r5
        L85:
            boolean r5 = r0.m1529()
            java.lang.String r17 = "#FFFFFF"
            if (r5 == 0) goto L90
            java.lang.String r5 = "#1E1E1E"
            goto L92
        L90:
            r5 = r17
        L92:
            boolean r18 = r0.m1529()
            if (r18 == 0) goto L9b
            java.lang.String r18 = "#2A2A2A"
            goto L9d
        L9b:
            java.lang.String r18 = "#F5F5F7"
        L9d:
            boolean r19 = r0.m1529()
            java.lang.String r20 = "#1A1A2E"
            if (r19 == 0) goto Laa
            r19 = r4
            r4 = r17
            goto Lae
        Laa:
            r19 = r4
            r4 = r20
        Lae:
            boolean r21 = r0.m1529()
            if (r21 == 0) goto Lb7
            java.lang.String r21 = "#E0E0E0"
            goto Lb9
        Lb7:
            java.lang.String r21 = "#3D3D5C"
        Lb9:
            boolean r22 = r0.m1529()
            if (r22 == 0) goto Lc2
            java.lang.String r22 = "#888888"
            goto Lc4
        Lc2:
            java.lang.String r22 = "#9E9EB8"
        Lc4:
            boolean r23 = r0.m1529()
            if (r23 == 0) goto Lcd
            java.lang.String r23 = "#33FE2C55"
            goto Lcf
        Lcd:
            java.lang.String r23 = "#1AFE2C55"
        Lcf:
            boolean r24 = r0.m1529()
            if (r24 == 0) goto Ld8
            java.lang.String r24 = "#333333"
            goto Lda
        Ld8:
            java.lang.String r24 = "#E8E8ED"
        Lda:
            boolean r25 = r0.m1529()
            java.lang.String r26 = "#12000000"
            java.lang.String r27 = "#2AFFFFFF"
            if (r25 == 0) goto Le9
            r25 = r27
        Le6:
            r28 = r5
            goto Lec
        Le9:
            r25 = r26
            goto Le6
        Lec:
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r29 = r10
            r10 = r16
            r5.setOrientation(r10)
            int r10 = android.graphics.Color.parseColor(r19)
            r5.setBackgroundColor(r10)
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r30 = r9
            r9 = -1
            r10.<init>(r9, r9)
            r5.setLayoutParams(r10)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            r9 = 0
            r10.setOrientation(r9)
            r9 = 16
            r10.setGravity(r9)
            a80 r9 = r0.m1528()
            java.lang.Object r9 = r9.invoke(r3)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r31 = r1
            a80 r1 = r0.m1528()
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r32 = r13
            a80 r13 = r0.m1528()
            java.lang.Object r13 = r13.invoke(r3)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r33 = r11
            a80 r11 = r0.m1528()
            java.lang.Object r11 = r11.invoke(r2)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r10.setPadding(r9, r1, r13, r11)
            int r1 = android.graphics.Color.parseColor(r19)
            r10.setBackgroundColor(r1)
            a80 r1 = r0.m1528()
            java.lang.Object r1 = r1.invoke(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            r10.setElevation(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r11 = -1
            r1.<init>(r11, r9)
            r10.setLayoutParams(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r11 = "<  返回"
            r1.setText(r11)
            r11 = 1097859072(0x41700000, float:15.0)
            r1.setTextSize(r11)
            int r11 = android.graphics.Color.parseColor(r22)
            r1.setTextColor(r11)
            a80 r11 = r0.m1528()
            java.lang.Object r11 = r11.invoke(r15)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            a80 r13 = r0.m1528()
            java.lang.Object r13 = r13.invoke(r15)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            a80 r9 = r0.m1528()
            java.lang.Object r9 = r9.invoke(r3)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r34 = r6
            a80 r6 = r0.m1528()
            java.lang.Object r6 = r6.invoke(r15)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r1.setPadding(r11, r13, r9, r6)
            r6 = 1
            r1.setClickable(r6)
            r1.setFocusable(r6)
            ε r6 = new ε
            r9 = 1
            r6.<init>(r0, r9)
            r1.setOnClickListener(r6)
            r10.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r6.<init>(r11, r11, r9)
            r1.setLayoutParams(r6)
            r10.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r6 = "关于"
            r1.setText(r6)
            r6 = 1099431936(0x41880000, float:17.0)
            r1.setTextSize(r6)
            r11 = 0
            r6 = 1
            p000.lz1.m3699(r4, r1, r11, r6)
            r10.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r13 = 0
            r6.<init>(r13, r13, r9)
            r1.setLayoutParams(r6)
            r10.addView(r1)
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            a80 r13 = r0.m1528()
            r35 = 60
            java.lang.Integer r9 = java.lang.Integer.valueOf(r35)
            java.lang.Object r9 = r13.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            a80 r13 = r0.m1528()
            java.lang.Object r13 = r13.invoke(r8)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r6.<init>(r9, r13)
            r1.setLayoutParams(r6)
            r10.addView(r1)
            r5.addView(r10)
            android.widget.ScrollView r9 = new android.widget.ScrollView
            r9.<init>(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r1.<init>(r6, r6)
            r9.setLayoutParams(r1)
            r1 = 2
            r9.setOverScrollMode(r1)
            r13 = 0
            r9.setVerticalScrollBarEnabled(r13)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            r6 = 1
            r10.setOrientation(r6)
            a80 r1 = r0.m1528()
            java.lang.Object r1 = r1.invoke(r7)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            a80 r6 = r0.m1528()
            java.lang.Object r6 = r6.invoke(r3)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            a80 r13 = r0.m1528()
            java.lang.Object r13 = r13.invoke(r7)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            a80 r11 = r0.m1528()
            java.lang.Object r11 = r11.invoke(r12)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r10.setPadding(r1, r6, r13, r11)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r6 = 1
            r1.setOrientation(r6)
            r11 = 17
            r1.setGravity(r11)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r13 = -2
            r6.<init>(r11, r13)
            a80 r11 = r0.m1528()
            java.lang.Object r11 = r11.invoke(r15)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r6.topMargin = r11
            a80 r11 = r0.m1528()
            r13 = 32
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r11 = r11.invoke(r13)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r6.bottomMargin = r11
            r1.setLayoutParams(r6)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r11 = 17
            r6.setGravity(r11)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            r13 = 1
            r11.setShape(r13)
            java.lang.String r13 = "#FE2C55"
            r36 = r5
            int r5 = android.graphics.Color.parseColor(r13)
            r11.setColor(r5)
            r6.setBackground(r11)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            a80 r11 = r0.m1528()
            r37 = 88
            r38 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r37)
            java.lang.Object r11 = r11.invoke(r9)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r37 = r12
            a80 r12 = r0.m1528()
            java.lang.Object r9 = r12.invoke(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r5.<init>(r11, r9)
            r9 = 1
            r5.gravity = r9
            a80 r9 = r0.m1528()
            java.lang.Object r9 = r9.invoke(r14)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r5.bottomMargin = r9
            r6.setLayoutParams(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r9 = "DY"
            r5.setText(r9)
            r9 = 1107296256(0x42000000, float:32.0)
            r5.setTextSize(r9)
            r11 = -1
            r5.setTextColor(r11)
            r9 = 0
            r11 = 1
            r5.setTypeface(r9, r11)
            r11 = 17
            r5.setGravity(r11)
            r6.addView(r5)
            r1.addView(r6)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r6 = "DY Helper"
            r5.setText(r6)
            r6 = 1104150528(0x41d00000, float:26.0)
            r5.setTextSize(r6)
            int r6 = android.graphics.Color.parseColor(r4)
            r5.setTextColor(r6)
            r6 = 1
            r9 = 0
            r5.setTypeface(r9, r6)
            r11 = 17
            r5.setGravity(r11)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r9.<init>(r11, r11)
            r9.gravity = r6
            a80 r6 = r0.m1528()
            r11 = r33
            java.lang.Object r6 = r6.invoke(r11)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r9.bottomMargin = r6
            r5.setLayoutParams(r9)
            r1.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r6 = "v1.4.15"
            r5.setText(r6)
            r9 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r9)
            int r12 = android.graphics.Color.parseColor(r13)
            r5.setTextColor(r12)
            r9 = 1
            r12 = 0
            r5.setTypeface(r12, r9)
            r9 = 17
            r5.setGravity(r9)
            a80 r9 = r0.m1528()
            r12 = r32
            java.lang.Object r9 = r9.invoke(r12)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r32 = r11
            a80 r11 = r0.m1528()
            r39 = 5
            r40 = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r39)
            java.lang.Object r11 = r11.invoke(r13)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r39 = r15
            a80 r15 = r0.m1528()
            java.lang.Object r15 = r15.invoke(r12)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r41 = r12
            a80 r12 = r0.m1528()
            java.lang.Object r12 = r12.invoke(r13)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r5.setPadding(r9, r11, r15, r12)
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            int r11 = android.graphics.Color.parseColor(r23)
            r9.setColor(r11)
            a80 r11 = r0.m1528()
            java.lang.Object r11 = r11.invoke(r2)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            r9.setCornerRadius(r11)
            r5.setBackground(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r9.<init>(r11, r11)
            r11 = 1
            r9.gravity = r11
            a80 r11 = r0.m1528()
            r12 = r31
            java.lang.Object r11 = r11.invoke(r12)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r9.bottomMargin = r11
            r5.setLayoutParams(r9)
            r1.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r9 = "抖音助手"
            r5.setText(r9)
            r9 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r9)
            int r11 = android.graphics.Color.parseColor(r22)
            r5.setTextColor(r11)
            r11 = 17
            r5.setGravity(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r13 = -2
            r11.<init>(r13, r13)
            r13 = 1
            r11.gravity = r13
            r5.setLayoutParams(r11)
            r1.addView(r5)
            r10.addView(r1)
            java.lang.String r1 = "版本信息"
            android.widget.TextView r1 = r0.m1527(r1, r4)
            r10.addView(r1)
            κ r1 = new κ
            java.lang.String r5 = "应用版本"
            r1.<init>(r5, r6)
            κ r5 = new κ
            java.lang.String r6 = "目标应用"
            java.lang.String r11 = "DY:39.0Ver"
            r5.<init>(r6, r11)
            κ[] r1 = new p000.C1087[]{r1, r5}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            r5 = 13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r11 = 1
            r6.setOrientation(r11)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            int r13 = android.graphics.Color.parseColor(r28)
            r11.setColor(r13)
            a80 r13 = r0.m1528()
            java.lang.Object r13 = r13.invoke(r3)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            float r13 = (float) r13
            r11.setCornerRadius(r13)
            a80 r13 = r0.m1528()
            java.lang.Object r13 = r13.invoke(r8)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r15 = android.graphics.Color.parseColor(r24)
            r11.setStroke(r13, r15)
            r6.setBackground(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r13 = -2
            r15 = -1
            r11.<init>(r15, r13)
            a80 r13 = r0.m1528()
            java.lang.Object r13 = r13.invoke(r7)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r11.bottomMargin = r13
            r6.setLayoutParams(r11)
            java.util.Iterator r11 = r1.iterator()
            r13 = 0
        L50e:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L62d
            java.lang.Object r15 = r11.next()
            int r31 = r13 + 1
            if (r13 < 0) goto L628
            κ r15 = (p000.C1087) r15
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r0)
            r43 = r1
            r1 = 0
            r9.setOrientation(r1)
            r1 = 16
            r9.setGravity(r1)
            a80 r1 = r0.m1528()
            java.lang.Object r1 = r1.invoke(r14)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r44 = r2
            a80 r2 = r0.m1528()
            java.lang.Object r2 = r2.invoke(r5)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r45 = r11
            a80 r11 = r0.m1528()
            java.lang.Object r11 = r11.invoke(r14)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r46 = r12
            a80 r12 = r0.m1528()
            java.lang.Object r12 = r12.invoke(r5)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r9.setPadding(r1, r2, r11, r12)
            r11 = 1
            r9.setClickable(r11)
            r9.setFocusable(r11)
            ζ r1 = new ζ
            r2 = 0
            r1.<init>(r0, r2, r15)
            r9.setOnLongClickListener(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r2 = r15.f13403
            r1.setText(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r2)
            int r2 = android.graphics.Color.parseColor(r4)
            r1.setTextColor(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r47 = r5
            r5 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r2.<init>(r12, r5, r11)
            r1.setLayoutParams(r2)
            r9.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r2 = r15.f13404
            r1.setText(r2)
            r2 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r2)
            int r2 = android.graphics.Color.parseColor(r21)
            r1.setTextColor(r2)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1.setGravity(r2)
            r9.addView(r1)
            r6.addView(r9)
            int r1 = r43.size()
            r16 = 1
            int r1 = r1 + (-1)
            if (r13 >= r1) goto L618
            android.view.View r1 = new android.view.View
            r1.<init>(r0)
            int r2 = android.graphics.Color.parseColor(r25)
            r1.setBackgroundColor(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r11 = -1
            r2.<init>(r11, r5)
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r14)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r2.leftMargin = r5
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r14)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r2.rightMargin = r5
            r1.setLayoutParams(r2)
            r6.addView(r1)
        L618:
            r13 = r31
            r1 = r43
            r2 = r44
            r11 = r45
            r12 = r46
            r5 = r47
            r9 = 1096810496(0x41600000, float:14.0)
            goto L50e
        L628:
            p000.AbstractC1021yh.m6917()
            r9 = 0
            throw r9
        L62d:
            r44 = r2
            r46 = r12
            r10.addView(r6)
            java.lang.String r1 = "开发者"
            android.widget.TextView r1 = r0.m1527(r1, r4)
            r10.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r6 = 1
            r1.setOrientation(r6)
            a80 r2 = r0.m1528()
            r9 = r30
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r9)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            a80 r6 = r0.m1528()
            java.lang.Object r6 = r6.invoke(r9)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            a80 r11 = r0.m1528()
            java.lang.Object r11 = r11.invoke(r9)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r1.setPadding(r2, r5, r6, r11)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r5 = android.graphics.Color.parseColor(r28)
            r2.setColor(r5)
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r3)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            r2.setCornerRadius(r5)
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r6 = android.graphics.Color.parseColor(r24)
            r2.setStroke(r5, r6)
            r1.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r13 = -2
            r2.<init>(r11, r13)
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r2.bottomMargin = r5
            r1.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r13 = 0
            r2.setOrientation(r13)
            r5 = 16
            r2.setGravity(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r13 = -2
            r5.<init>(r11, r13)
            a80 r6 = r0.m1528()
            java.lang.Object r6 = r6.invoke(r3)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r5.bottomMargin = r6
            r2.setLayoutParams(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r11 = 17
            r5.setGravity(r11)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r11 = 1
            r6.setShape(r11)
            int r11 = android.graphics.Color.parseColor(r23)
            r6.setColor(r11)
            r5.setBackground(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            a80 r11 = r0.m1528()
            r12 = 52
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r11.invoke(r12)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            a80 r13 = r0.m1528()
            java.lang.Object r12 = r13.invoke(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r6.<init>(r11, r12)
            a80 r11 = r0.m1528()
            r12 = r41
            java.lang.Object r11 = r11.invoke(r12)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r6.rightMargin = r11
            r5.setLayoutParams(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r11 = "MF"
            r6.setText(r11)
            r13 = 1099956224(0x41900000, float:18.0)
            r6.setTextSize(r13)
            int r15 = android.graphics.Color.parseColor(r40)
            r6.setTextColor(r15)
            r13 = 1
            r15 = 0
            r6.setTypeface(r15, r13)
            r15 = 17
            r6.setGravity(r15)
            r5.addView(r6)
            r2.addView(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r0)
            r5.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r30 = r3
            r3 = -2
            r13 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13, r3, r15)
            r5.setLayoutParams(r6)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            r3.setText(r11)
            r6 = 1099956224(0x41900000, float:18.0)
            r3.setTextSize(r6)
            r6 = 1
            r15 = 0
            p000.lz1.m3699(r4, r3, r15, r6)
            r5.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            java.lang.String r6 = "独立开发者"
            r3.setText(r6)
            r11 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r11)
            int r6 = android.graphics.Color.parseColor(r22)
            r3.setTextColor(r6)
            a80 r6 = r0.m1528()
            r13 = r34
            java.lang.Object r6 = r6.invoke(r13)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r15 = 0
            r3.setPadding(r15, r6, r15, r15)
            r5.addView(r3)
            r2.addView(r5)
            r1.addView(r2)
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            boolean r3 = r0.m1529()
            if (r3 == 0) goto L7e6
            r3 = r27
            goto L7e8
        L7e6:
            r3 = r26
        L7e8:
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r15 = -1
            r3.<init>(r15, r5)
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r12)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r3.bottomMargin = r5
            r2.setLayoutParams(r3)
            r1.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "DY Helper 由 MF 独立开发与维护。\n本项目仅供学习交流使用,不提供任何商业服务。"
            r2.setText(r3)
            r3 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r21)
            r2.setTextColor(r3)
            a80 r3 = r0.m1528()
            r15 = r29
            java.lang.Object r3 = r3.invoke(r15)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r5)
            r1.addView(r2)
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            boolean r3 = r0.m1529()
            if (r3 == 0) goto L856
            r3 = r27
            goto L858
        L856:
            r3 = r26
        L858:
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = -1
            r3.<init>(r6, r5)
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r12)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r3.topMargin = r5
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r12)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r3.bottomMargin = r5
            r2.setLayoutParams(r3)
            r1.addView(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r3 = 0
            r2.setOrientation(r3)
            r5 = 16
            r2.setGravity(r5)
            r6 = 1
            r2.setClickable(r6)
            r2.setFocusable(r6)
            a80 r3 = r0.m1528()
            java.lang.Object r3 = r3.invoke(r15)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            a80 r6 = r0.m1528()
            r11 = r39
            java.lang.Object r6 = r6.invoke(r11)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r15)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r29 = r7
            a80 r7 = r0.m1528()
            java.lang.Object r7 = r7.invoke(r11)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2.setPadding(r3, r6, r5, r7)
            ε r3 = new ε
            r5 = 0
            r3.<init>(r0, r5)
            r2.setOnClickListener(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            java.lang.String r5 = "✈️"
            r3.setText(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r5)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            a80 r7 = r0.m1528()
            r5 = r46
            java.lang.Object r5 = r7.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6.rightMargin = r5
            r3.setLayoutParams(r6)
            r2.addView(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r6 = 1
            r3.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r34 = r8
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = -2
            r5.<init>(r6, r8, r7)
            r3.setLayoutParams(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r6 = "Telegram 频道"
            r5.setText(r6)
            r6 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r6)
            r8 = r40
            r6 = 0
            r7 = 1
            p000.lz1.m3699(r8, r5, r6, r7)
            r3.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r6 = "@MFDYHelper"
            r5.setText(r6)
            r6 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r6)
            int r6 = android.graphics.Color.parseColor(r22)
            r5.setTextColor(r6)
            a80 r6 = r0.m1528()
            java.lang.Object r6 = r6.invoke(r13)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r7 = 0
            r5.setPadding(r7, r6, r7, r7)
            r3.addView(r5)
            r2.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            java.lang.String r5 = "→"
            r3.setText(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r5)
            int r6 = android.graphics.Color.parseColor(r22)
            r3.setTextColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r3.setLayoutParams(r6)
            r2.addView(r3)
            r1.addView(r2)
            r10.addView(r1)
            java.lang.String r1 = "公开功能"
            android.widget.TextView r1 = r0.m1527(r1, r4)
            r10.addView(r1)
            ι r1 = new ι
            java.lang.String r2 = "激活菜单"
            java.lang.String r3 = "浮窗按钮、手势、音量键组合和分享面板快捷入口。"
            java.lang.String r6 = "视频"
            r1.<init>(r6, r2, r3)
            ι r2 = new ι
            java.lang.String r3 = "视频流过滤"
            java.lang.String r7 = "过滤广告、直播、图文、关键词、UID、时长和低点赞内容。"
            r2.<init>(r6, r3, r7)
            ι r3 = new ι
            java.lang.String r7 = "时长提醒"
            java.lang.String r5 = "连续使用提醒休息，支持重复提醒、振动和自定义文案。"
            r3.<init>(r6, r7, r5)
            ι r5 = new ι
            java.lang.String r7 = "屏蔽抖音官方时长提醒弹窗"
            java.lang.String r0 = "拦截抖音官方使用时长或防沉迷类弹窗。"
            r5.<init>(r6, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "长视频提醒"
            r45 = r1
            java.lang.String r1 = "视频超过设定阈值时主动提示。"
            r0.<init>(r6, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "自动下滑"
            r49 = r0
            java.lang.String r0 = "播放完成后自动切换下一个作品，可设置延迟。"
            r1.<init>(r6, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "播放完成自动暂停"
            r50 = r1
            java.lang.String r1 = "播放完毕后自动暂停，避免循环播放。"
            r0.<init>(r6, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "进度条时间显示"
            r51 = r0
            java.lang.String r0 = "显示当前进度和总时长，可调字体、颜色与透明度。"
            r1.<init>(r6, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "视频倍速扩展"
            r52 = r1
            java.lang.String r1 = "扩展抖音播放器可选倍速范围。"
            r0.<init>(r6, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "Feed流预加载控制"
            r53 = r0
            java.lang.String r0 = "控制预加载开关、数量和清晰度。"
            r1.<init>(r6, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "直播间精确人数显示"
            r54 = r1
            java.lang.String r1 = "将直播间模糊人数显示为更具体的数字。"
            r0.<init>(r6, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "评论区控件管理"
            r55 = r0
            java.lang.String r0 = "隐藏评论头像、昵称、内容、回复、时间、点赞、踩和发布地点等控件。"
            r39 = r13
            java.lang.String r13 = "评论"
            r1.<init>(r13, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "评论发布作品控件"
            r56 = r1
            java.lang.String r1 = "隐藏评论键盘中的同时发布作品入口及相关预览控件。"
            r0.<init>(r13, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "评论区样式"
            r57 = r0
            java.lang.String r0 = "自定义作者昵称、评论内容、时间、IP属地、回复按钮等颜色。"
            r1.<init>(r13, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "评论区背景"
            r58 = r1
            java.lang.String r1 = "支持纯色或自定义图片背景，并可调透明度。"
            r0.<init>(r13, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "评论精确时间"
            r59 = r0
            java.lang.String r0 = "将相对时间替换为精确时间，支持格式配置。"
            r1.<init>(r13, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "评论区图片无水印下载"
            r60 = r1
            java.lang.String r1 = "拦截评论区带水印图片并替换为无水印原图链接。"
            r0.<init>(r13, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "沉浸式状态栏"
            r61 = r0
            java.lang.String r0 = "隐藏系统状态栏，也可配合导航栏隐藏。"
            r40 = r15
            java.lang.String r15 = "外观"
            r1.<init>(r15, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "个人主页增强"
            r62 = r1
            java.lang.String r1 = "在个人主页展示 UID，并提供书签入口。"
            r0.<init>(r15, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "视频信息条"
            r63 = r0
            java.lang.String r0 = "在视频描述附近显示发布时间、位置等信息。"
            r1.<init>(r15, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "顶部通知管理器"
            r64 = r1
            java.lang.String r1 = "管理下载进度、火花续期等顶部通知样式和透明度。"
            r41 = r9
            java.lang.String r9 = "工具"
            r0.<init>(r9, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "下载设置"
            r65 = r0
            java.lang.String r0 = "配置媒体保存目录、命名规则、下载通知和路径模板。"
            r1.<init>(r9, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "版本更新"
            r66 = r1
            java.lang.String r1 = "检查新版、下载更新并支持跳过指定版本。"
            r0.<init>(r9, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "章节广告跳过"
            r67 = r0
            java.lang.String r0 = "跳过章节广告、跳过等待并记录统计。"
            r1.<init>(r9, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "缓存管理"
            r68 = r1
            java.lang.String r1 = "管理 DexKit 缓存、DyLog 日志和用户配置清理。"
            r0.<init>(r9, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "私信防撤回"
            r69 = r0
            java.lang.String r0 = "保留被撤回的私信消息内容和撤回标记。"
            r46 = r2
            java.lang.String r2 = "私信"
            r1.<init>(r2, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "聊天时间标签"
            r70 = r1
            java.lang.String r1 = "在私信消息下方显示精确发送时间。"
            r0.<init>(r2, r7, r1)
            ι r1 = new ι
            java.lang.String r7 = "聊天状态隐私"
            r71 = r0
            java.lang.String r0 = "关闭已读回执、正在输入和录音状态上报。"
            r1.<init>(r2, r7, r0)
            ι r0 = new ι
            java.lang.String r7 = "聊天自动已读"
            r72 = r1
            java.lang.String r1 = "按规则和间隔自动标记私信已读，支持名单控制。"
            r0.<init>(r2, r7, r1)
            r73 = r0
            r47 = r3
            r48 = r5
            ι[] r0 = new p000.C1086[]{r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r0)
            boolean r0 = r76.m1529()
            if (r0 == 0) goto Lb14
            java.lang.String r0 = "#263D2B"
        Lb11:
            r7 = r0
            r0 = r6
            goto Lb17
        Lb14:
            java.lang.String r0 = "#EAF7EE"
            goto Lb11
        Lb17:
            java.lang.String r6 = "#34C759"
            r42 = r11
            r16 = r12
            r5 = r21
            r3 = r24
            r2 = r28
            r74 = r34
            r75 = r36
            r34 = r39
            r11 = 1
            r12 = r0
            r21 = r8
            r8 = r25
            r0 = r76
            android.widget.LinearLayout r1 = r0.m1526(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.addView(r1)
            java.lang.String r1 = "内测功能"
            android.widget.TextView r1 = r0.m1527(r1, r4)
            r10.addView(r1)
            ι r1 = new ι
            java.lang.String r6 = "底栏Tab过滤"
            java.lang.String r7 = "隐藏朋友、发布、消息、我的、探索、商城、同城等底栏入口。"
            r1.<init>(r12, r6, r7)
            ι r6 = new ι
            java.lang.String r7 = "顶栏Tab过滤"
            java.lang.String r11 = "扫描首页顶部频道，可隐藏指定频道、居中对齐或跳过隐藏页面。"
            r6.<init>(r12, r7, r11)
            ι r7 = new ι
            java.lang.String r11 = "视频章节广告跳过"
            java.lang.String r0 = "识别章节进度条中的广告或营销片段并尝试跳过。"
            r7.<init>(r12, r11, r0)
            ι r0 = new ι
            java.lang.String r11 = "右侧不感兴趣按钮"
            r45 = r1
            java.lang.String r1 = "在 Feed 右侧操作栏增加快速不感兴趣按钮。"
            r0.<init>(r12, r11, r1)
            ι r1 = new ι
            java.lang.String r11 = "语音替换"
            java.lang.String r12 = "选择 MP3 替换评论语音或私信语音录音。"
            r1.<init>(r13, r11, r12)
            ι r11 = new ι
            java.lang.String r12 = "评论书签"
            r48 = r0
            java.lang.String r0 = "管理书签评论，支持自动扫描新回复和主动查询。"
            r11.<init>(r13, r12, r0)
            ι r0 = new ι
            java.lang.String r12 = "清爽模式"
            java.lang.String r13 = "调节播放页右侧、底部、顶栏、杂项栏和进度条透明度，并支持底栏隐藏。"
            r0.<init>(r15, r12, r13)
            ι r12 = new ι
            java.lang.String r13 = "空闲退出"
            java.lang.String r15 = "超过设定时间无操作后自动退出抖音，可倒计时提示或锁屏。"
            r12.<init>(r9, r13, r15)
            ι r13 = new ι
            java.lang.String r15 = "火花续期"
            r51 = r0
            java.lang.String r0 = "自动或自定义续火，支持续期文案、群聊、伪装火花天数和顶部通知。"
            r13.<init>(r9, r15, r0)
            r49 = r1
            r46 = r6
            r47 = r7
            r50 = r11
            r52 = r12
            r53 = r13
            ι[] r0 = new p000.C1086[]{r45, r46, r47, r48, r49, r50, r51, r52, r53}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r0)
            boolean r0 = r76.m1529()
            if (r0 == 0) goto Lbb6
            java.lang.String r0 = "#30244F"
        Lbb4:
            r7 = r0
            goto Lbb9
        Lbb6:
            java.lang.String r0 = "#EFE9FF"
            goto Lbb4
        Lbb9:
            java.lang.String r6 = "#7C4DFF"
            r0 = r76
            android.widget.LinearLayout r1 = r0.m1526(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.addView(r1)
            java.lang.String r1 = "免责声明"
            android.widget.TextView r1 = r0.m1527(r1, r4)
            r10.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r6 = 1
            r1.setOrientation(r6)
            a80 r2 = r0.m1528()
            java.lang.Object r2 = r2.invoke(r14)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            a80 r3 = r0.m1528()
            r6 = r30
            java.lang.Object r3 = r3.invoke(r6)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            a80 r7 = r0.m1528()
            java.lang.Object r7 = r7.invoke(r14)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.setPadding(r2, r3, r7, r8)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r3 = android.graphics.Color.parseColor(r18)
            r2.setColor(r3)
            a80 r3 = r0.m1528()
            r12 = r16
            java.lang.Object r3 = r3.invoke(r12)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            r1.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r13 = -2
            r2.<init>(r11, r13)
            a80 r3 = r0.m1528()
            r7 = r29
            java.lang.Object r3 = r3.invoke(r7)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.bottomMargin = r3
            r1.setLayoutParams(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "1. 本模块仅供个人学习和研究 Xposed 框架开发技术使用。\n\n2. 请勿将下载的内容用于任何商业用途，尊重原创作者的知识产权。\n\n3. 使用本模块所产生的一切后果由使用者自行承担，开发者不承担任何责任。\n\n4. 如有侵权请联系开发者，将及时处理。\n\n5. 本模块不收集任何用户数据，所有操作均在本地完成。"
            r2.setText(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r5)
            r2.setTextColor(r3)
            a80 r3 = r0.m1528()
            r13 = r34
            java.lang.Object r3 = r3.invoke(r13)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r15 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r15)
            r1.addView(r2)
            r10.addView(r1)
            java.lang.String r1 = "技术说明"
            android.widget.TextView r1 = r0.m1527(r1, r4)
            r10.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r11 = 1
            r1.setOrientation(r11)
            a80 r2 = r0.m1528()
            java.lang.Object r2 = r2.invoke(r14)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            a80 r3 = r0.m1528()
            java.lang.Object r3 = r3.invoke(r6)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            a80 r4 = r0.m1528()
            java.lang.Object r4 = r4.invoke(r14)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.setPadding(r2, r3, r4, r8)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r3 = android.graphics.Color.parseColor(r18)
            r2.setColor(r3)
            a80 r3 = r0.m1528()
            java.lang.Object r3 = r3.invoke(r12)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            r1.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r15 = -1
            r2.<init>(r15, r11)
            a80 r3 = r0.m1528()
            java.lang.Object r3 = r3.invoke(r7)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.bottomMargin = r3
            r1.setLayoutParams(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "本模块使用 DexKit 进行高效的类和方法定位，确保在不同版本抖音中的兼容性。"
            r2.setText(r3)
            r3 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r5)
            r2.setTextColor(r3)
            a80 r3 = r0.m1528()
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.invoke(r4)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r15 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r3, r15)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r15 = -1
            r3.<init>(r15, r11)
            a80 r4 = r0.m1528()
            r5 = r44
            java.lang.Object r4 = r4.invoke(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.bottomMargin = r4
            r2.setLayoutParams(r3)
            r1.addView(r2)
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            boolean r3 = r0.m1529()
            if (r3 == 0) goto Ld68
            r3 = r27
            goto Ld6a
        Ld68:
            r3 = r26
        Ld6a:
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setBackgroundColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            a80 r4 = r0.m1528()
            r8 = r74
            java.lang.Object r4 = r4.invoke(r8)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r11 = -1
            r3.<init>(r11, r4)
            a80 r4 = r0.m1528()
            java.lang.Object r4 = r4.invoke(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.bottomMargin = r4
            r2.setLayoutParams(r3)
            r1.addView(r2)
            l91 r2 = new l91
            java.lang.String r3 = "DexKit"
            java.lang.String r4 = "高性能的 DEX 文件分析库，用于快速定位混淆后的类和方法"
            r2.<init>(r3, r4)
            l91 r3 = new l91
            java.lang.String r4 = "多账号支持"
            java.lang.String r9 = "独立的配置存储系统，支持多账号切换和配置隔离"
            r3.<init>(r4, r9)
            l91[] r2 = new p000.l91[]{r2, r3}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.Iterator r3 = r2.iterator()
            r11 = 0
        Ldbc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lf2e
            java.lang.Object r4 = r3.next()
            int r9 = r11 + 1
            if (r11 < 0) goto Lf29
            l91 r4 = (p000.l91) r4
            java.lang.Object r12 = r4.f6502
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r4 = r4.f6503
            java.lang.String r4 = (java.lang.String) r4
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r0)
            r15 = 0
            r14.setOrientation(r15)
            r15 = 16
            r14.setGravity(r15)
            a80 r15 = r0.m1528()
            r16 = r2
            r2 = r32
            java.lang.Object r15 = r15.invoke(r2)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r18 = r3
            a80 r3 = r0.m1528()
            java.lang.Object r3 = r3.invoke(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r24 = r9
            r9 = 0
            r14.setPadding(r9, r15, r9, r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            java.lang.String r9 = "•"
            r3.setText(r9)
            r9 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r9)
            int r15 = android.graphics.Color.parseColor(r21)
            r3.setTextColor(r15)
            r9 = 1
            r15 = 0
            r3.setTypeface(r15, r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            r9.<init>(r15, r15)
            a80 r15 = r0.m1528()
            r30 = r6
            r6 = r42
            java.lang.Object r15 = r15.invoke(r6)
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r9.rightMargin = r15
            r3.setLayoutParams(r9)
            r14.addView(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            r9 = 1
            r3.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r44 = r5
            r39 = r6
            r5 = -2
            r6 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r6, r5, r15)
            r3.setLayoutParams(r9)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            r5.setText(r12)
            r6 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r6)
            boolean r9 = r0.m1529()
            if (r9 == 0) goto Le76
            r9 = r17
        Le73:
            r6 = 1
            r12 = 0
            goto Le79
        Le76:
            r9 = r20
            goto Le73
        Le79:
            p000.lz1.m3699(r9, r5, r12, r6)
            r3.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            r5.setText(r4)
            r6 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r6)
            int r4 = android.graphics.Color.parseColor(r22)
            r5.setTextColor(r4)
            a80 r4 = r0.m1528()
            java.lang.Object r4 = r4.invoke(r13)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r6 = 0
            r5.setPadding(r6, r4, r6, r6)
            r3.addView(r5)
            r14.addView(r3)
            r1.addView(r14)
            int r3 = r16.size()
            r6 = 1
            int r3 = r3 - r6
            if (r11 >= r3) goto Lf18
            android.view.View r3 = new android.view.View
            r3.<init>(r0)
            boolean r4 = r0.m1529()
            if (r4 == 0) goto Lec4
            r4 = r27
            goto Lec6
        Lec4:
            r4 = r26
        Lec6:
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setBackgroundColor(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r11 = -1
            r4.<init>(r11, r5)
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4.leftMargin = r5
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4.topMargin = r5
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r4.bottomMargin = r5
            r3.setLayoutParams(r4)
            r1.addView(r3)
            goto Lf19
        Lf18:
            r11 = -1
        Lf19:
            r32 = r2
            r2 = r16
            r3 = r18
            r11 = r24
            r6 = r30
            r42 = r39
            r5 = r44
            goto Ldbc
        Lf29:
            p000.AbstractC1021yh.m6917()
            r15 = 0
            throw r15
        Lf2e:
            r44 = r5
            r30 = r6
            r10.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r6 = 1
            r1.setOrientation(r6)
            r11 = 17
            r1.setGravity(r11)
            a80 r2 = r0.m1528()
            java.lang.Object r2 = r2.invoke(r5)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            a80 r3 = r0.m1528()
            r9 = r41
            java.lang.Object r3 = r3.invoke(r9)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r13 = 0
            r1.setPadding(r13, r2, r13, r3)
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            int r3 = android.graphics.Color.parseColor(r22)
            r2.setBackgroundColor(r3)
            r3 = 1050253722(0x3e99999a, float:0.3)
            r2.setAlpha(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            a80 r4 = r0.m1528()
            r5 = r37
            java.lang.Object r4 = r4.invoke(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r3.<init>(r4, r5)
            r6 = 1
            r3.gravity = r6
            a80 r4 = r0.m1528()
            r6 = r30
            java.lang.Object r4 = r4.invoke(r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.bottomMargin = r4
            r2.setLayoutParams(r3)
            r1.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "DY Helper v1.4.15"
            r2.setText(r3)
            r6 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r6)
            int r3 = android.graphics.Color.parseColor(r22)
            r2.setTextColor(r3)
            r11 = 17
            r2.setGravity(r11)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r13 = -2
            r3.<init>(r13, r13)
            r6 = 1
            r3.gravity = r6
            a80 r4 = r0.m1528()
            r15 = r40
            java.lang.Object r4 = r4.invoke(r15)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.bottomMargin = r4
            r2.setLayoutParams(r3)
            r1.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            java.lang.String r3 = "Made with code by MF"
            r2.setText(r3)
            r3 = 1093664768(0x41300000, float:11.0)
            r2.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r22)
            r2.setTextColor(r3)
            r11 = 17
            r2.setGravity(r11)
            r3 = 1060320051(0x3f333333, float:0.7)
            r2.setAlpha(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r13 = -2
            r3.<init>(r13, r13)
            r6 = 1
            r3.gravity = r6
            r2.setLayoutParams(r3)
            r1.addView(r2)
            r10.addView(r1)
            r1 = r38
            r1.addView(r10)
            r2 = r75
            r2.addView(r1)
            r0.setContentView(r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.widget.LinearLayout m1526(java.util.List r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
            r19 = this;
            r0 = r19
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r0)
            r5 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.setOrientation(r5)
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            int r8 = android.graphics.Color.parseColor(r21)
            r7.setColor(r8)
            a80 r8 = r0.m1528()
            r9 = 16
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.invoke(r10)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            r7.setCornerRadius(r8)
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r11 = android.graphics.Color.parseColor(r22)
            r7.setStroke(r8, r11)
            r4.setBackground(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r11 = -2
            r7.<init>(r8, r11)
            a80 r12 = r0.m1528()
            r13 = 24
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r12 = r12.invoke(r13)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r7.bottomMargin = r12
            r4.setLayoutParams(r7)
            java.util.Iterator r7 = r20.iterator()
            r12 = 0
            r13 = r12
        L82:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L278
            java.lang.Object r14 = r7.next()
            int r15 = r13 + 1
            if (r13 < 0) goto L272
            ι r14 = (p000.C1086) r14
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r11.<init>(r0)
            r11.setOrientation(r12)
            r11.setGravity(r9)
            a80 r9 = r0.m1528()
            java.lang.Object r9 = r9.invoke(r10)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            a80 r12 = r0.m1528()
            java.lang.Object r12 = r12.invoke(r3)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            a80 r5 = r0.m1528()
            java.lang.Object r5 = r5.invoke(r10)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r3)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r11.setPadding(r9, r12, r5, r8)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r8 = r14.f13400
            r5.setText(r8)
            r8 = 1093664768(0x41300000, float:11.0)
            r5.setTextSize(r8)
            int r8 = android.graphics.Color.parseColor(r25)
            r5.setTextColor(r8)
            r8 = 0
            r9 = 1
            r5.setTypeface(r8, r9)
            r8 = 17
            r5.setGravity(r8)
            a80 r8 = r0.m1528()
            r9 = 42
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.invoke(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5.setMinWidth(r8)
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            a80 r9 = r0.m1528()
            java.lang.Object r9 = r9.invoke(r1)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            a80 r12 = r0.m1528()
            java.lang.Object r12 = r12.invoke(r2)
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            r18 = r2
            a80 r2 = r0.m1528()
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r5.setPadding(r8, r9, r12, r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r8 = android.graphics.Color.parseColor(r26)
            r2.setColor(r8)
            a80 r8 = r0.m1528()
            r9 = 10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.invoke(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            float r8 = (float) r8
            r2.setCornerRadius(r8)
            r5.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r2.<init>(r8, r8)
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r3)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r2.rightMargin = r8
            r5.setLayoutParams(r2)
            r11.addView(r5)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r9 = 1
            r2.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -2
            r12 = 0
            r5.<init>(r12, r9, r8)
            r2.setLayoutParams(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r12 = r14.f13401
            r5.setText(r12)
            r12 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r12)
            int r12 = android.graphics.Color.parseColor(r23)
            r5.setTextColor(r12)
            r9 = 1
            r12 = 0
            r5.setTypeface(r12, r9)
            r2.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r9 = r14.f13402
            r5.setText(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r9)
            int r9 = android.graphics.Color.parseColor(r24)
            r5.setTextColor(r9)
            a80 r9 = r0.m1528()
            r12 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r9 = r9.invoke(r12)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r12 = 0
            r5.setPadding(r12, r9, r12, r12)
            a80 r9 = r0.m1528()
            r14 = 2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r9 = r9.invoke(r14)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            r5.setLineSpacing(r9, r8)
            r2.addView(r5)
            r11.addView(r2)
            r4.addView(r11)
            int r2 = r20.size()
            r16 = 1
            int r2 = r2 + (-1)
            if (r13 >= r2) goto L266
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            int r5 = android.graphics.Color.parseColor(r27)
            r2.setBackgroundColor(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r6)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r9 = -1
            r5.<init>(r9, r8)
            a80 r8 = r0.m1528()
            r11 = 70
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r8 = r8.invoke(r11)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5.leftMargin = r8
            a80 r8 = r0.m1528()
            java.lang.Object r8 = r8.invoke(r10)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5.rightMargin = r8
            r2.setLayoutParams(r5)
            r4.addView(r2)
            goto L267
        L266:
            r9 = -1
        L267:
            r8 = r9
            r13 = r15
            r5 = r16
            r2 = r18
            r9 = 16
            r11 = -2
            goto L82
        L272:
            p000.AbstractC1021yh.m6917()
            r17 = 0
            throw r17
        L278:
            return r4
    }

    /* JADX INFO: renamed from: β */
    public final android.widget.TextView m1527(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r2)
            r0.setText(r3)
            r3 = 1098907648(0x41800000, float:16.0)
            r0.setTextSize(r3)
            int r3 = android.graphics.Color.parseColor(r4)
            r0.setTextColor(r3)
            r3 = 0
            r4 = 1
            r0.setTypeface(r3, r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1 = -2
            r3.<init>(r4, r1)
            a80 r2 = r2.m1528()
            r4 = 12
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.invoke(r4)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3.bottomMargin = r2
            r0.setLayoutParams(r3)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final p000.a80 m1528() {
            r0 = this;
            h22 r0 = r0.f2436
            java.lang.Object r0 = r0.getValue()
            a80 r0 = (p000.a80) r0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m1529() {
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
