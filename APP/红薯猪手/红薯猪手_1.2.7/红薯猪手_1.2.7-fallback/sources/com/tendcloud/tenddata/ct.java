package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class ct extends com.tendcloud.tenddata.cy {
    public static com.tendcloud.tenddata.ct a;

    private ct() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized com.tendcloud.tenddata.ct a() {
            java.lang.Class<com.tendcloud.tenddata.ct> r0 = com.tendcloud.tenddata.ct.class
            monitor-enter(r0)
            com.tendcloud.tenddata.ct r1 = com.tendcloud.tenddata.ct.a     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.tendcloud.tenddata.ct r1 = new com.tendcloud.tenddata.ct     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            com.tendcloud.tenddata.ct.a = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.tendcloud.tenddata.ct r1 = com.tendcloud.tenddata.ct.a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // com.tendcloud.tenddata.cy
    public java.lang.Object b() {
            r4 = this;
            java.lang.String r0 = "account"
            com.tendcloud.tenddata.ct r1 = com.tendcloud.tenddata.ct.a     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r1 = r1.b     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.has(r0)     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1c
            java.lang.String r1 = com.tendcloud.tenddata.i.m()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1c
            com.tendcloud.tenddata.ct r2 = com.tendcloud.tenddata.ct.a     // Catch: java.lang.Throwable -> L1c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L1c
        L1c:
            java.lang.Object r0 = super.b()
            return r0
    }

    public void setCurrentPageName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "page"
            r1.a(r0, r2)
            return
    }

    public void setDeepLink(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "deeplink"
            r1.a(r0, r2)     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public void setProfile(org.json.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "account"
            r1.a(r0, r2)
            return
    }

    public void setSessionId(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "sessionId"
            r1.a(r0, r2)
            return
    }

    public void setSessionStartTime(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "sessionStartTime"
            r0.a(r2, r1)
            return
    }

    public void setSubprofile(org.json.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "subaccount"
            r1.a(r0, r2)
            return
    }
}
