package p337x4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: x4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9442c {
    /* JADX INFO: renamed from: a */
    public static String m36773a(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                sb2.append("\\f");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        sb2.append(cCharAt);
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static int m36774b(String str, int i10) {
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= str.length()) {
                return -1;
            }
            if (str.charAt(i10) == '*' && str.charAt(i11) == '/') {
                return i10;
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m36775c(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\') {
                i10++;
            } else {
                if (cCharAt == '\'') {
                    return i10;
                }
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m36776d(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\') {
                i10++;
            } else if (cCharAt == '\"') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m36777e(String str, int i10) {
        int i11;
        int length = str.length();
        int i12 = 1;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"') {
                i10 = m36776d(str, i10 + 1);
                if (i10 < 0) {
                    return -1;
                }
            } else if (cCharAt == '\'') {
                i10 = m36775c(str, i10 + 1);
                if (i10 < 0) {
                    return -1;
                }
            } else {
                if (cCharAt == '/' && (i11 = i10 + 1) < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 == '/') {
                        i10 += 2;
                        while (i10 < length) {
                            char cCharAt3 = str.charAt(i10);
                            if (cCharAt3 == '\n' || cCharAt3 == '\r') {
                                break;
                            }
                            i10++;
                        }
                    } else if (cCharAt2 == '*') {
                        int iM36774b = m36774b(str, i10 + 2);
                        if (iM36774b < 0) {
                            return -1;
                        }
                        i10 = iM36774b + 2;
                    }
                }
                if (cCharAt == '{') {
                    i12++;
                } else if (cCharAt == '}' && i12 - 1 == 0) {
                    return i10;
                }
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static int m36778f(String str, int i10) {
        while (i10 + 2 < str.length()) {
            if (m36782j(str, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m36779g(String str, int i10) {
        int i11 = 0;
        for (int i12 = i10 - 1; i12 >= 0 && str.charAt(i12) == '\\'; i12--) {
            i11++;
        }
        return (i11 & 1) == 1;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m36780h(char c10) {
        return c10 != '$' && Character.isJavaIdentifierPart(c10);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m36781i(char c10) {
        return c10 != '$' && Character.isJavaIdentifierStart(c10);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m36782j(String str, int i10) {
        int i11 = i10 + 2;
        return i11 < str.length() && str.charAt(i10) == '\"' && str.charAt(i10 + 1) == '\"' && str.charAt(i11) == '\"';
    }

    /* JADX INFO: renamed from: k */
    public static String m36783k(List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                sb2.append(" + ");
            }
            sb2.append((String) list.get(i10));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m36784l(String str, boolean z10) {
        if (z10) {
            return "\"" + m36773a(str) + "\"";
        }
        return "\"" + str + "\"";
    }

    /* JADX INFO: renamed from: m */
    public static String m36785m(String str) {
        int i10;
        int i11;
        if (str == null || str.indexOf(36) < 0 || str.indexOf(34) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 32);
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\"') {
                if (m36782j(str, i12)) {
                    int i13 = i12 + 3;
                    int iM36778f = m36778f(str, i13);
                    if (iM36778f < 0) {
                        sb2.append((CharSequence) str, i12, length);
                        break;
                    }
                    sb2.append(m36786n(str.substring(i13, iM36778f), true));
                    i12 = iM36778f + 3;
                } else {
                    int i14 = i12 + 1;
                    int iM36776d = m36776d(str, i14);
                    if (iM36776d < 0) {
                        sb2.append((CharSequence) str, i12, length);
                        break;
                    }
                    sb2.append(m36786n(str.substring(i14, iM36776d), false));
                    i12 = iM36776d + 1;
                }
            } else if (cCharAt == '\'') {
                int iM36775c = m36775c(str, i12 + 1);
                if (iM36775c < 0) {
                    sb2.append((CharSequence) str, i12, length);
                    break;
                }
                i10 = iM36775c + 1;
                sb2.append((CharSequence) str, i12, i10);
                i12 = i10;
            } else {
                if (cCharAt == '/' && (i11 = i12 + 1) < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 == '/') {
                        i10 = i12 + 2;
                        while (i10 < length) {
                            char cCharAt3 = str.charAt(i10);
                            if (cCharAt3 == '\n' || cCharAt3 == '\r') {
                                break;
                            }
                            i10++;
                        }
                        sb2.append((CharSequence) str, i12, i10);
                    } else if (cCharAt2 == '*') {
                        int iM36774b = m36774b(str, i12 + 2);
                        if (iM36774b < 0) {
                            sb2.append((CharSequence) str, i12, length);
                            break;
                        }
                        i10 = iM36774b + 2;
                        sb2.append((CharSequence) str, i12, i10);
                    }
                    i12 = i10;
                }
                sb2.append(cCharAt);
                i12++;
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m36786n(String str, boolean z10) {
        if (str.indexOf(36) < 0) {
            return m36784l(str, z10);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z11 = false;
        int i11 = 0;
        while (i10 < length) {
            if (str.charAt(i10) == '$' && (z10 || !m36779g(str, i10))) {
                int i12 = i10 + 1;
                if (i12 < length) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt == '{') {
                        int i13 = i10 + 2;
                        int iM36777e = m36777e(str, i13);
                        if (iM36777e >= 0) {
                            String strSubstring = str.substring(i11, i10);
                            if (!strSubstring.isEmpty()) {
                                arrayList.add(m36784l(strSubstring, z10));
                            }
                            arrayList.add("String.valueOf(" + str.substring(i13, iM36777e).trim() + ")");
                            i11 = iM36777e + 1;
                            i10 = i11;
                            z11 = true;
                        }
                    } else if (m36781i(cCharAt)) {
                        int i14 = i10 + 2;
                        while (i14 < length && m36780h(str.charAt(i14))) {
                            i14++;
                        }
                        String strSubstring2 = str.substring(i11, i10);
                        if (!strSubstring2.isEmpty()) {
                            arrayList.add(m36784l(strSubstring2, z10));
                        }
                        arrayList.add("String.valueOf(" + str.substring(i12, i14) + ")");
                        i10 = i14;
                        i11 = i10;
                        z11 = true;
                    }
                }
                i10 = i12;
            } else {
                i10++;
            }
        }
        if (!z11) {
            return m36784l(str, z10);
        }
        String strSubstring3 = str.substring(i11);
        if (!strSubstring3.isEmpty()) {
            arrayList.add(m36784l(strSubstring3, z10));
        }
        return arrayList.isEmpty() ? "\"\"" : m36783k(arrayList);
    }
}
