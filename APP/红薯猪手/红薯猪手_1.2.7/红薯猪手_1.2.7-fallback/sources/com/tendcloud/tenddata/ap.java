package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class ap {
    private java.util.Map<java.lang.String, java.lang.String> a;

    public ap() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public com.tendcloud.tenddata.ap a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.a
            r0.put(r2, r3)
            return r1
    }

    public void a(java.net.HttpURLConnection r4) {
            r3 = this;
            r0 = 14
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L19
            r0 = 19
            boolean r0 = com.tendcloud.tenddata.y.b(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L19
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.a     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "Connection"
            java.lang.String r2 = "close"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3b
        L19:
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.a     // Catch: java.lang.Throwable -> L3b
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3b
        L23:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3b
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.a     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L3b
            r4.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L3b
            goto L23
        L3b:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
