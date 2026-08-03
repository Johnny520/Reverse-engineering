package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static final java.lang.String a = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq";
    public static final java.lang.String b = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq";
    public static final java.lang.String c = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";
    private static final int d = 3600000;
    private static final java.util.regex.Pattern e = null;
    private static final java.util.regex.Pattern f = null;
    private static java.util.List<android.content.pm.PackageInfo> g;
    private static boolean h;
    private static int[] i;
    private static final java.io.FileFilter j = null;
    private static android.content.BroadcastReceiver k;



    public static class a {
        public static final int HCE_ENABLED = 3;
        public static final int NFC_ENABLED = 2;
        public static final int NOT_ENALBED = 1;
        public static final int UNKNOWN = 0;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "([0-9]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.tendcloud.tenddata.k.e = r0
            java.lang.String r0 = "\\s*([0-9]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.tendcloud.tenddata.k.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tendcloud.tenddata.k.g = r0
            r0 = 0
            com.tendcloud.tenddata.k.h = r0
            com.tendcloud.tenddata.k$1 r0 = new com.tendcloud.tenddata.k$1
            r0.<init>()
            com.tendcloud.tenddata.k.j = r0
            com.tendcloud.tenddata.k$2 r0 = new com.tendcloud.tenddata.k$2
            r0.<init>()
            com.tendcloud.tenddata.k.k = r0
            return
    }

    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L39
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> L37
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L37
            r4 = 104857600(0x6400000, float:3.6111186E-35)
            if (r3 > r4) goto L2e
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L37
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L37
            r2.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            r5.close()     // Catch: java.lang.Throwable -> L42
            goto L42
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "Input stream more than 100 MB size limit"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L36:
            r5 = r0
        L37:
            r0 = r2
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r0 == 0) goto L3f
            r0.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            if (r5 == 0) goto L42
            goto L2a
        L42:
            return r1
    }

    public static java.lang.String a() {
            java.lang.String r0 = "Android+"
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String a(java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L26
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L26
            r2[r5] = r6     // Catch: java.lang.Throwable -> L26
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L26
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L25
            return r7
        L25:
            return r6
        L26:
            return r7
    }

    private static java.util.List<android.content.pm.PackageInfo> a(android.content.Context r6, int r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T
            boolean r1 = r1.isAppListEnabled()
            if (r1 != 0) goto Le
            return r0
        Le:
            boolean r1 = com.tendcloud.tenddata.ab.S
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.List r6 = d(r6)     // Catch: java.lang.Throwable -> L18
            return r6
        L18:
            r1 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "pm list packages"
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L57
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L57
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L57
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L57
        L35:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L4f
            r4 = 58
            int r4 = r1.indexOf(r4)     // Catch: java.lang.Throwable -> L56
            int r4 = r4 + 1
            java.lang.String r1 = r1.substring(r4)     // Catch: java.lang.Throwable -> L56
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r1, r7)     // Catch: java.lang.Throwable -> L56
            r0.add(r1)     // Catch: java.lang.Throwable -> L56
            goto L35
        L4f:
            r2.waitFor()     // Catch: java.lang.Throwable -> L56
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L5c
        L56:
            r1 = r3
        L57:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Throwable -> L5c
        L5c:
            return r0
    }

    public static org.json.JSONObject a(android.content.Context r6, org.json.JSONObject r7) {
            java.lang.String r0 = "*"
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L3e
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L3e
            int r1 = r6.widthPixels     // Catch: java.lang.Throwable -> L3e
            int r2 = r6.heightPixels     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "pixel"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            int r5 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            int r1 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> L3e
            r4.append(r1)     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            int r0 = r6.densityDpi     // Catch: java.lang.Throwable -> L3e
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            r7.put(r3, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "densityDpi"
            int r6 = r6.densityDpi     // Catch: java.lang.Throwable -> L3e
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L3e
        L3e:
            return r7
    }

    public static boolean a(android.content.Context r2) {
            r0 = 17
            r1 = 0
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L16
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "adb_enabled"
            int r2 = android.provider.Settings.Global.getInt(r2, r0, r1)     // Catch: java.lang.Throwable -> L16
            if (r2 <= 0) goto L16
            r1 = 1
        L16:
            return r1
    }

    private static int[] a(int[] r5) {
            r0 = 2
            android.os.StatFs r1 = new android.os.StatFs     // Catch: java.lang.Throwable -> L2c
            java.io.File r2 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            int r3 = r1.getBlockCount()     // Catch: java.lang.Throwable -> L2c
            int r4 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 / 512
            int r3 = r3 * r4
            int r3 = r3 / r0
            r5[r2] = r3     // Catch: java.lang.Throwable -> L2c
            r2 = 1
            int r3 = r1.getAvailableBlocks()     // Catch: java.lang.Throwable -> L2c
            int r1 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 / 512
            int r3 = r3 * r1
            int r3 = r3 / r0
            r5[r2] = r3     // Catch: java.lang.Throwable -> L2c
        L2c:
            android.os.StatFs r1 = new android.os.StatFs     // Catch: java.lang.Throwable -> L56
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L56
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L56
            int r2 = r1.getBlockCount()     // Catch: java.lang.Throwable -> L56
            int r3 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L56
            int r3 = r3 / 512
            int r2 = r2 * r3
            int r2 = r2 / r0
            r5[r0] = r2     // Catch: java.lang.Throwable -> L56
            r2 = 3
            int r3 = r1.getAvailableBlocks()     // Catch: java.lang.Throwable -> L56
            int r1 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L56
            int r1 = r1 / 512
            int r3 = r3 * r1
            int r3 = r3 / r0
            r5[r2] = r3     // Catch: java.lang.Throwable -> L56
        L56:
            return r5
    }

    private static int b(java.lang.String r3) {
            r0 = 0
            java.lang.String r1 = ""
            java.util.regex.Pattern r2 = com.tendcloud.tenddata.k.e     // Catch: java.lang.Exception -> L1c
            java.util.regex.Matcher r3 = r2.matcher(r3)     // Catch: java.lang.Exception -> L1c
            boolean r2 = r3.find()     // Catch: java.lang.Exception -> L1c
            if (r2 == 0) goto L17
            java.util.regex.MatchResult r3 = r3.toMatchResult()     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = r3.group(r0)     // Catch: java.lang.Exception -> L1c
        L17:
            int r3 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L1c
            return r3
        L1c:
            return r0
    }

    private static java.lang.String b(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = r3.toLowerCase()     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "unknown"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "alps"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "android"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "sprd"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "spreadtrum"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "rockchip"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "wondermedia"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "mtk"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "mt65"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "nvidia"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "brcm"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r2 = "marvell"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L71
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Throwable -> L71
            boolean r4 = r4.contains(r1)     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L70
            goto L71
        L70:
            return r3
        L71:
            return r0
    }

    public static org.json.JSONObject b(android.content.Context r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r0.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "nfcStatus"
            int r2 = c(r3)     // Catch: java.lang.Throwable -> L21
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "appsRegistedHCE"
            org.json.JSONArray r2 = t(r3)     // Catch: java.lang.Throwable -> L21
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "ssMode"
            int r3 = u(r3)     // Catch: java.lang.Throwable -> L21
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r3 = 0
            return r3
    }

    public static org.json.JSONObject b(android.content.Context r1, org.json.JSONObject r2) {
            java.lang.String r0 = "brightness"
            int r1 = s(r1)     // Catch: java.lang.Throwable -> L9
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L9
        L9:
            return r2
    }

    public static boolean b() {
            r0 = 0
            java.lang.String r1 = "com.huawei.system.BuildEx"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "getOsBrand"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L18
            return r0
        L18:
            java.lang.String r2 = "harmony"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L23
            boolean r0 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            r1 = move-exception
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "SA.HasHarmonyOS"
            r2[r0] = r3
            r3 = 1
            java.lang.String r1 = r1.getMessage()
            r2[r3] = r1
            com.tendcloud.tenddata.h.iForInternal(r2)
            return r0
    }

    public static int c(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            r1 = 10
            boolean r1 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3b
            java.lang.String r1 = "nfc"
            java.lang.Object r1 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L3b
            android.nfc.NfcManager r1 = (android.nfc.NfcManager) r1     // Catch: java.lang.Throwable -> L3b
            android.nfc.NfcAdapter r1 = r1.getDefaultAdapter()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3b
            boolean r1 = r1.isEnabled()     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L23
            r2 = 1
        L21:
            r0 = r2
            goto L3b
        L23:
            r1 = 19
            boolean r1 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L39
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = "android.hardware.nfc.hce"
            boolean r2 = r2.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L39
            r2 = 3
            goto L21
        L39:
            r2 = 2
            goto L21
        L3b:
            return r0
    }

    public static java.lang.String c() {
            java.lang.String r0 = "hw_sc.build.platform.version"
            r1 = 0
            java.lang.String r0 = a(r0, r1)
            return r0
    }

    /* JADX DEBUG: Throwable added to exception handler: 'IOException', keep only Throwable */
    private static java.lang.String c(java.lang.String r7) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L2a
            r7 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r7]
            java.io.BufferedReader r3 = new java.io.BufferedReader
            r3.<init>(r1, r7)
        L13:
            r4 = -1
            r5 = 0
            int r6 = r3.read(r2, r5, r7)
            if (r4 == r6) goto L24
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2, r5, r6)
            r0.append(r4)
            goto L13
        L24:
            r3.close()
            r1.close()
        L2a:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public static java.lang.String d() {
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "uname -r"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L3c
            int r2 = r1.waitFor()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L16
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> L3c
            goto L1a
        L16:
            java.io.InputStream r2 = r1.getErrorStream()     // Catch: java.lang.Throwable -> L3c
        L1a:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            r5 = 512(0x200, float:7.17E-43)
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L3e
            r2.close()     // Catch: java.lang.Throwable -> L3e
            r3.close()     // Catch: java.lang.Throwable -> L3e
            r1.destroy()     // Catch: java.lang.Throwable -> L3e
            r2.close()     // Catch: java.lang.Throwable -> L36
        L36:
            r3.close()     // Catch: java.lang.Throwable -> L39
        L39:
            return r4
        L3a:
            r3 = r0
            goto L3e
        L3c:
            r2 = r0
            r3 = r2
        L3e:
            if (r2 == 0) goto L43
            r2.close()     // Catch: java.lang.Throwable -> L43
        L43:
            if (r3 == 0) goto L48
            r3.close()     // Catch: java.lang.Throwable -> L48
        L48:
            return r0
    }

    public static synchronized java.util.List<android.content.pm.PackageInfo> d(android.content.Context r4) {
            java.lang.Class<com.tendcloud.tenddata.k> r0 = com.tendcloud.tenddata.k.class
            monitor-enter(r0)
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r1.isAppListEnabled()     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            if (r1 != 0) goto Le
            monitor-exit(r0)
            return r2
        Le:
            boolean r1 = com.tendcloud.tenddata.ab.S     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L14
            monitor-exit(r0)
            return r2
        L14:
            boolean r1 = com.tendcloud.tenddata.k.h     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L1c
            java.util.List<android.content.pm.PackageInfo> r4 = com.tendcloud.tenddata.k.g     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r4
        L1c:
            r1 = 30
            boolean r2 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> L4a
            r3 = 1
            if (r2 == 0) goto L39
            boolean r1 = com.tendcloud.tenddata.y.a(r4, r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L39
            java.lang.String r1 = "android.permission.QUERY_ALL_PACKAGES"
            boolean r1 = com.tendcloud.tenddata.y.c(r4, r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L39
            com.tendcloud.tenddata.k.h = r3     // Catch: java.lang.Throwable -> L4a
            java.util.List<android.content.pm.PackageInfo> r4 = com.tendcloud.tenddata.k.g     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r4
        L39:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L46
            r1 = 5
            java.util.List r4 = r4.getInstalledPackages(r1)     // Catch: java.lang.Throwable -> L46
            com.tendcloud.tenddata.k.g = r4     // Catch: java.lang.Throwable -> L46
            com.tendcloud.tenddata.k.h = r3     // Catch: java.lang.Throwable -> L46
        L46:
            java.util.List<android.content.pm.PackageInfo> r4 = com.tendcloud.tenddata.k.g     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r4
        L4a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public static java.lang.String e() {
            java.lang.String r0 = android.os.Build.ID     // Catch: java.lang.Throwable -> L3
            return r0
        L3:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String e(android.content.Context r5) {
            java.lang.String r0 = "*"
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L33
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()     // Catch: java.lang.Throwable -> L33
            if (r5 == 0) goto L33
            int r1 = r5.widthPixels     // Catch: java.lang.Throwable -> L33
            int r2 = r5.heightPixels     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            int r4 = java.lang.Math.min(r1, r2)     // Catch: java.lang.Throwable -> L33
            r3.append(r4)     // Catch: java.lang.Throwable -> L33
            r3.append(r0)     // Catch: java.lang.Throwable -> L33
            int r1 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> L33
            r3.append(r1)     // Catch: java.lang.Throwable -> L33
            r3.append(r0)     // Catch: java.lang.Throwable -> L33
            int r5 = r5.densityDpi     // Catch: java.lang.Throwable -> L33
            r3.append(r5)     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L33
            return r5
        L33:
            java.lang.String r5 = ""
            return r5
    }

    public static int f(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L9
            android.content.Context r4 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.BroadcastReceiver r1 = com.tendcloud.tenddata.k.k     // Catch: java.lang.Throwable -> L2a
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
            android.content.Intent r1 = r4.registerReceiver(r1, r2)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L23
            android.os.Bundle r1 = r1.getExtras()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "level"
            int r1 = r1.getInt(r2, r0)     // Catch: java.lang.Throwable -> L2a
            goto L24
        L23:
            r1 = r0
        L24:
            android.content.BroadcastReceiver r2 = com.tendcloud.tenddata.k.k     // Catch: java.lang.Throwable -> L2a
            r4.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L2a
            return r1
        L2a:
            return r0
    }

    public static java.lang.String f() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static int g(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L9
            android.content.Context r4 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.BroadcastReceiver r1 = com.tendcloud.tenddata.k.k     // Catch: java.lang.Throwable -> L26
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            android.content.Intent r1 = r4.registerReceiver(r1, r2)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            java.lang.String r2 = "status"
            int r1 = r1.getIntExtra(r2, r0)     // Catch: java.lang.Throwable -> L26
            goto L20
        L1f:
            r1 = r0
        L20:
            android.content.BroadcastReceiver r2 = com.tendcloud.tenddata.k.k     // Catch: java.lang.Throwable -> L26
            r4.unregisterReceiver(r2)     // Catch: java.lang.Throwable -> L26
            return r1
        L26:
            return r0
    }

    public static java.lang.String g() {
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static java.lang.String h() {
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r0 = r0.trim()
            return r0
    }

    public static org.json.JSONObject h(android.content.Context r3) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "mobile"
            boolean r2 = o(r3)     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "wifi"
            boolean r2 = k(r3)     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "gps"
            boolean r2 = j(r3)     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "telephone"
            boolean r2 = n(r3)     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "nfc"
            boolean r2 = m(r3)     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "bluetooth"
            boolean r2 = l(r3)     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "otg"
            boolean r3 = i(r3)     // Catch: java.lang.Throwable -> L45
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L45
            return r0
        L45:
            r3 = 0
            return r3
    }

    public static int i() {
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            int r0 = r0.getRawOffset()
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            int r0 = r0 / r1
            return r0
    }

    public static boolean i(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            java.lang.String r1 = "android.hardware.usb.host"
            boolean r2 = r2.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            r2 = 1
            r0 = r2
        L19:
            return r0
    }

    public static java.lang.String j() {
            java.lang.String r0 = ""
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = b(r2, r1)     // Catch: java.lang.Throwable -> L36
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L22
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = b(r2, r1)     // Catch: java.lang.Throwable -> L36
        L22:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L27
            r2 = r0
        L27:
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = ":"
            r3.append(r2)     // Catch: java.lang.Throwable -> L36
            r3.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L36
        L36:
            return r0
    }

    public static boolean j(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            java.lang.String r1 = "android.hardware.location.gps"
            boolean r2 = r2.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            r2 = 1
            r0 = r2
        L19:
            return r0
    }

    public static java.lang.String k() {
            java.lang.String r0 = "unknown"
            r1 = 14
            boolean r1 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Le
            java.lang.String r0 = android.os.Build.getRadioVersion()     // Catch: java.lang.Throwable -> Le
        Le:
            return r0
    }

    public static boolean k(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            java.lang.String r1 = "android.hardware.wifi"
            boolean r2 = r2.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            r2 = 1
            r0 = r2
        L19:
            return r0
    }

    public static int l() {
            int r0 = android.os.Build.VERSION.SDK_INT
            return r0
    }

    public static boolean l(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            java.lang.String r1 = "android.hardware.bluetooth"
            boolean r2 = r2.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            r2 = 1
            r0 = r2
        L19:
            return r0
    }

    public static java.lang.String m() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            return r0
    }

    public static boolean m(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            java.lang.String r1 = "android.hardware.nfc"
            boolean r2 = r2.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L19
            r2 = 1
            r0 = r2
        L19:
            return r0
    }

    public static java.lang.String n() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            return r0
    }

    public static boolean n(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)     // Catch: java.lang.Throwable -> L1a
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1a
            int r2 = r2.getPhoneType()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1a
            r0 = 1
        L1a:
            return r0
    }

    public static java.lang.String o() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            return r0
    }

    public static boolean o(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "android.hardware.telephony"
            boolean r0 = r2.hasSystemFeature(r1)     // Catch: java.lang.Throwable -> L13
        L13:
            return r0
    }

    public static int p(android.content.Context r1) {
            r0 = -1
            if (r1 != 0) goto L9
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L16
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L16
            int r1 = r1.widthPixels     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            return r0
    }

    public static java.lang.String[] p() {
            r0 = 4
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto Le
            java.lang.String r4 = ""
            r1[r3] = r4
            int r3 = r3 + 1
            goto L5
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L90
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L90
            r5 = 1024(0x400, float:1.435E-42)
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L90
        L21:
            r5 = 1
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L3c
            r0.add(r6)     // Catch: java.lang.Throwable -> L44
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L44
            r7 = 104857600(0x6400000, float:3.6111186E-35)
            if (r6 > r7) goto L34
            goto L21
        L34:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = "List size more than 104857600 limit"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L44
            throw r6     // Catch: java.lang.Throwable -> L44
        L3c:
            r4.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L90
            r3.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L90
        L42:
            r3 = r5
            goto L4b
        L44:
            r4.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L90
            r3.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L90
        L4a:
            r3 = r2
        L4b:
            java.lang.String r4 = "Processor\\s*:\\s*(.*)"
            java.lang.String r6 = "CPU\\s*variant\\s*:\\s*0x(.*)"
            java.lang.String r7 = "Hardware\\s*:\\s*(.*)"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6, r7}     // Catch: java.lang.Throwable -> L90
            r6 = 3
            if (r3 == 0) goto L88
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L90
            r7 = r2
        L5d:
            if (r7 >= r6) goto L88
            r8 = r4[r7]     // Catch: java.lang.Throwable -> L90
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)     // Catch: java.lang.Throwable -> L90
            r9 = r2
        L66:
            if (r9 >= r3) goto L85
            java.lang.Object r10 = r0.get(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L90
            java.util.regex.Matcher r10 = r8.matcher(r10)     // Catch: java.lang.Throwable -> L90
            boolean r11 = r10.find()     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L82
            java.util.regex.MatchResult r10 = r10.toMatchResult()     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = r10.group(r5)     // Catch: java.lang.Throwable -> L90
            r1[r7] = r10     // Catch: java.lang.Throwable -> L90
        L82:
            int r9 = r9 + 1
            goto L66
        L85:
            int r7 = r7 + 1
            goto L5d
        L88:
            java.lang.String r0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L90
            r1[r6] = r0     // Catch: java.lang.Throwable -> L90
        L90:
            return r1
    }

    public static int q(android.content.Context r1) {
            r0 = -1
            if (r1 != 0) goto L9
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L16
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L16
            int r1 = r1.heightPixels     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            return r0
    }

    public static org.json.JSONObject q() {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "name"
            java.lang.String[] r2 = p()     // Catch: java.lang.Throwable -> L3c
            r3 = 2
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L3c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "coreNum"
            int r2 = r()     // Catch: java.lang.Throwable -> L3c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "maxFreq"
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            int r2 = a(r2)     // Catch: java.lang.Throwable -> L3c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "minFreq"
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"
            int r2 = a(r2)     // Catch: java.lang.Throwable -> L3c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "curFreq"
            java.lang.String r2 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            int r2 = a(r2)     // Catch: java.lang.Throwable -> L3c
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L3c
            return r0
        L3c:
            r0 = 0
            return r0
    }

    public static int r() {
            r0 = 1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "/sys/devices/system/cpu/"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            java.io.FileFilter r2 = com.tendcloud.tenddata.k.j     // Catch: java.lang.Throwable -> L11
            java.io.File[] r1 = r1.listFiles(r2)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L11
            int r0 = r1.length     // Catch: java.lang.Throwable -> L11
        L11:
            return r0
    }

    public static int r(android.content.Context r1) {
            r0 = -1
            if (r1 != 0) goto L9
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L16
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L16
            int r1 = r1.densityDpi     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            return r0
    }

    public static int s(android.content.Context r2) {
            r0 = -1
            if (r2 != 0) goto L9
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            if (r2 == 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "screen_brightness"
            int r0 = android.provider.Settings.System.getInt(r2, r1)     // Catch: java.lang.Throwable -> L13
        L13:
            return r0
    }

    public static int[] s() {
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {x003a: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "mounted"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L39
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L39
            android.os.StatFs r3 = new android.os.StatFs     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L39
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L39
            int r2 = r3.getBlockSize()     // Catch: java.lang.Throwable -> L39
            int r4 = r3.getBlockCount()     // Catch: java.lang.Throwable -> L39
            int r3 = r3.getAvailableBlocks()     // Catch: java.lang.Throwable -> L39
            r5 = 0
            int r6 = r2 / 512
            int r4 = r4 * r6
            int r4 = r4 / r0
            r1[r5] = r4     // Catch: java.lang.Throwable -> L39
            r4 = 1
            int r2 = r2 / 512
            int r3 = r3 * r2
            int r3 = r3 / r0
            r1[r4] = r3     // Catch: java.lang.Throwable -> L39
        L39:
            return r1
    }

    private static org.json.JSONArray t(android.content.Context r11) {
            r0 = 19
            boolean r0 = com.tendcloud.tenddata.y.a(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5c
            r0.<init>()     // Catch: java.lang.Throwable -> L5c
            r2 = 4
            java.util.List r2 = a(r11, r2)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L5b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5c
        L1a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5c
            android.content.pm.PackageInfo r3 = (android.content.pm.PackageInfo) r3     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L29
            goto L1a
        L29:
            android.content.pm.ServiceInfo[] r4 = r3.services     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L1a
            int r5 = r4.length     // Catch: java.lang.Throwable -> L5c
            r6 = 0
        L2f:
            if (r6 >= r5) goto L1a
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L5c
            android.content.pm.PackageManager r8 = r11.getPackageManager()     // Catch: java.lang.Throwable -> L58
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L58
            java.lang.String r10 = r7.packageName     // Catch: java.lang.Throwable -> L58
            java.lang.String r7 = r7.name     // Catch: java.lang.Throwable -> L58
            r9.<init>(r10, r7)     // Catch: java.lang.Throwable -> L58
            r7 = 128(0x80, float:1.8E-43)
            android.content.pm.ServiceInfo r7 = r8.getServiceInfo(r9, r7)     // Catch: java.lang.Throwable -> L58
            android.os.Bundle r7 = r7.metaData     // Catch: java.lang.Throwable -> L58
            if (r7 == 0) goto L58
            java.lang.String r8 = "android.nfc.cardemulation.host_apdu_service"
            boolean r7 = r7.containsKey(r8)     // Catch: java.lang.Throwable -> L58
            if (r7 == 0) goto L58
            java.lang.String r7 = r3.packageName     // Catch: java.lang.Throwable -> L58
            r0.put(r7)     // Catch: java.lang.Throwable -> L58
            goto L1a
        L58:
            int r6 = r6 + 1
            goto L2f
        L5b:
            return r0
        L5c:
            return r1
    }

    /* JADX DEBUG: Throwable added to exception handler: 'IOException', keep only Throwable */
    public static int[] t() {
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {x0060: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r2 = 4
            int[] r3 = new int[r2]
            r4 = 0
            r5 = r4
        Lb:
            if (r5 >= r2) goto L12
            r3[r5] = r4
            int r5 = r5 + 1
            goto Lb
        L12:
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = "/proc/meminfo"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5f
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5f
            r7 = 1024(0x400, float:1.435E-42)
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L5f
            r7 = r4
        L21:
            if (r7 >= r2) goto L40
            java.lang.String r8 = r6.readLine()     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            int r9 = r8.length()     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            r10 = 104857600(0x6400000, float:3.6111186E-35)
            if (r9 > r10) goto L38
            int r8 = b(r8)     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            r3[r7] = r8     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            int r7 = r7 + 1
            goto L21
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            java.lang.String r2 = "Input stream more than 100 MB size limit"
            r0.<init>(r2)     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            throw r0     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
        L40:
            r2 = r3[r4]     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            r1[r4] = r2     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            r2 = 1
            r4 = r3[r2]     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            r0 = r3[r0]     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            int r4 = r4 + r0
            r0 = 3
            r0 = r3[r0]     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
            int r4 = r4 + r0
            r1[r2] = r4     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L57
        L50:
            r6.close()
            r5.close()
            goto L5f
        L57:
            r0 = move-exception
            r6.close()     // Catch: java.io.IOException -> L5e java.lang.Throwable -> L5f
            r5.close()     // Catch: java.io.IOException -> L5e java.lang.Throwable -> L5f
        L5e:
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            return r1
    }

    private static int u(android.content.Context r2) {
            r0 = 19
            r1 = -1
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            java.lang.String r0 = "nfc"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L22
            android.nfc.NfcManager r2 = (android.nfc.NfcManager) r2     // Catch: java.lang.Throwable -> L22
            android.nfc.NfcAdapter r2 = r2.getDefaultAdapter()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L22
            android.nfc.cardemulation.CardEmulation r2 = android.nfc.cardemulation.CardEmulation.getInstance(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "payment"
            int r2 = r2.getSelectionModeForCategory(r0)     // Catch: java.lang.Throwable -> L22
            r1 = r2
        L22:
            return r1
    }

    public static int[] u() {
            r0 = 4
            int[] r0 = new int[r0]
            int[] r1 = com.tendcloud.tenddata.k.i
            if (r1 == 0) goto La
            int r1 = r1.length
            if (r1 > 0) goto L10
        La:
            int[] r0 = a(r0)
            com.tendcloud.tenddata.k.i = r0
        L10:
            int[] r0 = com.tendcloud.tenddata.k.i
            return r0
    }

    public static int v() {
            r0 = 0
            java.lang.String r1 = "/sys/class/power_supply/battery/full_bat"
            java.lang.String r1 = c(r1)     // Catch: java.lang.Exception -> L1f
            java.util.regex.Pattern r2 = com.tendcloud.tenddata.k.f     // Catch: java.lang.Exception -> L1f
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch: java.lang.Exception -> L1f
            boolean r2 = r1.find()     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L1f
            java.util.regex.MatchResult r1 = r1.toMatchResult()     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = r1.group(r0)     // Catch: java.lang.Exception -> L1f
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L1f
        L1f:
            return r0
    }
}
