package p000;

import android.R;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.AbstractC2156b;

/* JADX INFO: renamed from: Ob */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0620Ob implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1983a;

    public /* synthetic */ C0620Ob(int r1) {
        this.f1983a = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r21) {
        int r1 = this.f1983a;
        int r2 = 3;
        int r8 = 13;
        int r9 = 2;
        Object r10 = null;
        Class<?> r102 = null;
        Class<?> r103 = null;
        Class<?> r104 = null;
        ViewParent r105 = null;
        boolean r11 = true;
        int r12 = 0;
        C0829TC r13 = C0829TC.f2620a;
        switch(r1) {
            case 0: goto L244;
            case 1: goto L237;
            case 2: goto L235;
            case 3: goto L178;
            case 4: goto L176;
            case 5: goto L174;
            case 6: goto L156;
            case 7: goto L150;
            case 8: goto L139;
            case 9: goto L135;
            case 10: goto L131;
            case 11: goto L129;
            case 12: goto L127;
            case 13: goto L125;
            case 14: goto L123;
            case 15: goto L121;
            case 16: goto L119;
            case 17: goto L76;
            case 18: goto L67;
            case 19: goto L58;
            case 20: goto L53;
            case 21: goto L43;
            case 22: goto L41;
            case 23: goto L39;
            case 24: goto L37;
            case 25: goto L29;
            case 26: goto L23;
            case 27: goto L19;
            case 28: goto L15;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-526537220683829L);
        C2428qs r14 = ((C1494hG) r21).f5263a;
        Object r22 = r14.f8521b;
        AbstractC0295Gu.m625r(-526593055258677L);
        if (C2128k5.m4313d((Activity) r22) == false) goto L14;
        Object r15 = r14.f8521b;
        C2648vx r23 = new C2648vx();
        if ((r15 instanceof Class) == false) goto L9;
        r23.f9163b = (Class) r15;
    L13:
        r23.m5180c(AbstractC0295Gu.m625r(-526292407547957L));
        r23.m5181d(Boolean.FALSE);
        goto L14
    L9:
        r23.f9164c = r15;
        if (r15 == null) goto L12;
        r102 = r15.getClass();
    L12:
        r23.f9163b = r102;
    L14:
        return r13;
    L15:
        AbstractC0295Gu.m625r(-527516473227317L);
        C2428qs r16 = ((C1494hG) r21).f5263a;
        Object r24 = XposedHelpers.callMethod(r16.f8521b, AbstractC0295Gu.m625r(-527568012834869L), new Object[0]);
        AbstractC0295Gu.m625r(-527632437344309L);
        ViewGroup r25 = (ViewGroup) r24;
        Object r17 = r16.f8521b;
        AbstractC0295Gu.m625r(-527340379568181L);
        Activity r3 = (Activity) r17;
        if (C2128k5.m4313d(r3) == false) goto L18;
        Object r18 = XposedHelpers.callMethod(r17, AbstractC0295Gu.m625r(-525940220229685L), new Object[0]);
        AbstractC0295Gu.m625r(-526021824608309L);
        View r19 = ((ViewGroup) r18).getChildAt(0);
        AbstractC0295Gu.m625r(-525729766832181L);
        r25.post(new RunnableC2788z7(r3, r25, (ViewGroup) r19, r9));
    L18:
        return r13;
    L19:
        String r110 = (String) r21;
        AbstractC0295Gu.m625r(-46634754897973L);
        if (r110.length() <= 0) goto L22;
        C0183EA.f539a.getClass();
        C0183EA.m382j(r110);
    L22:
        return r13;
    L23:
        AbstractC0295Gu.m625r(-46231027972149L);
        Object r111 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-46282567579701L);
        Activity r112 = (Activity) r111;
        String r26 = C1456gf.m2791I();
        C0183EA.f539a.getClass();
        if (AbstractC0585Nj.m1134a(C0183EA.f540b, r26) == true) goto L28;
        C2214m0.f7706a.getClass();
        if (C2214m0.m4455b(r112, r26) == false) goto L28;
        C1036Y4 r27 = C1036Y4.f3308a;     // Catch: Exception -> L250
        C0620Ob r32 = new C0620Ob(27);     // Catch: Exception -> L250
        C1407fa r4 = new C1407fa(r112, 1);     // Catch: Exception -> L250
        r27.getClass();     // Catch: Exception -> L250
        C1036Y4.m1982a(r112, r32, r4, false);     // Catch: Exception -> L250
    L28:
        return r13;
    L29:
        AbstractC0295Gu.m625r(-47983374628917L);
        C2227mD r28 = C2227mD.f7746a;
        Object r113 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-48034914236469L);
        Activity r114 = (Activity) r113;
        r28.getClass();
        AbstractC0295Gu.m625r(-463422676269109L);
        if (C2227mD.m4485d().getBoolean(AbstractC0295Gu.m625r(-462907280193589L), false) == false) goto L33;
    L36:
        return r13;
    L33:
        if ((System.currentTimeMillis() - C2227mD.m4485d().getLong(AbstractC0295Gu.m625r(-462984589604917L), 0)) < 600000) goto L36;
        C2227mD.m4484c(r114, false);
        goto L36
    L37:
        Map.Entry r115 = (Map.Entry) r21;
        String r29 = (String) r115.getKey();
        AbstractC2156b r116 = (AbstractC2156b) r115.getValue();
        StringBuilder r33 = new StringBuilder();
        AbstractC2478rz.m4964a(r33, r29);
        r33.append(':');
        r33.append(r116);
        return r33.toString();
    L39:
        C0268G9 r117 = (C0268G9) r21;
        C0268G9.m551a(r117, "JsonPrimitive", new C2680wm(new C1302d(r8)));
        C0268G9.m551a(r117, "JsonNull", new C2680wm(new C1302d(14)));
        C0268G9.m551a(r117, "JsonLiteral", new C2680wm(new C1302d(15)));
        C0268G9.m551a(r117, "JsonObject", new C2680wm(new C1302d(16)));
        C0268G9.m551a(r117, "JsonArray", new C2680wm(new C1302d(17)));
        return r13;
    L41:
        AbstractC0295Gu.m625r(-51067161147445L);
        Object r118 = ((C1494hG) r21).f5263a.f8521b;
        String r210 = AbstractC0295Gu.m625r(-51118700754997L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r119 = XposedHelpers.callMethod(r118, r210, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-50689204025397L);
        C1456gf.f5171o = ((Integer) r119).intValue();
        return r13;
    L43:
        AbstractC0295Gu.m625r(-51689931405365L);
        Object r120 = ((Object[]) ((C1494hG) r21).f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-51741471012917L);
        Menu r121 = (Menu) r120;
        if (r121.size() != 2) goto L52;
        MenuItem r211 = r121.getItem(0);
        MenuItem r34 = r121.getItem(1);
        r121.clear();
        MenuItem r42 = r121.add(0, r211.getItemId(), 0, r211.getTitle());
        HashMap r5 = AbstractC0999XA.f3193a;
        Drawable r52 = C1517hw.m2890b(AbstractC0295Gu.m625r(-52527450028085L));
        if (r52 != null) goto L48;
        r52 = r211.getIcon();
    L48:
        r42.setIcon(r52);
        MenuItem r122 = r121.add(0, r34.getItemId(), 0, r34.getTitle());
        Drawable r212 = C1517hw.m2890b(AbstractC0295Gu.m625r(-52690658785333L));
        if (r212 != null) goto L51;
        r212 = r34.getIcon();
    L51:
        r122.setIcon(r212);
    L52:
        return r13;
    L53:
        AbstractC0295Gu.m625r(-40428527155253L);
        Object r123 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-40480066762805L);
        Activity r124 = (Activity) r123;
        ViewGroup r213 = (ViewGroup) r124.findViewById(R.id.content);
        if (AbstractC0585Nj.m1134a(r213.getTag(io.github.cherrywechat.R.id.tag_main_init), Object.class) == true) goto L57;
        r213.setTag(io.github.cherrywechat.R.id.tag_main_init, Object.class);
        ViewParent r35 = r213.getParent();
        AbstractC0295Gu.m625r(-40179419052085L);
        View r36 = ((ViewGroup) r35).getChildAt(1);
        AbstractC0295Gu.m625r(-38787849648181L);
        ViewGroup r37 = (ViewGroup) r36;
        View r43 = C1456gf.m2810v(r213, AbstractC0295Gu.m625r(-38495791872053L));
        AbstractC0295Gu.m625r(-38676180498485L);
        ViewGroup r44 = (ViewGroup) r43;
        View r6 = C1456gf.m2810v(r213, AbstractC0295Gu.m625r(-39483634350133L));
        AbstractC0295Gu.m625r(-39101382260789L);
        ViewParent r7 = r44.getParent();
        AbstractC0295Gu.m625r(-37709812856885L);
        ViewGroup r72 = (ViewGroup) r7;
        ImageView r92 = new ImageView(r72.getContext());
        HashMap r106 = AbstractC0999XA.f3193a;
        r92.setBackground(C1517hw.m2890b(AbstractC0295Gu.m625r(-37417755080757L)));
        r92.setElevation(1.0f);
        r72.addView(r92, 0, new ViewGroup.LayoutParams(-1, C1456gf.m2814z(r124) + C2262n5.m4599a(r72.getContext(), "status_bar_height")));
        r37.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0543Mk(r37, r213, r92, 0));
        ImageView r214 = new ImageView(r124);
        r214.setImageDrawable(C1517hw.m2890b(AbstractC0295Gu.m625r(-37550899066933L)));
        r214.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams r125 = new RelativeLayout.LayoutParams(-1, -1);
        r125.addRule(13);
        r72.addView(r214, 0, r125);
        r72.post(new RunnableC0586Nk(r37, r92, r44, (ViewGroup) r6));
    L57:
        return r13;
    L58:
        AbstractC0295Gu.m625r(-50856707749941L);
        Object r126 = ((C1494hG) r21).f5263a.f8521b;
        C2648vx r215 = new C2648vx();
        if ((r126 instanceof Class) == false) goto L61;
        r215.f9163b = (Class) r126;
    L65:
        r215.m5182e(AbstractC0295Gu.m625r(-50908247357493L));
        ((Activity) r215.m5178a()).getWindow().setStatusBarColor(0);
        return r13;
    L61:
        r215.f9164c = r126;
        if (r126 == null) goto L64;
        r103 = r126.getClass();
    L64:
        r215.f9163b = r103;
        goto L65
    L67:
        AbstractC0295Gu.m625r(-52295521794101L);
        Object r127 = ((C1494hG) r21).f5263a.f8521b;
        C2648vx r216 = new C2648vx();
        if ((r127 instanceof Class) == false) goto L70;
        r216.f9163b = (Class) r127;
    L74:
        r216.m5182e(AbstractC0295Gu.m625r(-52347061401653L));
        ((Activity) r216.m5178a()).getWindow().setStatusBarColor(0);
        return r13;
    L70:
        r216.f9164c = r127;
        if (r127 == null) goto L73;
        r104 = r127.getClass();
    L73:
        r216.f9163b = r104;
        goto L74
    L76:
        AbstractC0295Gu.m625r(-37641093380149L);
        C2428qs r128 = ((C1494hG) r21).f5263a;
        if (r128 == null) goto L79;
        Object r217 = r128.f8521b;
    L80:
        AbstractC0295Gu.m625r(-38242388801589L);
        Object r129 = ((Object[]) r128.f8522c)[0];
        AbstractC0295Gu.m625r(-37950331025461L);
        int r130 = ((Integer) r129).intValue();
        View r218 = ((ViewGroup) r217).getChildAt(0);
        AbstractC0295Gu.m625r(-38156489455669L);
        LinearLayout r219 = (LinearLayout) r218;
        int r38 = r219.getChildCount();
    L81:
        if (r12 >= r38) goto L118;
        View r45 = r219.getChildAt(r12);
        AbstractC0295Gu.m625r(-36786394888245L);
        ViewGroup r46 = (ViewGroup) r45;
        TextView r53 = (TextView) r46.findViewById(AbstractC0828TB.f2615g);
        if (r12 != r130) goto L85;
        HashMap r62 = AbstractC0999XA.f3193a;
        int r63 = C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-36494337112117L));
    L86:
        if (r53 == null) goto L88;
        r53.setTag(io.github.cherrywechat.R.id.tag_textview_color_ban, null);
        r53.setTextColor(r63);
        r53.setTag(io.github.cherrywechat.R.id.tag_textview_color_ban, TextView.class);
    L88:
        Object r47 = r46.getTag();
        if ((r47 instanceof ImageView) == false) goto L91;
        ImageView r48 = (ImageView) r47;
    L92:
        if (r48 == null) goto L117;
        if (r12 == 0) goto L111;
        if (r12 == 1) goto L106;
        if (r12 == 2) goto L101;
        HashMap r54 = AbstractC0999XA.f3193a;
        if (r12 != r130) goto L99;
        String r55 = AbstractC0295Gu.m625r(-36270998812725L);
    L100:
        Drawable r56 = C1517hw.m2890b(r55);
    L116:
        r48.setImageDrawable(r56);
        goto L117
    L99:
        r55 = AbstractC0295Gu.m625r(-35880156788789L);
        goto L100
    L101:
        HashMap r57 = AbstractC0999XA.f3193a;
        if (r12 != r130) goto L104;
        String r58 = AbstractC0295Gu.m625r(-35334695942197L);
    L105:
        r56 = C1517hw.m2890b(r58);
        goto L116
    L104:
        r58 = AbstractC0295Gu.m625r(-36082020251701L);
        goto L105
    L106:
        HashMap r59 = AbstractC0999XA.f3193a;
        if (r12 != r130) goto L109;
        String r510 = AbstractC0295Gu.m625r(-35515084568629L);
    L110:
        r56 = C1517hw.m2890b(r510);
        goto L116
    L109:
        r510 = AbstractC0295Gu.m625r(-35695473195061L);
        goto L110
    L111:
        HashMap r511 = AbstractC0999XA.f3193a;
        if (r12 != r130) goto L114;
        String r512 = AbstractC0295Gu.m625r(-37301790963765L);
    L115:
        r56 = C1517hw.m2890b(r512);
        goto L116
    L114:
        r512 = AbstractC0295Gu.m625r(-36953898612789L);
    L117:
        r12 = r12 + 1;
        goto L81
    L91:
        r48 = null;
        goto L92
    L85:
        HashMap r64 = AbstractC0999XA.f3193a;
        r63 = C1517hw.m2889a(-7829368, AbstractC0295Gu.m625r(-37168646977589L));
        goto L86
    L118:
        return r13;
    L79:
        r217 = null;
        goto L80
    L119:
        AbstractC0295Gu.m625r(-51445118269493L);
        Object r131 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-51573967288373L);
        HashMap r220 = AbstractC0999XA.f3193a;
        ((View) r131).setBackground(new ColorDrawable(C1517hw.m2889a(1426063360, AbstractC0295Gu.m625r(-51260434675765L))));
        return r13;
    L121:
        AbstractC0295Gu.m625r(-5549097744437L);
        ((Object[]) ((C1494hG) r21).f5263a.f8522c)[0] = C1145ak.f3637c;
        return r13;
    L123:
        AbstractC0295Gu.m625r(-7361573943349L);
        Object r132 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-5841155520565L);
        ((Paint) r132).setTypeface(C1145ak.f3637c);
        return r13;
    L125:
        AbstractC0295Gu.m625r(-7305739368501L);
        ((Object[]) ((C1494hG) r21).f5263a.f8522c)[0] = C1145ak.f3637c;
        return r13;
    L127:
        AbstractC0295Gu.m625r(-7249904793653L);
        ((Object[]) ((C1494hG) r21).f5263a.f8522c)[0] = C1145ak.f3637c;
        return r13;
    L129:
        AbstractC0295Gu.m625r(-6859062769717L);
        Object r133 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-7537667602485L);
        ((TextView) r133).setTypeface(C1145ak.f3637c);
        return r13;
    L131:
        C1494hG r134 = (C1494hG) r21;
        AbstractC0295Gu.m625r(-26684631808053L);
        if (C1055Yh.f3357b.m2024e() == false) goto L134;
        r134.f5263a.m4864C(Float.valueOf(C1055Yh.f3358c));
    L134:
        return r13;
    L135:
        C1494hG r135 = (C1494hG) r21;
        AbstractC0295Gu.m625r(-29274497087541L);
        if (C1265ch.f4301b.m2024e() == false) goto L138;
        Object r136 = ((Object[]) r135.f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-29326036695093L);
        ViewGroup r137 = (ViewGroup) r136;
        r137.post(new RunnableC2745y7(r137, r2));
    L138:
        return r13;
    L139:
        AbstractC0295Gu.m625r(-54537494722613L);
        Object r138 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-54666343741493L);
        ViewGroup r139 = (ViewGroup) r138;
        C2648vx r221 = new C2648vx();
        r221.f9164c = r139;
        if (r139 == null) goto L142;
        Class<?> r140 = r139.getClass();
    L143:
        r221.f9163b = r140;
        r221.m5182e(AbstractC0295Gu.m625r(-53274774337589L));
        View r141 = (View) r221.m5178a();
        if (r141 == null) goto L146;
        r105 = r141.getParent();
    L146:
        AbstractC0295Gu.m625r(-52944061855797L);
        ViewGroup r107 = (ViewGroup) r105;
        int r142 = r107.getChildCount();
        int r222 = 0;
    L147:
        if (r222 >= r142) goto L149;
        ViewGroup.LayoutParams r39 = r107.getChildAt(r222).getLayoutParams();
        r39.width = 0;
        r39.height = 0;
        r222 = r222 + 1;
        goto L147
    L149:
        return r13;
    L142:
        r140 = null;
        goto L143
    L150:
        AbstractC0295Gu.m625r(-66640712562741L);
        Object r143 = ((Object[]) ((C1494hG) r21).f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-66692252170293L);
        ViewGroup r144 = (ViewGroup) r143;
        C1456gf.m2805o(r144);
        HashMap r223 = AbstractC0999XA.f3193a;
        Context r224 = r144.getContext();
        AbstractC0295Gu.m625r(-65300682766389L);
        if (C1517hw.m2894f(r224) == true) goto L153;
        int r225 = -285212673;
    L154:
        C1456gf.m2796N(r144, new ColorDrawable(r225));
        return r13;
    L153:
        r225 = -301989888;
        goto L154
    L156:
        AbstractC0295Gu.m625r(-55658481186869L);
        Object r145 = ((C1494hG) r21).f5263a.f8521b;
        C2648vx r310 = new C2648vx();
        if ((r145 instanceof Class) == false) goto L159;
        r310.f9163b = (Class) r145;
    L164:
        r310.m5182e(AbstractC0295Gu.m625r(-55710020794421L));
        View r146 = (View) r310.m5178a();
        if (r146 == null) goto L167;
        r146.setBackground(null);
        r146.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, Object.class);
    L167:
        if (r146 == null) goto L169;
        ViewParent r147 = r146.getParent();
    L170:
        AbstractC0295Gu.m625r(-54284091652149L);
        View r148 = ((ViewGroup) r147).getChildAt(3);
        if (r148 == null) goto L173;
        r148.setBackground(null);
        r148.setTag(io.github.cherrywechat.R.id.tag_view_bg_ban, Object.class);
    L173:
        return r13;
    L169:
        r147 = null;
        goto L170
    L159:
        r310.f9164c = r145;
        if (r145 == null) goto L162;
        Class<?> r149 = r145.getClass();
    L163:
        r310.f9163b = r149;
        goto L164
    L162:
        r149 = null;
        goto L163
    L174:
        AbstractC0295Gu.m625r(-55606941579317L);
        return Boolean.valueOf(!((String) r21).equals(AbstractC0295Gu.m625r(-55619826481205L)));
    L176:
        AbstractC0295Gu.m625r(-67473936218165L);
        Object r150 = ((XC_MethodHook.MethodHookParam) ((C1494hG) r21).f5263a.f8523d).getResult();
        AbstractC0295Gu.m625r(-67525475825717L);
        C1456gf.m2805o((ViewGroup) r150);
        return r13;
    L178:
        AbstractC0295Gu.m625r(-53751515707445L);
        C2428qs r151 = ((C1494hG) r21).f5263a;
        Object r226 = ((XC_MethodHook.MethodHookParam) r151.f8523d).getResult();
        AbstractC0295Gu.m625r(-53803055314997L);
        View r227 = (View) r226;
        if (r227.getContext().getClass().getName().equals(AbstractC0295Gu.m625r(-53489522702389L)) == true) goto L182;
    L234:
        return r13;
    L182:
        if ((r227 instanceof ViewGroup) == false) goto L234;
        ViewGroup r311 = (ViewGroup) r227;
        Object r49 = r311.getTag();
        if (r49 == null) goto L223;
        AbstractC0295Gu.m625r(-166777875068981L);
        AbstractC0295Gu.m625r(-166795054938165L);
        C2648vx r513 = new C2648vx();
        if ((r49 instanceof Class) == false) goto L188;
        r513.f9163b = (Class) r49;
    L189:
        r513.f9165d = Boolean.TYPE;
        Object r410 = r513.m5178a();
        AbstractC0295Gu.m625r(-166838004611125L);
        boolean r411 = ((Boolean) r410).booleanValue();
        View r514 = r311.findViewWithTag(AbstractC0295Gu.m625r(-165412075468853L));
        View r82 = r311.findViewWithTag(AbstractC0295Gu.m625r(-165463615076405L));
        View r1410 = r311.findViewWithTag(AbstractC0295Gu.m625r(-164978283771957L));
        View r93 = C1456gf.m2788F(r311, new int[]{0, 0, 2});
        AbstractC0295Gu.m625r(-165029823379509L);
        ImageView r94 = (ImageView) r93;
        View r152 = C1456gf.m2788F(r311, new int[]{0, 0, 1});
        AbstractC0295Gu.m625r(-165845867165749L);
        TextView r153 = (TextView) r152;
        Object r65 = r151.f8521b;
        AbstractC0295Gu.m625r(-69556995356725L);
        ListAdapter r66 = ((HeaderViewListAdapter) r65).getWrappedAdapter();
        Object r154 = ((Object[]) r151.f8522c)[0];
        AbstractC0295Gu.m625r(-69325067122741L);
        Object r155 = r66.getItem(((Integer) r154).intValue());
        if (r155 == null) goto L192;
        String r67 = AbstractC0295Gu.m625r(-69531225552949L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r156 = XposedHelpers.callMethod(r155, r67, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-70123931039797L);
        ((ContentValues) r156).getAsString(AbstractC0295Gu.m625r(-69861938034741L));
    L192:
        r311.setBackgroundTintList(ColorStateList.valueOf(0));
        View r157 = r311.getChildAt(0);
        if (r411 == false) goto L195;
        HashMap r412 = AbstractC0999XA.f3193a;
        Drawable r413 = C1517hw.m2890b(AbstractC0295Gu.m625r(-69900592740405L));
    L196:
        r157.setBackground(r413);
        HashMap r158 = AbstractC0999XA.f3193a;
        int r159 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-68633577388085L));
        if (r159 == 0) goto L200;
        if (r94 == null) goto L200;
        r94.setBackgroundTintList(ColorStateList.valueOf(r159));
    L200:
        Drawable r160 = C1517hw.m2890b(AbstractC0295Gu.m625r(-68242735364149L));
        if (r160 == null) goto L213;
        if (r153 == null) goto L213;
        CharSequence r414 = r153.getText();
        if (r414 == null) goto L208;
        if (r414.length() == 0) goto L208;
    L210:
        r153.setBackground(r160);
        int r161 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-69020124444725L));
        if (r161 == 0) goto L213;
        r153.setTextColor(r161);
    L208:
        if (r153.getVisibility() != 0) goto L210;
        r153.setText(AbstractC0295Gu.m625r(-69002944575541L));
    L213:
        int r162 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-69209103005749L));
        if (r162 == 0) goto L217;
        if (r514 == null) goto L217;
        String r415 = AbstractC0295Gu.m625r(-68809671047221L);
        Object[] r163 = {Integer.valueOf(r162)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r514, r415, Arrays.copyOf(r163, 1));
    L217:
        int r164 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-68865505622069L));
        if (r164 == 0) goto L223;
        if (r82 == null) goto L221;
        String r416 = AbstractC0295Gu.m625r(-67362267068469L);
        Object[] r515 = {Integer.valueOf(r164)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r82, r416, Arrays.copyOf(r515, 1));
    L221:
        if (r1410 == null) goto L223;
        String r417 = AbstractC0295Gu.m625r(-67418101643317L);
        Object[] r165 = {Integer.valueOf(r164)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r1410, r417, Arrays.copyOf(r165, 1));
        goto L223
    L195:
        HashMap r418 = AbstractC0999XA.f3193a;
        r413 = C1517hw.m2890b(AbstractC0295Gu.m625r(-70085276334133L));
        goto L196
    L188:
        r513.f9164c = r49;
        r513.f9163b = r49.getClass();
    L223:
        View r166 = r311.getChildAt(r311.getChildCount() - 1);
        if ((r166 instanceof ViewGroup) == false) goto L234;
        C1456gf.m2805o((ViewGroup) r166);
        if (r227.findViewWithTag(Integer.valueOf(io.github.cherrywechat.R.id.tag_home_main_conversation_list_driver)) != null) goto L234;
        ArrayList r419 = new ArrayList();
        C1456gf.m2812x(r311, r419);
        if (r419.isEmpty() == true) goto L231;
        r10 = r419.get(0);
    L231:
        View r108 = (View) r10;
        if (r108 == null) goto L234;
        r108.setAlpha(0.0f);
        r227.setTag(io.github.cherrywechat.R.id.tag_home_main_conversation_list_driver, r108);
        goto L234
    L235:
        AbstractC0295Gu.m625r(-67246302951477L);
        Object r167 = ((C1494hG) r21).f5263a.f8521b;
        AbstractC0295Gu.m625r(-67924907784245L);
        ViewGroup r168 = (ViewGroup) r167;
        View r228 = new View(r168.getContext());
        HashMap r420 = AbstractC0999XA.f3193a;
        r228.setBackground(new ColorDrawable(C1517hw.m2889a(1426063360, AbstractC0295Gu.m625r(-67632850008117L))));
        FrameLayout.LayoutParams r312 = new FrameLayout.LayoutParams(-1, -1);
        r312.bottomMargin = AbstractC0295Gu.m616i(100);
        r168.addView(r228, 0, r312);
        return r13;
    L237:
        AbstractC0295Gu.m625r(-54893977008181L);
        Object r169 = ((C1494hG) r21).f5263a.f8521b;
        Field[] r229 = r169.getClass().getFields();
        AbstractC0295Gu.m625r(-54473070213173L);
        int r313 = r229.length;
        int r421 = 0;
    L238:
        if (r421 >= r313) goto L243;
        Field r516 = r229[r421];
        if (AbstractC0585Nj.m1134a(r516.getType(), Paint.class) == false) goto L242;
        r516.setAccessible(true);
        C0663Pb r68 = new C0663Pb(1);
        r68.setColor(0);
        r516.set(r169, r68);
    L242:
        r421 = r421 + 1;
        goto L238
    L243:
        return r13;
    L244:
        AbstractC0295Gu.m625r(-67233418049589L);
        if (((Class[]) r21).length == 0) goto L249;
        r11 = false;
    L249:
        return Boolean.valueOf(r11);
    }
}
