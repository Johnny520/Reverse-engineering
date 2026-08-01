package p291;

import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.reader.C2771;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.annotation.Annotation;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p144.C7547;
import p278.C8363;
import p278.C8365;
import p279.InterfaceC8366;
import p295.InterfaceC8571;
import p295.InterfaceC8577;
import p295.InterfaceC8578;
import p295.InterfaceC8579;
import p296.InterfaceC8583;
import p296.InterfaceC8585;
import p296.InterfaceC8586;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8479 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f23529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8479 f23530 = new C8479();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f23531 = new AtomicInteger();

    static {
        HashMap map = new HashMap();
        f23529 = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new C8482(cls, Predicate.class, "test"));
        Class cls2 = Character.TYPE;
        map.put(cls2, new C8482(cls2, InterfaceC8578.class, "applyAsChar"));
        Class cls3 = Byte.TYPE;
        map.put(cls3, new C8482(cls3, InterfaceC8571.class, "applyAsByte"));
        Class cls4 = Short.TYPE;
        map.put(cls4, new C8482(cls4, InterfaceC8579.class, "applyAsShort"));
        Class cls5 = Integer.TYPE;
        map.put(cls5, new C8482(cls5, ToIntFunction.class, "applyAsInt"));
        Class cls6 = Long.TYPE;
        map.put(cls6, new C8482(cls6, ToLongFunction.class, "applyAsLong"));
        Class cls7 = Float.TYPE;
        map.put(cls7, new C8482(cls7, InterfaceC8577.class, "applyAsFloat"));
        Class cls8 = Double.TYPE;
        map.put(cls8, new C8482(cls8, ToDoubleFunction.class, "applyAsDouble"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static AbstractC8494 m14065(C8539 c8539, Class cls, String str, int i, long j, String str2, String str3, Method method, InterfaceC8523 interfaceC8523, Class cls2) {
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        if (((interfaceC8523 != null || c8539 == null) ? interfaceC8523 : m14072(c8539, returnType)) == null) {
            String name = cls.getName();
            if (name.indexOf(36) == -1 || !name.contains("$$")) {
                Object objM14070 = m14070(cls, method, returnType);
                Field fieldM5814 = AbstractC2865.m5814(method, cls);
                if (returnType == Integer.TYPE) {
                    return new C8432(str, i, j, str2, str3, (Field) null, method, (ToIntFunction) objM14070);
                }
                if (returnType == Long.TYPE) {
                    return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new C8429(str, i, j, str2, str3, fieldM5814, method, (ToLongFunction) objM14070) : new C8509(str, i, j, str2, str3, fieldM5814, method, (ToLongFunction) objM14070);
                }
                if (returnType == Boolean.TYPE) {
                    return new C8507(str, i, j, str2, str3, fieldM5814, method, (Predicate) objM14070);
                }
                if (returnType == Boolean.class) {
                    return new C8512(str, i, j, str2, str3, fieldM5814, method, (Function) objM14070);
                }
                Class<?> cls3 = Short.TYPE;
                if (returnType == cls3) {
                    if (objM14070 == null) {
                        return new C8498(str, i, j, str2, null, str3, cls3, cls3, fieldM5814, method, 1);
                    }
                    C2942.m6394();
                    return null;
                }
                Class<?> cls4 = Byte.TYPE;
                if (returnType == cls4) {
                    if (objM14070 == null) {
                        return new C8437(str, i, j, str2, null, str3, cls4, cls4, fieldM5814, method, 1);
                    }
                    C2942.m6394();
                    return null;
                }
                Class<?> cls5 = Float.TYPE;
                if (returnType == cls5) {
                    if (objM14070 == null) {
                        return new C8492(str, i, j, str2, null, str3, cls5, cls5, fieldM5814, method, 7);
                    }
                    C2942.m6394();
                    return null;
                }
                if (returnType == Float.class) {
                    return new C8491(str, i, j, str2, str3, fieldM5814, method, (Function) objM14070, 3);
                }
                if (returnType == Double.TYPE) {
                    return new C8491(str, i, j, str2, str3, fieldM5814, method, (ToDoubleFunction) objM14070);
                }
                if (returnType == Double.class) {
                    return new C8491(str, i, j, str2, str3, fieldM5814, method, (Function) objM14070, 2);
                }
                Class<?> cls6 = Character.TYPE;
                if (returnType != cls6) {
                    return m14066(c8539, str, i, j, str2, str3, genericReturnType, returnType, fieldM5814, method, (Function) objM14070, cls2);
                }
                if (objM14070 == null) {
                    return new C8492(str, i, j, str2, null, str3, cls6, cls6, fieldM5814, method, 4);
                }
                C2942.m6394();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC8494 m14066(C8539 c8539, String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method, Function function, Class cls2) {
        InterfaceC8523 interfaceC8523;
        if (cls == Byte.class) {
            return new C8438(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Short.class) {
            return new C8497(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Integer.class) {
            return new C8432(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Long.class) {
            return new C8429(str, i, j, str2, str3, field, method, function);
        }
        if (cls == BigInteger.class) {
            return new C8491(str, i, j, str2, str3, method, function, 1);
        }
        if (cls == BigDecimal.class) {
            return new C8491(str, i, j, str2, str3, method, function, 0);
        }
        if (cls == String.class) {
            return new C8533(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Date.class) {
            return new C8509(str, i, j, str2, str3, field, method, function, 1);
        }
        if (cls == LocalDate.class) {
            return new C8427(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (cls == OffsetDateTime.class) {
            return new C8536(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (cls == UUID.class) {
            return new C8534(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new C8509(str, i, j, str2, str3, field, method, function, 0);
        }
        if (cls.isEnum()) {
            if (c8539 == null) {
                c8539 = AbstractC2933.f9294;
            }
            c8539.getClass();
            C8365 c8365 = new C8365(c8539);
            c8539.m14108(cls, c8365);
            boolean z = c8365.f23103;
            if (!z && (interfaceC8523 = (InterfaceC8523) c8539.f23785.get(cls)) != null && !(interfaceC8523 instanceof C8453)) {
                z = true;
            }
            if (!z && AbstractC2865.m5817(cls, c8539) == null && AbstractC2865.m5816(cls) == null) {
                return new C8504(i, j, cls, str, str2, str3, field, method, type, function);
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if ((rawType == List.class || rawType == ArrayList.class) && actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                return type2 == String.class ? new C8491(i, j, cls, str, str2, str3, field, method, type, function) : new C8425(str, i, j, str2, str3, type2, field, method, function, type, cls, cls2);
            }
            if ((rawType instanceof Class) && Map.class.isAssignableFrom((Class) rawType)) {
                return new C8420(str, i, j, str2, str3, type, cls, field, method, function, cls2);
            }
        }
        return Modifier.isFinal(cls.getModifiers()) ? new C8531(i, j, cls, str, str2, str3, field, method, type, function) : new C8532(i, j, cls, str, str2, str3, field, method, type, function);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC8494 m14067(C8539 c8539, Class cls, String str, int i, long j, String str2, Locale locale, String str3, Method method, InterfaceC8523 interfaceC8523, Class cls2) {
        String str4;
        method.setAccessible(true);
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        InterfaceC8523 interfaceC8523M14072 = (interfaceC8523 != null || c8539 == null) ? interfaceC8523 : m14072(c8539, returnType);
        if (interfaceC8523M14072 != null) {
            C8535 c8535 = new C8535(str, i, j, str2, locale, str3, genericReturnType, returnType, null, method);
            c8535.f23330 = returnType;
            if (interfaceC8523M14072 != C8522.f23709) {
                c8535.f23596 = interfaceC8523M14072;
            }
            return c8535;
        }
        String strM5804 = str == null ? AbstractC2865.m5804(method, false, null) : str;
        Field fieldM5814 = (j & 4611686018427387904L) != 0 ? null : AbstractC2865.m5814(method, cls);
        if (returnType == Boolean.TYPE || returnType == Boolean.class) {
            return new C8490(strM5804, i, j, str2, str3, returnType, returnType, fieldM5814, method);
        }
        if (returnType == Integer.TYPE || returnType == Integer.class) {
            return new C8431(strM5804, i, j, str2, str3, returnType, returnType, fieldM5814, method);
        }
        if (returnType == Float.TYPE || returnType == Float.class) {
            return new C8492(strM5804, i, j, str2, null, str3, returnType, returnType, fieldM5814, method, 6);
        }
        if (returnType == Double.TYPE || returnType == Double.class) {
            return new C8492(strM5804, i, j, str2, null, str3, returnType, returnType, fieldM5814, method, 5);
        }
        if (returnType == Long.TYPE || returnType == Long.class) {
            String str5 = strM5804;
            if (str2 == null || str2.isEmpty() || "string".equals(str2)) {
                return new C8440(str5, i, j, str2, str3, returnType, fieldM5814, method);
            }
            return new C8501(str5, i, j, str2, str3, returnType, returnType, fieldM5814, method, 2);
        }
        if (returnType == Short.TYPE || returnType == Short.class) {
            return new C8498(strM5804, i, j, str2, null, str3, returnType, returnType, fieldM5814, method, 0);
        }
        if (returnType == Byte.TYPE || returnType == Byte.class) {
            return new C8437(strM5804, i, j, str2, null, str3, returnType, returnType, fieldM5814, method, 0);
        }
        if (returnType == Character.TYPE || returnType == Character.class) {
            return new C8492(strM5804, i, j, str2, null, str3, returnType, returnType, fieldM5814, method, 3);
        }
        if (returnType == BigDecimal.class) {
            return new C8492(strM5804, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, null, method, 1);
        }
        String str6 = strM5804;
        boolean zWriteEnumAsJavaBean = true;
        if (returnType.isEnum() && AbstractC2865.m5817(returnType, c8539) == null) {
            Annotation[] annotationArrM5820 = AbstractC2865.m5820(returnType);
            int length = annotationArrM5820.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    zWriteEnumAsJavaBean = false;
                    break;
                }
                Annotation annotation = annotationArrM5820[i2];
                InterfaceC8366 interfaceC8366 = (InterfaceC8366) AbstractC2865.m5819(annotation, InterfaceC8366.class);
                if (interfaceC8366 != null) {
                    zWriteEnumAsJavaBean = interfaceC8366.writeEnumAsJavaBean();
                    break;
                }
                Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                String name = clsAnnotationType.getName();
                C8365 c8365 = new C8365(AbstractC2933.f9294);
                if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (AbstractC2933.f9288) {
                        AbstractC2865.m5811(annotation.getClass(), new C2771(annotation, c8365, 8));
                    }
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                    AbstractC2865.m5811(clsAnnotationType, new C2771(c8365, annotation, 9));
                }
                if (c8365.f23103) {
                    break;
                }
                i2++;
            }
            if (!zWriteEnumAsJavaBean && AbstractC2865.m5816(returnType) == null) {
                return new C8496(str6, i, j, str2, str3, returnType, returnType, fieldM5814, method);
            }
        }
        if (returnType == Date.class) {
            if (str2 != null) {
                String strTrim = str2.trim();
                str4 = strTrim.isEmpty() ? null : strTrim;
            } else {
                str4 = str2;
            }
            return new C8501(str6, i, j, str4, str3, returnType, returnType, fieldM5814, method, 1);
        }
        if (returnType == String.class) {
            return new C8492(str6, i, j, str2, null, str3, String.class, String.class, fieldM5814, method, 9);
        }
        if (returnType == List.class || returnType == Iterable.class) {
            return new C8428(str6, genericReturnType instanceof ParameterizedType ? ((ParameterizedType) genericReturnType).getActualTypeArguments()[0] : Object.class, i, j, str2, str3, genericReturnType, returnType, null, method, cls2);
        }
        return Map.class.isAssignableFrom(returnType) ? new C8419(str6, i, j, str2, locale, str3, genericReturnType, returnType, null, method, cls2) : (returnType == Float[].class || returnType == Double[].class || returnType == BigDecimal[].class) ? new C8417(str6, returnType.getComponentType(), i, j, str2, str3, genericReturnType, returnType, fieldM5814, method) : new C8535(str6, i, j, str2, locale, str3, genericReturnType, returnType, null, method);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14068(C8365 c8365, C8524 c8524) {
        for (Class cls : c8365.f23095) {
            if (InterfaceC8585.class.isAssignableFrom(cls)) {
                try {
                    InterfaceC8585 interfaceC8585 = (InterfaceC8585) cls.newInstance();
                    if (interfaceC8585 instanceof InterfaceC8586) {
                        c8524.getClass();
                        c8524.f23715 = true;
                    }
                    if (interfaceC8585 instanceof InterfaceC8583) {
                        c8524.getClass();
                        c8524.f23715 = true;
                    } else {
                        c8524.getClass();
                    }
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m14069(Class cls, C8539 c8539, C8365 c8365, boolean z, C8363 c8363, Method method) {
        char cCharAt;
        String str = c8363.f23049;
        if (str != null && !str.isEmpty()) {
            return c8363.f23049;
        }
        if (z) {
            return method.getName();
        }
        String strM5804 = AbstractC2865.m5804(method, c8365.f23093, c8365.f23104);
        c8539.getClass();
        int length = strM5804.length();
        char cCharAt2 = length > 0 ? strM5804.charAt(0) : (char) 0;
        if ((length == 1 && cCharAt2 >= 'a' && cCharAt2 <= 'z') || (length > 2 && cCharAt2 >= 'A' && cCharAt2 <= 'Z' && (cCharAt = strM5804.charAt(1)) >= 'A' && cCharAt <= 'Z')) {
            char[] charArray = strM5804.toCharArray();
            if (cCharAt2 >= 'a') {
                charArray[0] = (char) (charArray[0] - ' ');
            } else {
                charArray[0] = (char) (charArray[0] + ' ');
            }
            Field fieldM5813 = AbstractC2865.m5813(cls, new String(charArray));
            if (fieldM5813 != null && (length == 1 || Modifier.isPublic(fieldM5813.getModifiers()))) {
                return fieldM5813.getName();
            }
        }
        return strM5804;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m14070(Class cls, Method method, Class cls2) {
        MethodType methodType;
        MethodType methodType2;
        MethodType methodType3;
        String str;
        MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(cls);
        C8482 c8482 = (C8482) f23529.get(cls2);
        if (c8482 != null) {
            methodType = c8482.f23551;
            methodType2 = c8482.f23550;
            str = c8482.f23552;
            methodType3 = c8482.f23549;
        } else {
            methodType = MethodType.methodType(cls2);
            methodType2 = AbstractC2867.f9064;
            methodType3 = AbstractC2867.f9060;
            str = "apply";
        }
        String str2 = str;
        MethodType methodType4 = methodType3;
        try {
            MethodHandle methodHandleFindVirtual = lookupM5768.findVirtual(cls, method.getName(), methodType);
            return (Object) LambdaMetafactory.metafactory(lookupM5768, str2, methodType2, methodType4, methodHandleFindVirtual, methodHandleFindVirtual.type()).getTarget().invoke();
        } catch (Throwable th) {
            C7547.m12775("create fieldLambdaGetter error, method : ", method, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0028 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m14071(java.lang.Class r8, java.util.ArrayList r9) {
        /*
            r0 = 1
            java.lang.reflect.Constructor r8 = com.alibaba.fastjson2.util.AbstractC2865.m5812(r8, r0)
            if (r8 != 0) goto L9
            goto L9e
        L9:
            int r1 = r8.getParameterCount()
            r8.setAccessible(r0)     // Catch: java.lang.Exception -> L9e
            r2 = 0
            if (r1 != 0) goto L18
            java.lang.Object r8 = r8.newInstance(r2)     // Catch: java.lang.Exception -> L9e
            goto L24
        L18:
            if (r1 != r0) goto L9e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L9e
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L9e
            java.lang.Object r8 = r8.newInstance(r1)     // Catch: java.lang.Exception -> L9e
        L24:
            java.util.Iterator r9 = r9.iterator()
        L28:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r9.next()
            飘花落叶言楪子哲兰世苏.飘花落叶言子楪世苏哲兰 r1 = (p291.AbstractC8494) r1
            java.lang.reflect.Field r3 = r1.f23613
            java.lang.Class r4 = r1.f23617
            java.lang.Class<java.lang.Iterable> r5 = java.lang.Iterable.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L28
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 == 0) goto L49
            goto L28
        L49:
            if (r3 == 0) goto L55
            if (r8 == 0) goto L55
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
            r3 = r2
        L56:
            if (r3 != 0) goto L59
            goto L28
        L59:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r4 != r5) goto L66
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L9b
            goto L28
        L66:
            java.lang.Class r5 = java.lang.Byte.TYPE
            if (r4 == r5) goto L8d
            java.lang.Class r5 = java.lang.Short.TYPE
            if (r4 == r5) goto L8d
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r4 == r5) goto L8d
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r4 == r5) goto L8d
            java.lang.Class r5 = java.lang.Float.TYPE
            if (r4 == r5) goto L8d
            java.lang.Class r5 = java.lang.Double.TYPE
            if (r4 != r5) goto L7f
            goto L8d
        L7f:
            java.lang.Class r5 = java.lang.Character.TYPE
            if (r4 != r5) goto L9b
            r4 = r3
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            if (r4 != 0) goto L9b
            goto L28
        L8d:
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L9b
            goto L28
        L9b:
            r1.f23593 = r3
            goto L28
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8479.m14071(java.lang.Class, java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC8523 m14072(C8539 c8539, Class cls) {
        if (cls == Date.class) {
            c8539.getClass();
            return null;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            c8539.getClass();
            return null;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            c8539.getClass();
            return null;
        }
        if (cls == BigDecimal.class) {
            c8539.getClass();
            return null;
        }
        if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        }
        InterfaceC8523 interfaceC8523 = (InterfaceC8523) c8539.f23785.get(cls);
        if (interfaceC8523 instanceof C8453) {
            return null;
        }
        return interfaceC8523;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m14073(C8365 c8365, ArrayList arrayList) {
        String[] strArr = c8365.f23101;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC8494 abstractC8494 = (AbstractC8494) arrayList.get(size);
            String[] strArr2 = c8365.f23101;
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr2[i].equals(abstractC8494.f23618)) {
                    arrayList.remove(size);
                    break;
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public AbstractC8494 mo14047(C8539 c8539, String str, int i, long j, String str2, Locale locale, String str3, Field field, InterfaceC8523 interfaceC8523, Class cls) {
        InterfaceC8523 interfaceC85232;
        Method methodM5798 = (field.getDeclaringClass() == Throwable.class && "stackTrace".equals(field.getName())) ? AbstractC2865.m5798(Throwable.class, "getStackTrace") : null;
        if (methodM5798 != null) {
            return m14067(c8539, Throwable.class, str, i, j, str2, null, str3, methodM5798, interfaceC8523, null);
        }
        Class<?> type = field.getType();
        Type genericType = field.getGenericType();
        if (interfaceC8523 != null) {
            C8421 c8421 = new C8421(str, i, j, str2, null, str3, genericType, type, field, null);
            c8421.f23330 = type;
            if (interfaceC8523 != C8522.f23709) {
                c8421.f23596 = interfaceC8523;
            }
            return c8421;
        }
        if (type == Boolean.TYPE) {
            return new C8508(str, i, j, str2, str3, type, type, field, null);
        }
        if (type == Byte.TYPE) {
            return new C8436(str, i, j, str2, str3, field);
        }
        if (type == Short.TYPE) {
            return new C8434(str, i, j, str2, str3, field);
        }
        if (type == Integer.TYPE) {
            return new C8430(str, i, j, str2, str3, field);
        }
        if (type == Long.TYPE) {
            return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new C8439(str, i, j, str2, str3, field) : new C8422(str, i, j, str2, str3, field);
        }
        if (type == Float.TYPE) {
            return new C8499(str, i, j, str2, str3, field);
        }
        if (type == Float.class) {
            return new C8495(str, i, j, str2, str3, field);
        }
        if (type == Double.TYPE) {
            return new C8506(str, i, str2, str3, field);
        }
        if (type == Double.class) {
            return new C8505(str, i, j, str2, str3, field);
        }
        if (type == Character.TYPE) {
            return new C8510(str, i, j, str2, str3, field);
        }
        if (type == BigInteger.class) {
            return new C8492(str, i, j, str2, str3, field, 2);
        }
        if (type == BigDecimal.class) {
            return new C8492(str, i, j, str2, str3, field, 0);
        }
        if (type == Date.class) {
            return new C8501(str, i, j, str2, str3, field);
        }
        if (type == String.class) {
            return new C8492(str, i, j, str2, str3, field, 8);
        }
        if (type.isEnum()) {
            c8539.getClass();
            C8365 c8365 = new C8365(c8539);
            c8539.m14108(type, c8365);
            boolean z = c8365.f23103;
            if (!z && (interfaceC85232 = (InterfaceC8523) c8539.f23785.get(type)) != null && !(interfaceC85232 instanceof C8453)) {
                z = true;
            }
            if (AbstractC2865.m5817(type, c8539) == null && !z && AbstractC2865.m5816(type) == null) {
                return new C8503(str, i, j, str2, str3, genericType, type, field, null);
            }
        }
        if (type == List.class || type == ArrayList.class) {
            return new C8426(str, genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments()[0] : null, i, j, str2, str3, genericType, type, field, null, cls);
        }
        if (Map.class.isAssignableFrom(type)) {
            return new C8424(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null, cls);
        }
        if (!type.isArray() || type.getComponentType().isPrimitive()) {
            return new C8421(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null);
        }
        Class<?> componentType = type.getComponentType();
        return new C8417(str, componentType, i, j, str2, str3, componentType, type, field);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Type inference failed for: r10v0, types: [飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪世哲] */
    /* JADX WARN: Type inference failed for: r12v0, types: [飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪兰世苏] */
    /* JADX WARN: Type inference failed for: r15v10, types: [飘花落叶言楪子哲兰世苏.飘花落叶言子兰苏哲楪世] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰哲楪世] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p291.AbstractC8494 m14074(java.lang.Class r13, long r14, p291.C8539 r16, p278.C8365 r17, p278.C8363 r18, java.lang.reflect.Field r19) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8479.m14074(java.lang.Class, long, 飘花落叶言楪子哲兰世苏.飘花落叶言楪子世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰, java.lang.reflect.Field):飘花落叶言楪子哲兰世苏.飘花落叶言子楪世苏哲兰");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p291.InterfaceC8523 mo14054(java.lang.Class r33, long r34, final p291.C8539 r36) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8479.mo14054(java.lang.Class, long, 飘花落叶言楪子哲兰世苏.飘花落叶言楪子世苏哲兰):飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪世哲");
    }
}
