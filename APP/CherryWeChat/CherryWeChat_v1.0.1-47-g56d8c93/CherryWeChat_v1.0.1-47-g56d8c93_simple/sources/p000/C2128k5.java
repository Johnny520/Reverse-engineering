package p000;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2128k5 extends AbstractC0929Vk {

    /* JADX INFO: renamed from: b */
    public static final C2128k5 f7460b = null;

    /* JADX INFO: renamed from: c */
    public static final C2128k5 f7461c = null;

    /* JADX INFO: renamed from: d */
    public static final C2128k5 f7462d = null;

    /* JADX INFO: renamed from: e */
    public static final C2128k5 f7463e = null;

    /* JADX INFO: renamed from: f */
    public static final C2128k5 f7464f = null;

    /* JADX INFO: renamed from: g */
    public static final C2128k5 f7465g = null;

    /* JADX INFO: renamed from: h */
    public static final C2128k5 f7466h = null;

    /* JADX INFO: renamed from: i */
    public static final C2128k5 f7467i = null;

    /* JADX INFO: renamed from: j */
    public static final C2128k5 f7468j = null;

    /* JADX INFO: renamed from: k */
    public static final C2128k5 f7469k = null;

    /* JADX INFO: renamed from: l */
    public static final C2128k5 f7470l = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7471a;

    static {
        f7460b = new C2128k5(0);
        f7461c = new C2128k5(1);
        f7462d = new C2128k5(2);
        f7463e = new C2128k5(3);
        f7464f = new C2128k5(4);
        f7465g = new C2128k5(5);
        f7466h = new C2128k5(6);
        f7467i = new C2128k5(7);
        f7468j = new C2128k5(8);
        f7469k = new C2128k5(9);
        f7470l = new C2128k5(10);
    }

    public /* synthetic */ C2128k5(int r1) {
        this.f7471a = r1;
    }

    /* JADX INFO: renamed from: c */
    public static void m4312c(ViewGroup r6) {
        int r0 = r6.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L20;
        View r2 = r6.getChildAt(r1);
        if ((r2 instanceof ViewGroup) == false) goto L8;
        m4312c((ViewGroup) r2);
    L19:
        r1 = r1 + 1;
        goto L3
    L8:
        if ((r2 instanceof ImageView) == false) goto L19;
        ImageView r22 = (ImageView) r2;
        if (r22.getPaddingTop() != 0) goto L19;
        ViewGroup.LayoutParams r3 = r22.getLayoutParams();
        if (r3.width != (-1)) goto L19;
        if (r3.height != (-1)) goto L19;
        if (r22.getScaleType() != ImageView.ScaleType.CENTER_CROP) goto L19;
        r22.setAlpha(0.0f);
        return;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4313d(Activity r16) {
        return AbstractC2496sa.m4977b0(new String[]{AbstractC0295Gu.m625r(-513841297356853L), AbstractC0295Gu.m625r(-513575009384501L), AbstractC0295Gu.m625r(-514326628661301L), AbstractC0295Gu.m625r(-514060340688949L), AbstractC0295Gu.m625r(-514270794086453L), AbstractC0295Gu.m625r(-512827685074997L), AbstractC0295Gu.m625r(-512492677625909L), AbstractC0295Gu.m625r(-513270066706485L), AbstractC0295Gu.m625r(-512952239126581L), AbstractC0295Gu.m625r(-513171282458677L), AbstractC0295Gu.m625r(-511723878479925L), AbstractC0295Gu.m625r(-511324446521397L), AbstractC0295Gu.m625r(-511504835147829L), AbstractC0295Gu.m625r(-512320878934069L)}).contains(r16.getClass().getName());
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        int r1 = this.f7471a;
        int r2 = 10;
        Class r4 = Integer.TYPE;
        int r13 = 17;
        int r14 = 29;
        int r15 = 28;
        Class r16 = null;
        int r6 = 0;
        int r7 = 11;
        switch(r1) {
            case 0: goto L170;
            case 1: goto L165;
            case 2: goto L108;
            case 3: goto L106;
            case 4: goto L41;
            case 5: goto L38;
            case 6: goto L36;
            case 7: goto L19;
            case 8: goto L8;
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        C1538iG r12 = new C1538iG(TextView.class);
        r12.m2921f(AbstractC0295Gu.m625r(-168371307935797L));
        r12.m2922g(new Object[]{r4});
        r12.m2917b(new C0556Mx(9));
        C1538iG r17 = new C1538iG(TextView.class);
        r17.m2921f(AbstractC0295Gu.m625r(-168427142510645L));
        r17.m2922g(new Object[]{ColorStateList.class});
        r17.m2917b(new C0556Mx(10));
        return;
    L6:
        String r18 = AbstractC0295Gu.m625r(-470097055447093L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r3 = AbstractC1450gG.f5067a;
        C1538iG r22 = new C1538iG(AbstractC1406fG.m2718r0(r18));
        r22.m2921f(AbstractC0295Gu.m625r(-470255969237045L));
        r22.m2917b(new C0556Mx(5));
        String r19 = AbstractC0295Gu.m625r(-470294623942709L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r23 = new C1538iG(AbstractC1406fG.m2718r0(r19));
        C0556Mx r110 = new C0556Mx(6);
        AbstractC0295Gu.m625r(-576513460140085L);
        r23.f5424f = r110;
        C0556Mx r111 = new C0556Mx(7);
        AbstractC0295Gu.m625r(-578008108759093L);
        r23.f5422d = r111;
        r23.m2917b(new C0556Mx(8));
        return;
    L8:
        String r112 = AbstractC0295Gu.m625r(-522328152733749L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r32 = AbstractC1450gG.f5067a;
        C1538iG r24 = new C1538iG(AbstractC1406fG.m2718r0(r112));
        r24.m2921f(AbstractC0295Gu.m625r(-522530016196661L));
        r24.m2916a(new C0848Tp(r15));
        if (AbstractC1450gG.f5067a < 2980) goto L178;
        String r113 = AbstractC0295Gu.m625r(-523139901552693L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r25 = new C1538iG(AbstractC1406fG.m2718r0(r113));
        r25.m2921f(AbstractC0295Gu.m625r(-522882203514933L));
        r25.m2916a(new C0848Tp(r14));
        C1214bG r114 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-585807769368629L));
        if (r114 == null) goto L13;
        Object r115 = r114.f4146a;
    L15:
        if ((r115 instanceof Class) == false) goto L17;
        r16 = (Class) r115;
    L17:
        C1538iG r26 = new C1538iG(r16);
        C0556Mx r116 = new C0556Mx(0);
        AbstractC0295Gu.m625r(-576599359486005L);
        r26.f5425g = r116;
        r26.m2916a(new C0556Mx(1));
        return;
    L13:
        r115 = null;
        goto L15
    L178:
        return;
    L19:
        LinkedHashMap r117 = AbstractC1257cG.f4258a;
        C1214bG r42 = (C1214bG) r117.get(AbstractC0295Gu.m625r(-586615223220277L));
        if (r42 == null) goto L22;
        Object r43 = r42.f4146a;
    L24:
        if ((r43 instanceof Class) == false) goto L26;
        Class r44 = (Class) r43;
    L27:
        C1538iG r5 = new C1538iG(r44);
        r5.m2921f(AbstractC0295Gu.m625r(-474933188622389L));
        r5.m2917b(new C0848Tp(16));
        C1214bG r118 = (C1214bG) r117.get(AbstractC0295Gu.m625r(-586615223220277L));
        if (r118 == null) goto L30;
        Object r119 = r118.f4146a;
    L32:
        if ((r119 instanceof Class) == false) goto L34;
        r16 = (Class) r119;
    L34:
        C1538iG r27 = new C1538iG(r16);
        r27.m2921f(AbstractC0295Gu.m625r(-474477922089013L));
        r27.m2917b(new C0848Tp(r13));
        return;
    L30:
        r119 = null;
        goto L32
    L26:
        r44 = null;
        goto L27
    L22:
        r43 = null;
        goto L24
    L36:
        String r120 = AbstractC0295Gu.m625r(-457426901923893L);
        C0848Tp r28 = new C0848Tp(r6);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        int r45 = AbstractC1450gG.f5067a;
        new C2428qs(11, AbstractC1406fG.m2718r0(r120)).m4870f(r28);
        return;
    L38:
        String r121 = AbstractC0295Gu.m625r(-515404665452597L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r33 = AbstractC1450gG.f5067a;
        C1538iG r29 = new C1538iG(AbstractC1406fG.m2718r0(r121));
        r29.m2921f(AbstractC0295Gu.m625r(-515529219504181L));
        r29.m2916a(new C0620Ob(28));
        String r122 = AbstractC0295Gu.m625r(-515567874209845L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r210 = new C1538iG(AbstractC1406fG.m2718r0(r122));
        r210.m2921f(AbstractC0295Gu.m625r(-515142672447541L));
        r210.m2917b(new C0620Ob(29));
        String r123 = AbstractC0295Gu.m625r(-515202801989685L);     // Catch: Exception -> L172
        AbstractC0295Gu.m625r(-578300166535221L);     // Catch: Exception -> L172
        C1538iG r211 = new C1538iG(AbstractC1406fG.m2718r0(r123));     // Catch: Exception -> L172
        r211.m2921f(AbstractC0295Gu.m625r(-515361715779637L));     // Catch: Exception -> L172
        r211.m2923h(Boolean.FALSE);     // Catch: Exception -> L172
        return;
    L179:
        return;
    L41:
        String r124 = AbstractC0295Gu.m625r(-40711994996789L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r46 = AbstractC1450gG.f5067a;
        C1538iG r34 = new C1538iG(AbstractC1406fG.m2718r0(r124));
        r34.m2921f(AbstractC0295Gu.m625r(-40836549048373L));
        r34.m2916a(new C0620Ob(21));
        String r125 = AbstractC0295Gu.m625r(-40922448394293L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r35 = new C1538iG(AbstractC1406fG.m2718r0(r125));
        r35.m2921f(AbstractC0295Gu.m625r(-41596758259765L));
        r35.m2916a(new C0620Ob(22));
        LinkedHashMap r126 = AbstractC1257cG.f4258a;
        C1214bG r36 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-588938800527413L));
        if (r36 == null) goto L44;
        Object r37 = r36.f4146a;
    L46:
        if ((r37 instanceof Method) == false) goto L48;
        Method r38 = (Method) r37;
    L49:
        C0620Ob r47 = new C0620Ob(18);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r38).m2916a(r47);
        C1214bG r39 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-589037584775221L));
        if (r39 == null) goto L52;
        Object r310 = r39.f4146a;
    L54:
        if ((r310 instanceof Method) == false) goto L56;
        Method r311 = (Method) r310;
    L57:
        C0620Ob r48 = new C0620Ob(19);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r311).m2916a(r48);
        String r312 = AbstractC0295Gu.m625r(-51389283694645L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r49 = new C1538iG(AbstractC1406fG.m2718r0(r312));
        r49.m2921f(AbstractC0295Gu.m625r(-49860275337269L));
        r49.m2916a(new C0848Tp(12));
        C1214bG r313 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-818513392433205L));
        if (r313 == null) goto L60;
        Object r314 = r313.f4146a;
    L62:
        if ((r314 instanceof Method) == false) goto L64;
        Method r315 = (Method) r314;
    L65:
        C0848Tp r410 = new C0848Tp(13);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r315).m2916a(r410);
        C1214bG r316 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-818058125899829L));
        if (r316 == null) goto L68;
        Object r317 = r316.f4146a;
    L70:
        if ((r317 instanceof Method) == false) goto L72;
        Method r318 = (Method) r317;
    L73:
        C0848Tp r411 = new C0848Tp(r2);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r318).m2917b(r411);
        String r212 = AbstractC0295Gu.m625r(-49898930042933L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r319 = new C1538iG(AbstractC1406fG.m2718r0(r212));
        r319.m2922g(new Object[]{View.class});
        r319.m2916a(new C0848Tp(r7));
        String r320 = AbstractC0295Gu.m625r(-15101105010741L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r412 = new C1538iG(AbstractC1406fG.m2718r0(r320));
        r412.m2922g(new Object[]{Bundle.class});
        r412.m2916a(new C0223F7(17));
        C1214bG r321 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-586915870930997L));
        if (r321 == null) goto L76;
        Object r322 = r321.f4146a;
    L78:
        if ((r322 instanceof Class) == false) goto L80;
        Class r323 = (Class) r322;
    L81:
        C1538iG r413 = new C1538iG(r323);
        r413.m2922g(new Object[]{AbstractC0295Gu.m625r(-13692355737653L), View.class});
        r413.m2916a(new C0223F7(18));
        AbstractC0828TB.m1647p(AbstractC0295Gu.m625r(-13322988550197L), new C0223F7(19));
        C1214bG r213 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-587345367660597L));
        if (r213 == null) goto L84;
        Object r214 = r213.f4146a;
    L86:
        if ((r214 instanceof Method) == false) goto L88;
        Method r215 = (Method) r214;
    L89:
        C0223F7 r324 = new C0223F7(20);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r215).m2916a(r324);
        C1214bG r216 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-588019677526069L));
        if (r216 == null) goto L92;
        Object r217 = r216.f4146a;
    L94:
        if ((r217 instanceof Class) == false) goto L96;
        Class r218 = (Class) r217;
    L97:
        C0223F7 r325 = new C0223F7(21);
        AbstractC0295Gu.m625r(-579558591952949L);
        AbstractC0295Gu.m625r(-579588656724021L);
        AbstractC0295Gu.m625r(-579988088682549L);
        new C2428qs(11, r218).m4870f(r325);
        C1214bG r127 = (C1214bG) r126.get(AbstractC0295Gu.m625r(-588114166806581L));
        if (r127 == null) goto L100;
        Object r128 = r127.f4146a;
    L102:
        if ((r128 instanceof Class) == false) goto L104;
        r16 = (Class) r128;
    L104:
        C0223F7 r219 = new C0223F7(22);
        AbstractC0295Gu.m625r(-579558591952949L);
        AbstractC0295Gu.m625r(-579588656724021L);
        AbstractC0295Gu.m625r(-579988088682549L);
        new C2428qs(11, r16).m4870f(r219);
        String r129 = AbstractC0295Gu.m625r(-65910568122421L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r220 = new C1538iG(AbstractC1406fG.m2718r0(r129));
        r220.m2921f(AbstractC0295Gu.m625r(-65485366360117L));
        r220.m2916a(new C0620Ob(20));
        String r130 = AbstractC0295Gu.m625r(-62938450753589L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r221 = new C1538iG(AbstractC1406fG.m2718r0(r130));
        r221.m2921f(AbstractC0295Gu.m625r(-63668595193909L));
        r221.m2916a(new C0620Ob(17));
        String r131 = AbstractC0295Gu.m625r(-41635412965429L);
        C0620Ob r222 = new C0620Ob(16);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r131)).m4870f(r222);
        return;
    L100:
        r128 = null;
        goto L102
    L96:
        r218 = null;
        goto L97
    L92:
        r217 = null;
        goto L94
    L88:
        r215 = null;
        goto L89
    L84:
        r214 = null;
        goto L86
    L80:
        r323 = null;
        goto L81
    L76:
        r322 = null;
        goto L78
    L72:
        r318 = null;
        goto L73
    L68:
        r317 = null;
        goto L70
    L64:
        r315 = null;
        goto L65
    L60:
        r314 = null;
        goto L62
    L56:
        r311 = null;
        goto L57
    L52:
        r310 = null;
        goto L54
    L48:
        r38 = null;
        goto L49
    L44:
        r37 = null;
        goto L46
    L106:
        C1538iG r132 = new C1538iG(HeaderViewListAdapter.class);
        r132.m2921f(AbstractC0295Gu.m625r(-56405805496373L));
        r132.m2916a(new C0620Ob(3));
        String r133 = AbstractC0295Gu.m625r(-56440165234741L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r326 = AbstractC1450gG.f5067a;
        C1538iG r223 = new C1538iG(AbstractC1406fG.m2718r0(r133));
        r223.m2921f(AbstractC0295Gu.m625r(-56113747720245L));
        r223.m2916a(new C0620Ob(4));
        String r134 = AbstractC0295Gu.m625r(-57698590652469L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r224 = new C1538iG(AbstractC1406fG.m2718r0(r134));
        r224.m2922g(new Object[]{Bundle.class});
        C0620Ob r135 = new C0620Ob(5);
        AbstractC0295Gu.m625r(-576513460140085L);
        r224.f5424f = r135;
        r224.m2916a(new C0620Ob(6));
        String r136 = AbstractC0295Gu.m625r(-57840324573237L);
        C0620Ob r225 = new C0620Ob(8);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r136)).m4870f(r225);
        String r137 = AbstractC0295Gu.m625r(-57312043595829L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r226 = new C1538iG(AbstractC1406fG.m2718r0(r137));
        r226.m2921f(AbstractC0295Gu.m625r(-58085137709109L));
        r226.m2916a(new C0223F7(28));
        String r138 = AbstractC0295Gu.m625r(-58166742087733L);
        C0620Ob r227 = new C0620Ob(1);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r138)).m4870f(r227);
        String r139 = AbstractC0295Gu.m625r(-56178172229685L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r228 = new C1538iG(AbstractC1406fG.m2718r0(r139));
        C2703x8 r140 = new C2703x8(32, 2);
        AbstractC0295Gu.m625r(-578008108759093L);
        r228.f5422d = r140;
        C0620Ob r141 = new C0620Ob(0);
        AbstractC0295Gu.m625r(-576599359486005L);
        r228.f5425g = r141;
        r228.f5426h = new C0556Mx(21);
        r228.m2925j();
        String r142 = AbstractC0295Gu.m625r(-56972741179445L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r229 = new C1538iG(AbstractC1406fG.m2718r0(r142));
        r229.m2921f(AbstractC0295Gu.m625r(-56706453207093L));
        r229.f5426h = new C0556Mx(21);
        r229.m2925j();
        String r143 = AbstractC0295Gu.m625r(-56736517978165L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r230 = new C1538iG(AbstractC1406fG.m2718r0(r143));
        r230.m2921f(AbstractC0295Gu.m625r(-55306293868597L));
        r230.f5426h = new C0556Mx(21);
        r230.m2925j();
        String r144 = AbstractC0295Gu.m625r(-55336358639669L);
        C0620Ob r231 = new C0620Ob(2);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r144)).m4870f(r231);
        String r145 = AbstractC0295Gu.m625r(-55001351190581L);
        C0223F7 r232 = new C0223F7(29);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r145)).m4870f(r232);
        String r146 = AbstractC0295Gu.m625r(-55873229551669L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r233 = new C1538iG(AbstractC1406fG.m2718r0(r146));
        r233.m2921f(AbstractC0295Gu.m625r(-55546812037173L));
        r233.m2916a(new C0620Ob(7));
        return;
    L108:
        String r147 = AbstractC0295Gu.m625r(-148760487262261L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r8 = AbstractC1450gG.f5067a;
        C1538iG r234 = new C1538iG(AbstractC1406fG.m2718r0(r147));
        r234.m2921f(AbstractC0295Gu.m625r(-148958055757877L));
        r234.m2916a(new C1197b(19));
        if (C1442g8.f5046b.m2024e() == true) goto L111;
    L113:
        C0183EA.f539a.getClass();
        if (C0183EA.m374b().f231i == false) goto L116;
        AbstractC0828TB.m1647p(AbstractC0295Gu.m625r(-148477019420725L), new C1197b(20));
        AbstractC0828TB.m1647p(AbstractC0295Gu.m625r(-148635933210677L), new C1197b(21));
    L125:
        Method r148 = AbstractC1257cG.m2375c();
        C1197b r235 = new C1197b(24);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r148).m2916a(r235);
        C1538iG r236 = new C1538iG(AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-157157148325941L)).getSuperclass());
        r236.m2921f(AbstractC0295Gu.m625r(-156942399961141L));
        r236.m2922g(new Object[]{r4, r4});
        r236.m2917b(new C1197b(25));
        LinkedHashMap r149 = AbstractC1257cG.f4258a;
        C1214bG r237 = (C1214bG) r149.get(AbstractC0295Gu.m625r(-587766274455605L));
        if (r237 == null) goto L128;
        Object r238 = r237.f4146a;
    L130:
        if ((r238 instanceof Method) == false) goto L132;
        Method r239 = (Method) r238;
    L133:
        C1214bG r150 = (C1214bG) r149.get(AbstractC0295Gu.m625r(-587903713409077L));
        if (r150 == null) goto L136;
        Object r151 = r150.f4146a;
    L138:
        if ((r151 instanceof Method) == false) goto L140;
        Method r152 = (Method) r151;
    L141:
        Iterator r153 = AbstractC2496sa.m4977b0(new Method[]{r239, r152}).iterator();
    L143:
        if (r153.hasNext() == false) goto L175;
        Method r240 = (Method) r153.next();
        C0223F7 r414 = new C0223F7(8);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r240).m2916a(r414);
        goto L143
    L175:
        Class<?> r154 = AbstractC1450gG.f5069c.loadClass(AbstractC0295Gu.m625r(-182072253610037L));     // Catch: Throwable -> L147
    L148:
        C1538iG r241 = new C1538iG(r154);
        r241.m2921f(AbstractC0295Gu.m625r(-180397216364597L));
        r241.m2917b(new C0223F7(4));
        C1538iG r242 = new C1538iG(r154);
        r242.m2921f(AbstractC0295Gu.m625r(-180435871070261L));
        r242.m2916a(new C0223F7(5));
        C1538iG r243 = new C1538iG(r154);
        r243.m2921f(AbstractC0295Gu.m625r(-180474525775925L));
        r243.m2916a(new C0352I7(0, r154));
        C1197b r155 = new C1197b(28);
        AbstractC0295Gu.m625r(-579558591952949L);
        AbstractC0295Gu.m625r(-579588656724021L);
        AbstractC0295Gu.m625r(-579988088682549L);
        new C2428qs(11, EditText.class).m4870f(r155);
        String r156 = AbstractC0295Gu.m625r(-196572063201333L);
        C1197b r244 = new C1197b(29);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r156)).m4870f(r244);
        String r157 = AbstractC0295Gu.m625r(-190675073103925L);
        C0223F7 r245 = new C0223F7(9);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r157)).m4870f(r245);
        LinkedHashMap r158 = AbstractC1257cG.f4258a;
        C1214bG r246 = (C1214bG) r158.get(AbstractC0295Gu.m625r(-819935026608181L));
        if (r246 == null) goto L151;
        Object r247 = r246.f4146a;
    L153:
        if ((r247 instanceof Method) == false) goto L155;
        Method r248 = (Method) r247;
    L156:
        C0223F7 r327 = new C0223F7(1);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r248).m2916a(r327);
        C1214bG r159 = (C1214bG) r158.get(AbstractC0295Gu.m625r(-586675352762421L));
        if (r159 == null) goto L159;
        Object r160 = r159.f4146a;
    L161:
        if ((r160 instanceof Class) == false) goto L163;
        r16 = (Class) r160;
    L163:
        C1538iG r249 = new C1538iG(r16);
        r249.m2921f(AbstractC0295Gu.m625r(-193896298575925L));
        r249.m2916a(new C0223F7(0));
        String r161 = AbstractC0295Gu.m625r(-184627759151157L);
        C0223F7 r250 = new C0223F7(2);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r161)).m4870f(r250);
        String r162 = AbstractC0295Gu.m625r(-184262686930997L);
        C0223F7 r251 = new C0223F7(3);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r162)).m4870f(r251);
        String r163 = AbstractC0295Gu.m625r(-182823872886837L);
        AbstractC0295Gu.m625r(-578300166535221L);
        C1538iG r252 = new C1538iG(AbstractC1406fG.m2718r0(r163));
        r252.m2921f(AbstractC0295Gu.m625r(-183012851447861L));
        r252.m2923h(Boolean.FALSE);
        C1213bF r164 = C1213bF.f4144a;
        C0309H7 r165 = new C0309H7(r6);
        AbstractC0295Gu.m625r(-468129960425525L);
        C1213bF.f4145b.add(r165);
        return;
    L159:
        r160 = null;
        goto L161
    L155:
        r248 = null;
        goto L156
    L151:
        r247 = null;
    L147:
        r154 = AbstractC1450gG.f5069c.loadClass(AbstractC0295Gu.m625r(-180676389238837L));
        goto L148
    L140:
        r152 = null;
        goto L141
    L136:
        r151 = null;
        goto L138
    L132:
        r239 = null;
        goto L133
    L128:
        r238 = null;
        goto L130
    L116:
        C1214bG r166 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-584957365844021L));
        if (r166 == null) goto L119;
        Object r167 = r166.f4146a;
    L121:
        if ((r167 instanceof Method) == false) goto L123;
        Method r168 = (Method) r167;
    L124:
        new C1538iG(r168).m2916a(new C1197b(22));
        String r169 = AbstractC0295Gu.m625r(-149387552487477L);
        C1197b r253 = new C1197b(23);
        AbstractC0295Gu.m625r(-579489872476213L);
        AbstractC0295Gu.m625r(-579519937247285L);
        AbstractC0295Gu.m625r(-579464102672437L);
        new C2428qs(11, AbstractC1406fG.m2718r0(r169)).m4870f(r253);
        goto L125
    L123:
        r168 = null;
        goto L124
    L119:
        r167 = null;
        goto L121
    L111:
        if (C1442g8.f5047c.length() <= 0) goto L113;
    L165:
        Iterator r170 = AbstractC2496sa.m4977b0(new String[]{AbstractC0295Gu.m625r(-460682487134261L), AbstractC0295Gu.m625r(-460265875306549L), AbstractC0295Gu.m625r(-460416199161909L), AbstractC0295Gu.m625r(-458852831066165L), AbstractC0295Gu.m625r(-458938730412085L)}).iterator();
    L167:
        if (r170.hasNext() == false) goto L169;
        String r254 = (String) r170.next();
        String r328 = AbstractC0295Gu.m625r(-458985975052341L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r52 = AbstractC1450gG.f5067a;
        C1538iG r415 = new C1538iG(AbstractC1406fG.m2718r0(r328));
        r415.m2921f(r254);
        r415.m2917b(new C1197b(18));
        goto L167
    L169:
        return;
    L170:
        C1538iG r171 = new C1538iG(View.class);
        r171.m2921f(AbstractC0295Gu.m625r(-170110769690677L));
        r171.m2917b(new C1197b(17));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        switch(this.f7471a) {
            case 0: goto L25;
            case 1: goto L23;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L17;
            case 5: goto L15;
            case 6: goto L13;
            case 7: goto L11;
            case 8: goto L9;
            case 9: goto L7;
            default: goto L5;
        };
    L5:
        return AbstractC0295Gu.m625r(-168298293491765L);
    L7:
        return AbstractC0295Gu.m625r(-470049810806837L);
    L9:
        return AbstractC0295Gu.m625r(-522792009201717L);
    L11:
        return AbstractC0295Gu.m625r(-474864469145653L);
    L13:
        return AbstractC0295Gu.m625r(-457907938261045L);
    L15:
        return AbstractC0295Gu.m625r(-514790485129269L);
    L17:
        return AbstractC0295Gu.m625r(-65863323482165L);
    L19:
        return AbstractC0295Gu.m625r(-57616986273845L);
    L21:
        return AbstractC0295Gu.m625r(-184589104445493L);
    L23:
        return AbstractC0295Gu.m625r(-460618062624821L);
    L25:
        return AbstractC0295Gu.m625r(-170033460279349L);
    }
}
