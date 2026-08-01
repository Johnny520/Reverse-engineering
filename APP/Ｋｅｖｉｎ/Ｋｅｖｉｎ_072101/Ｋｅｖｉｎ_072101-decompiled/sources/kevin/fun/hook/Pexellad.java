package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class Pexellad implements de.robv.android.xposed.IXposedHookLoadPackage {
    private static final java.lang.String PACKAGE_NAME = null;
    private static final java.util.HashMap<java.lang.String, android.graphics.Typeface> fontCache = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f378short = null;



    static {
            r0 = 165(0xa5, float:2.31E-43)
            short[] r0 = new short[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [299, 295, 293, 358, 289, 293, 297, 303, 289, 294, 315, 316, 317, 300, 289, 295, 358, 289, 293, 297, 303, 301, 316, 295, 295, 292, 315, 358, 312, 289, 304, 301, 292, 292, 297, 298, 3026, 3038, 3036, 2975, 3032, 3036, 3024, 3030, 3032, 3039, 3010, 3013, 3012, 3029, 3032, 3038, 2975, 3032, 3036, 3024, 3030, 3028, 3013, 3038, 3038, 3037, 3010, 2975, 3009, 3032, 3017, 3028, 3037, 3037, 3024, 3027, 640, 657, 646, 642, 663, 646, 677, 657, 652, 654, 674, 656, 656, 646, 663, 1488, 24284, 19160, 31384, 24275, 19045, 23686, 1494, 1451, 1475, 1508, 1508, 1504, 23738, -30546, 1457, 1451, 3060, 3067, 3057, 3047, 3066, 3068, 3057, 3003, 3060, 3045, 3045, 3003, 3028, 3062, 3041, 3068, 3043, 3068, 3041, 3052, 1177, 1176, 1210, 1177, 1153, 1211, 1171, 1179, 1177, 1156, 1167, 501, 23289, 20221, 32445, 23286, 20032, 22691, 499, 398, 486, 449, 449, 453, 398, 449, 448, 482, 449, 473, 483, 459, 451, 449, 476, 471, 398, 22687, -29557, 404, 398} // fill-array
            kevin.fun.hook.Pexellad.f378short = r0
            short[] r0 = m7336()
            r1 = 0
            int r2 = androidx.vectordrawable.C1104.f130
            r2 = r2 ^ 631(0x277, float:8.84E-43)
            r3 = 328(0x148, float:4.6E-43)
            java.lang.String r0 = androidx.emoji2.C1080.m1525(r0, r1, r2, r3)
            kevin.fun.hook.Pexellad.PACKAGE_NAME = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            kevin.fun.hook.Pexellad.fontCache = r0
            return
    }

    public Pexellad() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.interpolator.C1081.m1643()
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
            java.lang.String r0 = "z9"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    static /* bridge */ /* synthetic */ java.util.HashMap _$$Nest$sfgetfontCache() {
            java.util.HashMap r0 = m7333()
            return r0
    }

    /* JADX INFO: renamed from: ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m7332(java.lang.Object r3) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r3 = (java.lang.String) r3
            de.robv.android.xposed.XposedBridge.log(r3)
        L19:
            int r1 = androidx.appcompat.C1069.m747()
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
            java.lang.String r0 = "xjj10K3wK0XiJe"
            java.lang.String r0 = androidx.activity.C1065.m453(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
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

    /* JADX INFO: renamed from: ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static java.util.HashMap m7333() {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            java.util.HashMap<java.lang.String, android.graphics.Typeface> r0 = kevin.fun.hook.Pexellad.fontCache
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

    /* JADX INFO: renamed from: ۣ۟ۧ۟, reason: not valid java name and contains not printable characters */
    public static java.lang.ClassLoader m7334(java.lang.Object r2) {
            int r1 = androidx.activity.C1062.m182()
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
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r2 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r2
            java.lang.ClassLoader r0 = r2.classLoader
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

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7335(java.lang.Object r2) {
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
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r2 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r2
            java.lang.String r0 = r2.packageName
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

    /* JADX INFO: renamed from: ۠ۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7336() {
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            short[] r0 = kevin.fun.hook.Pexellad.f378short
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

    /* JADX INFO: renamed from: ۢۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static de.robv.android.xposed.XC_MethodHook.Unhook m7337(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            de.robv.android.xposed.XC_MethodHook$Unhook r0 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r2, r3, r4, r5)
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

    /* JADX INFO: renamed from: ۥۥۧ۟, reason: contains not printable characters */
    public static de.robv.android.xposed.XC_MethodHook.Unhook m7338(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1095.m2562()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            de.robv.android.xposed.XC_MethodHook$Unhook r0 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r2, r3, r4)
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

    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r7) throws java.lang.Throwable {
            r6 = this;
            short[] r0 = m7336()
            r1 = 36
            int r2 = androidx.lifecycle.process.C1088.f114
            r2 = r2 ^ (-71)
            r3 = 2993(0xbb1, float:4.194E-42)
            java.lang.String r0 = androidx.documentfile.C1076.m1234(r0, r1, r2, r3)
            java.lang.String r1 = m7335(r7)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            r0 = 1616(0x650, float:2.264E-42)
        L1a:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L20;
                case 49: goto L23;
                case 204: goto L28;
                case 239: goto L4c;
                default: goto L1f;
            }
        L1f:
            goto L1a
        L20:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1a
        L23:
            if (r1 != 0) goto L20
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1a
        L28:
            int r1 = kevin.fun.hook.audio.C1116.m8064()
            r0 = 1740(0x6cc, float:2.438E-42)
        L2e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L34;
                case 54: goto L39;
                case 471: goto L4b;
                case 500: goto L3c;
                default: goto L33;
            }
        L33:
            goto L2e
        L34:
            if (r1 < 0) goto L39
            r0 = 1833(0x729, float:2.569E-42)
            goto L2e
        L39:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2e
        L3c:
            java.lang.String r0 = "5U0K8y0U"
            java.lang.String r0 = kevin.fun.hook.webdav.C1118.m8480(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L4b:
            return
        L4c:
            short[] r0 = m7336()     // Catch: java.lang.Throwable -> L8b
            r1 = 72
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137     // Catch: java.lang.Throwable -> L8b
            r2 = r2 ^ (-118(0xffffffffffffff8a, float:NaN))
            r3 = 739(0x2e3, float:1.036E-42)
            java.lang.String r0 = androidx.interpolator.C1081.m1616(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L8b
            kevin.fun.hook.Pexellad$1 r1 = new kevin.fun.hook.Pexellad$1     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8b
            int r3 = androidx.emoji2.viewsintegration.C1078.f104     // Catch: java.lang.Throwable -> L8b
            r3 = r3 ^ 615(0x267, float:8.62E-43)
            java.lang.Class<android.content.res.AssetManager> r4 = android.content.res.AssetManager.class
            r2[r3] = r4     // Catch: java.lang.Throwable -> L8b
            int r3 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138     // Catch: java.lang.Throwable -> L8b
            r3 = r3 ^ (-933(0xfffffffffffffc5b, float:NaN))
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4     // Catch: java.lang.Throwable -> L8b
            int r3 = kevin.fun.hook.audio.C1116.f405     // Catch: java.lang.Throwable -> L8b
            r3 = r3 ^ 80
            r2[r3] = r1     // Catch: java.lang.Throwable -> L8b
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            m7338(r1, r0, r2)     // Catch: java.lang.Throwable -> L8b
            r0 = 1864(0x748, float:2.612E-42)
        L81:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L87;
                case 47483: goto Lb4;
                default: goto L86;
            }
        L86:
            goto L81
        L87:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L81
        L8b:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7336()
            r3 = 87
            int r4 = androidx.lifecycle.viewmodel.C1093.f119
            r4 = r4 ^ (-101(0xffffffffffffff9b, float:NaN))
            r5 = 1419(0x58b, float:1.988E-42)
            java.lang.String r2 = androidx.emoji2.viewsintegration.C1079.m1457(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7332(r0)
        Lb4:
            short[] r0 = m7336()     // Catch: java.lang.Throwable -> Lf8
            r1 = 104(0x68, float:1.46E-43)
            int r2 = kevin.fun.hook.audio.C1115.f404     // Catch: java.lang.Throwable -> Lf8
            r2 = r2 ^ 822(0x336, float:1.152E-42)
            r3 = 2965(0xb95, float:4.155E-42)
            java.lang.String r0 = androidx.activity.C1064.m310(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lf8
            java.lang.ClassLoader r1 = m7334(r7)     // Catch: java.lang.Throwable -> Lf8
            short[] r2 = m7336()     // Catch: java.lang.Throwable -> Lf8
            r3 = 124(0x7c, float:1.74E-43)
            int r4 = kevin.fun.hook.webdav.C1118.f417     // Catch: java.lang.Throwable -> Lf8
            r4 = r4 ^ (-354(0xfffffffffffffe9e, float:NaN))
            r5 = 1270(0x4f6, float:1.78E-42)
            java.lang.String r2 = androidx.lifecycle.livedata.C1084.m1796(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lf8
            kevin.fun.hook.Pexellad$2 r3 = new kevin.fun.hook.Pexellad$2     // Catch: java.lang.Throwable -> Lf8
            r3.<init>(r6)     // Catch: java.lang.Throwable -> Lf8
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lf8
            int r5 = kevin.fun.hook.audio.C1114.f403     // Catch: java.lang.Throwable -> Lf8
            r5 = r5 ^ (-20)
            r4[r5] = r3     // Catch: java.lang.Throwable -> Lf8
            m7337(r0, r1, r2, r4)     // Catch: java.lang.Throwable -> Lf8
            r0 = 48767(0xbe7f, float:6.8337E-41)
        Lec:
            r1 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r1
            switch(r0) {
                case 14: goto L4b;
                case 239: goto Lf4;
                default: goto Lf3;
            }
        Lf3:
            goto Lec
        Lf4:
            r0 = 48798(0xbe9e, float:6.838E-41)
            goto Lec
        Lf8:
            r0 = move-exception
            java.lang.String r0 = androidx.loader.C1099.m2895(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            short[] r2 = m7336()
            r3 = 135(0x87, float:1.89E-43)
            int r4 = androidx.activity.C1062.f88
            r4 = r4 ^ (-85)
            r5 = 430(0x1ae, float:6.03E-43)
            java.lang.String r2 = androidx.emoji2.C1080.m1525(r2, r3, r4, r5)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.StringBuilder r0 = androidx.lifecycle.livedata.C1085.m1859(r1, r0)
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8573(r0)
            m7332(r0)
            goto L4b
    }
}
