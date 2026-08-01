package kevin.fun.hook.gesture;

/* JADX INFO: loaded from: classes.dex */
public class GestureMainDialog {
    private static final android.os.Handler MAIN_HANDLER = null;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f411short = null;

    public interface OnSettingChangedListener {
        static {
                return
        }

        void onSettingChanged();
    }

    static {
            r0 = 44
            short[] r0 = new short[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [21850, 18102, 20853, 19596, 22754, 19215, 22966, 17486, 21669, 22162, 1875, 1865, -24747, 26915, 2576, 2570, 26531, 22359, 26191, 22494, 20541, 28986, 26201, 22189, 26549, 22052, 25400, 21452, 21065, 22188, -30003, 32285, 30782, 29847, 21107, 20548, 28934, -29471, 31870, 28887, -28544, 26358, -31197, 22186} // fill-array
            kevin.fun.hook.gesture.GestureMainDialog.f411short = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = androidx.lifecycle.process.C1089.m2150()
            r0.<init>(r1)
            kevin.fun.hook.gesture.GestureMainDialog.MAIN_HANDLER = r0
            return
    }

    public GestureMainDialog() {
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
            java.lang.String r0 = "DX2MI9PJnZeLlHEeAiRuoCYO3w3v"
            java.lang.String r0 = androidx.core.ktx.C1071.m903(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    private static void animatePanel(android.view.View r6) {
            r0 = 1063675494(0x3f666666, float:0.9)
            r1 = 1065353216(0x3f800000, float:1.0)
            androidx.activity.C1062.m186(r6, r0)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3710(r6, r0)
            r0 = 0
            androidx.activity.C1062.m205(r6, r0)
            android.view.ViewPropertyAnimator r0 = androidx.startup.C1100.m2953(r6)
            android.view.ViewPropertyAnimator r0 = androidx.drawerlayout.C1077.m1332(r0, r1)
            android.view.ViewPropertyAnimator r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3750(r0, r1)
            android.view.ViewPropertyAnimator r0 = androidx.documentfile.C1076.m1256(r0, r1)
            r2 = -374(0xfffffffffffffe8a, double:NaN)
            int r1 = androidx.interpolator.C1083.f109
            long r4 = (long) r1
            long r2 = r2 ^ r4
            android.view.ViewPropertyAnimator r0 = androidx.loader.C1099.m2899(r0, r2)
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = androidx.emoji2.viewsintegration.C1078.m1396(r0, r1)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3720(r0)
            int r1 = androidx.core.C1073.m1015()
            r0 = 1616(0x650, float:2.264E-42)
        L3b:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L41;
                case 49: goto L44;
                case 204: goto L49;
                case 239: goto L58;
                default: goto L40;
            }
        L40:
            goto L3b
        L41:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L3b
        L44:
            if (r1 < 0) goto L41
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L3b
        L49:
            java.lang.String r0 = "L1cSMOKV6g608WaghpHYcnJSOC"
            java.lang.String r0 = androidx.loader.C1096.m2685(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L58:
            return
    }

    private static android.widget.TextView createActionButton(android.content.Context r13, java.lang.String r14) {
            r12 = 1090519040(0x41000000, float:8.0)
            r11 = 1086324736(0x40c00000, float:6.0)
            r1 = 0
            r6 = 0
            r10 = 0
            java.lang.String r4 = "ۧ۟ۧ"
            r0 = r1
            r2 = r1
            r3 = r1
            r5 = r6
            r7 = r6
            r8 = r6
            r9 = r6
        L10:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56358: goto L95;
                case 56390: goto L38;
                case 56505: goto Lc6;
                case 56567: goto Lb7;
                case 1746749: goto La4;
                case 1746782: goto L27;
                case 1746812: goto L9d;
                case 1746846: goto L1e;
                case 1746876: goto L8b;
                case 1747687: goto Lf0;
                case 1747719: goto L73;
                case 1748645: goto L10a;
                case 1748737: goto L59;
                case 1749572: goto L7a;
                case 1749607: goto Lfa;
                case 1749696: goto L4e;
                case 1749796: goto L102;
                case 1749821: goto Laf;
                case 1749827: goto L47;
                case 1749857: goto Ld8;
                case 1749858: goto Lbe;
                case 1751648: goto Ld0;
                case 1751775: goto L31;
                case 1752489: goto L112;
                case 1752517: goto L82;
                case 1753478: goto L6c;
                case 1753601: goto L62;
                case 1754383: goto L3e;
                case 1754593: goto Le0;
                case 1755494: goto Le8;
                default: goto L17;
            }
        L17:
            int r6 = androidx.loader.C1098.f124
            java.lang.String r1 = "۟ۡ۟"
            r4 = r1
            r9 = r6
            goto L10
        L1e:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            java.lang.String r4 = "ۡ۠ۤ"
            r3 = r1
            goto L10
        L27:
            r1 = 1082130432(0x40800000, float:4.0)
            int r5 = m8323(r13, r1)
            java.lang.String r1 = "ۨ۟"
            r4 = r1
            goto L10
        L31:
            r6 = r9 ^ (-447(0xfffffffffffffe41, float:NaN))
            java.lang.String r1 = "ۧۦ۠"
            r4 = r1
            r8 = r6
            goto L10
        L38:
            int r5 = androidx.activity.C1062.f88
            java.lang.String r1 = "۠ۡۨ"
            r4 = r1
            goto L10
        L3e:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r13)
            java.lang.String r1 = "ۢۦۨ"
            r4 = r1
            goto L10
        L47:
            int r6 = androidx.lifecycle.process.C1090.f116
            java.lang.String r1 = "ۣۤۨ"
            r4 = r1
            r9 = r6
            goto L10
        L4e:
            r1 = 1098907648(0x41800000, float:16.0)
            int r6 = m8323(r13, r1)
            java.lang.String r1 = "ۣ۟۠"
            r4 = r1
            r7 = r6
            goto L10
        L59:
            r1 = 1093664768(0x41300000, float:11.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            java.lang.String r1 = "۠ۨ۠"
            r4 = r1
            goto L10
        L62:
            r1 = 658413(0xa0bed, float:9.22633E-40)
            r6 = r1 ^ r9
            java.lang.String r1 = "ۢۧۢ"
            r4 = r1
            r8 = r6
            goto L10
        L6c:
            r6 = r8 ^ (-84)
            java.lang.String r1 = "ۦ۟"
            r4 = r1
            r7 = r6
            goto L10
        L73:
            r6 = r5 ^ 74
            java.lang.String r1 = "ۤۤ۠"
            r4 = r1
            r9 = r6
            goto L10
        L7a:
            int r5 = m8323(r13, r11)
            java.lang.String r1 = "ۡۧ"
            r4 = r1
            goto L10
        L82:
            int r6 = m8323(r13, r12)
            java.lang.String r1 = "۟ۥۢ"
            r4 = r1
            r9 = r6
            goto L10
        L8b:
            int r6 = m8323(r13, r11)
            java.lang.String r1 = "۠۠ۧ"
            r4 = r1
            r8 = r6
            goto L10
        L95:
            kevin.fun.hook.audio.C1117.m8126(r0, r9, r8, r7, r5)
            java.lang.String r1 = "ۣ۟ۤ"
            r4 = r1
            goto L10
        L9d:
            float r6 = (float) r7
            java.lang.String r1 = "ۨۤۢ"
            r4 = r1
            r10 = r6
            goto L10
        La4:
            r1 = 43914(0xab8a, float:6.1537E-41)
            r6 = r1 ^ r9
            java.lang.String r1 = "ۢۨۧ"
            r4 = r1
            r8 = r6
            goto L10
        Laf:
            androidx.lifecycle.livedata.C1085.m1879(r3, r8)
            java.lang.String r1 = "ۣۢۡ"
            r4 = r1
            goto L10
        Lb7:
            r2.topMargin = r5
            java.lang.String r1 = "ۢۨۨ"
            r4 = r1
            goto L10
        Lbe:
            androidx.lifecycle.livedata.C1085.m1822(r0, r2)
            java.lang.String r1 = "ۥ۠ۤ"
            r4 = r1
            goto L10
        Lc6:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r9, r7)
            java.lang.String r4 = "۟ۢۡ"
            r2 = r1
            goto L10
        Ld0:
            int r6 = kevin.fun.hook.audio.C1116.f405
            java.lang.String r1 = "ۦۡۡ"
            r4 = r1
            r8 = r6
            goto L10
        Ld8:
            kevin.fun.hook.webdav.C1118.m8517(r0, r8)
            java.lang.String r1 = "ۢۧۨ"
            r4 = r1
            goto L10
        Le0:
            androidx.documentfile.C1076.m1233(r0, r8)
            java.lang.String r1 = "ۥۡۡ"
            r4 = r1
            goto L10
        Le8:
            androidx.lifecycle.process.C1091.m2252(r3, r10)
            java.lang.String r1 = "ۢ۠ۥ"
            r4 = r1
            goto L10
        Lf0:
            int r6 = m8323(r13, r12)
            java.lang.String r1 = "ۢ۟ۡ"
            r4 = r1
            r7 = r6
            goto L10
        Lfa:
            androidx.core.C1073.m999(r0, r3)
            java.lang.String r1 = "ۢۨ"
            r4 = r1
            goto L10
        L102:
            androidx.lifecycle.process.C1087.m1946(r0, r14)
            java.lang.String r1 = "ۣۣۡ"
            r4 = r1
            goto L10
        L10a:
            int r6 = androidx.viewpager.C1108.f134
            java.lang.String r1 = "ۦۥ۠"
            r4 = r1
            r9 = r6
            goto L10
        L112:
            return r0
    }

    private static android.view.View createDivider(android.content.Context r8) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۤ۟ۥ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56575: goto L4f;
                case 1747648: goto L2e;
                case 1748831: goto L19;
                case 1748834: goto L20;
                case 1749762: goto L27;
                case 1750695: goto L59;
                case 1753574: goto L3e;
                case 1753664: goto L35;
                case 1755588: goto L45;
                default: goto L10;
            }
        L10:
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            java.lang.String r3 = "ۣۨۧ"
            r2 = r1
            goto L9
        L19:
            androidx.lifecycle.livedata.C1085.m1843(r2, r0)
            java.lang.String r1 = "ۡۦۧ"
            r3 = r1
            goto L9
        L20:
            int r5 = androidx.interpolator.C1081.f107
            java.lang.String r1 = "ۨۧ"
            r3 = r1
            r7 = r5
            goto L9
        L27:
            androidx.loader.C1099.m2849(r2, r6)
            java.lang.String r1 = "ۣۤۨ"
            r3 = r1
            goto L9
        L2e:
            r5 = r7 ^ 122(0x7a, float:1.71E-43)
            java.lang.String r1 = "ۦۧۡ"
            r3 = r1
            r6 = r5
            goto L9
        L35:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r4)
            java.lang.String r1 = "ۡۦۤ"
            r3 = r1
            goto L9
        L3e:
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1111.f137
            java.lang.String r1 = "۠۟۟"
            r3 = r1
            r7 = r5
            goto L9
        L45:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = m8323(r8, r1)
            java.lang.String r1 = "ۦۤۤ"
            r3 = r1
            goto L9
        L4f:
            r1 = 1118233(0x111019, float:1.566978E-39)
            r5 = r1 ^ r7
            java.lang.String r1 = "ۢۥۥ"
            r3 = r1
            r6 = r5
            goto L9
        L59:
            return r2
    }

    private static android.view.View createHorizontalDivider(android.content.Context r8) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "۠ۢۦ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56571: goto L38;
                case 1746904: goto L20;
                case 1747716: goto L48;
                case 1747748: goto L3f;
                case 1748741: goto L52;
                case 1749634: goto L27;
                case 1750598: goto L59;
                case 1752456: goto L17;
                case 1752611: goto L31;
                default: goto L10;
            }
        L10:
            androidx.lifecycle.livedata.C1085.m1843(r2, r0)
            java.lang.String r1 = "۟ۦ۟"
            r3 = r1
            goto L9
        L17:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r4)
            java.lang.String r1 = "ۥ۟ۤ"
            r3 = r1
            goto L9
        L20:
            int r5 = kevin.fun.hook.audio.C1116.f405
            java.lang.String r1 = "ۢۡۡ"
            r3 = r1
            r7 = r5
            goto L9
        L27:
            r1 = -1118532(0xffffffffffeeeebc, float:NaN)
            r5 = r1 ^ r7
            java.lang.String r1 = "ۣۨ"
            r3 = r1
            r6 = r5
            goto L9
        L31:
            int r5 = androidx.interpolator.C1081.f107
            java.lang.String r1 = "ۣۡۧ"
            r3 = r1
            r7 = r5
            goto L9
        L38:
            androidx.loader.C1099.m2849(r2, r6)
            java.lang.String r1 = "ۣۡۤ"
            r3 = r1
            goto L9
        L3f:
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            java.lang.String r3 = "۠ۡۥ"
            r2 = r1
            goto L9
        L48:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = m8323(r8, r1)
            java.lang.String r1 = "ۥۤۢ"
            r3 = r1
            goto L9
        L52:
            r5 = r7 ^ 264(0x108, float:3.7E-43)
            java.lang.String r1 = "ۥ۟ۢ"
            r3 = r1
            r6 = r5
            goto L9
        L59:
            return r2
    }

    private static android.view.View createQuadrantGrid(android.content.Context r11, android.app.Dialog r12, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r13) {
            r0 = 0
            r9 = 0
            r8 = 0
            r1 = 0
            r7 = 0
            r3 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            java.lang.String r6 = "ۦۨۥ"
        Lb:
            int r6 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r6) {
                case 56324: goto L25;
                case 1746818: goto La8;
                case 1746881: goto Lc8;
                case 1747652: goto L126;
                case 1747679: goto L4a;
                case 1748673: goto Ld4;
                case 1748678: goto L10e;
                case 1748772: goto L119;
                case 1748796: goto L62;
                case 1748862: goto L32;
                case 1749852: goto L55;
                case 1750534: goto Lfb;
                case 1753450: goto L7a;
                case 1753569: goto Le9;
                case 1753608: goto L8a;
                case 1753693: goto L13b;
                case 1753699: goto Lb5;
                case 1754378: goto L6e;
                case 1754441: goto L9c;
                case 1754623: goto L3d;
                default: goto L12;
            }
        L12:
            r1 = 1090519040(0x41000000, float:8.0)
            int r8 = m8323(r11, r1)
            r1 = 0
            r6 = 0
            androidx.drawerlayout.C1077.m1314(r0, r1, r9, r6, r8)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            java.lang.String r6 = "۟ۥۧ"
            goto Lb
        L25:
            androidx.vectordrawable.C1105.m3296(r1, r3)
            android.graphics.drawable.GradientDrawable r6 = m8314(r11)
            androidx.activity.C1065.m397(r1, r6)
            java.lang.String r6 = "ۡۡۡ"
            goto Lb
        L32:
            short[] r4 = m8318()
            int r9 = androidx.lifecycle.process.C1088.f114
            r8 = r9 ^ (-97)
            java.lang.String r6 = "ۣ۟ۢ"
            goto Lb
        L3d:
            androidx.activity.C1064.m372(r2, r5)
            android.view.View r5 = m8319(r11)
            androidx.activity.C1064.m372(r2, r5)
            java.lang.String r6 = "ۡۧۤ"
            goto Lb
        L4a:
            short[] r4 = m8318()
            int r7 = androidx.vectordrawable.C1105.f131
            r9 = r7 ^ 356(0x164, float:4.99E-43)
            java.lang.String r6 = "ۦۥۧ"
            goto Lb
        L55:
            androidx.activity.C1064.m372(r1, r2)
            android.view.View r5 = m8326(r11)
            androidx.activity.C1064.m372(r1, r5)
            java.lang.String r6 = "ۣ۠۟"
            goto Lb
        L62:
            androidx.activity.C1064.m372(r2, r5)
            androidx.activity.C1064.m372(r1, r2)
            androidx.activity.C1064.m372(r0, r1)
            java.lang.String r6 = "ۦۨ۟"
            goto Lb
        L6e:
            int r9 = androidx.core.ktx.C1071.f97
            r7 = r9 ^ (-899(0xfffffffffffffc7d, float:NaN))
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r7, r8)
            java.lang.String r6 = "۠ۤ"
            goto Lb
        L7a:
            r7 = r8 ^ 193(0xc1, float:2.7E-43)
            r5 = 6
            r6 = 2629(0xa45, float:3.684E-42)
            java.lang.String r5 = androidx.activity.C1066.m468(r4, r5, r7, r6)
            android.view.View r5 = m8327(r11, r9, r5, r12, r13)
            java.lang.String r6 = "ۡۥ۠"
            goto Lb
        L8a:
            r5 = 4
            r6 = 1284(0x504, float:1.799E-42)
            java.lang.String r5 = androidx.vectordrawable.C1105.m3247(r4, r5, r9, r6)
            android.view.View r5 = m8327(r11, r8, r5, r12, r13)
            androidx.activity.C1064.m372(r2, r5)
            java.lang.String r6 = "ۣ۟ۦ"
            goto Lb
        L9c:
            r9 = r7 ^ (-485(0xfffffffffffffe1b, float:NaN))
            short[] r4 = m8318()
            int r8 = androidx.vectordrawable.animated.C1102.f128
            java.lang.String r6 = "ۦ۠ۤ"
            goto Lb
        La8:
            android.view.View r5 = m8319(r11)
            androidx.activity.C1064.m372(r2, r5)
            int r7 = com.tencent.mmkv.C1109.f135
            java.lang.String r6 = "ۣۧۡ"
            goto Lb
        Lb5:
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r11)
            r6 = 1
            androidx.customview.C1074.m1119(r0, r6)
            r6 = 1090519040(0x41000000, float:8.0)
            int r9 = m8323(r11, r6)
            java.lang.String r6 = "ۣۢ۟"
            goto Lb
        Lc8:
            r6 = 1
            androidx.customview.C1074.m1119(r1, r6)
            int r9 = androidx.vectordrawable.C1105.f131
            r8 = r9 ^ (-360(0xfffffffffffffe98, float:NaN))
            java.lang.String r6 = "ۧ۟ۢ"
            goto Lb
        Ld4:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r11)
            r3 = 0
            androidx.customview.C1074.m1119(r2, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r7, r6, r10)
            java.lang.String r6 = "ۡۤۧ"
            goto Lb
        Le9:
            r8 = r9 ^ 241(0xf1, float:3.38E-43)
            r5 = 0
            r6 = 0
            r10 = 2236(0x8bc, float:3.133E-42)
            java.lang.String r6 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3796(r4, r6, r8, r10)
            android.view.View r5 = m8327(r11, r5, r6, r12, r13)
            java.lang.String r6 = "ۧۧ۟"
            goto Lb
        Lfb:
            r5 = 1
            r6 = 2
            r10 = 646(0x286, float:9.05E-43)
            java.lang.String r6 = androidx.interpolator.C1082.m1694(r4, r6, r8, r10)
            android.view.View r5 = m8327(r11, r5, r6, r12, r13)
            androidx.activity.C1064.m372(r2, r5)
            java.lang.String r6 = "ۢۨۢ"
            goto Lb
        L10e:
            androidx.vectordrawable.C1105.m3296(r2, r3)
            int r9 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r8 = r9 ^ (-936(0xfffffffffffffc58, float:NaN))
            java.lang.String r6 = "۠۠۟"
            goto Lb
        L119:
            androidx.vectordrawable.C1105.m3296(r2, r3)
            short[] r4 = m8318()
            int r9 = androidx.customview.C1074.f100
            java.lang.String r6 = "ۦۤ۟"
            goto Lb
        L126:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r11)
            r3 = 0
            androidx.customview.C1074.m1119(r2, r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r7, r6, r10)
            java.lang.String r6 = "ۡۡۦ"
            goto Lb
        L13b:
            return r0
    }

    private static android.view.View createRegionCell(android.content.Context r20, int r21, java.lang.String r22, android.app.Dialog r23, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r24) {
            r6 = 0
            r16 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r14 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r11 = 0
            r10 = 0
            r5 = 0
            java.lang.String r17 = "ۥ۟ۡ"
        Lf:
            int r17 = kevin.fun.hook.audio.C1114.m7934(r17)
            switch(r17) {
                case 56324: goto L29;
                case 56416: goto Lc6;
                case 1746727: goto L16f;
                case 1746788: goto L17d;
                case 1747682: goto L119;
                case 1747749: goto L18c;
                case 1748865: goto L19a;
                case 1749670: goto L154;
                case 1749758: goto Ld0;
                case 1750813: goto L33;
                case 1751593: goto L101;
                case 1751654: goto L14a;
                case 1752455: goto L9b;
                case 1752489: goto Lf7;
                case 1752523: goto L55;
                case 1753415: goto Lad;
                case 1754378: goto L3c;
                case 1754505: goto L73;
                case 1754628: goto Lbe;
                case 1754662: goto L136;
                case 1755337: goto L80;
                case 1755341: goto L8c;
                case 1755367: goto L164;
                case 1755434: goto Le0;
                case 1755528: goto L60;
                case 1755553: goto L129;
                default: goto L16;
            }
        L16:
            r14 = 1090519040(0x41000000, float:8.0)
            r0 = r20
            int r15 = m8323(r0, r14)
            r14 = 1094713344(0x41400000, float:12.0)
            r0 = r20
            int r14 = m8323(r0, r14)
            java.lang.String r17 = "ۢۥۡ"
            goto Lf
        L29:
            int r16 = androidx.interpolator.C1081.f107
            r13 = 10066065(0x999891, float:1.4105561E-38)
            r13 = r13 ^ r16
            java.lang.String r17 = "ۥ۠ۤ"
            goto Lf
        L33:
            androidx.lifecycle.livedata.C1086.m1916(r9, r5)
            androidx.activity.C1064.m372(r6, r9)
            java.lang.String r17 = "ۡۧۧ"
            goto Lf
        L3c:
            android.widget.LinearLayout$LayoutParams r17 = new android.widget.LinearLayout$LayoutParams
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r0 = r17
            r1 = r18
            r2 = r16
            r3 = r19
            r0.<init>(r1, r2, r3)
            r0 = r17
            androidx.vectordrawable.C1105.m3296(r6, r0)
            java.lang.String r17 = "ۧۨۧ"
            goto Lf
        L55:
            int r12 = androidx.lifecycle.process.C1091.m2265(r21)
            java.lang.String r22 = androidx.customview.C1074.m1111(r12)
            java.lang.String r17 = "ۨ۟۠"
            goto Lf
        L60:
            r0 = r14 ^ 443(0x1bb, float:6.21E-43)
            r16 = r0
            r11 = 8
            r17 = 1897(0x769, float:2.658E-42)
            r0 = r16
            r1 = r17
            java.lang.String r11 = androidx.loader.C1097.m2734(r7, r11, r0, r1)
            java.lang.String r17 = "ۣۧۥ"
            goto Lf
        L73:
            java.lang.StringBuilder r10 = androidx.lifecycle.livedata.C1085.m1859(r8, r11)
            r0 = r22
            java.lang.StringBuilder r8 = androidx.lifecycle.livedata.C1085.m1859(r10, r0)
            java.lang.String r17 = "۠ۢۧ"
            goto Lf
        L80:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            short[] r7 = m8318()
            java.lang.String r17 = "ۧۧۤ"
            goto Lf
        L8c:
            r0 = r20
            android.view.View r17 = m8329(r0, r13)
            r0 = r17
            androidx.activity.C1064.m372(r6, r0)
            java.lang.String r17 = "ۥۡۧ"
            goto Lf
        L9b:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r0 = r20
            r6.<init>(r0)
            r17 = 1
            r0 = r17
            androidx.customview.C1074.m1119(r6, r0)
            java.lang.String r17 = "ۣۣ"
            goto Lf
        Lad:
            androidx.emoji2.C1080.m1542(r6, r12)
            r16 = 1124859904(0x430c0000, float:140.0)
            r0 = r20
            r1 = r16
            int r16 = m8323(r0, r1)
            java.lang.String r17 = "ۧ۟ۢ"
            goto Lf
        Lbe:
            int r15 = androidx.lifecycle.livedata.C1086.f112
            r14 = r15 ^ 957(0x3bd, float:1.341E-42)
            java.lang.String r17 = "ۢۢۦ"
            goto Lf
        Lc6:
            int r16 = androidx.core.C1072.f98
            r0 = r16
            r12 = r0 ^ (-527(0xfffffffffffffdf1, float:NaN))
            java.lang.String r17 = "ۦ۟۠"
            goto Lf
        Ld0:
            r0 = r16
            androidx.drawerlayout.C1077.m1314(r6, r0, r13, r15, r14)
            android.widget.TextView r9 = new android.widget.TextView
            r0 = r20
            r9.<init>(r0)
            java.lang.String r17 = "۠۠ۢ"
            goto Lf
        Le0:
            r0 = r20
            android.widget.TextView r9 = m8325(r0, r11)
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda4 r5 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda4
            r0 = r23
            r1 = r20
            r2 = r21
            r3 = r24
            r5.<init>(r0, r1, r2, r3)
            java.lang.String r17 = "ۣۨۢ"
            goto Lf
        Lf7:
            kevin.fun.hook.webdav.C1118.m8517(r9, r13)
            androidx.documentfile.C1076.m1233(r9, r12)
            java.lang.String r17 = "ۨ۠۟"
            goto Lf
        L101:
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda3 r17 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda3
            r0 = r17
            r1 = r23
            r2 = r20
            r3 = r21
            r4 = r24
            r0.<init>(r1, r2, r3, r4)
            r0 = r17
            androidx.lifecycle.livedata.C1086.m1916(r9, r0)
            java.lang.String r17 = "۟ۢۧ"
            goto Lf
        L119:
            r0 = r22
            androidx.lifecycle.process.C1087.m1946(r9, r0)
            r17 = 1096810496(0x41600000, float:14.0)
            r0 = r17
            androidx.vectordrawable.animated.C1102.m3105(r9, r0)
            java.lang.String r17 = "۠ۤ"
            goto Lf
        L129:
            java.lang.String r22 = androidx.customview.C1074.m1111(r15)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r17 = "ۤۤۦ"
            goto Lf
        L136:
            r13 = 1090519040(0x41000000, float:8.0)
            r0 = r20
            int r16 = m8323(r0, r13)
            r13 = 1094713344(0x41400000, float:12.0)
            r0 = r20
            int r13 = m8323(r0, r13)
            java.lang.String r17 = "۟ۦ۟"
            goto Lf
        L14a:
            short[] r7 = m8318()
            int r14 = androidx.core.C1073.f99
            java.lang.String r17 = "ۨۥۥ"
            goto Lf
        L154:
            r8 = 12
            r11 = 2602(0xa2a, float:3.646E-42)
            java.lang.String r11 = androidx.vectordrawable.animated.C1102.m3116(r7, r8, r14, r11)
            java.lang.StringBuilder r8 = androidx.lifecycle.livedata.C1085.m1859(r10, r11)
            java.lang.String r17 = "۟۠ۨ"
            goto Lf
        L164:
            androidx.activity.C1064.m372(r6, r9)
            int r15 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3794(r21)
            java.lang.String r17 = "ۨۦ۟"
            goto Lf
        L16f:
            r0 = r22
            java.lang.StringBuilder r10 = androidx.lifecycle.livedata.C1085.m1859(r8, r0)
            java.lang.String r11 = kevin.fun.hook.webdav.C1119.m8573(r10)
            java.lang.String r17 = "ۨۢۤ"
            goto Lf
        L17d:
            androidx.activity.C1064.m372(r6, r9)
            r13 = 1090519040(0x41000000, float:8.0)
            r0 = r20
            int r13 = m8323(r0, r13)
            java.lang.String r17 = "ۨ۟ۤ"
            goto Lf
        L18c:
            java.lang.String r11 = kevin.fun.hook.webdav.C1119.m8573(r8)
            r0 = r20
            android.widget.TextView r9 = m8325(r0, r11)
            java.lang.String r17 = "ۤۢۧ"
            goto Lf
        L19a:
            return r6
    }

    private static android.widget.TextView createRegionTitle(android.content.Context r6, java.lang.String r7) {
            r5 = 1090519040(0x41000000, float:8.0)
            r3 = 0
            r0 = 0
            java.lang.String r1 = "ۢۢۥ"
            r2 = r3
            r4 = r3
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1746973: goto L30;
                case 1747838: goto L24;
                case 1748829: goto L2a;
                case 1748864: goto L38;
                case 1749669: goto L44;
                case 1750537: goto L4c;
                case 1752678: goto L3f;
                case 1753449: goto L1e;
                case 1753451: goto L17;
                default: goto Lf;
            }
        Lf:
            r1 = -7828726(0xffffffffff888b0a, float:NaN)
            r4 = r1 ^ r2
            java.lang.String r1 = "۠ۥۣ"
            goto L8
        L17:
            int r4 = m8323(r6, r5)
            java.lang.String r1 = "ۦۣ۠"
            goto L8
        L1e:
            kevin.fun.hook.audio.C1117.m8126(r0, r3, r2, r3, r4)
            java.lang.String r1 = "ۣ۟ۥ"
            goto L8
        L24:
            kevin.fun.hook.webdav.C1118.m8517(r0, r4)
            java.lang.String r1 = "ۡۧۦ"
            goto L8
        L2a:
            androidx.lifecycle.process.C1087.m1946(r0, r7)
            java.lang.String r1 = "۟ۨۦ"
            goto L8
        L30:
            r1 = 1095761920(0x41500000, float:13.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r1)
            java.lang.String r1 = "ۥۦۧ"
            goto L8
        L38:
            int r2 = m8323(r6, r5)
            java.lang.String r1 = "ۦ۠ۥ"
            goto L8
        L3f:
            int r2 = androidx.core.ktx.C1071.f97
            java.lang.String r1 = "ۧۤۧ"
            goto L8
        L44:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r6)
            java.lang.String r1 = "ۡۦۢ"
            goto L8
        L4c:
            return r0
    }

    private static android.view.View createSpacer(android.content.Context r7, int r8) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۧۢۡ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1748734: goto L18;
                case 1749793: goto L35;
                case 1752645: goto L2f;
                case 1753667: goto L1f;
                case 1754470: goto L26;
                default: goto Lf;
            }
        Lf:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r8)
            java.lang.String r1 = "ۣۡ۠"
            r3 = r1
            goto L8
        L18:
            androidx.lifecycle.livedata.C1085.m1843(r2, r0)
            java.lang.String r1 = "ۢۦۥ"
            r3 = r1
            goto L8
        L1f:
            r5 = r4 ^ (-359(0xfffffffffffffe99, float:NaN))
            java.lang.String r1 = "ۡ۠ۧ"
            r3 = r1
            r6 = r5
            goto L8
        L26:
            android.view.View r1 = new android.view.View
            r1.<init>(r7)
            java.lang.String r3 = "ۥۥۥ"
            r2 = r1
            goto L8
        L2f:
            int r4 = androidx.vectordrawable.C1105.f131
            java.lang.String r1 = "ۦۧۤ"
            r3 = r1
            goto L8
        L35:
            return r2
    }

    private static android.graphics.drawable.GradientDrawable createSquareBg(android.content.Context r7) {
            r3 = 0
            r0 = 0
            r6 = 0
            java.lang.String r1 = "ۡۥۨ"
            r2 = r3
            r4 = r3
            r5 = r3
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1747807: goto L22;
                case 1747931: goto L17;
                case 1748680: goto L1d;
                case 1748804: goto L4e;
                case 1748865: goto L38;
                case 1749824: goto L32;
                case 1750630: goto L3e;
                case 1753635: goto L5f;
                case 1754437: goto L56;
                case 1755373: goto L2c;
                case 1755495: goto L48;
                default: goto Lf;
            }
        Lf:
            r1 = -1118564(0xffffffffffeeee9c, float:NaN)
            r2 = r1 ^ r5
            java.lang.String r1 = "ۡۧۧ"
            goto L8
        L17:
            androidx.lifecycle.livedata.C1085.m1879(r0, r4)
            java.lang.String r1 = "ۣۢۥ"
            goto L8
        L1d:
            float r3 = (float) r5
            java.lang.String r1 = "ۣۨۤ"
            r6 = r3
            goto L8
        L22:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = m8323(r7, r1)
            java.lang.String r1 = "ۨ۠ۥ"
            r4 = r3
            goto L8
        L2c:
            int r3 = androidx.loader.C1097.f123
            java.lang.String r1 = "۠ۧۡ"
            r5 = r3
            goto L8
        L32:
            int r3 = org.luckypray.dexkit.C1123.f433
            java.lang.String r1 = "ۧۡ۟"
            r5 = r3
            goto L8
        L38:
            androidx.annotation.experimental.C1067.m572(r0, r4, r2)
            java.lang.String r1 = "ۦۦۣ"
            goto L8
        L3e:
            r1 = 1094713344(0x41400000, float:12.0)
            int r3 = m8323(r7, r1)
            java.lang.String r1 = "ۡۡۨ"
            r5 = r3
            goto L8
        L48:
            androidx.lifecycle.process.C1091.m2252(r0, r6)
            java.lang.String r1 = "ۣ۠ۤ"
            goto L8
        L4e:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "ۢۧۥ"
            goto L8
        L56:
            r1 = 329411(0x506c3, float:4.61603E-40)
            r3 = r1 ^ r5
            java.lang.String r1 = "ۣ۠ۨ"
            r4 = r3
            goto L8
        L5f:
            return r0
    }

    private static android.widget.LinearLayout createSwitchItem(android.content.Context r11, java.lang.String r12, boolean r13, java.util.function.Consumer<java.lang.Boolean> r14) {
            r1 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r5 = 0
            r0 = 0
            r3 = 0
            r2 = 0
            r4 = 0
            java.lang.String r6 = "ۨۦۢ"
        Lc:
            int r6 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r6) {
                case 56543: goto Lde;
                case 56545: goto L19;
                case 1746844: goto L1c;
                case 1747716: goto Lb8;
                case 1748829: goto L27;
                case 1749573: goto Ld3;
                case 1749701: goto Lc3;
                case 1750660: goto Lb0;
                case 1750688: goto L53;
                case 1751494: goto L8c;
                case 1751616: goto L5f;
                case 1751718: goto L7e;
                case 1751779: goto L47;
                case 1752517: goto Le9;
                case 1752674: goto L3c;
                case 1752736: goto L6b;
                case 1753417: goto L31;
                case 1753453: goto Lf2;
                case 1753478: goto L72;
                case 1754631: goto L98;
                case 1755430: goto L77;
                case 1755556: goto La3;
                default: goto L13;
            }
        L13:
            androidx.loader.C1099.m2881(r2, r4)
            java.lang.String r6 = "ۧۨ"
            goto Lc
        L19:
            java.lang.String r6 = "ۤۦۨ"
            goto Lc
        L1c:
            android.widget.Switch r2 = new android.widget.Switch
            r2.<init>(r11)
            androidx.lifecycle.process.C1089.m2130(r2, r13)
            java.lang.String r6 = "ۥۣۨ"
            goto Lc
        L27:
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.weight = r6
            org.luckypray.dexkit.C1124.m10544(r1, r0, r5)
            java.lang.String r6 = "۟ۤۡ"
            goto Lc
        L31:
            androidx.lifecycle.process.C1087.m1946(r0, r12)
            r6 = 1097859072(0x41700000, float:15.0)
            androidx.vectordrawable.animated.C1102.m3105(r0, r6)
            java.lang.String r6 = "ۢ۟ۢ"
            goto Lc
        L3c:
            androidx.vectordrawable.C1105.m3296(r1, r5)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r11)
            java.lang.String r6 = "ۦ۟ۢ"
            goto Lc
        L47:
            androidx.emoji2.C1080.m1542(r1, r9)
            r6 = 1094713344(0x41400000, float:12.0)
            int r10 = m8323(r11, r6)
            java.lang.String r6 = "ۣۢۦ"
            goto Lc
        L53:
            r6 = 1092616192(0x41200000, float:10.0)
            int r7 = m8323(r11, r6)
            androidx.drawerlayout.C1077.m1314(r1, r10, r9, r8, r7)
            java.lang.String r6 = "ۦۡۡ"
            goto Lc
        L5f:
            androidx.customview.C1074.m47(r0, r3)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 0
            r5.<init>(r6, r7)
            java.lang.String r6 = "ۡۦۢ"
            goto Lc
        L6b:
            android.graphics.drawable.Drawable r4 = m8324(r11)
            java.lang.String r6 = "ۧۧۧ"
            goto Lc
        L72:
            int r10 = androidx.loader.C1097.f123
            java.lang.String r6 = "ۨۢ۠"
            goto Lc
        L77:
            r9 = r10 ^ (-115(0xffffffffffffff8d, float:NaN))
            int r8 = androidx.emoji2.C1080.f106
            java.lang.String r6 = "۠ۡۥ"
            goto Lc
        L7e:
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r7, r7)
            r6 = 1092616192(0x41200000, float:10.0)
            int r9 = m8323(r11, r6)
            java.lang.String r6 = "ۥۡۡ"
            goto Lc
        L8c:
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda0 r6 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda0
            r6.<init>(r14)
            androidx.core.C1073.m989(r2, r6)
            java.lang.String r6 = "ۦ۠ۧ"
            goto Lc
        L98:
            androidx.lifecycle.livedata.C1085.m1853(r2, r4)
            android.graphics.drawable.Drawable r4 = m8317(r11)
            java.lang.String r6 = "۟ۦۡ"
            goto Lc
        La3:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r11)
            r6 = 0
            androidx.customview.C1074.m1119(r1, r6)
            java.lang.String r6 = "ۣۣۤ"
            goto Lc
        Lb0:
            int r10 = dev.rikka.ndk.thirdparty.libcxx.C1110.f136
            r9 = r10 ^ 669(0x29d, float:9.37E-43)
            java.lang.String r6 = "ۤۨۧ"
            goto Lc
        Lb8:
            r7 = r8 ^ (-377(0xfffffffffffffe87, float:NaN))
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r9, r7)
            java.lang.String r6 = "ۥۦۣ"
            goto Lc
        Lc3:
            r6 = 1092616192(0x41200000, float:10.0)
            int r9 = m8323(r11, r6)
            r6 = 1094713344(0x41400000, float:12.0)
            int r8 = m8323(r11, r6)
            java.lang.String r6 = "ۣۤۡ"
            goto Lc
        Ld3:
            int r10 = org.luckypray.dexkit.C1124.f434
            r6 = -13422176(0xffffffffff3331a0, float:-2.3818948E38)
            r8 = r6 ^ r10
            java.lang.String r6 = "ۧۦ"
            goto Lc
        Lde:
            kevin.fun.hook.webdav.C1118.m8517(r0, r8)
            android.graphics.Typeface r3 = androidx.startup.C1101.m3047()
            java.lang.String r6 = "ۣۤ۟"
            goto Lc
        Le9:
            r5.leftMargin = r9
            org.luckypray.dexkit.C1124.m10544(r1, r2, r5)
            java.lang.String r6 = "ۤ۟ۡ"
            goto Lc
        Lf2:
            return r1
    }

    private static android.graphics.drawable.Drawable createSwitchThumb(android.content.Context r7) {
            r6 = 1099956224(0x41900000, float:18.0)
            r3 = 0
            r0 = 0
            java.lang.String r1 = "ۤۨ۠"
            r2 = r3
            r4 = r3
            r5 = r3
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 56297: goto L21;
                case 1747776: goto L45;
                case 1749856: goto L3f;
                case 1750565: goto L5e;
                case 1750658: goto L37;
                case 1750689: goto L4b;
                case 1751709: goto L19;
                case 1751772: goto L11;
                case 1752645: goto L51;
                case 1753608: goto L27;
                case 1753637: goto L58;
                case 1755561: goto L2d;
                default: goto L10;
            }
        L10:
            return r0
        L11:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "ۥۥۥ"
            goto L9
        L19:
            int r3 = m8323(r7, r6)
            java.lang.String r1 = "ۣۣۢ"
            r5 = r3
            goto L9
        L21:
            int r3 = androidx.loader.C1098.f124
            java.lang.String r1 = "ۦۦۥ"
            r5 = r3
            goto L9
        L27:
            androidx.lifecycle.livedata.C1085.m1879(r0, r4)
            java.lang.String r1 = "ۨۦۧ"
            goto L9
        L2d:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = m8323(r7, r1)
            java.lang.String r1 = "ۢۨۦ"
            r5 = r3
            goto L9
        L37:
            int r3 = m8323(r7, r6)
            java.lang.String r1 = "ۣۤۢ"
            r4 = r3
            goto L9
        L3f:
            int r3 = androidx.vectordrawable.C1104.f130
            java.lang.String r1 = "ۣ۠ۢ"
            r4 = r3
            goto L9
        L45:
            androidx.annotation.experimental.C1067.m572(r0, r5, r2)
            java.lang.String r1 = "ۡۦ۟"
            goto L9
        L4b:
            kevin.fun.hook.audio.C1115.m7948(r0, r5, r4)
            java.lang.String r1 = "۟ۨ"
            goto L9
        L51:
            r1 = 1
            androidx.lifecycle.viewmodel.C1093.m2423(r0, r1)
            java.lang.String r1 = "ۤۦ۟"
            goto L9
        L58:
            r3 = r5 ^ 802(0x322, float:1.124E-42)
            java.lang.String r1 = "ۦۥۧ"
            r4 = r3
            goto L9
        L5e:
            r1 = -2039117(0xffffffffffe0e2b3, float:NaN)
            r2 = r1 ^ r4
            java.lang.String r1 = "ۣۣ۠"
            goto L9
    }

    private static android.graphics.drawable.Drawable createSwitchTrack(android.content.Context r11) {
            r10 = 1092616192(0x41200000, float:10.0)
            r1 = 0
            r7 = 0
            r9 = 0
            java.lang.String r5 = "ۨۨ۟"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r7
            r8 = r7
        Ld:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56481: goto L7e;
                case 1746816: goto L57;
                case 1747688: goto L8d;
                case 1747711: goto L85;
                case 1747743: goto L2c;
                case 1747747: goto La4;
                case 1747777: goto L5d;
                case 1747834: goto L74;
                case 1747935: goto L24;
                case 1748618: goto L35;
                case 1748772: goto Lc6;
                case 1748860: goto Le7;
                case 1748864: goto L50;
                case 1749636: goto L6b;
                case 1749669: goto Lcd;
                case 1749700: goto L66;
                case 1749796: goto Lb3;
                case 1750564: goto Lbe;
                case 1751648: goto Lac;
                case 1751717: goto Ld7;
                case 1753513: goto L94;
                case 1753544: goto L42;
                case 1753634: goto L9c;
                case 1754379: goto L3c;
                case 1754446: goto L49;
                case 1754533: goto Ldd;
                case 1755615: goto L1b;
                default: goto L14;
            }
        L14:
            androidx.lifecycle.livedata.C1085.m1879(r0, r8)
            java.lang.String r1 = "ۦۦۢ"
            r5 = r1
            goto Ld
        L1b:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            java.lang.String r5 = "ۧۡۨ"
            r2 = r1
            goto Ld
        L24:
            int r8 = m8323(r11, r10)
            java.lang.String r1 = "ۣۢۥ"
            r5 = r1
            goto Ld
        L2c:
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            java.lang.String r5 = "ۣۢۡ"
            r3 = r1
            goto Ld
        L35:
            androidx.lifecycle.livedata.C1085.m1879(r2, r6)
            java.lang.String r1 = "۠ۢۡ"
            r5 = r1
            goto Ld
        L3c:
            int[] r1 = new int[r7]
            java.lang.String r5 = "ۦۣۥ"
            r4 = r1
            goto Ld
        L42:
            androidx.drawerlayout.C1077.m1349(r3, r4, r2)
            java.lang.String r1 = "ۡۧۢ"
            r5 = r1
            goto Ld
        L49:
            androidx.lifecycle.viewmodel.C1093.m2423(r2, r7)
            java.lang.String r1 = "۠ۨۧ"
            r5 = r1
            goto Ld
        L50:
            kevin.fun.hook.audio.C1115.m7948(r2, r8, r6)
            java.lang.String r1 = "ۣ۟ۤ"
            r5 = r1
            goto Ld
        L57:
            int r8 = androidx.drawerlayout.C1077.f103
            java.lang.String r1 = "ۢۢۥ"
            r5 = r1
            goto Ld
        L5d:
            r1 = -43942(0xffffffffffff545a, float:NaN)
            r8 = r1 ^ r6
            java.lang.String r1 = "ۣ۟ۤ"
            r5 = r1
            goto Ld
        L66:
            float r9 = (float) r8
            java.lang.String r1 = "ۦۢۥ"
            r5 = r1
            goto Ld
        L6b:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.String r1 = "ۣ۠ۡ"
            r5 = r1
            goto Ld
        L74:
            r1 = 1101004800(0x41a00000, float:20.0)
            int r6 = m8323(r11, r1)
            java.lang.String r1 = "ۡۧۦ"
            r5 = r1
            goto Ld
        L7e:
            androidx.lifecycle.process.C1091.m2252(r0, r9)
            java.lang.String r1 = "ۡۤۧ"
            r5 = r1
            goto Ld
        L85:
            int r8 = m8323(r11, r10)
            java.lang.String r1 = "ۤۦۧ"
            r5 = r1
            goto Ld
        L8d:
            int r6 = com.tencent.mmkv.C1109.f135
            java.lang.String r1 = "ۤۤ۠"
            r5 = r1
            goto Ld
        L94:
            androidx.lifecycle.process.C1091.m2252(r2, r9)
            java.lang.String r1 = "ۢۦۨ"
            r5 = r1
            goto Ld
        L9c:
            r1 = 1
            int[] r1 = new int[r1]
            java.lang.String r5 = "۠۠ۨ"
            r4 = r1
            goto Ld
        La4:
            androidx.drawerlayout.C1077.m1349(r3, r4, r0)
            java.lang.String r1 = "ۣۧ۟"
            r5 = r1
            goto Ld
        Lac:
            r8 = r6 ^ (-488(0xfffffffffffffe18, float:NaN))
            java.lang.String r1 = "ۧۤۢ"
            r5 = r1
            goto Ld
        Lb3:
            r1 = 1108344832(0x42100000, float:36.0)
            int r8 = m8323(r11, r1)
            java.lang.String r1 = "۠ۥ۟"
            r5 = r1
            goto Ld
        Lbe:
            androidx.lifecycle.viewmodel.C1093.m2423(r0, r7)
            java.lang.String r1 = "۠ۡ۠"
            r5 = r1
            goto Ld
        Lc6:
            int r6 = androidx.lifecycle.livedata.C1085.f111
            java.lang.String r1 = "ۣ۠ۤ"
            r5 = r1
            goto Ld
        Lcd:
            r1 = -2039298(0xffffffffffe0e1fe, float:NaN)
            r6 = r1 ^ r8
            java.lang.String r1 = "ۡ۟ۨ"
            r5 = r1
            goto Ld
        Ld7:
            float r9 = (float) r8
            java.lang.String r1 = "ۥۦ"
            r5 = r1
            goto Ld
        Ldd:
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            r4[r8] = r1
            java.lang.String r1 = "۠ۢۥ"
            r5 = r1
            goto Ld
        Le7:
            return r3
    }

    private static android.view.View createVerticalDivider(android.content.Context r8) {
            r1 = 0
            r5 = 0
            java.lang.String r3 = "۟ۦۥ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
            r7 = r5
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746910: goto L20;
                case 1748860: goto L39;
                case 1749609: goto L59;
                case 1749663: goto L29;
                case 1750754: goto L44;
                case 1751743: goto L2f;
                case 1753540: goto L52;
                case 1753606: goto L4b;
                case 1755433: goto L17;
                default: goto L10;
            }
        L10:
            androidx.loader.C1099.m2849(r2, r7)
            java.lang.String r1 = "ۢ۠ۧ"
            r3 = r1
            goto L9
        L17:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r7, r4)
            java.lang.String r1 = "ۦۥۥ"
            r3 = r1
            goto L9
        L20:
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            java.lang.String r3 = "ۡۧۢ"
            r2 = r1
            goto L9
        L29:
            r4 = r6 ^ 53
            java.lang.String r1 = "ۣۨۢ"
            r3 = r1
            goto L9
        L2f:
            r1 = 1118233(0x111019, float:1.566978E-39)
            r5 = r1 ^ r6
            java.lang.String r1 = "ۢ۠ۨ"
            r3 = r1
            r7 = r5
            goto L9
        L39:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r5 = m8323(r8, r1)
            java.lang.String r1 = "ۦۣۡ"
            r3 = r1
            r7 = r5
            goto L9
        L44:
            int r5 = androidx.interpolator.C1081.f107
            java.lang.String r1 = "ۤۧۢ"
            r3 = r1
            r6 = r5
            goto L9
        L4b:
            androidx.lifecycle.livedata.C1085.m1843(r2, r0)
            java.lang.String r1 = "ۣۦۥ"
            r3 = r1
            goto L9
        L52:
            int r5 = androidx.annotation.experimental.C1067.f93
            java.lang.String r1 = "ۢۢ۟"
            r3 = r1
            r6 = r5
            goto L9
        L59:
            return r2
    }

    /* JADX INFO: renamed from: dp */
    private static int m106dp(android.content.Context r8, float r9) {
            r1 = 0
            r6 = 0
            r4 = 0
            java.lang.String r3 = "۟۠۠"
            r0 = r1
            r2 = r1
            r5 = r6
            r7 = r6
        L9:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746719: goto L16;
                case 1747683: goto L1e;
                case 1750599: goto L2f;
                case 1753541: goto L3c;
                case 1753603: goto L26;
                case 1754597: goto L34;
                default: goto L10;
            }
        L10:
            float r5 = r9 * r7
            java.lang.String r1 = "ۧۦۤ"
            r3 = r1
            goto L9
        L16:
            android.content.res.Resources r0 = androidx.emoji2.viewsintegration.C1078.m1401(r8)
            java.lang.String r1 = "ۣ۠۠"
            r3 = r1
            goto L9
        L1e:
            android.util.DisplayMetrics r1 = androidx.activity.C1062.m159(r0)
            java.lang.String r3 = "ۦۥۢ"
            r2 = r1
            goto L9
        L26:
            float r6 = androidx.vectordrawable.animated.C1102.m3118(r2)
            java.lang.String r1 = "ۥ۟ۥ"
            r3 = r1
            r7 = r6
            goto L9
        L2f:
            int r4 = (int) r9
            java.lang.String r1 = "ۦۣۢ"
            r3 = r1
            goto L9
        L34:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r9 = r5 + r1
            java.lang.String r1 = "ۣۡۥ"
            r3 = r1
            goto L9
        L3c:
            return r4
    }

    static /* synthetic */ void lambda$0(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r2, java.lang.Boolean r3) {
            boolean r0 = androidx.activity.C1064.m381(r3)
            androidx.vectordrawable.C1104.m3235(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L1a;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r2 == 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            androidx.emoji2.C1080.m1531(r2)
        L1a:
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            java.lang.String r0 = "08VRljShYa"
            java.lang.String r0 = androidx.interpolator.C1081.m1619(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3d:
            return
    }

    static /* synthetic */ void lambda$1(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r2, java.lang.Boolean r3) {
            boolean r0 = androidx.activity.C1064.m381(r3)
            androidx.drawerlayout.C1077.m1330(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L1a;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r2 == 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            androidx.emoji2.C1080.m1531(r2)
        L1a:
            int r1 = androidx.interpolator.C1081.m1643()
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
            if (r1 > 0) goto L2b
            r0 = 1833(0x729, float:2.569E-42)
            goto L20
        L2b:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L20
        L2e:
            java.lang.String r0 = "vKEuKWWFy1LBxPshlSVFN"
            java.lang.String r0 = androidx.activity.C1062.m169(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3d:
            return
    }

    static /* synthetic */ void lambda$10(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r6, android.content.Context r7, int r8, int r9, boolean r10) {
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
            if (r6 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            androidx.emoji2.C1080.m1531(r6)
        L13:
            android.os.Handler r0 = m8320()
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda1 r1 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda1
            r1.<init>(r7, r6)
            r2 = -839(0xfffffffffffffcb9, double:NaN)
            int r4 = androidx.loader.C1098.f124
            long r4 = (long) r4
            long r2 = r2 ^ r4
            androidx.loader.C1095.m2588(r0, r1, r2)
            int r1 = androidx.loader.C1097.m2731()
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
            if (r1 < 0) goto L36
            r0 = 1833(0x729, float:2.569E-42)
            goto L2b
        L36:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L2b
        L39:
            java.lang.String r0 = "t5ALNZH2rikaBqFvs4"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L48:
            return
    }

    static /* synthetic */ void lambda$11(android.content.Context r0, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r1) {
            androidx.vectordrawable.C1104.m3192(r0, r1)
            return
    }

    static /* synthetic */ void lambda$2(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r1, java.lang.Boolean r2) {
            boolean r0 = androidx.activity.C1064.m381(r2)
            dev.rikka.ndk.thirdparty.libcxx.C1111.m3788(r0)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L1a;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r1 == 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            androidx.emoji2.C1080.m1531(r1)
        L1a:
            return
    }

    static /* synthetic */ void lambda$3(android.app.Dialog r0, android.view.View r1) {
            androidx.customview.C1074.m1118(r0)
            return
    }

    static /* synthetic */ void lambda$4(android.view.View r0) {
            return
    }

    static /* synthetic */ void lambda$5(java.util.function.Consumer r1, android.widget.CompoundButton r2, boolean r3) {
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
            if (r1 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            java.lang.Boolean r0 = androidx.loader.C1096.m2664(r3)
            kevin.fun.hook.C1120.m8643(r1, r0)
        L17:
            return
    }

    static /* synthetic */ void lambda$6(android.app.Dialog r2, android.content.Context r3, int r4, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r5, android.view.View r6) {
            r0 = 0
            java.lang.String r1 = "ۤ۠ۢ"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1751526: goto L19;
                case 1754536: goto L12;
                case 1755433: goto L1f;
                default: goto La;
            }
        La:
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda6 r0 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda6
            r0.<init>(r5, r3)
            java.lang.String r1 = "ۧۤۥ"
            goto L3
        L12:
            r1 = 1
            androidx.lifecycle.livedata.C1085.m1872(r3, r4, r1, r0)
            java.lang.String r1 = "ۣۨۢ"
            goto L3
        L19:
            androidx.customview.C1074.m1118(r2)
            java.lang.String r1 = "ۨ۟ۢ"
            goto L3
        L1f:
            return
    }

    static /* synthetic */ void lambda$7(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r6, android.content.Context r7, int r8, int r9, boolean r10) {
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
            if (r6 == 0) goto L8
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L2
        L10:
            androidx.emoji2.C1080.m1531(r6)
        L13:
            android.os.Handler r0 = m8320()
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda2 r1 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda2
            r1.<init>(r7, r6)
            r2 = -388(0xfffffffffffffe7c, double:NaN)
            int r4 = com.tencent.mmkv.C1109.f135
            long r4 = (long) r4
            long r2 = r2 ^ r4
            androidx.loader.C1095.m2588(r0, r1, r2)
            return
    }

    static /* synthetic */ void lambda$8(android.content.Context r2, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r3) {
            androidx.vectordrawable.C1104.m3192(r2, r3)
            int r1 = androidx.loader.C1096.m2651()
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
            java.lang.String r0 = "7B3cfeavSgDjp1M0trQmH"
            java.lang.String r0 = kevin.fun.hook.C1120.m8648(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L22:
            return
    }

    static /* synthetic */ void lambda$9(android.app.Dialog r2, android.content.Context r3, int r4, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r5, android.view.View r6) {
            r0 = 0
            java.lang.String r1 = "ۣۣ۟"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1746815: goto L19;
                case 1747803: goto L11;
                case 1748769: goto L1f;
                default: goto La;
            }
        La:
            r1 = 0
            androidx.lifecycle.livedata.C1085.m1872(r3, r4, r1, r0)
            java.lang.String r1 = "ۡۤۤ"
            goto L3
        L11:
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda5 r0 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda5
            r0.<init>(r5, r3)
            java.lang.String r1 = "ۤۢۨ"
            goto L3
        L19:
            androidx.customview.C1074.m1118(r2)
            java.lang.String r1 = "۠ۤ۟"
            goto L3
        L1f:
            return
    }

    public static void show(android.content.Context r13, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r14) {
            r12 = 1
            r11 = 0
            r10 = 1098907648(0x41800000, float:16.0)
            r9 = 0
            r8 = 1101004800(0x41a00000, float:20.0)
            r0 = 1616(0x650, float:2.264E-42)
        L9:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lf;
                case 49: goto L12;
                case 204: goto L17;
                case 239: goto L37;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L9
        L12:
            if (r13 != 0) goto Lf
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L9
        L17:
            int r1 = androidx.core.C1072.m980()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1d:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L23;
                case 54: goto L28;
                case 471: goto L36;
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
            java.lang.String r0 = "g8Tvw4rZegl70hHSME"
            java.lang.String r0 = androidx.activity.C1062.m169(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
        L37:
            android.app.Dialog r0 = new android.app.Dialog
            r1 = 16974467(0x1030283, float:2.4062702E-38)
            int r2 = org.luckypray.dexkit.C1124.f434
            r1 = r1 ^ r2
            r0.<init>(r13, r1)
            androidx.lifecycle.runtime.C1092.m2297(r0, r12)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r13)
            int r2 = androidx.startup.C1100.f126
            r2 = r2 ^ 277(0x115, float:3.88E-43)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r2, r2)
            androidx.lifecycle.process.C1091.m2273(r1, r3)
            r3 = 1711276853(0x66000335, float:1.5113052E23)
            int r4 = androidx.activity.C1066.f92
            r3 = r3 ^ r4
            androidx.lifecycle.livedata.C1084.m1783(r1, r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r13)
            androidx.customview.C1074.m1119(r3, r12)
            int r4 = m8323(r13, r10)
            r5 = 1094713344(0x41400000, float:12.0)
            int r5 = m8323(r13, r5)
            int r6 = m8323(r13, r10)
            int r7 = m8323(r13, r8)
            androidx.drawerlayout.C1077.m1314(r3, r4, r5, r6, r7)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r5 = dev.rikka.ndk.thirdparty.libcxx.C1112.f138
            r5 = r5 ^ 932(0x3a4, float:1.306E-42)
            r4.<init>(r2, r5)
            r5 = 80
            r4.gravity = r5
            androidx.vectordrawable.C1105.m3296(r3, r4)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            androidx.lifecycle.livedata.C1085.m1879(r4, r2)
            r2 = 8
            float[] r2 = new float[r2]
            int r5 = m8323(r13, r8)
            float r5 = (float) r5
            r2[r11] = r5
            int r5 = m8323(r13, r8)
            float r5 = (float) r5
            r2[r12] = r5
            r5 = 2
            int r6 = m8323(r13, r8)
            float r6 = (float) r6
            r2[r5] = r6
            r5 = 3
            int r6 = m8323(r13, r8)
            float r6 = (float) r6
            r2[r5] = r6
            r5 = 4
            r2[r5] = r9
            r5 = 5
            r2[r5] = r9
            r5 = 6
            r2[r5] = r9
            r5 = 7
            r2[r5] = r9
            androidx.vectordrawable.C1103.m3187(r4, r2)
            androidx.activity.C1065.m397(r3, r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r13)
            short[] r4 = m8318()
            r5 = 16
            int r6 = androidx.appcompat.C1069.f95
            r6 = r6 ^ (-233(0xffffffffffffff17, float:NaN))
            r7 = 1512(0x5e8, float:2.119E-42)
            java.lang.String r4 = com.tencent.mmkv.C1109.m3629(r4, r5, r6, r7)
            androidx.lifecycle.process.C1087.m1946(r2, r4)
            r4 = 1099956224(0x41900000, float:18.0)
            androidx.vectordrawable.animated.C1102.m3105(r2, r4)
            android.graphics.Typeface r4 = androidx.emoji2.C1080.m1508()
            androidx.customview.C1074.m47(r2, r4)
            r4 = -13421863(0xffffffffff3332d9, float:-2.3819583E38)
            int r5 = androidx.activity.C1064.f90
            r4 = r4 ^ r5
            kevin.fun.hook.webdav.C1118.m8517(r2, r4)
            int r4 = androidx.lifecycle.runtime.C1092.f118
            r4 = r4 ^ 782(0x30e, float:1.096E-42)
            androidx.documentfile.C1076.m1233(r2, r4)
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = m8323(r13, r4)
            int r5 = m8323(r13, r10)
            kevin.fun.hook.audio.C1117.m8126(r2, r11, r4, r11, r5)
            androidx.activity.C1064.m372(r3, r2)
            boolean r2 = androidx.customview.C1074.m1115(r13)
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda7 r4 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda7
            r4.<init>(r14)
            short[] r5 = m8318()
            r6 = 20
            int r7 = androidx.customview.C1074.f100
            r7 = r7 ^ 245(0xf5, float:3.43E-43)
            r8 = 1042(0x412, float:1.46E-42)
            java.lang.String r5 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3732(r5, r6, r7, r8)
            android.widget.LinearLayout r2 = m8328(r13, r5, r2, r4)
            androidx.activity.C1064.m372(r3, r2)
            android.view.View r2 = m8321(r13)
            androidx.activity.C1064.m372(r3, r2)
            short[] r2 = m8318()
            r4 = 26
            int r5 = androidx.appcompat.resources.C1068.f94
            r5 = r5 ^ 520(0x208, float:7.29E-43)
            r6 = 371(0x173, float:5.2E-43)
            java.lang.String r2 = kevin.fun.hook.audio.C1116.m8020(r2, r4, r5, r6)
            android.widget.TextView r2 = m8322(r13, r2)
            androidx.activity.C1064.m372(r3, r2)
            android.view.View r2 = m8316(r13, r0, r14)
            androidx.activity.C1064.m372(r3, r2)
            android.view.View r2 = m8321(r13)
            androidx.activity.C1064.m372(r3, r2)
            boolean r2 = androidx.appcompat.C1069.m726()
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda8 r4 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda8
            r4.<init>(r14)
            short[] r5 = m8318()
            r6 = 32
            int r7 = androidx.interpolator.C1081.f107
            r7 = r7 ^ (-271(0xfffffffffffffef1, float:NaN))
            r8 = 447(0x1bf, float:6.26E-43)
            java.lang.String r5 = androidx.lifecycle.process.C1088.m2044(r5, r6, r7, r8)
            android.widget.LinearLayout r2 = m8328(r13, r5, r2, r4)
            androidx.activity.C1064.m372(r3, r2)
            boolean r2 = androidx.versionedparcelable.C1107.m3443()
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda9 r4 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda9
            r4.<init>(r14)
            short[] r5 = m8318()
            r6 = 38
            int r7 = androidx.startup.C1100.f126
            r7 = r7 ^ (-276(0xfffffffffffffeec, float:NaN))
            r8 = 1535(0x5ff, float:2.151E-42)
            java.lang.String r5 = kevin.fun.hook.audio.C1114.m7940(r5, r6, r7, r8)
            android.widget.LinearLayout r2 = m8328(r13, r5, r2, r4)
            androidx.activity.C1064.m372(r3, r2)
            androidx.annotation.experimental.C1067.m579(r1, r3)
            androidx.viewpager.C1108.m3545(r0, r1)
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda10 r2 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda10
            r2.<init>(r0)
            androidx.emoji2.viewsintegration.C1079.m1483(r1, r2)
            kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda11 r1 = new kevin.fun.hook.gesture.GestureMainDialog$$ExternalSyntheticLambda11
            r1.<init>()
            com.tencent.mmkv.C1109.m3617(r3, r1)
            kevin.fun.hook.audio.C1114.m7909(r0)
            m8315(r3)
            goto L36
    }

    /* JADX INFO: renamed from: ۟۠ۤۨ۟, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.GradientDrawable m8314(java.lang.Object r2) {
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.GradientDrawable r0 = createSquareBg(r2)
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

    /* JADX INFO: renamed from: ۣ۟۠ۥۥ, reason: not valid java name and contains not printable characters */
    public static void m8315(java.lang.Object r2) {
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.view.View r2 = (android.view.View) r2
            animatePanel(r2)
        L19:
            int r1 = androidx.activity.C1065.m427()
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
            java.lang.String r0 = "DSUvdq194eALhdgi"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            int r0 = java.lang.Integer.parseInt(r0)
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

    /* JADX INFO: renamed from: ۟ۤۢۡۨ, reason: not valid java name and contains not printable characters */
    public static android.view.View m8316(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
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
            android.app.Dialog r3 = (android.app.Dialog) r3
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r4 = (kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener) r4
            android.view.View r0 = createQuadrantGrid(r2, r3, r4)
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

    /* JADX INFO: renamed from: ۟ۤۤۥ, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m8317(java.lang.Object r2) {
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
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r0 = createSwitchTrack(r2)
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

    /* JADX INFO: renamed from: ۟ۦ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8318() {
            int r1 = kevin.fun.hook.audio.C1116.m8064()
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
            short[] r0 = kevin.fun.hook.gesture.GestureMainDialog.f411short
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

    /* JADX INFO: renamed from: ۟ۦۤۤ۠, reason: not valid java name and contains not printable characters */
    public static android.view.View m8319(java.lang.Object r2) {
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
            android.content.Context r2 = (android.content.Context) r2
            android.view.View r0 = createVerticalDivider(r2)
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

    /* JADX INFO: renamed from: ۟ۧ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static android.os.Handler m8320() {
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
            android.os.Handler r0 = kevin.fun.hook.gesture.GestureMainDialog.MAIN_HANDLER
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

    /* JADX INFO: renamed from: ۟ۧ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static android.view.View m8321(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1117.m8167()
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

    /* JADX INFO: renamed from: ۣۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m8322(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.core.C1072.m980()
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
            java.lang.String r3 = (java.lang.String) r3
            android.widget.TextView r0 = createRegionTitle(r2, r3)
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

    /* JADX INFO: renamed from: ۟ۧۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m8323(java.lang.Object r2, float r3) {
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
            android.content.Context r2 = (android.content.Context) r2
            int r0 = m106dp(r2, r3)
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

    /* JADX INFO: renamed from: ۣ۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static android.graphics.drawable.Drawable m8324(java.lang.Object r2) {
            int r1 = androidx.core.C1073.m1015()
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
            android.graphics.drawable.Drawable r0 = createSwitchThumb(r2)
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

    /* JADX INFO: renamed from: ۤۨۤ, reason: not valid java name and contains not printable characters */
    public static android.widget.TextView m8325(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1063.m300()
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
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            android.widget.TextView r0 = createActionButton(r2, r3)
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

    /* JADX INFO: renamed from: ۥۧۤۥ, reason: contains not printable characters */
    public static android.view.View m8326(java.lang.Object r2) {
            int r1 = androidx.loader.C1096.m2651()
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
            android.view.View r0 = createHorizontalDivider(r2)
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

    /* JADX INFO: renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static android.view.View m8327(java.lang.Object r2, int r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.loader.C1098.m2793()
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
            java.lang.String r4 = (java.lang.String) r4
            android.app.Dialog r5 = (android.app.Dialog) r5
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r6 = (kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener) r6
            android.view.View r0 = createRegionCell(r2, r3, r4, r5, r6)
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

    /* JADX INFO: renamed from: ۨۡۨۥ, reason: not valid java name and contains not printable characters */
    public static android.widget.LinearLayout m8328(java.lang.Object r2, java.lang.Object r3, boolean r4, java.lang.Object r5) {
            int r1 = androidx.appcompat.C1069.m747()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            java.util.function.Consumer r5 = (java.util.function.Consumer) r5
            android.widget.LinearLayout r0 = createSwitchItem(r2, r3, r4, r5)
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

    /* JADX INFO: renamed from: ۨۨۦ۟, reason: not valid java name and contains not printable characters */
    public static android.view.View m8329(java.lang.Object r2, int r3) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            android.view.View r0 = createSpacer(r2, r3)
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
