package p271y4;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import p011B4.AbstractC0231b;
import p056K2.C0882h;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1983k;

/* JADX INFO: renamed from: y4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3501c {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f10908a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f10909b;

    static {
        C0882h[] c0882hArr = {new C0882h("boolean", "Z"), new C0882h("byte", "B"), new C0882h("char", "C"), new C0882h("short", "S"), new C0882h("int", "I"), new C0882h("float", "F"), new C0882h("long", "J"), new C0882h("double", "D"), new C0882h("void", "V")};
        int iM2034F = AbstractC0984x.m2034F(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM2034F);
        AbstractC0984x.m2037I(linkedHashMap, c0882hArr);
        f10908a = linkedHashMap;
        C0882h[] c0882hArr2 = {new C0882h("Z", "boolean"), new C0882h("B", "byte"), new C0882h("C", "char"), new C0882h("S", "short"), new C0882h("I", "int"), new C0882h("F", "float"), new C0882h("J", "long"), new C0882h("D", "double"), new C0882h("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM2034F);
        AbstractC0984x.m2037I(linkedHashMap2, c0882hArr2);
        f10909b = linkedHashMap2;
    }

    /* JADX INFO: renamed from: a */
    public static final String m5753a(Method method) {
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC1665j.m2984d(parameterTypes, "method.parameterTypes");
        sb.append(AbstractC0972l.m2005c0(parameterTypes, "", C3500b.f10907e, 30));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        AbstractC1665j.m2984d(returnType, "method.returnType");
        sb.append(m5756d(returnType));
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static final String m5754b(Class cls) {
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            AbstractC1665j.m2982b(componentType);
            return m5754b(componentType) + "[]";
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
        throw new IllegalStateException("Unknown primitive type: " + cls);
    }

    /* JADX INFO: renamed from: c */
    public static final String m5755c(String str) {
        AbstractC1665j.m2985e(str, "typeSign");
        if (str.charAt(0) == '[') {
            String strSubstring = str.substring(1);
            AbstractC1665j.m2984d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return m5755c(strSubstring) + "[]";
        }
        if (str.length() == 1) {
            String str2 = (String) f10909b.get(str);
            if (str2 != null) {
                return str2;
            }
            throw new IllegalArgumentException("Unknown primitive typeSign: ".concat(str));
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            throw new IllegalStateException("Unknown class sign: ".concat(str));
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        AbstractC1665j.m2984d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return AbstractC1983k.m3653P(strSubstring2, '/', '.');
    }

    /* JADX INFO: renamed from: d */
    public static final String m5756d(Class cls) {
        AbstractC1665j.m2985e(cls, "type");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                return AbstractC0231b.m400k("L", AbstractC1983k.m3653P(cls.getName(), '.', '/'), ";");
            }
            Class<?> componentType = cls.getComponentType();
            AbstractC1665j.m2982b(componentType);
            return "[" + m5756d(componentType);
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

    /* JADX INFO: renamed from: e */
    public static final String m5757e(String str) {
        AbstractC1665j.m2985e(str, "typeName");
        if (!str.endsWith("[]")) {
            String str2 = (String) f10908a.get(str);
            return str2 == null ? AbstractC0231b.m400k("L", AbstractC1983k.m3653P(str, '.', '/'), ";") : str2;
        }
        String strSubstring = str.substring(0, str.length() - 2);
        AbstractC1665j.m2984d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return "[" + m5757e(strSubstring);
    }
}
