package nuke.startup;

import android.content.pm.ApplicationInfo;
import android.graphics.C3601;
import android.window.C3603;
import androidx.compose.p134ui.input.pointer.C3605;
import androidx.core.graphics.drawable.C3606;
import androidx.graphics.path.C3607;
import androidx.versionedparcelable.C3608;
import androidx.window.area.reflectionguard.C3609;
import androidx.window.area.reflectionguard.C3610;
import com.bumptech.glide.C3617;
import com.bumptech.glide.load.C3616;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.concurrent.atomic.AtomicBoolean;
import me.dartcv.nuke.C3655;
import me.dartcv.nuke.C3656;
import me.dartcv.nuke.C3657;
import p005A4.C3528;
import p009B2.C3530;
import p011B4.C3532;
import p015C2.C3534;
import p015C2.C3535;
import p015C2.C3536;
import p019D1.C3537;
import p019D1.C3538;
import p022E.C3540;
import p022E.C3541;
import p031F2.C3544;
import p037G2.C3545;
import p041H0.C3546;
import p041H0.C3547;
import p042H1.C3549;
import p052J1.C3552;
import p054K.C3553;
import p055K1.C3554;
import p057K3.C3555;
import p058L.C3556;
import p061L2.C3558;
import p063M0.C3559;
import p064M1.C3560;
import p064M1.C3561;
import p070N3.C3562;
import p079P2.C3564;
import p080P3.C1157a;
import p090R3.C3570;
import p091S.C3571;
import p093S1.C3572;
import p093S1.C3573;
import p097T1.C3574;
import p100U.C3575;
import p103U2.C3576;
import p103U2.C3577;
import p104U3.C3578;
import p104U3.C3579;
import p107V1.C3583;
import p110W0.C3584;
import p111W1.C3585;
import p111W1.C3586;
import p112W2.C3587;
import p114X.C3588;
import p115X0.C3589;
import p115X0.C3590;
import p117X2.C3592;
import p119Y.C3593;
import p120Y0.C3594;
import p125Z0.C3596;
import p125Z0.C3597;
import p127Z2.C3598;
import p131a2.C3599;
import p132a3.C3600;
import p137b3.C3612;
import p139c.C3614;
import p147d1.C3618;
import p148d2.C3620;
import p150d4.C3621;
import p151e.C3622;
import p158f0.C3624;
import p164g1.C3627;
import p166g3.C3628;
import p166g3.C3629;
import p166g3.C3630;
import p167g4.C3631;
import p168h.C3632;
import p169h0.C3633;
import p170h1.C3635;
import p172h3.C3637;
import p174i.C3639;
import p176i1.C3640;
import p177i2.C3641;
import p178i3.C3642;
import p178i3.C3643;
import p178i3.C3644;
import p183j2.C3646;
import p192l.C3647;
import p193l0.C3648;
import p194l1.C3649;
import p194l1.C3650;
import p196l4.C3651;
import p199m1.C3653;
import p200m2.C3654;
import p203n.C3658;
import p203n.C3660;
import p205n1.C3661;
import p207n3.C3662;
import p210o.C3663;
import p211o0.C3664;
import p212o1.C3666;
import p214o3.C3667;
import p214o3.C3669;
import p216p.C3670;
import p217p0.C3671;
import p222q0.C3674;
import p222q0.C3675;
import p223q1.C3676;
import p227r.C3677;
import p231r3.C3678;
import p231r3.C3679;
import p233s0.C3680;
import p233s0.C3681;
import p234s1.C3682;
import p235s2.C3683;
import p238t.C3684;
import p246u1.C3687;
import p246u1.C3688;
import p246u1.C3689;
import p247u2.C3690;
import p248u3.C3691;
import p248u3.C3692;
import p252v2.C3693;
import p253v3.C3694;
import p255w.C3696;
import p262x1.C3698;
import p262x1.C3699;
import p270y3.C3700;
import p274z1.C3702;
import p275z2.C3703;
import p276z3.C3704;

/* JADX INFO: loaded from: classes.dex */
public final class MainHook implements IXposedHookLoadPackage, IXposedHookZygoteInit {
    public static final int $stable = 8;
    private static final C1157a Companion;

    @Deprecated
    public static final String WECHAT_PACKAGE;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f11127short;
    private final AtomicBoolean isStartupCalled;
    private final String mTAG;
    private IXposedHookZygoteInit.StartupParam startupParam;

    static {
        int i5;
        int i6;
        String str;
        int iM6591 = C3683.m6591("ۢۢۦ");
        while (true) {
            switch (iM6591) {
                case 56328:
                    return;
                case 1748829:
                    Companion = new C1157a();
                    i5 = C3574.f11038 | C3575.f11039;
                    i6 = 55881;
                    break;
                case 1748865:
                    WECHAT_PACKAGE = C3679.m6574(m6472(), 0, C3584.f11048 ^ (-295), 2597);
                    iM6591 = C3606.m6172("ۡۦۢ");
                    continue;
                case 1749670:
                    f11127short = new short[]{2630, 2634, 2632, 2571, 2641, 2624, 2635, 2630, 2624, 2635, 2641, 2571, 2632, 2632, 1600, 1644, 1636, 1635, 1605, 1634, 1634, 1638, 776, 772, 774, 837, 799, 782, 773, 776, 782, 773, 799, 837, 774, 774, 977, 973, 973, 988, 975, 988, 976, 2964, 640, 869, 792, 849, 854, 849, 844, 866, 833, 863, 855, 844, 861, 792, 847, 857, 843, 792, 854, 855, 844, 792, 859, 857, 852, 852, 861, 860, 792, 858, 861, 862, 855, 842, 861, 792, 800, 861, 824, 787, 777, 792, 783, 861, 789, 796, 787, 793, 785, 792, 817, 786, 796, 793, 813, 796, 798, 790, 796, 794, 792, 839, 861, 2887, 2902, 2900, 2908, 2902, 2896, 2898, 2937, 2902, 2906, 2898, 1500, 1472, 1498, 1501, 1484, 1482, 1515, 1478, 1501, 2170, 2168, 2163, 2146, 2171, 2162, 2119, 2166, 2147, 2175, 315, 311, 309, 374, 300, 317, 310, 315, 317, 310, 300, 374, 309, 311, 314, 305, 308, 317, 297, 297, 1761, 1773, 1775, 1708, 1777, 1777, 1708, 1763, 1772, 1766, 1776, 1773, 1771, 1766, 1708, 1783, 1765, 1761, 1708, 1763, 1781, 1767, 1775, 1767, 1144, 1140, 1142, 1077, 1135, 1150, 1141, 1144, 1150, 1141, 1135, 1077, 1142, 1142, 2619, 2617, 2612, 2612, 2585, 2600, 2600, 2612, 2609, 2619, 2617, 2604, 2609, 2615, 2614, 2583, 2614, 2587, 2602, 2621, 2617, 2604, 2621, 1006, 934, 954, 955, 929, 1004, 2196, 2205, 2196, 2204, 2196, 2207, 2181, 2178, 958, 950, 958, 945, 950, 929, 1716, 1715, 1715, 1719, 1681, 1721, 1704, 1716, 1715, 1720, 1780, 1778, 1778, 1778, 1781, 2271, 2270, 2274, 2261, 2243, 2245, 2269, 2261, 3056, 3019, 3029, 3035, 2974, 3031, 3021, 2974, 3052, 3019, 3024, 3024, 3031, 3024, 3033, 2974, 3025, 3024, 2974, 3019, 3024, 3021, 3019, 3022, 3022, 3025, 3020, 3018, 3035, 3034, 2974, 3022, 3039, 3037, 3029, 3039, 3033, 3035, 2948, 2974, 1831, 1824, 1845, 1830, 1824, 1825, 1828, 1796, 1845, 1830, 1845, 1849, 2936, 2943, 2922, 2937, 2943, 2942, 2939, 2907, 2922, 2937, 2922, 2918};
                    if (C3702.f11168 > 0) {
                        i5 = C3653.f11115 + C3603.f11067;
                        i6 = 1748964;
                    } else {
                        C3617.m6220();
                        iM6591 = C3588.m6087("ۢۢۦ");
                    }
                    break;
                case 1749824:
                    if (C3651.m6390() <= 0) {
                        C3681.m6583();
                        str = "ۧ۟";
                    } else {
                        str = "ۢۢۦ";
                    }
                    iM6591 = C3601.m6144(str);
                    continue;
            }
            iM6591 = i5 + i6;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MainHook() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nuke.startup.MainHook.<init>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isSupportedLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nuke.startup.MainHook.isSupportedLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۡۢۡ, reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m6464(Object obj) {
        String str;
        int i5;
        int i6;
        int iM5948 = C3559.m5948("ۨۧۤ");
        ApplicationInfo applicationInfo = null;
        while (true) {
            ApplicationInfo applicationInfo2 = applicationInfo;
            while (true) {
                switch (iM5948) {
                    case 56573:
                        str = C3694.f11160 <= 0 ? "ۣۢۧ" : "ۨۧۤ";
                        iM5948 = C3603.m6154(str);
                        break;
                    case 1746749:
                        iM5948 = (C3572.f11036 | (C3658.f11121 + 443)) >= 0 ? C3647.m6368("ۤۤۡ") : (C3530.f10994 / C3532.f10996) ^ 1747749;
                        applicationInfo2 = null;
                        break;
                    case 1747749:
                        str = "ۨۡۦ";
                        iM5948 = C3603.m6154(str);
                        break;
                    case 1749670:
                        iM5948 = C3702.f11168 - (C3607.f11071 + 6621) < 0 ? C3630.m6285("۟ۡ۟") : C3589.m6090("ۨۧۤ");
                        break;
                    case 1751649:
                        i5 = C3555.f11019 + C3593.f11057;
                        i6 = 1749771;
                        iM5948 = i5 + i6;
                        break;
                    case 1752547:
                    case 1755405:
                        iM5948 = C3637.m6317(C3578.m6043() <= 0 ? "ۢۨۦ" : "ۣۨۥ");
                        break;
                    case 1752613:
                        if (C3579.f11043 * (C3666.f11132 % 873) <= 0) {
                            applicationInfo2 = applicationInfo;
                        }
                        break;
                    case 1753664:
                        applicationInfo = ((XC_LoadPackage.LoadPackageParam) obj).appInfo;
                        if (C3663.m6495() < 0) {
                            i5 = C3540.f11004 % C3684.f11150;
                            i6 = 1752845;
                            iM5948 = i5 + i6;
                        } else {
                            iM5948 = C3597.m6127("ۦۧۡ");
                        }
                        break;
                    case 1755466:
                        break;
                    case 1755589:
                        if (C3620.m6236() > 0) {
                            i5 = C3555.f11019 + C3593.f11057;
                            i6 = 1749771;
                            iM5948 = i5 + i6;
                        } else if (C3643.f11105 % (C3555.f11019 + 7717) < 0) {
                            i5 = C3622.f11085 | C3696.f11162;
                            i6 = 1754313;
                            iM5948 = i5 + i6;
                        } else {
                            iM5948 = C3618.m6226("ۢۢۦ");
                        }
                        break;
                }
                return applicationInfo2;
            }
            iM5948 = (C3570.f11034 - C3574.f11038) + 1755271;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0053 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۟ۡۢۦۦ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static de.robv.android.xposed.XC_MethodHook.Unhook m6465(java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nuke.startup.MainHook.m6465(java.lang.Object, java.lang.Object):de.robv.android.xposed.XC_MethodHook$Unhook");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۟ۢۢۧۧ, reason: not valid java name and contains not printable characters */
    public static String m6466(Object obj) {
        int i5;
        int i6;
        String str;
        int iM6163 = C3605.m6163("ۧۧۤ");
        String str2 = null;
        while (true) {
            String str3 = str2;
            while (true) {
                switch (iM6163) {
                    case 56293:
                        i5 = C3639.f11101 % C3662.f11125;
                        i6 = 1753103;
                        iM6163 = i5 + i6;
                        break;
                    case 56388:
                    case 1747775:
                        iM6163 = C3541.m5849(C3644.f11106 <= 0 ? "ۤۨ" : "ۨۧۤ");
                        break;
                    case 1748895:
                        break;
                    case 1749825:
                        str2 = ((MainHook) obj).mTAG;
                        if (C3612.f11076 / (C3544.f11008 + 6664) == 0) {
                            i5 = C3632.f11095 * C3693.f11159;
                            i6 = 1855257;
                            iM6163 = i5 + i6;
                        } else {
                            C3607.f11071 = 11;
                            iM6163 = C3528.m5782("ۢۦ");
                        }
                        break;
                    case 1751586:
                        str = "ۣ۠ۢ";
                        iM6163 = C3677.m6564(str);
                        break;
                    case 1752736:
                        iM6163 = C3530.f10994 + (C3560.f11024 % (-8346)) <= 0 ? C3544.m5864("۟ۤ") : C3561.m5955("ۦۢۢ");
                        break;
                    case 1753510:
                        if (C3683.f11149 > 0) {
                            iM6163 = (C3587.f11051 | C3549.f11013) + 1751587;
                            str3 = null;
                        } else {
                            str = "ۧۧۤ";
                            str3 = null;
                            iM6163 = C3677.m6564(str);
                        }
                        break;
                    case 1754471:
                        iM6163 = (C3655.f11118 / C3683.f11149) ^ (-1754630);
                        break;
                    case 1754628:
                        if (C3677.m6563() <= 0) {
                            i5 = C3639.f11101 % C3662.f11125;
                            i6 = 1753103;
                            iM6163 = i5 + i6;
                        } else if (C3559.m5945() > 0) {
                            i5 = C3644.f11106 ^ C3537.f11001;
                            i6 = 1750404;
                            iM6163 = i5 + i6;
                        } else {
                            iM6163 = C3687.m6611("ۥۣۨ");
                        }
                        break;
                    case 1755589:
                        break;
                }
                return str3;
            }
            iM6163 = (C3637.f11099 | C3556.f11020) ^ (-1755607);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۣ۟ۦ۠۟, reason: not valid java name and contains not printable characters */
    public static String m6467(Object obj) {
        int i5;
        int i6;
        String str;
        String str2;
        int iM6079 = C3586.m6079("ۨ۠ۥ");
        String str3 = null;
        while (true) {
            String str4 = str3;
            while (true) {
                switch (iM6079) {
                    case 56481:
                        str = "ۨ۟۠";
                        iM6079 = C3599.m6135(str);
                        break;
                    case 1746754:
                        if (C3640.m6332() > 0) {
                            i5 = C3624.f11087 ^ C3588.f11052;
                            i6 = 1755948;
                            iM6079 = i5 + i6;
                        } else {
                            str = "ۦۦ۠";
                            iM6079 = C3599.m6135(str);
                        }
                        break;
                    case 1747867:
                        str2 = "ۦۥۣ";
                        str4 = null;
                        iM6079 = C3677.m6564(str2);
                        break;
                    case 1749579:
                        str3 = ((XC_LoadPackage.LoadPackageParam) obj).processName;
                        if (C3530.f10994 > 0) {
                            str2 = "ۢۤۡ";
                            iM6079 = C3677.m6564(str2);
                        } else {
                            iM6079 = C3598.m6130("۠ۦۡ");
                        }
                        break;
                    case 1749727:
                        if (C3671.m6538() <= 0) {
                            C3577.m2749();
                        }
                        iM6079 = C3648.m6371("ۣۥۤ");
                        break;
                    case 1750661:
                    case 1754631:
                        if (C3621.f11084 * (C3692.f11158 - 4841) > 0) {
                            iM6079 = (C3629.f11092 ^ C3691.f11157) ^ 1750393;
                        } else {
                            C3670.f11136 = 79;
                            str2 = "ۡۡۡ";
                            iM6079 = C3677.m6564(str2);
                        }
                        break;
                    case 1750722:
                        break;
                    case 1753604:
                        if (C3556.f11020 < 0) {
                            i5 = C3656.f11119 | C3675.f11141;
                            i6 = 1750919;
                            iM6079 = i5 + i6;
                        } else {
                            C3688.m6617();
                            iM6079 = C3648.m6371("ۧۧۧ");
                        }
                        break;
                    case 1755337:
                        iM6079 = C3598.m6130("۠ۦۡ");
                        break;
                    case 1755373:
                        if (C3534.m5817() < 0) {
                            str = "ۨ۟۠";
                            iM6079 = C3599.m6135(str);
                        } else {
                            i5 = C3547.f11011 / C3545.f11009;
                            i6 = 1749455;
                            iM6079 = i5 + i6;
                        }
                        break;
                }
                return str4;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۟ۥۤۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m6468(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nuke.startup.MainHook.m6468(java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX INFO: renamed from: ۟ۦۦۧۥ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6469(java.lang.Object r4) {
        /*
            java.lang.String r0 = "ۧۨ"
            int r1 = p011B4.C3532.m5800(r0)
        L6:
            java.lang.String r2 = "ۣۨۦ"
            java.lang.String r3 = "ۥۥۥ"
            switch(r1) {
                case 56545: goto L60;
                case 1749672: goto L51;
                case 1750817: goto L37;
                case 1752645: goto L36;
                case 1753543: goto L26;
                case 1753578: goto Le;
                case 1753603: goto L26;
                case 1755399: goto L76;
                default: goto Ld;
            }
        Ld:
            goto L6
        Le:
            int r1 = p246u1.C3688.f11154
            if (r1 < 0) goto L1c
            p059L0.C3557.m5938()
            java.lang.String r1 = "ۦۣۤ"
            int r1 = p217p0.C3671.m6535(r1)
            goto L6
        L1c:
            int r1 = p041H0.C3547.f11011
            int r2 = p063M0.C3559.f11023
            int r1 = r1 + r2
            r2 = 1755226(0x1ac85a, float:2.459595E-39)
            int r1 = r1 + r2
            goto L6
        L26:
            int r1 = p114X.C3588.f11052
            int r2 = p199m1.C3653.f11115
            int r2 = r2 + (-4730)
            int r1 = r1 / r2
            if (r1 == 0) goto L5b
            r1 = 10
            android.window.C3603.f11067 = r1
            java.lang.String r3 = "ۥۤۢ"
            goto L4c
        L36:
            return
        L37:
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
            de.robv.android.xposed.XposedBridge.log(r1)
            int r1 = p178i3.C3644.m6352()
            if (r1 < 0) goto L4c
            r1 = 34
            com.bumptech.glide.load.C3616.f11079 = r1
            int r1 = p214o3.C3668.m6522(r2)
            goto L6
        L4c:
            int r1 = p212o1.C3666.m6513(r3)
            goto L6
        L51:
            int r1 = p223q1.C3676.m6561()
            if (r1 > 0) goto L5a
            java.lang.String r3 = "ۨۦۢ"
            goto L5b
        L5a:
            r3 = r0
        L5b:
            int r1 = p120Y0.C3594.m6111(r3)
            goto L6
        L60:
            int r1 = p176i1.C3640.m6332()
            if (r1 <= 0) goto L76
            int r1 = p097T1.C3574.m6023()
            if (r1 > 0) goto L71
            int r1 = p057K3.C3555.m5929(r3)
            goto L6
        L71:
            int r1 = p178i3.C3644.m6353(r2)
            goto L6
        L76:
            int r1 = p235s2.C3683.f11149
            if (r1 > 0) goto L7d
            java.lang.String r1 = "ۡۧۦ"
            goto L7f
        L7d:
            java.lang.String r1 = "ۦۤۨ"
        L7f:
            int r1 = p253v3.C3694.m6646(r1)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: nuke.startup.MainHook.m6469(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX INFO: renamed from: ۠ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static String m6470(Object obj) {
        int i5;
        int i6;
        String str;
        int i7;
        int i8;
        int iM6380 = C3649.m6380("ۤۨۤ");
        String str2 = null;
        String str3 = null;
        while (true) {
            String str4 = "ۥۢۨ";
            switch (iM6380) {
                case 56575:
                case 1750718:
                    if (C3666.f11132 % (C3658.f11121 | 4555) < 0) {
                        i5 = C3592.f11056 + C3574.f11038;
                        i6 = 1750547;
                        iM6380 = i5 ^ i6;
                    } else {
                        iM6380 = C3545.m5870("ۡ۟");
                    }
                    break;
                case 1748829:
                    str = "ۤۧۦ";
                    str2 = null;
                    iM6380 = C3584.m6069(str);
                    break;
                case 1749638:
                    break;
                case 1750532:
                    if (C3616.f11079 >= 0) {
                        C3642.f11104 = 23;
                        iM6380 = C3536.m5824("ۥۢۨ");
                    } else {
                        iM6380 = (C3667.f11133 / C3617.f11080) + 1749637;
                    }
                    str2 = str3;
                    break;
                case 1751741:
                    i5 = C3692.f11158 % C3599.f11063;
                    i6 = -1751079;
                    iM6380 = i5 ^ i6;
                    break;
                case 1751746:
                    iM6380 = C3540.m5843("ۡۦۢ");
                    break;
                case 1751747:
                    if ((C3538.f11002 | (C3545.f11009 - 1228)) < 0) {
                        str4 = "ۨۧ";
                        iM6380 = C3534.m5812(str4);
                    } else {
                        C3540.f11004 = 18;
                        str = "ۤۧۥ";
                        iM6380 = C3584.m6069(str);
                    }
                    break;
                case 1751776:
                    if (C3573.m6017() > 0) {
                        i5 = C3692.f11158 % C3599.f11063;
                        i6 = -1751079;
                        iM6380 = i5 ^ i6;
                    } else if ((C3576.f11040 | (C3560.f11024 * (-7033))) > 0) {
                        iM6380 = C3534.m5812(str4);
                    } else {
                        C3571.f11035 = 82;
                        iM6380 = C3541.m5849("ۤۨۤ");
                    }
                    break;
                case 1752555:
                    str3 = ((IXposedHookZygoteInit.StartupParam) obj).modulePath;
                    i7 = C3607.f11071 | C3598.f11062;
                    i8 = 1749545;
                    iM6380 = i7 + i8;
                    break;
                case 1754474:
                    if ((C3629.f11092 ^ (C3631.f11094 % (-3680))) > 0) {
                        i7 = C3680.f11146 ^ C3530.f10994;
                        i8 = 1750894;
                        iM6380 = i7 + i8;
                    } else {
                        C3632.m6293();
                        str4 = "ۧ۠ۥ";
                        iM6380 = C3534.m5812(str4);
                    }
                    break;
            }
            return str2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a1 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۦ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static de.robv.android.xposed.IXposedHookZygoteInit.StartupParam m6471(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nuke.startup.MainHook.m6471(java.lang.Object):de.robv.android.xposed.IXposedHookZygoteInit$StartupParam");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: ۦۤۤ, reason: contains not printable characters */
    public static short[] m6472() {
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        int iM6666 = C3698.m6666("ۥۨۢ");
        short[] sArr = null;
        short[] sArr2 = null;
        while (true) {
            switch (iM6666) {
                case 1746692:
                    sArr2 = f11127short;
                    if (C3546.f11010 < 0) {
                        i5 = C3663.f11129 | C3655.f11118;
                        i6 = 1750812;
                        iM6666 = i5 + i6;
                    } else {
                        C3535.m5818();
                        iM6666 = C3608.m6184("ۤۥۤ");
                    }
                    break;
                case 1748734:
                    i7 = C3554.f11018 - C3704.f11170;
                    i8 = 1754159;
                    iM6666 = i7 ^ i8;
                    break;
                case 1748742:
                    if (C3562.f11026 / (C3594.f11058 ^ 7749) == 0) {
                        i5 = C3628.f11091 / C3574.f11038;
                        i6 = 1752730;
                        iM6666 = i5 + i6;
                    } else {
                        C3660.m6433();
                        str = "ۣۢۦ";
                        iM6666 = C3576.m6034(str);
                    }
                    break;
                case 1749668:
                    str = "ۧۤۡ";
                    iM6666 = C3576.m6034(str);
                    break;
                case 1749734:
                case 1754382:
                    if (C3624.f11087 > 0) {
                        i5 = C3576.f11040 / C3538.f11002;
                        i6 = 1750593;
                        iM6666 = i5 + i6;
                    } else {
                        C3562.m5961();
                        iM6666 = C3530.m5789("ۣ۠۠");
                    }
                    break;
                case 1750593:
                    break;
                case 1750788:
                    if (C3530.f10994 > 0) {
                        sArr = sArr2;
                        iM6666 = C3627.m6267("ۣۡ۟");
                    } else {
                        iM6666 = C3594.m6111("ۣۡ۠");
                        sArr = sArr2;
                    }
                    break;
                case 1751683:
                    if (C3614.f11078 % (C3590.f11054 + 3346) >= 0) {
                        C3703.m6692();
                        iM6666 = C3657.m6417("ۣۡۨ");
                    } else {
                        iM6666 = (C3530.f10994 / C3622.f11085) + 1748734;
                    }
                    sArr = null;
                    break;
                case 1752735:
                    if (C3661.m6436() < 0) {
                        str = "ۧۤۡ";
                        iM6666 = C3576.m6034(str);
                    } else if (C3596.f11060 * (C3663.f11129 / 4664) == 0) {
                        i5 = C3661.f11124 * C3654.f8276;
                        i6 = 2307740;
                        iM6666 = i5 + i6;
                    } else {
                        C3564.m5974();
                        iM6666 = C3544.m5864("ۥۨۢ");
                    }
                    break;
                case 1754532:
                    if ((C3573.f11037 ^ (C3545.f11009 / 1317)) < 0) {
                        i7 = C3657.f11120 % C3553.f11017;
                        i8 = 1751107;
                        iM6666 = i7 ^ i8;
                    } else {
                        C3552.f11016 = 62;
                        iM6666 = C3627.m6267("ۣۡ۟");
                    }
                    break;
            }
            return sArr;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    /* JADX INFO: renamed from: ۨۧۤۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6473(Object obj, Object obj2) {
        int i5;
        int i6;
        int iM6669 = C3699.m6669("ۣۧ۠");
        boolean z5 = false;
        boolean zIsSupportedLoadPackage = false;
        while (true) {
            String str = "ۡ۟ۤ";
            switch (iM6669) {
                case 1747838:
                case 1748733:
                    if ((C3635.f7294 | (C3573.f11037 / 8707)) > 0) {
                        i5 = C3597.f11061 + C3633.f11096;
                        i6 = 1755335;
                        iM6669 = i5 + i6;
                    } else {
                        str = "ۤۦۨ";
                        iM6669 = C3655.m6408(str);
                    }
                    break;
                case 1748614:
                    if (C3637.m6314() < 0) {
                        iM6669 = C3698.m6666("ۤۤۨ");
                    } else {
                        C3614.m6209();
                        iM6669 = C3654.m6402("ۣۧ۠");
                    }
                    break;
                case 1749576:
                    iM6669 = (C3653.f11115 * C3558.f11022) ^ 1218004;
                    break;
                case 1749760:
                    zIsSupportedLoadPackage = ((MainHook) obj).isSupportedLoadPackage((XC_LoadPackage.LoadPackageParam) obj2);
                    iM6669 = C3664.f11130 - (C3687.f11153 ^ (-2171)) >= 0 ? C3700.m6674("۠ۥۣ") : C3656.m6413("ۨۧۦ");
                    break;
                case 1750780:
                    if (C3690.m6628() >= 0) {
                        iM6669 = C3655.m6408(str);
                    } else {
                        i5 = C3676.f11142 % C3541.f11005;
                        i6 = 1749479;
                        iM6669 = i5 + i6;
                    }
                    break;
                case 1751656:
                    if (C3579.f11043 * (C3678.f11144 | 7102) < 0) {
                        iM6669 = (C3657.f11120 % C3703.f11169) + 1753578;
                        z5 = false;
                    } else {
                        C3607.f11071 = 88;
                        z5 = false;
                        iM6669 = C3698.m6666("ۤۤۨ");
                    }
                    break;
                case 1753633:
                    iM6669 = C3655.m6408(str);
                    break;
                case 1753638:
                    if (C3646.f11108 - (C3547.f11011 ^ 1464) > 0) {
                        str = "ۣۡ۟";
                        iM6669 = C3655.m6408(str);
                    } else {
                        C3600.m6142();
                        iM6669 = C3621.m6242("ۡ۟ۤ");
                    }
                    break;
                case 1755467:
                    break;
                case 1755591:
                    iM6669 = (C3637.f11099 * C3583.f11047) + 1284807;
                    z5 = zIsSupportedLoadPackage;
                    break;
            }
            return z5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x072a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r37) {
        /*
            Method dump skipped, instruction units count: 2284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nuke.startup.MainHook.handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        int i5;
        int i6;
        int iM6075 = C3585.m6075("ۣۡۤ");
        Long lValueOf = null;
        while (true) {
            String str = "ۣ۟ۧ";
            switch (iM6075) {
                case 56355:
                    i5 = C3630.f11093 * C3610.f11074;
                    i6 = 1383100;
                    iM6075 = i5 + i6;
                    break;
                case 1748738:
                    C3661.m6434(startupParam, C3575.m6029(m6472(), 313, C3621.f11084 ^ (-354), 2827));
                    C3574.m6023();
                    iM6075 = C3691.m6635("ۡۤۡ");
                    break;
                case 1748741:
                    if (C3608.m6181() >= 0) {
                        i5 = C3674.f11140 * C3632.f11095;
                        i6 = 1999754;
                    } else {
                        i5 = C3650.f11112 * C3587.f11051;
                        i6 = 1751540;
                    }
                    iM6075 = i5 + i6;
                    break;
                case 1748766:
                    this.startupParam = startupParam;
                    if (C3641.m6334() > 0) {
                        i5 = C3682.f11148 | C3657.f11120;
                        i6 = 1748028;
                        iM6075 = i5 + i6;
                    } else {
                        C3528.f10992 = 76;
                        iM6075 = C3609.m6189(str);
                    }
                    break;
                case 1749818:
                    i5 = C3650.f11112 * C3587.f11051;
                    i6 = 1751540;
                    iM6075 = i5 + i6;
                    break;
                case 1750539:
                    System.out.println(lValueOf);
                    str = "ۣۡۡ";
                    if (C3647.f11109 - (C3535.f10999 * 8282) > 0) {
                        iM6075 = C3609.m6189(str);
                    } else {
                        C3689.f11155 = 80;
                        iM6075 = C3669.m6528("ۣۡۡ");
                    }
                    break;
                case 1750595:
                    break;
                case 1754375:
                    lValueOf = Long.valueOf(C3540.m5844("H7V2bARAdN39HZdAVBkW3OwDXETM"));
                    iM6075 = C3609.m6189(str);
                    break;
            }
            return;
        }
    }
}
