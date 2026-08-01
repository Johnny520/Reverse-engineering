package defpackage;

/* JADX INFO: renamed from: ᛶᛴᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1061 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f4696;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f4697;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4698;

    public /* synthetic */ C1061(android.content.Context r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f4698 = r3
            r0.f4697 = r1
            r0.f4696 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r34) {
            r33 = this;
            r0 = r33
            int r1 = r0.f4698
            ᲁᲀᛱᲁ r2 = defpackage.C1907.f8270
            java.lang.String r3 = r0.f4696
            android.content.Context r0 = r0.f4697
            r4 = 0
            switch(r1) {
                case 0: goto L23;
                default: goto Le;
            }
        Le:
            r1 = r34
            ᛸᲀᛸᛴ r1 = (defpackage.C1561) r1
            r5 = -541243473305134(0xfffe13bdef0961d2, double:NaN)
            ᛶᛴᛸᛷ r5 = new ᛶᛴᛸᛷ
            r5.<init>(r0, r3, r4)
            r1.m2828(r5)
            return r2
        L23:
            r1 = r34
            ᲀᲀᛵᛸ r1 = (defpackage.C1741) r1
            r5 = -540856926248494(0xfffe1417ef0961d2, double:NaN)
            java.lang.Object r1 = r1.f7705
            r5 = -540908465856046(0xfffe140bef0961d2, double:NaN)
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r5 = r0.getPackageName()
            r6 = -541157573959214(0xfffe13d1ef0961d2, double:NaN)
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L53
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L57
        L53:
            r30 = r2
            goto L724
        L57:
            ᲀᛶᲇ r6 = defpackage.C1698.f7558
            java.util.LinkedHashMap r0 = defpackage.AbstractC1636.f7321     // Catch: java.lang.Exception -> L82
            r7 = -540650767818286(0xfffe1447ef0961d2, double:NaN)
            java.lang.String r0 = "dex/adaptation_list"     // Catch: java.lang.Exception -> L82
            java.lang.String r0 = defpackage.AbstractC1636.m3012(r0)     // Catch: java.lang.Exception -> L82
            if (r0 != 0) goto L6b
            goto La4
        L6b:
            ᛲᲀᛳᛱ r7 = new ᛲᲀᛳᛱ     // Catch: java.lang.Exception -> L82
            r7.<init>()     // Catch: java.lang.Exception -> L82
            java.lang.reflect.Type r7 = r7.f8477     // Catch: java.lang.Exception -> L82
            ᲁᲇᲀᛸ r8 = new ᲁᲇᲀᛸ     // Catch: java.lang.Exception -> L82
            r8.<init>()     // Catch: java.lang.Exception -> L82
            java.lang.Object r0 = r8.m3369(r0, r7)     // Catch: java.lang.Exception -> L82
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L82
            if (r0 != 0) goto L80
            goto La4
        L80:
            r6 = r0
            goto La4
        L82:
            r0 = move-exception
            r7 = -540736667164206(0xfffe1433ef0961d2, double:NaN)
            java.lang.String r7 = "load adapted versions error"
            r8 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r8 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r8 = defpackage.C0346.f1773
            r8.getClass()
            defpackage.C0346.m1038(r7, r0)
        La4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lad:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc8
            java.lang.Object r7 = r6.next()
            r8 = r7
            ᛱᛳᛸᛴ r8 = (defpackage.C0058) r8
            java.lang.String r8 = r8.m468()
            boolean r8 = defpackage.AbstractC0498.m1280(r8, r5)
            if (r8 == 0) goto Lad
            r0.add(r7)
            goto Lad
        Lc8:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = defpackage.AbstractC0575.m1369(r0)
            r5.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        Ld5:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Le9
            java.lang.Object r6 = r0.next()
            ᛱᛳᛸᛴ r6 = (defpackage.C0058) r6
            java.lang.String r6 = r6.m469()
            r5.add(r6)
            goto Ld5
        Le9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r5)
            java.util.List r0 = defpackage.AbstractC1107.m2113(r0)
            ᛱᛴᛷᛷ r5 = defpackage.C0081.f818
            java.util.List r0 = defpackage.AbstractC1107.m2116(r0, r5)
            ᛸᛱᛴᲁ r5 = new ᛸᛱᛴᲁ
            r5.<init>()
            ᛲᲀᛱᲁ r6 = defpackage.C0346.f1773
            r6.getClass()
            java.lang.String r6 = defpackage.C0346.m1041(r1)
            ᛲᲀ r7 = new ᛲᲀ
            r7.<init>(r4, r5)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r1)
            r8 = 1
            r9.setOrientation(r8)
            r10 = -539615680699950(0xfffe1538ef0961d2, double:NaN)
            java.lang.String r10 = "#FFFFFF"
            int r10 = android.graphics.Color.parseColor(r10)
            r11 = 20
            int r12 = defpackage.AbstractC2093.m3510(r11)
            float r12 = (float) r12
            r14 = 0
            android.graphics.drawable.GradientDrawable r10 = defpackage.C1500.m2711(r10, r12, r14)
            r9.setBackground(r10)
            r10 = 22
            int r12 = defpackage.AbstractC2093.m3510(r10)
            int r13 = defpackage.AbstractC2093.m3510(r10)
            int r15 = defpackage.AbstractC2093.m3510(r10)
            r33 = r10
            int r10 = defpackage.AbstractC2093.m3510(r11)
            r9.setPadding(r12, r13, r15, r10)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r1)
            r10.setOrientation(r4)
            r12 = 16
            r10.setGravity(r12)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r34 = r11
            r11 = -2
            r13.<init>(r15, r11)
            r10.setLayoutParams(r13)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r1)
            r16 = -539650040438318(0xfffe1530ef0961d2, double:NaN)
            java.lang.String r12 = "版本暂未适配"
            r13.setText(r12)
            r12 = 1100480512(0x41980000, float:19.0)
            r13.setTextSize(r12)
            android.graphics.Typeface r12 = android.graphics.Typeface.DEFAULT_BOLD
            r13.setTypeface(r12)
            r13.setIncludeFontPadding(r4)
            r16 = -539680105209390(0xfffe1529ef0961d2, double:NaN)
            java.lang.String r16 = "#1F2329"
            int r15 = android.graphics.Color.parseColor(r16)
            r13.setTextColor(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r15.<init>(r4, r11, r8)
            r13.setLayoutParams(r15)
            r10.addView(r13)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r1)
            r19 = -539714464947758(0xfffe1521ef0961d2, double:NaN)
            java.lang.String r15 = "×"
            r13.setText(r15)
            r15 = 1103101952(0x41c00000, float:24.0)
            r13.setTextSize(r15)
            r15 = 17
            r13.setGravity(r15)
            r13.setIncludeFontPadding(r4)
            r19 = -539723054882350(0xfffe151fef0961d2, double:NaN)
            java.lang.String r19 = "#86909C"
            int r15 = android.graphics.Color.parseColor(r19)
            r13.setTextColor(r15)
            r21 = -539757414620718(0xfffe1517ef0961d2, double:NaN)
            java.lang.String r15 = "#F7F8FA"
            int r15 = android.graphics.Color.parseColor(r15)
            r19 = 999(0x3e7, float:1.4E-42)
            int r8 = defpackage.AbstractC2093.m3510(r19)
            float r8 = (float) r8
            android.graphics.drawable.GradientDrawable r8 = defpackage.C1500.m2711(r15, r8, r14)
            r13.setBackground(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r22 = 32
            int r15 = defpackage.AbstractC2093.m3510(r22)
            int r14 = defpackage.AbstractC2093.m3510(r22)
            r8.<init>(r15, r14)
            r13.setLayoutParams(r8)
            r8 = 1
            r13.setClickable(r8)
            r13.setFocusable(r8)
            ᛵᛷᛱᛴ r14 = new ᛵᛷᛱᛴ
            r14.<init>(r7, r8)
            r13.setOnClickListener(r14)
            r10.addView(r13)
            r9.addView(r10)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r13 = -539791774359086(0xfffe150fef0961d2, double:NaN)
            java.lang.String r13 = "当前 "
            r10.<init>(r13)
            r10.append(r6)
            r13 = -539808954228270(0xfffe150bef0961d2, double:NaN)
            java.lang.String r6 = " 版本暂未完成适配，建议切换到下方已适配版本"
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            r8.setText(r6)
            r6 = 1096810496(0x41600000, float:14.0)
            r8.setTextSize(r6)
            r13 = -539907738476078(0xfffe14f4ef0961d2, double:NaN)
            java.lang.String r10 = "#4E5969"
            int r10 = android.graphics.Color.parseColor(r10)
            r8.setTextColor(r10)
            r10 = 2
            int r13 = defpackage.AbstractC2093.m3510(r10)
            float r13 = (float) r13
            r14 = 1065772646(0x3f866666, float:1.05)
            r8.setLineSpacing(r13, r14)
            r13 = 12
            int r14 = defpackage.AbstractC2093.m3510(r13)
            r8.setPadding(r4, r14, r4, r4)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r14.<init>(r15, r11)
            r8.setLayoutParams(r14)
            r9.addView(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r1)
            r8.setOrientation(r4)
            r14 = 16
            r8.setGravity(r14)
            int r15 = defpackage.AbstractC2093.m3510(r14)
            r14 = 14
            r22 = r13
            int r13 = defpackage.AbstractC2093.m3510(r14)
            r24 = r14
            int r14 = defpackage.AbstractC2093.m3510(r24)
            int r10 = defpackage.AbstractC2093.m3510(r24)
            r8.setPadding(r15, r13, r14, r10)
            r13 = -539942098214446(0xfffe14ecef0961d2, double:NaN)
            java.lang.String r10 = "#FFF7E8"
            int r10 = android.graphics.Color.parseColor(r10)
            int r13 = defpackage.AbstractC2093.m3510(r24)
            float r13 = (float) r13
            r14 = -539976457952814(0xfffe14e4ef0961d2, double:NaN)
            java.lang.String r14 = "#FFE1A8"
            int r14 = android.graphics.Color.parseColor(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            android.graphics.drawable.GradientDrawable r10 = defpackage.C1500.m2711(r10, r13, r14)
            r8.setBackground(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r10.<init>(r15, r11)
            r13 = 18
            int r13 = defpackage.AbstractC2093.m3510(r13)
            r10.topMargin = r13
            r8.setLayoutParams(r10)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r1)
            r13 = 1
            r10.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.<init>(r4, r11, r14)
            r10.setLayoutParams(r13)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r1)
            r14 = -540010817691182(0xfffe14dcef0961d2, double:NaN)
            java.lang.String r14 = "当前版本"
            r13.setText(r14)
            r14 = 1094713344(0x41400000, float:12.0)
            r13.setTextSize(r14)
            r13.setIncludeFontPadding(r4)
            r26 = -540032292527662(0xfffe14d7ef0961d2, double:NaN)
            java.lang.String r15 = "#86909C"
            int r15 = android.graphics.Color.parseColor(r15)
            r13.setTextColor(r15)
            r10.addView(r13)
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r1)
            r13.setText(r3)
            r3 = 1101004800(0x41a00000, float:20.0)
            r13.setTextSize(r3)
            r13.setTypeface(r12)
            r13.setIncludeFontPadding(r4)
            r26 = -540066652266030(0xfffe14cfef0961d2, double:NaN)
            java.lang.String r3 = "#1F2329"
            int r3 = android.graphics.Color.parseColor(r3)
            r13.setTextColor(r3)
            r3 = 1
            r13.setTextIsSelectable(r3)
            android.text.TextUtils$TruncateAt r15 = android.text.TextUtils.TruncateAt.END
            r13.setEllipsize(r15)
            r13.setMaxLines(r3)
            r3 = 6
            int r15 = defpackage.AbstractC2093.m3510(r3)
            r26 = 8
            r27 = r3
            int r3 = defpackage.AbstractC2093.m3510(r26)
            r13.setPadding(r4, r15, r3, r4)
            r10.addView(r13)
            r8.addView(r10)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r1)
            r28 = -540101012004398(0xfffe14c7ef0961d2, double:NaN)
            java.lang.String r10 = "未适配"
            r3.setText(r10)
            r3.setTextSize(r14)
            r3.setTypeface(r12)
            r10 = 17
            r3.setGravity(r10)
            r3.setIncludeFontPadding(r4)
            r28 = -540118191873582(0xfffe14c3ef0961d2, double:NaN)
            java.lang.String r10 = "#D46B08"
            int r10 = android.graphics.Color.parseColor(r10)
            r3.setTextColor(r10)
            r10 = 10
            int r13 = defpackage.AbstractC2093.m3510(r10)
            int r15 = defpackage.AbstractC2093.m3510(r27)
            r28 = r10
            int r10 = defpackage.AbstractC2093.m3510(r28)
            int r6 = defpackage.AbstractC2093.m3510(r27)
            r3.setPadding(r13, r15, r10, r6)
            r30 = -540152551611950(0xfffe14bbef0961d2, double:NaN)
            java.lang.String r6 = "#FFFFFFFF"
            int r6 = android.graphics.Color.parseColor(r6)
            int r10 = defpackage.AbstractC2093.m3510(r19)
            float r10 = (float) r10
            r13 = 0
            android.graphics.drawable.GradientDrawable r6 = defpackage.C1500.m2711(r6, r10, r13)
            r3.setBackground(r6)
            r8.addView(r3)
            r9.addView(r8)
            int r3 = r0.size()
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r1)
            r6.setOrientation(r4)
            r8 = 16
            r6.setGravity(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r8.<init>(r15, r11)
            int r10 = defpackage.AbstractC2093.m3510(r34)
            r8.topMargin = r10
            int r10 = defpackage.AbstractC2093.m3510(r28)
            r8.bottomMargin = r10
            r6.setLayoutParams(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r1)
            r27 = -540195501284910(0xfffe14b1ef0961d2, double:NaN)
            java.lang.String r10 = "已适配版本"
            r8.setText(r10)
            r10 = 1097859072(0x41700000, float:15.0)
            r8.setTextSize(r10)
            r8.setTypeface(r12)
            r8.setIncludeFontPadding(r4)
            r12 = -540221271088686(0xfffe14abef0961d2, double:NaN)
            java.lang.String r12 = "#1F2329"
            int r12 = android.graphics.Color.parseColor(r12)
            r8.setTextColor(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r4, r11, r13)
            r8.setLayoutParams(r12)
            r6.addView(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r1)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r27 = -540255630827054(0xfffe14a3ef0961d2, double:NaN)
            java.lang.String r13 = "共 "
            r12.<init>(r13)
            r12.append(r3)
            r27 = -540268515728942(0xfffe14a0ef0961d2, double:NaN)
            java.lang.String r3 = " 个"
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            r8.setText(r3)
            r8.setTextSize(r14)
            r8.setIncludeFontPadding(r4)
            r12 = -540281400630830(0xfffe149def0961d2, double:NaN)
            java.lang.String r3 = "#4E5969"
            int r3 = android.graphics.Color.parseColor(r3)
            r8.setTextColor(r3)
            r3 = 9
            int r12 = defpackage.AbstractC2093.m3510(r3)
            r13 = 5
            int r14 = defpackage.AbstractC2093.m3510(r13)
            int r3 = defpackage.AbstractC2093.m3510(r3)
            int r13 = defpackage.AbstractC2093.m3510(r13)
            r8.setPadding(r12, r14, r3, r13)
            r12 = -540315760369198(0xfffe1495ef0961d2, double:NaN)
            java.lang.String r3 = "#F2F3F5"
            int r3 = android.graphics.Color.parseColor(r3)
            int r12 = defpackage.AbstractC2093.m3510(r19)
            float r12 = (float) r12
            r13 = 0
            android.graphics.drawable.GradientDrawable r3 = defpackage.C1500.m2711(r3, r12, r13)
            r8.setBackground(r3)
            r6.addView(r8)
            r9.addView(r6)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r1)
            r8 = 1
            r3.setOrientation(r8)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r15 = -1
            r6.<init>(r15, r11)
            r3.setLayoutParams(r6)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L519
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            r12 = -540350120107566(0xfffe148def0961d2, double:NaN)
            java.lang.String r6 = "暂无已适配版本记录"
            r0.setText(r6)
            r6 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r6)
            r6 = 17
            r0.setGravity(r6)
            r12 = -540393069780526(0xfffe1483ef0961d2, double:NaN)
            java.lang.String r6 = "#86909C"
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setTextColor(r6)
            int r6 = defpackage.AbstractC2093.m3510(r24)
            int r8 = defpackage.AbstractC2093.m3510(r24)
            int r12 = defpackage.AbstractC2093.m3510(r24)
            int r13 = defpackage.AbstractC2093.m3510(r24)
            r0.setPadding(r6, r8, r12, r13)
            r12 = -540427429518894(0xfffe147bef0961d2, double:NaN)
            java.lang.String r6 = "#F7F8FA"
            int r6 = android.graphics.Color.parseColor(r6)
            int r8 = defpackage.AbstractC2093.m3510(r22)
            float r8 = (float) r8
            r12 = -540461789257262(0xfffe1473ef0961d2, double:NaN)
            java.lang.String r12 = "#E5E6EB"
            int r12 = android.graphics.Color.parseColor(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.graphics.drawable.GradientDrawable r6 = defpackage.C1500.m2711(r6, r8, r12)
            r0.setBackground(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r6.<init>(r15, r11)
            r0.setLayoutParams(r6)
            r3.addView(r0)
        L515:
            r30 = r2
            goto L644
        L519:
            r6 = 2
            java.util.ArrayList r8 = defpackage.AbstractC1107.m2112(r6, r0)
            java.util.Iterator r6 = r8.iterator()
            r8 = r4
        L523:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L515
            java.lang.Object r12 = r6.next()
            int r13 = r8 + 1
            if (r8 < 0) goto L63e
            java.util.List r12 = (java.util.List) r12
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r1)
            r14.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r15.<init>(r10, r11)
            int r10 = defpackage.AbstractC0425.m1184(r0)
            r25 = 2
            int r10 = r10 / 2
            if (r8 >= r10) goto L551
            int r8 = defpackage.AbstractC2093.m3510(r26)
            r15.bottomMargin = r8
        L551:
            r14.setLayoutParams(r15)
            java.util.Iterator r8 = r12.iterator()
            r10 = r4
        L559:
            boolean r15 = r8.hasNext()
            r18 = 40
            if (r15 == 0) goto L60b
            java.lang.Object r15 = r8.next()
            int r19 = r10 + 1
            if (r10 < 0) goto L605
            java.lang.String r15 = (java.lang.String) r15
            android.widget.TextView r11 = new android.widget.TextView
            r11.<init>(r1)
            r11.setText(r15)
            r15 = 1095761920(0x41500000, float:13.0)
            r11.setTextSize(r15)
            android.graphics.Typeface r15 = android.graphics.Typeface.DEFAULT_BOLD
            r11.setTypeface(r15)
            r15 = 17
            r11.setGravity(r15)
            r11.setIncludeFontPadding(r4)
            r27 = -540496148995630(0xfffe146bef0961d2, double:NaN)
            java.lang.String r15 = "#1F2329"
            int r15 = android.graphics.Color.parseColor(r15)
            r11.setTextColor(r15)
            int r15 = defpackage.AbstractC2093.m3510(r26)
            r27 = 7
            int r4 = defpackage.AbstractC2093.m3510(r27)
            r29 = r0
            int r0 = defpackage.AbstractC2093.m3510(r26)
            r30 = r2
            int r2 = defpackage.AbstractC2093.m3510(r27)
            r11.setPadding(r15, r4, r0, r2)
            r0 = 1
            r11.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r11.setEllipsize(r0)
            r31 = -540530508733998(0xfffe1463ef0961d2, double:NaN)
            java.lang.String r0 = "#F7F8FA"
            int r0 = android.graphics.Color.parseColor(r0)
            int r2 = defpackage.AbstractC2093.m3510(r22)
            float r2 = (float) r2
            r31 = -540564868472366(0xfffe145bef0961d2, double:NaN)
            java.lang.String r4 = "#E5E6EB"
            int r4 = android.graphics.Color.parseColor(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.graphics.drawable.GradientDrawable r0 = defpackage.C1500.m2711(r0, r2, r4)
            r11.setBackground(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r2 = defpackage.AbstractC2093.m3510(r18)
            r4 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r2, r15)
            if (r10 != 0) goto L5f5
            int r2 = defpackage.AbstractC2093.m3510(r26)
            r0.rightMargin = r2
        L5f5:
            r11.setLayoutParams(r0)
            r14.addView(r11)
            r10 = r19
            r0 = r29
            r2 = r30
            r4 = 0
            r11 = -2
            goto L559
        L605:
            defpackage.AbstractC0425.m1196()
            r23 = 0
            throw r23
        L60b:
            r29 = r0
            r30 = r2
            int r0 = r12.size()
            r8 = 1
            if (r0 != r8) goto L62e
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            int r4 = defpackage.AbstractC2093.m3510(r18)
            r8 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r8, r4, r15)
            r0.setLayoutParams(r2)
            r14.addView(r0)
            goto L630
        L62e:
            r15 = 1065353216(0x3f800000, float:1.0)
        L630:
            r3.addView(r14)
            r8 = r13
            r0 = r29
            r2 = r30
            r4 = 0
            r10 = 1097859072(0x41700000, float:15.0)
            r11 = -2
            goto L523
        L63e:
            defpackage.AbstractC0425.m1196()
            r23 = 0
            throw r23
        L644:
            ᛵᛵᛶᲈ r0 = new ᛵᛵᛶᲈ
            r2 = 220(0xdc, float:3.08E-43)
            int r2 = defpackage.AbstractC2093.m3510(r2)
            r0.<init>(r1, r2)
            r8 = 1
            r0.setOverScrollMode(r8)
            r4 = 0
            r0.setFillViewport(r4)
            r0.addView(r3)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r15 = -1
            r2.<init>(r15, r3)
            r0.setLayoutParams(r2)
            r9.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r1)
            r2 = -540599228210734(0xfffe1453ef0961d2, double:NaN)
            java.lang.String r2 = "知道了"
            r0.setText(r2)
            r2 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r2)
            r15 = 17
            r0.setGravity(r15)
            r4 = 0
            r0.setIncludeFontPadding(r4)
            r15 = -1
            r0.setTextColor(r15)
            r2 = 13
            int r3 = defpackage.AbstractC2093.m3510(r2)
            int r2 = defpackage.AbstractC2093.m3510(r2)
            r0.setPadding(r4, r3, r4, r2)
            r2 = -540616408079918(0xfffe144fef0961d2, double:NaN)
            java.lang.String r2 = "#FE2C55"
            int r2 = android.graphics.Color.parseColor(r2)
            int r3 = defpackage.AbstractC2093.m3510(r22)
            float r3 = (float) r3
            r4 = 0
            android.graphics.drawable.GradientDrawable r2 = defpackage.C1500.m2711(r2, r3, r4)
            r0.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r15 = -1
            r2.<init>(r15, r3)
            int r3 = defpackage.AbstractC2093.m3510(r33)
            r2.topMargin = r3
            r0.setLayoutParams(r2)
            r8 = 1
            r0.setClickable(r8)
            r0.setFocusable(r8)
            ᛵᛷᛱᛴ r2 = new ᛵᛷᛱᛴ
            r3 = 0
            r2.<init>(r7, r3)
            r0.setOnClickListener(r2)
            r9.addView(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r1)
            android.app.AlertDialog r0 = r0.create()
            r0.setCanceledOnTouchOutside(r8)
            r2 = -539478241746478(0xfffe1558ef0961d2, double:NaN)
            r5.f6211 = r0
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r8 = r0
            r8.setView(r9, r10, r11, r12, r13)
            java.lang.Object r0 = r5.f6211
            if (r0 != 0) goto L705
            r2 = -539555551157806(0xfffe1546ef0961d2, double:NaN)
            r13 = r4
            goto L708
        L705:
            r13 = r0
            android.app.AlertDialog r13 = (android.app.AlertDialog) r13
        L708:
            ᛳᲁᲀᛱ r0 = new ᛳᲁᲀᛱ
            r0.<init>(r5, r1)
            r13.setOnShowListener(r0)
            java.lang.Object r0 = r5.f6211
            if (r0 != 0) goto L71e
            r0 = -539585615928878(0xfffe153fef0961d2, double:NaN)
            r14 = r4
            goto L721
        L71e:
            r14 = r0
            android.app.AlertDialog r14 = (android.app.AlertDialog) r14
        L721:
            r14.show()
        L724:
            ᲇᲁᲁᛲ r0 = defpackage.C2133.f9104
            r0.getClass()
            defpackage.C2133.m3551()
            return r30
    }
}
