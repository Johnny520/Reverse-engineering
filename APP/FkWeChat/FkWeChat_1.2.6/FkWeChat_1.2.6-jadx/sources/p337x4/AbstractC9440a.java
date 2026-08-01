package p337x4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: x4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9440a {

    /* JADX INFO: renamed from: a */
    public static final Set f32071a = new HashSet(Arrays.asList("if", "for", "while", "switch", "catch", "synchronized", "new", "return", "throw", "assert", "case", "do", "try"));

    /* JADX INFO: renamed from: b */
    public static final Set f32072b = new HashSet(Arrays.asList("public", "protected", "private", "static", "final", "synchronized", "native", "abstract", "strictfp", "default"));

    /* JADX INFO: renamed from: x4.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f32073a;

        /* JADX INFO: renamed from: b */
        public final int f32074b;

        /* JADX INFO: renamed from: c */
        public final String f32075c;

        public a(int i10, int i11, String str) {
            this.f32073a = i10;
            this.f32074b = i11;
            this.f32075c = str;
        }
    }

    /* JADX INFO: renamed from: x4.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f32076a;

        /* JADX INFO: renamed from: b */
        public final int f32077b;

        /* JADX INFO: renamed from: c */
        public final String f32078c;

        /* JADX INFO: renamed from: d */
        public final c f32079d;

        public b(int i10, int i11, String str, c cVar) {
            this.f32076a = i10;
            this.f32077b = i11;
            this.f32078c = str;
            this.f32079d = cVar;
        }
    }

    /* JADX INFO: renamed from: x4.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public boolean f32080a;

        /* JADX INFO: renamed from: b */
        public boolean f32081b;

        /* JADX INFO: renamed from: c */
        public boolean f32082c;

        /* JADX INFO: renamed from: d */
        public int f32083d;

        /* JADX INFO: renamed from: e */
        public final List f32084e;

        /* JADX INFO: renamed from: f */
        public final List f32085f;

        /* JADX INFO: renamed from: g */
        public final List f32086g;

        public c() {
            this.f32084e = new ArrayList();
            this.f32085f = new ArrayList();
            this.f32086g = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m36748a(c cVar, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append((String) cVar.f32085f.get(i11));
        }
        while (i10 < cVar.f32084e.size()) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append((String) cVar.f32086g.get(i10));
            i10++;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m36749b(String str, String str2, String str3, String str4, c cVar, Set set) {
        StringBuilder sb2 = new StringBuilder(str.length() + str4.length() + 128);
        sb2.append(str);
        sb2.append('(');
        List list = cVar.f32084e;
        sb2.append(m36756i(list, 0, list.size()));
        sb2.append(')');
        sb2.append(str3);
        sb2.append(str4);
        boolean zM36761n = m36761n(str, str2);
        int size = cVar.f32084e.size();
        while (true) {
            size--;
            if (size < cVar.f32083d) {
                return sb2.toString();
            }
            String strM36757j = m36757j(str2, cVar.f32084e, size);
            if (!set.contains(strM36757j)) {
                sb2.append('\n');
                sb2.append(str);
                sb2.append('(');
                sb2.append(m36756i(cVar.f32084e, 0, size));
                sb2.append(')');
                sb2.append(str3);
                sb2.append('{');
                if (zM36761n) {
                    sb2.append("return ");
                }
                sb2.append(str2);
                sb2.append('(');
                sb2.append(m36748a(cVar, size));
                sb2.append(");}");
                set.add(strM36757j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static Set m36750c(String str) {
        b bVarM36771x;
        HashSet hashSet = new HashSet();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int iM36764q = m36764q(str, i10);
            if (iM36764q > i10) {
                i10 = iM36764q;
            } else if (str.charAt(i10) == '(' && (bVarM36771x = m36771x(str, i10)) != null) {
                String str2 = bVarM36771x.f32078c;
                List list = bVarM36771x.f32079d.f32084e;
                hashSet.add(m36757j(str2, list, list.size()));
                i10 = bVarM36771x.f32077b;
            } else {
                i10++;
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: d */
    public static String m36751d(String str) {
        int iM36767t = m36767t(str, str.length() - 1);
        if (iM36767t < 0) {
            return null;
        }
        while (iM36767t >= 1 && str.charAt(iM36767t) == ']' && str.charAt(iM36767t - 1) == '[') {
            iM36767t = m36767t(str, iM36767t - 2);
        }
        if (iM36767t < 0) {
            return null;
        }
        int i10 = iM36767t + 1;
        while (iM36767t >= 0 && Character.isJavaIdentifierPart(str.charAt(iM36767t))) {
            iM36767t--;
        }
        int i11 = iM36767t + 1;
        if (i11 >= i10) {
            return null;
        }
        String strSubstring = str.substring(i11, i10);
        if (Character.isJavaIdentifierStart(strSubstring.charAt(0))) {
            return strSubstring;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m36752e(String str, int i10) {
        while (i10 > 0) {
            char cCharAt = str.charAt(i10 - 1);
            if (cCharAt == ';' || cCharAt == '{' || cCharAt == '}') {
                break;
            }
            i10--;
        }
        return i10;
    }

    /* JADX INFO: renamed from: f */
    public static int m36753f(String str, int i10, char c10, char c11) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            int iM36764q = m36764q(str, i10);
            if (iM36764q > i10) {
                i10 = iM36764q - 1;
            } else {
                char cCharAt = str.charAt(i10);
                if (cCharAt == c10) {
                    i11++;
                } else if (cCharAt == c11 && i11 - 1 == 0) {
                    return i10;
                }
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static int m36754g(String str) {
        int length = str.length();
        int i10 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        while (i10 < length) {
            int iM36764q = m36764q(str, i10);
            if (iM36764q > i10) {
                i10 = iM36764q;
            } else {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '(') {
                    iMax++;
                } else if (cCharAt == ')') {
                    iMax = Math.max(0, iMax - 1);
                } else if (cCharAt == '[') {
                    iMax2++;
                } else if (cCharAt == ']') {
                    iMax2 = Math.max(0, iMax2 - 1);
                } else if (cCharAt == '{') {
                    iMax3++;
                } else if (cCharAt == '}') {
                    iMax3 = Math.max(0, iMax3 - 1);
                } else if (cCharAt == '<') {
                    iMax4++;
                } else if (cCharAt == '>') {
                    iMax4 = Math.max(0, iMax4 - 1);
                } else if (cCharAt == '=' && iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    char cCharAt2 = i10 > 0 ? str.charAt(i10 - 1) : (char) 0;
                    int i11 = i10 + 1;
                    char cCharAt3 = i11 < length ? str.charAt(i11) : (char) 0;
                    if (cCharAt2 != '=' && cCharAt2 != '!' && cCharAt2 != '<' && cCharAt2 != '>' && cCharAt3 != '=') {
                        return i10;
                    }
                    i10 = i11;
                }
                i10++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static int m36755h(String str, String str2) {
        int iM36767t = m36767t(str, str.length() - 1);
        while (iM36767t >= 1 && str.charAt(iM36767t) == ']' && str.charAt(iM36767t - 1) == '[') {
            iM36767t = m36767t(str, iM36767t - 2);
        }
        if (iM36767t < 0) {
            return -1;
        }
        int i10 = iM36767t + 1;
        while (iM36767t >= 0 && Character.isJavaIdentifierPart(str.charAt(iM36767t))) {
            iM36767t--;
        }
        int i11 = iM36767t + 1;
        if (i11 < i10 && str2.equals(str.substring(i11, i10))) {
            return i11;
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static String m36756i(List list, int i10, int i11) {
        if (i10 >= i11) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = i10; i12 < i11; i12++) {
            if (i12 > i10) {
                sb2.append(", ");
            }
            sb2.append((String) list.get(i12));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m36757j(String str, List list, int i10) {
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append(str);
        sb2.append('(');
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(',');
            }
            sb2.append(m36762o((String) list.get(i11)));
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m36758k(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        int iM36763p = 0;
        while (iM36763p < length) {
            int iM36764q = m36764q(str, iM36763p);
            if (iM36764q > iM36763p) {
                iM36763p = iM36764q;
            } else {
                char cCharAt = str.charAt(iM36763p);
                if (!Character.isWhitespace(cCharAt)) {
                    if (cCharAt == '@') {
                        iM36763p = m36763p(str, iM36763p + 1);
                    } else if (m36770w(str, iM36763p, "final")) {
                        iM36763p += 5;
                    } else {
                        sb2.append(cCharAt);
                    }
                }
                iM36763p++;
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static c m36759l(String str) {
        c cVar = new c();
        cVar.f32082c = true;
        if (str.trim().isEmpty()) {
            cVar.f32080a = true;
            return cVar;
        }
        List listM36768u = m36768u(str, ',');
        boolean z10 = false;
        for (int i10 = 0; i10 < listM36768u.size(); i10++) {
            String strTrim = ((String) listM36768u.get(i10)).trim();
            if (strTrim.isEmpty()) {
                cVar.f32080a = false;
                return cVar;
            }
            int iM36754g = m36754g(strTrim);
            String strTrim2 = (iM36754g >= 0 ? strTrim.substring(0, iM36754g) : strTrim).trim();
            String strSubstring = iM36754g >= 0 ? strTrim.substring(iM36754g + 1) : null;
            if (strSubstring != null) {
                strSubstring = strSubstring.trim();
                if (strSubstring.isEmpty()) {
                    cVar.f32080a = false;
                    return cVar;
                }
                cVar.f32081b = true;
                z10 = true;
            } else if (z10) {
                cVar.f32082c = false;
            } else {
                cVar.f32083d++;
            }
            String strM36751d = m36751d(strTrim2);
            if (strM36751d == null) {
                cVar.f32080a = false;
                return cVar;
            }
            cVar.f32084e.add(strTrim2);
            cVar.f32085f.add(strM36751d);
            cVar.f32086g.add(strSubstring);
        }
        cVar.f32080a = true;
        if (!cVar.f32081b) {
            cVar.f32082c = true;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: m */
    public static String m36760m(String str) {
        a aVarM36772y;
        if (str == null || str.indexOf(61) < 0 || str.indexOf(40) < 0) {
            return str;
        }
        Set setM36750c = m36750c(str);
        StringBuilder sb2 = new StringBuilder(str.length() + 128);
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int iM36764q = m36764q(str, i10);
            if (iM36764q > i10) {
                i10 = iM36764q;
            } else if (str.charAt(i10) == '(' && (aVarM36772y = m36772y(str, i10, setM36750c)) != null) {
                sb2.append((CharSequence) str, i11, aVarM36772y.f32073a);
                sb2.append(aVarM36772y.f32075c);
                i11 = aVarM36772y.f32074b;
                i10 = i11;
            } else {
                i10++;
            }
        }
        sb2.append((CharSequence) str, i11, length);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m36761n(String str, String str2) {
        String strTrim = str.trim();
        if (!strTrim.endsWith(str2)) {
            return false;
        }
        String strTrim2 = strTrim.substring(0, strTrim.length() - str2.length()).trim();
        if (strTrim2.isEmpty()) {
            return false;
        }
        String str3 = null;
        for (String str4 : strTrim2.split("\\s+")) {
            if (!str4.startsWith("@") && !f32072b.contains(str4)) {
                str3 = str4;
            }
        }
        if (str3 == null) {
            return false;
        }
        return !"void".equals(str3);
    }

    /* JADX INFO: renamed from: o */
    public static String m36762o(String str) {
        String strM36751d = m36751d(str);
        if (strM36751d == null) {
            return m36758k(str);
        }
        int iM36755h = m36755h(str, strM36751d);
        return iM36755h < 0 ? m36758k(str) : m36758k(str.substring(0, iM36755h).concat(str.substring(iM36755h + strM36751d.length())));
    }

    /* JADX INFO: renamed from: p */
    public static int m36763p(String str, int i10) {
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (!Character.isJavaIdentifierPart(cCharAt) && cCharAt != '.') {
                break;
            }
            i10++;
        }
        int iM36766s = m36766s(str, i10);
        if (iM36766s >= length || str.charAt(iM36766s) != '(') {
            return iM36766s;
        }
        int iM36753f = m36753f(str, iM36766s, '(', ')');
        return iM36753f < 0 ? length : iM36753f + 1;
    }

    /* JADX INFO: renamed from: q */
    public static int m36764q(String str, int i10) {
        int i11;
        char cCharAt;
        char cCharAt2;
        int length = str.length();
        if (i10 >= 0 && i10 < length) {
            if (m36769v(str, i10, "\"\"\"")) {
                int iIndexOf = str.indexOf("\"\"\"", i10 + 3);
                if (iIndexOf >= 0) {
                    return iIndexOf + 3;
                }
            } else {
                char cCharAt3 = str.charAt(i10);
                if (cCharAt3 == '\"') {
                    do {
                        i10++;
                        while (i10 < length) {
                            cCharAt2 = str.charAt(i10);
                            if (cCharAt2 == '\\') {
                                i10 += 2;
                            }
                        }
                    } while (cCharAt2 != '\"');
                    return i10 + 1;
                }
                if (cCharAt3 == '\'') {
                    do {
                        i10++;
                        while (i10 < length) {
                            cCharAt = str.charAt(i10);
                            if (cCharAt == '\\') {
                                i10 += 2;
                            }
                        }
                    } while (cCharAt != '\'');
                    return i10 + 1;
                }
                if (cCharAt3 == '/' && (i11 = i10 + 1) < length) {
                    char cCharAt4 = str.charAt(i11);
                    if (cCharAt4 == '/') {
                        int i12 = i10 + 2;
                        while (i12 < length) {
                            char cCharAt5 = str.charAt(i12);
                            if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                                break;
                            }
                            i12++;
                        }
                        return i12;
                    }
                    if (cCharAt4 == '*') {
                        int iIndexOf2 = str.indexOf("*/", i10 + 2);
                        if (iIndexOf2 >= 0) {
                            return iIndexOf2 + 2;
                        }
                    }
                }
            }
            return length;
        }
        return i10;
    }

    /* JADX INFO: renamed from: r */
    public static int m36765r(String str, int i10) {
        int iM36766s = m36766s(str, i10);
        if (!m36770w(str, iM36766s, "throws")) {
            return iM36766s;
        }
        int i11 = iM36766s + 6;
        int length = str.length();
        while (i11 < length) {
            int iM36764q = m36764q(str, i11);
            if (iM36764q > i11) {
                i11 = iM36764q;
            } else {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '{' || cCharAt == ';') {
                    break;
                }
                i11++;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: s */
    public static int m36766s(String str, int i10) {
        int length = str.length();
        while (i10 < length) {
            while (i10 < length && Character.isWhitespace(str.charAt(i10))) {
                i10++;
            }
            int iM36764q = m36764q(str, i10);
            if (iM36764q <= i10 || i10 + 1 >= length || str.charAt(i10) != '/') {
                break;
            }
            i10 = iM36764q;
        }
        return i10;
    }

    /* JADX INFO: renamed from: t */
    public static int m36767t(String str, int i10) {
        while (i10 >= 0 && Character.isWhitespace(str.charAt(i10))) {
            i10--;
        }
        return i10;
    }

    /* JADX INFO: renamed from: u */
    public static List m36768u(String str, char c10) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        while (i10 < length) {
            int iM36764q = m36764q(str, i10);
            if (iM36764q > i10) {
                i10 = iM36764q;
            } else {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '(') {
                    iMax++;
                } else if (cCharAt == ')') {
                    iMax = Math.max(0, iMax - 1);
                } else if (cCharAt == '[') {
                    iMax2++;
                } else if (cCharAt == ']') {
                    iMax2 = Math.max(0, iMax2 - 1);
                } else if (cCharAt == '{') {
                    iMax3++;
                } else if (cCharAt == '}') {
                    iMax3 = Math.max(0, iMax3 - 1);
                } else if (cCharAt == '<') {
                    iMax4++;
                } else if (cCharAt == '>') {
                    iMax4 = Math.max(0, iMax4 - 1);
                } else if (cCharAt == c10 && iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    arrayList.add(str.substring(i11, i10));
                    i11 = i10 + 1;
                }
                i10++;
            }
        }
        arrayList.add(str.substring(i11));
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m36769v(String str, int i10, String str2) {
        return i10 >= 0 && str2.length() + i10 <= str.length() && str.regionMatches(i10, str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: w */
    public static boolean m36770w(String str, int i10, String str2) {
        if (i10 < 0 || str2.length() + i10 > str.length() || !str.regionMatches(i10, str2, 0, str2.length())) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0 && Character.isJavaIdentifierPart(str.charAt(i11))) {
            return false;
        }
        int length = i10 + str2.length();
        return length >= str.length() || !Character.isJavaIdentifierPart(str.charAt(length));
    }

    /* JADX INFO: renamed from: x */
    public static b m36771x(String str, int i10) {
        int iM36767t;
        int iM36753f;
        int iM36766s;
        int iM36753f2;
        char cCharAt;
        int iM36767t2 = m36767t(str, i10 - 1) + 1;
        int i11 = iM36767t2;
        while (i11 > 0 && Character.isJavaIdentifierPart(str.charAt(i11 - 1))) {
            i11--;
        }
        if (i11 >= iM36767t2) {
            return null;
        }
        String strSubstring = str.substring(i11, iM36767t2);
        if (!Character.isJavaIdentifierStart(strSubstring.charAt(0)) || f32071a.contains(strSubstring) || (((iM36767t = m36767t(str, i11 - 1)) >= 0 && ((cCharAt = str.charAt(iM36767t)) == '.' || cCharAt == ':' || cCharAt == '$')) || (iM36753f = m36753f(str, i10, '(', ')')) < 0)) {
            return null;
        }
        int iM36766s2 = m36766s(str, iM36753f + 1);
        if ((iM36766s2 < str.length() && str.startsWith("->", iM36766s2)) || (iM36766s = m36766s(str, m36765r(str, iM36766s2))) >= str.length() || str.charAt(iM36766s) != '{' || (iM36753f2 = m36753f(str, iM36766s, '{', '}')) < 0) {
            return null;
        }
        c cVarM36759l = m36759l(str.substring(i10 + 1, iM36753f));
        if (cVarM36759l.f32080a) {
            return new b(m36752e(str, i11), iM36753f2 + 1, strSubstring, cVarM36759l);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static a m36772y(String str, int i10, Set set) {
        b bVarM36771x = m36771x(str, i10);
        if (bVarM36771x == null) {
            return null;
        }
        c cVar = bVarM36771x.f32079d;
        if (!cVar.f32080a || !cVar.f32081b || !cVar.f32082c) {
            return null;
        }
        int i11 = bVarM36771x.f32076a;
        int iM36753f = m36753f(str, i10, '(', ')');
        String strSubstring = str.substring(i11, i10);
        int i12 = iM36753f + 1;
        int iM36766s = m36766s(str, m36765r(str, m36766s(str, i12)));
        String strSubstring2 = str.substring(i12, iM36766s);
        int iM36753f2 = m36753f(str, iM36766s, '{', '}') + 1;
        return new a(i11, iM36753f2, m36749b(strSubstring, bVarM36771x.f32078c, strSubstring2, str.substring(iM36766s, iM36753f2), cVar, set));
    }
}
