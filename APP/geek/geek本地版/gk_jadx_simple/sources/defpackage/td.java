package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.C0000;
import android.app.C0001;
import android.app.C0002;
import android.app.C0003;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.graphics.drawable.C0004;
import android.support.v4.graphics.drawable.C0005;
import android.support.v4.graphics.drawable.C0006;
import android.util.Base64;
import android.view.C0007;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.C0010;
import androidx.activity.C0011;
import androidx.activity.result.C0008;
import androidx.activity.result.C0009;
import androidx.appcompat.app.C0012;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.constraintlayout.helper.widget.C0017;
import androidx.constraintlayout.widget.C0019;
import androidx.constraintlayout.widget.C0020;
import androidx.coordinatorlayout.widget.C0021;
import androidx.coordinatorlayout.widget.C0022;
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
import com.google.android.material.theme.C0063;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.auth.C0065;
import com.ljx.wechatmod.core.GeekConfig$registerUpdateReceiver$receiver$1;
import com.ljx.wechatmod.hook.C0066;
import com.ljx.wechatmod.ui.C0067;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import io.fastkv.C0068;
import io.fastkv.FastKV;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C0069;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final class td extends XC_MethodHook {
    public final int a;
    public final Object b;

    public /* synthetic */ td(int r4, Object r5) {
        this.a = r4;
        this.b = r5;
        int r2 = C0060.m241("ۢۦۢ");
        Double r1 = null;
    L3:
        switch(r2) {
            case 1746788: goto L5;
            case 1749790: goto L15;
            case 1750661: goto L21;
            case 1751492: goto L6;
            case 1752640: goto L24;
            case 1754630: goto L11;
            default: goto L3;
        };
    L5:
        return;
    L6:
        Double r0 = Double.decode(C0017.m68("6qyQB7nwOdBCO"));
        if (C0071.f71 >= 0) goto L8;
        r2 = 1718896 + (C0066.f66 * C0050.f50);
        r1 = r0;
        goto L3
    L8:
        r2 = C0004.m16("ۤ۟۟");
        r1 = r0;
    L11:
        if ((C0013.f13 | (C0006.f6 + 9276)) >= 0) goto L12;
        r2 = (C0063.f63 % C0066.f66) + 1746716;
        goto L3
    L12:
        r2 = C0005.m23("ۦ۠ۥ");
        goto L3
    L15:
        if (C0061.m244() > 0) goto L11;
        if ((C0019.f19 ^ (C0057.f57 ^ 1942)) >= 0) goto L18;
        r2 = (C0000.f0 - C0044.f44) + 1751309;
        goto L3
    L18:
        r2 = C0003.m13("ۢۦۢ");
        goto L3
    L21:
        if ((C0043.f43 + (C0064.f64 | 2569)) <= 0) goto L22;
        r2 = (C0067.f67 - C0026.f26) + 1750752;
        goto L3
    L22:
        C0027.m111();
        r2 = C0031.m127("ۡۡ");
        goto L3
    L24:
        System.out.println(r1);
        if (C0040.f40 > 0) goto L27;
        C0007.m31();
    L27:
        r2 = C0067.m271("۟ۢۧ");
        goto L3
    }

    private final void a(XC_MethodHook.MethodHookParam r30) {
        Object r6 = null;
        Integer r17 = null;
        Object r5 = null;
        boolean r19 = false;
        String r10 = null;
        View r8 = null;
        View r27 = null;
        View r7 = null;
        Object r9 = null;
        Object r4 = null;
        String r26 = null;
        String r11 = null;
        ImageView r16 = null;
        String r21 = null;
        String r12 = null;
        int r13 = 0;
        byte[] r20 = null;
        int r28 = C0038.m153("ۧۨۤ");
        String r22 = null;
        Object[] r23 = null;
        Object r24 = null;
        sd r25 = null;
    L3:
        switch(r28) {
            case 56327: goto L5;
            case 56388: goto L68;
            case 56545: goto L46;
            case 56568: goto L113;
            case 1746723: goto L59;
            case 1746905: goto L101;
            case 1747679: goto L57;
            case 1747714: goto L41;
            case 1747715: goto L152;
            case 1747836: goto L83;
            case 1747841: goto L135;
            case 1747936: goto L89;
            case 1748673: goto L97;
            case 1748703: goto L58;
            case 1748706: goto L119;
            case 1748710: goto L141;
            case 1748773: goto L9;
            case 1749575: goto L97;
            case 1749579: goto L62;
            case 1749603: goto L14;
            case 1749791: goto L51;
            case 1749850: goto L150;
            case 1750593: goto L100;
            case 1750660: goto L72;
            case 1750687: goto L27;
            case 1751587: goto L50;
            case 1751592: goto L107;
            case 1751650: goto L92;
            case 1752461: goto L20;
            case 1752484: goto L18;
            case 1752644: goto L137;
            case 1752707: goto L147;
            case 1753477: goto L150;
            case 1753511: goto L140;
            case 1753547: goto L124;
            case 1753638: goto L123;
            case 1754505: goto L83;
            case 1754530: goto L13;
            case 1754597: goto L79;
            case 1754659: goto L78;
            case 1755522: goto L83;
            case 1755528: goto L131;
            case 1755554: goto L150;
            case 1755556: goto L83;
            default: goto L3;
        };
    L152:
        r16.setImageDrawable(r25);     // Catch: Throwable -> L34
        String r14 = "ۦۡ۠";
    L82:
        r28 = C0042.m170(r14);
    L35:
        r16.setImageDrawable(new qd());
        if (C0002.m10() > 0) goto L57;
        System.out.println(Double.decode(C0055.m222("Pzxerqa7iwR4yPomtG")));
        if (C0050.f50 <= 0) goto L39;
        r28 = (C0069.f69 | C0015.f15) ^ (-1747712);
        goto L3
    L39:
        C0053.f53 = 40;
        r28 = C0070.m281("ۦۣۢ");
        goto L3
    L5:
        String r3 = r11;
    L7:
        if (C0073.m295() <= 0) goto L8;
        r11 = r3;
        r28 = 1748977 ^ (C0003.f3 / C0024.f24);
        goto L3
    L8:
        C0036.m147();
        r11 = r3;
        r28 = C0008.m35("۟ۢۡ");
        goto L3
    L9:
        String r32 = (String) r4;
        if ((C0054.f54 % (C0012.f12 % (-7732))) <= 0) goto L11;
        r26 = r32;
        r28 = (C0072.f72 / C0025.f25) + 1752484;
        goto L3
    L11:
        r26 = r32;
        r28 = C0051.m207("ۡۡۡ");
        goto L3
    L13:
        r16.setImageDrawable(new qd());
        r28 = (C0064.f64 ^ C0046.f46) ^ 1755219;
        goto L3
    L14:
        Object r15 = r30.thisObject;
        String r33 = u40.a("BJFC524xBA==\n", "Y/Q2rhpUaQ8=\n");
        Object[] r142 = new Object[1];
        if (C0037.f37 >= 0) goto L16;
        r22 = r33;
        r23 = r142;
        r24 = r15;
        r28 = (C0030.f30 - C0013.f13) ^ 1751040;
        goto L3
    L16:
        C0003.f3 = 56;
        r22 = r33;
        r23 = r142;
        r24 = r15;
        r28 = C0022.m90("ۨۦۢ");
        goto L3
    L18:
        r11 = r26;
        r28 = (C0011.f11 | C0069.f69) + 1748745;
        goto L3
    L20:
        if (b50.N(r11, u40.a("njEXpPf4SN+dCw==\n", "+VRyz6ieJ7M=\n"), false) == false) goto L83;
        ImageView r34 = vd.a(r7);
        if (r34 == null) goto L85;
        if ((C0064.f64 + (C0017.f17 + 657)) <= 0) goto L25;
        r16 = r34;
        r28 = C0032.m130("ۨۥۥ");
        goto L3
    L25:
        C0045.f45 = 46;
        r16 = r34;
        r28 = C0032.m130("۠ۥۡ");
    L85:
        if (C0057.m230() >= 0) goto L86;
        r16 = r34;
        r28 = (C0047.f47 + C0052.f52) + 1755043;
        goto L3
    L86:
        r14 = "ۤۢۥ";
        r16 = r34;
        goto L82
    L27:
        Object r35 = r9;
    L29:
        if (C0045.f45 >= 0) goto L30;
        String r152 = "ۣۣۤ";
        r9 = r35;
        Integer r143 = r17;
        View r18 = r8;
    L32:
        r17 = r143;
        r8 = r18;
        r28 = C0012.m50(r152);
        goto L3
    L30:
        C0067.m269();
        r9 = r35;
        r28 = C0068.m272("۠۠ۥ");
        goto L3
    L41:
        int r36 = C0024.f24;
        if ((C0016.f16 | (C0026.f26 | (-6667))) >= 0) goto L43;
    L64:
        Object r144 = "ۤۢۦ";
        int r153 = r36;
    L65:
        r13 = r153;
        r28 = C0007.m28(r144);
        goto L3
    L43:
        C0045.m181();
        Object r145 = "ۣ۠ۡ";
        int r154 = r36;
    L44:
        r13 = r154;
        r28 = C0007.m28(r145);
        goto L3
    L46:
        if ((C0010.f10 - (C0005.f5 - 9357)) <= 0) goto L47;
        r28 = (C0069.f69 + C0001.f1) + 1751812;
        goto L3
    L47:
        C0069.f69 = 80;
        String r37 = "ۣۨ۟";
    L48:
        r28 = C0070.m281(r37);
        goto L3
    L50:
        r27 = null;
        r28 = (C0050.f50 * C0006.f6) + 1738391;
        goto L3
    L51:
        r10 = null;
        if (r19 == false) goto L89;
        View r38 = (View) r5;
        if (C0049.m199() < 0) goto L56;
        C0065.f65 = 74;
        r8 = r38;
        r28 = C0065.m263("ۥ۟ۧ");
        goto L3
    L56:
        r143 = r17;
        r152 = "ۦۣۢ";
        r18 = r38;
    L57:
        r28 = C0028.m114("ۢۨ۠");
    L58:
        r143 = r17;
        r152 = "ۥ۟ۧ";
        r18 = r8;
        goto L32
    L59:
        String r39 = r12;
    L60:
        r12 = r39;
        r28 = (-1754168) ^ (C0067.f67 + C0020.f20);
        goto L3
    L62:
        if (C0068.f68 < 0) goto L66;
        C0059.f59 = 16;
        r36 = r13;
        goto L64
    L66:
        r144 = "۠ۥۡ";
        r153 = r13;
        goto L65
    L68:
        if (C0021.m84() > 0) goto L71;
        C0038.m155();
        String r310 = "۠۠ۡ";
    L70:
        r28 = C0003.m13(r310);
        goto L3
    L71:
        r310 = "ۦۡ۠";
        goto L70
    L72:
        r4 = XposedHelpers.getObjectField(r9, u40.a("lDKJwMOr/wWXKYLNypE=\n", "8lvsrKf0inY=\n"));
        if ((r4 instanceof String) == false) goto L151;
        if (C0063.f63 > 0) goto L77;
        C0009.f9 = 91;
        r11 = r10;
        r28 = C0070.m281("۠ۡۤ");
        goto L3
    L77:
        r37 = "ۡۤۨ";
        r11 = r10;
        goto L48
    L151:
        r3 = r10;
        goto L7
    L78:
        ip.o(u40.a("qroLAEI=\n", "2tt5YS/PgfI=\n"), r30);
        r6 = r30.args[0];
        ip.m(u40.a("ZHiP2Dhpc5pkYpeUem8yl2t+l5RsZTKaZWPO2m1mftR+dJPROGF9gGZkjZpRZGY=\n", "Cg3jtBgKEvQ=\n"), r6);
        r37 = "ۦۦۦ";
        goto L48
    L79:
        r7 = r27;
        r28 = (C0010.f10 % C0032.f32) + 1747205;
    L83:
        r34 = r16;
    L89:
        if (C0073.m295() > 0) goto L91;
        r143 = r17;
        r152 = "۠ۢۡ";
        r18 = r8;
        goto L32
    L91:
        r143 = r17;
        r152 = "ۤۢۡ";
        r18 = r8;
        goto L32
    L92:
        r23[C0037.f37 ^ (-620)] = r17;
        r35 = XposedHelpers.callMethod(r24, r22, r23);
        if (r35 != null) goto L29;
        byte[] r146 = r20;
    L95:
        r9 = r35;
        r20 = r146;
        r28 = C0072.m288("ۢ۟ۨ");
        goto L3
    L97:
        if ((C0041.f41 % (C0032.f32 % (-9471))) > 0) goto L99;
        C0002.m10();
        r28 = C0006.m26("ۧۨۡ");
        goto L3
    L99:
        r143 = r17;
        r152 = "۟ۦ۠";
        r18 = r8;
        goto L32
    L100:
        r28 = (C0057.f57 | C0046.f46) ^ (-1749701);
        goto L3
    L101:
        if (r7 != null) goto L119;
        if (C0019.m77() <= 0) goto L104;
        r28 = (C0034.f34 * C0011.f11) ^ 1698552;
        goto L3
    L104:
        C0072.f72 = 81;
        r28 = C0060.m241("ۧۤ۟");
        goto L3
    L107:
        r146 = Base64.decode(r12, r13 ^ 1);     // Catch: Throwable -> L34
        if ((C0063.f63 | (C0024.f24 | (-2986))) >= 0) goto L110;
        r20 = r146;
        r28 = (C0001.f1 ^ C0069.f69) + 56414;
        goto L3
    L110:
        C0016.m66();
        r35 = r9;
        goto L95
    L113:
        sd r147 = new sd(BitmapFactory.decodeByteArray(r20, 0, r20.length), (Context) this.b);     // Catch: Throwable -> L34
        if ((C0057.f57 / (C0071.f71 % (-9219))) != 0) goto L116;
        r25 = r147;
        r28 = (C0049.f49 / C0037.f37) ^ 1747715;
        goto L3
    L116:
        r25 = r147;
        r28 = C0024.m98("ۦۣۨ");
    L119:
        if ((C0048.f48 ^ (C0025.f25 / 393)) >= 0) goto L120;
        r28 = (C0038.f38 - C0025.f25) + 1749151;
        goto L3
    L120:
        String r311 = "ۤ۠ۧ";
    L121:
        r28 = C0066.m264(r311);
        goto L3
    L123:
        r5 = r30.getResult();
        r152 = "ۢۦۣ";
        r143 = (Integer) r6;
        r18 = r8;
        r19 = r5 instanceof View;
        goto L32
    L124:
        r39 = gn.d(r21, "");
        if (r39.length() <= 0) goto L60;
        if (C0056.f56 >= 0) goto L128;
        r12 = r39;
        r28 = (-1747733) ^ (C0067.f67 | C0016.f16);
        goto L3
    L128:
        C0057.f57 = 27;
        String r148 = r21;
        String r155 = "ۧۨۤ";
    L129:
        r12 = r39;
        r21 = r148;
        r28 = C0065.m263(r155);
        goto L3
    L131:
        gn r312 = gn.a;
        r148 = "geek_avatar_".concat(r11);
        r312.getClass();
        if ((C0027.f27 + (C0050.f50 - 9112)) < 0) goto L134;
        r21 = r148;
        r28 = C0063.m254("ۢۨ۠");
        goto L3
    L134:
        r155 = "ۦۣۨ";
        r39 = r12;
        goto L129
    L135:
        r28 = (C0039.f39 + C0061.f61) + 1754688;
        goto L3
    L137:
        if (C0026.m106() > 0) goto L139;
        r28 = C0021.m86("ۧۨ");
        goto L3
    L139:
        r310 = "ۨۥ۟";
        goto L70
    L140:
        r311 = "ۣۡ۟";
        r7 = r8;
        goto L121
    L141:
        if (r11 != null) goto L58;
        if (C0017.m71() > 0) goto L145;
        C0058.f58 = 61;
    L145:
        r28 = C0060.m241("ۥۧۥ");
        goto L3
    L147:
        if (C0009.m36() < 0) goto L149;
        C0057.m230();
        r28 = C0053.m213("ۥۥۤ");
        goto L3
    L149:
        r145 = "ۣۧۥ";
        r154 = r13;
        goto L44
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x081e -> B:203:0x0222). Please report as a decompilation issue!!! */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam r29) {
        switch(this.a) {
            case 0: goto L187;
            default: goto L4;
        };
    L4:
        ip.o(u40.a("CxI4a/E=\n", "e3NKCpym6Fo=\n"), r29);
        Object r4 = r29.thisObject;
        ip.m(u40.a("JqfzMVNjqH0mvet9EWXpcCmh630Hb+l9J7yyMwZspTM8q+84U2Gndzq99jldYbljZpPvLR9pqnI8\nu/Az\n", "SNKfXXMAyRM=\n"), r4);
        final Application r42 = (Application) r4;
        gn r6 = gn.a;
        XC_LoadPackage.LoadPackageParam r5 = (XC_LoadPackage.LoadPackageParam) this.b;
        String r7 = r5.processName;
        ip.n(u40.a("jItRYcqfxCKdlFs=\n", "/Pk+Aq/st2w=\n"), r7);
        r6.getClass();
        u40.a("TVKs84BDLw==\n", "Lj3Ch+U7W5A=\n");
        u40.a("Vo9bP/A=\n", "JsE6UpXmut0=\n");
        gn.b = r42;
        gn.d = r7;
        if (r7.equals(u40.a("y+Uub83qJ9HN5Ddv1OI=\n", "qIpDQbmPSbI=\n")) == true) goto L199;
    L46:
        r42.registerActivityLifecycleCallbacks(new en());
        if (ip.i(r5.processName, u40.a("TT/W37jf5VlLPs/fodc=\n", "LlC78cy6izo=\n")) == false) goto L178;
        t6.a(r42);     // Catch: Throwable -> L122
    L49:
        gn.a.getClass();
        u40.a("6n8cphFpgQ==\n", "iRBy0nQR9TU=\n");
        IntentFilter r52 = new IntentFilter(gn.k);
        GeekConfig$registerUpdateReceiver$receiver$1 r62 = new GeekConfig$registerUpdateReceiver$receiver$1();
        if (Build.VERSION.SDK_INT < 33) goto L124;
        r42.registerReceiver(r62, r52, 2);     // Catch: Throwable -> L126
    L203:
        long r10 = r42.getPackageManager().getPackageInfo(u40.a("vy50HVCUd4+rJHpbXYpizrg=\n", "3EEZMzz+D6E=\n"), 0).lastUpdateTime;     // Catch: Throwable -> L129
        gn r53 = gn.a;     // Catch: Throwable -> L129
        String r63 = u40.a("t4jfcO73KvuDhMhc9vc144OZz0Ln\n", "3O2mL4KWWY8=\n");     // Catch: Throwable -> L129
        String r72 = u40.a("VA==\n", "ZKkUf89frcI=\n");     // Catch: Throwable -> L129
        r53.getClass();     // Catch: Throwable -> L129
        Long r54 = b50.S(gn.d(r63, r72));     // Catch: Throwable -> L129
        if (r54 == null) goto L128;
        long r64 = r54.longValue();     // Catch: Throwable -> L129
    L57:
        if (r10 == r64) goto L60;
        String r55 = u40.a("tX4+VrqjnPeObz1SvA==\n", "4A5aN87G0ZY=\n");     // Catch: Throwable -> L129
        String r65 = u40.a("dNSOkeJsGC8ikabWsnpqQh3m6ePIAlMuetSLn/ZrGR8omLL7sltHQhrB5/DaAEAJdO2ZkthQGR8o\nVy0QMoKW\n", "kncOd1fn/ac=\n");     // Catch: Throwable -> L129
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), r55);     // Catch: Throwable -> L129
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), r65);     // Catch: Throwable -> L129
        gn.h(u40.a("/gB7hhBIiErwEV28DVmZQcoGbb0G\n", "lWUC2WMt6zg=\n"), u40.a("pUJh+p4=\n", "hiUEn/UuRFE=\n"));     // Catch: Throwable -> L129
        gn.h(u40.a("Z+oKz0rHfThT5h3jUsdiIFP7Gv1D\n", "DI9zkCamDkw=\n"), String.valueOf(r10));     // Catch: Throwable -> L129
        Toast.makeText(r42, u40.a("vg8/CcsdMrZk/b/Vn1wU3hHJ342ROXbWXI/VwcsvBLZ23bPloFIu/R3S4EIO0vY2kg==\n", "+WpaYi21k1M=\n"), 1).show();     // Catch: Throwable -> L190
    L60:
        String r56 = pb0.a;
        u40.a("SBzXPuGSbg==\n", "K3O5SoTqGqg=\n");
        PackageInfo r57 = r42.getPackageManager().getPackageInfo(u40.a("Wj+i4gIJld9cPrviGwE=\n", "OVDPzHZs+7w=\n"), 0);     // Catch: Throwable -> L134
        if (r57 == null) goto L192;
        String r58 = r57.versionName;     // Catch: Throwable -> L134
        if (r58 != null) goto L67;
        r58 = "";
    L67:
        if (r58.length() != 0) goto L142;
        r58 = u40.a("sFee6wxnfw==\n", "xTn1hWMQEaQ=\n");
    L70:
        if (b50.N(r58, u40.a("qEDepl+Y\n", "kG7uiGip7zk=\n"), false) == false) goto L144;
        dd0 r59 = i90.a;
    L72:
        r59.getClass();
        String r66 = r59.G1;
        pb0.a = r59.b;
        pb0.b = r59.c;
        pb0.c = r59.d;
        pb0.d = r59.e;
        pb0.e = r59.f;
        pb0.f = r59.g;
        pb0.g = r59.h;
        pb0.h = r59.i;
        pb0.i = r59.j;
        pb0.j = r59.k;
        pb0.k = r59.l;
        pb0.l = r59.m;
        pb0.m = r59.n;
        pb0.n = r59.o;
        pb0.o = r59.p;
        pb0.p = r59.q;
        pb0.q = r59.r;
        pb0.r = r59.s;
        pb0.s = r59.t;
        pb0.t = r59.u;
        pb0.u = r59.v;
        pb0.v = r59.w;
        pb0.w = r59.x;
        pb0.x = r59.y;
        pb0.y = r59.z;
        pb0.z = r59.A;
        pb0.A = r59.B;
        pb0.B = r59.C;
        pb0.C = r59.D;
        pb0.D = r59.F;
        pb0.E = r59.G;
        pb0.F = r59.H;
        pb0.G = r59.J;
        pb0.H = r59.K;
        pb0.I = r59.L;
        pb0.J = r59.M;
        pb0.K = r59.N;
        pb0.L = r59.O;
        pb0.M = r59.P;
        pb0.N = r59.Q;
        pb0.O = r59.R;
        pb0.P = r59.S;
        pb0.Q = r59.U;
        pb0.R = r59.V;
        pb0.S = r59.W;
        pb0.T = r59.X;
        pb0.U = r59.Y;
        pb0.V = r59.Z;
        pb0.W = r59.a0;
        pb0.X = r59.b0;
        pb0.Y = r59.c0;
        pb0.Z = r59.x0;
        pb0.a0 = r59.y0;
        pb0.b0 = r59.z0;
        pb0.c0 = r59.A0;
        pb0.d0 = r59.B0;
        pb0.e0 = r59.C0;
        pb0.f0 = r59.D0;
        pb0.g0 = r59.E0;
        pb0.h0 = r59.F0;
        pb0.i0 = r59.G0;
        pb0.j0 = r59.H0;
        pb0.k0 = r59.I0;
        pb0.l0 = r59.K0;
        pb0.m0 = r59.M0;
        pb0.n0 = r59.N0;
        pb0.o0 = r59.O0;
        pb0.p0 = r59.P0;
        pb0.q0 = r59.Q0;
        pb0.r0 = r59.R0;
        pb0.s0 = r59.S0;
        pb0.t0 = r59.T0;
        pb0.u0 = r59.U0;
        pb0.v0 = r59.W0;
        pb0.w0 = r59.X0;
        pb0.x0 = r59.Y0;
        pb0.y0 = r59.Z0;
        pb0.z0 = r59.b1;
        pb0.A0 = r59.c1;
        pb0.B0 = r59.d1;
        pb0.C0 = r59.g1;
        pb0.D0 = r59.h1;
        pb0.E0 = r59.i1;
        pb0.F0 = r59.r1;
        pb0.G0 = r59.s1;
        pb0.H0 = r59.t1;
        pb0.I0 = r59.u1;
        pb0.J0 = r59.d0;
        pb0.K0 = r59.j0;
        pb0.L0 = r59.k0;
        pb0.M0 = r59.l0;
        pb0.N0 = r59.n0;
        pb0.O0 = r59.h0;
        pb0.P0 = r59.i0;
        pb0.Q0 = r59.o0;
        pb0.R0 = r59.p0;
        pb0.S0 = r59.q0;
        pb0.T0 = r59.r0;
        pb0.U0 = r59.s0;
        pb0.V0 = r59.t0;
        pb0.W0 = r59.u0;
        pb0.X0 = r59.v0;
        pb0.Y0 = r59.w0;
        pb0.Z0 = r59.x1;
        pb0.a1 = r59.y1;
        pb0.b1 = r59.z1;
        pb0.c1 = r59.A1;
        pb0.d1 = r59.B1;
        pb0.e1 = r66;
        ip.n(u40.a("T69kX+lXgBcA5D4zuQ==\n", "KMoQHZAj5WQ=\n"), r66.getBytes(c9.a));
        pb0.f1 = r59.H1;
        pb0.g1 = r59.I1;
        pb0.h1 = r59.J1;
        pb0.i1 = r59.K1;
        pb0.j1 = r59.L1;
        pb0.k1 = r59.M1;
        pb0.l1 = r59.O1;
        pb0.m1 = r59.P1;
        pb0.n1 = r59.Q1;
        pb0.o1 = r59.R1;
        pb0.p1 = r59.S1;
        pb0.q1 = r59.T1;
        pb0.r1 = r59.U1;
        pb0.s1 = r59.V1;
        pb0.t1 = r59.b2;
        pb0.u1 = r59.d2;
        pb0.v1 = r59.e2;
        pb0.w1 = r59.f2;
        pb0.x1 = r59.g2;
        pb0.y1 = r59.h2;
        pb0.z1 = r59.j2;
        pb0.A1 = r59.k2;
        pb0.B1 = r59.l2;
        pb0.C1 = r59.o2;
        ClassLoader r73 = r42.getClassLoader();
        ArrayList r8 = new ArrayList();
        kx r67 = new kx(u40.a("wNqtk+AD4GPhz7yuzxPtbdfytq7mHw==\n", "rr/ZwINmjgY=\n"), pb0.n);
        kx r9 = new kx(u40.a("5xz4rAGHtdfbHO+aC5S+/vwa54YvjbXX8A==\n", "iXmM/2Li27I=\n"), pb0.m);
        kx r102 = new kx(u40.a("wFT0m/eKQDftXu6u/Z1DBtxQ7rvyilwRwlDzuw==\n", "rjGAyJTvLlI=\n"), pb0.l);
        kx r11 = new kx(u40.a("0WwqR9waJC4=\n", "vB9NBLB7V10=\n"), pb0.o);
        kx r12 = new kx(u40.a("zMapRm3Xk6/DwrxlavO8od7F\n", "rbbZCx6w0MA=\n"), pb0.e0);
        kx r13 = new kx(u40.a("DCihe2XEnr8LBb5VdN0=\n", "f0bSNAeu+9w=\n"), pb0.j1);
        kx r14 = new kx(u40.a("XX90HFgPNi5mdHMcdxIbJ0hlag==\n", "KRYZeRRmWEs=\n"), pb0.a1);
        kx r15 = new kx(u40.a("8TL4vOvVL/vwJemI6MY3yw==\n", "n1eMy4SnRLg=\n"), pb0.b);
        kx r16 = new kx(u40.a("PUeNaEfcrJM3UYw=\n", "ViL/BiKw7/8=\n"), pb0.p);
        kx r17 = new kx(u40.a("1FGAKSthbrDLXaomL15y\n", "oj7pSk4tAdc=\n"), pb0.c);
        kx r18 = new kx(u40.a("hKpNUTigyYGxoF90JA==\n", "8sw+B1fJquQ=\n"), pb0.T);
        kx r19 = new kx(u40.a("mlElsR/q4iWJVSm+NdXmJIw=\n", "/zxK23a5h1c=\n"), pb0.g);
        kx r20 = new kx(u40.a("RYmtH2xjbzRDkL4Rc2VQKA==\n", "JPndUh8EI1s=\n"), pb0.d0);
        kx r21 = new kx(u40.a("mHoCwwMayTW6dgLHAxbVEZdzEMQ=\n", "+xJjt3dzp1I=\n"), pb0.m0);
        kx r22 = new kx(u40.a("13Xob7qbVyn0Y/t/tZ9KPw==\n", "uRCcPNn+OUw=\n"), pb0.a);
        kx r23 = new kx(u40.a("JuPKRGn+sHIb6M1UZfazciby/Xtr6K0=\n", "SIa+Fwqb3hc=\n"), pb0.u1);
        kx r24 = new kx(u40.a("nk68bUGws6mDVJ1LX56yrZ5T\n", "7SDPLi7d3sw=\n"), pb0.v1);
        LinkedHashMap r25 = new LinkedHashMap(dt.z(17));
        int r510 = 0;
    L74:
        if (r510 >= 17) goto L149;
        kx r26 = new kx[]{r67, r9, r102, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}[r510];
        r25.put(r26.a, r26.b);
        r510 = ((r510 - 11) + 1) + 11;
        goto L74
    L149:
        Iterator r92 = r25.entrySet().iterator();
    L151:
        if (r92.hasNext() == false) goto L159;
        Map.Entry r511 = (Map.Entry) r92.next();
        String r68 = (String) r511.getKey();
        String r512 = (String) r511.getValue();
        if (r512.length() == 0) goto L154;
        if (XposedHelpers.findClassIfExists(r512, r73) != null) goto L151;
    L154:
        r8.add(r68);
        goto L151
    L159:
        if (r8.isEmpty() == true) goto L181;
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", u40.a("ObVaK1x5E3EVuF4z\n", "dNQqWzkLWxQ=\n"), "53vj\n", "igiEy7e+YPk=\n"), "静态字典存在失效节点: " + ab.j0(r8, null, null, 63));
    L161:
        gn.a.getClass();
        a80.r(gn.i, wg.b, new os(r42, null), 2);
        int r513 = gn.b(u40.a("CZs8RSNGxskboSh1Ik0=\n", "Yv5FGkYosrs=\n"), 2);
        if (r513 != 1) goto L164;
    L183:
        final int r82 = 0;
        gn.j(u40.a("gDEMHKg8G2ynJhYmoic1\n", "01Rvbs1IXgI=\n"), new ns(r42, r82));
    L165:
        if (r513 != 0) goto L167;
    L184:
        final int r74 = 12;
        gn.j(u40.a("wDJN8v1JL+P0H0zo0w==\n", "jVcjh7gnW5E=\n"), new ns(r42, r74));
    L168:
        ConcurrentHashMap r514 = xa.a;
        String r515 = t6.a;     // Catch: Exception -> L188
        if (r515.length() <= 0) goto L174;
        if (r515.equals(u40.a("LNAmTXBRWWkuxiRH\n", "eZ5tAz8GFzY=\n")) == true) goto L174;
        ConcurrentHashMap r69 = xa.a;     // Catch: Exception -> L188
        r69.clear();     // Catch: Exception -> L188
        r69.put(r515, new wa(u40.a("6hChjUFwCJk=\n", "rXXE5mEgevY=\n"), Color.parseColor(u40.a("lflRk4GtZQ==\n", "trxp1bToXAc=\n")), Color.parseColor(u40.a("fFMcYbeHkg==\n", "X2dfIPGyoqk=\n"))));     // Catch: Exception -> L188
    L174:
        final int r75 = 13;
        gn.j(u40.a("lo1tgNcTkL6qnw==\n", "xfQe9LJ+2NE=\n"), new ns(r42, r75));
        final int r76 = 14;
        gn.j(u40.a("snTSWfVPZZONadA=\n", "4ga7L5QsHNs=\n"), new ns(r42, r76));
        z30.o("ddas\n", "AbfL95mQedY=\n", u40.a("HZyZKXl7\n", "SNXRRhYQEJU=\n"), "ITa66yE=\n", "Q1rViEo8ya8=\n");
        XposedBridge.hookAllMethods(Activity.class, u40.a("KeqpUkBkass=\n", "RoT7NzMRB64=\n"), new p50(6));     // Catch: Throwable -> L185
    L176:
        final int r77 = 1;
        gn.j(u40.a("zN7BlNgo1SHt2w==\n", "n7Cy2r1cok4=\n"), new ns(r42, r77));
        final int r78 = 2;
        gn.j(u40.a("cstFx8wJ73BIzV7A\n", "PKQxrqpgjBE=\n"), new ns(r42, r78));
        final int r79 = 3;
        gn.j(u40.a("IizsByzlWw==\n", "cUKfT0OKMKo=\n"), new ns(r42, r79));
        final int r710 = 4;
        gn.j(u40.a("wnvzgoBKKZc=\n", "gROS9sglRvw=\n"), new ns(r42, r710));
        final int r711 = 5;
        gn.j(u40.a("QIXVyOaGKgpP\n", "DeCmu4fhT04=\n"), new ns(r42, r711));
        final int r712 = 6;
        gn.j(u40.a("TD0bKTbqCyJlMQ==\n", "AEh4Qk+nZEw=\n"), new ns(r42, r712));
        final int r713 = 7;
        gn.j(u40.a("k15orw6lTtixVA==\n", "3j8BwVvsBrc=\n"), new ns(r42, r713));
        final int r714 = 8;
        gn.j(u40.a("jIyrsE0hwI6WhqW3\n", "3unK3ANAres=\n"), new ns(r42, r714));
        final int r715 = 9;
        gn.j(u40.a("Xeiv12/e1aBq7q7PQsPJqg==\n", "HofBoQqspsE=\n"), new ns(r42, r715));
        final int r716 = 10;
        gn.j(u40.a("x92/wOuVPOHw277Y264H7+vZ\n", "hLLRto7nT4A=\n"), new ns(r42, r716));
        final int r717 = 11;
        gn.j(u40.a("h/9iab5RZBWp4g==\n", "xokDHd8jLHo=\n"), new ns(r42, r717));
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", u40.a("4fiegXe91xLO6A==\n", "oI3q6TLTsHs=\n"), "53vj\n", "igiEy7e+YPk=\n"), u40.a("6SZJtoZqIc/LMkm3jGp1xNEjXK2QYTGKiDtSsYh3dcLNI1GxmmExhts+UrGXbDnfiDVSrMNhI8Pa\nKlKwhio=\n", "qFM93uMEVaY=\n"));
    L186:
        u40.a("Nwje\n", "Q2m5jaPP2Zc=\n");
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");
        goto L176
    L167:
        if (r513 == 2) goto L184;
    L164:
        if (r513 == 2) goto L183;
    L181:
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", u40.a("gEGBQin1BuSsTIVa\n", "zSDxMkyHToE=\n"), "53vj\n", "igiEy7e+YPk=\n"), u40.a("pqNAoeNqxwrY21z/hH+9Qt6DPfrwDpwmqJZqos1xwSfN\n", "Tz7ZR2PrIqc=\n"));
        goto L161
    L144:
        if (b50.N(r58, u40.a("LJPXe2b8\n", "FL3nVVHMliQ=\n"), false) == false) goto L147;
        r59 = h90.a;
        goto L72
    L147:
        if (b50.N(r58, u40.a("S94c7N5s\n", "c/AswuhVbgM=\n"), false) == false) goto L182;
        r59 = g90.a;
        goto L72
    L182:
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", u40.a("PM+9rSIc\n", "b7bO2UdxYZU=\n"), "53vj\n", "igiEy7e+YPk=\n"), z30.j("⚠️ 警告：当前微信版本 ", r58, " 未适配。已安全跳过 Hook 流程。"));
        goto L161
    L142:
        ip.o(z30.k("xwGO\n", "s2Dpd1+FjZU=\n", u40.a("nNFq901V\n", "z6gZgyg41bA=\n"), "53vj\n", "igiEy7e+YPk=\n"), "检测到微信版本: ".concat(r58));
    L192:
        r58 = "";
    L193:
        PackageInfo r516 = r42.getPackageManager().getPackageInfo(r42.getPackageName(), 0);     // Catch: Throwable -> L140
        if (r516 == null) goto L192;
        r58 = r516.versionName;     // Catch: Throwable -> L140
        if (r58 != null) goto L67;
        r58 = "";
    L141:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("/7PkNpgFk8Papc4xlzyk1tiz1QG+FLHwzaTUN5Yf\n", "qNanXvlxxaY=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        r58 = "";
        goto L67
    L128:
        r64 = 0;
    L130:
        gn r517 = gn.a;
        String r610 = u40.a("yl0hO7/i+0zETAcBovPqR/5bNwCp\n", "oThYZMyHmD4=\n");
        r517.getClass();
        if (gn.d(r610, "").length() != 0) goto L133;
        gn.h(u40.a("j8EkyoFqdk6B0ALwnHtnRbvHMvGX\n", "5KRdlfIPFTw=\n"), u40.a("F3AyrHo=\n", "NBdXyREDn7s=\n"));
    L133:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("BKv6aURi8KE/uvltQg==\n", "UdueCDAHvcA=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        goto L60
    L124:
        r42.registerReceiver(r62, r52);     // Catch: Throwable -> L126
    L127:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("RVMWnDW0LdVrUSylE7wqwHZTAaUTuCbadFMB\n", "AjZz93bbQ7M=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
    L123:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("XEcxvAhSVmF6VzeLDF1RdA==\n", "HTJF1EUzOAA=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
    L178:
        if (C0033.m135() < 0) goto L262;
        System.out.println(Long.parseLong(C0063.m255("0bGBGaOkSvh5QW3Jn")));
        return;
    L262:
        return;
    L199:
        File[] r611 = r42.getExternalMediaDirs();     // Catch: Throwable -> L43
        ip.n(u40.a("73aaCyXPuY3mcoIDON+1nsx6nD11lfLRoQ==\n", "iBPuTl273P8=\n"), r611);     // Catch: Throwable -> L43
        if (r611.length != 0) goto L77;
        File r612 = null;
    L9:
        if (r612 != null) goto L11;
        r612 = new File(u40.a("l8PDkDnr6JiX1dqKJ+v7mNyfh9AK5OuP19nT0Cbv65TZn9SQJqT7mNbT0pE/pOKQ\n", "uLC3/0uKj/0=\n"));     // Catch: Throwable -> L43
    L11:
        File r718 = new File(r612, u40.a("EfDxroOdV69X5qeuso0=\n", "P4OI3dz+Nsw=\n"));     // Catch: Throwable -> L43
        if (r718.exists() == true) goto L15;
        r718.mkdirs();     // Catch: Throwable -> L43
    L15:
        if (r718.exists() == false) goto L78;
        gn.c = new FastKV.Builder(r718.getAbsolutePath(), u40.a("vEOXKW/dVeCgcpIfZtFZzaxMhx5n\n", "zy3kdgK0NpI=\n")).build();     // Catch: Throwable -> L43
    L17:
        File r93 = new File(r42.getFilesDir(), u40.a("ywyQmQ==\n", "s2D//sM2ekc=\n"));     // Catch: Throwable -> L43
        if (new File(r93, u40.a("javBzvzREtWQqcrM0e8PwIG1x8rQngnT\n", "9ceuqaOwYqU=\n")).exists() == true) goto L209;
    L30:
        SharedPreferences r94 = r42.getSharedPreferences(u40.a("UmnOaREQNqxFadldPgo2pkY=\n", "NQyrAk54U8A=\n"), 0);     // Catch: Throwable -> L43
        FastKV r613 = gn.c;     // Catch: Throwable -> L43
        if (r613 == null) goto L46;
        if (r613.getBoolean(u40.a("9UENyQxwGNjoVzb7EXg11PlWO8U6ZB7c/V4mzA==\n", "nDJSpGUXark=\n"), false) == true) goto L46;
        Map<String, ?> r614 = r94.getAll();     // Catch: Throwable -> L43
        ip.n(u40.a("gS71Rr1oodjIZag=\n", "5kuBB9EEifY=\n"), r614);     // Catch: Throwable -> L43
        Iterator<Map.Entry<String, ?>> r103 = r614.entrySet().iterator();     // Catch: Throwable -> L43
    L36:
        if (r103.hasNext() == false) goto L115;
        Map.Entry<String, ?> r615 = r103.next();     // Catch: Throwable -> L43
        String r719 = r615.getKey();     // Catch: Throwable -> L43
        Object r616 = r615.getValue();     // Catch: Throwable -> L43
        if ((r616 instanceof Boolean) == true) goto L39;
        if ((r616 instanceof String) == true) goto L107;
        if ((r616 instanceof Integer) == false) goto L36;
        FastKV r112 = gn.c;     // Catch: Throwable -> L43
        if (r112 == null) goto L36;
        r112.putInt(r719, ((Number) r616).intValue());     // Catch: Throwable -> L43
        goto L36
    L107:
        FastKV r113 = gn.c;     // Catch: Throwable -> L43
        if (r113 == null) goto L36;
        r113.putString(r719, (String) r616);     // Catch: Throwable -> L43
        goto L36
    L39:
        FastKV r114 = gn.c;     // Catch: Throwable -> L43
        if (r114 == null) goto L36;
        r114.putBoolean(r719, ((Boolean) r616).booleanValue());     // Catch: Throwable -> L43
        goto L36
    L115:
        FastKV r617 = gn.c;     // Catch: Throwable -> L43
        if (r617 == null) goto L118;
        r617.putBoolean(u40.a("Edh8iCpuk9wMzke6N2a+0B3PSoQcepXYGcdXjQ==\n", "eKsj5UMJ4b0=\n"), true);     // Catch: Throwable -> L43
    L118:
        r94.edit().clear().apply();     // Catch: Throwable -> L43
    L209:
        Map r618 = new FastKV.Builder(r93.getAbsolutePath(), u40.a("2P+cjeAmXlPF/ZePzRhDRtThmonM\n", "oJPz6r9HLiM=\n")).build().getAll();     // Catch: Throwable -> L28
        ip.n(u40.a("TT7amP87dLEEdYc=\n", "Kluu2ZNXXJ8=\n"), r618);     // Catch: Throwable -> L28
        Iterator r104 = r618.entrySet().iterator();     // Catch: Throwable -> L28
    L21:
        if (r104.hasNext() == false) goto L93;
        Map.Entry r619 = (Map.Entry) r104.next();     // Catch: Throwable -> L28
        String r720 = (String) r619.getKey();     // Catch: Throwable -> L28
        Object r620 = r619.getValue();     // Catch: Throwable -> L28
        if ((r620 instanceof Boolean) == true) goto L24;
        if ((r620 instanceof String) == true) goto L85;
        if ((r620 instanceof Integer) == false) goto L21;
        FastKV r115 = gn.c;     // Catch: Throwable -> L28
        if (r115 == null) goto L21;
        r115.putInt(r720, ((Number) r620).intValue());     // Catch: Throwable -> L28
        goto L21
    L85:
        FastKV r116 = gn.c;     // Catch: Throwable -> L28
        if (r116 == null) goto L21;
        r116.putString(r720, (String) r620);     // Catch: Throwable -> L28
        goto L21
    L24:
        FastKV r117 = gn.c;     // Catch: Throwable -> L28
        if (r117 == null) goto L21;
        r117.putBoolean(r720, ((Boolean) r620).booleanValue());     // Catch: Throwable -> L28
        goto L21
    L93:
        fk r95 = new fk(new gg(r93));     // Catch: Throwable -> L28
    L94:
        boolean r721 = true;
    L96:
        if (r95.hasNext() == false) goto L103;
        File r621 = (File) r95.next();     // Catch: Throwable -> L28
        if (r621.delete() == true) goto L101;
        if (r621.exists() == false) goto L101;
    L102:
        r721 = false;
    L101:
        if (r721 == true) goto L94;
    L103:
        String r622 = u40.a("obaJRQk1fNqFq4ZXCT1f\n", "4tnnI2BSMbM=\n");     // Catch: Throwable -> L28
        String r722 = u40.a("PVVyWVRt8z8EQn9TRm3tIx5Tc1QVLPA+UFl4RFA/8DscEHVRViX7ehNcc1FbKPp0\n", "cDAWMDVNnlo=\n");     // Catch: Throwable -> L28
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), r622);     // Catch: Throwable -> L28
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), r722);     // Catch: Throwable -> L28
    L29:
        ip.o(u40.a("Nwje\n", "Q2m5jaPP2Zc=\n"), u40.a("sWcBq5eZkJmfZTuDuJOfkb9sEKWmmJ+T\n", "9gJkwNT2/v8=\n"));     // Catch: Throwable -> L43
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");     // Catch: Throwable -> L43
        goto L30
    L78:
        File r623 = new File(r42.getFilesDir(), u40.a("IKVDAQWO0qgrokcJMbfQpSSoQw==\n", "R8Amalros8Q=\n"));     // Catch: Throwable -> L43
        if (r623.exists() == true) goto L81;
        r623.mkdirs();     // Catch: Throwable -> L43
    L81:
        gn.c = new FastKV.Builder(r623.getAbsolutePath(), u40.a("eaGo+LuPMlZlkK3OsoM+e2muuM+z\n", "Cs/bp9bmUSQ=\n")).build();     // Catch: Throwable -> L43
        String r624 = u40.a("grZkyswyzFamsGTJ\n", "wdkKrKVViTg=\n");     // Catch: Throwable -> L43
        String r723 = u40.a("GQvn4RyoxlpfB66NDMB9ER4s0ussvAMEQXTjv0yTQ1BHHaK5Fs5/Mhwr4OYjlAM5fnjEpkKVf1hg\nA6KjPMJkFw==\n", "+5FHDqQn5r8=\n");     // Catch: Throwable -> L43
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), r624);     // Catch: Throwable -> L43
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), r723);     // Catch: Throwable -> L43
        goto L17
    L77:
        r612 = r611[0];     // Catch: Throwable -> L43
    L44:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("ieDf593G+aih6NjM1eLHkqc=\n", "z4Gsk5aQpuE=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        File r625 = new File(r42.getFilesDir(), u40.a("UeqJQd0Hbslf4o1e5y1k3FrjjkvhGQ==\n", "No/sKoJyAr0=\n"));     // Catch: Throwable -> L120
        r625.mkdirs();     // Catch: Throwable -> L120
        gn.c = new FastKV.Builder(r625.getAbsolutePath(), u40.a("ZPVLSZMTxpJ4xE5/mh/Kv3T6W36b\n", "F5s4Fv56peA=\n")).build();     // Catch: Throwable -> L120
    L121:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("WQ6+l0yFyM93DISpY57PxH8fvrpuhsrLfwiw\n", "Hmvb/A/qpqk=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        goto L46
    L187:
        a(r29);
    }
}
