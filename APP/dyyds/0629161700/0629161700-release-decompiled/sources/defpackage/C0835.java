package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0835 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f3837;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3838;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3839;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.Object f3840;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3841;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3842;

    public /* synthetic */ C0835(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, defpackage.InterfaceC0140 r5, int r6) {
            r0 = this;
            r0.f3842 = r6
            r0.f3840 = r1
            r0.f3841 = r2
            r0.f3838 = r3
            r0.f3839 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public /* synthetic */ C0835(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, defpackage.InterfaceC0140 r4, int r5) {
            r0 = this;
            r0.f3842 = r5
            r0.f3841 = r1
            r0.f3838 = r2
            r0.f3839 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ C0835(java.lang.Object r1, java.lang.Object r2, java.lang.String r3, java.lang.String r4, defpackage.InterfaceC0140 r5, int r6) {
            r0 = this;
            r0.f3842 = r6
            r0.f3840 = r1
            r0.f3839 = r2
            r0.f3841 = r3
            r0.f3838 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public C0835(java.lang.String r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, com.ss.android.ugc.aweme.comment.model.Comment r4, android.content.Context r5, defpackage.InterfaceC0140 r6) {
            r1 = this;
            r0 = 6
            r1.f3842 = r0
            r1.f3841 = r2
            r1.f3840 = r3
            r1.f3838 = r4
            r1.f3839 = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    public C0835(defpackage.C0974 r2, android.content.Context r3, defpackage.C0264 r4, java.lang.String r5, defpackage.InterfaceC0140 r6) {
            r1 = this;
            r0 = 8
            r1.f3842 = r0
            r1.f3840 = r2
            r1.f3838 = r3
            r1.f3839 = r4
            r1.f3841 = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    public C0835(defpackage.C1419 r2, android.widget.TextView r3, java.lang.String r4, defpackage.InterfaceC0140 r5) {
            r1 = this;
            r0 = 2
            r1.f3842 = r0
            r1.f3838 = r2
            r1.f3839 = r3
            r1.f3841 = r4
            r1.<init>(r0, r5)
            return
    }

    public C0835(defpackage.C1630 r2, java.lang.String r3, defpackage.C1093 r4, java.lang.String r5, defpackage.InterfaceC0140 r6) {
            r1 = this;
            r0 = 0
            r1.f3842 = r0
            r1.f3840 = r2
            r1.f3841 = r3
            r1.f3839 = r4
            r1.f3838 = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    private final java.lang.Object m1767(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.f3839
            r4 = r1
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r1 = r0.f3838
            r9 = r1
            ᛷᛱᲈᛸ r9 = (defpackage.EnumC1218) r9
            java.lang.Object r2 = r0.f3841
            r3 = r2
            ᛷᲇᲇᲀ r3 = (defpackage.C1394) r3
            int r2 = r0.f3837
            r10 = 0
            r11 = 3
            r5 = 2
            r6 = 1
            r12 = 0
            ᛴᛵ r13 = defpackage.EnumC0670.f3246
            if (r2 == 0) goto L47
            if (r2 == r6) goto L41
            if (r2 == r5) goto L37
            if (r2 != r11) goto L2a
            defpackage.AbstractC0762.m1680(r17)     // Catch: java.lang.Exception -> L27
            goto Lda
        L27:
            r0 = move-exception
            goto L146
        L2a:
            r0 = -161095917936174(0xffff6d7bef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            return r12
        L37:
            java.lang.Object r2 = r0.f3840
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            defpackage.AbstractC0762.m1680(r17)     // Catch: java.lang.Exception -> L27
            r5 = r17
            goto Lad
        L41:
            defpackage.AbstractC0762.m1680(r17)     // Catch: java.lang.Exception -> L27
            r2 = r17
            goto L82
        L47:
            defpackage.AbstractC0762.m1680(r17)
            r7 = -160778090356270(0xffff6dc5ef0961d2, double:NaN)
            java.lang.String r2 = "正在准备备份数据..."     // Catch: java.lang.Exception -> L27
            ᛶᛶᲇᲈ r7 = defpackage.C1394.f6045     // Catch: java.lang.Exception -> L27
            android.app.Activity r7 = r3.f6050     // Catch: java.lang.Exception -> L27
            ᛷᲈᲇᛳ r8 = new ᛷᲈᲇᛳ     // Catch: java.lang.Exception -> L27
            r8.<init>(r3, r2, r10)     // Catch: java.lang.Exception -> L27
            r7.runOnUiThread(r8)     // Catch: java.lang.Exception -> L27
            boolean r2 = r9.f5473     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L85
            r7 = -160829629963822(0xffff6db9ef0961d2, double:NaN)
            java.lang.String r2 = "正在收集配置数据..."     // Catch: java.lang.Exception -> L27
            r3.m2562(r2)     // Catch: java.lang.Exception -> L27
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L27
            ᛴᛵᲁᛳ r2 = defpackage.ExecutorC0679.f3269     // Catch: java.lang.Exception -> L27
            ᛵᛵᲁᛲ r7 = new ᛵᛵᲁᛲ     // Catch: java.lang.Exception -> L27
            r8 = 5
            r7.<init>(r3, r12, r8)     // Catch: java.lang.Exception -> L27
            r0.f3837 = r6     // Catch: java.lang.Exception -> L27
            java.lang.Object r2 = defpackage.AbstractC0397.m1144(r2, r7, r0)     // Catch: java.lang.Exception -> L27
            if (r2 != r13) goto L82
            goto Ld9
        L82:
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Exception -> L27
            goto L86
        L85:
            r2 = r12
        L86:
            boolean r6 = r9.f5468     // Catch: java.lang.Exception -> L27
            if (r6 == 0) goto Lb2
            r6 = -160881169571374(0xffff6dadef0961d2, double:NaN)
            java.lang.String r6 = "正在收集插眼数据..."     // Catch: java.lang.Exception -> L27
            ᛶᛶᲇᲈ r7 = defpackage.C1394.f6045     // Catch: java.lang.Exception -> L27
            r3.m2562(r6)     // Catch: java.lang.Exception -> L27
            ᛶᛸᛳ r6 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L27
            ᛴᛵᲁᛳ r6 = defpackage.ExecutorC0679.f3269     // Catch: java.lang.Exception -> L27
            ᛱᛶᛵᛸ r7 = new ᛱᛶᛵᛸ     // Catch: java.lang.Exception -> L27
            r8 = 4
            r7.<init>(r3, r12, r8)     // Catch: java.lang.Exception -> L27
            r0.f3840 = r2     // Catch: java.lang.Exception -> L27
            r0.f3837 = r5     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = defpackage.AbstractC0397.m1144(r6, r7, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r13) goto Lad
            goto Ld9
        Lad:
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch: java.lang.Exception -> L27
            r7 = r5
        Lb0:
            r6 = r2
            goto Lb4
        Lb2:
            r7 = r12
            goto Lb0
        Lb4:
            r14 = -160932709178926(0xffff6da1ef0961d2, double:NaN)
            java.lang.String r2 = "正在写入备份文件..."     // Catch: java.lang.Exception -> L27
            ᛶᛶᲇᲈ r5 = defpackage.C1394.f6045     // Catch: java.lang.Exception -> L27
            r3.m2562(r2)     // Catch: java.lang.Exception -> L27
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L27
            ᛴᛵᲁᛳ r14 = defpackage.ExecutorC0679.f3269     // Catch: java.lang.Exception -> L27
            ᛸᛴᛴᛱ r2 = new ᛸᛴᛴᛱ     // Catch: java.lang.Exception -> L27
            r5 = r1
            ᛷᛱᲈᛸ r5 = (defpackage.EnumC1218) r5     // Catch: java.lang.Exception -> L27
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L27
            r0.f3840 = r12     // Catch: java.lang.Exception -> L27
            r0.f3837 = r11     // Catch: java.lang.Exception -> L27
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r14, r2, r0)     // Catch: java.lang.Exception -> L27
            if (r0 != r13) goto Lda
        Ld9:
            return r13
        Lda:
            ᛶᛶᲇᲈ r0 = defpackage.C1394.f6045     // Catch: java.lang.Exception -> L27
            r3.m2565()     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r9.f5471     // Catch: java.lang.Exception -> L27
            r1 = -160984248786478(0xffff6d95ef0961d2, double:NaN)
            java.lang.String r1 = "导出成功"     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Exception -> L27
            defpackage.AbstractC0209.m765(r0)     // Catch: java.lang.Exception -> L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r0.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r9.f5471     // Catch: java.lang.Exception -> L27
            r0.append(r1)     // Catch: java.lang.Exception -> L27
            r1 = -161005723622958(0xffff6d90ef0961d2, double:NaN)
            java.lang.String r1 = "导出成功: "     // Catch: java.lang.Exception -> L27
            r0.append(r1)     // Catch: java.lang.Exception -> L27
            r0.append(r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L27
            r1 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r1 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r1 = r0.length()     // Catch: java.lang.Exception -> L27
            if (r1 != 0) goto L125
            goto L188
        L125:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L27
        L129:
            if (r10 >= r1) goto L188
            int r2 = r10 + 2000
            if (r2 <= r1) goto L130
            r2 = r1
        L130:
            java.lang.String r4 = r0.substring(r10, r2)     // Catch: java.lang.Exception -> L27
            r5 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r5 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L27
            r5.getClass()     // Catch: java.lang.Exception -> L27
            defpackage.C0346.m1040(r4)     // Catch: java.lang.Exception -> L27
            r10 = r2
            goto L129
        L146:
            ᛶᛶᲇᲈ r1 = defpackage.C1394.f6045
            r3.m2565()
            r1 = -161035788394030(0xffff6d89ef0961d2, double:NaN)
            java.lang.String r1 = "导出备份失败"
            r2 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r2 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -161065853165102(0xffff6d82ef0961d2, double:NaN)
            java.lang.String r2 = "导出失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.AbstractC0209.m765(r0)
        L188:
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    private final java.lang.Object m1768(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f3837
            r1 = 2
            r2 = 1
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L10
            defpackage.AbstractC0762.m1680(r11)
            goto L5f
        L10:
            r10 = -655055811681838(0xfffdac3aef0961d2, double:NaN)
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r10)
            r10 = 0
            return r10
        L1e:
            defpackage.AbstractC0762.m1680(r11)
            goto L34
        L22:
            defpackage.AbstractC0762.m1680(r11)
            java.util.Map r11 = defpackage.C1746.f7729
            java.lang.Object r11 = r10.f3840
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = (com.ss.android.ugc.aweme.feed.model.Aweme) r11
            r10.f3837 = r2
            java.lang.Object r11 = defpackage.C1746.m3129(r11, r10)
            if (r11 != r3) goto L34
            goto L5e
        L34:
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            boolean r11 = defpackage.AbstractC1347.m2524(r8)
            if (r11 != 0) goto L5f
            ᛶᛸᛳ r11 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r11 = defpackage.AbstractC1497.f6594
            ᲀᛳᛴ r4 = new ᲀᛳᛴ
            java.lang.Object r0 = r10.f3839
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r0 = r10.f3841
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r10.f3838
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f3837 = r1
            java.lang.Object r10 = defpackage.AbstractC0397.m1144(r11, r4, r10)
            if (r10 != r3) goto L5f
        L5e:
            return r3
        L5f:
            ᲁᲀᛱᲁ r10 = defpackage.C1907.f8270
            return r10
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    private final java.lang.Object m1769(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.f3840
            ᛵᲁᛸᛸ r0 = (defpackage.C0974) r0
            ᛷᛷᲀᛳ r1 = r0.f4366
            int r0 = r11.f3837
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 != r3) goto L15
            defpackage.AbstractC0762.m1680(r12)     // Catch: java.lang.Throwable -> L12
            goto L59
        L12:
            r0 = move-exception
            r11 = r0
            goto L61
        L15:
            r11 = -160571931926062(0xffff6df5ef0961d2, double:NaN)
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r11)
            return r2
        L22:
            defpackage.AbstractC0762.m1680(r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r1.mo617(r12)
            ᛶᲁᛳᛶ r4 = defpackage.C1150.f5242     // Catch: java.lang.Throwable -> L12
            java.lang.Object r12 = r11.f3838     // Catch: java.lang.Throwable -> L12
            r5 = r12
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L12
            r6 = -160554752056878(0xffff6df9ef0961d2, double:NaN)
            java.lang.String r12 = "mp4"     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r11.f3839     // Catch: java.lang.Throwable -> L12
            ᛲᛳᛴᲁ r0 = (defpackage.C0264) r0     // Catch: java.lang.Throwable -> L12
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f1523     // Catch: java.lang.Throwable -> L12
            r6 = 12
            java.lang.String r7 = defpackage.C1654.m3047(r12, r0, r2, r6)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r12 = r11.f3841     // Catch: java.lang.Throwable -> L12
            r8 = r12
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L12
            r11.f3837 = r3     // Catch: java.lang.Throwable -> L12
            r6 = 0
            r9 = 0
            r10 = r11
            java.lang.Object r11 = r4.m2239(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L12
            ᛴᛵ r12 = defpackage.EnumC0670.f3246
            if (r11 != r12) goto L59
            return r12
        L59:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1.mo617(r11)
            ᲁᲀᛱᲁ r11 = defpackage.C1907.f8270
            return r11
        L61:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r1.mo617(r12)
            throw r11
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f3842
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L84;
                case 2: goto L79;
                case 3: goto L6e;
                case 4: goto L63;
                case 5: goto L58;
                case 6: goto L4d;
                case 7: goto L42;
                case 8: goto L37;
                case 9: goto L2c;
                case 10: goto L21;
                case 11: goto L16;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L21:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L2c:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L37:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L42:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L4d:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L58:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L63:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L6e:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L79:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L84:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L8f:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛵᛲᛸᛱ r2 = (defpackage.C0835) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r13, java.lang.Object r14) {
            r12 = this;
            int r0 = r12.f3842
            java.lang.Object r1 = r12.f3839
            java.lang.Object r2 = r12.f3838
            java.lang.Object r3 = r12.f3841
            switch(r0) {
                case 0: goto L102;
                case 1: goto Lf0;
                case 2: goto Le3;
                case 3: goto Lcd;
                case 4: goto Lb7;
                case 5: goto La1;
                case 6: goto L8c;
                case 7: goto L76;
                case 8: goto L61;
                case 9: goto L4c;
                case 10: goto L39;
                case 11: goto L22;
                default: goto Lb;
            }
        Lb:
            ᛵᛲᛸᛱ r4 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r5 = r12
            ᛴᛵᲇᲇ r5 = (defpackage.C0682) r5
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r8 = r1
            ᛶᛳᛷᲀ r8 = (defpackage.C1043) r8
            r10 = 12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L22:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r6 = r12
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r11 = 11
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L39:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            r6 = r3
            ᛷᲇᲇᲀ r6 = (defpackage.C1394) r6
            r7 = r2
            ᛷᛱᲈᛸ r7 = (defpackage.EnumC1218) r7
            r8 = r1
            android.net.Uri r8 = (android.net.Uri) r8
            r9 = r10
            r10 = 10
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L4c:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            r6 = r3
            com.ss.android.ugc.awemes.WardDatabase r6 = (com.ss.android.ugc.awemes.WardDatabase) r6
            r7 = r2
            ᲈᛶᛳᛷ r7 = (defpackage.C2260) r7
            r8 = r1
            ᛲᛷᛶᛸ r8 = (defpackage.C0320) r8
            r9 = r10
            r10 = 9
            r5.<init>(r6, r7, r8, r9, r10)
            r5.f3840 = r14
            return r5
        L61:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r6 = r12
            ᛵᲁᛸᛸ r6 = (defpackage.C0974) r6
            r7 = r2
            android.content.Context r7 = (android.content.Context) r7
            r8 = r1
            ᛲᛳᛴᲁ r8 = (defpackage.C0264) r8
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L76:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r6 = r12
            com.ss.ugc.aweme.ImageUrlStruct r6 = (com.ss.ugc.aweme.ImageUrlStruct) r6
            r7 = r3
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
            r8 = r2
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9 = r1
            android.content.Context r9 = (android.content.Context) r9
            r11 = 7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L8c:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r12 = r12.f3840
            r7 = r12
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
            r8 = r2
            com.ss.android.ugc.aweme.comment.model.Comment r8 = (com.ss.android.ugc.aweme.comment.model.Comment) r8
            r9 = r1
            android.content.Context r9 = (android.content.Context) r9
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        La1:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r6 = r12
            ᛸᛶᲈᛷ r6 = (defpackage.C1522) r6
            r7 = r3
            android.app.NotificationManager r7 = (android.app.NotificationManager) r7
            r8 = r2
            android.content.Context r8 = (android.content.Context) r8
            r9 = r1
            java.io.File r9 = (java.io.File) r9
            r11 = 5
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        Lb7:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r6 = r12
            android.content.Context r6 = (android.content.Context) r6
            r7 = r1
            com.bytedance.im.core.model.Message r7 = (com.bytedance.im.core.model.Message) r7
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r11 = 4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        Lcd:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r6 = r12
            android.content.Context r6 = (android.content.Context) r6
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r9 = r1
            ᲀᲀᛵᛸ r9 = (defpackage.C1741) r9
            r11 = 3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        Le3:
            r10 = r13
            ᛵᛲᛸᛱ r12 = new ᛵᛲᛸᛱ
            ᛸᛱᛴᲁ r2 = (defpackage.C1419) r2
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = (java.lang.String) r3
            r12.<init>(r2, r1, r3, r10)
            return r12
        Lf0:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            r6 = r3
            com.ss.android.ugc.aweme.comment.model.Comment r6 = (com.ss.android.ugc.aweme.comment.model.Comment) r6
            r7 = r2
            android.content.Context r7 = (android.content.Context) r7
            r8 = r1
            android.app.Dialog r8 = (android.app.Dialog) r8
            r9 = r10
            r10 = 1
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L102:
            r10 = r13
            ᛵᛲᛸᛱ r5 = new ᛵᛲᛸᛱ
            java.lang.Object r12 = r12.f3840
            r6 = r12
            ᲀᛲᛶᲈ r6 = (defpackage.C1630) r6
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            r8 = r1
            ᛶᛶᛶᛲ r8 = (defpackage.C1093) r8
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r29) {
            r28 = this;
            r1 = r28
            int r0 = r1.f3842
            r6 = 3
            r10 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r7 = 2
            r12 = 0
            r13 = 1
            r14 = 0
            switch(r0) {
                case 0: goto L735;
                case 1: goto L5d4;
                case 2: goto L568;
                case 3: goto L4aa;
                case 4: goto L43b;
                case 5: goto L3ad;
                case 6: goto L2d3;
                case 7: goto L143;
                case 8: goto L13e;
                case 9: goto Lde;
                case 10: goto Ld9;
                case 11: goto Ld4;
                default: goto L11;
            }
        L11:
            java.lang.Object r0 = r1.f3839
            r2 = r0
            ᛶᛳᛷᲀ r2 = (defpackage.C1043) r2
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            int r0 = r1.f3837
            r4 = 7
            if (r0 == 0) goto L55
            if (r0 == r13) goto L4a
            if (r0 == r7) goto L38
            if (r0 != r6) goto L2a
            defpackage.AbstractC0762.m1680(r29)
            r0 = r29
            goto Lcf
        L2a:
            r0 = -1026596252589614(0xfffc5a50ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto Ld3
        L38:
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Exception -> L43
            r0 = r29
            r18 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            goto La1
        L43:
            r0 = move-exception
            r18 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            goto La5
        L4a:
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Exception -> L43
            r0 = r29
            r18 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            goto L89
        L55:
            defpackage.AbstractC0762.m1680(r29)
            java.lang.Object r0 = r1.f3840     // Catch: java.lang.Exception -> L43
            ᛴᛵᲇᲇ r0 = (defpackage.C0682) r0     // Catch: java.lang.Exception -> L43
            java.lang.Object r0 = r0.f3286     // Catch: java.lang.Exception -> L43
            ᛲᛶᛸᛱ r0 = (defpackage.C0312) r0     // Catch: java.lang.Exception -> L43
            java.lang.Object r5 = r1.f3841     // Catch: java.lang.Exception -> L43
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L43
            java.lang.Object r15 = r1.f3838     // Catch: java.lang.Exception -> L43
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Exception -> L43
            r1.f3837 = r13     // Catch: java.lang.Exception -> L43
            r0.getClass()     // Catch: java.lang.Exception -> L43
            r16 = -914416001785390(0xfffcc057ef0961d2, double:NaN)
            r18 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            java.lang.String r8 = "DELETE FROM ward_items WHERE awemeId = ? AND cid = ?"     // Catch: java.lang.Exception -> La4
            com.ss.android.ugc.awemes.WardDatabase r0 = r0.f1645     // Catch: java.lang.Exception -> La4
            ᛳᛱᛸᛴ r9 = new ᛳᛱᛸᛴ     // Catch: java.lang.Exception -> La4
            r9.<init>(r13, r8, r5, r15)     // Catch: java.lang.Exception -> La4
            java.lang.Object r0 = defpackage.AbstractC2193.m3596(r1, r9, r0, r12, r13)     // Catch: java.lang.Exception -> La4
            if (r0 != r3) goto L89
            goto Lcd
        L89:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> La4
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> La4
            ᛶᛸᛳ r5 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> La4
            ᛷᲁᛷᛵ r5 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> La4
            ᛱᛶᛵᛸ r8 = new ᛱᛶᛵᛸ     // Catch: java.lang.Exception -> La4
            r8.<init>(r2, r0, r14, r4)     // Catch: java.lang.Exception -> La4
            r1.f3837 = r7     // Catch: java.lang.Exception -> La4
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r5, r8, r1)     // Catch: java.lang.Exception -> La4
            if (r0 != r3) goto La1
            goto Lcd
        La1:
            ᲁᲀᛱᲁ r0 = (defpackage.C1907) r0     // Catch: java.lang.Exception -> La4
            goto Ld1
        La4:
            r0 = move-exception
        La5:
            r7 = -1026574777753134(0xfffc5a55ef0961d2, double:NaN)
            java.lang.String r5 = "执行失败"
            ᛲᲀᛱᲁ r7 = defpackage.C0346.f1773
            r7.getClass()
            defpackage.C0346.m1038(r5, r0)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᛵᛵᲁᛲ r5 = new ᛵᛵᲁᛲ
            r5.<init>(r2, r14, r4)
            r1.f3837 = r6
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r5, r1)
            if (r0 != r3) goto Lcf
        Lcd:
            r14 = r3
            goto Ld3
        Lcf:
            ᲁᲀᛱᲁ r0 = (defpackage.C1907) r0
        Ld1:
            ᲁᲀᛱᲁ r14 = defpackage.C1907.f8270
        Ld3:
            return r14
        Ld4:
            java.lang.Object r0 = r28.m1768(r29)
            return r0
        Ld9:
            java.lang.Object r0 = r28.m1767(r29)
            return r0
        Lde:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r2 = r1.f3837
            if (r2 == 0) goto Lf6
            if (r2 != r13) goto Lf0
            java.lang.Object r0 = r1.f3840
            ᛱᛸᛲᲀ r0 = (defpackage.InterfaceC0140) r0
            defpackage.AbstractC0762.m1680(r29)
            r1 = r29
            goto L138
        Lf0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L13d
        Lf6:
            defpackage.AbstractC0762.m1680(r29)
            java.lang.Object r2 = r1.f3840
            ᛷᲈᛳᛳ r2 = (defpackage.InterfaceC1399) r2
            ᛳᛵᲈᛵ r2 = r2.mo105()
            ᲀᛴᛱᛱ r3 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r2 = r2.mo970(r3)
            ᲁᛲᛱᛵ r2 = (defpackage.AbstractC1805) r2
            java.lang.Object r3 = r1.f3841
            com.ss.android.ugc.awemes.WardDatabase r3 = (com.ss.android.ugc.awemes.WardDatabase) r3
            ᲈᛷᛵᲀ r4 = new ᲈᛷᛵᲀ
            r4.<init>(r2)
            ᛸᛵᛸᛷ r2 = (defpackage.AbstractC1493) r2
            ᛳᛵᲈᛵ r2 = defpackage.AbstractC0397.m1146(r2, r4)
            java.lang.ThreadLocal r3 = r3.f432
            ᛷᲁᛳᲀ r4 = new ᛷᲁᛳᲀ
            r4.<init>(r2, r3)
            ᛳᛵᲈᛵ r2 = r2.mo971(r4)
            java.lang.Object r3 = r1.f3838
            ᲈᛶᛳᛷ r3 = (defpackage.C2260) r3
            java.lang.Object r4 = r1.f3839
            ᛲᛷᛶᛸ r4 = (defpackage.C0320) r4
            r1.f3840 = r3
            r1.f3837 = r13
            java.lang.Object r1 = defpackage.AbstractC0397.m1144(r2, r4, r1)
            if (r1 != r0) goto L137
            r14 = r0
            goto L13d
        L137:
            r0 = r3
        L138:
            r0.mo662(r1)
            ᲁᲀᛱᲁ r14 = defpackage.C1907.f8270
        L13d:
            return r14
        L13e:
            java.lang.Object r0 = r28.m1769(r29)
            return r0
        L143:
            r18 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            java.lang.Object r0 = r1.f3840
            com.ss.ugc.aweme.ImageUrlStruct r0 = (com.ss.ugc.aweme.ImageUrlStruct) r0
            ᛴᛵ r8 = defpackage.EnumC0670.f3246
            int r2 = r1.f3837
            if (r2 == 0) goto L175
            if (r2 == r13) goto L16e
            if (r2 != r7) goto L160
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Exception -> L15d
            r0 = r29
            goto L29c
        L15d:
            r0 = move-exception
            goto L2af
        L160:
            r0 = -398942616854062(0xfffe9529ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L2d2
        L16e:
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Exception -> L15d
            r0 = r29
            goto L225
        L175:
            defpackage.AbstractC0762.m1680(r29)
            java.util.List r2 = r0.urlList     // Catch: java.lang.Exception -> L15d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L15d
            r3.<init>()     // Catch: java.lang.Exception -> L15d
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Exception -> L15d
        L183:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L15d
            if (r5 == 0) goto L1c1
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L15d
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L15d
            r15 = -398465875484206(0xfffe9598ef0961d2, double:NaN)
            java.lang.String r9 = ".jpeg"     // Catch: java.lang.Exception -> L15d
            boolean r9 = defpackage.AbstractC1347.m2500(r6, r9, r12)     // Catch: java.lang.Exception -> L15d
            if (r9 != 0) goto L1bd
            r15 = -398491645287982(0xfffe9592ef0961d2, double:NaN)
            java.lang.String r9 = ".png"     // Catch: java.lang.Exception -> L15d
            boolean r9 = defpackage.AbstractC1347.m2500(r6, r9, r12)     // Catch: java.lang.Exception -> L15d
            if (r9 != 0) goto L1bd
            r15 = -398513120124462(0xfffe958def0961d2, double:NaN)
            java.lang.String r9 = ".webp"     // Catch: java.lang.Exception -> L15d
            boolean r6 = defpackage.AbstractC1347.m2500(r6, r9, r12)     // Catch: java.lang.Exception -> L15d
            if (r6 == 0) goto L183
        L1bd:
            r3.add(r5)     // Catch: java.lang.Exception -> L15d
            goto L183
        L1c1:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Exception -> L15d
            if (r4 != 0) goto L1c8
            r2 = r3
        L1c8:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L15d
            if (r3 == 0) goto L1d9
            java.util.Map r2 = defpackage.C1746.f7729     // Catch: java.lang.Exception -> L15d
            com.ss.android.ugc.aweme.feed.model.Video r2 = r0.video     // Catch: java.lang.Exception -> L15d
            java.lang.String r2 = defpackage.C1746.m3132(r2)     // Catch: java.lang.Exception -> L15d
        L1d6:
            r21 = r2
            goto L1e0
        L1d9:
            java.lang.Object r2 = defpackage.AbstractC1107.m2122(r2)     // Catch: java.lang.Exception -> L15d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L15d
            goto L1d6
        L1e0:
            if (r21 != 0) goto L1f5
            ᲇᲇᛸᛷ r0 = new ᲇᲇᛸᛷ     // Catch: java.lang.Exception -> L15d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L15d
            r2 = -398538889928238(0xfffe9587ef0961d2, double:NaN)
            java.lang.String r2 = "获取链接失败"     // Catch: java.lang.Exception -> L15d
            r0.<init>(r1, r2, r14)     // Catch: java.lang.Exception -> L15d
        L1f2:
            r14 = r0
            goto L2d2
        L1f5:
            java.util.Map r2 = defpackage.C1746.f7729     // Catch: java.lang.Exception -> L15d
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.video     // Catch: java.lang.Exception -> L15d
            java.util.List r0 = defpackage.C1746.m3124(r0)     // Catch: java.lang.Exception -> L15d
            if (r0 == 0) goto L205
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Exception -> L15d
            if (r2 == 0) goto L206
        L205:
            r12 = r13
        L206:
            if (r12 == 0) goto L23f
            ᛶᛸᛱᲀ r0 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L15d
            java.lang.Object r2 = r1.f3841     // Catch: java.lang.Exception -> L15d
            r4 = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4     // Catch: java.lang.Exception -> L15d
            java.lang.Object r2 = r1.f3838     // Catch: java.lang.Exception -> L15d
            r5 = r2
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Exception -> L15d
            java.lang.Object r2 = r1.f3839     // Catch: java.lang.Exception -> L15d
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Exception -> L15d
            r1.f3837 = r13     // Catch: java.lang.Exception -> L15d
            r3 = 0
            r7 = 0
            r6 = r21
            java.lang.Object r0 = r0.m2140(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L15d
            if (r0 != r8) goto L225
            goto L29a
        L225:
            ᲇᲇᛸᛷ r0 = (defpackage.C2150) r0     // Catch: java.lang.Exception -> L15d
            java.lang.Object r2 = r0.f9137     // Catch: java.lang.Exception -> L15d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L15d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L15d
            if (r2 == 0) goto L1f2
            ᛶᛸᛱᲀ r2 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L15d
            java.lang.Object r1 = r1.f3839     // Catch: java.lang.Exception -> L15d
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Exception -> L15d
            java.lang.Object r2 = r0.f9135     // Catch: java.lang.Exception -> L15d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L15d
            defpackage.C1121.m2133(r1, r2)     // Catch: java.lang.Exception -> L15d
            goto L1f2
        L23f:
            java.lang.Object r0 = defpackage.AbstractC1107.m2122(r0)     // Catch: java.lang.Exception -> L15d
            r22 = r0
            java.lang.String r22 = (java.lang.String) r22     // Catch: java.lang.Exception -> L15d
            r2 = -398568954699310(0xfffe9580ef0961d2, double:NaN)
            java.lang.String r0 = "jpg"     // Catch: java.lang.Exception -> L15d
            java.lang.Object r2 = r1.f3841     // Catch: java.lang.Exception -> L15d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2     // Catch: java.lang.Exception -> L15d
            java.lang.Object r3 = r1.f3838     // Catch: java.lang.Exception -> L15d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L15d
            java.io.File r0 = defpackage.C1654.m3039(r0, r2, r3)     // Catch: java.lang.Exception -> L15d
            ᛶᲁᛳᛶ r2 = defpackage.C1150.f5242     // Catch: java.lang.Exception -> L15d
            java.lang.Object r3 = r1.f3839     // Catch: java.lang.Exception -> L15d
            r23 = r3
            android.content.Context r23 = (android.content.Context) r23     // Catch: java.lang.Exception -> L15d
            java.lang.String r26 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L15d
            r3 = -398586134568494(0xfffe957cef0961d2, double:NaN)
            r3 = -398676328881710(0xfffe9567ef0961d2, double:NaN)
            java.lang.String r24 = "_dy_live_temp_file.jpg"     // Catch: java.lang.Exception -> L15d
            r3 = -398775113129518(0xfffe9550ef0961d2, double:NaN)
            java.lang.String r25 = "_dy_live_temp_file.mp4"     // Catch: java.lang.Exception -> L15d
            r1.f3837 = r7     // Catch: java.lang.Exception -> L15d
            r2.getClass()     // Catch: java.lang.Exception -> L15d
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L15d
            ᛴᛵᲁᛳ r0 = defpackage.ExecutorC0679.f3269     // Catch: java.lang.Exception -> L15d
            ᛵᲇᛳᛵ r20 = new ᛵᲇᛳᛵ     // Catch: java.lang.Exception -> L15d
            r27 = 0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Exception -> L15d
            r2 = r20
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r2, r1)     // Catch: java.lang.Exception -> L15d
            if (r0 != r8) goto L29c
        L29a:
            r14 = r8
            goto L2d2
        L29c:
            ᛷᛳᲈᲈ r0 = (defpackage.C1250) r0     // Catch: java.lang.Exception -> L15d
            ᲇᲇᛸᛷ r1 = new ᲇᲇᛸᛷ     // Catch: java.lang.Exception -> L15d
            boolean r2 = r0.f5580     // Catch: java.lang.Exception -> L15d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L15d
            java.lang.String r3 = r0.f5581     // Catch: java.lang.Exception -> L15d
            java.lang.String r0 = r0.f5579     // Catch: java.lang.Exception -> L15d
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Exception -> L15d
        L2ad:
            r14 = r1
            goto L2d2
        L2af:
            r1 = -398873897377326(0xfffe9539ef0961d2, double:NaN)
            java.lang.String r1 = "saveImage error"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            ᲇᲇᛸᛷ r1 = new ᲇᲇᛸᛷ
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r2, r0, r14)
            goto L2ad
        L2d2:
            return r14
        L2d3:
            r18 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            java.lang.Object r0 = r1.f3839
            r8 = r0
            android.content.Context r8 = (android.content.Context) r8
            ᛴᛵ r9 = defpackage.EnumC0670.f3246
            int r0 = r1.f3837
            if (r0 == 0) goto L2fc
            if (r0 != r13) goto L2ee
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Exception -> L2eb
            r0 = r29
            goto L321
        L2eb:
            r0 = move-exception
            goto L372
        L2ee:
            r0 = -386942478229038(0xfffea013ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L3ac
        L2fc:
            defpackage.AbstractC0762.m1680(r29)
            ᛶᛸᛱᲀ r0 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L2eb
            java.lang.Object r2 = r1.f3841     // Catch: java.lang.Exception -> L2eb
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L2eb
            java.lang.Object r2 = r1.f3840     // Catch: java.lang.Exception -> L2eb
            r4 = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4     // Catch: java.lang.Exception -> L2eb
            java.lang.Object r2 = r1.f3838     // Catch: java.lang.Exception -> L2eb
            r3 = r2
            com.ss.android.ugc.aweme.comment.model.Comment r3 = (com.ss.android.ugc.aweme.comment.model.Comment) r3     // Catch: java.lang.Exception -> L2eb
            java.lang.Object r2 = r1.f3839     // Catch: java.lang.Exception -> L2eb
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Exception -> L2eb
            r1.f3837 = r13     // Catch: java.lang.Exception -> L2eb
            r5 = 0
            r7 = 1
            java.lang.Object r0 = r0.m2140(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2eb
            if (r0 != r9) goto L321
            r14 = r9
            goto L3ac
        L321:
            ᲇᲇᛸᛷ r0 = (defpackage.C2150) r0     // Catch: java.lang.Exception -> L2eb
            java.lang.Object r1 = r0.f9137     // Catch: java.lang.Exception -> L2eb
            java.lang.Object r2 = r0.f9136     // Catch: java.lang.Exception -> L2eb
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L2eb
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L2eb
            if (r1 == 0) goto L345
            ᛶᛸᛱᲀ r1 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L2eb
            java.lang.Object r0 = r0.f9135     // Catch: java.lang.Exception -> L2eb
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L2eb
            defpackage.C1121.m2133(r8, r0)     // Catch: java.lang.Exception -> L2eb
            r0 = -386822219144750(0xfffea02fef0961d2, double:NaN)
            java.lang.String r0 = "保存成功"     // Catch: java.lang.Exception -> L2eb
            defpackage.AbstractC0209.m764(r0)     // Catch: java.lang.Exception -> L2eb
            goto L3a5
        L345:
            r0 = -386843693981230(0xfffea02aef0961d2, double:NaN)
            java.lang.String r0 = "已取消"     // Catch: java.lang.Exception -> L2eb
            boolean r0 = defpackage.AbstractC0498.m1280(r2, r0)     // Catch: java.lang.Exception -> L2eb
            if (r0 != 0) goto L3a5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2eb
            r0.<init>()     // Catch: java.lang.Exception -> L2eb
            r3 = -386860873850414(0xfffea026ef0961d2, double:NaN)
            java.lang.String r1 = "保存失败: "     // Catch: java.lang.Exception -> L2eb
            r0.append(r1)     // Catch: java.lang.Exception -> L2eb
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L2eb
            r0.append(r2)     // Catch: java.lang.Exception -> L2eb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L2eb
            defpackage.AbstractC0209.m764(r0)     // Catch: java.lang.Exception -> L2eb
            goto L3a5
        L372:
            r1 = -386890938621486(0xfffea01fef0961d2, double:NaN)
            java.lang.String r1 = "保存失败"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -386912413457966(0xfffea01aef0961d2, double:NaN)
            java.lang.String r2 = "保存失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.AbstractC0209.m764(r0)
        L3a5:
            ᛶᛸᛱᲀ r0 = defpackage.C1121.f5003
            defpackage.C1121.m2134(r8)
            ᲁᲀᛱᲁ r14 = defpackage.C1907.f8270
        L3ac:
            return r14
        L3ad:
            ᛴᛵ r0 = defpackage.EnumC0670.f3246
            int r2 = r1.f3837
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r2 == 0) goto L3c9
            if (r2 != r13) goto L3bc
            defpackage.AbstractC0762.m1680(r29)
            goto L431
        L3bc:
            r0 = -389433559260718(0xfffe9dcfef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L43a
        L3c9:
            defpackage.AbstractC0762.m1680(r29)
            boolean r2 = defpackage.C2374.f10261
            if (r2 != 0) goto L438
            java.lang.Object r2 = r1.f3840
            ᛸᛶᲈᛷ r2 = (defpackage.C1522) r2
            r4 = -389390609587758(0xfffe9dd9ef0961d2, double:NaN)
            java.lang.String r4 = "下载完成"
            java.lang.CharSequence r4 = defpackage.C1522.m2769(r4)
            r2.f6723 = r4
            r2.f6712 = r12
            r2.f6715 = r12
            android.app.Notification r4 = r2.f6714
            int r5 = r4.flags
            r5 = r5 & (-3)
            r4.flags = r5
            r5 = 17301634(0x1080082, float:2.497962E-38)
            r4.icon = r5
            java.util.ArrayList r2 = r2.f6722
            r2.clear()
            java.lang.Object r2 = r1.f3841
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.lang.Object r4 = r1.f3840
            ᛸᛶᲈᛷ r4 = (defpackage.C1522) r4
            android.app.Notification r4 = r4.m2772()
            r2.notify(r3, r4)
            r4 = -389412084424238(0xfffe9dd4ef0961d2, double:NaN)
            java.lang.String r2 = "下载成功"
            defpackage.AbstractC0209.m764(r2)
            ᛶᛸᛱᲀ r2 = defpackage.C1121.f5003
            java.lang.Object r2 = r1.f3838
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r4 = r1.f3839
            java.io.File r4 = (java.io.File) r4
            java.lang.String r4 = r4.getAbsolutePath()
            defpackage.C1121.m2133(r2, r4)
            r1.f3837 = r13
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r2 = defpackage.AbstractC0729.m1644(r4, r1)
            if (r2 != r0) goto L431
            r14 = r0
            goto L43a
        L431:
            java.lang.Object r0 = r1.f3841
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r0.cancel(r3)
        L438:
            ᲁᲀᛱᲁ r14 = defpackage.C1907.f8270
        L43a:
            return r14
        L43b:
            ᛴᛵ r7 = defpackage.EnumC0670.f3246
            int r0 = r1.f3837
            if (r0 == 0) goto L454
            if (r0 != r13) goto L447
            defpackage.AbstractC0762.m1680(r29)
            goto L4a7
        L447:
            r0 = -654845358284334(0xfffdac6bef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L4a9
        L454:
            defpackage.AbstractC0762.m1680(r29)
            ᛶᲁᛳᛶ r0 = defpackage.C1150.f5242
            java.lang.Object r2 = r1.f3840
            android.content.Context r2 = (android.content.Context) r2
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            ᲈᲈᲁᛶ r4 = defpackage.C2374.f10260
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r8 = -654815293513262(0xfffdac72ef0961d2, double:NaN)
            java.lang.String r6 = "emoji_"
            r5.<init>(r6)
            java.lang.Object r6 = r1.f3839
            com.bytedance.im.core.model.Message r6 = (com.bytedance.im.core.model.Message) r6
            long r8 = r6.getMsgId()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r1.f3841
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r4.getClass()
            java.lang.String r4 = defpackage.C2374.m3891(r5, r6)
            r3.getClass()
            java.lang.String r3 = defpackage.C0346.m1036(r4)
            java.lang.Object r4 = r1.f3838
            java.lang.String r4 = (java.lang.String) r4
            r1.f3837 = r13
            r1 = r2
            r2 = 0
            r5 = 0
            r6 = r28
            java.lang.Object r0 = r0.m2239(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L4a7
            r14 = r7
            goto L4a9
        L4a7:
            ᲁᲀᛱᲁ r14 = defpackage.C1907.f8270
        L4a9:
            return r14
        L4aa:
            r18 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᲁᲀᛱᲁ r8 = defpackage.C1907.f8270
            ᛴᛵ r9 = defpackage.EnumC0670.f3246
            int r0 = r1.f3837
            if (r0 == 0) goto L4cb
            if (r0 != r13) goto L4bd
            defpackage.AbstractC0762.m1680(r29)
            goto L507
        L4bd:
            r0 = -596824645082670(0xfffde130ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L567
        L4cb:
            defpackage.AbstractC0762.m1680(r29)
            ᛶᲁᛳᛶ r0 = defpackage.C1150.f5242
            java.lang.Object r2 = r1.f3840
            android.content.Context r2 = (android.content.Context) r2
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            ᲈᲈᲁᛶ r4 = defpackage.C2374.f10260
            r5 = -596674321227310(0xfffde153ef0961d2, double:NaN)
            java.lang.String r5 = "DY_AUDIO_"
            java.lang.Object r6 = r1.f3841
            java.lang.String r6 = (java.lang.String) r6
            r4.getClass()
            java.lang.String r4 = defpackage.C2374.m3891(r5, r6)
            r3.getClass()
            java.lang.String r3 = defpackage.C0346.m1036(r4)
            java.lang.Object r4 = r1.f3838
            java.lang.String r4 = (java.lang.String) r4
            r1.f3837 = r13
            r1 = r2
            r2 = 0
            r5 = 0
            r6 = r28
            java.lang.Object r0 = r0.m2239(r1, r2, r3, r4, r5, r6)
            r1 = r6
            if (r0 != r9) goto L507
            r14 = r9
            goto L567
        L507:
            ᛸᛴᲁᛳ r0 = defpackage.C1478.f6557
            java.lang.Object r0 = r1.f3839
            ᲀᲀᛵᛸ r0 = (defpackage.C1741) r0
            java.lang.Object r0 = r0.f7705
            r1 = -596717270900270(0xfffde149ef0961d2, double:NaN)
            java.lang.String r1 = "dismiss"
            java.lang.Object[] r2 = new java.lang.Object[r12]
            if (r0 == 0) goto L54c
            int r3 = defpackage.AbstractC0233.f1405     // Catch: java.lang.Exception -> L54e
            ᛶᲈᛱᲈ r0 = defpackage.AbstractC2279.m3695(r0)     // Catch: java.lang.Exception -> L54e
            java.lang.Object r3 = r0.f5356     // Catch: java.lang.Exception -> L54e
            ᛷᲇᛱᲈ r3 = (defpackage.C1380) r3     // Catch: java.lang.Exception -> L54e
            r3.f6021 = r7     // Catch: java.lang.Exception -> L54e
            ᛶᛶᛲᛱ r0 = r0.m2298()     // Catch: java.lang.Exception -> L54e
            r0.m1954()     // Catch: java.lang.Exception -> L54e
            r0.f4431 = r1     // Catch: java.lang.Exception -> L54e
            r3 = -560480631823918(0xfffe023eef0961d2, double:NaN)
            java.util.List r0 = r0.mo1885()     // Catch: java.lang.Exception -> L54e
            java.lang.Object r0 = defpackage.AbstractC1107.m2124(r0)     // Catch: java.lang.Exception -> L54e
            ᛱᲁᛲᲁ r0 = (defpackage.C0178) r0     // Catch: java.lang.Exception -> L54e
            if (r0 == 0) goto L54c
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r12)     // Catch: java.lang.Exception -> L54e
            r0.m713(r1)     // Catch: java.lang.Exception -> L54e
        L54c:
            r14 = r8
            goto L567
        L54e:
            r0 = move-exception
            r1 = -596751630638638(0xfffde141ef0961d2, double:NaN)
            java.lang.String r1 = "callMethod error"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            goto L54c
        L567:
            return r14
        L568:
            ᛴᛵ r6 = defpackage.EnumC0670.f3246
            int r0 = r1.f3837
            if (r0 == 0) goto L585
            if (r0 != r13) goto L578
            java.lang.Object r0 = r1.f3840
            ᛳᛸᛳᛸ r0 = (defpackage.C0525) r0
            defpackage.AbstractC0762.m1680(r29)
            goto L5ce
        L578:
            r0 = -630943865282094(0xfffdc228ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L5d3
        L585:
            defpackage.AbstractC0762.m1680(r29)
            java.lang.Object r0 = r1.f3838
            ᛸᛱᛴᲁ r0 = (defpackage.C1419) r0
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f6211 = r4
            r2 = -630857965936174(0xfffdc23cef0961d2, double:NaN)
            java.lang.String r0 = "保存中"
            ᛳᛸᛳᛸ r7 = defpackage.C0525.m1315(r0)
            ᛶᛸᛱᲀ r0 = defpackage.C1121.f5003
            java.lang.Object r0 = r1.f3839
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r0 = r0.getContext()
            r2 = -630875145805358(0xfffdc238ef0961d2, double:NaN)
            java.lang.Object r2 = r1.f3841
            java.lang.String r2 = (java.lang.String) r2
            r1.f3840 = r7
            r1.f3837 = r13
            r1 = r2
            r2 = 0
            r3 = 0
            r5 = 28
            r4 = r28
            java.lang.Object r0 = defpackage.C1121.m2138(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L5cd
            r14 = r6
            goto L5d3
        L5cd:
            r0 = r7
        L5ce:
            r0.m1322()
            ᲁᲀᛱᲁ r14 = defpackage.C1907.f8270
        L5d3:
            return r14
        L5d4:
            java.lang.Object r0 = r1.f3838
            android.content.Context r0 = (android.content.Context) r0
            ᲁᲀᛱᲁ r8 = defpackage.C1907.f8270
            java.lang.Object r2 = r1.f3841
            com.ss.android.ugc.aweme.comment.model.Comment r2 = (com.ss.android.ugc.aweme.comment.model.Comment) r2
            java.lang.Object r3 = r1.f3839
            r9 = r3
            android.app.Dialog r9 = (android.app.Dialog) r9
            ᛴᛵ r10 = defpackage.EnumC0670.f3246
            int r3 = r1.f3837
            switch(r3) {
                case 0: goto L61b;
                case 1: goto L617;
                case 2: goto L607;
                case 3: goto L5f8;
                case 4: goto L5f8;
                case 5: goto L5fe;
                case 6: goto L5f8;
                default: goto L5ea;
            }
        L5ea:
            r0 = -608339452403246(0xfffdd6b7ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L734
        L5f8:
            defpackage.AbstractC0762.m1680(r29)
        L5fb:
            r14 = r8
            goto L734
        L5fe:
            java.lang.Object r0 = r1.f3840
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.AbstractC0762.m1680(r29)
            goto L727
        L607:
            java.lang.Object r0 = r1.f3840
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            goto L66f
        L611:
            r0 = move-exception
            goto L712
        L614:
            r0 = move-exception
            goto L68a
        L617:
            defpackage.AbstractC0762.m1680(r29)
            goto L635
        L61b:
            defpackage.AbstractC0762.m1680(r29)
            com.ss.android.ugc.aweme.emoji.model.Emoji r3 = r2.emoji
            if (r3 == 0) goto L728
            ᛶᛸᛳ r3 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r3 = defpackage.AbstractC1497.f6594
            ᲁᛲᛶᛵ r4 = new ᲁᛲᛶᛵ
            r4.<init>(r9, r14, r12)
            r1.f3837 = r13
            java.lang.Object r3 = defpackage.AbstractC0397.m1144(r3, r4, r1)
            if (r3 != r10) goto L635
            goto L733
        L635:
            r3 = -608184833580590(0xfffdd6dbef0961d2, double:NaN)
            java.lang.String r3 = "开始下载"     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            defpackage.C0525.m1315(r3)     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            com.ss.android.ugc.aweme.emoji.model.Emoji r2 = r2.emoji     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.animateUrl     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            java.util.List r2 = r2.urlList     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            r3 = -608206308417070(0xfffdd6d6ef0961d2, double:NaN)
            java.lang.Object r2 = defpackage.AbstractC1107.m2122(r2)     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            r1.f3840 = r14     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            r1.f3837 = r7     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            ᛶᛸᛱᲀ r3 = defpackage.C1121.f5003     // Catch: java.lang.Throwable -> L611 java.lang.Exception -> L614
            r3 = 0
            r5 = 28
            r1 = r2
            r2 = 0
            r4 = r28
            java.lang.Object r0 = defpackage.C1121.m2138(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L684 java.lang.Exception -> L688
            r1 = r4
            if (r0 != r10) goto L66a
            goto L66b
        L66a:
            r0 = r8
        L66b:
            if (r0 != r10) goto L66f
            goto L733
        L66f:
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᲁᛲᛶᛵ r2 = new ᲁᛲᛶᛵ
            r2.<init>(r9, r14, r13)
            r1.f3840 = r14
            r1.f3837 = r6
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r2, r1)
            if (r0 != r10) goto L5fb
            goto L733
        L684:
            r0 = move-exception
            r1 = r4
            goto L712
        L688:
            r0 = move-exception
            r1 = r4
        L68a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L611
            r2.<init>()     // Catch: java.lang.Throwable -> L611
            r3 = -608240668155438(0xfffdd6ceef0961d2, double:NaN)
            java.lang.String r3 = "decode error = "     // Catch: java.lang.Throwable -> L611
            r2.append(r3)     // Catch: java.lang.Throwable -> L611
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L611
            r2.append(r3)     // Catch: java.lang.Throwable -> L611
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L611
            r3 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r3 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L611
            if (r3 != 0) goto L6bd
            goto L6de
        L6bd:
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L611
        L6c1:
            if (r12 >= r3) goto L6de
            int r4 = r12 + 2000
            if (r4 <= r3) goto L6c8
            r4 = r3
        L6c8:
            java.lang.String r5 = r2.substring(r12, r4)     // Catch: java.lang.Throwable -> L611
            r6 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r6 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L611
            r6.getClass()     // Catch: java.lang.Throwable -> L611
            defpackage.C0346.m1040(r5)     // Catch: java.lang.Throwable -> L611
            r12 = r4
            goto L6c1
        L6de:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L611
            r2.<init>()     // Catch: java.lang.Throwable -> L611
            r3 = -608309387632174(0xfffdd6beef0961d2, double:NaN)
            java.lang.String r3 = "保存失败: "     // Catch: java.lang.Throwable -> L611
            r2.append(r3)     // Catch: java.lang.Throwable -> L611
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L611
            r2.append(r0)     // Catch: java.lang.Throwable -> L611
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L611
            defpackage.AbstractC0209.m764(r0)     // Catch: java.lang.Throwable -> L611
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᲁᛲᛶᛵ r2 = new ᲁᛲᛶᛵ
            r2.<init>(r9, r14, r13)
            r1.f3840 = r14
            r3 = 4
            r1.f3837 = r3
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r2, r1)
            if (r0 != r10) goto L5fb
            goto L733
        L712:
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r2 = defpackage.AbstractC1497.f6594
            ᲁᛲᛶᛵ r3 = new ᲁᛲᛶᛵ
            r3.<init>(r9, r14, r13)
            r1.f3840 = r0
            r4 = 5
            r1.f3837 = r4
            java.lang.Object r1 = defpackage.AbstractC0397.m1144(r2, r3, r1)
            if (r1 != r10) goto L727
            goto L733
        L727:
            throw r0
        L728:
            ᲀᛴᛱᛱ r3 = defpackage.C1654.f7363
            r4 = 6
            r1.f3837 = r4
            java.lang.Object r0 = r3.m3050(r0, r2, r9, r1)
            if (r0 != r10) goto L5fb
        L733:
            r14 = r10
        L734:
            return r14
        L735:
            java.lang.Object r0 = r1.f3839
            r17 = r0
            ᛶᛶᛶᛲ r17 = (defpackage.C1093) r17
            java.lang.Object r0 = r1.f3840
            r2 = r0
            ᲀᛲᛶᲈ r2 = (defpackage.C1630) r2
            android.widget.LinearLayout r0 = r2.f7244
            android.widget.LinearLayout r3 = r2.f7267
            android.widget.LinearLayout r4 = r2.f7246
            ᛴᛵ r5 = defpackage.EnumC0670.f3246
            int r6 = r1.f3837
            r8 = 8
            if (r6 == 0) goto L77b
            if (r6 == r13) goto L772
            if (r6 != r7) goto L764
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r6 = r29
            r9 = r2
            r2 = r17
            goto L7c7
        L75c:
            r0 = move-exception
            r9 = r2
            goto L859
        L760:
            r0 = move-exception
            r9 = r2
            goto L80f
        L764:
            r0 = -78512286768686(0xffffb897ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            goto L858
        L772:
            defpackage.AbstractC0762.m1680(r29)     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r6 = r29
            r9 = r2
            r2 = r17
            goto L7b1
        L77b:
            defpackage.AbstractC0762.m1680(r29)
            r2.f7259 = r13     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r3.setVisibility(r8)     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r4.setVisibility(r12)     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r0.setVisibility(r8)     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            ᛶᛸᛳ r6 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            ᛴᛵᲁᛳ r6 = defpackage.ExecutorC0679.f3269     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            ᲀᛳᛴ r15 = new ᲀᛳᛴ     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            java.lang.Object r9 = r1.f3841     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r18 = r9
            java.lang.String r18 = (java.lang.String) r18     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            java.lang.Object r9 = r1.f3838     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r19 = r9
            java.lang.String r19 = (java.lang.String) r19     // Catch: java.lang.Throwable -> L75c java.lang.Exception -> L760
            r20 = 0
            r21 = 0
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L808 java.lang.Exception -> L80c
            r9 = r16
            r2 = r17
            r1.f3837 = r13     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.Object r6 = defpackage.AbstractC0397.m1144(r6, r15, r1)     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            if (r6 != r5) goto L7b1
            goto L7c4
        L7b1:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            ᛶᛸᛳ r10 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            ᛴᛵᲁᛳ r10 = defpackage.ExecutorC0679.f3269     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            ᛴᲇᛶᛳ r11 = new ᛴᲇᛶᛳ     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r11.<init>(r9, r6, r14)     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r1.f3837 = r7     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.Object r6 = defpackage.AbstractC0397.m1144(r10, r11, r1)     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            if (r6 != r5) goto L7c7
        L7c4:
            r14 = r5
            goto L858
        L7c7:
            kotlin.Pair r6 = (kotlin.Pair) r6     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.Object r5 = r6.component1()     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.Object r6 = r6.component2()     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            long r17 = r6.longValue()     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r9.f7253 = r5     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            ᛵᛸᛵᛷ r6 = defpackage.C0945.f4234     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.Object r1 = r1.f3841     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r13 = r1
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.String r14 = r2.f4889     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.String r15 = r2.f4890     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            java.lang.String r16 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r1 = -78361962913326(0xffffb8baef0961d2, double:NaN)
            r6.getClass()     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            defpackage.C0945.m1898(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r4.setVisibility(r8)     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r0.setVisibility(r12)     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
            r9.m2985(r5)     // Catch: java.lang.Throwable -> L804 java.lang.Exception -> L806
        L801:
            r9.f7259 = r12
            goto L856
        L804:
            r0 = move-exception
            goto L859
        L806:
            r0 = move-exception
            goto L80f
        L808:
            r0 = move-exception
            r9 = r16
            goto L859
        L80c:
            r0 = move-exception
            r9 = r16
        L80f:
            r1 = -78452157226542(0xffffb8a5ef0961d2, double:NaN)
            java.lang.String r1 = "生成语音失败"     // Catch: java.lang.Throwable -> L804
            r5 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r5 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L804
            r2.getClass()     // Catch: java.lang.Throwable -> L804
            defpackage.C0346.m1038(r1, r0)     // Catch: java.lang.Throwable -> L804
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L804
            r1.<init>()     // Catch: java.lang.Throwable -> L804
            r5 = -78482221997614(0xffffb89eef0961d2, double:NaN)
            java.lang.String r2 = "生成失败: "     // Catch: java.lang.Throwable -> L804
            r1.append(r2)     // Catch: java.lang.Throwable -> L804
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L804
            r1.append(r0)     // Catch: java.lang.Throwable -> L804
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L804
            defpackage.AbstractC0209.m764(r0)     // Catch: java.lang.Throwable -> L804
            r4.setVisibility(r8)     // Catch: java.lang.Throwable -> L804
            r3.setVisibility(r12)     // Catch: java.lang.Throwable -> L804
            goto L801
        L856:
            ᲁᲀᛱᲁ r14 = defpackage.C1907.f8270
        L858:
            return r14
        L859:
            r9.f7259 = r12
            throw r0
    }
}
