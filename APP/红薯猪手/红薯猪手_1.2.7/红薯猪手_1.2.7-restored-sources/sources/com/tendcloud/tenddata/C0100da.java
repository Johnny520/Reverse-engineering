package com.tendcloud.tenddata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.da */
/* JADX INFO: loaded from: classes.dex */
public class C0100da extends AbstractC0097cy {

    /* JADX INFO: renamed from: a */
    public static final String f454a = "accounts";

    /* JADX INFO: renamed from: a */
    public void m478a() {
        m473a(f454a, C0130x.m741d(C0020ab.f132g));
    }

    /* JADX INFO: renamed from: c */
    public void m479c() {
        try {
            if (((JSONObject) mo467b()).has(f454a)) {
                return;
            }
            m473a(f454a, C0130x.m741d(C0020ab.f132g));
        } catch (Throwable unused) {
        }
    }

    public void setUserAccount(C0093cu c0093cu) {
        if (c0093cu == null || c0093cu.mo467b() == null) {
            return;
        }
        if (this.f433b.isNull(f454a)) {
            new JSONArray().put(c0093cu.mo467b());
            m473a(f454a, c0093cu.mo467b());
        } else {
            try {
                this.f433b.getJSONArray(f454a).put(c0093cu.mo467b());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
