package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class ak {
    private static volatile java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> a = null;
    private static final java.lang.String b = "TD_IP_CACHE";
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;

    public static class a {
        public static final int resolvedIp = 1;
        public static final int savedIp = 3;
        public static final int staticIp = 4;
        public static final int successIp = 2;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.ak.a = r0
            return
    }

    public ak() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.d = r0
            r1.e = r0
            r1.f = r0
            r1.g = r0
            return
    }

    public static synchronized java.lang.String a(java.lang.String r3, int r4) {
            java.lang.Class<com.tendcloud.tenddata.ak> r0 = com.tendcloud.tenddata.ak.class
            monitor-enter(r0)
            boolean r1 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> L45
            r2 = 0
            if (r1 != 0) goto L43
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L13
            goto L43
        L13:
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L19
            monitor-exit(r0)
            return r2
        L19:
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L45
            com.tendcloud.tenddata.ak r3 = (com.tendcloud.tenddata.ak) r3     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L25
            monitor-exit(r0)
            return r2
        L25:
            r1 = 1
            if (r4 == r1) goto L3f
            r1 = 2
            if (r4 == r1) goto L3b
            r1 = 3
            if (r4 == r1) goto L37
            r1 = 4
            if (r4 == r1) goto L33
            monitor-exit(r0)
            return r2
        L33:
            java.lang.String r3 = r3.c     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            return r3
        L37:
            java.lang.String r3 = r3.e     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            return r3
        L3b:
            java.lang.String r3 = r3.f     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            return r3
        L3f:
            java.lang.String r3 = r3.d     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            return r3
        L43:
            monitor-exit(r0)
            return r2
        L45:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public static java.net.URL a(java.net.URL r3, java.lang.String r4) {
            boolean r0 = com.tendcloud.tenddata.o.b()
            if (r0 == 0) goto L7
            return r3
        L7:
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r3.getProtocol()
            int r2 = r3.getPort()
            java.lang.String r3 = r3.getFile()
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    public static void a(java.lang.String r6) {
            r0 = 1
            java.lang.String r1 = a(r6, r0)
            if (r1 == 0) goto L2c
            r2 = 3
            java.lang.String r3 = a(r6, r2)
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L2c
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            if (r1 == 0) goto L2c
            java.lang.String r1 = com.tendcloud.tenddata.y.e(r6)
            java.lang.String r3 = a(r6, r0)
            android.content.Context r4 = com.tendcloud.tenddata.ab.g
            java.lang.String r5 = "TD_IP_CACHE"
            com.tendcloud.tenddata.s.a(r4, r5, r1, r3)
            java.lang.String r0 = a(r6, r0)
            a(r6, r0, r2)
        L2c:
            return
    }

    public static void a(java.lang.String r3, java.lang.String r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L13
            java.lang.String r0 = com.tendcloud.tenddata.y.e(r3)
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            java.lang.String r2 = "TD_IP_CACHE"
            com.tendcloud.tenddata.s.a(r1, r2, r0, r4)
            r0 = 2
            a(r3, r4, r0)
        L13:
            return
    }

    public static synchronized void a(java.lang.String r2, java.lang.String r3, int r4) {
            java.lang.Class<com.tendcloud.tenddata.ak> r0 = com.tendcloud.tenddata.ak.class
            monitor-enter(r0)
            boolean r1 = com.tendcloud.tenddata.y.b(r2)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L3a
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L12
            goto L3a
        L12:
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L18
            monitor-exit(r0)
            return
        L18:
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.ak r2 = (com.tendcloud.tenddata.ak) r2     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            if (r4 == r1) goto L36
            r1 = 2
            if (r4 == r1) goto L33
            r1 = 3
            if (r4 == r1) goto L30
            r1 = 4
            if (r4 == r1) goto L2d
            goto L38
        L2d:
            r2.c = r3     // Catch: java.lang.Throwable -> L3c
            goto L38
        L30:
            r2.e = r3     // Catch: java.lang.Throwable -> L3c
            goto L38
        L33:
            r2.f = r3     // Catch: java.lang.Throwable -> L3c
            goto L38
        L36:
            r2.d = r3     // Catch: java.lang.Throwable -> L3c
        L38:
            monitor-exit(r0)
            return
        L3a:
            monitor-exit(r0)
            return
        L3c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static java.lang.String b(java.lang.String r0) {
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.getHostAddress()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static synchronized void b(java.lang.String r4, java.lang.String r5) {
            java.lang.Class<com.tendcloud.tenddata.ak> r0 = com.tendcloud.tenddata.ak.class
            monitor-enter(r0)
            boolean r1 = com.tendcloud.tenddata.y.b(r4)     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L41
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L43
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L12
            goto L41
        L12:
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r1 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L43
            if (r1 != 0) goto L18
            monitor-exit(r0)
            return
        L18:
            com.tendcloud.tenddata.ak r1 = new com.tendcloud.tenddata.ak     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            r1.g = r4     // Catch: java.lang.Throwable -> L3f
            r1.c = r5     // Catch: java.lang.Throwable -> L3f
            android.content.Context r5 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "TD_IP_CACHE"
            java.lang.String r4 = com.tendcloud.tenddata.y.e(r4)     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            java.lang.String r4 = com.tendcloud.tenddata.s.b(r5, r2, r4, r3)     // Catch: java.lang.Throwable -> L3f
            r1.e = r4     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r1.g     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = b(r4)     // Catch: java.lang.Throwable -> L3f
            r1.d = r4     // Catch: java.lang.Throwable -> L3f
            java.util.HashMap<java.lang.String, com.tendcloud.tenddata.ak> r4 = com.tendcloud.tenddata.ak.a     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = r1.g     // Catch: java.lang.Throwable -> L3f
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L3f
        L3f:
            monitor-exit(r0)
            return
        L41:
            monitor-exit(r0)
            return
        L43:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }
}
