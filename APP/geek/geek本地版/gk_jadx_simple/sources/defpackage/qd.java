package defpackage;

import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import androidx.activity.C0010;
import androidx.activity.C0011;
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
import androidx.core.content.C0023;
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
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class qd extends Drawable {
    public final Paint a;
    public final Paint b;

    public qd() {
        int r3 = C0025.m102("۠ۡۦ");
        Paint r0 = null;
        Integer r2 = null;
    L3:
        switch(r3) {
            case 1746752: goto L5;
            case 1747684: goto L19;
            case 1747717: goto L34;
            case 1747872: goto L23;
            case 1748858: goto L27;
            case 1749634: goto L36;
            case 1750536: goto L10;
            case 1750750: goto L29;
            case 1751524: goto L6;
            case 1754406: goto L15;
            default: goto L3;
        };
    L5:
        return;
    L6:
        Integer r1 = Integer.valueOf(C0047.m188("kgW7lIN"));
        if ((C0049.f49 | (C0016.f16 ^ (-4632))) >= 0) goto L8;
        r3 = 2159918 + (C0061.f61 * C0065.f65);
        r2 = r1;
        goto L3
    L8:
        C0031.m124();
        r3 = C0018.m73("۠۠ۤ");
        r2 = r1;
        goto L3
    L10:
        r0 = new Paint(1);
        if ((C0053.f53 ^ (C0010.f10 / (-6131))) <= 0) goto L12;
        String r12 = "ۧ۠۟";
    L14:
        r3 = C0038.m153(r12);
        goto L3
    L12:
        C0060.m240();
        r3 = C0072.m288("ۢۡۡ");
        goto L3
    L15:
        r0.setTextAlign(Paint.Align.CENTER);
        if ((C0011.f11 - (C0065.f65 / (-2639))) >= 0) goto L17;
        r3 = (C0016.f16 / C0062.f62) ^ 1747684;
        goto L3
    L17:
        C0023.f23 = 42;
        r12 = "۠ۡۦ";
        goto L14
    L19:
        this.b = r0;
        if ((C0034.f34 * (C0006.f6 | 9740)) >= 0) goto L21;
    L21:
        r3 = C0055.m220("ۡۧ۠");
    L23:
        if (C0051.m206() >= 0) goto L24;
        r3 = (C0072.f72 + C0023.f23) ^ (-1746776);
        goto L3
    L24:
        C0073.m295();
        r3 = C0071.m286("ۡۧۥ");
        goto L3
    L27:
        if (C0067.m269() > 0) goto L23;
        r3 = C0068.m272("ۤ۠۠");
        goto L3
    L29:
        System.out.println(r2);
        if ((C0015.f15 | (C0061.f61 ^ 6578)) >= 0) goto L31;
        r3 = (C0018.f18 - C0021.f21) + 1746116;
        goto L3
    L31:
        C0007.m31();
        String r13 = "۠ۦۦ";
    L32:
        r3 = C0001.m5(r13);
        goto L3
    L34:
        this.a = new Paint(1);
        r13 = "ۣ۟ۤ";
        goto L32
    L36:
        if (C0012.m51() <= 0) goto L37;
        r3 = (C0003.f3 * C0071.f71) ^ (-1921742);
        goto L3
    L37:
        C0060.m240();
        r3 = C0004.m16("ۧۥۤ");
        goto L3
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r27) {
        Rect r18 = null;
        String r3 = null;
        String r4 = null;
        int r12 = 0;
        String r17 = null;
        String r16 = null;
        String r15 = null;
        String r19 = null;
        Paint r11 = null;
        String r13 = null;
        String r5 = null;
        int r9 = 0;
        String r23 = null;
        String r6 = null;
        float r25 = 0.0f;
        float r10 = 0.0f;
        Float r14 = null;
        int r24 = C0034.m138("ۦ۠ۧ");
        Paint r20 = null;
        String r21 = null;
        String r22 = null;
    L3:
        switch(r24) {
            case 56509: goto L6;
            case 56568: goto L97;
            case 1746687: goto L66;
            case 1746758: goto L32;
            case 1746780: goto L16;
            case 1746943: goto L137;
            case 1747779: goto L53;
            case 1747812: goto L85;
            case 1747865: goto L102;
            case 1748676: goto L48;
            case 1748704: goto L44;
            case 1748709: goto L119;
            case 1748891: goto L38;
            case 1749570: goto L12;
            case 1749634: goto L70;
            case 1749826: goto L8;
            case 1750565: goto L122;
            case 1750624: goto L119;
            case 1750687: goto L115;
            case 1750720: goto L24;
            case 1750784: goto L107;
            case 1750814: goto L141;
            case 1751499: goto L21;
            case 1751620: goto L66;
            case 1751652: goto L84;
            case 1751713: goto L59;
            case 1752516: goto L80;
            case 1752522: goto L126;
            case 1752702: goto L27;
            case 1753452: goto L55;
            case 1753453: goto L73;
            case 1753480: goto L70;
            case 1753483: goto L134;
            case 1753633: goto L94;
            case 1754375: goto L111;
            case 1754438: goto L129;
            case 1754658: goto L55;
            case 1755341: goto L33;
            case 1755622: goto L98;
            default: goto L3;
        };
    L6:
        if (C0055.m223() >= 0) goto L7;
        r21 = "zPhzAyEf+wA=\n";
        r22 = "78hDNGBZvQ==\n";
        r24 = (C0029.f29 - C0014.f14) + 1751038;
        goto L3
    L7:
        C0004.m18();
        r21 = "zPhzAyEf+wA=\n";
        r22 = "78hDNGBZvQ==\n";
        r24 = C0026.m105("۟ۢ۟");
        goto L3
    L8:
        String r2 = "+fo6dghWFw==\n";
        r5 = "2sp7TjwQUbw=\n";
        if ((C0028.f28 ^ (C0005.f5 - 7846)) <= 0) goto L10;
    L41:
        r13 = r2;
        r24 = C0049.m197("ۥۧ۠");
        goto L3
    L10:
        C0056.m224();
        r13 = "+fo6dghWFw==\n";
        r24 = C0025.m102("ۣ۠ۢ");
        goto L3
    L12:
        if (C0050.f50 <= 0) goto L13;
        r24 = (C0057.f57 * C0068.f68) + 1398780;
        goto L3
    L13:
        r24 = C0058.m234("۠ۤۨ");
        goto L3
    L16:
        if ((C0025.f25 / (C0069.f69 ^ 2582)) != 0) goto L17;
        String r26 = "ۡۢۡ";
        r19 = r4;
    L19:
        r24 = C0063.m254(r26);
        goto L3
    L17:
        C0040.f40 = 53;
        r19 = r4;
        r24 = C0017.m70("ۦۣۡ");
        goto L3
    L21:
        if ((C0049.f49 ^ (C0041.f41 % 1959)) <= 0) goto L22;
        r23 = r22;
        r6 = r21;
        r24 = (C0035.f35 + C0058.f58) + 1749296;
        goto L3
    L22:
        C0030.f30 = 81;
        r23 = r22;
        r6 = r21;
        r24 = C0030.m120("ۨۨۦ");
        goto L3
    L24:
        int r8 = Color.parseColor(u40.a(r15, r19));
        String r7 = "۟ۡۨ";
        Paint r28 = r11;
    L25:
        r11 = r28;
        r12 = r8;
        r24 = C0048.m193(r7);
        goto L3
    L27:
        if ((C0060.f60 | (C0026.f26 / 8213)) <= 0) goto L28;
        r6 = r5;
        r24 = (C0035.f35 * C0066.f66) ^ 1183025;
        goto L3
    L28:
        C0053.m214();
        String r29 = r5;
    L29:
        Object r72 = "ۣۣۨ";
        String r82 = r29;
    L30:
        r6 = r82;
        r24 = C0058.m234(r72);
        goto L3
    L32:
        r24 = (C0013.f13 ^ C0012.f12) + 1752039;
        goto L3
    L33:
        r28 = this.a;
        r28.setColor(r12);
        if (C0025.m103() >= 0) goto L35;
        String r83 = "۠ۤۨ";
        r11 = r28;
        Float r73 = r14;
    L37:
        r14 = r73;
        r24 = C0036.m144(r83);
        goto L3
    L35:
        C0071.m284();
        r7 = "ۢۡۡ";
        r8 = r12;
        goto L25
    L38:
        r9 = Color.parseColor(u40.a(r23, r6));
        if ((C0065.f65 | (C0013.f13 + 9383)) >= 0) goto L40;
        r72 = "ۣ۠ۦ";
        r82 = r6;
        goto L30
    L40:
        C0067.f67 = 81;
        r2 = r13;
        goto L41
    L44:
        if ((C0052.f52 | (C0021.f21 + 4975)) <= 0) goto L45;
        String r210 = "ۣۥۢ";
        r15 = r3;
    L47:
        r24 = C0037.m149(r210);
        goto L3
    L45:
        C0051.f51 = 61;
        r73 = r14;
        r83 = "ۣۤ۠";
        r15 = r3;
        goto L37
    L48:
        Float r211 = Float.decode(C0060.m243("dYLl86YdQj6oLyeeZ9lAqS6CATu"));
        if (C0046.f46 > 0) goto L52;
        String r74 = r16;
        String r84 = r17;
    L51:
        r24 = C0011.m45("ۨ۠");
        r14 = r211;
        r16 = r74;
        r17 = r84;
        goto L3
    L52:
        r83 = "۟ۧۧ";
        r73 = r211;
        goto L37
    L53:
        r24 = (C0061.f61 % C0057.f57) ^ 1748683;
        goto L3
    L55:
        if ((C0012.f12 / (C0060.f60 * (-24))) != 0) goto L56;
        r24 = (C0050.f50 ^ C0065.f65) ^ (-1750451);
        goto L3
    L56:
        C0052.m210();
        String r212 = "ۤ۠ۥ";
    L57:
        r24 = C0060.m241(r212);
        goto L3
    L59:
        ip.n(u40.a("Q3oMDltOiHdXN1ZiGhI=\n", "JB94TDQ75hM=\n"), r18);
        if (vd.e == false) goto L111;
        if (C0012.m51() <= 0) goto L63;
        r24 = (C0009.f9 + C0070.f70) + 1750905;
        goto L3
    L63:
        C0065.f65 = 43;
        r24 = C0069.m277("ۧ۟۟");
        goto L3
    L66:
        if (C0044.m178() >= 0) goto L67;
        r24 = (C0062.f62 ^ C0013.f13) + 1754732;
        goto L3
    L67:
        r210 = "ۣ۟۠";
        goto L47
    L70:
        if (C0039.m157() < 0) goto L72;
        C0053.m214();
        r24 = C0037.m149("ۨ۟");
        goto L3
    L72:
        r212 = "ۡۨۢ";
        goto L57
    L73:
        ip.o(u40.a("CwgLlefx\n", "aGll44aC2ew=\n"), r27);
        Rect r213 = getBounds();
        if ((C0049.f49 | (C0014.f14 % (-6553))) < 0) goto L77;
        C0062.f62 = 80;
        String r75 = r19;
    L76:
        r18 = r213;
        r19 = r75;
        r24 = C0050.m203("ۢ۟۟");
        goto L3
    L77:
        String r76 = "ۤۦۣ";
    L78:
        r18 = r213;
        r24 = C0045.m182(r76);
    L80:
        if (C0052.f52 > 0) goto L83;
        C0019.m77();
        String r214 = "ۡۤ۟";
    L82:
        r24 = C0003.m13(r214);
        goto L3
    L83:
        r212 = "ۦۣ";
        goto L57
    L84:
        r10 = ((r20.descent() + (r20.ascent() - 30.0f)) + 30.0f) / (C0002.f2 ^ 766);
        r72 = "ۥۡۦ";
        r82 = r6;
        goto L30
    L85:
        r27.drawRoundRect(new RectF(r18), 24.0f, 24.0f, r11);
        if (vd.e == false) goto L80;
        if (C0031.m124() <= 0) goto L89;
        String r215 = "ۢۧۧ";
    L91:
        r24 = C0049.m197(r215);
        goto L3
    L89:
        r24 = C0034.m138("ۦۣ");
        goto L3
    L94:
        if (C0020.m82() <= 0) goto L95;
        r23 = r13;
        r24 = (C0071.f71 - C0050.f50) ^ (-1748233);
        goto L3
    L95:
        C0026.m106();
        r23 = r13;
        r24 = C0011.m45("ۣۧۨ");
        goto L3
    L97:
        r213 = r18;
        r15 = r17;
        r75 = r16;
        goto L76
    L98:
        Paint r216 = this.b;
        r216.setColor(r9);
        if ((C0072.f72 * (C0068.f68 ^ 4582)) <= 0) goto L100;
        r20 = r216;
        r24 = (C0042.f42 * C0042.f42) ^ 1079543;
        goto L3
    L100:
        C0069.f69 = 92;
        r20 = r216;
        r24 = C0020.m80("ۤۦۣ");
        goto L3
    L102:
        r84 = "7ONTXMum5w==\n";
        r74 = "z6VhGvng0Lg=\n";
        if ((C0051.f51 / (C0029.f29 % (-4020))) == 0) goto L105;
        C0017.m71();
        r16 = "z6VhGvng0Lg=\n";
        r17 = "7ONTXMum5w==\n";
        r24 = C0012.m50("ۦ۠ۦ");
        goto L3
    L105:
        r211 = r14;
        goto L51
    L107:
        if ((C0055.f55 ^ (C0040.f40 | 3308)) >= 0) goto L108;
        r24 = (C0066.f66 | C0037.f37) + 1753588;
        goto L3
    L108:
        r24 = C0055.m220("ۨ۟ۤ");
    L111:
        if (C0057.f57 >= 0) goto L112;
        r24 = (C0065.f65 / C0009.f9) + 1747865;
        goto L3
    L112:
        r76 = "۟ۢۡ";
        r213 = r18;
        goto L78
    L115:
        if (C0011.m44() <= 0) goto L116;
        r24 = C0057.m229("ۦ۠ۧ");
        goto L3
    L116:
        r24 = C0029.m116("ۡۨۧ");
        goto L3
    L119:
        if ((C0032.f32 ^ (C0006.f6 - 4304)) <= 0) goto L120;
        r214 = "ۨۨۦ";
        goto L82
    L120:
        C0005.f5 = 9;
        r26 = "ۨۢ۟";
        goto L19
    L122:
        r3 = "1wzpssK2/Q==\n";
        r4 = "9D6qgIGEuCE=\n";
        if (C0050.f50 <= 0) goto L124;
        r24 = (C0037.f37 | C0017.f17) ^ (-1746813);
        goto L3
    L124:
        C0027.f27 = 40;
        r215 = "ۣۥۢ";
        goto L91
    L126:
        r27.drawText(u40.a("+O1WbQ==\n", "CHLF7Fz0VNI=\n"), r18.centerX(), ((r25 - 5.0f) - r10) + 5.0f, r20);
        if (C0035.m143() > 0) goto L134;
        r24 = (C0069.f69 * C0002.f2) + 1775416;
        goto L3
    L129:
        r20.setTextSize(r18.height() * 0.45f);
        float r77 = r18.centerY();
        if (C0047.m191() >= 0) goto L131;
        r24 = (C0054.f54 % C0034.f34) + 1750912;
        r25 = r77;
        goto L3
    L131:
        r24 = C0068.m272("ۦ۠ۧ");
        r25 = r77;
    L134:
        if (C0051.f51 >= 0) goto L135;
        r24 = (C0011.f11 | C0046.f46) + 1750946;
        goto L3
    L135:
        C0027.m111();
        r24 = C0007.m28("۟ۨ");
        goto L3
    L137:
        System.out.println(r14);
        if ((C0036.f36 | (C0006.f6 ^ 2046)) > 0) goto L140;
        C0014.f14 = 7;
        r24 = C0059.m239("ۥۡۦ");
        goto L3
    L140:
        r29 = r6;
        goto L29
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return C0060.f60 ^ (-957);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        int r0 = C0059.m239("ۤۥ۟");
    L3:
        switch(r0) {
            case 1750689: goto L6;
            case 1751678: goto L10;
            default: goto L3;
        };
    L6:
        if (C0004.m18() < 0) goto L9;
        C0021.f21 = 92;
        String r02 = "ۢ۟ۦ";
    L8:
        r0 = C0001.m5(r02);
        goto L3
    L9:
        r02 = "ۤۥ۟";
        goto L8
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r3) {
        int r0 = C0061.m246("ۥۧ");
    L3:
        switch(r0) {
            case 56482: goto L5;
            case 1753576: goto L7;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if (C0014.m58() <= 0) goto L8;
        r0 = (C0011.f11 % C0054.f54) ^ (-56394);
        goto L3
    L8:
        C0049.f49 = 9;
        r0 = C0033.m132("ۣۢۤ");
        goto L3
    }
}
