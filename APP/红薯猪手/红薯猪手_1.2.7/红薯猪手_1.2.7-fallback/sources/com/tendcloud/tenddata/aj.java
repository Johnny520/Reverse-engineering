package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class aj {
    private static final java.lang.String a = "https://dns.qq.com";
    private static final java.lang.String b = "biYRrllT";
    private static final java.lang.String c = "3658";
    private static final java.lang.String d = "DES";
    private static final java.lang.String e = "DES/ECB/PKCS5Padding";
    private static final java.lang.String f = "utf-8";
    private static final java.lang.String g = "TD_ts_cache_profile";
    private static final long h = 86400000;
    private static java.util.Map<java.lang.String, java.lang.Integer> i;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.tendcloud.tenddata.aj.i = r0
            return
    }

    public aj() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "https://dns.qq.com"
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "/d?dn="
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = f(r2)     // Catch: java.lang.Throwable -> L4e
            r0.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "&id="
            r0.append(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "3658"
            r0.append(r2)     // Catch: java.lang.Throwable -> L4e
            com.tendcloud.tenddata.am$a r2 = com.tendcloud.tenddata.al.a()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            com.tendcloud.tenddata.am$a r2 = r2.url(r0)     // Catch: java.lang.Throwable -> L4e
            com.tendcloud.tenddata.aq r0 = com.tendcloud.tenddata.aq.a     // Catch: java.lang.Throwable -> L4e
            com.tendcloud.tenddata.am$a r2 = r2.method(r0)     // Catch: java.lang.Throwable -> L4e
            com.tendcloud.tenddata.am r2 = r2.build()     // Catch: java.lang.Throwable -> L4e
            com.tendcloud.tenddata.ar r2 = com.tendcloud.tenddata.al.a(r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L4e
            byte[] r2 = r2.c()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "utf-8"
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = d(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = e(r2)     // Catch: java.lang.Throwable -> L4e
            return r2
        L4e:
            r2 = 0
            return r2
    }

    public static int b(java.lang.String r2) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.tendcloud.tenddata.aj.i     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L12
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.tendcloud.tenddata.aj.i     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L12
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L12
        L12:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = com.tendcloud.tenddata.aj.i
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public static boolean c(java.lang.String r4) {
            java.lang.String r4 = com.tendcloud.tenddata.y.e(r4)     // Catch: java.lang.Throwable -> L1c
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "TD_ts_cache_profile"
            r2 = 0
            long r0 = com.tendcloud.tenddata.s.b(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> L1c
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1c
            long r2 = r2 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L1c
            r4 = 1
            return r4
        L1c:
            r4 = 0
            return r4
    }

    private static java.lang.String d(java.lang.String r3) {
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "biYRrllT"
            java.lang.String r2 = "utf-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "DES"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "DES/ECB/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L27
            r2 = 2
            r1.init(r2, r0)     // Catch: java.lang.Throwable -> L27
            byte[] r3 = com.tendcloud.tenddata.y.d(r3)     // Catch: java.lang.Throwable -> L27
            byte[] r3 = r1.doFinal(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L27
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L27
            return r0
        L27:
            r3 = 0
            return r3
    }

    private static java.lang.String e(java.lang.String r4) {
            boolean r0 = com.tendcloud.tenddata.y.b(r4)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1c
            java.lang.String r0 = ";"
            java.lang.String[] r4 = r4.split(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.length     // Catch: java.lang.Throwable -> L1c
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L1c
            boolean r3 = g(r2)     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L19
            return r2
        L19:
            int r1 = r1 + 1
            goto Le
        L1c:
            r4 = 0
            return r4
    }

    private static java.lang.String f(java.lang.String r4) {
            java.lang.String r0 = "utf-8"
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "biYRrllT"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "DES"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "DES/ECB/PKCS5Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Throwable -> L26
            r3 = 1
            r2.init(r3, r1)     // Catch: java.lang.Throwable -> L26
            byte[] r4 = r4.getBytes(r0)     // Catch: java.lang.Throwable -> L26
            byte[] r4 = r2.doFinal(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = com.tendcloud.tenddata.y.a(r4)     // Catch: java.lang.Throwable -> L26
            return r4
        L26:
            r4 = 0
            return r4
    }

    private static boolean g(java.lang.String r2) {
            r0 = 1
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r2)     // Catch: java.lang.Throwable -> L21
            byte[] r2 = r2.getAddress()     // Catch: java.lang.Throwable -> L21
            java.net.InetAddress r2 = java.net.InetAddress.getByAddress(r2)     // Catch: java.lang.Throwable -> L21
            boolean r1 = r2.isSiteLocalAddress()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L21
            boolean r1 = r2.isLoopbackAddress()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L21
            boolean r2 = r2.isAnyLocalAddress()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    public static void updateFailureCountWithHost(java.lang.String r2) {
            int r0 = b(r2)
            int r0 = r0 + 1
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.tendcloud.tenddata.aj.i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            return
    }

    public static void updateTimeStamp(java.lang.String r4) {
            java.lang.String r4 = com.tendcloud.tenddata.y.e(r4)     // Catch: java.lang.Throwable -> Lf
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "TD_ts_cache_profile"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf
            com.tendcloud.tenddata.s.a(r0, r1, r4, r2)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }
}
