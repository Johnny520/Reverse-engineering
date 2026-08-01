package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.content.ContentValues;
import android.os.Handler;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
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
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C0068;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends XC_MethodHook {
    public final int a;
    public final ClassLoader b;

    public /* synthetic */ fs(ClassLoader r4, int r5) {
        this.a = r5;
        this.b = r4;
        int r2 = C0059.m239("ۡۤ");
        Long r1 = null;
    L3:
        switch(r2) {
            case 56355: goto L6;
            case 56545: goto L21;
            case 1753547: goto L14;
            case 1753665: goto L10;
            case 1753667: goto L18;
            case 1755467: goto L20;
            default: goto L3;
        };
    L6:
        if (C0021.m84() > 0) goto L14;
        if (C0064.m257() >= 0) goto L9;
        r2 = (C0049.f49 | C0063.f63) + 1753540;
        goto L3
    L9:
        C0047.f47 = 70;
        r2 = C0057.m229("ۣۨۦ");
        goto L3
    L10:
        System.out.println(r1);
        if ((C0073.f73 ^ (C0004.f4 ^ (-519))) <= 0) goto L12;
    L12:
        r2 = C0048.m193("ۧۨ");
    L14:
        if ((C0008.f8 + (C0051.f51 + 3723)) > 0) goto L17;
        C0045.m181();
        String r0 = "ۧۧۨ";
    L16:
        r2 = C0008.m35(r0);
        goto L3
    L17:
        r0 = "ۧۨ";
        goto L16
    L18:
        Long r02 = Long.valueOf(C0029.m119("zzJoJ0AA8GenB"));
        r2 = 1788090 ^ (C0062.f62 * C0031.f31);
        r1 = r02;
        goto L3
    L20:
        r2 = (C0036.f36 / C0035.f35) + 56354;
        goto L3
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam r75) {
        int r20 = 0;
        ClassLoader r15 = null;
        String r17 = null;
        boolean r24 = false;
        boolean r21 = false;
        Object r40 = null;
        Object r10 = null;
        int r28 = 0;
        Object r41 = null;
        i00 r55 = null;
        Object r6 = null;
        Object r5 = null;
        LinkedList r14 = null;
        LinkedList r44 = null;
        LinkedList r45 = null;
        Object r7 = null;
        LinkedList r39 = null;
        LinkedList r34 = null;
        LinkedList r35 = null;
        Collection r65 = null;
        String r47 = null;
        int r69 = 0;
        StringBuilder r60 = null;
        String r62 = null;
        id r54 = null;
        nf r30 = null;
        y30 r29 = null;
        String r48 = null;
        StringBuilder r49 = null;
        gn r61 = null;
        String r64 = null;
        Object r9 = null;
        Integer r50 = null;
        Integer r13 = null;
        Integer r18 = null;
        int r25 = 0;
        int r31 = 0;
        int r26 = 0;
        Object r8 = null;
        JSONObject r38 = null;
        JSONObject r52 = null;
        JSONObject r37 = null;
        String r63 = null;
        boolean r27 = false;
        boolean r51 = false;
        boolean r36 = false;
        Object r43 = null;
        Object r11 = null;
        String r56 = null;
        String r19 = null;
        String r67 = null;
        String r66 = null;
        String r42 = null;
        boolean r72 = false;
        boolean r53 = false;
        boolean r71 = false;
        boolean r46 = false;
        int r68 = 0;
        long r32 = 0;
        long r22 = 0;
        int r70 = C0017.m70("ۧ۠");
        String r57 = null;
        fi r58 = null;
        Handler r59 = null;
    L3:
        switch(r70) {
            case 56324: goto L5;
            case 56326: goto L667;
            case 56353: goto L661;
            case 56356: goto L336;
            case 56358: goto L642;
            case 56389: goto L679;
            case 56417: goto L660;
            case 56443: goto L523;
            case 56446: goto L87;
            case 56449: goto L41;
            case 56475: goto L15;
            case 56537: goto L546;
            case 56538: goto L353;
            case 56542: goto L190;
            case 56544: goto L380;
            case 56570: goto L185;
            case 56571: goto L423;
            case 56575: goto L562;
            case 1746695: goto L594;
            case 1746749: goto L551;
            case 1746785: goto L688;
            case 1746818: goto L502;
            case 1746845: goto L360;
            case 1746880: goto L709;
            case 1746905: goto L154;
            case 1746911: goto L517;
            case 1746937: goto L490;
            case 1746967: goto L152;
            case 1746968: goto L275;
            case 1746970: goto L322;
            case 1747649: goto L431;
            case 1747656: goto L354;
            case 1747680: goto L433;
            case 1747711: goto L118;
            case 1747745: goto L313;
            case 1747747: goto L718;
            case 1747748: goto L398;
            case 1747773: goto L31;
            case 1747808: goto L685;
            case 1747811: goto L430;
            case 1747835: goto L23;
            case 1747837: goto L206;
            case 1747839: goto L523;
            case 1747866: goto L649;
            case 1747903: goto L466;
            case 1747927: goto L471;
            case 1747932: goto L616;
            case 1748609: goto L541;
            case 1748610: goto L525;
            case 1748612: goto L269;
            case 1748640: goto L453;
            case 1748641: goto L419;
            case 1748644: goto L7;
            case 1748646: goto L353;
            case 1748649: goto L714;
            case 1748672: goto L523;
            case 1748673: goto L478;
            case 1748679: goto L724;
            case 1748704: goto L235;
            case 1748707: goto L634;
            case 1748710: goto L709;
            case 1748734: goto L659;
            case 1748742: goto L296;
            case 1748764: goto L7;
            case 1748767: goto L259;
            case 1748770: goto L146;
            case 1748771: goto L231;
            case 1748826: goto L66;
            case 1748830: goto L450;
            case 1748834: goto L98;
            case 1748860: goto L75;
            case 1748894: goto L142;
            case 1749570: goto L592;
            case 1749571: goto L692;
            case 1749572: goto L278;
            case 1749574: goto L35;
            case 1749575: goto L566;
            case 1749601: goto L631;
            case 1749609: goto L200;
            case 1749610: goto L648;
            case 1749634: goto L27;
            case 1749640: goto L560;
            case 1749641: goto L46;
            case 1749663: goto L340;
            case 1749696: goto L440;
            case 1749700: goto L505;
            case 1749701: goto L675;
            case 1749702: goto L59;
            case 1749731: goto L701;
            case 1749757: goto L137;
            case 1749759: goto L169;
            case 1749762: goto L15;
            case 1749764: goto L529;
            case 1749789: goto L230;
            case 1749791: goto L523;
            case 1749822: goto L85;
            case 1749824: goto L207;
            case 1749850: goto L716;
            case 1749852: goto L195;
            case 1749857: goto L365;
            case 1750531: goto L290;
            case 1750539: goto L403;
            case 1750564: goto L173;
            case 1750565: goto L555;
            case 1750593: goto L15;
            case 1750595: goto L350;
            case 1750596: goto L695;
            case 1750599: goto L389;
            case 1750601: goto L267;
            case 1750624: goto L377;
            case 1750656: goto L15;
            case 1750663: goto L78;
            case 1750664: goto L712;
            case 1750695: goto L218;
            case 1750725: goto L276;
            case 1750726: goto L123;
            case 1750750: goto L538;
            case 1750754: goto L20;
            case 1750757: goto L268;
            case 1750783: goto L462;
            case 1750785: goto L332;
            case 1750810: goto L575;
            case 1750811: goto L670;
            case 1750816: goto L251;
            case 1750819: goto L617;
            case 1751494: goto L256;
            case 1751495: goto L600;
            case 1751496: goto L237;
            case 1751501: goto L48;
            case 1751525: goto L84;
            case 1751527: goto L127;
            case 1751531: goto L163;
            case 1751555: goto L190;
            case 1751557: goto L90;
            case 1751590: goto L415;
            case 1751593: goto L206;
            case 1751594: goto L120;
            case 1751616: goto L622;
            case 1751624: goto L389;
            case 1751649: goto L241;
            case 1751651: goto L185;
            case 1751655: goto L218;
            case 1751680: goto L328;
            case 1751687: goto L112;
            case 1751710: goto L251;
            case 1751712: goto L518;
            case 1751713: goto L213;
            case 1751714: goto L569;
            case 1751777: goto L244;
            case 1752455: goto L495;
            case 1752461: goto L71;
            case 1752486: goto L392;
            case 1752491: goto L457;
            case 1752551: goto L161;
            case 1752555: goto L328;
            case 1752578: goto L523;
            case 1752579: goto L709;
            case 1752583: goto L15;
            case 1752584: goto L610;
            case 1752611: goto L306;
            case 1752639: goto L720;
            case 1752641: goto L462;
            case 1752672: goto L137;
            case 1752677: goto L436;
            case 1752701: goto L655;
            case 1752734: goto L205;
            case 1752736: goto L424;
            case 1753447: goto L271;
            case 1753481: goto L300;
            case 1753509: goto L270;
            case 1753512: goto L179;
            case 1753514: goto L523;
            case 1753516: goto L480;
            case 1753570: goto L523;
            case 1753573: goto L581;
            case 1753574: goto L15;
            case 1753576: goto L99;
            case 1753633: goto L432;
            case 1753636: goto L409;
            case 1753637: goto L499;
            case 1753640: goto L346;
            case 1753693: goto L24;
            case 1753697: goto L25;
            case 1754380: goto L165;
            case 1754412: goto L637;
            case 1754415: goto L667;
            case 1754499: goto L446;
            case 1754508: goto L222;
            case 1754533: goto L616;
            case 1754537: goto L155;
            case 1754594: goto L114;
            case 1754598: goto L693;
            case 1754600: goto L218;
            case 1754660: goto L706;
            case 1755345: goto L371;
            case 1755399: goto L532;
            case 1755430: goto L640;
            case 1755436: goto L315;
            case 1755462: goto L704;
            case 1755463: goto L660;
            case 1755468: goto L281;
            case 1755496: goto L509;
            case 1755526: goto L137;
            case 1755528: goto L12;
            case 1755558: goto L229;
            case 1755584: goto L486;
            case 1755591: goto L181;
            case 1755619: goto L223;
            case 1755624: goto L305;
            default: goto L3;
        };
    L712:
        r10 = XposedHelpers.callMethod(r75.thisObject, u40.a("hVqXReMGLw==\n", "4j/jEZp2Sj0=\n"), new Object[0]);     // Catch: Throwable -> L587
        if (C0015.m61() <= 0) goto L263;
        String r4 = "ۡۧ";
    L266:
        r70 = C0006.m26(r4);
        goto L3
    L263:
        C0072.m289();
        String r410 = "ۣۢۡ";
    L264:
        r70 = C0005.m23(r410);
    L589:
        if ((C0062.f62 % (C0055.f55 % 5087)) >= 0) goto L590;
        r70 = (C0020.f20 | C0000.f0) + 1753744;
        goto L3
    L590:
        r70 = C0005.m23("ۢۨۧ");
        goto L3
    L714:
        if (r65.isEmpty() == false) goto L205;
        r70 = (C0014.f14 * C0021.f21) ^ 1977710;
    L627:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("spCCAhWCphWTlbkjH52OM4+QlD41hKMVkw==\n", "4f7xTHD20Xo=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        if (C0058.f58 > 0) goto L572;
        C0055.m223();
        r70 = C0067.m271("ۢۥۧ");
    L572:
        r70 = C0069.m277("ۢۦۣ");
        goto L3
    L716:
        r7 = XposedHelpers.getObjectField(r41, pb0.r1);     // Catch: Throwable -> L105
        if (C0013.m52() >= 0) goto L110;
        r70 = (C0036.f36 * C0070.f70) + 1291700;
        goto L3
    L110:
        C0072.f72 = 95;
        r70 = C0025.m102("ۦۤۤ");
    L106:
        r70 = C0023.m95("۠ۦ");
        goto L3
    L718:
        int r411 = gn.b(u40.a("Z+wZLEm3tD111gQWSaOu\n", "DIlgcyXC11Y=\n"), 0);     // Catch: Throwable -> L372
        if ((C0022.f22 ^ (C0016.f16 - 1844)) <= 0) goto L386;
        r68 = r411;
        r70 = (C0054.f54 / C0030.f30) ^ 1749699;
        goto L3
    L386:
        C0046.m185();
        r68 = r411;
        r70 = C0069.m277("ۢۨ۠");
    L710:
        gn r412 = gn.a;     // Catch: Throwable -> L455
        String r12 = u40.a("WTFaLjA76w1LC0cUMC/x\n", "MlQjcVxOiGY=\n");     // Catch: Throwable -> L455
        String r16 = u40.a("Qg==\n", "chrynql3WXk=\n");     // Catch: Throwable -> L455
        r412.getClass();     // Catch: Throwable -> L455
        r32 = Long.parseLong(gn.d(r12, r16));     // Catch: Throwable -> L455
        if ((C0046.f46 + (C0041.f41 | (-2724))) < 0) goto L158;
        C0040.f40 = 96;
        r70 = C0048.m193("ۦۣۨ");
    L158:
        String r413 = "ۧ۠ۥ";
    L159:
        r70 = C0070.m281(r413);
    L456:
        r22 = 0;
        boolean r414 = r21;
        boolean r122 = r24;
    L287:
        r21 = r414;
        r24 = r122;
        r70 = C0019.m79("ۥۦۡ");
        goto L3
    L720:
        LinkedList r0 = (LinkedList) r5;     // Catch: Throwable -> L203
        if ((C0067.f67 % (C0052.f52 + 2199)) >= 0) goto L133;
        String r123 = "ۣۥۨ";
        r14 = r0;
    L37:
        r70 = C0024.m98(r123);
        goto L3
    L133:
        C0019.m77();
        String r124 = "ۣۢۦ";
        r14 = r0;
        boolean r162 = r27;
    L134:
        r70 = C0027.m110(r124);
        r27 = r162;
    L204:
        r70 = (C0001.f1 * C0001.f1) + 1714419;
        goto L3
    L724:
        String r02 = (String) r6;     // Catch: Throwable -> L603
    L294:
        r70 = (C0044.f44 | C0035.f35) + 1754733;
    L604:
        u40.a("Q4wS\n", "AsBeospW0AQ=\n");     // Catch: Throwable -> L626
        if (C0042.m169() <= 0) goto L607;
        String r415 = "ۨۢ";
    L187:
        r70 = C0056.m226(r415);
        goto L3
    L607:
        C0018.m75();
        r70 = C0052.m209("۠ۢۦ");
        goto L3
    L5:
        r70 = (C0061.f61 + C0005.f5) + 1750072;
    L7:
        if ((C0022.f22 * (C0062.f62 / (-5630))) == 0) goto L10;
        C0036.f36 = 67;
        String r416 = "ۣۤۦ";
    L9:
        r70 = C0026.m105(r416);
        goto L3
    L10:
        r416 = "۟ۨۡ";
        goto L9
    L12:
        if (r28 == 211) goto L346;
        r70 = C0025.m102("ۦۡۤ");
    L15:
        if (C0023.m92() >= 0) goto L16;
        String r163 = "۟ۥۦ";
    L18:
        r70 = C0040.m160(r163);
        goto L3
    L16:
        C0025.f25 = 61;
        r70 = C0013.m53("ۤۧۧ");
        goto L3
    L20:
        if ((C0009.f9 ^ (C0055.f55 + 5843)) >= 0) goto L21;
        r70 = (C0066.f66 | C0037.f37) ^ (-1751588);
        goto L3
    L21:
        r70 = C0063.m254("ۨۧ");
        goto L3
    L23:
        r70 = (C0014.f14 + C0038.f38) + 1753653;
        goto L3
    L24:
        switch(r28) {
            case 210: goto L631;
            case 211: goto L631;
            case 212: goto L631;
            default: goto L25;
        };
    L25:
        r70 = (C0044.f44 % C0013.f13) + 1755236;
        goto L3
    L27:
        if ((C0023.f23 | (C0045.f45 | 6490)) >= 0) goto L28;
        r22 = r32;
        r70 = (C0035.f35 % C0049.f49) + 1755556;
        goto L3
    L28:
        r22 = r32;
        r70 = C0008.m35("ۢۡۧ");
        goto L3
    L31:
        if (C0020.m82() <= 0) goto L32;
        r70 = C0042.m170("۠ۥۤ");
        goto L3
    L32:
        C0056.m224();
        r70 = C0062.m249("ۣۥۨ");
    L35:
        if ((C0016.f16 - (C0067.f67 + 6021)) >= 0) goto L36;
        String r417 = "۠ۢۥ";
    L39:
        r70 = C0012.m50(r417);
        goto L3
    L36:
        C0019.f19 = 90;
        r123 = "ۧۤۡ";
        goto L37
    L41:
        if (C0001.m4() <= 0) goto L42;
        String r418 = "ۡۤۦ";
        r18 = r13;
    L45:
        r70 = C0010.m43(r418);
        goto L3
    L42:
        String r125 = "ۣۡۧ";
        ClassLoader r419 = r15;
        String r164 = r17;
        r18 = r13;
    L43:
        r15 = r419;
        r17 = r164;
        r70 = C0004.m16(r125);
        goto L3
    L46:
        String r420 = "ۣۦۥ";
        int r126 = r25;
    L47:
        r70 = C0051.m207(r420);
        r26 = r126;
        goto L3
    L48:
        if (r71 == true) goto L15;
        hs r421 = hs.a;     // Catch: Throwable -> L92
        if ((C0038.f38 + (C0024.f24 % (-5773))) >= 0) goto L52;
        String r422 = "ۧۦۥ";
    L55:
        r70 = C0010.m43(r422);
        goto L3
    L52:
        C0000.m0();
    L53:
        r70 = C0003.m13("ۥۦۦ");
    L94:
        if ((C0027.f27 - (C0044.f44 ^ (-7804))) <= 0) goto L95;
        r70 = (C0042.f42 - C0006.f6) + 1751039;
        goto L3
    L95:
        C0008.m33();
        r70 = C0013.m53("ۦۦۤ");
        goto L3
    L59:
        r22 = r68;
        if ((C0053.f53 - (C0058.f58 | (-1472))) <= 0) goto L61;
        String r423 = "ۧ۟ۤ";
    L65:
        r70 = C0055.m220(r423);
        goto L3
    L61:
        C0029.m118();
    L62:
        String r424 = "ۨ۟ۨ";
    L63:
        r70 = C0027.m110(r424);
        goto L3
    L66:
        r414 = r21;
        r122 = r24;
    L68:
        if (C0039.f39 >= 0) goto L69;
        r21 = r414;
        r24 = r122;
        r70 = C0004.m16("ۨۢۦ");
        goto L3
    L69:
        C0013.m52();
        r163 = "ۣۢۧ";
        r21 = r414;
        r24 = r122;
        goto L18
    L71:
        i00 r127 = new i00();     // Catch: Throwable -> L626
        String r425 = "ۨۤۤ";
    L73:
        r55 = r127;
        r70 = C0016.m65(r425);
        goto L3
    L75:
        if (C0040.m162() >= 0) goto L76;
        r70 = (C0046.f46 + C0031.f31) ^ 1750999;
        goto L3
    L76:
        C0057.m230();
        r420 = "ۢۡۥ";
        r126 = r26;
        goto L47
    L78:
        String r426 = (String) hs.c.get(r66);     // Catch: Throwable -> L92
        if (C0025.m103() < 0) goto L82;
        r42 = r426;
        r70 = C0021.m86("ۣۧۨ");
        goto L3
    L82:
        String r128 = "ۥ۠ۦ";
        String r165 = r426;
    L83:
        r42 = r165;
        r70 = C0059.m239(r128);
        goto L3
    L84:
        r70 = (C0011.f11 / C0018.f18) + 56476;
        goto L3
    L85:
        r70 = (C0073.f73 - C0073.f73) + 1749702;
    L87:
        if (C0028.m112() <= 0) goto L88;
        r70 = (C0040.f40 | C0004.f4) ^ (-56903);
        goto L3
    L88:
        C0037.m150();
        r422 = "ۣۧۨ";
        goto L55
    L90:
        r49.append(" 下发数据为空，无新内容需点赞。");     // Catch: Throwable -> L626
        r57 = r49.toString();     // Catch: Throwable -> L626
        r70 = (C0025.f25 - C0041.f41) ^ (-1754464);
        goto L3
    L98:
        r65 = (Collection) r55.b;     // Catch: Throwable -> L626
        r70 = (C0004.f4 * C0015.f15) + 1171037;
        goto L3
    L99:
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), r47);     // Catch: Throwable -> L626
        if ((C0070.f70 % (C0025.f25 + 8319)) <= 0) goto L102;
        String r427 = "۠۟ۧ";
        id r129 = r54;
    L104:
        r54 = r129;
        r70 = C0068.m272(r427);
        goto L3
    L102:
        C0005.f5 = 32;
        r70 = C0009.m38("ۤ۠ۧ");
        goto L3
    L112:
        switch(r20) {
            case 0: goto L701;
            case 1: goto L114;
            case 2: goto L114;
            case 3: goto L529;
            default: goto L114;
        };
    L114:
        if (C0059.f59 < 0) goto L117;
        C0073.m295();
        String r428 = "ۨۡۨ";
    L116:
        r70 = C0014.m57(r428);
        goto L3
    L117:
        r428 = "ۦ۠ۡ";
        goto L116
    L118:
        if (r46 == false) goto L35;
    L119:
        r70 = C0056.m226("۠ۥ۠");
        goto L3
    L120:
        in r429 = in.a;     // Catch: Throwable -> L626
        r70 = (C0023.f23 % C0015.f15) + 1748092;
        goto L3
    L123:
        if ((C0069.f69 ^ (C0010.f10 - 9061)) <= 0) goto L124;
        r45 = r14;
        r70 = (C0033.f33 * C0024.f24) + 1751813;
        goto L3
    L124:
        r45 = r14;
        r70 = C0028.m114("ۡۢۧ");
        goto L3
    L127:
        if ((C0051.f51 ^ (C0034.f34 ^ 1399)) <= 0) goto L128;
        r70 = (C0044.f44 + C0042.f42) + 1752077;
        goto L3
    L128:
        r70 = C0026.m105("ۤۤۧ");
        goto L3
    L137:
        if ((C0041.f41 - (C0048.f48 ^ 95)) > 0) goto L140;
        C0001.f1 = 16;
        String r430 = "ۣۧۢ";
    L139:
        r70 = C0061.m246(r430);
        goto L3
    L140:
        r417 = "ۣۢ۟";
    L142:
        if ((C0038.f38 | (C0060.f60 % (-438))) >= 0) goto L143;
        r70 = (C0063.f63 * C0014.f14) + 1799256;
        goto L3
    L143:
        String r431 = "۟ۨ";
        int r1210 = r28;
    L144:
        r28 = r1210;
        r70 = C0034.m138(r431);
        goto L3
    L146:
        nf r1211 = wg.b;     // Catch: Throwable -> L626
        y30 r432 = new y30(r55, r15, null);     // Catch: Throwable -> L626
        if (C0012.f12 <= 0) goto L149;
        r29 = r432;
        r30 = r1211;
        r70 = (C0009.f9 - C0018.f18) + 1748009;
        goto L3
    L149:
        C0046.m185();
    L150:
        r29 = r432;
        r30 = r1211;
        r70 = C0044.m176("۠ۦ۠");
        goto L3
    L152:
        r70 = (C0003.f3 * C0036.f36) ^ 1173925;
        r71 = r72;
        goto L3
    L154:
        r64 = u40.a("wtIlnHk+6IfQ\n", "qbdcwxVLi+w=\n");     // Catch: Throwable -> L92
        r70 = C0000.m2("ۣۨۨ");
        goto L3
    L155:
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), r57);     // Catch: Throwable -> L626
        if ((C0019.f19 | (C0018.f18 | 2129)) <= 0) goto L158;
        r413 = "ۣۦۨ";
    L161:
        String r433 = "ۢۧۥ";
    L162:
        r70 = C0044.m176(r433);
        goto L3
    L163:
        r430 = "ۡ۠ۥ";
        goto L139
    L165:
        if ((C0020.f20 % (C0045.f45 % (-6226))) >= 0) goto L166;
        r70 = (C0007.f7 ^ C0038.f38) + 1749898;
        goto L3
    L166:
        C0061.f61 = 2;
        r70 = C0062.m249("ۣۦۡ");
        goto L3
    L169:
        if (C0011.f11 >= 0) goto L170;
        r70 = C0048.m193("ۣۣۧ");
        goto L3
    L170:
        C0044.m178();
        r70 = C0046.m186("ۦۡۤ");
        goto L3
    L173:
        if (hs.b.putIfAbsent(r63, Boolean.TRUE) != null) goto L15;
        r43 = r75.thisObject;     // Catch: Throwable -> L92
        if (C0031.f31 < 0) goto L178;
        C0008.f8 = 8;
        r70 = C0038.m153("ۡۦۣ");
        goto L3
    L178:
        r128 = "ۨۢ۠";
        r165 = r42;
        goto L83
    L179:
        r70 = (C0023.f23 % C0071.f71) + 55922;
        goto L3
    L181:
        if (C0070.m280() < 0) goto L183;
        C0019.m77();
        r70 = C0044.m176("ۣۨ");
        goto L3
    L183:
        r163 = "ۤ۟";
        goto L18
    L185:
        if ((C0060.f60 - (C0023.f23 | 837)) > 0) goto L188;
        C0000.m0();
        r415 = "ۣۤۦ";
        goto L187
    L188:
        r415 = "ۤۨۥ";
        goto L187
    L190:
        if (C0027.m111() <= 0) goto L191;
        r70 = (C0043.f43 * C0032.f32) + 1883726;
        goto L3
    L191:
        C0059.f59 = 71;
        String r434 = "ۡۥۣ";
    L192:
        r70 = C0052.m209(r434);
        goto L3
    L195:
        if (C0050.m202() >= 0) goto L196;
        r35 = r34;
        r70 = (C0049.f49 / C0044.f44) + 56353;
        goto L3
    L196:
        C0061.f61 = 37;
        LinkedList r166 = r34;
    L197:
        r35 = r166;
        r70 = C0061.m246("ۣ۠۠");
        goto L3
    L200:
        if ((C0072.f72 | (C0015.f15 / (-7448))) >= 0) goto L201;
        r70 = C0013.m53("ۨۤۤ");
        goto L3
    L201:
        r70 = C0042.m170("ۦۦۣ");
    L205:
        r70 = C0067.m271("ۣ۟ۦ");
        goto L3
    L206:
        r70 = (C0044.f44 + C0042.f42) + 1748387;
        goto L3
    L207:
        r9 = r75.args[0];     // Catch: Throwable -> L92
        if ((C0037.f37 % (C0018.f18 % 6158)) >= 0) goto L210;
        r70 = C0043.m173("ۥۣۦ");
        goto L3
    L210:
        r70 = C0030.m120("ۣۡۡ");
    L213:
        if (C0017.m71() <= 0) goto L214;
        r70 = C0041.m164("ۢۦۡ");
        goto L3
    L214:
        String r435 = "ۣ۠۠";
        boolean r1212 = r36;
    L215:
        r70 = C0030.m120(r435);
        r36 = r1212;
        goto L3
    L218:
        if (C0073.f73 <= 0) goto L219;
        r70 = C0029.m116("ۣ۟ۨ");
        goto L3
    L219:
        C0050.f50 = 4;
        String r436 = "ۥۨ۠";
        JSONObject r1213 = r37;
    L220:
        r37 = r1213;
        r70 = C0005.m23(r436);
    L222:
        r70 = (C0006.f6 ^ C0045.f45) + 1749847;
        goto L3
    L223:
        r61.getClass();     // Catch: Throwable -> L92
        if (C0019.f19 <= 0) goto L226;
        String r437 = "ۦۦۤ";
    L228:
        r70 = C0034.m138(r437);
        goto L3
    L226:
        r70 = C0062.m249("ۤ۟ۨ");
        goto L3
    L229:
        r70 = C0011.m45("ۤۥۡ");
        goto L3
    L230:
        r13 = null;
        r123 = "ۤۥ";
        goto L37
    L231:
        if (r18 == null) goto L222;
        r25 = r18.intValue();     // Catch: Throwable -> L92
        String r1214 = "ۢۡۨ";
        r419 = r15;
        String r167 = r17;
    L234:
        r15 = r419;
        r17 = r167;
        r70 = C0001.m5(r1214);
        goto L3
    L235:
        r70 = (C0001.f1 | C0005.f5) ^ (-1748561);
    L237:
        if (C0065.m260() <= 0) goto L238;
        r70 = (C0030.f30 * C0018.f18) + 1722096;
        goto L3
    L238:
        C0051.m206();
        r418 = "۠۟";
        goto L45
    L241:
        if ((C0008.f8 | (C0061.f61 - 9448)) >= 0) goto L242;
        r66 = r19;
        r70 = (C0017.f17 ^ C0045.f45) ^ (-1752667);
        goto L3
    L242:
        C0013.m52();
        r66 = r19;
        r70 = C0065.m263("ۢ۟ۤ");
        goto L3
    L244:
        r5 = XposedHelpers.getObjectField(r41, pb0.r1);     // Catch: Throwable -> L203
        if ((C0000.f0 * (C0023.f23 % 6576)) <= 0) goto L247;
        String r438 = "ۣۨ۟";
    L249:
        r70 = C0034.m138(r438);
        goto L3
    L247:
        C0062.f62 = 22;
        r70 = C0042.m170("ۧۨۥ");
        goto L3
    L251:
        if ((C0060.f60 - (C0018.f18 % 5333)) <= 0) goto L252;
        r70 = C0020.m80("ۡۢ");
        goto L3
    L252:
        C0010.m40();
        String r1215 = "۟ۧۤ";
    L253:
        r70 = C0054.m219(r1215);
    L256:
        if (C0063.m253() <= 0) goto L257;
        r70 = (C0073.f73 + C0049.f49) + 1751580;
        goto L3
    L257:
        C0013.m52();
        r70 = C0064.m258("۟ۦۤ");
        goto L3
    L259:
        ip.o(u40.a("wQ7ctDQ=\n", "sW+u1Vm+ZQA=\n"), r75);
        goto L62
    L267:
        r34 = null;
        r70 = C0065.m263("ۢۨۢ");
        goto L3
    L268:
        r434 = "ۦۤ۠";
        goto L192
    L269:
        r37 = r52;
        r70 = (C0004.f4 ^ C0048.f48) ^ (-1746948);
    L270:
        r70 = C0015.m60("ۤۦۤ");
        goto L3
    L271:
        super.afterHookedMethod(r75);
        if ((C0063.f63 - (C0046.f46 / 8280)) <= 0) goto L273;
        r70 = (C0068.f68 + C0013.f13) + 1753866;
        goto L3
    L273:
        C0026.f26 = 85;
        r70 = C0056.m226("ۣۤۨ");
        goto L3
    L275:
        r44 = null;
        r70 = (C0006.f6 - C0067.f67) + 1748051;
        goto L3
    L276:
        r436 = "ۣۤ۠";
        r1213 = r38;
        goto L220
    L278:
        if (C0015.m61() <= 0) goto L279;
        r70 = (C0031.f31 % C0042.f42) + 1755452;
        goto L3
    L279:
        C0071.m284();
        r70 = C0051.m207("ۥۢ۟");
        goto L3
    L281:
        ip.o(u40.a("1Q==\n", "pc7Qv/tSck0=\n"), r75);
        r122 = z30.q("nIDVYjGQVj2olsJOD5pHOJKRyQ==\n", "9+WsPVD+IlQ=\n", gn.a);
        r414 = gn.e(u40.a("XXktxETiwcVpbzroevvcwVM=\n", "NhxUmyWXtao=\n"));
        if (r122 == true) goto L68;
        if (r414 == true) goto L68;
        if ((C0005.f5 ^ (C0038.f38 - 7351)) >= 0) goto L286;
        r166 = r35;
        r21 = r414;
        r24 = r122;
        goto L197
    L286:
        C0045.m181();
        goto L287
    L290:
        if ((C0004.f4 % (C0054.f54 % (-9199))) >= 0) goto L291;
        r70 = (C0053.f53 ^ C0035.f35) ^ 56932;
        goto L3
    L291:
        C0031.f31 = 82;
        r4 = "ۤۥۣ";
    L296:
        if ((C0063.f63 / (C0014.f14 ^ 3724)) != 0) goto L297;
        r1215 = "ۣۣۧ";
        goto L253
    L297:
        C0048.f48 = 17;
        r438 = "ۡۡۥ";
        goto L249
    L300:
        if (r28 != 212) goto L523;
        if ((C0063.f63 ^ (C0022.f22 | 3147)) < 0) goto L304;
        r70 = C0048.m193("ۧ۟ۤ");
        goto L3
    L304:
        r424 = "ۡۦۧ";
        goto L63
    L305:
        r70 = (C0066.f66 - C0069.f69) ^ 1751504;
        goto L3
    L306:
        u40.a("8KpS\n", "seYeakckjHs=\n");     // Catch: Throwable -> L626
        if (C0067.f67 >= 0) goto L309;
        String r439 = "ۥ۟ۧ";
    L312:
        r70 = C0007.m28(r439);
        goto L3
    L309:
        C0023.m92();
    L310:
        r70 = C0065.m263("ۡۢۡ");
        goto L3
    L313:
        r8 = r75.args[2];     // Catch: Throwable -> L92
        r70 = (C0048.f48 | C0002.f2) + 1752550;
        goto L3
    L315:
        Object r440 = r75.args[4];
        if (r440 == null) goto L318;
    L520:
        if (C0041.m167() <= 0) goto L521;
        r40 = r440;
        r70 = (C0006.f6 - C0053.f53) ^ 1751029;
        goto L3
    L521:
        C0013.f13 = 0;
        r40 = r440;
        r70 = C0016.m65("ۤۦ۟");
        goto L3
    L318:
        if ((C0010.f10 + (C0041.f41 % 5346)) >= 0) goto L319;
        r40 = r440;
        r70 = (C0001.f1 + C0030.f30) ^ (-1754637);
        goto L3
    L319:
        String r1216 = "۠ۨۤ";
        Object r168 = r41;
    L320:
        r40 = r440;
        r41 = r168;
        r70 = C0058.m234(r1216);
        goto L3
    L322:
        if (r24 == false) goto L592;
        if (C0070.m280() >= 0) goto L325;
        r70 = C0002.m8("ۤۢۨ");
        goto L3
    L325:
        r423 = "ۣۢۧ";
        goto L65
    L328:
        if ((C0042.f42 - (C0000.f0 | 4336)) < 0) goto L330;
        C0020.m82();
        r70 = C0021.m86("ۧۥۣ");
        goto L3
    L330:
        r438 = "ۤ۟ۨ";
        goto L249
    L332:
        if (C0060.m240() >= 0) goto L333;
        r70 = (C0022.f22 ^ C0019.f19) + 1747745;
        goto L3
    L333:
        r70 = C0050.m203("ۧۧ۠");
        goto L3
    L336:
        if (C0069.m276() < 0) goto L338;
        r35 = r39;
        r70 = C0029.m116("ۣۡ۟");
        goto L3
    L338:
        r410 = "ۣۨ";
        r35 = r39;
        goto L264
    L340:
        if ((r7 instanceof LinkedList) == false) goto L667;
        if (C0006.f6 > 0) goto L344;
        C0038.f38 = 46;
        r70 = C0073.m292("ۣۢ۟");
        goto L3
    L344:
        r163 = "ۣۢۡ";
    L346:
        if (C0056.f56 >= 0) goto L347;
        r70 = (C0057.f57 + C0048.f48) + 1748963;
        goto L3
    L347:
        C0073.m295();
        r128 = "ۨ۟۠";
        r165 = r42;
        goto L83
    L350:
        if (C0058.m232() <= 0) goto L351;
        r70 = (C0043.f43 | C0016.f16) ^ 1753048;
        goto L3
    L351:
        C0022.m88();
        r70 = C0006.m26("ۤ۟ۧ");
        goto L3
    L353:
        r70 = (C0002.f2 | C0063.f63) + 1748007;
        goto L3
    L354:
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), r62);     // Catch: Throwable -> L626
        if (C0054.m217() < 0) goto L358;
        C0008.f8 = 13;
        r70 = C0042.m170("ۥ۠ۦ");
        goto L3
    L358:
        r432 = r29;
        r1211 = r30;
        goto L150
    L360:
        if (r42.length() != 0) goto L431;
        if (C0028.f28 >= 0) goto L363;
        r70 = (C0028.f28 ^ C0020.f20) + 55834;
        goto L3
    L363:
        r70 = C0032.m130("ۣۢ۟");
        goto L3
    L365:
        if (r65 == null) goto L462;
        if (C0030.m121() >= 0) goto L368;
        r70 = (C0030.f30 | C0043.f43) + 1748175;
        goto L3
    L368:
        C0009.m36();
        r70 = C0013.m53("ۣۢۥ");
        goto L3
    L371:
        r61 = gn.a;     // Catch: Throwable -> L92
        r70 = (C0048.f48 % C0048.f48) + 1746905;
        goto L3
    L377:
        Handler r1217 = d9.b;     // Catch: Throwable -> L92
        fi r441 = new fi(r15, r43, r63, 1);     // Catch: Throwable -> L92
        r58 = r441;
        r59 = r1217;
        r70 = (C0065.f65 * C0071.f71) + 1219448;
        goto L3
    L380:
        if (C0026.f26 > 0) goto L382;
        C0036.f36 = 13;
        r70 = C0008.m35("ۤۢۨ");
        goto L3
    L382:
        r437 = "۠ۨۤ";
        goto L228
    L389:
        if ((C0033.f33 ^ (C0014.f14 | 5882)) >= 0) goto L390;
        r70 = (C0034.f34 % C0047.f47) ^ (-1748614);
        goto L3
    L390:
        C0067.f67 = 38;
        r70 = C0029.m116("ۦۣۧ");
        goto L3
    L392:
        if (r19 != null) goto L296;
        r67 = "";
        if (C0030.f30 <= 0) goto L396;
        r70 = (C0054.f54 % C0040.f40) ^ 1748586;
        goto L3
    L396:
        r70 = C0008.m35("ۤ۠ۡ");
        goto L3
    L398:
        r55.b = r45;     // Catch: Throwable -> L626
        if ((C0043.f43 / (C0023.f23 - 3871)) != 0) goto L401;
        r70 = (C0013.f13 | C0023.f23) + 1747312;
    L401:
        r70 = C0070.m281("۟ۤۢ");
        goto L3
    L403:
        ip.l(r63);     // Catch: Throwable -> L92
        if ((C0020.f20 - (C0022.f22 - 362)) <= 0) goto L406;
        r70 = C0015.m60("۟۟ۧ");
        goto L3
    L406:
        r70 = C0009.m38("ۤۥۡ");
        goto L3
    L409:
        if (gn.e(r64) == false) goto L15;
        if (C0015.f15 < 0) goto L414;
        C0066.m265();
        String r442 = "۟ۡ۟";
    L413:
        r70 = C0040.m160(r442);
        goto L3
    L414:
        r442 = "ۡۡۡ";
        goto L413
    L415:
        String r1218 = u40.a("5UqNA5A5iv7fT5s=\n", "tiT+QuVN5bI=\n");     // Catch: Throwable -> L626
        StringBuilder r169 = new StringBuilder("💤 CGI ");     // Catch: Throwable -> L626
        String r443 = "ۣۨۨ";
    L417:
        r48 = r1218;
        r49 = r169;
        r70 = C0010.m43(r443);
        goto L3
    L419:
        if (C0049.m199() >= 0) goto L420;
        r45 = r44;
        r70 = (C0022.f22 | C0016.f16) + 1748281;
        goto L3
    L420:
        C0033.m135();
        LinkedList r444 = r44;
        boolean r1219 = r46;
    L421:
        r45 = r444;
        r46 = r1219;
        r70 = C0058.m234("۠ۡ۠");
        goto L3
    L423:
        r430 = "ۤۦ۠";
        goto L139
    L424:
        r59.postDelayed(r58, r22);     // Catch: Throwable -> L92
        if (C0019.f19 <= 0) goto L427;
        String r445 = "۟ۥۦ";
    L429:
        r70 = C0052.m209(r445);
        goto L3
    L427:
        r70 = C0001.m5("ۨۢ۠");
        goto L3
    L430:
        r125 = "ۥۧ۟";
        r419 = r15;
        r164 = r17;
        r19 = r17;
    L431:
        r417 = "ۢ۟۠";
    L432:
        r70 = (C0027.f27 + C0065.f65) + 1751149;
        goto L3
    L433:
        r168 = XposedHelpers.getObjectField(XposedHelpers.getObjectField(r40, pb0.p1), pb0.q1);     // Catch: Throwable -> L587
        r1216 = "ۥۤۢ";
        r440 = r40;
        goto L320
    L436:
        if ((C0027.f27 ^ (C0030.f30 % (-4255))) < 0) goto L439;
        String r446 = "ۥۢۤ";
        String r1220 = r47;
    L438:
        r47 = r1220;
        r70 = C0015.m60(r446);
        goto L3
    L439:
        r416 = "ۣۡ۟";
        goto L9
    L440:
        LinkedList r447 = (LinkedList) r7;     // Catch: Throwable -> L105
        if ((C0032.f32 + (C0064.f64 ^ (-276))) >= 0) goto L443;
        r39 = r447;
        r70 = (C0020.f20 * C0056.f56) ^ 119800;
    L443:
        r39 = r447;
        r70 = C0049.m197("ۣۨ۠");
        goto L3
    L446:
        if (C0015.f15 >= 0) goto L447;
        r70 = C0016.m65("ۤ۟ۨ");
        r71 = r53;
        goto L3
    L447:
        C0071.m284();
        r70 = C0054.m219("ۣ۟۟");
        r71 = r53;
        goto L3
    L450:
        if (C0064.m257() >= 0) goto L451;
        r18 = r50;
        r70 = (C0037.f37 / C0043.f43) ^ (-1751532);
        goto L3
    L451:
        C0014.m58();
        r18 = r50;
        r70 = C0005.m23("ۢ۠ۧ");
        goto L3
    L453:
        r6 = XposedHelpers.callMethod(r75.thisObject, u40.a("43feBJDOCUblf88=\n", "hBKqUeOrewg=\n"), new Object[0]);     // Catch: Throwable -> L603
        r447 = r39;
        goto L443
    L457:
        if (r42 == null) goto L616;
        if (C0020.m82() > 0) goto L401;
        r70 = C0057.m229("ۨۨۨ");
    L462:
        if ((C0015.f15 + (C0047.f47 ^ (-2401))) > 0) goto L464;
        C0039.f39 = 7;
        r70 = C0027.m110("ۣۢۢ");
        goto L3
    L464:
        String r448 = "ۤۢۤ";
    L465:
        r70 = C0030.m120(r448);
        goto L3
    L466:
        if (r37 != null) goto L87;
        if ((C0001.f1 * (C0025.f25 - 5810)) > 0) goto L470;
        r70 = C0039.m159("ۥۣۥ");
        goto L3
    L470:
        r417 = "ۤ۠ۡ";
        goto L39
    L471:
        if (r36 == false) goto L15;
        if (C0004.f4 >= 0) goto L474;
        r70 = (C0054.f54 ^ C0045.f45) ^ (-1750504);
        goto L3
    L474:
        r443 = "ۣۨۡ";
        r1218 = r48;
        r169 = r49;
        goto L417
    L478:
        if (gn.b(u40.a("iwX2iIxe3I6ZP+K4hE4=\n", "4GCP1+Arv+U=\n"), 0) == 1) goto L161;
    L480:
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), r48);     // Catch: Throwable -> L626
        if (C0049.m199() < 0) goto L484;
        r70 = C0054.m219("ۤۦۢ");
        goto L3
    L484:
        r435 = "ۧۤۦ";
        r1212 = r36;
        goto L215
    L486:
        if (C0050.f50 <= 0) goto L487;
        r70 = (C0055.f55 % C0024.f24) ^ (-1755528);
        goto L3
    L487:
        C0069.m276();
        r70 = C0045.m182("ۣۣ۠");
        goto L3
    L490:
        a80.r(r54, r30, r29, 2);     // Catch: Throwable -> L626
        if (C0036.m147() < 0) goto L310;
        r70 = C0032.m130("۠ۤۧ");
        goto L3
    L495:
        if ((C0061.f61 + (C0003.f3 * (-3183))) >= 0) goto L496;
        r70 = (C0010.f10 * C0034.f34) + 1110530;
        goto L3
    L496:
        C0012.m51();
        r70 = C0035.m140("۠۠۠");
        goto L3
    L499:
        if (C0014.f14 >= 0) goto L500;
        r70 = (C0046.f46 * C0036.f36) + 1425404;
        goto L3
    L500:
        C0001.m4();
        r433 = "ۣۧۢ";
        goto L162
    L502:
        r1220 = u40.a("lUAhgx2tCIuvRTc=\n", "xi5SwmjZZ8c=\n");     // Catch: Throwable -> L626
        r446 = "ۨۡ۠";
        goto L438
    L505:
        if (C0032.m128() >= 0) goto L506;
        r70 = (C0045.f45 - C0039.f39) + 1750484;
        goto L3
    L506:
        r70 = C0049.m197("۟ۥۦ");
        goto L3
    L509:
        if (r28 == 211) goto L432;
        if (r28 == 212) goto L142;
        if (C0031.m124() <= 0) goto L514;
        r70 = (C0053.f53 ^ C0002.f2) + 1748991;
        goto L3
    L514:
        C0043.m172();
        String r1221 = "ۣۢۧ";
        Integer r1610 = r50;
    L515:
        r50 = r1610;
        r70 = C0018.m73(r1221);
        goto L3
    L517:
        r70 = (C0009.f9 | C0031.f31) + 1754699;
        goto L3
    L518:
        r440 = r40;
    L523:
        r70 = (C0067.f67 % C0033.f33) + 1748862;
        goto L3
    L525:
        if (C0007.m31() >= 0) goto L526;
        r66 = r67;
        r70 = (C0040.f40 % C0009.f9) + 1750155;
        goto L3
    L526:
        C0027.m111();
        r66 = r67;
        r70 = C0053.m213("ۡ۟۟");
    L529:
        if (C0059.f59 >= 0) goto L530;
        r428 = "ۣۨۧ";
        goto L116
    L530:
        C0045.f45 = 74;
        r417 = "ۣۥۢ";
        goto L39
    L532:
        int r1222 = ((LinkedList) r55.b).size();     // Catch: Throwable -> L626
        StringBuilder r449 = new StringBuilder("🔍 捕获到 ");     // Catch: Throwable -> L626
        if (C0008.f8 >= 0) goto L535;
        r60 = r449;
        r69 = r1222;
        r70 = (C0057.f57 ^ C0014.f14) ^ 1750324;
        goto L3
    L535:
        C0059.m236();
        r60 = r449;
        r69 = r1222;
        r70 = C0069.m277("ۤۢ");
        goto L3
    L538:
        if ((C0073.f73 | (C0065.f65 | 7934)) >= 0) goto L539;
        r70 = (C0053.f53 / C0018.f18) + 1747927;
        r36 = r51;
        goto L3
    L539:
        C0031.f31 = 57;
        r36 = r51;
        goto L119
    L541:
        if (r26 == 0) goto L659;
        if (C0011.f11 < 0) goto L545;
        C0068.f68 = 41;
        r70 = C0000.m2("ۡ۠۟");
        goto L3
    L545:
        r416 = "۠ۤ";
        goto L9
    L546:
        int r03 = this.a;
        r419 = this.b;
        if ((C0053.f53 - (C0052.f52 + 3994)) < 0) goto L549;
        C0061.f61 = 87;
        r1214 = "ۣۤ۟";
        r167 = null;
        r20 = r03;
        goto L234
    L549:
        r125 = "ۤۥۨ";
        r164 = null;
        r20 = r03;
        goto L43
    L551:
        if ((C0024.f24 / (C0041.f41 | 3452)) != 0) goto L552;
        String r450 = "ۣۨۢ";
    L554:
        r70 = C0047.m189(r450);
        goto L3
    L552:
        C0028.m112();
        r70 = C0007.m28("ۢ۟ۡ");
        goto L3
    L555:
        r60.append(r69);     // Catch: Throwable -> L626
        if (C0067.f67 >= 0) goto L558;
        r70 = (C0017.f17 / C0067.f67) + 1750600;
        goto L3
    L558:
        r445 = "ۨۢ";
        goto L429
    L560:
        r434 = "ۡ۟۟";
        r26 = r31;
        goto L192
    L562:
        if ((C0031.f31 / (C0048.f48 * (-9255))) != 0) goto L563;
        r70 = C0055.m220("ۢۨۧ");
        goto L3
    L563:
        r437 = "ۧۦ";
        goto L228
    L566:
        if ((C0073.f73 | (C0061.f61 * 3797)) > 0) goto L568;
        C0036.f36 = 89;
        r70 = C0072.m288("ۦۢ۟");
        goto L3
    L568:
        r434 = "ۡ۠ۨ";
        goto L192
    L569:
        r51 = false;
        if (C0056.m224() <= 0) goto L571;
        r70 = (C0017.f17 | C0072.f72) + 1750787;
        goto L3
    L571:
        C0060.f60 = 90;
        goto L572
    L575:
        if ((r5 instanceof LinkedList) == false) goto L7;
        if ((C0044.f44 ^ (C0060.f60 + 5334)) <= 0) goto L578;
        r70 = (C0032.f32 | C0034.f34) + 1753032;
        goto L3
    L578:
        C0046.m185();
        r70 = C0046.m186("ۧۦۧ");
        goto L3
    L581:
        if ((r8 instanceof JSONObject) == false) goto L237;
        JSONObject r04 = (JSONObject) r8;     // Catch: Throwable -> L92
        if ((C0037.f37 ^ (C0067.f67 % (-2721))) > 0) goto L586;
        C0020.m82();
        r38 = r04;
        r70 = C0036.m144("ۣۨۨ");
        goto L3
    L586:
        r1215 = "ۣۥۧ";
        r38 = r04;
    L592:
        r70 = C0018.m73("ۡۢۤ");
        goto L3
    L594:
        if (r63.length() <= 0) goto L270;
        r162 = true;
        if (C0062.f62 < 0) goto L598;
        C0037.f37 = 68;
        r70 = C0037.m149("ۧۤۢ");
        r27 = true;
        goto L3
    L598:
        r124 = "ۤ۟ۢ";
        goto L134
    L600:
        if (C0053.m214() > 0) goto L602;
        r439 = "ۣۡ۠";
        r36 = r27;
        goto L312
    L602:
        r435 = "۟ۡ۟";
        r1212 = r27;
        goto L215
    L610:
        if ((r9 instanceof Integer) == false) goto L213;
        Integer r05 = (Integer) r9;     // Catch: Throwable -> L92
        if ((C0050.f50 % (C0010.f10 ^ (-5326))) > 0) goto L615;
        C0058.m232();
        r50 = r05;
        r70 = C0031.m127("ۥۨۡ");
        goto L3
    L615:
        r1221 = "ۡۦۣ";
        r1610 = r05;
    L616:
        r70 = (C0024.f24 | C0034.f34) ^ (-1746174);
        goto L3
    L617:
        r49.append(r28);     // Catch: Throwable -> L626
        if (C0059.m236() <= 0) goto L620;
        r70 = (C0040.f40 * C0059.f59) + 2115285;
        goto L3
    L620:
        C0052.m210();
        r70 = C0033.m132("ۤۦۣ");
        goto L3
    L622:
        r52 = null;
        if (C0060.f60 > 0) goto L625;
        r70 = C0039.m159("۠ۧۦ");
        goto L3
    L625:
        r1214 = "ۡ۟ۢ";
        r419 = r15;
        r167 = r17;
    L631:
        if (C0016.f16 <= 0) goto L632;
        r70 = C0034.m138("۠۠۠");
        goto L3
    L632:
        C0053.m214();
        r448 = "ۡۦۨ";
        goto L465
    L634:
        if (r21 == false) goto L523;
        r70 = (C0062.f62 % C0062.f62) + 1755528;
        goto L3
    L637:
        if ((C0059.f59 / (C0049.f49 % 1887)) < 0) goto L639;
        C0025.f25 = 59;
        r450 = "۠ۨۨ";
        goto L554
    L639:
        r422 = "ۢۡۡ";
        goto L55
    L640:
        r11 = XposedHelpers.getObjectField(r43, pb0.z);     // Catch: Throwable -> L92
        r70 = (C0040.f40 % C0058.f58) ^ 1747615;
        goto L3
    L642:
        ip.m(u40.a("wP2t3iWpA0TA57WSZ69CSc/7tZJxpUJEwebs3HCmDgra8bHXJaENXsLhr5xMpBY=\n", "rojBsgXKYio=\n"), r10);     // Catch: Throwable -> L587
        r1210 = ((Integer) r10).intValue();     // Catch: Throwable -> L587
        if ((C0026.f26 + (C0017.f17 | 1258)) > 0) goto L647;
        C0020.f20 = 10;
        boolean r451 = r53;
    L646:
        r28 = r1210;
        r70 = C0013.m53("ۣۧ۟");
        r53 = r451;
        goto L3
    L647:
        r431 = "ۦۨ۟";
        goto L144
    L648:
        r433 = "۠ۡ۠";
        goto L162
    L649:
        gn.a.getClass();     // Catch: Throwable -> L626
        r129 = gn.i;     // Catch: Throwable -> L626
        if ((C0013.f13 + (C0033.f33 | 2677)) <= 0) goto L652;
        r54 = r129;
        r70 = (C0066.f66 + C0051.f51) ^ 1748477;
        goto L3
    L652:
        C0058.f58 = 61;
        r427 = "۟ۢۤ";
        goto L104
    L655:
        if ((r11 instanceof String) == false) goto L256;
        String r1223 = "ۣۨۡ";
        String r1611 = (String) r11;     // Catch: Throwable -> L92
    L658:
        r56 = r1611;
        r70 = C0001.m5(r1223);
    L659:
        r420 = "ۣ۠ۢ";
        r126 = r26;
        goto L47
    L660:
        r70 = (C0057.f57 * C0049.f49) + 1771687;
        goto L3
    L661:
        r55.b = r35;     // Catch: Throwable -> L626
        if ((C0047.f47 % (C0048.f48 ^ (-7084))) >= 0) goto L664;
        r70 = C0010.m43("ۣ۟ۨ");
        goto L3
    L664:
        r70 = C0033.m132("ۤۡ۠");
    L667:
        if ((C0014.f14 % (C0058.f58 - 7453)) >= 0) goto L668;
        r70 = (C0009.f9 - C0015.f15) ^ 1750595;
        goto L3
    L668:
        C0006.m24();
        r70 = C0002.m8("ۡۦ");
        goto L3
    L670:
        ip.m(u40.a("fESSfZTqTLt8Xoox1uwNtnNCijHA5g27fV/Tf8HlQfVmSI50lOJCoX5YkD/n/V+8fFY=\n", "EjH+EbSJLdU=\n"), r6);     // Catch: Throwable -> L603
        if ((C0026.f26 / (C0071.f71 % 6008)) >= 0) goto L673;
        r70 = C0009.m38("ۡۡۧ");
        goto L3
    L673:
        C0017.f17 = 57;
        r70 = C0069.m277("ۥۢۨ");
        goto L3
    L675:
        r31 = 0;
        if ((C0052.f52 ^ (C0055.f55 + 193)) >= 0) goto L677;
        r70 = C0059.m239("ۢۡۧ");
        goto L3
    L677:
        C0026.m106();
        r70 = C0034.m138("ۡۨۥ");
        goto L3
    L679:
        String r452 = r37.optString(pb0.V0);     // Catch: Throwable -> L92
        if (C0072.m289() <= 0) goto L682;
        r63 = r452;
        r70 = C0053.m213("ۣ۟ۧ");
        goto L3
    L682:
        C0005.f5 = 38;
        r63 = r452;
        r70 = C0010.m43("ۡۦۧ");
        goto L3
    L685:
        if ((C0009.f9 % (C0051.f51 - 6334)) >= 0) goto L686;
        r70 = (C0059.f59 ^ C0011.f11) + 1750213;
        goto L3
    L686:
        C0071.f71 = 18;
        r70 = C0064.m258("ۨۧۧ");
        goto L3
    L688:
        r451 = true;
        if ((C0023.f23 | (C0012.f12 / (-5282))) > 0) goto L691;
        r70 = C0054.m219("ۣۨ۟");
        r53 = true;
        goto L3
    L691:
        r1210 = r28;
        goto L646
    L692:
        r72 = false;
        r70 = (C0018.f18 % C0037.f37) ^ 1747162;
        goto L3
    L693:
        r1219 = hs.c(r42);     // Catch: Throwable -> L92
        r444 = r45;
        goto L421
    L695:
        r60.append(" 条下发数据，执行点赞判定...");     // Catch: Throwable -> L626
        String r453 = r60.toString();     // Catch: Throwable -> L626
        if ((C0060.f60 | (C0001.f1 ^ (-5446))) <= 0) goto L698;
        r62 = r453;
        r70 = (C0067.f67 % C0023.f23) ^ (-1753472);
        goto L3
    L698:
        C0050.m202();
        r62 = r453;
        r70 = C0068.m272("ۧۦۡ");
    L701:
        if (C0063.f63 <= 0) goto L702;
        r70 = (C0024.f24 / C0046.f46) + 1748767;
        goto L3
    L702:
        C0030.f30 = 72;
        r425 = "ۦ۠ۤ";
        r127 = r55;
        goto L73
    L704:
        r19 = r56;
        r70 = (C0009.f9 / C0009.f9) ^ 1751648;
        goto L3
    L706:
        if ((C0046.f46 ^ (C0030.f30 * 4098)) <= 0) goto L707;
        r70 = (C0030.f30 * C0020.f20) ^ (-1716446);
        goto L3
    L707:
        r1223 = "۠۟ۧ";
        r1611 = r56;
        goto L658
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam r14) {
        switch(this.a) {
            case 1: goto L129;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.beforeHookedMethod(r14);
        return;
    L6:
        ip.o(u40.a("zw==\n", "v/tTD73Frj8=\n"), r14);
        Object r0 = r14.args[0];
        if ((r0 instanceof String) == false) goto L89;
        String r5 = (String) r0;
    L9:
        if (r5 != null) goto L11;
        return;
    L11:
        if (r5.equals(pb0.C0) == true) goto L15;
        if (r5.equals(pb0.D0) == true) goto L15;
        return;
    L15:
        if (z30.q("WMFA2h+Lk9xs11f2IYGC2VbQXA==\n", "M6Q5hX7l57U=\n", gn.a) == false) goto L253;
        Object[] r2 = r14.args;
        Object r02 = r2[1];
        if ((r02 instanceof ContentValues) == false) goto L90;
        ContentValues r4 = (ContentValues) r02;
    L19:
        if (r4 != null) goto L21;
        return;
    L21:
        if (r2.length <= 2) goto L91;
        Object r03 = r2[2];
        if ((r03 instanceof String) == false) goto L91;
        String r1 = (String) r03;
    L26:
        if (r2.length <= 3) goto L92;
        Object r04 = r2[3];
        if ((r04 instanceof String[]) == false) goto L92;
        String[] r22 = (String[]) r04;
    L30:
        boolean r05 = r5.equals(pb0.C0);
        ClassLoader r7 = this.b;
        if (r05 == false) goto L121;
        Integer r06 = r4.getAsInteger(u40.a("MNS2mg==\n", "RK3G/wCF85Y=\n"));
        if (r06 == null) goto L93;
        int r07 = r06.intValue();
    L35:
        Integer r3 = r4.getAsInteger(u40.a("CuAlRsjmI04J6g==\n", "eY9QNKuDdzc=\n"));
        Integer r8 = r4.getAsInteger(u40.a("j5vMN+gzwa+E\n", "4/SvVoR1rc4=\n"));
        if (bb.f0(new Integer[]{1, 2, 3, 15}).contains(Integer.valueOf(r07)) == false) goto L94;
        if (r3 == null) goto L94;
        int r08 = r3.intValue();
        if ((r08 & (r08 ^ (-3))) != 0) goto L94;
        boolean r09 = true;
    L41:
        if (r8 != null) goto L43;
    L45:
        if (r09 == false) goto L58;
        r4.remove(u40.a("l25aNJh1B0SUZA==\n", "5AEvRvsQUz0=\n"));
        r4.remove(u40.a("KKGWvw==\n", "XNjm2q76NA0=\n"));
        r4.put(u40.a("m3zyiJUDfzKQ\n", "9xOR6flFE1M=\n"), 99);
        byte[] r32 = r4.getAsByteArray(u40.a("4sdVP/GHYg==\n", "gag7S5TpFgw=\n"));
        if (r32 != null) goto L211;
        Object r82 = XposedHelpers.callMethod(r14.thisObject, u40.a("Dqu0RCJmV7w=\n", "fMrDFVcDJcU=\n"), new Object[]{"SELECT content FROM " + r5 + " WHERE " + r1, r22});
        if (r82 == null) goto L211;
        Object r010 = XposedHelpers.callMethod(r82, u40.a("y8rMDHfi5UnU1s4=\n", "pqW6aSONoyA=\n"), new Object[0]);     // Catch: Throwable -> L96
        ip.m(u40.a("Wi+dxi1ay05aNYWKb1yKQ1UphYp5VopOWzTcxHhVxgBAI4HPLVLFVFgzn4RPVsVMUTuf\n", "NFrxqg05qiA=\n"), r010);     // Catch: Throwable -> L96
        if (((Boolean) r010).booleanValue() == false) goto L210;
        Object r011 = XposedHelpers.callMethod(r82, u40.a("bHiYN7K0ug==\n", "Cx3sdd7b2J8=\n"), new Object[]{0});     // Catch: Throwable -> L96
        if ((r011 instanceof byte[]) == false) goto L95;
        byte[] r012 = (byte[]) r011;     // Catch: Throwable -> L96
    L231:
        XposedHelpers.callMethod(r82, u40.a("fOdi49M=\n", "H4sNkLaoaPk=\n"), new Object[0]);     // Catch: Throwable -> L207
    L56:
        if (r012 == null) goto L58;
        r4.put(u40.a("1CTppqm3Jw==\n", "t0uH0szZU74=\n"), vh.k(r012, r7));
        goto L58
    L95:
        r012 = null;
        goto L231
    L210:
        r012 = r32;
    L96:
        th = move-exception;
        XposedHelpers.callMethod(r82, u40.a("LU2wCwo=\n", "TiHfeG+ny74=\n"), new Object[0]);     // Catch: Throwable -> L205
    L98:
        throw th;
    L211:
        r012 = r32;
    L58:
        Object r013 = r14.thisObject;
        ip.n(u40.a("eK1akuB2AJdvsQ==\n", "DMUz4a8UavI=\n"), r013);
        byte[] r33 = r4.getAsByteArray(u40.a("BPHdU7eauA==\n", "ZYWpIfXv3hA=\n"));
        if (r33 == null) goto L255;
        Object r12 = XposedHelpers.callMethod(r013, u40.a("AOvSeZGItb8=\n", "coqlKOTtx8Y=\n"), new Object[]{"SELECT attrBuf FROM " + r5 + " WHERE " + r1, r22});     // Catch: Throwable -> L103
        if (r12 != null) goto L215;
        byte[] r014 = null;
    L68:
        if (r014 == null) goto L256;
        Class r13 = XposedHelpers.findClass(pb0.j1, r7);     // Catch: Throwable -> L103
        Object r23 = r13.newInstance();     // Catch: Throwable -> L103
        XposedHelpers.callMethod(r23, pb0.h1, new Object[]{r014});     // Catch: Throwable -> L103
        Object r52 = r13.newInstance();     // Catch: Throwable -> L103
        XposedHelpers.callMethod(r52, pb0.h1, new Object[]{r33});     // Catch: Throwable -> L103
        Object r015 = XposedHelpers.getObjectField(r23, pb0.k1);     // Catch: Throwable -> L103
        if ((r015 instanceof LinkedList) == false) goto L106;
        LinkedList r24 = (LinkedList) r015;     // Catch: Throwable -> L103
    L72:
        if (r24 == null) goto L257;
        Object r016 = XposedHelpers.getObjectField(r52, pb0.k1);     // Catch: Throwable -> L103
        if ((r016 instanceof LinkedList) == false) goto L107;
        LinkedList r15 = (LinkedList) r016;     // Catch: Throwable -> L103
    L76:
        if (r15 != null) goto L78;
        return;
    L78:
        if (r24.size() <= r15.size()) goto L259;
        Iterator r25 = r24.iterator();     // Catch: Throwable -> L103
        ip.n(u40.a("rI7G45G5xR/t1I2/2Q==\n", "xfqjkfDNqm0=\n"), r25);     // Catch: Throwable -> L103
    L81:
        if (r25.hasNext() == false) goto L118;
        Object r34 = r25.next();     // Catch: Throwable -> L103
        ip.n(u40.a("wxmFbt5MkryE\n", "rXz9GvZivJI=\n"), r34);     // Catch: Throwable -> L103
        int r017 = XposedHelpers.getIntField(r34, pb0.m1);     // Catch: Throwable -> L103
        Iterator r6 = r15.iterator();     // Catch: Throwable -> L103
        ip.n(u40.a("k0tleDXmoVjSES4kfQ==\n", "+j8AClSSzio=\n"), r6);     // Catch: Throwable -> L103
    L84:
        if (r6.hasNext() == false) goto L108;
        Object r72 = r6.next();     // Catch: Throwable -> L103
        ip.n(u40.a("Y8e9ikmYq6Mk\n", "DaLF/mG2hY0=\n"), r72);     // Catch: Throwable -> L103
        if (r017 != XposedHelpers.getIntField(r72, pb0.m1)) goto L84;
        if (r017 == 0) goto L84;
    L108:
        Object r018 = XposedHelpers.getObjectField(r34, pb0.l1);     // Catch: Throwable -> L103
        if ((r018 instanceof String) == false) goto L117;
        String r019 = (String) r018;     // Catch: Throwable -> L103
    L111:
        if (r019 != null) goto L114;
        r019 = "";
    L114:
        if (b50.N(r019, pb0.e1, false) == true) goto L116;
        XposedHelpers.setObjectField(r34, pb0.l1, pb0.e1 + r019);     // Catch: Throwable -> L103
    L116:
        r15.add(r34);     // Catch: Throwable -> L103
        goto L81
    L117:
        r019 = null;
        goto L111
    L118:
        Object r020 = XposedHelpers.callMethod(r52, pb0.i1, new Object[0]);     // Catch: Throwable -> L103
        ip.m(u40.a("2/rZIww+/d/b4MFvTji80tT8wW9YMrzf2uGYIVkx8JHB9sUqDDbzxdnm22FuJOjU9P3HLlU=\n", "tY+1TyxdnLE=\n"), r020);     // Catch: Throwable -> L103
        r4.put(u40.a("3Fm6JO5lsg==\n", "vS3OVqwQ1Ps=\n"), (byte[]) r020);     // Catch: Throwable -> L103
        return;
    L259:
        return;
    L107:
        r15 = null;
        goto L76
    L257:
        return;
    L106:
        r24 = null;
        goto L72
    L256:
        return;
    L215:
        Object r021 = XposedHelpers.callMethod(r12, u40.a("xD42qsrJZkXbIjQ=\n", "qVFAz56mICw=\n"), new Object[0]);     // Catch: Throwable -> L100
        ip.m(u40.a("KZpva0VXCV8pgHcnB1FIUiacdycRW0hfKIEuaRBYBBEzlnNiRV8HRSuGbSknWwddIo5t\n", "R+8DB2U0aDE=\n"), r021);     // Catch: Throwable -> L100
        if (((Boolean) r021).booleanValue() == false) goto L99;
        Object r022 = XposedHelpers.callMethod(r12, u40.a("lkWnBUvzqA==\n", "8SDTRyecymM=\n"), new Object[]{0});     // Catch: Throwable -> L100
        if ((r022 instanceof byte[]) == false) goto L99;
        r014 = (byte[]) r022;     // Catch: Throwable -> L100
    L225:
        XposedHelpers.callMethod(r12, u40.a("LEAGuxM=\n", "TyxpyHbeSvI=\n"), new Object[0]);     // Catch: Throwable -> L203
    L99:
        r014 = null;
    L100:
        th = move-exception;
        XposedHelpers.callMethod(r12, u40.a("Sm9VDMo=\n", "KQM6f683Uvs=\n"), new Object[0]);     // Catch: Throwable -> L201
    L102:
        throw th;     // Catch: Throwable -> L103
    L104:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("Lt/r/CusLKIU1/79KqUo\n", "fbGYtUXKQ+Y=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        return;
    L255:
        return;
    L43:
        if (r8.intValue() != 4) goto L45;
        r09 = true;
    L94:
        r09 = false;
        goto L41
    L93:
        r07 = 0;
        goto L35
    L121:
        if (r5.equals(pb0.D0) == false) goto L261;
        Integer r023 = r4.getAsInteger(u40.a("GsaEsC4oVAgVyI4=\n", "eanp3UtGIG4=\n"));
        if (r023 != null) goto L125;
        return;
    L125:
        if (r023.intValue() != 1) goto L263;
        r4.put(u40.a("pjZGMj09crCpOEw=\n", "xVkrX1hTBtY=\n"), 0);
        byte[] r024 = r4.getAsByteArray(u40.a("IO+/zmSjTF4t2Ljp\n", "Q5rNjwfXJTE=\n"));
        if (r024 == null) goto L264;
        r4.put(u40.a("eHNexxlqzsV1RFng\n", "GwYshnoep6o=\n"), vh.e(r024, r7));
        return;
    L264:
        return;
    L263:
        return;
    L261:
        return;
    L92:
        r22 = null;
    L91:
        r1 = null;
        goto L26
    L90:
        r4 = null;
        goto L19
    L253:
        return;
    L89:
        r5 = null;
        goto L9
    L129:
        ip.o(u40.a("7Q==\n", "nYJhS8SV1P0=\n"), r14);
        Object r025 = r14.args[0];
        if ((r025 instanceof String) == false) goto L161;
        String r26 = (String) r025;
    L132:
        if (r26 != null) goto L134;
        return;
    L134:
        if (r26.equals(pb0.C0) == true) goto L138;
        if (r26.equals(pb0.D0) == true) goto L138;
        return;
    L138:
        if (z30.q("9C/uQ1Z5KiPAOflvaHM7Jvo+8g==\n", "n0qXHDcXXko=\n", gn.a) == false) goto L268;
        Object r53 = r14.thisObject;
        Object[] r62 = r14.args;
        Object r026 = r62[1];
        if ((r026 instanceof String) == false) goto L162;
        String r027 = (String) r026;
    L142:
        if (r027 != null) goto L209;
        String r16 = "";
    L144:
        Object r028 = r62[2];
        if ((r028 instanceof String[]) == false) goto L163;
        String[] r029 = (String[]) r028;
    L147:
        if (r029 == null) goto L269;
        boolean r63 = r26.equals(pb0.C0);
        ClassLoader r73 = this.b;
        if (r63 == false) goto L175;
        Object r17 = XposedHelpers.callMethod(r53, u40.a("gnnAr1Ps/hg=\n", "8Bi3/iaJjGE=\n"), new Object[]{"SELECT rowid, content FROM " + r26 + " WHERE " + r16, r029});
        if (r17 == null) goto L160;
        Object r030 = XposedHelpers.callMethod(r17, u40.a("5qb4Yu4krD35uvo=\n", "i8mOB7pL6lQ=\n"), new Object[0]);     // Catch: Throwable -> L165
        ip.m(u40.a("c2AFH7H8gQhzeh1T8/rABXxmHVPl8MAIcntEHeTzjEZpbBkWsfSPEnF8B13T8I8KeHQH\n", "HRVpc5Gf4GY=\n"), r030);     // Catch: Throwable -> L165
        if (((Boolean) r030).booleanValue() == false) goto L159;
    L154:
        Object r031 = XposedHelpers.callMethod(r17, u40.a("ONFxd1RJiQ==\n", "X7QFOzsn7gM=\n"), new Object[]{0});     // Catch: Throwable -> L165
        ip.m(u40.a("zY5tgUk4PEjNlHXNCz59RcKIdc0dNH1IzJUsgxw3MQbXgnGISTAyUs+Sb8MlNDNB\n", "o/sB7WlbXSY=\n"), r031);     // Catch: Throwable -> L165
        long r83 = ((Long) r031).longValue();     // Catch: Throwable -> L165
        Object r032 = XposedHelpers.callMethod(r17, u40.a("N+JiDCGq5A==\n", "UIcWTk3FhrI=\n"), new Object[]{1});     // Catch: Throwable -> L165
        if ((r032 instanceof byte[]) == false) goto L164;
        byte[] r033 = (byte[]) r032;     // Catch: Throwable -> L165
    L157:
        ContentValues r64 = new ContentValues();     // Catch: Throwable -> L165
        r64.put(u40.a("whkEYwdRuA==\n", "oXZqF2I/zPk=\n"), vh.k(r033, r73));     // Catch: Throwable -> L165
        r64.put(u40.a("H+0AcwxWZn8U\n", "c4JjEmAQCh4=\n"), 99);     // Catch: Throwable -> L165
        XposedHelpers.callMethod(r53, u40.a("ctsHIA1I\n", "B6tjQXktqDE=\n"), new Object[]{r26, r64, u40.a("B8PCe96JyQ==\n", "day1Erq09iw=\n"), new String[]{String.valueOf(r83)}});     // Catch: Throwable -> L165
        Object r034 = XposedHelpers.callMethod(r17, u40.a("jpKaD7gdktqbiQ==\n", "4/3sauxy3L8=\n"), new Object[0]);     // Catch: Throwable -> L165
        ip.m(u40.a("oYB89ShAKtGhmmS5akZr3K6GZLl8TGvRoJs9931PJ5+7jGD8KEgky6OcfrdKTCTTqpR+\n", "z/UQmQgjS78=\n"), r034);     // Catch: Throwable -> L165
        if (((Boolean) r034).booleanValue() == true) goto L154;
    L164:
        r033 = null;
        goto L157
    L159:
        XposedHelpers.callMethod(r17, u40.a("ju+UZ8c=\n", "7YP7FKLC508=\n"), new Object[0]);     // Catch: Throwable -> L169
    L213:
        ip.o(u40.a("Nwje\n", "Q2m5jaPP2Zc=\n"), u40.a("M7W/+EKPefkFkqLaSKtz4gs=\n", "YNvMvCfjHI0=\n"));     // Catch: Throwable -> L171
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");     // Catch: Throwable -> L171
        XposedHelpers.callMethod(r17, u40.a("9C1L4gw=\n", "l0EkkWkia/s=\n"), new Object[0]);     // Catch: Throwable -> L169
    L171:
        th = move-exception;
        XposedHelpers.callMethod(r17, u40.a("NqLllNQ=\n", "Vc6K57GC4FE=\n"), new Object[0]);     // Catch: Throwable -> L199
    L173:
        throw th;
    L160:
        r14.setResult(1);
        return;
    L175:
        if (r26.equals(pb0.D0) == false) goto L271;
        Object r18 = XposedHelpers.callMethod(r53, u40.a("qtu0Sty0CTI=\n", "2LrDG6nRe0s=\n"), new Object[]{"SELECT rowid, curActionBuf FROM " + r26 + " WHERE " + r16, r029});
        if (r18 != null) goto L221;
    L186:
        r14.setResult(1);
        return;
    L221:
        Object r035 = XposedHelpers.callMethod(r18, u40.a("REj0Bu6Oca5bVPY=\n", "KSeCY7rhN8c=\n"), new Object[0]);     // Catch: Throwable -> L188
        ip.m(u40.a("/goWt7ldP6L+EA77+1t+r/EMDvvtUX6i/xFXtexSMuzkBgq+uVUxuPwWFPXbUTGg9R4U\n", "kH9625k+Xsw=\n"), r035);     // Catch: Throwable -> L188
        if (((Boolean) r035).booleanValue() == false) goto L185;
    L180:
        Object r036 = XposedHelpers.callMethod(r18, u40.a("Hp+XV8DY+w==\n", "efrjG6+2nDo=\n"), new Object[]{0});     // Catch: Throwable -> L188
        ip.m(u40.a("6qra9yz68XHqsMK7bvywfOWswrt49rBx67Gb9Xn1/D/wpsb+LPL/a+i22LVA9v54\n", "hN+2mwyZkB8=\n"), r036);     // Catch: Throwable -> L188
        long r84 = ((Long) r036).longValue();     // Catch: Throwable -> L188
        Object r037 = XposedHelpers.callMethod(r18, u40.a("cP0gDfgBYg==\n", "F5hUT5RuAKo=\n"), new Object[]{1});     // Catch: Throwable -> L188
        if ((r037 instanceof byte[]) == false) goto L187;
        byte[] r038 = (byte[]) r037;     // Catch: Throwable -> L188
    L183:
        ContentValues r65 = new ContentValues();     // Catch: Throwable -> L188
        r65.put(u40.a("QDip7IRa0ohND67L\n", "I03brecuu+c=\n"), vh.e(r038, r73));     // Catch: Throwable -> L188
        r65.put(u40.a("a0TSixLuNttkStg=\n", "CCu/5neAQr0=\n"), 0);     // Catch: Throwable -> L188
        XposedHelpers.callMethod(r53, u40.a("xgaX8xSJ\n", "s3bzkmDsy7c=\n"), new Object[]{r26, r65, u40.a("oG7x7PTtnQ==\n", "0gGGhZDQolE=\n"), new String[]{String.valueOf(r84)}});     // Catch: Throwable -> L188
        Object r039 = XposedHelpers.callMethod(r18, u40.a("5o8eHzPH4dvzlA==\n", "i+Boemeor74=\n"), new Object[0]);     // Catch: Throwable -> L188
        ip.m(u40.a("MSBmzRnuGiExOn6BW+hbLD4mfoFN4lshMDsnz0zhF28rLHrEGeYUOzM8ZI974hQjOjRk\n", "X1UKoTmNe08=\n"), r039);     // Catch: Throwable -> L188
        if (((Boolean) r039).booleanValue() == true) goto L180;
    L187:
        r038 = null;
        goto L183
    L185:
        XposedHelpers.callMethod(r18, u40.a("5kmjsFc=\n", "hSXMwzJkxhc=\n"), new Object[0]);     // Catch: Throwable -> L192
    L234:
        ip.o(u40.a("Nwje\n", "Q2m5jaPP2Zc=\n"), u40.a("Dpp+B3GF+ug4t2IueYzx6BWbYig=\n", "XfQNQxTpn5w=\n"));     // Catch: Throwable -> L194
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");     // Catch: Throwable -> L194
        XposedHelpers.callMethod(r18, u40.a("UUh751c=\n", "MiQUlDJiWxE=\n"), new Object[0]);     // Catch: Throwable -> L192
    L194:
        th = move-exception;
        XposedHelpers.callMethod(r18, u40.a("ehoov3c=\n", "GXZHzBJqRl8=\n"), new Object[0]);     // Catch: Throwable -> L197
    L196:
        throw th;
    L271:
        return;
    L269:
        return;
    L163:
        r029 = null;
        goto L147
    L209:
        r16 = r027;
        goto L144
    L162:
        r027 = null;
        goto L142
    L268:
        return;
    L161:
        r26 = null;
        goto L132
    }
}
