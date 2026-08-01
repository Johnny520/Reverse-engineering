package defpackage;

/* JADX INFO: renamed from: ᲇᛴᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2044 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1630 f8813;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8814;

    public /* synthetic */ C2044(defpackage.C1630 r1, int r2) {
            r0 = this;
            r0.f8814 = r2
            r0.f8813 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f8814
            r1 = 0
            ᲁᲀᛱᲁ r2 = defpackage.C1907.f8270
            r3 = -1
            ᲀᛲᛶᲈ r10 = r10.f8813
            switch(r0) {
                case 0: goto L16e;
                case 1: goto L93;
                default: goto Lb;
            }
        Lb:
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            ᛵᛳᲈᲁ r12 = (defpackage.C0860) r12
            boolean r11 = r12.f3916
            if (r11 == 0) goto L48
            java.io.File r11 = r12.f3915
            java.lang.String r11 = r11.getAbsolutePath()
            r10.m2990(r11)
            ᛶᲀᛵ r12 = defpackage.C1141.f5173
            r12.getClass()
            r0 = -19435011612206(0xffffee52ef0961d2, double:NaN)
            ᲀᲇᛸᛶ r12 = defpackage.C1141.f5099
            ᲁᛷᛶᛶ[] r0 = defpackage.C1141.f5221
            r1 = 145(0x91, float:2.03E-43)
            r0 = r0[r1]
            r12.m3168(r0, r11)
            android.widget.EditText r10 = r10.f7236
            if (r10 == 0) goto L92
            r11 = -85092176666158(0xffffb29bef0961d2, double:NaN)
            java.lang.String r11 = ""
            r10.setText(r11)
            goto L92
        L48:
            ᛷᛷᲈᲇ r11 = r10.f7249
            if (r11 == 0) goto L52
            java.util.ArrayList r11 = r11.f5847
            int r3 = r11.indexOf(r12)
        L52:
            if (r3 < 0) goto L92
            ᛷᛷᲈᲇ r10 = r10.f7249
            if (r10 == 0) goto L92
            java.util.ArrayList r11 = r10.f5847
            int r12 = r10.f5849
            r10.f5849 = r3
            if (r3 < 0) goto L79
            int r0 = r11.size()
            if (r3 >= r0) goto L79
            java.lang.Object r0 = r11.get(r3)
            ᛵᛳᲈᲁ r0 = (defpackage.C0860) r0
            boolean r0 = r0.f3916
            if (r0 != 0) goto L79
            java.lang.Object r0 = r11.get(r3)
            ᛵᛳᲈᲁ r0 = (defpackage.C0860) r0
            java.io.File r0 = r0.f3915
            goto L7a
        L79:
            r0 = 0
        L7a:
            r10.f5850 = r0
            if (r12 < 0) goto L87
            int r0 = r11.size()
            if (r12 >= r0) goto L87
            r10.notifyItemChanged(r12)
        L87:
            if (r3 < 0) goto L92
            int r11 = r11.size()
            if (r3 >= r11) goto L92
            r10.notifyItemChanged(r3)
        L92:
            return r2
        L93:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.io.File r12 = (java.io.File) r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r4 = -85384234442286(0xffffb257ef0961d2, double:NaN)
            java.lang.String r4 = "togglePlay position="
            r0.<init>(r4)
            r0.append(r11)
            r4 = -85474428755502(0xffffb242ef0961d2, double:NaN)
            java.lang.String r4 = " file="
            r0.append(r4)
            java.lang.String r4 = r12.getAbsolutePath()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            defpackage.AbstractC1592.m2872(r0)
            int r0 = r10.f7265
            if (r0 != r11) goto Led
            android.media.MediaPlayer r0 = r10.f7268
            if (r0 == 0) goto Led
            boolean r0 = r0.isPlaying()
            r4 = 1
            if (r0 != r4) goto Led
            r11 = -85504493526574(0xffffb23bef0961d2, double:NaN)
            java.lang.String r11 = "停止播放"
            defpackage.AbstractC1592.m2872(r11)
            r10.m2983()
            ᛷᛷᲈᲇ r10 = r10.f7249
            if (r10 == 0) goto L16d
            r10.m2450(r3)
            goto L16d
        Led:
            r10.m2983()
            defpackage.AbstractC1171.m2257()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L138
            r0.<init>()     // Catch: java.lang.Exception -> L138
            r3 = -85525968363054(0xffffb236ef0961d2, double:NaN)
            java.lang.String r3 = "开始播放: "     // Catch: java.lang.Exception -> L138
            r0.append(r3)     // Catch: java.lang.Exception -> L138
            java.lang.String r3 = r12.getAbsolutePath()     // Catch: java.lang.Exception -> L138
            r0.append(r3)     // Catch: java.lang.Exception -> L138
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L138
            defpackage.AbstractC1592.m2872(r0)     // Catch: java.lang.Exception -> L138
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch: java.lang.Exception -> L138
            r0.<init>()     // Catch: java.lang.Exception -> L138
            java.lang.String r12 = r12.getAbsolutePath()     // Catch: java.lang.Exception -> L138
            r0.setDataSource(r12)     // Catch: java.lang.Exception -> L138
            r0.prepare()     // Catch: java.lang.Exception -> L138
            r0.start()     // Catch: java.lang.Exception -> L138
            ᲈᲁᛲᛱ r12 = new ᲈᲁᛲᛱ     // Catch: java.lang.Exception -> L138
            r12.<init>(r1, r10)     // Catch: java.lang.Exception -> L138
            r0.setOnCompletionListener(r12)     // Catch: java.lang.Exception -> L138
            r10.f7268 = r0     // Catch: java.lang.Exception -> L138
            r10.f7265 = r11     // Catch: java.lang.Exception -> L138
            ᛷᛷᲈᲇ r10 = r10.f7249     // Catch: java.lang.Exception -> L138
            if (r10 == 0) goto L16d
            r10.m2450(r11)     // Catch: java.lang.Exception -> L138
            goto L16d
        L138:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r0 = -85556033134126(0xffffb22fef0961d2, double:NaN)
            java.lang.String r12 = "播放失败: "
            r11.<init>(r12)
            java.lang.String r12 = r10.getMessage()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r0 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r0 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r12 = defpackage.C0346.f1773
            r12.getClass()
            defpackage.C0346.m1038(r11, r10)
            r10.printStackTrace()
        L16d:
            return r2
        L16e:
            ᛱᲁᛳᲀ r11 = (defpackage.C0179) r11
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            r4 = -85981234896430(0xffffb1ccef0961d2, double:NaN)
            r4 = -86032774503982(0xffffb1c0ef0961d2, double:NaN)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r4 = -86088609078830(0xffffb1b3ef0961d2, double:NaN)
            java.lang.String r0 = "选择历史记录: "
            r12.<init>(r0)
            java.lang.String r0 = r11.f1219
            r4 = -86127263784494(0xffffb1aaef0961d2, double:NaN)
            r12.append(r0); r12.append(", 路径: ")
            java.lang.String r4 = r11.f1215
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            r5 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r5 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r5 = r12.length()
            if (r5 != 0) goto L1ba
            goto L1dc
        L1ba:
            int r5 = r12.length()
            r6 = r1
        L1bf:
            if (r6 >= r5) goto L1dc
            int r7 = r6 + 2000
            if (r7 <= r5) goto L1c6
            r7 = r5
        L1c6:
            java.lang.String r6 = r12.substring(r6, r7)
            r8 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r8 = defpackage.C0346.f1773
            r8.getClass()
            defpackage.C0346.m1040(r6)
            r6 = r7
            goto L1bf
        L1dc:
            java.util.List r12 = r10.f7254
            java.util.Iterator r12 = r12.iterator()
            r5 = r1
        L1e3:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L1fe
            java.lang.Object r6 = r12.next()
            ᛶᛶᛶᛲ r6 = (defpackage.C1093) r6
            java.lang.String r6 = r6.f4889
            java.lang.String r7 = r11.f1217
            boolean r6 = defpackage.AbstractC0498.m1280(r6, r7)
            if (r6 == 0) goto L1fb
            r3 = r5
            goto L1fe
        L1fb:
            int r5 = r5 + 1
            goto L1e3
        L1fe:
            if (r3 < 0) goto L205
            android.widget.Spinner r11 = r10.f7245
            r11.setSelection(r3)
        L205:
            android.widget.EditText r11 = r10.f7272
            r11.setText(r0)
            java.io.File r11 = new java.io.File
            r11.<init>(r4)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r3 = -86157328555566(0xffffb1a3ef0961d2, double:NaN)
            java.lang.String r0 = "历史文件是否存在: "
            r12.<init>(r0)
            boolean r0 = r11.exists()
            r12.append(r0)
            r3 = -86204573195822(0xffffb198ef0961d2, double:NaN)
            java.lang.String r0 = ", 大小: "
            r12.append(r0)
            boolean r0 = r11.exists()
            if (r0 == 0) goto L23b
            long r3 = r11.length()
            goto L23d
        L23b:
            r3 = 0
        L23d:
            r12.append(r3)
            r3 = -86234637966894(0xffffb191ef0961d2, double:NaN)
            java.lang.String r0 = " bytes"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            defpackage.AbstractC1592.m2872(r12)
            boolean r12 = r11.exists()
            if (r12 == 0) goto L270
            r10.f7253 = r11
            android.widget.LinearLayout r12 = r10.f7267
            r0 = 8
            r12.setVisibility(r0)
            android.widget.LinearLayout r12 = r10.f7246
            r12.setVisibility(r0)
            android.widget.LinearLayout r12 = r10.f7244
            r12.setVisibility(r1)
            r10.m2985(r11)
            goto L2a8
        L270:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r0 = -86264702737966(0xffffb18aef0961d2, double:NaN)
            java.lang.String r12 = "历史音频文件不存在: "
            r10.<init>(r12)
            java.lang.String r12 = r11.getName()
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            defpackage.AbstractC0209.m764(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r0 = -86316242345518(0xffffb17eef0961d2, double:NaN)
            java.lang.String r12 = "历史音频文件不存在: "
            r10.<init>(r12)
            java.lang.String r11 = r11.getAbsolutePath()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.AbstractC1592.m2872(r10)
        L2a8:
            return r2
    }
}
