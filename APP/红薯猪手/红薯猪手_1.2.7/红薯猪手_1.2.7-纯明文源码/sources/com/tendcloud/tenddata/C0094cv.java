package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0089cq;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cv */
/* JADX INFO: loaded from: classes.dex */
public class C0094cv extends AbstractC0097cy {
    public C0094cv(String str, String str2) {
        m473a("domain", str);
        m473a("name", str2);
    }

    public void setData(Map<String, Object> map) {
        if (map != null) {
            m473a(C0089cq.a.DATA, (Object) new JSONObject(map));
        }
    }
}
