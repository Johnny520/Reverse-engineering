package bsh.preprocess;

import java.util.ArrayList;
import java.util.List;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class KtStringTemplate {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private KtStringTemplate() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String escapeForDoubleQuoted(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findBlockCommentEnd(String str, int i9) {
        while (true) {
            int i10 = i9 + 1;
            if (i10 >= str.length()) {
                return -1;
            }
            if (str.charAt(i9) == '*' && str.charAt(i10) == '/') {
                return i9;
            }
            i9 = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findCharLiteralEnd(String str, int i9) {
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '\\') {
                i9++;
            } else {
                if (cCharAt == '\'') {
                    return i9;
                }
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findNormalStringEnd(String str, int i9) {
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '\\') {
                i9++;
            } else if (cCharAt == '\"') {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findTemplateExprEnd(String str, int i9) {
        int i10;
        int length = str.length();
        int i11 = 1;
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '\"') {
                i9 = findNormalStringEnd(str, i9 + 1);
                if (i9 < 0) {
                    return -1;
                }
            } else if (cCharAt == '\'') {
                i9 = findCharLiteralEnd(str, i9 + 1);
                if (i9 < 0) {
                    return -1;
                }
            } else {
                if (cCharAt == '/' && (i10 = i9 + 1) < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '/') {
                        i9 += 2;
                        while (i9 < length) {
                            char cCharAt3 = str.charAt(i9);
                            if (cCharAt3 == '\n' || cCharAt3 == '\r') {
                                break;
                            }
                            i9++;
                        }
                    } else if (cCharAt2 == '*') {
                        int iFindBlockCommentEnd = findBlockCommentEnd(str, i9 + 2);
                        if (iFindBlockCommentEnd < 0) {
                            return -1;
                        }
                        i9 = iFindBlockCommentEnd + 2;
                    }
                }
                if (cCharAt == '{') {
                    i11++;
                } else if (cCharAt == '}' && i11 - 1 == 0) {
                    return i9;
                }
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findTripleQuoteEnd(String str, int i9) {
        while (i9 + 2 < str.length()) {
            if (isTripleQuote(str, i9)) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isEscapedDollar(String str, int i9) {
        int i10 = 0;
        for (int i11 = i9 - 1; i11 >= 0 && str.charAt(i11) == '\\'; i11--) {
            i10++;
        }
        return (i10 & 1) == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isIdentifierPart(char c10) {
        return c10 != '$' && Character.isJavaIdentifierPart(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isIdentifierStart(char c10) {
        return c10 != '$' && Character.isJavaIdentifierStart(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isTripleQuote(String str, int i9) {
        int i10 = i9 + 2;
        return i10 < str.length() && str.charAt(i9) == '\"' && str.charAt(i9 + 1) == '\"' && str.charAt(i10) == '\"';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String joinWithPlus(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (i9 > 0) {
                sb2.append(" + ");
            }
            sb2.append(list.get(i9));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String quoteString(String str, boolean z9) {
        return !z9 ? AbstractC0921a.m2251n("\"", str, "\"") : AbstractC0921a.m2255r(new StringBuilder("\""), escapeForDoubleQuoted(str), "\"");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String rewrite(String str) {
        int i9;
        int i10;
        if (str == null || str.indexOf(36) < 0 || str.indexOf(34) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 32);
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                if (isTripleQuote(str, i11)) {
                    int i12 = i11 + 3;
                    int iFindTripleQuoteEnd = findTripleQuoteEnd(str, i12);
                    if (iFindTripleQuoteEnd < 0) {
                        sb2.append((CharSequence) str, i11, length);
                        break;
                    }
                    sb2.append(rewriteStringLiteral(str.substring(i12, iFindTripleQuoteEnd), true));
                    i11 = iFindTripleQuoteEnd + 3;
                } else {
                    int i13 = i11 + 1;
                    int iFindNormalStringEnd = findNormalStringEnd(str, i13);
                    if (iFindNormalStringEnd < 0) {
                        sb2.append((CharSequence) str, i11, length);
                        break;
                    }
                    sb2.append(rewriteStringLiteral(str.substring(i13, iFindNormalStringEnd), false));
                    i11 = iFindNormalStringEnd + 1;
                }
            } else if (cCharAt == '\'') {
                int iFindCharLiteralEnd = findCharLiteralEnd(str, i11 + 1);
                if (iFindCharLiteralEnd < 0) {
                    sb2.append((CharSequence) str, i11, length);
                    break;
                }
                i9 = iFindCharLiteralEnd + 1;
                sb2.append((CharSequence) str, i11, i9);
                i11 = i9;
            } else {
                if (cCharAt == '/' && (i10 = i11 + 1) < length) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 == '/') {
                        i9 = i11 + 2;
                        while (i9 < length) {
                            char cCharAt3 = str.charAt(i9);
                            if (cCharAt3 == '\n' || cCharAt3 == '\r') {
                                break;
                            }
                            i9++;
                        }
                        sb2.append((CharSequence) str, i11, i9);
                    } else if (cCharAt2 == '*') {
                        int iFindBlockCommentEnd = findBlockCommentEnd(str, i11 + 2);
                        if (iFindBlockCommentEnd < 0) {
                            sb2.append((CharSequence) str, i11, length);
                            break;
                        }
                        i9 = iFindBlockCommentEnd + 2;
                        sb2.append((CharSequence) str, i11, i9);
                    }
                    i11 = i9;
                }
                sb2.append(cCharAt);
                i11++;
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String rewriteStringLiteral(String str, boolean z9) {
        if (str.indexOf(36) < 0) {
            return quoteString(str, z9);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        boolean z10 = false;
        int i10 = 0;
        while (i9 < length) {
            if (str.charAt(i9) == '$' && (z9 || !isEscapedDollar(str, i9))) {
                int i11 = i9 + 1;
                if (i11 < length) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt == '{') {
                        int i12 = i9 + 2;
                        int iFindTemplateExprEnd = findTemplateExprEnd(str, i12);
                        if (iFindTemplateExprEnd >= 0) {
                            String strSubstring = str.substring(i10, i9);
                            if (!strSubstring.isEmpty()) {
                                arrayList.add(quoteString(strSubstring, z9));
                            }
                            arrayList.add("String.valueOf(" + str.substring(i12, iFindTemplateExprEnd).trim() + ")");
                            i10 = iFindTemplateExprEnd + 1;
                            i9 = i10;
                            z10 = true;
                        }
                    } else if (isIdentifierStart(cCharAt)) {
                        int i13 = i9 + 2;
                        while (i13 < length && isIdentifierPart(str.charAt(i13))) {
                            i13++;
                        }
                        String strSubstring2 = str.substring(i10, i9);
                        if (!strSubstring2.isEmpty()) {
                            arrayList.add(quoteString(strSubstring2, z9));
                        }
                        arrayList.add("String.valueOf(" + str.substring(i11, i13) + ")");
                        i9 = i13;
                        i10 = i9;
                        z10 = true;
                    }
                }
                i9 = i11;
            } else {
                i9++;
            }
        }
        if (!z10) {
            return quoteString(str, z9);
        }
        String strSubstring3 = str.substring(i10);
        if (!strSubstring3.isEmpty()) {
            arrayList.add(quoteString(strSubstring3, z9));
        }
        return arrayList.isEmpty() ? "\"\"" : AbstractC0921a.m2255r(new StringBuilder("("), joinWithPlus(arrayList), ")");
    }
}
