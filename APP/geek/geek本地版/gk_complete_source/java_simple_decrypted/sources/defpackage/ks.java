package defpackage;

import android.app.Application;
import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import android.view.View;
import android.widget.TextView;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0030;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0039;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
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
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import com.ljx.wechatmod.ui.MainActivity;
import io.fastkv.C0068;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks implements Runnable {
    public final int a;
    public final int b;
    public final Object c;

    public /* synthetic */ ks(Object r4, int r5, int r6) {
        this.a = r6;
        this.c = r4;
        this.b = r5;
        Long r0 = null;
        int r1 = C0060.m241("ۥۨ۟");
    L3:
        switch(r1) {
            case 1747905: goto L5;
            case 1748803: goto L14;
            case 1749700: goto L6;
            case 1750570: goto L17;
            case 1752732: goto L8;
            case 1755406: goto L18;
            default: goto L3;
        };
    L5:
        System.out.println(r0);
        r1 = (C0027.f27 + C0047.f47) + 1755859;
        goto L3
    L6:
        r0 = Long.decode(C0068.m275("kcf4OhTMshCg6O4J9Z"));
        r1 = (C0019.f19 + C0041.f41) + 1747363;
        goto L3
    L8:
        if (C0065.m260() > 0) goto L17;
        if ((C0037.f37 % (C0055.f55 | (-4285))) >= 0) goto L11;
        r1 = (C0049.f49 | C0002.f2) ^ 1749051;
        goto L3
    L11:
        C0042.f42 = 17;
        r1 = C0060.m241("ۡۥۧ");
        goto L3
    L14:
        if ((C0061.f61 / (C0023.f23 - 7549)) != 0) goto L15;
        r1 = (C0006.f6 / C0032.f32) ^ (-1752733);
        goto L3
    L15:
        r1 = C0008.m35("ۢ۠ۤ");
    L17:
        r1 = C0034.m138("ۨۡۧ");
        goto L3
    }

    @Override // java.lang.Runnable
    public final void run() {
        double r4 = 0.0d;
        String r9 = null;
        gn r10 = null;
        View r1 = null;
        String r11 = null;
        SideSheetBehavior r6 = null;
        Application r7 = null;
        StringBuilder r12 = null;
        int r8 = C0067.m271("ۦ۟ۨ");
    L3:
        switch(r8) {
            case 1746691: goto L5;
            case 1746786: goto L13;
            case 1746846: goto L71;
            case 1746850: goto L34;
            case 1747684: goto L53;
            case 1747774: goto L77;
            case 1747836: goto L39;
            case 1747840: goto L49;
            case 1747896: goto L19;
            case 1748707: goto L26;
            case 1748740: goto L32;
            case 1748897: goto L85;
            case 1749575: goto L76;
            case 1749635: goto L69;
            case 1749760: goto L85;
            case 1749855: goto L44;
            case 1750686: goto L85;
            case 1750717: goto L59;
            case 1750751: goto L85;
            case 1751561: goto L64;
            case 1752518: goto L82;
            case 1753423: goto L25;
            case 1753604: goto L17;
            case 1754438: goto L45;
            case 1754476: goto L23;
            case 1754532: goto L55;
            case 1754632: goto L9;
            case 1755402: goto L28;
            case 1755404: goto L72;
            default: goto L3;
        };
    L5:
        MainActivity.a((TextView) this.c, this.b);
        if (C0032.m128() >= 0) goto L7;
        r8 = C0063.m254("ۡۨۨ");
        goto L3
    L7:
        C0030.f30 = 73;
        r8 = C0004.m16("ۣۤ۟");
        goto L3
    L9:
        if ((C0053.f53 | (C0022.f22 / 9818)) > 0) goto L12;
        C0071.m284();
        String r0 = "ۧۢ";
    L11:
        r8 = C0001.m5(r0);
        goto L3
    L12:
        r0 = "ۦ۟ۨ";
        goto L11
    L13:
        gn.k(r7, r9);
        if ((C0064.f64 ^ (C0066.f66 - 1506)) >= 0) goto L15;
        r8 = C0045.m182("ۤۡۦ");
        goto L3
    L15:
        r8 = C0004.m16("ۣۡۦ");
        goto L3
    L17:
        ((zt) this.c).I(this.b);
        r8 = (C0049.f49 % C0051.f51) + 1749705;
    L19:
        if ((C0000.f0 % (C0045.f45 + 6391)) <= 0) goto L20;
        r8 = C0055.m220("ۦۥۣ");
        goto L3
    L20:
        C0024.f24 = 59;
        String r2 = "ۦۢۢ";
        View r02 = r1;
    L21:
        r1 = r02;
        r8 = C0011.m45(r2);
        goto L3
    L23:
        System.out.println(r11);
        r8 = (C0039.f39 - C0070.f70) + 1751720;
        goto L3
    L25:
        switch(this.a) {
            case 0: goto L32;
            case 1: goto L19;
            case 2: goto L69;
            default: goto L26;
        };
    L26:
        r8 = (C0052.f52 % C0070.f70) + 1749334;
    L28:
        if ((C0020.f20 + (C0000.f0 / (-7112))) >= 0) goto L29;
        r8 = (C0027.f27 - C0048.f48) + 1751497;
        goto L3
    L29:
        String r03 = "ۤۧۧ";
        double r22 = r4;
    L30:
        r8 = C0050.m203(r03);
        r4 = r22;
    L32:
        String r04 = "ۣ۟۟";
    L33:
        r8 = C0030.m120(r04);
        goto L3
    L34:
        SideSheetBehavior r05 = (SideSheetBehavior) this.c;
        if ((C0053.f53 - (C0034.f34 / (-3542))) <= 0) goto L36;
        r6 = r05;
        r8 = (C0061.f61 ^ C0034.f34) + 1748353;
        goto L3
    L36:
        SideSheetBehavior r23 = r05;
        Application r3 = r7;
        Object r82 = "ۨۡۥ";
    L37:
        r6 = r23;
        r7 = r3;
        r8 = C0007.m28(r82);
        goto L3
    L39:
        r22 = ((double) this.b) / 100.0d;
        if ((C0068.f68 | (C0042.f42 - 9912)) < 0) goto L43;
        C0040.m162();
        String r06 = r9;
    L42:
        r8 = C0064.m258("۠ۥۥ");
        r9 = r06;
        r4 = r22;
        goto L3
    L43:
        r03 = "ۨۡۥ";
        goto L30
    L44:
        r23 = r6;
        r3 = (Application) this.c;
        r82 = "ۧۤۡ";
        goto L37
    L45:
        r06 = r12.toString();
        if ((C0044.f44 + (C0058.f58 + 3712)) > 0) goto L48;
        r9 = r06;
        r8 = C0055.m220("۠ۧ۟");
        goto L3
    L48:
        r22 = r4;
        goto L42
    L49:
        r10.getClass();
        if (C0007.m31() >= 0) goto L51;
        r8 = (C0053.f53 | C0014.f14) + 1747433;
        goto L3
    L51:
        C0025.f25 = 74;
        r8 = C0064.m258("ۢ۟ۤ");
        goto L3
    L53:
        if (r1 == null) goto L28;
        r8 = C0013.m53("ۣۥ۟");
        goto L3
    L55:
        gn r07 = gn.a;
        if (C0053.m214() <= 0) goto L57;
        r10 = r07;
        r8 = (C0003.f3 + C0066.f66) + 1746085;
        goto L3
    L57:
        r10 = r07;
        r8 = C0045.m182("ۡۢۤ");
        goto L3
    L59:
        r6.t(r1, this.b, false);
        if (C0063.m253() <= 0) goto L61;
        r8 = C0033.m132("ۣۦۢ");
        goto L3
    L61:
        C0026.m106();
        r8 = C0057.m229("۠۠ۤ");
        goto L3
    L64:
        if (C0043.m172() < 0) goto L82;
        if (C0060.m240() >= 0) goto L67;
        r8 = (C0003.f3 ^ C0064.f64) + 1748605;
        goto L3
    L67:
        C0054.f54 = 29;
        r8 = C0026.m105("ۧۤۡ");
    L69:
        r8 = (C0001.f1 ^ C0009.f9) + 1745864;
        goto L3
    L71:
        r12.append(r4);
        r2 = "ۧۡ۠";
        r02 = r1;
        goto L21
    L72:
        StringBuilder r08 = new StringBuilder("💸 自动收款成功: ￥");
        if ((C0047.f47 - (C0070.f70 | (-8844))) <= 0) goto L74;
        r12 = r08;
        r8 = (C0030.f30 - C0029.f29) + 1746460;
        goto L3
    L74:
        C0054.m217();
        r12 = r08;
        r8 = C0046.m186("ۢۥۣ");
        goto L3
    L76:
        r11 = C0066.m267("XsmTu");
        r8 = (C0033.f33 % C0046.f46) + 1754262;
        goto L3
    L77:
        r02 = (View) r6.p.get();
        if ((C0045.f45 % (C0014.f14 + 4961)) < 0) goto L80;
        r1 = r02;
        r8 = C0057.m229("ۧۧۨ");
        goto L3
    L80:
        r2 = "۠۠ۤ";
    L82:
        if ((C0019.f19 | (C0007.f7 / 5171)) <= 0) goto L83;
        r8 = (C0017.f17 ^ C0030.f30) ^ 1750229;
        goto L3
    L83:
        C0045.m181();
        r04 = "ۡۡ۟";
        goto L33
    }
}
