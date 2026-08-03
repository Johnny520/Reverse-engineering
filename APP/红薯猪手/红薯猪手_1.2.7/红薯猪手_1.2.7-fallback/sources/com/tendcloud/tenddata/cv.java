package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cv extends com.tendcloud.tenddata.cy {
    public cv(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "domain"
            r1.a(r0, r2)
            java.lang.String r2 = "name"
            r1.a(r2, r3)
            return
    }

    public void setData(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            java.lang.String r2 = "data"
            r1.a(r2, r0)
        Lc:
            return
    }
}
