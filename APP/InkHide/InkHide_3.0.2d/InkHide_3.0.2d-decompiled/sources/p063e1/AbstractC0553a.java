package p063e1;

import java.util.LinkedHashMap;
import p009E0.C0103c;
import p011F0.AbstractC0134v;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;

/* JADX INFO: renamed from: e1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553a {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f1860a = AbstractC0134v.m296a0(new C0103c("boolean", "Z"), new C0103c("byte", "B"), new C0103c("char", "C"), new C0103c("short", "S"), new C0103c("int", "I"), new C0103c("float", "F"), new C0103c("long", "J"), new C0103c("double", "D"), new C0103c("void", "V"));

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f1861b = AbstractC0134v.m296a0(new C0103c("Z", "boolean"), new C0103c("B", "byte"), new C0103c("C", "char"), new C0103c("S", "short"), new C0103c("I", "int"), new C0103c("F", "float"), new C0103c("J", "long"), new C0103c("D", "double"), new C0103c("V", "void"));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m1127a(String str) {
        AbstractC0223g.m418e(str, "typeSign");
        if (str.charAt(0) == '[') {
            String strSubstring = str.substring(1);
            AbstractC0223g.m417d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return m1127a(strSubstring) + "[]";
        }
        if (str.length() == 1) {
            String str2 = (String) f1861b.get(str);
            if (str2 != null) {
                return str2;
            }
            throw new IllegalArgumentException("Unknown primitive typeSign: ".concat(str));
        }
        if (str.charAt(0) != 'L' || str.charAt(str.length() - 1) != ';') {
            throw new IllegalStateException("Unknown class sign: ".concat(str));
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        AbstractC0223g.m417d(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return AbstractC0307q.m536f0(strSubstring2, '/', '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final String m1128b(String str) {
        AbstractC0223g.m418e(str, "typeName");
        if (!str.endsWith("[]")) {
            String str2 = (String) f1860a.get(str);
            return str2 == null ? AbstractC0174d.m353i("L", AbstractC0307q.m536f0(str, '.', '/'), ";") : str2;
        }
        String strSubstring = str.substring(0, str.length() - 2);
        AbstractC0223g.m417d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return AbstractC0174d.m352h("[", m1128b(strSubstring));
    }
}
