package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cw extends com.tendcloud.tenddata.cy {
    private static java.util.HashMap<java.lang.String, java.lang.Object> a;
    private static java.util.HashMap<java.lang.String, java.lang.Object> c;
    private static volatile com.tendcloud.tenddata.cw f;
    private final java.lang.String[] d;
    private final java.lang.String[] e;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.cw.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.cw.c = r0
            r0 = 0
            com.tendcloud.tenddata.cw.f = r0
            return
    }

    private cw() {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "PUSH"
            java.lang.String r1 = "EAuth"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r5.d = r0
            java.lang.String r0 = "APP"
            java.lang.String r1 = "TRACKING"
            java.lang.String r2 = "GAME"
            java.lang.String r3 = "BG"
            java.lang.String r4 = "SDK"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            r5.e = r0
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a()
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.lang.String r0 = r0.h(r1)
            java.lang.String r1 = "displayName"
            r5.a(r1, r0)
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a()
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.lang.String r0 = r0.a(r1)
            java.lang.String r1 = "globalId"
            r5.a(r1, r0)
            java.lang.String r0 = com.tendcloud.tenddata.i.k()
            java.lang.String r1 = "versionName"
            r5.a(r1, r0)
            int r0 = com.tendcloud.tenddata.i.j()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "versionCode"
            r5.a(r1, r0)
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a()
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            long r0 = r0.d(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "installTime"
            r5.a(r1, r0)
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a()
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            long r0 = r0.e(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "updateTime"
            r5.a(r1, r0)
            return
    }

    public static com.tendcloud.tenddata.cw a() {
            com.tendcloud.tenddata.cw r0 = com.tendcloud.tenddata.cw.f
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.cp> r0 = com.tendcloud.tenddata.cp.class
            monitor-enter(r0)
            com.tendcloud.tenddata.cw r1 = com.tendcloud.tenddata.cw.f     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.cw r1 = new com.tendcloud.tenddata.cw     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.cw.f = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.cw r0 = com.tendcloud.tenddata.cw.f
            return r0
    }

    private java.lang.Object a(com.tendcloud.tenddata.a r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L6b
            java.lang.String[] r1 = r4.d     // Catch: java.lang.Throwable -> L6b
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = r5.name()     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L35
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6b
            r2.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "appKey"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "service"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L6b
            r1.put(r2)     // Catch: java.lang.Throwable -> L6b
            boolean r0 = com.tendcloud.tenddata.y.b(r0)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L33
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L33
        L33:
            r0 = r1
            goto L6b
        L35:
            java.lang.String[] r1 = r4.e     // Catch: java.lang.Throwable -> L6b
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = r5.name()     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L55
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = com.tendcloud.tenddata.ab.a(r1, r5)     // Catch: java.lang.Throwable -> L6b
            boolean r1 = com.tendcloud.tenddata.y.b(r0)     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L6b
            r4.a(r0, r5)     // Catch: java.lang.Throwable -> L6b
            goto L6b
        L55:
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = com.tendcloud.tenddata.cw.a     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayList r1 = r4.c()     // Catch: java.lang.Throwable -> L6b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L6b
            com.tendcloud.tenddata.a r1 = (com.tendcloud.tenddata.a) r1     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L6b
            r0 = r5
        L6b:
            return r0
    }

    private java.util.ArrayList<com.tendcloud.tenddata.a> c() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.cw.a     // Catch: java.lang.Throwable -> L2b
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            com.tendcloud.tenddata.a r2 = com.tendcloud.tenddata.a.valueOf(r2)     // Catch: java.lang.Throwable -> L2b
            r0.add(r2)     // Catch: java.lang.Throwable -> L2b
            goto Lf
        L2b:
            return r0
    }

    public void a(java.lang.Object r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.cw.a
            java.lang.String r3 = r3.name()
            r0.put(r3, r2)
            return
    }

    public void b(java.lang.Object r2, com.tendcloud.tenddata.a r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.cw.c
            java.lang.String r3 = r3.name()
            r0.put(r3, r2)
            return
    }

    public void setAppChannel(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "channel"
            r1.a(r0, r2)
            return
    }

    public void setSubmitAppId(com.tendcloud.tenddata.a r3) {
            r2 = this;
            if (r3 == 0) goto L1f
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.cw.a     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r3.name()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1a
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.cw.a     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1f
            if (r1 <= 0) goto L1a
            java.lang.Object r0 = r2.a(r3)     // Catch: java.lang.Throwable -> L1f
        L1a:
            java.lang.String r3 = "appKey"
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public void setSubmitChannelId(com.tendcloud.tenddata.a r3) {
            r2 = this;
            if (r3 == 0) goto L31
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.cw.c     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r3.name()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L2b
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.cw.c     // Catch: java.lang.Throwable -> L36
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L36
            if (r0 <= 0) goto L2b
            java.util.HashMap<java.lang.String, java.lang.Object> r3 = com.tendcloud.tenddata.cw.c     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r0 = r2.c()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L36
            com.tendcloud.tenddata.a r0 = (com.tendcloud.tenddata.a) r0     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L36
        L2b:
            java.lang.String r0 = "channel"
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L36
            goto L36
        L31:
            java.lang.String r3 = "Default"
            r2.setAppChannel(r3)
        L36:
            return
    }

    public void setUniqueId(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "uniqueId"
            r1.a(r0, r2)
            return
    }
}
