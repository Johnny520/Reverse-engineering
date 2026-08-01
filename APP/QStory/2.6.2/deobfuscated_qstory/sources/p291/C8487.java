package p291;

import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.reader.C2770;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
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
import p144.C7546;
import p278.C8362;
import p278.C8364;
import p279.InterfaceC8365;
import p295.InterfaceC8579;
import p295.InterfaceC8585;
import p295.InterfaceC8586;
import p295.InterfaceC8587;
import p296.InterfaceC8591;
import p296.InterfaceC8593;
import p296.InterfaceC8594;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8487 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f23538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8487 f23539 = new C8487();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f23540 = new AtomicInteger();

    static {
        HashMap map = new HashMap();
        f23538 = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new C8490(cls, Predicate.class, "test"));
        Class cls2 = Character.TYPE;
        map.put(cls2, new C8490(cls2, InterfaceC8586.class, "applyAsChar"));
        Class cls3 = Byte.TYPE;
        map.put(cls3, new C8490(cls3, InterfaceC8579.class, "applyAsByte"));
        Class cls4 = Short.TYPE;
        map.put(cls4, new C8490(cls4, InterfaceC8587.class, "applyAsShort"));
        Class cls5 = Integer.TYPE;
        map.put(cls5, new C8490(cls5, ToIntFunction.class, "applyAsInt"));
        Class cls6 = Long.TYPE;
        map.put(cls6, new C8490(cls6, ToLongFunction.class, "applyAsLong"));
        Class cls7 = Float.TYPE;
        map.put(cls7, new C8490(cls7, InterfaceC8585.class, "applyAsFloat"));
        Class cls8 = Double.TYPE;
        map.put(cls8, new C8490(cls8, ToDoubleFunction.class, "applyAsDouble"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static AbstractC8502 m14046(C8547 c8547, Class cls, String str, int i, long j, String str2, String str3, Method method, InterfaceC8531 interfaceC8531, Class cls2) {
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        if (((interfaceC8531 != null || c8547 == null) ? interfaceC8531 : m14053(c8547, returnType)) == null) {
            String name = cls.getName();
            if (name.indexOf(36) == -1 || !name.contains("$$")) {
                Object objM14051 = m14051(cls, method, returnType);
                Field fieldM5769 = AbstractC2864.m5769(method, cls);
                if (returnType == Integer.TYPE) {
                    return new C8440(str, i, j, str2, str3, (Field) null, method, (ToIntFunction) objM14051);
                }
                if (returnType == Long.TYPE) {
                    return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new C8437(str, i, j, str2, str3, fieldM5769, method, (ToLongFunction) objM14051) : new C8517(str, i, j, str2, str3, fieldM5769, method, (ToLongFunction) objM14051);
                }
                if (returnType == Boolean.TYPE) {
                    return new C8515(str, i, j, str2, str3, fieldM5769, method, (Predicate) objM14051);
                }
                if (returnType == Boolean.class) {
                    return new C8520(str, i, j, str2, str3, fieldM5769, method, (Function) objM14051);
                }
                Class<?> cls3 = Short.TYPE;
                if (returnType == cls3) {
                    if (objM14051 == null) {
                        return new C8506(str, i, j, str2, null, str3, cls3, cls3, fieldM5769, method, 1);
                    }
                    C2941.m6336();
                    return null;
                }
                Class<?> cls4 = Byte.TYPE;
                if (returnType == cls4) {
                    if (objM14051 == null) {
                        return new C8445(str, i, j, str2, null, str3, cls4, cls4, fieldM5769, method, 1);
                    }
                    C2941.m6336();
                    return null;
                }
                Class<?> cls5 = Float.TYPE;
                if (returnType == cls5) {
                    if (objM14051 == null) {
                        return new C8500(str, i, j, str2, null, str3, cls5, cls5, fieldM5769, method, 7);
                    }
                    C2941.m6336();
                    return null;
                }
                if (returnType == Float.class) {
                    return new C8499(str, i, j, str2, str3, fieldM5769, method, (Function) objM14051, 3);
                }
                if (returnType == Double.TYPE) {
                    return new C8499(str, i, j, str2, str3, fieldM5769, method, (ToDoubleFunction) objM14051);
                }
                if (returnType == Double.class) {
                    return new C8499(str, i, j, str2, str3, fieldM5769, method, (Function) objM14051, 2);
                }
                Class<?> cls6 = Character.TYPE;
                if (returnType != cls6) {
                    return m14047(c8547, str, i, j, str2, str3, genericReturnType, returnType, fieldM5769, method, (Function) objM14051, cls2);
                }
                if (objM14051 == null) {
                    return new C8500(str, i, j, str2, null, str3, cls6, cls6, fieldM5769, method, 4);
                }
                C2941.m6336();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC8502 m14047(C8547 c8547, String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method, Function function, Class cls2) {
        InterfaceC8531 interfaceC8531;
        if (cls == Byte.class) {
            return new C8446(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Short.class) {
            return new C8505(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Integer.class) {
            return new C8440(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Long.class) {
            return new C8437(str, i, j, str2, str3, field, method, function);
        }
        if (cls == BigInteger.class) {
            return new C8499(str, i, j, str2, str3, method, function, 1);
        }
        if (cls == BigDecimal.class) {
            return new C8499(str, i, j, str2, str3, method, function, 0);
        }
        if (cls == String.class) {
            return new C8541(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Date.class) {
            return new C8517(str, i, j, str2, str3, field, method, function, 1);
        }
        if (cls == LocalDate.class) {
            return new C8435(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (cls == OffsetDateTime.class) {
            return new C8544(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (cls == UUID.class) {
            return new C8542(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new C8517(str, i, j, str2, str3, field, method, function, 0);
        }
        if (cls.isEnum()) {
            if (c8547 == null) {
                c8547 = AbstractC2932.f9292;
            }
            c8547.getClass();
            C8364 c8364 = new C8364(c8547);
            c8547.m14089(cls, c8364);
            boolean z = c8364.f23104;
            if (!z && (interfaceC8531 = (InterfaceC8531) c8547.f23794.get(cls)) != null && !(interfaceC8531 instanceof C8461)) {
                z = true;
            }
            if (!z && AbstractC2864.m5772(cls, c8547) == null && AbstractC2864.m5771(cls) == null) {
                return new C8512(i, j, cls, str, str2, str3, field, method, type, function);
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if ((rawType == List.class || rawType == ArrayList.class) && actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                return type2 == String.class ? new C8499(i, j, cls, str, str2, str3, field, method, type, function) : new C8433(str, i, j, str2, str3, type2, field, method, function, type, cls, cls2);
            }
            if ((rawType instanceof Class) && Map.class.isAssignableFrom((Class) rawType)) {
                return new C8428(str, i, j, str2, str3, type, cls, field, method, function, cls2);
            }
        }
        return Modifier.isFinal(cls.getModifiers()) ? new C8539(i, j, cls, str, str2, str3, field, method, type, function) : new C8540(i, j, cls, str, str2, str3, field, method, type, function);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC8502 m14048(C8547 c8547, Class cls, String str, int i, long j, String str2, Locale locale, String str3, Method method, InterfaceC8531 interfaceC8531, Class cls2) {
        String str4;
        method.setAccessible(true);
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        InterfaceC8531 interfaceC8531M14053 = (interfaceC8531 != null || c8547 == null) ? interfaceC8531 : m14053(c8547, returnType);
        if (interfaceC8531M14053 != null) {
            C8543 c8543 = new C8543(str, i, j, str2, locale, str3, genericReturnType, returnType, null, method);
            c8543.f23339 = returnType;
            if (interfaceC8531M14053 != C8530.f23718) {
                c8543.f23605 = interfaceC8531M14053;
            }
            return c8543;
        }
        String strM5759 = str == null ? AbstractC2864.m5759(method, false, null) : str;
        Field fieldM5769 = (j & 4611686018427387904L) != 0 ? null : AbstractC2864.m5769(method, cls);
        if (returnType == Boolean.TYPE || returnType == Boolean.class) {
            return new C8498(strM5759, i, j, str2, str3, returnType, returnType, fieldM5769, method);
        }
        if (returnType == Integer.TYPE || returnType == Integer.class) {
            return new C8439(strM5759, i, j, str2, str3, returnType, returnType, fieldM5769, method);
        }
        if (returnType == Float.TYPE || returnType == Float.class) {
            return new C8500(strM5759, i, j, str2, null, str3, returnType, returnType, fieldM5769, method, 6);
        }
        if (returnType == Double.TYPE || returnType == Double.class) {
            return new C8500(strM5759, i, j, str2, null, str3, returnType, returnType, fieldM5769, method, 5);
        }
        if (returnType == Long.TYPE || returnType == Long.class) {
            String str5 = strM5759;
            if (str2 == null || str2.isEmpty() || "string".equals(str2)) {
                return new C8448(str5, i, j, str2, str3, returnType, fieldM5769, method);
            }
            return new C8509(str5, i, j, str2, str3, returnType, returnType, fieldM5769, method, 2);
        }
        if (returnType == Short.TYPE || returnType == Short.class) {
            return new C8506(strM5759, i, j, str2, null, str3, returnType, returnType, fieldM5769, method, 0);
        }
        if (returnType == Byte.TYPE || returnType == Byte.class) {
            return new C8445(strM5759, i, j, str2, null, str3, returnType, returnType, fieldM5769, method, 0);
        }
        if (returnType == Character.TYPE || returnType == Character.class) {
            return new C8500(strM5759, i, j, str2, null, str3, returnType, returnType, fieldM5769, method, 3);
        }
        if (returnType == BigDecimal.class) {
            return new C8500(strM5759, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, null, method, 1);
        }
        String str6 = strM5759;
        boolean zWriteEnumAsJavaBean = true;
        if (returnType.isEnum() && AbstractC2864.m5772(returnType, c8547) == null) {
            Annotation[] annotationArrM5775 = AbstractC2864.m5775(returnType);
            int length = annotationArrM5775.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    zWriteEnumAsJavaBean = false;
                    break;
                }
                Annotation annotation = annotationArrM5775[i2];
                InterfaceC8365 interfaceC8365 = (InterfaceC8365) AbstractC2864.m5774(annotation, InterfaceC8365.class);
                if (interfaceC8365 != null) {
                    zWriteEnumAsJavaBean = interfaceC8365.writeEnumAsJavaBean();
                    break;
                }
                Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                String name = clsAnnotationType.getName();
                C8364 c8364 = new C8364(AbstractC2932.f9292);
                if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (AbstractC2932.f9286) {
                        AbstractC2864.m5766(annotation.getClass(), new C2770(annotation, c8364, 8));
                    }
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                    AbstractC2864.m5766(clsAnnotationType, new C2770(c8364, annotation, 9));
                }
                if (c8364.f23104) {
                    break;
                }
                i2++;
            }
            if (!zWriteEnumAsJavaBean && AbstractC2864.m5771(returnType) == null) {
                return new C8504(str6, i, j, str2, str3, returnType, returnType, fieldM5769, method);
            }
        }
        if (returnType == Date.class) {
            if (str2 != null) {
                String strTrim = str2.trim();
                str4 = strTrim.isEmpty() ? null : strTrim;
            } else {
                str4 = str2;
            }
            return new C8509(str6, i, j, str4, str3, returnType, returnType, fieldM5769, method, 1);
        }
        if (returnType == String.class) {
            return new C8500(str6, i, j, str2, null, str3, String.class, String.class, fieldM5769, method, 9);
        }
        if (returnType == List.class || returnType == Iterable.class) {
            return new C8436(str6, genericReturnType instanceof ParameterizedType ? ((ParameterizedType) genericReturnType).getActualTypeArguments()[0] : Object.class, i, j, str2, str3, genericReturnType, returnType, null, method, cls2);
        }
        return Map.class.isAssignableFrom(returnType) ? new C8427(str6, i, j, str2, locale, str3, genericReturnType, returnType, null, method, cls2) : (returnType == Float[].class || returnType == Double[].class || returnType == BigDecimal[].class) ? new C8425(str6, returnType.getComponentType(), i, j, str2, str3, genericReturnType, returnType, fieldM5769, method) : new C8543(str6, i, j, str2, locale, str3, genericReturnType, returnType, null, method);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14049(C8364 c8364, C8532 c8532) {
        for (Class cls : c8364.f23096) {
            if (InterfaceC8593.class.isAssignableFrom(cls)) {
                try {
                    InterfaceC8593 interfaceC8593 = (InterfaceC8593) cls.newInstance();
                    if (interfaceC8593 instanceof InterfaceC8594) {
                        c8532.getClass();
                        c8532.f23724 = true;
                    }
                    if (interfaceC8593 instanceof InterfaceC8591) {
                        c8532.getClass();
                        c8532.f23724 = true;
                    } else {
                        c8532.getClass();
                    }
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m14050(Class cls, C8547 c8547, C8364 c8364, boolean z, C8362 c8362, Method method) {
        char cCharAt;
        String str = c8362.f23050;
        if (str != null && !str.isEmpty()) {
            return c8362.f23050;
        }
        if (z) {
            return method.getName();
        }
        String strM5759 = AbstractC2864.m5759(method, c8364.f23094, c8364.f23105);
        c8547.getClass();
        int length = strM5759.length();
        char cCharAt2 = length > 0 ? strM5759.charAt(0) : (char) 0;
        if ((length == 1 && cCharAt2 >= 'a' && cCharAt2 <= 'z') || (length > 2 && cCharAt2 >= 'A' && cCharAt2 <= 'Z' && (cCharAt = strM5759.charAt(1)) >= 'A' && cCharAt <= 'Z')) {
            char[] charArray = strM5759.toCharArray();
            if (cCharAt2 >= 'a') {
                charArray[0] = (char) (charArray[0] - ' ');
            } else {
                charArray[0] = (char) (charArray[0] + ' ');
            }
            Field fieldM5768 = AbstractC2864.m5768(cls, new String(charArray));
            if (fieldM5768 != null && (length == 1 || Modifier.isPublic(fieldM5768.getModifiers()))) {
                return fieldM5768.getName();
            }
        }
        return strM5759;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m14051(Class cls, Method method, Class cls2) {
        MethodType methodType;
        MethodType methodType2;
        MethodType methodType3;
        String str;
        MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(cls);
        C8490 c8490 = (C8490) f23538.get(cls2);
        if (c8490 != null) {
            methodType = c8490.f23560;
            methodType2 = c8490.f23559;
            str = c8490.f23561;
            methodType3 = c8490.f23558;
        } else {
            methodType = MethodType.methodType(cls2);
            methodType2 = AbstractC2866.f9062;
            methodType3 = AbstractC2866.f9058;
            str = "apply";
        }
        String str2 = str;
        MethodType methodType4 = methodType3;
        try {
            MethodHandle methodHandleFindVirtual = lookupM5723.findVirtual(cls, method.getName(), methodType);
            return (Object) LambdaMetafactory.metafactory(lookupM5723, str2, methodType2, methodType4, methodHandleFindVirtual, methodHandleFindVirtual.type()).getTarget().invoke();
        } catch (Throwable th) {
            C7546.m12746("create fieldLambdaGetter error, method : ", method, th);
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
    public static void m14052(java.lang.Class r8, java.util.ArrayList r9) {
        /*
            r0 = 1
            java.lang.reflect.Constructor r8 = com.alibaba.fastjson2.util.AbstractC2864.m5767(r8, r0)
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
            飘花落叶言楪子哲兰世苏.飘花落叶言子楪世苏哲兰 r1 = (p291.AbstractC8502) r1
            java.lang.reflect.Field r3 = r1.f23622
            java.lang.Class r4 = r1.f23626
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
            r1.f23602 = r3
            goto L28
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8487.m14052(java.lang.Class, java.util.ArrayList):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC8531 m14053(C8547 c8547, Class cls) {
        if (cls == Date.class) {
            c8547.getClass();
            return null;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            c8547.getClass();
            return null;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            c8547.getClass();
            return null;
        }
        if (cls == BigDecimal.class) {
            c8547.getClass();
            return null;
        }
        if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        }
        InterfaceC8531 interfaceC8531 = (InterfaceC8531) c8547.f23794.get(cls);
        if (interfaceC8531 instanceof C8461) {
            return null;
        }
        return interfaceC8531;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m14054(C8364 c8364, ArrayList arrayList) {
        String[] strArr = c8364.f23102;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC8502 abstractC8502 = (AbstractC8502) arrayList.get(size);
            String[] strArr2 = c8364.f23102;
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr2[i].equals(abstractC8502.f23627)) {
                    arrayList.remove(size);
                    break;
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public AbstractC8502 mo14028(C8547 c8547, String str, int i, long j, String str2, Locale locale, String str3, Field field, InterfaceC8531 interfaceC8531, Class cls) {
        InterfaceC8531 interfaceC85312;
        Method methodM5753 = (field.getDeclaringClass() == Throwable.class && "stackTrace".equals(field.getName())) ? AbstractC2864.m5753(Throwable.class, "getStackTrace") : null;
        if (methodM5753 != null) {
            return m14048(c8547, Throwable.class, str, i, j, str2, null, str3, methodM5753, interfaceC8531, null);
        }
        Class<?> type = field.getType();
        Type genericType = field.getGenericType();
        if (interfaceC8531 != null) {
            C8429 c8429 = new C8429(str, i, j, str2, null, str3, genericType, type, field, null);
            c8429.f23339 = type;
            if (interfaceC8531 != C8530.f23718) {
                c8429.f23605 = interfaceC8531;
            }
            return c8429;
        }
        if (type == Boolean.TYPE) {
            return new C8516(str, i, j, str2, str3, type, type, field, null);
        }
        if (type == Byte.TYPE) {
            return new C8444(str, i, j, str2, str3, field);
        }
        if (type == Short.TYPE) {
            return new C8442(str, i, j, str2, str3, field);
        }
        if (type == Integer.TYPE) {
            return new C8438(str, i, j, str2, str3, field);
        }
        if (type == Long.TYPE) {
            return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new C8447(str, i, j, str2, str3, field) : new C8430(str, i, j, str2, str3, field);
        }
        if (type == Float.TYPE) {
            return new C8507(str, i, j, str2, str3, field);
        }
        if (type == Float.class) {
            return new C8503(str, i, j, str2, str3, field);
        }
        if (type == Double.TYPE) {
            return new C8514(str, i, str2, str3, field);
        }
        if (type == Double.class) {
            return new C8513(str, i, j, str2, str3, field);
        }
        if (type == Character.TYPE) {
            return new C8518(str, i, j, str2, str3, field);
        }
        if (type == BigInteger.class) {
            return new C8500(str, i, j, str2, str3, field, 2);
        }
        if (type == BigDecimal.class) {
            return new C8500(str, i, j, str2, str3, field, 0);
        }
        if (type == Date.class) {
            return new C8509(str, i, j, str2, str3, field);
        }
        if (type == String.class) {
            return new C8500(str, i, j, str2, str3, field, 8);
        }
        if (type.isEnum()) {
            c8547.getClass();
            C8364 c8364 = new C8364(c8547);
            c8547.m14089(type, c8364);
            boolean z = c8364.f23104;
            if (!z && (interfaceC85312 = (InterfaceC8531) c8547.f23794.get(type)) != null && !(interfaceC85312 instanceof C8461)) {
                z = true;
            }
            if (AbstractC2864.m5772(type, c8547) == null && !z && AbstractC2864.m5771(type) == null) {
                return new C8511(str, i, j, str2, str3, genericType, type, field, null);
            }
        }
        if (type == List.class || type == ArrayList.class) {
            return new C8434(str, genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments()[0] : null, i, j, str2, str3, genericType, type, field, null, cls);
        }
        if (Map.class.isAssignableFrom(type)) {
            return new C8432(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null, cls);
        }
        if (!type.isArray() || type.getComponentType().isPrimitive()) {
            return new C8429(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null);
        }
        Class<?> componentType = type.getComponentType();
        return new C8425(str, componentType, i, j, str2, str3, componentType, type, field);
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
    public final p291.AbstractC8502 m14055(java.lang.Class r13, long r14, p291.C8547 r16, p278.C8364 r17, p278.C8362 r18, java.lang.reflect.Field r19) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8487.m14055(java.lang.Class, long, 飘花落叶言楪子哲兰世苏.飘花落叶言楪子世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世哲苏兰, java.lang.reflect.Field):飘花落叶言楪子哲兰世苏.飘花落叶言子楪世苏哲兰");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p291.InterfaceC8531 mo14035(java.lang.Class r33, long r34, final p291.C8547 r36) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8487.mo14035(java.lang.Class, long, 飘花落叶言楪子哲兰世苏.飘花落叶言楪子世苏哲兰):飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪世哲");
    }
}
