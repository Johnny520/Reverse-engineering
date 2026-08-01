package defpackage;

/* JADX INFO: renamed from: ᛷᛳᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1241 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ com.ss.android.ugc.awemes.WardDatabase f5551;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ org.json.JSONArray f5552;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5553;

    public /* synthetic */ RunnableC1241(boolean r1, org.json.JSONArray r2, com.ss.android.ugc.awemes.WardDatabase r3) {
            r0 = this;
            r0.<init>()
            r0.f5553 = r1
            r0.f5552 = r2
            r0.f5551 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r23 = this;
            r0 = r23
            boolean r1 = r0.f5553
            com.ss.android.ugc.awemes.WardDatabase r2 = r0.f5551
            if (r1 != 0) goto L2a
            ᛲᛶᛸᛱ r1 = r2.mo309()     // Catch: java.lang.Throwable -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L2a
            r3 = -914317217537582(0xfffcc06eef0961d2, double:NaN)
            java.lang.String r3 = "DELETE FROM ward_items"     // Catch: java.lang.Throwable -> L2a
            com.ss.android.ugc.awemes.WardDatabase r1 = r1.f1645     // Catch: java.lang.Throwable -> L2a
            ᛳᲈᛱᛸ r4 = new ᛳᲈᛱᛸ     // Catch: java.lang.Throwable -> L2a
            r5 = 11
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = defpackage.AbstractC2193.m3592(r1, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L2a
            r1.intValue()     // Catch: java.lang.Throwable -> L2a
        L2a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.json.JSONArray r0 = r0.f5552
            int r3 = r0.length()
            r4 = 0
        L36:
            if (r4 >= r3) goto L211
            org.json.JSONObject r5 = r0.getJSONObject(r4)
            r6 = -979819763768878(0xfffc84dbef0961d2, double:NaN)
            r6 = -979841238605358(0xfffc84d6ef0961d2, double:NaN)
            java.lang.String r6 = "cid"
            r7 = -979858418474542(0xfffc84d2ef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r13 = r5.optString(r6, r7)
            r6 = -979862713441838(0xfffc84d1ef0961d2, double:NaN)
            java.lang.String r6 = "type"
            r7 = -979884188278318(0xfffc84ccef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r6 = r5.optString(r6, r7)
            int r7 = r6.length()
            if (r7 != 0) goto Lde
            r6 = -979888483245614(0xfffc84cbef0961d2, double:NaN)
            java.lang.String r6 = "awemeId"
            r7 = -979922842983982(0xfffc84c3ef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r6 = r5.optString(r6, r7)
            r7 = -979927137951278(0xfffc84c2ef0961d2, double:NaN)
            r7 = -980704527031854(0xfffc840def0961d2, double:NaN)
            java.lang.String r7 = "-1"
            boolean r7 = defpackage.AbstractC0498.m1280(r13, r7)
            if (r7 == 0) goto Lbc
            r7 = -980717411933742(0xfffc840aef0961d2, double:NaN)
            java.lang.String r7 = "-1"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lbc
            r6 = -980730296835630(0xfffc8407ef0961d2, double:NaN)
            java.lang.String r6 = "user"
            goto Lde
        Lbc:
            r6 = -980751771672110(0xfffc8402ef0961d2, double:NaN)
            java.lang.String r6 = "-1"
            boolean r6 = defpackage.AbstractC0498.m1280(r13, r6)
            if (r6 == 0) goto Ld5
            r6 = -980764656573998(0xfffc83ffef0961d2, double:NaN)
            java.lang.String r6 = "video"
            goto Lde
        Ld5:
            r6 = -980790426377774(0xfffc83f9ef0961d2, double:NaN)
            java.lang.String r6 = "comment"
        Lde:
            r22 = r6
            ᛷᛶᛷᛲ r8 = new ᛷᛶᛷᛲ
            r6 = -979991562460718(0xfffc84b3ef0961d2, double:NaN)
            java.lang.String r6 = "id"
            r9 = -980004447362606(0xfffc84b0ef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r9 = r5.optString(r6, r7)
            r6 = -980008742329902(0xfffc84afef0961d2, double:NaN)
            r6 = -980073166839342(0xfffc84a0ef0961d2, double:NaN)
            java.lang.String r6 = "category"
            r10 = -980111821545006(0xfffc8497ef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r10 = r5.optString(r6, r7)
            r6 = -980116116512302(0xfffc8496ef0961d2, double:NaN)
            r6 = -980180541021742(0xfffc8487ef0961d2, double:NaN)
            java.lang.String r6 = "remark"
            r11 = -980210605792814(0xfffc8480ef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r11 = r5.optString(r6, r7)
            r6 = -980214900760110(0xfffc847fef0961d2, double:NaN)
            r6 = -980279325269550(0xfffc8470ef0961d2, double:NaN)
            java.lang.String r6 = "awemeId"
            r14 = -980313685007918(0xfffc8468ef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r12 = r5.optString(r6, r7)
            r6 = -980317979975214(0xfffc8467ef0961d2, double:NaN)
            r6 = -980382404484654(0xfffc8458ef0961d2, double:NaN)
            java.lang.String r6 = "text"
            r14 = -980403879321134(0xfffc8453ef0961d2, double:NaN)
            java.lang.String r7 = ""
            java.lang.String r14 = r5.optString(r6, r7)
            r6 = -980408174288430(0xfffc8452ef0961d2, double:NaN)
            r6 = -980472598797870(0xfffc8443ef0961d2, double:NaN)
            java.lang.String r6 = "createTime"
            r7 = r2
            r23 = r3
            r2 = 0
            long r15 = r5.optLong(r6, r2)
            r17 = -980519843438126(0xfffc8438ef0961d2, double:NaN)
            java.lang.String r6 = "saveTime"
            long r17 = r5.optLong(r6, r2)
            r2 = -980558498143790(0xfffc842fef0961d2, double:NaN)
            java.lang.String r2 = "authorName"
            boolean r3 = r5.has(r2)
            r6 = 0
            if (r3 == 0) goto L1ba
            boolean r3 = r5.isNull(r2)
            if (r3 != 0) goto L1ba
            java.lang.String r2 = r5.optString(r2)
            int r3 = r2.length()
            if (r3 <= 0) goto L1ba
            r19 = r2
            goto L1bc
        L1ba:
            r19 = r6
        L1bc:
            r2 = -980605742784046(0xfffc8424ef0961d2, double:NaN)
            java.lang.String r2 = "authorAvatar"
            boolean r3 = r5.has(r2)
            if (r3 == 0) goto L1de
            boolean r3 = r5.isNull(r2)
            if (r3 != 0) goto L1de
            java.lang.String r2 = r5.optString(r2)
            int r3 = r2.length()
            if (r3 <= 0) goto L1de
            r20 = r2
            goto L1e0
        L1de:
            r20 = r6
        L1e0:
            r2 = -980661577358894(0xfffc8417ef0961d2, double:NaN)
            java.lang.String r2 = "authorUid"
            boolean r3 = r5.has(r2)
            if (r3 == 0) goto L202
            boolean r3 = r5.isNull(r2)
            if (r3 != 0) goto L202
            java.lang.String r2 = r5.optString(r2)
            int r3 = r2.length()
            if (r3 <= 0) goto L202
            r21 = r2
            goto L204
        L202:
            r21 = r6
        L204:
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22)
            r1.add(r8)
            int r4 = r4 + 1
            r3 = r23
            r2 = r7
            goto L36
        L211:
            r7 = r2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L231
            ᛲᛶᛸᛱ r0 = r7.mo309()     // Catch: java.lang.Throwable -> L231
            r0.getClass()     // Catch: java.lang.Throwable -> L231
            r2 = -885188749336110(0xfffcdaecef0961d2, double:NaN)
            com.ss.android.ugc.awemes.WardDatabase r2 = r0.f1645     // Catch: java.lang.Throwable -> L231
            ᲈᲈᛸᲁ r3 = new ᲈᲈᛸᲁ     // Catch: java.lang.Throwable -> L231
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L231
            defpackage.AbstractC2193.m3592(r2, r3)     // Catch: java.lang.Throwable -> L231
        L231:
            return
    }
}
