package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public class KevinHook implements de.robv.android.xposed.IXposedHookLoadPackage, de.robv.android.xposed.IXposedHookZygoteInit {
    public static java.lang.String modulePath;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f368short = null;

    static {
            r0 = 92
            short[] r0 = new short[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1750, 1754, 1752, 1691, 1734, 1734, 1691, 1748, 1755, 1745, 1735, 1754, 1756, 1745, 1691, 1728, 1746, 1750, 1691, 1748, 1730, 1744, 1752, 1744, 1598, 1586, 1584, 1651, 1582, 1584, 1588, 1585, 1592, 1651, 1594, 1588, 1595, 1584, 1596, 1590, 1592, 1583, 3030, 3034, 3032, 2971, 3021, 3036, 3035, 3026, 3036, 3035, 2971, 3021, 3037, 3014, 763, 759, 757, 694, 753, 757, 761, 767, 753, 758, 747, 748, 749, 764, 753, 759, 694, 753, 757, 761, 767, 765, 748, 759, 759, 756, 747, 694, 744, 753, 736, 765, 756, 756, 761, 762} // fill-array
            kevin.fun.hook.KevinHook.f368short = r0
            return
    }

    public KevinHook() {
            r2 = this;
            r2.<init>()
            int r1 = androidx.lifecycle.process.C1088.m2011()
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
            if (r1 < 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            java.lang.String r0 = "0ibgpYLsif6XLOY"
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10629(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L22:
            return
    }

    /* JADX INFO: renamed from: ۟۟ۥۡۤ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7216(java.lang.Object r2) {
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            de.robv.android.xposed.IXposedHookZygoteInit$StartupParam r2 = (de.robv.android.xposed.IXposedHookZygoteInit.StartupParam) r2
            java.lang.String r0 = r2.modulePath
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

    /* JADX INFO: renamed from: ۣ۟ۢ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m7217() {
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            short[] r0 = kevin.fun.hook.KevinHook.f368short
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

    /* JADX INFO: renamed from: ۟ۤۧۨۦ, reason: not valid java name and contains not printable characters */
    public static void m7218(java.lang.Object r2, java.lang.Object r3) {
            int r1 = org.luckypray.dexkit.C1123.m10509()
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
            kevin.fun.hook.Pexellad r2 = (kevin.fun.hook.Pexellad) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            r2.handleLoadPackage(r3)
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

    /* JADX INFO: renamed from: ۠ۤۥۤ, reason: not valid java name and contains not printable characters */
    public static void m7219(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            r2.handleLoadPackage(r3)
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

    /* JADX INFO: renamed from: ۡۥۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7220(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            kevin.fun.hook.XhsHook r2 = (kevin.fun.hook.XhsHook) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            r2.handleLoadPackage(r3)
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

    /* JADX INFO: renamed from: ۦۦ۟ۧ, reason: contains not printable characters */
    public static void m7221(java.lang.Object r2, java.lang.Object r3) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
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
            kevin.fun.hook.DYHook r2 = (kevin.fun.hook.DYHook) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            r2.handleLoadPackage(r3)
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

    /* JADX INFO: renamed from: ۧ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m7222(java.lang.Object r2) {
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
            if (r1 < 0) goto Lc
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

    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r6) throws java.lang.Throwable {
            r5 = this;
            java.lang.String r0 = m7222(r6)
            short[] r1 = m7217()
            r2 = 0
            int r3 = androidx.interpolator.C1081.f107
            r3 = r3 ^ (-273(0xfffffffffffffeef, float:NaN))
            r4 = 1717(0x6b5, float:2.406E-42)
            java.lang.String r1 = androidx.loader.C1099.m2843(r1, r2, r3, r4)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            r0 = 1616(0x650, float:2.264E-42)
        L19:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1f;
                case 49: goto L22;
                case 204: goto L27;
                case 239: goto L53;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L19
        L22:
            if (r1 == 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            kevin.fun.hook.DYHook r0 = new kevin.fun.hook.DYHook
            r0.<init>()
            m7221(r0, r6)
            int r1 = org.luckypray.dexkit.C1123.m10509()
            r0 = 1740(0x6cc, float:2.438E-42)
        L35:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L3b;
                case 54: goto L40;
                case 471: goto L52;
                case 500: goto L43;
                default: goto L3a;
            }
        L3a:
            goto L35
        L3b:
            if (r1 > 0) goto L40
            r0 = 1833(0x729, float:2.569E-42)
            goto L35
        L40:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L35
        L43:
            java.lang.String r0 = "RxockCGHycwgv5GLv00rBcGp"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L52:
            return
        L53:
            java.lang.String r0 = m7222(r6)
            short[] r1 = m7217()
            r2 = 24
            int r3 = androidx.loader.C1097.f123
            r3 = r3 ^ 96
            r4 = 1629(0x65d, float:2.283E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1078.m1413(r1, r2, r3, r4)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            r0 = 1864(0x748, float:2.612E-42)
        L6d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L73;
                case 47384: goto L86;
                case 47417: goto L7d;
                case 47483: goto L79;
                default: goto L72;
            }
        L72:
            goto L6d
        L73:
            if (r1 == 0) goto L79
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L6d
        L79:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L6d
        L7d:
            kevin.fun.hook.KSHook r0 = new kevin.fun.hook.KSHook
            r0.<init>()
            m7219(r0, r6)
            goto L52
        L86:
            java.lang.String r0 = m7222(r6)
            short[] r1 = m7217()
            r2 = 42
            int r3 = androidx.emoji2.C1080.f106
            r3 = r3 ^ 375(0x177, float:5.25E-43)
            r4 = 2997(0xbb5, float:4.2E-42)
            java.lang.String r1 = androidx.emoji2.viewsintegration.C1079.m1457(r1, r2, r3, r4)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            r0 = 48767(0xbe7f, float:6.8337E-41)
        La1:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 14: goto La9;
                case 45: goto Lbc;
                case 76: goto Lb3;
                case 239: goto Lad;
                default: goto La8;
            }
        La8:
            goto La1
        La9:
            r0 = 48829(0xbebd, float:6.8424E-41)
            goto La1
        Lad:
            if (r1 == 0) goto La9
            r0 = 48860(0xbedc, float:6.8467E-41)
            goto La1
        Lb3:
            kevin.fun.hook.XhsHook r0 = new kevin.fun.hook.XhsHook
            r0.<init>()
            m7220(r0, r6)
            goto L52
        Lbc:
            java.lang.String r0 = m7222(r6)
            short[] r1 = m7217()
            r2 = 56
            int r3 = androidx.startup.C1100.f126
            r3 = r3 ^ (-306(0xfffffffffffffece, float:NaN))
            r4 = 664(0x298, float:9.3E-43)
            java.lang.String r1 = androidx.activity.C1065.m410(r1, r2, r3, r4)
            boolean r1 = org.luckypray.dexkit.C1125.m10633(r0, r1)
            r0 = 48891(0xbefb, float:6.8511E-41)
        Ld7:
            r2 = 48908(0xbf0c, float:6.8535E-41)
            r0 = r0 ^ r2
            switch(r0) {
                case 22: goto Ldf;
                case 53: goto L52;
                case 503: goto Le3;
                case 32495: goto Le9;
                default: goto Lde;
            }
        Lde:
            goto Ld7
        Ldf:
            r0 = 48953(0xbf39, float:6.8598E-41)
            goto Ld7
        Le3:
            if (r1 == 0) goto Ldf
            r0 = 49635(0xc1e3, float:6.9553E-41)
            goto Ld7
        Le9:
            kevin.fun.hook.Pexellad r0 = new kevin.fun.hook.Pexellad
            r0.<init>()
            m7218(r0, r6)
            goto L52
    }

    public void initZygote(de.robv.android.xposed.IXposedHookZygoteInit.StartupParam r3) throws java.lang.Throwable {
            r2 = this;
            java.lang.String r0 = m7216(r3)
            kevin.fun.hook.KevinHook.modulePath = r0
            int r1 = androidx.customview.C1075.m1139()
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
            if (r1 > 0) goto L12
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lc
        L1a:
            java.lang.String r0 = "psm"
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3070(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L29:
            return
    }
}
