package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class SparkRenewHelper {
    private static final int AUTO_DELAY_SECONDS = 15;
    private static final java.lang.String DEFAULT_MESSAGE = null;
    private static final java.lang.String KEY_CONV_NAME_MAP = null;
    private static final java.lang.String KEY_CONV_RENEW_PREFIX = null;
    private static final java.lang.String KEY_CUSTOM_MESSAGE = null;
    private static final java.lang.String KEY_LAST_AUTO_DONE_DATE = null;
    private static final java.lang.String KEY_ONLY_SPARK_FILTER = null;
    private static final java.lang.String KEY_SPARK_CONV_CUSTOM_MSG_PREFIX = null;
    private static final java.lang.String KEY_SPARK_CONV_ENABLE_PREFIX = null;
    private static final java.lang.String KEY_SPARK_CONV_RANDOM_API_PREFIX = null;
    private static final java.lang.String KEY_SPARK_CONV_USE_CUSTOM_PREFIX = null;
    private static final java.lang.String KEY_SPARK_ENABLE = null;
    private static final android.os.Handler MAIN_HANDLER = null;
    private static final java.lang.String PREF_NAME = null;
    private static final java.lang.String RANDOM_API_ABUSE = null;
    private static final java.lang.String RANDOM_API_DOG = null;
    private static final java.lang.String RANDOM_API_FUNNY = null;
    private static final java.lang.String RANDOM_API_JOKE = null;
    private static final java.lang.String RANDOM_API_LOVE = null;
    private static final java.lang.String RANDOM_API_POEM = null;
    private static final java.lang.String RANDOM_API_QUOTE = null;
    private static final java.lang.String RANDOM_API_SOUP = null;
    private static final java.lang.String RANDOM_API_TADY = null;
    private static final java.lang.String TAG = null;
    private static final int TAG_CHECKED = 268435520;
    private static final int TAG_VIEW = 268435521;
    private static final int WAIT_SEND_READY_MAX_SECONDS = 30;
    private static final int WAIT_SPARK_MAX_SECONDS = 60;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, kevin.fun.hook.SparkRenewHelper.SparkInfo> allConversations = null;
    private static final java.util.concurrent.atomic.AtomicBoolean autoRenewTriggered = null;
    private static java.lang.ClassLoader classLoader;
    private static final java.util.concurrent.atomic.AtomicBoolean hooked = null;
    private static android.content.Context hostContext;
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Object> imSdkContextInstance = null;
    private static android.os.Handler mainHandler;
    private static final java.util.concurrent.atomic.AtomicLong myUid = null;
    private static volatile java.lang.String pendingProfileUid;
    private static android.app.ProgressDialog progressDialog;
    private static android.widget.ProgressBar renewProgressBar;
    private static android.app.AlertDialog renewProgressDialog;
    private static android.widget.TextView renewProgressText;
    private static android.widget.TextView renewTaskNameText;
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Object> sendMsgHandlerInstance = null;
    private static final java.util.concurrent.atomic.AtomicBoolean sendReady = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f382short = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, kevin.fun.hook.SparkRenewHelper.SparkInfo> sparkConversations = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.String> sparkUserNameMap = null;
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Object> templateMessage = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> uidNameCache = null;






    public static class SparkInfo {
        public java.lang.String conversationId;
        public long conversationShortId;
        public int conversationType;
        public int currentState;
        public int days;
        public boolean hasSpark;
        public boolean needsRenewal;
        public long otherUid;
        public java.lang.String stateText;

        static {
                return
        }

        public SparkInfo() {
                r2 = this;
                r2.<init>()
                int r1 = org.luckypray.dexkit.C1123.m10509()
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
                java.lang.String r0 = "q4gdvaa"
                java.lang.String r0 = org.luckypray.dexkit.C1125.m10629(r0)
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                java.io.PrintStream r1 = java.lang.System.out
                r1.println(r0)
            L26:
                return
        }
    }

    static {
            r6 = 0
            r4 = 0
            r0 = 2889(0xb49, float:4.048E-42)
            short[] r0 = new short[r0]
            r0 = {x01f6: FILL_ARRAY_DATA , data: [-9717, -8429, 1728, 1731, 1746, 1729, 1752, 1772, 1744, 1756, 1757, 1733, 1772, 1757, 1746, 1758, 1750, 1772, 1758, 1746, 1731, 2365, 2366, 2351, 2364, 2341, 2321, 2349, 2337, 2336, 2360, 2321, 2364, 2347, 2336, 2347, 2361, 2321, 2823, 2820, 2837, 2822, 2847, 2859, 2839, 2817, 2823, 2816, 2843, 2841, 2859, 2841, 2833, 2823, 2823, 2837, 2835, 2833, 2230, 2229, 2212, 2231, 2222, 2202, 2217, 2212, 2230, 2225, 2202, 2212, 2224, 2225, 2218, 2202, 2209, 2218, 2219, 2208, 2202, 2209, 2212, 2225, 2208, 1694, 1693, 1676, 1695, 1670, 1714, 1666, 1667, 1665, 1684, 1714, 1675, 1668, 1665, 1689, 1672, 1695, 2038, 2037, 2020, 2039, 2030, 2010, 2022, 2026, 2027, 2035, 2010, 2022, 2032, 2038, 2033, 2026, 2024, 2010, 2024, 2038, 2018, 2010, 1687, 1684, 1669, 1686, 1679, 1723, 1671, 1675, 1674, 1682, 1723, 1665, 1674, 1669, 1670, 1672, 1665, 1723, 1076, 1079, 1062, 1077, 1068, 1048, 1060, 1064, 1065, 1073, 1048, 1077, 1062, 1065, 1059, 1064, 1066, 1048, 1062, 1079, 1070, 1048, 2661, 2662, 2679, 2660, 2685, 2633, 2677, 2681, 2680, 2656, 2633, 2659, 2661, 2675, 2633, 2677, 2659, 2661, 2658, 2681, 2683, 2633, 594, 593, 576, 595, 586, 638, 595, 580, 591, 580, 598, 638, 580, 591, 576, 579, 589, 580, 683, 677, 694, 681, 686, 671, 688, 690, 677, 678, 691, 303, 300, 315, 317, 299, 2976, 2987, 2979, 1131, 1144, 1123, 1123, 1140, 925, 920, 924, 914, 1659, 1656, 1633, 1650, 1699, 1724, 1718, 1726, 1565, 1561, 1539, 1560, 1545, 2809, 2789, 2815, 2810, 3275, 3294, 3291, 3270, 15238, 3037, 3059, 3040, 3071, 3064, 15239, 2858, 2856, 2873, 2830, 2850, 2851, 2873, 2856, 2851, 2873, 2363, 2356, 2359, 2358, 2365, 12707, 504, 470, 453, 474, 477, 12706, 403, 25318, -32252, 27707, 25052, 27538, 26316, 24241, 24459, 393, 441, 1121, 1122, 1139, 1120, 1145, 1101, 1137, 1149, 1148, 1124, 1101, 1137, 1127, 1121, 1126, 1149, 1151, 1101, 1151, 1121, 1141, 1101, 727, 724, 709, 726, 719, 763, 711, 715, 714, 722, 763, 721, 727, 705, 763, 711, 721, 727, 720, 715, 713, 763, 11322, 2944, 24738, 25536, 30283, -31599, 11413, -3014, 2581, 21936, 29912, 31326, -30588, 2327, 2315, 2310, 2424, 2402, 27834, 31861, 19837, -30278, 558, 547, 605, 583, 26256, 24575, -28547, 25032, 2141, 2143, 2126, 2169, 2133, 2132, 2124, 2143, 2120, 2121, 2139, 2126, 2131, 2133, 2132, 2158, 2115, 2122, 2143, 1627, 1625, 1608, 1663, 1619, 1618, 1610, 1625, 1614, 1615, 1629, 1608, 1621, 1619, 1618, 1653, 1624, 13968, 1739, 1765, 1782, 1769, 1774, 13969, 1696, 18510, 1696, 1732, 1753, 1736, 1775, 1775, 1771, 1710, 1769, 1781, 1779, 1765, 1778, 1749, 1769, 1764, 1696, -31433, 21846, 1696, 1773, 1785, 1749, 1769, 1764, 1696, 24497, -29787, 1722, 1696, 15361, 3162, 3188, 3175, 3192, 3199, 15360, 3121, 3188, 3177, 3173, 3171, 3184, 3186, 3173, 3166, 3173, 3193, 3188, 3171, 3140, 3192, 3189, 3121, 21267, 21033, 3115, 3121, 433, 435, 418, 404, 420, 447, 434, 433, 435, 2732, 2720, 2721, 2721, 2730, 2732, 2747, 2712, 2748, 779, 778, 805, 788, 788, 801, 778, 784, 769, 790, 802, 779, 790, 769, 771, 790, 779, 785, 778, 768, 3066, 3067, 3014, 3056, 3046, 3046, 3068, 3066, 3067, 3033, 3068, 3046, 3041, 3009, 3060, 3063, 3014, 3069, 3066, 3042, 2439, 2436, 2453, 2438, 2463, 2475, 2455, 2459, 2458, 2434, 2475, 2455, 2433, 2439, 2432, 2459, 2457, 2475, 2457, 2439, 2451, 2475, 575, 572, 557, 574, 551, 531, 559, 547, 546, 570, 531, 546, 557, 545, 553, 531, 545, 557, 572, 531, 842, 841, 856, 843, 850, 870, 858, 854, 855, 847, 870, 843, 856, 855, 861, 854, 852, 870, 856, 841, 848, 870, 486, 493, 485, -12189, -10885, 523, 520, 537, 522, 531, 551, 539, 525, 523, 524, 535, 533, 551, 533, 541, 523, 523, 537, 543, 541, 1662, 1608, 1603, 1609, 1632, 1630, 1610, 1637, 1612, 1603, 1609, 1601, 1608, 1631, 1630, 13479, 1276, 1234, 1217, 1246, 1241, 13478, 1175, 1278, 1274, 1252, 1235, 1244, 1268, 1240, 1241, 1219, 1234, 1231, 1219, 19085, 32461, -1093, 19130, -31670, 22188, 23117, 1175, 1252, 1234, 1241, 1235, 1274, 1220, 1232, 1279, 1238, 1241, 1235, 1243, 1234, 1221, 13850, 1601, 1647, 1660, 1635, 1636, 13851, 1578, 24974, -27094, 1578, 1625, 1647, 1636, 1646, 1607, 1657, 1645, 1602, 1643, 1636, 1646, 1638, 1647, 1656, 1578, 24379, -29905, 1584, 1536, 14947, 2616, 2582, 2565, 2586, 2589, 14946, 2643, 22632, 21641, 2619, 2578, 2589, 2583, 2591, 2582, 2561, 21314, -30890, 2633, 2681, 595, 604, 607, 606, 597, 12835, 632, 598, 581, 602, 605, 12834, 531, 28603, 25180, 26642, 25932, 19465, 30793, -705, 19518, -32050, 20520, 23753, 30793, 531, 638, 598, 576, 576, 594, 596, 598, -705, 31098, 23990, 29996, 22957, 531, 638, 598, 576, 576, 594, 596, 598, 531, 26642, 25932, 2535, 2532, 2557, 2542, 25760, -28744, 2053, 2048, 2052, 2058, 32662, -28838, 3106, 3113, 3105, -30226, 31021, 1721, 1725, 1703, 1724, 1709, -28719, 23401, 2918, 2933, 2926, 2926, 2937, 26454, 30809, 1877, 1866, 1856, 1864, -30651, -30625, 1544, 1556, 1550, 1547, 27790, -26243, 27448, 2832, 2821, 2816, 2845, 21897, 22013, 18437, 28811, 18629, 24358, 1377, 1378, 1397, 1395, 1381, 21618, 21377, -31427, -31454, 19784, 30445, -30673, -30689, 730, 729, 704, 723, 1739, 1751, 1751, 1747, 1744, 1689, 1676, 1676, 1730, 1747, 1738, 1677, 1744, 1750, 1754, 1730, 1741, 1748, 1677, 1728, 1741, 1676, 1730, 1747, 1738, 1676, 1743, 1740, 1749, 1734, 1677, 1747, 1739, 1747, 1169, 1172, 1168, 1182, 2393, 2373, 2373, 2369, 2370, 2315, 2334, 2334, 2384, 2369, 2392, 2335, 2370, 2372, 2376, 2384, 2399, 2374, 2335, 2386, 2399, 2334, 2384, 2369, 2392, 2334, 2368, 2374, 2377, 2393, 2335, 2369, 2393, 2369, 3323, 3312, 3320, 3057, 3053, 3053, 3049, 3050, 2979, 2998, 2998, 3064, 3049, 3056, 2999, 3050, 3052, 3040, 3064, 3063, 3054, 2999, 3066, 3063, 2998, 3064, 3049, 3056, 2998, 3053, 3056, 3064, 3063, 3070, 3062, 3052, 2999, 3049, 3057, 3049, 667, 671, 645, 670, 655, 1826, 1854, 1854, 1850, 1849, 1904, 1893, 1893, 1835, 1850, 1827, 1892, 1849, 1855, 1843, 1835, 1828, 1853, 1892, 1833, 1828, 1893, 1835, 1850, 1827, 1893, 1843, 1827, 1843, 1835, 1828, 1892, 1850, 1826, 1850, 2560, 2579, 2568, 2568, 2591, 573, 545, 545, 549, 550, 623, 634, 634, 564, 549, 572, 635, 550, 544, 556, 564, 571, 546, 635, 566, 571, 634, 564, 549, 572, 634, 562, 564, 570, 557, 572, 564, 570, 635, 549, 573, 549, 2418, 2413, 2407, 2415, 592, 588, 588, 584, 587, 514, 535, 535, 601, 584, 593, 534, 587, 589, 577, 601, 598, 591, 534, 603, 598, 535, 601, 584, 593, 535, 607, 589, 587, 592, 593, 534, 584, 592, 584, 1610, 1622, 1612, 1609, 3113, 3125, 3125, 3121, 3122, 3195, 3182, 3182, 3104, 3121, 3112, 3183, 3122, 3124, 3128, 3104, 3119, 3126, 3183, 3106, 3119, 3182, 3104, 3121, 3112, 3182, 3109, 3115, 3125, 3183, 3121, 3113, 3121, 389, 400, 405, 392, 1187, 1215, 1215, 1211, 1208, 1265, 1252, 1252, 1194, 1211, 1186, 1253, 1208, 1214, 1202, 1194, 1189, 1212, 1253, 1192, 1189, 1252, 1194, 1211, 1186, 1252, 1191, 1186, 1208, 1187, 1186, 1253, 1211, 1187, 1211, 1533, 1534, 1513, 1519, 1529, 1708, 1712, 1712, 1716, 1719, 1790, 1771, 1771, 1701, 1716, 1709, 1770, 1719, 1713, 1725, 1701, 1706, 1715, 1770, 1703, 1706, 1771, 1701, 1716, 1709, 1771, 1686, 1709, 1696, 1709, 1703, 1713, 1704, 1697, 1770, 1716, 1708, 1716, 3027, 3023, 3023, 3019, 3016, 2945, 2964, 2964, 3034, 3019, 3026, 2965, 3016, 3022, 3010, 3034, 3029, 3020, 2965, 3032, 3029, 2964, 3034, 3019, 3026, 2964, 3017, 3016, 3027, 3010, 2965, 3019, 3027, 3019, -11012, -11804, 2855, 2853, 2868, 890, 860, 842, 861, 770, 878, 840, 842, 833, 859, 1549, 1583, 1594, 1577, 1580, 1580, 1569, 1647, 1653, 1646, 1648, 13909, 1550, 1568, 1587, 1580, 1579, 13908, 1637, -28470, 24959, 25538, 28173, 26080, 21926, 21128, 22737, 22855, 22653, 1637, 1585, 1596, 1589, 1568, 1656, 3039, 2972, 2960, 2971, 2970, 3010, 3228, 3229, 3215, 3300, 3313, 15177, 2834, 2876, 2863, 2864, 2871, 15176, 2937, -25130, 27747, 28382, 25361, 17763, 28963, 2937, 2861, 2848, 2857, 2876, 2916, 13890, 1561, 1591, 1572, 1595, 1596, 13891, 1650, -31259, 21892, -28451, 24936, 25557, 28186, 24419, -29833, 1640, 1624, 502, 502, 502, 502, 418, 450, 450, 418, 491, 491, 2993, 2994, 2979, 2992, 2985, 2973, 2977, 2989, 2988, 2996, 2973, 2992, 2983, 2988, 2983, 2997, 2973, 3168, 3171, 3186, 3169, 3192, 3148, 3184, 3196, 3197, 3173, 3148, 3190, 3197, 3186, 3185, 3199, 3190, 3148, 2219, 2216, 2233, 2218, 2227, 2183, 2218, 2237, 2230, 2237, 2223, 2183, 2237, 2230, 2233, 2234, 2228, 2237, 2522, 2521, 2504, 2523, 2498, 2550, 2502, 2503, 2501, 2512, 2550, 2511, 2496, 2501, 2525, 2508, 2523, 1229, 1230, 1247, 1228, 1237, 1249, 1245, 1233, 1232, 1224, 1249, 1227, 1229, 1243, 1249, 1245, 1227, 1229, 1226, 1233, 1235, 1249, 21875, 26851, 20876, -25074, 28603, 27910, 24777, 22321, 23821, 18617, -31159, 18574, 31950, 24390, 19817, 23020, -31906, 22830, 19709, 21297, 22797, 11850, 11979, -2460, 30510, 31144, -29838, 21071, 27603, 31863, 29425, -32725, 23467, -28737, 25609, 29181, -27061, 18590, 1810, 1809, 1792, 1811, 1802, 1854, 1811, 1796, 1807, 1796, 1814, 1854, 1796, 1807, 1792, 1795, 1805, 1796, -12215, -10927, 24560, 25070, 24920, -31291, 21924, 21570, 30233, -31549, 24335, 21945, -1666, 21917, 18583, 25657, 21722, 25633, 22898, 18546, 18520, 32691, -31176, 23947, -29265, -1666, 22527, -30298, 20652, -30293, -26690, 24983, 29049, 13936, 1622, 1611, 1622, 1622, 1601, 1614, 1556, 1556, 1559, 1565, 1567, 1546, 1546, 1616, 1622, 1600, 1623, 1546, 1621, 1623, 1610, 1603, 1612, 1609, 1600, 1546, 2812, 2803, 2809, 2799, 2802, 2804, 2809, 2739, 2804, 2803, 2793, 2808, 2803, 2793, 2739, 2812, 2814, 2793, 2804, 2802, 2803, 2739, 2763, 2772, 2776, 2762, 695, 699, 697, 762, 679, 679, 762, 693, 698, 688, 678, 699, 701, 688, 762, 673, 691, 695, 762, 693, 675, 689, 697, 689, 13012, 655, 673, 690, 685, 682, 13013, -27938, -29437, 657, 653, 640, 24727, 24004, 19711, -25935, 23541, -28703, 766, 740, 24585, 26940, 26554, 23273, 28865, 26590, 19410, -25188, -32083, 22749, 19726, 26304, 27407, -28409, 24754, 25103, 28608, 29832, 24440, -2071, 969, 970, 987, 968, 977, 997, 982, 987, 969, 974, 997, 987, 975, 974, 981, 997, 990, 981, 980, 991, 997, 990, 987, 974, 991, 831, 796, 781, 798, 775, 830, 777, 770, 777, 795, 2781, 601, 419, 417, 432, 391, 427, 426, 434, 417, 438, 439, 421, 432, 429, 427, 426, 400, 445, 436, 417, 1037, 1039, 1054, 1065, 1029, 1028, 1052, 1039, 1048, 1049, 1035, 1054, 1027, 1029, 1028, 1059, 1038, 1079, 1068, 1077, 1077, 1102, 1100, 1117, 1130, 1094, 1095, 1119, 1100, 1115, 1114, 1096, 1117, 1088, 1094, 1095, 1146, 1089, 1094, 1115, 1117, 1120, 1101, 1445, 1447, 1462, 1415, 1466, 1462, 2824, 2899, 2826, 2822, 2823, 2842, 2828, 2826, 2844, 2845, 2816, 2847, 2828, 2870, 2826, 2817, 2824, 2845, 2870, 2829, 2824, 2845, 2824, 986, 976, 989, 977, 985, 995, 981, 978, 986, 979, 975, 1555, 1556, 1537, 1554, 1556, 3069, 3062, 3068, 971, 972, 985, 972, 989, 482, 487, 511, 501, 2318, 2335, 2306, 2318, 12901, 574, 528, 515, 540, 539, 12900, 597, 517, 519, 538, 534, 528, 518, 518, 566, 538, 539, 515, 528, 519, 518, 532, 513, 540, 538, 539, 550, 517, 532, 519, 542, 23927, 23629, 591, 639, 13173, 814, 768, 787, 780, 779, 13172, 837, 30764, 23776, -28960, 26259, -919, 25679, 26195, -27229, 20821, 29454, -32300, 26133, 24587, 27483, 26951, -25929, 24129, 31770, -28992, 26881, 28447, 3195, 17018, 26448, 22622, 24281, 17259, -25156, 27073, 20588, -30812, 2999, 2996, 2981, 2998, 2991, 2971, 2984, 2981, 2999, 2992, 2971, 2981, 2993, 2992, 2987, 2971, 2976, 2987, 2986, 2977, 2971, 2976, 2981, 2992, 2977, 26693, 27916, 31342, -30540, 17615, 21292, 22519, 21249, 32259, -31294, 15478, 3117, 3075, 3088, 3087, 3080, 15479, 3142, 24503, -25497, 25694, 21413, 27468, 20567, 29324, -3222, 24496, 25070, -29300, 24270, 29323, 31757, -28969, 21049, -28183, 27088, 24107, 26306, 24025, 32514, 482, 20999, 20237, 20640, 25507, 21312, 21049, 20456, 26249, 30761, 19977, 28200, 27859, 21990, 20581, -30147, 12909, 566, 536, 523, 532, 531, 12908, 605, 20908, -28036, 27205, 23998, 19536, -28055, 23372, 26421, -655, 21025, 26911, 31888, 29206, -32564, 30906, 30268, -31514, 24027, 25671, 1629, 1629, 26220, 22310, -1715, 2932, 26990, 23009, -2972, 718, 23541, -28703, -546, 3242, 28325, 21230, 31531, 32490, 1510, 586, 19520, 13682, 1321, 1287, 1300, 1291, 1292, 13683, 1346, 31631, 29961, -30765, 23635, -30649, 1346, 1335, 1323, 1318, 1375, 1002, 23267, 26298, 1015, 22843, 24389, 26329, 1257, 2321, 27425, 23470, 2316, 615, 23414, -28830, 634, 13388, 1047, 1081, 1066, 1077, 1074, 13389, 1148, -31306, 22260, 31409, 29751, -30995, 23390, 23140, 1126, 1148, 30620, 31002, -29760, 22131, 22345, 2379, 2385, -11705, -10401, 726, 725, 708, 727, 718, 762, 710, 720, 726, 721, 714, 712, 762, 712, 704, 726, 726, 708, 706, 704, 689, 690, 675, 688, 681, 669, 673, 685, 684, 692, 669, 688, 679, 684, 679, 693, 669, 538, 530, 516, 516, 534, 528, 530, 520, 516, 530, 515, 520, 539, 536, 532, 534, 539, 520, 538, 530, 515, 543, 536, 531, 15190, 2829, 2851, 2864, 2863, 2856, 15191, 2918, 2863, 2859, 2837, 2850, 2861, 2821, 2857, 2856, 2866, 2851, 2878, 2866, 17788, 28988, -2998, 22672, 26318, 22679, -25785, 1586, 1572, 1589, 1554, 1572, 1583, 1573, 1572, 1587, 1508, 1522, 1507, 1492, 1528, 1529, 1505, 1522, 1509, 1508, 1526, 1507, 1534, 1528, 1529, 1502, 1523, 1752, 1742, 1759, 1768, 1732, 1733, 1757, 1742, 1753, 1752, 1738, 1759, 1730, 1732, 1733, 1784, 1731, 1732, 1753, 1759, 1762, 1743, 2163, 2149, 2164, 2115, 2159, 2158, 2166, 2149, 2162, 2163, 2145, 2164, 2153, 2159, 2158, 2132, 2169, 2160, 2149, 433, 423, 438, 399, 433, 421, 406, 443, 434, 423, 2475, 2493, 2476, 2445, 2477, 2481, 2492, 1305, 1295, 1310, 1319, 1305, 1293, 1315, 1294, 2707, 2693, 2708, 2723, 2706, 2693, 2689, 2708, 2693, 2692, 2721, 2708, 2162, 2160, 2145, 2137, 2170, 2166, 2164, 2169, 2128, 2157, 2145, 3321, 3248, 3325, 3307, 3299, 3326, 3285, 3308, 3301, 3320, 3285, 3321, 3311, 3300, 3310, 1022, 1011, 1018, 1007, 399, 392, 405, 402, 404, 403, 389, 402, 399, 393, 392, 441, 402, 415, 406, 387, 763, 742, 759, 767, 717, 742, 747, 738, 759, 717, 766, 765, 753, 755, 766, 456, 473, 452, 456, 2805, 2788, 2803, 2807, 2786, 2803, 2802, 2775, 2786, 3327, 3301, 3273, 3317, 3319, 3300, 3314, 1117, 1091, 1111, 1144, 1113, 1118, 1092, 1016, 1006, 1020, 973, 992, 1001, 1020, 317, 299, 314, 269, 289, 288, 314, 299, 288, 314, 2223, 2201, 2194, 2200, 2225, 2191, 2203, 2228, 2205, 2194, 2200, 2192, 2201, 2190, 2893, 2917, 2931, 2931, 2913, 2919, 2917, 2046, 2021, 2002, 1990, 1986, 2002, 1988, 1987, 2043, 2014, 1988, 1987, 2002, 2009, 2002, 1989, 12901, 574, 528, 515, 540, 539, 12900, 597, 9529, 597, 25951, 24587, 20549, 21257, 22988, 29937, 597, 518, 528, 539, 529, 597, 26572, 28320, 13433, 1058, 1036, 1055, 1024, 1031, 13432, 1097, 8997, 1097, 19044, 24902, 26472, 29421, 22443, 24857, 19011, 24857, 1107, 1097, 14175, 1796, 1834, 1849, 1830, 1825, 14174, 1903, 8195, 1903, 21662, -26802, 30500, -31234, 22605, 22903, 1909, 1861, 14854, 2653, 2675, 2656, 2687, 2680, 14855, 2614, 32009, 20872, 22983, -26089, 21780, 21550, 2614, 2677, 2679, 2659, 2661, 2675, 2604, 2588, 15231, 2852, 2826, 2841, 2822, 2817, 15230, 2895, 22718, -25746, 25431, 21676, 29781, 21086, -2973, 28303, 26554, 30082, 31492, -30242, 2895, 2823, 2830, 2817, 2827, 2819, 2826, 2845, 2898, 947, 1022, 992, 1012, 942, 2552, 2555, 2538, 2553, 2528, 2516, 2536, 2532, 2533, 2557, 2516, 2536, 2558, 2552, 2559, 2532, 2534, 2516, 2534, 2552, 2540, 2516, 1479, 1476, 1493, 1478, 1503, 1515, 1495, 1499, 1498, 1474, 1515, 1489, 1498, 1493, 1494, 1496, 1489, 1515, 1370, 1369, 1352, 1371, 1346, 1398, 1354, 1350, 1351, 1375, 1398, 1371, 1352, 1351, 1357, 1350, 1348, 1398, 1352, 1369, 1344, 1398, 2831, 2828, 2845, 2830, 2839, 2851, 2835, 2834, 2832, 2821, 2851, 2842, 2837, 2832, 2824, 2841, 2830, 2728, 2731, 2746, 2729, 2736, 2692, 2744, 2740, 2741, 2733, 2692, 2734, 2728, 2750, 2692, 2744, 2734, 2728, 2735, 2740, 2742, 2692, -28981, 20541, -32590, 23234, 20241, 20701, 23265, -30714, 31958, -32174, 22562, 19953, 21053, 22529, 21623, 27177, 19270, 24515, 12840, 627, 605, 590, 593, 598, 12841, 536, 587, 592, 599, 591, 635, 599, 598, 590, 605, 586, 587, 601, 588, 593, 599, 598, 635, 589, 587, 588, 599, 597, 629, 587, 607, 636, 593, 601, 596, 599, 607, 23866, 23552, 514, 562, 27001, -32159, 30941, -30703, -30447, 31186, -30109, 24283, 28664, 28919, -29097, -29107, 26480, -28029, 24774, 23394, 23318, 18158, 32352, 17966, 20941, 23211, 23896, -29724, -29701, 2144, 2147, 2170, 2153, 2770, 2775, 2771, 2781, 1994, 1985, 1993, 1810, 1814, 1804, 1815, 1798, 1265, 1250, 1273, 1273, 1262, 2386, 2381, 2375, 2383, 1686, 1674, 1680, 1685, 1753, 1740, 1737, 1748, 807, 804, 819, 821, 803, -27334, 26586, -27716, 25097, 24756, 28027, 31048, 21176, 22122, 26676, 32249, 24077, 14355, 2120, 2150, 2165, 2154, 2157, 14354, 2083, 2160, 2155, 2156, 2164, 2129, 2146, 2157, 2151, 2156, 2158, 2114, 2163, 2154, 2128, 2150, 2159, 2150, 2144, 2167, 2119, 2154, 2146, 2159, 2156, 2148, 22273, 22075, 2105, 2057, 29737, -30989, 23871, 22409, 24370, 26286, -29814, 22728, 29837, 31243, -30511, 2472, 2475, 2490, 2473, 2480, 2436, 2473, 2494, 2485, 2494, 2476, 2436, 2494, 2485, 2490, 2489, 2487, 2494, 17075, 27208, 30028, 31773, -28985, 22415, -30805, 29402, 21400, -27412, 25945, 26596, 27179, 20876, 20580, 24833, -31863, 23033, 19498, 21478, 23002, 13916, 1543, 1577, 1594, 1573, 1570, 13917, 1644, 1599, 1572, 1571, 1595, 1567, 1596, 1581, 1598, 1575, 1537, 1581, 1570, 1581, 1579, 1577, 1544, 1573, 1581, 1568, 1571, 1579, 22862, 22644, 1654, 1606, 9331, 23917, 3132, 3129, 3192, 3132, 17233, 31863, -29011, 21857, 24535, 3132, 3243, 3132, 3129, 3192, 3132, 16950, 21401, 29425} // fill-array
            kevin.fun.hook.SparkRenewHelper.f382short = r0
            short[] r0 = m7367()
            int r1 = androidx.core.ktx.C1070.f96
            r1 = r1 ^ 556(0x22c, float:7.79E-43)
            r2 = 566(0x236, float:7.93E-43)
            java.lang.String r0 = androidx.activity.C1066.m468(r0, r4, r1, r2)
            kevin.fun.hook.SparkRenewHelper.DEFAULT_MESSAGE = r0
            short[] r0 = m7367()
            r1 = 2
            int r2 = androidx.activity.C1064.f90
            r2 = r2 ^ 505(0x1f9, float:7.08E-43)
            r3 = 1715(0x6b3, float:2.403E-42)
            java.lang.String r0 = androidx.customview.C1075.m1138(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_CONV_NAME_MAP = r0
            short[] r0 = m7367()
            r1 = 21
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-116(0xffffffffffffff8c, float:NaN))
            r3 = 2382(0x94e, float:3.338E-42)
            java.lang.String r0 = androidx.drawerlayout.C1077.m1343(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_CONV_RENEW_PREFIX = r0
            short[] r0 = m7367()
            r1 = 38
            int r2 = androidx.emoji2.C1080.f106
            r2 = r2 ^ 365(0x16d, float:5.11E-43)
            r3 = 2932(0xb74, float:4.109E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_CUSTOM_MESSAGE = r0
            short[] r0 = m7367()
            r1 = 58
            int r2 = androidx.lifecycle.process.C1087.f113
            r2 = r2 ^ (-631(0xfffffffffffffd89, float:NaN))
            r3 = 2245(0x8c5, float:3.146E-42)
            java.lang.String r0 = androidx.viewpager.C1108.m3518(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_LAST_AUTO_DONE_DATE = r0
            short[] r0 = m7367()
            r1 = 83
            int r2 = androidx.drawerlayout.C1077.f103
            r2 = r2 ^ 271(0x10f, float:3.8E-43)
            r3 = 1773(0x6ed, float:2.485E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1814(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_ONLY_SPARK_FILTER = r0
            short[] r0 = m7367()
            r1 = 100
            int r2 = kevin.fun.hook.webdav.C1119.f418
            r2 = r2 ^ 304(0x130, float:4.26E-43)
            r3 = 1925(0x785, float:2.697E-42)
            java.lang.String r0 = com.tencent.mmkv.C1109.m3629(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_SPARK_CONV_CUSTOM_MSG_PREFIX = r0
            short[] r0 = m7367()
            r1 = 122(0x7a, float:1.71E-43)
            int r2 = androidx.core.C1072.f98
            r2 = r2 ^ (-526(0xfffffffffffffdf2, float:NaN))
            r3 = 1764(0x6e4, float:2.472E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_SPARK_CONV_ENABLE_PREFIX = r0
            short[] r0 = m7367()
            r1 = 140(0x8c, float:1.96E-43)
            int r2 = androidx.activity.C1066.f92
            r2 = r2 ^ 803(0x323, float:1.125E-42)
            r3 = 1095(0x447, float:1.534E-42)
            java.lang.String r0 = androidx.appcompat.resources.C1068.m652(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_SPARK_CONV_RANDOM_API_PREFIX = r0
            short[] r0 = m7367()
            r1 = 162(0xa2, float:2.27E-43)
            int r2 = androidx.versionedparcelable.C1107.f133
            r2 = r2 ^ 658(0x292, float:9.22E-43)
            r3 = 2582(0xa16, float:3.618E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_SPARK_CONV_USE_CUSTOM_PREFIX = r0
            short[] r0 = m7367()
            r1 = 184(0xb8, float:2.58E-43)
            int r2 = androidx.loader.C1098.f124
            r2 = r2 ^ (-817(0xfffffffffffffccf, float:NaN))
            r3 = 545(0x221, float:7.64E-43)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.KEY_SPARK_ENABLE = r0
            short[] r0 = m7367()
            r1 = 202(0xca, float:2.83E-43)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r2 = r2 ^ (-943(0xfffffffffffffc51, float:NaN))
            r3 = 704(0x2c0, float:9.87E-43)
            java.lang.String r0 = androidx.vectordrawable.C1103.m3132(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.PREF_NAME = r0
            short[] r0 = m7367()
            r1 = 213(0xd5, float:2.98E-43)
            int r2 = androidx.versionedparcelable.C1106.f132
            r2 = r2 ^ 137(0x89, float:1.92E-43)
            r3 = 334(0x14e, float:4.68E-43)
            java.lang.String r0 = androidx.core.C1073.m1028(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_ABUSE = r0
            short[] r0 = m7367()
            r1 = 218(0xda, float:3.05E-43)
            int r2 = androidx.lifecycle.process.C1091.f117
            r2 = r2 ^ (-489(0xfffffffffffffe17, float:NaN))
            r3 = 3012(0xbc4, float:4.221E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1920(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_DOG = r0
            short[] r0 = m7367()
            r1 = 221(0xdd, float:3.1E-43)
            int r2 = androidx.core.ktx.C1071.f97
            r2 = r2 ^ 903(0x387, float:1.265E-42)
            r3 = 1037(0x40d, float:1.453E-42)
            java.lang.String r0 = androidx.loader.C1098.m2787(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_FUNNY = r0
            short[] r0 = m7367()
            r1 = 226(0xe2, float:3.17E-43)
            int r2 = androidx.interpolator.C1083.f109
            r2 = r2 ^ (-442(0xfffffffffffffe46, float:NaN))
            r3 = 1015(0x3f7, float:1.422E-42)
            java.lang.String r0 = kevin.fun.hook.C1120.m8645(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_JOKE = r0
            short[] r0 = m7367()
            r1 = 230(0xe6, float:3.22E-43)
            int r2 = kevin.fun.hook.audio.C1115.f404
            r2 = r2 ^ 806(0x326, float:1.13E-42)
            r3 = 1559(0x617, float:2.185E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2213(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_LOVE = r0
            short[] r0 = m7367()
            r1 = 234(0xea, float:3.28E-43)
            int r2 = androidx.versionedparcelable.C1106.f132
            r2 = r2 ^ 136(0x88, float:1.9E-43)
            r3 = 1747(0x6d3, float:2.448E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8020(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_POEM = r0
            short[] r0 = m7367()
            r1 = 238(0xee, float:3.34E-43)
            int r2 = androidx.lifecycle.runtime.C1092.f118
            r2 = r2 ^ 794(0x31a, float:1.113E-42)
            r3 = 1644(0x66c, float:2.304E-42)
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_QUOTE = r0
            short[] r0 = m7367()
            r1 = 243(0xf3, float:3.4E-43)
            int r2 = androidx.lifecycle.runtime.C1092.f118
            r2 = r2 ^ 795(0x31b, float:1.114E-42)
            r3 = 2698(0xa8a, float:3.781E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_SOUP = r0
            short[] r0 = m7367()
            r1 = 247(0xf7, float:3.46E-43)
            int r2 = androidx.lifecycle.livedata.C1085.f111
            r2 = r2 ^ 777(0x309, float:1.089E-42)
            r3 = 3263(0xcbf, float:4.572E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.RANDOM_API_TADY = r0
            short[] r0 = m7367()
            r1 = 251(0xfb, float:3.52E-43)
            int r2 = androidx.drawerlayout.C1077.f103
            r2 = r2 ^ 281(0x119, float:3.94E-43)
            r3 = 2966(0xb96, float:4.156E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r1, r2, r3)
            kevin.fun.hook.SparkRenewHelper.TAG = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            kevin.fun.hook.SparkRenewHelper.hooked = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            kevin.fun.hook.SparkRenewHelper.autoRenewTriggered = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            kevin.fun.hook.SparkRenewHelper.sendReady = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r2 = -959(0xfffffffffffffc41, double:NaN)
            int r1 = androidx.loader.C1096.f122
            long r4 = (long) r1
            long r2 = r2 ^ r4
            r0.<init>(r2)
            kevin.fun.hook.SparkRenewHelper.myUid = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            kevin.fun.hook.SparkRenewHelper.sparkConversations = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            kevin.fun.hook.SparkRenewHelper.allConversations = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r6)
            kevin.fun.hook.SparkRenewHelper.sendMsgHandlerInstance = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r6)
            kevin.fun.hook.SparkRenewHelper.templateMessage = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r6)
            kevin.fun.hook.SparkRenewHelper.imSdkContextInstance = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            kevin.fun.hook.SparkRenewHelper.uidNameCache = r0
            kevin.fun.hook.SparkRenewHelper.pendingProfileUid = r6
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.SparkRenewHelper.MAIN_HANDLER = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            kevin.fun.hook.SparkRenewHelper.sparkUserNameMap = r0
            return
    }

    public SparkRenewHelper() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.viewpager.C1108.m3542()
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
            if (r1 < 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "pjYTUmlXpb7WbpcSj6ul5jNL6ecI"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ProgressBar _$$Nest$sfgetrenewProgressBar() {
            android.widget.ProgressBar r0 = m7374()
            return r0
    }

    static /* bridge */ /* synthetic */ android.app.AlertDialog _$$Nest$sfgetrenewProgressDialog() {
            android.app.AlertDialog r0 = m7359()
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView _$$Nest$sfgetrenewProgressText() {
            android.widget.TextView r0 = m7384()
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView _$$Nest$sfgetrenewTaskNameText() {
            android.widget.TextView r0 = m7396()
            return r0
    }

    static /* bridge */ /* synthetic */ void _$$Nest$sfputrenewProgressBar(android.widget.ProgressBar r0) {
            kevin.fun.hook.SparkRenewHelper.renewProgressBar = r0
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$sfputrenewProgressDialog(android.app.AlertDialog r0) {
            kevin.fun.hook.SparkRenewHelper.renewProgressDialog = r0
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$sfputrenewProgressText(android.widget.TextView r0) {
            kevin.fun.hook.SparkRenewHelper.renewProgressText = r0
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$sfputrenewTaskNameText(android.widget.TextView r3) {
            kevin.fun.hook.SparkRenewHelper.renewTaskNameText = r3
            int r1 = androidx.loader.C1098.m2793()
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L25;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r1 < 0) goto Le
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            java.lang.String r0 = "uM7dL9c9fl49wuib9n"
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2359(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L25:
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$smdismissProgressDialog() {
            m7389()
            return
    }

    static /* bridge */ /* synthetic */ int _$$Nest$smdp(android.content.Context r1, int r2) {
            int r0 = m7354(r1, r2)
            return r0
    }

    public static void captureImSdkContext(java.lang.Object r2) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L34;
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
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L33;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 > 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            java.lang.String r0 = "hRFCY4qhJ9IFrKYCT"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L33:
            return
        L34:
            java.util.concurrent.atomic.AtomicReference r0 = m7408()
            androidx.vectordrawable.C1104.m3224(r0, r2)
            m7412()
            goto L33
    }

    public static void captureSendMsgHandler(java.lang.Object r2) {
            java.util.concurrent.atomic.AtomicReference r0 = m7391()
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L22;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r1 != 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            java.util.concurrent.atomic.AtomicReference r0 = m7391()
            androidx.vectordrawable.C1104.m3224(r0, r2)
            m7412()
        L22:
            return
    }

    public static void captureTemplateMessage(java.lang.Object r6) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L34;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r6 != 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            int r1 = androidx.emoji2.C1080.m1539()
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L33;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 < 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            java.lang.String r0 = "xqU"
            java.lang.String r0 = androidx.loader.C1099.m2832(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L33:
            return
        L34:
            r0 = 0
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L58
            r2 = 258(0x102, float:3.62E-43)
            int r3 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L58
            r3 = r3 ^ 654(0x28e, float:9.16E-43)
            r4 = 2893(0xb4d, float:4.054E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1091.m2229(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L58
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = m7362(r6, r1, r2)     // Catch: java.lang.Throwable -> L58
            r1 = 1864(0x748, float:2.612E-42)
        L4e:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L54;
                case 47483: goto L59;
                default: goto L53;
            }
        L53:
            goto L4e
        L54:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L4e
        L58:
            r1 = move-exception
        L59:
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L5c:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L64;
                case 45: goto L96;
                case 76: goto L6e;
                case 239: goto L68;
                default: goto L63;
            }
        L63:
            goto L5c
        L64:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L5c
        L68:
            if (r0 != 0) goto L64
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L5c
        L6e:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> Lde
            r1 = 48891(0xbefb, float:6.8511E-41)
        L75:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 22: goto L7d;
                case 503: goto L92;
                default: goto L7c;
            }     // Catch: java.lang.Throwable -> Lde
        L7c:
            goto L75
        L7d:
            boolean r1 = androidx.documentfile.C1076.m1246(r0)     // Catch: java.lang.Throwable -> Lde
            r0 = 49666(0xc202, float:6.9597E-41)
        L84:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L8c;
                case 50: goto L9b;
                case 76: goto L33;
                case 83: goto L9f;
                default: goto L8b;
            }     // Catch: java.lang.Throwable -> Lde
        L8b:
            goto L84
        L8c:
            if (r1 == 0) goto L9b
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L84
        L92:
            r1 = 48922(0xbf1a, float:6.8554E-41)
            goto L75
        L96:
            java.lang.String r0 = androidx.loader.C1099.m2839(r0)     // Catch: java.lang.Throwable -> Lde
            goto L7d
        L9b:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L84
        L9f:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L109
            r1 = 268(0x10c, float:3.76E-43)
            int r2 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L109
            r2 = r2 ^ (-450(0xfffffffffffffe3e, float:NaN))
            r3 = 2392(0x958, float:3.352E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1814(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L109
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L109
            java.lang.Object r6 = m7362(r6, r0, r1)     // Catch: java.lang.Throwable -> L109
            r0 = 49790(0xc27e, float:6.977E-41)
        Lb9:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto Lc1;
                case 241: goto Lda;
                default: goto Lc0;
            }
        Lc0:
            goto Lb9
        Lc1:
            java.util.concurrent.atomic.AtomicReference r0 = m7352()     // Catch: java.lang.Throwable -> Lde
            androidx.vectordrawable.C1104.m3224(r0, r6)     // Catch: java.lang.Throwable -> Lde
            m7412()     // Catch: java.lang.Throwable -> Lde
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lce:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto Ld6;
                case 1711: goto L33;
                default: goto Ld5;
            }
        Ld5:
            goto Lce
        Ld6:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto Lce
        Lda:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Lb9
        Lde:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7367()
            r3 = 273(0x111, float:3.83E-43)
            int r4 = com.tencent.mmkv.C1109.f135
            r4 = r4 ^ (-502(0xfffffffffffffe0a, float:NaN))
            r5 = 435(0x1b3, float:6.1E-43)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
            goto L33
        L109:
            r0 = move-exception
            goto Lc1
    }

    private static void checkReadyState() {
            java.lang.Class<kevin.fun.hook.SparkRenewHelper> r2 = kevin.fun.hook.SparkRenewHelper.class
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference r0 = m7391()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L40;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L4a
        L12:
            goto Ld
        L13:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Ld
        L16:
            if (r1 == 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.util.concurrent.atomic.AtomicReference r0 = m7352()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L40;
                case 500: goto L33;
                default: goto L2a;
            }     // Catch: java.lang.Throwable -> L4a
        L2a:
            goto L25
        L2b:
            if (r1 == 0) goto L30
            r0 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            r0 = 1
            r1 = 1864(0x748, float:2.612E-42)
        L36:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L3c;
                case 47483: goto L41;
                default: goto L3b;
            }     // Catch: java.lang.Throwable -> L4a
        L3b:
            goto L36
        L3c:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L36
        L40:
            r0 = 0
        L41:
            java.util.concurrent.atomic.AtomicBoolean r1 = m7394()     // Catch: java.lang.Throwable -> L4a
            androidx.drawerlayout.C1077.m1308(r1, r0)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)
            return
        L4a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r0
    }

    private static void clearConversationCustomMessage(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m7367()
            r2 = 291(0x123, float:4.08E-43)
            int r3 = androidx.lifecycle.livedata.C1086.f112
            r3 = r3 ^ 943(0x3af, float:1.321E-42)
            r4 = 1042(0x412, float:1.46E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1413(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r5)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            java.lang.String r1 = androidx.emoji2.C1080.m1562()
            androidx.core.C1073.m1055(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m7367()
            r2 = 313(0x139, float:4.39E-43)
            int r3 = androidx.activity.C1065.f91
            r3 = r3 ^ (-35)
            r4 = 676(0x2a4, float:9.47E-43)
            java.lang.String r1 = androidx.loader.C1094.m2495(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r5)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            r1 = 0
            androidx.interpolator.C1081.m1588(r0, r1)
            int r1 = androidx.activity.C1064.m377()
            r0 = 1616(0x650, float:2.264E-42)
        L53:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L59;
                case 49: goto L5c;
                case 204: goto L61;
                case 239: goto L6c;
                default: goto L58;
            }
        L58:
            goto L53
        L59:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L53
        L5c:
            if (r1 < 0) goto L59
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L53
        L61:
            java.lang.String r0 = "Mvu7S7e0FYxrniyb1"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L6c:
            return
    }

    private static android.widget.LinearLayout createOptionRow(android.content.Context r10, java.lang.String r11, boolean r12) {
            r1 = -119723(0xfffffffffffe2c55, float:NaN)
            r9 = 0
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r10)
            androidx.customview.C1074.m1119(r2, r9)
            int r0 = kevin.fun.hook.webdav.C1118.f417
            r0 = r0 ^ (-379(0xfffffffffffffe85, float:NaN))
            androidx.emoji2.C1080.m1542(r2, r0)
            int r3 = kevin.fun.hook.webdav.C1119.f418
            r3 = r3 ^ 306(0x132, float:4.29E-43)
            int r4 = m7354(r10, r3)
            int r5 = m7354(r10, r0)
            int r3 = m7354(r10, r3)
            int r0 = m7354(r10, r0)
            androidx.drawerlayout.C1077.m1314(r2, r4, r5, r3, r0)
            android.graphics.drawable.Drawable r0 = m7401(r10)
            androidx.activity.C1065.m397(r2, r0)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r10)
            androidx.lifecycle.process.C1087.m1946(r3, r11)
            r0 = 1098907648(0x41800000, float:16.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r0)
            r0 = 1616(0x650, float:2.264E-42)
        L40:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L46;
                case 49: goto L49;
                case 204: goto L4e;
                case 239: goto L82;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L40
        L49:
            if (r12 == 0) goto L46
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L40
        L4e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L50:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L56;
                case 54: goto L59;
                default: goto L55;
            }
        L55:
            goto L50
        L56:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L50
        L59:
            r0 = r1
        L5a:
            kevin.fun.hook.webdav.C1118.m8517(r3, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r4 = androidx.vectordrawable.C1103.f129
            r4 = r4 ^ (-270(0xfffffffffffffef2, float:NaN))
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r9, r4, r5)
            androidx.lifecycle.livedata.C1085.m1822(r3, r0)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r10)
            int r0 = androidx.core.C1072.f98
            r5 = r0 ^ (-536(0xfffffffffffffde8, float:NaN))
            r0 = 1864(0x748, float:2.612E-42)
        L76:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L7c;
                case 47384: goto Ld8;
                case 47417: goto L8a;
                case 47483: goto L86;
                default: goto L7b;
            }
        L7b:
            goto L76
        L7c:
            if (r12 == 0) goto L86
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L76
        L82:
            r0 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            goto L5a
        L86:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L76
        L8a:
            short[] r0 = m7367()
            r6 = 335(0x14f, float:4.7E-43)
            r7 = 1
            r8 = 2857(0xb29, float:4.004E-42)
            java.lang.String r0 = androidx.customview.C1075.m1138(r0, r6, r7, r8)
            androidx.lifecycle.process.C1087.m1946(r4, r0)
            r0 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r4, r0)
            kevin.fun.hook.webdav.C1118.m8517(r4, r1)
            androidx.loader.C1095.m2596(r4, r9)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        La8:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto Lb0;
                case 239: goto Ld4;
                default: goto Laf;
            }
        Laf:
            goto La8
        Lb0:
            int r0 = m7354(r10, r5)
            kevin.fun.hook.audio.C1117.m8126(r4, r0, r9, r9, r9)
            androidx.activity.C1064.m372(r2, r3)
            androidx.activity.C1064.m372(r2, r4)
            r0 = -268435515(0xffffffffefffffc5, float:-1.5845577E29)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r0 = r0 ^ r1
            java.lang.Boolean r1 = androidx.loader.C1096.m2664(r12)
            androidx.vectordrawable.C1105.m3297(r2, r0, r1)
            r0 = -268436355(0xffffffffeffffc7d, float:-1.5844783E29)
            int r1 = androidx.loader.C1095.f121
            r0 = r0 ^ r1
            androidx.vectordrawable.C1105.m3297(r2, r0, r4)
            return r2
        Ld4:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto La8
        Ld8:
            androidx.loader.C1095.m2596(r4, r5)
            goto Lb0
    }

    private static android.graphics.drawable.Drawable createRippleDrawable(android.content.Context r10) {
            r1 = 0
            r7 = 0
            r9 = 0
            java.lang.String r5 = "ۣۢ۠"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56290: goto L1f;
                case 56355: goto L2e;
                case 56506: goto L70;
                case 56574: goto L8c;
                case 1746907: goto L18;
                case 1747715: goto L61;
                case 1747865: goto L25;
                case 1748611: goto L94;
                case 1748676: goto L85;
                case 1748733: goto L4d;
                case 1749695: goto L3d;
                case 1750718: goto L34;
                case 1750721: goto L77;
                case 1751743: goto L46;
                case 1752523: goto L53;
                case 1753608: goto L59;
                case 1754592: goto L67;
                case 1754598: goto L7c;
                default: goto L12;
            }
        L12:
            int[] r1 = new int[r7]
            java.lang.String r5 = "ۨۦ"
            r4 = r1
            goto Lb
        L18:
            androidx.lifecycle.process.C1091.m2252(r2, r9)
            java.lang.String r1 = "ۧۦۥ"
            r5 = r1
            goto Lb
        L1f:
            int r8 = androidx.drawerlayout.C1077.f103
            java.lang.String r1 = "۠ۦ۟"
            r5 = r1
            goto Lb
        L25:
            r1 = 570425630(0x2200011e, float:1.7347826E-18)
            r6 = r1 ^ r8
            java.lang.String r1 = "ۤۧۢ"
            r5 = r1
            goto Lb
        L2e:
            int r6 = androidx.versionedparcelable.C1106.f132
            java.lang.String r1 = "ۣۡ۟"
            r5 = r1
            goto Lb
        L34:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            java.lang.String r5 = "۟ۡ"
            r2 = r1
            goto Lb
        L3d:
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            java.lang.String r5 = "ۣۥ۠"
            r3 = r1
            goto Lb
        L46:
            androidx.lifecycle.livedata.C1085.m1879(r2, r6)
            java.lang.String r1 = "ۥۡۧ"
            r5 = r1
            goto Lb
        L4d:
            r8 = r6 ^ 140(0x8c, float:1.96E-43)
            java.lang.String r1 = "ۧۦ۟"
            r5 = r1
            goto Lb
        L53:
            int r8 = androidx.versionedparcelable.C1107.f133
            java.lang.String r1 = "۠ۡۤ"
            r5 = r1
            goto Lb
        L59:
            int r8 = m7354(r10, r6)
            java.lang.String r1 = "ۣۥۣ"
            r5 = r1
            goto Lb
        L61:
            r6 = r8 ^ 648(0x288, float:9.08E-43)
            java.lang.String r1 = "ۦۥۧ"
            r5 = r1
            goto Lb
        L67:
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            r4[r8] = r1
            java.lang.String r1 = "ۦ۠"
            r5 = r1
            goto Lb
        L70:
            androidx.drawerlayout.C1077.m1349(r3, r4, r2)
            java.lang.String r1 = "ۢۢ"
            r5 = r1
            goto Lb
        L77:
            float r9 = (float) r8
            java.lang.String r1 = "۟ۦۢ"
            r5 = r1
            goto Lb
        L7c:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r7)
            java.lang.String r1 = "ۡۡۤ"
            r5 = r1
            goto Lb
        L85:
            r1 = 1
            int[] r1 = new int[r1]
            java.lang.String r5 = "ۡۤ"
            r4 = r1
            goto Lb
        L8c:
            androidx.drawerlayout.C1077.m1349(r3, r4, r0)
            java.lang.String r1 = "ۡ۟ۡ"
            r5 = r1
            goto Lb
        L94:
            return r3
    }

    private static android.widget.LinearLayout createSparkItemView(android.content.Context r10, kevin.fun.hook.SparkRenewHelper.SparkInfo r11) {
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r10)
            r0 = 0
            androidx.customview.C1074.m1119(r7, r0)
            int r0 = androidx.core.C1073.f99
            r0 = r0 ^ 431(0x1af, float:6.04E-43)
            androidx.emoji2.C1080.m1542(r7, r0)
            int r1 = androidx.startup.C1101.f127
            r1 = r1 ^ 754(0x2f2, float:1.057E-42)
            int r2 = m7354(r10, r1)
            int r3 = androidx.vectordrawable.C1104.f130
            r3 = r3 ^ 605(0x25d, float:8.48E-43)
            int r4 = m7354(r10, r3)
            int r1 = m7354(r10, r1)
            int r3 = m7354(r10, r3)
            androidx.drawerlayout.C1077.m1314(r7, r2, r4, r1, r3)
            android.graphics.drawable.Drawable r1 = m7401(r10)
            androidx.activity.C1065.m397(r7, r1)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r10)
            r1 = 0
            androidx.customview.C1074.m1119(r2, r1)
            androidx.emoji2.C1080.m1542(r2, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 0
            int r3 = androidx.lifecycle.livedata.C1086.f112
            r3 = r3 ^ (-953(0xfffffffffffffc47, float:NaN))
            r4 = 1051931443(0x3eb33333, float:0.35)
            r0.<init>(r1, r3, r4)
            androidx.vectordrawable.C1105.m3296(r2, r0)
            int r0 = kevin.fun.hook.webdav.C1119.f418
            r0 = r0 ^ 276(0x114, float:3.87E-43)
            int r3 = m7354(r10, r0)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r10)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r3)
            androidx.lifecycle.process.C1091.m2273(r4, r0)
            android.view.View r5 = new android.view.View
            r5.<init>(r10)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r3)
            androidx.lifecycle.livedata.C1085.m1843(r5, r0)
            boolean r1 = androidx.core.C1072.m931(r11)
            boolean r6 = kevin.fun.hook.audio.C1114.m7910(r11)
            r0 = 1616(0x650, float:2.264E-42)
        L7a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L80;
                case 49: goto L83;
                case 204: goto L88;
                case 239: goto L96;
                default: goto L7f;
            }
        L7f:
            goto L7a
        L80:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L7a
        L83:
            if (r6 != 0) goto L80
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L7a
        L88:
            r0 = 1721342361(0x66999999, float:3.6267772E23)
            r1 = 1740(0x6cc, float:2.438E-42)
        L8d:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L93;
                case 54: goto Lb6;
                default: goto L92;
            }
        L92:
            goto L8d
        L93:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L8d
        L96:
            r0 = 1864(0x748, float:2.612E-42)
        L98:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L9e;
                case 47384: goto Le0;
                case 47417: goto La8;
                case 47483: goto La4;
                default: goto L9d;
            }
        L9d:
            goto L98
        L9e:
            if (r1 == 0) goto La4
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L98
        La4:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L98
        La8:
            r0 = 1727637541(0x66f9a825, float:5.894855E23)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        Lae:
            r8 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 14: goto Lb6;
                case 239: goto Ldc;
                default: goto Lb5;
            }
        Lb5:
            goto Lae
        Lb6:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r8 = 1
            androidx.lifecycle.viewmodel.C1093.m2423(r1, r8)
            androidx.lifecycle.livedata.C1085.m1879(r1, r0)
            androidx.core.ktx.C1070.m781(r5, r1)
            androidx.annotation.experimental.C1067.m579(r4, r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r10)
            r0 = 48891(0xbefb, float:6.8511E-41)
        Ld0:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto Ld8;
                case 53: goto L101;
                case 503: goto Le4;
                case 32495: goto Lea;
                default: goto Ld7;
            }
        Ld7:
            goto Ld0
        Ld8:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Ld0
        Ldc:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto Lae
        Le0:
            r0 = 1718008682(0x6666bb6a, float:2.7240037E23)
            goto Lb6
        Le4:
            if (r6 == 0) goto Ld8
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Ld0
        Lea:
            int r0 = androidx.loader.C1099.m2844(r11)
            java.lang.String r0 = androidx.documentfile.C1076.m1244(r0)
            r1 = 49666(0xc202, float:6.9597E-41)
        Lf5:
            r6 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r6
            switch(r1) {
                case 17: goto Lfd;
                case 50: goto L10e;
                default: goto Lfc;
            }
        Lfc:
            goto Lf5
        Lfd:
            r1 = 49697(0xc221, float:6.964E-41)
            goto Lf5
        L101:
            short[] r0 = m7367()
            r1 = 336(0x150, float:4.71E-43)
            r6 = 1
            r8 = 2989(0xbad, float:4.188E-42)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r1, r6, r8)
        L10e:
            androidx.lifecycle.process.C1087.m1946(r5, r0)
            r0 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r0)
            r0 = 0
            r1 = 1
            androidx.lifecycle.livedata.C1085.m1833(r5, r0, r1)
            int r0 = kevin.fun.hook.C1120.f419
            r0 = r0 ^ 452(0x1c4, float:6.33E-43)
            kevin.fun.hook.webdav.C1118.m8517(r5, r0)
            int r0 = androidx.appcompat.resources.C1068.f94
            r0 = r0 ^ 543(0x21f, float:7.61E-43)
            androidx.documentfile.C1076.m1233(r5, r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r3)
            r1.gravity = r0
            androidx.lifecycle.livedata.C1085.m1822(r5, r1)
            androidx.annotation.experimental.C1067.m579(r4, r5)
            androidx.activity.C1064.m372(r2, r4)
            androidx.activity.C1064.m372(r7, r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r10)
            r0 = 1
            androidx.customview.C1074.m1119(r2, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 0
            int r3 = androidx.interpolator.C1083.f109
            r3 = r3 ^ 444(0x1bc, float:6.22E-43)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r3, r4)
            androidx.vectordrawable.C1105.m3296(r2, r0)
            int r0 = androidx.lifecycle.livedata.C1085.f111
            r0 = r0 ^ 797(0x31d, float:1.117E-42)
            int r0 = m7354(r10, r0)
            r1 = 0
            int r3 = kevin.fun.hook.audio.C1117.f406
            r3 = r3 ^ 65
            int r3 = m7354(r10, r3)
            r4 = 0
            androidx.drawerlayout.C1077.m1314(r2, r0, r1, r3, r4)
            boolean r1 = kevin.fun.hook.audio.C1114.m7910(r11)
            int r3 = kevin.fun.hook.C1120.f419
            r0 = 49790(0xc27e, float:6.977E-41)
        L172:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto L17a;
                case 51: goto L1c8;
                case 84: goto L184;
                case 241: goto L17e;
                default: goto L179;
            }
        L179:
            goto L172
        L17a:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L172
        L17e:
            if (r1 != 0) goto L17a
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L172
        L184:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r10)
            short[] r1 = m7367()
            r4 = 337(0x151, float:4.72E-43)
            int r5 = androidx.annotation.experimental.C1067.f93
            r5 = r5 ^ (-50)
            r6 = 1568(0x620, float:2.197E-42)
            java.lang.String r1 = org.luckypray.dexkit.C1123.m10510(r1, r4, r5, r6)
            androidx.lifecycle.process.C1087.m1946(r0, r1)
            r1 = 1092616192(0x41200000, float:10.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            r1 = 6711202(0x6667a2, float:9.404397E-39)
            r1 = r1 ^ r3
            kevin.fun.hook.webdav.C1118.m8517(r0, r1)
            r1 = 0
            r3 = 0
            r4 = 0
            int r5 = androidx.emoji2.C1080.f106
            r5 = r5 ^ 381(0x17d, float:5.34E-43)
            int r5 = m7354(r10, r5)
            kevin.fun.hook.audio.C1117.m8126(r0, r1, r3, r4, r5)
            androidx.activity.C1064.m372(r2, r0)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L1bc:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto L1c4;
                case 1711: goto L223;
                default: goto L1c3;
            }
        L1c3:
            goto L1bc
        L1c4:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L1bc
        L1c8:
            boolean r1 = androidx.core.C1072.m931(r11)
            r0 = 50689(0xc601, float:7.103E-41)
        L1cf:
            r3 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 19: goto L1d7;
                case 45: goto L223;
                case 50: goto L1dd;
                case 76: goto L1e1;
                default: goto L1d6;
            }
        L1d6:
            goto L1cf
        L1d7:
            if (r1 == 0) goto L1dd
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L1cf
        L1dd:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L1cf
        L1e1:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r10)
            short[] r1 = m7367()
            r3 = 341(0x155, float:4.78E-43)
            int r4 = androidx.startup.C1100.f126
            r4 = r4 ^ (-275(0xfffffffffffffeed, float:NaN))
            r5 = 2613(0xa35, float:3.662E-42)
            java.lang.String r1 = kevin.fun.hook.webdav.C1118.m8509(r1, r3, r4, r5)
            androidx.lifecycle.process.C1087.m1946(r0, r1)
            r1 = 1092616192(0x41200000, float:10.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            r1 = -119361(0xfffffffffffe2dbf, float:NaN)
            int r3 = androidx.activity.C1064.f90
            r1 = r1 ^ r3
            kevin.fun.hook.webdav.C1118.m8517(r0, r1)
            r1 = 0
            r3 = 0
            r4 = 0
            int r5 = androidx.vectordrawable.C1105.f131
            r5 = r5 ^ 354(0x162, float:4.96E-43)
            int r5 = m7354(r10, r5)
            kevin.fun.hook.audio.C1117.m8126(r0, r1, r3, r4, r5)
            androidx.activity.C1064.m372(r2, r0)
            r0 = 50813(0xc67d, float:7.1204E-41)
        L21b:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L223;
                case 243: goto L241;
                default: goto L222;
            }
        L222:
            goto L21b
        L223:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r11)
            java.lang.String r3 = androidx.lifecycle.process.C1090.m2189(r0)
            r0 = 51588(0xc984, float:7.229E-41)
        L233:
            r4 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto L23b;
                case 54: goto L245;
                case 87: goto L274;
                case 116: goto L249;
                default: goto L23a;
            }
        L23a:
            goto L233
        L23b:
            if (r3 == 0) goto L245
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L233
        L241:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L21b
        L245:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L233
        L249:
            boolean r4 = androidx.activity.C1066.m488(r3)
            r0 = 51712(0xca00, float:7.2464E-41)
        L250:
            r5 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto L258;
                case 17: goto L25c;
                case 47: goto L274;
                case 76: goto L262;
                default: goto L257;
            }
        L257:
            goto L250
        L258:
            r0 = 51774(0xca3e, float:7.2551E-41)
            goto L250
        L25c:
            if (r4 != 0) goto L258
            r0 = 51805(0xca5d, float:7.2594E-41)
            goto L250
        L262:
            androidx.lifecycle.process.C1087.m1946(r1, r3)
            r0 = 51836(0xca7c, float:7.2638E-41)
        L268:
            r3 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 241: goto L270;
                case 1963: goto L2e4;
                default: goto L26f;
            }
        L26f:
            goto L268
        L270:
            r0 = 52518(0xcd26, float:7.3593E-41)
            goto L268
        L274:
            long r4 = androidx.lifecycle.livedata.C1084.m1746(r11)
            java.lang.String r3 = m7388(r4)
            r0 = 52611(0xcd83, float:7.3724E-41)
        L27f:
            r4 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 23: goto L287;
                case 54: goto L28d;
                case 85: goto L2bc;
                case 116: goto L291;
                default: goto L286;
            }
        L286:
            goto L27f
        L287:
            if (r3 == 0) goto L28d
            r0 = 52704(0xcde0, float:7.3854E-41)
            goto L27f
        L28d:
            r0 = 52673(0xcdc1, float:7.381E-41)
            goto L27f
        L291:
            boolean r4 = androidx.activity.C1066.m488(r3)
            r0 = 52735(0xcdff, float:7.3897E-41)
        L298:
            r5 = 52752(0xce10, float:7.3921E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 14: goto L2a0;
                case 45: goto L2bc;
                case 1007: goto L2a4;
                case 7927: goto L2aa;
                default: goto L29f;
            }
        L29f:
            goto L298
        L2a0:
            r0 = 52797(0xce3d, float:7.3984E-41)
            goto L298
        L2a4:
            if (r4 != 0) goto L2a0
            r0 = 53479(0xd0e7, float:7.494E-41)
            goto L298
        L2aa:
            androidx.lifecycle.process.C1087.m1946(r1, r3)
            r0 = 53510(0xd106, float:7.4983E-41)
        L2b0:
            r3 = 53527(0xd117, float:7.5007E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L2b8;
                case 50: goto L2e4;
                default: goto L2b7;
            }
        L2b7:
            goto L2b0
        L2b8:
            r0 = 53541(0xd125, float:7.5027E-41)
            goto L2b0
        L2bc:
            long r4 = androidx.lifecycle.livedata.C1084.m1746(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r3 = m7367()
            r6 = 348(0x15c, float:4.88E-43)
            int r8 = androidx.lifecycle.process.C1090.f116
            r8 = r8 ^ (-427(0xfffffffffffffe55, float:NaN))
            r9 = 2370(0x942, float:3.321E-42)
            java.lang.String r3 = androidx.lifecycle.process.C1090.m2213(r3, r6, r8, r9)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)
            java.lang.StringBuilder r0 = androidx.loader.C1097.m2720(r0, r4)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.lifecycle.process.C1087.m1946(r1, r0)
        L2e4:
            int r3 = androidx.loader.C1099.m2831(r11)
            r0 = 53634(0xd182, float:7.5157E-41)
        L2eb:
            r4 = 53651(0xd193, float:7.5181E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto L2f3;
                case 50: goto L2fa;
                case 76: goto L2fe;
                case 83: goto L323;
                default: goto L2f2;
            }
        L2f2:
            goto L2eb
        L2f3:
            r0 = 2
            if (r3 == r0) goto L2fa
            r0 = 53727(0xd1df, float:7.5288E-41)
            goto L2eb
        L2fa:
            r0 = 53696(0xd1c0, float:7.5244E-41)
            goto L2eb
        L2fe:
            long r4 = androidx.lifecycle.livedata.C1084.m1746(r11)
            r0 = 53758(0xd1fe, float:7.5331E-41)
        L305:
            r3 = 53775(0xd20f, float:7.5355E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 1009: goto L30d;
                case 1703: goto L317;
                case 1736: goto L323;
                case 1769: goto L31b;
                default: goto L30c;
            }
        L30c:
            goto L305
        L30d:
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L317
            r0 = 54502(0xd4e6, float:7.6374E-41)
            goto L305
        L317:
            r0 = 54471(0xd4c7, float:7.633E-41)
            goto L305
        L31b:
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda11 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda11
            r0.<init>(r11, r10)
            androidx.lifecycle.livedata.C1086.m1916(r1, r0)
        L323:
            r0 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r1, r0)
            r0 = -10066198(0xffffffffff6666ea, float:-3.062568E38)
            int r3 = androidx.versionedparcelable.C1106.f132
            r0 = r0 ^ r3
            kevin.fun.hook.webdav.C1118.m8517(r1, r0)
            android.graphics.Typeface r0 = androidx.interpolator.C1081.m1592()
            androidx.customview.C1074.m47(r1, r0)
            androidx.activity.C1064.m372(r2, r1)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r10)
            java.lang.String r1 = androidx.viewpager.C1108.m3493(r11)
            r0 = 54533(0xd505, float:7.6417E-41)
        L347:
            r4 = 54550(0xd516, float:7.6441E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 19: goto L34f;
                case 50: goto L355;
                case 85: goto L36c;
                case 116: goto L359;
                default: goto L34e;
            }
        L34e:
            goto L347
        L34f:
            if (r1 == 0) goto L355
            r0 = 54626(0xd562, float:7.6547E-41)
            goto L347
        L355:
            r0 = 54595(0xd543, float:7.6504E-41)
            goto L347
        L359:
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r11)
            r1 = 54657(0xd581, float:7.6591E-41)
        L360:
            r4 = 54674(0xd592, float:7.6615E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 19: goto L368;
                case 50: goto L37c;
                default: goto L367;
            }
        L367:
            goto L360
        L368:
            r1 = 54688(0xd5a0, float:7.6634E-41)
            goto L360
        L36c:
            short[] r0 = m7367()
            r1 = 353(0x161, float:4.95E-43)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r4 = r4 ^ 655(0x28f, float:9.18E-43)
            r5 = 2960(0xb90, float:4.148E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r0, r1, r4, r5)
        L37c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r4 = m7367()
            r5 = 355(0x163, float:4.97E-43)
            int r6 = kevin.fun.hook.audio.C1114.f403
            r6 = r6 ^ (-22)
            r8 = 615(0x267, float:8.62E-43)
            java.lang.String r4 = androidx.interpolator.C1082.m1694(r4, r5, r6, r8)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.lifecycle.process.C1087.m1946(r3, r0)
            r0 = 1093664768(0x41300000, float:11.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r0)
            r0 = -6711105(0xffffffffff9998bf, float:NaN)
            int r1 = kevin.fun.hook.webdav.C1119.f418
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r3, r0)
            r0 = 0
            int r1 = androidx.lifecycle.process.C1089.f115
            r1 = r1 ^ 931(0x3a3, float:1.305E-42)
            int r1 = m7354(r10, r1)
            r4 = 0
            r5 = 0
            kevin.fun.hook.audio.C1117.m8126(r3, r0, r1, r4, r5)
            androidx.activity.C1064.m372(r2, r3)
            androidx.activity.C1064.m372(r7, r2)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r10)
            r0 = 1
            androidx.customview.C1074.m1119(r8, r0)
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r0 = r0 ^ 668(0x29c, float:9.36E-43)
            androidx.emoji2.C1080.m1542(r8, r0)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r10)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            int r0 = androidx.core.C1072.f98
            r0 = r0 ^ (-526(0xfffffffffffffdf2, float:NaN))
            int r0 = m7354(r10, r0)
            float r0 = (float) r0
            androidx.lifecycle.process.C1091.m2252(r3, r0)
            r0 = 1093664768(0x41300000, float:11.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r0)
            r0 = 0
            r1 = 1
            androidx.lifecycle.livedata.C1085.m1833(r2, r0, r1)
            int r0 = androidx.startup.C1101.f127
            r0 = r0 ^ 754(0x2f2, float:1.057E-42)
            int r1 = m7354(r10, r0)
            int r4 = androidx.loader.C1097.f123
            r4 = r4 ^ 116(0x74, float:1.63E-43)
            int r5 = m7354(r10, r4)
            int r0 = m7354(r10, r0)
            int r4 = m7354(r10, r4)
            kevin.fun.hook.audio.C1117.m8126(r2, r1, r5, r0, r4)
            androidx.core.C1073.m999(r2, r3)
            int r0 = androidx.loader.C1094.f120
            r0 = r0 ^ (-374(0xfffffffffffffe8a, float:NaN))
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r0)
            androidx.lifecycle.livedata.C1085.m1822(r2, r1)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r10)
            r0 = 1092616192(0x41200000, float:10.0)
            androidx.vectordrawable.animated.C1102.m3105(r4, r0)
            r0 = 0
            r1 = 1
            androidx.lifecycle.livedata.C1085.m1833(r4, r0, r1)
            r0 = 10066423(0x9999f7, float:1.4106063E-38)
            int r1 = androidx.emoji2.viewsintegration.C1079.f105
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r4, r0)
            int r0 = androidx.lifecycle.viewmodel.C1093.f119
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            int r1 = m7354(r10, r0)
            int r5 = kevin.fun.hook.audio.C1114.f403
            r5 = r5 ^ (-23)
            int r6 = m7354(r10, r5)
            int r0 = m7354(r10, r0)
            int r5 = m7354(r10, r5)
            kevin.fun.hook.audio.C1117.m8126(r4, r1, r6, r0, r5)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r1 = androidx.lifecycle.process.C1087.f113
            r1 = r1 ^ (-640(0xfffffffffffffd80, float:NaN))
            int r1 = m7354(r10, r1)
            float r1 = (float) r1
            androidx.lifecycle.process.C1091.m2252(r0, r1)
            r1 = 1
            int r1 = m7354(r10, r1)
            r5 = -570425446(0xffffffffddffff9a, float:-2.305829E18)
            int r6 = androidx.customview.C1075.f101
            r5 = r5 ^ r6
            androidx.annotation.experimental.C1067.m572(r0, r1, r5)
            r1 = 285213600(0x110003a0, float:1.0098537E-28)
            int r5 = androidx.lifecycle.process.C1089.f115
            r1 = r1 ^ r5
            androidx.lifecycle.livedata.C1085.m1879(r0, r1)
            androidx.core.C1073.m999(r4, r0)
            int r0 = androidx.lifecycle.livedata.C1086.f112
            r0 = r0 ^ (-953(0xfffffffffffffc47, float:NaN))
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r0)
            int r0 = androidx.loader.C1094.f120
            r0 = r0 ^ 370(0x172, float:5.18E-43)
            int r0 = m7354(r10, r0)
            r1.topMargin = r0
            androidx.lifecycle.livedata.C1085.m1822(r4, r1)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r10)
            short[] r0 = m7367()
            r1 = 361(0x169, float:5.06E-43)
            int r6 = androidx.lifecycle.viewmodel.C1093.f119
            r6 = r6 ^ (-114(0xffffffffffffff8e, float:NaN))
            r9 = 1778(0x6f2, float:2.492E-42)
            java.lang.String r0 = androidx.customview.C1075.m1138(r0, r1, r6, r9)
            androidx.lifecycle.process.C1087.m1946(r5, r0)
            r0 = 1092616192(0x41200000, float:10.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r0)
            r0 = 0
            r1 = 1
            androidx.lifecycle.livedata.C1085.m1833(r5, r0, r1)
            r0 = -119080(0xfffffffffffe2ed8, float:NaN)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r5, r0)
            int r0 = kevin.fun.hook.audio.C1116.f405
            r0 = r0 ^ 88
            int r1 = m7354(r10, r0)
            int r6 = kevin.fun.hook.audio.C1117.f406
            r6 = r6 ^ 76
            int r9 = m7354(r10, r6)
            int r0 = m7354(r10, r0)
            int r6 = m7354(r10, r6)
            kevin.fun.hook.audio.C1117.m8126(r5, r1, r9, r0, r6)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r1 = androidx.lifecycle.viewmodel.C1093.f119
            r1 = r1 ^ (-102(0xffffffffffffff9a, float:NaN))
            int r1 = m7354(r10, r1)
            float r1 = (float) r1
            androidx.lifecycle.process.C1091.m2252(r0, r1)
            r1 = 1
            int r1 = m7354(r10, r1)
            r6 = -872295484(0xffffffffcc01d3c4, float:-3.4033424E7)
            int r9 = androidx.emoji2.viewsintegration.C1079.f105
            r6 = r6 ^ r9
            androidx.annotation.experimental.C1067.m572(r0, r1, r6)
            r1 = 301871084(0x11fe2fec, float:4.0103668E-28)
            int r6 = androidx.lifecycle.livedata.C1086.f112
            r1 = r1 ^ r6
            androidx.lifecycle.livedata.C1085.m1879(r0, r1)
            androidx.core.C1073.m999(r5, r0)
            int r0 = androidx.emoji2.viewsintegration.C1079.f105
            r0 = r0 ^ 111(0x6f, float:1.56E-43)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r0)
            int r0 = androidx.vectordrawable.C1103.f129
            r0 = r0 ^ 266(0x10a, float:3.73E-43)
            int r0 = m7354(r10, r0)
            r1.topMargin = r0
            androidx.lifecycle.livedata.C1085.m1822(r5, r1)
            r6 = 872295509(0x33fe2c55, float:1.1835861E-7)
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda13 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda13
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r0)
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda14 r1 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda14
            r1.<init>(r10, r11, r0)
            androidx.lifecycle.livedata.C1086.m1916(r2, r1)
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda15 r1 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda15
            r1.<init>(r10, r11, r0)
            androidx.lifecycle.livedata.C1086.m1916(r4, r1)
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda16 r1 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda16
            r1.<init>(r11, r0, r10)
            androidx.lifecycle.livedata.C1086.m1916(r5, r1)
            androidx.activity.C1064.m372(r8, r2)
            androidx.activity.C1064.m372(r8, r4)
            androidx.activity.C1064.m372(r8, r5)
            androidx.activity.C1064.m372(r7, r8)
            android.widget.Switch r2 = new android.widget.Switch
            r2.<init>(r10)
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r11)
            boolean r3 = m7386(r0)
            androidx.lifecycle.process.C1089.m2130(r2, r3)
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r0 = r0 ^ (-920(0xfffffffffffffc68, float:NaN))
            int r0 = m7354(r10, r0)
            int r1 = androidx.versionedparcelable.C1107.f133
            r1 = r1 ^ 664(0x298, float:9.3E-43)
            int r1 = m7354(r10, r1)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r0, r1)
            int r0 = androidx.annotation.experimental.C1067.f93
            r0 = r0 ^ (-52)
            int r0 = m7354(r10, r0)
            r4.leftMargin = r0
            kevin.fun.hook.webdav.C1118.m8512(r2, r4)
            r0 = 55432(0xd888, float:7.7677E-41)
        L57c:
            r1 = 55449(0xd899, float:7.77E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L584;
                case 62: goto L58a;
                case 95: goto L5a0;
                case 124: goto L58e;
                default: goto L583;
            }
        L583:
            goto L57c
        L584:
            if (r3 == 0) goto L58a
            r0 = 55525(0xd8e5, float:7.7807E-41)
            goto L57c
        L58a:
            r0 = 55494(0xd8c6, float:7.7764E-41)
            goto L57c
        L58e:
            r0 = -119723(0xfffffffffffe2c55, float:NaN)
            r1 = 55556(0xd904, float:7.785E-41)
        L594:
            r4 = 55573(0xd915, float:7.7874E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 17: goto L59c;
                case 54: goto L5a3;
                default: goto L59b;
            }
        L59b:
            goto L594
        L59c:
            r1 = 55587(0xd923, float:7.7894E-41)
            goto L594
        L5a0:
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
        L5a3:
            android.content.res.ColorStateList r1 = androidx.lifecycle.process.C1088.m2050(r0)
            r0 = 55680(0xd980, float:7.8024E-41)
        L5aa:
            r4 = 55697(0xd991, float:7.8048E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto L5b2;
                case 1467: goto L5b8;
                case 1496: goto L5e2;
                case 1529: goto L5bc;
                default: goto L5b1;
            }
        L5b1:
            goto L5aa
        L5b2:
            if (r3 == 0) goto L5b8
            r0 = 56424(0xdc68, float:7.9067E-41)
            goto L5aa
        L5b8:
            r0 = 56393(0xdc49, float:7.9023E-41)
            goto L5aa
        L5bc:
            r0 = 56455(0xdc87, float:7.911E-41)
        L5bf:
            r3 = 56472(0xdc98, float:7.9134E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 31: goto L5c7;
                case 62: goto L5cb;
                default: goto L5c6;
            }
        L5c6:
            goto L5bf
        L5c7:
            r0 = 56486(0xdca6, float:7.9154E-41)
            goto L5bf
        L5cb:
            r0 = r6
        L5cc:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            androidx.emoji2.viewsintegration.C1079.m1472(r2, r1)
            kevin.fun.hook.webdav.C1118.m8476(r2, r0)
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda17 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda17
            r0.<init>(r11, r2)
            androidx.core.C1073.m989(r2, r0)
            androidx.activity.C1064.m372(r7, r2)
            return r7
        L5e2:
            r0 = 869059788(0x33cccccc, float:9.5367426E-8)
            goto L5cc
    }

    private static void dismissProgressDialog() {
            android.os.Handler r0 = m7404()
            kevin.fun.hook.SparkRenewHelper$2 r1 = new kevin.fun.hook.SparkRenewHelper$2
            r1.<init>()
            androidx.activity.C1062.m178(r0, r1)
            return
    }

    /* JADX INFO: renamed from: dp */
    private static int m92dp(android.content.Context r2, float r3) {
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

    /* JADX INFO: renamed from: dp */
    private static int m93dp(android.content.Context r8, int r9) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۡۤۨ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746688: goto L26;
                case 1748739: goto L21;
                case 1748773: goto L3b;
                case 1750659: goto L18;
                case 1750756: goto L32;
                case 1751777: goto L2c;
                case 1752578: goto L43;
                default: goto L10;
            }
        L10:
            android.util.DisplayMetrics r0 = androidx.activity.C1062.m159(r2)
            java.lang.String r1 = "ۣۦۧ"
            r3 = r1
            goto L9
        L18:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r5 = r4 + r1
            java.lang.String r1 = "ۣۡۥ"
            r3 = r1
            r7 = r5
            goto L9
        L21:
            int r9 = (int) r7
            java.lang.String r1 = "ۥۣ۠"
            r3 = r1
            goto L9
        L26:
            float r4 = r7 * r6
            java.lang.String r1 = "ۣۣۣ"
            r3 = r1
            goto L9
        L2c:
            float r5 = (float) r9
            java.lang.String r1 = "۟۟۠"
            r3 = r1
            r7 = r5
            goto L9
        L32:
            float r5 = androidx.vectordrawable.animated.C1102.m3118(r0)
            java.lang.String r1 = "ۤۨۥ"
            r3 = r1
            r6 = r5
            goto L9
        L3b:
            android.content.res.Resources r1 = androidx.emoji2.viewsintegration.C1078.m1401(r8)
            java.lang.String r3 = "ۥۧ"
            r2 = r1
            goto L9
        L43:
            return r9
    }

    private static long extractOtherUid(java.lang.Object r10, java.lang.Object r11) {
            r1 = 0
            r2 = 0
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L80
            r4 = 365(0x16d, float:5.11E-43)
            int r5 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> L80
            r5 = r5 ^ 269(0x10d, float:3.77E-43)
            r6 = 2106(0x83a, float:2.951E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r4, r5, r6)     // Catch: java.lang.Throwable -> L80
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = m7362(r10, r0, r4)     // Catch: java.lang.Throwable -> L80
            boolean r5 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L80
            r4 = 1616(0x650, float:2.264E-42)
        L1e:
            r4 = r4 ^ 1633(0x661, float:2.288E-42)
            switch(r4) {
                case 14: goto L24;
                case 49: goto L27;
                case 204: goto L2c;
                case 239: goto L173;
                default: goto L23;
            }     // Catch: java.lang.Throwable -> L80
        L23:
            goto L1e
        L24:
            r4 = 1678(0x68e, float:2.351E-42)
            goto L1e
        L27:
            if (r5 == 0) goto L24
            r4 = 1709(0x6ad, float:2.395E-42)
            goto L1e
        L2c:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L80
            int r0 = androidx.vectordrawable.animated.C1102.m3104(r0)     // Catch: java.lang.Throwable -> L80
        L32:
            r1 = 1740(0x6cc, float:2.438E-42)
        L34:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L3a;
                case 54: goto L3d;
                default: goto L39;
            }
        L39:
            goto L34
        L3a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L34
        L3d:
            r5 = r0
        L3e:
            java.lang.String r0 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> L10f
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L93
            r4 = 384(0x180, float:5.38E-43)
            int r6 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L93
            r6 = r6 ^ (-984(0xfffffffffffffc28, float:NaN))
            r7 = 1596(0x63c, float:2.236E-42)
            java.lang.String r1 = androidx.customview.C1075.m1138(r1, r4, r6, r7)     // Catch: java.lang.Throwable -> L93
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = m7362(r10, r1, r4)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = androidx.loader.C1099.m2839(r1)     // Catch: java.lang.Throwable -> L93
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L60:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r4
            switch(r1) {
                case 14: goto L68;
                case 239: goto L8f;
                default: goto L67;
            }
        L67:
            goto L60
        L68:
            r1 = r0
        L69:
            java.util.concurrent.atomic.AtomicLong r0 = m7395()     // Catch: java.lang.Throwable -> L10f
            long r6 = androidx.appcompat.resources.C1068.m694(r0)     // Catch: java.lang.Throwable -> L10f
            r0 = 48891(0xbefb, float:6.8511E-41)
        L74:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 22: goto L7c;
                case 53: goto Lcf;
                case 503: goto L96;
                case 32495: goto L9e;
                default: goto L7b;
            }
        L7b:
            goto L74
        L7c:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L74
        L80:
            r0 = move-exception
            r0 = 1864(0x748, float:2.612E-42)
        L83:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L89;
                case 47483: goto L8d;
                default: goto L88;
            }
        L88:
            goto L83
        L89:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L83
        L8d:
            r0 = r1
            goto L32
        L8f:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L60
        L93:
            r1 = move-exception
            r1 = r0
            goto L69
        L96:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L7c
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L74
        L9e:
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1778()     // Catch: java.lang.Throwable -> Le5
            long r6 = androidx.loader.C1095.m2603(r0)     // Catch: java.lang.Throwable -> Le5
            r0 = 49666(0xc202, float:6.9597E-41)
        La9:
            r4 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto Lb1;
                case 50: goto Lb9;
                case 76: goto Lbd;
                case 83: goto Lcf;
                default: goto Lb0;
            }     // Catch: java.lang.Throwable -> Le5
        Lb0:
            goto La9
        Lb1:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto La9
        Lb9:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto La9
        Lbd:
            java.util.concurrent.atomic.AtomicLong r0 = m7395()     // Catch: java.lang.Throwable -> Le5
            kevin.fun.hook.webdav.C1118.m8506(r0, r6)     // Catch: java.lang.Throwable -> Le5
            r0 = 49790(0xc27e, float:6.977E-41)
        Lc7:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto Lcf;
                case 241: goto Le1;
                default: goto Lce;
            }
        Lce:
            goto Lc7
        Lcf:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Ld2:
            r4 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 497: goto Lda;
                case 1711: goto L13a;
                case 1736: goto L159;
                case 1769: goto L13e;
                default: goto Ld9;
            }
        Ld9:
            goto Ld2
        Lda:
            r0 = 1
            if (r5 != r0) goto L13a
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Ld2
        Le1:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Lc7
        Le5:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10f
            r4.<init>()     // Catch: java.lang.Throwable -> L10f
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L10f
            r7 = 401(0x191, float:5.62E-43)
            int r8 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L10f
            r8 = r8 ^ 376(0x178, float:5.27E-43)
            r9 = 1664(0x680, float:2.332E-42)
            java.lang.String r6 = kevin.fun.hook.audio.C1114.m7940(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r6)     // Catch: java.lang.Throwable -> L10f
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r4, r0)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L10f
            m7397(r0)     // Catch: java.lang.Throwable -> L10f
            goto Lcf
        L10f:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r4 = m7367()
            r5 = 440(0x1b8, float:6.17E-43)
            int r6 = androidx.activity.C1063.f89
            r6 = r6 ^ 30
            r7 = 3089(0xc11, float:4.329E-42)
            java.lang.String r4 = androidx.activity.C1065.m410(r4, r5, r6, r7)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
            r0 = r2
        L139:
            return r0
        L13a:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Ld2
        L13e:
            long r0 = m7369(r1)     // Catch: java.lang.Throwable -> L10f
            r4 = 50689(0xc601, float:7.103E-41)
        L145:
            r6 = 50706(0xc612, float:7.1054E-41)
            r4 = r4 ^ r6
            switch(r4) {
                case 19: goto L14d;
                case 45: goto L159;
                case 50: goto L155;
                case 76: goto L139;
                default: goto L14c;
            }
        L14c:
            goto L145
        L14d:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L155
            r4 = 50782(0xc65e, float:7.1161E-41)
            goto L145
        L155:
            r4 = 50751(0xc63f, float:7.1117E-41)
            goto L145
        L159:
            r0 = 50813(0xc67d, float:7.1204E-41)
        L15c:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L164;
                case 53: goto L171;
                case 243: goto L168;
                case 4075: goto L16f;
                default: goto L163;
            }
        L163:
            goto L15c
        L164:
            r0 = 50875(0xc6bb, float:7.1291E-41)
            goto L15c
        L168:
            r0 = 2
            if (r5 != r0) goto L164
            r0 = 51557(0xc965, float:7.2247E-41)
            goto L15c
        L16f:
            r0 = r2
            goto L139
        L171:
            r0 = r2
            goto L139
        L173:
            r5 = r1
            goto L3e
    }

    private static void forceWakeupAndSync() {
            java.util.concurrent.atomic.AtomicReference r0 = m7408()
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L3c;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r1 != 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            int r1 = androidx.vectordrawable.C1104.m3230()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L3b;
                case 500: goto L2c;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            if (r1 < 0) goto L29
            r0 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            java.lang.String r0 = "zBymfVeBiwUf8Dcw7AEIO"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3b:
            return
        L3c:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> La1
            r2 = 468(0x1d4, float:6.56E-43)
            int r3 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> La1
            r3 = r3 ^ 91
            r4 = 470(0x1d6, float:6.59E-43)
            java.lang.String r0 = androidx.core.ktx.C1071.m874(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> La1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = m7362(r1, r0, r2)     // Catch: java.lang.Throwable -> La1
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> La1
            r3 = 477(0x1dd, float:6.68E-43)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> La1
            r4 = r4 ^ (-116(0xffffffffffffff8c, float:NaN))
            r5 = 2767(0xacf, float:3.877E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1078.m1413(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La1
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La1
            m7362(r0, r2, r3)     // Catch: java.lang.Throwable -> La1
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> La1
            r2 = 486(0x1e6, float:6.81E-43)
            int r3 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> La1
            r3 = r3 ^ 93
            r4 = 868(0x364, float:1.216E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> La1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La1
            m7362(r1, r0, r2)     // Catch: java.lang.Throwable -> La1
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> La1
            r2 = 506(0x1fa, float:7.09E-43)
            int r3 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> La1
            r3 = r3 ^ 779(0x30b, float:1.092E-42)
            r4 = 2965(0xb95, float:4.155E-42)
            java.lang.String r0 = androidx.vectordrawable.C1103.m3132(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> La1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> La1
            m7362(r1, r0, r2)     // Catch: java.lang.Throwable -> La1
            r0 = 1864(0x748, float:2.612E-42)
        L97:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L9d;
                case 47483: goto L3b;
                default: goto L9c;
            }
        L9c:
            goto L97
        L9d:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L97
        La1:
            r0 = move-exception
            goto L3b
    }

    public static java.util.Map<java.lang.String, kevin.fun.hook.SparkRenewHelper.SparkInfo> getAllConversationsMap() {
            java.util.concurrent.ConcurrentHashMap r0 = m7382()
            return r0
    }

    private static java.lang.String getConversationCustomMessage(java.lang.String r10) {
            r7 = 0
            r1 = 0
            java.lang.String r9 = "ۣۨۥ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r7
            r8 = r7
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r9)
            switch(r1) {
                case 56450: goto L2d;
                case 1746874: goto L1c;
                case 1747748: goto L5a;
                case 1747779: goto L41;
                case 1748771: goto L3a;
                case 1749789: goto L6f;
                case 1750532: goto L63;
                case 1750629: goto L67;
                case 1753633: goto L53;
                case 1754624: goto L4a;
                case 1755402: goto L24;
                default: goto L12;
            }
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "۟ۥ۠"
            r5 = r1
            r9 = r7
            goto Lb
        L1c:
            short[] r0 = m7367()
            java.lang.String r1 = "ۡۤۦ"
            r9 = r1
            goto Lb
        L24:
            java.lang.String r1 = androidx.interpolator.C1081.m1642(r4, r10)
            java.lang.String r7 = "ۢۦۡ"
            r3 = r1
            r9 = r7
            goto Lb
        L2d:
            r1 = 526(0x20e, float:7.37E-43)
            r4 = 2548(0x9f4, float:3.57E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r0, r1, r6, r4)
            java.lang.String r7 = "۠ۢۦ"
            r4 = r1
            r9 = r7
            goto Lb
        L3a:
            int r7 = kevin.fun.hook.audio.C1117.f406
            java.lang.String r1 = "ۦۦۡ"
            r8 = r7
            r9 = r1
            goto Lb
        L41:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r5)
            java.lang.String r7 = "ۣ۟۠"
            r4 = r1
            r9 = r7
            goto Lb
        L4a:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r10)
            java.lang.String r7 = "ۣ۠ۦ"
            r5 = r1
            r9 = r7
            goto Lb
        L53:
            r1 = r8 ^ 95
            java.lang.String r7 = "ۤۦ"
            r6 = r1
            r9 = r7
            goto Lb
        L5a:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r5, r4)
            java.lang.String r7 = "ۧۧ۠"
            r2 = r1
            r9 = r7
            goto Lb
        L63:
            java.lang.String r1 = "ۣۢۤ"
            r9 = r1
            goto Lb
        L67:
            java.lang.String r10 = androidx.emoji2.C1080.m1562()
            java.lang.String r1 = "ۣۨۡ"
            r9 = r1
            goto Lb
        L6f:
            return r3
    }

    public static java.lang.String getConversationName(java.lang.String r6) {
            r0 = 0
            r1 = 1616(0x650, float:2.264E-42)
        L3:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L37;
                case 239: goto L11;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            if (r6 != 0) goto L9
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L38
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L38
            r3 = 548(0x224, float:7.68E-43)
            int r4 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L38
            r4 = r4 ^ (-98)
            r5 = 588(0x24c, float:8.24E-43)
            java.lang.String r2 = androidx.loader.C1098.m2787(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r6)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)     // Catch: java.lang.Throwable -> L38
            r2 = 0
            java.lang.String r0 = androidx.interpolator.C1081.m1642(r1, r2)     // Catch: java.lang.Throwable -> L38
        L37:
            return r0
        L38:
            r1 = move-exception
            goto L37
    }

    private static java.lang.String getConversationRandomApiType(java.lang.String r10) {
            r7 = 0
            r1 = 0
            java.lang.String r9 = "ۦۤ۟"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r7
            r8 = r7
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r9)
            switch(r1) {
                case 56570: goto L5c;
                case 56573: goto L8a;
                case 1746908: goto L1b;
                case 1748768: goto L53;
                case 1749702: goto L6f;
                case 1750597: goto L83;
                case 1751618: goto L4f;
                case 1752733: goto L24;
                case 1753451: goto L39;
                case 1753515: goto L40;
                case 1753569: goto L65;
                case 1753638: goto L7c;
                case 1755344: goto L2d;
                case 1755468: goto L47;
                default: goto L12;
            }
        L12:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r10)
            java.lang.String r7 = "ۥۨ۠"
            r5 = r1
            r9 = r7
            goto Lb
        L1b:
            java.lang.String r1 = androidx.interpolator.C1081.m1642(r4, r10)
            java.lang.String r7 = "ۨۥ"
            r2 = r1
            r9 = r7
            goto Lb
        L24:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r5)
            java.lang.String r7 = "ۣۤۡ"
            r4 = r1
            r9 = r7
            goto Lb
        L2d:
            r1 = 590(0x24e, float:8.27E-43)
            r7 = 386(0x182, float:5.41E-43)
            java.lang.String r10 = org.luckypray.dexkit.C1123.m10510(r3, r1, r8, r7)
            java.lang.String r1 = "۟ۦۣ"
            r9 = r1
            goto Lb
        L39:
            int r1 = androidx.vectordrawable.C1103.f129
            java.lang.String r7 = "ۦۢۧ"
            r6 = r1
            r9 = r7
            goto Lb
        L40:
            r7 = r6 ^ 282(0x11a, float:3.95E-43)
            java.lang.String r1 = "ۣۢۧ"
            r8 = r7
            r9 = r1
            goto Lb
        L47:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r5, r4)
            java.lang.String r1 = "ۤۦ"
            r9 = r1
            goto Lb
        L4f:
            java.lang.String r1 = "ۨۢ"
            r9 = r1
            goto Lb
        L53:
            short[] r1 = m7367()
            java.lang.String r7 = "ۦ۠ۥ"
            r3 = r1
            r9 = r7
            goto Lb
        L5c:
            short[] r1 = m7367()
            java.lang.String r7 = "ۣۣۡ"
            r3 = r1
            r9 = r7
            goto Lb
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "ۣۡۤ"
            r5 = r1
            r9 = r7
            goto Lb
        L6f:
            r1 = 568(0x238, float:7.96E-43)
            r4 = 825(0x339, float:1.156E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1090.m2213(r3, r1, r8, r4)
            java.lang.String r7 = "ۣۨۧ"
            r4 = r1
            r9 = r7
            goto Lb
        L7c:
            r7 = r6 ^ 192(0xc0, float:2.69E-43)
            java.lang.String r1 = "ۨ۟ۧ"
            r8 = r7
            r9 = r1
            goto Lb
        L83:
            int r1 = androidx.vectordrawable.animated.C1102.f128
            java.lang.String r7 = "ۦۦۦ"
            r6 = r1
            r9 = r7
            goto Lb
        L8a:
            return r2
    }

    private static java.util.ArrayList<kevin.fun.hook.SparkRenewHelper.SparkInfo> getConversationsNeedingAutoRenewal() {
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = m7382()
            java.util.Collection r0 = androidx.emoji2.viewsintegration.C1079.m1455(r0)
            java.util.Iterator r3 = androidx.interpolator.C1082.m1687(r0)
        L11:
            boolean r1 = androidx.activity.C1063.m269(r3)
            r0 = 1616(0x650, float:2.264E-42)
        L17:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1d;
                case 49: goto L20;
                case 204: goto Lb1;
                case 239: goto L25;
                default: goto L1c;
            }
        L1c:
            goto L17
        L1d:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L17
        L20:
            if (r1 != 0) goto L1d
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L17
        L25:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r3)
            kevin.fun.hook.SparkRenewHelper$SparkInfo r0 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r0
            r1 = 1740(0x6cc, float:2.438E-42)
        L2d:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L33;
                case 54: goto L38;
                case 471: goto L47;
                case 500: goto L3b;
                default: goto L32;
            }
        L32:
            goto L2d
        L33:
            if (r0 != 0) goto L38
            r1 = 1833(0x729, float:2.569E-42)
            goto L2d
        L38:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L2d
        L3b:
            r0 = 1864(0x748, float:2.612E-42)
        L3d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L43;
                case 47483: goto L11;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3d
        L47:
            java.lang.String r1 = androidx.viewpager.C1108.m3493(r0)
            boolean r4 = m7386(r1)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L52:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 14: goto L5a;
                case 45: goto L73;
                case 76: goto L64;
                case 239: goto L5e;
                default: goto L59;
            }
        L59:
            goto L52
        L5a:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L52
        L5e:
            if (r4 != 0) goto L5a
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L52
        L64:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L67:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L11;
                case 503: goto L6f;
                default: goto L6e;
            }
        L6e:
            goto L67
        L6f:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L67
        L73:
            java.lang.String r1 = androidx.viewpager.C1108.m3493(r0)
            boolean r4 = m7390(r1)
            r1 = 49666(0xc202, float:6.9597E-41)
        L7e:
            r5 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r5
            switch(r1) {
                case 17: goto L86;
                case 50: goto L8c;
                case 76: goto L90;
                case 83: goto L9f;
                default: goto L85;
            }
        L85:
            goto L7e
        L86:
            if (r4 == 0) goto L8c
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto L7e
        L8c:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto L7e
        L90:
            r0 = 49790(0xc27e, float:6.977E-41)
        L93:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L11;
                case 241: goto L9b;
                default: goto L9a;
            }
        L9a:
            goto L93
        L9b:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L93
        L9f:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3829(r2, r0)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        La5:
            r1 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 497: goto Lad;
                case 1711: goto L11;
                default: goto Lac;
            }
        Lac:
            goto La5
        Lad:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto La5
        Lb1:
            return r2
    }

    public static java.lang.String getCustomMessage() {
            android.content.Context r2 = m7377()
            short[] r0 = m7367()
            r1 = 593(0x251, float:8.31E-43)
            int r3 = androidx.emoji2.viewsintegration.C1079.f105
            r3 = r3 ^ (-109(0xffffffffffffff93, float:NaN))
            r4 = 2142(0x85e, float:3.002E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r3, r4)
            r1 = 1616(0x650, float:2.264E-42)
        L16:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L1c;
                case 49: goto L1f;
                case 204: goto L38;
                case 239: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L16
        L1f:
            if (r2 != 0) goto L1c
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L16
        L24:
            short[] r1 = m7367()
            r2 = 595(0x253, float:8.34E-43)
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r3 = r3 ^ 665(0x299, float:9.32E-43)
            r4 = 632(0x278, float:8.86E-43)
            java.lang.String r1 = androidx.lifecycle.viewmodel.C1093.m2415(r1, r2, r3, r4)
            java.lang.String r0 = androidx.interpolator.C1081.m1642(r1, r0)
        L38:
            return r0
    }

    private static android.os.Handler getMainHandler() {
            android.os.Handler r1 = m7383()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 != 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.SparkRenewHelper.mainHandler = r0
        L1f:
            android.os.Handler r0 = m7383()
            return r0
    }

    private static java.lang.Object getOrInstantiateHandler() {
            r2 = 0
            r1 = 0
            java.util.concurrent.atomic.AtomicReference r0 = m7391()
            java.lang.Object r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r3 = 1616(0x650, float:2.264E-42)
        Lc:
            r3 = r3 ^ 1633(0x661, float:2.288E-42)
            switch(r3) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L5a;
                case 239: goto L1a;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r3 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r0 == 0) goto L12
            r3 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            short[] r0 = m7367()
            r3 = 615(0x267, float:8.62E-43)
            int r4 = kevin.fun.hook.audio.C1115.f404
            r4 = r4 ^ 813(0x32d, float:1.139E-42)
            r5 = 1581(0x62d, float:2.215E-42)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r3, r4, r5)
            java.lang.String r3 = androidx.interpolator.C1081.m1642(r0, r2)
            java.util.concurrent.atomic.AtomicReference r0 = m7408()
            java.lang.Object r5 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L38:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3e;
                case 54: goto L43;
                case 471: goto L5b;
                case 500: goto L46;
                default: goto L3d;
            }
        L3d:
            goto L38
        L3e:
            if (r5 != 0) goto L43
            r0 = 1833(0x729, float:2.569E-42)
            goto L38
        L43:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L38
        L46:
            short[] r0 = m7367()
            r1 = 630(0x276, float:8.83E-43)
            int r3 = androidx.drawerlayout.C1077.f103
            r3 = r3 ^ 308(0x134, float:4.32E-43)
            r4 = 1207(0x4b7, float:1.691E-42)
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3338(r0, r1, r3, r4)
            m7397(r0)
            r0 = r2
        L5a:
            return r0
        L5b:
            java.lang.ClassLoader r0 = m7380()     // Catch: java.lang.Throwable -> L249
            java.lang.Class r0 = kevin.fun.hook.C1120.m8622(r0, r3)     // Catch: java.lang.Throwable -> L249
            java.lang.reflect.Constructor[] r6 = androidx.lifecycle.livedata.C1085.m1821(r0)     // Catch: java.lang.Throwable -> L249
            int r7 = r6.length     // Catch: java.lang.Throwable -> L249
            r0 = r1
        L69:
            r3 = 1864(0x748, float:2.612E-42)
        L6b:
            r3 = r3 ^ 1881(0x759, float:2.636E-42)
            switch(r3) {
                case 17: goto L71;
                case 47384: goto L8c;
                case 47417: goto L7b;
                case 47483: goto L77;
                default: goto L70;
            }     // Catch: java.lang.Throwable -> L249
        L70:
            goto L6b
        L71:
            if (r0 < r7) goto L77
            r3 = 48736(0xbe60, float:6.8294E-41)
            goto L6b
        L77:
            r3 = 48705(0xbe41, float:6.825E-41)
            goto L6b
        L7b:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L7e:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L86;
                case 239: goto L88;
                default: goto L85;
            }     // Catch: java.lang.Throwable -> L249
        L85:
            goto L7e
        L86:
            r0 = r2
            goto L5a
        L88:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L7e
        L8c:
            r8 = r6[r0]     // Catch: java.lang.Throwable -> L249
            r3 = 1
            kevin.fun.hook.audio.C1117.m8107(r8, r3)     // Catch: java.lang.Throwable -> L147
            java.lang.Class[] r9 = androidx.customview.C1075.m1137(r8)     // Catch: java.lang.Throwable -> L147
            int r3 = r9.length     // Catch: java.lang.Throwable -> L147
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L147
            r4 = r1
        L9a:
            int r11 = r9.length     // Catch: java.lang.Throwable -> L147
            r3 = 48891(0xbefb, float:6.8511E-41)
        L9e:
            r12 = 48908(0xbf0c, float:6.8535E-41)
            r3 = r3 ^ r12
            switch(r3) {
                case 22: goto La6;
                case 53: goto Lc0;
                case 503: goto Laa;
                case 32495: goto Lb0;
                default: goto La5;
            }     // Catch: java.lang.Throwable -> L147
        La5:
            goto L9e
        La6:
            r3 = 48953(0xbf39, float:6.8598E-41)
            goto L9e
        Laa:
            if (r4 < r11) goto La6
            r3 = 49635(0xc1e3, float:6.9553E-41)
            goto L9e
        Lb0:
            java.lang.Object r3 = androidx.vectordrawable.animated.C1102.m3100(r8, r10)     // Catch: java.lang.Throwable -> L147
            java.util.concurrent.atomic.AtomicReference r4 = m7391()     // Catch: java.lang.Throwable -> L147
            androidx.vectordrawable.C1104.m3224(r4, r3)     // Catch: java.lang.Throwable -> L147
            m7412()     // Catch: java.lang.Throwable -> L147
            r0 = r3
            goto L5a
        Lc0:
            r11 = r9[r4]     // Catch: java.lang.Throwable -> L147
            java.lang.Class r3 = androidx.emoji2.C1080.m1524(r5)     // Catch: java.lang.Throwable -> L147
            boolean r12 = androidx.annotation.experimental.C1067.m564(r11, r3)     // Catch: java.lang.Throwable -> L147
            r3 = 49666(0xc202, float:6.9597E-41)
        Lcd:
            r13 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r13
            switch(r3) {
                case 17: goto Ld5;
                case 50: goto Ldb;
                case 76: goto Ldf;
                case 83: goto L104;
                default: goto Ld4;
            }     // Catch: java.lang.Throwable -> L147
        Ld4:
            goto Lcd
        Ld5:
            if (r12 == 0) goto Ldb
            r3 = 49759(0xc25f, float:6.9727E-41)
            goto Lcd
        Ldb:
            r3 = 49728(0xc240, float:6.9684E-41)
            goto Lcd
        Ldf:
            r10[r4] = r5     // Catch: java.lang.Throwable -> L147
            r3 = 49790(0xc27e, float:6.977E-41)
        Le4:
            r11 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 18: goto Lec;
                case 241: goto L100;
                default: goto Leb;
            }
        Leb:
            goto Le4
        Lec:
            int r3 = androidx.loader.C1099.f125
            r3 = r3 ^ 858(0x35a, float:1.202E-42)
            int r4 = r4 + r3
            r3 = 54657(0xd581, float:7.6591E-41)
        Lf4:
            r11 = 54674(0xd592, float:7.6615E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 19: goto Lfc;
                case 50: goto L9a;
                default: goto Lfb;
            }
        Lfb:
            goto Lf4
        Lfc:
            r3 = 54688(0xd5a0, float:7.6634E-41)
            goto Lf4
        L100:
            r3 = 49821(0xc29d, float:6.9814E-41)
            goto Le4
        L104:
            java.lang.Class r12 = androidx.loader.C1095.m2522()     // Catch: java.lang.Throwable -> L147
            r3 = 49914(0xc2fa, float:6.9944E-41)
        L10b:
            r13 = 49931(0xc30b, float:6.9968E-41)
            r3 = r3 ^ r13
            switch(r3) {
                case 497: goto L113;
                case 1711: goto L119;
                case 1736: goto L13f;
                case 1769: goto L11d;
                default: goto L112;
            }     // Catch: java.lang.Throwable -> L147
        L112:
            goto L10b
        L113:
            if (r11 == r12) goto L119
            r3 = 50658(0xc5e2, float:7.0987E-41)
            goto L10b
        L119:
            r3 = 50627(0xc5c3, float:7.0944E-41)
            goto L10b
        L11d:
            r3 = 50689(0xc601, float:7.103E-41)
        L120:
            r12 = 50706(0xc612, float:7.1054E-41)
            r3 = r3 ^ r12
            switch(r3) {
                case 19: goto L128;
                case 45: goto L188;
                case 50: goto L130;
                case 76: goto L134;
                default: goto L127;
            }     // Catch: java.lang.Throwable -> L147
        L127:
            goto L120
        L128:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r11 != r3) goto L130
            r3 = 50782(0xc65e, float:7.1161E-41)
            goto L120
        L130:
            r3 = 50751(0xc63f, float:7.1117E-41)
            goto L120
        L134:
            r3 = 50813(0xc67d, float:7.1204E-41)
        L137:
            r11 = 50830(0xc68e, float:7.1228E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 18: goto L13f;
                case 243: goto L184;
                default: goto L13e;
            }     // Catch: java.lang.Throwable -> L147
        L13e:
            goto L137
        L13f:
            r3 = 0
            java.lang.Integer r3 = androidx.activity.C1064.m334(r3)     // Catch: java.lang.Throwable -> L147
            r10[r4] = r3     // Catch: java.lang.Throwable -> L147
            goto Lec
        L147:
            r3 = move-exception
            java.lang.String r3 = androidx.lifecycle.process.C1091.m2254(r3)     // Catch: java.lang.Throwable -> L249
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L249
            r4.<init>()     // Catch: java.lang.Throwable -> L249
            short[] r8 = m7367()     // Catch: java.lang.Throwable -> L249
            r9 = 672(0x2a0, float:9.42E-43)
            int r10 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L249
            r10 = r10 ^ 87
            r11 = 1546(0x60a, float:2.166E-42)
            java.lang.String r8 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L249
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r8)     // Catch: java.lang.Throwable -> L249
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)     // Catch: java.lang.Throwable -> L249
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L249
            m7397(r3)     // Catch: java.lang.Throwable -> L249
            int r3 = androidx.lifecycle.runtime.C1092.f118
            r3 = r3 ^ 798(0x31e, float:1.118E-42)
            int r0 = r0 + r3
            r3 = 55432(0xd888, float:7.7677E-41)
        L178:
            r4 = 55449(0xd899, float:7.77E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 17: goto L180;
                case 62: goto L69;
                default: goto L17f;
            }
        L17f:
            goto L178
        L180:
            r3 = 55463(0xd8a7, float:7.772E-41)
            goto L178
        L184:
            r3 = 50844(0xc69c, float:7.1248E-41)
            goto L137
        L188:
            java.lang.Class r12 = androidx.loader.C1094.m2475()     // Catch: java.lang.Throwable -> L147
            r3 = 51588(0xc984, float:7.229E-41)
        L18f:
            r13 = 51605(0xc995, float:7.2314E-41)
            r3 = r3 ^ r13
            switch(r3) {
                case 17: goto L197;
                case 54: goto L19d;
                case 87: goto L22e;
                case 116: goto L1a1;
                default: goto L196;
            }     // Catch: java.lang.Throwable -> L147
        L196:
            goto L18f
        L197:
            if (r11 == r12) goto L19d
            r3 = 51681(0xc9e1, float:7.242E-41)
            goto L18f
        L19d:
            r3 = 51650(0xc9c2, float:7.2377E-41)
            goto L18f
        L1a1:
            r3 = 51712(0xca00, float:7.2464E-41)
        L1a4:
            r12 = 51729(0xca11, float:7.2488E-41)
            r3 = r3 ^ r12
            switch(r3) {
                case 14: goto L1ac;
                case 17: goto L1b0;
                case 47: goto L1c7;
                case 76: goto L1b8;
                default: goto L1ab;
            }     // Catch: java.lang.Throwable -> L147
        L1ab:
            goto L1a4
        L1ac:
            r3 = 51774(0xca3e, float:7.2551E-41)
            goto L1a4
        L1b0:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r11 != r3) goto L1ac
            r3 = 51805(0xca5d, float:7.2594E-41)
            goto L1a4
        L1b8:
            r3 = 51836(0xca7c, float:7.2638E-41)
        L1bb:
            r11 = 51853(0xca8d, float:7.2662E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 241: goto L1c3;
                case 1963: goto L22e;
                default: goto L1c2;
            }     // Catch: java.lang.Throwable -> L147
        L1c2:
            goto L1bb
        L1c3:
            r3 = 52518(0xcd26, float:7.3593E-41)
            goto L1bb
        L1c7:
            java.lang.Class r12 = kevin.fun.hook.audio.C1116.m8078()     // Catch: java.lang.Throwable -> L147
            r3 = 52611(0xcd83, float:7.3724E-41)
        L1ce:
            r13 = 52628(0xcd94, float:7.3748E-41)
            r3 = r3 ^ r13
            switch(r3) {
                case 23: goto L1d6;
                case 54: goto L1dc;
                case 85: goto L218;
                case 116: goto L1e0;
                default: goto L1d5;
            }     // Catch: java.lang.Throwable -> L147
        L1d5:
            goto L1ce
        L1d6:
            if (r11 == r12) goto L1dc
            r3 = 52704(0xcde0, float:7.3854E-41)
            goto L1ce
        L1dc:
            r3 = 52673(0xcdc1, float:7.381E-41)
            goto L1ce
        L1e0:
            r3 = 52735(0xcdff, float:7.3897E-41)
        L1e3:
            r12 = 52752(0xce10, float:7.3921E-41)
            r3 = r3 ^ r12
            switch(r3) {
                case 14: goto L1eb;
                case 45: goto L206;
                case 1007: goto L1ef;
                case 7927: goto L1f7;
                default: goto L1ea;
            }     // Catch: java.lang.Throwable -> L147
        L1ea:
            goto L1e3
        L1eb:
            r3 = 52797(0xce3d, float:7.3984E-41)
            goto L1e3
        L1ef:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r11 != r3) goto L1eb
            r3 = 53479(0xd0e7, float:7.494E-41)
            goto L1e3
        L1f7:
            r3 = 53510(0xd106, float:7.4983E-41)
        L1fa:
            r11 = 53527(0xd117, float:7.5007E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 17: goto L202;
                case 50: goto L218;
                default: goto L201;
            }     // Catch: java.lang.Throwable -> L147
        L201:
            goto L1fa
        L202:
            r3 = 53541(0xd125, float:7.5027E-41)
            goto L1fa
        L206:
            r3 = 0
            r10[r4] = r3     // Catch: java.lang.Throwable -> L147
            r3 = 53634(0xd182, float:7.5157E-41)
        L20c:
            r11 = 53651(0xd193, float:7.5181E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 17: goto L214;
                case 50: goto Lec;
                default: goto L213;
            }     // Catch: java.lang.Throwable -> L147
        L213:
            goto L20c
        L214:
            r3 = 53665(0xd1a1, float:7.52E-41)
            goto L20c
        L218:
            r3 = 0
            java.lang.Boolean r3 = androidx.loader.C1096.m2664(r3)     // Catch: java.lang.Throwable -> L147
            r10[r4] = r3     // Catch: java.lang.Throwable -> L147
            r3 = 53758(0xd1fe, float:7.5331E-41)
        L222:
            r11 = 53775(0xd20f, float:7.5355E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 1009: goto L22a;
                case 1703: goto Lec;
                default: goto L229;
            }     // Catch: java.lang.Throwable -> L147
        L229:
            goto L222
        L22a:
            r3 = 54440(0xd4a8, float:7.6287E-41)
            goto L222
        L22e:
            r12 = 19
            int r3 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L147
            long r14 = (long) r3     // Catch: java.lang.Throwable -> L147
            long r12 = r12 ^ r14
            java.lang.Long r3 = androidx.appcompat.resources.C1068.m611(r12)     // Catch: java.lang.Throwable -> L147
            r10[r4] = r3     // Catch: java.lang.Throwable -> L147
            r3 = 54533(0xd505, float:7.6417E-41)
        L23d:
            r11 = 54550(0xd516, float:7.6441E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 19: goto L245;
                case 50: goto Lec;
                default: goto L244;
            }
        L244:
            goto L23d
        L245:
            r3 = 54564(0xd524, float:7.646E-41)
            goto L23d
        L249:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r3 = m7367()
            r4 = 702(0x2be, float:9.84E-43)
            int r5 = androidx.core.ktx.C1070.f96
            r5 = r5 ^ 571(0x23b, float:8.0E-43)
            r6 = 2675(0xa73, float:3.748E-42)
            java.lang.String r3 = androidx.lifecycle.livedata.C1086.m1920(r3, r4, r5, r6)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
            goto L86
    }

    private static java.lang.Object getOrInstantiateMessage() {
            java.util.concurrent.atomic.AtomicReference r0 = m7352()
            java.lang.Object r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r1 = 1616(0x650, float:2.264E-42)
        La:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L30;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r1 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r0 == 0) goto L10
            r1 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L45
            r2 = 723(0x2d3, float:1.013E-42)
            int r3 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L45
            r3 = r3 ^ 291(0x123, float:4.08E-43)
            r4 = 560(0x230, float:7.85E-43)
            java.lang.String r1 = androidx.emoji2.C1080.m1525(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L45
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = m7362(r0, r1, r2)     // Catch: java.lang.Throwable -> L45
        L2f:
            return r0
        L30:
            short[] r0 = m7367()
            r1 = 728(0x2d8, float:1.02E-42)
            int r2 = androidx.lifecycle.process.C1089.f115
            r2 = r2 ^ 908(0x38c, float:1.272E-42)
            r3 = 563(0x233, float:7.89E-43)
            java.lang.String r0 = androidx.viewpager.C1108.m3518(r0, r1, r2, r3)
            m7397(r0)
            r0 = 0
            goto L2f
        L45:
            r1 = move-exception
            goto L2f
    }

    private static java.lang.String getRandomApiName(java.lang.String r4) {
            short[] r0 = m7367()
            r1 = 772(0x304, float:1.082E-42)
            int r2 = androidx.drawerlayout.C1077.f103
            r2 = r2 ^ 282(0x11a, float:3.95E-43)
            r3 = 2443(0x98b, float:3.423E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 1616(0x650, float:2.264E-42)
        L16:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1c;
                case 49: goto L1f;
                case 204: goto L24;
                case 239: goto L35;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L16
        L1f:
            if (r1 == 0) goto L1c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L16
        L24:
            short[] r0 = m7367()
            r1 = 776(0x308, float:1.087E-42)
            int r2 = androidx.vectordrawable.animated.C1102.f128
            r2 = r2 ^ 193(0xc1, float:2.7E-43)
            r3 = 1125(0x465, float:1.576E-42)
            java.lang.String r0 = androidx.drawerlayout.C1077.m1343(r0, r1, r2, r3)
        L34:
            return r0
        L35:
            short[] r0 = m7367()
            r1 = 778(0x30a, float:1.09E-42)
            int r2 = kevin.fun.hook.webdav.C1119.f418
            r2 = r2 ^ 290(0x122, float:4.06E-43)
            r3 = 2159(0x86f, float:3.025E-42)
            java.lang.String r0 = androidx.customview.C1074.m1116(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 1740(0x6cc, float:2.438E-42)
        L4b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L51;
                case 54: goto L56;
                case 471: goto L6a;
                case 500: goto L59;
                default: goto L50;
            }
        L50:
            goto L4b
        L51:
            if (r1 == 0) goto L56
            r0 = 1833(0x729, float:2.569E-42)
            goto L4b
        L56:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L4b
        L59:
            short[] r0 = m7367()
            r1 = 782(0x30e, float:1.096E-42)
            int r2 = androidx.loader.C1097.f123
            r2 = r2 ^ 112(0x70, float:1.57E-43)
            r3 = 1159(0x487, float:1.624E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r1, r2, r3)
            goto L34
        L6a:
            short[] r0 = m7367()
            r1 = 784(0x310, float:1.099E-42)
            int r2 = androidx.lifecycle.process.C1090.f116
            r2 = r2 ^ (-429(0xfffffffffffffe53, float:NaN))
            r3 = 3142(0xc46, float:4.403E-42)
            java.lang.String r0 = androidx.customview.C1075.m1138(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 1864(0x748, float:2.612E-42)
        L80:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L86;
                case 47384: goto La1;
                case 47417: goto L90;
                case 47483: goto L8c;
                default: goto L85;
            }
        L85:
            goto L80
        L86:
            if (r1 == 0) goto L8c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L80
        L8c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L80
        L90:
            short[] r0 = m7367()
            r1 = 787(0x313, float:1.103E-42)
            int r2 = androidx.lifecycle.livedata.C1084.f110
            r2 = r2 ^ 17
            r3 = 3066(0xbfa, float:4.296E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            goto L34
        La1:
            short[] r0 = m7367()
            r1 = 789(0x315, float:1.106E-42)
            int r2 = androidx.activity.C1063.f89
            r2 = r2 ^ 7
            r3 = 1736(0x6c8, float:2.433E-42)
            java.lang.String r0 = androidx.startup.C1100.m2931(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lb8:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto Lc0;
                case 45: goto Ldc;
                case 76: goto Lca;
                case 239: goto Lc4;
                default: goto Lbf;
            }
        Lbf:
            goto Lb8
        Lc0:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lb8
        Lc4:
            if (r1 == 0) goto Lc0
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lb8
        Lca:
            short[] r0 = m7367()
            r1 = 794(0x31a, float:1.113E-42)
            int r2 = androidx.lifecycle.process.C1091.f117
            r2 = r2 ^ (-490(0xfffffffffffffe16, float:NaN))
            r3 = 1084(0x43c, float:1.519E-42)
            java.lang.String r0 = com.tencent.mmkv.C1109.m3629(r0, r1, r2, r3)
            goto L34
        Ldc:
            short[] r0 = m7367()
            r1 = 796(0x31c, float:1.115E-42)
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-967(0xfffffffffffffc39, float:NaN))
            r3 = 2816(0xb00, float:3.946E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1814(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 48891(0xbefb, float:6.8511E-41)
        Lf3:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto Lfb;
                case 53: goto L117;
                case 503: goto Lff;
                case 32495: goto L105;
                default: goto Lfa;
            }
        Lfa:
            goto Lf3
        Lfb:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Lf3
        Lff:
            if (r1 == 0) goto Lfb
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Lf3
        L105:
            short[] r0 = m7367()
            r1 = 801(0x321, float:1.122E-42)
            int r2 = androidx.viewpager.C1108.f134
            r2 = r2 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r3 = 840(0x348, float:1.177E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r0, r1, r2, r3)
            goto L34
        L117:
            short[] r0 = m7367()
            r1 = 803(0x323, float:1.125E-42)
            int r2 = kevin.fun.hook.audio.C1114.f403
            r2 = r2 ^ (-24)
            r3 = 1829(0x725, float:2.563E-42)
            java.lang.String r0 = androidx.interpolator.C1083.m1723(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 49666(0xc202, float:6.9597E-41)
        L12e:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L136;
                case 50: goto L13c;
                case 76: goto L140;
                case 83: goto L152;
                default: goto L135;
            }
        L135:
            goto L12e
        L136:
            if (r1 == 0) goto L13c
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L12e
        L13c:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L12e
        L140:
            short[] r0 = m7367()
            r1 = 807(0x327, float:1.131E-42)
            int r2 = androidx.interpolator.C1082.f108
            r2 = r2 ^ 349(0x15d, float:4.89E-43)
            r3 = 914(0x392, float:1.281E-42)
            java.lang.String r0 = kevin.fun.hook.C1120.m8645(r0, r1, r2, r3)
            goto L34
        L152:
            short[] r0 = m7367()
            r1 = 809(0x329, float:1.134E-42)
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 368(0x170, float:5.16E-43)
            r3 = 1659(0x67b, float:2.325E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10615(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 49790(0xc27e, float:6.977E-41)
        L169:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L171;
                case 51: goto L18d;
                case 84: goto L17b;
                case 241: goto L175;
                default: goto L170;
            }
        L170:
            goto L169
        L171:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L169
        L175:
            if (r1 == 0) goto L171
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L169
        L17b:
            short[] r0 = m7367()
            r1 = 813(0x32d, float:1.139E-42)
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-98)
            r3 = 1884(0x75c, float:2.64E-42)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r1, r2, r3)
            goto L34
        L18d:
            short[] r0 = m7367()
            r1 = 816(0x330, float:1.143E-42)
            int r2 = androidx.vectordrawable.C1103.f129
            r2 = r2 ^ 264(0x108, float:3.7E-43)
            r3 = 2916(0xb64, float:4.086E-42)
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1413(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L1a4:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto L1ac;
                case 1711: goto L1b2;
                case 1736: goto L1c8;
                case 1769: goto L1b6;
                default: goto L1ab;
            }
        L1ab:
            goto L1a4
        L1ac:
            if (r1 == 0) goto L1b2
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L1a4
        L1b2:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L1a4
        L1b6:
            short[] r0 = m7367()
            r1 = 820(0x334, float:1.149E-42)
            int r2 = kevin.fun.hook.audio.C1114.f403
            r2 = r2 ^ (-22)
            r3 = 1551(0x60f, float:2.173E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1920(r0, r1, r2, r3)
            goto L34
        L1c8:
            short[] r0 = m7367()
            r1 = 826(0x33a, float:1.157E-42)
            int r2 = androidx.lifecycle.livedata.C1085.f111
            r2 = r2 ^ 776(0x308, float:1.087E-42)
            r3 = 1280(0x500, float:1.794E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10615(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 50689(0xc601, float:7.103E-41)
        L1df:
            r2 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 19: goto L1e7;
                case 45: goto L203;
                case 50: goto L1ed;
                case 76: goto L1f1;
                default: goto L1e6;
            }
        L1e6:
            goto L1df
        L1e7:
            if (r1 == 0) goto L1ed
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L1df
        L1ed:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L1df
        L1f1:
            short[] r0 = m7367()
            r1 = 831(0x33f, float:1.164E-42)
            int r2 = androidx.customview.C1074.f100
            r2 = r2 ^ 247(0xf7, float:3.46E-43)
            r3 = 1937(0x791, float:2.714E-42)
            java.lang.String r0 = kevin.fun.hook.C1120.m8645(r0, r1, r2, r3)
            goto L34
        L203:
            short[] r0 = m7367()
            r1 = 835(0x343, float:1.17E-42)
            int r2 = androidx.core.ktx.C1070.f96
            r2 = r2 ^ 554(0x22a, float:7.76E-43)
            r3 = 1010(0x3f2, float:1.415E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r1, r2, r3)
            goto L34
    }

    private static java.lang.String getRandomApiUrl(java.lang.String r4) {
            short[] r0 = m7367()
            r1 = 839(0x347, float:1.176E-42)
            int r2 = androidx.vectordrawable.C1103.f129
            r2 = r2 ^ 264(0x108, float:3.7E-43)
            r3 = 694(0x2b6, float:9.73E-43)
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7940(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 1616(0x650, float:2.264E-42)
        L16:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1c;
                case 49: goto L1f;
                case 204: goto L24;
                case 239: goto L35;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L16
        L1f:
            if (r1 == 0) goto L1c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L16
        L24:
            short[] r0 = m7367()
            r1 = 843(0x34b, float:1.181E-42)
            int r2 = androidx.startup.C1101.f127
            r2 = r2 ^ 732(0x2dc, float:1.026E-42)
            r3 = 1699(0x6a3, float:2.381E-42)
            java.lang.String r0 = androidx.activity.C1063.m241(r0, r1, r2, r3)
        L34:
            return r0
        L35:
            short[] r0 = m7367()
            r1 = 877(0x36d, float:1.229E-42)
            int r2 = androidx.customview.C1074.f100
            r2 = r2 ^ 247(0xf7, float:3.46E-43)
            r3 = 1275(0x4fb, float:1.787E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 1740(0x6cc, float:2.438E-42)
        L4b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L51;
                case 54: goto L56;
                case 471: goto L6a;
                case 500: goto L59;
                default: goto L50;
            }
        L50:
            goto L4b
        L51:
            if (r1 == 0) goto L56
            r0 = 1833(0x729, float:2.569E-42)
            goto L4b
        L56:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L4b
        L59:
            short[] r0 = m7367()
            r1 = 881(0x371, float:1.235E-42)
            int r2 = kevin.fun.hook.webdav.C1118.f417
            r2 = r2 ^ (-329(0xfffffffffffffeb7, float:NaN))
            r3 = 2353(0x931, float:3.297E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2213(r0, r1, r2, r3)
            goto L34
        L6a:
            short[] r0 = m7367()
            r1 = 915(0x393, float:1.282E-42)
            int r2 = androidx.lifecycle.runtime.C1092.f118
            r2 = r2 ^ 796(0x31c, float:1.115E-42)
            r3 = 3231(0xc9f, float:4.528E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 1864(0x748, float:2.612E-42)
        L80:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L86;
                case 47384: goto La1;
                case 47417: goto L90;
                case 47483: goto L8c;
                default: goto L85;
            }
        L85:
            goto L80
        L86:
            if (r1 == 0) goto L8c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L80
        L8c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L80
        L90:
            short[] r0 = m7367()
            r1 = 918(0x396, float:1.286E-42)
            int r2 = androidx.activity.C1063.f89
            r2 = r2 ^ 39
            r3 = 2969(0xb99, float:4.16E-42)
            java.lang.String r0 = androidx.core.C1073.m1028(r0, r1, r2, r3)
            goto L34
        La1:
            short[] r0 = m7367()
            r1 = 955(0x3bb, float:1.338E-42)
            int r2 = com.tencent.mmkv.C1109.f135
            r2 = r2 ^ (-483(0xfffffffffffffe1d, float:NaN))
            r3 = 746(0x2ea, float:1.045E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lb8:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto Lc0;
                case 45: goto Ldc;
                case 76: goto Lca;
                case 239: goto Lc4;
                default: goto Lbf;
            }
        Lbf:
            goto Lb8
        Lc0:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lb8
        Lc4:
            if (r1 == 0) goto Lc0
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lb8
        Lca:
            short[] r0 = m7367()
            r1 = 960(0x3c0, float:1.345E-42)
            int r2 = androidx.lifecycle.livedata.C1085.f111
            r2 = r2 ^ 814(0x32e, float:1.14E-42)
            r3 = 1866(0x74a, float:2.615E-42)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r2, r3)
            goto L34
        Ldc:
            short[] r0 = m7367()
            r1 = 995(0x3e3, float:1.394E-42)
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-104(0xffffffffffffff98, float:NaN))
            r3 = 2662(0xa66, float:3.73E-42)
            java.lang.String r0 = androidx.core.C1072.m957(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 48891(0xbefb, float:6.8511E-41)
        Lf3:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto Lfb;
                case 53: goto L117;
                case 503: goto Lff;
                case 32495: goto L105;
                default: goto Lfa;
            }
        Lfa:
            goto Lf3
        Lfb:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Lf3
        Lff:
            if (r1 == 0) goto Lfb
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Lf3
        L105:
            short[] r0 = m7367()
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = androidx.emoji2.viewsintegration.C1078.f104
            r2 = r2 ^ 578(0x242, float:8.1E-43)
            r3 = 597(0x255, float:8.37E-43)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r1, r2, r3)
            goto L34
        L117:
            short[] r0 = m7367()
            r1 = 1037(0x40d, float:1.453E-42)
            int r2 = androidx.emoji2.viewsintegration.C1079.f105
            r2 = r2 ^ (-107(0xffffffffffffff95, float:NaN))
            r3 = 2306(0x902, float:3.231E-42)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 49666(0xc202, float:6.9597E-41)
        L12e:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L136;
                case 50: goto L13c;
                case 76: goto L140;
                case 83: goto L152;
                default: goto L135;
            }
        L135:
            goto L12e
        L136:
            if (r1 == 0) goto L13c
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L12e
        L13c:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L12e
        L140:
            short[] r0 = m7367()
            r1 = 1041(0x411, float:1.459E-42)
            int r2 = androidx.appcompat.C1069.f95
            r2 = r2 ^ (-208(0xffffffffffffff30, float:NaN))
            r3 = 568(0x238, float:7.96E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)
            goto L34
        L152:
            short[] r0 = m7367()
            r1 = 1076(0x434, float:1.508E-42)
            int r2 = androidx.versionedparcelable.C1107.f133
            r2 = r2 ^ 640(0x280, float:8.97E-43)
            r3 = 1593(0x639, float:2.232E-42)
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 49790(0xc27e, float:6.977E-41)
        L169:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L171;
                case 51: goto L18d;
                case 84: goto L17b;
                case 241: goto L175;
                default: goto L170;
            }
        L170:
            goto L169
        L171:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L169
        L175:
            if (r1 == 0) goto L171
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L169
        L17b:
            short[] r0 = m7367()
            r1 = 1080(0x438, float:1.513E-42)
            int r2 = androidx.lifecycle.viewmodel.C1093.f119
            r2 = r2 ^ (-85)
            r3 = 3137(0xc41, float:4.396E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1814(r0, r1, r2, r3)
            goto L34
        L18d:
            short[] r0 = m7367()
            r1 = 1113(0x459, float:1.56E-42)
            int r2 = androidx.versionedparcelable.C1106.f132
            r2 = r2 ^ 136(0x88, float:1.9E-43)
            r3 = 497(0x1f1, float:6.96E-43)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L1a4:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto L1ac;
                case 1711: goto L1b2;
                case 1736: goto L1c8;
                case 1769: goto L1b6;
                default: goto L1ab;
            }
        L1ab:
            goto L1a4
        L1ac:
            if (r1 == 0) goto L1b2
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L1a4
        L1b2:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L1a4
        L1b6:
            short[] r0 = m7367()
            r1 = 1117(0x45d, float:1.565E-42)
            int r2 = kevin.fun.hook.webdav.C1118.f417
            r2 = r2 ^ (-330(0xfffffffffffffeb6, float:NaN))
            r3 = 1227(0x4cb, float:1.72E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8020(r0, r1, r2, r3)
            goto L34
        L1c8:
            short[] r0 = m7367()
            r1 = 1152(0x480, float:1.614E-42)
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-104(0xffffffffffffff98, float:NaN))
            r3 = 1436(0x59c, float:2.012E-42)
            java.lang.String r0 = com.tencent.mmkv.C1109.m3629(r0, r1, r2, r3)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r4)
            r0 = 50689(0xc601, float:7.103E-41)
        L1df:
            r2 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 19: goto L1e7;
                case 45: goto L203;
                case 50: goto L1ed;
                case 76: goto L1f1;
                default: goto L1e6;
            }
        L1e6:
            goto L1df
        L1e7:
            if (r1 == 0) goto L1ed
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L1df
        L1ed:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L1df
        L1f1:
            short[] r0 = m7367()
            r1 = 1157(0x485, float:1.621E-42)
            int r2 = org.luckypray.dexkit.C1123.f433
            r2 = r2 ^ (-993(0xfffffffffffffc1f, float:NaN))
            r3 = 1732(0x6c4, float:2.427E-42)
            java.lang.String r0 = androidx.core.ktx.C1070.m788(r0, r1, r2, r3)
            goto L34
        L203:
            short[] r0 = m7367()
            r1 = 1195(0x4ab, float:1.675E-42)
            int r2 = androidx.viewpager.C1108.f134
            r2 = r2 ^ (-454(0xfffffffffffffe3a, float:NaN))
            r3 = 3003(0xbbb, float:4.208E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)
            goto L34
    }

    private static java.lang.String getRandomSayingText(java.lang.String r11) {
            r4 = 0
            short[] r0 = m7367()
            r1 = 1229(0x4cd, float:1.722E-42)
            int r2 = androidx.activity.C1066.f92
            r2 = r2 ^ 823(0x337, float:1.153E-42)
            r3 = 3265(0xcc1, float:4.575E-42)
            java.lang.String r1 = androidx.vectordrawable.animated.C1102.m3116(r0, r1, r2, r3)
            java.lang.String r5 = m7379(r11)     // Catch: java.lang.Throwable -> L269
            java.lang.String r0 = m7372(r5)     // Catch: java.lang.Throwable -> L269
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L269
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L269
            java.net.URLConnection r0 = androidx.loader.C1094.m2492(r2)     // Catch: java.lang.Throwable -> L269
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L269
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L376
            r3 = 1231(0x4cf, float:1.725E-42)
            int r6 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L376
            r6 = r6 ^ (-56)
            r7 = 2912(0xb60, float:4.08E-42)
            java.lang.String r2 = androidx.loader.C1096.m2645(r2, r3, r6, r7)     // Catch: java.lang.Throwable -> L376
            androidx.versionedparcelable.C1107.m3434(r0, r2)     // Catch: java.lang.Throwable -> L376
            int r2 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L376
            r2 = r2 ^ 5057(0x13c1, float:7.086E-42)
            androidx.lifecycle.process.C1087.m2000(r0, r2)     // Catch: java.lang.Throwable -> L376
            androidx.loader.C1094.m2450(r0, r2)     // Catch: java.lang.Throwable -> L376
            r2 = 0
            androidx.startup.C1100.m2937(r0, r2)     // Catch: java.lang.Throwable -> L376
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L376
            r3 = 1234(0x4d2, float:1.729E-42)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L376
            r6 = r6 ^ (-113(0xffffffffffffff8f, float:NaN))
            r7 = 815(0x32f, float:1.142E-42)
            java.lang.String r2 = androidx.activity.C1066.m468(r2, r3, r6, r7)     // Catch: java.lang.Throwable -> L376
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L376
            r6 = 1244(0x4dc, float:1.743E-42)
            int r7 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L376
            r7 = r7 ^ 370(0x172, float:5.18E-43)
            r8 = 1600(0x640, float:2.242E-42)
            java.lang.String r3 = androidx.loader.C1094.m2495(r3, r6, r7, r8)     // Catch: java.lang.Throwable -> L376
            androidx.activity.C1064.m355(r0, r2, r3)     // Catch: java.lang.Throwable -> L376
            int r3 = androidx.loader.C1094.m57(r0)     // Catch: java.lang.Throwable -> L376
            r2 = 1616(0x650, float:2.264E-42)
        L6e:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L74;
                case 49: goto L77;
                case 204: goto L7e;
                case 239: goto L11e;
                default: goto L73;
            }     // Catch: java.lang.Throwable -> L376
        L73:
            goto L6e
        L74:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L6e
        L77:
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 == r2) goto L74
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L6e
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L376
            r2.<init>()     // Catch: java.lang.Throwable -> L376
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L376
            r7 = 1255(0x4e7, float:1.759E-42)
            int r8 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Throwable -> L376
            r8 = r8 ^ (-251(0xffffffffffffff05, float:NaN))
            r9 = 1605(0x645, float:2.249E-42)
            java.lang.String r6 = androidx.activity.C1066.m468(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L376
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r6)     // Catch: java.lang.Throwable -> L376
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r5)     // Catch: java.lang.Throwable -> L376
            short[] r5 = m7367()     // Catch: java.lang.Throwable -> L376
            r6 = 1279(0x4ff, float:1.792E-42)
            int r7 = com.tencent.mmkv.C1109.f135     // Catch: java.lang.Throwable -> L376
            r7 = r7 ^ (-482(0xfffffffffffffe1e, float:NaN))
            r8 = 3071(0xbff, float:4.303E-42)
            java.lang.String r5 = androidx.activity.C1062.m170(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L376
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r5)     // Catch: java.lang.Throwable -> L376
            java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r2, r3)     // Catch: java.lang.Throwable -> L376
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L376
            m7397(r2)     // Catch: java.lang.Throwable -> L376
            r2 = 1740(0x6cc, float:2.438E-42)
        Lbc:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto Lc2;
                case 54: goto Lc2;
                case 471: goto Le5;
                case 500: goto Lc5;
                default: goto Lc1;
            }
        Lc1:
            goto Lbc
        Lc2:
            r2 = 1802(0x70a, float:2.525E-42)
            goto Lbc
        Lc5:
            r2 = 0
            androidx.lifecycle.process.C1089.m2153(r2)     // Catch: java.lang.Throwable -> Ld5
        Lc9:
            r2 = 1864(0x748, float:2.612E-42)
        Lcb:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto Ld1;
                case 47483: goto Le5;
                default: goto Ld0;
            }
        Ld0:
            goto Lcb
        Ld1:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto Lcb
        Ld5:
            r2 = move-exception
            r2 = 48767(0xbe7f, float:6.8337E-41)
        Ld9:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto Lc9;
                case 239: goto Le1;
                default: goto Le0;
            }
        Le0:
            goto Ld9
        Le1:
            r2 = 48798(0xbe9e, float:6.838E-41)
            goto Ld9
        Le5:
            r2 = 48891(0xbefb, float:6.8511E-41)
        Le8:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto Lf0;
                case 53: goto L11c;
                case 503: goto Lf4;
                case 32495: goto Lfa;
                default: goto Lef;
            }
        Lef:
            goto Le8
        Lf0:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto Le8
        Lf4:
            if (r0 == 0) goto Lf0
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto Le8
        Lfa:
            androidx.emoji2.C1080.m1546(r0)     // Catch: java.lang.Throwable -> L10c
        Lfd:
            r0 = 49666(0xc202, float:6.9597E-41)
        L100:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L108;
                case 50: goto L11c;
                default: goto L107;
            }
        L107:
            goto L100
        L108:
            r0 = 49697(0xc221, float:6.964E-41)
            goto L100
        L10c:
            r0 = move-exception
            r0 = 49790(0xc27e, float:6.977E-41)
        L110:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto Lfd;
                case 241: goto L118;
                default: goto L117;
            }
        L117:
            goto L110
        L118:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L110
        L11c:
            r0 = r1
        L11d:
            return r0
        L11e:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L376
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L376
            java.io.InputStream r6 = androidx.customview.C1075.m1174(r0)     // Catch: java.lang.Throwable -> L376
            short[] r7 = m7367()     // Catch: java.lang.Throwable -> L376
            r8 = 1285(0x505, float:1.8E-42)
            int r9 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L376
            r9 = r9 ^ (-80)
            r10 = 3273(0xcc9, float:4.586E-42)
            java.lang.String r7 = androidx.lifecycle.viewmodel.C1093.m2415(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L376
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L376
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L376
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37b
            r4.<init>()     // Catch: java.lang.Throwable -> L37b
        L141:
            java.lang.String r6 = androidx.loader.C1099.m2897(r3)     // Catch: java.lang.Throwable -> L37b
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L148:
            r7 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 497: goto L150;
                case 1711: goto L156;
                case 1736: goto L257;
                case 1769: goto L15a;
                default: goto L14f;
            }     // Catch: java.lang.Throwable -> L37b
        L14f:
            goto L148
        L150:
            if (r6 != 0) goto L156
            r2 = 50658(0xc5e2, float:7.0987E-41)
            goto L148
        L156:
            r2 = 50627(0xc5c3, float:7.0944E-41)
            goto L148
        L15a:
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r4)     // Catch: java.lang.Throwable -> L37b
            java.lang.String r2 = androidx.documentfile.C1076.m1236(r2)     // Catch: java.lang.Throwable -> L37b
            boolean r6 = androidx.documentfile.C1076.m1246(r2)     // Catch: java.lang.Throwable -> L37b
            r4 = 50689(0xc601, float:7.103E-41)
        L169:
            r7 = 50706(0xc612, float:7.1054E-41)
            r4 = r4 ^ r7
            switch(r4) {
                case 19: goto L171;
                case 45: goto L1fb;
                case 50: goto L177;
                case 76: goto L17b;
                default: goto L170;
            }     // Catch: java.lang.Throwable -> L37b
        L170:
            goto L169
        L171:
            if (r6 == 0) goto L177
            r4 = 50782(0xc65e, float:7.1161E-41)
            goto L169
        L177:
            r4 = 50751(0xc63f, float:7.1117E-41)
            goto L169
        L17b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37b
            r2.<init>()     // Catch: java.lang.Throwable -> L37b
            short[] r4 = m7367()     // Catch: java.lang.Throwable -> L37b
            r6 = 1290(0x50a, float:1.808E-42)
            int r7 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L37b
            r7 = r7 ^ 306(0x132, float:4.29E-43)
            r8 = 2905(0xb59, float:4.071E-42)
            java.lang.String r4 = androidx.vectordrawable.C1104.m3232(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L37b
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)     // Catch: java.lang.Throwable -> L37b
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r5)     // Catch: java.lang.Throwable -> L37b
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L37b
            m7397(r2)     // Catch: java.lang.Throwable -> L37b
            androidx.lifecycle.process.C1089.m2153(r3)     // Catch: java.lang.Throwable -> L1c0
        L1a2:
            r2 = 50813(0xc67d, float:7.1204E-41)
        L1a5:
            r3 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 18: goto L1ad;
                case 243: goto L1bc;
                default: goto L1ac;
            }
        L1ac:
            goto L1a5
        L1ad:
            r2 = 51712(0xca00, float:7.2464E-41)
        L1b0:
            r3 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1b8;
                case 17: goto L1d0;
                case 47: goto L1f8;
                case 76: goto L1d6;
                default: goto L1b7;
            }
        L1b7:
            goto L1b0
        L1b8:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L1b0
        L1bc:
            r2 = 50844(0xc69c, float:7.1248E-41)
            goto L1a5
        L1c0:
            r2 = move-exception
            r2 = 51588(0xc984, float:7.229E-41)
        L1c4:
            r3 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L1cc;
                case 54: goto L1a2;
                default: goto L1cb;
            }
        L1cb:
            goto L1c4
        L1cc:
            r2 = 51619(0xc9a3, float:7.2334E-41)
            goto L1c4
        L1d0:
            if (r0 == 0) goto L1b8
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L1b0
        L1d6:
            androidx.emoji2.C1080.m1546(r0)     // Catch: java.lang.Throwable -> L1e8
        L1d9:
            r0 = 51836(0xca7c, float:7.2638E-41)
        L1dc:
            r2 = 51853(0xca8d, float:7.2662E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 241: goto L1e4;
                case 1963: goto L1f8;
                default: goto L1e3;
            }
        L1e3:
            goto L1dc
        L1e4:
            r0 = 52518(0xcd26, float:7.3593E-41)
            goto L1dc
        L1e8:
            r0 = move-exception
            r0 = 52611(0xcd83, float:7.3724E-41)
        L1ec:
            r2 = 52628(0xcd94, float:7.3748E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 23: goto L1f4;
                case 54: goto L1d9;
                default: goto L1f3;
            }
        L1f3:
            goto L1ec
        L1f4:
            r0 = 52642(0xcda2, float:7.3767E-41)
            goto L1ec
        L1f8:
            r0 = r1
            goto L11d
        L1fb:
            androidx.lifecycle.process.C1089.m2153(r3)     // Catch: java.lang.Throwable -> L21e
        L1fe:
            r1 = 52735(0xcdff, float:7.3897E-41)
        L201:
            r3 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L209;
                case 1007: goto L21a;
                default: goto L208;
            }
        L208:
            goto L201
        L209:
            r1 = 53634(0xd182, float:7.5157E-41)
        L20c:
            r3 = 53651(0xd193, float:7.5181E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L214;
                case 50: goto L22e;
                case 76: goto L232;
                case 83: goto L254;
                default: goto L213;
            }
        L213:
            goto L20c
        L214:
            if (r0 == 0) goto L22e
            r1 = 53727(0xd1df, float:7.5288E-41)
            goto L20c
        L21a:
            r1 = 52766(0xce1e, float:7.3941E-41)
            goto L201
        L21e:
            r1 = move-exception
            r1 = 53510(0xd106, float:7.4983E-41)
        L222:
            r3 = 53527(0xd117, float:7.5007E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L22a;
                case 50: goto L1fe;
                default: goto L229;
            }
        L229:
            goto L222
        L22a:
            r1 = 53541(0xd125, float:7.5027E-41)
            goto L222
        L22e:
            r1 = 53696(0xd1c0, float:7.5244E-41)
            goto L20c
        L232:
            androidx.emoji2.C1080.m1546(r0)     // Catch: java.lang.Throwable -> L244
        L235:
            r0 = 53758(0xd1fe, float:7.5331E-41)
        L238:
            r1 = 53775(0xd20f, float:7.5355E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 1009: goto L240;
                case 1703: goto L254;
                default: goto L23f;
            }
        L23f:
            goto L238
        L240:
            r0 = 54440(0xd4a8, float:7.6287E-41)
            goto L238
        L244:
            r0 = move-exception
            r0 = 54533(0xd505, float:7.6417E-41)
        L248:
            r1 = 54550(0xd516, float:7.6441E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L250;
                case 50: goto L235;
                default: goto L24f;
            }
        L24f:
            goto L248
        L250:
            r0 = 54564(0xd524, float:7.646E-41)
            goto L248
        L254:
            r0 = r2
            goto L11d
        L257:
            androidx.lifecycle.livedata.C1085.m1859(r4, r6)     // Catch: java.lang.Throwable -> L37b
            r2 = 54657(0xd581, float:7.6591E-41)
        L25d:
            r6 = 54674(0xd592, float:7.6615E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 19: goto L265;
                case 50: goto L141;
                default: goto L264;
            }
        L264:
            goto L25d
        L265:
            r2 = 54688(0xd5a0, float:7.6634E-41)
            goto L25d
        L269:
            r0 = move-exception
            r2 = r0
            r3 = r4
            r5 = r4
        L26d:
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r2)     // Catch: java.lang.Throwable -> L306
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L306
            r2.<init>()     // Catch: java.lang.Throwable -> L306
            short[] r4 = m7367()     // Catch: java.lang.Throwable -> L306
            r6 = 1310(0x51e, float:1.836E-42)
            int r7 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L306
            r7 = r7 ^ 946(0x3b2, float:1.326E-42)
            r8 = 1618(0x652, float:2.267E-42)
            java.lang.String r4 = androidx.versionedparcelable.C1106.m3338(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L306
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r4)     // Catch: java.lang.Throwable -> L306
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)     // Catch: java.lang.Throwable -> L306
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L306
            m7397(r0)     // Catch: java.lang.Throwable -> L306
            r0 = 55432(0xd888, float:7.7677E-41)
        L298:
            r2 = 55449(0xd899, float:7.77E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L2a0;
                case 62: goto L2a6;
                case 95: goto L2cc;
                case 124: goto L2aa;
                default: goto L29f;
            }
        L29f:
            goto L298
        L2a0:
            if (r3 == 0) goto L2a6
            r0 = 55525(0xd8e5, float:7.7807E-41)
            goto L298
        L2a6:
            r0 = 55494(0xd8c6, float:7.7764E-41)
            goto L298
        L2aa:
            androidx.lifecycle.process.C1089.m2153(r3)     // Catch: java.lang.Throwable -> L2bc
        L2ad:
            r0 = 55556(0xd904, float:7.785E-41)
        L2b0:
            r2 = 55573(0xd915, float:7.7874E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L2b8;
                case 54: goto L2cc;
                default: goto L2b7;
            }
        L2b7:
            goto L2b0
        L2b8:
            r0 = 55587(0xd923, float:7.7894E-41)
            goto L2b0
        L2bc:
            r0 = move-exception
            r0 = 55680(0xd980, float:7.8024E-41)
        L2c0:
            r2 = 55697(0xd991, float:7.8048E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L2c8;
                case 1467: goto L2ad;
                default: goto L2c7;
            }
        L2c7:
            goto L2c0
        L2c8:
            r0 = 56362(0xdc2a, float:7.898E-41)
            goto L2c0
        L2cc:
            r0 = 56455(0xdc87, float:7.911E-41)
        L2cf:
            r2 = 56472(0xdc98, float:7.9134E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 31: goto L2d7;
                case 62: goto L2dd;
                case 93: goto L303;
                case 124: goto L2e1;
                default: goto L2d6;
            }
        L2d6:
            goto L2cf
        L2d7:
            if (r5 == 0) goto L2dd
            r0 = 56548(0xdce4, float:7.924E-41)
            goto L2cf
        L2dd:
            r0 = 56517(0xdcc5, float:7.9197E-41)
            goto L2cf
        L2e1:
            androidx.emoji2.C1080.m1546(r5)     // Catch: java.lang.Throwable -> L2f3
        L2e4:
            r0 = 56579(0xdd03, float:7.9284E-41)
        L2e7:
            r2 = 56596(0xdd14, float:7.9308E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 23: goto L2ef;
                case 54: goto L303;
                default: goto L2ee;
            }
        L2ee:
            goto L2e7
        L2ef:
            r0 = 56610(0xdd22, float:7.9328E-41)
            goto L2e7
        L2f3:
            r0 = move-exception
            r0 = 1507503(0x1700af, float:2.112462E-39)
        L2f7:
            r2 = 1507520(0x1700c0, float:2.112485E-39)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L2e4;
                case 111: goto L2ff;
                default: goto L2fe;
            }
        L2fe:
            goto L2f7
        L2ff:
            r0 = 1507534(0x1700ce, float:2.112505E-39)
            goto L2f7
        L303:
            r0 = r1
            goto L11d
        L306:
            r0 = move-exception
            r1 = 1507627(0x17012b, float:2.112635E-39)
        L30a:
            r2 = 1507644(0x17013c, float:2.112659E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 23: goto L312;
                case 85: goto L33e;
                case 118: goto L318;
                case 180: goto L31c;
                default: goto L311;
            }
        L311:
            goto L30a
        L312:
            if (r3 == 0) goto L318
            r1 = 1507720(0x170188, float:2.112766E-39)
            goto L30a
        L318:
            r1 = 1507689(0x170169, float:2.112722E-39)
            goto L30a
        L31c:
            androidx.lifecycle.process.C1089.m2153(r3)     // Catch: java.lang.Throwable -> L32e
        L31f:
            r1 = 1507751(0x1701a7, float:2.112809E-39)
        L322:
            r2 = 1507768(0x1701b8, float:2.112833E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 31: goto L32a;
                case 1513: goto L33e;
                default: goto L329;
            }
        L329:
            goto L322
        L32a:
            r1 = 1508433(0x170451, float:2.113765E-39)
            goto L322
        L32e:
            r1 = move-exception
            r1 = 1508526(0x1704ae, float:2.113895E-39)
        L332:
            r2 = 1508543(0x1704bf, float:2.113919E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L33a;
                case 114: goto L31f;
                default: goto L339;
            }
        L339:
            goto L332
        L33a:
            r1 = 1508557(0x1704cd, float:2.113939E-39)
            goto L332
        L33e:
            r1 = 1508650(0x17052a, float:2.114069E-39)
        L341:
            r2 = 1508667(0x17053b, float:2.114093E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L349;
                case 83: goto L361;
                case 114: goto L34f;
                case 3369: goto L353;
                default: goto L348;
            }
        L348:
            goto L341
        L349:
            if (r5 == 0) goto L34f
            r1 = 1509394(0x170812, float:2.115111E-39)
            goto L341
        L34f:
            r1 = 1508712(0x170568, float:2.114156E-39)
            goto L341
        L353:
            androidx.emoji2.C1080.m1546(r5)     // Catch: java.lang.Throwable -> L366
        L356:
            r1 = 1509425(0x170831, float:2.115155E-39)
        L359:
            r2 = 1509442(0x170842, float:2.115179E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L361;
                case 115: goto L362;
                default: goto L360;
            }
        L360:
            goto L359
        L361:
            throw r0
        L362:
            r1 = 1509456(0x170850, float:2.115198E-39)
            goto L359
        L366:
            r1 = move-exception
            r1 = 1509549(0x1708ad, float:2.115329E-39)
        L36a:
            r2 = 1509566(0x1708be, float:2.115353E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 19: goto L372;
                case 114: goto L356;
                default: goto L371;
            }
        L371:
            goto L36a
        L372:
            r1 = 1509580(0x1708cc, float:2.115372E-39)
            goto L36a
        L376:
            r2 = move-exception
            r3 = r4
            r5 = r0
            goto L26d
        L37b:
            r2 = move-exception
            r5 = r0
            goto L26d
    }

    private static java.lang.String getSparkUserName(long r6) {
            r0 = 0
            java.lang.String r5 = "ۣۤۨ"
            r1 = r0
            r2 = r0
            r3 = r0
            r4 = r0
        L7:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r0) {
                case 1750567: goto L26;
                case 1751625: goto L16;
                case 1752616: goto L2d;
                case 1755555: goto L1e;
                default: goto Le;
            }
        Le:
            java.lang.Object r1 = androidx.customview.C1074.m1087(r2, r3)
            java.lang.String r0 = "ۣ۠ۤ"
            r5 = r0
            goto L7
        L16:
            java.util.concurrent.ConcurrentHashMap r0 = m7387()
            java.lang.String r5 = "ۨۦۡ"
            r2 = r0
            goto L7
        L1e:
            java.lang.Long r0 = androidx.appcompat.resources.C1068.m611(r6)
            java.lang.String r5 = "ۤۡۥ"
            r3 = r0
            goto L7
        L26:
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = "ۥۤۧ"
            r4 = r0
            goto L7
        L2d:
            return r4
    }

    private static java.lang.String getTodayDateString() {
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۥۤۧ"
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
                case 1748860: goto L55;
                case 1749854: goto L23;
                case 1752454: goto L48;
                case 1752524: goto L38;
                case 1753415: goto L4f;
                case 1753663: goto L2c;
                case 1754408: goto L1a;
                case 1754624: goto L40;
                default: goto L12;
            }
        L12:
            short[] r1 = m7367()
            java.lang.String r6 = "ۦ۟۠"
            r2 = r1
            goto Lb
        L1a:
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r6 = "ۧۧ۠"
            r4 = r1
            goto Lb
        L23:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r5, r0)
            java.lang.String r6 = "ۧ۠ۡ"
            r3 = r1
            goto Lb
        L2c:
            r1 = 1328(0x530, float:1.861E-42)
            r5 = 399(0x18f, float:5.59E-43)
            java.lang.String r1 = androidx.loader.C1099.m2843(r2, r1, r9, r5)
            java.lang.String r6 = "ۥۡۨ"
            r5 = r1
            goto Lb
        L38:
            java.util.Locale r0 = androidx.activity.C1064.m382()
            java.lang.String r1 = "ۢۨۤ"
            r6 = r1
            goto Lb
        L40:
            java.lang.String r1 = androidx.appcompat.resources.C1068.m657(r3, r4)
            java.lang.String r6 = "ۡۧۢ"
            r5 = r1
            goto Lb
        L48:
            r8 = r7 ^ 262(0x106, float:3.67E-43)
            java.lang.String r1 = "ۦۧ۠"
            r6 = r1
            r9 = r8
            goto Lb
        L4f:
            int r7 = androidx.vectordrawable.C1103.f129
            java.lang.String r1 = "ۥ۟۠"
            r6 = r1
            goto Lb
        L55:
            return r5
    }

    private static boolean hasRenewedToday(java.lang.String r11) {
            r7 = 0
            r1 = 0
            java.lang.String r10 = "ۣۧۡ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r7
            r8 = r7
            r9 = r7
        Lc:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r10)
            switch(r1) {
                case 56381: goto L62;
                case 56420: goto L1c;
                case 56476: goto L7e;
                case 1747776: goto L4b;
                case 1747777: goto L54;
                case 1748643: goto L43;
                case 1749577: goto L2d;
                case 1751748: goto L6b;
                case 1752701: goto L24;
                case 1753543: goto L5b;
                case 1754501: goto L74;
                case 1755342: goto L36;
                default: goto L13;
            }
        L13:
            java.lang.String r1 = m7350()
            java.lang.String r7 = "ۢ۟"
            r5 = r1
            r10 = r7
            goto Lc
        L1c:
            short[] r0 = m7367()
            java.lang.String r1 = "ۦۣۤ"
            r10 = r1
            goto Lc
        L24:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r4)
            java.lang.String r7 = "ۡ۠ۢ"
            r5 = r1
            r10 = r7
            goto Lc
        L2d:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r11)
            java.lang.String r7 = "ۥۧ۟"
            r4 = r1
            r10 = r7
            goto Lc
        L36:
            r1 = 1338(0x53a, float:1.875E-42)
            r5 = 3010(0xbc2, float:4.218E-42)
            java.lang.String r1 = com.tencent.mmkv.C1109.m3629(r0, r1, r8, r5)
            java.lang.String r7 = "ۤۧۧ"
            r5 = r1
            r10 = r7
            goto Lc
        L43:
            java.lang.String r11 = androidx.emoji2.C1080.m1562()
            java.lang.String r1 = "ۣۣ۠"
            r10 = r1
            goto Lc
        L4b:
            java.lang.String r1 = androidx.interpolator.C1081.m1642(r5, r11)
            java.lang.String r7 = "ۣۡ"
            r3 = r1
            r10 = r7
            goto Lc
        L54:
            r7 = r9 ^ 210(0xd2, float:2.94E-43)
            java.lang.String r1 = "ۨ۟ۥ"
            r8 = r7
            r10 = r1
            goto Lc
        L5b:
            int r7 = androidx.vectordrawable.animated.C1102.f128
            java.lang.String r1 = "ۣ۠ۤ"
            r9 = r7
            r10 = r1
            goto Lc
        L62:
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r5, r3)
            java.lang.String r7 = "ۥۡ"
            r6 = r1
            r10 = r7
            goto Lc
        L6b:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)
            java.lang.String r7 = "ۢ۟ۦ"
            r2 = r1
            r10 = r7
            goto Lc
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "ۣۧ"
            r4 = r1
            r10 = r7
            goto Lc
        L7e:
            return r6
    }

    public static void init(java.lang.ClassLoader r3, android.content.Context r4) {
            java.util.concurrent.atomic.AtomicBoolean r0 = m7385()
            r1 = 0
            r2 = 1
            boolean r1 = androidx.loader.C1098.m2817(r0, r1, r2)
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L3e;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r1 != 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            int r1 = androidx.drawerlayout.C1077.m1360()
            r0 = 1740(0x6cc, float:2.438E-42)
        L20:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L26;
                case 54: goto L2b;
                case 471: goto L3d;
                case 500: goto L2e;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            if (r1 < 0) goto L2b
            r0 = 1833(0x729, float:2.569E-42)
            goto L20
        L2b:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L20
        L2e:
            java.lang.String r0 = "KDrruYQBShaUp790y5QdvixS"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3d:
            return
        L3e:
            kevin.fun.hook.SparkRenewHelper.classLoader = r3
            kevin.fun.hook.SparkRenewHelper.hostContext = r4
            m7363()
            goto L3d
    }

    private static boolean isConversationEnabled(java.lang.String r7) {
            r1 = 0
            java.util.concurrent.ConcurrentHashMap r0 = m7382()
            java.lang.Object r0 = androidx.customview.C1074.m1087(r0, r7)
            kevin.fun.hook.SparkRenewHelper$SparkInfo r0 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7367()
            r4 = 1355(0x54b, float:1.899E-42)
            int r5 = androidx.lifecycle.livedata.C1086.f112
            r5 = r5 ^ 939(0x3ab, float:1.316E-42)
            r6 = 3091(0xc13, float:4.331E-42)
            java.lang.String r3 = androidx.core.C1073.m1028(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r7)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            boolean r4 = kevin.fun.hook.webdav.C1118.m8503(r2)
            r2 = 1616(0x650, float:2.264E-42)
        L32:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L38;
                case 49: goto L3b;
                case 204: goto L40;
                case 239: goto L56;
                default: goto L37;
            }
        L37:
            goto L32
        L38:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L32
        L3b:
            if (r4 == 0) goto L38
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L32
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r7)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            boolean r0 = kevin.fun.hook.audio.C1114.m7905(r0, r1)
        L55:
            return r0
        L56:
            r2 = 1740(0x6cc, float:2.438E-42)
        L58:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L5e;
                case 54: goto L63;
                case 471: goto L7e;
                case 500: goto L66;
                default: goto L5d;
            }
        L5d:
            goto L58
        L5e:
            if (r0 == 0) goto L63
            r2 = 1833(0x729, float:2.569E-42)
            goto L58
        L63:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L58
        L66:
            boolean r2 = kevin.fun.hook.audio.C1114.m7910(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L6c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L72;
                case 47384: goto L7e;
                case 47417: goto L7c;
                case 47483: goto L78;
                default: goto L71;
            }
        L71:
            goto L6c
        L72:
            if (r2 == 0) goto L78
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L6c
        L78:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L6c
        L7c:
            r0 = 1
            goto L55
        L7e:
            r0 = r1
            goto L55
    }

    public static boolean isEnabled() {
            r0 = 0
            android.content.Context r2 = m7377()
            r1 = 1616(0x650, float:2.264E-42)
        L7:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L29;
                case 239: goto L15;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r2 != 0) goto Ld
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            short[] r1 = m7367()
            r2 = 1373(0x55d, float:1.924E-42)
            int r3 = androidx.lifecycle.livedata.C1084.f110
            r3 = r3 ^ 1
            r4 = 2264(0x8d8, float:3.173E-42)
            java.lang.String r1 = androidx.interpolator.C1082.m1694(r1, r2, r3, r4)
            boolean r0 = kevin.fun.hook.audio.C1114.m7905(r1, r0)
        L29:
            return r0
    }

    private static boolean isOnlySparkFilter() {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۨۢ۠"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746814: goto L38;
                case 1749793: goto L22;
                case 1755430: goto L2a;
                case 1755525: goto L32;
                case 1755529: goto L16;
                default: goto L10;
            }
        L10:
            r7 = r6 ^ 945(0x3b1, float:1.324E-42)
            java.lang.String r1 = "ۨۥۦ"
            r3 = r1
            goto L9
        L16:
            r1 = 1391(0x56f, float:1.949E-42)
            r2 = 2473(0x9a9, float:3.465E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r0, r1, r7, r2)
            java.lang.String r3 = "ۢۦۥ"
            r2 = r1
            goto L9
        L22:
            boolean r4 = kevin.fun.hook.audio.C1114.m7905(r2, r5)
            java.lang.String r1 = "ۣ۟ۢ"
            r3 = r1
            goto L9
        L2a:
            short[] r0 = m7367()
            java.lang.String r1 = "ۨۥۢ"
            r3 = r1
            goto L9
        L32:
            int r6 = androidx.lifecycle.process.C1089.f115
            java.lang.String r1 = "ۢ۠ۦ"
            r3 = r1
            goto L9
        L38:
            return r4
    }

    private static boolean isSendReady() {
            m7376()
            m7378()
            java.util.concurrent.atomic.AtomicReference r0 = m7408()
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L10:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L16;
                case 49: goto L19;
                case 204: goto L1e;
                case 239: goto L68;
                default: goto L15;
            }
        L15:
            goto L10
        L16:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L10
        L19:
            if (r1 == 0) goto L16
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L10
        L1e:
            java.util.concurrent.atomic.AtomicReference r0 = m7391()
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L28:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2e;
                case 54: goto L33;
                case 471: goto L68;
                case 500: goto L36;
                default: goto L2d;
            }
        L2d:
            goto L28
        L2e:
            if (r1 == 0) goto L33
            r0 = 1833(0x729, float:2.569E-42)
            goto L28
        L33:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L28
        L36:
            java.util.concurrent.atomic.AtomicReference r0 = m7352()
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L40:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L46;
                case 47384: goto L68;
                case 47417: goto L50;
                case 47483: goto L4c;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            if (r1 == 0) goto L4c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L40
        L4c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L40
        L50:
            r0 = 1
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L54:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L5c;
                case 239: goto L64;
                default: goto L5b;
            }
        L5b:
            goto L54
        L5c:
            java.util.concurrent.atomic.AtomicBoolean r1 = m7394()
            androidx.drawerlayout.C1077.m1308(r1, r0)
            return r0
        L64:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L54
        L68:
            r0 = 0
            goto L5c
    }

    private static boolean isUseCustomMessage(java.lang.String r10) {
            r1 = 0
            r7 = 0
            java.lang.String r5 = "ۣۥ۠"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
            r9 = r7
        Lb:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56446: goto L4d;
                case 1746789: goto L57;
                case 1747651: goto L5f;
                case 1748861: goto L33;
                case 1750718: goto L22;
                case 1751531: goto L1a;
                case 1751742: goto L2b;
                case 1752583: goto L45;
                case 1753604: goto L53;
                case 1753670: goto L39;
                default: goto L12;
            }
        L12:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r4)
            java.lang.String r5 = "ۦۥۣ"
            r3 = r1
            goto Lb
        L1a:
            short[] r1 = m7367()
            java.lang.String r5 = "ۣۡۧ"
            r2 = r1
            goto Lb
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "ۤ۠ۧ"
            r4 = r1
            goto Lb
        L2b:
            boolean r6 = kevin.fun.hook.audio.C1114.m7905(r3, r7)
            java.lang.String r1 = "۠۟ۢ"
            r5 = r1
            goto Lb
        L33:
            int r8 = kevin.fun.hook.audio.C1114.f403
            java.lang.String r1 = "ۤۢ"
            r5 = r1
            goto Lb
        L39:
            r1 = 1408(0x580, float:1.973E-42)
            r3 = 1214(0x4be, float:1.701E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1413(r2, r1, r9, r3)
            java.lang.String r5 = "۟ۢۨ"
            r3 = r1
            goto Lb
        L45:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r10)
            java.lang.String r5 = "۠ۦ۠"
            r4 = r1
            goto Lb
        L4d:
            r9 = r8 ^ (-6)
            java.lang.String r1 = "ۦۧۧ"
            r5 = r1
            goto Lb
        L53:
            java.lang.String r1 = "ۤۧۡ"
            r5 = r1
            goto Lb
        L57:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)
            java.lang.String r1 = "ۥۣۥ"
            r5 = r1
            goto Lb
        L5f:
            return r6
    }

    static /* synthetic */ void lambda$0(android.app.Activity r0) {
            m7381(r0)
            return
    }

    static /* synthetic */ void lambda$1(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$10(android.content.Context r0, kevin.fun.hook.SparkRenewHelper.SparkInfo r1, java.lang.Runnable r2, android.view.View r3) {
            m7398(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$11(android.content.Context r0, kevin.fun.hook.SparkRenewHelper.SparkInfo r1, java.lang.Runnable r2, android.view.View r3) {
            m7370(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$12(kevin.fun.hook.SparkRenewHelper.SparkInfo r8, java.lang.Runnable r9, android.content.Context r10, android.view.View r11) {
            r1 = 0
            r5 = 0
            java.lang.String r7 = "ۣۨۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r5
            r6 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r7)
            switch(r1) {
                case 1746720: goto L55;
                case 1746971: goto L1c;
                case 1747651: goto L47;
                case 1748827: goto L23;
                case 1749641: goto L3b;
                case 1750813: goto L29;
                case 1751528: goto L61;
                case 1752484: goto L59;
                case 1752611: goto L4e;
                case 1752701: goto L31;
                case 1755401: goto L37;
                case 1755437: goto L3f;
                default: goto L10;
            }
        L10:
            r1 = 1430(0x596, float:2.004E-42)
            r3 = 2177(0x881, float:3.05E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1084.m1796(r0, r1, r4, r3)
            java.lang.String r7 = "ۨۢۧ"
            r3 = r1
            goto L9
        L1c:
            m7368(r3)
            java.lang.String r1 = "۠۟ۢ"
            r7 = r1
            goto L9
        L23:
            r1 = r6 ^ 521(0x209, float:7.3E-43)
            java.lang.String r7 = "۟ۤ۟"
            r4 = r1
            goto L9
        L29:
            java.lang.String r1 = androidx.viewpager.C1108.m3493(r8)
            java.lang.String r7 = "۟ۨۤ"
            r3 = r1
            goto L9
        L31:
            int r1 = androidx.appcompat.resources.C1068.f94
            java.lang.String r7 = "ۡۦ۠"
            r6 = r1
            goto L9
        L37:
            java.lang.String r1 = "۟۠ۡ"
            r7 = r1
            goto L9
        L3b:
            java.lang.String r1 = "ۥ۠۟"
            r7 = r1
            goto L9
        L3f:
            android.widget.Toast r1 = androidx.emoji2.viewsintegration.C1078.m1430(r10, r3, r5)
            java.lang.String r7 = "ۥۤۢ"
            r2 = r1
            goto L9
        L47:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r9)
            java.lang.String r1 = "ۨۡۢ"
            r7 = r1
            goto L9
        L4e:
            androidx.viewpager.C1108.m3524(r2)
            java.lang.String r1 = "ۤ۠ۤ"
            r7 = r1
            goto L9
        L55:
            java.lang.String r1 = "ۢۡۨ"
            r7 = r1
            goto L9
        L59:
            short[] r0 = m7367()
            java.lang.String r1 = "ۥۧ۟"
            r7 = r1
            goto L9
        L61:
            return
    }

    static /* synthetic */ void lambda$13(kevin.fun.hook.SparkRenewHelper.SparkInfo r4, android.widget.Switch r5, android.widget.CompoundButton r6, boolean r7) {
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r4)
            m7373(r0, r7)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L25;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r7 == 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            r0 = -119723(0xfffffffffffe2c55, float:NaN)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L22;
                case 54: goto L28;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1c
        L25:
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
        L28:
            android.content.res.ColorStateList r2 = androidx.lifecycle.process.C1088.m2050(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L2e:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L34;
                case 47384: goto L6d;
                case 47417: goto L3e;
                case 47483: goto L3a;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            if (r7 == 0) goto L3a
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2e
        L3a:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2e
        L3e:
            r0 = 872295509(0x33fe2c55, float:1.1835861E-7)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L44:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L4c;
                case 239: goto L69;
                default: goto L4b;
            }
        L4b:
            goto L44
        L4c:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            androidx.emoji2.viewsintegration.C1079.m1472(r5, r2)
            kevin.fun.hook.webdav.C1118.m8476(r5, r0)
            int r1 = androidx.lifecycle.process.C1089.m2142()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L5d:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L65;
                case 53: goto L86;
                case 503: goto L71;
                case 32495: goto L77;
                default: goto L64;
            }
        L64:
            goto L5d
        L65:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L5d
        L69:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L44
        L6d:
            r0 = 869059788(0x33cccccc, float:9.5367426E-8)
            goto L4c
        L71:
            if (r1 < 0) goto L65
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L5d
        L77:
            java.lang.String r0 = "wUPxR"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L86:
            return
    }

    static /* synthetic */ void lambda$14(kevin.fun.hook.SparkRenewHelper.SparkInfo r2, android.widget.CompoundButton r3, boolean r4) {
            r0 = 0
            java.lang.String r1 = "۟ۧۦ"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1748829: goto L11;
                case 1749606: goto L17;
                default: goto La;
            }
        La:
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r2)
            java.lang.String r1 = "ۡۦۢ"
            goto L3
        L11:
            m7373(r0, r4)
            java.lang.String r1 = "ۢ۠ۤ"
            goto L3
        L17:
            return
    }

    static /* synthetic */ void lambda$15(android.widget.EditText r5, android.content.Context r6, kevin.fun.hook.SparkRenewHelper.SparkInfo r7, java.lang.Runnable r8, android.content.DialogInterface r9, int r10) {
            r4 = 0
            android.text.Editable r0 = androidx.drawerlayout.C1077.m1276(r5)
            java.lang.String r0 = androidx.startup.C1101.m2982(r0)
            java.lang.String r1 = androidx.documentfile.C1076.m1236(r0)
            boolean r2 = androidx.documentfile.C1076.m1246(r1)
            r0 = 1616(0x650, float:2.264E-42)
        L13:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L21;
                case 239: goto L39;
                default: goto L18;
            }
        L18:
            goto L13
        L19:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r2 == 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            short[] r0 = m7367()
            r1 = 1437(0x59d, float:2.014E-42)
            int r2 = androidx.lifecycle.process.C1091.f117
            r2 = r2 ^ (-494(0xfffffffffffffe12, float:NaN))
            r3 = 1716(0x6b4, float:2.405E-42)
            java.lang.String r0 = androidx.drawerlayout.C1077.m1343(r0, r1, r2, r3)
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r6, r0, r4)
            androidx.viewpager.C1108.m3524(r0)
        L38:
            return
        L39:
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r7)
            m7358(r0, r1)
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r7)
            r1 = 1
            m7409(r0, r1)
            r0 = 1740(0x6cc, float:2.438E-42)
        L4a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L50;
                case 54: goto L55;
                case 471: goto L5b;
                case 500: goto L58;
                default: goto L4f;
            }
        L4f:
            goto L4a
        L50:
            if (r8 == 0) goto L55
            r0 = 1833(0x729, float:2.569E-42)
            goto L4a
        L55:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L4a
        L58:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r8)
        L5b:
            short[] r0 = m7367()
            r1 = 1443(0x5a3, float:2.022E-42)
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-107(0xffffffffffffff95, float:NaN))
            r3 = 692(0x2b4, float:9.7E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1087.m2008(r0, r1, r2, r3)
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r6, r0, r4)
            androidx.viewpager.C1108.m3524(r0)
            goto L38
    }

    static /* synthetic */ void lambda$16(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$17(java.util.List r4, int r5, int[] r6, android.view.View r7) {
            r2 = 0
            r3 = r2
        L2:
            int r1 = androidx.lifecycle.livedata.C1086.m1931(r4)
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L3c;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r3 < r1) goto Le
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            r6[r2] = r5
            int r1 = androidx.appcompat.C1069.m747()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L3b;
                case 500: goto L2c;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            if (r1 < 0) goto L29
            r0 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            java.lang.String r0 = "82LljJ2k4DhW2"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L3b:
            return
        L3c:
            java.lang.Object r0 = androidx.drawerlayout.C1077.m1311(r4, r3)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 1864(0x748, float:2.612E-42)
        L44:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L4a;
                case 47384: goto L6e;
                case 47417: goto L54;
                case 47483: goto L50;
                default: goto L49;
            }
        L49:
            goto L44
        L4a:
            if (r3 != r5) goto L50
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L44
        L50:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L44
        L54:
            r1 = 1
        L55:
            m7405(r0, r1)
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r0 = r0 ^ (-124(0xffffffffffffff84, float:NaN))
            int r0 = r0 + r3
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L60:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L68;
                case 239: goto L6a;
                default: goto L67;
            }
        L67:
            goto L60
        L68:
            r3 = r0
            goto L2
        L6a:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L60
        L6e:
            r1 = r2
            goto L55
    }

    static /* synthetic */ void lambda$18(int[] r2, kevin.fun.hook.SparkRenewHelper.SparkInfo r3, java.lang.String[] r4, java.lang.Runnable r5, android.app.Dialog r6, android.view.View r7) {
            r0 = 0
            r0 = r2[r0]
            java.lang.String r1 = androidx.viewpager.C1108.m3493(r3)
            r0 = r4[r0]
            m7366(r1, r0)
            r0 = 1616(0x650, float:2.264E-42)
        Le:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L14;
                case 49: goto L17;
                case 204: goto L1c;
                case 239: goto L1f;
                default: goto L13;
            }
        L13:
            goto Le
        L14:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Le
        L17:
            if (r5 == 0) goto L14
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Le
        L1c:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r5)
        L1f:
            androidx.customview.C1074.m1118(r6)
            return
    }

    static /* synthetic */ void lambda$19(android.app.Activity r13, boolean r14, java.lang.String r15) {
            m7389()     // Catch: java.lang.Throwable -> L13b
            r0 = 1616(0x650, float:2.264E-42)
        L5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L2c1;
                default: goto La;
            }     // Catch: java.lang.Throwable -> L13b
        La:
            goto L5
        Lb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r13 == 0) goto Lb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            boolean r1 = androidx.loader.C1098.m2818(r13)     // Catch: java.lang.Throwable -> L13b
            r0 = 1740(0x6cc, float:2.438E-42)
        L19:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1f;
                case 54: goto L24;
                case 471: goto L33;
                case 500: goto L27;
                default: goto L1e;
            }     // Catch: java.lang.Throwable -> L13b
        L1e:
            goto L19
        L1f:
            if (r1 == 0) goto L24
            r0 = 1833(0x729, float:2.569E-42)
            goto L19
        L24:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L19
        L27:
            r0 = 1864(0x748, float:2.612E-42)
        L29:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2f;
                case 47483: goto L2c1;
                default: goto L2e;
            }     // Catch: java.lang.Throwable -> L13b
        L2e:
            goto L29
        L2f:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L29
        L33:
            android.app.Dialog r1 = new android.app.Dialog     // Catch: java.lang.Throwable -> L13b
            r0 = 16974455(0x1030277, float:2.4062668E-38)
            int r2 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L13b
            r0 = r0 ^ r2
            r1.<init>(r13, r0)     // Catch: java.lang.Throwable -> L13b
            r0 = 0
            androidx.lifecycle.runtime.C1092.m2297(r1, r0)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout r2 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L13b
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L13b
            int r3 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L13b
            r3 = r3 ^ 362(0x16a, float:5.07E-43)
            r0.<init>(r3, r3)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1091.m2273(r2, r0)     // Catch: java.lang.Throwable -> L13b
            r0 = 2147483285(0x7ffffe95, float:NaN)
            int r4 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L13b
            r0 = r0 ^ r4
            androidx.lifecycle.livedata.C1084.m1783(r2, r0)     // Catch: java.lang.Throwable -> L13b
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L13b
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L13b
            r0 = 1
            androidx.customview.C1074.m1119(r4, r0)     // Catch: java.lang.Throwable -> L13b
            int r0 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L13b
            r5 = r0 ^ (-282(0xfffffffffffffee6, float:NaN))
            androidx.emoji2.C1080.m1542(r4, r5)     // Catch: java.lang.Throwable -> L13b
            int r0 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L13b
            r0 = r0 ^ 498(0x1f2, float:6.98E-43)
            int r6 = m7354(r13, r0)     // Catch: java.lang.Throwable -> L13b
            int r7 = m7354(r13, r0)     // Catch: java.lang.Throwable -> L13b
            int r8 = m7354(r13, r0)     // Catch: java.lang.Throwable -> L13b
            int r0 = m7354(r13, r0)     // Catch: java.lang.Throwable -> L13b
            androidx.drawerlayout.C1077.m1314(r4, r6, r7, r8, r0)     // Catch: java.lang.Throwable -> L13b
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L13b
            int r6 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L13b
            r6 = r6 ^ 557(0x22d, float:7.8E-43)
            int r6 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L13b
            int r7 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> L13b
            r7 = r7 ^ (-116(0xffffffffffffff8c, float:NaN))
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L13b
            r0.gravity = r5     // Catch: java.lang.Throwable -> L13b
            androidx.vectordrawable.C1105.m3296(r4, r0)     // Catch: java.lang.Throwable -> L13b
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L13b
            r0.<init>()     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.livedata.C1085.m1879(r0, r3)     // Catch: java.lang.Throwable -> L13b
            int r6 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L13b
            r6 = r6 ^ 365(0x16d, float:5.11E-43)
            int r7 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L13b
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1091.m2252(r0, r7)     // Catch: java.lang.Throwable -> L13b
            androidx.activity.C1065.m397(r4, r0)     // Catch: java.lang.Throwable -> L13b
            android.widget.TextView r7 = new android.widget.TextView     // Catch: java.lang.Throwable -> L13b
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L13b
            r0 = 43164(0xa89c, float:6.0486E-41)
            int r8 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L13b
            r8 = r8 ^ r0
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lbe:
            r9 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r9
            switch(r0) {
                case 14: goto Lc6;
                case 45: goto L127;
                case 76: goto Ld0;
                case 239: goto Lca;
                default: goto Lc5;
            }     // Catch: java.lang.Throwable -> L13b
        Lc5:
            goto Lbe
        Lc6:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lbe
        Lca:
            if (r14 == 0) goto Lc6
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lbe
        Ld0:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L13b
            r9 = 1451(0x5ab, float:2.033E-42)
            r10 = 1
            r11 = 2393(0x959, float:3.353E-42)
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1413(r0, r9, r10, r11)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1087.m1946(r7, r0)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.webdav.C1118.m8517(r7, r8)     // Catch: java.lang.Throwable -> L13b
            r0 = 48891(0xbefb, float:6.8511E-41)
        Le6:
            r9 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r9
            switch(r0) {
                case 22: goto Lee;
                case 503: goto L123;
                default: goto Led;
            }     // Catch: java.lang.Throwable -> L13b
        Led:
            goto Le6
        Lee:
            r0 = 1110441984(0x42300000, float:44.0)
            androidx.vectordrawable.animated.C1102.m3105(r7, r0)     // Catch: java.lang.Throwable -> L13b
            androidx.documentfile.C1076.m1233(r7, r5)     // Catch: java.lang.Throwable -> L13b
            r0 = 0
            r9 = 0
            r10 = 0
            int r11 = androidx.loader.C1098.f124     // Catch: java.lang.Throwable -> L13b
            r11 = r11 ^ (-811(0xfffffffffffffcd5, float:NaN))
            int r11 = m7354(r13, r11)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.audio.C1117.m8126(r7, r0, r9, r10, r11)     // Catch: java.lang.Throwable -> L13b
            androidx.activity.C1064.m372(r4, r7)     // Catch: java.lang.Throwable -> L13b
            android.widget.TextView r7 = new android.widget.TextView     // Catch: java.lang.Throwable -> L13b
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L13b
            r0 = -14737760(0xffffffffff1f1ea0, float:-2.1150627E38)
            int r9 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L13b
            r9 = r9 ^ r0
            r0 = 49666(0xc202, float:6.9597E-41)
        L115:
            r10 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r10
            switch(r0) {
                case 17: goto L11d;
                case 50: goto L13d;
                case 76: goto L141;
                case 83: goto L208;
                default: goto L11c;
            }     // Catch: java.lang.Throwable -> L13b
        L11c:
            goto L115
        L11d:
            if (r14 == 0) goto L13d
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L115
        L123:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto Le6
        L127:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L13b
            r9 = 1452(0x5ac, float:2.035E-42)
            int r10 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L13b
            r10 = r10 ^ 374(0x176, float:5.24E-43)
            r11 = 2155(0x86b, float:3.02E-42)
            java.lang.String r0 = androidx.customview.C1075.m1138(r0, r9, r10, r11)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1087.m1946(r7, r0)     // Catch: java.lang.Throwable -> L13b
            goto Lee
        L13b:
            r0 = move-exception
        L13c:
            return
        L13d:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L115
        L141:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L13b
            r10 = 1454(0x5ae, float:2.037E-42)
            int r11 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L13b
            r11 = r11 ^ 816(0x330, float:1.143E-42)
            r12 = 2499(0x9c3, float:3.502E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r10, r11, r12)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1087.m1946(r7, r0)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.webdav.C1118.m8517(r7, r9)     // Catch: java.lang.Throwable -> L13b
            r0 = 49790(0xc27e, float:6.977E-41)
        L15a:
            r9 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r9
            switch(r0) {
                case 18: goto L162;
                case 241: goto L203;
                default: goto L161;
            }     // Catch: java.lang.Throwable -> L13b
        L161:
            goto L15a
        L162:
            r0 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r7, r0)     // Catch: java.lang.Throwable -> L13b
            android.graphics.Typeface r0 = androidx.emoji2.C1080.m1508()     // Catch: java.lang.Throwable -> L13b
            androidx.customview.C1074.m47(r7, r0)     // Catch: java.lang.Throwable -> L13b
            androidx.documentfile.C1076.m1233(r7, r5)     // Catch: java.lang.Throwable -> L13b
            r0 = 0
            r9 = 0
            r10 = 0
            int r11 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L13b
            r11 = r11 ^ (-492(0xfffffffffffffe14, float:NaN))
            int r11 = m7354(r13, r11)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.audio.C1117.m8126(r7, r0, r9, r10, r11)     // Catch: java.lang.Throwable -> L13b
            androidx.activity.C1064.m372(r4, r7)     // Catch: java.lang.Throwable -> L13b
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L13b
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1087.m1946(r0, r15)     // Catch: java.lang.Throwable -> L13b
            r7 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r7)     // Catch: java.lang.Throwable -> L13b
            r7 = -10066620(0xffffffffff666544, float:-3.0624824E38)
            int r9 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L13b
            r7 = r7 ^ r9
            kevin.fun.hook.webdav.C1118.m8517(r0, r7)     // Catch: java.lang.Throwable -> L13b
            androidx.documentfile.C1076.m1233(r0, r5)     // Catch: java.lang.Throwable -> L13b
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L13b
            r5 = r5 ^ (-127(0xffffffffffffff81, float:NaN))
            int r5 = m7354(r13, r5)     // Catch: java.lang.Throwable -> L13b
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L13b
            r7 = 1067030938(0x3f99999a, float:1.2)
            androidx.versionedparcelable.C1106.m3371(r0, r5, r7)     // Catch: java.lang.Throwable -> L13b
            r5 = 0
            r7 = 0
            r9 = 0
            int r6 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.audio.C1117.m8126(r0, r5, r7, r9, r6)     // Catch: java.lang.Throwable -> L13b
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L13b
            android.view.View r0 = new android.view.View     // Catch: java.lang.Throwable -> L13b
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L13b
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L13b
            r6 = 1
            int r6 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L13b
            r5.<init>(r3, r6)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.livedata.C1085.m1843(r0, r5)     // Catch: java.lang.Throwable -> L13b
            r3 = -1118735(0xffffffffffeeedf1, float:NaN)
            int r5 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> L13b
            r3 = r3 ^ r5
            androidx.loader.C1099.m2849(r0, r3)     // Catch: java.lang.Throwable -> L13b
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L13b
            android.widget.TextView r3 = new android.widget.TextView     // Catch: java.lang.Throwable -> L13b
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L13b
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L13b
            r5 = 1464(0x5b8, float:2.052E-42)
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L13b
            r6 = r6 ^ (-127(0xffffffffffffff81, float:NaN))
            r7 = 1560(0x618, float:2.186E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2127(r0, r5, r6, r7)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1087.m1946(r3, r0)     // Catch: java.lang.Throwable -> L13b
            r0 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r0)     // Catch: java.lang.Throwable -> L13b
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L1f5:
            r5 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 497: goto L1fd;
                case 1711: goto L220;
                case 1736: goto L236;
                case 1769: goto L224;
                default: goto L1fc;
            }     // Catch: java.lang.Throwable -> L13b
        L1fc:
            goto L1f5
        L1fd:
            if (r14 == 0) goto L220
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L1f5
        L203:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L15a
        L208:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L13b
            r10 = 1459(0x5b3, float:2.044E-42)
            int r11 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L13b
            r11 = r11 ^ 641(0x281, float:8.98E-43)
            r12 = 666(0x29a, float:9.33E-43)
            java.lang.String r0 = androidx.annotation.experimental.C1067.m581(r0, r10, r11, r12)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.process.C1087.m1946(r7, r0)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.webdav.C1118.m8517(r7, r9)     // Catch: java.lang.Throwable -> L13b
            goto L162
        L220:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L1f5
        L224:
            kevin.fun.hook.webdav.C1118.m8517(r3, r8)     // Catch: java.lang.Throwable -> L13b
            r0 = 50689(0xc601, float:7.103E-41)
        L22a:
            r5 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r5
            switch(r0) {
                case 19: goto L232;
                case 50: goto L23f;
                default: goto L231;
            }     // Catch: java.lang.Throwable -> L13b
        L231:
            goto L22a
        L232:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L22a
        L236:
            r0 = -6711041(0xffffffffff9998ff, float:NaN)
            int r5 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L13b
            r0 = r0 ^ r5
            kevin.fun.hook.webdav.C1118.m8517(r3, r0)     // Catch: java.lang.Throwable -> L13b
        L23f:
            android.graphics.Typeface r0 = androidx.emoji2.C1080.m1508()     // Catch: java.lang.Throwable -> L13b
            androidx.customview.C1074.m47(r3, r0)     // Catch: java.lang.Throwable -> L13b
            int r0 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L13b
            r0 = r0 ^ 796(0x31c, float:1.115E-42)
            androidx.documentfile.C1076.m1233(r3, r0)     // Catch: java.lang.Throwable -> L13b
            r0 = 0
            int r5 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L13b
            r5 = r5 ^ 605(0x25d, float:8.48E-43)
            int r5 = m7354(r13, r5)     // Catch: java.lang.Throwable -> L13b
            r6 = 0
            int r7 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L13b
            r7 = r7 ^ (-614(0xfffffffffffffd9a, float:NaN))
            int r7 = m7354(r13, r7)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.audio.C1117.m8126(r3, r0, r5, r6, r7)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda10 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda10     // Catch: java.lang.Throwable -> L13b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13b
            androidx.lifecycle.livedata.C1086.m1916(r3, r0)     // Catch: java.lang.Throwable -> L13b
            androidx.activity.C1064.m372(r4, r3)     // Catch: java.lang.Throwable -> L13b
            androidx.annotation.experimental.C1067.m579(r2, r4)     // Catch: java.lang.Throwable -> L13b
            androidx.viewpager.C1108.m3545(r1, r2)     // Catch: java.lang.Throwable -> L13b
            r0 = 1063675494(0x3f666666, float:0.9)
            com.tencent.mmkv.C1109.m3569(r4, r0)     // Catch: java.lang.Throwable -> L13b
            r0 = 1063675494(0x3f666666, float:0.9)
            androidx.vectordrawable.animated.C1102.m3064(r4, r0)     // Catch: java.lang.Throwable -> L13b
            r0 = 0
            androidx.lifecycle.livedata.C1084.m1764(r4, r0)     // Catch: java.lang.Throwable -> L13b
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r4)     // Catch: java.lang.Throwable -> L13b
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r2)     // Catch: java.lang.Throwable -> L13b
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r2)     // Catch: java.lang.Throwable -> L13b
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r2)     // Catch: java.lang.Throwable -> L13b
            r2 = 433(0x1b1, double:2.14E-321)
            int r4 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L13b
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L13b
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)     // Catch: java.lang.Throwable -> L13b
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator     // Catch: java.lang.Throwable -> L13b
            r2.<init>()     // Catch: java.lang.Throwable -> L13b
            android.view.ViewPropertyAnimator r0 = androidx.emoji2.viewsintegration.C1078.m1396(r0, r2)     // Catch: java.lang.Throwable -> L13b
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)     // Catch: java.lang.Throwable -> L13b
            kevin.fun.hook.audio.C1114.m7909(r1)     // Catch: java.lang.Throwable -> L13b
            r0 = 50813(0xc67d, float:7.1204E-41)
        L2b5:
            r1 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L13c;
                case 243: goto L2bd;
                default: goto L2bc;
            }
        L2bc:
            goto L2b5
        L2bd:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L2b5
        L2c1:
            int r1 = androidx.loader.C1097.m2731()
            r0 = 51588(0xc984, float:7.229E-41)
        L2c8:
            r2 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L2d0;
                case 54: goto L2d6;
                case 87: goto L13c;
                case 116: goto L2da;
                default: goto L2cf;
            }
        L2cf:
            goto L2c8
        L2d0:
            if (r1 < 0) goto L2d6
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L2c8
        L2d6:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L2c8
        L2da:
            java.lang.String r0 = "8tGWr82QMJiB"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L13c
    }

    static /* synthetic */ void lambda$2(android.widget.Switch r4, android.widget.CompoundButton r5, boolean r6) {
            short[] r0 = m7367()
            r1 = 1468(0x5bc, float:2.057E-42)
            int r2 = org.luckypray.dexkit.C1125.f435
            r2 = r2 ^ (-241(0xffffffffffffff0f, float:NaN))
            r3 = 1889(0x761, float:2.647E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2127(r0, r1, r2, r3)
            androidx.interpolator.C1081.m1588(r0, r6)
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L1e;
                case 204: goto L23;
                case 239: goto L31;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L15
        L1e:
            if (r6 == 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            r0 = -119723(0xfffffffffffe2c55, float:NaN)
            r1 = 1740(0x6cc, float:2.438E-42)
        L28:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2e;
                case 54: goto L34;
                default: goto L2d;
            }
        L2d:
            goto L28
        L2e:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L28
        L31:
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
        L34:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            androidx.emoji2.viewsintegration.C1079.m1472(r4, r0)
            r0 = 1864(0x748, float:2.612E-42)
        L3d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L43;
                case 47384: goto L79;
                case 47417: goto L4d;
                case 47483: goto L49;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            if (r6 == 0) goto L49
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L3d
        L49:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L3d
        L4d:
            r0 = 872295509(0x33fe2c55, float:1.1835861E-7)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L53:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L5b;
                case 239: goto L75;
                default: goto L5a;
            }
        L5a:
            goto L53
        L5b:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            kevin.fun.hook.webdav.C1118.m8476(r4, r0)
            int r1 = androidx.lifecycle.process.C1089.m2142()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L69:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L71;
                case 53: goto L92;
                case 503: goto L7d;
                case 32495: goto L83;
                default: goto L70;
            }
        L70:
            goto L69
        L71:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L69
        L75:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L53
        L79:
            r0 = 869059788(0x33cccccc, float:9.5367426E-8)
            goto L5b
        L7d:
            if (r1 < 0) goto L71
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L69
        L83:
            java.lang.String r0 = "fYQpDENpjDm"
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3469(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L92:
            return
    }

    static /* synthetic */ void lambda$20(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$3(android.widget.Switch r3, android.app.Dialog r4, android.content.Context r5, android.widget.CompoundButton r6, boolean r7) {
            m7392(r7)
            r0 = 1616(0x650, float:2.264E-42)
        L5:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lb;
                case 49: goto Le;
                case 204: goto L13;
                case 239: goto L21;
                default: goto La;
            }
        La:
            goto L5
        Lb:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L5
        Le:
            if (r7 == 0) goto Lb
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L5
        L13:
            r0 = -119723(0xfffffffffffe2c55, float:NaN)
            r1 = 1740(0x6cc, float:2.438E-42)
        L18:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L1e;
                case 54: goto L24;
                default: goto L1d;
            }
        L1d:
            goto L18
        L1e:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L18
        L21:
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
        L24:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            androidx.emoji2.viewsintegration.C1079.m1472(r3, r0)
            r0 = 1864(0x748, float:2.612E-42)
        L2d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L33;
                case 47384: goto L6f;
                case 47417: goto L3d;
                case 47483: goto L39;
                default: goto L32;
            }
        L32:
            goto L2d
        L33:
            if (r7 == 0) goto L39
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2d
        L39:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2d
        L3d:
            r0 = 872295509(0x33fe2c55, float:1.1835861E-7)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L43:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L4b;
                case 239: goto L6b;
                default: goto L4a;
            }
        L4a:
            goto L43
        L4b:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            kevin.fun.hook.webdav.C1118.m8476(r3, r0)
            androidx.customview.C1074.m1118(r4)
            androidx.emoji2.viewsintegration.C1078.m1400(r5)
            int r1 = androidx.activity.C1064.m377()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L5f:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L67;
                case 53: goto L84;
                case 503: goto L73;
                case 32495: goto L79;
                default: goto L66;
            }
        L66:
            goto L5f
        L67:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L5f
        L6b:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L43
        L6f:
            r0 = 869059788(0x33cccccc, float:9.5367426E-8)
            goto L4b
        L73:
            if (r1 < 0) goto L67
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L5f
        L79:
            java.lang.String r0 = "pzQLvol0RCS3TqU1U"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3837(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L84:
            return
    }

    static /* synthetic */ void lambda$4(android.widget.LinearLayout r8, java.util.ArrayList r9, android.widget.TextView r10, android.content.Context r11) {
            androidx.lifecycle.process.C1090.m2188(r8)
            androidx.loader.C1094.m2456(r9)
            boolean r1 = m7411()
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L30;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r1 == 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            java.util.concurrent.ConcurrentHashMap r0 = m7360()
            java.util.Collection r0 = androidx.emoji2.viewsintegration.C1079.m1455(r0)
            kevin.fun.hook.webdav.C1119.m8549(r9, r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L27:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2d;
                case 54: goto L3b;
                default: goto L2c;
            }
        L2c:
            goto L27
        L2d:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L27
        L30:
            java.util.concurrent.ConcurrentHashMap r0 = m7382()
            java.util.Collection r0 = androidx.emoji2.viewsintegration.C1079.m1455(r0)
            kevin.fun.hook.webdav.C1119.m8549(r9, r0)
        L3b:
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda8 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda8
            r0.<init>()
            androidx.loader.C1097.m2760(r9, r0)
            m7406(r10)
            boolean r1 = androidx.loader.C1097.m2719(r9)
            r0 = 1864(0x748, float:2.612E-42)
        L4c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L52;
                case 47384: goto L10b;
                case 47417: goto L5c;
                case 47483: goto L58;
                default: goto L51;
            }
        L51:
            goto L4c
        L52:
            if (r1 == 0) goto L58
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L4c
        L58:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L4c
        L5c:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r11)
            r1 = 1
            androidx.customview.C1074.m1119(r0, r1)
            int r1 = androidx.core.ktx.C1070.f96
            r1 = r1 ^ 575(0x23f, float:8.06E-43)
            androidx.emoji2.C1080.m1542(r0, r1)
            int r2 = androidx.loader.C1095.f121
            r2 = r2 ^ (-988(0xfffffffffffffc24, float:NaN))
            int r3 = m7354(r11, r2)
            int r4 = androidx.core.C1072.f98
            r4 = r4 ^ (-568(0xfffffffffffffdc8, float:NaN))
            int r5 = m7354(r11, r4)
            int r2 = m7354(r11, r2)
            int r4 = m7354(r11, r4)
            androidx.drawerlayout.C1077.m1314(r0, r3, r5, r2, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r11)
            short[] r3 = m7367()
            r4 = 1486(0x5ce, float:2.082E-42)
            int r5 = androidx.appcompat.resources.C1068.f94
            r5 = r5 ^ 524(0x20c, float:7.34E-43)
            r6 = 2164(0x874, float:3.032E-42)
            java.lang.String r3 = org.luckypray.dexkit.C1124.m10545(r3, r4, r5, r6)
            androidx.lifecycle.process.C1087.m1946(r2, r3)
            r3 = 1109917696(0x42280000, float:42.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r3)
            androidx.documentfile.C1076.m1233(r2, r1)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r11)
            short[] r4 = m7367()
            r5 = 1488(0x5d0, float:2.085E-42)
            int r6 = kevin.fun.hook.webdav.C1118.f417
            r6 = r6 ^ (-331(0xfffffffffffffeb5, float:NaN))
            r7 = 1650(0x672, float:2.312E-42)
            java.lang.String r4 = androidx.vectordrawable.C1103.m3132(r4, r5, r6, r7)
            androidx.lifecycle.process.C1087.m1946(r3, r4)
            r4 = 1095761920(0x41500000, float:13.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r4)
            r4 = 7828681(0x7774c9, float:1.0970319E-38)
            int r5 = androidx.loader.C1096.f122
            r4 = r4 ^ r5
            kevin.fun.hook.webdav.C1118.m8517(r3, r4)
            androidx.documentfile.C1076.m1233(r3, r1)
            int r1 = androidx.appcompat.C1069.f95
            r1 = r1 ^ (-239(0xffffffffffffff11, float:NaN))
            int r1 = m7354(r11, r1)
            float r1 = (float) r1
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.versionedparcelable.C1106.m3371(r3, r1, r4)
            androidx.activity.C1064.m372(r0, r2)
            androidx.activity.C1064.m372(r0, r3)
            androidx.activity.C1064.m372(r8, r0)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lea:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto Lf2;
                case 239: goto L107;
                default: goto Lf1;
            }
        Lf1:
            goto Lea
        Lf2:
            int r1 = com.tencent.mmkv.C1109.m3598()
            r0 = 49666(0xc202, float:6.9597E-41)
        Lf9:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L101;
                case 50: goto L128;
                case 76: goto L12c;
                case 83: goto L13b;
                default: goto L100;
            }
        L100:
            goto Lf9
        L101:
            if (r1 < 0) goto L128
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Lf9
        L107:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto Lea
        L10b:
            java.util.Iterator r1 = org.luckypray.dexkit.C1125.m10612(r9)
        L10f:
            boolean r2 = androidx.activity.C1063.m269(r1)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L116:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 22: goto L11e;
                case 53: goto L13c;
                case 503: goto L122;
                case 32495: goto Lf2;
                default: goto L11d;
            }
        L11d:
            goto L116
        L11e:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L116
        L122:
            if (r2 != 0) goto L11e
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L116
        L128:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Lf9
        L12c:
            java.lang.String r0 = "OG3cR1VyEDVh7EtOO"
            java.lang.String r0 = androidx.interpolator.C1081.m1619(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L13b:
            return
        L13c:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r1)
            kevin.fun.hook.SparkRenewHelper$SparkInfo r0 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r0
            android.widget.LinearLayout r2 = m7351(r11, r0)
            androidx.activity.C1064.m372(r8, r2)
            int r2 = androidx.activity.C1063.m302(r9, r0)
            int r3 = androidx.vectordrawable.C1103.m3134(r9)
            r0 = 49790(0xc27e, float:6.977E-41)
        L154:
            r4 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto L15c;
                case 51: goto L10f;
                case 84: goto L168;
                case 241: goto L160;
                default: goto L15b;
            }
        L15b:
            goto L154
        L15c:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L154
        L160:
            int r0 = r3 + (-1)
            if (r2 == r0) goto L15c
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L154
        L168:
            android.view.View r0 = new android.view.View
            r0.<init>(r11)
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = m7365(r11, r2)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r4 = r4 ^ (-654(0xfffffffffffffd72, float:NaN))
            r3.<init>(r4, r2)
            androidx.lifecycle.livedata.C1085.m1843(r0, r3)
            r2 = -1118467(0xffffffffffeeeefd, float:NaN)
            int r3 = androidx.lifecycle.livedata.C1084.f110
            r2 = r2 ^ r3
            androidx.loader.C1099.m2849(r0, r2)
            androidx.activity.C1064.m372(r8, r0)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L18e:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto L196;
                case 1711: goto L10f;
                default: goto L195;
            }
        L195:
            goto L18e
        L196:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L18e
    }

    static /* synthetic */ int lambda$5(kevin.fun.hook.SparkRenewHelper.SparkInfo r6, kevin.fun.hook.SparkRenewHelper.SparkInfo r7) {
            r1 = 1
            boolean r3 = androidx.core.C1072.m931(r6)
            boolean r4 = androidx.core.C1072.m931(r7)
            r0 = -1
            r2 = 1616(0x650, float:2.264E-42)
        Lc:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L3c;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r2 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r3 == r4) goto L12
            r2 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            boolean r3 = androidx.core.C1072.m931(r6)
            r2 = 1740(0x6cc, float:2.438E-42)
        L20:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L26;
                case 54: goto L2b;
                case 471: goto L3a;
                case 500: goto L2e;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            if (r3 == 0) goto L2b
            r2 = 1833(0x729, float:2.569E-42)
            goto L20
        L2b:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L20
        L2e:
            r1 = 1864(0x748, float:2.612E-42)
        L30:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L36;
                case 47483: goto L3b;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L30
        L3a:
            r0 = r1
        L3b:
            return r0
        L3c:
            boolean r3 = kevin.fun.hook.audio.C1114.m7910(r6)
            boolean r4 = kevin.fun.hook.audio.C1114.m7910(r7)
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L47:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 14: goto L4f;
                case 45: goto L83;
                case 76: goto L59;
                case 239: goto L53;
                default: goto L4e;
            }
        L4e:
            goto L47
        L4f:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L47
        L53:
            if (r3 == r4) goto L4f
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L47
        L59:
            boolean r3 = kevin.fun.hook.audio.C1114.m7910(r6)
            r2 = 48891(0xbefb, float:6.8511E-41)
        L60:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 22: goto L68;
                case 53: goto L81;
                case 503: goto L6c;
                case 32495: goto L72;
                default: goto L67;
            }
        L67:
            goto L60
        L68:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L60
        L6c:
            if (r3 == 0) goto L68
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L60
        L72:
            r1 = 49666(0xc202, float:6.9597E-41)
        L75:
            r2 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L7d;
                case 50: goto L3b;
                default: goto L7c;
            }
        L7c:
            goto L75
        L7d:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L75
        L81:
            r0 = r1
            goto L3b
        L83:
            int r1 = androidx.loader.C1099.m2844(r6)
            int r2 = androidx.loader.C1099.m2844(r7)
            r0 = 49790(0xc27e, float:6.977E-41)
        L8e:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 18: goto L96;
                case 51: goto Laa;
                case 84: goto La0;
                case 241: goto L9a;
                default: goto L95;
            }
        L95:
            goto L8e
        L96:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L8e
        L9a:
            if (r1 == r2) goto L96
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L8e
        La0:
            int r0 = androidx.loader.C1099.m2844(r7)
            int r1 = androidx.loader.C1099.m2844(r6)
            int r0 = r0 - r1
            goto L3b
        Laa:
            long r0 = androidx.lifecycle.livedata.C1084.m1746(r6)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8127(r0)
            long r2 = androidx.lifecycle.livedata.C1084.m1746(r7)
            java.lang.String r1 = kevin.fun.hook.audio.C1117.m8127(r2)
            int r0 = androidx.core.C1073.m996(r0, r1)
            goto L3b
    }

    static /* synthetic */ void lambda$6(android.app.Dialog r2, android.view.View r3) {
            androidx.customview.C1074.m1118(r2)
            int r1 = androidx.customview.C1074.m1071()
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
            if (r1 < 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "Tz1nG7JGstfqrQF5QimuVxDYR"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* synthetic */ void lambda$7(android.os.Handler r0, java.lang.Runnable r1, android.content.DialogInterface r2) {
            androidx.emoji2.C1080.m1535(r0, r1)
            return
    }

    static /* synthetic */ void lambda$8(kevin.fun.hook.SparkRenewHelper.SparkInfo r8, android.content.Context r9, android.view.View r10) {
            r1 = 1616(0x650, float:2.264E-42)
            long r2 = androidx.lifecycle.livedata.C1084.m1746(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            short[] r4 = m7367()     // Catch: java.lang.Throwable -> L6a
            r5 = 1520(0x5f0, float:2.13E-42)
            int r6 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L6a
            r6 = r6 ^ 278(0x116, float:3.9E-43)
            r7 = 1573(0x625, float:2.204E-42)
            java.lang.String r4 = androidx.lifecycle.process.C1091.m2229(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r0 = androidx.loader.C1097.m2720(r0, r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L6a
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L6a
            r4 = 1546(0x60a, float:2.166E-42)
            int r5 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L6a
            r5 = r5 ^ 217(0xd9, float:3.04E-43)
            r6 = 2717(0xa9d, float:3.807E-42)
            java.lang.String r3 = androidx.emoji2.viewsintegration.C1079.m1457(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a
            android.net.Uri r0 = androidx.activity.C1063.m240(r0)     // Catch: java.lang.Throwable -> L6a
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6a
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L6a
            r3 = 1572(0x624, float:2.203E-42)
            int r4 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L6a
            r4 = r4 ^ 74
            r5 = 724(0x2d4, float:1.015E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r0, r3, r4, r5)     // Catch: java.lang.Throwable -> L6a
            androidx.lifecycle.livedata.C1086.m1896(r2, r0)     // Catch: java.lang.Throwable -> L6a
            r0 = 268436384(0x100003a0, float:2.5246342E-29)
            int r3 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L6a
            r0 = r0 ^ r3
            kevin.fun.hook.audio.C1117.m8143(r2, r0)     // Catch: java.lang.Throwable -> L6a
            androidx.loader.C1094.m2441(r9, r2)     // Catch: java.lang.Throwable -> L6a
            r0 = r1
        L60:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L66;
                case 49: goto L67;
                default: goto L65;
            }
        L65:
            goto L60
        L66:
            return
        L67:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L60
        L6a:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7367()
            r4 = 1596(0x63c, float:2.236E-42)
            int r5 = androidx.lifecycle.viewmodel.C1093.f119
            r5 = r5 ^ (-98)
            r6 = 708(0x2c4, float:9.92E-43)
            java.lang.String r3 = kevin.fun.hook.C1120.m8645(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
            short[] r0 = m7367()
            int r2 = androidx.interpolator.C1083.f109
            r2 = r2 ^ (-438(0xfffffffffffffe4a, float:NaN))
            r3 = 1513(0x5e9, float:2.12E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8169(r0, r1, r2, r3)
            androidx.documentfile.C1076.m1250(r9, r0)
            goto L66
    }

    static /* synthetic */ void lambda$9(kevin.fun.hook.SparkRenewHelper.SparkInfo r9, android.widget.TextView r10, android.graphics.drawable.GradientDrawable r11, android.widget.TextView r12, android.widget.TextView r13) {
            r1 = 8
            r2 = 0
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r9)
            boolean r4 = m7400(r0)
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L36;
                default: goto L12;
            }
        L12:
            goto Ld
        L13:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Ld
        L16:
            if (r4 == 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            short[] r0 = m7367()
            r3 = 1624(0x658, float:2.276E-42)
            int r5 = kevin.fun.hook.C1120.f419
            r5 = r5 ^ (-450(0xfffffffffffffe3e, float:NaN))
            r6 = 839(0x347, float:1.176E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r3, r5, r6)
            r3 = 1740(0x6cc, float:2.438E-42)
        L2d:
            r3 = r3 ^ 1757(0x6dd, float:2.462E-42)
            switch(r3) {
                case 17: goto L33;
                case 54: goto L46;
                default: goto L32;
            }
        L32:
            goto L2d
        L33:
            r3 = 1771(0x6eb, float:2.482E-42)
            goto L2d
        L36:
            short[] r0 = m7367()
            r3 = 1629(0x65d, float:2.283E-42)
            int r5 = androidx.core.C1073.f99
            r5 = r5 ^ 443(0x1bb, float:6.21E-43)
            r6 = 1928(0x788, float:2.702E-42)
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7940(r0, r3, r5, r6)
        L46:
            androidx.lifecycle.process.C1087.m1946(r10, r0)
            r0 = 1864(0x748, float:2.612E-42)
        L4b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L51;
                case 47384: goto L7d;
                case 47417: goto L5b;
                case 47483: goto L57;
                default: goto L50;
            }
        L50:
            goto L4b
        L51:
            if (r4 == 0) goto L57
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L4b
        L57:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L4b
        L5b:
            r0 = -1
            r3 = 48767(0xbe7f, float:6.8337E-41)
        L5f:
            r5 = 48784(0xbe90, float:6.8361E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 14: goto L67;
                case 239: goto L79;
                default: goto L66;
            }
        L66:
            goto L5f
        L67:
            kevin.fun.hook.webdav.C1118.m8517(r10, r0)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L6d:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 22: goto L75;
                case 53: goto L99;
                case 503: goto L81;
                case 32495: goto L87;
                default: goto L74;
            }
        L74:
            goto L6d
        L75:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L6d
        L79:
            r3 = 48798(0xbe9e, float:6.838E-41)
            goto L5f
        L7d:
            r0 = -10066330(0xffffffffff666666, float:-3.0625412E38)
            goto L67
        L81:
            if (r4 == 0) goto L75
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L6d
        L87:
            r0 = -119723(0xfffffffffffe2c55, float:NaN)
            r3 = 49666(0xc202, float:6.9597E-41)
        L8d:
            r5 = 49683(0xc213, float:6.9621E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 17: goto L95;
                case 50: goto L9b;
                default: goto L94;
            }
        L94:
            goto L8d
        L95:
            r3 = 49697(0xc221, float:6.964E-41)
            goto L8d
        L99:
            r0 = 285212672(0x11000000, float:1.009742E-28)
        L9b:
            androidx.lifecycle.livedata.C1085.m1879(r11, r0)
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r9)
            java.lang.String r0 = m7379(r0)
            java.lang.String r0 = m7407(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            short[] r5 = m7367()
            r6 = 1633(0x661, float:2.288E-42)
            int r7 = kevin.fun.hook.C1120.f419
            r7 = r7 ^ (-456(0xfffffffffffffe38, float:NaN))
            r8 = 2291(0x8f3, float:3.21E-42)
            java.lang.String r5 = androidx.loader.C1097.m2734(r5, r6, r7, r8)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r5)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.lifecycle.process.C1087.m1946(r12, r0)
            r0 = 49790(0xc27e, float:6.977E-41)
        Ld1:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 18: goto Ld9;
                case 51: goto L107;
                case 84: goto Le3;
                case 241: goto Ldd;
                default: goto Ld8;
            }
        Ld8:
            goto Ld1
        Ld9:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Ld1
        Ldd:
            if (r4 == 0) goto Ld9
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Ld1
        Le3:
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Le6:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 497: goto Lee;
                case 1711: goto Lf2;
                default: goto Led;
            }
        Led:
            goto Le6
        Lee:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto Le6
        Lf2:
            r0 = r1
        Lf3:
            androidx.loader.C1095.m2596(r12, r0)
            r0 = 50689(0xc601, float:7.103E-41)
        Lf9:
            r3 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 19: goto L101;
                case 45: goto L10d;
                case 50: goto L109;
                case 76: goto L10e;
                default: goto L100;
            }
        L100:
            goto Lf9
        L101:
            if (r4 == 0) goto L109
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto Lf9
        L107:
            r0 = r2
            goto Lf3
        L109:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto Lf9
        L10d:
            r2 = r1
        L10e:
            androidx.loader.C1095.m2596(r13, r2)
            return
    }

    public static void onMainActivityResume(android.app.Activity r6) {
            boolean r1 = androidx.lifecycle.process.C1088.m2019()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L84;
                case 239: goto L14;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 != 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L24;
                case 500: goto L84;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r6 != 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            android.content.Context r0 = androidx.lifecycle.process.C1087.m1986(r6)
            kevin.fun.hook.SparkRenewHelper.hostContext = r0
            java.lang.String r0 = m7350()
            short[] r1 = m7367()
            r2 = 1636(0x664, float:2.293E-42)
            int r3 = androidx.lifecycle.process.C1091.f117
            r3 = r3 ^ (-499(0xfffffffffffffe0d, float:NaN))
            r4 = 954(0x3ba, float:1.337E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1088.m2044(r1, r2, r3, r4)
            java.lang.String r2 = androidx.emoji2.C1080.m1562()
            java.lang.String r1 = androidx.interpolator.C1081.m1642(r1, r2)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            r0 = 1864(0x748, float:2.612E-42)
        L4c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L52;
                case 47384: goto L85;
                case 47417: goto L5c;
                case 47483: goto L58;
                default: goto L51;
            }
        L51:
            goto L4c
        L52:
            if (r1 == 0) goto L58
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L4c
        L58:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L4c
        L5c:
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L63:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L6b;
                case 45: goto L84;
                case 76: goto L75;
                case 239: goto L6f;
                default: goto L6a;
            }
        L6a:
            goto L63
        L6b:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L63
        L6f:
            if (r1 < 0) goto L6b
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L63
        L75:
            java.lang.String r0 = "rMbJzGubpDsdsyy"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3639(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L84:
            return
        L85:
            java.util.concurrent.atomic.AtomicBoolean r0 = m7364()
            r1 = 0
            r2 = 1
            boolean r1 = androidx.loader.C1098.m2817(r0, r1, r2)
            r0 = 48891(0xbefb, float:6.8511E-41)
        L92:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L9a;
                case 53: goto La4;
                case 503: goto L9e;
                case 32495: goto L84;
                default: goto L99;
            }
        L99:
            goto L92
        L9a:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L92
        L9e:
            if (r1 != 0) goto L9a
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L92
        La4:
            java.lang.Thread r0 = new java.lang.Thread
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda9 r1 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda9
            r1.<init>(r6)
            short[] r2 = m7367()
            r3 = 1661(0x67d, float:2.328E-42)
            int r4 = androidx.viewpager.C1108.f134
            r4 = r4 ^ (-494(0xfffffffffffffe12, float:NaN))
            r5 = 876(0x36c, float:1.228E-42)
            java.lang.String r2 = androidx.viewpager.C1108.m3518(r2, r3, r4, r5)
            r0.<init>(r1, r2)
            androidx.emoji2.viewsintegration.C1078.m1394(r0)
            goto L84
    }

    private static long parseOtherUidFromConversationId(java.lang.String r7) {
            r0 = 294(0x126, double:1.453E-321)
            int r2 = kevin.fun.hook.webdav.C1119.f418
            long r2 = (long) r2
            long r0 = r0 ^ r2
            boolean r3 = androidx.documentfile.C1076.m1246(r7)     // Catch: java.lang.Throwable -> L6b
            r2 = 1616(0x650, float:2.264E-42)
        Lc:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L6a;
                case 239: goto L1a;
                default: goto L11;
            }     // Catch: java.lang.Throwable -> L6b
        L11:
            goto Lc
        L12:
            r2 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r3 == 0) goto L12
            r2 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L6b
            r3 = 1671(0x687, float:2.342E-42)
            r4 = 1
            r5 = 2791(0xae7, float:3.911E-42)
            java.lang.String r2 = kevin.fun.hook.audio.C1117.m8169(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6b
            java.lang.String[] r3 = kevin.fun.hook.audio.C1117.m8145(r7, r2)     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L6b
            r2 = 1740(0x6cc, float:2.438E-42)
        L2e:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L34;
                case 54: goto L3a;
                case 471: goto L6a;
                case 500: goto L3d;
                default: goto L33;
            }     // Catch: java.lang.Throwable -> L6b
        L33:
            goto L2e
        L34:
            r2 = 4
            if (r4 < r2) goto L3a
            r2 = 1833(0x729, float:2.569E-42)
            goto L2e
        L3a:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L2e
        L3d:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L6b
            r4 = 1672(0x688, float:2.343E-42)
            r5 = 1
            r6 = 616(0x268, float:8.63E-43)
            java.lang.String r2 = androidx.customview.C1074.m1116(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L6b
            r4 = 1
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L6b
            boolean r4 = org.luckypray.dexkit.C1125.m10633(r2, r4)     // Catch: java.lang.Throwable -> L6b
            r2 = 1864(0x748, float:2.612E-42)
        L53:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L59;
                case 47384: goto L6a;
                case 47417: goto L63;
                case 47483: goto L5f;
                default: goto L58;
            }     // Catch: java.lang.Throwable -> L6b
        L58:
            goto L53
        L59:
            if (r4 == 0) goto L5f
            r2 = 48736(0xbe60, float:6.8294E-41)
            goto L53
        L5f:
            r2 = 48705(0xbe41, float:6.825E-41)
            goto L53
        L63:
            r2 = 3
            r2 = r3[r2]     // Catch: java.lang.Throwable -> L6b
            long r0 = androidx.loader.C1095.m2603(r2)     // Catch: java.lang.Throwable -> L6b
        L6a:
            return r0
        L6b:
            r2 = move-exception
            goto L6a
    }

    public static void processConversationSpark(java.lang.Object r18, java.lang.Object r19) {
            java.lang.String r6 = androidx.emoji2.C1080.m1562()
            r4 = 0
            r3 = 0
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L73
            r5 = 1673(0x689, float:2.344E-42)
            int r7 = androidx.activity.C1063.f89     // Catch: java.lang.Throwable -> L73
            r7 = r7 ^ 17
            r8 = 452(0x1c4, float:6.33E-43)
            java.lang.String r2 = androidx.loader.C1098.m2787(r2, r5, r7, r8)     // Catch: java.lang.Throwable -> L73
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L73
            r0 = r18
            java.lang.Object r2 = m7362(r0, r2, r5)     // Catch: java.lang.Throwable -> L73
            boolean r7 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L73
            r5 = 1616(0x650, float:2.264E-42)
        L23:
            r5 = r5 ^ 1633(0x661, float:2.288E-42)
            switch(r5) {
                case 14: goto L29;
                case 49: goto L2c;
                case 204: goto L31;
                case 239: goto L4c2;
                default: goto L28;
            }     // Catch: java.lang.Throwable -> L73
        L28:
            goto L23
        L29:
            r5 = 1678(0x68e, float:2.351E-42)
            goto L23
        L2c:
            if (r7 == 0) goto L29
            r5 = 1709(0x6ad, float:2.395E-42)
            goto L23
        L31:
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L73
            int r2 = androidx.vectordrawable.animated.C1102.m3104(r2)     // Catch: java.lang.Throwable -> L73
        L37:
            r3 = 1740(0x6cc, float:2.438E-42)
        L39:
            r3 = r3 ^ 1757(0x6dd, float:2.462E-42)
            switch(r3) {
                case 17: goto L3f;
                case 54: goto L42;
                default: goto L3e;
            }
        L3e:
            goto L39
        L3f:
            r3 = 1771(0x6eb, float:2.482E-42)
            goto L39
        L42:
            r8 = r2
        L43:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L492
            r3 = 1692(0x69c, float:2.371E-42)
            int r4 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L492
            r4 = r4 ^ 334(0x14e, float:4.68E-43)
            r5 = 1130(0x46a, float:1.583E-42)
            java.lang.String r2 = androidx.startup.C1100.m2931(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L492
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L492
            r0 = r18
            java.lang.Object r2 = m7362(r0, r2, r3)     // Catch: java.lang.Throwable -> L492
            java.lang.String r9 = androidx.loader.C1099.m2839(r2)     // Catch: java.lang.Throwable -> L492
            boolean r3 = androidx.documentfile.C1076.m1246(r9)     // Catch: java.lang.Throwable -> L492
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L67:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L6f;
                case 45: goto L469;
                case 76: goto L88;
                case 239: goto L82;
                default: goto L6e;
            }     // Catch: java.lang.Throwable -> L492
        L6e:
            goto L67
        L6f:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L67
        L73:
            r2 = move-exception
            r2 = 1864(0x748, float:2.612E-42)
        L76:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L7c;
                case 47483: goto L80;
                default: goto L7b;
            }     // Catch: java.lang.Throwable -> L492
        L7b:
            goto L76
        L7c:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto L76
        L80:
            r2 = r3
            goto L37
        L82:
            if (r3 != 0) goto L6f
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L67
        L88:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L492
            r3 = 1709(0x6ad, float:2.395E-42)
            int r4 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L492
            r4 = r4 ^ 443(0x1bb, float:6.21E-43)
            r5 = 1113(0x459, float:1.56E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1078.m1413(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L492
            boolean r3 = org.luckypray.dexkit.C1125.m10633(r2, r9)     // Catch: java.lang.Throwable -> L492
            r2 = 48891(0xbefb, float:6.8511E-41)
        L9f:
            r4 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 22: goto La7;
                case 53: goto Lc0;
                case 503: goto Lab;
                case 32495: goto Lb1;
                default: goto La6;
            }
        La6:
            goto L9f
        La7:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L9f
        Lab:
            if (r3 == 0) goto La7
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L9f
        Lb1:
            r2 = 49666(0xc202, float:6.9597E-41)
        Lb4:
            r3 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto Lbc;
                case 50: goto L469;
                default: goto Lbb;
            }
        Lbb:
            goto Lb4
        Lbc:
            r2 = 49697(0xc221, float:6.964E-41)
            goto Lb4
        Lc0:
            r4 = 0
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L125
            r3 = 1713(0x6b1, float:2.4E-42)
            int r7 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L125
            r7 = r7 ^ 95
            r10 = 1065(0x429, float:1.492E-42)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r2, r3, r7, r10)     // Catch: java.lang.Throwable -> L125
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L125
            r0 = r18
            java.lang.Object r2 = m7362(r0, r2, r3)     // Catch: java.lang.Throwable -> L125
            boolean r7 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L125
            r3 = 49790(0xc27e, float:6.977E-41)
        Le0:
            r10 = 49807(0xc28f, float:6.9794E-41)
            r3 = r3 ^ r10
            switch(r3) {
                case 18: goto Le8;
                case 51: goto L108;
                case 84: goto Lf2;
                case 241: goto Lec;
                default: goto Le7;
            }     // Catch: java.lang.Throwable -> L125
        Le7:
            goto Le0
        Le8:
            r3 = 49852(0xc2bc, float:6.9858E-41)
            goto Le0
        Lec:
            if (r7 == 0) goto Le8
            r3 = 49883(0xc2db, float:6.9901E-41)
            goto Le0
        Lf2:
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L125
            long r2 = androidx.versionedparcelable.C1107.m3470(r2)     // Catch: java.lang.Throwable -> L125
        Lf8:
            r4 = 49914(0xc2fa, float:6.9944E-41)
        Lfb:
            r5 = 49931(0xc30b, float:6.9968E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 497: goto L103;
                case 1711: goto L107;
                default: goto L102;
            }
        L102:
            goto Lfb
        L103:
            r4 = 50596(0xc5a4, float:7.09E-41)
            goto Lfb
        L107:
            r4 = r2
        L108:
            long r10 = m7361(r18, r19)     // Catch: java.lang.Throwable -> L492
            java.util.concurrent.ConcurrentHashMap r2 = m7382()     // Catch: java.lang.Throwable -> L492
            java.lang.Object r2 = androidx.customview.C1074.m1087(r2, r9)     // Catch: java.lang.Throwable -> L492
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r2     // Catch: java.lang.Throwable -> L492
            r3 = 50813(0xc67d, float:7.1204E-41)
        L119:
            r7 = 50830(0xc68e, float:7.1228E-41)
            r3 = r3 ^ r7
            switch(r3) {
                case 18: goto L121;
                case 53: goto L4bf;
                case 243: goto L137;
                case 4075: goto L13d;
                default: goto L120;
            }     // Catch: java.lang.Throwable -> L492
        L120:
            goto L119
        L121:
            r3 = 50875(0xc6bb, float:7.1291E-41)
            goto L119
        L125:
            r2 = move-exception
            r2 = 50689(0xc601, float:7.103E-41)
        L129:
            r3 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L131;
                case 50: goto L135;
                default: goto L130;
            }     // Catch: java.lang.Throwable -> L492
        L130:
            goto L129
        L131:
            r2 = 50720(0xc620, float:7.1074E-41)
            goto L129
        L135:
            r2 = r4
            goto Lf8
        L137:
            if (r2 != 0) goto L121
            r3 = 51557(0xc965, float:7.2247E-41)
            goto L119
        L13d:
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = new kevin.fun.hook.SparkRenewHelper$SparkInfo     // Catch: java.lang.Throwable -> L492
            r2.<init>()     // Catch: java.lang.Throwable -> L492
            r3 = 51588(0xc984, float:7.229E-41)
        L145:
            r7 = 51605(0xc995, float:7.2314E-41)
            r3 = r3 ^ r7
            switch(r3) {
                case 17: goto L14d;
                case 54: goto L151;
                default: goto L14c;
            }     // Catch: java.lang.Throwable -> L492
        L14c:
            goto L145
        L14d:
            r3 = 51619(0xc9a3, float:7.2334E-41)
            goto L145
        L151:
            r7 = r2
        L152:
            r7.conversationId = r9     // Catch: java.lang.Throwable -> L492
            r7.conversationShortId = r4     // Catch: java.lang.Throwable -> L492
            r7.otherUid = r10     // Catch: java.lang.Throwable -> L492
            r7.conversationType = r8     // Catch: java.lang.Throwable -> L492
            r2 = 0
            r7.hasSpark = r2     // Catch: java.lang.Throwable -> L492
            r2 = 0
            r7.needsRenewal = r2     // Catch: java.lang.Throwable -> L492
            r2 = 0
            r7.days = r2     // Catch: java.lang.Throwable -> L492
            r2 = -1
            r7.currentState = r2     // Catch: java.lang.Throwable -> L492
            r7.stateText = r6     // Catch: java.lang.Throwable -> L492
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L4bc
            r3 = 1735(0x6c7, float:2.431E-42)
            int r4 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L4bc
            r4 = r4 ^ (-365(0xfffffffffffffe93, float:NaN))
            r5 = 1474(0x5c2, float:2.066E-42)
            java.lang.String r2 = androidx.versionedparcelable.C1107.m3485(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4bc
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L42b
            r0 = r19
            java.lang.Object r2 = m7362(r0, r2, r3)     // Catch: java.lang.Throwable -> L42b
            boolean r4 = r2 instanceof java.util.Map     // Catch: java.lang.Throwable -> L42b
            r3 = 51712(0xca00, float:7.2464E-41)
        L186:
            r5 = 51729(0xca11, float:7.2488E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 14: goto L18e;
                case 17: goto L192;
                case 47: goto L41c;
                case 76: goto L198;
                default: goto L18d;
            }     // Catch: java.lang.Throwable -> L42b
        L18d:
            goto L186
        L18e:
            r3 = 51774(0xca3e, float:7.2551E-41)
            goto L186
        L192:
            if (r4 == 0) goto L18e
            r3 = 51805(0xca5d, float:7.2594E-41)
            goto L186
        L198:
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L42b
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L42b
            r4 = 1741(0x6cd, float:2.44E-42)
            int r5 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L42b
            r5 = r5 ^ 624(0x270, float:8.74E-43)
            r8 = 2921(0xb69, float:4.093E-42)
            java.lang.String r3 = androidx.core.ktx.C1070.m788(r3, r4, r5, r8)     // Catch: java.lang.Throwable -> L42b
            java.lang.Object r2 = org.luckypray.dexkit.C1124.m10538(r2, r3)     // Catch: java.lang.Throwable -> L42b
            boolean r4 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L42b
            r3 = 51836(0xca7c, float:7.2638E-41)
        L1b3:
            r5 = 51853(0xca8d, float:7.2662E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 241: goto L1bb;
                case 1963: goto L1c1;
                case 1992: goto L216;
                case 2025: goto L1c5;
                default: goto L1ba;
            }
        L1ba:
            goto L1b3
        L1bb:
            if (r4 == 0) goto L1c1
            r3 = 52580(0xcd64, float:7.368E-41)
            goto L1b3
        L1c1:
            r3 = 52549(0xcd45, float:7.3637E-41)
            goto L1b3
        L1c5:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1ec
            r3 = 52611(0xcd83, float:7.3724E-41)
        L1ca:
            r4 = 52628(0xcd94, float:7.3748E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto L1d2;
                case 54: goto L1d6;
                default: goto L1d1;
            }
        L1d1:
            goto L1ca
        L1d2:
            r3 = 52642(0xcda2, float:7.3767E-41)
            goto L1ca
        L1d6:
            r3 = r2
        L1d7:
            boolean r4 = androidx.documentfile.C1076.m1246(r3)     // Catch: java.lang.Throwable -> L42b
            r2 = 53510(0xd106, float:7.4983E-41)
        L1de:
            r5 = 53527(0xd117, float:7.5007E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L1e6;
                case 50: goto L219;
                case 83: goto L40d;
                case 116: goto L21d;
                default: goto L1e5;
            }
        L1e5:
            goto L1de
        L1e6:
            if (r4 != 0) goto L219
            r2 = 53603(0xd163, float:7.5114E-41)
            goto L1de
        L1ec:
            r2 = move-exception
            r2 = 52735(0xcdff, float:7.3897E-41)
        L1f0:
            r3 = 52752(0xce10, float:7.3921E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1f8;
                case 1007: goto L212;
                default: goto L1f7;
            }
        L1f7:
            goto L1f0
        L1f8:
            java.util.concurrent.ConcurrentHashMap r2 = m7382()     // Catch: java.lang.Throwable -> L459
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3768(r2, r9, r7)     // Catch: java.lang.Throwable -> L459
            boolean r3 = kevin.fun.hook.audio.C1114.m7910(r7)     // Catch: java.lang.Throwable -> L459
            r2 = 1511347(0x170fb3, float:2.117848E-39)
        L206:
            r4 = 1511364(0x170fc4, float:2.117872E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 22: goto L20e;
                case 53: goto L454;
                case 119: goto L43b;
                case 8148: goto L442;
                default: goto L20d;
            }
        L20d:
            goto L206
        L20e:
            r2 = 1511409(0x170ff1, float:2.117935E-39)
            goto L206
        L212:
            r2 = 52766(0xce1e, float:7.3941E-41)
            goto L1f0
        L216:
            r2 = 0
            r3 = r2
            goto L1d7
        L219:
            r2 = 53572(0xd144, float:7.507E-41)
            goto L1de
        L21d:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L42b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42b
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L42b
            r4 = 1764(0x6e4, float:2.472E-42)
            int r5 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L42b
            r5 = r5 ^ 301(0x12d, float:4.22E-43)
            r8 = 956(0x3bc, float:1.34E-42)
            java.lang.String r3 = androidx.annotation.experimental.C1067.m581(r3, r4, r5, r8)     // Catch: java.lang.Throwable -> L42b
            org.json.JSONArray r4 = androidx.activity.C1065.m404(r2, r3)     // Catch: java.lang.Throwable -> L42b
            r2 = 53634(0xd182, float:7.5157E-41)
        L239:
            r3 = 53651(0xd193, float:7.5181E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L241;
                case 50: goto L247;
                case 76: goto L24b;
                case 83: goto L3fe;
                default: goto L240;
            }     // Catch: java.lang.Throwable -> L42b
        L240:
            goto L239
        L241:
            if (r4 == 0) goto L247
            r2 = 53727(0xd1df, float:7.5288E-41)
            goto L239
        L247:
            r2 = 53696(0xd1c0, float:7.5244E-41)
            goto L239
        L24b:
            int r3 = androidx.emoji2.viewsintegration.C1078.m1393(r4)     // Catch: java.lang.Throwable -> L42b
            r2 = 53758(0xd1fe, float:7.5331E-41)
        L252:
            r5 = 53775(0xd20f, float:7.5355E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 1009: goto L25a;
                case 1703: goto L260;
                case 1736: goto L3fe;
                case 1769: goto L264;
                default: goto L259;
            }     // Catch: java.lang.Throwable -> L42b
        L259:
            goto L252
        L25a:
            if (r3 <= 0) goto L260
            r2 = 54502(0xd4e6, float:7.6374E-41)
            goto L252
        L260:
            r2 = 54471(0xd4c7, float:7.633E-41)
            goto L252
        L264:
            long r2 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Throwable -> L42b
            r10 = 1000(0x3e8, double:4.94E-321)
            long r10 = r2 / r10
            r2 = 0
            r3 = r2
        L26e:
            int r5 = androidx.emoji2.viewsintegration.C1078.m1393(r4)     // Catch: java.lang.Throwable -> L42b
            r2 = 54533(0xd505, float:7.6417E-41)
        L275:
            r8 = 54550(0xd516, float:7.6441E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 19: goto L27d;
                case 50: goto L283;
                case 85: goto L2ab;
                case 116: goto L287;
                default: goto L27c;
            }     // Catch: java.lang.Throwable -> L42b
        L27c:
            goto L275
        L27d:
            if (r3 < r5) goto L283
            r2 = 54626(0xd562, float:7.6547E-41)
            goto L275
        L283:
            r2 = 54595(0xd543, float:7.6504E-41)
            goto L275
        L287:
            r3 = -1
            r2 = 0
            r4 = 54657(0xd581, float:7.6591E-41)
        L28c:
            r5 = 54674(0xd592, float:7.6615E-41)
            r4 = r4 ^ r5
            switch(r4) {
                case 19: goto L294;
                case 50: goto L298;
                default: goto L293;
            }     // Catch: java.lang.Throwable -> L42b
        L293:
            goto L28c
        L294:
            r4 = 54688(0xd5a0, float:7.6634E-41)
            goto L28c
        L298:
            r4 = r6
        L299:
            r5 = 56579(0xdd03, float:7.9284E-41)
        L29c:
            r6 = 56596(0xdd14, float:7.9308E-41)
            r5 = r5 ^ r6
            switch(r5) {
                case 23: goto L2a4;
                case 54: goto L37a;
                case 85: goto L1f8;
                case 1564036: goto L37f;
                default: goto L2a3;
            }     // Catch: java.lang.Throwable -> L42b
        L2a3:
            goto L29c
        L2a4:
            r5 = -1
            if (r3 == r5) goto L37a
            r5 = 1507472(0x170090, float:2.112418E-39)
            goto L29c
        L2ab:
            org.json.JSONObject r5 = androidx.activity.C1065.m391(r4, r3)     // Catch: java.lang.Throwable -> L42b
            r2 = 55432(0xd888, float:7.7677E-41)
        L2b2:
            r8 = 55449(0xd899, float:7.77E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 17: goto L2ba;
                case 62: goto L2c0;
                case 95: goto L2d3;
                case 124: goto L2c4;
                default: goto L2b9;
            }     // Catch: java.lang.Throwable -> L42b
        L2b9:
            goto L2b2
        L2ba:
            if (r5 != 0) goto L2c0
            r2 = 55525(0xd8e5, float:7.7807E-41)
            goto L2b2
        L2c0:
            r2 = 55494(0xd8c6, float:7.7764E-41)
            goto L2b2
        L2c4:
            r2 = 55556(0xd904, float:7.785E-41)
        L2c7:
            r5 = 55573(0xd915, float:7.7874E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L2cf;
                case 54: goto L3e7;
                default: goto L2ce;
            }     // Catch: java.lang.Throwable -> L42b
        L2ce:
            goto L2c7
        L2cf:
            r2 = 55587(0xd923, float:7.7894E-41)
            goto L2c7
        L2d3:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L42b
            r8 = 1775(0x6ef, float:2.487E-42)
            int r12 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L42b
            r12 = r12 ^ 933(0x3a5, float:1.307E-42)
            r13 = 1632(0x660, float:2.287E-42)
            java.lang.String r2 = androidx.vectordrawable.C1104.m3232(r2, r8, r12, r13)     // Catch: java.lang.Throwable -> L42b
            r12 = 351(0x15f, double:1.734E-321)
            int r8 = androidx.interpolator.C1082.f108
            long r14 = (long) r8
            long r12 = r12 ^ r14
            long r14 = androidx.drawerlayout.C1077.m1283(r5, r2, r12)     // Catch: java.lang.Throwable -> L3d7
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L3d7
            r8 = 1780(0x6f4, float:2.494E-42)
            int r16 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L3d7
            r16 = r16 ^ 81
            r17 = 2968(0xb98, float:4.159E-42)
            r0 = r16
            r1 = r17
            java.lang.String r2 = androidx.drawerlayout.C1077.m1343(r2, r8, r0, r1)     // Catch: java.lang.Throwable -> L3d7
            long r12 = androidx.drawerlayout.C1077.m1283(r5, r2, r12)     // Catch: java.lang.Throwable -> L3d7
            r2 = 55680(0xd980, float:7.8024E-41)
        L308:
            r8 = 55697(0xd991, float:7.8048E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 17: goto L310;
                case 1467: goto L318;
                case 1496: goto L3e7;
                case 1529: goto L31c;
                default: goto L30f;
            }     // Catch: java.lang.Throwable -> L3d7
        L30f:
            goto L308
        L310:
            int r2 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r2 > 0) goto L318
            r2 = 56424(0xdc68, float:7.9067E-41)
            goto L308
        L318:
            r2 = 56393(0xdc49, float:7.9023E-41)
            goto L308
        L31c:
            r2 = 56455(0xdc87, float:7.911E-41)
        L31f:
            r8 = 56472(0xdc98, float:7.9134E-41)
            r2 = r2 ^ r8
            switch(r2) {
                case 31: goto L327;
                case 62: goto L32f;
                case 93: goto L3e7;
                case 124: goto L333;
                default: goto L326;
            }     // Catch: java.lang.Throwable -> L3d7
        L326:
            goto L31f
        L327:
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 >= 0) goto L32f
            r2 = 56548(0xdce4, float:7.924E-41)
            goto L31f
        L32f:
            r2 = 56517(0xdcc5, float:7.9197E-41)
            goto L31f
        L333:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L3d7
            r3 = 1783(0x6f7, float:2.499E-42)
            int r4 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L3d7
            r4 = r4 ^ 933(0x3a5, float:1.307E-42)
            r6 = 952(0x3b8, float:1.334E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1090.m2213(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L3d7
            int r3 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L3d7
            r3 = r3 ^ (-822(0xfffffffffffffcca, float:NaN))
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3675(r5, r2, r3)     // Catch: java.lang.Throwable -> L3d7
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L3d7
            r4 = 1788(0x6fc, float:2.506E-42)
            int r6 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L3d7
            r6 = r6 ^ (-114(0xffffffffffffff8e, float:NaN))
            r8 = 390(0x186, float:5.47E-43)
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r2, r4, r6, r8)     // Catch: java.lang.Throwable -> L3d7
            r4 = 0
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3675(r5, r2, r4)     // Catch: java.lang.Throwable -> L3d7
            short[] r4 = m7367()     // Catch: java.lang.Throwable -> L3d7
            r6 = 1792(0x700, float:2.511E-42)
            int r8 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L3d7
            r8 = r8 ^ 86
            r10 = 2426(0x97a, float:3.4E-42)
            java.lang.String r4 = androidx.lifecycle.livedata.C1084.m1796(r4, r6, r8, r10)     // Catch: java.lang.Throwable -> L3d7
            java.lang.String r6 = androidx.documentfile.C1076.m1244(r2)     // Catch: java.lang.Throwable -> L3d7
            java.lang.String r4 = androidx.loader.C1095.m2550(r5, r4, r6)     // Catch: java.lang.Throwable -> L3d7
            goto L299
        L37a:
            r5 = 56641(0xdd41, float:7.9371E-41)
            goto L29c
        L37f:
            r5 = 1
            r6 = 1
            r7.hasSpark = r6     // Catch: java.lang.Throwable -> L3d7
            r7.currentState = r3     // Catch: java.lang.Throwable -> L3d7
            r7.days = r2     // Catch: java.lang.Throwable -> L3d7
            r7.stateText = r4     // Catch: java.lang.Throwable -> L3d7
            r2 = 1507503(0x1700af, float:2.112462E-39)
        L38c:
            r4 = 1507520(0x1700c0, float:2.112485E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L394;
                case 45: goto L3c5;
                case 111: goto L398;
                case 460: goto L39f;
                default: goto L393;
            }     // Catch: java.lang.Throwable -> L3d7
        L393:
            goto L38c
        L394:
            r2 = 1507565(0x1700ed, float:2.112549E-39)
            goto L38c
        L398:
            r2 = 2
            if (r3 == r2) goto L394
            r2 = 1507596(0x17010c, float:2.112592E-39)
            goto L38c
        L39f:
            r2 = 1507627(0x17012b, float:2.112635E-39)
        L3a2:
            r4 = 1507644(0x17013c, float:2.112659E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 23: goto L3aa;
                case 85: goto L3c5;
                case 118: goto L3b1;
                case 180: goto L3b5;
                default: goto L3a9;
            }     // Catch: java.lang.Throwable -> L3d7
        L3a9:
            goto L3a2
        L3aa:
            r2 = 3
            if (r3 == r2) goto L3b1
            r2 = 1507720(0x170188, float:2.112766E-39)
            goto L3a2
        L3b1:
            r2 = 1507689(0x170169, float:2.112722E-39)
            goto L3a2
        L3b5:
            r2 = 0
            r3 = 1507751(0x1701a7, float:2.112809E-39)
        L3b9:
            r4 = 1507768(0x1701b8, float:2.112833E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 31: goto L3c1;
                case 1513: goto L3c6;
                default: goto L3c0;
            }     // Catch: java.lang.Throwable -> L3d7
        L3c0:
            goto L3b9
        L3c1:
            r3 = 1508433(0x170451, float:2.113765E-39)
            goto L3b9
        L3c5:
            r2 = r5
        L3c6:
            r7.needsRenewal = r2     // Catch: java.lang.Throwable -> L3d7
            r2 = 1508526(0x1704ae, float:2.113895E-39)
        L3cb:
            r3 = 1508543(0x1704bf, float:2.113919E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L3d3;
                case 114: goto L1f8;
                default: goto L3d2;
            }
        L3d2:
            goto L3cb
        L3d3:
            r2 = 1508557(0x1704cd, float:2.113939E-39)
            goto L3cb
        L3d7:
            r2 = move-exception
            r2 = 1508650(0x17052a, float:2.114069E-39)
        L3db:
            r3 = 1508667(0x17053b, float:2.114093E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L3e3;
                case 114: goto L1f8;
                default: goto L3e2;
            }
        L3e2:
            goto L3db
        L3e3:
            r2 = 1508681(0x170549, float:2.114112E-39)
            goto L3db
        L3e7:
            int r2 = androidx.lifecycle.process.C1087.f113
            r2 = r2 ^ (-623(0xfffffffffffffd91, float:NaN))
            int r2 = r2 + r3
            r3 = 1509425(0x170831, float:2.115155E-39)
        L3ef:
            r5 = 1509442(0x170842, float:2.115179E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 18: goto L3f7;
                case 115: goto L3fa;
                default: goto L3f6;
            }
        L3f6:
            goto L3ef
        L3f7:
            r3 = r2
            goto L26e
        L3fa:
            r3 = 1509456(0x170850, float:2.115198E-39)
            goto L3ef
        L3fe:
            r2 = 1509549(0x1708ad, float:2.115329E-39)
        L401:
            r3 = 1509566(0x1708be, float:2.115353E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L409;
                case 114: goto L1f8;
                default: goto L408;
            }
        L408:
            goto L401
        L409:
            r2 = 1509580(0x1708cc, float:2.115372E-39)
            goto L401
        L40d:
            r2 = 1509673(0x170929, float:2.115502E-39)
        L410:
            r3 = 1509690(0x17093a, float:2.115526E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L418;
                case 745: goto L1f8;
                default: goto L417;
            }
        L417:
            goto L410
        L418:
            r2 = 1510355(0x170bd3, float:2.116458E-39)
            goto L410
        L41c:
            r2 = 1510448(0x170c30, float:2.116588E-39)
        L41f:
            r3 = 1510465(0x170c41, float:2.116612E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1f8;
                case 113: goto L427;
                default: goto L426;
            }
        L426:
            goto L41f
        L427:
            r2 = 1510479(0x170c4f, float:2.116632E-39)
            goto L41f
        L42b:
            r2 = move-exception
            r2 = 1510572(0x170cac, float:2.116762E-39)
        L42f:
            r3 = 1510589(0x170cbd, float:2.116786E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L437;
                case 118: goto L1f8;
                default: goto L436;
            }
        L436:
            goto L42f
        L437:
            r2 = 1510603(0x170ccb, float:2.116806E-39)
            goto L42f
        L43b:
            if (r3 == 0) goto L20e
            r2 = 1511440(0x171010, float:2.117979E-39)
            goto L206
        L442:
            java.util.concurrent.ConcurrentHashMap r2 = m7360()     // Catch: java.lang.Throwable -> L459
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3768(r2, r9, r7)     // Catch: java.lang.Throwable -> L459
            r2 = 1511471(0x17102f, float:2.118022E-39)
        L44c:
            r3 = 1511488(0x171040, float:2.118046E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L454;
                case 111: goto L455;
                default: goto L453;
            }
        L453:
            goto L44c
        L454:
            return
        L455:
            r2 = 1511502(0x17104e, float:2.118065E-39)
            goto L44c
        L459:
            r2 = move-exception
            r3 = 1511595(0x1710ab, float:2.118196E-39)
        L45d:
            r4 = 1511612(0x1710bc, float:2.11822E-39)
            r3 = r3 ^ r4
            switch(r3) {
                case 23: goto L465;
                case 1001: goto L493;
                default: goto L464;
            }
        L464:
            goto L45d
        L465:
            r3 = 1512277(0x171355, float:2.119151E-39)
            goto L45d
        L469:
            int r3 = androidx.vectordrawable.animated.C1102.m3110()
            r2 = 1512370(0x1713b2, float:2.119282E-39)
        L470:
            r4 = 1512387(0x1713c3, float:2.119306E-39)
            r2 = r2 ^ r4
            switch(r2) {
                case 18: goto L478;
                case 51: goto L454;
                case 113: goto L47c;
                case 1996: goto L482;
                default: goto L477;
            }
        L477:
            goto L470
        L478:
            r2 = 1512432(0x1713f0, float:2.119369E-39)
            goto L470
        L47c:
            if (r3 > 0) goto L478
            r2 = 1512463(0x17140f, float:2.119412E-39)
            goto L470
        L482:
            java.lang.String r2 = "FgJt2gCdZS"
            java.lang.String r2 = androidx.lifecycle.livedata.C1085.m1844(r2)
            java.lang.Float r2 = java.lang.Float.decode(r2)
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
            goto L454
        L492:
            r2 = move-exception
        L493:
            java.lang.String r2 = androidx.lifecycle.process.C1091.m2254(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            short[] r4 = m7367()
            r5 = 1796(0x704, float:2.517E-42)
            int r6 = androidx.core.C1073.f99
            r6 = r6 ^ 411(0x19b, float:5.76E-43)
            r7 = 629(0x275, float:8.81E-43)
            java.lang.String r4 = androidx.emoji2.viewsintegration.C1079.m1457(r4, r5, r6, r7)
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)
            m7397(r2)
            goto L454
        L4bc:
            r2 = move-exception
            goto L1f8
        L4bf:
            r7 = r2
            goto L152
        L4c2:
            r8 = r4
            goto L43
    }

    private static void runAutoRenewFlow(android.app.Activity r18) {
            r5 = 0
            r4 = 0
            r2 = 1
            boolean[] r8 = new boolean[r2]
            r2 = 0
        L6:
            r3 = 1616(0x650, float:2.264E-42)
        L8:
            r3 = r3 ^ 1633(0x661, float:2.288E-42)
            switch(r3) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L18;
                case 239: goto L23;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r3 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            r3 = 15
            if (r2 < r3) goto Le
            r3 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L18:
            r2 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L20;
                case 54: goto L38;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L1a
        L23:
            r3 = 0
            boolean r6 = r8[r3]     // Catch: java.lang.Throwable -> L473
            r3 = 1864(0x748, float:2.612E-42)
        L28:
            r3 = r3 ^ 1881(0x759, float:2.636E-42)
            switch(r3) {
                case 17: goto L2e;
                case 47384: goto L648;
                case 47417: goto L38;
                case 47483: goto L34;
                default: goto L2d;
            }     // Catch: java.lang.Throwable -> L473
        L2d:
            goto L28
        L2e:
            if (r6 == 0) goto L34
            r3 = 48736(0xbe60, float:6.8294E-41)
            goto L28
        L34:
            r3 = 48705(0xbe41, float:6.825E-41)
            goto L28
        L38:
            r2 = 0
            r3 = r2
        L3a:
            java.util.concurrent.ConcurrentHashMap r2 = m7360()     // Catch: java.lang.Throwable -> L473
            boolean r6 = androidx.activity.C1065.m403(r2)     // Catch: java.lang.Throwable -> L473
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L45:
            r7 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 14: goto L4d;
                case 45: goto Lbd;
                case 76: goto L57;
                case 239: goto L51;
                default: goto L4c;
            }     // Catch: java.lang.Throwable -> L473
        L4c:
            goto L45
        L4d:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L45
        L51:
            if (r6 == 0) goto L4d
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L45
        L57:
            r2 = 48891(0xbefb, float:6.8511E-41)
        L5a:
            r6 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 22: goto L62;
                case 53: goto L7d;
                case 503: goto L66;
                case 32495: goto L6e;
                default: goto L61;
            }     // Catch: java.lang.Throwable -> L473
        L61:
            goto L5a
        L62:
            r2 = 48953(0xbf39, float:6.8598E-41)
            goto L5a
        L66:
            r2 = 60
            if (r3 < r2) goto L62
            r2 = 49635(0xc1e3, float:6.9553E-41)
            goto L5a
        L6e:
            r2 = 49666(0xc202, float:6.9597E-41)
        L71:
            r3 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L79;
                case 50: goto Lbd;
                default: goto L78;
            }     // Catch: java.lang.Throwable -> L473
        L78:
            goto L71
        L79:
            r2 = 49697(0xc221, float:6.964E-41)
            goto L71
        L7d:
            r2 = 0
            boolean r6 = r8[r2]     // Catch: java.lang.Throwable -> L473
            r2 = 49790(0xc27e, float:6.977E-41)
        L83:
            r7 = 49807(0xc28f, float:6.9794E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 18: goto L8b;
                case 51: goto La4;
                case 84: goto L95;
                case 241: goto L8f;
                default: goto L8a;
            }     // Catch: java.lang.Throwable -> L473
        L8a:
            goto L83
        L8b:
            r2 = 49852(0xc2bc, float:6.9858E-41)
            goto L83
        L8f:
            if (r6 == 0) goto L8b
            r2 = 49883(0xc2db, float:6.9901E-41)
            goto L83
        L95:
            r2 = 49914(0xc2fa, float:6.9944E-41)
        L98:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 497: goto La0;
                case 1711: goto Lbd;
                default: goto L9f;
            }     // Catch: java.lang.Throwable -> L473
        L9f:
            goto L98
        La0:
            r2 = 50596(0xc5a4, float:7.09E-41)
            goto L98
        La4:
            r6 = 1000(0x3e8, double:4.94E-321)
            androidx.vectordrawable.C1105.m3252(r6)     // Catch: java.lang.Throwable -> L473
            int r2 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L473
            r2 = r2 ^ (-543(0xfffffffffffffde1, float:NaN))
            int r3 = r3 + r2
            r2 = 50689(0xc601, float:7.103E-41)
        Lb1:
            r6 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 19: goto Lb9;
                case 50: goto L3a;
                default: goto Lb8;
            }     // Catch: java.lang.Throwable -> L473
        Lb8:
            goto Lb1
        Lb9:
            r2 = 50720(0xc620, float:7.1074E-41)
            goto Lb1
        Lbd:
            java.util.concurrent.ConcurrentHashMap r2 = m7360()     // Catch: java.lang.Throwable -> L473
            boolean r3 = androidx.activity.C1065.m403(r2)     // Catch: java.lang.Throwable -> L473
            r2 = 50813(0xc67d, float:7.1204E-41)
        Lc8:
            r6 = 50830(0xc68e, float:7.1228E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 18: goto Ld0;
                case 53: goto L13b;
                case 243: goto Ld4;
                case 4075: goto Lda;
                default: goto Lcf;
            }     // Catch: java.lang.Throwable -> L473
        Lcf:
            goto Lc8
        Ld0:
            r2 = 50875(0xc6bb, float:7.1291E-41)
            goto Lc8
        Ld4:
            if (r3 == 0) goto Ld0
            r2 = 51557(0xc965, float:7.2247E-41)
            goto Lc8
        Lda:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L473
            r3 = 1832(0x728, float:2.567E-42)
            int r4 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L473
            r4 = r4 ^ (-97)
            r5 = 869(0x365, float:1.218E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L473
            m7397(r2)     // Catch: java.lang.Throwable -> L473
            r2 = 0
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L473
            r4 = 1853(0x73d, float:2.597E-42)
            int r5 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L473
            r5 = r5 ^ 577(0x241, float:8.09E-43)
            r6 = 3185(0xc71, float:4.463E-42)
            java.lang.String r3 = androidx.loader.C1097.m2734(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L473
            r0 = r18
            m7355(r0, r2, r3)     // Catch: java.lang.Throwable -> L473
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()     // Catch: java.lang.Throwable -> L473
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)     // Catch: java.lang.Throwable -> L473
            m7389()
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)
            int r3 = androidx.versionedparcelable.C1107.m3467()
            r2 = 51588(0xc984, float:7.229E-41)
        L11d:
            r4 = 51605(0xc995, float:7.2314E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 17: goto L125;
                case 54: goto L12b;
                case 87: goto L13a;
                case 116: goto L12f;
                default: goto L124;
            }
        L124:
            goto L11d
        L125:
            if (r3 > 0) goto L12b
            r2 = 51681(0xc9e1, float:7.242E-41)
            goto L11d
        L12b:
            r2 = 51650(0xc9c2, float:7.2377E-41)
            goto L11d
        L12f:
            java.lang.String r2 = "mn"
            java.lang.String r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3709(r2)
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
        L13a:
            return
        L13b:
            java.util.ArrayList r9 = m7353()     // Catch: java.lang.Throwable -> L473
            int r10 = androidx.vectordrawable.C1103.m3134(r9)     // Catch: java.lang.Throwable -> L473
            boolean r3 = androidx.loader.C1097.m2719(r9)     // Catch: java.lang.Throwable -> L473
            short[] r2 = m7367()
            r6 = 1871(0x74f, float:2.622E-42)
            int r7 = androidx.versionedparcelable.C1106.f132
            r7 = r7 ^ 149(0x95, float:2.09E-43)
            r11 = 3012(0xbc4, float:4.221E-42)
            java.lang.String r11 = kevin.fun.hook.audio.C1116.m8020(r2, r6, r7, r11)
            r2 = 51712(0xca00, float:7.2464E-41)
        L15a:
            r6 = 51729(0xca11, float:7.2488E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 14: goto L162;
                case 17: goto L166;
                case 47: goto L19d;
                case 76: goto L16c;
                default: goto L161;
            }
        L161:
            goto L15a
        L162:
            r2 = 51774(0xca3e, float:7.2551E-41)
            goto L15a
        L166:
            if (r3 == 0) goto L162
            r2 = 51805(0xca5d, float:7.2594E-41)
            goto L15a
        L16c:
            java.lang.String r2 = m7350()     // Catch: java.lang.Throwable -> L473
            androidx.core.C1073.m1055(r11, r2)     // Catch: java.lang.Throwable -> L473
            r2 = 1
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L473
            r4 = 1896(0x768, float:2.657E-42)
            int r5 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> L473
            r5 = r5 ^ (-26)
            r6 = 2565(0xa05, float:3.594E-42)
            java.lang.String r3 = androidx.lifecycle.livedata.C1085.m1814(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L473
            r0 = r18
            m7355(r0, r2, r3)     // Catch: java.lang.Throwable -> L473
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()     // Catch: java.lang.Throwable -> L473
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)     // Catch: java.lang.Throwable -> L473
            m7389()
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)
            goto L13a
        L19d:
            r2 = 0
            r3 = r2
        L19f:
            boolean r6 = m7393()     // Catch: java.lang.Throwable -> L473
            r2 = 51836(0xca7c, float:7.2638E-41)
        L1a6:
            r7 = 51853(0xca8d, float:7.2662E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 241: goto L1ae;
                case 1963: goto L1b4;
                case 1992: goto L1da;
                case 2025: goto L1b8;
                default: goto L1ad;
            }     // Catch: java.lang.Throwable -> L473
        L1ad:
            goto L1a6
        L1ae:
            if (r6 != 0) goto L1b4
            r2 = 52580(0xcd64, float:7.368E-41)
            goto L1a6
        L1b4:
            r2 = 52549(0xcd45, float:7.3637E-41)
            goto L1a6
        L1b8:
            r2 = 52611(0xcd83, float:7.3724E-41)
        L1bb:
            r6 = 52628(0xcd94, float:7.3748E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 23: goto L1c3;
                case 54: goto L1cb;
                case 85: goto L1f3;
                case 116: goto L1cf;
                default: goto L1c2;
            }     // Catch: java.lang.Throwable -> L473
        L1c2:
            goto L1bb
        L1c3:
            r2 = 30
            if (r3 < r2) goto L1cb
            r2 = 52704(0xcde0, float:7.3854E-41)
            goto L1bb
        L1cb:
            r2 = 52673(0xcdc1, float:7.381E-41)
            goto L1bb
        L1cf:
            r2 = 52735(0xcdff, float:7.3897E-41)
        L1d2:
            r3 = 52752(0xce10, float:7.3921E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L1da;
                case 1007: goto L1ef;
                default: goto L1d9;
            }     // Catch: java.lang.Throwable -> L473
        L1d9:
            goto L1d2
        L1da:
            boolean r3 = m7393()     // Catch: java.lang.Throwable -> L473
            r2 = 54533(0xd505, float:7.6417E-41)
        L1e1:
            r6 = 54550(0xd516, float:7.6441E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 19: goto L1e9;
                case 50: goto L233;
                case 85: goto L275;
                case 116: goto L237;
                default: goto L1e8;
            }     // Catch: java.lang.Throwable -> L473
        L1e8:
            goto L1e1
        L1e9:
            if (r3 != 0) goto L233
            r2 = 54626(0xd562, float:7.6547E-41)
            goto L1e1
        L1ef:
            r2 = 52766(0xce1e, float:7.3941E-41)
            goto L1d2
        L1f3:
            r2 = 0
            boolean r6 = r8[r2]     // Catch: java.lang.Throwable -> L473
            r2 = 53510(0xd106, float:7.4983E-41)
        L1f9:
            r7 = 53527(0xd117, float:7.5007E-41)
            r2 = r2 ^ r7
            switch(r2) {
                case 17: goto L201;
                case 50: goto L207;
                case 83: goto L21a;
                case 116: goto L20b;
                default: goto L200;
            }     // Catch: java.lang.Throwable -> L473
        L200:
            goto L1f9
        L201:
            if (r6 == 0) goto L207
            r2 = 53603(0xd163, float:7.5114E-41)
            goto L1f9
        L207:
            r2 = 53572(0xd144, float:7.507E-41)
            goto L1f9
        L20b:
            r2 = 53634(0xd182, float:7.5157E-41)
        L20e:
            r3 = 53651(0xd193, float:7.5181E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 17: goto L216;
                case 50: goto L1da;
                default: goto L215;
            }     // Catch: java.lang.Throwable -> L473
        L215:
            goto L20e
        L216:
            r2 = 53665(0xd1a1, float:7.52E-41)
            goto L20e
        L21a:
            r6 = 1000(0x3e8, double:4.94E-321)
            androidx.vectordrawable.C1105.m3252(r6)     // Catch: java.lang.Throwable -> L473
            int r2 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L473
            r2 = r2 ^ 194(0xc2, float:2.72E-43)
            int r3 = r3 + r2
            r2 = 53758(0xd1fe, float:7.5331E-41)
        L227:
            r6 = 53775(0xd20f, float:7.5355E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 1009: goto L22f;
                case 1703: goto L19f;
                default: goto L22e;
            }     // Catch: java.lang.Throwable -> L473
        L22e:
            goto L227
        L22f:
            r2 = 54440(0xd4a8, float:7.6287E-41)
            goto L227
        L233:
            r2 = 54595(0xd543, float:7.6504E-41)
            goto L1e1
        L237:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L473
            r3 = 1906(0x772, float:2.671E-42)
            int r4 = androidx.lifecycle.livedata.C1086.f112     // Catch: java.lang.Throwable -> L473
            r4 = r4 ^ 942(0x3ae, float:1.32E-42)
            r5 = 3174(0xc66, float:4.448E-42)
            java.lang.String r2 = androidx.startup.C1101.m3014(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L473
            m7397(r2)     // Catch: java.lang.Throwable -> L473
            r2 = 0
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L473
            r4 = 1929(0x789, float:2.703E-42)
            int r5 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L473
            r5 = r5 ^ (-938(0xfffffffffffffc56, float:NaN))
            r6 = 488(0x1e8, float:6.84E-43)
            java.lang.String r3 = androidx.loader.C1095.m2574(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L473
            r0 = r18
            m7355(r0, r2, r3)     // Catch: java.lang.Throwable -> L473
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()     // Catch: java.lang.Throwable -> L473
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)     // Catch: java.lang.Throwable -> L473
            m7389()
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)
            goto L13a
        L275:
            r0 = r18
            m7410(r0, r10, r8)     // Catch: java.lang.Throwable -> L473
            r2 = 0
            r7 = r2
            r3 = r5
        L27d:
            r5 = 1
            int r6 = androidx.vectordrawable.C1103.m3134(r9)     // Catch: java.lang.Throwable -> L473
            r2 = 54657(0xd581, float:7.6591E-41)
        L285:
            r12 = 54674(0xd592, float:7.6615E-41)
            r2 = r2 ^ r12
            switch(r2) {
                case 19: goto L28d;
                case 45: goto L2a6;
                case 50: goto L293;
                case 3579: goto L297;
                default: goto L28c;
            }     // Catch: java.lang.Throwable -> L473
        L28c:
            goto L285
        L28d:
            if (r7 < r6) goto L293
            r2 = 55401(0xd869, float:7.7633E-41)
            goto L285
        L293:
            r2 = 54719(0xd5bf, float:7.6678E-41)
            goto L285
        L297:
            r2 = 55432(0xd888, float:7.7677E-41)
        L29a:
            r6 = 55449(0xd899, float:7.77E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L2a2;
                case 62: goto L304;
                default: goto L2a1;
            }     // Catch: java.lang.Throwable -> L473
        L2a1:
            goto L29a
        L2a2:
            r2 = 55463(0xd8a7, float:7.772E-41)
            goto L29a
        L2a6:
            java.lang.Object r2 = androidx.emoji2.viewsintegration.C1078.m1368(r9, r7)     // Catch: java.lang.Throwable -> L473
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r2     // Catch: java.lang.Throwable -> L473
            java.lang.String r6 = androidx.viewpager.C1108.m3493(r2)     // Catch: java.lang.Throwable -> L473
            boolean r12 = m7390(r6)     // Catch: java.lang.Throwable -> L473
            r6 = 55556(0xd904, float:7.785E-41)
        L2b7:
            r13 = 55573(0xd915, float:7.7874E-41)
            r6 = r6 ^ r13
            switch(r6) {
                case 17: goto L2bf;
                case 54: goto L2c5;
                case 87: goto L2d8;
                case 116: goto L2c9;
                default: goto L2be;
            }     // Catch: java.lang.Throwable -> L473
        L2be:
            goto L2b7
        L2bf:
            if (r12 == 0) goto L2c5
            r6 = 55649(0xd961, float:7.7981E-41)
            goto L2b7
        L2c5:
            r6 = 55618(0xd942, float:7.7937E-41)
            goto L2b7
        L2c9:
            r2 = 55680(0xd980, float:7.8024E-41)
        L2cc:
            r5 = 55697(0xd991, float:7.8048E-41)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L2d4;
                case 1467: goto L630;
                default: goto L2d3;
            }     // Catch: java.lang.Throwable -> L473
        L2d3:
            goto L2cc
        L2d4:
            r2 = 56362(0xdc2a, float:7.898E-41)
            goto L2cc
        L2d8:
            boolean r12 = m7393()     // Catch: java.lang.Throwable -> L473
            r6 = 56455(0xdc87, float:7.911E-41)
        L2df:
            r13 = 56472(0xdc98, float:7.9134E-41)
            r6 = r6 ^ r13
            switch(r6) {
                case 31: goto L2e7;
                case 62: goto L2ed;
                case 93: goto L4b6;
                case 124: goto L2f1;
                default: goto L2e6;
            }     // Catch: java.lang.Throwable -> L473
        L2e6:
            goto L2df
        L2e7:
            if (r12 != 0) goto L2ed
            r6 = 56548(0xdce4, float:7.924E-41)
            goto L2df
        L2ed:
            r6 = 56517(0xdcc5, float:7.9197E-41)
            goto L2df
        L2f1:
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L473
            r6 = 1952(0x7a0, float:2.735E-42)
            int r7 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> L473
            r7 = r7 ^ 645(0x285, float:9.04E-43)
            r9 = 637(0x27d, float:8.93E-43)
            java.lang.String r2 = androidx.vectordrawable.C1103.m3132(r2, r6, r7, r9)     // Catch: java.lang.Throwable -> L473
            m7397(r2)     // Catch: java.lang.Throwable -> L473
        L304:
            m7403()     // Catch: java.lang.Throwable -> L473
            r2 = 56579(0xdd03, float:7.9284E-41)
        L30a:
            r6 = 56596(0xdd14, float:7.9308E-41)
            r2 = r2 ^ r6
            switch(r2) {
                case 23: goto L312;
                case 54: goto L318;
                case 85: goto L35e;
                case 1564036: goto L31c;
                default: goto L311;
            }     // Catch: java.lang.Throwable -> L473
        L311:
            goto L30a
        L312:
            if (r10 <= 0) goto L318
            r2 = 1507472(0x170090, float:2.112418E-39)
            goto L30a
        L318:
            r2 = 56641(0xdd41, float:7.9371E-41)
            goto L30a
        L31c:
            r2 = 1507503(0x1700af, float:2.112462E-39)
        L31f:
            r6 = 1507520(0x1700c0, float:2.112485E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 14: goto L327;
                case 45: goto L35e;
                case 111: goto L32b;
                case 460: goto L331;
                default: goto L326;
            }     // Catch: java.lang.Throwable -> L473
        L326:
            goto L31f
        L327:
            r2 = 1507565(0x1700ed, float:2.112549E-39)
            goto L31f
        L32b:
            if (r3 <= 0) goto L327
            r2 = 1507596(0x17010c, float:2.112592E-39)
            goto L31f
        L331:
            r2 = 1507627(0x17012b, float:2.112635E-39)
        L334:
            r6 = 1507644(0x17013c, float:2.112659E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 23: goto L33c;
                case 85: goto L35e;
                case 118: goto L344;
                case 180: goto L348;
                default: goto L33b;
            }     // Catch: java.lang.Throwable -> L473
        L33b:
            goto L334
        L33c:
            int r2 = r3 + r4
            if (r2 < r10) goto L344
            r2 = 1507720(0x170188, float:2.112766E-39)
            goto L334
        L344:
            r2 = 1507689(0x170169, float:2.112722E-39)
            goto L334
        L348:
            java.lang.String r2 = m7350()     // Catch: java.lang.Throwable -> L473
            androidx.core.C1073.m1055(r11, r2)     // Catch: java.lang.Throwable -> L473
            r2 = 1507751(0x1701a7, float:2.112809E-39)
        L352:
            r6 = 1507768(0x1701b8, float:2.112833E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 31: goto L35a;
                case 1513: goto L3b4;
                default: goto L359;
            }     // Catch: java.lang.Throwable -> L473
        L359:
            goto L352
        L35a:
            r2 = 1508433(0x170451, float:2.113765E-39)
            goto L352
        L35e:
            r2 = 1508526(0x1704ae, float:2.113895E-39)
        L361:
            r6 = 1508543(0x1704bf, float:2.113919E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L369;
                case 83: goto L3b4;
                case 114: goto L36f;
                case 436: goto L373;
                default: goto L368;
            }     // Catch: java.lang.Throwable -> L473
        L368:
            goto L361
        L369:
            if (r10 <= 0) goto L36f
            r2 = 1508619(0x17050b, float:2.114025E-39)
            goto L361
        L36f:
            r2 = 1508588(0x1704ec, float:2.113982E-39)
            goto L361
        L373:
            r2 = 1508650(0x17052a, float:2.114069E-39)
        L376:
            r6 = 1508667(0x17053b, float:2.114093E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L37e;
                case 83: goto L3b4;
                case 114: goto L384;
                case 3369: goto L388;
                default: goto L37d;
            }     // Catch: java.lang.Throwable -> L473
        L37d:
            goto L376
        L37e:
            if (r3 != 0) goto L384
            r2 = 1509394(0x170812, float:2.115111E-39)
            goto L376
        L384:
            r2 = 1508712(0x170568, float:2.114156E-39)
            goto L376
        L388:
            r2 = 1509425(0x170831, float:2.115155E-39)
        L38b:
            r6 = 1509442(0x170842, float:2.115179E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 18: goto L393;
                case 45: goto L3b4;
                case 115: goto L397;
                case 204: goto L39d;
                default: goto L392;
            }     // Catch: java.lang.Throwable -> L473
        L392:
            goto L38b
        L393:
            r2 = 1509487(0x17086f, float:2.115242E-39)
            goto L38b
        L397:
            if (r4 != r10) goto L393
            r2 = 1509518(0x17088e, float:2.115285E-39)
            goto L38b
        L39d:
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()     // Catch: java.lang.Throwable -> L473
            r6 = 0
            androidx.drawerlayout.C1077.m1308(r2, r6)     // Catch: java.lang.Throwable -> L473
            r2 = 1509549(0x1708ad, float:2.115329E-39)
        L3a8:
            r6 = 1509566(0x1708be, float:2.115353E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 19: goto L3b0;
                case 114: goto L3b4;
                default: goto L3af;
            }     // Catch: java.lang.Throwable -> L473
        L3af:
            goto L3a8
        L3b0:
            r2 = 1509580(0x1708cc, float:2.115372E-39)
            goto L3a8
        L3b4:
            r2 = 0
            boolean r6 = r8[r2]     // Catch: java.lang.Throwable -> L473
            r2 = 1509673(0x170929, float:2.115502E-39)
        L3ba:
            r7 = 1509690(0x17093a, float:2.115526E-39)
            r2 = r2 ^ r7
            switch(r2) {
                case 19: goto L3c2;
                case 712: goto L3fa;
                case 745: goto L3c8;
                case 1323: goto L3cc;
                default: goto L3c1;
            }     // Catch: java.lang.Throwable -> L473
        L3c1:
            goto L3ba
        L3c2:
            if (r6 == 0) goto L3c8
            r2 = 1510417(0x170c11, float:2.116545E-39)
            goto L3ba
        L3c8:
            r2 = 1510386(0x170bf2, float:2.116502E-39)
            goto L3ba
        L3cc:
            r0 = r18
            m7371(r0, r10, r3, r4)     // Catch: java.lang.Throwable -> L473
            r2 = 1510448(0x170c30, float:2.116588E-39)
        L3d4:
            r3 = 1510465(0x170c41, float:2.116612E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L3dc;
                case 113: goto L3f6;
                default: goto L3db;
            }
        L3db:
            goto L3d4
        L3dc:
            m7389()
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)
            r2 = 1511471(0x17102f, float:2.118022E-39)
        L3ea:
            r3 = 1511488(0x171040, float:2.118046E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L13a;
                case 111: goto L3f2;
                default: goto L3f1;
            }
        L3f1:
            goto L3ea
        L3f2:
            r2 = 1511502(0x17104e, float:2.118065E-39)
            goto L3ea
        L3f6:
            r2 = 1510479(0x170c4f, float:2.116632E-39)
            goto L3d4
        L3fa:
            r2 = 1510572(0x170cac, float:2.116762E-39)
        L3fd:
            r6 = 1510589(0x170cbd, float:2.116786E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 17: goto L405;
                case 87: goto L4b3;
                case 118: goto L40b;
                case 809: goto L40f;
                default: goto L404;
            }
        L404:
            goto L3fd
        L405:
            if (r3 <= 0) goto L40b
            r2 = 1511316(0x170f94, float:2.117805E-39)
            goto L3fd
        L40b:
            r2 = 1510634(0x170cea, float:2.116849E-39)
            goto L3fd
        L40f:
            r2 = 1511347(0x170fb3, float:2.117848E-39)
        L412:
            r6 = 1511364(0x170fc4, float:2.117872E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 22: goto L41a;
                case 119: goto L4ae;
                default: goto L419;
            }
        L419:
            goto L412
        L41a:
            r2 = r5
        L41b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L473
            r5.<init>()     // Catch: java.lang.Throwable -> L473
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L473
            r7 = 1974(0x7b6, float:2.766E-42)
            int r9 = androidx.interpolator.C1083.f109     // Catch: java.lang.Throwable -> L473
            r9 = r9 ^ (-440(0xfffffffffffffe48, float:NaN))
            r11 = 1623(0x657, float:2.274E-42)
            java.lang.String r6 = androidx.customview.C1074.m1116(r6, r7, r9, r11)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r10)     // Catch: java.lang.Throwable -> L473
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L473
            r7 = 1984(0x7c0, float:2.78E-42)
            int r9 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L473
            r9 = r9 ^ (-114(0xffffffffffffff8e, float:NaN))
            r10 = 2942(0xb7e, float:4.123E-42)
            java.lang.String r6 = androidx.annotation.experimental.C1067.m581(r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r3)     // Catch: java.lang.Throwable -> L473
            short[] r5 = m7367()     // Catch: java.lang.Throwable -> L473
            r6 = 1988(0x7c4, float:2.786E-42)
            int r7 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L473
            r7 = r7 ^ (-968(0xfffffffffffffc38, float:NaN))
            r9 = 708(0x2c4, float:9.92E-43)
            java.lang.String r5 = androidx.appcompat.resources.C1068.m652(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r5)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r3 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r3, r4)     // Catch: java.lang.Throwable -> L473
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L473
            r0 = r18
            m7355(r0, r2, r3)     // Catch: java.lang.Throwable -> L473
            goto L3dc
        L473:
            r2 = move-exception
            java.lang.String r3 = androidx.loader.C1099.m2895(r2)     // Catch: java.lang.Throwable -> L6a0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a0
            r4.<init>()     // Catch: java.lang.Throwable -> L6a0
            short[] r5 = m7367()     // Catch: java.lang.Throwable -> L6a0
            r6 = 2034(0x7f2, float:2.85E-42)
            int r7 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L6a0
            r7 = r7 ^ (-944(0xfffffffffffffc50, float:NaN))
            r9 = 1116(0x45c, float:1.564E-42)
            java.lang.String r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6a0
            java.lang.StringBuilder r4 = androidx.lifecycle.livedata.C1085.m1859(r4, r5)     // Catch: java.lang.Throwable -> L6a0
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r4, r3)     // Catch: java.lang.Throwable -> L6a0
            java.lang.String r3 = kevin.fun.hook.webdav.C1119.m8573(r3)     // Catch: java.lang.Throwable -> L6a0
            m7397(r3)     // Catch: java.lang.Throwable -> L6a0
            r3 = 0
            boolean r4 = r8[r3]     // Catch: java.lang.Throwable -> L6a0
            r3 = 1514292(0x171b34, float:2.121975E-39)
        L4a2:
            r5 = 1514309(0x171b45, float:2.121999E-39)
            r3 = r3 ^ r5
            switch(r3) {
                case 22: goto L4aa;
                case 55: goto L693;
                case 113: goto L661;
                case 212: goto L668;
                default: goto L4a9;
            }
        L4a9:
            goto L4a2
        L4aa:
            r3 = 1514354(0x171b72, float:2.122062E-39)
            goto L4a2
        L4ae:
            r2 = 1511378(0x170fd2, float:2.117892E-39)
            goto L412
        L4b3:
            r2 = 0
            goto L41b
        L4b6:
            r5 = 0
            boolean r6 = r8[r5]
            short[] r5 = m7367()
            r12 = 1992(0x7c8, float:2.791E-42)
            r13 = 1
            r14 = 3205(0xc85, float:4.491E-42)
            java.lang.String r12 = androidx.vectordrawable.C1104.m3232(r5, r12, r13, r14)
            r5 = 1511595(0x1710ab, float:2.118196E-39)
        L4c9:
            r13 = 1511612(0x1710bc, float:2.11822E-39)
            r5 = r5 ^ r13
            switch(r5) {
                case 23: goto L4d1;
                case 815: goto L4db;
                case 968: goto L520;
                case 1001: goto L4d7;
                default: goto L4d0;
            }
        L4d0:
            goto L4c9
        L4d1:
            if (r6 != 0) goto L4d7
            r5 = 1512339(0x171393, float:2.119238E-39)
            goto L4c9
        L4d7:
            r5 = 1512308(0x171374, float:2.119195E-39)
            goto L4c9
        L4db:
            int r5 = androidx.viewpager.C1108.f134
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L473
            r6.<init>()     // Catch: java.lang.Throwable -> L473
            short[] r13 = m7367()     // Catch: java.lang.Throwable -> L473
            r14 = 1993(0x7c9, float:2.793E-42)
            int r15 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L473
            r15 = r15 ^ 87
            r16 = 1478(0x5c6, float:2.071E-42)
            java.lang.String r13 = androidx.core.ktx.C1070.m788(r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r6 = androidx.lifecycle.livedata.C1085.m1859(r6, r13)     // Catch: java.lang.Throwable -> L473
            r5 = r5 ^ (-487(0xfffffffffffffe19, float:NaN))
            int r5 = r5 + r7
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r6, r5)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r12)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r10)     // Catch: java.lang.Throwable -> L473
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L473
            r13 = 1998(0x7ce, float:2.8E-42)
            int r14 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L473
            r14 = r14 ^ 142(0x8e, float:1.99E-43)
            r15 = 618(0x26a, float:8.66E-43)
            java.lang.String r6 = androidx.appcompat.C1069.m751(r6, r13, r14, r15)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L473
            java.lang.String r5 = kevin.fun.hook.webdav.C1119.m8573(r5)     // Catch: java.lang.Throwable -> L473
            m7399(r7, r10, r5)     // Catch: java.lang.Throwable -> L473
        L520:
            boolean r6 = m7357(r2)     // Catch: java.lang.Throwable -> L473
            r5 = 1512370(0x1713b2, float:2.119282E-39)
        L527:
            r13 = 1512387(0x1713c3, float:2.119306E-39)
            r5 = r5 ^ r13
            switch(r5) {
                case 18: goto L52f;
                case 51: goto L567;
                case 113: goto L533;
                case 1996: goto L539;
                default: goto L52e;
            }     // Catch: java.lang.Throwable -> L473
        L52e:
            goto L527
        L52f:
            r5 = 1512432(0x1713f0, float:2.119369E-39)
            goto L527
        L533:
            if (r6 == 0) goto L52f
            r5 = 1512463(0x17140f, float:2.119412E-39)
            goto L527
        L539:
            int r5 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> L473
            r5 = r5 ^ 287(0x11f, float:4.02E-43)
            int r3 = r3 + r5
            java.lang.String r2 = androidx.viewpager.C1108.m3493(r2)     // Catch: java.lang.Throwable -> L473
            m7402(r2)     // Catch: java.lang.Throwable -> L473
            r2 = 1512494(0x17142e, float:2.119456E-39)
        L548:
            r5 = 1512511(0x17143f, float:2.11948E-39)
            r2 = r2 ^ r5
            switch(r2) {
                case 17: goto L550;
                case 114: goto L554;
                default: goto L54f;
            }     // Catch: java.lang.Throwable -> L473
        L54f:
            goto L548
        L550:
            r2 = 1512525(0x17144d, float:2.119499E-39)
            goto L548
        L554:
            r2 = r3
        L555:
            r3 = 0
            boolean r5 = r8[r3]     // Catch: java.lang.Throwable -> L473
            r3 = 1513269(0x171735, float:2.120542E-39)
        L55b:
            r6 = 1513286(0x171746, float:2.120565E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 18: goto L563;
                case 53: goto L626;
                case 115: goto L5ba;
                case 212: goto L5c0;
                default: goto L562;
            }     // Catch: java.lang.Throwable -> L473
        L562:
            goto L55b
        L563:
            r3 = 1513331(0x171773, float:2.120628E-39)
            goto L55b
        L567:
            int r5 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L473
            r5 = r5 ^ (-601(0xfffffffffffffda7, float:NaN))
            int r4 = r4 + r5
            long r14 = androidx.lifecycle.livedata.C1084.m1746(r2)     // Catch: java.lang.Throwable -> L473
            int r2 = androidx.loader.C1099.m2844(r2)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L473
            r5.<init>()     // Catch: java.lang.Throwable -> L473
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L473
            r13 = 2000(0x7d0, float:2.803E-42)
            int r16 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L473
            r0 = r16
            r0 = r0 ^ 946(0x3b2, float:1.326E-42)
            r16 = r0
            r17 = 1378(0x562, float:1.931E-42)
            r0 = r16
            r1 = r17
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r6, r13, r0, r1)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.loader.C1097.m2720(r5, r14)     // Catch: java.lang.Throwable -> L473
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L473
            r13 = 2018(0x7e2, float:2.828E-42)
            int r14 = com.tencent.mmkv.C1109.f135     // Catch: java.lang.Throwable -> L473
            r14 = r14 ^ (-484(0xfffffffffffffe1c, float:NaN))
            r15 = 970(0x3ca, float:1.359E-42)
            java.lang.String r6 = androidx.versionedparcelable.C1106.m3338(r6, r13, r14, r15)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r2)     // Catch: java.lang.Throwable -> L473
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L473
            m7397(r2)     // Catch: java.lang.Throwable -> L473
            r2 = r3
            goto L555
        L5ba:
            if (r5 != 0) goto L563
            r3 = 1513362(0x171792, float:2.120672E-39)
            goto L55b
        L5c0:
            int r3 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L473
            int r5 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L473
            r6.<init>()     // Catch: java.lang.Throwable -> L473
            r3 = r3 ^ (-266(0xfffffffffffffef6, float:NaN))
            int r3 = r3 + r7
            short[] r13 = m7367()     // Catch: java.lang.Throwable -> L473
            r14 = 2022(0x7e6, float:2.833E-42)
            int r15 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Throwable -> L473
            r15 = r15 ^ (-428(0xfffffffffffffe54, float:NaN))
            r16 = 1225(0x4c9, float:1.717E-42)
            java.lang.String r13 = androidx.activity.C1063.m241(r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r6 = androidx.lifecycle.livedata.C1085.m1859(r6, r13)     // Catch: java.lang.Throwable -> L473
            r5 = r5 ^ 141(0x8d, float:1.98E-43)
            int r5 = r5 + r7
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r6, r5)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r12)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r10)     // Catch: java.lang.Throwable -> L473
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L473
            r12 = 2026(0x7ea, float:2.839E-42)
            int r13 = androidx.interpolator.C1083.f109     // Catch: java.lang.Throwable -> L473
            r13 = r13 ^ (-442(0xfffffffffffffe46, float:NaN))
            r14 = 2353(0x931, float:3.297E-42)
            java.lang.String r6 = androidx.lifecycle.process.C1087.m2008(r6, r12, r13, r14)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r2)     // Catch: java.lang.Throwable -> L473
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L473
            r12 = 2030(0x7ee, float:2.845E-42)
            int r13 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L473
            r13 = r13 ^ 494(0x1ee, float:6.92E-43)
            r14 = 583(0x247, float:8.17E-43)
            java.lang.String r6 = androidx.documentfile.C1076.m1234(r6, r12, r13, r14)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = androidx.lifecycle.livedata.C1085.m1859(r5, r6)     // Catch: java.lang.Throwable -> L473
            java.lang.StringBuilder r5 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r5, r4)     // Catch: java.lang.Throwable -> L473
            java.lang.String r5 = kevin.fun.hook.webdav.C1119.m8573(r5)     // Catch: java.lang.Throwable -> L473
            m7399(r3, r10, r5)     // Catch: java.lang.Throwable -> L473
        L626:
            r12 = -1635(0xfffffffffffff99d, double:NaN)
            int r3 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L473
            long r14 = (long) r3     // Catch: java.lang.Throwable -> L473
            long r12 = r12 ^ r14
            androidx.vectordrawable.C1105.m3252(r12)     // Catch: java.lang.Throwable -> L473
            r3 = r2
        L630:
            int r2 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L473
            r2 = r2 ^ (-117(0xffffffffffffff8b, float:NaN))
            int r5 = r7 + r2
            r2 = 1513393(0x1717b1, float:2.120715E-39)
        L639:
            r6 = 1513410(0x1717c2, float:2.120739E-39)
            r2 = r2 ^ r6
            switch(r2) {
                case 18: goto L641;
                case 115: goto L644;
                default: goto L640;
            }     // Catch: java.lang.Throwable -> L473
        L640:
            goto L639
        L641:
            r7 = r5
            goto L27d
        L644:
            r2 = 1513424(0x1717d0, float:2.120759E-39)
            goto L639
        L648:
            r6 = 1000(0x3e8, double:4.94E-321)
            androidx.vectordrawable.C1105.m3252(r6)     // Catch: java.lang.Throwable -> L473
            int r3 = androidx.emoji2.viewsintegration.C1079.f105
            r3 = r3 ^ (-112(0xffffffffffffff90, float:NaN))
            int r2 = r2 + r3
            r3 = 1513517(0x17182d, float:2.120889E-39)
        L655:
            r6 = 1513534(0x17183e, float:2.120913E-39)
            r3 = r3 ^ r6
            switch(r3) {
                case 19: goto L65d;
                case 745: goto L6;
                default: goto L65c;
            }
        L65c:
            goto L655
        L65d:
            r3 = 1514199(0x171ad7, float:2.121845E-39)
            goto L655
        L661:
            if (r4 != 0) goto L4aa
            r3 = 1514385(0x171b91, float:2.122105E-39)
            goto L4a2
        L668:
            java.lang.String r2 = androidx.loader.C1099.m2895(r2)     // Catch: java.lang.Throwable -> L6a0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a0
            r3.<init>()     // Catch: java.lang.Throwable -> L6a0
            r4 = 0
            short[] r5 = m7367()     // Catch: java.lang.Throwable -> L6a0
            r6 = 2051(0x803, float:2.874E-42)
            int r7 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L6a0
            r7 = r7 ^ (-617(0xfffffffffffffd97, float:NaN))
            r8 = 2417(0x971, float:3.387E-42)
            java.lang.String r5 = androidx.lifecycle.process.C1090.m2213(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6a0
            java.lang.StringBuilder r3 = androidx.lifecycle.livedata.C1085.m1859(r3, r5)     // Catch: java.lang.Throwable -> L6a0
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r3, r2)     // Catch: java.lang.Throwable -> L6a0
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8573(r2)     // Catch: java.lang.Throwable -> L6a0
            r0 = r18
            m7355(r0, r4, r2)     // Catch: java.lang.Throwable -> L6a0
        L693:
            m7389()
            java.util.concurrent.atomic.AtomicBoolean r2 = m7364()
            r3 = 0
            androidx.drawerlayout.C1077.m1308(r2, r3)
            goto L13a
        L6a0:
            r2 = move-exception
            m7389()
            java.util.concurrent.atomic.AtomicBoolean r3 = m7364()
            r4 = 0
            androidx.drawerlayout.C1077.m1308(r3, r4)
            throw r2
    }

    public static void saveCustomMessage(java.lang.String r4) {
            boolean r1 = androidx.documentfile.C1076.m1246(r4)
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L24;
                default: goto Lb;
            }
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
            short[] r0 = m7367()
            r1 = 2058(0x80a, float:2.884E-42)
            int r2 = androidx.emoji2.C1080.f106
            r2 = r2 ^ 379(0x17b, float:5.31E-43)
            r3 = 2682(0xa7a, float:3.758E-42)
            java.lang.String r4 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r3)
        L24:
            short[] r0 = m7367()
            r1 = 2060(0x80c, float:2.887E-42)
            int r2 = androidx.lifecycle.livedata.C1086.f112
            r2 = r2 ^ 941(0x3ad, float:1.319E-42)
            r3 = 677(0x2a5, float:9.49E-43)
            java.lang.String r0 = androidx.appcompat.resources.C1068.m652(r0, r1, r2, r3)
            androidx.core.C1073.m1055(r0, r4)
            return
    }

    private static void saveRenewDate(java.lang.String r9) {
            r6 = 0
            r1 = 0
            java.lang.String r8 = "ۨ۠ۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r6
            r7 = r6
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r8)
            switch(r1) {
                case 56354: goto L24;
                case 1746819: goto L51;
                case 1746969: goto L2d;
                case 1746970: goto L1b;
                case 1748611: goto L58;
                case 1748674: goto L4a;
                case 1749823: goto L34;
                case 1751709: goto L41;
                case 1752547: goto L60;
                case 1755372: goto L68;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "ۣۡ"
            r3 = r1
            r8 = r6
            goto La
        L1b:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r3)
            java.lang.String r6 = "ۥۢ۠"
            r4 = r1
            r8 = r6
            goto La
        L24:
            short[] r1 = m7367()
            java.lang.String r6 = "ۡۡۢ"
            r2 = r1
            r8 = r6
            goto La
        L2d:
            androidx.core.C1073.m1055(r4, r9)
            java.lang.String r1 = "ۨ۠ۤ"
            r8 = r1
            goto La
        L34:
            r1 = 2080(0x820, float:2.915E-42)
            r4 = 706(0x2c2, float:9.9E-43)
            java.lang.String r1 = androidx.loader.C1099.m2843(r2, r1, r5, r4)
            java.lang.String r6 = "ۡ۟ۡ"
            r4 = r1
            r8 = r6
            goto La
        L41:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r9)
            java.lang.String r6 = "ۣ۟ۨ"
            r3 = r1
            r8 = r6
            goto La
        L4a:
            int r6 = org.luckypray.dexkit.C1124.f434
            java.lang.String r1 = "ۣ۟ۧ"
            r7 = r6
            r8 = r1
            goto La
        L51:
            r1 = r7 ^ 642(0x282, float:9.0E-43)
            java.lang.String r6 = "ۢۧۤ"
            r5 = r1
            r8 = r6
            goto La
        L58:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.String r1 = "ۤۦ۟"
            r8 = r1
            goto La
        L60:
            java.lang.String r9 = m7350()
            java.lang.String r1 = "۟ۨۢ"
            r8 = r1
            goto La
        L68:
            return
    }

    private static void saveSparkUserName(long r4, java.lang.String r6) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L14;
                case 239: goto L45;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L14:
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L45;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r6 == 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            boolean r1 = androidx.activity.C1066.m488(r6)
            r0 = 1864(0x748, float:2.612E-42)
        L2a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L30;
                case 47384: goto L4a;
                case 47417: goto L3a;
                case 47483: goto L36;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            if (r1 == 0) goto L36
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L2a
        L36:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L2a
        L3a:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L3d:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L45;
                case 239: goto L46;
                default: goto L44;
            }
        L44:
            goto L3d
        L45:
            return
        L46:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L3d
        L4a:
            java.util.concurrent.ConcurrentHashMap r0 = m7387()
            java.lang.Long r1 = androidx.appcompat.resources.C1068.m611(r4)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3768(r0, r1, r6)
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L5c:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L64;
                case 53: goto L45;
                case 503: goto L68;
                case 32495: goto L6e;
                default: goto L63;
            }
        L63:
            goto L5c
        L64:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L5c
        L68:
            if (r1 < 0) goto L64
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L5c
        L6e:
            java.lang.String r0 = "dXH"
            java.lang.String r0 = androidx.activity.C1065.m453(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L45
    }

    private static boolean sendSparkMessage(kevin.fun.hook.SparkRenewHelper.SparkInfo r14) {
            java.lang.String r4 = androidx.emoji2.C1080.m1562()
            java.lang.ClassLoader r1 = m7380()
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L1a;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r1 != 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            r0 = 0
        L19:
            return r0
        L1a:
            short[] r0 = m7367()
            r1 = 2097(0x831, float:2.939E-42)
            int r2 = androidx.startup.C1101.f127
            r2 = r2 ^ 742(0x2e6, float:1.04E-42)
            r3 = 599(0x257, float:8.4E-43)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r1, r2, r3)
            r1 = 0
            java.lang.String r2 = androidx.interpolator.C1081.m1642(r0, r1)
            java.util.concurrent.atomic.AtomicReference r0 = m7408()
            java.lang.Object r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3811(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L39:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3f;
                case 54: goto L44;
                case 471: goto L6c;
                case 500: goto L47;
                default: goto L3e;
            }
        L3e:
            goto L39
        L3f:
            if (r1 != 0) goto L44
            r0 = 1833(0x729, float:2.569E-42)
            goto L39
        L44:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L39
        L47:
            short[] r0 = m7367()
            r1 = 2121(0x849, float:2.972E-42)
            int r2 = androidx.loader.C1097.f123
            r2 = r2 ^ 105(0x69, float:1.47E-43)
            r3 = 2886(0xb46, float:4.044E-42)
            java.lang.String r0 = androidx.core.C1073.m1028(r0, r1, r2, r3)
            m7397(r0)
            java.util.concurrent.atomic.AtomicReference r0 = m7391()
            r1 = 0
            androidx.vectordrawable.C1104.m3224(r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = m7394()
            r1 = 0
            androidx.drawerlayout.C1077.m1308(r0, r1)
            r0 = 0
            goto L19
        L6c:
            java.lang.Object r5 = m7376()
            java.lang.Object r6 = m7378()
            r0 = 1864(0x748, float:2.612E-42)
        L76:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L7c;
                case 47384: goto La6;
                case 47417: goto L86;
                case 47483: goto L82;
                default: goto L7b;
            }
        L7b:
            goto L76
        L7c:
            if (r5 == 0) goto L82
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L76
        L82:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L76
        L86:
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L89:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L91;
                case 45: goto Lf1;
                case 76: goto L9b;
                case 239: goto L95;
                default: goto L90;
            }
        L90:
            goto L89
        L91:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L89
        L95:
            if (r6 != 0) goto L91
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L89
        L9b:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L9e:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto La6;
                case 503: goto Led;
                default: goto La5;
            }
        La5:
            goto L9e
        La6:
            java.lang.String r0 = androidx.loader.C1099.m2839(r5)
            java.lang.String r1 = androidx.loader.C1099.m2839(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7367()
            r4 = 2478(0x9ae, float:3.472E-42)
            int r5 = androidx.lifecycle.runtime.C1092.f118
            r5 = r5 ^ 770(0x302, float:1.079E-42)
            r6 = 2927(0xb6f, float:4.102E-42)
            java.lang.String r3 = org.luckypray.dexkit.C1124.m10545(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            short[] r2 = m7367()
            r3 = 2507(0x9cb, float:3.513E-42)
            int r4 = androidx.lifecycle.runtime.C1092.f118
            r4 = r4 ^ 794(0x31a, float:1.113E-42)
            r5 = 915(0x393, float:1.282E-42)
            java.lang.String r2 = androidx.core.C1073.m1028(r2, r3, r4, r5)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
            r0 = 0
            goto L19
        Led:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L9e
        Lf1:
            java.util.concurrent.atomic.AtomicLong r0 = m7395()     // Catch: java.lang.Throwable -> L659
            long r8 = androidx.appcompat.resources.C1068.m694(r0)     // Catch: java.lang.Throwable -> L659
            r0 = 49666(0xc202, float:6.9597E-41)
        Lfc:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L104;
                case 50: goto L10e;
                case 76: goto L112;
                case 83: goto L13d;
                default: goto L103;
            }
        L103:
            goto Lfc
        L104:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L10e
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto Lfc
        L10e:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto Lfc
        L112:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L6d2
            r1 = 2148(0x864, float:3.01E-42)
            int r3 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L6d2
            r3 = r3 ^ 342(0x156, float:4.79E-43)
            r7 = 1601(0x641, float:2.243E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1796(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L6d2
            java.lang.Long r1 = androidx.appcompat.resources.C1068.m611(r8)     // Catch: java.lang.Throwable -> L6d2
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6d2
            int r7 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L6d2
            r7 = r7 ^ (-488(0xfffffffffffffe18, float:NaN))
            r3[r7] = r1     // Catch: java.lang.Throwable -> L6d2
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L6d2
            r0 = 49790(0xc27e, float:6.977E-41)
        L135:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L13d;
                case 241: goto L25a;
                default: goto L13c;
            }
        L13c:
            goto L135
        L13d:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2157(0x86d, float:3.023E-42)
            int r3 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 210(0xd2, float:2.94E-43)
            r7 = 1431(0x597, float:2.005E-42)
            java.lang.String r0 = androidx.loader.C1098.m2787(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            java.lang.String r1 = androidx.viewpager.C1108.m3493(r14)     // Catch: java.lang.Throwable -> L659
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L659
            int r7 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ 73
            r3[r7] = r1     // Catch: java.lang.Throwable -> L659
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2174(0x87e, float:3.046E-42)
            int r3 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-251(0xffffffffffffff05, float:NaN))
            r7 = 1707(0x6ab, float:2.392E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            long r8 = androidx.interpolator.C1081.m1609(r14)     // Catch: java.lang.Throwable -> L659
            java.lang.Long r1 = androidx.appcompat.resources.C1068.m611(r8)     // Catch: java.lang.Throwable -> L659
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L659
            int r7 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ (-237(0xffffffffffffff13, float:NaN))
            r3[r7] = r1     // Catch: java.lang.Throwable -> L659
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2196(0x894, float:3.077E-42)
            int r3 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 332(0x14c, float:4.65E-43)
            r7 = 2048(0x800, float:2.87E-42)
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            int r1 = androidx.loader.C1099.m2831(r14)     // Catch: java.lang.Throwable -> L659
            java.lang.Integer r1 = androidx.activity.C1064.m334(r1)     // Catch: java.lang.Throwable -> L659
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L659
            int r7 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ 358(0x166, float:5.02E-43)
            r3[r7] = r1     // Catch: java.lang.Throwable -> L659
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2215(0x8a7, float:3.104E-42)
            int r3 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-463(0xfffffffffffffe31, float:NaN))
            r7 = 450(0x1c2, float:6.3E-43)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            int r1 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L659
            r1 = r1 ^ 371(0x173, float:5.2E-43)
            java.lang.Integer r1 = androidx.activity.C1064.m334(r1)     // Catch: java.lang.Throwable -> L659
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L659
            int r7 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ 490(0x1ea, float:6.87E-43)
            r3[r7] = r1     // Catch: java.lang.Throwable -> L659
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2225(0x8b1, float:3.118E-42)
            int r3 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 818(0x332, float:1.146E-42)
            r7 = 2520(0x9d8, float:3.531E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            java.util.UUID r1 = androidx.lifecycle.livedata.C1084.m1737()     // Catch: java.lang.Throwable -> L659
            java.lang.String r1 = androidx.lifecycle.process.C1087.m1991(r1)     // Catch: java.lang.Throwable -> L659
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L659
            int r7 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ (-237(0xffffffffffffff13, float:NaN))
            r3[r7] = r1     // Catch: java.lang.Throwable -> L659
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2232(0x8b8, float:3.128E-42)
            int r3 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 343(0x157, float:4.8E-43)
            r7 = 1386(0x56a, float:1.942E-42)
            java.lang.String r0 = androidx.loader.C1097.m2734(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            r8 = 0
            java.lang.Long r1 = androidx.appcompat.resources.C1068.m611(r8)     // Catch: java.lang.Throwable -> L659
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L659
            int r7 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ (-123(0xffffffffffffff85, float:NaN))
            r3[r7] = r1     // Catch: java.lang.Throwable -> L659
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2240(0x8c0, float:3.139E-42)
            int r3 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 546(0x222, float:7.65E-43)
            r7 = 2784(0xae0, float:3.901E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            long r8 = androidx.lifecycle.process.C1089.m2100()     // Catch: java.lang.Throwable -> L659
            java.lang.Long r1 = androidx.appcompat.resources.C1068.m611(r8)     // Catch: java.lang.Throwable -> L659
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L659
            int r7 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ 73
            r3[r7] = r1     // Catch: java.lang.Throwable -> L659
            m7362(r6, r0, r3)     // Catch: java.lang.Throwable -> L659
            r0 = 0
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L25f
            r3 = 2252(0x8cc, float:3.156E-42)
            int r7 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L25f
            r7 = r7 ^ (-613(0xfffffffffffffd9b, float:NaN))
            r8 = 2069(0x815, float:2.899E-42)
            java.lang.String r1 = androidx.vectordrawable.C1104.m3232(r1, r3, r7, r8)     // Catch: java.lang.Throwable -> L25f
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L25f
            java.lang.Object r0 = m7362(r6, r1, r3)     // Catch: java.lang.Throwable -> L25f
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L24e:
            r3 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 497: goto L256;
                case 1711: goto L260;
                default: goto L255;
            }
        L255:
            goto L24e
        L256:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L24e
        L25a:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L135
        L25f:
            r1 = move-exception
        L260:
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L659
            r3.<init>()     // Catch: java.lang.Throwable -> L659
            boolean r7 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> L659
            r1 = 50689(0xc601, float:7.103E-41)
        L26a:
            r8 = 50706(0xc612, float:7.1054E-41)
            r1 = r1 ^ r8
            switch(r1) {
                case 19: goto L272;
                case 45: goto L281;
                case 50: goto L278;
                case 76: goto L27c;
                default: goto L271;
            }     // Catch: java.lang.Throwable -> L659
        L271:
            goto L26a
        L272:
            if (r7 == 0) goto L278
            r1 = 50782(0xc65e, float:7.1161E-41)
            goto L26a
        L278:
            r1 = 50751(0xc63f, float:7.1117E-41)
            goto L26a
        L27c:
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L659
            androidx.appcompat.resources.C1068.m660(r3, r0)     // Catch: java.lang.Throwable -> L659
        L281:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2263(0x8d7, float:3.171E-42)
            int r7 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ (-970(0xfffffffffffffc36, float:NaN))
            r8 = 3210(0xc8a, float:4.498E-42)
            java.lang.String r0 = androidx.loader.C1095.m2574(r0, r1, r7, r8)     // Catch: java.lang.Throwable -> L659
            kevin.fun.hook.audio.C1117.m8164(r3, r0)     // Catch: java.lang.Throwable -> L659
            boolean r1 = androidx.documentfile.C1076.m1246(r2)     // Catch: java.lang.Throwable -> L659
            r0 = 50813(0xc67d, float:7.1204E-41)
        L29b:
            r7 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 18: goto L2a3;
                case 53: goto L2c9;
                case 243: goto L2a7;
                case 4075: goto L2ad;
                default: goto L2a2;
            }
        L2a2:
            goto L29b
        L2a3:
            r0 = 50875(0xc6bb, float:7.1291E-41)
            goto L29b
        L2a7:
            if (r1 != 0) goto L2a3
            r0 = 51557(0xc965, float:7.2247E-41)
            goto L29b
        L2ad:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L2c8
            int r1 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L2c8
            r1 = r1 ^ 195(0xc3, float:2.73E-43)
            r0[r1] = r3     // Catch: java.lang.Throwable -> L2c8
            m7362(r6, r2, r0)     // Catch: java.lang.Throwable -> L2c8
            r0 = 51588(0xc984, float:7.229E-41)
        L2bc:
            r1 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto L2c4;
                case 54: goto L2c9;
                default: goto L2c3;
            }
        L2c3:
            goto L2bc
        L2c4:
            r0 = 51619(0xc9a3, float:7.2334E-41)
            goto L2bc
        L2c8:
            r0 = move-exception
        L2c9:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L659
            r2.<init>()     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2278(0x8e6, float:3.192E-42)
            int r3 = androidx.lifecycle.process.C1088.f114     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-103(0xffffffffffffff99, float:NaN))
            r7 = 906(0x38a, float:1.27E-42)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            r1 = 0
            androidx.core.ktx.C1071.m843(r2, r0, r1)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2282(0x8ea, float:3.198E-42)
            int r3 = androidx.lifecycle.livedata.C1086.f112     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 937(0x3a9, float:1.313E-42)
            r7 = 486(0x1e6, float:6.81E-43)
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2415(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            r1 = 0
            androidx.core.ktx.C1071.m843(r2, r0, r1)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2298(0x8fa, float:3.22E-42)
            int r3 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 668(0x29c, float:9.36E-43)
            r7 = 658(0x292, float:9.22E-43)
            java.lang.String r0 = androidx.interpolator.C1083.m1723(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            int r1 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L659
            r1 = r1 ^ 963(0x3c3, float:1.35E-42)
            androidx.core.ktx.C1071.m843(r2, r0, r1)     // Catch: java.lang.Throwable -> L659
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r14)     // Catch: java.lang.Throwable -> L659
            boolean r1 = m7400(r0)     // Catch: java.lang.Throwable -> L659
            r0 = 51712(0xca00, float:7.2464E-41)
        L318:
            r3 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L320;
                case 17: goto L324;
                case 47: goto L414;
                case 76: goto L32a;
                default: goto L31f;
            }     // Catch: java.lang.Throwable -> L659
        L31f:
            goto L318
        L320:
            r0 = 51774(0xca3e, float:7.2551E-41)
            goto L318
        L324:
            if (r1 == 0) goto L320
            r0 = 51805(0xca5d, float:7.2594E-41)
            goto L318
        L32a:
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r14)     // Catch: java.lang.Throwable -> L659
            java.lang.String r0 = m7375(r0)     // Catch: java.lang.Throwable -> L659
            boolean r3 = androidx.documentfile.C1076.m1246(r0)     // Catch: java.lang.Throwable -> L659
            r1 = 51836(0xca7c, float:7.2638E-41)
        L339:
            r7 = 51853(0xca8d, float:7.2662E-41)
            r1 = r1 ^ r7
            switch(r1) {
                case 241: goto L341;
                case 1963: goto L347;
                case 1992: goto L35a;
                case 2025: goto L34b;
                default: goto L340;
            }     // Catch: java.lang.Throwable -> L659
        L340:
            goto L339
        L341:
            if (r3 != 0) goto L347
            r1 = 52580(0xcd64, float:7.368E-41)
            goto L339
        L347:
            r1 = 52549(0xcd45, float:7.3637E-41)
            goto L339
        L34b:
            r1 = 52611(0xcd83, float:7.3724E-41)
        L34e:
            r3 = 52628(0xcd94, float:7.3748E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 23: goto L356;
                case 54: goto L36d;
                default: goto L355;
            }     // Catch: java.lang.Throwable -> L659
        L355:
            goto L34e
        L356:
            r1 = 52642(0xcda2, float:7.3767E-41)
            goto L34e
        L35a:
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r14)     // Catch: java.lang.Throwable -> L659
            java.lang.String r0 = m7413(r0)     // Catch: java.lang.Throwable -> L659
            r1 = 52735(0xcdff, float:7.3897E-41)
        L365:
            r3 = 52752(0xce10, float:7.3921E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L36d;
                case 1007: goto L40f;
                default: goto L36c;
            }     // Catch: java.lang.Throwable -> L659
        L36c:
            goto L365
        L36d:
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L659
            r3 = 2313(0x909, float:3.241E-42)
            int r7 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Throwable -> L659
            r7 = r7 ^ (-107(0xffffffffffffff95, float:NaN))
            r8 = 444(0x1bc, float:6.22E-43)
            java.lang.String r1 = androidx.loader.C1097.m2734(r1, r3, r7, r8)     // Catch: java.lang.Throwable -> L659
            androidx.drawerlayout.C1077.m1338(r2, r1, r0)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2317(0x90d, float:3.247E-42)
            int r3 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-483(0xfffffffffffffe1d, float:NaN))
            r7 = 2710(0xa96, float:3.798E-42)
            java.lang.String r0 = androidx.appcompat.resources.C1068.m652(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            r1 = 0
            androidx.core.ktx.C1071.m843(r2, r0, r1)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2326(0x916, float:3.26E-42)
            int r3 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 778(0x30a, float:1.09E-42)
            r7 = 3222(0xc96, float:4.515E-42)
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1413(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            r1 = 0
            androidx.activity.C1065.m435(r2, r0, r1)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2333(0x91d, float:3.269E-42)
            int r3 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-52)
            r7 = 1072(0x430, float:1.502E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            androidx.drawerlayout.C1077.m1338(r2, r0, r4)     // Catch: java.lang.Throwable -> L659
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2340(0x924, float:3.279E-42)
            int r3 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 805(0x325, float:1.128E-42)
            r7 = 921(0x399, float:1.29E-42)
            java.lang.String r0 = androidx.loader.C1094.m2495(r0, r1, r3, r7)     // Catch: java.lang.Throwable -> L659
            int r1 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L659
            r1 = r1 ^ 965(0x3c5, float:1.352E-42)
            androidx.core.ktx.C1071.m843(r2, r0, r1)     // Catch: java.lang.Throwable -> L659
            java.lang.String r0 = androidx.viewpager.C1108.m3553(r2)     // Catch: java.lang.Throwable -> L659
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L659
            r2 = 2347(0x92b, float:3.289E-42)
            int r3 = androidx.interpolator.C1083.f109     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-440(0xfffffffffffffe48, float:NaN))
            r7 = 334(0x14e, float:4.68E-43)
            java.lang.String r1 = androidx.annotation.experimental.C1067.m581(r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L659
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L659
            int r3 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 140(0x8c, float:1.96E-43)
            r2[r3] = r0     // Catch: java.lang.Throwable -> L659
            m7362(r6, r1, r2)     // Catch: java.lang.Throwable -> L659
            r0 = 0
            java.lang.Class r1 = androidx.emoji2.C1080.m1524(r5)     // Catch: java.lang.Throwable -> L659
            java.lang.reflect.Method[] r7 = androidx.appcompat.C1069.m736(r1)     // Catch: java.lang.Throwable -> L659
            int r8 = r7.length     // Catch: java.lang.Throwable -> L659
            r1 = 0
            r2 = r1
        L3fe:
            r1 = 53510(0xd106, float:7.4983E-41)
        L401:
            r3 = 53527(0xd117, float:7.5007E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L409;
                case 50: goto L41e;
                case 83: goto L431;
                case 116: goto L422;
                default: goto L408;
            }     // Catch: java.lang.Throwable -> L659
        L408:
            goto L401
        L409:
            if (r2 < r8) goto L41e
            r1 = 53603(0xd163, float:7.5114E-41)
            goto L401
        L40f:
            r1 = 52766(0xce1e, float:7.3941E-41)
            goto L365
        L414:
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r14)     // Catch: java.lang.Throwable -> L659
            java.lang.String r0 = m7413(r0)     // Catch: java.lang.Throwable -> L659
            goto L36d
        L41e:
            r1 = 53572(0xd144, float:7.507E-41)
            goto L401
        L422:
            r1 = 53634(0xd182, float:7.5157E-41)
        L425:
            r2 = 53651(0xd193, float:7.5181E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L42d;
                case 50: goto L586;
                default: goto L42c;
            }     // Catch: java.lang.Throwable -> L659
        L42c:
            goto L425
        L42d:
            r1 = 53665(0xd1a1, float:7.52E-41)
            goto L425
        L431:
            r1 = r7[r2]     // Catch: java.lang.Throwable -> L659
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L659
            r9 = 2357(0x935, float:3.303E-42)
            int r10 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L659
            r10 = r10 ^ (-59)
            r11 = 2300(0x8fc, float:3.223E-42)
            java.lang.String r3 = kevin.fun.hook.C1120.m8645(r3, r9, r10, r11)     // Catch: java.lang.Throwable -> L659
            java.lang.String r3 = androidx.interpolator.C1081.m1642(r3, r4)     // Catch: java.lang.Throwable -> L659
            java.lang.String r9 = androidx.interpolator.C1082.m1651(r1)     // Catch: java.lang.Throwable -> L659
            boolean r9 = org.luckypray.dexkit.C1125.m10633(r3, r9)     // Catch: java.lang.Throwable -> L659
            r3 = 53758(0xd1fe, float:7.5331E-41)
        L452:
            r10 = 53775(0xd20f, float:7.5355E-41)
            r3 = r3 ^ r10
            switch(r3) {
                case 1009: goto L45a;
                case 1703: goto L460;
                case 1736: goto L473;
                case 1769: goto L464;
                default: goto L459;
            }     // Catch: java.lang.Throwable -> L659
        L459:
            goto L452
        L45a:
            if (r9 != 0) goto L460
            r3 = 54502(0xd4e6, float:7.6374E-41)
            goto L452
        L460:
            r3 = 54471(0xd4c7, float:7.633E-41)
            goto L452
        L464:
            r1 = 54533(0xd505, float:7.6417E-41)
        L467:
            r3 = 54550(0xd516, float:7.6441E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 19: goto L46f;
                case 50: goto L518;
                default: goto L46e;
            }     // Catch: java.lang.Throwable -> L659
        L46e:
            goto L467
        L46f:
            r1 = 54564(0xd524, float:7.646E-41)
            goto L467
        L473:
            java.lang.Class[] r9 = org.luckypray.dexkit.C1123.m10499(r1)     // Catch: java.lang.Throwable -> L659
            int r10 = r9.length     // Catch: java.lang.Throwable -> L659
            r3 = 54657(0xd581, float:7.6591E-41)
        L47b:
            r11 = 54674(0xd592, float:7.6615E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 19: goto L483;
                case 45: goto L518;
                case 50: goto L48a;
                case 3579: goto L48e;
                default: goto L482;
            }     // Catch: java.lang.Throwable -> L659
        L482:
            goto L47b
        L483:
            r3 = 2
            if (r10 < r3) goto L48a
            r3 = 55401(0xd869, float:7.7633E-41)
            goto L47b
        L48a:
            r3 = 54719(0xd5bf, float:7.6678E-41)
            goto L47b
        L48e:
            int r10 = r9.length     // Catch: java.lang.Throwable -> L659
            r3 = 55432(0xd888, float:7.7677E-41)
        L492:
            r11 = 55449(0xd899, float:7.77E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 17: goto L49a;
                case 62: goto L4a1;
                case 95: goto L4b4;
                case 124: goto L4a5;
                default: goto L499;
            }     // Catch: java.lang.Throwable -> L659
        L499:
            goto L492
        L49a:
            r3 = 3
            if (r10 <= r3) goto L4a1
            r3 = 55525(0xd8e5, float:7.7807E-41)
            goto L492
        L4a1:
            r3 = 55494(0xd8c6, float:7.7764E-41)
            goto L492
        L4a5:
            r1 = 55556(0xd904, float:7.785E-41)
        L4a8:
            r3 = 55573(0xd915, float:7.7874E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L4b0;
                case 54: goto L518;
                default: goto L4af;
            }     // Catch: java.lang.Throwable -> L659
        L4af:
            goto L4a8
        L4b0:
            r1 = 55587(0xd923, float:7.7894E-41)
            goto L4a8
        L4b4:
            r3 = 0
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L659
            java.lang.String r3 = androidx.core.C1072.m953(r3)     // Catch: java.lang.Throwable -> L659
            short[] r10 = m7367()     // Catch: java.lang.Throwable -> L659
            r11 = 2371(0x943, float:3.322E-42)
            int r12 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> L659
            r12 = r12 ^ (-21)
            r13 = 2816(0xb00, float:3.946E-42)
            java.lang.String r10 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L659
            boolean r10 = androidx.emoji2.C1080.m1554(r3, r10)     // Catch: java.lang.Throwable -> L659
            r3 = 55680(0xd980, float:7.8024E-41)
        L4d2:
            r11 = 55697(0xd991, float:7.8048E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 17: goto L4da;
                case 1467: goto L4e0;
                case 1496: goto L4f3;
                case 1529: goto L4e4;
                default: goto L4d9;
            }     // Catch: java.lang.Throwable -> L659
        L4d9:
            goto L4d2
        L4da:
            if (r10 != 0) goto L4e0
            r3 = 56424(0xdc68, float:7.9067E-41)
            goto L4d2
        L4e0:
            r3 = 56393(0xdc49, float:7.9023E-41)
            goto L4d2
        L4e4:
            r1 = 56455(0xdc87, float:7.911E-41)
        L4e7:
            r3 = 56472(0xdc98, float:7.9134E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 31: goto L4ef;
                case 62: goto L518;
                default: goto L4ee;
            }     // Catch: java.lang.Throwable -> L659
        L4ee:
            goto L4e7
        L4ef:
            r1 = 56486(0xdca6, float:7.9154E-41)
            goto L4e7
        L4f3:
            r3 = 1
            r10 = r9[r3]     // Catch: java.lang.Throwable -> L659
            r3 = 56579(0xdd03, float:7.9284E-41)
        L4f9:
            r11 = 56596(0xdd14, float:7.9308E-41)
            r3 = r3 ^ r11
            switch(r3) {
                case 23: goto L501;
                case 54: goto L509;
                case 85: goto L52f;
                case 1564036: goto L50d;
                default: goto L500;
            }     // Catch: java.lang.Throwable -> L659
        L500:
            goto L4f9
        L501:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            if (r10 == r3) goto L509
            r3 = 1507472(0x170090, float:2.112418E-39)
            goto L4f9
        L509:
            r3 = 56641(0xdd41, float:7.9371E-41)
            goto L4f9
        L50d:
            r1 = 1507503(0x1700af, float:2.112462E-39)
        L510:
            r3 = 1507520(0x1700c0, float:2.112485E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 14: goto L518;
                case 111: goto L52b;
                default: goto L517;
            }
        L517:
            goto L510
        L518:
            int r1 = androidx.vectordrawable.C1105.f131
            r1 = r1 ^ 359(0x167, float:5.03E-43)
            int r1 = r1 + r2
            r2 = 1510448(0x170c30, float:2.116588E-39)
        L520:
            r3 = 1510465(0x170c41, float:2.116612E-39)
            r2 = r2 ^ r3
            switch(r2) {
                case 14: goto L528;
                case 113: goto L654;
                default: goto L527;
            }
        L527:
            goto L520
        L528:
            r2 = r1
            goto L3fe
        L52b:
            r1 = 1507534(0x1700ce, float:2.112505E-39)
            goto L510
        L52f:
            int r10 = r9.length     // Catch: java.lang.Throwable -> L659
            r3 = 1507627(0x17012b, float:2.112635E-39)
        L533:
            r11 = 1507644(0x17013c, float:2.112659E-39)
            r3 = r3 ^ r11
            switch(r3) {
                case 23: goto L53b;
                case 85: goto L585;
                case 118: goto L542;
                case 180: goto L546;
                default: goto L53a;
            }     // Catch: java.lang.Throwable -> L659
        L53a:
            goto L533
        L53b:
            r3 = 3
            if (r10 != r3) goto L542
            r3 = 1507720(0x170188, float:2.112766E-39)
            goto L533
        L542:
            r3 = 1507689(0x170169, float:2.112722E-39)
            goto L533
        L546:
            r3 = 2
            r3 = r9[r3]     // Catch: java.lang.Throwable -> L659
            java.lang.String r3 = androidx.core.C1072.m953(r3)     // Catch: java.lang.Throwable -> L659
            short[] r9 = m7367()     // Catch: java.lang.Throwable -> L659
            r10 = 2378(0x94a, float:3.332E-42)
            int r11 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L659
            r11 = r11 ^ 542(0x21e, float:7.6E-43)
            r12 = 1975(0x7b7, float:2.768E-42)
            java.lang.String r9 = androidx.lifecycle.process.C1091.m2229(r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L659
            boolean r9 = androidx.emoji2.C1080.m1554(r3, r9)     // Catch: java.lang.Throwable -> L659
            r3 = 1507751(0x1701a7, float:2.112809E-39)
        L564:
            r10 = 1507768(0x1701b8, float:2.112833E-39)
            r3 = r3 ^ r10
            switch(r3) {
                case 31: goto L56c;
                case 1335: goto L576;
                case 1480: goto L585;
                case 1513: goto L572;
                default: goto L56b;
            }     // Catch: java.lang.Throwable -> L659
        L56b:
            goto L564
        L56c:
            if (r9 != 0) goto L572
            r3 = 1508495(0x17048f, float:2.113852E-39)
            goto L564
        L572:
            r3 = 1508464(0x170470, float:2.113808E-39)
            goto L564
        L576:
            r1 = 1508526(0x1704ae, float:2.113895E-39)
        L579:
            r3 = 1508543(0x1704bf, float:2.113919E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L581;
                case 114: goto L518;
                default: goto L580;
            }     // Catch: java.lang.Throwable -> L659
        L580:
            goto L579
        L581:
            r1 = 1508557(0x1704cd, float:2.113939E-39)
            goto L579
        L585:
            r0 = r1
        L586:
            r1 = 1508650(0x17052a, float:2.114069E-39)
        L589:
            r2 = 1508667(0x17053b, float:2.114093E-39)
            r1 = r1 ^ r2
            switch(r1) {
                case 17: goto L591;
                case 83: goto L5b1;
                case 114: goto L597;
                case 3369: goto L59b;
                default: goto L590;
            }     // Catch: java.lang.Throwable -> L659
        L590:
            goto L589
        L591:
            if (r0 != 0) goto L597
            r1 = 1509394(0x170812, float:2.115111E-39)
            goto L589
        L597:
            r1 = 1508712(0x170568, float:2.114156E-39)
            goto L589
        L59b:
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L659
            r1 = 2394(0x95a, float:3.355E-42)
            int r2 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L659
            r2 = r2 ^ 148(0x94, float:2.07E-43)
            r3 = 629(0x275, float:8.81E-43)
            java.lang.String r0 = androidx.appcompat.resources.C1068.m652(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L659
            m7397(r0)     // Catch: java.lang.Throwable -> L659
            r0 = 0
            goto L19
        L5b1:
            r1 = 1
            androidx.lifecycle.process.C1088.m2070(r0, r1)     // Catch: java.lang.Throwable -> L659
            java.lang.Class[] r1 = org.luckypray.dexkit.C1123.m10499(r0)     // Catch: java.lang.Throwable -> L659
            int r2 = r1.length     // Catch: java.lang.Throwable -> L659
            r1 = 1509425(0x170831, float:2.115155E-39)
        L5bd:
            r3 = 1509442(0x170842, float:2.115179E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 18: goto L5c5;
                case 45: goto L5f6;
                case 115: goto L5c9;
                case 204: goto L5d0;
                default: goto L5c4;
            }     // Catch: java.lang.Throwable -> L659
        L5c4:
            goto L5bd
        L5c5:
            r1 = 1509487(0x17086f, float:2.115242E-39)
            goto L5bd
        L5c9:
            r1 = 2
            if (r2 != r1) goto L5c5
            r1 = 1509518(0x17088e, float:2.115285E-39)
            goto L5bd
        L5d0:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L659
            r1.<init>()     // Catch: java.lang.Throwable -> L659
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L659
            int r3 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-363(0xfffffffffffffe95, float:NaN))
            r2[r3] = r6     // Catch: java.lang.Throwable -> L659
            int r3 = androidx.startup.C1100.f126     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ (-277(0xfffffffffffffeeb, float:NaN))
            r2[r3] = r1     // Catch: java.lang.Throwable -> L659
            androidx.loader.C1097.m2712(r0, r5, r2)     // Catch: java.lang.Throwable -> L659
            r0 = 1509549(0x1708ad, float:2.115329E-39)
        L5ea:
            r1 = 1509566(0x1708be, float:2.115353E-39)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L5f2;
                case 114: goto L62a;
                default: goto L5f1;
            }     // Catch: java.lang.Throwable -> L659
        L5f1:
            goto L5ea
        L5f2:
            r0 = 1509580(0x1708cc, float:2.115372E-39)
            goto L5ea
        L5f6:
            r1 = 1509673(0x170929, float:2.115502E-39)
        L5f9:
            r3 = 1509690(0x17093a, float:2.115526E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 19: goto L601;
                case 712: goto L62d;
                case 745: goto L608;
                case 1323: goto L60c;
                default: goto L600;
            }     // Catch: java.lang.Throwable -> L659
        L600:
            goto L5f9
        L601:
            r1 = 3
            if (r2 != r1) goto L608
            r1 = 1510417(0x170c11, float:2.116545E-39)
            goto L5f9
        L608:
            r1 = 1510386(0x170bf2, float:2.116502E-39)
            goto L5f9
        L60c:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L659
            r1.<init>()     // Catch: java.lang.Throwable -> L659
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L659
            int r3 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 286(0x11e, float:4.01E-43)
            r2[r3] = r6     // Catch: java.lang.Throwable -> L659
            int r3 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> L659
            r3 = r3 ^ 115(0x73, float:1.61E-43)
            r2[r3] = r1     // Catch: java.lang.Throwable -> L659
            int r1 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L659
            r1 = r1 ^ 524(0x20c, float:7.34E-43)
            r3 = 0
            r2[r1] = r3     // Catch: java.lang.Throwable -> L659
            androidx.loader.C1097.m2712(r0, r5, r2)     // Catch: java.lang.Throwable -> L659
        L62a:
            r0 = 1
            goto L19
        L62d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L659
            r0.<init>()     // Catch: java.lang.Throwable -> L659
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L659
            r3 = 2418(0x972, float:3.388E-42)
            int r4 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L659
            r4 = r4 ^ 583(0x247, float:8.17E-43)
            r5 = 1129(0x469, float:1.582E-42)
            java.lang.String r1 = androidx.vectordrawable.animated.C1102.m3116(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L659
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)     // Catch: java.lang.Throwable -> L659
            java.lang.StringBuilder r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3654(r0, r2)     // Catch: java.lang.Throwable -> L659
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L659
            m7397(r0)     // Catch: java.lang.Throwable -> L659
            r0 = 0
            goto L19
        L654:
            r2 = 1510479(0x170c4f, float:2.116632E-39)
            goto L520
        L659:
            r0 = move-exception
            java.lang.String r1 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7367()
            r4 = 2438(0x986, float:3.416E-42)
            int r5 = org.luckypray.dexkit.C1124.f434
            r5 = r5 ^ 641(0x281, float:8.98E-43)
            r6 = 1871(0x74f, float:2.622E-42)
            java.lang.String r3 = androidx.activity.C1062.m170(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r2, r1)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            m7397(r1)
            boolean r2 = r0 instanceof java.lang.reflect.InvocationTargetException
            r1 = 1510572(0x170cac, float:2.116762E-39)
        L687:
            r3 = 1510589(0x170cbd, float:2.116786E-39)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L68f;
                case 87: goto L6c7;
                case 118: goto L695;
                case 809: goto L699;
                default: goto L68e;
            }
        L68e:
            goto L687
        L68f:
            if (r2 == 0) goto L695
            r1 = 1511316(0x170f94, float:2.117805E-39)
            goto L687
        L695:
            r1 = 1510634(0x170cea, float:2.116849E-39)
            goto L687
        L699:
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
            java.lang.Throwable r0 = androidx.loader.C1096.m2686(r0)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7367()
            r3 = 2456(0x998, float:3.442E-42)
            int r4 = androidx.lifecycle.process.C1091.f117
            r4 = r4 ^ (-510(0xfffffffffffffe02, float:NaN))
            r5 = 2582(0xa16, float:3.618E-42)
            java.lang.String r2 = androidx.vectordrawable.C1104.m3232(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
        L6c7:
            java.util.concurrent.atomic.AtomicBoolean r0 = m7394()
            r1 = 0
            androidx.drawerlayout.C1077.m1308(r0, r1)
            r0 = 0
            goto L19
        L6d2:
            r0 = move-exception
            goto L13d
    }

    private static void setConversationCustomMessage(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m7367()
            r2 = 2512(0x9d0, float:3.52E-42)
            int r3 = androidx.appcompat.resources.C1068.f94
            r3 = r3 ^ 536(0x218, float:7.51E-43)
            r4 = 2443(0x98b, float:3.423E-42)
            java.lang.String r1 = androidx.loader.C1097.m2734(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r5)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.core.C1073.m1055(r0, r6)
            int r1 = androidx.loader.C1099.m2876()
            r0 = 1616(0x650, float:2.264E-42)
        L2a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L30;
                case 49: goto L33;
                case 204: goto L38;
                case 239: goto L43;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2a
        L33:
            if (r1 < 0) goto L30
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2a
        L38:
            java.lang.String r0 = "YaIUcxQ21vJhaRK7Z5Mw1oAbCkSqK"
            java.lang.String r0 = androidx.loader.C1099.m2832(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L43:
            return
    }

    private static void setConversationEnabled(java.lang.String r5, boolean r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            short[] r1 = m7367()
            r2 = 2534(0x9e6, float:3.551E-42)
            int r3 = androidx.documentfile.C1076.f102
            r3 = r3 ^ (-588(0xfffffffffffffdb4, float:NaN))
            r4 = 1460(0x5b4, float:2.046E-42)
            java.lang.String r1 = androidx.activity.C1065.m410(r1, r2, r3, r4)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r1)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r0, r5)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.interpolator.C1081.m1588(r0, r6)
            int r1 = androidx.loader.C1096.m2651()
            r0 = 1616(0x650, float:2.264E-42)
        L2a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L30;
                case 49: goto L33;
                case 204: goto L38;
                case 239: goto L47;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2a
        L33:
            if (r1 < 0) goto L30
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2a
        L38:
            java.lang.String r0 = "eTbsbSqwY4ZlijXFI7WBB"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L47:
            return
    }

    private static void setConversationRandomApiType(java.lang.String r9, java.lang.String r10) {
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۦۥۡ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56382: goto L5a;
                case 1746720: goto L40;
                case 1747684: goto L52;
                case 1747932: goto L29;
                case 1749731: goto L39;
                case 1751740: goto L21;
                case 1753602: goto L30;
                case 1753702: goto L4c;
                case 1754567: goto L5e;
                case 1755343: goto L19;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.String r1 = "ۨ۟ۦ"
            r5 = r1
            goto La
        L19:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r9)
            java.lang.String r5 = "۠۠ۤ"
            r3 = r1
            goto La
        L21:
            short[] r1 = m7367()
            java.lang.String r5 = "ۦۨۨ"
            r2 = r1
            goto La
        L29:
            androidx.core.C1073.m1055(r4, r10)
            java.lang.String r1 = "ۧۥۥ"
            r5 = r1
            goto La
        L30:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "ۤۧ۟"
            r3 = r1
            goto La
        L39:
            r7 = r6 ^ 508(0x1fc, float:7.12E-43)
            java.lang.String r1 = "۟۠ۡ"
            r5 = r1
            r8 = r7
            goto La
        L40:
            r1 = 2552(0x9f8, float:3.576E-42)
            r4 = 1321(0x529, float:1.851E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1088.m2044(r2, r1, r8, r4)
            java.lang.String r5 = "ۨۡۡ"
            r4 = r1
            goto La
        L4c:
            int r6 = androidx.activity.C1064.f90
            java.lang.String r1 = "ۢۤۥ"
            r5 = r1
            goto La
        L52:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r3)
            java.lang.String r5 = "ۢ۠"
            r4 = r1
            goto La
        L5a:
            java.lang.String r1 = "۠ۨۤ"
            r5 = r1
            goto La
        L5e:
            return
    }

    private static void setOnlySparkFilter(boolean r4) {
            short[] r0 = m7367()
            r1 = 2574(0xa0e, float:3.607E-42)
            int r2 = androidx.appcompat.resources.C1068.f94
            r2 = r2 ^ 543(0x21f, float:7.61E-43)
            r3 = 2940(0xb7c, float:4.12E-42)
            java.lang.String r0 = androidx.activity.C1062.m170(r0, r1, r2, r3)
            androidx.interpolator.C1081.m1588(r0, r4)
            int r1 = androidx.startup.C1101.m2984()
            r0 = 1616(0x650, float:2.264E-42)
        L19:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1f;
                case 49: goto L22;
                case 204: goto L27;
                case 239: goto L36;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L19
        L22:
            if (r1 > 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            java.lang.String r0 = "RDcF"
            java.lang.String r0 = androidx.core.ktx.C1071.m903(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
    }

    private static void setUseCustomMessage(java.lang.String r9, boolean r10) {
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۣۢ۟"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56387: goto L25;
                case 1749694: goto L2d;
                case 1749796: goto L51;
                case 1750725: goto L57;
                case 1750785: goto L3d;
                case 1751497: goto L19;
                case 1751590: goto L45;
                case 1753478: goto L4d;
                case 1754476: goto L36;
                case 1754568: goto L5e;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r3, r4)
            java.lang.String r1 = "ۤۢۤ"
            r5 = r1
            goto La
        L19:
            r1 = 2591(0xa1f, float:3.631E-42)
            r4 = 2779(0xadb, float:3.894E-42)
            java.lang.String r1 = androidx.activity.C1063.m241(r2, r1, r6, r4)
            java.lang.String r5 = "ۥۣۦ"
            r4 = r1
            goto La
        L25:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r3)
            java.lang.String r5 = "ۦۡۡ"
            r4 = r1
            goto La
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "ۣۧۥ"
            r3 = r1
            goto La
        L36:
            int r7 = androidx.activity.C1064.f90
            java.lang.String r1 = "ۢۦۨ"
            r5 = r1
            r8 = r7
            goto La
        L3d:
            short[] r1 = m7367()
            java.lang.String r5 = "ۧۢۧ"
            r2 = r1
            goto La
        L45:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r9)
            java.lang.String r5 = "ۢۥ"
            r3 = r1
            goto La
        L4d:
            java.lang.String r1 = "ۣۥۧ"
            r5 = r1
            goto La
        L51:
            r6 = r8 ^ 508(0x1fc, float:7.12E-43)
            java.lang.String r1 = "ۤ۟ۤ"
            r5 = r1
            goto La
        L57:
            androidx.interpolator.C1081.m1588(r4, r10)
            java.lang.String r1 = "ۧۥۦ"
            r5 = r1
            goto La
        L5e:
            return
    }

    private static void showBackgroundResultToast(android.app.Activity r4, int r5, int r6, int r7) {
            r1 = 0
            java.lang.String r3 = "۠ۥۨ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1747772: goto L24;
                case 1747779: goto L1d;
                case 1747843: goto L15;
                default: goto Lc;
            }
        Lc:
            kevin.fun.hook.SparkRenewHelper$4 r0 = new kevin.fun.hook.SparkRenewHelper$4
            r0.<init>(r6, r7, r4)
            java.lang.String r1 = "ۣ۠ۦ"
            r3 = r1
            goto L5
        L15:
            android.os.Handler r1 = m7404()
            java.lang.String r3 = "ۧۤۧ"
            r2 = r1
            goto L5
        L1d:
            androidx.activity.C1062.m178(r2, r0)
            java.lang.String r1 = "ۣ۠۟"
            r3 = r1
            goto L5
        L24:
            return
    }

    private static void showConversationCustomMsgDialog(android.content.Context r7, kevin.fun.hook.SparkRenewHelper.SparkInfo r8, java.lang.Runnable r9) {
            android.widget.EditText r0 = new android.widget.EditText     // Catch: java.lang.Throwable -> Lee
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = androidx.viewpager.C1108.m3493(r8)     // Catch: java.lang.Throwable -> Lee
            java.lang.String r1 = m7375(r1)     // Catch: java.lang.Throwable -> Lee
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3825(r0, r1)     // Catch: java.lang.Throwable -> Lee
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> Lee
            r2 = 2613(0xa35, float:3.662E-42)
            int r3 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> Lee
            r3 = r3 ^ 660(0x294, float:9.25E-43)
            r4 = 344(0x158, float:4.82E-43)
            java.lang.String r1 = androidx.activity.C1066.m468(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lee
            androidx.lifecycle.process.C1090.m2215(r0, r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> Lee
            r1 = r1 ^ (-17)
            com.tencent.mmkv.C1109.m3582(r0, r1)     // Catch: java.lang.Throwable -> Lee
            r1 = -16776435(0xffffffffff00030d, float:-1.7015702E38)
            int r2 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> Lee
            r1 = r1 ^ r2
            androidx.vectordrawable.C1104.m3201(r0, r1)     // Catch: java.lang.Throwable -> Lee
            r1 = -6710650(0xffffffffff999a86, float:NaN)
            int r2 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> Lee
            r1 = r1 ^ r2
            androidx.lifecycle.process.C1089.m2152(r0, r1)     // Catch: java.lang.Throwable -> Lee
            r1 = 0
            androidx.vectordrawable.animated.C1102.m3095(r0, r1)     // Catch: java.lang.Throwable -> Lee
            int r1 = androidx.loader.C1098.f124     // Catch: java.lang.Throwable -> Lee
            r1 = r1 ^ (-815(0xfffffffffffffcd1, float:NaN))
            int r2 = m7354(r7, r1)     // Catch: java.lang.Throwable -> Lee
            int r3 = m7354(r7, r1)     // Catch: java.lang.Throwable -> Lee
            int r4 = m7354(r7, r1)     // Catch: java.lang.Throwable -> Lee
            int r5 = m7354(r7, r1)     // Catch: java.lang.Throwable -> Lee
            kevin.fun.hook.audio.C1117.m8119(r0, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lee
            android.widget.FrameLayout r2 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> Lee
            r2.<init>(r7)     // Catch: java.lang.Throwable -> Lee
            int r3 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> Lee
            r3 = r3 ^ 793(0x319, float:1.111E-42)
            int r4 = m7354(r7, r3)     // Catch: java.lang.Throwable -> Lee
            int r5 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Throwable -> Lee
            r5 = r5 ^ (-101(0xffffffffffffff9b, float:NaN))
            int r5 = m7354(r7, r5)     // Catch: java.lang.Throwable -> Lee
            int r3 = m7354(r7, r3)     // Catch: java.lang.Throwable -> Lee
            r6 = 0
            androidx.documentfile.C1076.m1212(r2, r4, r5, r3, r6)     // Catch: java.lang.Throwable -> Lee
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> Lee
            r3.<init>()     // Catch: java.lang.Throwable -> Lee
            r4 = 658413(0xa0bed, float:9.22633E-40)
            int r5 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> Lee
            r4 = r4 ^ r5
            androidx.lifecycle.livedata.C1085.m1879(r3, r4)     // Catch: java.lang.Throwable -> Lee
            int r1 = m7354(r7, r1)     // Catch: java.lang.Throwable -> Lee
            float r1 = (float) r1     // Catch: java.lang.Throwable -> Lee
            androidx.lifecycle.process.C1091.m2252(r3, r1)     // Catch: java.lang.Throwable -> Lee
            androidx.vectordrawable.animated.C1102.m3095(r0, r3)     // Catch: java.lang.Throwable -> Lee
            androidx.annotation.experimental.C1067.m579(r2, r0)     // Catch: java.lang.Throwable -> Lee
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> Lee
            int r3 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> Lee
            r3 = r3 ^ 355(0x163, float:4.97E-43)
            r1.<init>(r7, r3)     // Catch: java.lang.Throwable -> Lee
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> Lee
            r4 = 2620(0xa3c, float:3.671E-42)
            int r5 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> Lee
            r5 = r5 ^ 792(0x318, float:1.11E-42)
            r6 = 952(0x3b8, float:1.334E-42)
            java.lang.String r3 = androidx.activity.C1062.m170(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lee
            android.app.AlertDialog$Builder r1 = androidx.interpolator.C1082.m1669(r1, r3)     // Catch: java.lang.Throwable -> Lee
            android.app.AlertDialog$Builder r1 = androidx.activity.C1065.m438(r1, r2)     // Catch: java.lang.Throwable -> Lee
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> Lee
            r3 = 2627(0xa43, float:3.681E-42)
            int r4 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> Lee
            r4 = r4 ^ 292(0x124, float:4.09E-43)
            r5 = 1953(0x7a1, float:2.737E-42)
            java.lang.String r2 = androidx.lifecycle.runtime.C1092.m2337(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lee
            r3 = 0
            android.app.AlertDialog$Builder r1 = androidx.versionedparcelable.C1107.m3455(r1, r2, r3)     // Catch: java.lang.Throwable -> Lee
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> Lee
            r3 = 2629(0xa45, float:3.684E-42)
            int r4 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> Lee
            r4 = r4 ^ 356(0x164, float:4.99E-43)
            r5 = 1179(0x49b, float:1.652E-42)
            java.lang.String r2 = kevin.fun.hook.webdav.C1119.m8576(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lee
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda0 r3 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> Lee
            r3.<init>(r0, r7, r8, r9)     // Catch: java.lang.Throwable -> Lee
            android.app.AlertDialog$Builder r0 = androidx.customview.C1075.m1130(r1, r2, r3)     // Catch: java.lang.Throwable -> Lee
            kevin.fun.hook.webdav.C1118.m8514(r0)     // Catch: java.lang.Throwable -> Lee
            r0 = 1616(0x650, float:2.264E-42)
        Le4:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lea;
                case 49: goto Leb;
                default: goto Le9;
            }
        Le9:
            goto Le4
        Lea:
            return
        Leb:
            r0 = 1647(0x66f, float:2.308E-42)
            goto Le4
        Lee:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7367()
            r3 = 2631(0xa47, float:3.687E-42)
            int r4 = androidx.lifecycle.process.C1088.f114
            r4 = r4 ^ (-74)
            r5 = 568(0x238, float:7.96E-43)
            java.lang.String r2 = androidx.lifecycle.livedata.C1085.m1814(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
            goto Lea
    }

    private static void showProgressDialogWithBackgroundButton(android.app.Activity r2, int r3, boolean[] r4) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L34;
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
            int r1 = kevin.fun.hook.C1120.m8652()
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L33;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 < 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            java.lang.String r0 = "QukcomvwwhppEM58M"
            java.lang.String r0 = kevin.fun.hook.audio.C1115.m8007(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L33:
            return
        L34:
            android.os.Handler r0 = m7404()
            kevin.fun.hook.SparkRenewHelper$3 r1 = new kevin.fun.hook.SparkRenewHelper$3
            r1.<init>(r2, r3, r4)
            androidx.activity.C1062.m178(r0, r1)
            goto L33
    }

    private static void showRandomApiSelectDialog(android.content.Context r14, kevin.fun.hook.SparkRenewHelper.SparkInfo r15, java.lang.Runnable r16) {
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r1 = 2674(0xa72, float:3.747E-42)
            int r2 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L4e5
            r2 = r2 ^ (-622(0xfffffffffffffd92, float:NaN))
            r3 = 2492(0x9bc, float:3.492E-42)
            java.lang.String r0 = androidx.startup.C1101.m3014(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4e5
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r2 = 2676(0xa74, float:3.75E-42)
            int r3 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L4e5
            r3 = r3 ^ (-56)
            r4 = 972(0x3cc, float:1.362E-42)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8576(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4e5
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r3 = 2678(0xa76, float:3.753E-42)
            int r4 = org.luckypray.dexkit.C1123.f433     // Catch: java.lang.Throwable -> L4e5
            r4 = r4 ^ (-965(0xfffffffffffffc3b, float:NaN))
            r5 = 2821(0xb05, float:3.953E-42)
            java.lang.String r2 = com.tencent.mmkv.C1109.m3629(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e5
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r4 = 2680(0xa78, float:3.755E-42)
            int r5 = androidx.lifecycle.process.C1088.f114     // Catch: java.lang.Throwable -> L4e5
            r5 = r5 ^ (-97)
            r6 = 398(0x18e, float:5.58E-43)
            java.lang.String r3 = org.luckypray.dexkit.C1123.m10510(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e5
            short[] r4 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r5 = 2682(0xa7a, float:3.758E-42)
            int r6 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L4e5
            r6 = r6 ^ (-267(0xfffffffffffffef5, float:NaN))
            r7 = 3046(0xbe6, float:4.268E-42)
            java.lang.String r4 = androidx.drawerlayout.C1077.m1343(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e5
            short[] r5 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r6 = 2684(0xa7c, float:3.761E-42)
            int r7 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L4e5
            r7 = r7 ^ 655(0x28f, float:9.18E-43)
            r8 = 1408(0x580, float:1.973E-42)
            java.lang.String r5 = androidx.appcompat.C1069.m751(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4e5
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r7 = 2686(0xa7e, float:3.764E-42)
            int r8 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L4e5
            r8 = r8 ^ 765(0x2fd, float:1.072E-42)
            r9 = 3234(0xca2, float:4.532E-42)
            java.lang.String r6 = org.luckypray.dexkit.C1125.m10615(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4e5
            short[] r7 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r8 = 2689(0xa81, float:3.768E-42)
            int r9 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L4e5
            r9 = r9 ^ (-365(0xfffffffffffffe93, float:NaN))
            r10 = 2276(0x8e4, float:3.19E-42)
            java.lang.String r7 = androidx.customview.C1075.m1138(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4e5
            short[] r8 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r9 = 2695(0xa87, float:3.776E-42)
            int r10 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L4e5
            r10 = r10 ^ 86
            r11 = 2376(0x948, float:3.33E-42)
            java.lang.String r8 = androidx.lifecycle.process.C1088.m2044(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4e5
            r9 = 9
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L4e5
            int r10 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L4e5
            r10 = r10 ^ 358(0x166, float:5.02E-43)
            r9[r10] = r0     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 373(0x175, float:5.23E-43)
            r9[r0] = r1     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 356(0x164, float:4.99E-43)
            r9[r0] = r2     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.emoji2.viewsintegration.C1079.f105     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-110(0xffffffffffffff92, float:NaN))
            r9[r0] = r3     // Catch: java.lang.Throwable -> L4e5
            int r0 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 77
            r9[r0] = r4     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-80)
            r9[r0] = r5     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 116(0x74, float:1.63E-43)
            r9[r0] = r6     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 596(0x254, float:8.35E-43)
            r9[r0] = r7     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-951(0xfffffffffffffc49, float:NaN))
            r9[r0] = r8     // Catch: java.lang.Throwable -> L4e5
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r1 = 2699(0xa8b, float:3.782E-42)
            int r2 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L4e5
            r2 = r2 ^ 368(0x170, float:5.16E-43)
            r3 = 2060(0x80c, float:2.887E-42)
            java.lang.String r0 = androidx.vectordrawable.C1104.m3232(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L4e5
            short[] r1 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r2 = 2703(0xa8f, float:3.788E-42)
            int r3 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> L4e5
            r3 = r3 ^ (-24)
            r4 = 2744(0xab8, float:3.845E-42)
            java.lang.String r1 = androidx.core.C1073.m1028(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4e5
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r3 = 2707(0xa93, float:3.793E-42)
            int r4 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L4e5
            r4 = r4 ^ 782(0x30e, float:1.096E-42)
            r5 = 1966(0x7ae, float:2.755E-42)
            java.lang.String r2 = androidx.loader.C1099.m2843(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e5
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r4 = 2710(0xa96, float:3.798E-42)
            int r5 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L4e5
            r5 = r5 ^ (-539(0xfffffffffffffde5, float:NaN))
            r6 = 1891(0x763, float:2.65E-42)
            java.lang.String r4 = androidx.loader.C1098.m2787(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e5
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r5 = 2715(0xa9b, float:3.805E-42)
            int r6 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L4e5
            r6 = r6 ^ 776(0x308, float:1.087E-42)
            r7 = 1175(0x497, float:1.647E-42)
            java.lang.String r5 = kevin.fun.hook.audio.C1114.m7940(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e5
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r6 = 2720(0xaa0, float:3.812E-42)
            int r7 = androidx.lifecycle.process.C1088.f114     // Catch: java.lang.Throwable -> L4e5
            r7 = r7 ^ (-103(0xffffffffffffff99, float:NaN))
            r8 = 2338(0x922, float:3.276E-42)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r3, r6, r7, r8)     // Catch: java.lang.Throwable -> L4e5
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r7 = 2724(0xaa4, float:3.817E-42)
            int r8 = com.tencent.mmkv.C1109.f135     // Catch: java.lang.Throwable -> L4e5
            r8 = r8 ^ (-484(0xfffffffffffffe1c, float:NaN))
            r10 = 1765(0x6e5, float:2.473E-42)
            java.lang.String r7 = androidx.core.ktx.C1071.m874(r3, r7, r8, r10)     // Catch: java.lang.Throwable -> L4e5
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r8 = 2728(0xaa8, float:3.823E-42)
            int r10 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L4e5
            r10 = r10 ^ (-606(0xfffffffffffffda2, float:NaN))
            r11 = 1709(0x6ad, float:2.395E-42)
            java.lang.String r8 = androidx.interpolator.C1083.m1723(r3, r8, r10, r11)     // Catch: java.lang.Throwable -> L4e5
            short[] r3 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r10 = 2732(0xaac, float:3.828E-42)
            int r11 = androidx.loader.C1098.f124     // Catch: java.lang.Throwable -> L4e5
            r11 = r11 ^ (-808(0xfffffffffffffcd8, float:NaN))
            r12 = 838(0x346, float:1.174E-42)
            java.lang.String r10 = androidx.emoji2.viewsintegration.C1079.m1457(r3, r10, r11, r12)     // Catch: java.lang.Throwable -> L4e5
            r3 = 9
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L4e5
            int r11 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L4e5
            r11 = r11 ^ (-624(0xfffffffffffffd90, float:NaN))
            r3[r11] = r0     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 350(0x15e, float:4.9E-43)
            r3[r0] = r1     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-486(0xfffffffffffffe1a, float:NaN))
            r3[r0] = r2     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-541(0xfffffffffffffde3, float:NaN))
            r3[r0] = r4     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 522(0x20a, float:7.31E-43)
            r3[r0] = r5     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-539(0xfffffffffffffde5, float:NaN))
            r3[r0] = r6     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 138(0x8a, float:1.93E-43)
            r3[r0] = r7     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 901(0x385, float:1.263E-42)
            r3[r0] = r8     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-424(0xfffffffffffffe58, float:NaN))
            r3[r0] = r10     // Catch: java.lang.Throwable -> L4e5
            java.lang.String r0 = androidx.viewpager.C1108.m3493(r15)     // Catch: java.lang.Throwable -> L4e5
            java.lang.String r2 = m7379(r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = 0
        L19d:
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4e5
            r1 = 1616(0x650, float:2.264E-42)
        L1a0:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L1a6;
                case 49: goto L1a9;
                case 204: goto L1ae;
                case 239: goto L34b;
                default: goto L1a5;
            }     // Catch: java.lang.Throwable -> L4e5
        L1a5:
            goto L1a0
        L1a6:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L1a0
        L1a9:
            if (r0 < r4) goto L1a6
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L1a0
        L1ae:
            r0 = 2
            r1 = 1740(0x6cc, float:2.438E-42)
        L1b1:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L1b7;
                case 54: goto L1ba;
                default: goto L1b6;
            }     // Catch: java.lang.Throwable -> L4e5
        L1b6:
            goto L1b1
        L1b7:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1b1
        L1ba:
            r6 = r0
        L1bb:
            android.app.Dialog r5 = new android.app.Dialog     // Catch: java.lang.Throwable -> L4e5
            r0 = 16974051(0x10300e3, float:2.4061536E-38)
            int r1 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ r1
            r5.<init>(r14, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = 1
            androidx.lifecycle.runtime.C1092.m2297(r5, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = 1
            androidx.emoji2.C1080.m1555(r5, r0)     // Catch: java.lang.Throwable -> L4e5
            android.widget.FrameLayout r7 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L4e5
            r7.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L4e5
            int r1 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L4e5
            r1 = r1 ^ (-899(0xfffffffffffffc7d, float:NaN))
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.process.C1091.m2273(r7, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = -2147483158(0xffffffff800001ea, float:-6.87E-43)
            int r2 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ r2
            androidx.lifecycle.livedata.C1084.m1783(r7, r0)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4e5
            r8.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            r0 = 1
            androidx.customview.C1074.m1119(r8, r0)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1085.m1855(r8, r1)     // Catch: java.lang.Throwable -> L4e5
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L4e5
            int r2 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> L4e5
            r2 = r2 ^ (-799(0xfffffffffffffce1, float:NaN))
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4e5
            r2 = 80
            r0.gravity = r2     // Catch: java.lang.Throwable -> L4e5
            androidx.vectordrawable.C1105.m3296(r8, r0)     // Catch: java.lang.Throwable -> L4e5
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L4e5
            r0.<init>()     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1085.m1879(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            int r1 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L4e5
            r1 = r1 ^ 7
            r2 = 8
            float[] r2 = new float[r2]     // Catch: java.lang.Throwable -> L4e5
            r4 = 0
            int r10 = m7354(r14, r1)     // Catch: java.lang.Throwable -> L4e5
            float r10 = (float) r10     // Catch: java.lang.Throwable -> L4e5
            r2[r4] = r10     // Catch: java.lang.Throwable -> L4e5
            r4 = 1
            int r10 = m7354(r14, r1)     // Catch: java.lang.Throwable -> L4e5
            float r10 = (float) r10     // Catch: java.lang.Throwable -> L4e5
            r2[r4] = r10     // Catch: java.lang.Throwable -> L4e5
            r4 = 2
            int r10 = m7354(r14, r1)     // Catch: java.lang.Throwable -> L4e5
            float r10 = (float) r10     // Catch: java.lang.Throwable -> L4e5
            r2[r4] = r10     // Catch: java.lang.Throwable -> L4e5
            r4 = 3
            int r1 = m7354(r14, r1)     // Catch: java.lang.Throwable -> L4e5
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L4e5
            r2[r4] = r1     // Catch: java.lang.Throwable -> L4e5
            r1 = 4
            r4 = 0
            r2[r1] = r4     // Catch: java.lang.Throwable -> L4e5
            r1 = 5
            r4 = 0
            r2[r1] = r4     // Catch: java.lang.Throwable -> L4e5
            r1 = 6
            r4 = 0
            r2[r1] = r4     // Catch: java.lang.Throwable -> L4e5
            r1 = 7
            r4 = 0
            r2[r1] = r4     // Catch: java.lang.Throwable -> L4e5
            androidx.vectordrawable.C1103.m3187(r0, r2)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1065.m397(r8, r0)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4e5
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            r1 = 0
            androidx.customview.C1074.m1119(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            int r1 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L4e5
            r1 = r1 ^ 431(0x1af, float:6.04E-43)
            androidx.emoji2.C1080.m1542(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            int r2 = androidx.interpolator.C1083.f109     // Catch: java.lang.Throwable -> L4e5
            r2 = r2 ^ (-426(0xfffffffffffffe56, float:NaN))
            int r4 = m7354(r14, r2)     // Catch: java.lang.Throwable -> L4e5
            int r10 = m7354(r14, r2)     // Catch: java.lang.Throwable -> L4e5
            int r2 = m7354(r14, r2)     // Catch: java.lang.Throwable -> L4e5
            int r1 = m7354(r14, r1)     // Catch: java.lang.Throwable -> L4e5
            androidx.drawerlayout.C1077.m1314(r0, r4, r10, r2, r1)     // Catch: java.lang.Throwable -> L4e5
            android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4e5
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            short[] r2 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r4 = 2737(0xab1, float:3.835E-42)
            int r10 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L4e5
            r10 = r10 ^ 27
            r11 = 1331(0x533, float:1.865E-42)
            java.lang.String r2 = androidx.lifecycle.viewmodel.C1093.m2415(r2, r4, r10, r11)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.process.C1087.m1946(r1, r2)     // Catch: java.lang.Throwable -> L4e5
            r2 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r1, r2)     // Catch: java.lang.Throwable -> L4e5
            r2 = 0
            r4 = 1
            androidx.lifecycle.livedata.C1085.m1833(r1, r2, r4)     // Catch: java.lang.Throwable -> L4e5
            r2 = 13421737(0xcccca9, float:1.880786E-38)
            int r4 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L4e5
            r2 = r2 ^ r4
            kevin.fun.hook.webdav.C1118.m8517(r1, r2)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4e5
            r4 = 0
            int r10 = androidx.vectordrawable.animated.C1102.f128     // Catch: java.lang.Throwable -> L4e5
            r10 = r10 ^ (-195(0xffffffffffffff3d, float:NaN))
            r11 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r4, r10, r11)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1085.m1822(r1, r2)     // Catch: java.lang.Throwable -> L4e5
            android.widget.TextView r2 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4e5
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            short[] r4 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r10 = 2745(0xab9, float:3.847E-42)
            int r11 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L4e5
            r11 = r11 ^ 764(0x2fc, float:1.07E-42)
            r12 = 1468(0x5bc, float:2.057E-42)
            java.lang.String r4 = androidx.lifecycle.process.C1087.m2008(r4, r10, r11, r12)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.process.C1087.m1946(r2, r4)     // Catch: java.lang.Throwable -> L4e5
            r4 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r4)     // Catch: java.lang.Throwable -> L4e5
            r4 = -6710757(0xffffffffff999a1b, float:NaN)
            int r10 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L4e5
            r4 = r4 ^ r10
            kevin.fun.hook.webdav.C1118.m8517(r2, r4)     // Catch: java.lang.Throwable -> L4e5
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda5 r4 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda5     // Catch: java.lang.Throwable -> L4e5
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1086.m1916(r2, r4)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r0, r2)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r8, r0)     // Catch: java.lang.Throwable -> L4e5
            android.view.View r0 = new android.view.View     // Catch: java.lang.Throwable -> L4e5
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4e5
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = m7365(r14, r2)     // Catch: java.lang.Throwable -> L4e5
            int r4 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L4e5
            r4 = r4 ^ 452(0x1c4, float:6.33E-43)
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1085.m1843(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            r1 = -1118264(0xffffffffffeeefc8, float:NaN)
            int r2 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L4e5
            r1 = r1 ^ r2
            androidx.loader.C1099.m2849(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r8, r0)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout r10 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4e5
            r10.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            r0 = 1
            androidx.customview.C1074.m1119(r10, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = 0
            int r0 = m7354(r14, r0)     // Catch: java.lang.Throwable -> L4e5
            int r1 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L4e5
            r1 = r1 ^ 936(0x3a8, float:1.312E-42)
            int r1 = m7354(r14, r1)     // Catch: java.lang.Throwable -> L4e5
            r2 = 0
            int r2 = m7354(r14, r2)     // Catch: java.lang.Throwable -> L4e5
            int r4 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L4e5
            r4 = r4 ^ (-257(0xfffffffffffffeff, float:NaN))
            int r4 = m7354(r14, r4)     // Catch: java.lang.Throwable -> L4e5
            androidx.drawerlayout.C1077.m1314(r10, r0, r1, r2, r4)     // Catch: java.lang.Throwable -> L4e5
            r0 = 1
            int[] r1 = new int[r0]     // Catch: java.lang.Throwable -> L4e5
            int r0 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-363(0xfffffffffffffe95, float:NaN))
            r1[r0] = r6     // Catch: java.lang.Throwable -> L4e5
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4e5
            r11.<init>()     // Catch: java.lang.Throwable -> L4e5
            r0 = 0
            r4 = r0
        L33b:
            int r2 = r9.length     // Catch: java.lang.Throwable -> L4e5
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L33f:
            r12 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r12
            switch(r0) {
                case 14: goto L347;
                case 45: goto L43e;
                case 76: goto L36c;
                case 239: goto L366;
                default: goto L346;
            }     // Catch: java.lang.Throwable -> L4e5
        L346:
            goto L33f
        L347:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L33f
        L34b:
            r1 = r3[r0]     // Catch: java.lang.Throwable -> L4e5
            boolean r4 = org.luckypray.dexkit.C1125.m10633(r1, r2)     // Catch: java.lang.Throwable -> L4e5
            r1 = 1864(0x748, float:2.612E-42)
        L353:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L359;
                case 47384: goto L4ce;
                case 47417: goto L363;
                case 47483: goto L35f;
                default: goto L358;
            }     // Catch: java.lang.Throwable -> L4e5
        L358:
            goto L353
        L359:
            if (r4 == 0) goto L35f
            r1 = 48736(0xbe60, float:6.8294E-41)
            goto L353
        L35f:
            r1 = 48705(0xbe41, float:6.825E-41)
            goto L353
        L363:
            r6 = r0
            goto L1bb
        L366:
            if (r4 < r2) goto L347
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L33f
        L36c:
            androidx.activity.C1064.m372(r8, r10)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4e5
            r6.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            r0 = 0
            androidx.customview.C1074.m1119(r6, r0)     // Catch: java.lang.Throwable -> L4e5
            int r0 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 70
            int r0 = m7354(r14, r0)     // Catch: java.lang.Throwable -> L4e5
            int r2 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Throwable -> L4e5
            r2 = r2 ^ (-448(0xfffffffffffffe40, float:NaN))
            int r2 = m7354(r14, r2)     // Catch: java.lang.Throwable -> L4e5
            int r4 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L4e5
            r4 = r4 ^ 370(0x172, float:5.18E-43)
            int r9 = m7354(r14, r4)     // Catch: java.lang.Throwable -> L4e5
            int r4 = m7354(r14, r4)     // Catch: java.lang.Throwable -> L4e5
            androidx.drawerlayout.C1077.m1314(r6, r0, r2, r9, r4)     // Catch: java.lang.Throwable -> L4e5
            android.widget.TextView r9 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4e5
            r9.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L4e5
            r2 = 2747(0xabb, float:3.85E-42)
            int r4 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L4e5
            r4 = r4 ^ (-239(0xffffffffffffff11, float:NaN))
            r10 = 1431(0x597, float:2.005E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8576(r0, r2, r4, r10)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.process.C1087.m1946(r9, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = 1098907648(0x41800000, float:16.0)
            androidx.vectordrawable.animated.C1102.m3105(r9, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = -118952(0xfffffffffffe2f58, float:NaN)
            int r2 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ r2
            kevin.fun.hook.webdav.C1118.m8517(r9, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = 0
            r2 = 1
            androidx.lifecycle.livedata.C1085.m1833(r9, r0, r2)     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ 157(0x9d, float:2.2E-43)
            androidx.documentfile.C1076.m1233(r9, r0)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4e5
            r2 = 0
            r4 = -2
            r10 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r10)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1085.m1822(r9, r0)     // Catch: java.lang.Throwable -> L4e5
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda7 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda7     // Catch: java.lang.Throwable -> L4e5
            r2 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1086.m1916(r9, r0)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r6, r9)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r8, r6)     // Catch: java.lang.Throwable -> L4e5
            androidx.annotation.experimental.C1067.m579(r7, r8)     // Catch: java.lang.Throwable -> L4e5
            androidx.viewpager.C1108.m3545(r5, r7)     // Catch: java.lang.Throwable -> L4e5
            int r0 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L4e5
            r0 = r0 ^ (-421(0xfffffffffffffe5b, float:NaN))
            int r0 = m7354(r14, r0)     // Catch: java.lang.Throwable -> L4e5
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L4e5
            androidx.loader.C1096.m2641(r8, r0)     // Catch: java.lang.Throwable -> L4e5
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r8)     // Catch: java.lang.Throwable -> L4e5
            r1 = 0
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1094.m2503(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            r2 = -820(0xfffffffffffffccc, double:NaN)
            int r1 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L4e5
            long r6 = (long) r1     // Catch: java.lang.Throwable -> L4e5
            long r2 = r2 ^ r6
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)     // Catch: java.lang.Throwable -> L4e5
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator     // Catch: java.lang.Throwable -> L4e5
            r1.<init>()     // Catch: java.lang.Throwable -> L4e5
            android.view.ViewPropertyAnimator r0 = androidx.emoji2.viewsintegration.C1078.m1396(r0, r1)     // Catch: java.lang.Throwable -> L4e5
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)     // Catch: java.lang.Throwable -> L4e5
            kevin.fun.hook.audio.C1114.m7909(r5)     // Catch: java.lang.Throwable -> L4e5
            r0 = 48891(0xbefb, float:6.8511E-41)
        L41d:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L425;
                case 503: goto L43a;
                default: goto L424;
            }
        L424:
            goto L41d
        L425:
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
            r0 = 51588(0xc984, float:7.229E-41)
        L42c:
            r2 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto L434;
                case 54: goto L510;
                case 87: goto L524;
                case 116: goto L515;
                default: goto L433;
            }
        L433:
            goto L42c
        L434:
            if (r1 < 0) goto L510
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L42c
        L43a:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L41d
        L43e:
            r0 = 0
            r12 = r9[r4]     // Catch: java.lang.Throwable -> L4e5
            r2 = 49666(0xc202, float:6.9597E-41)
        L444:
            r13 = 49683(0xc213, float:6.9621E-41)
            r2 = r2 ^ r13
            switch(r2) {
                case 17: goto L44c;
                case 50: goto L452;
                case 76: goto L456;
                case 83: goto L457;
                default: goto L44b;
            }     // Catch: java.lang.Throwable -> L4e5
        L44b:
            goto L444
        L44c:
            if (r4 != r6) goto L452
            r2 = 49759(0xc25f, float:6.9727E-41)
            goto L444
        L452:
            r2 = 49728(0xc240, float:6.9684E-41)
            goto L444
        L456:
            r0 = 1
        L457:
            android.widget.LinearLayout r0 = m7356(r14, r12, r0)     // Catch: java.lang.Throwable -> L4e5
            androidx.emoji2.viewsintegration.C1078.m1429(r11, r0)     // Catch: java.lang.Throwable -> L4e5
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda6 r2 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda6     // Catch: java.lang.Throwable -> L4e5
            r2.<init>(r11, r4, r1)     // Catch: java.lang.Throwable -> L4e5
            com.tencent.mmkv.C1109.m3617(r0, r2)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r10, r0)     // Catch: java.lang.Throwable -> L4e5
            int r2 = r9.length     // Catch: java.lang.Throwable -> L4e5
            int r12 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L4e5
            r0 = 49790(0xc27e, float:6.977E-41)
        L46f:
            r13 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r13
            switch(r0) {
                case 18: goto L477;
                case 51: goto L4b6;
                case 84: goto L484;
                case 241: goto L47b;
                default: goto L476;
            }     // Catch: java.lang.Throwable -> L4e5
        L476:
            goto L46f
        L477:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L46f
        L47b:
            r0 = r12 ^ (-654(0xfffffffffffffd72, float:NaN))
            int r0 = r0 + r2
            if (r4 >= r0) goto L477
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L46f
        L484:
            android.view.View r0 = new android.view.View     // Catch: java.lang.Throwable -> L4e5
            r0.<init>(r14)     // Catch: java.lang.Throwable -> L4e5
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4e5
            r12 = 1056964608(0x3f000000, float:0.5)
            int r12 = m7365(r14, r12)     // Catch: java.lang.Throwable -> L4e5
            int r13 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Throwable -> L4e5
            r13 = r13 ^ 226(0xe2, float:3.17E-43)
            r2.<init>(r13, r12)     // Catch: java.lang.Throwable -> L4e5
            androidx.lifecycle.livedata.C1085.m1843(r0, r2)     // Catch: java.lang.Throwable -> L4e5
            r2 = -986115(0xfffffffffff0f3fd, float:NaN)
            int r12 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L4e5
            r2 = r2 ^ r12
            androidx.loader.C1099.m2849(r0, r2)     // Catch: java.lang.Throwable -> L4e5
            androidx.activity.C1064.m372(r10, r0)     // Catch: java.lang.Throwable -> L4e5
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L4aa:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto L4b2;
                case 1711: goto L4b6;
                default: goto L4b1;
            }
        L4b1:
            goto L4aa
        L4b2:
            r0 = 50596(0xc5a4, float:7.09E-41)
            goto L4aa
        L4b6:
            int r0 = kevin.fun.hook.audio.C1117.f406
            r0 = r0 ^ 72
            int r2 = r4 + r0
            r0 = 50689(0xc601, float:7.103E-41)
        L4bf:
            r4 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 19: goto L4c7;
                case 50: goto L4cb;
                default: goto L4c6;
            }
        L4c6:
            goto L4bf
        L4c7:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L4bf
        L4cb:
            r4 = r2
            goto L33b
        L4ce:
            int r1 = androidx.activity.C1065.f91
            r1 = r1 ^ (-54)
            int r1 = r1 + r0
            r0 = 50813(0xc67d, float:7.1204E-41)
        L4d6:
            r4 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 18: goto L4de;
                case 243: goto L4e1;
                default: goto L4dd;
            }
        L4dd:
            goto L4d6
        L4de:
            r0 = r1
            goto L19d
        L4e1:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L4d6
        L4e5:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7367()
            r3 = 2749(0xabd, float:3.852E-42)
            int r4 = androidx.activity.C1063.f89
            r4 = r4 ^ 39
            r5 = 2051(0x803, float:2.874E-42)
            java.lang.String r2 = org.luckypray.dexkit.C1123.m10510(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
            goto L425
        L510:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L42c
        L515:
            java.lang.String r0 = "jtXVrgj8JcLnOHGobELTFSKqRVVUe"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L524:
            return
    }

    private static void showResult(android.app.Activity r2, boolean r3, java.lang.String r4) {
            android.os.Handler r0 = m7363()
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda12 r1 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda12
            r1.<init>(r2, r3, r4)
            androidx.activity.C1062.m178(r0, r1)
            int r1 = androidx.interpolator.C1083.m1725()
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
            java.lang.String r0 = "rII"
            java.lang.String r0 = androidx.drawerlayout.C1077.m1328(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2f:
            return
    }

    public static void showSparkManageDialog(android.content.Context r13) {
            android.app.Dialog r2 = new android.app.Dialog     // Catch: java.lang.Throwable -> L4df
            r0 = 16973913(0x1030059, float:2.406115E-38)
            int r1 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ r1
            r2.<init>(r13, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = 1
            androidx.lifecycle.runtime.C1092.m2297(r2, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = 1
            androidx.emoji2.C1080.m1555(r2, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.FrameLayout r3 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L4df
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            int r1 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L4df
            r1 = r1 ^ 601(0x259, float:8.42E-43)
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1091.m2273(r3, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = 2147483525(0x7fffff85, float:NaN)
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ r4
            androidx.lifecycle.livedata.C1084.m1783(r3, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4df
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            r0 = 1
            androidx.customview.C1074.m1119(r4, r0)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1855(r4, r1)     // Catch: java.lang.Throwable -> L4df
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            int r5 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L4df
            r5 = r5 ^ (-528(0xfffffffffffffdf0, float:NaN))
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L4df
            r6 = 80
            r0.gravity = r6     // Catch: java.lang.Throwable -> L4df
            androidx.vectordrawable.C1105.m3296(r4, r0)     // Catch: java.lang.Throwable -> L4df
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L4df
            r0.<init>()     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1879(r0, r1)     // Catch: java.lang.Throwable -> L4df
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L4df
            r1 = r1 ^ 665(0x299, float:9.32E-43)
            r6 = 8
            float[] r6 = new float[r6]     // Catch: java.lang.Throwable -> L4df
            r7 = 0
            int r8 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L4df
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            r7 = 1
            int r8 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L4df
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            r7 = 2
            int r8 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L4df
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            r7 = 3
            int r8 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L4df
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            r7 = 4
            r8 = 0
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            r7 = 5
            r8 = 0
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            r7 = 6
            r8 = 0
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            r7 = 7
            r8 = 0
            r6[r7] = r8     // Catch: java.lang.Throwable -> L4df
            androidx.vectordrawable.C1103.m3187(r0, r6)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1065.m397(r4, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            r6 = 0
            androidx.customview.C1074.m1119(r0, r6)     // Catch: java.lang.Throwable -> L4df
            int r6 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L4df
            r6 = r6 ^ 374(0x176, float:5.24E-43)
            androidx.emoji2.C1080.m1542(r0, r6)     // Catch: java.lang.Throwable -> L4df
            int r7 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            int r8 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            int r1 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            int r9 = androidx.loader.C1098.f124     // Catch: java.lang.Throwable -> L4df
            r9 = r9 ^ (-815(0xfffffffffffffcd1, float:NaN))
            int r9 = m7354(r13, r9)     // Catch: java.lang.Throwable -> L4df
            androidx.drawerlayout.C1077.m1314(r0, r7, r8, r1, r9)     // Catch: java.lang.Throwable -> L4df
            android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4df
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            short[] r7 = m7367()     // Catch: java.lang.Throwable -> L4df
            r8 = 2786(0xae2, float:3.904E-42)
            int r9 = androidx.lifecycle.livedata.C1086.f112     // Catch: java.lang.Throwable -> L4df
            r9 = r9 ^ 957(0x3bd, float:1.341E-42)
            r10 = 1090(0x442, float:1.527E-42)
            java.lang.String r7 = kevin.fun.hook.C1120.m8645(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1087.m1946(r1, r7)     // Catch: java.lang.Throwable -> L4df
            r7 = 1101004800(0x41a00000, float:20.0)
            androidx.vectordrawable.animated.C1102.m3105(r1, r7)     // Catch: java.lang.Throwable -> L4df
            r7 = 0
            r8 = 1
            androidx.lifecycle.livedata.C1085.m1833(r1, r7, r8)     // Catch: java.lang.Throwable -> L4df
            r7 = -13421702(0xffffffffff33337a, float:-2.381991E38)
            int r8 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L4df
            r7 = r7 ^ r8
            kevin.fun.hook.webdav.C1118.m8517(r1, r7)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r8, r5, r9)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1822(r1, r7)     // Catch: java.lang.Throwable -> L4df
            android.widget.TextView r5 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4df
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            short[] r7 = m7367()     // Catch: java.lang.Throwable -> L4df
            r8 = 2790(0xae6, float:3.91E-42)
            int r9 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L4df
            r9 = r9 ^ 80
            r10 = 1214(0x4be, float:1.701E-42)
            java.lang.String r7 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1087.m1946(r5, r7)     // Catch: java.lang.Throwable -> L4df
            r7 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r7)     // Catch: java.lang.Throwable -> L4df
            r7 = 119760(0x1d3d0, float:1.6782E-40)
            int r8 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L4df
            r7 = r7 ^ r8
            kevin.fun.hook.webdav.C1118.m8517(r5, r7)     // Catch: java.lang.Throwable -> L4df
            r7 = 0
            r8 = 1
            androidx.lifecycle.livedata.C1085.m1833(r5, r7, r8)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda19 r7 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda19     // Catch: java.lang.Throwable -> L4df
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1086.m1916(r5, r7)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r0, r1)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r0, r5)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4df
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            r0 = 0
            androidx.customview.C1074.m1119(r5, r0)     // Catch: java.lang.Throwable -> L4df
            androidx.emoji2.C1080.m1542(r5, r6)     // Catch: java.lang.Throwable -> L4df
            int r0 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ (-444(0xfffffffffffffe44, float:NaN))
            int r1 = m7354(r13, r0)     // Catch: java.lang.Throwable -> L4df
            int r6 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L4df
            r6 = r6 ^ (-616(0xfffffffffffffd98, float:NaN))
            int r7 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L4df
            int r0 = m7354(r13, r0)     // Catch: java.lang.Throwable -> L4df
            int r6 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L4df
            androidx.drawerlayout.C1077.m1314(r5, r1, r7, r0, r6)     // Catch: java.lang.Throwable -> L4df
            android.graphics.drawable.Drawable r0 = m7401(r13)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1065.m397(r5, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4df
            r6.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            r0 = 0
            androidx.customview.C1074.m1119(r6, r0)     // Catch: java.lang.Throwable -> L4df
            int r0 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ 660(0x294, float:9.25E-43)
            androidx.emoji2.C1080.m1542(r6, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r1 = 0
            int r7 = androidx.core.ktx.C1071.f97     // Catch: java.lang.Throwable -> L4df
            r7 = r7 ^ (-900(0xfffffffffffffc7c, float:NaN))
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r7, r8)     // Catch: java.lang.Throwable -> L4df
            androidx.vectordrawable.C1105.m3296(r6, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.TextView r7 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4df
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L4df
            r1 = 2792(0xae8, float:3.912E-42)
            int r8 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L4df
            r8 = r8 ^ 355(0x163, float:4.97E-43)
            r9 = 2656(0xa60, float:3.722E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r1, r8, r9)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1087.m1946(r7, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r7, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = -13422530(0xffffffffff33303e, float:-2.381823E38)
            int r1 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r7, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r1 = 0
            int r8 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L4df
            r8 = r8 ^ (-646(0xfffffffffffffd7a, float:NaN))
            r9 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r8, r9)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1822(r7, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.Switch r8 = new android.widget.Switch     // Catch: java.lang.Throwable -> L4df
            r8.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L4df
            r1 = 2797(0xaed, float:3.92E-42)
            int r9 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L4df
            r9 = r9 ^ 286(0x11e, float:4.01E-43)
            r10 = 2523(0x9db, float:3.535E-42)
            java.lang.String r0 = androidx.activity.C1066.m468(r0, r1, r9, r10)     // Catch: java.lang.Throwable -> L4df
            r1 = 0
            boolean r9 = kevin.fun.hook.audio.C1114.m7905(r0, r1)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1089.m2130(r8, r9)     // Catch: java.lang.Throwable -> L4df
            r0 = 1616(0x650, float:2.264E-42)
        L1c9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1cf;
                case 49: goto L1d2;
                case 204: goto L1d7;
                case 239: goto L1e5;
                default: goto L1ce;
            }     // Catch: java.lang.Throwable -> L4df
        L1ce:
            goto L1c9
        L1cf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1c9
        L1d2:
            if (r9 == 0) goto L1cf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1c9
        L1d7:
            r0 = -119723(0xfffffffffffe2c55, float:NaN)
            r1 = 1740(0x6cc, float:2.438E-42)
        L1dc:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L1e2;
                case 54: goto L1e8;
                default: goto L1e1;
            }     // Catch: java.lang.Throwable -> L4df
        L1e1:
            goto L1dc
        L1e2:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1dc
        L1e5:
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
        L1e8:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)     // Catch: java.lang.Throwable -> L4df
            androidx.emoji2.viewsintegration.C1079.m1472(r8, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = 1864(0x748, float:2.612E-42)
        L1f1:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L1f7;
                case 47384: goto L2c6;
                case 47417: goto L201;
                case 47483: goto L1fd;
                default: goto L1f6;
            }     // Catch: java.lang.Throwable -> L4df
        L1f6:
            goto L1f1
        L1f7:
            if (r9 == 0) goto L1fd
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L1f1
        L1fd:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L1f1
        L201:
            r0 = 872295509(0x33fe2c55, float:1.1835861E-7)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L207:
            r9 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r9
            switch(r1) {
                case 14: goto L20f;
                case 239: goto L2c1;
                default: goto L20e;
            }     // Catch: java.lang.Throwable -> L4df
        L20e:
            goto L207
        L20f:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.webdav.C1118.m8476(r8, r0)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda20 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda20     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L4df
            androidx.core.C1073.m989(r8, r0)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r6, r7)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r6, r8)     // Catch: java.lang.Throwable -> L4df
            android.view.View r7 = new android.view.View     // Catch: java.lang.Throwable -> L4df
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r1 = 1
            int r1 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            int r8 = androidx.interpolator.C1081.f107     // Catch: java.lang.Throwable -> L4df
            r8 = r8 ^ (-273(0xfffffffffffffeef, float:NaN))
            int r8 = m7354(r13, r8)     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1843(r7, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = -1118564(0xffffffffffeeee9c, float:NaN)
            int r1 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ r1
            androidx.loader.C1099.m2849(r7, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4df
            r8.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            r0 = 0
            androidx.customview.C1074.m1119(r8, r0)     // Catch: java.lang.Throwable -> L4df
            int r0 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ (-4)
            androidx.emoji2.C1080.m1542(r8, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r1 = 0
            int r9 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L4df
            r9 = r9 ^ (-374(0xfffffffffffffe8a, float:NaN))
            r10 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r9, r10)     // Catch: java.lang.Throwable -> L4df
            androidx.vectordrawable.C1105.m3296(r8, r0)     // Catch: java.lang.Throwable -> L4df
            int r0 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ (-102(0xffffffffffffff9a, float:NaN))
            int r0 = m7354(r13, r0)     // Catch: java.lang.Throwable -> L4df
            r1 = 0
            r9 = 0
            r10 = 0
            androidx.drawerlayout.C1077.m1314(r8, r0, r1, r9, r10)     // Catch: java.lang.Throwable -> L4df
            android.widget.TextView r9 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4df
            r9.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            short[] r0 = m7367()     // Catch: java.lang.Throwable -> L4df
            r1 = 2815(0xaff, float:3.945E-42)
            int r10 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> L4df
            r10 = r10 ^ (-21)
            r11 = 3190(0xc76, float:4.47E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r1, r10, r11)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1087.m1946(r9, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r9, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = -13421727(0xffffffffff333361, float:-2.3819859E38)
            int r1 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L4df
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r9, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r1 = 0
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r10, r11)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1822(r9, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.Switch r10 = new android.widget.Switch     // Catch: java.lang.Throwable -> L4df
            r10.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            boolean r11 = m7411()     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1089.m2130(r10, r11)     // Catch: java.lang.Throwable -> L4df
            r0 = 48891(0xbefb, float:6.8511E-41)
        L2b5:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L2bd;
                case 53: goto L2e3;
                case 503: goto L2cb;
                case 32495: goto L2d1;
                default: goto L2bc;
            }     // Catch: java.lang.Throwable -> L4df
        L2bc:
            goto L2b5
        L2bd:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L2b5
        L2c1:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L207
        L2c6:
            r0 = 869059788(0x33cccccc, float:9.5367426E-8)
            goto L20f
        L2cb:
            if (r11 == 0) goto L2bd
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L2b5
        L2d1:
            r0 = -119723(0xfffffffffffe2c55, float:NaN)
            r1 = 49666(0xc202, float:6.9597E-41)
        L2d7:
            r12 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r12
            switch(r1) {
                case 17: goto L2df;
                case 50: goto L2e6;
                default: goto L2de;
            }     // Catch: java.lang.Throwable -> L4df
        L2de:
            goto L2d7
        L2df:
            r1 = 49697(0xc221, float:6.964E-41)
            goto L2d7
        L2e3:
            r0 = -3355444(0xffffffffffcccccc, float:NaN)
        L2e6:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)     // Catch: java.lang.Throwable -> L4df
            androidx.emoji2.viewsintegration.C1079.m1472(r10, r0)     // Catch: java.lang.Throwable -> L4df
            r0 = 49790(0xc27e, float:6.977E-41)
        L2f0:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto L2f8;
                case 51: goto L314;
                case 84: goto L302;
                case 241: goto L2fc;
                default: goto L2f7;
            }     // Catch: java.lang.Throwable -> L4df
        L2f7:
            goto L2f0
        L2f8:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L2f0
        L2fc:
            if (r11 == 0) goto L2f8
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L2f0
        L302:
            r0 = 872295509(0x33fe2c55, float:1.1835861E-7)
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L308:
            r11 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r11
            switch(r1) {
                case 497: goto L310;
                case 1711: goto L317;
                default: goto L30f;
            }     // Catch: java.lang.Throwable -> L4df
        L30f:
            goto L308
        L310:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L308
        L314:
            r0 = 869059788(0x33cccccc, float:9.5367426E-8)
        L317:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.webdav.C1118.m8476(r10, r0)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda1 r0 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r10, r2, r13)     // Catch: java.lang.Throwable -> L4df
            androidx.core.C1073.m989(r10, r0)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r8, r9)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r8, r10)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r5, r7)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r5, r8)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r4, r5)     // Catch: java.lang.Throwable -> L4df
            android.view.View r0 = new android.view.View     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r5 = 1056964608(0x3f000000, float:0.5)
            int r5 = m7365(r13, r5)     // Catch: java.lang.Throwable -> L4df
            int r6 = androidx.vectordrawable.C1105.f131     // Catch: java.lang.Throwable -> L4df
            r6 = r6 ^ (-359(0xfffffffffffffe99, float:NaN))
            r1.<init>(r6, r5)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1843(r0, r1)     // Catch: java.lang.Throwable -> L4df
            r1 = -1119126(0xffffffffffeeec6a, float:NaN)
            int r5 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L4df
            r1 = r1 ^ r5
            androidx.loader.C1099.m2849(r0, r1)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            r1 = 1
            androidx.customview.C1074.m1119(r0, r1)     // Catch: java.lang.Throwable -> L4df
            int r1 = kevin.fun.hook.audio.C1117.f406     // Catch: java.lang.Throwable -> L4df
            r1 = r1 ^ 88
            androidx.emoji2.C1080.m1542(r0, r1)     // Catch: java.lang.Throwable -> L4df
            int r1 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L4df
            r1 = r1 ^ (-95)
            int r1 = m7354(r13, r1)     // Catch: java.lang.Throwable -> L4df
            int r5 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L4df
            r5 = r5 ^ 814(0x32e, float:1.14E-42)
            int r5 = m7354(r13, r5)     // Catch: java.lang.Throwable -> L4df
            int r6 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L4df
            r6 = r6 ^ 627(0x273, float:8.79E-43)
            int r6 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L4df
            int r7 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L4df
            r7 = r7 ^ (-126(0xffffffffffffff82, float:NaN))
            int r7 = m7354(r13, r7)     // Catch: java.lang.Throwable -> L4df
            androidx.drawerlayout.C1077.m1314(r0, r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L4df
            android.widget.TextView r1 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4df
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            m7406(r1)     // Catch: java.lang.Throwable -> L4df
            r5 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r1, r5)     // Catch: java.lang.Throwable -> L4df
            r5 = -6711147(0xffffffffff999895, float:NaN)
            int r6 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L4df
            r5 = r5 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r1, r5)     // Catch: java.lang.Throwable -> L4df
            int r5 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L4df
            r5 = r5 ^ 357(0x165, float:5.0E-43)
            androidx.documentfile.C1076.m1233(r1, r5)     // Catch: java.lang.Throwable -> L4df
            int r5 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L4df
            r5 = r5 ^ 522(0x20a, float:7.31E-43)
            androidx.activity.C1066.m470(r1, r5)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r0, r1)     // Catch: java.lang.Throwable -> L4df
            android.widget.TextView r5 = new android.widget.TextView     // Catch: java.lang.Throwable -> L4df
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            short[] r6 = m7367()     // Catch: java.lang.Throwable -> L4df
            r7 = 2822(0xb06, float:3.954E-42)
            int r8 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L4df
            r8 = r8 ^ 253(0xfd, float:3.55E-43)
            r9 = 611(0x263, float:8.56E-43)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.process.C1087.m1946(r5, r6)     // Catch: java.lang.Throwable -> L4df
            r6 = 1092616192(0x41200000, float:10.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r6)     // Catch: java.lang.Throwable -> L4df
            r6 = -4474738(0xffffffffffbbb88e, float:NaN)
            int r7 = androidx.activity.C1066.f92     // Catch: java.lang.Throwable -> L4df
            r6 = r6 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r5, r6)     // Catch: java.lang.Throwable -> L4df
            int r6 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L4df
            r6 = r6 ^ (-117(0xffffffffffffff8b, float:NaN))
            androidx.documentfile.C1076.m1233(r5, r6)     // Catch: java.lang.Throwable -> L4df
            int r6 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L4df
            r6 = r6 ^ (-367(0xfffffffffffffe91, float:NaN))
            androidx.activity.C1066.m470(r5, r6)     // Catch: java.lang.Throwable -> L4df
            r7 = 0
            int r6 = m7354(r13, r6)     // Catch: java.lang.Throwable -> L4df
            r8 = 0
            r9 = 0
            kevin.fun.hook.audio.C1117.m8126(r5, r7, r6, r8, r9)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r0, r5)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L4df
            android.view.View r0 = new android.view.View     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            r6 = 1056964608(0x3f000000, float:0.5)
            int r6 = m7365(r13, r6)     // Catch: java.lang.Throwable -> L4df
            int r7 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L4df
            r7 = r7 ^ 487(0x1e7, float:6.82E-43)
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L4df
            androidx.lifecycle.livedata.C1085.m1843(r0, r5)     // Catch: java.lang.Throwable -> L4df
            r5 = 1118564(0x111164, float:1.567442E-39)
            int r6 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L4df
            r5 = r5 ^ r6
            androidx.loader.C1099.m2849(r0, r5)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L4df
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4df
            r0.<init>()     // Catch: java.lang.Throwable -> L4df
            android.content.res.Resources r5 = androidx.emoji2.viewsintegration.C1078.m1401(r13)     // Catch: java.lang.Throwable -> L4df
            android.util.DisplayMetrics r5 = androidx.activity.C1062.m159(r5)     // Catch: java.lang.Throwable -> L4df
            int r5 = androidx.loader.C1096.m2662(r5)     // Catch: java.lang.Throwable -> L4df
            double r6 = (double) r5     // Catch: java.lang.Throwable -> L4df
            r8 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            double r6 = r6 * r8
            int r5 = (int) r6     // Catch: java.lang.Throwable -> L4df
            android.widget.ScrollView r6 = new android.widget.ScrollView     // Catch: java.lang.Throwable -> L4df
            r6.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L4df
            int r8 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L4df
            r8 = r8 ^ 452(0x1c4, float:6.33E-43)
            r7.<init>(r8, r5)     // Catch: java.lang.Throwable -> L4df
            androidx.appcompat.resources.C1068.m659(r6, r7)     // Catch: java.lang.Throwable -> L4df
            r5 = 0
            org.luckypray.dexkit.C1125.m10608(r6, r5)     // Catch: java.lang.Throwable -> L4df
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L4df
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L4df
            r7 = 1
            androidx.customview.C1074.m1119(r5, r7)     // Catch: java.lang.Throwable -> L4df
            int r7 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L4df
            r7 = r7 ^ 66
            int r8 = m7354(r13, r7)     // Catch: java.lang.Throwable -> L4df
            r9 = 0
            int r10 = m7354(r13, r7)     // Catch: java.lang.Throwable -> L4df
            int r7 = m7354(r13, r7)     // Catch: java.lang.Throwable -> L4df
            androidx.drawerlayout.C1077.m1314(r5, r8, r9, r10, r7)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda2 r7 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L4df
            r7.<init>(r5, r0, r1, r13)     // Catch: java.lang.Throwable -> L4df
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r7)     // Catch: java.lang.Throwable -> L4df
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L4df
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()     // Catch: java.lang.Throwable -> L4df
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.SparkRenewHelper$5 r1 = new kevin.fun.hook.SparkRenewHelper$5     // Catch: java.lang.Throwable -> L4df
            r1.<init>(r2, r7, r0)     // Catch: java.lang.Throwable -> L4df
            r8 = -5118(0xffffffffffffec02, double:NaN)
            int r7 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L4df
            long r10 = (long) r7     // Catch: java.lang.Throwable -> L4df
            long r8 = r8 ^ r10
            androidx.loader.C1095.m2588(r0, r1, r8)     // Catch: java.lang.Throwable -> L4df
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3729(r6, r5)     // Catch: java.lang.Throwable -> L4df
            androidx.activity.C1064.m372(r4, r6)     // Catch: java.lang.Throwable -> L4df
            androidx.annotation.experimental.C1067.m579(r3, r4)     // Catch: java.lang.Throwable -> L4df
            androidx.viewpager.C1108.m3545(r2, r3)     // Catch: java.lang.Throwable -> L4df
            int r5 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L4df
            r5 = r5 ^ 788(0x314, float:1.104E-42)
            int r5 = m7354(r13, r5)     // Catch: java.lang.Throwable -> L4df
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L4df
            androidx.loader.C1096.m2641(r4, r5)     // Catch: java.lang.Throwable -> L4df
            android.view.ViewPropertyAnimator r4 = androidx.annotation.experimental.C1067.m594(r4)     // Catch: java.lang.Throwable -> L4df
            r5 = 0
            android.view.ViewPropertyAnimator r4 = androidx.loader.C1094.m2503(r4, r5)     // Catch: java.lang.Throwable -> L4df
            r6 = -204(0xffffffffffffff34, double:NaN)
            int r5 = androidx.viewpager.C1108.f134     // Catch: java.lang.Throwable -> L4df
            long r8 = (long) r5     // Catch: java.lang.Throwable -> L4df
            long r6 = r6 ^ r8
            android.view.ViewPropertyAnimator r4 = androidx.loader.C1099.m2899(r4, r6)     // Catch: java.lang.Throwable -> L4df
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator     // Catch: java.lang.Throwable -> L4df
            r5.<init>()     // Catch: java.lang.Throwable -> L4df
            android.view.ViewPropertyAnimator r4 = androidx.emoji2.viewsintegration.C1078.m1396(r4, r5)     // Catch: java.lang.Throwable -> L4df
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r4)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda3 r4 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> L4df
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L4df
            androidx.emoji2.viewsintegration.C1079.m1483(r3, r4)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda4 r3 = new kevin.fun.hook.SparkRenewHelper$$ExternalSyntheticLambda4     // Catch: java.lang.Throwable -> L4df
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L4df
            org.luckypray.dexkit.C1123.m10487(r2, r3)     // Catch: java.lang.Throwable -> L4df
            kevin.fun.hook.audio.C1114.m7909(r2)     // Catch: java.lang.Throwable -> L4df
            r0 = 50689(0xc601, float:7.103E-41)
        L4d3:
            r1 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 19: goto L4db;
                case 50: goto L508;
                default: goto L4da;
            }
        L4da:
            goto L4d3
        L4db:
            r0 = 50720(0xc620, float:7.1074E-41)
            goto L4d3
        L4df:
            r0 = move-exception
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2254(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7367()
            r3 = 2836(0xb14, float:3.974E-42)
            int r4 = androidx.emoji2.viewsintegration.C1078.f104
            r4 = r4 ^ 582(0x246, float:8.16E-43)
            r5 = 1612(0x64c, float:2.259E-42)
            java.lang.String r2 = androidx.vectordrawable.C1103.m3132(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7397(r0)
        L508:
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 50813(0xc67d, float:7.1204E-41)
        L50f:
            r2 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L517;
                case 53: goto L530;
                case 243: goto L51b;
                case 4075: goto L521;
                default: goto L516;
            }
        L516:
            goto L50f
        L517:
            r0 = 50875(0xc6bb, float:7.1291E-41)
            goto L50f
        L51b:
            if (r1 > 0) goto L517
            r0 = 51557(0xc965, float:7.2247E-41)
            goto L50f
        L521:
            java.lang.String r0 = "UX9AljZuBcb3"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L530:
            return
    }

    private static void updateOptionSelectedState(android.widget.LinearLayout r7, boolean r8) {
            r6 = 1
            r5 = 0
            r3 = -119723(0xfffffffffffe2c55, float:NaN)
            android.view.View r0 = androidx.activity.C1066.m494(r7, r5)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.View r1 = androidx.activity.C1066.m494(r7, r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 1616(0x650, float:2.264E-42)
        L13:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L21;
                case 239: goto L3e;
                default: goto L18;
            }
        L18:
            goto L13
        L19:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r8 == 0) goto L19
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            r2 = 1740(0x6cc, float:2.438E-42)
        L23:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L29;
                case 54: goto L2c;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L23
        L2c:
            r2 = r3
        L2d:
            kevin.fun.hook.webdav.C1118.m8517(r0, r2)
            r0 = 1864(0x748, float:2.612E-42)
        L32:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L38;
                case 47384: goto L8f;
                case 47417: goto L46;
                case 47483: goto L42;
                default: goto L37;
            }
        L37:
            goto L32
        L38:
            if (r8 == 0) goto L42
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L32
        L3e:
            r2 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            goto L2d
        L42:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L32
        L46:
            short[] r0 = m7367()
            r2 = 2869(0xb35, float:4.02E-42)
            r4 = 864(0x360, float:1.211E-42)
            java.lang.String r0 = androidx.vectordrawable.C1105.m3247(r0, r2, r6, r4)
            androidx.lifecycle.process.C1087.m1946(r1, r0)
            r0 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r1, r0)
            kevin.fun.hook.webdav.C1118.m8517(r1, r3)
            androidx.loader.C1095.m2596(r1, r5)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L63:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L6b;
                case 239: goto L8b;
                default: goto L6a;
            }
        L6a:
            goto L63
        L6b:
            r0 = 268436173(0x100002cd, float:2.5245707E-29)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r0 = r0 ^ r1
            java.lang.Boolean r1 = androidx.loader.C1096.m2664(r8)
            androidx.vectordrawable.C1105.m3297(r7, r0, r1)
            int r1 = androidx.versionedparcelable.C1107.m3467()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L7f:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L87;
                case 53: goto Lac;
                case 503: goto L97;
                case 32495: goto L9d;
                default: goto L86;
            }
        L86:
            goto L7f
        L87:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L7f
        L8b:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L63
        L8f:
            int r0 = androidx.core.ktx.C1071.f97
            r0 = r0 ^ 906(0x38a, float:1.27E-42)
            androidx.loader.C1095.m2596(r1, r0)
            goto L6b
        L97:
            if (r1 > 0) goto L87
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L7f
        L9d:
            java.lang.String r0 = "FX6A2r8weoJktW"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lac:
            return
    }

    private static void updateProgress(int r2, int r3, java.lang.String r4) {
            android.app.AlertDialog r1 = m7359()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L44;
                default: goto Lb;
            }
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
            android.app.AlertDialog r0 = m7359()
            boolean r1 = androidx.emoji2.viewsintegration.C1079.m1496(r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L38;
                case 500: goto L2c;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            if (r1 != 0) goto L29
            r0 = 1833(0x729, float:2.569E-42)
            goto L1e
        L29:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1e
        L2c:
            r0 = 1864(0x748, float:2.612E-42)
        L2e:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L34;
                case 47483: goto L44;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L2e
        L38:
            android.os.Handler r0 = m7404()
            kevin.fun.hook.SparkRenewHelper$1 r1 = new kevin.fun.hook.SparkRenewHelper$1
            r1.<init>(r2, r3, r4)
            androidx.activity.C1062.m178(r0, r1)
        L44:
            return
    }

    private static void updateStatsText(android.widget.TextView r5) {
            java.util.concurrent.ConcurrentHashMap r0 = m7360()
            int r3 = androidx.drawerlayout.C1077.m1305(r0)
            r0 = 0
            java.util.concurrent.ConcurrentHashMap r1 = m7360()
            java.util.Collection r1 = androidx.emoji2.viewsintegration.C1079.m1455(r1)
            java.util.Iterator r4 = androidx.interpolator.C1082.m1687(r1)
            r1 = r0
        L16:
            boolean r2 = androidx.activity.C1063.m269(r4)
            r0 = 1616(0x650, float:2.264E-42)
        L1c:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L22;
                case 49: goto L25;
                case 204: goto L2a;
                case 239: goto L59;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1c
        L25:
            if (r2 != 0) goto L22
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1c
        L2a:
            java.lang.Integer r0 = androidx.activity.C1064.m334(r3)
            java.lang.Integer r1 = androidx.activity.C1064.m334(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = androidx.drawerlayout.C1077.f103
            r3 = r3 ^ 286(0x11e, float:4.01E-43)
            r2[r3] = r0
            int r0 = androidx.lifecycle.livedata.C1085.f111
            r0 = r0 ^ 780(0x30c, float:1.093E-42)
            r2[r0] = r1
            short[] r0 = m7367()
            r1 = 2870(0xb36, float:4.022E-42)
            int r3 = androidx.activity.C1062.f88
            r3 = r3 ^ (-90)
            r4 = 3100(0xc1c, float:4.344E-42)
            java.lang.String r0 = androidx.viewpager.C1108.m3518(r0, r1, r3, r4)
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3391(r0, r2)
            androidx.lifecycle.process.C1087.m1946(r5, r0)
            return
        L59:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r4)
            kevin.fun.hook.SparkRenewHelper$SparkInfo r0 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r0
            r2 = 1740(0x6cc, float:2.438E-42)
        L61:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L67;
                case 54: goto L6c;
                case 471: goto L16;
                case 500: goto L6f;
                default: goto L66;
            }
        L66:
            goto L61
        L67:
            if (r0 == 0) goto L6c
            r2 = 1833(0x729, float:2.569E-42)
            goto L61
        L6c:
            r2 = 1802(0x70a, float:2.525E-42)
            goto L61
        L6f:
            boolean r2 = androidx.core.C1072.m931(r0)
            r0 = 1864(0x748, float:2.612E-42)
        L75:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L7b;
                case 47384: goto L16;
                case 47417: goto L85;
                case 47483: goto L81;
                default: goto L7a;
            }
        L7a:
            goto L75
        L7b:
            if (r2 == 0) goto L81
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L75
        L81:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L75
        L85:
            int r0 = androidx.emoji2.C1080.f106
            r0 = r0 ^ 376(0x178, float:5.27E-43)
            int r0 = r0 + r1
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L8d:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L95;
                case 239: goto L97;
                default: goto L94;
            }
        L94:
            goto L8d
        L95:
            r1 = r0
            goto L16
        L97:
            r1 = 48798(0xbe9e, float:6.838E-41)
            goto L8d
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7350() {
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
            java.lang.String r0 = getTodayDateString()
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

    /* JADX INFO: renamed from: ۟۠ۡۨۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7351(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
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
            kevin.fun.hook.SparkRenewHelper$SparkInfo r3 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r3
            android.widget.LinearLayout r0 = createSparkItemView(r2, r3)
        L1c:
            return r0
        L1d:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L1c;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    /* JADX INFO: renamed from: ۟۠ۧۤ۠, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicReference m7352() {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = kevin.fun.hook.SparkRenewHelper.templateMessage
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

    /* JADX INFO: renamed from: ۟ۡ۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static java.util.ArrayList m7353() {
            int r1 = androidx.versionedparcelable.C1107.m3467()
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
            java.util.ArrayList r0 = getConversationsNeedingAutoRenewal()
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

    /* JADX INFO: renamed from: ۟ۡۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m7354(java.lang.Object r2, int r3) {
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            int r0 = m93dp(r2, r3)
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

    /* JADX INFO: renamed from: ۣ۟ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static void m7355(java.lang.Object r2, boolean r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r4 = (java.lang.String) r4
            showResult(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۟ۡۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m7356(java.lang.Object r2, java.lang.Object r3, boolean r4) {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
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
            android.widget.LinearLayout r0 = createOptionRow(r2, r3, r4)
        L1c:
            return r0
        L1d:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L1c;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    /* JADX INFO: renamed from: ۣ۟ۢ۟۟, reason: not valid java name and contains not printable characters */
    public static boolean m7357(java.lang.Object r2) {
            int r1 = androidx.loader.C1095.m2562()
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
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r2
            boolean r0 = sendSparkMessage(r2)
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

    /* JADX INFO: renamed from: ۟ۢ۠۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m7358(java.lang.Object r2, java.lang.Object r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            setConversationCustomMessage(r2, r3)
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

    /* JADX INFO: renamed from: ۣ۟ۢۢۨ, reason: not valid java name and contains not printable characters */
    public static android.app.AlertDialog m7359() {
            int r1 = kevin.fun.hook.C1120.m8652()
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
            android.app.AlertDialog r0 = kevin.fun.hook.SparkRenewHelper.renewProgressDialog
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

    /* JADX INFO: renamed from: ۣ۟ۢۡۡ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.ConcurrentHashMap m7360() {
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
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
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kevin.fun.hook.SparkRenewHelper$SparkInfo> r0 = kevin.fun.hook.SparkRenewHelper.sparkConversations
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

    /* JADX INFO: renamed from: ۟ۢۤۢۨ, reason: not valid java name and contains not printable characters */
    public static long m7361(java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1099.m2876()
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
            long r0 = extractOtherUid(r3, r4)
        L18:
            return r0
        L19:
            r0 = 0
            r2 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L23;
                case 54: goto L18;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L1d
    }

    /* JADX INFO: renamed from: ۟ۢۥ۟۟, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7362(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
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
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r2, r3, r4)
        L1c:
            return r0
        L1d:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L1c;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    /* JADX INFO: renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static android.os.Handler m7363() {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            android.os.Handler r0 = getMainHandler()
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

    /* JADX INFO: renamed from: ۣ۟ۨۥۣ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean m7364() {
            int r1 = androidx.core.ktx.C1071.m854()
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
            java.util.concurrent.atomic.AtomicBoolean r0 = kevin.fun.hook.SparkRenewHelper.autoRenewTriggered
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

    /* JADX INFO: renamed from: ۣ۟ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static int m7365(java.lang.Object r2, float r3) {
            int r1 = androidx.interpolator.C1081.m1643()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            int r0 = m92dp(r2, r3)
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

    /* JADX INFO: renamed from: ۟ۤۡ۟۠, reason: not valid java name and contains not printable characters */
    public static void m7366(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.interpolator.C1081.m1643()
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
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            setConversationRandomApiType(r2, r3)
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

    /* JADX INFO: renamed from: ۟ۤۦۣۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7367() {
            int r1 = androidx.core.C1072.m980()
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
            short[] r0 = kevin.fun.hook.SparkRenewHelper.f382short
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

    /* JADX INFO: renamed from: ۟ۤۧۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7368(java.lang.Object r2) {
            int r1 = androidx.core.C1072.m980()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L39;
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
            clearConversationCustomMessage(r2)
        L19:
            int r1 = androidx.core.ktx.C1071.m854()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L38;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 > 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "ARTpFigHywK"
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L38:
            return
        L39:
            r0 = 1864(0x748, float:2.612E-42)
        L3b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L41;
                case 47483: goto L19;
                default: goto L40;
            }
        L40:
            goto L3b
        L41:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3b
    }

    /* JADX INFO: renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static long m7369(java.lang.Object r3) {
            int r1 = androidx.versionedparcelable.C1107.m3467()
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
            java.lang.String r3 = (java.lang.String) r3
            long r0 = parseOtherUidFromConversationId(r3)
        L1a:
            return r0
        L1b:
            r0 = 0
            r2 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L25;
                case 54: goto L1a;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L1f
    }

    /* JADX INFO: renamed from: ۟ۥۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m7370(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.core.ktx.C1070.m822()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            kevin.fun.hook.SparkRenewHelper$SparkInfo r3 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r3
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            showRandomApiSelectDialog(r2, r3, r4)
        L1d:
            int r1 = androidx.lifecycle.process.C1089.m2142()
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L3c;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 < 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "oJpwuQNaPDAbsizzj"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
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
                case 47483: goto L1d;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static void m7371(java.lang.Object r2, int r3, int r4, int r5) {
            int r1 = androidx.loader.C1095.m2562()
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
            android.app.Activity r2 = (android.app.Activity) r2
            showBackgroundResultToast(r2, r3, r4, r5)
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

    /* JADX INFO: renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7372(java.lang.Object r2) {
            int r1 = androidx.activity.C1066.m518()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = getRandomApiUrl(r2)
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

    /* JADX INFO: renamed from: ۟ۥۥۥۨ, reason: not valid java name and contains not printable characters */
    public static void m7373(java.lang.Object r2, boolean r3) {
            int r1 = androidx.emoji2.C1080.m1539()
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
            setConversationEnabled(r2, r3)
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

    /* JADX INFO: renamed from: ۟ۥۦۦۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.ProgressBar m7374() {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.widget.ProgressBar r0 = kevin.fun.hook.SparkRenewHelper.renewProgressBar
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

    /* JADX INFO: renamed from: ۟ۥۧۡ۠, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7375(java.lang.Object r2) {
            int r1 = androidx.interpolator.C1081.m1643()
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
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = getConversationCustomMessage(r2)
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

    /* JADX INFO: renamed from: ۟ۥۣۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7376() {
            int r1 = androidx.loader.C1098.m2793()
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
            java.lang.Object r0 = getOrInstantiateHandler()
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

    /* JADX INFO: renamed from: ۟ۥۨۦۡ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m7377() {
            int r1 = androidx.activity.C1062.m182()
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
            android.content.Context r0 = kevin.fun.hook.SparkRenewHelper.hostContext
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

    /* JADX INFO: renamed from: ۟ۦ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7378() {
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
            java.lang.Object r0 = getOrInstantiateMessage()
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

    /* JADX INFO: renamed from: ۟ۦ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7379(java.lang.Object r2) {
            int r1 = androidx.emoji2.C1080.m1539()
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
            java.lang.String r0 = getConversationRandomApiType(r2)
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

    /* JADX INFO: renamed from: ۟ۦ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.ClassLoader m7380() {
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
            java.lang.ClassLoader r0 = kevin.fun.hook.SparkRenewHelper.classLoader
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

    /* JADX INFO: renamed from: ۟ۦۤ۠۠, reason: not valid java name and contains not printable characters */
    public static void m7381(java.lang.Object r2) {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            runAutoRenewFlow(r2)
        L19:
            int r1 = androidx.loader.C1094.m2490()
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
            java.lang.String r0 = "wi6N6VFD"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            float r0 = java.lang.Float.parseFloat(r0)
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

    /* JADX INFO: renamed from: ۟ۦۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.ConcurrentHashMap m7382() {
            int r1 = androidx.customview.C1075.m1139()
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
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kevin.fun.hook.SparkRenewHelper$SparkInfo> r0 = kevin.fun.hook.SparkRenewHelper.allConversations
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

    /* JADX INFO: renamed from: ۟ۦۣۧ۟, reason: not valid java name and contains not printable characters */
    public static android.os.Handler m7383() {
            int r1 = androidx.loader.C1096.m2651()
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
            android.os.Handler r0 = kevin.fun.hook.SparkRenewHelper.mainHandler
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

    /* JADX INFO: renamed from: ۟ۦۧۥۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7384() {
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
            android.widget.TextView r0 = kevin.fun.hook.SparkRenewHelper.renewProgressText
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

    /* JADX INFO: renamed from: ۣ۟ۧۡۤ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean m7385() {
            int r1 = androidx.customview.C1074.m1071()
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
            java.util.concurrent.atomic.AtomicBoolean r0 = kevin.fun.hook.SparkRenewHelper.hooked
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

    /* JADX INFO: renamed from: ۟ۧۡۦۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7386(java.lang.Object r2) {
            int r1 = androidx.viewpager.C1108.m3542()
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
            boolean r0 = isConversationEnabled(r2)
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

    /* JADX INFO: renamed from: ۟ۧۢۢ۠, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.ConcurrentHashMap m7387() {
            int r1 = androidx.core.C1073.m1015()
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
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.String> r0 = kevin.fun.hook.SparkRenewHelper.sparkUserNameMap
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

    /* JADX INFO: renamed from: ۟ۧۢۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7388(long r2) {
            int r1 = androidx.core.ktx.C1071.m854()
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
            java.lang.String r0 = getSparkUserName(r2)
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

    /* JADX INFO: renamed from: ۠ۡۦۢ, reason: not valid java name and contains not printable characters */
    public static void m7389() {
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            dismissProgressDialog()
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

    /* JADX INFO: renamed from: ۠ۦۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7390(java.lang.Object r2) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            boolean r0 = hasRenewedToday(r2)
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

    /* JADX INFO: renamed from: ۠ۧ۟ۢ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicReference m7391() {
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
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
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = kevin.fun.hook.SparkRenewHelper.sendMsgHandlerInstance
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

    /* JADX INFO: renamed from: ۣۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m7392(boolean r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            setOnlySparkFilter(r2)
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

    /* JADX INFO: renamed from: ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7393() {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            boolean r0 = isSendReady()
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

    /* JADX INFO: renamed from: ۡۡۧۧ, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean m7394() {
            int r1 = org.luckypray.dexkit.C1123.m10509()
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
            java.util.concurrent.atomic.AtomicBoolean r0 = kevin.fun.hook.SparkRenewHelper.sendReady
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

    /* JADX INFO: renamed from: ۣۢۤ۠, reason: not valid java name and contains not printable characters */
    public static java.util.concurrent.atomic.AtomicLong m7395() {
            int r1 = org.luckypray.dexkit.C1125.m10627()
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
            java.util.concurrent.atomic.AtomicLong r0 = kevin.fun.hook.SparkRenewHelper.myUid
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

    /* JADX INFO: renamed from: ۢۨۦۨ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m7396() {
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
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
            android.widget.TextView r0 = kevin.fun.hook.SparkRenewHelper.renewTaskNameText
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

    /* JADX INFO: renamed from: ۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static void m7397(java.lang.Object r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
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
            de.robv.android.xposed.XposedBridge.log(r2)
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

    /* JADX INFO: renamed from: ۣۢۥ۠, reason: not valid java name and contains not printable characters */
    public static void m7398(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.emoji2.C1080.m1539()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            kevin.fun.hook.SparkRenewHelper$SparkInfo r3 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r3
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            showConversationCustomMsgDialog(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۤۡۥۤ, reason: not valid java name and contains not printable characters */
    public static void m7399(int r2, int r3, java.lang.Object r4) {
            int r1 = androidx.interpolator.C1083.m1725()
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
            java.lang.String r4 = (java.lang.String) r4
            updateProgress(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7400(java.lang.Object r2) {
            int r1 = androidx.activity.C1064.m377()
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
            boolean r0 = isUseCustomMessage(r2)
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

    /* JADX INFO: renamed from: ۤۥۥ۟, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m7401(java.lang.Object r2) {
            int r1 = androidx.activity.C1063.m300()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r0 = createRippleDrawable(r2)
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

    /* JADX INFO: renamed from: ۤۥۦ۠, reason: not valid java name and contains not printable characters */
    public static void m7402(java.lang.Object r2) {
            int r1 = kevin.fun.hook.C1120.m8652()
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
            saveRenewDate(r2)
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

    /* JADX INFO: renamed from: ۥ۠ۤۡ, reason: contains not printable characters */
    public static void m7403() {
            int r1 = androidx.lifecycle.process.C1088.m2011()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3b;
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
            forceWakeupAndSync()
        L17:
            int r1 = androidx.loader.C1099.m2876()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L3a;
                case 500: goto L2b;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 < 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "w8FFKOcwNFNhrNC2"
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1844(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
        L3b:
            r0 = 1864(0x748, float:2.612E-42)
        L3d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L43;
                case 47483: goto L17;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3d
    }

    /* JADX INFO: renamed from: ۥۢۤ۠, reason: contains not printable characters */
    public static android.os.Handler m7404() {
            int r1 = androidx.core.C1073.m1015()
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
            android.os.Handler r0 = kevin.fun.hook.SparkRenewHelper.MAIN_HANDLER
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

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static void m7405(java.lang.Object r2, boolean r3) {
            int r1 = androidx.viewpager.C1108.m3542()
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
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            updateOptionSelectedState(r2, r3)
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

    /* JADX INFO: renamed from: ۥۤۧۧ, reason: contains not printable characters */
    public static void m7406(java.lang.Object r2) {
            int r1 = androidx.core.C1073.m1015()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.widget.TextView r2 = (android.widget.TextView) r2
            updateStatsText(r2)
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

    /* JADX INFO: renamed from: ۥۨۤۧ, reason: contains not printable characters */
    public static java.lang.String m7407(java.lang.Object r2) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            java.lang.String r0 = getRandomApiName(r2)
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

    /* JADX INFO: renamed from: ۦۡۨۨ, reason: contains not printable characters */
    public static java.util.concurrent.atomic.AtomicReference m7408() {
            int r1 = androidx.lifecycle.process.C1091.m2283()
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
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = kevin.fun.hook.SparkRenewHelper.imSdkContextInstance
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

    /* JADX INFO: renamed from: ۧ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static void m7409(java.lang.Object r2, boolean r3) {
            int r1 = androidx.loader.C1099.m2876()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            setUseCustomMessage(r2, r3)
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

    /* JADX INFO: renamed from: ۣۧ۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m7410(java.lang.Object r2, int r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            android.app.Activity r2 = (android.app.Activity) r2
            boolean[] r4 = (boolean[]) r4
            showProgressDialogWithBackgroundButton(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۧۥۨۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7411() {
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
            boolean r0 = isOnlySparkFilter()
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

    /* JADX INFO: renamed from: ۨ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7412() {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            checkReadyState()
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

    /* JADX INFO: renamed from: ۨ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7413(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1115.m98()
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
            java.lang.String r0 = getRandomSayingText(r2)
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
}
