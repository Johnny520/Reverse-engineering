package defpackage;

/* JADX INFO: renamed from: ᛷᛴᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1258 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1258 f5624 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1919 f5625 = null;

    static {
            r0 = -501609515097646(0xfffe37c9ef0961d2, double:NaN)
            r0 = -501708299345454(0xfffe37b2ef0961d2, double:NaN)
            r0 = -501742659083822(0xfffe37aaef0961d2, double:NaN)
            r0 = -501768428887598(0xfffe37a4ef0961d2, double:NaN)
            r0 = -501789903724078(0xfffe379fef0961d2, double:NaN)
            r0 = -501811378560558(0xfffe379aef0961d2, double:NaN)
            ᛷᛴᛷᛵ r0 = new ᛷᛴᛷᛵ
            r0.<init>()
            defpackage.C1258.f5624 = r0
            ᲁᲀᲈᛵ r0 = new ᲁᲀᲈᛵ
            r1 = -501819968495150(0xfffe3798ef0961d2, double:NaN)
            java.lang.String r1 = "【[^:】]+:([A-Za-z0-9_\\-=]+)】"
            r0.<init>(r1)
            defpackage.C1258.f5625 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.lang.String m2360(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = -500248010464814(0xfffe3906ef0961d2, double:NaN)
            r0 = 0
            if (r5 == 0) goto L142
            boolean r1 = defpackage.AbstractC1347.m2524(r5)
            if (r1 != 0) goto L12
            goto L13
        L12:
            r5 = r0
        L13:
            if (r5 != 0) goto L17
            goto L142
        L17:
            if (r6 == 0) goto L142
            boolean r1 = defpackage.AbstractC1347.m2524(r6)
            if (r1 != 0) goto L20
            goto L21
        L20:
            r6 = r0
        L21:
            if (r6 != 0) goto L25
            goto L142
        L25:
            java.lang.String r7 = m2361(r7)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r2 = -500269485301294(0xfffe3901ef0961d2, double:NaN)
            java.lang.String r2 = "v"
            r3 = 1
            r1.put(r2, r3)
            r2 = -500278075235886(0xfffe38ffef0961d2, double:NaN)
            java.lang.String r2 = "source"
            r3 = -500308140006958(0xfffe38f8ef0961d2, double:NaN)
            java.lang.String r3 = "yyds"
            r1.put(r2, r3)
            r2 = -500329614843438(0xfffe38f3ef0961d2, double:NaN)
            java.lang.String r2 = "type"
            r1.put(r2, r7)
            r2 = -500351089679918(0xfffe38eeef0961d2, double:NaN)
            java.lang.String r2 = "awemeId"
            r1.put(r2, r5)
            r2 = -500385449418286(0xfffe38e6ef0961d2, double:NaN)
            java.lang.String r5 = "cid"
            r1.put(r5, r6)
            if (r8 == 0) goto L8c
            boolean r5 = defpackage.AbstractC1347.m2524(r8)
            if (r5 != 0) goto L7d
            goto L7e
        L7d:
            r8 = r0
        L7e:
            if (r8 == 0) goto L8c
            r5 = -500402629287470(0xfffe38e2ef0961d2, double:NaN)
            java.lang.String r5 = "uid"
            r1.put(r5, r8)
        L8c:
            java.lang.String r5 = r1.toString()
            r0 = -500419809156654(0xfffe38deef0961d2, double:NaN)
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            r0 = -500479938698798(0xfffe38d0ef0961d2, double:NaN)
            byte[] r5 = r5.getBytes(r6)
            r0 = -500505708502574(0xfffe38caef0961d2, double:NaN)
            r6 = 10
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r0 = -501042579414574(0xfffe384def0961d2, double:NaN)
            java.lang.String r0 = "video"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lcf
            r0 = -501068349218350(0xfffe3847ef0961d2, double:NaN)
            java.lang.String r0 = "分享一条抖音视频给你，复制后打开抖音即可查看。"
            goto Lf1
        Lcf:
            r0 = -501171428433454(0xfffe382fef0961d2, double:NaN)
            java.lang.String r0 = "user"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Le8
            r0 = -501192903269934(0xfffe382aef0961d2, double:NaN)
            java.lang.String r0 = "分享一个抖音主页给你，复制后打开抖音即可查看。"
            goto Lf1
        Le8:
            r0 = -501295982485038(0xfffe3812ef0961d2, double:NaN)
            java.lang.String r0 = "分享一条抖音评论给你，复制后打开抖音即可查看。"
        Lf1:
            r8.<init>(r0)
            r8.append(r6)
            r0 = -500853600853550(0xfffe3879ef0961d2, double:NaN)
            java.lang.String r6 = "video"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L110
            r6 = -500879370657326(0xfffe3873ef0961d2, double:NaN)
            java.lang.String r6 = "【YYDS视频口令:"
            goto L132
        L110:
            r0 = -500926615297582(0xfffe3868ef0961d2, double:NaN)
            java.lang.String r6 = "user"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L129
            r6 = -500948090134062(0xfffe3863ef0961d2, double:NaN)
            java.lang.String r6 = "【YYDS主页口令:"
            goto L132
        L129:
            r6 = -500995334774318(0xfffe3858ef0961d2, double:NaN)
            java.lang.String r6 = "【YYDS评论口令:"
        L132:
            r8.append(r6)
            r8.append(r5)
            r5 = 12305(0x3011, float:1.7243E-41)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            return r5
        L142:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m2361(java.lang.String r2) {
            r0 = -501399061700142(0xfffe37faef0961d2, double:NaN)
            java.lang.String r0 = "video"
            boolean r0 = defpackage.AbstractC0498.m1280(r2, r0)
            if (r0 == 0) goto L19
            r0 = -501424831503918(0xfffe37f4ef0961d2, double:NaN)
            java.lang.String r2 = "video"
            return r2
        L19:
            r0 = -501450601307694(0xfffe37eeef0961d2, double:NaN)
            java.lang.String r0 = "user"
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r0)
            if (r2 == 0) goto L32
            r0 = -501472076144174(0xfffe37e9ef0961d2, double:NaN)
            java.lang.String r2 = "user"
            return r2
        L32:
            r0 = -501493550980654(0xfffe37e4ef0961d2, double:NaN)
            java.lang.String r2 = "comment"
            return r2
    }
}
