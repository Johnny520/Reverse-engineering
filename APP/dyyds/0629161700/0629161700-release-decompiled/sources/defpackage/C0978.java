package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0978 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.io.File f4379;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f4380;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f4381;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f4382;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f4383;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f4384;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f4385;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f4386;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f4387;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.io.File f4388;

    public C0978(java.lang.String r1, java.lang.String r2, android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, defpackage.InterfaceC0140 r7) {
            r0 = this;
            r0.f4380 = r1
            r0.f4381 = r2
            r0.f4384 = r3
            r0.f4386 = r4
            r0.f4383 = r5
            r0.f4387 = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ᛷᲈᛳᛳ r1 = (defpackage.InterfaceC1399) r1
            ᛱᛸᛲᲀ r2 = (defpackage.InterfaceC0140) r2
            ᛱᛸᛲᲀ r0 = r0.mo389(r2, r1)
            ᛵᲇᛳᛵ r0 = (defpackage.C0978) r0
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            java.lang.Object r0 = r0.mo390(r1)
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r9, java.lang.Object r10) {
            r8 = this;
            ᛵᲇᛳᛵ r0 = new ᛵᲇᛳᛵ
            java.lang.String r5 = r8.f4383
            java.lang.String r6 = r8.f4387
            java.lang.String r1 = r8.f4380
            java.lang.String r2 = r8.f4381
            android.content.Context r3 = r8.f4384
            java.lang.String r4 = r8.f4386
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.f4385 = r10
            return r0
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r12) {
            r11 = this;
            java.lang.String r0 = r11.f4387
            java.lang.Object r1 = r11.f4385
            ᛷᲈᛳᛳ r1 = (defpackage.InterfaceC1399) r1
            int r2 = r11.f4382
            r3 = 0
            android.content.Context r4 = r11.f4384
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L2d
            if (r2 != r6) goto L20
            java.io.File r1 = r11.f4379
            java.io.File r11 = r11.f4388
            defpackage.AbstractC0762.m1680(r12)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            goto L8a
        L1a:
            r12 = move-exception
            goto L1cc
        L1d:
            r12 = move-exception
            goto L182
        L20:
            r11 = -375874347507246(0xfffeaa24ef0961d2, double:NaN)
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r11)
            return r5
        L2d:
            defpackage.AbstractC0762.m1680(r12)
            java.lang.String r12 = r11.f4380
            if (r12 == 0) goto L1d3
            boolean r2 = defpackage.AbstractC1347.m2524(r12)
            if (r2 == 0) goto L3c
            goto L1d3
        L3c:
            java.lang.String r2 = r11.f4381
            if (r2 == 0) goto L1d3
            boolean r7 = defpackage.AbstractC1347.m2524(r2)
            if (r7 == 0) goto L48
            goto L1d3
        L48:
            java.io.File r7 = new java.io.File
            java.io.File r8 = r4.getCacheDir()
            java.lang.String r9 = r11.f4386
            r7.<init>(r8, r9)
            java.io.File r8 = new java.io.File
            java.io.File r9 = r4.getCacheDir()
            java.lang.String r10 = r11.f4383
            r8.<init>(r9, r10)
            ᛷᲁᛸᛷ r9 = new ᛷᲁᛸᛷ     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            r9.<init>(r7, r12, r5, r3)     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            ᛵᛶᛲᛳ r12 = defpackage.AbstractC0397.m1151(r1, r9)     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            ᛷᲁᛸᛷ r9 = new ᛷᲁᛸᛷ     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            r9.<init>(r8, r2, r5, r6)     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            ᛵᛶᛲᛳ r2 = defpackage.AbstractC0397.m1151(r1, r9)     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            r5 = 2
            ᲇᲇᛵᛲ[] r5 = new defpackage.InterfaceC2145[r5]     // Catch: java.lang.Throwable -> L17e java.lang.Exception -> L180
            r5[r3] = r12     // Catch: java.lang.Throwable -> L17e java.lang.Exception -> L180
            r5[r6] = r2     // Catch: java.lang.Throwable -> L17e java.lang.Exception -> L180
            r11.f4385 = r1     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            r11.f4388 = r7     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            r11.f4379 = r8     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            r11.f4382 = r6     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            java.lang.Object r12 = defpackage.AbstractC1171.m2263(r5, r11)     // Catch: java.lang.Throwable -> L172 java.lang.Exception -> L176
            ᛴᛵ r11 = defpackage.EnumC0670.f3246
            if (r12 != r11) goto L88
            return r11
        L88:
            r11 = r7
            r1 = r8
        L8a:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.lang.Object r2 = r12.get(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.lang.Object r12 = r12.get(r6)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r5.<init>()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r7 = -375273052085806(0xfffeaab0ef0961d2, double:NaN)
            java.lang.String r7 = "Image download success: "     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r5.append(r7)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r5.append(r2)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r7 = -375380426268206(0xfffeaa97ef0961d2, double:NaN)
            java.lang.String r7 = ", Video download success: "     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r5.append(r7)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r5.append(r12)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r7 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r7 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            if (r7 != 0) goto Lde
            goto Lff
        Lde:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
        Le2:
            if (r3 >= r7) goto Lff
            int r8 = r3 + 2000
            if (r8 <= r7) goto Le9
            r8 = r7
        Le9:
            java.lang.String r3 = r5.substring(r3, r8)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r9 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r9 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r9.getClass()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            defpackage.C0346.m1040(r3)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r3 = r8
            goto Le2
        Lff:
            if (r2 == 0) goto L15d
            if (r12 != 0) goto L104
            goto L15d
        L104:
            java.lang.String r12 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r2 = -375526455156270(0xfffeaa75ef0961d2, double:NaN)
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r7 = -375616649469486(0xfffeaa60ef0961d2, double:NaN)
            java.lang.String r12 = defpackage.AbstractC1849.m3247(r12, r2, r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            if (r12 == 0) goto L148
            ᲈᲈᲁᛶ r2 = defpackage.C2374.f10260     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r2.getClass()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            boolean r12 = defpackage.C2374.m3888(r12, r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            if (r12 == 0) goto L148
            ᛶᛸᛱᲀ r12 = defpackage.C1121.f5003     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            defpackage.C1121.m2133(r4, r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            ᛷᛳᲈᲈ r12 = new ᛷᛳᲈᲈ     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r2 = -375728318619182(0xfffeaa46ef0961d2, double:NaN)
            java.lang.String r2 = "保存完成"     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r12.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r11.delete()     // Catch: java.lang.Throwable -> L1cb
            r1.delete()     // Catch: java.lang.Throwable -> L1cb
            goto L1cb
        L148:
            ᛷᛳᲈᲈ r12 = new ᛷᛳᲈᲈ     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r2 = -375706843782702(0xfffeaa4bef0961d2, double:NaN)
            java.lang.String r0 = "保存失败"     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r11.delete()     // Catch: java.lang.Throwable -> L15c
            r1.delete()     // Catch: java.lang.Throwable -> L15c
        L15c:
            return r12
        L15d:
            ᛷᛳᲈᲈ r12 = new ᛷᛳᲈᲈ     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r2 = -375496390385198(0xfffeaa7cef0961d2, double:NaN)
            java.lang.String r0 = "保存文件失败"     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            r11.delete()     // Catch: java.lang.Throwable -> L171
            r1.delete()     // Catch: java.lang.Throwable -> L171
        L171:
            return r12
        L172:
            r12 = move-exception
        L173:
            r11 = r7
            r1 = r8
            goto L1cc
        L176:
            r12 = move-exception
        L177:
            r11 = r7
            r1 = r8
            goto L182
        L17a:
            r12 = r11
            goto L173
        L17c:
            r12 = r11
            goto L177
        L17e:
            r11 = move-exception
            goto L17a
        L180:
            r11 = move-exception
            goto L17c
        L182:
            r2 = -375749793455662(0xfffeaa41ef0961d2, double:NaN)
            java.lang.String r0 = "saveMotionPhoto error"     // Catch: java.lang.Throwable -> L1a
            r2 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r2 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L1a
            r2.getClass()     // Catch: java.lang.Throwable -> L1a
            defpackage.C0346.m1038(r0, r12)     // Catch: java.lang.Throwable -> L1a
            ᛷᛳᲈᲈ r0 = new ᛷᛳᲈᲈ     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L1a
            r3 = -375844282736174(0xfffeaa2bef0961d2, double:NaN)
            java.lang.String r3 = "保存失败: "     // Catch: java.lang.Throwable -> L1a
            r2.append(r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L1a
            r2.append(r12)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L1a
            r11.delete()     // Catch: java.lang.Throwable -> L1ca
            r1.delete()     // Catch: java.lang.Throwable -> L1ca
        L1ca:
            r12 = r0
        L1cb:
            return r12
        L1cc:
            r11.delete()     // Catch: java.lang.Throwable -> L1d2
            r1.delete()     // Catch: java.lang.Throwable -> L1d2
        L1d2:
            throw r12
        L1d3:
            ᛷᛳᲈᲈ r11 = new ᛷᛳᲈᲈ
            r0 = -375242987314734(0xfffeaab7ef0961d2, double:NaN)
            java.lang.String r12 = "获取链接失败"
            r11.<init>(r12)
            return r11
    }
}
