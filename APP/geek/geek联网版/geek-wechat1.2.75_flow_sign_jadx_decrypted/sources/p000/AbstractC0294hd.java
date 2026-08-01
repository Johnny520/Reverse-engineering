package p000;

import android.app.C0986;
import android.graphics.Color;
import android.support.v4.graphics.drawable.C0987;
import android.window.C0988;
import android.window.C0990;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0992;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0999;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.content.C1007;
import androidx.core.content.C1008;
import androidx.core.graphics.drawable.C1010;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.appbar.C1021;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1028;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.internal.C1038;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1053;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: hd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0294hd {

    /* JADX INFO: renamed from: a */
    public static final int[] f2217a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    static {
        String str;
        int color;
        String str2;
        int[] iArr;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int[] iArr2 = null;
        int iM3067 = C1039.m3067("ۥۣۨ");
        int color2 = 0;
        int color3 = 0;
        int color4 = 0;
        int color5 = 0;
        int i = 0;
        int color6 = 0;
        int color7 = 0;
        int i2 = 0;
        int color8 = 0;
        int color9 = 0;
        while (true) {
            switch (iM3067) {
                case 56385:
                    color8 = Color.parseColor("#FF8A65");
                    str3 = "ۢ۟۟";
                    iM3067 = C1026.m3015(str3);
                    break;
                case 56448:
                    iArr2[C1013.f5660 ^ 349] = color7;
                    color = i2;
                    iM3067 = C1054.m3127("ۥ۟ۡ");
                    i2 = color;
                    break;
                case 56477:
                    f2217a = iArr2;
                    if ((C1030.f5677 ^ (C1019.f5666 * (-9567))) <= 0) {
                        C1024.m3008();
                        iM3067 = C1050.m3111("ۨۧۡ");
                    } else {
                        iM3067 = (C1035.f5682 ^ C0996.f5643) + 1752574;
                    }
                    break;
                case 56513:
                    color4 = Color.parseColor("#7986CB");
                    if (C1034.f5681 < 0) {
                        iM3067 = C1028.m3025("۠ۦۨ");
                    } else {
                        C0986.m2857();
                        str2 = "ۣۡۨ";
                        iArr = iArr2;
                        iM3067 = C0992.m2881(str2);
                        iArr2 = iArr;
                    }
                    break;
                case 1746875:
                    color2 = Color.parseColor("#4DB6AC");
                    if (C0999.f5646 * (C1038.f5685 - 3298) > 0) {
                        str5 = "ۢ۟ۢ";
                        iM3067 = C1001.m2914(str5);
                    } else {
                        iM3067 = C1038.m3063("۠ۦۨ");
                    }
                    break;
                case 1747834:
                    color5 = Color.parseColor("#FFB74D");
                    if (C1010.m2950() > 0) {
                        str = "ۣۢ";
                        iM3067 = C1058.m3140(str);
                    } else {
                        iM3067 = C0994.m2889("ۦ۠ۦ");
                    }
                    break;
                case 1747871:
                    iArr2[C1002.f5649 ^ (-782)] = i2;
                    iM3067 = C1007.m2938("ۤۤ");
                    break;
                case 1747874:
                    color9 = Color.parseColor("#64B5F6");
                    str = "۠ۨۤ";
                    iM3067 = C1058.m3140(str);
                    break;
                case 1747932:
                    color6 = Color.parseColor("#4DD0E1");
                    if (C1018.f5665 > 0) {
                        str3 = "۟ۥۡ";
                        iM3067 = C1026.m3015(str3);
                    } else {
                        C1034.m3049();
                        str = "۟ۥۡ";
                        iM3067 = C1058.m3140(str);
                    }
                    break;
                case 1748797:
                    color7 = Color.parseColor("#BA68C8");
                    str4 = C1023.f5670 >= 0 ? "ۦۧ" : "ۦۧ";
                    iM3067 = C1047.m3096(str4);
                    break;
                case 1748832:
                    iArr2[C1008.f5655 ^ (-449)] = color9;
                    if (C1008.f5655 < 0) {
                        str4 = "ۤۦ۟";
                        iM3067 = C1047.m3096(str4);
                    } else {
                        iM3067 = C1022.m3001("ۧۧۨ");
                    }
                    break;
                case 1748892:
                    iArr2[C1034.f5681 ^ (-785)] = color8;
                    if (C1007.m2939() < 0) {
                        str6 = "ۥۢ";
                        iM3067 = C1039.m3067(str6);
                    } else {
                        C1001.f5648 = 35;
                        str5 = "ۥ۠ۡ";
                        iM3067 = C1001.m2914(str5);
                    }
                    break;
                case 1749570:
                    iArr = new int[10];
                    if (C1031.m3037() > 0) {
                        str2 = "ۥۨۤ";
                        iM3067 = C0992.m2881(str2);
                        iArr2 = iArr;
                    } else {
                        iM3067 = C1008.m2944("ۣۣۥ");
                        iArr2 = iArr;
                    }
                    break;
                case 1749573:
                    color3 = Color.parseColor("#81C784");
                    if (C0990.f5637 > 0) {
                        str2 = "۠ۥ۟";
                        iArr = iArr2;
                        iM3067 = C0992.m2881(str2);
                        iArr2 = iArr;
                    } else {
                        C1049.f5696 = 89;
                        iM3067 = C0988.m2863("ۤۤ");
                    }
                    break;
                case 1750661:
                    if ((C1020.f5667 ^ (C0995.f5642 / 1786)) < 0) {
                        iM3067 = (C1012.f5659 % C1019.f5666) ^ 1753069;
                    } else {
                        C1007.f5654 = 59;
                        str3 = "ۨۥۢ";
                        iM3067 = C1026.m3015(str3);
                    }
                    break;
                case 1750787:
                    color = Color.parseColor("#F06292");
                    if (C1059.f5706 - (C0987.f5634 / (-9267)) < 0) {
                        iM3067 = (C1017.f5664 - C1053.f5700) ^ (-1748322);
                        i2 = color;
                    } else {
                        C1010.m2950();
                        iM3067 = C1054.m3127("ۥ۟ۡ");
                        i2 = color;
                    }
                    break;
                case 1751709:
                    iArr2[C1044.f5691 ^ 88] = color6;
                    iM3067 = C1022.m3001("ۧۧۨ");
                    break;
                case 1752455:
                    iArr2[C1002.f5649 ^ (-784)] = color4;
                    iM3067 = (C1023.f5670 % C1041.f5688) + 1749146;
                    break;
                case 1752486:
                    break;
                case 1752736:
                    int color10 = Color.parseColor("#E57373");
                    if (C1000.m2913() >= 0) {
                        C1004.m2926();
                        iM3067 = C1008.m2944("۠ۨۤ");
                        i = color10;
                    } else {
                        iM3067 = (C1041.f5688 - C1025.f5672) + 1749728;
                        i = color10;
                    }
                    break;
                case 1752737:
                    iArr2[C1039.f5686 ^ (-566)] = i;
                    if (C1002.f5649 >= 0) {
                        C1048.f5695 = 6;
                        iM3067 = C1015.m2970("ۥۢ");
                    } else {
                        iM3067 = (C1020.f5667 / C1038.f5685) + 1747871;
                    }
                    break;
                case 1753452:
                    iArr2[C1003.f5650 ^ (-901)] = color3;
                    if (C1024.m3008() > 0) {
                        iM3067 = C1017.m2981("ۨۧۡ");
                    } else {
                        str6 = "۠ۥ۟";
                        iM3067 = C1039.m3067(str6);
                    }
                    break;
                case 1754632:
                    iArr2[C1043.f5690 ^ (-876)] = color2;
                    str = "ۦ۠ۦ";
                    iM3067 = C1058.m3140(str);
                    break;
                case 1755586:
                    iArr2[C1021.f5668 ^ 965] = color5;
                    if (C0990.m2872() <= 0) {
                        C1028.f5675 = 7;
                        str7 = "ۢ۟ۢ";
                    } else {
                        str7 = "ۣۡۨ";
                    }
                    iM3067 = C0997.m2901(str7);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x008a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:131:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0c9a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0cab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:597:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x11e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x11da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:615:0x021a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x108a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x071f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0e31 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0711 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x050b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x10c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x10bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:672:0x1091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0a60 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0a52 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0e29 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:758:0x12e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x12d2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m1392a(android.app.Activity r77, final p000.C0713sn r78, final int r79, java.lang.String r80, java.lang.String r81) {
        /*
            Method dump skipped, instruction units count: 5432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0294hd.m1392a(android.app.Activity, sn, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ef A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1393b(android.widget.TextView r18, p000.l00 r19, p000.C0713sn r20, android.widget.TextView r21) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0294hd.m1393b(android.widget.TextView, l00, sn, android.widget.TextView):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x015b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1394c(java.util.ArrayList r21, int r22, java.util.ArrayList r23, p000.p00 r24, p000.l00 r25, android.widget.BaseAdapter r26) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0294hd.m1394c(java.util.ArrayList, int, java.util.ArrayList, p00, l00, android.widget.BaseAdapter):void");
    }
}
