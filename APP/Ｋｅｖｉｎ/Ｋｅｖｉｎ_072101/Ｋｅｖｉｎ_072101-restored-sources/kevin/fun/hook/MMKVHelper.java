package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class MMKVHelper {
    private static android.content.Context appContext;
    private static volatile boolean healingMode;
    private static volatile boolean initialized;
    private static final java.lang.Object lock = null;
    private static java.lang.Object mmkv;
    private static java.lang.Class<?> mmkvClass;
    private static java.lang.String mmkvId;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f369short = null;

    static {
            r3 = 0
            r0 = 534(0x216, float:7.48E-43)
            short[] r0 = new short[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [2055, 2057, 2074, 2053, 2050, 2099, 2063, 2051, 2050, 2058, 2053, 2059, 1384, 1383, 1390, 1386, 1401, 2269, 2258, 2267, 2271, 2252, 2303, 2258, 2258, 1238, 1241, 1232, 1236, 1223, 1724, 1707, 1699, 1697, 1720, 1707, 14614, 2381, 2403, 2416, 2415, 2408, 14615, 2342, 2405, 2410, 2403, 2407, 2420, 2375, 2410, 2410, 2342, 20535, -31709, 2364, 2342, 735, 723, 722, 712, 733, 725, 722, 719, 759, 729, 709, 297, 299, 314, 271, 290, 290, 15101, 2726, 2696, 2715, 2692, 2691, 15100, 2765, 2698, 2696, 2713, 2732, 2689, 2689, 2765, 21468, -30776, 2775, 2765, 682, 683, 685, 673, 682, 683, 652, 673, 673, 674, 2274, 2275, 2277, 2281, 2274, 2275, 2261, 2290, 2292, 2287, 2280, 2273, 13651, 1288, 1318, 1333, 1322, 1325, 13650, 1379, 1316, 1318, 1335, 1281, 1338, 1335, 1318, 1328, 1379, 23666, -30618, 1304, 1857, 1830, 1852, 1911, 1910, 1904, 1916, 1911, 1910, 1879, 1916, 1894, 1905, 1919, 1910, 781, 780, 778, 774, 781, 780, 815, 773, 774, 776, 797, 1484, 1485, 1483, 1479, 1484, 1485, 1505, 1478, 1500, 1643, 1642, 1644, 1632, 1643, 1642, 1603, 1632, 1633, 1640, 262, 263, 257, 269, 262, 263, 305, 278, 272, 267, 268, 261, 15444, 3087, 3105, 3122, 3117, 3114, 15445, 3172, 3107, 3105, 3120, 3095, 3120, 3126, 3117, 3114, 3107, 3172, 21877, -32415, 3103, 2261, 2226, 2216, 13937, 1578, 1540, 1559, 1544, 1551, 13936, 1601, 8493, 1601, 1580, 1580, 1578, 1591, 1577, 1540, 1549, 1553, 1540, 1555, 1601, 21628, 24490, 21879, 22883, 22617, 1627, 1601, 2827, 2823, 2822, 2844, 2825, 2817, 2822, 2843, 2851, 2829, 2833, 1489, 1489, 1489, 1530, 1515, 1533, 1530, 1489, 1489, 1489, 2908, 2903, 2906, 2902, 2909, 2908, 1380, 1391, 1378, 1390, 1381, 1380, 15302, 2973, 2995, 2976, 3007, 3000, 15303, 3062, 2982, 2979, 2978, 2964, 2991, 2978, 2995, 2981, 3062, 21223, -30989, 2957, 1505, 1414, 1436, 2091, 2080, 2093, 2081, 2090, 2091, 2991, 2980, 2985, 2981, 2990, 2991, 2522, 2513, 2524, 2512, 2523, 2522, 1066, 1057, 1068, 1056, 1067, 1066, 953, 946, 959, 947, 952, 953, 14315, 1968, 1950, 1933, 1938, 1941, 14314, 2011, 1931, 1934, 1935, 1960, 1935, 1929, 1938, 1941, 1948, 2011, 24266, -29986, 1952, 1572, 1603, 1625, 13463, 1228, 1250, 1265, 1262, 1257, 13462, 1191, 1226, 1226, 1228, 1233, 1191, 1269, 1250, 1230, 1257, 1262, 1267, 1191, 26263, 22040, 15212, 2871, 2841, 2826, 2837, 2834, 15213, 2908, 2865, 2865, 2871, 2858, 2908, 2830, 2841, 2869, 2834, 2837, 2824, 2908, 2842, 2845, 2837, 2832, 2841, 2840, 2886, 2908, 3250, 3237, 3245, 3247, 3254, 3237, 440, 444, 1818, 1846, 1824, 1833, 1827, 1818, 1830, 1837, 1824, 1830, 1838, 13831, 1628, 1650, 1633, 1662, 1657, 13830, 1591, 8375, -2024, 1591, 1626, 1626, 1628, 1601, 1591, -30723, 28375, 24358, -29902, -1765, -29204, 22414, 22805, 22575, 13996, 1783, 1753, 1738, 1749, 1746, 13997, 1692, 8688, 1692, 1777, 1777, 1783, 1770, 1692, -30890, 28284, 22974, 22660, 1670, 1692, 1238, 1244, 1227, 1222, 3177, 3177, 3183, 3186, 3155, 3181, 3184, 3180, 3149, 3136, 14459, 2080, 2062, 2077, 2050, 2053, 14458, 2123, 12071, 2123, 2086, 2086, 2080, 2109, 2123, -30335, 26979, 20826, -31410, -2191, -29732, 23485, 21493, 18400, 18001, 2123, 2053, 2078, 2055, 2055, 13318, 1117, 1139, 1120, 1151, 1144, 13319, 1078, 9050, 1078, 1115, 1115, 1117, 1088, 1078, -31236, 25886, 23316, 23086, 1068, 1078} // fill-array
            kevin.fun.hook.MMKVHelper.f369short = r0
            kevin.fun.hook.MMKVHelper.initialized = r3
            kevin.fun.hook.MMKVHelper.healingMode = r3
            short[] r0 = m7232()
            int r1 = androidx.activity.C1064.f90
            r1 = r1 ^ 486(0x1e6, float:6.81E-43)
            r2 = 2156(0x86c, float:3.021E-42)
            java.lang.String r0 = androidx.drawerlayout.C1077.m1343(r0, r3, r1, r2)
            kevin.fun.hook.MMKVHelper.mmkvId = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            kevin.fun.hook.MMKVHelper.lock = r0
            return
    }

    public MMKVHelper() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            java.lang.String r0 = "k36yd89mNessak6DC2AkTNbNCELrM"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    public static void clear() {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L5b;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L39
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L39
            r2 = 12
            int r3 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L39
            r3 = r3 ^ 610(0x262, float:8.55E-43)
            r4 = 1291(0x50b, float:1.809E-42)
            java.lang.String r1 = androidx.loader.C1094.m2495(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L39
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L39
            m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L39
            r0 = 1740(0x6cc, float:2.438E-42)
        L30:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L36;
                case 54: goto L3a;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L30
        L39:
            r0 = move-exception
        L3a:
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1864(0x748, float:2.612E-42)
        L40:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L46;
                case 47384: goto L5b;
                case 47417: goto L50;
                case 47483: goto L4c;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            if (r1 > 0) goto L4c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L40
        L4c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L40
        L50:
            java.lang.String r0 = "FG3Df1ogmiARY4"
            java.lang.String r0 = androidx.vectordrawable.C1103.m69(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L5b:
            return
    }

    public static void clearAll() {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L91;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L39
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L39
            r2 = 17
            int r3 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L39
            r3 = r3 ^ (-61)
            r4 = 2238(0x8be, float:3.136E-42)
            java.lang.String r1 = androidx.customview.C1075.m1138(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L39
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L39
            m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L39
            r0 = 1740(0x6cc, float:2.438E-42)
        L30:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L36;
                case 54: goto L91;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L30
        L39:
            r0 = move-exception
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L60
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L60
            r2 = 25
            int r3 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L60
            r3 = r3 ^ 555(0x22b, float:7.78E-43)
            r4 = 1205(0x4b5, float:1.689E-42)
            java.lang.String r1 = androidx.vectordrawable.C1105.m3247(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L60
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L60
            m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L60
            r0 = 1864(0x748, float:2.612E-42)
        L56:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5c;
                case 47483: goto L91;
                default: goto L5b;
            }
        L5b:
            goto L56
        L5c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L56
        L60:
            r0 = move-exception
            java.util.Map r0 = com.tencent.mmkv.C1109.m3610()     // Catch: java.lang.Throwable -> Lcb
            java.util.Set r0 = androidx.activity.C1063.m257(r0)     // Catch: java.lang.Throwable -> Lcb
            java.util.Iterator r1 = kevin.fun.hook.C1120.m8611(r0)     // Catch: java.lang.Throwable -> Lcb
        L6d:
            boolean r2 = androidx.activity.C1063.m269(r1)     // Catch: java.lang.Throwable -> Lcb
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L74:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L7c;
                case 45: goto L96;
                case 76: goto L86;
                case 239: goto L80;
                default: goto L7b;
            }     // Catch: java.lang.Throwable -> Lcb
        L7b:
            goto L74
        L7c:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L74
        L80:
            if (r2 != 0) goto L7c
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L74
        L86:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L89:
            r1 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 22: goto L91;
                case 503: goto L92;
                default: goto L90;
            }     // Catch: java.lang.Throwable -> Lcb
        L90:
            goto L89
        L91:
            return
        L92:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L89
        L96:
            java.lang.Object r0 = androidx.core.ktx.C1071.m870(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r2 = m7228()     // Catch: java.lang.Throwable -> Lcb
            short[] r3 = m7232()     // Catch: java.lang.Throwable -> Lcb
            r4 = 30
            int r5 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> Lcb
            r5 = r5 ^ 552(0x228, float:7.74E-43)
            r6 = 1742(0x6ce, float:2.441E-42)
            java.lang.String r3 = androidx.lifecycle.viewmodel.C1093.m2415(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lcb
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lcb
            int r5 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> Lcb
            r5 = r5 ^ (-453(0xfffffffffffffe3b, float:NaN))
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lcb
            m7224(r2, r3, r4)     // Catch: java.lang.Throwable -> Lcb
            r0 = 49666(0xc202, float:6.9597E-41)
        Lbf:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Lc7;
                case 50: goto L6d;
                default: goto Lc6;
            }
        Lc6:
            goto Lbf
        Lc7:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Lbf
        Lcb:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 36
            int r4 = androidx.appcompat.resources.C1068.f94
            r4 = r4 ^ 539(0x21b, float:7.55E-43)
            r5 = 2310(0x906, float:3.237E-42)
            java.lang.String r2 = androidx.vectordrawable.C1104.m3232(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
            goto L91
    }

    public static boolean contains(java.lang.String r6) {
            r1 = 0
            boolean r2 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L7:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L15;
                case 239: goto L17;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r2 != 0) goto Ld
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            r0 = r1
        L16:
            return r0
        L17:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L3f
            short[] r2 = m7232()     // Catch: java.lang.Throwable -> L3f
            r3 = 57
            int r4 = androidx.loader.C1098.f124     // Catch: java.lang.Throwable -> L3f
            r4 = r4 ^ (-810(0xfffffffffffffcd6, float:NaN))
            r5 = 700(0x2bc, float:9.81E-43)
            java.lang.String r2 = androidx.versionedparcelable.C1107.m3485(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3f
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3f
            int r4 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L3f
            r4 = r4 ^ (-453(0xfffffffffffffe3b, float:NaN))
            r3[r4] = r6     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = m7224(r0, r2, r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3f
            boolean r0 = androidx.activity.C1064.m381(r0)     // Catch: java.lang.Throwable -> L3f
            goto L16
        L3f:
            r0 = move-exception
            r0 = r1
            goto L16
    }

    public static java.util.Map<java.lang.String, ?> getAll() {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
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
            if (r1 != 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L19:
            return r0
        L1a:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L4a
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L4a
            r2 = 68
            int r3 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L4a
            r3 = r3 ^ (-235(0xffffffffffffff15, float:NaN))
            r4 = 334(0x14e, float:4.68E-43)
            java.lang.String r1 = androidx.loader.C1094.m2495(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> L4a
            r1 = 1740(0x6cc, float:2.438E-42)
        L39:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L3f;
                case 54: goto L44;
                case 471: goto L73;
                case 500: goto L47;
                default: goto L3e;
            }     // Catch: java.lang.Throwable -> L4a
        L3e:
            goto L39
        L3f:
            if (r2 == 0) goto L44
            r1 = 1833(0x729, float:2.569E-42)
            goto L39
        L44:
            r1 = 1802(0x70a, float:2.525E-42)
            goto L39
        L47:
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L4a
            goto L19
        L4a:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 74
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r4 = r4 ^ (-106(0xffffffffffffff96, float:NaN))
            r5 = 2797(0xaed, float:3.92E-42)
            java.lang.String r2 = androidx.activity.C1065.m410(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
        L73:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L19
    }

    public static boolean getBoolean(java.lang.String r5, boolean r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2b;
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
            m7229()
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L2b;
                case 500: goto L5c;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 != 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L5d
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L5d
            r2 = 93
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L5d
            r3 = r3 ^ (-944(0xfffffffffffffc50, float:NaN))
            r4 = 718(0x2ce, float:1.006E-42)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8576(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r2 = androidx.loader.C1096.m2664(r6)     // Catch: java.lang.Throwable -> L5d
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5d
            int r4 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> L5d
            r4 = r4 ^ 447(0x1bf, float:6.26E-43)
            r3[r4] = r5     // Catch: java.lang.Throwable -> L5d
            int r4 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L5d
            r4 = r4 ^ (-933(0xfffffffffffffc5b, float:NaN))
            r3[r4] = r2     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5d
            boolean r6 = androidx.activity.C1064.m381(r0)     // Catch: java.lang.Throwable -> L5d
        L5c:
            return r6
        L5d:
            r0 = move-exception
            goto L5c
    }

    public static byte[] getBytes(java.lang.String r8) {
            r7 = 0
            r1 = 0
            boolean r2 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto L2f;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r2 != 0) goto Le
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            m7229()
            boolean r2 = com.tencent.mmkv.C1109.m3593()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L2f;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r2 != 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            r0 = r1
        L2e:
            return r0
        L2f:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L8a
            short[] r2 = m7232()     // Catch: java.lang.Throwable -> L8a
            r3 = 103(0x67, float:1.44E-43)
            int r4 = androidx.lifecycle.runtime.C1092.f118     // Catch: java.lang.Throwable -> L8a
            r4 = r4 ^ 787(0x313, float:1.103E-42)
            r5 = 2182(0x886, float:3.058E-42)
            java.lang.String r2 = androidx.lifecycle.livedata.C1084.m1796(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L8a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8a
            int r4 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L8a
            r4 = r4 ^ 372(0x174, float:5.21E-43)
            r3[r4] = r8     // Catch: java.lang.Throwable -> L8a
            int r4 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L8a
            r4 = r4 ^ 803(0x323, float:1.125E-42)
            r5 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = m7224(r0, r2, r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L8a
            r2 = 1864(0x748, float:2.612E-42)
        L5b:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L61;
                case 47384: goto Ld0;
                case 47417: goto L6b;
                case 47483: goto L67;
                default: goto L60;
            }     // Catch: java.lang.Throwable -> L8a
        L60:
            goto L5b
        L61:
            if (r0 == 0) goto L67
            r2 = 48736(0xbe60, float:6.8294E-41)
            goto L5b
        L67:
            r2 = 48705(0xbe41, float:6.825E-41)
            goto L5b
        L6b:
            boolean r3 = androidx.activity.C1066.m488(r0)     // Catch: java.lang.Throwable -> L8a
            r2 = 48767(0xbe7f, float:6.8337E-41)
        L72:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r2 = r2 ^ r4
            switch(r2) {
                case 14: goto L7a;
                case 45: goto Ld0;
                case 76: goto L84;
                case 239: goto L7e;
                default: goto L79;
            }     // Catch: java.lang.Throwable -> L8a
        L79:
            goto L72
        L7a:
            r2 = 48829(0xbebd, float:6.8424E-41)
            goto L72
        L7e:
            if (r3 != 0) goto L7a
            r2 = 48860(0xbedc, float:6.8467E-41)
            goto L72
        L84:
            r2 = 0
            byte[] r0 = androidx.annotation.experimental.C1067.m545(r0, r2)     // Catch: java.lang.Throwable -> L8a
            goto L2e
        L8a:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m7232()
            r4 = 115(0x73, float:1.61E-43)
            int r5 = androidx.appcompat.resources.C1068.f94
            r5 = r5 ^ 538(0x21a, float:7.54E-43)
            r6 = 1347(0x543, float:1.888E-42)
            java.lang.String r3 = org.luckypray.dexkit.C1123.m10510(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r8)
            short[] r3 = m7232()
            r4 = 135(0x87, float:1.89E-43)
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r5 = r5 ^ (-935(0xfffffffffffffc59, float:NaN))
            r6 = 1820(0x71c, float:2.55E-42)
            java.lang.String r3 = androidx.vectordrawable.C1105.m3247(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
            kevin.fun.hook.MMKVHelper.initialized = r7
            m7229()
        Ld0:
            r0 = r1
            goto L2e
    }

    public static double getDouble(java.lang.String r5, double r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L45;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L46
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L46
            r2 = 138(0x8a, float:1.93E-43)
            int r3 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L46
            r3 = r3 ^ (-976(0xfffffffffffffc30, float:NaN))
            r4 = 1811(0x713, float:2.538E-42)
            java.lang.String r1 = androidx.lifecycle.livedata.C1086.m1920(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r6)     // Catch: java.lang.Throwable -> L46
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L46
            int r4 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L46
            r4 = r4 ^ (-75)
            r3[r4] = r5     // Catch: java.lang.Throwable -> L46
            int r4 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> L46
            r4 = r4 ^ 115(0x73, float:1.61E-43)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L46
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Throwable -> L46
            double r6 = org.luckypray.dexkit.C1125.m10592(r0)     // Catch: java.lang.Throwable -> L46
        L45:
            return r6
        L46:
            r0 = move-exception
            goto L45
    }

    public static float getFloat(java.lang.String r5, float r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L45;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L46
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L46
            r2 = 150(0x96, float:2.1E-43)
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L46
            r3 = r3 ^ (-114(0xffffffffffffff8e, float:NaN))
            r4 = 873(0x369, float:1.223E-42)
            java.lang.String r1 = androidx.activity.C1062.m170(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L46
            java.lang.Float r2 = com.tencent.mmkv.C1109.m3594(r6)     // Catch: java.lang.Throwable -> L46
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L46
            int r4 = androidx.startup.C1100.f126     // Catch: java.lang.Throwable -> L46
            r4 = r4 ^ (-278(0xfffffffffffffeea, float:NaN))
            r3[r4] = r5     // Catch: java.lang.Throwable -> L46
            int r4 = androidx.lifecycle.livedata.C1085.f111     // Catch: java.lang.Throwable -> L46
            r4 = r4 ^ 780(0x30c, float:1.093E-42)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L46
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.Throwable -> L46
            float r6 = androidx.startup.C1101.m66(r0)     // Catch: java.lang.Throwable -> L46
        L45:
            return r6
        L46:
            r0 = move-exception
            goto L45
    }

    public static int getInt(java.lang.String r5, int r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2b;
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
            m7229()
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L2b;
                case 500: goto L5c;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 != 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L5d
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L5d
            r2 = 161(0xa1, float:2.26E-43)
            int r3 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L5d
            r3 = r3 ^ (-62)
            r4 = 1448(0x5a8, float:2.029E-42)
            java.lang.String r1 = androidx.loader.C1097.m2734(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r2 = androidx.activity.C1064.m334(r6)     // Catch: java.lang.Throwable -> L5d
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5d
            int r4 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L5d
            r4 = r4 ^ (-118(0xffffffffffffff8a, float:NaN))
            r3[r4] = r5     // Catch: java.lang.Throwable -> L5d
            int r4 = androidx.startup.C1100.f126     // Catch: java.lang.Throwable -> L5d
            r4 = r4 ^ (-277(0xfffffffffffffeeb, float:NaN))
            r3[r4] = r2     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L5d
            int r6 = androidx.interpolator.C1081.m1580(r0)     // Catch: java.lang.Throwable -> L5d
        L5c:
            return r6
        L5d:
            r0 = move-exception
            goto L5c
    }

    public static long getLong(java.lang.String r5, long r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2b;
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
            m7229()
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L2b;
                case 500: goto L5c;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 != 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L5d
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L5d
            r2 = 170(0xaa, float:2.38E-43)
            int r3 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L5d
            r3 = r3 ^ 756(0x2f4, float:1.06E-42)
            r4 = 1551(0x60f, float:2.173E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1079.m1457(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.Long r2 = androidx.appcompat.resources.C1068.m611(r6)     // Catch: java.lang.Throwable -> L5d
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5d
            int r4 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L5d
            r4 = r4 ^ (-624(0xfffffffffffffd90, float:NaN))
            r3[r4] = r5     // Catch: java.lang.Throwable -> L5d
            int r4 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L5d
            r4 = r4 ^ 376(0x178, float:5.27E-43)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L5d
            long r6 = androidx.appcompat.resources.C1068.m677(r0)     // Catch: java.lang.Throwable -> L5d
        L5c:
            return r6
        L5d:
            r0 = move-exception
            goto L5c
    }

    public static java.lang.Object getMMKV() {
            java.lang.Object r0 = m7228()
            return r0
    }

    public static java.lang.String getString(java.lang.String r6, java.lang.String r7) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2b;
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
            m7229()
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L2b;
                case 500: goto L55;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 != 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L56
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L56
            r2 = 180(0xb4, float:2.52E-43)
            int r3 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L56
            r3 = r3 ^ 31
            r4 = 354(0x162, float:4.96E-43)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8576(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L56
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L56
            int r3 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L56
            r3 = r3 ^ (-964(0xfffffffffffffc3c, float:NaN))
            r2[r3] = r6     // Catch: java.lang.Throwable -> L56
            int r3 = androidx.activity.C1064.f90     // Catch: java.lang.Throwable -> L56
            r3 = r3 ^ 491(0x1eb, float:6.88E-43)
            r2[r3] = r7     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L56
            r7 = r0
        L55:
            return r7
        L56:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 192(0xc0, float:2.69E-43)
            int r4 = androidx.lifecycle.livedata.C1086.f112
            r4 = r4 ^ 940(0x3ac, float:1.317E-42)
            r5 = 3140(0xc44, float:4.4E-42)
            java.lang.String r2 = androidx.startup.C1101.m3014(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r6)
            short[] r2 = m7232()
            r3 = 213(0xd5, float:2.98E-43)
            int r4 = androidx.interpolator.C1081.f107
            r4 = r4 ^ (-268(0xfffffffffffffef4, float:NaN))
            r5 = 2184(0x888, float:3.06E-42)
            java.lang.String r2 = androidx.lifecycle.livedata.C1085.m1814(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
            r0 = 0
            kevin.fun.hook.MMKVHelper.initialized = r0
            m7229()
            goto L55
    }

    public static void init(java.lang.Object r7) {
            boolean r1 = m7225()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L2e;
                case 239: goto L14;
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
            java.lang.Object r1 = m7237()
            monitor-enter(r1)
            boolean r2 = m7225()     // Catch: java.lang.Throwable -> L9c
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L2f;
                case 500: goto L2d;
                default: goto L24;
            }     // Catch: java.lang.Throwable -> L9c
        L24:
            goto L1f
        L25:
            if (r2 == 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
        L2e:
            return
        L2f:
            kevin.fun.hook.MMKVHelper.mmkv = r7     // Catch: java.lang.Throwable -> L72
            r0 = 1864(0x748, float:2.612E-42)
        L33:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L39;
                case 47384: goto L5a;
                case 47417: goto L43;
                case 47483: goto L3f;
                default: goto L38;
            }     // Catch: java.lang.Throwable -> L72
        L38:
            goto L33
        L39:
            if (r7 == 0) goto L3f
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L33
        L3f:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L33
        L43:
            java.lang.Class r0 = androidx.emoji2.C1080.m1524(r7)     // Catch: java.lang.Throwable -> L72
            kevin.fun.hook.MMKVHelper.mmkvClass = r0     // Catch: java.lang.Throwable -> L72
            r0 = 1
            kevin.fun.hook.MMKVHelper.initialized = r0     // Catch: java.lang.Throwable -> L72
            m7236()     // Catch: java.lang.Throwable -> L72
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L52:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L5a;
                case 239: goto L6e;
                default: goto L59;
            }
        L59:
            goto L52
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
            int r2 = androidx.lifecycle.process.C1090.m2172()     // Catch: java.lang.Throwable -> L9c
            r0 = 48891(0xbefb, float:6.8511E-41)
        L62:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 22: goto L6a;
                case 53: goto L2e;
                case 503: goto L9f;
                case 32495: goto La5;
                default: goto L69;
            }     // Catch: java.lang.Throwable -> L9c
        L69:
            goto L62
        L6a:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L62
        L6e:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto L52
        L72:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r2.<init>()     // Catch: java.lang.Throwable -> L9c
            short[] r3 = m7232()     // Catch: java.lang.Throwable -> L9c
            r4 = 216(0xd8, float:3.03E-43)
            int r5 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L9c
            r5 = r5 ^ (-375(0xfffffffffffffe89, float:NaN))
            r6 = 1633(0x661, float:2.288E-42)
            java.lang.String r3 = androidx.lifecycle.livedata.C1086.m1920(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L9c
            m7233(r0)     // Catch: java.lang.Throwable -> L9c
            goto L5a
        L9c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9c
            throw r0
        L9f:
            if (r2 > 0) goto L6a
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L62
        La5:
            java.lang.String r0 = "7Qcqgefwt"
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2067(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L9c
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L9c
            r2.println(r0)     // Catch: java.lang.Throwable -> L9c
            goto L2e
    }

    public static void initWithContext(android.content.Context r1, java.lang.Class<?> r2, java.lang.Object r3, java.lang.String r4) {
            java.lang.String r0 = "ۢ۟ۧ"
        L2:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r0)
            switch(r0) {
                case 1746687: goto L14;
                case 1750533: goto L1f;
                case 1751557: goto L29;
                case 1753605: goto L24;
                case 1755494: goto L1a;
                case 1755561: goto Le;
                default: goto L9;
            }
        L9:
            kevin.fun.hook.MMKVHelper.appContext = r1
            java.lang.String r0 = "ۣ۟ۡ"
            goto L2
        Le:
            m7236()
            java.lang.String r0 = "ۤۡۢ"
            goto L2
        L14:
            r0 = 1
            kevin.fun.hook.MMKVHelper.initialized = r0
            java.lang.String r0 = "ۨۦۧ"
            goto L2
        L1a:
            kevin.fun.hook.MMKVHelper.mmkvId = r4
            java.lang.String r0 = "۟۟۟"
            goto L2
        L1f:
            kevin.fun.hook.MMKVHelper.mmkvClass = r2
            java.lang.String r0 = "ۦۥۤ"
            goto L2
        L24:
            kevin.fun.hook.MMKVHelper.mmkv = r3
            java.lang.String r0 = "ۨۤۢ"
            goto L2
        L29:
            return
    }

    public static boolean isInitialized() {
            boolean r1 = m7225()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2a;
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
            java.lang.Object r1 = m7228()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L25;
                case 471: goto L2a;
                case 500: goto L28;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            if (r1 == 0) goto L25
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L28:
            r0 = 1
        L29:
            return r0
        L2a:
            r0 = 0
            goto L29
    }

    private static boolean isMMKVValid() {
            r1 = 1
            r0 = 0
            java.lang.Object r3 = m7228()
            r2 = 1616(0x650, float:2.264E-42)
        L8:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L47;
                case 239: goto L16;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r3 != 0) goto Le
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            java.lang.Object r2 = m7228()     // Catch: java.lang.Throwable -> L48
            short[] r3 = m7232()     // Catch: java.lang.Throwable -> L48
            r4 = 244(0xf4, float:3.42E-43)
            int r5 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L48
            r5 = r5 ^ (-63)
            r6 = 2920(0xb68, float:4.092E-42)
            java.lang.String r3 = androidx.interpolator.C1081.m1616(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L48
            short[] r4 = m7232()     // Catch: java.lang.Throwable -> L48
            r5 = 255(0xff, float:3.57E-43)
            int r6 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L48
            r6 = r6 ^ (-112(0xffffffffffffff90, float:NaN))
            r7 = 1422(0x58e, float:1.993E-42)
            java.lang.String r4 = androidx.appcompat.resources.C1068.m652(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L48
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L48
            int r6 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L48
            r6 = r6 ^ 82
            r5[r6] = r4     // Catch: java.lang.Throwable -> L48
            m7224(r2, r3, r5)     // Catch: java.lang.Throwable -> L48
            r0 = r1
        L47:
            return r0
        L48:
            r1 = move-exception
            goto L47
    }

    public static void putBoolean(java.lang.String r5, boolean r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L6f;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L49
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L49
            r2 = 265(0x109, float:3.71E-43)
            int r3 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L49
            r3 = r3 ^ 642(0x282, float:9.0E-43)
            r4 = 2873(0xb39, float:4.026E-42)
            java.lang.String r1 = androidx.activity.C1065.m410(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r2 = androidx.loader.C1096.m2664(r6)     // Catch: java.lang.Throwable -> L49
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L49
            int r4 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 558(0x22e, float:7.82E-43)
            r3[r4] = r5     // Catch: java.lang.Throwable -> L49
            int r4 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 614(0x266, float:8.6E-43)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L49
            m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L49
            r0 = 1740(0x6cc, float:2.438E-42)
        L40:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L46;
                case 54: goto L4a;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L40
        L49:
            r0 = move-exception
        L4a:
            int r1 = androidx.activity.C1063.m300()
            r0 = 1864(0x748, float:2.612E-42)
        L50:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L56;
                case 47384: goto L6f;
                case 47417: goto L60;
                case 47483: goto L5c;
                default: goto L55;
            }
        L55:
            goto L50
        L56:
            if (r1 > 0) goto L5c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L50
        L5c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L50
        L60:
            java.lang.String r0 = "yuccgXTgxb8"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L6f:
            return
    }

    public static void putBytes(java.lang.String r7, byte[] r8) {
            r6 = 0
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L7:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Ld;
                case 49: goto L10;
                case 204: goto L15;
                case 239: goto L2c;
                default: goto Lc;
            }
        Lc:
            goto L7
        Ld:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L7
        L10:
            if (r1 != 0) goto Ld
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L7
        L15:
            m7229()
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L29;
                case 471: goto L2c;
                case 500: goto La6;
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
            r0 = 0
            java.lang.String r0 = androidx.customview.C1075.m1169(r8, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = m7228()     // Catch: java.lang.Throwable -> L63
            short[] r2 = m7232()     // Catch: java.lang.Throwable -> L63
            r3 = 271(0x10f, float:3.8E-43)
            int r4 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L63
            r4 = r4 ^ 21
            r5 = 1281(0x501, float:1.795E-42)
            java.lang.String r2 = kevin.fun.hook.C1120.m8645(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L63
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L63
            int r4 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L63
            r4 = r4 ^ 766(0x2fe, float:1.073E-42)
            r3[r4] = r7     // Catch: java.lang.Throwable -> L63
            int r4 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L63
            r4 = r4 ^ (-491(0xfffffffffffffe15, float:NaN))
            r3[r4] = r0     // Catch: java.lang.Throwable -> L63
            m7224(r1, r2, r3)     // Catch: java.lang.Throwable -> L63
            r0 = 1864(0x748, float:2.612E-42)
        L59:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L5f;
                case 47483: goto La6;
                default: goto L5e;
            }
        L5e:
            goto L59
        L5f:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L59
        L63:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 277(0x115, float:3.88E-43)
            int r4 = org.luckypray.dexkit.C1124.f434
            r4 = r4 ^ 647(0x287, float:9.07E-43)
            r5 = 3030(0xbd6, float:4.246E-42)
            java.lang.String r2 = androidx.core.ktx.C1071.m874(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r7)
            short[] r2 = m7232()
            r3 = 297(0x129, float:4.16E-43)
            int r4 = androidx.loader.C1095.f121
            r4 = r4 ^ (-961(0xfffffffffffffc3f, float:NaN))
            r5 = 1468(0x5bc, float:2.057E-42)
            java.lang.String r2 = androidx.activity.C1066.m468(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
            kevin.fun.hook.MMKVHelper.initialized = r6
        La6:
            return
    }

    public static void putDouble(java.lang.String r5, double r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L38;
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
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L25;
                case 471: goto L37;
                case 500: goto L28;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            if (r1 < 0) goto L25
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L28:
            java.lang.String r0 = "TGndQp"
            java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L37:
            return
        L38:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L6e
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L6e
            r2 = 300(0x12c, float:4.2E-43)
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L6e
            r3 = r3 ^ (-932(0xfffffffffffffc5c, float:NaN))
            r4 = 2126(0x84e, float:2.979E-42)
            java.lang.String r1 = androidx.vectordrawable.C1103.m3132(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L6e
            java.lang.Double r2 = androidx.core.ktx.C1071.m841(r6)     // Catch: java.lang.Throwable -> L6e
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6e
            int r4 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L6e
            r4 = r4 ^ 558(0x22e, float:7.82E-43)
            r3[r4] = r5     // Catch: java.lang.Throwable -> L6e
            int r4 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L6e
            r4 = r4 ^ 83
            r3[r4] = r2     // Catch: java.lang.Throwable -> L6e
            m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L6e
            r0 = 1864(0x748, float:2.612E-42)
        L64:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L6a;
                case 47483: goto L37;
                default: goto L69;
            }
        L69:
            goto L64
        L6a:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L64
        L6e:
            r0 = move-exception
            goto L37
    }

    public static void putFloat(java.lang.String r5, float r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L4a;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L49
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L49
            r2 = 306(0x132, float:4.29E-43)
            int r3 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L49
            r3 = r3 ^ (-966(0xfffffffffffffc3a, float:NaN))
            r4 = 3018(0xbca, float:4.229E-42)
            java.lang.String r1 = androidx.core.C1073.m1028(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L49
            java.lang.Float r2 = com.tencent.mmkv.C1109.m3594(r6)     // Catch: java.lang.Throwable -> L49
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L49
            int r4 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 766(0x2fe, float:1.073E-42)
            r3[r4] = r5     // Catch: java.lang.Throwable -> L49
            int r4 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 559(0x22f, float:7.83E-43)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L49
            m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L49
            r0 = 1740(0x6cc, float:2.438E-42)
        L40:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L46;
                case 54: goto L4a;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L40
        L49:
            r0 = move-exception
        L4a:
            return
    }

    public static void putInt(java.lang.String r5, int r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L4a;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L49
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L49
            r2 = 312(0x138, float:4.37E-43)
            int r3 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L49
            r3 = r3 ^ (-953(0xfffffffffffffc47, float:NaN))
            r4 = 2495(0x9bf, float:3.496E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1088.m2044(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L49
            java.lang.Integer r2 = androidx.activity.C1064.m334(r6)     // Catch: java.lang.Throwable -> L49
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L49
            int r4 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 82
            r3[r4] = r5     // Catch: java.lang.Throwable -> L49
            int r4 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 287(0x11f, float:4.02E-43)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L49
            m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L49
            r0 = 1740(0x6cc, float:2.438E-42)
        L40:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L46;
                case 54: goto L4a;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L40
        L49:
            r0 = move-exception
        L4a:
            return
    }

    public static void putLong(java.lang.String r5, long r6) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L4a;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L49
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L49
            r2 = 318(0x13e, float:4.46E-43)
            int r3 = androidx.startup.C1100.f126     // Catch: java.lang.Throwable -> L49
            r3 = r3 ^ (-276(0xfffffffffffffeec, float:NaN))
            r4 = 1103(0x44f, float:1.546E-42)
            java.lang.String r1 = androidx.loader.C1097.m2734(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L49
            java.lang.Long r2 = androidx.appcompat.resources.C1068.m611(r6)     // Catch: java.lang.Throwable -> L49
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L49
            int r4 = androidx.versionedparcelable.C1106.f132     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 140(0x8c, float:1.96E-43)
            r3[r4] = r5     // Catch: java.lang.Throwable -> L49
            int r4 = androidx.vectordrawable.C1104.f130     // Catch: java.lang.Throwable -> L49
            r4 = r4 ^ 594(0x252, float:8.32E-43)
            r3[r4] = r2     // Catch: java.lang.Throwable -> L49
            m7224(r0, r1, r3)     // Catch: java.lang.Throwable -> L49
            r0 = 1740(0x6cc, float:2.438E-42)
        L40:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L46;
                case 54: goto L4a;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L40
        L49:
            r0 = move-exception
        L4a:
            return
    }

    public static void putString(java.lang.String r6, java.lang.String r7) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2b;
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
            m7229()
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L2b;
                case 500: goto La1;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            if (r1 != 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L5d
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L5d
            r2 = 324(0x144, float:4.54E-43)
            int r3 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L5d
            r3 = r3 ^ (-100)
            r4 = 988(0x3dc, float:1.384E-42)
            java.lang.String r1 = androidx.lifecycle.process.C1089.m2127(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5d
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L5d
            int r3 = kevin.fun.hook.webdav.C1119.f418     // Catch: java.lang.Throwable -> L5d
            r3 = r3 ^ 294(0x126, float:4.12E-43)
            r2[r3] = r6     // Catch: java.lang.Throwable -> L5d
            int r3 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L5d
            r3 = r3 ^ 242(0xf2, float:3.39E-43)
            r2[r3] = r7     // Catch: java.lang.Throwable -> L5d
            m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L5d
            r0 = 1864(0x748, float:2.612E-42)
        L53:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L59;
                case 47483: goto La1;
                default: goto L58;
            }
        L58:
            goto L53
        L59:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L53
        L5d:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 330(0x14a, float:4.62E-43)
            int r4 = androidx.customview.C1075.f101
            r4 = r4 ^ (-113(0xffffffffffffff8f, float:NaN))
            r5 = 2043(0x7fb, float:2.863E-42)
            java.lang.String r2 = androidx.core.C1072.m957(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r6)
            short[] r2 = m7232()
            r3 = 351(0x15f, float:4.92E-43)
            int r4 = androidx.interpolator.C1083.f109
            r4 = r4 ^ (-447(0xfffffffffffffe41, float:NaN))
            r5 = 1657(0x679, float:2.322E-42)
            java.lang.String r2 = kevin.fun.hook.webdav.C1118.m8509(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
            r0 = 0
            kevin.fun.hook.MMKVHelper.initialized = r0
        La1:
            return
    }

    public static void reInit(android.content.Context r6) {
            m7234(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = m7226()     // Catch: java.lang.Throwable -> L33
            int r1 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L33
            r1 = r1 ^ 374(0x176, float:5.24E-43)
            com.tencent.mmkv.MMKV r0 = m7235(r0, r1)     // Catch: java.lang.Throwable -> L33
            kevin.fun.hook.MMKVHelper.mmkv = r0     // Catch: java.lang.Throwable -> L33
            r0 = 1
            kevin.fun.hook.MMKVHelper.initialized = r0     // Catch: java.lang.Throwable -> L33
            short[] r0 = m7232()     // Catch: java.lang.Throwable -> L33
            r1 = 354(0x162, float:4.96E-43)
            int r2 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L33
            r2 = r2 ^ (-982(0xfffffffffffffc2a, float:NaN))
            r3 = 1159(0x487, float:1.624E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L33
            m7233(r0)     // Catch: java.lang.Throwable -> L33
            r0 = 1616(0x650, float:2.264E-42)
        L29:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L2f;
                case 49: goto L30;
                default: goto L2e;
            }
        L2e:
            goto L29
        L2f:
            return
        L30:
            r0 = 1647(0x66f, float:2.308E-42)
            goto L29
        L33:
            r0 = move-exception
            r1 = 0
            kevin.fun.hook.MMKVHelper.initialized = r1
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 376(0x178, float:5.27E-43)
            int r4 = androidx.activity.C1062.f88
            r4 = r4 ^ (-87)
            r5 = 2940(0xb7c, float:4.12E-42)
            java.lang.String r2 = androidx.interpolator.C1082.m1694(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
            goto L2f
    }

    public static void remove(java.lang.String r5) {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L38;
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
            int r1 = androidx.appcompat.C1069.m747()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L25;
                case 471: goto L37;
                case 500: goto L28;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            if (r1 < 0) goto L25
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L28:
            java.lang.String r0 = "58N9Rzd43YnzbItImQYM"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L37:
            return
        L38:
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L64
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L64
            r2 = 404(0x194, float:5.66E-43)
            int r3 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L64
            r3 = r3 ^ (-953(0xfffffffffffffc47, float:NaN))
            r4 = 3264(0xcc0, float:4.574E-42)
            java.lang.String r1 = androidx.drawerlayout.C1077.m1343(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L64
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L64
            int r3 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L64
            r3 = r3 ^ (-453(0xfffffffffffffe3b, float:NaN))
            r2[r3] = r5     // Catch: java.lang.Throwable -> L64
            m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L64
            r0 = 1864(0x748, float:2.612E-42)
        L5a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L60;
                case 47483: goto L37;
                default: goto L5f;
            }
        L5f:
            goto L5a
        L60:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L5a
        L64:
            r0 = move-exception
            goto L37
    }

    private static void selfCheck() {
            short[] r0 = m7232()
            r1 = 410(0x19a, float:5.75E-43)
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 374(0x176, float:5.24E-43)
            r3 = 471(0x1d7, float:6.6E-43)
            java.lang.String r0 = androidx.appcompat.C1069.m751(r0, r1, r2, r3)
            short[] r1 = m7232()
            r2 = 412(0x19c, float:5.77E-43)
            int r3 = androidx.vectordrawable.C1103.f129
            r3 = r3 ^ 263(0x107, float:3.69E-43)
            r4 = 1861(0x745, float:2.608E-42)
            java.lang.String r1 = androidx.loader.C1095.m2574(r1, r2, r3, r4)
            androidx.core.C1073.m1055(r1, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = androidx.emoji2.C1080.m1562()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = androidx.interpolator.C1081.m1642(r1, r2)     // Catch: java.lang.Throwable -> L5d
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)     // Catch: java.lang.Throwable -> L5d
            r0 = 1616(0x650, float:2.264E-42)
        L31:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L37;
                case 49: goto L3a;
                case 204: goto L3f;
                case 239: goto L86;
                default: goto L36;
            }     // Catch: java.lang.Throwable -> L5d
        L36:
            goto L31
        L37:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L31
        L3a:
            if (r1 != 0) goto L37
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L31
        L3f:
            short[] r0 = m7232()     // Catch: java.lang.Throwable -> L5d
            r1 = 423(0x1a7, float:5.93E-43)
            int r2 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Throwable -> L5d
            r2 = r2 ^ (-252(0xffffffffffffff04, float:NaN))
            r3 = 1559(0x617, float:2.185E-42)
            java.lang.String r0 = androidx.activity.C1063.m241(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L5d
            m7233(r0)     // Catch: java.lang.Throwable -> L5d
            r0 = 1740(0x6cc, float:2.438E-42)
        L54:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L5a;
                case 54: goto L86;
                default: goto L59;
            }
        L59:
            goto L54
        L5a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L54
        L5d:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 448(0x1c0, float:6.28E-43)
            int r4 = kevin.fun.hook.audio.C1116.f405
            r4 = r4 ^ 71
            r5 = 1724(0x6bc, float:2.416E-42)
            java.lang.String r2 = androidx.versionedparcelable.C1107.m3485(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
        L86:
            int r1 = androidx.core.ktx.C1070.m822()
            r0 = 1864(0x748, float:2.612E-42)
        L8c:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L92;
                case 47384: goto Lab;
                case 47417: goto L9c;
                case 47483: goto L98;
                default: goto L91;
            }
        L91:
            goto L8c
        L92:
            if (r1 < 0) goto L98
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L8c
        L98:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L8c
        L9c:
            java.lang.String r0 = "h04U5y7Elky54KiAzEo9"
            java.lang.String r0 = androidx.loader.C1094.m2472(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Lab:
            return
    }

    public static void sync() {
            boolean r1 = com.tencent.mmkv.C1109.m3593()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L5f;
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
            java.lang.Object r0 = m7228()     // Catch: java.lang.Throwable -> L39
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> L39
            r2 = 469(0x1d5, float:6.57E-43)
            int r3 = androidx.loader.C1094.f120     // Catch: java.lang.Throwable -> L39
            r3 = r3 ^ 368(0x170, float:5.16E-43)
            r4 = 1189(0x4a5, float:1.666E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L39
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L39
            m7224(r0, r1, r2)     // Catch: java.lang.Throwable -> L39
            r0 = 1740(0x6cc, float:2.438E-42)
        L30:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L36;
                case 54: goto L3a;
                default: goto L35;
            }
        L35:
            goto L30
        L36:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L30
        L39:
            r0 = move-exception
        L3a:
            int r1 = kevin.fun.hook.audio.C1114.m7895()
            r0 = 1864(0x748, float:2.612E-42)
        L40:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L46;
                case 47384: goto L5f;
                case 47417: goto L50;
                case 47483: goto L4c;
                default: goto L45;
            }
        L45:
            goto L40
        L46:
            if (r1 > 0) goto L4c
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L40
        L4c:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L40
        L50:
            java.lang.String r0 = "L3wl6tP9NZqCPuC"
            java.lang.String r0 = androidx.activity.C1065.m453(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L5f:
            return
    }

    private static void tryHeal() {
            r2 = 1
            r6 = 0
            boolean r1 = m7231()
            r0 = 1616(0x650, float:2.264E-42)
        L8:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Le;
                case 49: goto L11;
                case 204: goto L16;
                case 239: goto Ldd;
                default: goto Ld;
            }
        Ld:
            goto L8
        Le:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L8
        L11:
            if (r1 != 0) goto Le
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L8
        L16:
            boolean r1 = m7238()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L27;
                case 471: goto Ldd;
                case 500: goto L2a;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            if (r1 != 0) goto L27
            r0 = 1833(0x729, float:2.569E-42)
            goto L1c
        L27:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1c
        L2a:
            kevin.fun.hook.MMKVHelper.healingMode = r2
            android.content.Context r1 = m7223()     // Catch: java.lang.Throwable -> Le2
            r0 = 1864(0x748, float:2.612E-42)
        L32:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L38;
                case 47384: goto Ldb;
                case 47417: goto L42;
                case 47483: goto L3e;
                default: goto L37;
            }     // Catch: java.lang.Throwable -> Le2
        L37:
            goto L32
        L38:
            if (r1 == 0) goto L3e
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L32
        L3e:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L32
        L42:
            java.lang.Class r1 = m7227()     // Catch: java.lang.Throwable -> Le2
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L49:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L51;
                case 45: goto Ldb;
                case 76: goto L5b;
                case 239: goto L55;
                default: goto L50;
            }     // Catch: java.lang.Throwable -> Le2
        L50:
            goto L49
        L51:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L49
        L55:
            if (r1 == 0) goto L51
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L49
        L5b:
            java.lang.Class r0 = m7227()     // Catch: java.lang.Throwable -> Le2
            short[] r1 = m7232()     // Catch: java.lang.Throwable -> Le2
            r2 = 473(0x1d9, float:6.63E-43)
            int r3 = androidx.loader.C1098.f124     // Catch: java.lang.Throwable -> Le2
            r3 = r3 ^ (-809(0xfffffffffffffcd7, float:NaN))
            r4 = 3076(0xc04, float:4.31E-42)
            java.lang.String r1 = androidx.activity.C1065.m410(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r2 = m7226()     // Catch: java.lang.Throwable -> Le2
            int r3 = androidx.loader.C1097.f123     // Catch: java.lang.Throwable -> Le2
            r3 = r3 ^ 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = androidx.activity.C1064.m334(r3)     // Catch: java.lang.Throwable -> Le2
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Le2
            int r5 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> Le2
            r5 = r5 ^ 659(0x293, float:9.23E-43)
            r4[r5] = r2     // Catch: java.lang.Throwable -> Le2
            int r2 = androidx.core.C1073.f99     // Catch: java.lang.Throwable -> Le2
            r2 = r2 ^ 446(0x1be, float:6.25E-43)
            r4[r2] = r3     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r1 = m7230(r0, r1, r4)     // Catch: java.lang.Throwable -> Le2
            r0 = 48891(0xbefb, float:6.8511E-41)
        L91:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L99;
                case 53: goto Lba;
                case 503: goto L9d;
                case 32495: goto La3;
                default: goto L98;
            }     // Catch: java.lang.Throwable -> Le2
        L98:
            goto L91
        L99:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L91
        L9d:
            if (r1 == 0) goto L99
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L91
        La3:
            kevin.fun.hook.MMKVHelper.mmkv = r1     // Catch: java.lang.Throwable -> Le2
            r0 = 1
            kevin.fun.hook.MMKVHelper.initialized = r0     // Catch: java.lang.Throwable -> Le2
            m7236()     // Catch: java.lang.Throwable -> Le2
            r0 = 49666(0xc202, float:6.9597E-41)
        Lae:
            r1 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 17: goto Lb6;
                case 50: goto Ldb;
                default: goto Lb5;
            }     // Catch: java.lang.Throwable -> Le2
        Lb5:
            goto Lae
        Lb6:
            r0 = 49697(0xc221, float:6.964E-41)
            goto Lae
        Lba:
            short[] r0 = m7232()     // Catch: java.lang.Throwable -> Le2
            r1 = 483(0x1e3, float:6.77E-43)
            int r2 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> Le2
            r2 = r2 ^ 633(0x279, float:8.87E-43)
            r3 = 2155(0x86b, float:3.02E-42)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Le2
            m7233(r0)     // Catch: java.lang.Throwable -> Le2
            r0 = 0
            kevin.fun.hook.MMKVHelper.initialized = r0     // Catch: java.lang.Throwable -> Le2
            r0 = 49790(0xc27e, float:6.977E-41)
        Ld3:
            r1 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 18: goto Ldb;
                case 241: goto Lde;
                default: goto Lda;
            }
        Lda:
            goto Ld3
        Ldb:
            kevin.fun.hook.MMKVHelper.healingMode = r6
        Ldd:
            return
        Lde:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto Ld3
        Le2:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7232()
            r3 = 513(0x201, float:7.19E-43)
            int r4 = androidx.interpolator.C1081.f107
            r4 = r4 ^ (-286(0xfffffffffffffee2, float:NaN))
            r5 = 1046(0x416, float:1.466E-42)
            java.lang.String r2 = androidx.lifecycle.process.C1090.m2213(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7233(r0)
            kevin.fun.hook.MMKVHelper.initialized = r6
            goto Ldb
    }

    /* JADX INFO: renamed from: ۣ۟۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static android.content.Context m7223() {
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            android.content.Context r0 = kevin.fun.hook.MMKVHelper.appContext
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

    /* JADX INFO: renamed from: ۟۟ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7224(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1089.m2142()
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
            if (r1 >= 0) goto Lc
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

    /* JADX INFO: renamed from: ۟ۡۡۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7225() {
            int r1 = androidx.lifecycle.livedata.C1085.m1819()
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
            boolean r0 = kevin.fun.hook.MMKVHelper.initialized
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

    /* JADX INFO: renamed from: ۟ۡۨۦۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7226() {
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
            java.lang.String r0 = kevin.fun.hook.MMKVHelper.mmkvId
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

    /* JADX INFO: renamed from: ۟ۦۣۨۡ, reason: not valid java name and contains not printable characters */
    public static java.lang.Class m7227() {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            java.lang.Class<?> r0 = kevin.fun.hook.MMKVHelper.mmkvClass
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

    /* JADX INFO: renamed from: ۟ۧۡۡۢ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7228() {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Object r0 = kevin.fun.hook.MMKVHelper.mmkv
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

    /* JADX INFO: renamed from: ۟ۧۦۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7229() {
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            tryHeal()
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

    /* JADX INFO: renamed from: ۠۠ۡ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7230(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.C1120.m8652()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callStaticMethod(r2, r3, r4)
        L1e:
            return r0
        L1f:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L1e;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    /* JADX INFO: renamed from: ۡۦۣۣ, reason: not valid java name and contains not printable characters */
    public static boolean m7231() {
            int r1 = androidx.core.ktx.C1070.m822()
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
            boolean r0 = kevin.fun.hook.MMKVHelper.healingMode
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

    /* JADX INFO: renamed from: ۢۢۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7232() {
            int r1 = androidx.activity.C1064.m377()
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
            short[] r0 = kevin.fun.hook.MMKVHelper.f369short
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

    /* JADX INFO: renamed from: ۤۥۣۤ, reason: not valid java name and contains not printable characters */
    public static void m7233(java.lang.Object r2) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            java.lang.String r2 = (java.lang.String) r2
            de.robv.android.xposed.XposedBridge.log(r2)
        L19:
            int r1 = androidx.loader.C1095.m2562()
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
            if (r1 > 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "93dCgPzR6U9XGVlf0"
            java.lang.String r0 = androidx.activity.C1062.m169(r0)
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

    /* JADX INFO: renamed from: ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7234(java.lang.Object r2) {
            int r1 = androidx.startup.C1101.m2984()
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
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = com.tencent.mmkv.MMKV.initialize(r2)
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

    /* JADX INFO: renamed from: ۦۡۤۨ, reason: contains not printable characters */
    public static com.tencent.mmkv.MMKV m7235(java.lang.Object r2, int r3) {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithID(r2, r3)
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

    /* JADX INFO: renamed from: ۦۥۢۤ, reason: contains not printable characters */
    public static void m7236() {
            int r1 = androidx.loader.C1096.m2651()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            selfCheck()
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

    /* JADX INFO: renamed from: ۧۥۧۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.Object m7237() {
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Object r0 = kevin.fun.hook.MMKVHelper.lock
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

    /* JADX INFO: renamed from: ۨۦۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m7238() {
            int r1 = androidx.customview.C1075.m1139()
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
            boolean r0 = isMMKVValid()
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
