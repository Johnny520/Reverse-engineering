package defpackage;

import android.app.Activity;
import android.app.C0000;
import android.app.C0001;
import android.app.C0003;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import android.view.View;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.lifecycle.C0029;
import androidx.profileinstaller.C0030;
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
import androidx.versionedparcelable.C0041;
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
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class f6 extends View {
    public final String a;
    public final boolean b;
    public final Paint c;
    public final RectF d;
    public final int e;
    public final int f;
    public final int g;
    public final on h;

    public f6(on r17, Activity r18, String r19, boolean r20) {
        ip.o(u40.a("AaEp3Ljzmg==\n", "Ys5HqN2L7vI=\n"), r18);
        ip.o(u40.a("EXaDo/JuFw==\n", "YhPmx7oLb1c=\n"), r19);
        this.h = r17;
        super(r18);
        int r5 = 0;
        int r6 = 0;
        int r4 = 0;
        int r11 = 0;
        int r8 = 0;
        Double r2 = null;
        int r12 = C0031.m127("ۣۥۥ");
        int r9 = 0;
        int r10 = 0;
    L3:
        switch(r12) {
            case 56389: goto L5;
            case 56539: goto L17;
            case 1746720: goto L64;
            case 1747809: goto L18;
            case 1747874: goto L65;
            case 1748859: goto L13;
            case 1749763: goto L37;
            case 1750537: goto L66;
            case 1750723: goto L36;
            case 1750811: goto L48;
            case 1751587: goto L55;
            case 1751687: goto L45;
            case 1752552: goto L52;
            case 1752610: goto L60;
            case 1752674: goto L12;
            case 1753509: goto L6;
            case 1754413: goto L28;
            case 1754446: goto L41;
            case 1755431: goto L22;
            case 1755530: goto L34;
            default: goto L3;
        };
    L5:
        return;
    L6:
        this.g = Color.argb(C0031.f31 ^ (-223), r4, r11, r8);
        if (C0006.f6 <= 0) goto L8;
        String r3 = "ۧ۠ۦ";
    L11:
        r12 = C0014.m57(r3);
        goto L3
    L8:
        C0026.m106();
    L9:
        r12 = C0060.m241("۟۠ۡ");
        goto L3
    L12:
        int r32 = (int) (((double) Color.blue(r5)) * 0.7d);
        r9 = r32;
        r12 = (C0013.f13 / C0056.f56) ^ 1750536;
        goto L3
    L13:
        this.e = r5;
        if (C0003.m14() < 0) goto L16;
        C0058.m232();
        r12 = C0055.m220("ۣۨ۠");
        goto L3
    L16:
        r3 = "۠ۦۨ";
        goto L11
    L17:
        this.b = r20;
        goto L9
    L18:
        int r33 = Color.green(r5);
        if (C0019.m77() <= 0) goto L20;
        r11 = r33;
        r12 = (C0070.f70 ^ C0059.f59) + 1752807;
        goto L3
    L20:
        C0036.m147();
        r11 = r33;
        r12 = C0056.m226("ۧۢ");
        goto L3
    L22:
        r5 = i6.b(r17, r19);
        if ((C0059.f59 + (C0049.f49 ^ (-5221))) >= 0) goto L24;
        int r34 = r4;
    L26:
        r4 = r34;
        r12 = C0067.m271("ۡۧۡ");
        goto L3
    L24:
        r12 = C0021.m86("ۨۥۧ");
        goto L3
    L28:
        if (C0071.m284() < 0) goto L52;
        if (C0007.f7 <= 0) goto L31;
        r12 = C0011.m45("ۢۥۦ");
        goto L3
    L31:
        C0003.m14();
        String r35 = "ۣۥۥ";
    L32:
        r12 = C0066.m264(r35);
        goto L3
    L34:
        System.out.println(r2);
        String r7 = "ۢۧ";
        int r36 = r8;
    L35:
        r8 = r36;
        r12 = C0065.m263(r7);
        goto L3
    L36:
        this.a = r19;
        r12 = (C0014.f14 / C0066.f66) + 56539;
        goto L3
    L37:
        r2 = Double.valueOf(C0013.m54("0ujSSYps4ih5TEB8zjSf8Jso75"));
        if ((C0033.f33 + (C0026.f26 % (-6142))) > 0) goto L40;
        C0038.f38 = 61;
        r12 = C0043.m173("ۧۡۨ");
        goto L3
    L40:
        r35 = "ۨۥۧ";
        goto L32
    L41:
        r34 = Color.red(r5);
        if (C0005.f5 <= 0) goto L43;
        r4 = r34;
        r12 = 1747694 + (C0024.f24 | C0012.f12);
        goto L3
    L43:
        C0017.m71();
        goto L26
    L45:
        int r37 = (int) (((double) Color.green(r5)) * 0.7d);
        String r72 = "ۥۦۣ";
    L46:
        r6 = r37;
        r12 = C0032.m130(r72);
        goto L3
    L48:
        if (C0066.m265() <= 0) goto L49;
        r12 = (C0048.f48 * C0036.f36) ^ 2011720;
        goto L3
    L49:
        r3 = "ۤۡ";
    L52:
        if (C0005.m20() >= 0) goto L53;
        r12 = (C0046.f46 / C0054.f54) + 56389;
        goto L3
    L53:
        C0006.m24();
        r72 = "ۥ۟ۡ";
        r37 = r6;
        goto L46
    L55:
        this.d = new RectF();
        if ((C0068.f68 * (C0001.f1 ^ (-6216))) >= 0) goto L57;
        r12 = (C0040.f40 + C0048.f48) + 1754620;
        goto L3
    L57:
        C0041.m167();
    L58:
        r12 = C0062.m249("ۦۢۡ");
        goto L3
    L60:
        r36 = Color.blue(r5);
        if (C0010.f10 >= 0) goto L62;
        r8 = r36;
        goto L58
    L62:
        r7 = "ۢۥۦ";
        goto L35
    L64:
        this.c = new Paint(1);
        r72 = "ۤۢۡ";
        r37 = r6;
        goto L46
    L65:
        int r38 = (int) (((double) Color.red(r5)) * 0.7d);
        r10 = r38;
        r12 = (C0030.f30 ^ C0057.f57) + 1752007;
        goto L3
    L66:
        this.f = Color.argb(C0009.f9 ^ (-926), r10, r6, r9);
        r12 = (C0017.f17 + C0025.f25) + 1754534;
        goto L3
    }

    public final String getSeedHex() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r23) {
        float r17 = 0.0f;
        boolean r16 = false;
        float r10 = 0.0f;
        float r15 = 0.0f;
        float r11 = 0.0f;
        float r9 = 0.0f;
        RectF r4 = null;
        Paint r8 = null;
        int r12 = 0;
        int r14 = 0;
        int r13 = 0;
        Paint.Style r18 = null;
        int r19 = C0020.m80("ۢۦۦ");
        float r20 = 0.0f;
        float r21 = 0.0f;
    L3:
        switch(r19) {
            case 56421: goto L5;
            case 56536: goto L14;
            case 56568: goto L42;
            case 1746784: goto L43;
            case 1746787: goto L64;
            case 1746906: goto L105;
            case 1747714: goto L99;
            case 1747743: goto L36;
            case 1747779: goto L69;
            case 1747903: goto L8;
            case 1748610: goto L108;
            case 1748742: goto L35;
            case 1748800: goto L60;
            case 1748859: goto L90;
            case 1749794: goto L46;
            case 1749819: goto L32;
            case 1749850: goto L86;
            case 1750754: goto L45;
            case 1750781: goto L83;
            case 1751563: goto L19;
            case 1751624: goto L73;
            case 1751679: goto L87;
            case 1752679: goto L54;
            case 1753420: goto L77;
            case 1753485: goto L56;
            case 1753571: goto L23;
            case 1753693: goto L45;
            case 1753695: goto L51;
            case 1754592: goto L95;
            case 1754598: goto L27;
            case 1755367: goto L88;
            case 1755403: goto L95;
            default: goto L3;
        };
    L5:
        r8.setStrokeWidth(ff.p(2.0f));
        r8.setColor(this.g);
        if ((C0052.f52 ^ (C0065.f65 * 1259)) >= 0) goto L7;
        String r3 = "ۤۥ۠";
    L41:
        r19 = C0028.m114(r3);
        goto L3
    L7:
        C0067.m269();
        r19 = C0009.m38("ۣۤۧ");
        goto L3
    L8:
        r8.setColor(this.f);
        r23.drawArc(r4, 0.0f, 180.0f, true, r8);
        if ((C0058.f58 * (C0007.f7 % (-5313))) <= 0) goto L10;
        r19 = (C0047.f47 + C0051.f51) + 1754785;
        goto L3
    L10:
        C0072.f72 = 41;
        float r32 = r10;
    L11:
        r19 = C0007.m28("ۤۡۨ");
        r10 = r32;
    L14:
        if ((C0072.f72 | (C0057.f57 % (-4954))) >= 0) goto L15;
        r19 = (C0066.f66 % C0017.f17) ^ 1748535;
        goto L3
    L15:
        C0010.m40();
        String r33 = "۠ۦۢ";
    L16:
        r19 = C0036.m144(r33);
        goto L3
    L19:
        if (C0028.m112() <= 0) goto L20;
        r19 = (C0013.f13 / C0033.f33) + 1750783;
        r11 = r10;
        goto L3
    L20:
        float r34 = r10;
    L21:
        r19 = C0034.m138("ۣۨ");
        r11 = r34;
        goto L3
    L23:
        r8.setColor(r13);
        if (C0040.f40 <= 0) goto L25;
        r19 = (C0050.f50 + C0067.f67) + 56683;
        goto L3
    L25:
        C0039.f39 = 15;
        r19 = C0054.m219("ۢۦۦ");
        goto L3
    L27:
        if (r16 == false) goto L14;
        r8.setStyle(Paint.Style.STROKE);
        if (C0048.f48 > 0) goto L31;
        C0044.m178();
        r19 = C0069.m277("ۧۦ۟");
        goto L3
    L31:
        r34 = r11;
        goto L21
    L32:
        float r35 = ff.p(2.0f);
    L33:
        String r5 = "ۡۧۡ";
        boolean r6 = r16;
        float r7 = r17;
        r15 = r35;
    L34:
        r16 = r6;
        r19 = C0038.m153(r5);
        r17 = r7;
        goto L3
    L35:
        r19 = (C0037.f37 % C0008.f8) + 1750470;
        r20 = getWidth() / 2.0f;
        r21 = getHeight() / 2.0f;
        goto L3
    L36:
        if (r16 == false) goto L51;
        r32 = ff.p(4.0f);
        if ((C0025.f25 * (C0017.f17 ^ 7953)) < 0) goto L11;
        C0039.f39 = 77;
        r19 = C0054.m219("ۧۦۥ");
        r10 = r32;
        goto L3
    L42:
        r23.drawCircle(r20, r21, 0.35f * r9, r8);
        r33 = "ۡ۟۠";
        goto L16
    L43:
        float r52 = ((31.0f + r17) - r11) - 31.0f;
        r4 = this.d;
        String r36 = "ۣۤۧ";
    L44:
        r19 = C0022.m90(r36);
        r9 = r52;
        goto L3
    L45:
        r36 = "ۦۤۡ";
        r52 = r9;
        goto L44
    L46:
        ip.o(u40.a("PNWP0z++\n", "X7ThpV7Nvi4=\n"), r23);
        super.onDraw(r23);
        if (C0024.f24 > 0) goto L49;
        r19 = C0032.m130("ۣۡۨ");
        goto L3
    L49:
        r36 = "ۣۡۨ";
        r52 = r9;
    L51:
        if ((C0000.f0 ^ (C0046.f46 / 6456)) <= 0) goto L52;
        r19 = (C0019.f19 - C0005.f5) + 1749832;
        goto L3
    L52:
        C0031.m124();
        r3 = "ۥۧۢ";
        goto L41
    L54:
        r19 = (C0069.f69 ^ C0070.f70) ^ (-1749264);
    L56:
        if (C0021.m84() > 0) goto L59;
        C0064.f64 = 53;
        String r37 = "ۣ۟ۤ";
    L58:
        r19 = C0057.m229(r37);
        goto L3
    L59:
        r37 = "ۡۥۤ";
        goto L58
    L60:
        int r38 = -1;
        if (C0027.m111() <= 0) goto L62;
    L80:
        r14 = r38;
        r19 = C0046.m186("۟ۢۦ");
        goto L3
    L62:
        C0019.m77();
        r14 = -1;
        r19 = C0057.m229("ۨۡۤ");
        goto L3
    L64:
        if (C0051.f51 < 0) goto L67;
        C0008.m33();
        String r39 = "ۡ۟۠";
    L66:
        r19 = C0018.m73(r39);
        r13 = r14;
        goto L3
    L67:
        r39 = "ۦۤۡ";
        goto L66
    L69:
        if ((C0066.f66 | (C0003.f3 + 4858)) <= 0) goto L70;
        r19 = C0034.m138("۟ۦۡ");
        r13 = r12;
        goto L3
    L70:
        C0068.m273();
        int r310 = r12;
    L71:
        r19 = C0004.m16("۠ۧۦ");
        r13 = r310;
        goto L3
    L73:
        r4.set(((r20 - 14.0f) - r9) + 14.0f, ((28.0f + r21) - r9) - 28.0f, 0.0f - ((0.0f - r20) - r9), r21 - (0.0f - r9));
        Paint.Style r311 = Paint.Style.FILL;
        if ((C0025.f25 + (C0063.f63 + 715)) >= 0) goto L75;
        r18 = r311;
        r19 = (C0012.f12 - C0009.f9) + 1752438;
        goto L3
    L75:
        C0065.f65 = 47;
        r18 = r311;
        r19 = C0072.m288("ۦۡۨ");
        goto L3
    L77:
        r8 = this.c;
        r8.setStyle(r18);
        if (C0060.f60 <= 0) goto L79;
        r19 = (C0065.f65 / C0063.f63) ^ (-1755374);
        goto L3
    L79:
        C0026.f26 = 33;
        r38 = r14;
        goto L80
    L83:
        if ((C0029.f29 * (C0041.f41 % (-1869))) >= 0) goto L84;
        r19 = C0022.m90("ۨۡۤ");
        goto L3
    L84:
        C0069.m276();
        r35 = r15;
        goto L33
    L86:
        r7 = Math.min(r20, r21);
        r6 = this.b;
        r5 = "۠ۢۡ";
        goto L34
    L87:
        r23.drawCircle(r20, r21, ((ff.p(3.0f) - 14.0f) + r9) + 14.0f, r8);
        r8.setStyle(r18);
        r19 = (C0059.f59 - C0035.f35) ^ (-1748551);
        goto L3
    L88:
        r8.setColor(this.e);
        r23.drawArc(r4, 180.0f, 180.0f, true, r8);
        r310 = r13;
        goto L71
    L90:
        if (C0015.f15 >= 0) goto L91;
        String r312 = "ۣ۟ۢ";
        r11 = r15;
    L93:
        r19 = C0036.m144(r312);
        goto L3
    L91:
        C0016.f16 = 37;
        r19 = C0001.m5("ۥۦۨ");
        r11 = r15;
        goto L3
    L95:
        if (C0020.m82() > 0) goto L97;
        C0000.m0();
        r36 = "ۨۤۧ";
        r52 = r9;
        goto L44
    L97:
        r3 = "ۣ۟ۢ";
        goto L41
    L99:
        if (this.h.p == false) goto L56;
        r12 = Color.parseColor(u40.a("4Uvqy4AnsryE\n", "wg7cjcZh9Po=\n"));
        if ((C0059.f59 / (C0047.f47 % 1082)) <= 0) goto L102;
        r19 = (C0008.f8 % C0003.f3) ^ (-1747833);
        goto L3
    L102:
        C0024.f24 = 59;
        r19 = C0050.m203("ۢۨ۠");
        goto L3
    L105:
        if (C0041.m167() <= 0) goto L106;
        r19 = (C0046.f46 % C0019.f19) ^ 1753685;
        goto L3
    L106:
        r312 = "ۢۧ۠";
        goto L93
    }
}
