package p000;

import android.app.Activity;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import io.github.cherrywechat.application.MainApplication;
import io.github.cherrywechat.lua.LuaUiScheduler;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import org.json.JSONObject;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1197b implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4108a;

    public /* synthetic */ C1197b(int r1) {
        this.f4108a = r1;
    }

    /* JADX INFO: renamed from: c */
    private final Object m2317c(Object r18) {
        AbstractC0295Gu.m625r(-197856258422837L);
        C2428qs r0 = ((C1494hG) r18).f5263a;
        Object[] r1 = (Object[]) r0.f8522c;
        int r2 = 0;
        Object r3 = r1[0];
        boolean r4 = true;
        Object r12 = r1[1];
        AbstractC0295Gu.m625r(-197907798030389L);
        Integer r13 = (Integer) r12;
        r13.getClass();
        C2648vx r5 = new C2648vx();
        View r7 = null;
        if ((r3 instanceof Class) == false) goto L5;
        r5.f9163b = (Class) r3;
    L10:
        r5.f9165d = View.class;
        C0089C2 r52 = new C0089C2(1, ((View) r5.m5178a()).getTag());
        C1538iG r32 = new C1538iG(r0.f8521b);
        r32.m2921f(AbstractC0295Gu.m625r(-197564200646709L));
        C0089C2 r14 = new C0089C2(3, r32.m2918c(null, new Object[]{r13}));
        HashMap r02 = AbstractC0999XA.f3193a;
        int r03 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-197160473720885L));
        if (r03 == 0) goto L15;
        TextView r33 = (TextView) r52.f201g;
        if (r33 == null) goto L15;
        r33.setTextColor(r03);
    L15:
        Integer r04 = (Integer) r14.f199e;
        if (r04 != null) goto L19;
    L21:
        if (r04 != null) goto L24;
    L26:
        if (r04 != null) goto L29;
    L31:
        if (r04 != null) goto L34;
    L36:
        if (r04 != null) goto L39;
    L41:
        if (r04 != null) goto L44;
    L46:
        if (r04 != null) goto L49;
    L51:
        if (r04 != null) goto L54;
    L56:
        if (r04 == null) goto L99;
        if (r04.intValue() != 1090519089) goto L99;
        if (r14.m142d() == false) goto L63;
        Drawable r05 = C1517hw.m2890b(AbstractC0295Gu.m625r(-199209173121077L));
    L64:
        if (r05 == null) goto L262;
        View r34 = r52.m141c();
        Object r6 = r52.f202h;
        View r35 = AbstractC0671Pj.m1351k(r34);
        if (r35 == null) goto L68;
        r35.setBackground(r05);
        r35.setForeground(null);
    L68:
        Field[] r06 = r6.getClass().getDeclaredFields();
        AbstractC0295Gu.m625r(-200003742070837L);
        int r36 = r06.length;
        int r8 = 0;
    L69:
        if (r8 >= r36) goto L79;
        Field r9 = r06[r8];
        if (AbstractC0585Nj.m1134a(r9.getType(), LinearLayout.class) == false) goto L78;
        r9.setAccessible(true);
        Object r92 = r9.get(r6);
        if ((r92 instanceof View) == false) goto L75;
        View r93 = (View) r92;
    L76:
        if (r93 == null) goto L78;
        r93.setBackground(null);
        goto L78
    L75:
        r93 = null;
    L78:
        r8 = r8 + 1;
        goto L69
    L79:
        HashMap r07 = AbstractC0999XA.f3193a;
        if (r14.m142d() == false) goto L83;
        long r72 = -200102526318645L;
    L84:
        int r08 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(r72));
        if (r08 == 0) goto L93;
        C2648vx r37 = new C2648vx();
        if ((r6 instanceof Class) == false) goto L89;
        r37.f9163b = (Class) r6;
    L90:
        r37.m5182e(AbstractC0295Gu.m625r(-198191265871925L));
        View r38 = (View) r37.m5178a();
        if (r38 == null) goto L93;
        String r62 = AbstractC0295Gu.m625r(-198363064563765L);
        Object[] r73 = {Integer.valueOf(r08)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r38, r62, Arrays.copyOf(r73, 1));
        goto L93
    L89:
        r37.f9164c = r6;
        r37.f9163b = r6.getClass();
    L93:
        ViewParent r39 = r52.m141c().getParent().getParent();
        AbstractC0295Gu.m625r(-198418899138613L);
        ViewGroup r310 = (ViewGroup) r39;
        if (r08 != 0) goto L97;
        r4 = false;
    L97:
        AbstractC0671Pj.m1348f(r310, r08, r4, r14.m142d());
        goto L262
    L83:
        r72 = -199694504425525L;
    L262:
        HashMap r09 = AbstractC0999XA.f3193a;
        int r010 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-155331787225141L));
        if (r010 == 0) goto L268;
        TextView r15 = (TextView) r52.f200f;
        if (r15 == null) goto L268;
        r15.setTextColor(r010);
    L268:
        return C0829TC.f2620a;
    L63:
        r05 = C1517hw.m2890b(AbstractC0295Gu.m625r(-199883482986549L));
    L99:
        if (r04 != null) goto L102;
    L141:
        if (r04 != null) goto L144;
    L207:
        if (r04 != null) goto L210;
    L240:
        if (r04 == null) goto L262;
        if (r04.intValue() != 50) goto L262;
        View r011 = r52.m141c();
        if (r14.m142d() == false) goto L247;
        Drawable r22 = C1517hw.m2890b(AbstractC0295Gu.m625r(-155443456374837L));
    L248:
        r011.setBackground(r22);
        AbstractC0671Pj.m1347e(r52.m141c(), r14.m142d());
        if (r14.m142d() == false) goto L252;
        String r012 = AbstractC0295Gu.m625r(-155155693566005L);
    L253:
        int r013 = C1517hw.m2889a(0, r012);
        if (r013 == 0) goto L262;
        View r16 = r52.m141c();
        AbstractC0295Gu.m625r(-155993212188725L);
        ViewGroup r17 = (ViewGroup) r16;
        int r23 = r17.getChildCount();
        int r10 = 0;
    L256:
        if (r10 >= r23) goto L262;
        View r311 = r17.getChildAt(r10);
        if ((r311 instanceof TextView) == false) goto L260;
        ((TextView) r311).setTextColor(r013);
    L261:
        r10 = r10 + 1;
        goto L256
    L260:
        Drawable r42 = r311.getBackground().mutate();
        r42.setColorFilter(new PorterDuffColorFilter(Color.argb(255, Color.red(r013), Color.green(r013), Color.blue(r013)), PorterDuff.Mode.SRC_ATOP));
        r42.setAlpha(Color.alpha(r013));
        r311.setBackground(r42);
        goto L261
    L252:
        r012 = AbstractC0295Gu.m625r(-155301722454069L);
        goto L253
    L247:
        r22 = C1517hw.m2890b(AbstractC0295Gu.m625r(-155576600361013L));
        goto L248
    L210:
        if (r04.intValue() != 436207665) goto L240;
        View r014 = r52.m141c();
        View r24 = (View) r52.f198d;
        AbstractC0295Gu.m625r(-155701154412597L);
        ViewParent r015 = C1456gf.m2810v((ViewGroup) r014, AbstractC0295Gu.m625r(-154309585008693L)).getParent();
        AbstractC0295Gu.m625r(-154464203831349L);
        ViewGroup r016 = (ViewGroup) r015;
        int r312 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-154172146055221L));
        if (r312 == 0) goto L214;
        View r43 = r016.getChildAt(0);
        AbstractC0295Gu.m625r(-154889405593653L);
        ((TextView) r43).setTextColor(r312);
    L214:
        int r313 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-154601642784821L));
        if (r313 == 0) goto L217;
        View r63 = r016.getChildAt(1);
        AbstractC0295Gu.m625r(-153124174034997L);
        ((TextView) r63).setTextColor(r313);
    L217:
        View r314 = r016.getChildAt(1);
        AbstractC0295Gu.m625r(-152836411226165L);
        if (r314.getVisibility() != 0) goto L224;
        if (r14.m142d() == false) goto L222;
        Drawable r315 = C1517hw.m2890b(AbstractC0295Gu.m625r(-152905130702901L));
    L227:
        if (r315 == null) goto L262;
        ViewParent r017 = r016.getParent();
        AbstractC0295Gu.m625r(-153566555666485L);
        View r018 = ((ViewGroup) r017).getChildAt(0);
        AbstractC0295Gu.m625r(-152174986262581L);
        ((ImageView) r018).setImageDrawable(C1517hw.m2890b(AbstractC0295Gu.m625r(-151891518421045L)));
        if (r24 == null) goto L231;
        r24.setBackground(r315);
        AbstractC0671Pj.m1347e(r24, r14.m142d());
    L231:
        View r019 = r52.m141c();
        AbstractC0295Gu.m625r(-152578713188405L);
        View r020 = C1456gf.m2810v((ViewGroup) r019, AbstractC0295Gu.m625r(-152286655412277L));
        if (r020 == null) goto L234;
        ViewParent r021 = r020.getParent();
    L235:
        AbstractC0295Gu.m625r(-152505698744373L);
        ((ViewGroup) r021).setAlpha(0.0f);
        AbstractC0295Gu.m625r(-151114129340469L);
        TextView r022 = C1456gf.m2811w((ViewGroup) r24, AbstractC0295Gu.m625r(-150822071564341L));
        if (r022 == null) goto L238;
        ViewParent r74 = r022.getParent();
    L239:
        AbstractC0295Gu.m625r(-150834956466229L);
        ((ViewGroup) r74).setAlpha(0.0f);
        goto L262
    L238:
        r74 = null;
        goto L239
    L234:
        r021 = null;
        goto L235
    L222:
        r315 = C1517hw.m2890b(AbstractC0295Gu.m625r(-153089814296629L));
        goto L227
    L224:
        if (r14.m142d() == false) goto L226;
        r315 = C1517hw.m2890b(AbstractC0295Gu.m625r(-153819958736949L));
        goto L227
    L226:
        r315 = C1517hw.m2890b(AbstractC0295Gu.m625r(-153420526778421L));
        goto L227
    L144:
        if (r04.intValue() != 419430449) goto L207;
        Object r023 = r52.f202h;
        if (r023 == null) goto L148;
        Class<?> r25 = r023.getClass();
    L149:
        Field[] r26 = r25.getDeclaredFields();
        AbstractC0295Gu.m625r(-151642410317877L);
        int r44 = r26.length;
        int r64 = 0;
        boolean r75 = false;
    L150:
        if (r64 >= r44) goto L157;
        Field r82 = r26[r64];
        if (AbstractC0585Nj.m1134a(r82.getType(), TextView.class) == false) goto L156;
        Object r83 = r82.get(r023);
        AbstractC0295Gu.m625r(-151191438751797L);
        CharSequence r84 = ((TextView) r83).getText();
        AbstractC0295Gu.m625r(-151453431756853L);
        if (AbstractC2564tz.m5051L(r84, AbstractC0295Gu.m625r(-149859998890037L), false) == false) goto L156;
        r75 = true;
    L156:
        r64 = r64 + 1;
        goto L150
    L157:
        if (r75 == false) goto L163;
        if (r14.m142d() == false) goto L161;
        HashMap r27 = AbstractC0999XA.f3193a;
        Drawable r28 = C1517hw.m2890b(AbstractC0295Gu.m625r(-149868588824629L));
    L166:
        if (r28 == null) goto L262;
        View r45 = r52.m141c();
        if (r45 == null) goto L170;
        r45.setBackground(r28);
        AbstractC0671Pj.m1347e(r45, r14.m142d());
    L170:
        HashMap r29 = AbstractC0999XA.f3193a;
        if (r75 == false) goto L178;
        if (r14.m142d() == false) goto L176;
        long r65 = -150495654049845L;
    L175:
        String r210 = AbstractC0295Gu.m625r(r65);
    L182:
        int r211 = C1517hw.m2889a(-65536, r210);
        if (r211 == 0) goto L194;
        if (r023 == null) goto L186;
        Class<?> r46 = r023.getClass();
    L187:
        Field[] r47 = r46.getDeclaredFields();
        AbstractC0295Gu.m625r(-201236397684789L);
        int r66 = r47.length;
        int r76 = 0;
    L188:
        if (r76 >= r66) goto L194;
        Field r85 = r47[r76];
        if (AbstractC0585Nj.m1134a(r85.getType(), TextView.class) == false) goto L192;
        Object r86 = r85.get(r023);
        AbstractC0295Gu.m625r(-201335181932597L);
        ((TextView) r86).setTextColor(r211);
    L192:
        r76 = r76 + 1;
        goto L188
    L186:
        r46 = null;
    L194:
        if (r14.m142d() == false) goto L196;
        HashMap r19 = AbstractC0999XA.f3193a;
        Drawable r110 = C1517hw.m2890b(AbstractC0295Gu.m625r(-202146930751541L));
    L197:
        if (r110 == null) goto L262;
        if (r023 == null) goto L200;
        Class<?> r77 = r023.getClass();
    L201:
        Field[] r212 = r77.getDeclaredFields();
        AbstractC0295Gu.m625r(-201919297484853L);
        int r316 = r212.length;
        int r48 = 0;
    L202:
        if (r48 >= r316) goto L262;
        Field r67 = r212[r48];
        if (AbstractC0585Nj.m1134a(r67.getType(), ImageView.class) == false) goto L206;
        Object r68 = r67.get(r023);
        AbstractC0295Gu.m625r(-202018081732661L);
        ((ImageView) r68).setImageDrawable(r110);
    L206:
        r48 = r48 + 1;
        goto L202
    L200:
        r77 = null;
        goto L201
    L196:
        HashMap r111 = AbstractC0999XA.f3193a;
        r110 = C1517hw.m2890b(AbstractC0295Gu.m625r(-202310139508789L));
        goto L197
    L176:
        r65 = -150143466731573L;
        goto L175
    L178:
        if (r14.m142d() == false) goto L181;
        long r69 = -150336740259893L;
    L180:
        r210 = AbstractC0295Gu.m625r(r69);
        goto L182
    L181:
        r69 = -201627239708725L;
        goto L180
    L161:
        HashMap r213 = AbstractC0999XA.f3193a;
        r28 = C1517hw.m2890b(AbstractC0295Gu.m625r(-150044682483765L));
        goto L166
    L163:
        if (r14.m142d() == false) goto L165;
        HashMap r214 = AbstractC0999XA.f3193a;
        r28 = C1517hw.m2890b(AbstractC0295Gu.m625r(-149666725361717L));
        goto L166
    L165:
        HashMap r215 = AbstractC0999XA.f3193a;
        r28 = C1517hw.m2890b(AbstractC0295Gu.m625r(-149808459282485L));
        goto L166
    L148:
        r25 = null;
        goto L149
    L102:
        if (r04.intValue() != 34) goto L141;
        View r024 = r52.m141c();
        Object r610 = r52.f202h;
        AbstractC0295Gu.m625r(-200635102263349L);
        ViewGroup r025 = (ViewGroup) r024;
        r025.getChildAt(0).setBackground(null);
        if (r14.m142d() == false) goto L106;
        Drawable r87 = C1517hw.m2890b(AbstractC0295Gu.m625r(-200343044487221L));
    L107:
        r025.setBackground(r87);
        AbstractC0671Pj.m1347e(r025, r14.m142d());
        Field[] r026 = r610.getClass().getDeclaredFields();
        AbstractC0295Gu.m625r(-201154793306165L);
        int r94 = r026.length;
        int r102 = 0;
    L108:
        if (r102 >= r94) goto L262;
        Field r11 = r026[r102];
        r11.setAccessible(r4);
        if (r11.getType().getName().equals(AbstractC0295Gu.m625r(-200703821740085L)) == false) goto L140;
        Object r112 = r11.get(r610);
        if ((r112 instanceof View) == false) goto L114;
        View r113 = (View) r112;
    L115:
        if (r113 == null) goto L140;
        if ((r113.getParent() instanceof FrameLayout) == false) goto L140;
        r113.setBackground(r87);
        ViewParent r114 = r113.getParent();
        AbstractC0295Gu.m625r(-200862735530037L);
        ViewGroup r115 = (ViewGroup) r114;
        int r122 = r115.getChildCount();
        int r132 = r2;
    L119:
        if (r132 >= r122) goto L140;
        View r142 = r115.getChildAt(r132);
        if ((r142 instanceof TextView) == false) goto L139;
        if (r142.getClass().getName().equals(TextView.class.getName()) == false) goto L139;
        HashMap r78 = AbstractC0999XA.f3193a;
        if (r14.m142d() == false) goto L128;
        long r152 = -199471166126133L;
    L129:
        int r79 = C1517hw.m2889a(r2, AbstractC0295Gu.m625r(r152));
        if (r79 == 0) goto L139;
        TextView r143 = (TextView) r142;
        Drawable[] r153 = r143.getCompoundDrawables();
        if (r14.m142d() == false) goto L134;
        int r162 = 2;
    L135:
        Drawable r154 = r153[r162];
        if (r154 == null) goto L138;
        r154.setColorFilter(new PorterDuffColorFilter(r79, PorterDuff.Mode.SRC_ATOP));
    L138:
        r143.setTextColor(r79);
        goto L139
    L134:
        r162 = r2;
        goto L135
    L128:
        r152 = -199067439200309L;
    L139:
        r132 = r132 + 1;
        r2 = 0;
        goto L119
    L114:
        r113 = r7;
    L140:
        r102 = r102 + 1;
        r2 = 0;
        r4 = true;
        r7 = null;
        goto L108
    L106:
        r87 = C1517hw.m2890b(AbstractC0295Gu.m625r(-201025944287285L));
        goto L107
    L54:
        if (r04.intValue() != 922746929) goto L56;
        AbstractC0671Pj.m1349g(r52);
        goto L262
    L49:
        if (r04.intValue() != 268445456) goto L51;
        AbstractC0671Pj.m1349g(r52);
        goto L262
    L44:
        if (r04.intValue() != 10000) goto L46;
        AbstractC0671Pj.m1349g(r52);
        goto L262
    L39:
        if (r04.intValue() != 570425393) goto L41;
        AbstractC0671Pj.m1349g(r52);
        goto L262
    L34:
        if (r04.intValue() != 805306417) goto L36;
        AbstractC0671Pj.m1350h(r52, r14);
        goto L262
    L29:
        if (r04.intValue() != 822083633) goto L31;
        AbstractC0671Pj.m1350h(r52, r14);
        goto L262
    L24:
        if (r04.intValue() != 16777265) goto L26;
        AbstractC0671Pj.m1350h(r52, r14);
        goto L262
    L19:
        if (r04.intValue() != 1) goto L21;
        AbstractC0671Pj.m1350h(r52, r14);
        goto L262
    L5:
        r5.f9164c = r3;
        if (r3 == null) goto L8;
        Class<?> r317 = r3.getClass();
    L9:
        r5.f9163b = r317;
        goto L10
    L8:
        r317 = null;
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r15) {
        int r0 = this.f4108a;
        final int r5 = 1;
        Class<?> r6 = null;
        String r62 = null;
        Class<?> r63 = null;
        ViewGroup.LayoutParams r64 = null;
        final int r7 = 0;
        C0829TC r8 = C0829TC.f2620a;
        switch(r0) {
            case 0: goto L282;
            case 1: goto L268;
            case 2: goto L264;
            case 3: goto L227;
            case 4: goto L222;
            case 5: goto L217;
            case 6: goto L211;
            case 7: goto L205;
            case 8: goto L203;
            case 9: goto L201;
            case 10: goto L196;
            case 11: goto L191;
            case 12: goto L189;
            case 13: goto L180;
            case 14: goto L167;
            case 15: goto L163;
            case 16: goto L156;
            case 17: goto L149;
            case 18: goto L143;
            case 19: goto L119;
            case 20: goto L100;
            case 21: goto L98;
            case 22: goto L83;
            case 23: goto L79;
            case 24: goto L78;
            case 25: goto L47;
            case 26: goto L33;
            case 27: goto L19;
            case 28: goto L8;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-195476846540853L);
        Object r152 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-195605695559733L);
        FrameLayout r153 = (FrameLayout) r152;
        HashMap r1 = AbstractC0999XA.f3193a;
        Drawable r12 = C1517hw.m2890b(AbstractC0295Gu.m625r(-195330817652789L));
        if (r12 == null) goto L7;
        r153.getChildAt(0).setAlpha(0.0f);
        Context r2 = r153.getContext();
        AbstractC0295Gu.m625r(-193827579099189L);
        ImageView r13 = C1456gf.m2808t(r2, r12);
        FrameLayout.LayoutParams r22 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(25), AbstractC0295Gu.m616i(25));
        r22.gravity = 17;
        r153.addView(r13, r22);
    L7:
        return r8;
    L8:
        AbstractC0295Gu.m625r(-196769631696949L);
        Object r154 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-196348724901941L);
        EditText r155 = (EditText) r154;
        if (r155.getClass().getName().equals(AbstractC0295Gu.m625r(-194961450465333L)) == false) goto L18;
        HashMap r02 = AbstractC0999XA.f3193a;
        String r03 = C1517hw.m2892d(AbstractC0295Gu.m625r(-195116069287989L), AbstractC0295Gu.m625r(-194682277591093L));
        if (r03.length() > 0) goto L13;
    L15:
        r155.setHintTextColor(C1517hw.m2889a(-7829368, AbstractC0295Gu.m625r(-194686572558389L)));
        int r04 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-194806831642677L));
        if (r04 == 0) goto L18;
        r155.setTag(R.id.tag_textview_color_ban, null);
        r155.setTextColor(r04);
        r155.setTag(R.id.tag_textview_color_ban, TextView.class);
        goto L18
    L13:
        if (C0180E7.f531b.m2024e() == true) goto L15;
        r155.setHint(r03);
    L18:
        return r8;
    L19:
        AbstractC0295Gu.m625r(-274834957269045L);
        C2428qs r156 = ((C1494hG) r15).f5263a;
        Object r05 = r156.f8521b;
        Object[] r157 = (Object[]) r156.f8522c;
        AbstractC0295Gu.m625r(-274341036030005L);
        if (((TextView) r05).getClass().getName().equals(AbstractC0295Gu.m625r(-274603029035061L)) == false) goto L32;
        C0180E7 r06 = C0180E7.f531b;
        if (r06.m2024e() == false) goto L29;
        String r07 = r06.m2023c();
        if (r07 == null) goto L32;
        if (r07.length() == 0) goto L32;
        r157[0] = r07;
        goto L32
    L29:
        HashMap r08 = AbstractC0999XA.f3193a;
        String r09 = C1517hw.m2892d(AbstractC0295Gu.m625r(-273108380416053L), AbstractC0295Gu.m625r(-273224344533045L));
        if (r09.length() <= 0) goto L32;
        r157[0] = r09;
    L32:
        return r8;
    L33:
        AbstractC0295Gu.m625r(-274169237338165L);
        Object r158 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-274298086357045L);
        EditText r159 = (EditText) r158;
        if (r159.getClass().getName().equals(AbstractC0295Gu.m625r(-274010323548213L)) == false) goto L46;
        C0180E7 r010 = C0180E7.f531b;
        if (r010.m2024e() == false) goto L43;
        String r011 = r010.m2023c();
        if (r011 == null) goto L46;
        if (r011.length() == 0) goto L46;
        r159.setHint(r011);
        goto L46
    L43:
        HashMap r012 = AbstractC0999XA.f3193a;
        String r013 = C1517hw.m2892d(AbstractC0295Gu.m625r(-274714698184757L), AbstractC0295Gu.m625r(-274830662301749L));
        if (r013.length() <= 0) goto L46;
        r159.setHint(r013);
    L46:
        return r8;
    L47:
        AbstractC0295Gu.m625r(-197598560385077L);
        C2428qs r1510 = ((C1494hG) r15).f5263a;
        Object r014 = r1510.f8521b;
        Object[] r1511 = (Object[]) r1510.f8522c;
        Class<? super Object> r015 = r014.getClass().getSuperclass();
        if (r015 == null) goto L51;
        r62 = r015.getCanonicalName();
    L51:
        if (AbstractC0585Nj.m1134a(r62, ClickableSpan.class.getCanonicalName()) == false) goto L76;
        HashMap r016 = AbstractC0999XA.f3193a;
        int r017 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-196005127518261L));
        if (r017 == 0) goto L76;
        Object r14 = r1511[0];
        AbstractC0295Gu.m625r(-196125386602549L);
        int r16 = ((Integer) r14).intValue();
        Object r23 = r1511[1];
        AbstractC0295Gu.m625r(-195781789218869L);
        int r24 = ((Integer) r23).intValue();
        if (r16 != (-11048043)) goto L60;
        if (r24 != 436207616) goto L60;
    L63:
        String r17 = AbstractC0295Gu.m625r(-195987947649077L);
        AbstractC0295Gu.m625r(-836659629258805L);
        StackTraceElement[] r25 = Thread.currentThread().getStackTrace();
        int r3 = 0;
    L65:
        if (r3 >= r25.length) goto L75;
        int r4 = r3 + 1;
        String r32 = r25[r3].toString();
        AbstractC0295Gu.m625r(-836681104095285L);
        if (AbstractC2564tz.m5051L(r32, r17, false) == true) goto L76;
        r3 = r4;
    L72:
        e = move-exception;
        throw new NoSuchElementException(e.getMessage());
    L75:
        r1511[0] = Integer.valueOf(r017);
        r1511[1] = Integer.valueOf(Color.argb(66, Color.red(r017), Color.green(r017), Color.blue(r017)));
    L60:
        if (r16 != (-13152126)) goto L76;
        if (r24 == 234881023) goto L63;
    L76:
        return r8;
    L79:
        C1494hG r1512 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-156594507610165L);
        HashMap r018 = AbstractC0999XA.f3193a;
        Drawable r019 = C1517hw.m2890b(AbstractC0295Gu.m625r(-142734648145973L));
        if (r019 == null) goto L82;
        Object r1513 = r1512.f5263a.f8521b;
        AbstractC0295Gu.m625r(-156173600815157L);
        ((ImageView) r1513).setImageDrawable(r019);
    L82:
        return r8;
    L83:
        C1494hG r1514 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-158218005248053L);
        HashMap r020 = AbstractC0999XA.f3193a;
        Drawable r021 = C1517hw.m2890b(AbstractC0295Gu.m625r(-142734648145973L));
        if (r021 == null) goto L97;
        Object r1515 = r1514.f5263a.f8521b;
        C2648vx r18 = new C2648vx();
        if ((r1515 instanceof Class) == false) goto L88;
        r18.f9163b = (Class) r1515;
    L92:
        r18.f9165d = ImageView.class;
        ImageView r1516 = (ImageView) r18.m5178a();
        if (r1516 == null) goto L97;
        ViewParent r1517 = r1516.getParent();
        AbstractC0295Gu.m625r(-158269544855605L);
        View r1518 = ((ViewGroup) r1517).getChildAt(0);
        AbstractC0295Gu.m625r(-157977487079477L);
        ImageView r1519 = (ImageView) r1518;
        if ((r1519.getDrawable() instanceof ColorDrawable) == false) goto L97;
        r1519.setImageDrawable(r021);
        goto L97
    L88:
        r18.f9164c = r1515;
        if (r1515 == null) goto L91;
        r63 = r1515.getClass();
    L91:
        r18.f9163b = r63;
    L97:
        return r8;
    L98:
        AbstractC0295Gu.m625r(-157303177214005L);
        Object r1520 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-157432026232885L);
        ((View) r1520).setAlpha(0.0f);
        return r8;
    L100:
        AbstractC0295Gu.m625r(-140758963189813L);
        Object r1521 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-140887812208693L);
        ViewGroup r1522 = (ViewGroup) r1521;
        String r022 = r1522.getContext().getClass().getName();
        switch(r022.hashCode()) {
            case -1539430146: goto L113;
            case 831517504: goto L110;
            case 1414355821: goto L107;
            case 1617560950: goto L104;
            default: goto L118;
        };
    L118:
        return r8;
    L104:
        if (r022.equals(AbstractC0295Gu.m625r(-157565170219061L)) == false) goto L118;
    L115:
        HashMap r023 = AbstractC0999XA.f3193a;
        Drawable r024 = C1517hw.m2890b(AbstractC0295Gu.m625r(-142734648145973L));
        if (r024 == null) goto L118;
        r1522.post(new RunnableC2260n3(r5, r1522, r024));
        goto L118
    L107:
        if (r022.equals(AbstractC0295Gu.m625r(-141403208284213L)) == true) goto L115;
    L110:
        if (r022.equals(AbstractC0295Gu.m625r(-157689724270645L)) == false) goto L118;
    L113:
        if (r022.equals(AbstractC0295Gu.m625r(-141695266060341L)) == true) goto L115;
    L119:
        AbstractC0295Gu.m625r(-142824842459189L);
        ViewGroup r1523 = (ViewGroup) ((Object[]) ((C1494hG) r15).f5263a.f8522c)[0];
        Context r025 = r1523.getContext();
        AbstractC0295Gu.m625r(-142876382066741L);
        Activity r026 = (Activity) r025;
        String r19 = r026.getClass().getName();
        if (r19.equals(AbstractC0295Gu.m625r(-142575734356021L)) == false) goto L123;
        final View r110 = new View(r026);
        HashMap r26 = AbstractC0999XA.f3193a;
        r110.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-146922241259573L)));
        View r27 = C1456gf.m2810v(r1523, AbstractC0295Gu.m625r(-147055385245749L));
        AbstractC0295Gu.m625r(-145620866168885L);
        final ViewGroup r28 = (ViewGroup) r27;
        C1456gf.m2807r(r28);
        View r65 = r28.getChildAt(0);
        AbstractC0295Gu.m625r(-145328808392757L);
        final ViewGroup r66 = (ViewGroup) r65;
        ViewParent r10 = r28.getParent();
        AbstractC0295Gu.m625r(-146136262244405L);
        C1456gf.m2805o(r66);
        ((ViewGroup) r10).addView(r110, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(r026) + new C2262n5(r026).f7974a));
        r66.post(new RunnableC0137D7(r66, r026, r7));
        r66.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0008A7(r66, r28, r110, r5));
        View r1524 = C1456gf.m2810v(r1523, AbstractC0295Gu.m625r(-145844204468277L));
        AbstractC0295Gu.m625r(-144383915587637L);
        ViewGroup r1525 = (ViewGroup) r1524;
        AbstractC0295Gu.m625r(-210582246520885L);
        r1525.post(new RunnableC2745y7(r1525, r5));
    L142:
        return r8;
    L123:
        if (r19.equals(AbstractC0295Gu.m625r(-141051020965941L)) == false) goto L135;
        ViewGroup r111 = (ViewGroup) r026.findViewById(android.R.id.content);
        C1456gf.m2805o(r111);
        ViewParent r67 = r111.getParent();
        AbstractC0295Gu.m625r(-144091857811509L);
        View r68 = ((ViewGroup) r67).getChildAt(1);
        AbstractC0295Gu.m625r(-144899311663157L);
        ViewGroup r69 = (ViewGroup) r68;
        r1523.post(new RunnableC0137D7(r026, r111));
        r69.post(new RunnableC0137D7(r69, r026, 2));
        C1456gf.m2805o(r69);
        ImageView r610 = new ImageView(r026);
        HashMap r102 = AbstractC0999XA.f3193a;
        r610.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-144607253887029L)));
        r610.setElevation(1.0f);
        r111.addView(r610, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(r026) + new C2262n5(r026).f7974a));
        View r611 = C1456gf.m2810v(r111, ListView.class.getName());
        if (r611 == null) goto L127;
        r611.setPadding(0, C1456gf.m2814z(r026), 0, 0);
        ImageView r103 = new ImageView(r611.getContext());
        r103.setImageDrawable(C1517hw.m2890b(AbstractC0295Gu.m625r(-142081813116981L)));
        r103.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r111.addView(r103, 0, new ViewGroup.LayoutParams(-1, -1));
    L127:
        View r112 = C1456gf.m2810v(r1523, AbstractC0295Gu.m625r(-144753282775093L));
        AbstractC0295Gu.m625r(-143318763698229L);
        ViewGroup r113 = (ViewGroup) r112;
        C1456gf.m2807r(r113);
        View r1526 = C1456gf.m2810v(r1523, AbstractC0295Gu.m625r(-143026705922101L));
        AbstractC0295Gu.m625r(-143765440297013L);
        ViewGroup r1527 = (ViewGroup) r1526;
        AbstractC0295Gu.m625r(-210582246520885L);
        r1527.post(new RunnableC2745y7(r1527, r5));
        ViewParent r33 = r113.getParent();
        AbstractC0295Gu.m625r(-144023138334773L);
        ViewGroup r34 = (ViewGroup) r33;
        View r42 = r113.getChildAt(0);
        AbstractC0295Gu.m625r(-143731080558645L);
        ViewGroup r43 = (ViewGroup) r42;
        r43.post(new RunnableC2745y7(r43, r7));
        C1456gf.m2805o(r43);
        FrameLayout r612 = new FrameLayout(r1527.getContext());
        r612.setElevation(1.0f);
        ImageView r29 = new ImageView(r1527.getContext());
        r29.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-142339511154741L)));
        r612.addView(r29, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(r026) + C2262n5.m4599a(r1527.getContext(), "status_bar_height")));
        LinearLayout r210 = new LinearLayout(r1527.getContext());
        r210.setOrientation(1);
        Space r52 = new Space(r1527.getContext());
        Context r1528 = MainApplication.f5549a;
        if (r1528 != null) goto L134;
        r1528 = C1456gf.f5172p;
        if (r1528 != null) goto L134;
        r1528 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L134:
        AbstractC0295Gu.m625r(-838600954476597L);
        r210.addView(r52, -1, C2262n5.m4599a(r1528, "status_bar_height"));
        r113.removeView(r43);
        r210.addView(r43, -1, -2);
        r612.addView(r210, -1, -2);
        r34.addView(r612, 0, new ViewGroup.LayoutParams(-1, -2));
        r113.addView(new Space(r026), 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(r026)));
        goto L142
    L135:
        final ViewGroup r114 = (ViewGroup) r026.findViewById(android.R.id.content);
        ViewParent r104 = r114.getParent();
        AbstractC0295Gu.m625r(-149039660136501L);
        View r105 = ((ViewGroup) r104).getChildAt(1);
        AbstractC0295Gu.m625r(-147648090732597L);
        final ViewGroup r106 = (ViewGroup) r105;
        View r11 = C1456gf.m2810v(r1523, AbstractC0295Gu.m625r(-147356032956469L));
        AbstractC0295Gu.m625r(-147570781321269L);
        C1456gf.m2807r((ViewGroup) r11);
        if (r026.getClass().getName().equals(AbstractC0295Gu.m625r(-148378235172917L)) == false) goto L141;
        View r115 = C1456gf.m2810v(r1523, AbstractC0295Gu.m625r(-147991688116277L));
        if (r115 == null) goto L140;
        r64 = r115.getLayoutParams();
    L140:
        AbstractC0295Gu.m625r(-146561464006709L);
        ((FrameLayout.LayoutParams) r64).topMargin = C1456gf.m2814z(r026);
    L141:
        C1456gf.m2805o(r106);
        final View r613 = new View(r026);
        HashMap r116 = AbstractC0999XA.f3193a;
        r613.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-146342420674613L)));
        r613.setElevation(1.0f);
        r114.addView(r613, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(r026) + new C2262n5(r026).f7974a));
        r106.post(new RunnableC2788z7(r106, r026, r114, r7));
        r106.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0008A7(r106, r114, r613, r7));
        View r1529 = C1456gf.m2810v(r1523, AbstractC0295Gu.m625r(-146475564660789L));
        AbstractC0295Gu.m625r(-147214299035701L);
        ViewGroup r1530 = (ViewGroup) r1529;
        AbstractC0295Gu.m625r(-210582246520885L);
        r1530.post(new RunnableC2745y7(r1530, r5));
        goto L142
    L143:
        AbstractC0295Gu.m625r(-458655262570549L);
        C2428qs r1531 = ((C1494hG) r15).f5263a;
        Object r027 = r1531.f8521b;
        AbstractC0295Gu.m625r(-458711097145397L);
        if (((View) r027).getContext().getClass().getName().equals(AbstractC0295Gu.m625r(-459497076160565L)) == false) goto L148;
        Object[] r1532 = (Object[]) r1531.f8522c;
        if (r1532 == null) goto L148;
        r1532[0] = 0;
    L148:
        return r8;
    L149:
        AbstractC0295Gu.m625r(-168555991529525L);
        C2428qs r1533 = ((C1494hG) r15).f5263a;
        Object r028 = r1533.f8521b;
        AbstractC0295Gu.m625r(-168611826104373L);
        View r029 = (View) r028;
        if (r029 != null) goto L152;
        boolean r030 = false;
    L153:
        if (r030 == false) goto L155;
        ((Object[]) r1533.f8522c)[0] = null;
    L155:
        return r8;
    L152:
        r030 = Object.class.equals(r029.getTag(R.id.tag_view_bg_ban));
        goto L153
    L156:
        AbstractC0295Gu.m625r(-236708532582453L);
        C2428qs r1534 = ((C1494hG) r15).f5263a;
        Field[] r031 = r1534.f8521b.getClass().getDeclaredFields();
        AbstractC0295Gu.m625r(-236760072190005L);
        int r211 = r031.length;
        int r35 = 0;
    L157:
        if (r35 >= r211) goto L162;
        Field r44 = r031[r35];
        if (AbstractC0585Nj.m1134a(r44.getType(), Button.class) == false) goto L161;
        r44.setAccessible(true);
        Object r45 = r44.get(r1534.f8521b);
        AbstractC0295Gu.m625r(-236858856437813L);
        Button r46 = (Button) r45;
        r46.addTextChangedListener(new C1351e5(r7, r46));
    L161:
        r35 = r35 + 1;
        goto L157
    L162:
        return r8;
    L163:
        C1494hG r1535 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-185168925030453L);
        if (C1246c5.f4237b.m2024e() == false) goto L166;
        Object r1536 = r1535.f5263a.f8521b;
        AbstractC0295Gu.m625r(-185224759605301L);
        ((Activity) r1536).getIntent().putExtra(AbstractC0295Gu.m625r(-184924111894581L), true);
    L166:
        return r8;
    L167:
        C1494hG r1537 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-186066573195317L);
        if (C1123a5.f3536b.m2024e() == false) goto L179;
        Object r1538 = r1537.f5263a.f8521b;
        C2648vx r032 = new C2648vx();
        if ((r1538 instanceof Class) == false) goto L172;
        r032.f9163b = (Class) r1538;
    L176:
        r032.f9165d = Button.class;
        Button r1539 = (Button) r032.m5178a();
        if (r1539 == null) goto L179;
        r1539.callOnClick();
        goto L179
    L172:
        r032.f9164c = r1538;
        if (r1538 == null) goto L175;
        r6 = r1538.getClass();
    L175:
        r032.f9163b = r6;
    L179:
        return r8;
    L180:
        C1494hG r1540 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-187651416127541L);
        if (C1123a5.f3536b.m2024e() == false) goto L188;
        Object r1541 = r1540.f5263a.f8521b;
        AbstractC0295Gu.m625r(-187707250702389L);
        Activity r1542 = (Activity) r1541;
        SharedPreferences r033 = AbstractC0599Nx.f1939a;
        boolean r034 = AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-186307091363893L), false);
        boolean r117 = AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-186358630971445L), false);
        boolean r212 = AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-185877594634293L), false);
        int r035 = r034;
        if (r117 == false) goto L185;
        r035 = (r034 ? 1 : 0) | 2;
    L185:
        if (r212 == false) goto L187;
        r035 = (r035 == true ? 1 : 0) | 4;
    L187:
        r1542.getIntent().putExtra(AbstractC0295Gu.m625r(-185946314111029L), r035);
    L188:
        return r8;
    L189:
        Byte r1543 = (Byte) r15;
        r1543.byteValue();
        String r1544 = String.format(AbstractC0295Gu.m625r(-391632297916469L), Arrays.copyOf(new Object[]{r1543}, 1));
        AbstractC0295Gu.m625r(-391653772752949L);
        return r1544;
    L191:
        AbstractC0295Gu.m625r(-459763364132917L);
        Object r1545 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-459819198707765L);
        Activity r1546 = (Activity) r1545;
        if (r1546 != null) goto L194;
        C1456gf.f5173q = null;
    L195:
        return r8;
    L194:
        C1456gf.f5173q = new WeakReference(r1546);
        goto L195
    L196:
        AbstractC0295Gu.m625r(-460008177268789L);
        Object r1547 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-460064011843637L);
        Activity r1548 = (Activity) r1547;
        if (r1548 != null) goto L199;
        C1456gf.f5173q = null;
    L200:
        return r8;
    L199:
        C1456gf.f5173q = new WeakReference(r1548);
        goto L200
    L201:
        C1494hG r1549 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-459952342693941L);
        LuaUiScheduler.INSTANCE.onActivityPaused();
        return r8;
    L203:
        C1494hG r1550 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-459896508119093L);
        LuaUiScheduler.INSTANCE.onActivityPaused();
        return r8;
    L205:
        AbstractC0295Gu.m625r(-461790588696629L);
        Object r1551 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-461296667457589L);
        Activity r1552 = (Activity) r1551;
        if (r1552 != null) goto L208;
        C1456gf.f5173q = null;
    L209:
        LuaUiScheduler.INSTANCE.onActivityResumed();
        return r8;
    L208:
        C1456gf.f5173q = new WeakReference(r1552);
        goto L209
    L211:
        AbstractC0295Gu.m625r(-460935890204725L);
        Object r1553 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-461541480593461L);
        Activity r1554 = (Activity) r1553;
        if (r1554 != null) goto L214;
        C1456gf.f5173q = null;
    L215:
        LuaUiScheduler.INSTANCE.onActivityResumed();
        return r8;
    L214:
        C1456gf.f5173q = new WeakReference(r1554);
        goto L215
    L217:
        AbstractC0295Gu.m625r(-461180703340597L);
        Object r1555 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-461236537915445L);
        Activity r1556 = (Activity) r1555;
        if (r1556 != null) goto L220;
        C1456gf.f5173q = null;
    L221:
        return r8;
    L220:
        C1456gf.f5173q = new WeakReference(r1556);
        goto L221
    L222:
        AbstractC0295Gu.m625r(-462525028104245L);
        Object r1557 = ((C1494hG) r15).f5263a.f8521b;
        AbstractC0295Gu.m625r(-462580862679093L);
        Activity r1558 = (Activity) r1557;
        if (r1558 != null) goto L225;
        C1456gf.f5173q = null;
    L226:
        return r8;
    L225:
        C1456gf.f5173q = new WeakReference(r1558);
        goto L226
    L227:
        C1494hG r1559 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-189837554481205L);
        if (C1240c.f4218b.m2024e() == false) goto L263;
        Object r1560 = ((Object[]) r1559.f5263a.f8522c)[0];
        if (C1240c.f4219c != null) goto L239;
        Field[] r036 = r1560.getClass().getFields();
        AbstractC0295Gu.m625r(-189893389056053L);
        int r118 = r036.length;
        int r213 = 0;
    L233:
        if (r213 >= r118) goto L239;
        Field r36 = r036[r213];
        C1538iG r53 = new C1538iG(r36.getType());     // Catch: Exception -> L286
        r53.m2921f(AbstractC0295Gu.m625r(-188308546123829L));     // Catch: Exception -> L286
        if (r53.m2920e() == null) goto L238;
        C1240c.f4219c = r36;     // Catch: Exception -> L286
    L238:
        r213 = r213 + 1;
    L239:
        Field r037 = C1240c.f4219c;
        if (r037 == null) goto L242;
        Object r1561 = r037.get(r1560);
    L243:
        if (r1561 == null) goto L263;
        Field[] r038 = r1561.getClass().getFields();
        if (r038 == null) goto L263;
        int r119 = r038.length;
    L247:
        if (r7 >= r119) goto L263;
        Field r214 = r038[r7];
        if (AbstractC0585Nj.m1134a(r214.getType(), String.class) == false) goto L262;
        Object r37 = r214.get(r1561);     // Catch: Exception -> L287
        if ((r37 instanceof String) == false) goto L254;
        String r38 = (String) r37;     // Catch: Exception -> L287
    L255:
        if (r38 == null) goto L262;
        if (r38.length() == 0) goto L262;
        AbstractC0295Gu.m625r(-188372970633269L);     // Catch: Exception -> L287
        if (new JSONObject(r38).has(AbstractC0295Gu.m625r(-188424510240821L)) == false) goto L262;
        r214.set(r1561, AbstractC0295Gu.m625r(-188480344815669L));     // Catch: Exception -> L287
        goto L262
    L254:
        r38 = null;
    L262:
        r7 = r7 + 1;
        goto L247
    L242:
        r1561 = null;
    L263:
        return r8;
    L264:
        C1494hG r1562 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-188291366254645L);
        if (C1240c.f4218b.m2024e() == false) goto L267;
        r1562.f5263a.m4864C(Boolean.FALSE);
    L267:
        return r8;
    L268:
        AbstractC0295Gu.m625r(-188493229717557L);
        C2428qs r1563 = ((C1494hG) r15).f5263a;
        if (C1240c.f4218b.m2024e() == false) goto L281;
        Object[] r039 = (Object[]) r1563.f8522c;
        int r120 = r039.length;
    L272:
        if (r7 >= r120) goto L281;
        Object r215 = r039[r7];
        if ((r215 instanceof String) == false) goto L280;
        if (((String) r215).startsWith(AbstractC0295Gu.m625r(-188076617889845L)) == false) goto L280;
        JSONObject r39 = new JSONObject((String) r215);     // Catch: Exception -> L288
        if (AbstractC0585Nj.m1134a(r39.getString(AbstractC0295Gu.m625r(-188085207824437L)), AbstractC0295Gu.m625r(-188123862530101L)) == false) goto L280;
        JSONObject r47 = r39.getJSONObject(AbstractC0295Gu.m625r(-188196876974133L));     // Catch: Exception -> L288
        r47.put(AbstractC0295Gu.m625r(-188218351810613L), AbstractC0295Gu.m625r(-188265596450869L));     // Catch: Exception -> L288
        r39.put(AbstractC0295Gu.m625r(-188269891418165L), r47);     // Catch: Exception -> L288
        Object[] r48 = (Object[]) r1563.f8522c;     // Catch: Exception -> L288
        r48[AbstractC0650P4.m1312G(r215, r48)] = r39.toString();     // Catch: Exception -> L288
    L280:
        r7 = r7 + 1;
    L281:
        return r8;
    L282:
        C1494hG r1564 = (C1494hG) r15;
        AbstractC0295Gu.m625r(-189781719906357L);
        if (C1240c.f4218b.m2024e() == false) goto L285;
        r1564.f5263a.m4864C(null);
    L285:
        return r8;
    L78:
        return m2317c(r15);
    }
}
