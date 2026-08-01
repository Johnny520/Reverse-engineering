package defpackage;

/* JADX INFO: renamed from: ᲈᲈᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2374 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C0517 f10259;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2374 f10260 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static volatile boolean f10261;

    static {
            r0 = -468826029727278(0xfffe559aef0961d2, double:NaN)
            r0 = -469238346587694(0xfffe553aef0961d2, double:NaN)
            r0 = -469311361031726(0xfffe5529ef0961d2, double:NaN)
            ᲈᲈᲁᛶ r0 = new ᲈᲈᲁᛶ
            r0.<init>()
            defpackage.C2374.f10260 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static java.lang.String m3885(java.lang.String r4) {
            r0 = -466910474313262(0xfffe5758ef0961d2, double:NaN)
            java.lang.String r0 = "png"
            r1 = 0
            boolean r0 = defpackage.AbstractC1347.m2500(r4, r0, r1)
            if (r0 == 0) goto L1a
            r0 = -466927654182446(0xfffe5754ef0961d2, double:NaN)
            java.lang.String r4 = "png"
            return r4
        L1a:
            r2 = -466944834051630(0xfffe5750ef0961d2, double:NaN)
            java.lang.String r0 = "jpeg"
            boolean r0 = defpackage.AbstractC1347.m2500(r4, r0, r1)
            if (r0 != 0) goto La7
            r2 = -466966308888110(0xfffe574bef0961d2, double:NaN)
            java.lang.String r0 = "jpg"
            boolean r0 = defpackage.AbstractC1347.m2500(r4, r0, r1)
            if (r0 == 0) goto L39
            goto La7
        L39:
            r2 = -467000668626478(0xfffe5743ef0961d2, double:NaN)
            java.lang.String r0 = "gif"
            boolean r0 = defpackage.AbstractC1347.m2500(r4, r0, r1)
            if (r0 == 0) goto L52
            r0 = -467017848495662(0xfffe573fef0961d2, double:NaN)
            java.lang.String r4 = "gif"
            return r4
        L52:
            r2 = -467035028364846(0xfffe573bef0961d2, double:NaN)
            java.lang.String r0 = "webp"
            boolean r0 = defpackage.AbstractC1347.m2500(r4, r0, r1)
            if (r0 == 0) goto L6b
            r0 = -467056503201326(0xfffe5736ef0961d2, double:NaN)
            java.lang.String r4 = "webp"
            return r4
        L6b:
            r2 = -467077978037806(0xfffe5731ef0961d2, double:NaN)
            java.lang.String r0 = "heif"
            boolean r0 = defpackage.AbstractC1347.m2500(r4, r0, r1)
            if (r0 == 0) goto L84
            r0 = -467099452874286(0xfffe572cef0961d2, double:NaN)
            java.lang.String r4 = "heif"
            return r4
        L84:
            r2 = -467120927710766(0xfffe5727ef0961d2, double:NaN)
            java.lang.String r0 = "heic"
            boolean r4 = defpackage.AbstractC1347.m2500(r4, r0, r1)
            if (r4 == 0) goto L9d
            r0 = -467142402547246(0xfffe5722ef0961d2, double:NaN)
            java.lang.String r4 = "heic"
            return r4
        L9d:
            r0 = -467163877383726(0xfffe571def0961d2, double:NaN)
            java.lang.String r4 = "jpg"
            return r4
        La7:
            r0 = -466983488757294(0xfffe5747ef0961d2, double:NaN)
            java.lang.String r4 = "jpg"
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static boolean m3886(java.io.File r6, java.lang.String r7) {
            r0 = -463388601130542(0xfffe5a8cef0961d2, double:NaN)
            r0 = -463427255836206(0xfffe5a83ef0961d2, double:NaN)
            r0 = 0
            java.io.File r1 = r6.getParentFile()     // Catch: java.lang.Exception -> L98
            if (r1 == 0) goto L9a
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L98
            if (r2 != 0) goto L9a
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Exception -> L98
            if (r2 != 0) goto L9a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r6.<init>()     // Catch: java.lang.Exception -> L98
            r2 = -463444435705390(0xfffe5a7fef0961d2, double:NaN)
            java.lang.String r7 = "创建目录失败: "     // Catch: java.lang.Exception -> L98
            r6.append(r7)     // Catch: java.lang.Exception -> L98
            java.lang.String r7 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L98
            r6.append(r7)     // Catch: java.lang.Exception -> L98
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L98
            r2 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r2 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r7 = r6.length()     // Catch: java.lang.Exception -> L98
            if (r7 != 0) goto L56
            goto L78
        L56:
            int r7 = r6.length()     // Catch: java.lang.Exception -> L98
            r2 = r0
        L5b:
            if (r2 >= r7) goto L78
            int r3 = r2 + 2000
            if (r3 <= r7) goto L62
            r3 = r7
        L62:
            java.lang.String r2 = r6.substring(r2, r3)     // Catch: java.lang.Exception -> L98
            r4 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L98
            r4.getClass()     // Catch: java.lang.Exception -> L98
            defpackage.C0346.m1040(r2)     // Catch: java.lang.Exception -> L98
            r2 = r3
            goto L5b
        L78:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r6.<init>()     // Catch: java.lang.Exception -> L98
            r2 = -463483090411054(0xfffe5a76ef0961d2, double:NaN)
            java.lang.String r7 = "创建目录失败: "     // Catch: java.lang.Exception -> L98
            r6.append(r7)     // Catch: java.lang.Exception -> L98
            java.lang.String r7 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L98
            r6.append(r7)     // Catch: java.lang.Exception -> L98
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L98
            defpackage.AbstractC0209.m764(r6)     // Catch: java.lang.Exception -> L98
            return r0
        L98:
            r6 = move-exception
            goto Lf5
        L9a:
            r6.delete()     // Catch: java.lang.Exception -> L98
            ᛳᲀᲁᲈ r1 = new ᛳᲀᲁᲈ     // Catch: java.lang.Exception -> L98
            r1.<init>()     // Catch: java.lang.Exception -> L98
            r1.m1336(r7)     // Catch: java.lang.Exception -> L98
            ᛳᛵᛴᛴ r7 = new ᛳᛵᛴᛴ     // Catch: java.lang.Exception -> L98
            r7.<init>(r1)     // Catch: java.lang.Exception -> L98
            ᛶᛸᛱᲀ r1 = defpackage.C1121.f5003     // Catch: java.lang.Exception -> L98
            ᲈᛴᛶᲁ r1 = defpackage.C1121.m2135()     // Catch: java.lang.Exception -> L98
            r1.getClass()     // Catch: java.lang.Exception -> L98
            ᛶᛴᲈ r2 = new ᛶᛴᲈ     // Catch: java.lang.Exception -> L98
            r2.<init>(r1, r7)     // Catch: java.lang.Exception -> L98
            ᛳᲇᛲᲁ r7 = r2.m2021()     // Catch: java.lang.Exception -> L98
            boolean r1 = r7.f2832     // Catch: java.lang.Exception -> L98
            if (r1 != 0) goto Lc1
            return r0
        Lc1:
            ᛶᲈᛸᛳ r7 = r7.f2823     // Catch: java.lang.Exception -> L98
            java.io.InputStream r7 = r7.m2322()     // Catch: java.lang.Exception -> L98
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le6
            r1.<init>(r6)     // Catch: java.lang.Throwable -> Le6
            r6 = 8192(0x2000, float:1.148E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Le8
            int r2 = r7.read(r6)     // Catch: java.lang.Throwable -> Le8
        Ld4:
            if (r2 < 0) goto Lde
            r1.write(r6, r0, r2)     // Catch: java.lang.Throwable -> Le8
            int r2 = r7.read(r6)     // Catch: java.lang.Throwable -> Le8
            goto Ld4
        Lde:
            r1.close()     // Catch: java.lang.Throwable -> Le6
            r7.close()     // Catch: java.lang.Exception -> L98
            r6 = 1
            return r6
        Le6:
            r6 = move-exception
            goto Lef
        Le8:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> Lea
        Lea:
            r2 = move-exception
            defpackage.AbstractC2346.m3845(r1, r6)     // Catch: java.lang.Throwable -> Le6
            throw r2     // Catch: java.lang.Throwable -> Le6
        Lef:
            throw r6     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            r1 = move-exception
            defpackage.AbstractC2346.m3845(r7, r6)     // Catch: java.lang.Exception -> L98
            throw r1     // Catch: java.lang.Exception -> L98
        Lf5:
            r1 = -463521745116718(0xfffe5a6def0961d2, double:NaN)
            java.lang.String r7 = "下载文件失败"
            r1 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r1 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r1 = defpackage.C0346.f1773
            r1.getClass()
            defpackage.C0346.m1038(r7, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r1 = -463551809887790(0xfffe5a66ef0961d2, double:NaN)
            java.lang.String r1 = "下载失败: "
            r7.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.AbstractC0209.m764(r6)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m3887(android.content.Context r2, java.io.File r3, boolean r4) {
            if (r4 == 0) goto L17
            ᛲᛳᛱᛲ r4 = defpackage.C0259.f1512     // Catch: java.lang.Exception -> L1b
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Exception -> L1b
            r0 = -463255457144366(0xfffe5aabef0961d2, double:NaN)
            r4.getClass()     // Catch: java.lang.Exception -> L1b
            defpackage.C0259.m888(r2, r3)     // Catch: java.lang.Exception -> L1b
            return
        L17:
            r3.delete()     // Catch: java.lang.Exception -> L1b
            return
        L1b:
            r2 = move-exception
            r3 = -463345651457582(0xfffe5a96ef0961d2, double:NaN)
            java.lang.String r3 = "删除未完成文件失败"
            r0 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r0 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773
            r4.getClass()
            defpackage.C0346.m1038(r3, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static boolean m3888(java.lang.String r5, java.lang.String r6) {
            r0 = -463581874658862(0xfffe5a5fef0961d2, double:NaN)
            r0 = -463629119299118(0xfffe5a54ef0961d2, double:NaN)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L31
            r1.<init>(r5)     // Catch: java.lang.Exception -> L31
            java.nio.file.Path r5 = r1.toPath()     // Catch: java.lang.Exception -> L31
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L31
            r2.<init>(r6)     // Catch: java.lang.Exception -> L31
            java.nio.file.Path r6 = r2.toPath()     // Catch: java.lang.Exception -> L31
            r2 = 1
            java.nio.file.CopyOption[] r3 = new java.nio.file.CopyOption[r2]     // Catch: java.lang.Exception -> L31
            java.nio.file.StandardCopyOption r4 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Exception -> L31
            r3[r0] = r4     // Catch: java.lang.Exception -> L31
            java.nio.file.Files.copy(r5, r6, r3)     // Catch: java.lang.Exception -> L31
            r1.delete()     // Catch: java.lang.Exception -> L31
            return r2
        L31:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r1 = -463667774004782(0xfffe5a4bef0961d2, double:NaN)
            java.lang.String r1 = "复制文件失败: "
            r6.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r1 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r1 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r6 = r5.length()
            if (r6 != 0) goto L62
            goto L84
        L62:
            int r6 = r5.length()
            r1 = r0
        L67:
            if (r1 >= r6) goto L84
            int r2 = r1 + 2000
            if (r2 <= r6) goto L6e
            r2 = r6
        L6e:
            java.lang.String r1 = r5.substring(r1, r2)
            r3 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1040(r1)
            r1 = r2
            goto L67
        L84:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m3889(android.content.Context r5) {
            r0 = -463727903546926(0xfffe5a3def0961d2, double:NaN)
            java.lang.String r0 = "Dyyds下载"
            r1 = -463762263285294(0xfffe5a35ef0961d2, double:NaN)
            java.lang.String r1 = "显示文件下载进度"
            android.app.NotificationChannel r2 = new android.app.NotificationChannel
            r3 = -463800917990958(0xfffe5a2cef0961d2, double:NaN)
            java.lang.String r3 = "download_channel"
            r4 = 2
            r2.<init>(r3, r0, r4)
            r2.setDescription(r1)
            r0 = -463873932434990(0xfffe5a1bef0961d2, double:NaN)
            java.lang.String r0 = "notification"
            java.lang.Object r5 = r5.getSystemService(r0)
            r0 = -463929767009838(0xfffe5a0eef0961d2, double:NaN)
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5
            r5.createNotificationChannel(r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static java.lang.String m3890(java.lang.Integer r3) {
            int r0 = r3.intValue()
            if (r0 > 0) goto L10
            r0 = -463251162177070(0xfffe5aacef0961d2, double:NaN)
            java.lang.String r3 = ""
            return r3
        L10:
            int r3 = r3.intValue()
            int r3 = r3 / 1000
            int r0 = r3 / 60
            int r3 = r3 % 60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 <= 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r0 = 20998(0x5206, float:2.9424E-41)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
        L35:
            if (r3 <= 0) goto L4b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 31186(0x79d2, float:4.3701E-41)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r1.append(r3)
        L4b:
            java.lang.String r3 = r1.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.lang.String m3891(java.lang.String r3, java.lang.String r4) {
            r0 = -461842412903982(0xfffe5bf4ef0961d2, double:NaN)
            r0 = -461872477675054(0xfffe5bedef0961d2, double:NaN)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r1 = -461902542446126(0xfffe5be6ef0961d2, double:NaN)
            java.lang.String r1 = "yyyyMMddHHmmss"
            r3.<init>(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r3 = r3.format(r1)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m3892(android.content.Context r35, java.lang.String r36, java.lang.String r37, defpackage.AbstractC1016 r38) {
            r34 = this;
            r3 = r35
            r7 = r36
            r0 = r38
            ᲁᲀᛱᲁ r8 = defpackage.C1907.f8270
            boolean r1 = r0 instanceof defpackage.C0734
            if (r1 == 0) goto L1c
            r1 = r0
            ᛴᛸᲁᲁ r1 = (defpackage.C0734) r1
            int r2 = r1.f3475
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L1c
            int r2 = r2 - r4
            r1.f3475 = r2
        L1a:
            r9 = r1
            goto L24
        L1c:
            ᛴᛸᲁᲁ r1 = new ᛴᛸᲁᲁ
            r2 = r34
            r1.<init>(r2, r0)
            goto L1a
        L24:
            java.lang.Object r0 = r9.f3471
            ᛴᛵ r10 = defpackage.EnumC0670.f3246
            int r1 = r9.f3475
            r11 = 5
            r2 = 3
            r4 = 2
            r12 = 4
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L118
            if (r1 == r5) goto Lfd
            if (r1 == r4) goto Lf1
            if (r1 == r2) goto Lb7
            if (r1 == r12) goto L72
            if (r1 != r11) goto L65
            java.io.OutputStream r1 = r9.f3474
            java.io.InputStream r2 = r9.f3472
            ᛸᛱᛴᲁ r3 = r9.f3469
            android.content.Context r4 = r9.f3476
            defpackage.AbstractC0762.m1680(r0)     // Catch: java.lang.Throwable -> L53
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            goto L663
        L53:
            r0 = move-exception
            r6 = r1
            r14 = r2
            r13 = r3
            r3 = r4
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
        L62:
            r1 = r0
            goto L6de
        L65:
            r0 = -466700020915758(0xfffe5789ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            return r6
        L72:
            boolean r1 = r9.f3470
            java.io.OutputStream r2 = r9.f3474
            java.io.InputStream r3 = r9.f3472
            ᛸᛱᛴᲁ r4 = r9.f3469
            java.lang.String r5 = r9.f3477
            android.content.Context r7 = r9.f3476
            defpackage.AbstractC0762.m1680(r0)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> La3
            r14 = r3
            r23 = r6
            r3 = r7
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            goto L54f
        L91:
            r0 = move-exception
            r1 = r0
            r6 = r2
            r14 = r3
            r13 = r4
            r3 = r7
        L97:
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            goto L6de
        La3:
            r0 = move-exception
            r14 = r3
            r13 = r4
            r23 = r6
            r3 = r7
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r6 = r2
            r7 = r5
            goto L613
        Lb7:
            boolean r1 = r9.f3470
            java.io.OutputStream r2 = r9.f3474
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            java.io.InputStream r2 = r9.f3472
            java.io.File r2 = (java.io.File) r2
            ᛸᛱᛴᲁ r3 = r9.f3469
            java.lang.String r2 = r9.f3477
            android.content.Context r4 = r9.f3476
            defpackage.AbstractC0762.m1680(r0)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lde
            r13 = r3
            r3 = r4
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            goto L2f4
        Ld8:
            r0 = move-exception
            r1 = r0
            r13 = r3
            r3 = r4
            r14 = r6
            goto L97
        Lde:
            r0 = move-exception
            r7 = r2
            r13 = r3
            r3 = r4
            r14 = r6
            r23 = r14
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            goto L613
        Lf1:
            java.io.OutputStream r1 = r9.f3474
            java.lang.Exception r1 = (java.lang.Exception) r1
            java.io.InputStream r1 = r9.f3472
            java.io.File r1 = (java.io.File) r1
            defpackage.AbstractC0762.m1680(r0)
            return r8
        Lfd:
            boolean r1 = r9.f3470
            java.io.OutputStream r2 = r9.f3474
            java.io.File r2 = (java.io.File) r2
            java.io.InputStream r2 = r9.f3472
            java.io.File r2 = (java.io.File) r2
            defpackage.AbstractC0762.m1680(r0)     // Catch: java.lang.Exception -> L10b
            return r8
        L10b:
            r0 = move-exception
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            goto L18a
        L118:
            defpackage.AbstractC0762.m1680(r0)
            r1 = 0
            defpackage.C2374.f10261 = r1
            r17 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛸᛱᛴᲁ r13 = new ᛸᛱᛴᲁ
            r13.<init>()
            java.io.File r14 = new java.io.File
            r14.<init>(r7)
            ᛲᛳᛱᛲ r0 = defpackage.C0259.f1512
            java.lang.String r19 = r14.getAbsolutePath()
            r20 = -464226119753262(0xfffe59c9ef0961d2, double:NaN)
            r0.getClass()
            r20 = -434238658092590(0xfffe750fef0961d2, double:NaN)
            ᛱᲇᲈᛵ r0 = defpackage.C0259.m887(r19)
            if (r0 == 0) goto L153
            r15 = r5
        L14d:
            r19 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            goto L155
        L153:
            r15 = r1
            goto L14d
        L155:
            if (r15 != 0) goto L1c0
            java.io.File r0 = r14.getParentFile()     // Catch: java.lang.Exception -> L188
            if (r0 == 0) goto L1c0
            boolean r16 = r0.exists()     // Catch: java.lang.Exception -> L188
            if (r16 != 0) goto L1c0
            boolean r16 = r0.mkdirs()     // Catch: java.lang.Exception -> L188
            if (r16 != 0) goto L1c0
            ᛶᛸᛳ r1 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> L188
            ᛷᲁᛷᛵ r1 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Exception -> L188
            ᛲᲈᛶᛶ r2 = new ᛲᲈᛶᛶ     // Catch: java.lang.Exception -> L188
            r2.<init>(r0, r6, r5)     // Catch: java.lang.Exception -> L188
            r9.f3476 = r6     // Catch: java.lang.Exception -> L188
            r9.f3477 = r6     // Catch: java.lang.Exception -> L188
            r9.f3469 = r6     // Catch: java.lang.Exception -> L188
            r9.f3472 = r6     // Catch: java.lang.Exception -> L188
            r9.f3474 = r6     // Catch: java.lang.Exception -> L188
            r9.f3470 = r15     // Catch: java.lang.Exception -> L188
            r9.f3475 = r5     // Catch: java.lang.Exception -> L188
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r1, r2, r9)     // Catch: java.lang.Exception -> L188
            if (r0 != r10) goto L6dd
            goto L65e
        L188:
            r0 = move-exception
            r1 = r15
        L18a:
            r2 = -464316314066478(0xfffe59b4ef0961d2, double:NaN)
            java.lang.String r2 = "创建目录异常"
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r0)
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r2 = defpackage.AbstractC1497.f6594
            ᛴᛷᛷᲁ r3 = new ᛴᛷᛷᲁ
            r3.<init>(r0, r6, r5)
            r9.f3476 = r6
            r9.f3477 = r6
            r9.f3469 = r6
            r9.f3472 = r6
            r9.f3474 = r6
            r9.f3470 = r1
            r9.f3475 = r4
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r2, r3, r9)
            if (r0 != r10) goto L6dd
            goto L65e
        L1c0:
            java.lang.String r0 = defpackage.AbstractC1171.m2252()     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r21 = -445281019010606(0xfffe6b04ef0961d2, double:NaN)
            r34 = r4
            java.lang.String r4 = "0"     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            if (r0 != 0) goto L602
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r0.getClass()     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            defpackage.C0346.m1051(r3)     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            m3889(r3)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r21 = -464376443608622(0xfffe59a6ef0961d2, double:NaN)
            java.lang.String r0 = "notification"     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r21 = -464432278183470(0xfffe5999ef0961d2, double:NaN)
            r4 = r0
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛳᛷᲇᛸ r0 = defpackage.C2374.f10259     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L207
            if (r0 == 0) goto L21f
            r3.unregisterReceiver(r0)     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L207
            defpackage.C2374.f10259 = r6     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L207
            goto L21f
        L202:
            r0 = move-exception
        L203:
            r1 = r0
        L204:
            r14 = r6
            goto L6de
        L207:
            r0 = move-exception
            r21 = -464728630926894(0xfffe5954ef0961d2, double:NaN)
            java.lang.String r2 = "注销旧 receiver 异常"     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛲᲀᛱᲁ r16 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r16.getClass()     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            defpackage.C0346.m1038(r2, r0)     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
        L21f:
            ᛳᛷᲇᛸ r0 = new ᛳᛷᲇᛸ     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            defpackage.C2374.f10259 = r0     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r21 = -464797350403630(0xfffe5944ef0961d2, double:NaN)
            java.lang.String r2 = "com.ss.android.ugc.awemes.ACTION_CANCEL_DOWNLOAD"     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛳᛷᲇᛸ r2 = defpackage.C2374.f10259     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r3.registerReceiver(r2, r0, r12)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r21 = -465007803801134(0xfffe5913ef0961d2, double:NaN)
            java.lang.String r2 = "com.ss.android.ugc.awemes.ACTION_CANCEL_DOWNLOAD"     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r0.setPackage(r2)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r3, r1, r0, r2)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛸᛶᲈᛷ r2 = new ᛸᛶᲈᛷ     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r21 = -465218257198638(0xfffe58e2ef0961d2, double:NaN)
            java.lang.String r12 = "download_channel"     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r2.<init>(r3, r12)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            android.app.Notification r12 = r2.f6714     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r5 = 17301633(0x1080081, float:2.4979616E-38)
            r12.icon = r5     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r22 = -465291271642670(0xfffe58d1ef0961d2, double:NaN)
            java.lang.String r5 = "下载中"     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r2.m2770(r5)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r22 = -465308451511854(0xfffe58cdef0961d2, double:NaN)
            java.lang.String r5 = "准备下载..."     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            java.lang.CharSequence r5 = defpackage.C1522.m2769(r5)     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r2.f6723 = r5     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r5 = -1
            r2.f6724 = r5     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            android.app.Notification r12 = r2.f6714     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            int r5 = r12.flags     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r5 = r5 | 2
            r12.flags = r5     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r5 = 100
            r2.f6712 = r5     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r2.f6715 = r1     // Catch: java.lang.Throwable -> L5fa java.lang.Exception -> L5fe
            r23 = -465342811250222(0xfffe58c5ef0961d2, double:NaN)
            java.lang.String r12 = "取消下载"     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r2.m2771(r12, r0)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r23 = -465364286086702(0xfffe58c0ef0961d2, double:NaN)
            android.app.Notification r0 = r2.m2772()     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r12 = 1001(0x3e9, float:1.403E-42)
            r4.notify(r12, r0)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛳᲀᲁᲈ r0 = new ᛳᲀᲁᲈ     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r0.<init>()     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r12 = r37
            r0.m1336(r12)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛳᛵᛴᛴ r0 = r0.m1340()     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛶᛸᛱᲀ r12 = defpackage.C1121.f5003     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᲈᛴᛶᲁ r12 = defpackage.C1121.m2135()     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛶᛴᲈ r0 = r12.m3616(r0)     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            ᛳᲇᛲᲁ r0 = r0.m2021()     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r13.f6211 = r0     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            boolean r12 = r0.f2832     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            if (r12 != 0) goto L342
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            ᲇᛶᲁᲇ r1 = new ᲇᛶᲁᲇ     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r1.<init>(r13, r4, r6, r11)     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r9.f3476 = r3     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r9.f3477 = r7     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r9.f3469 = r13     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r9.f3472 = r6     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r9.f3474 = r6     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r9.f3470 = r15     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            r2 = 3
            r9.f3475 = r2     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r1, r9)     // Catch: java.lang.Throwable -> L202 java.lang.Exception -> L33b
            if (r0 != r10) goto L2f4
            goto L65e
        L2f4:
            java.lang.Object r0 = r13.f6211     // Catch: java.lang.Exception -> L2fe
            ᛳᲇᛲᲁ r0 = (defpackage.C0569) r0     // Catch: java.lang.Exception -> L2fe
            if (r0 == 0) goto L316
            r0.close()     // Catch: java.lang.Exception -> L2fe
            goto L316
        L2fe:
            r0 = move-exception
            r1 = -465497430072878(0xfffe58a1ef0961d2, double:NaN)
            java.lang.String r1 = "关闭响应异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L316:
            ᛳᛷᲇᛸ r0 = defpackage.C2374.f10259     // Catch: java.lang.Exception -> L321
            if (r0 == 0) goto L6dd
            r3.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L321
            defpackage.C2374.f10259 = r6     // Catch: java.lang.Exception -> L321
            goto L6dd
        L321:
            r0 = move-exception
            r1 = -465527494843950(0xfffe589aef0961d2, double:NaN)
        L327:
            java.lang.String r1 = "注销 receiver 异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
            goto L6dd
        L33b:
            r0 = move-exception
            r14 = r6
            r23 = r14
        L33f:
            r1 = r15
            goto L613
        L342:
            ᛶᲈᛸᛳ r0 = r0.f2823     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            long r11 = r0.mo632()     // Catch: java.lang.Throwable -> L5f0 java.lang.Exception -> L5f5
            r23 = r6
            java.io.InputStream r6 = r0.m2322()     // Catch: java.lang.Throwable -> L5e4 java.lang.Exception -> L5ea
            if (r15 == 0) goto L386
            ᛲᛳᛱᛲ r0 = defpackage.C0259.f1512     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
            java.lang.String r5 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
            r25 = -465591919353390(0xfffe588bef0961d2, double:NaN)
            r0.getClass()     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
            java.io.OutputStream r0 = defpackage.C0259.m885(r3, r5)     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
            if (r0 == 0) goto L369
        L367:
            r5 = r0
            goto L38c
        L369:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
            r1 = -465682113666606(0xfffe5876ef0961d2, double:NaN)
            java.lang.String r1 = "无法写入选择的文件夹"     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
            throw r0     // Catch: java.lang.Throwable -> L378 java.lang.Exception -> L37f
        L378:
            r0 = move-exception
            r1 = r0
            r14 = r6
        L37b:
            r6 = r23
            goto L6de
        L37f:
            r0 = move-exception
            r14 = r6
            r1 = r15
            r6 = r23
            goto L613
        L386:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L37f java.lang.Throwable -> L5df
            r0.<init>(r14)     // Catch: java.lang.Exception -> L37f java.lang.Throwable -> L5df
            goto L367
        L38c:
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L5d7 java.lang.Exception -> L5db
            r25 = 0
            r26 = 0
        L394:
            int r1 = r6.read(r0)     // Catch: java.lang.Throwable -> L5d7 java.lang.Exception -> L5db
            r37 = r6
            r6 = -1
            if (r1 == r6) goto L51f
            boolean r22 = defpackage.C2374.f10261     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            if (r22 == 0) goto L493
            r0 = -465729358306862(0xfffe586bef0961d2, double:NaN)
            java.lang.String r0 = "检测到取消请求，停止下载"     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            r1 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r1 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            if (r1 != 0) goto L3c1
            goto L3e3
        L3c1:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            r2 = 0
        L3c6:
            if (r2 >= r1) goto L3e3
            int r4 = r2 + 2000
            if (r4 <= r1) goto L3cd
            r4 = r1
        L3cd:
            java.lang.String r2 = r0.substring(r2, r4)     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            r11 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r6 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            r6.getClass()     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            defpackage.C0346.m1040(r2)     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            r2 = r4
            goto L3c6
        L3e3:
            if (r15 == 0) goto L404
            ᛲᛳᛱᛲ r0 = defpackage.C0259.f1512     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L402
            java.lang.String r1 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L402
            r11 = -465785192881710(0xfffe585eef0961d2, double:NaN)
            r0.getClass()     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L402
            defpackage.C0259.m888(r3, r1)     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L402
            goto L41f
        L3fa:
            r14 = r37
            r1 = r0
            r6 = r5
            goto L6de
        L400:
            r0 = move-exception
            goto L3fa
        L402:
            r0 = move-exception
            goto L408
        L404:
            r14.delete()     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L402
            goto L41f
        L408:
            r1 = -465875387194926(0xfffe5849ef0961d2, double:NaN)
            java.lang.String r1 = "删除未完成文件失败"     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            r2.getClass()     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
            defpackage.C0346.m1038(r1, r0)     // Catch: java.lang.Throwable -> L400 java.lang.Exception -> L491
        L41f:
            r5.close()     // Catch: java.lang.Exception -> L423
            goto L43b
        L423:
            r0 = move-exception
            r1 = -465918336867886(0xfffe583fef0961d2, double:NaN)
            java.lang.String r1 = "关闭输出流异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L43b:
            r37.close()     // Catch: java.lang.Exception -> L43f
            goto L457
        L43f:
            r0 = move-exception
            r1 = -465952696606254(0xfffe5837ef0961d2, double:NaN)
            java.lang.String r1 = "关闭输入流异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L457:
            java.lang.Object r0 = r13.f6211     // Catch: java.lang.Exception -> L461
            ᛳᲇᛲᲁ r0 = (defpackage.C0569) r0     // Catch: java.lang.Exception -> L461
            if (r0 == 0) goto L479
            r0.close()     // Catch: java.lang.Exception -> L461
            goto L479
        L461:
            r0 = move-exception
            r1 = -465987056344622(0xfffe582fef0961d2, double:NaN)
            java.lang.String r1 = "关闭响应异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L479:
            ᛳᛷᲇᛸ r0 = defpackage.C2374.f10259     // Catch: java.lang.Exception -> L484
            if (r0 == 0) goto L6dd
            r3.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L484
            defpackage.C2374.f10259 = r23     // Catch: java.lang.Exception -> L484
            goto L6dd
        L484:
            r0 = move-exception
            r1 = -466017121115694(0xfffe5828ef0961d2, double:NaN)
            goto L327
        L48c:
            r14 = r37
            r6 = r5
            goto L33f
        L491:
            r0 = move-exception
            goto L48c
        L493:
            r6 = 0
            r5.write(r0, r6, r1)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            float r25 = r25 + r1
            long r28 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            long r30 = r28 - r26
            r32 = 200(0xc8, double:9.9E-322)
            int r1 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r1 < 0) goto L519
            float r1 = (float) r11     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            float r1 = r25 / r1
            r26 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r26
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r26 = -466081545625134(0xfffe5819ef0961d2, double:NaN)
            java.lang.String r6 = "%.2f"     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r31 = r0
            float r0 = (float) r1     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            java.lang.Float r0 = defpackage.AbstractC1754.m3159(r0)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            java.lang.String r0 = java.lang.String.format(r6, r0)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r26 = -466103020461614(0xfffe5814ef0961d2, double:NaN)
            r6 = 100
            r2.f6712 = r6     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r2.f6715 = r1     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r1.<init>()     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r26 = -466154560069166(0xfffe5808ef0961d2, double:NaN)
            java.lang.String r3 = "下载中: "     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r1.append(r3)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r1.append(r0)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r0 = 37
            r1.append(r0)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            java.lang.CharSequence r0 = defpackage.C1522.m2769(r0)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r2.f6723 = r0     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            android.app.Notification r0 = r2.m2772()     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r1 = 1001(0x3e9, float:1.403E-42)
            r4.notify(r1, r0)     // Catch: java.lang.Throwable -> L50f java.lang.Exception -> L514
            r3 = r35
            r6 = r37
            r26 = r28
            r0 = r31
            goto L394
        L50f:
            r0 = move-exception
            r3 = r35
            goto L3fa
        L514:
            r0 = move-exception
            r3 = r35
            goto L48c
        L519:
            r3 = r35
            r6 = r37
            goto L394
        L51f:
            r5.flush()     // Catch: java.lang.Throwable -> L5c9 java.lang.Exception -> L5d0
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Throwable -> L5c9 java.lang.Exception -> L5d0
            ᛷᲁᛷᛵ r11 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Throwable -> L5c9 java.lang.Exception -> L5d0
            ᛵᛲᛸᛱ r0 = new ᛵᛲᛸᛱ     // Catch: java.lang.Throwable -> L5c9 java.lang.Exception -> L5d0
            r1 = r5
            r5 = 0
            r6 = 5
            r3 = r35
            r12 = r1
            r1 = r2
            r2 = r4
            r4 = r14
            r14 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            r9.f3476 = r3     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            r9.f3477 = r7     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            r9.f3469 = r13     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            r9.f3472 = r14     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            r9.f3474 = r12     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            r9.f3470 = r15     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            r1 = 4
            r9.f3475 = r1     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r11, r0, r9)     // Catch: java.lang.Throwable -> L5c0 java.lang.Exception -> L5c5
            if (r0 != r10) goto L54d
            goto L65e
        L54d:
            r2 = r12
            r4 = r13
        L54f:
            if (r2 == 0) goto L56d
            r2.close()     // Catch: java.lang.Exception -> L555
            goto L56d
        L555:
            r0 = move-exception
            r1 = -466180329872942(0xfffe5802ef0961d2, double:NaN)
            java.lang.String r1 = "关闭输出流异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L56d:
            if (r14 == 0) goto L58b
            r14.close()     // Catch: java.lang.Exception -> L573
            goto L58b
        L573:
            r0 = move-exception
            r1 = -466214689611310(0xfffe57faef0961d2, double:NaN)
            java.lang.String r1 = "关闭输入流异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L58b:
            java.lang.Object r0 = r4.f6211     // Catch: java.lang.Exception -> L595
            ᛳᲇᛲᲁ r0 = (defpackage.C0569) r0     // Catch: java.lang.Exception -> L595
            if (r0 == 0) goto L5ad
            r0.close()     // Catch: java.lang.Exception -> L595
            goto L5ad
        L595:
            r0 = move-exception
            r1 = -466249049349678(0xfffe57f2ef0961d2, double:NaN)
            java.lang.String r1 = "关闭响应异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L5ad:
            ᛳᛷᲇᛸ r0 = defpackage.C2374.f10259     // Catch: java.lang.Exception -> L5b8
            if (r0 == 0) goto L6dd
            r3.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L5b8
            defpackage.C2374.f10259 = r23     // Catch: java.lang.Exception -> L5b8
            goto L6dd
        L5b8:
            r0 = move-exception
            r1 = -466279114120750(0xfffe57ebef0961d2, double:NaN)
            goto L327
        L5c0:
            r0 = move-exception
        L5c1:
            r1 = r0
            r6 = r12
            goto L6de
        L5c5:
            r0 = move-exception
        L5c6:
            r6 = r12
            goto L33f
        L5c9:
            r0 = move-exception
            r3 = r35
            r14 = r37
            r12 = r5
            goto L5c1
        L5d0:
            r0 = move-exception
            r3 = r35
            r14 = r37
            r12 = r5
            goto L5c6
        L5d7:
            r0 = move-exception
            r12 = r5
            r14 = r6
            goto L5c1
        L5db:
            r0 = move-exception
            r12 = r5
            r14 = r6
            goto L5c6
        L5df:
            r0 = move-exception
            r14 = r6
            r1 = r0
            goto L37b
        L5e4:
            r0 = move-exception
        L5e5:
            r1 = r0
            r6 = r23
            goto L204
        L5ea:
            r0 = move-exception
        L5eb:
            r1 = r15
            r6 = r23
        L5ee:
            r14 = r6
            goto L613
        L5f0:
            r0 = move-exception
            r23 = r6
            goto L203
        L5f5:
            r0 = move-exception
            r23 = r6
            r1 = r15
            goto L5ee
        L5fa:
            r0 = move-exception
            r23 = r6
            goto L5e5
        L5fe:
            r0 = move-exception
            r23 = r6
            goto L5eb
        L602:
            r23 = r6
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5e4 java.lang.Exception -> L5ea
            r1 = -464346378837550(0xfffe59adef0961d2, double:NaN)
            java.lang.String r1 = "请先登录抖音"     // Catch: java.lang.Throwable -> L5e4 java.lang.Exception -> L5ea
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5e4 java.lang.Exception -> L5ea
            throw r0     // Catch: java.lang.Throwable -> L5e4 java.lang.Exception -> L5ea
        L613:
            boolean r2 = defpackage.C2374.f10261     // Catch: java.lang.Throwable -> L668
            if (r2 != 0) goto L66b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L668
            r2.<init>()     // Catch: java.lang.Throwable -> L668
            r4 = -466343538630190(0xfffe57dcef0961d2, double:NaN)
            java.lang.String r4 = "下载异常: "     // Catch: java.lang.Throwable -> L668
            r2.append(r4)     // Catch: java.lang.Throwable -> L668
            r2.append(r7)     // Catch: java.lang.Throwable -> L668
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L668
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773     // Catch: java.lang.Throwable -> L668
            r4.getClass()     // Catch: java.lang.Throwable -> L668
            defpackage.C0346.m1038(r2, r0)     // Catch: java.lang.Throwable -> L668
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Throwable -> L668
            ᛷᲁᛷᛵ r2 = defpackage.AbstractC1497.f6594     // Catch: java.lang.Throwable -> L668
            ᲇᛶᲁᲇ r4 = new ᲇᛶᲁᲇ     // Catch: java.lang.Throwable -> L668
            r5 = 6
            r7 = r23
            r4.<init>(r3, r0, r7, r5)     // Catch: java.lang.Throwable -> L668
            r9.f3476 = r3     // Catch: java.lang.Throwable -> L668
            r9.f3477 = r7     // Catch: java.lang.Throwable -> L668
            r9.f3469 = r13     // Catch: java.lang.Throwable -> L668
            r9.f3472 = r14     // Catch: java.lang.Throwable -> L668
            r9.f3474 = r6     // Catch: java.lang.Throwable -> L668
            r9.f3470 = r1     // Catch: java.lang.Throwable -> L668
            r1 = 5
            r9.f3475 = r1     // Catch: java.lang.Throwable -> L668
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r2, r4, r9)     // Catch: java.lang.Throwable -> L668
            if (r0 != r10) goto L65f
        L65e:
            return r10
        L65f:
            r4 = r3
            r1 = r6
            r3 = r13
            r2 = r14
        L663:
            r6 = r1
            r14 = r2
            r13 = r3
            r3 = r4
            goto L66b
        L668:
            r0 = move-exception
            goto L62
        L66b:
            if (r6 == 0) goto L689
            r6.close()     // Catch: java.lang.Exception -> L671
            goto L689
        L671:
            r0 = move-exception
            r1 = -466373603401262(0xfffe57d5ef0961d2, double:NaN)
            java.lang.String r1 = "关闭输出流异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L689:
            if (r14 == 0) goto L6a7
            r14.close()     // Catch: java.lang.Exception -> L68f
            goto L6a7
        L68f:
            r0 = move-exception
            r1 = -466407963139630(0xfffe57cdef0961d2, double:NaN)
            java.lang.String r1 = "关闭输入流异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L6a7:
            java.lang.Object r0 = r13.f6211     // Catch: java.lang.Exception -> L6b1
            ᛳᲇᛲᲁ r0 = (defpackage.C0569) r0     // Catch: java.lang.Exception -> L6b1
            if (r0 == 0) goto L6c9
            r0.close()     // Catch: java.lang.Exception -> L6b1
            goto L6c9
        L6b1:
            r0 = move-exception
            r1 = -466442322877998(0xfffe57c5ef0961d2, double:NaN)
            java.lang.String r1 = "关闭响应异常"
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r0)
        L6c9:
            ᛳᛷᲇᛸ r0 = defpackage.C2374.f10259     // Catch: java.lang.Exception -> L6d5
            if (r0 == 0) goto L6dd
            r3.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L6d5
            r23 = 0
            defpackage.C2374.f10259 = r23     // Catch: java.lang.Exception -> L6d5
            goto L6dd
        L6d5:
            r0 = move-exception
            r1 = -466472387649070(0xfffe57beef0961d2, double:NaN)
            goto L327
        L6dd:
            return r8
        L6de:
            if (r6 == 0) goto L6fc
            r6.close()     // Catch: java.lang.Exception -> L6e4
            goto L6fc
        L6e4:
            r0 = move-exception
            r4 = -466536812158510(0xfffe57afef0961d2, double:NaN)
            java.lang.String r2 = "关闭输出流异常"
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773
            r4.getClass()
            defpackage.C0346.m1038(r2, r0)
        L6fc:
            if (r14 == 0) goto L71a
            r14.close()     // Catch: java.lang.Exception -> L702
            goto L71a
        L702:
            r0 = move-exception
            r4 = -466571171896878(0xfffe57a7ef0961d2, double:NaN)
            java.lang.String r2 = "关闭输入流异常"
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773
            r4.getClass()
            defpackage.C0346.m1038(r2, r0)
        L71a:
            java.lang.Object r0 = r13.f6211     // Catch: java.lang.Exception -> L724
            ᛳᲇᛲᲁ r0 = (defpackage.C0569) r0     // Catch: java.lang.Exception -> L724
            if (r0 == 0) goto L73c
            r0.close()     // Catch: java.lang.Exception -> L724
            goto L73c
        L724:
            r0 = move-exception
            r4 = -466605531635246(0xfffe579fef0961d2, double:NaN)
            java.lang.String r2 = "关闭响应异常"
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773
            r4.getClass()
            defpackage.C0346.m1038(r2, r0)
        L73c:
            ᛳᛷᲇᛸ r0 = defpackage.C2374.f10259     // Catch: java.lang.Exception -> L748
            if (r0 == 0) goto L760
            r3.unregisterReceiver(r0)     // Catch: java.lang.Exception -> L748
            r23 = 0
            defpackage.C2374.f10259 = r23     // Catch: java.lang.Exception -> L748
            goto L760
        L748:
            r0 = move-exception
            r2 = -466635596406318(0xfffe5798ef0961d2, double:NaN)
            java.lang.String r2 = "注销 receiver 异常"
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r0)
        L760:
            throw r1
    }
}
