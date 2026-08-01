package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0014;
import androidx.appcompat.widget.C0015;
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
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C0068;
import java.util.ArrayList;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class ud extends XC_MethodHook {
    public final String a;
    public final int b;

    public ud(String r4, int r5) {
        this.a = r4;
        this.b = r5;
        int r2 = C0061.m246("ۤ۟ۥ");
        Double r1 = null;
    L3:
        switch(r2) {
            case 56544: goto L5;
            case 1746696: goto L22;
            case 1747712: goto L6;
            case 1747774: goto L25;
            case 1751498: goto L11;
            case 1754627: goto L18;
            default: goto L3;
        };
    L5:
        Double r0 = Double.valueOf(C0028.m115("EklV5IMjL4TkEQ5NRgtYB1"));
        r2 = 1747337 + (C0022.f22 ^ C0037.f37);
        r1 = r0;
        goto L3
    L6:
        System.out.println(r1);
        if (C0033.m135() >= 0) goto L8;
        r2 = (C0030.f30 / C0027.f27) + 1747774;
        goto L3
    L8:
        C0043.m172();
        r2 = C0058.m234("ۤ۟ۥ");
        goto L3
    L11:
        if (C0046.m185() > 0) goto L22;
        if (C0034.m137() <= 0) goto L14;
        String r02 = "ۧۧ";
    L16:
        r2 = C0044.m176(r02);
        goto L3
    L14:
        C0045.f45 = 50;
        r2 = C0053.m213("۟۟ۨ");
        goto L3
    L18:
        if (C0029.f29 < 0) goto L20;
        C0037.m150();
        r02 = "ۦۡۨ";
        goto L16
    L20:
        r02 = "ۤ۟ۥ";
    L22:
        if ((C0020.f20 - (C0035.f35 / (-2679))) >= 0) goto L23;
        r2 = C0022.m90("ۣ۠ۡ");
        goto L3
    L23:
        C0020.f20 = 29;
        r2 = C0072.m288("ۣۡۤ");
        goto L3
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam r69) {
        Object r28 = null;
        ListView r7 = null;
        ListView r37 = null;
        ViewGroup r54 = null;
        ViewGroup r63 = null;
        Context r29 = null;
        int r34 = 0;
        ListAdapter r6 = null;
        Class<?> r40 = null;
        String r38 = null;
        td r39 = null;
        Double r16 = null;
        int r65 = 0;
        ArrayList r22 = null;
        boolean r31 = false;
        boolean r32 = false;
        ArrayList r41 = null;
        int r42 = 0;
        int r43 = 0;
        int r44 = 0;
        int r45 = 0;
        FrameLayout r17 = null;
        FrameLayout r18 = null;
        GradientDrawable r19 = null;
        String r56 = null;
        int r55 = 0;
        String r51 = null;
        int r30 = 0;
        String r53 = null;
        int r66 = 0;
        String r52 = null;
        int[] r36 = null;
        int[] r50 = null;
        GradientDrawable r46 = null;
        int r49 = 0;
        String r47 = null;
        int r64 = 0;
        String r62 = null;
        String r48 = null;
        float r27 = 0.0f;
        float r26 = 0.0f;
        LinearLayout r61 = null;
        int r23 = 0;
        TextView r35 = null;
        int r11 = 0;
        int r15 = 0;
        Context r8 = null;
        int r13 = 0;
        Context r9 = null;
        int r14 = 0;
        int r10 = 0;
        int r12 = 0;
        ArrayList r21 = null;
        f00 r33 = null;
        int r67 = C0037.m149("ۧ۟ۦ");
        ArrayList r57 = null;
        GradientDrawable.Orientation r58 = null;
        View r59 = null;
        View r60 = null;
    L3:
        switch(r67) {
            case 56353: goto L6;
            case 56357: goto L398;
            case 56384: goto L282;
            case 56385: goto L229;
            case 56415: goto L175;
            case 56418: goto L314;
            case 56448: goto L273;
            case 56449: goto L294;
            case 56451: goto L368;
            case 56452: goto L61;
            case 56479: goto L399;
            case 56506: goto L9;
            case 56509: goto L137;
            case 56536: goto L52;
            case 56569: goto L259;
            case 56576: goto L202;
            case 1746750: goto L131;
            case 1746755: goto L342;
            case 1746780: goto L236;
            case 1746814: goto L251;
            case 1746843: goto L352;
            case 1746848: goto L230;
            case 1746942: goto L242;
            case 1746968: goto L380;
            case 1746972: goto L122;
            case 1747655: goto L83;
            case 1747718: goto L46;
            case 1747743: goto L346;
            case 1747748: goto L325;
            case 1747777: goto L280;
            case 1747779: goto L126;
            case 1747807: goto L57;
            case 1747838: goto L170;
            case 1747869: goto L169;
            case 1747873: goto L81;
            case 1747899: goto L184;
            case 1747900: goto L359;
            case 1748611: goto L139;
            case 1748648: goto L398;
            case 1748671: goto L349;
            case 1748674: goto L194;
            case 1748678: goto L193;
            case 1748711: goto L278;
            case 1748765: goto L254;
            case 1748767: goto L148;
            case 1748801: goto L206;
            case 1748802: goto L161;
            case 1748834: goto L286;
            case 1748835: goto L221;
            case 1748865: goto L225;
            case 1748893: goto L202;
            case 1749573: goto L116;
            case 1749632: goto L143;
            case 1749637: goto L286;
            case 1749663: goto L329;
            case 1749666: goto L338;
            case 1749667: goto L96;
            case 1749789: goto L22;
            case 1749793: goto L286;
            case 1749796: goto L88;
            case 1749854: goto L247;
            case 1749856: goto L351;
            case 1749857: goto L378;
            case 1750535: goto L384;
            case 1750538: goto L110;
            case 1750567: goto L15;
            case 1750597: goto L28;
            case 1750598: goto L71;
            case 1750720: goto L57;
            case 1750810: goto L367;
            case 1751558: goto L229;
            case 1751562: goto L346;
            case 1751586: goto L286;
            case 1751588: goto L350;
            case 1751617: goto L362;
            case 1751620: goto L20;
            case 1751647: goto L138;
            case 1751681: goto L39;
            case 1751686: goto L215;
            case 1751710: goto L362;
            case 1751712: goto L175;
            case 1751773: goto L354;
            case 1752456: goto L92;
            case 1752491: goto L334;
            case 1752519: goto L309;
            case 1752523: goto L126;
            case 1752547: goto L373;
            case 1752583: goto L315;
            case 1752610: goto L332;
            case 1752672: goto L232;
            case 1752704: goto L178;
            case 1752710: goto L153;
            case 1752741: goto L290;
            case 1753451: goto L230;
            case 1753507: goto L262;
            case 1753514: goto L351;
            case 1753572: goto L323;
            case 1753578: goto L158;
            case 1753603: goto L263;
            case 1753632: goto L319;
            case 1753637: goto L360;
            case 1753667: goto L264;
            case 1753671: goto L143;
            case 1754376: goto L101;
            case 1754378: goto L269;
            case 1754382: goto L104;
            case 1754383: goto L9;
            case 1754406: goto L299;
            case 1754415: goto L209;
            case 1754444: goto L305;
            case 1754501: goto L329;
            case 1754530: goto L41;
            case 1754539: goto L40;
            case 1754600: goto L65;
            case 1754632: goto L379;
            case 1755339: goto L238;
            case 1755370: goto L11;
            case 1755374: goto L32;
            case 1755399: goto L395;
            case 1755430: goto L72;
            case 1755493: goto L168;
            case 1755498: goto L117;
            case 1755555: goto L34;
            case 1755557: goto L273;
            case 1755592: goto L247;
            case 1755616: goto L188;
            default: goto L3;
        };
    L399:
        String r20 = u40.a("WtECzTg0FA==\n", "PbR2m1FRYxg=\n");     // Catch: Throwable -> L389
        td r24 = new td(0, r29);     // Catch: Throwable -> L389
        String r5 = "ۦۦۥ";
    L80:
        r38 = r20;
        r39 = r24;
        r67 = C0013.m53(r5);
    L391:
        if (C0035.m143() <= 0) goto L392;
        r67 = (C0000.f0 + C0002.f2) + 1750408;
        goto L3
    L392:
        C0031.m124();
        r67 = C0004.m16("۠ۥۣ");
        goto L3
    L6:
        if (ff.y < r22.size()) goto L332;
        String r510 = "ۦۥۢ";
    L8:
        r67 = C0066.m264(r510);
        goto L3
    L9:
        r67 = (C0048.f48 - C0073.f73) ^ 1748579;
        goto L3
    L11:
        if (C0008.m33() <= 0) goto L12;
        r67 = (C0034.f34 | C0062.f62) + 1753436;
        goto L3
    L12:
        C0015.f15 = 29;
        r67 = C0039.m159("ۢۡ۟");
        goto L3
    L15:
        if ((C0021.f21 | (C0027.f27 % (-3059))) >= 0) goto L16;
        r9 = r8;
        r67 = (C0035.f35 + C0005.f5) ^ 1756132;
        r10 = r11;
        r12 = r13;
        r14 = r15;
        goto L3
    L16:
        C0060.m240();
        Context r511 = r8;
        r10 = r11;
        r12 = r13;
        r14 = r15;
    L17:
        Object r202 = "ۡۦ";
        Context r242 = r511;
    L18:
        r9 = r242;
        r67 = C0047.m189(r202);
        goto L3
    L20:
        if (r37 != null) goto L158;
    L21:
        r67 = C0021.m86("ۥ۠ۦ");
        goto L3
    L22:
        int r243 = Color.parseColor(r51);
        if ((C0007.f7 - (C0019.f19 ^ 4682)) >= 0) goto L24;
        String r203 = "ۨۡ";
        r55 = r243;
    L26:
        r67 = C0059.m239(r203);
        goto L3
    L24:
        r55 = r243;
        r67 = C0070.m281("ۤۤ");
        goto L3
    L28:
        if ((C0008.f8 - (C0006.f6 * (-2856))) <= 0) goto L29;
        r67 = (C0066.f66 | C0045.f45) + 1748933;
        goto L3
    L29:
        C0071.m284();
        Double r512 = r16;
    L30:
        r16 = r512;
        r67 = C0060.m241("ۤۤ۟");
        goto L3
    L32:
        vd.f = true;
        r67 = C0042.m170("ۣۣ۟");
    L34:
        if (C0044.m178() >= 0) goto L35;
        Object r244 = "ۡ۠ۧ";
        String r25 = r56;
    L38:
        r56 = r25;
        r67 = C0072.m288(r244);
        goto L3
    L35:
        String r204 = "ۦۦۡ";
        FrameLayout r513 = r17;
        int r245 = r10;
        int r252 = r12;
    L36:
        r17 = r513;
        r67 = C0019.m79(r204);
        r10 = r245;
        r12 = r252;
    L39:
        r67 = (C0038.f38 ^ C0034.f34) + 1747084;
        goto L3
    L40:
        r51 = r56;
        r67 = C0020.m80("ۢۦۡ");
        goto L3
    L41:
        r19.setColor(r55);
        r19.setCornerRadius(999.0f);
        int r514 = ff.q(r45);
        if (vd.e == true) goto L43;
    L74:
        if (C0056.f56 >= 0) goto L75;
        r30 = r514;
        r67 = (C0025.f25 * C0002.f2) + 2373589;
        goto L3
    L75:
        C0045.m181();
        String r205 = "ۡۦۡ";
        r30 = r514;
    L76:
        r67 = C0046.m186(r205);
        goto L3
    L43:
        r53 = u40.a("TQj9+s3uS68o\n", "bjvOvIuoDek=\n");
        if ((C0058.f58 % (C0046.f46 | 8462)) <= 0) goto L45;
    L336:
        r30 = r514;
        r67 = C0011.m45("ۢۢ");
        goto L3
    L45:
        r30 = r514;
        r67 = C0026.m105("ۨۦۣ");
        goto L3
    L46:
        ArrayList r515 = vd.a;
        ListAdapter r516 = r37.getAdapter();
        vd.d = r516;
        int r206 = 1;
        if (r516 == null) goto L364;
        if (vd.f == true) goto L364;
        r34 = 1;
        r67 = (C0025.f25 - C0066.f66) + 1757105;
    L364:
        if (C0033.f33 <= 0) goto L365;
        String r517 = "ۤۨۡ";
    L155:
        r34 = r206;
        r67 = C0065.m263(r517);
        goto L3
    L365:
        C0021.f21 = 99;
        r244 = "ۣۢ۟";
        r25 = r56;
        r34 = r206;
        goto L38
    L52:
        if ((C0047.f47 ^ (C0002.f2 / (-5475))) >= 0) goto L53;
        r67 = (C0064.f64 / C0030.f30) + 1754382;
        goto L3
    L53:
        String r207 = "ۣۨۡ";
        Object r518 = r28;
    L54:
        r28 = r518;
        r67 = C0002.m8(r207);
        goto L3
    L57:
        if (C0028.m112() <= 0) goto L58;
        r67 = (C0063.f63 % C0013.f13) ^ 1751564;
        goto L3
    L58:
        String r519 = "ۥۡ";
    L59:
        r67 = C0011.m45(r519);
        goto L3
    L61:
        int r520 = Color.parseColor(r52);
        if ((C0029.f29 ^ (C0051.f51 + 5678)) >= 0) goto L63;
        r66 = r520;
        r67 = (C0005.f5 % C0054.f54) + 1748695;
        goto L3
    L63:
        C0059.f59 = 60;
        r66 = r520;
        r67 = C0028.m114("ۥۢ۠");
        goto L3
    L65:
        r513 = r17;
    L67:
        if (C0050.f50 > 0) goto L70;
        C0049.m199();
        String r208 = "ۦ۠ۧ";
        r17 = r513;
        Context r246 = r29;
    L69:
        r29 = r246;
        r67 = C0050.m203(r208);
        goto L3
    L70:
        r204 = "ۥۧۢ";
        r245 = r10;
        r252 = r12;
        goto L36
    L71:
        r67 = (C0061.f61 - C0020.f20) ^ 1755092;
        r14 = r23;
        goto L3
    L72:
        r514 = r30;
        goto L74
    L81:
        r52 = u40.a("wvkhzrHB34jR\n", "4chg/oHx77g=\n");
        r67 = C0002.m8("ۦۣ");
        goto L3
    L83:
        if ((C0007.f7 - (C0059.f59 % (-2275))) <= 0) goto L84;
        boolean r521 = r31;
    L86:
        r32 = r521;
        r67 = C0025.m102("ۥۣۥ");
        goto L3
    L84:
        C0008.f8 = 82;
        r32 = r31;
        r67 = C0046.m186("ۨ۟ۢ");
    L88:
        if ((C0038.f38 * (C0020.f20 * 6699)) <= 0) goto L89;
        String r522 = "ۤۧ";
    L91:
        r67 = C0039.m159(r522);
        goto L3
    L89:
        C0057.m230();
        r67 = C0046.m186("ۣۢۧ");
        goto L3
    L92:
        if (r63 != null) goto L153;
        TextView r523 = r35;
        String r247 = "ۣ۠ۤ";
    L94:
        r35 = r523;
        r67 = C0033.m132(r247);
        goto L3
    L96:
        if (C0000.m0() >= 0) goto L97;
        String r524 = "ۣۣۤ";
        int[] r209 = r36;
        ListView r248 = r7;
    L99:
        r36 = r209;
        r37 = r248;
        r67 = C0037.m149(r524);
        goto L3
    L97:
        C0049.f49 = 4;
        r37 = r7;
        r67 = C0046.m186("ۣ۠ۤ");
        goto L3
    L101:
        if ((C0001.f1 + (C0009.f9 / 7474)) < 0) goto L103;
        C0048.f48 = 16;
        r9 = r29;
        r67 = C0006.m26("ۤۢۢ");
        goto L3
    L103:
        r510 = "ۡۥۦ";
        r9 = r29;
        goto L8
    L104:
        ip.o(u40.a("+VCkWpk=\n", "iTHWO/Q6Gko=\n"), r69);
        r28 = r69.thisObject;
        Object r525 = XposedHelpers.getObjectField(r28, this.a);
        if ((r525 instanceof ListView) == false) goto L319;
        ListView r526 = (ListView) r525;
        if ((C0012.f12 + (C0032.f32 / (-7642))) <= 0) goto L108;
        r37 = r526;
        r67 = C0044.m176("۠ۦۣ");
        goto L3
    L108:
        C0052.f52 = 93;
        r37 = r526;
        r67 = C0072.m288("ۢۢ۟");
        goto L3
    L110:
        r246 = r37.getContext();
        if (r246 == null) goto L113;
    L140:
        String r2010 = "۠ۡۧ";
        r29 = r246;
    L141:
        r67 = C0022.m90(r2010);
        goto L3
    L113:
        if (C0061.m244() > 0) goto L115;
        C0056.f56 = 39;
        r29 = r246;
        r67 = C0024.m98("ۢۨۧ");
        goto L3
    L115:
        r208 = "ۣ۟ۢ";
        goto L69
    L116:
        r61.setElevation(ff.p(10.0f));
        r57.clear();
        r245 = 0;
        r252 = 0;
        r513 = r17;
        r204 = "ۣۡۤ";
        r21 = r22;
        r23 = r22.size();
        goto L36
    L117:
        r27 = ff.p(6.0f);
        if (C0022.f22 >= 0) goto L119;
        r67 = (C0056.f56 / C0071.f71) + 1746972;
        goto L3
    L119:
        r67 = C0042.m170("ۥۡۧ");
        goto L3
    L122:
        if ((C0033.f33 % (C0049.f49 + 3935)) > 0) goto L124;
        C0014.f14 = 8;
        r521 = r32;
        r26 = r27;
        goto L86
    L124:
        r204 = "ۡۦۨ";
        r513 = r17;
        r245 = r10;
        r252 = r12;
        r26 = r27;
        goto L36
    L126:
        if (C0048.m194() <= 0) goto L127;
        String r527 = "ۡۧۧ";
    L130:
        r67 = C0039.m159(r527);
        goto L3
    L127:
        String r528 = "ۥ۟۟";
    L128:
        r67 = C0006.m26(r528);
        goto L3
    L131:
        ViewParent r529 = r37.getParent();
        if ((r529 instanceof ViewGroup) == false) goto L168;
        ViewGroup r530 = (ViewGroup) r529;
        if (C0038.m155() <= 0) goto L135;
        r63 = r530;
        r67 = (C0033.f33 | C0034.f34) + 1753449;
        goto L3
    L135:
        C0025.m103();
        r63 = r530;
        r67 = C0005.m23("ۣۣۤ");
        goto L3
    L137:
        r67 = (C0008.f8 + C0049.f49) + 1752402;
        goto L3
    L138:
        System.out.println(r16);
        r67 = (C0068.f68 | C0052.f52) + 1748957;
        goto L3
    L139:
        r246 = r29;
        goto L140
    L143:
        if (C0031.f31 < 0) goto L146;
        C0009.f9 = 21;
        String r2011 = "ۤۥۤ";
        f00 r531 = r33;
    L145:
        r33 = r531;
        r67 = C0017.m70(r2011);
        goto L3
    L146:
        r208 = "ۧ۟ۢ";
        r246 = r29;
        goto L69
    L148:
        if (C0017.f17 <= 0) goto L149;
        String r532 = "ۤۦۢ";
    L151:
        r67 = C0003.m13(r532);
        goto L3
    L149:
        C0022.f22 = 96;
        r67 = C0036.m144("ۡۥۥ");
    L153:
        if (C0024.f24 > 0) goto L156;
        r517 = "ۦۦۤ";
        r206 = r34;
        goto L155
    L156:
        r517 = "ۣ۟ۦ";
        r206 = r34;
    L158:
        if (C0011.m44() <= 0) goto L159;
        r207 = "۟ۡ۠";
        r518 = r28;
        goto L54
    L159:
        C0064.f64 = 2;
        r67 = C0024.m98("ۣۦۤ");
        goto L3
    L161:
        if (r12 >= r14) goto L367;
        Object r533 = r21.get(r12);
        if (r10 < 0) goto L193;
        TextView r2012 = new TextView(r9);
        r2012.setText((String) r533);
        r2012.setTextSize(14.0f);
        r2012.setGravity(17);
        if (C0034.f34 >= 0) goto L166;
        r35 = r2012;
        r67 = (C0001.f1 % C0025.f25) + 1749851;
        goto L3
    L166:
        C0006.f6 = 62;
        r247 = "ۦۤۢ";
        r523 = r2012;
    L168:
        r2010 = "ۥۨۨ";
        goto L141
    L169:
        r67 = (C0042.f42 ^ C0041.f41) ^ (-1750088);
        goto L3
    L170:
        r209 = new int[2];
        r209[0] = Color.parseColor(u40.a("OKBPU7GkqQ==\n", "G+YJFffi79c=\n"));
        r209[r45] = Color.parseColor(u40.a("3DmXfqz6xA==\n", "/3+lOJ68828=\n"));
        if (C0004.f4 >= 0) goto L172;
        r36 = r209;
        r67 = (C0033.f33 | C0048.f48) + 1747388;
        goto L3
    L172:
        r524 = "ۣ۟ۢ";
        r248 = r37;
        goto L99
    L175:
        if (C0036.m147() >= 0) goto L176;
        r2010 = "۟ۡۥ";
        goto L141
    L176:
        C0035.m143();
        r5 = "ۡۤ۟";
        r20 = r38;
        r24 = r39;
        goto L80
    L178:
        String r534 = u40.a("XWMG6B1n6/M4\n", "fiE1rlshrbU=\n");
        if (C0041.f41 <= 0) goto L180;
        String r2013 = r52;
    L182:
        r51 = r534;
        r52 = r2013;
        r67 = C0069.m277("ۨۨ۠");
        goto L3
    L180:
        C0071.m284();
        r51 = r534;
        r67 = C0059.m239("ۨۧۧ");
        goto L3
    L184:
        if ((C0047.f47 * (C0035.f35 / (-7748))) != 0) goto L185;
        r50 = r36;
        r67 = (C0073.f73 + C0066.f66) ^ 1748316;
        goto L3
    L185:
        C0006.m24();
        r50 = r36;
        r67 = C0047.m189("۠ۦۧ");
        goto L3
    L188:
        if ((C0035.f35 ^ (C0056.f56 / 3227)) <= 0) goto L189;
        String r535 = "ۦۢۦ";
    L192:
        r67 = C0059.m239(r535);
        goto L3
    L189:
        String r536 = "ۤۨۡ";
        Class<?> r2014 = r40;
    L190:
        r40 = r2014;
        r67 = C0060.m241(r536);
    L193:
        r205 = "۟ۢ۟";
        goto L76
    L194:
        GradientDrawable r537 = new GradientDrawable(r58, r50);
        r537.setCornerRadius(999.0f);
        r49 = ff.q(r45);
        if (vd.e == true) goto L196;
    L296:
        if (C0006.f6 <= 0) goto L297;
        r46 = r537;
        r67 = (C0057.f57 | C0004.f4) ^ (-1747776);
        goto L3
    L297:
        C0034.f34 = 86;
        r46 = r537;
        r67 = C0002.m8("ۥ۟ۡ");
        goto L3
    L196:
        String r253 = "eo6OXIRCPD0f\n";
        r48 = "WbrKGsIEens=\n";
        if (C0017.m71() <= 0) goto L198;
        String r249 = "ۧۧۨ";
    L200:
        r46 = r537;
        r47 = r253;
        r67 = C0018.m73(r249);
        goto L3
    L198:
        C0009.m36();
        r46 = r537;
        r47 = "eo6OXIRCPD0f\n";
        r67 = C0035.m140("ۣ۟ۦ");
        goto L3
    L202:
        if ((C0038.f38 | (C0007.f7 / (-2899))) >= 0) goto L203;
        r67 = (C0044.f44 - C0003.f3) + 1749158;
        goto L3
    L203:
        C0012.f12 = 95;
        r67 = C0037.m149("ۦۡۦ");
        goto L3
    L206:
        if (C0026.m106() <= 0) goto L207;
        r67 = (C0040.f40 ^ C0072.f72) + 1754570;
        goto L3
    L207:
        r67 = C0015.m60("ۥۧۨ");
        goto L3
    L209:
        r513 = new FrameLayout(r29);
        r513.setLayoutParams(new ViewGroup.LayoutParams(-1, ff.q(54)));
        r513.setBackgroundColor(0);
        r18 = new FrameLayout(r29);
        r19 = new GradientDrawable();
        if (vd.e == false) goto L67;
        r25 = u40.a("Z7U6Aloe6EwB\n", "RIwDMxkvq30=\n");
        if (C0063.f63 > 0) goto L214;
        C0071.f71 = 97;
        r17 = r513;
        r56 = r25;
        r67 = C0042.m170("۠ۡۧ");
        goto L3
    L214:
        r17 = r513;
        r244 = "ۧۤۨ";
        goto L38
    L215:
        r22 = vd.a;
        int r538 = r29.getResources().getConfiguration().uiMode;
        if ((r538 & (r538 ^ (-49))) != 32) goto L349;
        r32 = true;
        if ((C0026.f26 - (C0006.f6 % (-6198))) <= 0) goto L219;
        r67 = (C0026.f26 - C0058.f58) + 1746888;
        goto L3
    L219:
        C0065.m260();
        goto L21
    L221:
        r59.setElevation(r26);
        r59.setLayoutParams(new FrameLayout.LayoutParams(ff.q(100), -1));
        vd.c = r59;
        r18.addView(r59);
        LinearLayout r539 = new LinearLayout(r29);
        r539.setOrientation(0);
        r539.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        r539.setWeightSum(r22.size());
        if ((C0036.f36 - (C0024.f24 / (-3706))) <= 0) goto L223;
        r61 = r539;
        r67 = (C0005.f5 + C0066.f66) + 1748555;
        goto L3
    L223:
        C0045.m181();
        r61 = r539;
        r67 = C0029.m116("ۡۥۦ");
        goto L3
    L225:
        int r540 = Color.parseColor(u40.a(r62, r48));
        if ((C0006.f6 / (C0029.f29 ^ (-3119))) != 0) goto L227;
        r64 = r540;
        r67 = (C0022.f22 - C0022.f22) + 1748767;
        goto L3
    L227:
        C0010.m40();
        r64 = r540;
        r67 = C0030.m120("ۧ۠ۨ");
        goto L3
    L229:
        r67 = (C0007.f7 ^ C0045.f45) + 56650;
        goto L3
    L230:
        r67 = (C0025.f25 | C0059.f59) ^ (-1755041);
        goto L3
    L232:
        if ((C0018.f18 | (C0054.f54 ^ 3849)) <= 0) goto L233;
        String r541 = "ۣۧۡ";
    L235:
        r67 = C0034.m138(r541);
        goto L3
    L233:
        C0005.m20();
        r67 = C0019.m79("ۡۡۦ");
        goto L3
    L236:
        bb.g0();
        r67 = (C0071.f71 ^ C0020.f20) ^ 57073;
        goto L3
    L238:
        if (C0018.f18 > 0) goto L240;
        C0049.m199();
        r67 = C0050.m203("ۦۧۥ");
        goto L3
    L240:
        r517 = "ۣۣ۟";
        r206 = r34;
        goto L155
    L242:
        if ((C0002.f2 % (C0043.f43 * 5714)) > 0) goto L245;
        String r2015 = "ۣ۠ۤ";
        ArrayList r542 = r41;
        int r2410 = r42;
        int r254 = r43;
        r44 = r43;
    L244:
        r41 = r542;
        r42 = r2410;
        r43 = r254;
        r67 = C0060.m241(r2015);
        goto L3
    L245:
        r244 = "ۥۢ۠";
        r25 = r56;
        r44 = r43;
        goto L38
    L247:
        if (C0028.m112() <= 0) goto L248;
        r67 = (C0050.f50 ^ C0003.f3) + 1747969;
        goto L3
    L248:
        C0020.m82();
        r67 = C0039.m159("ۧ۠ۦ");
        goto L3
    L251:
        if ((C0018.f18 - (C0051.f51 * 1264)) <= 0) goto L252;
        r67 = C0036.m144("ۤۢ۠");
        goto L3
    L252:
        C0005.f5 = 57;
        r532 = "ۡۧۧ";
        goto L151
    L254:
        final ListView r1 = r37;
        final View r2 = r60;
        final f00 r3 = r33;
        final FrameLayout r4 = r17;
        r17.getViewTreeObserver().addOnPreDrawListener(new rd(r1, r2, r3, r4));
        r17.bringToFront();
        if ((C0004.f4 ^ (C0027.f27 | 4673)) > 0) goto L257;
        r67 = C0038.m153("ۤۥۢ");
        goto L3
    L257:
        r511 = r9;
        goto L17
    L259:
        if (C0031.m124() <= 0) goto L260;
        r207 = "۟ۤۥ";
        r518 = r28;
        goto L54
    L260:
        r510 = "ۡۦۨ";
        goto L8
    L262:
        r67 = (C0036.f36 + C0049.f49) + 1750638;
        goto L3
    L263:
        ff.y = 0;
        r67 = (C0040.f40 | C0047.f47) + 1754417;
        goto L3
    L264:
        ip.l(r6);     // Catch: Throwable -> L389
        r2014 = r6.getClass();     // Catch: Throwable -> L389
        if ((C0064.f64 * (C0003.f3 | (-4065))) < 0) goto L268;
        r249 = "ۣۢ";
        r537 = r46;
        r40 = r2014;
        r253 = r47;
        goto L200
    L268:
        r536 = "ۥۤ";
        goto L190
    L269:
        r19.setStroke(r30, r66);
        r18.setBackground(r19);
        r18.setPadding(ff.q(3), ff.q(3), ff.q(3), ff.q(3));
        FrameLayout.LayoutParams r543 = new FrameLayout.LayoutParams(-1, ff.q(36));
        r543.setMargins(ff.q(16), ff.q(10), ff.q(16), ff.q(8));
        r18.setLayoutParams(r543);
        View r2016 = new View(r29);
        GradientDrawable.Orientation r544 = GradientDrawable.Orientation.TOP_BOTTOM;
        if (C0027.f27 >= 0) goto L271;
    L271:
        r58 = r544;
        r59 = r2016;
        r67 = C0059.m239("ۡۢۨ");
        goto L3
    L273:
        if ((C0008.f8 * (C0000.f0 - 6765)) <= 0) goto L274;
        r67 = (C0067.f67 * C0028.f28) + 1665639;
        goto L3
    L274:
        C0044.f44 = 96;
        String r545 = "۟۠";
        int[] r2017 = r50;
    L275:
        r50 = r2017;
        r67 = C0036.m144(r545);
        goto L3
    L278:
        if (vd.e == false) goto L39;
        r2017 = new int[2];
        r2017[0] = Color.parseColor(u40.a("juUkuYlIaw==\n", "rdJnjspwW5c=\n"));
        r2017[r45] = Color.parseColor(u40.a("IP2oOuuF7w==\n", "A8ubDNiz2WQ=\n"));
        r545 = "ۣۣۡ";
        goto L275
    L280:
        r67 = (C0066.f66 + C0051.f51) + 1748099;
        goto L3
    L282:
        if (C0044.f44 > 0) goto L284;
        C0057.m230();
        r534 = r51;
        r2013 = r53;
        goto L182
    L284:
        r527 = "ۤۨ";
        r52 = r53;
        goto L130
    L286:
        if (C0052.m210() <= 0) goto L287;
        r67 = C0057.m229("ۥۣۡ");
        goto L3
    L287:
        C0067.f67 = 33;
        r522 = "ۢ۟ۡ";
        goto L91
    L290:
        if (C0005.m20() >= 0) goto L291;
        r54 = null;
        r67 = (C0023.f23 - C0037.f37) ^ 1748983;
        goto L3
    L291:
        C0012.f12 = 52;
        ViewGroup r2018 = null;
    L292:
        r54 = r2018;
        r67 = C0051.m207("ۦۧۤ");
        goto L3
    L294:
        r537 = r46;
        goto L296
    L299:
        r7 = null;
        if (C0056.f56 >= 0) goto L301;
        ListAdapter r546 = r6;
    L303:
        r6 = r546;
        r67 = C0062.m249("ۣۢۢ");
        goto L3
    L301:
        r67 = C0053.m213("ۧ۟۠");
        goto L3
    L305:
        if ((C0052.f52 ^ (C0017.f17 % 5969)) <= 0) goto L306;
        r67 = (C0017.f17 / C0073.f73) + 1749802;
        goto L3
    L306:
        r67 = C0071.m286("ۢۨۦ");
        goto L3
    L309:
        if (C0068.m273() < 0) goto L34;
        r512 = Double.decode(C0013.m54("SZSlqDVVyrYNNe6WpxEFwQPZb"));
        if (C0049.f49 > 0) goto L30;
        r16 = r512;
        r67 = C0011.m45("ۨ۠ۢ");
        goto L3
    L314:
        throw null;
    L315:
        vd.e = r32;
        r22.clear();
        r542 = zt.K();
        r2410 = r542.size();
        r254 = 0;
        if ((C0025.f25 % (C0070.f70 * (-2639))) >= 0) goto L317;
        r2015 = "۟ۧۦ";
        r45 = r34;
        goto L244
    L317:
        C0068.f68 = 83;
        r203 = "ۥۨۨ";
        r41 = r542;
        r42 = r2410;
        r43 = 0;
        r45 = r34;
    L319:
        r518 = r28;
        if ((C0033.f33 * (C0021.f21 - 4470)) < 0) goto L322;
        C0007.m31();
        r2010 = "ۧۢ۟";
        r28 = r518;
        goto L141
    L322:
        r207 = "ۧ۠۟";
    L323:
        r67 = (C0005.f5 % C0053.f53) + 1755449;
        goto L3
    L325:
        if ((C0062.f62 / (C0050.f50 + 8745)) != 0) goto L326;
        r63 = r54;
        r67 = (C0003.f3 | C0036.f36) + 1751585;
        goto L3
    L326:
        C0067.f67 = 7;
        r63 = r54;
        r67 = C0049.m197("۟ۨۡ");
        goto L3
    L329:
        if ((C0005.f5 / (C0042.f42 * 7901)) != 0) goto L330;
        r67 = (C0036.f36 + C0051.f51) + 1751764;
        goto L3
    L330:
        r527 = "ۡ۟";
    L332:
        r67 = (C0040.f40 * C0008.f8) + 2211107;
        goto L3
    L334:
        if ((C0031.f31 ^ (C0070.f70 | 1713)) >= 0) goto L335;
        r536 = "ۢۡۤ";
        r2014 = r40;
        goto L190
    L335:
        r514 = r30;
        goto L336
    L338:
        r35.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        r35.setOnClickListener(new nd(r10, r37, r28));
        r61.addView(r35);
        r57.add(r35);
        r11 = ((r10 - 22) + 1) + 22;
        r13 = 1 - (0 - r12);
        if (C0059.m236() <= 0) goto L340;
        r8 = r9;
        r15 = r14;
        r67 = (C0018.f18 * C0047.f47) + 1752617;
        goto L3
    L340:
        r8 = r9;
        r15 = r14;
        r67 = C0070.m281("ۢۨۤ");
        goto L3
    L342:
        r46.setStroke(r49, r64);
        r59.setBackground(r46);
        if (vd.e == false) goto L323;
        r26 = 0.0f;
        r67 = (C0015.f15 - C0011.f11) ^ (-1755085);
        goto L3
    L346:
        if (C0040.f40 > 0) goto L348;
        r67 = C0058.m234("ۡۨۥ");
        goto L3
    L348:
        r2010 = "ۥۢ۠";
    L349:
        r67 = C0039.m159("ۤۢۢ");
        goto L3
    L350:
        r31 = false;
        r67 = (C0009.f9 ^ C0043.f43) + 1748224;
        goto L3
    L351:
        r519 = "ۢۦۡ";
        goto L59
    L352:
        r67 = (C0050.f50 ^ C0037.f37) ^ (-1756140);
        goto L3
    L354:
        if (r63.findViewById(2114519049) == null) goto L88;
        if ((C0068.f68 - (C0072.f72 ^ 2899)) <= 0) goto L357;
        r67 = C0073.m292("ۥۣۡ");
        goto L3
    L357:
        C0053.m214();
        r535 = "ۢۦۥ";
        goto L192
    L359:
        r48 = "S4RtMf1LhM4=\n";
        r62 = "aLQpAc17tP57\n";
        r67 = (C0011.f11 % C0060.f60) ^ (-1755138);
        goto L3
    L360:
        XposedBridge.hookAllMethods(r40, r38, r39);     // Catch: Throwable -> L389
        r528 = "ۤۨۡ";
        goto L128
    L362:
        r206 = r34;
    L367:
        r522 = "۟ۨۡ";
        goto L91
    L368:
        View r2019 = new View(r29);
        int r0 = this.b;
        r2019.setLayoutParams(new AbsListView.LayoutParams(-1, r0));
        r2019.setBackgroundColor(0);
        r37.addHeaderView(r2019, null, false);
        ArrayList r547 = vd.a;
        ip.l(r28);
        ArrayList r548 = vd.b;
        if ((C0061.f61 % (C0017.f17 | (-9797))) <= 0) goto L370;
        r57 = r548;
        r60 = r2019;
        r65 = r0;
        r67 = (C0021.f21 + C0031.f31) + 1752224;
        goto L3
    L370:
        C0052.f52 = 79;
        r57 = r548;
        r60 = r2019;
        r65 = r0;
        r67 = C0071.m286("۠ۢۦ");
        goto L3
    L373:
        if (r44 >= r42) goto L378;
        Object r549 = r41.get(r44);
        r44 = ((r44 - 3) + 1) + 3;
        r22.add(((s50) r549).a);
        if (C0041.f41 <= 0) goto L376;
        r67 = (C0035.f35 % C0009.f9) + 1752874;
        goto L3
    L376:
        C0031.m124();
        r541 = "۟ۢ۟";
    L378:
        r67 = C0031.m127("ۡۢ");
        goto L3
    L379:
        r62 = r47;
        r67 = (C0002.f2 / C0041.f41) + 1748864;
        goto L3
    L380:
        r18.addView(r61);
        r61.bringToFront();
        r17.addView(r18);
        r17.post(new od(0));
        r17.setId(2114519049);
        r63.addView(r17, new FrameLayout.LayoutParams(-1, r65));
        r531 = new f00();
        r531.a = -1.0f;
        if (C0053.m214() > 0) goto L383;
        r33 = r531;
        r67 = C0024.m98("ۥۤ");
        goto L3
    L383:
        r2011 = "ۡۤ۠";
        goto L145
    L384:
        r546 = vd.d;     // Catch: Throwable -> L389
        if (C0048.m194() > 0) goto L388;
        C0072.m289();
        goto L303
    L388:
        r2018 = r54;
        r6 = r546;
        goto L292
    L395:
        if ((C0005.f5 - (C0006.f6 + 5810)) < 0) goto L397;
        C0017.m71();
        r67 = C0022.m90("ۤۧ");
        goto L3
    L397:
        r202 = "ۧ۟ۧ";
        r242 = r9;
        goto L18
    }
}
