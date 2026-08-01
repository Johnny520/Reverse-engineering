package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import bsh.C3466;
import bsh.C3478;
import bsh.C3497;
import com.alibaba.fastjson2.AbstractC3740;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.reader.C3613;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p294.C9192;
import p294.C9194;
import p295.InterfaceC9196;
import p306.InterfaceC9245;
import p307.InterfaceC9352;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3698 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static volatile Method f9363;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static volatile Class f9364;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static volatile Method f9365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Type[] f9362 = new Type[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f9361 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f9360 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f9359 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f9358 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f9357 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long[] f9366 = {-9214723784238596577L, -9030616758866828325L, -8335274122997354104L, -6963030519018899258L, -4863137578837233966L, -3653547262287832698L, -2819277587813726773L, -2669552864532011468L, -2458634727370886912L, -2291619803571459675L, -1811306045128064037L, -864440709753525476L, -779604756358333743L, 8731803887940231L, 1616814008855344660L, 2164749833121980361L, 2688642392827789427L, 3724195282986200606L, 3742915795806478647L, 3977020351318456359L, 4775491097662790952L, 4882459834864833642L, 6033839080488254886L, 7981148566008458638L, 8344106065386396833L, 9215465129261900012L};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static void m6342(Class cls, Consumer consumer) {
        ConcurrentHashMap concurrentHashMap = f9358;
        Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM6356 == null) {
            methodArrM6356 = m6356(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM6356);
        }
        for (Method method : methodArrM6356) {
            if (Modifier.isStatic(method.getModifiers())) {
                consumer.accept(method);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static String m6343(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013e A[EDGE_INSN: B:88:0x013e->B:82:0x013e BREAK  A[LOOP:0: B:3:0x0002->B:91:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[LOOP:0: B:3:0x0002->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m6344(Type type, Class cls, Type type2, HashMap map) {
        Type typeM6344;
        Type beanUtils$ParameterizedTypeImpl;
        TypeVariable typeVariable = null;
        while (true) {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = (TypeVariable) type2;
                Type type3 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 == null) {
                    type2 = typeVariable2;
                    if (type2 != typeVariable2) {
                        break;
                    }
                } else {
                    Type typeM6359 = m6359(cls, cls3, type);
                    if (typeM6359 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable2.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) typeM6359).getActualTypeArguments()[i];
                            } else {
                                i++;
                            }
                        }
                        C3466.m5896();
                        return null;
                    }
                    if (type2 != typeVariable2) {
                    }
                }
            } else if (type2 instanceof Class) {
                Class cls4 = (Class) type2;
                if (cls4.isArray()) {
                    Class<?> componentType = cls4.getComponentType();
                    Type typeM63442 = m6344(type, cls, componentType, map);
                    if (Objects.equals(componentType, typeM63442)) {
                        type2 = cls4;
                    } else {
                        beanUtils$ParameterizedTypeImpl = new BeanUtils$GenericArrayTypeImpl(typeM63442);
                        type2 = beanUtils$ParameterizedTypeImpl;
                    }
                } else if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type typeM63443 = m6344(type, cls, genericComponentType, map);
                    if (!Objects.equals(genericComponentType, typeM63443)) {
                        beanUtils$ParameterizedTypeImpl = new BeanUtils$GenericArrayTypeImpl(typeM63443);
                        type2 = beanUtils$ParameterizedTypeImpl;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type typeM63444 = m6344(type, cls, ownerType, map);
                    boolean z = !Objects.equals(typeM63444, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type type4 = actualTypeArguments[i];
                        if (type4 != String.class) {
                            Type typeM63445 = m6344(type, cls, type4, map);
                            if (!Objects.equals(typeM63445, type4)) {
                                if (!z) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z = true;
                                }
                                actualTypeArguments[i] = typeM63445;
                            }
                        }
                        i++;
                    }
                    if (z) {
                        beanUtils$ParameterizedTypeImpl = new BeanUtils$ParameterizedTypeImpl(typeM63444, type2.getRawType(), actualTypeArguments);
                        type2 = beanUtils$ParameterizedTypeImpl;
                    }
                } else if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type typeM63446 = m6344(type, cls, lowerBounds[0], map);
                        if (typeM63446 != lowerBounds[0]) {
                            type2 = new BeanUtils$WildcardTypeImpl(new Type[]{Object.class}, typeM63446 instanceof WildcardType ? ((WildcardType) typeM63446).getLowerBounds() : new Type[]{typeM63446});
                        }
                    } else if (upperBounds.length == 1 && (typeM6344 = m6344(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                        type2 = new BeanUtils$WildcardTypeImpl(typeM6344 instanceof WildcardType ? ((WildcardType) typeM6344).getUpperBounds() : new Type[]{typeM6344}, f9362);
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type2);
        }
        return type2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static Method[] m6345(Class cls) {
        if (AbstractC3687.f9263 < 14 && AbstractC3687.f9278 < 33) {
            return new Method[0];
        }
        try {
            if (f9363 == null) {
                f9363 = Class.class.getMethod("getRecordComponents", null);
            }
            if (f9365 == null) {
                f9365 = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) f9363.invoke(cls, null);
            Method[] methodArr = new Method[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                methodArr[i] = cls.getMethod((String) f9365.invoke(objArr[i], null), null);
            }
            return methodArr;
        } catch (Exception e) {
            C1123.m1408(AbstractC7012.m12140("Failed to access Methods needed to support `java.lang.Record`: (", e.getClass().getName(), ") ", e.getMessage()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static String m6346(int i, String str) {
        int length = str.length();
        char[] cArr = (char[]) AbstractC3700.f9386.getAndSet(AbstractC3700.f9387, null);
        if (cArr == null) {
            cArr = new char[128];
        }
        int i2 = i;
        int i3 = 0;
        while (i2 < length) {
            try {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                    if (i2 > i) {
                        cArr[i3] = '_';
                        i3++;
                    }
                }
                cArr[i3] = cCharAt;
                i2++;
                i3++;
            } catch (Throwable th) {
                AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i3);
        AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static String m6347(String str, String str2) {
        int i;
        int i2;
        char c;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        if (length <= 3) {
            return str;
        }
        i2 = str.startsWith("set") ? 3 : 0;
        switch (str2) {
            case "UpperCase":
                int i3 = length - i2;
                char[] cArr = new char[i3];
                str.getChars(i2, length, cArr, 0);
                char c2 = cArr[0];
                for (i = 0; i < i3; i++) {
                    char c3 = cArr[i];
                    if (c3 >= 'a' && c2 <= 'z') {
                        cArr[i] = (char) (c3 - ' ');
                    }
                }
                return new String(cArr);
            case "UpperCaseWithDots":
                return m6388(i2, str, true);
            case "NeverUseThisValueExceptDefaultValue":
            case "CamelCase":
                int i4 = length - i2;
                char[] cArr2 = new char[i4];
                str.getChars(i2, length, cArr2, 0);
                char c4 = cArr2[0];
                boolean z = i4 > 1 && (c = cArr2[1]) >= 'A' && c <= 'Z';
                if (c4 >= 'A' && c4 <= 'Z' && !z) {
                    cArr2[0] = (char) (c4 + ' ');
                }
                return new String(cArr2);
            case "LowerCaseWithUnderScores":
                return m6391(i2, str, false);
            case "UpperCamelCaseWithUnderScores":
                return m6390(str, i2, '_');
            case "UpperCaseWithDashes":
                return m6385(i2, str, true);
            case "UpperCamelCaseWithDashes":
                return m6390(str, i2, SignatureVisitor.SUPER);
            case "UpperCamelCaseWithDots":
                return m6390(str, i2, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            case "LowerCaseWithDots":
                return m6388(i2, str, false);
            case "PascalCase":
                return m6353(length, i2, str);
            case "UpperCamelCaseWithSpaces":
                return m6390(str, i2, ' ');
            case "KebabCase":
                StringBuilder sb = new StringBuilder();
                for (int i5 = i2; i5 < str.length(); i5++) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + ' ');
                        if (i5 > i2) {
                            sb.append(SignatureVisitor.SUPER);
                        }
                    }
                    sb.append(cCharAt);
                }
                return sb.toString();
            case "LowerCase":
                return str.substring(i2).toLowerCase();
            case "LowerCaseWithDashes":
                return m6385(i2, str, false);
            case "CamelCase1x":
                char[] cArr3 = new char[length - i2];
                str.getChars(i2, length, cArr3, 0);
                char c5 = cArr3[0];
                if (c5 >= 'A' && c5 <= 'Z') {
                    cArr3[0] = (char) (c5 + ' ');
                }
                return new String(cArr3);
            case "UpperCaseWithUnderScores":
                return m6391(i2, str, true);
            case "SnakeCase":
                return m6346(i2, str);
            default:
                C1123.m1410("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m6348(C9192 c9192, Annotation annotation) {
        String[] strArr = new String[3];
        m6371(annotation.getClass(), new C3678(annotation, 0, strArr));
        if (strArr[0].length() != 0) {
            c9192.f23393 = strArr[0];
        }
        if ("STRING".equals(strArr[1]) && c9192.f23393 == null) {
            c9192.f23393 = "string";
        } else if ("NUMBER".equals(strArr[1])) {
            c9192.f23393 = "millis";
        }
        if (strArr[2].isEmpty() || "##default".equals(strArr[2])) {
            return;
        }
        c9192.f23401 = Locale.forLanguageTag(strArr[2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m6349(C9192 c9192, Annotation annotation) {
        c9192.f23389 = true;
        m6371(annotation.getClass(), new C3613(annotation, c9192, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m6350(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        if (f9364 != null) {
            return superclass == f9364;
        }
        if (!"com.android.tools.r8.RecordTag".equals(superclass.getName())) {
            return false;
        }
        f9364 = superclass;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m6351(AccessibleObject accessibleObject) {
        for (Annotation annotation : accessibleObject.getAnnotations()) {
            String name = annotation.annotationType().getName();
            if (name.equals("com.fasterxml.jackson.annotation.JsonValue") || name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                if (AbstractC3766.f9633) {
                    return true;
                }
            } else {
                if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    return true;
                }
                if (!name.equals("com.fasterxml.jackson.annotation.JsonRawValue")) {
                    if (name.equals("飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲兰苏")) {
                        return true;
                    }
                    if (!name.equals("com.fasterxml.jackson.annotation.JsonUnwrapped")) {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m6352(C9194 c9194, Annotation annotation, Method method) {
        try {
            Object objInvoke = method.invoke(annotation, null);
            String name = method.getName();
            switch (name.hashCode()) {
                case -1678076717:
                    if (name.equals("deserializer")) {
                        Class cls = (Class) objInvoke;
                        if (InterfaceC3621.class.isAssignableFrom(cls)) {
                            c9194.f23443 = cls;
                            return;
                        }
                        return;
                    }
                    return;
                case -1315832283:
                    if (name.equals("serializeEnumAsJavaBean") && ((Boolean) objInvoke).booleanValue()) {
                        c9194.f23448 = true;
                        return;
                    }
                    return;
                case -1210506547:
                    if (!name.equals("alphabetic") || ((Boolean) objInvoke).booleanValue()) {
                        return;
                    }
                    c9194.f23429 = false;
                    return;
                case -1052827512:
                    if (name.equals("naming")) {
                        c9194.f23449 = ((Enum) objInvoke).name();
                        return;
                    }
                    return;
                case -1008770331:
                    if (name.equals("orders")) {
                        String[] strArr = (String[]) objInvoke;
                        if (strArr.length != 0) {
                            c9194.f23447 = strArr;
                            return;
                        }
                        return;
                    }
                    return;
                case -940893828:
                    if (!name.equals("serialzeFeatures")) {
                        return;
                    }
                    break;
                case -853109563:
                    if (name.equals("typeKey")) {
                        String str = (String) objInvoke;
                        if (str.isEmpty()) {
                            return;
                        }
                        c9194.f23437 = str;
                        return;
                    }
                    return;
                case -676507419:
                    if (name.equals("typeName")) {
                        String str2 = (String) objInvoke;
                        if (str2.isEmpty()) {
                            return;
                        }
                        c9194.f23436 = str2;
                        return;
                    }
                    return;
                case -597985902:
                    if (name.equals("serializer")) {
                        Class cls2 = (Class) objInvoke;
                        if (InterfaceC9352.class.isAssignableFrom(cls2)) {
                            c9194.f23448 = true;
                            c9194.f23442 = cls2;
                            return;
                        }
                        return;
                    }
                    return;
                case -167039347:
                    if (name.equals("rootName")) {
                        String str3 = (String) objInvoke;
                        if (str3.isEmpty()) {
                            return;
                        }
                        c9194.f23427 = str3;
                        return;
                    }
                    return;
                case 90259659:
                    if (name.equals("includes")) {
                        String[] strArr2 = (String[]) objInvoke;
                        if (strArr2.length != 0) {
                            c9194.f23439 = strArr2;
                            return;
                        }
                        return;
                    }
                    return;
                case 1752415457:
                    if (name.equals("ignores")) {
                        String[] strArr3 = (String[]) objInvoke;
                        if (strArr3.length != 0) {
                            if (c9194.f23446 == null) {
                                c9194.f23446 = strArr3;
                                return;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            linkedHashSet.addAll(Arrays.asList(c9194.f23446));
                            linkedHashSet.addAll(Arrays.asList(strArr3));
                            c9194.f23446 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                            return;
                        }
                        return;
                    }
                    return;
                case 1869860669:
                    if (!name.equals("serializeFeatures")) {
                        return;
                    }
                    break;
                case 1970571962:
                    if (name.equals("seeAlso")) {
                        Class[] clsArr = (Class[]) objInvoke;
                        if (clsArr.length != 0) {
                            c9194.f23432 = clsArr;
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
            for (Enum r0 : (Enum[]) objInvoke) {
                String strName = r0.name();
                switch (strName.hashCode()) {
                    case -1937516631:
                        if (strName.equals("WriteNullNumberAsZero")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteNullNumberAsZero.mask;
                        }
                        break;
                    case -1779797023:
                        if (strName.equals("IgnoreErrorGetter")) {
                            c9194.f23444 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
                        }
                        break;
                    case -335314544:
                        if (strName.equals("WriteEnumUsingToString")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteEnumUsingToString.mask;
                        }
                        break;
                    case -211922948:
                        if (strName.equals("BrowserCompatible")) {
                            c9194.f23444 |= JSONWriter$Feature.BrowserCompatible.mask;
                        }
                        break;
                    case -102443356:
                        if (strName.equals("WriteNullStringAsEmpty")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteNullStringAsEmpty.mask;
                        }
                        break;
                    case -62964779:
                        if (strName.equals("NotWriteRootClassName")) {
                            c9194.f23444 |= JSONWriter$Feature.NotWriteRootClassName.mask;
                        }
                        break;
                    case 1009181687:
                        if (strName.equals("WriteNullListAsEmpty")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteNullListAsEmpty.mask;
                        }
                        break;
                    case 1519175029:
                        if (strName.equals("WriteNonStringValueAsString")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
                        }
                        break;
                    case 1808123471:
                        if (strName.equals("WriteNullBooleanAsFalse")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteNullBooleanAsFalse.mask;
                        }
                        break;
                    case 1879776036:
                        if (strName.equals("WriteClassName")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteClassName.mask;
                        }
                        break;
                    case 2049970061:
                        if (strName.equals("WriteMapNullValue")) {
                            c9194.f23444 |= JSONWriter$Feature.WriteNulls.mask;
                        }
                        break;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static String m6353(int i, int i2, String str) {
        char c;
        char c2;
        int i3 = i - i2;
        char[] cArr = new char[i3];
        str.getChars(i2, i, cArr, 0);
        char c3 = cArr[0];
        if (c3 >= 'a' && c3 <= 'z' && i3 > 1) {
            cArr[0] = (char) (c3 - ' ');
        } else if (c3 == '_' && i3 > 2 && (c = cArr[1]) >= 'a' && c <= 'z' && (c2 = cArr[2]) >= 'a' && c2 <= 'z') {
            cArr[1] = (char) (c - ' ');
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static String[] m6354(Class cls) {
        if (AbstractC3687.f9263 < 14 && AbstractC3687.f9278 < 33) {
            return new String[0];
        }
        try {
            if (f9363 == null) {
                f9363 = Class.class.getMethod("getRecordComponents", null);
            }
            if (f9365 == null) {
                f9365 = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) f9363.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) f9365.invoke(objArr[i], null);
            }
            return strArr;
        } catch (Exception e) {
            C1123.m1408(AbstractC7012.m12140("Failed to access Methods needed to support `java.lang.Record`: (", e.getClass().getName(), ") ", e.getMessage()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static Class m6355(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            m6368(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m6355(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m6355(((WildcardType) type).getUpperBounds()[0]);
        }
        C6385.m11433("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Method[] m6356(Class cls) {
        try {
            return m6350(cls) ? m6345(cls) : cls.getMethods();
        } catch (NoClassDefFoundError unused) {
            return new Method[0];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static Method m6357(Method method, Class cls) {
        if (cls == null || cls == Object.class || cls == Serializable.class) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f9358;
        Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM6356 == null) {
            methodArrM6356 = m6356(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM6356);
        }
        for (Method method2 : methodArrM6356) {
            if (method2.getName().equals(method.getName()) && method2.getParameterCount() == method.getParameterCount()) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (!parameterTypes[i].equals(parameterTypes2[i])) {
                        break;
                    }
                }
                return method2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static Method m6358(Class cls, String str) {
        ConcurrentHashMap concurrentHashMap = f9358;
        Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM6356 == null) {
            methodArrM6356 = m6356(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM6356);
        }
        for (Method method : methodArrM6356) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Type m6359(Class cls, Class cls2, Type type) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m6359(interfaces[i], cls2, cls.getGenericInterfaces()[i]);
                }
            }
        }
        if (cls != null && !cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m6359(superclass, cls2, cls.getGenericSuperclass());
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m6360(Class cls) {
        Class superclass;
        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == TreeMap.class || cls.getSimpleName().isEmpty() || !(((superclass = cls.getSuperclass()) == HashMap.class || superclass == LinkedHashMap.class || superclass == TreeMap.class) && m6372(cls, false) == null)) {
            return false;
        }
        m6384(cls, new C3478(superclass, new ArrayList()));
        return !r0.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m6361(Class cls) {
        if (cls == null) {
            return true;
        }
        return Arrays.binarySearch(f9366, AbstractC3693.m6334(cls.getName())) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m6362(Class cls, Consumer consumer) {
        m6363(cls, null, false, consumer);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0338 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0135  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6363(Class cls, Class cls2, boolean z, Consumer consumer) {
        int i;
        boolean z2;
        Method[] methodArr;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        Class<?> cls3;
        int i5;
        Object obj;
        int i6;
        char cCharAt;
        int i7;
        Method method;
        Method methodM6357;
        int i8;
        if (cls == null) {
            return;
        }
        int i9 = 0;
        int i10 = 1;
        if (Proxy.isProxyClass(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length == 1) {
                m6362(interfaces[0], consumer);
                return;
            }
        }
        if (m6361(cls)) {
            return;
        }
        Class<?> superclass = cls.getSuperclass();
        if (AbstractC3700.m6497(cls)) {
            m6362(superclass, consumer);
            return;
        }
        boolean zM6350 = m6350(cls);
        boolean zM6332 = AbstractC3693.m6332(cls);
        String[] strArrM6354 = zM6350 ? m6354(cls) : null;
        ConcurrentHashMap concurrentHashMap = f9358;
        Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM6356 == null) {
            methodArrM6356 = m6356(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM6356);
        }
        boolean z5 = superclass != null && "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName());
        int length = methodArrM6356.length;
        int i11 = 0;
        while (i11 < length) {
            Method method2 = methodArrM6356[i11];
            if (method2.getParameterCount() == 0 && !Modifier.isStatic(method2.getModifiers())) {
                i = i9;
                Class<?> returnType = method2.getReturnType();
                if (returnType == Void.class || returnType == (cls3 = Void.TYPE) || m6361(returnType)) {
                    z2 = zM6350;
                } else {
                    Class<?> declaringClass = method2.getDeclaringClass();
                    z2 = zM6350;
                    if (declaringClass != Enum.class && declaringClass != Object.class) {
                        String name = method2.getName();
                        if (!zM6332 || "getSQLTypeName".equals(name) || "getAttributes".equals(name)) {
                            name.getClass();
                            z4 = zM6332;
                            int i12 = -1;
                            switch (name.hashCode()) {
                                case -1776922004:
                                    i5 = name.equals("toString") ? i : -1;
                                    break;
                                case -1650707301:
                                    i5 = name.equals("getSerializedSize") ? 1 : -1;
                                    break;
                                case -1295482945:
                                    i5 = name.equals("equals") ? 2 : -1;
                                    break;
                                case -176012470:
                                    i5 = name.equals("isInitialized") ? 3 : -1;
                                    break;
                                case 147696667:
                                    i5 = name.equals("hashCode") ? 4 : -1;
                                    break;
                                case 598581443:
                                    i5 = name.equals("getInitializationErrorString") ? 5 : -1;
                                    break;
                                default:
                                    i5 = -1;
                                    break;
                            }
                            switch (i5) {
                                case 1:
                                case 3:
                                case 5:
                                    if (!z5) {
                                        if (z5 && (name.endsWith("Type") || name.endsWith("Bytes"))) {
                                            z3 = z5;
                                            if ("com.google.protobuf.ByteString".equals(returnType.getName())) {
                                                methodArr = methodArrM6356;
                                            }
                                        } else {
                                            z3 = z5;
                                        }
                                        boolean zStartsWith = name.startsWith("isSet");
                                        Class<?> cls4 = Boolean.TYPE;
                                        if (zStartsWith && returnType == cls4) {
                                            i3 = length;
                                            String strM6365 = m6365(name, null);
                                            i2 = i11;
                                            String strConcat = "g".concat(strM6365.substring(1));
                                            String strConcat2 = "un".concat(strM6365);
                                            obj = "getSerializedSize";
                                            int length2 = methodArrM6356.length;
                                            methodArr = methodArrM6356;
                                            int i13 = i;
                                            int i14 = i13;
                                            int i15 = i14;
                                            int i16 = i15;
                                            while (i13 < length2) {
                                                Method method3 = methodArr[i13];
                                                int i17 = length2;
                                                if (method3.getName().equals(strM6365)) {
                                                    i8 = i13;
                                                    if (method3.getParameterCount() == 1 && method3.getReturnType() == cls3) {
                                                        i14 = 1;
                                                    }
                                                    i13 = i8 + 1;
                                                    length2 = i17;
                                                } else {
                                                    i8 = i13;
                                                }
                                                if (method3.getName().equals(strConcat) && method3.getParameterCount() == 0) {
                                                    i16 = 1;
                                                } else if (method3.getName().equals(strConcat2) && method3.getParameterCount() == 0 && method3.getReturnType() == cls3) {
                                                    i15 = 1;
                                                }
                                                i13 = i8 + 1;
                                                length2 = i17;
                                            }
                                            if (i14 != 0 && i15 != 0 && i16 != 0 && m6378(method2, InterfaceC9196.class) == null) {
                                                i4 = 1;
                                                break;
                                            }
                                        } else {
                                            obj = "getSerializedSize";
                                            methodArr = methodArrM6356;
                                            i3 = length;
                                            i2 = i11;
                                        }
                                        if (z2) {
                                            int length3 = strArrM6354.length;
                                            for (int i18 = i; i18 < length3; i18++) {
                                                if (name.equals(strArrM6354[i18])) {
                                                    consumer.accept(method2);
                                                    i4 = 1;
                                                }
                                            }
                                        }
                                        int length4 = name.length();
                                        int i19 = (length4 <= 3 || !name.startsWith("get")) ? i : 1;
                                        if (i19 == 0) {
                                            if (returnType == cls4 || returnType == Boolean.class || z) {
                                                i6 = (length4 <= 2 || !name.startsWith("is")) ? i : 1;
                                                if (i6 != 0 && (cCharAt = name.charAt(2)) >= 'a' && cCharAt <= 'z') {
                                                    i7 = 3;
                                                    if (length4 == 3) {
                                                        i6 = i;
                                                    }
                                                }
                                                if (i6 == 0 && m6351(method2)) {
                                                    i6 = 1;
                                                }
                                                if (i6 == 0 && cls2 != null && (methodM6357 = m6357(method2, cls2)) != null && m6351(methodM6357)) {
                                                    i6 = 1;
                                                }
                                                if (i6 != 0 || cls == returnType || name.startsWith("build")) {
                                                    i4 = 1;
                                                } else {
                                                    Method[] methodArrM63562 = (Method[]) concurrentHashMap.get(cls);
                                                    if (methodArrM63562 == null) {
                                                        methodArrM63562 = m6356(cls);
                                                        concurrentHashMap.putIfAbsent(cls, methodArrM63562);
                                                    }
                                                    int length5 = methodArrM63562.length;
                                                    int i20 = i;
                                                    while (true) {
                                                        if (i20 < length5) {
                                                            method = methodArrM63562[i20];
                                                            if (method.getName().equals(name) && method.getReturnType() == cls) {
                                                                i4 = 1;
                                                                if (method.getParameterCount() != 1 || method.getParameterTypes()[i] != returnType) {
                                                                }
                                                            }
                                                            i20++;
                                                        } else {
                                                            i4 = 1;
                                                            method = null;
                                                        }
                                                    }
                                                    if (method != null) {
                                                        i6 = i4;
                                                    }
                                                }
                                                if (i6 != 0) {
                                                    if (!z3) {
                                                        consumer.accept(method2);
                                                    } else if (method2.getDeclaringClass() != superclass) {
                                                        Class<?> returnType2 = method2.getReturnType();
                                                        switch (name.hashCode()) {
                                                            case -1650707301:
                                                                if (name.equals(obj)) {
                                                                    i12 = i;
                                                                }
                                                                break;
                                                            case 132778702:
                                                                if (name.equals("getParserForType")) {
                                                                    i12 = i4;
                                                                }
                                                                break;
                                                            case 208401389:
                                                                if (name.equals("getUnknownFields")) {
                                                                    i12 = 2;
                                                                }
                                                                break;
                                                            case 313806618:
                                                                if (name.equals("getMessageBytes")) {
                                                                    i12 = i7;
                                                                }
                                                                break;
                                                            case 2019988419:
                                                                if (name.equals("getDefaultInstanceForType")) {
                                                                    i12 = 4;
                                                                }
                                                                break;
                                                        }
                                                        switch (i12) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                                if (returnType2.getName().startsWith("com.google.protobuf.") || returnType2 == cls) {
                                                                }
                                                        }
                                                    }
                                                }
                                            }
                                            i7 = 3;
                                            if (i6 == 0) {
                                                i6 = 1;
                                            }
                                            if (i6 == 0) {
                                                i6 = 1;
                                            }
                                            if (i6 != 0) {
                                                i4 = 1;
                                                if (i6 != 0) {
                                                }
                                            }
                                            break;
                                        } else {
                                            char cCharAt2 = name.charAt(3);
                                            if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                                                if (length4 == 4) {
                                                    i19 = i;
                                                }
                                            }
                                        }
                                        i6 = i19;
                                        i7 = 3;
                                        if (i6 == 0) {
                                        }
                                        if (i6 == 0) {
                                        }
                                        if (i6 != 0) {
                                        }
                                        break;
                                    }
                                    i3 = length;
                                    i2 = i11;
                                    i4 = 1;
                                    break;
                            }
                        }
                        methodArr = methodArrM6356;
                        z3 = z5;
                        i3 = length;
                        i2 = i11;
                        i4 = 1;
                    }
                }
                z4 = zM6332;
                methodArr = methodArrM6356;
                z3 = z5;
                i3 = length;
                i2 = i11;
                i4 = 1;
            } else {
                i = i9;
                i4 = i10;
                z2 = zM6350;
                z4 = zM6332;
                methodArr = methodArrM6356;
                z3 = z5;
                i3 = length;
                i2 = i11;
            }
            i11 = i2 + 1;
            i10 = i4;
            i9 = i;
            length = i3;
            zM6350 = z2;
            zM6332 = z4;
            z5 = z3;
            methodArrM6356 = methodArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m6364(Method method, boolean z, String str) {
        int iIndexOf;
        Class<?> returnType;
        String name = method.getName();
        if (name.startsWith("is") && (((returnType = method.getReturnType()) != Boolean.class && returnType != Boolean.TYPE) || z)) {
            return name;
        }
        String strM6365 = m6365(name, str);
        if (z && (iIndexOf = strM6365.indexOf(45)) != -1) {
            strM6365 = strM6365.substring(0, iIndexOf);
        }
        if (strM6365.length() > 2 && strM6365.charAt(0) >= 'A' && strM6365.charAt(0) <= 'Z' && strM6365.charAt(1) >= 'A' && strM6365.charAt(1) <= 'Z') {
            char[] charArray = strM6365.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            Field fieldM6373 = m6373(method.getDeclaringClass(), new String(charArray));
            if (fieldM6373 != null && Modifier.isPublic(fieldM6373.getModifiers())) {
                return fieldM6373.getName();
            }
        }
        return strM6365;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static String m6365(String str, String str2) {
        char c;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        boolean zStartsWith = str.startsWith("is");
        boolean zStartsWith2 = str.startsWith("get");
        int i = 3;
        int i2 = zStartsWith ? 2 : zStartsWith2 ? 3 : 0;
        if (length == i2) {
            return str;
        }
        switch (str2) {
            case "UpperCase":
                return str.substring(i2).toUpperCase();
            case "UpperCaseWithDots":
                return m6388(i2, str, true);
            case "NeverUseThisValueExceptDefaultValue":
            case "CamelCase":
                int i3 = length - i2;
                char[] cArr = new char[i3];
                str.getChars(i2, length, cArr, 0);
                char c2 = cArr[0];
                boolean z = i3 > 1 && (c = cArr[1]) >= 'A' && c <= 'Z';
                if (c2 >= 'A' && c2 <= 'Z' && !z) {
                    cArr[0] = (char) (c2 + ' ');
                }
                return new String(cArr);
            case "LowerCaseWithUnderScores":
                return m6391(i2, str, false);
            case "UpperCamelCaseWithUnderScores":
                return m6390(str, i2, '_');
            case "UpperCaseWithDashes":
                return m6385(i2, str, true);
            case "UpperCamelCaseWithDashes":
                return m6390(str, i2, SignatureVisitor.SUPER);
            case "UpperCamelCaseWithDots":
                return m6390(str, i2, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            case "LowerCaseWithDots":
                return m6388(i2, str, false);
            case "PascalCase":
                return m6353(length, i2, str);
            case "UpperCamelCaseWithSpaces":
                return m6390(str, i2, ' ');
            case "KebabCase":
                StringBuilder sb = new StringBuilder();
                if (zStartsWith) {
                    i = 2;
                } else if (!zStartsWith2) {
                    i = 0;
                }
                for (int i4 = i; i4 < str.length(); i4++) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + ' ');
                        if (i4 > i) {
                            sb.append(SignatureVisitor.SUPER);
                        }
                    }
                    sb.append(cCharAt);
                }
                return sb.toString();
            case "LowerCase":
                return str.substring(i2).toLowerCase();
            case "LowerCaseWithDashes":
                return m6385(i2, str, false);
            case "CamelCase1x":
                char[] cArr2 = new char[length - i2];
                str.getChars(i2, length, cArr2, 0);
                char c3 = cArr2[0];
                if (c3 >= 'A' && c3 <= 'Z') {
                    cArr2[0] = (char) (c3 + ' ');
                }
                return new String(cArr2);
            case "UpperCaseWithUnderScores":
                return m6391(i2, str, true);
            case "SnakeCase":
                return m6346(i2, str);
            default:
                C1123.m1410("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m6366(Class cls, Consumer consumer) {
        ConcurrentHashMap concurrentHashMap = f9357;
        Constructor<?>[] declaredConstructors = (Constructor[]) concurrentHashMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentHashMap.putIfAbsent(cls, declaredConstructors);
        }
        boolean zM6350 = m6350(cls);
        for (Constructor<?> constructor : declaredConstructors) {
            if (!zM6350 || constructor.getParameterCount() != 0) {
                consumer.accept(constructor);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m6367(Type type) {
        m6368(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m6368(boolean z) {
        if (z) {
            return;
        }
        C6755.m11865();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Type m6369(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new BeanUtils$GenericArrayTypeImpl(m6369(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new BeanUtils$ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new BeanUtils$GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new BeanUtils$WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Method m6370(Class cls, String str) {
        ConcurrentHashMap concurrentHashMap = f9358;
        Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM6356 == null) {
            methodArrM6356 = m6356(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM6356);
        }
        for (Method method : methodArrM6356) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0 && method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m6371(Class cls, Consumer consumer) {
        ConcurrentHashMap concurrentHashMap = f9358;
        Method[] methodArrM6356 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM6356 == null) {
            methodArrM6356 = m6356(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM6356);
        }
        for (Method method : methodArrM6356) {
            if (method.getParameterCount() == 0 && method.getDeclaringClass() != Object.class) {
                String name = method.getName();
                name.getClass();
                switch (name) {
                    case "toString":
                    case "hashCode":
                    case "annotationType":
                        break;
                    default:
                        consumer.accept(method);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Constructor m6372(Class cls, boolean z) {
        Class<?> declaringClass;
        if ((cls == StackTraceElement.class && AbstractC3687.f9263 >= 9) || m6350(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f9357;
        Constructor<?>[] declaredConstructors = (Constructor[]) concurrentHashMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentHashMap.putIfAbsent(cls, declaredConstructors);
        }
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterCount() == 0) {
                return constructor;
            }
        }
        if (!z || (declaringClass = cls.getDeclaringClass()) == null) {
            return null;
        }
        for (Constructor<?> constructor2 : declaredConstructors) {
            if (constructor2.getParameterCount() == 1 && declaringClass.equals(constructor2.getParameterTypes()[0])) {
                return constructor2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Field m6373(Class cls, String str) {
        ConcurrentHashMap concurrentHashMap = f9360;
        Map map = (Map) concurrentHashMap.get(cls);
        if (map == null) {
            HashMap map2 = new HashMap();
            m6384(cls, new C3497(map2, 2));
            concurrentHashMap.putIfAbsent(cls, map2);
            map = (Map) concurrentHashMap.get(cls);
        }
        return (Field) map.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Field m6374(final Method method, Class cls) {
        boolean z;
        boolean z2;
        boolean z3;
        final String name = method.getName();
        final int length = name.length();
        Class<?> returnType = method.getReturnType();
        if (length > 2) {
            char cCharAt = name.charAt(0);
            char cCharAt2 = name.charAt(1);
            char cCharAt3 = name.charAt(2);
            if (cCharAt == 'i' && cCharAt2 == 's') {
                z = returnType == Boolean.class || returnType == Boolean.TYPE;
                z2 = false;
                z3 = z2;
            } else if (cCharAt == 'g' && cCharAt2 == 'e' && cCharAt3 == 't') {
                z2 = length > 3;
                z = false;
                z3 = false;
            } else {
                if (cCharAt == 's' && cCharAt2 == 'e' && cCharAt3 == 't') {
                    z3 = length > 3 && method.getParameterCount() == 1;
                    z = false;
                    z2 = false;
                }
                z = false;
                z2 = false;
                z3 = z2;
            }
        } else {
            z = false;
            z2 = false;
            z3 = z2;
        }
        final Field[] fieldArr = new Field[2];
        if (z || z2 || z3) {
            final Class<?> cls2 = (z || z2) ? returnType : method.getParameterTypes()[0];
            final int i = z ? 2 : 3;
            char[] cArr = new char[length - i];
            name.getChars(i, length, cArr, 0);
            final char c = cArr[0];
            m6384(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪苏世兰哲
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Field field = (Field) obj;
                    if (field.getDeclaringClass() != method.getDeclaringClass()) {
                        return;
                    }
                    String name2 = field.getName();
                    int length2 = name2.length();
                    int i2 = length;
                    int i3 = i;
                    int i4 = i2 - i3;
                    String str = name;
                    Field[] fieldArr2 = fieldArr;
                    if (length2 == i4) {
                        Class<?> type = field.getType();
                        Class<?> cls3 = cls2;
                        if (type == cls3 || cls3.isAssignableFrom(field.getType())) {
                            char c2 = c;
                            if (c2 >= 'A' && c2 <= 'Z' && c2 + ' ' == name2.charAt(0) && name2.regionMatches(1, str, i3 + 1, length2 - 1)) {
                                fieldArr2[0] = field;
                                return;
                            } else {
                                if (name2.regionMatches(0, str, i3, length2)) {
                                    fieldArr2[1] = field;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    if (Boolean.TYPE == field.getType() && str.equals(name2)) {
                        fieldArr2[0] = field;
                    }
                }
            });
        }
        Field field = fieldArr[0];
        if (field == null) {
            field = fieldArr[1];
        }
        return Throwable.class.isAssignableFrom(cls) ? (returnType == String.class && ((field == null && "getMessage".equals(name)) || (field == null && "getLocalizedMessage".equals(name)))) ? m6373(cls, "detailMessage") : (returnType == Throwable[].class && "getSuppressed".equals(name)) ? m6373(cls, "suppressedExceptions") : field : field;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Type m6375(AbstractC3740 abstractC3740, Class cls, Member member, Type type) {
        Class<?> declaringClass = member == null ? null : member.getDeclaringClass();
        while (cls != Object.class) {
            Type type2 = abstractC3740 == null ? null : abstractC3740.f9599;
            if (declaringClass == cls) {
                return m6344(type2, declaringClass, type, new HashMap());
            }
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass == null) {
                break;
            }
            abstractC3740 = AbstractC3740.m6912(m6344(type2, cls, genericSuperclass, new HashMap()));
            cls = abstractC3740.f9598;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static String[] m6376(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        String[] strArr = new String[length];
        m6387(cls, new C3678(enumArr, 3, strArr));
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr[i2] == null) {
                i++;
            }
        }
        if (i == length) {
            return null;
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e A[PHI: r8
  0x009e: PHI (r8v5 java.lang.reflect.Member) = 
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v1 java.lang.reflect.Member)
  (r8v8 java.lang.reflect.Member)
 binds: [B:12:0x002f, B:15:0x0037, B:18:0x0040, B:20:0x0044, B:23:0x0051, B:39:0x008a, B:41:0x009b, B:42:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Member m6377(Class cls, InterfaceC9245 interfaceC9245) {
        boolean z;
        ?? r16;
        Class<?> declaringClass;
        Field fieldM6373;
        ?? r2 = 0;
        r2 = 0;
        if (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            ConcurrentHashMap concurrentHashMap = f9358;
            Method[] methods = (Method[]) concurrentHashMap.get(cls);
            if (methods == null) {
                methods = cls.getMethods();
                concurrentHashMap.putIfAbsent(cls, methods);
            }
            int length = methods.length;
            final int i = 0;
            Member member = null;
            int i2 = 0;
            while (true) {
                final int i3 = 1;
                if (i2 >= length) {
                    ?? r162 = r2;
                    if (member != null) {
                        return member;
                    }
                    ConcurrentHashMap concurrentHashMap2 = f9361;
                    Field[] fields = (Field[]) concurrentHashMap2.get(cls);
                    if (fields == null) {
                        fields = cls.getFields();
                        concurrentHashMap2.putIfAbsent(cls, fields);
                    }
                    Enum[] enumArr = (Enum[]) cls.getEnumConstants();
                    for (Field field : fields) {
                        if (enumArr != null) {
                            String name = field.getName();
                            for (Enum r0 : enumArr) {
                                if (name.equals(r0.name())) {
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                        } else {
                            z = false;
                        }
                        if (m6351(field) && !z) {
                            return field;
                        }
                    }
                    return r162;
                }
                final Method method = methods[i2];
                if (method.getReturnType() != Void.class && method.getParameterCount() == 0 && (declaringClass = method.getDeclaringClass()) != Enum.class && declaringClass != Object.class) {
                    final String name2 = method.getName();
                    if ("values".equals(name2)) {
                        r16 = r2;
                    } else {
                        if (m6351(method)) {
                            return method;
                        }
                        if (!name2.startsWith("get") || (fieldM6373 = m6373(cls, m6365(name2, r2))) == null || !m6351(fieldM6373)) {
                            final AtomicReference atomicReference = new AtomicReference();
                            int length2 = interfaces.length;
                            int i4 = 0;
                            ?? r22 = r2;
                            while (i4 < length2) {
                                Class<?> cls2 = interfaces[i4];
                                ?? r163 = r22;
                                m6362(cls2, new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪苏世哲兰
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        int i5 = i;
                                        Method method2 = method;
                                        AtomicReference atomicReference2 = atomicReference;
                                        String str = name2;
                                        Method method3 = (Method) obj;
                                        switch (i5) {
                                            case 0:
                                                if (method3.getName().equals(str) && AbstractC3698.m6351(method3)) {
                                                    atomicReference2.set(method2);
                                                    break;
                                                }
                                                break;
                                            default:
                                                if (method3.getName().equals(str) && AbstractC3698.m6351(method3)) {
                                                    atomicReference2.set(method2);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                Class clsMo6186 = interfaceC9245 != null ? interfaceC9245.mo6186(cls2) : AbstractC3766.f9639.mo6186(cls2);
                                if (clsMo6186 != null) {
                                    m6362(clsMo6186, new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪苏世哲兰
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            int i5 = i3;
                                            Method method2 = method;
                                            AtomicReference atomicReference2 = atomicReference;
                                            String str = name2;
                                            Method method3 = (Method) obj;
                                            switch (i5) {
                                                case 0:
                                                    if (method3.getName().equals(str) && AbstractC3698.m6351(method3)) {
                                                        atomicReference2.set(method2);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    if (method3.getName().equals(str) && AbstractC3698.m6351(method3)) {
                                                        atomicReference2.set(method2);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                }
                                i4++;
                                r22 = r163;
                            }
                            r16 = r22;
                            Member member2 = (Member) atomicReference.get();
                            if (member2 == null) {
                                continue;
                            } else if (member == null) {
                                member = member2;
                            } else if (!member.getName().equals(member2.getName())) {
                                return r16;
                            }
                        } else if (member != null) {
                            if (!member.getName().equals(method.getName())) {
                                break;
                            }
                            if ((member instanceof Method) && ((Method) member).getReturnType().isAssignableFrom(method.getReturnType())) {
                                member = method;
                            }
                            r16 = r2;
                        } else {
                            r16 = r2;
                            member = method;
                        }
                    }
                }
                i2++;
                r2 = r16;
            }
        }
        return r2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Annotation m6378(AnnotatedElement annotatedElement, Class cls) {
        return m6382(annotatedElement, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Annotation m6379(Annotation annotation, Class cls) {
        if (annotation != null) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            return clsAnnotationType == cls ? annotation : m6382(clsAnnotationType, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
        }
        C3466.m5903("annotation must not be null");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Annotation[] m6380(AnnotatedElement annotatedElement) {
        try {
            return annotatedElement.getDeclaredAnnotations();
        } catch (Throwable unused) {
            return new Annotation[0];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Constructor[] m6381(Class cls) {
        ConcurrentHashMap concurrentHashMap = f9357;
        Constructor[] constructorArr = (Constructor[]) concurrentHashMap.get(cls);
        if (constructorArr != null) {
            return constructorArr;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        concurrentHashMap.putIfAbsent(cls, declaredConstructors);
        return declaredConstructors;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Annotation m6382(AnnotatedElement annotatedElement, Class cls, boolean z, HashSet hashSet) {
        Class superclass;
        Annotation annotationM6382;
        Annotation annotationM63822;
        if (annotatedElement == null) {
            return null;
        }
        Annotation declaredAnnotation = annotatedElement.getDeclaredAnnotation(cls);
        if (declaredAnnotation != null) {
            return declaredAnnotation;
        }
        Annotation annotationM6383 = m6383(cls, annotatedElement.getDeclaredAnnotations(), z, hashSet);
        if (annotationM6383 != null) {
            return annotationM6383;
        }
        if (annotatedElement instanceof Class) {
            Class cls2 = (Class) annotatedElement;
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (cls3 != Annotation.class && (annotationM63822 = m6382(cls3, cls, z, hashSet)) != null) {
                    return annotationM63822;
                }
            }
            if (z && (superclass = cls2.getSuperclass()) != null && superclass != Object.class && (annotationM6382 = m6382(superclass, cls, true, hashSet)) != null) {
                return annotationM6382;
            }
        }
        return m6383(cls, m6380(annotatedElement), z, hashSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Annotation m6383(Class cls, Annotation[] annotationArr, boolean z, HashSet hashSet) {
        Annotation annotationM6382;
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            String name = clsAnnotationType.getName();
            if (!name.startsWith("java.lang.annotation") && !name.startsWith("kotlin.") && hashSet.add(annotation) && (annotationM6382 = m6382(clsAnnotationType, cls, z, hashSet)) != null) {
                return annotationM6382;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m6384(Class cls, Consumer consumer) {
        boolean zEquals;
        if (cls == null || m6361(cls) || cls.getName().contains("$$Lambda") || AbstractC3693.m6332(cls)) {
            return;
        }
        if (AbstractC3700.m6497(cls)) {
            m6384(cls.getSuperclass(), consumer);
            return;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            zEquals = false;
        } else {
            zEquals = "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName());
            if (!zEquals) {
                m6384(superclass, consumer);
            }
        }
        ConcurrentHashMap concurrentHashMap = f9359;
        Field[] declaredFields = (Field[]) concurrentHashMap.get(cls);
        if (declaredFields == null) {
            try {
                declaredFields = cls.getDeclaredFields();
                concurrentHashMap.put(cls, declaredFields);
            } catch (Throwable unused) {
                declaredFields = new Field[0];
            }
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (Modifier.isStatic(declaredFields[i].getModifiers())) {
                    boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field : declaredFields) {
                        if (zIsAssignableFrom || !Modifier.isStatic(field.getModifiers())) {
                            arrayList.add(field);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                } else {
                    i++;
                }
            }
            f9361.putIfAbsent(cls, declaredFields);
        }
        for (Field field2 : declaredFields) {
            int modifiers = field2.getModifiers();
            Class<?> type = field2.getType();
            if ((modifiers & 8) == 0 && !m6361(type)) {
                if (zEquals && "cardsmap_".equals(field2.getName()) && "com.google.protobuf.飘花落叶言世楪兰哲苏子".equals(type.getName())) {
                    return;
                }
                Class<?> declaringClass = field2.getDeclaringClass();
                if (declaringClass != AbstractMap.class && declaringClass != HashMap.class && declaringClass != LinkedHashMap.class && declaringClass != TreeMap.class && declaringClass != ConcurrentHashMap.class) {
                    consumer.accept(field2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m6385(int i, String str, boolean z) {
        int i2;
        int length = str.length();
        char[] cArr = (char[]) AbstractC3700.f9386.getAndSet(AbstractC3700.f9387, null);
        if (cArr == null) {
            cArr = new char[128];
        }
        int i3 = i;
        int i4 = 0;
        while (i3 < length) {
            try {
                char cCharAt = str.charAt(i3);
                if (z) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i2 = cCharAt - ' ';
                            cCharAt = (char) i2;
                        }
                    } else if (i3 > i) {
                        cArr[i4] = SignatureVisitor.SUPER;
                        i4++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i3 > i) {
                        cArr[i4] = SignatureVisitor.SUPER;
                        i4++;
                    }
                    i2 = cCharAt + ' ';
                    cCharAt = (char) i2;
                }
                cArr[i4] = cCharAt;
                i3++;
                i4++;
            } catch (Throwable th) {
                AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i4);
        AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m6386(String str, String str2) {
        int i;
        char cCharAt;
        char cCharAt2;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        switch (str2) {
            case "UpperCase":
                return str.toUpperCase();
            case "UpperCaseWithDots":
                return m6388(0, str, true);
            case "NeverUseThisValueExceptDefaultValue":
            case "NoChange":
            case "CamelCase":
                char cCharAt3 = str.charAt(0);
                char cCharAt4 = str.length() > 1 ? str.charAt(1) : (char) 0;
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z' && str.length() > 1 && (cCharAt4 < 'A' || cCharAt4 > 'Z')) {
                    char[] charArray = str.toCharArray();
                    charArray[0] = (char) (cCharAt3 + ' ');
                    return new String(charArray);
                }
                return str;
            case "LowerCaseWithUnderScores":
                return m6391(0, str, false);
            case "UpperCamelCaseWithUnderScores":
                return m6390(str, 0, '_');
            case "UpperCaseWithDashes":
                return m6385(0, str, true);
            case "UpperCamelCaseWithDashes":
                return m6390(str, 0, SignatureVisitor.SUPER);
            case "UpperCamelCaseWithDots":
                return m6390(str, 0, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            case "LowerCaseWithDots":
                return m6388(0, str, false);
            case "PascalCase":
                char cCharAt5 = str.charAt(0);
                if (cCharAt5 >= 'a' && cCharAt5 <= 'z' && str.length() > 1 && (cCharAt2 = str.charAt(1)) >= 'a' && cCharAt2 <= 'z') {
                    char[] charArray2 = str.toCharArray();
                    charArray2[0] = (char) (cCharAt5 - ' ');
                    return new String(charArray2);
                }
                if (cCharAt5 == '_' && str.length() > 1 && (cCharAt = str.charAt(1)) >= 'a' && cCharAt <= 'z') {
                    char[] charArray3 = str.toCharArray();
                    charArray3[1] = (char) (cCharAt - ' ');
                    return new String(charArray3);
                }
                return str;
            case "UpperCamelCaseWithSpaces":
                return m6390(str, 0, ' ');
            case "KebabCase":
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < str.length(); i++) {
                    char cCharAt6 = str.charAt(i);
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z') {
                        cCharAt6 = (char) (cCharAt6 + ' ');
                        if (i > 0) {
                            sb.append(SignatureVisitor.SUPER);
                        }
                    }
                    sb.append(cCharAt6);
                }
                return sb.toString();
            case "LowerCase":
                return str.toLowerCase();
            case "LowerCaseWithDashes":
                return m6385(0, str, false);
            case "CamelCase1x":
                char cCharAt7 = str.charAt(0);
                if (cCharAt7 >= 'A' && cCharAt7 <= 'Z' && str.length() > 1) {
                    char[] charArray4 = str.toCharArray();
                    charArray4[0] = (char) (cCharAt7 + ' ');
                    return new String(charArray4);
                }
                return str;
            case "UpperCaseWithUnderScores":
                return m6391(0, str, true);
            case "SnakeCase":
                return m6346(0, str);
            default:
                C1123.m1410("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m6387(Class cls, C3678 c3678) {
        if (AbstractC3700.m6497(cls)) {
            m6387(cls.getSuperclass(), c3678);
            return;
        }
        ConcurrentHashMap concurrentHashMap = f9361;
        Field[] fields = (Field[]) concurrentHashMap.get(cls);
        if (fields == null) {
            fields = cls.getFields();
            concurrentHashMap.putIfAbsent(cls, fields);
        }
        boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
        for (Field field : fields) {
            if ((!Modifier.isStatic(field.getModifiers()) || zIsAssignableFrom) && !m6361(field.getType())) {
                c3678.accept(field);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m6388(int i, String str, boolean z) {
        int i2;
        int length = str.length();
        char[] cArr = (char[]) AbstractC3700.f9386.getAndSet(AbstractC3700.f9387, null);
        if (cArr == null) {
            cArr = new char[128];
        }
        int i3 = i;
        int i4 = 0;
        while (i3 < length) {
            try {
                char cCharAt = str.charAt(i3);
                if (z) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i2 = cCharAt - ' ';
                            cCharAt = (char) i2;
                        }
                    } else if (i3 > i) {
                        cArr[i4] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                        i4++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i3 > i) {
                        cArr[i4] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                        i4++;
                    }
                    i2 = cCharAt + ' ';
                    cCharAt = (char) i2;
                }
                cArr[i4] = cCharAt;
                i3++;
                i4++;
            } catch (Throwable th) {
                AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i4);
        AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m6389(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m6389(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static String m6390(String str, int i, char c) {
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int i4;
        char cCharAt3;
        int i5;
        char cCharAt4;
        int i6;
        char cCharAt5;
        int length = str.length();
        char[] cArr = (char[]) AbstractC3700.f9386.getAndSet(AbstractC3700.f9387, null);
        if (cArr == null) {
            cArr = new char[128];
        }
        int i7 = i;
        int i8 = 0;
        while (i7 < length) {
            try {
                char cCharAt6 = str.charAt(i7);
                if (i7 == i) {
                    if (cCharAt6 >= 'a' && cCharAt6 <= 'z' && (i6 = i7 + 1) < length && (cCharAt5 = str.charAt(i6)) >= 'a' && cCharAt5 <= 'z') {
                        cCharAt6 = (char) (cCharAt6 - ' ');
                    } else if (cCharAt6 == '_' && (i5 = i7 + 1) < length && (cCharAt4 = str.charAt(i5)) >= 'a' && cCharAt4 <= 'z') {
                        cArr[i8] = cCharAt6;
                        cCharAt6 = (char) (cCharAt4 - ' ');
                        i8++;
                        i7 = i5;
                    }
                } else if (cCharAt6 < 'A' || cCharAt6 > 'Z' || (i4 = i7 + 1) >= length || ((cCharAt3 = str.charAt(i4)) >= 'A' && cCharAt3 <= 'Z')) {
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z' && i7 > i && (i2 = i7 + 1) < length && (cCharAt = str.charAt(i2)) >= 'A' && cCharAt <= 'Z' && (cCharAt2 = str.charAt(i7 - 1)) >= 'a' && cCharAt2 <= 'z') {
                        i3 = i8 + 1;
                        cArr[i8] = c;
                        i8 = i3;
                    }
                } else if (i7 > i) {
                    i3 = i8 + 1;
                    cArr[i8] = c;
                    i8 = i3;
                }
                cArr[i8] = cCharAt6;
                i7++;
                i8++;
            } catch (Throwable th) {
                AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i8);
        AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static String m6391(int i, String str, boolean z) {
        int i2;
        int length = str.length();
        char[] cArr = (char[]) AbstractC3700.f9386.getAndSet(AbstractC3700.f9387, null);
        if (cArr == null) {
            cArr = new char[128];
        }
        int i3 = i;
        int i4 = 0;
        while (i3 < length) {
            try {
                char cCharAt = str.charAt(i3);
                if (z) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i2 = cCharAt - ' ';
                            cCharAt = (char) i2;
                        }
                    } else if (i3 > i) {
                        cArr[i4] = '_';
                        i4++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i3 > i) {
                        cArr[i4] = '_';
                        i4++;
                    }
                    i2 = cCharAt + ' ';
                    cCharAt = (char) i2;
                }
                cArr[i4] = cCharAt;
                i3++;
                i4++;
            } catch (Throwable th) {
                AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i4);
        AbstractC3700.f9386.set(AbstractC3700.f9387, cArr);
        return str2;
    }
}
