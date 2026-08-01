package p000;

import android.app.Application;
import android.app.C0986;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.drawable.C0987;
import android.window.C0988;
import android.window.C0990;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1006;
import androidx.core.content.C1007;
import androidx.core.graphics.drawable.C1009;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import androidx.legacy.content.C1014;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.appbar.C1021;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1028;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.internal.C1038;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import com.ljx.wechatmod.p001ui.C1051;
import io.fastkv.C1053;
import io.fastkv.FastKV;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: kn */
/* JADX INFO: loaded from: classes.dex */
public final class C0417kn {

    /* JADX INFO: renamed from: a */
    public static final C0417kn f2847a;

    /* JADX INFO: renamed from: b */
    public static Application f2848b;

    /* JADX INFO: renamed from: c */
    public static FastKV f2849c;

    /* JADX INFO: renamed from: d */
    public static String f2850d;

    /* JADX INFO: renamed from: e */
    public static String f2851e;

    /* JADX INFO: renamed from: f */
    public static WeakReference f2852f;

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f2853g;

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2854h;

    /* JADX INFO: renamed from: i */
    public static final C0703sd f2855i;

    /* JADX INFO: renamed from: j */
    public static InterfaceC0641qp f2856j;

    /* JADX INFO: renamed from: k */
    public static w40 f2857k;

    /* JADX INFO: renamed from: l */
    public static final String f2858l;

    /* JADX INFO: renamed from: m */
    public static final Handler f2859m;

    /* JADX INFO: renamed from: n */
    public static final RunnableC0267gn f2860n;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    static {
        String str;
        String str2;
        String str3;
        n50 n50Var = null;
        int iM3001 = C1022.m3001("ۨۡ");
        while (true) {
            switch (iM3001) {
                case 56448:
                    n50Var = new n50();
                    if (C1051.f5698 > 0) {
                        iM3001 = (C0999.f5646 % C0999.f5646) + 1748737;
                    } else {
                        str = "۠ۤۤ";
                        iM3001 = C1017.m2981(str);
                    }
                    break;
                case 56478:
                    f2850d = "";
                    iM3001 = C1027.f5674 + C0998.f5645 + 1750125;
                    break;
                case 56512:
                    f2859m = new Handler(Looper.getMainLooper());
                    str2 = "ۣۤۢ";
                    iM3001 = C1057.m3139(str2);
                    break;
                case 56569:
                    f2858l = b50.m492a("yFxMnRHl7XvcVkLbHPv4Os8ddOM5zsEQ9HBu/TvG0g==\n", "qzMhs32PlVU=\n");
                    iM3001 = (C1026.f5673 / C1051.f5698) ^ 1749608;
                    break;
                case 1747686:
                    f2855i = AbstractC0259gf.m1244c(g80.m1172C(n50Var, AbstractC0607ps.f3752a));
                    str = "ۦۦ";
                    iM3001 = C1017.m2981(str);
                    break;
                case 1747808:
                    f2854h = new ConcurrentHashMap();
                    iM3001 = C0991.m2876(C1049.f5696 >= 0 ? "۠۠ۦ" : "ۤۤ");
                    break;
                case 1748737:
                    C0928yf c0928yf = AbstractC0929yg.f5430a;
                    if (C0991.f5638 * (C1012.f5659 % 4792) > 0) {
                        iM3001 = (C1025.f5672 - C0995.f5642) + 1748751;
                    } else {
                        str2 = "ۦۦ";
                        iM3001 = C1057.m3139(str2);
                    }
                    break;
                case 1748767:
                    break;
                case 1749608:
                    f2847a = new C0417kn();
                    if (C1013.m2964() > 0) {
                        str = "ۥۣ";
                        iM3001 = C1017.m2981(str);
                    } else {
                        C1020.m2990();
                        iM3001 = C0997.m2901("ۣۤۢ");
                    }
                    break;
                case 1750629:
                    f2851e = "";
                    if (C1038.m3062() >= 0) {
                        C1018.f5665 = 76;
                        iM3001 = C1059.m3145("ۨۡ");
                    } else {
                        iM3001 = (C1053.f5700 / C1021.f5668) + 1750784;
                    }
                    break;
                case 1750784:
                    f2853g = new ConcurrentHashMap();
                    if (C1012.f5659 % (C1048.f5695 | 3386) > 0) {
                        str = "۠ۤۤ";
                        iM3001 = C1017.m2981(str);
                    } else {
                        iM3001 = C1003.m2922("ۧۢۦ");
                    }
                    break;
                case 1751619:
                    f2860n = new RunnableC0267gn(0);
                    str3 = "ۡۤۢ";
                    iM3001 = C1027.m3021(str3);
                    break;
                case 1754475:
                    if ((C1016.f5663 ^ (C1037.f5684 - 2854)) > 0) {
                        iM3001 = (C1038.f5685 | C1027.f5674) + 56570;
                    } else {
                        str3 = "۟ۤۡ";
                        iM3001 = C1027.m3021(str3);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m1690a(java.lang.String r3, boolean r4) {
        /*
            r0 = 0
            java.lang.String r1 = "۟ۥۦ"
            int r2 = androidx.coordinatorlayout.widget.C1003.m2922(r1)
            r1 = r0
        L8:
            switch(r2) {
                case 56421: goto Lc;
                case 56574: goto L27;
                case 1746695: goto L6b;
                case 1746880: goto L3c;
                case 1750749: goto L5e;
                case 1752610: goto L23;
                case 1755342: goto L28;
                default: goto Lb;
            }
        Lb:
            goto L8
        Lc:
            if (r1 == 0) goto L28
            int r0 = p000.C1058.f5705
            int r2 = androidx.activity.C0995.f5642
            int r2 = r2 * 7822
            r0 = r0 ^ r2
            if (r0 < 0) goto L1b
            r0 = 30
            androidx.coordinatorlayout.widget.C1002.f5649 = r0
        L1b:
            java.lang.String r0 = "ۥۤۡ"
            int r0 = com.google.android.material.sidesheet.C1039.m3067(r0)
            r2 = r0
            goto L8
        L23:
            boolean r4 = r1.getBoolean(r3, r4)
        L27:
            return r4
        L28:
            int r0 = androidx.activity.C0996.f5643
            if (r0 > 0) goto L34
            java.lang.String r0 = "ۦۧۢ"
            int r0 = com.ljx.wechatmod.auth.C1047.m3096(r0)
            r2 = r0
            goto L8
        L34:
            java.lang.String r0 = "ۨۦ"
        L36:
            int r0 = com.google.android.material.theme.C1042.m3078(r0)
            r2 = r0
            goto L8
        L3c:
            java.lang.String r0 = "fYvI\n"
            java.lang.String r2 = "Fu6xhXiG918=\n"
            java.lang.String r0 = p000.b50.m492a(r0, r2)
            p000.AbstractC0493mp.m1857g(r0, r3)
            int r0 = android.support.v4.graphics.drawable.C0987.f5634
            int r2 = com.google.android.material.snackbar.C1040.f5687
            int r2 = r2 * 9571
            int r0 = r0 + r2
            if (r0 < 0) goto L5b
            androidx.core.app.C1005.m2933()
            java.lang.String r0 = "۟۟ۧ"
            int r0 = com.ljx.wechatmod.hook.C1049.m3104(r0)
            r2 = r0
            goto L8
        L5b:
            java.lang.String r0 = "ۣۦ۠"
            goto L36
        L5e:
            io.fastkv.FastKV r0 = p000.C0417kn.f2849c
            int r1 = com.github.megatronking.stringfog.xor.C1018.f5665
            int r2 = androidx.activity.result.C0994.f5641
            r1 = r1 ^ r2
            r2 = 56163(0xdb63, float:7.8701E-41)
            int r2 = r2 + r1
            r1 = r0
            goto L8
        L6b:
            int r0 = androidx.appcompat.view.menu.C0998.m2903()
            if (r0 > 0) goto L77
            io.fastkv.C1052.m3116()
            java.lang.String r0 = "ۡۧۥ"
            goto L36
        L77:
            int r0 = com.github.megatronking.stringfog.C1019.f5666
            int r2 = androidx.coordinatorlayout.widget.C1004.f5651
            int r0 = r0 % r2
            r2 = 1746995(0x1aa833, float:2.448061E-39)
            int r0 = r0 + r2
            r2 = r0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1690a(java.lang.String, boolean):boolean");
    }

    /* JADX INFO: renamed from: b */
    public static int m1691b(String str, int i) {
        FastKV fastKV = null;
        int iM3145 = C1059.m3145("ۡۧۡ");
        while (true) {
            switch (iM3145) {
                case 1747744:
                    fastKV = f2849c;
                    iM3145 = C0990.f5637 + C0998.f5645 + 1752926;
                    continue;
                case 1748859:
                    AbstractC0493mp.m1857g(b50.m492a("gQWp\n", "6mDQzwUy7lo=\n"), str);
                    iM3145 = (C1047.f5694 * C1056.f5703) + 2059120;
                    continue;
                case 1752582:
                    return fastKV.getInt(str, i);
                case 1753414:
                    break;
                case 1753485:
                    if (C1056.f5703 <= 0) {
                        C0997.f5644 = 86;
                        iM3145 = C1015.m2970("۠۟۟");
                    } else {
                        iM3145 = (C1016.f5663 + C1017.f5664) ^ (-1748367);
                        continue;
                    }
                    break;
                case 1753639:
                    if (fastKV != null) {
                        iM3145 = C0995.f5642 - (C1012.f5659 + (-9045)) <= 0 ? C1002.m2920("ۨ۠۟") : (C1018.f5665 / C1007.f5654) ^ 1752582;
                    }
                    break;
                case 1755367:
                    return i;
            }
            iM3145 = (C1036.f5683 + C0990.f5637) ^ 1755711;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x013d A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1692c(android.widget.TextView r12) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1692c(android.widget.TextView):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1693d(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1693d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1694e(String str) {
        int iM2931 = C1005.m2931("ۢۨ۟");
        while (true) {
            switch (iM2931) {
                case 1747843:
                    iM2931 = C1034.m3046("ۢۨ۟");
                    continue;
                case 1748613:
                    break;
                case 1748804:
                    return m1690a(str, false);
                case 1748833:
                    return false;
                case 1749849:
                    if (!m1690a(g40.m1148k("y2PJ\n", "oAawZQ72FxA=\n", str, "TcaRoi+LFEhHz7eQKZQPT1Q=\n", "JqPo/Ujneyo=\n"), true)) {
                        iM2931 = (C1009.f5656 % C1043.f5690) ^ (-1748746);
                    }
                    break;
            }
            iM2931 = C1049.m3104(C1020.f5667 / (C1058.f5705 + (-3772)) != 0 ? "ۤۡۥ" : "ۡۥۨ");
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: f */
    public static void m1695f(String str, boolean z) {
        String str2;
        FastKV fastKV;
        String str3;
        int iM2885 = C0993.m2885("ۨ۠ۨ");
        RunnableC0267gn runnableC0267gn = null;
        Handler handler = null;
        FastKV fastKV2 = null;
        while (true) {
            switch (iM2885) {
                case 1746725:
                    if (fastKV2 == null) {
                        str3 = "۠ۥۤ";
                        iM2885 = C1031.m3036(str3);
                    } else {
                        iM2885 = C1004.f5651 <= 0 ? C1034.m3046("ۦۡ۠") : (C1058.f5705 - C0986.f5633) + 1748068;
                    }
                    break;
                case 1746968:
                    fastKV2.putBoolean(str, z);
                    if ((C1048.f5695 ^ (C1031.f5678 ^ (-502))) > 0) {
                        str3 = "۠ۥۤ";
                        iM2885 = C1031.m3036(str3);
                    } else {
                        C1057.m3136();
                        iM2885 = C1025.m3011("۟ۨۡ");
                    }
                    break;
                case 1747716:
                    break;
                case 1747839:
                    handler = f2859m;
                    str3 = "ۧ۟۠";
                    iM2885 = C1031.m3036(str3);
                    break;
                case 1748617:
                    handler.removeCallbacks(runnableC0267gn);
                    iM2885 = C1043.m3082() <= 0 ? C1014.m2969("۠ۥۤ") : (C1040.f5687 - C1050.f5697) ^ (-1749498);
                    break;
                case 1749636:
                    fastKV = f2849c;
                    if ((C1005.f5652 ^ (C1037.f5684 / 4500)) < 0) {
                        iM2885 = C1014.m2969("۟۠ۦ");
                        fastKV2 = fastKV;
                    } else {
                        str2 = "۠ۡۥ";
                        fastKV2 = fastKV;
                        iM2885 = C1049.m3104(str2);
                    }
                    break;
                case 1749727:
                    handler.postDelayed(runnableC0267gn, (-432) ^ ((long) C1023.f5670));
                    if (C1024.m3008() > 0) {
                        iM2885 = (C0991.f5638 | C1041.f5688) + 1746693;
                    } else {
                        C1019.f5666 = 85;
                        fastKV = fastKV2;
                        iM2885 = C1014.m2969("۟۠ۦ");
                        fastKV2 = fastKV;
                    }
                    break;
                case 1751587:
                    str3 = "۠ۥۤ";
                    iM2885 = C1031.m3036(str3);
                    break;
                case 1753477:
                    if (C1006.m2937() < 0) {
                        iM2885 = (C1018.f5665 ^ C1025.f5672) + 1756108;
                    } else {
                        str3 = "ۧۨۡ";
                        iM2885 = C1031.m3036(str3);
                    }
                    break;
                case 1754376:
                    RunnableC0267gn runnableC0267gn2 = f2860n;
                    if (C1048.m3102() < 0) {
                        str2 = "ۡ۟ۧ";
                        runnableC0267gn = runnableC0267gn2;
                        iM2885 = C1049.m3104(str2);
                    } else {
                        C0988.m2865();
                        iM2885 = C0994.m2889("ۣۢۡ");
                        runnableC0267gn = runnableC0267gn2;
                    }
                    break;
                case 1755376:
                    AbstractC0493mp.m1857g(b50.m492a("MaAY\n", "WsVhLmnzkVg=\n"), str);
                    iM2885 = (C1028.f5675 / C0987.f5634) ^ 1749636;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1696g(java.lang.String r8, int r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1696g(java.lang.String, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1697h(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1697h(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0014 A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1698i(android.view.View r3, int r4) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1698i(android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042 A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1699j(java.lang.String r5, p000.InterfaceC0379jm r6) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1699j(java.lang.String, jm):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:433:0x085e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0aa1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a9d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0a80 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0944 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x061b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x060c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x045d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x044b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a8e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0a6a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0662 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0950 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0905 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x063f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x07d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x07cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x08fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0873 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x091b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0a66 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1700k(android.content.Context r47, java.lang.String r48) {
        /*
            Method dump skipped, instruction units count: 3562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0417kn.m1700k(android.content.Context, java.lang.String):void");
    }
}
