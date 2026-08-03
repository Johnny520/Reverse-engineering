package p000a;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a.h5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608h5 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f2240a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f2241b;

    static {
        C0710mc[] c0710mcArr = {new C0710mc("boolean", "Z"), new C0710mc("byte", "B"), new C0710mc("char", "C"), new C0710mc("short", "S"), new C0710mc("int", "I"), new C0710mc("float", "F"), new C0710mc("long", "J"), new C0710mc("double", "D"), new C0710mc("void", "V")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0480aa.m1169C(9));
        C0499ba.m1230F(linkedHashMap, c0710mcArr);
        f2240a = linkedHashMap;
        C0710mc[] c0710mcArr2 = {new C0710mc("Z", "boolean"), new C0710mc("B", "byte"), new C0710mc("C", "char"), new C0710mc("S", "short"), new C0710mc("I", "int"), new C0710mc("F", "float"), new C0710mc("J", "long"), new C0710mc("D", "double"), new C0710mc("V", "void")};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C0480aa.m1169C(9));
        C0499ba.m1230F(linkedHashMap2, c0710mcArr2);
        f2241b = linkedHashMap2;
    }

    /* JADX INFO: renamed from: a */
    public static final String m1444a(String str) {
        C0631i9.m1482e(str, "typeSign");
        if (str.charAt(0) == '[') {
            String strSubstring = str.substring(1);
            C0631i9.m1481d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return C0944z.m2226f(m1444a(strSubstring), "[]");
        }
        if (str.length() == 1) {
            String str2 = (String) f2241b.get(str);
            if (str2 != null) {
                return str2;
            }
            throw new IllegalArgumentException("Unknown primitive typeSign: ".concat(str));
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            throw new IllegalStateException("Unknown class sign: ".concat(str));
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        C0631i9.m1481d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return C0015Ae.m47F(strSubstring2, '/', '.');
    }

    /* JADX INFO: renamed from: b */
    public static final String m1445b(String str) {
        C0631i9.m1482e(str, "typeName");
        if (!str.endsWith("[]")) {
            String str2 = (String) f2240a.get(str);
            return str2 == null ? C0944z.m2227g("L", C0015Ae.m47F(str, '.', '/'), ";") : str2;
        }
        String strSubstring = str.substring(0, str.length() - 2);
        C0631i9.m1481d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return C0944z.m2231k("[", m1445b(strSubstring));
    }
}
