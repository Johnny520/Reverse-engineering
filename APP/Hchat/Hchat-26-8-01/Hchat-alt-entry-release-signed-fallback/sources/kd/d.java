package kd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f7584a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f7585b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f7586c = null;

    static {
            java.lang.String r0 = "\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            kd.d.f7584a = r0
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "("
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "\\.)*"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            kd.d.f7585b = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r53 = "volatile"
            java.lang.String r54 = "while"
            java.lang.String r1 = "_"
            java.lang.String r2 = "abstract"
            java.lang.String r3 = "assert"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "break"
            java.lang.String r6 = "byte"
            java.lang.String r7 = "case"
            java.lang.String r8 = "catch"
            java.lang.String r9 = "char"
            java.lang.String r10 = "class"
            java.lang.String r11 = "const"
            java.lang.String r12 = "continue"
            java.lang.String r13 = "default"
            java.lang.String r14 = "do"
            java.lang.String r15 = "double"
            java.lang.String r16 = "else"
            java.lang.String r17 = "enum"
            java.lang.String r18 = "extends"
            java.lang.String r19 = "false"
            java.lang.String r20 = "final"
            java.lang.String r21 = "finally"
            java.lang.String r22 = "float"
            java.lang.String r23 = "for"
            java.lang.String r24 = "goto"
            java.lang.String r25 = "if"
            java.lang.String r26 = "implements"
            java.lang.String r27 = "import"
            java.lang.String r28 = "instanceof"
            java.lang.String r29 = "int"
            java.lang.String r30 = "interface"
            java.lang.String r31 = "long"
            java.lang.String r32 = "native"
            java.lang.String r33 = "new"
            java.lang.String r34 = "null"
            java.lang.String r35 = "package"
            java.lang.String r36 = "private"
            java.lang.String r37 = "protected"
            java.lang.String r38 = "public"
            java.lang.String r39 = "return"
            java.lang.String r40 = "short"
            java.lang.String r41 = "static"
            java.lang.String r42 = "strictfp"
            java.lang.String r43 = "super"
            java.lang.String r44 = "switch"
            java.lang.String r45 = "synchronized"
            java.lang.String r46 = "this"
            java.lang.String r47 = "throw"
            java.lang.String r48 = "throws"
            java.lang.String r49 = "transient"
            java.lang.String r50 = "true"
            java.lang.String r51 = "try"
            java.lang.String r52 = "void"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            kd.d.f7586c = r0
            return
    }

    public static boolean a(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L19
            int r3 = r5.codePointAt(r2)
            boolean r4 = b(r3)
            if (r4 != 0) goto L13
            return r1
        L13:
            int r3 = java.lang.Character.charCount(r3)
            int r2 = r2 + r3
            goto L6
        L19:
            r5 = 1
            return r5
    }

    public static boolean b(int r1) {
            r0 = 32
            if (r0 > r1) goto La
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean c(java.lang.String r1) {
            boolean r0 = d(r1)
            if (r0 == 0) goto Le
            boolean r1 = a(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean d(java.lang.String r1) {
            xe.q r0 = xe.q.f21574b
            if (r1 == 0) goto L20
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L20
            java.util.HashSet r0 = kd.d.f7586c
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L20
            java.util.regex.Pattern r0 = kd.d.f7584a
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.String e(java.lang.String r3) {
            boolean r0 = d(r3)
            if (r0 == 0) goto Ld
            boolean r0 = a(r3)
            if (r0 == 0) goto Ld
            return r3
        Ld:
            int r0 = r3.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            kd.c r0 = new kd.c
            r2 = 1
            r0.<init>(r1, r2)
            xe.q.j(r3, r0)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
