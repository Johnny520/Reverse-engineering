package defpackage;

import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.graphics.Color;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.C0007;
import android.view.View;
import androidx.activity.C0010;
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
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import io.fastkv.C0068;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlinx.coroutines.C0069;

/* JADX INFO: loaded from: classes.dex */
public final class y9 implements TextWatcher {
    public final g00 a;
    public final ArrayList b;
    public final g00 c;

    public y9(g00 r4, ArrayList r5, g00 r6) {
        int r2 = C0002.m8("ۥۢۢ");
        int r1 = 0;
    L3:
        switch(r2) {
            case 1746753: goto L5;
            case 1746843: goto L17;
            case 1746972: goto L21;
            case 1748612: goto L12;
            case 1749850: goto L31;
            case 1750565: goto L34;
            case 1752549: goto L25;
            case 1753542: goto L7;
            case 1753603: goto L29;
            default: goto L3;
        };
    L5:
        this.b = r5;
        r2 = (C0041.f41 ^ C0061.f61) ^ 1753628;
        goto L3
    L7:
        if (C0025.m103() < 0) goto L31;
        if ((C0017.f17 % (C0004.f4 ^ 6516)) > 0) goto L11;
        C0068.f68 = 16;
    L11:
        r2 = C0064.m258("ۡ۟ۢ");
        goto L3
    L12:
        int r0 = Integer.parseInt(C0033.m133("Wj3p7KcNDm880a"));
        if (C0073.f73 <= 0) goto L14;
        r2 = C0047.m189("۟ۨۥ");
        r1 = r0;
        goto L3
    L14:
        C0033.f33 = 91;
        r2 = C0042.m170("۟ۤ۠");
        r1 = r0;
        goto L3
    L17:
        if (C0045.f45 < 0) goto L20;
        C0071.f71 = 30;
        String r02 = "ۧۨۦ";
    L19:
        r2 = C0012.m50(r02);
        goto L3
    L20:
        r02 = "ۥۢۢ";
        goto L19
    L21:
        System.out.println(r1);
        if (C0025.f25 >= 0) goto L23;
        r2 = (C0032.f32 - C0042.f42) + 1750119;
        goto L3
    L23:
        C0058.m232();
        r2 = C0052.m209("ۥۢۢ");
        goto L3
    L25:
        this.a = r4;
        if ((C0015.f15 + (C0026.f26 * (-3977))) >= 0) goto L27;
        r2 = C0019.m79("ۣ۟ۡ");
    L27:
        r2 = C0071.m286("ۦۣۣ");
        goto L3
    L29:
        this.c = r6;
    L31:
        if ((C0023.f23 * (C0052.f52 * 7132)) >= 0) goto L32;
        r02 = "ۣ۠ۢ";
        goto L19
    L32:
        C0063.f63 = 14;
        r2 = C0056.m226("ۣۢۤ");
        goto L3
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r20) {
        String r6 = null;
        String r5 = null;
        String r10 = null;
        String r3 = null;
        Pattern r4 = null;
        ArrayList r8 = null;
        int r7 = 0;
        int r14 = 0;
        Object r2 = null;
        int r9 = 0;
        int r12 = 0;
        int r18 = C0020.m80("ۣۨ");
        Pattern r15 = null;
        String r16 = null;
        String r17 = null;
    L3:
        switch(r18) {
            case 56448: goto L5;
            case 56571: goto L88;
            case 1746723: goto L81;
            case 1746904: goto L79;
            case 1747718: goto L27;
            case 1747834: goto L80;
            case 1748797: goto L84;
            case 1748799: goto L39;
            case 1749570: goto L63;
            case 1749633: goto L93;
            case 1749822: goto L11;
            case 1750565: goto L20;
            case 1750633: goto L45;
            case 1750722: goto L20;
            case 1750816: goto L73;
            case 1751530: goto L38;
            case 1751717: goto L17;
            case 1751748: goto L107;
            case 1751749: goto L8;
            case 1751779: goto L49;
            case 1752458: goto L57;
            case 1752584: goto L98;
            case 1752708: goto L82;
            case 1753569: goto L94;
            case 1753575: goto L33;
            case 1753666: goto L103;
            case 1753695: goto L54;
            case 1754383: goto L45;
            case 1755372: goto L51;
            case 1755376: goto L24;
            case 1755431: goto L106;
            default: goto L3;
        };
    L107:
        ((View) r2).setBackground(null);     // Catch: Exception -> L67
        String r11 = "۠ۥ۟";
        r12 = r9;
        int r13 = r9;
    L15:
        r18 = C0034.m138(r11);
        r9 = r13;
    L69:
        if (C0061.m244() > 0) goto L72;
        C0027.m111();
        String r1 = "ۦۣۧ";
    L71:
        r18 = C0052.m209(r1);
        goto L3
    L72:
        r1 = "ۣۢۨ";
        goto L71
    L5:
        if (r16 == null) goto L81;
        r6 = b50.T(r16).toString();
        r18 = (C0072.f72 ^ C0068.f68) + 1753245;
        goto L3
    L8:
        if (r4.matcher(r5).matches() == false) goto L45;
        String r19 = "ۦۨۡ";
    L10:
        r18 = C0054.m219(r19);
        goto L3
    L11:
        String r110 = u40.a("bWUlmtK4lCl1J1PMovrjeRc=\n", "M0Z+qv+B1QQ=\n");
        ip.o("pattern", r110);
        if ((C0003.f3 * (C0040.f40 - 1360)) < 0) goto L14;
        C0036.f36 = 48;
        r10 = r110;
        r18 = C0025.m102("ۨۢۡ");
        goto L3
    L14:
        r11 = "ۢ۟۟";
        r10 = r110;
        r13 = r9;
        goto L15
    L17:
        if (C0060.f60 <= 0) goto L18;
        r5 = r17;
        r18 = (C0035.f35 / C0066.f66) + 1749822;
        goto L3
    L18:
        C0028.f28 = 5;
        r5 = r17;
        r18 = C0064.m258("ۧ۟ۧ");
        goto L3
    L20:
        r18 = (C0047.f47 - C0033.f33) ^ (-1752406);
        goto L3
    L24:
        int r111 = (C0020.f20 ^ (-253)) + r12;
        if ((C0012.f12 ^ (C0018.f18 * 5947)) > 0) goto L77;
        C0052.m210();
        r18 = C0004.m16("ۢ۟۟");
        r9 = r111;
    L77:
        r11 = "ۤۧۧ";
        r13 = r111;
        goto L15
    L27:
        ip.n("compile(...)", r4);
        if (C0053.f53 <= 0) goto L29;
        r18 = (C0022.f22 ^ C0036.f36) + 1751871;
        goto L3
    L29:
        C0025.m103();
        String r112 = r3;
    L30:
        r3 = r112;
        r18 = C0061.m246("ۦۤ۟");
        goto L3
    L33:
        if ((C0018.f18 + (C0015.f15 ^ (-3510))) <= 0) goto L34;
        String r113 = "ۣۨۥ";
        r5 = r6;
        int r114 = r14;
    L37:
        r18 = C0066.m264(r113);
        r14 = r114;
        goto L3
    L34:
        C0024.f24 = 90;
        Pattern r115 = r4;
        r5 = r6;
    L35:
        r4 = r115;
        r18 = C0024.m98("۠ۡۧ");
    L38:
        r18 = (C0067.f67 % C0062.f62) + 1753847;
        goto L3
    L39:
        this.c.a = -1;     // Catch: Exception -> L67
        if ((C0035.f35 / (C0044.f44 + 2223)) != 0) goto L42;
        r18 = (C0033.f33 / C0057.f57) + 1755431;
        goto L3
    L42:
        r18 = C0059.m239("ۨ۠ۨ");
    L45:
        if ((C0055.f55 ^ (C0073.f73 / (-8281))) >= 0) goto L46;
        r18 = (C0046.f46 ^ C0036.f36) + 1754894;
        goto L3
    L46:
        C0052.f52 = 84;
        String r116 = "ۥۨۦ";
    L47:
        r18 = C0015.m60(r116);
        goto L3
    L49:
        r18 = (C0018.f18 | C0034.f34) + 1753243;
        r12 = r14;
        goto L3
    L51:
        if ((C0069.f69 * (C0026.f26 + 9171)) >= 0) goto L52;
        r17 = "";
        r18 = (C0049.f49 + C0067.f67) + 1751814;
        goto L3
    L52:
        C0052.m210();
        r17 = "";
        r18 = C0034.m138("ۨ۠ۤ");
        goto L3
    L54:
        this.a.a = Color.parseColor(r5);     // Catch: Exception -> L67
        r8 = this.b;     // Catch: Exception -> L67
    L56:
        r18 = C0067.m271("ۥۧۦ");
        goto L3
    L57:
        if (r12 >= r7) goto L103;
        r2 = r8.get(r12);     // Catch: Exception -> L67
        if ((C0010.f10 * (C0041.f41 + 4646)) >= 0) goto L61;
        r18 = C0018.m73("ۨ۠ۨ");
        goto L3
    L61:
        C0062.m248();
        goto L56
    L63:
        Pattern r117 = Pattern.compile(r10);
        ip.n("compile(...)", r117);
        if (C0057.m230() >= 0) goto L65;
        r15 = r117;
        r18 = (C0007.f7 | C0062.f62) + 1753113;
        goto L3
    L65:
        r15 = r117;
        r18 = C0043.m173("ۤۨۧ");
        goto L3
    L73:
        if (r6 != null) goto L79;
        if (C0018.f18 <= 0) goto L76;
        r18 = (C0016.f16 + C0065.f65) ^ (-1755523);
        goto L3
    L76:
        C0026.m106();
        r111 = r9;
    L79:
        r18 = (C0014.f14 - C0032.f32) + 1750132;
        goto L3
    L80:
        r18 = (C0026.f26 - C0032.f32) ^ 1749617;
    L81:
        r18 = C0037.m149("ۨ۠ۤ");
        goto L3
    L82:
        r7 = r8.size();     // Catch: Exception -> L67
        r116 = "ۡۥۡ";
        goto L47
    L84:
        r114 = 0;
        if ((C0032.f32 * (C0032.f32 % (-1119))) <= 0) goto L86;
        r18 = (C0031.f31 % C0048.f48) ^ (-1751690);
        r14 = 0;
        goto L3
    L86:
        C0049.m199();
        r113 = "ۢۡ۠";
        goto L37
    L88:
        if (r20 == null) goto L81;
        String r118 = r20.toString();
        if ((C0034.f34 * (C0005.f5 * 5275)) >= 0) goto L91;
        r16 = r118;
        r18 = (C0012.f12 | C0012.f12) + 56333;
        goto L3
    L91:
        C0046.m185();
        r16 = r118;
        r18 = C0054.m219("ۤۧۨ");
        goto L3
    L93:
        r18 = (C0064.f64 ^ C0038.f38) ^ (-56601);
        goto L3
    L94:
        ip.o("pattern", r3);
        r115 = Pattern.compile(r3);
        if ((C0005.f5 - (C0057.f57 - 6564)) > 0) goto L35;
        C0029.m118();
        r4 = r115;
        r18 = C0066.m264("ۦۤۥ");
        goto L3
    L98:
        if (r15.matcher(r5).matches() == true) goto L38;
        r112 = u40.a("e94axQfq7kZjnGyTd6iXFgE=\n", "Jf1B9SrTr2s=\n");
        if (C0063.f63 > 0) goto L30;
        C0009.f9 = 32;
        r3 = r112;
        r18 = C0030.m120("ۣۨ");
    L103:
        if (C0047.m191() >= 0) goto L104;
        r18 = (C0002.f2 % C0058.f58) + 1748035;
        goto L3
    L104:
        C0002.m10();
        r19 = "ۦۢ";
        goto L10
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r4, int r5, int r6, int r7) {
        Integer r0 = null;
        int r1 = C0006.m26("۠ۢۨ");
    L3:
        switch(r1) {
            case 1747649: goto L5;
            case 1747750: goto L8;
            case 1749578: goto L15;
            case 1750657: goto L10;
            case 1751496: goto L6;
            case 1753421: goto L12;
            default: goto L3;
        };
    L5:
        return;
    L6:
        r0 = Integer.decode(C0013.m54("gbIGEhTlb"));
        r1 = (C0004.f4 * C0020.f20) ^ 1587289;
        goto L3
    L8:
        if (C0063.m253() > 0) goto L12;
        r1 = (C0012.f12 / C0038.f38) + 1751496;
        goto L3
    L10:
        System.out.println(r0);
        r1 = (C0071.f71 + C0044.f44) + 1747917;
    L12:
        if (C0003.m14() >= 0) goto L13;
        r1 = (C0027.f27 % C0034.f34) + 1748092;
        goto L3
    L13:
        r1 = C0001.m5("۠ۨۢ");
        goto L3
    L15:
        r1 = (C0026.f26 + C0008.f8) + 1747839;
        goto L3
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r2, int r3, int r4, int r5) {
        int r0 = C0008.m35("ۥۣ");
    L3:
        switch(r0) {
            case 56478: goto L5;
            case 1746882: goto L7;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if (C0038.f38 < 0) goto L10;
        String r02 = "ۤۧۤ";
    L9:
        r0 = C0035.m140(r02);
        goto L3
    L10:
        r02 = "ۥۣ";
        goto L9
    }
}
