package defpackage;

/* JADX INFO: renamed from: ᛷᛵᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1285 extends defpackage.AbstractC1304 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f5715;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1006 f5716;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5717;

    public C1285(int r1, android.content.Context r2, defpackage.C1006 r3) {
            r0 = this;
            r0.f5717 = r1
            r0.f5715 = r2
            r0.f5716 = r3
            r1 = 1712062529(0x660c0041, float:1.65284E23)
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final void m2413(defpackage.C1006 r2, defpackage.C1006 r3, defpackage.C1006 r4, defpackage.C1006 r5, defpackage.C1006 r6, android.view.View r7, android.widget.TextView r8) {
            int r0 = r3.f4472
            int r4 = r4.f4472
            int r5 = r5.f4472
            int r6 = r6.f4472
            int r4 = android.graphics.Color.argb(r0, r4, r5, r6)
            r2.f4472 = r4
            r5 = 0
            android.graphics.drawable.GradientDrawable r4 = defpackage.AbstractC0577.m1373(r4, r5)
            r7.setBackground(r4)
            int r3 = r3.f4472
            r4 = 255(0xff, float:3.57E-43)
            r5 = 1
            if (r3 != r4) goto L3e
            r3 = -164106690010670(0xffff6abeef0961d2, double:NaN)
            java.lang.String r3 = "#%06X"
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            int r2 = r2.f4472
            r2 = r2 & r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r6 = -164132459814446(0xffff6ab8ef0961d2, double:NaN)
            java.lang.String r2 = defpackage.AbstractC0225.m830(r2, r5, r3, r6)
            goto L61
        L3e:
            r3 = -164183999421998(0xffff6aacef0961d2, double:NaN)
            java.lang.String r3 = "#%08X"
            int r2 = r2.f4472
            long r6 = (long) r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r6 = -164209769225774(0xffff6aa6ef0961d2, double:NaN)
            java.lang.String r2 = defpackage.AbstractC0225.m830(r2, r5, r3, r6)
        L61:
            r8.setText(r2)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final void m2414(defpackage.C1006 r3, defpackage.C1006 r4, defpackage.C1006 r5, defpackage.C1006 r6, android.widget.SeekBar r7, android.widget.SeekBar r8, android.widget.SeekBar r9, android.widget.SeekBar r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, android.widget.TextView r14, defpackage.C1006 r15, android.view.View r16, android.widget.TextView r17, defpackage.C1419 r18, java.util.ArrayList r19, int r20, android.view.View r21) {
            r0 = r18
            r1 = r21
            int r2 = android.graphics.Color.red(r20)
            r3.f4472 = r2
            int r2 = android.graphics.Color.green(r20)
            r4.f4472 = r2
            int r2 = android.graphics.Color.blue(r20)
            r5.f4472 = r2
            int r2 = android.graphics.Color.alpha(r20)
            r6.f4472 = r2
            int r2 = r3.f4472
            r7.setProgress(r2)
            int r7 = r4.f4472
            r8.setProgress(r7)
            int r7 = r5.f4472
            r9.setProgress(r7)
            int r7 = r6.f4472
            r10.setProgress(r7)
            int r7 = r3.f4472
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r11.setText(r7)
            int r7 = r4.f4472
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r12.setText(r7)
            int r7 = r5.f4472
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r13.setText(r7)
            int r7 = r6.f4472
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r14.setText(r7)
            r10 = r3
            r11 = r4
            r12 = r5
            r9 = r6
            r8 = r15
            r13 = r16
            r14 = r17
            m2413(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = r0.f6211
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L99
            java.util.Iterator r4 = r19.iterator()
        L6a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r4.next()
            r6 = r5
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r6 = r6.getFirst()
            boolean r6 = defpackage.AbstractC0498.m1280(r6, r3)
            if (r6 == 0) goto L6a
            goto L83
        L82:
            r5 = 0
        L83:
            kotlin.Pair r5 = (kotlin.Pair) r5
            if (r5 == 0) goto L99
            java.lang.Object r4 = r5.getSecond()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 0
            android.graphics.drawable.GradientDrawable r4 = defpackage.AbstractC0577.m1373(r4, r5)
            r3.setBackground(r4)
        L99:
            r3 = 1
            r4 = r20
            android.graphics.drawable.GradientDrawable r3 = defpackage.AbstractC0577.m1373(r4, r3)
            r1.setBackground(r3)
            r0.f6211 = r1
            return
    }

    @Override // defpackage.AbstractC1304
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo1529(com.kongzue.dialogx.interfaces.AbstractC0008 r63, android.view.View r64) {
            r62 = this;
            r0 = r62
            r1 = r64
            r2 = r63
            ᛶᛵᛳᛸ r2 = (defpackage.C1069) r2
            r2 = -162968523677230(0xffff6bc7ef0961d2, double:NaN)
            r2 = -162998588448302(0xffff6bc0ef0961d2, double:NaN)
            r2 = 1711866156(0x6609012c, float:1.6174646E23)
            android.view.View r10 = r1.findViewById(r2)
            r2 = 1711866940(0x6609043c, float:1.6176058E23)
            android.view.View r2 = r1.findViewById(r2)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = 1711866725(0x66090365, float:1.617567E23)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.SeekBar r2 = (android.widget.SeekBar) r2
            r3 = 1711866724(0x66090364, float:1.6175669E23)
            android.view.View r3 = r1.findViewById(r3)
            r12 = r3
            android.widget.SeekBar r12 = (android.widget.SeekBar) r12
            r3 = 1711866723(0x66090363, float:1.6175667E23)
            android.view.View r3 = r1.findViewById(r3)
            r13 = r3
            android.widget.SeekBar r13 = (android.widget.SeekBar) r13
            r3 = 1711866722(0x66090362, float:1.6175665E23)
            android.view.View r3 = r1.findViewById(r3)
            r14 = r3
            android.widget.SeekBar r14 = (android.widget.SeekBar) r14
            r3 = 1711866963(0x66090453, float:1.61761E23)
            android.view.View r3 = r1.findViewById(r3)
            r15 = r3
            android.widget.TextView r15 = (android.widget.TextView) r15
            r3 = 1711866951(0x66090447, float:1.6176078E23)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 1711866933(0x66090435, float:1.6176045E23)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 1711866931(0x66090433, float:1.6176042E23)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 1711866154(0x6609012a, float:1.6174642E23)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.GridLayout r6 = (android.widget.GridLayout) r6
            r7 = 1711866651(0x6609031b, float:1.6175537E23)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.GridLayout r7 = (android.widget.GridLayout) r7
            r8 = 1711866962(0x66090452, float:1.6176098E23)
            android.view.View r1 = r1.findViewById(r8)
            android.widget.TextView r1 = (android.widget.TextView) r1
            ᛶᛱᛵᛳ r8 = new ᛶᛱᛵᛳ
            r8.<init>()
            int r9 = r0.f5717
            r63 = r6
            int r6 = android.graphics.Color.red(r9)
            r8.f4472 = r6
            ᛶᛱᛵᛳ r6 = new ᛶᛱᛵᛳ
            r6.<init>()
            r16 = r7
            int r7 = android.graphics.Color.green(r9)
            r6.f4472 = r7
            ᛶᛱᛵᛳ r7 = new ᛶᛱᛵᛳ
            r7.<init>()
            r17 = r9
            int r9 = android.graphics.Color.blue(r17)
            r7.f4472 = r9
            ᛶᛱᛵᛳ r9 = new ᛶᛱᛵᛳ
            r9.<init>()
            r19 = r10
            int r10 = android.graphics.Color.alpha(r17)
            r9.f4472 = r10
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            ᛸᛱᛴᲁ r21 = new ᛸᛱᛴᲁ
            r21.<init>()
            int r10 = r8.f4472
            r2.setProgress(r10)
            int r10 = r6.f4472
            r12.setProgress(r10)
            int r10 = r7.f4472
            r13.setProgress(r10)
            int r10 = r9.f4472
            r14.setProgress(r10)
            int r10 = r8.f4472
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r15.setText(r10)
            int r10 = r6.f4472
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r3.setText(r10)
            int r10 = r7.f4472
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r4.setText(r10)
            int r10 = r9.f4472
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r5.setText(r10)
            r10 = r3
            ᛶᛱᛵᛳ r3 = r0.f5716
            r17 = r11
            r11 = r63
            r63 = r2
            r2 = r16
            r16 = r4
            r4 = r9
            r9 = r17
            r17 = r5
            r5 = r8
            r8 = r19
            m2413(r3, r4, r5, r6, r7, r8, r9)
            r18 = r3
            r20 = r9
            r9 = r7
            r7 = r6
            r6 = r5
            android.content.Context r0 = r0.f5715
            android.content.res.Resources r3 = r0.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r5 = 1107296256(0x42000000, float:32.0)
            float r5 = r5 * r3
            int r5 = (int) r5
            r8 = 1077936128(0x40400000, float:3.0)
            float r8 = r8 * r3
            int r3 = (int) r8
            android.content.res.Resources r8 = r0.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.widthPixels
            int r8 = r8 - r5
            int r8 = r8 / 8
            int r5 = r3 * 2
            int r5 = r8 - r5
            java.util.ArrayList r8 = defpackage.AbstractC0577.m1372()
            boolean r23 = r8.isEmpty()
            r64 = r4
            r4 = 0
            if (r23 == 0) goto L174
            r27 = r3
            r2 = r14
        L15c:
            r1 = r4
            r28 = r5
            r26 = r11
            r5 = r15
            r11 = r20
            r4 = r64
            r14 = r12
            r15 = r13
            r12 = r18
            r13 = r63
            r18 = r17
            r17 = r16
            r16 = r10
            goto L203
        L174:
            r1.setVisibility(r4)
            r2.setVisibility(r4)
            r2.removeAllViews()
            java.util.Iterator r1 = r8.iterator()
        L181:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L1fd
            java.lang.Object r8 = r1.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            android.view.View r4 = new android.view.View
            r4.<init>(r0)
            r24 = r1
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r1.<init>(r5, r5)
            r1.setMargins(r3, r3, r3, r3)
            r4.setLayoutParams(r1)
            r23 = r3
            r1 = 0
            android.graphics.drawable.GradientDrawable r3 = defpackage.AbstractC0577.m1373(r8, r1)
            r4.setBackground(r3)
            ᛱᛱᲈᛸ r3 = new ᛱᛱᲈᛸ
            r25 = r23
            r23 = 1
            r28 = r5
            r26 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r27 = r25
            r5 = r4
            r4 = r8
            r8 = r9
            r15 = r10
            r10 = r63
            r9 = r64
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = r10
            r10 = r3
            r3 = r13
            r13 = r4
            r4 = r15
            r15 = r12
            r12 = r18
            r18 = r17
            r17 = r16
            r16 = r4
            r4 = r9
            r9 = r8
            r8 = r5
            r5 = r14
            r14 = r11
            r11 = r20
            r8.setOnClickListener(r10)
            r2.addView(r8)
            r64 = r4
            r63 = r13
            r13 = r15
            r10 = r16
            r16 = r17
            r17 = r18
            r11 = r26
            r4 = r1
            r15 = r5
            r18 = r12
            r12 = r14
            r1 = r24
            r5 = r28
            r14 = r3
            r3 = r27
            goto L181
        L1fd:
            r27 = r3
            r3 = r14
            r2 = r3
            goto L15c
        L203:
            ᛷᲇᛵᛲ r3 = new ᛷᲇᛵᛲ
            r8 = r6
            r6 = r12
            r12 = 0
            r10 = r7
            r7 = r4
            r4 = r8
            r8 = r10
            r24 = r0
            r10 = r19
            r0 = r21
            r29 = r22
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r20 = r5
            r12 = r6
            r6 = r4
            r4 = r7
            r7 = r8
            ᲈᛵᲇᲁ r5 = new ᲈᛵᲇᲁ
            r5.<init>(r0, r1, r3)
            r13.setOnSeekBarChangeListener(r5)
            ᛷᲇᛵᛲ r3 = new ᛷᲇᛵᛲ
            r8 = r6
            r6 = r12
            r12 = 1
            r5 = r7
            r7 = r4
            r4 = r5
            r5 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r12 = r7
            r7 = r4
            r4 = r12
            r12 = r6
            r6 = r8
            ᲈᛵᲇᲁ r5 = new ᲈᛵᲇᲁ
            r5.<init>(r0, r1, r3)
            r14.setOnSeekBarChangeListener(r5)
            ᛷᲇᛵᛲ r3 = new ᛷᲇᛵᛲ
            r6 = r12
            r12 = 2
            r5 = r7
            r7 = r4
            r4 = r9
            r9 = r5
            r5 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r12 = r9
            r9 = r4
            r4 = r7
            r7 = r12
            r12 = r6
            r6 = r8
            ᲈᛵᲇᲁ r5 = new ᲈᛵᲇᲁ
            r5.<init>(r0, r1, r3)
            r15.setOnSeekBarChangeListener(r5)
            ᛷᲇᛵᛲ r3 = new ᛷᲇᛵᛲ
            r6 = r12
            r12 = 3
            r5 = r8
            r8 = r7
            r7 = r5
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r12 = r6
            r6 = r7
            r7 = r8
            ᲈᛵᲇᲁ r5 = new ᲈᛵᲇᲁ
            r5.<init>(r0, r1, r3)
            r2.setOnSeekBarChangeListener(r5)
            r21 = -163007178382894(0xffff6bbeef0961d2, double:NaN)
            java.lang.String r30 = "#FFFFFF"
            r21 = -163041538121262(0xffff6bb6ef0961d2, double:NaN)
            java.lang.String r31 = "#000000"
            r21 = -163075897859630(0xffff6baeef0961d2, double:NaN)
            java.lang.String r32 = "#FF0000"
            r21 = -163110257597998(0xffff6ba6ef0961d2, double:NaN)
            java.lang.String r33 = "#00FF00"
            r21 = -163144617336366(0xffff6b9eef0961d2, double:NaN)
            java.lang.String r34 = "#0000FF"
            r21 = -163178977074734(0xffff6b96ef0961d2, double:NaN)
            java.lang.String r35 = "#FFFF00"
            r21 = -163213336813102(0xffff6b8eef0961d2, double:NaN)
            java.lang.String r36 = "#00FFFF"
            r21 = -163247696551470(0xffff6b86ef0961d2, double:NaN)
            java.lang.String r37 = "#FF00FF"
            r21 = -163282056289838(0xffff6b7eef0961d2, double:NaN)
            java.lang.String r38 = "#C0C0C0"
            r21 = -163316416028206(0xffff6b76ef0961d2, double:NaN)
            java.lang.String r39 = "#808080"
            r21 = -163350775766574(0xffff6b6eef0961d2, double:NaN)
            java.lang.String r40 = "#800000"
            r21 = -163385135504942(0xffff6b66ef0961d2, double:NaN)
            java.lang.String r41 = "#808000"
            r21 = -163419495243310(0xffff6b5eef0961d2, double:NaN)
            java.lang.String r42 = "#008000"
            r21 = -163453854981678(0xffff6b56ef0961d2, double:NaN)
            java.lang.String r43 = "#800080"
            r21 = -163488214720046(0xffff6b4eef0961d2, double:NaN)
            java.lang.String r44 = "#008080"
            r21 = -163522574458414(0xffff6b46ef0961d2, double:NaN)
            java.lang.String r45 = "#000080"
            r21 = -163556934196782(0xffff6b3eef0961d2, double:NaN)
            java.lang.String r46 = "#FFA500"
            r21 = -163591293935150(0xffff6b36ef0961d2, double:NaN)
            java.lang.String r47 = "#FFC0CB"
            r21 = -163625653673518(0xffff6b2eef0961d2, double:NaN)
            java.lang.String r48 = "#FFD700"
            r21 = -163660013411886(0xffff6b26ef0961d2, double:NaN)
            java.lang.String r49 = "#ADFF2F"
            r21 = -163694373150254(0xffff6b1eef0961d2, double:NaN)
            java.lang.String r50 = "#00CED1"
            r21 = -163728732888622(0xffff6b16ef0961d2, double:NaN)
            java.lang.String r51 = "#9370DB"
            r21 = -163763092626990(0xffff6b0eef0961d2, double:NaN)
            java.lang.String r52 = "#FF1493"
            r21 = -163797452365358(0xffff6b06ef0961d2, double:NaN)
            java.lang.String r53 = "#00BFFF"
            r21 = -163831812103726(0xffff6afeef0961d2, double:NaN)
            java.lang.String r54 = "#F0E68C"
            r21 = -163866171842094(0xffff6af6ef0961d2, double:NaN)
            java.lang.String r55 = "#E6E6FA"
            r21 = -163900531580462(0xffff6aeeef0961d2, double:NaN)
            java.lang.String r56 = "#FFDAB9"
            r21 = -163934891318830(0xffff6ae6ef0961d2, double:NaN)
            java.lang.String r57 = "#98FB98"
            r21 = -163969251057198(0xffff6adeef0961d2, double:NaN)
            java.lang.String r58 = "#AFEEEE"
            r21 = -164003610795566(0xffff6ad6ef0961d2, double:NaN)
            java.lang.String r59 = "#DDA0DD"
            r21 = -164037970533934(0xffff6aceef0961d2, double:NaN)
            java.lang.String r60 = "#B0C4DE"
            r21 = -164072330272302(0xffff6ac6ef0961d2, double:NaN)
            java.lang.String r61 = "#FFDEAD"
            java.lang.String[] r25 = new java.lang.String[]{r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61}
            r3 = r1
        L396:
            r5 = 32
            if (r3 >= r5) goto L419
            r5 = r25[r3]
            int r5 = android.graphics.Color.parseColor(r5)
            android.view.View r8 = new android.view.View
            r10 = r24
            r8.<init>(r10)
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r21 = r0
            r0 = r28
            r1.<init>(r0, r0)
            r0 = r27
            r1.setMargins(r0, r0, r0, r0)
            r8.setLayoutParams(r1)
            r1 = 0
            android.graphics.drawable.GradientDrawable r0 = defpackage.AbstractC0577.m1373(r5, r1)
            r8.setBackground(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r8, r0)
            r0 = r29
            r0.add(r1)
            r1 = r3
            ᛱᛱᲈᛸ r3 = new ᛱᛱᲈᛸ
            r23 = 0
            r22 = r9
            r9 = r4
            r4 = r5
            r5 = r8
            r8 = r22
            r22 = r20
            r20 = r11
            r11 = r14
            r14 = r22
            r22 = r18
            r18 = r12
            r12 = r15
            r15 = r16
            r16 = r17
            r17 = r22
            r22 = r0
            r10 = r13
            r13 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = r5
            r4 = r9
            r5 = r14
            r9 = r8
            r14 = r11
            r11 = r20
            r0.setOnClickListener(r3)
            r2 = r26
            r2.addView(r0)
            int r3 = r1 + 1
            r0 = r15
            r15 = r12
            r12 = r18
            r18 = r17
            r17 = r16
            r16 = r0
            r20 = r5
            r2 = r13
            r0 = r21
            r29 = r22
            r1 = 0
            r13 = r10
            goto L396
        L419:
            return
    }
}
