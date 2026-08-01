package p282;

import androidx.compose.ui.text.input.C2019;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import net.bytebuddy.pool.TypePool;
import org.slf4j.Marker;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8373 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashSet f23120 = new HashSet(Arrays.asList("if", "for", "while", "switch", "catch", "synchronized", "new", "return", "throw", "assert", "case", "do", "try"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashSet f23119 = new HashSet(Arrays.asList("public", "protected", "private", "static", "final", "synchronized", "native", "abstract", "strictfp", "default"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m13861(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int iM13867 = 0;
        while (iM13867 < length) {
            int iM13868 = m13868(iM13867, str);
            if (iM13868 <= iM13867) {
                char cCharAt = str.charAt(iM13867);
                if (!Character.isWhitespace(cCharAt)) {
                    if (cCharAt == '@') {
                        int i = iM13867 + 1;
                        iM13868 = str.length();
                        while (i < iM13868) {
                            char cCharAt2 = str.charAt(i);
                            if (!Character.isJavaIdentifierPart(cCharAt2) && cCharAt2 != '.') {
                                break;
                            }
                            i++;
                        }
                        iM13867 = m13867(i, str);
                        if (iM13867 < iM13868 && str.charAt(iM13867) == '(') {
                            iM13867 = m13865(str, iM13867, '(', ')');
                            if (iM13867 < 0) {
                            }
                        }
                    } else if (m13871(iM13867, str, "final")) {
                        iM13867 += 5;
                    } else {
                        sb.append(cCharAt);
                    }
                }
                iM13867++;
            }
            iM13867 = iM13868;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m13862(int i, String str, ArrayList arrayList) {
        String strM13861;
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append('(');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            String str2 = (String) arrayList.get(i2);
            String strM13866 = m13866(str2);
            if (strM13866 == null) {
                strM13861 = m13861(str2);
            } else {
                int iM13870 = m13870(str2.length() - 1, str2);
                while (iM13870 >= 1 && str2.charAt(iM13870) == ']' && str2.charAt(iM13870 - 1) == '[') {
                    iM13870 = m13870(iM13870 - 2, str2);
                }
                int i3 = -1;
                if (iM13870 >= 0) {
                    int i4 = iM13870 + 1;
                    while (iM13870 >= 0 && Character.isJavaIdentifierPart(str2.charAt(iM13870))) {
                        iM13870--;
                    }
                    int i5 = iM13870 + 1;
                    if (i5 < i4 && strM13866.equals(str2.substring(i5, i4))) {
                        i3 = i5;
                    }
                }
                strM13861 = i3 < 0 ? m13861(str2) : m13861(str2.substring(0, i3).concat(str2.substring(strM13866.length() + i3)));
            }
            sb.append(strM13861);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m13863(int i, ArrayList arrayList) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m13864(int r7, java.lang.String r8) {
        /*
            int r7 = m13867(r7, r8)
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto Ld
            goto L7f
        Ld:
            java.lang.String r0 = "throws"
            boolean r2 = m13871(r7, r8, r0)
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == 0) goto L72
            int r7 = m13867(r7, r8)
            boolean r0 = m13871(r7, r8, r0)
            if (r0 != 0) goto L22
            goto L6b
        L22:
            int r7 = r7 + 6
            int r0 = r8.length()
            r2 = 1
        L29:
            r4 = r2
        L2a:
            if (r7 >= r0) goto L32
            int r7 = m13867(r7, r8)
            if (r7 < r0) goto L34
        L32:
            r7 = r1
            goto L6b
        L34:
            char r5 = r8.charAt(r7)
            if (r5 != r3) goto L3d
            if (r4 == 0) goto L6b
            goto L32
        L3d:
            r6 = 59
            if (r5 != r6) goto L42
            goto L32
        L42:
            if (r4 == 0) goto L64
            boolean r4 = java.lang.Character.isJavaIdentifierStart(r5)
            if (r4 != 0) goto L4b
            goto L32
        L4b:
            int r7 = r7 + 1
            if (r7 >= r0) goto L62
            char r4 = r8.charAt(r7)
            boolean r5 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r5 != 0) goto L4b
            r5 = 46
            if (r4 == r5) goto L4b
            r5 = 36
            if (r4 != r5) goto L62
            goto L4b
        L62:
            r4 = 0
            goto L2a
        L64:
            r4 = 44
            if (r5 != r4) goto L32
            int r7 = r7 + 1
            goto L29
        L6b:
            if (r7 >= 0) goto L6e
            goto L7f
        L6e:
            int r7 = m13867(r7, r8)
        L72:
            int r0 = r8.length()
            if (r7 >= r0) goto L7f
            char r8 = r8.charAt(r7)
            if (r8 != r3) goto L7f
            return r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p282.AbstractC8373.m13864(int, java.lang.String):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m13865(String str, int i, char c, char c2) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            int iM13868 = m13868(i, str);
            if (iM13868 > i) {
                i = iM13868 - 1;
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
    public static String m13866(String str) {
        int iM13870 = m13870(str.length() - 1, str);
        if (iM13870 < 0) {
            return null;
        }
        while (iM13870 >= 1 && str.charAt(iM13870) == ']' && str.charAt(iM13870 - 1) == '[') {
            iM13870 = m13870(iM13870 - 2, str);
        }
        if (iM13870 < 0) {
            return null;
        }
        int i = iM13870 + 1;
        while (iM13870 >= 0 && Character.isJavaIdentifierPart(str.charAt(iM13870))) {
            iM13870--;
        }
        int i2 = iM13870 + 1;
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
    public static int m13867(int i, String str) {
        int length = str.length();
        while (i < length) {
            while (i < length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            int iM13868 = m13868(i, str);
            if (iM13868 <= i || i + 1 >= length || str.charAt(i) != '/') {
                break;
            }
            i = iM13868;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m13868(int i, String str) {
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
    public static C2019 m13869(int i, String str) {
        int iM13870;
        int i2;
        int iM13867;
        int iM13864;
        int iM13865;
        C2019 c2019;
        char c;
        boolean z;
        boolean z2;
        char cCharAt;
        int iM138702 = m13870(i - 1, str) + 1;
        int i3 = iM138702;
        while (i3 > 0 && Character.isJavaIdentifierPart(str.charAt(i3 - 1))) {
            i3--;
        }
        if (i3 < iM138702) {
            String strSubstring = str.substring(i3, iM138702);
            boolean z3 = false;
            if (Character.isJavaIdentifierStart(strSubstring.charAt(0)) && !f23120.contains(strSubstring) && ((iM13870 = m13870(i3 - 1, str)) < 0 || ((cCharAt = str.charAt(iM13870)) != '.' && cCharAt != ':' && cCharAt != '$'))) {
                char c2 = '(';
                char c3 = ')';
                int iM138652 = m13865(str, i, '(', ')');
                if (iM138652 >= 0 && (((iM13867 = m13867((i2 = iM138652 + 1), str)) >= str.length() || !str.startsWith("->", iM13867)) && (iM13864 = m13864(i2, str)) >= 0 && (iM13865 = m13865(str, iM13864, '{', '}')) >= 0)) {
                    String strSubstring2 = str.substring(i + 1, iM138652);
                    C8374 c8374 = new C8374();
                    c8374.f23124 = true;
                    if (strSubstring2.trim().isEmpty()) {
                        c8374.f23126 = true;
                        z = false;
                        c2019 = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int length = strSubstring2.length();
                        int i4 = 0;
                        int i5 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        int iMax3 = 0;
                        int iMax4 = 0;
                        c2019 = null;
                        while (true) {
                            c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
                            if (i5 >= length) {
                                break;
                            }
                            int iM13868 = m13868(i5, strSubstring2);
                            if (iM13868 > i5) {
                                i5 = iM13868;
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
                                    c8374.f23126 = z3;
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
                                    int iM138682 = m13868(r15, Trim);
                                    if (iM138682 > r15) {
                                        r15 = iM138682;
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
                                        c8374.f23126 = false;
                                        break;
                                    }
                                    z = false;
                                    c8374.f23125 = true;
                                    z2 = true;
                                } else {
                                    z = false;
                                    z = false;
                                    if (z4) {
                                        c8374.f23124 = false;
                                        z2 = z4;
                                    } else {
                                        c8374.f23123++;
                                        z2 = z4;
                                    }
                                }
                                String strM13866 = m13866(strTrim);
                                if (strM13866 == null) {
                                    c8374.f23126 = z;
                                    break;
                                }
                                c8374.f23122.add(strTrim);
                                c8374.f23121.add(strM13866);
                                c8374.f23127.add(strSubstring3);
                                i6++;
                                z3 = z ? 1 : 0;
                                c2 = '(';
                                c3 = ')';
                                c = TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH;
                                z4 = z2;
                            } else {
                                z = z3;
                                c8374.f23126 = true;
                                if (!c8374.f23125) {
                                    c8374.f23124 = true;
                                }
                            }
                        }
                    }
                    if (!c8374.f23126) {
                        return c2019;
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
                                    if (!str2.isEmpty() && !f23119.contains(str2)) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                        i3--;
                    }
                    return new C2019(i3, iM13865 + 1, strSubstring, c8374);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m13870(int i, String str) {
        while (i >= 0 && Character.isWhitespace(str.charAt(i))) {
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m13871(int i, String str, String str2) {
        int i2;
        int length;
        return i >= 0 && str2.length() + i <= str.length() && str.regionMatches(i, str2, 0, str2.length()) && ((i2 = i + (-1)) < 0 || !Character.isJavaIdentifierPart(str.charAt(i2))) && ((length = str2.length() + i) >= str.length() || !Character.isJavaIdentifierPart(str.charAt(length)));
    }
}
