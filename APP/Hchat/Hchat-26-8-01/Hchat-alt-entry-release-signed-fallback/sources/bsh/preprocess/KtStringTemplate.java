package bsh.preprocess;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class KtStringTemplate {
    private KtStringTemplate() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String escapeForDoubleQuoted(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 + 16
            r0.<init>(r1)
            r1 = 0
        Lc:
            int r2 = r4.length()
            if (r1 >= r2) goto L59
            char r2 = r4.charAt(r1)
            r3 = 12
            if (r2 == r3) goto L51
            r3 = 13
            if (r2 == r3) goto L4b
            r3 = 34
            if (r2 == r3) goto L45
            r3 = 92
            if (r2 == r3) goto L3f
            switch(r2) {
                case 8: goto L39;
                case 9: goto L33;
                case 10: goto L2d;
                default: goto L29;
            }
        L29:
            r0.append(r2)
            goto L56
        L2d:
            java.lang.String r2 = "\\n"
            r0.append(r2)
            goto L56
        L33:
            java.lang.String r2 = "\\t"
            r0.append(r2)
            goto L56
        L39:
            java.lang.String r2 = "\\b"
            r0.append(r2)
            goto L56
        L3f:
            java.lang.String r2 = "\\\\"
            r0.append(r2)
            goto L56
        L45:
            java.lang.String r2 = "\\\""
            r0.append(r2)
            goto L56
        L4b:
            java.lang.String r2 = "\\r"
            r0.append(r2)
            goto L56
        L51:
            java.lang.String r2 = "\\f"
            r0.append(r2)
        L56:
            int r1 = r1 + 1
            goto Lc
        L59:
            java.lang.String r4 = r0.toString()
            return r4
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

    private static int findTemplateExprEnd(java.lang.String r6, int r7) {
            int r0 = r6.length()
            r1 = 1
        L5:
            r2 = -1
            if (r7 >= r0) goto L6b
            char r3 = r6.charAt(r7)
            r4 = 34
            if (r3 != r4) goto L1c
            int r7 = r7 + 1
            int r7 = findNormalStringEnd(r6, r7)
            if (r7 >= 0) goto L19
            return r2
        L19:
            int r7 = r7 + 1
            goto L5
        L1c:
            r4 = 39
            if (r3 != r4) goto L29
            int r7 = r7 + 1
            int r7 = findCharLiteralEnd(r6, r7)
            if (r7 >= 0) goto L19
            return r2
        L29:
            r4 = 47
            if (r3 != r4) goto L5b
            int r5 = r7 + 1
            if (r5 >= r0) goto L5b
            char r5 = r6.charAt(r5)
            if (r5 != r4) goto L4b
            int r7 = r7 + 2
        L39:
            if (r7 >= r0) goto L5
            char r2 = r6.charAt(r7)
            r3 = 10
            if (r2 == r3) goto L5
            r3 = 13
            if (r2 != r3) goto L48
            goto L5
        L48:
            int r7 = r7 + 1
            goto L39
        L4b:
            r4 = 42
            if (r5 != r4) goto L5b
            int r7 = r7 + 2
            int r7 = findBlockCommentEnd(r6, r7)
            if (r7 >= 0) goto L58
            return r2
        L58:
            int r7 = r7 + 2
            goto L5
        L5b:
            r2 = 123(0x7b, float:1.72E-43)
            if (r3 != r2) goto L62
            int r1 = r1 + 1
            goto L19
        L62:
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 != r2) goto L19
            int r1 = r1 + (-1)
            if (r1 != 0) goto L19
            return r7
        L6b:
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

    private static boolean isEscapedDollar(java.lang.String r5, int r6) {
            r0 = 1
            int r6 = r6 - r0
            r1 = 0
            r2 = r1
        L4:
            if (r6 < 0) goto L13
            char r3 = r5.charAt(r6)
            r4 = 92
            if (r3 != r4) goto L13
            int r2 = r2 + 1
            int r6 = r6 + (-1)
            goto L4
        L13:
            r5 = r2 & 1
            if (r5 != r0) goto L18
            return r0
        L18:
            return r1
    }

    private static boolean isIdentifierPart(char r1) {
            r0 = 36
            if (r1 == r0) goto Lc
            boolean r1 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static boolean isIdentifierStart(char r1) {
            r0 = 36
            if (r1 == r0) goto Lc
            boolean r1 = java.lang.Character.isJavaIdentifierStart(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
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

    private static java.lang.String joinWithPlus(java.util.List<java.lang.String> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r3.size()
            if (r1 >= r2) goto L1f
            if (r1 <= 0) goto L13
            java.lang.String r2 = " + "
            r0.append(r2)
        L13:
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L1f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String quoteString(java.lang.String r1, boolean r2) {
            java.lang.String r0 = "\""
            if (r2 != 0) goto L9
            java.lang.String r1 = eh.a.n(r0, r1, r0)
            return r1
        L9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r1 = escapeForDoubleQuoted(r1)
            java.lang.String r1 = eh.a.r(r2, r1, r0)
            return r1
    }

    public static java.lang.String rewrite(java.lang.String r8) {
            if (r8 == 0) goto Lc4
            r0 = 36
            int r0 = r8.indexOf(r0)
            if (r0 < 0) goto Lc4
            r0 = 34
            int r1 = r8.indexOf(r0)
            if (r1 >= 0) goto L14
            goto Lc4
        L14:
            int r1 = r8.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 + 32
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L21:
            if (r4 >= r1) goto Lc0
            char r5 = r8.charAt(r4)
            if (r5 != r0) goto L66
            boolean r5 = isTripleQuote(r8, r4)
            if (r5 == 0) goto L4b
            int r5 = r4 + 3
            int r6 = findTripleQuoteEnd(r8, r5)
            if (r6 >= 0) goto L3c
            r2.append(r8, r4, r1)
            goto Lc0
        L3c:
            java.lang.String r4 = r8.substring(r5, r6)
            r5 = 1
            java.lang.String r4 = rewriteStringLiteral(r4, r5)
            r2.append(r4)
            int r4 = r6 + 3
            goto L21
        L4b:
            int r5 = r4 + 1
            int r6 = findNormalStringEnd(r8, r5)
            if (r6 >= 0) goto L58
            r2.append(r8, r4, r1)
            goto Lc0
        L58:
            java.lang.String r4 = r8.substring(r5, r6)
            java.lang.String r4 = rewriteStringLiteral(r4, r3)
            r2.append(r4)
            int r4 = r6 + 1
            goto L21
        L66:
            r6 = 39
            if (r5 != r6) goto L7d
            int r5 = r4 + 1
            int r5 = findCharLiteralEnd(r8, r5)
            if (r5 >= 0) goto L76
            r2.append(r8, r4, r1)
            goto Lc0
        L76:
            int r5 = r5 + 1
            r2.append(r8, r4, r5)
        L7b:
            r4 = r5
            goto L21
        L7d:
            r6 = 47
            if (r5 != r6) goto Lb9
            int r7 = r4 + 1
            if (r7 >= r1) goto Lb9
            char r7 = r8.charAt(r7)
            if (r7 != r6) goto La3
            int r5 = r4 + 2
        L8d:
            if (r5 >= r1) goto L9f
            char r6 = r8.charAt(r5)
            r7 = 10
            if (r6 == r7) goto L9f
            r7 = 13
            if (r6 != r7) goto L9c
            goto L9f
        L9c:
            int r5 = r5 + 1
            goto L8d
        L9f:
            r2.append(r8, r4, r5)
            goto L7b
        La3:
            r6 = 42
            if (r7 != r6) goto Lb9
            int r5 = r4 + 2
            int r5 = findBlockCommentEnd(r8, r5)
            if (r5 >= 0) goto Lb3
            r2.append(r8, r4, r1)
            goto Lc0
        Lb3:
            int r5 = r5 + 2
            r2.append(r8, r4, r5)
            goto L7b
        Lb9:
            r2.append(r5)
            int r4 = r4 + 1
            goto L21
        Lc0:
            java.lang.String r8 = r2.toString()
        Lc4:
            return r8
    }

    private static java.lang.String rewriteStringLiteral(java.lang.String r12, boolean r13) {
            r0 = 36
            int r1 = r12.indexOf(r0)
            if (r1 >= 0) goto Ld
            java.lang.String r12 = quoteString(r12, r13)
            return r12
        Ld:
            int r1 = r12.length()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = r3
            r5 = r4
        L19:
            java.lang.String r6 = ")"
            if (r3 >= r1) goto Lba
            char r7 = r12.charAt(r3)
            if (r7 == r0) goto L26
        L23:
            int r3 = r3 + 1
            goto L19
        L26:
            if (r13 != 0) goto L2f
            boolean r7 = isEscapedDollar(r12, r3)
            if (r7 == 0) goto L2f
            goto L23
        L2f:
            int r7 = r3 + 1
            if (r7 < r1) goto L35
        L33:
            r3 = r7
            goto L19
        L35:
            char r8 = r12.charAt(r7)
            r9 = 123(0x7b, float:1.72E-43)
            java.lang.String r10 = "String.valueOf("
            r11 = 1
            if (r8 != r9) goto L79
            int r8 = r3 + 2
            int r9 = findTemplateExprEnd(r12, r8)
            if (r9 >= 0) goto L49
            goto L33
        L49:
            java.lang.String r3 = r12.substring(r5, r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L5a
            java.lang.String r3 = quoteString(r3, r13)
            r2.add(r3)
        L5a:
            java.lang.String r3 = r12.substring(r8, r9)
            java.lang.String r3 = r3.trim()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r10)
            r4.append(r3)
            r4.append(r6)
            java.lang.String r3 = r4.toString()
            r2.add(r3)
            int r5 = r9 + 1
            r3 = r5
        L77:
            r4 = r11
            goto L19
        L79:
            boolean r8 = isIdentifierStart(r8)
            if (r8 == 0) goto L33
            int r4 = r3 + 2
        L81:
            if (r4 >= r1) goto L90
            char r8 = r12.charAt(r4)
            boolean r8 = isIdentifierPart(r8)
            if (r8 == 0) goto L90
            int r4 = r4 + 1
            goto L81
        L90:
            java.lang.String r3 = r12.substring(r5, r3)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto La1
            java.lang.String r3 = quoteString(r3, r13)
            r2.add(r3)
        La1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            java.lang.String r5 = r12.substring(r7, r4)
            r3.append(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            r3 = r4
            r5 = r3
            goto L77
        Lba:
            if (r4 != 0) goto Lc1
            java.lang.String r12 = quoteString(r12, r13)
            return r12
        Lc1:
            java.lang.String r12 = r12.substring(r5)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Ld2
            java.lang.String r12 = quoteString(r12, r13)
            r2.add(r12)
        Ld2:
            boolean r12 = r2.isEmpty()
            if (r12 == 0) goto Ldb
            java.lang.String r12 = "\"\""
            return r12
        Ldb:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "("
            r12.<init>(r13)
            java.lang.String r13 = joinWithPlus(r2)
            java.lang.String r12 = eh.a.r(r12, r13, r6)
            return r12
    }
}
