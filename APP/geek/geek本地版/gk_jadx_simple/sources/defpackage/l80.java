package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.C0007;
import android.widget.TextView;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
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
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
import com.google.android.material.datepicker.C0058;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import java.util.regex.Pattern;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class l80 implements TextWatcher {
    public final TextView a;
    public final i00 b;
    public final int c;

    public l80(TextView r5, i00 r6, int r7) {
        double r2 = 0.0d;
        int r0 = C0052.m209("ۢ۟ۢ");
    L3:
        switch(r0) {
            case 1746725: goto L5;
            case 1746847: goto L8;
            case 1747930: goto L23;
            case 1749573: goto L10;
            case 1749818: goto L19;
            case 1751557: goto L14;
            case 1752454: goto L26;
            case 1755400: goto L29;
            case 1755620: goto L7;
            default: goto L3;
        };
    L5:
        r2 = Double.parseDouble(C0043.m175("luOJzSkUvVM3Jd3"));
        String r02 = "۟ۤۤ";
    L6:
        r0 = C0009.m38(r02);
        goto L3
    L7:
        this.c = r7;
        r0 = (C0024.f24 ^ C0021.f21) ^ (-1747576);
        goto L3
    L8:
        System.out.println(r2);
        String r03 = "ۨۡۡ";
    L9:
        r0 = C0042.m170(r03);
        goto L3
    L10:
        this.a = r5;
        if ((C0032.f32 * (C0054.f54 * (-789))) <= 0) goto L12;
        r0 = (C0008.f8 + C0055.f55) + 1753085;
        goto L3
    L12:
        C0032.m128();
        r0 = C0001.m5("ۢ۟ۢ");
        goto L3
    L14:
        this.b = r6;
        if (C0012.f12 > 0) goto L17;
        C0070.f70 = 6;
    L17:
        r0 = C0067.m271("ۨۨۤ");
        goto L3
    L19:
        if (C0030.m121() < 0) goto L21;
        r03 = "ۣ۠";
        goto L9
    L21:
        r03 = "ۢ۟ۢ";
        goto L9
    L23:
        if (C0036.m147() < 0) goto L26;
        r02 = "۟۠ۦ";
    L26:
        if (C0031.m124() <= 0) goto L27;
        r0 = (C0012.f12 / C0042.f42) + 1755400;
        goto L3
    L27:
        C0025.f25 = 74;
        r02 = "ۨۧۡ";
        goto L6
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r23) {
        TextView r17 = null;
        int r19 = 0;
        Object r16 = null;
        Boolean r15 = null;
        String r6 = null;
        String r18 = null;
        String r7 = null;
        Pattern r8 = null;
        String r14 = null;
        String r3 = null;
        StringBuilder r4 = null;
        int r2 = 0;
        int r21 = 0;
        int r20 = C0047.m189("۠ۧۡ");
        String r11 = null;
        String r12 = null;
        StringBuilder r13 = null;
    L3:
        switch(r20) {
            case 56322: goto L6;
            case 56327: goto L109;
            case 56359: goto L121;
            case 56384: goto L64;
            case 56386: goto L9;
            case 56416: goto L113;
            case 56421: goto L63;
            case 56568: goto L144;
            case 1746780: goto L47;
            case 1746789: goto L54;
            case 1746848: goto L165;
            case 1746851: goto L95;
            case 1746904: goto L17;
            case 1746937: goto L168;
            case 1746942: goto L8;
            case 1746943: goto L159;
            case 1746972: goto L20;
            case 1747655: goto L170;
            case 1747779: goto L91;
            case 1747898: goto L139;
            case 1747935: goto L59;
            case 1748644: goto L156;
            case 1748796: goto L109;
            case 1749632: goto L128;
            case 1749701: goto L50;
            case 1749858: goto L82;
            case 1750534: goto L124;
            case 1750593: goto L27;
            case 1750782: goto L32;
            case 1751523: goto L109;
            case 1751649: goto L156;
            case 1751678: goto L23;
            case 1751711: goto L13;
            case 1751712: goto L117;
            case 1752485: goto L148;
            case 1752489: goto L74;
            case 1752520: goto L56;
            case 1752550: goto L107;
            case 1753418: goto L103;
            case 1753478: goto L98;
            case 1753544: goto L109;
            case 1753665: goto L70;
            case 1753666: goto L42;
            case 1754476: goto L144;
            case 1754594: goto L152;
            case 1755372: goto L122;
            case 1755429: goto L148;
            case 1755461: goto L88;
            case 1755492: goto L136;
            case 1755528: goto L77;
            case 1755553: goto L39;
            default: goto L3;
        };
    L6:
        if (C0016.f16 <= 0) goto L7;
        r20 = (C0071.f71 * C0000.f0) ^ (-2077306);
        goto L3
    L7:
        C0062.f62 = 58;
        r20 = C0042.m170("ۦۣۧ");
        goto L3
    L8:
        r7 = r18;
        r20 = (C0056.f56 * C0024.f24) ^ (-1749080);
        goto L3
    L9:
        String r5 = b50.T(r14).toString();
        StringBuilder r9 = new StringBuilder("top_title_text_");
        if ((C0011.f11 * (C0017.f17 | 4612)) >= 0) goto L11;
        r11 = r5;
        r13 = r9;
        r20 = (C0063.f63 - C0001.f1) + 1753161;
        goto L3
    L11:
        C0004.m18();
        r11 = r5;
        r13 = r9;
        r20 = C0035.m140("۟ۦ۟");
        goto L3
    L13:
        String r52 = r8.matcher(r7).replaceAll("");
        ip.n("replaceAll(...)", r52);
        if ((C0030.f30 ^ (C0001.f1 / 2896)) <= 0) goto L15;
        r14 = r52;
        r20 = (C0000.f0 - C0004.f4) ^ 55532;
        goto L3
    L15:
        r14 = r52;
        r20 = C0070.m281("ۥۡۤ");
        goto L3
    L17:
        String r53 = "ۧۢۧ";
    L18:
        r20 = C0035.m140(r53);
    L20:
        if ((C0065.f65 | (C0056.f56 % (-3003))) >= 0) goto L21;
        r20 = (C0034.f34 % C0063.f63) ^ (-1750654);
        goto L3
    L21:
        C0052.f52 = 74;
        r20 = C0005.m23("ۣۡ");
        goto L3
    L23:
        r17.setTag(r19, Boolean.FALSE);
        if ((C0040.f40 ^ (C0070.f70 % (-5441))) <= 0) goto L25;
        r20 = C0069.m277("۠۟ۦ");
        goto L3
    L25:
        C0037.m150();
        r20 = C0011.m45("۟ۢۨ");
        goto L3
    L27:
        if (r2 == 0) goto L109;
        if ((C0024.f24 - (C0060.f60 ^ (-5258))) <= 0) goto L30;
        r20 = (C0006.f6 - C0027.f27) + 1748751;
        goto L3
    L30:
        C0018.f18 = 96;
        r20 = C0004.m16("ۤۤۡ");
        goto L3
    L32:
        if (r2 == 0) goto L107;
        if ((C0058.f58 / (C0019.f19 + 1417)) != 0) goto L35;
        String r92 = "ۣۨ۠";
        Pattern r54 = r8;
        String r10 = r6;
    L37:
        r8 = r54;
        r6 = r10;
        r20 = C0004.m16(r92);
        goto L3
    L35:
        r20 = C0062.m249("ۨ۠ۤ");
    L39:
        if ((C0030.f30 - (C0015.f15 | (-8747))) <= 0) goto L40;
        r20 = (C0029.f29 | C0048.f48) + 1749910;
        goto L3
    L40:
        C0026.f26 = 28;
        r20 = C0013.m53("ۡۥۥ");
        goto L3
    L42:
        r17.setTextColor(r21);
        if (C0021.m84() <= 0) goto L44;
        String r55 = "ۧۦۡ";
    L46:
        r20 = C0071.m286(r55);
        goto L3
    L44:
        r20 = C0042.m170("ۢۨۨ");
        goto L3
    L47:
        this.b.b = r7;
        if (z30.q("xbUXImuIHgXdtgsPQIkPBMG2MRJx\n", "rtBufR/6f2s=\n", gn.a) == true) goto L39;
        r20 = (C0010.f10 * C0042.f42) + 1170285;
        goto L3
    L50:
        String r56 = u40.a("f6YcbqMxV6U=\n", "I45ACohtfoE=\n");
        ip.o("pattern", r56);
        if (C0040.f40 <= 0) goto L52;
        r12 = r56;
        r20 = (C0015.f15 / C0012.f12) + 1747942;
        goto L3
    L52:
        C0061.f61 = 11;
        r12 = r56;
        r20 = C0006.m26("ۨ۠");
        goto L3
    L54:
        r17.setText(r3);
        r20 = C0047.m189("ۣۧۢ");
    L56:
        if (C0051.m206() >= 0) goto L57;
        r20 = (C0050.f50 * C0048.f48) ^ 1739927;
        goto L3
    L57:
        C0071.m284();
        r20 = C0002.m8("ۧۦ");
        goto L3
    L59:
        r54 = Pattern.compile(r12);
        ip.n("compile(...)", r54);
        if ((C0029.f29 | (C0023.f23 / 8158)) < 0) goto L62;
        C0061.m244();
        r8 = r54;
        r20 = C0056.m226("ۥ۠ۤ");
        goto L3
    L62:
        r92 = "ۤۦۡ";
        r10 = r6;
        goto L37
    L63:
        Object r93 = r17.getTag(r19);
        Boolean r57 = Boolean.TRUE;
        r15 = r57;
        r16 = r93;
        r20 = (C0042.f42 - C0024.f24) + 1751376;
        goto L3
    L64:
        r4 = new StringBuilder("top_title_color_");
        r4.append(r11);
        if (C0048.m194() <= 0) goto L66;
        r20 = (C0054.f54 ^ C0033.f33) + 1747217;
        goto L3
    L66:
        C0048.m194();
        String r58 = "ۥۣۢ";
    L67:
        r20 = C0064.m258(r58);
        goto L3
    L70:
        if (C0067.m269() <= 0) goto L71;
        String r59 = r6;
    L73:
        r7 = r59;
        r20 = C0039.m159("ۦۡۡ");
        goto L3
    L71:
        C0065.f65 = 16;
        r7 = r6;
        r20 = C0044.m176("۟ۢ۟");
    L74:
        String r510 = "۟ۧۧ";
    L75:
        r20 = C0017.m70(r510);
        goto L3
    L77:
        if (C0048.m194() <= 0) goto L78;
        r20 = (C0016.f16 | C0055.f55) + 1752182;
        goto L3
    L78:
        C0068.m273();
    L79:
        r20 = C0063.m254("۟ۤۨ");
        goto L3
    L82:
        if (r7.length() != 0) goto L56;
        if ((C0055.f55 ^ (C0065.f65 + 1497)) >= 0) goto L85;
        r20 = (C0028.f28 | C0012.f12) + 56843;
        goto L3
    L85:
        r20 = C0008.m35("ۣۧۢ");
        goto L3
    L88:
        if (C0043.f43 <= 0) goto L89;
        r20 = (C0007.f7 % C0038.f38) + 1753551;
        r21 = r2;
        goto L3
    L89:
        r20 = C0015.m60("ۥ۠۠");
        r21 = r2;
        goto L3
    L91:
        r2 = gn.b(r4.toString(), 0);
        if (r3.length() <= 0) goto L20;
        r20 = (C0045.f45 + C0031.f31) ^ (-1746507);
        goto L3
    L95:
        if (C0015.f15 >= 0) goto L96;
        r20 = C0061.m246("ۦۣۥ");
        goto L3
    L96:
        C0065.m260();
        r20 = C0005.m23("ۨۥۥ");
        goto L3
    L98:
        if (r6 != null) goto L122;
        if ((C0042.f42 + (C0055.f55 / (-2710))) < 0) goto L102;
        C0050.m202();
        r20 = C0025.m102("ۣۡ۠");
        goto L3
    L102:
        r53 = "ۣۣ";
        goto L18
    L103:
        r13.append(r11);
        r3 = gn.d(r13.toString(), "");
        if ((C0051.f51 / (C0071.f71 * (-3910))) == 0) goto L106;
        C0022.m88();
        r59 = r7;
        goto L73
    L106:
        r58 = "ۢۢ";
    L107:
        r20 = C0031.m127("ۡۨ");
    L109:
        if ((C0049.f49 | (C0019.f19 + 1826)) <= 0) goto L110;
        r20 = (C0037.f37 - C0068.f68) + 1747454;
        goto L3
    L110:
        r53 = "۟ۦۧ";
        goto L18
    L113:
        if (C0061.m244() <= 0) goto L114;
        r18 = "";
        r20 = C0069.m277("۟ۧۦ");
        goto L3
    L114:
        r18 = "";
        r20 = C0004.m16("ۣ۠ۦ");
        goto L3
    L117:
        if (C0054.f54 <= 0) goto L118;
        String r511 = "ۤ۠۟";
    L120:
        r20 = C0001.m5(r511);
        goto L3
    L118:
        C0008.f8 = 82;
        r20 = C0073.m292("ۤۦۡ");
        goto L3
    L121:
        int r94 = this.c;
        r20 = (C0024.f24 % C0010.f10) + 1755525;
        r21 = r94;
    L122:
        r20 = C0039.m159("ۢۨۨ");
        goto L3
    L124:
        if (ip.i(r16, r15) == false) goto L74;
        if ((C0057.f57 | (C0036.f36 % 3713)) < 0) goto L79;
        C0050.f50 = 25;
        r20 = C0051.m207("ۣۣ");
        goto L3
    L128:
        r17.setTag(r19, r15);
        if (r3.length() <= 0) goto L136;
        if ((C0013.f13 / (C0051.f51 + 4683)) != 0) goto L132;
        String r512 = "۟ۢۨ";
    L134:
        r20 = C0068.m272(r512);
        goto L3
    L132:
        r20 = C0021.m86("ۦۧۢ");
    L136:
        if ((C0057.f57 % (C0042.f42 ^ (-731))) >= 0) goto L137;
        r20 = C0025.m102("ۣۧۢ");
        goto L3
    L137:
        C0048.f48 = 74;
        r92 = "ۨ۟ۦ";
        r54 = r8;
        r10 = r6;
        goto L37
    L139:
        TextView r513 = this.a;
        int r95 = 2115109321 ^ C0041.f41;
        if (C0067.f67 >= 0) goto L141;
        r17 = r513;
        r19 = r95;
        r20 = C0064.m258("ۣۨ");
        goto L3
    L141:
        C0044.f44 = 6;
        r17 = r513;
        r19 = r95;
        r20 = C0011.m45("۟ۧۧ");
        goto L3
    L144:
        if ((C0029.f29 ^ (C0062.f62 * 1632)) <= 0) goto L145;
        r20 = C0026.m105("ۢۡ۟");
        goto L3
    L145:
        C0073.m295();
        r55 = "ۢۨۡ";
        goto L46
    L148:
        if (C0019.f19 <= 0) goto L149;
        r20 = C0006.m26("ۤۥ۟");
        goto L3
    L149:
        C0058.f58 = 38;
        r20 = C0018.m73("ۣۦۥ");
        goto L3
    L152:
        if (C0021.m84() <= 0) goto L153;
        r20 = (C0019.f19 / C0007.f7) + 1755429;
        goto L3
    L153:
        C0029.f29 = 27;
        r511 = "ۡۥ۠";
        goto L120
    L156:
        if ((C0056.f56 * (C0067.f67 + 7836)) >= 0) goto L157;
        r20 = (C0003.f3 ^ C0008.f8) + 1753864;
        goto L3
    L157:
        r512 = "۠۟۟";
        goto L134
    L159:
        if (r23 == null) goto L168;
        r10 = r23.toString();
        if (C0058.m232() > 0) goto L163;
        C0030.f30 = 55;
        r6 = r10;
        r20 = C0000.m2("ۧۢۧ");
        goto L3
    L163:
        r54 = r8;
        r92 = "ۦۧۢ";
        goto L37
    L165:
        if ((C0051.f51 % (C0005.f5 | 4874)) >= 0) goto L166;
        r20 = (C0039.f39 - C0046.f46) ^ (-1747149);
        goto L3
    L166:
        C0000.m0();
        r510 = "ۣۤۦ";
    L168:
        r510 = "ۣۣ";
        goto L75
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r2, int r3, int r4, int r5) {
        int r0 = C0044.m176("ۣۢۢ");
    L3:
        switch(r0) {
            case 1749667: goto L5;
            case 1753414: goto L7;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if (C0041.f41 <= 0) goto L8;
        r0 = C0058.m234("ۣۢۢ");
        goto L3
    L8:
        r0 = C0055.m220("ۡ۠ۤ");
        goto L3
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r4, int r5, int r6, int r7) {
        int r2 = C0062.m249("۟ۤۧ");
        Double r1 = null;
    L3:
        switch(r2) {
            case 1746850: goto L6;
            case 1747686: goto L21;
            case 1749824: goto L17;
            case 1750664: goto L14;
            case 1753662: goto L25;
            case 1754473: goto L11;
            default: goto L3;
        };
    L6:
        if (C0068.m273() < 0) goto L17;
        if (C0039.f39 < 0) goto L10;
        C0037.m150();
    L10:
        r2 = C0043.m173("ۧۢۤ");
        goto L3
    L11:
        Double r0 = Double.valueOf(C0000.m1("5W8cL"));
        if (C0023.m92() >= 0) goto L13;
    L13:
        r2 = C0053.m213("۠۠ۦ");
        r1 = r0;
        goto L3
    L14:
        r2 = (C0047.f47 | C0056.f56) + 1746852;
    L17:
        if (C0024.f24 <= 0) goto L18;
        r2 = (C0049.f49 + C0018.f18) + 1753402;
        goto L3
    L18:
        C0064.m257();
        String r02 = "ۦۣۧ";
    L19:
        r2 = C0043.m173(r02);
        goto L3
    L21:
        System.out.println(r1);
        if ((C0070.f70 | (C0016.f16 - 6623)) < 0) goto L24;
        C0058.f58 = 53;
        r2 = C0039.m159("۟ۤۧ");
        goto L3
    L24:
        r02 = "ۦۧ۟";
        goto L19
    }
}
