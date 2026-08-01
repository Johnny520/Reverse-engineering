package defpackage;

/* JADX INFO: renamed from: 釠翅洿岵囜洺, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0465 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: 釠丰洸岵囜矆, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1630 f2339;

    /* JADX INFO: renamed from: 釠丰浉釠滇矅, reason: contains not printable characters */
    public final /* synthetic */ int f2340;

    public /* synthetic */ ViewOnClickListenerC0465(defpackage.C1630 r1, int r2) {
            r0 = this;
            r0.f2340 = r2
            r0.f2339 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r35) {
            r34 = this;
            r0 = r34
            int r1 = r0.f2340
            r13 = 4
            r14 = 2
            r16 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            r2 = 1711866084(0x660900e4, float:1.6174516E23)
            r3 = 1711866048(0x660900c0, float:1.6174451E23)
            r18 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r4 = 17
            r5 = -2
            r20 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            r6 = 3
            r7 = 1712259275(0x660f00cb, float:1.6882826E23)
            r35 = 300(0x12c, float:4.2E-43)
            r12 = 17170445(0x106000d, float:2.461195E-38)
            r22 = 142(0x8e, float:1.99E-43)
            r15 = 0
            r8 = 0
            r9 = 1
            岵€釠册浂岵?r10 = r0.f2339
            switch(r1) {
                case 0: goto L44c;
                case 1: goto L3dd;
                case 2: goto L3c8;
                case 3: goto L3b2;
                case 4: goto L34c;
                case 5: goto L2c7;
                case 6: goto L2c1;
                case 7: goto L2bb;
                case 8: goto L273;
                case 9: goto L1bb;
                case 10: goto Le6;
                case 11: goto L39;
                case 12: goto L35;
                default: goto L31;
            }
        L31:
            r10.m2989()
            return
        L35:
            r10.m2989()
            return
        L39:
            android.content.Context r0 = r10.f7258
            岵囜洿岵囜洺 r1 = new 岵囜洿岵囜洺
            r1.<init>(r10, r8)
            r2 = -102229096177198(0xffffa305ef0961d2, double:NaN)
            r2 = -102263455915566(0xffffa2fdef0961d2, double:NaN)
            釠册瞼釠贬瞾 r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1051(r0)
            android.view.LayoutInflater r2 = defpackage.AbstractC1668.m3063(r0)
            r3 = 1712062552(0x660c0058, float:1.6528441E23)
            android.view.View r2 = r2.inflate(r3, r15)
            r3 = 1711866678(0x66090336, float:1.6175586E23)
            android.view.View r3 = r2.findViewById(r3)
            r30 = r3
            釠贬洺釠夺洷 r30 = (defpackage.C0055) r30
            r3 = 1711866490(0x6609027a, float:1.6175247E23)
            android.view.View r3 = r2.findViewById(r3)
            r31 = r3
            android.widget.LinearLayout r31 = (android.widget.LinearLayout) r31
            r3 = 1711866444(0x6609024c, float:1.6175164E23)
            android.view.View r3 = r2.findViewById(r3)
            r32 = r3
            android.widget.ImageView r32 = (android.widget.ImageView) r32
            r3 = 1711866989(0x6609046d, float:1.6176146E23)
            android.view.View r3 = r2.findViewById(r3)
            r33 = r3
            android.widget.TextView r33 = (android.widget.TextView) r33
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r0, r7)
            android.app.AlertDialog$Builder r2 = r3.setView(r2)
            android.app.AlertDialog$Builder r2 = r2.setCancelable(r9)
            android.app.AlertDialog r29 = r2.create()
            android.view.Window r2 = r29.getWindow()
            if (r2 == 0) goto La9
            r2.setBackgroundDrawableResource(r12)
        La9:
            釠贬浀釠瘁洸 r27 = new 釠贬浀釠瘁洸
            r28 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r2 = r27
            r0 = r29
            r7 = -138418490613294(0xffff821bef0961d2, double:NaN)
            r2.f843 = r1
            釠册瞾釠册洺 r1 = new 釠册瞾釠册洺
            r1.<init>(r6, r2)
            r0.setOnDismissListener(r1)
            r0.show()
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto Le5
            r0.setBackgroundDrawableResource(r12)
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r2 = 340(0x154, float:4.76E-43)
            int r2 = defpackage.AbstractC2093.m3510(r2)
            r1.width = r2
            r1.height = r5
            r1.gravity = r4
            r0.setAttributes(r1)
        Le5:
            return
        Le6:
            釠册瞼釠贬瞾 r1 = defpackage.C0346.f1773
            岵€釠册浂岵?r0 = r0.f2339
            android.content.Context r6 = r0.f7258
            r1.getClass()
            defpackage.C0346.m1051(r6)
            android.view.LayoutInflater r1 = defpackage.AbstractC1668.m3063(r6)
            r8 = 1712062523(0x660c003b, float:1.6528389E23)
            android.view.View r1 = r1.inflate(r8, r15)
            r8 = 1711866285(0x660901ad, float:1.6174878E23)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.EditText r8 = (android.widget.EditText) r8
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10 = 1711866068(0x660900d4, float:1.6174487E23)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 1711866662(0x66090326, float:1.6175557E23)
            android.view.View r11 = r1.findViewById(r11)
            r18 = r11
            android.widget.RadioGroup r18 = (android.widget.RadioGroup) r18
            r11 = 1711866647(0x66090317, float:1.617553E23)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.RadioButton r11 = (android.widget.RadioButton) r11
            r15 = 1711866648(0x66090318, float:1.6175532E23)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.RadioButton r15 = (android.widget.RadioButton) r15
            釠夺瞼釠?r16 = defpackage.C1141.f5173
            r16.getClass()
            岵€岵囜浉釠?r4 = defpackage.C1141.f5142
            岵佱浄釠夺浂[] r16 = defpackage.C1141.f5221
            r5 = r16[r22]
            java.lang.Object r4 = r4.m3169(r5)
            java.lang.String r4 = (java.lang.String) r4
            r8.setText(r4)
            int r4 = defpackage.C1141.m2198()
            if (r4 == r9) goto L159
            if (r4 == r14) goto L155
            goto L15c
        L155:
            r15.setChecked(r9)
            goto L15c
        L159:
            r11.setChecked(r9)
        L15c:
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r4.<init>(r6, r7)
            android.app.AlertDialog$Builder r1 = r4.setView(r1)
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r9)
            android.app.AlertDialog r1 = r1.create()
            android.view.Window r4 = r1.getWindow()
            if (r4 == 0) goto L176
            r4.setBackgroundDrawableResource(r12)
        L176:
            岵堘洺釠?r4 = new 岵堘洺釠?
            r4.<init>(r1, r9)
            r3.setOnClickListener(r4)
            岵€岵囜浂 r16 = new 岵€岵囜浂
            r21 = 1
            r20 = r0
            r19 = r1
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r0 = r16
            r1 = r20
            r2.setOnClickListener(r0)
            釠翅洿岵囜洺 r0 = new 釠翅洿岵囜洺
            r0.<init>(r1, r13)
            r10.setOnClickListener(r0)
            r19.show()
            android.view.Window r0 = r19.getWindow()
            if (r0 == 0) goto L1ba
            r0.setBackgroundDrawableResource(r12)
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            int r2 = defpackage.AbstractC2093.m3510(r35)
            r1.width = r2
            r2 = -2
            r1.height = r2
            r2 = 17
            r1.gravity = r2
            r0.setAttributes(r1)
        L1ba:
            return
        L1bb:
            boolean r0 = r10.f7255
            r0 = r0 ^ r9
            r10.f7255 = r0
            r0 = -86556760514094(0xffffb146ef0961d2, double:NaN)
            java.lang.String r0 = "鍒囨崲鎺掑簭: "
            boolean r1 = r10.f7255
            if (r1 == 0) goto L1d7
            r1 = -86586825285166(0xffffb13fef0961d2, double:NaN)
        L1d2:
            java.lang.String r1 = "鍊掑簭"
            goto L1dd
        L1d7:
            r1 = -86599710187054(0xffffb13cef0961d2, double:NaN)
            goto L1d2
        L1dd:
            java.lang.String r0 = r0.concat(r1)
            r1 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            r3 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            int r1 = defpackage.AbstractC0225.m818(r3, r0, r1)
            if (r1 != 0) goto L1f2
            goto L20e
        L1f2:
            int r1 = r0.length()
        L1f6:
            if (r8 >= r1) goto L20e
            int r2 = r8 + 2000
            if (r2 <= r1) goto L1fd
            r2 = r1
        L1fd:
            java.lang.String r3 = r0.substring(r8, r2)
            釠册瞼釠贬瞾 r4 = defpackage.C0346.f1773
            r4.getClass()
            defpackage.C0346.m1040(r3)
            r8 = r2
            goto L1f6
        L20e:
            android.widget.ImageView r0 = r10.f7260
            if (r0 == 0) goto L220
            boolean r1 = r10.f7255
            if (r1 == 0) goto L21a
            r1 = 1711800601(0x66080119, float:1.6056552E23)
            goto L21d
        L21a:
            r1 = 1711800600(0x66080118, float:1.605655E23)
        L21d:
            r0.setImageResource(r1)
        L220:
            java.util.List r0 = r10.f7251
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L229
            goto L272
        L229:
            java.util.List r0 = r10.f7251
            岵囜浀岵€岵?r1 = new 岵囜浀岵€岵?
            r1.<init>(r13)
            boolean r2 = r10.f7255
            if (r2 == 0) goto L23b
            岵囜浀岵€岵?r2 = new 岵囜浀岵€岵?
            r3 = 6
            r2.<init>(r3)
            goto L241
        L23b:
            岵囜浀岵€岵?r2 = new 岵囜浀岵€岵?
            r3 = 5
            r2.<init>(r3)
        L241:
            釠滇洸釠羔洿 r3 = new 釠滇洸釠羔洿
            r3.<init>(r1, r2)
            java.util.List r0 = defpackage.AbstractC1107.m2116(r0, r3)
            r10.f7251 = r0
            android.widget.EditText r0 = r10.f7236
            if (r0 == 0) goto L266
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L266
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L266
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L26f
        L266:
            r0 = -84709924576814(0xffffb2f4ef0961d2, double:NaN)
            java.lang.String r0 = ""
        L26f:
            r10.m2986(r0)
        L272:
            return
        L273:
            java.lang.String r0 = r10.f7274
            if (r0 == 0) goto L2ba
            r1 = -86526695743022(0xffffb14def0961d2, double:NaN)
            java.lang.String r1 = "鍒锋柊鐩綍: "
            java.lang.String r1 = r1.concat(r0)
            r25 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r23 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r2 = r1.length()
            if (r2 != 0) goto L29b
            goto L2b7
        L29b:
            int r2 = r1.length()
        L29f:
            if (r8 >= r2) goto L2b7
            int r3 = r8 + 2000
            if (r3 <= r2) goto L2a6
            r3 = r2
        L2a6:
            java.lang.String r4 = r1.substring(r8, r3)
            釠册瞼釠贬瞾 r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1040(r4)
            r8 = r3
            goto L29f
        L2b7:
            r10.m2990(r0)
        L2ba:
            return
        L2bb:
            岵囜瞾釠夺浂 r0 = defpackage.EnumC2129.f9099
            r10.m2988(r0)
            return
        L2c1:
            岵囜瞾釠夺浂 r0 = defpackage.EnumC2129.f9100
            r10.m2988(r0)
            return
        L2c7:
            釠册瞼釠贬瞾 r0 = defpackage.C0346.f1773
            android.content.Context r1 = r10.f7258
            r0.getClass()
            defpackage.C0346.m1051(r1)
            android.view.LayoutInflater r0 = defpackage.AbstractC1668.m3063(r1)
            r4 = 1712062533(0x660c0045, float:1.6528407E23)
            android.view.View r0 = r0.inflate(r4, r15)
            r4 = 1711866291(0x660901b3, float:1.6174889E23)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r5 = r10.f7274
            if (r5 != 0) goto L2fe
            r5 = -82536671125038(0xffffb4eeef0961d2, double:NaN)
            java.lang.String r5 = ""
        L2fe:
            r4.setText(r5)
            android.app.AlertDialog$Builder r5 = new android.app.AlertDialog$Builder
            r5.<init>(r1, r7)
            android.app.AlertDialog$Builder r0 = r5.setView(r0)
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r9)
            android.app.AlertDialog r0 = r0.create()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L31b
            r1.setBackgroundDrawableResource(r12)
        L31b:
            岵堘洺釠?r1 = new 岵堘洺釠?
            r1.<init>(r0, r14)
            r3.setOnClickListener(r1)
            岵囜浉岵€岵?r1 = new 岵囜浉岵€岵?
            r1.<init>(r4, r10, r0, r8)
            r2.setOnClickListener(r1)
            r0.show()
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L34b
            r0.setBackgroundDrawableResource(r12)
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            int r2 = defpackage.AbstractC2093.m3510(r35)
            r1.width = r2
            r2 = -2
            r1.height = r2
            r2 = 17
            r1.gravity = r2
            r0.setAttributes(r1)
        L34b:
            return
        L34c:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L37d
            r1 = -85667702283822(0xffffb215ef0961d2, double:NaN)
            java.lang.String r1 = "android.intent.action.VIEW"     // Catch: java.lang.Exception -> L37d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L37d
            r1 = -85783666400814(0xffffb1faef0961d2, double:NaN)
            java.lang.String r1 = "https://109a.cn/"     // Catch: java.lang.Exception -> L37d
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> L37d
            r2 = -85856680844846(0xffffb1e9ef0961d2, double:NaN)
            r0.setData(r1)     // Catch: java.lang.Exception -> L37d
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)     // Catch: java.lang.Exception -> L37d
            android.content.Context r1 = r10.f7258     // Catch: java.lang.Exception -> L37d
            r1.startActivity(r0)     // Catch: java.lang.Exception -> L37d
            goto L3b1
        L37d:
            r0 = move-exception
            r1 = -85903925485102(0xffffb1deef0961d2, double:NaN)
            java.lang.String r1 = "鎵撳紑娴忚鍣ㄥけ璐?
            釠册瞼釠贬瞾 r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -85938285223470(0xffffb1d6ef0961d2, double:NaN)
            java.lang.String r2 = "鎵撳紑娴忚鍣ㄥけ璐? "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.AbstractC0209.m764(r0)
        L3b1:
            return
        L3b2:
            android.widget.EditText r0 = r10.f7236
            if (r0 == 0) goto L3c2
            r1 = -86522400775726(0xffffb14eef0961d2, double:NaN)
            java.lang.String r1 = ""
            r0.setText(r1)
        L3c2:
            if (r0 == 0) goto L3c7
            r0.clearFocus()
        L3c7:
            return
        L3c8:
            r10.m2983()
            r10.m2984()
            android.widget.LinearLayout r0 = r10.f7244
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r10.f7267
            r0.setVisibility(r8)
            r10.f7253 = r15
            return
        L3dd:
            android.widget.ImageView r0 = r10.f7241
            android.media.MediaPlayer r1 = r10.f7268
            if (r1 != 0) goto L3e4
            goto L44b
        L3e4:
            boolean r2 = r10.f7269     // Catch: java.lang.Exception -> L3f7
            if (r2 == 0) goto L3f9
            r1.pause()     // Catch: java.lang.Exception -> L3f7
            r1 = 1711800653(0x6608014d, float:1.6056646E23)
            r0.setImageResource(r1)     // Catch: java.lang.Exception -> L3f7
            r10.f7269 = r8     // Catch: java.lang.Exception -> L3f7
            r10.m2984()     // Catch: java.lang.Exception -> L3f7
            goto L44b
        L3f7:
            r0 = move-exception
            goto L418
        L3f9:
            defpackage.AbstractC1171.m2257()     // Catch: java.lang.Exception -> L3f7
            r1.start()     // Catch: java.lang.Exception -> L3f7
            r1 = 1711800652(0x6608014c, float:1.6056644E23)
            r0.setImageResource(r1)     // Catch: java.lang.Exception -> L3f7
            r10.f7269 = r9     // Catch: java.lang.Exception -> L3f7
            r10.m2984()     // Catch: java.lang.Exception -> L3f7
            釠翅瞾釠翅洿 r0 = r10.f7263     // Catch: java.lang.Exception -> L3f7
            釠丰浄釠夺洸 r1 = new 釠丰浄釠夺洸     // Catch: java.lang.Exception -> L3f7
            r1.<init>(r10, r15, r9)     // Catch: java.lang.Exception -> L3f7
            釠滇矆岵囜浀 r0 = defpackage.AbstractC0397.m1149(r0, r15, r1, r6)     // Catch: java.lang.Exception -> L3f7
            r10.f7243 = r0     // Catch: java.lang.Exception -> L3f7
            goto L44b
        L418:
            r1 = -84563895688750(0xffffb316ef0961d2, double:NaN)
            java.lang.String r1 = "鎾斁澶辫触"
            釠册瞼釠贬瞾 r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -84585370525230(0xffffb311ef0961d2, double:NaN)
            java.lang.String r2 = "鎾斁澶辫触: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.AbstractC0209.m764(r0)
        L44b:
            return
        L44c:
            岵€釠册浂岵?r8 = r0.f2339
            boolean r0 = r8.f7259
            if (r0 == 0) goto L454
            goto L4d5
        L454:
            釠夺瞼釠?r0 = defpackage.C1141.f5173
            r0.getClass()
            岵€岵囜浉釠?r0 = defpackage.C1141.f5142
            岵佱浄釠夺浂[] r1 = defpackage.C1141.f5221
            r2 = r1[r22]
            java.lang.Object r0 = r0.m3169(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r11 = r0.toString()
            android.widget.EditText r0 = r8.f7272
            java.lang.String r9 = defpackage.AbstractC0225.m809(r0)
            int r0 = r11.length()
            if (r0 != 0) goto L486
            r0 = -83374189747758(0xffffb42bef0961d2, double:NaN)
            java.lang.String r0 = "璇峰厛璁剧疆API瀵嗛挜"
            defpackage.AbstractC0209.m764(r0)
            goto L4d5
        L486:
            int r0 = r9.length()
            if (r0 != 0) goto L499
            r0 = -83417139420718(0xffffb421ef0961d2, double:NaN)
            java.lang.String r0 = "璇疯緭鍏ヨ杞崲鐨勬枃鏈?
            defpackage.AbstractC0209.m764(r0)
            goto L4d5
        L499:
            android.widget.Spinner r0 = r8.f7245
            java.lang.Object r0 = r0.getSelectedItem()
            boolean r2 = r0 instanceof defpackage.C1093
            if (r2 == 0) goto L4a7
            釠夺浂釠夺洸 r0 = (defpackage.C1093) r0
            r10 = r0
            goto L4a8
        L4a7:
            r10 = r15
        L4a8:
            if (r10 != 0) goto L4b7
            r0 = -83460089093678(0xffffb417ef0961d2, double:NaN)
            java.lang.String r0 = "璇烽€夋嫨闊宠壊"
            defpackage.AbstractC0209.m764(r0)
            goto L4d5
        L4b7:
            java.lang.String r0 = r10.f4889
            r2 = -19400651873838(0xffffee5aef0961d2, double:NaN)
            岵€岵囜浉釠?r2 = defpackage.C1141.f5216
            r3 = 143(0x8f, float:2.0E-43)
            r1 = r1[r3]
            r2.m3168(r1, r0)
            釠翅瞾釠翅洿 r0 = r8.f7263
            釠滇洸釠羔洷 r7 = new 釠滇洸釠羔洷
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            defpackage.AbstractC0397.m1149(r0, r15, r7, r6)
        L4d5:
            return
    }
}
