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
    public static final DexSignUtil INSTANCE = null;
    private static final Map<String, String> primitiveMap = null;
    private static final Map<String, String> primitiveTypeNameMap = null;

    static {
        INSTANCE = new DexSignUtil();
        C0139e[] r1 = {new C0139e("boolean", "Z"), new C0139e("byte", "B"), new C0139e("char", "C"), new C0139e("short", "S"), new C0139e("int", "I"), new C0139e("float", "F"), new C0139e("long", "J"), new C0139e("double", "D"), new C0139e("void", "V")};
        LinkedHashMap r2 = new LinkedHashMap(AbstractC0193x.m563g0(9));
        AbstractC0193x.m565i0(r2, r1);
        primitiveMap = r2;
        C0139e[] r02 = {new C0139e("Z", "boolean"), new C0139e("B", "byte"), new C0139e("C", "char"), new C0139e("S", "short"), new C0139e("I", "int"), new C0139e("F", "float"), new C0139e("J", "long"), new C0139e("D", "double"), new C0139e("V", "void")};
        LinkedHashMap r12 = new LinkedHashMap(AbstractC0193x.m563g0(9));
        AbstractC0193x.m565i0(r12, r02);
        primitiveTypeNameMap = r12;
    }

    private DexSignUtil() {
    }

    public static final String getClassDescriptor(Class<?> r1) {
        AbstractC0307g.m703e(r1, "clazz");
        return getDescriptor(r1);
    }

    public static final String getConstructorSign(Constructor<?> r2) {
        AbstractC0307g.m703e(r2, "constructor");
        StringBuilder r02 = new StringBuilder("(");
        Class<?>[] r22 = r2.getParameterTypes();
        AbstractC0307g.m702d(r22, "constructor.parameterTypes");
        r02.append(AbstractC0179j.m538o0(r22, DexSignUtil$getConstructorSign$1$1.INSTANCE));
        r02.append(")V");
        String r23 = r02.toString();
        AbstractC0307g.m702d(r23, "StringBuilder().apply(builderAction).toString()");
        return r23;
    }

    public static final String getDescriptor(Class<?> r1) {
        AbstractC0307g.m703e(r1, "clazz");
        return getTypeSign(r1);
    }

    public static final String getFieldDescriptor(Field r1) {
        AbstractC0307g.m703e(r1, "field");
        return getDescriptor(r1);
    }

    public static final String getMethodDescriptor(Method r1) {
        AbstractC0307g.m703e(r1, "method");
        return getDescriptor(r1);
    }

    public static final String getMethodSign(Method r3) {
        AbstractC0307g.m703e(r3, "method");
        StringBuilder r02 = new StringBuilder("(");
        Class<?>[] r1 = r3.getParameterTypes();
        AbstractC0307g.m702d(r1, "method.parameterTypes");
        r02.append(AbstractC0179j.m538o0(r1, DexSignUtil$getMethodSign$1$1.INSTANCE));
        r02.append(")");
        Class<?> r32 = r3.getReturnType();
        AbstractC0307g.m702d(r32, "method.returnType");
        r02.append(getTypeSign(r32));
        String r33 = r02.toString();
        AbstractC0307g.m702d(r33, "StringBuilder().apply(builderAction).toString()");
        return r33;
    }

    public static final List<String> getParamTypeNames(String r6) {
        AbstractC0307g.m703e(r6, "paramSigns");
        ArrayList r02 = new ArrayList();
        int r2 = 0;
    L3:
        int r3 = r2;
    L5:
        if (r2 >= r6.length()) goto L13;
        char r4 = r6.charAt(r2);
        if (r4 != '[') goto L10;
        r2 = r2 + 1;
        goto L5
    L10:
        if (r4 != 'L') goto L12;
        r2 = AbstractC0425j.m1010O0(r6, ';', r2, false, 4);
    L12:
        r2 = r2 + 1;
        String r32 = r6.substring(r3, r2);
        AbstractC0307g.m702d(r32, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        r02.add(getTypeName(r32));
        goto L3
    L13:
        if (r3 != r2) goto L16;
        return r02;
    L16:
        throw new IllegalStateException("Unknown signString: ".concat(r6));
    }

    public static final String getTypeName(String r4) {
        AbstractC0307g.m703e(r4, "typeSign");
        if (r4.charAt(0) != '[') goto L7;
        String r42 = r4.substring(1);
        AbstractC0307g.m702d(r42, "(this as java.lang.String).substring(startIndex)");
        return AbstractC0324d.m722e(getTypeName(r42), "[]");
    L7:
        if (r4.length() != 1) goto L11;
        return primitiveTypeName(r4);
    L11:
        if (r4.charAt(0) != 'L') goto L17;
        if (r4.charAt(r4.length() - 1) != ';') goto L17;
        String r43 = r4.substring(1, r4.length() - 1);
        AbstractC0307g.m702d(r43, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return AbstractC0433r.m1032G0(r43, '/', '.');
    L17:
        throw new IllegalStateException("Unknown class sign: ".concat(r4));
    }

    public static final String getTypeSign(Class<?> r3) {
        AbstractC0307g.m703e(r3, "type");
        if (r3.isPrimitive() == false) goto L35;
        if (r3.equals(Boolean.TYPE) == false) goto L8;
        return "Z";
    L8:
        if (r3.equals(Byte.TYPE) == false) goto L11;
        return "B";
    L11:
        if (r3.equals(Character.TYPE) == false) goto L14;
        return "C";
    L14:
        if (r3.equals(Short.TYPE) == false) goto L17;
        return "S";
    L17:
        if (r3.equals(Integer.TYPE) == false) goto L20;
        return "I";
    L20:
        if (r3.equals(Float.TYPE) == false) goto L23;
        return "F";
    L23:
        if (r3.equals(Long.TYPE) == false) goto L26;
        return "J";
    L26:
        if (r3.equals(Double.TYPE) == false) goto L29;
        return "D";
    L29:
        if (r3.equals(Void.TYPE) == false) goto L33;
        return "V";
    L33:
        throw new IllegalStateException("Unknown primitive type: " + r3);
    L35:
        if (r3.isArray() == false) goto L38;
        Class<?> r32 = r3.getComponentType();
        AbstractC0307g.m700b(r32);
        return AbstractC0324d.m725h("[", getTypeSign(r32));
    L38:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r3.getName(), '.', '/'), ";");
    }

    private static final String primitiveTypeName(String r2) {
        String r02 = primitiveTypeNameMap.get(r2);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new IllegalArgumentException(AbstractC0324d.m725h("Unknown primitive typeSign: ", r2));
    }

    public static final String getDescriptor(Method r3) {
        AbstractC0307g.m703e(r3, "method");
        StringBuilder r02 = new StringBuilder();
        Class<?> r1 = r3.getDeclaringClass();
        AbstractC0307g.m702d(r1, "method.declaringClass");
        r02.append(getTypeSign(r1));
        r02.append("->");
        r02.append(r3.getName());
        r02.append(getMethodSign(r3));
        String r32 = r02.toString();
        AbstractC0307g.m702d(r32, "StringBuilder().apply(builderAction).toString()");
        return r32;
    }

    public static final String getMethodDescriptor(Constructor<?> r1) {
        AbstractC0307g.m703e(r1, "constructor");
        return getDescriptor(r1);
    }

    public static final String getDescriptor(Constructor<?> r3) {
        AbstractC0307g.m703e(r3, "constructor");
        StringBuilder r02 = new StringBuilder();
        Class<?> r1 = r3.getDeclaringClass();
        AbstractC0307g.m702d(r1, "constructor.declaringClass");
        r02.append(getTypeSign(r1));
        r02.append("-><init>");
        r02.append(getConstructorSign(r3));
        String r32 = r02.toString();
        AbstractC0307g.m702d(r32, "StringBuilder().apply(builderAction).toString()");
        return r32;
    }

    public static final String getDescriptor(Field r3) {
        AbstractC0307g.m703e(r3, "field");
        StringBuilder r02 = new StringBuilder();
        Class<?> r1 = r3.getDeclaringClass();
        AbstractC0307g.m702d(r1, "field.declaringClass");
        r02.append(getTypeSign(r1));
        r02.append("->");
        r02.append(r3.getName());
        r02.append(":");
        Class<?> r32 = r3.getType();
        AbstractC0307g.m702d(r32, "field.type");
        r02.append(getTypeSign(r32));
        String r33 = r02.toString();
        AbstractC0307g.m702d(r33, "StringBuilder().apply(builderAction).toString()");
        return r33;
    }

    public static final String getTypeName(Class<?> r3) {
        AbstractC0307g.m703e(r3, "clazz");
        if (r3.isArray() == false) goto L7;
        Class<?> r32 = r3.getComponentType();
        AbstractC0307g.m700b(r32);
        return AbstractC0324d.m722e(getTypeName(r32), "[]");
    L7:
        if (r3.isPrimitive() == false) goto L39;
        if (r3.equals(Boolean.TYPE) == false) goto L12;
        return "boolean";
    L12:
        if (r3.equals(Byte.TYPE) == false) goto L15;
        return "byte";
    L15:
        if (r3.equals(Character.TYPE) == false) goto L18;
        return "char";
    L18:
        if (r3.equals(Short.TYPE) == false) goto L21;
        return "short";
    L21:
        if (r3.equals(Integer.TYPE) == false) goto L24;
        return "int";
    L24:
        if (r3.equals(Float.TYPE) == false) goto L27;
        return "float";
    L27:
        if (r3.equals(Long.TYPE) == false) goto L30;
        return "long";
    L30:
        if (r3.equals(Double.TYPE) == false) goto L33;
        return "double";
    L33:
        if (r3.equals(Void.TYPE) == false) goto L37;
        return "void";
    L37:
        throw new IllegalStateException("Unknown primitive type: " + r3);
    L39:
        return r3.getName();
    }

    public static final String getTypeSign(String r2) {
        AbstractC0307g.m703e(r2, "typeName");
        if (AbstractC0433r.m1028C0(r2, "[]") == false) goto L6;
        String r22 = r2.substring(0, r2.length() - 2);
        AbstractC0307g.m702d(r22, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return AbstractC0324d.m725h("[", getTypeSign(r22));
    L6:
        String r02 = primitiveMap.get(r2);
        if (r02 == null) goto L9;
        return r02;
    L9:
        return AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(r2, '.', '/'), ";");
    }
}
