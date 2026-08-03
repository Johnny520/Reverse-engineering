package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class ab {
    public static final java.lang.String A = "TD_sdk_last_send_time_wifi";
    public static final java.lang.String B = "TD_sdk_last_send_time_mobile_data";
    public static final java.lang.String C = "TD_sdk_last_send_url";
    public static final java.lang.String D = "TD_sdk_last_send_host";
    public static final java.lang.String E = "isDeveloper";
    public static java.lang.String F = null;
    public static java.lang.String G = null;
    public static boolean H = false;
    public static java.lang.String I = null;
    public static boolean J = false;
    public static final int K = 104857600;
    public static final java.lang.String L = "WiFi";
    public static final java.lang.String M = "All";
    public static java.lang.String N = null;
    public static final java.lang.String O = "v1.0.0";
    public static boolean P = false;
    public static boolean Q = false;
    public static boolean R = false;
    public static boolean S = false;
    public static com.tendcloud.tenddata.TalkingDataSDKConfig T = null;
    public static final java.lang.String U = "Android+TD+V5.0.28 gp";
    public static long V = 0;
    public static int W = 0;
    public static java.util.concurrent.atomic.AtomicInteger X = null;
    public static final int Y = 1800000;
    public static final java.util.concurrent.atomic.AtomicBoolean Z = null;
    public static final boolean a = false;
    public static final long aa = 30000;
    public static final int ab = 100;
    public static final java.lang.String ac = "TD_APP_ID";
    public static final java.lang.String ad = "TD_CHANNEL_ID";
    private static java.util.HashMap<java.lang.String, java.lang.Object> ae = null;
    private static final java.lang.String af = "+V";
    private static final int ag = 120;
    private static final int ah = 30;
    private static final int ai = 1000;
    public static boolean b = false;
    public static final java.util.concurrent.atomic.AtomicBoolean c = null;
    public static final java.util.Map<java.lang.String, java.lang.Object> d = null;
    public static boolean e = false;
    public static long f = 0;
    public static android.content.Context g = null;
    public static android.os.Handler h = null;
    public static final int i = 1;
    public static final java.lang.String j = "Android+";
    public static java.nio.channels.FileChannel k = null;
    public static long l = 0;
    public static boolean m = false;
    public static int n = 0;
    public static boolean o = false;
    public static boolean p = false;
    public static long q = 0;
    public static java.lang.String r = null;
    public static final java.lang.String s = "TD";
    public static final java.lang.String t = "TDLog";
    public static com.tendcloud.tenddata.TalkingDataSharingFilter u = null;
    public static final java.lang.String v = "2606";
    public static final java.lang.String w = "TD_app_pefercen_profile";
    public static final java.lang.String x = "TD_appId_";
    public static final java.lang.String y = "TD_channelId";
    public static final java.lang.String z = "TD_init_custom";

    public class a {
        public static final int DST_FILE = 2;
        public static final int DST_SQLITE = 1;
        public final /* synthetic */ com.tendcloud.tenddata.ab this$0;

        public a(com.tendcloud.tenddata.ab r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }
    }

    public static class b {
        public static final int API_MYNA_INIT = 90;
        public static final int API_MYNA_START = 91;
        public static final int API_MYNA_STOP = 92;
        public static final int API_ON_ERROR = 3;
        public static final int API_ON_EVENT = 2;
        public static final int API_ON_INIT = 1;
        public static final int API_ON_PAGE_END = 5;
        public static final int API_ON_PAGE_START = 4;
        public static final int API_TYPE_ACCOUNT = 9;
        public static final int API_TYPE_BRAND_GROWTH = 16;
        public static final int API_TYPE_CUST_LOCATION = 14;
        public static final int API_TYPE_GAME = 6;
        public static final int API_TYPE_GAME_SESSION_END = 15;
        public static final int API_TYPE_GAME_SESSION_START = 12;
        public static final int API_TYPE_IAP = 8;
        public static final int API_TYPE_INDUSTRY = 17;
        public static final int API_TYPE_SESSION_END = 11;
        public static final int API_TYPE_SESSION_PAUSE = 13;
        public static final int API_TYPE_SESSION_START = 10;
        public static final int API_TYPE_TRACKING = 7;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public class c {
        public static final int SDT_JSON = 2;
        public static final int SDT_MP = 1;
        public static final int SDT_PB = 3;
        public static final int SDT_UNKNOWN = -1;
        public final /* synthetic */ com.tendcloud.tenddata.ab this$0;

        public c(com.tendcloud.tenddata.ab r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.tendcloud.tenddata.ab.c = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.tendcloud.tenddata.ab.d = r0
            com.tendcloud.tenddata.ab.e = r1
            r2 = 0
            com.tendcloud.tenddata.ab.f = r2
            r0 = 0
            com.tendcloud.tenddata.ab.g = r0
            com.tendcloud.tenddata.ab.h = r0
            com.tendcloud.tenddata.ab.l = r2
            com.tendcloud.tenddata.ab.m = r1
            r2 = -1
            com.tendcloud.tenddata.ab.n = r2
            r2 = 1
            com.tendcloud.tenddata.ab.o = r2
            com.tendcloud.tenddata.ab.p = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            com.tendcloud.tenddata.ab.q = r2
            com.tendcloud.tenddata.TalkingDataSharingFilter r2 = com.tendcloud.tenddata.TalkingDataSharingFilter.SHARE
            com.tendcloud.tenddata.ab.u = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.tendcloud.tenddata.ab.ae = r2
            java.lang.String r2 = "Default"
            com.tendcloud.tenddata.ab.F = r2
            java.lang.String r2 = ""
            com.tendcloud.tenddata.ab.G = r2
            com.tendcloud.tenddata.ab.H = r1
            com.tendcloud.tenddata.ab.I = r0
            com.tendcloud.tenddata.ab.J = r1
            java.lang.String r0 = "WiFi"
            com.tendcloud.tenddata.ab.N = r0
            com.tendcloud.tenddata.ab.P = r1
            com.tendcloud.tenddata.ab.Q = r1
            com.tendcloud.tenddata.ab.R = r1
            com.tendcloud.tenddata.ab.S = r1
            com.tendcloud.tenddata.TalkingDataSDKConfig r0 = new com.tendcloud.tenddata.TalkingDataSDKConfig
            r0.<init>()
            com.tendcloud.tenddata.ab.T = r0
            r0 = 2
            com.tendcloud.tenddata.ab.W = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            com.tendcloud.tenddata.ab.X = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            com.tendcloud.tenddata.ab.Z = r0
            return
    }

    public ab() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r3, com.tendcloud.tenddata.a r4) {
            java.lang.String r0 = ""
            if (r3 == 0) goto L32
            if (r4 != 0) goto L7
            goto L32
        L7:
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.ab.ae
            java.lang.String r2 = r4.name()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.tendcloud.tenddata.y.b(r1)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            java.lang.String r1 = "TD_appId_"
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            java.lang.String r4 = r4.name()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "TD_app_pefercen_profile"
            java.lang.String r3 = com.tendcloud.tenddata.s.b(r3, r1, r4, r0)
            return r3
        L32:
            java.lang.String r3 = "Context or Service is null"
            java.lang.String[] r3 = new java.lang.String[]{r3}
            com.tendcloud.tenddata.h.dForInternal(r3)
            return r0
    }

    private static void a(int r1) {
            com.tendcloud.tenddata.cz r0 = new com.tendcloud.tenddata.cz     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            switch(r1) {
                case 1: goto L23;
                case 2: goto L20;
                case 3: goto L1d;
                case 4: goto L1a;
                case 5: goto L17;
                case 6: goto L14;
                case 7: goto L11;
                case 8: goto Lb;
                default: goto L8;
            }     // Catch: java.lang.Throwable -> L26
        L8:
            java.lang.String r1 = "Native"
            goto Ld
        Lb:
            java.lang.String r1 = "Flutter"
        Ld:
            r0.setFrameWork(r1)     // Catch: java.lang.Throwable -> L26
            goto L26
        L11:
            java.lang.String r1 = "ReactNative"
            goto Ld
        L14:
            java.lang.String r1 = "Hybrid"
            goto Ld
        L17:
            java.lang.String r1 = "APICloud"
            goto Ld
        L1a:
            java.lang.String r1 = "PhoneGap"
            goto Ld
        L1d:
            java.lang.String r1 = "AIR"
            goto Ld
        L20:
            java.lang.String r1 = "Unity"
            goto Ld
        L23:
            java.lang.String r1 = "Cocos2d"
            goto Ld
        L26:
            return
    }

    public static void a(java.lang.String r2, com.tendcloud.tenddata.a r3) {
            if (r3 == 0) goto L23
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = com.tendcloud.tenddata.ab.ae
            java.lang.String r1 = r3.name()
            r0.put(r1, r2)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = "TD_appId_"
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            java.lang.String r3 = r3.name()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "TD_app_pefercen_profile"
            com.tendcloud.tenddata.s.a(r0, r1, r3, r2)
        L23:
            return
    }

    public static void a(java.lang.String r2, java.lang.String r3, com.tendcloud.tenddata.a r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L11
            android.os.Handler r0 = new android.os.Handler
            android.content.Context r1 = com.tendcloud.tenddata.ab.g
            android.os.Looper r1 = r1.getMainLooper()
            r0.<init>(r1)
            com.tendcloud.tenddata.ab.h = r0
        L11:
            long r0 = java.lang.System.currentTimeMillis()
            com.tendcloud.tenddata.ab.f = r0
            if (r2 == 0) goto L35
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
            java.lang.String r0 = "-"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L35
            r1 = 0
            java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Throwable -> L34
            r0 = 1
            r2 = r2[r0]     // Catch: java.lang.Throwable -> L34
            goto L35
        L34:
            r2 = r1
        L35:
            if (r3 == 0) goto L43
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L43
            com.tendcloud.tenddata.ab.F = r3
        L43:
            a(r2, r4)
            java.lang.String r3 = com.tendcloud.tenddata.ab.F
            b(r3, r4)
            com.tendcloud.tenddata.cw r3 = com.tendcloud.tenddata.cw.a()
            r3.a(r2, r4)
            com.tendcloud.tenddata.cw r2 = com.tendcloud.tenddata.cw.a()
            java.lang.String r3 = com.tendcloud.tenddata.ab.F
            r2.b(r3, r4)
            int r2 = com.tendcloud.tenddata.dz.a
            a(r2)
            return
    }

    private static boolean a(android.content.Context r5) {
            r0 = 0
            com.tendcloud.tenddata.g r1 = com.tendcloud.tenddata.g.a()     // Catch: java.lang.Throwable -> L17
            long r1 = r1.d(r5)     // Catch: java.lang.Throwable -> L17
            com.tendcloud.tenddata.g r3 = com.tendcloud.tenddata.g.a()     // Catch: java.lang.Throwable -> L17
            long r3 = r3.e(r5)     // Catch: java.lang.Throwable -> L17
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L17
            r5 = 1
            r0 = r5
        L17:
            return r0
    }

    public static boolean a(com.tendcloud.tenddata.a r11) {
            r0 = 0
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L6
            return r0
        L6:
            if (r11 != 0) goto L9
            return r0
        L9:
            boolean r1 = a(r1)     // Catch: java.lang.Throwable -> L69
            r2 = 1
            r4 = 1
            if (r1 == 0) goto L1c
            long r5 = com.tendcloud.tenddata.i.e(r11)     // Catch: java.lang.Throwable -> L69
            int r11 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r11 != 0) goto L1b
            r0 = r4
        L1b:
            return r0
        L1c:
            long r5 = com.tendcloud.tenddata.i.e(r11)     // Catch: java.lang.Throwable -> L69
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 != 0) goto L69
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69
            long r5 = com.tendcloud.tenddata.i.d(r11)     // Catch: java.lang.Throwable -> L69
            long r5 = r1 - r5
            long r7 = com.tendcloud.tenddata.ab.q     // Catch: java.lang.Throwable -> L69
            r9 = 4
            long r7 = r7 * r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L66
            long r5 = com.tendcloud.tenddata.i.e()     // Catch: java.lang.Throwable -> L69
            long r1 = r1 - r5
            long r5 = com.tendcloud.tenddata.ab.q     // Catch: java.lang.Throwable -> L69
            long r5 = r5 * r9
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L4a
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L69
            boolean r11 = d(r1, r11)     // Catch: java.lang.Throwable -> L69
            return r11
        L4a:
            boolean r1 = c(r11)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L51
            return r4
        L51:
            boolean r1 = e(r11)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L58
            return r4
        L58:
            boolean r1 = d(r11)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L5f
            return r4
        L5f:
            boolean r11 = b(r11)     // Catch: java.lang.Throwable -> L69
            if (r11 == 0) goto L69
            return r4
        L66:
            com.tendcloud.tenddata.i.a(r0, r11)     // Catch: java.lang.Throwable -> L69
        L69:
            return r0
    }

    public static int[] a() {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [120000, 30000} // fill-array
            return r0
    }

    public static java.lang.String b(android.content.Context r2, com.tendcloud.tenddata.a r3) {
            java.lang.String r0 = com.tendcloud.tenddata.ab.F
            boolean r0 = com.tendcloud.tenddata.y.b(r0)
            java.lang.String r1 = "Default"
            if (r0 != 0) goto L12
            java.lang.String r0 = com.tendcloud.tenddata.ab.F
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
        L12:
            java.lang.String r0 = "TD_channelId"
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.lang.String r3 = r3.name()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "TD_app_pefercen_profile"
            java.lang.String r2 = com.tendcloud.tenddata.s.b(r2, r0, r3, r1)
            com.tendcloud.tenddata.ab.F = r2
        L2b:
            java.lang.String r2 = com.tendcloud.tenddata.ab.F
            return r2
    }

    public static void b(java.lang.String r2, com.tendcloud.tenddata.a r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = "TD_channelId"
            java.lang.StringBuilder r1 = p000.c4.m108(r1)
            java.lang.String r3 = r3.name()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "TD_app_pefercen_profile"
            com.tendcloud.tenddata.s.a(r0, r1, r3, r2)
            return
    }

    public static boolean b() {
            r0 = 0
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "TD_app_pefercen_profile"
            java.lang.String r3 = "isDeveloper"
            r4 = 0
            long r1 = com.tendcloud.tenddata.s.b(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L12
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L12
            r0 = 1
        L12:
            return r0
    }

    private static boolean b(com.tendcloud.tenddata.a r9) {
            java.lang.String r0 = "td_database3SaaS"
            java.lang.String r1 = "td_database1SaaS"
            java.lang.String r2 = "td_database0SaaS"
            android.content.Context r3 = com.tendcloud.tenddata.ab.g
            r4 = 0
            if (r3 == 0) goto L6a
            java.lang.String r9 = r9.name()
            java.lang.String r3 = "SDK"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L6a
            android.content.Context r9 = com.tendcloud.tenddata.ab.g
            java.io.File r9 = r9.getFilesDir()
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L6a
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r9, r1)     // Catch: java.lang.Throwable -> L6a
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            r6.<init>(r9, r0)     // Catch: java.lang.Throwable -> L6a
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = "__database_reborn_January_one__"
            r7.<init>(r9, r8)     // Catch: java.lang.Throwable -> L6a
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            r9.<init>(r7, r2)     // Catch: java.lang.Throwable -> L6a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L6a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r6.exists()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L4e
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L6a
        L4e:
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L6a
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L6a
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L6a
            boolean r9 = r9.exists()     // Catch: java.lang.Throwable -> L6a
            if (r9 == 0) goto L67
            goto L6a
        L67:
            r9 = 1
            r4 = r9
        L6a:
            return r4
    }

    public static java.lang.String c() {
            com.tendcloud.tenddata.cz r0 = new com.tendcloud.tenddata.cz     // Catch: java.lang.Throwable -> La
            r0.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> La
            goto Lc
        La:
            java.lang.String r0 = "Native"
        Lc:
            return r0
    }

    public static java.lang.String c(android.content.Context r3, com.tendcloud.tenddata.a r4) {
            java.lang.String r0 = com.tendcloud.tenddata.ab.G     // Catch: java.lang.Throwable -> L27
            boolean r0 = com.tendcloud.tenddata.y.b(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L27
            java.lang.String r0 = "TD_app_pefercen_profile"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "TD_init_custom"
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r4.name()     // Catch: java.lang.Throwable -> L27
            r1.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = ""
            java.lang.String r3 = com.tendcloud.tenddata.s.b(r3, r0, r4, r1)     // Catch: java.lang.Throwable -> L27
            com.tendcloud.tenddata.ab.G = r3     // Catch: java.lang.Throwable -> L27
        L27:
            java.lang.String r3 = com.tendcloud.tenddata.ab.G
            return r3
    }

    public static void c(java.lang.String r4, com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "TD_app_pefercen_profile"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "TD_init_custom"
            r2.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r5.name()     // Catch: java.lang.Throwable -> L1c
            r2.append(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L1c
            com.tendcloud.tenddata.s.a(r0, r1, r5, r4)     // Catch: java.lang.Throwable -> L1c
        L1c:
            return
    }

    private static boolean c(com.tendcloud.tenddata.a r7) {
            java.lang.String r0 = "td_database0SaaS"
            java.lang.String r1 = "td_database3SaaS"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            r3 = 0
            if (r2 == 0) goto L50
            java.lang.String r7 = r7.name()
            java.lang.String r2 = "TRACKING"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L50
            android.content.Context r7 = com.tendcloud.tenddata.ab.g
            java.io.File r7 = r7.getFilesDir()
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L50
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r4.<init>(r7, r0)     // Catch: java.lang.Throwable -> L50
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "__database_reborn_January_one__"
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L50
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r7.<init>(r5, r1)     // Catch: java.lang.Throwable -> L50
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            boolean r7 = r7.exists()     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L4e
            boolean r7 = r1.exists()     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L50
        L4e:
            r7 = 1
            r3 = r7
        L50:
            return r3
    }

    private static boolean d(android.content.Context r3, com.tendcloud.tenddata.a r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2f
            java.lang.String r0 = r4.name()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "TRACKING"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L1c
            java.lang.String r0 = r4.name()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "SDK"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2f
        L1c:
            java.lang.String r0 = "talkingdata_file_prefence"
            java.lang.String r1 = "actived"
            r2 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r2)     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r3.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L2f
            com.tendcloud.tenddata.i.a(r2, r4)     // Catch: java.lang.Throwable -> L2f
            return r2
        L2f:
            r3 = 1
            return r3
    }

    private static boolean d(com.tendcloud.tenddata.a r7) {
            java.lang.String r0 = "td_database1SaaS"
            java.lang.String r1 = "td_database3SaaS"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            r3 = 0
            if (r2 == 0) goto L50
            java.lang.String r7 = r7.name()
            java.lang.String r2 = "APP"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L50
            android.content.Context r7 = com.tendcloud.tenddata.ab.g
            java.io.File r7 = r7.getFilesDir()
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L50
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r4.<init>(r7, r0)     // Catch: java.lang.Throwable -> L50
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "__database_reborn_January_one__"
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L50
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r7.<init>(r5, r1)     // Catch: java.lang.Throwable -> L50
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            boolean r7 = r7.exists()     // Catch: java.lang.Throwable -> L50
            if (r7 != 0) goto L4e
            boolean r7 = r1.exists()     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L50
        L4e:
            r7 = 1
            r3 = r7
        L50:
            return r3
    }

    private static boolean e(com.tendcloud.tenddata.a r7) {
            java.lang.String r0 = "td_database1SaaS"
            java.lang.String r1 = "td_database0SaaS"
            android.content.Context r2 = com.tendcloud.tenddata.ab.g
            r3 = 0
            if (r2 == 0) goto L50
            java.lang.String r7 = r7.name()
            java.lang.String r2 = "GAME"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L50
            android.content.Context r7 = com.tendcloud.tenddata.ab.g
            java.io.File r7 = r7.getFilesDir()
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L50
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r4.<init>(r7, r0)     // Catch: java.lang.Throwable -> L50
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "__database_reborn_January_one__"
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L50
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r7.<init>(r5, r1)     // Catch: java.lang.Throwable -> L50
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L50
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4e
            boolean r7 = r7.exists()     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L50
        L4e:
            r7 = 1
            r3 = r7
        L50:
            return r3
    }

    public static void setCofig(com.tendcloud.tenddata.TalkingDataSDKConfig r0) {
            if (r0 == 0) goto L4
            com.tendcloud.tenddata.ab.T = r0
        L4:
            return
    }

    public static void setConfigurationDisable(int r3) {
            r0 = r3 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            com.tendcloud.tenddata.ab.P = r0     // Catch: java.lang.Throwable -> L24
            r0 = r3 & 2
            if (r0 == 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            com.tendcloud.tenddata.ab.Q = r0     // Catch: java.lang.Throwable -> L24
            r0 = r3 & 4
            if (r0 == 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            com.tendcloud.tenddata.ab.R = r0     // Catch: java.lang.Throwable -> L24
            r3 = r3 & 8
            if (r3 == 0) goto L22
            r1 = r2
        L22:
            com.tendcloud.tenddata.ab.S = r1     // Catch: java.lang.Throwable -> L24
        L24:
            return
    }

    public static void setDeveloperMode(boolean r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "TD_app_pefercen_profile"
            java.lang.String r2 = "isDeveloper"
            if (r5 == 0) goto Lb
            r3 = 1
            goto Ld
        Lb:
            r3 = 0
        Ld:
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }
}
