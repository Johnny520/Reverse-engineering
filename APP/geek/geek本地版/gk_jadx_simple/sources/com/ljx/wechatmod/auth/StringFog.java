package com.ljx.wechatmod.auth;

import android.app.C0000;
import android.app.C0002;
import android.support.v4.graphics.drawable.C0005;
import android.util.Base64;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.widget.C0025;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0035;
import androidx.savedstate.C0036;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0038;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
import com.google.android.material.behavior.C0050;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.ui.C0067;
import defpackage.C0073;
import defpackage.c9;
import defpackage.ip;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final class StringFog {
    public static final StringFog INSTANCE = null;

    static {
        INSTANCE = new StringFog();
    }

    private StringFog() {
        Long r1 = null;
        int r2 = C0016.m65("ۣۧۥ");
    L3:
        switch(r2) {
            case 1746788: goto L5;
            case 1748741: goto L25;
            case 1750664: goto L11;
            case 1750785: goto L19;
            case 1751620: goto L7;
            case 1752458: goto L15;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if (C0033.m135() >= 0) goto L8;
        r2 = (C0027.f27 % C0067.f67) + 1750924;
        goto L3
    L8:
        String r0 = "ۧۨ۟";
    L9:
        r2 = C0033.m132(r0);
        goto L3
    L11:
        Long r02 = Long.decode(C0013.m54("yL0H11"));
        if (C0042.f42 >= 0) goto L13;
    L23:
        r2 = C0052.m209("ۣۡۧ");
        r1 = r02;
        goto L3
    L13:
        C0040.m162();
        r2 = C0065.m263("ۥ۟ۤ");
        r1 = r02;
    L15:
        if (C0025.f25 < 0) goto L17;
        C0014.f14 = 50;
        r2 = C0041.m164("۟ۦ۟");
        goto L3
    L17:
        r0 = "۟ۢۧ";
        goto L9
    L19:
        if (C0073.m295() > 0) goto L15;
        if (C0023.f23 <= 0) goto L22;
        r2 = (C0007.f7 - C0009.f9) + 1749315;
        goto L3
    L22:
        r02 = r1;
        goto L23
    L25:
        System.out.println(r1);
        if (C0036.m147() >= 0) goto L27;
        r2 = (C0031.f31 ^ C0002.f2) ^ (-1746419);
        goto L3
    L27:
        C0049.f49 = 75;
        r2 = C0060.m241("ۣۣۨ");
        goto L3
    }

    public final String decrypt(String r10, int r11) {
        int r8 = C0015.m60("ۤ۟");
        byte[] r5 = null;
        String r4 = null;
        byte r6 = 0;
        int r7 = 0;
        int r1 = 0;
        int r3 = 0;
    L3:
        switch(r8) {
            case 56415: goto L6;
            case 56443: goto L48;
            case 1746849: goto L35;
            case 1747873: goto L38;
            case 1747904: goto L33;
            case 1749760: goto L68;
            case 1749761: goto L39;
            case 1750536: goto L45;
            case 1750631: goto L33;
            case 1750656: goto L26;
            case 1751559: goto L58;
            case 1751654: goto L59;
            case 1751687: goto L132;
            case 1752517: goto L9;
            case 1752646: goto L13;
            case 1753609: goto L27;
            case 1754535: goto L54;
            case 1754659: goto L65;
            case 1755401: goto L46;
            default: goto L3;
        };
    L6:
        if (C0005.m20() >= 0) goto L7;
        String r0 = "ۣۢۦ";
    L57:
        r8 = C0032.m130(r0);
        goto L3
    L7:
        C0047.f47 = 36;
        r8 = C0059.m239("ۤ۟");
        goto L3
    L9:
        if (C0043.f43 <= 0) goto L10;
        r8 = C0000.m2("ۢۥۣ");
        goto L3
    L10:
        C0037.m150();
        r8 = C0038.m153("ۣۧۧ");
    L13:
        if ((C0063.f63 ^ (C0035.f35 ^ (-5113))) >= 0) goto L14;
        r8 = (C0073.f73 | C0028.f28) + 1750323;
        goto L3
    L14:
        String r02 = "ۧۨۨ";
    L15:
        r8 = C0020.m80(r02);
        goto L3
    L68:
        byte[] r03 = Base64.decode(r10, 0);     // Catch: Exception -> L23
        if (C0016.m66() <= 0) goto L21;
        r8 = 1755401 ^ (C0050.f50 / C0035.f35);
        r5 = r03;
        goto L3
    L21:
        C0056.f56 = 53;
        r8 = C0063.m254("ۢۥۣ");
        r5 = r03;
    L24:
        return "";
    L26:
        r02 = "ۤۤۦ";
        r1 = 0;
        goto L15
    L27:
        byte r04 = r5[r1];     // Catch: Exception -> L23
        if ((C0067.f67 + (C0011.f11 + 972)) <= 0) goto L30;
        r8 = 1774412 ^ (C0058.f58 * C0064.f64);
        r6 = r04;
        goto L3
    L30:
        r8 = C0014.m57("۠ۧۧ");
        r6 = r04;
        goto L3
    L132:
        return r4;
    L33:
        r8 = (C0027.f27 + C0022.f22) + 1752894;
        goto L3
    L35:
        if (C0054.f54 <= 0) goto L36;
        r8 = (C0046.f46 ^ C0037.f37) ^ (-1751441);
        goto L3
    L36:
        C0039.m157();
        r8 = C0033.m132("ۢۧ۠");
        goto L3
    L38:
        r8 = (C0020.f20 | C0033.f33) ^ (-56439);
        r1 = r3;
        goto L3
    L39:
        r4 = new String(r5, c9.a);     // Catch: Exception -> L23
        if ((C0048.f48 | (C0052.f52 - 8698)) >= 0) goto L42;
        r8 = (C0069.f69 ^ C0028.f28) ^ 1751198;
        goto L3
    L42:
        C0042.m169();
        r8 = C0007.m28("ۧۤۤ");
        goto L3
    L45:
        r3 = r1 + (C0031.f31 ^ (-108));
        r02 = "۠ۦۧ";
        goto L15
    L46:
        int r05 = r5.length;     // Catch: Exception -> L23
        r8 = 1750223 ^ (C0060.f60 + C0038.f38);
        r7 = r05;
        goto L3
    L48:
        ip.o("base64Str", r10);
        if ((C0055.f55 ^ (C0014.f14 / 4078)) >= 0) goto L50;
        String r06 = "ۧۨۤ";
    L52:
        r8 = C0010.m43(r06);
        goto L3
    L50:
        C0051.f51 = 78;
        r8 = C0043.m173("ۧۨۤ");
        goto L3
    L54:
        r5[r1] = (byte) (((r6 ^ (-1)) & r11) | ((r11 ^ (-1)) & r6));     // Catch: Exception -> L23
        r8 = (C0002.f2 - C0016.f16) + 1750261;
        goto L3
    L58:
        r8 = (C0041.f41 ^ C0044.f44) + 56281;
        goto L3
    L59:
        if (r1 >= r7) goto L13;
        if ((C0060.f60 | (C0041.f41 + 8774)) > 0) goto L63;
        C0061.f61 = 8;
    L63:
        r06 = "ۦۥۨ";
        goto L52
    L65:
        if (C0005.f5 <= 0) goto L66;
        r8 = (C0060.f60 ^ C0020.f20) + 1750596;
        goto L3
    L66:
        r0 = "ۤۤۦ";
        goto L57
    }
}
