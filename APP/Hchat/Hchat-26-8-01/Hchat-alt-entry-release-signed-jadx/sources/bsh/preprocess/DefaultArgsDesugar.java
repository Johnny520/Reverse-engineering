package bsh.preprocess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultArgsDesugar {
    private static final Set<String> CONTROL_KEYWORDS = new HashSet(Arrays.asList("if", "for", "while", "switch", "catch", "synchronized", "new", "return", "throw", "assert", "case", "do", "try"));
    private static final Set<String> METHOD_MODIFIERS = new HashSet(Arrays.asList("public", "protected", "private", "static", "final", "synchronized", "native", "abstract", "strictfp", "default"));

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class MethodRewrite {
        final int declEndExclusive;
        final int declStart;
        final String rewritten;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public MethodRewrite(int i9, int i10, String str) {
            this.declStart = i9;
            this.declEndExclusive = i10;
            this.rewritten = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class MethodShape {
        final int declEndExclusive;
        final int declStart;
        final String methodName;
        final ParsedParams parsed;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public MethodShape(int i9, int i10, String str, ParsedParams parsedParams) {
            this.declStart = i9;
            this.declEndExclusive = i10;
            this.methodName = str;
            this.parsed = parsedParams;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DefaultArgsDesugar() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String buildBridgeArgs(ParsedParams parsedParams, int i9) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i9; i10++) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(parsedParams.paramNames.get(i10));
        }
        while (i9 < parsedParams.paramDeclNoDefault.size()) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(parsedParams.defaultExpr.get(i9));
            i9++;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x003d */
    private static String buildRewrittenMethod(String str, String str2, String str3, String str4, ParsedParams parsedParams, Set<String> set) {
        StringBuilder sb2 = new StringBuilder(str4.length() + str.length() + 128);
        sb2.append(str);
        sb2.append('(');
        List<String> list = parsedParams.paramDeclNoDefault;
        sb2.append(join(list, 0, list.size()));
        sb2.append(')');
        sb2.append(str3);
        sb2.append(str4);
        boolean zShouldBridgeReturn = shouldBridgeReturn(str, str2);
        int size = parsedParams.paramDeclNoDefault.size();
        while (true) {
            size--;
            if (size < parsedParams.requiredCount) {
                return sb2.toString();
            }
            String strMethodSignatureKey = methodSignatureKey(str2, parsedParams.paramDeclNoDefault, size);
            if (!set.contains(strMethodSignatureKey)) {
                sb2.append('\n');
                sb2.append(str);
                sb2.append('(');
                sb2.append(join(parsedParams.paramDeclNoDefault, 0, size));
                sb2.append(')');
                sb2.append(str3);
                sb2.append('{');
                if (zShouldBridgeReturn) {
                    sb2.append("return ");
                }
                sb2.append(str2);
                sb2.append('(');
                sb2.append(buildBridgeArgs(parsedParams, size));
                sb2.append(");}");
                set.add(strMethodSignatureKey);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Set<String> collectDeclaredMethodSignatures(String str) {
        MethodShape methodShapeTryParseMethodShape;
        HashSet hashSet = new HashSet();
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment;
            } else if (str.charAt(i9) == '(' && (methodShapeTryParseMethodShape = tryParseMethodShape(str, i9)) != null) {
                String str2 = methodShapeTryParseMethodShape.methodName;
                List<String> list = methodShapeTryParseMethodShape.parsed.paramDeclNoDefault;
                hashSet.add(methodSignatureKey(str2, list, list.size()));
                i9 = methodShapeTryParseMethodShape.declEndExclusive;
            } else {
                i9++;
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String extractParamName(String str) {
        int iSkipWsBackward = skipWsBackward(str, str.length() - 1);
        if (iSkipWsBackward < 0) {
            return null;
        }
        while (iSkipWsBackward >= 1 && str.charAt(iSkipWsBackward) == ']' && str.charAt(iSkipWsBackward - 1) == '[') {
            iSkipWsBackward = skipWsBackward(str, iSkipWsBackward - 2);
        }
        if (iSkipWsBackward < 0) {
            return null;
        }
        int i9 = iSkipWsBackward + 1;
        while (iSkipWsBackward >= 0 && Character.isJavaIdentifierPart(str.charAt(iSkipWsBackward))) {
            iSkipWsBackward--;
        }
        int i10 = iSkipWsBackward + 1;
        if (i10 >= i9) {
            return null;
        }
        String strSubstring = str.substring(i10, i9);
        if (Character.isJavaIdentifierStart(strSubstring.charAt(0))) {
            return strSubstring;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findDeclarationStart(String str, int i9) {
        while (i9 > 0) {
            char cCharAt = str.charAt(i9 - 1);
            if (cCharAt == ';' || cCharAt == '{' || cCharAt == '}') {
                break;
            }
            if (cCharAt == '\n' || cCharAt == '\r') {
                int i10 = i9;
                while (i10 > 0) {
                    char cCharAt2 = str.charAt(i10 - 1);
                    if (cCharAt2 == '\n' || cCharAt2 == '\r') {
                        break;
                    }
                    i10--;
                }
                String strTrim = str.substring(i10, i9).trim();
                if (strTrim.isEmpty() || (!strTrim.startsWith("@") && !isModifierOnlyLine(strTrim))) {
                    break;
                }
            }
            i9--;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findMatching(String str, int i9, char c10, char c11) {
        int length = str.length();
        int i10 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment - 1;
            } else {
                char cCharAt = str.charAt(i9);
                if (cCharAt == c10) {
                    i10++;
                } else if (cCharAt == c11 && i10 - 1 == 0) {
                    return i9;
                }
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findMethodBodyStart(String str, int i9) {
        int iSkipWsAndCommentsForward = skipWsAndCommentsForward(str, i9);
        if (iSkipWsAndCommentsForward >= str.length()) {
            return -1;
        }
        if (startsWithWord(str, iSkipWsAndCommentsForward, "throws")) {
            int iSkipThrowsClause = skipThrowsClause(str, iSkipWsAndCommentsForward);
            if (iSkipThrowsClause < 0) {
                return -1;
            }
            iSkipWsAndCommentsForward = skipWsAndCommentsForward(str, iSkipThrowsClause);
        }
        if (iSkipWsAndCommentsForward >= str.length() || str.charAt(iSkipWsAndCommentsForward) != '{') {
            return -1;
        }
        return iSkipWsAndCommentsForward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findTopLevelAssign(String str) {
        int length = str.length();
        int i9 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment;
            } else {
                char cCharAt = str.charAt(i9);
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
                    char cCharAt2 = i9 > 0 ? str.charAt(i9 - 1) : (char) 0;
                    int i10 = i9 + 1;
                    char cCharAt3 = i10 < length ? str.charAt(i10) : (char) 0;
                    if (cCharAt2 != '=' && cCharAt2 != '!' && cCharAt2 != '<' && cCharAt2 != '>' && cCharAt3 != '=') {
                        return i9;
                    }
                    i9 = i10;
                }
                i9++;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findTrailingNameIndex(String str, String str2) {
        int iSkipWsBackward = skipWsBackward(str, str.length() - 1);
        while (iSkipWsBackward >= 1 && str.charAt(iSkipWsBackward) == ']' && str.charAt(iSkipWsBackward - 1) == '[') {
            iSkipWsBackward = skipWsBackward(str, iSkipWsBackward - 2);
        }
        if (iSkipWsBackward < 0) {
            return -1;
        }
        int i9 = iSkipWsBackward + 1;
        while (iSkipWsBackward >= 0 && Character.isJavaIdentifierPart(str.charAt(iSkipWsBackward))) {
            iSkipWsBackward--;
        }
        int i10 = iSkipWsBackward + 1;
        if (i10 < i9 && str2.equals(str.substring(i10, i9))) {
            return i10;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isModifierOnlyLine(String str) {
        if (str.startsWith("//") || str.startsWith("/*") || str.startsWith("*")) {
            return false;
        }
        String[] strArrSplit = str.split("\\s+");
        if (strArrSplit.length == 0) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty() && !METHOD_MODIFIERS.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String join(List<String> list, int i9, int i10) {
        if (i9 >= i10) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = i9; i11 < i10; i11++) {
            if (i11 > i9) {
                sb2.append(", ");
            }
            sb2.append(list.get(i11));
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String methodSignatureKey(String str, List<String> list, int i9) {
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append(str);
        sb2.append('(');
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(signatureTypeKey(list.get(i10)));
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String normalizeTypeKey(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        int iSkipAnnotation = 0;
        while (iSkipAnnotation < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, iSkipAnnotation);
            if (iSkipLiteralOrComment > iSkipAnnotation) {
                iSkipAnnotation = iSkipLiteralOrComment;
            } else {
                char cCharAt = str.charAt(iSkipAnnotation);
                if (!Character.isWhitespace(cCharAt)) {
                    if (cCharAt == '@') {
                        iSkipAnnotation = skipAnnotation(str, iSkipAnnotation + 1);
                    } else if (startsWithWord(str, iSkipAnnotation, "final")) {
                        iSkipAnnotation += 5;
                    } else {
                        sb2.append(cCharAt);
                    }
                }
                iSkipAnnotation++;
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ParsedParams parseParams(String str) {
        ParsedParams parsedParams = new ParsedParams(0);
        parsedParams.trailingDefaults = true;
        if (str.trim().isEmpty()) {
            parsedParams.valid = true;
            return parsedParams;
        }
        List<String> listSplitTopLevel = splitTopLevel(str, ',');
        boolean z9 = false;
        for (int i9 = 0; i9 < listSplitTopLevel.size(); i9++) {
            String strTrim = listSplitTopLevel.get(i9).trim();
            if (strTrim.isEmpty()) {
                parsedParams.valid = false;
                return parsedParams;
            }
            int iFindTopLevelAssign = findTopLevelAssign(strTrim);
            String strTrim2 = (iFindTopLevelAssign >= 0 ? strTrim.substring(0, iFindTopLevelAssign) : strTrim).trim();
            String strSubstring = iFindTopLevelAssign >= 0 ? strTrim.substring(iFindTopLevelAssign + 1) : null;
            if (strSubstring != null) {
                strSubstring = strSubstring.trim();
                if (strSubstring.isEmpty()) {
                    parsedParams.valid = false;
                    return parsedParams;
                }
                parsedParams.hasDefault = true;
                z9 = true;
            } else if (z9) {
                parsedParams.trailingDefaults = false;
            } else {
                parsedParams.requiredCount++;
            }
            String strExtractParamName = extractParamName(strTrim2);
            if (strExtractParamName == null) {
                parsedParams.valid = false;
                return parsedParams;
            }
            parsedParams.paramDeclNoDefault.add(strTrim2);
            parsedParams.paramNames.add(strExtractParamName);
            parsedParams.defaultExpr.add(strSubstring);
        }
        parsedParams.valid = true;
        if (!parsedParams.hasDefault) {
            parsedParams.trailingDefaults = true;
        }
        return parsedParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String rewrite(String str) {
        MethodRewrite methodRewriteTryRewriteMethod;
        if (str == null || str.indexOf(61) < 0 || str.indexOf(40) < 0) {
            return str;
        }
        Set<String> setCollectDeclaredMethodSignatures = collectDeclaredMethodSignatures(str);
        StringBuilder sb2 = new StringBuilder(str.length() + 128);
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment;
            } else if (str.charAt(i9) == '(' && (methodRewriteTryRewriteMethod = tryRewriteMethod(str, i9, setCollectDeclaredMethodSignatures)) != null) {
                sb2.append((CharSequence) str, i10, methodRewriteTryRewriteMethod.declStart);
                sb2.append(methodRewriteTryRewriteMethod.rewritten);
                i10 = methodRewriteTryRewriteMethod.declEndExclusive;
                i9 = i10;
            } else {
                i9++;
            }
        }
        sb2.append((CharSequence) str, i10, length);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean shouldBridgeReturn(String str, String str2) {
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
            if (!str4.startsWith("@") && !METHOD_MODIFIERS.contains(str4)) {
                str3 = str4;
            }
        }
        if (str3 == null) {
            return false;
        }
        return !"void".equals(str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String signatureTypeKey(String str) {
        String strExtractParamName = extractParamName(str);
        if (strExtractParamName == null) {
            return normalizeTypeKey(str);
        }
        int iFindTrailingNameIndex = findTrailingNameIndex(str, strExtractParamName);
        return iFindTrailingNameIndex < 0 ? normalizeTypeKey(str) : normalizeTypeKey(str.substring(0, iFindTrailingNameIndex).concat(str.substring(strExtractParamName.length() + iFindTrailingNameIndex)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int skipAnnotation(String str, int i9) {
        int length = str.length();
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (!Character.isJavaIdentifierPart(cCharAt) && cCharAt != '.') {
                break;
            }
            i9++;
        }
        int iSkipWsAndCommentsForward = skipWsAndCommentsForward(str, i9);
        if (iSkipWsAndCommentsForward >= length || str.charAt(iSkipWsAndCommentsForward) != '(') {
            return iSkipWsAndCommentsForward;
        }
        int iFindMatching = findMatching(str, iSkipWsAndCommentsForward, '(', ')');
        return iFindMatching < 0 ? length : iFindMatching + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int skipLiteralOrComment(String str, int i9) {
        int i10;
        char cCharAt;
        char cCharAt2;
        int length = str.length();
        if (i9 >= 0 && i9 < length) {
            if (startsWith(str, i9, "\"\"\"")) {
                int iIndexOf = str.indexOf("\"\"\"", i9 + 3);
                if (iIndexOf >= 0) {
                    return iIndexOf + 3;
                }
            } else {
                char cCharAt3 = str.charAt(i9);
                if (cCharAt3 == '\"') {
                    do {
                        i9++;
                        while (i9 < length) {
                            cCharAt2 = str.charAt(i9);
                            if (cCharAt2 == '\\') {
                                i9 += 2;
                            }
                        }
                    } while (cCharAt2 != '\"');
                    return i9 + 1;
                }
                if (cCharAt3 == '\'') {
                    do {
                        i9++;
                        while (i9 < length) {
                            cCharAt = str.charAt(i9);
                            if (cCharAt == '\\') {
                                i9 += 2;
                            }
                        }
                    } while (cCharAt != '\'');
                    return i9 + 1;
                }
                if (cCharAt3 == '/' && (i10 = i9 + 1) < length) {
                    char cCharAt4 = str.charAt(i10);
                    if (cCharAt4 == '/') {
                        int i11 = i9 + 2;
                        while (i11 < length) {
                            char cCharAt5 = str.charAt(i11);
                            if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                                break;
                            }
                            i11++;
                        }
                        return i11;
                    }
                    if (cCharAt4 == '*') {
                        int iIndexOf2 = str.indexOf("*/", i9 + 2);
                        if (iIndexOf2 >= 0) {
                            return iIndexOf2 + 2;
                        }
                    }
                }
            }
            return length;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        if (r4 != ',') goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int skipThrowsClause(String str, int i9) {
        int iSkipWsAndCommentsForward = skipWsAndCommentsForward(str, i9);
        if (!startsWithWord(str, iSkipWsAndCommentsForward, "throws")) {
            return iSkipWsAndCommentsForward;
        }
        int iSkipWsAndCommentsForward2 = iSkipWsAndCommentsForward + 6;
        int length = str.length();
        loop0: while (true) {
            boolean z9 = true;
            while (true) {
                if (iSkipWsAndCommentsForward2 < length && (iSkipWsAndCommentsForward2 = skipWsAndCommentsForward(str, iSkipWsAndCommentsForward2)) < length) {
                    char cCharAt = str.charAt(iSkipWsAndCommentsForward2);
                    if (cCharAt != '{') {
                        if (cCharAt != ';') {
                            if (!z9) {
                                break;
                            }
                            if (!Character.isJavaIdentifierStart(cCharAt)) {
                                return -1;
                            }
                            while (true) {
                                iSkipWsAndCommentsForward2++;
                                if (iSkipWsAndCommentsForward2 < length) {
                                    char cCharAt2 = str.charAt(iSkipWsAndCommentsForward2);
                                    if (Character.isJavaIdentifierPart(cCharAt2) || cCharAt2 == '.' || cCharAt2 == '$') {
                                    }
                                }
                            }
                            z9 = false;
                        } else {
                            return -1;
                        }
                    } else {
                        if (z9) {
                            return -1;
                        }
                        return iSkipWsAndCommentsForward2;
                    }
                } else {
                    return -1;
                }
            }
            iSkipWsAndCommentsForward2++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int skipWsAndCommentsForward(String str, int i9) {
        int length = str.length();
        while (i9 < length) {
            while (i9 < length && Character.isWhitespace(str.charAt(i9))) {
                i9++;
            }
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment <= i9 || i9 + 1 >= length || str.charAt(i9) != '/') {
                break;
            }
            i9 = iSkipLiteralOrComment;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int skipWsBackward(String str, int i9) {
        while (i9 >= 0 && Character.isWhitespace(str.charAt(i9))) {
            i9--;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static List<String> splitTopLevel(String str, char c10) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment;
            } else {
                char cCharAt = str.charAt(i9);
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
                    arrayList.add(str.substring(i10, i9));
                    i10 = i9 + 1;
                }
                i9++;
            }
        }
        arrayList.add(str.substring(i10));
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean startsWith(String str, int i9, String str2) {
        return i9 >= 0 && str2.length() + i9 <= str.length() && str.regionMatches(i9, str2, 0, str2.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean startsWithWord(String str, int i9, String str2) {
        if (i9 < 0 || str2.length() + i9 > str.length() || !str.regionMatches(i9, str2, 0, str2.length())) {
            return false;
        }
        int i10 = i9 - 1;
        if (i10 >= 0 && Character.isJavaIdentifierPart(str.charAt(i10))) {
            return false;
        }
        int length = str2.length() + i9;
        return length >= str.length() || !Character.isJavaIdentifierPart(str.charAt(length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static MethodShape tryParseMethodShape(String str, int i9) {
        int iFindMatching;
        int iFindMethodBodyStart;
        int iFindMatching2;
        char cCharAt;
        int iSkipWsBackward = skipWsBackward(str, i9 - 1) + 1;
        int i10 = iSkipWsBackward;
        while (i10 > 0 && Character.isJavaIdentifierPart(str.charAt(i10 - 1))) {
            i10--;
        }
        if (i10 >= iSkipWsBackward) {
            return null;
        }
        String strSubstring = str.substring(i10, iSkipWsBackward);
        if (!Character.isJavaIdentifierStart(strSubstring.charAt(0)) || CONTROL_KEYWORDS.contains(strSubstring)) {
            return null;
        }
        int iSkipWsBackward2 = skipWsBackward(str, i10 - 1);
        if ((iSkipWsBackward2 >= 0 && ((cCharAt = str.charAt(iSkipWsBackward2)) == '.' || cCharAt == ':' || cCharAt == '$')) || (iFindMatching = findMatching(str, i9, '(', ')')) < 0) {
            return null;
        }
        int i11 = iFindMatching + 1;
        int iSkipWsAndCommentsForward = skipWsAndCommentsForward(str, i11);
        if ((iSkipWsAndCommentsForward < str.length() && str.startsWith("->", iSkipWsAndCommentsForward)) || (iFindMethodBodyStart = findMethodBodyStart(str, i11)) < 0 || (iFindMatching2 = findMatching(str, iFindMethodBodyStart, '{', '}')) < 0) {
            return null;
        }
        ParsedParams params = parseParams(str.substring(i9 + 1, iFindMatching));
        if (params.valid) {
            return new MethodShape(findDeclarationStart(str, i10), iFindMatching2 + 1, strSubstring, params);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static MethodRewrite tryRewriteMethod(String str, int i9, Set<String> set) {
        MethodShape methodShapeTryParseMethodShape = tryParseMethodShape(str, i9);
        if (methodShapeTryParseMethodShape == null) {
            return null;
        }
        ParsedParams parsedParams = methodShapeTryParseMethodShape.parsed;
        if (!parsedParams.valid || !parsedParams.hasDefault || !parsedParams.trailingDefaults) {
            return null;
        }
        int i10 = methodShapeTryParseMethodShape.declStart;
        int iFindMatching = findMatching(str, i9, '(', ')');
        String strSubstring = str.substring(i10, i9);
        int i11 = iFindMatching + 1;
        int iFindMethodBodyStart = findMethodBodyStart(str, i11);
        if (iFindMethodBodyStart < 0) {
            return null;
        }
        String strSubstring2 = str.substring(i11, iFindMethodBodyStart);
        int iFindMatching2 = findMatching(str, iFindMethodBodyStart, '{', '}') + 1;
        return new MethodRewrite(i10, iFindMatching2, buildRewrittenMethod(strSubstring, methodShapeTryParseMethodShape.methodName, strSubstring2, str.substring(iFindMethodBodyStart, iFindMatching2), parsedParams, set));
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ParsedParams {
        final List<String> defaultExpr;
        boolean hasDefault;
        final List<String> paramDeclNoDefault;
        final List<String> paramNames;
        int requiredCount;
        boolean trailingDefaults;
        boolean valid;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private ParsedParams() {
            this.paramDeclNoDefault = new ArrayList();
            this.paramNames = new ArrayList();
            this.defaultExpr = new ArrayList();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:26) call: bsh.preprocess.DefaultArgsDesugar.ParsedParams.<init>():void type: THIS */
        public /* synthetic */ ParsedParams(int i9) {
            this();
        }
    }
}
