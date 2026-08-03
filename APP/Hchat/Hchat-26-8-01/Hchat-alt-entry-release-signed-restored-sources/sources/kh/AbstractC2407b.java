package kh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import tf.AbstractC4165l;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: kh.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2407b {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f7881a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f7882b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C3958e[] c3958eArr = {new C3958e("boolean", "Z"), new C3958e("byte", "B"), new C3958e("char", "C"), new C3958e("short", "S"), new C3958e("int", "I"), new C3958e("float", "F"), new C3958e("long", "J"), new C3958e("double", "D"), new C3958e("void", "V")};
        int iM8438a0 = AbstractC4178y.m8438a0(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
        AbstractC4178y.m8441d0(linkedHashMap, c3958eArr);
        f7881a = linkedHashMap;
        C3958e[] c3958eArr2 = {new C3958e("Z", "boolean"), new C3958e("B", "byte"), new C3958e("C", "char"), new C3958e("S", "short"), new C3958e("I", "int"), new C3958e("F", "float"), new C3958e("J", "long"), new C3958e("D", "double"), new C3958e("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a0);
        AbstractC4178y.m8441d0(linkedHashMap2, c3958eArr2);
        f7882b = linkedHashMap2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m5743a(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        return AbstractC0921a.m2255r(sb2, AbstractC4165l.m8369F0(parameterTypes, C2406a.f7878h, 30), ")V");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final String m5744b(Method method) {
        StringBuilder sb2 = new StringBuilder();
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        sb2.append(m5748f(declaringClass));
        sb2.append("->");
        sb2.append(method.getName());
        sb2.append(m5745c(method));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final String m5745c(Method method) {
        StringBuilder sb2 = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb2.append(AbstractC4165l.m8369F0(parameterTypes, C2406a.f7879i, 30));
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb2.append(m5748f(returnType));
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final String m5746d(Class cls) {
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return AbstractC0255e.m1020i(m5746d(componentType), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
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
        C2104o.m5276A(AbstractC3199a.m6838k(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final String m5747e(String str) {
        str.getClass();
        if (str.charAt(0) == '[') {
            return m5747e(str.substring(1)).concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        if (str.length() == 1) {
            String str2 = (String) f7882b.get(str);
            if (str2 != null) {
                return str2;
            }
            C2104o.m5294t("Unknown primitive typeSign: ".concat(str));
            return null;
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            C2104o.m5276A("Unknown class sign: ".concat(str));
            return null;
        }
        String strReplace = str.substring(1, str.length() - 1).replace('/', '.');
        strReplace.getClass();
        return strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final String m5748f(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return "[".concat(m5748f(componentType));
            }
            String strReplace = cls.getName().replace('.', '/');
            strReplace.getClass();
            return AbstractC0921a.m2251n("L", strReplace, ";");
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
        C2104o.m5276A(AbstractC3199a.m6838k(cls, "Unknown primitive type: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final String m5749g(String str) {
        str.getClass();
        if (AbstractC3156t.m6733W(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false)) {
            return "[".concat(m5749g(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f7881a.get(str);
        if (str2 != null) {
            return str2;
        }
        String strReplace = str.replace('.', '/');
        strReplace.getClass();
        return "L" + strReplace + ";";
    }
}
