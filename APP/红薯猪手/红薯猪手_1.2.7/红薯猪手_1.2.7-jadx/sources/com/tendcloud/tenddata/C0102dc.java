package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.dc */
/* JADX INFO: loaded from: classes.dex */
public class C0102dc extends AbstractC0097cy {
    public C0102dc() {
        m473a("tid", C0117j.m570a(C0020ab.f132g));
    }

    /* JADX INFO: renamed from: a */
    public void m481a() {
        m473a("serialNo", C0119l.m640a("serialNo"));
        m473a("adId", C0119l.m645b(C0020ab.f132g));
        try {
            JSONArray jSONArrayM662A = C0122o.m662A(C0020ab.f132g);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            if (jSONArrayM662A != null && jSONArrayM662A.length() > 0) {
                JSONObject jSONObject = jSONArrayM662A.getJSONObject(0);
                if (jSONObject.has("imei")) {
                    jSONArray.put(jSONObject.get("imei"));
                }
                if (jSONObject.has("imei5")) {
                    jSONArray2.put(jSONObject.get("imei5"));
                }
                if (jSONObject.has("meid")) {
                    jSONArray3.put(jSONObject.get("meid"));
                }
                if (jSONObject.has("meid5")) {
                    jSONArray4.put(jSONObject.get("meid5"));
                }
                if (jSONArrayM662A.length() == 2) {
                    JSONObject jSONObject2 = jSONArrayM662A.getJSONObject(1);
                    if (jSONObject2.has("imei")) {
                        jSONArray.put(jSONObject2.get("imei"));
                    }
                    if (jSONObject2.has("imei5")) {
                        jSONArray2.put(jSONObject2.get("imei5"));
                    }
                    if (jSONObject2.has("meid")) {
                        jSONArray3.put(jSONObject2.get("meid"));
                    }
                    if (jSONObject2.has("meid5")) {
                        jSONArray4.put(jSONObject2.get("meid5"));
                    }
                }
            }
            m473a("imeis", jSONArray);
            m473a("imeis5", jSONArray2);
            m473a("meids", jSONArray3);
            m473a("meids5", jSONArray4);
        } catch (Exception unused) {
        }
        JSONArray jSONArray5 = new JSONArray();
        jSONArray5.put(C0119l.m640a("mac"));
        m473a("wifiMacs", jSONArray5);
        JSONArray jSONArray6 = new JSONArray();
        jSONArray6.put(C0119l.m640a("ethMac"));
        m473a("ethMacs", jSONArray6);
        m473a("androidId", C0119l.m640a("androidId"));
        m473a("msaIds", C0105df.m491a().mo467b());
    }
}
