package me.dartcv.nuke;

import android.support.v4.graphics.drawable.C3602;
import androidx.compose.p134ui.input.pointer.C3604;
import androidx.compose.p134ui.input.pointer.C3605;
import androidx.graphics.path.C3607;
import com.bumptech.glide.C3617;
import p000A.C3527;
import p005A4.C3528;
import p011B4.C3532;
import p014C1.C3533;
import p019D1.C3537;
import p019D1.C3538;
import p022E.C3541;
import p026E3.C3542;
import p031F2.C3543;
import p041H0.C3546;
import p050I3.C3551;
import p054K.C3553;
import p059L0.C3557;
import p063M0.C3559;
import p064M1.C3560;
import p076P.C3563;
import p084Q2.C3566;
import p093S1.C3573;
import p100U.C3575;
import p104U3.C3579;
import p105V.C3580;
import p106V0.C3582;
import p107V1.C3583;
import p111W1.C3585;
import p111W1.C3586;
import p114X.C3588;
import p137b3.C3612;
import p138b4.C3613;
import p139c.C3614;
import p157f.C3623;
import p158f0.C3624;
import p166g3.C3628;
import p166g3.C3629;
import p168h.C3632;
import p169h0.C3634;
import p170h1.C3635;
import p172h3.C3636;
import p172h3.C3637;
import p174i.C3639;
import p178i3.C3642;
import p183j2.C3646;
import p194l1.C3650;
import p196l4.C3651;
import p199m1.C3653;
import p203n.C3659;
import p210o.C3663;
import p214o3.C3668;
import p217p0.C3671;
import p222q0.C3674;
import p223q1.C3676;
import p238t.C3684;
import p243t4.C3685;
import p245u0.C3686;
import p246u1.C3687;
import p246u1.C3688;
import p246u1.C3689;
import p247u2.C3690;
import p248u3.C3691;
import p248u3.C3692;
import p254v4.C3695;
import p259w3.C3697;
import p274z1.C3701;
import p275z2.C3703;

/* JADX INFO: loaded from: classes.dex */
public final class BuildConfig {
    public static final String APPLICATION_ID;
    public static final long BUILD_TIME_STAMP = 1783179778015L;
    public static final String BUILD_TYPE;
    public static final boolean DEBUG = false;
    public static final String NUKE_API_BASE_URL;
    public static final String NUKE_NATIVE_SO_CERT_SHA256;
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f11116short;

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    static {
        int i5;
        int i6;
        int iM6052 = C3580.m6052("ۣۢۡ");
        while (true) {
            String str = "ۨۡ۟";
            switch (iM6052) {
                case 1748677:
                    i5 = C3563.f11027 % C3639.f11101;
                    i6 = 1749427;
                    iM6052 = i5 + i6;
                    break;
                case 1748857:
                    NUKE_API_BASE_URL = C3528.m5781(m6404(), 21, C3663.f11129 ^ 889, 2864);
                    iM6052 = C3557.m5936(str);
                    break;
                case 1749640:
                    APPLICATION_ID = C3543.m5859(m6404(), 0, C3559.f11023 ^ (-610), 753);
                    if (C3586.f11050 - (C3533.f10997 / 9379) > 0) {
                        iM6052 = C3686.m6609("ۣۧ۟");
                    } else {
                        str = "ۤ۟ۡ";
                        iM6052 = C3557.m5936(str);
                    }
                    break;
                case 1749696:
                    f11116short = new short[]{668, 660, 735, 661, 656, 643, 645, 658, 647, 735, 671, 644, 666, 660, 687, 696, 689, 696, 700, 686, 696, 2904, 2884, 2884, 2880, 2883, 2826, 2847, 2847, 2887, 2887, 2887, 2846, 2903, 2885, 2897, 2910, 2903, 2818, 2819, 2819, 2846, 2899, 2911, 2909, 2847, 1091, 1092, 1089, 1045, 1091, 1096, 1094, 1092, 1093, 1090, 1041, 1044, 1094, 1088, 1044, 1093, 1090, 1043, 1088, 1046, 1046, 1090, 1043, 1093, 1091, 1045, 1088, 1094, 1045, 1090, 1043, 1091, 1096, 1093, 1041, 1043, 1094, 1046, 1088, 1091, 1043, 1043, 1046, 1045, 1097, 1093, 1092, 1088, 1092, 1091, 1089, 1097, 1091, 1041, 1088, 1041, 1043, 1044, 1045, 1096, 1044, 1042, 1045, 1092, 3188, 3179, 3189, 3179, 3189};
                    iM6052 = (C3674.f11140 ^ (C3623.f11086 + 9137)) <= 0 ? C3541.m5849("ۣ۠۟") : (C3566.f11030 / C3632.f11095) ^ (-1749641);
                    break;
                case 1750562:
                    VERSION_NAME = C3688.m6618(m6404(), 110, C3650.f11112 ^ 948, 3141);
                    if (C3687.f11153 * (C3551.f11015 | (-2392)) > 0) {
                        i5 = C3542.f11006 / C3575.f11039;
                        i6 = 1751496;
                        iM6052 = i5 + i6;
                    } else {
                        C3541.f11005 = 53;
                        iM6052 = C3659.m6428(str);
                    }
                    break;
                case 1750779:
                    BUILD_TYPE = C3607.m6177(m6404(), 14, C3604.f11068 ^ (-174), 733);
                    str = "ۡۧ۟";
                    iM6052 = C3659.m6428(str);
                    break;
                case 1751494:
                    break;
                case 1755398:
                    NUKE_NATIVE_SO_CERT_SHA256 = C3563.m5968(m6404(), 46, C3583.f11047 ^ 441, 1136);
                    i5 = C3527.f10991 / C3685.f11151;
                    i6 = 1750561;
                    iM6052 = i5 + i6;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BuildConfig() {
        int i5;
        int i6;
        int i7;
        int i8;
        int iM6027 = C3575.m6027("ۤۤۥ");
        Long lDecode = null;
        while (true) {
            switch (iM6027) {
                case 1747682:
                    i5 = C3586.f11050 % C3657.f11120;
                    i6 = 1751630;
                    iM6027 = i5 ^ i6;
                    break;
                case 1747776:
                    break;
                case 1749765:
                    System.out.println(lDecode);
                    if ((C3588.f11052 ^ (C3537.f11001 / 6337)) < 0) {
                        i7 = C3635.f7294 % C3637.f11099;
                        i8 = 1747670;
                        iM6027 = i7 + i8;
                    } else {
                        C3646.f11108 = 72;
                        iM6027 = C3573.m6018("ۧ۟ۤ");
                    }
                    break;
                case 1751653:
                    if (C3692.m6638() <= 0) {
                        i5 = C3612.f11076 | C3636.f11098;
                        i6 = -1753347;
                        iM6027 = i5 ^ i6;
                    } else if (C3585.f11049 / (C3617.f11080 ^ 9368) != 0) {
                        i7 = C3668.f11134 | C3628.f11091;
                        i8 = 1746829;
                        iM6027 = i7 + i8;
                    } else {
                        iM6027 = C3671.m6535("ۤۧۤ");
                    }
                    break;
                case 1753482:
                    lDecode = Long.decode(C3538.m5833("9aW9J4TM8hgu2Qrdk1o"));
                    if (C3532.f10996 >= 0) {
                        C3553.m5916();
                    }
                    iM6027 = C3579.m6048("ۢۥۨ");
                    break;
                case 1754380:
                    if (C3585.f11049 / (C3617.f11080 ^ 9368) != 0) {
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0076 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۣۧۡۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static short[] m6404() {
        String str;
        int i5;
        int i6;
        int iM6163 = C3605.m6163("ۤۢۦ");
        short[] sArr = null;
        while (true) {
            short[] sArr2 = sArr;
            while (true) {
                switch (iM6163) {
                    case 1746909:
                        str = "ۦۨ۠";
                        iM6163 = C3543.m5858(str);
                        break;
                    case 1748647:
                        if (C3684.f11150 < 0) {
                            i5 = C3532.f10996 ^ C3695.f11161;
                            i6 = 1751084;
                            iM6163 = i5 + i6;
                        } else {
                            C3689.f11155 = 53;
                            str = "ۣۧۡ";
                            iM6163 = C3543.m5858(str);
                        }
                        break;
                    case 1750688:
                        iM6163 = C3579.m6049() <= 0 ? C3573.m6018("ۥۢۧ") : (C3533.f10997 % C3617.f11080) + 1753740;
                        break;
                    case 1750755:
                    case 1752554:
                        if (C3623.f11086 < 0) {
                            i5 = C3617.f11080 ^ C3602.f11066;
                            i6 = 1753937;
                            iM6163 = i5 + i6;
                        } else {
                            C3688.m6617();
                            iM6163 = C3623.m6250("ۨۤۦ");
                        }
                        break;
                    case 1751592:
                        if (C3676.m6561() < 0) {
                            if (C3642.f11104 % (C3582.f11046 + 2736) <= 0) {
                                i5 = C3701.f11167 * C3634.f11097;
                                i6 = 1921782;
                                iM6163 = i5 + i6;
                            } else {
                                C3687.m6613();
                                iM6163 = C3629.m6280("ۦۡۤ");
                            }
                        } else if (C3624.f11087 > 0) {
                            i5 = C3697.f11163 | C3690.f11156;
                            i6 = 1754576;
                            iM6163 = i5 + i6;
                        } else {
                            C3617.m6220();
                            iM6163 = C3691.m6635("ۤۢۦ");
                        }
                        break;
                    case 1752741:
                        if (C3642.f11104 % (C3582.f11046 + 2736) <= 0) {
                        }
                        break;
                    case 1753694:
                        iM6163 = (C3651.f11113 ^ C3703.f11169) + 1754591;
                        sArr2 = null;
                        break;
                    case 1753701:
                        break;
                    case 1754443:
                        sArr = f11116short;
                        iM6163 = C3628.m6274() >= 0 ? C3546.m5872("ۥۨۨ") : (C3628.f11091 % C3703.f11169) ^ 1750572;
                        break;
                    case 1755555:
                        if (C3560.f11024 >= 0) {
                            C3614.f11078 = 27;
                            iM6163 = C3653.m6398("ۧۡۥ");
                        } else {
                            iM6163 = C3613.m6204("ۣۦۦ");
                        }
                        break;
                }
                return sArr2;
            }
        }
    }
}
