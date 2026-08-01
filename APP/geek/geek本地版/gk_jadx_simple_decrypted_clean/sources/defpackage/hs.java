package defpackage;

import android.app.Application;
import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import android.view.View;
import android.view.ViewGroup;
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
import com.google.android.material.datepicker.C0059;
import com.google.android.material.floatingactionbutton.C0060;
import com.google.android.material.internal.C0061;
import com.google.android.material.theme.C0062;
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C0068;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hs {
    public static final hs a = null;
    public static final ConcurrentHashMap b = null;
    public static final ConcurrentHashMap c = null;
    public static volatile boolean d;

    static {
        int r0 = C0025.m102("ۡۤۧ");
    L3:
        switch(r0) {
            case 1748772: goto L5;
            case 1749571: goto L7;
            case 1749608: goto L15;
            case 1750563: goto L10;
            case 1750565: goto L14;
            default: goto L3;
        };
    L5:
        a = new hs();
        r0 = (C0069.f69 / C0036.f36) ^ 1750563;
        goto L3
    L7:
        if ((C0014.f14 + (C0013.f13 + 9231)) <= 0) goto L8;
        r0 = (C0045.f45 % C0058.f58) + 1749068;
        goto L3
    L8:
        r0 = C0008.m35("ۧۤ۠");
        goto L3
    L10:
        b = new ConcurrentHashMap();
        if ((C0022.f22 / (C0022.f22 + 399)) <= 0) goto L12;
        r0 = (C0029.f29 * C0002.f2) + 1935453;
        goto L3
    L12:
        C0012.f12 = 66;
        r0 = C0044.m176("ۢ۠ۦ");
        goto L3
    L14:
        c = new ConcurrentHashMap();
        r0 = (C0045.f45 % C0047.f47) + 1749614;
        goto L3
    }

    public static String a(String r23, String r24) {
        Locale r18 = null;
        String r17 = null;
        String r3 = null;
        StringBuilder r15 = null;
        int r8 = 0;
        int r7 = 0;
        String r19 = null;
        int r5 = 0;
        int r6 = 0;
        String r12 = null;
        String r16 = null;
        String r11 = null;
        String r4 = null;
        String r10 = null;
        String r20 = null;
        int r21 = 0;
        int r22 = C0006.m26("ۧ۠ۤ");
    L3:
        switch(r22) {
            case 56383: goto L5;
            case 1746750: goto L16;
            case 1747684: goto L20;
            case 1747809: goto L31;
            case 1747933: goto L179;
            case 1748708: goto L14;
            case 1748795: goto L13;
            case 1749664: goto L74;
            case 1749672: goto L8;
            case 1750753: goto L180;
            case 1751497: goto L45;
            case 1751554: goto L55;
            case 1751778: goto L37;
            case 1752456: goto L41;
            case 1752487: goto L52;
            case 1752555: goto L7;
            case 1753452: goto L60;
            case 1753574: goto L39;
            case 1753578: goto L83;
            case 1754411: goto L79;
            case 1754505: goto L84;
            case 1754630: goto L63;
            case 1755467: goto L25;
            case 1755556: goto L67;
            default: goto L3;
        };
    L5:
        return "";
    L180:
        return r10;
    L7:
        r19 = r23.substring((0 - ((0 - r24.length()) - r8)) + (C0011.f11 ^ (-225)), r7);
        ip.n("substring(...)", r19);
        r22 = (C0064.f64 + C0070.f70) ^ 1747265;
        goto L3
    L8:
        ip.n("toLowerCase(...)", r17);
        r3 = r24.toLowerCase(r18);
        if ((C0004.f4 + (C0040.f40 + 8015)) <= 0) goto L10;
        String r9 = r16;
    L12:
        r16 = r9;
        r22 = C0020.m80("۠ۤۥ");
    L10:
        r22 = C0060.m241("ۣۧۥ");
        goto L3
    L13:
        String r92 = r15.toString();
        int r13 = C0047.f47 ^ (-16);
        r20 = r92;
        r21 = r13;
        r22 = (C0022.f22 / C0015.f15) + 1751497;
    L14:
        r22 = C0057.m229("ۢۡ");
        goto L3
    L16:
        if ((C0035.f35 | (C0019.f19 * (-8074))) >= 0) goto L17;
        r10 = r4;
        r22 = (C0055.f55 % C0049.f49) + 1750777;
        goto L3
    L17:
        C0023.f23 = 41;
        r10 = r4;
        r22 = C0037.m149("۠۠ۤ");
    L20:
        if ((C0003.f3 + (C0071.f71 - 5581)) >= 0) goto L21;
        r22 = (C0072.f72 + C0037.f37) + 1756815;
        goto L3
    L21:
        String r93 = "ۨ۟ۤ";
    L22:
        r22 = C0047.m189(r93);
        goto L3
    L25:
        if (b50.N(r16, "<![CDATA[", true) == false) goto L39;
        String r14 = r16.substring(C0034.f34 ^ (-918));
        if ((C0018.f18 + (C0035.f35 % 3268)) <= 0) goto L28;
        r11 = r14;
        r22 = (C0018.f18 + C0012.f12) + 1753258;
        goto L3
    L28:
        C0016.f16 = 21;
        String r94 = r12;
        Object r132 = "ۧۧۦ";
    L29:
        r12 = r94;
        r11 = r14;
        r22 = C0072.m288(r132);
        goto L3
    L31:
        ip.n("toLowerCase(...)", r3);
        StringBuilder r95 = new StringBuilder("<");
        if ((C0026.f26 ^ (C0056.f56 + 7078)) <= 0) goto L33;
        String r133 = "ۤۨۦ";
    L36:
        r15 = r95;
        r22 = C0058.m234(r133);
        goto L3
    L33:
        C0009.m36();
        String r134 = "ۥ۟ۢ";
    L34:
        r15 = r95;
        r22 = C0058.m234(r134);
        goto L3
    L37:
        r15.append(r3);
        r15.append("><![cdata[");
    L38:
        r22 = C0036.m144("ۡۥ۟");
    L39:
        r93 = "ۣۦۤ";
        goto L22
    L41:
        if (b50.C(r11, "]]>") == false) goto L39;
        r4 = r11.substring(0, r11.length() + (C0029.f29 ^ 243));
        if (C0051.m206() < 0) goto L10;
        C0040.f40 = 83;
        r22 = C0043.m173("۟ۡ۠");
        goto L3
    L45:
        r8 = b50.G(r17, r20, 0, false, r21);
        if (r8 == (-1)) goto L20;
        if (C0026.f26 > 0) goto L50;
        C0052.m210();
        r22 = C0026.m105("ۦۤۨ");
        goto L3
    L50:
        r134 = "ۢۢ۠";
        r95 = r15;
        goto L34
    L179:
        return r19;
    L52:
        r6 = b50.G(r17, z30.j("</", r3, ">"), r5, false, 4);
        if (r6 == (-1)) goto L14;
        r22 = (C0070.f70 | C0013.f13) ^ (-1752019);
        goto L3
    L55:
        r94 = r23.substring((r5 - (0 - r24.length())) + (C0031.f31 ^ (-105)), r6);
        ip.n("substring(...)", r94);
        if ((C0005.f5 | (C0019.f19 * 9655)) > 0) goto L58;
        C0019.m77();
        r12 = r94;
        r22 = C0035.m140("ۧ۠ۤ");
        goto L3
    L58:
        r132 = "ۧۧۦ";
        r14 = r11;
        goto L29
    L60:
        if (C0071.f71 >= 0) goto L61;
        r22 = (C0030.f30 / C0027.f27) ^ 1754411;
        goto L3
    L61:
        C0048.f48 = 34;
        r133 = "ۨ۟۠";
        r95 = r15;
        goto L36
    L63:
        String r135 = b50.T(r12).toString();
        if (C0000.m0() >= 0) goto L65;
        r16 = r135;
        r10 = r135;
        r22 = (C0070.f70 - C0063.f63) + 1755012;
        goto L3
    L65:
        C0000.f0 = 15;
        r9 = r135;
        r10 = r135;
        goto L12
    L67:
        r5 = b50.G(r17, z30.j("<", r3, ">"), 0, false, r21);
        if (r5 == (-1)) goto L14;
        if ((C0005.f5 | (C0069.f69 | 7098)) >= 0) goto L71;
        r22 = (C0070.f70 - C0036.f36) ^ (-1752307);
        goto L3
    L71:
        C0008.f8 = 90;
        String r142 = "ۢۢۨ";
        String r96 = r17;
        Locale r136 = r18;
    L72:
        r17 = r96;
        r18 = r136;
        r22 = C0038.m153(r142);
        goto L3
    L74:
        r7 = b50.G(r17, z30.j("]]></", r3, ">"), r8, false, 4);
        if (r7 == (-1)) goto L20;
        if ((C0034.f34 ^ (C0006.f6 / 1599)) >= 0) goto L38;
        r93 = "ۥۢۨ";
        goto L22
    L79:
        r136 = Locale.ROOT;
        r96 = r23.toLowerCase(r136);
        if ((C0020.f20 ^ (C0051.f51 - 7876)) > 0) goto L82;
        r17 = r96;
        r18 = r136;
        r22 = C0027.m110("ۣۦۤ");
        goto L3
    L82:
        r142 = "ۢۢۨ";
        goto L72
    L83:
        ip.n("substring(...)", r11);
        r93 = "ۥ۟ۢ";
        r10 = r11;
        goto L22
    L84:
        ip.n("substring(...)", r4);
        if (C0058.m232() <= 0) goto L86;
        r22 = (C0053.f53 * C0014.f14) + 1786821;
        goto L3
    L86:
        r22 = C0022.m90("ۤۨۦ");
        goto L3
    }

    public static void b(ContentValues r12) {
        boolean r7 = true;
        "cv";
        String r8 = r12.getAsString("content");
        int r0 = 1616;
    L3:
        r0 = r0 ^ 1633;
        switch(r0) {
            case 14: goto L6;
            case 49: goto L7;
            case 204: goto L9;
            case 239: goto L14;
            default: goto L3;
        };
    L6:
        r0 = 1678;
        goto L3
    L7:
        if (r8 != null) goto L6;
        r0 = 1709;
        goto L3
    L9:
        int r02 = 1740;
    L10:
        r02 = r02 ^ 1757;
        switch(r02) {
            case 17: goto L13;
            case 54: goto L80;
            default: goto L10;
        };
    L13:
        r02 = 1771;
    L80:
        int r1 = C0020.m82();
        int r03 = 1538317;
    L81:
        r03 = r03 ^ 1538334;
        switch(r03) {
            case 19: goto L84;
            case 50: goto L369;
            case 85: goto L843;
            case 116: goto L370;
            default: goto L81;
        };
    L84:
        if (r1 > 0) goto L369;
        r03 = 1538410;
    L369:
        r03 = 1538379;
        goto L81
    L370:
        System.out.println(Double.parseDouble(C0046.m187("xb")));
        return;
    L843:
        return;
    L14:
        final String r5 = r12.getAsString("talker");
        int r04 = 1864;
    L15:
        r04 = r04 ^ 1881;
        switch(r04) {
            case 17: goto L18;
            case 47384: goto L22;
            case 47417: goto L21;
            case 47483: goto L20;
            default: goto L15;
        };
    L18:
        if (r5 != null) goto L20;
        r04 = 48736;
    L20:
        r04 = 48705;
        goto L15
    L21:
        r5 = "";
    L22:
        gn r05 = gn.a;
        String r13 = "key_lucky_keyword_blacklist";
        r05.getClass();
        String r14 = gn.d(r13, "");
        boolean r2 = b50.H(r14);
        int r06 = 48767;
    L23:
        r06 = r06 ^ 48784;
        switch(r06) {
            case 14: goto L26;
            case 45: goto L87;
            case 76: goto L29;
            case 239: goto L27;
            default: goto L23;
        };
    L26:
        r06 = 48829;
        goto L23
    L27:
        if (r2 == true) goto L26;
        r06 = 48860;
        goto L23
    L29:
        List r07 = b50.M(r14, new String[]{",", "\uff0c"});
        ArrayList r22 = new ArrayList();
        Iterator r3 = r07.iterator();
    L30:
        boolean r15 = r3.hasNext();
        int r08 = 48891;
    L31:
        r08 = r08 ^ 48908;
        switch(r08) {
            case 22: goto L34;
            case 53: goto L49;
            case 503: goto L35;
            case 32495: goto L37;
            default: goto L31;
        };
    L49:
        boolean r16 = r22.isEmpty();
        int r09 = 49914;
    L50:
        r09 = r09 ^ 49931;
        switch(r09) {
            case 497: goto L53;
            case 1711: goto L55;
            case 1736: goto L61;
            case 1769: goto L56;
            default: goto L50;
        };
    L53:
        if (r16 == false) goto L55;
        r09 = 50658;
    L55:
        r09 = 50627;
        goto L50
    L56:
        int r010 = 50689;
    L57:
        r010 = r010 ^ 50706;
        switch(r010) {
            case 19: goto L60;
            case 50: goto L87;
            default: goto L57;
        };
    L60:
        r010 = 50720;
        goto L57
    L61:
        int r32 = r22.size();
        int r17 = 0;
    L62:
        int r011 = 50813;
    L63:
        r011 = r011 ^ 50830;
        switch(r011) {
            case 18: goto L66;
            case 53: goto L87;
            case 243: goto L67;
            case 4075: goto L69;
            default: goto L63;
        };
    L66:
        r011 = 50875;
        goto L63
    L67:
        if (r17 >= r32) goto L66;
        r011 = 51557;
        goto L63
    L69:
        Object r012 = r22.get(r17);
        r17 = r17 + 1;
        boolean r4 = b50.B(r8, (String) r012, true);
        int r013 = 51588;
    L70:
        r013 = r013 ^ 51605;
        switch(r013) {
            case 17: goto L73;
            case 54: goto L75;
            case 87: goto L62;
            case 116: goto L76;
            default: goto L70;
        };
    L76:
        int r014 = 51712;
    L77:
        r014 = r014 ^ 51729;
        switch(r014) {
            case 14: goto L80;
            case 15: goto L77;
            case 16: goto L77;
            case 17: goto L86;
            default: goto L77;
        };
    L86:
        r014 = 51743;
        goto L77
    L73:
        if (r4 == false) goto L75;
        r013 = 51681;
    L75:
        r013 = 51650;
    L34:
        r08 = 48953;
        goto L31
    L35:
        if (r15 == false) goto L34;
        r08 = 49635;
        goto L31
    L37:
        Object r18 = r3.next();
        boolean r42 = b50.H((String) r18);
        int r015 = 49666;
    L38:
        r015 = r015 ^ 49683;
        switch(r015) {
            case 17: goto L41;
            case 50: goto L43;
            case 76: goto L44;
            case 83: goto L30;
            default: goto L38;
        };
    L44:
        r22.add(r18);
        int r016 = 49790;
    L45:
        r016 = r016 ^ 49807;
        switch(r016) {
            case 18: goto L30;
            case 241: goto L48;
            default: goto L45;
        };
    L48:
        r016 = 49821;
        goto L45
    L41:
        if (r42 == true) goto L43;
        r015 = 49759;
    L43:
        r015 = 49728;
    L87:
        final i00 r33 = new i00();
        String r017 = a(r8, pb0.Q0);
        r33.b = r017;
        int r19 = r017.length();
        int r018 = 51836;
    L88:
        r018 = r018 ^ 51853;
        switch(r018) {
            case 241: goto L91;
            case 1963: goto L93;
            case 1992: goto L99;
            case 2025: goto L94;
            default: goto L88;
        };
    L91:
        if (r19 != 0) goto L93;
        r018 = 52580;
    L93:
        r018 = 52549;
        goto L88
    L94:
        int r019 = 52611;
    L95:
        r019 = r019 ^ 52628;
        switch(r019) {
            case 23: goto L98;
            case 54: goto L80;
            default: goto L95;
        };
    L98:
        r019 = 52642;
        goto L95
    L99:
        String r020 = b50.L((String) r33.b, "&amp;", "&");
        r33.b = r020;
        Object r110 = b.putIfAbsent("global_" + r020, Boolean.TRUE);
        int r021 = 52735;
    L100:
        r021 = r021 ^ 52752;
        switch(r021) {
            case 14: goto L103;
            case 45: goto L392;
            case 1007: goto L104;
            case 7927: goto L106;
            default: goto L100;
        };
    L392:
        gn r022 = gn.a;     // Catch: Throwable -> L117
        String r111 = "key_lucky_notification";     // Catch: Throwable -> L117
        r022.getClass();     // Catch: Throwable -> L117
        boolean r023 = gn.e(r111);     // Catch: Throwable -> L117
        int r112 = 53634;
    L113:
        r112 = r112 ^ 53651;
        switch(r112) {
            case 17: goto L116;
            case 50: goto L119;
            default: goto L113;
        };
    L116:
        r112 = 53665;
    L119:
        int r113 = 53758;
    L120:
        r113 = r113 ^ 53775;
        switch(r113) {
            case 1009: goto L123;
            case 1703: goto L125;
            case 1736: goto L157;
            case 1769: goto L126;
            default: goto L120;
        };
    L123:
        if (r023 == false) goto L125;
        r113 = 54502;
    L125:
        r113 = 54471;
        goto L120
    L126:
        gn.a.getClass();
        Application r9 = gn.b;
        int r024 = 54533;
    L127:
        r024 = r024 ^ 54550;
        switch(r024) {
            case 19: goto L130;
            case 50: goto L132;
            case 85: goto L386;
            case 116: goto L133;
            default: goto L127;
        };
    L386:
        Object r025 = r9.getSystemService("notification");     // Catch: Throwable -> L372
        ip.m("null cannot be cast to non-null type android.app.NotificationManager", r025);     // Catch: Throwable -> L372
        NotificationManager r026 = (NotificationManager) r025;     // Catch: Throwable -> L372
        String r10 = "geek_lucky_money_channel";     // Catch: Throwable -> L372
        NotificationChannel r114 = new NotificationChannel(r10, "\u6781\u901f\u7ea2\u5305\u63d0\u9192", 4);     // Catch: Throwable -> L372
        r114.setDescription("\u68c0\u6d4b\u5230\u5fae\u4fe1\u7ea2\u5305\u65f6\u7684\u6a21\u5757\u81ea\u5b9a\u4e49\u901a\u77e5");     // Catch: Throwable -> L372
        r114.enableVibration(true);     // Catch: Throwable -> L372
        r114.setVibrationPattern(new long[]{0, 200, 100, 200});     // Catch: Throwable -> L372
        r026.createNotificationChannel(r114);     // Catch: Throwable -> L372
        boolean r23 = b50.C(r5, "@chatroom");     // Catch: Throwable -> L372
        int r115 = 55432;
    L139:
        r115 = r115 ^ 55449;     // Catch: Throwable -> L372
        switch(r115) {
            case 17: goto L142;
            case 62: goto L144;
            case 95: goto L151;
            case 124: goto L145;
            default: goto L139;
        };     // Catch: Throwable -> L372
    L142:
        if (r23 == false) goto L144;
        r115 = 55525;
    L144:
        r115 = 55494;
        goto L139
    L145:
        String r24 = "+TvVbZcGAcuvf+svygxupKU6sAen\n";
        String r116 = "H5hViyKN5EM=\n";
    L146:
        String r25 = u40.a(r24, r116);     // Catch: Throwable -> L372
        int r117 = 55556;
    L147:
        r117 = r117 ^ 55573;     // Catch: Throwable -> L372
        switch(r117) {
            case 17: goto L150;
            case 54: goto L156;
            default: goto L147;
        };     // Catch: Throwable -> L372
    L150:
        r117 = 55587;
        goto L147
    L156:
        Notification.Builder r118 = new Notification.Builder(r9, r10).setSmallIcon(r9.getApplicationInfo().icon).setContentTitle(r25).setContentText(gn.d("key_lucky_notification_text", "GeekMod \u6b63\u5728\u5c1d\u8bd5\u81ea\u52a8\u62c6\u5f00...")).setAutoCancel(true);     // Catch: Throwable -> L372
        ip.n("setAutoCancel(...)", r118);     // Catch: Throwable -> L372
        r026.notify(r5.hashCode(), r118.build());     // Catch: Throwable -> L372
    L151:
        r24 = "UsFd0Pr1GUQesVGPlf9fGTjQ\n";
        r116 = "tFXrNXJF/fw=\n";
        int r43 = 55680;
    L152:
        r43 = r43 ^ 55697;     // Catch: Throwable -> L372
        switch(r43) {
            case 17: goto L155;
            case 1467: goto L146;
            default: goto L152;
        };     // Catch: Throwable -> L372
    L155:
        r43 = 56362;
    L373:
        int r027 = 1538441;
    L374:
        r027 = r027 ^ 1538458;
        switch(r027) {
            case 19: goto L377;
            case 50: goto L157;
            default: goto L374;
        };
    L377:
        r027 = 1538472;
        goto L374
    L130:
        if (r9 != null) goto L132;
        r024 = 54626;
    L132:
        r024 = 54595;
        goto L127
    L133:
        int r028 = 54657;
    L134:
        r028 = r028 ^ 54674;
        switch(r028) {
            case 19: goto L137;
            case 50: goto L157;
            default: goto L134;
        };
    L137:
        r028 = 54688;
    L157:
        gn r029 = gn.a;
        String r119 = "key_lucky_mode";
        r029.getClass();
        int r120 = gn.b(r119, 0);
        int r030 = 56455;
    L158:
        r030 = r030 ^ 56472;
        switch(r030) {
            case 31: goto L161;
            case 62: goto L163;
            case 93: goto L341;
            case 124: goto L164;
            default: goto L158;
        };
    L161:
        if (r120 == 0) goto L163;
        r030 = 56548;
    L163:
        r030 = 56517;
        goto L158
    L164:
        int r031 = 56579;
    L165:
        r031 = r031 ^ 56596;
        switch(r031) {
            case 23: goto L168;
            case 54: goto L170;
            case 85: goto L176;
            case 1564036: goto L171;
            default: goto L165;
        };
    L168:
        if (r120 == 1) goto L170;
        r031 = 1507472;
    L170:
        r031 = 56641;
        goto L165
    L171:
        int r032 = 1507503;
    L172:
        r032 = r032 ^ 1507520;
        switch(r032) {
            case 14: goto L80;
            case 111: goto L175;
            default: goto L172;
        };
    L175:
        r032 = 1507534;
        goto L172
    L176:
        final i00 r26 = new i00();
        r26.b = a(r8, pb0.R0);
        final i00 r44 = new i00();
        r44.b = a(r8, pb0.S0);
        String r82 = pb0.T0;
        String r92 = pb0.U0;
        int r121 = ((CharSequence) r26.b).length();
        int r033 = 1507627;
    L177:
        r033 = r033 ^ 1507644;
        switch(r033) {
            case 23: goto L180;
            case 85: goto L195;
            case 118: goto L182;
            case 180: goto L183;
            default: goto L177;
        };
    L180:
        if (r121 != 0) goto L182;
        r033 = 1507720;
    L182:
        r033 = 1507689;
        goto L177
    L183:
        int r034 = 1507751;
    L184:
        r034 = r034 ^ 1507768;
        switch(r034) {
            case 31: goto L187;
            case 1513: goto L188;
            default: goto L184;
        };
    L187:
        r034 = 1508433;
        goto L184
    L188:
        boolean r035 = true;
    L189:
        int r122 = 1508526;
    L190:
        r122 = r122 ^ 1508543;
        switch(r122) {
            case 17: goto L193;
            case 83: goto L205;
            case 114: goto L196;
            case 436: goto L197;
            default: goto L190;
        };
    L193:
        if (r035 == false) goto L196;
        r122 = 1508619;
    L196:
        r122 = 1508588;
        goto L190
    L197:
        boolean r123 = b50.B((CharSequence) r33.b, r82, false);
        int r036 = 1508650;
    L198:
        r036 = r036 ^ 1508667;
        switch(r036) {
            case 17: goto L201;
            case 83: goto L205;
            case 114: goto L203;
            case 3369: goto L204;
            default: goto L198;
        };
    L201:
        if (r123 == false) goto L203;
        r036 = 1509394;
    L203:
        r036 = 1508712;
        goto L198
    L204:
        r26.b = b50.Q(b50.O((String) r33.b, r82), "&");
    L205:
        int r124 = ((CharSequence) r44.b).length();
        int r037 = 1509425;
    L206:
        r037 = r037 ^ 1509442;
        switch(r037) {
            case 18: goto L209;
            case 45: goto L224;
            case 115: goto L210;
            case 204: goto L212;
            default: goto L206;
        };
    L209:
        r037 = 1509487;
        goto L206
    L210:
        if (r124 != 0) goto L209;
        r037 = 1509518;
        goto L206
    L212:
        int r038 = 1509549;
    L213:
        r038 = r038 ^ 1509566;
        switch(r038) {
            case 19: goto L216;
            case 114: goto L217;
            default: goto L213;
        };
    L216:
        r038 = 1509580;
        goto L213
    L217:
        boolean r039 = true;
    L218:
        int r125 = 1509673;
    L219:
        r125 = r125 ^ 1509690;
        switch(r125) {
            case 19: goto L222;
            case 712: goto L234;
            case 745: goto L225;
            case 1323: goto L226;
            default: goto L219;
        };
    L222:
        if (r039 == false) goto L225;
        r125 = 1510417;
    L225:
        r125 = 1510386;
        goto L219
    L226:
        boolean r126 = b50.B((CharSequence) r33.b, r92, false);
        int r040 = 1510448;
    L227:
        r040 = r040 ^ 1510465;
        switch(r040) {
            case 14: goto L230;
            case 47: goto L234;
            case 113: goto L231;
            case 204: goto L233;
            default: goto L227;
        };
    L230:
        r040 = 1510510;
        goto L227
    L231:
        if (r126 == false) goto L230;
        r040 = 1510541;
        goto L227
    L233:
        r44.b = b50.Q(b50.O((String) r33.b, r92), "&");
    L234:
        int r127 = ((CharSequence) r26.b).length();
        int r041 = 1510572;
    L235:
        r041 = r041 ^ 1510589;
        switch(r041) {
            case 17: goto L238;
            case 87: goto L252;
            case 118: goto L240;
            case 809: goto L241;
            default: goto L235;
        };
    L238:
        if (r127 <= 0) goto L240;
        r041 = 1511316;
    L240:
        r041 = 1510634;
        goto L235
    L241:
        int r042 = 1511347;
    L242:
        r042 = r042 ^ 1511364;
        switch(r042) {
            case 22: goto L245;
            case 119: goto L251;
            default: goto L242;
        };
    L245:
        boolean r043 = true;
    L246:
        int r128 = 1511471;
    L247:
        r128 = r128 ^ 1511488;
        switch(r128) {
            case 14: goto L250;
            case 45: goto L80;
            case 111: goto L253;
            case 204: goto L255;
            default: goto L247;
        };
    L250:
        r128 = 1511533;
        goto L247
    L253:
        if (r043 == false) goto L250;
        r128 = 1511564;
        goto L247
    L255:
        int r129 = ((CharSequence) r44.b).length();
        int r044 = 1511595;
    L256:
        r044 = r044 ^ 1511612;
        switch(r044) {
            case 23: goto L259;
            case 815: goto L262;
            case 968: goto L273;
            case 1001: goto L261;
            default: goto L256;
        };
    L259:
        if (r129 <= 0) goto L261;
        r044 = 1512339;
    L261:
        r044 = 1512308;
        goto L256
    L262:
        int r045 = 1512370;
    L263:
        r045 = r045 ^ 1512387;
        switch(r045) {
            case 18: goto L266;
            case 113: goto L272;
            default: goto L263;
        };
    L266:
        int r046 = 1512494;
    L267:
        r046 = r046 ^ 1512511;
        switch(r046) {
            case 17: goto L270;
            case 83: goto L80;
            case 114: goto L274;
            case 809: goto L275;
            default: goto L267;
        };
    L270:
        if (r7 == false) goto L274;
        r046 = 1513238;
    L274:
        r046 = 1512556;
        goto L267
    L275:
        Object r130 = b.putIfAbsent("recv_" + r26.b, Boolean.TRUE);
        int r047 = 1513269;
    L276:
        r047 = r047 ^ 1513286;
        switch(r047) {
            case 18: goto L279;
            case 53: goto L80;
            case 115: goto L280;
            case 212: goto L282;
            default: goto L276;
        };
    L279:
        r047 = 1513331;
        goto L276
    L280:
        if (r130 != null) goto L279;
        r047 = 1513362;
        goto L276
    L282:
        c.put(r26.b, r5);
        final ClassLoader r131 = d9.a;
        int r048 = 1513393;
    L283:
        r048 = r048 ^ 1513410;
        switch(r048) {
            case 18: goto L286;
            case 45: goto L80;
            case 115: goto L287;
            case 4044: goto L289;
            default: goto L283;
        };
    L286:
        r048 = 1513455;
        goto L283
    L287:
        if (r131 == null) goto L286;
        r048 = 1513486;
        goto L283
    L289:
        hs r6 = a;
        boolean r72 = d;
        int r049 = 1513517;
    L290:
        r049 = r049 ^ 1513534;
        switch(r049) {
            case 19: goto L293;
            case 712: goto L306;
            case 745: goto L295;
            case 811: goto L296;
            default: goto L290;
        };
    L293:
        if (r72 == false) goto L295;
        r049 = 1514261;
    L295:
        r049 = 1514230;
        goto L290
    L296:
        int r050 = 1514292;
    L297:
        r050 = r050 ^ 1514309;
        switch(r050) {
            case 22: goto L300;
            case 113: goto L305;
            default: goto L297;
        };
    L300:
        d9.b.post(new es(r131, r26, r33, r44, r5));
        int r051 = 1516214;
    L301:
        r051 = r051 ^ 1516231;
        switch(r051) {
            case 18: goto L80;
            case 113: goto L304;
            default: goto L301;
        };
    L304:
        r051 = 1516245;
        goto L301
    L305:
        r050 = 1514323;
        goto L297
    L306:
        monitor-enter(r6);
        boolean r73 = d;     // Catch: Throwable -> L338
        int r052 = 1514416;
    L309:
        r052 = r052 ^ 1514433;
        switch(r052) {
            case 14: goto L312;
            case 47: goto L384;
            case 113: goto L313;
            case 1369: goto L315;
            default: goto L309;
        };
    L384:
        int r74 = pb0.m.length();     // Catch: Throwable -> L378
        int r053 = 1515315;
    L322:
        r053 = r053 ^ 1515332;     // Catch: Throwable -> L378
        switch(r053) {
            case 22: goto L325;
            case 53: goto L336;
            case 119: goto L326;
            case 212: goto L328;
            default: goto L322;
        };     // Catch: Throwable -> L378
    L325:
        r053 = 1515377;
        goto L322
    L326:
        if (r74 <= 0) goto L325;
        r053 = 1515408;
        goto L322
    L328:
        Class r75 = XposedHelpers.findClassIfExists(pb0.m, r131);     // Catch: Throwable -> L378
        int r054 = 1515439;
    L329:
        r054 = r054 ^ 1515456;     // Catch: Throwable -> L378
        switch(r054) {
            case 111: goto L332;
            case 15703: goto L335;
            case 15769: goto L334;
            case 15800: goto L336;
            default: goto L329;
        };     // Catch: Throwable -> L378
    L332:
        if (r75 == null) goto L334;
        r054 = 1516183;
    L334:
        r054 = 1516152;
        goto L329
    L335:
        XposedHelpers.findAndHookMethod(r75, pb0.N0, new Object[]{Integer.TYPE, String.class, JSONObject.class, new fs(r131, 0)});     // Catch: Throwable -> L378
        d = true;     // Catch: Throwable -> L378
    L336:
        monitor-exit(r6);
    L379:
        int r055 = 1539216;
    L380:
        r055 = r055 ^ 1539233;
        switch(r055) {
            case 14: goto L336;
            case 49: goto L383;
            default: goto L380;
        };
    L383:
        r055 = 1539247;
    L312:
        r052 = 1514478;
        goto L309
    L313:
        if (r73 == false) goto L312;
        r052 = 1515160;
        goto L309
    L315:
        monitor-exit(r6);
        int r056 = 1515191;
    L317:
        r056 = r056 ^ 1515208;
        switch(r056) {
            case 30: goto L300;
            case 127: goto L320;
            default: goto L317;
        };
    L320:
        r056 = 1515222;
    L338:
        th = move-exception;
        throw th;
    L272:
        r045 = 1512401;
        goto L263
    L273:
        r7 = false;
        goto L266
    L251:
        r042 = 1511378;
        goto L242
    L252:
        r043 = false;
        goto L246
    L224:
        r039 = false;
        goto L218
    L195:
        r035 = false;
        goto L189
    L341:
        boolean r132 = c(r5);
        int r057 = 1516338;
    L342:
        r057 = r057 ^ 1516355;
        switch(r057) {
            case 18: goto L345;
            case 51: goto L394;
            case 113: goto L346;
            case 22444: goto L348;
            default: goto L342;
        };
    L394:
        long r058 = gn.b("key_lucky_delay", 0);     // Catch: Throwable -> L359
        int r27 = 1537418;
    L355:
        r27 = r27 ^ 1537435;
        switch(r27) {
            case 17: goto L358;
            case 50: goto L368;
            default: goto L355;
        };
    L358:
        r27 = 1537449;
    L368:
        d9.b.postDelayed(new p1(9, r33), r058);
    L390:
        gn r059 = gn.a;     // Catch: Throwable -> L366
        String r133 = "key_lucky_delay";     // Catch: Throwable -> L366
        String r28 = "0";     // Catch: Throwable -> L366
        r059.getClass();     // Catch: Throwable -> L366
        r058 = Long.parseLong(gn.d(r133, r28));     // Catch: Throwable -> L366
        int r29 = 1537542;
    L362:
        r29 = r29 ^ 1537559;
        switch(r29) {
            case 17: goto L365;
            case 3751: goto L368;
            default: goto L362;
        };
    L365:
        r29 = 1538224;
    L367:
        r058 = 0;
    L345:
        r057 = 1516400;
        goto L342
    L346:
        if (r132 == false) goto L345;
        r057 = 1537263;
        goto L342
    L348:
        int r060 = 1537294;
    L349:
        r060 = r060 ^ 1537311;
        switch(r060) {
            case 17: goto L352;
            case 50: goto L80;
            default: goto L349;
        };
    L352:
        r060 = 1537325;
    L118:
        r023 = false;
    L103:
        r021 = 52797;
        goto L100
    L104:
        if (r110 == null) goto L103;
        r021 = 53479;
        goto L100
    L106:
        int r061 = 53510;
    L107:
        r061 = r061 ^ 53527;
        switch(r061) {
            case 17: goto L110;
            case 50: goto L80;
            default: goto L107;
        };
    L110:
        r061 = 53541;
        goto L107
    }

    public static boolean c(String r12) {
        Iterator r9 = null;
        Object r1 = null;
        ArrayList r10 = null;
        gn r11 = null;
        String r2 = null;
        String[] r4 = null;
        List r5 = null;
        String r8 = null;
        String r6 = null;
        int r7 = C0003.m13("ۦۣۤ");
    L3:
        switch(r7) {
            case 56479: goto L5;
            case 56543: goto L38;
            case 1746691: goto L9;
            case 1746905: goto L20;
            case 1747835: goto L13;
            case 1747899: goto L65;
            case 1747904: goto L14;
            case 1748702: goto L39;
            case 1749668: goto L33;
            case 1749670: goto L61;
            case 1752579: goto L56;
            case 1752583: goto L27;
            case 1752609: goto L52;
            case 1753420: goto L16;
            case 1753543: goto L51;
            case 1753576: goto L46;
            case 1753635: goto L37;
            case 1754570: goto L43;
            case 1755499: goto L20;
            case 1755526: goto L24;
            default: goto L3;
        };
    L5:
        String[] r0 = new String[1];
        if (C0049.f49 <= 0) goto L7;
    L31:
        r4 = r0;
        r7 = C0070.m281("ۧۥۨ");
        goto L3
    L7:
        r4 = r0;
        r7 = C0027.m110("ۣ۟۟");
        goto L3
    L9:
        if ((C0026.f26 ^ (C0058.f58 / 3633)) <= 0) goto L10;
        r7 = (C0003.f3 | C0041.f41) + 1745938;
        goto L3
    L10:
        r7 = C0002.m8("ۥۣۡ");
        goto L3
    L13:
        return r10.contains(r12);
    L14:
        List r02 = b50.M(r6, r4);
        String r3 = r6;
        String r72 = "ۦ۟ۥ";
    L15:
        r7 = C0043.m173(r72);
        r5 = r02;
        r6 = r3;
        goto L3
    L16:
        ArrayList r03 = new ArrayList();
        if (C0062.m248() >= 0) goto L18;
    L18:
        r10 = r03;
        r7 = C0000.m2("ۦۦۣ");
    L20:
        if ((C0009.f9 % (C0011.f11 - 4291)) < 0) goto L23;
        C0051.m206();
        String r04 = "ۨ۟";
    L22:
        r7 = C0021.m86(r04);
        goto L3
    L23:
        r04 = "ۦۤۦ";
        goto L22
    L24:
        r10.add(r1);
        String r32 = "ۣ۟۟";
        String r05 = r2;
    L25:
        r2 = r05;
        r7 = C0050.m203(r32);
        goto L3
    L27:
        if (b50.H((String) r1) == true) goto L20;
        if ((C0013.f13 | (C0002.f2 % (-3114))) >= 0) goto L30;
        r72 = "ۨۥۣ";
        r02 = r5;
        r3 = r6;
        goto L15
    L30:
        r0 = r4;
        goto L31
    L33:
        r3 = gn.d(r8, "");
        if (C0056.f56 >= 0) goto L35;
        r6 = r3;
        r7 = (C0057.f57 % C0003.f3) + 56975;
        goto L3
    L35:
        C0009.m36();
        r02 = r5;
        r72 = "ۡۢ۟";
        goto L15
    L37:
        r9 = r5.iterator();
        r7 = (C0035.f35 ^ C0029.f29) ^ (-1753953);
        goto L3
    L38:
        r05 = ",";
        r32 = "ۥۤ";
        goto L25
    L39:
        r11.getClass();
        if ((C0065.f65 * (C0046.f46 | 1136)) >= 0) goto L41;
        r7 = (C0062.f62 % C0065.f65) ^ (-1749757);
        goto L3
    L41:
        C0043.f43 = 41;
        r7 = C0068.m272("ۢۢۦ");
        goto L3
    L43:
        r4[C0053.f53 ^ 57] = r2;
        String r33 = "۠ۧۧ";
        String r06 = r8;
    L44:
        r8 = r06;
        r7 = C0010.m43(r33);
        goto L3
    L46:
        if (r9.hasNext() == false) goto L65;
        if ((C0066.f66 / (C0014.f14 % (-8128))) >= 0) goto L49;
        r7 = (C0040.f40 ^ C0041.f41) + 1752518;
        goto L3
    L49:
        r7 = C0052.m209("۠ۥ۠");
        goto L3
    L51:
        r11 = gn.a;
        r7 = (C0048.f48 - C0044.f44) ^ (-1752595);
        goto L3
    L52:
        r06 = "key_lucky_blacklist";
        if (C0038.f38 < 0) goto L55;
    L54:
        r33 = "ۥۣۥ";
        goto L44
    L55:
        r33 = "ۡۢ۟";
        goto L44
    L56:
        r1 = r9.next();
        if ((C0069.f69 * (C0015.f15 % (-5849))) > 0) goto L59;
        C0072.m289();
        r7 = C0005.m23("ۢۢۤ");
        goto L3
    L59:
        r06 = r8;
        goto L54
    L61:
        if (C0043.f43 <= 0) goto L62;
        r7 = (C0027.f27 ^ C0048.f48) + 1753693;
        goto L3
    L62:
        C0062.m248();
        r7 = C0072.m288("ۧۤۧ");
    L65:
        if (C0062.f62 < 0) goto L67;
        r32 = "ۦۧ۟";
        r05 = r2;
        goto L25
    L67:
        r04 = "۠ۥ۠";
        goto L22
    }

    public static void d(View r26) {
        int r9 = 0;
        int r3 = 0;
        int r4 = 0;
        double r18 = 0.0d;
        double r20 = 0.0d;
        gn r12 = null;
        String r11 = null;
        ViewGroup r2 = null;
        int r6 = 0;
        View r10 = null;
        int r5 = 0;
        Integer r7 = null;
        int r16 = C0014.m57("ۣ۠ۦ");
        int[] r14 = null;
        int r15 = 0;
    L3:
        switch(r16) {
            case 56322: goto L5;
            case 56328: goto L118;
            case 56483: goto L28;
            case 56537: goto L28;
            case 56574: goto L50;
            case 1746722: goto L7;
            case 1746787: goto L111;
            case 1746910: goto L60;
            case 1747778: goto L32;
            case 1747779: goto L83;
            case 1748618: goto L23;
            case 1748862: goto L42;
            case 1748888: goto L46;
            case 1749572: goto L56;
            case 1749573: goto L74;
            case 1749577: goto L123;
            case 1750535: goto L56;
            case 1750599: goto L37;
            case 1750628: goto L61;
            case 1750687: goto L88;
            case 1751715: goto L103;
            case 1751745: goto L86;
            case 1752459: goto L98;
            case 1752491: goto L65;
            case 1752617: goto L13;
            case 1752706: goto L69;
            case 1753445: goto L79;
            case 1753540: goto L107;
            case 1753669: goto L97;
            case 1754628: goto L92;
            case 1755336: goto L85;
            case 1755495: goto L70;
            case 1755522: goto L124;
            default: goto L3;
        };
    L124:
        r26.performClick();     // Catch: Throwable -> L24
        if ((C0070.f70 - (C0065.f65 - 9233)) <= 0) goto L18;
        r16 = (C0051.f51 ^ C0063.f63) + 1752955;
    L18:
        r16 = C0046.m186("ۢ۟ۢ");
    L25:
        "tag";
        "e";
    L26:
        r16 = C0008.m35("ۢ۟ۡ");
        goto L3
    L5:
        System.out.println(r7);
        r16 = (C0052.f52 / C0003.f3) + 1749577;
        goto L3
    L7:
        if (r26.getWidth() <= 50) goto L56;
        if (r26.getWidth() >= (((double) r26.getResources().getDisplayMetrics().widthPixels) * 0.6d)) goto L56;
        String r13 = "ۡۨ۟";
    L11:
        r16 = C0047.m189(r13);
        goto L3
    L13:
        if ((C0013.f13 % (C0035.f35 | 6110)) < 0) goto L17;
        C0015.f15 = 82;
        r5 = r6;
    L15:
        String r8 = "۠ۨ";
    L16:
        r16 = C0037.m149(r8);
        goto L3
    L17:
        r5 = r6;
        goto L18
    L23:
        ip.n("getChildAt(...)", r10);
        d(r10);
        r16 = (C0069.f69 | C0048.f48) + 1751746;
        goto L3
    L28:
        if (C0020.f20 >= 0) goto L29;
        r16 = (C0000.f0 % C0022.f22) + 1749035;
        goto L3
    L29:
        C0032.f32 = 99;
        String r82 = "۟۠ۦ";
    L30:
        r16 = C0022.m90(r82);
        goto L3
    L32:
        "block";
        if (C0056.m224() <= 0) goto L34;
        r16 = (C0044.f44 * C0070.f70) ^ 1577807;
    L34:
        r16 = C0070.m281("ۦۣۡ");
        goto L3
    L37:
        if (r18 <= (0.45d * r20)) goto L56;
        if (r18 >= (0.75d * r20)) goto L56;
        r16 = (C0007.f7 % C0069.f69) + 1746695;
    L42:
        if (C0068.m273() >= 0) goto L43;
        r16 = (C0018.f18 - C0013.f13) + 1753957;
        goto L3
    L43:
        C0045.f45 = 60;
        r16 = C0039.m159("ۣ۠ۡ");
        goto L3
    L46:
        if (r26.isClickable() == true) goto L85;
        if (C0065.m260() > 0) goto L15;
        r16 = C0059.m239("ۨۦ");
        goto L3
    L50:
        r12.getClass();
        ip.o("tag", r11);
        if (C0008.m33() <= 0) goto L52;
        r16 = (C0014.f14 ^ C0006.f6) + 1748555;
        goto L3
    L52:
        C0009.m36();
        String r83 = "ۡۧۤ";
    L53:
        r16 = C0036.m144(r83);
    L56:
        if (C0017.m71() <= 0) goto L57;
        String r84 = "۟ۢۦ";
    L59:
        r16 = C0005.m23(r84);
        goto L3
    L57:
        C0073.f73 = 18;
        r16 = C0042.m170("ۨۥۥ");
        goto L3
    L60:
        r16 = (C0053.f53 / C0023.f23) + 1752706;
        goto L3
    L61:
        r3 = r26.getHeight() / 2;
        r4 = r26.getResources().getDisplayMetrics().heightPixels;
        if ((C0020.f20 | (C0035.f35 % 2762)) >= 0) goto L63;
    L115:
        r16 = C0054.m219("ۥ۠ۦ");
        goto L3
    L63:
        View r85 = r10;
    L64:
        r10 = r85;
        r16 = C0067.m271("ۡ۟ۨ");
        goto L3
    L65:
        r18 = ((r3 - 23) + r9) + 23;
        r20 = r4;
        if (C0008.f8 >= 0) goto L67;
        r16 = (C0070.f70 % C0009.f9) ^ 1750088;
        goto L3
    L67:
        r16 = C0046.m186("ۥۤۨ");
        goto L3
    L69:
        r16 = (C0012.f12 | C0060.f60) + 1749512;
        goto L3
    L70:
        r26.getLocationOnScreen(r14);
        r9 = r14[1];
        if ((C0006.f6 + (C0006.f6 - 8677)) < 0) goto L73;
        C0049.f49 = 38;
        r16 = C0047.m189("ۨ۟۟");
        goto L3
    L73:
        r83 = "ۣۣۢ";
        goto L53
    L74:
        if (r5 >= r15) goto L42;
        r85 = r2.getChildAt(r5);
        if ((C0006.f6 ^ (C0035.f35 * (-6093))) < 0) goto L64;
        C0054.f54 = 67;
        r10 = r85;
        goto L26
    L79:
        if (C0006.f6 <= 0) goto L80;
        r16 = (C0047.f47 % C0022.f22) ^ (-1755532);
        goto L3
    L80:
        C0000.m0();
        r16 = C0046.m186("۟ۢۨ");
        goto L3
    L83:
        if (r26.getVisibility() != 0) goto L56;
        r14 = new int[2];
        r16 = (C0052.f52 / C0039.f39) + 1755496;
    L85:
        r16 = C0003.m13("ۥ۟ۥ");
        goto L3
    L86:
        r5 = r5 + (C0073.f73 ^ 15);
    L88:
        if (C0013.m52() < 0) goto L90;
        C0072.m289();
        r16 = C0041.m164("ۦۣۧ");
        goto L3
    L90:
        r82 = "ۢ۟ۦ";
        goto L30
    L92:
        if (C0057.m230() < 0) goto L88;
        r7 = Integer.decode(C0050.m201("h64W3LqhCgD"));
        if ((C0029.f29 / (C0000.f0 * 3368)) == 0) goto L96;
        r16 = C0001.m5("ۣۡۥ");
        goto L3
    L96:
        r8 = "۠ۢ";
        goto L16
    L97:
        int r86 = r2.getChildCount();
        r6 = 0;
        r15 = r86;
        r16 = (C0013.f13 - C0039.f39) ^ 1752576;
        goto L3
    L98:
        r12 = gn.a;
        String r87 = "Click";
        if (C0020.f20 >= 0) goto L100;
        r11 = r87;
        r16 = 56575 ^ (C0030.f30 / C0030.f30);
    L100:
        r13 = "ۦۧۦ";
        r11 = r87;
        goto L11
    L103:
        if ((C0068.f68 - (C0073.f73 / 9749)) >= 0) goto L104;
        r16 = (C0054.f54 - C0032.f32) + 1746646;
        goto L3
    L104:
        C0039.m157();
        r84 = "ۣ۟";
        goto L59
    L107:
        if ((C0059.f59 - (C0002.f2 ^ (-3451))) <= 0) goto L108;
        r16 = C0042.m170("ۥۨ");
        goto L3
    L108:
        C0019.m77();
        r16 = C0027.m110("ۥ۟ۥ");
        goto L3
    L111:
        if ((r26 instanceof ViewGroup) == false) goto L42;
        r2 = (ViewGroup) r26;
        if ((C0063.f63 % (C0051.f51 % 9134)) > 0) goto L116;
        C0035.f35 = 88;
        goto L115
    L116:
        r87 = r11;
        goto L100
    L118:
        if (r26.hasOnClickListeners() == false) goto L56;
        if (C0041.m167() <= 0) goto L121;
        r16 = (C0058.f58 ^ C0023.f23) + 1752155;
        goto L3
    L121:
        C0018.m75();
        r16 = C0005.m23("ۣۣۢ");
        goto L3
    }

    public static void e(ClassLoader r19, Object r20) {
        Class r13 = null;
        Constructor<?> r5 = null;
        Constructor<?> r14 = null;
        Constructor<?> r4 = null;
        Application r3 = null;
        Object[] r11 = null;
        Object r8 = null;
        Boolean r7 = null;
        Object[] r6 = null;
        int r9 = 0;
        int r18 = C0006.m26("ۣۡۢ");
        String r15 = null;
        Constructor<?>[] r16 = null;
        String r17 = null;
    L3:
        switch(r18) {
            case 56388: goto L6;
            case 56413: goto L75;
            case 56481: goto L58;
            case 1746718: goto L28;
            case 1746941: goto L18;
            case 1747715: goto L156;
            case 1747812: goto L63;
            case 1747843: goto L110;
            case 1748706: goto L112;
            case 1748769: goto L136;
            case 1748827: goto L133;
            case 1749606: goto L93;
            case 1749664: goto L8;
            case 1749702: goto L66;
            case 1749793: goto L158;
            case 1749852: goto L33;
            case 1750569: goto L157;
            case 1750594: goto L98;
            case 1750628: goto L138;
            case 1750724: goto L118;
            case 1750780: goto L126;
            case 1751500: goto L45;
            case 1751525: goto L15;
            case 1751587: goto L116;
            case 1751618: goto L35;
            case 1751653: goto L45;
            case 1751655: goto L46;
            case 1752579: goto L151;
            case 1752648: goto L75;
            case 1753414: goto L148;
            case 1753417: goto L154;
            case 1753478: goto L121;
            case 1753510: goto L40;
            case 1753541: goto L43;
            case 1753696: goto L66;
            case 1754414: goto L66;
            case 1754503: goto L157;
            case 1754539: goto L69;
            case 1754566: goto L113;
            case 1754595: goto L144;
            case 1755438: goto L80;
            case 1755468: goto L51;
            case 1755495: goto L87;
            case 1755591: goto L105;
            default: goto L3;
        };
    L158:
        XposedHelpers.callMethod(r8, r15, r6);     // Catch: Throwable -> L23
        if ((C0032.f32 % (C0036.f36 | 6635)) >= 0) goto L12;
        String r2 = "ۥۦ";
    L14:
        r18 = C0013.m53(r2);
        goto L3
    L12:
        C0039.f39 = 0;
        r18 = C0015.m60("ۤ۟ۧ");
    L25:
        if (C0059.f59 >= 0) goto L26;
        r18 = (C0011.f11 * C0069.f69) + 1741442;
        goto L3
    L26:
        C0065.m260();
        r18 = C0026.m105("ۦ۟ۢ");
        goto L3
    L6:
        if ((C0071.f71 / (C0019.f19 - 7158)) != 0) goto L7;
        r18 = C0010.m43("ۣۡۢ");
        goto L3
    L7:
        C0008.m33();
        r18 = C0021.m86("۟ۤ۠");
        goto L3
    L8:
        r18 = (C0060.f60 ^ C0056.f56) + 57101;
        goto L3
    L15:
        r6[C0033.f33 ^ 215] = r7;     // Catch: Throwable -> L23
        String r22 = "ۢۦۥ";
    L17:
        r18 = C0003.m13(r22);
        goto L3
    L18:
        String r23 = pb0.D;     // Catch: Throwable -> L23
        if ((C0063.f63 | (C0052.f52 * 439)) <= 0) goto L21;
        r15 = r23;
        r18 = (C0054.f54 ^ C0039.f39) + 1749568;
        goto L3
    L21:
        C0036.m147();
        r15 = r23;
        r18 = C0057.m229("۠ۥۨ");
        goto L3
    L28:
        r11[C0060.f60 ^ 958] = r3;     // Catch: Throwable -> L23
        if (C0002.f2 <= 0) goto L31;
        r18 = (C0018.f18 + C0061.f61) + 1750041;
        goto L3
    L31:
        r18 = C0019.m79("۠ۤۨ");
    L33:
        r18 = (C0056.f56 / C0059.f59) + 1750628;
    L35:
        if ((C0052.f52 ^ (C0045.f45 ^ 9312)) >= 0) goto L36;
        r18 = C0032.m130("ۣ۠ۦ");
        goto L3
    L36:
        C0046.m185();
        String r24 = "ۦۧ";
    L37:
        r18 = C0051.m207(r24);
        goto L3
    L40:
        r11 = new Object[2];     // Catch: Throwable -> L23
        Object r10 = "۟۠۟";
        int r12 = r9;
    L42:
        r9 = r12;
        r18 = C0034.m138(r10);
        goto L3
    L43:
        if (r4 == null) goto L66;
        r18 = (C0016.f16 - C0004.f4) + 1752268;
        goto L3
    L45:
        r18 = C0016.m65("۠ۤۨ");
        goto L3
    L46:
        r6[C0069.f69 ^ (-35)] = r20;     // Catch: Throwable -> L23
        if (C0026.m106() <= 0) goto L49;
        r18 = (C0013.f13 % C0044.f44) + 1751636;
        goto L3
    L49:
        C0071.m284();
        r18 = C0019.m79("ۧۦۢ");
        goto L3
    L51:
        if (r16 == null) goto L75;
        if ((C0038.f38 | (C0029.f29 / (-8040))) >= 0) goto L54;
        r18 = (C0016.f16 * C0044.f44) ^ 1576344;
        goto L3
    L54:
        C0000.m0();
        String r25 = "ۡۦ۠";
    L55:
        r18 = C0044.m176(r25);
        goto L3
    L58:
        if (C0020.m82() > 0) goto L35;
        int r26 = Integer.parseInt(C0038.m154("G4MTn7dEg5HGxpyY9t"));     // Catch: Throwable -> L23
        if (C0073.f73 > 0) goto L123;
        C0056.f56 = 2;
        r9 = r26;
        r18 = C0068.m272("ۥۣۡ");
    L123:
        r10 = "ۧۤۨ";
        r12 = r26;
        goto L42
    L63:
        if (r13 == null) goto L66;
        r18 = (C0062.f62 % C0020.f20) + 1753724;
    L66:
        if (C0032.m128() < 0) goto L68;
        C0008.f8 = 8;
        r18 = C0058.m234("ۡۢ۠");
        goto L3
    L68:
        r24 = "ۣۣۧ";
        goto L37
    L69:
        System.out.println(r9);     // Catch: Throwable -> L23
        if ((C0067.f67 * (C0059.f59 * (-6431))) >= 0) goto L72;
        r18 = (C0037.f37 * C0050.f50) + 1773509;
        goto L3
    L72:
        C0025.m103();
        r18 = C0051.m207("ۣۡۢ");
    L75:
        if ((C0050.f50 % (C0024.f24 * 3810)) > 0) goto L78;
        C0037.m150();
        String r27 = "ۣۤۤ";
    L77:
        r18 = C0057.m229(r27);
        goto L3
    L78:
        r27 = "ۥۣۡ";
        goto L77
    L80:
        Object[] r28 = new Object[2];     // Catch: Throwable -> L23
        if ((C0066.f66 + (C0049.f49 / 6974)) <= 0) goto L83;
        Object r102 = "ۤۤۧ";
        Object[] r122 = r28;
    L86:
        r6 = r122;
        r18 = C0059.m239(r102);
        goto L3
    L83:
        C0069.m276();
    L84:
        r6 = r28;
        r18 = C0040.m160("ۦ۟۟");
        goto L3
    L87:
        String r29 = pb0.i;     // Catch: Throwable -> L23
        if (C0034.f34 >= 0) goto L90;
        r17 = r29;
        r18 = (C0017.f17 * C0050.f50) ^ 1761115;
        goto L3
    L90:
        C0022.m88();
        r17 = r29;
        r18 = C0001.m5("ۧۥۤ");
        goto L3
    L93:
        if ((C0006.f6 / (C0055.f55 - 3036)) != 0) goto L94;
        String r210 = "۠ۤۨ";
        Class r103 = r13;
        r4 = r14;
    L96:
        r13 = r103;
        r18 = C0035.m140(r210);
        goto L3
    L94:
        r4 = r14;
        r18 = C0004.m16("ۤۤۧ");
        goto L3
    L98:
        r5 = r16[0];     // Catch: Throwable -> L23
        if ((C0009.f9 ^ (C0015.f15 | (-9889))) <= 0) goto L101;
        r18 = (C0022.f22 - C0044.f44) + 1754630;
        goto L3
    L101:
        r18 = C0036.m144("۟۠۟");
    L105:
        if (C0020.m82() <= 0) goto L106;
        r18 = (C0035.f35 ^ C0030.f30) + 1752765;
        goto L3
    L106:
        String r211 = "ۡۧ۟";
    L107:
        r18 = C0030.m120(r211);
        goto L3
    L110:
        if (r16.length != 0) goto L133;
        r18 = (C0017.f17 - C0005.f5) + 1749039;
        goto L3
    L112:
        r18 = (C0057.f57 * C0049.f49) ^ (-1742249);
        goto L3
    L113:
        if (r13 == null) goto L75;
        r16 = r13.getConstructors();     // Catch: Throwable -> L23
        r18 = (C0066.f66 | C0053.f53) ^ 1755893;
        goto L3
    L116:
        if (r3 != null) goto L105;
        r28 = r6;
        goto L84
    L118:
        r11[C0007.f7 ^ 483] = null;     // Catch: Throwable -> L23
        r8 = r4.newInstance(r11);     // Catch: Throwable -> L23
        r211 = "۟ۧۥ";
        goto L107
    L121:
        if (C0073.m295() > 0) goto L124;
        C0023.m92();
        r4 = r5;
        r26 = r9;
        goto L123
    L124:
        r24 = "ۧۦۢ";
        r4 = r5;
        goto L37
    L126:
        if (r17.length() <= 0) goto L33;
        r103 = XposedHelpers.findClassIfExists(r17, r19);     // Catch: Throwable -> L23
        if (C0060.m240() >= 0) goto L130;
        r13 = r103;
        r18 = C0028.m114("ۧۥۤ");
        goto L3
    L130:
        r210 = "ۥۦ";
    L133:
        if (C0015.f15 >= 0) goto L134;
        r18 = (C0034.f34 / C0027.f27) + 1750592;
        goto L3
    L134:
        r102 = "۠۠ۦ";
        r122 = r6;
        goto L86
    L136:
        r7 = Boolean.FALSE;     // Catch: Throwable -> L23
        r211 = "ۨۢۨ";
        goto L107
    L138:
        uv.d(r19, r20);     // Catch: Throwable -> L23
        if (C0007.m31() >= 0) goto L141;
        r210 = "ۣۣۧ";
        r103 = r13;
        goto L96
    L141:
        C0009.m36();
        r2 = "ۨۧۦ";
        goto L14
    L144:
        if (C0002.m10() > 0) goto L146;
        r18 = C0026.m105("ۣۥۦ");
        goto L3
    L146:
        r27 = "ۤ۟ۧ";
        goto L77
    L148:
        if ((C0056.f56 % (C0055.f55 * (-4737))) >= 0) goto L149;
        r18 = (C0005.f5 ^ C0071.f71) ^ (-1753189);
    L149:
        r22 = "ۢ۠ۤ";
        goto L17
    L151:
        r14 = null;
        if (C0071.f71 < 0) goto L149;
        C0059.f59 = 1;
        r18 = C0035.m140("ۢۢ۠");
        goto L3
    L154:
        gn.a.getClass();     // Catch: Throwable -> L23
        r3 = gn.b;     // Catch: Throwable -> L23
        r25 = "ۤۢۡ";
        goto L55
    L156:
        r18 = (C0068.f68 ^ C0030.f30) + 1756428;
        goto L3
    }
}
