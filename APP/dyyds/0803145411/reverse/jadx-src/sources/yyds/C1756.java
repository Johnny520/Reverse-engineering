package yyds;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛸᛴᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1756 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8828;

    public /* synthetic */ C1756(int i) {
        this.f8828 = i;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final Object m3490(Object obj) {
        EnumC0868 enumC0868 = (EnumC0868) obj;
        AbstractC2328.m4341(-997789195207534L);
        if (enumC0868 == EnumC0868.f3981) {
            C0615.f2981.getClass();
            ArrayList<ViewGroup> arrayList = new ArrayList();
            Map map = C0615.f2980;
            AbstractC2328.m4341(-997419828020078L);
            synchronized (map) {
                arrayList.addAll(map.keySet());
            }
            for (ViewGroup viewGroup : arrayList) {
                viewGroup.post(new RunnableC2682(viewGroup, 3));
            }
        }
        return C2746.f13459;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0436 A[EXC_TOP_SPLITTER, PHI: r2
  0x0436: PHI (r2v29 java.lang.reflect.Method) = (r2v28 java.lang.reflect.Method), (r2v34 java.lang.reflect.Method) binds: [B:193:0x0407, B:202:0x0432] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo371(Object obj) {
        boolean z;
        boolean z2;
        Object c2658;
        Object objM3281;
        Object objM32812;
        int i;
        Object next;
        Object obj2;
        C1111 c1111;
        C1111 c11112;
        Drawable drawable;
        Object c26582;
        EnumC2097 enumC2097 = null;
        int i2 = 0;
        z = false;
        boolean z3 = false;
        switch (this.f8828) {
            case 0:
                Method method = (Method) obj;
                AbstractC2328.m4341(-1009170858541934L);
                if (AbstractC1544.m3188(method.getName(), AbstractC2328.m4341(-1009183743443822L))) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Class cls = Integer.TYPE;
                    z = Arrays.equals(parameterTypes, new Class[]{cls, cls}) && AbstractC1544.m3188(method.getReturnType(), Void.TYPE);
                }
                return Boolean.valueOf(z);
            case 1:
                Method method2 = (Method) obj;
                AbstractC2328.m4341(-1010218830562158L);
                if (AbstractC1544.m3188(method2.getName(), AbstractC2328.m4341(-1010248895333230L))) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    Class cls2 = Integer.TYPE;
                    z2 = Arrays.equals(parameterTypes2, new Class[]{cls2, cls2}) && AbstractC1544.m3188(method2.getReturnType(), Void.TYPE);
                }
                return Boolean.valueOf(z2);
            case 2:
                AbstractC2328.m4341(-1008170131161966L);
                C1784.f9011.getClass();
                int iOrdinal = ((EnumC0868) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    enumC2097 = EnumC2097.f10386;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    enumC2097 = EnumC2097.f10387;
                }
                if (enumC2097 != null && C1784.f9012.add(enumC2097)) {
                    C1784.f8999.post(new RunnableC0309(6, enumC2097));
                }
                return C2746.f13459;
            case 3:
                AbstractC2328.m4341(-1008371994624878L);
                return ((Class) obj).getSuperclass();
            case 4:
                Method method3 = (Method) obj;
                AbstractC2328.m4341(-1008994764882798L);
                return Boolean.valueOf(AbstractC1544.m3188(method3.getName(), AbstractC2328.m4341(-1009007649784686L)) && Arrays.equals(method3.getParameterTypes(), new Class[]{Boolean.TYPE}) && AbstractC1544.m3188(method3.getReturnType(), Void.TYPE));
            case 5:
                C0488 c0488 = (C0488) obj;
                C2746 c2746 = C2746.f13459;
                AbstractC2328.m4341(-1009059189392238L);
                Object obj3 = c0488.f2405;
                View view = obj3 instanceof View ? (View) obj3 : null;
                if (view != null) {
                    Object objM32813 = AbstractC1595.m3281(c0488.f2406);
                    Boolean bool = objM32813 instanceof Boolean ? (Boolean) objM32813 : null;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        C1784.f9011.getClass();
                        C1628 c1628M3555 = C1784.m3555(view);
                        if (c1628M3555 != null) {
                            C2535 c2535M3329 = c1628M3555.m3329();
                            EnumC1796 enumC1796 = EnumC1796.f9064;
                            c2535M3329.getClass();
                            AbstractC2328.m4341(-999580196569966L);
                            c2535M3329.f12485 = enumC1796;
                            C1784.m3562(c1628M3555, zBooleanValue, true, true, false);
                        }
                    }
                }
                return c2746;
            case 6:
                EnumC0868 enumC0868 = (EnumC0868) obj;
                C2746 c27462 = C2746.f13459;
                AbstractC2328.m4341(-820449995555694L);
                try {
                    C2153.f10615.getClass();
                    C2153.m4111(enumC0868);
                    c2658 = c27462;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-820471470392174L) + enumC0868, thM4249);
                }
                return c27462;
            case 7:
                AbstractC2328.m4341(-820729168429934L);
                return ((Class) obj).getSuperclass();
            case 8:
                AbstractC2328.m4341(-831866018628462L);
                return Boolean.valueOf(ViewGroup.class.isAssignableFrom(((Field) obj).getType()));
            case 9:
                AbstractC2328.m4341(-832252565685102L);
                return ((Class) obj).getSuperclass();
            case 10:
                AbstractC2328.m4341(-832265450586990L);
                Field[] declaredFields = ((Class) obj).getDeclaredFields();
                AbstractC2328.m4341(-832278335488878L);
                return AbstractC2070.m3935(declaredFields);
            case 11:
                AbstractC2328.m4341(-832377119736686L);
                return ((C0873) obj).f3991;
            case 12:
                AbstractC2328.m4341(-832239680783214L);
                return ((Class) obj).getSuperclass();
            case 13:
                C1829 c1829 = (C1829) obj;
                C2746 c27463 = C2746.f13459;
                AbstractC2328.m4341(-831247543337838L);
                Object obj4 = c1829.f9184;
                if (obj4 != null) {
                    C0142.f880.getClass();
                    int iM657 = C0142.m657();
                    C0142.m653(obj4).f12326 = false;
                    C0142.f865.remove();
                    C0142.f873.remove();
                    if (iM657 != 0) {
                        c1829.m3587(null);
                    }
                }
                return c27463;
            case 14:
                C1829 c18292 = (C1829) obj;
                C2746 c27464 = C2746.f13459;
                AbstractC2328.m4341(-831423636996974L);
                Object obj5 = c18292.f9184;
                if (obj5 != null && (objM3281 = AbstractC1595.m3281(c18292.f9185)) != null) {
                    C0142.f880.getClass();
                    C2503 c2503M653 = C0142.m653(obj5);
                    boolean z4 = c2503M653.f12326;
                    c2503M653.f12324++;
                    c2503M653.f12328 = new WeakReference(objM3281);
                    C0142.m660(c2503M653);
                    c2503M653.f12326 = false;
                    if (z4 || C0142.m657() != 0) {
                        C0142.m648(obj5);
                    }
                }
                return c27464;
            case 15:
                C0488 c04882 = (C0488) obj;
                C2746 c27465 = C2746.f13459;
                AbstractC2328.m4341(-831470881637230L);
                C0142.f865.remove();
                C0142.f873.remove();
                Object obj6 = c04882.f2405;
                if (obj6 != null && (objM32812 = AbstractC1595.m3281(c04882.f2406)) != null) {
                    C0142.f880.getClass();
                    C2503 c2503M6532 = C0142.m653(obj6);
                    c2503M6532.f12328 = new WeakReference(objM32812);
                    ImageView imageViewM646 = C0142.m646(obj6);
                    if (imageViewM646 != null) {
                        c2503M6532.f12323 = new WeakReference(imageViewM646);
                    }
                    if (C0142.m657() == 0) {
                        c2503M6532.f12329 = false;
                    } else {
                        int iM6572 = C0142.m657();
                        if ((iM6572 == 3 || iM6572 == 4) && c2503M6532.f12326) {
                            c2503M6532.f12329 = false;
                        } else {
                            C0142.m648(obj6);
                            if (imageViewM646 != null) {
                                if (C0142.m637(objM32812, AbstractC2328.m4341(-828846656619374L))) {
                                    i = 0;
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    for (Class<?> superclass = objM32812.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                                        Method[] declaredMethods = superclass.getDeclaredMethods();
                                        AbstractC2328.m4341(-829027045245806L);
                                        ArrayList arrayList2 = new ArrayList();
                                        int length = declaredMethods.length;
                                        int i3 = i2;
                                        while (i3 < length) {
                                            int i4 = i2;
                                            Method method4 = declaredMethods[i3];
                                            if (method4.getParameterCount() == 0 && AbstractC2328.m4341(-829130124460910L).equals(method4.getReturnType().getName())) {
                                                arrayList2.add(method4);
                                            }
                                            i3++;
                                            i2 = i4;
                                        }
                                        AbstractC1432.m2928(arrayList2, arrayList);
                                    }
                                    i = i2;
                                    Method method5 = (Method) AbstractC1595.m3275(arrayList);
                                    if (method5 == null) {
                                        Iterator it = arrayList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                next = it.next();
                                                if (AbstractC1544.m3188(((Method) next).getName(), AbstractC2328.m4341(-829310513087342L))) {
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        method5 = (Method) next;
                                        if (method5 == null) {
                                            objM32812 = null;
                                        } else {
                                            try {
                                                method5.setAccessible(true);
                                                objM32812 = method5.invoke(objM32812, null);
                                            } catch (Throwable th2) {
                                                objM32812 = new C2658(th2);
                                            }
                                            if (objM32812 instanceof C2658) {
                                            }
                                        }
                                        break;
                                    }
                                }
                                Object objM641 = C0142.m641(objM32812, AbstractC2328.m4341(-828726397535086L));
                                String strM4341 = objM641 instanceof String ? (String) objM641 : null;
                                if (strM4341 == null) {
                                    strM4341 = AbstractC2328.m4341(-828765052240750L);
                                }
                                String str = strM4341;
                                long j = c2503M6532.f12324;
                                AbstractC2328.m4341(-910472510079854L);
                                c2503M6532.f12325 = str;
                                c2503M6532.f12329 = true;
                                C0142.m658(imageViewM646);
                                int iM6573 = C0142.m657();
                                if (iM6573 == 1) {
                                    C0142.m3(imageViewM646, C0142.m634());
                                } else if (iM6573 == 2) {
                                    Set set = AbstractC0133.f831;
                                    C2578 c2578M579 = AbstractC0133.m579(C0142.m643(objM32812));
                                    if (c2578M579.isEmpty()) {
                                        C0142.m3(imageViewM646, -16777216);
                                    } else {
                                        C0142.m633(c2503M6532, imageViewM646, c2578M579, str, j, 2);
                                    }
                                } else if (iM6573 == 3) {
                                    Set set2 = AbstractC0133.f831;
                                    C2578 c2578M5792 = AbstractC0133.m579(C0142.m643(objM32812));
                                    if (c2578M5792.isEmpty()) {
                                        C0142.m3(imageViewM646, -16777216);
                                    } else {
                                        C0142.m656(c2503M6532, imageViewM646, c2578M5792, str, j);
                                    }
                                } else if (iM6573 == 4) {
                                    Object objM6412 = C0142.m641(objM32812, AbstractC2328.m4341(-829486606746478L));
                                    List listM635 = C0142.m635(C0142.m641(objM6412, AbstractC2328.m4341(-829512376550254L)));
                                    List listM6352 = C0142.m635(C0142.m641(objM6412, AbstractC2328.m4341(-829576801059694L)));
                                    List listM6353 = C0142.m635(C0142.m641(objM6412, AbstractC2328.m4341(-829624045699950L)));
                                    List[] listArr = new List[3];
                                    listArr[i] = listM635;
                                    listArr[1] = listM6352;
                                    listArr[2] = listM6353;
                                    List listM4854 = AbstractC2725.m4854(listArr);
                                    Set set3 = AbstractC0133.f831;
                                    C2578 c2578M580 = AbstractC0133.m580(listM4854, C0142.m643(objM32812));
                                    if (c2578M580.isEmpty()) {
                                        C0142.m3(imageViewM646, -16777216);
                                    } else {
                                        C0142.m633(c2503M6532, imageViewM646, c2578M580, str, j, 4);
                                    }
                                } else if (iM6573 == 5) {
                                    C1082 c1082 = C1082.f4981;
                                    Resources resources = imageViewM646.getResources();
                                    AbstractC2328.m4341(-828769347208046L);
                                    Drawable drawableM2286 = C1082.m2286(resources);
                                    if (drawableM2286 == null) {
                                        C0142.m3(imageViewM646, -16777216);
                                    } else {
                                        C0142.m650(c2503M6532, imageViewM646, drawableM2286, j);
                                    }
                                }
                            }
                        }
                    }
                }
                return c27465;
            case 16:
                C2746 c27466 = C2746.f13459;
                C1829 c18293 = (C1829) obj;
                AbstractC2328.m4341(-1013976926946158L);
                if (!AbstractC1544.m3188(C0154.f956.get(), Boolean.TRUE) && (obj2 = c18293.f9184) != null) {
                    Object objM3276 = AbstractC1595.m3276(1, c18293.f9185);
                    String str2 = objM3276 instanceof String ? (String) objM3276 : null;
                    if (str2 != null && str2.equals(AbstractC2328.m4341(-1014049941390190L))) {
                        Object objM32762 = AbstractC1595.m3276(2, c18293.f9185);
                        Number number = objM32762 instanceof Number ? (Number) objM32762 : null;
                        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
                        WeakHashMap weakHashMap = C0154.f955;
                        synchronized (weakHashMap) {
                            try {
                                C0272 c0272 = (C0272) weakHashMap.get(obj2);
                                if (c0272 != null) {
                                    if (numValueOf == null) {
                                        weakHashMap.remove(obj2);
                                    } else if (numValueOf.intValue() == c0272.f1477) {
                                        weakHashMap.remove(obj2);
                                    }
                                    break;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
                return c27466;
            case 17:
                C2746 c27467 = C2746.f13459;
                AbstractC2328.m4341(-997651756254062L);
                Object obj7 = ((C0488) obj).f2405;
                ViewGroup viewGroup = obj7 instanceof ViewGroup ? (ViewGroup) obj7 : null;
                if (viewGroup != null) {
                    C0615.f2981.getClass();
                    Map map = C0615.f2980;
                    AbstractC2328.m4341(-997303863903086L);
                    synchronized (map) {
                        c1111 = (C1111) map.get(viewGroup);
                    }
                    if (c1111 != null) {
                        C0615.m1509(viewGroup);
                    } else {
                        ArrayList arrayList3 = new ArrayList(viewGroup.getChildCount());
                        int childCount = viewGroup.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = viewGroup.getChildAt(i5);
                            arrayList3.add(new C1471(new WeakReference(childAt), childAt.getAlpha()));
                        }
                        Map map2 = C0615.f2980;
                        AbstractC2328.m4341(-997342518608750L);
                        synchronized (map2) {
                            AbstractC2328.m4341(-997381173314414L);
                            map2.put(viewGroup, new C1111(arrayList3));
                        }
                        viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0605(2));
                        C0615.m1509(viewGroup);
                    }
                }
                return c27467;
            case 18:
                C2746 c27468 = C2746.f13459;
                C0488 c04883 = (C0488) obj;
                AbstractC2328.m4341(-997720475730798L);
                Object obj8 = c04883.f2405;
                ViewGroup viewGroup2 = obj8 instanceof ViewGroup ? (ViewGroup) obj8 : null;
                if (viewGroup2 != null) {
                    Object objM32814 = AbstractC1595.m3281(c04883.f2406);
                    Number number2 = objM32814 instanceof Number ? (Number) objM32814 : null;
                    if (number2 != null) {
                        float fFloatValue = number2.floatValue();
                        C0615.f2981.getClass();
                        Map map3 = C0615.f2980;
                        AbstractC2328.m4341(-997574446842734L);
                        synchronized (map3) {
                            c11112 = (C1111) map3.get(viewGroup2);
                        }
                        if (c11112 != null) {
                            Float fValueOf = Math.abs(fFloatValue) <= Float.MAX_VALUE ? Float.valueOf(fFloatValue) : null;
                            c11112.f5121 = fValueOf != null ? AbstractC0598.m1483(fValueOf.floatValue(), 0.0f, 1.0f) : 1.0f;
                            WeakReference weakReference = c11112.f5122;
                            if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
                                drawable.setAlpha(AbstractC0598.m1487(AbstractC0181.m748(c11112.f5121 * 255.0f), 0, 255));
                                viewGroup2.invalidate();
                            }
                        }
                    }
                }
                return c27468;
            case 19:
                return m3490(obj);
            case 20:
                AbstractC2328.m4341(-581336281285486L);
                return ((Class) obj).getSuperclass();
            case 21:
                Class cls3 = (Class) obj;
                AbstractC2328.m4341(-581349166187374L);
                try {
                    Field[] declaredFields2 = cls3.getDeclaredFields();
                    AbstractC2328.m4341(-581370641023854L);
                    c26582 = AbstractC2070.m3935(declaredFields2);
                    break;
                } catch (Throwable th4) {
                    c26582 = new C2658(th4);
                }
                C1041 c1041 = C1041.f4739;
                boolean z5 = c26582 instanceof C2658;
                Object obj9 = c26582;
                if (z5) {
                    obj9 = c1041;
                }
                return (InterfaceC1240) obj9;
            case 22:
                Field field = (Field) obj;
                if (AbstractC1544.m3188(field.getType(), String.class) && !Modifier.isStatic(field.getModifiers())) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 23:
                C0488 c04884 = (C0488) obj;
                C2746 c27469 = C2746.f13459;
                AbstractC2328.m4341(-1044252151415662L);
                C1509.f7142.getClass();
                List listM1296 = AbstractC0473.m1296((String) C1509.f7284.m1579(C1509.f7179[1]), new String[]{AbstractC2328.m4341(-1044320870892398L)}, 6);
                HashSet hashSet = new HashSet();
                for (Object obj10 : listM1296) {
                    if (!AbstractC0473.m1313((String) obj10)) {
                        hashSet.add(obj10);
                    }
                }
                Object obj11 = c04884.f2407;
                List list = obj11 instanceof List ? (List) obj11 : null;
                if (list != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!AbstractC1595.m3286(hashSet, C1677.f8554.m3424(next2 != null ? next2.toString() : null))) {
                            arrayList4.add(next2);
                        }
                    }
                    c04884.f2407 = arrayList4;
                }
                return c27469;
            case 24:
                Integer num = (Integer) obj;
                num.getClass();
                C1509.f7142.getClass();
                C1509.f7251.m1581(C1509.f7179[30], num);
                return C2746.f13459;
            case 25:
                Integer num2 = (Integer) obj;
                num2.getClass();
                C1509.f7142.getClass();
                C1509.f7102.m1581(C1509.f7179[27], num2);
                return C2746.f13459;
            case 26:
                Integer num3 = (Integer) obj;
                num3.getClass();
                C1509.f7142.getClass();
                C1509.f7181.m1581(C1509.f7179[24], num3);
                return C2746.f13459;
            case 27:
                Integer num4 = (Integer) obj;
                num4.getClass();
                C1509.f7142.getClass();
                C1509.f7124.m1581(C1509.f7179[25], num4);
                return C2746.f13459;
            case 28:
                Integer num5 = (Integer) obj;
                num5.getClass();
                C1509.f7142.getClass();
                C1509.f7220.m1581(C1509.f7179[26], num5);
                return C2746.f13459;
            default:
                Integer num6 = (Integer) obj;
                num6.getClass();
                C1509.f7142.getClass();
                C1509.f7296.m1581(C1509.f7179[23], num6);
                return C2746.f13459;
        }
    }
}
