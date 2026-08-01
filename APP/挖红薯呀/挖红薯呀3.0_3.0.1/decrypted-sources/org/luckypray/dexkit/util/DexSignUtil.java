package org.luckypray.dexkit.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC0201f9;
import p000.C0921xc;
import p000.k41;
import p000.md0;
import p000.r41;
import p000.uo0;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexSignUtil {
    public static final DexSignUtil INSTANCE = new DexSignUtil();
    private static final Map<String, String> primitiveMap;
    private static final Map<String, String> primitiveTypeNameMap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        uo0[] uo0VarArr = {new uo0("boolean", "Z"), new uo0("byte", "B"), new uo0("char", "C"), new uo0("short", "S"), new uo0("int", "I"), new uo0("float", "F"), new uo0("long", "J"), new uo0("double", "D"), new uo0("void", "V")};
        int iM2495x = md0.m2495x(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM2495x);
        md0.m2496y(linkedHashMap, uo0VarArr);
        primitiveMap = linkedHashMap;
        uo0[] uo0VarArr2 = {new uo0("Z", "boolean"), new uo0("B", "byte"), new uo0("C", "char"), new uo0("S", "short"), new uo0("I", "int"), new uo0("F", "float"), new uo0("J", "long"), new uo0("D", "double"), new uo0("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM2495x);
        md0.m2496y(linkedHashMap2, uo0VarArr2);
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
        sb.append(AbstractC0201f9.m1067m0(parameterTypes, DexSignUtil$getConstructorSign$1$1.INSTANCE, 30));
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
        sb.append(AbstractC0201f9.m1067m0(parameterTypes, DexSignUtil$getMethodSign$1$1.INSTANCE, 30));
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
        int iM1767Y = 0;
        loop0: while (true) {
            i = iM1767Y;
            while (iM1767Y < str.length()) {
                char cCharAt = str.charAt(iM1767Y);
                if (cCharAt == '[') {
                    iM1767Y++;
                } else {
                    if (cCharAt == 'L') {
                        iM1767Y = k41.m1767Y(str, ';', iM1767Y, 4);
                    }
                    iM1767Y++;
                    arrayList.add(getTypeName(str.substring(i, iM1767Y)));
                }
            }
            break loop0;
        }
        if (i == iM1767Y) {
            return arrayList;
        }
        C0921xc.m5134o("Unknown signString: ".concat(str));
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
            return "double";
        }
        if (cls.equals(Void.TYPE)) {
            return "void";
        }
        C0921xc.m5124e(cls, "Unknown primitive type: ");
        return null;
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
        C0921xc.m5124e(cls, "Unknown primitive type: ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final String primitiveTypeName(String str) {
        String str2 = primitiveTypeNameMap.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException("Unknown primitive typeSign: " + str);
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
        C0921xc.m5134o("Unknown class sign: ".concat(str));
        return null;
    }

    public static final String getTypeSign(String str) {
        str.getClass();
        if (r41.m3380Q(str, "[]", false)) {
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
