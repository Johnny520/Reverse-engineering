package defpackage;

import android.app.C0001;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0008;
import androidx.appcompat.widget.C0013;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0031;
import androidx.recyclerview.widget.C0032;
import androidx.startup.C0037;
import androidx.versionedparcelable.C0040;
import androidx.versionedparcelable.C0041;
import com.github.megatronking.stringfog.C0047;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.floatingactionbutton.C0060;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j9 implements hm {
    public final int a;
    public final XC_MethodHook.MethodHookParam b;

    public /* synthetic */ j9(XC_MethodHook.MethodHookParam r4, int r5) {
        this.a = r5;
        this.b = r4;
        int r2 = C0040.m160("ۣۤۤ");
        Integer r1 = null;
    L3:
        switch(r2) {
            case 1746782: goto L5;
            case 1749725: goto L20;
            case 1749857: goto L18;
            case 1750691: goto L10;
            case 1751740: goto L14;
            case 1753538: goto L23;
            default: goto L3;
        };
    L5:
        System.out.println(r1);
        if (C0051.f51 >= 0) goto L8;
    L8:
        r2 = C0037.m149("ۦۣ۟");
        goto L3
    L10:
        if (C0073.m295() > 0) goto L14;
        r2 = C0032.m130("ۢۨۧ");
    L14:
        if ((C0041.f41 + (C0008.f8 | (-2103))) <= 0) goto L15;
        String r0 = "ۦۣ۟";
    L17:
        r2 = C0031.m127(r0);
        goto L3
    L15:
        C0047.m191();
        r2 = C0001.m5("۠ۥ");
        goto L3
    L18:
        Integer r02 = Integer.decode(C0060.m243("fdBnqFsqsBZx4GgtiWqlUMVUcgO"));
        r2 = C0013.m53("۟ۢۡ");
        r1 = r02;
        goto L3
    L20:
        if (C0032.f32 >= 0) goto L21;
        r2 = (C0037.f37 ^ C0028.f28) ^ 1750771;
        goto L3
    L21:
        r0 = "ۡ۠ۥ";
        goto L17
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x0473 -> B:59:0x0121). Please report as a decompilation issue!!! */
    private final Object b() {
        Class r2 = n9.a;
        if (ac.a == true) goto L5;
        ac.a();
        ac.a = true;
    L5:
        ConcurrentHashMap r22 = i9.a;
        XC_MethodHook.MethodHookParam r0 = this.b;
        i9.c = r0.thisObject;
        if (ip.i(n9.c, Boolean.valueOf(ac.l)) == true) goto L8;
        n9.c = Boolean.valueOf(ac.l);
    L8:
        Object[] r3 = r0.args;
        Object r23 = r3[0];
        if ((r23 instanceof Integer) == false) goto L17;
        u40.a("JWG3YuOK7j4le68uoYyvMypnry63hq8+JHr2YLaF43A/batr44LgJCd9tSCKh/s=\n", "SxTbDsPpj1A=\n");
        int r32 = ((Integer) r23).intValue();
        Object r24 = r0.args[1];
    L11:
        Object r9 = r24;
        int r17 = r32;
    L12:
        if (r9 == null) goto L16;
        if (r17 == (-1)) goto L16;
        if (in.i == null) goto L494;
    L486:
        Method r25 = in.i;     // Catch: Throwable -> L186
        if (r25 == null) goto L185;
        Object r26 = r25.invoke(r0.thisObject, new Object[]{Integer.valueOf(r17)});     // Catch: Throwable -> L186
    L30:
        Object r33 = r26;
    L31:
        if (r33 == null) goto L16;
        in r27 = in.a;
        in.a(r33);
        String r28 = pb0.J0;
        if (r28.length() > 0) goto L492;
    L189:
        long r18 = 0;
    L37:
        Field r29 = in.d;
        if (r29 == null) goto L190;
        int r8 = r29.getInt(r33);
    L40:
        Field r210 = in.f;
        if (r210 == null) goto L191;
        Object r211 = r210.get(r33);
    L44:
        if ((r211 instanceof String) == false) goto L192;
        String r5 = (String) r211;
    L46:
        if (r5 != null) goto L48;
        r5 = "";
    L48:
        Field r212 = in.c;
        if (r212 == null) goto L193;
        long r6 = r212.getLong(r33);
    L51:
        Field r213 = in.e;
        if (r213 == null) goto L194;
        int r4 = r213.getInt(r33);
    L54:
        i00 r232 = new i00();
        Field r214 = in.j;
        if (r214 == null) goto L198;
        Object r215 = r214.get(r9);     // Catch: Throwable -> L195
        if ((r215 instanceof View) == false) goto L196;
        View r216 = (View) r215;     // Catch: Throwable -> L195
    L59:
        if (r216 == null) goto L61;
    L63:
        r232.b = r216;
        if (r216 == null) goto L16;
        Object r217 = r216.getTag(2114322432);
        if ((r217 instanceof e9) == false) goto L207;
        e9 r10 = (e9) r217;
    L68:
        if (r10 != null) goto L71;
        r10 = new e9();
        r10.g = new g9();
        ((View) r232.b).setTag(2114322432, r10);
    L71:
        if (ac.d == true) goto L73;
    L208:
        f9 r218 = null;
    L75:
        r10.h = r218;
        ConcurrentHashMap r219 = r9.a;
        View r220 = (View) r232.b;
        ip.o(u40.a("KFfghhoxr2s=\n", "QSOF60xYyhw=\n"), r220);
        u40.a("K9s=\n", "XbMHOOijGLQ=\n");
        if (r10.a == false) goto L78;
    L79:
        ConcurrentHashMap r221 = r9.a;
        View r222 = (View) r232.b;
        ip.o(u40.a("/rW14K1Z1Nk=\n", "l8HQjfswsa4=\n"), r222);
        u40.a("eeo=\n", "D4JLp9b3wN4=\n");
        if (ac.e == true) goto L82;
    L83:
        ConcurrentHashMap r223 = r9.a;
        View r224 = (View) r232.b;
        boolean r92 = ac.f;
        boolean r11 = ac.g;
        boolean r12 = ac.h;
        ip.o(u40.a("Oj4W4ka4AcU=\n", "U0pzjxDRZLI=\n"), r224);
        u40.a("48E=\n", "lalezdXUngg=\n");
        u40.a("2plbNA98\n", "rvg3X2oOtsY=\n");
        View r13 = r10.b;
        if (r13 != null) goto L86;
    L95:
        if (r12 == false) goto L337;
        View r225 = r10.b;
        if (r225 != null) goto L99;
    L335:
        boolean r226 = false;
    L101:
        if (r226 == false) goto L337;
        if (r18 <= 0) goto L337;
        Date r93 = i9.i;
        r93.setTime(r18);
        TextView r112 = r10.c;
        if (r112 == null) goto L110;
        SimpleDateFormat r227 = (SimpleDateFormat) i9.h.get();
        if (r227 == null) goto L336;
        String r228 = r227.format(r93);
    L109:
        r112.setText(r228);
        goto L110
    L336:
        r228 = null;
    L110:
        TextView r229 = r10.c;
        if (r229 == null) goto L113;
        r229.setVisibility(0);
    L113:
        View r230 = (View) r232.b;
        boolean r113 = ac.i;
        ip.o(u40.a("Xipa2wBQzKk=\n", "N14/tlY5qd4=\n"), r230);
        u40.a("B3A=\n", "cRirEfIaxl8=\n");
        if ((r230 instanceof ViewGroup) == true) goto L340;
    L115:
        ip.g((View) r232.b, r10, r4, r6, r33, r8, r5);
        View r231 = (View) r232.b;
        ip.o(u40.a("C4P3NplFOd4=\n", "YveSW88sXKk=\n"), r231);
        u40.a("tKU=\n", "ws3/Q//J/m8=\n");
        u40.a("c2ooVxmB\n", "BwtEPHzz0Jg=\n");
        TextView r42 = r9.b(r231, r10, r8, r5);
        if (r42 != null) goto L363;
    L117:
        int r233 = System.identityHashCode(r0.thisObject);
        long r122 = System.currentTimeMillis();
        if (i9.g == r233) goto L120;
    L121:
        i9.g = r233;
    L122:
        n9.d = r122;
        Object r234 = ((View) r232.b).getTag(2114322449);
        if ((r234 instanceof Long) == false) goto L411;
        Long r235 = (Long) r234;
    L125:
        if (r235 == null) goto L412;
        long r43 = r235.longValue();
    L127:
        ((View) r232.b).setTag(2114322449, Long.valueOf(r6));
        if (ac.b == true) goto L130;
    L145:
        boolean r236 = false;
    L146:
        if (r236 == false) goto L438;
        vh.j((View) r232.b, r10);
        Object r237 = ((View) r232.b).getTag(2114387969);
        if ((r237 instanceof h40) == false) goto L432;
        h40 r238 = (h40) r237;
    L150:
        if (r238 != null) goto L152;
    L154:
        Object r239 = ((View) r232.b).getTag(2114387970);
        if ((r239 instanceof h40) == false) goto L433;
        h40 r240 = (h40) r239;
    L157:
        if (r240 != null) goto L159;
    L161:
        Object r241 = ((View) r232.b).getTag(2114387971);
        if ((r241 instanceof h40) == false) goto L434;
        h40 r242 = (h40) r241;
    L164:
        if (r242 != null) goto L166;
    L168:
        Object r243 = ((View) r232.b).getTag(2114453505);
        if ((r243 instanceof h40) == false) goto L435;
        h40 r244 = (h40) r243;
    L171:
        if (r244 != null) goto L173;
    L175:
        ((View) r232.b).setTranslationX(0.0f);
        ((View) r232.b).setTranslationY(0.0f);
        ((View) r232.b).setRotation(0.0f);
        ((View) r232.b).setRotationX(0.0f);
        ((View) r232.b).setRotationY(0.0f);
        ((View) r232.b).setScaleX(1.0f);
        ((View) r232.b).setScaleY(1.0f);
        ((View) r232.b).setAlpha(0.0f);
        if (ac.l == false) goto L437;
        ((View) r232.b).setTag(2114322440, Long.valueOf(r6));
        ((View) r232.b).setTag(2114322441, null);
        float r245 = ((View) r232.b).getContext().getResources().getDisplayMetrics().density * 120.0f;
        if (r8 != 1) goto L436;
        float r34 = r245;
    L482:
        ArrayList r246 = ob0.a;     // Catch: Throwable -> L182
        ob0.a((View) r232.b, r17, r34, r6);     // Catch: Throwable -> L182
    L183:
        ((View) r232.b).animate().alpha(1.0f).setDuration(250).start();
        goto L16
    L436:
        r34 = -r245;
        goto L482
    L437:
        ((View) r232.b).setTag(2114322440, null);
        long r44 = System.nanoTime();
        ((View) r232.b).setTag(2114322441, Long.valueOf(r44));
        ((View) r232.b).setLayerType(2, null);
        ((View) r232.b).getViewTreeObserver().addOnPreDrawListener(new m9(r232, r44));
        goto L16
    L173:
        if (r244.e == false) goto L175;
        r244.c();
        goto L175
    L435:
        r244 = null;
        goto L171
    L166:
        if (r242.e == false) goto L168;
        r242.c();
        goto L168
    L434:
        r242 = null;
        goto L164
    L159:
        if (r240.e == false) goto L161;
        r240.c();
        goto L161
    L433:
        r240 = null;
        goto L157
    L152:
        if (r238.e == false) goto L154;
        r238.c();
        goto L154
    L432:
        r238 = null;
        goto L150
    L438:
        View r247 = (View) r232.b;
        Object r35 = r247.getTag(2114387969);
        if ((r35 instanceof h40) == false) goto L467;
        h40 r36 = (h40) r35;
    L441:
        if (r36 != null) goto L443;
    L445:
        Object r37 = r247.getTag(2114387970);
        if ((r37 instanceof h40) == false) goto L468;
        h40 r38 = (h40) r37;
    L448:
        if (r38 != null) goto L450;
    L452:
        Object r39 = r247.getTag(2114387971);
        if ((r39 instanceof h40) == false) goto L469;
        h40 r310 = (h40) r39;
    L455:
        if (r310 != null) goto L457;
    L459:
        Object r311 = r247.getTag(2114453505);
        if ((r311 instanceof h40) == false) goto L470;
        h40 r312 = (h40) r311;
    L462:
        if (r312 != null) goto L464;
    L466:
        r247.setTag(2114322440, null);
        r247.setTag(2114322441, null);
        vh.j(r247, r10);
        goto L16
    L464:
        if (r312.e == false) goto L466;
        r312.c();
        goto L466
    L470:
        r312 = null;
        goto L462
    L457:
        if (r310.e == false) goto L459;
        r310.c();
        goto L459
    L469:
        r310 = null;
        goto L455
    L450:
        if (r38.e == false) goto L452;
        r38.c();
        goto L452
    L468:
        r38 = null;
        goto L448
    L443:
        if (r36.e == false) goto L445;
        r36.c();
        goto L445
    L467:
        r36 = null;
        goto L441
    L130:
        if (100000000 <= r18) goto L132;
    L413:
        boolean r248 = false;
    L134:
        if (r248 == false) goto L137;
        r18 = r18 * 1000;
    L137:
        if ((((r122 - 27) - r18) + 27) >= 2000) goto L414;
        boolean r313 = true;
    L139:
        if (r313 == false) goto L142;
        ((View) r232.b).getRootView().setTag(2115109017, Long.valueOf(r122));
    L142:
        if (r43 == r6) goto L415;
        boolean r249 = true;
    L144:
        if (r249 == false) goto L145;
        if (r313 == false) goto L419;
    L417:
        r236 = true;
        goto L146
    L419:
        if (ac.j == false) goto L145;
        Object r250 = ((View) r232.b).getRootView().getTag(2115109017);
        if ((r250 instanceof Long) == false) goto L430;
        Long r251 = (Long) r250;
    L423:
        if (r251 == null) goto L477;
        long r252 = r251.longValue();
    L426:
        if ((((3 + r122) - r252) - 3) >= 500) goto L431;
        boolean r253 = true;
    L428:
        if (r253 == false) goto L417;
    L431:
        r253 = false;
        goto L428
    L477:
        r252 = 0;
        goto L426
    L430:
        r251 = null;
        goto L423
    L415:
        r249 = false;
        goto L144
    L414:
        r313 = false;
        goto L139
    L132:
        if (r18 >= 10000000000L) goto L413;
        r248 = true;
        goto L134
    L412:
        r43 = -1;
        goto L127
    L411:
        r235 = null;
        goto L125
    L120:
        if ((((r122 - 13) - n9.d) + 13) <= 60000) goto L122;
    L363:
        i00 r123 = new i00();
        r123.b = r5;
        if (r8 != 1) goto L383;
        r123.b = t6.a;
    L367:
        if (ip.i(r123.b, r5) == true) goto L117;
        if (((CharSequence) r123.b).length() == 0) goto L117;
        if (b50.B((CharSequence) r123.b, u40.a("cA==\n", "TIds5iarzVs=\n"), false) == true) goto L117;
        r42.setTag(2115108897, r123.b);
        o9 r15 = new o9(r42, 0, r123);
        gn r254 = gn.a;
        String r314 = u40.a("EZxYSeRbfL0li0R3+2x9qxec\n", "evkhFpczE8o=\n");
        r254.getClass();
        if (gn.a(r314, false) == false) goto L410;
        if (r8 != 0) goto L410;
        if (b50.C(r5, u40.a("3oHHnhTl4vnz\n", "nuKv/2CXjZY=\n")) == false) goto L410;
        String r255 = gn.d("real_name_" + r123.b, "");
        if (r255.length() != 0) goto L409;
        r15.f("");
        ClassLoader r14 = d9.a;
        if (r14 == null) goto L117;
        a80.r(ip.c(wg.b), null, new q9(r123, r5, r14, r15, null), 3);
        goto L117
    L409:
        r15.f(r255);
    L410:
        r15.f("");
        goto L117
    L383:
        if (b50.C(r5, u40.a("DwYPftICw1ci\n", "T2VnH6ZwrDg=\n")) == false) goto L367;
        Object r256 = XposedHelpers.getObjectField(r33, u40.a("hHpbirabmuWMZ1uIpg==\n", "4hM+5tLE+Yo=\n"));     // Catch: Throwable -> L393
        if ((r256 instanceof String) == false) goto L392;
        String r257 = (String) r256;     // Catch: Throwable -> L393
    L387:
        if (r257 != null) goto L389;
    L388:
        r257 = "";
    L389:
        int r315 = b50.G(r257, u40.a("ucQ=\n", "g85zl+iW8Tk=\n"), 0, false, 6);
        if (r315 <= 0) goto L405;
        String r258 = r257.substring(0, r315);
        ip.n(u40.a("o3N/WwrlT0C3LjMGUL4=\n", "0AYdKH6XJi4=\n"), r258);
        r123.b = b50.T(r258).toString();
        goto L367
    L405:
        if (b50.B(r257, u40.a("AA==\n", "OpuvyOT2nw0=\n"), false) == false) goto L367;
        int r316 = b50.G(r257, u40.a("iQ==\n", "s1QUfqEJ1/g=\n"), 0, false, 6);
        if (r316 <= 0) goto L367;
        String r259 = r257.substring(0, r316);
        ip.n(u40.a("e3tnEaaF0tBvJitM/N4=\n", "CA4FYtL3u74=\n"), r259);
        r123.b = b50.T(r259).toString();
        goto L367
    L392:
        r257 = null;
    L394:
        Field r260 = in.h;
        if (r260 == null) goto L402;
        Object r261 = r260.get(r33);
    L398:
        if ((r261 instanceof String) == false) goto L403;
        r257 = (String) r261;
    L400:
        if (r257 != null) goto L389;
    L403:
        r257 = null;
        goto L400
    L402:
        r261 = null;
        goto L398
    L340:
        Map r124 = i9.b;
        Boolean r94 = (Boolean) r124.get(Long.valueOf(r6));
        if (r94 != null) goto L343;
        gn.a.getClass();
        r94 = Boolean.valueOf(gn.a(String.valueOf(r6), false));
        u40.a("pZSCRvHKE1r2mIJWkcsRX6fbyRzykQ==\n", "mfPnMty4diw=\n");
        r124.put(Long.valueOf(r6), r94);
    L343:
        if (r113 == true) goto L345;
    L360:
        TextView r262 = r10.d;
        if (r262 == null) goto L115;
        r262.setVisibility(8);
        goto L115
    L345:
        if (r6 == 0) goto L360;
        if (r94.equals(Boolean.TRUE) == false) goto L360;
        if (r10.d != null) goto L353;
        ViewGroup r95 = (ViewGroup) r230;
        float r114 = r95.getContext().getResources().getDisplayMetrics().density;
        TextView r125 = new TextView(r95.getContext());
        r125.setTextSize(11.0f);
        r125.setTextColor(-1);
        r125.setTypeface(Typeface.defaultFromStyle(1));
        int r132 = (int) (8.0f * r114);
        int r142 = (int) (3.0f * r114);
        r125.setPadding(r132, r142, r132, r142);
        r125.setGravity(17);
        GradientDrawable r133 = new GradientDrawable();
        r133.setColor(Color.parseColor(u40.a("Q05Qsd5CS8lQ\n", "YHpgge5ye/k=\n")));
        r133.setCornerRadius(6.0f * r114);
        r125.setBackground(r133);
        r10.d = r125;
        if ((r230 instanceof RelativeLayout) == false) goto L359;
        RelativeLayout.LayoutParams r96 = new RelativeLayout.LayoutParams(-2, -2);
        r96.addRule(12);
        r96.addRule(14);
        r96.bottomMargin = (int) (r114 * 12.0f);
        ((RelativeLayout) r230).addView(r125, r96);
        goto L353
    L359:
        r95.addView(r125);
    L353:
        TextView r263 = r10.d;
        if (r263 == null) goto L356;
        r263.setText(ac.k);
    L356:
        TextView r264 = r10.d;
        if (r264 == null) goto L115;
        r264.setVisibility(0);
        goto L115
    L99:
        if (r225.getVisibility() != 0) goto L335;
        r226 = true;
    L337:
        TextView r265 = r10.c;
        if (r265 == null) goto L113;
        r265.setVisibility(8);
        goto L113
    L86:
        if (r8 != 1) goto L324;
        boolean r266 = r92;
    L88:
        if (r266 == false) goto L329;
        r13.setVisibility(8);
        Object r267 = r13.getParent();
        if ((r267 instanceof View) == false) goto L328;
        View r268 = (View) r267;
    L92:
        if (r268 == null) goto L94;
        r268.setVisibility(8);
    L94:
        r13.setOnTouchListener(new p9(0));
        goto L95
    L328:
        r268 = null;
        goto L92
    L329:
        r13.setVisibility(0);
        Object r269 = r13.getParent();
        if ((r269 instanceof View) == false) goto L334;
        View r270 = (View) r269;
    L332:
        if (r270 == null) goto L94;
        r270.setVisibility(0);
        goto L94
    L334:
        r270 = null;
        goto L332
    L324:
        if (b50.C(r5, u40.a("+eE+j7suKF/U\n", "uYJW7s9cRzA=\n")) == true) goto L327;
        if (r11 == false) goto L327;
        r266 = true;
    L327:
        r266 = false;
        goto L88
    L82:
        if (r10.e == null) goto L83;
        if (r4 == 34) goto L83;
        Context r97 = r222.getContext();
        ip.l(r97);
        float r271 = r97.getResources().getDisplayMetrics().density;
        if (r9.b == r271) goto L250;
        r9.b = r271;
        r9.c = 13.0f * r271;
        r9.d = 4.0f * r271;
        r9.e = (int) (11.0f * r271);
        r9.f = (int) (r271 * 8.0f);
    L250:
        if (r4 != 1) goto L252;
    L296:
        View r272 = r10.e;
        ip.l(r272);
        r272.setStateListAnimator(null);     // Catch: Throwable -> L299
        r272.setOnTouchListener(new p9(1));     // Catch: Throwable -> L299
    L254:
        if (Build.VERSION.SDK_INT < 29) goto L301;
        int r273 = r97.getResources().getConfiguration().uiMode;
        if ((r273 & (r273 ^ (-49))) != 32) goto L301;
        boolean r98 = true;
    L258:
        int r134 = ac.p;
        gn r274 = gn.a;
        String r115 = u40.a("B2YTGENQOBQCZzUlUEAzHQlcHi9ATzQ=\n", "bANqRyUiUXE=\n");
        r274.getClass();
        int r143 = gn.b(r115, 0);
        if (r8 != 1) goto L304;
        if (r98 == false) goto L302;
        String r275 = ac.s;
    L262:
        int r126 = r9.a(r275);
        if (r98 == false) goto L303;
        String r276 = ac.t;
    L265:
        int r116 = r9.a(r276);
    L267:
        if (r4 != 1) goto L269;
    L270:
        String r135 = "bg_" + r8 + "_" + r98 + "_" + r134 + "_" + r143;
        ConcurrentHashMap r152 = i9.a;
        Drawable.ConstantState r277 = (Drawable.ConstantState) r152.get(r135);
        if (r277 != null) goto L280;
        GradientDrawable r16 = new GradientDrawable();
        if (r8 != 1) goto L314;
        float r278 = r9.c;
        float r2410 = r9.d;
        r16.setCornerRadii(new float[]{r278, r278, r278, r278, r2410, r2410, r278, r278});
        r16.setColors(new int[]{r126, r116});
        r16.setOrientation(GradientDrawable.Orientation.TL_BR);
    L275:
        if (r98 == false) goto L319;
        String r279 = "LTQy4yi31gpI\n";
        String r117 = "DgcBpW7xkEw=\n";
    L277:
        r277 = new RippleDrawable(ColorStateList.valueOf(r9.a(u40.a(r279, r117))), r16, null).getConstantState();
        if (r277 == null) goto L280;
        r152.put(r135, r277);
        goto L280
    L319:
        r279 = "e6aTFtblSh9o\n";
        r117 = "WJShJubVei8=\n";
        goto L277
    L314:
        if (r143 <= 0) goto L316;
        float r280 = r9.d;
        float r2411 = r9.c;
        r16.setCornerRadii(new float[]{r280, r280, r2411, r2411, r2411, r2411, r2411, r2411});
        r16.setColors(new int[]{r126, r116});
        r16.setOrientation(GradientDrawable.Orientation.TR_BL);
        goto L275
    L316:
        float r281 = r9.d;
        float r118 = r9.c;
        r16.setCornerRadii(new float[]{r281, r281, r118, r118, r118, r118, r118, r118});
        r16.setColor(r126);
        if (r98 == true) goto L275;
        r16.setStroke(1, r9.a(u40.a("cxkDk7Qlww==\n", "UFw21oFgghQ=\n")));
    L280:
        View r119 = r10.e;
        if (r119 == null) goto L288;
        if (r277 == null) goto L320;
        Drawable r282 = r277.newDrawable();
        if (r282 == null) goto L320;
        Drawable r283 = r282.mutate();
    L286:
        r119.setBackground(r283);
    L320:
        r283 = null;
    L288:
        if (r8 == 1) goto L290;
        if (r143 > 0) goto L290;
        if (r98 == true) goto L290;
        int r284 = -16777216;
    L490:
        XposedHelpers.callMethod(r10.e, u40.a("oBsZgDW/guO8EgKm\n", "035t1FDH9qA=\n"), new Object[]{Integer.valueOf(r284)});     // Catch: Throwable -> L473
    L292:
        View r285 = r10.e;
        if (r285 == null) goto L83;
        int r99 = r9.e;
        int r1110 = r9.f;
        r285.setPadding(r99, r1110, r99, r1110);
    L290:
        r284 = -1;
        goto L490
    L269:
        if (r4 != 822083633) goto L83;
    L303:
        r276 = ac.r;
        goto L265
    L302:
        r275 = ac.q;
        goto L262
    L304:
        if (r143 <= 0) goto L310;
        String r1111 = u40.a("07M8uphiHQ==\n", "8PIF/9lVXPw=\n");
        String r127 = u40.a("0A6fPooSQQ==\n", "8zmsfb9UB+4=\n");
        String r153 = u40.a("Myw66Kb3SQ==\n", "EBp4qp6xD24=\n");
        String r162 = u40.a("g6ztp73eUg==\n", "oJTYnv+bass=\n");
        String r2412 = u40.a("xfOlFQfkbg==\n", "5rKcVDegKOA=\n");
        String r2510 = u40.a("e06wFFAJ0g==\n", "WA30LRJMl4o=\n");
        String r2610 = u40.a("9ANif9f/pg==\n", "10UkPea8noc=\n");
        String r2710 = u40.a("m5GEo3HKVw==\n", "uNfCmzLyZUA=\n");
        String r286 = u40.a("g2x/AgYBKw==\n", "oCo5QTY2GCk=\n");
        String r292 = u40.a("10FRRpn5uQ==\n", "9AcXAqzN/78=\n");
        String r30 = u40.a("WeXsai8Nlg==\n", "eqSpLho1px0=\n");
        String r31 = u40.a("vbCdQn5KTQ==\n", "noHcAzp7dGo=\n");
        String r322 = u40.a("pyjVNvq4tw==\n", "hBnnD8z89fo=\n");
        String r332 = u40.a("RGnbdkVWfg==\n", "Z1nrQwQSSvM=\n");
        String r342 = u40.a("UPqjY1j5Vg==\n", "c8nlVmm7Y+4=\n");
        String r352 = u40.a("ZB9RdY+uqA==\n", "RyppQLnqnlo=\n");
        String r362 = u40.a("qhiwtgUQ3w==\n", "iVn2gzdUmvQ=\n");
        String r372 = u40.a("sjxJAqlcuw==\n", "kXoPMO1pjq8=\n");
        String r382 = u40.a("golaZfhIIg==\n", "oc8cVrp7Elg=\n");
        String r392 = u40.a("P2blGpqZAw==\n", "HCCjI6+pM84=\n");
        String r40 = u40.a("ft1Kf5QUOQ==\n", "XZsMPackCco=\n");
        String r41 = u40.a("oEtVEXwzVA==\n", "g3MXUk8HFd8=\n");
        String r422 = u40.a("LgjqlP3PGg==\n", "DTqroLn+W+I=\n");
        String r432 = u40.a("51gxkJLkJg==\n", "xGkJpKfSHoE=\n");
        String r442 = u40.a("OZMOXW2YSA==\n", "GqI8biyuDN0=\n");
        String r45 = u40.a("T0sm1H2e5w==\n", "bHkX5jyr04I=\n");
        String r46 = u40.a("4S+60b5jNQ==\n", "wh3444ZWAgw=\n");
        String r47 = u40.a("BMtx7DQISQ==\n", "J/9F3gY9Cuc=\n");
        String r48 = u40.a("HMdT2WQCqA==\n", "P/Fl6FYwmls=\n");
        String r49 = u40.a("fUcZ0YpGaA==\n", "XnEv4LJ3XI4=\n");
        String r50 = u40.a("32T20KcNSg==\n", "/FLA4+U9er8=\n");
        String r51 = u40.a("QODygGycJQ==\n", "Y9bEtC6sFRE=\n");
        String r52 = u40.a("RXnWaJE4NQ==\n", "ZkrlXNUJdFQ=\n");
        String r53 = u40.a("X6YfvulPYg==\n", "fJZeja1/W6M=\n");
        String r54 = u40.a("zi31qEqn1g==\n", "7R3Nm3mTk08=\n");
        String r55 = u40.a("vBfnqQTxQw==\n", "nyfXmEDFB74=\n");
        String r56 = u40.a("iBNJ7Xd2PQ==\n", "qyJ43E9FDjg=\n");
        String r57 = u40.a("wmF/w14l0Q==\n", "4VA98h8Wk+Q=\n");
        String r58 = u40.a("7ZuCekq+qw==\n", "zqi2S3KKnxU=\n");
        String r59 = u40.a("D6Gwwb6J9w==\n", "LJX08fu4zlk=\n");
        String r60 = u40.a("Ug+Gbf+sKg==\n", "cTvCXM2cb4o=\n");
        String r61 = u40.a("xhUiYgbZZA==\n", "5SFmUELpVMw=\n");
        String r62 = u40.a("VmbxJpbdsg==\n", "dVK1Fa7tgho=\n");
        String r63 = u40.a("V/GGMV1Fkg==\n", "dMO0Ahl1148=\n");
        int r64 = gt.e(((r143 - 28) - 1) + 28, 10);
        if (r98 == false) goto L309;
        kx r1112 = new kx(Integer.valueOf(Color.parseColor(new String[]{r422, r432, r442, r45, r46, r47, r48, r49, r50, r51, r52}[r64])), Integer.valueOf(Color.parseColor(new String[]{r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63}[r64])));
    L308:
        r126 = ((Number) r1112.a).intValue();
        r116 = ((Number) r1112.b).intValue();
        goto L267
    L309:
        r1112 = new kx(Integer.valueOf(Color.parseColor(new String[]{r1111, r127, r153, r162, r2412, r2510, r2610, r2710, r286, r292, r30}[r64])), Integer.valueOf(Color.parseColor(new String[]{r31, r322, r332, r342, r352, r362, r372, r382, r392, r40, r41}[r64])));
        goto L308
    L310:
        if (r98 == false) goto L313;
        String r287 = "C7lP2W85rw==\n";
        String r1113 = "KIsM6ywL6jM=\n";
    L312:
        int r288 = r9.a(u40.a(r287, r1113));
        r116 = r288;
        r126 = r288;
        goto L267
    L313:
        r287 = "0Kkl4ACVuQ==\n";
        r1113 = "8+9jpkbT/3k=\n";
    L301:
        r98 = false;
    L299:
        th = move-exception;
        Class r1114 = n9.a;
        n9.a(u40.a("v1qL5MKPM6OSVo/i8rQ+jJlehuk=\n", "/DLqkJfGYcY=\n"), th);
        goto L254
    L252:
        if (r4 == 822083633) goto L296;
    L78:
        if ((r220 instanceof ViewGroup) == false) goto L79;
        r9.e(r10, r4, r220, r220);
        if (r10.f != null) goto L222;
        List r910 = pb0.G0;
        ip.o("<this>", r910);
        if (2 >= r910.size()) goto L235;
        Object r911 = r910.get(2);
    L214:
        String r912 = (String) r911;
        if (r912 != null) goto L479;
        String r1115 = u40.a("m/kddQsUpSyn5A9kDSK/PQ==\n", "+JF8AX99y0s=\n");
    L217:
        ViewGroup r913 = (ViewGroup) r220;
        String r136 = r913.getContext().getPackageName();
        int r128 = r913.getContext().getResources().getIdentifier(r1115, u40.a("UMI=\n", "Oab1Cv9iBqw=\n"), r136);
        if (r128 == 0) goto L484;
        int r914 = r128;
    L220:
        if (r914 == 0) goto L222;
        r10.f = (TextView) r220.findViewById(r914);
        goto L222
    L484:
        r914 = XposedHelpers.getStaticIntField(XposedHelpers.findClass(r136 + ".R$id", ((ViewGroup) r220).getContext().getClassLoader()), r1115);     // Catch: Throwable -> L471
    L472:
        r914 = r128;
        goto L220
    L479:
        r1115 = r912;
        goto L217
    L235:
        r911 = null;
    L222:
        View r915 = r10.b;
        if (r915 == null) goto L236;
        ViewParent r916 = r915.getParent();
    L226:
        if ((r916 instanceof ViewGroup) == false) goto L237;
        ViewGroup r917 = (ViewGroup) r916;
    L228:
        if (r917 != null) goto L230;
    L234:
        r10.a = true;
        goto L79
    L230:
        if (r10.c != null) goto L234;
        ViewGroup r289 = (ViewGroup) r220;
        float r1116 = r289.getContext().getResources().getDisplayMetrics().density;
        TextView r129 = new TextView(r289.getContext());
        r129.setTextSize(10.0f);
        r129.setTextColor(-1);
        r129.setShadowLayer(3.0f, 0.0f, 1.0f, Color.parseColor(u40.a("LQzOQLnKR1E+\n", "DjT+cIn6d2E=\n")));
        r129.setBackgroundColor(0);
        r129.setBackground(null);
        r129.setGravity(17);
        r129.setVisibility(8);
        r10.c = r129;
        if ((r917 instanceof FrameLayout) == false) goto L239;
        FrameLayout r290 = (FrameLayout) r917;
        FrameLayout.LayoutParams r918 = new FrameLayout.LayoutParams(-2, -2);
        r918.gravity = 81;
        r918.bottomMargin = (int) (r1116 * 2.0f);
        r290.addView(r129, r918);
        goto L234
    L239:
        if ((r917 instanceof RelativeLayout) == false) goto L242;
        RelativeLayout.LayoutParams r291 = new RelativeLayout.LayoutParams(-2, -2);
        r291.addRule(12);
        r291.addRule(14);
        r291.bottomMargin = (int) (r1116 * 2.0f);
        ((RelativeLayout) r917).addView(r129, r291);
        goto L234
    L242:
        if ((r917 instanceof LinearLayout) == false) goto L244;
        LinearLayout.LayoutParams r293 = new LinearLayout.LayoutParams(-2, -2);
        r293.gravity = 81;
        r293.bottomMargin = (int) (r1116 * 2.0f);
        ((LinearLayout) r917).addView(r129, r293);
        goto L234
    L244:
        r917.addView(r129, new ViewGroup.MarginLayoutParams(-2, -2));
        goto L234
    L237:
        r917 = null;
        goto L228
    L236:
        r916 = null;
        goto L226
    L73:
        if (r4 == 10000) goto L208;
        r218 = new f9(r33, r4, r5, r6, r8);
        goto L75
    L207:
        r10 = null;
        goto L68
    L61:
        if ((r9 instanceof View) == false) goto L206;
        r216 = (View) r9;
        goto L63
    L206:
        r216 = null;
        goto L63
    L198:
        if (in.k == true) goto L196;
        in.k = true;
        Field r294 = XposedHelpers.findFieldIfExists(r9.getClass(), u40.a("jF+xJqEiOHw=\n", "5SvUS/dLXQs=\n"));     // Catch: Throwable -> L195
        if (r294 == null) goto L196;
        r294.setAccessible(true);     // Catch: Throwable -> L195
        in.j = r294;     // Catch: Throwable -> L195
        Object r295 = r294.get(r9);     // Catch: Throwable -> L195
        if ((r295 instanceof View) == false) goto L196;
        r216 = (View) r295;     // Catch: Throwable -> L195
    L196:
        r216 = null;
        goto L59
    L194:
        r4 = 0;
        goto L54
    L193:
        r6 = 0;
        goto L51
    L192:
        r5 = null;
        goto L46
    L191:
        r211 = null;
        goto L44
    L190:
        r8 = 0;
        goto L40
    L492:
        Object r296 = XposedHelpers.callMethod(r33, r28, new Object[0]);     // Catch: Throwable -> L188
        ip.m(u40.a("pghZ111iIMqmEkGbH2Rhx6kOQZsJbmHKpxMY1QhtLYS8BEXeXWou0KQUW5Uxbi/D\n", "yH01u30BQaQ=\n"), r296);     // Catch: Throwable -> L188
        r18 = ((Long) r296).longValue();     // Catch: Throwable -> L188
        goto L37
    L185:
        r26 = null;
    L187:
        r33 = null;
        goto L31
    L494:
        Method r297 = XposedHelpers.findMethodBestMatch(r0.thisObject.getClass(), pb0.c0, new Object[]{Integer.valueOf(r17)});     // Catch: Throwable -> L475
        if (r297 == null) goto L184;
        r297.setAccessible(true);     // Catch: Throwable -> L475
    L26:
        in.i = r297;     // Catch: Throwable -> L475
        goto L486
    L184:
        r297 = null;
    L16:
        return vh.n;
    L17:
        Object r298 = r3[1];
        if ((r298 instanceof Integer) == false) goto L20;
        u40.a("bcwgs6kc65Zt1jj/6xqqm2LKOP/9EKqWbNdhsfwT5th3wDy6qRTljG/QIvHAEf4=\n", "A7lM34l/ivg=\n");
        r32 = ((Integer) r298).intValue();
        r24 = r0.args[0];
        goto L11
    L20:
        r9 = null;
        r17 = -1;
        goto L12
    }

    @Override // defpackage.hm
    public final Object a() {
        int r4 = 0;
        int r2 = this.a;
        XC_MethodHook.MethodHookParam r11 = this.b;
        switch(r2) {
            case 0: goto L44;
            case 1: goto L164;
            default: goto L4;
        };
    L4:
        Object r7 = r11.thisObject;
        ip.n(u40.a("7bCK8zxYuSz6rA==\n", "mdjjgHM600k=\n"), r7);
        u40.a("pu8=\n", "wo2mtqUYf20=\n");
        ip.x = r7;
        if (ip.w == false) goto L9;
    L7:
        return vh.n;
    L9:
        if (z30.q("ZnbnFvMUn0hSdfEl8BSIUFJ88A==\n", "DROeSZRx+iM=\n", gn.a) == true) goto L147;
        ip.R(r7);
        ip.w = true;
        goto L7
    L147:
        ip.R(r7);     // Catch: Throwable -> L22
        String r22 = gn.d(u40.a("xkU8oBCSUSbyRiqTE5JGEsRENg==\n", "rSBF/3f3NE0=\n"), "");     // Catch: Throwable -> L22
        if (b50.H(r22) == false) goto L15;
    L13:
        ip.w = true;
        goto L7
    L15:
        List r23 = b50.M(r22, new String[]{u40.a("jg==\n", "oqGxh2cmxw8=\n")});     // Catch: Throwable -> L22
        ArrayList r8 = new ArrayList();     // Catch: Throwable -> L22
        Iterator r5 = r23.iterator();     // Catch: Throwable -> L22
    L17:
        if (r5.hasNext() == false) goto L24;
        Object r3 = r5.next();     // Catch: Throwable -> L22
        if (b50.H((String) r3) == true) goto L17;
        r8.add(r3);     // Catch: Throwable -> L22
        goto L17
    L24:
        int r9 = r8.size();     // Catch: Throwable -> L22
    L25:
        if (r4 >= r9) goto L13;
        int r52 = 1 - (0 - r4);     // Catch: Throwable -> L22
        String r0 = (String) r8.get(r4);     // Catch: Throwable -> L22
        gn r24 = gn.a;     // Catch: Throwable -> L22
        String r10 = u40.a("aZt9a3GaNC0C4UEJBJxnWCu+\n", "jwfXjuAn0b0=\n");     // Catch: Throwable -> L22
        r24.getClass();     // Catch: Throwable -> L22
        String r102 = gn.d("key_geek_folder_name_" + r0, r10);     // Catch: Throwable -> L22
        String r112 = gn.d(r0, "");     // Catch: Throwable -> L22
        if (r112.length() <= 0) goto L37;
        List r25 = b50.M(r112, new String[]{u40.a("fg==\n", "UsMUNnEgD5E=\n")});     // Catch: Throwable -> L22
        ArrayList r12 = new ArrayList();     // Catch: Throwable -> L22
        Iterator r13 = r25.iterator();     // Catch: Throwable -> L22
    L30:
        if (r13.hasNext() == false) goto L34;
        Object r32 = r13.next();     // Catch: Throwable -> L22
        if (b50.H((String) r32) == true) goto L30;
        r12.add(r32);     // Catch: Throwable -> L22
        goto L30
    L34:
        String r26 = ab.j0(r12, u40.a("Rg==\n", "as4FbhWM7HM=\n"), new tc(1), 30);     // Catch: Throwable -> L22
        if (r26.length() <= 0) goto L37;
        ip.T("UPDATE rconversation SET parentRef = '" + r0 + "' WHERE username IN (" + r26 + ")", r7);     // Catch: Throwable -> L22
    L37:
        ip.T("REPLACE INTO rcontact (username, nickname, type, verifyFlag) VALUES ('" + r0 + "', '" + r102 + "', 3, 0)", r7);     // Catch: Throwable -> L22
        if (r112.length() != 0) goto L41;
        String r27 = "LVYc7KVXo7R8GgKz3GzL52VIQ4SIOOmxLUII7ot9obhxGiyq12zd52Vi\n";
        String r33 = "yv+mCjPQRw8=\n";
    L40:
        ip.T(v40.z("\n                    REPLACE INTO rconversation (\n                        username, digest, digestUser, isSend, status, \n                        conversationTime, flag, unReadCount, content, msgType, chatmode\n                    ) VALUES (\n                        '" + r0 + "', '" + u40.a(r27, r33) + "', '', 0, 0, \n                        IFNULL((SELECT MAX(conversationTime) FROM rconversation WHERE parentRef = '" + r0 + "'), strftime('%s','now') * 1000), \n                        IFNULL((SELECT MAX(flag) FROM rconversation WHERE parentRef = '" + r0 + "'), strftime('%s','now') * 1000), \n                        IFNULL((SELECT SUM(unReadCount) FROM rconversation WHERE parentRef = '" + r0 + "'), 0), \n                        '', 0, 0\n                    )\n                "), r7);     // Catch: Throwable -> L22
        r4 = r52;
        goto L25
    L41:
        r27 = "CSUlFzq7bLl+TwFRTYoN7G0jRVYD9DWeBAY9\n";
        r33 = "7Kmg8qoQiQQ=\n";
    L23:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("pTR+Wfhvd3aHI0Rhx254TaYT\n", "4lEbMr4AGxI=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        goto L13
    L44:
        Class r28 = n9.a;
        if (ac.a == true) goto L48;
        ac.a();
        ac.a = true;
    L48:
        if (ac.c == false) goto L165;
        Object[] r72 = r11.args;
        Object r29 = r72[0];
        if ((r29 instanceof Integer) == false) goto L115;
        u40.a("6G95pO+R57HodWHorZemvOdpYei7naax6XQ4prqe6v/yY2Wt75npq+pze+aGnPI=\n", "hhoVyM/yht8=\n");
        int r103 = ((Integer) r29).intValue();
    L53:
        if (r103 == (-1)) goto L165;
        if (in.i == null) goto L149;
    L141:
        Method r210 = in.i;     // Catch: Throwable -> L122
        if (r210 == null) goto L124;
        Object r73 = r210.invoke(r11.thisObject, new Object[]{Integer.valueOf(r103)});     // Catch: Throwable -> L122
    L64:
        if (r73 == null) goto L165;
        in r211 = in.a;
        in.a(r73);
        Field r212 = in.e;
        if (r212 == null) goto L125;
        int r213 = r212.getInt(r73);
    L68:
        Field r34 = in.d;
        if (r34 == null) goto L126;
        int r35 = r34.getInt(r73);
    L72:
        if (r213 != 34) goto L165;
        if (r35 != 0) goto L165;
        Field r214 = in.c;
        if (r214 == null) goto L127;
        long r82 = r214.getLong(r73);
    L78:
        if (r82 == 0) goto L165;
        int r215 = XposedHelpers.getIntField(r73, pb0.O0);     // Catch: Throwable -> L129
        if ((r215 & (r215 ^ (-65))) == 0) goto L128;
        boolean r36 = true;
    L139:
        int r216 = XposedHelpers.getIntField(r73, pb0.P0);     // Catch: Throwable -> L133
    L84:
        if (r216 < 3) goto L165;
        String r6 = "voice_trans_" + r82;
        gn.a.getClass();
        if (gn.a(r6, false) == true) goto L165;
        if (r36 == true) goto L165;
        Map r217 = i9.f;
        Object r37 = r217.get(Long.valueOf(r82));
        Boolean r42 = Boolean.TRUE;
        if (ip.i(r37, r42) == true) goto L165;
        u40.a("KEgIgwgNh/JwRgOQcxKL/3F7H5ZLDty0OgFD3g==\n", "FC9t9yV94pw=\n");
        r217.put(Long.valueOf(r82), r42);
    L113:
        th = move-exception;
        i9.f.remove(Long.valueOf(r82));
        n9.a(u40.a("H2jmpzVN9n8za9iFD23ddQhy7rQHYcw=\n", "XACH02AEvhA=\n"), th);
        goto L165
    L92:
        if (n9.b == true) goto L95;
        n9.b = true;     // Catch: Throwable -> L113
        n9.a = XposedHelpers.findClassIfExists(pb0.z0, d9.a);     // Catch: Throwable -> L113
    L95:
        if (n9.a == null) goto L165;
        Object r218 = XposedHelpers.getObjectField(r11.thisObject, pb0.W);     // Catch: Throwable -> L113
        if (r218 == null) goto L132;
        Object r219 = XposedHelpers.getObjectField(r218, pb0.X);     // Catch: Throwable -> L113
    L99:
        if (r219 == null) goto L135;
        Object r220 = XposedHelpers.callMethod(r219, pb0.Y, new Object[]{n9.a});     // Catch: Throwable -> L113
    L101:
        if (r220 == null) goto L165;
        String r38 = pb0.a0;     // Catch: Throwable -> L113
        XposedHelpers.callMethod(r220, r38, new Object[]{r73, r42, Integer.valueOf(r103), 0});     // Catch: Throwable -> L106
    L143:
        XposedHelpers.callMethod(r220, r38, new Object[]{Long.valueOf(r82)});     // Catch: Throwable -> L110
    L110:
        th = move-exception;
        n9.a(u40.a("C7CUO9Lzxlkns6ob9dvgRS63hyI=\n", "SNj1T4e6jjY=\n"), th);     // Catch: Throwable -> L113
        goto L165
    L135:
        r220 = null;
        goto L101
    L132:
        r219 = null;
    L133:
        th = th;
    L131:
        n9.a(u40.a("KXHPIuK2u6IFcvEA2JaQqDltzyLS\n", "ahmuVrf/880=\n"), th);
        r216 = 0;
        goto L84
    L128:
        r36 = false;
    L129:
        th = th;
        r36 = false;
        goto L131
    L127:
        r82 = 0;
        goto L78
    L126:
        r35 = 0;
        goto L72
    L125:
        r213 = 0;
    L124:
        r73 = null;
    L122:
        th = move-exception;
        n9.a(u40.a("Z9c/rfDIeoRL1AGQy/ddgEE=\n", "JL9e2aWBMus=\n"), th);
        goto L124
    L149:
        Method r221 = XposedHelpers.findMethodBestMatch(r11.thisObject.getClass(), pb0.c0, new Object[]{Integer.valueOf(r103)});     // Catch: Throwable -> L120
        if (r221 == null) goto L119;
        r221.setAccessible(true);     // Catch: Throwable -> L120
    L59:
        in.i = r221;     // Catch: Throwable -> L120
        goto L141
    L119:
        r221 = null;
    L120:
        th = move-exception;
        n9.a(u40.a("wKMVkaipiL/soCu3mIasteC/\n", "g8t05f3gwNA=\n"), th);
        goto L141
    L115:
        Object r222 = r72[1];
        if ((r222 instanceof Integer) == false) goto L118;
        u40.a("go6cw/NYFCiClISPsV5VJY2IhI+nVFUog5XdwaZXGWaYgoDK81AaMoCSnoGaVQE=\n", "7Pvwr9M7dUY=\n");
        r103 = ((Integer) r222).intValue();
        goto L53
    L118:
        r103 = -1;
    L165:
        return vh.n;
    L164:
        return b();
    }
}
