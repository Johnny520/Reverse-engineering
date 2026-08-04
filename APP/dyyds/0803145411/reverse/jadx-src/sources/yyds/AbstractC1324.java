package yyds;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᛶᛴᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1324 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final ConcurrentHashMap f6086 = new ConcurrentHashMap();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2616(Class cls) {
        Class clsM1057;
        C1399 c1399;
        char c;
        int i;
        int i2;
        int i3;
        char c2;
        int i4;
        boolean z;
        String strM3691;
        if (f6086.get(cls) != null) {
            throw new ClassCastException();
        }
        HashMap map = new HashMap();
        Class superclass = cls;
        while (true) {
            int i5 = 1;
            char c3 = 2;
            if (superclass == Object.class) {
                break;
            }
            Field[] declaredFields = superclass.getDeclaredFields();
            int length = declaredFields.length;
            int i6 = 0;
            while (i6 < length) {
                Field field = declaredFields[i6];
                String name = field.getName();
                if (map.containsKey(name)) {
                    i4 = i5;
                    c2 = c3;
                } else {
                    C0593 c0593 = new C0593();
                    c0593.f2810 = field.getName();
                    int modifiers = field.getModifiers();
                    if ((modifiers & 136) > 0) {
                        i4 = i5;
                        c2 = c3;
                    } else {
                        if ((modifiers & 1) > 0) {
                            c0593.f2811 = field;
                        }
                        String name2 = field.getName();
                        int length2 = name2.length();
                        char[] cArr = new char[length2 + 3];
                        cArr[0] = 's';
                        cArr[i5] = 'e';
                        cArr[c3] = 't';
                        c2 = c3;
                        char cCharAt = name2.charAt(0);
                        i4 = i5;
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            cCharAt = (char) (cCharAt - ' ');
                        }
                        cArr[3] = cCharAt;
                        for (int i7 = i4; i7 < length2; i7++) {
                            cArr[i7 + 3] = name2.charAt(i7);
                        }
                        try {
                            c0593.f2812 = superclass.getDeclaredMethod(new String(cArr), field.getType());
                        } catch (Exception unused) {
                        }
                        boolean zEquals = field.getType().equals(Boolean.TYPE);
                        if (zEquals) {
                            String name3 = field.getName();
                            int length3 = name3.length();
                            char[] cArr2 = new char[length3 + 2];
                            cArr2[0] = 'i';
                            cArr2[i4] = 's';
                            z = zEquals;
                            char cCharAt2 = name3.charAt(0);
                            if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                                cCharAt2 = (char) (cCharAt2 - ' ');
                            }
                            cArr2[c2] = cCharAt2;
                            for (int i8 = i4; i8 < length3; i8++) {
                                cArr2[i8 + 2] = name3.charAt(i8);
                            }
                            strM3691 = new String(cArr2);
                        } else {
                            z = zEquals;
                            strM3691 = AbstractC1917.m3691(field.getName());
                        }
                        try {
                            c0593.f2813 = superclass.getDeclaredMethod(strM3691, null);
                        } catch (Exception unused2) {
                        }
                        if (c0593.f2813 == null && z) {
                            try {
                                c0593.f2813 = superclass.getDeclaredMethod(AbstractC1917.m3691(field.getName()), null);
                            } catch (Exception unused3) {
                            }
                        }
                        if (c0593.f2811 != null || c0593.f2813 != null || c0593.f2812 != null) {
                            Method method = c0593.f2813;
                            if (method != null) {
                                InterfaceC2749 interfaceC2749 = (InterfaceC2749) method.getAnnotation(InterfaceC2749.class);
                                if (((interfaceC2749 == null || !interfaceC2749.value()) ? i4 : 0) == 0) {
                                    c0593.f2813 = null;
                                }
                            }
                            Method method2 = c0593.f2812;
                            if (method2 != null) {
                                InterfaceC2749 interfaceC27492 = (InterfaceC2749) method2.getAnnotation(InterfaceC2749.class);
                                if (((interfaceC27492 == null || !interfaceC27492.value()) ? i4 : 0) == 0) {
                                    c0593.f2812 = null;
                                }
                            }
                            if (c0593.f2813 != null || c0593.f2812 != null || c0593.f2811 != null) {
                                c0593.f2814 = field.getType();
                                field.getGenericType();
                            }
                        }
                    }
                    if (c0593.f2811 != null || c0593.f2813 != null || c0593.f2812 != null) {
                        map.put(name, c0593);
                    }
                }
                i6++;
                c3 = c2;
                i5 = i4;
            }
            superclass = superclass.getSuperclass();
        }
        int i9 = 1;
        C0593[] c0593Arr = (C0593[]) map.values().toArray(new C0593[map.size()]);
        String name4 = cls.getName();
        String strM4014 = name4.startsWith("java.util.") ? AbstractC2104.m4014("net.minidev.asm.", name4, "AccAccess") : name4.concat("AccAccess");
        C0357 c0357 = new C0357(cls.getClassLoader());
        try {
            clsM1057 = c0357.loadClass(strM4014);
        } catch (ClassNotFoundException unused4) {
            clsM1057 = null;
        }
        LinkedList linkedList = new LinkedList();
        for (Class superclass2 = cls; superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
            linkedList.addLast(superclass2);
            for (Class<?> cls2 : superclass2.getInterfaces()) {
                linkedList.addLast(cls2);
            }
        }
        linkedList.addLast(Object.class);
        if (clsM1057 == null) {
            C1428 c1428 = new C1428(cls, c0593Arr, c0357);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                Iterable<Class> iterable = (Iterable) AbstractC0088.f683.get((Class) it.next());
                if (iterable != null) {
                    for (Class cls3 : iterable) {
                        if (cls3 != null) {
                            Method[] methods = cls3.getMethods();
                            int length4 = methods.length;
                            int i10 = 0;
                            while (i10 < length4) {
                                Method method3 = methods[i10];
                                if ((method3.getModifiers() & 8) != 0) {
                                    Class<?>[] parameterTypes = method3.getParameterTypes();
                                    if (parameterTypes.length == i9 && parameterTypes[0].equals(Object.class)) {
                                        Class<?> returnType = method3.getReturnType();
                                        if (!returnType.equals(Void.TYPE)) {
                                            c1428.f6778.put(returnType, method3);
                                        }
                                    }
                                }
                                i10++;
                                i9 = 1;
                            }
                        }
                        i9 = 1;
                    }
                }
                i9 = 1;
            }
            C1072 c1072 = new C1072();
            C0593[] c0593Arr2 = c1428.f6776;
            boolean z2 = c0593Arr2.length > 10;
            String str = c1428.f6780;
            String strM40142 = AbstractC2104.m4014("Lnet/minidev/asm/BeansAccess<L", str, ";>;");
            String str2 = C1428.f6774;
            c1072.m2280(50, 33, c1428.f6775, strM40142, str2, null);
            C1399 c1399M2281 = c1072.m2281(1, "<init>", "()V", null, null);
            c1399M2281.m2821(25, 0);
            c1399M2281.m2829(183, str2, "<init>", "()V", false);
            c1399M2281.m2828(177);
            c1399M2281.m2819(1, 1);
            C1399 c1399M22812 = c1072.m2281(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
            if (c0593Arr2.length != 0) {
                if (c0593Arr2.length > 14) {
                    c1399M22812.m2821(21, 2);
                    C0680[] c0680ArrM3699 = AbstractC1917.m3699(c0593Arr2.length);
                    C0680 c0680 = new C0680();
                    c1399M22812.m2825(0, c0680ArrM3699.length - 1, c0680, c0680ArrM3699);
                    int length5 = c0593Arr2.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length5) {
                        C0593 c05932 = c0593Arr2[i11];
                        int i13 = i12 + 1;
                        c1399M22812.m2811(c0680ArrM3699[i12]);
                        if (c05932.f2811 == null && c05932.f2812 == null) {
                            c1399M22812.m2828(177);
                        } else {
                            c1428.m2909(c1399M22812, c05932);
                        }
                        i11++;
                        i12 = i13;
                    }
                    c1399M22812.m2811(c0680);
                } else {
                    C0680[] c0680ArrM36992 = AbstractC1917.m3699(c0593Arr2.length);
                    int i14 = 0;
                    for (C0593 c05933 : c0593Arr2) {
                        C1428.m2908(c1399M22812, i14, c0680ArrM36992[i14]);
                        c1428.m2909(c1399M22812, c05933);
                        c1399M22812.m2811(c0680ArrM36992[i14]);
                        c1399M22812.m2832(3, 0, 0, null, null);
                        i14++;
                    }
                }
            }
            c1428.m2910(c1399M22812);
            c1399M22812.m2819(0, 0);
            C1399 c1399M22813 = c1072.m2281(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
            int i15 = 176;
            if (c0593Arr2.length == 0) {
                c1399M22813.m2832(3, 0, 0, null, null);
                c = 176;
                c1399 = c1399M22813;
            } else {
                c1399 = c1399M22813;
                if (c0593Arr2.length > 14) {
                    c1399.m2821(21, 2);
                    C0680[] c0680ArrM36993 = AbstractC1917.m3699(c0593Arr2.length);
                    C0680 c06802 = new C0680();
                    c1399.m2825(0, c0680ArrM36993.length - 1, c06802, c0680ArrM36993);
                    int length6 = c0593Arr2.length;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length6) {
                        C0593 c05934 = c0593Arr2[i16];
                        int i18 = i17 + 1;
                        c1399.m2811(c0680ArrM36993[i17]);
                        c1399.m2832(3, 0, 0, null, null);
                        Field field2 = c05934.f2811;
                        Method method4 = c05934.f2813;
                        if (field2 != null) {
                            i = 1;
                            i2 = 25;
                        } else if (method4 != null) {
                            i2 = 25;
                            i = 1;
                        } else {
                            c1399.m2828(1);
                            c1399.m2828(i15);
                            i16++;
                            i17 = i18;
                            i15 = 176;
                        }
                        c1399.m2821(i2, i);
                        c1399.m2824(192, str);
                        C1308 c1308M2594 = C1308.m2594(c05934.f2814);
                        if ((c05934.f2812 == null && method4 == null) || method4 == null) {
                            c1399.m2815(180, str, c05934.f2810, c1308M2594.m2597());
                        } else {
                            c1399.m2829(182, c1428.f6780, method4.getName(), C1308.m2596(method4), false);
                        }
                        AbstractC1917.m3712(c1399, c1308M2594);
                        c1399.m2828(176);
                        i16++;
                        i17 = i18;
                        i15 = 176;
                    }
                    c1399.m2811(c06802);
                    c1399.m2832(3, 0, 0, null, null);
                } else {
                    C0680[] c0680ArrM36994 = AbstractC1917.m3699(c0593Arr2.length);
                    int i19 = 0;
                    for (C0593 c05935 : c0593Arr2) {
                        C1428.m2908(c1399, i19, c0680ArrM36994[i19]);
                        c1399.m2821(25, 1);
                        c1399.m2824(192, str);
                        Class cls4 = c05935.f2814;
                        Method method5 = c05935.f2813;
                        String str3 = c05935.f2810;
                        C1308 c1308M25942 = C1308.m2594(cls4);
                        if ((c05935.f2812 == null && method5 == null) || method5 == null) {
                            c1399.m2815(180, str, str3, c1308M25942.m2597());
                        } else {
                            c1399.m2829(182, c1428.f6780, method5.getName(), C1308.m2596(method5), false);
                        }
                        AbstractC1917.m3712(c1399, c1308M25942);
                        c1399.m2828(176);
                        c1399.m2811(c0680ArrM36994[i19]);
                        c1399.m2832(3, 0, 0, null, null);
                        i19++;
                    }
                }
                c = 176;
            }
            c1428.m2910(c1399);
            c1399.m2819(0, 0);
            int i20 = 153;
            if (z2) {
                i3 = 192;
            } else {
                i3 = 192;
                C1399 c1399M22814 = c1072.m2281(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
                C0680[] c0680ArrM36995 = AbstractC1917.m3699(c0593Arr2.length);
                int length7 = c0593Arr2.length;
                int i21 = 0;
                int i22 = 0;
                while (i21 < length7) {
                    C0593 c05936 = c0593Arr2[i21];
                    c1399M22814.m2821(25, 2);
                    c1399M22814.m2818(c05936.f2810);
                    C1399 c13992 = c1399M22814;
                    c13992.m2829(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                    c13992.m2813(153, c0680ArrM36995[i22]);
                    c1428.m2909(c13992, c05936);
                    c13992.m2811(c0680ArrM36995[i22]);
                    c13992.m2832(3, 0, 0, null, null);
                    i22++;
                    i21++;
                    c1399M22814 = c13992;
                }
                C1399 c13993 = c1399M22814;
                c1428.m2911(c13993);
                c13993.m2819(0, 0);
            }
            if (!z2) {
                C1399 c1399M22815 = c1072.m2281(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
                C0680[] c0680ArrM36996 = AbstractC1917.m3699(c0593Arr2.length);
                int length8 = c0593Arr2.length;
                int i23 = 0;
                int i24 = 0;
                while (i23 < length8) {
                    C0593 c05937 = c0593Arr2[i23];
                    c1399M22815.m2821(25, 2);
                    String str4 = c05937.f2810;
                    Method method6 = c05937.f2813;
                    c1399M22815.m2818(str4);
                    c1399M22815.m2829(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                    c1399M22815.m2813(i20, c0680ArrM36996[i24]);
                    c1399M22815.m2821(25, 1);
                    c1399M22815.m2824(i3, str);
                    C1308 c1308M25943 = C1308.m2594(c05937.f2814);
                    if ((c05937.f2812 == null && method6 == null) || method6 == null) {
                        c1399M22815.m2815(180, str, c05937.f2810, c1308M25943.m2597());
                    } else {
                        c1399M22815.m2829(182, c1428.f6780, method6.getName(), C1308.m2596(method6), false);
                    }
                    AbstractC1917.m3712(c1399M22815, c1308M25943);
                    c1399M22815.m2828(176);
                    c1399M22815.m2811(c0680ArrM36996[i24]);
                    c1399M22815.m2832(3, 0, 0, null, null);
                    i24++;
                    i23++;
                    i20 = 153;
                }
                c1428.m2911(c1399M22815);
                c1399M22815.m2819(0, 0);
            }
            C1399 c1399M22816 = c1072.m2281(1, "newInstance", "()Ljava/lang/Object;", null, null);
            c1399M22816.m2824(187, str);
            c1399M22816.m2828(89);
            c1399M22816.m2829(183, c1428.f6780, "<init>", "()V", false);
            c1399M22816.m2828(176);
            c1399M22816.m2819(2, 1);
            clsM1057 = c1428.f6777.m1057(c1428.f6781, c1072.m2279());
        }
        try {
            if (clsM1057.newInstance() != null) {
                throw new ClassCastException();
            }
            throw null;
        } catch (Exception e) {
            throw new RuntimeException("Error constructing accessor class: ".concat(strM4014), e);
        }
    }
}
