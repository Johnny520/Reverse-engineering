package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.window.C0989;
import androidx.activity.result.C0993;
import androidx.appcompat.view.menu.C0998;
import androidx.appcompat.view.menu.C0999;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1002;
import androidx.core.content.C1008;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.google.android.material.appbar.C1020;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.button.C1025;
import com.google.android.material.carousel.C1026;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1029;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1044;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import kotlinx.coroutines.C1055;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: uv */
/* JADX INFO: loaded from: classes.dex */
public final class C0795uv {

    /* JADX INFO: renamed from: a */
    public final View f4848a;

    /* JADX INFO: renamed from: b */
    public final TextView f4849b;

    /* JADX INFO: renamed from: c */
    public final TextView f4850c;

    /* JADX INFO: renamed from: d */
    public final TextView f4851d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002f. Please report as an issue. */
    public C0795uv(LinearLayout linearLayout, View view, TextView textView, TextView textView2, TextView textView3) {
        double d;
        String str;
        String str2;
        "root";
        "cbBg";
        "avatar";
        "title";
        "subtitle";
        double d2 = 0.0d;
        int iM3039 = C1032.m3039("ۥۣۦ");
        while (true) {
            switch (iM3039) {
                case 1746722:
                    System.out.println(d2);
                    iM3039 = C1020.m2993(C1015.f5662 + (C0993.f5640 + (-3642)) >= 0 ? "ۣۨ۟" : "ۣۤۧ");
                    break;
                case 1747896:
                    this.f4850c = textView2;
                    if (C1037.m3060() < 0) {
                        d = d2;
                        iM3039 = C1059.m3145("ۤ۠ۢ");
                        d2 = d;
                    } else {
                        C1055.f5702 = 78;
                        iM3039 = C1001.m2914("ۥۣۦ");
                    }
                    break;
                case 1749794:
                    if (C0989.m2869() <= 0) {
                        C1027.f5674 = 44;
                        str = "۠ۤۨ";
                    } else {
                        str = "ۥۣۦ";
                    }
                    iM3039 = C0989.m2867(str);
                    break;
                case 1750689:
                    iM3039 = (C1048.f5695 / C1057.f5704) + 1751626;
                    break;
                case 1750779:
                    if (C0999.m2907() < 0) {
                        iM3039 = (C1048.f5695 / C1057.f5704) + 1751626;
                    } else {
                        if (C1048.f5695 % (C0993.f5640 % (-6065)) >= 0) {
                            C0998.f5645 = 22;
                            str2 = "۠ۧ۟";
                        } else {
                            str2 = "ۣۧۤ";
                        }
                        iM3039 = C1027.m3021(str2);
                    }
                    break;
                case 1750784:
                    d = Double.parseDouble(C1023.m3004("6Z"));
                    if (C1055.f5702 > 0) {
                        iM3039 = (C1029.f5676 ^ C1019.f5666) + 1746574;
                        d2 = d;
                    } else {
                        C1047.m3099();
                        iM3039 = C1059.m3145("ۤ۠ۢ");
                        d2 = d;
                    }
                    break;
                case 1751526:
                    this.f4851d = textView3;
                    if (C1044.f5691 + (C1008.f5655 / (-8054)) > 0) {
                        str = "ۣۧ۟";
                        iM3039 = C0989.m2867(str);
                    } else {
                        C1054.m3124();
                        iM3039 = C1024.m3009("ۣۧۤ");
                    }
                    break;
                case 1751624:
                    break;
                case 1752584:
                    this.f4848a = view;
                    iM3039 = C1020.m2990() <= 0 ? C1002.m2920("ۣ۟۠") : (C1016.f5663 + C1008.f5655) ^ (-1756029);
                    break;
                case 1755460:
                    this.f4849b = textView;
                    if ((C1058.f5705 ^ (C1025.f5672 + 3876)) < 0) {
                        str = "۠ۧ۟";
                        iM3039 = C0989.m2867(str);
                    } else {
                        C1026.f5673 = 50;
                        iM3039 = C1042.m3078("ۢۦۦ");
                    }
                    break;
            }
            return;
        }
    }
}
