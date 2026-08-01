package defpackage;

import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.view.C0007;
import android.view.View;
import android.view.ViewTreeObserver;
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
import androidx.versionedparcelable.C0042;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0047;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.annotation.C0044;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.appbar.C0049;
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
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class m9 implements ViewTreeObserver.OnPreDrawListener {
    public final i00 a;
    public final long b;

    public m9(i00 r5, long r6) {
        long r0 = 0;
        int r2 = C0015.m60("۟ۥۤ");
    L3:
        switch(r2) {
            case 1746878: goto L5;
            case 1747837: goto L14;
            case 1750718: goto L26;
            case 1750816: goto L21;
            case 1754407: goto L18;
            case 1754538: goto L8;
            case 1754599: goto L36;
            case 1754656: goto L31;
            default: goto L3;
        };
    L5:
        this.a = r5;
        if (C0015.f15 >= 0) goto L7;
        String r22 = "ۣۥ۠";
    L12:
        r2 = C0046.m186(r22);
        goto L3
    L7:
        r2 = C0058.m234("ۧۨۡ");
        goto L3
    L8:
        System.out.println(r0);
        if ((C0036.f36 * (C0013.f13 - 2275)) < 0) goto L24;
        C0070.f70 = 74;
        r2 = C0025.m102("ۧ۠۠");
    L24:
        r22 = "ۧۦۦ";
    L14:
        if (C0020.f20 >= 0) goto L15;
        r2 = C0072.m288("ۧۦۦ");
        goto L3
    L15:
        C0009.m36();
        r2 = C0045.m182("ۣۤ۠");
        goto L3
    L18:
        if ((C0040.f40 / (C0005.f5 - 1659)) != 0) goto L19;
        r2 = C0007.m28("۟ۥۤ");
        goto L3
    L19:
        r2 = C0047.m189("ۦۥۤ");
        goto L3
    L21:
        r0 = Long.parseLong(C0015.m63("TNbfXiDzLW8pd8"));
        if ((C0049.f49 ^ (C0028.f28 - 3062)) >= 0) goto L23;
        r2 = (C0032.f32 - C0072.f72) ^ 1754460;
        goto L3
    L23:
        C0015.m61();
        goto L24
    L26:
        this.b = r6;
        if ((C0003.f3 + (C0013.f13 | (-2977))) <= 0) goto L28;
        r2 = (C0001.f1 % C0023.f23) + 1754841;
        goto L3
    L28:
        C0038.f38 = 48;
        r2 = C0003.m13("۠ۥۢ");
        goto L3
    L31:
        if (C0042.m169() > 0) goto L14;
        if (C0049.f49 <= 0) goto L34;
        r2 = (C0009.f9 % C0033.f33) + 1750827;
        goto L3
    L34:
        r2 = C0051.m207("۟ۥۤ");
        goto L3
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Object r4 = null;
        boolean r19 = false;
        h40 r5 = null;
        Long r18 = null;
        Long r12 = null;
        View r17 = null;
        int r20 = 0;
        Object r3 = null;
        h40 r11 = null;
        h40 r6 = null;
        h40 r10 = null;
        h40 r8 = null;
        i40 r13 = null;
        int r21 = C0072.m288("ۣۢۤ");
        ArrayList r14 = null;
        i00 r15 = null;
        l9 r16 = null;
    L3:
        switch(r21) {
            case 56291: goto L6;
            case 56320: goto L69;
            case 56355: goto L49;
            case 56359: goto L63;
            case 56510: goto L113;
            case 1746721: goto L142;
            case 1746754: goto L105;
            case 1746941: goto L104;
            case 1746944: goto L80;
            case 1747651: goto L68;
            case 1747656: goto L151;
            case 1747779: goto L94;
            case 1747836: goto L73;
            case 1747838: goto L25;
            case 1747896: goto L158;
            case 1747927: goto L42;
            case 1747932: goto L132;
            case 1748645: goto L65;
            case 1748864: goto L30;
            case 1749729: goto L90;
            case 1749734: goto L106;
            case 1750567: goto L10;
            case 1750687: goto L137;
            case 1750779: goto L33;
            case 1751588: goto L6;
            case 1751711: goto L115;
            case 1751718: goto L156;
            case 1751779: goto L78;
            case 1752487: goto L61;
            case 1752679: goto L46;
            case 1753415: goto L149;
            case 1753448: goto L61;
            case 1753544: goto L87;
            case 1753545: goto L126;
            case 1753547: goto L98;
            case 1753609: goto L56;
            case 1753699: goto L15;
            case 1754442: goto L127;
            case 1754470: goto L38;
            case 1754475: goto L121;
            case 1754532: goto L47;
            case 1754534: goto L146;
            case 1755463: goto L30;
            case 1755467: goto L13;
            case 1755560: goto L110;
            default: goto L3;
        };
    L6:
        if (C0064.f64 <= 0) goto L7;
        r21 = (C0056.f56 % C0038.f38) ^ (-1747923);
        goto L3
    L7:
        String r2 = "ۥۥۡ";
    L8:
        r21 = C0022.m90(r2);
        goto L3
    L10:
        if (r14.contains(r16) == true) goto L149;
        String r22 = "ۣۤ۠";
    L12:
        r21 = C0005.m23(r22);
        goto L3
    L13:
        ((View) r15.b).animate().setListener(null).withEndAction(null).alpha(1.0f).setDuration(976 ^ ((long) C0026.f26)).start();
        r17 = (View) r15.b;
        r21 = (C0069.f69 % C0021.f21) + 1747814;
    L15:
        if ((C0004.f4 + (C0016.f16 | (-9173))) < 0) goto L18;
        C0068.m273();
        String r23 = "ۣۤۨ";
    L17:
        r21 = C0036.m144(r23);
        goto L3
    L18:
        r23 = "ۧۢۦ";
        goto L17
    L25:
        h40 r24 = new h40(r15.b, h40.n);
        r24.j = new i40();
        if ((C0067.f67 + (C0020.f20 | (-942))) >= 0) goto L27;
    L54:
        r10 = r24;
        r21 = C0071.m286("ۦۥۨ");
        goto L3
    L27:
        C0040.f40 = 98;
        r10 = r24;
        r21 = C0061.m246("ۤۦۡ");
    L30:
        if ((C0003.f3 - (C0015.f15 % 3110)) > 0) goto L32;
        C0053.f53 = 26;
        r21 = C0071.m286("ۣۢۢ");
        goto L3
    L32:
        r2 = "ۤۦۡ";
        goto L8
    L33:
        r8.a(new ao(r15, r8, C0002.f2 ^ 766));
        r8.h();
        if (C0026.m106() <= 0) goto L35;
        r21 = (C0029.f29 + C0008.f8) ^ (-1753553);
        goto L3
    L35:
        r21 = C0011.m45("ۦۤ");
        goto L3
    L38:
        if (C0007.f7 <= 0) goto L39;
        r18 = null;
        r21 = (C0005.f5 - C0054.f54) + 1755168;
        goto L3
    L39:
        r18 = null;
        r21 = C0062.m249("ۢۤۨ");
    L42:
        if ((C0002.f2 | (C0066.f66 / (-6571))) > 0) goto L45;
        C0018.f18 = 9;
        String r25 = "۟ۢۦ";
    L44:
        r21 = C0037.m149(r25);
        goto L3
    L45:
        r2 = "ۣۨۦ";
        goto L8
    L46:
        r21 = (C0049.f49 - C0043.f43) + 1752778;
        goto L3
    L47:
        return true;
    L49:
        r5 = null;
        if (r19 == false) goto L65;
        if ((C0008.f8 / (C0021.f21 * (-9535))) != 0) goto L53;
        r21 = (C0044.f44 - C0062.f62) + 1748434;
        goto L3
    L53:
        r24 = r10;
        goto L54
    L56:
        r10.f(0.002f);
        l9 r26 = new l9(0, r15);
        if ((C0053.f53 - (C0002.f2 ^ 5685)) >= 0) goto L58;
        r16 = r26;
        r21 = (C0052.f52 | C0066.f66) ^ 1747281;
        goto L3
    L58:
        r16 = r26;
        r21 = C0068.m272("ۡۨ");
        goto L3
    L61:
        r21 = C0040.m160("ۦۤ");
        goto L3
    L63:
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    L65:
        if (C0013.f13 >= 0) goto L66;
        r21 = (C0072.f72 | C0035.f35) + 1754477;
        goto L3
    L66:
        C0014.f14 = 71;
        r21 = C0012.m50("ۤۨ۠");
        goto L3
    L68:
        return true;
    L69:
        h40 r27 = (h40) r3;
        if (C0042.m169() <= 0) goto L71;
        r11 = r27;
        r21 = (C0024.f24 - C0036.f36) + 1747620;
        goto L3
    L71:
        C0055.m223();
        r11 = r27;
        r21 = C0032.m130("ۦۣۥ");
        goto L3
    L73:
        ((View) r15.b).setTag(r20, r10);
        if (C0005.f5 <= 0) goto L75;
        r8 = r10;
        r21 = (C0032.f32 % C0060.f60) + 1753937;
        goto L3
    L75:
        r8 = r10;
    L76:
        r21 = C0062.m249("۠۠");
        goto L3
    L78:
        r21 = (C0060.f60 * C0044.f44) + 1409639;
        goto L3
    L80:
        if ((r3 instanceof h40) == true) goto L82;
        h40 r28 = r5;
    L21:
        if (C0070.f70 > 0) goto L24;
        C0057.m230();
        Object r7 = "ۡۡۥ";
        h40 r9 = r28;
    L23:
        r6 = r9;
        r21 = C0003.m13(r7);
        goto L3
    L24:
        r7 = "۠ۨۤ";
        r9 = r28;
        goto L23
    L82:
        if ((C0017.f17 | (C0052.f52 - 3935)) < 0) goto L85;
        h40 r29 = r5;
    L84:
        r6 = r29;
        r21 = C0065.m263("۠ۨۤ");
        goto L3
    L85:
        r6 = r5;
        goto L76
    L87:
        if (C0031.m124() <= 0) goto L88;
        r21 = (C0034.f34 | C0042.f42) ^ (-1748101);
        goto L3
    L88:
        C0020.m82();
        r21 = C0038.m153("ۡ۠ۤ");
        goto L3
    L90:
        i00 r72 = this.a;
        ((View) r72.b).getViewTreeObserver().removeOnPreDrawListener(this);
        if (C0048.f48 <= 0) goto L92;
        r15 = r72;
        r21 = (C0039.f39 ^ C0022.f22) + 1752803;
        goto L3
    L92:
        C0045.m181();
        r15 = r72;
        r21 = C0047.m189("۟ۧۥ");
        goto L3
    L94:
        int r210 = (-2114454372) ^ C0009.f9;
        r3 = r17.getTag(r210);
        if ((C0032.f32 - (C0016.f16 % 7186)) >= 0) goto L96;
        r20 = r210;
        r21 = C0020.m80("۟ۧۨ");
        goto L3
    L96:
        C0040.m162();
        r20 = r210;
        r21 = C0071.m286("ۦۨۥ");
        goto L3
    L98:
        r13.i = 1.0f;
        r13.b(300.0f);
        if ((C0053.f53 % (C0024.f24 ^ 7212)) > 0) goto L103;
        C0062.f62 = 30;
    L101:
        String r211 = "ۣۧ۟";
    L102:
        r21 = C0055.m220(r211);
        goto L3
    L103:
        r2 = "۟ۧۥ";
        goto L8
    L104:
        r13.a(0.6f);
        goto L101
    L105:
        r29 = r11;
        goto L84
    L106:
        Long r212 = (Long) r4;
        if (C0001.m4() <= 0) goto L108;
    L118:
        r12 = r212;
        r21 = C0035.m140("ۥۦۨ");
        goto L3
    L108:
        r12 = r212;
        r21 = C0064.m258("ۣۧۤ");
        goto L3
    L110:
        if (C0025.f25 < 0) goto L112;
        r21 = C0044.m176("ۦ۠ۢ");
        goto L3
    L112:
        r211 = "ۤۢۢ";
        goto L102
    L113:
        if (r12 != null) goto L15;
        r21 = (C0042.f42 + C0020.f20) ^ (-1756653);
        goto L3
    L115:
        ((View) r15.b).setScaleX(0.85f);
        ((View) r15.b).setScaleY(0.85f);
        if (C0016.m66() <= 0) goto L117;
        r21 = (C0067.f67 | C0056.f56) ^ (-1754460);
        goto L3
    L117:
        r212 = r12;
        goto L118
    L121:
        if (r12.longValue() == this.b) goto L42;
        if ((C0011.f11 ^ (C0061.f61 / 8291)) >= 0) goto L124;
        r25 = "۠۟ۢ";
        goto L44
    L124:
        C0033.m135();
        r22 = "ۤۦۨ";
        goto L12
    L126:
        r4 = ((View) r15.b).getTag(2114322726 ^ C0048.f48);
        r19 = r4 instanceof Long;
        r21 = (C0021.f21 + C0029.f29) ^ (-56964);
        goto L3
    L127:
        i40 r213 = r8.j;
        if (r213 != null) goto L130;
    L157:
        r13 = r213;
        r21 = C0061.m246("ۣۧ۟");
        goto L3
    L130:
        if (C0028.f28 >= 0) goto L131;
    L131:
        r13 = r213;
        r21 = C0056.m226("ۦۣۨ");
        goto L3
    L132:
        if (r6 != null) goto L28;
        if ((C0040.f40 - (C0069.f69 - 3794)) > 0) goto L136;
        C0064.m257();
        r8 = r6;
        r21 = C0019.m79("۠ۥۣ");
        goto L3
    L136:
        r7 = "۠ۥۣ";
        r8 = r6;
        r9 = r6;
        goto L23
    L28:
        r8 = r6;
        goto L30
    L137:
        r14.add(r16);
        if (C0038.f38 >= 0) goto L139;
        r21 = (C0028.f28 | C0005.f5) + 1748366;
        goto L3
    L139:
        r21 = C0073.m292("۠ۧ۟");
    L142:
        if (C0013.f13 >= 0) goto L143;
        r21 = (C0058.f58 + C0033.f33) ^ 55306;
        goto L3
    L143:
        C0067.f67 = 86;
        r21 = C0004.m16("ۣۨۡ");
        goto L3
    L146:
        if ((C0027.f27 / (C0034.f34 % (-2079))) != 0) goto L147;
        r12 = r18;
        r21 = (C0028.f28 / C0029.f29) ^ 56508;
        goto L3
    L147:
        C0061.m244();
        r12 = r18;
        r21 = C0032.m130("ۧۢۡ");
    L149:
        r21 = (C0042.f42 * C0059.f59) + 1147112;
        goto L3
    L151:
        if (r10.e == true) goto L142;
        ArrayList r214 = r10.i;
        if (C0056.m224() <= 0) goto L154;
        r14 = r214;
        r21 = (C0058.f58 % C0017.f17) + 1750443;
        goto L3
    L154:
        C0063.f63 = 82;
        r14 = r214;
        r21 = C0033.m132("۠ۨ۟");
        goto L3
    L156:
        r213 = r13;
        goto L157
    L158:
        r28 = r6;
        goto L21
    }
}
