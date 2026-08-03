package bsh.preprocess;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultArgsDesugar {
    private static final java.util.Set<java.lang.String> CONTROL_KEYWORDS = null;
    private static final java.util.Set<java.lang.String> METHOD_MODIFIERS = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class MethodRewrite {
        final int declEndExclusive;
        final int declStart;
        final java.lang.String rewritten;

        public MethodRewrite(int r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.declStart = r1
                r0.declEndExclusive = r2
                r0.rewritten = r3
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class MethodShape {
        final int declEndExclusive;
        final int declStart;
        final java.lang.String methodName;
        final bsh.preprocess.DefaultArgsDesugar.ParsedParams parsed;

        public MethodShape(int r1, int r2, java.lang.String r3, bsh.preprocess.DefaultArgsDesugar.ParsedParams r4) {
                r0 = this;
                r0.<init>()
                r0.declStart = r1
                r0.declEndExclusive = r2
                r0.methodName = r3
                r0.parsed = r4
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ParsedParams {
        final java.util.List<java.lang.String> defaultExpr;
        boolean hasDefault;
        final java.util.List<java.lang.String> paramDeclNoDefault;
        final java.util.List<java.lang.String> paramNames;
        int requiredCount;
        boolean trailingDefaults;
        boolean valid;

        private ParsedParams() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.paramDeclNoDefault = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.paramNames = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.defaultExpr = r0
                return
        }

        public /* synthetic */ ParsedParams(int r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r12 = "do"
            java.lang.String r13 = "try"
            java.lang.String r1 = "if"
            java.lang.String r2 = "for"
            java.lang.String r3 = "while"
            java.lang.String r4 = "switch"
            java.lang.String r5 = "catch"
            java.lang.String r6 = "synchronized"
            java.lang.String r7 = "new"
            java.lang.String r8 = "return"
            java.lang.String r9 = "throw"
            java.lang.String r10 = "assert"
            java.lang.String r11 = "case"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            bsh.preprocess.DefaultArgsDesugar.CONTROL_KEYWORDS = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r9 = "strictfp"
            java.lang.String r10 = "default"
            java.lang.String r1 = "public"
            java.lang.String r2 = "protected"
            java.lang.String r3 = "private"
            java.lang.String r4 = "static"
            java.lang.String r5 = "final"
            java.lang.String r6 = "synchronized"
            java.lang.String r7 = "native"
            java.lang.String r8 = "abstract"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            bsh.preprocess.DefaultArgsDesugar.METHOD_MODIFIERS = r0
            return
    }

    private DefaultArgsDesugar() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String buildBridgeArgs(bsh.preprocess.DefaultArgsDesugar.ParsedParams r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            java.lang.String r2 = ", "
            if (r1 >= r5) goto L21
            int r3 = r0.length()
            if (r3 <= 0) goto L13
            r0.append(r2)
        L13:
            java.util.List<java.lang.String> r2 = r4.paramNames
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L21:
            java.util.List<java.lang.String> r1 = r4.paramDeclNoDefault
            int r1 = r1.size()
            if (r5 >= r1) goto L40
            int r1 = r0.length()
            if (r1 <= 0) goto L32
            r0.append(r2)
        L32:
            java.util.List<java.lang.String> r1 = r4.defaultExpr
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            int r5 = r5 + 1
            goto L21
        L40:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static java.lang.String buildRewrittenMethod(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, bsh.preprocess.DefaultArgsDesugar.ParsedParams r11, java.util.Set<java.lang.String> r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length()
            int r2 = r10.length()
            int r2 = r2 + r1
            int r2 = r2 + 128
            r0.<init>(r2)
            r0.append(r7)
            r1 = 40
            r0.append(r1)
            java.util.List<java.lang.String> r2 = r11.paramDeclNoDefault
            int r3 = r2.size()
            r4 = 0
            java.lang.String r2 = join(r2, r4, r3)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            r0.append(r9)
            r0.append(r10)
            boolean r10 = shouldBridgeReturn(r7, r8)
            java.util.List<java.lang.String> r3 = r11.paramDeclNoDefault
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L3d:
            int r5 = r11.requiredCount
            if (r3 < r5) goto L8c
            java.util.List<java.lang.String> r5 = r11.paramDeclNoDefault
            java.lang.String r5 = methodSignatureKey(r8, r5, r3)
            boolean r6 = r12.contains(r5)
            if (r6 == 0) goto L4e
            goto L89
        L4e:
            r6 = 10
            r0.append(r6)
            r0.append(r7)
            r0.append(r1)
            java.util.List<java.lang.String> r6 = r11.paramDeclNoDefault
            java.lang.String r6 = join(r6, r4, r3)
            r0.append(r6)
            r0.append(r2)
            r0.append(r9)
            r6 = 123(0x7b, float:1.72E-43)
            r0.append(r6)
            if (r10 == 0) goto L74
            java.lang.String r6 = "return "
            r0.append(r6)
        L74:
            r0.append(r8)
            r0.append(r1)
            java.lang.String r6 = buildBridgeArgs(r11, r3)
            r0.append(r6)
            java.lang.String r6 = ");}"
            r0.append(r6)
            r12.add(r5)
        L89:
            int r3 = r3 + (-1)
            goto L3d
        L8c:
            java.lang.String r7 = r0.toString()
            return r7
    }

    private static java.util.Set<java.lang.String> collectDeclaredMethodSignatures(java.lang.String r6) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L39
            int r3 = skipLiteralOrComment(r6, r2)
            if (r3 <= r2) goto L14
            r2 = r3
            goto La
        L14:
            char r3 = r6.charAt(r2)
            r4 = 40
            if (r3 == r4) goto L1f
        L1c:
            int r2 = r2 + 1
            goto La
        L1f:
            bsh.preprocess.DefaultArgsDesugar$MethodShape r3 = tryParseMethodShape(r6, r2)
            if (r3 == 0) goto L1c
            java.lang.String r2 = r3.methodName
            bsh.preprocess.DefaultArgsDesugar$ParsedParams r4 = r3.parsed
            java.util.List<java.lang.String> r4 = r4.paramDeclNoDefault
            int r5 = r4.size()
            java.lang.String r2 = methodSignatureKey(r2, r4, r5)
            r0.add(r2)
            int r2 = r3.declEndExclusive
            goto La
        L39:
            return r0
    }

    private static java.lang.String extractParamName(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            int r0 = skipWsBackward(r5, r0)
            r2 = 0
            if (r0 >= 0) goto Le
            return r2
        Le:
            if (r0 < r1) goto L29
            char r3 = r5.charAt(r0)
            r4 = 93
            if (r3 != r4) goto L29
            int r3 = r0 + (-1)
            char r3 = r5.charAt(r3)
            r4 = 91
            if (r3 != r4) goto L29
            int r0 = r0 + (-2)
            int r0 = skipWsBackward(r5, r0)
            goto Le
        L29:
            if (r0 >= 0) goto L2c
            return r2
        L2c:
            int r3 = r0 + 1
        L2e:
            if (r0 < 0) goto L3d
            char r4 = r5.charAt(r0)
            boolean r4 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r4 == 0) goto L3d
            int r0 = r0 + (-1)
            goto L2e
        L3d:
            int r0 = r0 + r1
            if (r0 < r3) goto L41
            return r2
        L41:
            java.lang.String r5 = r5.substring(r0, r3)
            r0 = 0
            char r0 = r5.charAt(r0)
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r0)
            if (r0 == 0) goto L51
            return r5
        L51:
            return r2
    }

    private static int findDeclarationStart(java.lang.String r4, int r5) {
        L0:
            if (r5 <= 0) goto L50
            int r0 = r5 + (-1)
            char r0 = r4.charAt(r0)
            r1 = 59
            if (r0 == r1) goto L50
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L50
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L15
            goto L50
        L15:
            r1 = 13
            r2 = 10
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1e
            goto L21
        L1e:
            int r5 = r5 + (-1)
            goto L0
        L21:
            r0 = r5
        L22:
            if (r0 <= 0) goto L32
            int r3 = r0 + (-1)
            char r3 = r4.charAt(r3)
            if (r3 == r2) goto L32
            if (r3 != r1) goto L2f
            goto L32
        L2f:
            int r0 = r0 + (-1)
            goto L22
        L32:
            java.lang.String r0 = r4.substring(r0, r5)
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L41
            goto L50
        L41:
            java.lang.String r1 = "@"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L1e
            boolean r0 = isModifierOnlyLine(r0)
            if (r0 == 0) goto L50
            goto L1e
        L50:
            return r5
    }

    private static int findMatching(java.lang.String r3, int r4, char r5, char r6) {
            int r0 = r3.length()
            r1 = 0
        L5:
            if (r4 >= r0) goto L23
            int r2 = skipLiteralOrComment(r3, r4)
            if (r2 <= r4) goto L10
            int r4 = r2 + (-1)
            goto L20
        L10:
            char r2 = r3.charAt(r4)
            if (r2 != r5) goto L19
            int r1 = r1 + 1
            goto L20
        L19:
            if (r2 != r6) goto L20
            int r1 = r1 + (-1)
            if (r1 != 0) goto L20
            return r4
        L20:
            int r4 = r4 + 1
            goto L5
        L23:
            r3 = -1
            return r3
    }

    private static int findMethodBodyStart(java.lang.String r2, int r3) {
            int r3 = skipWsAndCommentsForward(r2, r3)
            int r0 = r2.length()
            r1 = -1
            if (r3 < r0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = "throws"
            boolean r0 = startsWithWord(r2, r3, r0)
            if (r0 == 0) goto L1f
            int r3 = skipThrowsClause(r2, r3)
            if (r3 >= 0) goto L1b
            return r1
        L1b:
            int r3 = skipWsAndCommentsForward(r2, r3)
        L1f:
            int r0 = r2.length()
            if (r3 >= r0) goto L2e
            char r2 = r2.charAt(r3)
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 != r0) goto L2e
            return r3
        L2e:
            return r1
    }

    private static int findTopLevelAssign(java.lang.String r14) {
            int r0 = r14.length()
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        La:
            if (r2 >= r0) goto L98
            int r7 = skipLiteralOrComment(r14, r2)
            if (r7 <= r2) goto L14
            r2 = r7
            goto La
        L14:
            char r7 = r14.charAt(r2)
            r8 = 40
            if (r7 != r8) goto L20
            int r3 = r3 + 1
            goto L94
        L20:
            r8 = 41
            if (r7 != r8) goto L2c
            int r3 = r3 + (-1)
            int r3 = java.lang.Math.max(r1, r3)
            goto L94
        L2c:
            r8 = 91
            if (r7 != r8) goto L34
            int r4 = r4 + 1
            goto L94
        L34:
            r8 = 93
            if (r7 != r8) goto L3f
            int r4 = r4 + (-1)
            int r4 = java.lang.Math.max(r1, r4)
            goto L94
        L3f:
            r8 = 123(0x7b, float:1.72E-43)
            if (r7 != r8) goto L46
            int r5 = r5 + 1
            goto L94
        L46:
            r8 = 125(0x7d, float:1.75E-43)
            if (r7 != r8) goto L51
            int r5 = r5 + (-1)
            int r5 = java.lang.Math.max(r1, r5)
            goto L94
        L51:
            r8 = 60
            if (r7 != r8) goto L58
            int r6 = r6 + 1
            goto L94
        L58:
            r9 = 62
            if (r7 != r9) goto L63
            int r6 = r6 + (-1)
            int r6 = java.lang.Math.max(r1, r6)
            goto L94
        L63:
            r10 = 61
            if (r7 != r10) goto L94
            if (r3 != 0) goto L94
            if (r4 != 0) goto L94
            if (r5 != 0) goto L94
            if (r6 != 0) goto L94
            if (r2 <= 0) goto L78
            int r7 = r2 + (-1)
            char r7 = r14.charAt(r7)
            goto L79
        L78:
            r7 = r1
        L79:
            int r11 = r2 + 1
            if (r11 >= r0) goto L82
            char r12 = r14.charAt(r11)
            goto L83
        L82:
            r12 = r1
        L83:
            if (r7 == r10) goto L91
            r13 = 33
            if (r7 == r13) goto L91
            if (r7 == r8) goto L91
            if (r7 == r9) goto L91
            if (r12 != r10) goto L90
            goto L91
        L90:
            return r2
        L91:
            r2 = r11
            goto La
        L94:
            int r2 = r2 + 1
            goto La
        L98:
            r14 = -1
            return r14
    }

    private static int findTrailingNameIndex(java.lang.String r5, java.lang.String r6) {
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            int r0 = skipWsBackward(r5, r0)
        La:
            if (r0 < r1) goto L25
            char r2 = r5.charAt(r0)
            r3 = 93
            if (r2 != r3) goto L25
            int r2 = r0 + (-1)
            char r2 = r5.charAt(r2)
            r3 = 91
            if (r2 != r3) goto L25
            int r0 = r0 + (-2)
            int r0 = skipWsBackward(r5, r0)
            goto La
        L25:
            r2 = -1
            if (r0 >= 0) goto L29
            return r2
        L29:
            int r3 = r0 + 1
        L2b:
            if (r0 < 0) goto L3a
            char r4 = r5.charAt(r0)
            boolean r4 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r4 == 0) goto L3a
            int r0 = r0 + (-1)
            goto L2b
        L3a:
            int r0 = r0 + r1
            if (r0 < r3) goto L3e
            return r2
        L3e:
            java.lang.String r5 = r5.substring(r0, r3)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L49
            return r0
        L49:
            return r2
    }

    private static boolean isModifierOnlyLine(java.lang.String r5) {
            java.lang.String r0 = "//"
            boolean r0 = r5.startsWith(r0)
            r1 = 0
            if (r0 != 0) goto L3f
            java.lang.String r0 = "/*"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L3f
            java.lang.String r0 = "*"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L1a
            goto L3f
        L1a:
            java.lang.String r0 = "\\s+"
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            if (r0 != 0) goto L24
            return r1
        L24:
            int r0 = r5.length
            r2 = r1
        L26:
            if (r2 >= r0) goto L3d
            r3 = r5[r2]
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L31
            goto L3a
        L31:
            java.util.Set<java.lang.String> r4 = bsh.preprocess.DefaultArgsDesugar.METHOD_MODIFIERS
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L3a
            return r1
        L3a:
            int r2 = r2 + 1
            goto L26
        L3d:
            r5 = 1
            return r5
        L3f:
            return r1
    }

    private static java.lang.String join(java.util.List<java.lang.String> r3, int r4, int r5) {
            if (r4 < r5) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r4
        Lb:
            if (r1 >= r5) goto L20
            if (r1 <= r4) goto L14
            java.lang.String r2 = ", "
            r0.append(r2)
        L14:
            java.lang.Object r2 = r3.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            int r1 = r1 + 1
            goto Lb
        L20:
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String methodSignatureKey(java.lang.String r2, java.util.List<java.lang.String> r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.length()
            int r1 = r1 + 32
            r0.<init>(r1)
            r0.append(r2)
            r2 = 40
            r0.append(r2)
            r2 = 0
        L14:
            if (r2 >= r4) goto L2d
            if (r2 <= 0) goto L1d
            r1 = 44
            r0.append(r1)
        L1d:
            java.lang.Object r1 = r3.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = signatureTypeKey(r1)
            r0.append(r1)
            int r2 = r2 + 1
            goto L14
        L2d:
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String normalizeTypeKey(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length()
            r0.<init>(r1)
            int r1 = r5.length()
            r2 = 0
        Le:
            if (r2 >= r1) goto L3f
            int r3 = skipLiteralOrComment(r5, r2)
            if (r3 <= r2) goto L18
            r2 = r3
            goto Le
        L18:
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isWhitespace(r3)
            if (r4 == 0) goto L25
        L22:
            int r2 = r2 + 1
            goto Le
        L25:
            r4 = 64
            if (r3 != r4) goto L30
            int r2 = r2 + 1
            int r2 = skipAnnotation(r5, r2)
            goto Le
        L30:
            java.lang.String r4 = "final"
            boolean r4 = startsWithWord(r5, r2, r4)
            if (r4 == 0) goto L3b
            int r2 = r2 + 5
            goto Le
        L3b:
            r0.append(r3)
            goto L22
        L3f:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private static bsh.preprocess.DefaultArgsDesugar.ParsedParams parseParams(java.lang.String r9) {
            bsh.preprocess.DefaultArgsDesugar$ParsedParams r0 = new bsh.preprocess.DefaultArgsDesugar$ParsedParams
            r1 = 0
            r0.<init>(r1)
            r2 = 1
            r0.trailingDefaults = r2
            java.lang.String r3 = r9.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L16
            r0.valid = r2
            return r0
        L16:
            r3 = 44
            java.util.List r9 = splitTopLevel(r9, r3)
            r3 = r1
            r4 = r3
        L1e:
            int r5 = r9.size()
            if (r3 >= r5) goto L89
            java.lang.Object r5 = r9.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L37
            r0.valid = r1
            return r0
        L37:
            int r6 = findTopLevelAssign(r5)
            if (r6 < 0) goto L42
            java.lang.String r7 = r5.substring(r1, r6)
            goto L43
        L42:
            r7 = r5
        L43:
            java.lang.String r7 = r7.trim()
            if (r6 < 0) goto L50
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L64
            java.lang.String r5 = r5.trim()
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L60
            r0.valid = r1
            return r0
        L60:
            r0.hasDefault = r2
            r4 = r2
            goto L6e
        L64:
            if (r4 == 0) goto L69
            r0.trailingDefaults = r1
            goto L6e
        L69:
            int r6 = r0.requiredCount
            int r6 = r6 + r2
            r0.requiredCount = r6
        L6e:
            java.lang.String r6 = extractParamName(r7)
            if (r6 != 0) goto L77
            r0.valid = r1
            return r0
        L77:
            java.util.List<java.lang.String> r8 = r0.paramDeclNoDefault
            r8.add(r7)
            java.util.List<java.lang.String> r7 = r0.paramNames
            r7.add(r6)
            java.util.List<java.lang.String> r6 = r0.defaultExpr
            r6.add(r5)
            int r3 = r3 + 1
            goto L1e
        L89:
            r0.valid = r2
            boolean r9 = r0.hasDefault
            if (r9 != 0) goto L91
            r0.trailingDefaults = r2
        L91:
            return r0
    }

    public static java.lang.String rewrite(java.lang.String r7) {
            if (r7 == 0) goto L56
            r0 = 61
            int r0 = r7.indexOf(r0)
            if (r0 < 0) goto L56
            r0 = 40
            int r1 = r7.indexOf(r0)
            if (r1 >= 0) goto L13
            goto L56
        L13:
            java.util.Set r1 = collectDeclaredMethodSignatures(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r7.length()
            int r3 = r3 + 128
            r2.<init>(r3)
            int r3 = r7.length()
            r4 = 0
            r5 = r4
        L28:
            if (r4 >= r3) goto L4f
            int r6 = skipLiteralOrComment(r7, r4)
            if (r6 <= r4) goto L32
            r4 = r6
            goto L28
        L32:
            char r6 = r7.charAt(r4)
            if (r6 == r0) goto L3b
        L38:
            int r4 = r4 + 1
            goto L28
        L3b:
            bsh.preprocess.DefaultArgsDesugar$MethodRewrite r6 = tryRewriteMethod(r7, r4, r1)
            if (r6 == 0) goto L38
            int r4 = r6.declStart
            r2.append(r7, r5, r4)
            java.lang.String r4 = r6.rewritten
            r2.append(r4)
            int r5 = r6.declEndExclusive
            r4 = r5
            goto L28
        L4f:
            r2.append(r7, r5, r3)
            java.lang.String r7 = r2.toString()
        L56:
            return r7
    }

    private static boolean shouldBridgeReturn(java.lang.String r4, java.lang.String r5) {
            java.lang.String r4 = r4.trim()
            boolean r0 = r4.endsWith(r5)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            int r0 = r4.length()
            int r5 = r5.length()
            int r0 = r0 - r5
            java.lang.String r4 = r4.substring(r1, r0)
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L24
            return r1
        L24:
            java.lang.String r5 = "\\s+"
            java.lang.String[] r4 = r4.split(r5)
            r5 = 0
            r0 = r1
        L2c:
            int r2 = r4.length
            if (r0 >= r2) goto L47
            r2 = r4[r0]
            java.lang.String r3 = "@"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L3a
            goto L44
        L3a:
            java.util.Set<java.lang.String> r3 = bsh.preprocess.DefaultArgsDesugar.METHOD_MODIFIERS
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L43
            goto L44
        L43:
            r5 = r2
        L44:
            int r0 = r0 + 1
            goto L2c
        L47:
            if (r5 != 0) goto L4a
            return r1
        L4a:
            java.lang.String r4 = "void"
            boolean r4 = r4.equals(r5)
            r4 = r4 ^ 1
            return r4
    }

    private static java.lang.String signatureTypeKey(java.lang.String r3) {
            java.lang.String r0 = extractParamName(r3)
            if (r0 != 0) goto Lb
            java.lang.String r3 = normalizeTypeKey(r3)
            return r3
        Lb:
            int r1 = findTrailingNameIndex(r3, r0)
            if (r1 >= 0) goto L16
            java.lang.String r3 = normalizeTypeKey(r3)
            return r3
        L16:
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r1)
            int r0 = r0.length()
            int r0 = r0 + r1
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r3 = r2.concat(r3)
            java.lang.String r3 = normalizeTypeKey(r3)
            return r3
    }

    private static int skipAnnotation(java.lang.String r3, int r4) {
            int r0 = r3.length()
        L4:
            if (r4 >= r0) goto L17
            char r1 = r3.charAt(r4)
            boolean r2 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r2 != 0) goto L14
            r2 = 46
            if (r1 != r2) goto L17
        L14:
            int r4 = r4 + 1
            goto L4
        L17:
            int r4 = skipWsAndCommentsForward(r3, r4)
            if (r4 >= r0) goto L31
            char r1 = r3.charAt(r4)
            r2 = 40
            if (r1 != r2) goto L31
            r1 = 41
            int r3 = findMatching(r3, r4, r2, r1)
            if (r3 >= 0) goto L2e
            return r0
        L2e:
            int r3 = r3 + 1
            return r3
        L31:
            return r4
    }

    private static int skipLiteralOrComment(java.lang.String r4, int r5) {
            int r0 = r4.length()
            if (r5 < 0) goto L88
            if (r5 < r0) goto La
            goto L88
        La:
            java.lang.String r1 = "\"\"\""
            boolean r2 = startsWith(r4, r5, r1)
            if (r2 == 0) goto L1f
            int r5 = r5 + 3
            int r4 = r4.indexOf(r1, r5)
            if (r4 >= 0) goto L1c
            goto L84
        L1c:
            int r4 = r4 + 3
            return r4
        L1f:
            char r1 = r4.charAt(r5)
            r2 = 92
            r3 = 34
            if (r1 != r3) goto L3c
        L29:
            int r5 = r5 + 1
        L2b:
            if (r5 >= r0) goto L84
            char r1 = r4.charAt(r5)
            if (r1 != r2) goto L36
            int r5 = r5 + 2
            goto L2b
        L36:
            if (r1 != r3) goto L3b
            int r5 = r5 + 1
            return r5
        L3b:
            goto L29
        L3c:
            r3 = 39
            if (r1 != r3) goto L53
        L40:
            int r5 = r5 + 1
        L42:
            if (r5 >= r0) goto L84
            char r1 = r4.charAt(r5)
            if (r1 != r2) goto L4d
            int r5 = r5 + 2
            goto L42
        L4d:
            if (r1 != r3) goto L52
            int r5 = r5 + 1
            return r5
        L52:
            goto L40
        L53:
            r2 = 47
            if (r1 != r2) goto L88
            int r1 = r5 + 1
            if (r1 >= r0) goto L88
            char r1 = r4.charAt(r1)
            if (r1 != r2) goto L76
            int r5 = r5 + 2
        L63:
            if (r5 >= r0) goto L75
            char r1 = r4.charAt(r5)
            r2 = 10
            if (r1 == r2) goto L75
            r2 = 13
            if (r1 != r2) goto L72
            goto L75
        L72:
            int r5 = r5 + 1
            goto L63
        L75:
            return r5
        L76:
            r2 = 42
            if (r1 != r2) goto L88
            java.lang.String r1 = "*/"
            int r5 = r5 + 2
            int r4 = r4.indexOf(r1, r5)
            if (r4 >= 0) goto L85
        L84:
            return r0
        L85:
            int r4 = r4 + 2
            return r4
        L88:
            return r5
    }

    private static int skipThrowsClause(java.lang.String r6, int r7) {
            int r7 = skipWsAndCommentsForward(r6, r7)
            java.lang.String r0 = "throws"
            boolean r0 = startsWithWord(r6, r7, r0)
            if (r0 != 0) goto Ld
            return r7
        Ld:
            int r7 = r7 + 6
            int r0 = r6.length()
            r1 = 1
        L14:
            r2 = r1
        L15:
            r3 = -1
            if (r7 >= r0) goto L59
            int r7 = skipWsAndCommentsForward(r6, r7)
            if (r7 < r0) goto L1f
            return r3
        L1f:
            char r4 = r6.charAt(r7)
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 != r5) goto L2b
            if (r2 == 0) goto L2a
            return r3
        L2a:
            return r7
        L2b:
            r5 = 59
            if (r4 != r5) goto L30
            return r3
        L30:
            if (r2 == 0) goto L52
            boolean r2 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r2 != 0) goto L39
            return r3
        L39:
            int r7 = r7 + 1
            if (r7 >= r0) goto L50
            char r2 = r6.charAt(r7)
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L39
            r3 = 46
            if (r2 == r3) goto L39
            r3 = 36
            if (r2 != r3) goto L50
            goto L39
        L50:
            r2 = 0
            goto L15
        L52:
            r2 = 44
            if (r4 != r2) goto L59
            int r7 = r7 + 1
            goto L14
        L59:
            return r3
    }

    private static int skipWsAndCommentsForward(java.lang.String r4, int r5) {
            int r0 = r4.length()
        L4:
            if (r5 >= r0) goto L29
        L6:
            if (r5 >= r0) goto L15
            char r1 = r4.charAt(r5)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 == 0) goto L15
            int r5 = r5 + 1
            goto L6
        L15:
            int r1 = skipLiteralOrComment(r4, r5)
            if (r1 <= r5) goto L29
            int r2 = r5 + 1
            if (r2 >= r0) goto L29
            char r2 = r4.charAt(r5)
            r3 = 47
            if (r2 != r3) goto L29
            r5 = r1
            goto L4
        L29:
            return r5
    }

    private static int skipWsBackward(java.lang.String r1, int r2) {
        L0:
            if (r2 < 0) goto Lf
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto Lf
            int r2 = r2 + (-1)
            goto L0
        Lf:
            return r2
    }

    private static java.util.List<java.lang.String> splitTopLevel(java.lang.String r11, char r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L10:
            if (r3 >= r1) goto L7c
            int r9 = skipLiteralOrComment(r11, r3)
            if (r9 <= r3) goto L1a
            r3 = r9
            goto L10
        L1a:
            char r9 = r11.charAt(r3)
            r10 = 40
            if (r9 != r10) goto L25
            int r5 = r5 + 1
            goto L79
        L25:
            r10 = 41
            if (r9 != r10) goto L30
            int r5 = r5 + (-1)
            int r5 = java.lang.Math.max(r2, r5)
            goto L79
        L30:
            r10 = 91
            if (r9 != r10) goto L37
            int r6 = r6 + 1
            goto L79
        L37:
            r10 = 93
            if (r9 != r10) goto L42
            int r6 = r6 + (-1)
            int r6 = java.lang.Math.max(r2, r6)
            goto L79
        L42:
            r10 = 123(0x7b, float:1.72E-43)
            if (r9 != r10) goto L49
            int r7 = r7 + 1
            goto L79
        L49:
            r10 = 125(0x7d, float:1.75E-43)
            if (r9 != r10) goto L54
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.max(r2, r7)
            goto L79
        L54:
            r10 = 60
            if (r9 != r10) goto L5b
            int r8 = r8 + 1
            goto L79
        L5b:
            r10 = 62
            if (r9 != r10) goto L66
            int r8 = r8 + (-1)
            int r8 = java.lang.Math.max(r2, r8)
            goto L79
        L66:
            if (r9 != r12) goto L79
            if (r5 != 0) goto L79
            if (r6 != 0) goto L79
            if (r7 != 0) goto L79
            if (r8 != 0) goto L79
            java.lang.String r4 = r11.substring(r4, r3)
            r0.add(r4)
            int r4 = r3 + 1
        L79:
            int r3 = r3 + 1
            goto L10
        L7c:
            java.lang.String r11 = r11.substring(r4)
            r0.add(r11)
            return r0
    }

    private static boolean startsWith(java.lang.String r3, int r4, java.lang.String r5) {
            r0 = 0
            if (r4 < 0) goto L1a
            int r1 = r5.length()
            int r1 = r1 + r4
            int r2 = r3.length()
            if (r1 > r2) goto L1a
            int r1 = r5.length()
            boolean r3 = r3.regionMatches(r4, r5, r0, r1)
            if (r3 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            return r0
    }

    private static boolean startsWithWord(java.lang.String r3, int r4, java.lang.String r5) {
            r0 = 0
            if (r4 < 0) goto L42
            int r1 = r5.length()
            int r1 = r1 + r4
            int r2 = r3.length()
            if (r1 <= r2) goto Lf
            goto L42
        Lf:
            int r1 = r5.length()
            boolean r1 = r3.regionMatches(r4, r5, r0, r1)
            if (r1 != 0) goto L1a
            return r0
        L1a:
            int r1 = r4 + (-1)
            if (r1 < 0) goto L29
            char r1 = r3.charAt(r1)
            boolean r1 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r1 == 0) goto L29
            return r0
        L29:
            int r5 = r5.length()
            int r5 = r5 + r4
            int r4 = r3.length()
            if (r5 >= r4) goto L40
            char r3 = r3.charAt(r5)
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            return r0
        L40:
            r3 = 1
            return r3
        L42:
            return r0
    }

    private static bsh.preprocess.DefaultArgsDesugar.MethodShape tryParseMethodShape(java.lang.String r7, int r8) {
            int r0 = r8 + (-1)
            int r0 = skipWsBackward(r7, r0)
            int r0 = r0 + 1
            r1 = r0
        L9:
            if (r1 <= 0) goto L1a
            int r2 = r1 + (-1)
            char r2 = r7.charAt(r2)
            boolean r2 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r2 == 0) goto L1a
            int r1 = r1 + (-1)
            goto L9
        L1a:
            r2 = 0
            if (r1 < r0) goto L1e
            return r2
        L1e:
            java.lang.String r0 = r7.substring(r1, r0)
            r3 = 0
            char r3 = r0.charAt(r3)
            boolean r3 = java.lang.Character.isJavaIdentifierStart(r3)
            if (r3 == 0) goto L9c
            java.util.Set<java.lang.String> r3 = bsh.preprocess.DefaultArgsDesugar.CONTROL_KEYWORDS
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            goto L9c
        L36:
            int r3 = r1 + (-1)
            int r3 = skipWsBackward(r7, r3)
            if (r3 < 0) goto L4f
            char r3 = r7.charAt(r3)
            r4 = 46
            if (r3 == r4) goto L4e
            r4 = 58
            if (r3 == r4) goto L4e
            r4 = 36
            if (r3 != r4) goto L4f
        L4e:
            return r2
        L4f:
            r3 = 40
            r4 = 41
            int r3 = findMatching(r7, r8, r3, r4)
            if (r3 >= 0) goto L5a
            return r2
        L5a:
            int r4 = r3 + 1
            int r5 = skipWsAndCommentsForward(r7, r4)
            int r6 = r7.length()
            if (r5 >= r6) goto L6f
            java.lang.String r6 = "->"
            boolean r5 = r7.startsWith(r6, r5)
            if (r5 == 0) goto L6f
            return r2
        L6f:
            int r4 = findMethodBodyStart(r7, r4)
            if (r4 >= 0) goto L76
            return r2
        L76:
            r5 = 123(0x7b, float:1.72E-43)
            r6 = 125(0x7d, float:1.75E-43)
            int r4 = findMatching(r7, r4, r5, r6)
            if (r4 >= 0) goto L81
            return r2
        L81:
            int r8 = r8 + 1
            java.lang.String r8 = r7.substring(r8, r3)
            bsh.preprocess.DefaultArgsDesugar$ParsedParams r8 = parseParams(r8)
            boolean r3 = r8.valid
            if (r3 != 0) goto L90
            return r2
        L90:
            int r7 = findDeclarationStart(r7, r1)
            bsh.preprocess.DefaultArgsDesugar$MethodShape r1 = new bsh.preprocess.DefaultArgsDesugar$MethodShape
            int r4 = r4 + 1
            r1.<init>(r7, r4, r0, r8)
            return r1
        L9c:
            return r2
    }

    private static bsh.preprocess.DefaultArgsDesugar.MethodRewrite tryRewriteMethod(java.lang.String r9, int r10, java.util.Set<java.lang.String> r11) {
            bsh.preprocess.DefaultArgsDesugar$MethodShape r0 = tryParseMethodShape(r9, r10)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            bsh.preprocess.DefaultArgsDesugar$ParsedParams r6 = r0.parsed
            boolean r2 = r6.valid
            if (r2 == 0) goto L4e
            boolean r2 = r6.hasDefault
            if (r2 == 0) goto L4e
            boolean r2 = r6.trailingDefaults
            if (r2 != 0) goto L17
            goto L4e
        L17:
            int r8 = r0.declStart
            r2 = 40
            r3 = 41
            int r2 = findMatching(r9, r10, r2, r3)
            java.lang.String r10 = r9.substring(r8, r10)
            int r2 = r2 + 1
            int r3 = findMethodBodyStart(r9, r2)
            if (r3 >= 0) goto L2e
            return r1
        L2e:
            java.lang.String r4 = r9.substring(r2, r3)
            r1 = 123(0x7b, float:1.72E-43)
            r2 = 125(0x7d, float:1.75E-43)
            int r1 = findMatching(r9, r3, r1, r2)
            int r1 = r1 + 1
            java.lang.String r5 = r9.substring(r3, r1)
            java.lang.String r3 = r0.methodName
            r2 = r10
            r7 = r11
            java.lang.String r9 = buildRewrittenMethod(r2, r3, r4, r5, r6, r7)
            bsh.preprocess.DefaultArgsDesugar$MethodRewrite r10 = new bsh.preprocess.DefaultArgsDesugar$MethodRewrite
            r10.<init>(r8, r1, r9)
            return r10
        L4e:
            return r1
    }
}
