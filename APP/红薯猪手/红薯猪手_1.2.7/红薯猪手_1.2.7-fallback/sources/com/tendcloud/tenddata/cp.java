package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cp {
    public static java.util.HashMap<java.lang.String, java.lang.String> a;
    public static java.util.HashMap<java.lang.String, java.lang.String> b;
    public static java.lang.String c;
    public static byte[] d;
    private static volatile com.tendcloud.tenddata.cp e;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.cp.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.cp.b = r0
            java.lang.String r0 = "utf-8"
            com.tendcloud.tenddata.cp.c = r0
            r0 = 0
            com.tendcloud.tenddata.cp.e = r0
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L20
            com.tendcloud.tenddata.cp r1 = a()     // Catch: java.lang.Throwable -> L20
            r0.register(r1)     // Catch: java.lang.Throwable -> L20
        L20:
            return
    }

    private cp() {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r0 = com.tendcloud.tenddata.y.c(r0)
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L1a
            byte[] r0 = r0.getBytes()
            com.tendcloud.tenddata.cp.d = r0
            goto L22
        L1a:
            java.lang.String r0 = "ab"
            byte[] r0 = r0.getBytes()
            com.tendcloud.tenddata.cp.d = r0
        L22:
            return
    }

    public static com.tendcloud.tenddata.cp a() {
            com.tendcloud.tenddata.cp r0 = com.tendcloud.tenddata.cp.e
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.cp> r0 = com.tendcloud.tenddata.cp.class
            monitor-enter(r0)
            com.tendcloud.tenddata.cp r1 = com.tendcloud.tenddata.cp.e     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.cp r1 = new com.tendcloud.tenddata.cp     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.cp.e = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.cp r0 = com.tendcloud.tenddata.cp.e
            return r0
    }

    public java.util.TreeSet<com.tendcloud.tenddata.cq> a(com.tendcloud.tenddata.a r8) {
            r7 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1 = 0
            com.tendcloud.tenddata.cr r2 = com.tendcloud.tenddata.cr.a()     // Catch: java.lang.Throwable -> L94
            r3 = 100
            java.util.TreeSet r1 = r2.a(r8, r3, r1)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L3c
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L94
            if (r2 <= 0) goto L3c
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L94
        L1c:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L36
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L94
            com.tendcloud.tenddata.cq r4 = (com.tendcloud.tenddata.cq) r4     // Catch: java.lang.Throwable -> L94
            byte[] r5 = r4.c()     // Catch: java.lang.Throwable -> L1c
            byte[] r6 = com.tendcloud.tenddata.cp.d     // Catch: java.lang.Throwable -> L1c
            byte[] r5 = com.tendcloud.tenddata.y.b(r5, r6)     // Catch: java.lang.Throwable -> L1c
            r4.writeData(r5)     // Catch: java.lang.Throwable -> L1c
            goto L1c
        L36:
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L94
            r1.clear()     // Catch: java.lang.Throwable -> L94
        L3c:
            if (r1 != 0) goto L40
            r2 = 0
            goto L44
        L40:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L94
        L44:
            java.lang.Class<android.util.EventLogTags> r4 = android.util.EventLogTags.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L94
            if (r2 >= r3) goto L84
            com.tendcloud.tenddata.cr r5 = com.tendcloud.tenddata.cr.a()     // Catch: java.lang.Throwable -> L91
            int r3 = r3 - r2
            java.lang.String r2 = r8.getRootFolder()     // Catch: java.lang.Throwable -> L91
            java.util.TreeSet r8 = r5.a(r8, r3, r2)     // Catch: java.lang.Throwable -> L91
            if (r8 == 0) goto L83
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L80
            if (r1 <= 0) goto L83
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L80
        L62:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L80
            com.tendcloud.tenddata.cq r2 = (com.tendcloud.tenddata.cq) r2     // Catch: java.lang.Throwable -> L80
            byte[] r3 = r2.c()     // Catch: java.lang.Throwable -> L62
            byte[] r3 = com.tendcloud.tenddata.as.b(r3)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L62
            int r5 = r3.length     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L7c
            goto L62
        L7c:
            r2.writeData(r3)     // Catch: java.lang.Throwable -> L62
            goto L62
        L80:
            r0 = move-exception
            r1 = r8
            goto L92
        L83:
            r1 = r8
        L84:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L91
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L94
            if (r8 <= 0) goto L94
            if (r1 == 0) goto L94
            r1.addAll(r0)     // Catch: java.lang.Throwable -> L94
            goto L94
        L91:
            r0 = move-exception
        L92:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L94
        L94:
            return r1
    }

    public final synchronized void onTDEBEventDataStore(com.tendcloud.tenddata.bv r6) {
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L5
            monitor-exit(r5)
            return
        L5:
            com.tendcloud.tenddata.a r0 = r6.a     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.getMessageFormat()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "UNIFIED_SDK_JSON"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L5f
            com.tendcloud.tenddata.a r0 = r6.a     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L19
            monitor-exit(r5)
            return
        L19:
            com.tendcloud.tenddata.cv r0 = new com.tendcloud.tenddata.cv     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = r6.b     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r6.c     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5f
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.d     // Catch: java.lang.Throwable -> L5f
            r0.setData(r1)     // Catch: java.lang.Throwable -> L5f
            r1 = 0
            com.tendcloud.tenddata.a r2 = r6.a     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r2.name()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "BG"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L5f
            if (r2 != 0) goto L43
            com.tendcloud.tenddata.dk r1 = com.tendcloud.tenddata.dk.b()     // Catch: java.lang.Throwable -> L5f
            r2 = 1
            com.tendcloud.tenddata.a r3 = r6.a     // Catch: java.lang.Throwable -> L5f
            android.util.Pair<java.lang.String, org.json.JSONArray> r4 = r6.e     // Catch: java.lang.Throwable -> L5f
            org.json.JSONObject r1 = r1.a(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> L5f
        L43:
            if (r1 != 0) goto L47
            monitor-exit(r5)
            return
        L47:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L5f
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L5f
            byte[] r0 = com.tendcloud.tenddata.as.a(r0)     // Catch: java.lang.Throwable -> L5f
            com.tendcloud.tenddata.cq r1 = new com.tendcloud.tenddata.cq     // Catch: java.lang.Throwable -> L5f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            com.tendcloud.tenddata.cr r0 = com.tendcloud.tenddata.cr.a()     // Catch: java.lang.Throwable -> L5f
            r0.a(r1, r6)     // Catch: java.lang.Throwable -> L5f
        L5f:
            monitor-exit(r5)
            return
    }

    public void sendMessageFaild(com.tendcloud.tenddata.a r2) {
            r1 = this;
            com.tendcloud.tenddata.cr r0 = com.tendcloud.tenddata.cr.a()     // Catch: java.lang.Throwable -> L7
            r0.clearDataCache(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    public void sendMessageSuccess(com.tendcloud.tenddata.a r2) {
            r1 = this;
            com.tendcloud.tenddata.cr r0 = com.tendcloud.tenddata.cr.a()     // Catch: java.lang.Throwable -> L7
            r0.confirmRead(r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }
}
