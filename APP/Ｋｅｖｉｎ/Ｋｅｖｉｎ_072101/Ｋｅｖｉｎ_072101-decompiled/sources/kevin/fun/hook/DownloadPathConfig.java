package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class DownloadPathConfig {
    private static final java.lang.String DEFAULT_SAVE_PATH = null;
    private static final java.lang.String KEY_SAVE_PATH = null;
    private static final java.lang.String KEY_TREE_URI = null;
    private static final java.lang.String PREFS_NAME = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f363short = null;
    private final android.content.SharedPreferences prefs;

    static {
            r0 = 130(0x82, float:1.82E-43)
            short[] r0 = new short[r0]
            r0 = {x0050: FILL_ARRAY_DATA , data: [28473, -26598, 27386, 32509, 22342, 2343, 2357, 2338, 2353, 2315, 2340, 2357, 2336, 2364, 884, 895, 871, 894, 892, 895, 881, 884, 847, 869, 866, 889, 547, 557, 574, 545, 550, 535, 568, 570, 557, 558, 571, 2620, 2610, 2593, 2622, 2617, 2568, 2599, 2597, 2610, 2609, 2596, 885, 871, 880, 867, 857, 886, 871, 882, 878, 27511, -25516, 28340, 31411, 21256, 1155, 1160, 1168, 1161, 1163, 1160, 1158, 1155, 1208, 1170, 1173, 1166, 574, 565, 557, 564, 566, 565, 571, 574, 517, 559, 552, 563, 1581, 1599, 1576, 1595, 1537, 1582, 1599, 1578, 1590, 28494, -26515, 27277, 32394, 22321, 1043, 1025, 1046, 1029, 1087, 1040, 1025, 1044, 1032, 277, 286, 262, 287, 285, 286, 272, 277, 302, 260, 259, 280, 802, 816, 807, 820, 782, 801, 816, 805, 825} // fill-array
            kevin.fun.hook.DownloadPathConfig.f363short = r0
            short[] r0 = m6952()
            r1 = 0
            int r2 = androidx.versionedparcelable.C1107.f133
            r2 = r2 ^ 641(0x281, float:8.98E-43)
            r3 = 2067(0x813, float:2.896E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10545(r0, r1, r2, r3)
            kevin.fun.hook.DownloadPathConfig.DEFAULT_SAVE_PATH = r0
            short[] r0 = m6952()
            r1 = 5
            int r2 = androidx.lifecycle.process.C1091.f117
            r2 = r2 ^ (-483(0xfffffffffffffe1d, float:NaN))
            r3 = 2388(0x954, float:3.346E-42)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r1, r2, r3)
            kevin.fun.hook.DownloadPathConfig.KEY_SAVE_PATH = r0
            short[] r0 = m6952()
            r1 = 14
            int r2 = androidx.emoji2.viewsintegration.C1078.f104
            r2 = r2 ^ 619(0x26b, float:8.67E-43)
            r3 = 784(0x310, float:1.099E-42)
            java.lang.String r0 = androidx.customview.C1074.m1116(r0, r1, r2, r3)
            kevin.fun.hook.DownloadPathConfig.KEY_TREE_URI = r0
            short[] r0 = m6952()
            r1 = 26
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-106(0xffffffffffffff96, float:NaN))
            r3 = 584(0x248, float:8.18E-43)
            java.lang.String r0 = androidx.vectordrawable.C1104.m3232(r0, r1, r2, r3)
            kevin.fun.hook.DownloadPathConfig.PREFS_NAME = r0
            return
    }

    public DownloadPathConfig(android.content.Context r6) {
            r5 = this;
            r5.<init>()
            android.content.Context r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3781(r6)
            short[] r1 = m6952()
            r2 = 37
            int r3 = org.luckypray.dexkit.C1123.f433
            r3 = r3 ^ (-974(0xfffffffffffffc32, float:NaN))
            r4 = 2647(0xa57, float:3.709E-42)
            java.lang.String r1 = androidx.emoji2.C1080.m1525(r1, r2, r3, r4)
            r2 = 0
            android.content.SharedPreferences r0 = androidx.drawerlayout.C1077.m1322(r0, r1, r2)
            r5.prefs = r0
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L24:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L2a;
                case 49: goto L2d;
                case 204: goto L32;
                case 239: goto L41;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L24
        L2d:
            if (r1 > 0) goto L2a
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L24
        L32:
            java.lang.String r0 = "7cNlpvLmY0G7AvIgnLO"
            java.lang.String r0 = androidx.loader.C1096.m2685(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L41:
            return
    }

    /* JADX INFO: renamed from: ۟ۦۢۦۢ, reason: not valid java name and contains not printable characters */
    public static android.content.SharedPreferences m6951(java.lang.Object r2) {
            int r1 = androidx.customview.C1074.m1071()
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
            kevin.fun.hook.DownloadPathConfig r2 = (kevin.fun.hook.DownloadPathConfig) r2
            android.content.SharedPreferences r0 = r2.prefs
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

    /* JADX INFO: renamed from: ۠ۦۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6952() {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            short[] r0 = kevin.fun.hook.DownloadPathConfig.f363short
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

    public java.lang.String getSavePath() {
            r10 = this;
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۣۣۤ"
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
                case 1747749: goto L52;
                case 1747901: goto L29;
                case 1749695: goto L1a;
                case 1750564: goto L4a;
                case 1750690: goto L30;
                case 1751590: goto L3e;
                case 1752461: goto L22;
                case 1753573: goto L58;
                case 1754632: goto L64;
                case 1755622: goto L38;
                default: goto L12;
            }
        L12:
            java.lang.String r1 = androidx.loader.C1096.m2655(r0, r4, r3)
            java.lang.String r6 = "ۧۧۨ"
            r2 = r1
            goto Lb
        L1a:
            short[] r1 = m6952()
            java.lang.String r6 = "۠ۢۧ"
            r5 = r1
            goto Lb
        L22:
            r8 = r7 ^ 811(0x32b, float:1.136E-42)
            java.lang.String r1 = "ۦۣۤ"
            r6 = r1
            r9 = r8
            goto Lb
        L29:
            r8 = r7 ^ 198(0xc6, float:2.77E-43)
            java.lang.String r1 = "ۤۢۤ"
            r6 = r1
            r9 = r8
            goto Lb
        L30:
            android.content.SharedPreferences r0 = m6951(r10)
            java.lang.String r1 = "ۣۢ۠"
            r6 = r1
            goto Lb
        L38:
            int r7 = androidx.vectordrawable.animated.C1102.f128
            java.lang.String r1 = "۠ۧۤ"
            r6 = r1
            goto Lb
        L3e:
            r1 = 57
            r3 = 3165(0xc5d, float:4.435E-42)
            java.lang.String r1 = androidx.interpolator.C1083.m1723(r5, r1, r9, r3)
            java.lang.String r6 = "ۥ۟ۤ"
            r3 = r1
            goto Lb
        L4a:
            short[] r1 = m6952()
            java.lang.String r6 = "ۨۨۦ"
            r5 = r1
            goto Lb
        L52:
            int r7 = kevin.fun.hook.audio.C1115.f404
            java.lang.String r1 = "ۥ۟ۧ"
            r6 = r1
            goto Lb
        L58:
            r1 = 48
            r4 = 774(0x306, float:1.085E-42)
            java.lang.String r1 = androidx.vectordrawable.animated.C1102.m3116(r5, r1, r9, r4)
            java.lang.String r6 = "ۣ۠ۡ"
            r4 = r1
            goto Lb
        L64:
            return r2
    }

    public android.net.Uri getTreeUri() {
            r3 = this;
            java.lang.String r1 = androidx.loader.C1099.m2872(r3)
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
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean r2 = androidx.activity.C1066.m488(r1)
            r0 = 1740(0x6cc, float:2.438E-42)
        L1a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L20;
                case 54: goto L25;
                case 471: goto L34;
                case 500: goto L28;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            if (r2 == 0) goto L25
            r0 = 1833(0x729, float:2.569E-42)
            goto L1a
        L25:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1a
        L28:
            r0 = 1864(0x748, float:2.612E-42)
        L2a:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L30;
                case 47483: goto L39;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L2a
        L34:
            android.net.Uri r0 = androidx.activity.C1063.m240(r1)
        L38:
            return r0
        L39:
            r0 = 0
            goto L38
    }

    public java.lang.String getTreeUriString() {
            r9 = this;
            r7 = 0
            r1 = 0
            java.lang.String r5 = "ۥۡۧ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        La:
            int r5 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r5) {
                case 56355: goto L19;
                case 56540: goto L36;
                case 1746721: goto L2f;
                case 1747871: goto L1f;
                case 1751555: goto L24;
                case 1752523: goto L12;
                default: goto L11;
            }
        L11:
            return r3
        L12:
            android.content.SharedPreferences r2 = m6951(r9)
            java.lang.String r5 = "ۣۧ"
            goto La
        L19:
            r7 = r6 ^ (-58)
            java.lang.String r5 = "ۤۡ۠"
            r8 = r7
            goto La
        L1f:
            int r6 = androidx.annotation.experimental.C1067.f93
            java.lang.String r5 = "ۡۤ"
            goto La
        L24:
            r0 = 62
            r5 = 1255(0x4e7, float:1.759E-42)
            java.lang.String r0 = androidx.loader.C1099.m2843(r4, r0, r8, r5)
            java.lang.String r5 = "۟۠ۢ"
            goto La
        L2f:
            java.lang.String r3 = androidx.loader.C1096.m2655(r2, r0, r1)
            java.lang.String r5 = "ۦۤۨ"
            goto La
        L36:
            short[] r4 = m6952()
            java.lang.String r5 = "۠ۦۥ"
            goto La
    }

    public boolean hasTreeUri() {
            r2 = this;
            java.lang.String r1 = androidx.loader.C1099.m2872(r2)
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L16;
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
            r0 = 1
        L15:
            return r0
        L16:
            r0 = 0
            goto L15
    }

    public void resetToDefault() {
            r6 = this;
            android.content.SharedPreferences r0 = m6951(r6)
            android.content.SharedPreferences$Editor r0 = androidx.emoji2.viewsintegration.C1078.m1386(r0)
            short[] r1 = m6952()
            r2 = 74
            int r3 = com.tencent.mmkv.C1109.f135
            r3 = r3 ^ (-492(0xfffffffffffffe14, float:NaN))
            r4 = 602(0x25a, float:8.44E-43)
            java.lang.String r1 = androidx.emoji2.C1080.m1525(r1, r2, r3, r4)
            android.content.SharedPreferences$Editor r0 = androidx.versionedparcelable.C1107.m3423(r0, r1)
            short[] r1 = m6952()
            r2 = 86
            int r3 = kevin.fun.hook.webdav.C1118.f417
            r3 = r3 ^ (-356(0xfffffffffffffe9c, float:NaN))
            r4 = 1630(0x65e, float:2.284E-42)
            java.lang.String r1 = org.luckypray.dexkit.C1124.m10545(r1, r2, r3, r4)
            short[] r2 = m6952()
            r3 = 95
            int r4 = androidx.customview.C1075.f101
            r4 = r4 ^ (-97)
            r5 = 2148(0x864, float:3.01E-42)
            java.lang.String r2 = androidx.loader.C1099.m2843(r2, r3, r4, r5)
            android.content.SharedPreferences$Editor r0 = androidx.core.C1073.m986(r0, r1, r2)
            androidx.vectordrawable.C1104.m3221(r0)
            int r1 = androidx.versionedparcelable.C1106.m3393()
            r0 = 1616(0x650, float:2.264E-42)
        L49:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L4f;
                case 49: goto L52;
                case 204: goto L57;
                case 239: goto L66;
                default: goto L4e;
            }
        L4e:
            goto L49
        L4f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L49
        L52:
            if (r1 < 0) goto L4f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L49
        L57:
            java.lang.String r0 = "9TU2KkmApNH0Mmf6hI"
            java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L66:
            return
    }

    public void setSavePath(java.lang.String r11) {
            r10 = this;
            r8 = 0
            r1 = 0
            java.lang.String r6 = "ۡۤۨ"
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
                case 1746788: goto L44;
                case 1747648: goto L35;
                case 1747896: goto L21;
                case 1748773: goto L4a;
                case 1748830: goto L52;
                case 1752550: goto L3c;
                case 1754411: goto L1a;
                case 1755342: goto L29;
                default: goto L12;
            }
        L12:
            short[] r1 = m6952()
            java.lang.String r6 = "۟ۢۧ"
            r3 = r1
            goto Lb
        L1a:
            androidx.vectordrawable.C1104.m3221(r4)
            java.lang.String r1 = "ۡۦۣ"
            r6 = r1
            goto Lb
        L21:
            android.content.SharedPreferences$Editor r1 = androidx.core.C1073.m986(r2, r5, r11)
            java.lang.String r6 = "ۧ۠ۤ"
            r4 = r1
            goto Lb
        L29:
            r1 = 100
            r5 = 1120(0x460, float:1.57E-42)
            java.lang.String r1 = androidx.loader.C1096.m2645(r3, r1, r9, r5)
            java.lang.String r6 = "۠ۧ۟"
            r5 = r1
            goto Lb
        L35:
            r8 = r7 ^ 438(0x1b6, float:6.14E-43)
            java.lang.String r1 = "ۨ۟ۥ"
            r6 = r1
            r9 = r8
            goto Lb
        L3c:
            android.content.SharedPreferences$Editor r1 = androidx.emoji2.viewsintegration.C1078.m1386(r0)
            java.lang.String r6 = "ۨۤۧ"
            r2 = r1
            goto Lb
        L44:
            int r7 = androidx.core.C1073.f99
            java.lang.String r1 = "۠۟۟"
            r6 = r1
            goto Lb
        L4a:
            android.content.SharedPreferences r0 = m6951(r10)
            java.lang.String r1 = "ۥۣۢ"
            r6 = r1
            goto Lb
        L52:
            return
    }

    public void setTreeUri(android.net.Uri r6, java.lang.String r7) {
            r5 = this;
            android.content.SharedPreferences r0 = m6951(r5)
            android.content.SharedPreferences$Editor r0 = androidx.emoji2.viewsintegration.C1078.m1386(r0)
            short[] r1 = m6952()
            r2 = 109(0x6d, float:1.53E-43)
            int r3 = androidx.vectordrawable.C1104.f130
            r3 = r3 ^ 607(0x25f, float:8.5E-43)
            r4 = 369(0x171, float:5.17E-43)
            java.lang.String r1 = androidx.loader.C1095.m2574(r1, r2, r3, r4)
            java.lang.String r2 = androidx.core.ktx.C1071.m871(r6)
            android.content.SharedPreferences$Editor r0 = androidx.core.C1073.m986(r0, r1, r2)
            short[] r1 = m6952()
            r2 = 121(0x79, float:1.7E-43)
            int r3 = androidx.loader.C1096.f122
            r3 = r3 ^ (-952(0xfffffffffffffc48, float:NaN))
            r4 = 849(0x351, float:1.19E-42)
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r1, r2, r3, r4)
            android.content.SharedPreferences$Editor r0 = androidx.core.C1073.m986(r0, r1, r7)
            androidx.vectordrawable.C1104.m3221(r0)
            int r1 = androidx.interpolator.C1081.m1643()
            r0 = 1616(0x650, float:2.264E-42)
        L3d:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L43;
                case 49: goto L46;
                case 204: goto L4b;
                case 239: goto L5a;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3d
        L46:
            if (r1 > 0) goto L43
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3d
        L4b:
            java.lang.String r0 = "ZqwPeIYeNHyHVLnWLBsRioktFB"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L5a:
            return
    }
}
