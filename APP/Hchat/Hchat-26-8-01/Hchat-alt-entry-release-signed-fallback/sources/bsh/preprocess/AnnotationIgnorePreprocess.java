package bsh.preprocess;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationIgnorePreprocess {
    private static final java.util.Set<java.lang.String> BSH_AT_OPERATORS = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r21 = "right_shift_assign"
            java.lang.String r22 = "right_unsigned_shift_assign"
            java.lang.String r1 = "gt"
            java.lang.String r2 = "lt"
            java.lang.String r3 = "lteq"
            java.lang.String r4 = "gteq"
            java.lang.String r5 = "or"
            java.lang.String r6 = "and"
            java.lang.String r7 = "bitwise_and"
            java.lang.String r8 = "bitwise_or"
            java.lang.String r9 = "bitwise_xor"
            java.lang.String r10 = "mod"
            java.lang.String r11 = "pow"
            java.lang.String r12 = "left_shift"
            java.lang.String r13 = "right_shift"
            java.lang.String r14 = "right_unsigned_shift"
            java.lang.String r15 = "and_assign"
            java.lang.String r16 = "or_assign"
            java.lang.String r17 = "xor_assign"
            java.lang.String r18 = "mod_assign"
            java.lang.String r19 = "pow_assign"
            java.lang.String r20 = "left_shift_assign"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            bsh.preprocess.AnnotationIgnorePreprocess.BSH_AT_OPERATORS = r0
            return
    }

    private AnnotationIgnorePreprocess() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int findBlockCommentEnd(java.lang.String r3, int r4) {
        L0:
            int r0 = r4 + 1
            int r1 = r3.length()
            if (r0 >= r1) goto L1b
            char r1 = r3.charAt(r4)
            r2 = 42
            if (r1 != r2) goto L19
            char r1 = r3.charAt(r0)
            r2 = 47
            if (r1 != r2) goto L19
            return r4
        L19:
            r4 = r0
            goto L0
        L1b:
            r3 = -1
            return r3
    }

    private static int findCharLiteralEnd(java.lang.String r3, int r4) {
        L0:
            int r0 = r3.length()
            r1 = -1
            if (r4 >= r0) goto L23
            char r0 = r3.charAt(r4)
            r2 = 92
            if (r0 != r2) goto L12
            int r4 = r4 + 1
            goto L20
        L12:
            r2 = 39
            if (r0 != r2) goto L17
            return r4
        L17:
            r2 = 10
            if (r0 == r2) goto L23
            r2 = 13
            if (r0 != r2) goto L20
            goto L23
        L20:
            int r4 = r4 + 1
            goto L0
        L23:
            return r1
    }

    private static int findMatchingParen(java.lang.String r4, int r5) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r5 >= r0) goto L27
            int r2 = skipLiteralOrComment(r4, r5)
            if (r2 <= r5) goto L10
            int r5 = r2 + (-1)
            goto L24
        L10:
            char r2 = r4.charAt(r5)
            r3 = 40
            if (r2 != r3) goto L1b
            int r1 = r1 + 1
            goto L24
        L1b:
            r3 = 41
            if (r2 != r3) goto L24
            int r1 = r1 + (-1)
            if (r1 != 0) goto L24
            return r5
        L24:
            int r5 = r5 + 1
            goto L5
        L27:
            r4 = -1
            return r4
    }

    private static int findNormalStringEnd(java.lang.String r2, int r3) {
        L0:
            int r0 = r2.length()
            if (r3 >= r0) goto L19
            char r0 = r2.charAt(r3)
            r1 = 92
            if (r0 != r1) goto L11
            int r3 = r3 + 1
            goto L16
        L11:
            r1 = 34
            if (r0 != r1) goto L16
            return r3
        L16:
            int r3 = r3 + 1
            goto L0
        L19:
            r2 = -1
            return r2
    }

    private static int findTripleQuoteEnd(java.lang.String r2, int r3) {
        L0:
            int r0 = r3 + 2
            int r1 = r2.length()
            if (r0 >= r1) goto L12
            boolean r0 = isTripleQuote(r2, r3)
            if (r0 == 0) goto Lf
            return r3
        Lf:
            int r3 = r3 + 1
            goto L0
        L12:
            r2 = -1
            return r2
    }

    private static boolean isAliasPart(char r1) {
            r0 = 95
            if (r1 == r0) goto Ld
            boolean r1 = java.lang.Character.isLetterOrDigit(r1)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    private static boolean isInlineWhitespace(char r1) {
            r0 = 32
            if (r1 == r0) goto Lf
            r0 = 9
            if (r1 == r0) goto Lf
            r0 = 12
            if (r1 != r0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private static boolean isTripleQuote(java.lang.String r3, int r4) {
            int r0 = r4 + 2
            int r1 = r3.length()
            if (r0 >= r1) goto L1f
            char r1 = r3.charAt(r4)
            r2 = 34
            if (r1 != r2) goto L1f
            r1 = 1
            int r4 = r4 + r1
            char r4 = r3.charAt(r4)
            if (r4 != r2) goto L1f
            char r3 = r3.charAt(r0)
            if (r3 != r2) goto L1f
            return r1
        L1f:
            r3 = 0
            return r3
    }

    private static int parseAnnotationEnd(java.lang.String r4, int r5) {
            int r0 = r4.length()
            int r5 = r5 + 1
            r1 = -1
            if (r5 >= r0) goto L7f
            char r2 = r4.charAt(r5)
            boolean r2 = java.lang.Character.isJavaIdentifierStart(r2)
            if (r2 != 0) goto L15
            goto L7f
        L15:
            r2 = r5
        L16:
            if (r2 >= r0) goto L25
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 == 0) goto L25
            int r2 = r2 + 1
            goto L16
        L25:
            java.lang.String r5 = r4.substring(r5, r2)
            java.lang.String r3 = "interface"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L32
            return r1
        L32:
            if (r2 >= r0) goto L5b
            char r5 = r4.charAt(r2)
            r3 = 46
            if (r5 != r3) goto L5b
            int r2 = r2 + 1
            if (r2 >= r0) goto L5a
            char r5 = r4.charAt(r2)
            boolean r5 = java.lang.Character.isJavaIdentifierStart(r5)
            if (r5 != 0) goto L4b
            goto L5a
        L4b:
            if (r2 >= r0) goto L32
            char r5 = r4.charAt(r2)
            boolean r5 = java.lang.Character.isJavaIdentifierPart(r5)
            if (r5 == 0) goto L32
            int r2 = r2 + 1
            goto L4b
        L5a:
            return r1
        L5b:
            if (r2 >= r0) goto L6a
            char r5 = r4.charAt(r2)
            boolean r5 = isInlineWhitespace(r5)
            if (r5 == 0) goto L6a
            int r2 = r2 + 1
            goto L5b
        L6a:
            if (r2 >= r0) goto L7e
            char r5 = r4.charAt(r2)
            r0 = 40
            if (r5 != r0) goto L7e
            int r4 = findMatchingParen(r4, r2)
            if (r4 >= 0) goto L7b
            return r1
        L7b:
            int r4 = r4 + 1
            return r4
        L7e:
            return r2
        L7f:
            return r1
    }

    private static int parseBshOperatorAlias(java.lang.String r4, int r5) {
            int r0 = r4.length()
            int r5 = r5 + 1
            r1 = -1
            if (r5 >= r0) goto L3f
            char r2 = r4.charAt(r5)
            boolean r2 = isAliasPart(r2)
            if (r2 != 0) goto L14
            goto L3f
        L14:
            r2 = r5
        L15:
            if (r2 >= r0) goto L24
            char r3 = r4.charAt(r2)
            boolean r3 = isAliasPart(r3)
            if (r3 == 0) goto L24
            int r2 = r2 + 1
            goto L15
        L24:
            java.lang.String r5 = r4.substring(r5, r2)
            java.util.Set<java.lang.String> r3 = bsh.preprocess.AnnotationIgnorePreprocess.BSH_AT_OPERATORS
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L31
            return r1
        L31:
            if (r2 >= r0) goto L3e
            char r4 = r4.charAt(r2)
            boolean r4 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r4 == 0) goto L3e
            return r1
        L3e:
            return r2
        L3f:
            return r1
    }

    public static java.lang.String rewrite(java.lang.String r7) {
            if (r7 == 0) goto L75
            r0 = 64
            int r1 = r7.indexOf(r0)
            if (r1 >= 0) goto Lc
            goto L75
        Lc:
            int r1 = r7.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r3 = 0
        L16:
            if (r3 >= r1) goto L71
            int r4 = skipLiteralOrComment(r7, r3)
            if (r4 <= r3) goto L23
            r2.append(r7, r3, r4)
        L21:
            r3 = r4
            goto L16
        L23:
            char r4 = r7.charAt(r3)
            if (r4 == r0) goto L33
            char r4 = r7.charAt(r3)
            r2.append(r4)
        L30:
            int r3 = r3 + 1
            goto L16
        L33:
            int r4 = parseBshOperatorAlias(r7, r3)
            if (r4 <= r3) goto L3d
            r2.append(r7, r3, r4)
            goto L21
        L3d:
            int r4 = parseAnnotationEnd(r7, r3)
            if (r4 <= r3) goto L6d
        L43:
            if (r3 >= r4) goto L57
            char r5 = r7.charAt(r3)
            r6 = 10
            if (r5 == r6) goto L51
            r6 = 13
            if (r5 != r6) goto L54
        L51:
            r2.append(r5)
        L54:
            int r3 = r3 + 1
            goto L43
        L57:
            r3 = r4
        L58:
            if (r3 >= r1) goto L16
            char r4 = r7.charAt(r3)
            r5 = 32
            if (r4 == r5) goto L6a
            char r4 = r7.charAt(r3)
            r5 = 9
            if (r4 != r5) goto L16
        L6a:
            int r3 = r3 + 1
            goto L58
        L6d:
            r2.append(r0)
            goto L30
        L71:
            java.lang.String r7 = r2.toString()
        L75:
            return r7
    }

    private static int skipLiteralOrComment(java.lang.String r3, int r4) {
            int r0 = r3.length()
            if (r4 < r0) goto L8
            goto L74
        L8:
            char r1 = r3.charAt(r4)
            r2 = 34
            if (r1 != r2) goto L2e
            boolean r1 = isTripleQuote(r3, r4)
            if (r1 == 0) goto L22
            int r4 = r4 + 3
            int r3 = findTripleQuoteEnd(r3, r4)
            if (r3 >= 0) goto L1f
            goto L70
        L1f:
            int r3 = r3 + 3
            return r3
        L22:
            int r4 = r4 + 1
            int r3 = findNormalStringEnd(r3, r4)
            if (r3 >= 0) goto L2b
            goto L70
        L2b:
            int r3 = r3 + 1
            return r3
        L2e:
            r2 = 39
            if (r1 != r2) goto L3e
            int r4 = r4 + 1
            int r3 = findCharLiteralEnd(r3, r4)
            if (r3 >= 0) goto L3b
            goto L70
        L3b:
            int r3 = r3 + 1
            return r3
        L3e:
            r2 = 47
            if (r1 != r2) goto L74
            int r1 = r4 + 1
            if (r1 >= r0) goto L74
            char r1 = r3.charAt(r1)
            if (r1 != r2) goto L64
            int r4 = r4 + 2
        L4e:
            if (r4 >= r0) goto L63
            char r1 = r3.charAt(r4)
            r2 = 10
            if (r1 == r2) goto L63
            char r1 = r3.charAt(r4)
            r2 = 13
            if (r1 == r2) goto L63
            int r4 = r4 + 1
            goto L4e
        L63:
            return r4
        L64:
            r2 = 42
            if (r1 != r2) goto L74
            int r4 = r4 + 2
            int r3 = findBlockCommentEnd(r3, r4)
            if (r3 >= 0) goto L71
        L70:
            return r0
        L71:
            int r3 = r3 + 2
            return r3
        L74:
            return r4
    }
}
