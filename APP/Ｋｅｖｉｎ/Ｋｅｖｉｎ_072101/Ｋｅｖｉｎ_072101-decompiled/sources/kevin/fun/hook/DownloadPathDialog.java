package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class DownloadPathDialog {
    public static final int REQ_SELECT_DOWNLOAD_DIR = 8848;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f364short = null;

    static {
            r0 = 139(0x8b, float:1.95E-43)
            short[] r0 = new short[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [30534, 24317, 25120, 26347, 25528, 21303, 29664, 23131, 26246, 25165, 23615, -30677, 1332, 1326, 28294, -26203, 27461, 32578, 22265, 21318, 24152, 31483, 21312, -3313, 3103, 21812, -26357, 30632, 1078, 1081, 1075, 1061, 1080, 1086, 1075, 1145, 1086, 1081, 1059, 1074, 1081, 1059, 1145, 1078, 1076, 1059, 1086, 1080, 1081, 1145, 1048, 1031, 1042, 1049, 1032, 1043, 1048, 1044, 1026, 1050, 1042, 1049, 1027, 1032, 1027, 1029, 1042, 1042, 18382, 21323, -31236, 22423, -31827, 30589, 21634, 22940, 32063, 21636, -2869, 3035, 31206, 22692, 10563, -26282, 27574, 32689, 22026, 10562, -2477, 30116, 30592, -28374, -25027, 31206, 10563, 17952, 31863, 25147, 32689, 22026, 10562, 23889, -2477, 17989, -29976, 22216, 32320, 21185, 22726, 22586, 28188, -24817, 14685, 18258, -32546, 22738, 27412, 23543, 20788, 2431, 2416, 2348, 2363, 2364, 2366, 2349, 2363, 2431, -31568, 22235, 14685, -27997, 31744, 24396, 24850, -26055, 26841, 31966, 21861} // fill-array
            kevin.fun.hook.DownloadPathDialog.f364short = r0
            return
    }

    public DownloadPathDialog() {
            r3 = this;
            r3.<init>()
            int r1 = androidx.loader.C1094.m2490()
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
            java.lang.String r0 = "DdQhqTeFc6N7BYw"
            java.lang.String r0 = androidx.core.ktx.C1071.m903(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: dp */
    private static int m89dp(android.app.Activity r8, int r9) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۥۤۨ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56545: goto L18;
                case 1746941: goto L26;
                case 1747930: goto L43;
                case 1749703: goto L3a;
                case 1751773: goto L2e;
                case 1752617: goto L20;
                case 1752672: goto L33;
                default: goto L10;
            }
        L10:
            float r4 = androidx.vectordrawable.animated.C1102.m3118(r2)
            java.lang.String r1 = "ۥۦۡ"
            r3 = r1
            goto L9
        L18:
            android.util.DisplayMetrics r1 = androidx.activity.C1062.m159(r0)
            java.lang.String r3 = "۠ۧۡ"
            r2 = r1
            goto L9
        L20:
            float r5 = (float) r9
            java.lang.String r1 = "۟ۧۥ"
            r3 = r1
            r7 = r5
            goto L9
        L26:
            android.content.res.Resources r0 = androidx.versionedparcelable.C1106.m3362(r8)
            java.lang.String r1 = "ۧۨ"
            r3 = r1
            goto L9
        L2e:
            int r9 = (int) r7
            java.lang.String r1 = "۠ۨۢ"
            r3 = r1
            goto L9
        L33:
            float r5 = r7 * r4
            java.lang.String r1 = "ۣۢۨ"
            r3 = r1
            r6 = r5
            goto L9
        L3a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r5 = r6 + r1
            java.lang.String r1 = "ۤۨۡ"
            r3 = r1
            r7 = r5
            goto L9
        L43:
            return r9
    }

    public static boolean handleActivityResult(android.app.Activity r7, int r8, int r9, android.content.Intent r10) {
            r1 = 1
            r0 = 0
            r2 = 1616(0x650, float:2.264E-42)
        L4:
            r2 = r2 ^ 1633(0x661, float:2.288E-42)
            switch(r2) {
                case 14: goto La;
                case 49: goto Ld;
                case 204: goto L6f;
                case 239: goto L14;
                default: goto L9;
            }
        L9:
            goto L4
        La:
            r2 = 1678(0x68e, float:2.351E-42)
            goto L4
        Ld:
            r2 = 8848(0x2290, float:1.2399E-41)
            if (r8 == r2) goto La
            r2 = 1709(0x6ad, float:2.395E-42)
            goto L4
        L14:
            r0 = 1740(0x6cc, float:2.438E-42)
        L16:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1c;
                case 54: goto L22;
                case 471: goto L5b;
                case 500: goto L25;
                default: goto L1b;
            }
        L1b:
            goto L16
        L1c:
            r0 = -1
            if (r9 != r0) goto L22
            r0 = 1833(0x729, float:2.569E-42)
            goto L16
        L22:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L16
        L25:
            r0 = 1864(0x748, float:2.612E-42)
        L27:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L2d;
                case 47384: goto L5b;
                case 47417: goto L37;
                case 47483: goto L33;
                default: goto L2c;
            }
        L2c:
            goto L27
        L2d:
            if (r10 == 0) goto L33
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L27
        L33:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L27
        L37:
            android.net.Uri r2 = androidx.customview.C1074.m1121(r10)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        L3e:
            r3 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r3
            switch(r0) {
                case 14: goto L46;
                case 45: goto L74;
                case 76: goto L50;
                case 239: goto L4a;
                default: goto L45;
            }
        L45:
            goto L3e
        L46:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto L3e
        L4a:
            if (r2 != 0) goto L46
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto L3e
        L50:
            r0 = 48891(0xbefb, float:6.8511E-41)
        L53:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto L5b;
                case 503: goto L70;
                default: goto L5a;
            }
        L5a:
            goto L53
        L5b:
            short[] r0 = m6954()
            r2 = 14
            int r3 = androidx.activity.C1064.f90
            r3 = r3 ^ 495(0x1ef, float:6.94E-43)
            r4 = 2476(0x9ac, float:3.47E-42)
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3116(r0, r2, r3, r4)
            m6956(r7, r0)
            r0 = r1
        L6f:
            return r0
        L70:
            r0 = 48922(0xbf1a, float:6.8554E-41)
            goto L53
        L74:
            android.net.Uri r0 = androidx.customview.C1074.m1121(r10)     // Catch: java.lang.Throwable -> Lb5
            int r2 = androidx.loader.C1099.m2867(r10)     // Catch: java.lang.Throwable -> Lb5
            int r3 = androidx.lifecycle.process.C1089.f115     // Catch: java.lang.Throwable -> Lb5
            android.content.ContentResolver r4 = androidx.lifecycle.process.C1087.m2004(r7)     // Catch: java.lang.Throwable -> Lb5
            r3 = r3 ^ 931(0x3a3, float:1.305E-42)
            r2 = r2 & r3
            kevin.fun.hook.webdav.C1119.m110(r4, r0, r2)     // Catch: java.lang.Throwable -> Lb5
            kevin.fun.hook.DownloadPathConfig r2 = new kevin.fun.hook.DownloadPathConfig     // Catch: java.lang.Throwable -> Lb5
            r2.<init>(r7)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = androidx.core.ktx.C1071.m871(r0)     // Catch: java.lang.Throwable -> Lb5
            androidx.lifecycle.livedata.C1085.m1823(r2, r0, r3)     // Catch: java.lang.Throwable -> Lb5
            short[] r0 = m6954()     // Catch: java.lang.Throwable -> Lb5
            r2 = 0
            int r3 = androidx.emoji2.C1080.f106     // Catch: java.lang.Throwable -> Lb5
            r3 = r3 ^ 383(0x17f, float:5.37E-43)
            r4 = 424(0x1a8, float:5.94E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2229(r0, r2, r3, r4)     // Catch: java.lang.Throwable -> Lb5
            m6956(r7, r0)     // Catch: java.lang.Throwable -> Lb5
            r0 = 49666(0xc202, float:6.9597E-41)
        La9:
            r2 = 49683(0xc213, float:6.9621E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 17: goto Lb1;
                case 50: goto Ldd;
                default: goto Lb0;
            }
        Lb0:
            goto La9
        Lb1:
            r0 = 49697(0xc221, float:6.964E-41)
            goto La9
        Lb5:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            short[] r3 = m6954()
            r4 = 6
            int r5 = androidx.emoji2.viewsintegration.C1078.f104
            r5 = r5 ^ 623(0x26f, float:8.73E-43)
            r6 = 1294(0x50e, float:1.813E-42)
            java.lang.String r3 = androidx.versionedparcelable.C1106.m3338(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = androidx.lifecycle.livedata.C1085.m1859(r2, r3)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m6956(r7, r0)
        Ldd:
            r0 = r1
            goto L6f
    }

    static /* synthetic */ void lambda$0(kevin.fun.hook.DownloadPathConfig r10, android.widget.TextView r11, android.app.Activity r12, android.view.View r13) {
            r7 = 0
            r1 = 0
            java.lang.String r9 = "۠۟ۢ"
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
                case 56476: goto L79;
                case 56574: goto L82;
                case 1746846: goto L20;
                case 1746968: goto L19;
                case 1747651: goto L55;
                case 1749577: goto L40;
                case 1751557: goto L89;
                case 1751713: goto L72;
                case 1752459: goto L39;
                case 1752609: goto L9e;
                case 1752645: goto L94;
                case 1754474: goto L29;
                case 1754539: goto L32;
                case 1754624: goto L65;
                case 1754656: goto L5c;
                case 1755375: goto L48;
                default: goto L12;
            }
        L12:
            r1 = r8 ^ 197(0xc5, float:2.76E-43)
            java.lang.String r7 = "ۨ۠ۧ"
            r6 = r1
            r9 = r7
            goto Lb
        L19:
            androidx.lifecycle.process.C1087.m1946(r11, r5)
            java.lang.String r1 = "ۧۢۥ"
            r9 = r1
            goto Lb
        L20:
            java.lang.String r1 = androidx.versionedparcelable.C1106.m3344(r10)
            java.lang.String r7 = "ۤۡۢ"
            r3 = r1
            r9 = r7
            goto Lb
        L29:
            short[] r1 = m6954()
            java.lang.String r7 = "ۤۦۣ"
            r4 = r1
            r9 = r7
            goto Lb
        L32:
            int r7 = androidx.vectordrawable.animated.C1102.f128
            java.lang.String r1 = "ۣۣ"
            r8 = r7
            r9 = r1
            goto Lb
        L39:
            m6956(r12, r3)
            java.lang.String r1 = "ۥۤ۠"
            r9 = r1
            goto Lb
        L40:
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r2, r5)
            java.lang.String r1 = "ۥۡ"
            r9 = r1
            goto Lb
        L48:
            r1 = 19
            r5 = 3093(0xc15, float:4.334E-42)
            java.lang.String r1 = com.tencent.mmkv.C1109.m3629(r4, r1, r6, r5)
            java.lang.String r7 = "ۢ۟ۦ"
            r5 = r1
            r9 = r7
            goto Lb
        L55:
            androidx.documentfile.C1076.m1261(r10)
            java.lang.String r1 = "ۣ۟ۤ"
            r9 = r1
            goto Lb
        L5c:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r2)
            java.lang.String r7 = "۟ۨۡ"
            r5 = r1
            r9 = r7
            goto Lb
        L65:
            r1 = 25
            r3 = 2246(0x8c6, float:3.147E-42)
            java.lang.String r1 = androidx.appcompat.C1069.m751(r4, r1, r6, r3)
            java.lang.String r7 = "ۥ۟ۥ"
            r3 = r1
            r9 = r7
            goto Lb
        L72:
            int r7 = androidx.lifecycle.process.C1090.f116
            java.lang.String r1 = "ۨۦ"
            r8 = r7
            r9 = r1
            goto Lb
        L79:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r0, r3)
            java.lang.String r7 = "ۧۨۡ"
            r2 = r1
            r9 = r7
            goto Lb
        L82:
            r1 = r8 ^ (-429(0xfffffffffffffe53, float:NaN))
            java.lang.String r7 = "ۧۧ۠"
            r6 = r1
            r9 = r7
            goto Lb
        L89:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "ۥۥۥ"
            r2 = r1
            r9 = r7
            goto Lb
        L94:
            short[] r1 = m6954()
            java.lang.String r7 = "ۧۤۨ"
            r4 = r1
            r9 = r7
            goto Lb
        L9e:
            return
    }

    static /* synthetic */ void lambda$1(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$2(android.app.Dialog r2, android.app.Activity r3, android.view.View r4) {
            androidx.customview.C1074.m1118(r2)
            androidx.lifecycle.process.C1090.m2199(r3)
            int r1 = androidx.emoji2.C1080.m1539()
            r0 = 1616(0x650, float:2.264E-42)
        Lc:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L12;
                case 49: goto L15;
                case 204: goto L1a;
                case 239: goto L29;
                default: goto L11;
            }
        L11:
            goto Lc
        L12:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lc
        L15:
            if (r1 < 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            java.lang.String r0 = "7GnaRWMlXqow679dKAP"
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10629(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L29:
            return
    }

    static /* synthetic */ void lambda$3(android.app.Dialog r2, android.view.View r3) {
            androidx.customview.C1074.m1118(r2)
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
            java.lang.String r0 = "fCQPZlWQli3jK7cwn2Q"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* synthetic */ void lambda$4(android.view.View r2) {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
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
            java.lang.String r0 = "H67szT6Y6HdQas"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L23:
            return
    }

    private static android.graphics.drawable.GradientDrawable makeBtnBg(int r2) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r0, r2)
            r1 = 1102053376(0x41b00000, float:22.0)
            androidx.lifecycle.process.C1091.m2252(r0, r1)
            return r0
    }

    public static void openDirectoryPicker(android.app.Activity r5) {
            android.content.Intent r0 = new android.content.Intent
            short[] r1 = m6954()
            r2 = 28
            int r3 = androidx.activity.C1066.f92
            r3 = r3 ^ 797(0x31d, float:1.117E-42)
            r4 = 1111(0x457, float:1.557E-42)
            java.lang.String r1 = androidx.lifecycle.viewmodel.C1093.m2415(r1, r2, r3, r4)
            r0.<init>(r1)
            r1 = 1
            kevin.fun.hook.audio.C1117.m8143(r0, r1)
            int r1 = androidx.lifecycle.process.C1091.f117
            r1 = r1 ^ (-490(0xfffffffffffffe16, float:NaN))
            kevin.fun.hook.audio.C1117.m8143(r0, r1)
            int r1 = androidx.lifecycle.process.C1091.f117
            r1 = r1 ^ (-428(0xfffffffffffffe54, float:NaN))
            kevin.fun.hook.audio.C1117.m8143(r0, r1)
            int r1 = androidx.appcompat.C1069.f95
            r1 = r1 ^ (-109(0xffffffffffffff93, float:NaN))
            kevin.fun.hook.audio.C1117.m8143(r0, r1)
            int r1 = androidx.viewpager.C1108.f134
            r1 = r1 ^ (-9080(0xffffffffffffdc88, float:NaN))
            androidx.core.C1073.m1046(r5, r0, r1)
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1616(0x650, float:2.264E-42)
        L3b:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L41;
                case 49: goto L44;
                case 204: goto L49;
                case 239: goto L54;
                default: goto L40;
            }
        L40:
            goto L3b
        L41:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3b
        L44:
            if (r1 > 0) goto L41
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3b
        L49:
            java.lang.String r0 = "O4F6bpFGOQc6WEAOnbxAd0VGwNb"
            java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L54:
            return
    }

    public static void show(android.app.Activity r14, kevin.fun.hook.DownloadPathConfig r15) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L2e2;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r14 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            boolean r1 = androidx.loader.C1098.m2818(r14)
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
                case 47483: goto L2e2;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L26
        L30:
            android.app.Dialog r0 = new android.app.Dialog
            r1 = 16974134(0x1030136, float:2.406177E-38)
            int r2 = kevin.fun.hook.webdav.C1119.f418
            r1 = r1 ^ r2
            r0.<init>(r14, r1)
            r1 = 1
            androidx.lifecycle.runtime.C1092.m2297(r0, r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r14)
            r2 = -1711276478(0xffffffff99fffe42, float:-2.6469076E-23)
            int r3 = androidx.interpolator.C1083.f109
            r2 = r2 ^ r3
            androidx.lifecycle.livedata.C1084.m1783(r1, r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r14)
            r3 = 1
            androidx.customview.C1074.m1119(r2, r3)
            int r3 = androidx.versionedparcelable.C1107.f133
            r3 = r3 ^ 662(0x296, float:9.28E-43)
            int r4 = m6955(r14, r3)
            int r5 = androidx.customview.C1075.f101
            r5 = r5 ^ (-118(0xffffffffffffff8a, float:NaN))
            int r5 = m6955(r14, r5)
            int r6 = m6955(r14, r3)
            int r7 = androidx.lifecycle.livedata.C1084.f110
            r7 = r7 ^ 7
            int r7 = m6955(r14, r7)
            androidx.drawerlayout.C1077.m1314(r2, r4, r5, r6, r7)
            int r4 = androidx.vectordrawable.C1104.f130
            r4 = r4 ^ (-596(0xfffffffffffffdac, float:NaN))
            int r5 = androidx.lifecycle.runtime.C1092.f118
            r5 = r5 ^ (-799(0xfffffffffffffce1, float:NaN))
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r4, r5)
            r7 = 80
            r6.gravity = r7
            androidx.vectordrawable.C1105.m3296(r2, r6)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r6, r4)
            int r7 = m6955(r14, r3)
            float r7 = (float) r7
            int r8 = m6955(r14, r3)
            float r8 = (float) r8
            int r9 = m6955(r14, r3)
            float r9 = (float) r9
            int r3 = m6955(r14, r3)
            float r3 = (float) r3
            r10 = 8
            float[] r10 = new float[r10]
            r11 = 0
            r10[r11] = r7
            r7 = 1
            r10[r7] = r8
            r7 = 2
            r10[r7] = r9
            r7 = 3
            r10[r7] = r3
            int r3 = org.luckypray.dexkit.C1124.f434
            r3 = r3 ^ 663(0x297, float:9.29E-43)
            r7 = 0
            r10[r3] = r7
            r7 = 5
            r8 = 0
            r10[r7] = r8
            r7 = 6
            r8 = 0
            r10[r7] = r8
            r7 = 7
            r8 = 0
            r10[r7] = r8
            androidx.vectordrawable.C1103.m3187(r6, r10)
            androidx.activity.C1065.m397(r2, r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r14)
            short[] r7 = m6954()
            r8 = 68
            int r9 = androidx.loader.C1099.f125
            r9 = r9 ^ 861(0x35d, float:1.207E-42)
            r10 = 2067(0x813, float:2.896E-42)
            java.lang.String r7 = kevin.fun.hook.C1120.m8645(r7, r8, r9, r10)
            androidx.lifecycle.process.C1087.m1946(r6, r7)
            r7 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r7)
            android.graphics.Typeface r7 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r6, r7)
            int r7 = androidx.activity.C1062.f88
            r7 = r7 ^ (-92)
            androidx.documentfile.C1076.m1233(r6, r7)
            r7 = 14540265(0xdddde9, float:2.0375251E-38)
            int r8 = androidx.activity.C1065.f91
            r7 = r7 ^ r8
            kevin.fun.hook.webdav.C1118.m8517(r6, r7)
            int r7 = androidx.vectordrawable.C1105.f131
            r7 = r7 ^ 360(0x168, float:5.04E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = m6955(r14, r7)
            kevin.fun.hook.audio.C1117.m8126(r6, r8, r9, r10, r11)
            androidx.activity.C1064.m372(r2, r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r14)
            java.lang.String r8 = androidx.versionedparcelable.C1106.m3344(r15)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            short[] r10 = m6954()
            r11 = 74
            int r12 = androidx.startup.C1101.f127
            r12 = r12 ^ 760(0x2f8, float:1.065E-42)
            r13 = 3025(0xbd1, float:4.239E-42)
            java.lang.String r10 = androidx.loader.C1095.m2574(r10, r11, r12, r13)
            java.lang.StringBuilder r9 = androidx.lifecycle.livedata.C1085.m1859(r9, r10)
            java.lang.StringBuilder r8 = androidx.lifecycle.livedata.C1085.m1859(r9, r8)
            java.lang.String r8 = kevin.fun.hook.webdav.C1119.m8573(r8)
            androidx.lifecycle.process.C1087.m1946(r6, r8)
            r8 = 1096810496(0x41600000, float:14.0)
            androidx.vectordrawable.animated.C1102.m3105(r6, r8)
            r8 = -13421584(0xffffffffff3333f0, float:-2.3820149E38)
            int r9 = androidx.vectordrawable.animated.C1102.f128
            r8 = r8 ^ r9
            kevin.fun.hook.webdav.C1118.m8517(r6, r8)
            int r8 = androidx.loader.C1097.f123
            r8 = r8 ^ 126(0x7e, float:1.77E-43)
            int r9 = m6955(r14, r8)
            int r10 = m6955(r14, r8)
            int r11 = m6955(r14, r8)
            int r8 = m6955(r14, r8)
            kevin.fun.hook.audio.C1117.m8126(r6, r9, r10, r11, r8)
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
            r8.<init>()
            r9 = 657945(0xa0a19, float:9.21977E-40)
            int r10 = kevin.fun.hook.audio.C1114.f403
            r9 = r9 ^ r10
            androidx.lifecycle.livedata.C1085.m1879(r8, r9)
            int r9 = kevin.fun.hook.webdav.C1118.f417
            r9 = r9 ^ (-353(0xfffffffffffffe9f, float:NaN))
            int r10 = m6955(r14, r9)
            float r10 = (float) r10
            androidx.lifecycle.process.C1091.m2252(r8, r10)
            androidx.core.C1073.m999(r6, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r4, r5)
            org.luckypray.dexkit.C1124.m10544(r2, r6, r8)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r14)
            short[] r8 = m6954()
            r10 = 80
            int r11 = kevin.fun.hook.audio.C1116.f405
            r11 = r11 ^ 97
            r12 = 2399(0x95f, float:3.362E-42)
            java.lang.String r8 = androidx.activity.C1063.m241(r8, r10, r11, r12)
            androidx.lifecycle.process.C1087.m1946(r5, r8)
            r8 = 1094713344(0x41400000, float:12.0)
            androidx.vectordrawable.animated.C1102.m3105(r5, r8)
            r8 = 7829315(0x777743, float:1.0971207E-38)
            int r10 = androidx.activity.C1065.f91
            r8 = r8 ^ r10
            kevin.fun.hook.webdav.C1118.m8517(r5, r8)
            int r8 = m6955(r14, r3)
            int r9 = m6955(r14, r9)
            int r3 = m6955(r14, r3)
            int r7 = m6955(r14, r7)
            kevin.fun.hook.audio.C1117.m8126(r5, r8, r9, r3, r7)
            androidx.activity.C1064.m372(r2, r5)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r14)
            r5 = 0
            androidx.customview.C1074.m1119(r3, r5)
            int r5 = androidx.loader.C1098.f124
            r5 = r5 ^ (-820(0xfffffffffffffccc, float:NaN))
            androidx.emoji2.C1080.m1542(r3, r5)
            android.widget.Button r5 = new android.widget.Button
            r5.<init>(r14)
            short[] r7 = m6954()
            r8 = 131(0x83, float:1.84E-43)
            int r9 = androidx.emoji2.C1080.f106
            r9 = r9 ^ 379(0x17b, float:5.31E-43)
            r10 = 878(0x36e, float:1.23E-42)
            java.lang.String r7 = kevin.fun.hook.audio.C1116.m8020(r7, r8, r9, r10)
            androidx.interpolator.C1082.m53(r5, r7)
            r7 = 13422020(0xcccdc4, float:1.8808256E-38)
            int r8 = androidx.interpolator.C1081.f107
            r7 = r7 ^ r8
            androidx.lifecycle.livedata.C1084.m1743(r5, r7)
            r7 = 1250161(0x131371, float:1.751849E-39)
            int r8 = androidx.lifecycle.process.C1088.f114
            r7 = r7 ^ r8
            android.graphics.drawable.GradientDrawable r7 = m6953(r7)
            androidx.activity.C1063.m290(r5, r7)
            android.widget.Button r7 = new android.widget.Button
            r7.<init>(r14)
            short[] r8 = m6954()
            r9 = 133(0x85, float:1.86E-43)
            int r10 = androidx.interpolator.C1082.f108
            r10 = r10 ^ 349(0x15d, float:4.89E-43)
            r11 = 3226(0xc9a, float:4.52E-42)
            java.lang.String r8 = org.luckypray.dexkit.C1124.m10545(r8, r9, r10, r11)
            androidx.interpolator.C1082.m53(r7, r8)
            r8 = -10066119(0xffffffffff666739, float:-3.062584E38)
            int r9 = androidx.interpolator.C1082.f108
            r8 = r8 ^ r9
            androidx.lifecycle.livedata.C1084.m1743(r7, r8)
            r8 = 855535(0xd0def, float:1.19886E-39)
            int r9 = org.luckypray.dexkit.C1125.f435
            r8 = r8 ^ r9
            android.graphics.drawable.GradientDrawable r8 = m6953(r8)
            androidx.activity.C1063.m290(r7, r8)
            android.widget.Button r8 = new android.widget.Button
            r8.<init>(r14)
            short[] r9 = m6954()
            r10 = 135(0x87, float:1.89E-43)
            int r11 = androidx.interpolator.C1081.f107
            r11 = r11 ^ (-269(0xfffffffffffffef3, float:NaN))
            r12 = 2608(0xa30, float:3.655E-42)
            java.lang.String r9 = androidx.core.C1072.m957(r9, r10, r11, r12)
            androidx.interpolator.C1082.m53(r8, r9)
            androidx.lifecycle.livedata.C1084.m1743(r8, r4)
            r4 = 43165(0xa89d, float:6.0487E-41)
            int r9 = androidx.annotation.experimental.C1067.f93
            r4 = r4 ^ r9
            android.graphics.drawable.GradientDrawable r4 = m6953(r4)
            androidx.activity.C1063.m290(r8, r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r9 = 0
            int r10 = androidx.vectordrawable.C1104.f130
            r10 = r10 ^ (-595(0xfffffffffffffdad, float:NaN))
            r11 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r9, r10, r11)
            int r9 = androidx.loader.C1099.f125
            r9 = r9 ^ 863(0x35f, float:1.21E-42)
            int r10 = m6955(r14, r9)
            r11 = 0
            int r9 = m6955(r14, r9)
            r12 = 0
            androidx.vectordrawable.animated.C1102.m3125(r4, r10, r11, r9, r12)
            org.luckypray.dexkit.C1124.m10544(r3, r5, r4)
            org.luckypray.dexkit.C1124.m10544(r3, r7, r4)
            org.luckypray.dexkit.C1124.m10544(r3, r8, r4)
            androidx.activity.C1064.m372(r2, r3)
            kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda0 r3 = new kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda0
            r3.<init>(r15, r6, r14)
            androidx.lifecycle.viewmodel.C1093.m2380(r5, r3)
            kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda1 r3 = new kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda1
            r3.<init>(r0)
            androidx.lifecycle.viewmodel.C1093.m2380(r7, r3)
            kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda2 r3 = new kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda2
            r3.<init>(r0, r14)
            androidx.lifecycle.viewmodel.C1093.m2380(r8, r3)
            androidx.annotation.experimental.C1067.m579(r1, r2)
            androidx.viewpager.C1108.m3545(r0, r1)
            kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda3 r3 = new kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda3
            r3.<init>(r0)
            androidx.emoji2.viewsintegration.C1079.m1483(r1, r3)
            kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda4 r1 = new kevin.fun.hook.DownloadPathDialog$$ExternalSyntheticLambda4
            r1.<init>()
            com.tencent.mmkv.C1109.m3617(r2, r1)
            kevin.fun.hook.audio.C1114.m7909(r0)
            int r0 = androidx.lifecycle.runtime.C1092.f118
            r0 = r0 ^ 611(0x263, float:8.56E-43)
            int r0 = m6955(r14, r0)
            float r0 = (float) r0
            androidx.loader.C1096.m2641(r2, r0)
            android.view.ViewPropertyAnimator r0 = androidx.annotation.experimental.C1067.m594(r2)
            r1 = 0
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1094.m2503(r0, r1)
            r2 = -186(0xffffffffffffff46, double:NaN)
            int r1 = androidx.interpolator.C1083.f109
            long r4 = (long) r1
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r2 = 1062836634(0x3f59999a, float:0.85)
            r1.<init>(r2)
            android.view.ViewPropertyAnimator r0 = androidx.emoji2.viewsintegration.C1078.m1396(r0, r1)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)
        L2e2:
            return
    }

    private static void toast(android.app.Activity r1, java.lang.String r2) {
            r0 = 0
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r1, r2, r0)
            androidx.viewpager.C1108.m3524(r0)
            return
    }

    /* JADX INFO: renamed from: ۟ۢۦۡۢ, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.GradientDrawable m6953(int r2) {
            int r1 = androidx.startup.C1101.m2984()
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
            android.graphics.drawable.GradientDrawable r0 = makeBtnBg(r2)
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

    /* JADX INFO: renamed from: ۠ۤۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m6954() {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            short[] r0 = kevin.fun.hook.DownloadPathDialog.f364short
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

    /* JADX INFO: renamed from: ۤۡۨۨ, reason: not valid java name and contains not printable characters */
    public static int m6955(java.lang.Object r2, int r3) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            int r0 = m89dp(r2, r3)
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

    /* JADX INFO: renamed from: ۧ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static void m6956(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r3 = (java.lang.String) r3
            toast(r2, r3)
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
