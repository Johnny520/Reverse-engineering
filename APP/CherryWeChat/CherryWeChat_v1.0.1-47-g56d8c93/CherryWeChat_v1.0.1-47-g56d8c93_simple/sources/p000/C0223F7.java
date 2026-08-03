package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: F7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0223F7 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f657a;

    public /* synthetic */ C0223F7(int r1) {
        this.f657a = r1;
    }

    /* JADX INFO: renamed from: c */
    private final Object m438c(Object r3) {
        AbstractC0295Gu.m625r(-494947736221749L);
        return ((EnumC0319Hb) r3).name();
    }

    /* JADX INFO: renamed from: e */
    private final Object m439e(Object r4) {
        Class[] r42 = (Class[]) r4;
        AbstractC0295Gu.m625r(-21500606281781L);
        boolean r2 = false;
        if (r42.length != 3) goto L10;
        if (AbstractC0585Nj.m1134a(r42[0], String.class) == false) goto L10;
        if (AbstractC0585Nj.m1134a(r42[2], Integer.TYPE) == false) goto L10;
        r2 = true;
    L10:
        return Boolean.valueOf(r2);
    }

    /* JADX INFO: renamed from: f */
    private final Object m440f(Object r7) {
        C1494hG r72 = (C1494hG) r7;
        AbstractC0295Gu.m625r(-21513491183669L);
        if (C0577Nb.f1872b.m2024e() == false) goto L31;
        Object r0 = ((Object[]) r72.f5263a.f8522c)[0];     // Catch: Exception -> L32
        if ((r0 instanceof String) == false) goto L8;
        String r02 = (String) r0;     // Catch: Exception -> L32
    L9:
        if (r02 == null) goto L31;
        if (r02.startsWith(AbstractC0295Gu.m625r(-21569325758517L)) == true) goto L16;
        if (r02.startsWith(AbstractC0295Gu.m625r(-20551418509365L)) == false) goto L31;
    L16:
        if (C0577Nb.f1873c != EnumC0319Hb.f1048c) goto L19;
        ((Object[]) r72.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(r02, AbstractC0295Gu.m625r(-19378892437557L), AbstractC0295Gu.m625r(-17888538785845L));     // Catch: Exception -> L32
        goto L31
    L19:
        if (C0577Nb.f1873c != EnumC0319Hb.f1049d) goto L22;
        ((Object[]) r72.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(r02, AbstractC0295Gu.m625r(-17721035061301L), AbstractC0295Gu.m625r(-18429704665141L));     // Catch: Exception -> L32
        goto L31
    L22:
        if (C0577Nb.f1873c != EnumC0319Hb.f1050e) goto L25;
        ((Object[]) r72.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(AbstractC0085Bz.m133K(r02, AbstractC0295Gu.m625r(-18184891529269L), AbstractC0295Gu.m625r(-18373870090293L)), AbstractC0295Gu.m625r(-18378165057589L), C0577Nb.m1119g(false));     // Catch: Exception -> L32
        goto L31
    L25:
        if (C0577Nb.f1873c != EnumC0319Hb.f1051f) goto L28;
        ((Object[]) r72.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(r02, AbstractC0295Gu.m625r(-34479997450293L), AbstractC0295Gu.m625r(-34089155426357L) + C0577Nb.m1119g(false));     // Catch: Exception -> L32
        goto L31
    L28:
        if (C0577Nb.f1873c != EnumC0319Hb.f1052g) goto L31;
        ((Object[]) r72.f5263a.f8522c)[0] = AbstractC0085Bz.m133K(AbstractC0085Bz.m133K(r02, AbstractC0295Gu.m625r(-34286723921973L), AbstractC0295Gu.m625r(-35025458296885L)), AbstractC0295Gu.m625r(-35029753264181L), C0577Nb.m1119g(true));     // Catch: Exception -> L32
        goto L31
    L8:
        r02 = null;
    L31:
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m441h(Object r4) {
        AbstractC0295Gu.m625r(-34638911240245L);
        return AbstractC0295Gu.m625r(-34668976011317L) + ((String) r4) + '\'';
    }

    /* JADX INFO: renamed from: i */
    private final Object m442i(Object r4) {
        AbstractC0295Gu.m625r(-34789235095605L);
        return AbstractC0295Gu.m625r(-34819299866677L) + ((String) r4) + '\'';
    }

    /* JADX INFO: renamed from: j */
    private final Object m443j(Object r9) {
        AbstractC0295Gu.m625r(-53992033876021L);
        C2428qs r92 = ((C1494hG) r9).f5263a;
        Field[] r0 = r92.f8521b.getClass().getFields();
        AbstractC0295Gu.m625r(-54043573483573L);
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L15;
        Field r3 = r0[r2];
        if (AbstractC0585Nj.m1134a(r3.getType(), View.class) == false) goto L13;
        Object r32 = r3.get(r92.f8521b);
        AbstractC0295Gu.m625r(-54107997993013L);
        View r33 = (View) r32;
        if (r33.getClass().equals(View.class) == false) goto L13;
        ViewGroup.LayoutParams r4 = r33.getLayoutParams();
        if ((r4 instanceof FrameLayout.LayoutParams) == false) goto L13;
        if (((FrameLayout.LayoutParams) r4).width != (-1)) goto L13;
        r33.setBackground(null);
        r33.setTag(R.id.tag_view_bg_ban, Object.class);
    L13:
        r2 = r2 + 1;
        goto L3
    L15:
        return C0829TC.f2620a;
    }

    /* JADX WARN: Type inference failed for: r3v95, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r24) {
        int r1 = this.f657a;
        int r4 = 3;
        int r5 = 2;
        int r6 = 8;
        Class<?> r10 = null;
        ViewParent r102 = null;
        String r103 = null;
        int r11 = 1;
        C0829TC r13 = C0829TC.f2620a;
        switch(r1) {
            case 0: goto L278;
            case 1: goto L256;
            case 2: goto L254;
            case 3: goto L250;
            case 4: goto L244;
            case 5: goto L223;
            case 6: goto L189;
            case 7: goto L145;
            case 8: goto L118;
            case 9: goto L116;
            case 10: goto L112;
            case 11: goto L104;
            case 12: goto L98;
            case 13: goto L90;
            case 14: goto L84;
            case 15: goto L83;
            case 16: goto L81;
            case 17: goto L49;
            case 18: goto L47;
            case 19: goto L45;
            case 20: goto L32;
            case 21: goto L28;
            case 22: goto L21;
            case 23: goto L20;
            case 24: goto L18;
            case 25: goto L16;
            case 26: goto L14;
            case 27: goto L12;
            case 28: goto L10;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-67761699026997L);
        Object r12 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-67890548045877L);
        View r14 = ((ViewGroup) r12).getChildAt(0);
        AbstractC0295Gu.m625r(-66498978641973L);
        ViewGroup r15 = (ViewGroup) r14;
        Context r3 = r15.getContext();
        AbstractC0295Gu.m625r(-66206920865845L);
        AbstractC0295Gu.m625r(-494385095505973L);
        C2684wq r2 = new C2684wq(r3);
        HashMap r32 = AbstractC0999XA.f3193a;
        Drawable r33 = C1517hw.m2890b(AbstractC0295Gu.m625r(-66825396156469L));
        if (r33 != null) goto L7;
        r33 = C1517hw.m2890b(AbstractC0295Gu.m625r(-66971425044533L));
    L7:
        r2.setImageDrawable(r33);
        r2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r2.setMaskColor(C1517hw.m2889a(1426063360, AbstractC0295Gu.m625r(-67061619357749L)));
        r15.addView(r2, 0, new ViewGroup.LayoutParams(-1, -1));
        return r13;
    L21:
        AbstractC0295Gu.m625r(-59919088744501L);
        Object r16 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-59498181949493L);
        ViewGroup r17 = (ViewGroup) r16;
        C1456gf.m2805o(r17);
        ViewParent r22 = C1456gf.m2810v(r17, AbstractC0295Gu.m625r(-60305635801141L)).getParent();
        AbstractC0295Gu.m625r(-60451664689205L);
        View r23 = ((ViewGroup) r22).getChildAt(1);
        AbstractC0295Gu.m625r(-60159606913077L);
        View r25 = ((ViewGroup) r23).getChildAt(0);
        AbstractC0295Gu.m625r(-58768037509173L);
        TextView r26 = (TextView) r25;
        HashMap r34 = AbstractC0999XA.f3193a;
        int r35 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-58480274700341L));
        if (r35 == 0) goto L24;
        r26.setTextColor(r35);
    L24:
        Drawable r27 = C1517hw.m2890b(AbstractC0295Gu.m625r(-59154584565813L));
        if (r27 == null) goto L27;
        View r18 = C1456gf.m2810v(r17, AbstractC0295Gu.m625r(-59339268159541L));
        String r36 = AbstractC0295Gu.m625r(-58935541233717L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r19 = XposedHelpers.callMethod(r18, r36, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-58999965743157L);
        ((ImageView) r19).setImageDrawable(r27);
    L27:
        return r13;
    L28:
        AbstractC0295Gu.m625r(-60941290960949L);
        Object r110 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-60520384165941L);
        ViewGroup r111 = (ViewGroup) r110;
        C1456gf.m2805o(r111);
        ViewParent r112 = C1456gf.m2810v(r111, AbstractC0295Gu.m625r(-61327838017589L)).getParent();
        AbstractC0295Gu.m625r(-61473866905653L);
        View r113 = ((ViewGroup) r112).getChildAt(1);
        AbstractC0295Gu.m625r(-61181809129525L);
        TextView r114 = (TextView) r113;
        HashMap r28 = AbstractC0999XA.f3193a;
        int r29 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-59794534692917L));
        if (r29 == 0) goto L31;
        r114.setTextColor(r29);
    L31:
        return r13;
    L32:
        AbstractC0295Gu.m625r(-9169755174965L);
        Object r115 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-9221294782517L);
        ViewGroup r116 = (ViewGroup) r115;
        C1456gf.m2805o(r116);
        ArrayList<View> r210 = new ArrayList();
        Iterator r37 = Collections.singletonList(AbstractC0295Gu.m625r(-8929237006389L)).iterator();
    L34:
        if (r37.hasNext() == false) goto L37;
        r116.findViewsWithText(r210, (String) r37.next(), 1);
        goto L34
    L37:
        if (r210.isEmpty() == true) goto L44;
        View r211 = r210.get(0);
        AbstractC0295Gu.m625r(-8950711842869L);
        TextView r212 = (TextView) r211;
        HashMap r38 = AbstractC0999XA.f3193a;
        int r39 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-9762460661813L));
        if (r39 == 0) goto L41;
        r212.setTextColor(r39);
    L41:
        Drawable r213 = C1517hw.m2890b((String) AbstractC0457Kk.f1500a.get(r212.getText()));
        if (r213 == null) goto L44;
        View r117 = C1456gf.m2810v(r116, AbstractC0295Gu.m625r(-9887014713397L));
        String r310 = AbstractC0295Gu.m625r(-9483287787573L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r118 = XposedHelpers.callMethod(r117, r310, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-9547712297013L);
        ((ImageView) r118).setImageDrawable(r213);
    L44:
        return r13;
    L45:
        AbstractC0295Gu.m625r(-10737418238005L);
        Object r119 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-10866267256885L);
        ViewGroup r120 = (ViewGroup) r119;
        C1456gf.m2805o(r120);
        HashMap r214 = AbstractC0999XA.f3193a;
        C1456gf.m2795M(r120, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-10574209480757L)), C1517hw.m2889a(0, AbstractC0295Gu.m625r(-10698763532341L)), false);
        return r13;
    L47:
        AbstractC0295Gu.m625r(-10183367456821L);
        Object r121 = ((Object[]) ((C1494hG) r24).f5263a.f8522c)[1];
        AbstractC0295Gu.m625r(-10234907064373L);
        ViewGroup r122 = (ViewGroup) r121;
        C1456gf.m2805o(r122);
        C1456gf.m2806q(r122);
        HashMap r215 = AbstractC0999XA.f3193a;
        C1456gf.m2795M(r122, C1517hw.m2889a(0, AbstractC0295Gu.m625r(-9942849288245L)), C1517hw.m2889a(0, AbstractC0295Gu.m625r(-10067403339829L)), false);
        return r13;
    L49:
        AbstractC0295Gu.m625r(-12257836660789L);
        Object r123 = ((C1494hG) r24).f5263a.f8521b;
        C2648vx r216 = new C2648vx();
        if ((r123 instanceof Class) == false) goto L52;
        r216.f9163b = (Class) r123;
    L57:
        r216.m5182e(AbstractC0295Gu.m625r(-12309376268341L));
        View r124 = (View) r216.m5178a();
        if (r124 == null) goto L60;
        r102 = r124.getParent();
    L60:
        AbstractC0295Gu.m625r(-13069585479733L);
        LinearLayout r104 = (LinearLayout) r102;
        int r125 = r104.getChildCount();
        int r217 = 0;
    L61:
        if (r217 >= r125) goto L79;
        View r311 = r104.getChildAt(r217);
        AbstractC0295Gu.m625r(-12799002540085L);
        ViewGroup r312 = (ViewGroup) r311;
        if ((r312 instanceof LinearLayout) == false) goto L65;
        r312.postDelayed(new RunnableC0562N2(r6, (LinearLayout) r312), 150);
    L66:
        ArrayList<View> r42 = new ArrayList();
        Iterator r52 = AbstractC2496sa.m4977b0(new String[]{AbstractC0295Gu.m625r(-11407433136181L), AbstractC0295Gu.m625r(-11428907972661L), AbstractC0295Gu.m625r(-11458972743733L), AbstractC0295Gu.m625r(-11471857645621L), AbstractC0295Gu.m625r(-11484742547509L), AbstractC0295Gu.m625r(-11501922416693L)}).iterator();
    L68:
        if (r52.hasNext() == false) goto L71;
        r312.findViewsWithText(r42, (String) r52.next(), 1);
        goto L68
    L71:
        if (r42.isEmpty() == true) goto L78;
        View r43 = r42.get(0);
        AbstractC0295Gu.m625r(-11519102285877L);
        TextView r44 = (TextView) r43;
        HashMap r53 = AbstractC0999XA.f3193a;
        int r54 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-11231339477045L));
        if (r54 == 0) goto L75;
        r44.setTextColor(r54);
    L75:
        Drawable r45 = C1517hw.m2890b((String) AbstractC0457Kk.f1500a.get(r44.getText()));
        if (r45 == null) goto L78;
        View r313 = C1456gf.m2810v(r312, AbstractC0295Gu.m625r(-11905649342517L));
        String r55 = AbstractC0295Gu.m625r(-12051678230581L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r314 = XposedHelpers.callMethod(r313, r55, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-11566346926133L);
        ((ImageView) r314).setImageDrawable(r45);
    L78:
        r217 = r217 + 1;
        goto L61
    L65:
        C1456gf.m2805o(r312);
        goto L66
    L79:
        return r13;
    L52:
        r216.f9164c = r123;
        if (r123 == null) goto L55;
        Class<?> r126 = r123.getClass();
    L56:
        r216.f9163b = r126;
        goto L57
    L55:
        r126 = null;
        goto L56
    L84:
        int r127 = ((Integer) r24).intValue();
        C1442g8 r218 = C1442g8.f5046b;
        r218.getClass();
        if (r127 != 1) goto L87;
        C1442g8.m2761o();
    L88:
        r218.getClass();
        C1442g8.m2760n();
        return r13;
    L87:
        SharedPreferences r128 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-262783279036469L), false);
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-262328012503093L), AbstractC0295Gu.m625r(-262426796750901L));
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-262431091718197L), AbstractC0295Gu.m625r(-260893493426229L));
        goto L88
    L90:
        C1494hG r129 = (C1494hG) r24;
        AbstractC0295Gu.m625r(-257509059196981L);
        if (C1442g8.f5046b.m2762j() == false) goto L97;
        Object r130 = r129.f5263a.f8521b;
        AbstractC0295Gu.m625r(-258187664029749L);
        View r131 = (View) r130;
        C0693Q4 r219 = new C0693Q4(1, r131);
        if (r131.isAttachedToWindow() == false) goto L96;
        r131.post(new RunnableC1398f8(r219, 0));
        goto L97
    L96:
        r131.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0995X6(r11, r219));
    L97:
        return r13;
    L98:
        AbstractC0295Gu.m625r(-248463858071605L);
        C2428qs r132 = ((C1494hG) r24).f5263a;
        if (C0781S7.f2467b.m2024e() == false) goto L103;
        Object r220 = ((Object[]) r132.f8522c)[0];
        AbstractC0295Gu.m625r(-247965641865269L);
        if (AbstractC0295Gu.m625r(-248184685197365L).equals((String) r220) == false) goto L103;
        AbstractC0295Gu.m625r(-246664266774581L);
        Objects.toString(((XC_MethodHook.MethodHookParam) r132.f8523d).getResult());
        r132.m4864C(1);
    L103:
        return r13;
    L104:
        C1494hG r133 = (C1494hG) r24;
        AbstractC0295Gu.m625r(-247604864612405L);
        if (C0781S7.f2467b.m2024e() == false) goto L111;
        C2428qs r134 = r133.f5263a;
        Object r221 = ((Object[]) r134.f8522c)[0];
        if ((r221 instanceof String) == false) goto L109;
        r103 = (String) r221;
    L109:
        if (r103 == null) goto L111;
        Object r135 = r134.f8521b;
        AbstractC0295Gu.m625r(-247656404219957L);
        ((ViewGroup) r135).setTag(R.id.tag_chat_foot_userName, r103);
    L111:
        return r13;
    L112:
        C1494hG r136 = (C1494hG) r24;
        AbstractC0295Gu.m625r(-249348621334581L);
        if (C0781S7.f2467b.m2024e() == false) goto L115;
        Object r137 = ((Object[]) r136.f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-249400160942133L);
        ViewGroup r138 = (ViewGroup) r137;
        Context r222 = r138.getContext();
        AbstractC0295Gu.m625r(-249108103166005L);
        View r315 = C1456gf.m2810v(r138, AbstractC0295Gu.m625r(-247707943827509L));
        AbstractC0295Gu.m625r(-247896922388533L);
        ViewGroup r316 = (ViewGroup) r315;
        r316.postDelayed(new RunnableC2788z7(r316, (Activity) r222, r138, r11), 200);
    L115:
        return r13;
    L116:
        AbstractC0295Gu.m625r(-189451007424565L);
        Object r139 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-189579856443445L);
        ViewGroup r140 = (ViewGroup) r139;
        r140.postDelayed(new RunnableC2745y7(r140, r5), 100);
        return r13;
    L118:
        AbstractC0295Gu.m625r(-176583285405749L);
        Object r141 = ((C1494hG) r24).f5263a.f8521b;
        C2648vx r317 = new C2648vx();
        if ((r141 instanceof Class) == false) goto L121;
        r317.f9163b = (Class) r141;
    L125:
        r317.f9165d = TextView.class;
        TextView r142 = (TextView) r317.m5178a();
        if (r142 == null) goto L144;
        HashMap r318 = AbstractC0999XA.f3193a;
        int r319 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-176634825013301L));
        if (r319 == 0) goto L131;
        r142.setTextColor(r319);
    L131:
        ViewParent r143 = r142.getParent();
        AbstractC0295Gu.m625r(-192693707733045L);
        ViewGroup r144 = (ViewGroup) r143;
        Drawable r320 = C1517hw.m2890b(AbstractC0295Gu.m625r(-192951405770805L));
        if (r320 == null) goto L134;
        r144.setBackground(r320);
    L134:
        View r145 = AbstractC0295Gu.m618k(r144, 0);
        AbstractC0295Gu.m625r(-192539088910389L);
        ImageView r146 = (ImageView) r145;
        Drawable r321 = C1517hw.m2890b(AbstractC0295Gu.m625r(-193355132696629L));
        if (r321 != null) goto L137;
    L139:
        Drawable r322 = C1517hw.m2890b(AbstractC0295Gu.m625r(-193071664855093L));
        if (r322 == null) goto L144;
        if (r146.getRotation() != 180.0f) goto L144;
        String r46 = AbstractC0295Gu.m625r(-191607081007157L);
        Object[] r56 = {Boolean.FALSE};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r146, r46, Arrays.copyOf(r56, 1));
        r146.setImageDrawable(r322);
        ViewGroup.LayoutParams r147 = r146.getLayoutParams();
        r147.width = AbstractC0295Gu.m616i(20);
        r147.height = AbstractC0295Gu.m616i(20);
        goto L144
    L137:
        if (r146.getRotation() != 0.0f) goto L139;
        String r47 = AbstractC0295Gu.m625r(-192981470541877L);
        Object[] r57 = {Boolean.FALSE};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r146, r47, Arrays.copyOf(r57, 1));
        r146.setImageDrawable(r321);
        ViewGroup.LayoutParams r148 = r146.getLayoutParams();
        r148.width = AbstractC0295Gu.m616i(20);
        r148.height = AbstractC0295Gu.m616i(20);
    L144:
        return r13;
    L121:
        r317.f9164c = r141;
        if (r141 == null) goto L124;
        r10 = r141.getClass();
    L124:
        r317.f9163b = r10;
        goto L125
    L145:
        AbstractC0295Gu.m625r(-253308581181493L);
        C2428qs r149 = ((C1494hG) r24).f5263a;
        Object[] r223 = (Object[]) r149.f8522c;
        Object r150 = r149.f8521b;
        Object r58 = r223[0];
        Object r224 = r223[1];
        AbstractC0295Gu.m625r(-253360120789045L);
        Integer r225 = (Integer) r224;
        int r7 = r225.intValue();
        C2648vx r1410 = new C2648vx();
        if ((r58 instanceof Class) == false) goto L148;
        r1410.f9163b = (Class) r58;
    L153:
        r1410.f9165d = View.class;
        Object r323 = ((View) r1410.m5178a()).getTag();
        C1538iG r59 = new C1538iG(r150);
        r59.m2921f(AbstractC0295Gu.m625r(-253016523405365L));
        Object r226 = r59.m2918c(null, new Object[]{r225});
        String r510 = AbstractC0295Gu.m625r(-253050883143733L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r511 = XposedHelpers.callMethod(r226, r510, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-253111012685877L);
        long r1411 = ((Long) r511).longValue();
        C2648vx r512 = new C2648vx();
        if ((r323 instanceof Class) == false) goto L156;
        r512.f9163b = (Class) r323;
    L161:
        View r513 = (ImageView) AbstractC0213Ey.m404b(-253871221897269L, r512);
        if (r513 == null) goto L188;
        ViewParent r8 = r513.getParent();
        AbstractC0295Gu.m625r(-253909876602933L);
        ViewGroup r82 = (ViewGroup) r8;
        ViewParent r9 = r82.getParent();
        AbstractC0295Gu.m625r(-253617818826805L);
        ViewGroup r92 = (ViewGroup) r9;
        TextView r62 = (TextView) r92.findViewWithTag(AbstractC0295Gu.m625r(-252226249422901L));
        if (r62 != null) goto L176;
        r62 = new TextView(r513.getContext());
        r62.setTag(AbstractC0295Gu.m625r(-252277789030453L));
        r62.setGravity(1);
        SimpleDateFormat r105 = C0524M7.f1713c;
        if (r105 != null) goto L169;
        AbstractC0295Gu.m625r(-252329328638005L);
        r105 = null;
    L169:
        r62.setText(r105.format(new Date(r1411)));
        HashMap r106 = AbstractC0999XA.f3193a;
        r62.setTextColor(C1517hw.m2889a(-16777216, AbstractC0295Gu.m625r(-251822522497077L)));
        r62.setTextSize(10.0f);
        if ((r92 instanceof RelativeLayout) == false) goto L175;
        String r107 = AbstractC0295Gu.m625r(-251934191646773L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r227 = XposedHelpers.callMethod(r226, r107, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-251968551385141L);
        if (((Integer) r227).intValue() != 43) goto L174;
        int r228 = r82.indexOfChild(r513);
        ViewGroup.LayoutParams r93 = r513.getLayoutParams();
        r82.removeView(r513);
        int r21 = 0;
        RelativeLayout r108 = new RelativeLayout(r513.getContext());
        r108.addView(r513, r93.width, r93.height);
        RelativeLayout.LayoutParams r94 = new RelativeLayout.LayoutParams(-2, -2);
        r94.addRule(3, r513.getId());
        r94.addRule(7, r513.getId());
        r94.addRule(5, r513.getId());
        r108.addView(r62, r94);
        r82.addView(r108, r228, new ViewGroup.LayoutParams(-2, -2));
    L182:
        if (C0395J7.f1333b.m2024e() == false) goto L188;
        if (C0395J7.m832f(new C0089C2(1, r323), r150, r7) == false) goto L186;
        int r151 = r21;
    L187:
        r62.setVisibility(r151);
        goto L188
    L186:
        r151 = 8;
        goto L187
    L174:
        r21 = 0;
        RelativeLayout.LayoutParams r229 = new RelativeLayout.LayoutParams(-2, -2);
        r229.addRule(3, r82.getId());
        r229.addRule(7, r82.getId());
        r229.addRule(5, r82.getId());
        r92.addView(r62, r229);
        goto L182
    L175:
        r21 = 0;
        int r230 = r92.indexOfChild(r82);
        ViewGroup.LayoutParams r48 = r82.getLayoutParams();
        r92.removeView(r82);
        LinearLayout r109 = new LinearLayout(r513.getContext());
        r109.setOrientation(1);
        r109.addView(r82, r48.width, r48.height);
        LinearLayout.LayoutParams r83 = new LinearLayout.LayoutParams(r48.width, -2);
        r83.gravity = 1;
        r109.addView(r62, r83);
        r92.addView(r109, r230, new ViewGroup.LayoutParams(-2, -2));
        goto L182
    L176:
        r21 = 0;
        SimpleDateFormat r231 = C0524M7.f1713c;
        if (r231 != null) goto L179;
        AbstractC0295Gu.m625r(-252724465629237L);
        SimpleDateFormat r1010 = null;
    L180:
        r62.setText(r1010.format(new Date(r1411)));
        goto L182
    L179:
        r1010 = r231;
    L188:
        return r13;
    L156:
        r512.f9164c = r323;
        if (r323 == null) goto L159;
        Class<?> r84 = r323.getClass();
    L160:
        r512.f9163b = r84;
        goto L161
    L159:
        r84 = null;
        goto L160
    L148:
        r1410.f9164c = r58;
        if (r58 == null) goto L151;
        Class<?> r514 = r58.getClass();
    L152:
        r1410.f9163b = r514;
        goto L153
    L151:
        r514 = null;
        goto L152
    L189:
        AbstractC0295Gu.m625r(-273404733159477L);
        C2428qs r152 = ((C1494hG) r24).f5263a;
        Object[] r232 = (Object[]) r152.f8522c;     // Catch: Throwable -> L304
        Object r153 = r152.f8521b;     // Catch: Throwable -> L304
        Object r49 = r232[0];     // Catch: Throwable -> L304
        Object r233 = r232[1];     // Catch: Throwable -> L304
        AbstractC0295Gu.m625r(-273456272767029L);     // Catch: Throwable -> L304
        Integer r234 = (Integer) r233;     // Catch: Throwable -> L304
        int r515 = r234.intValue();     // Catch: Throwable -> L304
        C2648vx r63 = new C2648vx();     // Catch: Throwable -> L304
        if ((r49 instanceof Class) == false) goto L193;
        r63.f9163b = (Class) r49;     // Catch: Throwable -> L304
    L198:
        r63.f9165d = View.class;     // Catch: Throwable -> L304
        View r324 = (View) r63.m5178a();     // Catch: Throwable -> L304
        if (r324 == null) goto L222;
        Object r325 = r324.getTag();     // Catch: Throwable -> L304
        if (r325 == null) goto L222;
        C0089C2 r410 = new C0089C2(1, r325);     // Catch: Throwable -> L304
        ImageView r326 = (ImageView) r410.f196b;     // Catch: Throwable -> L304
        if (r326 == null) goto L222;
        if (C0395J7.f1333b.m2024e() == true) goto L210;
        r326.setVisibility(0);     // Catch: Throwable -> L304
        goto L222
    L210:
        if (C0395J7.m832f(r410, r153, r515) == false) goto L219;
        r326.setVisibility(0);     // Catch: Throwable -> L304
        TextView r327 = (TextView) r410.f201g;     // Catch: Throwable -> L304
        if (r327 == null) goto L222;
        C1538iG r411 = new C1538iG(r153);     // Catch: Throwable -> L304
        r411.m2921f(AbstractC0295Gu.m625r(-254420977711157L));     // Catch: Throwable -> L304
        Object r154 = r411.m2918c(null, new Object[]{r234});     // Catch: Throwable -> L304
        AbstractC0295Gu.m625r(-165558104356917L);     // Catch: Throwable -> L304
        String r235 = AbstractC0295Gu.m625r(-165579579193397L);     // Catch: Throwable -> L304
        AbstractC0295Gu.m625r(-578325936338997L);     // Catch: Throwable -> L304
        Object r236 = XposedHelpers.callMethod(r154, r235, Arrays.copyOf(new Object[0], 0));     // Catch: Throwable -> L304
        AbstractC0295Gu.m625r(-165639708735541L);     // Catch: Throwable -> L304
        Long r237 = (Long) r236;     // Catch: Throwable -> L304
        String r238 = AbstractC0295Gu.m625r(-164200894691381L);     // Catch: Throwable -> L304
        AbstractC0295Gu.m625r(-578325936338997L);     // Catch: Throwable -> L304
        Object r239 = XposedHelpers.callMethod(r154, r238, Arrays.copyOf(new Object[0], 0));     // Catch: Throwable -> L304
        AbstractC0295Gu.m625r(-164235254429749L);     // Catch: Throwable -> L304
        Integer r240 = (Integer) r239;     // Catch: Throwable -> L304
        C2648vx r241 = AbstractC1406fG.m2685J(r154);     // Catch: Throwable -> L304
        r241.m5180c(AbstractC0295Gu.m625r(-163891657046069L));     // Catch: Throwable -> L304
        String r242 = (String) r241.m5178a();     // Catch: Throwable -> L304
        C2648vx r243 = AbstractC1406fG.m2685J(r154);     // Catch: Throwable -> L304
        r243.m5180c(AbstractC0295Gu.m625r(-163951786588213L));     // Catch: Throwable -> L304
        String r244 = (String) r243.m5178a();     // Catch: Throwable -> L304
        C2648vx r412 = AbstractC1406fG.m2685J(r154);     // Catch: Throwable -> L304
        r412.m5180c(AbstractC0295Gu.m625r(-164007621163061L));     // Catch: Throwable -> L304
        Long r413 = (Long) r412.m5178a();     // Catch: Throwable -> L304
        C2648vx r155 = AbstractC1406fG.m2685J(r154);     // Catch: Throwable -> L304
        r155.m5180c(AbstractC0295Gu.m625r(-164059160770613L));     // Catch: Throwable -> L304
        Integer r156 = (Integer) r155.m5178a();     // Catch: Throwable -> L304
        if (r244 == null) goto L222;
        if (AbstractC2564tz.m5051L(r244, AbstractC0295Gu.m625r(-254455337449525L), false) == false) goto L218;
        r327.setVisibility(0);     // Catch: Throwable -> L304
        goto L222
    L218:
        r327.setVisibility(8);     // Catch: Throwable -> L304
        goto L222
    L219:
        r326.setVisibility(4);     // Catch: Throwable -> L304
        TextView r157 = (TextView) r410.f201g;     // Catch: Throwable -> L304
        if (r157 == null) goto L222;
        r157.setVisibility(8);     // Catch: Throwable -> L304
        goto L222
    L193:
        r63.f9164c = r49;     // Catch: Throwable -> L304
        if (r49 == null) goto L196;
        Class<?> r414 = r49.getClass();     // Catch: Throwable -> L304
    L197:
        r63.f9163b = r414;     // Catch: Throwable -> L304
        goto L198
    L196:
        r414 = null;
    L222:
        return r13;
    L223:
        AbstractC0295Gu.m625r(-177437983897653L);
        Object r158 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-177489523505205L);
        Activity r159 = (Activity) r158;
        C2648vx r245 = new C2648vx();
        r245.f9164c = r159;
        if (r159 == null) goto L226;
        Class<?> r1011 = r159.getClass();
    L227:
        r245.f9163b = r1011;
        r245.f9165d = ViewGroup.class;
        ViewGroup r246 = (ViewGroup) r245.m5178a();
        HashMap r328 = AbstractC0999XA.f3193a;
        Drawable r329 = C1517hw.m2890b(AbstractC0295Gu.m625r(-177188875794485L));
        if (r329 == null) goto L243;
        r159.getIntent().putExtra(AbstractC0295Gu.m625r(-177897545398325L), true);
        ViewGroup r160 = AbstractC0714Qj.m1493o(r246);
        if (r160 == null) goto L232;
        r160.setBackground(r329);
        r160.getChildAt(1).setAlpha(0.0f);
    L232:
        Drawable r161 = C1517hw.m2890b(AbstractC0295Gu.m625r(-177919020234805L));
        if (r161 == null) goto L240;
        View r330 = AbstractC0714Qj.m1495q(r246);
        if (r330 == null) goto L237;
        r330.setAlpha(0.0f);
    L237:
        View r331 = AbstractC0714Qj.m1494p(r246);
        if (r331 == null) goto L240;
        r331.setBackground(r161);
    L240:
        int r162 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-178077934024757L));
        if (r162 == 0) goto L243;
        C1456gf.m2795M(r246, r162, r162, true);
    L243:
        return r13;
    L226:
        r1011 = null;
        goto L227
    L244:
        AbstractC0295Gu.m625r(-180521770416181L);
        Object r163 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-180577604991029L);
        Intent r164 = ((Activity) r163).getIntent();
        r164.removeExtra(AbstractC0295Gu.m625r(-181376468908085L));
        r164.putExtra(AbstractC0295Gu.m625r(-180972741982261L), 0);
        r164.putExtra(AbstractC0295Gu.m625r(-181050051393589L), false);
        r164.putExtra(AbstractC0295Gu.m625r(-181110180935733L), 0);
        r164.putExtra(AbstractC0295Gu.m625r(-181144540674101L), 0);
        r164.removeExtra(AbstractC0295Gu.m625r(-179667071924277L));
        r164.removeExtra(AbstractC0295Gu.m625r(-179259050031157L));
        r164.putExtra(AbstractC0295Gu.m625r(-179400783951925L), 0);
        r164.putExtra(AbstractC0295Gu.m625r(-179478093363253L), 0);
        r164.removeExtra(AbstractC0295Gu.m625r(-180173878065205L));
        r164.removeExtra(AbstractC0295Gu.m625r(-180234007607349L));
        r164.removeExtra(AbstractC0295Gu.m625r(-179791625975861L));
        r164.removeExtra(AbstractC0295Gu.m625r(-179899000158261L));
        r164.removeExtra(AbstractC0295Gu.m625r(-180002079373365L));
        r164.removeExtra(AbstractC0295Gu.m625r(-178455891146805L));
        r164.removeExtra(AbstractC0295Gu.m625r(-178593330100277L));
        r164.removeExtra(AbstractC0295Gu.m625r(-178181013239861L));
        r164.removeExtra(AbstractC0295Gu.m625r(-178318452193333L));
        r164.removeExtra(AbstractC0295Gu.m625r(-179005646960693L));
        r164.removeExtra(AbstractC0295Gu.m625r(-179065776502837L));
        r164.removeExtra(AbstractC0295Gu.m625r(-178704999249973L));
        String r247 = r164.getStringExtra(AbstractC0295Gu.m625r(-178889682843701L));
        String r332 = AbstractC0295Gu.m625r(-177304839911477L);
        if (r247 == null) goto L247;
        String r1012 = AbstractC0085Bz.m133K(r247, AbstractC0295Gu.m625r(-177369264420917L), AbstractC0295Gu.m625r(-177429393963061L));
    L248:
        r164.putExtra(r332, r1012);
        return r13;
    L247:
        r1012 = null;
        goto L248
    L250:
        AbstractC0295Gu.m625r(-181655641782325L);
        Object r165 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-182334246615093L);
        View r166 = (View) r165;
        if (r166 == null) goto L253;
        r166.setBackground(null);
        r166.setTag(R.id.tag_view_bg_ban, Object.class);
    L253:
        return r13;
    L254:
        AbstractC0295Gu.m625r(-181818850539573L);
        Object r167 = ((C1494hG) r24).f5263a.f8521b;
        AbstractC0295Gu.m625r(-181947699558453L);
        C1456gf.m2805o((ViewGroup) r167);
        return r13;
    L256:
        AbstractC0295Gu.m625r(-182020714002485L);
        Object r168 = ((XC_MethodHook.MethodHookParam) ((C1494hG) r24).f5263a.f8523d).getResult();
        if ((r168 instanceof View) == false) goto L259;
        View r1013 = (View) r168;
    L260:
        if (r1013 == null) goto L277;
        AbstractC0295Gu.m625r(-191697275320373L);
        Iterator r169 = AbstractC0585Nj.m1157y().keySet().iterator();
    L264:
        if (r169.hasNext() == false) goto L277;
        String r333 = (String) r169.next();
        ImageView r64 = C1456gf.m2813y((ViewGroup) r1013, r333);
        if (r64 == null) goto L264;
        ViewParent r65 = r64.getParent().getParent();
        AbstractC0295Gu.m625r(-191718750156853L);
        ViewGroup r66 = (ViewGroup) r65;
        View r95 = r66.getChildAt(0);
        AbstractC0295Gu.m625r(-191426692380725L);
        ViewGroup r96 = (ViewGroup) r95;
        HashMap r1110 = AbstractC0999XA.f3193a;
        int r1111 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-192234146232373L));
        if (r1111 == 0) goto L270;
        View r67 = r66.getChildAt(1);
        AbstractC0295Gu.m625r(-192345815382069L);
        C1456gf.m2797O((TextView) r67, r1111);
    L270:
        Float r68 = Float.valueOf(40.0f);
        if (r96.getChildCount() != 3) goto L273;
        r96.getChildAt(2).setAlpha(0.0f);
        r96.getChildAt(1).setAlpha(0.0f);
        r96.getChildAt(0).setAlpha(0.0f);
        ImageView r85 = new ImageView(r96.getContext());
        r85.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams r1112 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(r68), AbstractC0295Gu.m616i(r68));
        r1112.addRule(13);
        r96.addView(r85, r1112);
    L274:
        Drawable r334 = C1517hw.m2890b((String) AbstractC0585Nj.m1157y().get(r333));
        if (r334 == null) goto L264;
        r85.setImageDrawable(r334);
        goto L264
    L273:
        View r69 = r96.getChildAt(3);
        AbstractC0295Gu.m625r(-192058052573237L);
        r85 = (ImageView) r69;
    L277:
        return r13;
    L259:
        r1013 = null;
        goto L260
    L278:
        AbstractC0295Gu.m625r(-193969313019957L);
        Object[] r170 = (Object[]) ((C1494hG) r24).f5263a.f8522c;
        Object r610 = r170[0];
        Object r171 = r170[1];
        AbstractC0295Gu.m625r(-194020852627509L);
        int r172 = ((Integer) r171).intValue();
        Field[] r86 = r610.getClass().getFields();
        AbstractC0295Gu.m625r(-193677255243829L);
        int r97 = r86.length;
        int r1014 = 0;
    L279:
        if (r1014 >= r97) goto L303;
        Field r1113 = r86[r1014];
        if (AbstractC0585Nj.m1134a(r1113.getType(), ImageView.class) == false) goto L302;
        Object r1114 = r1113.get(r610);
        AbstractC0295Gu.m625r(-193741679753269L);
        ViewParent r1115 = ((ImageView) r1114).getParent();
        AbstractC0295Gu.m625r(-194557723539509L);
        ViewGroup r1116 = (ViewGroup) r1115;
        HashMap r1210 = AbstractC0999XA.f3193a;
        if (r172 != 0) goto L285;
        String r1211 = AbstractC0295Gu.m625r(-194265665763381L);
    L293:
        Drawable r1212 = C1517hw.m2890b(r1211);
        if (r1212 == null) goto L302;
        if (AbstractC0585Nj.m1134a(r1116.getChildAt(r1116.getChildCount() - 1).getTag(), AbstractC0295Gu.m625r(-211028923119669L)) == true) goto L302;
        int r1412 = r1116.getChildCount();
        int r1510 = 0;
    L298:
        if (r1510 >= r1412) goto L300;
        r1116.getChildAt(r1510).setAlpha(0.0f);
        r1510 = r1510 + 1;
        goto L298
    L300:
        Context r415 = r1116.getContext();
        AbstractC0295Gu.m625r(-211046102988853L);
        View r416 = C1456gf.m2808t(r415, r1212);
        r416.setTag(AbstractC0295Gu.m625r(-210565066651701L));
        RelativeLayout.LayoutParams r1213 = new RelativeLayout.LayoutParams(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(30));
        r1213.addRule(13);
        r1116.addView(r416, r1213);
        goto L302
    L285:
        if (r172 == 1) goto L291;
        if (r172 == 2) goto L290;
        if (r172 == r4) goto L289;
        r1211 = AbstractC0295Gu.m625r(-210870009329717L);
        goto L293
    L289:
        r1211 = AbstractC0295Gu.m625r(-210161339725877L);
        goto L293
    L290:
        r1211 = AbstractC0295Gu.m625r(-210552181749813L);
        goto L293
    L291:
        r1211 = AbstractC0295Gu.m625r(-210380383057973L);
    L302:
        r1014 = r1014 + 1;
        r4 = 3;
        goto L279
    L303:
        return r13;
    L10:
        return m443j(r24);
    L12:
        return m442i(r24);
    L14:
        return m441h(r24);
    L16:
        return m440f(r24);
    L18:
        return m439e(r24);
    L20:
        return m438c(r24);
    L81:
        return CherryNetworkAPI.m3155i((Map.Entry) r24);
    L83:
        return CherryGlobalAPI.m3112w((Class) r24);
    }
}
