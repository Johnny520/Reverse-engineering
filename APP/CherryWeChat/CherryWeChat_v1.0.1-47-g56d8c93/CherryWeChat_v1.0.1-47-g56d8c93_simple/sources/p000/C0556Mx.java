package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gyf.immersionbar.RunnableC1286a;
import io.github.cherrywechat.application.MainApplication;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Mx */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0556Mx implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1824a;

    public /* synthetic */ C0556Mx(int r1) {
        this.f1824a = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r25) {
        int r0 = this.f1824a;
        Class<?> r14 = null;
        String r142 = null;
        boolean r15 = true;
        char r152 = 1;
        boolean r153 = true;
        r153 = true;
        boolean r154 = true;
        boolean r155 = true;
        boolean r6 = false;
        C0829TC r17 = C0829TC.f2620a;
        switch(r0) {
            case 0: goto L196;
            case 1: goto L187;
            case 2: goto L185;
            case 3: goto L178;
            case 4: goto L174;
            case 5: goto L165;
            case 6: goto L163;
            case 7: goto L155;
            case 8: goto L153;
            case 9: goto L146;
            case 10: goto L139;
            case 11: goto L131;
            case 12: goto L129;
            case 13: goto L127;
            case 14: goto L119;
            case 15: goto L84;
            case 16: goto L67;
            case 17: goto L52;
            case 18: goto L35;
            case 19: goto L20;
            case 20: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-576930071967797L);
        ((C1494hG) r25).f5263a.m4864C(null);
        return r17;
    L6:
        AbstractC0295Gu.m625r(-518428322428981L);
        Object r02 = ((C1494hG) r25).f5263a.f8521b;
        AbstractC0295Gu.m625r(-518479862036533L);
        Activity r03 = (Activity) r02;
        if (AbstractC1257cG.f4259b == 115) goto L11;
        AbstractC0295Gu.m625r(-596575252379701L);
        C0339Hv r20 = new C0339Hv();     // Catch: Exception -> L204
        AlertDialog r2 = new AlertDialog.Builder(r03).setTitle(AbstractC0295Gu.m625r(-596609612118069L)).setMessage(AbstractC0295Gu.m625r(-596656856758325L)).setCancelable(false).setPositiveButton(AbstractC0295Gu.m625r(-596661151725621L), null).create();     // Catch: Exception -> L204
        r2.show();     // Catch: Exception -> L204
        C1456gf.m2802T(r2, false);     // Catch: Exception -> L204
        r2.getButton(-1).setOnClickListener(new ViewOnClickListenerC1433g((TextView) r2.findViewById(R.id.message), r20, r2, r03, 4));     // Catch: Exception -> L204
    L19:
        return r17;
    L11:
        Iterator r22 = AbstractC1257cG.f4258a.entrySet().iterator();
    L13:
        if (r22.hasNext() == false) goto L19;
        if (((C1214bG) ((Map.Entry) r22.next()).getValue()).f4146a != null) goto L13;
        if (AbstractC1257cG.m2376d().getBoolean(AbstractC0295Gu.m625r(-597004749109301L), true) == false) goto L19;
        AlertDialog r04 = new AlertDialog.Builder(r03, R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-517079702698037L)).setMessage(AbstractC0295Gu.m625r(-517092587599925L)).setPositiveButton(AbstractC0295Gu.m625r(-517195666815029L), new DialogInterfaceOnClickListenerC0804So(2)).create();
        r04.show();
        C1456gf.m2802T(r04, false);
        goto L19
    L20:
        AbstractC0295Gu.m625r(-467013268928565L);
        C2428qs r05 = ((C1494hG) r25).f5263a;
        Object r23 = r05.f8521b;
        AbstractC0295Gu.m625r(-518192099227701L);
        ImageView r24 = (ImageView) r23;
        Object r06 = ((Object[]) r05.f8522c)[0];
        AbstractC0295Gu.m625r(-517908631386165L);
        int r07 = ((Integer) r06).intValue();
        if (r07 == 0) goto L34;
        Context r3 = MainApplication.f5549a;
        if (r3 != null) goto L30;
        r3 = C1456gf.f5172p;
        if (r3 != null) goto L30;
        r3 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L30:
        Resources r32 = r3.getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        String r08 = r32.getResourceName(r07);
        AbstractC0295Gu.m625r(-518114789816373L);
        String r09 = AbstractC2564tz.m5069d0(r08, AbstractC0295Gu.m625r(-518754739943477L));
        r24.setTag(io.github.cherrywechat.R.id.tag_we_img_name, r09);
        Iterator r33 = C1213bF.f4145b.iterator();
    L32:
        if (r33.hasNext() == false) goto L34;
        ((Function2) r33.next()).mo446d(r24, r09);
    L34:
        return r17;
    L35:
        AbstractC0295Gu.m625r(-467077693438005L);
        C2428qs r010 = ((C1494hG) r25).f5263a;
        Object r26 = r010.f8521b;
        AbstractC0295Gu.m625r(-467129233045557L);
        ImageView r27 = (ImageView) r26;
        AttributeSet r011 = (AttributeSet) ((Object[]) r010.f8522c)[1];
        if (r011 == null) goto L51;
        Context r34 = r27.getContext();
        AbstractC0295Gu.m625r(-466845765204021L);
        TypedArray r012 = r34.obtainStyledAttributes(r011, new int[]{R.attr.src}, 0, 0);
        int r35 = r012.getResourceId(0, 0);
        if (r35 == 0) goto L50;
        Context r4 = MainApplication.f5549a;
        if (r4 != null) goto L46;
        r4 = C1456gf.f5172p;
        if (r4 != null) goto L46;
        r4 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L46:
        Resources r42 = r4.getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        String r36 = r42.getResourceName(r35);
        AbstractC0295Gu.m625r(-466914484680757L);
        String r37 = AbstractC2564tz.m5069d0(r36, AbstractC0295Gu.m625r(-467004678993973L));
        r27.setTag(io.github.cherrywechat.R.id.tag_we_img_name, r37);
        Iterator r43 = C1213bF.f4145b.iterator();
    L48:
        if (r43.hasNext() == false) goto L50;
        ((Function2) r43.next()).mo446d(r27, r37);
    L50:
        r012.recycle();
    L51:
        return r17;
    L52:
        AbstractC0295Gu.m625r(-468104190621749L);
        C2428qs r013 = ((C1494hG) r25).f5263a;
        Object r28 = r013.f8521b;
        AbstractC0295Gu.m625r(-466506462787637L);
        ImageView r29 = (ImageView) r28;
        Object r014 = ((Object[]) r013.f8522c)[0];
        AbstractC0295Gu.m625r(-466222994946101L);
        int r015 = ((Integer) r014).intValue();
        if (r015 == 0) goto L66;
        Context r38 = MainApplication.f5549a;
        if (r38 != null) goto L62;
        r38 = C1456gf.f5172p;
        if (r38 != null) goto L62;
        r38 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L62:
        Resources r39 = r38.getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        String r016 = r39.getResourceName(r015);
        AbstractC0295Gu.m625r(-466429153376309L);
        String r017 = AbstractC2564tz.m5069d0(r016, AbstractC0295Gu.m625r(-467069103503413L));
        r29.setTag(io.github.cherrywechat.R.id.tag_we_img_name, r017);
        Iterator r310 = C1213bF.f4145b.iterator();
    L64:
        if (r310.hasNext() == false) goto L66;
        ((Function2) r310.next()).mo446d(r29, r017);
    L66:
        return r17;
    L67:
        AbstractC0295Gu.m625r(-468168615131189L);
        C2428qs r018 = ((C1494hG) r25).f5263a;
        Object r210 = r018.f8521b;
        AbstractC0295Gu.m625r(-468220154738741L);
        ImageView r211 = (ImageView) r210;
        AttributeSet r019 = (AttributeSet) ((Object[]) r018.f8522c)[1];
        if (r019 == null) goto L83;
        Context r311 = r211.getContext();
        AbstractC0295Gu.m625r(-467936686897205L);
        TypedArray r020 = r311.obtainStyledAttributes(r019, new int[]{R.attr.src}, 0, 0);
        int r312 = r020.getResourceId(0, 0);
        if (r312 == 0) goto L82;
        Context r44 = MainApplication.f5549a;
        if (r44 != null) goto L78;
        r44 = C1456gf.f5172p;
        if (r44 != null) goto L78;
        r44 = AndroidAppHelper.currentApplication();
        AbstractC0295Gu.m625r(-836852902787125L);
    L78:
        Resources r45 = r44.getResources();
        AbstractC0295Gu.m625r(-836955982002229L);
        String r313 = r45.getResourceName(r312);
        AbstractC0295Gu.m625r(-468005406373941L);
        String r314 = AbstractC2564tz.m5069d0(r313, AbstractC0295Gu.m625r(-468095600687157L));
        r211.setTag(io.github.cherrywechat.R.id.tag_we_img_name, r314);
        Iterator r46 = C1213bF.f4145b.iterator();
    L80:
        if (r46.hasNext() == false) goto L82;
        ((Function2) r46.next()).mo446d(r211, r314);
    L82:
        r020.recycle();
    L83:
        return r17;
    L84:
        C1494hG r021 = (C1494hG) r25;
        AbstractC0295Gu.m625r(-14946486188085L);
        if (C1133aF.f3583b.m2024e() == true) goto L207;
    L118:
        return r17;
    L207:
        SharedPreferences r212 = AbstractC0599Nx.f1939a;     // Catch: Exception -> L98
        int r213 = Integer.parseInt(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-15002320762933L), AbstractC0295Gu.m625r(-15092515076149L)));     // Catch: Exception -> L98
        if (r213 <= 0) goto L118;
        if (r213 > 60) goto L118;
        Object[] r022 = (Object[]) r021.f5263a.f8522c;     // Catch: Exception -> L98
        if (r022.length != 1) goto L94;
    L92:
        r152 = 0;
    L100:
        Object r023 = r022[r152];     // Catch: Exception -> L98
        C2648vx r315 = new C2648vx();     // Catch: Exception -> L98
        if ((r023 instanceof Class) == false) goto L103;
        r315.f9163b = (Class) r023;     // Catch: Exception -> L98
    L108:
        C1214bG r024 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-584257286174773L));     // Catch: Exception -> L98
        if (r024 == null) goto L111;
        Object r025 = r024.f4146a;     // Catch: Exception -> L98
    L113:
        if ((r025 instanceof String) == false) goto L115;
        r142 = (String) r025;     // Catch: Exception -> L98
    L115:
        r315.m5180c(r142);     // Catch: Exception -> L98
        r315.m5181d(Integer.valueOf(r213 * 1000));     // Catch: Exception -> L98
        goto L118
    L111:
        r025 = null;
        goto L113
    L103:
        r315.f9164c = r023;     // Catch: Exception -> L98
        if (r023 == null) goto L106;
        Class<?> r026 = r023.getClass();     // Catch: Exception -> L98
    L107:
        r315.f9163b = r026;     // Catch: Exception -> L98
        goto L108
    L106:
        r026 = null;
        goto L107
    L94:
        if (r022.length != 2) goto L92;
        if ((r022[0] instanceof String) == false) goto L92;
    L98:
        e = move-exception;
        e.printStackTrace();
        goto L118
    L119:
        AbstractC0295Gu.m625r(-464547957700661L);
        String r027 = ((C0185EC) r25).f549a;
        if (AbstractC0585Nj.m1134a(r027, AbstractC0295Gu.m625r(-464560842602549L)) == true) goto L126;
        if (AbstractC0585Nj.m1134a(r027, AbstractC0295Gu.m625r(-464620972144693L)) == true) goto L126;
        r153 = false;
    L126:
        return Boolean.valueOf(r153);
    L127:
        AbstractC0295Gu.m625r(-465011814168629L);
        String r028 = ((C0185EC) r25).f551c.toLowerCase(Locale.ROOT);
        AbstractC0295Gu.m625r(-465024699070517L);
        return r028;
    L129:
        AbstractC0295Gu.m625r(-464998929266741L);
        return Double.valueOf(((C0185EC) r25).f559k);
    L131:
        Class[] r029 = (Class[]) r25;
        if (r029.length == 3) goto L134;
    L136:
        r154 = false;
    L138:
        return Boolean.valueOf(r154);
    L134:
        if (AbstractC0585Nj.m1134a(r029[0], View.class) == false) goto L136;
    L139:
        AbstractC0295Gu.m625r(-168800804665397L);
        C2428qs r030 = ((C1494hG) r25).f5263a;
        Object r47 = r030.f8521b;
        AbstractC0295Gu.m625r(-168856639240245L);
        TextView r48 = (TextView) r47;
        if (r48 == null) goto L143;
        r6 = TextView.class.equals(r48.getTag(io.github.cherrywechat.R.id.tag_textview_color_ban));
    L143:
        if (r6 == false) goto L145;
        r030.m4864C(null);
    L145:
        return r17;
    L146:
        AbstractC0295Gu.m625r(-168482977085493L);
        C2428qs r031 = ((C1494hG) r25).f5263a;
        Object r49 = r031.f8521b;
        AbstractC0295Gu.m625r(-169088567474229L);
        TextView r410 = (TextView) r49;
        if (r410 == null) goto L150;
        r6 = TextView.class.equals(r410.getTag(io.github.cherrywechat.R.id.tag_textview_color_ban));
    L150:
        if (r6 == false) goto L152;
        r031.m4864C(null);
    L152:
        return r17;
    L153:
        C1494hG r032 = (C1494hG) r25;
        AbstractC0295Gu.m625r(-469233767020597L);
        r032.f5263a.m4864C(null);
        AbstractC1208bA.m2329b(new RunnableC0562N2(25, r032), 1000);
        return r17;
    L155:
        int r033 = ((Integer) r25).intValue();
        if (Modifier.isPublic(r033) == true) goto L158;
    L160:
        r155 = false;
    L162:
        return Boolean.valueOf(r155);
    L158:
        if (Modifier.isFinal(r033) == true) goto L160;
    L163:
        AbstractC0295Gu.m625r(-468658241402933L);
        return Boolean.valueOf(!((String) r25).startsWith(AbstractC0295Gu.m625r(-469220882118709L)));
    L165:
        AbstractC0295Gu.m625r(-468804270290997L);
        Object r034 = ((C1494hG) r25).f5263a.f8521b;
        AbstractC0295Gu.m625r(-468860104865845L);
        Activity r035 = (Activity) r034;
        FrameLayout r214 = (FrameLayout) r035.findViewById(R.id.content);
        HashMap r316 = AbstractC0999XA.f3193a;
        Drawable r317 = C1517hw.m2890b(AbstractC0295Gu.m625r(-468559457155125L));
        if (r317 == null) goto L173;
        ImageView r411 = new ImageView(r214.getContext());
        r411.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r411.setImageDrawable(r317);
        r411.setElevation(1.0f);
        r214.addView(r411, -1, -1);
        RunnableC1286a.m2511i(r035).m2514d();
        if (Build.VERSION.SDK_INT < 30) goto L172;
        WindowInsetsController r036 = AbstractC0360IF.m799b(r035.getWindow());
        if (r036 == null) goto L173;
        AbstractC0773S.m1593x(r036, AbstractC0773S.m1590u());
        AbstractC0773S.m1593x(r036, AbstractC0773S.m1594y());
        goto L173
    L172:
        r035.getWindow().setFlags(67108864, 67108864);
        r035.getWindow().setFlags(134217728, 134217728);
    L173:
        return r17;
    L174:
        C1494hG r037 = (C1494hG) r25;
        AbstractC0295Gu.m625r(-17188459116597L);
        if (C1343dy.f4836b.m2024e() == false) goto L177;
        r037.f5263a.m4864C(Boolean.TRUE);
    L177:
        return r17;
    L178:
        AbstractC0295Gu.m625r(-90864328112181L);
        Object[] r038 = (Object[]) ((C1494hG) r25).f5263a.f8522c;
        Object r215 = r038[0];
        Object r039 = r038[1];
        AbstractC0295Gu.m625r(-90915867719733L);
        Integer r040 = (Integer) r039;
        r040.getClass();
        C1538iG r318 = new C1538iG(r215);
        r318.m2924i(View.class);
        r318.m2922g(new Object[]{Integer.TYPE});
        ViewGroup r041 = (ViewGroup) r318.m2918c(r215, new Object[]{r040});
        C0183EA.f539a.getClass();
        if (C0183EA.m373a().equals(AbstractC0295Gu.m625r(-89472758708277L)) == true) goto L182;
        C1456gf.m2805o(r041);
    L182:
        if (r041.findViewById(R.id.title) != null) goto L184;
        View r216 = AbstractC0295Gu.m618k(r041, 0);
        Context r319 = r041.getContext();
        AbstractC0295Gu.m625r(-89481348642869L);
        View r320 = AbstractC0585Nj.m1141i(r319);
        RelativeLayout.LayoutParams r412 = new RelativeLayout.LayoutParams(-1, -2);
        r412.addRule(3, r216.getId());
        r041.addView(r320, r412);
    L184:
        return r17;
    L185:
        AbstractC0295Gu.m625r(-91044716738613L);
        Object r042 = ((C1494hG) r25).f5263a.f8521b;
        AbstractC0295Gu.m625r(-91096256346165L);
        ListView r043 = (ListView) ((Activity) r042).findViewById(R.id.list);
        Context r217 = r043.getContext();
        AbstractC0295Gu.m625r(-90795608635445L);
        r043.addHeaderView(AbstractC0585Nj.m1141i(r217));
        return r17;
    L187:
        AbstractC0295Gu.m625r(-519755467323445L);
        Object r044 = ((Object[]) ((C1494hG) r25).f5263a.f8522c)[0];
        C2648vx r218 = new C2648vx();
        if ((r044 instanceof Class) == false) goto L190;
        r218.f9163b = (Class) r044;
    L194:
        C1456gf.m2806q((ViewGroup) AbstractC0213Ey.m404b(-500565553444917L, r218));
        return r17;
    L190:
        r218.f9164c = r044;
        if (r044 == null) goto L193;
        r14 = r044.getClass();
    L193:
        r218.f9163b = r14;
        goto L194
    L196:
        Class[] r045 = (Class[]) r25;
        AbstractC0295Gu.m625r(-519729697519669L);
        if (r045.length == 6) goto L199;
    L201:
        r15 = false;
    L203:
        return Boolean.valueOf(r15);
    L199:
        if (AbstractC0585Nj.m1134a(r045[5], List.class) == false) goto L201;
        goto L201
    }
}
