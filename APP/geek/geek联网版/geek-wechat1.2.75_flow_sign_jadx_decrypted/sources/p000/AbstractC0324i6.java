package p000;

import android.app.C0986;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.window.C0990;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.widget.C1000;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.graphics.drawable.C1009;
import androidx.core.graphics.drawable.C1010;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1013;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.google.android.material.appbar.C1021;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1035;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.internal.C1038;
import com.google.android.material.textfield.C1041;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1051;
import io.fastkv.C1052;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0324i6 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f2337a = new ConcurrentHashMap();

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static void m1476a(Dialog dialog, LinearLayout linearLayout) {
        String str;
        String str2;
        o40 o40Var;
        int iM2975 = C1016.m2975("ۥۥۦ");
        p40 p40Var = null;
        o40 o40Var2 = null;
        while (true) {
            switch (iM2975) {
                case 56351:
                    linearLayout.animate().alpha(0.0f).setDuration((-646) ^ ((long) C1005.f5652)).start();
                    if (C1038.m3062() < 0) {
                        str = "ۦۦۧ";
                        iM2975 = C0998.m2905(str);
                    } else {
                        C1015.m2972();
                        iM2975 = C1017.m2981("ۦۢ");
                    }
                    break;
                case 56483:
                    iM2975 = (C1056.f5703 | C1030.f5677) ^ 1752507;
                    break;
                case 56508:
                    p40Var.m2064b(200.0f);
                    if ((C0990.f5637 | (C1037.f5684 / (-4546))) > 0) {
                        str2 = "ۧ۠۠";
                        iM2975 = C1052.m3118(str2);
                    } else {
                        C1000.m2913();
                        o40Var = o40Var2;
                        iM2975 = C1037.m3059("ۣ۟۟");
                        o40Var2 = o40Var;
                    }
                    break;
                case 1746719:
                    o40Var2.m1991h();
                    iM2975 = (C1013.f5660 + C1052.f5699) ^ 56887;
                    break;
                case 1746811:
                    p40 p40Var2 = new p40(linearLayout.getResources().getDisplayMetrics().heightPixels);
                    if ((C1034.f5681 | (C1012.f5659 - 9003)) >= 0) {
                        C1009.f5656 = 86;
                        iM2975 = C1043.m763("۟۠۠");
                        p40Var = p40Var2;
                    } else {
                        iM2975 = 56508 + (C1004.f5651 / C1047.f5694);
                        p40Var = p40Var2;
                    }
                    break;
                case 1752646:
                    o40Var = new o40(linearLayout, o40.f3383n);
                    if (C1047.m3099() < 0) {
                        iM2975 = C1037.m3059("ۣ۟۟");
                        o40Var2 = o40Var;
                    } else {
                        C0993.f5640 = 40;
                        iM2975 = C1026.m3015("ۦۡ۠");
                        o40Var2 = o40Var;
                    }
                    break;
                case 1753477:
                    o40Var2.m1984a(new C0093c6(dialog, 0));
                    if (C1059.f5706 / (C1022.f5669 % (-6845)) > 0) {
                        iM2975 = (C0994.f5641 | C0996.f5643) ^ 1746560;
                    } else {
                        C0995.f5642 = 14;
                        str2 = "ۥۥۦ";
                        iM2975 = C1052.m3118(str2);
                    }
                    break;
                case 1753639:
                    break;
                case 1754407:
                    o40Var2.f3400k = p40Var;
                    if (C1045.m3091() > 0) {
                        str = "ۦۡ۠";
                        iM2975 = C0998.m2905(str);
                    } else {
                        C1048.m3102();
                        str = "ۦۦۧ";
                        iM2975 = C0998.m2905(str);
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x00aa. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0727 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:638:0x043a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:641:0x042c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0735 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0827 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0815 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:691:0x089a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:693:0x088c A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m1477b(p000.C0713sn r148, java.lang.String r149) {
        /*
            Method dump skipped, instruction units count: 4650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0324i6.m1477b(sn, java.lang.String):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0055. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x07ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x029a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0565 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0558 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1478c(final android.widget.LinearLayout r53, final android.app.Activity r54, final p000.C0723sx[] r55, final p000.p00 r56, final p000.C0713sn r57, final p000.n00 r58, final android.graphics.drawable.GradientDrawable r59, final android.graphics.drawable.GradientDrawable r60, final android.graphics.drawable.GradientDrawable r61, final android.widget.LinearLayout r62) {
        /*
            Method dump skipped, instruction units count: 2268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0324i6.m1478c(android.widget.LinearLayout, android.app.Activity, sx[], p00, sn, n00, android.graphics.drawable.GradientDrawable, android.graphics.drawable.GradientDrawable, android.graphics.drawable.GradientDrawable, android.widget.LinearLayout):void");
    }

    /* JADX INFO: renamed from: d */
    public static final void m1479d(LinearLayout linearLayout, n00 n00Var) {
        String str;
        GradientDrawable gradientDrawable = null;
        int i = 0;
        int iRed = 0;
        int i2 = 0;
        int iM3021 = C1027.m3021("۟ۥۧ");
        while (true) {
            switch (iM3021) {
                case 1746783:
                    linearLayout.setBackground(gradientDrawable);
                    if (C1055.f5702 / (C1010.f5657 % 420) >= 0) {
                        C1056.m3134();
                        iM3021 = C1001.m2914("۟ۨۦ");
                    } else {
                        iM3021 = (C1041.f5688 / C0990.f5637) + 1753415;
                        continue;
                    }
                    break;
                case 1746881:
                    gradientDrawable = new GradientDrawable();
                    if (C1025.f5672 < 0) {
                        str = "۠۟ۥ";
                    } else {
                        C1001.m2916();
                        iM3021 = C1015.m2970("ۦ۟۠");
                    }
                    break;
                case 1746973:
                    int iGreen = Color.green(n00Var.f3201a);
                    iM3021 = (-1755623) ^ (C1049.f5696 | C1021.f5668);
                    i2 = iGreen;
                    continue;
                case 1747654:
                    iRed = Color.red(n00Var.f3201a);
                    str = "۟ۨۦ";
                    break;
                case 1752546:
                    gradientDrawable.setColor(Color.argb(C1037.f5684 ^ 613, iRed, i2, i));
                    iM3021 = (C0998.f5645 / C1037.f5684) ^ 1753572;
                    continue;
                case 1753415:
                    return;
                case 1753572:
                    gradientDrawable.setCornerRadii(new float[]{AbstractC0493mp.m1866p(16.0f), AbstractC0493mp.m1866p(16.0f), AbstractC0493mp.m1866p(16.0f), AbstractC0493mp.m1866p(16.0f), AbstractC0493mp.m1866p(4.0f), AbstractC0493mp.m1866p(4.0f), AbstractC0493mp.m1866p(16.0f), AbstractC0493mp.m1866p(16.0f)});
                    if (C1051.f5698 / (C1021.f5668 | (-9199)) == 0) {
                        str = "۟ۢۢ";
                    } else {
                        C1044.m3086();
                        iM3021 = C1000.m2911("۟ۢۢ");
                    }
                    break;
                case 1755468:
                    if (C1017.f5664 % (C1035.f5682 | 6505) == 0) {
                        iM3021 = (C1049.f5696 * C1024.f5671) + 1796566;
                    } else {
                        C1043.f5690 = 22;
                        str = "۠ۨۤ";
                    }
                    break;
                case 1755620:
                    int iBlue = Color.blue(n00Var.f3201a);
                    if ((C1021.f5668 | C1054.f5701 | 6322) >= 0) {
                        iM3021 = C1047.m3096("ۣۨۧ");
                        i = iBlue;
                    } else {
                        iM3021 = 1752659 + (C1032.f5679 | C0986.f5633);
                        i = iBlue;
                        continue;
                    }
                    break;
            }
            iM3021 = C1033.m3042(str);
        }
    }
}
