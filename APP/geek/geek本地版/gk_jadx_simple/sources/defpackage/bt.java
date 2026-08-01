package defpackage;

import android.app.Activity;
import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.app.Dialog;
import android.net.Uri;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.C0010;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.widget.C0018;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
import androidx.core.content.C0023;
import androidx.core.content.C0024;
import androidx.core.widget.C0025;
import androidx.emoji2.text.C0026;
import androidx.fragment.app.C0027;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0030;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.recyclerview.widget.C0033;
import androidx.savedstate.C0034;
import androidx.savedstate.C0035;
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
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0053;
import com.google.android.material.carousel.C0054;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import com.google.android.material.chip.C0057;
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
public final class bt extends WebViewClient {
    public final Activity a;
    public final Dialog b;
    public final Dialog c;

    public bt(Activity r4, Dialog r5, Dialog r6) {
        this.a = r4;
        this.b = r5;
        this.c = r6;
        Integer r1 = null;
        int r0 = C0065.m263("ۧۨۥ");
    L3:
        switch(r0) {
            case 1746785: goto L6;
            case 1746944: goto L19;
            case 1747656: goto L9;
            case 1749794: goto L12;
            case 1750721: goto L21;
            case 1754660: goto L17;
            default: goto L3;
        };
    L6:
        if ((C0030.f30 * (C0038.f38 * 4418)) >= 0) goto L7;
        r0 = (C0040.f40 * C0043.f43) ^ 1579097;
        goto L3
    L7:
        C0054.f54 = 25;
        r0 = C0044.m176("ۢۢۥ");
        goto L3
    L9:
        if ((C0020.f20 * (C0014.f14 / (-1827))) != 0) goto L10;
        r0 = (C0019.f19 - C0044.f44) ^ (-1754914);
        goto L3
    L10:
        C0019.m77();
        r0 = C0018.m73("ۧ۟۟");
        goto L3
    L12:
        System.out.println(r1);
        if ((C0051.f51 ^ (C0057.f57 ^ (-1749))) >= 0) goto L14;
        r0 = (C0031.f31 + C0059.f59) + 1751544;
        goto L3
    L14:
        C0042.f42 = 61;
        r0 = C0000.m2("ۧۨۥ");
        goto L3
    L17:
        if (C0027.m111() > 0) goto L6;
        r0 = (C0022.f22 % C0057.f57) + 1747309;
        goto L3
    L19:
        r1 = Integer.decode(C0026.m107("IJ8f5RwwIut"));
        r0 = (C0025.f25 % C0068.f68) ^ (-1749009);
        goto L3
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView r12, String r13) {
        Dialog r7 = null;
        Activity r3 = null;
        String r5 = null;
        gn r8 = null;
        String r2 = null;
        StringBuilder r9 = null;
        String r0 = null;
        Uri r6 = null;
        int r10 = C0045.m182("ۨۨۢ");
    L3:
        switch(r10) {
            case 56324: goto L148;
            case 56417: goto L119;
            case 56544: goto L123;
            case 56568: goto L70;
            case 1746691: goto L37;
            case 1746723: goto L92;
            case 1746757: goto L110;
            case 1746785: goto L62;
            case 1746880: goto L142;
            case 1746939: goto L126;
            case 1747743: goto L15;
            case 1747773: goto L55;
            case 1747781: goto L41;
            case 1748642: goto L69;
            case 1748738: goto L75;
            case 1748888: goto L114;
            case 1748890: goto L50;
            case 1749603: goto L80;
            case 1749668: goto L85;
            case 1749827: goto L55;
            case 1749855: goto L47;
            case 1750571: goto L56;
            case 1751779: goto L8;
            case 1752516: goto L30;
            case 1752643: goto L143;
            case 1752703: goto L55;
            case 1752710: goto L97;
            case 1753453: goto L137;
            case 1753509: goto L35;
            case 1753605: goto L19;
            case 1754598: goto L132;
            case 1755368: goto L99;
            case 1755553: goto L25;
            case 1755618: goto L104;
            default: goto L3;
        };
    L148:
        r6 = Uri.parse(r13);     // Catch: Exception -> L53
        String r4 = "ۣۡۤ";
        Activity r1 = r3;
    L7:
        r3 = r1;
        r10 = C0059.m239(r4);
    L54:
        r10 = (C0072.f72 ^ C0038.f38) + 1746989;
        goto L3
    L8:
        s20.a.getClass();     // Catch: Exception -> L53
        if (C0048.f48 <= 0) goto L11;
        r10 = (C0054.f54 / C0038.f38) + 1748890;
        goto L3
    L11:
        String r14 = "ۢۨۥ";
    L12:
        r10 = C0068.m272(r14);
        goto L3
    L15:
        if (C0055.m223() < 0) goto L18;
        C0026.f26 = 31;
        String r15 = "ۨۦۥ";
    L17:
        r10 = C0067.m271(r15);
        goto L3
    L18:
        r15 = "ۨۨۢ";
        goto L17
    L19:
        r7.dismiss();     // Catch: Exception -> L53
        if (C0033.m135() < 0) goto L24;
        C0031.m124();
        String r16 = "ۣ۠ۨ";
    L23:
        r10 = C0059.m239(r16);
        goto L3
    L24:
        r15 = "۟ۥۦ";
    L25:
        r1 = r3;
    L27:
        if (C0043.m172() < 0) goto L29;
        r4 = "ۦۦ۠";
        goto L7
    L29:
        r4 = "ۡ۠ۡ";
    L30:
        Dialog r17 = r7;
    L32:
        if ((C0063.f63 | (C0065.f65 - 2780)) >= 0) goto L33;
        r7 = r17;
        r10 = (C0002.f2 * C0063.f63) ^ 1733059;
        goto L3
    L33:
        r7 = r17;
        r10 = C0068.m272("ۡۤ۠");
        goto L3
    L35:
        r10 = (C0031.f31 / C0016.f16) ^ 1752703;
        goto L3
    L37:
        if (C0034.f34 >= 0) goto L38;
        r10 = C0067.m271("۠ۤ");
        goto L3
    L38:
        C0026.f26 = 91;
        String r18 = "۟ۢۨ";
    L39:
        r10 = C0047.m189(r18);
        goto L3
    L41:
        gn r19 = gn.a;     // Catch: Exception -> L53
        if (C0068.f68 >= 0) goto L44;
        r8 = r19;
        r10 = C0006.m26("ۢ۠ۡ");
        goto L3
    L44:
        r8 = r19;
        r10 = C0034.m138("ۣ۟ۧ");
        goto L3
    L47:
        if (C0063.f63 <= 0) goto L48;
        r10 = C0056.m226("ۣۤ");
        goto L3
    L48:
        C0051.m206();
        r10 = C0025.m102("ۣۨۧ");
        goto L3
    L50:
        r8.getClass();     // Catch: Exception -> L53
        String r110 = "ۥۥۣ";
    L52:
        r10 = C0060.m241(r110);
    L55:
        r10 = C0021.m86("۟ۥۦ");
        goto L3
    L56:
        gn.h(u40.a("NrL/ZKa8wLoCu+hc\n", "XdeGO8vTo9E=\n"), r0);     // Catch: Exception -> L53
        StringBuilder r42 = new StringBuilder("✅ 坐标已更新: ");     // Catch: Exception -> L53
        if ((C0064.f64 ^ (C0000.f0 / (-2925))) > 0) goto L61;
        C0070.m280();
        String r111 = "ۨۨۢ";
    L60:
        r9 = r42;
        r10 = C0021.m86(r111);
        goto L3
    L61:
        r111 = "ۥۧۨ";
        goto L60
    L62:
        r9.append(r0);     // Catch: Exception -> L53
        if (C0023.m92() >= 0) goto L65;
        String r112 = "۟ۡۧ";
    L67:
        r10 = C0068.m272(r112);
        goto L3
    L65:
        r10 = C0063.m254("ۥۥۣ");
        goto L3
    L69:
        return super.shouldOverrideUrlLoading(r12, r13);
    L70:
        r7.dismiss();     // Catch: Exception -> L53
        if ((C0053.f53 - (C0069.f69 * 4403)) <= 0) goto L73;
        r10 = C0014.m57("ۢۢۤ");
        goto L3
    L73:
        C0031.f31 = 16;
        r112 = "ۡ۠ۡ";
        goto L67
    L75:
        r2 = r6.getQueryParameter(u40.a("f0vd\n", "EyqpylhAgXQ=\n"));     // Catch: Exception -> L53
        if ((C0059.f59 ^ (C0007.f7 * (-8191))) > 0) goto L79;
        C0069.f69 = 22;
        r10 = C0046.m186("۟ۡۧ");
        goto L3
    L79:
        r16 = "ۣ۟ۧ";
        goto L23
    L80:
        r5 = u40.a("M26zz+sheFgHZ6vk\n", "WAvKkIZOGzM=\n");     // Catch: Exception -> L53
        if (C0009.m36() < 0) goto L84;
        r10 = C0066.m264("۠ۢۡ");
        goto L3
    L84:
        r4 = "ۡۨۡ";
        r1 = r3;
        goto L7
    L85:
        this.c.dismiss();     // Catch: Exception -> L53
        if ((C0027.f27 ^ (C0035.f35 / (-6640))) >= 0) goto L88;
        r10 = (C0022.f22 ^ C0026.f26) + 1751834;
        goto L3
    L88:
        String r113 = "ۨۦ۟";
    L89:
        r10 = C0052.m209(r113);
        goto L3
    L92:
        if (ip.i(r6.getQueryParameter(u40.a("JQHiueCa\n", "RGKW0I/0u54=\n")), u40.a("j9Y0PEUM\n", "7LdaXyBg374=\n")) == false) goto L55;
        if ((C0068.f68 * (C0053.f53 / (-7605))) != 0) goto L95;
        r10 = (C0032.f32 - C0060.f60) ^ (-1754948);
        goto L3
    L95:
        C0054.f54 = 95;
        r110 = "ۥۧۡ";
        goto L52
    L97:
        r9.append(r2);     // Catch: Exception -> L53
        r10 = (C0004.f4 * C0062.f62) ^ 1264828;
        goto L3
    L99:
        r9.append(", ");     // Catch: Exception -> L53
        if (C0054.f54 > 0) goto L103;
        C0066.m265();
        r10 = C0055.m220("۟ۢۤ");
        goto L3
    L103:
        r113 = "۟ۢۤ";
        goto L89
    L104:
        r1 = this.a;
        if (r13 == null) goto L27;
        if ((C0044.f44 ^ (C0024.f24 | (-7453))) >= 0) goto L108;
        r3 = r1;
        r10 = 1755143 + (C0032.f32 + C0067.f67);
        goto L3
    L108:
        C0010.m40();
        r3 = r1;
        r10 = C0033.m132("ۣ۟۟");
        goto L3
    L110:
        gn.k(r3, r9.toString());     // Catch: Exception -> L53
        if (C0054.m217() >= 0) goto L113;
    L129:
        r10 = C0068.m272("ۨ۠");
        goto L3
    L113:
        C0002.m10();
        r10 = C0048.m193("ۦۢۡ");
        goto L3
    L114:
        s20.a(r3);     // Catch: Exception -> L53
        if ((C0021.f21 / (C0000.f0 ^ (-5900))) != 0) goto L117;
        r10 = (C0053.f53 | C0067.f67) + 1753644;
        goto L3
    L117:
        C0054.f54 = 58;
        r10 = C0042.m170("ۣۤ");
        goto L3
    L119:
        r17 = this.b;
        if (r2 == null) goto L32;
        r7 = r17;
        r10 = (C0028.f28 | C0045.f45) + 1753489;
        goto L3
    L123:
        if (C0001.m4() <= 0) goto L124;
        r10 = (C0006.f6 / C0031.f31) + 1747785;
        goto L3
    L124:
        C0035.f35 = 8;
        r10 = C0019.m79("ۣۨۥ");
        goto L3
    L126:
        r0 = r6.getQueryParameter(u40.a("FOxA\n", "eIIncQUbiPo=\n"));     // Catch: Exception -> L53
        if (C0031.m124() <= 0) goto L129;
        r112 = "ۣۤ";
        goto L67
    L132:
        if (b50.N(r13, u40.a("5UC++OmHXlboUaGmsMkdXe9VqeM=\n", "jTTKiNOocTE=\n"), false) == false) goto L25;
        if (C0059.f59 >= 0) goto L135;
        r10 = (C0056.f56 + C0052.f52) + 56077;
        goto L3
    L135:
        r10 = C0040.m160("ۡۨۡ");
        goto L3
    L137:
        if (r0 == null) goto L30;
        if ((C0039.f39 ^ (C0066.f66 | 5017)) < 0) goto L141;
        C0003.f3 = 24;
        r10 = C0059.m239("ۥۧۨ");
        goto L3
    L141:
        r18 = "ۣ۠ۨ";
        goto L39
    L142:
        return true;
    L143:
        gn.h(r5, r2);     // Catch: Exception -> L53
        if ((C0008.f8 % (C0042.f42 * (-774))) < 0) goto L147;
        C0040.f40 = 82;
        r10 = C0060.m241("ۡۨ۟");
        goto L3
    L147:
        r14 = "ۣ۠ۨ";
        goto L12
    }
}
