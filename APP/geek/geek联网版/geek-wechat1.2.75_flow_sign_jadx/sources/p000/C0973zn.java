package p000;

import android.support.v4.graphics.drawable.C0987;
import android.widget.SeekBar;
import android.widget.TextView;
import android.window.C0988;
import android.window.C0990;
import android.window.C0991;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.app.C1005;
import androidx.core.content.C1006;
import androidx.core.content.C1007;
import androidx.core.graphics.drawable.C1009;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1029;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.floatingactionbutton.C1037;
import com.google.android.material.snackbar.C1040;
import com.google.android.material.textfield.C1041;
import com.google.android.material.theme.C1042;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.auth.C1047;
import com.ljx.wechatmod.hook.C1048;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import io.fastkv.C1052;
import kotlinx.coroutines.C1056;
import kotlinx.coroutines.internal.C1054;

/* JADX INFO: renamed from: zn */
/* JADX INFO: loaded from: classes.dex */
public final class C0973zn implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final TextView f5601a;

    /* JADX INFO: renamed from: b */
    public final String f5602b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0786um f5603c;

    /* JADX INFO: renamed from: d */
    public final SeekBar f5604d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    public C0973zn(TextView textView, String str, InterfaceC0786um interfaceC0786um, SeekBar seekBar) {
        String str2;
        String str3;
        String str4;
        Double dValueOf = null;
        int iM2876 = C0991.m2876("ۣۡ۟");
        while (true) {
            switch (iM2876) {
                case 56296:
                    this.f5603c = interfaceC0786um;
                    iM2876 = (C1007.f5654 * C1057.f5704) + 1738037;
                    break;
                case 1748613:
                    this.f5601a = textView;
                    if (C1048.f5695 % (C1004.f5651 + 5684) < 0) {
                        str2 = "ۢ۟ۦ";
                        iM2876 = C1009.m2946(str2);
                    } else {
                        C1054.f5701 = 10;
                        str3 = "ۨۦۧ";
                        iM2876 = C1047.m3096(str3);
                    }
                    break;
                case 1748738:
                    break;
                case 1749577:
                    this.f5602b = str;
                    if (C0997.f5644 < 0) {
                        iM2876 = (C0991.f5638 / C1044.f5691) + 56290;
                    } else {
                        C1049.m3105();
                        str2 = "ۣۡۤ";
                        iM2876 = C1009.m2946(str2);
                    }
                    break;
                case 1749857:
                    this.f5604d = seekBar;
                    if (C1056.m3134() >= 0) {
                        C1024.m3008();
                        iM2876 = C0994.m2889("ۢ۟ۦ");
                    } else {
                        iM2876 = C1046.f5693 + C1050.f5697 + 1750517;
                    }
                    break;
                case 1750567:
                    dValueOf = Double.valueOf(C1029.m3026("iUenkAlI"));
                    if (C1043.f5690 - (C1042.f5689 % (-7442)) < 0) {
                        iM2876 = C1033.m3042("ۨۧۢ");
                    } else {
                        C1004.m2926();
                        iM2876 = C1050.m3111("۟ۧ");
                    }
                    break;
                case 1750657:
                    if (C1027.m3018() > 0) {
                        str4 = "ۣۡۤ";
                        iM2876 = C1056.m3133(str4);
                    } else if (C0988.m2865() > 0) {
                        str3 = "ۣ۠ۤ";
                        iM2876 = C1047.m3096(str3);
                    } else {
                        C1036.m3054();
                        iM2876 = C1004.m2927("ۣۣۡ");
                    }
                    break;
                case 1753640:
                    if ((C0994.f5641 ^ (C1037.f5684 / 6766)) <= 0) {
                        C1058.f5705 = 53;
                        str4 = "ۣۣۧ";
                    } else {
                        str4 = "ۣۡ۟";
                    }
                    iM2876 = C1056.m3133(str4);
                    break;
                case 1755561:
                    str4 = "ۣۡۤ";
                    iM2876 = C1056.m3133(str4);
                    break;
                case 1755587:
                    System.out.println(dValueOf);
                    if (C1057.m3136() < 0) {
                        str2 = "ۣۡۤ";
                        iM2876 = C1009.m2946(str2);
                    } else {
                        iM2876 = C1033.m3042("ۨۧۢ");
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c A[SYNTHETIC] */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProgressChanged(android.widget.SeekBar r6, int r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0973zn.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int iM2936 = C1006.m2936("ۣۤ۟");
        while (true) {
            switch (iM2936) {
                case 1748736:
                    if (C1033.f5680 % (C1027.f5674 | 3075) > 0) {
                        iM2936 = C1005.m2931("ۣۤ۟");
                    } else {
                        C1052.m3116();
                        iM2936 = C1020.m2993("ۨۧۢ");
                    }
                    break;
                case 1751496:
                    return;
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        String str;
        int iM2927 = C1004.m2927("ۥۨۥ");
        while (true) {
            switch (iM2927) {
                case 1746938:
                    return;
                case 1749603:
                    if (C0990.f5637 - (C1036.f5683 % (-8872)) > 0) {
                        iM2927 = (C1030.f5677 ^ C0988.f5635) ^ (-1752320);
                    } else {
                        C1031.m3037();
                        str = "ۧۦۢ";
                    }
                    break;
                case 1752518:
                    C0417kn.m1698i(this.f5604d, C1040.f5687 ^ (-482));
                    if (C1013.f5660 - (C0987.f5634 % 8288) < 0) {
                        str = "۟ۧۢ";
                    } else {
                        C1032.m3040();
                        iM2927 = C1018.m2984("ۥۡۢ");
                    }
                    break;
                case 1752738:
                    C0417kn.f2847a.getClass();
                    iM2927 = (C1004.f5651 * C1041.f5688) + 1693018;
                    continue;
            }
            iM2927 = C1047.m3096(str);
        }
    }
}
