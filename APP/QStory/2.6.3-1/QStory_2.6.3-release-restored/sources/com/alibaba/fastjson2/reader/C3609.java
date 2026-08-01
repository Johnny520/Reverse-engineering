package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.core.view.C3075;
import bsh.C3497;
import bsh.C3502;
import com.alibaba.fastjson2.AbstractC3740;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3678;
import java.lang.annotation.Annotation;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.bytebuddy.description.method.ParameterDescription;
import p025.AbstractC7012;
import p294.C9192;
import p294.C9194;
import p295.InterfaceC9196;
import p309.AbstractC9396;
import p311.InterfaceC9401;
import p311.InterfaceC9402;
import p311.InterfaceC9403;
import p311.InterfaceC9404;
import p311.InterfaceC9405;
import p313.AbstractC9420;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3609 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f8820;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3609 f8821;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f8822;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AtomicInteger f8823 = new AtomicInteger();

    static {
        f8822 = (AbstractC3687.f9274 || AbstractC3687.f9273) ? false : true;
        f8821 = new C3609();
        HashMap map = new HashMap();
        f8820 = map;
        Class cls = Boolean.TYPE;
        map.put(cls, new C3606(cls, InterfaceC9405.class));
        Class cls2 = Byte.TYPE;
        map.put(cls2, new C3606(cls2, InterfaceC9404.class));
        Class cls3 = Short.TYPE;
        map.put(cls3, new C3606(cls3, InterfaceC9401.class));
        Class cls4 = Integer.TYPE;
        map.put(cls4, new C3606(cls4, ObjIntConsumer.class));
        Class cls5 = Long.TYPE;
        map.put(cls5, new C3606(cls5, ObjLongConsumer.class));
        Class cls6 = Character.TYPE;
        map.put(cls6, new C3606(cls6, InterfaceC9403.class));
        Class cls7 = Float.TYPE;
        map.put(cls7, new C3606(cls7, InterfaceC9402.class));
        Class cls8 = Double.TYPE;
        map.put(cls8, new C3606(cls8, ObjDoubleConsumer.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static AbstractC3595[] m6148(LinkedHashMap linkedHashMap) {
        AbstractC3595[] abstractC3595Arr = new AbstractC3595[linkedHashMap.values().stream().mapToInt(new C3607(0)).sum()];
        ((List) linkedHashMap.values().stream().flatMap(new C3602(4)).collect(Collectors.toList())).toArray(abstractC3595Arr);
        Arrays.sort(abstractC3595Arr);
        return abstractC3595Arr;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6149(LinkedHashMap linkedHashMap, String str, AbstractC3595 abstractC3595, Class cls) {
        AbstractC3595 abstractC35952;
        List list = (List) linkedHashMap.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractC3595);
            linkedHashMap.put(str, arrayList);
            return;
        }
        boolean zMo6045 = abstractC3595.mo6045();
        Method method = abstractC3595.f8772;
        Field field = abstractC3595.f8769;
        if (zMo6045) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                abstractC35952 = null;
                break;
            }
            abstractC35952 = (AbstractC3595) list.get(i);
            Field field2 = abstractC35952.f8769;
            if (field2 != null) {
                String name = field2.getName();
                if ((field != null && name.equals(field.getName())) || (method != null && name.equals(AbstractC3595.m6130(abstractC3595)))) {
                    break;
                }
                if (abstractC35952.f8772 != null) {
                    String strM6130 = AbstractC3595.m6130(abstractC35952);
                    if (method != null) {
                        String strM61302 = AbstractC3595.m6130(abstractC3595);
                        if (strM6130 != null && strM6130.equals(strM61302)) {
                            break;
                        }
                    }
                    if (field != null && strM6130 != null && strM6130.equals(field.getName())) {
                        break;
                    }
                }
                i++;
            }
        }
        if (abstractC35952 == null) {
            list.add(abstractC3595);
            return;
        }
        if (abstractC35952.compareTo(abstractC3595) <= 0) {
            Field field3 = abstractC35952.f8769;
            if (field3 != null && field3.getDeclaringClass() == cls) {
                return;
            }
            Method method2 = abstractC35952.f8772;
            if (method2 != null && method2.getDeclaringClass().isAssignableFrom(cls)) {
                return;
            }
        }
        list.set(list.indexOf(abstractC35952), abstractC3595);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m6150(Class cls, Method method, Class cls2) {
        MethodType methodType;
        MethodType methodType2;
        MethodType methodType3;
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(cls);
        Class<?> returnType = method.getReturnType();
        C3606 c3606 = (C3606) f8820.get(cls2);
        Class<?> cls3 = Void.TYPE;
        try {
            if (c3606 != null) {
                methodType = c3606.f8816;
                methodType2 = c3606.f8814;
                if (returnType == cls3) {
                    methodType3 = c3606.f8815;
                }
                if (methodType3 == null) {
                    methodType3 = MethodType.methodType(returnType, (Class<?>) cls2);
                }
                return (Object) LambdaMetafactory.metafactory(lookupM6328, "accept", methodType2, methodType, lookupM6328.findVirtual(cls, method.getName(), methodType3), MethodType.methodType(cls3, cls, cls2)).getTarget().invoke();
            }
            methodType = AbstractC3700.f9407;
            methodType2 = AbstractC3700.f9403;
            return (Object) LambdaMetafactory.metafactory(lookupM6328, "accept", methodType2, methodType, lookupM6328.findVirtual(cls, method.getName(), methodType3), MethodType.methodType(cls3, cls, cls2)).getTarget().invoke();
        } catch (Throwable th) {
            C1123.m1403("create fieldReader error", th);
            return null;
        }
        methodType3 = null;
        if (methodType3 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC3621 m6151(C3635 c3635, Type type, Class cls, C9192 c9192) {
        InterfaceC3621 interfaceC3621M6193;
        InterfaceC3621 interfaceC3621;
        Class cls2;
        InterfaceC3621 interfaceC3621M6068;
        InterfaceC3621 interfaceC3621M14425 = c9192.m14425();
        if (interfaceC3621M14425 == null && ((c9192.f23409 != null || c9192.f23410 != null) && Map.class.isAssignableFrom(cls))) {
            Class cls3 = c9192.f23409;
            InterfaceC3621 interfaceC36212 = null;
            if (cls3 != null) {
                try {
                    Constructor declaredConstructor = cls3.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    interfaceC3621 = (InterfaceC3621) declaredConstructor.newInstance(null);
                } catch (Exception unused) {
                    interfaceC3621 = null;
                }
                cls2 = c9192.f23410;
                if (cls2 != null) {
                    try {
                        Constructor declaredConstructor2 = cls2.getDeclaredConstructor(null);
                        declaredConstructor2.setAccessible(true);
                        interfaceC36212 = (InterfaceC3621) declaredConstructor2.newInstance(null);
                    } catch (Exception unused2) {
                    }
                }
                if (interfaceC3621 == null || interfaceC36212 != null) {
                    interfaceC3621M6068 = C3547.m6068(type, cls, c9192.f23390);
                    if (interfaceC3621M6068 instanceof C3548) {
                        C3548 c3548 = (C3548) interfaceC3621M6068;
                        if (interfaceC3621 != null) {
                            c3548.f8621 = interfaceC3621;
                        }
                        if (interfaceC36212 != null) {
                            c3548.f8620 = interfaceC36212;
                        }
                        return c3548;
                    }
                }
            } else {
                interfaceC3621 = null;
                cls2 = c9192.f23410;
                if (cls2 != null) {
                }
                if (interfaceC3621 == null) {
                    interfaceC3621M6068 = C3547.m6068(type, cls, c9192.f23390);
                    if (interfaceC3621M6068 instanceof C3548) {
                    }
                }
            }
        }
        if (interfaceC3621M14425 != null) {
            return interfaceC3621M14425;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            interfaceC3621M6193 = c3635.m6193(Long.class, false);
            if (interfaceC3621M6193 == C3537.f8566) {
                return interfaceC3621M14425;
            }
        } else if (cls == BigDecimal.class) {
            interfaceC3621M6193 = c3635.m6193(BigDecimal.class, false);
            if (interfaceC3621M6193 == C3566.f8685) {
                return interfaceC3621M14425;
            }
        } else if (cls == BigInteger.class) {
            interfaceC3621M6193 = c3635.m6193(BigInteger.class, false);
            if (interfaceC3621M6193 == C3537.f8552) {
                return interfaceC3621M14425;
            }
        } else if (cls != Date.class || (interfaceC3621M6193 = c3635.m6193(Date.class, false)) == C3574.f8723) {
            return interfaceC3621M14425;
        }
        return interfaceC3621M6193;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m6152(Class cls, Type type, String str, String[] strArr, C9192 c9192, Field field, LinkedHashMap linkedHashMap, C3635 c3635) {
        String strM6386;
        String[] strArr2;
        int i;
        int i2;
        String str2;
        c3635.m6182(c9192, cls, field);
        if (!c9192.f23389 || ((c9192.f23390 & 562949953421312L) != 0 && Map.class.isAssignableFrom(field.getType()))) {
            String str3 = c9192.f23394;
            if (str3 == null || str3.isEmpty()) {
                String name = field.getName();
                strM6386 = str != null ? AbstractC3698.m6386(name, str) : name;
            } else {
                strM6386 = c9192.f23394;
            }
            if (strArr != null && strArr.length > 0) {
                int i3 = 0;
                while (true) {
                    if (i3 < strArr.length) {
                        if (strM6386.equals(strArr[i3])) {
                            c9192.f23391 = i3;
                            break;
                        }
                        i3++;
                    } else if (c9192.f23391 == 0) {
                        c9192.f23391 = strArr.length;
                    }
                }
            }
            Type genericType = field.getGenericType();
            Class<?> type2 = field.getType();
            InterfaceC3621 interfaceC3621M6151 = m6151(c3635, genericType, type2, c9192);
            String str4 = c9192.f23402;
            if (c9192.f23396 && str4 == null) {
                str4 = "{\"required\":true}";
            }
            String str5 = str4;
            String str6 = strM6386;
            String str7 = str6;
            m6149(linkedHashMap, str7, m6154(cls, type, str6, c9192.f23391, c9192.f23390, c9192.f23393, c9192.f23401, c9192.f23404, str5, genericType, type2, field, interfaceC3621M6151, c9192.f23395, c9192.m14426()), cls);
            C9192 c91922 = c9192;
            String[] strArr3 = c91922.f23406;
            if (strArr3 != null) {
                int length = strArr3.length;
                int i4 = 0;
                while (i4 < length) {
                    String str8 = strArr3[i4];
                    if (str7.equals(str8)) {
                        str2 = str7;
                        strArr2 = strArr3;
                        i = length;
                        i2 = i4;
                    } else {
                        strArr2 = strArr3;
                        i = length;
                        i2 = i4;
                        str2 = str7;
                        m6149(linkedHashMap, str8, m6154(cls, type, str8, 0, c91922.f23390, null, c91922.f23401, c91922.f23404, str5, genericType, field.getType(), field, null, null, null), cls);
                    }
                    i4 = i2 + 1;
                    c91922 = c9192;
                    str7 = str2;
                    strArr3 = strArr2;
                    length = i;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC3595 m6153(Class cls, Type type, String str, Type type2, Class cls2, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, BiConsumer biConsumer, InterfaceC3621 interfaceC3621) {
        Method method2;
        Type type3;
        Class clsM6502;
        Type type4;
        Class cls3;
        if (interfaceC3621 != null) {
            C3525 c3525 = new C3525(i, j | 2251799813685248L, jSONSchema, cls2, obj, str, str2, null, method, type2, locale, biConsumer);
            c3525.f8509 = interfaceC3621;
            return c3525;
        }
        if (cls2 == Integer.class) {
            return new C3588(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer, 6);
        }
        if (cls2 == Long.class) {
            return new C3588(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer, 7);
        }
        if (cls2 == String.class) {
            return new C3513(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer);
        }
        if (cls2 == Boolean.class) {
            return new C3588(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer, 2);
        }
        if (cls2 == Short.class) {
            return new C3588(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer, 5);
        }
        if (cls2 == Byte.class) {
            return new C3588(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer, 8);
        }
        if (cls2 == BigDecimal.class) {
            return new C3588(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer, 0);
        }
        if (cls2 == BigInteger.class) {
            return new C3588(str, cls2, i, j, str2, locale, obj, jSONSchema, method, biConsumer, 1);
        }
        if (cls2 == Float.class) {
            return new C3588(str, cls2, i, j, str2, locale, (Float) obj, jSONSchema, method, biConsumer, 4);
        }
        if (cls2 == Double.class) {
            return new C3588(str, cls2, i, j, str2, locale, (Double) obj, jSONSchema, method, biConsumer, 3);
        }
        if (cls2 == Number.class) {
            return new C3588(str, cls2, i, j, str2, locale, (Number) obj, jSONSchema, method, biConsumer, 9);
        }
        if (cls2 == Date.class) {
            return new C3590(i, j, jSONSchema, cls2, obj, str, str2, null, method, type2, locale, biConsumer);
        }
        if (type2 instanceof Class) {
            method2 = method;
            type3 = null;
            clsM6502 = null;
        } else {
            method2 = method;
            Type typeM6375 = AbstractC3698.m6375(type == null ? null : AbstractC3740.m6912(type), cls, method2, type2);
            clsM6502 = AbstractC3700.m6502(typeM6375);
            type3 = typeM6375;
        }
        if (cls2 != List.class && cls2 != ArrayList.class) {
            C3592 c3592 = new C3592(str, type3 == null ? type2 : type3, cls2, i, j, str2, locale, obj, jSONSchema, method2, null, biConsumer, 18);
            c3592.f8509 = null;
            return c3592;
        }
        if (type3 instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type3).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                type4 = actualTypeArguments[0];
                Class clsM65022 = AbstractC3700.m6502(type4);
                cls3 = clsM65022;
                if (clsM65022 == String.class) {
                    return new C3585(str, type3, clsM6502, String.class, String.class, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer);
                }
            } else {
                type4 = Object.class;
                cls3 = type4;
            }
        }
        boolean z = type3 == null;
        Type type5 = type4;
        if (z) {
            type3 = type2;
        }
        if (z) {
            clsM6502 = cls2;
        }
        return new C3585(str, type3, clsM6502, type5, cls3, i, j, str2, locale, obj, jSONSchema, method, null, biConsumer);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC3595 m6154(Class cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Field field, InterfaceC3621 interfaceC3621, String str4, BiConsumer biConsumer) {
        JSONSchema jSONSchemaM6197;
        Type typeM6375;
        Class clsM6502;
        Object objApply = obj;
        if ((objApply instanceof String) && cls2.isEnum()) {
            objApply = Enum.valueOf(cls2, (String) objApply);
        }
        Type type3 = null;
        if (objApply != null && objApply.getClass() != cls2) {
            Function functionM6191 = AbstractC3766.m6947().m6191(objApply.getClass(), type2);
            if (functionM6191 == null) {
                StringBuilder sb = new StringBuilder("illegal defaultValue : ");
                sb.append(objApply);
                sb.append(", class ");
                C1123.m1410(AbstractC7012.m12148(cls2, sb));
                return null;
            }
            objApply = functionM6191.apply(objApply);
        }
        Object obj2 = objApply;
        if (str3 == null || str3.isEmpty()) {
            jSONSchemaM6197 = null;
        } else {
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(str3);
            if (!jSONObjectM6934.isEmpty()) {
                jSONSchemaM6197 = JSONSchema.m6197(jSONObjectM6934, cls2);
            }
        }
        if (field != null) {
            String name = cls.getName();
            if (!name.startsWith("java.lang") && !name.startsWith("java.time") && !field.getDeclaringClass().getName().startsWith("java.lang") && !field.getDeclaringClass().getName().startsWith("java.time")) {
                field.setAccessible(true);
            }
        }
        if (interfaceC3621 != null) {
            C3524 c3524 = new C3524(str, type2, cls2, i, j | 2251799813685248L, str2, locale, obj2, jSONSchemaM6197, field);
            c3524.f8509 = interfaceC3621;
            return c3524;
        }
        if (cls2 == Integer.TYPE) {
            return new C3587(str, cls2, cls2, i, 0L, str2, null, (Integer) obj2, jSONSchemaM6197, field);
        }
        if (cls2 == Integer.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Integer) obj2, jSONSchemaM6197, field, 11);
        }
        if (cls2 == Long.TYPE) {
            return new C3584(str, cls2, cls2, i, j, str2, null, (Long) obj2, jSONSchemaM6197, field);
        }
        if (cls2 == Long.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Long) obj2, jSONSchemaM6197, field, 13);
        }
        if (cls2 == Short.TYPE) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Short) obj2, jSONSchemaM6197, field, 10);
        }
        if (cls2 == Short.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Short) obj2, jSONSchemaM6197, field, 9);
        }
        Class cls3 = Boolean.TYPE;
        if (cls2 == cls3) {
            return new C3593(str, cls3, cls3, i, j, str2, null, (Boolean) obj2, jSONSchemaM6197, field);
        }
        if (cls2 == Boolean.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Boolean) obj2, jSONSchemaM6197, field, 2);
        }
        if (cls2 == Byte.TYPE) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Byte) obj2, jSONSchemaM6197, field, 16);
        }
        if (cls2 == Byte.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Byte) obj2, jSONSchemaM6197, field, 15);
        }
        if (cls2 == Float.TYPE) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Float) obj2, jSONSchemaM6197, field, 8);
        }
        if (cls2 == Float.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Float) obj2, jSONSchemaM6197, field, 7);
        }
        if (cls2 == Double.TYPE) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Double) obj2, jSONSchemaM6197, field, 6);
        }
        if (cls2 == Double.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (Double) obj2, jSONSchemaM6197, field, 5);
        }
        Class cls4 = Character.TYPE;
        if (cls2 == cls4) {
            return new C3589(str, cls4, cls4, i, j, str2, null, (Character) obj2, jSONSchemaM6197, field, 3);
        }
        if (cls2 == BigDecimal.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (BigDecimal) obj2, jSONSchemaM6197, field, 0);
        }
        if (cls2 == BigInteger.class) {
            return new C3589(str, cls2, cls2, i, j, str2, null, (BigInteger) obj2, jSONSchemaM6197, field, 1);
        }
        if (cls2 == String.class) {
            return new C3522(str, cls2, i, j, str2, (String) obj2, jSONSchemaM6197, field);
        }
        if (type2 == String[].class) {
            return new C3592(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, null, field);
        }
        if (cls2 == Date.class) {
            return new C3590(i, j, jSONSchemaM6197, cls2, obj2, str, str2, field, null, type2, locale, null);
        }
        if (cls2 == AtomicBoolean.class) {
            return new C3598(str, cls2, cls2, i, 0L, str2, null, (AtomicBoolean) obj2, jSONSchemaM6197, null, field, 0);
        }
        if (cls2 == AtomicReference.class) {
            return new C3596(str, type2, cls2, i, str2, jSONSchemaM6197, field);
        }
        if (type2 instanceof Class) {
            typeM6375 = null;
            clsM6502 = null;
        } else {
            typeM6375 = AbstractC3698.m6375(AbstractC3740.m6912(type), cls, field, type2);
            clsM6502 = AbstractC3700.m6502(typeM6375);
        }
        boolean zIsFinal = Modifier.isFinal(field.getModifiers());
        if (Collection.class.isAssignableFrom(cls2)) {
            if (typeM6375 instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) typeM6375).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type4 = actualTypeArguments[0];
                    Class cls5 = clsM6502;
                    Class clsM65022 = AbstractC3700.m6502(type4);
                    if (clsM65022 != String.class) {
                        return new C3521(str, typeM6375, cls5, type4, clsM65022, i, j, str2, locale, (Collection) obj2, jSONSchemaM6197, field);
                    }
                    if (!zIsFinal) {
                        return new C3521(str, typeM6375, cls5, String.class, String.class, i, j, str2, locale, null, jSONSchemaM6197, field);
                    }
                    if ((j & JSONReader$Feature.FieldBased.mask) != 0) {
                        return new C3521(str, typeM6375, cls5, String.class, String.class, i, j, str2, locale, null, jSONSchemaM6197, field);
                    }
                    return new C3589(i, j, jSONSchemaM6197, cls5, null, str, str2, field, null, typeM6375, null, null);
                }
            }
            if (type2 instanceof ParameterizedType) {
                Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                if (actualTypeArguments2.length > 0) {
                    type3 = actualTypeArguments2[0];
                }
            }
            if (type3 == null) {
                type3 = Object.class;
            }
            Type type5 = type3;
            return new C3521(str, type2, cls2, type5, AbstractC3700.m6504(type5), i, j, str2, locale, (Collection) obj2, jSONSchemaM6197, field);
        }
        Type type6 = typeM6375;
        if (Map.class.isAssignableFrom(cls2) && (type6 instanceof ParameterizedType) && ((ParameterizedType) type6).getActualTypeArguments().length == 2 && zIsFinal && (j & JSONReader$Feature.FieldBased.mask) == 0) {
            return new C3517(str, type6, clsM6502, i, j, str2, jSONSchemaM6197, field, str4, biConsumer);
        }
        if (zIsFinal) {
            if (cls2 == int[].class) {
                return new C3589(str, cls2, cls2, i, j, str2, null, (int[]) obj2, jSONSchemaM6197, field, 12);
            }
            if (cls2 == long[].class) {
                return new C3589(str, cls2, cls2, i, j, str2, null, (long[]) obj2, jSONSchemaM6197, field, 14);
            }
        }
        if (clsM6502 != null) {
            long j2 = j & 562949953421312L;
            return (j2 == 0 || !Map.class.isAssignableFrom(clsM6502)) ? Map.class.isAssignableFrom(clsM6502) ? j2 != 0 ? new C3517(str, type6, cls2, i, j, str2, jSONSchemaM6197, field, str4, biConsumer) : new C3518(str, type6, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, field, str4, biConsumer) : new C3524(str, type6, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, field) : new C3517(str, type6, cls2, i, j, str2, jSONSchemaM6197, field, str4, biConsumer);
        }
        if (cls2 == LocalDateTime.class) {
            return new C3519(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, null, field, str2 != null ? new C3529(str2, locale) : C3529.f8516);
        }
        if (cls2 == ZonedDateTime.class) {
            return new C3515(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, null, field, str2 == null ? C3626.f8980 : new C3626(str2, locale));
        }
        if (cls2 == Instant.class) {
            return new C3582(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, null, field, str2 == null ? C3558.f8638 : new C3558(str2, locale));
        }
        return new C3524(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, field);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3570 m6155(Class cls, Method method, C3635 c3635) throws NoSuchMethodException {
        Class clsMo6186;
        C9192 c9192 = new C9192();
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; enumArr != null && i < enumArr.length; i++) {
            Enum r4 = enumArr[i];
            String strName = r4.name();
            linkedHashMap.put(Long.valueOf(AbstractC3693.m6334(strName)), r4);
            try {
                c9192.m14424();
                c3635.m6182(c9192, cls, cls.getField(strName));
                String str = c9192.f23394;
                if (str != null && !str.isEmpty() && !str.equals(strName)) {
                    linkedHashMap.putIfAbsent(Long.valueOf(AbstractC3693.m6334(str)), r4);
                }
                String[] strArr = c9192.f23406;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2 != null && !str2.isEmpty()) {
                            linkedHashMap.putIfAbsent(Long.valueOf(AbstractC3693.m6334(str2)), r4);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        for (int i2 = 0; enumArr != null && i2 < enumArr.length; i2++) {
            Enum r3 = enumArr[i2];
            String strName2 = r3.name();
            linkedHashMap.putIfAbsent(Long.valueOf(AbstractC3693.m6333(strName2)), r3);
            String string = r3.toString();
            if (!strName2.equals(string)) {
                linkedHashMap.putIfAbsent(Long.valueOf(AbstractC3693.m6333(string)), r3);
            }
        }
        int size = linkedHashMap.size();
        long[] jArr = new long[size];
        Iterator it = linkedHashMap.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        Arrays.sort(jArr);
        Member memberM6377 = AbstractC3698.m6377(cls, c3635);
        if (memberM6377 == null && c3635.f9025.size() > 0 && (clsMo6186 = c3635.mo6186(cls)) != null) {
            Member memberM63772 = AbstractC3698.m6377(clsMo6186, c3635);
            if (memberM63772 instanceof Field) {
                try {
                    memberM6377 = cls.getField(((Field) memberM63772).getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused2) {
                }
            } else if (memberM63772 instanceof Method) {
                memberM6377 = cls.getMethod(((Method) memberM63772).getName(), null);
            }
        }
        Member member = memberM6377;
        Enum[] enumArr2 = new Enum[size];
        for (int i4 = 0; i4 < size; i4++) {
            enumArr2[i4] = (Enum) linkedHashMap.get(Long.valueOf(jArr[i4]));
        }
        return new C3570(cls, method, member, enumArr2, enumArr, jArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Function m6156(Method method) {
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(method.getDeclaringClass());
        try {
            MethodHandle methodHandleFindVirtual = lookupM6328.findVirtual(method.getDeclaringClass(), method.getName(), MethodType.methodType(method.getReturnType()));
            MethodType methodTypeType = methodHandleFindVirtual.type();
            return (Function) (Object) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9409, methodTypeType.erase(), methodHandleFindVirtual, methodTypeType).getTarget().invoke();
        } catch (Throwable th) {
            C1123.m1403("create fieldReader error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C3631 m6157(Constructor constructor, String... strArr) {
        constructor.setAccessible(true);
        C3579 c3579 = new C3579(null, constructor, null, null, null, strArr);
        Class declaringClass = constructor.getDeclaringClass();
        return new C3631(declaringClass, null, null, 0L, c3579, m6161(AbstractC3766.m6947(), declaringClass, declaringClass, constructor, constructor.getParameters(), strArr), null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC3595 m6158(Class cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Method method, InterfaceC3621 interfaceC3621, String str4, BiConsumer biConsumer) {
        JSONSchema jSONSchemaM6197;
        Type type3;
        Class cls3;
        Type typeM6375;
        Class clsM6502;
        Field field;
        int i2;
        Field field2;
        Type type4;
        String str5;
        int i3;
        long j2;
        String str6;
        Locale locale2;
        Method method2;
        String str7;
        BiConsumer biConsumer2;
        Type type5;
        Object objApply = obj;
        if (method != null) {
            method.setAccessible(true);
        }
        if ((objApply instanceof String) && cls2.isEnum()) {
            objApply = Enum.valueOf(cls2, (String) objApply);
        }
        if (objApply != null && objApply.getClass() != cls2) {
            Function functionM6191 = AbstractC3766.m6947().m6191(objApply.getClass(), type2);
            if (functionM6191 == null) {
                StringBuilder sb = new StringBuilder("illegal defaultValue : ");
                sb.append(objApply);
                sb.append(", class ");
                C1123.m1410(AbstractC7012.m12148(cls2, sb));
                return null;
            }
            objApply = functionM6191.apply(objApply);
        }
        Object obj2 = objApply;
        if (str3 == null || str3.isEmpty()) {
            jSONSchemaM6197 = null;
        } else {
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(str3);
            if (!jSONObjectM6934.isEmpty()) {
                jSONSchemaM6197 = JSONSchema.m6197(jSONObjectM6934, cls2);
            }
        }
        if (interfaceC3621 != null) {
            C3525 c3525 = new C3525(i, j | 2251799813685248L, jSONSchemaM6197, cls2, obj2, str, str2, null, method, type2, locale, null);
            c3525.f8509 = interfaceC3621;
            return c3525;
        }
        Class cls4 = Boolean.TYPE;
        if (type2 == cls4) {
            return new C3592(str, cls4, cls4, i, j, str2, null, (Boolean) obj2, jSONSchemaM6197, method, null, null, 3);
        }
        if (type2 == Boolean.class) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Boolean) obj2, jSONSchemaM6197, method, null, null, 2);
        }
        if (type2 == Byte.TYPE) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Byte) obj2, jSONSchemaM6197, method, null, null, 16);
        }
        if (type2 == Short.TYPE) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Short) obj2, jSONSchemaM6197, method, null, null, 10);
        }
        if (type2 == Integer.TYPE) {
            return new C3592(str, type2, cls2, i, j, str2, null, (Integer) obj2, jSONSchemaM6197, method, null, null, 12);
        }
        if (type2 == Long.TYPE) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Long) obj2, jSONSchemaM6197, method, null, null, 14);
        }
        if (type2 == Float.TYPE) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Float) obj2, jSONSchemaM6197, method, null, null, 8);
        }
        if (type2 == Double.TYPE) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Double) obj2, jSONSchemaM6197, method, null, null, 6);
        }
        if (type2 == Byte.class) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Byte) obj2, jSONSchemaM6197, method, null, null, 15);
        }
        if (type2 == Short.class) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (Short) obj2, jSONSchemaM6197, method, null, null, 9);
        }
        if (type2 == Integer.class) {
            return new C3592(str, Integer.class, Integer.class, i, j, str2, locale, (Integer) obj2, jSONSchemaM6197, method, null, null, 11);
        }
        if (type2 == Long.class) {
            return new C3592(str, Long.class, Long.class, i, j, str2, locale, (Long) obj2, jSONSchemaM6197, method, null, null, 13);
        }
        if (type2 == Float.class) {
            return new C3592(str, Float.class, Float.class, i, j, str2, locale, (Float) obj2, jSONSchemaM6197, method, null, null, 7);
        }
        if (type2 == Double.class) {
            return new C3592(str, Double.class, Double.class, i, j, str2, null, (Double) obj2, jSONSchemaM6197, method, null, null, 5);
        }
        if (cls2 == BigDecimal.class) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (BigDecimal) obj2, jSONSchemaM6197, method, null, null, 0);
        }
        if (cls2 == BigInteger.class) {
            return new C3592(str, type2, cls2, i, j, str2, locale, (BigInteger) obj2, jSONSchemaM6197, method, null, null, 1);
        }
        if (type2 == String.class) {
            return new C3512(str, type2, cls2, i, j, str2, locale, (String) obj2, jSONSchemaM6197, method);
        }
        if (type2 == LocalDate.class) {
            C3592 c3592 = new C3592(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, method, null, null, 17);
            c3592.f8509 = str2 == null ? C3528.f8515 : new C3528(str2, locale);
            return c3592;
        }
        if (type2 == OffsetDateTime.class) {
            C3592 c35922 = new C3592(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, method, null, null, 19);
            c35922.f8509 = str2 == null ? C3534.f8546 : new C3534(str2, locale);
            return c35922;
        }
        if (type2 == UUID.class) {
            C3592 c35923 = new C3592(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, method, null, null, 22);
            c35923.f8509 = C3537.f8554;
            return c35923;
        }
        if (type2 == String[].class) {
            return new C3592(str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, method, null);
        }
        if (type2 instanceof Class) {
            type3 = type;
            if (type3 instanceof Class) {
                cls3 = cls;
                typeM6375 = null;
                clsM6502 = null;
            }
            if (method.getParameterCount() == 0) {
                field = null;
                i2 = 0;
            } else {
                if (cls2 == AtomicInteger.class) {
                    return new C3598(str, cls2, cls2, i, 0L, null, null, null, jSONSchemaM6197, method, null, 3);
                }
                if (cls2 == AtomicLong.class) {
                    return new C3598(str, cls2, cls2, i, 0L, null, null, null, jSONSchemaM6197, method, null, 5);
                }
                if (cls2 == AtomicIntegerArray.class) {
                    return new C3598(str, cls2, cls2, i, 0L, null, null, null, jSONSchemaM6197, method, null, 2);
                }
                if (cls2 == AtomicLongArray.class) {
                    return new C3598(str, cls2, cls2, i, 0L, null, null, null, jSONSchemaM6197, method, null, 4);
                }
                if (cls2 == AtomicBoolean.class) {
                    return new C3598(str, cls2, cls2, i, 0L, null, null, null, jSONSchemaM6197, method, null, 1);
                }
                if (cls2 == AtomicReference.class) {
                    return new C3597(str, type2, cls2, i, null, jSONSchemaM6197, method, null);
                }
                if (Collection.class.isAssignableFrom(cls2)) {
                    String name = method.getName();
                    Field fieldM6373 = name.startsWith("get") ? AbstractC3698.m6373(method.getDeclaringClass(), AbstractC3698.m6365(name, PropertyNamingStrategy.CamelCase.name())) : null;
                    Type type6 = typeM6375 != null ? typeM6375 : type2;
                    C3592 c35924 = new C3592(str, type6, cls2, i, j, str2, null, null, jSONSchemaM6197, method, fieldM6373, null, 4);
                    if (type6 instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type6).getActualTypeArguments();
                        type5 = actualTypeArguments.length > 0 ? actualTypeArguments[0] : null;
                    }
                    c35924.f8762 = type5;
                    return c35924;
                }
                field = null;
                i2 = 0;
                if (Map.class.isAssignableFrom(cls2)) {
                    String name2 = method.getName();
                    return new C3527(str, type2, cls2, i, j, str2, null, null, jSONSchemaM6197, method, name2.startsWith("get") ? AbstractC3698.m6373(method.getDeclaringClass(), AbstractC3698.m6365(name2, PropertyNamingStrategy.CamelCase.name())) : null, str4, biConsumer);
                }
                if (!cls3.isInterface()) {
                    return null;
                }
            }
            if (!List.class.isAssignableFrom(cls2) || "cn.hutool.json.JSONArray".equals(cls2.getName())) {
                if (typeM6375 instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) typeM6375).getActualTypeArguments();
                    if (actualTypeArguments2.length == 1) {
                        Type type7 = actualTypeArguments2[i2];
                        Class clsM65022 = AbstractC3700.m6502(type7);
                        return clsM65022 == String.class ? new C3585(str, typeM6375, cls2, String.class, String.class, i, j, str2, locale, null, jSONSchemaM6197, method, null, null) : new C3585(str, typeM6375, clsM6502, type7, clsM65022, i, j, str2, locale, null, jSONSchemaM6197, method, null, null);
                    }
                }
                return new C3585(str, type2, cls2, Object.class, Object.class, i, j, str2, locale, null, jSONSchemaM6197, method, null, null);
            }
            if (cls2 == Date.class) {
                return new C3590(i, j, jSONSchemaM6197, cls2, obj2, str, str2, null, method, type2, locale, null);
            }
            if (cls2 == StackTraceElement[].class && method.getDeclaringClass() == Throwable.class) {
                return new C3592(str, typeM6375 != null ? typeM6375 : type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, method, null, new C3614(i2), 20);
            }
            if ((j & 562949953421312L) != 0) {
                String name3 = method.getName();
                if (name3.startsWith("set")) {
                    Field fieldM63732 = AbstractC3698.m6373(method.getDeclaringClass(), AbstractC3698.m6347(name3, PropertyNamingStrategy.CamelCase.name()));
                    try {
                        fieldM63732.setAccessible(true);
                    } catch (Throwable unused) {
                    }
                    field2 = fieldM63732;
                } else {
                    field2 = field;
                }
            }
            if (!Map.class.isAssignableFrom(cls2)) {
                return new C3525(i, j, jSONSchemaM6197, cls2, obj2, str, str2, field2, method, typeM6375 != null ? typeM6375 : type2, locale, null);
            }
            if (typeM6375 != null) {
                type4 = typeM6375;
                str5 = str;
                j2 = j;
                str6 = str2;
                locale2 = locale;
                method2 = method;
                str7 = str4;
                biConsumer2 = biConsumer;
                i3 = i;
            } else {
                type4 = type2;
                str5 = str;
                i3 = i;
                j2 = j;
                str6 = str2;
                locale2 = locale;
                method2 = method;
                str7 = str4;
                biConsumer2 = biConsumer;
            }
            return new C3516(str5, type4, cls2, i3, j2, str6, locale2, obj2, jSONSchemaM6197, method2, field2, str7, biConsumer2);
        }
        type3 = type;
        cls3 = cls;
        typeM6375 = AbstractC3698.m6375(AbstractC3740.m6912(type3), cls3, method, type2);
        clsM6502 = AbstractC3700.m6502(typeM6375);
        if (method.getParameterCount() == 0) {
        }
        if (List.class.isAssignableFrom(cls2)) {
        }
        if (typeM6375 instanceof ParameterizedType) {
        }
        return new C3585(str, type2, cls2, Object.class, Object.class, i, j, str2, locale, null, jSONSchemaM6197, method, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC3595 m6159(Class cls, Type type, String str, int i, long j, String str2, Locale locale, Object obj, String str3, Type type2, Class cls2, Method method, InterfaceC3621 interfaceC3621) {
        JSONSchema jSONSchemaM6197;
        Object objApply = obj;
        if (objApply != null && objApply.getClass() != cls2) {
            Function functionM6191 = AbstractC3766.m6947().m6191(objApply.getClass(), type2);
            if (functionM6191 == null) {
                StringBuilder sb = new StringBuilder("illegal defaultValue : ");
                sb.append(objApply);
                sb.append(", class ");
                C1123.m1410(AbstractC7012.m12148(cls2, sb));
                return null;
            }
            objApply = functionM6191.apply(objApply);
        }
        Object obj2 = objApply;
        if (str3 == null || str3.isEmpty()) {
            jSONSchemaM6197 = null;
        } else {
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(str3);
            if (!jSONObjectM6934.isEmpty()) {
                jSONSchemaM6197 = JSONSchema.m6197(jSONObjectM6934, cls2);
            }
        }
        if (interfaceC3621 != null) {
            return m6153(cls, type, str, type2, cls2, i, j, str2, locale, obj2, jSONSchemaM6197, method, (BiConsumer) m6150(cls, method, cls2), interfaceC3621);
        }
        JSONSchema jSONSchema = jSONSchemaM6197;
        Class cls3 = Boolean.TYPE;
        if (type2 == cls3) {
            if (m6150(cls, method, cls2) != null) {
                C3775.m6954();
                return null;
            }
            return new C3598(str, cls3, cls3, i, 0L, null, null, null, jSONSchema, method, null, 6);
        }
        Class cls4 = Byte.TYPE;
        if (type2 == cls4) {
            if (m6150(cls, method, cls2) != null) {
                C3775.m6954();
                return null;
            }
            return new C3598(str, cls4, cls4, i, 0L, null, null, null, jSONSchema, method, null, 10);
        }
        Class cls5 = Short.TYPE;
        if (type2 == cls5) {
            if (m6150(cls, method, cls2) == null) {
                return new C3598(str, cls5, cls5, i, j, str2, locale, (Short) obj2, jSONSchema, method, null, 9);
            }
            C3775.m6954();
            return null;
        }
        if (type2 == Integer.TYPE) {
            return new C3583(str, i, (Integer) obj2, jSONSchema, method, (ObjIntConsumer) m6150(cls, method, cls2));
        }
        if (type2 == Long.TYPE) {
            return new C3583(str, i, (Long) obj2, jSONSchema, method, (ObjLongConsumer) m6150(cls, method, cls2));
        }
        Class cls6 = Character.TYPE;
        if (type2 == cls6) {
            if (m6150(cls, method, cls2) != null) {
                C3775.m6954();
                return null;
            }
            return new C3598(str, cls6, cls6, i, 0L, str2, null, (Character) obj2, jSONSchema, method, null, 7);
        }
        Class cls7 = Float.TYPE;
        if (type2 != cls7) {
            if (type2 != Double.TYPE) {
                return m6153(cls, type, str, type2, cls2, i, j, str2, locale, obj2, jSONSchema, method, (BiConsumer) m6150(cls, method, cls2), null);
            }
            return new C3583(str, i, (Double) obj2, jSONSchema, method, (ObjDoubleConsumer) m6150(cls, method, cls2));
        }
        if (m6150(cls, method, cls2) != null) {
            C3775.m6954();
            return null;
        }
        return new C3598(str, cls7, cls7, i, 0L, null, null, (Float) obj2, jSONSchema, method, null, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3525 m6160(Class cls, Type type, String str, int i, long j, String str2, Locale locale, String str3, Type type2, Class cls2, String str4, Class cls3, InterfaceC3621 interfaceC3621) {
        Class cls4;
        Object objValueOf;
        Type typeM6344;
        Class clsM6502;
        Type type3;
        String str5 = str3;
        if (str5 == null || !cls2.isEnum()) {
            cls4 = cls2;
            objValueOf = str5;
        } else {
            cls4 = cls2;
            objValueOf = Enum.valueOf(cls4, str5);
        }
        Object obj = objValueOf;
        if (interfaceC3621 != null) {
            C3523 c3523 = new C3523(str, type2, cls4, str4, i, j, str2, locale, obj);
            c3523.f8509 = interfaceC3621;
            return c3523;
        }
        if (type2 == Byte.TYPE || type2 == Byte.class) {
            return new C3586(str, cls2, cls2, str4, i, j, str2, locale, obj, 3);
        }
        if (type2 == Short.TYPE || type2 == Short.class) {
            return new C3586(str, cls2, cls2, str4, i, j, str2, locale, obj, 0);
        }
        if (type2 == Integer.TYPE || type2 == Integer.class) {
            return new C3586(str, cls2, cls2, str4, i, j, str2, locale, obj, 1);
        }
        if (type2 == Long.TYPE || type2 == Long.class) {
            return new C3586(str, cls2, cls2, str4, i, j, str2, locale, obj, 2);
        }
        if ((type2 instanceof Class) || type == null) {
            typeM6344 = null;
            clsM6502 = null;
        } else {
            AbstractC3740 abstractC3740M6912 = AbstractC3740.m6912(type);
            Class cls5 = cls;
            while (true) {
                if (cls5 == Object.class) {
                    typeM6344 = null;
                    break;
                }
                Type type4 = abstractC3740M6912.f9599;
                if (cls3 == cls5) {
                    typeM6344 = AbstractC3698.m6344(type4, cls3, type2, new HashMap());
                    break;
                }
                abstractC3740M6912 = AbstractC3740.m6912(AbstractC3698.m6344(type4, cls5, cls5.getGenericSuperclass(), new HashMap()));
                cls5 = abstractC3740M6912.f9598;
            }
            clsM6502 = typeM6344 != null ? AbstractC3700.m6502(typeM6344) : null;
        }
        Type type5 = typeM6344 == null ? type2 : typeM6344;
        Class cls6 = clsM6502 == null ? cls2 : clsM6502;
        if (type5 instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type5).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Type type6 = actualTypeArguments[0];
                Class cls7 = AbstractC3700.f9396;
                type3 = type6;
            } else {
                type3 = null;
            }
        }
        if (cls6 == null || !Collection.class.isAssignableFrom(cls6) || type3 == null) {
            return new C3523(str, type5, cls6, str4, i, j, str2, locale, obj);
        }
        C3520 c3520 = new C3520(str, type5, cls6, type3, null, i, j, str2, locale, obj, null, null, null, null);
        AbstractC3693.m6334(str4);
        return c3520;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static AbstractC3595[] m6161(C3635 c3635, Class cls, Type type, Constructor constructor, Parameter[] parameterArr, String... strArr) {
        Class<?> cls2;
        String str;
        int i;
        int i2;
        Field fieldM6373;
        Class<?> declaringClass = constructor != null ? constructor.getDeclaringClass() : null;
        ArrayList arrayList = new ArrayList(parameterArr.length);
        int i3 = 0;
        int i4 = 0;
        while (i4 < parameterArr.length) {
            C9192 c9192 = new C9192();
            Parameter parameter = parameterArr[i4];
            String name = i4 < strArr.length ? strArr[i4] : parameter.getName();
            if (constructor != null) {
                cls2 = declaringClass;
                c3635.m6183(c9192, cls2, constructor, i4, parameter);
            } else {
                cls2 = declaringClass;
            }
            if (constructor != null && (fieldM6373 = AbstractC3698.m6373(cls2, name)) != null) {
                c3635.m6182(c9192, cls2, fieldM6373);
            }
            String str2 = c9192.f23394;
            String strM12147 = (str2 == null || str2.isEmpty()) ? name : c9192.f23394;
            if (strM12147 == null) {
                strM12147 = AbstractC7012.m12147(i4, ParameterDescription.NAME_PREFIX);
            }
            if (name == null) {
                name = AbstractC7012.m12147(i4, ParameterDescription.NAME_PREFIX);
            }
            String str3 = name;
            InterfaceC3621 interfaceC3621M6151 = m6151(c3635, parameter.getParameterizedType(), parameter.getType(), c9192);
            Type parameterizedType = parameter.getParameterizedType();
            Type[] typeArr = AbstractC3698.f9362;
            Type typeM6344 = AbstractC3698.m6344(type, cls, parameterizedType, new HashMap());
            Type type2 = typeM6344 != null ? typeM6344 : parameterizedType;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            String str4 = strM12147;
            declaringClass = cls2;
            String str5 = str4;
            arrayList2.add(m6160(null, null, str4, i4, c9192.f23390, c9192.f23393, c9192.f23401, c9192.f23404, type2, parameter.getType(), str3, declaringClass, interfaceC3621M6151));
            String[] strArr2 = c9192.f23406;
            if (strArr2 != null) {
                int length = strArr2.length;
                int i6 = i5;
                while (i6 < length) {
                    int i7 = i6;
                    String str6 = strArr2[i7];
                    if (str5.equals(str6)) {
                        str = str5;
                        i = length;
                        i2 = i7;
                    } else {
                        str = str5;
                        i = length;
                        i2 = i7;
                        arrayList2.add(m6160(null, null, str6, i4, c9192.f23390, c9192.f23393, c9192.f23401, c9192.f23404, type2, parameter.getType(), str3, declaringClass, interfaceC3621M6151));
                    }
                    i6 = i2 + 1;
                    str5 = str;
                    length = i;
                }
            }
            i4++;
            arrayList = arrayList2;
            i3 = 0;
        }
        return (AbstractC3595[]) arrayList.toArray(new AbstractC3595[i3]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final Function m6162(Method method, Class cls) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) cls);
            return (Function) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9409, AbstractC3700.f9405, lookupM6328.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8823.incrementAndGet();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6163(Class cls, Type type, String str, String[] strArr, C9194 c9194, C9192 c9192, Method method, LinkedHashMap linkedHashMap, C3635 c3635) {
        String strM6347;
        char cCharAt;
        InterfaceC3621 interfaceC3621;
        String str2;
        AbstractC3595 abstractC3595M6158;
        Class cls2;
        C9192 c91922;
        String[] strArr2;
        String[] strArr3;
        LinkedHashMap linkedHashMap2;
        int i;
        int i2;
        String str3;
        c3635.m6181(c9192, cls, method);
        if (c9192.f23389) {
            return;
        }
        String str4 = c9192.f23394;
        if (str4 == null || str4.isEmpty()) {
            String name = method.getName();
            strM6347 = name.startsWith("set") ? AbstractC3698.m6347(name, str) : AbstractC3698.m6364(method, c9194.f23438, str);
            int length = strM6347.length();
            char cCharAt2 = length > 0 ? strM6347.charAt(0) : (char) 0;
            if ((length == 1 && cCharAt2 >= 'a' && cCharAt2 <= 'z') || (length > 2 && cCharAt2 >= 'A' && cCharAt2 <= 'Z' && (cCharAt = strM6347.charAt(1)) >= 'A' && cCharAt <= 'Z')) {
                char[] charArray = strM6347.toCharArray();
                if (length == 1) {
                    charArray[0] = (char) (charArray[0] - ' ');
                } else {
                    charArray[0] = (char) (charArray[0] + ' ');
                }
                Field fieldM6373 = AbstractC3698.m6373(cls, new String(charArray));
                if (fieldM6373 != null) {
                    if (Modifier.isPublic(fieldM6373.getModifiers())) {
                        strM6347 = fieldM6373.getName();
                    } else if (length == 1) {
                        c9192.f23406 = new String[]{strM6347};
                        strM6347 = fieldM6373.getName();
                    }
                }
            }
        } else {
            strM6347 = c9192.f23394;
        }
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                if (i3 < strArr.length) {
                    if (strM6347.equals(strArr[i3])) {
                        c9192.f23391 = i3;
                        break;
                    }
                    i3++;
                } else if (c9192.f23391 == 0) {
                    c9192.f23391 = strArr.length;
                }
            }
        }
        int parameterCount = method.getParameterCount();
        if (parameterCount == 0) {
            String str5 = strM6347;
            m6149(linkedHashMap, str5, m6158(cls, type, str5, c9192.f23391, c9192.f23390, c9192.f23393, c9192.f23401, c9192.f23404, c9192.f23402, method.getGenericReturnType(), method.getReturnType(), method, c9192.m14425(), c9192.f23395, c9192.m14426()), cls);
            return;
        }
        String str6 = strM6347;
        if (parameterCount == 2) {
            Class<?> cls3 = method.getParameterTypes()[1];
            Type type2 = method.getGenericParameterTypes()[1];
            method.setAccessible(true);
            C3594 c3594 = new C3594(c9192.f23391, c9192.f23390, null, cls3, null, "$$any$$", c9192.f23393, null, method, type2, null, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c3594);
            linkedHashMap.put("$$any$$", arrayList);
            return;
        }
        Type type3 = method.getGenericParameterTypes()[0];
        Class<?> cls4 = method.getParameterTypes()[0];
        if ((type3 instanceof Class) && Collection.class.isAssignableFrom((Class) type3)) {
            for (Class<?> cls5 : cls.getInterfaces()) {
                Method methodM6357 = AbstractC3698.m6357(method, cls5);
                if (methodM6357 != null) {
                    Type[] genericParameterTypes = methodM6357.getGenericParameterTypes();
                    if (genericParameterTypes.length == 1) {
                        Type type4 = genericParameterTypes[0];
                        if (type4 instanceof ParameterizedType) {
                            type3 = type4;
                        }
                    }
                }
            }
        }
        Type type5 = type3;
        if (AbstractC3700.m6495(cls4)) {
            return;
        }
        InterfaceC3621 interfaceC3621M6151 = m6151(c3635, type5, cls4, c9192);
        long j = c9192.f23390;
        if ((18014398509481984L & j) != 0) {
            str2 = str6;
            try {
                interfaceC3621 = interfaceC3621M6151;
                try {
                    abstractC3595M6158 = m6159(cls, type, str2, c9192.f23391, j, c9192.f23393, c9192.f23401, c9192.f23404, c9192.f23402, type5, cls4, method, interfaceC3621);
                    cls4 = cls4;
                    type5 = type5;
                } catch (Throwable unused) {
                    cls4 = cls4;
                    type5 = type5;
                    this.f8823.incrementAndGet();
                    abstractC3595M6158 = null;
                }
            } catch (Throwable unused2) {
                interfaceC3621 = interfaceC3621M6151;
            }
            if (abstractC3595M6158 != null) {
                cls2 = cls;
                String str7 = str2;
                c91922 = c9192;
                InterfaceC3621 interfaceC36212 = interfaceC3621;
                str2 = str7;
                interfaceC3621 = interfaceC36212;
                abstractC3595M6158 = m6158(cls2, type, str7, c9192.f23391, c9192.f23390, c9192.f23393, c9192.f23401, c9192.f23404, c9192.f23402, type5, cls4, method, interfaceC36212, c9192.f23395, c9192.m14426());
            } else {
                cls2 = cls;
                c91922 = c9192;
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            m6149(linkedHashMap3, str2, abstractC3595M6158, cls2);
            strArr2 = c91922.f23406;
            if (strArr2 == null) {
                int length2 = strArr2.length;
                int i4 = 0;
                while (i4 < length2) {
                    String[] strArr4 = strArr2;
                    String str8 = strArr4[i4];
                    if (str2.equals(str8)) {
                        str3 = str2;
                        linkedHashMap2 = linkedHashMap3;
                        i = length2;
                        i2 = i4;
                        strArr3 = strArr4;
                    } else {
                        int i5 = c91922.f23391;
                        int i6 = length2;
                        long j2 = c91922.f23390;
                        String str9 = c91922.f23393;
                        Locale locale = c91922.f23401;
                        String str10 = c91922.f23404;
                        String str11 = c91922.f23402;
                        strArr3 = strArr4;
                        linkedHashMap2 = linkedHashMap;
                        i = i6;
                        i2 = i4;
                        str3 = str2;
                        InterfaceC3621 interfaceC36213 = interfaceC3621;
                        interfaceC3621 = interfaceC36213;
                        m6149(linkedHashMap2, str8, m6158(cls2, type, str8, i5, j2, str9, locale, str10, str11, type5, cls4, method, interfaceC36213, null, null), cls2);
                    }
                    i4 = i2 + 1;
                    linkedHashMap3 = linkedHashMap2;
                    str2 = str3;
                    strArr2 = strArr3;
                    length2 = i;
                    c91922 = c9192;
                }
                return;
            }
            return;
        }
        interfaceC3621 = interfaceC3621M6151;
        str2 = str6;
        abstractC3595M6158 = null;
        if (abstractC3595M6158 != null) {
        }
        LinkedHashMap linkedHashMap32 = linkedHashMap;
        m6149(linkedHashMap32, str2, abstractC3595M6158, cls2);
        strArr2 = c91922.f23406;
        if (strArr2 == null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Function m6164(Constructor constructor) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9409, AbstractC3700.f9405, lookupM6328.findConstructor(declaringClass, AbstractC3700.f9384), MethodType.methodType(declaringClass, (Class<?>) String.class)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8823.incrementAndGet();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0210  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.alibaba.fastjson2.schema.JSONSchema] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.function.Function] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC3621 m6165(Class cls, Type type, C3635 c3635, C9194 c9194) {
        Parameter[] parameters;
        Class<?> declaringClass;
        String[] strArrM14776;
        long j;
        InterfaceC3621 interfaceC3621;
        Class cls2;
        C9192 c9192;
        String[] strArr;
        int i;
        Parameter[] parameterArr;
        String[] strArr2;
        Function c3577;
        AbstractC3595[] abstractC3595Arr;
        ?? M6197;
        C3609 c3609;
        Object objM6162;
        Constructor constructor;
        Object objM6170;
        int i2;
        Parameter parameter;
        C3635 c36352;
        Method method;
        int i3;
        int i4;
        String[] strArr3;
        C9194 c91942 = c9194;
        C9192 c91922 = new C9192();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Constructor constructor2 = c91942.f23454;
        if (constructor2 != null) {
            parameters = constructor2.getParameters();
            declaringClass = c91942.f23454.getDeclaringClass();
            strArrM14776 = AbstractC9420.m14776(c91942.f23454);
        } else {
            parameters = c91942.f23452.getParameters();
            declaringClass = c91942.f23452.getDeclaringClass();
            strArrM14776 = AbstractC9420.m14776(c91942.f23452);
        }
        Parameter[] parameterArr2 = parameters;
        Class<?> cls3 = declaringClass;
        String[] strArr4 = strArrM14776;
        int i5 = 0;
        while (true) {
            if (i5 >= parameterArr2.length) {
                j = 281474976710656L;
                interfaceC3621 = null;
                cls2 = cls;
                c9192 = c91922;
                strArr = strArr4;
                i = 0;
                parameterArr = parameterArr2;
                break;
            }
            c91922.m14424();
            Parameter parameter2 = parameterArr2[i5];
            int i6 = i5;
            Constructor constructor3 = c91942.f23454;
            if (constructor3 != null) {
                c3635.m6183(c91922, cls, constructor3, i6, parameter2);
                c36352 = c3635;
                i2 = i6;
                parameter = parameter2;
                j = 281474976710656L;
            } else {
                Class cls4 = cls;
                i2 = i6;
                parameter = parameter2;
                c36352 = c3635;
                Method method2 = c91942.f23452;
                CopyOnWriteArrayList copyOnWriteArrayList = c36352.f9025;
                int i7 = 0;
                j = 281474976710656L;
                while (i7 < copyOnWriteArrayList.size()) {
                    C3075 c3075 = ((C3612) copyOnWriteArrayList.get(i7)).f8845;
                    Class cls5 = (Class) ((C3612) c3075.f6882).f8846.f9012.get(cls4);
                    if (cls5 != null && cls5 != cls4) {
                        try {
                            method = cls5.getMethod(method2.getName(), method2.getParameterTypes());
                        } catch (NoSuchMethodException unused) {
                            method = null;
                        }
                        if (method != null) {
                            c3075.m4705(c91922, AbstractC3698.m6380(method.getParameters()[i2]));
                        }
                    }
                    c3075.m4705(c91922, AbstractC3698.m6380(parameter));
                    i7++;
                    cls4 = cls;
                }
            }
            interfaceC3621 = null;
            if (parameterArr2.length == 1 && (c91922.f23390 & j) != 0) {
                cls2 = cls;
                c9192 = c91922;
                parameterArr = parameterArr2;
                strArr = strArr4;
                i = 0;
                break;
            }
            String name = c91922.f23394;
            if (name == null || name.isEmpty()) {
                String[] strArr5 = c91942.f23453;
                if (strArr5 != null && i2 < strArr5.length) {
                    name = strArr5[i2];
                }
                if (name == null || name.isEmpty()) {
                    name = parameter.getName();
                }
            }
            if (name == null || name.isEmpty()) {
                name = strArr4[i2];
            } else if (!name.startsWith(ParameterDescription.NAME_PREFIX)) {
                strArr4[i2] = name;
            } else if (strArr4 != null && strArr4.length > i2) {
                name = strArr4[i2];
            }
            String strM12147 = name;
            Class<?> type2 = parameter.getType();
            C9194 c91943 = c91942;
            C9192 c91923 = c91922;
            int i8 = i2;
            C3635 c36353 = c36352;
            AbstractC3698.m6362(cls, new C3617(type2, c36352, cls, c91943, strM12147, c91923));
            if (strM12147 == null || strM12147.isEmpty()) {
                strM12147 = AbstractC7012.m12147(i8, ParameterDescription.NAME_PREFIX);
            }
            String str = strM12147;
            Type parameterizedType = parameter.getParameterizedType();
            Parameter[] parameterArr3 = parameterArr2;
            String[] strArr6 = strArr4;
            String str2 = str;
            C3525 c3525M6160 = m6160(cls, type, str2, i8, c91923.f23390, c91923.f23393, null, null, parameterizedType, type2, str, cls3, m6151(c36353, parameterizedType, type2, c91923));
            ArrayList arrayList = new ArrayList();
            arrayList.add(c3525M6160);
            linkedHashMap.put(str2, arrayList);
            String[] strArr7 = c91923.f23406;
            if (strArr7 != null) {
                int length = strArr7.length;
                int i9 = 0;
                while (i9 < length) {
                    String str3 = strArr7[i9];
                    if (str2.equals(str3)) {
                        strArr3 = strArr7;
                        i3 = length;
                        i4 = i9;
                    } else {
                        String str4 = str2;
                        i3 = length;
                        i4 = i9;
                        strArr3 = strArr7;
                        str2 = str4;
                        m6149(linkedHashMap, str3, m6160(cls, type, str3, i8, c91923.f23390, c91923.f23393, null, null, parameterizedType, type2, str4, cls3, null), cls);
                    }
                    i9 = i4 + 1;
                    strArr7 = strArr3;
                    length = i3;
                }
            }
            i5 = i8 + 1;
            c91942 = c9194;
            c91922 = c91923;
            strArr4 = strArr6;
            parameterArr2 = parameterArr3;
        }
        if (parameterArr.length != 1 || (c9192.f23390 & j) == 0) {
            int i10 = i;
            Constructor constructor4 = c9194.f23454;
            if (constructor4 != null) {
                Constructor constructor5 = c9194.f23455;
                if (constructor5 == null) {
                    constructor4.setAccessible(true);
                } else {
                    constructor5.setAccessible(true);
                }
                c3577 = new C3579(null, constructor4, null, null, constructor5, strArr);
                strArr2 = strArr;
            } else {
                strArr2 = strArr;
                Method method3 = c9194.f23452;
                method3.setAccessible(true);
                c3577 = new C3577(method3, strArr2);
            }
            int i11 = i10;
            AbstractC3595[] abstractC3595ArrM6172 = m6172(cls2, type, null, false, AbstractC3766.m6947());
            Arrays.sort(abstractC3595ArrM6172);
            int i12 = i11;
            int i13 = i12;
            boolean[] zArr = interfaceC3621;
            while (i13 < abstractC3595ArrM6172.length) {
                if (linkedHashMap.containsKey(abstractC3595ArrM6172[i13].f8773)) {
                    if (zArr == 0) {
                        zArr = new boolean[abstractC3595ArrM6172.length];
                    }
                    zArr[i13] = true;
                    i12++;
                }
                i13++;
                zArr = zArr;
            }
            if (i12 > 0) {
                AbstractC3595[] abstractC3595Arr2 = new AbstractC3595[abstractC3595ArrM6172.length - i12];
                for (int i14 = i11; i14 < abstractC3595ArrM6172.length; i14++) {
                    if (!zArr[i14]) {
                        abstractC3595Arr2[i11] = abstractC3595ArrM6172[i14];
                        i11++;
                    }
                }
                abstractC3595Arr = abstractC3595Arr2;
            } else {
                abstractC3595Arr = abstractC3595ArrM6172;
            }
            return mo6088(cls, c9194, c3577, null, strArr2, m6148(linkedHashMap), abstractC3595Arr);
        }
        Constructor constructor6 = c9194.f23454;
        Type type3 = constructor6 == null ? c9194.f23452.getGenericParameterTypes()[i] : constructor6.getGenericParameterTypes()[i];
        Constructor constructor7 = c9194.f23454;
        Class<?> cls6 = constructor7 == null ? c9194.f23452.getParameterTypes()[i] : constructor7.getParameterTypes()[i];
        String str5 = c9192.f23402;
        if (str5 == null || str5.isEmpty()) {
            M6197 = interfaceC3621;
        } else {
            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(c9192.f23402);
            if (!jSONObjectM6934.isEmpty()) {
                M6197 = JSONSchema.m6197(jSONObjectM6934, cls6);
            }
        }
        Object objApply = c9192.f23404;
        if (objApply != null && objApply.getClass() != cls6) {
            Function functionM6191 = AbstractC3766.m6947().m6191(objApply.getClass(), type3);
            if (functionM6191 == null) {
                StringBuilder sb = new StringBuilder("illegal defaultValue : ");
                sb.append(objApply);
                sb.append(", class ");
                C1123.m1410(AbstractC7012.m12148(cls6, sb));
                return interfaceC3621;
            }
            objApply = functionM6191.apply(objApply);
        }
        int i15 = (!f8822 && (c9192.f23390 & 18014398509481984L) == 0 && (c9194.f23445 & 18014398509481984L) == 0) ? i : 1;
        if (objApply != null || i15 == 0) {
            c3609 = this;
        } else {
            if (cls6 != Integer.TYPE) {
                c3609 = this;
                if (cls6 == String.class) {
                    Constructor constructor8 = c9194.f23454;
                    if (constructor8 != null) {
                        objM6162 = c3609.m6164(constructor8);
                    } else {
                        Method method4 = c9194.f23452;
                        objM6162 = method4 != null ? c3609.m6168(method4) : interfaceC3621;
                    }
                    if (objM6162 != null) {
                        return new C3627(M6197, objM6162, 1);
                    }
                }
                if (i15 != 0 && !cls6.isPrimitive()) {
                    constructor = c9194.f23454;
                    if (constructor == null) {
                        objM6162 = c3609.m6167(constructor, cls6);
                    } else {
                        Method method5 = c9194.f23452;
                        if (method5 != null) {
                            objM6162 = c3609.m6162(method5, cls6);
                        }
                    }
                }
                return new C3628(type3, c9192.f23390, M6197, c9194.f23454, c9194.f23452, objM6162);
            }
            Constructor constructor9 = c9194.f23454;
            if (constructor9 != null) {
                c3609 = this;
                objM6170 = c3609.m6173(constructor9);
            } else {
                c3609 = this;
                Method method6 = c9194.f23452;
                objM6170 = method6 != null ? c3609.m6170(method6) : interfaceC3621;
            }
            if (objM6170 != null) {
                return new C3627(M6197, objM6170, i);
            }
        }
        objM6162 = interfaceC3621;
        if (i15 != 0) {
            constructor = c9194.f23454;
            if (constructor == null) {
            }
        }
        return new C3628(type3, c9192.f23390, M6197, c9194.f23454, c9194.f23452, objM6162);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Supplier m6166(Constructor constructor, boolean z) {
        if (z & f8822) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
            try {
                if (constructor.getParameterCount() == 0) {
                    MethodHandle methodHandleFindConstructor = lookupM6328.findConstructor(declaringClass, AbstractC3700.f9399);
                    MethodType methodType = AbstractC3700.f9410;
                    MethodType methodType2 = AbstractC3700.f9408;
                    return (Supplier) LambdaMetafactory.metafactory(lookupM6328, "get", methodType, methodType2, methodHandleFindConstructor, methodType2).getTarget().invokeExact();
                }
            } catch (Throwable unused) {
                this.f8823.incrementAndGet();
            }
        }
        return new C3578(constructor);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Function m6167(Constructor constructor, Class cls) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
        try {
            return (Function) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9409, AbstractC3700.f9405, lookupM6328.findConstructor(declaringClass, MethodType.methodType((Class<?>) Void.TYPE, (Class<?>) cls)), MethodType.methodType(declaringClass, (Class<?>) cls)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8823.incrementAndGet();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Function m6168(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) String.class);
            return (Function) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9409, AbstractC3700.f9405, lookupM6328.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8823.incrementAndGet();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Supplier m6169(Class cls) {
        if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return m6166(declaredConstructor, true);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            C1123.m1403("get constructor error, class ".concat(cls.getName()), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C3631 mo6088(Class cls, C9194 c9194, Function function, ArrayList arrayList, String[] strArr, AbstractC3595[] abstractC3595Arr, AbstractC3595[] abstractC3595Arr2) {
        return new C3631(cls, c9194.f23437, c9194.f23436, c9194.f23445, function, abstractC3595Arr, abstractC3595Arr2, c9194.f23432, c9194.f23451);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final IntFunction m6170(Method method) {
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
        try {
            MethodType methodType = MethodType.methodType(method.getReturnType(), (Class<?>) Integer.TYPE);
            return (IntFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9411, AbstractC3700.f9383, lookupM6328.findStatic(declaringClass, method.getName(), methodType), methodType).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8823.incrementAndGet();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC3621 m6171(final Class cls, final Type type, final C3635 c3635, final C9194 c9194) {
        Function c3502;
        Method method = c9194.f23434;
        if (method != null) {
            try {
                c3502 = m6156(method);
            } catch (Throwable unused) {
                this.f8823.incrementAndGet();
                method.setAccessible(true);
                c3502 = new C3502(method, 3);
            }
        } else {
            c3502 = null;
        }
        Function function = c3502;
        final Class cls2 = c9194.f23435;
        String str = c9194.f23433;
        if (str == null || str.isEmpty()) {
            str = "with";
        }
        final String str2 = str;
        final int length = str2.length();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final C9192 c9192 = new C9192();
        Consumer consumer = new Consumer(this) { // from class: com.alibaba.fastjson2.reader.飘花落叶言子苏兰楪哲世
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                char c;
                int i;
                int i2;
                String str3;
                Class<?> cls3;
                String[] strArr;
                C9192 c91922;
                Type type2;
                Method method2 = (Method) obj;
                C9192 c91923 = c9192;
                c91923.m14424();
                C3635 c36352 = c3635;
                Class cls4 = cls;
                c36352.m6181(c91923, cls4, method2);
                if (c91923.f23389) {
                    return;
                }
                String name = method2.getName();
                String str4 = c91923.f23394;
                Class<?> cls5 = cls2;
                if (str4 == null || str4.isEmpty()) {
                    int length2 = name.length();
                    String str5 = str2;
                    if (length2 > str5.length() && name.startsWith(str5)) {
                        Type[] typeArr = AbstractC3698.f9362;
                        int length3 = name.length();
                        int i3 = length;
                        int i4 = length3 - i3;
                        char[] cArr = new char[i4];
                        name.getChars(i3, length3, cArr, 0);
                        char c2 = cArr[0];
                        boolean z = i4 > 1 && (c = cArr[1]) >= 'A' && c <= 'Z';
                        if (c2 >= 'A' && c2 <= 'Z' && !z) {
                            cArr[0] = (char) (c2 + ' ');
                        }
                        name = new String(cArr);
                    } else {
                        if (method2.getDeclaringClass() == Object.class || method2.getReturnType() != cls5) {
                            return;
                        }
                        if (method2.getAnnotation(InterfaceC9196.class) == null && (c9194.f23445 & JSONReader$Feature.SupportSmartMatch.mask) == 0) {
                            return;
                        }
                    }
                } else {
                    name = c91923.f23394;
                }
                int parameterCount = method2.getParameterCount();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (parameterCount == 0) {
                    String str6 = name;
                    C3609.m6149(linkedHashMap2, str6, C3609.m6158(cls5, cls5, str6, c91923.f23391, c91923.f23390, c91923.f23393, c91923.f23401, c91923.f23404, c91923.f23402, method2.getGenericReturnType(), method2.getReturnType(), method2, null, null, null), cls4);
                    return;
                }
                String str7 = name;
                Type type3 = method2.getGenericParameterTypes()[0];
                Class<?> cls6 = method2.getParameterTypes()[0];
                method2.setAccessible(true);
                int i5 = c91923.f23391;
                long j = c91923.f23390;
                String str8 = c91923.f23393;
                Locale locale = c91923.f23401;
                String str9 = c91923.f23404;
                String str10 = c91923.f23402;
                Type type4 = type;
                AbstractC3595 abstractC3595M6158 = C3609.m6158(cls5, type4, str7, i5, j, str8, locale, str9, str10, type3, cls6, method2, null, null, null);
                Class<?> cls7 = cls5;
                String str11 = str7;
                Type type5 = type4;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                C3609.m6149(linkedHashMap3, str11, abstractC3595M6158, cls4);
                C9192 c91924 = c91923;
                String[] strArr2 = c91924.f23406;
                if (strArr2 != null) {
                    int length4 = strArr2.length;
                    int i6 = 0;
                    while (i6 < length4) {
                        LinkedHashMap linkedHashMap4 = linkedHashMap3;
                        Type type6 = type5;
                        String str12 = strArr2[i6];
                        if (str11.equals(str12)) {
                            str3 = str11;
                            strArr = strArr2;
                            i2 = length4;
                            i = i6;
                            cls3 = cls7;
                            type2 = type6;
                            linkedHashMap3 = linkedHashMap4;
                            c91922 = c91924;
                        } else {
                            i = i6;
                            i2 = length4;
                            str3 = str11;
                            cls3 = cls7;
                            strArr = strArr2;
                            c91922 = c91924;
                            AbstractC3595 abstractC3595M61582 = C3609.m6158(cls3, type6, str12, c91924.f23391, c91924.f23390, c91924.f23393, c91924.f23401, c91924.f23404, c91924.f23402, type3, cls6, method2, null, null, null);
                            type2 = type6;
                            linkedHashMap3 = linkedHashMap4;
                            C3609.m6149(linkedHashMap3, str12, abstractC3595M61582, cls4);
                        }
                        i6 = i + 1;
                        cls7 = cls3;
                        type5 = type2;
                        length4 = i2;
                        c91924 = c91922;
                        str11 = str3;
                        strArr2 = strArr;
                    }
                }
            }
        };
        if (!AbstractC3698.m6361(cls2)) {
            ConcurrentHashMap concurrentHashMap = AbstractC3698.f9358;
            Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls2);
            if (methodArrM6356 == null) {
                methodArrM6356 = AbstractC3698.m6356(cls2);
                concurrentHashMap.putIfAbsent(cls2, methodArrM6356);
            }
            for (Method method2 : methodArrM6356) {
                int parameterCount = method2.getParameterCount();
                if (parameterCount == 0) {
                    method2.getName();
                    Class<?> returnType = method2.getReturnType();
                    if (returnType == AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || Collection.class.isAssignableFrom(returnType)) {
                        consumer.accept(method2);
                    } else if (parameterCount == 1 && !Modifier.isStatic(method2.getModifiers())) {
                        method2.getName().getClass();
                        consumer.accept(method2);
                    }
                }
            }
        }
        return mo6090(cls2, null, null, 0L, null, m6169(cls2), function, m6148(linkedHashMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f6  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.alibaba.fastjson2.schema.JSONSchema] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Class[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.function.BiFunction] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC3621 mo6089(Class cls, Type type, boolean z, C3635 c3635) {
        boolean z2;
        boolean z3;
        C3635 c36352;
        C3609 c3609;
        C9194 c9194;
        boolean z4;
        InterfaceC3621 interfaceC3621;
        Constructor constructor;
        ?? r1;
        String[] strArrM14776;
        ArrayList arrayList;
        int i;
        C3635 c36353;
        Class cls2;
        ?? M14701;
        ?? M14699;
        ?? M6197;
        Method method;
        Class cls3 = cls;
        C9194 c91942 = new C9194(c3635);
        if (z) {
            c91942.f23445 |= JSONReader$Feature.FieldBased.mask;
        }
        Iterator it = c3635.f9025.iterator();
        while (it.hasNext()) {
            ((C3612) it.next()).f8845.m4715(cls3, c91942);
        }
        Class cls4 = c91942.f23443;
        InterfaceC3621 interfaceC36212 = null;
        int i2 = 1;
        if (cls4 != null && InterfaceC3621.class.isAssignableFrom(cls4)) {
            try {
                Constructor declaredConstructor = c91942.f23443.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return (InterfaceC3621) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                C1123.m1403("create deserializer error", e);
                return null;
            }
        }
        if (z) {
            c91942.f23445 |= JSONReader$Feature.FieldBased.mask;
        }
        if (Enum.class.isAssignableFrom(cls3) && ((method = c91942.f23452) == null || method.getParameterCount() == 1)) {
            return m6155(cls3, c91942.f23452, c3635);
        }
        if (Throwable.class.isAssignableFrom(cls3)) {
            c91942.f23445 |= JSONReader$Feature.IgnoreSetNullValue.mask;
            z2 = false;
        } else {
            z2 = z;
        }
        if (cls3 == Class.class) {
            return C3552.f8628;
        }
        if (z2 && cls3.isInterface()) {
            z3 = false;
            c36352 = c3635;
            c9194 = c91942;
            c3609 = this;
        } else {
            z3 = z2;
            c36352 = c3635;
            c3609 = this;
            c9194 = c91942;
        }
        AbstractC3595[] abstractC3595ArrM6172 = c3609.m6172(cls3, type, c9194, z3, c36352);
        C3609 c36092 = c3609;
        C9194 c91943 = c9194;
        boolean z5 = z3;
        C3635 c36354 = c36352;
        int i3 = 0;
        while (true) {
            if (i3 >= abstractC3595ArrM6172.length) {
                z4 = true;
                break;
            }
            if (!abstractC3595ArrM6172[i3].mo6045()) {
                z4 = false;
                break;
            }
            i3++;
        }
        if (c91943.f23454 != null || c91943.f23452 != null) {
            return c36092.m6165(cls3, type, c36354, c91943);
        }
        if (c91943.f23435 != null) {
            return c36092.m6171(cls3, type, c36354, c91943);
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC3698.m6366(cls3, new C3497(arrayList2, 1));
        if (Throwable.class.isAssignableFrom(cls3)) {
            return new C3568(cls3, arrayList2, abstractC3595ArrM6172);
        }
        Class<?> declaringClass = cls3.getDeclaringClass();
        int i4 = -1;
        Constructor constructor2 = null;
        Constructor constructor3 = null;
        int i5 = 0;
        while (true) {
            if (i5 >= arrayList2.size()) {
                interfaceC3621 = interfaceC36212;
                constructor = constructor2;
                i5 = i4;
                break;
            }
            Constructor constructor4 = (Constructor) arrayList2.get(i5);
            if (constructor4.getParameterCount() == 0) {
                constructor3 = constructor4;
            }
            interfaceC3621 = interfaceC36212;
            if (declaringClass != null && constructor4.getParameterCount() == i2 && declaringClass.equals(constructor4.getParameterTypes()[0])) {
                constructor = constructor4;
                break;
            }
            if (constructor2 == null || constructor4.getParameterCount() == 0 || constructor2.getParameterCount() < constructor4.getParameterCount()) {
                i4 = i5;
                constructor2 = constructor4;
            }
            i5++;
            interfaceC36212 = interfaceC3621;
            i2 = 1;
        }
        if (i5 != -1) {
            arrayList2.remove(i5);
        }
        if (constructor != null && constructor.getParameterCount() != 0 && c91943.f23432 == null) {
            boolean zM6350 = AbstractC3698.m6350(cls3);
            constructor.setAccessible(true);
            String[] strArrM6354 = c91943.f23453;
            if (zM6350 && strArrM6354 == null) {
                strArrM6354 = AbstractC3698.m6354(cls3);
            }
            if (strArrM6354 == null || strArrM6354.length == 0) {
                strArrM14776 = AbstractC9420.m14776(constructor);
                Parameter[] parameters = constructor.getParameters();
                C9192 c9192 = new C9192();
                int i6 = 0;
                while (i6 < parameters.length && i6 < strArrM14776.length) {
                    c9192.m14424();
                    ArrayList arrayList3 = arrayList2;
                    c36354.m6183(c9192, cls, constructor, i6, parameters[i6]);
                    C9192 c91922 = c9192;
                    String str = c91922.f23394;
                    if (str != null) {
                        strArrM14776[i6] = str;
                    }
                    i6++;
                    c9192 = c91922;
                    arrayList2 = arrayList3;
                    c36354 = c3635;
                }
                cls3 = cls;
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                strArrM14776 = strArrM6354;
            }
            if (constructor3 != null) {
                i = 0;
                for (String str2 : strArrM14776) {
                    if (str2 != null) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= abstractC3595ArrM6172.length) {
                                break;
                            }
                            AbstractC3595 abstractC3595 = abstractC3595ArrM6172[i7];
                            if (abstractC3595 != null && str2.equals(abstractC3595.f8773)) {
                                i++;
                                break;
                            }
                            i7++;
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (!z5 && !Throwable.class.isAssignableFrom(cls3) && constructor3 == null && i != strArrM14776.length) {
                if (constructor.getParameterCount() == 1) {
                    C9192 c91923 = new C9192();
                    c3635.m6183(c91923, cls, constructor, 0, constructor.getParameters()[0]);
                    c36353 = c3635;
                    cls2 = cls;
                    if (zM6350) {
                        Field[] fieldArr = new Field[1];
                        AbstractC3698.m6384(cls2, new C3678(c91923.f23394, 1, fieldArr));
                        Field field = fieldArr[0];
                        if (field != null) {
                            c36353.m6182(c91923, cls2, field);
                        }
                    }
                    if ((c91923.f23390 & 281474976710656L) != 0) {
                        Type type2 = constructor.getGenericParameterTypes()[0];
                        Class<?> cls5 = constructor.getParameterTypes()[0];
                        String str3 = c91923.f23402;
                        if (str3 == null || str3.isEmpty()) {
                            M6197 = interfaceC3621;
                        } else {
                            JSONObject jSONObjectM6934 = InterfaceC3749.m6934(c91923.f23402);
                            if (!jSONObjectM6934.isEmpty()) {
                                M6197 = JSONSchema.m6197(jSONObjectM6934, cls5);
                            }
                        }
                        String str4 = c91923.f23404;
                        if (str4 != null && str4.getClass() != cls5) {
                            Function functionM6191 = AbstractC3766.m6947().m6191(str4.getClass(), type2);
                            if (functionM6191 == null) {
                                StringBuilder sb = new StringBuilder("illegal defaultValue : ");
                                sb.append((Object) str4);
                                sb.append(", class ");
                                C1123.m1410(AbstractC7012.m12148(cls5, sb));
                                return interfaceC3621;
                            }
                            functionM6191.apply(str4);
                        }
                        return new C3628(type2, c91923.f23390, M6197, constructor, null, null);
                    }
                } else {
                    c36353 = c3635;
                    cls2 = cls3;
                }
                if (z4 && abstractC3595ArrM6172.length != 0 && arrayList.isEmpty()) {
                    for (int i8 = 0; i8 < strArrM14776.length; i8++) {
                        String str5 = strArrM14776[i8];
                        int length = abstractC3595ArrM6172.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                AbstractC3595 abstractC35952 = abstractC3595ArrM6172[i9];
                                Field field2 = abstractC35952.f8769;
                                String str6 = abstractC35952.f8773;
                                if (field2 != null && field2.getName().equals(str5) && !str6.equals(str5)) {
                                    strArrM14776[i8] = str6;
                                    break;
                                }
                                i9++;
                            }
                        }
                    }
                }
                if (!f8822) {
                    InterfaceC3621 interfaceC36213 = interfaceC3621;
                    M14701 = interfaceC36213;
                    M14699 = interfaceC36213;
                } else if (constructor.getParameterCount() == 1) {
                    M14699 = AbstractC9396.m14699(constructor);
                    M14701 = interfaceC3621;
                } else if (constructor.getParameterCount() == 2) {
                    M14701 = AbstractC9396.m14701(constructor);
                    M14699 = interfaceC3621;
                }
                String[] strArr = strArrM14776;
                Class cls6 = cls2;
                return c36092.mo6088(cls6, c91943, new C3579(arrayList, constructor, M14699, M14701, null, strArr), arrayList, strArr, m6161(c36353, cls6, type, constructor, constructor.getParameters(), strArr), abstractC3595ArrM6172);
            }
        }
        Class[] clsArr = c91943.f23432;
        if (clsArr != null && clsArr.length != 0) {
            return new C3633(cls, c91943.f23437, null, JSONReader$Feature.SupportAutoType.mask, null, m6169(cls), null, clsArr, c91943.f23451, c91943.f23450, abstractC3595ArrM6172);
        }
        if (cls.isInterface()) {
            return new C3625(cls, null, null, 0L, null, null, null, abstractC3595ArrM6172);
        }
        C3605 c3605Mo6090 = mo6090(cls, c91943.f23437, c91943.f23427, c91943.f23445, JSONSchema.m6197(InterfaceC3749.m6934(c91943.f23441), cls), m6169(cls), null, abstractC3595ArrM6172);
        if (c3605Mo6090 != null && (r1 = c91943.f23428) != 0) {
            ?? r2 = interfaceC3621;
            try {
                ?? declaredConstructor2 = r1.getDeclaredConstructor(r2);
                declaredConstructor2.setAccessible(true);
                if (declaredConstructor2.newInstance(r2) != null) {
                    throw new ClassCastException();
                }
            } catch (Exception unused) {
            }
        }
        return c3605Mo6090;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public C3605 mo6090(Class cls, String str, String str2, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC3595... abstractC3595Arr) {
        if (cls != null) {
            int modifiers = cls.getModifiers();
            if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
                return new C3605(cls, str, null, j, jSONSchema, supplier, function, abstractC3595Arr);
            }
        }
        if (str2 != null) {
            return new C3632(cls, str, str2, j, jSONSchema, supplier, function, abstractC3595Arr);
        }
        switch (abstractC3595Arr.length) {
            case 1:
                return new C3509(cls, j, jSONSchema, supplier, function, abstractC3595Arr[0]);
            case 2:
                return new C3508(cls, j, jSONSchema, supplier, function, abstractC3595Arr[0], abstractC3595Arr[1]);
            case 3:
                return new C3504(cls, supplier, j, jSONSchema, function, abstractC3595Arr[0], abstractC3595Arr[1], abstractC3595Arr[2]);
            case 4:
                return new C3505(cls, j, jSONSchema, supplier, function, abstractC3595Arr[0], abstractC3595Arr[1], abstractC3595Arr[2], abstractC3595Arr[3]);
            case 5:
                return new C3619(cls, supplier, j, jSONSchema, function, abstractC3595Arr[0], abstractC3595Arr[1], abstractC3595Arr[2], abstractC3595Arr[3], abstractC3595Arr[4]);
            case 6:
                return new C3618(cls, supplier, j, jSONSchema, function, abstractC3595Arr[0], abstractC3595Arr[1], abstractC3595Arr[2], abstractC3595Arr[3], abstractC3595Arr[4], abstractC3595Arr[5]);
            case 7:
                return new C3622(cls, j, jSONSchema, supplier, function, abstractC3595Arr);
            case 8:
                return new C3623(cls, j, jSONSchema, supplier, function, abstractC3595Arr);
            case 9:
                return new C3620(cls, j, jSONSchema, supplier, function, abstractC3595Arr);
            case 10:
                return new C3511(cls, j, jSONSchema, supplier, function, abstractC3595Arr);
            case 11:
                return new C3507(cls, j, jSONSchema, supplier, function, abstractC3595Arr);
            case 12:
                return new C3506(cls, j, jSONSchema, supplier, function, abstractC3595Arr);
            default:
                return new C3605(cls, str, null, j, jSONSchema, supplier, function, abstractC3595Arr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r5.f23438 != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC3595[] m6172(Class cls, final Type type, C9194 c9194, boolean z, final C3635 c3635) {
        C9194 c91942;
        String str;
        C9194 c91943;
        C3635 c36352;
        long j;
        Class cls2;
        String name;
        Class cls3;
        Class cls4;
        int i;
        LinkedHashMap linkedHashMap;
        int i2;
        boolean z2;
        Method[] methodArr;
        LinkedHashMap linkedHashMap2;
        C9192 c9192;
        Method methodM6357;
        Annotation[] annotationArr;
        LinkedHashMap linkedHashMap3;
        String str2;
        final Class cls5 = cls;
        if (c9194 == null) {
            C9194 c91944 = new C9194(c3635);
            Iterator it = c3635.f9025.iterator();
            while (it.hasNext()) {
                ((C3612) it.next()).f8845.m4715(cls5, c91944);
            }
            c91942 = c91944;
        } else {
            c91942 = c9194;
        }
        boolean zM6350 = AbstractC3698.m6350(cls5);
        final String str3 = c91942.f23449;
        final LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        final long j2 = c91942.f23445;
        final String str4 = c91942.f23431;
        final C9192 c91922 = new C9192();
        final String[] strArr = c91942.f23447;
        if (z) {
            Consumer consumer = new Consumer(this) { // from class: com.alibaba.fastjson2.reader.飘花落叶言子苏哲兰楪世
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C9192 c91923 = c91922;
                    c91923.m14424();
                    c91923.f23390 = c91923.f23390 | JSONReader$Feature.FieldBased.mask | j2;
                    c91923.f23393 = str4;
                    C3609.m6152(cls5, type, str3, strArr, c91923, (Field) obj, linkedHashMap4, c3635);
                }
            };
            cls2 = cls5;
            AbstractC3698.m6384(cls2, consumer);
        } else {
            C9194 c91945 = c91942;
            C9192 c91923 = c91922;
            String str5 = str3;
            String[] strArr2 = strArr;
            if (zM6350) {
                str = str4;
                c91943 = c91945;
                c36352 = c3635;
                j = j2;
            } else {
                c36352 = c3635;
                C3610 c3610 = new C3610(this, c91923, j2, str4, cls5, type, str5, strArr2, linkedHashMap4, c36352, c91945);
                str = str4;
                c91943 = c91945;
                j = j2;
                cls5 = cls5;
                str5 = str5;
                strArr2 = strArr2;
                AbstractC3698.m6384(cls5, c3610);
            }
            Class clsMo6186 = c36352.mo6186(cls5);
            if (!AbstractC3698.m6361(cls5)) {
                ConcurrentHashMap concurrentHashMap = AbstractC3698.f9358;
                Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls5);
                if (methodArrM6356 == null) {
                    methodArrM6356 = AbstractC3698.m6356(cls5);
                    concurrentHashMap.putIfAbsent(cls5, methodArrM6356);
                }
                Method[] methodArr2 = methodArrM6356;
                int length = methodArr2.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = length;
                    Method method = methodArr2[i3];
                    if (Modifier.isStatic(method.getModifiers()) || method.getDeclaringClass() == Object.class) {
                        cls4 = clsMo6186;
                    } else {
                        name = method.getName();
                        name.getClass();
                        cls3 = clsMo6186;
                        switch (name) {
                            case "toString":
                            case "equals":
                            case "hashCode":
                                cls4 = cls3;
                                break;
                            case "copy":
                                break;
                            default:
                                int parameterCount = method.getParameterCount();
                                Class<?> returnType = method.getReturnType();
                                if (parameterCount == 0) {
                                    String str6 = str5;
                                    if (name.length() <= 3 || !name.startsWith("get")) {
                                        cls4 = cls3;
                                        i = i3;
                                        str5 = str6;
                                        i2 = i4;
                                        methodArr = methodArr2;
                                    } else if (returnType == AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || returnType == AtomicReference.class || Collection.class.isAssignableFrom(returnType) || Map.class.isAssignableFrom(returnType)) {
                                        c91923.m14424();
                                        c91923.f23390 |= j;
                                        c91923.f23393 = str;
                                        i = i3;
                                        linkedHashMap2 = linkedHashMap4;
                                        C3635 c36353 = c36352;
                                        str5 = str6;
                                        cls4 = cls3;
                                        i2 = i4;
                                        methodArr = methodArr2;
                                        c9192 = c91923;
                                        m6163(cls, type, str5, strArr2, c91943, c9192, method, linkedHashMap2, c36353);
                                        c91923 = c9192;
                                        linkedHashMap4 = linkedHashMap2;
                                    } else {
                                        str5 = str6;
                                        cls4 = cls3;
                                        i = i3;
                                        linkedHashMap = linkedHashMap4;
                                        z2 = false;
                                        i2 = i4;
                                    }
                                    break;
                                } else {
                                    cls4 = cls3;
                                    i = i3;
                                    linkedHashMap = linkedHashMap4;
                                    i2 = i4;
                                    z2 = false;
                                }
                                methodArr = methodArr2;
                                if (parameterCount == 2) {
                                    boolean z3 = z2;
                                    if (method.getReturnType() == Void.TYPE && method.getParameterTypes()[z3 ? 1 : 0] == String.class) {
                                        Annotation[] annotationArrM6380 = AbstractC3698.m6380(method);
                                        AtomicBoolean atomicBoolean = new AtomicBoolean(z3);
                                        int length2 = annotationArrM6380.length;
                                        int i5 = z3 ? 1 : 0;
                                        while (true) {
                                            if (i5 < length2) {
                                                Annotation annotation = annotationArrM6380[i5];
                                                Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                                                InterfaceC9196 interfaceC9196 = (InterfaceC9196) AbstractC3698.m6379(annotation, InterfaceC9196.class);
                                                if (interfaceC9196 == null) {
                                                    annotationArr = annotationArrM6380;
                                                    String name2 = clsAnnotationType.getName();
                                                    linkedHashMap3 = linkedHashMap;
                                                    if (name2.equals("com.fasterxml.jackson.annotation.JsonAnySetter")) {
                                                        str2 = str5;
                                                        if (AbstractC3766.f9633) {
                                                            atomicBoolean.set(true);
                                                        }
                                                    } else if (name2.equals("com.alibaba.fastjson.annotation.JSONField")) {
                                                        str2 = str5;
                                                        AbstractC3698.m6371(annotation.getClass(), new C3678(annotation, 2, atomicBoolean));
                                                    }
                                                    i5++;
                                                    annotationArrM6380 = annotationArr;
                                                    linkedHashMap = linkedHashMap3;
                                                    str5 = str2;
                                                } else if (interfaceC9196.unwrapped()) {
                                                    atomicBoolean.set(true);
                                                } else {
                                                    annotationArr = annotationArrM6380;
                                                    linkedHashMap3 = linkedHashMap;
                                                }
                                                str2 = str5;
                                                i5++;
                                                annotationArrM6380 = annotationArr;
                                                linkedHashMap = linkedHashMap3;
                                                str5 = str2;
                                            }
                                        }
                                        LinkedHashMap linkedHashMap5 = linkedHashMap;
                                        String str7 = str5;
                                        if (!atomicBoolean.get()) {
                                            linkedHashMap4 = linkedHashMap5;
                                            str5 = str7;
                                        } else {
                                            c91923.m14424();
                                            c91923.f23390 |= j;
                                            c91923.f23393 = str;
                                            c9192 = c91923;
                                            linkedHashMap2 = linkedHashMap5;
                                            str5 = str7;
                                            m6163(cls, type, str5, strArr2, c91943, c9192, method, linkedHashMap2, c3635);
                                            c91923 = c9192;
                                            linkedHashMap4 = linkedHashMap2;
                                        }
                                    } else {
                                        linkedHashMap4 = linkedHashMap;
                                        if (parameterCount == 1) {
                                            boolean z4 = name.length() > 3 && (name.startsWith("set") || returnType == cls);
                                            if (!z4 && cls4 != null && (methodM6357 = AbstractC3698.m6357(method, cls4)) != null) {
                                                Annotation[] annotationArrM63802 = AbstractC3698.m6380(methodM6357);
                                                int length3 = annotationArrM63802.length;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 < length3) {
                                                        Annotation annotation2 = annotationArrM63802[i6];
                                                        Annotation[] annotationArr2 = annotationArrM63802;
                                                        if (annotation2.annotationType() != InterfaceC9196.class) {
                                                            i6++;
                                                            annotationArrM63802 = annotationArr2;
                                                        } else if (!((InterfaceC9196) annotation2).unwrapped()) {
                                                            z4 = true;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!z4) {
                                                Annotation[] annotationArrM63803 = AbstractC3698.m6380(method);
                                                int length4 = annotationArrM63803.length;
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 < length4) {
                                                        Annotation annotation3 = annotationArrM63803[i7];
                                                        Annotation[] annotationArr3 = annotationArrM63803;
                                                        if (annotation3.annotationType() != InterfaceC9196.class) {
                                                            i7++;
                                                            annotationArrM63803 = annotationArr3;
                                                        } else if (!((InterfaceC9196) annotation3).unwrapped()) {
                                                            z4 = true;
                                                        }
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                c91923.m14424();
                                                c91923.f23390 |= j;
                                                c91923.f23393 = str;
                                                C9192 c91924 = c91923;
                                                m6163(cls, type, str5, strArr2, c91943, c91924, method, linkedHashMap4, c3635);
                                                c91923 = c91924;
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                        i3 = i + 1;
                        clsMo6186 = cls4;
                        methodArr2 = methodArr;
                        length = i2;
                        c36352 = c3635;
                    }
                    i = i3;
                    i2 = i4;
                    methodArr = methodArr2;
                    i3 = i + 1;
                    clsMo6186 = cls4;
                    methodArr2 = methodArr;
                    length = i2;
                    c36352 = c3635;
                }
            }
            if (cls.isInterface()) {
                cls2 = cls;
                AbstractC3698.m6362(cls2, new C3610(this, c91923, j, cls, type, str5, strArr2, c91943, linkedHashMap4, c3635));
            } else {
                cls2 = cls;
            }
        }
        Class superclass = cls2.getSuperclass();
        if (AbstractC3698.m6360(cls2)) {
            Type genericSuperclass = cls2.getGenericSuperclass();
            C3614 c3614 = new C3614(1);
            f8821.getClass();
            AbstractC3595 abstractC3595M6153 = m6153(null, null, "$super$", genericSuperclass, superclass, 0, 0L, null, null, null, null, null, c3614, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractC3595M6153);
            linkedHashMap4.put("$super$", arrayList);
        }
        return m6148(linkedHashMap4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final IntFunction m6173(Constructor constructor) {
        Class<?> declaringClass = constructor.getDeclaringClass();
        MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(declaringClass);
        try {
            return (IntFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9411, AbstractC3700.f9383, lookupM6328.findConstructor(declaringClass, AbstractC3700.f9400), MethodType.methodType(declaringClass, (Class<?>) Integer.TYPE)).getTarget().invokeExact();
        } catch (Throwable unused) {
            this.f8823.incrementAndGet();
            return null;
        }
    }
}
