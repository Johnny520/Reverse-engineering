package defpackage;

/* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2370 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f10251;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f10252;

    public /* synthetic */ C2370(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f10252 = r1
            r0.f10251 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C2370(defpackage.C0312 r1, java.util.ArrayList r2) {
            r0 = this;
            r1 = 9
            r0.f10252 = r1
            r0.<init>()
            r0.f10251 = r2
            return
    }

    public /* synthetic */ C2370(defpackage.C1225 r1, defpackage.C1535 r2) {
            r0 = this;
            r2 = 6
            r0.f10252 = r2
            r0.<init>()
            r0.f10251 = r1
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f10252
            r1 = 0
            ᲁᲀᛱᲁ r2 = defpackage.C1907.f8270
            java.lang.Object r5 = r5.f10251
            switch(r0) {
                case 0: goto L10c;
                case 1: goto La3;
                case 2: goto L97;
                case 3: goto L7a;
                case 4: goto L6d;
                case 5: goto L60;
                case 6: goto L58;
                case 7: goto L51;
                case 8: goto L49;
                default: goto La;
            }
        La:
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            ᲀᛴᛴᛶ r6 = (defpackage.InterfaceC1661) r6
            r3 = -914695174659630(0xfffcc016ef0961d2, double:NaN)
            r3 = -14452849548846(0xfffff2daef0961d2, double:NaN)
            java.lang.String r0 = "INSERT OR REPLACE INTO `ward_items` (`id`,`category`,`remark`,`awemeId`,`cid`,`text`,`createTime`,`saveTime`,`authorName`,`authorAvatar`,`authorUid`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"
            ᛲᛳᲇᛱ r6 = r6.mo892(r0)
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3d
        L27:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L27
            defpackage.C1487.m2693(r6, r0)     // Catch: java.lang.Throwable -> L3d
            r6.mo530()     // Catch: java.lang.Throwable -> L3d
            r6.reset()     // Catch: java.lang.Throwable -> L3d
            goto L27
        L3d:
            r5 = move-exception
            goto L43
        L3f:
            defpackage.AbstractC0209.m772(r6, r1)
            return r2
        L43:
            throw r5     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
            defpackage.AbstractC0209.m772(r6, r5)
            throw r0
        L49:
            ᛲᲀ r5 = (defpackage.C0345) r5
            ᲀᛴᛴᛶ r6 = (defpackage.InterfaceC1661) r6
            r5.mo1032()
            return r2
        L51:
            ᲁᛸᲀᛸ r5 = (defpackage.C1902) r5
            ᛴᛲᲈᲀ r6 = (defpackage.C0633) r6
            r5.f8257 = r6
            return r2
        L58:
            ᛷᛲᛳᲈ r5 = (defpackage.C1225) r5
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r5.mo1166(r1)
            return r2
        L60:
            ᲈᛶᛶᲇ r5 = (defpackage.C2265) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            ᛱᲈᛴᛳ r5 = r5.m3687(r6)
            return r5
        L6d:
            java.util.Map r5 = (java.util.Map) r5
            android.content.pm.ApplicationInfo r6 = (android.content.pm.ApplicationInfo) r6
            boolean r5 = com.ss.android.ugc.awemes.MainActivity.m288(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L7a:
            ᲇᛸᛶᛸ r5 = (defpackage.C2105) r5
            ᲇᛸᛶᛸ r6 = (defpackage.C2105) r6
            r0 = -461451570880046(0xfffe5c4fef0961d2, double:NaN)
            java.lang.String r6 = r6.m3534()
            java.lang.String r5 = r5.m3534()
            boolean r5 = defpackage.AbstractC0498.m1280(r6, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L97:
            ᛶᲈᛱᲈ r5 = (defpackage.C1180) r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            defpackage.AbstractC1754.m3153(r5, r6)
            return r2
        La3:
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L10b
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> Ldd
            r0.<init>()     // Catch: java.lang.Exception -> Ldd
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> Ldd
            r3 = 85
            r6.compress(r1, r3, r0)     // Catch: java.lang.Exception -> Ldd
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Exception -> Ldd
            r0 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r0)     // Catch: java.lang.Exception -> Ldd
            ᛶᲀᛵ r0 = defpackage.C1141.f5173     // Catch: java.lang.Exception -> Ldd
            r0.getClass()     // Catch: java.lang.Exception -> Ldd
            r0 = -18266780507694(0xffffef62ef0961d2, double:NaN)
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5141     // Catch: java.lang.Exception -> Ldd
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221     // Catch: java.lang.Exception -> Ldd
            r3 = 44
            r1 = r1[r3]     // Catch: java.lang.Exception -> Ldd
            r0.m3168(r1, r6)     // Catch: java.lang.Exception -> Ldd
            defpackage.C1326.m2453(r5)     // Catch: java.lang.Exception -> Ldd
            defpackage.C1500.m2706()     // Catch: java.lang.Exception -> Ldd
            goto L10b
        Ldd:
            r5 = move-exception
            r0 = -122153449463342(0xffff90e6ef0961d2, double:NaN)
            java.lang.String r6 = "保存背景图失败"
            r0 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r0 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r6, r5)
            r5 = -122187809201710(0xffff90deef0961d2, double:NaN)
            java.lang.String r5 = "保存图片失败"
            defpackage.AbstractC0209.m764(r5)
        L10b:
            return r2
        L10c:
            ᛱᛳᛲᛸ r5 = (defpackage.AbstractC0050) r5
            if (r6 != r5) goto L113
            java.lang.String r5 = "(this Collection)"
            goto L117
        L113:
            java.lang.String r5 = java.lang.String.valueOf(r6)
        L117:
            return r5
    }
}
