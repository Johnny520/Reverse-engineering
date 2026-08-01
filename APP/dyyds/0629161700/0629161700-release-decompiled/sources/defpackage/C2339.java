package defpackage;

/* JADX INFO: renamed from: ᲈᲁᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2339 extends defpackage.AbstractC0343 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static boolean f10093;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C2339 f10094 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static boolean f10095;

    static {
            r0 = -620434080308782(0xfffdcbb7ef0961d2, double:NaN)
            ᲈᲁᛶᛷ r0 = new ᲈᲁᛶᛷ
            r0.<init>()
            defpackage.C2339.f10094 = r0
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static void m3819(android.content.Context r3) {
            r0 = -619205719662126(0xfffdccd5ef0961d2, double:NaN)
            r0 = -619240079400494(0xfffdcccdef0961d2, double:NaN)
            java.lang.String r0 = "clipboard"     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Exception -> L42
            boolean r1 = r0 instanceof android.content.ClipboardManager     // Catch: java.lang.Exception -> L42
            if (r1 == 0) goto L1c
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch: java.lang.Exception -> L42
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L20
            goto L26
        L20:
            kotlin.Pair r3 = m3820(r3, r0)     // Catch: java.lang.Exception -> L42
            if (r3 != 0) goto L27
        L26:
            return
        L27:
            java.lang.Object r3 = r3.component2()     // Catch: java.lang.Exception -> L42
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L42
            ᛲᲈᛶᲈ r0 = defpackage.AbstractC0902.f4107     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L42
            com.tencent.mmkv.MMKV r0 = (com.tencent.mmkv.MMKV) r0     // Catch: java.lang.Exception -> L42
            r1 = -619283029073454(0xfffdccc3ef0961d2, double:NaN)
            java.lang.String r1 = "last_handled_comment_share_clip"     // Catch: java.lang.Exception -> L42
            r0.putString(r1, r3)     // Catch: java.lang.Exception -> L42
            return
        L42:
            r3 = move-exception
            r0 = -619420468026926(0xfffdcca3ef0961d2, double:NaN)
            java.lang.String r0 = "mark comment share command handled error"
            r1 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r1 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r1 = defpackage.C0346.f1773
            r1.getClass()
            defpackage.C0346.m1038(r0, r3)
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public static kotlin.Pair m3820(android.content.Context r9, android.content.ClipboardManager r10) {
            android.content.ClipData r10 = r10.getPrimaryClip()
            r1 = 0
            if (r10 != 0) goto L9
            goto L162
        L9:
            int r0 = r10.getItemCount()
            if (r0 > 0) goto L11
            goto L162
        L11:
            r0 = 0
            android.content.ClipData$Item r0 = r10.getItemAt(r0)
            if (r0 == 0) goto L162
            java.lang.CharSequence r9 = r0.coerceToText(r9)
            if (r9 != 0) goto L20
            goto L162
        L20:
            ᛷᛴᛷᛵ r0 = defpackage.C1258.f5624
            r0.getClass()
            java.lang.String r9 = r9.toString()
            if (r9 != 0) goto L2e
        L2b:
            r2 = r1
            goto L13b
        L2e:
            ᲁᲀᲈᛵ r0 = defpackage.C1258.f5625
            ᛷᛸᛱᛸ r9 = defpackage.C1919.m3350(r0, r9)
            if (r9 != 0) goto L37
            goto L2b
        L37:
            java.util.List r0 = r9.m2477()
            r2 = 1
            java.lang.Object r0 = defpackage.AbstractC1107.m2127(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2b
            boolean r2 = defpackage.AbstractC1347.m2524(r0)
            if (r2 != 0) goto L4b
            goto L4c
        L4b:
            r0 = r1
        L4c:
            if (r0 != 0) goto L4f
            goto L2b
        L4f:
            r2 = 8
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.Throwable -> L12d
            r2 = -500600197783086(0xfffe38b4ef0961d2, double:NaN)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L12d
            r3 = -500651737390638(0xfffe38a8ef0961d2, double:NaN)
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L12d
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L12d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L12d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L12d
            r2 = -500677507194414(0xfffe38a2ef0961d2, double:NaN)
            java.lang.String r2 = "source"     // Catch: java.lang.Throwable -> L12d
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L12d
            r3 = -500707571965486(0xfffe389bef0961d2, double:NaN)
            java.lang.String r3 = "yyds"     // Catch: java.lang.Throwable -> L12d
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)     // Catch: java.lang.Throwable -> L12d
            if (r2 != 0) goto L8e
            goto L2b
        L8e:
            r2 = -500729046801966(0xfffe3896ef0961d2, double:NaN)
            java.lang.String r2 = "type"     // Catch: java.lang.Throwable -> L12d
            r3 = -500750521638446(0xfffe3891ef0961d2, double:NaN)
            java.lang.String r3 = "comment"     // Catch: java.lang.Throwable -> L12d
            java.lang.String r2 = r0.optString(r2, r3)     // Catch: java.lang.Throwable -> L12d
            r3 = -501527910719022(0xfffe37dcef0961d2, double:NaN)
            java.lang.String r3 = "comment"     // Catch: java.lang.Throwable -> L12d
            boolean r3 = defpackage.AbstractC0498.m1280(r2, r3)     // Catch: java.lang.Throwable -> L12d
            if (r3 != 0) goto Ld1
            r3 = -501562270457390(0xfffe37d4ef0961d2, double:NaN)
            java.lang.String r3 = "video"     // Catch: java.lang.Throwable -> L12d
            boolean r3 = defpackage.AbstractC0498.m1280(r2, r3)     // Catch: java.lang.Throwable -> L12d
            if (r3 != 0) goto Ld1
            r3 = -501588040261166(0xfffe37ceef0961d2, double:NaN)
            java.lang.String r3 = "user"     // Catch: java.lang.Throwable -> L12d
            boolean r3 = defpackage.AbstractC0498.m1280(r2, r3)     // Catch: java.lang.Throwable -> L12d
            if (r3 == 0) goto L2b
        Ld1:
            java.lang.String r6 = defpackage.C1258.m2361(r2)     // Catch: java.lang.Throwable -> L12d
            r2 = -500784881376814(0xfffe3889ef0961d2, double:NaN)
            java.lang.String r2 = "awemeId"     // Catch: java.lang.Throwable -> L12d
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L12d
            boolean r3 = defpackage.AbstractC1347.m2524(r2)     // Catch: java.lang.Throwable -> L12d
            if (r3 != 0) goto Lea
            r3 = r2
            goto Leb
        Lea:
            r3 = r1
        Leb:
            if (r3 != 0) goto Lef
            goto L2b
        Lef:
            r4 = -500819241115182(0xfffe3881ef0961d2, double:NaN)
            java.lang.String r2 = "cid"     // Catch: java.lang.Throwable -> L12d
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Throwable -> L12d
            boolean r4 = defpackage.AbstractC1347.m2524(r2)     // Catch: java.lang.Throwable -> L12d
            if (r4 != 0) goto L104
            r4 = r2
            goto L105
        L104:
            r4 = r1
        L105:
            if (r4 != 0) goto L109
            goto L2b
        L109:
            r7 = -500836420984366(0xfffe387def0961d2, double:NaN)
            java.lang.String r2 = "uid"     // Catch: java.lang.Throwable -> L12d
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Throwable -> L12d
            boolean r2 = defpackage.AbstractC1347.m2524(r0)     // Catch: java.lang.Throwable -> L12d
            if (r2 != 0) goto L11e
            r7 = r0
            goto L11f
        L11e:
            r7 = r1
        L11f:
            ᛵᛴᲇᲁ r2 = new ᛵᛴᲇᲁ     // Catch: java.lang.Throwable -> L12d
            java.lang.Object r9 = r9.f5856     // Catch: java.lang.Throwable -> L12d
            java.util.regex.Matcher r9 = (java.util.regex.Matcher) r9     // Catch: java.lang.Throwable -> L12d
            java.lang.String r5 = r9.group()     // Catch: java.lang.Throwable -> L12d
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12d
            goto L134
        L12d:
            r0 = move-exception
            r9 = r0
            ᛴᛸᛲᲀ r2 = new ᛴᛸᛲᲀ
            r2.<init>(r9)
        L134:
            boolean r9 = r2 instanceof defpackage.C0723
            if (r9 == 0) goto L139
            r2 = r1
        L139:
            ᛵᛴᲇᲁ r2 = (defpackage.C0880) r2
        L13b:
            if (r2 != 0) goto L13e
            goto L162
        L13e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.ClipDescription r10 = r10.getDescription()
            long r0 = r10.getTimestamp()
            r9.append(r0)
            r10 = 58
            r9.append(r10)
            java.lang.String r10 = r2.f3967
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            kotlin.Pair r10 = new kotlin.Pair
            r10.<init>(r2, r9)
            return r10
        L162:
            return r1
    }

    @Override // defpackage.AbstractC0343
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo1028() {
            r5 = this;
            r0 = -618948021624366(0xfffdcd11ef0961d2, double:NaN)
            java.lang.String r0 = "com.ss.android.ugc.aweme.main.MainActivity"
            java.lang.ClassLoader r5 = r5.m1024()
            r1 = 2
            java.lang.Class r5 = defpackage.AbstractC0350.m1058(r0, r5, r1)
            if (r5 == 0) goto L6b
            int r0 = defpackage.AbstractC0233.f1405
            ᛶᲈᛱᲈ r5 = defpackage.AbstractC2279.m3695(r5)
            java.lang.Object r0 = r5.f5356
            ᛷᲇᛱᲈ r0 = (defpackage.C1380) r0
            r0.f6021 = r1
            ᛶᛶᛲᛱ r2 = r5.m2298()
            r0.f6021 = r1
            r3 = -619132705218094(0xfffdcce6ef0961d2, double:NaN)
            java.lang.String r3 = "onResume"
            r2.f4431 = r3
            java.util.List r2 = r2.mo1885()
            java.lang.Object r2 = defpackage.AbstractC1107.m2124(r2)
            ᛱᲁᛲᲁ r2 = (defpackage.C0178) r2
            ᛳᛶᛳᛸ r3 = new ᛳᛶᛳᛸ
            r4 = 7
            r3.<init>(r4)
            ᲈᲁᛶᛷ r4 = defpackage.C2339.f10094
            r4.m1022(r2, r3)
            ᛶᛶᛲᛱ r5 = r5.m2298()
            r0.f6021 = r1
            r0 = -619171359923758(0xfffdccddef0961d2, double:NaN)
            java.lang.String r0 = "onPause"
            r5.f4431 = r0
            java.util.List r5 = r5.mo1885()
            java.lang.Object r5 = defpackage.AbstractC1107.m2124(r5)
            ᛱᲁᛲᲁ r5 = (defpackage.C0178) r5
            ᛳᛶᛳᛸ r0 = new ᛳᛶᛳᛸ
            r1 = 8
            r0.<init>(r1)
            r4.m1022(r5, r0)
        L6b:
            return
    }
}
