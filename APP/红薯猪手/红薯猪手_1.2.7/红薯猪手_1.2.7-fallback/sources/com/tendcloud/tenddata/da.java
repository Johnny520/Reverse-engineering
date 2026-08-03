package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class da extends com.tendcloud.tenddata.cy {
    public static final java.lang.String a = "accounts";

    public da() {
            r0 = this;
            r0.<init>()
            return
    }

    public void a() {
            r2 = this;
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            org.json.JSONArray r0 = com.tendcloud.tenddata.x.d(r0)
            java.lang.String r1 = "accounts"
            r2.a(r1, r0)
            return
    }

    public void c() {
            r2 = this;
            java.lang.String r0 = "accounts"
            java.lang.Object r1 = r2.b()     // Catch: java.lang.Throwable -> L18
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.has(r0)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto Lf
            return
        Lf:
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L18
            org.json.JSONArray r1 = com.tendcloud.tenddata.x.d(r1)     // Catch: java.lang.Throwable -> L18
            r2.a(r0, r1)     // Catch: java.lang.Throwable -> L18
        L18:
            return
    }

    public void setUserAccount(com.tendcloud.tenddata.cu r4) {
            r3 = this;
            if (r4 == 0) goto L39
            java.lang.Object r0 = r4.b()
            if (r0 != 0) goto L9
            goto L39
        L9:
            org.json.JSONObject r0 = r3.b
            java.lang.String r1 = "accounts"
            boolean r0 = r0.isNull(r1)
            if (r0 == 0) goto L27
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r2 = r4.b()
            r0.put(r2)
            java.lang.Object r4 = r4.b()
            r3.a(r1, r4)
            goto L39
        L27:
            org.json.JSONObject r0 = r3.b     // Catch: org.json.JSONException -> L35
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch: org.json.JSONException -> L35
            java.lang.Object r4 = r4.b()     // Catch: org.json.JSONException -> L35
            r0.put(r4)     // Catch: org.json.JSONException -> L35
            goto L39
        L35:
            r4 = move-exception
            r4.printStackTrace()
        L39:
            return
    }
}
