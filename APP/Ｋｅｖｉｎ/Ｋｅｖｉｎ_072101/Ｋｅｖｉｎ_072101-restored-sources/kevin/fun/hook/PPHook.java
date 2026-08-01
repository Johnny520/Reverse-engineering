package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class PPHook {
    private static final java.lang.String ACTIVATE_URL = null;
    private static final java.lang.String KEY_ACTIVATED = null;
    private static final java.lang.String KEY_ACTIVATED_ACCOUNTS = null;
    private static final java.lang.String KEY_ACTIVATED_CODE = null;
    private static final java.lang.String KEY_ACTIVATED_UID = null;
    private static final java.lang.String KEY_VIP_WELCOME_SHOWN = null;
    private static final java.lang.String TG_GROUP_LINK = null;
    private static final java.lang.String VIP_LIST_URL = null;
    private static android.app.Dialog loadingDialog;
    private static final android.os.Handler mainHandler = null;
    private static java.lang.String sCurrentDyNickname;
    private static java.lang.String sCurrentDyUid;
    private static volatile boolean sVipListLoaded;
    private static volatile java.util.Set<java.lang.String> sVipUidSet;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f371short = null;

    /* JADX INFO: renamed from: kevin.fun.hook.PPHook$1 */
    class RunnableC06601 implements java.lang.Runnable {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f372short = null;
        private final kevin.fun.hook.PPHook.VerifyCallback val$callback;
        private final android.content.Context val$context;

        static {
                r0 = 51
                short[] r0 = new short[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [9056, 1036, -28709, 21860, 29271, 23417, 26298, -27681, 27552, 25674, 25025, 24250, 27523, 27074, 31246, 28188, -25735, -32340, 24445, 17259, 27877, 3200, 3200, -30851, 24002, 31473, 21471, 28188, -25735, 22660, 23815, -31919, -31546, 25418, 25009, 3200, 22700, 24211, 25418, 25009, 29835, 17296, 25056, -32333, 23458, 26986, 27074, -32340, 24445, 17024, -3189} // fill-array
                kevin.fun.hook.PPHook.RunnableC06601.f372short = r0
                return
        }

        RunnableC06601(android.content.Context r3, kevin.fun.hook.PPHook.VerifyCallback r4) {
                r2 = this;
                r2.val$context = r3
                r2.val$callback = r4
                r2.<init>()
                int r1 = androidx.interpolator.C1082.m1718()
                r0 = 1616(0x650, float:2.264E-42)
            Ld:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L13;
                    case 49: goto L16;
                    case 204: goto L1b;
                    case 239: goto L2a;
                    default: goto L12;
                }
            L12:
                goto Ld
            L13:
                r0 = 1678(0x68e, float:2.351E-42)
                goto Ld
            L16:
                if (r1 < 0) goto L13
                r0 = 1709(0x6ad, float:2.395E-42)
                goto Ld
            L1b:
                java.lang.String r0 = "XSFV4lddhdu77v1Zr"
                java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
                java.lang.Float r0 = java.lang.Float.decode(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L2a:
                return
        }

        /* JADX INFO: renamed from: ۟ۥۤۦۧ, reason: not valid java name and contains not printable characters */
        public static android.content.Context m7287(java.lang.Object r2) {
                int r1 = androidx.lifecycle.runtime.C1092.m2295()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.PPHook$1 r2 = (kevin.fun.hook.PPHook.RunnableC06601) r2
                android.content.Context r0 = r2.val$context
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۣ۠ۨۡ, reason: not valid java name and contains not printable characters */
        public static short[] m7288() {
                int r1 = androidx.lifecycle.process.C1089.m2142()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L17;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                short[] r0 = kevin.fun.hook.PPHook.RunnableC06601.f372short
            L16:
                return r0
            L17:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1a:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L20;
                    case 54: goto L16;
                    default: goto L1f;
                }
            L1f:
                goto L1a
            L20:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1a
        }

        /* JADX INFO: renamed from: ۦۥۨ۠, reason: contains not printable characters */
        public static void m7289(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5, java.lang.Object r6) {
                int r1 = androidx.loader.C1098.m2793()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L20;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                android.content.Context r2 = (android.content.Context) r2
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = (java.lang.String) r4
                kevin.fun.hook.PPHook$VerifyCallback r6 = (kevin.fun.hook.PPHook.VerifyCallback) r6
                kevin.fun.hook.PPHook._$$Nest$smshowResultDialog(r2, r3, r4, r5, r6)
            L1f:
                return
            L20:
                r0 = 1740(0x6cc, float:2.438E-42)
            L22:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L28;
                    case 54: goto L1f;
                    default: goto L27;
                }
            L27:
                goto L22
            L28:
                r0 = 1771(0x6eb, float:2.482E-42)
                goto L22
        }

        /* JADX INFO: renamed from: ۧۦۨۧ, reason: not valid java name and contains not printable characters */
        public static kevin.fun.hook.PPHook.VerifyCallback m7290(java.lang.Object r2) {
                int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.PPHook$1 r2 = (kevin.fun.hook.PPHook.RunnableC06601) r2
                kevin.fun.hook.PPHook$VerifyCallback r0 = r2.val$callback
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                r7 = 0
                android.content.Context r0 = m7287(r8)
                kevin.fun.hook.PPHook$VerifyCallback r1 = m7290(r8)
                short[] r2 = m7288()
                int r3 = androidx.appcompat.resources.C1068.f94
                r3 = r3 ^ 518(0x206, float:7.26E-43)
                r4 = 1068(0x42c, float:1.497E-42)
                java.lang.String r2 = org.luckypray.dexkit.C1124.m10545(r2, r7, r3, r4)
                short[] r3 = m7288()
                r4 = 8
                int r5 = org.luckypray.dexkit.C1125.f435
                r5 = r5 ^ (-202(0xffffffffffffff36, float:NaN))
                r6 = 3210(0xc8a, float:4.498E-42)
                java.lang.String r3 = androidx.versionedparcelable.C1106.m3338(r3, r4, r5, r6)
                m7289(r0, r2, r3, r7, r1)
                int r1 = androidx.core.ktx.C1071.m854()
                r0 = 1616(0x650, float:2.264E-42)
            L30:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L36;
                    case 49: goto L39;
                    case 204: goto L3e;
                    case 239: goto L4d;
                    default: goto L35;
                }
            L35:
                goto L30
            L36:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L30
            L39:
                if (r1 > 0) goto L36
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L30
            L3e:
                java.lang.String r0 = "2mIQwxV3rS76uAPH35Lz5c0x0aZ"
                java.lang.String r0 = androidx.activity.C1063.m233(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L4d:
                return
        }
    }

    /* JADX INFO: renamed from: kevin.fun.hook.PPHook$2 */
    class RunnableC06612 implements java.lang.Runnable {

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f373short = null;
        private final kevin.fun.hook.PPHook.VerifyCallback val$callback;
        private final java.lang.String val$code;
        private final android.content.Context val$context;





        static {
                r0 = 320(0x140, float:4.48E-43)
                short[] r0 = new short[r0]
                r0 = {x000a: FILL_ARRAY_DATA , data: [2466, 2467, 2481, 2522, 2511, 2276, 2280, 2275, 2274, 1896, 1908, 1913, 28193, 32494, -25582, -32028, 1270, 1258, 1258, 1262, 1261, 1188, 1201, 1201, 1258, 1273, 1203, 1256, 1275, 1260, 1271, 1272, 1255, 1203, 1279, 1262, 1271, 1200, 1269, 1275, 1256, 1271, 1264, 1198, 1195, 1196, 1191, 1194, 1196, 1196, 1200, 1257, 1265, 1260, 1269, 1275, 1260, 1261, 1200, 1274, 1275, 1256, 1201, 1279, 1277, 1258, 1271, 1256, 1279, 1258, 1275, 2333, 2306, 2334, 2329, 2001, 2045, 2044, 2022, 2039, 2044, 2022, 1983, 1990, 2027, 2018, 2039, 1403, 1386, 1386, 1398, 1395, 1401, 1403, 1390, 1395, 1397, 1396, 1333, 1392, 1385, 1397, 1396, 1313, 1338, 1401, 1394, 1403, 1384, 1385, 1407, 1390, 1319, 1359, 1358, 1372, 1335, 1314, 3087, 3117, 3117, 3115, 3134, 3130, 2812, 2797, 2797, 2801, 2804, 2814, 2812, 2793, 2804, 2802, 2803, 2738, 2807, 2798, 2802, 2803, 624, 603, 594, 577, 576, 598, 583, 742, 714, 715, 715, 704, 710, 721, 716, 714, 715, 1052, 1043, 1040, 1036, 1050, 2369, 2407, 2417, 2406, 2361, 2389, 2419, 2417, 2426, 2400, 2553, 2523, 2510, 2525, 2520, 2520, 2517, 2459, 2433, 2458, 2436, 2452, 2460, 2549, 2522, 2512, 2502, 2523, 2525, 2512, 2461, 2452, 2559, 2513, 2498, 2525, 2522, 2556, 2523, 2523, 2527, 2459, 2437, 2458, 2436, 2021, 2023, 2032, 2029, 2034, 2021, 2032, 2017, 1991, 2027, 2016, 2017, 1956, 2021, 2032, 2032, 2017, 2025, 2036, 2032, 1977, 949, 953, 1003, 1020, 1002, 1001, 1014, 1015, 1002, 1020, 986, 1014, 1021, 1020, 932, 2482, 2494, 2540, 2555, 2541, 2542, 2467, 2442, 2446, 2185, 2190, 2203, 2190, 2191, 2185, 2225, 2237, 2215, 2236, 2214, 1658, 1645, 1645, 1648, 1645, 24579, 21935, 32225, -30502, 20944, 32116, 21443, 22938, -2046, 1862, 1882, 1882, 1886, 1843, 1744, 1746, 1733, 1752, 1735, 1744, 1733, 1748, 1778, 1758, 1749, 1748, 1681, 32157, 27805, 22718, 22916, 1926, 1948, 640, 642, 661, 648, 663, 640, 661, 644, 674, 654, 645, 644, 705, 23543, 24227, 24035, 23769, 731, 705} // fill-array
                kevin.fun.hook.PPHook.RunnableC06612.f373short = r0
                return
        }

        RunnableC06612(java.lang.String r3, android.content.Context r4, kevin.fun.hook.PPHook.VerifyCallback r5) {
                r2 = this;
                r2.val$code = r3
                r2.val$context = r4
                r2.val$callback = r5
                r2.<init>()
                int r1 = androidx.activity.C1062.m182()
                r0 = 1616(0x650, float:2.264E-42)
            Lf:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto L15;
                    case 49: goto L18;
                    case 204: goto L1d;
                    case 239: goto L2c;
                    default: goto L14;
                }
            L14:
                goto Lf
            L15:
                r0 = 1678(0x68e, float:2.351E-42)
                goto Lf
            L18:
                if (r1 < 0) goto L15
                r0 = 1709(0x6ad, float:2.395E-42)
                goto Lf
            L1d:
                java.lang.String r0 = "YtMdcuXJ1MRS97VqTRbnU"
                java.lang.String r0 = androidx.customview.C1075.m1195(r0)
                int r0 = java.lang.Integer.parseInt(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L2c:
                return
        }

        /* JADX INFO: renamed from: ۟ۡۦۧ, reason: not valid java name and contains not printable characters */
        public static boolean m7291(java.lang.Object r2) {
                int r1 = androidx.lifecycle.runtime.C1092.m2295()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                java.lang.String r2 = (java.lang.String) r2
                boolean r0 = kevin.fun.hook.PPHook._$$Nest$smisInvalidUid(r2)
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۟ۦۣۧۢ, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7292() {
                int r1 = androidx.viewpager.C1108.m3542()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                java.lang.String r0 = kevin.fun.hook.PPHook._$$Nest$sfgetsCurrentDyUid()
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۟ۧۥۣۤ, reason: not valid java name and contains not printable characters */
        public static android.content.Context m7293(java.lang.Object r2) {
                int r1 = androidx.lifecycle.process.C1091.m2283()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.PPHook$2 r2 = (kevin.fun.hook.PPHook.RunnableC06612) r2
                android.content.Context r0 = r2.val$context
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۣ۠ۦ۠, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7294(java.lang.Object r2, int r3) {
                int r1 = androidx.core.ktx.C1070.m822()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L1b;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
                java.lang.String r0 = kevin.fun.hook.PPHook._$$Nest$smreadHttpResponse(r2, r3)
            L1a:
                return r0
            L1b:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1e:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L24;
                    case 54: goto L1a;
                    default: goto L23;
                }
            L23:
                goto L1e
            L24:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1e
        }

        /* JADX INFO: renamed from: ۡۢۢۧ, reason: not valid java name and contains not printable characters */
        public static android.os.Handler m7295() {
                int r1 = androidx.drawerlayout.C1077.m1360()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 > 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                android.os.Handler r0 = kevin.fun.hook.PPHook._$$Nest$sfgetmainHandler()
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۡۨۦۦ, reason: not valid java name and contains not printable characters */
        public static short[] m7296() {
                int r1 = androidx.versionedparcelable.C1107.m3467()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L17;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                short[] r0 = kevin.fun.hook.PPHook.RunnableC06612.f373short
            L16:
                return r0
            L17:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1a:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L20;
                    case 54: goto L16;
                    default: goto L1f;
                }
            L1f:
                goto L1a
            L20:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1a
        }

        /* JADX INFO: renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
        public static void m7297(java.lang.Object r2) {
                int r1 = androidx.vectordrawable.animated.C1102.m3110()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L3d;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                java.lang.String r2 = (java.lang.String) r2
                kevin.fun.hook.PPHook._$$Nest$smlog(r2)
            L19:
                int r1 = androidx.lifecycle.process.C1089.m2142()
                r0 = 1740(0x6cc, float:2.438E-42)
            L1f:
                r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
                switch(r0) {
                    case 17: goto L25;
                    case 54: goto L2a;
                    case 471: goto L3c;
                    case 500: goto L2d;
                    default: goto L24;
                }
            L24:
                goto L1f
            L25:
                if (r1 < 0) goto L2a
                r0 = 1833(0x729, float:2.569E-42)
                goto L1f
            L2a:
                r0 = 1802(0x70a, float:2.525E-42)
                goto L1f
            L2d:
                java.lang.String r0 = "qqYECvsXIwBpzLdm80VomIKc"
                java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L3c:
                return
            L3d:
                r0 = 1864(0x748, float:2.612E-42)
            L3f:
                r0 = r0 ^ 1881(0x759, float:2.636E-42)
                switch(r0) {
                    case 17: goto L45;
                    case 47483: goto L19;
                    default: goto L44;
                }
            L44:
                goto L3f
            L45:
                r0 = 48674(0xbe22, float:6.8207E-41)
                goto L3f
        }

        /* JADX INFO: renamed from: ۤۧ۟ۢ, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7298(java.lang.Object r2) {
                int r1 = androidx.documentfile.C1076.m1211()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.PPHook$2 r2 = (kevin.fun.hook.PPHook.RunnableC06612) r2
                java.lang.String r0 = r2.val$code
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۦۣۧ۠, reason: contains not printable characters */
        public static kevin.fun.hook.PPHook.VerifyCallback m7299(java.lang.Object r2) {
                int r1 = androidx.loader.C1094.m2490()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 >= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                kevin.fun.hook.PPHook$2 r2 = (kevin.fun.hook.PPHook.RunnableC06612) r2
                kevin.fun.hook.PPHook$VerifyCallback r0 = r2.val$callback
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        /* JADX INFO: renamed from: ۧ۠ۡۢ, reason: not valid java name and contains not printable characters */
        public static java.lang.String m7300() {
                int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
                r0 = 1616(0x650, float:2.264E-42)
            L6:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lc;
                    case 49: goto Lf;
                    case 204: goto L14;
                    case 239: goto L19;
                    default: goto Lb;
                }
            Lb:
                goto L6
            Lc:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L6
            Lf:
                if (r1 <= 0) goto Lc
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L6
            L14:
                java.lang.String r0 = kevin.fun.hook.PPHook._$$Nest$sfgetsCurrentDyNickname()
            L18:
                return r0
            L19:
                r0 = 0
                r1 = 1740(0x6cc, float:2.438E-42)
            L1c:
                r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
                switch(r1) {
                    case 17: goto L22;
                    case 54: goto L18;
                    default: goto L21;
                }
            L21:
                goto L1c
            L22:
                r1 = 1771(0x6eb, float:2.482E-42)
                goto L1c
        }

        @Override // java.lang.Runnable
        public void run() {
                r18 = this;
                java.lang.String r12 = androidx.emoji2.C1080.m1562()
                short[] r2 = m7296()
                r3 = 0
                int r4 = androidx.annotation.experimental.C1067.f93
                r4 = r4 ^ (-49)
                r5 = 2551(0x9f7, float:3.575E-42)
                java.lang.String r13 = androidx.interpolator.C1083.m1723(r2, r3, r4, r5)
                r10 = 0
                java.lang.String r5 = m7292()     // Catch: java.lang.Throwable -> L5a1
                java.lang.String r7 = m7300()     // Catch: java.lang.Throwable -> L5a1
                boolean r3 = m7291(r5)     // Catch: java.lang.Throwable -> L5a1
                r2 = 1616(0x650, float:2.264E-42)
            L22:
                r2 = r2 ^ 1633(0x661, float:2.288E-42)
                switch(r2) {
                    case 14: goto L28;
                    case 49: goto L2b;
                    case 204: goto L30;
                    case 239: goto L71;
                    default: goto L27;
                }     // Catch: java.lang.Throwable -> L5a1
            L27:
                goto L22
            L28:
                r2 = 1678(0x68e, float:2.351E-42)
                goto L22
            L2b:
                if (r3 == 0) goto L28
                r2 = 1709(0x6ad, float:2.395E-42)
                goto L22
            L30:
                android.os.Handler r2 = m7295()     // Catch: java.lang.Throwable -> L5a1
                kevin.fun.hook.PPHook$2$1 r3 = new kevin.fun.hook.PPHook$2$1     // Catch: java.lang.Throwable -> L5a1
                android.content.Context r4 = m7293(r18)     // Catch: java.lang.Throwable -> L5a1
                kevin.fun.hook.PPHook$VerifyCallback r5 = m7299(r18)     // Catch: java.lang.Throwable -> L5a1
                r0 = r18
                r3.<init>(r0, r4, r5)     // Catch: java.lang.Throwable -> L5a1
                androidx.activity.C1062.m178(r2, r3)     // Catch: java.lang.Throwable -> L5a1
                r2 = 1740(0x6cc, float:2.438E-42)
            L48:
                r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
                switch(r2) {
                    case 17: goto L4e;
                    case 54: goto L4e;
                    case 471: goto L3bf;
                    case 500: goto L51;
                    default: goto L4d;
                }
            L4d:
                goto L48
            L4e:
                r2 = 1802(0x70a, float:2.525E-42)
                goto L48
            L51:
                r2 = 0
                androidx.emoji2.C1080.m1546(r2)     // Catch: java.lang.Throwable -> L61
            L55:
                r2 = 1864(0x748, float:2.612E-42)
            L57:
                r2 = r2 ^ 1881(0x759, float:2.636E-42)
                switch(r2) {
                    case 17: goto L5d;
                    case 47483: goto L3bf;
                    default: goto L5c;
                }
            L5c:
                goto L57
            L5d:
                r2 = 48674(0xbe22, float:6.8207E-41)
                goto L57
            L61:
                r2 = move-exception
                r2 = 48767(0xbe7f, float:6.8337E-41)
            L65:
                r3 = 48784(0xbe90, float:6.8361E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 14: goto L55;
                    case 239: goto L6d;
                    default: goto L6c;
                }
            L6c:
                goto L65
            L6d:
                r2 = 48798(0xbe9e, float:6.838E-41)
                goto L65
            L71:
                org.json.JSONObject r14 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5a1
                r14.<init>()     // Catch: java.lang.Throwable -> L5a1
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L5a1
                r3 = 5
                int r4 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L5a1
                r4 = r4 ^ (-233(0xffffffffffffff17, float:NaN))
                r6 = 2183(0x887, float:3.059E-42)
                java.lang.String r2 = org.luckypray.dexkit.C1125.m10615(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L5a1
                java.lang.String r3 = m7298(r18)     // Catch: java.lang.Throwable -> L5a1
                androidx.drawerlayout.C1077.m1338(r14, r2, r3)     // Catch: java.lang.Throwable -> L5a1
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L5a1
                r3 = 9
                int r4 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L5a1
                r4 = r4 ^ 897(0x381, float:1.257E-42)
                r6 = 1821(0x71d, float:2.552E-42)
                java.lang.String r2 = androidx.loader.C1097.m2734(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L5a1
                androidx.drawerlayout.C1077.m1338(r14, r2, r5)     // Catch: java.lang.Throwable -> L5a1
                r2 = 0
                r3 = 1
                r11 = r3
            La2:
                r3 = 48891(0xbefb, float:6.8511E-41)
            La5:
                r4 = 48908(0xbf0c, float:6.8535E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 22: goto Lad;
                    case 53: goto L139;
                    case 503: goto Lb1;
                    case 32495: goto Lb8;
                    default: goto Lac;
                }
            Lac:
                goto La5
            Lad:
                r3 = 48953(0xbf39, float:6.8598E-41)
                goto La5
            Lb1:
                r3 = 2
                if (r11 <= r3) goto Lad
                r3 = 49635(0xc1e3, float:6.9553E-41)
                goto La5
            Lb8:
                r3 = 49666(0xc202, float:6.9597E-41)
            Lbb:
                r4 = 49683(0xc213, float:6.9621E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto Lc3;
                    case 50: goto Lc9;
                    case 76: goto Lcd;
                    case 83: goto L105;
                    default: goto Lc2;
                }
            Lc2:
                goto Lbb
            Lc3:
                if (r2 == 0) goto Lc9
                r3 = 49759(0xc25f, float:6.9727E-41)
                goto Lbb
            Lc9:
                r3 = 49728(0xc240, float:6.9684E-41)
                goto Lbb
            Lcd:
                java.lang.String r2 = androidx.lifecycle.process.C1091.m2254(r2)     // Catch: java.lang.Throwable -> L511
                r3 = 49790(0xc27e, float:6.977E-41)
            Ld4:
                r4 = 49807(0xc28f, float:6.9794E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 18: goto Ldc;
                    case 241: goto L101;
                    default: goto Ldb;
                }     // Catch: java.lang.Throwable -> L511
            Ldb:
                goto Ld4
            Ldc:
                android.os.Handler r3 = m7295()     // Catch: java.lang.Throwable -> L511
                kevin.fun.hook.PPHook$2$3 r4 = new kevin.fun.hook.PPHook$2$3     // Catch: java.lang.Throwable -> L511
                android.content.Context r5 = m7293(r18)     // Catch: java.lang.Throwable -> L511
                kevin.fun.hook.PPHook$VerifyCallback r6 = m7299(r18)     // Catch: java.lang.Throwable -> L511
                r0 = r18
                r4.<init>(r0, r5, r2, r6)     // Catch: java.lang.Throwable -> L511
                androidx.activity.C1062.m178(r3, r4)     // Catch: java.lang.Throwable -> L511
                r2 = 49914(0xc2fa, float:6.9944E-41)
            Lf5:
                r3 = 49931(0xc30b, float:6.9968E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 497: goto Lfd;
                    case 1711: goto Lfd;
                    case 1736: goto L3bf;
                    case 1769: goto L116;
                    default: goto Lfc;
                }     // Catch: java.lang.Throwable -> L511
            Lfc:
                goto Lf5
            Lfd:
                r2 = 50627(0xc5c3, float:7.0944E-41)
                goto Lf5
            L101:
                r3 = 49821(0xc29d, float:6.9814E-41)
                goto Ld4
            L105:
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L511
                r3 = 12
                int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L511
                r4 = r4 ^ (-930(0xfffffffffffffc5e, float:NaN))
                r5 = 2315(0x90b, float:3.244E-42)
                java.lang.String r2 = androidx.core.C1073.m1028(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L511
                goto Ldc
            L116:
                r2 = 0
                androidx.emoji2.C1080.m1546(r2)     // Catch: java.lang.Throwable -> L129
            L11a:
                r2 = 50689(0xc601, float:7.103E-41)
            L11d:
                r3 = 50706(0xc612, float:7.1054E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 19: goto L125;
                    case 50: goto L3bf;
                    default: goto L124;
                }
            L124:
                goto L11d
            L125:
                r2 = 50720(0xc620, float:7.1074E-41)
                goto L11d
            L129:
                r2 = move-exception
                r2 = 50813(0xc67d, float:7.1204E-41)
            L12d:
                r3 = 50830(0xc68e, float:7.1228E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 18: goto L11a;
                    case 243: goto L135;
                    default: goto L134;
                }
            L134:
                goto L12d
            L135:
                r2 = 50844(0xc69c, float:7.1248E-41)
                goto L12d
            L139:
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L511 java.lang.Exception -> L522
                short[] r3 = m7296()     // Catch: java.lang.Throwable -> L511 java.lang.Exception -> L522
                r4 = 16
                int r6 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L511 java.lang.Exception -> L522
                r6 = r6 ^ 392(0x188, float:5.5E-43)
                r8 = 1182(0x49e, float:1.656E-42)
                java.lang.String r3 = org.luckypray.dexkit.C1123.m10510(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L511 java.lang.Exception -> L522
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L511 java.lang.Exception -> L522
                java.net.URLConnection r2 = androidx.loader.C1094.m2492(r2)     // Catch: java.lang.Throwable -> L511 java.lang.Exception -> L522
                r0 = r2
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L511 java.lang.Exception -> L522
                r10 = r0
                int r2 = androidx.emoji2.viewsintegration.C1078.f104
                r2 = r2 ^ 14591(0x38ff, float:2.0446E-41)
                androidx.lifecycle.process.C1087.m2000(r10, r2)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                androidx.loader.C1094.m2450(r10, r2)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r2 = 0
                androidx.startup.C1100.m2937(r10, r2)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r2 = 1
                androidx.appcompat.resources.C1068.m625(r10, r2)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r2 = 1
                androidx.activity.C1066.m501(r10, r2)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r3 = 71
                int r4 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = r4 ^ 649(0x289, float:9.1E-43)
                r6 = 2381(0x94d, float:3.336E-42)
                java.lang.String r2 = androidx.vectordrawable.C1104.m3232(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                androidx.versionedparcelable.C1107.m3434(r10, r2)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r3 = 75
                int r4 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = r4 ^ (-532(0xfffffffffffffdec, float:NaN))
                r6 = 1938(0x792, float:2.716E-42)
                java.lang.String r2 = androidx.drawerlayout.C1077.m1343(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r3 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = 87
                int r6 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r6 = r6 ^ (-107(0xffffffffffffff95, float:NaN))
                r8 = 1306(0x51a, float:1.83E-42)
                java.lang.String r3 = kevin.fun.hook.audio.C1116.m8020(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                androidx.activity.C1064.m355(r10, r2, r3)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r3 = 118(0x76, float:1.65E-43)
                int r4 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = r4 ^ 352(0x160, float:4.93E-43)
                r6 = 3150(0xc4e, float:4.414E-42)
                java.lang.String r2 = kevin.fun.hook.webdav.C1118.m8509(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r3 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = 124(0x7c, float:1.74E-43)
                int r6 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r6 = r6 ^ 818(0x332, float:1.146E-42)
                r8 = 2717(0xa9d, float:3.807E-42)
                java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                androidx.activity.C1064.m355(r10, r2, r3)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r3 = 140(0x8c, float:1.96E-43)
                int r4 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = r4 ^ 650(0x28a, float:9.11E-43)
                r6 = 563(0x233, float:7.89E-43)
                java.lang.String r2 = androidx.lifecycle.process.C1091.m2229(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                androidx.activity.C1064.m355(r10, r2, r13)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r3 = 147(0x93, float:2.06E-43)
                int r4 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = r4 ^ (-596(0xfffffffffffffdac, float:NaN))
                r6 = 677(0x2a5, float:9.49E-43)
                java.lang.String r2 = androidx.interpolator.C1083.m1723(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r3 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = 157(0x9d, float:2.2E-43)
                int r6 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r6 = r6 ^ (-450(0xfffffffffffffe3e, float:NaN))
                r8 = 1151(0x47f, float:1.613E-42)
                java.lang.String r3 = kevin.fun.hook.audio.C1117.m8169(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                androidx.activity.C1064.m355(r10, r2, r3)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r2 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r3 = 162(0xa2, float:2.27E-43)
                int r4 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = r4 ^ (-973(0xfffffffffffffc33, float:NaN))
                r6 = 2324(0x914, float:3.257E-42)
                java.lang.String r2 = androidx.vectordrawable.C1104.m3232(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                short[] r3 = m7296()     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r4 = 172(0xac, float:2.41E-43)
                int r6 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r6 = r6 ^ 48
                r8 = 2484(0x9b4, float:3.481E-42)
                java.lang.String r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                androidx.activity.C1064.m355(r10, r2, r3)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                java.lang.String r2 = androidx.viewpager.C1108.m3553(r14)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                byte[] r3 = androidx.emoji2.C1080.m1526(r2, r13)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                int r2 = r3.length     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                dev.rikka.ndk.thirdparty.libcxx.C1110.m3677(r10, r2)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                r2 = 0
                java.io.OutputStream r2 = androidx.lifecycle.process.C1087.m1958(r10)     // Catch: java.lang.Throwable -> L447
                kevin.fun.hook.audio.C1115.m8009(r2, r3)     // Catch: java.lang.Throwable -> L437
                androidx.drawerlayout.C1077.m1331(r2)     // Catch: java.lang.Throwable -> L437
                r3 = 51588(0xc984, float:7.229E-41)
            L238:
                r4 = 51605(0xc995, float:7.2314E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto L240;
                    case 54: goto L246;
                    case 87: goto L258;
                    case 116: goto L24a;
                    default: goto L23f;
                }
            L23f:
                goto L238
            L240:
                if (r2 == 0) goto L246
                r3 = 51681(0xc9e1, float:7.242E-41)
                goto L238
            L246:
                r3 = 51650(0xc9c2, float:7.2377E-41)
                goto L238
            L24a:
                androidx.lifecycle.process.C1091.m2267(r2)     // Catch: java.lang.Throwable -> L2cd
            L24d:
                r2 = 51712(0xca00, float:7.2464E-41)
            L250:
                r3 = 51729(0xca11, float:7.2488E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 14: goto L258;
                    case 15: goto L257;
                    case 16: goto L257;
                    case 17: goto L2c9;
                    default: goto L257;
                }
            L257:
                goto L250
            L258:
                int r3 = androidx.loader.C1094.m57(r10)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                java.lang.String r4 = m7294(r10, r3)     // Catch: java.lang.Throwable -> L4a0 java.lang.Exception -> L4b0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L427 java.lang.Throwable -> L4a0
                r2.<init>()     // Catch: java.lang.Exception -> L427 java.lang.Throwable -> L4a0
                short[] r6 = m7296()     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r8 = 207(0xcf, float:2.9E-43)
                int r9 = androidx.core.C1073.f99     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r9 = r9 ^ 426(0x1aa, float:5.97E-43)
                r15 = 1924(0x784, float:2.696E-42)
                java.lang.String r6 = androidx.activity.C1064.m310(r6, r8, r9, r15)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r11)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                short[] r6 = m7296()     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r8 = 228(0xe4, float:3.2E-43)
                int r9 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r9 = r9 ^ 770(0x302, float:1.079E-42)
                r15 = 921(0x399, float:1.29E-42)
                java.lang.String r6 = androidx.loader.C1095.m2574(r6, r8, r9, r15)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r3)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                short[] r6 = m7296()     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r8 = 243(0xf3, float:3.4E-43)
                int r9 = androidx.interpolator.C1083.f109     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r9 = r9 ^ (-443(0xfffffffffffffe45, float:NaN))
                r15 = 2462(0x99e, float:3.45E-42)
                java.lang.String r6 = androidx.versionedparcelable.C1107.m3485(r6, r8, r9, r15)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                m7297(r2)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                boolean r6 = androidx.documentfile.C1076.m1246(r4)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r2 = 52611(0xcd83, float:7.3724E-41)
            L2bb:
                r8 = 52628(0xcd94, float:7.3748E-41)
                r2 = r2 ^ r8
                switch(r2) {
                    case 23: goto L2c3;
                    case 54: goto L2dd;
                    case 85: goto L3e0;
                    case 116: goto L2e1;
                    default: goto L2c2;
                }     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
            L2c2:
                goto L2bb
            L2c3:
                if (r6 != 0) goto L2dd
                r2 = 52704(0xcde0, float:7.3854E-41)
                goto L2bb
            L2c9:
                r2 = 51743(0xca1f, float:7.2507E-41)
                goto L250
            L2cd:
                r2 = move-exception
                r2 = 51836(0xca7c, float:7.2638E-41)
            L2d1:
                r3 = 51853(0xca8d, float:7.2662E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 241: goto L2d9;
                    case 1963: goto L24d;
                    default: goto L2d8;
                }     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
            L2d8:
                goto L2d1
            L2d9:
                r2 = 52518(0xcd26, float:7.3593E-41)
                goto L2d1
            L2dd:
                r2 = 52673(0xcdc1, float:7.381E-41)
                goto L2bb
            L2e1:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r2.<init>(r4)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                kevin.fun.hook.PPHook$ActivateResult r4 = new kevin.fun.hook.PPHook$ActivateResult     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r3 = 0
                r4.<init>(r3)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                short[] r3 = m7296()     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r6 = 250(0xfa, float:3.5E-43)
                int r8 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r8 = r8 ^ (-430(0xfffffffffffffe52, float:NaN))
                r9 = 2533(0x9e5, float:3.55E-42)
                java.lang.String r3 = androidx.activity.C1065.m410(r3, r6, r8, r9)     // Catch: java.lang.Exception -> L417 java.lang.Throwable -> L4a0
                r6 = 0
                boolean r3 = org.luckypray.dexkit.C1123.m10529(r2, r3, r6)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r4.f59ok = r3     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                short[] r3 = m7296()     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r6 = 252(0xfc, float:3.53E-43)
                int r8 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r8 = r8 ^ (-22)
                r9 = 2298(0x8fa, float:3.22E-42)
                java.lang.String r3 = androidx.viewpager.C1108.m3518(r3, r6, r8, r9)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                java.lang.String r3 = androidx.loader.C1095.m2550(r2, r3, r12)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r4.status = r3     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                short[] r3 = m7296()     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r6 = 258(0x102, float:3.62E-43)
                int r8 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r8 = r8 ^ (-619(0xfffffffffffffd95, float:NaN))
                r9 = 2258(0x8d2, float:3.164E-42)
                java.lang.String r3 = kevin.fun.hook.audio.C1117.m8169(r3, r6, r8, r9)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r6 = 0
                int r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3675(r2, r3, r6)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r4.count = r3     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                short[] r3 = m7296()     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r6 = 263(0x107, float:3.69E-43)
                int r8 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r8 = r8 ^ (-929(0xfffffffffffffc5f, float:NaN))
                r9 = 1567(0x61f, float:2.196E-42)
                java.lang.String r3 = org.luckypray.dexkit.C1124.m10545(r3, r6, r8, r9)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                java.lang.String r2 = androidx.loader.C1095.m2550(r2, r3, r12)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                r4.error = r2     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                android.os.Handler r15 = m7295()     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                kevin.fun.hook.PPHook$2$2 r2 = new kevin.fun.hook.PPHook$2$2     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                java.lang.String r6 = m7298(r18)     // Catch: java.lang.Exception -> L3d0 java.lang.Throwable -> L4a0
                android.content.Context r8 = m7293(r18)     // Catch: java.lang.Exception -> L3c0 java.lang.Throwable -> L490
                kevin.fun.hook.PPHook$VerifyCallback r9 = m7299(r18)     // Catch: java.lang.Exception -> L3c0 java.lang.Throwable -> L490
                r3 = r18
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                androidx.activity.C1062.m178(r15, r2)     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                r2 = 52735(0xcdff, float:7.3897E-41)
            L363:
                r3 = 52752(0xce10, float:7.3921E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 14: goto L36b;
                    case 45: goto L397;
                    case 1007: goto L36f;
                    case 7927: goto L375;
                    default: goto L36a;
                }
            L36a:
                goto L363
            L36b:
                r2 = 52797(0xce3d, float:7.3984E-41)
                goto L363
            L36f:
                if (r10 == 0) goto L36b
                r2 = 53479(0xd0e7, float:7.494E-41)
                goto L363
            L375:
                androidx.emoji2.C1080.m1546(r10)     // Catch: java.lang.Throwable -> L387
            L378:
                r2 = 53510(0xd106, float:7.4983E-41)
            L37b:
                r3 = 53527(0xd117, float:7.5007E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 17: goto L383;
                    case 50: goto L397;
                    default: goto L382;
                }
            L382:
                goto L37b
            L383:
                r2 = 53541(0xd125, float:7.5027E-41)
                goto L37b
            L387:
                r2 = move-exception
                r2 = 53634(0xd182, float:7.5157E-41)
            L38b:
                r3 = 53651(0xd193, float:7.5181E-41)
                r2 = r2 ^ r3
                switch(r2) {
                    case 17: goto L393;
                    case 50: goto L378;
                    default: goto L392;
                }
            L392:
                goto L38b
            L393:
                r2 = 53665(0xd1a1, float:7.52E-41)
                goto L38b
            L397:
                int r3 = androidx.interpolator.C1082.m1718()
                r2 = 53758(0xd1fe, float:7.5331E-41)
            L39e:
                r4 = 53775(0xd20f, float:7.5355E-41)
                r2 = r2 ^ r4
                switch(r2) {
                    case 1009: goto L3a6;
                    case 1703: goto L3ac;
                    case 1736: goto L3bf;
                    case 1769: goto L3b0;
                    default: goto L3a5;
                }
            L3a5:
                goto L39e
            L3a6:
                if (r3 < 0) goto L3ac
                r2 = 54502(0xd4e6, float:7.6374E-41)
                goto L39e
            L3ac:
                r2 = 54471(0xd4c7, float:7.633E-41)
                goto L39e
            L3b0:
                java.lang.String r2 = "8gVOBjZvEVV3MRHgT0IUS04Lkw"
                java.lang.String r2 = androidx.activity.C1062.m169(r2)
                java.lang.Double r2 = java.lang.Double.decode(r2)
                java.io.PrintStream r3 = java.lang.System.out
                r3.println(r2)
            L3bf:
                return
            L3c0:
                r2 = move-exception
                r3 = 54533(0xd505, float:7.6417E-41)
            L3c4:
                r4 = 54550(0xd516, float:7.6441E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 19: goto L3cc;
                    case 50: goto L4bc;
                    default: goto L3cb;
                }
            L3cb:
                goto L3c4
            L3cc:
                r3 = 54564(0xd524, float:7.646E-41)
                goto L3c4
            L3d0:
                r2 = move-exception
                r3 = 54657(0xd581, float:7.6591E-41)
            L3d4:
                r4 = 54674(0xd592, float:7.6615E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 19: goto L3dc;
                    case 50: goto L4bc;
                    default: goto L3db;
                }
            L3db:
                goto L3d4
            L3dc:
                r3 = 54688(0xd5a0, float:7.6634E-41)
                goto L3d4
            L3e0:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                r4.<init>()     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                short[] r6 = m7296()     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                r8 = 268(0x10c, float:3.76E-43)
                int r9 = androidx.customview.C1074.f100     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                r9 = r9 ^ 253(0xfd, float:3.55E-43)
                r15 = 1806(0x70e, float:2.531E-42)
                java.lang.String r6 = androidx.interpolator.C1081.m1616(r6, r8, r9, r15)     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r6)     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                java.lang.StringBuilder r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r4, r3)     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                r2.<init>(r3)     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
                throw r2     // Catch: java.lang.Exception -> L407 java.lang.Throwable -> L490
            L407:
                r2 = move-exception
                r3 = 55432(0xd888, float:7.7677E-41)
            L40b:
                r4 = 55449(0xd899, float:7.77E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto L413;
                    case 62: goto L4bc;
                    default: goto L412;
                }
            L412:
                goto L40b
            L413:
                r3 = 55463(0xd8a7, float:7.772E-41)
                goto L40b
            L417:
                r2 = move-exception
                r3 = 55556(0xd904, float:7.785E-41)
            L41b:
                r4 = 55573(0xd915, float:7.7874E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto L423;
                    case 54: goto L428;
                    default: goto L422;
                }
            L422:
                goto L41b
            L423:
                r3 = 55587(0xd923, float:7.7894E-41)
                goto L41b
            L427:
                r2 = move-exception
            L428:
                r3 = 55680(0xd980, float:7.8024E-41)
            L42b:
                r4 = 55697(0xd991, float:7.8048E-41)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto L433;
                    case 1467: goto L4bc;
                    default: goto L432;
                }
            L432:
                goto L42b
            L433:
                r3 = 56362(0xdc2a, float:7.898E-41)
                goto L42b
            L437:
                r3 = move-exception
                r4 = 56455(0xdc87, float:7.911E-41)
            L43b:
                r6 = 56472(0xdc98, float:7.9134E-41)
                r4 = r4 ^ r6
                switch(r4) {
                    case 31: goto L443;
                    case 62: goto L448;
                    default: goto L442;
                }
            L442:
                goto L43b
            L443:
                r4 = 56486(0xdca6, float:7.9154E-41)
                goto L43b
            L447:
                r3 = move-exception
            L448:
                r4 = 56579(0xdd03, float:7.9284E-41)
            L44b:
                r6 = 56596(0xdd14, float:7.9308E-41)
                r4 = r4 ^ r6
                switch(r4) {
                    case 23: goto L453;
                    case 54: goto L459;
                    case 85: goto L46b;
                    case 1564036: goto L45d;
                    default: goto L452;
                }
            L452:
                goto L44b
            L453:
                if (r2 == 0) goto L459
                r4 = 1507472(0x170090, float:2.112418E-39)
                goto L44b
            L459:
                r4 = 56641(0xdd41, float:7.9371E-41)
                goto L44b
            L45d:
                androidx.lifecycle.process.C1091.m2267(r2)     // Catch: java.lang.Throwable -> L480
            L460:
                r2 = 1507503(0x1700af, float:2.112462E-39)
            L463:
                r4 = 1507520(0x1700c0, float:2.112485E-39)
                r2 = r2 ^ r4
                switch(r2) {
                    case 14: goto L46b;
                    case 111: goto L47c;
                    default: goto L46a;
                }
            L46a:
                goto L463
            L46b:
                throw r3     // Catch: java.lang.Exception -> L46c java.lang.Throwable -> L490
            L46c:
                r2 = move-exception
                r3 = 1508526(0x1704ae, float:2.113895E-39)
            L470:
                r4 = 1508543(0x1704bf, float:2.113919E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto L478;
                    case 114: goto L4bc;
                    default: goto L477;
                }
            L477:
                goto L470
            L478:
                r3 = 1508557(0x1704cd, float:2.113939E-39)
                goto L470
            L47c:
                r2 = 1507534(0x1700ce, float:2.112505E-39)
                goto L463
            L480:
                r2 = move-exception
                r2 = 1507627(0x17012b, float:2.112635E-39)
            L484:
                r4 = 1507644(0x17013c, float:2.112659E-39)
                r2 = r2 ^ r4
                switch(r2) {
                    case 23: goto L48c;
                    case 118: goto L460;
                    default: goto L48b;
                }
            L48b:
                goto L484
            L48c:
                r2 = 1507658(0x17014a, float:2.112679E-39)
                goto L484
            L490:
                r2 = move-exception
                r3 = 1507751(0x1701a7, float:2.112809E-39)
            L494:
                r4 = 1507768(0x1701b8, float:2.112833E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 31: goto L49c;
                    case 1513: goto L5a2;
                    default: goto L49b;
                }
            L49b:
                goto L494
            L49c:
                r3 = 1508433(0x170451, float:2.113765E-39)
                goto L494
            L4a0:
                r2 = move-exception
                r3 = 1508650(0x17052a, float:2.114069E-39)
            L4a4:
                r4 = 1508667(0x17053b, float:2.114093E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto L4ac;
                    case 114: goto L5a2;
                    default: goto L4ab;
                }
            L4ab:
                goto L4a4
            L4ac:
                r3 = 1508681(0x170549, float:2.114112E-39)
                goto L4a4
            L4b0:
                r2 = move-exception
                r3 = 1509425(0x170831, float:2.115155E-39)
            L4b4:
                r4 = 1509442(0x170842, float:2.115179E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 18: goto L4bc;
                    case 115: goto L50d;
                    default: goto L4bb;
                }
            L4bb:
                goto L4b4
            L4bc:
                java.lang.String r3 = androidx.lifecycle.process.C1091.m2254(r2)     // Catch: java.lang.Throwable -> L5a1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a1
                r4.<init>()     // Catch: java.lang.Throwable -> L5a1
                short[] r6 = m7296()     // Catch: java.lang.Throwable -> L5a1
                r8 = 282(0x11a, float:3.95E-43)
                int r9 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L5a1
                r9 = r9 ^ 29
                r15 = 1713(0x6b1, float:2.4E-42)
                java.lang.String r6 = kevin.fun.hook.webdav.C1119.m8576(r6, r8, r9, r15)     // Catch: java.lang.Throwable -> L5a1
                java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r6)     // Catch: java.lang.Throwable -> L5a1
                java.lang.StringBuilder r4 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r4, r11)     // Catch: java.lang.Throwable -> L5a1
                short[] r6 = m7296()     // Catch: java.lang.Throwable -> L5a1
                r8 = 296(0x128, float:4.15E-43)
                int r9 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L5a1
                r9 = r9 ^ 610(0x262, float:8.55E-43)
                r15 = 1980(0x7bc, float:2.775E-42)
                java.lang.String r6 = androidx.core.C1073.m1028(r6, r8, r9, r15)     // Catch: java.lang.Throwable -> L5a1
                java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r6)     // Catch: java.lang.Throwable -> L5a1
                java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)     // Catch: java.lang.Throwable -> L5a1
                java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L5a1
                m7297(r3)     // Catch: java.lang.Throwable -> L5a1
                r3 = 1509673(0x170929, float:2.115502E-39)
            L4ff:
                r4 = 1509690(0x17093a, float:2.115526E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 19: goto L507;
                    case 712: goto L537;
                    case 745: goto L525;
                    case 1323: goto L529;
                    default: goto L506;
                }
            L506:
                goto L4ff
            L507:
                if (r10 == 0) goto L525
                r3 = 1510417(0x170c11, float:2.116545E-39)
                goto L4ff
            L50d:
                r3 = 1509456(0x170850, float:2.115198E-39)
                goto L4b4
            L511:
                r2 = move-exception
                r10 = 0
                r3 = 1509549(0x1708ad, float:2.115329E-39)
            L516:
                r4 = 1509566(0x1708be, float:2.115353E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 19: goto L51e;
                    case 114: goto L5a2;
                    default: goto L51d;
                }
            L51d:
                goto L516
            L51e:
                r3 = 1509580(0x1708cc, float:2.115372E-39)
                goto L516
            L522:
                r2 = move-exception
                r10 = 0
                goto L4bc
            L525:
                r3 = 1510386(0x170bf2, float:2.116502E-39)
                goto L4ff
            L529:
                androidx.emoji2.C1080.m1546(r10)     // Catch: java.lang.Throwable -> L54a
            L52c:
                r3 = 1510448(0x170c30, float:2.116588E-39)
            L52f:
                r4 = 1510465(0x170c41, float:2.116612E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 14: goto L537;
                    case 113: goto L546;
                    default: goto L536;
                }
            L536:
                goto L52f
            L537:
                r3 = 1511347(0x170fb3, float:2.117848E-39)
            L53a:
                r4 = 1511364(0x170fc4, float:2.117872E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 22: goto L542;
                    case 53: goto L576;
                    case 119: goto L55a;
                    case 8148: goto L561;
                    default: goto L541;
                }
            L541:
                goto L53a
            L542:
                r3 = 1511409(0x170ff1, float:2.117935E-39)
                goto L53a
            L546:
                r3 = 1510479(0x170c4f, float:2.116632E-39)
                goto L52f
            L54a:
                r3 = move-exception
                r3 = 1510572(0x170cac, float:2.116762E-39)
            L54e:
                r4 = 1510589(0x170cbd, float:2.116786E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 17: goto L556;
                    case 118: goto L52c;
                    default: goto L555;
                }
            L555:
                goto L54e
            L556:
                r3 = 1510603(0x170ccb, float:2.116806E-39)
                goto L54e
            L55a:
                r3 = 2
                if (r11 >= r3) goto L542
                r3 = 1511440(0x171010, float:2.117979E-39)
                goto L53a
            L561:
                int r3 = androidx.core.ktx.C1071.f97
                long r8 = (long) r3
                r16 = 162(0xa2, double:8.0E-322)
                long r8 = r8 ^ r16
                androidx.vectordrawable.C1105.m3252(r8)     // Catch: java.lang.Throwable -> L58d
            L56b:
                r3 = 1511471(0x17102f, float:2.118022E-39)
            L56e:
                r4 = 1511488(0x171040, float:2.118046E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 14: goto L576;
                    case 111: goto L589;
                    default: goto L575;
                }
            L575:
                goto L56e
            L576:
                int r3 = kevin.fun.hook.audio.C1116.f405
                r3 = r3 ^ 83
                int r3 = r3 + r11
                r4 = 1512370(0x1713b2, float:2.119282E-39)
            L57e:
                r6 = 1512387(0x1713c3, float:2.119306E-39)
                r4 = r4 ^ r6
                switch(r4) {
                    case 18: goto L586;
                    case 113: goto L59d;
                    default: goto L585;
                }
            L585:
                goto L57e
            L586:
                r11 = r3
                goto La2
            L589:
                r3 = 1511502(0x17104e, float:2.118065E-39)
                goto L56e
            L58d:
                r3 = move-exception
                r3 = 1511595(0x1710ab, float:2.118196E-39)
            L591:
                r4 = 1511612(0x1710bc, float:2.11822E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 23: goto L599;
                    case 1001: goto L56b;
                    default: goto L598;
                }
            L598:
                goto L591
            L599:
                r3 = 1512277(0x171355, float:2.119151E-39)
                goto L591
            L59d:
                r4 = 1512401(0x1713d1, float:2.119325E-39)
                goto L57e
            L5a1:
                r2 = move-exception
            L5a2:
                java.lang.String r3 = androidx.lifecycle.process.C1091.m2254(r2)     // Catch: java.lang.Throwable -> L617
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L617
                r4.<init>()     // Catch: java.lang.Throwable -> L617
                short[] r5 = m7296()     // Catch: java.lang.Throwable -> L617
                r6 = 301(0x12d, float:4.22E-43)
                int r7 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L617
                r7 = r7 ^ 287(0x11f, float:4.02E-43)
                r8 = 737(0x2e1, float:1.033E-42)
                java.lang.String r5 = androidx.lifecycle.process.C1089.m2127(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L617
                java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)     // Catch: java.lang.Throwable -> L617
                java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)     // Catch: java.lang.Throwable -> L617
                java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L617
                m7297(r3)     // Catch: java.lang.Throwable -> L617
                android.os.Handler r3 = m7295()     // Catch: java.lang.Throwable -> L617
                kevin.fun.hook.PPHook$2$4 r4 = new kevin.fun.hook.PPHook$2$4     // Catch: java.lang.Throwable -> L617
                android.content.Context r5 = m7293(r18)     // Catch: java.lang.Throwable -> L617
                kevin.fun.hook.PPHook$VerifyCallback r6 = m7299(r18)     // Catch: java.lang.Throwable -> L617
                r0 = r18
                r4.<init>(r0, r5, r2, r6)     // Catch: java.lang.Throwable -> L617
                androidx.activity.C1062.m178(r3, r4)     // Catch: java.lang.Throwable -> L617
                r2 = 1512494(0x17142e, float:2.119456E-39)
            L5e3:
                r3 = 1512511(0x17143f, float:2.11948E-39)
                r2 = r2 ^ r3
                switch(r2) {
                    case 17: goto L5eb;
                    case 83: goto L3bf;
                    case 114: goto L5f1;
                    case 809: goto L5f5;
                    default: goto L5ea;
                }
            L5ea:
                goto L5e3
            L5eb:
                if (r10 == 0) goto L5f1
                r2 = 1513238(0x171716, float:2.120498E-39)
                goto L5e3
            L5f1:
                r2 = 1512556(0x17146c, float:2.119542E-39)
                goto L5e3
            L5f5:
                androidx.emoji2.C1080.m1546(r10)     // Catch: java.lang.Throwable -> L607
            L5f8:
                r2 = 1513269(0x171735, float:2.120542E-39)
            L5fb:
                r3 = 1513286(0x171746, float:2.120565E-39)
                r2 = r2 ^ r3
                switch(r2) {
                    case 18: goto L3bf;
                    case 115: goto L603;
                    default: goto L602;
                }
            L602:
                goto L5fb
            L603:
                r2 = 1513300(0x171754, float:2.120585E-39)
                goto L5fb
            L607:
                r2 = move-exception
                r2 = 1513393(0x1717b1, float:2.120715E-39)
            L60b:
                r3 = 1513410(0x1717c2, float:2.120739E-39)
                r2 = r2 ^ r3
                switch(r2) {
                    case 18: goto L5f8;
                    case 115: goto L613;
                    default: goto L612;
                }
            L612:
                goto L60b
            L613:
                r2 = 1513424(0x1717d0, float:2.120759E-39)
                goto L60b
            L617:
                r2 = move-exception
                r3 = 1513517(0x17182d, float:2.120889E-39)
            L61b:
                r4 = 1513534(0x17183e, float:2.120913E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 19: goto L623;
                    case 712: goto L63b;
                    case 745: goto L629;
                    case 811: goto L62d;
                    default: goto L622;
                }
            L622:
                goto L61b
            L623:
                if (r10 == 0) goto L629
                r3 = 1514261(0x171b15, float:2.121932E-39)
                goto L61b
            L629:
                r3 = 1514230(0x171af6, float:2.121888E-39)
                goto L61b
            L62d:
                androidx.emoji2.C1080.m1546(r10)     // Catch: java.lang.Throwable -> L640
            L630:
                r3 = 1514292(0x171b34, float:2.121975E-39)
            L633:
                r4 = 1514309(0x171b45, float:2.121999E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 22: goto L63b;
                    case 113: goto L63c;
                    default: goto L63a;
                }
            L63a:
                goto L633
            L63b:
                throw r2
            L63c:
                r3 = 1514323(0x171b53, float:2.122018E-39)
                goto L633
            L640:
                r3 = move-exception
                r3 = 1514416(0x171bb0, float:2.122149E-39)
            L644:
                r4 = 1514433(0x171bc1, float:2.122173E-39)
                r3 = r3 ^ r4
                switch(r3) {
                    case 14: goto L630;
                    case 113: goto L64c;
                    default: goto L64b;
                }
            L64b:
                goto L644
            L64c:
                r3 = 1514447(0x171bcf, float:2.122192E-39)
                goto L644
        }
    }

    private static class ActivateResult {
        int count;
        java.lang.String error;

        /* JADX INFO: renamed from: ok */
        boolean f59ok;
        java.lang.String status;

        static {
                return
        }

        private ActivateResult() {
                r2 = this;
                r2.<init>()
                int r1 = androidx.activity.C1065.m427()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 > 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "BUbb"
                java.lang.String r0 = androidx.loader.C1094.m2472(r0)
                int r0 = java.lang.Integer.parseInt(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }

        /* synthetic */ ActivateResult(kevin.fun.hook.PPHookIA r3) {
                r2 = this;
                r2.<init>()
                int r1 = androidx.documentfile.C1076.m1211()
                r0 = 1616(0x650, float:2.264E-42)
            L9:
                r0 = r0 ^ 1633(0x661, float:2.288E-42)
                switch(r0) {
                    case 14: goto Lf;
                    case 49: goto L12;
                    case 204: goto L17;
                    case 239: goto L26;
                    default: goto Le;
                }
            Le:
                goto L9
            Lf:
                r0 = 1678(0x68e, float:2.351E-42)
                goto L9
            L12:
                if (r1 > 0) goto Lf
                r0 = 1709(0x6ad, float:2.395E-42)
                goto L9
            L17:
                java.lang.String r0 = "OKL31PsxcikRhe"
                java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    public interface VerifyCallback {
        static {
                return
        }

        void onFailure(java.lang.String r1);

        void onSuccess();
    }

    static {
            r4 = 0
            r0 = 1507(0x5e3, float:2.112E-42)
            short[] r0 = new short[r0]
            r0 = {x00b8: FILL_ARRAY_DATA , data: [812, 816, 816, 820, 823, 894, 875, 875, 816, 803, 873, 818, 801, 822, 813, 802, 829, 873, 805, 820, 813, 874, 815, 801, 818, 813, 810, 884, 881, 886, 893, 880, 886, 886, 874, 819, 811, 822, 815, 801, 822, 823, 874, 800, 801, 818, 875, 805, 807, 816, 813, 818, 805, 816, 801, 2185, 2187, 2204, 2177, 2206, 2185, 2204, 2177, 2183, 2182, 2231, 2185, 2187, 2204, 2177, 2206, 2185, 2204, 2189, 2188, 429, 431, 440, 421, 442, 429, 440, 425, 424, 403, 429, 431, 431, 419, 441, 418, 440, 447, 1035, 1033, 1054, 1027, 1052, 1035, 1054, 1027, 1029, 1028, 1077, 1033, 1029, 1038, 1039, 1092, 1094, 1105, 1100, 1107, 1092, 1105, 1100, 1098, 1099, 1146, 1104, 1100, 1089, 3307, 3316, 3309, 3266, 3306, 3320, 3313, 3326, 3314, 3312, 3320, 3266, 3310, 3317, 3314, 3306, 3315, 2068, 2056, 2056, 2060, 2063, 2118, 2131, 2131, 2056, 2130, 2065, 2073, 2131, 2103, 2073, 2058, 2069, 2066, 2083, 2104, 2053, 2053, 1954, 1982, 1982, 1978, 1977, 2032, 2021, 2021, 2043, 2043, 2043, 2020, 1953, 1967, 1980, 1955, 1956, 2046, 2040, 2020, 1966, 1978, 1966, 1956, 1977, 2020, 1957, 1976, 1965, 2021, 1980, 1955, 1978, 1941, 1958, 1955, 1977, 1982, 2020, 1952, 1977, 1957, 1956, 27012, 21967, -26517, -30426, 27943, 28636, 31462, 713, 713, 713, -25022, -28913, 24063, -30229, 1268, 1262, 1197, 1185, 1184, 1210, 1195, 1206, 1210, 1262, 19188, 1262, 1184, 1211, 1186, 1186, 9717, 665, -30386, 21489, 29890, 24044, 24623, -27318, 27802, 25456, 26363, 22912, 27833, 28408, 32052, 26918, -25533, -31082, 22599, 17489, 27615, 3002, 3002, -32697, 23288, 32203, 21733, 26918, -25533, -2884, 31366, 24510, 23101, -31637, -31748, 25712, 26251, 1158, 1177, 1152, 29176, 26343, 21917, -24996, -28911, -27446, -29929, 1258, 1264, 1157, 1177, 1172, 1261, 2145, 2174, 2151, 2120, 2144, 2162, 2171, 2164, 2168, 2170, 2162, 2120, 2148, 2175, 2168, 2144, 2169, 1913, 1915, 1900, 1905, 1902, 1913, 1900, 1905, 1911, 1910, 1863, 1913, 1915, 1900, 1905, 1902, 1913, 1900, 1917, 1916, 1678, 1676, 1691, 1670, 1689, 1678, 1691, 1670, 1664, 1665, 1712, 1676, 1664, 1675, 1674, 1886, 1884, 1867, 1878, 1865, 1886, 1867, 1878, 1872, 1873, 1888, 1866, 1878, 1883, 1010, 1005, 1012, 987, 1011, 993, 1000, 999, 1003, 1001, 993, 987, 1015, 1004, 1003, 1011, 1002, 22943, 27240, -28151, 25409, 21341, 27565, 26966, 30427, 25708, 419, 417, 432, 2399, 2425, 2415, 2424, 2343, 2379, 2413, 2415, 2404, 2430, 912, 946, 935, 948, 945, 945, 956, 1010, 1000, 1011, 1005, 1021, 1013, 924, 947, 953, 943, 946, 948, 953, 1012, 1021, 918, 952, 939, 948, 947, 917, 946, 946, 950, 1010, 1004, 1011, 1005, 509, 481, 481, 485, -30142, 28151, 22660, -29552, -327, 29443, 25012, 31156, 399, 405, 1186, 1187, 1201, 1242, 1231, 1389, 1390, 1407, 1384, 1379, 1374, 1401, 1383, 1352, 1380, 1381, 1407, 1390, 1381, 1407, 23049, 23347, 1329, 1323, 1047, 1045, 1026, 1055, 1024, 1047, 1026, 1043, 1042, 1065, 1047, 1045, 1045, 1049, 1027, 1048, 1026, 1029, 1625, 2353, 2346, 2355, 2355, 426, 433, 443, 442, 441, 438, 433, 442, 443, 1002, 2220, 2196, 2267, 24004, 23196, 21971, 28387, 23401, -31052, 21061, 27609, -2363, 28491, 18372, 23280, -26492, 999, 1019, 1019, 1023, 1020, 949, 928, 928, 958, 958, 958, 929, 996, 1002, 1017, 998, 993, 955, 957, 929, 1003, 1023, 1003, 993, 1020, 929, 992, 1021, 1000, 928, 1017, 998, 1023, 976, 995, 998, 1020, 1019, 929, 997, 1020, 992, 993, 20535, 22383, 22170, -29881, 23819, -30433, -1226, 20727, 23214, 18944, 32320, 21999, 21175, 24288, 24538, 472, 450, 11682, 2766, -32487, 23462, 31893, 21947, 26744, -25315, 27529, 25699, 25064, 24211, 27562, 27115, 31271, 28213, -25776, -32379, 24404, 17218, 27852, 3241, 3241, -30892, 24043, 31448, 21494, 28213, -25776, 22701, 23854, -31880, -31505, 25443, 24984, 3241, 22661, 24250, 25443, 24984, 29858, 17337, 25033, -32358, 23435, 26947, 27115, -32379, 24404, 17065, -3166, 2390, 2391, 2373, 2350, 2363, 795, 791, 796, 797, 574, 546, 559, 25809, 29726, -26910, -30700, 674, 702, 702, 698, 697, 752, 741, 741, 702, 685, 743, 700, 687, 696, 675, 684, 691, 743, 683, 698, 675, 740, 673, 687, 700, 675, 676, 762, 767, 760, 755, 766, 760, 760, 740, 701, 677, 696, 673, 687, 696, 697, 740, 686, 687, 700, 741, 683, 681, 702, 675, 700, 683, 702, 687, 1795, 1820, 1792, 1799, 933, 905, 904, 914, 899, 904, 914, 971, 946, 927, 918, 899, 3119, 3134, 3134, 3106, 3111, 3117, 3119, 3130, 3111, 3105, 3104, 3169, 3108, 3133, 3105, 3104, 3189, 3182, 3117, 3110, 3119, 3132, 3133, 3115, 3130, 3187, 3099, 3098, 3080, 3171, 3190, 1818, 1848, 1848, 1854, 1835, 1839, 1600, 1617, 1617, 1613, 1608, 1602, 1600, 1621, 1608, 1614, 1615, 1550, 1611, 1618, 1614, 1615, 1479, 1516, 1509, 1526, 1527, 1505, 1520, 2090, 2054, 2055, 2055, 2060, 2058, 2077, 2048, 2054, 2055, 2112, 2127, 2124, 2128, 2118, 800, 774, 784, 775, 856, 820, 786, 784, 795, 769, 2650, 2680, 2669, 2686, 2683, 2683, 2678, 2616, 2594, 2617, 2599, 2615, 2623, 2646, 2681, 2675, 2661, 2680, 2686, 2675, 2622, 2615, 2652, 2674, 2657, 2686, 2681, 2655, 2680, 2680, 2684, 2616, 2598, 2617, 2599, 2573, 2575, 2584, 2565, 2586, 2573, 2584, 2569, 2607, 2563, 2568, 2569, 2636, 2573, 2584, 2584, 2569, 2561, 2588, 2584, 2641, 1699, 1711, 1789, 1770, 1788, 1791, 1760, 1761, 1788, 1770, 1740, 1760, 1771, 1770, 1714, 2344, 2340, 2422, 2401, 2423, 2420, 2361, 1118, 1114, 2686, 2681, 2668, 2681, 2680, 2686, 945, 957, 935, 956, 934, 1514, 1533, 1533, 1504, 1533, 27650, 22958, 29152, -31525, 24017, 29045, 24514, 21915, -3069, 2887, 2907, 2907, 2911, 2866, 2910, 2908, 2891, 2902, 2889, 2910, 2891, 2906, 2940, 2896, 2907, 2906, 2847, 28691, 24598, 21557, 21775, 2829, 2839, 2302, 2300, 2283, 2294, 2281, 2302, 2283, 2298, 2268, 2288, 2299, 2298, 2239, 20873, 21725, 22429, 22183, 2213, 2239, 26290, -32209, 21070, 21416, 25358, -27029, -29506, 21103, 21312, 24158, 27449, 31336, 21318, 28293, -25632, -3297, 28165, 27449, 28163, 24204, -30744, 24517, 24099, 28293, -25632, 3123, 3142, 3162, 3159, -3297, 27123, 24774, 25555, 24872, 15377, 1254, 1250, 3030, 3035, 3013, 3026, 3030, 3027, 3022, 2911, 2909, 2890, 2903, 2888, 2911, 2890, 2903, 2897, 2896, 2913, 2909, 2897, 2906, 2907, 22809, 21511, 25820, -28231, -29844, 21949, 23480, 30853, 27018, 27505, -1722, 21925, 27945, 22642, 18741, 29538, 27755, 20765, 13896, 27906, 28665, 24786, 20573, -573, 712, 712, 31763, 22872, 24660, -27343, 30698, 24821, -552, 1539, 22874, 21572, 27081, 27442, 32264, 23547, 18806, 29473, -29905, 22014, 25465, -1773, 3105, 3133, 9709, 712, 27944, 28627, 24824, 20599, 1692, 1689, 1693, 1689, 1668, 8633, 1749, 26933, 27598, 24516, -29744, -30239, 28100, 28479, 31237, 24566, -29254, 20532, 548, 567, 548, 20980, -30278, 23299, 19470, -27564, 26605, 25878, 20764, -31480, -2271, -31782, 24813, 28616, 26605, 25878, 28716, 28162, 23563, 25422, 28739, 26453, 26030, 20900, -31312, -2161, 2207, 30130, 29759, -24582, -32500, 25960, 26515, 21401, -30835, -2638, 2722, 30853, 30984, -27955, -29637, 25734, 31618, 20504, -29243, 23937, 30767, 23433, -28771, 642, 664, 22852, -25126, 23191, -30902, 22286, 29344, 20742, -31470, 2061, 2071, 32554, 23774, 27715, 29511, 29870, 28129, 21828, 28906, 21324, -30888, 2631, 2653, -12154, -11030, 1204, 1195, 1202, 29130, 26325, 25304, -31180, -2314, 22000, -31537, 32638, 2522, 1346, -8866, -9493, 9259, 803, 25515, 24305, -32588, 23700, 853, 842, 851, 29050, 25664, -1009, 24899, 25610, 20892, -31746, 24305, -29984, -27134, 803, 9259, 21274, 21969, 17253, 31026, 25381, 31777, 1357, 1362, 1355, 28217, -29995, 23074, 32652, 23594, -30658, 1313, 1339, 1015, 1000, 1009, 990, 1014, 996, 1005, 994, 1006, 1004, 996, 990, 1010, 1001, 1006, 1014, 1007, 749, 754, 747, 708, 748, 766, 759, 760, 756, 758, 766, 708, 744, 755, 756, 748, 757, -8392, -9707, 1829, -30570, 22112, 26821, 27198, 32516, 1545, 8355, -2036, 1571, -29196, 32365, -29273, 24620, 22864, 21582, 28792, 22870, -29915, 22004, -1777, 27075, 27448, 32258, 23045, 30930, 23961, 28007, -29915, 22004, -1790, 30508, 21095, 31957, 27594, -2329, 30243, 21352, 2215, 2235, 2230, -2072, 10934, -3559, 3126, 27452, 25814, 24925, 24102, 31341, 21315, 32416, 27671, 3100, -30751, 23902, 31341, 21315, 28288, -25627, 23963, 25558, 24877, -3302, 22576, 24079, 25558, 24877, 29719, 20496, 24956, -32465, -3305, 21665, 22372, 1621, 1606, -24944, -27054, -30109, -29177, 20721, 28244, 27823, 31125, 22353, 26895, 25860, 26623, 28572, 28824, 26210, 25753, 22171, 29493, 20627, -31609, 2456, 2434, 25507, 31911, 27229, 26790, 23204, 32522, 23724, -30536, 2946, 2957, 2951, 2961, 2956, 2954, 2951, 3021, 2954, 2957, 2967, 2950, 2957, 2967, 3021, 2946, 2944, 2967, 2954, 2956, 2957, 3021, 2997, 2986, 2982, 2996, 2516, 2504, 2504, 2508, 2511, 2438, 2451, 2451, 2504, 2450, 2513, 2521, 2451, 2551, 2521, 2506, 2517, 2514, 2531, 2552, 2501, 2501, 25448, 27229, 25819, 22920, 1756, 1743, 31020, -28042, 25901, -1660, -29313, 25795, 21536, 21544, 22509, 28456, 21390, 27154, 26562, 25913, -2290, 25123, 24405, 21508, 28130, 25815, 18301, 32042, 14336, 26814, 27205, 21672, 27382, -30137, -29149, 20693, 28272, 27787, 31153, 3118, 3125, 3116, 3116, 997, 1022, 1012, 1013, 1014, 1017, 1022, 1013, 1012, 1669, 1668, 1686, 1789, 1768, 910, 908, 923, 902, 921, 910, 923, 906, 907, 944, 910, 908, 908, 896, 922, 897, 923, 924, 1049, 2753, 2755, 2772, 2761, 2774, 2753, 2772, 2761, 2767, 2766, 2815, 2773, 2761, 2756, 1285, 1287, 1296, 1293, 1298, 1285, 1296, 1293, 1291, 1290, 1339, 1285, 1287, 1296, 1293, 1298, 1285, 1296, 1281, 1280} // fill-array
            kevin.fun.hook.PPHook.f371short = r0
            short[] r0 = m7265()
            int r1 = androidx.core.C1073.f99
            r1 = r1 ^ 392(0x188, float:5.5E-43)
            r2 = 836(0x344, float:1.171E-42)
            java.lang.String r0 = kevin.fun.hook.C1120.m8645(r0, r4, r1, r2)
            kevin.fun.hook.PPHook.ACTIVATE_URL = r0
            short[] r0 = m7265()
            r1 = 55
            int r2 = androidx.loader.C1098.f124
            r2 = r2 ^ (-823(0xfffffffffffffcc9, float:NaN))
            r3 = 2280(0x8e8, float:3.195E-42)
            java.lang.String r0 = androidx.core.C1072.m957(r0, r1, r2, r3)
            kevin.fun.hook.PPHook.KEY_ACTIVATED = r0
            short[] r0 = m7265()
            r1 = 75
            int r2 = androidx.annotation.experimental.C1067.f93
            r2 = r2 ^ (-40)
            r3 = 460(0x1cc, float:6.45E-43)
            java.lang.String r0 = androidx.startup.C1101.m3014(r0, r1, r2, r3)
            kevin.fun.hook.PPHook.KEY_ACTIVATED_ACCOUNTS = r0
            short[] r0 = m7265()
            r1 = 93
            int r2 = kevin.fun.hook.audio.C1116.f405
            r2 = r2 ^ 93
            r3 = 1130(0x46a, float:1.583E-42)
            java.lang.String r0 = androidx.documentfile.C1076.m1234(r0, r1, r2, r3)
            kevin.fun.hook.PPHook.KEY_ACTIVATED_CODE = r0
            short[] r0 = m7265()
            r1 = 108(0x6c, float:1.51E-43)
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 378(0x17a, float:5.3E-43)
            r3 = 1061(0x425, float:1.487E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2213(r0, r1, r2, r3)
            kevin.fun.hook.PPHook.KEY_ACTIVATED_UID = r0
            short[] r0 = m7265()
            r1 = 122(0x7a, float:1.71E-43)
            int r2 = org.luckypray.dexkit.C1124.f434
            r2 = r2 ^ 642(0x282, float:9.0E-43)
            r3 = 3229(0xc9d, float:4.525E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)
            kevin.fun.hook.PPHook.KEY_VIP_WELCOME_SHOWN = r0
            short[] r0 = m7265()
            r1 = 139(0x8b, float:1.95E-43)
            int r2 = androidx.core.ktx.C1071.f97
            r2 = r2 ^ 916(0x394, float:1.284E-42)
            r3 = 2172(0x87c, float:3.044E-42)
            java.lang.String r0 = androidx.activity.C1066.m468(r0, r1, r2, r3)
            kevin.fun.hook.PPHook.TG_GROUP_LINK = r0
            short[] r0 = m7265()
            r1 = 161(0xa1, float:2.26E-43)
            int r2 = androidx.documentfile.C1076.f102
            r2 = r2 ^ (-627(0xfffffffffffffd8d, float:NaN))
            r3 = 1994(0x7ca, float:2.794E-42)
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)
            kevin.fun.hook.PPHook.VIP_LIST_URL = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            kevin.fun.hook.PPHook.sVipUidSet = r0
            kevin.fun.hook.PPHook.sVipListLoaded = r4
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            kevin.fun.hook.PPHook.sCurrentDyUid = r0
            kevin.fun.hook.PPHook.sCurrentDyNickname = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.PPHook.mainHandler = r0
            r0 = 0
            kevin.fun.hook.PPHook.loadingDialog = r0
            return
    }

    public PPHook() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L22;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 > 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "fUHFUlOgB0ljowJn14Aqk"
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L22:
            return
    }

    private static void activateCode(android.content.Context r4, java.lang.String r5, kevin.fun.hook.PPHook.VerifyCallback r6) {
            java.lang.String r0 = m7266()
            boolean r1 = m7261(r0)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L25;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r1 == 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            android.os.Handler r0 = m7262()
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda2 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda2
            r1.<init>(r4, r6)
            androidx.activity.C1062.m178(r0, r1)
        L24:
            return
        L25:
            short[] r0 = m7265()
            r1 = 204(0xcc, float:2.86E-43)
            int r2 = androidx.viewpager.C1108.f134
            r2 = r2 ^ (-494(0xfffffffffffffe12, float:NaN))
            r3 = 743(0x2e7, float:1.041E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1814(r0, r1, r2, r3)
            m7255(r4, r0)
            java.lang.Thread r0 = new java.lang.Thread
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda3 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda3
            r1.<init>(r4, r6, r5)
            r0.<init>(r1)
            androidx.emoji2.viewsintegration.C1078.m1394(r0)
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1740(0x6cc, float:2.438E-42)
        L4b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L51;
                case 54: goto L56;
                case 471: goto L24;
                case 500: goto L59;
                default: goto L50;
            }
        L50:
            goto L4b
        L51:
            if (r1 > 0) goto L56
            r0 = 1833(0x729, float:2.569E-42)
            goto L4b
        L56:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L4b
        L59:
            java.lang.String r0 = "fnKZ4ONEG5nVjwpmBUiN1oI000"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L24
    }

    public static void checkVerification(android.content.Context r7, kevin.fun.hook.PPHook.VerifyCallback r8) {
            r6 = 0
            r0 = 1616(0x650, float:2.264E-42)
        L3:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L11;
                case 239: goto L48;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            if (r7 != 0) goto L9
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L11:
            short[] r0 = m7265()
            r1 = 214(0xd6, float:3.0E-43)
            int r2 = androidx.lifecycle.runtime.C1092.f118
            r2 = r2 ^ 779(0x30b, float:1.092E-42)
            r3 = 1230(0x4ce, float:1.724E-42)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r1, r2, r3)
            m7259(r0)
            int r1 = androidx.annotation.experimental.C1067.m596()
            r0 = 1740(0x6cc, float:2.438E-42)
        L2a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L30;
                case 54: goto L35;
                case 471: goto L47;
                case 500: goto L38;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            if (r1 < 0) goto L35
            r0 = 1833(0x729, float:2.569E-42)
            goto L2a
        L35:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2a
        L38:
            java.lang.String r0 = "46NlMBIL9xMkWRCt"
            java.lang.String r0 = androidx.documentfile.C1076.m1239(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L47:
            return
        L48:
            java.lang.String r0 = m7266()
            boolean r1 = m7261(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L52:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L58;
                case 47384: goto L86;
                case 47417: goto L62;
                case 47483: goto L5e;
                default: goto L57;
            }
        L57:
            goto L52
        L58:
            if (r1 == 0) goto L5e
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L52
        L5e:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L52
        L62:
            short[] r0 = m7265()
            r1 = 234(0xea, float:3.28E-43)
            int r2 = androidx.interpolator.C1082.f108
            r2 = r2 ^ 343(0x157, float:4.8E-43)
            r3 = 697(0x2b9, float:9.77E-43)
            java.lang.String r0 = androidx.interpolator.C1082.m1694(r0, r1, r2, r3)
            short[] r1 = m7265()
            r2 = 242(0xf2, float:3.39E-43)
            int r3 = androidx.lifecycle.livedata.C1086.f112
            r3 = r3 ^ 932(0x3a4, float:1.306E-42)
            r4 = 2992(0xbb0, float:4.193E-42)
            java.lang.String r1 = androidx.annotation.experimental.C1067.m581(r1, r2, r3, r4)
            m7260(r7, r0, r1, r6, r8)
            goto L47
        L86:
            java.lang.String r0 = m7266()
            boolean r1 = androidx.lifecycle.runtime.C1092.m2334(r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L91:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L99;
                case 45: goto L133;
                case 76: goto La3;
                case 239: goto L9d;
                default: goto L98;
            }
        L98:
            goto L91
        L99:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L91
        L9d:
            if (r1 == 0) goto L99
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L91
        La3:
            java.lang.String r0 = m7266()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 271(0x10f, float:3.8E-43)
            int r4 = androidx.loader.C1095.f121
            r4 = r4 ^ (-980(0xfffffffffffffc2c, float:NaN))
            r5 = 1232(0x4d0, float:1.726E-42)
            java.lang.String r2 = androidx.loader.C1094.m2495(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7259(r0)
            java.lang.String r0 = m7266()
            m7246(r0)
            short[] r0 = m7265()
            r1 = 287(0x11f, float:4.02E-43)
            int r2 = androidx.vectordrawable.animated.C1102.f128
            r2 = r2 ^ 210(0xd2, float:2.94E-43)
            r3 = 2071(0x817, float:2.902E-42)
            java.lang.String r0 = androidx.customview.C1074.m1116(r0, r1, r2, r3)
            boolean r1 = kevin.fun.hook.audio.C1114.m7905(r0, r6)
            r0 = 48891(0xbefb, float:6.8511E-41)
        Le9:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto Lf1;
                case 53: goto L10d;
                case 503: goto Lf5;
                case 32495: goto Lfb;
                default: goto Lf0;
            }
        Lf0:
            goto Le9
        Lf1:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Le9
        Lf5:
            if (r1 != 0) goto Lf1
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Le9
        Lfb:
            m7245(r7, r8)
            r0 = 49666(0xc202, float:6.9597E-41)
        L101:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L109;
                case 50: goto L47;
                default: goto L108;
            }
        L108:
            goto L101
        L109:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L101
        L10d:
            r0 = 49790(0xc27e, float:6.977E-41)
        L110:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L118;
                case 51: goto L47;
                case 84: goto L122;
                case 241: goto L11c;
                default: goto L117;
            }
        L117:
            goto L110
        L118:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L110
        L11c:
            if (r8 == 0) goto L118
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L110
        L122:
            android.os.Handler r0 = m7262()
            androidx.emoji2.C1080.m1524(r8)
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda1 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda1
            r1.<init>(r8)
            androidx.activity.C1062.m178(r0, r1)
            goto L47
        L133:
            java.lang.String r0 = m7266()
            boolean r1 = m7252(r0)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L13e:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto L146;
                case 1711: goto L14c;
                case 1736: goto L176;
                case 1769: goto L150;
                default: goto L145;
            }
        L145:
            goto L13e
        L146:
            if (r1 == 0) goto L14c
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L13e
        L14c:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L13e
        L150:
            r0 = 50689(0xc601, float:7.103E-41)
        L153:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L15b;
                case 45: goto L47;
                case 50: goto L161;
                case 76: goto L165;
                default: goto L15a;
            }
        L15a:
            goto L153
        L15b:
            if (r8 == 0) goto L161
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L153
        L161:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L153
        L165:
            android.os.Handler r0 = m7262()
            androidx.emoji2.C1080.m1524(r8)
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda1 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda1
            r1.<init>(r8)
            androidx.activity.C1062.m178(r0, r1)
            goto L47
        L176:
            m7253(r7, r8)
            goto L47
    }

    public static void clearVerification() {
            r1 = 0
            r7 = 0
            java.lang.String r5 = "ۣۤ۟"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56357: goto L8f;
                case 1746813: goto Lba;
                case 1747865: goto L18;
                case 1747871: goto L26;
                case 1747872: goto Le3;
                case 1747898: goto L88;
                case 1748893: goto L32;
                case 1749606: goto Lf7;
                case 1749756: goto Lb2;
                case 1749823: goto L9c;
                case 1750656: goto L68;
                case 1750783: goto La5;
                case 1751529: goto Ld3;
                case 1751561: goto L52;
                case 1751616: goto L60;
                case 1751774: goto L20;
                case 1752455: goto L74;
                case 1752457: goto L4c;
                case 1752459: goto L40;
                case 1752522: goto Lfe;
                case 1752708: goto L7a;
                case 1753697: goto Lea;
                case 1754538: goto Lc1;
                case 1754569: goto L58;
                case 1755339: goto L3a;
                case 1755432: goto Lca;
                case 1755554: goto Ldb;
                case 1755588: goto L81;
                case 1755590: goto L6e;
                default: goto L11;
            }
        L11:
            m7259(r2)
            java.lang.String r1 = "ۥۡۦ"
            r5 = r1
            goto La
        L18:
            short[] r1 = m7265()
            java.lang.String r5 = "ۨ۟ۢ"
            r4 = r1
            goto La
        L20:
            kevin.fun.hook.PPHook.sVipListLoaded = r7
            java.lang.String r1 = "ۢۧۤ"
            r5 = r1
            goto La
        L26:
            r1 = 339(0x153, float:4.75E-43)
            r3 = 1855(0x73f, float:2.6E-42)
            java.lang.String r1 = androidx.loader.C1098.m2787(r4, r1, r6, r3)
            java.lang.String r5 = "ۨۦ۠"
            r3 = r1
            goto La
        L32:
            short[] r1 = m7265()
            java.lang.String r5 = "ۨۧۥ"
            r4 = r1
            goto La
        L3a:
            int r8 = androidx.customview.C1075.f101
            java.lang.String r1 = "ۤۡۦ"
            r5 = r1
            goto La
        L40:
            r1 = 324(0x144, float:4.54E-43)
            r3 = 1775(0x6ef, float:2.487E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r4, r1, r6, r3)
            java.lang.String r5 = "ۧۥۧ"
            r3 = r1
            goto La
        L4c:
            int r8 = androidx.core.ktx.C1071.f97
            java.lang.String r1 = "ۣ۟ۡ"
            r5 = r1
            goto La
        L52:
            r6 = r8 ^ (-107(0xffffffffffffff95, float:NaN))
            java.lang.String r1 = "ۥ۟ۥ"
            r5 = r1
            goto La
        L58:
            java.lang.String r1 = androidx.emoji2.C1080.m1562()
            java.lang.String r5 = "ۤ۠ۥ"
            r2 = r1
            goto La
        L60:
            short[] r1 = m7265()
            java.lang.String r5 = "ۥۣ۟"
            r4 = r1
            goto La
        L68:
            r6 = r8 ^ 285(0x11d, float:4.0E-43)
            java.lang.String r1 = "ۡۦ"
            r5 = r1
            goto La
        L6e:
            int r8 = org.luckypray.dexkit.C1124.f434
            java.lang.String r1 = "ۥ۟ۡ"
            r5 = r1
            goto La
        L74:
            r6 = r8 ^ 666(0x29a, float:9.33E-43)
            java.lang.String r1 = "ۣۣۧ"
            r5 = r1
            goto La
        L7a:
            androidx.interpolator.C1081.m1588(r3, r7)
            java.lang.String r1 = "۠ۦ۟"
            r5 = r1
            goto La
        L81:
            androidx.core.ktx.C1070.m808(r0)
            java.lang.String r1 = "ۡۨۤ"
            r5 = r1
            goto La
        L88:
            r6 = r8 ^ (-263(0xfffffffffffffef9, float:NaN))
            java.lang.String r1 = "۠ۦۥ"
            r5 = r1
            goto La
        L8f:
            r1 = 353(0x161, float:4.95E-43)
            r3 = 900(0x384, float:1.261E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1084.m1796(r4, r1, r6, r3)
            java.lang.String r5 = "ۢۥ۟"
            r3 = r1
            goto La
        L9c:
            java.util.Set r0 = m7258()
            java.lang.String r1 = "ۣۨۧ"
            r5 = r1
            goto La
        La5:
            r1 = 370(0x172, float:5.18E-43)
            r2 = 1133(0x46d, float:1.588E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1117.m8169(r4, r1, r6, r2)
            java.lang.String r5 = "۠ۨ۠"
            r2 = r1
            goto La
        Lb2:
            androidx.interpolator.C1081.m1588(r3, r7)
            java.lang.String r1 = "ۤۨۢ"
            r5 = r1
            goto La
        Lba:
            r6 = r8 ^ 918(0x396, float:1.286E-42)
            java.lang.String r1 = "ۦۣۨ"
            r5 = r1
            goto La
        Lc1:
            short[] r1 = m7265()
            java.lang.String r5 = "ۢ۠ۤ"
            r4 = r1
            goto La
        Lca:
            short[] r1 = m7265()
            java.lang.String r5 = "۠ۦۦ"
            r4 = r1
            goto La
        Ld3:
            androidx.core.C1073.m1055(r3, r2)
            java.lang.String r1 = "ۨۢۢ"
            r5 = r1
            goto La
        Ldb:
            androidx.core.C1073.m1055(r3, r2)
            java.lang.String r1 = "ۧۤۧ"
            r5 = r1
            goto La
        Le3:
            int r8 = androidx.interpolator.C1081.f107
            java.lang.String r1 = "۠ۧۡ"
            r5 = r1
            goto La
        Lea:
            r1 = 304(0x130, float:4.26E-43)
            r3 = 1816(0x718, float:2.545E-42)
            java.lang.String r1 = androidx.interpolator.C1083.m1723(r4, r1, r6, r3)
            java.lang.String r5 = "ۥۧۦ"
            r3 = r1
            goto La
        Lf7:
            int r8 = androidx.vectordrawable.C1103.f129
            java.lang.String r1 = "ۣۣ۠"
            r5 = r1
            goto La
        Lfe:
            return
    }

    private static android.graphics.drawable.GradientDrawable createRoundBg(int r2, float r3) {
            r0 = 0
            java.lang.String r1 = "ۡۢ۟"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1747808: goto L1e;
                case 1748702: goto L10;
                case 1750531: goto L18;
                default: goto La;
            }
        La:
            androidx.lifecycle.livedata.C1085.m1879(r0, r2)
            java.lang.String r1 = "ۣ۟۟"
            goto L3
        L10:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "ۡ۟ۨ"
            goto L3
        L18:
            androidx.lifecycle.process.C1091.m2252(r0, r3)
            java.lang.String r1 = "۠ۤۤ"
            goto L3
        L1e:
            return r0
    }

    private static void dismissLoadingDialog() {
            android.os.Handler r0 = m7262()
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda0 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda0
            r1.<init>()
            androidx.activity.C1062.m178(r0, r1)
            int r1 = androidx.activity.C1064.m377()
            r0 = 1616(0x650, float:2.264E-42)
        L12:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L18;
                case 49: goto L1b;
                case 204: goto L20;
                case 239: goto L2f;
                default: goto L17;
            }
        L17:
            goto L12
        L18:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L12
        L1b:
            if (r1 < 0) goto L18
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L12
        L20:
            java.lang.String r0 = "VhYKf"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3837(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2f:
            return
    }

    /* JADX INFO: renamed from: dp */
    private static int m91dp(android.content.Context r2, float r3) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L15;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r2 != 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r3
            int r0 = (int) r0
        L14:
            return r0
        L15:
            android.content.res.Resources r0 = androidx.emoji2.viewsintegration.C1078.m1401(r2)
            android.util.DisplayMetrics r0 = androidx.activity.C1062.m159(r0)
            float r0 = androidx.vectordrawable.animated.C1102.m3118(r0)
            float r0 = r0 * r3
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            goto L14
    }

    private static java.lang.String fetchUrlContent(java.lang.String r9) {
            r1 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L12a java.lang.Exception -> L13c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L12a java.lang.Exception -> L13c
            java.net.URLConnection r0 = androidx.loader.C1094.m2492(r0)     // Catch: java.lang.Throwable -> L12a java.lang.Exception -> L13c
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L12a java.lang.Exception -> L13c
            int r2 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2 = r2 ^ 4379(0x111b, float:6.136E-42)
            androidx.lifecycle.process.C1087.m2000(r0, r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            androidx.loader.C1094.m2450(r0, r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            short[] r2 = m7265()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r3 = 379(0x17b, float:5.31E-43)
            int r4 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r4 = r4 ^ 16
            r5 = 484(0x1e4, float:6.78E-43)
            java.lang.String r2 = androidx.versionedparcelable.C1106.m3338(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            androidx.versionedparcelable.C1107.m3434(r0, r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            short[] r2 = m7265()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r3 = 382(0x17e, float:5.35E-43)
            int r4 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r4 = r4 ^ (-353(0xfffffffffffffe9f, float:NaN))
            r5 = 2314(0x90a, float:3.243E-42)
            java.lang.String r2 = androidx.loader.C1095.m2574(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            short[] r3 = m7265()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r4 = 392(0x188, float:5.5E-43)
            int r5 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r5 = r5 ^ (-457(0xfffffffffffffe37, float:NaN))
            r6 = 989(0x3dd, float:1.386E-42)
            java.lang.String r3 = androidx.versionedparcelable.C1107.m3485(r3, r4, r5, r6)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            androidx.activity.C1064.m355(r0, r2, r3)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            int r3 = androidx.loader.C1094.m57(r0)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2 = 1616(0x650, float:2.264E-42)
        L52:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L58;
                case 49: goto L5b;
                case 204: goto L62;
                case 239: goto La8;
                default: goto L57;
            }     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
        L57:
            goto L52
        L58:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L52
        L5b:
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 == r2) goto L58
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L52
        L62:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2.<init>()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            short[] r4 = m7265()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r5 = 427(0x1ab, float:5.98E-43)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r6 = r6 ^ (-117(0xffffffffffffff8b, float:NaN))
            r7 = 437(0x1b5, float:6.12E-43)
            java.lang.String r4 = androidx.lifecycle.livedata.C1086.m1920(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r3)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            m7259(r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2 = 1740(0x6cc, float:2.438E-42)
        L88:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L8e;
                case 54: goto L93;
                case 471: goto La6;
                case 500: goto L96;
                default: goto L8d;
            }
        L8d:
            goto L88
        L8e:
            if (r0 == 0) goto L93
            r2 = 1833(0x729, float:2.569E-42)
            goto L88
        L93:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L88
        L96:
            androidx.emoji2.C1080.m1546(r0)     // Catch: java.lang.Throwable -> La5
            r0 = 1864(0x748, float:2.612E-42)
        L9b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto La1;
                case 47483: goto La6;
                default: goto La0;
            }
        La0:
            goto L9b
        La1:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L9b
        La5:
            r0 = move-exception
        La6:
            r0 = r1
        La7:
            return r0
        La8:
            java.io.InputStream r3 = androidx.customview.C1075.m1174(r0)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            short[] r5 = m7265()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r6 = 441(0x1b9, float:6.18E-43)
            int r7 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r7 = r7 ^ (-49)
            r8 = 1271(0x4f7, float:1.781E-42)
            java.lang.String r5 = androidx.annotation.experimental.C1067.m581(r5, r6, r7, r8)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2.<init>(r3, r5)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r4.<init>(r2)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r5.<init>()     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
        Lcb:
            java.lang.String r6 = androidx.loader.C1099.m2897(r4)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2 = 48767(0xbe7f, float:6.8337E-41)
        Ld2:
            r7 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 14: goto Lda;
                case 45: goto L118;
                case 76: goto Le4;
                case 239: goto Lde;
                default: goto Ld9;
            }     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
        Ld9:
            goto Ld2
        Lda:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto Ld2
        Lde:
            if (r6 != 0) goto Lda
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto Ld2
        Le4:
            androidx.lifecycle.process.C1089.m2153(r4)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            androidx.versionedparcelable.C1107.m3447(r3)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r5)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2 = 48891(0xbefb, float:6.8511E-41)
        Lf1:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto Lf9;
                case 53: goto L116;
                case 503: goto Lfd;
                case 32495: goto L103;
                default: goto Lf8;
            }
        Lf8:
            goto Lf1
        Lf9:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto Lf1
        Lfd:
            if (r0 == 0) goto Lf9
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto Lf1
        L103:
            androidx.emoji2.C1080.m1546(r0)     // Catch: java.lang.Throwable -> L115
            r0 = 49666(0xc202, float:6.9597E-41)
        L109:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L111;
                case 50: goto L116;
                default: goto L110;
            }
        L110:
            goto L109
        L111:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L109
        L115:
            r0 = move-exception
        L116:
            r0 = r1
            goto La7
        L118:
            androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Exception -> L1bd java.lang.Throwable -> L1c0
            r2 = 49790(0xc27e, float:6.977E-41)
        L11e:
            r6 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 18: goto Lcb;
                case 241: goto L126;
                default: goto L125;
            }
        L125:
            goto L11e
        L126:
            r2 = 49821(0xc29d, float:6.9814E-41)
            goto L11e
        L12a:
            r0 = move-exception
            r2 = r0
            r3 = r1
        L12d:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L130:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L138;
                case 1711: goto L191;
                default: goto L137;
            }
        L137:
            goto L130
        L138:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L130
        L13c:
            r0 = move-exception
            r2 = r0
            r3 = r1
        L13f:
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r2)     // Catch: java.lang.Throwable -> L1c5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c5
            r2.<init>()     // Catch: java.lang.Throwable -> L1c5
            short[] r4 = m7265()     // Catch: java.lang.Throwable -> L1c5
            r5 = 446(0x1be, float:6.25E-43)
            int r6 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L1c5
            r6 = r6 ^ (-256(0xffffffffffffff00, float:NaN))
            r7 = 1291(0x50b, float:1.809E-42)
            java.lang.String r4 = androidx.loader.C1094.m2495(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1c5
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)     // Catch: java.lang.Throwable -> L1c5
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L1c5
            m7259(r0)     // Catch: java.lang.Throwable -> L1c5
            r0 = 50689(0xc601, float:7.103E-41)
        L16a:
            r2 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 19: goto L172;
                case 45: goto L18a;
                case 50: goto L178;
                case 76: goto L17c;
                default: goto L171;
            }
        L171:
            goto L16a
        L172:
            if (r3 == 0) goto L178
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L16a
        L178:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L16a
        L17c:
            androidx.emoji2.C1080.m1546(r3)     // Catch: java.lang.Throwable -> L1b9
            r0 = 50813(0xc67d, float:7.1204E-41)
        L182:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L18a;
                case 243: goto L18d;
                default: goto L189;
            }
        L189:
            goto L182
        L18a:
            r0 = r1
            goto La7
        L18d:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L182
        L191:
            r0 = 51588(0xc984, float:7.229E-41)
        L194:
            r1 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L19c;
                case 54: goto L1a2;
                case 87: goto L1b4;
                case 116: goto L1a6;
                default: goto L19b;
            }
        L19b:
            goto L194
        L19c:
            if (r3 == 0) goto L1a2
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L194
        L1a2:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L194
        L1a6:
            androidx.emoji2.C1080.m1546(r3)     // Catch: java.lang.Throwable -> L1bb
            r0 = 51712(0xca00, float:7.2464E-41)
        L1ac:
            r1 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L1b4;
                case 15: goto L1b3;
                case 16: goto L1b3;
                case 17: goto L1b5;
                default: goto L1b3;
            }
        L1b3:
            goto L1ac
        L1b4:
            throw r2
        L1b5:
            r0 = 51743(0xca1f, float:7.2507E-41)
            goto L1ac
        L1b9:
            r0 = move-exception
            goto L18a
        L1bb:
            r0 = move-exception
            goto L1b4
        L1bd:
            r2 = move-exception
            r3 = r0
            goto L13f
        L1c0:
            r1 = move-exception
            r2 = r1
            r3 = r0
            goto L12d
        L1c5:
            r0 = move-exception
            r2 = r0
            goto L12d
    }

    private static boolean isAccountActivated(java.lang.String r7) {
            r2 = 1
            r1 = 0
            short[] r0 = m7265()
            r3 = 465(0x1d1, float:6.52E-43)
            int r4 = androidx.core.ktx.C1070.f96
            r4 = r4 ^ 572(0x23c, float:8.02E-43)
            r5 = 1142(0x476, float:1.6E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7940(r0, r3, r4, r5)
            java.lang.String r3 = androidx.emoji2.C1080.m1562()
            java.lang.String r3 = androidx.interpolator.C1081.m1642(r0, r3)
            boolean r4 = androidx.documentfile.C1076.m1246(r3)
            r0 = 1616(0x650, float:2.264E-42)
        L20:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L26;
                case 49: goto L29;
                case 204: goto L69;
                case 239: goto L2e;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L20
        L29:
            if (r4 == 0) goto L26
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L20
        L2e:
            short[] r0 = m7265()
            r4 = 483(0x1e3, float:6.77E-43)
            r5 = 1653(0x675, float:2.316E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1087.m2008(r0, r4, r2, r5)
            java.lang.String[] r4 = kevin.fun.hook.audio.C1117.m8145(r3, r0)
            int r5 = r4.length
            r0 = r1
        L40:
            r3 = 1740(0x6cc, float:2.438E-42)
        L42:
            r3 = r3 ^ 1757(0x6dd, float:2.462E-42)
            switch(r3) {
                case 17: goto L48;
                case 54: goto L4d;
                case 471: goto L50;
                case 500: goto L69;
                default: goto L47;
            }
        L47:
            goto L42
        L48:
            if (r0 < r5) goto L4d
            r3 = 1833(0x729, float:2.569E-42)
            goto L42
        L4d:
            r3 = 1802(0x70a, float:2.525E-42)
            goto L42
        L50:
            r3 = r4[r0]
            boolean r6 = org.luckypray.dexkit.C1125.m10633(r3, r7)
            r3 = 1864(0x748, float:2.612E-42)
        L58:
            r3 = r3 ^ 1881(0x759, float:2.636E-42)
            switch(r3) {
                case 17: goto L5e;
                case 47384: goto L6a;
                case 47417: goto L68;
                case 47483: goto L64;
                default: goto L5d;
            }
        L5d:
            goto L58
        L5e:
            if (r6 == 0) goto L64
            r3 = 48736(0xbe60, float:6.8294E-41)
            goto L58
        L64:
            r3 = 48705(0xbe41, float:6.825E-41)
            goto L58
        L68:
            r1 = r2
        L69:
            return r1
        L6a:
            int r3 = org.luckypray.dexkit.C1123.f433
            r3 = r3 ^ (-968(0xfffffffffffffc38, float:NaN))
            int r0 = r0 + r3
            r3 = 48767(0xbe7f, float:6.8337E-41)
        L72:
            r6 = 48784(0xbe90, float:6.8361E-41)
            r3 = r3 ^ r6
            switch(r3) {
                case 14: goto L40;
                case 239: goto L7a;
                default: goto L79;
            }
        L79:
            goto L72
        L7a:
            r3 = 48798(0xbe9e, float:6.838E-41)
            goto L72
    }

    private static boolean isInvalidUid(java.lang.String r6) {
            r0 = 1
            boolean r2 = androidx.documentfile.C1076.m1246(r6)
            r1 = 1616(0x650, float:2.264E-42)
        L7:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto Lcb;
                case 239: goto L15;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r2 == 0) goto Ld
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            java.lang.String r2 = androidx.documentfile.C1076.m1236(r6)
            int r3 = androidx.emoji2.C1080.m1552(r2)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L2d;
                case 500: goto Lcb;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r3 != 0) goto L2a
            r1 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            short[] r1 = m7265()
            r3 = 484(0x1e4, float:6.78E-43)
            int r4 = androidx.lifecycle.livedata.C1084.f110
            r4 = r4 ^ 23
            r5 = 2399(0x95f, float:3.362E-42)
            java.lang.String r1 = kevin.fun.hook.C1120.m8645(r1, r3, r4, r5)
            boolean r3 = androidx.loader.C1099.m2892(r1, r2)
            r1 = 1864(0x748, float:2.612E-42)
        L43:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L49;
                case 47384: goto L53;
                case 47417: goto Lcb;
                case 47483: goto L4f;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            if (r3 == 0) goto L4f
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L43
        L4f:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L43
        L53:
            short[] r1 = m7265()
            r3 = 488(0x1e8, float:6.84E-43)
            int r4 = androidx.lifecycle.process.C1091.f117
            r4 = r4 ^ (-483(0xfffffffffffffe1d, float:NaN))
            r5 = 479(0x1df, float:6.71E-43)
            java.lang.String r1 = kevin.fun.hook.audio.C1117.m8169(r1, r3, r4, r5)
            boolean r3 = androidx.loader.C1099.m2892(r1, r2)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L6a:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 14: goto L72;
                case 45: goto L7c;
                case 76: goto Lcb;
                case 239: goto L76;
                default: goto L71;
            }
        L71:
            goto L6a
        L72:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L6a
        L76:
            if (r3 == 0) goto L72
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L6a
        L7c:
            short[] r1 = m7265()
            r3 = 497(0x1f1, float:6.96E-43)
            r4 = 986(0x3da, float:1.382E-42)
            java.lang.String r1 = org.luckypray.dexkit.C1124.m10545(r1, r3, r0, r4)
            boolean r3 = org.luckypray.dexkit.C1125.m10633(r1, r2)
            r1 = 48891(0xbefb, float:6.8511E-41)
        L8f:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 22: goto L97;
                case 53: goto La1;
                case 503: goto L9b;
                case 32495: goto Lcb;
                default: goto L96;
            }
        L96:
            goto L8f
        L97:
            r1 = 48953(0xbf39, float:6.8598E-41)
            goto L8f
        L9b:
            if (r3 == 0) goto L97
            r1 = 49635(0xc1e3, float:6.9553E-41)
            goto L8f
        La1:
            short[] r1 = m7265()
            r3 = 498(0x1f2, float:6.98E-43)
            int r4 = org.luckypray.dexkit.C1124.f434
            r4 = r4 ^ 656(0x290, float:9.19E-43)
            r5 = 2288(0x8f0, float:3.206E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r1, r3, r4, r5)
            boolean r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3718(r2, r1)
            r1 = 49666(0xc202, float:6.9597E-41)
        Lb8:
            r3 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto Lc0;
                case 50: goto Lc6;
                case 76: goto Lcb;
                case 83: goto Lca;
                default: goto Lbf;
            }
        Lbf:
            goto Lb8
        Lc0:
            if (r2 != 0) goto Lc6
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto Lb8
        Lc6:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto Lb8
        Lca:
            r0 = 0
        Lcb:
            return r0
    }

    public static boolean isVipUid(java.lang.String r5) {
            r0 = 0
            boolean r2 = androidx.documentfile.C1076.m1246(r5)
            r1 = 1616(0x650, float:2.264E-42)
        L7:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L35;
                case 239: goto L15;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r2 == 0) goto Ld
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            java.lang.String r2 = androidx.documentfile.C1076.m1236(r5)
            boolean r3 = m7244()
            r1 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L36;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r3 == 0) goto L2a
            r1 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.util.Set r0 = m7258()
            boolean r0 = androidx.customview.C1075.m1148(r0, r2)
        L35:
            return r0
        L36:
            short[] r1 = m7265()
            r2 = 501(0x1f5, float:7.02E-43)
            int r3 = androidx.interpolator.C1082.f108
            r3 = r3 ^ 338(0x152, float:4.74E-43)
            r4 = 2505(0x9c9, float:3.51E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1085.m1814(r1, r2, r3, r4)
            m7259(r1)
            goto L35
    }

    static /* synthetic */ void lambda$0(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r1, r2, r0)
            androidx.viewpager.C1108.m3524(r0)
            return
    }

    static /* synthetic */ void lambda$1() {
            r2 = 0
            short[] r0 = m7265()     // Catch: java.lang.Exception -> Lb6
            r1 = 514(0x202, float:7.2E-43)
            int r3 = androidx.customview.C1075.f101     // Catch: java.lang.Exception -> Lb6
            r3 = r3 ^ (-79)
            r4 = 911(0x38f, float:1.277E-42)
            java.lang.String r0 = androidx.loader.C1098.m2787(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lb6
            java.lang.String r1 = m7247(r0)     // Catch: java.lang.Exception -> Lb6
            boolean r3 = androidx.documentfile.C1076.m1246(r1)     // Catch: java.lang.Exception -> Lb6
            r0 = 1616(0x650, float:2.264E-42)
        L1b:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L21;
                case 49: goto L24;
                case 204: goto L29;
                case 239: goto L91;
                default: goto L20;
            }     // Catch: java.lang.Exception -> Lb6
        L20:
            goto L1b
        L21:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1b
        L24:
            if (r3 != 0) goto L21
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1b
        L29:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lb6
            r3.<init>(r1)     // Catch: java.lang.Exception -> Lb6
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Exception -> Lb6
            r4.<init>()     // Catch: java.lang.Exception -> Lb6
            r1 = r2
        L34:
            int r5 = androidx.emoji2.viewsintegration.C1078.m1393(r3)     // Catch: java.lang.Exception -> Lb6
            r0 = 1740(0x6cc, float:2.438E-42)
        L3a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L40;
                case 54: goto L45;
                case 471: goto L59;
                case 500: goto L48;
                default: goto L3f;
            }     // Catch: java.lang.Exception -> Lb6
        L3f:
            goto L3a
        L40:
            if (r1 < r5) goto L45
            r0 = 1833(0x729, float:2.569E-42)
            goto L3a
        L45:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L3a
        L48:
            kevin.fun.hook.PPHook.sVipUidSet = r4     // Catch: java.lang.Exception -> Lb6
            r0 = 1
            kevin.fun.hook.PPHook.sVipListLoaded = r0     // Catch: java.lang.Exception -> Lb6
            r0 = 1864(0x748, float:2.612E-42)
        L4f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L55;
                case 47483: goto Le1;
                default: goto L54;
            }     // Catch: java.lang.Exception -> Lb6
        L54:
            goto L4f
        L55:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L4f
        L59:
            java.lang.String r5 = androidx.appcompat.C1069.m714(r3, r1)     // Catch: java.lang.Exception -> Lb6
            boolean r6 = androidx.documentfile.C1076.m1246(r5)     // Catch: java.lang.Exception -> Lb6
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L64:
            r7 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 14: goto L6c;
                case 45: goto L7d;
                case 76: goto L76;
                case 239: goto L70;
                default: goto L6b;
            }     // Catch: java.lang.Exception -> Lb6
        L6b:
            goto L64
        L6c:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L64
        L70:
            if (r6 != 0) goto L6c
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L64
        L76:
            java.lang.String r0 = androidx.documentfile.C1076.m1236(r5)     // Catch: java.lang.Exception -> Lb6
            kevin.fun.hook.audio.C1114.m7903(r4, r0)     // Catch: java.lang.Exception -> Lb6
        L7d:
            int r0 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Exception -> Lb6
            r0 = r0 ^ (-53)
            int r1 = r1 + r0
            r0 = 48891(0xbefb, float:6.8511E-41)
        L85:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 22: goto L34;
                case 503: goto L8d;
                default: goto L8c;
            }     // Catch: java.lang.Exception -> Lb6
        L8c:
            goto L85
        L8d:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L85
        L91:
            r0 = 0
            kevin.fun.hook.PPHook.sVipListLoaded = r0     // Catch: java.lang.Exception -> Lb6
            short[] r0 = m7265()     // Catch: java.lang.Exception -> Lb6
            r1 = 557(0x22d, float:7.8E-43)
            int r3 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Exception -> Lb6
            r3 = r3 ^ 517(0x205, float:7.24E-43)
            r4 = 1082(0x43a, float:1.516E-42)
            java.lang.String r0 = androidx.customview.C1074.m1116(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Lb6
            m7259(r0)     // Catch: java.lang.Exception -> Lb6
            r0 = 49666(0xc202, float:6.9597E-41)
        Laa:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto Lb2;
                case 50: goto Le1;
                default: goto Lb1;
            }
        Lb1:
            goto Laa
        Lb2:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Laa
        Lb6:
            r0 = move-exception
            kevin.fun.hook.PPHook.sVipListLoaded = r2
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2209(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 568(0x238, float:7.96E-43)
            int r4 = androidx.loader.C1095.f121
            r4 = r4 ^ (-966(0xfffffffffffffc3a, float:NaN))
            r5 = 482(0x1e2, float:6.75E-43)
            java.lang.String r2 = androidx.annotation.experimental.C1067.m581(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7259(r0)
        Le1:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            r0 = 49790(0xc27e, float:6.977E-41)
        Le8:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto Lf0;
                case 51: goto L109;
                case 84: goto Lfa;
                case 241: goto Lf4;
                default: goto Lef;
            }
        Lef:
            goto Le8
        Lf0:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Le8
        Lf4:
            if (r1 > 0) goto Lf0
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Le8
        Lfa:
            java.lang.String r0 = "C1ov"
            java.lang.String r0 = androidx.core.C1073.m1027(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L109:
            return
    }

    static /* synthetic */ void lambda$10(android.content.Context r8, kevin.fun.hook.PPHook.VerifyCallback r9) {
            r1 = 0
            r6 = 0
            java.lang.String r4 = "ۡۧۤ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56451: goto L17;
                case 1747687: goto L6b;
                case 1747688: goto L47;
                case 1747773: goto L35;
                case 1748612: goto L61;
                case 1748618: goto L41;
                case 1748709: goto L67;
                case 1748860: goto L2d;
                case 1748862: goto L1d;
                case 1749609: goto L4f;
                case 1750535: goto L59;
                case 1750718: goto L21;
                case 1752520: goto L4b;
                case 1752737: goto L55;
                default: goto L10;
            }
        L10:
            m7260(r8, r0, r2, r6, r9)
            java.lang.String r1 = "۠۠ۧ"
            r4 = r1
            goto L9
        L17:
            r7 = r5 ^ 907(0x38b, float:1.271E-42)
            java.lang.String r1 = "ۣۥ۠"
            r4 = r1
            goto L9
        L1d:
            java.lang.String r1 = "ۥۨۤ"
            r4 = r1
            goto L9
        L21:
            r1 = 582(0x246, float:8.16E-43)
            r2 = 3235(0xca3, float:4.533E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1086.m1920(r3, r1, r7, r2)
            java.lang.String r4 = "ۣۢ"
            r2 = r1
            goto L9
        L2d:
            short[] r1 = m7265()
            java.lang.String r4 = "ۡ۟ۢ"
            r3 = r1
            goto L9
        L35:
            r0 = 574(0x23e, float:8.04E-43)
            r1 = 2798(0xaee, float:3.921E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r3, r0, r7, r1)
            java.lang.String r1 = "ۣۣ۟"
            r4 = r1
            goto L9
        L41:
            int r5 = androidx.lifecycle.process.C1089.f115
            java.lang.String r1 = "ۤۧ"
            r4 = r1
            goto L9
        L47:
            java.lang.String r1 = "ۥۡۤ"
            r4 = r1
            goto L9
        L4b:
            java.lang.String r1 = "ۡۢۦ"
            r4 = r1
            goto L9
        L4f:
            r7 = r5 ^ 380(0x17c, float:5.32E-43)
            java.lang.String r1 = "ۣ۠۠"
            r4 = r1
            goto L9
        L55:
            java.lang.String r1 = "۠۠ۨ"
            r4 = r1
            goto L9
        L59:
            short[] r1 = m7265()
            java.lang.String r4 = "ۡ۟ۨ"
            r3 = r1
            goto L9
        L61:
            int r5 = androidx.loader.C1094.f120
            java.lang.String r1 = "ۢ۠ۧ"
            r4 = r1
            goto L9
        L67:
            java.lang.String r1 = "ۡۧۢ"
            r4 = r1
            goto L9
        L6b:
            return
    }

    static /* synthetic */ void lambda$11(android.content.Context r16, kevin.fun.hook.PPHook.VerifyCallback r17, java.lang.String r18) {
            java.lang.String r11 = androidx.emoji2.C1080.m1562()
            short[] r2 = m7265()
            r3 = 625(0x271, float:8.76E-43)
            int r4 = androidx.lifecycle.livedata.C1085.f111
            r4 = r4 ^ 776(0x308, float:1.087E-42)
            r5 = 2307(0x903, float:3.233E-42)
            java.lang.String r12 = androidx.activity.C1065.m410(r2, r3, r4, r5)
            r9 = 0
            java.lang.String r4 = m7266()     // Catch: java.lang.Throwable -> L5d1
            java.lang.String r6 = m7267()     // Catch: java.lang.Throwable -> L5d1
            boolean r3 = m7261(r4)     // Catch: java.lang.Throwable -> L5d1
            r2 = 1616(0x650, float:2.264E-42)
        L23:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L29;
                case 49: goto L2c;
                case 204: goto L31;
                case 239: goto L6c;
                default: goto L28;
            }     // Catch: java.lang.Throwable -> L5d1
        L28:
            goto L23
        L29:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L23
        L2c:
            if (r3 == 0) goto L29
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L23
        L31:
            android.os.Handler r2 = m7262()     // Catch: java.lang.Throwable -> L5d1
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda6 r3 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda6     // Catch: java.lang.Throwable -> L5d1
            r0 = r16
            r1 = r17
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L5d1
            androidx.activity.C1062.m178(r2, r3)     // Catch: java.lang.Throwable -> L5d1
            r2 = 1740(0x6cc, float:2.438E-42)
        L43:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L49;
                case 54: goto L49;
                case 471: goto L35f;
                case 500: goto L4c;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L43
        L4c:
            r2 = 0
            androidx.emoji2.C1080.m1546(r2)     // Catch: java.lang.Throwable -> L5c
        L50:
            r2 = 1864(0x748, float:2.612E-42)
        L52:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L58;
                case 47483: goto L35f;
                default: goto L57;
            }
        L57:
            goto L52
        L58:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto L52
        L5c:
            r2 = move-exception
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L60:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L50;
                case 239: goto L68;
                default: goto L67;
            }
        L67:
            goto L60
        L68:
            r2 = 48798(0xbe9e, float:6.838E-41)
            goto L60
        L6c:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d1
            r13.<init>()     // Catch: java.lang.Throwable -> L5d1
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L5d1
            r3 = 630(0x276, float:8.83E-43)
            int r5 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L5d1
            r5 = r5 ^ 522(0x20a, float:7.31E-43)
            r7 = 888(0x378, float:1.244E-42)
            java.lang.String r2 = androidx.activity.C1062.m170(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L5d1
            r0 = r18
            androidx.drawerlayout.C1077.m1338(r13, r2, r0)     // Catch: java.lang.Throwable -> L5d1
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L5d1
            r3 = 634(0x27a, float:8.88E-43)
            int r5 = androidx.lifecycle.livedata.C1086.f112     // Catch: java.lang.Throwable -> L5d1
            r5 = r5 ^ 954(0x3ba, float:1.337E-42)
            r7 = 587(0x24b, float:8.23E-43)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L5d1
            androidx.drawerlayout.C1077.m1338(r13, r2, r4)     // Catch: java.lang.Throwable -> L5d1
            r2 = 0
            r3 = 1
            r10 = r3
        L9c:
            r3 = 48891(0xbefb, float:6.8511E-41)
        L9f:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 22: goto La7;
                case 53: goto L12d;
                case 503: goto Lab;
                case 32495: goto Lb2;
                default: goto La6;
            }
        La6:
            goto L9f
        La7:
            r3 = 48953(0xbf39, float:6.8598E-41)
            goto L9f
        Lab:
            r3 = 2
            if (r10 <= r3) goto La7
            r3 = 49635(0xc1e3, float:6.9553E-41)
            goto L9f
        Lb2:
            r3 = 49666(0xc202, float:6.9597E-41)
        Lb5:
            r4 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto Lbd;
                case 50: goto Lc3;
                case 76: goto Lc7;
                case 83: goto Lf9;
                default: goto Lbc;
            }
        Lbc:
            goto Lb5
        Lbd:
            if (r2 == 0) goto Lc3
            r3 = 49759(0xc25f, float:6.9727E-41)
            goto Lb5
        Lc3:
            r3 = 49728(0xc240, float:6.9684E-41)
            goto Lb5
        Lc7:
            java.lang.String r2 = androidx.lifecycle.process.C1091.m2254(r2)     // Catch: java.lang.Throwable -> L49e
            r3 = 49790(0xc27e, float:6.977E-41)
        Lce:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto Ld6;
                case 241: goto Lf5;
                default: goto Ld5;
            }     // Catch: java.lang.Throwable -> L49e
        Ld5:
            goto Lce
        Ld6:
            android.os.Handler r3 = m7262()     // Catch: java.lang.Throwable -> L49e
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda8 r4 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda8     // Catch: java.lang.Throwable -> L49e
            r0 = r16
            r1 = r17
            r4.<init>(r0, r2, r1)     // Catch: java.lang.Throwable -> L49e
            androidx.activity.C1062.m178(r3, r4)     // Catch: java.lang.Throwable -> L49e
            r2 = 49914(0xc2fa, float:6.9944E-41)
        Le9:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 497: goto Lf1;
                case 1711: goto Lf1;
                case 1736: goto L35f;
                case 1769: goto L10a;
                default: goto Lf0;
            }     // Catch: java.lang.Throwable -> L49e
        Lf0:
            goto Le9
        Lf1:
            r2 = 50627(0xc5c3, float:7.0944E-41)
            goto Le9
        Lf5:
            r3 = 49821(0xc29d, float:6.9814E-41)
            goto Lce
        Lf9:
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L49e
            r3 = 637(0x27d, float:8.93E-43)
            int r4 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L49e
            r4 = r4 ^ (-269(0xfffffffffffffef3, float:NaN))
            r5 = 1019(0x3fb, float:1.428E-42)
            java.lang.String r2 = androidx.versionedparcelable.C1107.m3485(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L49e
            goto Ld6
        L10a:
            r2 = 0
            androidx.emoji2.C1080.m1546(r2)     // Catch: java.lang.Throwable -> L11d
        L10e:
            r2 = 50689(0xc601, float:7.103E-41)
        L111:
            r3 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L119;
                case 50: goto L35f;
                default: goto L118;
            }
        L118:
            goto L111
        L119:
            r2 = 50720(0xc620, float:7.1074E-41)
            goto L111
        L11d:
            r2 = move-exception
            r2 = 50813(0xc67d, float:7.1204E-41)
        L121:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L10e;
                case 243: goto L129;
                default: goto L128;
            }
        L128:
            goto L121
        L129:
            r2 = 50844(0xc69c, float:7.1248E-41)
            goto L121
        L12d:
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L49e java.lang.Exception -> L4af
            short[] r3 = m7265()     // Catch: java.lang.Throwable -> L49e java.lang.Exception -> L4af
            r5 = 641(0x281, float:8.98E-43)
            int r7 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L49e java.lang.Exception -> L4af
            r7 = r7 ^ (-477(0xfffffffffffffe23, float:NaN))
            r8 = 714(0x2ca, float:1.0E-42)
            java.lang.String r3 = androidx.drawerlayout.C1077.m1343(r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L49e java.lang.Exception -> L4af
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L49e java.lang.Exception -> L4af
            java.net.URLConnection r2 = androidx.loader.C1094.m2492(r2)     // Catch: java.lang.Throwable -> L49e java.lang.Exception -> L4af
            r0 = r2
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L49e java.lang.Exception -> L4af
            r9 = r0
            int r2 = androidx.interpolator.C1081.f107
            r2 = r2 ^ (-15249(0xffffffffffffc46f, float:NaN))
            androidx.lifecycle.process.C1087.m2000(r9, r2)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            androidx.loader.C1094.m2450(r9, r2)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r2 = 0
            androidx.startup.C1100.m2937(r9, r2)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r2 = 1
            androidx.appcompat.resources.C1068.m625(r9, r2)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r2 = 1
            androidx.activity.C1066.m501(r9, r2)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r3 = 696(0x2b8, float:9.75E-43)
            int r5 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = r5 ^ 136(0x88, float:1.9E-43)
            r7 = 1875(0x753, float:2.627E-42)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8576(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            androidx.versionedparcelable.C1107.m3434(r9, r2)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r3 = 700(0x2bc, float:9.81E-43)
            int r5 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = r5 ^ (-106(0xffffffffffffff96, float:NaN))
            r7 = 998(0x3e6, float:1.398E-42)
            java.lang.String r2 = androidx.loader.C1099.m2843(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r3 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = 712(0x2c8, float:9.98E-43)
            int r7 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r7 = r7 ^ (-986(0xfffffffffffffc26, float:NaN))
            r8 = 3150(0xc4e, float:4.414E-42)
            java.lang.String r3 = kevin.fun.hook.webdav.C1118.m8509(r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            androidx.activity.C1064.m355(r9, r2, r3)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r3 = 743(0x2e7, float:1.041E-42)
            int r5 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = r5 ^ (-52)
            r7 = 1883(0x75b, float:2.639E-42)
            java.lang.String r2 = androidx.loader.C1094.m2495(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r3 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = 749(0x2ed, float:1.05E-42)
            int r7 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r7 = r7 ^ (-127(0xffffffffffffff81, float:NaN))
            r8 = 1569(0x621, float:2.199E-42)
            java.lang.String r3 = androidx.appcompat.C1069.m751(r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            androidx.activity.C1064.m355(r9, r2, r3)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r3 = 765(0x2fd, float:1.072E-42)
            int r5 = androidx.lifecycle.process.C1088.f114     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = r5 ^ (-102(0xffffffffffffff9a, float:NaN))
            r7 = 1412(0x584, float:1.979E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            androidx.activity.C1064.m355(r9, r2, r12)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r3 = 772(0x304, float:1.082E-42)
            int r5 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = r5 ^ 364(0x16c, float:5.1E-43)
            r7 = 2153(0x869, float:3.017E-42)
            java.lang.String r2 = androidx.interpolator.C1083.m1723(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r3 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = 782(0x30e, float:1.096E-42)
            int r7 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r7 = r7 ^ (-80)
            r8 = 2083(0x823, float:2.919E-42)
            java.lang.String r3 = androidx.vectordrawable.C1103.m3132(r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            androidx.activity.C1064.m355(r9, r2, r3)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r3 = 787(0x313, float:1.103E-42)
            int r5 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = r5 ^ 134(0x86, float:1.88E-43)
            r7 = 885(0x375, float:1.24E-42)
            java.lang.String r2 = androidx.interpolator.C1081.m1616(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            short[] r3 = m7265()     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r5 = 797(0x31d, float:1.117E-42)
            int r7 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r7 = r7 ^ 224(0xe0, float:3.14E-43)
            r8 = 2583(0xa17, float:3.62E-42)
            java.lang.String r3 = androidx.drawerlayout.C1077.m1343(r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            androidx.activity.C1064.m355(r9, r2, r3)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            java.lang.String r2 = androidx.viewpager.C1108.m3553(r13)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            byte[] r3 = androidx.emoji2.C1080.m1526(r2, r12)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            int r2 = r3.length     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            dev.rikka.ndk.thirdparty.libcxx.C1110.m3677(r9, r2)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            r2 = 0
            java.io.OutputStream r2 = androidx.lifecycle.process.C1087.m1958(r9)     // Catch: java.lang.Throwable -> L3eb
            kevin.fun.hook.audio.C1115.m8009(r2, r3)     // Catch: java.lang.Throwable -> L3db
            androidx.drawerlayout.C1077.m1331(r2)     // Catch: java.lang.Throwable -> L3db
            r3 = 51588(0xc984, float:7.229E-41)
        L22c:
            r5 = 51605(0xc995, float:7.2314E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L234;
                case 54: goto L23a;
                case 87: goto L24c;
                case 116: goto L23e;
                default: goto L233;
            }
        L233:
            goto L22c
        L234:
            if (r2 == 0) goto L23a
            r3 = 51681(0xc9e1, float:7.242E-41)
            goto L22c
        L23a:
            r3 = 51650(0xc9c2, float:7.2377E-41)
            goto L22c
        L23e:
            androidx.lifecycle.process.C1091.m2267(r2)     // Catch: java.lang.Throwable -> L5ce
            r2 = 51712(0xca00, float:7.2464E-41)
        L244:
            r3 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L24c;
                case 15: goto L24b;
                case 16: goto L24b;
                case 17: goto L2bd;
                default: goto L24b;
            }
        L24b:
            goto L244
        L24c:
            int r3 = androidx.loader.C1094.m57(r9)     // Catch: java.lang.Throwable -> L435 java.lang.Exception -> L48e
            java.lang.String r5 = m7248(r9, r3)     // Catch: java.lang.Exception -> L3cb java.lang.Throwable -> L435
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r2.<init>()     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            short[] r7 = m7265()     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r8 = 832(0x340, float:1.166E-42)
            int r14 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r14 = r14 ^ (-384(0xfffffffffffffe80, float:NaN))
            r15 = 2668(0xa6c, float:3.739E-42)
            java.lang.String r7 = androidx.customview.C1075.m1138(r7, r8, r14, r15)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r7)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r10)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            short[] r7 = m7265()     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r8 = 853(0x355, float:1.195E-42)
            int r14 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r14 = r14 ^ (-123(0xffffffffffffff85, float:NaN))
            r15 = 1679(0x68f, float:2.353E-42)
            java.lang.String r7 = androidx.annotation.experimental.C1067.m581(r7, r8, r14, r15)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r7)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r3)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            short[] r7 = m7265()     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r8 = 868(0x364, float:1.216E-42)
            int r14 = androidx.core.C1072.f98     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r14 = r14 ^ (-537(0xfffffffffffffde7, float:NaN))
            r15 = 2308(0x904, float:3.234E-42)
            java.lang.String r7 = androidx.loader.C1098.m2787(r7, r8, r14, r15)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r7)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r5)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            m7259(r2)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            boolean r7 = androidx.documentfile.C1076.m1246(r5)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r2 = 51836(0xca7c, float:7.2638E-41)
        L2af:
            r8 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 241: goto L2b7;
                case 1963: goto L2c1;
                case 1992: goto L384;
                case 2025: goto L2c5;
                default: goto L2b6;
            }     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
        L2b6:
            goto L2af
        L2b7:
            if (r7 != 0) goto L2c1
            r2 = 52580(0xcd64, float:7.368E-41)
            goto L2af
        L2bd:
            r2 = 51743(0xca1f, float:7.2507E-41)
            goto L244
        L2c1:
            r2 = 52549(0xcd45, float:7.3637E-41)
            goto L2af
        L2c5:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r2.<init>(r5)     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            kevin.fun.hook.PPHook$ActivateResult r3 = new kevin.fun.hook.PPHook$ActivateResult     // Catch: java.lang.Exception -> L3bb java.lang.Throwable -> L435
            r5 = 0
            r3.<init>(r5)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            short[] r5 = m7265()     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r7 = 875(0x36b, float:1.226E-42)
            int r8 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r8 = r8 ^ 17
            r14 = 1073(0x431, float:1.504E-42)
            java.lang.String r5 = org.luckypray.dexkit.C1125.m10615(r5, r7, r8, r14)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r7 = 0
            boolean r5 = org.luckypray.dexkit.C1123.m10529(r2, r5, r7)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r3.f59ok = r5     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            short[] r5 = m7265()     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r7 = 877(0x36d, float:1.229E-42)
            int r8 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r8 = r8 ^ 79
            r14 = 2573(0xa0d, float:3.606E-42)
            java.lang.String r5 = org.luckypray.dexkit.C1123.m10510(r5, r7, r8, r14)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            java.lang.String r5 = androidx.loader.C1095.m2550(r2, r5, r11)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r3.status = r5     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            short[] r5 = m7265()     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r7 = 883(0x373, float:1.237E-42)
            int r8 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r8 = r8 ^ 523(0x20b, float:7.33E-43)
            r14 = 978(0x3d2, float:1.37E-42)
            java.lang.String r5 = androidx.core.ktx.C1071.m874(r5, r7, r8, r14)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r7 = 0
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3675(r2, r5, r7)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r3.count = r5     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            short[] r5 = m7265()     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r7 = 888(0x378, float:1.244E-42)
            int r8 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r8 = r8 ^ 598(0x256, float:8.38E-43)
            r14 = 1423(0x58f, float:1.994E-42)
            java.lang.String r5 = androidx.appcompat.resources.C1068.m652(r5, r7, r8, r14)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            java.lang.String r2 = androidx.loader.C1095.m2550(r2, r5, r11)     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r3.error = r2     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            android.os.Handler r14 = m7262()     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda7 r2 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda7     // Catch: java.lang.Exception -> L374 java.lang.Throwable -> L435
            r5 = r18
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            androidx.activity.C1062.m178(r14, r2)     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            r2 = 52611(0xcd83, float:7.3724E-41)
        L33f:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 23: goto L347;
                case 54: goto L34d;
                case 85: goto L35f;
                case 116: goto L351;
                default: goto L346;
            }
        L346:
            goto L33f
        L347:
            if (r9 == 0) goto L34d
            r2 = 52704(0xcde0, float:7.3854E-41)
            goto L33f
        L34d:
            r2 = 52673(0xcdc1, float:7.381E-41)
            goto L33f
        L351:
            androidx.emoji2.C1080.m1546(r9)     // Catch: java.lang.Throwable -> L364
        L354:
            r2 = 52735(0xcdff, float:7.3897E-41)
        L357:
            r3 = 52752(0xce10, float:7.3921E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L35f;
                case 1007: goto L360;
                default: goto L35e;
            }
        L35e:
            goto L357
        L35f:
            return
        L360:
            r2 = 52766(0xce1e, float:7.3941E-41)
            goto L357
        L364:
            r2 = move-exception
            r2 = 53510(0xd106, float:7.4983E-41)
        L368:
            r3 = 53527(0xd117, float:7.5007E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L370;
                case 50: goto L354;
                default: goto L36f;
            }
        L36f:
            goto L368
        L370:
            r2 = 53541(0xd125, float:7.5027E-41)
            goto L368
        L374:
            r2 = move-exception
            r3 = 53634(0xd182, float:7.5157E-41)
        L378:
            r5 = 53651(0xd193, float:7.5181E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L380;
                case 50: goto L4b1;
                default: goto L37f;
            }
        L37f:
            goto L378
        L380:
            r3 = 53665(0xd1a1, float:7.52E-41)
            goto L378
        L384:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            r5.<init>()     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            short[] r7 = m7265()     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            r8 = 893(0x37d, float:1.251E-42)
            int r14 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            r14 = r14 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r15 = 2831(0xb0f, float:3.967E-42)
            java.lang.String r7 = androidx.customview.C1074.m1116(r7, r8, r14, r15)     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r7)     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            java.lang.StringBuilder r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r3)     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
            throw r2     // Catch: java.lang.Exception -> L3ab java.lang.Throwable -> L425
        L3ab:
            r2 = move-exception
            r3 = 53758(0xd1fe, float:7.5331E-41)
        L3af:
            r5 = 53775(0xd20f, float:7.5355E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 1009: goto L3b7;
                case 1703: goto L4b1;
                default: goto L3b6;
            }
        L3b6:
            goto L3af
        L3b7:
            r3 = 54440(0xd4a8, float:7.6287E-41)
            goto L3af
        L3bb:
            r2 = move-exception
            r3 = 54533(0xd505, float:7.6417E-41)
        L3bf:
            r5 = 54550(0xd516, float:7.6441E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 19: goto L3c7;
                case 50: goto L4b1;
                default: goto L3c6;
            }
        L3c6:
            goto L3bf
        L3c7:
            r3 = 54564(0xd524, float:7.646E-41)
            goto L3bf
        L3cb:
            r2 = move-exception
            r3 = 54657(0xd581, float:7.6591E-41)
        L3cf:
            r5 = 54674(0xd592, float:7.6615E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 19: goto L3d7;
                case 50: goto L4b1;
                default: goto L3d6;
            }
        L3d6:
            goto L3cf
        L3d7:
            r3 = 54688(0xd5a0, float:7.6634E-41)
            goto L3cf
        L3db:
            r3 = move-exception
            r5 = 55432(0xd888, float:7.7677E-41)
        L3df:
            r7 = 55449(0xd899, float:7.77E-41)
            r5 = r5 ^ r7
            switch(r5) {
                case 17: goto L3e7;
                case 62: goto L3ec;
                default: goto L3e6;
            }
        L3e6:
            goto L3df
        L3e7:
            r5 = 55463(0xd8a7, float:7.772E-41)
            goto L3df
        L3eb:
            r3 = move-exception
        L3ec:
            r5 = 55556(0xd904, float:7.785E-41)
        L3ef:
            r7 = 55573(0xd915, float:7.7874E-41)
            r5 = r5 ^ r7
            switch(r5) {
                case 17: goto L3f7;
                case 54: goto L3fd;
                case 87: goto L414;
                case 116: goto L401;
                default: goto L3f6;
            }
        L3f6:
            goto L3ef
        L3f7:
            if (r2 == 0) goto L3fd
            r5 = 55649(0xd961, float:7.7981E-41)
            goto L3ef
        L3fd:
            r5 = 55618(0xd942, float:7.7937E-41)
            goto L3ef
        L401:
            androidx.lifecycle.process.C1091.m2267(r2)     // Catch: java.lang.Throwable -> L413
            r2 = 55680(0xd980, float:7.8024E-41)
        L407:
            r5 = 55697(0xd991, float:7.8048E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L40f;
                case 1467: goto L414;
                default: goto L40e;
            }
        L40e:
            goto L407
        L40f:
            r2 = 56362(0xdc2a, float:7.898E-41)
            goto L407
        L413:
            r2 = move-exception
        L414:
            throw r3     // Catch: java.lang.Exception -> L415 java.lang.Throwable -> L425
        L415:
            r2 = move-exception
            r3 = 56579(0xdd03, float:7.9284E-41)
        L419:
            r5 = 56596(0xdd14, float:7.9308E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 23: goto L421;
                case 54: goto L4b1;
                default: goto L420;
            }
        L420:
            goto L419
        L421:
            r3 = 56610(0xdd22, float:7.9328E-41)
            goto L419
        L425:
            r2 = move-exception
            r3 = 56455(0xdc87, float:7.911E-41)
        L429:
            r4 = 56472(0xdc98, float:7.9134E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 31: goto L431;
                case 62: goto L441;
                default: goto L430;
            }
        L430:
            goto L429
        L431:
            r3 = 56486(0xdca6, float:7.9154E-41)
            goto L429
        L435:
            r2 = move-exception
            r3 = 1507503(0x1700af, float:2.112462E-39)
        L439:
            r4 = 1507520(0x1700c0, float:2.112485E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 14: goto L441;
                case 111: goto L48a;
                default: goto L440;
            }
        L440:
            goto L439
        L441:
            java.lang.String r3 = androidx.lifecycle.process.C1091.m2254(r2)     // Catch: java.lang.Throwable -> L595
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L595
            r4.<init>()     // Catch: java.lang.Throwable -> L595
            short[] r5 = m7265()     // Catch: java.lang.Throwable -> L595
            r6 = 926(0x39e, float:1.298E-42)
            int r7 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L595
            r7 = r7 ^ 817(0x331, float:1.145E-42)
            r8 = 2207(0x89f, float:3.093E-42)
            java.lang.String r5 = androidx.drawerlayout.C1077.m1343(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L595
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)     // Catch: java.lang.Throwable -> L595
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)     // Catch: java.lang.Throwable -> L595
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L595
            m7259(r3)     // Catch: java.lang.Throwable -> L595
            android.os.Handler r3 = m7262()     // Catch: java.lang.Throwable -> L595
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda9 r4 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda9     // Catch: java.lang.Throwable -> L595
            r0 = r16
            r1 = r17
            r4.<init>(r0, r2, r1)     // Catch: java.lang.Throwable -> L595
            androidx.activity.C1062.m178(r3, r4)     // Catch: java.lang.Throwable -> L595
            r2 = 1510572(0x170cac, float:2.116762E-39)
        L47c:
            r3 = 1510589(0x170cbd, float:2.116786E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L484;
                case 87: goto L35f;
                case 118: goto L56e;
                case 809: goto L573;
                default: goto L483;
            }
        L483:
            goto L47c
        L484:
            if (r9 == 0) goto L56e
            r2 = 1511316(0x170f94, float:2.117805E-39)
            goto L47c
        L48a:
            r3 = 1507534(0x1700ce, float:2.112505E-39)
            goto L439
        L48e:
            r2 = move-exception
            r3 = 1507627(0x17012b, float:2.112635E-39)
        L492:
            r5 = 1507644(0x17013c, float:2.112659E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 23: goto L49a;
                case 118: goto L4b1;
                default: goto L499;
            }
        L499:
            goto L492
        L49a:
            r3 = 1507658(0x17014a, float:2.112679E-39)
            goto L492
        L49e:
            r2 = move-exception
            r9 = 0
            r3 = 1507751(0x1701a7, float:2.112809E-39)
        L4a3:
            r4 = 1507768(0x1701b8, float:2.112833E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 31: goto L4ab;
                case 1513: goto L441;
                default: goto L4aa;
            }
        L4aa:
            goto L4a3
        L4ab:
            r3 = 1508433(0x170451, float:2.113765E-39)
            goto L4a3
        L4af:
            r2 = move-exception
            r9 = 0
        L4b1:
            java.lang.String r3 = androidx.lifecycle.process.C1091.m2254(r2)     // Catch: java.lang.Throwable -> L5d1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d1
            r5.<init>()     // Catch: java.lang.Throwable -> L5d1
            short[] r7 = m7265()     // Catch: java.lang.Throwable -> L5d1
            r8 = 907(0x38b, float:1.271E-42)
            int r14 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L5d1
            r14 = r14 ^ (-459(0xfffffffffffffe35, float:NaN))
            r15 = 2879(0xb3f, float:4.034E-42)
            java.lang.String r7 = org.luckypray.dexkit.C1124.m10545(r7, r8, r14, r15)     // Catch: java.lang.Throwable -> L5d1
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r7)     // Catch: java.lang.Throwable -> L5d1
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r10)     // Catch: java.lang.Throwable -> L5d1
            short[] r7 = m7265()     // Catch: java.lang.Throwable -> L5d1
            r8 = 921(0x399, float:1.29E-42)
            int r14 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L5d1
            r14 = r14 ^ 903(0x387, float:1.265E-42)
            r15 = 2871(0xb37, float:4.023E-42)
            java.lang.String r7 = androidx.core.ktx.C1070.m788(r7, r8, r14, r15)     // Catch: java.lang.Throwable -> L5d1
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r7)     // Catch: java.lang.Throwable -> L5d1
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r5, r3)     // Catch: java.lang.Throwable -> L5d1
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L5d1
            m7259(r3)     // Catch: java.lang.Throwable -> L5d1
            r3 = 1508526(0x1704ae, float:2.113895E-39)
        L4f4:
            r5 = 1508543(0x1704bf, float:2.113919E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L4fc;
                case 83: goto L528;
                case 114: goto L502;
                case 436: goto L506;
                default: goto L4fb;
            }
        L4fb:
            goto L4f4
        L4fc:
            if (r9 == 0) goto L502
            r3 = 1508619(0x17050b, float:2.114025E-39)
            goto L4f4
        L502:
            r3 = 1508588(0x1704ec, float:2.113982E-39)
            goto L4f4
        L506:
            androidx.emoji2.C1080.m1546(r9)     // Catch: java.lang.Throwable -> L518
        L509:
            r3 = 1508650(0x17052a, float:2.114069E-39)
        L50c:
            r5 = 1508667(0x17053b, float:2.114093E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L514;
                case 114: goto L528;
                default: goto L513;
            }
        L513:
            goto L50c
        L514:
            r3 = 1508681(0x170549, float:2.114112E-39)
            goto L50c
        L518:
            r3 = move-exception
            r3 = 1509425(0x170831, float:2.115155E-39)
        L51c:
            r5 = 1509442(0x170842, float:2.115179E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 18: goto L509;
                case 115: goto L524;
                default: goto L523;
            }
        L523:
            goto L51c
        L524:
            r3 = 1509456(0x170850, float:2.115198E-39)
            goto L51c
        L528:
            r3 = 1509549(0x1708ad, float:2.115329E-39)
        L52b:
            r5 = 1509566(0x1708be, float:2.115353E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 19: goto L533;
                case 85: goto L557;
                case 114: goto L53a;
                case 436: goto L53e;
                default: goto L532;
            }
        L532:
            goto L52b
        L533:
            r3 = 2
            if (r10 >= r3) goto L53a
            r3 = 1509642(0x17090a, float:2.115459E-39)
            goto L52b
        L53a:
            r3 = 1509611(0x1708eb, float:2.115416E-39)
            goto L52b
        L53e:
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            long r8 = (long) r3
            r14 = 429(0x1ad, double:2.12E-321)
            long r8 = r8 ^ r14
            androidx.vectordrawable.C1105.m3252(r8)     // Catch: java.lang.Throwable -> L556
            r3 = 1509673(0x170929, float:2.115502E-39)
        L54a:
            r5 = 1509690(0x17093a, float:2.115526E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 19: goto L552;
                case 745: goto L557;
                default: goto L551;
            }
        L551:
            goto L54a
        L552:
            r3 = 1510355(0x170bd3, float:2.116458E-39)
            goto L54a
        L556:
            r3 = move-exception
        L557:
            int r3 = kevin.fun.hook.audio.C1116.f405
            r3 = r3 ^ 83
            int r3 = r3 + r10
            r5 = 1510448(0x170c30, float:2.116588E-39)
        L55f:
            r7 = 1510465(0x170c41, float:2.116612E-39)
            r5 = r5 ^ r7
            switch(r5) {
                case 14: goto L567;
                case 113: goto L56a;
                default: goto L566;
            }
        L566:
            goto L55f
        L567:
            r10 = r3
            goto L9c
        L56a:
            r5 = 1510479(0x170c4f, float:2.116632E-39)
            goto L55f
        L56e:
            r2 = 1510634(0x170cea, float:2.116849E-39)
            goto L47c
        L573:
            androidx.emoji2.C1080.m1546(r9)     // Catch: java.lang.Throwable -> L585
        L576:
            r2 = 1511347(0x170fb3, float:2.117848E-39)
        L579:
            r3 = 1511364(0x170fc4, float:2.117872E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto L35f;
                case 119: goto L581;
                default: goto L580;
            }
        L580:
            goto L579
        L581:
            r2 = 1511378(0x170fd2, float:2.117892E-39)
            goto L579
        L585:
            r2 = move-exception
            r2 = 1511471(0x17102f, float:2.118022E-39)
        L589:
            r3 = 1511488(0x171040, float:2.118046E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L576;
                case 111: goto L591;
                default: goto L590;
            }
        L590:
            goto L589
        L591:
            r2 = 1511502(0x17104e, float:2.118065E-39)
            goto L589
        L595:
            r2 = move-exception
            r3 = 1511595(0x1710ab, float:2.118196E-39)
        L599:
            r4 = 1511612(0x1710bc, float:2.11822E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto L5a1;
                case 815: goto L5ab;
                case 968: goto L5b9;
                case 1001: goto L5a7;
                default: goto L5a0;
            }
        L5a0:
            goto L599
        L5a1:
            if (r9 == 0) goto L5a7
            r3 = 1512339(0x171393, float:2.119238E-39)
            goto L599
        L5a7:
            r3 = 1512308(0x171374, float:2.119195E-39)
            goto L599
        L5ab:
            androidx.emoji2.C1080.m1546(r9)     // Catch: java.lang.Throwable -> L5be
        L5ae:
            r3 = 1512370(0x1713b2, float:2.119282E-39)
        L5b1:
            r4 = 1512387(0x1713c3, float:2.119306E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 18: goto L5b9;
                case 113: goto L5ba;
                default: goto L5b8;
            }
        L5b8:
            goto L5b1
        L5b9:
            throw r2
        L5ba:
            r3 = 1512401(0x1713d1, float:2.119325E-39)
            goto L5b1
        L5be:
            r3 = move-exception
            r3 = 1512494(0x17142e, float:2.119456E-39)
        L5c2:
            r4 = 1512511(0x17143f, float:2.11948E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L5ca;
                case 114: goto L5ae;
                default: goto L5c9;
            }
        L5c9:
            goto L5c2
        L5ca:
            r3 = 1512525(0x17144d, float:2.119499E-39)
            goto L5c2
        L5ce:
            r2 = move-exception
            goto L24c
        L5d1:
            r2 = move-exception
            goto L441
    }

    static /* synthetic */ void lambda$12(android.content.Context r8, kevin.fun.hook.PPHook.VerifyCallback r9) {
            r1 = 0
            r6 = 0
            java.lang.String r4 = "ۦۥۦ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56387: goto L14;
                case 56505: goto L5f;
                case 1746967: goto L29;
                case 1748617: goto L2f;
                case 1748832: goto L63;
                case 1751742: goto L1b;
                case 1751775: goto L23;
                case 1753513: goto L3d;
                case 1753603: goto L5b;
                case 1753607: goto L67;
                case 1754476: goto L49;
                case 1754501: goto L6e;
                case 1755338: goto L72;
                case 1755433: goto L37;
                case 1755437: goto L55;
                default: goto L10;
            }
        L10:
            java.lang.String r1 = "ۣۧۡ"
            r4 = r1
            goto L9
        L14:
            m7260(r8, r0, r2, r6, r9)
            java.lang.String r1 = "ۨ۟ۡ"
            r4 = r1
            goto L9
        L1b:
            short[] r1 = m7265()
            java.lang.String r4 = "ۣۨۢ"
            r3 = r1
            goto L9
        L23:
            r5 = r7 ^ (-271(0xfffffffffffffef1, float:NaN))
            java.lang.String r1 = "ۦۢۥ"
            r4 = r1
            goto L9
        L29:
            int r7 = androidx.core.C1072.f98
            java.lang.String r1 = "ۨۢۧ"
            r4 = r1
            goto L9
        L2f:
            short[] r1 = m7265()
            java.lang.String r4 = "۟ۨ۠"
            r3 = r1
            goto L9
        L37:
            int r7 = androidx.startup.C1100.f126
            java.lang.String r1 = "ۣۤۨ"
            r4 = r1
            goto L9
        L3d:
            r1 = 953(0x3b9, float:1.335E-42)
            r2 = 3091(0xc13, float:4.331E-42)
            java.lang.String r1 = kevin.fun.hook.audio.C1114.m7940(r3, r1, r5, r2)
            java.lang.String r4 = "ۢۥ"
            r2 = r1
            goto L9
        L49:
            r0 = 945(0x3b1, float:1.324E-42)
            r1 = 408(0x198, float:5.72E-43)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8576(r3, r0, r5, r1)
            java.lang.String r1 = "ۤۧۡ"
            r4 = r1
            goto L9
        L55:
            r5 = r7 ^ (-536(0xfffffffffffffde8, float:NaN))
            java.lang.String r1 = "ۧۢۧ"
            r4 = r1
            goto L9
        L5b:
            java.lang.String r1 = "ۢۦ۟"
            r4 = r1
            goto L9
        L5f:
            java.lang.String r1 = "ۡۦۥ"
            r4 = r1
            goto L9
        L63:
            java.lang.String r1 = "ۡ۟ۧ"
            r4 = r1
            goto L9
        L67:
            m7263()
            java.lang.String r1 = "ۦۥۢ"
            r4 = r1
            goto L9
        L6e:
            java.lang.String r1 = "ۦ۟"
            r4 = r1
            goto L9
        L72:
            return
    }

    static /* synthetic */ void lambda$13(kevin.fun.hook.PPHook.ActivateResult r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, android.content.Context r10, kevin.fun.hook.PPHook.VerifyCallback r11) {
            r5 = 0
            m7263()
            boolean r1 = m7242(r6)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L131;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r1 == 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            short[] r0 = m7265()
            r1 = 980(0x3d4, float:1.373E-42)
            int r2 = androidx.interpolator.C1083.f109
            r2 = r2 ^ (-448(0xfffffffffffffe40, float:NaN))
            r3 = 1161(0x489, float:1.627E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r1, r2, r3)
            java.lang.String r1 = m7251(r6)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            short[] r0 = m7265()
            r2 = 982(0x3d6, float:1.376E-42)
            int r3 = androidx.vectordrawable.C1104.f130
            r3 = r3 ^ 596(0x254, float:8.35E-43)
            r4 = 2999(0xbb7, float:4.202E-42)
            java.lang.String r2 = androidx.loader.C1098.m2787(r0, r2, r3, r4)
            r0 = 1740(0x6cc, float:2.438E-42)
        L42:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L48;
                case 54: goto L4d;
                case 471: goto L6a;
                case 500: goto L50;
                default: goto L47;
            }
        L47:
            goto L42
        L48:
            if (r1 != 0) goto L4d
            r0 = 1833(0x729, float:2.569E-42)
            goto L42
        L4d:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L42
        L50:
            java.lang.String r0 = m7251(r6)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r2, r0)
            r0 = 1864(0x748, float:2.612E-42)
        L5a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L60;
                case 47384: goto L131;
                case 47417: goto L6a;
                case 47483: goto L66;
                default: goto L5f;
            }
        L5f:
            goto L5a
        L60:
            if (r1 == 0) goto L66
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L5a
        L66:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L5a
        L6a:
            m7246(r7)
            short[] r0 = m7265()
            r1 = 989(0x3dd, float:1.386E-42)
            int r3 = androidx.appcompat.C1069.f95
            r3 = r3 ^ (-228(0xffffffffffffff1c, float:NaN))
            r4 = 2878(0xb3e, float:4.033E-42)
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1413(r0, r1, r3, r4)
            androidx.core.C1073.m1055(r0, r8)
            java.lang.String r0 = m7251(r6)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r2, r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L8b:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L93;
                case 45: goto Ldf;
                case 76: goto L9d;
                case 239: goto L97;
                default: goto L92;
            }
        L92:
            goto L8b
        L93:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L8b
        L97:
            if (r1 == 0) goto L93
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L8b
        L9d:
            short[] r0 = m7265()
            r1 = 1004(0x3ec, float:1.407E-42)
            int r2 = androidx.documentfile.C1076.f102
            r2 = r2 ^ (-587(0xfffffffffffffdb5, float:NaN))
            r3 = 1610(0x64a, float:2.256E-42)
            java.lang.String r0 = androidx.viewpager.C1108.m3518(r0, r1, r2, r3)
            r1 = 48891(0xbefb, float:6.8511E-41)
        Lb0:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto Lb8;
                case 503: goto Ldb;
                default: goto Lb7;
            }
        Lb7:
            goto Lb0
        Lb8:
            short[] r1 = m7265()
            r2 = 1052(0x41c, float:1.474E-42)
            int r3 = androidx.loader.C1097.f123
            r3 = r3 ^ 116(0x74, float:1.63E-43)
            r4 = 744(0x2e8, float:1.043E-42)
            java.lang.String r1 = androidx.emoji2.C1080.m1525(r1, r2, r3, r4)
            r2 = 1
            m7260(r10, r1, r0, r2, r11)
            r0 = 49666(0xc202, float:6.9597E-41)
        Lcf:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto Ld7;
                case 50: goto L1bc;
                default: goto Ld6;
            }
        Ld6:
            goto Lcf
        Ld7:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Lcf
        Ldb:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto Lb0
        Ldf:
            int r0 = m7250(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 1023(0x3ff, float:1.434E-42)
            int r4 = androidx.vectordrawable.C1105.f131
            r4 = r4 ^ 360(0x168, float:5.04E-43)
            r5 = 706(0x2c2, float:9.9E-43)
            java.lang.String r2 = androidx.interpolator.C1081.m1616(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r9)
            short[] r2 = m7265()
            r3 = 1037(0x40d, float:1.453E-42)
            int r4 = androidx.activity.C1065.f91
            r4 = r4 ^ (-58)
            r5 = 1545(0x609, float:2.165E-42)
            java.lang.String r2 = androidx.loader.C1095.m2574(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r1, r0)
            short[] r1 = m7265()
            r2 = 1050(0x41a, float:1.471E-42)
            int r3 = kevin.fun.hook.audio.C1114.f403
            r3 = r3 ^ (-18)
            r4 = 3086(0xc0e, float:4.324E-42)
            java.lang.String r1 = androidx.lifecycle.viewmodel.C1093.m2415(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            goto Lb8
        L131:
            short[] r0 = m7265()
            r1 = 1058(0x422, float:1.483E-42)
            int r2 = androidx.loader.C1098.f124
            r2 = r2 ^ (-808(0xfffffffffffffcd8, float:NaN))
            r3 = 1776(0x6f0, float:2.489E-42)
            java.lang.String r0 = androidx.startup.C1101.m3014(r0, r1, r2, r3)
            java.lang.String r1 = m7251(r6)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            short[] r0 = m7265()
            r2 = 1063(0x427, float:1.49E-42)
            int r3 = androidx.lifecycle.process.C1088.f114
            r3 = r3 ^ (-101(0xffffffffffffff9b, float:NaN))
            r4 = 1781(0x6f5, float:2.496E-42)
            java.lang.String r2 = androidx.activity.C1065.m410(r0, r2, r3, r4)
            r0 = 49790(0xc27e, float:6.977E-41)
        L15c:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 18: goto L164;
                case 51: goto L1d5;
                case 84: goto L16e;
                case 241: goto L168;
                default: goto L163;
            }
        L163:
            goto L15c
        L164:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L15c
        L168:
            if (r1 == 0) goto L164
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L15c
        L16e:
            java.lang.String r0 = m7257(r6)
            boolean r1 = androidx.documentfile.C1076.m1246(r0)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L179:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 497: goto L181;
                case 1711: goto L187;
                case 1736: goto L19e;
                case 1769: goto L18b;
                default: goto L180;
            }
        L180:
            goto L179
        L181:
            if (r1 != 0) goto L187
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L179
        L187:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L179
        L18b:
            java.lang.String r0 = m7257(r6)
            r1 = 50689(0xc601, float:7.103E-41)
        L192:
            r3 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 19: goto L19a;
                case 50: goto L1ae;
                default: goto L199;
            }
        L199:
            goto L192
        L19a:
            r1 = 50720(0xc620, float:7.1074E-41)
            goto L192
        L19e:
            short[] r0 = m7265()
            r1 = 1069(0x42d, float:1.498E-42)
            int r3 = org.luckypray.dexkit.C1123.f433
            r3 = r3 ^ (-970(0xfffffffffffffc36, float:NaN))
            r4 = 516(0x204, float:7.23E-43)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r1, r3, r4)
        L1ae:
            m7260(r10, r2, r0, r5, r11)
            r0 = 50813(0xc67d, float:7.1204E-41)
        L1b4:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L1bc;
                case 243: goto L1d1;
                default: goto L1bb;
            }
        L1bb:
            goto L1b4
        L1bc:
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
            r0 = 51836(0xca7c, float:7.2638E-41)
        L1c3:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 241: goto L1cb;
                case 1963: goto L21a;
                case 1992: goto L22d;
                case 2025: goto L21e;
                default: goto L1ca;
            }
        L1ca:
            goto L1c3
        L1cb:
            if (r1 > 0) goto L21a
            r0 = 52580(0xcd64, float:7.368E-41)
            goto L1c3
        L1d1:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L1b4
        L1d5:
            java.lang.String r0 = m7257(r6)
            boolean r1 = androidx.documentfile.C1076.m1246(r0)
            r0 = 51588(0xc984, float:7.229E-41)
        L1e0:
            r3 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L1e8;
                case 54: goto L1ee;
                case 87: goto L209;
                case 116: goto L1f2;
                default: goto L1e7;
            }
        L1e7:
            goto L1e0
        L1e8:
            if (r1 != 0) goto L1ee
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L1e0
        L1ee:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L1e0
        L1f2:
            java.lang.String r0 = m7257(r6)
            r1 = 51712(0xca00, float:7.2464E-41)
        L1f9:
            r3 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L201;
                case 15: goto L200;
                case 16: goto L200;
                case 17: goto L205;
                default: goto L200;
            }
        L200:
            goto L1f9
        L201:
            m7260(r10, r2, r0, r5, r11)
            goto L1bc
        L205:
            r1 = 51743(0xca1f, float:7.2507E-41)
            goto L1f9
        L209:
            short[] r0 = m7265()
            r1 = 1084(0x43c, float:1.519E-42)
            int r3 = androidx.lifecycle.process.C1088.f114
            r3 = r3 ^ (-110(0xffffffffffffff92, float:NaN))
            r4 = 2093(0x82d, float:2.933E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r1, r3, r4)
            goto L201
        L21a:
            r0 = 52549(0xcd45, float:7.3637E-41)
            goto L1c3
        L21e:
            java.lang.String r0 = "DI5jJ"
            java.lang.String r0 = androidx.customview.C1075.m1195(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L22d:
            return
    }

    static /* synthetic */ void lambda$14(android.content.Context r5, java.lang.String r6, kevin.fun.hook.PPHook.VerifyCallback r7) {
            m7263()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m7265()
            r2 = 1099(0x44b, float:1.54E-42)
            int r3 = androidx.startup.C1101.f127
            r3 = r3 ^ 760(0x2f8, float:1.065E-42)
            r4 = 2197(0x895, float:3.079E-42)
            java.lang.String r1 = androidx.activity.C1065.m410(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r6)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            short[] r1 = m7265()
            r2 = 1105(0x451, float:1.548E-42)
            int r3 = androidx.core.C1072.f98
            r3 = r3 ^ (-540(0xfffffffffffffde4, float:NaN))
            r4 = 2787(0xae3, float:3.905E-42)
            java.lang.String r1 = androidx.appcompat.resources.C1068.m652(r1, r2, r3, r4)
            r2 = 0
            m7260(r5, r1, r0, r2, r7)
            int r1 = androidx.activity.C1063.m300()
            r0 = 1616(0x650, float:2.264E-42)
        L3e:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L44;
                case 49: goto L47;
                case 204: goto L4c;
                case 239: goto L5b;
                default: goto L43;
            }
        L43:
            goto L3e
        L44:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3e
        L47:
            if (r1 > 0) goto L44
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3e
        L4c:
            java.lang.String r0 = "ftZ3Edlrz"
            java.lang.String r0 = androidx.interpolator.C1082.m1668(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L5b:
            return
    }

    static /* synthetic */ void lambda$15(android.content.Context r10, java.lang.Throwable r11, kevin.fun.hook.PPHook.VerifyCallback r12) {
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۣۣۤ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r8
            r9 = r8
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r1) {
                case 1746873: goto L1a;
                case 1748679: goto L62;
                case 1748680: goto L3d;
                case 1748833: goto L5e;
                case 1749639: goto L68;
                case 1749700: goto L77;
                case 1750539: goto L2d;
                case 1750750: goto L23;
                case 1750752: goto L57;
                case 1751620: goto L70;
                case 1751710: goto L9b;
                case 1751779: goto L47;
                case 1753483: goto L29;
                case 1753669: goto L94;
                case 1754659: goto L4f;
                case 1755460: goto L7f;
                case 1755469: goto L41;
                case 1755557: goto L8b;
                case 1755592: goto L39;
                default: goto L12;
            }
        L12:
            short[] r1 = m7265()
            java.lang.String r6 = "ۣۨۨ"
            r4 = r1
            goto Lb
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "ۣۢۥ"
            r3 = r1
            goto Lb
        L23:
            int r7 = androidx.lifecycle.viewmodel.C1093.f119
            java.lang.String r1 = "ۡۡۧ"
            r6 = r1
            goto Lb
        L29:
            java.lang.String r1 = "ۡۦۦ"
            r6 = r1
            goto Lb
        L2d:
            r1 = 1115(0x45b, float:1.562E-42)
            r2 = 2004(0x7d4, float:2.808E-42)
            java.lang.String r1 = androidx.customview.C1074.m1116(r4, r1, r9, r2)
            java.lang.String r6 = "ۣۦۣ"
            r2 = r1
            goto Lb
        L39:
            java.lang.String r1 = "ۡۡۨ"
            r6 = r1
            goto Lb
        L3d:
            java.lang.String r1 = "۠ۨۢ"
            r6 = r1
            goto Lb
        L41:
            int r7 = org.luckypray.dexkit.C1125.f435
            java.lang.String r1 = "ۦۧۦ"
            r6 = r1
            goto Lb
        L47:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r5)
            java.lang.String r1 = "ۢۡۦ"
            r6 = r1
            goto Lb
        L4f:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r3)
            java.lang.String r6 = "ۨۧۧ"
            r5 = r1
            goto Lb
        L57:
            m7260(r10, r2, r5, r8, r12)
            java.lang.String r1 = "ۤۦ۠"
            r6 = r1
            goto Lb
        L5e:
            java.lang.String r1 = "ۨۦۣ"
            r6 = r1
            goto Lb
        L62:
            r9 = r7 ^ (-116(0xffffffffffffff8c, float:NaN))
            java.lang.String r1 = "ۣۨ۟"
            r6 = r1
            goto Lb
        L68:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r2)
            java.lang.String r6 = "ۧۨۤ"
            r3 = r1
            goto Lb
        L70:
            m7263()
            java.lang.String r1 = "ۦۡۦ"
            r6 = r1
            goto Lb
        L77:
            short[] r1 = m7265()
            java.lang.String r6 = "ۣۦۡ"
            r4 = r1
            goto Lb
        L7f:
            r1 = 1109(0x455, float:1.554E-42)
            r5 = 2728(0xaa8, float:3.823E-42)
            java.lang.String r1 = androidx.activity.C1064.m310(r4, r1, r9, r5)
            java.lang.String r6 = "ۤۨۧ"
            r5 = r1
            goto Lb
        L8b:
            java.lang.String r1 = androidx.lifecycle.process.C1091.m2254(r11)
            java.lang.String r6 = "۟ۥ۟"
            r2 = r1
            goto Lb
        L94:
            r9 = r7 ^ (-231(0xffffffffffffff19, float:NaN))
            java.lang.String r1 = "ۣ۟ۧ"
            r6 = r1
            goto Lb
        L9b:
            return
    }

    static /* synthetic */ void lambda$16(android.content.Context r8, java.lang.String r9) {
            android.app.Dialog r0 = new android.app.Dialog     // Catch: java.lang.Throwable -> Lb5
            r1 = -16973862(0xfffffffffefcffda, float:-1.6814696E38)
            int r2 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> Lb5
            r1 = r1 ^ r2
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> Lb5
            kevin.fun.hook.PPHook.loadingDialog = r0     // Catch: java.lang.Throwable -> Lb5
            android.app.Dialog r0 = m7254()     // Catch: java.lang.Throwable -> Lb5
            r1 = 0
            androidx.lifecycle.runtime.C1092.m2297(r0, r1)     // Catch: java.lang.Throwable -> Lb5
            android.widget.FrameLayout r0 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> Lb5
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lb5
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> Lb5
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> Lb5
            r2 = r2 ^ 933(0x3a5, float:1.307E-42)
            r1.<init>(r2, r2)     // Catch: java.lang.Throwable -> Lb5
            androidx.lifecycle.process.C1091.m2273(r0, r1)     // Catch: java.lang.Throwable -> Lb5
            r1 = -2147483405(0xffffffff800000f3, float:-3.4E-43)
            int r3 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> Lb5
            r1 = r1 ^ r3
            androidx.lifecycle.livedata.C1084.m1783(r0, r1)     // Catch: java.lang.Throwable -> Lb5
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> Lb5
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Lb5
            r3 = 1
            androidx.customview.C1074.m1119(r1, r3)     // Catch: java.lang.Throwable -> Lb5
            int r3 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> Lb5
            r3 = r3 ^ 285(0x11d, float:4.0E-43)
            androidx.emoji2.C1080.m1542(r1, r3)     // Catch: java.lang.Throwable -> Lb5
            r4 = 1107296256(0x42000000, float:32.0)
            int r4 = m7264(r8, r4)     // Catch: java.lang.Throwable -> Lb5
            r5 = 1103101952(0x41c00000, float:24.0)
            int r5 = m7264(r8, r5)     // Catch: java.lang.Throwable -> Lb5
            r6 = 1107296256(0x42000000, float:32.0)
            int r6 = m7264(r8, r6)     // Catch: java.lang.Throwable -> Lb5
            r7 = 1103101952(0x41c00000, float:24.0)
            int r7 = m7264(r8, r7)     // Catch: java.lang.Throwable -> Lb5
            androidx.drawerlayout.C1077.m1314(r1, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb5
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> Lb5
            r5 = 1130102784(0x435c0000, float:220.0)
            int r5 = m7264(r8, r5)     // Catch: java.lang.Throwable -> Lb5
            int r6 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> Lb5
            r6 = r6 ^ (-116(0xffffffffffffff8c, float:NaN))
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> Lb5
            r4.gravity = r3     // Catch: java.lang.Throwable -> Lb5
            androidx.vectordrawable.C1105.m3296(r1, r4)     // Catch: java.lang.Throwable -> Lb5
            r4 = 1094713344(0x41400000, float:12.0)
            int r4 = m7264(r8, r4)     // Catch: java.lang.Throwable -> Lb5
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lb5
            android.graphics.drawable.GradientDrawable r2 = m7268(r2, r4)     // Catch: java.lang.Throwable -> Lb5
            androidx.activity.C1065.m397(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            android.widget.TextView r2 = new android.widget.TextView     // Catch: java.lang.Throwable -> Lb5
            r2.<init>(r8)     // Catch: java.lang.Throwable -> Lb5
            androidx.lifecycle.process.C1087.m1946(r2, r9)     // Catch: java.lang.Throwable -> Lb5
            r4 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r4)     // Catch: java.lang.Throwable -> Lb5
            r4 = -13422146(0xffffffffff3331be, float:-2.3819009E38)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> Lb5
            r4 = r4 ^ r5
            kevin.fun.hook.webdav.C1118.m8517(r2, r4)     // Catch: java.lang.Throwable -> Lb5
            androidx.documentfile.C1076.m1233(r2, r3)     // Catch: java.lang.Throwable -> Lb5
            androidx.activity.C1064.m372(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            androidx.annotation.experimental.C1067.m579(r0, r1)     // Catch: java.lang.Throwable -> Lb5
            android.app.Dialog r1 = m7254()     // Catch: java.lang.Throwable -> Lb5
            androidx.viewpager.C1108.m3545(r1, r0)     // Catch: java.lang.Throwable -> Lb5
            android.app.Dialog r0 = m7254()     // Catch: java.lang.Throwable -> Lb5
            kevin.fun.hook.audio.C1114.m7909(r0)     // Catch: java.lang.Throwable -> Lb5
            r0 = 1616(0x650, float:2.264E-42)
        Lab:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb1;
                case 49: goto Lb2;
                default: goto Lb0;
            }
        Lb0:
            goto Lab
        Lb1:
            return
        Lb2:
            r0 = 1647(0x66f, float:2.308E-42)
            goto Lab
        Lb5:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 1119(0x45f, float:1.568E-42)
            int r4 = androidx.drawerlayout.C1077.f103
            r4 = r4 ^ 276(0x114, float:3.87E-43)
            r5 = 696(0x2b8, float:9.75E-43)
            java.lang.String r2 = androidx.vectordrawable.C1105.m3247(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7259(r0)
            goto Lb1
    }

    static /* synthetic */ void lambda$17() {
            android.app.Dialog r1 = m7254()     // Catch: java.lang.Throwable -> L42
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L6b;
                default: goto Lb;
            }     // Catch: java.lang.Throwable -> L42
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Dialog r0 = m7254()     // Catch: java.lang.Throwable -> L42
            boolean r1 = kevin.fun.hook.webdav.C1118.m8498(r0)     // Catch: java.lang.Throwable -> L42
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L6b;
                case 500: goto L2c;
                default: goto L23;
            }     // Catch: java.lang.Throwable -> L42
        L23:
            goto L1e
        L24:
            if (r1 == 0) goto L29
            r0 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            android.app.Dialog r0 = m7254()     // Catch: java.lang.Throwable -> L42
            androidx.customview.C1074.m1118(r0)     // Catch: java.lang.Throwable -> L42
            r0 = 0
            kevin.fun.hook.PPHook.loadingDialog = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1864(0x748, float:2.612E-42)
        L38:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3e;
                case 47483: goto L6b;
                default: goto L3d;
            }
        L3d:
            goto L38
        L3e:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L38
        L42:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 1129(0x469, float:1.582E-42)
            int r4 = androidx.loader.C1099.f125
            r4 = r4 ^ 849(0x351, float:1.19E-42)
            r5 = 2103(0x837, float:2.947E-42)
            java.lang.String r2 = androidx.vectordrawable.C1104.m3232(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7259(r0)
        L6b:
            return
    }

    static /* synthetic */ void lambda$18(android.content.Context r9, java.lang.String r10, boolean r11, java.lang.String r12, kevin.fun.hook.PPHook.VerifyCallback r13) {
            android.app.Dialog r2 = new android.app.Dialog     // Catch: java.lang.Throwable -> L1bb
            r0 = 16974330(0x10301fa, float:2.4062318E-38)
            int r1 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L1bb
            r0 = r0 ^ r1
            r2.<init>(r9, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 0
            androidx.lifecycle.runtime.C1092.m2297(r2, r0)     // Catch: java.lang.Throwable -> L1bb
            android.widget.FrameLayout r3 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L1bb
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L1bb
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L1bb
            int r1 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L1bb
            r4 = r1 ^ (-767(0xfffffffffffffd01, float:NaN))
            r0.<init>(r4, r4)     // Catch: java.lang.Throwable -> L1bb
            androidx.lifecycle.process.C1091.m2273(r3, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = -2147482695(0xffffffff800003b9, float:-1.335E-42)
            int r1 = androidx.lifecycle.livedata.C1086.f112     // Catch: java.lang.Throwable -> L1bb
            r0 = r0 ^ r1
            androidx.lifecycle.livedata.C1084.m1783(r3, r0)     // Catch: java.lang.Throwable -> L1bb
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L1bb
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1
            androidx.customview.C1074.m1119(r5, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1103101952(0x41c00000, float:24.0)
            int r0 = m7264(r9, r0)     // Catch: java.lang.Throwable -> L1bb
            r1 = 1103101952(0x41c00000, float:24.0)
            int r1 = m7264(r9, r1)     // Catch: java.lang.Throwable -> L1bb
            r6 = 1103101952(0x41c00000, float:24.0)
            int r6 = m7264(r9, r6)     // Catch: java.lang.Throwable -> L1bb
            r7 = 1101004800(0x41a00000, float:20.0)
            int r7 = m7264(r9, r7)     // Catch: java.lang.Throwable -> L1bb
            androidx.drawerlayout.C1077.m1314(r5, r0, r1, r6, r7)     // Catch: java.lang.Throwable -> L1bb
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L1bb
            r1 = 1133576192(0x43910000, float:290.0)
            int r1 = m7264(r9, r1)     // Catch: java.lang.Throwable -> L1bb
            int r6 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L1bb
            r6 = r6 ^ 100
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L1bb
            r1 = 17
            r0.gravity = r1     // Catch: java.lang.Throwable -> L1bb
            androidx.vectordrawable.C1105.m3296(r5, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = m7264(r9, r0)     // Catch: java.lang.Throwable -> L1bb
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L1bb
            android.graphics.drawable.GradientDrawable r0 = m7268(r4, r0)     // Catch: java.lang.Throwable -> L1bb
            androidx.activity.C1065.m397(r5, r0)     // Catch: java.lang.Throwable -> L1bb
            android.widget.TextView r6 = new android.widget.TextView     // Catch: java.lang.Throwable -> L1bb
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L1bb
            androidx.lifecycle.process.C1087.m1946(r6, r10)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1616(0x650, float:2.264E-42)
        L80:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L86;
                case 49: goto L89;
                case 204: goto L8e;
                case 239: goto L9c;
                default: goto L85;
            }     // Catch: java.lang.Throwable -> L1bb
        L85:
            goto L80
        L86:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L80
        L89:
            if (r11 == 0) goto L86
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L80
        L8e:
            r0 = -11751600(0xffffffffff4caf50, float:-2.7207279E38)
            r1 = 1740(0x6cc, float:2.438E-42)
        L93:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L99;
                case 54: goto L9f;
                default: goto L98;
            }     // Catch: java.lang.Throwable -> L1bb
        L98:
            goto L93
        L99:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L93
        L9c:
            r0 = -769226(0xfffffffffff44336, float:NaN)
        L9f:
            kevin.fun.hook.webdav.C1118.m8517(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 0
            r1 = 1
            androidx.lifecycle.livedata.C1085.m1833(r6, r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r0 = 17
            androidx.documentfile.C1076.m1233(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 0
            r1 = 0
            r7 = 0
            r8 = 1094713344(0x41400000, float:12.0)
            int r8 = m7264(r9, r8)     // Catch: java.lang.Throwable -> L1bb
            kevin.fun.hook.audio.C1117.m8126(r6, r0, r1, r7, r8)     // Catch: java.lang.Throwable -> L1bb
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L1bb
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L1bb
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L1bb
            androidx.lifecycle.process.C1087.m1946(r0, r12)     // Catch: java.lang.Throwable -> L1bb
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r1 = 10066387(0x9999d3, float:1.4106013E-38)
            int r6 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L1bb
            r1 = r1 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r1 = 17
            androidx.documentfile.C1076.m1233(r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r1 = 0
            r6 = 0
            r7 = 0
            r8 = 1101004800(0x41a00000, float:20.0)
            int r8 = m7264(r9, r8)     // Catch: java.lang.Throwable -> L1bb
            kevin.fun.hook.audio.C1117.m8126(r0, r1, r6, r7, r8)     // Catch: java.lang.Throwable -> L1bb
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L1bb
            android.widget.Button r6 = new android.widget.Button     // Catch: java.lang.Throwable -> L1bb
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L1bb
            short[] r0 = m7265()     // Catch: java.lang.Throwable -> L1bb
            r1 = 1139(0x473, float:1.596E-42)
            int r7 = androidx.lifecycle.process.C1088.f114     // Catch: java.lang.Throwable -> L1bb
            r7 = r7 ^ (-97)
            r8 = 1860(0x744, float:2.606E-42)
            java.lang.String r0 = androidx.vectordrawable.C1104.m3232(r0, r1, r7, r8)     // Catch: java.lang.Throwable -> L1bb
            androidx.interpolator.C1082.m53(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.versionedparcelable.C1107.m3449(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            androidx.lifecycle.livedata.C1084.m1743(r6, r4)     // Catch: java.lang.Throwable -> L1bb
            r0 = 0
            r1 = 1
            kevin.fun.hook.webdav.C1118.m8495(r6, r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1864(0x748, float:2.612E-42)
        L10c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L112;
                case 47384: goto L1b2;
                case 47417: goto L11c;
                case 47483: goto L118;
                default: goto L111;
            }     // Catch: java.lang.Throwable -> L1bb
        L111:
            goto L10c
        L112:
            if (r11 == 0) goto L118
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L10c
        L118:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L10c
        L11c:
            r0 = -11751600(0xffffffffff4caf50, float:-2.7207279E38)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L122:
            r7 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 14: goto L12a;
                case 239: goto L1ad;
                default: goto L129;
            }     // Catch: java.lang.Throwable -> L1bb
        L129:
            goto L122
        L12a:
            r1 = 1103626240(0x41c80000, float:25.0)
            int r1 = m7264(r9, r1)     // Catch: java.lang.Throwable -> L1bb
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L1bb
            android.graphics.drawable.GradientDrawable r0 = m7268(r0, r1)     // Catch: java.lang.Throwable -> L1bb
            androidx.activity.C1063.m290(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L1bb
            r1 = 1110441984(0x42300000, float:44.0)
            int r1 = m7264(r9, r1)     // Catch: java.lang.Throwable -> L1bb
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1bb
            androidx.vectordrawable.C1104.m3200(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda17 r0 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda17     // Catch: java.lang.Throwable -> L1bb
            r0.<init>(r2, r11, r13, r12)     // Catch: java.lang.Throwable -> L1bb
            androidx.lifecycle.viewmodel.C1093.m2380(r6, r0)     // Catch: java.lang.Throwable -> L1bb
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L1bb
            androidx.annotation.experimental.C1067.m579(r3, r5)     // Catch: java.lang.Throwable -> L1bb
            androidx.viewpager.C1108.m3545(r2, r3)     // Catch: java.lang.Throwable -> L1bb
            kevin.fun.hook.audio.C1114.m7909(r2)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1063675494(0x3f666666, float:0.9)
            com.tencent.mmkv.C1109.m3569(r5, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 1063675494(0x3f666666, float:0.9)
            androidx.vectordrawable.animated.C1102.m3064(r5, r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 0
            androidx.lifecycle.livedata.C1084.m1764(r5, r0)     // Catch: java.lang.Throwable -> L1bb
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r5)     // Catch: java.lang.Throwable -> L1bb
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r1)     // Catch: java.lang.Throwable -> L1bb
            r2 = -292(0xfffffffffffffedc, double:NaN)
            int r1 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L1bb
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L1bb
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)     // Catch: java.lang.Throwable -> L1bb
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)     // Catch: java.lang.Throwable -> L1bb
            r0 = 48891(0xbefb, float:6.8511E-41)
        L190:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L198;
                case 503: goto L1b7;
                default: goto L197;
            }
        L197:
            goto L190
        L198:
            int r1 = androidx.loader.C1098.m2793()
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L19f:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto L1a7;
                case 1711: goto L212;
                case 1736: goto L225;
                case 1769: goto L216;
                default: goto L1a6;
            }
        L1a6:
            goto L19f
        L1a7:
            if (r1 < 0) goto L212
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L19f
        L1ad:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L122
        L1b2:
            r0 = -769226(0xfffffffffff44336, float:NaN)
            goto L12a
        L1b7:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L190
        L1bb:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 1141(0x475, float:1.599E-42)
            int r4 = kevin.fun.hook.audio.C1116.f405
            r4 = r4 ^ 88
            r5 = 2685(0xa7d, float:3.762E-42)
            java.lang.String r2 = kevin.fun.hook.audio.C1116.m8020(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7259(r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        L1e7:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L1ef;
                case 50: goto L1f5;
                case 76: goto L1f9;
                case 83: goto L198;
                default: goto L1ee;
            }
        L1ee:
            goto L1e7
        L1ef:
            if (r11 != 0) goto L1f5
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L1e7
        L1f5:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L1e7
        L1f9:
            r0 = 49790(0xc27e, float:6.977E-41)
        L1fc:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L204;
                case 51: goto L198;
                case 84: goto L20e;
                case 241: goto L208;
                default: goto L203;
            }
        L203:
            goto L1fc
        L204:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L1fc
        L208:
            if (r13 == 0) goto L204
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L1fc
        L20e:
            kevin.fun.hook.audio.C1115.m7985(r13, r12)
            goto L198
        L212:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L19f
        L216:
            java.lang.String r0 = "yLAXQKEFMShHMbRMESwmkSyWoG5"
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L225:
            return
    }

    static /* synthetic */ void lambda$19(android.app.Dialog r2, boolean r3, kevin.fun.hook.PPHook.VerifyCallback r4, java.lang.String r5, android.view.View r6) {
            androidx.customview.C1074.m1118(r2)
            r0 = 1616(0x650, float:2.264E-42)
        L5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L32;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r3 == 0) goto Lb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            r0 = 1740(0x6cc, float:2.438E-42)
        L15:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1b;
                case 54: goto L20;
                case 471: goto L4a;
                case 500: goto L23;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            if (r4 == 0) goto L20
            r0 = 1833(0x729, float:2.569E-42)
            goto L15
        L20:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L15
        L23:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3792(r4)
            r0 = 1864(0x748, float:2.612E-42)
        L28:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2e;
                case 47483: goto L4a;
                default: goto L2d;
            }
        L2d:
            goto L28
        L2e:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L28
        L32:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L35:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L3d;
                case 45: goto L4a;
                case 76: goto L47;
                case 239: goto L41;
                default: goto L3c;
            }
        L3c:
            goto L35
        L3d:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L35
        L41:
            if (r4 == 0) goto L3d
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L35
        L47:
            kevin.fun.hook.audio.C1115.m7985(r4, r5)
        L4a:
            return
    }

    static /* synthetic */ void lambda$2(android.content.Context r12, kevin.fun.hook.PPHook.VerifyCallback r13) {
            r11 = 1
            android.app.Dialog r2 = new android.app.Dialog     // Catch: java.lang.Throwable -> L219
            r0 = 16974159(0x103014f, float:2.406184E-38)
            int r1 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L219
            r0 = r0 ^ r1
            r2.<init>(r12, r0)     // Catch: java.lang.Throwable -> L219
            r0 = 0
            androidx.lifecycle.runtime.C1092.m2297(r2, r0)     // Catch: java.lang.Throwable -> L219
            android.widget.FrameLayout r3 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L219
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L219
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L219
            int r1 = androidx.loader.C1099.f125     // Catch: java.lang.Throwable -> L219
            r1 = r1 ^ (-860(0xfffffffffffffca4, float:NaN))
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> L219
            androidx.lifecycle.process.C1091.m2273(r3, r0)     // Catch: java.lang.Throwable -> L219
            r0 = -2147482846(0xffffffff80000322, float:-1.124E-42)
            int r4 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L219
            r0 = r0 ^ r4
            androidx.lifecycle.livedata.C1084.m1783(r3, r0)     // Catch: java.lang.Throwable -> L219
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L219
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L219
            r0 = 1
            androidx.customview.C1074.m1119(r4, r0)     // Catch: java.lang.Throwable -> L219
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L219
            r5 = r0 ^ (-949(0xfffffffffffffc4b, float:NaN))
            androidx.emoji2.C1080.m1542(r4, r5)     // Catch: java.lang.Throwable -> L219
            r0 = 1107296256(0x42000000, float:32.0)
            int r0 = m7264(r12, r0)     // Catch: java.lang.Throwable -> L219
            r6 = 1107296256(0x42000000, float:32.0)
            int r6 = m7264(r12, r6)     // Catch: java.lang.Throwable -> L219
            r7 = 1107296256(0x42000000, float:32.0)
            int r7 = m7264(r12, r7)     // Catch: java.lang.Throwable -> L219
            r8 = 1105199104(0x41e00000, float:28.0)
            int r8 = m7264(r12, r8)     // Catch: java.lang.Throwable -> L219
            androidx.drawerlayout.C1077.m1314(r4, r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L219
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L219
            r6 = 1134559232(0x43a00000, float:320.0)
            int r6 = m7264(r12, r6)     // Catch: java.lang.Throwable -> L219
            int r7 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L219
            r7 = r7 ^ (-492(0xfffffffffffffe14, float:NaN))
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L219
            r0.gravity = r5     // Catch: java.lang.Throwable -> L219
            androidx.vectordrawable.C1105.m3296(r4, r0)     // Catch: java.lang.Throwable -> L219
            r0 = 1101004800(0x41a00000, float:20.0)
            int r0 = m7264(r12, r0)     // Catch: java.lang.Throwable -> L219
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L219
            android.graphics.drawable.GradientDrawable r0 = m7268(r1, r0)     // Catch: java.lang.Throwable -> L219
            androidx.activity.C1065.m397(r4, r0)     // Catch: java.lang.Throwable -> L219
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L219
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L219
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L219
            r6 = 1151(0x47f, float:1.613E-42)
            int r7 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L219
            r7 = r7 ^ 655(0x28f, float:9.18E-43)
            r8 = 2235(0x8bb, float:3.132E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2213(r1, r6, r7, r8)     // Catch: java.lang.Throwable -> L219
            androidx.lifecycle.process.C1087.m1946(r0, r1)     // Catch: java.lang.Throwable -> L219
            r1 = 1111490560(0x42400000, float:48.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)     // Catch: java.lang.Throwable -> L219
            androidx.documentfile.C1076.m1233(r0, r5)     // Catch: java.lang.Throwable -> L219
            r1 = 0
            r6 = 0
            r7 = 0
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = m7264(r12, r8)     // Catch: java.lang.Throwable -> L219
            kevin.fun.hook.audio.C1117.m8126(r0, r1, r6, r7, r8)     // Catch: java.lang.Throwable -> L219
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L219
            android.widget.TextView r6 = new android.widget.TextView     // Catch: java.lang.Throwable -> L219
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L219
            java.lang.String r0 = m7267()     // Catch: java.lang.Throwable -> L219
            boolean r1 = androidx.documentfile.C1076.m1246(r0)     // Catch: java.lang.Throwable -> L219
            r0 = 1616(0x650, float:2.264E-42)
        Lb5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lbb;
                case 49: goto Lbe;
                case 204: goto Lc3;
                case 239: goto Lde;
                default: goto Lba;
            }     // Catch: java.lang.Throwable -> L219
        Lba:
            goto Lb5
        Lbb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lb5
        Lbe:
            if (r1 == 0) goto Lbb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb5
        Lc3:
            short[] r0 = m7265()     // Catch: java.lang.Throwable -> L219
            r1 = 1153(0x481, float:1.616E-42)
            int r7 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L219
            r7 = r7 ^ (-50)
            r8 = 1250(0x4e2, float:1.752E-42)
            java.lang.String r0 = androidx.customview.C1074.m1116(r0, r1, r7, r8)     // Catch: java.lang.Throwable -> L219
            r1 = 1740(0x6cc, float:2.438E-42)
        Ld5:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto Ldb;
                case 54: goto Le2;
                default: goto Lda;
            }     // Catch: java.lang.Throwable -> L219
        Lda:
            goto Ld5
        Ldb:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto Ld5
        Lde:
            java.lang.String r0 = m7267()     // Catch: java.lang.Throwable -> L219
        Le2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L219
            r1.<init>()     // Catch: java.lang.Throwable -> L219
            short[] r7 = m7265()     // Catch: java.lang.Throwable -> L219
            r8 = 1158(0x486, float:1.623E-42)
            int r9 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L219
            r9 = r9 ^ (-954(0xfffffffffffffc46, float:NaN))
            r10 = 2554(0x9fa, float:3.579E-42)
            java.lang.String r7 = androidx.activity.C1064.m310(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L219
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r7)     // Catch: java.lang.Throwable -> L219
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L219
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L219
            r7 = 1165(0x48d, float:1.633E-42)
            int r8 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L219
            r8 = r8 ^ 143(0x8f, float:2.0E-43)
            r9 = 1378(0x562, float:1.931E-42)
            java.lang.String r1 = androidx.vectordrawable.C1104.m3232(r1, r7, r8, r9)     // Catch: java.lang.Throwable -> L219
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)     // Catch: java.lang.Throwable -> L219
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L219
            androidx.lifecycle.process.C1087.m1946(r6, r0)     // Catch: java.lang.Throwable -> L219
            r0 = 1101004800(0x41a00000, float:20.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r0)     // Catch: java.lang.Throwable -> L219
            r0 = 14737557(0xe0e095, float:2.0651716E-38)
            int r1 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L219
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r6, r0)     // Catch: java.lang.Throwable -> L219
            r0 = 0
            r1 = 1
            androidx.lifecycle.livedata.C1085.m1833(r6, r0, r1)     // Catch: java.lang.Throwable -> L219
            androidx.documentfile.C1076.m1233(r6, r5)     // Catch: java.lang.Throwable -> L219
            r0 = 0
            r1 = 0
            r7 = 0
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = m7264(r12, r8)     // Catch: java.lang.Throwable -> L219
            kevin.fun.hook.audio.C1117.m8126(r6, r0, r1, r7, r8)     // Catch: java.lang.Throwable -> L219
            androidx.activity.C1064.m372(r4, r6)     // Catch: java.lang.Throwable -> L219
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L219
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L219
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L219
            r6 = 1168(0x490, float:1.637E-42)
            int r7 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L219
            r7 = r7 ^ (-112(0xffffffffffffff90, float:NaN))
            r8 = 771(0x303, float:1.08E-42)
            java.lang.String r1 = androidx.vectordrawable.C1103.m3132(r1, r6, r7, r8)     // Catch: java.lang.Throwable -> L219
            androidx.lifecycle.process.C1087.m1946(r0, r1)     // Catch: java.lang.Throwable -> L219
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)     // Catch: java.lang.Throwable -> L219
            r1 = -6710326(0xffffffffff999bca, float:NaN)
            int r6 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L219
            r1 = r1 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r0, r1)     // Catch: java.lang.Throwable -> L219
            androidx.documentfile.C1076.m1233(r0, r5)     // Catch: java.lang.Throwable -> L219
            r1 = 0
            r5 = 0
            r6 = 0
            r7 = 1101004800(0x41a00000, float:20.0)
            int r7 = m7264(r12, r7)     // Catch: java.lang.Throwable -> L219
            kevin.fun.hook.audio.C1117.m8126(r0, r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L219
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L219
            android.widget.Button r0 = new android.widget.Button     // Catch: java.lang.Throwable -> L219
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L219
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L219
            r5 = 1189(0x4a5, float:1.666E-42)
            int r6 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L219
            r6 = r6 ^ (-606(0xfffffffffffffda2, float:NaN))
            r7 = 3098(0xc1a, float:4.341E-42)
            java.lang.String r1 = androidx.drawerlayout.C1077.m1343(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L219
            androidx.interpolator.C1082.m53(r0, r1)     // Catch: java.lang.Throwable -> L219
            r1 = 1098907648(0x41800000, float:16.0)
            androidx.versionedparcelable.C1107.m3449(r0, r1)     // Catch: java.lang.Throwable -> L219
            int r1 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L219
            r1 = r1 ^ (-448(0xfffffffffffffe40, float:NaN))
            androidx.lifecycle.livedata.C1084.m1743(r0, r1)     // Catch: java.lang.Throwable -> L219
            r1 = 0
            r5 = 1
            kevin.fun.hook.webdav.C1118.m8495(r0, r1, r5)     // Catch: java.lang.Throwable -> L219
            r1 = 1103626240(0x41c80000, float:25.0)
            int r1 = m7264(r12, r1)     // Catch: java.lang.Throwable -> L219
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L219
            r5 = -38870(0xffffffffffff682a, float:NaN)
            int r6 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> L219
            r5 = r5 ^ r6
            android.graphics.drawable.GradientDrawable r1 = m7268(r5, r1)     // Catch: java.lang.Throwable -> L219
            androidx.activity.C1063.m290(r0, r1)     // Catch: java.lang.Throwable -> L219
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L219
            r5 = 1111490560(0x42400000, float:48.0)
            int r5 = m7264(r12, r5)     // Catch: java.lang.Throwable -> L219
            int r6 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L219
            r6 = r6 ^ (-359(0xfffffffffffffe99, float:NaN))
            r1.<init>(r6, r5)     // Catch: java.lang.Throwable -> L219
            androidx.vectordrawable.C1104.m3200(r0, r1)     // Catch: java.lang.Throwable -> L219
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda4 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda4     // Catch: java.lang.Throwable -> L219
            r1.<init>(r2, r13)     // Catch: java.lang.Throwable -> L219
            androidx.lifecycle.viewmodel.C1093.m2380(r0, r1)     // Catch: java.lang.Throwable -> L219
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L219
            androidx.annotation.experimental.C1067.m579(r3, r4)     // Catch: java.lang.Throwable -> L219
            androidx.viewpager.C1108.m3545(r2, r3)     // Catch: java.lang.Throwable -> L219
            kevin.fun.hook.audio.C1114.m7909(r2)     // Catch: java.lang.Throwable -> L219
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.mmkv.C1109.m3569(r4, r0)     // Catch: java.lang.Throwable -> L219
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            androidx.vectordrawable.animated.C1102.m3064(r4, r0)     // Catch: java.lang.Throwable -> L219
            r0 = 0
            androidx.lifecycle.livedata.C1084.m1764(r4, r0)     // Catch: java.lang.Throwable -> L219
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r4)     // Catch: java.lang.Throwable -> L219
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r1)     // Catch: java.lang.Throwable -> L219
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r1)     // Catch: java.lang.Throwable -> L219
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r1)     // Catch: java.lang.Throwable -> L219
            r2 = -820(0xfffffffffffffccc, double:NaN)
            int r1 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L219
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L219
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)     // Catch: java.lang.Throwable -> L219
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)     // Catch: java.lang.Throwable -> L219
            r0 = 1864(0x748, float:2.612E-42)
        L20f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L215;
                case 47483: goto L26d;
                default: goto L214;
            }
        L214:
            goto L20f
        L215:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L20f
        L219:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 1193(0x4a9, float:1.672E-42)
            int r4 = androidx.loader.C1099.f125
            r4 = r4 ^ 854(0x356, float:1.197E-42)
            r5 = 1307(0x51b, float:1.831E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1123.m10510(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7259(r0)
            short[] r0 = m7265()
            r1 = 1206(0x4b6, float:1.69E-42)
            int r2 = org.luckypray.dexkit.C1125.f435
            r2 = r2 ^ (-244(0xffffffffffffff0c, float:NaN))
            r3 = 897(0x381, float:1.257E-42)
            java.lang.String r0 = androidx.interpolator.C1081.m1616(r0, r1, r2, r3)
            androidx.interpolator.C1081.m1588(r0, r11)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L258:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L260;
                case 45: goto L26d;
                case 76: goto L26a;
                case 239: goto L264;
                default: goto L25f;
            }
        L25f:
            goto L258
        L260:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L258
        L264:
            if (r13 == 0) goto L260
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L258
        L26a:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3792(r13)
        L26d:
            return
    }

    static /* synthetic */ void lambda$3(android.app.Dialog r4, kevin.fun.hook.PPHook.VerifyCallback r5, android.view.View r6) {
            short[] r0 = m7265()
            r1 = 1223(0x4c7, float:1.714E-42)
            int r2 = androidx.loader.C1098.f124
            r2 = r2 ^ (-820(0xfffffffffffffccc, float:NaN))
            r3 = 667(0x29b, float:9.35E-43)
            java.lang.String r0 = androidx.vectordrawable.C1103.m3132(r0, r1, r2, r3)
            r1 = 1
            androidx.interpolator.C1081.m1588(r0, r1)
            androidx.customview.C1074.m1118(r4)
            r0 = 1616(0x650, float:2.264E-42)
        L19:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1f;
                case 49: goto L22;
                case 204: goto L27;
                case 239: goto L2a;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L19
        L22:
            if (r5 == 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3792(r5)
        L2a:
            return
    }

    static /* synthetic */ void lambda$6(android.content.Context r13, kevin.fun.hook.PPHook.VerifyCallback r14) {
            android.app.Dialog r2 = new android.app.Dialog     // Catch: java.lang.Throwable -> L380
            r0 = -16974332(0xfffffffffefcfe04, float:-1.6814219E38)
            int r1 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L380
            r0 = r0 ^ r1
            r2.<init>(r13, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 0
            androidx.lifecycle.runtime.C1092.m2297(r2, r0)     // Catch: java.lang.Throwable -> L380
            android.widget.FrameLayout r3 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L380
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L380
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L380
            int r1 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L380
            r4 = r1 ^ (-352(0xfffffffffffffea0, float:NaN))
            r0.<init>(r4, r4)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.process.C1091.m2273(r3, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 2147483628(0x7fffffec, float:NaN)
            int r1 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> L380
            r0 = r0 ^ r1
            androidx.lifecycle.livedata.C1084.m1783(r3, r0)     // Catch: java.lang.Throwable -> L380
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L380
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L380
            r0 = 1
            androidx.customview.C1074.m1119(r5, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 1103101952(0x41c00000, float:24.0)
            int r0 = m7264(r13, r0)     // Catch: java.lang.Throwable -> L380
            r1 = 1101004800(0x41a00000, float:20.0)
            int r1 = m7264(r13, r1)     // Catch: java.lang.Throwable -> L380
            r6 = 1103101952(0x41c00000, float:24.0)
            int r6 = m7264(r13, r6)     // Catch: java.lang.Throwable -> L380
            r7 = 1101004800(0x41a00000, float:20.0)
            int r7 = m7264(r13, r7)     // Catch: java.lang.Throwable -> L380
            androidx.drawerlayout.C1077.m1314(r5, r0, r1, r6, r7)     // Catch: java.lang.Throwable -> L380
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L380
            r1 = 1134559232(0x43a00000, float:320.0)
            int r1 = m7264(r13, r1)     // Catch: java.lang.Throwable -> L380
            int r6 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L380
            r6 = r6 ^ (-270(0xfffffffffffffef2, float:NaN))
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L380
            int r1 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L380
            r6 = r1 ^ (-984(0xfffffffffffffc28, float:NaN))
            r0.gravity = r6     // Catch: java.lang.Throwable -> L380
            androidx.vectordrawable.C1105.m3296(r5, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = m7264(r13, r0)     // Catch: java.lang.Throwable -> L380
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L380
            android.graphics.drawable.GradientDrawable r0 = m7268(r4, r0)     // Catch: java.lang.Throwable -> L380
            androidx.activity.C1065.m397(r5, r0)     // Catch: java.lang.Throwable -> L380
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L380
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L380
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L380
            r7 = 1240(0x4d8, float:1.738E-42)
            int r8 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L380
            r8 = r8 ^ 550(0x226, float:7.71E-43)
            r9 = 1797(0x705, float:2.518E-42)
            java.lang.String r1 = androidx.interpolator.C1082.m1694(r1, r7, r8, r9)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.process.C1087.m1946(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = -14737578(0xffffffffff1f1f56, float:-2.1150996E38)
            int r7 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L380
            r1 = r1 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 0
            r7 = 1
            androidx.lifecycle.livedata.C1085.m1833(r0, r1, r7)     // Catch: java.lang.Throwable -> L380
            androidx.documentfile.C1076.m1233(r0, r6)     // Catch: java.lang.Throwable -> L380
            r1 = 0
            r7 = 0
            r8 = 0
            r9 = 1094713344(0x41400000, float:12.0)
            int r9 = m7264(r13, r9)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.audio.C1117.m8126(r0, r1, r7, r8, r9)     // Catch: java.lang.Throwable -> L380
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L380
            android.widget.TextView r7 = new android.widget.TextView     // Catch: java.lang.Throwable -> L380
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L380
            java.lang.String r0 = m7267()     // Catch: java.lang.Throwable -> L380
            boolean r1 = androidx.documentfile.C1076.m1246(r0)     // Catch: java.lang.Throwable -> L380
            short[] r0 = m7265()
            r8 = 1248(0x4e0, float:1.749E-42)
            int r9 = androidx.vectordrawable.C1104.f130
            r9 = r9 ^ 586(0x24a, float:8.21E-43)
            r10 = 1539(0x603, float:2.157E-42)
            java.lang.String r8 = androidx.lifecycle.process.C1087.m2008(r0, r8, r9, r10)
            r0 = 1616(0x650, float:2.264E-42)
        Lcf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld5;
                case 49: goto Ld8;
                case 204: goto Ldd;
                case 239: goto L111;
                default: goto Ld4;
            }
        Ld4:
            goto Lcf
        Ld5:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lcf
        Ld8:
            if (r1 != 0) goto Ld5
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lcf
        Ldd:
            java.lang.String r0 = m7267()     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L380
            r1.<init>()     // Catch: java.lang.Throwable -> L380
            short[] r9 = m7265()     // Catch: java.lang.Throwable -> L380
            r10 = 1273(0x4f9, float:1.784E-42)
            int r11 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L380
            r11 = r11 ^ (-113(0xffffffffffffff8f, float:NaN))
            r12 = 2557(0x9fd, float:3.583E-42)
            java.lang.String r9 = androidx.core.C1073.m1028(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r9)     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r8)     // Catch: java.lang.Throwable -> L380
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L380
            r1 = 1740(0x6cc, float:2.438E-42)
        L108:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L10e;
                case 54: goto L15f;
                default: goto L10d;
            }     // Catch: java.lang.Throwable -> L380
        L10d:
            goto L108
        L10e:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L108
        L111:
            java.lang.String r0 = m7266()     // Catch: java.lang.Throwable -> L380
            boolean r1 = m7261(r0)     // Catch: java.lang.Throwable -> L380
            r0 = 1864(0x748, float:2.612E-42)
        L11b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L121;
                case 47384: goto L36a;
                case 47417: goto L12b;
                case 47483: goto L127;
                default: goto L120;
            }     // Catch: java.lang.Throwable -> L380
        L120:
            goto L11b
        L121:
            if (r1 != 0) goto L127
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L11b
        L127:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L11b
        L12b:
            java.lang.String r0 = m7266()     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L380
            r1.<init>()     // Catch: java.lang.Throwable -> L380
            short[] r9 = m7265()     // Catch: java.lang.Throwable -> L380
            r10 = 1278(0x4fe, float:1.791E-42)
            int r11 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L380
            r11 = r11 ^ (-538(0xfffffffffffffde6, float:NaN))
            r12 = 2290(0x8f2, float:3.209E-42)
            java.lang.String r9 = androidx.interpolator.C1083.m1723(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r9)     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r8)     // Catch: java.lang.Throwable -> L380
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L380
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L157:
            r8 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 14: goto L15f;
                case 239: goto L365;
                default: goto L15e;
            }     // Catch: java.lang.Throwable -> L380
        L15e:
            goto L157
        L15f:
            androidx.lifecycle.process.C1087.m1946(r7, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 1095761920(0x41500000, float:13.0)
            androidx.vectordrawable.animated.C1102.m3105(r7, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 10066527(0x999a5f, float:1.4106209E-38)
            int r1 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L380
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r7, r0)     // Catch: java.lang.Throwable -> L380
            androidx.documentfile.C1076.m1233(r7, r6)     // Catch: java.lang.Throwable -> L380
            r0 = 0
            r1 = 0
            r6 = 0
            r8 = 1098907648(0x41800000, float:16.0)
            int r8 = m7264(r13, r8)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.audio.C1117.m8126(r7, r0, r1, r6, r8)     // Catch: java.lang.Throwable -> L380
            androidx.activity.C1064.m372(r5, r7)     // Catch: java.lang.Throwable -> L380
            android.widget.Button r0 = new android.widget.Button     // Catch: java.lang.Throwable -> L380
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L380
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L380
            r6 = 1315(0x523, float:1.843E-42)
            int r7 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L380
            r7 = r7 ^ 370(0x172, float:5.18E-43)
            r8 = 1537(0x601, float:2.154E-42)
            java.lang.String r1 = androidx.loader.C1096.m2645(r1, r6, r7, r8)     // Catch: java.lang.Throwable -> L380
            androidx.interpolator.C1082.m53(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.versionedparcelable.C1107.m3449(r0, r1)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.livedata.C1084.m1743(r0, r4)     // Catch: java.lang.Throwable -> L380
            r1 = 0
            r6 = 1
            kevin.fun.hook.webdav.C1118.m8495(r0, r1, r6)     // Catch: java.lang.Throwable -> L380
            r1 = 1103626240(0x41c80000, float:25.0)
            int r1 = m7264(r13, r1)     // Catch: java.lang.Throwable -> L380
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L380
            r6 = 13991184(0xd57d10, float:1.9605825E-38)
            int r7 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L380
            r6 = r6 ^ r7
            android.graphics.drawable.GradientDrawable r1 = m7268(r6, r1)     // Catch: java.lang.Throwable -> L380
            androidx.activity.C1063.m290(r0, r1)     // Catch: java.lang.Throwable -> L380
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L380
            r6 = 1110441984(0x42300000, float:44.0)
            int r6 = m7264(r13, r6)     // Catch: java.lang.Throwable -> L380
            r1.<init>(r4, r6)     // Catch: java.lang.Throwable -> L380
            r4 = 1094713344(0x41400000, float:12.0)
            int r4 = m7264(r13, r4)     // Catch: java.lang.Throwable -> L380
            r1.bottomMargin = r4     // Catch: java.lang.Throwable -> L380
            org.luckypray.dexkit.C1124.m10544(r5, r0, r1)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda12 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda12     // Catch: java.lang.Throwable -> L380
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.viewmodel.C1093.m2380(r0, r1)     // Catch: java.lang.Throwable -> L380
            android.widget.EditText r0 = new android.widget.EditText     // Catch: java.lang.Throwable -> L380
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L380
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L380
            r4 = 1321(0x529, float:1.851E-42)
            int r6 = androidx.loader.C1099.f125     // Catch: java.lang.Throwable -> L380
            r6 = r6 ^ 861(0x35d, float:1.207E-42)
            r7 = 404(0x194, float:5.66E-43)
            java.lang.String r1 = androidx.appcompat.resources.C1068.m652(r1, r4, r6, r7)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.process.C1090.m2215(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1096810496(0x41600000, float:14.0)
            androidx.emoji2.viewsintegration.C1079.m1452(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1
            androidx.loader.C1099.m2834(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1
            androidx.lifecycle.livedata.C1086.m1922(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1098907648(0x41800000, float:16.0)
            int r1 = m7264(r13, r1)     // Catch: java.lang.Throwable -> L380
            r4 = 1096810496(0x41600000, float:14.0)
            int r4 = m7264(r13, r4)     // Catch: java.lang.Throwable -> L380
            r6 = 1098907648(0x41800000, float:16.0)
            int r6 = m7264(r13, r6)     // Catch: java.lang.Throwable -> L380
            r7 = 1096810496(0x41600000, float:14.0)
            int r7 = m7264(r13, r7)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.audio.C1117.m8119(r0, r1, r4, r6, r7)     // Catch: java.lang.Throwable -> L380
            r1 = 14737743(0xe0e14f, float:2.0651977E-38)
            int r4 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Throwable -> L380
            r1 = r1 ^ r4
            androidx.vectordrawable.C1104.m3201(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1103626240(0x41c80000, float:25.0)
            int r1 = m7264(r13, r1)     // Catch: java.lang.Throwable -> L380
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L380
            r4 = 657865(0xa09c9, float:9.21865E-40)
            int r6 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L380
            r4 = r4 ^ r6
            android.graphics.drawable.GradientDrawable r1 = m7268(r4, r1)     // Catch: java.lang.Throwable -> L380
            androidx.vectordrawable.animated.C1102.m3095(r0, r1)     // Catch: java.lang.Throwable -> L380
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L380
            int r4 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L380
            int r6 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L380
            r6 = r6 ^ (-782(0xfffffffffffffcf2, float:NaN))
            r4 = r4 ^ 959(0x3bf, float:1.344E-42)
            r1.<init>(r6, r4)     // Catch: java.lang.Throwable -> L380
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = m7264(r13, r4)     // Catch: java.lang.Throwable -> L380
            r1.topMargin = r4     // Catch: java.lang.Throwable -> L380
            r4 = 1098907648(0x41800000, float:16.0)
            int r4 = m7264(r13, r4)     // Catch: java.lang.Throwable -> L380
            r1.bottomMargin = r4     // Catch: java.lang.Throwable -> L380
            org.luckypray.dexkit.C1124.m10544(r5, r0, r1)     // Catch: java.lang.Throwable -> L380
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L380
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L380
            r4 = 0
            androidx.customview.C1074.m1119(r1, r4)     // Catch: java.lang.Throwable -> L380
            int r4 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L380
            r4 = r4 ^ (-37)
            androidx.emoji2.C1080.m1542(r1, r4)     // Catch: java.lang.Throwable -> L380
            android.widget.TextView r4 = new android.widget.TextView     // Catch: java.lang.Throwable -> L380
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L380
            short[] r6 = m7265()     // Catch: java.lang.Throwable -> L380
            r7 = 1327(0x52f, float:1.86E-42)
            int r8 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L380
            r8 = r8 ^ 593(0x251, float:8.31E-43)
            r9 = 1159(0x487, float:1.624E-42)
            java.lang.String r6 = androidx.lifecycle.runtime.C1092.m2337(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.process.C1087.m1946(r4, r6)     // Catch: java.lang.Throwable -> L380
            r6 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r4, r6)     // Catch: java.lang.Throwable -> L380
            r6 = 6710281(0x666409, float:9.403106E-39)
            int r7 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L380
            r6 = r6 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r4, r6)     // Catch: java.lang.Throwable -> L380
            int r6 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L380
            r6 = r6 ^ 2
            androidx.documentfile.C1076.m1233(r4, r6)     // Catch: java.lang.Throwable -> L380
            r6 = 1101004800(0x41a00000, float:20.0)
            int r6 = m7264(r13, r6)     // Catch: java.lang.Throwable -> L380
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = m7264(r13, r7)     // Catch: java.lang.Throwable -> L380
            r8 = 1101004800(0x41a00000, float:20.0)
            int r8 = m7264(r13, r8)     // Catch: java.lang.Throwable -> L380
            r9 = 1094713344(0x41400000, float:12.0)
            int r9 = m7264(r13, r9)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.audio.C1117.m8126(r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L380
            android.widget.TextView r6 = new android.widget.TextView     // Catch: java.lang.Throwable -> L380
            r6.<init>(r13)     // Catch: java.lang.Throwable -> L380
            short[] r7 = m7265()     // Catch: java.lang.Throwable -> L380
            r8 = 1329(0x531, float:1.862E-42)
            int r9 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L380
            r9 = r9 ^ (-73)
            r10 = 2756(0xac4, float:3.862E-42)
            java.lang.String r7 = androidx.lifecycle.process.C1087.m2008(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.process.C1087.m1946(r6, r7)     // Catch: java.lang.Throwable -> L380
            r7 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r7)     // Catch: java.lang.Throwable -> L380
            r7 = -13991399(0xffffffffff2a8219, float:-2.2664426E38)
            int r8 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L380
            r7 = r7 ^ r8
            kevin.fun.hook.webdav.C1118.m8517(r6, r7)     // Catch: java.lang.Throwable -> L380
            r7 = 0
            r8 = 1
            androidx.lifecycle.livedata.C1085.m1833(r6, r7, r8)     // Catch: java.lang.Throwable -> L380
            int r7 = androidx.startup.C1100.f126     // Catch: java.lang.Throwable -> L380
            r7 = r7 ^ (-261(0xfffffffffffffefb, float:NaN))
            androidx.documentfile.C1076.m1233(r6, r7)     // Catch: java.lang.Throwable -> L380
            r7 = 1101004800(0x41a00000, float:20.0)
            int r7 = m7264(r13, r7)     // Catch: java.lang.Throwable -> L380
            r8 = 1094713344(0x41400000, float:12.0)
            int r8 = m7264(r13, r8)     // Catch: java.lang.Throwable -> L380
            r9 = 1101004800(0x41a00000, float:20.0)
            int r9 = m7264(r13, r9)     // Catch: java.lang.Throwable -> L380
            r10 = 1094713344(0x41400000, float:12.0)
            int r10 = m7264(r13, r10)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.audio.C1117.m8126(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L380
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L380
            r8 = 0
            r9 = -2
            r10 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r8, r9, r10)     // Catch: java.lang.Throwable -> L380
            org.luckypray.dexkit.C1124.m10544(r1, r4, r7)     // Catch: java.lang.Throwable -> L380
            org.luckypray.dexkit.C1124.m10544(r1, r6, r7)     // Catch: java.lang.Throwable -> L380
            androidx.activity.C1064.m372(r5, r1)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda13 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda13     // Catch: java.lang.Throwable -> L380
            r1.<init>(r2, r13, r14)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.livedata.C1086.m1916(r4, r1)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda14 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda14     // Catch: java.lang.Throwable -> L380
            r1.<init>(r0, r13, r2, r14)     // Catch: java.lang.Throwable -> L380
            androidx.lifecycle.livedata.C1086.m1916(r6, r1)     // Catch: java.lang.Throwable -> L380
            androidx.annotation.experimental.C1067.m579(r3, r5)     // Catch: java.lang.Throwable -> L380
            androidx.viewpager.C1108.m3545(r2, r3)     // Catch: java.lang.Throwable -> L380
            kevin.fun.hook.audio.C1114.m7909(r2)     // Catch: java.lang.Throwable -> L380
            r0 = 1063675494(0x3f666666, float:0.9)
            com.tencent.mmkv.C1109.m3569(r5, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 1063675494(0x3f666666, float:0.9)
            androidx.vectordrawable.animated.C1102.m3064(r5, r0)     // Catch: java.lang.Throwable -> L380
            r0 = 0
            androidx.lifecycle.livedata.C1084.m1764(r5, r0)     // Catch: java.lang.Throwable -> L380
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r5)     // Catch: java.lang.Throwable -> L380
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r1)     // Catch: java.lang.Throwable -> L380
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r1)     // Catch: java.lang.Throwable -> L380
            r2 = 842(0x34a, double:4.16E-321)
            int r1 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L380
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L380
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)     // Catch: java.lang.Throwable -> L380
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)     // Catch: java.lang.Throwable -> L380
            r0 = 48891(0xbefb, float:6.8511E-41)
        L35c:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L364;
                case 503: goto L37c;
                default: goto L363;
            }     // Catch: java.lang.Throwable -> L380
        L363:
            goto L35c
        L364:
            return
        L365:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L157
        L36a:
            short[] r0 = m7265()     // Catch: java.lang.Throwable -> L380
            r1 = 1284(0x504, float:1.799E-42)
            int r8 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> L380
            r8 = r8 ^ 109(0x6d, float:1.53E-43)
            r9 = 3094(0xc16, float:4.336E-42)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r1, r8, r9)     // Catch: java.lang.Throwable -> L380
            goto L15f
        L37c:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L35c
        L380:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7265()
            r3 = 1331(0x533, float:1.865E-42)
            int r4 = androidx.loader.C1097.f123
            r4 = r4 ^ 120(0x78, float:1.68E-43)
            r5 = 2466(0x9a2, float:3.456E-42)
            java.lang.String r2 = androidx.activity.C1063.m241(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7259(r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        L3ac:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L3b4;
                case 50: goto L3ba;
                case 76: goto L3be;
                case 83: goto L364;
                default: goto L3b3;
            }
        L3b3:
            goto L3ac
        L3b4:
            if (r14 == 0) goto L3ba
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L3ac
        L3ba:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L3ac
        L3be:
            short[] r0 = m7265()
            r1 = 1341(0x53d, float:1.879E-42)
            int r2 = androidx.emoji2.C1080.f106
            r2 = r2 ^ 369(0x171, float:5.17E-43)
            r3 = 1437(0x59d, float:2.014E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2127(r0, r1, r2, r3)
            kevin.fun.hook.audio.C1115.m7985(r14, r0)
            goto L364
    }

    static /* synthetic */ void lambda$7(android.content.Context r6, android.view.View r7) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L38
            short[] r1 = m7265()     // Catch: java.lang.Throwable -> L38
            r2 = 1349(0x545, float:1.89E-42)
            int r3 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L38
            r3 = r3 ^ 355(0x163, float:4.97E-43)
            r4 = 3043(0xbe3, float:4.264E-42)
            java.lang.String r1 = com.tencent.mmkv.C1109.m3629(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L38
            short[] r2 = m7265()     // Catch: java.lang.Throwable -> L38
            r3 = 1375(0x55f, float:1.927E-42)
            int r4 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Throwable -> L38
            r4 = r4 ^ (-245(0xffffffffffffff0b, float:NaN))
            r5 = 2492(0x9bc, float:3.492E-42)
            java.lang.String r2 = androidx.loader.C1098.m2787(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38
            android.net.Uri r2 = androidx.activity.C1063.m240(r2)     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L38
            androidx.loader.C1094.m2441(r6, r0)     // Catch: java.lang.Throwable -> L38
            r0 = 1616(0x650, float:2.264E-42)
        L2e:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L34;
                case 49: goto L35;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            return
        L35:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L2e
        L38:
            r0 = move-exception
            short[] r0 = m7265()
            r1 = 1397(0x575, float:1.958E-42)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r2 = r2 ^ (-939(0xfffffffffffffc55, float:NaN))
            r3 = 1672(0x688, float:2.343E-42)
            java.lang.String r0 = androidx.activity.C1063.m241(r0, r1, r2, r3)
            m7256(r6, r0)
            goto L34
    }

    static /* synthetic */ void lambda$8(android.app.Dialog r5, android.content.Context r6, kevin.fun.hook.PPHook.VerifyCallback r7, android.view.View r8) {
            androidx.customview.C1074.m1118(r5)
            short[] r0 = m7265()
            r1 = 1412(0x584, float:1.979E-42)
            int r2 = androidx.appcompat.C1069.f95
            r2 = r2 ^ (-227(0xffffffffffffff1d, float:NaN))
            r3 = 2050(0x802, float:2.873E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r0, r1, r2, r3)
            short[] r1 = m7265()
            r2 = 1426(0x592, float:1.998E-42)
            int r3 = androidx.documentfile.C1076.f102
            r3 = r3 ^ (-606(0xfffffffffffffda2, float:NaN))
            r4 = 1918(0x77e, float:2.688E-42)
            java.lang.String r1 = androidx.core.ktx.C1071.m874(r1, r2, r3, r4)
            r2 = 0
            m7260(r6, r1, r0, r2, r7)
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L2d:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L33;
                case 49: goto L36;
                case 204: goto L3b;
                case 239: goto L4a;
                default: goto L32;
            }
        L32:
            goto L2d
        L33:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2d
        L36:
            if (r1 > 0) goto L33
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2d
        L3b:
            java.lang.String r0 = "x3KIrAQIx9xrVhSdYFKBZTWksy"
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1770(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L4a:
            return
    }

    static /* synthetic */ void lambda$9(android.widget.EditText r4, android.content.Context r5, android.app.Dialog r6, kevin.fun.hook.PPHook.VerifyCallback r7, android.view.View r8) {
            android.text.Editable r0 = androidx.drawerlayout.C1077.m1276(r4)
            java.lang.String r0 = androidx.startup.C1101.m2982(r0)
            java.lang.String r0 = androidx.documentfile.C1076.m1236(r0)
            java.util.Locale r1 = androidx.emoji2.viewsintegration.C1079.m1484()
            java.lang.String r1 = org.luckypray.dexkit.C1124.m10543(r0, r1)
            boolean r2 = androidx.documentfile.C1076.m1246(r1)
            r0 = 1616(0x650, float:2.264E-42)
        L1a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L20;
                case 49: goto L23;
                case 204: goto L28;
                case 239: goto L3c;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1a
        L23:
            if (r2 == 0) goto L20
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1a
        L28:
            short[] r0 = m7265()
            r1 = 1430(0x596, float:2.004E-42)
            int r2 = androidx.lifecycle.process.C1089.f115
            r2 = r2 ^ 934(0x3a6, float:1.309E-42)
            r3 = 432(0x1b0, float:6.05E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)
            m7256(r5, r0)
        L3b:
            return
        L3c:
            androidx.customview.C1074.m1118(r6)
            m7243(r5, r1, r7)
            int r1 = kevin.fun.hook.audio.C1115.m98()
            r0 = 1740(0x6cc, float:2.438E-42)
        L48:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L4e;
                case 54: goto L53;
                case 471: goto L3b;
                case 500: goto L56;
                default: goto L4d;
            }
        L4d:
            goto L48
        L4e:
            if (r1 < 0) goto L53
            r0 = 1833(0x729, float:2.569E-42)
            goto L48
        L53:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L48
        L56:
            java.lang.String r0 = "Eh9y3AVErdtLTW452DlXUcu1E6ol"
            java.lang.String r0 = androidx.activity.C1064.m367(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L3b
    }

    public static void loadVipListFromCloud() {
            java.lang.Thread r0 = new java.lang.Thread
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda11 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda11
            r1.<init>()
            r0.<init>(r1)
            androidx.emoji2.viewsintegration.C1078.m1394(r0)
            return
    }

    private static void log(java.lang.String r2) {
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L23;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = "PbsmESaYQNxSaYzXTg6YvUBo"
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1770(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L23:
            return
    }

    private static java.lang.String normalizeValue(java.lang.String r6) {
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            r1 = 1616(0x650, float:2.264E-42)
        L6:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L7c;
                case 239: goto L14;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r6 != 0) goto Lc
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r1 = androidx.documentfile.C1076.m1236(r6)
            int r3 = androidx.emoji2.C1080.m1552(r1)
            r2 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L2c;
                case 500: goto L7c;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            if (r3 != 0) goto L29
            r2 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            short[] r2 = m7265()
            r3 = 1436(0x59c, float:2.012E-42)
            int r4 = org.luckypray.dexkit.C1123.f433
            r4 = r4 ^ (-963(0xfffffffffffffc3d, float:NaN))
            r5 = 3136(0xc40, float:4.394E-42)
            java.lang.String r2 = androidx.annotation.experimental.C1067.m581(r2, r3, r4, r5)
            boolean r3 = androidx.loader.C1099.m2892(r2, r1)
            r2 = 1864(0x748, float:2.612E-42)
        L42:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L48;
                case 47384: goto L52;
                case 47417: goto L7c;
                case 47483: goto L4e;
                default: goto L47;
            }
        L47:
            goto L42
        L48:
            if (r3 == 0) goto L4e
            r2 = 48736(0xbe60, float:6.8294E-41)
            goto L42
        L4e:
            r2 = 48705(0xbe41, float:6.825E-41)
            goto L42
        L52:
            short[] r2 = m7265()
            r3 = 1440(0x5a0, float:2.018E-42)
            int r4 = androidx.activity.C1062.f88
            r4 = r4 ^ (-68)
            r5 = 912(0x390, float:1.278E-42)
            java.lang.String r2 = androidx.appcompat.resources.C1068.m652(r2, r3, r4, r5)
            boolean r3 = androidx.loader.C1099.m2892(r2, r1)
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L69:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L71;
                case 45: goto L7b;
                case 76: goto L7c;
                case 239: goto L75;
                default: goto L70;
            }
        L70:
            goto L69
        L71:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L69
        L75:
            if (r3 == 0) goto L71
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L69
        L7b:
            r0 = r1
        L7c:
            return r0
    }

    private static java.lang.String readHttpResponse(java.net.HttpURLConnection r7, int r8) throws java.lang.Exception {
            r2 = 0
            r0 = 1616(0x650, float:2.264E-42)
        L3:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L13;
                case 239: goto L35;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 < r0) goto L9
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L13:
            r0 = 1740(0x6cc, float:2.438E-42)
        L15:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1b;
                case 54: goto L22;
                case 471: goto L35;
                case 500: goto L25;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 300(0x12c, float:4.2E-43)
            if (r8 >= r0) goto L22
            r0 = 1833(0x729, float:2.569E-42)
            goto L15
        L22:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L15
        L25:
            java.io.InputStream r4 = androidx.customview.C1075.m1174(r7)     // Catch: java.lang.Throwable -> L15a
            r0 = 1864(0x748, float:2.612E-42)
        L2b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L31;
                case 47483: goto Lc0;
                default: goto L30;
            }     // Catch: java.lang.Throwable -> L15a
        L30:
            goto L2b
        L31:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L2b
        L35:
            java.io.InputStream r4 = androidx.annotation.experimental.C1067.m587(r7)     // Catch: java.lang.Throwable -> L15a
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L3c:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L44;
                case 45: goto Lc0;
                case 76: goto L4e;
                case 239: goto L48;
                default: goto L43;
            }
        L43:
            goto L3c
        L44:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L3c
        L48:
            if (r4 != 0) goto L44
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L3c
        L4e:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L51:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L59;
                case 53: goto L71;
                case 503: goto L59;
                case 32495: goto L5d;
                default: goto L58;
            }
        L58:
            goto L51
        L59:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L51
        L5d:
            r0 = 0
            androidx.lifecycle.process.C1089.m2153(r0)     // Catch: java.lang.Throwable -> L70
            r0 = 49666(0xc202, float:6.9597E-41)
        L64:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L6c;
                case 50: goto L71;
                default: goto L6b;
            }
        L6b:
            goto L64
        L6c:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L64
        L70:
            r0 = move-exception
        L71:
            r0 = 49790(0xc27e, float:6.977E-41)
        L74:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L7c;
                case 51: goto L94;
                case 84: goto L80;
                case 241: goto L7c;
                default: goto L7b;
            }
        L7b:
            goto L74
        L7c:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L74
        L80:
            r0 = 0
            androidx.emoji2.viewsintegration.C1078.m1391(r0)     // Catch: java.lang.Throwable -> L93
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L87:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L8f;
                case 1711: goto L94;
                default: goto L8e;
            }
        L8e:
            goto L87
        L8f:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L87
        L93:
            r0 = move-exception
        L94:
            r0 = 50689(0xc601, float:7.103E-41)
        L97:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L9f;
                case 45: goto Lb7;
                case 50: goto La5;
                case 76: goto La9;
                default: goto L9e;
            }
        L9e:
            goto L97
        L9f:
            if (r4 == 0) goto La5
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L97
        La5:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L97
        La9:
            androidx.versionedparcelable.C1107.m3447(r4)     // Catch: java.lang.Throwable -> L1d7
            r0 = 50813(0xc67d, float:7.1204E-41)
        Laf:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto Lb7;
                case 243: goto Lbc;
                default: goto Lb6;
            }
        Lb6:
            goto Laf
        Lb7:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
        Lbb:
            return r0
        Lbc:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto Laf
        Lc0:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L1e0
            short[] r0 = m7265()     // Catch: java.lang.Throwable -> L1e0
            r1 = 1449(0x5a9, float:2.03E-42)
            int r5 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L1e0
            r5 = r5 ^ 610(0x262, float:8.55E-43)
            r6 = 1744(0x6d0, float:2.444E-42)
            java.lang.String r0 = androidx.interpolator.C1083.m1723(r0, r1, r5, r6)     // Catch: java.lang.Throwable -> L1e0
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L1e0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1e5
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1e5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e9
            r2.<init>()     // Catch: java.lang.Throwable -> L1e9
        Ldf:
            java.lang.String r5 = androidx.loader.C1099.m2897(r1)     // Catch: java.lang.Throwable -> L1e9
            r0 = 51588(0xc984, float:7.229E-41)
        Le6:
            r6 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r6
            switch(r0) {
                case 17: goto Lee;
                case 54: goto Lf4;
                case 87: goto L148;
                case 116: goto Lf8;
                default: goto Led;
            }     // Catch: java.lang.Throwable -> L1e9
        Led:
            goto Le6
        Lee:
            if (r5 != 0) goto Lf4
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto Le6
        Lf4:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto Le6
        Lf8:
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L1e9
            androidx.lifecycle.process.C1089.m2153(r1)     // Catch: java.lang.Throwable -> L1da
            r1 = 51712(0xca00, float:7.2464E-41)
        L102:
            r2 = 51729(0xca11, float:7.2488E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L10a;
                case 15: goto L109;
                case 16: goto L109;
                case 17: goto L11c;
                default: goto L109;
            }
        L109:
            goto L102
        L10a:
            androidx.emoji2.viewsintegration.C1078.m1391(r3)     // Catch: java.lang.Throwable -> L120
            r1 = 51836(0xca7c, float:7.2638E-41)
        L110:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 241: goto L118;
                case 1963: goto L121;
                default: goto L117;
            }
        L117:
            goto L110
        L118:
            r1 = 52518(0xcd26, float:7.3593E-41)
            goto L110
        L11c:
            r1 = 51743(0xca1f, float:7.2507E-41)
            goto L102
        L120:
            r1 = move-exception
        L121:
            r1 = 52611(0xcd83, float:7.3724E-41)
        L124:
            r2 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 23: goto L12c;
                case 54: goto L132;
                case 85: goto Lbb;
                case 116: goto L136;
                default: goto L12b;
            }
        L12b:
            goto L124
        L12c:
            if (r4 == 0) goto L132
            r1 = 52704(0xcde0, float:7.3854E-41)
            goto L124
        L132:
            r1 = 52673(0xcdc1, float:7.381E-41)
            goto L124
        L136:
            androidx.versionedparcelable.C1107.m3447(r4)     // Catch: java.lang.Throwable -> L1dd
            r1 = 52735(0xcdff, float:7.3897E-41)
        L13c:
            r2 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto Lbb;
                case 1007: goto L144;
                default: goto L143;
            }
        L143:
            goto L13c
        L144:
            r1 = 52766(0xce1e, float:7.3941E-41)
            goto L13c
        L148:
            androidx.lifecycle.livedata.C1085.m1859(r2, r5)     // Catch: java.lang.Throwable -> L1e9
            r0 = 53510(0xd106, float:7.4983E-41)
        L14e:
            r5 = 53527(0xd117, float:7.5007E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 17: goto L156;
                case 50: goto Ldf;
                default: goto L155;
            }
        L155:
            goto L14e
        L156:
            r0 = 53541(0xd125, float:7.5027E-41)
            goto L14e
        L15a:
            r0 = move-exception
            r1 = r2
            r3 = r2
            r4 = r2
        L15e:
            r2 = 53634(0xd182, float:7.5157E-41)
        L161:
            r5 = 53651(0xd193, float:7.5181E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L169;
                case 50: goto L16f;
                case 76: goto L173;
                case 83: goto L186;
                default: goto L168;
            }
        L168:
            goto L161
        L169:
            if (r1 == 0) goto L16f
            r2 = 53727(0xd1df, float:7.5288E-41)
            goto L161
        L16f:
            r2 = 53696(0xd1c0, float:7.5244E-41)
            goto L161
        L173:
            androidx.lifecycle.process.C1089.m2153(r1)     // Catch: java.lang.Throwable -> L185
            r1 = 53758(0xd1fe, float:7.5331E-41)
        L179:
            r2 = 53775(0xd20f, float:7.5355E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 1009: goto L181;
                case 1703: goto L186;
                default: goto L180;
            }
        L180:
            goto L179
        L181:
            r1 = 54440(0xd4a8, float:7.6287E-41)
            goto L179
        L185:
            r1 = move-exception
        L186:
            r1 = 54533(0xd505, float:7.6417E-41)
        L189:
            r2 = 54550(0xd516, float:7.6441E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 19: goto L191;
                case 50: goto L197;
                case 85: goto L1ae;
                case 116: goto L19b;
                default: goto L190;
            }
        L190:
            goto L189
        L191:
            if (r3 == 0) goto L197
            r1 = 54626(0xd562, float:7.6547E-41)
            goto L189
        L197:
            r1 = 54595(0xd543, float:7.6504E-41)
            goto L189
        L19b:
            androidx.emoji2.viewsintegration.C1078.m1391(r3)     // Catch: java.lang.Throwable -> L1ad
            r1 = 54657(0xd581, float:7.6591E-41)
        L1a1:
            r2 = 54674(0xd592, float:7.6615E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 19: goto L1a9;
                case 50: goto L1ae;
                default: goto L1a8;
            }
        L1a8:
            goto L1a1
        L1a9:
            r1 = 54688(0xd5a0, float:7.6634E-41)
            goto L1a1
        L1ad:
            r1 = move-exception
        L1ae:
            r1 = 55432(0xd888, float:7.7677E-41)
        L1b1:
            r2 = 55449(0xd899, float:7.77E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L1b9;
                case 62: goto L1bf;
                case 95: goto L1d6;
                case 124: goto L1c3;
                default: goto L1b8;
            }
        L1b8:
            goto L1b1
        L1b9:
            if (r4 == 0) goto L1bf
            r1 = 55525(0xd8e5, float:7.7807E-41)
            goto L1b1
        L1bf:
            r1 = 55494(0xd8c6, float:7.7764E-41)
            goto L1b1
        L1c3:
            androidx.versionedparcelable.C1107.m3447(r4)     // Catch: java.lang.Throwable -> L1d5
            r1 = 55556(0xd904, float:7.785E-41)
        L1c9:
            r2 = 55573(0xd915, float:7.7874E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L1d1;
                case 54: goto L1d6;
                default: goto L1d0;
            }
        L1d0:
            goto L1c9
        L1d1:
            r1 = 55587(0xd923, float:7.7894E-41)
            goto L1c9
        L1d5:
            r1 = move-exception
        L1d6:
            throw r0
        L1d7:
            r0 = move-exception
            goto Lb7
        L1da:
            r1 = move-exception
            goto L10a
        L1dd:
            r1 = move-exception
            goto Lbb
        L1e0:
            r0 = move-exception
            r1 = r2
            r3 = r2
            goto L15e
        L1e5:
            r0 = move-exception
            r1 = r2
            goto L15e
        L1e9:
            r0 = move-exception
            goto L15e
    }

    private static void saveActivatedAccount(java.lang.String r6) {
            r5 = 1
            java.lang.String r0 = androidx.emoji2.C1080.m1562()
            short[] r1 = m7265()
            r2 = 1454(0x5ae, float:2.037E-42)
            int r3 = androidx.activity.C1064.f90
            r3 = r3 ^ 504(0x1f8, float:7.06E-43)
            r4 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r2 = androidx.core.ktx.C1071.m874(r1, r2, r3, r4)
            java.lang.String r0 = androidx.interpolator.C1081.m1642(r2, r0)
            boolean r3 = androidx.documentfile.C1076.m1246(r0)
            r1 = 1616(0x650, float:2.264E-42)
        L1f:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L25;
                case 49: goto L28;
                case 204: goto L2d;
                case 239: goto L63;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L1f
        L28:
            if (r3 == 0) goto L25
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L1f
        L2d:
            r0 = 1740(0x6cc, float:2.438E-42)
        L2f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L35;
                case 54: goto L38;
                default: goto L34;
            }
        L34:
            goto L2f
        L35:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2f
        L38:
            r0 = r6
        L39:
            androidx.core.C1073.m1055(r2, r0)
            short[] r0 = m7265()
            r1 = 1473(0x5c1, float:2.064E-42)
            int r2 = androidx.startup.C1100.f126
            r2 = r2 ^ (-284(0xfffffffffffffee4, float:NaN))
            r3 = 2720(0xaa0, float:3.812E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)
            androidx.core.C1073.m1055(r0, r6)
            short[] r0 = m7265()
            r1 = 1487(0x5cf, float:2.084E-42)
            int r2 = androidx.customview.C1075.f101
            r2 = r2 ^ (-114(0xffffffffffffff8e, float:NaN))
            r3 = 1380(0x564, float:1.934E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1123.m10510(r0, r1, r2, r3)
            androidx.interpolator.C1081.m1588(r0, r5)
            return
        L63:
            boolean r3 = m7252(r6)
            r1 = 1864(0x748, float:2.612E-42)
        L69:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L6f;
                case 47384: goto L39;
                case 47417: goto L79;
                case 47483: goto L75;
                default: goto L6e;
            }
        L6e:
            goto L69
        L6f:
            if (r3 != 0) goto L75
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L69
        L75:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L69
        L79:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            short[] r1 = m7265()
            r3 = 1472(0x5c0, float:2.063E-42)
            r4 = 1077(0x435, float:1.509E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1413(r1, r3, r5, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r6)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            goto L39
    }

    private static void showActivateDialog(android.content.Context r4, kevin.fun.hook.PPHook.VerifyCallback r5) {
            r1 = 0
            java.lang.String r3 = "ۣۨ۠"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1747780: goto L15;
                case 1750690: goto L24;
                case 1755461: goto L1c;
                default: goto Lc;
            }
        Lc:
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda5 r0 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda5
            r0.<init>(r4, r5)
            java.lang.String r1 = "ۣ۠ۧ"
            r3 = r1
            goto L5
        L15:
            androidx.activity.C1062.m178(r2, r0)
            java.lang.String r1 = "ۣۣۤ"
            r3 = r1
            goto L5
        L1c:
            android.os.Handler r1 = m7262()
            java.lang.String r3 = "۠ۦۢ"
            r2 = r1
            goto L5
        L24:
            return
    }

    private static void showLoadingDialog(android.content.Context r4, java.lang.String r5) {
            r1 = 0
            java.lang.String r3 = "ۥۨۡ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1747807: goto L14;
                case 1748740: goto L24;
                case 1750626: goto L1d;
                default: goto Lc;
            }
        Lc:
            android.os.Handler r0 = m7262()
            java.lang.String r1 = "ۣ۠ۤ"
            r3 = r1
            goto L5
        L14:
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda10 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda10
            r1.<init>(r4, r5)
            java.lang.String r3 = "ۣۢۡ"
            r2 = r1
            goto L5
        L1d:
            androidx.activity.C1062.m178(r0, r2)
            java.lang.String r1 = "ۣۡۦ"
            r3 = r1
            goto L5
        L24:
            return
    }

    private static void showResultDialog(android.content.Context r7, java.lang.String r8, java.lang.String r9, boolean r10, kevin.fun.hook.PPHook.VerifyCallback r11) {
            r0 = 0
            java.lang.String r2 = "ۣۡۥ"
            r6 = r0
            r1 = r0
            r3 = r10
        L6:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r2)
            switch(r0) {
                case 1750599: goto L23;
                case 1753696: goto L16;
                case 1755615: goto Le;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            boolean r3 = androidx.activity.C1062.m178(r6, r1)
            java.lang.String r0 = "۟ۨۡ"
            r2 = r0
            goto L6
        L16:
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda15 r0 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda15
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r2 = "ۨۨ۟"
            r1 = r0
            goto L6
        L23:
            android.os.Handler r0 = m7262()
            java.lang.String r2 = "ۦۨۢ"
            r6 = r0
            goto L6
    }

    private static void showToast(android.content.Context r2, java.lang.String r3) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L1c;
                case 239: goto L10;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r2 != 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            android.os.Handler r0 = m7262()
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda16 r1 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda16
            r1.<init>(r2, r3)
            androidx.activity.C1062.m178(r0, r1)
        L1c:
            return
    }

    private static void showVipWelcomeDialog(android.content.Context r4, kevin.fun.hook.PPHook.VerifyCallback r5) {
            r1 = 0
            java.lang.String r3 = "ۢۢۢ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56539: goto L1e;
                case 1749666: goto Ld;
                case 1750625: goto L15;
                default: goto Lc;
            }
        Lc:
            return
        Ld:
            android.os.Handler r1 = m7262()
            java.lang.String r3 = "ۣۢ۠"
            r2 = r1
            goto L5
        L15:
            kevin.fun.hook.PPHook$$ExternalSyntheticLambda18 r0 = new kevin.fun.hook.PPHook$$ExternalSyntheticLambda18
            r0.<init>(r4, r5)
            java.lang.String r1 = "ۧۢ"
            r3 = r1
            goto L5
        L1e:
            androidx.activity.C1062.m178(r2, r0)
            java.lang.String r1 = "ۥ۠ۨ"
            r3 = r1
            goto L5
    }

    public static void updateCurrentDouyinUser(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = m7249(r2)
            kevin.fun.hook.PPHook.sCurrentDyUid = r0
            java.lang.String r0 = m7249(r3)
            kevin.fun.hook.PPHook.sCurrentDyNickname = r0
            boolean r1 = m7244()
            r0 = 1616(0x650, float:2.264E-42)
        L12:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L18;
                case 49: goto L1b;
                case 204: goto L20;
                case 239: goto L23;
                default: goto L17;
            }
        L17:
            goto L12
        L18:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L12
        L1b:
            if (r1 != 0) goto L18
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L12
        L20:
            androidx.viewpager.C1108.m3554()
        L23:
            int r1 = androidx.core.ktx.C1071.m854()
            r0 = 1740(0x6cc, float:2.438E-42)
        L29:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2f;
                case 54: goto L34;
                case 471: goto L46;
                case 500: goto L37;
                default: goto L2e;
            }
        L2e:
            goto L29
        L2f:
            if (r1 > 0) goto L34
            r0 = 1833(0x729, float:2.569E-42)
            goto L29
        L34:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L29
        L37:
            java.lang.String r0 = "FbrNOiTARCFP"
            java.lang.String r0 = androidx.vectordrawable.C1103.m69(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L46:
            return
    }

    /* JADX INFO: renamed from: ۟۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7242(java.lang.Object r2) {
            int r1 = androidx.activity.C1066.m518()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.PPHook$ActivateResult r2 = (kevin.fun.hook.PPHook.ActivateResult) r2
            boolean r0 = r2.f59ok
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۟۟ۤۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7243(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.startup.C1101.m2984()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1e;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            kevin.fun.hook.PPHook$VerifyCallback r4 = (kevin.fun.hook.PPHook.VerifyCallback) r4
            activateCode(r2, r3, r4)
        L1d:
            return
        L1e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L20:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L26;
                case 54: goto L1d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    /* JADX INFO: renamed from: ۟۠۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7244() {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r0 = kevin.fun.hook.PPHook.sVipListLoaded
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۡۡۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7245(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            kevin.fun.hook.PPHook$VerifyCallback r3 = (kevin.fun.hook.PPHook.VerifyCallback) r3
            showVipWelcomeDialog(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟ۡۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m7246(java.lang.Object r2) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            saveActivatedAccount(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۟ۡۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7247(java.lang.Object r2) {
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = fetchUrlContent(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7248(java.lang.Object r2, int r3) {
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            java.lang.String r0 = readHttpResponse(r2, r3)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۣۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7249(java.lang.Object r2) {
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = normalizeValue(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟ۤۤۡۧ, reason: not valid java name and contains not printable characters */
    public static int m7250(java.lang.Object r2) {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.PPHook$ActivateResult r2 = (kevin.fun.hook.PPHook.ActivateResult) r2
            int r0 = r2.count
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7251(java.lang.Object r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.PPHook$ActivateResult r2 = (kevin.fun.hook.PPHook.ActivateResult) r2
            java.lang.String r0 = r2.status
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۟ۥۨۥۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7252(java.lang.Object r2) {
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = isAccountActivated(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟ۦۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7253(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            kevin.fun.hook.PPHook$VerifyCallback r3 = (kevin.fun.hook.PPHook.VerifyCallback) r3
            showActivateDialog(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۟ۧ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static android.app.Dialog m7254() {
            int r1 = com.tencent.mmkv.C1109.m3598()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Dialog r0 = kevin.fun.hook.PPHook.loadingDialog
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۟ۧۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m7255(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            showLoadingDialog(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static void m7256(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1116.m8064()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            showToast(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۢۦۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7257(java.lang.Object r2) {
            int r1 = androidx.viewpager.C1108.m3542()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.PPHook$ActivateResult r2 = (kevin.fun.hook.PPHook.ActivateResult) r2
            java.lang.String r0 = r2.error
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۣۢۧۤ, reason: not valid java name and contains not printable characters */
    public static java.util.Set m7258() {
            int r1 = androidx.versionedparcelable.C1106.m3393()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.util.Set<java.lang.String> r0 = kevin.fun.hook.PPHook.sVipUidSet
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static void m7259(java.lang.Object r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            log(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    /* JADX INFO: renamed from: ۥ۠۟ۧ, reason: contains not printable characters */
    public static void m7260(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5, java.lang.Object r6) {
            int r1 = androidx.core.ktx.C1070.m822()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L43;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            kevin.fun.hook.PPHook$VerifyCallback r6 = (kevin.fun.hook.PPHook.VerifyCallback) r6
            showResultDialog(r2, r3, r4, r5, r6)
        L1f:
            int r1 = org.luckypray.dexkit.C1123.m10509()
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L42;
                case 500: goto L33;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            if (r1 > 0) goto L30
            r0 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            java.lang.String r0 = "IwlLXzpvLxkKX1Nn4hzFsozxfkHO"
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2359(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L42:
            return
        L43:
            r0 = 1864(0x748, float:2.612E-42)
        L45:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4b;
                case 47483: goto L1f;
                default: goto L4a;
            }
        L4a:
            goto L45
        L4b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L45
    }

    /* JADX INFO: renamed from: ۦۤ۠ۧ, reason: contains not printable characters */
    public static boolean m7261(java.lang.Object r2) {
            int r1 = androidx.drawerlayout.C1077.m1360()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = isInvalidUid(r2)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۦۨ۟ۦ, reason: contains not printable characters */
    public static android.os.Handler m7262() {
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.os.Handler r0 = kevin.fun.hook.PPHook.mainHandler
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۧۧ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m7263() {
            int r1 = androidx.startup.C1101.m2984()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L18;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            dismissLoadingDialog()
        L17:
            return
        L18:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L17;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m7264(java.lang.Object r2, float r3) {
            int r1 = androidx.vectordrawable.C1104.m3230()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            int r0 = m91dp(r2, r3)
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    /* JADX INFO: renamed from: ۨۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m7265() {
            int r1 = androidx.activity.C1066.m518()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            short[] r0 = kevin.fun.hook.PPHook.f371short
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۨۤۡۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7266() {
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = kevin.fun.hook.PPHook.sCurrentDyUid
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۨۧۡۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7267() {
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L17;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = kevin.fun.hook.PPHook.sCurrentDyNickname
        L16:
            return r0
        L17:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L20;
                case 54: goto L16;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1a
    }

    /* JADX INFO: renamed from: ۨۨۨ۠, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.GradientDrawable m7268(int r2, float r3) {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L19;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.graphics.drawable.GradientDrawable r0 = createRoundBg(r2, r3)
        L18:
            return r0
        L19:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L18;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }
}
