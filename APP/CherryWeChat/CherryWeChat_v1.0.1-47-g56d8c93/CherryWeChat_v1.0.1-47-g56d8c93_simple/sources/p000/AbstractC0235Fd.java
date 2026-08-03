package p000;

import java.util.LinkedHashMap;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: renamed from: Fd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235Fd {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f751a = null;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f752b = null;

    static {
        C0208Et[] r0 = {new C0208Et("boolean", "Z"), new C0208Et("byte", "B"), new C0208Et("char", "C"), new C0208Et("short", "S"), new C0208Et("int", "I"), new C0208Et("float", "F"), new C0208Et("long", "J"), new C0208Et("double", "D"), new C0208Et("void", "V")};
        int r3 = AbstractC2598uq.m5109K(9);
        LinkedHashMap r1 = new LinkedHashMap(r3);
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r5 >= 9) goto L5;
        C0208Et r6 = r0[r5];
        r1.put(r6.f613a, r6.f614b);
        r5 = r5 + 1;
        goto L3
    L5:
        f751a = r1;
        C0208Et[] r02 = {new C0208Et("Z", "boolean"), new C0208Et("B", "byte"), new C0208Et("C", "char"), new C0208Et("S", "short"), new C0208Et("I", "int"), new C0208Et("F", "float"), new C0208Et("J", "long"), new C0208Et("D", "double"), new C0208Et("V", "void")};
        LinkedHashMap r12 = new LinkedHashMap(r3);
    L6:
        if (r4 >= 9) goto L8;
        C0208Et r32 = r02[r4];
        r12.put(r32.f613a, r32.f614b);
        r4 = r4 + 1;
        goto L6
    L8:
        f752b = r12;
    }

    /* JADX INFO: renamed from: a */
    public static final String m478a(Class r3) {
        if (r3.isArray() == false) goto L7;
        return AbstractC0213Ey.m407e(m478a(r3.getComponentType()), ClassUtils.ARRAY_SUFFIX);
    L7:
        if (r3.isPrimitive() == false) goto L47;
        if (r3.equals(Boolean.TYPE) == false) goto L13;
        return "boolean";
    L13:
        if (r3.equals(Byte.TYPE) == false) goto L17;
        return "byte";
    L17:
        if (r3.equals(Character.TYPE) == false) goto L21;
        return "char";
    L21:
        if (r3.equals(Short.TYPE) == false) goto L25;
        return "short";
    L25:
        if (r3.equals(Integer.TYPE) == false) goto L29;
        return "int";
    L29:
        if (r3.equals(Float.TYPE) == false) goto L33;
        return "float";
    L33:
        if (r3.equals(Long.TYPE) == false) goto L37;
        return "long";
    L37:
        if (r3.equals(Double.TYPE) == false) goto L41;
        return "double";
    L41:
        if (r3.equals(Void.TYPE) == false) goto L45;
        return "void";
    L45:
        throw new IllegalStateException("Unknown primitive type: " + r3);
    L47:
        return r3.getName();
    }

    /* JADX INFO: renamed from: b */
    public static final String m479b(String r4) {
        if (r4.charAt(0) != '[') goto L7;
        return AbstractC0213Ey.m407e(m479b(r4.substring(1)), ClassUtils.ARRAY_SUFFIX);
    L7:
        if (r4.length() != 1) goto L14;
        String r0 = (String) f752b.get(r4);
        if (r0 == null) goto L12;
        return r0;
    L12:
        throw new IllegalArgumentException("Unknown primitive typeSign: ".concat(r4));
    L14:
        if (r4.charAt(0) != 'L') goto L20;
        if (r4.charAt(r4.length() - 1) != ';') goto L20;
        return r4.substring(1, r4.length() - 1).replace('/', '.');
    L20:
        throw new IllegalStateException("Unknown class sign: ".concat(r4));
    }

    /* JADX INFO: renamed from: c */
    public static final String m480c(Class r3) {
        if (r3.isPrimitive() == false) goto L43;
        if (r3.equals(Boolean.TYPE) == false) goto L9;
        return "Z";
    L9:
        if (r3.equals(Byte.TYPE) == false) goto L13;
        return "B";
    L13:
        if (r3.equals(Character.TYPE) == false) goto L17;
        return "C";
    L17:
        if (r3.equals(Short.TYPE) == false) goto L21;
        return "S";
    L21:
        if (r3.equals(Integer.TYPE) == false) goto L25;
        return "I";
    L25:
        if (r3.equals(Float.TYPE) == false) goto L29;
        return "F";
    L29:
        if (r3.equals(Long.TYPE) == false) goto L33;
        return "J";
    L33:
        if (r3.equals(Double.TYPE) == false) goto L37;
        return "D";
    L37:
        if (r3.equals(Void.TYPE) == false) goto L41;
        return "V";
    L41:
        throw new IllegalStateException("Unknown primitive type: " + r3);
    L43:
        if (r3.isArray() == false) goto L47;
        return AbstractC0213Ey.m420r("[", m480c(r3.getComponentType()));
    L47:
        return AbstractC2374ph.m4814k("L", r3.getName().replace('.', '/'), ";");
    }

    /* JADX INFO: renamed from: d */
    public static final String m481d(String r2) {
        if (AbstractC0085Bz.m132J(r2, false, ClassUtils.ARRAY_SUFFIX) == true) goto L5;
        String r0 = (String) f751a.get(r2);
        if (r0 == null) goto L9;
        return r0;
    L9:
        return AbstractC2374ph.m4814k("L", r2.replace('.', '/'), ";");
    L5:
        return AbstractC0213Ey.m420r("[", m481d(r2.substring(0, r2.length() - 2)));
    }
}
