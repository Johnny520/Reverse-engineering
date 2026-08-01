package kevin.fun.hook.webdav;

/* JADX INFO: loaded from: classes.dex */
public class WebDAVDialog {
    private static final android.os.Handler MAIN_HANDLER = null;
    private static final int REQ_CODE_PICK_BACKUP_FILE = 10001;
    private static final java.lang.String TAG = null;
    private static android.widget.EditText passwordEditText;
    private static android.widget.EditText pathEditText;
    private static android.content.Context pendingContext;
    private static kevin.fun.hook.webdav.WebDAVConfig.BackupCallback pendingRestoreCallback;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f415short = null;
    private static android.widget.EditText urlEditText;
    private static android.widget.EditText usernameEditText;








    static {
            r0 = 429(0x1ad, float:6.01E-43)
            short[] r0 = new short[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [15233, 3034, 3060, 3047, 3064, 3071, 15232, 3027, 3056, 3058, 3066, 3044, 3041, -31367, 23439, 20780, 29419, 26876, 26978, 28073, 29419, 21383, 21836, 27563, 23479, 21888, 17018, 3241, 3241, 3241, 1115, 1108, 1118, 1096, 1109, 1107, 1118, 1044, 1107, 1108, 1102, 1119, 1108, 1102, 1044, 1115, 1113, 1102, 1107, 1109, 1108, 1044, 1141, 1130, 1151, 1140, 1125, 1150, 1141, 1145, 1135, 1143, 1151, 1140, 1134, 1357, 1346, 1352, 1374, 1347, 1349, 1352, 1282, 1349, 1346, 1368, 1353, 1346, 1368, 1282, 1359, 1357, 1368, 1353, 1355, 1347, 1374, 1365, 1282, 1379, 1404, 1385, 1378, 1389, 1390, 1376, 1385, 694, 679, 679, 699, 702, 692, 694, 675, 702, 696, 697, 760, 701, 676, 696, 697, 1983, 1968, 1978, 1964, 1969, 1975, 1978, 2032, 1966, 1964, 1969, 1960, 1975, 1978, 1979, 1964, 2032, 1979, 1958, 1962, 1964, 1983, 2032, 1943, 1936, 1943, 1930, 1943, 1951, 1938, 1921, 1931, 1932, 1943, 26160, 28421, 24963, 23760, 26199, 19750, -27687, 24889, 21944, 21381, 21838, 16916, 27879, 21896, 3243, 3243, 3243, 26660, -28998, 19266, 1345, 1345, 1345, 23971, 23400, 19506, 23460, 19550, 653, 653, 653, 24197, 18815, 18828, 26592, 24207, -11323, -10439, 3032, 27860, 23752, 21247, 17669, 24672, 20604, 24139, 18865, 20498, 18408, 26999, 20504, 10135, -103, 438, 449, 499, 500, 466, 471, 448, 438, 20231, 22673, 20331, 24205, 32650, 2690, 2805, 2759, 2752, 2790, 2787, 2804, 21433, 17475, 26988, 32130, 22697, -32042, 2023, 2005, 2002, 2036, 2033, 2022, 1936, 20608, 20720, 2412, 2416, 2416, 2420, 2423, 2366, 2347, 2347, 2401, 2428, 2405, 2409, 2420, 2408, 2401, 2346, 2407, 2411, 2409, 2347, 2400, 2405, 2418, 2347, -30172, 22607, 2020, 25164, 18749, 24306, 21446, 2884, 2922, 2937, 2918, 2913, 2893, 2926, 2924, 2916, 2938, 2943, 2848, 29771, 25428, 21870, 332, -28211, 31442, 2767, 2777, 2755, 2756, 2806, 2771, 2779, 2775, 2783, 2778, 2712, 2773, 2777, 2779, 21301, 28914, 2268, 27515, 28592, 28914, 1228, 1228, 1228, 1228, 1176, 1272, 1272, 1176, 1233, 1233, 1173, 1277, 1277, 1167, 1240, 1240, 1167, 1222, 1222, 17556, 25023, 17423, 21401, 17507, -2684, 22181, 28053, -31388, -32013, 17454, 21432, 17474, 12238, 2301, 21807, 22493, 23794, 27407, 32737, 28077, 27571, 20954, 17952, 27442, -29268, -30297, 26076, 19029, 24003, 19001, 19018, 25785, 24022, 22051, -27971, 27238, 22325, -26248, 30555, 20740, -31472, 2063, 2069, 2755, 2755, 2755, 2755, 2711, 2807, 2807, 2711, 2782, 2782, 2714, 2802, 2802, 2688, 2775, 2775, 2688, 2761, 2761, 19158, 28669, 25584, 21484, 24027, 18977, -1082, 24287, 26095, -29410, -30071, 26089, 22005, 23490, 19512, -29358, 24270, 22332, 1669, 1778, 1728, 1735, 1761, 1764, 1779, 1669, 20885, 20965, -32060, 20824, 22698, 31771, 27396, 23870, -29507, 24353, 22227, 23692, 32587, 1893, 25794, 24585, 32587} // fill-array
            kevin.fun.hook.webdav.WebDAVDialog.f415short = r0
            short[] r0 = m8424()
            r1 = 0
            int r2 = androidx.vectordrawable.C1105.f131
            r2 = r2 ^ 363(0x16b, float:5.09E-43)
            r3 = 2961(0xb91, float:4.149E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1920(r0, r1, r2, r3)
            kevin.fun.hook.webdav.WebDAVDialog.TAG = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.webdav.WebDAVDialog.MAIN_HANDLER = r0
            return
    }

    public WebDAVDialog() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            java.lang.String r0 = "Iv1Ko6SttwL9mvV5LxRGgYoC4h"
            java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$smshowSafeToast(android.content.Context r0, java.lang.String r1) {
            m8426(r0, r1)
            return
    }

    static /* bridge */ /* synthetic */ void _$$Nest$smupdateLocalStatusText(android.widget.TextView r2, android.content.Context r3) {
            m8438(r2, r3)
            int r1 = androidx.loader.C1096.m2651()
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
            java.lang.String r0 = "cDcaDorYGT8sBoDIHvjwm7ZP"
            java.lang.String r0 = androidx.lifecycle.livedata.C1086.m1925(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    private static android.view.View createDivider(android.content.Context r8) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۥۨۢ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746848: goto L41;
                case 1747657: goto L28;
                case 1749633: goto L4f;
                case 1752493: goto L38;
                case 1752616: goto L1e;
                case 1752674: goto L59;
                case 1752735: goto L2f;
                case 1753600: goto L48;
                case 1754568: goto L17;
                default: goto L10;
            }
        L10:
            int r5 = androidx.loader.C1096.f122
            java.lang.String r1 = "۟ۤۥ"
            r3 = r1
            r6 = r5
            goto L9
        L17:
            androidx.lifecycle.livedata.C1085.m1843(r2, r0)
            java.lang.String r1 = "۠۟ۨ"
            r3 = r1
            goto L9
        L1e:
            r1 = -1119107(0xffffffffffeeec7d, float:NaN)
            r5 = r1 ^ r6
            java.lang.String r1 = "ۦۥ۟"
            r3 = r1
            r7 = r5
            goto L9
        L28:
            int r5 = org.luckypray.dexkit.C1124.f434
            java.lang.String r1 = "ۥۤۧ"
            r3 = r1
            r6 = r5
            goto L9
        L2f:
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            java.lang.String r3 = "ۢۡ۠"
            r2 = r1
            goto L9
        L38:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r7, r4)
            java.lang.String r1 = "ۧۥۦ"
            r3 = r1
            goto L9
        L41:
            r5 = r6 ^ 958(0x3be, float:1.342E-42)
            java.lang.String r1 = "ۥ۠ۨ"
            r3 = r1
            r7 = r5
            goto L9
        L48:
            androidx.loader.C1099.m2849(r2, r7)
            java.lang.String r1 = "ۥۦۣ"
            r3 = r1
            goto L9
        L4f:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r4 = m8422(r8, r1)
            java.lang.String r1 = "ۧ۠ۤ"
            r3 = r1
            goto L9
        L59:
            return r2
    }

    private static android.widget.TextView createDouyinButton(android.content.Context r11, java.lang.String r12, int r13) {
            r10 = 1094713344(0x41400000, float:12.0)
            r9 = 1092616192(0x41200000, float:10.0)
            r1 = 0
            r6 = 0
            java.lang.String r4 = "ۤۥۡ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
            r8 = r6
        Le:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56447: goto L73;
                case 56479: goto L92;
                case 56538: goto L54;
                case 1746904: goto L1c;
                case 1746941: goto L2b;
                case 1747652: goto L6c;
                case 1747781: goto L89;
                case 1748702: goto L24;
                case 1748769: goto L5c;
                case 1749634: goto L43;
                case 1749733: goto L7a;
                case 1750533: goto L81;
                case 1750570: goto L37;
                case 1750602: goto L31;
                case 1750756: goto L65;
                case 1751680: goto L4b;
                default: goto L15;
            }
        L15:
            androidx.documentfile.C1076.m1233(r3, r8)
            java.lang.String r1 = "ۣ۟ۡ"
            r4 = r1
            goto Le
        L1c:
            android.graphics.drawable.GradientDrawable r1 = m8434(r11)
            java.lang.String r4 = "ۣ۠۟"
            r2 = r1
            goto Le
        L24:
            androidx.lifecycle.livedata.C1085.m1822(r3, r0)
            java.lang.String r1 = "۟ۦ۟"
            r4 = r1
            goto Le
        L2b:
            int r13 = androidx.core.C1072.f98
            java.lang.String r1 = "ۣۡۨ"
            r4 = r1
            goto Le
        L31:
            r8 = r13 ^ (-527(0xfffffffffffffdf1, float:NaN))
            java.lang.String r1 = "۟ۧۢ"
            r4 = r1
            goto Le
        L37:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r6, r1, r4)
            java.lang.String r1 = "ۡۢ۟"
            r4 = r1
            goto Le
        L43:
            int r5 = m8422(r11, r10)
            java.lang.String r1 = "ۧۡ"
            r4 = r1
            goto Le
        L4b:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r11)
            java.lang.String r4 = "ۣۤ"
            r3 = r1
            goto Le
        L54:
            int r7 = m8422(r11, r9)
            java.lang.String r1 = "ۣۦۧ"
            r4 = r1
            goto Le
        L5c:
            r1 = 1095761920(0x41500000, float:13.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r1)
            java.lang.String r1 = "ۢۤۧ"
            r4 = r1
            goto Le
        L65:
            kevin.fun.hook.audio.C1117.m8126(r3, r13, r8, r5, r7)
            java.lang.String r1 = "ۣ۠ۧ"
            r4 = r1
            goto Le
        L6c:
            androidx.core.C1073.m999(r3, r2)
            java.lang.String r1 = "ۥۤ"
            r4 = r1
            goto Le
        L73:
            androidx.lifecycle.process.C1087.m1946(r3, r12)
            java.lang.String r1 = "ۡۤۤ"
            r4 = r1
            goto Le
        L7a:
            kevin.fun.hook.webdav.C1118.m8517(r3, r13)
            java.lang.String r1 = "۟ۧۥ"
            r4 = r1
            goto Le
        L81:
            int r13 = m8422(r11, r10)
            java.lang.String r1 = "ۣ۠ۨ"
            r4 = r1
            goto Le
        L89:
            int r8 = m8422(r11, r9)
            java.lang.String r1 = "ۢۡۡ"
            r4 = r1
            goto Le
        L92:
            return r3
    }

    private static android.widget.LinearLayout createDouyinSwitchRow(android.content.Context r6, java.lang.String r7, boolean r8, java.util.function.Consumer<java.lang.Boolean> r9) {
            r5 = 0
            r4 = 1096810496(0x41600000, float:14.0)
            r3 = 1094713344(0x41400000, float:12.0)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r6)
            androidx.customview.C1074.m1119(r2, r5)
            int r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            r0 = r0 ^ (-107(0xffffffffffffff95, float:NaN))
            androidx.emoji2.C1080.m1542(r2, r0)
            int r0 = m8422(r6, r3)
            int r1 = m8422(r6, r4)
            int r3 = m8422(r6, r3)
            int r4 = m8422(r6, r4)
            androidx.drawerlayout.C1077.m1314(r2, r0, r1, r3, r4)
            android.graphics.drawable.GradientDrawable r0 = m8434(r6)
            androidx.activity.C1065.m397(r2, r0)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r6)
            androidx.lifecycle.process.C1087.m1946(r3, r7)
            r0 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r0)
            r0 = -14737578(0xffffffffff1f1f56, float:-2.1150996E38)
            int r1 = kevin.fun.hook.audio.C1117.f406
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r3, r0)
            android.graphics.Typeface r0 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r3, r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r1 = androidx.lifecycle.process.C1089.f115
            r1 = r1 ^ (-930(0xfffffffffffffc5e, float:NaN))
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r5, r1, r4)
            androidx.lifecycle.livedata.C1085.m1822(r3, r0)
            android.widget.Switch r4 = new android.widget.Switch
            r4.<init>(r6)
            androidx.lifecycle.process.C1089.m2130(r4, r8)
            int r0 = androidx.core.ktx.C1070.f96
            r0 = r0 ^ (-559(0xfffffffffffffdd1, float:NaN))
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            androidx.emoji2.viewsintegration.C1079.m1472(r4, r0)
            r0 = 1616(0x650, float:2.264E-42)
        L6e:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L74;
                case 49: goto L77;
                case 204: goto L7c;
                case 239: goto L8a;
                default: goto L73;
            }
        L73:
            goto L6e
        L74:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6e
        L77:
            if (r8 == 0) goto L74
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6e
        L7c:
            r0 = -43177(0xffffffffffff5757, float:NaN)
            r1 = 1740(0x6cc, float:2.438E-42)
        L81:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L87;
                case 54: goto L8d;
                default: goto L86;
            }
        L86:
            goto L81
        L87:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L81
        L8a:
            r0 = -2039584(0xffffffffffe0e0e0, float:NaN)
        L8d:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            kevin.fun.hook.webdav.C1118.m8476(r4, r0)
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda0 r0 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda0
            r0.<init>(r9, r4)
            androidx.core.C1073.m989(r4, r0)
            androidx.activity.C1064.m372(r2, r3)
            androidx.activity.C1064.m372(r2, r4)
            return r2
    }

    private static android.widget.LinearLayout createEditRow(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.util.function.Consumer<java.lang.String> r10, java.lang.String r11) {
            r6 = 1
            r4 = 1094713344(0x41400000, float:12.0)
            r5 = 0
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r7)
            androidx.customview.C1074.m1119(r1, r6)
            int r0 = m8422(r7, r4)
            int r2 = m8422(r7, r4)
            int r3 = m8422(r7, r4)
            int r4 = m8422(r7, r4)
            androidx.drawerlayout.C1077.m1314(r1, r0, r2, r3, r4)
            android.graphics.drawable.GradientDrawable r0 = m8434(r7)
            androidx.activity.C1065.m397(r1, r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            androidx.lifecycle.process.C1087.m1946(r0, r8)
            r2 = 1095761920(0x41500000, float:13.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r2)
            r2 = -10066145(0xffffffffff66671f, float:-3.0625787E38)
            int r3 = androidx.emoji2.C1080.f106
            r2 = r2 ^ r3
            kevin.fun.hook.webdav.C1118.m8517(r0, r2)
            r2 = 1086324736(0x40c00000, float:6.0)
            int r2 = m8422(r7, r2)
            kevin.fun.hook.audio.C1117.m8126(r0, r5, r5, r5, r2)
            androidx.activity.C1064.m372(r1, r0)
            android.widget.EditText r2 = new android.widget.EditText
            r2.<init>(r7)
            r0 = 1616(0x650, float:2.264E-42)
        L4f:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L55;
                case 49: goto L58;
                case 204: goto L5d;
                case 239: goto L60;
                default: goto L54;
            }
        L54:
            goto L4f
        L55:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L4f
        L58:
            if (r9 == 0) goto L55
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L4f
        L5d:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3825(r2, r9)
        L60:
            androidx.lifecycle.process.C1090.m2215(r2, r11)
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.emoji2.viewsintegration.C1079.m1452(r2, r0)
            r0 = 14737700(0xe0e124, float:2.0651916E-38)
            int r3 = kevin.fun.hook.C1120.f419
            r0 = r0 ^ r3
            androidx.vectordrawable.C1104.m3201(r2, r0)
            r0 = 0
            androidx.vectordrawable.animated.C1102.m3095(r2, r0)
            androidx.loader.C1099.m2834(r2, r6)
            kevin.fun.hook.webdav.WebDAVDialog$6 r0 = new kevin.fun.hook.webdav.WebDAVDialog$6
            r0.<init>(r10)
            androidx.lifecycle.process.C1090.m2207(r2, r0)
            androidx.activity.C1064.m372(r1, r2)
            android.view.View r0 = new android.view.View
            r0.<init>(r7)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = m8422(r7, r2)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r4 = androidx.core.ktx.C1070.f96
            r4 = r4 ^ (-559(0xfffffffffffffdd1, float:NaN))
            r3.<init>(r4, r2)
            androidx.lifecycle.livedata.C1085.m1843(r0, r3)
            r2 = -1119040(0xffffffffffeeecc0, float:NaN)
            int r3 = androidx.core.ktx.C1070.f96
            r2 = r2 ^ r3
            androidx.loader.C1099.m2849(r0, r2)
            r2 = 1082130432(0x40800000, float:4.0)
            int r2 = m8422(r7, r2)
            kevin.fun.hook.webdav.C1119.m8548(r0, r5, r2, r5, r5)
            androidx.activity.C1064.m372(r1, r0)
            return r1
    }

    private static android.widget.LinearLayout createPasswordRow(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.util.function.Consumer<java.lang.String> r11) {
            r7 = 1
            r4 = 1094713344(0x41400000, float:12.0)
            r6 = 0
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r8)
            androidx.customview.C1074.m1119(r1, r7)
            int r0 = m8422(r8, r4)
            int r2 = m8422(r8, r4)
            int r3 = m8422(r8, r4)
            int r4 = m8422(r8, r4)
            androidx.drawerlayout.C1077.m1314(r1, r0, r2, r3, r4)
            android.graphics.drawable.GradientDrawable r0 = m8434(r8)
            androidx.activity.C1065.m397(r1, r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            androidx.lifecycle.process.C1087.m1946(r0, r9)
            r2 = 1095761920(0x41500000, float:13.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r2)
            r2 = 10066046(0x99987e, float:1.4105535E-38)
            int r3 = com.tencent.mmkv.C1109.f135
            r2 = r2 ^ r3
            kevin.fun.hook.webdav.C1118.m8517(r0, r2)
            r2 = 1086324736(0x40c00000, float:6.0)
            int r2 = m8422(r8, r2)
            kevin.fun.hook.audio.C1117.m8126(r0, r6, r6, r6, r2)
            androidx.activity.C1064.m372(r1, r0)
            android.widget.EditText r2 = new android.widget.EditText
            r2.<init>(r8)
            r0 = 1616(0x650, float:2.264E-42)
        L4f:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L55;
                case 49: goto L58;
                case 204: goto L5d;
                case 239: goto L60;
                default: goto L54;
            }
        L54:
            goto L4f
        L55:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L4f
        L58:
            if (r10 == 0) goto L55
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L4f
        L5d:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3825(r2, r10)
        L60:
            short[] r0 = m8424()
            r3 = 13
            int r4 = androidx.loader.C1094.f120
            r4 = r4 ^ 380(0x17c, float:5.32E-43)
            r5 = 2794(0xaea, float:3.915E-42)
            java.lang.String r0 = com.tencent.mmkv.C1109.m3629(r0, r3, r4, r5)
            androidx.lifecycle.process.C1090.m2215(r2, r0)
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.emoji2.viewsintegration.C1079.m1452(r2, r0)
            r0 = -14737818(0xffffffffff1f1e66, float:-2.1150509E38)
            int r3 = androidx.emoji2.C1080.f106
            r0 = r0 ^ r3
            androidx.vectordrawable.C1104.m3201(r2, r0)
            r0 = 0
            androidx.vectordrawable.animated.C1102.m3095(r2, r0)
            androidx.loader.C1099.m2834(r2, r7)
            int r0 = androidx.versionedparcelable.C1106.f132
            r0 = r0 ^ 13
            androidx.lifecycle.livedata.C1086.m1922(r2, r0)
            kevin.fun.hook.webdav.WebDAVDialog$7 r0 = new kevin.fun.hook.webdav.WebDAVDialog$7
            r0.<init>(r11)
            androidx.lifecycle.process.C1090.m2207(r2, r0)
            androidx.activity.C1064.m372(r1, r2)
            android.view.View r0 = new android.view.View
            r0.<init>(r8)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = m8422(r8, r2)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r4 = androidx.startup.C1100.f126
            r4 = r4 ^ 277(0x115, float:3.88E-43)
            r3.<init>(r4, r2)
            androidx.lifecycle.livedata.C1085.m1843(r0, r3)
            r2 = -1118383(0xffffffffffeeef51, float:NaN)
            int r3 = androidx.core.C1073.f99
            r2 = r2 ^ r3
            androidx.loader.C1099.m2849(r0, r2)
            r2 = 1082130432(0x40800000, float:4.0)
            int r2 = m8422(r8, r2)
            kevin.fun.hook.webdav.C1119.m8548(r0, r6, r2, r6, r6)
            androidx.activity.C1064.m372(r1, r0)
            return r1
    }

    private static android.graphics.drawable.GradientDrawable createRippleDrawable(android.content.Context r2) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            androidx.lifecycle.livedata.C1085.m1879(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: dp */
    private static int m109dp(android.content.Context r8, float r9) {
            r1 = 0
            r6 = 0
            r4 = 0
            java.lang.String r3 = "ۢۢ۟"
            r0 = r1
            r2 = r1
            r5 = r6
            r7 = r6
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56295: goto L20;
                case 1750662: goto L2d;
                case 1750780: goto L3c;
                case 1751679: goto L18;
                case 1754469: goto L33;
                case 1755555: goto L25;
                default: goto L10;
            }
        L10:
            android.content.res.Resources r0 = androidx.emoji2.viewsintegration.C1078.m1401(r8)
            java.lang.String r1 = "ۤۥ۠"
            r3 = r1
            goto L9
        L18:
            android.util.DisplayMetrics r1 = androidx.activity.C1062.m159(r0)
            java.lang.String r3 = "ۧۢ۠"
            r2 = r1
            goto L9
        L20:
            int r4 = (int) r9
            java.lang.String r1 = "ۣۧ۠"
            r3 = r1
            goto L9
        L25:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r9 = r5 + r1
            java.lang.String r1 = "۟ۦ"
            r3 = r1
            goto L9
        L2d:
            float r5 = r9 * r7
            java.lang.String r1 = "ۨۦۡ"
            r3 = r1
            goto L9
        L33:
            float r6 = androidx.vectordrawable.animated.C1102.m3118(r2)
            java.lang.String r1 = "ۣۣۦ"
            r3 = r1
            r7 = r6
            goto L9
        L3c:
            return r4
    }

    public static void handleActivityResult(int r5, int r6, android.content.Intent r7) {
            r4 = 0
            r0 = 1616(0x650, float:2.264E-42)
        L3:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L9;
                case 49: goto Lc;
                case 204: goto L13;
                case 239: goto La7;
                default: goto L8;
            }
        L8:
            goto L3
        L9:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3
        Lc:
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r5 != r0) goto L9
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3
        L13:
            r0 = 1740(0x6cc, float:2.438E-42)
        L15:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1b;
                case 54: goto L21;
                case 471: goto La7;
                case 500: goto L24;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = -1
            if (r6 != r0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L15
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L15
        L24:
            r0 = 1864(0x748, float:2.612E-42)
        L26:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2c;
                case 47384: goto La7;
                case 47417: goto L36;
                case 47483: goto L32;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            if (r7 == 0) goto L32
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L26
        L32:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L26
        L36:
            android.net.Uri r1 = androidx.customview.C1074.m1121(r7)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L3d:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L45;
                case 45: goto La7;
                case 76: goto L4f;
                case 239: goto L49;
                default: goto L44;
            }
        L44:
            goto L3d
        L45:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L3d
        L49:
            if (r1 == 0) goto L45
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L3d
        L4f:
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r2 = m8432()
            r0 = 48891(0xbefb, float:6.8511E-41)
        L56:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 22: goto L5e;
                case 53: goto La7;
                case 503: goto L62;
                case 32495: goto L68;
                default: goto L5d;
            }
        L5d:
            goto L56
        L5e:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L56
        L62:
            if (r2 == 0) goto L5e
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L56
        L68:
            android.content.Context r2 = m8435()
            r0 = 49666(0xc202, float:6.9597E-41)
        L6f:
            r3 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 17: goto L77;
                case 50: goto L7d;
                case 76: goto L81;
                case 83: goto La7;
                default: goto L76;
            }
        L76:
            goto L6f
        L77:
            if (r2 == 0) goto L7d
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L6f
        L7d:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L6f
        L81:
            android.content.Context r0 = m8435()     // Catch: java.lang.Exception -> Ld4
            android.content.ContentResolver r0 = androidx.activity.C1063.m246(r0)     // Catch: java.lang.Exception -> Ld4
            r2 = 1
            kevin.fun.hook.webdav.C1119.m110(r0, r1, r2)     // Catch: java.lang.Exception -> Ld4
            r0 = 49790(0xc27e, float:6.977E-41)
        L90:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 18: goto L98;
                case 241: goto Lbc;
                default: goto L97;
            }
        L97:
            goto L90
        L98:
            android.content.Context r0 = m8435()
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r2 = m8432()
            androidx.startup.C1101.m2997(r0, r1, r2)
            kevin.fun.hook.webdav.WebDAVDialog.pendingRestoreCallback = r4
            kevin.fun.hook.webdav.WebDAVDialog.pendingContext = r4
        La7:
            int r1 = androidx.loader.C1096.m2651()
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lae:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto Lb6;
                case 1711: goto Lc0;
                case 1736: goto Ld3;
                case 1769: goto Lc4;
                default: goto Lb5;
            }
        Lb5:
            goto Lae
        Lb6:
            if (r1 < 0) goto Lc0
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Lae
        Lbc:
            r0 = 49821(0xc29d, float:6.9814E-41)
            goto L90
        Lc0:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Lae
        Lc4:
            java.lang.String r0 = "Hr"
            java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        Ld3:
            return
        Ld4:
            r0 = move-exception
            goto L98
    }

    static /* synthetic */ void lambda$0(android.content.Context r4, android.widget.TextView r5, android.view.View r6) {
            short[] r0 = m8424()
            r1 = 21
            int r2 = androidx.loader.C1094.f120
            r2 = r2 ^ 381(0x17d, float:5.34E-43)
            r3 = 3207(0xc87, float:4.494E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2044(r0, r1, r2, r3)
            m8426(r4, r0)
            kevin.fun.hook.webdav.WebDAVDialog$1 r0 = new kevin.fun.hook.webdav.WebDAVDialog$1
            r0.<init>(r4, r5)
            kevin.fun.hook.webdav.C1119.m8575(r4, r0)
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L21:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L27;
                case 49: goto L2a;
                case 204: goto L2f;
                case 239: goto L3e;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L21
        L2a:
            if (r1 > 0) goto L27
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L21
        L2f:
            java.lang.String r0 = "tsEsOIIwAmvX"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
    }

    static /* synthetic */ void lambda$1(android.content.Context r6, android.widget.TextView r7, android.app.Dialog r8, android.view.View r9) {
            android.content.Intent r1 = new android.content.Intent
            short[] r0 = m8424()
            r2 = 30
            int r3 = androidx.vectordrawable.C1105.f131
            r3 = r3 ^ 325(0x145, float:4.55E-43)
            r4 = 1082(0x43a, float:1.516E-42)
            java.lang.String r0 = androidx.lifecycle.process.C1087.m2008(r0, r2, r3, r4)
            r1.<init>(r0)
            short[] r0 = m8424()
            r2 = 65
            int r3 = androidx.lifecycle.livedata.C1086.f112
            r3 = r3 ^ 921(0x399, float:1.29E-42)
            r4 = 1324(0x52c, float:1.855E-42)
            java.lang.String r0 = androidx.core.C1072.m957(r0, r2, r3, r4)
            androidx.activity.C1064.m317(r1, r0)
            short[] r0 = m8424()
            r2 = 97
            int r3 = androidx.appcompat.resources.C1068.f94
            r3 = r3 ^ 542(0x21e, float:7.6E-43)
            r4 = 727(0x2d7, float:1.019E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1796(r0, r2, r3, r4)
            androidx.lifecycle.process.C1088.m2043(r1, r0)
            kevin.fun.hook.DownloadPathConfig r0 = new kevin.fun.hook.DownloadPathConfig
            r0.<init>(r6)
            android.net.Uri r2 = kevin.fun.hook.audio.C1116.m8042(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L46:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L4c;
                case 49: goto L4f;
                case 204: goto L54;
                case 239: goto L67;
                default: goto L4b;
            }
        L4b:
            goto L46
        L4c:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L46
        L4f:
            if (r2 == 0) goto L4c
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L46
        L54:
            short[] r0 = m8424()
            r3 = 113(0x71, float:1.58E-43)
            int r4 = androidx.loader.C1099.f125
            r4 = r4 ^ 889(0x379, float:1.246E-42)
            r5 = 2014(0x7de, float:2.822E-42)
            java.lang.String r0 = kevin.fun.hook.C1120.m8645(r0, r3, r4, r5)
            androidx.loader.C1096.m2684(r1, r0, r2)
        L67:
            boolean r2 = r6 instanceof android.app.Activity
            r0 = 1740(0x6cc, float:2.438E-42)
        L6b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L71;
                case 54: goto L76;
                case 471: goto L9a;
                case 500: goto L79;
                default: goto L70;
            }
        L70:
            goto L6b
        L71:
            if (r2 == 0) goto L76
            r0 = 1833(0x729, float:2.569E-42)
            goto L6b
        L76:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L6b
        L79:
            kevin.fun.hook.webdav.WebDAVDialog$2 r0 = new kevin.fun.hook.webdav.WebDAVDialog$2
            r0.<init>(r6, r7)
            kevin.fun.hook.webdav.WebDAVDialog.pendingRestoreCallback = r0
            kevin.fun.hook.webdav.WebDAVDialog.pendingContext = r6
            android.app.Activity r6 = (android.app.Activity) r6
            int r0 = androidx.vectordrawable.C1104.f130
            r0 = r0 ^ 9538(0x2542, float:1.3366E-41)
            androidx.core.C1073.m1046(r6, r1, r0)
            androidx.customview.C1074.m1118(r8)
            r0 = 1864(0x748, float:2.612E-42)
        L90:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L96;
                case 47483: goto Lad;
                default: goto L95;
            }
        L95:
            goto L90
        L96:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L90
        L9a:
            short[] r0 = m8424()
            r1 = 147(0x93, float:2.06E-43)
            int r2 = androidx.documentfile.C1076.f102
            r2 = r2 ^ (-593(0xfffffffffffffdaf, float:NaN))
            r3 = 976(0x3d0, float:1.368E-42)
            java.lang.String r0 = androidx.loader.C1096.m2645(r0, r1, r2, r3)
            m8426(r6, r0)
        Lad:
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lb4:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto Lbc;
                case 45: goto Ld5;
                case 76: goto Lc6;
                case 239: goto Lc0;
                default: goto Lbb;
            }
        Lbb:
            goto Lb4
        Lbc:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto Lb4
        Lc0:
            if (r1 < 0) goto Lbc
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto Lb4
        Lc6:
            java.lang.String r0 = "YPBZ0whVyaFWU3S"
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8480(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        Ld5:
            return
    }

    static /* synthetic */ void lambda$10(android.content.Context r4, android.view.View r5) {
            java.lang.String r1 = m8430()
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
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            m8426(r4, r1)
            int r1 = androidx.core.C1072.m980()
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
            if (r1 > 0) goto L28
            r0 = 1833(0x729, float:2.569E-42)
            goto L1d
        L28:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "2vvY2DgpOwNLzib3I7"
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1770(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
        L3b:
            short[] r0 = m8424()
            r1 = 156(0x9c, float:2.19E-43)
            int r2 = androidx.lifecycle.process.C1089.f115
            r2 = r2 ^ 936(0x3a8, float:1.312E-42)
            r3 = 3205(0xc85, float:4.491E-42)
            java.lang.String r0 = androidx.interpolator.C1081.m1616(r0, r1, r2, r3)
            m8426(r4, r0)
            kevin.fun.hook.webdav.WebDAVDialog$5 r0 = new kevin.fun.hook.webdav.WebDAVDialog$5
            r0.<init>(r4)
            androidx.annotation.experimental.C1067.m551(r4, r0)
            goto L3a
    }

    static /* synthetic */ void lambda$11(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$12(android.app.Dialog r2, android.view.View r3) {
            androidx.customview.C1074.m1118(r2)
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            java.lang.String r0 = "cnQLCeLZx"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* synthetic */ void lambda$13(java.util.function.Consumer r2, android.widget.Switch r3, android.widget.CompoundButton r4, boolean r5) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L17;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r2 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            java.lang.Boolean r0 = androidx.loader.C1096.m2664(r5)
            kevin.fun.hook.C1120.m8643(r2, r0)
        L17:
            int r0 = androidx.lifecycle.process.C1091.f117
            r0 = r0 ^ 491(0x1eb, float:6.88E-43)
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            androidx.emoji2.viewsintegration.C1079.m1472(r3, r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L2f;
                case 471: goto L41;
                case 500: goto L32;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            if (r5 == 0) goto L2f
            r0 = 1833(0x729, float:2.569E-42)
            goto L24
        L2f:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L24
        L32:
            r0 = -43177(0xffffffffffff5757, float:NaN)
            r1 = 1864(0x748, float:2.612E-42)
        L37:
            r1 = r1 ^ 1881(0x759, float:2.636E-42)
            switch(r1) {
                case 17: goto L3d;
                case 47483: goto L44;
                default: goto L3c;
            }
        L3c:
            goto L37
        L3d:
            r1 = 48674(0xbe22, float:6.8207E-41)
            goto L37
        L41:
            r0 = -2039584(0xffffffffffe0e0e0, float:NaN)
        L44:
            android.content.res.ColorStateList r0 = androidx.lifecycle.process.C1088.m2050(r0)
            kevin.fun.hook.webdav.C1118.m8476(r3, r0)
            return
    }

    static /* synthetic */ void lambda$14(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r1, r2, r0)     // Catch: java.lang.Throwable -> L14
            androidx.viewpager.C1108.m3524(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L11;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            return
        L11:
            r0 = 1647(0x66f, float:2.308E-42)
            goto La
        L14:
            r0 = move-exception
            goto L10
    }

    static /* synthetic */ void lambda$2(java.lang.Boolean r2) {
            boolean r0 = androidx.activity.C1064.m381(r2)
            androidx.appcompat.C1069.m739(r0)
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            if (r1 > 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.lang.String r0 = "u2wulfJaFIgY0QEDLzqfR"
            java.lang.String r0 = androidx.vectordrawable.C1104.m3213(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    static /* synthetic */ void lambda$3(java.lang.Boolean r1) {
            boolean r0 = androidx.activity.C1064.m381(r1)
            androidx.loader.C1094.m2478(r0)
            return
    }

    static /* synthetic */ void lambda$8(android.content.Context r4, android.view.View r5) {
            java.lang.String r1 = m8430()
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
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            m8426(r4, r1)
            int r1 = androidx.appcompat.C1069.m747()
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
            java.lang.String r0 = "kfHK9bYDyJuTNAOS"
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3070(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
        L3b:
            short[] r0 = m8424()
            r1 = 164(0xa4, float:2.3E-43)
            int r2 = androidx.lifecycle.livedata.C1085.f111
            r2 = r2 ^ 779(0x30b, float:1.092E-42)
            r3 = 1391(0x56f, float:1.949E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1796(r0, r1, r2, r3)
            m8426(r4, r0)
            kevin.fun.hook.webdav.WebDAVDialog$3 r0 = new kevin.fun.hook.webdav.WebDAVDialog$3
            r0.<init>(r4)
            kevin.fun.hook.audio.C1116.m8055(r4, r0)
            goto L3a
    }

    static /* synthetic */ void lambda$9(android.content.Context r4, android.widget.TextView r5, android.view.View r6) {
            java.lang.String r1 = m8430()
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
            if (r1 == 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            m8426(r4, r1)
        L17:
            return
        L18:
            short[] r0 = m8424()
            r1 = 170(0xaa, float:2.38E-43)
            int r2 = androidx.activity.C1063.f89
            r2 = r2 ^ 10
            r3 = 675(0x2a3, float:9.46E-43)
            java.lang.String r0 = com.tencent.mmkv.C1109.m3629(r0, r1, r2, r3)
            m8426(r4, r0)
            kevin.fun.hook.webdav.WebDAVDialog$4 r0 = new kevin.fun.hook.webdav.WebDAVDialog$4
            r0.<init>(r4, r5)
            androidx.versionedparcelable.C1106.m3358(r4, r0)
            goto L17
    }

    public static void showConfigDialog(android.content.Context r13) {
            r12 = 1
            android.app.Dialog r1 = new android.app.Dialog     // Catch: java.lang.Throwable -> L59d
            r0 = 16974642(0x1030332, float:2.4063193E-38)
            int r2 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> L59d
            r0 = r0 ^ r2
            r1.<init>(r13, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 1
            androidx.lifecycle.runtime.C1092.m2297(r1, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.FrameLayout r2 = new android.widget.FrameLayout     // Catch: java.lang.Throwable -> L59d
            r2.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L59d
            int r3 = androidx.core.ktx.C1070.f96     // Catch: java.lang.Throwable -> L59d
            r3 = r3 ^ (-559(0xfffffffffffffdd1, float:NaN))
            r0.<init>(r3, r3)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1091.m2273(r2, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = -2147483271(0xffffffff80000179, float:-5.28E-43)
            int r4 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> L59d
            r0 = r0 ^ r4
            androidx.lifecycle.livedata.C1084.m1783(r2, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L59d
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            r0 = 1
            androidx.customview.C1074.m1119(r4, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = m8422(r13, r0)     // Catch: java.lang.Throwable -> L59d
            r5 = 1094713344(0x41400000, float:12.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            r6 = 1098907648(0x41800000, float:16.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r7 = 1101004800(0x41a00000, float:20.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.drawerlayout.C1077.m1314(r4, r0, r5, r6, r7)     // Catch: java.lang.Throwable -> L59d
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L59d
            int r5 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L59d
            r5 = r5 ^ 363(0x16b, float:5.09E-43)
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L59d
            r5 = 80
            r0.gravity = r5     // Catch: java.lang.Throwable -> L59d
            androidx.vectordrawable.C1105.m3296(r4, r0)     // Catch: java.lang.Throwable -> L59d
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L59d
            r0.<init>()     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1085.m1879(r0, r3)     // Catch: java.lang.Throwable -> L59d
            r3 = 8
            float[] r3 = new float[r3]     // Catch: java.lang.Throwable -> L59d
            r5 = 0
            r6 = 1098907648(0x41800000, float:16.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L59d
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            r5 = 1
            r6 = 1098907648(0x41800000, float:16.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L59d
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            r5 = 2
            r6 = 1098907648(0x41800000, float:16.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L59d
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            r5 = 3
            r6 = 1098907648(0x41800000, float:16.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L59d
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            r5 = 4
            r6 = 0
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            r5 = 5
            r6 = 0
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            r5 = 6
            r6 = 0
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            r5 = 7
            r6 = 0
            r3[r5] = r6     // Catch: java.lang.Throwable -> L59d
            androidx.vectordrawable.C1103.m3187(r0, r3)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1065.m397(r4, r0)     // Catch: java.lang.Throwable -> L59d
            android.view.View r0 = new android.view.View     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L59d
            r5 = 1109393408(0x42200000, float:40.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            r6 = 1082130432(0x40800000, float:4.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r3.<init>(r5, r6)     // Catch: java.lang.Throwable -> L59d
            r5 = 1
            r3.gravity = r5     // Catch: java.lang.Throwable -> L59d
            r5 = 1094713344(0x41400000, float:12.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            r3.topMargin = r5     // Catch: java.lang.Throwable -> L59d
            r5 = 1090519040(0x41000000, float:8.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            r3.bottomMargin = r5     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1085.m1843(r0, r3)     // Catch: java.lang.Throwable -> L59d
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L59d
            r3.<init>()     // Catch: java.lang.Throwable -> L59d
            r5 = -2039196(0xffffffffffe0e264, float:NaN)
            int r6 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L59d
            r5 = r5 ^ r6
            androidx.lifecycle.livedata.C1085.m1879(r3, r5)     // Catch: java.lang.Throwable -> L59d
            r5 = 1073741824(0x40000000, float:2.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1091.m2252(r3, r5)     // Catch: java.lang.Throwable -> L59d
            androidx.core.ktx.C1070.m781(r0, r3)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            r3 = 0
            androidx.customview.C1074.m1119(r0, r3)     // Catch: java.lang.Throwable -> L59d
            int r3 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L59d
            r3 = r3 ^ (-91)
            androidx.emoji2.C1080.m1542(r0, r3)     // Catch: java.lang.Throwable -> L59d
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = m8422(r13, r3)     // Catch: java.lang.Throwable -> L59d
            r5 = 1090519040(0x41000000, float:8.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.drawerlayout.C1077.m1314(r0, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L59d
            android.widget.TextView r3 = new android.widget.TextView     // Catch: java.lang.Throwable -> L59d
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            short[] r5 = m8424()     // Catch: java.lang.Throwable -> L59d
            r6 = 178(0xb2, float:2.5E-43)
            int r7 = androidx.drawerlayout.C1077.f103     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ 283(0x11b, float:3.97E-43)
            r8 = 1922(0x782, float:2.693E-42)
            java.lang.String r5 = kevin.fun.hook.webdav.C1119.m8576(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1087.m1946(r3, r5)     // Catch: java.lang.Throwable -> L59d
            r5 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r3, r5)     // Catch: java.lang.Throwable -> L59d
            android.graphics.Typeface r5 = androidx.emoji2.C1080.m1508()     // Catch: java.lang.Throwable -> L59d
            androidx.customview.C1074.m47(r3, r5)     // Catch: java.lang.Throwable -> L59d
            r5 = -14738036(0xffffffffff1f1d8c, float:-2.1150067E38)
            int r6 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> L59d
            r5 = r5 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r3, r5)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L59d
            r6 = 0
            int r7 = androidx.interpolator.C1082.f108     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ (-351(0xfffffffffffffea1, float:NaN))
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1085.m1822(r3, r5)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r0, r3)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.ScrollView r3 = new android.widget.ScrollView     // Catch: java.lang.Throwable -> L59d
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L59d
            r5 = 1140457472(0x43fa0000, float:500.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            int r6 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L59d
            r6 = r6 ^ 236(0xec, float:3.31E-43)
            r0.<init>(r6, r5)     // Catch: java.lang.Throwable -> L59d
            androidx.appcompat.resources.C1068.m659(r3, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L59d
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            r0 = 1
            androidx.customview.C1074.m1119(r5, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = m8422(r13, r0)     // Catch: java.lang.Throwable -> L59d
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r7 = 1090519040(0x41000000, float:8.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = m8422(r13, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.drawerlayout.C1077.m1314(r5, r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            short[] r6 = m8424()     // Catch: java.lang.Throwable -> L59d
            r7 = 183(0xb7, float:2.56E-43)
            int r8 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ (-366(0xfffffffffffffe92, float:NaN))
            r9 = 3064(0xbf8, float:4.294E-42)
            java.lang.String r6 = kevin.fun.hook.C1120.m8645(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1087.m1946(r0, r6)     // Catch: java.lang.Throwable -> L59d
            r6 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r6)     // Catch: java.lang.Throwable -> L59d
            android.graphics.Typeface r6 = androidx.emoji2.C1080.m1508()     // Catch: java.lang.Throwable -> L59d
            androidx.customview.C1074.m47(r0, r6)     // Catch: java.lang.Throwable -> L59d
            r6 = 13421614(0xcccc2e, float:1.8807687E-38)
            int r7 = org.luckypray.dexkit.C1125.f435     // Catch: java.lang.Throwable -> L59d
            r6 = r6 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r0, r6)     // Catch: java.lang.Throwable -> L59d
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = m8422(r13, r8)     // Catch: java.lang.Throwable -> L59d
            r9 = 1090519040(0x41000000, float:8.0)
            int r9 = m8422(r13, r9)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.audio.C1117.m8126(r0, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            r6 = 0
            androidx.customview.C1074.m1119(r0, r6)     // Catch: java.lang.Throwable -> L59d
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r7 = 1082130432(0x40800000, float:4.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = m8422(r13, r8)     // Catch: java.lang.Throwable -> L59d
            r9 = 1090519040(0x41000000, float:8.0)
            int r9 = m8422(r13, r9)     // Catch: java.lang.Throwable -> L59d
            androidx.drawerlayout.C1077.m1314(r0, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            short[] r6 = m8424()     // Catch: java.lang.Throwable -> L59d
            r7 = 190(0xbe, float:2.66E-43)
            int r8 = androidx.documentfile.C1076.f102     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ (-606(0xfffffffffffffda2, float:NaN))
            r9 = 1868(0x74c, float:2.618E-42)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3697(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            r7 = -11751971(0xffffffffff4caddd, float:-2.7206526E38)
            int r8 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ r8
            android.widget.TextView r6 = m8423(r13, r6, r7)     // Catch: java.lang.Throwable -> L59d
            short[] r7 = m8424()     // Catch: java.lang.Throwable -> L59d
            r8 = 194(0xc2, float:2.72E-43)
            int r9 = androidx.lifecycle.process.C1090.f116     // Catch: java.lang.Throwable -> L59d
            r9 = r9 ^ (-428(0xfffffffffffffe54, float:NaN))
            r10 = 2325(0x915, float:3.258E-42)
            java.lang.String r7 = androidx.documentfile.C1076.m1234(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L59d
            r8 = -14576128(0xffffffffff219600, float:-2.1478455E38)
            int r9 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ r9
            android.widget.TextView r7 = m8423(r13, r7, r8)     // Catch: java.lang.Throwable -> L59d
            android.widget.TextView r8 = new android.widget.TextView     // Catch: java.lang.Throwable -> L59d
            r8.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda6 r9 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda6     // Catch: java.lang.Throwable -> L59d
            r9.<init>(r13, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1086.m1916(r6, r9)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda10 r9 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda10     // Catch: java.lang.Throwable -> L59d
            r9.<init>(r13, r8, r1)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1086.m1916(r7, r9)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r0, r6)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r0, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 1093664768(0x41300000, float:11.0)
            androidx.vectordrawable.animated.C1102.m3105(r8, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 6710693(0x6665a5, float:9.403684E-39)
            int r6 = androidx.loader.C1095.f121     // Catch: java.lang.Throwable -> L59d
            r0 = r0 ^ r6
            kevin.fun.hook.webdav.C1118.m8517(r8, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 1094713344(0x41400000, float:12.0)
            int r0 = m8422(r13, r0)     // Catch: java.lang.Throwable -> L59d
            r6 = 1082130432(0x40800000, float:4.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r7 = 1090519040(0x41000000, float:8.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            r9 = 1094713344(0x41400000, float:12.0)
            int r9 = m8422(r13, r9)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.audio.C1117.m8126(r8, r0, r6, r7, r9)     // Catch: java.lang.Throwable -> L59d
            m8438(r8, r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r8)     // Catch: java.lang.Throwable -> L59d
            android.view.View r0 = m8437(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            short[] r6 = m8424()     // Catch: java.lang.Throwable -> L59d
            r7 = 198(0xc6, float:2.77E-43)
            int r8 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ (-360(0xfffffffffffffe98, float:NaN))
            r9 = 406(0x196, float:5.69E-43)
            java.lang.String r6 = androidx.loader.C1098.m2787(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1087.m1946(r0, r6)     // Catch: java.lang.Throwable -> L59d
            r6 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r6)     // Catch: java.lang.Throwable -> L59d
            android.graphics.Typeface r6 = androidx.emoji2.C1080.m1508()     // Catch: java.lang.Throwable -> L59d
            androidx.customview.C1074.m47(r0, r6)     // Catch: java.lang.Throwable -> L59d
            r6 = 13421737(0xcccca9, float:1.880786E-38)
            int r7 = androidx.customview.C1075.f101     // Catch: java.lang.Throwable -> L59d
            r6 = r6 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r0, r6)     // Catch: java.lang.Throwable -> L59d
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = m8422(r13, r6)     // Catch: java.lang.Throwable -> L59d
            r7 = 1094713344(0x41400000, float:12.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = m8422(r13, r8)     // Catch: java.lang.Throwable -> L59d
            r9 = 1090519040(0x41000000, float:8.0)
            int r9 = m8422(r13, r9)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.audio.C1117.m8126(r0, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            short[] r0 = m8424()     // Catch: java.lang.Throwable -> L59d
            r6 = 211(0xd3, float:2.96E-43)
            int r7 = kevin.fun.hook.C1120.f419     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ (-462(0xfffffffffffffe32, float:NaN))
            r8 = 2722(0xaa2, float:3.814E-42)
            java.lang.String r0 = androidx.loader.C1098.m2787(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            boolean r6 = androidx.lifecycle.process.C1091.m2270()     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda11 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda11     // Catch: java.lang.Throwable -> L59d
            r7.<init>()     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r0 = m8425(r13, r0, r6, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            android.view.View r0 = m8437(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            short[] r0 = m8424()     // Catch: java.lang.Throwable -> L59d
            r6 = 220(0xdc, float:3.08E-43)
            int r7 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ 934(0x3a6, float:1.309E-42)
            r8 = 2750(0xabe, float:3.854E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            boolean r6 = androidx.customview.C1074.m1084()     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda12 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda12     // Catch: java.lang.Throwable -> L59d
            r7.<init>()     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r0 = m8425(r13, r0, r6, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            android.view.View r0 = m8437(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            short[] r0 = m8424()     // Catch: java.lang.Throwable -> L59d
            r6 = 226(0xe2, float:3.17E-43)
            int r7 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ 759(0x2f7, float:1.064E-42)
            r8 = 1968(0x7b0, float:2.758E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            java.lang.String r6 = androidx.versionedparcelable.C1107.m3488()     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda13 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda13     // Catch: java.lang.Throwable -> L59d
            r7.<init>()     // Catch: java.lang.Throwable -> L59d
            short[] r8 = m8424()     // Catch: java.lang.Throwable -> L59d
            r9 = 235(0xeb, float:3.3E-43)
            int r10 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> L59d
            r10 = r10 ^ (-371(0xfffffffffffffe8d, float:NaN))
            r11 = 2308(0x904, float:3.234E-42)
            java.lang.String r8 = androidx.vectordrawable.C1103.m3132(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r6 = m8431(r13, r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L59d
            int r7 = androidx.loader.C1098.m2812(r6)     // Catch: java.lang.Throwable -> L59d
            r0 = 1616(0x650, float:2.264E-42)
        L360:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L366;
                case 49: goto L369;
                case 204: goto L36e;
                case 239: goto L38e;
                default: goto L365;
            }     // Catch: java.lang.Throwable -> L59d
        L365:
            goto L360
        L366:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L360
        L369:
            if (r7 <= r12) goto L366
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L360
        L36e:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            boolean r7 = r0 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L59d
            r0 = 1740(0x6cc, float:2.438E-42)
        L377:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L37d;
                case 54: goto L382;
                case 471: goto L38e;
                case 500: goto L385;
                default: goto L37c;
            }     // Catch: java.lang.Throwable -> L59d
        L37c:
            goto L377
        L37d:
            if (r7 == 0) goto L382
            r0 = 1833(0x729, float:2.569E-42)
            goto L377
        L382:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L377
        L385:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.EditText r0 = (android.widget.EditText) r0     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog.urlEditText = r0     // Catch: java.lang.Throwable -> L59d
        L38e:
            android.view.View r0 = m8437(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            short[] r0 = m8424()     // Catch: java.lang.Throwable -> L59d
            r6 = 259(0x103, float:3.63E-43)
            int r7 = androidx.lifecycle.process.C1087.f113     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ (-617(0xfffffffffffffd97, float:NaN))
            r8 = 1995(0x7cb, float:2.796E-42)
            java.lang.String r0 = androidx.core.ktx.C1071.m874(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            java.lang.String r6 = androidx.appcompat.resources.C1068.m646()     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda14 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda14     // Catch: java.lang.Throwable -> L59d
            r7.<init>()     // Catch: java.lang.Throwable -> L59d
            short[] r8 = m8424()     // Catch: java.lang.Throwable -> L59d
            r9 = 266(0x10a, float:3.73E-43)
            int r10 = androidx.versionedparcelable.C1107.f133     // Catch: java.lang.Throwable -> L59d
            r10 = r10 ^ 648(0x288, float:9.08E-43)
            r11 = 2831(0xb0f, float:3.967E-42)
            java.lang.String r8 = androidx.emoji2.viewsintegration.C1079.m1457(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r6 = m8431(r13, r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L59d
            int r7 = androidx.loader.C1098.m2812(r6)     // Catch: java.lang.Throwable -> L59d
            r0 = 1864(0x748, float:2.612E-42)
        L3cb:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L3d1;
                case 47384: goto L400;
                case 47417: goto L3db;
                case 47483: goto L3d7;
                default: goto L3d0;
            }     // Catch: java.lang.Throwable -> L59d
        L3d0:
            goto L3cb
        L3d1:
            if (r7 <= r12) goto L3d7
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L3cb
        L3d7:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L3cb
        L3db:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            boolean r7 = r0 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L59d
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L3e5:
            r8 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r8
            switch(r0) {
                case 14: goto L3ed;
                case 45: goto L400;
                case 76: goto L3f7;
                case 239: goto L3f1;
                default: goto L3ec;
            }     // Catch: java.lang.Throwable -> L59d
        L3ec:
            goto L3e5
        L3ed:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L3e5
        L3f1:
            if (r7 == 0) goto L3ed
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L3e5
        L3f7:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.EditText r0 = (android.widget.EditText) r0     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog.pathEditText = r0     // Catch: java.lang.Throwable -> L59d
        L400:
            android.view.View r0 = m8437(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            short[] r0 = m8424()     // Catch: java.lang.Throwable -> L59d
            r6 = 278(0x116, float:3.9E-43)
            int r7 = androidx.activity.C1062.f88     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ (-77)
            r8 = 355(0x163, float:4.97E-43)
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8509(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            java.lang.String r6 = androidx.drawerlayout.C1077.m1292()     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda1 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L59d
            r7.<init>()     // Catch: java.lang.Throwable -> L59d
            short[] r8 = m8424()     // Catch: java.lang.Throwable -> L59d
            r9 = 284(0x11c, float:3.98E-43)
            int r10 = androidx.lifecycle.viewmodel.C1093.f119     // Catch: java.lang.Throwable -> L59d
            r10 = r10 ^ (-124(0xffffffffffffff84, float:NaN))
            r11 = 2742(0xab6, float:3.842E-42)
            java.lang.String r8 = androidx.customview.C1075.m1138(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r6 = m8431(r13, r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L59d
            int r7 = androidx.loader.C1098.m2812(r6)     // Catch: java.lang.Throwable -> L59d
            r0 = 48891(0xbefb, float:6.8511E-41)
        L43e:
            r8 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r8
            switch(r0) {
                case 22: goto L446;
                case 53: goto L475;
                case 503: goto L44a;
                case 32495: goto L450;
                default: goto L445;
            }     // Catch: java.lang.Throwable -> L59d
        L445:
            goto L43e
        L446:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto L43e
        L44a:
            if (r7 <= r12) goto L446
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto L43e
        L450:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            boolean r7 = r0 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L59d
            r0 = 49666(0xc202, float:6.9597E-41)
        L45a:
            r8 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r8
            switch(r0) {
                case 17: goto L462;
                case 50: goto L468;
                case 76: goto L46c;
                case 83: goto L475;
                default: goto L461;
            }     // Catch: java.lang.Throwable -> L59d
        L461:
            goto L45a
        L462:
            if (r7 == 0) goto L468
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L45a
        L468:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L45a
        L46c:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.EditText r0 = (android.widget.EditText) r0     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog.usernameEditText = r0     // Catch: java.lang.Throwable -> L59d
        L475:
            android.view.View r0 = m8437(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            short[] r0 = m8424()     // Catch: java.lang.Throwable -> L59d
            r6 = 298(0x12a, float:4.18E-43)
            int r7 = androidx.loader.C1096.f122     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ (-953(0xfffffffffffffc47, float:NaN))
            r8 = 2291(0x8f3, float:3.21E-42)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8576(r0, r6, r7, r8)     // Catch: java.lang.Throwable -> L59d
            java.lang.String r6 = androidx.activity.C1062.m192()     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda2 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L59d
            r7.<init>()     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r6 = m8429(r13, r0, r6, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L59d
            int r7 = androidx.loader.C1098.m2812(r6)     // Catch: java.lang.Throwable -> L59d
            r0 = 49790(0xc27e, float:6.977E-41)
        L4a3:
            r8 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r8
            switch(r0) {
                case 18: goto L4ab;
                case 51: goto L4da;
                case 84: goto L4b5;
                case 241: goto L4af;
                default: goto L4aa;
            }     // Catch: java.lang.Throwable -> L59d
        L4aa:
            goto L4a3
        L4ab:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto L4a3
        L4af:
            if (r7 <= r12) goto L4ab
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto L4a3
        L4b5:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            boolean r7 = r0 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L59d
            r0 = 49914(0xc2fa, float:6.9944E-41)
        L4bf:
            r8 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r8
            switch(r0) {
                case 497: goto L4c7;
                case 1711: goto L4cd;
                case 1736: goto L4da;
                case 1769: goto L4d1;
                default: goto L4c6;
            }     // Catch: java.lang.Throwable -> L59d
        L4c6:
            goto L4bf
        L4c7:
            if (r7 == 0) goto L4cd
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto L4bf
        L4cd:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto L4bf
        L4d1:
            r0 = 1
            android.view.View r0 = androidx.activity.C1066.m494(r6, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.EditText r0 = (android.widget.EditText) r0     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog.passwordEditText = r0     // Catch: java.lang.Throwable -> L59d
        L4da:
            android.view.View r0 = m8437(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.TextView r6 = new android.widget.TextView     // Catch: java.lang.Throwable -> L59d
            r6.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            r0 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 6710866(0x666652, float:9.403926E-39)
            int r7 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L59d
            r0 = r0 ^ r7
            kevin.fun.hook.webdav.C1118.m8517(r6, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 0
            r7 = 1090519040(0x41000000, float:8.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            r8 = 0
            r9 = 0
            kevin.fun.hook.audio.C1117.m8126(r6, r0, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            long r8 = androidx.annotation.experimental.C1067.m604()     // Catch: java.lang.Throwable -> L59d
            r0 = 50689(0xc601, float:7.103E-41)
        L507:
            r7 = 50706(0xc612, float:7.1054E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 19: goto L50f;
                case 45: goto L589;
                case 50: goto L519;
                case 76: goto L51d;
                default: goto L50e;
            }     // Catch: java.lang.Throwable -> L59d
        L50e:
            goto L507
        L50f:
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L519
            r0 = 50782(0xc65e, float:7.1161E-41)
            goto L507
        L519:
            r0 = 50751(0xc63f, float:7.1117E-41)
            goto L507
        L51d:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L59d
            short[] r7 = m8424()     // Catch: java.lang.Throwable -> L59d
            r10 = 304(0x130, float:4.26E-43)
            int r11 = androidx.core.C1072.f98     // Catch: java.lang.Throwable -> L59d
            r11 = r11 ^ (-525(0xfffffffffffffdf3, float:NaN))
            r12 = 1205(0x4b5, float:1.689E-42)
            java.lang.String r7 = androidx.activity.C1064.m310(r7, r10, r11, r12)     // Catch: java.lang.Throwable -> L59d
            java.util.Locale r10 = androidx.activity.C1064.m382()     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r7, r10)     // Catch: java.lang.Throwable -> L59d
            java.util.Date r7 = new java.util.Date     // Catch: java.lang.Throwable -> L59d
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L59d
            java.lang.String r0 = androidx.appcompat.resources.C1068.m657(r0, r7)     // Catch: java.lang.Throwable -> L59d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59d
            r7.<init>()     // Catch: java.lang.Throwable -> L59d
            short[] r8 = m8424()     // Catch: java.lang.Throwable -> L59d
            r9 = 323(0x143, float:4.53E-43)
            int r10 = androidx.activity.C1065.f91     // Catch: java.lang.Throwable -> L59d
            r10 = r10 ^ (-51)
            r11 = 2718(0xa9e, float:3.809E-42)
            java.lang.String r8 = androidx.vectordrawable.animated.C1102.m3116(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L59d
            java.lang.StringBuilder r7 = androidx.lifecycle.livedata.C1085.m1859(r7, r8)     // Catch: java.lang.Throwable -> L59d
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r7, r0)     // Catch: java.lang.Throwable -> L59d
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1087.m1946(r6, r0)     // Catch: java.lang.Throwable -> L59d
            r0 = 50813(0xc67d, float:7.1204E-41)
        L566:
            r7 = 50830(0xc68e, float:7.1228E-41)
            r0 = r0 ^ r7
            switch(r0) {
                case 18: goto L56e;
                case 243: goto L585;
                default: goto L56d;
            }     // Catch: java.lang.Throwable -> L59d
        L56d:
            goto L566
        L56e:
            boolean r7 = androidx.customview.C1074.m1084()     // Catch: java.lang.Throwable -> L59d
            int r8 = org.luckypray.dexkit.C1124.f434     // Catch: java.lang.Throwable -> L59d
            r0 = 51588(0xc984, float:7.229E-41)
        L577:
            r9 = 51605(0xc995, float:7.2314E-41)
            r0 = r0 ^ r9
            switch(r0) {
                case 17: goto L57f;
                case 54: goto L5c7;
                case 87: goto L5fe;
                case 116: goto L5cb;
                default: goto L57e;
            }     // Catch: java.lang.Throwable -> L59d
        L57e:
            goto L577
        L57f:
            if (r7 == 0) goto L5c7
            r0 = 51681(0xc9e1, float:7.242E-41)
            goto L577
        L585:
            r0 = 50844(0xc69c, float:7.1248E-41)
            goto L566
        L589:
            short[] r0 = m8424()     // Catch: java.lang.Throwable -> L59d
            r7 = 329(0x149, float:4.61E-43)
            int r8 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ 85
            r9 = 2751(0xabf, float:3.855E-42)
            java.lang.String r0 = androidx.lifecycle.runtime.C1092.m2337(r0, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1087.m1946(r6, r0)     // Catch: java.lang.Throwable -> L59d
            goto L56e
        L59d:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m8424()
            r3 = 359(0x167, float:5.03E-43)
            int r4 = androidx.core.ktx.C1070.f96
            r4 = r4 ^ 550(0x226, float:7.71E-43)
            r5 = 2101(0x835, float:2.944E-42)
            java.lang.String r2 = androidx.appcompat.C1069.m751(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.documentfile.C1076.m1250(r13, r0)
        L5c6:
            return
        L5c7:
            r0 = 51650(0xc9c2, float:7.2377E-41)
            goto L577
        L5cb:
            android.widget.TextView r0 = new android.widget.TextView     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            r7 = 1093664768(0x41300000, float:11.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r7)     // Catch: java.lang.Throwable -> L59d
            r7 = -43580(0xffffffffffff55c4, float:NaN)
            r7 = r7 ^ r8
            kevin.fun.hook.webdav.C1118.m8517(r0, r7)     // Catch: java.lang.Throwable -> L59d
            r7 = 0
            r8 = 1082130432(0x40800000, float:4.0)
            int r8 = m8422(r13, r8)     // Catch: java.lang.Throwable -> L59d
            r9 = 0
            r10 = 0
            kevin.fun.hook.audio.C1117.m8126(r0, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L59d
            short[] r7 = m8424()     // Catch: java.lang.Throwable -> L59d
            r8 = 336(0x150, float:4.71E-43)
            int r9 = androidx.loader.C1099.f125     // Catch: java.lang.Throwable -> L59d
            r9 = r9 ^ 848(0x350, float:1.188E-42)
            r10 = 2269(0x8dd, float:3.18E-42)
            java.lang.String r7 = androidx.activity.C1062.m170(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.process.C1087.m1946(r0, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r5, r0)     // Catch: java.lang.Throwable -> L59d
        L5fe:
            androidx.activity.C1064.m372(r5, r6)     // Catch: java.lang.Throwable -> L59d
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3729(r3, r5)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r4, r3)     // Catch: java.lang.Throwable -> L59d
            android.view.View r0 = new android.view.View     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L59d
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            int r7 = androidx.appcompat.C1069.f95     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ 236(0xec, float:3.31E-43)
            r3.<init>(r7, r5)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1085.m1843(r0, r3)     // Catch: java.lang.Throwable -> L59d
            r3 = -1119008(0xffffffffffeeece0, float:NaN)
            int r5 = androidx.appcompat.resources.C1068.f94     // Catch: java.lang.Throwable -> L59d
            r3 = r3 ^ r5
            androidx.loader.C1099.m2849(r0, r3)     // Catch: java.lang.Throwable -> L59d
            r3 = 0
            r5 = 1094713344(0x41400000, float:12.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            r7 = 0
            r8 = 0
            kevin.fun.hook.webdav.C1119.m8548(r0, r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L59d
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            r3 = 0
            androidx.customview.C1074.m1119(r0, r3)     // Catch: java.lang.Throwable -> L59d
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = m8422(r13, r3)     // Catch: java.lang.Throwable -> L59d
            r5 = 1094713344(0x41400000, float:12.0)
            int r5 = m8422(r13, r5)     // Catch: java.lang.Throwable -> L59d
            r7 = 1090519040(0x41000000, float:8.0)
            int r7 = m8422(r13, r7)     // Catch: java.lang.Throwable -> L59d
            r8 = 1090519040(0x41000000, float:8.0)
            int r8 = m8422(r13, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.drawerlayout.C1077.m1314(r0, r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L59d
            short[] r3 = m8424()     // Catch: java.lang.Throwable -> L59d
            r5 = 347(0x15b, float:4.86E-43)
            int r7 = androidx.customview.C1074.f100     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ 247(0xf7, float:3.46E-43)
            r8 = 1657(0x679, float:2.322E-42)
            java.lang.String r3 = androidx.lifecycle.viewmodel.C1093.m2415(r3, r5, r7, r8)     // Catch: java.lang.Throwable -> L59d
            r5 = 10066034(0x999872, float:1.4105518E-38)
            int r7 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L59d
            r5 = r5 ^ r7
            android.widget.TextView r3 = m8423(r13, r3, r5)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda3 r5 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> L59d
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1086.m1916(r3, r5)     // Catch: java.lang.Throwable -> L59d
            short[] r5 = m8424()     // Catch: java.lang.Throwable -> L59d
            r7 = 351(0x15f, float:4.92E-43)
            int r8 = androidx.annotation.experimental.C1067.f93     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ (-55)
            r9 = 1220(0x4c4, float:1.71E-42)
            java.lang.String r5 = androidx.customview.C1075.m1138(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            r7 = -43429(0xffffffffffff565b, float:NaN)
            int r8 = androidx.vectordrawable.C1103.f129     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ r8
            android.widget.TextView r5 = m8423(r13, r5, r7)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda4 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda4     // Catch: java.lang.Throwable -> L59d
            r7.<init>(r13, r6)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1086.m1916(r5, r7)     // Catch: java.lang.Throwable -> L59d
            short[] r6 = m8424()     // Catch: java.lang.Throwable -> L59d
            r7 = 354(0x162, float:4.96E-43)
            int r8 = androidx.activity.C1063.f89     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ 1
            r9 = 1243(0x4db, float:1.742E-42)
            java.lang.String r6 = androidx.lifecycle.process.C1088.m2044(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L59d
            r7 = -43785(0xffffffffffff54f7, float:NaN)
            int r8 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> L59d
            r7 = r7 ^ r8
            android.widget.TextView r6 = m8423(r13, r6, r7)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda7 r7 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda7     // Catch: java.lang.Throwable -> L59d
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1086.m1916(r6, r7)     // Catch: java.lang.Throwable -> L59d
            short[] r7 = m8424()     // Catch: java.lang.Throwable -> L59d
            r8 = 357(0x165, float:5.0E-43)
            int r9 = androidx.lifecycle.livedata.C1084.f110     // Catch: java.lang.Throwable -> L59d
            r9 = r9 ^ 17
            r10 = 1872(0x750, float:2.623E-42)
            java.lang.String r7 = androidx.loader.C1095.m2574(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L59d
            r8 = 6711181(0x66678d, float:9.404368E-39)
            int r9 = androidx.lifecycle.process.C1091.f117     // Catch: java.lang.Throwable -> L59d
            r8 = r8 ^ r9
            android.widget.TextView r7 = m8423(r13, r7, r8)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda8 r8 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda8     // Catch: java.lang.Throwable -> L59d
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L59d
            androidx.lifecycle.livedata.C1086.m1916(r7, r8)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r0, r3)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r0, r5)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r0, r6)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r0, r7)     // Catch: java.lang.Throwable -> L59d
            androidx.activity.C1064.m372(r4, r0)     // Catch: java.lang.Throwable -> L59d
            androidx.annotation.experimental.C1067.m579(r2, r4)     // Catch: java.lang.Throwable -> L59d
            androidx.viewpager.C1108.m3545(r1, r2)     // Catch: java.lang.Throwable -> L59d
            r0 = 1137180672(0x43c80000, float:400.0)
            int r0 = m8422(r13, r0)     // Catch: java.lang.Throwable -> L59d
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L59d
            androidx.loader.C1096.m2641(r4, r0)     // Catch: java.lang.Throwable -> L59d
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r4)     // Catch: java.lang.Throwable -> L59d
            r3 = 0
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1094.m2503(r0, r3)     // Catch: java.lang.Throwable -> L59d
            r4 = 978(0x3d2, double:4.83E-321)
            int r3 = androidx.startup.C1101.f127     // Catch: java.lang.Throwable -> L59d
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L59d
            long r4 = r4 ^ r6
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r4)     // Catch: java.lang.Throwable -> L59d
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda9 r0 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda9     // Catch: java.lang.Throwable -> L59d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L59d
            androidx.emoji2.viewsintegration.C1079.m1483(r2, r0)     // Catch: java.lang.Throwable -> L59d
            kevin.fun.hook.audio.C1114.m7909(r1)     // Catch: java.lang.Throwable -> L59d
            r0 = 51712(0xca00, float:7.2464E-41)
        L725:
            r1 = 51729(0xca11, float:7.2488E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L5c6;
                case 15: goto L72c;
                case 16: goto L72c;
                case 17: goto L72d;
                default: goto L72c;
            }
        L72c:
            goto L725
        L72d:
            r0 = 51743(0xca1f, float:7.2507E-41)
            goto L725
    }

    private static void showSafeToast(android.content.Context r3, java.lang.String r4) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L64;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r3 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            boolean r1 = androidx.documentfile.C1076.m1246(r4)
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L21;
                case 471: goto L30;
                case 500: goto L24;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            if (r1 == 0) goto L21
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L21:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L24:
            r0 = 1864(0x748, float:2.612E-42)
        L26:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2c;
                case 47483: goto L64;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L26
        L30:
            android.os.Handler r0 = m8428()
            kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda5 r1 = new kevin.fun.hook.webdav.WebDAVDialog$$ExternalSyntheticLambda5
            r1.<init>(r3, r4)
            androidx.activity.C1062.m178(r0, r1)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L43:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto L4b;
                case 45: goto L64;
                case 76: goto L55;
                case 239: goto L4f;
                default: goto L4a;
            }
        L4a:
            goto L43
        L4b:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L43
        L4f:
            if (r1 < 0) goto L4b
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L43
        L55:
            java.lang.String r0 = "69"
            java.lang.String r0 = androidx.interpolator.C1082.m1668(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L64:
            return
    }

    private static void updateLocalStatusText(android.widget.TextView r7, android.content.Context r8) {
            long r2 = androidx.appcompat.C1069.m723()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L18;
                case 239: goto L69;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L18:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            short[] r1 = m8424()
            r4 = 367(0x16f, float:5.14E-43)
            int r5 = org.luckypray.dexkit.C1123.f433
            r5 = r5 ^ (-982(0xfffffffffffffc2a, float:NaN))
            r6 = 2746(0xaba, float:3.848E-42)
            java.lang.String r1 = androidx.core.C1073.m1028(r1, r4, r5, r6)
            java.util.Locale r4 = androidx.activity.C1064.m382()
            r0.<init>(r1, r4)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            java.lang.String r0 = androidx.appcompat.resources.C1068.m657(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m8424()
            r3 = 386(0x182, float:5.41E-43)
            int r4 = kevin.fun.hook.webdav.C1118.f417
            r4 = r4 ^ (-366(0xfffffffffffffe92, float:NaN))
            r5 = 1244(0x4dc, float:1.743E-42)
            java.lang.String r2 = androidx.startup.C1100.m2931(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            androidx.lifecycle.process.C1087.m1946(r7, r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L60:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L66;
                case 54: goto L7c;
                default: goto L65;
            }
        L65:
            goto L60
        L66:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L60
        L69:
            short[] r0 = m8424()
            r1 = 393(0x189, float:5.51E-43)
            int r2 = androidx.vectordrawable.animated.C1102.f128
            r2 = r2 ^ 203(0xcb, float:2.84E-43)
            r3 = 709(0x2c5, float:9.94E-43)
            java.lang.String r0 = androidx.loader.C1099.m2843(r0, r1, r2, r3)
            androidx.lifecycle.process.C1087.m1946(r7, r0)
        L7c:
            return
    }

    private static java.lang.String validateConfig() {
            android.widget.EditText r2 = m8436()
            java.lang.String r1 = androidx.emoji2.C1080.m1562()
            r0 = 1616(0x650, float:2.264E-42)
        La:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L10;
                case 49: goto L13;
                case 204: goto L18;
                case 239: goto L33;
                default: goto Lf;
            }
        Lf:
            goto La
        L10:
            r0 = 1678(0x68e, float:2.351E-42)
            goto La
        L13:
            if (r2 == 0) goto L10
            r0 = 1709(0x6ad, float:2.395E-42)
            goto La
        L18:
            android.widget.EditText r0 = m8436()
            android.text.Editable r0 = androidx.drawerlayout.C1077.m1276(r0)
            java.lang.String r0 = androidx.startup.C1101.m2982(r0)
            java.lang.String r0 = androidx.documentfile.C1076.m1236(r0)
            r2 = 1740(0x6cc, float:2.438E-42)
        L2a:
            r2 = r2 ^ 1757(0x6dd, float:2.462E-42)
            switch(r2) {
                case 17: goto L30;
                case 54: goto L34;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            r2 = 1771(0x6eb, float:2.482E-42)
            goto L2a
        L33:
            r0 = r1
        L34:
            android.widget.EditText r3 = m8427()
            r2 = 1864(0x748, float:2.612E-42)
        L3a:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto L40;
                case 47384: goto L7c;
                case 47417: goto L4a;
                case 47483: goto L46;
                default: goto L3f;
            }
        L3f:
            goto L3a
        L40:
            if (r3 == 0) goto L46
            r2 = 48736(0xbe60, float:6.8294E-41)
            goto L3a
        L46:
            r2 = 48705(0xbe41, float:6.825E-41)
            goto L3a
        L4a:
            android.widget.EditText r2 = m8427()
            android.text.Editable r2 = androidx.drawerlayout.C1077.m1276(r2)
            java.lang.String r2 = androidx.startup.C1101.m2982(r2)
            java.lang.String r2 = androidx.documentfile.C1076.m1236(r2)
            r3 = 48767(0xbe7f, float:6.8337E-41)
        L5d:
            r4 = 48784(0xbe90, float:6.8361E-41)
            r3 = r3 ^ r4
            switch(r3) {
                case 14: goto L65;
                case 239: goto L78;
                default: goto L64;
            }
        L64:
            goto L5d
        L65:
            android.widget.EditText r4 = m8433()
            r3 = 48891(0xbefb, float:6.8511E-41)
        L6c:
            r5 = 48908(0xbf0c, float:6.8535E-41)
            r3 = r3 ^ r5
            switch(r3) {
                case 22: goto L74;
                case 53: goto L94;
                case 503: goto L7e;
                case 32495: goto L84;
                default: goto L73;
            }
        L73:
            goto L6c
        L74:
            r3 = 48953(0xbf39, float:6.8598E-41)
            goto L6c
        L78:
            r3 = 48798(0xbe9e, float:6.838E-41)
            goto L5d
        L7c:
            r2 = r1
            goto L65
        L7e:
            if (r4 == 0) goto L74
            r3 = 49635(0xc1e3, float:6.9553E-41)
            goto L6c
        L84:
            android.widget.EditText r1 = m8433()
            android.text.Editable r1 = androidx.drawerlayout.C1077.m1276(r1)
            java.lang.String r1 = androidx.startup.C1101.m2982(r1)
            java.lang.String r1 = androidx.documentfile.C1076.m1236(r1)
        L94:
            boolean r3 = androidx.documentfile.C1076.m1246(r0)
            r0 = 49666(0xc202, float:6.9597E-41)
        L9b:
            r4 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r4
            switch(r0) {
                case 17: goto La3;
                case 50: goto La9;
                case 76: goto Lad;
                case 83: goto Lbe;
                default: goto La2;
            }
        La2:
            goto L9b
        La3:
            if (r3 == 0) goto La9
            r0 = 49759(0xc25f, float:6.9727E-41)
            goto L9b
        La9:
            r0 = 49728(0xc240, float:6.9684E-41)
            goto L9b
        Lad:
            short[] r0 = m8424()
            r1 = 401(0x191, float:5.62E-43)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r2 = r2 ^ 640(0x280, float:8.97E-43)
            r3 = 1701(0x6a5, float:2.384E-42)
            java.lang.String r0 = androidx.vectordrawable.C1104.m3232(r0, r1, r2, r3)
        Lbd:
            return r0
        Lbe:
            boolean r2 = androidx.documentfile.C1076.m1246(r2)
            r0 = 49790(0xc27e, float:6.977E-41)
        Lc5:
            r3 = 49807(0xc28f, float:6.9794E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 18: goto Lcd;
                case 51: goto Le8;
                case 84: goto Ld7;
                case 241: goto Ld1;
                default: goto Lcc;
            }
        Lcc:
            goto Lc5
        Lcd:
            r0 = 49852(0xc2bc, float:6.9858E-41)
            goto Lc5
        Ld1:
            if (r2 == 0) goto Lcd
            r0 = 49883(0xc2db, float:6.9901E-41)
            goto Lc5
        Ld7:
            short[] r0 = m8424()
            r1 = 414(0x19e, float:5.8E-43)
            int r2 = androidx.lifecycle.process.C1089.f115
            r2 = r2 ^ 934(0x3a6, float:1.309E-42)
            r3 = 2355(0x933, float:3.3E-42)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r1, r2, r3)
            goto Lbd
        Le8:
            boolean r1 = androidx.documentfile.C1076.m1246(r1)
            r0 = 49914(0xc2fa, float:6.9944E-41)
        Lef:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 497: goto Lf7;
                case 1711: goto Lfd;
                case 1736: goto L112;
                case 1769: goto L101;
                default: goto Lf6;
            }
        Lf6:
            goto Lef
        Lf7:
            if (r1 == 0) goto Lfd
            r0 = 50658(0xc5e2, float:7.0987E-41)
            goto Lef
        Lfd:
            r0 = 50627(0xc5c3, float:7.0944E-41)
            goto Lef
        L101:
            short[] r0 = m8424()
            r1 = 420(0x1a4, float:5.89E-43)
            int r2 = androidx.core.ktx.C1071.f97
            r2 = r2 ^ 907(0x38b, float:1.271E-42)
            r3 = 1866(0x74a, float:2.615E-42)
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1796(r0, r1, r2, r3)
            goto Lbd
        L112:
            r0 = 0
            goto Lbd
    }

    /* JADX INFO: renamed from: ۟۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static int m8422(java.lang.Object r2, float r3) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
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
            android.content.Context r2 = (android.content.Context) r2
            int r0 = m109dp(r2, r3)
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

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m8423(java.lang.Object r2, java.lang.Object r3, int r4) {
            int r1 = androidx.annotation.experimental.C1067.m596()
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
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            android.widget.TextView r0 = createDouyinButton(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۟ۡ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8424() {
            int r1 = androidx.viewpager.C1108.m3542()
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
            short[] r0 = kevin.fun.hook.webdav.WebDAVDialog.f415short
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

    /* JADX INFO: renamed from: ۟ۢ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m8425(java.lang.Object r2, java.lang.Object r3, boolean r4, java.lang.Object r5) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            java.util.function.Consumer r5 = (java.util.function.Consumer) r5
            android.widget.LinearLayout r0 = createDouyinSwitchRow(r2, r3, r4, r5)
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

    /* JADX INFO: renamed from: ۟ۢۥۢ۟, reason: not valid java name and contains not printable characters */
    public static void m8426(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3f;
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
            showSafeToast(r2, r3)
        L1b:
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3e;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 > 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            java.lang.String r0 = "L3ilMaRrtjf1Z"
            java.lang.String r0 = androidx.emoji2.C1080.m1544(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
        L3f:
            r0 = 1864(0x748, float:2.612E-42)
        L41:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L47;
                case 47483: goto L1b;
                default: goto L46;
            }
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
    }

    /* JADX INFO: renamed from: ۟ۢۨۡۤ, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m8427() {
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            android.widget.EditText r0 = kevin.fun.hook.webdav.WebDAVDialog.usernameEditText
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

    /* JADX INFO: renamed from: ۟ۤ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static android.os.Handler m8428() {
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            android.os.Handler r0 = kevin.fun.hook.webdav.WebDAVDialog.MAIN_HANDLER
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

    /* JADX INFO: renamed from: ۟ۥۢۦ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m8429(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            java.lang.String r4 = (java.lang.String) r4
            java.util.function.Consumer r5 = (java.util.function.Consumer) r5
            android.widget.LinearLayout r0 = createPasswordRow(r2, r3, r4, r5)
        L20:
            return r0
        L21:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L24:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2a;
                case 54: goto L20;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    /* JADX INFO: renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8430() {
            int r1 = kevin.fun.hook.audio.C1117.m8167()
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
            java.lang.String r0 = validateConfig()
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

    /* JADX INFO: renamed from: ۣۡۧۧ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m8431(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.core.C1072.m980()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            java.util.function.Consumer r5 = (java.util.function.Consumer) r5
            java.lang.String r6 = (java.lang.String) r6
            android.widget.LinearLayout r0 = createEditRow(r2, r3, r4, r5, r6)
        L22:
            return r0
        L23:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L26:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L2c;
                case 54: goto L22;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L26
    }

    /* JADX INFO: renamed from: ۢۥۦۧ, reason: not valid java name and contains not printable characters */
    public static kevin.fun.hook.webdav.WebDAVConfig.BackupCallback m8432() {
            int r1 = androidx.interpolator.C1081.m1643()
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
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r0 = kevin.fun.hook.webdav.WebDAVDialog.pendingRestoreCallback
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

    /* JADX INFO: renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static android.widget.EditText m8433() {
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
            android.widget.EditText r0 = kevin.fun.hook.webdav.WebDAVDialog.passwordEditText
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

    /* JADX INFO: renamed from: ۥۢۡۦ, reason: contains not printable characters */
    public static android.graphics.drawable.GradientDrawable m8434(java.lang.Object r2) {
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
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.GradientDrawable r0 = createRippleDrawable(r2)
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

    /* JADX INFO: renamed from: ۥۤۦۦ, reason: contains not printable characters */
    public static android.content.Context m8435() {
            int r1 = androidx.lifecycle.process.C1088.m2011()
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
            android.content.Context r0 = kevin.fun.hook.webdav.WebDAVDialog.pendingContext
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

    /* JADX INFO: renamed from: ۥۧۡ۟, reason: contains not printable characters */
    public static android.widget.EditText m8436() {
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
            android.widget.EditText r0 = kevin.fun.hook.webdav.WebDAVDialog.urlEditText
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

    /* JADX INFO: renamed from: ۦۧۢ۠, reason: contains not printable characters */
    public static android.view.View m8437(java.lang.Object r2) {
            int r1 = androidx.lifecycle.process.C1091.m2283()
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
            android.view.View r0 = createDivider(r2)
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

    /* JADX INFO: renamed from: ۨۥۧ۠, reason: not valid java name and contains not printable characters */
    public static void m8438(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = (android.content.Context) r3
            updateLocalStatusText(r2, r3)
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
}
