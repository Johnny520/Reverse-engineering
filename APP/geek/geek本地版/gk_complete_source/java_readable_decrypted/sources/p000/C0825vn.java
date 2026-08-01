package p000;

import android.app.C0988;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0996;
import androidx.activity.C0997;
import androidx.activity.result.C0994;
import androidx.appcompat.widget.C1001;
import androidx.coordinatorlayout.widget.C1007;
import androidx.coordinatorlayout.widget.C1008;
import androidx.emoji2.text.C1012;
import androidx.legacy.content.C1014;
import androidx.recyclerview.widget.C1018;
import androidx.savedstate.C1020;
import androidx.startup.C1023;
import androidx.versionedparcelable.C1024;
import androidx.versionedparcelable.C1025;
import androidx.versionedparcelable.C1026;
import androidx.versionedparcelable.C1028;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.annotation.C1030;
import com.github.megatronking.stringfog.xor.C1031;
import com.google.android.material.appbar.C1035;
import com.google.android.material.carousel.C1039;
import com.google.android.material.carousel.C1041;
import com.google.android.material.datepicker.C1045;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.internal.C1047;
import com.google.android.material.theme.C1049;
import com.google.android.material.theme.C1050;
import com.ljx.wechatmod.auth.C1051;
import com.ljx.wechatmod.hook.C1052;
import com.ljx.wechatmod.p001ui.C1053;

/* JADX INFO: renamed from: vn */
/* JADX INFO: loaded from: classes.dex */
public final class C0825vn implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    public final TextView f4870a;

    /* JADX INFO: renamed from: b */
    public final String f4871b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0713sm f4872c;

    /* JADX INFO: renamed from: d */
    public final SeekBar f4873d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    public C0825vn(TextView textView, String str, InterfaceC0713sm interfaceC0713sm, SeekBar seekBar) {
        String str2;
        String str3;
        double d = 0.0d;
        int iM3027 = C1031.m3027("۠۟۠");
        while (true) {
            switch (iM3027) {
                case 56290:
                    this.f4872c = interfaceC0713sm;
                    if (C1052.m3110() <= 0) {
                        C1007.m2930();
                        str3 = "ۤۥ۠";
                    } else {
                        str3 = "ۦۣۡ";
                    }
                    iM3027 = C1041.m3065(str3);
                    break;
                case 1746687:
                    System.out.println(d);
                    iM3027 = C1035.m3042("ۤۥ۠");
                    break;
                case 1746843:
                    if (C1014.f5658 >= 0) {
                        C1023.f5667 = 19;
                        str2 = "ۨ۟ۨ";
                    } else {
                        str2 = "۠۟۠";
                    }
                    iM3027 = C1050.m3103(str2);
                    break;
                case 1747649:
                    this.f4870a = textView;
                    if ((C1028.f5672 ^ (C1053.f5697 % 4654)) <= 0) {
                    }
                    iM3027 = C1046.m3086("۠ۤۧ");
                    break;
                case 1747746:
                    if (C0996.m2886() < 0) {
                        iM3027 = (C1024.f5668 ^ C1047.f5691) + 1751856;
                    } else if (C1018.f5662 < 0) {
                        iM3027 = (C1030.f5674 * C1049.f5693) + 1726995;
                    } else {
                        C1026.m3008();
                    }
                    break;
                case 1747811:
                    this.f4871b = str;
                    iM3027 = C1023.f5667 < 0 ? C1012.m2951("۟ۡ") : C1034.m3038("۟۟۟");
                    break;
                case 1750629:
                    iM3027 = (C1024.f5668 ^ C1047.f5691) + 1751856;
                    break;
                case 1751679:
                    break;
                case 1752555:
                    d = Double.parseDouble(C1045.m3082("xWy2t2y4BoXV7Bb2fSDpY"));
                    if (C1024.f5668 / (C1025.f5669 * (-6869)) == 0) {
                        iM3027 = (C1053.f5697 ^ C1008.f5652) + 1745780;
                    } else {
                        C1007.f5651 = 77;
                    }
                    break;
                case 1753480:
                    this.f4873d = seekBar;
                    iM3027 = (C1051.f5695 ^ (C1020.f5664 * 3450)) > 0 ? C1001.m2906("۠ۢۤ") : C1008.m2936("ۦۣۡ");
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProgressChanged(android.widget.SeekBar r6, int r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0825vn.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int iM2881 = C0994.m2881("ۣۥۧ");
        while (true) {
            switch (iM2881) {
                case 1750725:
                    return;
                case 1753665:
                    if (C0988.m2856() > 0) {
                        iM2881 = C1039.m3058("ۣۥۧ");
                    } else {
                        C1057.m3129();
                        iM2881 = C0997.m2891("ۦۥۨ");
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d A[SYNTHETIC] */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopTrackingTouch(android.widget.SeekBar r4) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0825vn.onStopTrackingTouch(android.widget.SeekBar):void");
    }
}
