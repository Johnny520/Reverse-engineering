package nuke.startup;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.pm.ApplicationInfo;
import android.graphics.C3601;
import android.support.v4.graphics.drawable.C3602;
import android.window.C3603;
import androidx.compose.p134ui.input.pointer.C3605;
import androidx.core.graphics.drawable.C3606;
import androidx.graphics.path.C3607;
import androidx.versionedparcelable.C3608;
import androidx.window.area.reflectionguard.C3609;
import androidx.window.area.reflectionguard.C3610;
import androidx.window.reflection.C3611;
import com.bumptech.glide.C3617;
import com.bumptech.glide.load.C3616;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import me.dartcv.nuke.C3655;
import me.dartcv.nuke.C3656;
import me.dartcv.nuke.C3657;
import p000A.C0071l;
import p000A.C3527;
import p005A4.C3528;
import p005A4.C3529;
import p009B2.C3530;
import p009B2.C3531;
import p011B4.C3532;
import p014C1.C3533;
import p015C2.C0243c;
import p015C2.C3534;
import p015C2.C3535;
import p015C2.C3536;
import p019D1.C3537;
import p019D1.C3538;
import p021D3.C0274k;
import p021D3.C3539;
import p021D3.EnumC0272i;
import p022E.C3540;
import p022E.C3541;
import p026E3.C0286b;
import p026E3.C3542;
import p031F2.C3543;
import p031F2.C3544;
import p037G2.C3545;
import p041H0.C3546;
import p041H0.C3547;
import p041H0.C3548;
import p042H1.C3549;
import p048I1.C3550;
import p050I3.C3551;
import p052J1.C3552;
import p054K.C3553;
import p055K1.C3554;
import p057K3.C3555;
import p058L.C3556;
import p059L0.C3557;
import p061L2.C3558;
import p063M0.C3559;
import p064M1.C3560;
import p064M1.C3561;
import p070N3.C3562;
import p076P.C3563;
import p079P2.C3564;
import p080P3.C1157a;
import p084Q2.C3565;
import p084Q2.C3566;
import p087R0.C3567;
import p087R0.C3568;
import p090R3.C3569;
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
import p105V.C3580;
import p105V.C3581;
import p107V1.C3583;
import p110W0.C3584;
import p111W1.C3585;
import p111W1.C3586;
import p112W2.C3587;
import p114X.C3588;
import p115X0.C3589;
import p115X0.C3590;
import p116X1.C3591;
import p117X2.C3592;
import p119Y.C3593;
import p120Y0.C3594;
import p120Y0.C3595;
import p125Z0.C3596;
import p125Z0.C3597;
import p127Z2.C3598;
import p128a.AbstractC1785a;
import p131a2.C3599;
import p132a3.C3600;
import p137b3.C3612;
import p139c.C3614;
import p140c0.C3615;
import p147d1.C3618;
import p148d2.C3619;
import p148d2.C3620;
import p150d4.C3621;
import p151e.C3622;
import p157f.C3623;
import p158f0.C3624;
import p159f1.C3625;
import p163g0.C3626;
import p164g1.C3627;
import p166g3.C3628;
import p166g3.C3629;
import p166g3.C3630;
import p167g4.C3631;
import p168h.C3632;
import p169h0.C3633;
import p170h1.C3635;
import p172h3.C3636;
import p172h3.C3637;
import p174i.C3638;
import p174i.C3639;
import p176i1.C3640;
import p177i2.C3641;
import p178i3.C3642;
import p178i3.C3643;
import p178i3.C3644;
import p178i3.C3645;
import p183j2.C3646;
import p192l.C3647;
import p193l0.C3648;
import p194l1.C3649;
import p194l1.C3650;
import p196l4.C3651;
import p197m.C3652;
import p199m1.C3653;
import p200m2.C3654;
import p203n.C3658;
import p203n.C3659;
import p203n.C3660;
import p205n1.C3661;
import p207n3.C3662;
import p210o.C3663;
import p211o0.C3664;
import p212o1.C3665;
import p212o1.C3666;
import p214o3.C3667;
import p214o3.C3668;
import p214o3.C3669;
import p216p.C3670;
import p217p0.C3671;
import p217p0.C3672;
import p220p4.C3673;
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
import p243t4.C3685;
import p245u0.C3686;
import p246u1.C3687;
import p246u1.C3688;
import p246u1.C3689;
import p247u2.C3690;
import p248u3.C3691;
import p248u3.C3692;
import p252v2.C3693;
import p253v3.C3694;
import p254v4.C3695;
import p255w.C3696;
import p259w3.C3697;
import p262x1.C3698;
import p262x1.C3699;
import p269y2.C3492b;
import p270y3.C3700;
import p274z1.C3701;
import p274z1.C3702;
import p275z2.C3703;
import p276z3.C3704;
import p277z4.C3705;

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
    */
    public MainHook() {
        int i5;
        int i6;
        String str;
        int iM6117 = C3595.m6117("ۦۡۧ");
        Double dDecode = null;
        while (true) {
            switch (iM6117) {
                case 56295:
                    break;
                case 56418:
                    if (C3701.m6678() < 0) {
                        if ((C3601.f11065 ^ (C3701.f11167 / (-7093))) >= 0) {
                            i5 = C3630.f11093 % C3590.f11054;
                            i6 = 56869;
                            iM6117 = i5 + i6;
                        } else {
                            iM6117 = C3636.m6309("ۤۤۢ");
                        }
                    } else if (C3600.m6142() < 0) {
                        i5 = C3629.f11092 ^ C3630.f11093;
                        i6 = 1752675;
                        iM6117 = i5 + i6;
                    } else {
                        str = "ۦۧ۠";
                        iM6117 = C3546.m5872(str);
                    }
                    break;
                case 1750633:
                    System.out.println(dDecode);
                    str = "۟ۦ";
                    iM6117 = C3546.m5872(str);
                    break;
                case 1751562:
                    iM6117 = C3645.m6358("ۦۡۧ");
                    break;
                case 1752585:
                    dDecode = Double.decode(C3612.m6202("PBC96lj"));
                    if ((C3563.f11027 | (C3542.f11006 + 7827)) > 0) {
                        str = "ۣۢۨ";
                        iM6117 = C3546.m5872(str);
                    } else {
                        C3635.f7294 = 60;
                        iM6117 = C3560.m5951("ۤۡۧ");
                    }
                    break;
                case 1752671:
                    this.isStartupCalled = new AtomicBoolean();
                    if (C3553.f11017 > 0) {
                        i5 = C3568.f11032 * C3691.f11157;
                        i6 = 330885;
                        iM6117 = i5 + i6;
                    } else {
                        C3532.m5802();
                        iM6117 = C3608.m6184("ۦۡۧ");
                    }
                    break;
                case 1753484:
                    this.mTAG = C3557.m5937(m6472(), 14, C3609.f11073 ^ (-116), 1549);
                    i5 = C3548.f11012 | C3528.f10992;
                    i6 = 1752704;
                    iM6117 = i5 + i6;
                    break;
                case 1753663:
                    if ((C3601.f11065 ^ (C3701.f11167 / (-7093))) >= 0) {
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isSupportedLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str;
        int i5;
        int i6;
        int iM6172 = C3606.m6172("۠ۨۦ");
        String strM5946 = null;
        String strM6468 = null;
        while (true) {
            String str2 = "۟ۨۧ";
            switch (iM6172) {
                case 56420:
                    if (C3602.m6151() >= 0) {
                        C3540.f11004 = 78;
                        str = "۠ۨ";
                    } else {
                        str = "۠ۨۦ";
                    }
                    iM6172 = C3675.m6554(str);
                    break;
                case 1746974:
                    if (C3602.m6150(m6467(loadPackageParam), strM5946)) {
                        str2 = "ۦۧ۟";
                        if (C3614.f11078 % (C3599.f11063 - 1401) < 0) {
                            iM6172 = C3549.m5890(str2);
                        } else {
                            C3536.f11000 = 57;
                            iM6172 = C3635.m6304("ۦۧ۟");
                        }
                    } else if ((C3603.f11067 ^ (C3527.f10991 * 8127)) < 0) {
                        i5 = C3645.f11107 * C3574.f11038;
                        i6 = 1789821;
                        iM6172 = i5 + i6;
                    } else {
                        C3703.f11169 = 67;
                        str2 = "ۣۤۨ";
                        iM6172 = C3549.m5890(str2);
                    }
                    break;
                case 1747779:
                    return false;
                case 1747934:
                    strM6468 = m6468(loadPackageParam);
                    if (C3609.m6187() < 0) {
                        i5 = C3599.f11063 | C3545.f11009;
                        i6 = 1748804;
                        iM6172 = i5 + i6;
                    } else {
                        iM6172 = C3559.m5948("۟ۨۧ");
                    }
                    break;
                case 1748799:
                    strM5946 = C3559.m5946(m6472(), 22, C3673.f11139 ^ (-450), 875);
                    if (C3553.m5916() < 0) {
                        i5 = C3675.f11141 + C3631.f11094;
                        i6 = 1750850;
                        iM6172 = i5 + i6;
                    } else {
                        iM6172 = C3578.m6040("ۨۧۤ");
                    }
                    break;
                case 1750719:
                    if (!C3602.m6150(strM6468, strM5946)) {
                        if ((C3603.f11067 ^ (C3527.f10991 * 8127)) < 0) {
                        }
                    }
                    iM6172 = C3549.m5890(str2);
                    break;
                case 1753662:
                    return true;
                case 1755589:
                    if ((C3603.f11067 ^ (C3527.f10991 * 8127)) < 0) {
                    }
                    break;
            }
        }
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
    */
    public static XC_MethodHook.Unhook m6465(Object obj, Object obj2) {
        String str;
        int i5;
        int i6;
        String str2;
        int iM6048 = C3579.m6048("ۥۤۥ");
        XC_MethodHook.Unhook unhookHookMethod = null;
        XC_MethodHook.Unhook unhook = null;
        while (true) {
            String str3 = "۟۟";
            switch (iM6048) {
                case 56288:
                    unhookHookMethod = XposedBridge.hookMethod((Member) obj, (XC_MethodHook) obj2);
                    if (C3686.f11152 < 0) {
                        str = "ۦۣ";
                        iM6048 = C3609.m6189(str);
                    } else {
                        C3670.m6533();
                        iM6048 = C3683.m6591("۟۟");
                    }
                    break;
                case 56322:
                case 1747777:
                    if ((C3648.f11110 ^ (C3569.f11033 | 1820)) < 0) {
                        iM6048 = (C3648.f11110 % C3552.f11016) ^ (-1747880);
                    } else {
                        C3682.f11148 = 86;
                        str3 = "ۨۧ۠";
                        iM6048 = C3682.m6587(str3);
                    }
                    break;
                case 56509:
                    unhook = unhookHookMethod;
                    str2 = "۠ۦۨ";
                    iM6048 = C3686.m6609(str2);
                    break;
                case 1747874:
                    break;
                case 1748864:
                    if (C3566.f11030 / (C3556.f11020 / 640) < 0) {
                        i5 = C3605.f11069 | C3534.f10998;
                        i6 = 1748166;
                        iM6048 = i5 + i6;
                    } else {
                        C3590.f11054 = 87;
                        str2 = "ۡۧۦ";
                        iM6048 = C3686.m6609(str2);
                    }
                    break;
                case 1749641:
                    if (C3563.m5967() < 0) {
                        iM6048 = (C3607.f11071 * C3621.f11084) + 2083754;
                        unhook = null;
                    } else {
                        unhook = null;
                        str2 = "۠ۦۨ";
                        iM6048 = C3686.m6609(str2);
                    }
                    break;
                case 1751747:
                    i5 = C3561.f11025 / C3639.f11101;
                    i6 = 1752615;
                    iM6048 = i5 + i6;
                    break;
                case 1752614:
                    if (C3542.m5851() < 0) {
                        if (C3529.f10993 / (C3562.f11026 - 9700) != 0) {
                            i5 = C3529.f10993 / C3535.f10999;
                            i6 = 1755621;
                            iM6048 = i5 + i6;
                        } else {
                            str = "ۥۣۤ";
                            iM6048 = C3609.m6189(str);
                        }
                    } else if (C3565.f11029 * C3577.f11041 * (-9579) < 0) {
                        iM6048 = C3682.m6587(str3);
                    } else {
                        C3632.f11095 = 31;
                        iM6048 = C3623.m6250("ۧۡۢ");
                    }
                    break;
                case 1754440:
                    if (C3529.f10993 / (C3562.f11026 - 9700) != 0) {
                    }
                    break;
                case 1755622:
                    if ((C3581.f11045 ^ (C3621.f11084 / (-9372))) < 0) {
                        i5 = C3583.f11047 * C3674.f11140;
                        i6 = 1351196;
                        iM6048 = i5 + i6;
                    } else {
                        C3674.f11140 = 98;
                        iM6048 = C3669.m6528("ۤۧۦ");
                    }
                    break;
            }
            return unhook;
        }
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
    */
    public static String m6468(Object obj) {
        String str;
        String str2;
        String str3;
        int iM6333 = C3640.m6333("۠ۥۦ");
        String str4 = null;
        String str5 = null;
        while (true) {
            switch (iM6333) {
                case 56447:
                    str5 = ((XC_LoadPackage.LoadPackageParam) obj).packageName;
                    if (C3562.m5961() > 0) {
                        str = "ۥۧۨ";
                        iM6333 = C3591.m6099(str);
                    } else {
                        C3637.f11099 = 95;
                        iM6333 = C3587.m6085("ۨ۟ۢ");
                    }
                    break;
                case 56510:
                case 1751557:
                    if (C3662.f11125 * (C3651.f11113 / (-3676)) == 0) {
                        str2 = "ۣۢۨ";
                        iM6333 = C3542.m5854(str2);
                    } else {
                        iM6333 = C3562.m5962("ۣۣۡ");
                    }
                    break;
                case 56537:
                    str = "ۣۧۨ";
                    if (C3569.m5998() <= 0) {
                        C3574.m6023();
                    }
                    iM6333 = C3591.m6099(str);
                    break;
                case 1747841:
                    if (C3559.m5945() >= 0) {
                        str3 = "ۣۤ";
                    } else if (C3699.f11165 <= 0) {
                        iM6333 = (C3611.f11075 - C3568.f11032) + 55173;
                    } else {
                        C3557.m5938();
                        str3 = "ۥۣۥ";
                    }
                    iM6333 = C3557.m5936(str3);
                    break;
                case 1749853:
                    break;
                case 1750656:
                    if (C3588.f11052 + (C3698.f11164 - 5893) >= 0) {
                        C3652.m6394();
                        str2 = "ۡۦۦ";
                    } else {
                        str2 = "۠ۥۦ";
                    }
                    iM6333 = C3542.m5854(str2);
                    break;
                case 1752710:
                    iM6333 = C3534.f10998 + (C3689.f11155 / 7533) >= 0 ? C3678.m6569("ۦۤۦ") : (C3566.f11030 | C3545.f11009) + 1749857;
                    str4 = str5;
                    break;
                case 1753576:
                    if (C3699.f11165 <= 0) {
                    }
                    break;
                case 1754508:
                    iM6333 = (C3581.f11045 | C3600.f11064) + 1755852;
                    str4 = null;
                    break;
                case 1755339:
                    iM6333 = (C3637.f11099 - C3685.f11151) ^ 56645;
                    break;
            }
            return str4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX INFO: renamed from: ۟ۦۦۧۥ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6469(Object obj) {
        int iM5800 = C3532.m5800("ۧۨ");
        while (true) {
            String str = "ۥۥۥ";
            switch (iM5800) {
                case 56545:
                    iM5800 = C3640.m6332() <= 0 ? C3694.m6646(C3683.f11149 > 0 ? "ۡۧۦ" : "ۦۤۨ") : C3574.m6023() <= 0 ? C3555.m5929("ۥۥۥ") : C3644.m6353("ۣۨۦ");
                    break;
                case 1749672:
                    str = C3676.m6561() <= 0 ? "ۨۦۢ" : "ۧۨ";
                    iM5800 = C3594.m6111(str);
                    break;
                case 1750817:
                    XposedBridge.log((String) obj);
                    if (C3644.m6352() < 0) {
                        iM5800 = C3666.m6513(str);
                    } else {
                        C3616.f11079 = 34;
                        iM5800 = C3668.m6522("ۣۨۦ");
                    }
                    break;
                case 1752645:
                    break;
                case 1753543:
                case 1753603:
                    if (C3588.f11052 / (C3653.f11115 - 4730) == 0) {
                        iM5800 = C3594.m6111(str);
                    } else {
                        C3603.f11067 = 10;
                        str = "ۥۤۢ";
                        iM5800 = C3666.m6513(str);
                    }
                    break;
                case 1753578:
                    if (C3688.f11154 >= 0) {
                        C3557.m5938();
                        iM5800 = C3671.m6535("ۦۣۤ");
                    } else {
                        iM5800 = C3547.f11011 + C3559.f11023 + 1755226;
                    }
                    break;
                case 1755399:
                    break;
            }
            return;
        }
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
    */
    public static IXposedHookZygoteInit.StartupParam m6471(Object obj) {
        int i5;
        int i6;
        String str;
        int iM6611 = C3687.m6611("ۣ۟۠");
        IXposedHookZygoteInit.StartupParam startupParam = null;
        while (true) {
            IXposedHookZygoteInit.StartupParam startupParam2 = startupParam;
            while (true) {
                switch (iM6611) {
                    case 56444:
                    case 1754625:
                        if (C3638.f11100 * (C3631.f11094 - 999) < 0) {
                            i5 = C3599.f11063 * C3528.f10992;
                            i6 = 1606538;
                            iM6611 = i5 + i6;
                        } else {
                            C3690.f11156 = 18;
                            iM6611 = C3686.m6609("۟ۢۦ");
                        }
                        break;
                    case 56477:
                        if (C3569.f11033 % (C3696.f11162 * 7725) <= 0) {
                            i5 = C3607.f11071 | C3703.f11169;
                            i6 = 1750816;
                            iM6611 = i5 + i6;
                        } else {
                            C3626.m6262();
                            iM6611 = C3692.m6637("ۧۢ۠");
                        }
                        break;
                    case 1748895:
                        if ((C3671.f11137 ^ (C3635.f7294 ^ 1166)) > 0) {
                            iM6611 = C3647.m6368("ۤ۠");
                        } else {
                            str = "ۧۡۢ";
                            iM6611 = C3653.m6398(str);
                        }
                        break;
                    case 1749578:
                        iM6611 = C3567.m5983() <= 0 ? C3528.m5782("ۥۢ") : (C3695.f11161 | C3594.f11058) + 1754414;
                        break;
                    case 1750532:
                        if (C3536.m5825() > 0) {
                            str = "ۧ۠ۡ";
                            iM6611 = C3653.m6398(str);
                            break;
                        } else if (C3569.f11033 % (C3696.f11162 * 7725) <= 0) {
                        }
                        break;
                    case 1750783:
                        if (C3643.m6350() < 0) {
                            str = "ۧۡۢ";
                            iM6611 = C3653.m6398(str);
                        } else {
                            C3632.f11095 = 31;
                            iM6611 = C3576.m6034("ۡۨۦ");
                        }
                        break;
                    case 1751620:
                        iM6611 = (C3546.f11010 / C3550.f11014) ^ 1750534;
                        break;
                    case 1754408:
                        startupParam = ((MainHook) obj).startupParam;
                        if (C3629.f11092 * (C3633.f11096 ^ 1955) <= 0) {
                            C3588.f11052 = 71;
                            iM6611 = C3628.m6275("ۧۧۡ");
                        } else {
                            iM6611 = C3629.m6280("ۢ۟ۧ");
                        }
                        break;
                    case 1754413:
                        break;
                    case 1754440:
                        if (C3654.f8276 * (C3548.f11012 ^ (-4998)) > 0) {
                            startupParam2 = null;
                            iM6611 = C3576.m6034("ۡۨۦ");
                        } else {
                            C3660.m6433();
                            iM6611 = C3611.m6199("ۣۣۧ");
                            startupParam2 = null;
                        }
                        break;
                }
                return startupParam2;
            }
        }
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
    */
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        IXposedHookZygoteInit.StartupParam startupParam;
        EnumC0272i enumC0272i;
        XC_MethodHook.Unhook unhook;
        int i5;
        ArrayList arrayList;
        Object[] objArr;
        String str;
        String str2;
        String str3;
        int iM6587;
        int i6;
        int i7;
        int i8;
        int i9;
        Object[] objArr2;
        int i10;
        IXposedHookZygoteInit.StartupParam startupParamM6471;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM6261;
        int i15;
        int i16;
        int i17;
        int i18;
        String str4;
        int iM6253;
        int iM5982 = C3566.m5982("ۢ۠ۧ");
        int i19 = 0;
        int iM5826 = 0;
        Object[] objArrM6661 = null;
        String strM6468 = null;
        String strM5823 = null;
        String strM64682 = null;
        Method methodM6022 = null;
        String strM6024 = null;
        String strM6466 = null;
        XC_MethodHook.Unhook unhookM6465 = null;
        String strM6346 = null;
        String strM6224 = null;
        StringBuilder sbM5796 = null;
        IXposedHookZygoteInit.StartupParam startupParam2 = null;
        EnumC0272i enumC0272iM5907 = null;
        String str5 = null;
        EnumC0272i enumC0272iM6020 = null;
        EnumC0272i enumC0272iM6340 = null;
        ArrayList arrayList2 = null;
        C3492b c3492b = null;
        String strM6467 = null;
        String strM64662 = null;
        String strM64683 = null;
        C3492b c3492b2 = null;
        IXposedHookZygoteInit.StartupParam startupParamM64712 = null;
        while (true) {
            String str6 = "ۥۦ";
            String str7 = "ۧۥۦ";
            String str8 = "ۧۤ۟";
            StringBuilder sb = sbM5796;
            switch (iM5982) {
                case 56320:
                    throw new IllegalStateException(C3533.m5808(C3598.m6129(m6472(), 261, C3539.f11003 ^ (-883), 3006), strM6468));
                case 56389:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    str = strM64662;
                    str2 = strM64683;
                    StringBuilder sbM57962 = C3531.m5796(strM5823, str, C3536.m5823(m6472(), 80, C3560.f11024 ^ (-78), 893), str2, strM6024);
                    str3 = strM6467;
                    C3686.m6607(sbM57962, str3);
                    m6469(C3563.m5966(sbM57962));
                    if (C3614.m6209() >= 0) {
                        C3603.m6156();
                        iM5982 = C3700.m6674("۠ۡ۠");
                    } else {
                        iM5982 = C3619.m6232("ۡۡ۠");
                    }
                    strM64662 = str;
                    strM64683 = str2;
                    strM6467 = str3;
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 56481:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    Method methodM60222 = C3574.m6022((C0243c) C3630.m6281(C3696.m6655(c3492b2)));
                    C3661.m6434(methodM60222, strM6346);
                    C3534.m5816(m6465(methodM60222, new C0286b(null, null, new C0071l(C3617.f11080 ^ (-698)))), strM6224);
                    iM5982 = C3695.m6652(str8);
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1746687:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    C3667.m6517();
                    C3492b c3492bM6240 = C3621.m6240(C3684.m6597(C3685.m6602(Instrumentation.class)));
                    c3492bM6240.f10965b = C3533.m5807(m6472(), 195, C3583.f11047 ^ 494, 2648);
                    if ((C3545.f11009 | (C3688.f11154 + 9903)) >= 0) {
                        C3599.m6134();
                        iM6587 = C3682.m6587("ۧۤ۟");
                    } else {
                        iM6587 = (C3547.f11011 ^ C3544.f11008) ^ (-1748580);
                    }
                    c3492b = c3492bM6240;
                    iM5982 = iM6587;
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1746789:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    m6469(C3563.m5966(sb));
                    if (C3541.m5848() <= 0) {
                        i19 = Integer.parseInt(C3705.m6697("WleBVGJhy5tA"));
                        iM5982 = (C3674.f11140 - C3612.f11076) + 1751296;
                        objArrM6661 = objArr;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    if ((C3694.f11160 | (C3661.f11124 % 5187)) <= 0) {
                        str4 = "ۣ۟۠";
                        iM5982 = C3616.m6218(str4);
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    } else {
                        C3539.f11003 = 2;
                        str8 = "ۥۤۢ";
                        iM5982 = C3695.m6652(str8);
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1746812:
                    return;
                case 1746905:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    if ((C3689.f11155 | (C3635.f7294 * (-6117))) < 0) {
                        i6 = C3651.f11113 / C3704.f11170;
                        i7 = 1749618;
                        iM5982 = i6 + i7;
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    } else {
                        C3678.m6567();
                        iM5982 = C3556.m5934("ۣ۟ۡ");
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1746913:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    String strM6470 = m6470(startupParam);
                    C3534.m5816(strM6470, C3672.m6541(m6472(), 127, C3694.f11160 ^ 886, 2071));
                    iM6587 = C3643.f11105 >= 0 ? C3654.m6402("ۣۨ۠") : C3659.m6428("۠ۡ۠");
                    str5 = strM6470;
                    iM5982 = iM6587;
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1747687:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    C0274k.f883c = enumC0272i;
                    AbstractC1785a.f6098d = str5;
                    AbstractC1785a.f6099e = strM6468;
                    if (C3554.m5926() >= 0) {
                        C3544.f11008 = 5;
                        iM5982 = C3698.m6666("ۡۨۥ");
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    iM5982 = C3664.m6504("۟۟۟");
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1747711:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    if (1798731778015L < C3579.m6047()) {
                        i8 = C3663.f11129 / C3705.f11171;
                        i9 = 1755370;
                    } else {
                        i8 = C3612.f11076 % C3679.f11145;
                        i9 = -1753868;
                    }
                    iM5982 = i8 ^ i9;
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1747715:
                case 1749823:
                    unhook = unhookM6465;
                    arrayList = arrayList2;
                    iM5982 = (C3531.f10995 / C3642.f11104) ^ 1755371;
                    objArrM6661 = objArrM6661;
                    sbM5796 = sb;
                    startupParam2 = startupParam2;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1747810:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    if (C3546.f11010 < 0) {
                        C3588.m6086();
                        iM5982 = C3595.m6117("ۡۨ۟");
                    } else {
                        iM5982 = C3624.m6253("ۨۢۨ");
                    }
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1747870:
                    throw null;
                case 1748672:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    C3571.m6008();
                    strM6468 = m6468(loadPackageParam);
                    C3534.m5816(strM6468, C3668.m6523(m6472(), 107, C3627.f11090 ^ (-974), 2871));
                    if (C3615.f6412 > 0) {
                        i6 = C3650.f11112 - C3690.f11156;
                        i7 = 1748080;
                        iM5982 = i6 + i7;
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    } else {
                        iM5982 = C3567.m5984("۟ۢۨ");
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1748711:
                    unhook = unhookM6465;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr2 = objArrM6661;
                    i10 = i19;
                    C3534.m5816(C3638.m6319(m6464(loadPackageParam)), C3684.m6593(m6472(), 118, C3681.f11147 ^ (-656), 1455));
                    startupParamM6471 = m6471(this);
                    if (startupParamM6471 != null) {
                        iM6261 = C3675.f11141 >= 0 ? C3625.m6261(str6) : C3535.m5820("۟ۦۨ");
                        startupParam2 = startupParamM6471;
                        iM5982 = iM6261;
                        objArrM6661 = objArr2;
                        i19 = i10;
                        sbM5796 = sb;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    iM6261 = (C3653.f11115 ^ C3569.f11033) + 1750690;
                    startupParam2 = startupParamM6471;
                    iM5982 = iM6261;
                    objArrM6661 = objArr2;
                    i19 = i10;
                    sbM5796 = sb;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1748735:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    Object[] objArr3 = new Object[1];
                    objArr3[C3641.f11103 ^ (-766)] = Application.class;
                    objArrM6661 = C3697.m6661(objArr3, 1);
                    if (C3548.f11012 * C3578.f11042 * 9437 > 0) {
                        i11 = C3697.f11163 | C3671.f11137;
                        i12 = -1753444;
                        iM5982 = i11 ^ i12;
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    }
                    iM5982 = C3561.m5955("ۨ۠۟");
                    arrayList2 = arrayList;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    unhookM6465 = unhook;
                    break;
                case 1748858:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    if (C3574.m6023() <= 0) {
                        i13 = C3639.f11101 ^ C3665.f11131;
                        i14 = 1753347;
                        iM5982 = i13 + i14;
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        C3543.f11007 = 91;
                        str7 = "ۦۢ";
                        enumC0272iM5907 = enumC0272i;
                        iM5982 = C3564.m5973(str7);
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1748893:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    startupParamM64712 = m6471(this);
                    strM6024 = C3574.m6024(m6472(), 43, 1, 3003);
                    strM5823 = C3536.m5823(m6472(), 44, 1, 731);
                    if (C3586.f11050 - (C3599.f11063 | (-7473)) <= 0) {
                        C3655.m6406();
                        iM5982 = C3650.m6382("ۨۢۨ");
                    } else {
                        iM5982 = C3561.m5955("ۨ۠۟");
                    }
                    arrayList2 = arrayList;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    unhookM6465 = unhook;
                    break;
                case 1748894:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    ArrayList arrayList3 = arrayList2;
                    iM5982 = C3671.f11137 + (C3643.f11105 + 7271) <= 0 ? C3529.m5785("ۣ۟ۢ") : C3556.f11020 + C3652.f11114 + 1747708;
                    arrayList2 = arrayList3;
                    enumC0272iM5907 = enumC0272iM6020;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    unhookM6465 = unhook;
                    break;
                case 1749579:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    if (C3659.f11122 + C3624.f11087 + 1131 > 0) {
                        i11 = C3695.f11161 + C3670.f11136;
                        i12 = -1748921;
                        iM5982 = i11 ^ i12;
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        C3677.m6563();
                        iM5982 = C3647.m6368("ۧۥۦ");
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1749603:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    arrayList = arrayList2;
                    if (C3579.f11043 < 0) {
                        enumC0272iM5907 = enumC0272iM6340;
                        iM5982 = C3564.m5973(str7);
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        unhookM6465 = unhook;
                    } else {
                        C3641.f11103 = 76;
                        iM5982 = C3530.m5789("ۦۦۨ");
                        arrayList2 = arrayList;
                        enumC0272iM5907 = enumC0272iM6340;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1749609:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    C3661.m6434(loadPackageParam, C3536.m5823(m6472(), 36, C3584.f11048 ^ (-304), 957));
                    if (!m6473(this, loadPackageParam)) {
                        if (C3605.f11069 - (C3659.f11122 | (-5915)) > 0) {
                            iM5982 = C3625.m6261("ۢ۟ۨ");
                            arrayList2 = arrayList;
                            sbM5796 = sb;
                            startupParam2 = startupParam;
                            enumC0272iM5907 = enumC0272i;
                            unhookM6465 = unhook;
                        } else {
                            C3591.m6100();
                            str6 = "ۧۡۤ";
                            iM5982 = C3591.m6099(str6);
                            arrayList2 = arrayList;
                            sbM5796 = sb;
                            startupParam2 = startupParam;
                            enumC0272iM5907 = enumC0272i;
                            unhookM6465 = unhook;
                        }
                    }
                    if ((C3630.f11093 | C3546.f11010 | (-7907)) >= 0) {
                        i11 = C3664.f11130 ^ C3627.f11090;
                        i12 = -1748466;
                        iM5982 = i11 ^ i12;
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        C3625.f11088 = 84;
                        str4 = "ۢۧۡ";
                        objArr = objArrM6661;
                        i5 = i19;
                        iM5982 = C3616.m6218(str4);
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1749824:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    if (C3654.f8276 < 0) {
                        i13 = C3626.f11089 | C3644.f11106;
                        i14 = 1754555;
                        iM5982 = i13 + i14;
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        objArr2 = objArrM6661;
                        i10 = i19;
                        startupParamM6471 = startupParam;
                        startupParam2 = startupParamM6471;
                        iM5982 = iM6261;
                        objArrM6661 = objArr2;
                        i19 = i10;
                        sbM5796 = sb;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1749849:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    if (C3580.m6050(strM6468, C3595.m6119(m6472(), 181, C3681.f11147 ^ (-649), 1051))) {
                        enumC0272iM6020 = C3574.m6020();
                        objArr = objArrM6661;
                        i5 = i19;
                        iM5982 = C3698.m6666("ۡۨۥ");
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    str7 = "۠۠";
                    enumC0272iM5907 = enumC0272i;
                    iM5982 = C3564.m5973(str7);
                    arrayList2 = arrayList;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    unhookM6465 = unhook;
                    break;
                case 1750534:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    str7 = "۠۠";
                    enumC0272iM5907 = enumC0272i;
                    iM5982 = C3564.m5973(str7);
                    arrayList2 = arrayList;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    unhookM6465 = unhook;
                    break;
                case 1750723:
                    unhook = unhookM6465;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr2 = objArrM6661;
                    i10 = i19;
                    startupParamM6471 = startupParam2;
                    iM6261 = (C3653.f11115 ^ C3569.f11033) + 1750690;
                    startupParam2 = startupParamM6471;
                    iM5982 = iM6261;
                    objArrM6661 = objArr2;
                    i19 = i10;
                    sbM5796 = sb;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1751554:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    C3636.m6311(arrayList, C3577.m6036(objArrM6661));
                    methodM6022 = C3574.m6022((C0243c) C3630.m6281(C3696.m6655(c3492b)));
                    strM6346 = C3643.m6346(m6472(), 232, C3659.f11122 ^ (-738), 979);
                    if ((C3622.f11085 ^ (C3593.f11057 / 6186)) < 0) {
                        i13 = C3535.f10999 / C3624.f11087;
                        i14 = 1753479;
                        iM5982 = i13 + i14;
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        iM5982 = C3694.m6646("ۦ۟ۡ");
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1751558:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    String strM64672 = m6467(loadPackageParam);
                    sbM5796 = C3531.m5796(strM5823, strM6466, C3652.m6392(m6472(), 45, C3553.f11017 ^ 1003, 824), strM64682, strM6024);
                    C3686.m6607(sbM5796, strM64672);
                    if (C3676.f11142 <= 0) {
                        C3536.m5825();
                        iM5982 = C3596.m6124("ۨۥ۟");
                    } else {
                        iM5982 = (C3616.f11079 + C3528.f10992) ^ (-1746354);
                    }
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    unhookM6465 = unhook;
                    break;
                case 1751678:
                    unhook = unhookM6465;
                    enumC0272i = enumC0272iM5907;
                    C3702.m6683(C3602.m6152(m6472(), 301, C3581.f11045 ^ (-542), 1876));
                    str6 = "۠ۦۤ";
                    i10 = i19;
                    arrayList = arrayList2;
                    startupParamM6471 = startupParam2;
                    objArr2 = objArrM6661;
                    startupParam2 = startupParamM6471;
                    iM5982 = iM6261;
                    objArrM6661 = objArr2;
                    i19 = i10;
                    sbM5796 = sb;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1752609:
                case 1755436:
                case 1755522:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    if (C3550.m5902() < 0) {
                        i15 = C3556.f11020 | C3644.f11106;
                        i16 = -1747288;
                        iM5982 = i15 ^ i16;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        iM5982 = C3564.m5973("۠ۡ");
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1752642:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    strM64662 = m6466(this);
                    strM64683 = m6468(loadPackageParam);
                    strM6467 = m6467(loadPackageParam);
                    if (C3572.f11036 % (C3543.f11007 ^ (-6651)) < 0) {
                        i15 = C3609.f11073 / C3589.f11053;
                        i16 = 56389;
                        iM5982 = i15 ^ i16;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        C3566.m5979();
                        iM5982 = C3545.m5870("ۣۥۥ");
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1752644:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    i17 = C3607.f11071 ^ C3662.f11125;
                    i18 = 1749770;
                    iM5982 = i17 + i18;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    unhookM6465 = unhook;
                    break;
                case 1752735:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    System.out.println(i19);
                    if (C3688.m6617() > 0) {
                        i17 = C3593.f11057 + C3666.f11132;
                        i18 = 1746817;
                        iM5982 = i17 + i18;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        C3533.f10997 = 97;
                        iM5982 = C3602.m6149("ۡۢۨ");
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1753416:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    i5 = i19;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    if ((C3694.f11160 | (C3661.f11124 % 5187)) <= 0) {
                    }
                    break;
                case 1753479:
                    startupParam = startupParam2;
                    C3661.m6434(methodM6022, strM6346);
                    unhookM6465 = m6465(methodM6022, new C0286b(null, null, new C0071l(C3589.f11053 ^ 691)));
                    strM6224 = C3617.m6224(m6472(), 238, C3703.f11169 ^ (-176), 1756);
                    iM5982 = C3667.m6518("ۧۨۦ");
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    break;
                case 1753571:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    ArrayList arrayListM5822 = C3536.m5822(c3492b);
                    C3661.m6434(arrayListM5822, C3662.m6439(m6472(), 218, C3566.f11030 ^ 546, 978));
                    C3661.m6434(objArrM6661, C3624.m6254(m6472(), 224, C3629.f11092 ^ 620, 2289));
                    if (C3529.f10993 * (C3562.f11026 + 9845) >= 0) {
                        C3630.m6284();
                        iM6253 = C3624.m6253("ۢۧۤ");
                    } else {
                        iM6253 = (C3651.f11113 * C3567.f11031) + 2344212;
                    }
                    arrayList2 = arrayListM5822;
                    iM5982 = iM6253;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    unhookM6465 = unhook;
                    break;
                case 1753640:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    iM5826 = C3536.m5826(strM6468);
                    if (iM5826 != -973170826) {
                        if (iM5826 == 313184810) {
                            i5 = i19;
                            arrayList = arrayList2;
                            objArr = objArrM6661;
                            if (C3546.f11010 < 0) {
                            }
                            objArrM6661 = objArr;
                            i19 = i5;
                            sbM5796 = sb;
                            startupParam2 = startupParam;
                            enumC0272iM5907 = enumC0272i;
                            arrayList2 = arrayList;
                            unhookM6465 = unhook;
                        } else if (C3617.f11080 * (C3558.f11022 ^ (-7266)) > 0) {
                            i15 = C3548.f11012 + C3602.f11066;
                            i16 = 1754723;
                            iM5982 = i15 ^ i16;
                            sbM5796 = sb;
                            startupParam2 = startupParam;
                            enumC0272iM5907 = enumC0272i;
                            unhookM6465 = unhook;
                        } else {
                            iM5982 = C3695.m6652("ۥۥۢ");
                            sbM5796 = sb;
                            startupParam2 = startupParam;
                            enumC0272iM5907 = enumC0272i;
                            unhookM6465 = unhook;
                        }
                    }
                    i17 = C3607.f11071 ^ C3662.f11125;
                    i18 = 1749770;
                    iM5982 = i17 + i18;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    unhookM6465 = unhook;
                    break;
                case 1754442:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    i5 = i19;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    i8 = C3612.f11076 % C3679.f11145;
                    i9 = -1753868;
                    iM5982 = i8 ^ i9;
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
                case 1754507:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    if (iM5826 == 361910168 && C3580.m6050(strM6468, C3570.m6003(m6472(), 137, C3583.f11047 ^ 493, 344))) {
                        enumC0272iM6340 = C3642.m6340();
                        if (C3581.f11045 < 0) {
                            i17 = C3643.f11105 % C3628.f11091;
                            i18 = 1749731;
                            iM5982 = i17 + i18;
                            sbM5796 = sb;
                            startupParam2 = startupParam;
                            enumC0272iM5907 = enumC0272i;
                            unhookM6465 = unhook;
                        } else {
                            C3561.f11025 = 78;
                            i5 = i19;
                            arrayList = arrayList2;
                            str3 = strM6467;
                            str2 = strM64683;
                            objArr = objArrM6661;
                            str = strM64662;
                            iM5982 = C3619.m6232("ۡۡ۠");
                            strM64662 = str;
                            strM64683 = str2;
                            strM6467 = str3;
                            objArrM6661 = objArr;
                            i19 = i5;
                            sbM5796 = sb;
                            startupParam2 = startupParam;
                            enumC0272iM5907 = enumC0272i;
                            arrayList2 = arrayList;
                            unhookM6465 = unhook;
                        }
                    }
                    arrayList = arrayList2;
                    str7 = "۠۠";
                    enumC0272iM5907 = enumC0272i;
                    iM5982 = C3564.m5973(str7);
                    arrayList2 = arrayList;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    unhookM6465 = unhook;
                    break;
                case 1754530:
                    return;
                case 1754536:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    if ((C3630.f11093 | C3546.f11010 | (-7907)) >= 0) {
                    }
                    break;
                case 1754568:
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    if (C3614.f11078 + (C3653.f11115 | (-8314)) >= 0) {
                        C3606.f11070 = 54;
                        iM5982 = C3550.m5904("ۡۨۤ");
                    } else {
                        iM5982 = C3583.m6067("ۥۤ۠");
                    }
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    unhookM6465 = unhook;
                    break;
                case 1754661:
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    C3534.m5816(unhookM6465, strM6224);
                    C3492b c3492bM62402 = C3621.m6240(C3684.m6597(C3685.m6602(Activity.class)));
                    unhook = unhookM6465;
                    c3492bM62402.f10965b = C3610.m6192(m6472(), 253, C3683.f11149 ^ 397, 2224);
                    c3492b2 = c3492bM62402;
                    if (C3588.f11052 + (C3536.f11000 % (-2364)) > 0) {
                        arrayList = arrayList2;
                        iM5982 = C3591.m6099(str6);
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        unhookM6465 = unhook;
                    } else {
                        i5 = i19;
                        arrayList = arrayList2;
                        objArr = objArrM6661;
                        iM5982 = C3664.m6504("۟۟۟");
                        objArrM6661 = objArr;
                        i19 = i5;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        arrayList2 = arrayList;
                        unhookM6465 = unhook;
                    }
                    break;
                case 1755367:
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    if (startupParamM64712 == null) {
                        strM6466 = m6466(this);
                        strM64682 = m6468(loadPackageParam);
                        if (C3558.m5942() >= 0) {
                            C3625.f11088 = 78;
                            iM5982 = C3616.m6218("ۤۥ۟");
                        } else {
                            iM5982 = C3572.m6011("ۣۤۡ");
                        }
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        enumC0272iM5907 = enumC0272i;
                        break;
                    } else {
                        unhook = unhookM6465;
                        arrayList = arrayList2;
                        if (C3574.m6023() <= 0) {
                        }
                    }
                    break;
                case 1755371:
                    return;
                case 1755438:
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    if (!C3580.m6050(strM6468, C3573.m6016(m6472(), 157, C3664.f11130 ^ 434, 1666))) {
                        unhook = unhookM6465;
                        arrayList = arrayList2;
                        str7 = "۠۠";
                        enumC0272iM5907 = enumC0272i;
                        iM5982 = C3564.m5973(str7);
                        arrayList2 = arrayList;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                        unhookM6465 = unhook;
                    } else {
                        enumC0272iM5907 = C3551.m5907();
                        iM5982 = (C3682.f11148 ^ C3610.f11074) + 1750006;
                        sbM5796 = sb;
                        startupParam2 = startupParam;
                    }
                    break;
                default:
                    i5 = i19;
                    unhook = unhookM6465;
                    startupParam = startupParam2;
                    enumC0272i = enumC0272iM5907;
                    arrayList = arrayList2;
                    objArr = objArrM6661;
                    objArrM6661 = objArr;
                    i19 = i5;
                    sbM5796 = sb;
                    startupParam2 = startupParam;
                    enumC0272iM5907 = enumC0272i;
                    arrayList2 = arrayList;
                    unhookM6465 = unhook;
                    break;
            }
        }
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
