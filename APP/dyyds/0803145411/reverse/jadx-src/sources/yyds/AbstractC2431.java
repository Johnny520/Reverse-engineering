package yyds;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲇᛳᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2431 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f11989;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final LinkedHashMap f11990;

    static {
        Pair[] pairArr = {new Pair("boolean", "Z"), new Pair("byte", "B"), new Pair("char", "C"), new Pair("short", "S"), new Pair("int", "I"), new Pair("float", "F"), new Pair("long", "J"), new Pair("double", "D"), new Pair("void", "V")};
        int iM4382 = AbstractC2366.m4382(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM4382);
        AbstractC2366.m4384(linkedHashMap, pairArr);
        f11989 = linkedHashMap;
        Pair[] pairArr2 = {new Pair("Z", "boolean"), new Pair("B", "byte"), new Pair("C", "char"), new Pair("S", "short"), new Pair("I", "int"), new Pair("F", "float"), new Pair("J", "long"), new Pair("D", "double"), new Pair("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM4382);
        AbstractC2366.m4384(linkedHashMap2, pairArr2);
        f11990 = linkedHashMap2;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final String m4473(Method method) {
        return "(" + AbstractC2070.m3945(method.getParameterTypes(), new C2460(18)) + ")" + m4475(method.getReturnType());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final String m4474(String str) {
        if (str.charAt(0) == '[') {
            return m4474(str.substring(1)).concat("[]");
        }
        if (str.length() == 1) {
            String str2 = (String) f11990.get(str);
            if (str2 != null) {
                return str2;
            }
            C0188.m798("Unknown primitive typeSign: ".concat(str));
            return null;
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            return str.substring(1, str.length() - 1).replace('/', '.');
        }
        C0188.m800("Unknown class sign: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final String m4475(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return "[".concat(m4475(cls.getComponentType()));
            }
            return "L" + cls.getName().replace('.', '/') + ';';
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
        C0188.m799(cls, "Unknown primitive type: ");
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final String m4476(String str) {
        if (AbstractC0692.m1600(str, "[]", false)) {
            return "[".concat(m4476(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f11989.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + str.replace('.', '/') + ';';
    }
}
