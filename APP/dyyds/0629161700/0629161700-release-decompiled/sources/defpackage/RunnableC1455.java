package defpackage;

/* JADX INFO: renamed from: ᛸᛳᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1455 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f6396;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f6397;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6398;

    public /* synthetic */ RunnableC1455(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f6398 = r2
            r0.f6397 = r1
            r0.f6396 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC1455(java.lang.Runnable r2, defpackage.ExecutorC0456 r3) {
            r1 = this;
            r0 = 10
            r1.f6398 = r0
            r1.<init>()
            r1.f6396 = r2
            r1.f6397 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r48 = this;
            r0 = r48
            int r1 = r0.f6398
            r3 = 1
            r4 = 2
            r5 = 0
            java.lang.Object r6 = r0.f6396
            java.lang.Object r0 = r0.f6397
            switch(r1) {
                case 0: goto L651;
                case 1: goto L649;
                case 2: goto L621;
                case 3: goto L5f6;
                case 4: goto L5df;
                case 5: goto L5d7;
                case 6: goto L5cf;
                case 7: goto L5c7;
                case 8: goto L46;
                case 9: goto L3a;
                case 10: goto L29;
                case 11: goto L16;
                default: goto Le;
            }
        Le:
            ᛶᲇᲀᲇ r0 = (defpackage.C1175) r0
            android.view.View r6 = (android.view.View) r6
            r0.m2286(r6)
            return
        L16:
            ᲀᲀᛱᛱ r0 = (defpackage.C1730) r0
            ᲁᛶᲁ r6 = (defpackage.C1876) r6
            int[] r1 = new int[r4]
            android.widget.LinearLayout r0 = r0.f7656
            r0.getLocationOnScreen(r1)
            r0 = r1[r5]
            r1 = r1[r3]
            r6.m3287(r0, r1)
            return
        L29:
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r1 = r0
            ᛳᛴᛶᛲ r1 = (defpackage.ExecutorC0456) r1
            r6.run()     // Catch: java.lang.Throwable -> L35
            r1.m1239()
            return
        L35:
            r0 = move-exception
            r1.m1239()
            throw r0
        L3a:
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r6 = (java.lang.String) r6
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r6, r5)
            r0.show()
            return
        L46:
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.content.Context r6 = (android.content.Context) r6
            ᲀᛳᛸᲁ r1 = defpackage.C1647.f7340
            r0.removeAllViews()
            ᛶᲀᛵ r4 = defpackage.C1141.f5173
            r4.getClass()
            int r4 = defpackage.C1141.m2191()
            r7 = 4
            if (r4 != r7) goto L5f
            r8 = 1712062615(0x660c0097, float:1.6528555E23)
            goto L62
        L5f:
            r8 = 1712062616(0x660c0098, float:1.6528557E23)
        L62:
            ᛲᲀᛱᲁ r9 = defpackage.C0346.f1773
            r9.getClass()
            defpackage.C0346.m1051(r6)
            android.view.LayoutInflater r9 = defpackage.AbstractC1668.m3063(r6)
            android.view.View r8 = r9.inflate(r8, r0, r5)
            r0.addView(r8)
            ᲀᲇᛸᛶ r9 = defpackage.C1141.f5201
            ᲁᛷᛶᛶ[] r10 = defpackage.C1141.f5221
            r11 = 62
            r11 = r10[r11]
            java.lang.Object r9 = r9.m3169(r11)
            java.lang.String r9 = (java.lang.String) r9
            r11 = -114319429115438(0xffff9806ef0961d2, double:NaN)
            java.lang.String r11 = ","
            java.lang.String[] r11 = new java.lang.String[]{r11}
            r12 = 6
            java.util.List r9 = defpackage.AbstractC1347.m2519(r9, r11, r12)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r9)
            ᲀᲇᛸᛶ r9 = defpackage.C1141.f5166
            r13 = 61
            r10 = r10[r13]
            java.lang.Object r9 = r9.m3169(r10)
            java.lang.String r9 = (java.lang.String) r9
            r13 = -114328019050030(0xffff9804ef0961d2, double:NaN)
            java.lang.String r10 = ","
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.util.List r9 = defpackage.AbstractC1347.m2519(r9, r10, r12)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            r16 = 0
            r9 = 1711865984(0x66090080, float:1.6174336E23)
            r12 = 1711865983(0x6609007f, float:1.6174334E23)
            r13 = 1711865982(0x6609007e, float:1.6174332E23)
            r14 = 1711865981(0x6609007d, float:1.617433E23)
            r15 = 1711865980(0x6609007c, float:1.6174329E23)
            r2 = 1711865979(0x6609007b, float:1.6174327E23)
            r5 = 1711865978(0x6609007a, float:1.6174325E23)
            r3 = 1711865977(0x66090079, float:1.6174323E23)
            if (r4 != r7) goto L335
            android.view.View r4 = defpackage.AbstractC1193.m2331(r8, r3)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L31a
            android.view.View r3 = defpackage.AbstractC1193.m2331(r8, r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L318
            android.view.View r5 = defpackage.AbstractC1193.m2331(r8, r2)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L316
            android.view.View r2 = defpackage.AbstractC1193.m2331(r8, r15)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L314
            android.view.View r6 = defpackage.AbstractC1193.m2331(r8, r14)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L312
            android.view.View r7 = defpackage.AbstractC1193.m2331(r8, r13)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L310
            android.view.View r13 = defpackage.AbstractC1193.m2331(r8, r12)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            if (r13 == 0) goto L30e
            android.view.View r12 = defpackage.AbstractC1193.m2331(r8, r9)
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L31b
            r9 = 1711866112(0x66090100, float:1.6174566E23)
            android.view.View r14 = defpackage.AbstractC1193.m2331(r8, r9)
            com.android.app.CustomCardView r14 = (com.android.app.CustomCardView) r14
            if (r14 == 0) goto L31b
            r9 = 1711866122(0x6609010a, float:1.6174584E23)
            android.view.View r14 = defpackage.AbstractC1193.m2331(r8, r9)
            com.android.app.CustomCardView r14 = (com.android.app.CustomCardView) r14
            if (r14 == 0) goto L31b
            r9 = 1711866123(0x6609010b, float:1.6174586E23)
            android.view.View r14 = defpackage.AbstractC1193.m2331(r8, r9)
            com.android.app.CustomCardView r14 = (com.android.app.CustomCardView) r14
            if (r14 == 0) goto L31b
            r14 = 1711866912(0x66090420, float:1.6176008E23)
            android.view.View r9 = defpackage.AbstractC1193.m2331(r8, r14)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L30a
            r14 = 1711866913(0x66090421, float:1.617601E23)
            android.view.View r15 = defpackage.AbstractC1193.m2331(r8, r14)
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L306
            r14 = 1711866914(0x66090422, float:1.6176011E23)
            android.view.View r24 = defpackage.AbstractC1193.m2331(r8, r14)
            r14 = r24
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            if (r14 == 0) goto L302
            r26 = r1
            r1 = 1711866915(0x66090423, float:1.6176013E23)
            android.view.View r23 = defpackage.AbstractC1193.m2331(r8, r1)
            r1 = r23
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L2fe
            r27 = r10
            r10 = 1711866916(0x66090424, float:1.6176015E23)
            android.view.View r22 = defpackage.AbstractC1193.m2331(r8, r10)
            r10 = r22
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L2fa
            r28 = r11
            r11 = 1711866917(0x66090425, float:1.6176017E23)
            android.view.View r21 = defpackage.AbstractC1193.m2331(r8, r11)
            r11 = r21
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L2f6
            r29 = r0
            r0 = 1711866918(0x66090426, float:1.6176018E23)
            android.view.View r20 = defpackage.AbstractC1193.m2331(r8, r0)
            r0 = r20
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            if (r0 == 0) goto L2f2
            r30 = r6
            r6 = 1711866919(0x66090427, float:1.617602E23)
            android.view.View r19 = defpackage.AbstractC1193.m2331(r8, r6)
            r6 = r19
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L2ee
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r19 = -114336608984622(0xffff9802ef0961d2, double:NaN)
            r26.getClass()
            kotlin.Pair[] r8 = defpackage.C0383.f1997
            r31 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r32 = r12
            int r12 = r8.length
            r7.<init>(r12)
            int r12 = r8.length
            r48 = r8
            r8 = 0
        L1c4:
            if (r8 >= r12) goto L1d8
            r19 = r48[r8]
            java.lang.Object r19 = r19.getFirst()
            r20 = r8
            r8 = r19
            java.lang.String r8 = (java.lang.String) r8
            r7.add(r8)
            int r8 = r20 + 1
            goto L1c4
        L1d8:
            kotlin.Pair[] r8 = defpackage.C0048.f567
            java.util.ArrayList r12 = new java.util.ArrayList
            r48 = r7
            int r7 = r8.length
            r12.<init>(r7)
            int r7 = r8.length
            r19 = r8
            r8 = 0
        L1e6:
            if (r8 >= r7) goto L1fc
            r20 = r19[r8]
            java.lang.Object r20 = r20.getFirst()
            r21 = r7
            r7 = r20
            java.lang.String r7 = (java.lang.String) r7
            r12.add(r7)
            int r8 = r8 + 1
            r7 = r21
            goto L1e6
        L1fc:
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r1, r14)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r15, r9)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r6, r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r11, r10)
            kotlin.Pair r6 = new kotlin.Pair
            r6.<init>(r2, r5)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r3, r4)
            kotlin.Pair r3 = new kotlin.Pair
            r4 = r32
            r3.<init>(r4, r13)
            kotlin.Pair r4 = new kotlin.Pair
            r5 = r30
            r9 = r31
            r4.<init>(r9, r5)
            r36 = r0
            r34 = r1
            r38 = r2
            r39 = r3
            r40 = r4
            r37 = r6
            r33 = r7
            r35 = r8
            kotlin.Pair[] r0 = new kotlin.Pair[]{r33, r34, r35, r36, r37, r38, r39, r40}
            java.util.List r0 = defpackage.AbstractC0425.m1186(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.AbstractC0575.m1369(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L250:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2af
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L2ab
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.component1()
            r6 = -107559150591534(0xffff9e2cef0961d2, double:NaN)
            r22 = r5
            android.widget.TextView r22 = (android.widget.TextView) r22
            java.lang.Object r3 = r3.component2()
            r5 = -107627870068270(0xffff9e1cef0961d2, double:NaN)
            r23 = r3
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            int r3 = r2 % 2
            if (r3 != 0) goto L286
            r3 = 1
            goto L287
        L286:
            r3 = 0
        L287:
            if (r3 == 0) goto L28c
            r20 = r28
            goto L28e
        L28c:
            r20 = r27
        L28e:
            if (r3 == 0) goto L293
            r21 = r48
            goto L295
        L293:
            r21 = r12
        L295:
            ᛴᲁᲁᲇ r5 = new ᛴᲁᲁᲇ
            r6 = 1
            r5.<init>(r6, r3)
            ᛴᛴᲀᛲ r19 = new ᛴᛴᲀᛲ
            int r24 = r2 / 2
            r25 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r2 = r19
            r1.add(r2)
            r2 = r4
            goto L250
        L2ab:
            defpackage.AbstractC0425.m1196()
            throw r16
        L2af:
            java.util.Iterator r0 = r1.iterator()
        L2b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a4
            java.lang.Object r1 = r0.next()
            ᛴᛴᲀᛲ r1 = (defpackage.C0659) r1
            ᛶᛱᛵᛳ r2 = new ᛶᛱᛵᛳ
            r2.<init>()
            java.util.ArrayList r3 = r1.f3209
            int r4 = r1.f3206
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            r2.f4472 = r3
            android.widget.TextView r4 = r1.f3208
            java.util.ArrayList r5 = r1.f3210
            java.lang.Object r3 = r5.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4.setText(r3)
            android.widget.LinearLayout r3 = r1.f3207
            ᛳᛲᛶᛶ r4 = new ᛳᛲᛶᛶ
            r5 = 13
            r4.<init>(r2, r5, r1)
            r3.setOnClickListener(r4)
            goto L2b3
        L2ee:
            r9 = 1711866919(0x66090427, float:1.617602E23)
            goto L31b
        L2f2:
            r9 = 1711866918(0x66090426, float:1.6176018E23)
            goto L31b
        L2f6:
            r9 = 1711866917(0x66090425, float:1.6176017E23)
            goto L31b
        L2fa:
            r9 = 1711866916(0x66090424, float:1.6176015E23)
            goto L31b
        L2fe:
            r9 = 1711866915(0x66090423, float:1.6176013E23)
            goto L31b
        L302:
            r9 = 1711866914(0x66090422, float:1.6176011E23)
            goto L31b
        L306:
            r9 = 1711866913(0x66090421, float:1.617601E23)
            goto L31b
        L30a:
            r9 = 1711866912(0x66090420, float:1.6176008E23)
            goto L31b
        L30e:
            r9 = r12
            goto L31b
        L310:
            r9 = r13
            goto L31b
        L312:
            r9 = r14
            goto L31b
        L314:
            r9 = r15
            goto L31b
        L316:
            r9 = r2
            goto L31b
        L318:
            r9 = r5
            goto L31b
        L31a:
            r9 = r3
        L31b:
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r0 = r0.getResourceName(r9)
            r1 = -1167527014473262(0xfffbda23ef0961d2, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3673(r0)
            goto L5c6
        L335:
            r29 = r0
            r26 = r1
            r27 = r10
            r28 = r11
            r26.getClass()
            kotlin.Pair[] r0 = defpackage.C0383.f1997
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r0.length
            r1.<init>(r4)
            int r4 = r0.length
            r7 = 0
        L34a:
            if (r7 >= r4) goto L35a
            r10 = r0[r7]
            java.lang.Object r10 = r10.getFirst()
            java.lang.String r10 = (java.lang.String) r10
            r1.add(r10)
            int r7 = r7 + 1
            goto L34a
        L35a:
            kotlin.Pair[] r0 = defpackage.C0048.f567
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = r0.length
            r4.<init>(r7)
            int r7 = r0.length
            r10 = 0
        L364:
            if (r10 >= r7) goto L374
            r11 = r0[r10]
            java.lang.Object r11 = r11.getFirst()
            java.lang.String r11 = (java.lang.String) r11
            r4.add(r11)
            int r10 = r10 + 1
            goto L364
        L374:
            r10 = 1711866915(0x66090423, float:1.6176013E23)
            android.view.View r0 = r8.findViewById(r10)
            r7 = 1711866914(0x66090422, float:1.6176011E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r10 = new kotlin.Pair
            r10.<init>(r0, r7)
            r0 = 1711866913(0x66090421, float:1.617601E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866912(0x66090420, float:1.6176008E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r11 = new kotlin.Pair
            r11.<init>(r0, r7)
            r0 = 1711866911(0x6609041f, float:1.6176006E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866910(0x6609041e, float:1.6176004E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r0, r7)
            r0 = 1711866909(0x6609041d, float:1.6176002E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866908(0x6609041c, float:1.6176E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r13 = new kotlin.Pair
            r13.<init>(r0, r7)
            r0 = 1711866919(0x66090427, float:1.617602E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866918(0x66090426, float:1.6176018E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r0, r7)
            r0 = 1711866917(0x66090425, float:1.6176017E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866916(0x66090424, float:1.6176015E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r0, r7)
            r0 = 1711866546(0x660902b2, float:1.6175348E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866545(0x660902b1, float:1.6175346E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r0, r7)
            r0 = 1711866544(0x660902b0, float:1.6175345E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866543(0x660902af, float:1.6175343E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r0, r7)
            r0 = 1711866542(0x660902ae, float:1.6175341E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866541(0x660902ad, float:1.617534E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r7)
            r0 = 1711866540(0x660902ac, float:1.6175337E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866539(0x660902ab, float:1.6175336E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r0, r7)
            r0 = 1711866550(0x660902b6, float:1.6175355E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866549(0x660902b5, float:1.6175354E23)
            android.view.View r7 = r8.findViewById(r7)
            r26 = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 1711866548(0x660902b4, float:1.6175352E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711866547(0x660902b3, float:1.617535E23)
            android.view.View r7 = r8.findViewById(r7)
            r40 = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 1711865980(0x6609007c, float:1.6174329E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711865979(0x6609007b, float:1.6174327E23)
            android.view.View r7 = r8.findViewById(r7)
            r41 = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 1711865978(0x6609007a, float:1.6174325E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711865977(0x66090079, float:1.6174323E23)
            android.view.View r7 = r8.findViewById(r7)
            r42 = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 1711865976(0x66090078, float:1.6174321E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711865975(0x66090077, float:1.617432E23)
            android.view.View r7 = r8.findViewById(r7)
            r43 = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 1711865974(0x66090076, float:1.6174318E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711865973(0x66090075, float:1.6174316E23)
            android.view.View r7 = r8.findViewById(r7)
            r44 = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 1711865984(0x66090080, float:1.6174336E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711865983(0x6609007f, float:1.6174334E23)
            android.view.View r7 = r8.findViewById(r7)
            r45 = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r0, r7)
            r0 = 1711865982(0x6609007e, float:1.6174332E23)
            android.view.View r0 = r8.findViewById(r0)
            r7 = 1711865981(0x6609007d, float:1.617433E23)
            android.view.View r7 = r8.findViewById(r7)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r0, r7)
            r46 = r1
            r38 = r2
            r36 = r3
            r37 = r5
            r47 = r8
            r35 = r9
            r30 = r10
            r31 = r11
            r34 = r12
            r33 = r13
            r32 = r14
            r39 = r15
            kotlin.Pair[] r0 = new kotlin.Pair[]{r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47}
            java.util.List r0 = defpackage.AbstractC0425.m1186(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.AbstractC0575.m1369(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L506:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L565
            java.lang.Object r3 = r0.next()
            int r5 = r2 + 1
            if (r2 < 0) goto L561
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r7 = r3.component1()
            r8 = -110179080642094(0xffff9bcaef0961d2, double:NaN)
            r22 = r7
            android.widget.TextView r22 = (android.widget.TextView) r22
            java.lang.Object r3 = r3.component2()
            r7 = -110247800118830(0xffff9bbaef0961d2, double:NaN)
            r23 = r3
            android.widget.LinearLayout r23 = (android.widget.LinearLayout) r23
            int r3 = r2 % 2
            if (r3 != 0) goto L53c
            r3 = 1
            goto L53d
        L53c:
            r3 = 0
        L53d:
            if (r3 == 0) goto L542
            r20 = r28
            goto L544
        L542:
            r20 = r27
        L544:
            if (r3 == 0) goto L549
            r21 = r26
            goto L54b
        L549:
            r21 = r4
        L54b:
            ᛴᲁᲁᲇ r7 = new ᛴᲁᲁᲇ
            r8 = 0
            r7.<init>(r8, r3)
            ᛴᛴᲀᛲ r19 = new ᛴᛴᲀᛲ
            int r24 = r2 / 2
            r25 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r2 = r19
            r1.add(r2)
            r2 = r5
            goto L506
        L561:
            defpackage.AbstractC0425.m1196()
            throw r16
        L565:
            java.util.Iterator r0 = r1.iterator()
        L569:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a4
            java.lang.Object r1 = r0.next()
            ᛴᛴᲀᛲ r1 = (defpackage.C0659) r1
            ᛶᛱᛵᛳ r2 = new ᛶᛱᛵᛳ
            r2.<init>()
            java.util.ArrayList r3 = r1.f3209
            int r4 = r1.f3206
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            r2.f4472 = r3
            android.widget.TextView r4 = r1.f3208
            java.util.ArrayList r5 = r1.f3210
            java.lang.Object r3 = r5.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4.setText(r3)
            android.widget.LinearLayout r3 = r1.f3207
            ᲇᛸᲀᲁ r4 = new ᲇᛸᲀᲁ
            r5 = 14
            r4.<init>(r2, r1, r6, r5)
            r3.setOnClickListener(r4)
            goto L569
        L5a4:
            r0 = 0
            r1 = r29
            r1.setAlpha(r0)
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            r0.start()
        L5c6:
            return
        L5c7:
            ᛲᲈᛸᛷ r0 = (defpackage.C0394) r0
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            r0.m1137(r6)
            return
        L5cf:
            com.ss.android.ugc.awemes.MainActivity r0 = (com.ss.android.ugc.awemes.MainActivity) r0
            ᲁᛴᲈᲁ r6 = (defpackage.C1851) r6
            com.ss.android.ugc.awemes.MainActivity.m293(r0, r6)
            return
        L5d7:
            com.ss.android.ugc.awemes.MainActivity r0 = (com.ss.android.ugc.awemes.MainActivity) r0
            ᛱᲇᛳᲇ r6 = (defpackage.C0195) r6
            com.ss.android.ugc.awemes.MainActivity.m294(r0, r6)
            return
        L5df:
            ᛱᛴᛶᲇ r0 = (defpackage.C0078) r0
            ᲁᛶᲁ r6 = (defpackage.C1876) r6
            int[] r1 = new int[r4]
            android.widget.LinearLayout r0 = r0.f806
            r0.getLocationOnScreen(r1)
            r17 = 0
            r0 = r1[r17]
            r18 = 1
            r1 = r1[r18]
            r6.m3287(r0, r1)
            return
        L5f6:
            android.content.Context r0 = (android.content.Context) r0
            android.widget.ScrollView r6 = (android.widget.ScrollView) r6
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.heightPixels
            float r1 = (float) r1
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r2
            int r1 = (int) r1
            float r0 = r0.density
            r2 = 1127481344(0x43340000, float:180.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r3 = 1140457472(0x43fa0000, float:500.0)
            float r3 = r3 * r0
            int r0 = (int) r3
            int r0 = defpackage.AbstractC1754.m3135(r1, r2, r0)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r1.height = r0
            r6.setLayoutParams(r1)
            return
        L621:
            r16 = 0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r1 = r6.intValue()
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L638
            r1 = r16
            r0.setBackground(r1)
        L638:
            if (r0 == 0) goto L63e
            r8 = 0
            r0.setBackgroundColor(r8)
        L63e:
            if (r0 == 0) goto L648
            ᛷᲇᛸᲈ r1 = new ᛷᲇᛸᲈ
            r1.<init>(r0, r4)
            r0.post(r1)
        L648:
            return
        L649:
            ᛳᲈᲇᛳ r0 = (defpackage.InterfaceC0598) r0
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r0.mo617(r6)
            return
        L651:
            r1 = r0
            ᛳᛴᛶᛲ r1 = (defpackage.ExecutorC0456) r1
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r6.run()     // Catch: java.lang.Throwable -> L65d
            r1.m1239()
            return
        L65d:
            r0 = move-exception
            r1.m1239()
            throw r0
    }
}
