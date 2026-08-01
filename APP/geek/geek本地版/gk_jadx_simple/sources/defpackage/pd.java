package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.util.SparseArray;
import android.view.C0007;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
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
import de.robv.android.xposed.XposedHelpers;
import io.fastkv.C0068;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd implements Runnable {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;

    public /* synthetic */ pd(int r4, ListView r5, Object r6) {
        this.a = 0;
        int r2 = C0060.m241("ۣۧۡ");
        Long r1 = null;
    L3:
        switch(r2) {
            case 1747842: goto L5;
            case 1747904: goto L30;
            case 1750781: goto L25;
            case 1750819: goto L7;
            case 1751655: goto L26;
            case 1751714: goto L31;
            case 1751749: goto L21;
            case 1752521: goto L17;
            case 1753512: goto L13;
            default: goto L3;
        };
    L5:
        r2 = (C0037.f37 * C0073.f73) + 1760394;
        goto L3
    L7:
        if (C0011.m44() > 0) goto L5;
        if (C0005.f5 > 0) goto L12;
    L10:
        String r0 = "ۣۨۨ";
    L11:
        r2 = C0045.m182(r0);
        goto L3
    L12:
        r0 = "ۤۤۧ";
        goto L11
    L13:
        this.d = r5;
        if ((C0055.f55 - (C0006.f6 % 2827)) >= 0) goto L15;
        r2 = (C0035.f35 % C0049.f49) + 1752493;
        goto L3
    L15:
        r2 = C0046.m186("ۤۦۤ");
        goto L3
    L17:
        this.c = r6;
        if ((C0069.f69 % (C0021.f21 + 8816)) < 0) goto L10;
        C0017.f17 = 7;
    L20:
        r2 = C0044.m176("ۦۢۤ");
        goto L3
    L21:
        System.out.println(r1);
        if (C0073.m295() <= 0) goto L23;
        r2 = (C0062.f62 * C0039.f39) + 1272599;
        goto L3
    L23:
        r2 = C0005.m23("۠ۧۧ");
        goto L3
    L25:
        this.b = r4;
        goto L20
    L26:
        Long r02 = Long.valueOf(C0069.m279("jsrS4U4qU3W"));
        if ((C0000.f0 + (C0049.f49 + 1420)) <= 0) goto L28;
        r2 = 1751784 + (C0022.f22 % C0020.f20);
        r1 = r02;
        goto L3
    L28:
        C0051.f51 = 12;
        r2 = C0034.m138("۠ۥۧ");
        r1 = r02;
        goto L3
    L30:
        r2 = (C0033.f33 - C0066.f66) ^ (-1750085);
        goto L3
    }

    public /* synthetic */ pd(lg r4, int r5, Object r6) {
        this.a = 1;
        int r1 = 0;
        int r0 = C0050.m203("۠ۧ");
    L3:
        switch(r0) {
            case 56327: goto L5;
            case 56420: goto L9;
            case 1749668: goto L13;
            case 1750660: goto L33;
            case 1750756: goto L22;
            case 1751678: goto L18;
            case 1755403: goto L25;
            case 1755555: goto L35;
            case 1755562: goto L28;
            default: goto L3;
        };
    L5:
        this.d = r4;
        if (C0069.m276() >= 0) goto L7;
        r0 = (C0049.f49 * C0005.f5) + 1745848;
        goto L3
    L7:
        r0 = C0069.m277("۠ۧ");
    L9:
        if (C0055.f55 >= 0) goto L10;
        String r02 = "ۨۦۡ";
    L12:
        r0 = C0005.m23(r02);
        goto L3
    L10:
        C0047.f47 = 59;
        r0 = C0049.m197("ۨۦ۟");
        goto L3
    L13:
        this.c = r6;
        if (C0035.m143() > 0) goto L16;
        C0000.f0 = 60;
    L16:
        String r03 = "ۣۣۤ";
    L17:
        r0 = C0033.m132(r03);
        goto L3
    L18:
        this.b = r5;
        if ((C0015.f15 - (C0006.f6 / 5281)) >= 0) goto L20;
    L20:
        String r04 = "ۢۢۤ";
    L21:
        r0 = C0053.m213(r04);
        goto L3
    L22:
        r1 = Integer.parseInt(C0055.m222("SnEWUbidgWuUZ1Xd8aS"));
        r04 = "ۨۦۨ";
        goto L21
    L25:
        if (C0051.m206() < 0) goto L27;
        C0001.m4();
        r02 = "۟۟";
        goto L12
    L27:
        r02 = "۠ۧ";
        goto L12
    L28:
        System.out.println(r1);
        if (C0046.m185() > 0) goto L31;
        r0 = C0008.m35("ۨۦۨ");
        goto L3
    L31:
        r03 = "ۨۦۡ";
        goto L17
    L33:
        if (C0059.m236() > 0) goto L9;
        r0 = (C0071.f71 | C0068.f68) + 1751305;
        goto L3
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView r19 = null;
        ListAdapter r16 = null;
        ListAdapter r4 = null;
        ListAdapter r23 = null;
        ListAdapter r8 = null;
        Class<?> r12 = null;
        boolean r11 = false;
        Field[] r14 = null;
        int r28 = 0;
        int r13 = 0;
        Field r17 = null;
        Object r3 = null;
        int r30 = 0;
        Class<? super Object> r21 = null;
        String r18 = null;
        int r15 = 0;
        Method[] r20 = null;
        int r27 = 0;
        int r10 = 0;
        Method r5 = null;
        int r26 = 0;
        int r9 = 0;
        int r29 = C0008.m35("ۥۣۦ");
        Class<?>[] r22 = null;
        Class<?> r24 = null;
        ListAdapter r25 = null;
    L3:
        switch(r29) {
            case 56322: goto L6;
            case 56323: goto L135;
            case 56353: goto L315;
            case 56449: goto L90;
            case 56474: goto L36;
            case 56483: goto L51;
            case 56512: goto L90;
            case 56544: goto L175;
            case 56568: goto L267;
            case 56571: goto L330;
            case 56573: goto L77;
            case 1746690: goto L238;
            case 1746691: goto L201;
            case 1746726: goto L288;
            case 1746758: goto L337;
            case 1746812: goto L63;
            case 1746815: goto L49;
            case 1746819: goto L259;
            case 1746969: goto L152;
            case 1746972: goto L50;
            case 1747716: goto L34;
            case 1747743: goto L291;
            case 1747811: goto L265;
            case 1747867: goto L188;
            case 1747869: goto L130;
            case 1747903: goto L192;
            case 1747933: goto L172;
            case 1748611: goto L101;
            case 1748618: goto L128;
            case 1748672: goto L253;
            case 1748740: goto L188;
            case 1748768: goto L207;
            case 1748827: goto L122;
            case 1748897: goto L341;
            case 1749604: goto L230;
            case 1749641: goto L37;
            case 1749697: goto L225;
            case 1749727: goto L87;
            case 1749764: goto L49;
            case 1749789: goto L168;
            case 1749855: goto L269;
            case 1750598: goto L55;
            case 1750602: goto L235;
            case 1750626: goto L221;
            case 1750655: goto L239;
            case 1750663: goto L153;
            case 1750686: goto L319;
            case 1750717: goto L215;
            case 1750779: goto L213;
            case 1751493: goto L63;
            case 1751495: goto L282;
            case 1751679: goto L113;
            case 1751683: goto L24;
            case 1751686: goto L91;
            case 1751713: goto L168;
            case 1751714: goto L250;
            case 1751718: goto L182;
            case 1752548: goto L67;
            case 1752580: goto L238;
            case 1752584: goto L126;
            case 1752586: goto L70;
            case 1752612: goto L340;
            case 1752639: goto L141;
            case 1752642: goto L81;
            case 1752709: goto L16;
            case 1752735: goto L305;
            case 1752736: goto L327;
            case 1753510: goto L44;
            case 1753600: goto L246;
            case 1753631: goto L294;
            case 1753664: goto L24;
            case 1753697: goto L208;
            case 1754377: goto L117;
            case 1754410: goto L340;
            case 1754412: goto L274;
            case 1754414: goto L261;
            case 1754445: goto L343;
            case 1754470: goto L255;
            case 1754471: goto L313;
            case 1754503: goto L323;
            case 1754508: goto L159;
            case 1754535: goto L105;
            case 1754593: goto L311;
            case 1754597: goto L147;
            case 1755375: goto L330;
            case 1755431: goto L330;
            case 1755584: goto L197;
            case 1755615: goto L95;
            case 1755619: goto L300;
            default: goto L3;
        };
    L6:
        if ((C0023.f23 ^ (C0018.f18 / (-9208))) <= 0) goto L7;
        r29 = (C0009.f9 % C0065.f65) + 1754456;
        goto L3
    L7:
        String r2 = "ۣ۠ۥ";
        Field[] r6 = r14;
    L8:
        r14 = r6;
        r29 = C0024.m98(r2);
        goto L3
    L341:
        XposedHelpers.callMethod(r8, r18, new Object[0]);     // Catch: Throwable -> L162
        if ((C0055.f55 | (C0069.f69 ^ (-4925))) >= 0) goto L13;
        r29 = (C0017.f17 + C0042.f42) + 1750771;
        goto L3
    L13:
        r29 = C0025.m102("۠ۦۣ");
    L164:
        if (C0062.f62 >= 0) goto L165;
        r29 = C0064.m258("ۢۦۡ");
        goto L3
    L165:
        r29 = C0011.m45("ۦۧۡ");
        goto L3
    L16:
        if (r30 >= r28) goto L49;
        Field r210 = r14[r30];     // Catch: Throwable -> L331
        if ((C0035.f35 - (C0068.f68 ^ (-5127))) >= 0) goto L20;
        String r62 = r18;
    L22:
        r17 = r210;
        r18 = r62;
        r29 = C0011.m45("ۥۥۢ");
        goto L3
    L20:
        C0027.f27 = 11;
        r17 = r210;
        r29 = C0058.m234("ۥۥ۟");
    L333:
        if (C0007.f7 <= 0) goto L334;
        r29 = (C0024.f24 ^ C0033.f33) + 1746602;
        goto L3
    L334:
        C0030.m121();
        r29 = C0059.m239("ۧۧ");
        goto L3
    L24:
        if ((C0040.f40 - (C0006.f6 / 858)) <= 0) goto L25;
        String r211 = "ۥۧۧ";
    L28:
        r29 = C0004.m16(r211);
        goto L3
    L25:
        C0006.m24();
        String r212 = "ۡۢۧ";
        int r63 = r9;
    L26:
        r29 = C0011.m45(r212);
        r9 = r63;
        goto L3
    L343:
        r5.invoke(r8, null);     // Catch: Throwable -> L52
        if (C0058.m232() <= 0) goto L33;
    L84:
        r29 = C0007.m28("ۢۡۨ");
        goto L3
    L33:
        r29 = C0031.m127("ۥۣۤ");
    L53:
        String r213 = "ۤ۟۠";
    L54:
        r29 = C0063.m254(r213);
        goto L3
    L34:
        r10 = 0;
        String r214 = "ۣۥ۟";
        boolean r64 = r11;
    L35:
        r11 = r64;
        r29 = C0042.m170(r214);
    L36:
        r29 = C0033.m132("ۣۡۤ");
        goto L3
    L37:
        r9 = r9 + (C0045.f45 ^ (-295));
        if (C0033.f33 > 0) goto L42;
        C0042.m169();
    L40:
        String r215 = "ۧۦۤ";
    L41:
        r29 = C0038.m153(r215);
        goto L3
    L42:
        r215 = "۟ۨۢ";
    L44:
        if ((C0053.f53 - (C0018.f18 % (-3668))) >= 0) goto L45;
        String r216 = "ۣ۟۟";
    L48:
        r29 = C0066.m264(r216);
        goto L3
    L45:
        C0008.f8 = 50;
        String r217 = "ۥۨۧ";
    L46:
        r29 = C0060.m241(r217);
    L49:
        r29 = C0051.m207("ۨۥ");
        goto L3
    L50:
        r29 = (C0053.f53 + C0007.f7) + 1752170;
        r30 = r13;
        goto L3
    L51:
        r29 = (C0004.f4 - C0023.f23) + 1755687;
        goto L3
    L55:
        if (r8 == null) goto L238;
        Class<?> r65 = r8.getClass();     // Catch: Throwable -> L142
        if (C0032.m128() >= 0) goto L59;
        String r218 = "ۤۥ۠";
    L61:
        r12 = r65;
        r29 = C0026.m105(r218);
        goto L3
    L59:
        C0029.m118();
        r12 = r65;
        r29 = C0041.m164("ۤۥ");
    L144:
        if (C0026.f26 > 0) goto L146;
        C0002.m10();
        r29 = C0046.m186("ۡۨۨ");
        goto L3
    L146:
        r217 = "۟۟ۢ";
    L63:
        if ((C0070.f70 ^ (C0032.f32 / 6321)) <= 0) goto L64;
        r29 = (C0015.f15 / C0005.f5) ^ (-1749647);
        goto L3
    L64:
        r29 = C0034.m138("ۢۥۦ");
        goto L3
    L67:
        if (C0017.f17 <= 0) goto L68;
        r8 = r23;
        r29 = (C0007.f7 * C0039.f39) + 1994972;
        goto L3
    L68:
        r8 = r23;
        r29 = C0055.m220("ۡۡ۠");
        goto L3
    L70:
        if (r11 == true) goto L44;
        if ((C0009.f9 + (C0003.f3 ^ (-182))) >= 0) goto L73;
        Method r219 = r5;
    L75:
        Object r66 = "ۨۨ۟";
        Method r7 = r219;
    L76:
        r5 = r7;
        r29 = C0034.m138(r66);
        goto L3
    L73:
        r29 = C0013.m53("ۧۢۡ");
        goto L3
    L77:
        Class<? super Object> r67 = r24.getSuperclass();     // Catch: Throwable -> L142
        String r220 = "ۣۣۧ";
    L79:
        r21 = r67;
        r29 = C0041.m164(r220);
        goto L3
    L81:
        r17.setAccessible(true);     // Catch: Throwable -> L331
        r3 = r17.get(r8);     // Catch: Throwable -> L331
        if (C0001.f1 >= 0) goto L84;
        String r221 = "۟۠ۧ";
        int r68 = r15;
    L86:
        r15 = r68;
        r29 = C0065.m263(r221);
        goto L3
    L87:
        ListView r222 = (ListView) this.d;
        ff.y = this.b;
        if (C0073.m295() <= 0) goto L89;
    L217:
        String r69 = "ۨۧ۟";
    L218:
        r19 = r222;
        r29 = C0016.m65(r69);
        goto L3
    L89:
        r19 = r222;
        r29 = C0030.m120("ۦۣۨ");
        goto L3
    L90:
        r29 = (C0055.f55 ^ C0027.f27) + 1752657;
        goto L3
    L91:
        lg r223 = (lg) this.d;
        r223.b.i(this.b, this.c);
        if ((C0063.f63 - (C0056.f56 - 106)) <= 0) goto L93;
        r29 = (C0030.f30 / C0048.f48) ^ 1752612;
        goto L3
    L93:
        C0042.f42 = 65;
        r29 = C0015.m60("ۤۦۨ");
        goto L3
    L95:
        r6 = r24.getDeclaredFields();     // Catch: Throwable -> L331
        if (C0003.f3 > 0) goto L99;
        r14 = r6;
        r29 = C0043.m173("ۣۥ۟");
        goto L3
    L99:
        r2 = "ۣ۠";
        goto L8
    L101:
        if (C0037.m150() <= 0) goto L102;
        String r224 = "ۥۣۨ";
    L104:
        r29 = C0068.m272(r224);
        goto L3
    L102:
        C0034.m137();
        r216 = "ۣ۟ۦ";
        goto L48
    L105:
        if (r25 != null) goto L250;
        ListAdapter r610 = vd.d;     // Catch: Throwable -> L142
        if (C0060.f60 <= 0) goto L109;
        String r225 = "ۡۡ۠";
    L111:
        r16 = r610;
        r29 = C0034.m138(r225);
        goto L3
    L109:
        C0036.m147();
        r16 = r610;
        r29 = C0063.m254("ۣۤ۟");
        goto L3
    L113:
        if ((C0055.f55 | (C0058.f58 % 7922)) >= 0) goto L114;
        r24 = r12;
        r29 = (C0038.f38 * C0031.f31) ^ 1727354;
        goto L3
    L114:
        C0021.m84();
        r24 = r12;
        r29 = C0040.m160("ۨۥ");
    L117:
        if (C0031.m124() <= 0) goto L118;
        r29 = (C0070.f70 ^ C0016.f16) + 1748699;
        goto L3
    L118:
        String r226 = "ۥۤۡ";
    L119:
        r29 = C0056.m226(r226);
        goto L3
    L122:
        if ((C0006.f6 * (C0021.f21 % (-1762))) < 0) goto L124;
        r8 = r4;
        r29 = C0036.m144("ۢۤۡ");
        goto L3
    L124:
        r66 = "ۧ۠ۧ";
        r7 = r5;
        r8 = r4;
        goto L76
    L126:
        switch(this.a) {
            case 0: goto L327;
            default: goto L128;
        };
    L128:
        if ((C0001.f1 - (C0004.f4 + 3645)) >= 0) goto L129;
        r29 = C0037.m149("ۤۥۧ");
        goto L3
    L129:
        C0014.f14 = 43;
        r211 = "ۦۥۡ";
        goto L28
    L130:
        r64 = r24.getName().equals(u40.a("zrTH1cwUodDD+/7WiB2jyg==\n", "pNWxtOJ4wL4=\n"));     // Catch: Throwable -> L142
        if ((C0044.f44 / (C0028.f28 | 3566)) != 0) goto L133;
        r11 = r64;
        r29 = (C0004.f4 - C0049.f49) + 1753301;
        goto L3
    L133:
        C0007.m31();
        r214 = "ۣ۟۟";
        goto L35
    L135:
        ip.n(u40.a("byVnzG9sYxx6JXfOY2pjGXtoPaYkJg==\n", "CEATiAoPD30=\n"), r14);     // Catch: Throwable -> L331
        int r227 = r14.length;     // Catch: Throwable -> L331
        if (C0047.m191() >= 0) goto L138;
        r28 = r227;
        r29 = (C0005.f5 / C0019.f19) ^ 1754509;
        goto L3
    L138:
        C0029.f29 = 61;
        r28 = r227;
        r29 = C0036.m144("ۣ۠");
        goto L3
    L141:
        r25 = r19.getAdapter();     // Catch: Throwable -> L142
        r29 = (C0073.f73 % C0019.f19) ^ 1750596;
        goto L3
    L147:
        ((HashMap) r3).clear();     // Catch: Throwable -> L331
        if (C0003.f3 > 0) goto L151;
        C0010.m40();
        r29 = C0021.m86("ۧۤۤ");
        goto L3
    L151:
        r224 = "ۧۢۡ";
        goto L104
    L152:
        r66 = "ۣۡۦ";
        r7 = r5;
        goto L76
    L153:
        Method[] r611 = r8.getClass().getMethods();     // Catch: Throwable -> L142
        if ((C0040.f40 * (C0033.f33 * 8554)) > 0) goto L157;
        C0019.f19 = 84;
        r20 = r611;
        r29 = C0018.m73("ۣ۟ۧ");
        goto L3
    L157:
        String r228 = "ۥۨۢ";
    L158:
        r20 = r611;
        r29 = C0062.m249(r228);
        goto L3
    L159:
        int r229 = 0;
        if (C0043.f43 <= 0) goto L161;
    L179:
        r29 = C0045.m182("۟ۨۥ");
        r13 = r229;
        goto L3
    L161:
        r29 = C0029.m116("ۥۢۡ");
        r13 = 0;
    L168:
        if (C0023.m92() >= 0) goto L169;
        r29 = C0033.m132("ۣۣۧ");
        goto L3
    L169:
        r218 = "ۢۢ۟";
        r65 = r12;
        goto L61
    L172:
        if (C0068.f68 >= 0) goto L173;
        r29 = (C0041.f41 + C0064.f64) + 1753074;
        goto L3
    L173:
        C0009.m36();
        r29 = C0072.m288("ۥۣۨ");
        goto L3
    L175:
        ip.n(u40.a("AmY3lpiMoBYAdya0rYexHhYrbejX1w==\n", "ZQNDxvn+wXs=\n"), r22);     // Catch: Throwable -> L142
        if ((C0018.f18 | (C0005.f5 % (-7590))) <= 0) goto L178;
        r29 = (C0034.f34 / C0011.f11) + 1754590;
        goto L3
    L178:
        r229 = r13;
        goto L179
    L182:
        r68 = r18.length();     // Catch: Throwable -> L142
        if ((C0071.f71 - (C0004.f4 / (-2798))) >= 0) goto L185;
        r15 = r68;
        r29 = (C0024.f24 * C0040.f40) + 1752888;
        goto L3
    L185:
        r221 = "ۣۨ";
        goto L86
    L188:
        if (C0003.f3 <= 0) goto L189;
        r29 = C0013.m53("ۤ۟ۢ");
        goto L3
    L189:
        r29 = C0064.m258("ۦۢۦ");
        goto L3
    L192:
        if (r26 > 3) goto L63;
        if ((C0000.f0 + (C0008.f8 / 1924)) <= 0) goto L195;
        r29 = (C0000.f0 - C0071.f71) + 1753284;
        goto L3
    L195:
        C0031.m124();
        r225 = "ۨ۠ۧ";
        r610 = r16;
        goto L111
    L197:
        r19.setSelection(0);
        if ((C0035.f35 * (C0040.f40 - 2463)) >= 0) goto L199;
        r29 = (C0031.f31 ^ C0064.f64) + 1752871;
        goto L3
    L199:
        C0036.m147();
        r29 = C0034.m138("ۥ۟");
        goto L3
    L201:
        r62 = pb0.z1;     // Catch: Throwable -> L142
        if (C0070.f70 <= 0) goto L204;
        r18 = r62;
        r29 = C0009.m38("ۤۦۨ");
        goto L3
    L204:
        r210 = r17;
        goto L22
    L207:
        r26 = r5.getName().length();     // Catch: Throwable -> L142
        r29 = (C0020.f20 - C0036.f36) ^ (-1748958);
        goto L3
    L208:
        ((LinkedHashMap) r3).clear();     // Catch: Throwable -> L331
        if (C0064.f64 > 0) goto L212;
        C0047.m191();
        r29 = C0034.m138("۟۠ۧ");
        goto L3
    L212:
        r216 = "ۣۧ۟";
        goto L48
    L213:
        int r612 = r30 + (C0025.f25 ^ (-820));
        r29 = C0066.m264("۠ۨۥ");
        r30 = r612;
        goto L3
    L215:
        if ((C0072.f72 - (C0025.f25 % 2448)) > 0) goto L219;
        r222 = r19;
        r9 = r10;
        goto L217
    L219:
        r212 = "ۤ۟ۢ";
        r63 = r10;
        goto L26
    L221:
        if (C0018.f18 <= 0) goto L222;
        r29 = (C0004.f4 - C0008.f8) + 1748658;
        goto L3
    L222:
        r213 = "ۤۨۢ";
        goto L54
    L225:
        if ((r3 instanceof HashMap) == false) goto L319;
        if (C0020.f20 < 0) goto L40;
        r29 = C0068.m272("ۢۥۧ");
    L230:
        if ((C0056.f56 | (C0049.f49 ^ (-1402))) >= 0) goto L231;
        String r230 = "ۨ۠";
    L233:
        r29 = C0013.m53(r230);
        goto L3
    L231:
        C0030.m121();
        r29 = C0026.m105("ۤ۟");
        goto L3
    L235:
        if (C0064.m257() >= 0) goto L236;
        r4 = r25;
        r29 = (C0013.f13 + C0056.f56) ^ (-1754949);
        goto L3
    L236:
        C0021.f21 = 40;
        r4 = r25;
        r29 = C0045.m182("ۧ۟ۡ");
    L238:
        r29 = (C0050.f50 + C0025.f25) + 1755192;
        goto L3
    L239:
        ((SparseArray) r3).clear();     // Catch: Throwable -> L331
        if (C0042.f42 >= 0) goto L242;
        r29 = C0025.m102("ۣ۟ۧ");
        goto L3
    L242:
        String r231 = "ۤ۟ۢ";
    L243:
        r29 = C0013.m53(r231);
        goto L3
    L246:
        if (C0070.m280() < 0) goto L248;
        r228 = "ۤ۠ۨ";
        r611 = r20;
        goto L158
    L248:
        r228 = "ۥۣۦ";
        r611 = r20;
    L250:
        if ((C0052.f52 ^ (C0031.f31 | 9654)) >= 0) goto L251;
        r228 = "ۡۦ۠";
        r611 = r20;
        goto L158
    L251:
        r224 = "ۣۨ۟";
        goto L104
    L253:
        r4 = r16;
        r29 = (C0065.f65 / C0016.f16) + 1748828;
        goto L3
    L255:
        if ((C0058.f58 ^ (C0071.f71 % (-135))) >= 0) goto L256;
        r29 = C0021.m86("ۣۨ");
        goto L3
    L256:
        C0073.f73 = 32;
        r220 = "ۦۦ۟";
        r67 = r21;
        goto L79
    L259:
        r29 = (C0063.f63 - C0037.f37) + 1754739;
        goto L3
    L261:
        if ((r4 instanceof HeaderViewListAdapter) == false) goto L36;
        r23 = ((HeaderViewListAdapter) r4).getWrappedAdapter();     // Catch: Throwable -> L142
        r29 = C0051.m207("ۥۢۡ");
        goto L3
    L265:
        if ((r3 instanceof LinkedHashMap) == false) goto L330;
        r29 = (C0030.f30 % C0009.f9) + 1753553;
        goto L3
    L267:
        XposedHelpers.callMethod(r8, u40.a("Mf5SJsSXUVMr8HUq1q19UzH2Qys=\n", "X5EmT6LuFTI=\n"), new Object[0]);     // Catch: Throwable -> L142
        r231 = "ۣۧ۠";
        goto L243
    L269:
        Class<?>[] r232 = r5.getParameterTypes();     // Catch: Throwable -> L142
        if ((C0037.f37 * (C0040.f40 / 1205)) != 0) goto L272;
        r22 = r232;
        r29 = C0015.m60("ۧۧ");
        goto L3
    L272:
        C0024.f24 = 34;
        r22 = r232;
        r29 = C0038.m153("ۣۧ۠");
        goto L3
    L274:
        if (r15 <= 0) goto L168;
        if (C0020.f20 >= 0) goto L277;
        String r233 = "ۡۨۨ";
    L280:
        r29 = C0022.m90(r233);
        goto L3
    L277:
        C0052.m210();
        Object r613 = "ۣۣۧ";
        Method r72 = r5;
    L278:
        r5 = r72;
        r29 = C0007.m28(r613);
        goto L3
    L282:
        if (r9 >= r27) goto L230;
        r219 = r20[r9];     // Catch: Throwable -> L142
        if (C0013.m52() >= 0) goto L75;
        r613 = "ۢۨۥ";
        r72 = r219;
        goto L278
    L288:
        if ((r3 instanceof SparseArray) == false) goto L117;
        r29 = (C0027.f27 * C0048.f48) + 1884884;
        goto L3
    L291:
        if (C0067.f67 >= 0) goto L292;
        r29 = (C0044.f44 + C0025.f25) + 1753103;
        goto L3
    L292:
        r29 = C0039.m159("ۣۡۡ");
        goto L3
    L294:
        if (r24 == null) goto L44;
        if (C0008.m33() > 0) goto L298;
        r29 = C0023.m95("۠ۢ");
        goto L3
    L298:
        r226 = "۠ۦۣ";
        goto L119
    L300:
        if (ip.i(r5.getReturnType(), Void.TYPE) == false) goto L63;
        if (C0028.f28 >= 0) goto L303;
        r29 = (C0009.f9 + C0041.f41) + 1749186;
        goto L3
    L303:
        r29 = C0030.m120("ۥۣۦ");
        goto L3
    L305:
        ip.n(u40.a("4acuH6uO3vrisXJ84NSf\n", "hsJaUs76tpU=\n"), r20);     // Catch: Throwable -> L142
        int r234 = r20.length;     // Catch: Throwable -> L142
        if ((C0006.f6 | (C0060.f60 / 8152)) <= 0) goto L308;
        r27 = r234;
        r29 = (C0000.f0 * C0040.f40) + 1474412;
        goto L3
    L308:
        r27 = r234;
        r29 = C0031.m127("ۨۢۡ");
        goto L3
    L311:
        if (r22.length != 0) goto L63;
        r69 = "ۣۨۨ";
        r222 = r19;
        goto L218
    L313:
        r29 = (C0024.f24 | C0026.f26) + 55701;
        goto L3
    L315:
        if (C0016.f16 <= 0) goto L316;
        r29 = (C0041.f41 - C0028.f28) + 1746882;
        goto L3
    L316:
        C0019.f19 = 38;
        r233 = "ۣۧۤ";
    L319:
        if ((C0005.f5 - (C0057.f57 % 9840)) <= 0) goto L320;
        r29 = (C0047.f47 - C0050.f50) + 1747858;
        goto L3
    L320:
        C0066.m265();
        r29 = C0062.m249("ۣۣۤ");
        goto L3
    L323:
        if (C0027.f27 >= 0) goto L324;
        r24 = r21;
        r29 = (C0047.f47 - C0008.f8) + 1753582;
        goto L3
    L324:
        C0035.f35 = 24;
        r24 = r21;
        r29 = C0007.m28("۠ۢۡ");
    L327:
        if (C0056.f56 >= 0) goto L328;
        r29 = (C0027.f27 ^ C0031.f31) + 1749263;
        goto L3
    L328:
        r29 = C0011.m45("۠۠۟");
    L330:
        r230 = "ۣۧ۟";
        goto L233
    L337:
        if (C0073.f73 <= 0) goto L338;
        r29 = (C0037.f37 % C0031.f31) + 1755700;
        goto L3
    L338:
        C0068.m273();
        r230 = "ۧۤۧ";
        goto L233
    }
}
