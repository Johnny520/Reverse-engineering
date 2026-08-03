package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataOrder extends org.json.JSONObject {
    private static final java.lang.String a = "id";
    private static final java.lang.String b = "category";
    private static final java.lang.String c = "name";
    private static final java.lang.String d = "unitPrice";
    private static final java.lang.String e = "count";
    public static final java.lang.String keyCurrencyType = "keyCurrencyType";
    public static final java.lang.String keyOrderDetail = "keyOrderDetail";
    public static final java.lang.String keyOrderId = "keyOrderId";
    public static final java.lang.String keyTotalPrice = "keyTotalPrice";
    private org.json.JSONArray f;

    private TalkingDataOrder() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            return
    }

    private TalkingDataOrder(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            java.lang.String r0 = "keyOrderId"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L15
            java.lang.String r2 = "keyTotalPrice"
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L15
            java.lang.String r2 = "keyCurrencyType"
            r1.put(r2, r4)     // Catch: org.json.JSONException -> L15
        L15:
            return
    }

    public static com.tendcloud.tenddata.TalkingDataOrder createOrder(java.lang.String r3, int r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "createOrder called --> orderId: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            r0.append(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = " ,totalPrice: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            r0.append(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = " ,currencyType: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L48
            r0.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L48
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L48
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.String r0 = "createOrder: orderId could not be null or empty"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L48
            return r1
        L31:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L42
            java.lang.String r0 = r5.trim()     // Catch: java.lang.Throwable -> L48
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L48
            r2 = 3
            if (r0 == r2) goto L48
        L42:
            java.lang.String r0 = "createOrder: currencyType length must be 3 ,likes CNY"
            com.tendcloud.tenddata.h.eForDeveloper(r0)     // Catch: java.lang.Throwable -> L48
            return r1
        L48:
            com.tendcloud.tenddata.TalkingDataOrder r0 = new com.tendcloud.tenddata.TalkingDataOrder
            r0.<init>(r3, r4, r5)
            return r0
    }

    public synchronized com.tendcloud.tenddata.TalkingDataOrder addItem(java.lang.String r3, java.lang.String r4, int r5, int r6) {
            r2 = this;
            monitor-enter(r2)
            org.json.JSONArray r0 = r2.f     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            if (r0 != 0) goto L11
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            r2.f = r0     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            java.lang.String r1 = "keyOrderDetail"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
        L11:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            if (r1 != 0) goto L21
            java.lang.String r1 = "category"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
        L21:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            if (r3 != 0) goto L2c
            java.lang.String r3 = "name"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
        L2c:
            java.lang.String r3 = "unitPrice"
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            java.lang.String r3 = "count"
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            org.json.JSONArray r3 = r2.f     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            r3.put(r0)     // Catch: java.lang.Throwable -> L3c org.json.JSONException -> L3f
            goto L3f
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L3f:
            monitor-exit(r2)
            return r2
    }

    public synchronized com.tendcloud.tenddata.TalkingDataOrder addItem(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r2 = this;
            monitor-enter(r2)
            org.json.JSONArray r0 = r2.f     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            if (r0 != 0) goto L11
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            r2.f = r0     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            java.lang.String r1 = "keyOrderDetail"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
        L11:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            if (r1 != 0) goto L21
            java.lang.String r1 = "id"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
        L21:
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            if (r3 != 0) goto L2c
            java.lang.String r3 = "category"
            r0.put(r3, r4)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
        L2c:
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            if (r3 != 0) goto L37
            java.lang.String r3 = "name"
            r0.put(r3, r5)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
        L37:
            java.lang.String r3 = "unitPrice"
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            java.lang.String r3 = "count"
            r0.put(r3, r7)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            org.json.JSONArray r3 = r2.f     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            r3.put(r0)     // Catch: java.lang.Throwable -> L47 org.json.JSONException -> L4a
            goto L4a
        L47:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L4a:
            monitor-exit(r2)
            return r2
    }
}
