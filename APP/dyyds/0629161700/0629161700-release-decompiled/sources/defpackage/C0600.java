package defpackage;

/* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0600 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C2035 f2982;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0600 f2983 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0554 f2984 = null;

    static {
            ᛳᲈᲈᛲ r0 = new ᛳᲈᲈᛲ
            r0.<init>()
            defpackage.C0600.f2983 = r0
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            ᛸᛷᛱᛷ r1 = defpackage.AbstractC1754.m3149()
            r0.getClass()
            ᛳᛵᲈᛵ r0 = defpackage.AbstractC0397.m1146(r0, r1)
            ᛳᲁᛳᛴ r0 = defpackage.AbstractC1628.m2962(r0)
            defpackage.C0600.f2984 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1236 m1393(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.List r12) {
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L1a8
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.AbstractC0575.m1369(r12)
            r0.<init>(r1)
            java.util.Iterator r1 = r12.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            ᛷᛶᛷᛲ r2 = (defpackage.C1294) r2
            java.lang.String r2 = r2.f5752
            r0.add(r2)
            goto L13
        L25:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = defpackage.AbstractC1347.m2524(r3)
            if (r3 != 0) goto L2e
            r1.add(r2)
            goto L2e
        L45:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            java.util.List r0 = defpackage.AbstractC1107.m2113(r0)
            ᛴᛶᲁᛲ r1 = defpackage.C0697.f3343
            r1.getClass()
            java.util.ArrayList r7 = defpackage.C0697.m1577(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L60:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L60
            r1.add(r3)
            goto L60
        L77:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L97
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.contains(r4)
            if (r4 != 0) goto L80
            r2.add(r3)
            goto L80
        L97:
            java.util.ArrayList r7 = defpackage.AbstractC1107.m2115(r1, r2)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        La4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r2)
            goto La4
        Lb4:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r2 = r12.iterator()
        Lbd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld1
            java.lang.Object r3 = r2.next()
            ᛷᛶᛷᛲ r3 = (defpackage.C1294) r3
            org.json.JSONObject r3 = r3.m2415()
            r1.put(r3)
            goto Lbd
        Ld1:
            long r2 = java.lang.System.currentTimeMillis()
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = -490975176072750(0xfffe4175ef0961d2, double:NaN)
            java.lang.String r5 = "exportType"
            r4.put(r5, r8)
            r5 = -491022420713006(0xfffe416aef0961d2, double:NaN)
            java.lang.String r8 = "exportTypeName"
            r4.put(r8, r9)
            r8 = -491086845222446(0xfffe415bef0961d2, double:NaN)
            java.lang.String r8 = "exportTarget"
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r5 = -491142679797294(0xfffe414eef0961d2, double:NaN)
            java.lang.String r5 = "id"
            r9.put(r5, r10)
            r5 = -491155564699182(0xfffe414bef0961d2, double:NaN)
            java.lang.String r10 = "name"
            r9.put(r10, r11)
            r4.put(r8, r9)
            r8 = -491177039535662(0xfffe4146ef0961d2, double:NaN)
            java.lang.String r8 = "partialExport"
            r9 = 1
            r4.put(r8, r9)
            r8 = -491237169077806(0xfffe4138ef0961d2, double:NaN)
            java.lang.String r8 = "categories"
            r4.put(r8, r0)
            r8 = -491284413718062(0xfffe412def0961d2, double:NaN)
            java.lang.String r8 = "lastSelectedCategory"
            java.lang.Object r9 = defpackage.AbstractC1107.m2124(r7)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L14e
            r9 = -491374608031278(0xfffe4118ef0961d2, double:NaN)
            java.lang.String r9 = ""
        L14e:
            r4.put(r8, r9)
            r8 = -491378902998574(0xfffe4117ef0961d2, double:NaN)
            java.lang.String r8 = "wardItems"
            r4.put(r8, r1)
            r8 = -491421852671534(0xfffe410def0961d2, double:NaN)
            java.lang.String r8 = "wardItemsCount"
            int r9 = r12.size()
            r4.put(r8, r9)
            r8 = -491486277180974(0xfffe40feef0961d2, double:NaN)
            java.lang.String r8 = "exportTime"
            r4.put(r8, r2)
            r8 = -491533521821230(0xfffe40f3ef0961d2, double:NaN)
            java.lang.String r8 = "backupTime"
            r4.put(r8, r2)
            r8 = -491580766461486(0xfffe40e8ef0961d2, double:NaN)
            java.lang.String r8 = "backupVersion"
            r9 = -491640896003630(0xfffe40daef0961d2, double:NaN)
            java.lang.String r9 = "260629161700"
            r4.put(r8, r9)
            ᛷᛲᲈᲁ r8 = new ᛷᛲᲈᲁ
            int r9 = r12.size()
            int r7 = r7.size()
            r8.<init>(r4, r9, r7)
            return r8
        L1a8:
            r7 = -490927931432494(0xfffe4180ef0961d2, double:NaN)
            java.lang.String r7 = "没有可导出的插眼数据"
            defpackage.C2264.m3676(r7)
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m1394(android.app.Activity r7, defpackage.C2035 r8) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r1 = -491696730578478(0xfffe40cdef0961d2, double:NaN)
            java.lang.String r1 = "yyyyMMdd_HHmmss"
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -491765450055214(0xfffe40bdef0961d2, double:NaN)
            java.lang.String r2 = "Dyyds_"
            r1.<init>(r2)
            ᛲᲀᛱᲁ r2 = defpackage.C0346.f1773
            r2.getClass()
            java.lang.String r2 = defpackage.C0346.m1041(r7)
            r1.append(r2)
            r2 = -491795514826286(0xfffe40b6ef0961d2, double:NaN)
            java.lang.String r2 = "_ward_"
            r1.append(r2)
            java.lang.String r2 = r8.f8771
            r1.append(r2)
            r2 = 95
            r1.append(r2)
            java.lang.String r3 = r8.f8769
            boolean r4 = defpackage.AbstractC1347.m2524(r3)
            if (r4 == 0) goto L53
            r3 = -491851349401134(0xfffe40a9ef0961d2, double:NaN)
            java.lang.String r3 = "unknown"
        L53:
            r4 = -491885709139502(0xfffe40a1ef0961d2, double:NaN)
            java.lang.String r4 = "[\\\\/:*?\"<>|\\s]+"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r5 = -491954428616238(0xfffe4091ef0961d2, double:NaN)
            java.lang.String r5 = "_"
            java.util.regex.Matcher r3 = r4.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r5)
            r4 = -491963018550830(0xfffe408fef0961d2, double:NaN)
            java.lang.String r4 = "_+"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r5 = -491975903452718(0xfffe408cef0961d2, double:NaN)
            java.lang.String r5 = "_"
            java.util.regex.Matcher r3 = r4.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r5)
            r4 = 1
            char[] r4 = new char[r4]
            r5 = 0
            r4[r5] = r2
            java.lang.String r3 = defpackage.AbstractC1347.m2503(r3, r4)
            r4 = 40
            java.lang.String r3 = defpackage.AbstractC1347.m2523(r4, r3)
            boolean r4 = defpackage.AbstractC1347.m2524(r3)
            if (r4 == 0) goto Lae
            r3 = -491984493387310(0xfffe408aef0961d2, double:NaN)
            java.lang.String r3 = "unknown"
        Lae:
            r1.append(r3)
            r1.append(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            java.lang.String r0 = r0.format(r2)
            r1.append(r0)
            r2 = -491825579597358(0xfffe40afef0961d2, double:NaN)
            java.lang.String r0 = ".json"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.content.Intent r1 = new android.content.Intent
            r2 = -490025988300334(0xfffe4252ef0961d2, double:NaN)
            java.lang.String r2 = "android.intent.action.CREATE_DOCUMENT"
            r1.<init>(r2)
            r2 = -490189197057582(0xfffe422cef0961d2, double:NaN)
            java.lang.String r2 = "application/json"
            r1.setType(r2)
            r2 = -490262211501614(0xfffe421bef0961d2, double:NaN)
            java.lang.String r2 = "android.intent.extra.TITLE"
            r1.putExtra(r2, r0)
            r2 = -490378175618606(0xfffe4200ef0961d2, double:NaN)
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r1.addCategory(r0)
            defpackage.C0600.f2982 = r8     // Catch: android.content.ActivityNotFoundException -> L135
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L135
            r0.<init>()     // Catch: android.content.ActivityNotFoundException -> L135
            r2 = -490519909539374(0xfffe41dfef0961d2, double:NaN)
            java.lang.String r2 = "保存"     // Catch: android.content.ActivityNotFoundException -> L135
            r0.append(r2)     // Catch: android.content.ActivityNotFoundException -> L135
            java.lang.String r8 = r8.f8772     // Catch: android.content.ActivityNotFoundException -> L135
            r0.append(r8)     // Catch: android.content.ActivityNotFoundException -> L135
            r2 = -490532794441262(0xfffe41dcef0961d2, double:NaN)
            java.lang.String r8 = "插眼数据"     // Catch: android.content.ActivityNotFoundException -> L135
            r0.append(r8)     // Catch: android.content.ActivityNotFoundException -> L135
            java.lang.String r8 = r0.toString()     // Catch: android.content.ActivityNotFoundException -> L135
            android.content.Intent r8 = android.content.Intent.createChooser(r1, r8)     // Catch: android.content.ActivityNotFoundException -> L135
            r0 = 14285703(0xd9fb87, float:2.0018534E-38)
            r7.startActivityForResult(r8, r0)     // Catch: android.content.ActivityNotFoundException -> L135
            return
        L135:
            r7 = move-exception
            r8 = 0
            defpackage.C0600.f2982 = r8
            r0 = -490554269277742(0xfffe41d7ef0961d2, double:NaN)
            java.lang.String r8 = "请安装文件管理器"
            defpackage.AbstractC0209.m764(r8)
            r0 = -490592923983406(0xfffe41ceef0961d2, double:NaN)
            java.lang.String r8 = "文件管理器未找到"
            r0 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r0 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r8, r7)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m1395(android.content.Context r17, android.net.Uri r18, defpackage.C2035 r19, defpackage.AbstractC1016 r20) {
            r16 = this;
            r1 = r17
            r6 = r18
            r0 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.C0423
            if (r3 == 0) goto L1c
            r3 = r2
            ᛳᛲᛷᛶ r3 = (defpackage.C0423) r3
            int r4 = r3.f2114
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r4 & r5
            if (r7 == 0) goto L1c
            int r4 = r4 - r5
            r3.f2114 = r4
        L1a:
            r7 = r3
            goto L24
        L1c:
            ᛳᛲᛷᛶ r3 = new ᛳᛲᛷᛶ
            r4 = r16
            r3.<init>(r4, r2)
            goto L1a
        L24:
            java.lang.Object r2 = r7.f2115
            int r3 = r7.f2114
            r4 = 0
            r8 = 3
            r5 = 2
            r9 = 1
            r14 = 0
            ᛴᛵ r10 = defpackage.EnumC0670.f3246
            if (r3 == 0) goto L5e
            if (r3 == r9) goto L56
            if (r3 == r5) goto L4d
            if (r3 != r8) goto L40
            ᛷᛲᲈᲁ r0 = r7.f2113
            android.net.Uri r1 = r7.f2118
            defpackage.AbstractC0762.m1680(r2)
            goto Le0
        L40:
            r0 = -490721773002286(0xfffe41b0ef0961d2, double:NaN)
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r0)
            return r4
        L4d:
            android.net.Uri r0 = r7.f2118
            android.content.Context r1 = r7.f2117
            defpackage.AbstractC0762.m1680(r2)
            goto Lc1
        L56:
            android.net.Uri r0 = r7.f2118
            android.content.Context r1 = r7.f2117
            defpackage.AbstractC0762.m1680(r2)
            goto L8d
        L5e:
            defpackage.AbstractC0762.m1680(r2)
            java.lang.String r2 = r0.f8771
            java.lang.String r3 = r0.f8770
            r11 = -490631578689070(0xfffe41c5ef0961d2, double:NaN)
            java.lang.String r11 = "category"
            boolean r11 = r2.equals(r11)
            if (r11 == 0) goto L93
            r7.f2117 = r1
            r7.f2118 = r6
            r7.f2114 = r9
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r0 = defpackage.ExecutorC0679.f3269
            ᛴᛴᛷ r2 = new ᛴᛴᛷ
            r4 = 6
            r2.<init>(r1, r3, r14, r4)
            java.lang.Object r2 = defpackage.AbstractC0397.m1144(r0, r2, r7)
            if (r2 != r10) goto L8c
        L8a:
            r1 = r10
            goto Ldd
        L8c:
            r0 = r6
        L8d:
            ᛷᛲᲈᲁ r2 = (defpackage.C1236) r2
        L8f:
            r12 = r0
            r11 = r1
            r13 = r2
            goto Lc4
        L93:
            r11 = -490670233394734(0xfffe41bcef0961d2, double:NaN)
            java.lang.String r9 = "user"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto Lea
            java.lang.String r0 = r0.f8769
            r7.f2117 = r1
            r7.f2118 = r6
            r7.f2114 = r5
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r9 = defpackage.ExecutorC0679.f3269
            r2 = r3
            r3 = r0
            ᛶᛳᛴᛷ r0 = new ᛶᛳᛴᛷ
            r5 = 5
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r2 = defpackage.AbstractC0397.m1144(r9, r0, r7)
            if (r2 != r10) goto Lbe
            goto L8a
        Lbe:
            r1 = r17
            r0 = r6
        Lc1:
            ᛷᛲᲈᲁ r2 = (defpackage.C1236) r2
            goto L8f
        Lc4:
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r0 = defpackage.ExecutorC0679.f3269
            r1 = r10
            ᛸᲈᲇᲇ r10 = new ᛸᲈᲇᲇ
            r15 = 4
            r10.<init>(r11, r12, r13, r14, r15)
            r7.f2117 = r14
            r7.f2118 = r12
            r7.f2113 = r13
            r7.f2114 = r8
            java.lang.Object r0 = defpackage.AbstractC0397.m1144(r0, r10, r7)
            if (r0 != r1) goto Lde
        Ldd:
            return r1
        Lde:
            r1 = r12
            r0 = r13
        Le0:
            ᲁᲇᲁᲀ r2 = new ᲁᲇᲁᲀ
            int r3 = r0.f5540
            int r0 = r0.f5538
            r2.<init>(r1, r3, r0)
            return r2
        Lea:
            r0 = -490691708231214(0xfffe41b7ef0961d2, double:NaN)
            java.lang.String r0 = "未知导出类型"
            defpackage.C2264.m3676(r0)
            return r4
    }
}
