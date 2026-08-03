package bsh.preprocess;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ImplicitDefaultConstructorPreprocess {
    private ImplicitDefaultConstructorPreprocess() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int findCharEnd(java.lang.String r3, int r4, int r5) {
        L0:
            r0 = -1
            if (r4 >= r5) goto L1f
            char r1 = r3.charAt(r4)
            r2 = 92
            if (r1 != r2) goto Le
            int r4 = r4 + 1
            goto L1c
        Le:
            r2 = 39
            if (r1 != r2) goto L13
            return r4
        L13:
            r2 = 10
            if (r1 == r2) goto L1f
            r2 = 13
            if (r1 != r2) goto L1c
            goto L1f
        L1c:
            int r4 = r4 + 1
            goto L0
        L1f:
            return r0
    }

    private static int findClassBodyStart(java.lang.String r5, int r6, int r7) {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            if (r6 >= r7) goto L50
            int r3 = skipLiteralOrComment(r5, r6, r7)
            if (r3 <= r6) goto Le
            int r6 = r3 + (-1)
            goto L4d
        Le:
            char r3 = r5.charAt(r6)
            r4 = 40
            if (r3 == r4) goto L4b
            r4 = 41
            if (r3 == r4) goto L46
            r4 = 60
            if (r3 == r4) goto L43
            r4 = 62
            if (r3 == r4) goto L3e
            r4 = 91
            if (r3 == r4) goto L3b
            r4 = 93
            if (r3 == r4) goto L36
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L2f
            goto L4d
        L2f:
            if (r1 != 0) goto L4d
            if (r0 != 0) goto L4d
            if (r2 != 0) goto L4d
            return r6
        L36:
            if (r2 <= 0) goto L4d
            int r2 = r2 + (-1)
            goto L4d
        L3b:
            int r2 = r2 + 1
            goto L4d
        L3e:
            if (r1 <= 0) goto L4d
            int r1 = r1 + (-1)
            goto L4d
        L43:
            int r1 = r1 + 1
            goto L4d
        L46:
            if (r0 <= 0) goto L4d
            int r0 = r0 + (-1)
            goto L4d
        L4b:
            int r0 = r0 + 1
        L4d:
            int r6 = r6 + 1
            goto L3
        L50:
            r5 = -1
            return r5
    }

    private static int findMatching(java.lang.String r2, int r3, int r4, char r5, char r6) {
            r0 = 0
        L1:
            if (r3 >= r4) goto L1f
            int r1 = skipLiteralOrComment(r2, r3, r4)
            if (r1 <= r3) goto Lc
            int r3 = r1 + (-1)
            goto L1c
        Lc:
            char r1 = r2.charAt(r3)
            if (r1 != r5) goto L15
            int r0 = r0 + 1
            goto L1c
        L15:
            if (r1 != r6) goto L1c
            int r0 = r0 + (-1)
            if (r0 != 0) goto L1c
            return r3
        L1c:
            int r3 = r3 + 1
            goto L1
        L1f:
            r2 = -1
            return r2
    }

    private static int findStringEnd(java.lang.String r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto L15
            char r0 = r2.charAt(r3)
            r1 = 92
            if (r0 != r1) goto Ld
            int r3 = r3 + 1
            goto L12
        Ld:
            r1 = 34
            if (r0 != r1) goto L12
            return r3
        L12:
            int r3 = r3 + 1
            goto L0
        L15:
            r2 = -1
            return r2
    }

    private static int findTripleQuoteEnd(java.lang.String r3, int r4, int r5) {
        L0:
            int r0 = r4 + 2
            if (r0 >= r5) goto L1e
            char r1 = r3.charAt(r4)
            r2 = 34
            if (r1 != r2) goto L1b
            int r1 = r4 + 1
            char r1 = r3.charAt(r1)
            if (r1 != r2) goto L1b
            char r0 = r3.charAt(r0)
            if (r0 != r2) goto L1b
            return r4
        L1b:
            int r4 = r4 + 1
            goto L0
        L1e:
            r3 = -1
            return r3
    }

    private static boolean hasTopLevelConstructor(java.lang.String r8, java.lang.String r9) {
            int r0 = r8.length()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L82
            int r4 = skipLiteralOrComment(r8, r2, r0)
            if (r4 <= r2) goto L11
        Lf:
            r2 = r4
            goto L7
        L11:
            char r4 = r8.charAt(r2)
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 != r5) goto L1e
            int r3 = r3 + 1
        L1b:
            int r2 = r2 + 1
            goto L7
        L1e:
            r6 = 125(0x7d, float:1.75E-43)
            if (r4 != r6) goto L27
            if (r3 <= 0) goto L1b
            int r3 = r3 + (-1)
            goto L1b
        L27:
            if (r3 != 0) goto L1b
            boolean r4 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r4 == 0) goto L1b
            int r4 = r2 + 1
        L31:
            if (r4 >= r0) goto L40
            char r6 = r8.charAt(r4)
            boolean r6 = java.lang.Character.isJavaIdentifierPart(r6)
            if (r6 == 0) goto L40
            int r4 = r4 + 1
            goto L31
        L40:
            java.lang.String r2 = r8.substring(r2, r4)
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto Lf
            int r2 = skipWsAndCommentsForward(r8, r4, r0)
            if (r2 >= r0) goto Lf
            char r6 = r8.charAt(r2)
            r7 = 40
            if (r6 != r7) goto Lf
            r6 = 41
            int r2 = findMatching(r8, r2, r0, r7, r6)
            if (r2 < 0) goto Lf
            int r2 = r2 + 1
            int r2 = skipWsAndCommentsForward(r8, r2, r0)
            java.lang.String r6 = "throws"
            boolean r6 = isKeywordAt(r8, r2, r0, r6)
            if (r6 == 0) goto L74
            int r2 = r2 + 6
            int r2 = skipThrowsClause(r8, r2, r0)
        L74:
            int r2 = skipWsAndCommentsForward(r8, r2, r0)
            if (r2 >= r0) goto Lf
            char r2 = r8.charAt(r2)
            if (r2 != r5) goto Lf
            r8 = 1
            return r8
        L82:
            return r1
    }

    private static boolean isKeywordAt(java.lang.String r3, int r4, int r5, java.lang.String r6) {
            int r0 = r6.length()
            r1 = 0
            if (r4 < 0) goto L38
            int r2 = r4 + r0
            if (r2 <= r5) goto Lc
            goto L38
        Lc:
            boolean r6 = r3.regionMatches(r4, r6, r1, r0)
            if (r6 != 0) goto L13
            return r1
        L13:
            r6 = 1
            if (r4 <= 0) goto L2a
            int r4 = r4 - r6
            char r4 = r3.charAt(r4)
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r0 != 0) goto L29
            r0 = 46
            if (r4 == r0) goto L29
            r0 = 36
            if (r4 != r0) goto L2a
        L29:
            return r1
        L2a:
            if (r2 >= r5) goto L37
            char r3 = r3.charAt(r2)
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 == 0) goto L37
            return r1
        L37:
            return r6
        L38:
            return r1
    }

    private static boolean isTripleQuote(java.lang.String r2, int r3, int r4) {
            int r0 = r3 + 2
            if (r0 >= r4) goto L1b
            char r4 = r2.charAt(r3)
            r1 = 34
            if (r4 != r1) goto L1b
            r4 = 1
            int r3 = r3 + r4
            char r3 = r2.charAt(r3)
            if (r3 != r1) goto L1b
            char r2 = r2.charAt(r0)
            if (r2 != r1) goto L1b
            return r4
        L1b:
            r2 = 0
            return r2
    }

    public static java.lang.String rewrite(java.lang.String r2) {
            if (r2 == 0) goto L14
            java.lang.String r0 = "class"
            int r0 = r2.indexOf(r0)
            if (r0 >= 0) goto Lb
            goto L14
        Lb:
            r0 = 0
            int r1 = r2.length()
            java.lang.String r2 = rewriteSegment(r2, r0, r1)
        L14:
            return r2
    }

    private static java.lang.String rewriteSegment(java.lang.String r8, int r9, int r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r10 - r9
            int r1 = r1 + 64
            r0.<init>(r1)
            r1 = r9
        La:
            if (r9 >= r10) goto L88
            int r2 = skipLiteralOrComment(r8, r9, r10)
            if (r2 <= r9) goto L14
            r9 = r2
            goto La
        L14:
            java.lang.String r2 = "class"
            boolean r2 = isKeywordAt(r8, r9, r10, r2)
            if (r2 != 0) goto L1f
        L1c:
            int r9 = r9 + 1
            goto La
        L1f:
            int r2 = r9 + 5
            int r2 = skipWsAndCommentsForward(r8, r2, r10)
            if (r2 >= r10) goto L1c
            char r3 = r8.charAt(r2)
            boolean r3 = java.lang.Character.isJavaIdentifierStart(r3)
            if (r3 != 0) goto L32
            goto L1c
        L32:
            int r9 = r2 + 1
        L34:
            if (r9 >= r10) goto L43
            char r3 = r8.charAt(r9)
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 == 0) goto L43
            int r9 = r9 + 1
            goto L34
        L43:
            java.lang.String r2 = r8.substring(r2, r9)
            int r3 = findClassBodyStart(r8, r9, r10)
            if (r3 >= 0) goto L4e
            goto La
        L4e:
            r4 = 123(0x7b, float:1.72E-43)
            r5 = 125(0x7d, float:1.75E-43)
            int r4 = findMatching(r8, r3, r10, r4, r5)
            if (r4 >= 0) goto L59
            goto La
        L59:
            int r3 = r3 + 1
            java.lang.String r9 = r8.substring(r3, r4)
            r6 = 0
            int r7 = r9.length()
            java.lang.String r6 = rewriteSegment(r9, r6, r7)
            boolean r9 = hasTopLevelConstructor(r9, r2)
            r0.append(r8, r1, r3)
            if (r9 != 0) goto L7e
            r9 = 32
            r0.append(r9)
            r0.append(r2)
            java.lang.String r9 = "(){}"
            r0.append(r9)
        L7e:
            r0.append(r6)
            r0.append(r5)
            int r1 = r4 + 1
            r9 = r1
            goto La
        L88:
            r0.append(r8, r1, r10)
            java.lang.String r8 = r0.toString()
            return r8
    }

    private static int skipLiteralOrComment(java.lang.String r4, int r5, int r6) {
            if (r5 < r6) goto L4
            goto L7c
        L4:
            char r0 = r4.charAt(r5)
            r1 = 34
            if (r0 != r1) goto L2a
            boolean r0 = isTripleQuote(r4, r5, r6)
            if (r0 == 0) goto L1e
            int r5 = r5 + 3
            int r4 = findTripleQuoteEnd(r4, r5, r6)
            if (r4 >= 0) goto L1b
            goto L7b
        L1b:
            int r4 = r4 + 3
            return r4
        L1e:
            int r5 = r5 + 1
            int r4 = findStringEnd(r4, r5, r6)
            if (r4 >= 0) goto L27
            goto L7b
        L27:
            int r4 = r4 + 1
            return r4
        L2a:
            r1 = 39
            if (r0 != r1) goto L3a
            int r5 = r5 + 1
            int r4 = findCharEnd(r4, r5, r6)
            if (r4 >= 0) goto L37
            goto L7b
        L37:
            int r4 = r4 + 1
            return r4
        L3a:
            r1 = 47
            if (r0 != r1) goto L7c
            int r0 = r5 + 1
            if (r0 >= r6) goto L7c
            char r0 = r4.charAt(r0)
            if (r0 != r1) goto L60
            int r5 = r5 + 2
        L4a:
            if (r5 >= r6) goto L5f
            char r0 = r4.charAt(r5)
            r1 = 10
            if (r0 == r1) goto L5f
            char r0 = r4.charAt(r5)
            r1 = 13
            if (r0 == r1) goto L5f
            int r5 = r5 + 1
            goto L4a
        L5f:
            return r5
        L60:
            r2 = 42
            if (r0 != r2) goto L7c
            int r5 = r5 + 2
        L66:
            int r0 = r5 + 1
            if (r0 >= r6) goto L7b
            char r3 = r4.charAt(r5)
            if (r3 != r2) goto L79
            char r3 = r4.charAt(r0)
            if (r3 != r1) goto L79
            int r5 = r5 + 2
            return r5
        L79:
            r5 = r0
            goto L66
        L7b:
            return r6
        L7c:
            return r5
    }

    private static int skipThrowsClause(java.lang.String r5, int r6, int r7) {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            if (r6 >= r7) goto L53
            int r3 = skipLiteralOrComment(r5, r6, r7)
            if (r3 <= r6) goto Ld
            r6 = r3
            goto L3
        Ld:
            char r3 = r5.charAt(r6)
            r4 = 40
            if (r3 == r4) goto L4e
            r4 = 41
            if (r3 == r4) goto L49
            r4 = 59
            if (r3 == r4) goto L42
            r4 = 60
            if (r3 == r4) goto L3f
            r4 = 62
            if (r3 == r4) goto L3a
            r4 = 91
            if (r3 == r4) goto L37
            r4 = 93
            if (r3 == r4) goto L32
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L42
            goto L50
        L32:
            if (r2 <= 0) goto L50
            int r2 = r2 + (-1)
            goto L50
        L37:
            int r2 = r2 + 1
            goto L50
        L3a:
            if (r1 <= 0) goto L50
            int r1 = r1 + (-1)
            goto L50
        L3f:
            int r1 = r1 + 1
            goto L50
        L42:
            if (r1 != 0) goto L50
            if (r0 != 0) goto L50
            if (r2 != 0) goto L50
            goto L53
        L49:
            if (r0 <= 0) goto L50
            int r0 = r0 + (-1)
            goto L50
        L4e:
            int r0 = r0 + 1
        L50:
            int r6 = r6 + 1
            goto L3
        L53:
            return r6
    }

    private static int skipWsAndCommentsForward(java.lang.String r1, int r2, int r3) {
        L0:
            if (r2 >= r3) goto L17
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto Lf
            int r2 = r2 + 1
            goto L0
        Lf:
            int r0 = skipLiteralOrComment(r1, r2, r3)
            if (r0 <= r2) goto L17
            r2 = r0
            goto L0
        L17:
            return r2
    }
}
