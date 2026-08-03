package com.tendcloud.tenddata;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ct */
/* JADX INFO: loaded from: classes.dex */
public class C0092ct extends AbstractC0097cy {

    /* JADX INFO: renamed from: a */
    public static C0092ct f422a;

    private C0092ct() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0092ct m466a() {
        if (f422a == null) {
            f422a = new C0092ct();
        }
        return f422a;
    }

    @Override // com.tendcloud.tenddata.AbstractC0097cy
    /* JADX INFO: renamed from: b */
    public Object mo467b() {
        String strM561m;
        try {
            if (!f422a.f433b.has("account") && (strM561m = C0116i.m561m()) != null) {
                f422a.m473a("account", (Object) new JSONObject(strM561m));
            }
        } catch (Throwable unused) {
        }
        return super.mo467b();
    }

    public void setCurrentPageName(String str) {
        m473a("page", str);
    }

    public void setDeepLink(String str) {
        try {
            m473a("deeplink", str);
        } catch (Throwable unused) {
        }
    }

    public void setProfile(JSONObject jSONObject) {
        m473a("account", (Object) jSONObject);
    }

    public void setSessionId(String str) {
        m473a("sessionId", str);
    }

    public void setSessionStartTime(long j) {
        m473a("sessionStartTime", Long.valueOf(j));
    }

    public void setSubprofile(JSONObject jSONObject) {
        m473a("subaccount", (Object) jSONObject);
    }
}
