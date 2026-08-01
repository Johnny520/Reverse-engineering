package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.view.C0007;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
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
import io.fastkv.C0068;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class nv extends BaseAdapter {
    public final Context a;
    public List b;
    public final LinkedHashSet c;
    public final kv d;
    public final pv e;
    public final boolean f;
    public final iv g;
    public final ConcurrentHashMap h;

    public nv(Context r5, ArrayList r6, LinkedHashSet r7, kv r8, kv r9, pv r10, boolean r11, iv r12) {
        "context";
        "dataList";
        "selectedSet";
        "dp";
        "dpf";
        "theme";
        "onSelectChange";
        double r2 = 0.0d;
        int r0 = C0003.m13("ۡۨۦ");
    L3:
        switch(r0) {
            case 1746936: goto L5;
            case 1747684: goto L21;
            case 1747904: goto L48;
            case 1748612: goto L19;
            case 1748895: goto L29;
            case 1749764: goto L14;
            case 1750593: goto L11;
            case 1750600: goto L10;
            case 1752703: goto L8;
            case 1753511: goto L38;
            case 1753662: goto L26;
            case 1753702: goto L33;
            case 1754474: goto L44;
            case 1755616: goto L49;
            default: goto L3;
        };
    L5:
        this.c = r7;
        if ((C0067.f67 | (C0034.f34 - 3994)) >= 0) goto L7;
        r0 = (C0062.f62 / C0072.f72) + 1752702;
        goto L3
    L7:
        C0067.f67 = 81;
        r0 = C0014.m57("ۡ۟ۢ");
        goto L3
    L8:
        this.d = r8;
    L9:
        r0 = C0037.m149("ۣۡۦ");
        goto L3
    L10:
        this.e = r10;
        r0 = (C0035.f35 % C0009.f9) + 1749131;
        goto L3
    L11:
        this.h = new ConcurrentHashMap();
        if (C0071.f71 >= 0) goto L13;
    L16:
        r0 = C0059.m239("ۦۣۢ");
        goto L3
    L13:
        C0018.f18 = 10;
        r0 = C0005.m23("ۡۨۦ");
        goto L3
    L14:
        this.f = r11;
        if ((C0053.f53 - (C0003.f3 + 336)) >= 0) goto L16;
        String r02 = "ۡ۟ۢ";
    L18:
        r0 = C0012.m50(r02);
        goto L3
    L19:
        this.g = r12;
        r02 = "ۣۡ۟";
        goto L18
    L21:
        System.out.println(r2);
        if (C0065.f65 >= 0) goto L23;
        r0 = (C0044.f44 ^ C0005.f5) ^ 1755369;
        goto L3
    L23:
        r0 = C0064.m258("۠ۧۧ");
    L26:
        if ((C0021.f21 ^ (C0058.f58 / 2287)) >= 0) goto L27;
        r0 = (C0005.f5 / C0026.f26) + 1755616;
        goto L3
    L27:
        r0 = C0052.m209("ۦۤۨ");
        goto L3
    L29:
        this.a = r5;
        if (C0026.m106() <= 0) goto L31;
        r0 = (C0054.f54 + C0011.f11) ^ 1754014;
        goto L3
    L31:
        C0032.m128();
        r0 = C0049.m197("ۢۥۧ");
        goto L3
    L33:
        this.b = r6;
        if ((C0012.f12 + (C0021.f21 / 4864)) <= 0) goto L35;
        r0 = C0032.m130("۟ۧ۠");
        goto L3
    L35:
        C0001.f1 = 75;
        r02 = "ۦۧ۟";
        goto L18
    L38:
        if (C0003.m14() < 0) goto L26;
        if (C0024.f24 <= 0) goto L41;
        r0 = (C0071.f71 | C0059.f59) ^ (-1747339);
        goto L3
    L41:
        C0040.m162();
        goto L9
    L44:
        if (C0053.f53 > 0) goto L47;
        C0007.m31();
        String r03 = "ۡۤۡ";
    L46:
        r0 = C0056.m226(r03);
        goto L3
    L47:
        r03 = "ۡۨۦ";
        goto L46
    L48:
        r2 = Double.parseDouble(C0052.m211("qUnv8gZIqC"));
        r0 = C0048.m193("۠۠ۤ");
        goto L3
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r2) {
        int r0 = C0065.m263("ۢۡ");
    L3:
        switch(r0) {
            case 56383: goto L6;
            case 1749732: goto L7;
            default: goto L3;
        };
    L6:
        return this.b.get(r2);
    L7:
        r0 = C0033.m132("ۢۡ");
        goto L3
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        int r0 = C0016.m65("ۣۨۨ");
    L3:
        switch(r0) {
            case 1748611: goto L5;
            case 1755469: goto L7;
            default: goto L3;
        };
    L5:
        r0 = C0009.m38("ۣۨۨ");
        goto L3
    L7:
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r63, View r64, ViewGroup r65) {
        Integer r42 = null;
        Integer r41 = null;
        Integer r38 = null;
        Integer r39 = null;
        int r43 = 0;
        Integer r40 = null;
        pv r51 = null;
        kv r52 = null;
        Context r49 = null;
        LinearLayout r5 = null;
        View r6 = null;
        TextView r7 = null;
        LinearLayout.LayoutParams r12 = null;
        LinearLayout r20 = null;
        TextView r8 = null;
        TextView r9 = null;
        mv r32 = null;
        LinearLayout r45 = null;
        mv r31 = null;
        TextView r26 = null;
        View r25 = null;
        ov r28 = null;
        TextView r29 = null;
        String r27 = null;
        String r18 = null;
        TextView r14 = null;
        String r17 = null;
        String r37 = null;
        String r53 = null;
        Locale r50 = null;
        String r35 = null;
        String r23 = null;
        ConcurrentHashMap r46 = null;
        Object r24 = null;
        b70 r47 = null;
        boolean r48 = false;
        int r36 = 0;
        int r15 = 0;
        int r34 = 0;
        int r16 = 0;
        Object r19 = null;
        Object r10 = null;
        GradientDrawable r44 = null;
        w0 r22 = null;
        w0 r21 = null;
        w0 r33 = null;
        int r54 = C0025.m102("ۦۣۢ");
        GradientDrawable r57 = null;
        int r58 = 0;
        int r59 = 0;
        int r60 = 0;
        int r61 = 0;
    L3:
        switch(r54) {
            case 56292: goto L6;
            case 56293: goto L96;
            case 56322: goto L43;
            case 56357: goto L52;
            case 56383: goto L218;
            case 56414: goto L156;
            case 56476: goto L133;
            case 56507: goto L166;
            case 56572: goto L128;
            case 1746752: goto L17;
            case 1746754: goto L118;
            case 1746783: goto L106;
            case 1746877: goto L90;
            case 1746882: goto L115;
            case 1746972: goto L101;
            case 1747680: goto L210;
            case 1747712: goto L191;
            case 1747714: goto L75;
            case 1747866: goto L207;
            case 1747935: goto L136;
            case 1748644: goto L217;
            case 1748709: goto L174;
            case 1748740: goto L80;
            case 1748827: goto L20;
            case 1748832: goto L89;
            case 1748858: goto L37;
            case 1748892: goto L140;
            case 1749607: goto L115;
            case 1749697: goto L232;
            case 1749702: goto L125;
            case 1749760: goto L238;
            case 1749765: goto L249;
            case 1749793: goto L180;
            case 1749818: goto L26;
            case 1749821: goto L31;
            case 1749827: goto L40;
            case 1750533: goto L125;
            case 1750536: goto L152;
            case 1750568: goto L109;
            case 1750689: goto L66;
            case 1750756: goto L26;
            case 1751492: goto L53;
            case 1751530: goto L49;
            case 1751563: goto L245;
            case 1751686: goto L201;
            case 1751749: goto L228;
            case 1752484: goto L144;
            case 1752577: goto L171;
            case 1752615: goto L213;
            case 1752617: goto L184;
            case 1752642: goto L190;
            case 1752707: goto L40;
            case 1752738: goto L59;
            case 1753514: goto L190;
            case 1753539: goto L195;
            case 1753541: goto L187;
            case 1753547: goto L217;
            case 1753572: goto L134;
            case 1753608: goto L104;
            case 1753670: goto L136;
            case 1753694: goto L115;
            case 1754470: goto L241;
            case 1754532: goto L71;
            case 1754592: goto L86;
            case 1754594: goto L92;
            case 1754660: goto L64;
            case 1755401: goto L9;
            case 1755404: goto L139;
            case 1755462: goto L161;
            case 1755499: goto L12;
            case 1755531: goto L223;
            case 1755559: goto L207;
            case 1755622: goto L237;
            default: goto L3;
        };
    L6:
        if (C0022.f22 >= 0) goto L7;
        r54 = (C0069.f69 / C0017.f17) + 1748892;
        goto L3
    L7:
        C0066.m265();
        String r11 = "۟ۡۨ";
    L8:
        r54 = C0018.m73(r11);
        goto L3
    L9:
        TextView r4 = r14;
    L10:
        String r112 = "ۤ۠ۦ";
        r14 = r4;
    L11:
        r54 = C0053.m213(r112);
        goto L3
    L12:
        GradientDrawable r113 = new GradientDrawable();
        r113.setShape(1);
        r113.setColor(0);
        r113.setStroke(((Number) r52.f(Integer.valueOf(C0064.f64 ^ 143))).intValue(), r51.g);
        r25.setBackground(r113);
        w0 r13 = null;
        if ((C0011.f11 * (C0028.f28 + 4859)) >= 0) goto L14;
        String r114 = "ۥۨۥ";
    L16:
        r21 = r13;
        r54 = C0047.m189(r114);
        goto L3
    L14:
        C0006.f6 = 40;
        r21 = null;
        r54 = C0035.m140("ۣۢۢ");
        goto L3
    L17:
        String r410 = "ۦۣ۠";
        w0 r115 = r33;
        r16 = r34;
    L18:
        r33 = r115;
        r54 = C0060.m241(r410);
        goto L3
    L20:
        if (C0032.f32 >= 0) goto L21;
        r54 = (C0019.f19 + C0047.f47) + 1753464;
        goto L3
    L21:
        C0033.f33 = 67;
        int r411 = r15;
        int r116 = r16;
    L22:
        String r132 = "ۡۦ۠";
        r15 = r411;
    L23:
        r54 = C0005.m23(r132);
        r16 = r116;
        goto L3
    L26:
        if (C0023.m92() >= 0) goto L27;
        r54 = (C0037.f37 + C0021.f21) + 1756582;
        goto L3
    L27:
        String r412 = "ۤۤۥ";
        Object r117 = r19;
    L28:
        r19 = r117;
        r54 = C0055.m220(r412);
        goto L3
    L31:
        if (C0001.m4() <= 0) goto L32;
        String r133 = "۠ۦ۠";
        LinearLayout.LayoutParams r413 = r12;
        View r118 = r6;
    L35:
        r12 = r413;
        r6 = r118;
        r54 = C0040.m160(r133);
        goto L3
    L32:
        LinearLayout r414 = r20;
    L33:
        r114 = "ۥۤۦ";
        r20 = r414;
        r13 = r21;
        goto L16
    L37:
        if (C0072.f72 >= 0) goto L38;
        r23 = r35;
        r54 = (C0018.f18 ^ C0026.f26) + 1746681;
        goto L3
    L38:
        C0066.m265();
        r23 = r35;
        r54 = C0041.m164("ۧۦ۟");
        goto L3
    L40:
        String r415 = "ۨۤ";
    L41:
        r54 = C0063.m254(r415);
        goto L3
    L43:
        if (C0033.m135() >= 0) goto L44;
        String r416 = "ۣۢۧ";
    L47:
        r54 = C0068.m272(r416);
        goto L3
    L44:
        C0047.f47 = 4;
        String r417 = "ۤۧۨ";
        r118 = r6;
    L45:
        r6 = r118;
        r54 = C0048.m193(r417);
        goto L3
    L49:
        if (C0006.f6 > 0) goto L51;
        r17 = r18;
        r54 = C0002.m8("ۢۧۨ");
        goto L3
    L51:
        r132 = "ۥۣ۟";
        r17 = r18;
        r116 = r16;
        goto L23
    L52:
        r54 = (C0050.f50 / C0026.f26) ^ 1749607;
        goto L3
    L53:
        r411 = r47.b(r61);
        if (r48 == true) goto L55;
    L120:
        if ((C0072.f72 % (C0067.f67 % (-7331))) >= 0) goto L121;
        r15 = r411;
        r54 = (C0002.f2 % C0057.f57) ^ 1746673;
        goto L3
    L121:
        C0052.f52 = 45;
        String r119 = "ۥۧ۠";
        r15 = r411;
        int r134 = r36;
    L122:
        r36 = r134;
        r54 = C0052.m209(r119);
        goto L3
    L55:
        r116 = 90;
        if (C0051.f51 < 0) goto L22;
        C0043.f43 = 21;
        r15 = r411;
        r54 = C0041.m164("ۥۣ۟");
        r16 = 90;
        goto L3
    L59:
        if ((C0062.f62 * (C0039.f39 % 9351)) <= 0) goto L60;
        String r418 = "ۣ۟ۤ";
        Locale r1110 = r50;
        r33 = r21;
    L63:
        r50 = r1110;
        r54 = C0063.m254(r418);
        goto L3
    L60:
        w0 r419 = r21;
    L61:
        r33 = r419;
        r54 = C0027.m110("ۨۤ");
        goto L3
    L64:
        if (r48 == false) goto L6;
        r54 = (C0016.f16 - C0032.f32) + 55440;
        r61 = 30;
        goto L3
    L66:
        String r1111 = "#";
        if (C0049.f49 <= 0) goto L68;
        String r420 = "ۡۧ۠";
    L70:
        r35 = r1111;
        r54 = C0015.m60(r420);
        goto L3
    L68:
        C0006.m24();
        r35 = r1111;
        r54 = C0004.m16("ۣۡ");
        goto L3
    L71:
        pv r135 = this.e;
        kv r30 = this.d;
        if (r64 != null) goto L234;
        Context r421 = this.a;
        r5 = new LinearLayout(r421);
        r5.setOrientation(0);
        r1110 = r50;
    L74:
        r54 = C0041.m164("ۣۨۡ");
        r49 = r421;
        r50 = r1110;
        r51 = r135;
        r52 = r30;
    L234:
        if ((C0051.f51 - (C0065.f65 * 1789)) <= 0) goto L235;
        r51 = r135;
        r52 = r30;
        r54 = (C0031.f31 | C0034.f34) + 56423;
        goto L3
    L235:
        r51 = r135;
        r52 = r30;
        r112 = "ۤۦۤ";
        goto L11
    L75:
        kx r422 = (kx) r10;
        int r136 = ((Number) r422.a).intValue();
        int r1112 = ((Number) r422.b).intValue();
        GradientDrawable r423 = new GradientDrawable();
        r423.setShape(1);
        r423.setColor(r136);
        if (C0019.m77() <= 0) goto L77;
        r57 = r423;
        r58 = r1112;
        r54 = (C0036.f36 + C0064.f64) + 1751474;
        goto L3
    L77:
        r57 = r423;
        r58 = r1112;
        r54 = C0007.m28("ۥۧۥ");
        goto L3
    L80:
        if ((C0032.f32 % (C0050.f50 % 6909)) >= 0) goto L81;
        r54 = (C0057.f57 + C0071.f71) + 1753697;
        goto L3
    L81:
        C0049.m199();
        String r424 = r23;
    L82:
        String r1113 = "ۨۡۥ";
        r23 = r424;
    L83:
        r54 = C0038.m153(r1113);
    L86:
        if ((C0048.f48 ^ (C0013.f13 + 2268)) <= 0) goto L87;
        r54 = (C0070.f70 ^ C0040.f40) + 1754488;
        goto L3
    L87:
        C0006.f6 = 32;
        r54 = C0046.m186("ۣۦۡ");
        goto L3
    L89:
        r54 = (C0066.f66 - C0047.f47) + 1752619;
        goto L3
    L90:
        r34 = 20;
        r54 = (C0005.f5 - C0047.f47) + 1746636;
        goto L3
    L92:
        if (C0024.m96() < 0) goto L94;
        C0027.m111();
        r54 = C0015.m60("۠ۨۧ");
        r10 = r24;
        goto L3
    L94:
        r1113 = "ۣ۠ۡ";
        r10 = r24;
        goto L83
    L96:
        if ((C0036.f36 % (C0050.f50 ^ 2449)) <= 0) goto L97;
        r31 = r32;
        r54 = (C0059.f59 / C0019.f19) + 1755538;
        goto L3
    L97:
        C0029.m118();
        View r1114 = r25;
        TextView r137 = r26;
        ov r425 = r28;
        String r302 = r18;
        r31 = r32;
    L98:
        r54 = C0028.m114("ۢۦۥ");
        r25 = r1114;
        r26 = r137;
        r28 = r425;
        r18 = r302;
        goto L3
    L101:
        if (C0019.m77() <= 0) goto L102;
        r54 = (C0013.f13 ^ C0003.f3) + 1747545;
        goto L3
    L102:
        r54 = C0048.m193("۟ۡۤ");
        goto L3
    L104:
        r414 = new LinearLayout(r49);
        r414.setOrientation(1);
        r414.setLayoutParams(new LinearLayout.LayoutParams(0, r59, 1.0f));
        r8 = new TextView(r49);
        r8.setTextSize(16.0f);
        r8.setTextColor(r51.c);
        goto L33
    L106:
        if (C0065.f65 >= 0) goto L107;
        r419 = r22;
        goto L61
    L107:
        r410 = "ۦۢۦ";
        r115 = r22;
        goto L18
    L109:
        r117 = r19;
    L111:
        if ((C0014.f14 | (C0042.f42 | 492)) < 0) goto L113;
        C0036.f36 = 47;
        r19 = r117;
        r54 = C0036.m144("ۢۨۨ");
        goto L3
    L113:
        r412 = "ۨۨۦ";
        goto L28
    L115:
        if (C0041.m167() <= 0) goto L116;
        r54 = (C0059.f59 - C0013.f13) + 1747964;
        goto L3
    L116:
        C0061.m244();
        r420 = "ۣۧۧ";
        r1111 = r35;
        goto L70
    L118:
        r411 = r15;
        goto L120
    L125:
        if (C0053.f53 > 0) goto L127;
        C0038.f38 = 9;
        r54 = C0030.m120("ۣۢ");
        goto L3
    L127:
        r416 = "ۤ۟۟";
        goto L47
    L128:
        r25.setForeground(r33);
        if (C0031.f31 >= 0) goto L130;
        r54 = (C0038.f38 * C0064.f64) ^ (-1729831);
        goto L3
    L130:
        C0023.m92();
        String r426 = r37;
    L131:
        r37 = r426;
        r54 = C0064.m258("ۡۢۦ");
        goto L3
    L133:
        r9.setAlpha(0.8f);
        r20.addView(r8);
        r20.addView(r9);
        r5.addView(r6);
        r5.addView(r7);
        r5.addView(r20);
        r112 = "ۦۤۢ";
        goto L11
    L134:
        mv r427 = new mv(r5, r6, r7, r8, r9);
        r5.setTag(r427);
        r45 = r5;
        r31 = r427;
        r54 = (C0012.f12 | C0016.f16) + 56000;
        goto L3
    L136:
        if (C0038.f38 >= 0) goto L137;
        r54 = (C0008.f8 * C0064.f64) ^ (-1787335);
        goto L3
    L137:
        C0040.f40 = 14;
        r416 = "ۥۤۧ";
        goto L47
    L139:
        r11 = "۠ۨۧ";
        goto L8
    L140:
        r134 = 85;
        if ((C0044.f44 | (C0013.f13 * 6134)) < 0) goto L143;
        r36 = 85;
        r54 = C0039.m159("۠ۢ");
        goto L3
    L143:
        r119 = "ۥۤۨ";
        goto L122
    L144:
        r26.setBackground(r57);
        r26.setTextColor(r58);
        if (this.c.contains(r18) == false) goto L86;
        GradientDrawable r428 = new GradientDrawable();
        r428.setShape(1);
        r428.setColor(r51.e);
        if (C0004.f4 >= 0) goto L148;
        GradientDrawable r138 = r428;
        LinearLayout r303 = r45;
    L150:
        r44 = r138;
        r45 = r303;
        r54 = C0047.m189("۠ۡۡ");
        goto L3
    L148:
        C0009.m36();
        r44 = r428;
        r54 = C0034.m138("۟ۡۢ");
        goto L3
    L152:
        if ((C0067.f67 * (C0020.f20 | 54)) <= 0) goto L153;
        r54 = C0000.m2("ۢۧۨ");
        goto L3
    L153:
        Integer r429 = r38;
        Integer r1115 = r39;
        Integer r139 = r40;
        Integer r304 = r41;
    L154:
        r54 = C0010.m43("ۧۤۡ");
        r38 = r429;
        r39 = r1115;
        r40 = r139;
        r41 = r304;
        goto L3
    L156:
        LinearLayout r430 = (LinearLayout) r64;
        Object r1116 = r430.getTag();
        ip.m("null cannot be cast to non-null type com.ljx.wechatmod.core.MessageSender.ContactAdapter.ViewHolder", r1116);
        mv r1117 = (mv) r1116;
        if ((C0025.f25 - (C0061.f61 ^ (-1472))) <= 0) goto L158;
        View r305 = r25;
        r137 = r26;
        String r542 = "۟ۤ";
        mv r55 = r1117;
        String r56 = r18;
        r45 = r430;
    L160:
        r25 = r305;
        r26 = r137;
        r32 = r55;
        r18 = r56;
        r54 = C0018.m73(r542);
        goto L3
    L158:
        C0067.m269();
        r138 = r44;
        r32 = r1117;
        r303 = r430;
        goto L150
    L161:
        r5.setGravity(r43);
        r5.setPadding(((Number) r52.f(r39)).intValue(), ((Number) r52.f(r38)).intValue(), ((Number) r52.f(r39)).intValue(), ((Number) r52.f(r38)).intValue());
        int r1118 = C0032.f32 ^ 392;
        int r431 = C0057.f57 ^ 430;
        r5.setLayoutParams(new AbsListView.LayoutParams(r1118, r431));
        r5.setBackground(new RippleDrawable(ColorStateList.valueOf(r51.h), new ColorDrawable(0), null));
        if ((C0005.f5 / (C0072.f72 - 6184)) != 0) goto L163;
        r59 = r431;
        r60 = r1118;
        r54 = (C0035.f35 ^ C0041.f41) ^ 1754846;
        goto L3
    L163:
        r59 = r431;
        r60 = r1118;
        r54 = C0026.m105("ۨۦۥ");
        goto L3
    L166:
        if (C0057.f57 < 0) goto L169;
        C0062.f62 = 74;
        String r1310 = "۟ۥۨ";
        ConcurrentHashMap r432 = r46;
        b70 r1119 = r47;
        boolean r306 = r48;
    L168:
        r46 = r432;
        r47 = r1119;
        r48 = r306;
        r54 = C0055.m220(r1310);
        goto L3
    L169:
        r1113 = "ۣۦۧ";
        goto L83
    L171:
        if (C0026.f26 > 0) goto L173;
        C0066.m265();
        r37 = r17;
        r54 = C0050.m203("ۨۤۧ");
        goto L3
    L173:
        r426 = r17;
        goto L131
    L174:
        r14.setText(r37);
        if (r27.length() <= 0) goto L228;
        String r502 = r27.substring(0, 1);
        ip.n("substring(...)", r502);
        r1110 = Locale.ROOT;
        ip.n("ROOT", r1110);
        if (C0022.f22 < 0) goto L179;
        C0038.f38 = 4;
        r421 = r49;
        r135 = r51;
        r30 = r52;
        r53 = r502;
        goto L74
    L179:
        r418 = "ۢۥۣ";
        r53 = r502;
        goto L63
    L180:
        r29.setText(r27);
        r4 = r31.d;
        if (r28.c != 1) goto L10;
        r37 = "\u7fa4\u804a";
        r11 = "ۢۧۢ";
        r14 = r4;
        goto L8
    L184:
        if ((C0059.f59 * (C0071.f71 % (-307))) <= 0) goto L185;
        r54 = C0058.m234("ۤ۟۟");
        r61 = r36;
        goto L3
    L185:
        r54 = C0050.m203("ۡۧ۠");
        r61 = r36;
        goto L3
    L187:
        r42 = Integer.valueOf(C0048.f48 ^ 257);
        r304 = Integer.valueOf(C0051.f51 ^ (-171));
        r429 = Integer.valueOf(C0036.f36 ^ 873);
        r1115 = Integer.valueOf(C0072.f72 ^ (-615));
        r43 = C0048.f48 ^ 319;
        r139 = Integer.valueOf(r43);
        if (C0073.m295() > 0) goto L154;
        C0004.f4 = 52;
        r54 = C0025.m102("ۦۣۨ");
        r38 = r429;
        r39 = r1115;
        r40 = r139;
        r41 = r304;
        goto L3
    L190:
        r54 = (C0065.f65 - C0070.f70) + 1753069;
        goto L3
    L191:
        r25.setBackground(r44);
        r22 = new w0();
        if (C0041.m167() <= 0) goto L193;
        r54 = (C0038.f38 - C0046.f46) + 1747530;
        goto L3
    L193:
        r54 = C0047.m189("ۧۨۥ");
        goto L3
    L195:
        kx r1311 = new kx(Integer.valueOf(r15), Integer.valueOf(r47.b(r16)));
        r117 = r46.putIfAbsent(r18, r1311);
        if (r117 != null) goto L111;
        if ((C0071.f71 / (C0040.f40 | 5356)) != 0) goto L199;
        r19 = r117;
        r54 = (C0067.f67 / C0016.f16) ^ 1746972;
        r10 = r1311;
        goto L3
    L199:
        r19 = r117;
        r54 = C0073.m292("ۥۨۥ");
        r10 = r1311;
        goto L3
    L201:
        LinearLayout r0 = r45;
        r0.setOnClickListener(new v9(this, r28, r31, C0034.f34 ^ (-927)));
        if ((C0020.f20 ^ (C0058.f58 | 6243)) < 0) goto L204;
        C0029.m118();
        r54 = C0065.m263("۟ۤ");
        goto L3
    L204:
        r413 = r12;
        r118 = r6;
    L205:
        r133 = "ۢۥۨ";
        goto L35
    L207:
        if (C0041.m167() > 0) goto L209;
        C0032.m128();
        r415 = "ۥۡۥ";
        goto L41
    L209:
        r412 = "ۡۢۦ";
        r117 = r19;
        goto L28
    L210:
        r26.setText(r23);
        r432 = this.h;
        r24 = r432.get(r18);
        if (r24 == null) goto L212;
    L220:
        if ((C0059.f59 * (C0037.f37 * (-9270))) <= 0) goto L221;
        r46 = r432;
        r54 = (C0028.f28 + C0040.f40) + 1754658;
        goto L3
    L221:
        C0046.m185();
        r46 = r432;
        r54 = C0020.m80("ۣۣۡ");
        goto L3
    L212:
        r1119 = b70.a(Math.abs(r18.hashCode()) % (C0035.f35 ^ 785), 50.0d);
        r306 = this.f;
        r1310 = "ۧۨۥ";
        goto L168
    L213:
        r8.setTypeface(null, 1);
        r8.setSingleLine(true);
        r9 = new TextView(r49);
        r9.setTextSize(12.0f);
        r9.setTextColor(r51.d);
        r9.setSingleLine(true);
        if ((C0038.f38 + (C0036.f36 * 8082)) > 0) goto L216;
        r54 = C0061.m246("ۣ۟ۡ");
        goto L3
    L216:
        r119 = "ۥۡ";
        r134 = r36;
        goto L122
    L217:
        r112 = "ۦۣ۠";
        goto L11
    L218:
        r432 = r46;
        goto L220
    L223:
        r137 = r31.b;
        r1114 = r31.a;
        r425 = (ov) this.b.get(r63);
        TextView r02 = r31.c;
        String r03 = r425.b;
        String r04 = r425.a;
        if ((C0036.f36 | (C0071.f71 % (-9088))) < 0) goto L226;
        C0046.m185();
        r542 = "ۦۨ۠";
        r305 = r1114;
        r27 = r03;
        r28 = r425;
        r29 = r02;
        r55 = r32;
        r56 = r04;
        goto L160
    L226:
        r27 = r03;
        r29 = r02;
        r302 = r04;
    L228:
        if ((C0014.f14 % (C0060.f60 | 6250)) >= 0) goto L229;
        r54 = (C0029.f29 * C0035.f35) + 1903875;
        goto L3
    L229:
        C0053.f53 = 65;
        r418 = "۠۟ۥ";
        r1110 = r50;
        goto L63
    L232:
        r135 = r51;
        r30 = r52;
        goto L234
    L237:
        r54 = (C0071.f71 + C0073.f73) + 56966;
        r10 = r19;
        goto L3
    L238:
        r424 = r53.toUpperCase(r50);
        ip.n("toUpperCase(...)", r424);
        if ((C0012.f12 * (C0028.f28 % (-9767))) < 0) goto L82;
        r23 = r424;
        r54 = C0070.m281("۟ۨۥ");
        goto L3
    L241:
        r118 = new View(r49);
        LinearLayout.LayoutParams r62 = new LinearLayout.LayoutParams(((Number) r52.f(r41)).intValue(), ((Number) r52.f(r41)).intValue());
        r62.rightMargin = ((Number) r52.f(r40)).intValue();
        r118.setLayoutParams(r62);
        r7 = new TextView(r49);
        LinearLayout.LayoutParams r66 = new LinearLayout.LayoutParams(((Number) r52.f(r42)).intValue(), ((Number) r52.f(r42)).intValue());
        if ((C0069.f69 + (C0002.f2 / 9663)) >= 0) goto L243;
        r417 = "ۤۡۨ";
        r12 = r66;
        goto L45
    L243:
        C0050.f50 = 81;
        r413 = r66;
        goto L205
    L245:
        r12.rightMargin = ((Number) r52.f(r40)).intValue();
        r7.setLayoutParams(r12);
        r7.setGravity(C0071.f71 ^ (-640));
        r7.setTextColor(r60);
        r7.setTextSize(18.0f);
        r7.setTypeface(null, 1);
        if ((C0060.f60 - (C0009.f9 / 3378)) <= 0) goto L247;
        r54 = C0033.m132("ۦۥۧ");
        goto L3
    L247:
        r54 = C0018.m73("ۡۦۥ");
        goto L3
    L249:
        return r45;
    }
}
