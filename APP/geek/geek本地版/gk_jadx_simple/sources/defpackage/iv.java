package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.drawable.C0004;
import android.widget.TextView;
import androidx.appcompat.widget.C0014;
import androidx.coordinatorlayout.widget.C0021;
import androidx.core.content.C0024;
import androidx.emoji2.text.C0026;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0031;
import androidx.savedstate.C0036;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0039;
import androidx.viewpager2.adapter.C0043;
import com.github.megatronking.stringfog.C0048;
import com.github.megatronking.stringfog.xor.C0045;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.carousel.C0052;
import com.google.android.material.carousel.C0055;
import com.google.android.material.chip.C0056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iv implements hm {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ iv(Object r6, Object r7, Object r8, int r9) {
        this.a = r9;
        this.b = r6;
        this.c = r7;
        this.d = r8;
        int r4 = C0036.m144("ۤۥ۠");
        long r2 = 0;
    L3:
        switch(r4) {
            case 1746783: goto L5;
            case 1748737: goto L7;
            case 1748764: goto L16;
            case 1750690: goto L15;
            case 1751679: goto L18;
            case 1751684: goto L12;
            default: goto L3;
        };
    L5:
        return;
    L7:
        if ((C0028.f28 - (C0048.f48 / (-3093))) >= 0) goto L8;
        r4 = C0046.m186("۟ۢۢ");
        goto L3
    L8:
        C0024.f24 = 59;
        String r0 = "ۦۦۨ";
    L9:
        r4 = C0004.m16(r0);
        goto L3
    L12:
        if ((C0039.f39 ^ (C0021.f21 / (-4507))) >= 0) goto L13;
        r4 = C0037.m149("ۤۥ۠");
        goto L3
    L13:
        r4 = C0056.m226("۟ۦ");
        goto L3
    L15:
        long r02 = Long.parseLong(C0052.m211("dJExMFunmGCaOnXNd9"));
        r4 = (C0026.f26 | C0014.f14) + 1748913;
        r2 = r02;
        goto L3
    L16:
        System.out.println(r2);
        r0 = "۟ۢۢ";
        goto L9
    L18:
        if (C0045.m181() > 0) goto L7;
        if (C0055.m223() < 0) goto L22;
        C0043.m172();
        r4 = C0031.m127("ۣۣۡ");
        goto L3
    L22:
        r0 = "ۣۣۤ";
        goto L9
    }

    @Override // defpackage.hm
    public final Object a() {
        int r4 = this.a;
        Object r2 = this.d;
        Object r1 = this.c;
        Object r0 = this.b;
        switch(r4) {
            case 0: goto L73;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        TextView r02 = (TextView) r0;
        LinkedHashSet r12 = (LinkedHashSet) r1;
        kv r22 = (kv) r2;
        boolean r3 = ip.i(r02.getText(), u40.a("mHqUvPsc\n", "ffUFVXudxQ0=\n"));
        boolean r42 = r12.isEmpty();
        qh r5 = h40.m;
        if (r42 == false) goto L9;
        r02.setText(u40.a("BXsRYv7v\n", "4PSAi35uQhc=\n"));
        r02.setEnabled(false);
        r02.animate().alpha(0.5f).setDuration(200).start();
        h40 r13 = new h40(r02, r5);
        i40 r32 = new i40(((Number) r22.f(Float.valueOf(15.0f))).floatValue());
        r32.b(200.0f);
        r32.a(1.0f);
        r13.j = r32;
        r13.h();
    L8:
        return vh.n;
    L9:
        r02.setText("发送 (" + r12.size() + ")");
        r02.setEnabled(true);
        if (r3 == false) goto L8;
        r02.animate().alpha(1.0f).setDuration(200).start();
        h40 r14 = new h40(r02, r5);
        r14.j = z30.f(0.0f, 200.0f, 0.6f);
        r14.h();
        goto L8
    L12:
        String r03 = (String) r0;
        ContentValues r15 = (ContentValues) r1;
        XC_MethodHook.MethodHookParam r23 = (XC_MethodHook.MethodHookParam) r2;
        if (r03.equals(u40.a("k1KBG+7CvKCK\n", "5T3oeIur0sY=\n")) == false) goto L15;
    L18:
        jv.a(r15);
    L20:
        if (r03.equals(u40.a("dNo07rw54Q==\n", "Gb9Hnd1ehF0=\n")) == false) goto L63;
        Integer r04 = r15.getAsInteger(u40.a("psSRFg==\n", "0r3hc5OOurQ=\n"));
        if (r04 == null) goto L38;
        int r05 = r04.intValue();
    L25:
        if (z30.q("VM5I0Th3oIlTxw==\n", "P6sxjkoSw+g=\n", gn.a) == false) goto L331;
        if (r05 < 10000) goto L331;
        String r06 = r15.getAsString(u40.a("nC/PdYsowg==\n", "/0ChAe5Gtk8=\n"));
        if (r06 != null) goto L32;
        r06 = "";
    L32:
        if (b50.B(r06, u40.a("ErapFcpV\n", "9CQN8FHLHKU=\n"), false) == false) goto L331;
        if (b50.B(r06, u40.a("7DbFZh1AbNqWb98G\n", "CItlgI/kiUE=\n"), false) == true) goto L331;
        if (b50.B(r06, u40.a("FB57eOsFL2QBHWs8\n", "bXEOWJlgTAU=\n"), true) == true) goto L331;
        Long r07 = r15.getAsLong(u40.a("mn2sR5Y=\n", "9w7LDvLCon8=\n"));
        if (r07 == null) goto L59;
        long r08 = r07.longValue();
    L43:
        if (r08 != 0) goto L56;
        Object r09 = r23.args[3];
        if ((r09 instanceof Object[]) == false) goto L60;
        Object[] r010 = (Object[]) r09;
    L47:
        if (r010 == null) goto L61;
        Object r011 = r010[0];
        if (r011 == null) goto L61;
        String r012 = r011.toString();
        if (r012 == null) goto L61;
        Long r013 = b50.S(r012);
        if (r013 == null) goto L61;
        r08 = r013.longValue();
    L61:
        r08 = 0;
        goto L56
    L60:
        r010 = null;
    L56:
        if (r08 == 0) goto L58;
        Map r33 = i9.b;
        ip.n(u40.a("WVcPEliFB9QKWw8COIQF0VsYREhb3g==\n", "ZTBqZnX3YqI=\n"), r33);
        r33.put(Long.valueOf(r08), Boolean.TRUE);
        gn.f(String.valueOf(r08), true);
    L58:
        r23.setResult(1);
        goto L331
    L59:
        r08 = 0;
    L331:
        return vh.n;
    L38:
        r05 = 0;
        goto L25
    L63:
        if (r03.equals(u40.a("zENE0VBNvELUX1nXTU0=\n", "uiwtsjU5ziM=\n")) == false) goto L331;
        Long r014 = r15.getAsLong(u40.a("C/6CGzGz\n", "aJPxfHjXGkM=\n"));
        if (r014 == null) goto L70;
    L66:
        long r015 = r014.longValue();
    L68:
        if (r015 == 0) goto L331;
        gn.a.getClass();
        gn.f("voice_trans_" + r015, true);
        d9.b.post(new od(4));
        goto L331
    L70:
        r014 = r15.getAsLong(u40.a("ArjI1ks=\n", "b8uvny/J3kU=\n"));
        if (r014 != null) goto L66;
        r015 = 0;
        goto L68
    L15:
        if (r03.equals(u40.a("a3wMJ9L0fD5y\n", "HRNlRLedElg=\n")) == true) goto L18;
        if (r03.equals(u40.a("FxRZVmAF7A==\n", "enEqJQFiiZQ=\n")) == false) goto L20;
    L73:
        String r016 = (String) r0;
        ContentValues r16 = (ContentValues) r1;
        XC_MethodHook.MethodHookParam r24 = (XC_MethodHook.MethodHookParam) r2;
        if (r016.equals(u40.a("X5Z4i30hsMNG\n", "KfkR6BhI3qU=\n")) == false) goto L76;
    L79:
        jv.a(r16);
    L81:
        if (r016.equals(u40.a("Kwa2sSxQog==\n", "RmPFwk03x/A=\n")) == false) goto L288;
        Integer r017 = r16.getAsInteger(u40.a("T7l24g==\n", "O8AGh8ywFWo=\n"));
        if (r017 == null) goto L174;
        int r43 = r017.intValue();
    L85:
        Integer r018 = r16.getAsInteger(u40.a("BkAq3Lwx\n", "bzN5udJVreg=\n"));
        if (r018 == null) goto L175;
        int r52 = r018.intValue();
    L89:
        if (ip.i(r24.method.getName(), u40.a("+EWedZg3N7/lQ6J+qSwOsP1CjmQ=\n", "kSvtEOpDYNY=\n")) == false) goto L91;
    L92:
        ArrayList r019 = jv.a;
        String r020 = r16.getAsString(u40.a("nM7kHNxMxg==\n", "/6GKaLkisjA=\n"));
        if (r020 != null) goto L308;
        String r6 = "";
    L96:
        if (r43 == 436207665) goto L104;
        if (r43 == 469762097) goto L104;
        if (r43 != 49) goto L107;
        if (b50.B(r6, u40.a("Y7f0YGLkMJt3/edjcqRy0We85WZ+tn7acKPhczS2cNpzreVuNKx613Gm8mRzsXHTdq7r\n", "FM+EARveH7Q=\n"), false) == true) goto L104;
    L107:
        if (r43 != 419430449) goto L109;
    L114:
        if (r52 == 0) goto L116;
    L138:
        if (r43 == 49) goto L142;
        if (r43 == 57) goto L142;
    L150:
        if (r43 == 1) goto L152;
    L160:
        if (r52 == 0) goto L162;
    L332:
        return vh.n;
    L162:
        if (r43 != 1) goto L332;
        Map r021 = i9.e;
        if (r021.size() > 1000) goto L313;
    L166:
        Long r022 = r16.getAsLong(u40.a("B/xvXXymufI=\n", "ao8IDgrU8JY=\n"));
        if (r022 == null) goto L228;
    L168:
        long r25 = r022.longValue();
    L170:
        if (r25 != 0) goto L172;
    L231:
        String r023 = r16.getAsString(u40.a("LrVYiRWS4Q==\n", "Tdo2/XD8lfc=\n"));
        if (r023 != null) goto L303;
        String r26 = "";
    L234:
        i00 r44 = new i00();
        r44.b = "";
        String r024 = r16.getAsString(u40.a("GXdLCG/i\n", "bRYnYwqQIRg=\n"));
        if (r024 != null) goto L302;
        String r34 = "";
    L237:
        boolean r53 = b50.C(r34, u40.a("ZYvRTuiksF9I\n", "Jei5L5zW3zA=\n"));
        if (z30.q("J7hvx67wXuITr3Poo/x15imkYfe94XXiIg==\n", "TN0WmM+FKo0=\n", gn.a) == false) goto L256;
        String r62 = gn.d(u40.a("Op1XnmcHLFEOikuxagsHVTSBWa50Fg==\n", "UfguwQZyWD4=\n"), u40.a("1FVo0Ul6Zj6MaSWRZA==\n", "McnANNntSto=\n"));
        if (r62.length() <= 0) goto L256;
        String r025 = u40.a("+Xv32l5Mch0jCg==\n", "olcYZtIwkZ0=\n");
        ip.o("pattern", r025);
        Pattern r026 = Pattern.compile(r025);
        ip.n("compile(...)", r026);
        Matcher r7 = r026.matcher(r62);
        if (r7.find() == true) goto L250;
        List r027 = ip.C(r62.toString());
    L244:
        ArrayList r63 = new ArrayList();
        Iterator r72 = r027.iterator();
    L246:
        if (r72.hasNext() == false) goto L255;
        Object r17 = r72.next();
        if (b50.H((String) r17) == true) goto L246;
        r63.add(r17);
        goto L246
    L255:
        if (r63.isEmpty() == true) goto L256;
        int r73 = r63.size();
        int r18 = 0;
    L282:
        if (r18 >= r73) goto L256;
        Object r028 = r63.get(r18);
        r18 = r18 + 1;
        if (b50.B(r26, (String) r028, true) == false) goto L282;
        gn r029 = gn.a;
        String r19 = u40.a("PHFgmu2GHjMIZny14Io1NzJtbqr+lzUoMmxt\n", "VxQZxYzzalw=\n");
        String r64 = u40.a("TkFvOroidDEVD11x3RwcXCFMLFWdVgoqQ0JE\n", "pubJ3zWzkbQ=\n");
        r029.getClass();
        r44.b = gn.d(r19, r64);
        boolean r030 = true;
    L257:
        if (r030 == true) goto L270;
        if (r53 == false) goto L270;
        if (z30.q("W7sK48EuM4xvrBbMzCIYgkQ=\n", "MN5zvKBbR+M=\n", gn.a) == false) goto L270;
        String r110 = gn.d(u40.a("pzbQkGKgA560Os0=\n", "zFOpzw/ZXOk=\n"), "");
        if (b50.B(r26, u40.a("nup522eds4Rktg==\n", "3gzwW4EBOmA=\n"), false) == false) goto L264;
    L269:
        r44.b = gn.d(u40.a("GbtUv0vH2zMtrEiQRsvwKBemWQ==\n", "ct4t4Cqyr1w=\n"), u40.a("VNF0bmtK\n", "skXCi+P6SwE=\n"));
        r030 = true;
        goto L270
    L264:
        if (b50.B(r26, u40.a("TeZDFg==\n", "DacveupTWx4=\n"), true) == true) goto L269;
        if (r110.length() <= 0) goto L270;
        if (b50.B(r26, r110, false) == true) goto L269;
    L270:
        if (r030 == true) goto L275;
        if (r53 == true) goto L275;
        if (z30.q("2sl+YFVd1j3u3mJPWFH9NdTCYk1VRA==\n", "sawHPzQoolI=\n", gn.a) == false) goto L275;
        r44.b = gn.d(u40.a("cr7NkgrcE85GqdG9B9A4xny10b8KxTjVfKPA\n", "Gdu0zWupZ6E=\n"), u40.a("01RzDVSdnuadOFpnP7HTlYlQBUJXyOv00Ed8D36gmPq3\n", "Ndzi6tote3o=\n"));
        r030 = true;
    L275:
        if (r030 == false) goto L332;
        if (((CharSequence) r44.b).length() <= 0) goto L286;
        boolean r031 = true;
    L279:
        if (r031 == false) goto L332;
        d9.b.postDelayed(new t5(r34, 6, r44), 1500);
        goto L332
    L286:
        r031 = false;
        goto L279
    L250:
        ArrayList r111 = new ArrayList(10);
        int r032 = 0;
    L251:
        r111.add(r62.subSequence(r032, r7.start()).toString());
        r032 = r7.end();
        if (r7.find() == true) goto L251;
        r111.add(r62.subSequence(r032, r62.length()).toString());
        r027 = r111;
    L256:
        r030 = false;
        goto L257
    L302:
        r34 = r024;
        goto L237
    L303:
        r26 = r023;
        goto L234
    L172:
        if (i9.e.putIfAbsent(Long.valueOf(r25), Boolean.TRUE) == null) goto L231;
    L228:
        r022 = r16.getAsLong(u40.a("uxRI6f9C1L+1Aw==\n", "2GYtiIsngNY=\n"));
        if (r022 != null) goto L168;
        r25 = 0;
        goto L170
    L313:
        r021.clear();     // Catch: Throwable -> L298
        goto L166
    L152:
        if (r52 != 1) goto L160;
        if (z30.q("T9vxEOR5/Bp73/wQ434=\n", "JL6IT4wQmH8=\n", gn.a) == false) goto L160;
        String r033 = r16.getAsString(u40.a("DGve5+/B2g==\n", "bwSwk4qvris=\n"));
        if (r033 != null) goto L305;
        String r65 = "";
    L159:
        if (b50.B(r65, u40.a("Cg==\n", "SjqBHA2hMlk=\n"), false) == false) goto L160;
        byte[] r034 = r16.getAsByteArray(u40.a("uOf2nxcPtYs=\n", "1JGU6nFp0Pk=\n"));
        if (r034 == null) goto L160;
        Charset r8 = c9.a;
        d4 r035 = i00.a(new i00(u40.a("h4sVSpA+JR7SmRUBy3V9TZLWTl6XLiQXyYYITJdl\n", "u+phP+NbV3I=\n")), new String(r034, r8));
        if (r035 == null) goto L160;
        String r036 = (String) ((ft) r035.t()).get(1);
        String r35 = r16.getAsString(u40.a("m+0ODkZJ\n", "74xiZSM71gA=\n"));
        if (r35 != null) goto L304;
        String r74 = "";
    L216:
        i00 r36 = i9.j;
        r36.getClass();
        String r37 = ((Pattern) r36.b).matcher(r65).replaceAll("");
        ip.n("replaceAll(...)", r37);
        String r38 = b50.T(r37).toString();
        if (r38.length() != 0) goto L219;
        r38 = " ";
    L219:
        String r39 = z30.j("<msg><appmsg><title><![CDATA[", r38, "]]></title><type><![CDATA[57]]></type></appmsg></msg>");
        String r037 = z30.j("<msgsource><atuserlist>", r036, "</atuserlist></msgsource>");
        ConcurrentHashMap r66 = i9.d;
        byte[] r82 = r037.getBytes(r8);
        ip.n(u40.a("v50ddISDioLw1kcY1A==\n", "2PhpNv337/E=\n"), r82);
        int r9 = r82.length;
        byte[] r10 = new byte[74 - (0 - r9)];
        r10[0] = 123;
        int r038 = 1;
    L221:
        if (r038 >= 8) goto L223;
        r10[r038] = 0;
        r038 = r038 + 1;
        goto L221
    L223:
        r10[8] = 122;
        System.arraycopy(r82, 0, r10, 9, r82.length);
        int r039 = 9 - (0 - r82.length);
        int r83 = r82.length;
    L225:
        if (r039 >= (((r83 + 3) + 73) - 3)) goto L227;
        r10[r039] = 0;
        r039 = 0 - ((0 - r039) - 1);
        goto L225
    L227:
        r10[((r9 - 13) + 73) + 13] = 125;
        r66.put(r74, r10);
        d9.b.post(new t5(r74, 5, r39));
        r24.setResult(1L);
        goto L160
    L304:
        r74 = r35;
        goto L216
    L305:
        r65 = r033;
    L142:
        if (r52 != 1) goto L150;
        String r040 = r16.getAsString(u40.a("rytyMUFF\n", "20oeWiQ301I=\n"));
        if (r040 != null) goto L146;
        r040 = "";
    L146:
        byte[] r041 = (byte[]) i9.d.remove(r040);
        if (r041 == null) goto L150;
        r16.put(u40.a("HCZyFJOo7Lg=\n", "cFAQYfXOico=\n"), r041);     // Catch: Throwable -> L300
        goto L150
    L116:
        if (z30.q("lXmx9KNOQl6haLrKrEhQVIxDp8U=\n", "/hzIq8I7NjE=\n", gn.a) == false) goto L138;
        String r042 = r16.getAsString(u40.a("erhpp/MF\n", "DtkFzJZ3Jdw=\n"));
        if (r042 != null) goto L120;
        r042 = "";
    L120:
        ClassLoader r102 = d9.a;
        if (r102 == null) goto L138;
        b50.C(r042, u40.a("6O0tMy1I3W/F\n", "qI5FUlk6sgA=\n"));
        u40.a("U2qqnf0TNQ==\n", "MAXE6Zh9QVs=\n");
        u40.a("fcle/CySeJpgzA==\n", "Cagyl0ngL+I=\n");
        u40.a("bFHpaiNW\n", "AD6IDkYks+U=\n");
        String r310 = b50.Q(b50.O(r6, u40.a("ION9T1euBwpu/msQBfw6LFjWW29i\n", "HJcPLjndYW8=\n")), u40.a("JJIi\n", "ec8crK6sUzM=\n"));     // Catch: Throwable -> L192
        if (r310.equals(r6) == false) goto L307;
        String r92 = b50.Q(b50.O(r6, u40.a("8HvucW/+mSq+Zvgu\n", "zA+cEAGN/08=\n")), u40.a("h04yfMhdvJ7eEy9qlw==\n", "u2FGDqkzz/g=\n"));     // Catch: Throwable -> L192
    L126:
        String r311 = b50.Q(b50.O(r6, u40.a("oOKLFGb6is/o/5YbYe3Xkr3NujFJ3aj1\n", "nJb5dQiJ6a4=\n")), u40.a("2+Yh\n", "hrsfc8I1ES4=\n"));     // Catch: Throwable -> L192
        if (r311.equals(r6) == false) goto L130;
        r311 = b50.Q(b50.O(r6, u40.a("nM0AoKQ6FfLU0B2voy1I\n", "oLlywcpJdpM=\n")), u40.a("rE/UlS4Z9PHxFMmIIR7jrA==\n", "kGCg5093h5I=\n"));     // Catch: Throwable -> L192
    L130:
        if (r311.equals(r6) == false) goto L306;
        String r84 = b50.Q(b50.O(r6, u40.a("eu6k7qBDsZQy87nhp1Tuy2fBlcuPZJGs\n", "RprWj84w0Pc=\n")), u40.a("5qcV\n", "u/orrZiGkek=\n"));     // Catch: Throwable -> L192
    L132:
        String r312 = b50.Q(b50.O(r6, u40.a("nPEys3nKEK3j0xaCBq0=\n", "oJdX1kf2MfY=\n")), u40.a("Jt8S\n", "e4IsTFoOw9s=\n"));     // Catch: Throwable -> L192
        if (r312.equals(r6) == false) goto L136;
        r312 = b50.Q(b50.O(r6, u40.a("R6SuFOw=\n", "e8LLcdIgkrY=\n")), u40.a("sPS8FHFE\n", "jNvacRR6nNw=\n"));     // Catch: Throwable -> L192
    L136:
        if (r92.length() == 0) goto L138;
        if (r84.length() == 0) goto L138;
        if (r312.length() == 0) goto L138;
        Integer r313 = b50.R(r312);     // Catch: Throwable -> L192
        if (r313 == null) goto L194;
        int r75 = r313.intValue();     // Catch: Throwable -> L192
    L183:
        Class r314 = XposedHelpers.findClassIfExists(pb0.l, r102);     // Catch: Throwable -> L192
        if (r314 == null) goto L138;
        int r11 = pb0.P;     // Catch: Throwable -> L192
        Constructor<?>[] r122 = r314.getConstructors();     // Catch: Throwable -> L192
        ip.n(u40.a("eD9BNH9EAdttL1YDf1gBhzF0G14=\n", "H1o1dxAqcq8=\n"), r122);     // Catch: Throwable -> L192
        int r132 = r122.length;     // Catch: Throwable -> L192
        int r67 = 0;
    L186:
        if (r67 >= r132) goto L196;
        Constructor<?> r315 = r122[r67];     // Catch: Throwable -> L192
        if (r315.getParameterTypes().length == r11) goto L189;
        r67 = ((r67 - 9) + 1) + 9;
    L189:
        if (r315 != null) goto L310;
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), u40.a("wrlRPI/UIhI=\n", "lsswUvyyR2A=\n"));     // Catch: Throwable -> L192
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), "❌ 未找到参数个数为 " + r11 + " 的转账构造器！");     // Catch: Throwable -> L192
        goto L138
    L310:
        Object[] r043 = (Object[]) pb0.Y0.d(r84, r92, Integer.valueOf(r75), r042);     // Catch: Throwable -> L205
        if (r043.length == 0) goto L309;
        Object r044 = r315.newInstance(Arrays.copyOf(r043, r043.length));     // Catch: Throwable -> L205
        if (r044 == null) goto L207;
        uv.d(r102, r044);     // Catch: Throwable -> L205
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), u40.a("EebDrB7Jtis=\n", "RZSiwm2v01k=\n"));     // Catch: Throwable -> L205
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), "✅ 成功发送收款请求: ￥" + (((double) r75) / 100.0d));     // Catch: Throwable -> L205
        gn.a.getClass();     // Catch: Throwable -> L205
        Application r045 = gn.b;     // Catch: Throwable -> L205
        if (r045 == null) goto L309;
        new Handler(Looper.getMainLooper()).post(new ks(r045, r75, 3));     // Catch: Throwable -> L205
        goto L309
    L207:
        String r046 = u40.a("v17D4H2dFhauXtDhfA==\n", "6yyijg77c2Q=\n");     // Catch: Throwable -> L205
        String r316 = u40.a("TsRRWJG0qH8s+Tj35s+gE0n2ZJDGi8kyHbFp3ZiWoH4TzTjj6c+sKkjhZ5/ekA==\n", "rFndeHcqLJY=\n");     // Catch: Throwable -> L205
        ip.o(u40.a("xwGO\n", "s2Dpd1+FjZU=\n"), r046);     // Catch: Throwable -> L205
        ip.o(u40.a("53vj\n", "igiEy7e+YPk=\n"), r316);     // Catch: Throwable -> L205
    L309:
    L196:
        r315 = null;
        goto L189
    L194:
        r75 = 0;
        goto L183
    L306:
        r84 = r311;
        goto L132
    L307:
        r92 = r310;
    L193:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("joxZEJrdGJafjEoRmw==\n", "2v44fum7feQ=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        goto L138
    L109:
        if (r43 == 436207665) goto L114;
        if (r43 != 49) goto L138;
        if (b50.B(r6, u40.a("p9UcAIM7B+zpyApf\n", "m6FuYe1IYYk=\n"), false) == false) goto L138;
    L104:
        if (z30.q("jmBNJDhb1X6c\n", "5QU0e1QuthU=\n", gn.a) == false) goto L107;
        ContentValues r047 = new ContentValues(r16);
        hs r317 = hs.a;
        hs.b(r047);
        goto L107
    L308:
        r6 = r020;
        goto L96
    L91:
        if (ip.i(r24.method.getName(), u40.a("k07OlC/Z\n", "+iC98V2tSjk=\n")) == false) goto L332;
    L175:
        r52 = 0;
        goto L89
    L174:
        r43 = 0;
        goto L85
    L288:
        if (r016.equals(u40.a("JfTq1Fhv3/U96PfSRW8=\n", "U5uDtz0brZQ=\n")) == false) goto L332;
        Long r048 = r16.getAsLong(u40.a("nrgiPRmA\n", "/dVRWlDkn8A=\n"));
        if (r048 == null) goto L295;
    L291:
        long r049 = r048.longValue();
    L293:
        if (r049 == 0) goto L332;
        gn.a.getClass();
        gn.f("voice_trans_" + r049, true);
        d9.b.post(new od(3));
        goto L332
    L295:
        r048 = r16.getAsLong(u40.a("pVYpWII=\n", "yCVOEeaPu+w=\n"));
        if (r048 != null) goto L291;
        r049 = 0;
        goto L293
    L76:
        if (r016.equals(u40.a("B+C54LKNP1Ae\n", "cY/Qg9fkUTY=\n")) == true) goto L79;
        if (r016.equals(u40.a("RT1r2B9lKg==\n", "KFgYq34CT1g=\n")) == false) goto L81;
        goto L79
    }
}
