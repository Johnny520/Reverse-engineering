package org.luckypray.dexkit.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p007D0.C0139e;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0193x;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: loaded from: classes.dex */
public final class DexSignUtil {
    public static final DexSignUtil INSTANCE = new DexSignUtil();
    private static final Map<String, String> primitiveMap;
    private static final Map<String, String> primitiveTypeNameMap;

    static {
        C0139e[] c0139eArr = {new C0139e("boolean", "Z"), new C0139e("byte", "B"), new C0139e("char", "C"), new C0139e("short", "S"), new C0139e("int", "I"), new C0139e("float", "F"), new C0139e("long", "J"), new C0139e("double", "D"), new C0139e("void", "V")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0193x.m563g0(9));
        AbstractC0193x.m565i0(linkedHashMap, c0139eArr);
        primitiveMap = linkedHashMap;
        C0139e[] c0139eArr2 = {new C0139e("Z", "boolean"), new C0139e("B", "byte"), new C0139e("C", "char"), new C0139e("S", "short"), new C0139e("I", "int"), new C0139e("F", "float"), new C0139e("J", "long"), new C0139e("D", "double"), new C0139e("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC0193x.m563g0(9));
        AbstractC0193x.m565i0(linkedHashMap2, c0139eArr2);
        primitiveTypeNameMap = linkedHashMap2;
    }

    private DexSignUtil() {
    }

    public static final String getClassDescriptor(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        return getDescriptor(cls);
    }

    public static final String getConstructorSign(Constructor<?> constructor) {
        AbstractC0307g.m703e(constructor, "constructor");
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        AbstractC0307g.m702d(parameterTypes, "constructor.parameterTypes");
        sb.append(AbstractC0179j.m538o0(parameterTypes, DexSignUtil$getConstructorSign$1$1.INSTANCE));
        sb.append(")V");
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getDescriptor(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        return getTypeSign(cls);
    }

    public static final String getFieldDescriptor(Field field) {
        AbstractC0307g.m703e(field, "field");
        return getDescriptor(field);
    }

    public static final String getMethodDescriptor(Method method) {
        AbstractC0307g.m703e(method, "method");
        return getDescriptor(method);
    }

    public static final String getMethodSign(Method method) {
        AbstractC0307g.m703e(method, "method");
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0307g.m702d(parameterTypes, "method.parameterTypes");
        sb.append(AbstractC0179j.m538o0(parameterTypes, DexSignUtil$getMethodSign$1$1.INSTANCE));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        AbstractC0307g.m702d(returnType, "method.returnType");
        sb.append(getTypeSign(returnType));
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final List<String> getParamTypeNames(String str) {
        int i2;
        AbstractC0307g.m703e(str, "paramSigns");
        ArrayList arrayList = new ArrayList();
        int iM1010O0 = 0;
        loop0: while (true) {
            i2 = iM1010O0;
            while (iM1010O0 < str.length()) {
                char cCharAt = str.charAt(iM1010O0);
                if (cCharAt == '[') {
                    iM1010O0++;
                } else {
                    if (cCharAt == 'L') {
                        iM1010O0 = AbstractC0425j.m1010O0(str, ';', iM1010O0, false, 4);
                    }
                    iM1010O0++;
                    String strSubstring = str.substring(i2, iM1010O0);
                    AbstractC0307g.m702d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(getTypeName(strSubstring));
                }
            }
            break loop0;
        }
        if (i2 == iM1010O0) {
            return arrayList;
        }
        throw new IllegalStateException("Unknown signString: ".concat(str));
    }

    public static final String getTypeName(String str) {
        AbstractC0307g.m703e(str, "typeSign");
        if (str.charAt(0) == '[') {
            String strSubstring = str.substring(1);
            AbstractC0307g.m702d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return AbstractC0324d.m722e(getTypeName(strSubstring), "[]");
        }
        if (str.length() == 1) {
            return primitiveTypeName(str);
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            throw new IllegalStateException("Unknown class sign: ".concat(str));
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        AbstractC0307g.m702d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return AbstractC0433r.m1032G0(strSubstring2, '/', '.');
    }

    public static final String getTypeSign(Class<?> cls) {
        AbstractC0307g.m703e(cls, "type");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
            }
            Class<?> componentType = cls.getComponentType();
            AbstractC0307g.m700b(componentType);
            return AbstractC0324d.m725h("[", getTypeSign(componentType));
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

    private static final String primitiveTypeName(String str) {
        String str2 = primitiveTypeNameMap.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException(AbstractC0324d.m725h("Unknown primitive typeSign: ", str));
    }

    public static final String getDescriptor(Method method) {
        AbstractC0307g.m703e(method, "method");
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = method.getDeclaringClass();
        AbstractC0307g.m702d(declaringClass, "method.declaringClass");
        sb.append(getTypeSign(declaringClass));
        sb.append("->");
        sb.append(method.getName());
        sb.append(getMethodSign(method));
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getMethodDescriptor(Constructor<?> constructor) {
        AbstractC0307g.m703e(constructor, "constructor");
        return getDescriptor(constructor);
    }

    public static final String getDescriptor(Constructor<?> constructor) {
        AbstractC0307g.m703e(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = constructor.getDeclaringClass();
        AbstractC0307g.m702d(declaringClass, "constructor.declaringClass");
        sb.append(getTypeSign(declaringClass));
        sb.append("-><init>");
        sb.append(getConstructorSign(constructor));
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getDescriptor(Field field) {
        AbstractC0307g.m703e(field, "field");
        StringBuilder sb = new StringBuilder();
        Class<?> declaringClass = field.getDeclaringClass();
        AbstractC0307g.m702d(declaringClass, "field.declaringClass");
        sb.append(getTypeSign(declaringClass));
        sb.append("->");
        sb.append(field.getName());
        sb.append(":");
        Class<?> type = field.getType();
        AbstractC0307g.m702d(type, "field.type");
        sb.append(getTypeSign(type));
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getTypeName(Class<?> cls) {
        AbstractC0307g.m703e(cls, "clazz");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            AbstractC0307g.m700b(componentType);
            return AbstractC0324d.m722e(getTypeName(componentType), "[]");
        }
        if (cls.isPrimitive()) {
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
            throw new IllegalStateException("Unknown primitive type: " + cls);
        }
        return cls.getName();
    }

    public static final String getTypeSign(String str) {
        AbstractC0307g.m703e(str, "typeName");
        if (AbstractC0433r.m1028C0(str, "[]")) {
            String strSubstring = str.substring(0, str.length() - 2);
            AbstractC0307g.m702d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return AbstractC0324d.m725h("[", getTypeSign(strSubstring));
        }
        String str2 = primitiveMap.get(str);
        return str2 == null ? AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(str, '.', '/'), ";") : str2;
    }
}
