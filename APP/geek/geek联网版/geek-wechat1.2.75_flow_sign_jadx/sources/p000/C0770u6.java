package p000;

import android.app.Application;
import android.app.C0986;
import android.content.SharedPreferences;
import android.support.v4.graphics.drawable.C0987;
import android.util.Base64;
import android.window.C0988;
import android.window.C0989;
import android.window.C0990;
import android.window.C0991;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.content.C1006;
import androidx.core.content.C1007;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1009;
import androidx.core.graphics.drawable.C1010;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import androidx.legacy.content.C1014;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1028;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import com.ljx.wechatmod.p001ui.C1051;
import io.fastkv.C1052;
import io.fastkv.C1053;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: u6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0770u6 {

    /* JADX INFO: renamed from: a */
    public static final C0770u6 f4638a;

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f4639b;

    /* JADX INFO: renamed from: c */
    public static final int f4640c;

    /* JADX INFO: renamed from: d */
    public static String f4641d;

    /* JADX INFO: renamed from: e */
    public static volatile long f4642e;

    /* JADX INFO: renamed from: f */
    public static final String f4643f;

    /* JADX INFO: renamed from: g */
    public static String f4644g;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    static {
        String str;
        int iM2911 = C1000.m2911("ۢۦۨ");
        while (true) {
            switch (iM2911) {
                case 1746908:
                    f4641d = "";
                    if (C1049.f5696 / (C1018.f5665 + 4660) == 0) {
                        str = "ۡۥۤ";
                        iM2911 = C1054.m3127(str);
                    } else {
                        C1031.f5678 = 31;
                        iM2911 = C1056.m3133("ۧۥۡ");
                    }
                    break;
                case 1746941:
                    f4638a = new C0770u6();
                    if (C1020.m2990() > 0) {
                        iM2911 = (C1042.f5689 | C1051.f5698) + 1747169;
                    } else {
                        C1018.m2982();
                        iM2911 = C1016.m2975("۟ۧۥ");
                    }
                    break;
                case 1747933:
                    f4640c = 10002;
                    if (C0996.f5643 - (C1032.f5679 * (-6107)) < 0) {
                        str = "۟ۦۣ";
                        iM2911 = C1054.m3127(str);
                    } else {
                        C1001.m2916();
                        str = "ۡۥۤ";
                        iM2911 = C1054.m3127(str);
                    }
                    break;
                case 1748800:
                    f4644g = "";
                    iM2911 = C1056.m3133("ۧۥۡ");
                    break;
                case 1748857:
                    iM2911 = (C1007.f5654 | C0987.f5634) + 1748773;
                    break;
                case 1749796:
                    f4643f = b50.m492a("iRtiLBpOteCGNUAfO0+d6f0lGywSdbHohRNkLRJ1zO+JG2IsEEO/7YUDbi8qRZboozptWBdTvP2z\nFhoIBVel74AYQDhgY7verApeCzIXpP2oOGxYN26F/K9rXiAkV7LLi2ESFhgUhJ+VFhoeGHfCl7Iq\nWwBmVrnBgRN/ORZQstqTKmAkMn279KgIHDc1cIDfqD5RICNVm+uPYW4UMR216fE2WFxrYoL/nR1t\nJ2tFkcaUFExYZXCZ7aciXSUSQ9vfqQtdAD1LhJyjKFEfBGychfARTRs2aYbF/WJ/DBZ8p5yVBUQW\nOUWNwe8wZyIlZqXPhWdJKStlo+ycYhghMGyB9u99ZEU2VJvUlgtkCSlTod6jJxMvNxaf2IA8eTg2\nTbiXlWdiHDt8hMWMNx05Z2fEmKZqWTklHMD9jQdjNxpptpe3GW87YmyRxbJgfS1qU7zfvGFGFB1K\ntuqQZh1WPRSOnYs3TzoBcpjpjDwaCDQcntqsN0kWahasmZQQYyhhTrL2tiViKhJ1tew=\n", "xFIrblMk9K4=\n");
                    if (C1029.f5676 - (C1015.f5662 - 119) < 0) {
                        iM2911 = C1016.m2975("۟ۧۥ");
                    } else {
                        C1032.f5679 = 41;
                        iM2911 = C1044.m3085("ۢۦۨ");
                    }
                    break;
                case 1754563:
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m2439a(p000.C0770u6 r17, java.lang.String r18) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0770u6.m2439a(u6, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    /* JADX INFO: renamed from: b */
    public static final boolean m2440b(C0770u6 c0770u6, String str, String str2) {
        Signature signature;
        byte[] bytes;
        boolean z;
        String str3;
        byte[] bArrDecode;
        Object obj;
        byte[] bArr;
        String str4;
        boolean z2 = false;
        byte[] bArr2 = null;
        X509EncodedKeySpec x509EncodedKeySpec = null;
        PublicKey publicKeyGeneratePublic = null;
        Signature signature2 = null;
        byte[] bArr3 = null;
        boolean zVerify = false;
        boolean z3 = false;
        int iM3025 = C1028.m3025("۟ۨ");
        while (true) {
            switch (iM3025) {
                case 56297:
                    c0770u6.getClass();
                    if (C1026.f5673 < 0) {
                        iM3025 = C1052.m3118("ۨ۠");
                    } else {
                        C1023.m3003();
                        bArrDecode = bArr2;
                        obj = "ۦۢۡ";
                        bArr = bArrDecode;
                        bArr2 = bArr;
                        iM3025 = C1052.m3118(obj);
                    }
                    break;
                case 56474:
                    if (C1009.m2948() > 0) {
                        str3 = "ۦۡۡ";
                        z = z2;
                        z3 = zVerify;
                        z2 = z;
                        iM3025 = C1040.m3072(str3);
                    } else {
                        str4 = "ۨ۟ۨ";
                        z3 = zVerify;
                        iM3025 = C1051.m3113(str4);
                    }
                    break;
                case 56568:
                    z = false;
                    if (C1025.f5672 < 0) {
                        z2 = false;
                        iM3025 = C0989.f5636 + C1056.f5703 + 1753801;
                    } else {
                        C1039.f5686 = 70;
                        str3 = "ۣۦۧ";
                        z2 = z;
                        iM3025 = C1040.m3072(str3);
                    }
                    break;
                case 1746689:
                    try {
                        zVerify = signature2.verify(Base64.decode(str2, 0));
                        iM3025 = (C1039.f5686 | C1059.f5706) + 56512;
                    } catch (Exception e) {
                        if (C0988.f5635 >= 0) {
                            z3 = z2;
                            iM3025 = C0993.m2885("ۦۥ۟");
                        } else {
                            z3 = z2;
                            iM3025 = (C0993.f5640 ^ C1059.f5706) + 1750879;
                        }
                    }
                    break;
                case 1746909:
                    signature = Signature.getInstance(b50.m492a("RM0qoaJ52A1j7TnA1g==\n", "F4Vrk5dPr2Q=\n"));
                    if (C1011.f5658 < 0) {
                        bytes = bArr3;
                        signature2 = signature;
                        bArr3 = bytes;
                        iM3025 = C1048.m3101("۠ۢۦ");
                    } else {
                        C0988.f5635 = 78;
                        signature2 = signature;
                        iM3025 = C1031.m3036("ۨ۠۟");
                    }
                    break;
                case 1747684:
                    publicKeyGeneratePublic = KeyFactory.getInstance(b50.m492a("XzEO\n", "DWJPhEm2QlM=\n")).generatePublic(x509EncodedKeySpec);
                    if ((C1028.f5675 | (C1053.f5700 % 221)) < 0) {
                        str4 = "۟ۦۤ";
                        iM3025 = C1051.m3113(str4);
                    } else {
                        iM3025 = C1036.m3057("۟ۨ");
                    }
                    break;
                case 1747748:
                    signature2.initVerify(publicKeyGeneratePublic);
                    iM3025 = C1011.m2955(C1019.m2988() <= 0 ? "۠۠ۤ" : "ۣۦۧ");
                    break;
                case 1748888:
                case 1751492:
                    iM3025 = (C1039.f5686 % C0993.f5640) + 1754044;
                    break;
                case 1750756:
                    bytes = str.getBytes(AbstractC0514n9.f3251a);
                    if (C1004.f5651 + (C1045.f5692 ^ 9763) < 0) {
                        bArr3 = bytes;
                        iM3025 = (C0986.f5633 * C1002.f5649) + 2453713;
                    } else {
                        C1048.f5695 = 8;
                        signature = signature2;
                        signature2 = signature;
                        bArr3 = bytes;
                        iM3025 = C1048.m3101("۠ۢۦ");
                    }
                    break;
                case 1750813:
                    AbstractC0493mp.m1856f(b50.m492a("W1ORtYrodlcUGMvZ2g==\n", "PDbl9/OcEyQ=\n"), bArr3);
                    iM3025 = (C1026.f5673 % C1058.f5705) + 1751843;
                    break;
                case 1751651:
                    signature2.update(bArr3);
                    if (C1002.m2921() >= 0) {
                        C1001.m2916();
                        iM3025 = C1013.m2965("ۣۤۤ");
                    } else {
                        iM3025 = C1011.m2955("۟۟ۡ");
                    }
                    break;
                case 1753478:
                    break;
                case 1753509:
                    X509EncodedKeySpec x509EncodedKeySpec2 = new X509EncodedKeySpec(bArr2);
                    if (C0995.f5642 > 0) {
                        obj = "۠۠ۤ";
                        bArr = bArr2;
                        x509EncodedKeySpec = x509EncodedKeySpec2;
                        bArr2 = bArr;
                        iM3025 = C1052.m3118(obj);
                    } else {
                        x509EncodedKeySpec = x509EncodedKeySpec2;
                        iM3025 = C1012.m2961("ۦۡۡ");
                    }
                    break;
                case 1753600:
                    iM3025 = (C0997.f5644 | C1050.f5697) ^ (-1755246);
                    break;
                case 1755345:
                    bArrDecode = Base64.decode(f4643f, 0);
                    if (C1004.f5651 > 0) {
                        obj = "ۦۢۡ";
                        bArr = bArrDecode;
                        bArr2 = bArr;
                        iM3025 = C1052.m3118(obj);
                    } else {
                        C1001.f5648 = 78;
                        bArr2 = bArrDecode;
                        iM3025 = C1056.m3133("ۨ۠");
                    }
                    break;
                case 1755367:
                    iM3025 = (C1033.f5680 ^ C1013.f5660) + 55319;
                    break;
            }
            return z3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2441c(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0770u6.m2441c(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    /* JADX INFO: renamed from: d */
    public static void m2442d(Application application) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        String str7;
        int iM3101 = C1048.m3101("۠ۥۨ");
        String str8 = null;
        String str9 = null;
        String strM492a = null;
        String string = null;
        String strM492a2 = null;
        String str10 = null;
        while (true) {
            switch (iM3101) {
                case 56512:
                    f4639b = application.getSharedPreferences(b50.m492a("ksN8I/LRhtWgyXYb+sqX4omZ\n", "/6wYfJOk8r0=\n"), 0);
                    iM3101 = (C1048.f5695 ^ C0994.f5641) + 1752843;
                    break;
                case 56570:
                case 1747842:
                case 1753480:
                    if (C1002.m2921() < 0) {
                        iM3101 = (C0991.f5638 - C1056.f5703) ^ 1755587;
                    } else {
                        str6 = "ۣۧۡ";
                        iM3101 = C1024.m3009(str6);
                    }
                    break;
                case 56576:
                    if (C1012.f5659 % (C1033.f5680 * 7191) > 0) {
                        iM3101 = (C0999.f5646 * C1003.f5650) + 1483447;
                    } else {
                        C1051.f5698 = 67;
                        str5 = "ۣ۠ۢ";
                        iM3101 = C1018.m2984(str5);
                    }
                    break;
                case 1746692:
                    iM3101 = (C1024.f5671 - C1028.f5675) + 1753998;
                    break;
                case 1746693:
                    if ((C1040.f5687 ^ (C1004.f5651 ^ (-5930))) <= 0) {
                        str10 = str8;
                        iM3101 = C1017.m2981("ۨۨ");
                    } else {
                        str10 = str8;
                        iM3101 = (C1032.f5679 * C1044.f5691) ^ (-1814283);
                    }
                    break;
                case 1747806:
                    iM3101 = C1053.m3122(C1006.f5653 - (C1002.f5649 ^ (-5424)) >= 0 ? "ۢۤۧ" : "ۢ۟ۥ");
                    break;
                case 1747843:
                    b50.m492a("nzDncgGbLw==\n", "/F+JBmTjW3g=\n");
                    if (C1059.f5706 % (C1033.f5680 | 9179) < 0) {
                        str2 = strM492a2;
                        obj = "ۦۦ";
                        str7 = str2;
                        strM492a2 = str7;
                        iM3101 = C1059.m3145(obj);
                    } else {
                        C1028.m3022();
                        str = "ۦۣۡ";
                        iM3101 = C1059.m3145(str);
                    }
                    break;
                case 1749576:
                    if (C1054.f5701 < 0) {
                        str6 = "ۥۥۨ";
                        strM492a2 = strM492a;
                        iM3101 = C1024.m3009(str6);
                    } else {
                        C1004.m2926();
                        str2 = strM492a;
                        obj = "ۦۦ";
                        str7 = str2;
                        strM492a2 = str7;
                        iM3101 = C1059.m3145(obj);
                    }
                    break;
                case 1749855:
                    str3 = C1008.f5655 + (C1010.f5657 * 4693) >= 0 ? "ۨۢۡ" : "۠ۥۨ";
                    iM3101 = C1018.m2984(str3);
                    break;
                case 1750568:
                    iM3101 = (C0991.f5638 ^ C1016.f5663) + 1756079;
                    break;
                case 1752456:
                    str8 = "";
                    str4 = "ۥۢ۠";
                    iM3101 = C1058.m3140(str4);
                    break;
                case 1752492:
                    if (string != null) {
                        iM3101 = (C1024.f5671 - C1028.f5675) + 1753998;
                    } else if (C0997.f5644 >= 0) {
                        C1003.f5650 = 67;
                        iM3101 = C1051.m3113("ۥۢ۠");
                    } else {
                        iM3101 = (C0996.f5643 * C1023.f5670) + 1755485;
                    }
                    break;
                case 1752547:
                    try {
                        string = application.getSharedPreferences(b50.m492a("uo3cunZGaJu8jMW6b05ZiKuH1/FwRmibvJE=\n", "2eKxlAIjBvg=\n"), 0).getString(b50.m492a("Qtpfm5cTloRHzVGcpjmShFzbWZ+c\n", "LrU48vlM4eE=\n"), "");
                        str5 = "ۥ۠ۧ";
                        iM3101 = C1018.m2984(str5);
                    } catch (Throwable th) {
                        strM492a2 = b50.m492a("1BdXat0v7+XWAVVg\n", "gVkcJJJ4obo=\n");
                        iM3101 = C1012.f5659 <= 0 ? C1029.m3027("ۢ۟ۥ") : C1051.m3113("ۨۢ");
                    }
                    break;
                case 1752612:
                case 1752707:
                    iM3101 = C0990.m2873("ۨۥۦ");
                    break;
                case 1752648:
                    if (C1012.f5659 * (C1025.f5672 ^ (-4378)) > 0) {
                        str5 = "۠ۥۧ";
                        iM3101 = C1018.m2984(str5);
                    } else {
                        C1037.f5684 = 12;
                        iM3101 = C1047.m3096("۠ۥۨ");
                    }
                    break;
                case 1752710:
                    iM3101 = (C1025.f5672 - C1001.f5648) + 1753961;
                    break;
                case 1753416:
                    if (C1035.m3053() > 0) {
                        obj = "ۨۥۦ";
                        str7 = strM492a2;
                        str10 = str9;
                        strM492a2 = str7;
                        iM3101 = C1059.m3145(obj);
                    } else {
                        C1001.f5648 = 1;
                        str10 = str9;
                        iM3101 = C0989.m2867("ۥ۠ۧ");
                    }
                    break;
                case 1753701:
                    if (C1056.f5703 <= 0) {
                        strM492a2 = str10;
                        iM3101 = C1049.m3104("ۦ۟ۡ");
                    } else {
                        strM492a2 = str10;
                        iM3101 = C1006.m2936("ۧۦۤ");
                    }
                    break;
                case 1754530:
                    str3 = "ۦ۟ۡ";
                    str9 = string;
                    iM3101 = C1018.m2984(str3);
                    break;
                case 1754538:
                    break;
                case 1754597:
                    if (C1049.f5696 >= 0) {
                        C1046.m3094();
                        iM3101 = C1043.m763("ۥۣۤ");
                    } else {
                        iM3101 = (C1029.f5676 / C1023.f5670) + 1753479;
                    }
                    break;
                case 1755529:
                    if (str10.length() <= 0) {
                        iM3101 = (C0991.f5638 ^ C1016.f5663) + 1756079;
                    } else if (C0998.f5645 > 0) {
                        str = "ۦۨۧ";
                        iM3101 = C1059.m3145(str);
                    } else {
                        C0999.m2907();
                        iM3101 = C1000.m2911("ۧۦۤ");
                    }
                    break;
                case 1755562:
                    strM492a = b50.m492a("jwXZmtNiqGCNE9uQ\n", "2kuS1Jw15j8=\n");
                    if (C1014.f5661 - (C1054.f5701 ^ 20) <= 0) {
                        C1044.m3086();
                        iM3101 = C0993.m2885("۟۟ۤ");
                    } else {
                        iM3101 = (C1014.f5661 * C1049.f5696) + 1844762;
                    }
                    break;
                case 1755588:
                    f4644g = strM492a2;
                    if (C1024.f5671 > 0) {
                        obj = "ۧۤۧ";
                        str7 = strM492a2;
                        strM492a2 = str7;
                        iM3101 = C1059.m3145(obj);
                    } else {
                        str4 = "ۥۧۥ";
                        iM3101 = C1058.m3140(str4);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008f A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2443e(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0770u6.m2443e(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: f */
    public static Object m2444f(t50 t50Var) {
        return g80.m1182M(AbstractC0929yg.f5431b, new C0733t6(null, 0), t50Var);
    }
}
