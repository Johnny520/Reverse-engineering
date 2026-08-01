package defpackage;

import android.app.Activity;
import android.app.C0000;
import android.app.C0002;
import android.app.C0003;
import android.app.Dialog;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.util.SparseIntArray;
import android.view.C0007;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import java.io.Serializable;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a6 implements View.OnClickListener {
    public final int a;
    public final Object b;
    public final KeyEvent.Callback c;
    public final Serializable d;
    public final Object e;
    public final Object f;

    public /* synthetic */ a6(Activity r4, String r5, String r6, FrameLayout r7, LinearLayout r8) {
        this.a = 2;
        Double r0 = null;
        int r1 = C0004.m16("ۥۦۥ");
    L3:
        switch(r1) {
            case 56383: goto L6;
            case 56476: goto L12;
            case 56507: goto L32;
            case 1750723: goto L11;
            case 1750752: goto L30;
            case 1751648: goto L24;
            case 1751712: goto L26;
            case 1752676: goto L29;
            case 1753481: goto L31;
            case 1755557: goto L18;
            case 1755621: goto L9;
            default: goto L3;
        };
    L6:
        if ((C0016.f16 / (C0026.f26 | (-4996))) != 0) goto L7;
        r1 = C0044.m176("ۦۡ");
        goto L3
    L7:
        C0046.f46 = 25;
        String r12 = "۠ۢ";
    L8:
        r1 = C0023.m95(r12);
        goto L3
    L9:
        r1 = (C0028.f28 - C0015.f15) ^ 1752917;
        goto L3
    L11:
        this.c = r7;
        r1 = C0005.m23("ۣۦۣ");
        goto L3
    L12:
        r0 = Double.valueOf(C0002.m11("TKikBDwLV5pfTQ6"));
        if ((C0022.f22 | (C0073.f73 % (-2251))) >= 0) goto L14;
        r1 = (C0063.f63 + C0046.f46) ^ 1753165;
        goto L3
    L14:
        C0025.f25 = 30;
    L15:
        r1 = C0019.m79("ۤۤ۠");
        goto L3
    L18:
        if (C0024.m96() < 0) goto L6;
        if (C0048.m194() <= 0) goto L22;
    L22:
        r1 = C0015.m60("ۥۡ");
        goto L3
    L24:
        this.d = r6;
        String r13 = "ۣۥۥ";
    L25:
        r1 = C0037.m149(r13);
        goto L3
    L26:
        this.b = r5;
        if ((C0065.f65 ^ (C0015.f15 + 3380)) < 0) goto L15;
    L28:
        r13 = "ۤۦۢ";
        goto L25
    L29:
        this.f = r4;
        goto L28
    L30:
        this.e = r8;
        r12 = "ۨۦۣ";
        goto L8
    L31:
        System.out.println(r0);
        r1 = (C0005.f5 | C0024.f24) + 56400;
        goto L3
    }

    public /* synthetic */ a6(TextView r4, i00 r5, Dialog r6, Dialog r7, Activity r8) {
        this.a = 0;
        int r2 = C0052.m209("ۣۣۨ");
        Long r1 = null;
    L3:
        switch(r2) {
            case 56416: goto L5;
            case 56450: goto L11;
            case 1746944: goto L20;
            case 1747898: goto L16;
            case 1751501: goto L21;
            case 1751586: goto L26;
            case 1752739: goto L34;
            case 1753448: goto L7;
            case 1753694: goto L39;
            case 1754412: goto L25;
            case 1755464: goto L30;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if ((C0060.f60 ^ (C0050.f50 * 208)) <= 0) goto L8;
        r2 = (C0046.f46 | C0037.f37) + 56932;
        goto L3
    L8:
        C0052.m210();
        String r0 = "ۣۤۡ";
    L9:
        r2 = C0045.m182(r0);
        goto L3
    L11:
        r1 = Long.valueOf(C0023.m94("uc88JS"));
        if (C0029.f29 < 0) goto L15;
        C0035.m143();
        String r02 = "ۣۣ";
    L14:
        r2 = C0002.m8(r02);
        goto L3
    L15:
        r02 = "ۤ۟ۨ";
        goto L14
    L16:
        this.c = r6;
        if ((C0011.f11 / (C0057.f57 | 1362)) <= 0) goto L18;
        r2 = (C0059.f59 * C0044.f44) + 2005766;
        goto L3
    L18:
        C0029.m118();
        r2 = C0050.m203("ۧ۠ۥ");
        goto L3
    L20:
        r2 = (C0042.f42 / C0065.f65) + 1755464;
        goto L3
    L21:
        System.out.println(r1);
        if (C0041.f41 <= 0) goto L23;
        r2 = (C0067.f67 % C0022.f22) ^ (-56568);
        goto L3
    L23:
        C0046.m185();
        r2 = C0012.m50("ۦ۠ۢ");
        goto L3
    L25:
        this.d = r5;
        r2 = (C0028.f28 ^ C0014.f14) + 1747765;
        goto L3
    L26:
        this.e = r7;
        if (C0072.m289() <= 0) goto L28;
        r2 = (C0010.f10 - C0051.f51) + 1753255;
        goto L3
    L28:
        C0036.m147();
        r2 = C0022.m90("ۤ۟ۨ");
        goto L3
    L30:
        this.b = r4;
        if ((C0035.f35 / (C0019.f19 - 4821)) != 0) goto L32;
        r2 = (C0065.f65 % C0019.f19) ^ (-1754431);
        goto L3
    L32:
        C0031.f31 = 98;
        r2 = C0040.m160("۠ۧۡ");
        goto L3
    L34:
        this.f = r8;
        if ((C0027.f27 / (C0026.f26 - 8)) != 0) goto L36;
        r2 = (C0019.f19 + C0014.f14) ^ (-1753152);
        goto L3
    L36:
        r2 = C0064.m258("ۣۣۨ");
        goto L3
    L39:
        if (C0027.m111() > 0) goto L7;
        r0 = "ۤۦ";
        goto L9
    }

    public /* synthetic */ a6(TextView r4, String r5, e00 r6, Dialog r7, ok r8) {
        this.a = 1;
        Double r0 = null;
        int r1 = C0059.m239("ۦۣۢ");
    L3:
        switch(r1) {
            case 56288: goto L5;
            case 56420: goto L9;
            case 56477: goto L6;
            case 1747648: goto L15;
            case 1747773: goto L32;
            case 1747936: goto L7;
            case 1752617: goto L28;
            case 1752739: goto L37;
            case 1753541: goto L13;
            case 1753639: goto L25;
            case 1754532: goto L20;
            default: goto L3;
        };
    L5:
        this.f = r8;
        r1 = (C0045.f45 ^ C0022.f22) + 1747077;
        goto L3
    L6:
        this.e = r6;
        r1 = C0017.m70("ۧۤۡ");
        goto L3
    L7:
        r1 = (C0007.f7 % C0073.f73) + 1753535;
    L9:
        if (C0069.f69 < 0) goto L12;
        C0068.f68 = 38;
        String r12 = "ۨۢ";
    L11:
        r1 = C0033.m132(r12);
        goto L3
    L12:
        r12 = "ۥۨۦ";
        goto L11
    L13:
        this.b = r4;
        r1 = (C0040.f40 | C0039.f39) ^ (-1753638);
        goto L3
    L15:
        if (C0023.m92() < 0) goto L9;
        if (C0049.m199() < 0) goto L19;
        r1 = C0036.m144("ۣۧ");
        goto L3
    L19:
        r12 = "ۣ۠۠";
        goto L11
    L20:
        this.c = r7;
        if ((C0019.f19 * (C0014.f14 + 3238)) <= 0) goto L22;
        String r13 = "۟۟";
    L24:
        r1 = C0073.m292(r13);
        goto L3
    L22:
        C0014.f14 = 91;
        r1 = C0006.m26("ۦۦۧ");
        goto L3
    L25:
        this.d = r5;
        if (C0072.f72 >= 0) goto L27;
    L35:
        r1 = C0006.m26("ۥۢ");
        goto L3
    L27:
        r1 = C0055.m220("ۣ۠۠");
        goto L3
    L28:
        System.out.println(r0);
        if (C0071.m284() >= 0) goto L30;
        r1 = (C0036.f36 ^ C0033.f33) + 1751792;
        goto L3
    L30:
        C0003.m14();
        r13 = "۠۟۟";
        goto L24
    L32:
        r0 = Double.decode(C0009.m37("NMP4yFltuLKdlo4pfKVJ"));
        if ((C0058.f58 * (C0025.f25 ^ (-2754))) <= 0) goto L34;
        r1 = (C0015.f15 - C0022.f22) ^ (-1752679);
        goto L3
    L34:
        C0057.m230();
        goto L35
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r37) {
        int r14 = 0;
        Object r9 = null;
        KeyEvent.Callback r7 = null;
        Serializable r5 = null;
        Object r3 = null;
        Object r10 = null;
        Activity r22 = null;
        String r21 = null;
        String r23 = null;
        FrameLayout r24 = null;
        LinearLayout r11 = null;
        gn r34 = null;
        String r12 = null;
        gn r16 = null;
        String r15 = null;
        gn r33 = null;
        String r13 = null;
        String r31 = null;
        TextView r19 = null;
        String r18 = null;
        e00 r17 = null;
        Dialog r20 = null;
        TextView r32 = null;
        i00 r30 = null;
        Activity r25 = null;
        int r35 = C0003.m13("ۦۤ۟");
        ok r26 = null;
        Dialog r27 = null;
        Dialog r28 = null;
        Long r29 = null;
    L3:
        switch(r35) {
            case 56326: goto L6;
            case 56352: goto L127;
            case 56390: goto L87;
            case 56536: goto L103;
            case 1746692: goto L106;
            case 1746694: goto L170;
            case 1746754: goto L113;
            case 1746783: goto L143;
            case 1746785: goto L69;
            case 1746818: goto L153;
            case 1746849: goto L83;
            case 1746875: goto L137;
            case 1746936: goto L189;
            case 1747654: goto L74;
            case 1747717: goto L104;
            case 1747741: goto L178;
            case 1747837: goto L89;
            case 1747839: goto L123;
            case 1748642: goto L111;
            case 1748643: goto L164;
            case 1748704: goto L177;
            case 1748707: goto L79;
            case 1748863: goto L46;
            case 1749575: goto L61;
            case 1749636: goto L183;
            case 1749725: goto L187;
            case 1749760: goto L188;
            case 1749763: goto L27;
            case 1749821: goto L14;
            case 1750539: goto L52;
            case 1750660: goto L154;
            case 1750811: goto L35;
            case 1751526: goto L41;
            case 1751555: goto L159;
            case 1751590: goto L99;
            case 1751679: goto L188;
            case 1751711: goto L174;
            case 1751747: goto L116;
            case 1752457: goto L12;
            case 1752486: goto L188;
            case 1752487: goto L134;
            case 1752732: goto L191;
            case 1752738: goto L8;
            case 1753453: goto L159;
            case 1753480: goto L43;
            case 1753544: goto L177;
            case 1753569: goto L63;
            case 1753608: goto L41;
            case 1754443: goto L163;
            case 1754499: goto L57;
            case 1754570: goto L19;
            case 1754630: goto L149;
            case 1755341: goto L25;
            case 1755437: goto L138;
            default: goto L3;
        };
    L191:
        gn r2 = gn.a;     // Catch: Throwable -> L93
        if ((C0057.f57 | (C0059.f59 + 2604)) >= 0) goto L23;
        r33 = r2;
        r35 = (C0023.f23 * C0007.f7) + 1450355;
        goto L3
    L23:
        C0025.f25 = 73;
        r33 = r2;
        r35 = C0070.m281("ۢۧۢ");
    L94:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "CheatPanel_KV", "Fg==\n", "c8HJlSTQVfc=\n");
        if ((C0051.f51 * (C0038.f38 | (-4183))) > 0) goto L98;
        C0015.m61();
        String r210 = "ۢ۟ۤ";
    L97:
        r35 = C0072.m288(r210);
        goto L3
    L98:
        r210 = "ۤۡ۠";
        goto L97
    L6:
        if (C0055.f55 >= 0) goto L7;
        r35 = (C0047.f47 | C0031.f31) ^ (-1748651);
        goto L3
    L7:
        r35 = C0050.m203("ۧۨۡ");
        goto L3
    L8:
        q50.d = Integer.valueOf(Integer.parseInt(r23));
        if ((C0048.f48 % (C0014.f14 + 2631)) <= 0) goto L10;
        r35 = (C0064.f64 | C0073.f73) ^ 1748525;
        goto L3
    L10:
        r35 = C0026.m105("ۢۤ۟");
        goto L3
    L12:
        switch(r14) {
            case 0: goto L174;
            case 1: goto L149;
            default: goto L14;
        };
    L14:
        if ((C0056.f56 % (C0027.f27 + 3339)) >= 0) goto L15;
        r35 = (C0004.f4 + C0041.f41) + 1747865;
        goto L3
    L15:
        String r211 = "ۥۧۨ";
    L16:
        r35 = C0005.m23(r211);
        goto L3
    L19:
        r35 = (C0030.f30 + C0021.f21) + 1749923;
        r27 = (Dialog) r7;
        r28 = (Dialog) r9;
        r30 = (i00) r5;
        r32 = (TextView) r3;
        goto L3
    L25:
        gn r4 = gn.a;
        String r212 = "\u270c\ufe0f \u9501\u5b9a\u751f\u6548";
        r4.getClass();
        r31 = r212;
        r35 = (C0041.f41 | C0024.f24) + 1751296;
        goto L3
    L27:
        if ((C0016.f16 + (C0006.f6 | 8938)) <= 0) goto L28;
        r35 = (C0046.f46 / C0069.f69) + 1746764;
        goto L3
    L28:
        C0062.m248();
        String r42 = "ۨۧ";
        LinearLayout r213 = r11;
    L29:
        r11 = r213;
        r35 = C0011.m45(r42);
        goto L3
    L189:
        gn.f(r12, true);     // Catch: Throwable -> L81
        String r43 = "۠ۢ۟";
    L34:
        r35 = C0040.m160(r43);
    L82:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", "CheatPanel_KV", "Fg==\n", "c8HJlSTQVfc=\n");
        r43 = "ۦۣۥ";
        goto L34
    L35:
        r213 = (LinearLayout) r9;
        if (ip.i(r21, "dice") == false) goto L105;
        SparseIntArray r44 = q50.a;
        if (C0013.m52() >= 0) goto L39;
        r11 = r213;
        r35 = (C0000.f0 ^ C0006.f6) ^ 1752334;
        goto L3
    L39:
        C0043.f43 = 3;
        r11 = r213;
        r35 = C0022.m90("ۤۦۡ");
    L105:
        r42 = "ۣ۟ۦ";
        goto L29
    L41:
        r35 = (C0042.f42 - C0018.f18) + 1755543;
        goto L3
    L43:
        if (C0059.f59 < 0) goto L45;
        C0042.m169();
        r35 = C0068.m272("ۣۣۢ");
        goto L3
    L45:
        r211 = "ۧ۟";
        goto L16
    L46:
        String r45 = "key_dice_on";     // Catch: Throwable -> L81
        if (C0031.f31 >= 0) goto L49;
        String r214 = "ۣ۟ۧ";
    L51:
        r35 = C0070.m281(r214);
        r12 = r45;
        goto L3
    L49:
        r35 = C0000.m2("۟ۧ۠");
        r12 = r45;
        goto L3
    L52:
        r34.getClass();     // Catch: Throwable -> L81
        if ((C0072.f72 ^ (C0046.f46 + 7513)) >= 0) goto L55;
        r35 = C0006.m26("۟ۧ۠");
        goto L3
    L55:
        C0009.f9 = 36;
        r35 = C0025.m102("۠ۥۤ");
        goto L3
    L57:
        r24.removeView(r11);
        if (C0045.f45 < 0) goto L60;
        C0050.m202();
        r214 = "۠ۢ۟";
        r45 = r12;
        goto L51
    L60:
        r211 = "ۤۥ۠";
        goto L16
    L61:
        gn.g("key_rps_num", Integer.parseInt(r23));     // Catch: Throwable -> L93
        r35 = (C0026.f26 | C0016.f16) + 55533;
        goto L3
    L63:
        int r46 = this.a;
        r9 = this.e;
        r7 = this.c;
        r5 = this.d;
        if (C0056.f56 >= 0) goto L65;
        String r215 = r13;
    L67:
        String r6 = "ۤۢۤ";
        r13 = r215;
    L68:
        r14 = r46;
        r35 = C0008.m35(r6);
        goto L3
    L65:
        C0032.f32 = 89;
        r14 = r46;
        r35 = C0020.m80("ۧ۟");
        goto L3
    L69:
        r215 = "key_rps_on";     // Catch: Throwable -> L93
        if ((C0017.f17 ^ (C0015.f15 | 6052)) < 0) goto L73;
        C0015.f15 = 3;
        r46 = r14;
        goto L67
    L73:
        r43 = "ۡ۠ۢ";
        r13 = r215;
        goto L34
    L74:
        Activity r216 = (Activity) r10;
        String r47 = (String) r3;
        String r62 = (String) r5;
        FrameLayout r8 = (FrameLayout) r7;
        if ((C0051.f51 | (C0020.f20 ^ (-5286))) >= 0) goto L76;
        r35 = (C0009.f9 | C0044.f44) + 1751324;
        r21 = r47;
        r22 = r216;
        r23 = r62;
        r24 = r8;
        goto L3
    L76:
        C0048.f48 = 31;
        r21 = r47;
    L77:
        r22 = r216;
        r23 = r62;
        r24 = r8;
        r35 = C0055.m220("۟ۥۡ");
        goto L3
    L79:
        gn r48 = gn.a;
        String r217 = "🎲 锁定: " + r23;
        String r63 = "ۢۨ";
    L80:
        r15 = r217;
        r16 = r48;
        r35 = C0049.m197(r63);
        goto L3
    L83:
        q50.e = Integer.valueOf(Integer.parseInt(r23));
        if ((C0067.f67 * (C0015.f15 / 6033)) != 0) goto L85;
        r35 = (C0062.f62 / C0002.f2) + 1752733;
        goto L3
    L85:
        C0010.f10 = 49;
        r35 = C0027.m110("۟۟ۤ");
        goto L3
    L87:
        r16.getClass();
        gn.k(r22, r15);
    L88:
        r63 = "ۧۡۥ";
        r217 = r15;
        r48 = r16;
        goto L80
    L89:
        ok r218 = (ok) r10;
        gn.a.getClass();
        gn.i(r19, 1);
        gn.h(r18, "");
        if ((C0037.f37 % (C0014.f14 * (-5332))) >= 0) goto L91;
        r26 = r218;
        r35 = (C0051.f51 - C0037.f37) + 55909;
        goto L3
    L91:
        C0058.m232();
        r26 = r218;
        r35 = C0042.m170("ۨ۟ۤ");
        goto L3
    L99:
        r3 = this.b;
        r10 = this.f;
        if ((C0055.f55 | (C0044.f44 * 6942)) < 0) goto L102;
        C0020.f20 = 82;
        goto L88
    L102:
        r211 = "ۥۣ۟";
        goto L16
    L103:
        r35 = (C0002.f2 ^ C0039.f39) + 1754228;
        goto L3
    L104:
        r213 = r11;
        goto L105
    L106:
        Long r219 = Long.valueOf(C0036.m146("akdDcjKYKnRxbDHCfFJEHy5ERRl"));
        if ((C0007.f7 % (C0070.f70 - 9422)) <= 0) goto L108;
        r29 = r219;
        r35 = C0039.m159("ۨۢۧ");
        goto L3
    L108:
        r29 = r219;
        r35 = C0008.m35("۠ۡۦ");
        goto L3
    L111:
        r34 = gn.a;     // Catch: Throwable -> L81
        r35 = (C0068.f68 | C0029.f29) ^ (-1748816);
        goto L3
    L113:
        if ((C0009.f9 / (C0060.f60 - 8182)) != 0) goto L114;
        r35 = (C0069.f69 | C0032.f32) + 1748705;
        goto L3
    L114:
        r35 = C0027.m110("ۤۥ۠");
        goto L3
    L116:
        gn.k(r22, r31);
        if ((C0016.f16 - (C0023.f23 | (-779))) <= 0) goto L118;
        r35 = (C0066.f66 | C0027.f27) ^ (-1754538);
        goto L3
    L118:
        C0037.f37 = 33;
    L119:
        String r220 = "۟ۤۦ";
    L120:
        r35 = C0036.m144(r220);
        goto L3
    L123:
        if ((C0050.f50 | (C0058.f58 - 5236)) < 0) goto L126;
        String r221 = "ۡۡۧ";
    L125:
        r35 = C0039.m159(r221);
        goto L3
    L126:
        r221 = "ۥۨ۟";
        goto L125
    L127:
        r17.a = true;
        r20.dismiss();
        r26.a();
        if (C0046.m185() > 0) goto L187;
        if ((C0014.f14 ^ (C0064.f64 / (-1401))) >= 0) goto L131;
        r35 = (C0036.f36 * C0020.f20) + 1967418;
        goto L3
    L131:
        C0019.m77();
        e00 r64 = r17;
        String r49 = r18;
        TextView r222 = r19;
        Dialog r82 = r20;
    L132:
        r35 = C0062.m249("۠ۥۢ");
        r17 = r64;
        r18 = r49;
        r19 = r222;
        r20 = r82;
        goto L3
    L134:
        r222 = (TextView) r3;
        r49 = (String) r5;
        r64 = (e00) r9;
        r82 = (Dialog) r7;
        if (C0070.f70 > 0) goto L132;
        C0028.m112();
        r35 = C0027.m110("ۧۧۦ");
        r17 = r64;
        r18 = r49;
        r19 = r222;
        r20 = r82;
        goto L3
    L137:
        gn.f("key_dynamic_color", false);
        r27.dismiss();
        r28.dismiss();
        s20.a.getClass();
        r35 = (C0013.f13 | C0002.f2) + 1750918;
        goto L3
    L138:
        System.out.println(r29);
        if (C0058.m232() <= 0) goto L140;
        r35 = (C0016.f16 - C0030.f30) ^ 1749593;
        goto L3
    L140:
        C0058.f58 = 83;
        r35 = C0051.m207("ۡۧۥ");
        goto L3
    L143:
        gn.f(r13, true);     // Catch: Throwable -> L93
        if (C0015.m61() > 0) goto L147;
        C0052.m210();
        r35 = C0029.m116("ۥۣ۟");
        goto L3
    L147:
        r220 = "ۢ۟ۤ";
    L149:
        if ((C0002.f2 - (C0050.f50 / 8193)) <= 0) goto L150;
        r42 = "ۥ۠ۢ";
        r213 = r11;
        goto L29
    L150:
        C0065.f65 = 86;
        String r223 = "۟۠۟";
    L151:
        r35 = C0045.m182(r223);
        goto L3
    L153:
        SparseIntArray r224 = q50.a;
        goto L119
    L154:
        s20.a(r25);
        if (C0018.f18 > 0) goto L157;
        C0025.m103();
        r35 = C0015.m60("ۡ۠ۢ");
        goto L3
    L157:
        r42 = "ۥ۠ۡ";
        r213 = r11;
        goto L29
    L159:
        if (C0023.f23 <= 0) goto L160;
        r35 = C0070.m281("ۨ۟ۤ");
        goto L3
    L160:
        C0054.m217();
        String r225 = "ۧ۟ۦ";
    L161:
        r35 = C0031.m127(r225);
        goto L3
    L163:
        r6 = "ۤ۠ۢ";
        r46 = r14;
        goto L68
    L164:
        r33.getClass();     // Catch: Throwable -> L93
        if (C0022.f22 < 0) goto L168;
        C0028.f28 = 54;
        r35 = C0015.m60("ۡۢۡ");
        goto L3
    L168:
        r225 = "۟ۢۢ";
        goto L161
    L170:
        if ((C0059.f59 / (C0041.f41 % 4476)) >= 0) goto L171;
        r35 = (C0016.f16 ^ C0028.f28) + 1754548;
        goto L3
    L171:
        C0028.m112();
        r43 = "ۣ۟ۨ";
    L174:
        if (C0051.m206() < 0) goto L176;
        C0014.f14 = 66;
        r35 = C0018.m73("ۣ۟ۥ");
        goto L3
    L176:
        r223 = "ۧۥۨ";
        goto L151
    L177:
        r35 = (C0067.f67 | C0062.f62) + 1748852;
        goto L3
    L178:
        gn.g("key_dice_num", Integer.parseInt(r23));     // Catch: Throwable -> L81
        if ((C0033.f33 / (C0029.f29 * 1832)) == 0) goto L182;
        C0000.m0();
        r35 = C0048.m193("۟ۢۢ");
        goto L3
    L182:
        r220 = "۟ۡۤ";
        goto L120
    L183:
        Activity r410 = (Activity) r10;
        gn.a.getClass();
        gn.i(r32, 1);
        gn.h("key_custom_accent_color", (String) r30.b);
        if (C0055.f55 < 0) goto L186;
        C0047.f47 = 40;
        r25 = r410;
        r35 = C0019.m79("ۥ۠ۢ");
        goto L3
    L186:
        r216 = r22;
        r62 = r23;
        r8 = r24;
        r25 = r410;
    L187:
        r35 = (C0022.f22 * C0059.f59) + 1179108;
        goto L3
    }
}
