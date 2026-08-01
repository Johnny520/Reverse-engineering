package kevin.fun.hook.gesture;

/* JADX INFO: loaded from: classes.dex */
public class GestureRegionDialog {
    private static final android.os.Handler MAIN_HANDLER = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f412short = null;

    public interface ActionCallback {
        static {
                return
        }

        void onActionSelected(int r1, int r2, boolean r3);
    }

    static {
            r0 = 31
            short[] r0 = new short[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [8834, 25533, 29554, 22445, 21320, 20731, 19715, 20530, 21719, 24515, 19502, 20767, 22010, 24418, 17051, 24491, 23374, 23412, 18584, 21928, 20813, 22336, -32500, 30172, 21782, 22305, -27634, 25208, 1041, 1052, 1041} // fill-array
            kevin.fun.hook.gesture.GestureRegionDialog.f412short = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.gesture.GestureRegionDialog.MAIN_HANDLER = r0
            return
    }

    public GestureRegionDialog() {
            r2 = this;
            r2.<init>()
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            java.lang.String r0 = "MoiScy"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    private static void addRadioItem(android.content.Context r8, android.widget.LinearLayout r9, int r10, java.lang.String r11, boolean r12, java.lang.Runnable r13) {
            r4 = 1096810496(0x41600000, float:14.0)
            r7 = 0
            r6 = 1098907648(0x41800000, float:16.0)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r8)
            androidx.customview.C1074.m1119(r0, r7)
            int r1 = kevin.fun.hook.audio.C1116.f405
            r1 = r1 ^ 66
            androidx.emoji2.C1080.m1542(r0, r1)
            int r1 = m8344(r8, r6)
            int r2 = m8344(r8, r4)
            int r3 = m8344(r8, r6)
            int r4 = m8344(r8, r4)
            androidx.drawerlayout.C1077.m1314(r0, r1, r2, r3, r4)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r8)
            androidx.lifecycle.process.C1087.m1946(r1, r11)
            r2 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r1, r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r8)
            short[] r3 = m8348()
            r4 = 1
            r5 = 1425(0x591, float:1.997E-42)
            java.lang.String r3 = androidx.activity.C1065.m410(r3, r7, r4, r5)
            androidx.lifecycle.process.C1087.m1946(r2, r3)
            androidx.vectordrawable.animated.C1102.m3105(r2, r6)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r4 = kevin.fun.hook.audio.C1116.f405
            r4 = r4 ^ (-84)
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r7, r4, r5)
            org.luckypray.dexkit.C1124.m10544(r0, r1, r3)
            androidx.activity.C1064.m372(r0, r2)
            m8345(r1, r2, r12)
            kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda3 r1 = new kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda3
            r1.<init>(r13)
            com.tencent.mmkv.C1109.m3617(r0, r1)
            androidx.activity.C1064.m372(r9, r0)
            int r1 = kevin.fun.hook.audio.C1115.m7981(r9, r0)
            int r2 = androidx.loader.C1098.m2812(r9)
            int r3 = androidx.activity.C1066.f92
            r0 = 1616(0x650, float:2.264E-42)
        L75:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L7b;
                case 49: goto L7e;
                case 204: goto L86;
                case 239: goto La9;
                default: goto L7a;
            }
        L7a:
            goto L75
        L7b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L75
        L7e:
            r0 = r3 ^ (-822(0xfffffffffffffcca, float:NaN))
            int r0 = r0 + r2
            if (r1 >= r0) goto L7b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L75
        L86:
            android.view.View r0 = new android.view.View
            r0.<init>(r8)
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = m8344(r8, r1)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            int r3 = androidx.startup.C1100.f126
            r3 = r3 ^ 277(0x115, float:3.88E-43)
            r2.<init>(r3, r1)
            androidx.lifecycle.livedata.C1085.m1843(r0, r2)
            r1 = 1118591(0x11117f, float:1.56748E-39)
            int r2 = androidx.emoji2.viewsintegration.C1079.f105
            r1 = r1 ^ r2
            androidx.loader.C1099.m2849(r0, r1)
            androidx.activity.C1064.m372(r9, r0)
        La9:
            return
    }

    private static void animatePanel(android.view.View r14) {
            r8 = 0
            r13 = 1063675494(0x3f666666, float:0.9)
            r1 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            java.lang.String r4 = "ۤۢۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r6 = r8
            r10 = r8
        L10:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56413: goto L54;
                case 1746751: goto L26;
                case 1748609: goto L4c;
                case 1749573: goto L64;
                case 1749665: goto L44;
                case 1749820: goto L2c;
                case 1751588: goto L5d;
                case 1751653: goto L71;
                case 1752553: goto L34;
                case 1752670: goto L1e;
                case 1753605: goto L6c;
                case 1753701: goto L79;
                case 1754654: goto L80;
                case 1755555: goto L3c;
                default: goto L17;
            }
        L17:
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3710(r14, r13)
            java.lang.String r1 = "ۥۦ۟"
            r4 = r1
            goto L10
        L1e:
            r1 = 0
            androidx.activity.C1062.m205(r14, r1)
            java.lang.String r1 = "ۨۦۡ"
            r4 = r1
            goto L10
        L26:
            int r5 = androidx.startup.C1100.f126
            java.lang.String r1 = "ۦۥۤ"
            r4 = r1
            goto L10
        L2c:
            android.view.ViewPropertyAnimator r1 = androidx.drawerlayout.C1077.m1332(r2, r12)
            java.lang.String r4 = "ۢ۟ۢ"
            r3 = r1
            goto L10
        L34:
            android.view.ViewPropertyAnimator r1 = androidx.documentfile.C1076.m1256(r2, r12)
            java.lang.String r4 = "۟ۡۡ"
            r3 = r1
            goto L10
        L3c:
            android.view.ViewPropertyAnimator r1 = androidx.startup.C1100.m2953(r14)
            java.lang.String r4 = "ۢۧۡ"
            r2 = r1
            goto L10
        L44:
            r8 = -478(0xfffffffffffffe22, double:NaN)
            long r8 = r8 ^ r6
            java.lang.String r1 = "ۤۤۥ"
            r4 = r1
            r10 = r8
            goto L10
        L4c:
            android.view.ViewPropertyAnimator r1 = androidx.emoji2.viewsintegration.C1078.m1396(r2, r0)
            java.lang.String r4 = "ۦۨۧ"
            r3 = r1
            goto L10
        L54:
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            java.lang.String r1 = "ۡ۟۟"
            r4 = r1
            goto L10
        L5d:
            androidx.activity.C1062.m186(r14, r13)
            java.lang.String r1 = "۟۟"
            r4 = r1
            goto L10
        L64:
            android.view.ViewPropertyAnimator r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r3, r12)
            java.lang.String r4 = "ۥۢۦ"
            r2 = r1
            goto L10
        L6c:
            long r6 = (long) r5
            java.lang.String r1 = "ۢۢۡ"
            r4 = r1
            goto L10
        L71:
            android.view.ViewPropertyAnimator r1 = androidx.loader.C1099.m2899(r3, r10)
            java.lang.String r4 = "ۣ۠"
            r2 = r1
            goto L10
        L79:
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r3)
            java.lang.String r1 = "ۧۨ۟"
            r4 = r1
            goto L10
        L80:
            return
    }

    private static void applyRadioStyle(android.widget.TextView r2, android.widget.TextView r3, boolean r4) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L38;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r4 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            r0 = -15658319(0xffffffffff1112b1, float:-1.9283511E38)
            int r1 = androidx.lifecycle.process.C1089.f115
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r2, r0)
            android.graphics.Typeface r0 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r2, r0)
            r0 = 0
            androidx.loader.C1095.m2596(r3, r0)
            r0 = -43819(0xffffffffffff54d5, float:NaN)
            int r1 = androidx.core.ktx.C1071.f97
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r3, r0)
            r0 = 1740(0x6cc, float:2.438E-42)
        L2f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L35;
                case 54: goto L4f;
                default: goto L34;
            }
        L34:
            goto L2f
        L35:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2f
        L38:
            r0 = 6710803(0x666613, float:9.403838E-39)
            int r1 = androidx.lifecycle.viewmodel.C1093.f119
            r0 = r0 ^ r1
            kevin.fun.hook.webdav.C1118.m8517(r2, r0)
            android.graphics.Typeface r0 = androidx.startup.C1101.m3047()
            androidx.customview.C1074.m47(r2, r0)
            int r0 = androidx.loader.C1098.f124
            r0 = r0 ^ (-807(0xfffffffffffffcd9, float:NaN))
            androidx.loader.C1095.m2596(r3, r0)
        L4f:
            return
    }

    private static android.widget.TextView buildTitle(android.content.Context r8, java.lang.String r9) {
            r1 = 0
            r7 = 1098907648(0x41800000, float:16.0)
            r5 = 0
            java.lang.String r3 = "ۧۤۤ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
        La:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56482: goto L1f;
                case 1746782: goto L28;
                case 1747717: goto L79;
                case 1747773: goto L2f;
                case 1747808: goto L4e;
                case 1748891: goto L18;
                case 1750721: goto L55;
                case 1750723: goto L48;
                case 1752708: goto L64;
                case 1753509: goto L71;
                case 1754535: goto L5b;
                case 1755525: goto L6b;
                case 1755528: goto L36;
                case 1755554: goto L3e;
                default: goto L11;
            }
        L11:
            androidx.customview.C1074.m47(r0, r2)
            java.lang.String r1 = "ۣۥۥ"
            r3 = r1
            goto La
        L18:
            kevin.fun.hook.audio.C1117.m8126(r0, r5, r6, r5, r4)
            java.lang.String r1 = "۠ۡۦ"
            r3 = r1
            goto La
        L1f:
            r1 = 13422243(0xcccea3, float:1.8808569E-38)
            r4 = r1 ^ r6
            java.lang.String r1 = "۟ۢۡ"
            r3 = r1
            goto La
        L28:
            kevin.fun.hook.webdav.C1118.m8517(r0, r4)
            java.lang.String r1 = "ۨۥۢ"
            r3 = r1
            goto La
        L2f:
            androidx.lifecycle.process.C1087.m1946(r0, r9)
            java.lang.String r1 = "۠ۤۤ"
            r3 = r1
            goto La
        L36:
            android.graphics.Typeface r1 = androidx.emoji2.C1080.m1508()
            java.lang.String r3 = "ۣ۟ۨ"
            r2 = r1
            goto La
        L3e:
            r1 = 1094713344(0x41400000, float:12.0)
            int r6 = m8344(r8, r1)
            java.lang.String r1 = "ۦۢۡ"
            r3 = r1
            goto La
        L48:
            int r6 = androidx.lifecycle.process.C1087.f113
            java.lang.String r1 = "ۥۧ"
            r3 = r1
            goto La
        L4e:
            androidx.vectordrawable.animated.C1102.m3105(r0, r7)
            java.lang.String r1 = "ۨۥۥ"
            r3 = r1
            goto La
        L55:
            r4 = r6 ^ (-116(0xffffffffffffff8c, float:NaN))
            java.lang.String r1 = "ۥۧۦ"
            r3 = r1
            goto La
        L5b:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            java.lang.String r1 = "ۣ۠۠"
            r3 = r1
            goto La
        L64:
            androidx.documentfile.C1076.m1233(r0, r4)
            java.lang.String r1 = "ۨۦ۠"
            r3 = r1
            goto La
        L6b:
            int r6 = androidx.lifecycle.process.C1088.f114
            java.lang.String r1 = "ۣۥۣ"
            r3 = r1
            goto La
        L71:
            int r4 = m8344(r8, r7)
            java.lang.String r1 = "ۡۨۢ"
            r3 = r1
            goto La
        L79:
            return r0
    }

    /* JADX INFO: renamed from: dp */
    private static int m107dp(android.content.Context r8, float r9) {
            r1 = 0
            r6 = 0
            r4 = 0
            java.lang.String r3 = "ۢۨۥ"
            r0 = r1
            r2 = r1
            r5 = r6
            r7 = r6
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1749699: goto L28;
                case 1749855: goto L18;
                case 1750626: goto L20;
                case 1751525: goto L37;
                case 1754660: goto L2e;
                case 1755340: goto L3c;
                default: goto L10;
            }
        L10:
            android.util.DisplayMetrics r1 = androidx.activity.C1062.m159(r0)
            java.lang.String r3 = "ۧۨۥ"
            r2 = r1
            goto L9
        L18:
            android.content.res.Resources r0 = androidx.emoji2.viewsintegration.C1078.m1401(r8)
            java.lang.String r1 = "ۦۣۧ"
            r3 = r1
            goto L9
        L20:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r9 = r5 + r1
            java.lang.String r1 = "ۤ۠ۡ"
            r3 = r1
            goto L9
        L28:
            float r5 = r9 * r7
            java.lang.String r1 = "ۣۢۡ"
            r3 = r1
            goto L9
        L2e:
            float r6 = androidx.vectordrawable.animated.C1102.m3118(r2)
            java.lang.String r1 = "ۣۢۤ"
            r3 = r1
            r7 = r6
            goto L9
        L37:
            int r4 = (int) r9
            java.lang.String r1 = "ۣۨ۟"
            r3 = r1
            goto L9
        L3c:
            return r4
    }

    private static java.lang.String getRegionName(int r4) {
            switch(r4) {
                case 0: goto L45;
                case 1: goto L34;
                case 2: goto L23;
                case 3: goto L13;
                default: goto L3;
            }
        L3:
            short[] r0 = m8348()
            r1 = 1
            int r2 = org.luckypray.dexkit.C1123.f433
            r2 = r2 ^ (-963(0xfffffffffffffc3d, float:NaN))
            r3 = 1175(0x497, float:1.647E-42)
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10615(r0, r1, r2, r3)
        L12:
            return r0
        L13:
            short[] r0 = m8348()
            r1 = 5
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r2 = r2 ^ (-930(0xfffffffffffffc5e, float:NaN))
            r3 = 776(0x308, float:1.087E-42)
            java.lang.String r0 = androidx.activity.C1065.m410(r0, r1, r2, r3)
            goto L12
        L23:
            short[] r0 = m8348()
            r1 = 9
            int r2 = org.luckypray.dexkit.C1123.f433
            r2 = r2 ^ (-963(0xfffffffffffffc3d, float:NaN))
            r3 = 549(0x225, float:7.7E-43)
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2213(r0, r1, r2, r3)
            goto L12
        L34:
            short[] r0 = m8348()
            r1 = 13
            int r2 = androidx.vectordrawable.animated.C1102.f128
            r2 = r2 ^ 199(0xc7, float:2.79E-43)
            r3 = 3217(0xc91, float:4.508E-42)
            java.lang.String r0 = androidx.core.C1072.m957(r0, r1, r2, r3)
            goto L12
        L45:
            short[] r0 = m8348()
            r1 = 17
            int r2 = androidx.startup.C1100.f126
            r2 = r2 ^ (-274(0xfffffffffffffeee, float:NaN))
            r3 = 1682(0x692, float:2.357E-42)
            java.lang.String r0 = androidx.core.ktx.C1070.m788(r0, r1, r2, r3)
            goto L12
    }

    static /* synthetic */ void lambda$0(boolean r4, int r5, int r6, kevin.fun.hook.gesture.GestureRegionDialog.ActionCallback r7, android.app.Dialog r8, android.content.Context r9) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L1e;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r4 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            kevin.fun.hook.audio.C1115.m8014(r5, r6)
            r0 = 1740(0x6cc, float:2.438E-42)
        L15:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L1b;
                case 54: goto L21;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L15
        L1e:
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3769(r5, r6)
        L21:
            r0 = 1864(0x748, float:2.612E-42)
        L23:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L29;
                case 47384: goto L36;
                case 47417: goto L33;
                case 47483: goto L2f;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r7 == 0) goto L2f
            r0 = 48736(0xbe60, float:6.8294E-41)
            goto L23
        L2f:
            r0 = 48705(0xbe41, float:6.825E-41)
            goto L23
        L33:
            androidx.versionedparcelable.C1106.m3407(r7, r5, r6, r4)
        L36:
            androidx.customview.C1074.m1118(r8)
            short[] r0 = m8348()
            r1 = 21
            int r2 = kevin.fun.hook.C1120.f419
            r2 = r2 ^ (-456(0xfffffffffffffe38, float:NaN))
            r3 = 2738(0xab2, float:3.837E-42)
            java.lang.String r0 = androidx.customview.C1074.m1116(r0, r1, r2, r3)
            androidx.activity.C1063.m259(r9, r0)
            return
    }

    static /* synthetic */ void lambda$1(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$2(android.view.View r2) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r0 = "iKzxH9lA"
            java.lang.String r0 = androidx.startup.C1101.m2985(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L23:
            return
    }

    static /* synthetic */ void lambda$3(java.lang.Runnable r1, android.view.View r2) {
            r0 = 1616(0x650, float:2.264E-42)
        L2:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L10;
                case 239: goto L13;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r1 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3820(r1)
        L13:
            return
    }

    public static void show(android.content.Context r17, int r18, boolean r19, kevin.fun.hook.gesture.GestureRegionDialog.ActionCallback r20) {
            r1 = 1616(0x650, float:2.264E-42)
        L2:
            r1 = r1 ^ 1633(0x661, float:2.288E-42)
            switch(r1) {
                case 14: goto L8;
                case 49: goto Lb;
                case 204: goto L1bc;
                case 239: goto L10;
                default: goto L7;
            }
        L7:
            goto L2
        L8:
            r1 = 1678(0x68e, float:2.351E-42)
            goto L2
        Lb:
            if (r17 != 0) goto L8
            r1 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            android.app.Dialog r6 = new android.app.Dialog
            r1 = 16974484(0x1030294, float:2.406275E-38)
            int r2 = androidx.versionedparcelable.C1107.f133
            r1 = r1 ^ r2
            r0 = r17
            r6.<init>(r0, r1)
            r1 = 1
            androidx.lifecycle.runtime.C1092.m2297(r6, r1)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r0 = r17
            r15.<init>(r0)
            int r1 = androidx.drawerlayout.C1077.f103
            r1 = r1 ^ (-287(0xfffffffffffffee1, float:NaN))
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r1, r1)
            androidx.lifecycle.process.C1091.m2273(r15, r2)
            r2 = 1711276390(0x66000166, float:1.5112218E23)
            int r3 = androidx.vectordrawable.C1105.f131
            r2 = r2 ^ r3
            androidx.lifecycle.livedata.C1084.m1783(r15, r2)
            android.widget.LinearLayout r16 = new android.widget.LinearLayout
            r16.<init>(r17)
            r2 = 1
            r0 = r16
            androidx.customview.C1074.m1119(r0, r2)
            r2 = 1094713344(0x41400000, float:12.0)
            r0 = r17
            int r2 = m8344(r0, r2)
            r3 = 1090519040(0x41000000, float:8.0)
            r0 = r17
            int r3 = m8344(r0, r3)
            r4 = 1094713344(0x41400000, float:12.0)
            r0 = r17
            int r4 = m8344(r0, r4)
            r5 = 1098907648(0x41800000, float:16.0)
            r0 = r17
            int r5 = m8344(r0, r5)
            r0 = r16
            androidx.drawerlayout.C1077.m1314(r0, r2, r3, r4, r5)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r3 = kevin.fun.hook.audio.C1115.f404
            r3 = r3 ^ (-804(0xfffffffffffffcdc, float:NaN))
            r2.<init>(r1, r3)
            r3 = 80
            r2.gravity = r3
            r0 = r16
            androidx.vectordrawable.C1105.m3296(r0, r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r2, r1)
            r1 = 8
            float[] r1 = new float[r1]
            r3 = 0
            r4 = 1098907648(0x41800000, float:16.0)
            r0 = r17
            int r4 = m8344(r0, r4)
            float r4 = (float) r4
            r1[r3] = r4
            r3 = 1
            r4 = 1098907648(0x41800000, float:16.0)
            r0 = r17
            int r4 = m8344(r0, r4)
            float r4 = (float) r4
            r1[r3] = r4
            r3 = 2
            r4 = 1098907648(0x41800000, float:16.0)
            r0 = r17
            int r4 = m8344(r0, r4)
            float r4 = (float) r4
            r1[r3] = r4
            r3 = 3
            r4 = 1098907648(0x41800000, float:16.0)
            r0 = r17
            int r4 = m8344(r0, r4)
            float r4 = (float) r4
            r1[r3] = r4
            r3 = 4
            r4 = 0
            r1[r3] = r4
            r3 = 5
            r4 = 0
            r1[r3] = r4
            r3 = 6
            r4 = 0
            r1[r3] = r4
            r3 = 7
            r4 = 0
            r1[r3] = r4
            androidx.vectordrawable.C1103.m3187(r2, r1)
            r0 = r16
            androidx.activity.C1065.m397(r0, r2)
            r1 = 1740(0x6cc, float:2.438E-42)
        Ld5:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto Ldb;
                case 54: goto Le0;
                case 471: goto Lff;
                case 500: goto Le3;
                default: goto Lda;
            }
        Lda:
            goto Ld5
        Ldb:
            if (r19 == 0) goto Le0
            r1 = 1833(0x729, float:2.569E-42)
            goto Ld5
        Le0:
            r1 = 1802(0x70a, float:2.525E-42)
            goto Ld5
        Le3:
            short[] r1 = m8348()
            r2 = 24
            int r3 = androidx.customview.C1075.f101
            r3 = r3 ^ (-104(0xffffffffffffff98, float:NaN))
            r4 = 1754(0x6da, float:2.458E-42)
            java.lang.String r1 = kevin.fun.hook.webdav.C1118.m8509(r1, r2, r3, r4)
            r2 = 1864(0x748, float:2.612E-42)
        Lf5:
            r2 = r2 ^ 1881(0x759, float:2.636E-42)
            switch(r2) {
                case 17: goto Lfb;
                case 47483: goto L10f;
                default: goto Lfa;
            }
        Lfa:
            goto Lf5
        Lfb:
            r2 = 48674(0xbe22, float:6.8207E-41)
            goto Lf5
        Lff:
            short[] r1 = m8348()
            r2 = 26
            int r3 = androidx.interpolator.C1081.f107
            r3 = r3 ^ (-267(0xfffffffffffffef5, float:NaN))
            r4 = 369(0x171, float:5.17E-43)
            java.lang.String r1 = androidx.loader.C1094.m2495(r1, r2, r3, r4)
        L10f:
            java.lang.String r2 = m8343(r18)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r3, r1)
            short[] r3 = m8348()
            r4 = 28
            int r5 = androidx.activity.C1064.f90
            r5 = r5 ^ 489(0x1e9, float:6.85E-43)
            r7 = 1073(0x431, float:1.504E-42)
            java.lang.String r3 = androidx.activity.C1065.m410(r3, r4, r5, r7)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r3)
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1085.m1859(r1, r2)
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m8573(r1)
            r0 = r17
            android.widget.TextView r1 = m8342(r0, r1)
            r0 = r16
            androidx.activity.C1064.m372(r0, r1)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r0 = r17
            r8.<init>(r0)
            r1 = 1
            androidx.customview.C1074.m1119(r8, r1)
            r0 = r16
            androidx.activity.C1064.m372(r0, r8)
            r1 = 48767(0xbe7f, float:6.8337E-41)
        L156:
            r2 = 48784(0xbe90, float:6.8361E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 14: goto L15e;
                case 45: goto L194;
                case 76: goto L168;
                case 239: goto L162;
                default: goto L15d;
            }
        L15d:
            goto L156
        L15e:
            r1 = 48829(0xbebd, float:6.8424E-41)
            goto L156
        L162:
            if (r19 == 0) goto L15e
            r1 = 48860(0xbedc, float:6.8467E-41)
            goto L156
        L168:
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3794(r18)
            r2 = 48891(0xbefb, float:6.8511E-41)
        L16f:
            r3 = 48908(0xbf0c, float:6.8535E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 22: goto L177;
                case 503: goto L190;
                default: goto L176;
            }
        L176:
            goto L16f
        L177:
            r13 = r1
        L178:
            r1 = 0
            r14 = r1
        L17a:
            java.lang.String[] r1 = kevin.fun.hook.audio.C1114.m7887()
            int r2 = r1.length
            r1 = 49666(0xc202, float:6.9597E-41)
        L182:
            r3 = 49683(0xc213, float:6.9621E-41)
            r1 = r1 ^ r3
            switch(r1) {
                case 17: goto L18a;
                case 50: goto L19a;
                case 76: goto L19e;
                case 83: goto L1bd;
                default: goto L189;
            }
        L189:
            goto L182
        L18a:
            if (r14 < r2) goto L19a
            r1 = 49759(0xc25f, float:6.9727E-41)
            goto L182
        L190:
            r2 = 48922(0xbf1a, float:6.8554E-41)
            goto L16f
        L194:
            int r1 = androidx.lifecycle.process.C1091.m2265(r18)
            r13 = r1
            goto L178
        L19a:
            r1 = 49728(0xc240, float:6.9684E-41)
            goto L182
        L19e:
            androidx.annotation.experimental.C1067.m579(r15, r16)
            androidx.viewpager.C1108.m3545(r6, r15)
            kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda1 r1 = new kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda1
            r1.<init>(r6)
            androidx.emoji2.viewsintegration.C1079.m1483(r15, r1)
            kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda2 r1 = new kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda2
            r1.<init>()
            r0 = r16
            com.tencent.mmkv.C1109.m3617(r0, r1)
            kevin.fun.hook.audio.C1114.m7909(r6)
            m8346(r16)
        L1bc:
            return
        L1bd:
            int[] r1 = androidx.drawerlayout.C1077.m1327()
            r4 = r1[r14]
            java.lang.String[] r1 = kevin.fun.hook.audio.C1114.m7887()
            r10 = r1[r14]
            r1 = 49790(0xc27e, float:6.977E-41)
        L1cc:
            r2 = 49807(0xc28f, float:6.9794E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 18: goto L1d4;
                case 51: goto L1ee;
                case 84: goto L1de;
                case 241: goto L1d8;
                default: goto L1d3;
            }
        L1d3:
            goto L1cc
        L1d4:
            r1 = 49852(0xc2bc, float:6.9858E-41)
            goto L1cc
        L1d8:
            if (r4 != r13) goto L1d4
            r1 = 49883(0xc2db, float:6.9901E-41)
            goto L1cc
        L1de:
            r11 = 1
            r1 = 49914(0xc2fa, float:6.9944E-41)
        L1e2:
            r2 = 49931(0xc30b, float:6.9968E-41)
            r1 = r1 ^ r2
            switch(r1) {
                case 497: goto L1ea;
                case 1711: goto L1ef;
                default: goto L1e9;
            }
        L1e9:
            goto L1e2
        L1ea:
            r1 = 50596(0xc5a4, float:7.09E-41)
            goto L1e2
        L1ee:
            r11 = 0
        L1ef:
            kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda0 r1 = new kevin.fun.hook.gesture.GestureRegionDialog$$ExternalSyntheticLambda0
            r2 = r19
            r3 = r18
            r5 = r20
            r7 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r7 = r17
            r9 = r4
            r12 = r1
            m8347(r7, r8, r9, r10, r11, r12)
            int r1 = androidx.vectordrawable.C1103.f129
            r1 = r1 ^ 269(0x10d, float:3.77E-43)
            int r1 = r1 + r14
            r2 = 50689(0xc601, float:7.103E-41)
        L20b:
            r3 = 50706(0xc612, float:7.1054E-41)
            r2 = r2 ^ r3
            switch(r2) {
                case 19: goto L213;
                case 50: goto L217;
                default: goto L212;
            }
        L212:
            goto L20b
        L213:
            r2 = 50720(0xc620, float:7.1074E-41)
            goto L20b
        L217:
            r14 = r1
            goto L17a
    }

    private static void showToast(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            android.widget.Toast r0 = androidx.emoji2.viewsintegration.C1078.m1430(r1, r2, r0)
            androidx.viewpager.C1108.m3524(r0)
            return
    }

    /* JADX INFO: renamed from: ۟۠ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m8342(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.loader.C1094.m2490()
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
            android.widget.TextView r0 = buildTitle(r2, r3)
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

    /* JADX INFO: renamed from: ۟ۢۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m8343(int r2) {
            int r1 = androidx.core.C1072.m980()
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
            java.lang.String r0 = getRegionName(r2)
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

    /* JADX INFO: renamed from: ۣ۟ۡۥۦ, reason: not valid java name and contains not printable characters */
    public static int m8344(java.lang.Object r2, float r3) {
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            int r0 = m107dp(r2, r3)
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

    /* JADX INFO: renamed from: ۟ۦۡۥۧ, reason: not valid java name and contains not printable characters */
    public static void m8345(java.lang.Object r2, java.lang.Object r3, boolean r4) {
            int r1 = androidx.viewpager.C1108.m3542()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            applyRadioStyle(r2, r3, r4)
        L1b:
            int r1 = org.luckypray.dexkit.C1123.m10509()
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
            java.lang.String r0 = "eL2v42pW"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
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

    /* JADX INFO: renamed from: ۣۣۥۥ, reason: not valid java name and contains not printable characters */
    public static void m8346(java.lang.Object r2) {
            int r1 = androidx.core.C1073.m1015()
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
            android.view.View r2 = (android.view.View) r2
            animatePanel(r2)
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
            java.lang.String r0 = "j3ZziHJA0"
            java.lang.String r0 = androidx.emoji2.C1080.m1544(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
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

    /* JADX INFO: renamed from: ۤ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static void m8347(java.lang.Object r6, java.lang.Object r7, int r8, java.lang.Object r9, boolean r10, java.lang.Object r11) {
            int r1 = androidx.core.C1072.m980()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L49;
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
            r0 = r6
            android.content.Context r0 = (android.content.Context) r0
            r1 = r7
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            r5 = r11
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r2 = r8
            r4 = r10
            addRadioItem(r0, r1, r2, r3, r4, r5)
        L25:
            int r1 = androidx.documentfile.C1076.m1211()
            r0 = 1740(0x6cc, float:2.438E-42)
        L2b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L31;
                case 54: goto L36;
                case 471: goto L48;
                case 500: goto L39;
                default: goto L30;
            }
        L30:
            goto L2b
        L31:
            if (r1 > 0) goto L36
            r0 = 1833(0x729, float:2.569E-42)
            goto L2b
        L36:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2b
        L39:
            java.lang.String r0 = "UqSp8KzJc0ty2Dp"
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L48:
            return
        L49:
            r0 = 1864(0x748, float:2.612E-42)
        L4b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L51;
                case 47483: goto L25;
                default: goto L50;
            }
        L50:
            goto L4b
        L51:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L4b
    }

    /* JADX INFO: renamed from: ۥۣ۠ۢ, reason: contains not printable characters */
    public static short[] m8348() {
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
            short[] r0 = kevin.fun.hook.gesture.GestureRegionDialog.f412short
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
}
