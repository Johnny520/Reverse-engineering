package defpackage;

/* JADX INFO: renamed from: ᲀᛴᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1654 implements defpackage.InterfaceC1192, defpackage.InterfaceC0933, defpackage.InterfaceC1914, defpackage.InterfaceC1280, defpackage.InterfaceC2365, defpackage.InterfaceC1117, defpackage.InterfaceC0696, defpackage.InterfaceC1549, defpackage.InterfaceC1072, defpackage.InterfaceC1516 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C1654 f7356 = null;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final defpackage.C1654 f7357 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final defpackage.C1654 f7358 = null;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C1654 f7359 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static volatile defpackage.C0782 f7360;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1654 f7361 = null;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final defpackage.C1654 f7362 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1654 f7363 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final /* synthetic */ defpackage.C1654 f7364 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f7365;

    static {
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 0
            r0.<init>(r1)
            defpackage.C1654.f7361 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 2
            r0.<init>(r1)
            defpackage.C1654.f7363 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 3
            r0.<init>(r1)
            defpackage.C1654.f7364 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 4
            r0.<init>(r1)
            defpackage.C1654.f7356 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 6
            r0.<init>(r1)
            defpackage.C1654.f7359 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 7
            r0.<init>(r1)
            defpackage.C1654.f7362 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 8
            r0.<init>(r1)
            defpackage.C1654.f7357 = r0
            ᲀᛴᛱᛱ r0 = new ᲀᛴᛱᛱ
            r1 = 9
            r0.<init>(r1)
            defpackage.C1654.f7358 = r0
            return
    }

    public /* synthetic */ C1654(int r1) {
            r0 = this;
            r0.f7365 = r1
            r0.<init>()
            return
    }

    public C1654(defpackage.C2295 r1) {
            r0 = this;
            r1 = 25
            r0.f7365 = r1
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static java.io.ByteArrayInputStream m3038(java.lang.String r5) {
            java.lang.String r0 = "data:image"
            boolean r0 = r5.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L3b
            r0 = 44
            int r0 = r5.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L35
            r2 = 0
            java.lang.String r3 = r5.substring(r2, r0)
            java.lang.String r4 = ";base64"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L2f
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)
            byte[] r5 = android.util.Base64.decode(r5, r2)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r5)
            return r0
        L2f:
            java.lang.String r5 = "Not a base64 image data URL."
            defpackage.C2264.m3684(r5)
            return r1
        L35:
            java.lang.String r5 = "Missing comma in data URL."
            defpackage.C2264.m3684(r5)
            return r1
        L3b:
            java.lang.String r5 = "Not a valid image data URL."
            defpackage.C2264.m3684(r5)
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static java.io.File m3039(java.lang.String r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.Integer r4) {
            r0 = -393999109496366(0xfffe99a8ef0961d2, double:NaN)
            r0 = 0
            java.lang.String r2 = m3043(r2, r3, r0, r4)
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.io.File r2 = r3.getParentFile()
            if (r2 == 0) goto L36
            boolean r4 = r2.exists()
            if (r4 != 0) goto L36
            boolean r4 = r2.mkdirs()
            if (r4 == 0) goto L25
            goto L36
        L25:
            r3 = -394059239038510(0xfffe999aef0961d2, double:NaN)
            java.lang.String r3 = "创建目录失败: "
            java.lang.String r2 = r2.getAbsolutePath()
            defpackage.C0086.m556(r2, r3)
            return r0
        L36:
            return r3
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static java.lang.String m3040(java.lang.String r10) {
            java.lang.CharSequence r10 = defpackage.AbstractC1347.m2521(r10)
            java.lang.String r10 = r10.toString()
            r0 = 92
            r1 = 47
            java.lang.String r10 = r10.replace(r0, r1)
            r0 = -395330549358126(0xfffe9872ef0961d2, double:NaN)
            java.lang.String r0 = "/"
            boolean r0 = r10.startsWith(r0)
            r1 = -395339139292718(0xfffe9870ef0961d2, double:NaN)
            java.lang.String r1 = "/"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            java.util.List r10 = defpackage.AbstractC1347.m2519(r10, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r10.iterator()
            r3 = 0
            r4 = r3
        L3a:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto Le4
            java.lang.Object r5 = r2.next()
            int r7 = r4 + 1
            if (r4 < 0) goto Le0
            java.lang.String r5 = (java.lang.String) r5
            boolean r8 = defpackage.AbstractC1347.m2524(r5)
            if (r8 == 0) goto L71
            int r8 = defpackage.AbstractC0425.m1184(r10)
            if (r4 != r8) goto L71
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = -395347729227310(0xfffe986eef0961d2, double:NaN)
            java.lang.String r5 = "file_"
            r4.<init>(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r6 = r4.toString()
            goto Ld8
        L71:
            boolean r4 = defpackage.AbstractC1347.m2524(r5)
            if (r4 == 0) goto L78
            goto Ld8
        L78:
            r8 = -395485168180782(0xfffe984eef0961d2, double:NaN)
            java.lang.String r4 = "[/\\\\:*?\"<>|]"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r8 = -395541002755630(0xfffe9841ef0961d2, double:NaN)
            java.lang.String r8 = "_"
            java.util.regex.Matcher r4 = r4.matcher(r5)
            java.lang.String r4 = r4.replaceAll(r8)
            java.lang.CharSequence r4 = defpackage.AbstractC1347.m2521(r4)
            java.lang.String r4 = r4.toString()
            boolean r5 = defpackage.AbstractC1347.m2524(r4)
            if (r5 == 0) goto Lbd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r8 = -395549592690222(0xfffe983fef0961d2, double:NaN)
            java.lang.String r5 = "file_"
            r4.<init>(r5)
            long r8 = java.lang.System.currentTimeMillis()
            r4.append(r8)
            java.lang.String r4 = r4.toString()
        Lbd:
            int r5 = r4.length()
            r8 = 200(0xc8, float:2.8E-43)
            if (r5 <= r8) goto Ld1
            java.lang.String r4 = r4.substring(r3, r8)
            r8 = -395575362493998(0xfffe9839ef0961d2, double:NaN)
        Ld1:
            boolean r5 = defpackage.AbstractC1347.m2524(r4)
            if (r5 != 0) goto Ld8
            r6 = r4
        Ld8:
            if (r6 == 0) goto Ldd
            r1.add(r6)
        Ldd:
            r4 = r7
            goto L3a
        Le0:
            defpackage.AbstractC0425.m1196()
            throw r6
        Le4:
            boolean r10 = r1.isEmpty()
            if (r10 == 0) goto Lfc
            r0 = -395373499031086(0xfffe9868ef0961d2, double:NaN)
            java.lang.String r10 = "/sdcard/Download/{uuid}"
            java.lang.String r10 = m3041(r10, r6, r6)
            java.lang.String r10 = m3040(r10)
            return r10
        Lfc:
            r2 = -395476578246190(0xfffe9850ef0961d2, double:NaN)
            java.lang.String r2 = "/"
            r5 = 0
            r6 = 62
            r3 = 0
            r4 = 0
            java.lang.String r10 = defpackage.AbstractC1107.m2125(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L116
            java.lang.String r0 = "/"
            java.lang.String r10 = r0.concat(r10)
        L116:
            return r10
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static java.lang.String m3041(java.lang.String r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, com.ss.android.ugc.aweme.comment.model.Comment r15) {
            r0 = -394544570342958(0xfffe9929ef0961d2, double:NaN)
            java.lang.String r0 = "{aid}"
            r1 = 0
            if (r14 == 0) goto L10
            java.lang.String r2 = r14.aid
            if (r2 != 0) goto L21
        L10:
            if (r15 == 0) goto L15
            java.lang.String r2 = r15.awemeId
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 != 0) goto L21
            r2 = -394570340146734(0xfffe9923ef0961d2, double:NaN)
            java.lang.String r2 = ""
        L21:
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r0, r2)
            r2 = -394574635114030(0xfffe9922ef0961d2, double:NaN)
            java.lang.String r0 = "{cid}"
            if (r15 == 0) goto L34
            java.lang.String r2 = r15.cid
            if (r2 != 0) goto L3d
        L34:
            r2 = -394600404917806(0xfffe991cef0961d2, double:NaN)
            java.lang.String r2 = ""
        L3d:
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r0, r2)
            r2 = 0
            if (r15 == 0) goto L48
            long r4 = r15.createTime
            goto L4e
        L48:
            if (r14 == 0) goto L4d
            long r4 = r14.createTime
            goto L4e
        L4d:
            r4 = r2
        L4e:
            r6 = -394604699885102(0xfffe991bef0961d2, double:NaN)
            java.lang.String r0 = "{createTime}"
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r3 = 78
            r6 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            r8 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            if (r2 > 0) goto L73
            r10 = -394974067072558(0xfffe98c5ef0961d2, double:NaN)
            java.lang.String r2 = ""     // Catch: java.lang.Exception -> L71
            goto Ld5
        L71:
            r2 = move-exception
            goto La9
        L73:
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Exception -> L71
            r10 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r4
            r2.<init>(r10)     // Catch: java.lang.Exception -> L71
            ᛶᲀᛵ r10 = defpackage.C1141.f5173     // Catch: java.lang.Exception -> L71
            r10.getClass()     // Catch: java.lang.Exception -> L71
            ᲀᲇᛸᛶ r10 = defpackage.C1141.f5193     // Catch: java.lang.Exception -> L71
            ᲁᛷᛶᛶ[] r11 = defpackage.C1141.f5221     // Catch: java.lang.Exception -> L71
            r11 = r11[r3]     // Catch: java.lang.Exception -> L71
            java.lang.Object r10 = r10.m3169(r11)     // Catch: java.lang.Exception -> L71
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L71
            boolean r11 = defpackage.AbstractC1347.m2524(r10)     // Catch: java.lang.Exception -> L71
            if (r11 == 0) goto L9b
            r10 = -394978362039854(0xfffe98c4ef0961d2, double:NaN)
            java.lang.String r10 = "yyyy-MM-dd_HH-mm-ss"     // Catch: java.lang.Exception -> L71
        L9b:
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L71
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L71
            r12.<init>(r10, r11)     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = r12.format(r2)     // Catch: java.lang.Exception -> L71
            goto Ld5
        La9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = -395064261385774(0xfffe98b0ef0961d2, double:NaN)
            java.lang.String r11 = "格式化时间戳失败: "
            r10.<init>(r11)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            ᛲᲀᛱᲁ r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1038(r4, r2)
            r4 = -395111506026030(0xfffe98a5ef0961d2, double:NaN)
            java.lang.String r2 = ""
        Ld5:
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r0, r2)
            r4 = -394660534459950(0xfffe990eef0961d2, double:NaN)
            java.lang.String r0 = "{currentTime}"
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Exception -> L108
            r2.<init>()     // Catch: java.lang.Exception -> L108
            ᛶᲀᛵ r4 = defpackage.C1141.f5173     // Catch: java.lang.Exception -> L108
            r4.getClass()     // Catch: java.lang.Exception -> L108
            ᲀᲇᛸᛶ r4 = defpackage.C1141.f5193     // Catch: java.lang.Exception -> L108
            ᲁᛷᛶᛶ[] r5 = defpackage.C1141.f5221     // Catch: java.lang.Exception -> L108
            r3 = r5[r3]     // Catch: java.lang.Exception -> L108
            java.lang.Object r3 = r4.m3169(r3)     // Catch: java.lang.Exception -> L108
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L108
            boolean r4 = defpackage.AbstractC1347.m2524(r3)     // Catch: java.lang.Exception -> L108
            if (r4 == 0) goto L10a
            r3 = -395115800993326(0xfffe98a4ef0961d2, double:NaN)
            java.lang.String r3 = "yyyy-MM-dd_HH-mm-ss"     // Catch: java.lang.Exception -> L108
            goto L10a
        L108:
            r2 = move-exception
            goto L118
        L10a:
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Exception -> L108
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L108
            r5.<init>(r3, r4)     // Catch: java.lang.Exception -> L108
            java.lang.String r2 = r5.format(r2)     // Catch: java.lang.Exception -> L108
            goto L14a
        L118:
            r3 = -395201700339246(0xfffe9890ef0961d2, double:NaN)
            java.lang.String r3 = "格式化当前时间失败"
            ᛲᲀᛱᲁ r4 = defpackage.C0346.f1773
            r4.getClass()
            defpackage.C0346.m1038(r3, r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r3 = -395244650012206(0xfffe9886ef0961d2, double:NaN)
            java.lang.String r3 = "yyyy-MM-dd_HH-mm-ss"
            java.util.Locale r4 = java.util.Locale.getDefault()
            r2.<init>(r3, r4)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = r2.format(r3)
        L14a:
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r0, r2)
            if (r14 == 0) goto L157
            int r0 = r14.awemeType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L160
        L157:
            r2 = -394720664002094(0xfffe9900ef0961d2, double:NaN)
            java.lang.String r0 = ""
        L160:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2 = -394724958969390(0xfffe98ffef0961d2, double:NaN)
            java.lang.String r2 = "{awemeType}"
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r2, r0)
            if (r15 == 0) goto L17a
            com.ss.android.ugc.aweme.profile.model.User r0 = r15.user
            if (r0 == 0) goto L17a
            java.lang.String r0 = r0.uid
            goto L17b
        L17a:
            r0 = r1
        L17b:
            if (r0 == 0) goto L182
            com.ss.android.ugc.aweme.profile.model.User r0 = r15.user
            java.lang.String r0 = r0.uid
            goto L19c
        L182:
            if (r14 == 0) goto L18b
            com.ss.android.ugc.aweme.profile.model.User r0 = r14.author
            if (r0 == 0) goto L18b
            java.lang.String r0 = r0.uid
            goto L18c
        L18b:
            r0 = r1
        L18c:
            if (r0 == 0) goto L193
            com.ss.android.ugc.aweme.profile.model.User r0 = r14.author
            java.lang.String r0 = r0.uid
            goto L19c
        L193:
            r2 = -394776498576942(0xfffe98f3ef0961d2, double:NaN)
            java.lang.String r0 = ""
        L19c:
            r2 = -394780793544238(0xfffe98f2ef0961d2, double:NaN)
            java.lang.String r2 = "{uid}"
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r2, r0)
            if (r15 == 0) goto L1b2
            com.ss.android.ugc.aweme.profile.model.User r0 = r15.user
            if (r0 == 0) goto L1b2
            java.lang.String r0 = r0.uniqueId
            goto L1b3
        L1b2:
            r0 = r1
        L1b3:
            if (r0 == 0) goto L1ba
            com.ss.android.ugc.aweme.profile.model.User r0 = r15.user
            java.lang.String r0 = r0.uniqueId
            goto L1d4
        L1ba:
            if (r14 == 0) goto L1c3
            com.ss.android.ugc.aweme.profile.model.User r0 = r14.author
            if (r0 == 0) goto L1c3
            java.lang.String r0 = r0.uniqueId
            goto L1c4
        L1c3:
            r0 = r1
        L1c4:
            if (r0 == 0) goto L1cb
            com.ss.android.ugc.aweme.profile.model.User r0 = r14.author
            java.lang.String r0 = r0.uniqueId
            goto L1d4
        L1cb:
            r2 = -394806563348014(0xfffe98ecef0961d2, double:NaN)
            java.lang.String r0 = ""
        L1d4:
            r2 = -394810858315310(0xfffe98ebef0961d2, double:NaN)
            java.lang.String r2 = "{uniqueId}"
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r2, r0)
            if (r15 == 0) goto L1ea
            com.ss.android.ugc.aweme.profile.model.User r0 = r15.user
            if (r0 == 0) goto L1ea
            java.lang.String r0 = r0.nickname
            goto L1eb
        L1ea:
            r0 = r1
        L1eb:
            if (r0 == 0) goto L1f2
            com.ss.android.ugc.aweme.profile.model.User r15 = r15.user
            java.lang.String r15 = r15.nickname
            goto L20a
        L1f2:
            if (r14 == 0) goto L1fa
            com.ss.android.ugc.aweme.profile.model.User r15 = r14.author
            if (r15 == 0) goto L1fa
            java.lang.String r1 = r15.nickname
        L1fa:
            if (r1 == 0) goto L201
            com.ss.android.ugc.aweme.profile.model.User r15 = r14.author
            java.lang.String r15 = r15.nickname
            goto L20a
        L201:
            r0 = -394858102955566(0xfffe98e0ef0961d2, double:NaN)
            java.lang.String r15 = ""
        L20a:
            r0 = -394862397922862(0xfffe98dfef0961d2, double:NaN)
            java.lang.String r0 = "{nickname}"
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r0, r15)
            r0 = -394909642563118(0xfffe98d4ef0961d2, double:NaN)
            java.lang.String r15 = "{desc}"
            if (r14 == 0) goto L226
            java.lang.String r14 = r14.desc
            if (r14 != 0) goto L22f
        L226:
            r0 = -394939707334190(0xfffe98cdef0961d2, double:NaN)
            java.lang.String r14 = ""
        L22f:
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r15, r14)
            r14 = -394944002301486(0xfffe98ccef0961d2, double:NaN)
            java.lang.String r14 = "{uuid}"
            java.util.UUID r15 = java.util.UUID.randomUUID()
            java.lang.String r15 = r15.toString()
            r0 = -393792951066158(0xfffe99d8ef0961d2, double:NaN)
            r0 = -393853080608302(0xfffe99caef0961d2, double:NaN)
            java.lang.String r0 = "-"
            r1 = -393861670542894(0xfffe99c8ef0961d2, double:NaN)
            java.lang.String r1 = ""
            java.lang.String r15 = defpackage.AbstractC0651.m1485(r15, r0, r1)
            java.lang.String r13 = defpackage.AbstractC0651.m1485(r13, r14, r15)
            return r13
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static void m3042(defpackage.EnumC0777 r4) {
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            if (r0 != 0) goto L7
            return
        L7:
            ᛴᲇᛲᲇ r1 = defpackage.EnumC0777.f3630
            if (r4 != r1) goto Lf
            r4 = 14285801(0xd9fbe9, float:2.0018671E-38)
            goto L12
        Lf:
            r4 = 14285802(0xd9fbea, float:2.0018672E-38)
        L12:
            android.content.Intent r1 = new android.content.Intent
            r2 = -102710132514350(0xffffa295ef0961d2, double:NaN)
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r1.<init>(r2)
            r2 = -102864751337006(0xffffa271ef0961d2, double:NaN)
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r1.addCategory(r2)
            r2 = -103006485257774(0xffffa250ef0961d2, double:NaN)
            java.lang.String r2 = "*/*"
            r1.setType(r2)
            r0.startActivityForResult(r1, r4)     // Catch: java.lang.Exception -> L3c
            return
        L3c:
            r4 = move-exception
            r0 = -103023665126958(0xffffa24cef0961d2, double:NaN)
            java.lang.String r0 = "无法打开文件管理器"
            defpackage.AbstractC0209.m764(r0)
            r0 = -103066614799918(0xffffa242ef0961d2, double:NaN)
            java.lang.String r0 = "打开聊天气泡文件选择器失败"
            r1 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r1 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r1 = defpackage.C0346.f1773
            r1.getClass()
            defpackage.C0346.m1038(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static java.lang.String m3043(java.lang.String r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, com.ss.android.ugc.aweme.comment.model.Comment r9, java.lang.Integer r10) {
            r0 = -393865965510190(0xfffe99c7ef0961d2, double:NaN)
            java.lang.String r0 = m3045()
            java.lang.String r8 = m3041(r0, r8, r9)
            java.lang.String r8 = m3040(r8)
            r9 = 46
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L91
            r2 = 47
            r3 = 6
            int r2 = defpackage.AbstractC1347.m2518(r8, r2, r1, r3)
            if (r2 < 0) goto L32
            int r4 = r2 + 1
            java.lang.String r4 = r8.substring(r1, r4)
            r5 = -394239627664942(0xfffe9970ef0961d2, double:NaN)
            goto L3b
        L32:
            r4 = -394304052174382(0xfffe9961ef0961d2, double:NaN)
            java.lang.String r4 = ""
        L3b:
            if (r2 < 0) goto L4a
            int r2 = r2 + r0
            java.lang.String r8 = r8.substring(r2)
            r5 = -394308347141678(0xfffe9960ef0961d2, double:NaN)
        L4a:
            int r2 = defpackage.AbstractC1347.m2518(r8, r9, r1, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r2 <= 0) goto L55
            goto L56
        L55:
            r3 = 0
        L56:
            if (r3 == 0) goto L85
            int r2 = r3.intValue()
            java.lang.String r2 = r8.substring(r1, r2)
            r5 = -394372771651118(0xfffe9951ef0961d2, double:NaN)
            int r3 = r3.intValue()
            java.lang.String r8 = r8.substring(r3)
            r5 = -394437196160558(0xfffe9942ef0961d2, double:NaN)
            int r10 = r10.intValue()
            java.lang.String r10 = m3048(r10, r2)
            java.lang.String r8 = r10.concat(r8)
            goto L8d
        L85:
            int r10 = r10.intValue()
            java.lang.String r8 = m3048(r10, r8)
        L8d:
            java.lang.String r8 = r4.concat(r8)
        L91:
            java.lang.CharSequence r7 = defpackage.AbstractC1347.m2521(r7)
            java.lang.String r7 = r7.toString()
            char[] r10 = new char[r0]
            r10[r1] = r9
            java.lang.String r7 = defpackage.AbstractC1347.m2522(r7, r10)
            boolean r10 = defpackage.AbstractC1347.m2524(r7)
            if (r10 == 0) goto La8
            goto Lc8
        La8:
            java.lang.String r10 = defpackage.AbstractC1347.m2507(r8)
            java.lang.String r1 = "."
            java.lang.String r1 = r1.concat(r7)
            boolean r10 = defpackage.AbstractC0651.m1483(r10, r1, r0)
            if (r10 == 0) goto Lb9
            goto Lc8
        Lb9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r8)
            r10.append(r9)
            r10.append(r7)
            java.lang.String r8 = r10.toString()
        Lc8:
            r9 = -393926095052334(0xfffe99b9ef0961d2, double:NaN)
            r9 = -514722050252334(0xfffe2bdcef0961d2, double:NaN)
            return r8
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static void m3044(android.content.Context r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, defpackage.InterfaceC0598 r28) {
            r2 = r23
            r0 = -87196710641198(0xffffb0b1ef0961d2, double:NaN)
            r0 = -87231070379566(0xffffb0a9ef0961d2, double:NaN)
            r0 = -87261135150638(0xffffb0a2ef0961d2, double:NaN)
            r0 = -87299789856302(0xffffb099ef0961d2, double:NaN)
            r0 = -87316969725486(0xffffb095ef0961d2, double:NaN)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            r1.<init>(r2)
            r3 = 1712062522(0x660c003a, float:1.6528387E23)
            r6 = 0
            android.view.View r0 = r0.inflate(r3, r1, r6)
            r1 = 1711866048(0x660900c0, float:1.6174451E23)
            android.view.View r3 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.Button r3 = (android.widget.Button) r3
            if (r3 == 0) goto L1ac
            r1 = 1711866052(0x660900c4, float:1.6174458E23)
            android.view.View r4 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto L1ac
            r1 = 1711866352(0x660901f0, float:1.6174999E23)
            android.view.View r5 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L1ac
            r1 = 1711866442(0x6609024a, float:1.617516E23)
            android.view.View r7 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L1ac
            r1 = 1711866994(0x66090472, float:1.6176155E23)
            android.view.View r8 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L1ac
            r1 = 1711867026(0x66090492, float:1.6176213E23)
            android.view.View r9 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L1ac
            r1 = 1711867038(0x6609049e, float:1.6176235E23)
            android.view.View r10 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L1ac
            r1 = 1711867043(0x660904a3, float:1.6176244E23)
            android.view.View r11 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L1ac
            r1 = 1711867050(0x660904aa, float:1.6176256E23)
            android.view.View r12 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L1ac
            r1 = 1711867051(0x660904ab, float:1.6176258E23)
            android.view.View r13 = defpackage.AbstractC1193.m2331(r0, r1)
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L1ac
            ᛳᲀᲁᲈ r1 = new ᛳᲀᲁᲈ
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.<init>()
            r1.f2713 = r3
            r1.f2712 = r4
            r1.f2711 = r5
            r1.f2714 = r7
            r1.f2715 = r11
            r3 = -87338444561966(0xffffb090ef0961d2, double:NaN)
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r4 = 1712259275(0x660f00cb, float:1.6882826E23)
            r3.<init>(r2, r4)
            android.app.AlertDialog$Builder r0 = r3.setView(r0)
            android.app.AlertDialog r11 = r0.create()
            r0 = 1
            r11.setCancelable(r0)
            android.view.Window r0 = r11.getWindow()
            if (r0 == 0) goto Le2
            r3 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r3)
        Le2:
            r14 = r25
            r10.setText(r14)
            r3 = -87394279136814(0xffffb083ef0961d2, double:NaN)
            java.lang.String r0 = "UID: "
            r10 = r26
            java.lang.String r0 = r0.concat(r10)
            r13.setText(r0)
            r13 = r27
            r12.setText(r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r3 = 22825(0x5929, float:3.1985E-41)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r8.setText(r0)
            r3 = -87420048940590(0xffffb07def0961d2, double:NaN)
            java.lang.String r0 = "从未"
            r9.setText(r0)
            ᲈᛲᛵᲀ r0 = com.bumptech.glide.ComponentCallbacks2C0007.m234(r2)     // Catch: java.lang.Exception -> L146
            r15 = r24
            ᲀᛷᛴᲀ r0 = r0.m3586(r15)     // Catch: java.lang.Exception -> L148
            ᲇᛴᛸᲇ r0 = r0.m3446()     // Catch: java.lang.Exception -> L148
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L148
            ᲇᛴᛸᲇ r0 = r0.m3433()     // Catch: java.lang.Exception -> L148
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L148
            ᛸᛶᛵᛲ r3 = defpackage.C1506.f6658     // Catch: java.lang.Exception -> L148
            ᲇᛴᛸᲇ r0 = r0.m3439(r3)     // Catch: java.lang.Exception -> L148
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L148
            ᲇᛴᛸᲇ r0 = r0.m3447()     // Catch: java.lang.Exception -> L148
            ᲀᛷᛴᲀ r0 = (defpackage.C1706) r0     // Catch: java.lang.Exception -> L148
            r0.m3097(r7)     // Catch: java.lang.Exception -> L148
            goto L152
        L146:
            r15 = r24
        L148:
            java.lang.Object r0 = r1.f2714
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3 = 1711800614(0x66080126, float:1.6056576E23)
            r0.setImageResource(r3)
        L152:
            java.util.List r0 = defpackage.AbstractC2311.m3756()
            ᛸᛱᛴᲁ r3 = new ᛸᛱᛴᲁ
            r3.<init>()
            java.lang.Object r4 = defpackage.AbstractC1107.m2124(r0)
            ᛲᛳᲈᛴ r4 = (defpackage.C0273) r4
            if (r4 != 0) goto L165
            ᛲᛳᲈᛴ r4 = defpackage.C0273.f1533
        L165:
            r3.f6211 = r4
            java.lang.Object r5 = r1.f2715
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r4 = r4.m900()
            r5.setText(r4)
            java.lang.Object r4 = r1.f2711
            r7 = r4
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r4 = r1
            r1 = r0
            ᲀᲇᛶ r0 = new ᲀᲇᛶ
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setOnClickListener(r0)
            java.lang.Object r0 = r4.f2713
            android.widget.Button r0 = (android.widget.Button) r0
            ᲈᛳᛳ r1 = new ᲈᛳᛳ
            r1.<init>(r11, r6)
            r0.setOnClickListener(r1)
            java.lang.Object r0 = r4.f2712
            android.widget.Button r0 = (android.widget.Button) r0
            ᛴᛲᛷᲁ r14 = new ᛴᛲᛷᲁ
            r22 = 0
            r16 = r25
            r21 = r28
            r19 = r3
            r17 = r10
            r20 = r11
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r0.setOnClickListener(r14)
            r20.show()
            return
        L1ac:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            r1 = -1162579212148270(0xfffbdea3ef0961d2, double:NaN)
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r0 = r1.concat(r0)
            defpackage.C2264.m3673(r0)
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static java.lang.String m3045() {
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5123
            ᲁᛷᛶᛶ[] r1 = defpackage.C1141.f5221
            r2 = 75
            r1 = r1[r2]
            java.lang.Object r0 = r0.m3169(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = defpackage.AbstractC1347.m2524(r0)
            if (r1 != 0) goto L4f
            java.lang.CharSequence r0 = defpackage.AbstractC1347.m2521(r0)
            java.lang.String r0 = r0.toString()
            r1 = 92
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = -394200972959278(0xfffe9979ef0961d2, double:NaN)
            java.lang.String r1 = "/"
            r2 = 0
            boolean r1 = defpackage.AbstractC0651.m1483(r0, r1, r2)
            if (r1 == 0) goto L4e
            r1 = -394209562893870(0xfffe9977ef0961d2, double:NaN)
            java.lang.String r1 = "{uuid}"
            java.lang.String r0 = r0.concat(r1)
        L4e:
            return r0
        L4f:
            r0 = -394097893744174(0xfffe9991ef0961d2, double:NaN)
            java.lang.String r0 = "/sdcard/Download/{uuid}"
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static defpackage.C1918 m3046(java.lang.String r2) {
            ᲁᲀᲇᲀ r0 = new ᲁᲀᲇᲀ
            r0.<init>(r2)
            java.util.LinkedHashMap r1 = defpackage.C1918.f8345
            r1.put(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m3047(java.lang.String r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, com.ss.android.ugc.aweme.comment.model.Comment r4, int r5) {
            r0 = r5 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            java.lang.String r2 = m3043(r2, r3, r4, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.lang.String m3048(int r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = defpackage.AbstractC1347.m2524(r4)
            if (r1 == 0) goto L24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r1 = -394501620669998(0xfffe9933ef0961d2, double:NaN)
            java.lang.String r1 = "file_"
            r4.<init>(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r4.append(r1)
            java.lang.String r4 = r4.toString()
        L24:
            r0.append(r4)
            r1 = -394527390473774(0xfffe992def0961d2, double:NaN)
            java.lang.String r4 = "_"
            boolean r4 = defpackage.AbstractC1347.m2525(r0, r4)
            if (r4 != 0) goto L42
            r1 = -394535980408366(0xfffe992bef0961d2, double:NaN)
            java.lang.String r4 = "_"
            r0.append(r4)
        L42:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public synchronized defpackage.C1918 m3049(java.lang.String r6) {
            r5 = this;
            monitor-enter(r5)
            java.util.LinkedHashMap r0 = defpackage.C1918.f8345     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L3d
            ᲁᲀᲇᲀ r1 = (defpackage.C1918) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L42
            java.lang.String r1 = "SSL_"
            java.lang.String r2 = "TLS_"
            boolean r3 = r6.startsWith(r2)     // Catch: java.lang.Throwable -> L3d
            r4 = 4
            if (r3 == 0) goto L1f
            java.lang.String r2 = r6.substring(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L3d
            goto L2f
        L1f:
            boolean r1 = r6.startsWith(r1)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L2e
            java.lang.String r1 = r6.substring(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L3d
            goto L2f
        L2e:
            r1 = r6
        L2f:
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L3d
            ᲁᲀᲇᲀ r1 = (defpackage.C1918) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3f
            ᲁᲀᲇᲀ r1 = new ᲁᲀᲇᲀ     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r6 = move-exception
            goto L44
        L3f:
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L3d
        L42:
            monitor-exit(r5)
            return r1
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            throw r6
    }

    @Override // defpackage.InterfaceC0933
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public defpackage.InterfaceC1901 mo1886(defpackage.InterfaceC1901 r4, defpackage.C0533 r5) {
            r3 = this;
            int r3 = r3.f7365
            switch(r3) {
                case 8: goto L66;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r4.get()
            ᛶᛴᲁᛱ r3 = (defpackage.C1064) r3
            ᛲᛱᲀᲈ r3 = r3.f4720
            ᛲᲀᲁᛲ r3 = r3.f1435
            ᛱᛷᛴᛷ r3 = r3.f1826
            java.nio.ByteBuffer r3 = r3.f1047
            java.nio.ByteBuffer r3 = r3.asReadOnlyBuffer()
            ᛵᛲᲁᲇ r4 = new ᛵᛲᲁᲇ
            java.util.concurrent.atomic.AtomicReference r5 = defpackage.AbstractC0036.f535
            boolean r5 = r3.isReadOnly()
            if (r5 != 0) goto L39
            boolean r5 = r3.hasArray()
            if (r5 == 0) goto L39
            ᲈᲁ r5 = new ᲈᲁ
            byte[] r0 = r3.array()
            int r1 = r3.arrayOffset()
            int r2 = r3.limit()
            r5.<init>(r0, r1, r2)
            goto L3a
        L39:
            r5 = 0
        L3a:
            if (r5 == 0) goto L4e
            int r0 = r5.f10046
            if (r0 != 0) goto L4e
            int r0 = r5.f10044
            java.lang.Object r5 = r5.f10043
            byte[] r5 = (byte[]) r5
            int r5 = r5.length
            if (r0 != r5) goto L4e
            byte[] r3 = r3.array()
            goto L63
        L4e:
            java.nio.ByteBuffer r3 = r3.asReadOnlyBuffer()
            int r5 = r3.limit()
            byte[] r5 = new byte[r5]
            r0 = 0
            java.nio.Buffer r0 = r3.position(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r3.get(r5)
            r3 = r5
        L63:
            r4.<init>(r3)
        L66:
            return r4
    }

    @Override // defpackage.InterfaceC1072
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public void mo2041(java.lang.String r5, java.lang.StringBuilder r6) {
            r4 = this;
            int r4 = r5.length()     // Catch: java.io.IOException -> L98
            r0 = 0
        L5:
            if (r0 >= r4) goto L97
            char r1 = r5.charAt(r0)     // Catch: java.io.IOException -> L98
            r2 = 12
            if (r1 == r2) goto L8e
            r2 = 13
            if (r1 == r2) goto L88
            r2 = 34
            if (r1 == r2) goto L82
            r2 = 92
            if (r1 == r2) goto L7c
            switch(r1) {
                case 8: goto L76;
                case 9: goto L70;
                case 10: goto L6a;
                default: goto L1e;
            }     // Catch: java.io.IOException -> L98
        L1e:
            if (r1 < 0) goto L24
            r2 = 31
            if (r1 <= r2) goto L34
        L24:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 < r2) goto L2c
            r2 = 159(0x9f, float:2.23E-43)
            if (r1 <= r2) goto L34
        L2c:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r1 < r2) goto L66
            r2 = 8447(0x20ff, float:1.1837E-41)
            if (r1 > r2) goto L66
        L34:
            java.lang.String r2 = "\\u"
            r6.append(r2)     // Catch: java.io.IOException -> L98
            java.lang.String r2 = "0123456789ABCDEF"
            int r3 = r1 >> 12
            r3 = r3 & 15
            char r3 = r2.charAt(r3)     // Catch: java.io.IOException -> L98
            r6.append(r3)     // Catch: java.io.IOException -> L98
            int r3 = r1 >> 8
            r3 = r3 & 15
            char r3 = r2.charAt(r3)     // Catch: java.io.IOException -> L98
            r6.append(r3)     // Catch: java.io.IOException -> L98
            int r3 = r1 >> 4
            r3 = r3 & 15
            char r3 = r2.charAt(r3)     // Catch: java.io.IOException -> L98
            r6.append(r3)     // Catch: java.io.IOException -> L98
            r1 = r1 & 15
            char r1 = r2.charAt(r1)     // Catch: java.io.IOException -> L98
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L66:
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L6a:
            java.lang.String r1 = "\\n"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L70:
            java.lang.String r1 = "\\t"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L76:
            java.lang.String r1 = "\\b"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L7c:
            java.lang.String r1 = "\\\\"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L82:
            java.lang.String r1 = "\\\""
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L88:
            java.lang.String r1 = "\\r"
            r6.append(r1)     // Catch: java.io.IOException -> L98
            goto L93
        L8e:
            java.lang.String r1 = "\\f"
            r6.append(r1)     // Catch: java.io.IOException -> L98
        L93:
            int r0 = r0 + 1
            goto L5
        L97:
            return
        L98:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Impossible Exception"
            r4.<init>(r5)
            throw r4
    }

    @Override // defpackage.InterfaceC2365
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public defpackage.C0478 mo1549(defpackage.C2058 r1, defpackage.C0569 r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.InterfaceC1516
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public boolean mo2570(java.lang.String r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC1549
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public void mo2713(java.lang.Object r1) {
            r0 = this;
            java.util.List r1 = (java.util.List) r1
            r1.clear()
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public java.lang.Object m3050(android.content.Context r22, com.ss.android.ugc.aweme.comment.model.Comment r23, android.app.Dialog r24, defpackage.AbstractC1016 r25) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            int r5 = r0.f7365
            r6 = 0
            ᛴᛵ r7 = defpackage.EnumC0670.f3246
            r8 = 1
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            ᲁᲀᛱᲁ r10 = defpackage.C1907.f8270
            r11 = 2
            r12 = 0
            switch(r5) {
                case 2: goto L1b0;
                default: goto L19;
            }
        L19:
            boolean r5 = r4 instanceof defpackage.C0874
            if (r5 == 0) goto L2a
            r5 = r4
            ᛵᛴᛸᛳ r5 = (defpackage.C0874) r5
            int r13 = r5.f3948
            r14 = r13 & r9
            if (r14 == 0) goto L2a
            int r13 = r13 - r9
            r5.f3948 = r13
            goto L2f
        L2a:
            ᛵᛴᛸᛳ r5 = new ᛵᛴᛸᛳ
            r5.<init>(r0, r4)
        L2f:
            java.lang.Object r0 = r5.f3946
            int r4 = r5.f3948
            r9 = 3
            if (r4 == 0) goto L5e
            if (r4 == r8) goto L51
            if (r4 == r11) goto L3c
            if (r4 != r9) goto L42
        L3c:
            defpackage.AbstractC0762.m1680(r0)
        L3f:
            r7 = r10
            goto L1af
        L42:
            r0 = -97298473721390(0xffffa781ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            r7 = r12
            goto L1af
        L51:
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r5.f3950
            android.content.Context r2 = r5.f3949
            defpackage.AbstractC0762.m1680(r0)
            r20 = r2
            r2 = r1
            r1 = r20
            goto L80
        L5e:
            defpackage.AbstractC0762.m1680(r0)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1051(r1)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᲁᛲᛶᛵ r4 = new ᲁᛲᛶᛵ
            r4.<init>(r3, r12, r9)
            r5.f3949 = r1
            r5.f3950 = r2
            r5.f3948 = r8
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r4, r5)
            if (r0 != r7) goto L80
            goto L1af
        L80:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> Lff
            r13 = -97083725356590(0xffffa7b3ef0961d2, double:NaN)
            java.lang.String r4 = "decoratedEmojiInfo"     // Catch: java.lang.Exception -> Lff
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Exception -> Lff
            r3.setAccessible(r8)     // Catch: java.lang.Exception -> Lff
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Exception -> Lff
            boolean r3 = r2 instanceof java.util.List     // Catch: java.lang.Exception -> Lff
            if (r3 == 0) goto La4
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> Lff
            goto La5
        La4:
            r2 = r12
        La5:
            if (r2 == 0) goto Lff
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lff
        Lab:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Lff
            if (r3 == 0) goto Lff
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Lff
            if (r3 == 0) goto Lab
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Exception -> Lab
            r13 = -97165329735214(0xffffa7a0ef0961d2, double:NaN)
            java.lang.String r13 = "emojiId"     // Catch: java.lang.Exception -> Lab
            java.lang.reflect.Field r4 = r4.getDeclaredField(r13)     // Catch: java.lang.Exception -> Lab
            java.lang.Class r13 = r3.getClass()     // Catch: java.lang.Exception -> Lab
            r14 = -97199689473582(0xffffa798ef0961d2, double:NaN)
            java.lang.String r14 = "emojiUrl"     // Catch: java.lang.Exception -> Lab
            java.lang.reflect.Field r13 = r13.getDeclaredField(r14)     // Catch: java.lang.Exception -> Lab
            r4.setAccessible(r8)     // Catch: java.lang.Exception -> Lab
            r13.setAccessible(r8)     // Catch: java.lang.Exception -> Lab
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Exception -> Lab
            boolean r14 = r4 instanceof java.lang.String     // Catch: java.lang.Exception -> Lab
            if (r14 == 0) goto Lea
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lab
            goto Leb
        Lea:
            r4 = r12
        Leb:
            java.lang.Object r3 = r13.get(r3)     // Catch: java.lang.Exception -> Lab
            boolean r13 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> Lab
            if (r13 == 0) goto Lf6
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Lab
            goto Lf7
        Lf6:
            r3 = r12
        Lf7:
            if (r4 == 0) goto Lab
            if (r3 == 0) goto Lab
            r0.put(r4, r3)     // Catch: java.lang.Exception -> Lab
            goto Lab
        Lff:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L110:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L131
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            ᛱᛲᲈᛲ r4 = new ᛱᛲᲈᛲ
            java.lang.Object r8 = r3.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4.<init>(r8, r3)
            r2.add(r4)
            goto L110
        L131:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = -97238344179246(0xffffa78fef0961d2, double:NaN)
            java.lang.String r3 = "emojiItems = "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r3 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r3 = r0.length()
            if (r3 != 0) goto L15d
            goto L17e
        L15d:
            int r3 = r0.length()
        L161:
            if (r6 >= r3) goto L17e
            int r4 = r6 + 2000
            if (r4 <= r3) goto L168
            r4 = r3
        L168:
            java.lang.String r6 = r0.substring(r6, r4)
            r13 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r8 = defpackage.C0346.f1773
            r8.getClass()
            defpackage.C0346.m1040(r6)
            r6 = r4
            goto L161
        L17e:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L19a
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᛸᛵᛶᛴ r1 = new ᛸᛵᛶᛴ
            r1.<init>(r11, r12, r9)
            r5.f3949 = r12
            r5.f3950 = r12
            r5.f3948 = r11
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r1, r5)
            if (r0 != r7) goto L3f
            goto L1af
        L19a:
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᲇᛶᲁᲇ r3 = new ᲇᛶᲁᲇ
            r3.<init>(r1, r2, r12, r9)
            r5.f3949 = r12
            r5.f3950 = r12
            r5.f3948 = r9
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r3, r5)
            if (r0 != r7) goto L3f
        L1af:
            return r7
        L1b0:
            boolean r5 = r4 instanceof defpackage.C1039
            if (r5 == 0) goto L1c1
            r5 = r4
            ᛶᛳᛵᲇ r5 = (defpackage.C1039) r5
            int r13 = r5.f4617
            r14 = r13 & r9
            if (r14 == 0) goto L1c1
            int r13 = r13 - r9
            r5.f4617 = r13
            goto L1c6
        L1c1:
            ᛶᛳᛵᲇ r5 = new ᛶᛳᛵᲇ
            r5.<init>(r0, r4)
        L1c6:
            java.lang.Object r0 = r5.f4615
            int r4 = r5.f4617
            if (r4 == 0) goto L1ee
            if (r4 == r8) goto L1e3
            if (r4 != r11) goto L1d5
            defpackage.AbstractC0762.m1680(r0)
            goto L248
        L1d5:
            r0 = -136580244610606(0xffff83c7ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            r7 = r12
            goto L249
        L1e3:
            com.ss.android.ugc.aweme.comment.model.Comment r1 = r5.f4619
            android.content.Context r2 = r5.f4618
            defpackage.AbstractC0762.m1680(r0)
            r16 = r1
            r14 = r2
            goto L20a
        L1ee:
            defpackage.AbstractC0762.m1680(r0)
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᲁᛲᛶᛵ r4 = new ᲁᛲᛶᛵ
            r4.<init>(r3, r12, r11)
            r5.f4618 = r1
            r5.f4619 = r2
            r5.f4617 = r8
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r4, r5)
            if (r0 != r7) goto L207
            goto L249
        L207:
            r14 = r1
            r16 = r2
        L20a:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r14)
            r0.setOrientation(r8)
            android.content.res.Resources r1 = r14.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r2 = 1098907648(0x41800000, float:16.0)
            float r1 = android.util.TypedValue.applyDimension(r8, r2, r1)
            int r1 = (int) r1
            r0.setPadding(r1, r6, r1, r1)
            android.widget.ScrollView r15 = new android.widget.ScrollView
            r15.<init>(r14)
            r15.addView(r0)
            ᛶᛸᛳ r1 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r1 = defpackage.AbstractC1497.f6594
            ᲀᛳᛴ r13 = new ᲀᛳᛴ
            r18 = 0
            r19 = 1
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r5.f4618 = r12
            r5.f4619 = r12
            r5.f4617 = r11
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r1, r13, r5)
            if (r0 != r7) goto L248
            goto L249
        L248:
            r7 = r10
        L249:
            return r7
    }

    @Override // defpackage.InterfaceC1280
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo232(defpackage.InterfaceC1960 r1) {
            r0 = this;
            r1.mo322()
            return
    }

    @Override // defpackage.InterfaceC1117, defpackage.InterfaceC1035
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public java.lang.Class mo1993() {
            r0 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // defpackage.InterfaceC1117
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public java.lang.Object mo2132(byte[] r1) {
            r0 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.InterfaceC1280
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public void mo233(defpackage.InterfaceC1960 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0696
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public defpackage.InterfaceC2267 mo365(defpackage.C1326 r1) {
            r0 = this;
            ᲈᛶᛷᛱ r0 = new ᲈᛶᛷᛱ
            r1 = 1
            r0.<init>(r1)
            return r0
    }
}
