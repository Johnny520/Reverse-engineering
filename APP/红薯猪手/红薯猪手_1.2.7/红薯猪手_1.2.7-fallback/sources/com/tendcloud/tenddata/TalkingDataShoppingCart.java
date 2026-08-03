package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataShoppingCart extends org.json.JSONArray {
    private static final java.lang.String a = "id";
    private static final java.lang.String b = "category";
    private static final java.lang.String c = "name";
    private static final java.lang.String d = "unitPrice";
    private static final java.lang.String e = "count";

    private TalkingDataShoppingCart() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.tendcloud.tenddata.TalkingDataShoppingCart createShoppingCart() {
            com.tendcloud.tenddata.TalkingDataShoppingCart r0 = new com.tendcloud.tenddata.TalkingDataShoppingCart
            r0.<init>()
            return r0
    }

    public synchronized com.tendcloud.tenddata.TalkingDataShoppingCart addItem(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r2 = this;
            monitor-enter(r2)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            if (r1 != 0) goto L11
            java.lang.String r1 = "id"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
        L11:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            if (r3 != 0) goto L1c
            java.lang.String r3 = "category"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
        L1c:
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            if (r3 != 0) goto L27
            java.lang.String r3 = "name"
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
        L27:
            java.lang.String r3 = "unitPrice"
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            java.lang.String r3 = "count"
            r0.put(r3, r7)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            r2.put(r0)     // Catch: java.lang.Throwable -> L35 org.json.JSONException -> L37
            goto L3b
        L35:
            r3 = move-exception
            goto L3d
        L37:
            r3 = move-exception
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L35
        L3b:
            monitor-exit(r2)
            return r2
        L3d:
            monitor-exit(r2)
            throw r3
    }
}
