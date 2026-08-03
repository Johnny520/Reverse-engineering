package com.tendcloud.tenddata;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataShoppingCart extends JSONArray {

    /* JADX INFO: renamed from: a */
    private static final String f65a = "id";

    /* JADX INFO: renamed from: b */
    private static final String f66b = "category";

    /* JADX INFO: renamed from: c */
    private static final String f67c = "name";

    /* JADX INFO: renamed from: d */
    private static final String f68d = "unitPrice";

    /* JADX INFO: renamed from: e */
    private static final String f69e = "count";

    private TalkingDataShoppingCart() {
    }

    public static TalkingDataShoppingCart createShoppingCart() {
        return new TalkingDataShoppingCart();
    }

    public synchronized TalkingDataShoppingCart addItem(String str, String str2, String str3, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(f65a, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(f66b, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(f67c, str3);
            }
            jSONObject.put(f68d, i);
            jSONObject.put(f69e, i2);
            put(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }
}
