package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public abstract class cy {
    public org.json.JSONObject b;

    public cy() {
            r1 = this;
            r1.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1.b = r0
            return
    }

    public void a(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = r1.a(r3)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto La
            return
        La:
            org.json.JSONObject r0 = r1.b     // Catch: java.lang.Throwable -> Lf
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public void a(java.lang.String r2, org.json.JSONObject r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            boolean r0 = r3.has(r2)     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Lc
            r3.remove(r2)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public boolean a(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.json.JSONObject
            r1 = 1
            if (r0 == 0) goto Le
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r3 = r3.length()
            if (r3 > 0) goto L1b
            return r1
        Le:
            boolean r0 = r3 instanceof org.json.JSONArray
            if (r0 == 0) goto L1b
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r3 = r3.length()
            if (r3 > 0) goto L1b
            return r1
        L1b:
            r3 = 0
            return r3
    }

    public java.lang.Object b() {
            r1 = this;
            org.json.JSONObject r0 = r1.b
            return r0
    }
}
