package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class dc extends com.tendcloud.tenddata.cy {
    public dc() {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r0 = com.tendcloud.tenddata.j.a(r0)
            java.lang.String r1 = "tid"
            r2.a(r1, r0)
            return
    }

    public void a() {
            r11 = this;
            java.lang.String r0 = "meid5"
            java.lang.String r1 = "meid"
            java.lang.String r2 = "imei5"
            java.lang.String r3 = "imei"
            java.lang.String r4 = "serialNo"
            java.lang.String r5 = com.tendcloud.tenddata.l.a(r4)
            r11.a(r4, r5)
            android.content.Context r4 = com.tendcloud.tenddata.ab.g
            java.lang.String r4 = com.tendcloud.tenddata.l.b(r4)
            java.lang.String r5 = "adId"
            r11.a(r5, r4)
            android.content.Context r4 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Exception -> Lcb
            org.json.JSONArray r4 = com.tendcloud.tenddata.o.A(r4)     // Catch: java.lang.Exception -> Lcb
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lcb
            r5.<init>()     // Catch: java.lang.Exception -> Lcb
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lcb
            r6.<init>()     // Catch: java.lang.Exception -> Lcb
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lcb
            r7.<init>()     // Catch: java.lang.Exception -> Lcb
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lcb
            r8.<init>()     // Catch: java.lang.Exception -> Lcb
            if (r4 == 0) goto Lb7
            int r9 = r4.length()     // Catch: java.lang.Exception -> Lcb
            if (r9 <= 0) goto Lb7
            r9 = 0
            org.json.JSONObject r9 = r4.getJSONObject(r9)     // Catch: java.lang.Exception -> Lcb
            boolean r10 = r9.has(r3)     // Catch: java.lang.Exception -> Lcb
            if (r10 == 0) goto L50
            java.lang.Object r10 = r9.get(r3)     // Catch: java.lang.Exception -> Lcb
            r5.put(r10)     // Catch: java.lang.Exception -> Lcb
        L50:
            boolean r10 = r9.has(r2)     // Catch: java.lang.Exception -> Lcb
            if (r10 == 0) goto L5d
            java.lang.Object r10 = r9.get(r2)     // Catch: java.lang.Exception -> Lcb
            r6.put(r10)     // Catch: java.lang.Exception -> Lcb
        L5d:
            boolean r10 = r9.has(r1)     // Catch: java.lang.Exception -> Lcb
            if (r10 == 0) goto L6a
            java.lang.Object r10 = r9.get(r1)     // Catch: java.lang.Exception -> Lcb
            r7.put(r10)     // Catch: java.lang.Exception -> Lcb
        L6a:
            boolean r10 = r9.has(r0)     // Catch: java.lang.Exception -> Lcb
            if (r10 == 0) goto L77
            java.lang.Object r9 = r9.get(r0)     // Catch: java.lang.Exception -> Lcb
            r8.put(r9)     // Catch: java.lang.Exception -> Lcb
        L77:
            int r9 = r4.length()     // Catch: java.lang.Exception -> Lcb
            r10 = 2
            if (r9 != r10) goto Lb7
            r9 = 1
            org.json.JSONObject r4 = r4.getJSONObject(r9)     // Catch: java.lang.Exception -> Lcb
            boolean r9 = r4.has(r3)     // Catch: java.lang.Exception -> Lcb
            if (r9 == 0) goto L90
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.Exception -> Lcb
            r5.put(r3)     // Catch: java.lang.Exception -> Lcb
        L90:
            boolean r3 = r4.has(r2)     // Catch: java.lang.Exception -> Lcb
            if (r3 == 0) goto L9d
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Exception -> Lcb
            r6.put(r2)     // Catch: java.lang.Exception -> Lcb
        L9d:
            boolean r2 = r4.has(r1)     // Catch: java.lang.Exception -> Lcb
            if (r2 == 0) goto Laa
            java.lang.Object r1 = r4.get(r1)     // Catch: java.lang.Exception -> Lcb
            r7.put(r1)     // Catch: java.lang.Exception -> Lcb
        Laa:
            boolean r1 = r4.has(r0)     // Catch: java.lang.Exception -> Lcb
            if (r1 == 0) goto Lb7
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Exception -> Lcb
            r8.put(r0)     // Catch: java.lang.Exception -> Lcb
        Lb7:
            java.lang.String r0 = "imeis"
            r11.a(r0, r5)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r0 = "imeis5"
            r11.a(r0, r6)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r0 = "meids"
            r11.a(r0, r7)     // Catch: java.lang.Exception -> Lcb
            java.lang.String r0 = "meids5"
            r11.a(r0, r8)     // Catch: java.lang.Exception -> Lcb
        Lcb:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r1 = "mac"
            java.lang.String r1 = com.tendcloud.tenddata.l.a(r1)
            r0.put(r1)
            java.lang.String r1 = "wifiMacs"
            r11.a(r1, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r1 = "ethMac"
            java.lang.String r1 = com.tendcloud.tenddata.l.a(r1)
            r0.put(r1)
            java.lang.String r1 = "ethMacs"
            r11.a(r1, r0)
            java.lang.String r0 = "androidId"
            java.lang.String r1 = com.tendcloud.tenddata.l.a(r0)
            r11.a(r0, r1)
            com.tendcloud.tenddata.df r0 = com.tendcloud.tenddata.df.a()
            java.lang.Object r0 = r0.b()
            java.lang.String r1 = "msaIds"
            r11.a(r1, r0)
            return
    }
}
