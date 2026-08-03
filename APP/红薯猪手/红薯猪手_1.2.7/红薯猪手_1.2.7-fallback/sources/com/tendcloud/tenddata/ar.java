package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class ar {
    private static final int a = 600;
    private int b;
    private byte[] c;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> d;

    private ar(int r2, java.lang.String r3) {
            r1 = this;
            byte[] r3 = r3.getBytes()
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private ar(int r1, byte[] r2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    public static int a() {
            r0 = 600(0x258, float:8.41E-43)
            return r0
    }

    private static com.tendcloud.tenddata.ar a(int r2, int r3, java.io.InputStream r4, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5) {
            r0 = -1
            if (r3 == r0) goto L9
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L25
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L25
            goto Le
        L9:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
        Le:
            int r3 = r4.read()     // Catch: java.lang.Throwable -> L25
            if (r3 == r0) goto L18
            r1.write(r3)     // Catch: java.lang.Throwable -> L25
            goto Le
        L18:
            r4.close()
            byte[] r3 = r1.toByteArray()
            com.tendcloud.tenddata.ar r4 = new com.tendcloud.tenddata.ar
            r4.<init>(r2, r3, r5)
            return r4
        L25:
            r2 = move-exception
            r4.close()
            throw r2
    }

    public static com.tendcloud.tenddata.ar a(java.lang.String r2) {
            com.tendcloud.tenddata.ar r0 = new com.tendcloud.tenddata.ar
            r1 = 600(0x258, float:8.41E-43)
            r0.<init>(r1, r2)
            return r0
    }

    public static com.tendcloud.tenddata.ar a(java.lang.String r11, java.net.HttpURLConnection r12, long r13, com.tendcloud.tenddata.an r15) {
            r0 = 0
            int r8 = r12.getResponseCode()     // Catch: java.lang.Throwable -> L2e
            r1 = 400(0x190, float:5.6E-43)
            if (r8 <= r1) goto Le
            java.io.InputStream r1 = r12.getErrorStream()     // Catch: java.lang.Throwable -> L30
            goto L12
        Le:
            java.io.InputStream r1 = r12.getInputStream()     // Catch: java.lang.Throwable -> L30
        L12:
            r9 = r1
            java.util.Map r1 = r12.getHeaderFields()     // Catch: java.lang.Throwable -> L31
            int r2 = r12.getContentLength()     // Catch: java.lang.Throwable -> L31
            com.tendcloud.tenddata.ar r10 = a(r8, r2, r9, r1)     // Catch: java.lang.Throwable -> L31
            r1 = r11
            r2 = r12
            r3 = r8
            r4 = r13
            r6 = r10
            r7 = r15
            a(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L39
        L2a:
            r9.close()     // Catch: java.lang.Throwable -> L39
            goto L39
        L2e:
            r8 = 600(0x258, float:8.41E-43)
        L30:
            r9 = r0
        L31:
            com.tendcloud.tenddata.ar r10 = new com.tendcloud.tenddata.ar     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r8, r0, r0)     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L39
            goto L2a
        L39:
            return r10
        L3a:
            r11 = move-exception
            if (r9 == 0) goto L40
            r9.close()     // Catch: java.lang.Throwable -> L40
        L40:
            throw r11
    }

    private static java.lang.String a(com.tendcloud.tenddata.ar r3) {
            java.lang.String r0 = ""
            if (r3 == 0) goto L1e
            byte[] r1 = r3.c()
            if (r1 != 0) goto Lb
            goto L1e
        Lb:
            byte[] r3 = r3.c()     // Catch: java.lang.Throwable -> L1e
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1e
            r2 = 104857600(0x6400000, float:3.6111186E-35)
            if (r1 <= r2) goto L18
            java.lang.String r3 = "Input stream more than 100 MB size limit"
            r0 = r3
            goto L1e
        L18:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            r0 = r1
        L1e:
            return r0
    }

    private static void a(java.lang.String r4, java.net.HttpURLConnection r5, int r6, long r7, com.tendcloud.tenddata.ar r9, com.tendcloud.tenddata.an r10) {
            java.lang.String r0 = "targetIP"
            if (r5 == 0) goto L77
            java.lang.String r1 = r5.getRequestMethod()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "POST"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L77
            java.util.TreeMap r1 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L77
            r1.<init>()     // Catch: java.lang.Throwable -> L77
            java.net.URL r5 = r5.getURL()     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = "targetUrl"
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L77
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = r5.getHost()     // Catch: java.lang.Throwable -> L32
            java.net.InetAddress r5 = java.net.InetAddress.getByName(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r5.getHostAddress()     // Catch: java.lang.Throwable -> L32
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            java.lang.String r5 = "0.0.0.0"
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L77
        L37:
            r5 = 200(0xc8, float:2.8E-43)
            if (r6 != r5) goto L61
            if (r10 == 0) goto L51
            byte[] r5 = r10.a()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L51
            java.lang.String r5 = "reqSize"
            byte[] r6 = r10.a()     // Catch: java.lang.Throwable -> L77
            int r6 = r6.length     // Catch: java.lang.Throwable -> L77
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L77
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L77
        L51:
            java.lang.String r5 = "respTime"
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L77
            long r9 = r9 - r7
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L77
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L77
            r5 = 1
            goto L74
        L61:
            java.lang.String r5 = "errorMsg"
            java.lang.String r7 = a(r9)     // Catch: java.lang.Throwable -> L77
            r1.put(r5, r7)     // Catch: java.lang.Throwable -> L77
            java.lang.String r5 = "statusCode"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L77
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L77
            r5 = 0
        L74:
            com.tendcloud.tenddata.bo.a(r4, r5, r1)     // Catch: java.lang.Throwable -> L77
        L77:
            return
    }

    public int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public byte[] c() {
            r1 = this;
            byte[] r0 = r1.c
            return r0
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> d() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r1.d
            return r0
    }
}
