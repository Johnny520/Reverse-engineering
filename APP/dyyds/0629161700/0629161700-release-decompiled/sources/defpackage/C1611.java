package defpackage;

/* JADX INFO: renamed from: ᛸᲈᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1611 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f7115;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f7116;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f7117;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f7118;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7119;

    public /* synthetic */ C1611(java.lang.String r1, java.lang.String r2, java.lang.String r3, defpackage.InterfaceC0140 r4, int r5) {
            r0 = this;
            r0.f7119 = r5
            r0.f7117 = r1
            r0.f7118 = r2
            r0.f7116 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f7119
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛸᲈᲇᛴ r2 = (defpackage.C1611) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛸᲈᲇᛴ r2 = (defpackage.C1611) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.f7119
            switch(r9) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            ᛸᲈᲇᛴ r0 = new ᛸᲈᲇᛴ
            java.lang.String r3 = r7.f7116
            r5 = 1
            java.lang.String r1 = r7.f7117
            java.lang.String r2 = r7.f7118
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            ᛸᲈᲇᛴ r1 = new ᛸᲈᲇᛴ
            r5 = r4
            java.lang.String r4 = r7.f7116
            r6 = 0
            java.lang.String r2 = r7.f7117
            java.lang.String r3 = r7.f7118
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f7119
            java.lang.String r1 = r11.f7116
            java.lang.String r2 = r11.f7118
            java.lang.String r3 = r11.f7117
            r4 = 0
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            r6 = 1
            switch(r0) {
                case 0: goto L12c;
                default: goto Lf;
            }
        Lf:
            int r0 = r11.f7115
            r7 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            r9 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            if (r0 == 0) goto L36
            if (r0 != r6) goto L28
            defpackage.AbstractC0762.m1680(r12)     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            goto L49
        L23:
            r11 = move-exception
            goto L75
        L25:
            r11 = move-exception
            goto Lb1
        L28:
            r11 = -351173990587950(0xfffec09bef0961d2, double:NaN)
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r11)
            goto L12b
        L36:
            defpackage.AbstractC0762.m1680(r12)
            ᲁᛷᛵ r12 = new ᲁᛷᛵ     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r12.<init>(r3, r2, r1)     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r11.f7115 = r6     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            java.lang.Object r12 = r12.m3311(r11)     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            if (r12 != r5) goto L49
            r4 = r5
            goto L12b
        L49:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r11.<init>()     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r0 = -350710134119982(0xfffec107ef0961d2, double:NaN)
            java.lang.String r0 = "验证成功，目录可访问（"     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r11.append(r0)     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            int r12 = r12.size()     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r11.append(r12)     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r0 = -350761673727534(0xfffec0fbef0961d2, double:NaN)
            java.lang.String r12 = " 项）"     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            r11.append(r12)     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L23 defpackage.C0494 -> L25
            goto L126
        L75:
            r0 = -351088091242030(0xfffec0afef0961d2, double:NaN)
            java.lang.String r12 = "WebDav连接测试失败"
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r12, r11)
            java.lang.Exception r12 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -351143925816878(0xfffec0a2ef0961d2, double:NaN)
            java.lang.String r1 = "连接失败: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r12.<init>(r11)
            ᛴᛸᛲᲀ r11 = new ᛴᛸᛲᲀ
            r11.<init>(r12)
            goto L126
        Lb1:
            r0 = -350778853596718(0xfffec0f7ef0961d2, double:NaN)
            java.lang.String r12 = "WebDav连接测试失败"
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r12, r11)
            r12 = 401(0x191, float:5.62E-43)
            int r0 = r11.f2439
            if (r0 == r12) goto L113
            r12 = 403(0x193, float:5.65E-43)
            if (r0 == r12) goto L113
            r12 = 404(0x194, float:5.66E-43)
            if (r0 == r12) goto L109
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r1 = -351032256667182(0xfffec0bcef0961d2, double:NaN)
            java.lang.String r1 = "连接失败: HTTP "
            r12.<init>(r1)
            r12.append(r0)
            r0 = 32
            r12.append(r0)
            java.lang.String r11 = r11.f2438
            if (r11 != 0) goto Lf9
            r0 = -351083796274734(0xfffec0b0ef0961d2, double:NaN)
            java.lang.String r11 = ""
        Lf9:
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.CharSequence r11 = defpackage.AbstractC1347.m2521(r11)
            java.lang.String r11 = r11.toString()
            goto L11c
        L109:
            r11 = -350924882484782(0xfffec0d5ef0961d2, double:NaN)
            java.lang.String r11 = "服务器地址不存在，请确认 WebDAV 目录地址"
            goto L11c
        L113:
            r11 = -350834688171566(0xfffec0eaef0961d2, double:NaN)
            java.lang.String r11 = "账号或密码错误，或当前账号无权访问该目录"
        L11c:
            java.lang.Exception r12 = new java.lang.Exception
            r12.<init>(r11)
            ᛴᛸᛲᲀ r11 = new ᛴᛸᛲᲀ
            r11.<init>(r12)
        L126:
            ᲇᲈᛸᛶ r4 = new ᲇᲈᛸᛶ
            r4.<init>(r11)
        L12b:
            return r4
        L12c:
            int r0 = r11.f7115
            if (r0 == 0) goto L147
            if (r0 != r6) goto L13a
            defpackage.AbstractC0762.m1680(r12)
            ᲇᲈᛸᛶ r12 = (defpackage.C2165) r12
            java.lang.Object r11 = r12.f9224
            goto L162
        L13a:
            r11 = -73100627975726(0xffffbd83ef0961d2, double:NaN)
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r11)
            goto L189
        L147:
            defpackage.AbstractC0762.m1680(r12)
            r7 = -73040498433582(0xffffbd91ef0961d2, double:NaN)
            java.lang.String r12 = "测试连接中..."
            defpackage.C0525.m1315(r12)
            ᛱᛲᛸᛲ r12 = defpackage.C0040.f549
            r11.f7115 = r6
            java.lang.Object r11 = r12.m373(r3, r2, r1, r11)
            if (r11 != r5) goto L162
            r4 = r5
            goto L189
        L162:
            defpackage.C0525.m1317()
            boolean r12 = r11 instanceof defpackage.C0723
            if (r12 != 0) goto L16f
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            defpackage.AbstractC0209.m764(r12)
        L16f:
            java.lang.Throwable r11 = defpackage.C2165.m3569(r11)
            if (r11 == 0) goto L187
            java.lang.String r11 = r11.getMessage()
            if (r11 != 0) goto L184
            r11 = -73079153139246(0xffffbd88ef0961d2, double:NaN)
            java.lang.String r11 = "连接失败"
        L184:
            defpackage.AbstractC0209.m764(r11)
        L187:
            ᲁᲀᛱᲁ r4 = defpackage.C1907.f8270
        L189:
            return r4
    }
}
