package yyds;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛳᛱᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0514 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2467;

    /* JADX WARN: Removed duplicated region for block: B:124:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04c3 A[SYNTHETIC] */
    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo371(Object obj) throws IllegalAccessException {
        String str;
        long j;
        Boolean bool;
        Boolean bool2;
        C2014 c2014M1327;
        Boolean bool3;
        String str2;
        Object objM1372;
        Object objM3276;
        int i = this.f2467;
        long j2 = -872178581668718L;
        Bundle bundle = null;
        C2746 c2746 = C2746.f13459;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-849471089574766L);
                Method[] methods = ((Class) obj).getMethods();
                AbstractC2328.m4341(-849483974476654L);
                return AbstractC2070.m3935(methods);
            case 1:
                Method method = (Method) obj;
                return Boolean.valueOf(AbstractC1544.m3188(method.getReturnType(), Boolean.TYPE) && Arrays.equals(method.getParameterTypes(), new Class[]{MotionEvent.class}));
            case 2:
                AbstractC2328.m4341(-848869794153326L);
                Object obj2 = ((C0488) obj).f2405;
                if (obj2 != null) {
                    C1664.f8513.getClass();
                    C1664.m3390(obj2);
                }
                return c2746;
            case 3:
                C0213 c0213 = (C0213) obj;
                AbstractC2328.m4341(-849148967027566L);
                c0213.m871(new C0514(5));
                c0213.m870(new C0514(6));
                return c2746;
            case 4:
                AbstractC2328.m4341(-849196211667822L);
                Object obj3 = ((C0488) obj).f2405;
                if (obj3 != null) {
                    C1664.f8513.getClass();
                    C1664.m3403(obj3, true);
                }
                return c2746;
            case 5:
                AbstractC2328.m4341(-849041592845166L);
                if (AbstractC1595.m3281(((C1829) obj).f9185) == null && C1664.f8487) {
                    C1664.m3387(C1664.f8513, null, 2);
                }
                return c2746;
            case 6:
                AbstractC2328.m4341(-849097427420014L);
                Object obj4 = ((C0488) obj).f2405;
                if (obj4 != null) {
                    C1664.f8513.getClass();
                    C1664.m3403(obj4, false);
                }
                return c2746;
            case 7:
                C1829 c1829 = (C1829) obj;
                AbstractC2328.m4341(-878977514898286L);
                C1509.f7142.getClass();
                if (C1509.m3058()) {
                    C2336 c2336 = C2336.f11496;
                    StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-879050529342318L));
                    Object obj5 = c1829.f9184;
                    sb.append(obj5 != null ? obj5.getClass().getName() : null);
                    c2336.m4359(sb.toString());
                    C2701.f13261.getClass();
                    C2701.m4811(c1829);
                }
                return c2746;
            case 8:
                C1829 c18292 = (C1829) obj;
                AbstractC2328.m4341(-879175083393902L);
                C1509.f7142.getClass();
                if (C1509.m3058()) {
                    C0056 c0056 = C0056.f570;
                    Object objM3281 = AbstractC1595.m3281(c18292.f9185);
                    c0056.getClass();
                    if (objM3281 == null) {
                        str = null;
                        if (AbstractC1544.m3188(str, AbstractC2328.m4341(-879248097837934L))) {
                            C2336 c23362 = C2336.f11496;
                            StringBuilder sb2 = new StringBuilder(AbstractC2328.m4341(-879269572674414L));
                            Object obj6 = c18292.f9184;
                            sb2.append(obj6 != null ? obj6.getClass().getName() : null);
                            c23362.m4359(sb2.toString());
                            C2701.f13261.getClass();
                            C2701.m4811(c18292);
                        }
                    } else {
                        for (Class<?> superclass = objM3281.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                            Field[] declaredFields = superclass.getDeclaredFields();
                            AbstractC2328.m4341(-873978172965742L);
                            ArrayList<Field> arrayList = new ArrayList();
                            for (Field field : declaredFields) {
                                if (AbstractC1544.m3188(field.getType(), String.class)) {
                                    arrayList.add(field);
                                }
                            }
                            for (Field field2 : arrayList) {
                                field2.setAccessible(true);
                                Object obj7 = field2.get(objM3281);
                                str = obj7 instanceof String ? (String) obj7 : null;
                                if (AbstractC1595.m3286(C0056.f569, str)) {
                                    if (AbstractC1544.m3188(str, AbstractC2328.m4341(-879248097837934L))) {
                                    }
                                }
                            }
                        }
                        str = null;
                        if (AbstractC1544.m3188(str, AbstractC2328.m4341(-879248097837934L))) {
                        }
                    }
                }
                return c2746;
            case 9:
                AbstractC2328.m4341(-880231645348718L);
                C2336.f11496.m4354(AbstractC2328.m4341(-880283184956270L));
                return c2746;
            case 10:
                C1829 c18293 = (C1829) obj;
                AbstractC2328.m4341(-879411306595182L);
                C1509.f7142.getClass();
                if (C1509.m3058()) {
                    Object objM32762 = AbstractC1595.m3276(2, c18293.f9185);
                    String strM4341 = AbstractC2328.m4341(-879467141170030L);
                    Object[] objArr = new Object[0];
                    if (objM32762 != null) {
                        try {
                            int i2 = AbstractC2293.f11258;
                            C2014 c2014M13272 = AbstractC0476.m1327(objM32762);
                            ((C0903) c2014M13272.f10074).f4118 = 2;
                            C1189 c1189M3892 = c2014M13272.m3892();
                            c1189M3892.m4478();
                            c1189M3892.f12003 = strM4341;
                            AbstractC2328.m4341(-872178581668718L);
                            C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                            if (c0536 != null) {
                                c0536.m1372(Arrays.copyOf(objArr, 0));
                            }
                        } catch (Exception e) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-879505795875694L), e);
                        }
                    }
                    C2336.f11496.m4359(AbstractC2328.m4341(-879578810319726L));
                    C2701.f13261.getClass();
                    C2701.m4811(c18293);
                    break;
                }
                return c2746;
            case 11:
                C0488 c0488 = (C0488) obj;
                AbstractC2328.m4341(-879733429142382L);
                C1509.f7142.getClass();
                if (C1509.m3058()) {
                    Object obj8 = c0488.f2407;
                    List list = obj8 instanceof List ? (List) obj8 : null;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj9 : list) {
                            if (obj9 != null) {
                                C0056.f570.getClass();
                                String strM43412 = AbstractC2328.m4341(-874076957213550L);
                                Object[] objArr2 = new Object[0];
                                try {
                                    int i3 = AbstractC2293.f11258;
                                    C2014 c2014M13273 = AbstractC0476.m1327(obj9);
                                    ((C0903) c2014M13273.f10074).f4118 = 2;
                                    C1189 c1189M38922 = c2014M13273.m3892();
                                    c1189M38922.m4478();
                                    c1189M38922.f12003 = strM43412;
                                    AbstractC2328.m4341(j2);
                                    C0536 c05362 = (C0536) AbstractC1595.m3281(c1189M38922.mo736());
                                    Object objM13722 = c05362 != null ? c05362.m1372(Arrays.copyOf(objArr2, 0)) : null;
                                    if (!(objM13722 instanceof Boolean)) {
                                        objM13722 = null;
                                    }
                                    bool = (Boolean) objM13722;
                                } catch (Exception e2) {
                                    C2336.f11496.m4355(AbstractC2328.m4341(-874184331395950L), e2);
                                    bool = null;
                                }
                                if (AbstractC1544.m3188(bool, Boolean.TRUE)) {
                                    j = j2;
                                } else {
                                    C2701 c2701 = C2701.f13261;
                                    String strM43413 = AbstractC2328.m4341(-874257345839982L);
                                    c2701.getClass();
                                    if (C2701.m4794(obj9, strM43413) == null && C2701.m4794(obj9, AbstractC2328.m4341(-874287410611054L)) == null) {
                                        String str3 = (String) C2701.m4794(obj9, AbstractC2328.m4341(-874343245185902L));
                                        String string = str3 != null ? AbstractC0473.m1314(str3).toString() : null;
                                        if (string == null || string.length() == 0 || string.equals(AbstractC2328.m4341(-874390489826158L)) || string.equals(AbstractC2328.m4341(-874403374728046L)) || string.equals(AbstractC2328.m4341(-874416259629934L))) {
                                            Object objM4794 = C2701.m4794(obj9, AbstractC2328.m4341(-874437734466414L));
                                            String strM43414 = AbstractC2328.m4341(-874463504270190L);
                                            Object[] objArr3 = new Object[0];
                                            if (objM4794 != null) {
                                                try {
                                                    int i4 = AbstractC2293.f11258;
                                                    c2014M1327 = AbstractC0476.m1327(objM4794);
                                                    j = j2;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    j = j2;
                                                }
                                                try {
                                                    ((C0903) c2014M1327.f10074).f4118 = 2;
                                                    C1189 c1189M38923 = c2014M1327.m3892();
                                                    c1189M38923.m4478();
                                                    c1189M38923.f12003 = strM43414;
                                                    AbstractC2328.m4341(j);
                                                    C0536 c05363 = (C0536) AbstractC1595.m3281(c1189M38923.mo736());
                                                    objM1372 = c05363 != null ? c05363.m1372(Arrays.copyOf(objArr3, 0)) : null;
                                                    if (!(objM1372 instanceof Boolean)) {
                                                        objM1372 = null;
                                                    }
                                                    bool2 = (Boolean) objM1372;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    C2336.f11496.m4355(AbstractC2328.m4341(-874489274073966L), e);
                                                    bool2 = null;
                                                }
                                                if (AbstractC1544.m3188(bool2, Boolean.TRUE)) {
                                                    String strM43415 = AbstractC2328.m4341(-874562288517998L);
                                                    Object[] objArr4 = new Object[0];
                                                    if (objM4794 != null) {
                                                        try {
                                                            int i5 = AbstractC2293.f11258;
                                                            C2014 c2014M13274 = AbstractC0476.m1327(objM4794);
                                                            ((C0903) c2014M13274.f10074).f4118 = 2;
                                                            C1189 c1189M38924 = c2014M13274.m3892();
                                                            c1189M38924.m4478();
                                                            c1189M38924.f12003 = strM43415;
                                                            AbstractC2328.m4341(j);
                                                            C0536 c05364 = (C0536) AbstractC1595.m3281(c1189M38924.mo736());
                                                            Object objM13723 = c05364 != null ? c05364.m1372(Arrays.copyOf(objArr4, 0)) : null;
                                                            if (!(objM13723 instanceof Boolean)) {
                                                                objM13723 = null;
                                                            }
                                                            bool3 = (Boolean) objM13723;
                                                        } catch (Exception e5) {
                                                            C2336.f11496.m4355(AbstractC2328.m4341(-874583763354478L), e5);
                                                            bool3 = null;
                                                        }
                                                        if (!AbstractC1544.m3188(bool3, Boolean.TRUE)) {
                                                            C2701 c27012 = C2701.f13261;
                                                            String strM43416 = AbstractC2328.m4341(-874656777798510L);
                                                            c27012.getClass();
                                                            Object objM47942 = C2701.m4794(obj9, strM43416);
                                                            if (objM47942 != null && (C2701.m4794(objM47942, AbstractC2328.m4341(-874712612373358L)) != null || C2701.m4794(objM47942, AbstractC2328.m4341(-874819986555758L)) != null || C2701.m4794(objM47942, AbstractC2328.m4341(-874871526163310L)) != null || ((str2 = (String) C2701.m4794(objM47942, AbstractC2328.m4341(-874940245640046L))) != null && AbstractC0473.m1301(str2, AbstractC2328.m4341(-874974605378414L), false)))) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                j = j2;
                                            }
                                            if (!(objM1372 instanceof Boolean)) {
                                            }
                                            bool2 = (Boolean) objM1372;
                                            if (AbstractC1544.m3188(bool2, Boolean.TRUE)) {
                                            }
                                        }
                                    }
                                }
                                j2 = j;
                            } else {
                                j = j2;
                            }
                            arrayList2.add(obj9);
                            j2 = j;
                        }
                        if (arrayList2.size() != list.size()) {
                            for (Object obj10 : AbstractC1595.m3260(arrayList2)) {
                                C2701 c27013 = C2701.f13261;
                                String strM43417 = AbstractC2328.m4341(-879784968749934L);
                                Integer numValueOf = Integer.valueOf(arrayList2.size());
                                c27013.getClass();
                                C2701.m4797(obj10, strM43417, numValueOf);
                            }
                            C2336.f11496.m4359(AbstractC2328.m4341(-879853688226670L) + (list.size() - arrayList2.size()));
                            c0488.f2407 = new ArrayList(arrayList2);
                        }
                    }
                }
                return c2746;
            case 12:
                throw new C0869();
            case 13:
                AbstractC2328.m4341(-543347295552366L);
                return Boolean.valueOf(((String) obj).startsWith(AbstractC2328.m4341(-543360180454254L)));
            case 14:
                return ((InterfaceC1240) obj).iterator();
            case 15:
                return obj;
            case 16:
                return Boolean.valueOf(obj == null);
            case 17:
                return ((EnumC0868) obj).f3984;
            case 18:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                C1509.f7142.getClass();
                C1509.f25.m1581(C1509.f7179[56], bool4);
                AbstractC1960.m3789(AbstractC2328.m4341(-232752440574830L));
                return c2746;
            case 19:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                C1509.f7142.getClass();
                C1509.f7235.m1581(C1509.f7179[57], bool5);
                AbstractC1960.m3789(AbstractC2328.m4341(-232773915411310L));
                return c2746;
            case 20:
                ((Boolean) obj).getClass();
                C1509.f7142.getClass();
                AbstractC1655.f8454 = C1509.m3126();
                return c2746;
            case 21:
                ((Boolean) obj).getClass();
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity != null) {
                    Map map = AbstractC1294.f5940;
                    C1509.f7142.getClass();
                    AbstractC1294.m2564(topActivity, C1509.m3068());
                    AbstractC1294.m2566(topActivity, C1509.m3092() && C1985.f9936, C1509.m3089());
                }
                return c2746;
            case 22:
                ((Boolean) obj).getClass();
                C0154.f959.getClass();
                C2307 c2307 = new C2307(20);
                if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
                    c2307.mo731();
                } else {
                    C0154.f957.post(new RunnableC0309(9, c2307));
                }
                return c2746;
            case 23:
                ((Boolean) obj).getClass();
                Activity topActivity2 = ActivityStack.getTopActivity();
                if (topActivity2 != null) {
                    Map map2 = AbstractC1294.f5940;
                    C1509.f7142.getClass();
                    AbstractC1294.m2564(topActivity2, C1509.m3068());
                    AbstractC1294.m2566(topActivity2, C1509.m3092() && C1985.f9936, C1509.m3089());
                }
                return c2746;
            case 24:
                ((Boolean) obj).getClass();
                Activity topActivity3 = ActivityStack.getTopActivity();
                if (topActivity3 != null) {
                    Map map3 = AbstractC1294.f5940;
                    C1509.f7142.getClass();
                    AbstractC1294.m2564(topActivity3, C1509.m3068());
                    AbstractC1294.m2566(topActivity3, C1509.m3092() && C1985.f9936, C1509.m3089());
                }
                return c2746;
            case 25:
                AbstractC2328.m4341(-577835882939246L);
                return ((C1672) obj).f8529;
            case 26:
                AbstractC2328.m4341(-577848767841134L);
                return ((C1672) obj).f8529;
            case 27:
                C1829 c18294 = (C1829) obj;
                AbstractC2328.m4341(-968566237725550L);
                C1509.f7142.getClass();
                if (((Boolean) C1509.f7246.m1579(C1509.f7179[128])).booleanValue() && (objM3276 = AbstractC1595.m3276(2, c18294.f9185)) != null) {
                    C2615.f12860.getClass();
                    if (C2615.m4717(objM3276) != null) {
                        String strM43418 = AbstractC2328.m4341(-968639252169582L);
                        Object[] objArr5 = new Object[0];
                        try {
                            int i6 = AbstractC2293.f11258;
                            C2014 c2014M13275 = AbstractC0476.m1327(objM3276);
                            ((C0903) c2014M13275.f10074).f4118 = 2;
                            C1189 c1189M38925 = c2014M13275.m3892();
                            c1189M38925.m4478();
                            c1189M38925.f12003 = strM43418;
                            AbstractC2328.m4341(-968415913870190L);
                            c1189M38925.m2393();
                            c1189M38925.f5455 = AbstractC2328.m4341(-968488928314222L);
                            C0536 c05365 = (C0536) AbstractC1595.m3281(c1189M38925.mo736());
                            Object objM13724 = c05365 != null ? c05365.m1372(Arrays.copyOf(objArr5, 0)) : null;
                            if (!(objM13724 instanceof Bundle)) {
                                objM13724 = null;
                            }
                            bundle = (Bundle) objM13724;
                        } catch (Exception e6) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-968682201842542L), e6);
                        }
                        if (bundle != null) {
                            bundle.putBoolean(AbstractC2328.m4341(-968755216286574L), true);
                        }
                    }
                }
                return c2746;
            case 28:
                AbstractC2328.m4341(-969077338833774L);
                ((C0213) obj).m870(new C1844(2));
                return c2746;
            default:
                AbstractC2328.m4341(-969124583474030L);
                return Boolean.valueOf(((Class) obj).getSuperclass().getName().equals(AbstractC2328.m4341(-969137468375918L)));
        }
    }

    public /* synthetic */ C0514(int i) {
        this.f2467 = i;
    }
}
