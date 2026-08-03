package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0097cy {

    /* JADX INFO: renamed from: b */
    public JSONObject f433b = new JSONObject();

    /* JADX INFO: renamed from: a */
    public void m473a(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (m475a(obj)) {
                return;
            }
            this.f433b.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m474a(String str, JSONObject jSONObject) {
        if (str == null) {
            return;
        }
        try {
            if (jSONObject.has(str)) {
                jSONObject.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m475a(Object obj) {
        return obj instanceof JSONObject ? ((JSONObject) obj).length() <= 0 : (obj instanceof JSONArray) && ((JSONArray) obj).length() <= 0;
    }

    /* JADX INFO: renamed from: b */
    public Object mo467b() {
        return this.f433b;
    }
}
