package com.tendcloud.tenddata;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ap */
/* JADX INFO: loaded from: classes.dex */
public final class C0034ap {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f196a = new HashMap();

    /* JADX INFO: renamed from: a */
    public C0034ap m203a(String str, String str2) {
        this.f196a.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m204a(HttpURLConnection httpURLConnection) {
        try {
            if (C0131y.m754a(14) && C0131y.m764b(19)) {
                this.f196a.put("Connection", "close");
            }
            for (String str : this.f196a.keySet()) {
                httpURLConnection.setRequestProperty(str, this.f196a.get(str));
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return this.f196a.toString();
    }
}
