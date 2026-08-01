package defpackage;

/* JADX INFO: renamed from: ᲈᛷᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2296 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.util.WeakHashMap f9716 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2296 f9717 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.Map f9718 = null;

    static {
            r0 = -482419601219118(0xfffe493def0961d2, double:NaN)
            r0 = -482449665990190(0xfffe4936ef0961d2, double:NaN)
            r0 = -482466845859374(0xfffe4932ef0961d2, double:NaN)
            ᲈᛷᲁᛳ r0 = new ᲈᛷᲁᛳ
            r0.<init>()
            defpackage.C2296.f9717 = r0
            r0 = -482505500565038(0xfffe4929ef0961d2, double:NaN)
            java.lang.String r0 = "关注"
            r1 = -482518385466926(0xfffe4926ef0961d2, double:NaN)
            java.lang.String r1 = "following"
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r1)
            r0 = -482561335139886(0xfffe491cef0961d2, double:NaN)
            java.lang.String r0 = "粉丝"
            r3 = -482574220041774(0xfffe4919ef0961d2, double:NaN)
            java.lang.String r1 = "fans"
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r0, r1)
            r0 = -482595694878254(0xfffe4914ef0961d2, double:NaN)
            java.lang.String r0 = "获赞"
            r4 = -482608579780142(0xfffe4911ef0961d2, double:NaN)
            java.lang.String r1 = "digg"
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r0, r1)
            r0 = -482630054616622(0xfffe490cef0961d2, double:NaN)
            java.lang.String r0 = "互关"
            r5 = -482642939518510(0xfffe4909ef0961d2, double:NaN)
            java.lang.String r1 = "mutual"
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2, r3, r4, r5}
            java.util.Map r0 = defpackage.AbstractC1893.m3321(r0)
            defpackage.C2296.f9718 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            defpackage.C2296.f9716 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3728(java.util.LinkedHashMap r14) {
            r0 = -482277867298350(0xfffe495eef0961d2, double:NaN)
            java.util.Map r0 = defpackage.C2296.f9718
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d5
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.get(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 != 0) goto L33
            goto L12
        L33:
            ᲈᛷᲁᛳ r3 = defpackage.C2296.f9717
            r3.getClass()
            r3 = -482312227036718(0xfffe4956ef0961d2, double:NaN)
            java.lang.CharSequence r3 = r2.getText()
            r4 = 0
            if (r3 == 0) goto L5c
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L5c
            java.lang.CharSequence r3 = defpackage.AbstractC1347.m2521(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L5c
            java.lang.Long r3 = defpackage.AbstractC0056.m466(r3)
            goto L5d
        L5c:
            r3 = r4
        L5d:
            java.util.WeakHashMap r5 = defpackage.C2296.f9716
            java.lang.Object r6 = r5.get(r2)
            ᲁᲇᛵᛵ r6 = (defpackage.C1944) r6
            if (r6 == 0) goto L76
            java.lang.Long r7 = r6.f8460
            boolean r7 = defpackage.AbstractC0498.m1280(r3, r7)
            if (r7 == 0) goto L76
            long r6 = r6.f8459
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            goto L8f
        L76:
            if (r3 == 0) goto L85
            long r6 = r3.longValue()
            ᲁᲇᛵᛵ r8 = new ᲁᲇᛵᛵ
            r8.<init>(r6, r4)
            r5.put(r2, r8)
            goto L8f
        L85:
            if (r6 == 0) goto L8e
            long r6 = r6.f8459
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            goto L8f
        L8e:
            r3 = r4
        L8f:
            if (r3 == 0) goto L12
            long r6 = r3.longValue()
            r8 = -481715226582574(0xfffe49e1ef0961d2, double:NaN)
            ᛶᲀᛵ r3 = defpackage.C1141.f5173
            r3.getClass()
            ᲀᲇᛸᛶ r3 = defpackage.C1141.f5195
            ᲁᛷᛶᛶ[] r8 = defpackage.C1141.f5221
            r9 = 136(0x88, float:1.9E-43)
            r8 = r8[r9]
            java.lang.Object r3 = r3.m3169(r8)
            java.lang.String r3 = (java.lang.String) r3
            boolean r8 = defpackage.AbstractC1347.m2524(r3)
            if (r8 == 0) goto Lb8
            goto L1ba
        Lb8:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L13f
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L13f
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch: java.lang.Throwable -> L13f
            if (r1 != 0) goto Lc6
            r1 = r4
            goto L18b
        Lc6:
            r8 = -481732406451758(0xfffe49ddef0961d2, double:NaN)
            java.lang.String r3 = "mode"     // Catch: java.lang.Throwable -> L13f
            r8 = -481753881288238(0xfffe49d8ef0961d2, double:NaN)
            java.lang.String r8 = "direct"     // Catch: java.lang.Throwable -> L13f
            java.lang.String r3 = r1.optString(r3, r8)     // Catch: java.lang.Throwable -> L13f
            r8 = -481783946059310(0xfffe49d1ef0961d2, double:NaN)
            r8 = -482123248475694(0xfffe4982ef0961d2, double:NaN)
            r8 = -482144723312174(0xfffe497def0961d2, double:NaN)
            java.lang.String r8 = "add"     // Catch: java.lang.Throwable -> L13f
            boolean r8 = r3.equals(r8)     // Catch: java.lang.Throwable -> L13f
            if (r8 != 0) goto L114
            r8 = -482161903181358(0xfffe4979ef0961d2, double:NaN)
            java.lang.String r8 = "subtract"     // Catch: java.lang.Throwable -> L13f
            boolean r8 = r3.equals(r8)     // Catch: java.lang.Throwable -> L13f
            if (r8 == 0) goto L10b
            goto L114
        L10b:
            r8 = -482200557887022(0xfffe4970ef0961d2, double:NaN)
            java.lang.String r3 = "direct"     // Catch: java.lang.Throwable -> L13f
        L114:
            r8 = -481848370568750(0xfffe49c2ef0961d2, double:NaN)
            java.lang.String r8 = "value"     // Catch: java.lang.Throwable -> L13f
            r9 = -481874140372526(0xfffe49bcef0961d2, double:NaN)
            java.lang.String r9 = "0"     // Catch: java.lang.Throwable -> L13f
            java.lang.String r1 = r1.optString(r8, r9)     // Catch: java.lang.Throwable -> L13f
            r8 = -481882730307118(0xfffe49baef0961d2, double:NaN)
            java.lang.Long r1 = defpackage.AbstractC0056.m466(r1)     // Catch: java.lang.Throwable -> L13f
            r8 = 0
            if (r1 == 0) goto L141
            long r10 = r1.longValue()     // Catch: java.lang.Throwable -> L13f
            goto L142
        L13f:
            r1 = move-exception
            goto L185
        L141:
            r10 = r8
        L142:
            r12 = -338740060266030(0xfffecbeaef0961d2, double:NaN)
            r12 = -481947154816558(0xfffe49abef0961d2, double:NaN)
            java.lang.String r1 = "add"     // Catch: java.lang.Throwable -> L13f
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L13f
            if (r1 == 0) goto L161
            long r10 = r10 + r6
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L15f
            goto L180
        L15f:
            r8 = r10
            goto L180
        L161:
            r12 = -481964334685742(0xfffe49a7ef0961d2, double:NaN)
            java.lang.String r1 = "subtract"     // Catch: java.lang.Throwable -> L13f
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L13f
            if (r1 == 0) goto L17c
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L175
            r10 = r8
        L175:
            long r10 = r6 - r10
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L15f
            goto L180
        L17c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L15f
        L180:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L13f
            goto L18b
        L185:
            ᛴᛸᛲᲀ r3 = new ᛴᛸᛲᲀ
            r3.<init>(r1)
            r1 = r3
        L18b:
            java.lang.Throwable r3 = defpackage.C2165.m3569(r1)
            if (r3 == 0) goto L1b2
            r8 = -482002989391406(0xfffe499eef0961d2, double:NaN)
            java.lang.String r8 = "getFansCountMockValue error"
            r9 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r9 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r9 = defpackage.C0346.f1773
            r9.getClass()
            defpackage.C0346.m1038(r8, r3)
        L1b2:
            boolean r3 = r1 instanceof defpackage.C0723
            if (r3 == 0) goto L1b7
            goto L1b8
        L1b7:
            r4 = r1
        L1b8:
            java.lang.Long r4 = (java.lang.Long) r4
        L1ba:
            if (r4 == 0) goto L12
            long r3 = r4.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r2.setText(r1)
            ᲁᲇᛵᛵ r1 = new ᲁᲇᛵᛵ
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.<init>(r6, r3)
            r5.put(r2, r1)
            goto L12
        L1d5:
            return
    }
}
