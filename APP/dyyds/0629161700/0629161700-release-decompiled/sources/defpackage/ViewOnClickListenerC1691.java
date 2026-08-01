package defpackage;

/* JADX INFO: renamed from: ᲀᛶᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1691 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7543;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7544;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7545;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.view.KeyEvent.Callback f7546;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7547;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7548;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7549;

    public /* synthetic */ ViewOnClickListenerC1691(android.widget.TextView r2, android.widget.EditText r3, defpackage.C1294 r4, android.content.Context r5, defpackage.C0345 r6, android.app.AlertDialog r7) {
            r1 = this;
            r0 = 1
            r1.f7547 = r0
            r1.<init>()
            r1.f7545 = r2
            r1.f7548 = r3
            r1.f7549 = r4
            r1.f7543 = r5
            r1.f7544 = r6
            r1.f7546 = r7
            return
    }

    public /* synthetic */ ViewOnClickListenerC1691(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, android.view.KeyEvent.Callback r5, java.lang.Object r6, int r7) {
            r0 = this;
            r0.f7547 = r7
            r0.f7545 = r1
            r0.f7548 = r2
            r0.f7549 = r3
            r0.f7543 = r4
            r0.f7546 = r5
            r0.f7544 = r6
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC1691(defpackage.C1807 r2, defpackage.C0273 r3, defpackage.C1419 r4, defpackage.C1419 r5, android.app.Dialog r6, defpackage.InterfaceC1781 r7) {
            r1 = this;
            r0 = 3
            r1.f7547 = r0
            r1.<init>()
            r1.f7545 = r2
            r1.f7548 = r3
            r1.f7543 = r4
            r1.f7549 = r5
            r1.f7546 = r6
            r1.f7544 = r7
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r33) {
            r32 = this;
            r0 = r32
            int r1 = r0.f7547
            java.lang.Object r5 = r0.f7544
            android.view.KeyEvent$Callback r6 = r0.f7546
            java.lang.Object r7 = r0.f7549
            java.lang.Object r8 = r0.f7543
            java.lang.Object r9 = r0.f7548
            java.lang.Object r0 = r0.f7545
            switch(r1) {
                case 0: goto L4ee;
                case 1: goto L441;
                case 2: goto L3c0;
                default: goto L13;
            }
        L13:
            ᲁᛲᛳᛱ r0 = (defpackage.C1807) r0
            r10 = r9
            ᛲᛳᲈᛴ r10 = (defpackage.C0273) r10
            ᛸᛱᛴᲁ r8 = (defpackage.C1419) r8
            ᛸᛱᛴᲁ r7 = (defpackage.C1419) r7
            android.app.Dialog r6 = (android.app.Dialog) r6
            ᲀᲈᛵᲇ r5 = (defpackage.InterfaceC1781) r5
            android.widget.EditText r1 = r0.f7927
            java.lang.String r11 = defpackage.AbstractC0225.m809(r1)
            android.widget.EditText r1 = r0.f7925
            java.lang.String r1 = defpackage.AbstractC0225.m809(r1)
            android.widget.EditText r9 = r0.f7918
            java.lang.String r9 = defpackage.AbstractC0225.m809(r9)
            android.widget.EditText r12 = r0.f7916
            java.lang.String r12 = defpackage.AbstractC0225.m809(r12)
            int r13 = r11.length()
            if (r13 != 0) goto L4c
            r0 = -113030938926638(0xffff9932ef0961d2, double:NaN)
            java.lang.String r0 = "请输入分组名称"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L4c:
            int r13 = r1.length()
            if (r13 != 0) goto L53
            goto L59
        L53:
            int r13 = r9.length()
            if (r13 != 0) goto L67
        L59:
            r0 = -113065298665006(0xffff992aef0961d2, double:NaN)
            java.lang.String r0 = "请输入延迟区间"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L67:
            java.lang.Long r1 = defpackage.AbstractC0056.m466(r1)
            java.lang.Long r9 = defpackage.AbstractC0056.m466(r9)
            if (r1 == 0) goto L3b3
            if (r9 != 0) goto L75
            goto L3b3
        L75:
            long r13 = r1.longValue()
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 < 0) goto L3a6
            long r13 = r9.longValue()
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L89
            goto L3a6
        L89:
            long r13 = r1.longValue()
            long r15 = r9.longValue()
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 < 0) goto La3
            r0 = -113176967814702(0xffff9910ef0961d2, double:NaN)
            java.lang.String r0 = "起始延迟必须小于结束延迟"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        La3:
            int r13 = r12.length()
            if (r13 != 0) goto Lb7
            r0 = -113232802389550(0xffff9903ef0961d2, double:NaN)
            java.lang.String r0 = "请输入至少一条消息内容"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        Lb7:
            r13 = -113284341997102(0xffff98f7ef0961d2, double:NaN)
            java.lang.String r13 = "\n"
            java.lang.String[] r13 = new java.lang.String[]{r13}
            r14 = 6
            java.util.List r12 = defpackage.AbstractC1347.m2519(r12, r13, r14)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r15 = defpackage.AbstractC0575.m1369(r12)
            r13.<init>(r15)
            java.util.Iterator r12 = r12.iterator()
        Ld6:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto Lee
            java.lang.Object r15 = r12.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.CharSequence r15 = defpackage.AbstractC1347.m2521(r15)
            java.lang.String r15 = r15.toString()
            r13.add(r15)
            goto Ld6
        Lee:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r13.iterator()
        Lf7:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L10f
            java.lang.Object r15 = r13.next()
            r16 = r15
            java.lang.String r16 = (java.lang.String) r16
            int r16 = r16.length()
            if (r16 <= 0) goto Lf7
            r12.add(r15)
            goto Lf7
        L10f:
            android.widget.Switch r13 = r0.f7923
            boolean r13 = r13.isChecked()
            android.widget.EditText r15 = r0.f7913
            java.lang.String r15 = defpackage.AbstractC0225.m809(r15)
            boolean r16 = defpackage.AbstractC1347.m2524(r15)
            if (r16 == 0) goto L12a
            r15 = -113292931931694(0xffff98f5ef0961d2, double:NaN)
            java.lang.String r15 = "{hitokoto}"
        L12a:
            r19 = r15
            if (r13 == 0) goto L142
            boolean r15 = defpackage.AbstractC1347.m2524(r19)
            if (r15 == 0) goto L142
            r0 = -113340176571950(0xffff98eaef0961d2, double:NaN)
            java.lang.String r0 = "请输入消息模板"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L142:
            android.widget.EditText r15 = r0.f7915
            java.lang.String r15 = defpackage.AbstractC0225.m809(r15)
            r33 = 0
            android.widget.EditText r2 = r0.f7914
            java.lang.String r2 = defpackage.AbstractC0225.m809(r2)
            android.widget.Switch r4 = r0.f7917
            boolean r4 = r4.isChecked()
            android.widget.EditText r0 = r0.f7922
            java.lang.String r0 = defpackage.AbstractC0225.m809(r0)
            r17 = -113374536310318(0xffff98e2ef0961d2, double:NaN)
            java.lang.String r17 = "^([01]\\d|2[0-3]):([0-5]\\d)$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r17)
            if (r4 == 0) goto L197
            int r17 = r0.length()
            if (r17 != 0) goto L17f
            r0 = -113494795394606(0xffff98c6ef0961d2, double:NaN)
            java.lang.String r0 = "请输入到点发送时间"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L17f:
            java.util.regex.Matcher r17 = r3.matcher(r0)
            boolean r17 = r17.matches()
            if (r17 != 0) goto L1b5
            r0 = -113537745067566(0xffff98bcef0961d2, double:NaN)
            java.lang.String r0 = "到点发送时间格式错误，正确格式：HH:mm（如 16:48）"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L197:
            int r17 = r0.length()
            if (r17 <= 0) goto L1b5
            java.util.regex.Matcher r17 = r3.matcher(r0)
            boolean r17 = r17.matches()
            if (r17 != 0) goto L1b5
            r0 = -113670889053742(0xffff989def0961d2, double:NaN)
            java.lang.String r0 = "到点发送时间格式错误，正确格式：HH:mm（如 16:48）"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L1b5:
            int r17 = r15.length()
            if (r17 <= 0) goto L1bc
            goto L1c2
        L1bc:
            int r17 = r2.length()
            if (r17 <= 0) goto L2ac
        L1c2:
            int r17 = r15.length()
            if (r17 <= 0) goto L1e0
            java.util.regex.Matcher r17 = r3.matcher(r15)
            boolean r17 = r17.matches()
            if (r17 != 0) goto L1e0
            r0 = -113804033039918(0xffff987eef0961d2, double:NaN)
            java.lang.String r0 = "开始时间格式错误，正确格式：HH:mm（如 08:00）"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L1e0:
            int r17 = r2.length()
            if (r17 <= 0) goto L1fe
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L1fe
            r0 = -113928587091502(0xffff9861ef0961d2, double:NaN)
            java.lang.String r0 = "结束时间格式错误，正确格式：HH:mm（如 21:00）"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L1fe:
            int r3 = r15.length()
            if (r3 <= 0) goto L218
            int r3 = r2.length()
            if (r3 != 0) goto L218
            r0 = -114053141143086(0xffff9844ef0961d2, double:NaN)
            java.lang.String r0 = "请同时填写开始和结束时间"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L218:
            int r3 = r15.length()
            if (r3 != 0) goto L232
            int r3 = r2.length()
            if (r3 <= 0) goto L232
            r0 = -114108975717934(0xffff9837ef0961d2, double:NaN)
            java.lang.String r0 = "请同时填写开始和结束时间"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L232:
            int r3 = r15.length()
            if (r3 <= 0) goto L2ac
            int r3 = r2.length()
            if (r3 <= 0) goto L2ac
            r17 = -114164810292782(0xffff982aef0961d2, double:NaN)
            java.lang.String r3 = ":"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.List r3 = defpackage.AbstractC1347.m2519(r15, r3, r14)
            r17 = -114173400227374(0xffff9828ef0961d2, double:NaN)
            java.lang.String r17 = ":"
            r32 = r0
            java.lang.String[] r0 = new java.lang.String[]{r17}
            java.util.List r0 = defpackage.AbstractC1347.m2519(r2, r0, r14)
            r14 = 0
            java.lang.Object r17 = r3.get(r14)
            java.lang.String r17 = (java.lang.String) r17
            int r17 = java.lang.Integer.parseInt(r17)
            int r17 = r17 * 60
            r14 = 1
            java.lang.Object r3 = r3.get(r14)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            int r3 = r3 + r17
            r14 = 0
            java.lang.Object r17 = r0.get(r14)
            java.lang.String r17 = (java.lang.String) r17
            int r14 = java.lang.Integer.parseInt(r17)
            int r14 = r14 * 60
            r17 = r1
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + r14
            if (r3 < r0) goto L2a7
            r0 = -114181990161966(0xffff9826ef0961d2, double:NaN)
            java.lang.String r0 = "开始时间必须早于结束时间"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L2a7:
            r24 = r2
            r23 = r15
            goto L2b4
        L2ac:
            r32 = r0
            r17 = r1
            r23 = r33
            r24 = r23
        L2b4:
            if (r10 == 0) goto L2e5
            r16 = r12
            r0 = r13
            long r12 = r17.longValue()
            long r14 = r9.longValue()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r8.f6211
            r18 = r0
            java.util.List r18 = (java.util.List) r18
            java.lang.Object r0 = r7.f6211
            r20 = r0
            ᛶᛷᛶ r20 = (defpackage.EnumC1110) r20
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r4)
            boolean r0 = defpackage.AbstractC1347.m2524(r32)
            if (r0 != 0) goto L2de
            r22 = r32
            goto L2e0
        L2de:
            r22 = r33
        L2e0:
            ᛲᛳᲈᛴ r0 = defpackage.C0273.m896(r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L335
        L2e5:
            r16 = r12
            r0 = r13
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r12 = r1.toString()
            r1 = -114237824736814(0xffff9819ef0961d2, double:NaN)
            long r14 = r17.longValue()
            long r1 = r9.longValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r3 = r8.f6211
            r20 = r3
            java.util.List r20 = (java.util.List) r20
            java.lang.Object r3 = r7.f6211
            r22 = r3
            ᛶᛷᛶ r22 = (defpackage.EnumC1110) r22
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            boolean r4 = defpackage.AbstractC1347.m2524(r32)
            r26 = r24
            if (r4 != 0) goto L320
            r24 = r32
        L31e:
            r13 = r11
            goto L323
        L320:
            r24 = r33
            goto L31e
        L323:
            ᛲᛳᲈᛴ r11 = new ᛲᛳᲈᛴ
            r18 = r16
            r21 = r19
            r25 = r23
            r19 = r0
            r16 = r1
            r23 = r3
            r11.<init>(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = r11
        L335:
            ᲁᲇᲀᛸ r1 = defpackage.AbstractC2311.f9770
            r1 = -461176692973102(0xfffe5c8fef0961d2, double:NaN)
            java.util.List r1 = defpackage.AbstractC2311.m3756()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
            r3 = 0
        L34d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L36b
            java.lang.Object r4 = r1.next()
            ᛲᛳᲈᛴ r4 = (defpackage.C0273) r4
            java.lang.String r4 = r4.m897()
            java.lang.String r7 = r0.m897()
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r7)
            if (r4 == 0) goto L368
            goto L36c
        L368:
            int r3 = r3 + 1
            goto L34d
        L36b:
            r3 = -1
        L36c:
            if (r3 < 0) goto L372
            r2.set(r3, r0)
            goto L375
        L372:
            r2.add(r0)
        L375:
            ᲁᲇᲀᛸ r0 = defpackage.AbstractC2311.f9770
            java.lang.String r0 = r0.m3365(r2)
            ᛶᲀᛵ r1 = defpackage.C1141.f5173
            r1.getClass()
            r1 = -19263212920366(0xffffee7aef0961d2, double:NaN)
            ᲀᲇᛸᛶ r1 = defpackage.C1141.f5128
            ᲁᛷᛶᛶ[] r2 = defpackage.C1141.f5221
            r3 = 126(0x7e, float:1.77E-43)
            r2 = r2[r3]
            r1.m3168(r2, r0)
            r0 = -114297954278958(0xffff980bef0961d2, double:NaN)
            java.lang.String r0 = "保存成功"
            defpackage.AbstractC0209.m764(r0)
            r6.dismiss()
            r5.mo1032()
            goto L3bf
        L3a6:
            r0 = -113142608076334(0xffff9918ef0961d2, double:NaN)
            java.lang.String r0 = "延迟不能为负数"
            defpackage.AbstractC0209.m764(r0)
            goto L3bf
        L3b3:
            r0 = -113099658403374(0xffff9922ef0961d2, double:NaN)
            java.lang.String r0 = "延迟区间必须为数字"
            defpackage.AbstractC0209.m764(r0)
        L3bf:
            return
        L3c0:
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.content.Context r9 = (android.content.Context) r9
            ᲀᲈᛵᲇ r7 = (defpackage.InterfaceC1781) r7
            com.android.app.CustomRecyclerView r8 = (com.android.app.CustomRecyclerView) r8
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            java.lang.String r1 = defpackage.AbstractC0225.m809(r0)
            int r2 = r1.length()
            if (r2 != 0) goto L3e3
            r0 = -652663514897966(0xfffdae67ef0961d2, double:NaN)
            java.lang.String r0 = "请输入分类名称"
            defpackage.AbstractC0209.m764(r0)
            goto L440
        L3e3:
            ᛴᛶᲁᛲ r2 = defpackage.C0697.f3343
            r2.getClass()
            r2 = -193905173110318(0xffff4fa4ef0961d2, double:NaN)
            r2 = -193939532848686(0xffff4f9cef0961d2, double:NaN)
            boolean r2 = defpackage.AbstractC1347.m2524(r1)
            if (r2 == 0) goto L3ff
            goto L409
        L3ff:
            java.util.ArrayList r2 = defpackage.C0697.m1577(r9)
            boolean r3 = r2.contains(r1)
            if (r3 == 0) goto L416
        L409:
            r0 = -652732234374702(0xfffdae57ef0961d2, double:NaN)
            java.lang.String r0 = "分类已存在"
            defpackage.AbstractC0209.m764(r0)
            goto L440
        L416:
            r14 = 0
            r2.add(r14, r1)
            defpackage.C0697.m1576(r9, r2)
            r1 = -652697874636334(0xfffdae5fef0961d2, double:NaN)
            java.lang.String r1 = "添加成功 ✓"
            defpackage.AbstractC0209.m764(r1)
            ᛶᛸᛱᲀ r1 = defpackage.C1121.f5003
            defpackage.C1121.m2134(r9)
            r1 = -652727939407406(0xfffdae58ef0961d2, double:NaN)
            java.lang.String r1 = ""
            r0.setText(r1)
            defpackage.C1478.m2687(r9, r8, r6, r5, r7)
            r7.mo1032()
        L440:
            return
        L441:
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            ᛷᛶᛷᛲ r7 = (defpackage.C1294) r7
            android.content.Context r8 = (android.content.Context) r8
            ᛲᲀ r5 = (defpackage.C0345) r5
            android.app.AlertDialog r6 = (android.app.AlertDialog) r6
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r19 = r0.toString()
            java.lang.String r20 = defpackage.AbstractC0225.m809(r9)
            java.lang.String r0 = r7.f5750
            java.lang.String r1 = r7.f5748
            java.lang.String r2 = r7.f5747
            java.lang.String r3 = r7.f5753
            long r9 = r7.f5754
            long r11 = r7.f5743
            java.lang.String r4 = r7.f5746
            java.lang.String r13 = r7.f5751
            java.lang.String r14 = r7.f5744
            java.lang.String r7 = r7.f5745
            r17 = -231052345253422(0xffff2ddbef0961d2, double:NaN)
            r17 = -231065230155310(0xffff2dd8ef0961d2, double:NaN)
            r17 = -231103884860974(0xffff2dcfef0961d2, double:NaN)
            r17 = -231133949632046(0xffff2dc8ef0961d2, double:NaN)
            r17 = -231168309370414(0xffff2dc0ef0961d2, double:NaN)
            r17 = -231185489239598(0xffff2dbcef0961d2, double:NaN)
            ᛷᛶᛷᛲ r17 = new ᛷᛶᛷᛲ
            r18 = r0
            r21 = r1
            r22 = r2
            r23 = r3
            r28 = r4
            r31 = r7
            r24 = r9
            r26 = r11
            r29 = r13
            r30 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31)
            ᲁᲁᛷᲈ r0 = defpackage.C0682.f3280
            ᛴᛵᲇᲇ r0 = r0.m3354(r8)
            ᛸᲀᛶᛶ r1 = new ᛸᲀᛶᛶ
            r14 = 1
            r1.<init>(r8, r5, r6, r14)
            r2 = -716821736365614(0xfffd740def0961d2, double:NaN)
            java.lang.Object r2 = r0.f3285
            ᛳᲁᛳᛴ r2 = (defpackage.C0554) r2
            ᲁᲀᲇᛱ r21 = new ᲁᲀᲇᛱ
            r26 = 12
            r25 = 0
            r22 = r0
            r24 = r1
            r23 = r17
            r21.<init>(r22, r23, r24, r25, r26)
            r0 = r21
            r1 = r25
            r3 = 3
            defpackage.AbstractC0397.m1149(r2, r1, r0, r3)
            return
        L4ee:
            r33 = 0
            ᲁᛷᛵ r0 = (defpackage.C1884) r0
            java.lang.String r9 = (java.lang.String) r9
            android.app.Activity r7 = (android.app.Activity) r7
            ᛸᛱᛴᲁ r8 = (defpackage.C1419) r8
            android.app.AlertDialog r6 = (android.app.AlertDialog) r6
            ᲇᛱᲈᲀ r5 = (defpackage.C1992) r5
            java.lang.Object r0 = r0.f8179
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r1 = r0.getText()
            if (r1 == 0) goto L515
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L515
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            goto L517
        L515:
            r1 = r33
        L517:
            if (r1 != 0) goto L522
            r1 = -148163771407918(0xffff793eef0961d2, double:NaN)
            java.lang.String r1 = ""
        L522:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L546
            r1 = -148168066375214(0xffff793def0961d2, double:NaN)
            java.lang.String r1 = "请输入完整承诺内容"
            r0.setError(r1)
            r0.requestFocus()
            ᛲᲈᛶᲈ r0 = defpackage.C1836.f8024
            r0 = -148211016048174(0xffff7933ef0961d2, double:NaN)
            java.lang.String r0 = "请输入：免费模块我承诺不倒卖我承诺不在国内传播我承诺不用于商业用途及非法用途"
            defpackage.C1836.m3231(r7, r0)
            return
        L546:
            java.lang.Object r0 = r8.f6211
            ᲇᛳᛸᛳ r0 = (defpackage.InterfaceC2023) r0
            defpackage.AbstractC1193.m2333(r0)
            r6.dismiss()
            r5.mo1032()
            throw r33
    }
}
