package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7513d;

    public /* synthetic */ l(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f7510a = r4
            r0.f7511b = r1
            r0.f7512c = r2
            r0.f7513d = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r39) {
            r38 = this;
            r0 = r38
            int r1 = r0.f7510a
            java.lang.String r2 = ""
            r9 = 17
            r10 = 0
            r13 = 8
            r15 = 1
            java.lang.Object r3 = r0.f7513d
            java.lang.Object r14 = r0.f7512c
            java.lang.Object r4 = r0.f7511b
            switch(r1) {
                case 0: goto L52b;
                default: goto L15;
            }
        L15:
            r9.f0 r14 = (r9.f0) r14
            r9.d0 r3 = (r9.d0) r3
            int r1 = r14.f11703a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.f0 r1 = r3.X(r4, r1, r15)
            android.content.Context r4 = r39.getContext()
            r4.getClass()
            java.lang.String r14 = r1.f11708f
            java.lang.String r14 = r9.d0.L0(r14)
            boolean r18 = og.m.t0(r14)
            if (r18 == 0) goto L38
            java.lang.String r14 = r1.f11709g
        L38:
            boolean r18 = og.m.t0(r14)
            if (r18 == 0) goto L40
            java.lang.String r14 = r1.f11710h
        L40:
            android.content.SharedPreferences r5 = r3.f11655c
            java.lang.String r12 = "message_details_format_content"
            boolean r5 = r5.getBoolean(r12, r10)
            if (r5 != 0) goto L53
            boolean r5 = r9.d0.U(r14)
            if (r5 == 0) goto L51
            goto L53
        L51:
            r5 = r14
            goto L5b
        L53:
            java.lang.String r5 = "><"
            java.lang.String r12 = ">\n<"
            java.lang.String r5 = og.t.a0(r14, r5, r12, r10)
        L5b:
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r4)
            r12.setOrientation(r15)
            r6 = 1090519040(0x41000000, float:8.0)
            int r7 = r9.d0.l(r4, r6)
            r6 = 1082130432(0x40800000, float:4.0)
            int r8 = r9.d0.l(r4, r6)
            r12.setPadding(r7, r8, r7, r10)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r4)
            r7.setOrientation(r10)
            r8 = 16
            r7.setGravity(r8)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r4)
            r6 = 1093664768(0x41300000, float:11.0)
            r8.setTextSize(r6)
            r6 = -7829368(0xffffffffff888888, float:NaN)
            r8.setTextColor(r6)
            java.lang.String r6 = "搜索"
            r8.setText(r6)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r4)
            java.lang.String r10 = "×"
            r15.setText(r10)
            r10 = 1098907648(0x41800000, float:16.0)
            r15.setTextSize(r10)
            r15.setGravity(r9)
            r9 = 150(0x96, float:2.1E-43)
            r10 = 243(0xf3, float:3.4E-43)
            r11 = 33
            int r9 = android.graphics.Color.rgb(r11, r9, r10)
            r15.setTextColor(r9)
            r15.setVisibility(r13)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r13 = -2
            r9.<init>(r11, r13, r10)
            r7.addView(r8, r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r11 = 1109393408(0x42200000, float:40.0)
            int r11 = r9.d0.l(r4, r11)
            r9.<init>(r11, r13)
            r7.addView(r15, r9)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r4)
            r11 = 1
            r9.setOrientation(r11)
            r11 = 8
            r9.setVisibility(r11)
            r11 = 1082130432(0x40800000, float:4.0)
            int r13 = r9.d0.l(r4, r11)
            r11 = 0
            r9.setPadding(r11, r13, r11, r11)
            r9.addView(r7)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r4)
            r7.setOrientation(r11)
            r11 = 16
            r7.setGravity(r11)
            android.widget.EditText r11 = new android.widget.EditText
            r11.<init>(r4)
            r11.setHint(r6)
            r6 = 1
            r11.setSingleLine(r6)
            r13 = 1094713344(0x41400000, float:12.0)
            r11.setTextSize(r13)
            android.widget.EditText r10 = new android.widget.EditText
            r10.<init>(r4)
            java.lang.String r13 = "替换为"
            r10.setHint(r13)
            r10.setSingleLine(r6)
            r6 = 1094713344(0x41400000, float:12.0)
            r10.setTextSize(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r35 = r14
            r0 = -2
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13, r0, r14)
            r7.addView(r11, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r13, r0, r14)
            r7.addView(r10, r6)
            r9.addView(r7)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r0.setOrientation(r13)
            r6 = 16
            r0.setGravity(r6)
            java.lang.String r6 = "上一个"
            android.widget.TextView r6 = r9.d0.F0(r4, r3, r6)
            java.lang.String r7 = "下一个"
            android.widget.TextView r7 = r9.d0.F0(r4, r3, r7)
            java.lang.String r14 = "替换"
            android.widget.TextView r14 = r9.d0.F0(r4, r3, r14)
            java.lang.String r13 = "全部替换"
            android.widget.TextView r13 = r9.d0.F0(r4, r3, r13)
            r29 = r3
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r27 = r8
            r28 = r10
            r30 = r15
            r8 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r15 = -2
            r3.<init>(r10, r15, r8)
            r0.addView(r6, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r10, r15, r8)
            r0.addView(r7, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r10, r15, r8)
            r0.addView(r14, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r10, r15, r8)
            r0.addView(r13, r3)
            r9.addView(r0)
            r12.addView(r9)
            l8.c r0 = r9.d0.f(r1)
            int r0 = r0.ordinal()
            r3 = 2
            if (r0 == r3) goto L1d1
            r3 = 3
            if (r0 == r3) goto L1ca
            java.lang.String r0 = r1.f11711i
            java.util.List r0 = r9.d0.f0(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a8:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L1d7
            java.lang.Object r8 = r0.next()
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r15 = "announcement@all"
            boolean r15 = gg.l.a(r10, r15)
            if (r15 != 0) goto L1a8
            java.lang.String r15 = "notify@all"
            boolean r10 = gg.l.a(r10, r15)
            if (r10 == 0) goto L1c6
            goto L1a8
        L1c6:
            r3.add(r8)
            goto L1a8
        L1ca:
            java.lang.String r0 = "群公告全体"
            java.util.List r3 = a.a.x0(r0)
            goto L1d7
        L1d1:
            java.lang.String r0 = "@所有人（全体群成员）"
            java.util.List r3 = a.a.x0(r0)
        L1d7:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L272
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "艾特对象"
            r8.<init>(r10)
            java.util.Iterator r10 = r3.iterator()
        L1ed:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L206
            java.lang.Object r15 = r10.next()
            java.lang.String r15 = (java.lang.String) r15
            r21 = r3
            r3 = 10
            r8.append(r3)
            r8.append(r15)
            r3 = r21
            goto L1ed
        L206:
            r21 = r3
            java.lang.String r3 = r8.toString()
            r0.setText(r3)
            r3 = 1
            r0.setTextIsSelectable(r3)
            r8 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r8)
            r8 = -7829368(0xffffffffff888888, float:NaN)
            r0.setTextColor(r8)
            r0.setIncludeFontPadding(r3)
            r8 = 1082130432(0x40800000, float:4.0)
            int r8 = r9.d0.l(r4, r8)
            r10 = 1090519040(0x41000000, float:8.0)
            int r10 = r9.d0.l(r4, r10)
            r15 = 0
            r0.setPadding(r15, r8, r15, r10)
            android.widget.ScrollView r8 = new android.widget.ScrollView
            r8.<init>(r4)
            int r10 = r21.size()
            r15 = 4
            if (r10 <= r15) goto L23f
            r10 = r3
            goto L240
        L23f:
            r10 = 0
        L240:
            r8.setVerticalScrollBarEnabled(r10)
            r8.setOverScrollMode(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r15 = -2
            r3.<init>(r10, r15)
            r8.addView(r0, r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1123024896(0x42f00000, float:120.0)
            int r3 = r9.d0.l(r4, r3)
            int r10 = r21.size()
            float r10 = (float) r10
            r15 = 1101004800(0x41a00000, float:20.0)
            float r10 = r10 * r15
            r15 = 1106247680(0x41f00000, float:30.0)
            float r10 = r10 + r15
            int r10 = r9.d0.l(r4, r10)
            int r3 = java.lang.Math.min(r3, r10)
            r10 = -1
            r0.<init>(r10, r3)
            r12.addView(r8, r0)
        L272:
            int r0 = r5.length()
            r3 = 600(0x258, float:8.41E-43)
            if (r0 <= r3) goto L295
            r0 = 1144258560(0x44340000, float:720.0)
            int r0 = r9.d0.l(r4, r0)
            android.content.res.Resources r3 = r4.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            float r3 = (float) r3
            r8 = 1061662228(0x3f47ae14, float:0.78)
            float r3 = r3 * r8
            int r3 = (int) r3
            int r0 = java.lang.Math.min(r0, r3)
            goto L296
        L295:
            r0 = -2
        L296:
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r4)
            r3.setText(r5)
            r8 = 1
            r3.setTextIsSelectable(r8)
            r10 = 1099956224(0x41900000, float:18.0)
            r3.setTextSize(r10)
            android.graphics.Typeface r15 = android.graphics.Typeface.DEFAULT
            r3.setTypeface(r15)
            r3.setIncludeFontPadding(r8)
            r10 = 0
            r3.setPadding(r10, r10, r10, r10)
            android.widget.ScrollView r8 = new android.widget.ScrollView
            r8.<init>(r4)
            r8.setFillViewport(r10)
            r8.setVerticalScrollBarEnabled(r10)
            r10 = 1
            r8.setOverScrollMode(r10)
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r36 = r1
            r19 = r9
            r1 = -1
            r9 = -2
            r10.<init>(r1, r9)
            r8.addView(r3, r10)
            android.widget.EditText r1 = new android.widget.EditText
            r1.<init>(r4)
            r1.setText(r5)
            r10 = 0
            r1.setSelectAllOnFocus(r10)
            r1.setHorizontallyScrolling(r10)
            r9 = 14
            r1.setMinLines(r9)
            r9 = 24
            r1.setMaxLines(r9)
            r9 = 1099956224(0x41900000, float:18.0)
            r1.setTextSize(r9)
            r1.setTypeface(r15)
            r9 = 0
            r1.setBackground(r9)
            r1.setPadding(r10, r10, r10, r10)
            r9 = 1
            r1.setIncludeFontPadding(r9)
            r1.setVerticalScrollBarEnabled(r10)
            r1.setOverScrollMode(r9)
            r9 = 655361(0xa0001, float:9.18356E-40)
            r1.setInputType(r9)
            r9 = 8388659(0x800033, float:1.1755015E-38)
            r1.setGravity(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r9.<init>(r10, r0)
            r12.addView(r8, r9)
            gg.s r9 = new gg.s
            r9.<init>()
            r9.f4562g = r10
            gg.q r20 = new gg.q
            r20.<init>()
            gg.u r10 = new gg.u
            r10.<init>()
            r10.f4564g = r2
            gg.u r2 = new gg.u
            r2.<init>()
            r9.c0 r15 = new r9.c0
            r16 = r0
            r0 = r27
            r15.<init>(r9, r0, r11, r1)
            r11.addTextChangedListener(r15)
            r9.e r22 = new r9.e
            r27 = 0
            r24 = r0
            r26 = r1
            r25 = r9
            r23 = r11
            r22.<init>(r23, r24, r25, r26, r27)
            r0 = r25
            r25 = r23
            r23 = r26
            r26 = r0
            r0 = r22
            r27 = r24
            r6.setOnClickListener(r0)
            r9.e r22 = new r9.e
            r27 = 1
            r37 = r26
            r26 = r23
            r23 = r25
            r25 = r37
            r22.<init>(r23, r24, r25, r26, r27)
            r0 = r25
            r25 = r23
            r23 = r26
            r26 = r0
            r0 = r22
            r27 = r24
            r7.setOnClickListener(r0)
            r9.h r22 = new r9.h
            r27 = r26
            r26 = r28
            r28 = 0
            r37 = r25
            r25 = r23
            r23 = r37
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r0 = r25
            r25 = r23
            r23 = r0
            r1 = r22
            r0 = r27
            r27 = r24
            r14.setOnClickListener(r1)
            r9.h r22 = new r9.h
            r28 = 1
            r24 = r26
            r26 = r23
            r23 = r25
            r25 = r24
            r24 = r27
            r27 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r0 = r22
            r25 = r23
            r23 = r26
            r26 = r27
            r27 = r24
            r13.setOnClickListener(r0)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r4)
            r1 = r36
            java.lang.String r6 = r1.f11712j
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L3c8
            java.lang.String r6 = "消息详情"
        L3c8:
            android.app.AlertDialog$Builder r0 = r0.setTitle(r6)
            android.app.AlertDialog$Builder r0 = r0.setView(r12)
            java.lang.String r6 = "编辑"
            r9 = 0
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r6, r9)
            java.lang.String r6 = "复制"
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r6, r9)
            java.lang.String r6 = "关闭"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r6, r9)
            android.app.AlertDialog r0 = r0.show()
            r0.getClass()
            r2.f4564g = r0
            r6 = -3
            android.widget.Button r0 = r0.getButton(r6)
            if (r0 == 0) goto L416
            r9.g r18 = new r9.g
            r34 = 1
            r21 = r20
            r20 = r19
            r19 = r21
            r32 = r2
            r33 = r4
            r28 = r8
            r24 = r10
            r31 = r12
            r22 = r16
            r21 = r30
            r30 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r3 = r18
            r0.setOnLongClickListener(r3)
            goto L42a
        L416:
            r21 = r20
            r20 = r19
            r19 = r21
            r33 = r4
            r28 = r8
            r24 = r10
            r31 = r12
            r22 = r16
            r21 = r30
            r30 = r3
        L42a:
            java.lang.Object r0 = r2.f4564g
            java.lang.String r3 = "dialog"
            if (r0 == 0) goto L525
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            android.widget.Button r0 = r0.getButton(r6)
            if (r0 == 0) goto L457
            r9.f r18 = new r9.f
            r34 = 1
            r32 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r9 = r18
            r2 = r20
            r16 = r22
            r7 = r24
            r4 = r25
            r6 = r26
            r25 = r30
            r8 = r32
            r30 = r21
            r0.setOnClickListener(r9)
            goto L466
        L457:
            r8 = r2
            r2 = r20
            r16 = r22
            r7 = r24
            r4 = r25
            r6 = r26
            r25 = r30
            r30 = r21
        L466:
            java.lang.Object r0 = r8.f4564g
            if (r0 == 0) goto L51f
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            r15 = -2
            android.widget.Button r0 = r0.getButton(r15)
            if (r0 == 0) goto L496
            r9.i r18 = new r9.i
            r24 = r8
            r20 = r23
            r23 = r27
            r21 = r29
            r22 = r33
            r26 = r35
            r27 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = r18
            r5 = r30
            r30 = r25
            r25 = r27
            r27 = r23
            r23 = r20
            r0.setOnClickListener(r9)
            goto L4a0
        L496:
            r26 = r25
            r25 = r5
            r5 = r30
            r30 = r26
            r26 = r35
        L4a0:
            java.lang.Object r0 = r8.f4564g
            if (r0 == 0) goto L519
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            r10 = -1
            android.widget.Button r0 = r0.getButton(r10)
            if (r0 == 0) goto L4c6
            r9.j r18 = new r9.j
            r20 = r8
            r24 = r23
            r21 = r29
            r22 = r33
            r23 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r18
            r32 = r20
            r23 = r24
            r0.setOnClickListener(r1)
            goto L4c8
        L4c6:
            r32 = r8
        L4c8:
            r9.f r18 = new r9.f
            r25 = r4
            r21 = r5
            r26 = r6
            r24 = r7
            r22 = r16
            r20 = r19
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = r20
            r20 = r19
            r19 = r0
            r1 = r18
            r0 = r27
            r0.setOnClickListener(r1)
            r9.g r18 = new r9.g
            r27 = r20
            r20 = r19
            r19 = r27
            r27 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = r20
            r20 = r19
            r19 = r0
            r1 = r18
            r0 = r27
            r0.setOnLongClickListener(r1)
            r9.f r18 = new r9.f
            r34 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r18
            r5.setOnClickListener(r0)
            r9.g r18 = new r9.g
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r18
            r5.setOnLongClickListener(r0)
            return
        L519:
            gg.l.g(r3)
            r17 = 0
            throw r17
        L51f:
            r17 = 0
            gg.l.g(r3)
            throw r17
        L525:
            r17 = 0
            gg.l.g(r3)
            throw r17
        L52b:
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            k9.r r0 = k9.r.f7530a
            java.lang.ref.WeakReference r0 = k9.r.f7538i
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L542
            android.view.ViewParent r0 = r0.getParent()
            goto L543
        L542:
            r0 = 0
        L543:
            if (r0 == 0) goto L54c
            r25 = 1
            k9.r.d(r25)
            goto L82f
        L54c:
            r26 = 0
            k9.r.d(r26)
            java.util.List r0 = oh.h.L(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L55e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L573
            java.lang.Object r5 = r0.next()
            r6 = r5
            k9.j r6 = (k9.j) r6
            boolean r6 = r6.f7509g
            if (r6 == 0) goto L55e
            r1.add(r5)
            goto L55e
        L573:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L585
            java.lang.String r0 = "请先添加并启用快捷项"
            r10 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r10)
            r0.show()
            goto L82f
        L585:
            android.content.SharedPreferences r0 = k9.r.f7532c
            java.lang.String r5 = "icon"
            if (r0 == 0) goto L594
            java.lang.String r6 = "display_mode"
            java.lang.String r0 = r0.getString(r6, r5)
            if (r0 == 0) goto L594
            goto L595
        L594:
            r0 = r5
        L595:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r4)
            r8 = 1
            r6.setOrientation(r8)
            r15 = 4
            int r7 = k9.r.f(r4, r15)
            int r8 = k9.r.f(r4, r15)
            r10 = 0
            r6.setPadding(r10, r7, r10, r8)
            java.util.Iterator r1 = r1.iterator()
            r11 = 0
        L5b0:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L7c2
            java.lang.Object r7 = r1.next()
            int r8 = r11 + 1
            if (r11 < 0) goto L7bc
            k9.j r7 = (k9.j) r7
            java.lang.String r10 = "text"
            boolean r10 = r0.equals(r10)
            boolean r12 = r0.equals(r5)
            android.content.SharedPreferences r13 = k9.r.f7532c
            r15 = 44
            if (r13 == 0) goto L5de
            java.lang.String r9 = "action_size"
            int r9 = r13.getInt(r9, r15)
            r13 = 36
            r15 = 64
            int r15 = r9.e0.r(r9, r13, r15)
        L5de:
            boolean r9 = k9.r.g(r4)
            if (r9 == 0) goto L5e8
            r9 = -231195840(0xfffffffff2383b40, float:-3.6490797E30)
            goto L5eb
        L5e8:
            r9 = -167772161(0xfffffffff5ffffff, float:-6.4903707E32)
        L5eb:
            android.content.SharedPreferences r13 = k9.r.f7532c
            r23 = r0
            if (r13 == 0) goto L5f8
            java.lang.String r0 = "action_color"
            java.lang.String r0 = r13.getString(r0, r2)
            goto L5f9
        L5f8:
            r0 = 0
        L5f9:
            int[] r0 = k9.r.k(r9, r0)
            boolean r9 = k9.r.g(r4)
            if (r9 == 0) goto L605
            r9 = -1
            goto L608
        L605:
            r9 = -14671580(0xffffffffff202124, float:-2.1284856E38)
        L608:
            android.content.SharedPreferences r13 = k9.r.f7532c
            r24 = r1
            if (r13 == 0) goto L615
            java.lang.String r1 = "label_color"
            java.lang.String r1 = r13.getString(r1, r2)
            goto L616
        L615:
            r1 = 0
        L616:
            int[] r1 = k9.r.k(r9, r1)
            int r9 = k9.r.o(r0)
            boolean r9 = k9.r.h(r9)
            if (r9 == 0) goto L628
            r9 = -14671580(0xffffffffff202124, float:-2.1284856E38)
            goto L629
        L628:
            r9 = -1
        L629:
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            r13.<init>(r4)
            r28 = r2
            r2 = 0
            r13.setOrientation(r2)
            r2 = 17
            r13.setGravity(r2)
            r2 = 1
            r13.setClickable(r2)
            r13.setFocusable(r2)
            int r2 = k9.r.f(r4, r15)
            r13.setMinimumHeight(r2)
            java.lang.String r2 = r7.f7504b
            r39 = r3
            java.lang.String r3 = r7.f7508f
            r13.setContentDescription(r2)
            if (r12 != 0) goto L6f0
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            r29 = r3
            java.lang.String r3 = "Hchat:FloatingShortcut:Label"
            r2.setTag(r3)
            java.lang.String r3 = r7.f7504b
            r2.setText(r3)
            r3 = 17
            r2.setGravity(r3)
            android.content.SharedPreferences r3 = k9.r.f7532c
            if (r3 == 0) goto L681
            r30 = r5
            java.lang.String r5 = "label_text_size"
            r31 = r8
            r8 = 14
            int r3 = r3.getInt(r5, r8)
            r5 = 24
            r8 = 10
            int r3 = r9.e0.r(r3, r8, r5)
            goto L689
        L681:
            r30 = r5
            r31 = r8
            r5 = 24
            r3 = 14
        L689:
            float r3 = (float) r3
            r2.setTextSize(r3)
            r8 = 1
            r2.setMaxLines(r8)
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r3)
            r3 = 180(0xb4, float:2.52E-43)
            int r3 = k9.r.f(r4, r3)
            r2.setMaxWidth(r3)
            int r3 = k9.r.f(r4, r15)
            r2.setMinHeight(r3)
            r3 = 11
            int r8 = k9.r.f(r4, r3)
            r5 = 6
            r32 = r10
            int r10 = k9.r.f(r4, r5)
            int r3 = k9.r.f(r4, r3)
            int r5 = k9.r.f(r4, r5)
            r2.setPadding(r8, r10, r3, r5)
            android.text.TextPaint r3 = r2.getPaint()
            r5 = 0
            r3.setShader(r5)
            r10 = 0
            r3 = r1[r10]
            r2.setTextColor(r3)
            int r3 = r1.length
            r8 = 2
            if (r3 >= r8) goto L6d1
            goto L6db
        L6d1:
            a1.d r3 = new a1.d
            r8 = 22
            r3.<init>(r2, r8, r1)
            r2.post(r3)
        L6db:
            android.graphics.drawable.RippleDrawable r1 = k9.r.a(r4, r10, r5)
            r2.setBackground(r1)
            r8 = 1
            r2.setDuplicateParentStateEnabled(r8)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r3)
            r13.addView(r2, r1)
            goto L6f9
        L6f0:
            r29 = r3
            r30 = r5
            r31 = r8
            r32 = r10
            r8 = 1
        L6f9:
            if (r32 != 0) goto L78e
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r4)
            java.lang.String r2 = "Hchat:FloatingShortcut:Icon"
            r1.setTag(r2)
            android.graphics.drawable.RippleDrawable r0 = k9.r.a(r4, r8, r0)
            r1.setBackground(r0)
            r1.setDuplicateParentStateEnabled(r8)
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r4)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r0.setScaleType(r2)
            boolean r2 = k9.r.g(r4)
            if (r2 == 0) goto L728
            boolean r2 = og.m.t0(r29)
            if (r2 != 0) goto L728
            r3 = r29
            goto L72a
        L728:
            java.lang.String r3 = r7.f7507e
        L72a:
            android.graphics.drawable.BitmapDrawable r2 = k9.r.i(r4, r3)
            if (r2 == 0) goto L732
            r3 = 2
            goto L74d
        L732:
            java.lang.String r2 = r7.f7505c
            java.lang.String r3 = "plugin_agent"
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L743
            q8.a r2 = new q8.a
            r3 = 2
            r2.<init>(r9, r3)
            goto L74d
        L743:
            r3 = 2
            k9.d r2 = new k9.d
            k9.c r5 = g4.a.o(r7)
            r2.<init>(r5, r9)
        L74d:
            r0.setImageDrawable(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            float r5 = (float) r15
            r8 = 1058139013(0x3f11eb85, float:0.57)
            float r5 = r5 * r8
            int r5 = (int) r5
            r8 = 20
            if (r5 >= r8) goto L75e
            r9 = r8
            goto L75f
        L75e:
            r9 = r5
        L75f:
            int r9 = k9.r.f(r4, r9)
            if (r5 >= r8) goto L766
            r5 = r8
        L766:
            int r5 = k9.r.f(r4, r5)
            r8 = 17
            r2.<init>(r9, r5, r8)
            r1.addView(r0, r2)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r2 = k9.r.f(r4, r15)
            int r5 = k9.r.f(r4, r15)
            r0.<init>(r2, r5)
            r2 = 8
            if (r12 != 0) goto L78a
            int r5 = k9.r.f(r4, r2)
            r0.setMarginStart(r5)
        L78a:
            r13.addView(r1, r0)
            goto L793
        L78e:
            r2 = 8
            r3 = 2
            r8 = 17
        L793:
            k9.o r0 = new k9.o
            r0.<init>(r4, r7)
            r13.setOnClickListener(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            r0.<init>(r15, r15)
            if (r11 <= 0) goto L7aa
            r1 = 5
            int r1 = k9.r.f(r4, r1)
            r0.topMargin = r1
        L7aa:
            r6.addView(r13, r0)
            r3 = r39
            r9 = r8
            r0 = r23
            r1 = r24
            r2 = r28
            r5 = r30
            r11 = r31
            goto L5b0
        L7bc:
            a.a.Q0()
            r17 = 0
            throw r17
        L7c2:
            r39 = r3
            android.widget.ScrollView r5 = new android.widget.ScrollView
            r5.<init>(r4)
            r15 = 4
            r5.setVisibility(r15)
            r10 = 0
            r5.setVerticalScrollBarEnabled(r10)
            r5.setClipToPadding(r10)
            r3 = 10
            int r0 = k9.r.f(r4, r3)
            float r0 = (float) r0
            r5.setElevation(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r15 = -2
            r0.<init>(r15, r15)
            r5.addView(r6, r0)
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            r8 = 1
            r0.setClickable(r8)
            r0.setBackgroundColor(r10)
            k9.n r1 = new k9.n
            r1.<init>()
            r0.setOnClickListener(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r9 = 8388659(0x800033, float:1.1755015E-38)
            r10 = -1
            r1.<init>(r10, r10, r9)
            r14.addView(r0, r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r15 = -2
            r1.<init>(r15, r15, r9)
            r14.addView(r5, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            k9.r.f7539j = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            k9.r.f7538i = r0
            r39.bringToFront()
            ca.x r0 = new ca.x
            r1 = 9
            r2 = r4
            r3 = r14
            r4 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5.post(r0)
        L82f:
            return
    }
}
