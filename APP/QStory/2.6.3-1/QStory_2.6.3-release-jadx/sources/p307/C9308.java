package p307;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.reader.C3604;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.annotation.Annotation;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import p160.C8376;
import p294.C9192;
import p294.C9194;
import p295.InterfaceC9195;
import p311.InterfaceC9400;
import p311.InterfaceC9406;
import p311.InterfaceC9407;
import p311.InterfaceC9408;
import p312.InterfaceC9412;
import p312.InterfaceC9414;
import p312.InterfaceC9415;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9308 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final HashMap f23874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9308 f23875 = new C9308();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f23876 = new AtomicInteger();

    static {
        HashMap map = new HashMap();
        f23874 = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new C9311(cls, Predicate.class, "test"));
        Class cls2 = Character.TYPE;
        map.put(cls2, new C9311(cls2, InterfaceC9407.class, "applyAsChar"));
        Class cls3 = Byte.TYPE;
        map.put(cls3, new C9311(cls3, InterfaceC9400.class, "applyAsByte"));
        Class cls4 = Short.TYPE;
        map.put(cls4, new C9311(cls4, InterfaceC9408.class, "applyAsShort"));
        Class cls5 = Integer.TYPE;
        map.put(cls5, new C9311(cls5, ToIntFunction.class, "applyAsInt"));
        Class cls6 = Long.TYPE;
        map.put(cls6, new C9311(cls6, ToLongFunction.class, "applyAsLong"));
        Class cls7 = Float.TYPE;
        map.put(cls7, new C9311(cls7, InterfaceC9406.class, "applyAsFloat"));
        Class cls8 = Double.TYPE;
        map.put(cls8, new C9311(cls8, ToDoubleFunction.class, "applyAsDouble"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static AbstractC9323 m14624(C9368 c9368, Class cls, String str, int i, long j, String str2, String str3, Method method, InterfaceC9352 interfaceC9352, Class cls2) {
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        if (((interfaceC9352 != null || c9368 == null) ? interfaceC9352 : m14631(c9368, returnType)) == null) {
            String name = cls.getName();
            if (name.indexOf(36) == -1 || !name.contains("$$")) {
                Object objM14629 = m14629(cls, method, returnType);
                Field fieldM6374 = AbstractC3698.m6374(method, cls);
                if (returnType == Integer.TYPE) {
                    return new C9261(str, i, j, str2, str3, (Field) null, method, (ToIntFunction) objM14629);
                }
                if (returnType == Long.TYPE) {
                    return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new C9258(str, i, j, str2, str3, fieldM6374, method, (ToLongFunction) objM14629) : new C9338(str, i, j, str2, str3, fieldM6374, method, (ToLongFunction) objM14629);
                }
                if (returnType == Boolean.TYPE) {
                    return new C9336(str, i, j, str2, str3, fieldM6374, method, (Predicate) objM14629);
                }
                if (returnType == Boolean.class) {
                    return new C9341(str, i, j, str2, str3, fieldM6374, method, (Function) objM14629);
                }
                Class<?> cls3 = Short.TYPE;
                if (returnType == cls3) {
                    if (objM14629 == null) {
                        return new C9327(str, i, j, str2, null, str3, cls3, cls3, fieldM6374, method, 1);
                    }
                    C3775.m6954();
                    return null;
                }
                Class<?> cls4 = Byte.TYPE;
                if (returnType == cls4) {
                    if (objM14629 == null) {
                        return new C9266(str, i, j, str2, null, str3, cls4, cls4, fieldM6374, method, 1);
                    }
                    C3775.m6954();
                    return null;
                }
                Class<?> cls5 = Float.TYPE;
                if (returnType == cls5) {
                    if (objM14629 == null) {
                        return new C9321(str, i, j, str2, null, str3, cls5, cls5, fieldM6374, method, 7);
                    }
                    C3775.m6954();
                    return null;
                }
                if (returnType == Float.class) {
                    return new C9320(str, i, j, str2, str3, fieldM6374, method, (Function) objM14629, 3);
                }
                if (returnType == Double.TYPE) {
                    return new C9320(str, i, j, str2, str3, fieldM6374, method, (ToDoubleFunction) objM14629);
                }
                if (returnType == Double.class) {
                    return new C9320(str, i, j, str2, str3, fieldM6374, method, (Function) objM14629, 2);
                }
                Class<?> cls6 = Character.TYPE;
                if (returnType != cls6) {
                    return m14625(c9368, str, i, j, str2, str3, genericReturnType, returnType, fieldM6374, method, (Function) objM14629, cls2);
                }
                if (objM14629 == null) {
                    return new C9321(str, i, j, str2, null, str3, cls6, cls6, fieldM6374, method, 4);
                }
                C3775.m6954();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC9323 m14625(C9368 c9368, String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method, Function function, Class cls2) {
        InterfaceC9352 interfaceC9352;
        if (cls == Byte.class) {
            return new C9267(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Short.class) {
            return new C9326(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Integer.class) {
            return new C9261(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Long.class) {
            return new C9258(str, i, j, str2, str3, field, method, function);
        }
        if (cls == BigInteger.class) {
            return new C9320(str, i, j, str2, str3, method, function, 1);
        }
        if (cls == BigDecimal.class) {
            return new C9320(str, i, j, str2, str3, method, function, 0);
        }
        if (cls == String.class) {
            return new C9362(str, i, j, str2, str3, field, method, function);
        }
        if (cls == Date.class) {
            return new C9338(str, i, j, str2, str3, field, method, function, 1);
        }
        if (cls == LocalDate.class) {
            return new C9256(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (cls == OffsetDateTime.class) {
            return new C9365(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (cls == UUID.class) {
            return new C9363(i, j, cls, str, str2, str3, field, method, type, function);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new C9338(str, i, j, str2, str3, field, method, function, 0);
        }
        if (cls.isEnum()) {
            if (c9368 == null) {
                c9368 = AbstractC3766.f9639;
            }
            c9368.getClass();
            C9194 c9194 = new C9194(c9368);
            c9368.m14667(cls, c9194);
            boolean z = c9194.f23448;
            if (!z && (interfaceC9352 = (InterfaceC9352) c9368.f24130.get(cls)) != null && !(interfaceC9352 instanceof C9282)) {
                z = true;
            }
            if (!z && AbstractC3698.m6377(cls, c9368) == null && AbstractC3698.m6376(cls) == null) {
                return new C9333(i, j, cls, str, str2, str3, field, method, type, function);
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if ((rawType == List.class || rawType == ArrayList.class) && actualTypeArguments.length == 1) {
                Type type2 = actualTypeArguments[0];
                return type2 == String.class ? new C9320(i, j, cls, str, str2, str3, field, method, type, function) : new C9254(str, i, j, str2, str3, type2, field, method, function, type, cls, cls2);
            }
            if ((rawType instanceof Class) && Map.class.isAssignableFrom((Class) rawType)) {
                return new C9249(str, i, j, str2, str3, type, cls, field, method, function, cls2);
            }
        }
        return Modifier.isFinal(cls.getModifiers()) ? new C9360(i, j, cls, str, str2, str3, field, method, type, function) : new C9361(i, j, cls, str, str2, str3, field, method, type, function);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC9323 m14626(C9368 c9368, Class cls, String str, int i, long j, String str2, Locale locale, String str3, Method method, InterfaceC9352 interfaceC9352, Class cls2) {
        String str4;
        method.setAccessible(true);
        Class<?> returnType = method.getReturnType();
        Type genericReturnType = method.getGenericReturnType();
        InterfaceC9352 interfaceC9352M14631 = (interfaceC9352 != null || c9368 == null) ? interfaceC9352 : m14631(c9368, returnType);
        if (interfaceC9352M14631 != null) {
            C9364 c9364 = new C9364(str, i, j, str2, locale, str3, genericReturnType, returnType, null, method);
            c9364.f23675 = returnType;
            if (interfaceC9352M14631 != C9351.f24054) {
                c9364.f23941 = interfaceC9352M14631;
            }
            return c9364;
        }
        String strM6364 = str == null ? AbstractC3698.m6364(method, false, null) : str;
        Field fieldM6374 = (j & 4611686018427387904L) != 0 ? null : AbstractC3698.m6374(method, cls);
        if (returnType == Boolean.TYPE || returnType == Boolean.class) {
            return new C9319(strM6364, i, j, str2, str3, returnType, returnType, fieldM6374, method);
        }
        if (returnType == Integer.TYPE || returnType == Integer.class) {
            return new C9260(strM6364, i, j, str2, str3, returnType, returnType, fieldM6374, method);
        }
        if (returnType == Float.TYPE || returnType == Float.class) {
            return new C9321(strM6364, i, j, str2, null, str3, returnType, returnType, fieldM6374, method, 6);
        }
        if (returnType == Double.TYPE || returnType == Double.class) {
            return new C9321(strM6364, i, j, str2, null, str3, returnType, returnType, fieldM6374, method, 5);
        }
        if (returnType == Long.TYPE || returnType == Long.class) {
            String str5 = strM6364;
            if (str2 == null || str2.isEmpty() || "string".equals(str2)) {
                return new C9269(str5, i, j, str2, str3, returnType, fieldM6374, method);
            }
            return new C9330(str5, i, j, str2, str3, returnType, returnType, fieldM6374, method, 2);
        }
        if (returnType == Short.TYPE || returnType == Short.class) {
            return new C9327(strM6364, i, j, str2, null, str3, returnType, returnType, fieldM6374, method, 0);
        }
        if (returnType == Byte.TYPE || returnType == Byte.class) {
            return new C9266(strM6364, i, j, str2, null, str3, returnType, returnType, fieldM6374, method, 0);
        }
        if (returnType == Character.TYPE || returnType == Character.class) {
            return new C9321(strM6364, i, j, str2, null, str3, returnType, returnType, fieldM6374, method, 3);
        }
        if (returnType == BigDecimal.class) {
            return new C9321(strM6364, i, j, str2, null, str3, BigDecimal.class, BigDecimal.class, null, method, 1);
        }
        String str6 = strM6364;
        boolean zWriteEnumAsJavaBean = true;
        if (returnType.isEnum() && AbstractC3698.m6377(returnType, c9368) == null) {
            Annotation[] annotationArrM6380 = AbstractC3698.m6380(returnType);
            int length = annotationArrM6380.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    zWriteEnumAsJavaBean = false;
                    break;
                }
                Annotation annotation = annotationArrM6380[i2];
                InterfaceC9195 interfaceC9195 = (InterfaceC9195) AbstractC3698.m6379(annotation, InterfaceC9195.class);
                if (interfaceC9195 != null) {
                    zWriteEnumAsJavaBean = interfaceC9195.writeEnumAsJavaBean();
                    break;
                }
                Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                String name = clsAnnotationType.getName();
                C9194 c9194 = new C9194(AbstractC3766.f9639);
                if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                    if (AbstractC3766.f9633) {
                        AbstractC3698.m6371(annotation.getClass(), new C3604(annotation, c9194, 8));
                    }
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                    AbstractC3698.m6371(clsAnnotationType, new C3604(c9194, annotation, 9));
                }
                if (c9194.f23448) {
                    break;
                }
                i2++;
            }
            if (!zWriteEnumAsJavaBean && AbstractC3698.m6376(returnType) == null) {
                return new C9325(str6, i, j, str2, str3, returnType, returnType, fieldM6374, method);
            }
        }
        if (returnType == Date.class) {
            if (str2 != null) {
                String strTrim = str2.trim();
                str4 = strTrim.isEmpty() ? null : strTrim;
            } else {
                str4 = str2;
            }
            return new C9330(str6, i, j, str4, str3, returnType, returnType, fieldM6374, method, 1);
        }
        if (returnType == String.class) {
            return new C9321(str6, i, j, str2, null, str3, String.class, String.class, fieldM6374, method, 9);
        }
        if (returnType == List.class || returnType == Iterable.class) {
            return new C9257(str6, genericReturnType instanceof ParameterizedType ? ((ParameterizedType) genericReturnType).getActualTypeArguments()[0] : Object.class, i, j, str2, str3, genericReturnType, returnType, null, method, cls2);
        }
        return Map.class.isAssignableFrom(returnType) ? new C9248(str6, i, j, str2, locale, str3, genericReturnType, returnType, null, method, cls2) : (returnType == Float[].class || returnType == Double[].class || returnType == BigDecimal[].class) ? new C9246(str6, returnType.getComponentType(), i, j, str2, str3, genericReturnType, returnType, fieldM6374, method) : new C9364(str6, i, j, str2, locale, str3, genericReturnType, returnType, null, method);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14627(C9194 c9194, C9353 c9353) {
        for (Class cls : c9194.f23440) {
            if (InterfaceC9414.class.isAssignableFrom(cls)) {
                try {
                    InterfaceC9414 interfaceC9414 = (InterfaceC9414) cls.newInstance();
                    if (interfaceC9414 instanceof InterfaceC9415) {
                        c9353.getClass();
                        c9353.f24060 = true;
                    }
                    if (interfaceC9414 instanceof InterfaceC9412) {
                        c9353.getClass();
                        c9353.f24060 = true;
                    } else {
                        c9353.getClass();
                    }
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m14628(Class cls, C9368 c9368, C9194 c9194, boolean z, C9192 c9192, Method method) {
        char cCharAt;
        String str = c9192.f23394;
        if (str != null && !str.isEmpty()) {
            return c9192.f23394;
        }
        if (z) {
            return method.getName();
        }
        String strM6364 = AbstractC3698.m6364(method, c9194.f23438, c9194.f23449);
        c9368.getClass();
        int length = strM6364.length();
        char cCharAt2 = length > 0 ? strM6364.charAt(0) : (char) 0;
        if ((length == 1 && cCharAt2 >= 'a' && cCharAt2 <= 'z') || (length > 2 && cCharAt2 >= 'A' && cCharAt2 <= 'Z' && (cCharAt = strM6364.charAt(1)) >= 'A' && cCharAt <= 'Z')) {
            char[] charArray = strM6364.toCharArray();
            if (cCharAt2 >= 'a') {
                charArray[0] = (char) (charArray[0] - ' ');
            } else {
                charArray[0] = (char) (charArray[0] + ' ');
            }
            Field fieldM6373 = AbstractC3698.m6373(cls, new String(charArray));
            if (fieldM6373 != null && (length == 1 || Modifier.isPublic(fieldM6373.getModifiers()))) {
                return fieldM6373.getName();
            }
        }
        return strM6364;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m14629(Class cls, Method method, Class cls2) {
        MethodType methodType;
        MethodType methodType2;
        MethodType methodType3;
        String str;
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(cls);
        C9311 c9311 = (C9311) f23874.get(cls2);
        if (c9311 != null) {
            methodType = c9311.f23896;
            methodType2 = c9311.f23895;
            str = c9311.f23897;
            methodType3 = c9311.f23894;
        } else {
            methodType = MethodType.methodType(cls2);
            methodType2 = AbstractC3700.f9409;
            methodType3 = AbstractC3700.f9405;
            str = "apply";
        }
        String str2 = str;
        MethodType methodType4 = methodType3;
        try {
            MethodHandle methodHandleFindVirtual = lookupM6328.findVirtual(cls, method.getName(), methodType);
            return (Object) LambdaMetafactory.metafactory(lookupM6328, str2, methodType2, methodType4, methodHandleFindVirtual, methodHandleFindVirtual.type()).getTarget().invoke();
        } catch (Throwable th) {
            C8376.m13334("create fieldLambdaGetter error, method : ", method, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0028 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m14630(Class cls, ArrayList arrayList) {
        Object objNewInstance;
        Object obj;
        Constructor constructorM6372 = AbstractC3698.m6372(cls, true);
        if (constructorM6372 == null) {
            return;
        }
        int parameterCount = constructorM6372.getParameterCount();
        try {
            constructorM6372.setAccessible(true);
            if (parameterCount == 0) {
                objNewInstance = constructorM6372.newInstance(null);
            } else if (parameterCount != 1) {
                return;
            } else {
                objNewInstance = constructorM6372.newInstance(Boolean.TRUE);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC9323 abstractC9323 = (AbstractC9323) it.next();
                Field field = abstractC9323.f23958;
                Class cls2 = abstractC9323.f23962;
                if (!Iterable.class.isAssignableFrom(cls2) && !Map.class.isAssignableFrom(cls2)) {
                    if (field == null || objNewInstance == null) {
                        obj = null;
                        if (obj != null) {
                            if (cls2 == Boolean.TYPE) {
                                if (!obj.equals(Boolean.FALSE)) {
                                    abstractC9323.f23938 = obj;
                                }
                            } else if (cls2 == Byte.TYPE || cls2 == Short.TYPE || cls2 == Integer.TYPE || cls2 == Long.TYPE || cls2 == Float.TYPE || cls2 == Double.TYPE) {
                                if (((Number) obj).doubleValue() != 0.0d) {
                                    abstractC9323.f23938 = obj;
                                }
                            } else if (cls2 != Character.TYPE || ((Character) obj).charValue() != 0) {
                                abstractC9323.f23938 = obj;
                            }
                        }
                    } else {
                        try {
                            field.setAccessible(true);
                            obj = field.get(objNewInstance);
                        } catch (Throwable unused) {
                            obj = null;
                        }
                        if (obj != null) {
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static InterfaceC9352 m14631(C9368 c9368, Class cls) {
        if (cls == Date.class) {
            c9368.getClass();
            return null;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            c9368.getClass();
            return null;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            c9368.getClass();
            return null;
        }
        if (cls == BigDecimal.class) {
            c9368.getClass();
            return null;
        }
        if (!Enum.class.isAssignableFrom(cls)) {
            return null;
        }
        InterfaceC9352 interfaceC9352 = (InterfaceC9352) c9368.f24130.get(cls);
        if (interfaceC9352 instanceof C9282) {
            return null;
        }
        return interfaceC9352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m14632(C9194 c9194, ArrayList arrayList) {
        String[] strArr = c9194.f23446;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC9323 abstractC9323 = (AbstractC9323) arrayList.get(size);
            String[] strArr2 = c9194.f23446;
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr2[i].equals(abstractC9323.f23963)) {
                    arrayList.remove(size);
                    break;
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public AbstractC9323 mo14606(C9368 c9368, String str, int i, long j, String str2, Locale locale, String str3, Field field, InterfaceC9352 interfaceC9352, Class cls) {
        InterfaceC9352 interfaceC93522;
        Method methodM6358 = (field.getDeclaringClass() == Throwable.class && "stackTrace".equals(field.getName())) ? AbstractC3698.m6358(Throwable.class, "getStackTrace") : null;
        if (methodM6358 != null) {
            return m14626(c9368, Throwable.class, str, i, j, str2, null, str3, methodM6358, interfaceC9352, null);
        }
        Class<?> type = field.getType();
        Type genericType = field.getGenericType();
        if (interfaceC9352 != null) {
            C9250 c9250 = new C9250(str, i, j, str2, null, str3, genericType, type, field, null);
            c9250.f23675 = type;
            if (interfaceC9352 != C9351.f24054) {
                c9250.f23941 = interfaceC9352;
            }
            return c9250;
        }
        if (type == Boolean.TYPE) {
            return new C9337(str, i, j, str2, str3, type, type, field, null);
        }
        if (type == Byte.TYPE) {
            return new C9265(str, i, j, str2, str3, field);
        }
        if (type == Short.TYPE) {
            return new C9263(str, i, j, str2, str3, field);
        }
        if (type == Integer.TYPE) {
            return new C9259(str, i, j, str2, str3, field);
        }
        if (type == Long.TYPE) {
            return (str2 == null || str2.isEmpty() || "string".equals(str2)) ? new C9268(str, i, j, str2, str3, field) : new C9251(str, i, j, str2, str3, field);
        }
        if (type == Float.TYPE) {
            return new C9328(str, i, j, str2, str3, field);
        }
        if (type == Float.class) {
            return new C9324(str, i, j, str2, str3, field);
        }
        if (type == Double.TYPE) {
            return new C9335(str, i, str2, str3, field);
        }
        if (type == Double.class) {
            return new C9334(str, i, j, str2, str3, field);
        }
        if (type == Character.TYPE) {
            return new C9339(str, i, j, str2, str3, field);
        }
        if (type == BigInteger.class) {
            return new C9321(str, i, j, str2, str3, field, 2);
        }
        if (type == BigDecimal.class) {
            return new C9321(str, i, j, str2, str3, field, 0);
        }
        if (type == Date.class) {
            return new C9330(str, i, j, str2, str3, field);
        }
        if (type == String.class) {
            return new C9321(str, i, j, str2, str3, field, 8);
        }
        if (type.isEnum()) {
            c9368.getClass();
            C9194 c9194 = new C9194(c9368);
            c9368.m14667(type, c9194);
            boolean z = c9194.f23448;
            if (!z && (interfaceC93522 = (InterfaceC9352) c9368.f24130.get(type)) != null && !(interfaceC93522 instanceof C9282)) {
                z = true;
            }
            if (AbstractC3698.m6377(type, c9368) == null && !z && AbstractC3698.m6376(type) == null) {
                return new C9332(str, i, j, str2, str3, genericType, type, field, null);
            }
        }
        if (type == List.class || type == ArrayList.class) {
            return new C9255(str, genericType instanceof ParameterizedType ? ((ParameterizedType) genericType).getActualTypeArguments()[0] : null, i, j, str2, str3, genericType, type, field, null, cls);
        }
        if (Map.class.isAssignableFrom(type)) {
            return new C9253(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null, cls);
        }
        if (!type.isArray() || type.getComponentType().isPrimitive()) {
            return new C9250(str, i, j, str2, locale, str3, field.getGenericType(), type, field, null);
        }
        Class<?> componentType = type.getComponentType();
        return new C9246(str, componentType, i, j, str2, str3, componentType, type, field);
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
    */
    public final AbstractC9323 m14633(Class cls, long j, C9368 c9368, C9194 c9194, C9192 c9192, Field field) {
        String name;
        ?? M14581;
        String str;
        Class cls2;
        InterfaceC9352 interfaceC9352;
        Class cls3;
        InterfaceC9352 interfaceC93522;
        String[] strArr;
        c9192.f23390 = j;
        ArrayList arrayList = c9368.f24126;
        for (int i = 0; i < arrayList.size(); i++) {
            ((C9350) arrayList.get(i)).f24051.m14095(c9194, c9192, cls, field);
        }
        if (!c9192.f23389 && !AbstractC3700.m6495(field.getType())) {
            String str2 = c9192.f23394;
            if (str2 == null || str2.isEmpty()) {
                name = field.getName();
                String str3 = c9194.f23449;
                if (str3 != null) {
                    name = AbstractC3698.m6386(name, str3);
                }
            } else {
                name = c9192.f23394;
            }
            if (c9194.f23447 != null) {
                int i2 = 0;
                boolean z = false;
                while (true) {
                    strArr = c9194.f23447;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (name.equals(strArr[i2])) {
                        c9192.f23391 = i2;
                        z = true;
                    }
                    i2++;
                }
                if (!z && c9192.f23391 == 0) {
                    c9192.f23391 = strArr.length;
                }
            }
            if (c9192.f23391 == 0 && name.equals(c9194.f23437)) {
                c9192.f23391 = -1;
            }
            String[] strArr2 = c9194.f23439;
            if (strArr2 != null && strArr2.length > 0) {
                for (String str4 : strArr2) {
                    if (!str4.equals(name)) {
                    }
                }
            }
            Class cls4 = c9192.f23405;
            if (cls4 != null) {
                try {
                    Constructor declaredConstructor = cls4.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    M14581 = (InterfaceC9352) declaredConstructor.newInstance(null);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    C1123.m1403("create writeUsing Writer error", e);
                    return null;
                }
            } else {
                M14581 = 0;
            }
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
            if (M14581 == 0 && c9192.f23408) {
                M14581 = C9351.f24054;
            }
            if (M14581 == 0) {
                Class<?> type = field.getType();
                if (type == Date.class) {
                    InterfaceC9352 interfaceC93523 = (InterfaceC9352) c9368.f24130.get(type);
                    if (interfaceC93523 != C9305.f23863) {
                        M14581 = interfaceC93523;
                    }
                } else if (Map.class.isAssignableFrom(type) && ((cls2 = c9192.f23409) != null || c9192.f23410 != null)) {
                    if (cls2 != null) {
                        try {
                            Constructor declaredConstructor2 = cls2.getDeclaredConstructor(null);
                            declaredConstructor2.setAccessible(true);
                            interfaceC9352 = (InterfaceC9352) declaredConstructor2.newInstance(null);
                        } catch (Exception unused2) {
                            interfaceC9352 = null;
                        }
                        cls3 = c9192.f23410;
                        if (cls3 == null) {
                            try {
                                Constructor declaredConstructor3 = cls3.getDeclaredConstructor(null);
                                declaredConstructor3.setAccessible(true);
                                interfaceC93522 = (InterfaceC9352) declaredConstructor3.newInstance(null);
                            } catch (Exception unused3) {
                                interfaceC93522 = null;
                            }
                            if (interfaceC9352 == null || interfaceC93522 != null) {
                                M14581 = C9291.m14581(field.getType(), null, type);
                                M14581.f23784 = interfaceC9352;
                                M14581.f23783 = interfaceC93522;
                            }
                        } else {
                            interfaceC93522 = null;
                            if (interfaceC9352 == null) {
                                M14581 = C9291.m14581(field.getType(), null, type);
                                M14581.f23784 = interfaceC9352;
                                M14581.f23783 = interfaceC93522;
                            }
                        }
                    } else {
                        interfaceC9352 = null;
                        cls3 = c9192.f23410;
                        if (cls3 == null) {
                        }
                    }
                }
            }
            ?? r10 = M14581;
            String str5 = c9192.f23393;
            return mo14606(c9368, name, c9192.f23391, c9192.f23390, (str5 != null || (str = c9194.f23431) == null) ? str5 : str, c9192.f23401, c9192.f23392, field, r10, c9192.f23398);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC9352 mo14613(Class cls, long j, final C9368 c9368) {
        long j2;
        C9194 c9194;
        Class cls2;
        ArrayList arrayList;
        C9353 c9344;
        C9353 c93442;
        final Class cls3 = cls;
        c9368.getClass();
        final C9194 c91942 = new C9194(c9368);
        c91942.f23445 |= 18014398509481984L;
        c9368.m14667(cls3, c91942);
        Class cls4 = c91942.f23442;
        if (cls4 != null && InterfaceC9352.class.isAssignableFrom(cls4)) {
            try {
                return (InterfaceC9352) c91942.f23442.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                C1123.m1403("create serializer error", e);
                return null;
            }
        }
        boolean zM6350 = AbstractC3698.m6350(cls3);
        long j3 = c91942.f23444;
        if (c91942.f23432 != null) {
            j3 &= ~JSONWriter$Feature.WriteClassName.mask;
        }
        final long j4 = j | j3;
        boolean z = (JSONWriter$Feature.FieldBased.mask & j4) != 0;
        boolean z2 = (z && (zM6350 || cls3.isInterface())) ? false : z;
        final C9192 c9192 = new C9192();
        if (z2) {
            final TreeMap treeMap = new TreeMap();
            final int i = 0;
            Consumer consumer = new Consumer(this) { // from class: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪世兰苏

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C9308 f23870;

                {
                    this.f23870 = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i2 = i;
                    AbstractMap abstractMap = treeMap;
                    switch (i2) {
                        case 0:
                            TreeMap treeMap2 = (TreeMap) abstractMap;
                            C9192 c91922 = c9192;
                            c91922.m14424();
                            AbstractC9323 abstractC9323M14633 = this.f23870.m14633(cls3, j4, c9368, c91942, c91922, (Field) obj);
                            if (abstractC9323M14633 != null) {
                                if (c91922.f23405 != null && (abstractC9323M14633 instanceof C9250)) {
                                    ((C9250) abstractC9323M14633).f23673 = true;
                                }
                                treeMap2.put(abstractC9323M14633.f23963, abstractC9323M14633);
                            }
                            break;
                        default:
                            LinkedHashMap linkedHashMap = (LinkedHashMap) abstractMap;
                            Field field = (Field) obj;
                            C9192 c91923 = c9192;
                            c91923.m14424();
                            c91923.f23389 = (field.getModifiers() & 1) == 0;
                            AbstractC9323 abstractC9323M146332 = this.f23870.m14633(cls3, j4, c9368, c91942, c91923, field);
                            if (abstractC9323M146332 != null) {
                                String str = abstractC9323M146332.f23963;
                                if (c91923.f23405 != null && (abstractC9323M146332 instanceof C9250)) {
                                    ((C9250) abstractC9323M146332).f23673 = true;
                                }
                                AbstractC9323 abstractC9323 = (AbstractC9323) linkedHashMap.putIfAbsent(str, abstractC9323M146332);
                                if (abstractC9323 != null && abstractC9323.compareTo(abstractC9323M146332) > 0) {
                                    linkedHashMap.put(str, abstractC9323M146332);
                                    break;
                                }
                            }
                            break;
                    }
                }
            };
            cls2 = cls3;
            AbstractC3698.m6384(cls2, consumer);
            arrayList = new ArrayList(treeMap.values());
            c9194 = c91942;
            j2 = 0;
        } else {
            new ArrayList();
            Iterator it = c9368.f24126.iterator();
            while (it.hasNext()) {
                ((C9350) it.next()).getClass();
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!zM6350) {
                final int i2 = 1;
                Consumer consumer2 = new Consumer(this) { // from class: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪世兰苏

                    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                    public final /* synthetic */ C9308 f23870;

                    {
                        this.f23870 = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i22 = i2;
                        AbstractMap abstractMap = linkedHashMap;
                        switch (i22) {
                            case 0:
                                TreeMap treeMap2 = (TreeMap) abstractMap;
                                C9192 c91922 = c9192;
                                c91922.m14424();
                                AbstractC9323 abstractC9323M14633 = this.f23870.m14633(cls3, j4, c9368, c91942, c91922, (Field) obj);
                                if (abstractC9323M14633 != null) {
                                    if (c91922.f23405 != null && (abstractC9323M14633 instanceof C9250)) {
                                        ((C9250) abstractC9323M14633).f23673 = true;
                                    }
                                    treeMap2.put(abstractC9323M14633.f23963, abstractC9323M14633);
                                }
                                break;
                            default:
                                LinkedHashMap linkedHashMap2 = (LinkedHashMap) abstractMap;
                                Field field = (Field) obj;
                                C9192 c91923 = c9192;
                                c91923.m14424();
                                c91923.f23389 = (field.getModifiers() & 1) == 0;
                                AbstractC9323 abstractC9323M146332 = this.f23870.m14633(cls3, j4, c9368, c91942, c91923, field);
                                if (abstractC9323M146332 != null) {
                                    String str = abstractC9323M146332.f23963;
                                    if (c91923.f23405 != null && (abstractC9323M146332 instanceof C9250)) {
                                        ((C9250) abstractC9323M146332).f23673 = true;
                                    }
                                    AbstractC9323 abstractC9323 = (AbstractC9323) linkedHashMap2.putIfAbsent(str, abstractC9323M146332);
                                    if (abstractC9323 != null && abstractC9323.compareTo(abstractC9323M146332) > 0) {
                                        linkedHashMap2.put(str, abstractC9323M146332);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                cls3 = cls3;
                AbstractC3698.m6384(cls3, consumer2);
            }
            Class clsMo6186 = c9368.mo6186(cls3);
            boolean z3 = c91942.f23438;
            j2 = 0;
            Class cls5 = cls3;
            C9310 c9310 = new C9310(this, c9192, j4, c91942, c9368, cls5, zM6350, linkedHashMap, 0);
            c9194 = c91942;
            cls2 = cls5;
            AbstractC3698.m6363(cls2, clsMo6186, z3, c9310);
            arrayList = new ArrayList(linkedHashMap.values());
        }
        ArrayList arrayList2 = arrayList;
        long j5 = j | c9194.f23444;
        if (!z2 && Throwable.class.isAssignableFrom(cls2)) {
            return new C9295(cls2, null, null, j5, arrayList2);
        }
        m14632(c9194, arrayList2);
        if (c9194.f23429) {
            Collections.sort(arrayList2);
        }
        if (AbstractC3698.m6360(cls2)) {
            Type genericSuperclass = cls2.getGenericSuperclass();
            Class superclass = cls2.getSuperclass();
            Function functionIdentity = Function.identity();
            AbstractC9366.f24121.getClass();
            arrayList2.add(m14625(null, "$super$", 0, 0L, null, null, genericSuperclass, superclass, null, null, functionIdentity, null));
        }
        m14630(cls2, arrayList2);
        String name = cls2.getName();
        if (!"com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(name) && !"com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(name) && c9194.f23427 == null) {
            switch (arrayList2.size()) {
                case 1:
                    if ((((AbstractC9323) arrayList2.get(0)).f23956 & 281474976710656L) == j2) {
                        c93442 = new C9344(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                        c9344 = c93442;
                    }
                    c9344 = null;
                    break;
                case 2:
                    c93442 = new C9343(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 3:
                    c93442 = new C9342(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 4:
                    c93442 = new C9358(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 5:
                    c93442 = new C9359(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 6:
                    c93442 = new C9355(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 7:
                    c93442 = new C9354(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 8:
                    c93442 = new C9357(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 9:
                    c93442 = new C9356(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 10:
                    c93442 = new C9347(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 11:
                    c93442 = new C9346(cls, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
                case 12:
                    c93442 = new C9345(cls2, c9194.f23437, c9194.f23436, j5, arrayList2);
                    c9344 = c93442;
                    break;
            }
        } else {
            c9344 = null;
        }
        if (c9344 == null) {
            String str = c9194.f23427;
            String str2 = c9194.f23437;
            String str3 = c9194.f23436;
            c9344 = str != null ? new C9344(cls, str2, str3, str, j5, arrayList2) : new C9353(cls, str2, str3, j5, arrayList2);
        }
        if (c9194.f23440 != null) {
            m14627(c9194, c9344);
        }
        return c9344;
    }
}
