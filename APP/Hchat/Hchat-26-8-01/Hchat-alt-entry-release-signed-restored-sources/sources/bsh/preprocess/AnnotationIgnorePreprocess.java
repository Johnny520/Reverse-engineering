package bsh.preprocess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationIgnorePreprocess {
    private static final Set<String> BSH_AT_OPERATORS = new HashSet(Arrays.asList("gt", "lt", "lteq", "gteq", "or", "and", "bitwise_and", "bitwise_or", "bitwise_xor", "mod", "pow", "left_shift", "right_shift", "right_unsigned_shift", "and_assign", "or_assign", "xor_assign", "mod_assign", "pow_assign", "left_shift_assign", "right_shift_assign", "right_unsigned_shift_assign"));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AnnotationIgnorePreprocess() {
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
    private static int findMatchingParen(String str, int i9) {
        int length = str.length();
        int i10 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment - 1;
            } else {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '(') {
                    i10++;
                } else if (cCharAt == ')' && i10 - 1 == 0) {
                    return i9;
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
    private static boolean isAliasPart(char c10) {
        return c10 == '_' || Character.isLetterOrDigit(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isInlineWhitespace(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\f';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isTripleQuote(String str, int i9) {
        int i10 = i9 + 2;
        return i10 < str.length() && str.charAt(i9) == '\"' && str.charAt(i9 + 1) == '\"' && str.charAt(i10) == '\"';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int parseAnnotationEnd(String str, int i9) {
        int length = str.length();
        int i10 = i9 + 1;
        if (i10 >= length || !Character.isJavaIdentifierStart(str.charAt(i10))) {
            return -1;
        }
        int i11 = i10;
        while (i11 < length && Character.isJavaIdentifierPart(str.charAt(i11))) {
            i11++;
        }
        if (str.substring(i10, i11).equals("interface")) {
            return -1;
        }
        while (i11 < length && str.charAt(i11) == '.') {
            i11++;
            if (i11 >= length || !Character.isJavaIdentifierStart(str.charAt(i11))) {
                return -1;
            }
            while (i11 < length && Character.isJavaIdentifierPart(str.charAt(i11))) {
                i11++;
            }
        }
        while (i11 < length && isInlineWhitespace(str.charAt(i11))) {
            i11++;
        }
        if (i11 >= length || str.charAt(i11) != '(') {
            return i11;
        }
        int iFindMatchingParen = findMatchingParen(str, i11);
        if (iFindMatchingParen < 0) {
            return -1;
        }
        return iFindMatchingParen + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int parseBshOperatorAlias(String str, int i9) {
        int length = str.length();
        int i10 = i9 + 1;
        if (i10 >= length || !isAliasPart(str.charAt(i10))) {
            return -1;
        }
        int i11 = i10;
        while (i11 < length && isAliasPart(str.charAt(i11))) {
            i11++;
        }
        if (!BSH_AT_OPERATORS.contains(str.substring(i10, i11))) {
            return -1;
        }
        if (i11 >= length || !Character.isJavaIdentifierPart(str.charAt(i11))) {
            return i11;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String rewrite(String str) {
        if (str == null || str.indexOf(64) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i9 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment > i9) {
                sb2.append((CharSequence) str, i9, iSkipLiteralOrComment);
            } else {
                if (str.charAt(i9) != '@') {
                    sb2.append(str.charAt(i9));
                } else {
                    iSkipLiteralOrComment = parseBshOperatorAlias(str, i9);
                    if (iSkipLiteralOrComment > i9) {
                        sb2.append((CharSequence) str, i9, iSkipLiteralOrComment);
                    } else {
                        int annotationEnd = parseAnnotationEnd(str, i9);
                        if (annotationEnd > i9) {
                            while (i9 < annotationEnd) {
                                char cCharAt = str.charAt(i9);
                                if (cCharAt == '\n' || cCharAt == '\r') {
                                    sb2.append(cCharAt);
                                }
                                i9++;
                            }
                            i9 = annotationEnd;
                            while (i9 < length && (str.charAt(i9) == ' ' || str.charAt(i9) == '\t')) {
                                i9++;
                            }
                        } else {
                            sb2.append('@');
                        }
                    }
                }
                i9++;
            }
            i9 = iSkipLiteralOrComment;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int skipLiteralOrComment(String str, int i9) {
        int i10;
        int length = str.length();
        if (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '\"') {
                if (isTripleQuote(str, i9)) {
                    int iFindTripleQuoteEnd = findTripleQuoteEnd(str, i9 + 3);
                    if (iFindTripleQuoteEnd >= 0) {
                        return iFindTripleQuoteEnd + 3;
                    }
                } else {
                    int iFindNormalStringEnd = findNormalStringEnd(str, i9 + 1);
                    if (iFindNormalStringEnd >= 0) {
                        return iFindNormalStringEnd + 1;
                    }
                }
            } else if (cCharAt == '\'') {
                int iFindCharLiteralEnd = findCharLiteralEnd(str, i9 + 1);
                if (iFindCharLiteralEnd >= 0) {
                    return iFindCharLiteralEnd + 1;
                }
            } else if (cCharAt == '/' && (i10 = i9 + 1) < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '/') {
                    int i11 = i9 + 2;
                    while (i11 < length && str.charAt(i11) != '\n' && str.charAt(i11) != '\r') {
                        i11++;
                    }
                    return i11;
                }
                if (cCharAt2 == '*') {
                    int iFindBlockCommentEnd = findBlockCommentEnd(str, i9 + 2);
                    if (iFindBlockCommentEnd >= 0) {
                        return iFindBlockCommentEnd + 2;
                    }
                }
            }
            return length;
        }
        return i9;
    }
}
