package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataOrder extends JSONObject {

    /* JADX INFO: renamed from: a */
    private static final String f30a = "id";

    /* JADX INFO: renamed from: b */
    private static final String f31b = "category";

    /* JADX INFO: renamed from: c */
    private static final String f32c = "name";

    /* JADX INFO: renamed from: d */
    private static final String f33d = "unitPrice";

    /* JADX INFO: renamed from: e */
    private static final String f34e = "count";
    public static final String keyCurrencyType = "keyCurrencyType";
    public static final String keyOrderDetail = "keyOrderDetail";
    public static final String keyOrderId = "keyOrderId";
    public static final String keyTotalPrice = "keyTotalPrice";

    /* JADX INFO: renamed from: f */
    private JSONArray f35f = null;

    private TalkingDataOrder() {
    }

    private TalkingDataOrder(String str, int i, String str2) {
        try {
            put(keyOrderId, str);
            put(keyTotalPrice, i);
            put(keyCurrencyType, str2);
        } catch (JSONException unused) {
        }
    }

    public static TalkingDataOrder createOrder(String str, int i, String str2) {
        try {
            C0115h.iForDeveloper("createOrder called --> orderId: " + str + " ,totalPrice: " + i + " ,currencyType: " + str2);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            C0115h.eForDeveloper("createOrder: orderId could not be null or empty");
            return null;
        }
        if (TextUtils.isEmpty(str2) || str2.trim().length() != 3) {
            C0115h.eForDeveloper("createOrder: currencyType length must be 3 ,likes CNY");
            return null;
        }
        return new TalkingDataOrder(str, i, str2);
    }

    public synchronized TalkingDataOrder addItem(String str, String str2, int i, int i2) {
        try {
            if (this.f35f == null) {
                JSONArray jSONArray = new JSONArray();
                this.f35f = jSONArray;
                put(keyOrderDetail, jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(f31b, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(f32c, str2);
            }
            jSONObject.put(f33d, i);
            jSONObject.put(f34e, i2);
            this.f35f.put(jSONObject);
        } catch (JSONException unused) {
        }
        return this;
    }

    public synchronized TalkingDataOrder addItem(String str, String str2, String str3, int i, int i2) {
        try {
            if (this.f35f == null) {
                JSONArray jSONArray = new JSONArray();
                this.f35f = jSONArray;
                put(keyOrderDetail, jSONArray);
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(f30a, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(f31b, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(f32c, str3);
            }
            jSONObject.put(f33d, i);
            jSONObject.put(f34e, i2);
            this.f35f.put(jSONObject);
        } catch (JSONException unused) {
        }
        return this;
    }
}
