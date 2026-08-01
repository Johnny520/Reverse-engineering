package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import bsh.C2633;
import bsh.C2645;
import bsh.C2664;
import com.alibaba.fastjson2.AbstractC2907;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.reader.C2780;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
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
import java.util.function.Consumer;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p278.C8363;
import p278.C8365;
import p291.InterfaceC8523;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2865 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static volatile Method f9018;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static volatile Class f9019;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static volatile Method f9020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Type[] f9017 = new Type[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f9016 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f9015 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f9014 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ConcurrentHashMap f9013 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f9012 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long[] f9021 = {-9214723784238596577L, -9030616758866828325L, -8335274122997354104L, -6963030519018899258L, -4863137578837233966L, -3653547262287832698L, -2819277587813726773L, -2669552864532011468L, -2458634727370886912L, -2291619803571459675L, -1811306045128064037L, -864440709753525476L, -779604756358333743L, 8731803887940231L, 1616814008855344660L, 2164749833121980361L, 2688642392827789427L, 3724195282986200606L, 3742915795806478647L, 3977020351318456359L, 4775491097662790952L, 4882459834864833642L, 6033839080488254886L, 7981148566008458638L, 8344106065386396833L, 9215465129261900012L};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static void m5782(Class cls, Consumer consumer) {
        ConcurrentHashMap concurrentHashMap = f9013;
        Method[] methodArrM5796 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM5796 == null) {
            methodArrM5796 = m5796(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM5796);
        }
        for (Method method : methodArrM5796) {
            if (Modifier.isStatic(method.getModifiers())) {
                consumer.accept(method);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static String m5783(Type type) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type m5784(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5784(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static Method[] m5785(Class cls) {
        if (AbstractC2854.f8918 < 14 && AbstractC2854.f8933 < 33) {
            return new Method[0];
        }
        try {
            if (f9018 == null) {
                f9018 = Class.class.getMethod("getRecordComponents", null);
            }
            if (f9020 == null) {
                f9020 = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) f9018.invoke(cls, null);
            Method[] methodArr = new Method[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                methodArr[i] = cls.getMethod((String) f9020.invoke(objArr[i], null), null);
            }
            return methodArr;
        } catch (Exception e) {
            C0276.m848(AbstractC6183.m11581("Failed to access Methods needed to support `java.lang.Record`: (", e.getClass().getName(), ") ", e.getMessage()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static String m5786(int i, String str) {
        int length = str.length();
        char[] cArr = (char[]) AbstractC2867.f9041.getAndSet(AbstractC2867.f9042, null);
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
                AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i3);
        AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static String m5787(String str, String str2) {
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
                return m5828(i2, str, true);
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
                return m5831(i2, str, false);
            case "UpperCamelCaseWithUnderScores":
                return m5830(str, i2, '_');
            case "UpperCaseWithDashes":
                return m5825(i2, str, true);
            case "UpperCamelCaseWithDashes":
                return m5830(str, i2, SignatureVisitor.SUPER);
            case "UpperCamelCaseWithDots":
                return m5830(str, i2, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            case "LowerCaseWithDots":
                return m5828(i2, str, false);
            case "PascalCase":
                return m5793(length, i2, str);
            case "UpperCamelCaseWithSpaces":
                return m5830(str, i2, ' ');
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
                return m5825(i2, str, false);
            case "CamelCase1x":
                char[] cArr3 = new char[length - i2];
                str.getChars(i2, length, cArr3, 0);
                char c5 = cArr3[0];
                if (c5 >= 'A' && c5 <= 'Z') {
                    cArr3[0] = (char) (c5 + ' ');
                }
                return new String(cArr3);
            case "UpperCaseWithUnderScores":
                return m5831(i2, str, true);
            case "SnakeCase":
                return m5786(i2, str);
            default:
                C0276.m850("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m5788(C8363 c8363, Annotation annotation) {
        String[] strArr = new String[3];
        m5811(annotation.getClass(), new C2845(annotation, 0, strArr));
        if (strArr[0].length() != 0) {
            c8363.f23048 = strArr[0];
        }
        if ("STRING".equals(strArr[1]) && c8363.f23048 == null) {
            c8363.f23048 = "string";
        } else if ("NUMBER".equals(strArr[1])) {
            c8363.f23048 = "millis";
        }
        if (strArr[2].isEmpty() || "##default".equals(strArr[2])) {
            return;
        }
        c8363.f23056 = Locale.forLanguageTag(strArr[2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m5789(C8363 c8363, Annotation annotation) {
        c8363.f23044 = true;
        m5811(annotation.getClass(), new C2780(annotation, c8363, 6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static boolean m5790(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        if (f9019 != null) {
            return superclass == f9019;
        }
        if (!"com.android.tools.r8.RecordTag".equals(superclass.getName())) {
            return false;
        }
        f9019 = superclass;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m5791(java.lang.reflect.AccessibleObject r5) {
        /*
            java.lang.annotation.Annotation[] r5 = r5.getAnnotations()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L4d
            r3 = r5[r2]
            java.lang.Class r3 = r3.annotationType()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonValue"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L44
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonProperty"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L44
            java.lang.String r4 = "com.alibaba.fastjson.annotation.JSONField"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L48
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonRawValue"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L44
            java.lang.String r4 = "飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲兰苏"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L48
            java.lang.String r4 = "com.fasterxml.jackson.annotation.JsonUnwrapped"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L44
            goto L4a
        L44:
            boolean r3 = com.alibaba.fastjson2.AbstractC2933.f9288
            if (r3 == 0) goto L4a
        L48:
            r5 = 1
            return r5
        L4a:
            int r2 = r2 + 1
            goto L7
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5791(java.lang.reflect.AccessibleObject):boolean");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m5792(C8365 c8365, Annotation annotation, Method method) {
        try {
            Object objInvoke = method.invoke(annotation, null);
            String name = method.getName();
            switch (name.hashCode()) {
                case -1678076717:
                    if (name.equals("deserializer")) {
                        Class cls = (Class) objInvoke;
                        if (InterfaceC2788.class.isAssignableFrom(cls)) {
                            c8365.f23098 = cls;
                            return;
                        }
                        return;
                    }
                    return;
                case -1315832283:
                    if (name.equals("serializeEnumAsJavaBean") && ((Boolean) objInvoke).booleanValue()) {
                        c8365.f23103 = true;
                        return;
                    }
                    return;
                case -1210506547:
                    if (!name.equals("alphabetic") || ((Boolean) objInvoke).booleanValue()) {
                        return;
                    }
                    c8365.f23084 = false;
                    return;
                case -1052827512:
                    if (name.equals("naming")) {
                        c8365.f23104 = ((Enum) objInvoke).name();
                        return;
                    }
                    return;
                case -1008770331:
                    if (name.equals("orders")) {
                        String[] strArr = (String[]) objInvoke;
                        if (strArr.length != 0) {
                            c8365.f23102 = strArr;
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
                        c8365.f23092 = str;
                        return;
                    }
                    return;
                case -676507419:
                    if (name.equals("typeName")) {
                        String str2 = (String) objInvoke;
                        if (str2.isEmpty()) {
                            return;
                        }
                        c8365.f23091 = str2;
                        return;
                    }
                    return;
                case -597985902:
                    if (name.equals("serializer")) {
                        Class cls2 = (Class) objInvoke;
                        if (InterfaceC8523.class.isAssignableFrom(cls2)) {
                            c8365.f23103 = true;
                            c8365.f23097 = cls2;
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
                        c8365.f23082 = str3;
                        return;
                    }
                    return;
                case 90259659:
                    if (name.equals("includes")) {
                        String[] strArr2 = (String[]) objInvoke;
                        if (strArr2.length != 0) {
                            c8365.f23094 = strArr2;
                            return;
                        }
                        return;
                    }
                    return;
                case 1752415457:
                    if (name.equals("ignores")) {
                        String[] strArr3 = (String[]) objInvoke;
                        if (strArr3.length != 0) {
                            if (c8365.f23101 == null) {
                                c8365.f23101 = strArr3;
                                return;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            linkedHashSet.addAll(Arrays.asList(c8365.f23101));
                            linkedHashSet.addAll(Arrays.asList(strArr3));
                            c8365.f23101 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
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
                            c8365.f23087 = clsArr;
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
                            c8365.f23099 |= JSONWriter$Feature.WriteNullNumberAsZero.mask;
                        }
                        break;
                    case -1779797023:
                        if (strName.equals("IgnoreErrorGetter")) {
                            c8365.f23099 |= JSONWriter$Feature.IgnoreErrorGetter.mask;
                        }
                        break;
                    case -335314544:
                        if (strName.equals("WriteEnumUsingToString")) {
                            c8365.f23099 |= JSONWriter$Feature.WriteEnumUsingToString.mask;
                        }
                        break;
                    case -211922948:
                        if (strName.equals("BrowserCompatible")) {
                            c8365.f23099 |= JSONWriter$Feature.BrowserCompatible.mask;
                        }
                        break;
                    case -102443356:
                        if (strName.equals("WriteNullStringAsEmpty")) {
                            c8365.f23099 |= JSONWriter$Feature.WriteNullStringAsEmpty.mask;
                        }
                        break;
                    case -62964779:
                        if (strName.equals("NotWriteRootClassName")) {
                            c8365.f23099 |= JSONWriter$Feature.NotWriteRootClassName.mask;
                        }
                        break;
                    case 1009181687:
                        if (strName.equals("WriteNullListAsEmpty")) {
                            c8365.f23099 |= JSONWriter$Feature.WriteNullListAsEmpty.mask;
                        }
                        break;
                    case 1519175029:
                        if (strName.equals("WriteNonStringValueAsString")) {
                            c8365.f23099 |= JSONWriter$Feature.WriteNonStringValueAsString.mask;
                        }
                        break;
                    case 1808123471:
                        if (strName.equals("WriteNullBooleanAsFalse")) {
                            c8365.f23099 |= JSONWriter$Feature.WriteNullBooleanAsFalse.mask;
                        }
                        break;
                    case 1879776036:
                        if (strName.equals("WriteClassName")) {
                            c8365.f23099 |= JSONWriter$Feature.WriteClassName.mask;
                        }
                        break;
                    case 2049970061:
                        if (strName.equals("WriteMapNullValue")) {
                            c8365.f23099 |= JSONWriter$Feature.WriteNulls.mask;
                        }
                        break;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static String m5793(int i, int i2, String str) {
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
    public static String[] m5794(Class cls) {
        if (AbstractC2854.f8918 < 14 && AbstractC2854.f8933 < 33) {
            return new String[0];
        }
        try {
            if (f9018 == null) {
                f9018 = Class.class.getMethod("getRecordComponents", null);
            }
            if (f9020 == null) {
                f9020 = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) f9018.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) f9020.invoke(objArr[i], null);
            }
            return strArr;
        } catch (Exception e) {
            C0276.m848(AbstractC6183.m11581("Failed to access Methods needed to support `java.lang.Record`: (", e.getClass().getName(), ") ", e.getMessage()), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static Class m5795(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            m5808(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m5795(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m5795(((WildcardType) type).getUpperBounds()[0]);
        }
        C5554.m10874("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Method[] m5796(Class cls) {
        try {
            return m5790(cls) ? m5785(cls) : cls.getMethods();
        } catch (NoClassDefFoundError unused) {
            return new Method[0];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static Method m5797(Method method, Class cls) {
        if (cls == null || cls == Object.class || cls == Serializable.class) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f9013;
        Method[] methodArrM5796 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM5796 == null) {
            methodArrM5796 = m5796(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM5796);
        }
        for (Method method2 : methodArrM5796) {
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
    public static Method m5798(Class cls, String str) {
        ConcurrentHashMap concurrentHashMap = f9013;
        Method[] methodArrM5796 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM5796 == null) {
            methodArrM5796 = m5796(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM5796);
        }
        for (Method method : methodArrM5796) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Type m5799(Class cls, Class cls2, Type type) {
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
                    return m5799(interfaces[i], cls2, cls.getGenericInterfaces()[i]);
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
                    return m5799(superclass, cls2, cls.getGenericSuperclass());
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static boolean m5800(Class cls) {
        Class superclass;
        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == TreeMap.class || cls.getSimpleName().isEmpty() || !(((superclass = cls.getSuperclass()) == HashMap.class || superclass == LinkedHashMap.class || superclass == TreeMap.class) && m5812(cls, false) == null)) {
            return false;
        }
        m5824(cls, new C2645(superclass, new ArrayList()));
        return !r0.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m5801(Class cls) {
        if (cls == null) {
            return true;
        }
        return Arrays.binarySearch(f9021, AbstractC2860.m5774(cls.getName())) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m5802(Class cls, Consumer consumer) {
        m5803(cls, null, false, consumer);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5803(java.lang.Class r32, java.lang.Class r33, boolean r34, java.util.function.Consumer r35) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5803(java.lang.Class, java.lang.Class, boolean, java.util.function.Consumer):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m5804(Method method, boolean z, String str) {
        int iIndexOf;
        Class<?> returnType;
        String name = method.getName();
        if (name.startsWith("is") && (((returnType = method.getReturnType()) != Boolean.class && returnType != Boolean.TYPE) || z)) {
            return name;
        }
        String strM5805 = m5805(name, str);
        if (z && (iIndexOf = strM5805.indexOf(45)) != -1) {
            strM5805 = strM5805.substring(0, iIndexOf);
        }
        if (strM5805.length() > 2 && strM5805.charAt(0) >= 'A' && strM5805.charAt(0) <= 'Z' && strM5805.charAt(1) >= 'A' && strM5805.charAt(1) <= 'Z') {
            char[] charArray = strM5805.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            Field fieldM5813 = m5813(method.getDeclaringClass(), new String(charArray));
            if (fieldM5813 != null && Modifier.isPublic(fieldM5813.getModifiers())) {
                return fieldM5813.getName();
            }
        }
        return strM5805;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static String m5805(String str, String str2) {
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
                return m5828(i2, str, true);
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
                return m5831(i2, str, false);
            case "UpperCamelCaseWithUnderScores":
                return m5830(str, i2, '_');
            case "UpperCaseWithDashes":
                return m5825(i2, str, true);
            case "UpperCamelCaseWithDashes":
                return m5830(str, i2, SignatureVisitor.SUPER);
            case "UpperCamelCaseWithDots":
                return m5830(str, i2, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            case "LowerCaseWithDots":
                return m5828(i2, str, false);
            case "PascalCase":
                return m5793(length, i2, str);
            case "UpperCamelCaseWithSpaces":
                return m5830(str, i2, ' ');
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
                return m5825(i2, str, false);
            case "CamelCase1x":
                char[] cArr2 = new char[length - i2];
                str.getChars(i2, length, cArr2, 0);
                char c3 = cArr2[0];
                if (c3 >= 'A' && c3 <= 'Z') {
                    cArr2[0] = (char) (c3 + ' ');
                }
                return new String(cArr2);
            case "UpperCaseWithUnderScores":
                return m5831(i2, str, true);
            case "SnakeCase":
                return m5786(i2, str);
            default:
                C0276.m850("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m5806(Class cls, Consumer consumer) {
        ConcurrentHashMap concurrentHashMap = f9012;
        Constructor<?>[] declaredConstructors = (Constructor[]) concurrentHashMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentHashMap.putIfAbsent(cls, declaredConstructors);
        }
        boolean zM5790 = m5790(cls);
        for (Constructor<?> constructor : declaredConstructors) {
            if (!zM5790 || constructor.getParameterCount() != 0) {
                consumer.accept(constructor);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m5807(Type type) {
        m5808(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m5808(boolean z) {
        if (z) {
            return;
        }
        C5925.m11306();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Type m5809(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new BeanUtils$GenericArrayTypeImpl(m5809(cls.getComponentType())) : cls;
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
    public static Method m5810(Class cls, String str) {
        ConcurrentHashMap concurrentHashMap = f9013;
        Method[] methodArrM5796 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM5796 == null) {
            methodArrM5796 = m5796(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM5796);
        }
        for (Method method : methodArrM5796) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0 && method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m5811(Class cls, Consumer consumer) {
        ConcurrentHashMap concurrentHashMap = f9013;
        Method[] methodArrM5796 = (Method[]) concurrentHashMap.get(cls);
        if (methodArrM5796 == null) {
            methodArrM5796 = m5796(cls);
            concurrentHashMap.putIfAbsent(cls, methodArrM5796);
        }
        for (Method method : methodArrM5796) {
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
    public static Constructor m5812(Class cls, boolean z) {
        Class<?> declaringClass;
        if ((cls == StackTraceElement.class && AbstractC2854.f8918 >= 9) || m5790(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f9012;
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
    public static Field m5813(Class cls, String str) {
        ConcurrentHashMap concurrentHashMap = f9015;
        Map map = (Map) concurrentHashMap.get(cls);
        if (map == null) {
            HashMap map2 = new HashMap();
            m5824(cls, new C2664(map2, 2));
            concurrentHashMap.putIfAbsent(cls, map2);
            map = (Map) concurrentHashMap.get(cls);
        }
        return (Field) map.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Field m5814(final Method method, Class cls) {
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
            m5824(cls, new Consumer() { // from class: com.alibaba.fastjson2.util.飘花落叶言子楪苏世兰哲
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
        return Throwable.class.isAssignableFrom(cls) ? (returnType == String.class && ((field == null && "getMessage".equals(name)) || (field == null && "getLocalizedMessage".equals(name)))) ? m5813(cls, "detailMessage") : (returnType == Throwable[].class && "getSuppressed".equals(name)) ? m5813(cls, "suppressedExceptions") : field : field;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Type m5815(AbstractC2907 abstractC2907, Class cls, Member member, Type type) {
        Class<?> declaringClass = member == null ? null : member.getDeclaringClass();
        while (cls != Object.class) {
            Type type2 = abstractC2907 == null ? null : abstractC2907.f9254;
            if (declaringClass == cls) {
                return m5784(type2, declaringClass, type, new HashMap());
            }
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass == null) {
                break;
            }
            abstractC2907 = AbstractC2907.m6352(m5784(type2, cls, genericSuperclass, new HashMap()));
            cls = abstractC2907.f9253;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static String[] m5816(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        String[] strArr = new String[length];
        m5827(cls, new C2845(enumArr, 3, strArr));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Member m5817(java.lang.Class r17, p290.InterfaceC8416 r18) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5817(java.lang.Class, 飘花落叶言楪子哲世苏兰.飘花落叶言子楪世苏哲兰):java.lang.reflect.Member");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Annotation m5818(AnnotatedElement annotatedElement, Class cls) {
        return m5822(annotatedElement, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Annotation m5819(Annotation annotation, Class cls) {
        if (annotation != null) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            return clsAnnotationType == cls ? annotation : m5822(clsAnnotationType, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
        }
        C2633.m5343("annotation must not be null");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Annotation[] m5820(AnnotatedElement annotatedElement) {
        try {
            return annotatedElement.getDeclaredAnnotations();
        } catch (Throwable unused) {
            return new Annotation[0];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Constructor[] m5821(Class cls) {
        ConcurrentHashMap concurrentHashMap = f9012;
        Constructor[] constructorArr = (Constructor[]) concurrentHashMap.get(cls);
        if (constructorArr != null) {
            return constructorArr;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        concurrentHashMap.putIfAbsent(cls, declaredConstructors);
        return declaredConstructors;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Annotation m5822(AnnotatedElement annotatedElement, Class cls, boolean z, HashSet hashSet) {
        Class superclass;
        Annotation annotationM5822;
        Annotation annotationM58222;
        if (annotatedElement == null) {
            return null;
        }
        Annotation declaredAnnotation = annotatedElement.getDeclaredAnnotation(cls);
        if (declaredAnnotation != null) {
            return declaredAnnotation;
        }
        Annotation annotationM5823 = m5823(cls, annotatedElement.getDeclaredAnnotations(), z, hashSet);
        if (annotationM5823 != null) {
            return annotationM5823;
        }
        if (annotatedElement instanceof Class) {
            Class cls2 = (Class) annotatedElement;
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (cls3 != Annotation.class && (annotationM58222 = m5822(cls3, cls, z, hashSet)) != null) {
                    return annotationM58222;
                }
            }
            if (z && (superclass = cls2.getSuperclass()) != null && superclass != Object.class && (annotationM5822 = m5822(superclass, cls, true, hashSet)) != null) {
                return annotationM5822;
            }
        }
        return m5823(cls, m5820(annotatedElement), z, hashSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Annotation m5823(Class cls, Annotation[] annotationArr, boolean z, HashSet hashSet) {
        Annotation annotationM5822;
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            String name = clsAnnotationType.getName();
            if (!name.startsWith("java.lang.annotation") && !name.startsWith("kotlin.") && hashSet.add(annotation) && (annotationM5822 = m5822(clsAnnotationType, cls, z, hashSet)) != null) {
                return annotationM5822;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m5824(Class cls, Consumer consumer) {
        boolean zEquals;
        if (cls == null || m5801(cls) || cls.getName().contains("$$Lambda") || AbstractC2860.m5772(cls)) {
            return;
        }
        if (AbstractC2867.m5937(cls)) {
            m5824(cls.getSuperclass(), consumer);
            return;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            zEquals = false;
        } else {
            zEquals = "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName());
            if (!zEquals) {
                m5824(superclass, consumer);
            }
        }
        ConcurrentHashMap concurrentHashMap = f9014;
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
            f9016.putIfAbsent(cls, declaredFields);
        }
        for (Field field2 : declaredFields) {
            int modifiers = field2.getModifiers();
            Class<?> type = field2.getType();
            if ((modifiers & 8) == 0 && !m5801(type)) {
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
    public static String m5825(int i, String str, boolean z) {
        int i2;
        int length = str.length();
        char[] cArr = (char[]) AbstractC2867.f9041.getAndSet(AbstractC2867.f9042, null);
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
                AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i4);
        AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m5826(String str, String str2) {
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
                return m5828(0, str, true);
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
                return m5831(0, str, false);
            case "UpperCamelCaseWithUnderScores":
                return m5830(str, 0, '_');
            case "UpperCaseWithDashes":
                return m5825(0, str, true);
            case "UpperCamelCaseWithDashes":
                return m5830(str, 0, SignatureVisitor.SUPER);
            case "UpperCamelCaseWithDots":
                return m5830(str, 0, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            case "LowerCaseWithDots":
                return m5828(0, str, false);
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
                return m5830(str, 0, ' ');
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
                return m5825(0, str, false);
            case "CamelCase1x":
                char cCharAt7 = str.charAt(0);
                if (cCharAt7 >= 'A' && cCharAt7 <= 'Z' && str.length() > 1) {
                    char[] charArray4 = str.toCharArray();
                    charArray4[0] = (char) (cCharAt7 + ' ');
                    return new String(charArray4);
                }
                return str;
            case "UpperCaseWithUnderScores":
                return m5831(0, str, true);
            case "SnakeCase":
                return m5786(0, str);
            default:
                C0276.m850("TODO : ".concat(str2));
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m5827(Class cls, C2845 c2845) {
        if (AbstractC2867.m5937(cls)) {
            m5827(cls.getSuperclass(), c2845);
            return;
        }
        ConcurrentHashMap concurrentHashMap = f9016;
        Field[] fields = (Field[]) concurrentHashMap.get(cls);
        if (fields == null) {
            fields = cls.getFields();
            concurrentHashMap.putIfAbsent(cls, fields);
        }
        boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
        for (Field field : fields) {
            if ((!Modifier.isStatic(field.getModifiers()) || zIsAssignableFrom) && !m5801(field.getType())) {
                c2845.accept(field);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static String m5828(int i, String str, boolean z) {
        int i2;
        int length = str.length();
        char[] cArr = (char[]) AbstractC2867.f9041.getAndSet(AbstractC2867.f9042, null);
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
                AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i4);
        AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m5829(Type type, Type type2) {
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
                return m5829(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
    public static String m5830(String str, int i, char c) {
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
        char[] cArr = (char[]) AbstractC2867.f9041.getAndSet(AbstractC2867.f9042, null);
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
                AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i8);
        AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
        return str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static String m5831(int i, String str, boolean z) {
        int i2;
        int length = str.length();
        char[] cArr = (char[]) AbstractC2867.f9041.getAndSet(AbstractC2867.f9042, null);
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
                AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
                throw th;
            }
        }
        String str2 = new String(cArr, 0, i4);
        AbstractC2867.f9041.set(AbstractC2867.f9042, cArr);
        return str2;
    }
}
