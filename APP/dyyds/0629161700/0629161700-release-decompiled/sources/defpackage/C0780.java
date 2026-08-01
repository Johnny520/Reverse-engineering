package defpackage;

/* JADX INFO: renamed from: ᛴᲇᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0780 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f3642;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1630 f3643;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3644;

    public C0780(java.lang.String r2, defpackage.C1630 r3, defpackage.InterfaceC0140 r4) {
            r1 = this;
            r0 = 1
            r1.f3644 = r0
            r1.f3642 = r2
            r1.f3643 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public C0780(defpackage.C1630 r2, java.lang.String r3, defpackage.InterfaceC0140 r4) {
            r1 = this;
            r0 = 0
            r1.f3644 = r0
            r1.f3643 = r2
            r1.f3642 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f3644
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛴᲇᛶᛳ r2 = (defpackage.C0780) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛴᲇᛶᛳ r2 = (defpackage.C0780) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.f3644
            ᲀᛲᛶᲈ r0 = r1.f3643
            java.lang.String r1 = r1.f3642
            switch(r3) {
                case 0: goto Lf;
                default: goto L9;
            }
        L9:
            ᛴᲇᛶᛳ r3 = new ᛴᲇᛶᛳ
            r3.<init>(r1, r0, r2)
            return r3
        Lf:
            ᛴᲇᛶᛳ r3 = new ᛴᲇᛶᛳ
            r3.<init>(r0, r1, r2)
            return r3
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f3644
            java.lang.String r1 = r14.f3642
            ᲀᛲᛶᲈ r14 = r14.f3643
            r2 = 0
            switch(r0) {
                case 0: goto L166;
                default: goto La;
            }
        La:
            defpackage.AbstractC0762.m1680(r15)
            java.io.File r15 = new java.io.File
            r15.<init>(r1)
            boolean r0 = r15.exists()
            if (r0 == 0) goto L163
            boolean r0 = r15.isDirectory()
            if (r0 != 0) goto L20
            goto L163
        L20:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = r15.getParentFile()
            r3 = 1
            if (r1 == 0) goto L3a
            boolean r4 = r1.canRead()
            if (r4 == 0) goto L3a
            ᛵᛳᲈᲁ r4 = new ᛵᛳᲈᲁ
            r4.<init>(r1, r3)
            r0.add(r4)
        L3a:
            java.io.File[] r15 = r15.listFiles()
            if (r15 != 0) goto L42
            java.io.File[] r15 = new java.io.File[r2]
        L42:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r15.length
            r5 = r2
        L49:
            if (r5 >= r4) goto L5f
            r6 = r15[r5]
            boolean r7 = r6.isDirectory()
            if (r7 == 0) goto L5c
            boolean r7 = r6.canRead()
            if (r7 == 0) goto L5c
            r1.add(r6)
        L5c:
            int r5 = r5 + 1
            goto L49
        L5f:
            boolean r4 = r14.f7255
            if (r4 == 0) goto L6a
            ᲇᛵᲀᲇ r4 = new ᲇᛵᲀᲇ
            r5 = 2
            r4.<init>(r5)
            goto L6f
        L6a:
            ᲇᛵᲀᲇ r4 = new ᲇᛵᲀᲇ
            r4.<init>(r2)
        L6f:
            java.util.List r1 = defpackage.AbstractC1107.m2116(r1, r4)
            java.util.Iterator r1 = r1.iterator()
        L77:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r1.next()
            java.io.File r4 = (java.io.File) r4
            ᛵᛳᲈᲁ r5 = new ᛵᛳᲈᲁ
            r5.<init>(r4, r3)
            r0.add(r5)
            goto L77
        L8c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r15.length
            r5 = r2
        L93:
            if (r5 >= r4) goto L136
            r6 = r15[r5]
            boolean r7 = r6.isFile()
            if (r7 == 0) goto L132
            java.lang.String r7 = r6.getName()
            r8 = -156891144953390(0xffff714eef0961d2, double:NaN)
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            r8 = -85135126339118(0xffffb291ef0961d2, double:NaN)
            r8 = -85208140783150(0xffffb280ef0961d2, double:NaN)
            java.lang.String r8 = ".mp3"
            boolean r8 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r8 != 0) goto L12f
            r8 = -85229615619630(0xffffb27bef0961d2, double:NaN)
            java.lang.String r8 = ".wav"
            boolean r8 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r8 != 0) goto L12f
            r8 = -85251090456110(0xffffb276ef0961d2, double:NaN)
            java.lang.String r8 = ".m4a"
            boolean r8 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r8 != 0) goto L12f
            r8 = -85272565292590(0xffffb271ef0961d2, double:NaN)
            java.lang.String r8 = ".aac"
            boolean r8 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r8 != 0) goto L12f
            r8 = -85294040129070(0xffffb26cef0961d2, double:NaN)
            java.lang.String r8 = ".ogg"
            boolean r8 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r8 != 0) goto L12f
            r8 = -85315514965550(0xffffb267ef0961d2, double:NaN)
            java.lang.String r8 = ".flac"
            boolean r8 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r8 != 0) goto L12f
            r8 = -85341284769326(0xffffb261ef0961d2, double:NaN)
            java.lang.String r8 = ".wma"
            boolean r8 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r8 != 0) goto L12f
            r8 = -85362759605806(0xffffb25cef0961d2, double:NaN)
            java.lang.String r8 = ".amr"
            boolean r7 = defpackage.AbstractC0651.m1483(r7, r8, r2)
            if (r7 == 0) goto L132
        L12f:
            r1.add(r6)
        L132:
            int r5 = r5 + 1
            goto L93
        L136:
            boolean r14 = r14.f7255
            if (r14 == 0) goto L141
            ᲇᛵᲀᲇ r14 = new ᲇᛵᲀᲇ
            r15 = 3
            r14.<init>(r15)
            goto L146
        L141:
            ᲇᛵᲀᲇ r14 = new ᲇᛵᲀᲇ
            r14.<init>(r3)
        L146:
            java.util.List r14 = defpackage.AbstractC1107.m2116(r1, r14)
            java.util.Iterator r14 = r14.iterator()
        L14e:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L165
            java.lang.Object r15 = r14.next()
            java.io.File r15 = (java.io.File) r15
            ᛵᛳᲈᲁ r1 = new ᛵᛳᲈᲁ
            r1.<init>(r15, r2)
            r0.add(r1)
            goto L14e
        L163:
            ᲀᛶᲇ r0 = defpackage.C1698.f7558
        L165:
            return r0
        L166:
            defpackage.AbstractC0762.m1680(r15)
            ᛳᲀᲁᲈ r15 = new ᛳᲀᲁᲈ
            r15.<init>()
            r15.m1336(r1)
            ᛳᛵᛴᛴ r0 = new ᛳᛵᛴᛴ
            r0.<init>(r15)
            ᛶᛸᛱᲀ r15 = defpackage.C1121.f5003
            ᲈᛴᛶᲁ r15 = defpackage.C1121.m2135()
            r15.getClass()
            ᛶᛴᲈ r1 = new ᛶᛴᲈ
            r1.<init>(r15, r0)
            ᛳᲇᛲᲁ r15 = r1.m2021()
            boolean r0 = r15.f2832
            if (r0 == 0) goto L345
            ᛵᛸᛵᛷ r0 = defpackage.C0945.f4234
            android.content.Context r14 = r14.f7258
            r0.getClass()
            r0 = -484786128199214(0xfffe4716ef0961d2, double:NaN)
            java.io.File r0 = new java.io.File
            java.io.File r14 = r14.getFilesDir()
            r3 = -484820487937582(0xfffe470eef0961d2, double:NaN)
            java.lang.String r1 = "tts_audio"
            r0.<init>(r14, r1)
            boolean r14 = r0.exists()
            if (r14 != 0) goto L1b6
            r0.mkdirs()
        L1b6:
            java.io.File r14 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = -84228888239662(0xffffb364ef0961d2, double:NaN)
            java.lang.String r3 = "tts_"
            r1.<init>(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r1.append(r3)
            r3 = -84250363076142(0xffffb35fef0961d2, double:NaN)
            java.lang.String r3 = ".mp3"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r14.<init>(r0, r1)
            ᛶᲈᛸᛳ r15 = r15.f2823
            java.io.InputStream r15 = r15.m2322()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L336
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L336
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L338
            int r3 = r15.read(r1)     // Catch: java.lang.Throwable -> L338
        L1f3:
            if (r3 < 0) goto L1fd
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L338
            int r3 = r15.read(r1)     // Catch: java.lang.Throwable -> L338
            goto L1f3
        L1fd:
            r0.flush()     // Catch: java.lang.Throwable -> L338
            r0.close()     // Catch: java.lang.Throwable -> L336
            r15.close()
            boolean r15 = r14.exists()
            if (r15 == 0) goto L327
            long r0 = r14.length()
            r3 = 0
            int r15 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r15 == 0) goto L327
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = -84310492618286(0xffffb351ef0961d2, double:NaN)
            java.lang.String r0 = "TTS音频已保存: "
            r15.<init>(r0)
            java.lang.String r0 = r14.getAbsolutePath()
            r15.append(r0)
            r0 = -84357737258542(0xffffb346ef0961d2, double:NaN)
            java.lang.String r0 = ", 大小: "
            r15.append(r0)
            long r0 = r14.length()
            r15.append(r0)
            r0 = -84387802029614(0xffffb33fef0961d2, double:NaN)
            java.lang.String r0 = " bytes"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            r0 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r5 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r7 = r15.length()
            r8 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            if (r7 != 0) goto L26a
            goto L287
        L26a:
            int r7 = r15.length()
            r10 = r2
        L26f:
            if (r10 >= r7) goto L287
            int r11 = r10 + 2000
            if (r11 <= r7) goto L276
            r11 = r7
        L276:
            java.lang.String r10 = r15.substring(r10, r11)
            ᛲᲀᛱᲁ r12 = defpackage.C0346.f1773
            r12.getClass()
            defpackage.C0346.m1040(r10)
            r10 = r11
            goto L26f
        L287:
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Exception -> L2a6
            r15.<init>()     // Catch: java.lang.Exception -> L2a6
            java.lang.String r7 = r14.getAbsolutePath()     // Catch: java.lang.Exception -> L2a6
            r15.setDataSource(r7)     // Catch: java.lang.Exception -> L2a6
            r7 = 9
            java.lang.String r7 = r15.extractMetadata(r7)     // Catch: java.lang.Exception -> L2a6
            if (r7 == 0) goto L2a8
            java.lang.Long r7 = defpackage.AbstractC0056.m466(r7)     // Catch: java.lang.Exception -> L2a6
            if (r7 == 0) goto L2a8
            long r10 = r7.longValue()     // Catch: java.lang.Exception -> L2a6
            goto L2a9
        L2a6:
            r15 = move-exception
            goto L2fb
        L2a8:
            r10 = r3
        L2a9:
            r15.release()     // Catch: java.lang.Exception -> L2a6
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2a6
            r15.<init>()     // Catch: java.lang.Exception -> L2a6
            r12 = -84417866800686(0xffffb338ef0961d2, double:NaN)
            java.lang.String r7 = "音频时长: "     // Catch: java.lang.Exception -> L2a6
            r15.append(r7)     // Catch: java.lang.Exception -> L2a6
            r15.append(r10)     // Catch: java.lang.Exception -> L2a6
            r12 = -84447931571758(0xffffb331ef0961d2, double:NaN)
            java.lang.String r7 = "ms"     // Catch: java.lang.Exception -> L2a6
            r15.append(r7)     // Catch: java.lang.Exception -> L2a6
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Exception -> L2a6
            int r0 = r15.length()     // Catch: java.lang.Exception -> L2a6
            if (r0 != 0) goto L2dd
            goto L2f9
        L2dd:
            int r0 = r15.length()     // Catch: java.lang.Exception -> L2a6
        L2e1:
            if (r2 >= r0) goto L2f9
            int r1 = r2 + 2000
            if (r1 <= r0) goto L2e8
            r1 = r0
        L2e8:
            java.lang.String r2 = r15.substring(r2, r1)     // Catch: java.lang.Exception -> L2a6
            ᛲᲀᛱᲁ r5 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L2a6
            r5.getClass()     // Catch: java.lang.Exception -> L2a6
            defpackage.C0346.m1040(r2)     // Catch: java.lang.Exception -> L2a6
            r2 = r1
            goto L2e1
        L2f9:
            r3 = r10
            goto L31c
        L2fb:
            r0 = -84460816473646(0xffffb32eef0961d2, double:NaN)
            java.lang.String r0 = "获取音频时长失败"
            r1 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r1 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r1 = defpackage.C0346.f1773
            r1.getClass()
            defpackage.C0346.m1038(r0, r15)
        L31c:
            kotlin.Pair r15 = new kotlin.Pair
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            r15.<init>(r14, r0)
            return r15
        L327:
            java.lang.Exception r14 = new java.lang.Exception
            r0 = -84271837912622(0xffffb35aef0961d2, double:NaN)
            java.lang.String r15 = "音频文件保存失败"
            r14.<init>(r15)
            throw r14
        L336:
            r14 = move-exception
            goto L33f
        L338:
            r14 = move-exception
            throw r14     // Catch: java.lang.Throwable -> L33a
        L33a:
            r1 = move-exception
            defpackage.AbstractC2346.m3845(r0, r14)     // Catch: java.lang.Throwable -> L336
            throw r1     // Catch: java.lang.Throwable -> L336
        L33f:
            throw r14     // Catch: java.lang.Throwable -> L340
        L340:
            r0 = move-exception
            defpackage.AbstractC2346.m3845(r15, r14)
            throw r0
        L345:
            java.lang.Exception r14 = new java.lang.Exception
            r0 = -84198823468590(0xffffb36bef0961d2, double:NaN)
            java.lang.String r0 = "下载失败: "
            int r15 = r15.f2833
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r14.<init>(r15)
            throw r14
    }
}
