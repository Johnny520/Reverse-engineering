package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final boolean a = false;
    public static java.lang.String b = "TDLog";
    public static boolean c = false;
    public static final /* synthetic */ boolean d = true;
    private static volatile int e = -1;
    private static final java.lang.String f = "UTF-8";
    private static final java.lang.String g = "ge";
    private static final java.lang.String h = "tp";
    private static final java.lang.String i = "rop";
    private static final java.util.concurrent.ExecutorService j = null;
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> k = null;
    private static final byte l = 61;
    private static final java.lang.String m = "US-ASCII";
    private static final byte[] n = null;
    private static byte[] o = null;
    private static final java.security.SecureRandom p = null;
    private static final java.lang.String q = "00:00:00:00:00:00";
    private static final java.lang.String r = "02:00:00:00:00:00";
    private static final java.util.regex.Pattern s = null;



    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.tendcloud.tenddata.y.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.y.k = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            com.tendcloud.tenddata.y.n = r0
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8} // fill-array
            com.tendcloud.tenddata.y.o = r0
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            com.tendcloud.tenddata.y.p = r0
            java.lang.String r0 = "^([0-9A-F]{2}:){5}([0-9A-F]{2})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.tendcloud.tenddata.y.s = r0
            return
    }

    public y() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "getprop"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L47
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L47
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L47
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L47
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r2.<init>()     // Catch: java.lang.Throwable -> L48
        L20:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L3f
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch: java.lang.Throwable -> L3f
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L3f
            r4 = 104857600(0x6400000, float:3.6111186E-35)
            if (r3 > r4) goto L37
            goto L20
        L37:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "Input stream more than 100 MB size limit"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            throw r3     // Catch: java.lang.Throwable -> L3f
        L3f:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L48
            r1.close()     // Catch: java.lang.Throwable -> L46
        L46:
            return r0
        L47:
            r1 = r0
        L48:
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L4d
        L4d:
            return r0
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L2d
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L2d
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L2e
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2e
            int r1 = r2.read(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 <= 0) goto L29
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "td_channel_id"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Throwable -> L2e
            r2.close()     // Catch: java.lang.Throwable -> L28
        L28:
            return r3
        L29:
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L31
        L2d:
            r2 = r0
        L2e:
            if (r2 == 0) goto L31
            goto L29
        L31:
            return r0
    }

    public static java.lang.String a(android.os.Bundle r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.util.Set r1 = r3.keySet()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L27
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto Lc
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L27
            return r3
        L27:
            return r0
    }

    public static final java.lang.String a(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L11
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        L11:
            return r2
    }

    public static java.lang.String a(byte[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            int r1 = r5.length     // Catch: java.lang.Throwable -> L25
            r2 = 0
        L7:
            if (r2 >= r1) goto L20
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L25
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 16
            if (r3 >= r4) goto L16
            r4 = 48
            r0.append(r4)     // Catch: java.lang.Throwable -> L25
        L16:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L25
            r0.append(r3)     // Catch: java.lang.Throwable -> L25
            int r2 = r2 + 1
            goto L7
        L20:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r5 = 0
            return r5
    }

    public static java.lang.String a(byte[] r0, int r1, int r2) {
            byte[] r0 = b(r0, r1, r2)
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "US-ASCII"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    public static java.util.Map<java.lang.String, java.lang.Object> a(org.json.JSONObject r4) {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Iterator r1 = r4.keys()     // Catch: java.lang.Throwable -> L1d
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L1d
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L1d
            goto L9
        L1d:
            return r0
    }

    public static void a(java.io.File r3, byte[] r4) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L29
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L29
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L29
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L29
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L21
        Le:
            int r1 = r0.read(r3)     // Catch: java.lang.Throwable -> L21
            r2 = -1
            if (r1 == r2) goto L1a
            r2 = 0
            r4.write(r3, r2, r1)     // Catch: java.lang.Throwable -> L21
            goto Le
        L1a:
            r4.close()     // Catch: java.lang.Throwable -> L29
            r0.close()     // Catch: java.lang.Throwable -> L29
            goto L29
        L21:
            r3 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L29
            r0.close()     // Catch: java.lang.Throwable -> L29
            throw r3     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    public static void a(java.lang.Class<?> r4, com.tendcloud.tenddata.v r5, java.lang.String r6, java.lang.String r7) {
            java.lang.reflect.Field r6 = r4.getDeclaredField(r6)
            r0 = 1
            r6.setAccessible(r0)
            r1 = 0
            java.lang.Object r2 = r6.get(r1)
            java.lang.Class r7 = java.lang.Class.forName(r7)
            com.tendcloud.tenddata.y$2 r3 = new com.tendcloud.tenddata.y$2
            r3.<init>(r5, r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Class[] r5 = new java.lang.Class[r0]
            r0 = 0
            r5[r0] = r7
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r4, r5, r3)
            r6.set(r1, r4)
            return
    }

    public static void a(java.lang.Object r3, com.tendcloud.tenddata.v r4, java.lang.String r5, java.lang.String r6) {
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Field r5 = r0.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L2d
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r5.get(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L2d
            com.tendcloud.tenddata.y$1 r2 = new com.tendcloud.tenddata.y$1     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> L2d
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            r0[r1] = r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r4, r0, r2)     // Catch: java.lang.Throwable -> L2d
            r5.set(r3, r4)     // Catch: java.lang.Throwable -> L2d
        L2d:
            return
    }

    public static boolean a(int r1) {
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean a(android.content.Context r6) {
            int r0 = com.tendcloud.tenddata.y.e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L49
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r6.getSystemService(r0)     // Catch: java.lang.Throwable -> L48
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> L48
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> L48
            android.content.pm.ApplicationInfo r6 = r1.getApplicationInfo(r6, r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.processName     // Catch: java.lang.Throwable -> L48
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L46
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L48
        L27:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L48
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Throwable -> L48
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L48
            int r5 = r1.pid     // Catch: java.lang.Throwable -> L48
            if (r4 != r5) goto L27
            java.lang.String r1 = r1.processName     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.equals(r6)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L27
            com.tendcloud.tenddata.y.e = r3     // Catch: java.lang.Throwable -> L48
            return r2
        L46:
            com.tendcloud.tenddata.y.e = r2     // Catch: java.lang.Throwable -> L48
        L48:
            return r3
        L49:
            int r6 = com.tendcloud.tenddata.y.e
            if (r6 != 0) goto L4e
            return r2
        L4e:
            com.tendcloud.tenddata.y.e = r1
            return r3
    }

    public static boolean a(android.content.Context r1, int r2) {
            r0 = 0
            int r1 = c(r1)     // Catch: java.lang.Throwable -> L8
            if (r1 < r2) goto L8
            r0 = 1
        L8:
            return r0
    }

    private static byte[] a(byte[] r5, int r6, int r7, byte[] r8, int r9) {
            byte[] r0 = com.tendcloud.tenddata.y.n     // Catch: java.lang.Throwable -> L89
            r1 = 0
            if (r7 <= 0) goto Lc
            r2 = r5[r6]     // Catch: java.lang.Throwable -> L89
            int r2 = r2 << 24
            int r2 = r2 >>> 8
            goto Ld
        Lc:
            r2 = r1
        Ld:
            r3 = 1
            if (r7 <= r3) goto L19
            int r4 = r6 + 1
            r4 = r5[r4]     // Catch: java.lang.Throwable -> L89
            int r4 = r4 << 24
            int r4 = r4 >>> 16
            goto L1a
        L19:
            r4 = r1
        L1a:
            r2 = r2 | r4
            r4 = 2
            if (r7 <= r4) goto L25
            int r6 = r6 + r4
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L89
            int r5 = r5 << 24
            int r1 = r5 >>> 24
        L25:
            r5 = r2 | r1
            r6 = 61
            r1 = 3
            if (r7 == r3) goto L71
            if (r7 == r4) goto L53
            if (r7 == r1) goto L31
            return r8
        L31:
            int r6 = r5 >>> 18
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L89
            r8[r9] = r6     // Catch: java.lang.Throwable -> L89
            int r6 = r9 + 1
            int r7 = r5 >>> 12
            r7 = r7 & 63
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L89
            r8[r6] = r7     // Catch: java.lang.Throwable -> L89
            int r6 = r9 + 2
            int r7 = r5 >>> 6
            r7 = r7 & 63
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L89
            r8[r6] = r7     // Catch: java.lang.Throwable -> L89
            int r9 = r9 + r1
            r5 = r5 & 63
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L89
            r8[r9] = r5     // Catch: java.lang.Throwable -> L89
            return r8
        L53:
            int r7 = r5 >>> 18
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L89
            r8[r9] = r7     // Catch: java.lang.Throwable -> L89
            int r7 = r9 + 1
            int r2 = r5 >>> 12
            r2 = r2 & 63
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L89
            r8[r7] = r2     // Catch: java.lang.Throwable -> L89
            int r7 = r9 + 2
            int r5 = r5 >>> 6
            r5 = r5 & 63
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L89
            r8[r7] = r5     // Catch: java.lang.Throwable -> L89
            int r9 = r9 + r1
            r8[r9] = r6     // Catch: java.lang.Throwable -> L89
            return r8
        L71:
            int r7 = r5 >>> 18
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L89
            r8[r9] = r7     // Catch: java.lang.Throwable -> L89
            int r7 = r9 + 1
            int r5 = r5 >>> 12
            r5 = r5 & 63
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L89
            r8[r7] = r5     // Catch: java.lang.Throwable -> L89
            int r5 = r9 + 2
            r8[r5] = r6     // Catch: java.lang.Throwable -> L89
            int r9 = r9 + r1
            r8[r9] = r6     // Catch: java.lang.Throwable -> L89
            return r8
        L89:
            r5 = 0
            return r5
    }

    public static byte[] a(byte[] r3, byte[] r4) {
            javax.crypto.spec.DESKeySpec r0 = new javax.crypto.spec.DESKeySpec     // Catch: java.lang.Throwable -> L25
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "DES"
            javax.crypto.SecretKeyFactory r4 = javax.crypto.SecretKeyFactory.getInstance(r4)     // Catch: java.lang.Throwable -> L25
            javax.crypto.SecretKey r4 = r4.generateSecret(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "DES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L25
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L25
            byte[] r2 = com.tendcloud.tenddata.y.o     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r2 = 1
            r0.init(r2, r4, r1)     // Catch: java.lang.Throwable -> L25
            byte[] r3 = r0.doFinal(r3)     // Catch: java.lang.Throwable -> L25
            return r3
        L25:
            r3 = 0
            return r3
    }

    public static int b(android.content.Context r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L11
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> L11
            float r0 = r0.density     // Catch: java.lang.Throwable -> L11
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static java.lang.String b(java.io.File r5, byte[] r6) {
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L46
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L38
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L38
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L35
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L35
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L33
        L15:
            int r3 = r2.read(r5)     // Catch: java.lang.Throwable -> L33
            r4 = -1
            if (r3 == r4) goto L24
            r4 = 0
            r6.write(r5, r4, r3)     // Catch: java.lang.Throwable -> L33
            r1.update(r5, r4, r3)     // Catch: java.lang.Throwable -> L33
            goto L15
        L24:
            r6.close()     // Catch: java.lang.Throwable -> L27
        L27:
            r2.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            byte[] r5 = r1.digest()     // Catch: java.lang.Throwable -> L46
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> L46
            return r5
        L33:
            r5 = move-exception
            goto L3b
        L35:
            r5 = move-exception
            r6 = r0
            goto L3b
        L38:
            r5 = move-exception
            r6 = r0
            r2 = r6
        L3b:
            if (r6 == 0) goto L40
            r6.close()     // Catch: java.lang.Throwable -> L40
        L40:
            if (r2 == 0) goto L45
            r2.close()     // Catch: java.lang.Throwable -> L45
        L45:
            throw r5     // Catch: java.lang.Throwable -> L46
        L46:
            return r0
    }

    public static java.lang.String b(byte[] r2) {
            r0 = 0
            int r1 = r2.length     // Catch: java.lang.Throwable -> L7
            java.lang.String r2 = a(r2, r0, r1)     // Catch: java.lang.Throwable -> L7
            goto Ld
        L7:
            r2 = move-exception
            boolean r0 = com.tendcloud.tenddata.y.d
            if (r0 == 0) goto L1b
            r2 = 0
        Ld:
            boolean r0 = com.tendcloud.tenddata.y.d
            if (r0 != 0) goto L1a
            if (r2 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L1a:
            return r2
        L1b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r2 = r2.getMessage()
            r0.<init>(r2)
            throw r0
    }

    public static java.security.SecureRandom b() {
            java.security.SecureRandom r0 = com.tendcloud.tenddata.y.p
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.Object> b(org.json.JSONObject r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r1 = r5.keys()     // Catch: java.lang.Exception -> L22
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L22
            r2.<init>()     // Catch: java.lang.Exception -> L22
        Ld:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L22
            if (r3 == 0) goto L21
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L22
            java.lang.Object r4 = r5.get(r3)     // Catch: java.lang.Exception -> L22
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L22
            goto Ld
        L21:
            return r2
        L22:
            return r0
    }

    public static boolean b(int r1) {
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r1) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean b(android.content.Context r0) {
            r0 = 0
            return r0
    }

    public static boolean b(android.content.Context r4, java.lang.String r5) {
            r0 = 0
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.tendcloud.tenddata.y.k     // Catch: java.lang.Throwable -> L35
            boolean r2 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L14
            java.lang.Object r4 = r1.get(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L35
            goto L34
        L14:
            r2 = 23
            boolean r2 = a(r2)     // Catch: java.lang.Throwable -> L35
            r3 = 1
            if (r2 == 0) goto L24
            int r4 = r4.checkSelfPermission(r5)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L2c
            goto L2a
        L24:
            int r4 = r4.checkCallingOrSelfPermission(r5)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L2c
        L2a:
            r4 = r3
            goto L2d
        L2c:
            r4 = r0
        L2d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L35
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L35
        L34:
            return r4
        L35:
            return r0
    }

    public static final boolean b(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public static byte[] b(byte[] r9, int r10, int r11) {
            if (r9 == 0) goto L8e
            if (r10 < 0) goto L77
            if (r11 < 0) goto L60
            int r0 = r10 + r11
            int r1 = r9.length
            r2 = 1
            r3 = 3
            r4 = 0
            if (r0 > r1) goto L3e
            int r0 = r11 / 3
            r1 = 4
            int r0 = r0 * r1
            int r5 = r11 % 3
            if (r5 <= 0) goto L17
            goto L18
        L17:
            r1 = r4
        L18:
            int r0 = r0 + r1
            byte[] r1 = new byte[r0]
            int r5 = r11 + (-2)
            r6 = r4
            r7 = r6
        L1f:
            if (r6 >= r5) goto L2b
            int r8 = r6 + r10
            a(r9, r8, r3, r1, r7)
            int r6 = r6 + 3
            int r7 = r7 + 4
            goto L1f
        L2b:
            if (r6 >= r11) goto L34
            int r10 = r10 + r6
            int r11 = r11 - r6
            a(r9, r10, r11, r1, r7)
            int r7 = r7 + 4
        L34:
            int r0 = r0 - r2
            if (r7 > r0) goto L3d
            byte[] r9 = new byte[r7]
            java.lang.System.arraycopy(r1, r4, r9, r4, r7)
            return r9
        L3d:
            return r1
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r4] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r1[r2] = r10
            int r9 = r9.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 2
            r1[r10] = r9
            java.lang.String r9 = "Cannot have offset of %d and length of %d with array of length %d"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r0.<init>(r9)
            throw r0
        L60:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Cannot have length offset: "
            r10.append(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L77:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Cannot have negative offset: "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L8e:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "Cannot serialize a null array."
            r9.<init>(r10)
            throw r9
    }

    public static byte[] b(byte[] r3, byte[] r4) {
            javax.crypto.spec.DESKeySpec r0 = new javax.crypto.spec.DESKeySpec     // Catch: java.lang.Throwable -> L25
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "DES"
            javax.crypto.SecretKeyFactory r4 = javax.crypto.SecretKeyFactory.getInstance(r4)     // Catch: java.lang.Throwable -> L25
            javax.crypto.SecretKey r4 = r4.generateSecret(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "DES/CBC/PKCS5Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L25
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L25
            byte[] r2 = com.tendcloud.tenddata.y.o     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r2 = 2
            r0.init(r2, r4, r1)     // Catch: java.lang.Throwable -> L25
            byte[] r3 = r0.doFinal(r3)     // Catch: java.lang.Throwable -> L25
            return r3
        L25:
            r3 = 0
            return r3
    }

    public static int c(android.content.Context r3) {
            r0 = -1
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L13
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L13
            int r3 = r3.targetSdkVersion     // Catch: java.lang.Throwable -> L13
            r0 = r3
        L13:
            return r0
    }

    public static java.lang.String c(java.lang.String r2) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.lang.Exception -> L15
            byte[] r2 = r0.digest(r2)     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = a(r2)     // Catch: java.lang.Exception -> L15
            return r2
        L15:
            r2 = 0
            return r2
    }

    public static java.lang.String c(byte[] r7) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r7)
            r7 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L38
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L38
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L36
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
        L14:
            r4 = 0
            int r5 = r1.read(r2, r4, r0)     // Catch: java.lang.Throwable -> L33
            r6 = -1
            if (r5 == r6) goto L20
            r3.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L33
            goto L14
        L20:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L33
            r3.flush()     // Catch: java.lang.Throwable -> L34
            r3.close()     // Catch: java.lang.Throwable -> L2f
        L2f:
            r1.close()     // Catch: java.lang.Throwable -> L42
            goto L42
        L33:
            r2 = r7
        L34:
            r7 = r3
            goto L3a
        L36:
            r2 = r7
            goto L3a
        L38:
            r1 = r7
            r2 = r1
        L3a:
            if (r7 == 0) goto L3f
            r7.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            if (r1 == 0) goto L42
            goto L2f
        L42:
            return r2
    }

    public static boolean c(android.content.Context r3, java.lang.String r4) {
            r0 = 23
            r1 = 0
            boolean r0 = a(r0)     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r0 == 0) goto L11
            int r3 = r3.checkSelfPermission(r4)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L18
            goto L17
        L11:
            int r3 = r3.checkCallingOrSelfPermission(r4)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L18
        L17:
            r1 = r2
        L18:
            return r1
    }

    public static java.lang.String d(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            java.lang.String r2 = a(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            return r2
        L15:
            r2 = 0
            return r2
    }

    public static byte[] d(java.lang.String r7) {
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L2b
            int r1 = r0 / 2
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L2b
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            int r3 = r2 / 2
            char r4 = r7.charAt(r2)     // Catch: java.lang.Throwable -> L2b
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)     // Catch: java.lang.Throwable -> L2b
            int r4 = r4 << 4
            int r6 = r2 + 1
            char r6 = r7.charAt(r6)     // Catch: java.lang.Throwable -> L2b
            int r5 = java.lang.Character.digit(r6, r5)     // Catch: java.lang.Throwable -> L2b
            int r4 = r4 + r5
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L2b
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2b
            int r2 = r2 + 2
            goto L9
        L2a:
            return r1
        L2b:
            r7 = 0
            return r7
    }

    public static byte[] d(byte[] r7) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r7)
            r7 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L30
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L2e
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2e
            r3.<init>()     // Catch: java.lang.Throwable -> L2e
        L14:
            r4 = 0
            int r5 = r1.read(r2, r4, r0)     // Catch: java.lang.Throwable -> L32
            r6 = -1
            if (r5 == r6) goto L20
            r3.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L32
            goto L14
        L20:
            r3.flush()     // Catch: java.lang.Throwable -> L32
            byte[] r7 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32
            r3.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            r1.close()     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L2e:
            r3 = r7
            goto L32
        L30:
            r1 = r7
            r3 = r1
        L32:
            if (r3 == 0) goto L37
            r3.close()     // Catch: java.lang.Throwable -> L37
        L37:
            if (r1 == 0) goto L3a
            goto L2a
        L3a:
            return r7
    }

    public static java.lang.String e(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.lang.Throwable -> L19
            byte[] r3 = r1.digest(r3)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            return r0
    }

    public static java.nio.channels.FileChannel e(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L30
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            r2.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "td.lock"
            r2.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L30
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L30
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L24
            r1.createNewFile()     // Catch: java.lang.Throwable -> L30
        L24:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "rw"
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L30
            java.nio.channels.FileChannel r0 = r3.getChannel()     // Catch: java.lang.Throwable -> L31
            goto L36
        L30:
            r3 = r0
        L31:
            if (r3 == 0) goto L36
            r3.close()     // Catch: java.lang.Throwable -> L36
        L36:
            return r0
    }

    public static byte[] e(byte[] r5) {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            r0.reset()
            r0.setInput(r5)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r2 = r5.length
            r1.<init>(r2)
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L28
        L15:
            boolean r3 = r0.finished()     // Catch: java.lang.Throwable -> L28
            if (r3 != 0) goto L24
            int r3 = r0.inflate(r2)     // Catch: java.lang.Throwable -> L28
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L28
            goto L15
        L24:
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Throwable -> L28
        L28:
            r1.close()     // Catch: java.lang.Throwable -> L2b
        L2b:
            r0.end()
            return r5
    }

    public static void execute(java.lang.Runnable r1) {
            java.util.concurrent.ExecutorService r0 = com.tendcloud.tenddata.y.j
            if (r0 == 0) goto L7
            r0.execute(r1)
        L7:
            return
    }

    public static byte[] f(java.lang.String r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r2 = 9
            r3 = 1
            r1.<init>(r2, r3)
            r2 = 0
            java.util.zip.DeflaterOutputStream r3 = new java.util.zip.DeflaterOutputStream     // Catch: java.lang.Throwable -> L21
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "UTF-8"
            byte[] r4 = r4.getBytes(r2)     // Catch: java.lang.Throwable -> L20
            r3.write(r4)     // Catch: java.lang.Throwable -> L20
            r3.close()     // Catch: java.lang.Throwable -> L26
            goto L26
        L20:
            r2 = r3
        L21:
            if (r2 == 0) goto L26
            r2.close()     // Catch: java.lang.Throwable -> L26
        L26:
            r1.end()
            byte[] r4 = r0.toByteArray()
            return r4
    }

    public static java.lang.Long g(java.lang.String r3) {
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> Le
        Le:
            return r0
    }

    public static java.lang.Integer h(java.lang.String r1) {
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return r0
    }

    public static boolean i(java.lang.String r1) {
            boolean r0 = b(r1)
            if (r0 != 0) goto L14
            java.util.regex.Pattern r0 = com.tendcloud.tenddata.q.h
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public static boolean j(java.lang.String r1) {
            boolean r0 = b(r1)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L22
            java.util.regex.Pattern r0 = com.tendcloud.tenddata.y.s     // Catch: java.lang.Throwable -> L24
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.matches()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L22
            java.lang.String r0 = "02:00:00:00:00:00"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L22
            java.lang.String r0 = "00:00:00:00:00:00"
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L24
        L22:
            r1 = 1
            return r1
        L24:
            r1 = 0
            return r1
    }
}
