package p000;

import android.app.C0986;
import android.app.C0987;
import android.app.C0988;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.graphics.drawable.C0990;
import android.widget.LinearLayout;
import androidx.activity.C0997;
import androidx.activity.result.C0994;
import androidx.constraintlayout.widget.C1005;
import androidx.constraintlayout.widget.C1006;
import androidx.coordinatorlayout.widget.C1008;
import androidx.emoji2.text.C1012;
import androidx.fragment.app.C1013;
import androidx.legacy.content.C1014;
import androidx.profileinstaller.C1016;
import androidx.recyclerview.widget.C1019;
import androidx.savedstate.C1020;
import androidx.savedstate.C1022;
import androidx.versionedparcelable.C1024;
import androidx.versionedparcelable.C1025;
import androidx.versionedparcelable.C1028;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.xor.C1031;
import com.google.android.material.bottomsheet.C1037;
import com.google.android.material.carousel.C1040;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1043;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.internal.C1047;
import com.google.android.material.theme.C1048;
import com.ljx.wechatmod.auth.C1051;
import io.fastkv.C1054;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0324i6 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f2358a = new ConcurrentHashMap();

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static void m1397a(Dialog dialog, LinearLayout linearLayout) {
        String str;
        h40 h40Var;
        String str2;
        String str3;
        int iM2881 = C0994.m2881("ۣۢۡ");
        h40 h40Var2 = null;
        i40 i40Var = null;
        while (true) {
            switch (iM2881) {
                case 56327:
                    linearLayout.animate().alpha(0.0f).setDuration((-695) ^ ((long) C1058.f5702)).start();
                    if (C0988.f5632 > 0) {
                        str3 = "ۥۦۨ";
                        iM2881 = C1019.m2978(str3);
                    } else {
                        C1046.f5690 = 37;
                        h40Var = h40Var2;
                        str3 = "ۡۢ";
                        h40Var2 = h40Var;
                        iM2881 = C1019.m2978(str3);
                    }
                    break;
                case 56353:
                    i40 i40Var2 = new i40(linearLayout.getResources().getDisplayMetrics().heightPixels);
                    iM2881 = (C0997.f5641 % C1020.f5664) + 1754828;
                    i40Var = i40Var2;
                    break;
                case 1750626:
                    h40Var = new h40(linearLayout, h40.f2218m);
                    if (C1034.f5678 / (C1005.f5649 | 5017) == 0) {
                        str3 = "ۡۢ";
                        h40Var2 = h40Var;
                        iM2881 = C1019.m2978(str3);
                    } else {
                        iM2881 = C1046.m3086("ۣۤۤ");
                        h40Var2 = h40Var;
                    }
                    break;
                case 1751651:
                    h40Var2.m1339a(new C0093c6(dialog, 0));
                    iM2881 = (C1024.f5668 * C1047.f5691) + 1929089;
                    break;
                case 1752679:
                    break;
                case 1753514:
                    h40Var2.f2234j = i40Var;
                    if (C0988.m2856() > 0) {
                        str3 = "ۣۤۤ";
                        iM2881 = C1019.m2978(str3);
                    } else {
                        iM2881 = C0997.m2891("ۦۢۦ");
                    }
                    break;
                case 1753663:
                    h40Var2.m1346h();
                    if (C1054.f5698 - (C1037.f5681 - 5069) <= 0) {
                        C1044.m3077();
                        str = "ۧۦ۟";
                    } else {
                        str = "۠ۧ";
                    }
                    iM2881 = C1019.m2978(str);
                    break;
                case 1754375:
                    iM2881 = (C1008.f5652 % C1059.f5703) ^ (-1750639);
                    break;
                case 1754592:
                    i40Var.m1394b(200.0f);
                    if (C1014.f5658 >= 0) {
                        C1025.f5669 = 32;
                        str2 = "ۣۢۡ";
                    } else {
                        str2 = "ۦۢۦ";
                    }
                    iM2881 = C1059.m3137(str2);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x00a1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:600:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:601:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0eb9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0ea6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0eb3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0e9f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0e02 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0df9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m1398b(p000.C0565on r146, java.lang.String r147) {
        /*
            Method dump skipped, instruction units count: 4304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0324i6.m1398b(on, java.lang.String):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x005c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x066f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0797 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1399c(final android.widget.LinearLayout r53, final android.app.Activity r54, final p000.C0427kx[] r55, final p000.i00 r56, final p000.C0565on r57, final p000.g00 r58, final android.graphics.drawable.GradientDrawable r59, final android.graphics.drawable.GradientDrawable r60, final android.graphics.drawable.GradientDrawable r61, final android.widget.LinearLayout r62) {
        /*
            Method dump skipped, instruction units count: 2370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0324i6.m1399c(android.widget.LinearLayout, android.app.Activity, kx[], i00, on, g00, android.graphics.drawable.GradientDrawable, android.graphics.drawable.GradientDrawable, android.graphics.drawable.GradientDrawable, android.widget.LinearLayout):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    /* JADX INFO: renamed from: d */
    public static final void m1400d(LinearLayout linearLayout, g00 g00Var) {
        String str;
        int iRed;
        GradientDrawable gradientDrawable = null;
        int i = 0;
        int iGreen = 0;
        int i2 = 0;
        int iM3133 = C1058.m3133("۟۠ۧ");
        while (true) {
            switch (iM3133) {
                case 56296:
                    gradientDrawable.setColor(Color.argb(C0994.f5638 ^ (-925), i, iGreen, i2));
                    iM3133 = C1041.m3065("ۣۣ۠");
                    break;
                case 56420:
                    iM3133 = C0987.f5631 + C1006.f5650 + 1747165;
                    break;
                case 56540:
                    linearLayout.setBackground(gradientDrawable);
                    if (C1028.f5672 < 0) {
                        str = "ۣ۠ۡ";
                        iM3133 = C1048.m3094(str);
                    } else {
                        C1051.m3105();
                        iM3133 = C1034.m3038("۟۠ۧ");
                    }
                    break;
                case 1746726:
                    gradientDrawable = new GradientDrawable();
                    str = C1024.m3001() <= 0 ? "ۣ۠ۡ" : "ۡۨۤ";
                    iM3133 = C1048.m3094(str);
                    break;
                case 1747714:
                    break;
                case 1747905:
                    iGreen = Color.green(g00Var.f2000a);
                    if (C1022.f5666 > 0) {
                        iM3133 = (C1016.f5660 | C1012.f5656) + 1754603;
                    } else {
                        iRed = i;
                        iM3133 = C1013.m2956("۠ۧۨ");
                        i = iRed;
                    }
                    break;
                case 1748893:
                    iRed = Color.red(g00Var.f2000a);
                    iM3133 = C1013.m2956("۠ۧۨ");
                    i = iRed;
                    break;
                case 1750566:
                    gradientDrawable.setCornerRadii(new float[]{AbstractC0222ff.m1194p(16.0f), AbstractC0222ff.m1194p(16.0f), AbstractC0222ff.m1194p(16.0f), AbstractC0222ff.m1194p(16.0f), AbstractC0222ff.m1194p(4.0f), AbstractC0222ff.m1194p(4.0f), AbstractC0222ff.m1194p(16.0f), AbstractC0222ff.m1194p(16.0f)});
                    if ((C0990.f5634 | (C1031.f5675 ^ 8575)) < 0) {
                        iM3133 = (C1013.f5657 ^ C0990.f5634) + 55731;
                    } else {
                        C1040.m3062();
                        iM3133 = C1041.m3065("ۣۣ۠");
                    }
                    break;
                case 1755557:
                    int iBlue = Color.blue(g00Var.f2000a);
                    if (C1033.f5677 * (C1034.f5678 - 2878) <= 0) {
                        C1056.f5700 = 27;
                        iM3133 = C0986.m2848("ۨۦۣ");
                        i2 = iBlue;
                    } else {
                        iM3133 = (-56036) ^ (C1040.f5684 | C1043.f5687);
                        i2 = iBlue;
                    }
                    break;
            }
            return;
        }
    }
}
