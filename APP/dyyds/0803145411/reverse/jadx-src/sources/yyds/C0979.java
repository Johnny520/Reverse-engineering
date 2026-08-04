package yyds;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛴᲇᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0979 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0979 f4486 = new C0979();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2123(Method method, Field field, Method method2, Method method3, Method method4, Method method5, Method method6, AtomicBoolean atomicBoolean, Object obj, String str) {
        Object c2658;
        int i;
        Object obj2;
        int i2;
        Pair pair;
        if (method == null || field == null || method2 == null || method3 == null) {
            return;
        }
        LinkedHashSet linkedHashSetM3095 = C1509.m3095(C1509.f7142);
        if (linkedHashSetM3095.isEmpty()) {
            return;
        }
        boolean zContains = linkedHashSetM3095.contains(AbstractC2328.m4341(-902836058227566L));
        try {
            Object objInvoke = method.invoke(obj, null);
            List list = objInvoke instanceof List ? (List) objInvoke : null;
            if (list == null) {
                list = C1860.f9345;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                C2578 c2578M2125 = m2125(method4, method5, method6, obj3, zContains);
                if (obj3 != null) {
                    C0480.f2391.getClass();
                    if (!C0480.m1336(c2578M2125, linkedHashSetM3095)) {
                        obj3 = null;
                    }
                    pair = obj3 != null ? new Pair(obj3, c2578M2125) : null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            if (arrayList.isEmpty() || (obj2 = field.get(obj)) == null) {
                i2 = 0;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = new C1057(1, arrayList).iterator();
                i2 = 0;
                while (((C0995) it).f4517.hasPrevious()) {
                    Pair pair2 = (Pair) ((C0995) it).f4517.previous();
                    Object objComponent1 = pair2.component1();
                    List list2 = (List) pair2.component2();
                    Object objInvoke2 = method2.invoke(obj2, objComponent1);
                    if (objInvoke2 != null && AbstractC1544.m3188(method3.invoke(objInvoke2, null), Boolean.TRUE)) {
                        i2++;
                        AbstractC1432.m2928(list2, linkedHashSet);
                    }
                }
                if (i2 > 0) {
                    method.invoke(obj, null);
                    C2336.f11496.m4354(AbstractC2328.m4341(-902909072671598L) + str + AbstractC2328.m4341(-902982087115630L) + i2 + AbstractC2328.m4341(-903029331755886L) + AbstractC1595.m3285(linkedHashSet, null, null, null, null, 63));
                }
            }
            c2658 = Integer.valueOf(i2);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null) {
            i = 0;
            if (atomicBoolean.compareAndSet(false, true)) {
                C2336.f11496.m4355(AbstractC2328.m4341(-903067986461550L).concat(str), thM4249);
            }
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (c2658 instanceof C2658) {
            c2658 = numValueOf;
        }
        ((Number) c2658).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m2124(Method method, Method method2, Method method3, AtomicBoolean atomicBoolean, Object obj, C0919 c0919, Object obj2) {
        Object c2658;
        boolean z;
        if (obj == null || method == null || method2 == null) {
            return false;
        }
        try {
            Object objInvoke = method.invoke(obj, null);
            Map map = objInvoke instanceof Map ? (Map) objInvoke : null;
            if (map == null) {
                z = false;
                c2658 = Boolean.valueOf(z);
            } else if (obj2 != null) {
                Object objInvoke2 = method.invoke(obj2, null);
                Map map2 = objInvoke2 instanceof Map ? (Map) objInvoke2 : null;
                C0813 c0813 = C0813.f3738;
                c0813.getClass();
                LinkedHashMap linkedHashMapM1878 = C0813.m1878(map, map2);
                AbstractC2328.m4341(-719299220767598L);
                Object objM1882 = c0813.m1882(linkedHashMapM1878, c0919, false);
                Map map3 = objM1882 instanceof Map ? (Map) objM1882 : null;
                if (map3 == null) {
                    z = false;
                    c2658 = Boolean.valueOf(z);
                } else {
                    method2.invoke(obj, map3);
                    if (method3 != null) {
                        method3.invoke(obj, null);
                    }
                    z = true;
                    c2658 = Boolean.valueOf(z);
                }
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        Throwable thM4249 = C2248.m4249(c2658);
        if (thM4249 != null && atomicBoolean.compareAndSet(false, true)) {
            C2336.f11496.m4355(AbstractC2328.m4341(-903149590840174L), thM4249);
        }
        Boolean bool = Boolean.FALSE;
        if (c2658 instanceof C2658) {
            c2658 = bool;
        }
        return ((Boolean) c2658).booleanValue();
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static final native C2578 m2125(Method method, Method method2, Method method3, Object obj, boolean z);

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static native void m2126();

    /* JADX WARN: Removed duplicated region for block: B:384:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0aae  */
    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo420() {
        Object objM3200;
        Object objM32002;
        Object objM32003;
        Object objM32004;
        Object objM32005;
        Object objM32006;
        C1329 c1329;
        Object objM32007;
        Class cls;
        Object objM32008;
        Object objM32009;
        Object objM320010;
        C0757 c0757;
        Object objM320011;
        C0757 c07572;
        Object objM320012;
        Object objM320013;
        Field field;
        Object objM320014;
        Object objM320015;
        Object objM320016;
        Object objM320017;
        AtomicBoolean atomicBoolean;
        C0979 c0979;
        C0757 c07573;
        AtomicBoolean atomicBoolean2;
        final Method method;
        final AtomicBoolean atomicBoolean3;
        final Field field2;
        long j;
        C0979 c09792;
        long j2;
        Class clsM2792;
        C1329 c13292 = C1329.f6114;
        Class cls2 = Boolean.TYPE;
        EnumC2298 enumC2298 = EnumC2298.f11298;
        Class cls3 = Void.TYPE;
        EnumC2298 enumC22982 = EnumC2298.f11300;
        C0979 c09793 = f4486;
        try {
            C1743 c1743M2657 = c13292.m2657();
            if (c1743M2657 != null) {
                Field fieldM3483 = C1743.m3483(c1743M2657, m678());
                fieldM3483.setAccessible(true);
                objM3200 = fieldM3483;
            } else {
                objM3200 = null;
            }
        } catch (Throwable th) {
            objM3200 = AbstractC1544.m3200(th);
        }
        Throwable thM4249 = C2248.m4249(objM3200);
        if (thM4249 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-897097981920110L), thM4249);
        }
        boolean z = objM3200 instanceof C2658;
        Object obj = objM3200;
        if (z) {
            obj = null;
        }
        final Field field3 = (Field) obj;
        try {
            C0757 c0757M6 = C1329.f6114.m6();
            if (c0757M6 != null) {
                Method methodM1702 = C0757.m1702(c0757M6, m678());
                methodM1702.setAccessible(true);
                objM32002 = methodM1702;
            } else {
                objM32002 = null;
            }
        } catch (Throwable th2) {
            objM32002 = AbstractC1544.m3200(th2);
        }
        Throwable thM42492 = C2248.m4249(objM32002);
        if (thM42492 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-897183881266030L), thM42492);
        }
        boolean z2 = objM32002 instanceof C2658;
        Object obj2 = objM32002;
        if (z2) {
            obj2 = null;
        }
        Method method2 = (Method) obj2;
        try {
            C0757 c0757M2648 = C1329.f6114.m2648();
            if (c0757M2648 != null) {
                Method methodM17022 = C0757.m1702(c0757M2648, m678());
                methodM17022.setAccessible(true);
                objM32003 = methodM17022;
            } else {
                objM32003 = null;
            }
        } catch (Throwable th3) {
            objM32003 = AbstractC1544.m3200(th3);
        }
        Throwable thM42493 = C2248.m4249(objM32003);
        if (thM42493 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-897274075579246L), thM42493);
        }
        boolean z3 = objM32003 instanceof C2658;
        Object obj3 = objM32003;
        if (z3) {
            obj3 = null;
        }
        final Method method3 = (Method) obj3;
        C1329 c13293 = C1329.f6114;
        C0757 c0757M2660 = c13293.m2660();
        C0757 c0757M2709 = c13293.m2709();
        try {
            C0757 c0757M2712 = c13293.m2712();
            if (c0757M2712 != null) {
                Method methodM17023 = C0757.m1702(c0757M2712, m678());
                methodM17023.setAccessible(true);
                objM32004 = methodM17023;
            } else {
                objM32004 = null;
            }
        } catch (Throwable th4) {
            objM32004 = AbstractC1544.m3200(th4);
        }
        Throwable thM42494 = C2248.m4249(objM32004);
        if (thM42494 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-897402924598126L), thM42494);
        }
        boolean z4 = objM32004 instanceof C2658;
        Object obj4 = objM32004;
        if (z4) {
            obj4 = null;
        }
        Method method4 = (Method) obj4;
        try {
            C1743 c1743M2675 = C1329.f6114.m2675();
            if (c1743M2675 != null) {
                Field fieldM34832 = C1743.m3483(c1743M2675, m678());
                fieldM34832.setAccessible(true);
                objM32005 = fieldM34832;
            } else {
                objM32005 = null;
            }
        } catch (Throwable th5) {
            objM32005 = AbstractC1544.m3200(th5);
        }
        Throwable thM42495 = C2248.m4249(objM32005);
        if (thM42495 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-897475939042158L), thM42495);
        }
        boolean z5 = objM32005 instanceof C2658;
        Object obj5 = objM32005;
        if (z5) {
            obj5 = null;
        }
        Field field4 = (Field) obj5;
        try {
            C0757 c0757M2663 = C1329.f6114.m2663();
            if (c0757M2663 != null) {
                Method methodM17024 = C0757.m1702(c0757M2663, m678());
                methodM17024.setAccessible(true);
                objM32006 = methodM17024;
            } else {
                objM32006 = null;
            }
        } catch (Throwable th6) {
            objM32006 = AbstractC1544.m3200(th6);
        }
        Throwable thM42496 = C2248.m4249(objM32006);
        if (thM42496 != null) {
            c1329 = c13292;
            C2336.f11496.m4355(AbstractC2328.m4341(-897553248453486L), thM42496);
        } else {
            c1329 = c13292;
        }
        boolean z6 = objM32006 instanceof C2658;
        Object obj6 = objM32006;
        if (z6) {
            obj6 = null;
        }
        final Method method5 = (Method) obj6;
        try {
            C0757 c0757M2678 = C1329.f6114.m2678();
            if (c0757M2678 != null) {
                Method methodM17025 = C0757.m1702(c0757M2678, m678());
                methodM17025.setAccessible(true);
                objM32007 = methodM17025;
            } else {
                objM32007 = null;
            }
        } catch (Throwable th7) {
            objM32007 = AbstractC1544.m3200(th7);
        }
        Throwable thM42497 = C2248.m4249(objM32007);
        if (thM42497 != null) {
            cls = cls2;
            C2336.f11496.m4355(AbstractC2328.m4341(-897621967930222L), thM42497);
        } else {
            cls = cls2;
        }
        boolean z7 = objM32007 instanceof C2658;
        Object obj7 = objM32007;
        if (z7) {
            obj7 = null;
        }
        final Method method6 = (Method) obj7;
        try {
            C0757 c0757M2718 = C1329.f6114.m2718();
            if (c0757M2718 != null) {
                Method methodM17026 = C0757.m1702(c0757M2718, m678());
                methodM17026.setAccessible(true);
                objM32008 = methodM17026;
            } else {
                objM32008 = null;
            }
        } catch (Throwable th8) {
            objM32008 = AbstractC1544.m3200(th8);
        }
        Throwable thM42498 = C2248.m4249(objM32008);
        if (thM42498 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-897699277341550L), thM42498);
        }
        boolean z8 = objM32008 instanceof C2658;
        Object obj8 = objM32008;
        if (z8) {
            obj8 = null;
        }
        final Method method7 = (Method) obj8;
        try {
            C0757 c0757M2654 = C1329.f6114.m2654();
            if (c0757M2654 != null) {
                Method methodM17027 = C0757.m1702(c0757M2654, m678());
                methodM17027.setAccessible(true);
                objM32009 = methodM17027;
            } else {
                objM32009 = null;
            }
        } catch (Throwable th9) {
            objM32009 = AbstractC1544.m3200(th9);
        }
        Throwable thM42499 = C2248.m4249(objM32009);
        if (thM42499 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-897776586752878L), thM42499);
        }
        boolean z9 = objM32009 instanceof C2658;
        Object obj9 = objM32009;
        if (z9) {
            obj9 = null;
        }
        final Method method8 = (Method) obj9;
        C1329 c13294 = C1329.f6114;
        List listM2695 = c13294.m2695();
        C0757 c0757M2700 = c13294.m2700();
        try {
            C0757 c0757M2629 = c13294.m2629();
            if (c0757M2629 != null) {
                Method methodM17028 = C0757.m1702(c0757M2629, m678());
                methodM17028.setAccessible(true);
                objM320010 = methodM17028;
            } else {
                objM320010 = null;
            }
        } catch (Throwable th10) {
            objM320010 = AbstractC1544.m3200(th10);
        }
        Throwable thM424910 = C2248.m4249(objM320010);
        if (thM424910 != null) {
            c0757 = c0757M2660;
            C2336.f11496.m4355(AbstractC2328.m4341(-897871076033390L), thM424910);
        } else {
            c0757 = c0757M2660;
        }
        boolean z10 = objM320010 instanceof C2658;
        Object obj10 = objM320010;
        if (z10) {
            obj10 = null;
        }
        Method method9 = (Method) obj10;
        try {
            C0757 c0757M2628 = C1329.f6114.m2628();
            if (c0757M2628 != null) {
                Method methodM17029 = C0757.m1702(c0757M2628, m678());
                methodM17029.setAccessible(true);
                objM320011 = methodM17029;
            } else {
                objM320011 = null;
            }
        } catch (Throwable th11) {
            objM320011 = AbstractC1544.m3200(th11);
        }
        Throwable thM424911 = C2248.m4249(objM320011);
        if (thM424911 != null) {
            c07572 = c0757M2709;
            C2336.f11496.m4355(AbstractC2328.m4341(-897961270346606L), thM424911);
        } else {
            c07572 = c0757M2709;
        }
        boolean z11 = objM320011 instanceof C2658;
        Object obj11 = objM320011;
        if (z11) {
            obj11 = null;
        }
        Method method10 = (Method) obj11;
        try {
            C0757 c0757M2661 = C1329.f6114.m2661();
            if (c0757M2661 != null) {
                Method methodM170210 = C0757.m1702(c0757M2661, m678());
                methodM170210.setAccessible(true);
                objM320012 = methodM170210;
            } else {
                objM320012 = null;
            }
        } catch (Throwable th12) {
            objM320012 = AbstractC1544.m3200(th12);
        }
        Throwable thM424912 = C2248.m4249(objM320012);
        if (thM424912 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-898090119365486L), thM424912);
        }
        boolean z12 = objM320012 instanceof C2658;
        Object obj12 = objM320012;
        if (z12) {
            obj12 = null;
        }
        Method method11 = (Method) obj12;
        try {
            C0757 c0757M2708 = C1329.f6114.m2708();
            if (c0757M2708 != null) {
                Method methodM170211 = C0757.m1702(c0757M2708, m678());
                methodM170211.setAccessible(true);
                objM320013 = methodM170211;
            } else {
                objM320013 = null;
            }
        } catch (Throwable th13) {
            objM320013 = AbstractC1544.m3200(th13);
        }
        Throwable thM424913 = C2248.m4249(objM320013);
        if (thM424913 != null) {
            field = field4;
            C2336.f11496.m4355(AbstractC2328.m4341(-898184608645998L), thM424913);
        } else {
            field = field4;
        }
        boolean z13 = objM320013 instanceof C2658;
        Object obj13 = objM320013;
        if (z13) {
            obj13 = null;
        }
        Method method12 = (Method) obj13;
        try {
            C0757 c0757M2704 = C1329.f6114.m2704();
            if (c0757M2704 != null) {
                Method methodM170212 = C0757.m1702(c0757M2704, m678());
                methodM170212.setAccessible(true);
                objM320014 = methodM170212;
            } else {
                objM320014 = null;
            }
        } catch (Throwable th14) {
            objM320014 = AbstractC1544.m3200(th14);
        }
        Throwable thM424914 = C2248.m4249(objM320014);
        if (thM424914 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-898339227468654L), thM424914);
        }
        boolean z14 = objM320014 instanceof C2658;
        Object obj14 = objM320014;
        if (z14) {
            obj14 = null;
        }
        Method method13 = (Method) obj14;
        try {
            C0757 c0757M2674 = C1329.f6114.m2674();
            if (c0757M2674 != null) {
                Method methodM170213 = C0757.m1702(c0757M2674, m678());
                methodM170213.setAccessible(true);
                objM320015 = methodM170213;
            } else {
                objM320015 = null;
            }
        } catch (Throwable th15) {
            objM320015 = AbstractC1544.m3200(th15);
        }
        Throwable thM424915 = C2248.m4249(objM320015);
        if (thM424915 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-898480961389422L), thM424915);
        }
        boolean z15 = objM320015 instanceof C2658;
        Object obj15 = objM320015;
        if (z15) {
            obj15 = null;
        }
        Method method14 = (Method) obj15;
        try {
            C0757 c0757M2723 = C1329.f6114.m2723();
            if (c0757M2723 != null) {
                Method methodM170214 = C0757.m1702(c0757M2723, m678());
                methodM170214.setAccessible(true);
                objM320016 = methodM170214;
            } else {
                objM320016 = null;
            }
        } catch (Throwable th16) {
            objM320016 = AbstractC1544.m3200(th16);
        }
        Throwable thM424916 = C2248.m4249(objM320016);
        if (thM424916 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-898644170146670L), thM424916);
        }
        boolean z16 = objM320016 instanceof C2658;
        Object obj16 = objM320016;
        if (z16) {
            obj16 = null;
        }
        Method method15 = (Method) obj16;
        try {
            C0757 c0757M2703 = C1329.f6114.m2703();
            if (c0757M2703 != null) {
                Method methodM170215 = C0757.m1702(c0757M2703, m678());
                methodM170215.setAccessible(true);
                objM320017 = methodM170215;
            } else {
                objM320017 = null;
            }
        } catch (Throwable th17) {
            objM320017 = AbstractC1544.m3200(th17);
        }
        Throwable thM424917 = C2248.m4249(objM320017);
        if (thM424917 != null) {
            C2336.f11496.m4355(AbstractC2328.m4341(-898785904067438L), thM424917);
        }
        boolean z17 = objM320017 instanceof C2658;
        Object obj17 = objM320017;
        if (z17) {
            obj17 = null;
        }
        Method method16 = (Method) obj17;
        ThreadLocal threadLocal = new ThreadLocal();
        AtomicBoolean atomicBoolean4 = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean5 = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean6 = new AtomicBoolean(false);
        boolean z18 = (method4 != null && field != null && method5 != null && method6 != null) && ((method7 != null && method8 != null) || method3 != null);
        boolean z19 = z18 && c0757 != null;
        boolean z20 = z18 && c07572 != null;
        if (z19) {
            atomicBoolean = atomicBoolean6;
        } else {
            atomicBoolean = atomicBoolean6;
            C2336.f11496.m4354(AbstractC2328.m4341(-898923343020910L));
        }
        C1329 c13295 = C1329.f6114;
        m675(c13295.m2632(), null, new C0673(21));
        m675(c13295.m2683(), null, new C0179(24));
        m675(c13295.m2643(), null, new C0673(29));
        m675(c13295.m2633(), null, new C0179(8));
        if (z19) {
            C0757 c07574 = c0757;
            final int i = 0;
            C0757 c07575 = c07572;
            c0979 = c09793;
            c07573 = c07575;
            atomicBoolean2 = atomicBoolean4;
            method = method4;
            atomicBoolean3 = atomicBoolean5;
            field2 = field;
            m675(c07574, EnumC1543.f7496, new InterfaceC1549() { // from class: yyds.ᲀᲈᛶ
                @Override // yyds.InterfaceC1549
                /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                public final native Object mo371(Object obj18);
            });
        } else {
            C0757 c07576 = c07572;
            c0979 = c09793;
            c07573 = c07576;
            atomicBoolean2 = atomicBoolean4;
            method = method4;
            atomicBoolean3 = atomicBoolean5;
            field2 = field;
        }
        if (z20) {
            final int i2 = 1;
            m675(c07573, EnumC1543.f7605, new InterfaceC1549() { // from class: yyds.ᲀᲈᛶ
                @Override // yyds.InterfaceC1549
                /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                public final native Object mo371(Object obj18);
            });
        }
        m680(listM2695, EnumC1543.f7774, new C0179(10));
        m675(c0757M2700, EnumC1543.f7814, new C2410(method13, method14, method15, atomicBoolean, 3));
        AtomicBoolean atomicBoolean7 = atomicBoolean;
        m673(method16, EnumC1543.f7695, new C1584(threadLocal, method13, method10, method14, method15, atomicBoolean7, 3));
        m674(method9, EnumC1543.f7729, new C2001(threadLocal, 13, method11), new C1584(threadLocal, method10, method13, method12, atomicBoolean2, atomicBoolean7, 2));
        m675(c13295.m2696(), EnumC1543.f7490, new C0179(9));
        m679(c13295.m2662(), null, new C0179(16));
        m679(c13295.m2650(), null, new C0179(19));
        m679(c13295.m2687(), null, new C0179(20));
        String strM4341 = AbstractC2328.m4341(-899103731647342L);
        String strM43412 = AbstractC2328.m4341(-899558998180718L);
        try {
            Class clsM27922 = AbstractC1371.m2792(strM4341, null, 3);
            if (clsM27922 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-899580473017198L).concat(strM4341));
                if (!AbstractC0473.m1313(strM43412)) {
                    C1329.f6115.add(new Pair(strM43412, strM43412));
                }
                j = -989976649696110L;
                j2 = -989955174859630L;
                c09792 = c0979;
            } else {
                int i3 = AbstractC2293.f11258;
                C2014 c2014M1326 = AbstractC0476.m1326(clsM27922);
                C2014.m3888(c2014M1326);
                C1189 c1189M3892 = c2014M1326.m3892();
                C2014.m3888(c2014M1326);
                c1189M3892.m2391(enumC22982, enumC2298);
                c1189M3892.f12003 = AbstractC2328.m4341(-899657782428526L);
                c1189M3892.m2392(AbstractC1700.m3448(cls));
                c1189M3892.f5455 = cls3;
                C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                c0979.getClass();
                AbstractC2328.m4341(-989955174859630L);
                if (c0536 == null) {
                    C2336.f11496.m4359(AbstractC2328.m4341(-989976649696110L));
                    j = -989976649696110L;
                    c09792 = c0979;
                } else {
                    C0213 c0213 = new C0213();
                    AbstractC2328.m4341(-905842535334766L);
                    j = -989976649696110L;
                    try {
                        c0213.m871(new C0179(17));
                        c09792 = c0979;
                    } catch (Exception e) {
                        e = e;
                        c09792 = c0979;
                        j2 = -989955174859630L;
                        C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-899726501905262L)), strM4341, -899765156610926L), e);
                        C1329 c13296 = C1329.f6114;
                        AbstractC2104.m4010(strM4341, strM43412, C1329.f6115);
                    }
                    try {
                        c09792.m682(c0536.mo1373(), null, new C0052(26, c0213));
                    } catch (Exception e2) {
                        e = e2;
                        j2 = -989955174859630L;
                        C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-899726501905262L)), strM4341, -899765156610926L), e);
                        C1329 c132962 = C1329.f6114;
                        AbstractC2104.m4010(strM4341, strM43412, C1329.f6115);
                    }
                }
                C1329 c13297 = C1329.f6114;
                j2 = -989955174859630L;
            }
        } catch (Exception e3) {
            e = e3;
            j = -989976649696110L;
        }
        m685(EnumC1543.f7452, new C0179(21));
        m675(c1329.m2714(), null, new C0179(22));
        m679(c1329.m2646(), null, new C0179(23));
        String strM43413 = AbstractC2328.m4341(-899795221381998L);
        String strM43414 = AbstractC2328.m4341(-900160293602158L);
        try {
            Class clsM27923 = AbstractC1371.m2792(strM43413, null, 3);
            if (clsM27923 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-900194653340526L).concat(strM43413));
                if (!AbstractC0473.m1313(strM43414)) {
                    C1329.f6115.add(new Pair(strM43414, strM43414));
                }
            } else {
                int i4 = AbstractC2293.f11258;
                C2014 c2014M13262 = AbstractC0476.m1326(clsM27923);
                C2014.m3888(c2014M13262);
                C1189 c1189M38922 = c2014M13262.m3892();
                c1189M38922.m2391(enumC22982, enumC2298);
                c1189M38922.f12003 = AbstractC2328.m4341(-900271962751854L);
                c1189M38922.m2393();
                c1189M38922.f5455 = cls3;
                C0536 c05362 = (C0536) AbstractC1595.m3280(c1189M38922.mo736());
                c09792.getClass();
                AbstractC2328.m4341(j2);
                if (c05362 == null) {
                    C2336.f11496.m4359(AbstractC2328.m4341(j));
                } else {
                    C0213 c02132 = new C0213();
                    AbstractC2328.m4341(-906186132718446L);
                    c02132.m871(new C0179(13));
                    c09792.m682(c05362.mo1373(), null, new C0052(26, c02132));
                }
                C1189 c1189M38923 = c2014M13262.m3892();
                C2014.m3888(c2014M13262);
                c1189M38923.m2391(enumC22982);
                c1189M38923.m2393();
                c1189M38923.f5455 = AbstractC2328.m4341(-900293437588334L);
                c09792.m681((C0536) AbstractC1595.m3281(c1189M38923.mo736()), new C0673(22));
            }
        } catch (Exception e4) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-900392221836142L)), strM43413, -900430876541806L), e4);
            C1329 c13298 = C1329.f6114;
            AbstractC2104.m4010(strM43413, strM43414, C1329.f6115);
        }
        String strM43415 = AbstractC2328.m4341(-900460941312878L);
        String strM43416 = AbstractC2328.m4341(-900838898434926L);
        try {
            Class clsM27924 = AbstractC1371.m2792(strM43415, null, 3);
            if (clsM27924 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-900873258173294L).concat(strM43415));
                if (!AbstractC0473.m1313(strM43416)) {
                    C1329.f6115.add(new Pair(strM43416, strM43416));
                }
            } else {
                int i5 = AbstractC2293.f11258;
                C2014 c2014M13263 = AbstractC0476.m1326(clsM27924);
                C2014.m3888(c2014M13263);
                C1189 c1189M38924 = c2014M13263.m3892();
                C2014.m3888(c2014M13263);
                c1189M38924.m2391(enumC22982);
                c1189M38924.m2393();
                c1189M38924.f5455 = AbstractC2328.m4341(-900950567584622L);
                c09792.m681((C0536) AbstractC1595.m3281(c1189M38924.mo736()), new C0673(23));
            }
        } catch (Exception e5) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-901049351832430L)), strM43415, -901088006538094L), e5);
            C1329 c13299 = C1329.f6114;
            AbstractC2104.m4010(strM43415, strM43416, C1329.f6115);
        }
        m675(c1329.m2694(), null, new C0673(24));
        m675(c1329.m2690(), null, new C2001(field3, 12, method2));
        final int i6 = 0;
        m675(c1329.m2644(), null, new InterfaceC1549(field3, i6) { // from class: yyds.ᛶᛸᲀᲈ

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ int f6493;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ Field f6494;

            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final native Object mo371(Object obj18);
        });
        m679(c1329.m2668(), null, new C0673(25));
        m675(c1329.m2684(), null, new C0673(26));
        String strM43417 = AbstractC2328.m4341(-901118071309166L);
        String strM43418 = AbstractC2328.m4341(-901461668692846L);
        try {
            Class clsM27925 = AbstractC1371.m2792(strM43417, null, 3);
            if (clsM27925 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-901491733463918L).concat(strM43417));
                if (!AbstractC0473.m1313(strM43418)) {
                    C1329.f6115.add(new Pair(strM43418, strM43418));
                }
            } else {
                int i7 = AbstractC2293.f11258;
                C2014 c2014M13264 = AbstractC0476.m1326(clsM27925);
                C2014.m3888(c2014M13264);
                C1189 c1189M38925 = c2014M13264.m3892();
                C2014.m3888(c2014M13264);
                c1189M38925.m2391(enumC22982);
                c1189M38925.m2392(AbstractC1700.m3448(Integer.TYPE), AbstractC1700.m3448(cls));
                c1189M38925.f5455 = cls3;
                C0536 c05363 = (C0536) AbstractC1595.m3281(c1189M38925.mo736());
                c09792.getClass();
                AbstractC2328.m4341(j2);
                if (c05363 == null) {
                    C2336.f11496.m4359(AbstractC2328.m4341(j));
                } else {
                    C0213 c02133 = new C0213();
                    AbstractC2328.m4341(-907878349833070L);
                    c02133.m871(new C0179(12));
                    c09792.m682(c05363.mo1373(), null, new C0052(26, c02133));
                }
            }
        } catch (Exception e6) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-901569042875246L)), strM43417, -901607697580910L), e6);
            C1329 c132910 = C1329.f6114;
            AbstractC2104.m4010(strM43417, strM43418, C1329.f6115);
        }
        boolean z21 = AbstractC0606.f2913;
        C1743 c1743M2658 = c1329.m2658();
        AbstractC0606.f2901 = c1743M2658 != null ? c1743M2658.f8798 : null;
        m675(c1329.m2645(), null, new C0673(27));
        m679(c1329.m2642(), null, new C0673(28));
        m675(c1329.m2638(), null, new C0179(0));
        m689(EnumC1543.f7750, new C0179(1));
        m689(EnumC1543.f7522, new C0179(2));
        String strM43419 = AbstractC2328.m4341(-901637762351982L);
        Method method17 = null;
        try {
            clsM2792 = AbstractC1371.m2792(strM43419, null, 3);
            try {
            } catch (Exception e7) {
                e = e7;
                method17 = null;
                C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-901964179866478L)), strM43419, -902002834572142L), e);
                C1329 c132911 = C1329.f6114;
                AbstractC2104.m4010(strM43419, strM43419, C1329.f6115);
            }
        } catch (Exception e8) {
            e = e8;
        }
        if (clsM2792 != null) {
            int i8 = AbstractC2293.f11258;
            C2014 c2014M13265 = AbstractC0476.m1326(clsM2792);
            C2014.m3888(c2014M13265);
            C1189 c1189M38926 = c2014M13265.m3892();
            c1189M38926.f12003 = AbstractC2328.m4341(-901916935226222L);
            C0536 c05364 = (C0536) AbstractC1595.m3281(c1189M38926.mo736());
            c09792.getClass();
            AbstractC2328.m4341(j2);
            if (c05364 != null) {
                C0213 c02134 = new C0213();
                AbstractC2328.m4341(-908995041330030L);
                c02134.m870(new C0179(15));
                method17 = null;
                c09792.m682(c05364.mo1373(), null, new C0052(26, c02134));
                m684(EnumC1543.f7687, new C0179(3));
                boolean z22 = AbstractC0606.f2913;
                AbstractC0606.f2941 = AbstractC0145.m664(EnumC1543.f7539);
                C0757 c0757M2670 = c1329.m2670();
                AbstractC0606.f2951 = c0757M2670 != null ? C0757.m1702(c0757M2670, m678()) : method17;
                C0757 c0757M2685 = c1329.m2685();
                AbstractC0606.f2931 = c0757M2685 != null ? C0757.m1702(c0757M2685, m678()) : method17;
                C0757 c0757M2635 = c1329.m2635();
                AbstractC0606.f2912 = c0757M2635 != null ? C0757.m1702(c0757M2635, m678()) : method17;
                C0757 c0757M2682 = c1329.m2682();
                AbstractC0606.f2934 = c0757M2682 != null ? C0757.m1702(c0757M2682, m678()) : method17;
                C0757 c0757M2653 = c1329.m2653();
                AbstractC0606.f2911 = c0757M2653 != null ? C0757.m1702(c0757M2653, m678()) : method17;
                C0757 c0757M2627 = c1329.m2627();
                AbstractC0606.f2927 = c0757M2627 != null ? C0757.m1702(c0757M2627, m678()) : method17;
                C0757 c0757M2710 = c1329.m2710();
                AbstractC0606.f2902 = c0757M2710 != null ? C0757.m1702(c0757M2710, m678()) : method17;
                AbstractC0606.f2950 = AbstractC0145.m664(EnumC1543.f7660);
                AbstractC0606.f2915 = AbstractC0145.m664(EnumC1543.f7552);
                AbstractC0606.f2918 = AbstractC0145.m664(EnumC1543.f7499);
                AbstractC0606.f2925 = AbstractC0145.m664(EnumC1543.f7693);
                AbstractC0606.f2928 = AbstractC0145.m664(EnumC1543.f7742);
                AbstractC0606.f2914 = AbstractC0145.m664(EnumC1543.f7793);
                AbstractC0606.f2954 = AbstractC0145.m664(EnumC1543.f7477);
                AbstractC0606.f2920 = AbstractC0145.m664(EnumC1543.f7725);
                m685(EnumC1543.f7752, new C0179(4));
                m689(EnumC1543.f7438, new C0179(5));
                m684(EnumC1543.f7797, new C0179(6));
                m689(EnumC1543.f7574, new C0179(7));
                m2126();
            }
            C2336.f11496.m4359(AbstractC2328.m4341(j));
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-901964179866478L)), strM43419, -902002834572142L), e);
            C1329 c1329112 = C1329.f6114;
            AbstractC2104.m4010(strM43419, strM43419, C1329.f6115);
            m684(EnumC1543.f7687, new C0179(3));
            boolean z222 = AbstractC0606.f2913;
            AbstractC0606.f2941 = AbstractC0145.m664(EnumC1543.f7539);
            C0757 c0757M26702 = c1329.m2670();
            AbstractC0606.f2951 = c0757M26702 != null ? C0757.m1702(c0757M26702, m678()) : method17;
            C0757 c0757M26852 = c1329.m2685();
            AbstractC0606.f2931 = c0757M26852 != null ? C0757.m1702(c0757M26852, m678()) : method17;
            C0757 c0757M26352 = c1329.m2635();
            AbstractC0606.f2912 = c0757M26352 != null ? C0757.m1702(c0757M26352, m678()) : method17;
            C0757 c0757M26822 = c1329.m2682();
            AbstractC0606.f2934 = c0757M26822 != null ? C0757.m1702(c0757M26822, m678()) : method17;
            C0757 c0757M26532 = c1329.m2653();
            AbstractC0606.f2911 = c0757M26532 != null ? C0757.m1702(c0757M26532, m678()) : method17;
            C0757 c0757M26272 = c1329.m2627();
            AbstractC0606.f2927 = c0757M26272 != null ? C0757.m1702(c0757M26272, m678()) : method17;
            C0757 c0757M27102 = c1329.m2710();
            AbstractC0606.f2902 = c0757M27102 != null ? C0757.m1702(c0757M27102, m678()) : method17;
            AbstractC0606.f2950 = AbstractC0145.m664(EnumC1543.f7660);
            AbstractC0606.f2915 = AbstractC0145.m664(EnumC1543.f7552);
            AbstractC0606.f2918 = AbstractC0145.m664(EnumC1543.f7499);
            AbstractC0606.f2925 = AbstractC0145.m664(EnumC1543.f7693);
            AbstractC0606.f2928 = AbstractC0145.m664(EnumC1543.f7742);
            AbstractC0606.f2914 = AbstractC0145.m664(EnumC1543.f7793);
            AbstractC0606.f2954 = AbstractC0145.m664(EnumC1543.f7477);
            AbstractC0606.f2920 = AbstractC0145.m664(EnumC1543.f7725);
            m685(EnumC1543.f7752, new C0179(4));
            m689(EnumC1543.f7438, new C0179(5));
            m684(EnumC1543.f7797, new C0179(6));
            m689(EnumC1543.f7574, new C0179(7));
            m2126();
        }
        AbstractC0145.m667(AbstractC2328.m4341(-901839625814894L).concat(strM43419));
        method17 = null;
        m684(EnumC1543.f7687, new C0179(3));
        boolean z2222 = AbstractC0606.f2913;
        AbstractC0606.f2941 = AbstractC0145.m664(EnumC1543.f7539);
        C0757 c0757M267022 = c1329.m2670();
        AbstractC0606.f2951 = c0757M267022 != null ? C0757.m1702(c0757M267022, m678()) : method17;
        C0757 c0757M268522 = c1329.m2685();
        AbstractC0606.f2931 = c0757M268522 != null ? C0757.m1702(c0757M268522, m678()) : method17;
        C0757 c0757M263522 = c1329.m2635();
        AbstractC0606.f2912 = c0757M263522 != null ? C0757.m1702(c0757M263522, m678()) : method17;
        C0757 c0757M268222 = c1329.m2682();
        AbstractC0606.f2934 = c0757M268222 != null ? C0757.m1702(c0757M268222, m678()) : method17;
        C0757 c0757M265322 = c1329.m2653();
        AbstractC0606.f2911 = c0757M265322 != null ? C0757.m1702(c0757M265322, m678()) : method17;
        C0757 c0757M262722 = c1329.m2627();
        AbstractC0606.f2927 = c0757M262722 != null ? C0757.m1702(c0757M262722, m678()) : method17;
        C0757 c0757M271022 = c1329.m2710();
        AbstractC0606.f2902 = c0757M271022 != null ? C0757.m1702(c0757M271022, m678()) : method17;
        AbstractC0606.f2950 = AbstractC0145.m664(EnumC1543.f7660);
        AbstractC0606.f2915 = AbstractC0145.m664(EnumC1543.f7552);
        AbstractC0606.f2918 = AbstractC0145.m664(EnumC1543.f7499);
        AbstractC0606.f2925 = AbstractC0145.m664(EnumC1543.f7693);
        AbstractC0606.f2928 = AbstractC0145.m664(EnumC1543.f7742);
        AbstractC0606.f2914 = AbstractC0145.m664(EnumC1543.f7793);
        AbstractC0606.f2954 = AbstractC0145.m664(EnumC1543.f7477);
        AbstractC0606.f2920 = AbstractC0145.m664(EnumC1543.f7725);
        m685(EnumC1543.f7752, new C0179(4));
        m689(EnumC1543.f7438, new C0179(5));
        m684(EnumC1543.f7797, new C0179(6));
        m689(EnumC1543.f7574, new C0179(7));
        m2126();
    }
}
