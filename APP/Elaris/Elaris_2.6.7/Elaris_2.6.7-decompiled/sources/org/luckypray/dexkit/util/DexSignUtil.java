package org.luckypray.dexkit.util;

import com.p001mr.elaris.Prefs;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC0002a1;
import p000.AbstractC0486u9;
import p000.C0455sa;
import p000.C0479u2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexSignUtil {
    public static final DexSignUtil INSTANCE = new DexSignUtil();
    private static final Map<String, String> primitiveMap;
    private static final Map<String, String> primitiveTypeNameMap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0455sa[] c0455saArr = {new C0455sa("boolean", "Z"), new C0455sa("byte", "B"), new C0455sa("char", "C"), new C0455sa("short", "S"), new C0455sa("int", "I"), new C0455sa("float", "F"), new C0455sa("long", "J"), new C0455sa(Prefs.REPEATER_MODE_DOUBLE, "D"), new C0455sa("void", "V")};
        int iM1068u = AbstractC0486u9.m1068u(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM1068u);
        for (int i = 0; i < 9; i++) {
            C0455sa c0455sa = c0455saArr[i];
            linkedHashMap.put(c0455sa.f859a, c0455sa.f860b);
        }
        primitiveMap = linkedHashMap;
        C0455sa[] c0455saArr2 = {new C0455sa("Z", "boolean"), new C0455sa("B", "byte"), new C0455sa("C", "char"), new C0455sa("S", "short"), new C0455sa("I", "int"), new C0455sa("F", "float"), new C0455sa("J", "long"), new C0455sa("D", Prefs.REPEATER_MODE_DOUBLE), new C0455sa("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM1068u);
        for (int i2 = 0; i2 < 9; i2++) {
            C0455sa c0455sa2 = c0455saArr2[i2];
            linkedHashMap2.put(c0455sa2.f859a, c0455sa2.f860b);
        }
        primitiveTypeNameMap = linkedHashMap2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DexSignUtil() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getClassDescriptor(Class<?> cls) {
        cls.getClass();
        return getDescriptor(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getConstructorSign(Constructor<?> constructor) {
        constructor.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC0002a1.m5i2(parameterTypes, DexSignUtil$getConstructorSign$1$1.INSTANCE));
        sb.append(")V");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getDescriptor(Field field) {
        field.getClass();
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = field.getDeclaringClass();
        declaringClass.getClass();
        sb.append(getTypeSign(declaringClass));
        sb.append("->");
        sb.append(field.getName());
        sb.append(":");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(getTypeSign(type));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getFieldDescriptor(Field field) {
        field.getClass();
        return getDescriptor(field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getMethodDescriptor(Method method) {
        method.getClass();
        return getDescriptor(method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getMethodSign(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC0002a1.m5i2(parameterTypes, DexSignUtil$getMethodSign$1$1.INSTANCE));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(getTypeSign(returnType));
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List<String> getParamTypeNames(String str) {
        int i;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int iIndexOf = 0;
        loop0: while (true) {
            i = iIndexOf;
            while (iIndexOf < str.length()) {
                char cCharAt = str.charAt(iIndexOf);
                if (cCharAt == '[') {
                    iIndexOf++;
                } else {
                    if (cCharAt == 'L') {
                        iIndexOf = str.indexOf(59, iIndexOf);
                    }
                    iIndexOf++;
                    arrayList.add(getTypeName(str.substring(i, iIndexOf)));
                }
            }
            break loop0;
        }
        if (i == iIndexOf) {
            return arrayList;
        }
        C0479u2.m1037b("Unknown signString: ".concat(str));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getTypeName(Class<?> cls) {
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return getTypeName(componentType) + "[]";
        }
        if (!cls.isPrimitive()) {
            return cls.getName();
        }
        if (cls.equals(Boolean.TYPE)) {
            return "boolean";
        }
        if (cls.equals(Byte.TYPE)) {
            return "byte";
        }
        if (cls.equals(Character.TYPE)) {
            return "char";
        }
        if (cls.equals(Short.TYPE)) {
            return "short";
        }
        if (cls.equals(Integer.TYPE)) {
            return "int";
        }
        if (cls.equals(Float.TYPE)) {
            return "float";
        }
        if (cls.equals(Long.TYPE)) {
            return "long";
        }
        if (cls.equals(Double.TYPE)) {
            return Prefs.REPEATER_MODE_DOUBLE;
        }
        if (cls.equals(Void.TYPE)) {
            return "void";
        }
        throw new IllegalStateException("Unknown primitive type: " + cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String getTypeSign(Class<?> cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return "[" + getTypeSign(componentType);
            }
            String strReplace = cls.getName().replace('.', '/');
            strReplace.getClass();
            return "L" + strReplace + ";";
        }
        if (cls.equals(Boolean.TYPE)) {
            return "Z";
        }
        if (cls.equals(Byte.TYPE)) {
            return "B";
        }
        if (cls.equals(Character.TYPE)) {
            return "C";
        }
        if (cls.equals(Short.TYPE)) {
            return "S";
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (cls.equals(Float.TYPE)) {
            return "F";
        }
        if (cls.equals(Long.TYPE)) {
            return "J";
        }
        if (cls.equals(Double.TYPE)) {
            return "D";
        }
        if (cls.equals(Void.TYPE)) {
            return "V";
        }
        throw new IllegalStateException("Unknown primitive type: " + cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final String primitiveTypeName(String str) {
        String str2 = primitiveTypeNameMap.get(str);
        if (str2 != null) {
            return str2;
        }
        C0479u2.m1036a(str, "Unknown primitive typeSign: ");
        return null;
    }

    public static final String getMethodDescriptor(Constructor<?> constructor) {
        constructor.getClass();
        return getDescriptor(constructor);
    }

    public static final String getDescriptor(Method method) {
        method.getClass();
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        sb.append(getTypeSign(declaringClass));
        sb.append("->");
        sb.append(method.getName());
        sb.append(getMethodSign(method));
        return sb.toString();
    }

    public static final String getDescriptor(Constructor<?> constructor) {
        constructor.getClass();
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        sb.append(getTypeSign(declaringClass));
        sb.append("-><init>");
        sb.append(getConstructorSign(constructor));
        return sb.toString();
    }

    public static final String getDescriptor(Class<?> cls) {
        cls.getClass();
        return getTypeSign(cls);
    }

    public static final String getTypeName(String str) {
        str.getClass();
        if (str.charAt(0) == '[') {
            return getTypeName(str.substring(1)) + "[]";
        }
        if (str.length() == 1) {
            return primitiveTypeName(str);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            String strReplace = str.substring(1, str.length() - 1).replace('/', '.');
            strReplace.getClass();
            return strReplace;
        }
        C0479u2.m1037b("Unknown class sign: ".concat(str));
        return null;
    }

    public static final String getTypeSign(String str) {
        str.getClass();
        if (str.endsWith("[]")) {
            return "[" + getTypeSign(str.substring(0, str.length() - 2));
        }
        String str2 = primitiveMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String strReplace = str.replace('.', '/');
        strReplace.getClass();
        return "L" + strReplace + ";";
    }
}
