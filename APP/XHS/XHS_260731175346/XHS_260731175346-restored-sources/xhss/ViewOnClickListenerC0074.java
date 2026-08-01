package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0074 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f402;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f403;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f404;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f405;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f406;

    public native /* synthetic */ ViewOnClickListenerC0074(android.app.Dialog r1, java.lang.Object r2, android.content.Context r3, java.lang.Object r4);

    public native /* synthetic */ ViewOnClickListenerC0074(android.app.Dialog r1, java.util.ArrayList r2, android.content.Context r3, java.lang.Object r4);

    public native /* synthetic */ ViewOnClickListenerC0074(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5);

    public native /* synthetic */ ViewOnClickListenerC0074(xhss.C0523 r1, android.content.Context r2, java.lang.Object r3, xhss.C0857 r4);

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r44) {
            r43 = this;
            r0 = r43
            int r1 = r0.f405
            r3 = 2
            r4 = -278112479053893(0xffff030ee47a77bb, double:NaN)
            r6 = -278078119315525(0xffff0316e47a77bb, double:NaN)
            r8 = -278176903563333(0xffff02ffe47a77bb, double:NaN)
            r10 = 0
            java.lang.Object r11 = r0.f406
            r12 = 1
            java.lang.Object r13 = r0.f404
            java.lang.Object r14 = r0.f403
            java.lang.Object r15 = r0.f402
            switch(r1) {
                case 0: goto L3ef;
                case 1: goto Lba;
                case 2: goto L90;
                case 3: goto L44;
                default: goto L21;
            }
        L21:
            xhss.ᛵᲇᲀᛳ r15 = (xhss.C0523) r15
            r1 = r14
            android.content.Context r1 = (android.content.Context) r1
            r3 = r13
            xhss.ᲀᛴᛳᛸ r3 = (xhss.C0857) r3
            r15.m932()
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497
            r2.getClass()
            xhss.ᛲᛸᲁᲇ r6 = xhss.C1085.m1770()
            xhss.ᛱᛲᛴ r2 = new xhss.ᛱᛲᛴ
            r4 = 0
            r5 = 2
            r7 = r2
            java.lang.Object r2 = r0.f406
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            xhss.AbstractC0775.m1317(r6, r0)
            return
        L44:
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            xhss.ᛴᛴᛴᛵ r11 = (xhss.C0355) r11
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L54
        L52:
            r0 = r10
            goto L6b
        L54:
            java.util.Iterator r0 = r15.iterator()
        L58:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L58
            r0 = r12
        L6b:
            xhss.ᛱᛲᲇᲀ r1 = new xhss.ᛱᛲᲇᲀ
            int r2 = r15.size()
            int r2 = r2 - r12
            r1.<init>(r10, r2, r12)
            java.util.Iterator r1 = r1.iterator()
        L79:
            r2 = r1
            xhss.ᛲᲀᛲᲁ r2 = (xhss.C0201) r2
            boolean r3 = r2.f765
            if (r3 == 0) goto L8c
            int r2 = r2.nextInt()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r15.set(r2, r3)
            goto L79
        L8c:
            xhss.C0911.m1479(r15, r11, r13, r14)
            return
        L90:
            xhss.ᲇᛸᛴᛲ r15 = (xhss.C1064) r15
            xhss.ᛶᛵᲈᛱ r11 = (xhss.C0565) r11
            xhss.ᲇᛴᲇᛵ r13 = (xhss.C1036) r13
            xhss.ᛳᛲᲀᲈ r14 = (xhss.C0246) r14
            int r0 = r11.f1997
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r11.f1997
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r13.mo112(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r15.mo115(r0, r1)
            xhss.C0911.m1464(r14, r13, r11)
            return
        Lba:
            android.app.Dialog r15 = (android.app.Dialog) r15
            r18 = r13
            java.util.ArrayList r18 = (java.util.ArrayList) r18
            android.content.Context r14 = (android.content.Context) r14
            r15.dismiss()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r11 = -334939191347269(0xfffecf5fe47a77bb, double:NaN)
            java.lang.String r11 = "batch image items = "
            r1.<init>(r11)
            int r11 = r18.size()
            r1.append(r11)
            r11 = -335029385660485(0xfffecf4ae47a77bb, double:NaN)
            java.lang.String r11 = ", live = "
            r1.append(r11)
            boolean r11 = r18.isEmpty()
            if (r11 == 0) goto Lee
            r12 = r10
            goto L117
        Lee:
            java.util.Iterator r11 = r18.iterator()
            r12 = r10
        Lf3:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L117
            java.lang.Object r13 = r11.next()
            xhss.ᛸᛲᛳᛳ r13 = (xhss.C0732) r13
            java.lang.String r13 = r13.f2465
            if (r13 == 0) goto Lf3
            boolean r13 = xhss.AbstractC0120.m342(r13)
            if (r13 == 0) goto L10a
            goto Lf3
        L10a:
            int r12 = r12 + 1
            if (r12 < 0) goto L10f
            goto Lf3
        L10f:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
        L117:
            r1.append(r12)
            java.lang.String r1 = r1.toString()
        /* removed unused decoded string */ 
            xhss.AbstractC0775.m1313(r6)
            int r6 = r1.length()
            if (r6 != 0) goto L12b
            goto L148
        L12b:
            int r6 = r1.length()
            r7 = r10
        L130:
            if (r7 >= r6) goto L148
            int r8 = r7 + 2000
            if (r8 <= r6) goto L137
            r8 = r6
        L137:
            java.lang.String r7 = r1.substring(r7, r8)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r9 = xhss.C1085.f3497
            r9.getClass()
            xhss.C1085.m1750(r7)
            r7 = r8
            goto L130
        L148:
            xhss.ᛴᛷᛱ r1 = xhss.C0911.f2943
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497
            r1.getClass()
            android.content.Context r1 = xhss.C1085.m1746(r14)
            android.view.LayoutInflater r4 = xhss.AbstractC0968.m1604(r1)
            android.widget.RelativeLayout r5 = new android.widget.RelativeLayout
            r5.<init>(r1)
            r6 = 1678442532(0x640b0024, float:1.025643E22)
            android.view.View r5 = r4.inflate(r6, r5, r10)
            r6 = 1678245951(0x6408003f, float:1.00351E22)
            android.view.View r7 = xhss.AbstractC0775.m1320(r5, r6)
            r21 = r7
            android.widget.TextView r21 = (android.widget.TextView) r21
            if (r21 == 0) goto L3d6
            r6 = 1678245952(0x64080040, float:1.0035101E22)
            android.view.View r7 = xhss.AbstractC0775.m1320(r5, r6)
            r22 = r7
            android.widget.GridLayout r22 = (android.widget.GridLayout) r22
            if (r22 == 0) goto L3d6
            r6 = 1678245953(0x64080041, float:1.0035102E22)
            android.view.View r7 = xhss.AbstractC0775.m1320(r5, r6)
            r23 = r7
            android.widget.ScrollView r23 = (android.widget.ScrollView) r23
            if (r23 == 0) goto L3d6
            r6 = 1678245996(0x6408006c, float:1.003515E22)
            android.view.View r7 = xhss.AbstractC0775.m1320(r5, r6)
            r24 = r7
            android.widget.TextView r24 = (android.widget.TextView) r24
            if (r24 == 0) goto L3d6
            r6 = 1678246117(0x640800e5, float:1.0035287E22)
            android.view.View r7 = xhss.AbstractC0775.m1320(r5, r6)
            r25 = r7
            android.widget.TextView r25 = (android.widget.TextView) r25
            if (r25 == 0) goto L3d6
            xhss.ᛴᛴᛴᛵ r19 = new xhss.ᛴᛴᛴᛵ
            r20 = r5
            android.widget.LinearLayout r20 = (android.widget.LinearLayout) r20
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r5 = r19
            r7 = r22
            r8 = -332486765021253(0xfffed19ae47a77bb, double:NaN)
        /* removed unused decoded string */ 
            int r6 = r18.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r6)
            r9 = r10
        L1c3:
            if (r9 >= r6) goto L1cd
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r8.add(r11)
            int r9 = r9 + 1
            goto L1c3
        L1cd:
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r6 = 18
            int r6 = xhss.C0911.m1480(r1, r6)
            int r6 = r6 * r3
            r9 = 6
            int r9 = xhss.C0911.m1480(r1, r9)
            int r9 = r9 * r3
            int r9 = r9 + r6
            r6 = 8
            int r11 = xhss.C0911.m1480(r1, r6)
            int r11 = r11 * 3
            android.content.res.Resources r12 = r1.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            int r12 = r12.widthPixels
            int r12 = r12 - r9
            int r12 = r12 - r11
            int r12 = r12 / 3
            r9 = 84
            int r9 = xhss.C0911.m1480(r1, r9)
            r11 = 128(0x80, float:1.8E-43)
            int r11 = xhss.C0911.m1480(r1, r11)
            int r9 = xhss.AbstractC0473.m865(r12, r9, r11)
            int r11 = r18.size()
            int r11 = r11 + r3
            int r11 = r11 / 3
            java.lang.Object r3 = r5.f1318
            android.widget.ScrollView r3 = (android.widget.ScrollView) r3
            android.view.ViewGroup$LayoutParams r12 = r3.getLayoutParams()
            int r13 = xhss.C0911.m1480(r1, r6)
            int r13 = r13 + r9
            int r13 = r13 * r11
            r11 = 12
            int r11 = xhss.C0911.m1480(r1, r11)
            int r11 = r11 + r13
            r13 = 430(0x1ae, float:6.03E-43)
            int r13 = xhss.C0911.m1480(r1, r13)
            if (r11 <= r13) goto L22b
            r11 = r13
        L22b:
            r12.height = r11
            r3.setLayoutParams(r12)
            java.util.Iterator r3 = r18.iterator()
            r19 = r10
        L236:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L387
            java.lang.Object r11 = r3.next()
            int r12 = r19 + 1
            if (r19 < 0) goto L381
            xhss.ᛸᛲᛳᛳ r11 = (xhss.C0732) r11
            r13 = 1678442539(0x640b002b, float:1.0256438E22)
            android.view.View r13 = r4.inflate(r13, r7, r10)
            r15 = 1678246026(0x6408008a, float:1.0035184E22)
            android.view.View r16 = xhss.AbstractC0775.m1320(r13, r15)
            r23 = r16
            android.widget.TextView r23 = (android.widget.TextView) r23
            if (r23 == 0) goto L368
            r15 = 1678246035(0x64080093, float:1.0035194E22)
            android.view.View r16 = xhss.AbstractC0775.m1320(r13, r15)
            r24 = r16
            android.widget.TextView r24 = (android.widget.TextView) r24
            if (r24 == 0) goto L368
            r15 = 1678246075(0x640800bb, float:1.0035239E22)
            android.view.View r16 = xhss.AbstractC0775.m1320(r13, r15)
            r25 = r16
            android.widget.TextView r25 = (android.widget.TextView) r25
            if (r25 == 0) goto L368
            r15 = 1678246119(0x640800e7, float:1.0035289E22)
            android.view.View r16 = xhss.AbstractC0775.m1320(r13, r15)
            r26 = r16
            android.widget.TextView r26 = (android.widget.TextView) r26
            if (r26 == 0) goto L368
            r15 = 1678246120(0x640800e8, float:1.003529E22)
            android.view.View r27 = xhss.AbstractC0775.m1320(r13, r15)
            if (r27 == 0) goto L368
            r15 = 1678246165(0x64080115, float:1.0035341E22)
            android.view.View r16 = xhss.AbstractC0775.m1320(r13, r15)
            r28 = r16
            android.widget.ImageView r28 = (android.widget.ImageView) r28
            if (r28 == 0) goto L368
            xhss.ᛴᲇᲈᛵ r21 = new xhss.ᛴᲇᲈᛵ
            r22 = r13
            android.widget.FrameLayout r22 = (android.widget.FrameLayout) r22
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r6 = r21
            r10 = r22
            r13 = r23
            r15 = r24
            r2 = r25
            r44 = 0
            r16 = -332542599596101(0xfffed18de47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r25 = r3
            android.widget.GridLayout$LayoutParams r3 = new android.widget.GridLayout$LayoutParams
            r3.<init>()
            r3.width = r9
            r3.height = r9
            r26 = r4
            r4 = 4
            r21 = r5
            int r5 = xhss.C0911.m1480(r1, r4)
            r17 = r8
            int r8 = xhss.C0911.m1480(r1, r4)
            r27 = r9
            int r9 = xhss.C0911.m1480(r1, r4)
            int r4 = xhss.C0911.m1480(r1, r4)
            r3.setMargins(r5, r8, r9, r4)
            r10.setLayoutParams(r3)
            int r3 = r11.f2464
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r13.setText(r3)
            java.lang.String r3 = r11.f2465
            if (r3 == 0) goto L2f4
            boolean r3 = xhss.AbstractC0120.m342(r3)
            if (r3 == 0) goto L2f2
            goto L2f4
        L2f2:
            r3 = 0
            goto L2f6
        L2f4:
            r3 = 8
        L2f6:
            r15.setVisibility(r3)
            xhss.ᛳᲀᲇᲇ r16 = new xhss.ᛳᲀᲇᲇ
            r42 = r20
            r20 = r18
            r18 = r19
            r19 = r21
            r21 = r42
            r16.<init>(r17, r18, r19, r20, r21)
            r4 = r16
            r3 = r18
            r18 = r20
            r20 = r21
            r10.setOnClickListener(r4)
            xhss.ᛱᛴᛵᛴ r16 = new xhss.ᛱᛴᛵᛴ
            r21 = r19
            r22 = r20
            r19 = r3
            r20 = r17
            r17 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r9 = r16
            r3 = r18
            r4 = r20
            r5 = r21
            r8 = r22
            r2.setOnClickListener(r9)
            r7.addView(r10)
            r8.add(r6)
            java.lang.String r2 = r11.f2463
            r9 = -332598434170949(0xfffed180e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            android.content.Context r6 = r28.getContext()
            r9 = -332787412731973(0xfffed154e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r9 = 7
            int r6 = xhss.C0911.m1480(r6, r9)
            float r6 = (float) r6
            r9 = 360(0x168, float:5.04E-43)
            r10 = r28
            xhss.C0911.m1468(r2, r10, r9, r9, r6)
            r20 = r8
            r19 = r12
            r3 = r25
            r9 = r27
            r6 = 8
            r10 = 0
            r8 = r4
            r4 = r26
            goto L236
        L368:
            android.content.res.Resources r0 = r13.getResources()
            java.lang.String r0 = r0.getResourceName(r15)
            r1 = -356371078154309(0xfffebbe1e47a77bb, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            xhss.C0532.m953(r0)
            goto L3ee
        L381:
            r44 = 0
            xhss.AbstractC0086.m244()
            throw r44
        L387:
            r4 = r8
            r17 = r14
            r3 = r18
            r8 = r20
            xhss.C0911.m1479(r4, r5, r3, r8)
            xhss.ᛵᲇᲀᛳ r1 = xhss.C0523.m931(r17)
            r6 = -332662858680389(0xfffed171e47a77bb, double:NaN)
            java.lang.String r2 = "选择图片"
            r1.f1907 = r2
            r1.m933()
            r2 = 0
            r1.f1901 = r2
            r6 = -332684333516869(0xfffed16ce47a77bb, double:NaN)
            java.lang.String r2 = "关闭"
            r1.f1898 = r2
            r1.m933()
            java.lang.Object r2 = r5.f1313
            r23 = r2
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            xhss.ᛸᛴᛱᛴ r16 = new xhss.ᛸᛴᛱᛴ
            java.lang.Object r0 = r0.f406
            r22 = r0
            r19 = r3
            r18 = r4
            r21 = r17
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0 = r16
            r1.f1909 = r0
            r1.m933()
            r1.m935()
            goto L3ee
        L3d6:
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r0 = r0.getResourceName(r6)
            r1 = -355821322340421(0xfffebc61e47a77bb, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            xhss.C0532.m953(r0)
        L3ee:
            return
        L3ef:
            r44 = 0
            android.app.Dialog r15 = (android.app.Dialog) r15
            android.content.Context r14 = (android.content.Context) r14
            r15.dismiss()
            if (r11 == 0) goto L41c
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r1 = -334823227230277(0xfffecf7ae47a77bb, double:NaN)
            java.lang.String r1 = "videoInfo"
            r0.getClass()
            java.lang.Object r0 = xhss.C1085.m1768(r11, r1)
            if (r0 == 0) goto L41c
            r1 = -334866176903237(0xfffecf70e47a77bb, double:NaN)
            java.lang.String r1 = "urlInfoList"
            java.lang.Object r0 = xhss.C1085.m1768(r0, r1)
            goto L41e
        L41c:
            r0 = r44
        L41e:
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L426
            java.util.List r0 = (java.util.List) r0
            r1 = r0
            goto L428
        L426:
            r1 = r44
        L428:
            if (r1 == 0) goto L9aa
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L432
            goto L9aa
        L432:
            xhss.ᛴᛷᛱ r0 = xhss.C0911.f2943
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497
            r0.getClass()
            android.content.Context r2 = xhss.C1085.m1746(r14)
            android.view.LayoutInflater r10 = xhss.AbstractC0968.m1604(r2)
            android.widget.RelativeLayout r0 = new android.widget.RelativeLayout
            r0.<init>(r2)
            r11 = 1678442536(0x640b0028, float:1.0256435E22)
            r15 = 0
            android.view.View r0 = r10.inflate(r11, r0, r15)
            r11 = 1678246087(0x640800c7, float:1.0035253E22)
            android.view.View r15 = xhss.AbstractC0775.m1320(r0, r11)
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L992
            r11 = 1678246088(0x640800c8, float:1.0035254E22)
            android.view.View r16 = xhss.AbstractC0775.m1320(r0, r11)
            r17 = r4
            r4 = r16
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L992
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r19 = -333075175540805(0xfffed111e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r19 = -333131010115653(0xfffed104e47a77bb, double:NaN)
            java.lang.String r11 = "共 "
            r0.<init>(r11)
            int r11 = r1.size()
            r0.append(r11)
            r19 = -333143895017541(0xfffed101e47a77bb, double:NaN)
            java.lang.String r11 = " 个画质版本"
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            r15.setText(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r15 = r1.iterator()
            r0 = 0
        L4a5:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L956
            r19 = r6
            java.lang.Object r6 = r15.next()
            int r7 = r0 + 1
            if (r0 < 0) goto L952
            xhss.ᛴᛷᛱ r16 = xhss.AbstractC0744.f2494     // Catch: java.lang.Exception -> L8ee
            java.lang.Object r16 = r16.m734()     // Catch: java.lang.Exception -> L8d9
            r21 = r8
            r8 = r16
            xhss.ᲈᛲᛶᛴ r8 = (xhss.C1125) r8     // Catch: java.lang.Exception -> L518
            java.lang.String r6 = r8.m1818(r6)     // Catch: java.lang.Exception -> L518
            xhss.ᛵᛷᛸᛶ r6 = xhss.AbstractC0775.m1311(r6)     // Catch: java.lang.Exception -> L518
            boolean r8 = r6 instanceof xhss.C1002     // Catch: java.lang.Exception -> L518
            if (r8 == 0) goto L8b4
            xhss.ᲇᛱᛱᛷ r6 = (xhss.C1002) r6     // Catch: java.lang.Exception -> L518
            r8 = -333173959788613(0xfffed0fae47a77bb, double:NaN)
            java.lang.String r8 = "url"     // Catch: java.lang.Exception -> L518
            xhss.ᛵᛷᛸᛶ r8 = r6.m1644(r8)     // Catch: java.lang.Exception -> L518
            if (r8 == 0) goto L4ef
            java.lang.String r8 = r8.mo901()     // Catch: java.lang.Exception -> L518
            if (r8 == 0) goto L4ef
            boolean r9 = xhss.AbstractC0120.m342(r8)     // Catch: java.lang.Exception -> L518
            if (r9 != 0) goto L4eb
            goto L4ed
        L4eb:
            r8 = r44
        L4ed:
            if (r8 != 0) goto L502
        L4ef:
            r43 = r1
            r9 = r3
            r35 = r5
            r31 = r7
            r34 = r10
            r1 = r11
            r5 = r12
            r37 = r13
            r38 = r14
            r36 = r15
            goto L93b
        L502:
            r25 = -333191139657797(0xfffed0f6e47a77bb, double:NaN)
            java.lang.String r9 = "desc"     // Catch: java.lang.Exception -> L518
            xhss.ᛵᛷᛸᛶ r9 = r6.m1644(r9)     // Catch: java.lang.Exception -> L518
            if (r9 == 0) goto L52c
            java.lang.String r9 = r9.mo901()     // Catch: java.lang.Exception -> L518
            if (r9 != 0) goto L535
            goto L52c
        L518:
            r0 = move-exception
            r43 = r1
            r9 = r3
            r35 = r5
            r31 = r7
            r34 = r10
            r1 = r11
            r5 = r12
            r37 = r13
            r38 = r14
            r36 = r15
            goto L8f8
        L52c:
            r25 = -333212614494277(0xfffed0f1e47a77bb, double:NaN)
            java.lang.String r9 = ""     // Catch: java.lang.Exception -> L518
        L535:
            r25 = -333216909461573(0xfffed0f0e47a77bb, double:NaN)
            r16 = r12
            java.lang.String r12 = "duration"     // Catch: java.lang.Exception -> L54d
            xhss.ᛵᛷᛸᛶ r12 = r6.m1644(r12)     // Catch: java.lang.Exception -> L54d
            r25 = 0
            if (r12 == 0) goto L562
            long r27 = r12.mo900()     // Catch: java.lang.Exception -> L54d
            goto L564
        L54d:
            r0 = move-exception
            r43 = r1
            r9 = r3
            r35 = r5
            r31 = r7
            r34 = r10
            r1 = r11
            r37 = r13
            r38 = r14
            r36 = r15
            r5 = r16
            goto L8f8
        L562:
            r27 = r25
        L564:
            r29 = -333255564167237(0xfffed0e7e47a77bb, double:NaN)
            java.lang.String r12 = "fps"     // Catch: java.lang.Exception -> L54d
            xhss.ᛵᛷᛸᛶ r12 = r6.m1644(r12)     // Catch: java.lang.Exception -> L54d
            if (r12 == 0) goto L578
            int r12 = r12.mo902()     // Catch: java.lang.Exception -> L54d
            goto L579
        L578:
            r12 = 0
        L579:
            r29 = -333272744036421(0xfffed0e3e47a77bb, double:NaN)
            java.lang.String r3 = "height"     // Catch: java.lang.Exception -> L58d
            xhss.ᛵᛷᛸᛶ r3 = r6.m1644(r3)     // Catch: java.lang.Exception -> L58d
            if (r3 == 0) goto L5a2
            int r3 = r3.mo902()     // Catch: java.lang.Exception -> L58d
            goto L5a3
        L58d:
            r0 = move-exception
            r43 = r1
        L590:
            r35 = r5
            r31 = r7
        L594:
            r34 = r10
            r1 = r11
            r37 = r13
            r38 = r14
            r36 = r15
        L59d:
            r5 = r16
        L59f:
            r9 = 2
            goto L8f8
        L5a2:
            r3 = 0
        L5a3:
            r29 = -333302808807493(0xfffed0dce47a77bb, double:NaN)
            r43 = r1
            java.lang.String r1 = "width"     // Catch: java.lang.Exception -> L5b9
            xhss.ᛵᛷᛸᛶ r1 = r6.m1644(r1)     // Catch: java.lang.Exception -> L5b9
            if (r1 == 0) goto L5bb
            int r1 = r1.mo902()     // Catch: java.lang.Exception -> L5b9
            goto L5bc
        L5b9:
            r0 = move-exception
            goto L590
        L5bb:
            r1 = 0
        L5bc:
            r29 = -333328578611269(0xfffed0d6e47a77bb, double:NaN)
            r31 = r7
            java.lang.String r7 = "videoSize"     // Catch: java.lang.Exception -> L5d2
            xhss.ᛵᛷᛸᛶ r7 = r6.m1644(r7)     // Catch: java.lang.Exception -> L5d2
            if (r7 == 0) goto L5d6
            long r29 = r7.mo900()     // Catch: java.lang.Exception -> L5d2
            goto L5d8
        L5d2:
            r0 = move-exception
            r35 = r5
            goto L594
        L5d6:
            r29 = r25
        L5d8:
            r32 = -333371528284229(0xfffed0cce47a77bb, double:NaN)
            java.lang.String r7 = "avgBitrate"     // Catch: java.lang.Exception -> L5d2
            xhss.ᛵᛷᛸᛶ r7 = r6.m1644(r7)     // Catch: java.lang.Exception -> L5d2
            if (r7 == 0) goto L5ec
            long r32 = r7.mo900()     // Catch: java.lang.Exception -> L5d2
            goto L5ee
        L5ec:
            r32 = r25
        L5ee:
            r34 = -333418772924485(0xfffed0c1e47a77bb, double:NaN)
            java.lang.String r7 = "qualityType"     // Catch: java.lang.Exception -> L5d2
            xhss.ᛵᛷᛸᛶ r7 = r6.m1644(r7)     // Catch: java.lang.Exception -> L5d2
            if (r7 == 0) goto L603
            java.lang.String r7 = r7.mo901()     // Catch: java.lang.Exception -> L5d2
            if (r7 != 0) goto L60c
        L603:
            r34 = -333470312532037(0xfffed0b5e47a77bb, double:NaN)
            java.lang.String r7 = ""     // Catch: java.lang.Exception -> L5d2
        L60c:
            r34 = -333474607499333(0xfffed0b4e47a77bb, double:NaN)
            r36 = r15
            java.lang.String r15 = "videoCodec"     // Catch: java.lang.Exception -> L624
            xhss.ᛵᛷᛸᛶ r6 = r6.m1644(r15)     // Catch: java.lang.Exception -> L624
            if (r6 == 0) goto L630
            java.lang.String r6 = r6.mo901()     // Catch: java.lang.Exception -> L624
            if (r6 != 0) goto L639
            goto L630
        L624:
            r0 = move-exception
            r35 = r5
            r34 = r10
        L629:
            r1 = r11
            r37 = r13
        L62c:
            r38 = r14
            goto L59d
        L630:
            r34 = -333521852139589(0xfffed0a9e47a77bb, double:NaN)
            java.lang.String r6 = ""     // Catch: java.lang.Exception -> L624
        L639:
            xhss.ᛸᲁᲈᛷ r15 = xhss.C0814.m1376(r10, r4)     // Catch: java.lang.Exception -> L624
            r34 = -333526147106885(0xfffed0a8e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Exception -> L624
            r34 = r10
            android.widget.TextView r10 = r15.f2639     // Catch: java.lang.Exception -> L8af
            r35 = r5
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L8ac
            r37 = r13
            java.lang.String r13 = r7.toUpperCase(r5)     // Catch: java.lang.Exception -> L8a8
            r38 = -333581981681733(0xfffed09be47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Exception -> L8a8
            r38 = r14
            int r14 = r13.hashCode()     // Catch: java.lang.Exception -> L8a4
            r39 = r11
            r11 = 2300(0x8fc, float:3.223E-42)
            if (r14 == r11) goto L6cb
            r11 = 2641(0xa51, float:3.701E-42)
            if (r14 == r11) goto L6b1
            r11 = 69570(0x10fc2, float:9.7488E-41)
            if (r14 == r11) goto L697
            r11 = 83985(0x14811, float:1.17688E-40)
            if (r14 == r11) goto L676
            goto L6da
        L676:
            r40 = -333654996125765(0xfffed08ae47a77bb, double:NaN)
            java.lang.String r11 = "UHD"     // Catch: java.lang.Exception -> L690
            boolean r11 = r13.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r11 != 0) goto L686
            goto L6da
        L686:
            r13 = -333753780373573(0xfffed073e47a77bb, double:NaN)
            java.lang.String r11 = "原画"     // Catch: java.lang.Exception -> L690
            goto L6e5
        L690:
            r0 = move-exception
            r5 = r16
            r1 = r39
            goto L59f
        L697:
            r40 = -333685060896837(0xfffed083e47a77bb, double:NaN)
            java.lang.String r11 = "FHD"     // Catch: java.lang.Exception -> L690
            boolean r11 = r13.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r11 != 0) goto L6a7
            goto L6da
        L6a7:
            r13 = -333715125667909(0xfffed07ce47a77bb, double:NaN)
            java.lang.String r11 = "超清"     // Catch: java.lang.Exception -> L690
            goto L6e5
        L6b1:
            r40 = -333672175994949(0xfffed086e47a77bb, double:NaN)
            java.lang.String r11 = "SD"     // Catch: java.lang.Exception -> L690
            boolean r11 = r13.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r11 != 0) goto L6c1
            goto L6da
        L6c1:
            r13 = -333740895471685(0xfffed076e47a77bb, double:NaN)
            java.lang.String r11 = "标清"     // Catch: java.lang.Exception -> L690
            goto L6e5
        L6cb:
            r40 = -333702240766021(0xfffed07fe47a77bb, double:NaN)
            java.lang.String r11 = "HD"     // Catch: java.lang.Exception -> L690
            boolean r11 = r13.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r11 != 0) goto L6dc
        L6da:
            r11 = r7
            goto L6e5
        L6dc:
            r13 = -333728010569797(0xfffed079e47a77bb, double:NaN)
            java.lang.String r11 = "高清"     // Catch: java.lang.Exception -> L690
        L6e5:
            r10.setText(r11)     // Catch: java.lang.Exception -> L690
            java.lang.String r10 = r6.toLowerCase(r5)     // Catch: java.lang.Exception -> L690
            r13 = -333766665275461(0xfffed070e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Exception -> L690
            int r11 = r10.hashCode()     // Catch: java.lang.Exception -> L690
            switch(r11) {
                case 96974: goto L736;
                case 3148040: goto L726;
                case 3148041: goto L70c;
                case 3199082: goto L6fc;
                default: goto L6fb;
            }     // Catch: java.lang.Exception -> L690
        L6fb:
            goto L745
        L6fc:
            r13 = -333882629392453(0xfffed055e47a77bb, double:NaN)
            java.lang.String r11 = "hevc"     // Catch: java.lang.Exception -> L690
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r10 != 0) goto L71c
            goto L745
        L70c:
            r13 = -333861154555973(0xfffed05ae47a77bb, double:NaN)
            java.lang.String r11 = "h265"     // Catch: java.lang.Exception -> L690
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r10 != 0) goto L71c
            goto L745
        L71c:
            r5 = -333921284098117(0xfffed04ce47a77bb, double:NaN)
            java.lang.String r5 = "H.265"     // Catch: java.lang.Exception -> L690
            goto L75b
        L726:
            r13 = -333839679719493(0xfffed05fe47a77bb, double:NaN)
            java.lang.String r11 = "h264"     // Catch: java.lang.Exception -> L690
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r10 != 0) goto L752
            goto L745
        L736:
            r13 = -333904104228933(0xfffed050e47a77bb, double:NaN)
            java.lang.String r11 = "avc"     // Catch: java.lang.Exception -> L690
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> L690
            if (r10 != 0) goto L752
        L745:
            java.lang.String r5 = r6.toUpperCase(r5)     // Catch: java.lang.Exception -> L690
            r10 = -333972823705669(0xfffed040e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Exception -> L690
            goto L75b
        L752:
            r5 = -333947053901893(0xfffed046e47a77bb, double:NaN)
            java.lang.String r5 = "H.264"     // Catch: java.lang.Exception -> L690
        L75b:
            android.widget.TextView r6 = r15.f2642     // Catch: java.lang.Exception -> L690
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L690
            r10.<init>()     // Catch: java.lang.Exception -> L690
            r10.append(r1)     // Catch: java.lang.Exception -> L690
            r1 = 215(0xd7, float:3.01E-43)
            r10.append(r1)     // Catch: java.lang.Exception -> L690
            r10.append(r3)     // Catch: java.lang.Exception -> L690
            r13 = -334045838149701(0xfffed02fe47a77bb, double:NaN)
            java.lang.String r1 = "  "     // Catch: java.lang.Exception -> L690
            r10.append(r1)     // Catch: java.lang.Exception -> L690
            r10.append(r5)     // Catch: java.lang.Exception -> L690
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Exception -> L690
            r6.setText(r1)     // Catch: java.lang.Exception -> L690
            android.widget.TextView r1 = r15.f2637     // Catch: java.lang.Exception -> L690
            r1.setText(r9)     // Catch: java.lang.Exception -> L690
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L690
            r1.<init>()     // Catch: java.lang.Exception -> L690
            int r3 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r3 <= 0) goto L7e7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e4
            r3.<init>()     // Catch: java.lang.Exception -> L7e4
            r5 = -334058723051589(0xfffed02ce47a77bb, double:NaN)
            java.lang.String r5 = "时长 "     // Catch: java.lang.Exception -> L7e4
            r3.append(r5)     // Catch: java.lang.Exception -> L7e4
            r5 = 1000(0x3e8, double:4.94E-321)
            long r27 = r27 / r5
            r5 = -334359370762309(0xfffecfe6e47a77bb, double:NaN)
            java.lang.String r5 = "%d:%02d"     // Catch: java.lang.Exception -> L7e4
            r9 = 60
            long r13 = r27 / r9
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Exception -> L7e4
            long r27 = r27 % r9
            java.lang.Long r9 = java.lang.Long.valueOf(r27)     // Catch: java.lang.Exception -> L7e4
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r9}     // Catch: java.lang.Exception -> L7e4
            r9 = 2
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r9)     // Catch: java.lang.Exception -> L7dd
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.Exception -> L7dd
            r10 = -334393730500677(0xfffecfdee47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Exception -> L7dd
            r3.append(r5)     // Catch: java.lang.Exception -> L7dd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L7dd
            r1.append(r3)     // Catch: java.lang.Exception -> L7dd
            goto L7e8
        L7dd:
            r0 = move-exception
        L7de:
            r5 = r16
        L7e0:
            r1 = r39
            goto L8f8
        L7e4:
            r0 = move-exception
            r9 = 2
            goto L7de
        L7e7:
            r9 = 2
        L7e8:
            if (r12 <= 0) goto L817
            int r3 = r1.length()     // Catch: java.lang.Exception -> L7dd
            if (r3 <= 0) goto L7fc
            r5 = -334075902920773(0xfffed028e47a77bb, double:NaN)
            java.lang.String r3 = "  ·  "     // Catch: java.lang.Exception -> L7dd
            r1.append(r3)     // Catch: java.lang.Exception -> L7dd
        L7fc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7dd
            r3.<init>()     // Catch: java.lang.Exception -> L7dd
            r3.append(r12)     // Catch: java.lang.Exception -> L7dd
            r5 = -334101672724549(0xfffed022e47a77bb, double:NaN)
            java.lang.String r5 = "fps"     // Catch: java.lang.Exception -> L7dd
            r3.append(r5)     // Catch: java.lang.Exception -> L7dd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L7dd
            r1.append(r3)     // Catch: java.lang.Exception -> L7dd
        L817:
            int r3 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r3 <= 0) goto L834
            int r3 = r1.length()     // Catch: java.lang.Exception -> L7dd
            if (r3 <= 0) goto L82d
            r5 = -334118852593733(0xfffed01ee47a77bb, double:NaN)
            java.lang.String r3 = "  ·  "     // Catch: java.lang.Exception -> L7dd
            r1.append(r3)     // Catch: java.lang.Exception -> L7dd
        L82d:
            java.lang.String r3 = xhss.C0911.m1473(r29)     // Catch: java.lang.Exception -> L7dd
            r1.append(r3)     // Catch: java.lang.Exception -> L7dd
        L834:
            int r3 = (r32 > r25 ? 1 : (r32 == r25 ? 0 : -1))
            if (r3 <= 0) goto L851
            int r3 = r1.length()     // Catch: java.lang.Exception -> L7dd
            if (r3 <= 0) goto L84a
            r5 = -334144622397509(0xfffed018e47a77bb, double:NaN)
            java.lang.String r3 = "  ·  "     // Catch: java.lang.Exception -> L7dd
            r1.append(r3)     // Catch: java.lang.Exception -> L7dd
        L84a:
            java.lang.String r3 = xhss.C0911.m1478(r32)     // Catch: java.lang.Exception -> L7dd
            r1.append(r3)     // Catch: java.lang.Exception -> L7dd
        L851:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L7dd
            android.widget.TextView r3 = r15.f2641     // Catch: java.lang.Exception -> L7dd
            r3.setText(r1)     // Catch: java.lang.Exception -> L7dd
            android.widget.LinearLayout r1 = r15.f2640     // Catch: java.lang.Exception -> L7dd
            r4.addView(r1)     // Catch: java.lang.Exception -> L7dd
            int r1 = r43.size()     // Catch: java.lang.Exception -> L7dd
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L88e
            android.view.View r0 = new android.view.View     // Catch: java.lang.Exception -> L7dd
            r0.<init>(r2)     // Catch: java.lang.Exception -> L7dd
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L7dd
            r3 = -1
            r5 = r16
            r1.<init>(r3, r5)     // Catch: java.lang.Exception -> L88b
            r0.setLayoutParams(r1)     // Catch: java.lang.Exception -> L88b
            r10 = -334170392201285(0xfffed012e47a77bb, double:NaN)
            java.lang.String r1 = "#F0F1F3"     // Catch: java.lang.Exception -> L88b
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L88b
            r0.setBackgroundColor(r1)     // Catch: java.lang.Exception -> L88b
            r4.addView(r0)     // Catch: java.lang.Exception -> L88b
            goto L890
        L88b:
            r0 = move-exception
            goto L7e0
        L88e:
            r5 = r16
        L890:
            xhss.ᲀᛴᛳᛸ r0 = new xhss.ᲀᛴᛳᛸ     // Catch: java.lang.Exception -> L88b
            xhss.ᲀᛴᛳᛸ r1 = new xhss.ᲀᛴᛳᛸ     // Catch: java.lang.Exception -> L88b
            r1.<init>(r8, r7)     // Catch: java.lang.Exception -> L88b
            r0.<init>(r15, r1)     // Catch: java.lang.Exception -> L88b
            r1 = r39
            r1.add(r0)     // Catch: java.lang.Exception -> L8a1
            goto L93b
        L8a1:
            r0 = move-exception
            goto L8f8
        L8a4:
            r0 = move-exception
            r1 = r11
            goto L59d
        L8a8:
            r0 = move-exception
            r1 = r11
            goto L62c
        L8ac:
            r0 = move-exception
            goto L629
        L8af:
            r0 = move-exception
            r35 = r5
            goto L629
        L8b4:
            r43 = r1
            r9 = r3
            r35 = r5
            r31 = r7
            r34 = r10
            r1 = r11
            r5 = r12
            r37 = r13
            r38 = r14
            r36 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L8a1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a1
            java.lang.String r7 = "Not a JSON Object: "
            r3.<init>(r7)     // Catch: java.lang.Exception -> L8a1
            r3.append(r6)     // Catch: java.lang.Exception -> L8a1
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L8a1
            r0.<init>(r3)     // Catch: java.lang.Exception -> L8a1
            throw r0     // Catch: java.lang.Exception -> L8a1
        L8d9:
            r0 = move-exception
            r21 = r8
            r43 = r1
            r35 = r5
            r31 = r7
        L8e2:
            r34 = r10
            r1 = r11
            r5 = r12
            r37 = r13
            r38 = r14
            r36 = r15
            r9 = r3
            goto L8f8
        L8ee:
            r0 = move-exception
            r43 = r1
            r35 = r5
            r31 = r7
            r21 = r8
            goto L8e2
        L8f8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r6 = -334204751939653(0xfffed00ae47a77bb, double:NaN)
            java.lang.String r6 = "video quality parse error: "
            r3.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            xhss.AbstractC0775.m1313(r21)
            xhss.AbstractC0775.m1313(r19)
            int r3 = r0.length()
            if (r3 != 0) goto L91e
            goto L93b
        L91e:
            int r3 = r0.length()
            r6 = 0
        L923:
            if (r6 >= r3) goto L93b
            int r7 = r6 + 2000
            if (r7 <= r3) goto L92a
            r7 = r3
        L92a:
            java.lang.String r6 = r0.substring(r6, r7)
            xhss.AbstractC0775.m1313(r17)
            xhss.ᲇᲁᛱᛸ r8 = xhss.C1085.f3497
            r8.getClass()
            xhss.C1085.m1750(r6)
            r6 = r7
            goto L923
        L93b:
            r11 = r1
            r12 = r5
            r3 = r9
            r6 = r19
            r8 = r21
            r0 = r31
            r10 = r34
            r5 = r35
            r15 = r36
            r13 = r37
            r14 = r38
            r1 = r43
            goto L4a5
        L952:
            xhss.AbstractC0086.m244()
            throw r44
        L956:
            r35 = r5
            r1 = r11
            r37 = r13
            r38 = r14
            xhss.ᛵᲇᲀᛳ r0 = xhss.C0523.m931(r38)
            r2 = -334325011023941(0xfffecfeee47a77bb, double:NaN)
            java.lang.String r2 = "选择画质"
            r0.f1907 = r2
            r0.m933()
            r15 = 0
            r0.f1901 = r15
            r2 = -334346485860421(0xfffecfe9e47a77bb, double:NaN)
            java.lang.String r2 = "关闭"
            r0.f1898 = r2
            r0.m933()
            xhss.ᛳᛵᛱᲁ r2 = new xhss.ᛳᛵᛱᲁ
            r3 = r35
            r4 = r37
            r2.<init>(r1, r14, r4, r3)
            r0.f1909 = r2
            r0.m933()
            r0.m935()
            goto L9aa
        L992:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r11)
            r1 = -355232911820869(0xfffebceae47a77bb, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            xhss.C0532.m953(r0)
        L9aa:
            return
    }
}
