package bsh.preprocess;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ImplicitDefaultConstructorPreprocess {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ImplicitDefaultConstructorPreprocess() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findCharEnd(String str, int i9, int i10) {
        while (i9 < i10) {
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
    private static int findClassBodyStart(String str, int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i9 < i10) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9, i10);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment - 1;
            } else {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '(') {
                    i11++;
                } else if (cCharAt != ')') {
                    if (cCharAt == '<') {
                        i12++;
                    } else if (cCharAt != '>') {
                        if (cCharAt == '[') {
                            i13++;
                        } else if (cCharAt != ']') {
                            if (cCharAt == '{' && i12 == 0 && i11 == 0 && i13 == 0) {
                                return i9;
                            }
                        } else if (i13 > 0) {
                            i13--;
                        }
                    } else if (i12 > 0) {
                        i12--;
                    }
                } else if (i11 > 0) {
                    i11--;
                }
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findMatching(String str, int i9, int i10, char c10, char c11) {
        int i11 = 0;
        while (i9 < i10) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9, i10);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment - 1;
            } else {
                char cCharAt = str.charAt(i9);
                if (cCharAt == c10) {
                    i11++;
                } else if (cCharAt == c11 && i11 - 1 == 0) {
                    return i9;
                }
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int findStringEnd(String str, int i9, int i10) {
        while (i9 < i10) {
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
    private static int findTripleQuoteEnd(String str, int i9, int i10) {
        while (true) {
            int i11 = i9 + 2;
            if (i11 >= i10) {
                return -1;
            }
            if (str.charAt(i9) == '\"' && str.charAt(i9 + 1) == '\"' && str.charAt(i11) == '\"') {
                return i9;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasTopLevelConstructor(String str, String str2) {
        int iSkipWsAndCommentsForward;
        int iFindMatching;
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9, length);
            if (iSkipLiteralOrComment <= i9) {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '{') {
                    i10++;
                } else if (cCharAt == '}') {
                    if (i10 > 0) {
                        i10--;
                    }
                } else if (i10 == 0 && Character.isJavaIdentifierStart(cCharAt)) {
                    iSkipLiteralOrComment = i9 + 1;
                    while (iSkipLiteralOrComment < length && Character.isJavaIdentifierPart(str.charAt(iSkipLiteralOrComment))) {
                        iSkipLiteralOrComment++;
                    }
                    if (str2.equals(str.substring(i9, iSkipLiteralOrComment)) && (iSkipWsAndCommentsForward = skipWsAndCommentsForward(str, iSkipLiteralOrComment, length)) < length && str.charAt(iSkipWsAndCommentsForward) == '(' && (iFindMatching = findMatching(str, iSkipWsAndCommentsForward, length, '(', ')')) >= 0) {
                        int iSkipWsAndCommentsForward2 = skipWsAndCommentsForward(str, iFindMatching + 1, length);
                        if (isKeywordAt(str, iSkipWsAndCommentsForward2, length, "throws")) {
                            iSkipWsAndCommentsForward2 = skipThrowsClause(str, iSkipWsAndCommentsForward2 + 6, length);
                        }
                        int iSkipWsAndCommentsForward3 = skipWsAndCommentsForward(str, iSkipWsAndCommentsForward2, length);
                        if (iSkipWsAndCommentsForward3 < length && str.charAt(iSkipWsAndCommentsForward3) == '{') {
                            return true;
                        }
                    }
                }
                i9++;
            }
            i9 = iSkipLiteralOrComment;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isKeywordAt(String str, int i9, int i10, String str2) {
        int i11;
        int length = str2.length();
        if (i9 < 0 || (i11 = i9 + length) > i10 || !str.regionMatches(i9, str2, 0, length)) {
            return false;
        }
        if (i9 > 0) {
            char cCharAt = str.charAt(i9 - 1);
            if (Character.isJavaIdentifierPart(cCharAt) || cCharAt == '.' || cCharAt == '$') {
                return false;
            }
        }
        return i11 >= i10 || !Character.isJavaIdentifierPart(str.charAt(i11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isTripleQuote(String str, int i9, int i10) {
        int i11 = i9 + 2;
        return i11 < i10 && str.charAt(i9) == '\"' && str.charAt(i9 + 1) == '\"' && str.charAt(i11) == '\"';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String rewrite(String str) {
        return (str == null || str.indexOf("class") < 0) ? str : rewriteSegment(str, 0, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String rewriteSegment(String str, int i9, int i10) {
        int iSkipWsAndCommentsForward;
        int iFindMatching;
        StringBuilder sb2 = new StringBuilder((i10 - i9) + 64);
        int i11 = i9;
        while (i9 < i10) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9, i10);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment;
            } else if (isKeywordAt(str, i9, i10, "class") && (iSkipWsAndCommentsForward = skipWsAndCommentsForward(str, i9 + 5, i10)) < i10 && Character.isJavaIdentifierStart(str.charAt(iSkipWsAndCommentsForward))) {
                i9 = iSkipWsAndCommentsForward + 1;
                while (i9 < i10 && Character.isJavaIdentifierPart(str.charAt(i9))) {
                    i9++;
                }
                String strSubstring = str.substring(iSkipWsAndCommentsForward, i9);
                int iFindClassBodyStart = findClassBodyStart(str, i9, i10);
                if (iFindClassBodyStart >= 0 && (iFindMatching = findMatching(str, iFindClassBodyStart, i10, '{', '}')) >= 0) {
                    int i12 = iFindClassBodyStart + 1;
                    String strSubstring2 = str.substring(i12, iFindMatching);
                    String strRewriteSegment = rewriteSegment(strSubstring2, 0, strSubstring2.length());
                    boolean zHasTopLevelConstructor = hasTopLevelConstructor(strSubstring2, strSubstring);
                    sb2.append((CharSequence) str, i11, i12);
                    if (!zHasTopLevelConstructor) {
                        sb2.append(' ');
                        sb2.append(strSubstring);
                        sb2.append("(){}");
                    }
                    sb2.append(strRewriteSegment);
                    sb2.append('}');
                    i11 = iFindMatching + 1;
                    i9 = i11;
                }
            } else {
                i9++;
            }
        }
        sb2.append((CharSequence) str, i11, i10);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int skipLiteralOrComment(String str, int i9, int i10) {
        int i11;
        if (i9 < i10) {
            char cCharAt = str.charAt(i9);
            if (cCharAt != '\"') {
                if (cCharAt != '\'') {
                    if (cCharAt == '/' && (i11 = i9 + 1) < i10) {
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 != '/') {
                            if (cCharAt2 == '*') {
                                int i12 = i9 + 2;
                                while (true) {
                                    int i13 = i12 + 1;
                                    if (i13 >= i10) {
                                        break;
                                    }
                                    if (str.charAt(i12) == '*' && str.charAt(i13) == '/') {
                                        return i12 + 2;
                                    }
                                    i12 = i13;
                                }
                            }
                        } else {
                            int i14 = i9 + 2;
                            while (i14 < i10 && str.charAt(i14) != '\n' && str.charAt(i14) != '\r') {
                                i14++;
                            }
                            return i14;
                        }
                    }
                } else {
                    int iFindCharEnd = findCharEnd(str, i9 + 1, i10);
                    if (iFindCharEnd >= 0) {
                        return iFindCharEnd + 1;
                    }
                }
            } else if (isTripleQuote(str, i9, i10)) {
                int iFindTripleQuoteEnd = findTripleQuoteEnd(str, i9 + 3, i10);
                if (iFindTripleQuoteEnd >= 0) {
                    return iFindTripleQuoteEnd + 3;
                }
            } else {
                int iFindStringEnd = findStringEnd(str, i9 + 1, i10);
                if (iFindStringEnd >= 0) {
                    return iFindStringEnd + 1;
                }
            }
            return i10;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int skipThrowsClause(String str, int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i9 < i10) {
            int iSkipLiteralOrComment = skipLiteralOrComment(str, i9, i10);
            if (iSkipLiteralOrComment > i9) {
                i9 = iSkipLiteralOrComment;
            } else {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '(') {
                    i11++;
                } else if (cCharAt != ')') {
                    if (cCharAt == ';') {
                        if (i12 == 0 && i11 == 0 && i13 == 0) {
                            break;
                        }
                    } else if (cCharAt == '<') {
                        i12++;
                    } else if (cCharAt != '>') {
                        if (cCharAt == '[') {
                            i13++;
                        } else if (cCharAt != ']') {
                            if (cCharAt == '{') {
                            }
                        } else if (i13 > 0) {
                            i13--;
                        }
                    } else if (i12 > 0) {
                        i12--;
                    }
                } else if (i11 > 0) {
                    i11--;
                }
                i9++;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int skipWsAndCommentsForward(String str, int i9, int i10) {
        while (i9 < i10) {
            if (!Character.isWhitespace(str.charAt(i9))) {
                int iSkipLiteralOrComment = skipLiteralOrComment(str, i9, i10);
                if (iSkipLiteralOrComment <= i9) {
                    break;
                }
                i9 = iSkipLiteralOrComment;
            } else {
                i9++;
            }
        }
        return i9;
    }
}
