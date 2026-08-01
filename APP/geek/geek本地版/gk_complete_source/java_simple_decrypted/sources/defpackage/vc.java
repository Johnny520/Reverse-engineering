package defpackage;

import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.core.content.C0023;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.behavior.C0050;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0054;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.ljx.wechatmod.hook.C0066;
import java.util.ArrayList;
import java.util.Locale;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class vc implements TextWatcher {
    public final i00 a;
    public final ArrayList b;
    public final int c;
    public final ArrayList d;
    public final wc e;
    public final e00 f;

    public vc(int r4, wc r5, e00 r6, i00 r7, ArrayList r8, ArrayList r9) {
        int r2 = C0045.m182("ۡۤۧ");
        Double r1 = null;
    L3:
        switch(r2) {
            case 56355: goto L5;
            case 56506: goto L37;
            case 1746820: goto L6;
            case 1746851: goto L41;
            case 1746906: goto L9;
            case 1748768: goto L15;
            case 1748772: goto L18;
            case 1750598: goto L19;
            case 1750717: goto L28;
            case 1750819: goto L24;
            case 1754598: goto L13;
            case 1755560: goto L30;
            default: goto L3;
        };
    L5:
        return;
    L6:
        this.e = r5;
        if (C0027.f27 >= 0) goto L8;
    L34:
        String r0 = "ۣۨۨ";
    L35:
        r2 = C0054.m219(r0);
        goto L3
    L8:
        r2 = C0010.m43("۟ۦۡ");
        goto L3
    L9:
        this.d = r9;
        if (C0045.m181() <= 0) goto L11;
    L11:
        String r02 = "ۣ۟ۨ";
    L12:
        r2 = C0072.m288(r02);
        goto L3
    L13:
        Double r03 = Double.valueOf(C0009.m37("oAW"));
        r2 = C0033.m132("ۣۡۤ");
        r1 = r03;
    L15:
        if (C0019.f19 <= 0) goto L16;
        r2 = (C0059.f59 / C0010.f10) ^ 56354;
        goto L3
    L16:
        C0008.f8 = 28;
        r2 = C0028.m114("ۨۢۥ");
        goto L3
    L18:
        this.a = r7;
        r02 = "ۣۥ۟";
        goto L12
    L19:
        System.out.println(r1);
        if ((C0071.f71 ^ (C0049.f49 - 776)) <= 0) goto L21;
        String r04 = "ۡۤ";
    L23:
        r2 = C0039.m159(r04);
        goto L3
    L21:
        C0032.f32 = 38;
        r2 = C0008.m35("۟ۤۨ");
        goto L3
    L24:
        this.f = r6;
        if (C0040.f40 > 0) goto L27;
    L26:
        r04 = "ۦ۠";
        goto L23
    L27:
        r02 = "ۨۦۦ";
        goto L12
    L28:
        this.b = r8;
        goto L26
    L30:
        if (C0006.m24() > 0) goto L15;
        if (C0048.m194() > 0) goto L36;
        C0052.m210();
        goto L34
    L36:
        r0 = "ۧۦۥ";
        goto L35
    L37:
        this.c = r4;
        if (C0035.m143() <= 0) goto L39;
        r2 = C0045.m182("۟ۦۡ");
        goto L3
    L39:
        C0047.f47 = 97;
        r2 = C0045.m182("ۡۤۧ");
        goto L3
    L41:
        r2 = (C0013.f13 | C0020.f20) ^ (-1748982);
        goto L3
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r11) {
        e00 r2 = null;
        wc r1 = null;
        i00 r3 = null;
        String r9 = null;
        String r6 = null;
        String r8 = null;
        String r7 = null;
        int r5 = C0069.m277("۠ۦۤ");
    L3:
        switch(r5) {
            case 56413: goto L5;
            case 56542: goto L29;
            case 1746723: goto L25;
            case 1746785: goto L33;
            case 1746939: goto L8;
            case 1747744: goto L42;
            case 1747870: goto L19;
            case 1747873: goto L53;
            case 1748733: goto L44;
            case 1750562: goto L61;
            case 1750687: goto L49;
            case 1751501: goto L57;
            case 1751525: goto L68;
            case 1751556: goto L65;
            case 1752673: goto L13;
            case 1753605: goto L39;
            case 1754438: goto L48;
            case 1754439: goto L39;
            case 1755398: goto L23;
            default: goto L3;
        };
    L5:
        if (r9 == null) goto L65;
        String r0 = "ۥۦۢ";
    L7:
        r5 = C0057.m229(r0);
        goto L3
    L8:
        r3.b = r7;
        if (C0046.f46 <= 0) goto L10;
    L12:
        r5 = C0034.m138("ۧۥ");
        goto L3
    L10:
        C0008.f8 = 93;
        r5 = C0052.m209("۠ۦۧ");
        goto L3
    L13:
        String r02 = r9.toLowerCase(Locale.ROOT);
        if (C0023.m92() >= 0) goto L15;
        String r4 = "۠ۦۧ";
        r6 = r02;
    L18:
        r5 = C0050.m203(r4);
        goto L3
    L15:
        String r42 = r7;
    L16:
        r5 = C0044.m176("ۣ۠۟");
        r6 = r02;
        r7 = r42;
        goto L3
    L19:
        if (r11 == null) goto L65;
        if (C0051.f51 < 0) goto L27;
    L22:
        r5 = C0057.m229("ۤ۟ۨ");
    L27:
        r4 = "ۣۤ۠";
        goto L18
    L23:
        r02 = r6;
        r42 = r8;
        goto L16
    L25:
        if ((C0027.f27 / (C0036.f36 ^ 254)) != 0) goto L26;
        r7 = r6;
        r5 = (C0034.f34 ^ C0030.f30) + 1748525;
        goto L3
    L26:
        C0052.f52 = 76;
        r7 = r6;
        goto L27
    L29:
        r1 = this.e;
        if ((C0030.f30 * (C0058.f58 ^ (-1886))) < 0) goto L32;
        C0027.m111();
    L32:
        r5 = C0045.m182("ۧۡ۠");
        goto L3
    L33:
        r8 = "";
        if (C0056.f56 >= 0) goto L35;
        r5 = (C0023.f23 / C0063.f63) + 1755390;
        goto L3
    L35:
        C0017.m71();
    L36:
        r5 = C0060.m241("ۣ۟ۧ");
        goto L3
    L39:
        if ((C0070.f70 ^ (C0061.f61 | (-4716))) >= 0) goto L40;
        r5 = (C0066.f66 * C0015.f15) + 2550386;
        goto L3
    L40:
        C0004.m18();
        r0 = "ۥۣۨ";
        goto L7
    L42:
        r5 = C0039.m159("ۦۥۤ");
        goto L3
    L44:
        if ((C0039.f39 - (C0042.f42 / 1681)) < 0) goto L47;
        C0042.f42 = 29;
        String r03 = "۟ۨۤ";
    L46:
        r5 = C0043.m173(r03);
        goto L3
    L47:
        r03 = "۠ۦۤ";
        goto L46
    L48:
        r2 = this.f;
        goto L22
    L49:
        String r04 = r11.toString();
        if ((C0005.f5 | (C0019.f19 / 5460)) <= 0) goto L51;
        r9 = r04;
        r5 = (C0021.f21 / C0005.f5) + 56417;
        goto L3
    L51:
        C0020.m82();
        r9 = r04;
        r5 = C0011.m45("۠ۦۤ");
        goto L3
    L53:
        ip.n("toLowerCase(...)", r6);
        if (C0012.m51() <= 0) goto L12;
        r03 = "۟۠ۤ";
        goto L46
    L57:
        xc.c(this.c, r1, r2, r3, this.b, this.d);
        if (C0060.f60 <= 0) goto L59;
        r5 = (C0016.f16 - C0030.f30) + 1751180;
        goto L3
    L59:
        C0050.m202();
        r5 = C0069.m277("۠ۢۢ");
        goto L3
    L61:
        r3 = this.a;
        if (C0038.m155() > 0) goto L36;
        r5 = C0070.m281("ۣۡ۟");
    L65:
        if (C0039.m157() >= 0) goto L66;
        r5 = (C0013.f13 / C0047.f47) + 1746739;
        goto L3
    L66:
        C0031.f31 = 98;
        r5 = C0003.m13("ۥۦۥ");
        goto L3
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r3, int r4, int r5, int r6) {
        int r0 = C0039.m159("ۨ۠ۦ");
    L3:
        switch(r0) {
            case 1751623: goto L5;
            case 1755374: goto L6;
            default: goto L3;
        };
    L5:
        r0 = (C0066.f66 / C0060.f60) ^ 1755374;
        goto L3
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r3, int r4, int r5, int r6) {
        int r0 = C0011.m45("ۦۤ۠");
    L3:
        switch(r0) {
            case 1747717: goto L6;
            case 1753570: goto L9;
            default: goto L3;
        };
    L6:
        if ((C0003.f3 / (C0069.f69 % 7936)) >= 0) goto L7;
        r0 = (C0033.f33 * C0002.f2) ^ 1621834;
        goto L3
    L7:
        C0001.m4();
        r0 = C0039.m159("ۣۧ۟");
        goto L3
    }
}
