package p000;

import java.util.LinkedHashMap;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: renamed from: Fd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235Fd {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f751a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f752b;

    static {
        C0208Et[] c0208EtArr = {new C0208Et("boolean", "Z"), new C0208Et("byte", "B"), new C0208Et("char", "C"), new C0208Et("short", "S"), new C0208Et("int", "I"), new C0208Et("float", "F"), new C0208Et("long", "J"), new C0208Et("double", "D"), new C0208Et("void", "V")};
        int iM5109K = AbstractC2598uq.m5109K(9);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM5109K);
        for (int i = 0; i < 9; i++) {
            C0208Et c0208Et = c0208EtArr[i];
            linkedHashMap.put(c0208Et.f613a, c0208Et.f614b);
        }
        f751a = linkedHashMap;
        C0208Et[] c0208EtArr2 = {new C0208Et("Z", "boolean"), new C0208Et("B", "byte"), new C0208Et("C", "char"), new C0208Et("S", "short"), new C0208Et("I", "int"), new C0208Et("F", "float"), new C0208Et("J", "long"), new C0208Et("D", "double"), new C0208Et("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM5109K);
        for (int i2 = 0; i2 < 9; i2++) {
            C0208Et c0208Et2 = c0208EtArr2[i2];
            linkedHashMap2.put(c0208Et2.f613a, c0208Et2.f614b);
        }
        f752b = linkedHashMap2;
    }

    /* JADX INFO: renamed from: a */
    public static final String m478a(Class cls) {
        if (cls.isArray()) {
            return AbstractC0213Ey.m407e(m478a(cls.getComponentType()), ClassUtils.ARRAY_SUFFIX);
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

    /* JADX INFO: renamed from: b */
    public static final String m479b(String str) {
        if (str.charAt(0) == '[') {
            return AbstractC0213Ey.m407e(m479b(str.substring(1)), ClassUtils.ARRAY_SUFFIX);
        }
        if (str.length() == 1) {
            String str2 = (String) f752b.get(str);
            if (str2 != null) {
                return str2;
            }
            throw new IllegalArgumentException("Unknown primitive typeSign: ".concat(str));
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            return str.substring(1, str.length() - 1).replace('/', '.');
        }
        throw new IllegalStateException("Unknown class sign: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public static final String m480c(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? AbstractC0213Ey.m420r("[", m480c(cls.getComponentType())) : AbstractC2374ph.m4814k("L", cls.getName().replace('.', '/'), ";");
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

    /* JADX INFO: renamed from: d */
    public static final String m481d(String str) {
        if (AbstractC0085Bz.m132J(str, false, ClassUtils.ARRAY_SUFFIX)) {
            return AbstractC0213Ey.m420r("[", m481d(str.substring(0, str.length() - 2)));
        }
        String str2 = (String) f751a.get(str);
        return str2 == null ? AbstractC2374ph.m4814k("L", str.replace('.', '/'), ";") : str2;
    }
}
