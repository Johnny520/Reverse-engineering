package p000;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i80 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f4485a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f4486b;

    static {
        ow1[] ow1VarArr = {new ow1("boolean", "Z"), new ow1("byte", "B"), new ow1("char", "C"), new ow1("short", "S"), new ow1("int", "I"), new ow1("float", "F"), new ow1("long", "J"), new ow1("double", "D"), new ow1("void", "V")};
        int iM6103U = xe1.m6103U(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U);
        we1.m5878s0(linkedHashMap, ow1VarArr);
        f4485a = linkedHashMap;
        ow1[] ow1VarArr2 = {new ow1("Z", "boolean"), new ow1("B", "byte"), new ow1("C", "char"), new ow1("S", "short"), new ow1("I", "int"), new ow1("F", "float"), new ow1("J", "long"), new ow1("D", "double"), new ow1("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM6103U);
        we1.m5878s0(linkedHashMap2, ow1VarArr2);
        f4486b = linkedHashMap2;
    }

    /* JADX INFO: renamed from: a */
    public static final String m2298a(Method method) {
        StringBuilder sb = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC0460mg.m3101p0(parameterTypes, "", C0799v6.f11753F, 30));
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(m2301d(returnType));
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m2299b(Class cls) {
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return hk1.m2209h(m2299b(componentType), "[]");
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
        c80.m669m("Unknown primitive type: ", cls);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final String m2300c(String str) {
        str.getClass();
        if (str.charAt(0) == '[') {
            return m2300c(str.substring(1)).concat("[]");
        }
        if (str.length() == 1) {
            String str2 = (String) f4486b.get(str);
            if (str2 != null) {
                return str2;
            }
            C0676s.m4651j("Unknown primitive typeSign: ".concat(str));
            return null;
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            C0676s.m4653l("Unknown class sign: ".concat(str));
            return null;
        }
        String strReplace = str.substring(1, str.length() - 1).replace('/', '.');
        strReplace.getClass();
        return strReplace;
    }

    /* JADX INFO: renamed from: d */
    public static final String m2301d(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return "[".concat(m2301d(componentType));
            }
            String strReplace = cls.getName().replace('.', '/');
            strReplace.getClass();
            return vi0.m5691j("L", strReplace, ";");
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
        c80.m669m("Unknown primitive type: ", cls);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final String m2302e(String str) {
        str.getClass();
        if (wv2.m6005W(str, "[]", false)) {
            return "[".concat(m2302e(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f4485a.get(str);
        if (str2 != null) {
            return str2;
        }
        String strReplace = str.replace('.', '/');
        strReplace.getClass();
        return "L" + strReplace + ";";
    }
}
