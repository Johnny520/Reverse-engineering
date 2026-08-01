package p298;

import androidx.compose.p001ui.text.input.C2853;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import net.bytebuddy.pool.TypePool;
import org.slf4j.Marker;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashSet f23464 = new HashSet(Arrays.asList("if", "for", "while", "switch", "catch", "synchronized", "new", "return", "throw", "assert", "case", "do", "try"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashSet f23463 = new HashSet(Arrays.asList("public", "protected", "private", "static", "final", "synchronized", "native", "abstract", "strictfp", "default"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m14437(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int iM14443 = 0;
        while (iM14443 < length) {
            int iM14444 = m14444(iM14443, str);
            if (iM14444 <= iM14443) {
                char cCharAt = str.charAt(iM14443);
                if (!Character.isWhitespace(cCharAt)) {
                    if (cCharAt == '@') {
                        int i = iM14443 + 1;
                        iM14444 = str.length();
                        while (i < iM14444) {
                            char cCharAt2 = str.charAt(i);
                            if (!Character.isJavaIdentifierPart(cCharAt2) && cCharAt2 != '.') {
                                break;
                            }
                            i++;
                        }
                        iM14443 = m14443(i, str);
                        if (iM14443 < iM14444 && str.charAt(iM14443) == '(') {
                            iM14443 = m14441(str, iM14443, '(', ')');
                            if (iM14443 < 0) {
                            }
                        }
                    } else if (m14447(iM14443, str, "final")) {
                        iM14443 += 5;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                iM14443++;
            }
            iM14443 = iM14444;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m14438(int i, String str, ArrayList arrayList) {
        String strM14437;
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            String str2 = (String) arrayList.get(i2);
            String strM14442 = m14442(str2);
            if (strM14442 == null) {
                strM14437 = m14437(str2);
            } else {
                int iM14446 = m14446(str2.length() - 1, str2);
                while (iM14446 >= 1 && str2.charAt(iM14446) == ']' && str2.charAt(iM14446 - 1) == '[') {
                    iM14446 = m14446(iM14446 - 2, str2);
                }
                int i3 = -1;
                if (iM14446 >= 0) {
                    int i4 = iM14446 + 1;
                    while (iM14446 >= 0 && Character.isJavaIdentifierPart(str2.charAt(iM14446))) {
                        iM14446--;
                    }
                    int i5 = iM14446 + 1;
                    if (i5 < i4 && strM14442.equals(str2.substring(i5, i4))) {
                        i3 = i5;
                    }
                }
                strM14437 = i3 < 0 ? m14437(str2) : m14437(str2.substring(0, i3).concat(str2.substring(strM14442.length() + i3)));
            }
            sb.append(strM14437);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m14439(int i, ArrayList arrayList) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append((String) arrayList.get(i2));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (r5 != ',') goto L49;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m14440(int i, String str) {
        int iM14443 = m14443(i, str);
        if (iM14443 < str.length()) {
            if (m14447(iM14443, str, "throws")) {
                int iM144432 = m14443(iM14443, str);
                if (m14447(iM144432, str, "throws")) {
                    iM144432 += 6;
                    int length = str.length();
                    loop0: while (true) {
                        boolean z = true;
                        while (true) {
                            if (iM144432 < length) {
                                iM144432 = m14443(iM144432, str);
                                if (iM144432 >= length) {
                                    break loop0;
                                }
                                char cCharAt = str.charAt(iM144432);
                                if (cCharAt != '{') {
                                    if (cCharAt == ';') {
                                        break loop0;
                                    }
                                    if (!z) {
                                        break;
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        break loop0;
                                    }
                                    while (true) {
                                        iM144432++;
                                        if (iM144432 < length) {
                                            char cCharAt2 = str.charAt(iM144432);
                                            if (Character.isJavaIdentifierPart(cCharAt2) || cCharAt2 == '.' || cCharAt2 == '$') {
                                            }
                                        }
                                    }
                                    z = false;
                                } else if (z) {
                                    break loop0;
                                }
                            } else {
                                break loop0;
                            }
                        }
                        iM144432++;
                    }
                    iM144432 = -1;
                }
                if (iM144432 >= 0) {
                    iM14443 = m14443(iM144432, str);
                    if (iM14443 >= str.length() && str.charAt(iM14443) == '{') {
                        return iM14443;
                    }
                }
            } else if (iM14443 >= str.length()) {
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m14441(String str, int i, char c, char c2) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int iM14444 = m14444(i, str);
            if (iM14444 > i) {
                i = iM14444 - 1;
            } else {
                char cCharAt = str.charAt(i);
                if (cCharAt == c) {
                    i2++;
                } else if (cCharAt == c2 && i2 - 1 == 0) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14442(String str) {
        int iM14446 = m14446(str.length() - 1, str);
        if (iM14446 < 0) {
            return null;
        }
        while (iM14446 >= 1 && str.charAt(iM14446) == ']' && str.charAt(iM14446 - 1) == '[') {
            iM14446 = m14446(iM14446 - 2, str);
        }
        if (iM14446 < 0) {
            return null;
        }
        int i = iM14446 + 1;
        while (iM14446 >= 0 && Character.isJavaIdentifierPart(str.charAt(iM14446))) {
            iM14446--;
        }
        int i2 = iM14446 + 1;
        if (i2 >= i) {
            return null;
        }
        String strSubstring = str.substring(i2, i);
        if (Character.isJavaIdentifierStart(strSubstring.charAt(0))) {
            return strSubstring;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m14443(int i, String str) {
        int length = str.length();
        while (i < length) {
            while (i < length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            int iM14444 = m14444(i, str);
            if (iM14444 <= i || i + 1 >= length || str.charAt(i) != '/') {
                break;
            }
            i = iM14444;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m14444(int i, String str) {
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int length = str.length();
        if (i < 0 || i >= length) {
            return i;
        }
        if (i < 0 || (i3 = 3 + i) > str.length() || !str.regionMatches(i, "\"\"\"", 0, 3)) {
            char cCharAt3 = str.charAt(i);
            if (cCharAt3 == '\"') {
                do {
                    i++;
                    while (i < length) {
                        cCharAt2 = str.charAt(i);
                        if (cCharAt2 == '\\') {
                            i += 2;
                        }
                    }
                } while (cCharAt2 != '\"');
                return i + 1;
            }
            if (cCharAt3 == '\'') {
                do {
                    i++;
                    while (i < length) {
                        cCharAt = str.charAt(i);
                        if (cCharAt == '\\') {
                            i += 2;
                        }
                    }
                } while (cCharAt != '\'');
                return i + 1;
            }
            if (cCharAt3 != '/' || (i2 = i + 1) >= length) {
                return i;
            }
            char cCharAt4 = str.charAt(i2);
            if (cCharAt4 == '/') {
                int i4 = i + 2;
                while (i4 < length) {
                    char cCharAt5 = str.charAt(i4);
                    if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                        break;
                    }
                    i4++;
                }
                return i4;
            }
            if (cCharAt4 != '*') {
                return i;
            }
            int iIndexOf = str.indexOf("*/", i + 2);
            if (iIndexOf >= 0) {
                return iIndexOf + 2;
            }
        } else {
            int iIndexOf2 = str.indexOf("\"\"\"", i3);
            if (iIndexOf2 >= 0) {
                return iIndexOf2 + 3;
            }
        }
        return length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C2853 m14445(int i, String str) {
        int iM14446;
        int i2;
        int iM14443;
        int iM14440;
        int iM14441;
        C2853 c2853;
        char c;
        boolean z;
        boolean z2;
        char cCharAt;
        int iM144462 = m14446(i - 1, str) + 1;
        int i3 = iM144462;
        while (i3 > 0 && Character.isJavaIdentifierPart(str.charAt(i3 - 1))) {
            i3--;
        }
        if (i3 < iM144462) {
            String strSubstring = str.substring(i3, iM144462);
            boolean z3 = false;
            if (Character.isJavaIdentifierStart(strSubstring.charAt(0)) && !f23464.contains(strSubstring) && ((iM14446 = m14446(i3 - 1, str)) < 0 || ((cCharAt = str.charAt(iM14446)) != '.' && cCharAt != ':' && cCharAt != '$'))) {
                char c2 = '(';
                char c3 = ')';
                int iM144412 = m14441(str, i, '(', ')');
                if (iM144412 >= 0 && (((iM14443 = m14443((i2 = iM144412 + 1), str)) >= str.length() || !str.startsWith("->", iM14443)) && (iM14440 = m14440(i2, str)) >= 0 && (iM14441 = m14441(str, iM14440, '{', '}')) >= 0)) {
                    String strSubstring2 = str.substring(i + 1, iM144412);
                    C9204 c9204 = new C9204();
                    c9204.f23468 = true;
                    if (strSubstring2.trim().isEmpty()) {
                        c9204.f23470 = true;
                        z = false;
                        c2853 = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int length = strSubstring2.length();
                        int i4 = 0;
                        int i5 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        int iMax3 = 0;
                        int iMax4 = 0;
                        c2853 = null;
                        while (true) {
                            c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
                            if (i5 >= length) {
                                break;
                            }
                            int iM14444 = m14444(i5, strSubstring2);
                            if (iM14444 > i5) {
                                i5 = iM14444;
                            } else {
                                char cCharAt2 = strSubstring2.charAt(i5);
                                if (cCharAt2 == '(') {
                                    iMax++;
                                } else if (cCharAt2 == ')') {
                                    iMax = Math.max(0, iMax - 1);
                                } else if (cCharAt2 == '[') {
                                    iMax2++;
                                } else if (cCharAt2 == ']') {
                                    iMax2 = Math.max(0, iMax2 - 1);
                                } else if (cCharAt2 == '{') {
                                    iMax3++;
                                } else if (cCharAt2 == '}') {
                                    iMax3 = Math.max(0, iMax3 - 1);
                                } else if (cCharAt2 == '<') {
                                    iMax4++;
                                } else if (cCharAt2 == '>') {
                                    iMax4 = Math.max(0, iMax4 - 1);
                                } else if (cCharAt2 == ',' && iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                                    arrayList.add(strSubstring2.substring(i4, i5));
                                    i4 = i5 + 1;
                                }
                                i5++;
                            }
                        }
                        arrayList.add(strSubstring2.substring(i4));
                        boolean z4 = false;
                        int i6 = 0;
                        while (true) {
                            if (i6 < arrayList.size()) {
                                ?? Trim = ((String) arrayList.get(i6)).trim();
                                if (Trim.isEmpty()) {
                                    c9204.f23470 = z3;
                                    z = z3;
                                    break;
                                }
                                int length2 = Trim.length();
                                ?? r15 = z3;
                                int iMax5 = r15 == true ? 1 : 0;
                                int iMax6 = iMax5 == true ? 1 : 0;
                                int iMax7 = iMax6 == true ? 1 : 0;
                                int iMax8 = iMax7 == true ? 1 : 0;
                                while (true) {
                                    if (r15 >= length2) {
                                        r15 = -1;
                                        break;
                                    }
                                    int iM144442 = m14444(r15, Trim);
                                    if (iM144442 > r15) {
                                        r15 = iM144442;
                                    } else {
                                        char cCharAt3 = Trim.charAt(r15);
                                        if (cCharAt3 == c2) {
                                            iMax5++;
                                        } else if (cCharAt3 == c3) {
                                            iMax5 = Math.max(z3 ? 1 : 0, iMax5 - 1);
                                        } else if (cCharAt3 == c) {
                                            iMax6++;
                                        } else if (cCharAt3 == ']') {
                                            iMax6 = Math.max(z3 ? 1 : 0, iMax6 - 1);
                                        } else if (cCharAt3 == '{') {
                                            iMax7++;
                                        } else if (cCharAt3 == '}') {
                                            iMax7 = Math.max(z3 ? 1 : 0, iMax7 - 1);
                                        } else if (cCharAt3 == '<') {
                                            iMax8++;
                                        } else if (cCharAt3 == '>') {
                                            iMax8 = Math.max(z3 ? 1 : 0, iMax8 - 1);
                                        } else {
                                            if (cCharAt3 == '=' && iMax5 == 0 && iMax6 == 0 && iMax7 == 0 && iMax8 == 0) {
                                                char cCharAt4 = r15 > 0 ? Trim.charAt(r15 - 1) : z3 ? 1 : 0;
                                                int i7 = r15 + 1;
                                                char cCharAt5 = i7 < length2 ? Trim.charAt(i7) : z3 ? 1 : 0;
                                                if (cCharAt4 != '=' && cCharAt4 != '!' && cCharAt4 != '<') {
                                                    if (cCharAt4 != '>' && cCharAt5 != '=') {
                                                        break;
                                                    }
                                                }
                                                r15 = i7;
                                            }
                                            z3 = false;
                                            c2 = '(';
                                            c3 = ')';
                                            c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
                                        }
                                        r15++;
                                        z3 = false;
                                        c2 = '(';
                                        c3 = ')';
                                        c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
                                    }
                                }
                                String strTrim = (r15 >= 0 ? Trim.substring(0, r15) : Trim).trim();
                                String strSubstring3 = r15 >= 0 ? Trim.substring(r15 + 1) : null;
                                if (strSubstring3 != null) {
                                    strSubstring3 = strSubstring3.trim();
                                    if (strSubstring3.isEmpty()) {
                                        z = false;
                                        c9204.f23470 = false;
                                        break;
                                    }
                                    z = false;
                                    c9204.f23469 = true;
                                    z2 = true;
                                } else {
                                    z = false;
                                    z = false;
                                    if (z4) {
                                        c9204.f23468 = false;
                                        z2 = z4;
                                    } else {
                                        c9204.f23467++;
                                        z2 = z4;
                                    }
                                }
                                String strM14442 = m14442(strTrim);
                                if (strM14442 == null) {
                                    c9204.f23470 = z;
                                    break;
                                }
                                c9204.f23466.add(strTrim);
                                c9204.f23465.add(strM14442);
                                c9204.f23471.add(strSubstring3);
                                i6++;
                                z3 = z ? 1 : 0;
                                c2 = '(';
                                c3 = ')';
                                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
                                z4 = z2;
                            } else {
                                z = z3;
                                c9204.f23470 = true;
                                if (!c9204.f23469) {
                                    c9204.f23468 = true;
                                }
                            }
                        }
                    }
                    if (!c9204.f23470) {
                        return c2853;
                    }
                    loop1: while (i3 > 0) {
                        char cCharAt6 = str.charAt(i3 - 1);
                        if (cCharAt6 == ';' || cCharAt6 == '{' || cCharAt6 == '}') {
                            break;
                        }
                        if (cCharAt6 == '\n' || cCharAt6 == '\r') {
                            int i8 = i3;
                            while (i8 > 0) {
                                char cCharAt7 = str.charAt(i8 - 1);
                                if (cCharAt7 == '\n' || cCharAt7 == '\r') {
                                    break;
                                }
                                i8--;
                            }
                            String strTrim2 = str.substring(i8, i3).trim();
                            if (strTrim2.isEmpty()) {
                                break;
                            }
                            if (strTrim2.startsWith("@")) {
                                continue;
                            } else {
                                if (strTrim2.startsWith("//") || strTrim2.startsWith("/*") || strTrim2.startsWith(Marker.ANY_MARKER)) {
                                    break;
                                }
                                String[] strArrSplit = strTrim2.split("\\s+");
                                if (strArrSplit.length == 0) {
                                    break;
                                }
                                int length3 = strArrSplit.length;
                                for (?? r6 = z; r6 < length3; r6++) {
                                    String str2 = strArrSplit[r6];
                                    if (!str2.isEmpty() && !f23463.contains(str2)) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                        i3--;
                    }
                    return new C2853(i3, iM14441 + 1, strSubstring, c9204);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m14446(int i, String str) {
        while (i >= 0 && Character.isWhitespace(str.charAt(i))) {
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m14447(int i, String str, String str2) {
        int i2;
        int length;
        return i >= 0 && str2.length() + i <= str.length() && str.regionMatches(i, str2, 0, str2.length()) && ((i2 = i + (-1)) < 0 || !Character.isJavaIdentifierPart(str.charAt(i2))) && ((length = str2.length() + i) >= str.length() || !Character.isJavaIdentifierPart(str.charAt(length)));
    }
}
