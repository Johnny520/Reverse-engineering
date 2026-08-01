package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1942 extends defpackage.AbstractC1304 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8455;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8456;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8457;

    public /* synthetic */ C1942(java.lang.Object r1, java.lang.Object r2, android.view.ViewGroup r3, int r4) {
            r0 = this;
            r0.f8457 = r4
            r0.f8455 = r1
            r0.f8456 = r2
            r0.<init>(r3)
            return
    }

    public C1942(java.util.Set r2, defpackage.C1419 r3) {
            r1 = this;
            r0 = 0
            r1.f8457 = r0
            r1.f8455 = r2
            r1.f8456 = r3
            r2 = 1712062531(0x660c0043, float:1.6528403E23)
            r1.<init>(r2)
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final void m3356(defpackage.C0478 r4, defpackage.C0395 r5) {
            java.lang.Object r0 = r4.f2401
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.Object r4 = r4.f2400
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            int r1 = r0.getSelectionStart()
            boolean r2 = r5.f2031
            if (r2 == 0) goto L15
            android.text.method.HideReturnsTransformationMethod r2 = android.text.method.HideReturnsTransformationMethod.getInstance()
            goto L19
        L15:
            android.text.method.PasswordTransformationMethod r2 = android.text.method.PasswordTransformationMethod.getInstance()
        L19:
            r0.setTransformationMethod(r2)
            boolean r2 = r5.f2031
            if (r2 == 0) goto L24
            r2 = 1711800603(0x6608011b, float:1.6056556E23)
            goto L27
        L24:
            r2 = 1711800602(0x6608011a, float:1.6056554E23)
        L27:
            r4.setImageResource(r2)
            boolean r5 = r5.f2031
            if (r5 == 0) goto L38
            r2 = -134351156583982(0xffff85ceef0961d2, double:NaN)
        L33:
            java.lang.String r5 = "隐藏密码"
            goto L3e
        L38:
            r2 = -134372631420462(0xffff85c9ef0961d2, double:NaN)
            goto L33
        L3e:
            r4.setContentDescription(r5)
            android.text.Editable r4 = r0.getText()
            int r4 = r4.length()
            r5 = 0
            int r4 = defpackage.AbstractC1754.m3135(r1, r5, r4)
            r0.setSelection(r4)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final void m3357(android.widget.EditText r3, android.widget.TextView r4) {
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r0 = -96744422940206(0xffffa802ef0961d2, double:NaN)
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            java.util.List r3 = defpackage.AbstractC1347.m2519(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.AbstractC0575.m1369(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L27:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L27
        L3f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L48
            r3.add(r1)
            goto L48
        L5f:
            int r3 = r3.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -96753012874798(0xffffa800ef0961d2, double:NaN)
            java.lang.String r1 = "已设置 "
            r0.<init>(r1)
            r0.append(r3)
            r1 = -96774487711278(0xffffa7fbef0961d2, double:NaN)
            java.lang.String r3 = " 个关键词"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.setText(r3)
            return
    }

    @Override // defpackage.AbstractC1304
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo1529(com.kongzue.dialogx.interfaces.AbstractC0008 r19, android.view.View r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            int r2 = r0.f8457
            r3 = 4
            r4 = 0
            r5 = 0
            java.lang.Object r6 = r0.f8456
            java.lang.Object r0 = r0.f8455
            switch(r2) {
                case 0: goto L402;
                case 1: goto L2c4;
                case 2: goto L1ce;
                case 3: goto L14f;
                case 4: goto L81;
                default: goto L10;
            }
        L10:
            r1 = r19
            ᛶᛵᛳᛸ r1 = (defpackage.C1069) r1
            r2 = -134299616976430(0xffff85daef0961d2, double:NaN)
            r2 = -134329681747502(0xffff85d3ef0961d2, double:NaN)
            ᛳᛵᛴᛴ r0 = (defpackage.C0478) r0
            java.lang.Object r2 = r0.f2404
            android.widget.EditText r2 = (android.widget.EditText) r2
            ᛴᛱᲁᛸ r3 = defpackage.C0617.f3025
            android.content.Context r6 = (android.content.Context) r6
            r3.getClass()
            java.lang.String r3 = defpackage.C0617.m1417(r6)
            r2.setText(r3)
            java.lang.Object r2 = r0.f2399
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r3 = defpackage.C0617.m1416(r6)
            r2.setText(r3)
            java.lang.Object r2 = r0.f2401
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r3 = defpackage.C0617.m1418(r6)
            r2.setText(r3)
            ᛲᲈᲀᛱ r2 = new ᛲᲈᲀᛱ
            r2.<init>()
            m3356(r0, r2)
            java.lang.Object r3 = r0.f2400
            android.widget.ImageButton r3 = (android.widget.ImageButton) r3
            ᛳᛲᛶᛶ r4 = new ᛳᛲᛶᛶ
            r5 = 20
            r4.<init>(r2, r5, r0)
            r3.setOnClickListener(r4)
            java.lang.Object r2 = r0.f2398
            android.widget.Button r2 = (android.widget.Button) r2
            ᛸᛴᲀᛴ r3 = new ᛸᛴᲀᛴ
            r4 = 11
            r3.<init>(r4, r0)
            r2.setOnClickListener(r3)
            java.lang.Object r2 = r0.f2403
            android.widget.Button r2 = (android.widget.Button) r2
            ᲇᛸᲀᲁ r3 = new ᲇᛸᲀᲁ
            r4 = 24
            r3.<init>(r0, r6, r1, r4)
            r2.setOnClickListener(r3)
            return
        L81:
            r1 = r19
            ᛶᛵᛳᛸ r1 = (defpackage.C1069) r1
            r1 = -81072087277102(0xffffb643ef0961d2, double:NaN)
            r1 = -81102152048174(0xffffb63cef0961d2, double:NaN)
            android.content.Context r0 = (android.content.Context) r0
            ᲀᛳᲈᲀ r6 = (defpackage.C1653) r6
            ᛴᛱᲁᛸ r1 = defpackage.C0617.f3025
            r1.getClass()
            boolean r2 = defpackage.C0617.m1420(r0)
            android.widget.TextView r7 = r6.f7354
            r8 = 3
            if (r2 != 0) goto Lb4
            r9 = -123377515142702(0xffff8fc9ef0961d2, double:NaN)
            java.lang.String r2 = "请先配置WebDav服务器\n\n点击下方\"配置WebDav\"按钮开始配置"
            r7.setText(r2)
            goto Lcc
        Lb4:
            r9 = -123532133965358(0xffff8fa5ef0961d2, double:NaN)
            java.lang.String r2 = "正在加载备份信息..."
            r7.setText(r2)
            ᛷᲈᛳᛳ r2 = defpackage.AbstractC1140.m2170()
            ᛶᛴᛳᛴ r7 = new ᛶᛴᛳᛴ
            r7.<init>(r0, r6, r4, r5)
            defpackage.AbstractC0397.m1149(r2, r4, r7, r8)
        Lcc:
            r1.getClass()
            boolean r2 = defpackage.C0617.m1420(r0)
            android.view.View r7 = r6.f7353
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 1
            if (r2 != 0) goto Le7
            r10 = -123265845993006(0xffff8fe3ef0961d2, double:NaN)
            java.lang.String r2 = "请先配置WebDav服务器"
            r7.setText(r2)
            goto Lff
        Le7:
            r10 = -123325975535150(0xffff8fd5ef0961d2, double:NaN)
            java.lang.String r2 = "正在加载备份信息..."
            r7.setText(r2)
            ᛷᲈᛳᛳ r2 = defpackage.AbstractC1140.m2170()
            ᛶᛴᛳᛴ r7 = new ᛶᛴᛳᛴ
            r7.<init>(r0, r6, r4, r9)
            defpackage.AbstractC0397.m1149(r2, r4, r7, r8)
        Lff:
            android.view.View r2 = r6.f7355
            android.widget.Switch r2 = (android.widget.Switch) r2
            r1.getClass()
            boolean r1 = defpackage.C0617.m1415(r0)
            r2.setChecked(r1)
            ᛲᛸᛳᲁ r1 = new ᛲᛸᛳᲁ
            r1.<init>(r3, r0)
            r2.setOnCheckedChangeListener(r1)
            android.widget.Button r1 = r6.f7352
            ᛲᛳᲇᛶ r2 = new ᛲᛳᲇᛶ
            r2.<init>(r0, r6, r5)
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r6.f7348
            ᲁᛱᛶᛴ r2 = new ᲁᛱᛶᛴ
            r3 = 27
            r2.<init>(r0, r3)
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r6.f7350
            ᲁᛱᛶᛴ r2 = new ᲁᛱᛶᛴ
            r3 = 28
            r2.<init>(r0, r3)
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r6.f7351
            ᛲᛳᲇᛶ r2 = new ᛲᛳᲇᛶ
            r2.<init>(r0, r6, r9)
            r1.setOnClickListener(r2)
            android.view.View r1 = r6.f7349
            android.widget.Button r1 = (android.widget.Button) r1
            ᛲᛳᲇᛶ r2 = new ᛲᛳᲇᛶ
            r3 = 2
            r2.<init>(r0, r6, r3)
            r1.setOnClickListener(r2)
            return
        L14f:
            r1 = r19
            ᛶᛵᛳᛸ r1 = (defpackage.C1069) r1
            r1 = -86711379336750(0xffffb122ef0961d2, double:NaN)
            r1 = -86741444107822(0xffffb11bef0961d2, double:NaN)
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            ᲀᲇᛸᛶ r1 = defpackage.C1141.f5095
            ᲁᛷᛶᛶ[] r2 = defpackage.C1141.f5221
            r3 = 147(0x93, float:2.06E-43)
            r2 = r2[r3]
            java.lang.Object r1 = r1.m3169(r2)
            java.util.Set r1 = (java.util.Set) r1
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L17c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a4
            java.lang.Object r2 = r0.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.component1()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.component2()
            r4 = -86762918944302(0xffffb116ef0961d2, double:NaN)
            android.widget.Switch r2 = (android.widget.Switch) r2
            boolean r3 = r1.contains(r3)
            r2.setChecked(r3)
            goto L17c
        L1a4:
            ᛸᲈᛸᲈ r6 = (defpackage.C1606) r6
            java.lang.Object r0 = r6.f7101
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            ᲀᲇᛸᛶ r1 = defpackage.C1141.f5181
            ᲁᛷᛶᛶ[] r2 = defpackage.C1141.f5221
            r3 = 148(0x94, float:2.07E-43)
            r2 = r2[r3]
            java.lang.Object r1 = r1.m3169(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L1c7
            r1 = 1711867087(0x660904cf, float:1.6176323E23)
            goto L1ca
        L1c7:
            r1 = 1711867085(0x660904cd, float:1.617632E23)
        L1ca:
            r0.check(r1)
            return
        L1ce:
            r1 = r19
            ᛶᛵᛳᛸ r1 = (defpackage.C1069) r1
            r2 = -137117115522606(0xffff834aef0961d2, double:NaN)
            r2 = -137147180293678(0xffff8343ef0961d2, double:NaN)
            ᲀᛳᛸᲁ r2 = defpackage.C1647.f7340
            r8 = r0
            android.content.Context r8 = (android.content.Context) r8
            r10 = r6
            ᲁᲇᛱᲈ r10 = (defpackage.C1939) r10
            r2.getClass()
            java.util.List r0 = defpackage.AbstractC2311.m3758()
            ᛸᛱᛴᲁ r11 = new ᛸᛱᛴᲁ
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r11.f6211 = r2
            ᛸᛱᛴᲁ r13 = new ᛸᛱᛴᲁ
            r13.<init>()
            ᛸᛱᛴᲁ r14 = new ᛸᛱᛴᲁ
            r14.<init>()
            r16 = r10
            ᛸᛱᛴᲁ r10 = new ᛸᛱᛴᲁ
            r10.<init>()
            r2 = -109423166397998(0xffff9c7aef0961d2, double:NaN)
            java.lang.String r2 = ""
            r10.f6211 = r2
            ᛸᛱᛴᲁ r15 = new ᛸᛱᛴᲁ
            r15.<init>()
            ᛳᛴᲇᛴ r2 = new ᛳᛴᲇᛴ
            ᛵᛷᛷ r7 = new ᛵᛷᛷ
            r9 = r11
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r3 = r10
            r10 = r14
            r13 = r11
            r14 = r12
            r11 = r9
            r2.<init>(r7)
            r15.f6211 = r2
            java.lang.Object r2 = r10.f8442
            com.android.app.CustomRecyclerView r2 = (com.android.app.CustomRecyclerView) r2
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            r6.<init>(r5)
            r2.setLayoutManager(r6)
            java.lang.Object r6 = r15.f6211
            if (r6 != 0) goto L24f
            r6 = -109427461365294(0xffff9c79ef0961d2, double:NaN)
            r6 = r4
            goto L251
        L24f:
            ᛳᛴᲇᛴ r6 = (defpackage.C0466) r6
        L251:
            r2.setAdapter(r6)
            java.lang.Object r2 = r15.f6211
            if (r2 != 0) goto L261
            r6 = -109461821103662(0xffff9c71ef0961d2, double:NaN)
            goto L264
        L261:
            r4 = r2
            ᛳᛴᲇᛴ r4 = (defpackage.C0466) r4
        L264:
            java.lang.Object r2 = r11.f6211
            java.util.List r2 = (java.util.List) r2
            r4.m1327(r2)
            java.lang.Object r2 = r11.f6211
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            defpackage.C1647.m3030(r10, r2)
            java.lang.Object r2 = r10.f8441
            android.widget.EditText r2 = (android.widget.EditText) r2
            ᲇᲈᲇ r9 = new ᲇᲈᲇ
            r12 = r0
            r16 = r10
            r10 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r10 = r16
            r2.addTextChangedListener(r9)
            java.lang.Object r0 = r10.f8443
            android.widget.TextView r0 = (android.widget.TextView) r0
            ᲀᛲᛶᛴ r7 = new ᲀᛲᛶᛴ
            r16 = 0
            r9 = r13
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r13 = r9
            r0.setOnClickListener(r7)
            java.lang.Object r0 = r10.f8444
            android.widget.TextView r0 = (android.widget.TextView) r0
            ᲀᛲᛶᛴ r7 = new ᲀᛲᛶᛴ
            r16 = 1
            r9 = r14
            r14 = r13
            r13 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.setOnClickListener(r7)
            java.lang.Object r0 = r10.f8446
            android.widget.Button r0 = (android.widget.Button) r0
            ᲁᛱᛶᛴ r2 = new ᲁᛱᛶᛴ
            r3 = 6
            r2.<init>(r8, r3)
            r0.setOnClickListener(r2)
            java.lang.Object r0 = r10.f8445
            android.widget.Button r0 = (android.widget.Button) r0
            ᛶᲁᛴᲇ r2 = new ᛶᲁᛴᲇ
            r2.<init>(r1, r5)
            r0.setOnClickListener(r2)
            return
        L2c4:
            r2 = r19
            ᛶᛵᛳᛸ r2 = (defpackage.C1069) r2
            r7 = -80032705191470(0xffffb735ef0961d2, double:NaN)
            r7 = -80062769962542(0xffffb72eef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            android.content.Context r4 = r1.getContext()
            r2.getClass()
            defpackage.C0346.m1051(r4)
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            defpackage.C0346.m1051(r2)
            r0 = 1711866269(0x6609019d, float:1.617485E23)
            android.view.View r0 = r1.findViewById(r0)
            r1 = r0
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r4 = 1086324736(0x40c00000, float:6.0)
            float r4 = r4 * r0
            int r4 = (int) r4
            int r0 = r6.size()
            r7 = -1
            int r0 = r0 + r7
            int r8 = defpackage.AbstractC0425.m1187(r5, r0, r3)
            if (r8 < 0) goto L401
            r9 = r5
        L311:
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r2)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r0.<init>(r7, r11)
            if (r9 != 0) goto L320
            r12 = r5
            goto L321
        L320:
            r12 = r4
        L321:
            r0.topMargin = r12
            r10.setLayoutParams(r0)
            r10.setOrientation(r5)
            r12 = r5
        L32a:
            if (r12 >= r3) goto L3f6
            int r0 = r9 + r12
            int r13 = r6.size()
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= r13) goto L3e0
            java.lang.Object r0 = r6.get(r0)
            r13 = r0
            ᛱᛲᲈᛲ r13 = (defpackage.C0046) r13
            android.view.LayoutInflater r0 = defpackage.AbstractC1668.m3063(r2)
            r15 = 1712062504(0x660c0028, float:1.6528355E23)
            android.view.View r15 = r0.inflate(r15, r10, r5)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r11, r14)
            if (r12 != 0) goto L351
            r14 = r5
            goto L352
        L351:
            r14 = r4
        L352:
            r0.leftMargin = r14
            r15.setLayoutParams(r0)
            ᲈᛲᛵᲀ r0 = com.bumptech.glide.ComponentCallbacks2C0007.m234(r2)     // Catch: java.lang.Exception -> L376
            java.lang.String r14 = r13.f563     // Catch: java.lang.Exception -> L376
            ᲀᛷᛴᲀ r0 = r0.m3586(r14)     // Catch: java.lang.Exception -> L376
            ᛸᛶᛵᛲ r14 = defpackage.C1506.f6658     // Catch: java.lang.Exception -> L376
            ᲇᛴᛸᲇ r0 = r0.m3439(r14)     // Catch: java.lang.Exception -> L376
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L376
            r14 = 1711866270(0x6609019e, float:1.6174851E23)
            android.view.View r14 = r15.findViewById(r14)     // Catch: java.lang.Exception -> L376
            android.widget.ImageView r14 = (android.widget.ImageView) r14     // Catch: java.lang.Exception -> L376
            r0.m3097(r14)     // Catch: java.lang.Exception -> L376
            goto L3ca
        L376:
            r0 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r16 = -97504632151598(0xffffa751ef0961d2, double:NaN)
            java.lang.String r3 = "load image error: "
            r14.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            r16 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r16 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r3 = r0.length()
            if (r3 != 0) goto L3a7
            goto L3ca
        L3a7:
            int r3 = r0.length()
            r14 = r5
        L3ac:
            if (r14 >= r3) goto L3ca
            int r7 = r14 + 2000
            if (r7 <= r3) goto L3b3
            r7 = r3
        L3b3:
            java.lang.String r14 = r0.substring(r14, r7)
            r16 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r16 = defpackage.C0346.f1773
            r16.getClass()
            defpackage.C0346.m1040(r14)
            r14 = r7
            r7 = -1
            goto L3ac
        L3ca:
            r0 = 1711866689(0x66090341, float:1.6175606E23)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            ᛳᛲᛶᛶ r3 = new ᛳᛲᛶᛶ
            r7 = 7
            r3.<init>(r2, r7, r13)
            r0.setOnClickListener(r3)
            r10.addView(r15)
            goto L3f0
        L3e0:
            android.view.View r0 = new android.view.View
            r0.<init>(r2)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r5, r5, r14)
            r0.setLayoutParams(r3)
            r10.addView(r0)
        L3f0:
            int r12 = r12 + 1
            r3 = 4
            r7 = -1
            goto L32a
        L3f6:
            r1.addView(r10)
            if (r9 == r8) goto L401
            int r9 = r9 + 4
            r3 = 4
            r7 = -1
            goto L311
        L401:
            return
        L402:
            r2 = r19
            ᛶᛵᛳᛸ r2 = (defpackage.C1069) r2
            r2 = -96697178299950(0xffffa80def0961d2, double:NaN)
            r2 = -96727243071022(0xffffa806ef0961d2, double:NaN)
            r2 = 1711866331(0x660901db, float:1.617496E23)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r3 = 1711866330(0x660901da, float:1.6174959E23)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7 = r0
            java.util.Set r7 = (java.util.Set) r7
            r3 = -96735833005614(0xffffa804ef0961d2, double:NaN)
            java.lang.String r8 = "\n"
            r11 = 0
            r12 = 62
            r9 = 0
            r10 = 0
            java.lang.String r0 = defpackage.AbstractC1107.m2125(r7, r8, r9, r10, r11, r12)
            r2.setText(r0)
            m3357(r2, r1)
            ᛴᛱᛶᲈ r0 = new ᛴᛱᛶᲈ
            ᛸᛱᛴᲁ r6 = (defpackage.C1419) r6
            r0.<init>(r6, r2, r1)
            r2.addTextChangedListener(r0)
            return
    }
}
