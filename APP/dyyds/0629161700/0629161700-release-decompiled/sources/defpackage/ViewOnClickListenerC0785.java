package defpackage;

/* JADX INFO: renamed from: 釠瘁矅岵€釠? reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0785 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: 釠丰浉釠滇矅, reason: contains not printable characters */
    public final /* synthetic */ int f3650;

    public /* synthetic */ ViewOnClickListenerC0785(int r1) {
            r0 = this;
            r0.f3650 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    private final void m1706(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r13) {
            r12 = this;
            int r12 = r12.f3650
            r0 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            r2 = 0
            r3 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            r5 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r7 = 1
            switch(r12) {
                case 0: goto L23c;
                case 1: goto L236;
                case 2: goto L162;
                case 3: goto Lf2;
                case 4: goto L61;
                case 5: goto L60;
                case 6: goto L59;
                default: goto L16;
            }
        L16:
            釠羔洷釠瘁瞾 r12 = new 釠羔洷釠瘁瞾
            r12.<init>()
            釠夺浀釠翅浉 r13 = new 釠夺浀釠翅浉
            r13.<init>()
            r0 = -94038593543726(0xffffaa78ef0961d2, double:NaN)
            java.lang.String r0 = "杩囨护閰嶇疆"
            r13.f4775 = r0
            r13.mo2037()
            釠羔矅釠羔浄 r0 = new 釠羔矅釠羔浄
            r0.<init>(r12, r7)
            r13.f4776 = r0
            r13.mo2037()
            r0 = -94060068380206(0xffffaa73ef0961d2, double:NaN)
            java.lang.String r0 = "淇濆瓨"
            釠丰浂岵€岵?r1 = new 釠丰浂岵€岵?
            r1.<init>(r7, r12)
            r13.mo2039(r0, r1)
            r0 = -94072953282094(0xffffaa70ef0961d2, double:NaN)
            java.lang.String r12 = "鍙栨秷"
            r13.mo2035(r12)
            r13.m2032()
            return
        L59:
            android.app.Dialog r12 = defpackage.C1478.f6558
            if (r12 == 0) goto L60
            r12.dismiss()
        L60:
            return
        L61:
            android.content.Context r12 = r13.getContext()     // Catch: java.lang.Exception -> L96
            java.lang.String r7 = android.os.Environment.DIRECTORY_MUSIC     // Catch: java.lang.Exception -> L96
            java.io.File r12 = r12.getExternalFilesDir(r7)     // Catch: java.lang.Exception -> L96
            android.content.Context r13 = r13.getContext()     // Catch: java.lang.Exception -> L96
            r7 = -554416138001966(0xfffe07c2ef0961d2, double:NaN)
            java.lang.String r12 = r12.getAbsolutePath()     // Catch: java.lang.Exception -> L96
            r7 = -554484857478702(0xfffe07b2ef0961d2, double:NaN)
            r7 = -554575051791918(0xfffe079def0961d2, double:NaN)
            java.lang.String r7 = "閫夋嫨闊抽"     // Catch: java.lang.Exception -> L96
            岵囜矆釠贬浉 r8 = new 岵囜矆釠贬浉     // Catch: java.lang.Exception -> L96
            r9 = 3
            r8.<init>(r9)     // Catch: java.lang.Exception -> L96
            defpackage.C1403.m2567(r13, r12, r7, r8)     // Catch: java.lang.Exception -> L96
            goto Lf1
        L96:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r7 = -554596526628398(0xfffe0798ef0961d2, double:NaN)
            java.lang.String r7 = "CommentAudioView "
            r13.<init>(r7)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            int r3 = r13.length()
            if (r3 != 0) goto Lb9
            goto Ld5
        Lb9:
            int r3 = r13.length()
        Lbd:
            if (r2 >= r3) goto Ld5
            int r4 = r2 + 2000
            if (r4 <= r3) goto Lc4
            r4 = r3
        Lc4:
            java.lang.String r2 = r13.substring(r2, r4)
            釠册瞼釠贬瞾 r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1040(r2)
            r2 = r4
            goto Lbd
        Ld5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = -554673836039726(0xfffe0786ef0961d2, double:NaN)
            java.lang.String r0 = "鎵撳紑澶辫触 "
            r13.<init>(r0)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            defpackage.AbstractC0209.m767(r12)
        Lf1:
            return
        Lf2:
            android.app.Activity r12 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            if (r12 != 0) goto Lf9
            goto L161
        Lf9:
            android.content.Intent r13 = new android.content.Intent
            r0 = -122484161945134(0xffff9099ef0961d2, double:NaN)
            java.lang.String r0 = "android.intent.action.GET_CONTENT"
            r13.<init>(r0)
            r0 = -122630190833198(0xffff9077ef0961d2, double:NaN)
            java.lang.String r0 = "image/*"
            r13.setType(r0)
            r0 = -122664550571566(0xffff906fef0961d2, double:NaN)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r13.addCategory(r0)
            r0 = -122806284492334(0xffff904eef0961d2, double:NaN)
            java.lang.String r0 = "閫夋嫨鑳屾櫙鍥剧墖"     // Catch: java.lang.Exception -> L133
            android.content.Intent r13 = android.content.Intent.createChooser(r13, r0)     // Catch: java.lang.Exception -> L133
            r0 = 14285800(0xd9fbe8, float:2.001867E-38)
            r12.startActivityForResult(r13, r0)     // Catch: java.lang.Exception -> L133
            goto L161
        L133:
            r12 = move-exception
            r0 = -122836349263406(0xffff9047ef0961d2, double:NaN)
            java.lang.String r13 = "鏃犳硶鎵撳紑鍥剧墖閫夋嫨鍣?
            defpackage.AbstractC0209.m764(r13)
            r0 = -122879298936366(0xffff903def0961d2, double:NaN)
            java.lang.String r13 = "鎵撳紑鍥剧墖閫夋嫨鍣ㄥけ璐?
            r0 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r0 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r13, r12)
        L161:
            return
        L162:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1da
            r12.<init>()     // Catch: java.lang.Exception -> L1da
            r8 = -605311500459566(0xfffdd978ef0961d2, double:NaN)
            java.lang.String r8 = "audio file = "     // Catch: java.lang.Exception -> L1da
            r12.append(r8)     // Catch: java.lang.Exception -> L1da
            java.lang.String r8 = defpackage.AbstractC0472.f2366     // Catch: java.lang.Exception -> L1da
            r12.append(r8)     // Catch: java.lang.Exception -> L1da
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> L1da
            int r8 = r12.length()     // Catch: java.lang.Exception -> L1da
            if (r8 != 0) goto L189
            goto L1a6
        L189:
            int r8 = r12.length()     // Catch: java.lang.Exception -> L1da
            r9 = r2
        L18e:
            if (r9 >= r8) goto L1a6
            int r10 = r9 + 2000
            if (r10 <= r8) goto L195
            r10 = r8
        L195:
            java.lang.String r9 = r12.substring(r9, r10)     // Catch: java.lang.Exception -> L1da
            釠册瞼釠贬瞾 r11 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L1da
            r11.getClass()     // Catch: java.lang.Exception -> L1da
            defpackage.C0346.m1040(r9)     // Catch: java.lang.Exception -> L1da
            r9 = r10
            goto L18e
        L1a6:
            android.content.Context r12 = r13.getContext()     // Catch: java.lang.Exception -> L1da
            java.lang.String r8 = android.os.Environment.DIRECTORY_MUSIC     // Catch: java.lang.Exception -> L1da
            java.io.File r12 = r12.getExternalFilesDir(r8)     // Catch: java.lang.Exception -> L1da
            android.content.Context r13 = r13.getContext()     // Catch: java.lang.Exception -> L1da
            r8 = -605371630001710(0xfffdd96aef0961d2, double:NaN)
            java.lang.String r12 = r12.getAbsolutePath()     // Catch: java.lang.Exception -> L1da
            r8 = -605440349478446(0xfffdd95aef0961d2, double:NaN)
            r8 = -605530543791662(0xfffdd945ef0961d2, double:NaN)
            java.lang.String r8 = "閫夋嫨闊抽"     // Catch: java.lang.Exception -> L1da
            岵囜矆釠贬浉 r9 = new 岵囜矆釠贬浉     // Catch: java.lang.Exception -> L1da
            r9.<init>(r7)     // Catch: java.lang.Exception -> L1da
            defpackage.C1403.m2567(r13, r12, r8, r9)     // Catch: java.lang.Exception -> L1da
            goto L235
        L1da:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r7 = -605552018628142(0xfffdd940ef0961d2, double:NaN)
            java.lang.String r7 = "CommentAudioView "
            r13.<init>(r7)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            int r3 = r13.length()
            if (r3 != 0) goto L1fd
            goto L219
        L1fd:
            int r3 = r13.length()
        L201:
            if (r2 >= r3) goto L219
            int r4 = r2 + 2000
            if (r4 <= r3) goto L208
            r4 = r3
        L208:
            java.lang.String r2 = r13.substring(r2, r4)
            釠册瞼釠贬瞾 r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1040(r2)
            r2 = r4
            goto L201
        L219:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = -605629328039470(0xfffdd92eef0961d2, double:NaN)
            java.lang.String r0 = "鎵撳紑澶辫触 "
            r13.<init>(r0)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            defpackage.AbstractC0209.m767(r12)
        L235:
            return
        L236:
            釠瘁矅釠册矅 r12 = defpackage.EnumC0777.f3630
            defpackage.C1654.m3042(r12)
            return
        L23c:
            釠瘁矅釠册矅 r12 = defpackage.EnumC0777.f3629
            defpackage.C1654.m3042(r12)
            return
    }
}
