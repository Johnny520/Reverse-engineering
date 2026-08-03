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
import java.util.LinkedHashMap;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: k5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2128k5 extends AbstractC0929Vk {

    /* JADX INFO: renamed from: b */
    public static final C2128k5 f7460b = new C2128k5(0);

    /* JADX INFO: renamed from: c */
    public static final C2128k5 f7461c = new C2128k5(1);

    /* JADX INFO: renamed from: d */
    public static final C2128k5 f7462d = new C2128k5(2);

    /* JADX INFO: renamed from: e */
    public static final C2128k5 f7463e = new C2128k5(3);

    /* JADX INFO: renamed from: f */
    public static final C2128k5 f7464f = new C2128k5(4);

    /* JADX INFO: renamed from: g */
    public static final C2128k5 f7465g = new C2128k5(5);

    /* JADX INFO: renamed from: h */
    public static final C2128k5 f7466h = new C2128k5(6);

    /* JADX INFO: renamed from: i */
    public static final C2128k5 f7467i = new C2128k5(7);

    /* JADX INFO: renamed from: j */
    public static final C2128k5 f7468j = new C2128k5(8);

    /* JADX INFO: renamed from: k */
    public static final C2128k5 f7469k = new C2128k5(9);

    /* JADX INFO: renamed from: l */
    public static final C2128k5 f7470l = new C2128k5(10);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7471a;

    public /* synthetic */ C2128k5(int i) {
        this.f7471a = i;
    }

    /* JADX INFO: renamed from: c */
    public static void m4312c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                m4312c((ViewGroup) childAt);
            } else if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (imageView.getPaddingTop() == 0) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams.width == -1 && layoutParams.height == -1 && imageView.getScaleType() == ImageView.ScaleType.CENTER_CROP) {
                        imageView.setAlpha(0.0f);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4313d(Activity activity) {
        return AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-513841297356853L), AbstractC0295Gu.m625r(-513575009384501L), AbstractC0295Gu.m625r(-514326628661301L), AbstractC0295Gu.m625r(-514060340688949L), AbstractC0295Gu.m625r(-514270794086453L), AbstractC0295Gu.m625r(-512827685074997L), AbstractC0295Gu.m625r(-512492677625909L), AbstractC0295Gu.m625r(-513270066706485L), AbstractC0295Gu.m625r(-512952239126581L), AbstractC0295Gu.m625r(-513171282458677L), AbstractC0295Gu.m625r(-511723878479925L), AbstractC0295Gu.m625r(-511324446521397L), AbstractC0295Gu.m625r(-511504835147829L), AbstractC0295Gu.m625r(-512320878934069L)).contains(activity.getClass().getName());
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() throws ClassNotFoundException {
        Class<?> clsLoadClass;
        int i = this.f7471a;
        int i2 = 10;
        Class cls = Integer.TYPE;
        int i3 = 17;
        int i4 = 29;
        int i5 = 28;
        int i6 = 0;
        int i7 = 11;
        switch (i) {
            case 0:
                C1538iG c1538iG = new C1538iG(View.class);
                c1538iG.m2921f(AbstractC0295Gu.m625r(-170110769690677L));
                c1538iG.m2917b(new C1197b(17));
                break;
            case 1:
                for (String str : AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-460682487134261L), AbstractC0295Gu.m625r(-460265875306549L), AbstractC0295Gu.m625r(-460416199161909L), AbstractC0295Gu.m625r(-458852831066165L), AbstractC0295Gu.m625r(-458938730412085L))) {
                    String strM625r = AbstractC0295Gu.m625r(-458985975052341L);
                    AbstractC0295Gu.m625r(-578300166535221L);
                    int i8 = AbstractC1450gG.f5067a;
                    C1538iG c1538iG2 = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
                    c1538iG2.m2921f(str);
                    c1538iG2.m2917b(new C1197b(18));
                }
                break;
            case 2:
                String strM625r2 = AbstractC0295Gu.m625r(-148760487262261L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i9 = AbstractC1450gG.f5067a;
                C1538iG c1538iG3 = new C1538iG(AbstractC1406fG.m2718r0(strM625r2));
                c1538iG3.m2921f(AbstractC0295Gu.m625r(-148958055757877L));
                c1538iG3.m2916a(new C1197b(19));
                if (!C1442g8.f5046b.m2024e() || C1442g8.f5047c.length() <= 0) {
                    C0183EA.f539a.getClass();
                    if (C0183EA.m374b().f231i) {
                        AbstractC0828TB.m1647p(AbstractC0295Gu.m625r(-148477019420725L), new C1197b(20));
                        AbstractC0828TB.m1647p(AbstractC0295Gu.m625r(-148635933210677L), new C1197b(21));
                    } else {
                        C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-584957365844021L));
                        Object obj = c1214bG != null ? c1214bG.f4146a : null;
                        new C1538iG(obj instanceof Method ? (Method) obj : null).m2916a(new C1197b(22));
                        String strM625r3 = AbstractC0295Gu.m625r(-149387552487477L);
                        C1197b c1197b = new C1197b(23);
                        AbstractC0295Gu.m625r(-579489872476213L);
                        AbstractC0295Gu.m625r(-579519937247285L);
                        AbstractC0295Gu.m625r(-579464102672437L);
                        new C2428qs(11, AbstractC1406fG.m2718r0(strM625r3)).m4870f(c1197b);
                    }
                }
                Method methodM2375c = AbstractC1257cG.m2375c();
                C1197b c1197b2 = new C1197b(24);
                AbstractC0295Gu.m625r(-577887849674805L);
                AbstractC0295Gu.m625r(-577917914445877L);
                new C1538iG(methodM2375c).m2916a(c1197b2);
                C1538iG c1538iG4 = new C1538iG(AbstractC1406fG.m2718r0(AbstractC0295Gu.m625r(-157157148325941L)).getSuperclass());
                c1538iG4.m2921f(AbstractC0295Gu.m625r(-156942399961141L));
                c1538iG4.m2922g(cls, cls);
                c1538iG4.m2917b(new C1197b(25));
                LinkedHashMap linkedHashMap = AbstractC1257cG.f4258a;
                C1214bG c1214bG2 = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-587766274455605L));
                Object obj2 = c1214bG2 != null ? c1214bG2.f4146a : null;
                Method method = obj2 instanceof Method ? (Method) obj2 : null;
                C1214bG c1214bG3 = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-587903713409077L));
                Object obj3 = c1214bG3 != null ? c1214bG3.f4146a : null;
                for (Method method2 : AbstractC2496sa.m4977b0(method, obj3 instanceof Method ? (Method) obj3 : null)) {
                    C0223F7 c0223f7 = new C0223F7(8);
                    AbstractC0295Gu.m625r(-577887849674805L);
                    AbstractC0295Gu.m625r(-577917914445877L);
                    new C1538iG(method2).m2916a(c0223f7);
                }
                try {
                    clsLoadClass = AbstractC1450gG.f5069c.loadClass(AbstractC0295Gu.m625r(-182072253610037L));
                } catch (Throwable unused) {
                    clsLoadClass = AbstractC1450gG.f5069c.loadClass(AbstractC0295Gu.m625r(-180676389238837L));
                }
                C1538iG c1538iG5 = new C1538iG(clsLoadClass);
                c1538iG5.m2921f(AbstractC0295Gu.m625r(-180397216364597L));
                c1538iG5.m2917b(new C0223F7(4));
                C1538iG c1538iG6 = new C1538iG(clsLoadClass);
                c1538iG6.m2921f(AbstractC0295Gu.m625r(-180435871070261L));
                c1538iG6.m2916a(new C0223F7(5));
                C1538iG c1538iG7 = new C1538iG(clsLoadClass);
                c1538iG7.m2921f(AbstractC0295Gu.m625r(-180474525775925L));
                c1538iG7.m2916a(new C0352I7(0, clsLoadClass));
                C1197b c1197b3 = new C1197b(28);
                AbstractC0295Gu.m625r(-579558591952949L);
                AbstractC0295Gu.m625r(-579588656724021L);
                AbstractC0295Gu.m625r(-579988088682549L);
                new C2428qs(11, EditText.class).m4870f(c1197b3);
                String strM625r4 = AbstractC0295Gu.m625r(-196572063201333L);
                C1197b c1197b4 = new C1197b(29);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r4)).m4870f(c1197b4);
                String strM625r5 = AbstractC0295Gu.m625r(-190675073103925L);
                C0223F7 c0223f72 = new C0223F7(9);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r5)).m4870f(c0223f72);
                LinkedHashMap linkedHashMap2 = AbstractC1257cG.f4258a;
                C1214bG c1214bG4 = (C1214bG) linkedHashMap2.get(AbstractC0295Gu.m625r(-819935026608181L));
                Object obj4 = c1214bG4 != null ? c1214bG4.f4146a : null;
                Method method3 = obj4 instanceof Method ? (Method) obj4 : null;
                C0223F7 c0223f73 = new C0223F7(1);
                AbstractC0295Gu.m625r(-577887849674805L);
                AbstractC0295Gu.m625r(-577917914445877L);
                new C1538iG(method3).m2916a(c0223f73);
                C1214bG c1214bG5 = (C1214bG) linkedHashMap2.get(AbstractC0295Gu.m625r(-586675352762421L));
                Object obj5 = c1214bG5 != null ? c1214bG5.f4146a : null;
                C1538iG c1538iG8 = new C1538iG(obj5 instanceof Class ? (Class) obj5 : null);
                c1538iG8.m2921f(AbstractC0295Gu.m625r(-193896298575925L));
                c1538iG8.m2916a(new C0223F7(0));
                String strM625r6 = AbstractC0295Gu.m625r(-184627759151157L);
                C0223F7 c0223f74 = new C0223F7(2);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r6)).m4870f(c0223f74);
                String strM625r7 = AbstractC0295Gu.m625r(-184262686930997L);
                C0223F7 c0223f75 = new C0223F7(3);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r7)).m4870f(c0223f75);
                String strM625r8 = AbstractC0295Gu.m625r(-182823872886837L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG9 = new C1538iG(AbstractC1406fG.m2718r0(strM625r8));
                c1538iG9.m2921f(AbstractC0295Gu.m625r(-183012851447861L));
                c1538iG9.m2923h(Boolean.FALSE);
                C1213bF c1213bF = C1213bF.f4144a;
                C0309H7 c0309h7 = new C0309H7(i6);
                AbstractC0295Gu.m625r(-468129960425525L);
                C1213bF.f4145b.add(c0309h7);
                break;
            case 3:
                C1538iG c1538iG10 = new C1538iG(HeaderViewListAdapter.class);
                c1538iG10.m2921f(AbstractC0295Gu.m625r(-56405805496373L));
                c1538iG10.m2916a(new C0620Ob(3));
                String strM625r9 = AbstractC0295Gu.m625r(-56440165234741L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i10 = AbstractC1450gG.f5067a;
                C1538iG c1538iG11 = new C1538iG(AbstractC1406fG.m2718r0(strM625r9));
                c1538iG11.m2921f(AbstractC0295Gu.m625r(-56113747720245L));
                c1538iG11.m2916a(new C0620Ob(4));
                String strM625r10 = AbstractC0295Gu.m625r(-57698590652469L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG12 = new C1538iG(AbstractC1406fG.m2718r0(strM625r10));
                c1538iG12.m2922g(Bundle.class);
                C0620Ob c0620Ob = new C0620Ob(5);
                AbstractC0295Gu.m625r(-576513460140085L);
                c1538iG12.f5424f = c0620Ob;
                c1538iG12.m2916a(new C0620Ob(6));
                String strM625r11 = AbstractC0295Gu.m625r(-57840324573237L);
                C0620Ob c0620Ob2 = new C0620Ob(8);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r11)).m4870f(c0620Ob2);
                String strM625r12 = AbstractC0295Gu.m625r(-57312043595829L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG13 = new C1538iG(AbstractC1406fG.m2718r0(strM625r12));
                c1538iG13.m2921f(AbstractC0295Gu.m625r(-58085137709109L));
                c1538iG13.m2916a(new C0223F7(28));
                String strM625r13 = AbstractC0295Gu.m625r(-58166742087733L);
                C0620Ob c0620Ob3 = new C0620Ob(1);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r13)).m4870f(c0620Ob3);
                String strM625r14 = AbstractC0295Gu.m625r(-56178172229685L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG14 = new C1538iG(AbstractC1406fG.m2718r0(strM625r14));
                C2703x8 c2703x8 = new C2703x8(32, 2);
                AbstractC0295Gu.m625r(-578008108759093L);
                c1538iG14.f5422d = c2703x8;
                C0620Ob c0620Ob4 = new C0620Ob(0);
                AbstractC0295Gu.m625r(-576599359486005L);
                c1538iG14.f5425g = c0620Ob4;
                c1538iG14.f5426h = new C0556Mx(21);
                c1538iG14.m2925j();
                String strM625r15 = AbstractC0295Gu.m625r(-56972741179445L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG15 = new C1538iG(AbstractC1406fG.m2718r0(strM625r15));
                c1538iG15.m2921f(AbstractC0295Gu.m625r(-56706453207093L));
                c1538iG15.f5426h = new C0556Mx(21);
                c1538iG15.m2925j();
                String strM625r16 = AbstractC0295Gu.m625r(-56736517978165L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG16 = new C1538iG(AbstractC1406fG.m2718r0(strM625r16));
                c1538iG16.m2921f(AbstractC0295Gu.m625r(-55306293868597L));
                c1538iG16.f5426h = new C0556Mx(21);
                c1538iG16.m2925j();
                String strM625r17 = AbstractC0295Gu.m625r(-55336358639669L);
                C0620Ob c0620Ob5 = new C0620Ob(2);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r17)).m4870f(c0620Ob5);
                String strM625r18 = AbstractC0295Gu.m625r(-55001351190581L);
                C0223F7 c0223f76 = new C0223F7(29);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r18)).m4870f(c0223f76);
                String strM625r19 = AbstractC0295Gu.m625r(-55873229551669L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG17 = new C1538iG(AbstractC1406fG.m2718r0(strM625r19));
                c1538iG17.m2921f(AbstractC0295Gu.m625r(-55546812037173L));
                c1538iG17.m2916a(new C0620Ob(7));
                break;
            case 4:
                String strM625r20 = AbstractC0295Gu.m625r(-40711994996789L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i11 = AbstractC1450gG.f5067a;
                C1538iG c1538iG18 = new C1538iG(AbstractC1406fG.m2718r0(strM625r20));
                c1538iG18.m2921f(AbstractC0295Gu.m625r(-40836549048373L));
                c1538iG18.m2916a(new C0620Ob(21));
                String strM625r21 = AbstractC0295Gu.m625r(-40922448394293L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG19 = new C1538iG(AbstractC1406fG.m2718r0(strM625r21));
                c1538iG19.m2921f(AbstractC0295Gu.m625r(-41596758259765L));
                c1538iG19.m2916a(new C0620Ob(22));
                LinkedHashMap linkedHashMap3 = AbstractC1257cG.f4258a;
                C1214bG c1214bG6 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-588938800527413L));
                Object obj6 = c1214bG6 != null ? c1214bG6.f4146a : null;
                Method method4 = obj6 instanceof Method ? (Method) obj6 : null;
                C0620Ob c0620Ob6 = new C0620Ob(18);
                AbstractC0295Gu.m625r(-577887849674805L);
                AbstractC0295Gu.m625r(-577917914445877L);
                new C1538iG(method4).m2916a(c0620Ob6);
                C1214bG c1214bG7 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-589037584775221L));
                Object obj7 = c1214bG7 != null ? c1214bG7.f4146a : null;
                Method method5 = obj7 instanceof Method ? (Method) obj7 : null;
                C0620Ob c0620Ob7 = new C0620Ob(19);
                AbstractC0295Gu.m625r(-577887849674805L);
                AbstractC0295Gu.m625r(-577917914445877L);
                new C1538iG(method5).m2916a(c0620Ob7);
                String strM625r22 = AbstractC0295Gu.m625r(-51389283694645L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG20 = new C1538iG(AbstractC1406fG.m2718r0(strM625r22));
                c1538iG20.m2921f(AbstractC0295Gu.m625r(-49860275337269L));
                c1538iG20.m2916a(new C0848Tp(12));
                C1214bG c1214bG8 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-818513392433205L));
                Object obj8 = c1214bG8 != null ? c1214bG8.f4146a : null;
                Method method6 = obj8 instanceof Method ? (Method) obj8 : null;
                C0848Tp c0848Tp = new C0848Tp(13);
                AbstractC0295Gu.m625r(-577887849674805L);
                AbstractC0295Gu.m625r(-577917914445877L);
                new C1538iG(method6).m2916a(c0848Tp);
                C1214bG c1214bG9 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-818058125899829L));
                Object obj9 = c1214bG9 != null ? c1214bG9.f4146a : null;
                Method method7 = obj9 instanceof Method ? (Method) obj9 : null;
                C0848Tp c0848Tp2 = new C0848Tp(i2);
                AbstractC0295Gu.m625r(-577819130198069L);
                AbstractC0295Gu.m625r(-577849194969141L);
                new C1538iG(method7).m2917b(c0848Tp2);
                String strM625r23 = AbstractC0295Gu.m625r(-49898930042933L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG21 = new C1538iG(AbstractC1406fG.m2718r0(strM625r23));
                c1538iG21.m2922g(View.class);
                c1538iG21.m2916a(new C0848Tp(i7));
                String strM625r24 = AbstractC0295Gu.m625r(-15101105010741L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG22 = new C1538iG(AbstractC1406fG.m2718r0(strM625r24));
                c1538iG22.m2922g(Bundle.class);
                c1538iG22.m2916a(new C0223F7(17));
                C1214bG c1214bG10 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-586915870930997L));
                Object obj10 = c1214bG10 != null ? c1214bG10.f4146a : null;
                C1538iG c1538iG23 = new C1538iG(obj10 instanceof Class ? (Class) obj10 : null);
                c1538iG23.m2922g(AbstractC0295Gu.m625r(-13692355737653L), View.class);
                c1538iG23.m2916a(new C0223F7(18));
                AbstractC0828TB.m1647p(AbstractC0295Gu.m625r(-13322988550197L), new C0223F7(19));
                C1214bG c1214bG11 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-587345367660597L));
                Object obj11 = c1214bG11 != null ? c1214bG11.f4146a : null;
                Method method8 = obj11 instanceof Method ? (Method) obj11 : null;
                C0223F7 c0223f77 = new C0223F7(20);
                AbstractC0295Gu.m625r(-577887849674805L);
                AbstractC0295Gu.m625r(-577917914445877L);
                new C1538iG(method8).m2916a(c0223f77);
                C1214bG c1214bG12 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-588019677526069L));
                Object obj12 = c1214bG12 != null ? c1214bG12.f4146a : null;
                Class cls2 = obj12 instanceof Class ? (Class) obj12 : null;
                C0223F7 c0223f78 = new C0223F7(21);
                AbstractC0295Gu.m625r(-579558591952949L);
                AbstractC0295Gu.m625r(-579588656724021L);
                AbstractC0295Gu.m625r(-579988088682549L);
                new C2428qs(11, cls2).m4870f(c0223f78);
                C1214bG c1214bG13 = (C1214bG) linkedHashMap3.get(AbstractC0295Gu.m625r(-588114166806581L));
                Object obj13 = c1214bG13 != null ? c1214bG13.f4146a : null;
                Class cls3 = obj13 instanceof Class ? (Class) obj13 : null;
                C0223F7 c0223f79 = new C0223F7(22);
                AbstractC0295Gu.m625r(-579558591952949L);
                AbstractC0295Gu.m625r(-579588656724021L);
                AbstractC0295Gu.m625r(-579988088682549L);
                new C2428qs(11, cls3).m4870f(c0223f79);
                String strM625r25 = AbstractC0295Gu.m625r(-65910568122421L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG24 = new C1538iG(AbstractC1406fG.m2718r0(strM625r25));
                c1538iG24.m2921f(AbstractC0295Gu.m625r(-65485366360117L));
                c1538iG24.m2916a(new C0620Ob(20));
                String strM625r26 = AbstractC0295Gu.m625r(-62938450753589L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG25 = new C1538iG(AbstractC1406fG.m2718r0(strM625r26));
                c1538iG25.m2921f(AbstractC0295Gu.m625r(-63668595193909L));
                c1538iG25.m2916a(new C0620Ob(17));
                String strM625r27 = AbstractC0295Gu.m625r(-41635412965429L);
                C0620Ob c0620Ob8 = new C0620Ob(16);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r27)).m4870f(c0620Ob8);
                break;
            case 5:
                String strM625r28 = AbstractC0295Gu.m625r(-515404665452597L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i12 = AbstractC1450gG.f5067a;
                C1538iG c1538iG26 = new C1538iG(AbstractC1406fG.m2718r0(strM625r28));
                c1538iG26.m2921f(AbstractC0295Gu.m625r(-515529219504181L));
                c1538iG26.m2916a(new C0620Ob(28));
                String strM625r29 = AbstractC0295Gu.m625r(-515567874209845L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG27 = new C1538iG(AbstractC1406fG.m2718r0(strM625r29));
                c1538iG27.m2921f(AbstractC0295Gu.m625r(-515142672447541L));
                c1538iG27.m2917b(new C0620Ob(29));
                try {
                    String strM625r30 = AbstractC0295Gu.m625r(-515202801989685L);
                    AbstractC0295Gu.m625r(-578300166535221L);
                    C1538iG c1538iG28 = new C1538iG(AbstractC1406fG.m2718r0(strM625r30));
                    c1538iG28.m2921f(AbstractC0295Gu.m625r(-515361715779637L));
                    c1538iG28.m2923h(Boolean.FALSE);
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 6:
                String strM625r31 = AbstractC0295Gu.m625r(-457426901923893L);
                C0848Tp c0848Tp3 = new C0848Tp(i6);
                AbstractC0295Gu.m625r(-579489872476213L);
                AbstractC0295Gu.m625r(-579519937247285L);
                AbstractC0295Gu.m625r(-579464102672437L);
                int i13 = AbstractC1450gG.f5067a;
                new C2428qs(11, AbstractC1406fG.m2718r0(strM625r31)).m4870f(c0848Tp3);
                break;
            case 7:
                LinkedHashMap linkedHashMap4 = AbstractC1257cG.f4258a;
                C1214bG c1214bG14 = (C1214bG) linkedHashMap4.get(AbstractC0295Gu.m625r(-586615223220277L));
                Object obj14 = c1214bG14 != null ? c1214bG14.f4146a : null;
                C1538iG c1538iG29 = new C1538iG(obj14 instanceof Class ? (Class) obj14 : null);
                c1538iG29.m2921f(AbstractC0295Gu.m625r(-474933188622389L));
                c1538iG29.m2917b(new C0848Tp(16));
                C1214bG c1214bG15 = (C1214bG) linkedHashMap4.get(AbstractC0295Gu.m625r(-586615223220277L));
                Object obj15 = c1214bG15 != null ? c1214bG15.f4146a : null;
                C1538iG c1538iG30 = new C1538iG(obj15 instanceof Class ? (Class) obj15 : null);
                c1538iG30.m2921f(AbstractC0295Gu.m625r(-474477922089013L));
                c1538iG30.m2917b(new C0848Tp(i3));
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                String strM625r32 = AbstractC0295Gu.m625r(-522328152733749L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i14 = AbstractC1450gG.f5067a;
                C1538iG c1538iG31 = new C1538iG(AbstractC1406fG.m2718r0(strM625r32));
                c1538iG31.m2921f(AbstractC0295Gu.m625r(-522530016196661L));
                c1538iG31.m2916a(new C0848Tp(i5));
                if (AbstractC1450gG.f5067a >= 2980) {
                    String strM625r33 = AbstractC0295Gu.m625r(-523139901552693L);
                    AbstractC0295Gu.m625r(-578300166535221L);
                    C1538iG c1538iG32 = new C1538iG(AbstractC1406fG.m2718r0(strM625r33));
                    c1538iG32.m2921f(AbstractC0295Gu.m625r(-522882203514933L));
                    c1538iG32.m2916a(new C0848Tp(i4));
                    C1214bG c1214bG16 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-585807769368629L));
                    Object obj16 = c1214bG16 != null ? c1214bG16.f4146a : null;
                    C1538iG c1538iG33 = new C1538iG(obj16 instanceof Class ? (Class) obj16 : null);
                    C0556Mx c0556Mx = new C0556Mx(0);
                    AbstractC0295Gu.m625r(-576599359486005L);
                    c1538iG33.f5425g = c0556Mx;
                    c1538iG33.m2916a(new C0556Mx(1));
                }
                break;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                String strM625r34 = AbstractC0295Gu.m625r(-470097055447093L);
                AbstractC0295Gu.m625r(-578300166535221L);
                int i15 = AbstractC1450gG.f5067a;
                C1538iG c1538iG34 = new C1538iG(AbstractC1406fG.m2718r0(strM625r34));
                c1538iG34.m2921f(AbstractC0295Gu.m625r(-470255969237045L));
                c1538iG34.m2917b(new C0556Mx(5));
                String strM625r35 = AbstractC0295Gu.m625r(-470294623942709L);
                AbstractC0295Gu.m625r(-578300166535221L);
                C1538iG c1538iG35 = new C1538iG(AbstractC1406fG.m2718r0(strM625r35));
                C0556Mx c0556Mx2 = new C0556Mx(6);
                AbstractC0295Gu.m625r(-576513460140085L);
                c1538iG35.f5424f = c0556Mx2;
                C0556Mx c0556Mx3 = new C0556Mx(7);
                AbstractC0295Gu.m625r(-578008108759093L);
                c1538iG35.f5422d = c0556Mx3;
                c1538iG35.m2917b(new C0556Mx(8));
                break;
            default:
                C1538iG c1538iG36 = new C1538iG(TextView.class);
                c1538iG36.m2921f(AbstractC0295Gu.m625r(-168371307935797L));
                c1538iG36.m2922g(cls);
                c1538iG36.m2917b(new C0556Mx(9));
                C1538iG c1538iG37 = new C1538iG(TextView.class);
                c1538iG37.m2921f(AbstractC0295Gu.m625r(-168427142510645L));
                c1538iG37.m2922g(ColorStateList.class);
                c1538iG37.m2917b(new C0556Mx(10));
                break;
        }
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        switch (this.f7471a) {
            case 0:
                return AbstractC0295Gu.m625r(-170033460279349L);
            case 1:
                return AbstractC0295Gu.m625r(-460618062624821L);
            case 2:
                return AbstractC0295Gu.m625r(-184589104445493L);
            case 3:
                return AbstractC0295Gu.m625r(-57616986273845L);
            case 4:
                return AbstractC0295Gu.m625r(-65863323482165L);
            case 5:
                return AbstractC0295Gu.m625r(-514790485129269L);
            case 6:
                return AbstractC0295Gu.m625r(-457907938261045L);
            case 7:
                return AbstractC0295Gu.m625r(-474864469145653L);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return AbstractC0295Gu.m625r(-522792009201717L);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return AbstractC0295Gu.m625r(-470049810806837L);
            default:
                return AbstractC0295Gu.m625r(-168298293491765L);
        }
    }
}
