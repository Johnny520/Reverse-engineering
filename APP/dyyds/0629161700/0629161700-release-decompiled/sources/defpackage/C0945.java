package defpackage;

/* JADX INFO: renamed from: 釠滇浉釠滇浄, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945 {

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    public static final defpackage.C0945 f4234 = null;

    /* JADX INFO: renamed from: 岵囜浂釠滇矅, reason: contains not printable characters */
    public static final defpackage.C0389 f4235 = null;

    static {
            r0 = -486980856487470(0xfffe4517ef0961d2, double:NaN)
            r0 = -487053870931502(0xfffe4506ef0961d2, double:NaN)
            釠滇浉釠滇浄 r0 = new 釠滇浉釠滇浄
            r0.<init>()
            defpackage.C0945.f4234 = r0
            釠丰浉釠?r0 = new 釠丰浉釠?
            r1 = 26
            r0.<init>(r1)
            釠册矆釠夺矆 r1 = new 釠册矆釠夺矆
            r1.<init>(r0)
            defpackage.C0945.f4235 = r1
            return
    }

    /* JADX INFO: renamed from: 釠丰浉釠滇矅, reason: contains not printable characters */
    public static void m1897(java.util.ArrayList r6) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L99
            r0.<init>()     // Catch: java.lang.Exception -> L99
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L99
        L9:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L99
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L99
            釠贬瞾釠翅瞼 r1 = (defpackage.C0179) r1     // Catch: java.lang.Exception -> L99
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L99
            r2.<init>()     // Catch: java.lang.Exception -> L99
            r3 = -486478345313838(0xfffe458cef0961d2, double:NaN)
            java.lang.String r3 = "id"     // Catch: java.lang.Exception -> L99
            long r4 = r1.f1218     // Catch: java.lang.Exception -> L99
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L99
            r3 = -486491230215726(0xfffe4589ef0961d2, double:NaN)
            java.lang.String r3 = "text"     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r1.f1219     // Catch: java.lang.Exception -> L99
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L99
            r3 = -486512705052206(0xfffe4584ef0961d2, double:NaN)
            java.lang.String r3 = "voiceId"     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r1.f1217     // Catch: java.lang.Exception -> L99
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L99
            r3 = -486547064790574(0xfffe457cef0961d2, double:NaN)
            java.lang.String r3 = "voiceName"     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r1.f1216     // Catch: java.lang.Exception -> L99
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L99
            r3 = -486590014463534(0xfffe4572ef0961d2, double:NaN)
            java.lang.String r3 = "audioFilePath"     // Catch: java.lang.Exception -> L99
            java.lang.String r4 = r1.f1215     // Catch: java.lang.Exception -> L99
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L99
            r3 = -486650144005678(0xfffe4564ef0961d2, double:NaN)
            java.lang.String r3 = "duration"     // Catch: java.lang.Exception -> L99
            long r4 = r1.f1220     // Catch: java.lang.Exception -> L99
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L99
            r3 = -486688798711342(0xfffe455bef0961d2, double:NaN)
            java.lang.String r3 = "createTime"     // Catch: java.lang.Exception -> L99
            long r4 = r1.f1221     // Catch: java.lang.Exception -> L99
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L99
            r0.put(r2)     // Catch: java.lang.Exception -> L99
            goto L9
        L80:
            釠册矆釠夺矆 r6 = defpackage.C0945.f4235     // Catch: java.lang.Exception -> L99
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Exception -> L99
            com.tencent.mmkv.MMKV r6 = (com.tencent.mmkv.MMKV) r6     // Catch: java.lang.Exception -> L99
            r1 = -486736043351598(0xfffe4550ef0961d2, double:NaN)
            java.lang.String r1 = "tts_history_list"     // Catch: java.lang.Exception -> L99
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L99
            r6.putString(r1, r0)     // Catch: java.lang.Exception -> L99
            return
        L99:
            r6 = move-exception
            r0 = -486809057795630(0xfffe453fef0961d2, double:NaN)
            java.lang.String r0 = "淇濆瓨TTS鍘嗗彶璁板綍澶辫触"
            r1 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r1 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r1 = defpackage.C0346.f1773
            r1.getClass()
            defpackage.C0346.m1038(r0, r6)
            return
    }

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    public static void m1898(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16) {
            r0 = -485615056887342(0xfffe4655ef0961d2, double:NaN)
            r0 = -485636531723822(0xfffe4650ef0961d2, double:NaN)
            r0 = -485670891462190(0xfffe4648ef0961d2, double:NaN)
            r0 = -485713841135150(0xfffe463eef0961d2, double:NaN)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -485773970677294(0xfffe4630ef0961d2, double:NaN)
            java.lang.String r1 = "娣诲姞TTS鍘嗗彶璁板綍: "
            r0.<init>(r1)
            r0.append(r14)
            r1 = -485825510284846(0xfffe4624ef0961d2, double:NaN)
            java.lang.String r1 = ", 璺緞: "
            r0.append(r1)
            r0.append(r15)
            r1 = -485855575055918(0xfffe461def0961d2, double:NaN)
            java.lang.String r1 = ", 鏃堕暱: "
            r0.append(r1)
            r7 = r16
            r0.append(r7)
            r1 = -485885639826990(0xfffe4616ef0961d2, double:NaN)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.AbstractC1592.m2872(r0)
            java.util.List r0 = m1899()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            釠贬瞾釠翅瞼 r0 = new 釠贬瞾釠翅瞼
            long r1 = java.lang.System.currentTimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r3, r4, r5, r6, r7, r9)
            java.io.File r12 = new java.io.File
            r12.<init>(r15)
            boolean r13 = r12.exists()
            if (r13 != 0) goto La7
            r12 = -485898524728878(0xfffe4613ef0961d2, double:NaN)
            java.lang.String r12 = "璀﹀憡: 娣诲姞鍘嗗彶璁板綍鏃舵枃浠朵笉瀛樺湪: "
            java.lang.String r12 = r12.concat(r15)
            r13 = -515022697963054(0xfffe2b96ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r13 = defpackage.C0346.f1773
            r13.getClass()
            defpackage.C0346.m1040(r12)
            goto Lcf
        La7:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r1 = -485980129107502(0xfffe4600ef0961d2, double:NaN)
            java.lang.String r14 = "鏂囦欢楠岃瘉鎴愬姛: 澶у皬 "
            r13.<init>(r14)
            long r1 = r12.length()
            r13.append(r1)
            r1 = -486031668715054(0xfffe45f4ef0961d2, double:NaN)
            java.lang.String r12 = " bytes"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            defpackage.AbstractC1592.m2872(r12)
        Lcf:
            r12 = 0
            r11.add(r12, r0)
        Ld3:
            int r13 = r11.size()
            r14 = 20
            r1 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            r3 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            r5 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            if (r13 <= r14) goto L18a
            int r13 = r11.size()
            int r13 = r13 + (-1)
            java.lang.Object r13 = r11.remove(r13)
            釠贬瞾釠翅瞼 r13 = (defpackage.C0179) r13
            java.io.File r14 = new java.io.File     // Catch: java.lang.Exception -> L144
            java.lang.String r0 = r13.f1215     // Catch: java.lang.Exception -> L144
            r14.<init>(r0)     // Catch: java.lang.Exception -> L144
            r14.delete()     // Catch: java.lang.Exception -> L144
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L144
            r14.<init>()     // Catch: java.lang.Exception -> L144
            r7 = -486061733486126(0xfffe45edef0961d2, double:NaN)
            java.lang.String r0 = "鍒犻櫎鏃у巻鍙茶褰曢煶棰? "     // Catch: java.lang.Exception -> L144
            r14.append(r0)     // Catch: java.lang.Exception -> L144
            java.lang.String r13 = r13.f1215     // Catch: java.lang.Exception -> L144
            r14.append(r13)     // Catch: java.lang.Exception -> L144
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Exception -> L144
            int r14 = r13.length()     // Catch: java.lang.Exception -> L144
            if (r14 != 0) goto L127
            goto Ld3
        L127:
            int r14 = r13.length()     // Catch: java.lang.Exception -> L144
            r0 = r12
        L12c:
            if (r0 >= r14) goto Ld3
            int r7 = r0 + 2000
            if (r7 <= r14) goto L133
            r7 = r14
        L133:
            java.lang.String r0 = r13.substring(r0, r7)     // Catch: java.lang.Exception -> L144
            釠册瞼釠贬瞾 r8 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L144
            r8.getClass()     // Catch: java.lang.Exception -> L144
            defpackage.C0346.m1040(r0)     // Catch: java.lang.Exception -> L144
            r0 = r7
            goto L12c
        L144:
            r0 = move-exception
            r13 = r0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r7 = -486113273093678(0xfffe45e1ef0961d2, double:NaN)
            java.lang.String r0 = "鍒犻櫎鍘嗗彶闊抽鏂囦欢澶辫触: "
            r14.<init>(r0)
            java.lang.String r13 = r13.getMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            int r14 = r13.length()
            if (r14 != 0) goto L16d
            goto Ld3
        L16d:
            int r14 = r13.length()
            r0 = r12
        L172:
            if (r0 >= r14) goto Ld3
            int r3 = r0 + 2000
            if (r3 <= r14) goto L179
            r3 = r14
        L179:
            java.lang.String r0 = r13.substring(r0, r3)
            釠册瞼釠贬瞾 r4 = defpackage.C0346.f1773
            r4.getClass()
            defpackage.C0346.m1040(r0)
            r0 = r3
            goto L172
        L18a:
            m1897(r11)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r7 = -486169107668526(0xfffe45d4ef0961d2, double:NaN)
            java.lang.String r14 = "鍘嗗彶璁板綍宸蹭繚瀛橈紝褰撳墠鎬绘暟: "
            r13.<init>(r14)
            int r14 = r11.size()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r14 = r13.length()
            if (r14 != 0) goto L1b3
            goto L1cf
        L1b3:
            int r14 = r13.length()
        L1b7:
            if (r12 >= r14) goto L1cf
            int r0 = r12 + 2000
            if (r0 <= r14) goto L1be
            r0 = r14
        L1be:
            java.lang.String r12 = r13.substring(r12, r0)
            釠册瞼釠贬瞾 r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1040(r12)
            r12 = r0
            goto L1b7
        L1cf:
            return
    }

    /* JADX INFO: renamed from: 岵囜浂釠滇矅, reason: contains not printable characters */
    public static java.util.List m1899() {
            釠册矆釠夺矆 r0 = defpackage.C0945.f4235
            java.lang.Object r0 = r0.getValue()
            com.tencent.mmkv.MMKV r0 = (com.tencent.mmkv.MMKV) r0
            r1 = -484863437610542(0xfffe4704ef0961d2, double:NaN)
            java.lang.String r1 = "tts_history_list"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            岵€釠夺矅 r1 = defpackage.C1698.f7558
            if (r0 != 0) goto L1b
            return r1
        L1b:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L110
            r2.<init>(r0)     // Catch: java.lang.Exception -> L110
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L110
            r0.<init>()     // Catch: java.lang.Exception -> L110
            int r3 = r2.length()     // Catch: java.lang.Exception -> L110
            r5 = 0
        L2a:
            r8 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            r10 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            if (r5 >= r3) goto L119
            org.json.JSONObject r12 = r2.getJSONObject(r5)     // Catch: java.lang.Exception -> L110
            釠贬瞾釠翅瞼 r13 = new 釠贬瞾釠翅瞼     // Catch: java.lang.Exception -> L110
            r14 = -484936452054574(0xfffe46f3ef0961d2, double:NaN)
            java.lang.String r14 = "id"     // Catch: java.lang.Exception -> L110
            long r14 = r12.getLong(r14)     // Catch: java.lang.Exception -> L110
            r16 = -484949336956462(0xfffe46f0ef0961d2, double:NaN)
            java.lang.String r4 = "text"     // Catch: java.lang.Exception -> L110
            java.lang.String r16 = r12.getString(r4)     // Catch: java.lang.Exception -> L110
            r17 = -484970811792942(0xfffe46ebef0961d2, double:NaN)
            r17 = -485035236302382(0xfffe46dcef0961d2, double:NaN)
            java.lang.String r4 = "voiceId"     // Catch: java.lang.Exception -> L110
            java.lang.String r17 = r12.getString(r4)     // Catch: java.lang.Exception -> L110
            r18 = -485069596040750(0xfffe46d4ef0961d2, double:NaN)
            r18 = -485134020550190(0xfffe46c5ef0961d2, double:NaN)
            java.lang.String r4 = "voiceName"     // Catch: java.lang.Exception -> L110
            java.lang.String r18 = r12.getString(r4)     // Catch: java.lang.Exception -> L110
            r19 = -485176970223150(0xfffe46bbef0961d2, double:NaN)
            r19 = -485241394732590(0xfffe46acef0961d2, double:NaN)
            java.lang.String r4 = "audioFilePath"     // Catch: java.lang.Exception -> L110
            java.lang.String r19 = r12.getString(r4)     // Catch: java.lang.Exception -> L110
            r20 = -485301524274734(0xfffe469eef0961d2, double:NaN)
            r20 = -485365948784174(0xfffe468fef0961d2, double:NaN)
            java.lang.String r4 = "duration"     // Catch: java.lang.Exception -> L110
            r24 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            r6 = 0
            long r20 = r12.optLong(r4, r6)     // Catch: java.lang.Exception -> L110
            r6 = -485404603489838(0xfffe4686ef0961d2, double:NaN)
            java.lang.String r4 = "createTime"     // Catch: java.lang.Exception -> L110
            long r22 = r12.getLong(r4)     // Catch: java.lang.Exception -> L110
            r13.<init>(r14, r16, r17, r18, r19, r20, r22)     // Catch: java.lang.Exception -> L110
            java.lang.String r4 = r13.f1215     // Catch: java.lang.Exception -> L110
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L110
            r6.<init>(r4)     // Catch: java.lang.Exception -> L110
            boolean r6 = r6.exists()     // Catch: java.lang.Exception -> L110
            if (r6 != 0) goto L112
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L110
            r6.<init>()     // Catch: java.lang.Exception -> L110
            r14 = -485451848130094(0xfffe467bef0961d2, double:NaN)
            java.lang.String r7 = "鍘嗗彶璁板綍涓殑鏂囦欢涓嶅瓨鍦? "     // Catch: java.lang.Exception -> L110
            r6.append(r7)     // Catch: java.lang.Exception -> L110
            r6.append(r4)     // Catch: java.lang.Exception -> L110
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L110
            int r6 = r4.length()     // Catch: java.lang.Exception -> L110
            if (r6 != 0) goto Lf3
            goto L112
        Lf3:
            int r6 = r4.length()     // Catch: java.lang.Exception -> L110
            r7 = 0
        Lf8:
            if (r7 >= r6) goto L112
            int r8 = r7 + 2000
            if (r8 <= r6) goto Lff
            r8 = r6
        Lff:
            java.lang.String r7 = r4.substring(r7, r8)     // Catch: java.lang.Exception -> L110
            釠册瞼釠贬瞾 r9 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L110
            r9.getClass()     // Catch: java.lang.Exception -> L110
            defpackage.C0346.m1040(r7)     // Catch: java.lang.Exception -> L110
            r7 = r8
            goto Lf8
        L110:
            r0 = move-exception
            goto L17c
        L112:
            r0.add(r13)     // Catch: java.lang.Exception -> L110
            int r5 = r5 + 1
            goto L2a
        L119:
            r24 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L110
            r2.<init>()     // Catch: java.lang.Exception -> L110
            r3 = -485511977672238(0xfffe466def0961d2, double:NaN)
            java.lang.String r3 = "鍔犺浇浜?"     // Catch: java.lang.Exception -> L110
            r2.append(r3)     // Catch: java.lang.Exception -> L110
            int r3 = r0.size()     // Catch: java.lang.Exception -> L110
            r2.append(r3)     // Catch: java.lang.Exception -> L110
            r3 = -485533452508718(0xfffe4668ef0961d2, double:NaN)
            java.lang.String r3 = " 鏉″巻鍙茶褰?     // Catch: java.lang.Exception -> L110
            r2.append(r3)     // Catch: java.lang.Exception -> L110
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L110
            int r3 = r2.length()     // Catch: java.lang.Exception -> L110
            if (r3 != 0) goto L153
            goto L170
        L153:
            int r3 = r2.length()     // Catch: java.lang.Exception -> L110
            r4 = 0
        L158:
            if (r4 >= r3) goto L170
            int r5 = r4 + 2000
            if (r5 <= r3) goto L15f
            r5 = r3
        L15f:
            java.lang.String r4 = r2.substring(r4, r5)     // Catch: java.lang.Exception -> L110
            釠册瞼釠贬瞾 r6 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L110
            r6.getClass()     // Catch: java.lang.Exception -> L110
            defpackage.C0346.m1040(r4)     // Catch: java.lang.Exception -> L110
            r4 = r5
            goto L158
        L170:
            岵囜浀岵€岵?r2 = new 岵囜浀岵€岵?    // Catch: java.lang.Exception -> L110
            r3 = 19
            r2.<init>(r3)     // Catch: java.lang.Exception -> L110
            java.util.List r0 = defpackage.AbstractC1107.m2116(r0, r2)     // Catch: java.lang.Exception -> L110
            return r0
        L17c:
            r2 = -485563517279790(0xfffe4661ef0961d2, double:NaN)
            java.lang.String r2 = "瑙ｆ瀽TTS鍘嗗彶璁板綍澶辫触"
            r3 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r3 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r0)
            return r1
    }
}
