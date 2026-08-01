package defpackage;

import android.app.C0000;
import android.app.C0002;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0005;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0024;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0045;
import com.google.android.material.appbar.C0049;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class vn implements SeekBar.OnSeekBarChangeListener {
    public final TextView a;
    public final String b;
    public final sm c;
    public final SeekBar d;

    public vn(TextView r5, String r6, sm r7, SeekBar r8) {
        double r0 = 0.0d;
        int r2 = C0045.m182("۠۟۠");
    L3:
        switch(r2) {
            case 56290: goto L5;
            case 1746687: goto L9;
            case 1746843: goto L33;
            case 1747649: goto L26;
            case 1747746: goto L11;
            case 1747811: goto L17;
            case 1750629: goto L25;
            case 1751679: goto L40;
            case 1752555: goto L20;
            case 1753480: goto L37;
            default: goto L3;
        };
    L5:
        this.c = r7;
        if (C0066.m265() > 0) goto L31;
        C0021.m84();
        String r22 = "ۤۥ۠";
    L8:
        r2 = C0055.m220(r22);
        goto L3
    L31:
        r22 = "ۦۣۡ";
        goto L8
    L9:
        System.out.println(r0);
        r2 = C0049.m197("ۤۥ۠");
        goto L3
    L11:
        if (C0010.m40() < 0) goto L25;
        if (C0032.f32 >= 0) goto L14;
        r2 = (C0044.f44 * C0063.f63) + 1726995;
        goto L3
    L14:
        C0040.m162();
    L15:
        r2 = C0026.m105("۟ۡ");
        goto L3
    L17:
        this.b = r6;
        if (C0037.f37 < 0) goto L15;
        r2 = C0048.m193("۟۟۟");
        goto L3
    L20:
        r0 = Double.parseDouble(C0059.m237("xWy2t2y4BoXV7Bb2fSDpY"));
        if ((C0038.f38 / (C0039.f39 * (-6869))) != 0) goto L22;
        r2 = (C0067.f67 ^ C0022.f22) + 1745780;
        goto L3
    L22:
        C0021.f21 = 77;
    L23:
        r2 = C0015.m60("۠ۢۤ");
    L25:
        r2 = (C0038.f38 ^ C0061.f61) + 1751856;
        goto L3
    L26:
        this.a = r5;
        if ((C0042.f42 ^ (C0067.f67 % 4654)) <= 0) goto L29;
    L29:
        r2 = C0060.m241("۠ۤۧ");
        goto L3
    L33:
        if (C0028.f28 < 0) goto L36;
        C0037.f37 = 19;
        String r23 = "ۨ۟ۨ";
    L35:
        r2 = C0064.m258(r23);
        goto L3
    L36:
        r23 = "۠۟۠";
        goto L35
    L37:
        this.d = r8;
        if ((C0065.f65 ^ (C0034.f34 * 3450)) > 0) goto L23;
        r2 = C0022.m90("ۦۣۡ");
        goto L3
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar r6, int r7, boolean r8) {
        int r3 = C0021.m86("ۧۡ۠");
        Integer r0 = null;
        sm r2 = null;
    L3:
        switch(r3) {
            case 1747747: goto L6;
            case 1748705: goto L48;
            case 1748893: goto L20;
            case 1750563: goto L28;
            case 1750625: goto L45;
            case 1750633: goto L11;
            case 1750818: goto L34;
            case 1752582: goto L8;
            case 1754438: goto L44;
            case 1754445: goto L40;
            case 1754504: goto L16;
            case 1754569: goto L33;
            case 1755405: goto L25;
            case 1755524: goto L39;
            default: goto L3;
        };
    L6:
        if (C0044.m178() < 0) goto L39;
    L7:
        r3 = C0040.m160("ۣۢ۠");
        goto L3
    L8:
        if (r8 == false) goto L25;
        String r1 = "ۣۢۨ";
    L10:
        r3 = C0043.m173(r1);
        goto L3
    L11:
        gn.a.getClass();
        if (C0032.f32 >= 0) goto L13;
        String r32 = "ۣ۠۠";
        sm r12 = r2;
    L15:
        r3 = C0013.m53(r32);
        r2 = r12;
        goto L3
    L13:
        C0056.f56 = 57;
        r3 = C0060.m241("ۧۡۧ");
        goto L3
    L16:
        r2.f(Integer.valueOf(r7));
        if (C0054.f54 <= 0) goto L18;
        r3 = (C0020.f20 ^ C0018.f18) + 1747796;
        goto L3
    L18:
        C0071.f71 = 72;
        r3 = C0056.m226("ۨۥۡ");
        goto L3
    L20:
        System.out.println(r0);
        if (C0056.f56 >= 0) goto L22;
        r3 = C0027.m110("ۡۢۢ");
        goto L3
    L22:
        C0029.f29 = 64;
        r3 = C0060.m241("ۡۨۤ");
    L25:
        if (C0063.f63 > 0) goto L27;
        r1 = "ۥۨ۠";
        goto L10
    L27:
        r1 = "۠ۢۥ";
        goto L10
    L28:
        gn.g(this.b, r7);
        if (C0015.f15 < 0) goto L32;
        String r13 = "ۣۢۨ";
    L31:
        r3 = C0063.m254(r13);
        goto L3
    L32:
        r1 = "ۧۡۧ";
        goto L10
    L33:
        r3 = (C0051.f51 - C0070.f70) + 1755142;
        goto L3
    L34:
        if (r2 == null) goto L25;
        if (C0055.m223() < 0) goto L38;
        C0067.f67 = 72;
        r3 = C0002.m8("ۣ۠۠");
        goto L3
    L38:
        r13 = "ۣۧۤ";
    L39:
        r3 = (C0044.f44 | C0055.f55) ^ (-1748214);
        goto L3
    L40:
        r12 = this.c;
        if ((C0031.f31 ^ (C0036.f36 / 3038)) < 0) goto L43;
        C0035.f35 = 4;
    L43:
        r32 = "ۣۨۧ";
        goto L15
    L44:
        this.a.setText(String.valueOf(r7));
        r3 = (C0057.f57 - C0028.f28) ^ 1752714;
        goto L3
    L45:
        r0 = Integer.valueOf(C0035.m141("ZRSklD3hEHjgK9s"));
        if ((C0031.f31 % (C0040.f40 | (-9468))) >= 0) goto L7;
        r13 = "ۡۨۤ";
        goto L31
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar r2) {
        int r0 = C0008.m35("ۣۥۧ");
    L3:
        switch(r0) {
            case 1750725: goto L5;
            case 1753665: goto L7;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if (C0002.m10() <= 0) goto L8;
        r0 = C0053.m213("ۣۥۧ");
        goto L3
    L8:
        C0071.m284();
        r0 = C0011.m45("ۦۥۨ");
        goto L3
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar r4) {
        Double r0 = null;
        int r1 = C0073.m292("ۥۧ۟");
    L3:
        switch(r1) {
            case 56475: goto L5;
            case 1747871: goto L24;
            case 1750570: goto L32;
            case 1750781: goto L28;
            case 1751586: goto L10;
            case 1751683: goto L17;
            case 1752701: goto L16;
            case 1754406: goto L27;
            default: goto L3;
        };
    L5:
        gn.i(this.d, C0033.f33 ^ 212);
        if (C0011.f11 >= 0) goto L7;
        String r12 = "ۤۢ۠";
    L20:
        r1 = C0068.m272(r12);
        goto L3
    L7:
        C0020.f20 = 55;
    L8:
        r1 = C0003.m13("ۥ۠");
        goto L3
    L10:
        if (C0066.m265() > 0) goto L24;
        if (C0005.f5 <= 0) goto L13;
        String r13 = "ۤۥۤ";
    L15:
        r1 = C0009.m38(r13);
        goto L3
    L13:
        C0024.f24 = 65;
        r1 = C0009.m38("ۥۧ۟");
        goto L3
    L16:
        gn.a.getClass();
        goto L8
    L17:
        r0 = Double.valueOf(C0048.m195("fp8LpRFx7CNgaIWDdw8JpLF0W"));
        if (C0065.m260() <= 0) goto L19;
        r1 = C0063.m254("ۣۧۡ");
        goto L3
    L19:
        C0027.m111();
        r12 = "ۤۥۤ";
    L24:
        if (C0065.f65 >= 0) goto L25;
        r1 = (C0018.f18 ^ C0054.f54) + 1750017;
        goto L3
    L25:
        C0068.f68 = 39;
        r13 = "ۢۧ";
        goto L15
    L27:
        r1 = (C0000.f0 / C0060.f60) + 1752701;
        goto L3
    L28:
        System.out.println(r0);
        if (C0013.m52() >= 0) goto L30;
        r1 = (C0056.f56 * C0011.f11) + 1685906;
        goto L3
    L30:
        r1 = C0042.m170("۠ۦۥ");
        goto L3
    }
}
