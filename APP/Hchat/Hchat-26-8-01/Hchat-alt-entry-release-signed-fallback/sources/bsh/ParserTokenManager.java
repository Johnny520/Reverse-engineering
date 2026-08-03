package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ParserTokenManager implements bsh.ParserConstants {
    static final long[] jjbitVec0 = null;
    static final long[] jjbitVec1 = null;
    static final long[] jjbitVec3 = null;
    static final long[] jjbitVec4 = null;
    static final long[] jjbitVec5 = null;
    static final long[] jjbitVec6 = null;
    static final long[] jjbitVec7 = null;
    static final long[] jjbitVec8 = null;
    public static final int[] jjnewLexState = null;
    static final int[] jjnextStates = null;
    public static final java.lang.String[] jjstrLiteralImages = null;
    static final long[] jjtoMore = null;
    static final long[] jjtoSkip = null;
    static final long[] jjtoSpecial = null;
    static final long[] jjtoToken = null;
    public static final java.lang.String[] lexStateNames = null;
    protected int curChar;
    int curLexState;
    int defaultLexState;
    private java.lang.StringBuilder image;
    protected bsh.JavaCharStream input_stream;
    private final java.lang.StringBuilder jjimage;
    private int jjimageLen;
    int jjmatchedKind;
    int jjmatchedPos;
    int jjnewStateCnt;
    int jjround;
    private final int[] jjrounds;
    private final int[] jjstateSet;
    private int lengthOfMatch;

    static {
            r0 = 4
            long[] r1 = new long[r0]
            r1 = {x01a4: FILL_ARRAY_DATA , data: [0, 0, -1, -1} // fill-array
            bsh.ParserTokenManager.jjbitVec0 = r1
            long[] r1 = new long[r0]
            r1 = {x01b8: FILL_ARRAY_DATA , data: [-2, -1, -1, -1} // fill-array
            bsh.ParserTokenManager.jjbitVec1 = r1
            long[] r1 = new long[r0]
            r1 = {x01cc: FILL_ARRAY_DATA , data: [2301339413881290750, -16384, 4294967295, 432345564227567616} // fill-array
            bsh.ParserTokenManager.jjbitVec3 = r1
            long[] r1 = new long[r0]
            r1 = {x01e0: FILL_ARRAY_DATA , data: [0, 0, 0, -36028797027352577} // fill-array
            bsh.ParserTokenManager.jjbitVec4 = r1
            long[] r1 = new long[r0]
            r1 = {x01f4: FILL_ARRAY_DATA , data: [0, -1, -1, -1} // fill-array
            bsh.ParserTokenManager.jjbitVec5 = r1
            long[] r1 = new long[r0]
            r1 = {x0208: FILL_ARRAY_DATA , data: [-1, -1, 65535, 0} // fill-array
            bsh.ParserTokenManager.jjbitVec6 = r1
            long[] r1 = new long[r0]
            r1 = {x021c: FILL_ARRAY_DATA , data: [-1, -1, 0, 0} // fill-array
            bsh.ParserTokenManager.jjbitVec7 = r1
            long[] r0 = new long[r0]
            r0 = {x0230: FILL_ARRAY_DATA , data: [70368744177663, 0, 0, 0} // fill-array
            bsh.ParserTokenManager.jjbitVec8 = r0
            java.lang.String r154 = "?."
            java.lang.String r155 = "default:"
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r12 = "abstract"
            java.lang.String r13 = "boolean"
            java.lang.String r14 = "break"
            java.lang.String r15 = "class"
            java.lang.String r16 = "byte"
            java.lang.String r17 = "case"
            java.lang.String r18 = "catch"
            java.lang.String r19 = "char"
            java.lang.String r20 = "const"
            java.lang.String r21 = "continue"
            java.lang.String r22 = "default"
            java.lang.String r23 = "do"
            java.lang.String r24 = "double"
            java.lang.String r25 = "else"
            java.lang.String r26 = "enum"
            java.lang.String r27 = "extends"
            java.lang.String r28 = "false"
            java.lang.String r29 = "final"
            java.lang.String r30 = "finally"
            java.lang.String r31 = "float"
            java.lang.String r32 = "for"
            java.lang.String r33 = "goto"
            java.lang.String r34 = "if"
            java.lang.String r35 = "implements"
            java.lang.String r36 = "import"
            java.lang.String r37 = "instanceof"
            java.lang.String r38 = "int"
            java.lang.String r39 = "interface"
            java.lang.String r40 = "long"
            java.lang.String r41 = "native"
            java.lang.String r42 = "new"
            java.lang.String r43 = "null"
            java.lang.String r44 = "package"
            java.lang.String r45 = "private"
            java.lang.String r46 = "protected"
            java.lang.String r47 = "public"
            java.lang.String r48 = "return"
            java.lang.String r49 = "short"
            java.lang.String r50 = "static"
            java.lang.String r51 = "strictfp"
            java.lang.String r52 = "switch"
            java.lang.String r53 = "synchronized"
            java.lang.String r54 = "transient"
            java.lang.String r55 = "throw"
            java.lang.String r56 = "throws"
            java.lang.String r57 = "true"
            java.lang.String r58 = "try"
            java.lang.String r59 = "void"
            java.lang.String r60 = "volatile"
            java.lang.String r61 = "when"
            java.lang.String r62 = "while"
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            java.lang.String r77 = "("
            java.lang.String r78 = ")"
            java.lang.String r79 = "{"
            java.lang.String r80 = "}"
            java.lang.String r81 = "["
            java.lang.String r82 = "]"
            java.lang.String r83 = ";"
            java.lang.String r84 = ","
            java.lang.String r85 = "."
            java.lang.String r86 = "="
            java.lang.String r87 = ">"
            java.lang.String r88 = "@gt"
            java.lang.String r89 = "<"
            java.lang.String r90 = "@lt"
            java.lang.String r91 = "!"
            java.lang.String r92 = "~"
            java.lang.String r93 = "=="
            java.lang.String r94 = "<="
            java.lang.String r95 = "@lteq"
            java.lang.String r96 = ">="
            java.lang.String r97 = "@gteq"
            java.lang.String r98 = "!="
            java.lang.String r99 = "||"
            java.lang.String r100 = "@or"
            java.lang.String r101 = "&&"
            java.lang.String r102 = "@and"
            java.lang.String r103 = "++"
            java.lang.String r104 = "--"
            java.lang.String r105 = "+"
            java.lang.String r106 = "-"
            java.lang.String r107 = "*"
            java.lang.String r108 = "/"
            java.lang.String r109 = "&"
            java.lang.String r110 = "@bitwise_and"
            java.lang.String r111 = "|"
            java.lang.String r112 = "@bitwise_or"
            java.lang.String r113 = "^"
            java.lang.String r114 = "@bitwise_xor"
            java.lang.String r115 = "%"
            java.lang.String r116 = "@mod"
            java.lang.String r117 = "**"
            java.lang.String r118 = "@pow"
            java.lang.String r119 = "<<"
            java.lang.String r120 = "@left_shift"
            java.lang.String r121 = ">>"
            java.lang.String r122 = "@right_shift"
            java.lang.String r123 = ">>>"
            java.lang.String r124 = "@right_unsigned_shift"
            java.lang.String r125 = "+="
            java.lang.String r126 = "-="
            java.lang.String r127 = "*="
            java.lang.String r128 = "/="
            java.lang.String r129 = "&="
            java.lang.String r130 = "@and_assign"
            java.lang.String r131 = "|="
            java.lang.String r132 = "@or_assign"
            java.lang.String r133 = "^="
            java.lang.String r134 = "@xor_assign"
            java.lang.String r135 = "%="
            java.lang.String r136 = "@mod_assign"
            java.lang.String r137 = "**="
            java.lang.String r138 = "@pow_assign"
            java.lang.String r139 = "<<="
            java.lang.String r140 = "@left_shift_assign"
            java.lang.String r141 = ">>="
            java.lang.String r142 = "@right_shift_assign"
            java.lang.String r143 = ">>>="
            java.lang.String r144 = "@right_unsigned_shift_assign"
            java.lang.String r145 = "->"
            java.lang.String r146 = "<=>"
            java.lang.String r147 = "??="
            java.lang.String r148 = "??"
            java.lang.String r149 = "?:"
            java.lang.String r150 = "?"
            java.lang.String r151 = ":"
            java.lang.String r152 = "::"
            java.lang.String r153 = "..."
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155}
            bsh.ParserTokenManager.jjstrLiteralImages = r0
            r0 = 53
            int[] r0 = new int[r0]
            r0 = {x0244: FILL_ARRAY_DATA , data: [2, 4, 6, 7, 44, 45, 50, 51, 55, 56, 59, 60, 69, 74, 24, 25, 27, 62, 64, 67, 16, 29, 30, 32, 70, 71, 73, 9, 10, 12, 18, 19, 22, 34, 35, 38, 46, 47, 22, 65, 66, 16, 76, 77, 79, 20, 21, 48, 49, 53, 54, 57, 58} // fill-array
            bsh.ParserTokenManager.jjnextStates = r0
            java.lang.String r0 = "DEFAULT"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            bsh.ParserTokenManager.lexStateNames = r0
            r0 = 155(0x9b, float:2.17E-43)
            int[] r0 = new int[r0]
            r0 = {x02b2: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1} // fill-array
            bsh.ParserTokenManager.jjnewLexState = r0
            r0 = 3
            long[] r1 = new long[r0]
            r1 = {x03ec: FILL_ARRAY_DATA , data: [9223372036854773761, -3128, 134217727} // fill-array
            bsh.ParserTokenManager.jjtoToken = r1
            long[] r1 = new long[r0]
            r1 = {x03fc: FILL_ARRAY_DATA , data: [2046, 0, 0} // fill-array
            bsh.ParserTokenManager.jjtoSkip = r1
            long[] r1 = new long[r0]
            r1 = {x040c: FILL_ARRAY_DATA , data: [1792, 0, 0} // fill-array
            bsh.ParserTokenManager.jjtoSpecial = r1
            long[] r0 = new long[r0]
            r0 = {x041c: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            bsh.ParserTokenManager.jjtoMore = r0
            return
    }

    public ParserTokenManager(bsh.JavaCharStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.curLexState = r0
            r1.defaultLexState = r0
            r0 = 80
            int[] r0 = new int[r0]
            r1.jjrounds = r0
            r0 = 160(0xa0, float:2.24E-43)
            int[] r0 = new int[r0]
            r1.jjstateSet = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.jjimage = r0
            r1.image = r0
            r1.input_stream = r2
            return
    }

    public ParserTokenManager(bsh.JavaCharStream r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.curLexState = r0
            r1.defaultLexState = r0
            r0 = 80
            int[] r0 = new int[r0]
            r1.jjrounds = r0
            r0 = 160(0xa0, float:2.24E-43)
            int[] r0 = new int[r0]
            r1.jjstateSet = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.jjimage = r0
            r1.image = r0
            r1.ReInit(r2)
            r1.SwitchTo(r3)
            return
    }

    private void ReInitRounds() {
            r3 = this;
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r3.jjround = r0
            r0 = 80
        L7:
            int r1 = r0 + (-1)
            if (r0 <= 0) goto L13
            int[] r0 = r3.jjrounds
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0[r1] = r2
            r0 = r1
            goto L7
        L13:
            return
    }

    private void jjAddStates(int r4, int r5) {
            r3 = this;
        L0:
            int[] r0 = r3.jjstateSet
            int r1 = r3.jjnewStateCnt
            int r2 = r1 + 1
            r3.jjnewStateCnt = r2
            int[] r2 = bsh.ParserTokenManager.jjnextStates
            r2 = r2[r4]
            r0[r1] = r2
            int r0 = r4 + 1
            if (r4 != r5) goto L13
            return
        L13:
            r4 = r0
            goto L0
    }

    private static final boolean jjCanMove_0(int r0, int r1, int r2, long r3, long r5) {
            r1 = 0
            if (r0 == 0) goto L4
            return r1
        L4:
            long[] r0 = bsh.ParserTokenManager.jjbitVec0
            r2 = r0[r2]
            long r2 = r2 & r5
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            return r1
    }

    private static final boolean jjCanMove_1(int r4, int r5, int r6, long r7, long r9) {
            r0 = 0
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L12
            long[] r4 = bsh.ParserTokenManager.jjbitVec1
            r5 = r4[r5]
            long r4 = r5 & r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L11
            return r1
        L11:
            return r0
        L12:
            long[] r4 = bsh.ParserTokenManager.jjbitVec0
            r5 = r4[r6]
            long r4 = r5 & r9
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            return r1
        L1d:
            return r0
    }

    private static final boolean jjCanMove_2(int r5, int r6, int r7, long r8, long r10) {
            r0 = 0
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L52
            r4 = 51
            if (r5 == r4) goto L46
            r4 = 61
            if (r5 == r4) goto L3a
            r4 = 48
            if (r5 == r4) goto L2e
            r4 = 49
            if (r5 == r4) goto L22
            long[] r5 = bsh.ParserTokenManager.jjbitVec3
            r6 = r5[r6]
            long r5 = r6 & r8
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L21
            return r1
        L21:
            return r0
        L22:
            long[] r5 = bsh.ParserTokenManager.jjbitVec6
            r6 = r5[r7]
            long r5 = r6 & r10
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L2d
            return r1
        L2d:
            return r0
        L2e:
            long[] r5 = bsh.ParserTokenManager.jjbitVec5
            r6 = r5[r7]
            long r5 = r6 & r10
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L39
            return r1
        L39:
            return r0
        L3a:
            long[] r5 = bsh.ParserTokenManager.jjbitVec8
            r6 = r5[r7]
            long r5 = r6 & r10
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L45
            return r1
        L45:
            return r0
        L46:
            long[] r5 = bsh.ParserTokenManager.jjbitVec7
            r6 = r5[r7]
            long r5 = r6 & r10
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L51
            return r1
        L51:
            return r0
        L52:
            long[] r5 = bsh.ParserTokenManager.jjbitVec4
            r6 = r5[r7]
            long r5 = r6 & r10
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L5d
            return r1
        L5d:
            return r0
    }

    private void jjCheckNAdd(int r6) {
            r5 = this;
            int[] r0 = r5.jjrounds
            r1 = r0[r6]
            int r2 = r5.jjround
            if (r1 == r2) goto L14
            int[] r1 = r5.jjstateSet
            int r3 = r5.jjnewStateCnt
            int r4 = r3 + 1
            r5.jjnewStateCnt = r4
            r1[r3] = r6
            r0[r6] = r2
        L14:
            return
    }

    private void jjCheckNAddStates(int r2, int r3) {
            r1 = this;
        L0:
            int[] r0 = bsh.ParserTokenManager.jjnextStates
            r0 = r0[r2]
            r1.jjCheckNAdd(r0)
            int r0 = r2 + 1
            if (r2 != r3) goto Lc
            return
        Lc:
            r2 = r0
            goto L0
    }

    private void jjCheckNAddTwoStates(int r1, int r2) {
            r0 = this;
            r0.jjCheckNAdd(r1)
            r0.jjCheckNAdd(r2)
            return
    }

    private int jjMoveNfa_0(int r38, int r39) {
            r37 = this;
            r0 = r37
            r1 = 80
            r0.jjnewStateCnt = r1
            int[] r1 = r0.jjstateSet
            r2 = 0
            r1[r2] = r38
            r1 = 1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            r6 = r2
            r4 = r3
            r3 = r39
        L14:
            int r7 = r0.jjround
            int r7 = r7 + r1
            r0.jjround = r7
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != r8) goto L21
            r0.ReInitRounds()
        L21:
            int r7 = r0.curChar
            r8 = 64
            r10 = 26
            r11 = 75
            r15 = 76
            r13 = 3
            r1 = 42
            r9 = 8
            r12 = 62
            r22 = 0
            if (r7 >= r8) goto L59c
            r24 = 1
            long r24 = r24 << r7
        L3a:
            int[] r7 = r0.jjstateSet
            int r5 = r5 + (-1)
            r8 = r7[r5]
            r14 = 7
            r27 = 287948901175001088(0x3ff000000000000, double:1.988135013128901E-289)
            switch(r8) {
                case 0: goto L581;
                case 1: goto L4dc;
                case 2: goto L4cc;
                case 3: goto L4c1;
                case 4: goto L4b1;
                case 5: goto L4a6;
                case 6: goto L497;
                case 7: goto L489;
                case 8: goto L47a;
                case 9: goto L469;
                case 10: goto L45c;
                case 11: goto L44e;
                case 12: goto L43c;
                case 13: goto L42c;
                case 14: goto L416;
                case 15: goto L402;
                case 16: goto L46;
                case 17: goto L3f5;
                case 18: goto L3de;
                case 19: goto L46;
                case 20: goto L3cc;
                case 21: goto L3b5;
                case 22: goto L46;
                case 23: goto L3a6;
                case 24: goto L392;
                case 25: goto L46;
                case 26: goto L389;
                case 27: goto L37b;
                case 28: goto L36c;
                case 29: goto L358;
                case 30: goto L46;
                case 31: goto L34f;
                case 32: goto L341;
                case 33: goto L334;
                case 34: goto L320;
                case 35: goto L334;
                case 36: goto L312;
                case 37: goto L300;
                case 38: goto L2ee;
                case 39: goto L2dc;
                case 40: goto L2ca;
                case 41: goto L2b7;
                case 42: goto L29a;
                case 43: goto L28c;
                case 44: goto L27d;
                case 45: goto L270;
                case 46: goto L259;
                case 47: goto L46;
                case 48: goto L247;
                case 49: goto L230;
                case 50: goto L221;
                case 51: goto L20f;
                case 52: goto L46;
                case 53: goto L1fd;
                case 54: goto L1e6;
                case 55: goto L1d7;
                case 56: goto L46;
                case 57: goto L1c5;
                case 58: goto L1ae;
                case 59: goto L19f;
                case 60: goto L46;
                case 61: goto L18b;
                case 62: goto L46;
                case 63: goto L177;
                case 64: goto L46;
                case 65: goto L161;
                case 66: goto L14d;
                case 67: goto L137;
                case 68: goto L128;
                case 69: goto L111;
                case 70: goto Lfd;
                case 71: goto Lf2;
                case 72: goto Le7;
                case 73: goto Ld5;
                case 74: goto Lcc;
                case 75: goto Lbc;
                case 76: goto Lb1;
                case 77: goto L9f;
                case 78: goto L8d;
                case 79: goto L7f;
                case 80: goto L48;
                default: goto L46;
            }
        L46:
            goto L594
        L48:
            r27 = -7493990054822421505(0x97ffffbfffffdbff, double:-4.3834849205862334E-193)
            long r27 = r24 & r27
            int r8 = (r27 > r22 ? 1 : (r27 == r22 ? 0 : -1))
            if (r8 == 0) goto L57
            r0.jjCheckNAddStates(r2, r13)
            goto L6e
        L57:
            int r8 = r0.curChar
            if (r8 != r12) goto L62
            if (r4 <= r14) goto L5e
            r4 = r14
        L5e:
            r0.jjCheckNAdd(r14)
            goto L6e
        L62:
            r14 = 38
            if (r8 != r14) goto L6e
            int r8 = r0.jjnewStateCnt
            int r14 = r8 + 1
            r0.jjnewStateCnt = r14
            r7[r8] = r13
        L6e:
            int r7 = r0.curChar
            if (r7 != r12) goto L594
            int[] r7 = r0.jjstateSet
            int r8 = r0.jjnewStateCnt
            int r14 = r8 + 1
            r0.jjnewStateCnt = r14
            r14 = 5
            r7[r8] = r14
            goto L594
        L7f:
            int r7 = r0.curChar
            r8 = 47
            if (r7 != r8) goto L594
            r7 = 10
            if (r4 <= r7) goto L594
            r4 = 10
            goto L594
        L8d:
            r7 = -4398046511105(0xfffffbffffffffff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 78
            r0.jjCheckNAddTwoStates(r7, r15)
            goto L594
        L9f:
            r7 = -145135534866433(0xffff7bffffffffff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 78
            r0.jjCheckNAddTwoStates(r7, r15)
            goto L594
        Lb1:
            int r7 = r0.curChar
            if (r7 != r1) goto L594
            r7 = 44
            r0.jjCheckNAddStates(r1, r7)
            goto L594
        Lbc:
            r7 = -4398046511105(0xfffffbffffffffff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r0.jjCheckNAddTwoStates(r11, r15)
            goto L594
        Lcc:
            int r7 = r0.curChar
            if (r7 != r1) goto L594
            r0.jjCheckNAddTwoStates(r11, r15)
            goto L594
        Ld5:
            int r8 = r0.curChar
            r14 = 13
            if (r8 != r14) goto L594
            int r8 = r0.jjnewStateCnt
            int r14 = r8 + 1
            r0.jjnewStateCnt = r14
            r14 = 72
            r7[r8] = r14
            goto L594
        Le7:
            int r7 = r0.curChar
            r8 = 10
            if (r7 != r8) goto L594
            if (r4 <= r9) goto L594
        Lef:
            r4 = r9
            goto L594
        Lf2:
            r7 = 9216(0x2400, double:4.5533E-320)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            if (r4 <= r9) goto L594
            goto Lef
        Lfd:
            r7 = -9217(0xffffffffffffdbff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L107
            goto L594
        L107:
            if (r4 <= r9) goto L10a
            r4 = r9
        L10a:
            r7 = 24
            r0.jjCheckNAddStates(r7, r10)
            goto L594
        L111:
            int r7 = r0.curChar
            if (r7 != r1) goto L11a
            r0.jjCheckNAddTwoStates(r11, r15)
            goto L594
        L11a:
            r8 = 47
            if (r7 != r8) goto L594
            if (r4 <= r9) goto L121
            r4 = r9
        L121:
            r7 = 24
            r0.jjCheckNAddStates(r7, r10)
            goto L594
        L128:
            int r7 = r0.curChar
            r8 = 47
            if (r7 != r8) goto L594
            r7 = 12
            r8 = 13
            r0.jjAddStates(r7, r8)
            goto L594
        L137:
            r7 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L141
            goto L594
        L141:
            if (r4 <= r12) goto L144
            r4 = r12
        L144:
            r7 = 16
            r8 = 67
            r0.jjCheckNAddTwoStates(r8, r7)
            goto L594
        L14d:
            r7 = 16
            r27 = 844424930131968(0x3000000000000, double:4.172013484701003E-309)
            long r27 = r24 & r27
            int r8 = (r27 > r22 ? 1 : (r27 == r22 ? 0 : -1))
            if (r8 != 0) goto L159
            goto L594
        L159:
            if (r4 <= r12) goto L15c
            r4 = r12
        L15c:
            r0.jjCheckNAdd(r7)
            goto L594
        L161:
            r7 = 844424930131968(0x3000000000000, double:4.172013484701003E-309)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L16b
            goto L594
        L16b:
            if (r4 <= r12) goto L16e
            r4 = r12
        L16e:
            r7 = 41
            r8 = 39
            r0.jjCheckNAddStates(r8, r7)
            goto L594
        L177:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L17f
            goto L594
        L17f:
            if (r4 <= r12) goto L182
            r4 = r12
        L182:
            r7 = 63
            r8 = 16
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L18b:
            int r7 = r0.curChar
            r8 = 48
            if (r7 == r8) goto L193
            goto L594
        L193:
            if (r4 <= r12) goto L196
            r4 = r12
        L196:
            r7 = 17
            r8 = 20
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L19f:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 59
            r8 = 60
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L1ae:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L1b6
            goto L594
        L1b6:
            r8 = 67
            if (r4 <= r8) goto L1bc
            r4 = 67
        L1bc:
            r7 = 58
            r8 = 22
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L1c5:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 58
            r0.jjCheckNAdd(r7)
            goto L594
        L1d7:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 55
            r8 = 56
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L1e6:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L1ee
            goto L594
        L1ee:
            r8 = 67
            if (r4 <= r8) goto L1f4
            r4 = 67
        L1f4:
            r7 = 54
            r8 = 22
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L1fd:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 54
            r0.jjCheckNAdd(r7)
            goto L594
        L20f:
            int r8 = r0.curChar
            r14 = 46
            if (r8 != r14) goto L594
            int r8 = r0.jjnewStateCnt
            int r14 = r8 + 1
            r0.jjnewStateCnt = r14
            r14 = 52
            r7[r8] = r14
            goto L594
        L221:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 50
            r8 = 51
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L230:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L238
            goto L594
        L238:
            r8 = 67
            if (r4 <= r8) goto L23e
            r4 = 67
        L23e:
            r7 = 49
            r8 = 22
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L247:
            r7 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 49
            r0.jjCheckNAdd(r7)
            goto L594
        L259:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L261
            goto L594
        L261:
            r8 = 67
            if (r4 <= r8) goto L267
            r4 = 67
        L267:
            r7 = 36
            r8 = 38
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L270:
            int r7 = r0.curChar
            r8 = 46
            if (r7 != r8) goto L594
            r7 = 46
            r0.jjCheckNAdd(r7)
            goto L594
        L27d:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 44
            r8 = 45
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L28c:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 4
            r8 = 11
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L29a:
            r7 = 287948969894477824(0x3ff001000000000, double:1.9881506706942136E-289)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L2a7
            goto L594
        L2a7:
            r7 = 73
            if (r4 <= r7) goto L2ae
            r19 = r7
            goto L2b0
        L2ae:
            r19 = r4
        L2b0:
            r0.jjCheckNAdd(r1)
            r4 = r19
            goto L594
        L2b7:
            r7 = 73
            int r8 = r0.curChar
            r14 = 36
            if (r8 == r14) goto L2c1
            goto L594
        L2c1:
            if (r4 <= r7) goto L2c5
            r4 = 73
        L2c5:
            r0.jjCheckNAdd(r1)
            goto L594
        L2ca:
            int r8 = r0.curChar
            r14 = 34
            if (r8 != r14) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r21 = 39
            r7[r8] = r21
            goto L594
        L2dc:
            r14 = 34
            int r8 = r0.curChar
            if (r8 != r14) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r10 = 33
            r7[r8] = r10
            goto L594
        L2ee:
            r14 = 34
            int r8 = r0.curChar
            if (r8 != r14) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r10 = 37
            r7[r8] = r10
            goto L594
        L300:
            r14 = 34
            int r8 = r0.curChar
            if (r8 != r14) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r10 = 36
            r7[r8] = r10
            goto L594
        L312:
            r14 = 34
            int r7 = r0.curChar
            if (r7 != r14) goto L594
            r7 = 72
            if (r4 <= r7) goto L594
            r4 = 72
            goto L594
        L320:
            r7 = -17179869185(0xfffffffbffffffff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 33
            r8 = 35
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L334:
            int r7 = r0.curChar
            r14 = 34
            if (r7 != r14) goto L594
            r7 = 38
            r0.jjCheckNAddTwoStates(r14, r7)
            goto L594
        L341:
            r14 = 34
            int r7 = r0.curChar
            if (r7 != r14) goto L594
            r7 = 71
            if (r4 <= r7) goto L594
            r4 = 71
            goto L594
        L34f:
            r7 = 23
            r8 = 21
            r0.jjCheckNAddStates(r8, r7)
            goto L594
        L358:
            r7 = 23
            r8 = 21
            r17 = -17179878401(0xfffffffbffffdbff, double:NaN)
            long r17 = r24 & r17
            int r10 = (r17 > r22 ? 1 : (r17 == r22 ? 0 : -1))
            if (r10 == 0) goto L594
            r0.jjCheckNAddStates(r8, r7)
            goto L594
        L36c:
            r7 = 23
            r8 = 21
            int r10 = r0.curChar
            r14 = 34
            if (r10 != r14) goto L594
            r0.jjCheckNAddStates(r8, r7)
            goto L594
        L37b:
            int r7 = r0.curChar
            r8 = 39
            if (r7 != r8) goto L594
            r7 = 70
            if (r4 <= r7) goto L594
            r4 = 70
            goto L594
        L389:
            r7 = 14
            r8 = 16
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L392:
            r7 = 14
            r8 = 16
            r27 = -549755823105(0xffffff7fffffdbff, double:NaN)
            long r27 = r24 & r27
            int r10 = (r27 > r22 ? 1 : (r27 == r22 ? 0 : -1))
            if (r10 == 0) goto L594
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L3a6:
            r7 = 14
            r8 = 16
            int r10 = r0.curChar
            r14 = 39
            if (r10 != r14) goto L594
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L3b5:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L3bd
            goto L594
        L3bd:
            r8 = 67
            if (r4 <= r8) goto L3c3
            r4 = 67
        L3c3:
            r7 = 22
            r8 = 21
            r0.jjCheckNAddTwoStates(r8, r7)
            goto L594
        L3cc:
            r8 = 21
            r27 = 43980465111040(0x280000000000, double:2.17292368994844E-310)
            long r27 = r24 & r27
            int r7 = (r27 > r22 ? 1 : (r27 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r0.jjCheckNAdd(r8)
            goto L594
        L3de:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L3e6
            goto L594
        L3e6:
            r8 = 67
            if (r4 <= r8) goto L3ec
            r4 = 67
        L3ec:
            r7 = 30
            r8 = 32
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L3f5:
            int r7 = r0.curChar
            r8 = 46
            if (r7 != r8) goto L594
            r7 = 18
            r0.jjCheckNAdd(r7)
            goto L594
        L402:
            long r7 = r24 & r27
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L40a
            goto L594
        L40a:
            if (r4 <= r12) goto L40d
            r4 = r12
        L40d:
            r7 = 15
            r8 = 16
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L416:
            r8 = 16
            r27 = 287667426198290432(0x3fe000000000000, double:1.9240016256086139E-289)
            long r27 = r24 & r27
            int r7 = (r27 > r22 ? 1 : (r27 == r22 ? 0 : -1))
            if (r7 != 0) goto L422
            goto L594
        L422:
            if (r4 <= r12) goto L425
            r4 = r12
        L425:
            r7 = 15
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L42c:
            int r8 = r0.curChar
            r10 = 35
            if (r8 != r10) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r7[r8] = r9
            goto L594
        L43c:
            int r8 = r0.curChar
            r10 = 13
            if (r8 != r10) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r10 = 11
            r7[r8] = r10
            goto L594
        L44e:
            int r7 = r0.curChar
            r8 = 10
            if (r7 != r8) goto L594
            r7 = 9
            if (r4 <= r7) goto L594
        L458:
            r4 = 9
            goto L594
        L45c:
            r7 = 9216(0x2400, double:4.5533E-320)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 9
            if (r4 <= r7) goto L594
            goto L458
        L469:
            r7 = -9217(0xffffffffffffdbff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r7 = 27
            r8 = 29
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L47a:
            int r7 = r0.curChar
            r8 = 33
            if (r7 != r8) goto L594
            r7 = 27
            r8 = 29
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L489:
            int r7 = r0.curChar
            if (r7 == r12) goto L48f
            goto L594
        L48f:
            if (r4 <= r14) goto L492
            r4 = r14
        L492:
            r0.jjCheckNAdd(r14)
            goto L594
        L497:
            int r8 = r0.curChar
            if (r8 != r12) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r10 = 5
            r7[r8] = r10
            goto L594
        L4a6:
            int r7 = r0.curChar
            r8 = 44
            if (r7 != r8) goto L594
            r0.jjCheckNAddStates(r2, r13)
            goto L594
        L4b1:
            int r8 = r0.curChar
            r10 = 38
            if (r8 != r10) goto L594
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r7[r8] = r13
            goto L594
        L4c1:
            int r7 = r0.curChar
            r8 = 32
            if (r7 != r8) goto L594
            r0.jjCheckNAddStates(r2, r13)
            goto L594
        L4cc:
            r7 = -7493990054822421505(0x97ffffbfffffdbff, double:-4.3834849205862334E-193)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L594
            r0.jjCheckNAddStates(r2, r13)
            goto L594
        L4dc:
            r30 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r30 = r24 & r30
            int r8 = (r30 > r22 ? 1 : (r30 == r22 ? 0 : -1))
            if (r8 == 0) goto L4ef
            r8 = 6
            if (r4 <= r8) goto L4eb
            r4 = 6
        L4eb:
            r0.jjCheckNAdd(r2)
            goto L551
        L4ef:
            long r27 = r24 & r27
            int r8 = (r27 > r22 ? 1 : (r27 == r22 ? 0 : -1))
            if (r8 == 0) goto L4fc
            r7 = 4
            r8 = 11
            r0.jjCheckNAddStates(r7, r8)
            goto L551
        L4fc:
            int r8 = r0.curChar
            r10 = 47
            if (r8 != r10) goto L50a
            r7 = 12
            r8 = 13
            r0.jjAddStates(r7, r8)
            goto L551
        L50a:
            r10 = 36
            if (r8 != r10) goto L518
            r10 = 73
            if (r4 <= r10) goto L514
            r4 = 73
        L514:
            r0.jjCheckNAdd(r1)
            goto L551
        L518:
            r14 = 34
            if (r8 != r14) goto L527
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r14 = 39
            r7[r8] = r14
            goto L551
        L527:
            r14 = 39
            if (r8 != r14) goto L533
            r10 = 14
            r14 = 16
            r0.jjCheckNAddStates(r10, r14)
            goto L551
        L533:
            r10 = 46
            if (r8 != r10) goto L53d
            r7 = 18
            r0.jjCheckNAdd(r7)
            goto L551
        L53d:
            r10 = 35
            if (r8 != r10) goto L54a
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r7[r8] = r9
            goto L551
        L54a:
            r7 = 60
            if (r8 != r7) goto L551
            r0.jjCheckNAddStates(r2, r13)
        L551:
            r7 = 287667426198290432(0x3fe000000000000, double:1.9240016256086139E-289)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L564
            if (r4 <= r12) goto L55c
            r4 = r12
        L55c:
            r7 = 15
            r8 = 16
            r0.jjCheckNAddTwoStates(r7, r8)
            goto L594
        L564:
            int r7 = r0.curChar
            r8 = 48
            if (r7 != r8) goto L575
            if (r4 <= r12) goto L56d
            r4 = r12
        L56d:
            r7 = 17
            r8 = 20
            r0.jjCheckNAddStates(r7, r8)
            goto L594
        L575:
            r14 = 34
            if (r7 != r14) goto L594
            r7 = 23
            r8 = 21
            r0.jjCheckNAddStates(r8, r7)
            goto L594
        L581:
            r7 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L58d
            goto L594
        L58d:
            r8 = 6
            if (r4 <= r8) goto L591
            r4 = 6
        L591:
            r0.jjCheckNAdd(r2)
        L594:
            if (r5 != r6) goto L598
            goto L8d8
        L598:
            r10 = 26
            goto L3a
        L59c:
            r8 = 128(0x80, float:1.8E-43)
            if (r7 >= r8) goto L789
            r7 = r7 & 63
            r24 = 1
            long r24 = r24 << r7
        L5a6:
            int[] r7 = r0.jjstateSet
            int r5 = r5 + (-1)
            r8 = r7[r5]
            switch(r8) {
                case 1: goto L76c;
                case 2: goto L759;
                case 9: goto L74d;
                case 15: goto L737;
                case 16: goto L724;
                case 19: goto L70d;
                case 22: goto L6f9;
                case 24: goto L6e5;
                case 25: goto L6d1;
                case 26: goto L6c6;
                case 29: goto L6b2;
                case 30: goto L69c;
                case 31: goto L68f;
                case 34: goto L682;
                case 42: goto L76c;
                case 47: goto L66a;
                case 52: goto L652;
                case 56: goto L63b;
                case 60: goto L622;
                case 62: goto L60f;
                case 63: goto L5f6;
                case 64: goto L5df;
                case 65: goto L5ca;
                case 70: goto L5ba;
                case 75: goto L5b6;
                case 77: goto L5b0;
                case 78: goto L5b0;
                case 80: goto L759;
                default: goto L5af;
            }
        L5af:
            goto L5c4
        L5b0:
            r7 = 78
            r0.jjCheckNAddTwoStates(r7, r15)
            goto L5c4
        L5b6:
            r0.jjCheckNAddTwoStates(r11, r15)
            goto L5c4
        L5ba:
            if (r4 <= r9) goto L5bd
            r4 = r9
        L5bd:
            r7 = 24
            r8 = 26
            r0.jjAddStates(r7, r8)
        L5c4:
            r8 = 67
            r14 = 39
            goto L785
        L5ca:
            int r7 = r0.curChar
            r8 = 95
            if (r7 == r8) goto L5d1
            goto L5af
        L5d1:
            if (r4 <= r12) goto L5d4
            r4 = r12
        L5d4:
            r7 = 41
            r14 = 39
            r0.jjCheckNAddStates(r14, r7)
        L5db:
            r8 = 67
            goto L785
        L5df:
            r14 = 39
            r7 = 17179869188(0x400000004, double:8.487983166E-314)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L5ed
        L5ec:
            goto L5db
        L5ed:
            if (r4 <= r12) goto L5f0
            r4 = r12
        L5f0:
            r7 = 41
            r0.jjCheckNAddStates(r14, r7)
            goto L5db
        L5f6:
            r14 = 39
            r7 = 543313363070(0x7e8000007e, double:2.684324676194E-312)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 != 0) goto L604
            goto L5ec
        L604:
            if (r4 <= r12) goto L607
            r4 = r12
        L607:
            r7 = 16
            r8 = 63
            r0.jjCheckNAddTwoStates(r8, r7)
            goto L5db
        L60f:
            r8 = 63
            r14 = 39
            r20 = 72057594054705152(0x100000001000000, double:7.291122046717944E-304)
            long r20 = r24 & r20
            int r7 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r0.jjCheckNAdd(r8)
            goto L5db
        L622:
            r8 = 63
            r14 = 39
            r20 = 343597383760(0x5000000050, double:1.697596633167E-312)
            long r20 = r24 & r20
            int r7 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r7 = 67
            if (r4 <= r7) goto L638
            r4 = 67
            goto L5db
        L638:
            r8 = r7
            goto L785
        L63b:
            r8 = 63
            r14 = 39
            r20 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r20 = r24 & r20
            int r7 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r7 = 51
            r10 = 52
            r0.jjAddStates(r7, r10)
            goto L5db
        L652:
            r8 = 63
            r14 = 39
            r20 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r20 = r24 & r20
            int r7 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r7 = 49
            r10 = 50
            r0.jjAddStates(r7, r10)
            goto L5db
        L66a:
            r8 = 63
            r14 = 39
            r20 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r20 = r24 & r20
            int r7 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r7 = 47
            r10 = 48
            r0.jjAddStates(r7, r10)
            goto L5db
        L682:
            r8 = 63
            r14 = 39
            r7 = 33
            r10 = 35
            r0.jjAddStates(r7, r10)
            goto L5db
        L68f:
            r7 = 23
            r8 = 63
            r10 = 21
            r14 = 39
            r0.jjCheckNAddStates(r10, r7)
            goto L5db
        L69c:
            r8 = 63
            r14 = 39
            int r10 = r0.curChar
            r8 = 92
            if (r10 != r8) goto L5db
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r10 = 31
            r7[r8] = r10
            goto L5db
        L6b2:
            r14 = 39
            r7 = -268435457(0xffffffffefffffff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r7 = 23
            r8 = 21
            r0.jjCheckNAddStates(r8, r7)
            goto L5db
        L6c6:
            r7 = 14
            r8 = 16
            r14 = 39
            r0.jjCheckNAddStates(r7, r8)
            goto L5db
        L6d1:
            r14 = 39
            int r8 = r0.curChar
            r10 = 92
            if (r8 != r10) goto L5db
            int r8 = r0.jjnewStateCnt
            int r10 = r8 + 1
            r0.jjnewStateCnt = r10
            r29 = 26
            r7[r8] = r29
            goto L5db
        L6e5:
            r14 = 39
            r7 = -268435457(0xffffffffefffffff, double:NaN)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r7 = 14
            r8 = 16
            r0.jjCheckNAddStates(r7, r8)
            goto L5db
        L6f9:
            r14 = 39
            r7 = 36029140624736336(0x80005000800050, double:2.848311836563253E-306)
            long r7 = r24 & r7
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto L5db
            r8 = 67
            if (r4 <= r8) goto L785
            r4 = r8
            goto L785
        L70d:
            r8 = 67
            r14 = 39
            r26 = 137438953504(0x2000000020, double:6.79038653267E-313)
            long r26 = r24 & r26
            int r7 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r7 == 0) goto L785
            r7 = 45
            r10 = 46
            r0.jjAddStates(r7, r10)
            goto L785
        L724:
            r8 = 67
            r14 = 39
            r26 = 38441125539254784(0x88920000889200, double:4.373660808788406E-306)
            long r26 = r24 & r26
            int r7 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r7 == 0) goto L785
            if (r4 <= r12) goto L785
            r4 = r12
            goto L785
        L737:
            r8 = 67
            r14 = 39
            int r7 = r0.curChar
            r10 = 95
            if (r7 == r10) goto L742
            goto L785
        L742:
            if (r4 <= r12) goto L745
            r4 = r12
        L745:
            r7 = 15
            r10 = 16
            r0.jjCheckNAddTwoStates(r7, r10)
            goto L785
        L74d:
            r8 = 67
            r14 = 39
            r7 = 27
            r10 = 29
            r0.jjAddStates(r7, r10)
            goto L785
        L759:
            r8 = 67
            r14 = 39
            r26 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r26 = r24 & r26
            int r7 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r7 == 0) goto L785
            r0.jjCheckNAddStates(r2, r13)
            goto L785
        L76c:
            r8 = 67
            r14 = 39
            r26 = 576460745995190270(0x7fffffe87fffffe, double:3.7857643443544387E-270)
            long r26 = r24 & r26
            int r7 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r7 != 0) goto L77c
            goto L785
        L77c:
            r7 = 73
            if (r4 <= r7) goto L782
            r4 = 73
        L782:
            r0.jjCheckNAdd(r1)
        L785:
            if (r5 != r6) goto L5a6
            goto L8d8
        L789:
            int r30 = r7 >> 8
            int r31 = r7 >> 14
            r8 = r30 & 63
            r20 = 1
            long r33 = r20 << r8
            r8 = r7 & 255(0xff, float:3.57E-43)
            r10 = 6
            int r32 = r8 >> 6
            r7 = r7 & 63
            long r35 = r20 << r7
        L79c:
            int[] r7 = r0.jjstateSet
            int r5 = r5 + (-1)
            r7 = r7[r5]
            if (r7 == 0) goto L8c0
            r8 = 1
            if (r7 == r8) goto L897
            r10 = 2
            if (r7 == r10) goto L889
            r10 = 9
            if (r7 == r10) goto L871
            r10 = 24
            if (r7 == r10) goto L860
            r10 = 26
            if (r7 == r10) goto L859
            r10 = 29
            if (r7 == r10) goto L841
            r10 = 31
            if (r7 == r10) goto L841
            r14 = 34
            if (r7 == r14) goto L82f
            r10 = 70
            if (r7 == r10) goto L81a
            if (r7 == r11) goto L810
            r10 = 80
            if (r7 == r10) goto L80a
            r10 = 41
            if (r7 == r10) goto L7ee
            if (r7 == r1) goto L7ee
            r10 = 77
            if (r7 == r10) goto L7e2
            r10 = 78
            if (r7 == r10) goto L7e2
        L7da:
            r8 = 73
            r10 = 26
        L7de:
            r12 = 21
            goto L8ce
        L7e2:
            boolean r7 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r7 == 0) goto L7da
            r7 = 78
            r0.jjCheckNAddTwoStates(r7, r15)
            goto L7da
        L7ee:
            boolean r7 = jjCanMove_2(r30, r31, r32, r33, r35)
            if (r7 != 0) goto L7f5
            goto L7da
        L7f5:
            r7 = 73
            if (r4 <= r7) goto L7fc
            r7 = 73
            goto L7fd
        L7fc:
            r7 = r4
        L7fd:
            r0.jjCheckNAdd(r1)
            r4 = r7
            r7 = 6
            r8 = 73
            r10 = 26
        L806:
            r12 = 21
            goto L8d6
        L80a:
            r10 = 26
            r12 = 21
            goto L88d
        L810:
            boolean r7 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r7 == 0) goto L7da
            r0.jjCheckNAddTwoStates(r11, r15)
            goto L7da
        L81a:
            boolean r7 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r7 != 0) goto L821
            goto L7da
        L821:
            if (r4 <= r9) goto L824
            r4 = r9
        L824:
            r7 = 24
            r10 = 26
            r0.jjAddStates(r7, r10)
            r7 = 6
            r8 = 73
            goto L806
        L82f:
            r10 = 26
            boolean r7 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r7 == 0) goto L83e
            r7 = 33
            r12 = 35
            r0.jjAddStates(r7, r12)
        L83e:
            r8 = 73
            goto L7de
        L841:
            r10 = 26
            r14 = 34
            boolean r7 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r7 == 0) goto L856
            r7 = 23
            r12 = 21
            r0.jjCheckNAddStates(r12, r7)
        L852:
            r8 = 73
            goto L8ce
        L856:
            r12 = 21
            goto L852
        L859:
            r7 = 23
            r12 = 21
            r14 = 34
            goto L863
        L860:
            r10 = 26
            goto L859
        L863:
            boolean r17 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r17 == 0) goto L852
            r7 = 14
            r8 = 16
            r0.jjCheckNAddStates(r7, r8)
            goto L852
        L871:
            r7 = 14
            r8 = 16
            r10 = 26
            r12 = 21
            r14 = 34
            boolean r16 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r16 == 0) goto L852
            r7 = 27
            r8 = 29
            r0.jjAddStates(r7, r8)
            goto L852
        L889:
            r14 = 34
            goto L80a
        L88d:
            boolean r7 = jjCanMove_1(r30, r31, r32, r33, r35)
            if (r7 == 0) goto L852
            r0.jjCheckNAddStates(r2, r13)
            goto L852
        L897:
            r10 = 26
            r12 = 21
            r14 = 34
            boolean r7 = jjCanMove_0(r30, r31, r32, r33, r35)
            if (r7 == 0) goto L8ae
            r8 = 6
            if (r4 <= r8) goto L8a8
            r8 = 6
            goto L8a9
        L8a8:
            r8 = r4
        L8a9:
            r0.jjCheckNAdd(r2)
            r7 = r8
            goto L8af
        L8ae:
            r7 = r4
        L8af:
            boolean r4 = jjCanMove_2(r30, r31, r32, r33, r35)
            r8 = 73
            if (r4 == 0) goto L8bd
            if (r7 <= r8) goto L8ba
            r7 = r8
        L8ba:
            r0.jjCheckNAdd(r1)
        L8bd:
            r4 = r7
        L8be:
            r7 = 6
            goto L8d6
        L8c0:
            r8 = 73
            r10 = 26
            r12 = 21
            r14 = 34
            boolean r7 = jjCanMove_0(r30, r31, r32, r33, r35)
            if (r7 != 0) goto L8cf
        L8ce:
            goto L8be
        L8cf:
            r7 = 6
            if (r4 <= r7) goto L8d3
            r4 = r7
        L8d3:
            r0.jjCheckNAdd(r2)
        L8d6:
            if (r5 != r6) goto L79c
        L8d8:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r1) goto L8e5
            r0.jjmatchedKind = r4
            r0.jjmatchedPos = r3
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4 = r1
        L8e5:
            int r3 = r3 + 1
            int r5 = r0.jjnewStateCnt
            r0.jjnewStateCnt = r6
            int r6 = 80 - r6
            if (r5 != r6) goto L8f0
            goto L8fb
        L8f0:
            bsh.JavaCharStream r1 = r0.input_stream     // Catch: java.io.IOException -> L8fb
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L8fb
            r0.curChar = r1     // Catch: java.io.IOException -> L8fb
            r1 = 1
            goto L14
        L8fb:
            return r3
    }

    private int jjMoveStringLiteralDfa0_0() {
            r8 = this;
            int r0 = r8.curChar
            r1 = 9
            r2 = 0
            if (r0 == r1) goto L29d
            r1 = 10
            if (r0 == r1) goto L296
            r1 = 12
            if (r0 == r1) goto L28f
            r1 = 13
            if (r0 == r1) goto L288
            r1 = 32
            r3 = 1
            if (r0 == r1) goto L282
            r1 = 33
            if (r0 == r1) goto L26f
            r1 = 37
            if (r0 == r1) goto L25f
            r1 = 38
            if (r0 == r1) goto L24c
            r1 = 93
            if (r0 == r1) goto L244
            r1 = 94
            if (r0 == r1) goto L234
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L228
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == r1) goto L21c
            switch(r0) {
                case 40: goto L214;
                case 41: goto L20c;
                case 42: goto L1fc;
                case 43: goto L1e9;
                case 44: goto L1e1;
                case 45: goto L1cd;
                case 46: goto L1bc;
                case 47: goto L1ac;
                case 91: goto L1a4;
                case 105: goto L195;
                case 108: goto L186;
                case 110: goto L177;
                case 112: goto L168;
                case 123: goto L160;
                case 124: goto L14d;
                case 125: goto L145;
                case 126: goto L13d;
                default: goto L37;
            }
        L37:
            switch(r0) {
                case 58: goto L12c;
                case 59: goto L124;
                case 60: goto L110;
                case 61: goto Lff;
                case 62: goto Lec;
                case 63: goto Ldb;
                case 64: goto Lcb;
                default: goto L3a;
            }
        L3a:
            switch(r0) {
                case 97: goto Lbf;
                case 98: goto Lb2;
                case 99: goto La5;
                case 100: goto L97;
                case 101: goto L8a;
                case 102: goto L7b;
                case 103: goto L6c;
                default: goto L3d;
            }
        L3d:
            switch(r0) {
                case 114: goto L5d;
                case 115: goto L51;
                case 116: goto L45;
                default: goto L40;
            }
        L40:
            int r0 = r8.jjMoveNfa_0(r3, r2)
            return r0
        L45:
            r4 = 0
            r6 = 0
            r2 = 279223176896970752(0x3e0000000000000, double:5.1306710016229703E-290)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L51:
            r4 = 0
            r6 = 0
            r2 = 8725724278030336(0x1f000000000000, double:4.3110806008577027E-308)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L5d:
            r4 = 0
            r6 = 0
            r2 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L6c:
            r4 = 0
            r6 = 0
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L7b:
            r4 = 0
            r6 = 0
            r2 = 4160749568(0xf8000000, double:2.0556834225E-314)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L8a:
            r4 = 0
            r6 = 0
            r2 = 117440512(0x7000000, double:5.80233224E-316)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L97:
            r4 = 0
            r6 = 67108864(0x4000000, double:3.3156184E-316)
            r2 = 14680064(0xe00000, double:7.2529153E-317)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        La5:
            r4 = 0
            r6 = 0
            r2 = 2048000(0x1f4000, double:1.0118464E-317)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        Lb2:
            r4 = 0
            r6 = 0
            r2 = 45056(0xb000, double:2.22606E-319)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        Lbf:
            r4 = 0
            r6 = 0
            r2 = 2048(0x800, double:1.012E-320)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        Lcb:
            r4 = 768602785489879040(0xaaaa02942800000, double:2.7707261374259972E-257)
            r6 = 43690(0xaaaa, double:2.15857E-319)
            r2 = 0
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        Ldb:
            r1 = r8
            r0 = 149(0x95, float:2.09E-43)
            r1.jjmatchedKind = r0
            r4 = 0
            r6 = 35389440(0x21c0000, double:1.74847065E-316)
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        Lec:
            r1 = r8
            r0 = 86
            r1.jjmatchedKind = r0
            r4 = 360287972337123328(0x500000080000000, double:1.344975260383327E-284)
            r6 = 20480(0x5000, double:1.01185E-319)
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        Lff:
            r1 = r8
            r0 = 85
            r1.jjmatchedKind = r0
            r4 = 268435456(0x10000000, double:1.32624737E-315)
            r6 = 0
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L110:
            r1 = r8
            r0 = 88
            r1.jjmatchedKind = r0
            r4 = 18014399046352896(0x40000020000000, double:1.7800592990053402E-307)
            r6 = 132096(0x20400, double:6.5264E-319)
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L124:
            r1 = r8
            r0 = 82
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L12c:
            r1 = r8
            r0 = 150(0x96, float:2.1E-43)
            r1.jjmatchedKind = r0
            r4 = 0
            r6 = 8388608(0x800000, double:4.144523E-317)
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L13d:
            r1 = r8
            r0 = 91
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L145:
            r1 = r8
            r0 = 79
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L14d:
            r1 = r8
            r0 = 110(0x6e, float:1.54E-43)
            r1.jjmatchedKind = r0
            r4 = 17179869184(0x400000000, double:8.487983164E-314)
            r6 = 4
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L160:
            r1 = r8
            r0 = 78
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L168:
            r1 = r8
            r4 = 0
            r6 = 0
            r2 = 131941395333120(0x780000000000, double:6.5187710698453E-310)
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L177:
            r4 = 0
            r6 = 0
            r2 = 7696581394432(0x70000000000, double:3.80261645741E-311)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L186:
            r4 = 0
            r6 = 0
            r2 = 549755813888(0x8000000000, double:2.716154612436E-312)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L195:
            r4 = 0
            r6 = 0
            r2 = 541165879296(0x7e00000000, double:2.673714696616E-312)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L1a4:
            r1 = r8
            r0 = 80
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L1ac:
            r1 = r8
            r0 = 107(0x6b, float:1.5E-43)
            r1.jjmatchedKind = r0
            r4 = -9223372036854775808
            r6 = 0
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L1bc:
            r1 = r8
            r0 = 84
            r1.jjmatchedKind = r0
            r4 = 0
            r6 = 16777216(0x1000000, double:8.289046E-317)
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L1cd:
            r1 = r8
            r0 = 105(0x69, float:1.47E-43)
            r1.jjmatchedKind = r0
            r4 = 2305843558969507840(0x2000008000000000, double:1.4918502346367992E-154)
            r6 = 65536(0x10000, double:3.2379E-319)
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L1e1:
            r1 = r8
            r0 = 83
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L1e9:
            r1 = r8
            r0 = 104(0x68, float:1.46E-43)
            r1.jjmatchedKind = r0
            r4 = 1152921779484753920(0x1000004000000000, double:1.288308381223743E-231)
            r6 = 0
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L1fc:
            r1 = r8
            r0 = 106(0x6a, float:1.49E-43)
            r1.jjmatchedKind = r0
            r4 = 4616189618054758400(0x4010000000000000, double:4.0)
            r6 = 256(0x100, double:1.265E-321)
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L20c:
            r1 = r8
            r0 = 77
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L214:
            r1 = r8
            r0 = 76
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L21c:
            r1 = r8
            r4 = 0
            r6 = 0
            r2 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L228:
            r4 = 0
            r6 = 0
            r2 = 864691128455135232(0xc00000000000000, double:6.983507489299546E-251)
            r1 = r8
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L234:
            r1 = r8
            r0 = 112(0x70, float:1.57E-43)
            r1.jjmatchedKind = r0
            r4 = 0
            r6 = 16
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L244:
            r1 = r8
            r0 = 81
            int r0 = r8.jjStopAtPos(r2, r0)
            return r0
        L24c:
            r1 = r8
            r0 = 108(0x6c, float:1.51E-43)
            r1.jjmatchedKind = r0
            r4 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r6 = 1
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L25f:
            r1 = r8
            r0 = 114(0x72, float:1.6E-43)
            r1.jjmatchedKind = r0
            r4 = 0
            r6 = 64
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L26f:
            r1 = r8
            r0 = 90
            r1.jjmatchedKind = r0
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            r6 = 0
            r2 = 0
            int r0 = r1.jjMoveStringLiteralDfa1_0(r2, r4, r6)
            return r0
        L282:
            r1 = r8
            int r0 = r8.jjStartNfaWithStates_0(r2, r3, r2)
            return r0
        L288:
            r1 = r8
            r0 = 3
            int r0 = r8.jjStartNfaWithStates_0(r2, r0, r2)
            return r0
        L28f:
            r1 = r8
            r0 = 4
            int r0 = r8.jjStartNfaWithStates_0(r2, r0, r2)
            return r0
        L296:
            r1 = r8
            r0 = 5
            int r0 = r8.jjStartNfaWithStates_0(r2, r0, r2)
            return r0
        L29d:
            r1 = r8
            r0 = 2
            int r0 = r8.jjStartNfaWithStates_0(r2, r0, r2)
            return r0
    }

    private int jjMoveStringLiteralDfa10_0(long r16, long r18, long r20, long r22, long r24, long r26) {
            r15 = this;
            long r1 = r18 & r16
            long r5 = r22 & r20
            long r3 = r1 | r5
            long r9 = r26 & r24
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1d
            r1 = 8
            r0 = r15
            r2 = r16
            r4 = r20
            r6 = r24
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1d:
            r3 = 10
            bsh.JavaCharStream r4 = r15.input_stream     // Catch: java.io.IOException -> Lf6
            char r4 = r4.readChar()     // Catch: java.io.IOException -> Lf6
            r15.curChar = r4     // Catch: java.io.IOException -> Lf6
            r11 = 101(0x65, float:1.42E-43)
            if (r4 == r11) goto Lea
            r11 = 102(0x66, float:1.43E-43)
            if (r4 == r11) goto Lde
            r11 = 105(0x69, float:1.47E-43)
            if (r4 == r11) goto Ld1
            r11 = 114(0x72, float:1.6E-43)
            r12 = 111(0x6f, float:1.56E-43)
            if (r4 == r11) goto Lb1
            r11 = 116(0x74, float:1.63E-43)
            if (r4 == r11) goto L98
            r11 = 110(0x6e, float:1.54E-43)
            if (r4 == r11) goto L51
            if (r4 == r12) goto L45
            goto Lc0
        L45:
            r7 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            r11 = 0
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa11_0(r1, r3, r5, r7, r9, r11)
            return r1
        L51:
            r11 = 2
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L5f
            r1 = 129(0x81, float:1.81E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L5f:
            r11 = 32
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L6d
            r1 = 133(0x85, float:1.86E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L6d:
            r11 = 128(0x80, double:6.3E-322)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L7b
            r1 = 135(0x87, float:1.89E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L7b:
            r11 = 512(0x200, double:2.53E-321)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L89
            r1 = 137(0x89, float:1.92E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L89:
            r7 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            r11 = 0
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa11_0(r1, r3, r5, r7, r9, r11)
            return r1
        L98:
            r11 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto La5
            r4 = 119(0x77, float:1.67E-43)
            r15.jjmatchedKind = r4
            r15.jjmatchedPos = r3
        La5:
            r7 = 0
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa11_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lb1:
            r13 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r13 = r13 & r5
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lc0
            int r1 = r15.jjStopAtPos(r3, r12)
            return r1
        Lc0:
            r3 = 9
            r16 = r15
            r18 = r1
            r17 = r3
            r20 = r5
            r22 = r9
            int r0 = r16.jjStartNfa_0(r17, r18, r20, r22)
            return r0
        Ld1:
            r7 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r11 = 32768(0x8000, double:1.61895E-319)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa11_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lde:
            r7 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r11 = 8192(0x2000, double:4.0474E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa11_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lea:
            r7 = 0
            r11 = 0
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa11_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lf6:
            r0 = 9
            r16 = r15
            r17 = r0
            r18 = r1
            r20 = r5
            r22 = r9
            r16.jjStopStringLiteralDfa_0(r17, r18, r20, r22)
            return r3
    }

    private int jjMoveStringLiteralDfa11_0(long r14, long r16, long r18, long r20, long r22, long r24) {
            r13 = this;
            long r1 = r16 & r14
            long r5 = r20 & r18
            long r3 = r1 | r5
            long r9 = r24 & r22
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1c
            r1 = 9
            r0 = r13
            r2 = r14
            r4 = r18
            r6 = r22
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1c:
            r3 = 11
            bsh.JavaCharStream r4 = r13.input_stream     // Catch: java.io.IOException -> Lab
            char r4 = r4.readChar()     // Catch: java.io.IOException -> Lab
            r13.curChar = r4     // Catch: java.io.IOException -> Lab
            r11 = 95
            if (r4 == r11) goto L9f
            r11 = 100
            if (r4 == r11) goto L6f
            r11 = 103(0x67, float:1.44E-43)
            if (r4 == r11) goto L62
            r11 = 114(0x72, float:1.6E-43)
            if (r4 == r11) goto L54
            r11 = 116(0x74, float:1.63E-43)
            if (r4 == r11) goto L3b
            goto L90
        L3b:
            r11 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L48
            r4 = 121(0x79, float:1.7E-43)
            r13.jjmatchedKind = r4
            r13.jjmatchedPos = r3
        L48:
            r7 = 0
            r11 = 8192(0x2000, double:4.0474E-320)
            r3 = 0
            r0 = r13
            int r1 = r0.jjMoveStringLiteralDfa12_0(r1, r3, r5, r7, r9, r11)
            return r1
        L54:
            r11 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L90
            r1 = 113(0x71, float:1.58E-43)
            int r1 = r13.jjStopAtPos(r3, r1)
            return r1
        L62:
            r7 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r11 = 32768(0x8000, double:1.61895E-319)
            r3 = 0
            r0 = r13
            int r1 = r0.jjMoveStringLiteralDfa12_0(r1, r3, r5, r7, r9, r11)
            return r1
        L6f:
            r11 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L7f
            r1 = 52
            r2 = 42
            int r1 = r13.jjStartNfaWithStates_0(r3, r1, r2)
            return r1
        L7f:
            r11 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L90
            r1 = 109(0x6d, float:1.53E-43)
            int r1 = r13.jjStopAtPos(r3, r1)
            return r1
        L90:
            r3 = 10
            r14 = r13
            r16 = r1
            r15 = r3
            r18 = r5
            r20 = r9
            int r0 = r14.jjStartNfa_0(r15, r16, r18, r20)
            return r0
        L9f:
            r7 = 0
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 0
            r0 = r13
            int r1 = r0.jjMoveStringLiteralDfa12_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lab:
            r0 = 10
            r14 = r13
            r15 = r0
            r16 = r1
            r18 = r5
            r20 = r9
            r14.jjStopStringLiteralDfa_0(r15, r16, r18, r20)
            return r3
    }

    private int jjMoveStringLiteralDfa12_0(long r9, long r11, long r13, long r15, long r17, long r19) {
            r8 = this;
            long r0 = r11 & r9
            long r2 = r15 & r13
            long r0 = r0 | r2
            long r4 = r19 & r17
            long r0 = r0 | r4
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L1a
            r1 = 10
            r0 = r8
            r2 = r9
            r4 = r13
            r6 = r17
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1a:
            bsh.JavaCharStream r1 = r8.input_stream     // Catch: java.io.IOException -> L70
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L70
            r8.curChar = r1     // Catch: java.io.IOException -> L70
            r6 = 95
            if (r1 == r6) goto L5f
            r6 = 97
            if (r1 == r6) goto L4e
            r6 = 110(0x6e, float:1.54E-43)
            if (r1 == r6) goto L3c
            r1 = 11
            r6 = 0
            r9 = r8
            r10 = r1
            r13 = r2
            r15 = r4
            r11 = r6
            int r0 = r9.jjStartNfa_0(r10, r11, r13, r15)
            return r0
        L3c:
            r0 = r2
            r2 = r4
            r4 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r6 = 32768(0x8000, double:1.61895E-319)
            r9 = r8
            r10 = r0
            r14 = r2
            r12 = r4
            r16 = r6
            int r0 = r9.jjMoveStringLiteralDfa13_0(r10, r12, r14, r16)
            return r0
        L4e:
            r0 = r2
            r2 = r4
            r4 = 0
            r6 = 2048(0x800, double:1.012E-320)
            r9 = r8
            r10 = r0
            r14 = r2
            r12 = r4
            r16 = r6
            int r0 = r9.jjMoveStringLiteralDfa13_0(r10, r12, r14, r16)
            return r0
        L5f:
            r0 = r2
            r2 = r4
            r4 = 0
            r6 = 8192(0x2000, double:4.0474E-320)
            r9 = r8
            r10 = r0
            r14 = r2
            r12 = r4
            r16 = r6
            int r0 = r9.jjMoveStringLiteralDfa13_0(r10, r12, r14, r16)
            return r0
        L70:
            r0 = r2
            r2 = r4
            r4 = 11
            r5 = 0
            r9 = r8
            r13 = r0
            r15 = r2
            r10 = r4
            r11 = r5
            r9.jjStopStringLiteralDfa_0(r10, r11, r13, r15)
            r0 = 12
            return r0
    }

    private int jjMoveStringLiteralDfa13_0(long r10, long r12, long r14, long r16) {
            r9 = this;
            long r1 = r12 & r10
            long r5 = r16 & r14
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 11
            r2 = 0
            r0 = r9
            r4 = r10
            r6 = r14
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L18:
            bsh.JavaCharStream r3 = r9.input_stream     // Catch: java.io.IOException -> L5a
            char r3 = r3.readChar()     // Catch: java.io.IOException -> L5a
            r9.curChar = r3     // Catch: java.io.IOException -> L5a
            r4 = 97
            if (r3 == r4) goto L50
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L45
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L3b
            r3 = 12
            r7 = 0
            r10 = r9
            r14 = r1
            r11 = r3
            r16 = r5
            r12 = r7
            int r0 = r10.jjStartNfa_0(r11, r12, r14, r16)
            return r0
        L3b:
            r3 = 0
            r7 = 2048(0x800, double:1.012E-320)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa14_0(r1, r3, r5, r7)
            return r1
        L45:
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa14_0(r1, r3, r5, r7)
            return r1
        L50:
            r3 = 0
            r7 = 8192(0x2000, double:4.0474E-320)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa14_0(r1, r3, r5, r7)
            return r1
        L5a:
            r0 = 12
            r3 = 0
            r10 = r9
            r11 = r0
            r14 = r1
            r12 = r3
            r16 = r5
            r10.jjStopStringLiteralDfa_0(r11, r12, r14, r16)
            r0 = 13
            return r0
    }

    private int jjMoveStringLiteralDfa14_0(long r10, long r12, long r14, long r16) {
            r9 = this;
            long r1 = r12 & r10
            long r5 = r16 & r14
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 12
            r2 = 0
            r0 = r9
            r4 = r10
            r6 = r14
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L18:
            bsh.JavaCharStream r3 = r9.input_stream     // Catch: java.io.IOException -> L4c
            char r3 = r3.readChar()     // Catch: java.io.IOException -> L4c
            r9.curChar = r3     // Catch: java.io.IOException -> L4c
            r4 = 100
            if (r3 == r4) goto L41
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L37
            r3 = 13
            r7 = 0
            r10 = r9
            r14 = r1
            r11 = r3
            r16 = r5
            r12 = r7
            int r0 = r10.jjStartNfa_0(r11, r12, r14, r16)
            return r0
        L37:
            r3 = 0
            r7 = 10240(0x2800, double:5.059E-320)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa15_0(r1, r3, r5, r7)
            return r1
        L41:
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa15_0(r1, r3, r5, r7)
            return r1
        L4c:
            r0 = 13
            r3 = 0
            r10 = r9
            r11 = r0
            r14 = r1
            r12 = r3
            r16 = r5
            r10.jjStopStringLiteralDfa_0(r11, r12, r14, r16)
            r0 = 14
            return r0
    }

    private int jjMoveStringLiteralDfa15_0(long r10, long r12, long r14, long r16) {
            r9 = this;
            long r1 = r12 & r10
            long r5 = r16 & r14
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 13
            r2 = 0
            r0 = r9
            r4 = r10
            r6 = r14
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L18:
            bsh.JavaCharStream r3 = r9.input_stream     // Catch: java.io.IOException -> L5a
            char r3 = r3.readChar()     // Catch: java.io.IOException -> L5a
            r9.curChar = r3     // Catch: java.io.IOException -> L5a
            r4 = 95
            if (r3 == r4) goto L4f
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L45
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L3b
            r3 = 14
            r7 = 0
            r10 = r9
            r14 = r1
            r11 = r3
            r16 = r5
            r12 = r7
            int r0 = r10.jjStartNfa_0(r11, r12, r14, r16)
            return r0
        L3b:
            r3 = 0
            r7 = 8192(0x2000, double:4.0474E-320)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa16_0(r1, r3, r5, r7)
            return r1
        L45:
            r3 = 0
            r7 = 2048(0x800, double:1.012E-320)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa16_0(r1, r3, r5, r7)
            return r1
        L4f:
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa16_0(r1, r3, r5, r7)
            return r1
        L5a:
            r0 = 14
            r3 = 0
            r10 = r9
            r11 = r0
            r14 = r1
            r12 = r3
            r16 = r5
            r10.jjStopStringLiteralDfa_0(r11, r12, r14, r16)
            r0 = 15
            return r0
    }

    private int jjMoveStringLiteralDfa16_0(long r10, long r12, long r14, long r16) {
            r9 = this;
            long r1 = r12 & r10
            long r5 = r16 & r14
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 14
            r2 = 0
            r0 = r9
            r4 = r10
            r6 = r14
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L18:
            bsh.JavaCharStream r3 = r9.input_stream     // Catch: java.io.IOException -> L5a
            char r3 = r3.readChar()     // Catch: java.io.IOException -> L5a
            r9.curChar = r3     // Catch: java.io.IOException -> L5a
            r4 = 103(0x67, float:1.44E-43)
            if (r3 == r4) goto L50
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L46
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L3b
            r3 = 15
            r7 = 0
            r10 = r9
            r14 = r1
            r11 = r3
            r16 = r5
            r12 = r7
            int r0 = r10.jjStartNfa_0(r11, r12, r14, r16)
            return r0
        L3b:
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa17_0(r1, r3, r5, r7)
            return r1
        L46:
            r3 = 0
            r7 = 8192(0x2000, double:4.0474E-320)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa17_0(r1, r3, r5, r7)
            return r1
        L50:
            r3 = 0
            r7 = 2048(0x800, double:1.012E-320)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa17_0(r1, r3, r5, r7)
            return r1
        L5a:
            r0 = 15
            r3 = 0
            r10 = r9
            r11 = r0
            r14 = r1
            r12 = r3
            r16 = r5
            r10.jjStopStringLiteralDfa_0(r11, r12, r14, r16)
            r0 = 16
            return r0
    }

    private int jjMoveStringLiteralDfa17_0(long r12, long r14, long r16, long r18) {
            r11 = this;
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L19
            r1 = 15
            r2 = 0
            r0 = r11
            r4 = r12
            r6 = r16
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L19:
            r3 = 17
            bsh.JavaCharStream r4 = r11.input_stream     // Catch: java.io.IOException -> L63
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L63
            r11.curChar = r4     // Catch: java.io.IOException -> L63
            r9 = 103(0x67, float:1.44E-43)
            if (r4 == r9) goto L59
            r9 = 104(0x68, float:1.46E-43)
            if (r4 == r9) goto L4e
            r9 = 110(0x6e, float:1.54E-43)
            if (r4 == r9) goto L30
            goto L3e
        L30:
            r9 = 2048(0x800, double:1.012E-320)
            long r9 = r9 & r5
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 == 0) goto L3e
            r1 = 139(0x8b, float:1.95E-43)
            int r1 = r11.jjStopAtPos(r3, r1)
            return r1
        L3e:
            r3 = 16
            r7 = 0
            r12 = r11
            r16 = r1
            r13 = r3
            r18 = r5
            r14 = r7
            int r0 = r12.jjStartNfa_0(r13, r14, r16, r18)
            return r0
        L4e:
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r11
            int r1 = r0.jjMoveStringLiteralDfa18_0(r1, r3, r5, r7)
            return r1
        L59:
            r3 = 0
            r7 = 8192(0x2000, double:4.0474E-320)
            r0 = r11
            int r1 = r0.jjMoveStringLiteralDfa18_0(r1, r3, r5, r7)
            return r1
        L63:
            r0 = 16
            r7 = 0
            r12 = r11
            r13 = r0
            r16 = r1
            r18 = r5
            r14 = r7
            r12.jjStopStringLiteralDfa_0(r13, r14, r16, r18)
            return r3
    }

    private int jjMoveStringLiteralDfa18_0(long r12, long r14, long r16, long r18) {
            r11 = this;
            long r1 = r14 & r12
            long r5 = r18 & r16
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L19
            r1 = 16
            r2 = 0
            r0 = r11
            r4 = r12
            r6 = r16
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L19:
            r3 = 18
            bsh.JavaCharStream r4 = r11.input_stream     // Catch: java.io.IOException -> L55
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L55
            r11.curChar = r4     // Catch: java.io.IOException -> L55
            r9 = 105(0x69, float:1.47E-43)
            if (r4 == r9) goto L4a
            r9 = 110(0x6e, float:1.54E-43)
            if (r4 == r9) goto L2c
            goto L3a
        L2c:
            r9 = 8192(0x2000, double:4.0474E-320)
            long r9 = r9 & r5
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 == 0) goto L3a
            r1 = 141(0x8d, float:1.98E-43)
            int r1 = r11.jjStopAtPos(r3, r1)
            return r1
        L3a:
            r3 = 17
            r7 = 0
            r12 = r11
            r16 = r1
            r13 = r3
            r18 = r5
            r14 = r7
            int r0 = r12.jjStartNfa_0(r13, r14, r16, r18)
            return r0
        L4a:
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r11
            int r1 = r0.jjMoveStringLiteralDfa19_0(r1, r3, r5, r7)
            return r1
        L55:
            r0 = 17
            r7 = 0
            r12 = r11
            r13 = r0
            r16 = r1
            r18 = r5
            r14 = r7
            r12.jjStopStringLiteralDfa_0(r13, r14, r16, r18)
            return r3
    }

    private int jjMoveStringLiteralDfa19_0(long r10, long r12, long r14, long r16) {
            r9 = this;
            long r1 = r12 & r10
            long r5 = r16 & r14
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L18
            r1 = 17
            r2 = 0
            r0 = r9
            r4 = r10
            r6 = r14
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L18:
            bsh.JavaCharStream r3 = r9.input_stream     // Catch: java.io.IOException -> L3e
            char r3 = r3.readChar()     // Catch: java.io.IOException -> L3e
            r9.curChar = r3     // Catch: java.io.IOException -> L3e
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto L33
            r3 = 18
            r7 = 0
            r10 = r9
            r14 = r1
            r11 = r3
            r16 = r5
            r12 = r7
            int r0 = r10.jjStartNfa_0(r11, r12, r14, r16)
            return r0
        L33:
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r9
            int r1 = r0.jjMoveStringLiteralDfa20_0(r1, r3, r5, r7)
            return r1
        L3e:
            r0 = 18
            r3 = 0
            r10 = r9
            r11 = r0
            r14 = r1
            r12 = r3
            r16 = r5
            r10.jjStopStringLiteralDfa_0(r11, r12, r14, r16)
            r0 = 19
            return r0
    }

    private int jjMoveStringLiteralDfa1_0(long r14, long r16, long r18) {
            r13 = this;
            r8 = 1
            bsh.JavaCharStream r1 = r13.input_stream     // Catch: java.io.IOException -> L3a0
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L3a0
            r13.curChar = r1     // Catch: java.io.IOException -> L3a0
            r2 = 38
            r3 = 0
            if (r1 == r2) goto L382
            r2 = 58
            if (r1 == r2) goto L362
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L34d
            r2 = 98
            r5 = 124(0x7c, float:1.74E-43)
            if (r1 == r5) goto L33d
            r6 = 116(0x74, float:1.63E-43)
            r7 = 42
            if (r1 == r7) goto L320
            r9 = 43
            if (r1 == r9) goto L30e
            r9 = 45
            if (r1 == r9) goto L2fc
            r9 = 46
            if (r1 == r9) goto L2da
            r9 = 97
            if (r1 == r9) goto L2c3
            if (r1 == r2) goto L2af
            if (r1 == r6) goto L29e
            r2 = 117(0x75, float:1.64E-43)
            if (r1 == r2) goto L28a
            r10 = 8589934592(0x200000000, double:4.243991582E-314)
            switch(r1) {
                case 60: goto L26b;
                case 61: goto L1a5;
                case 62: goto L175;
                case 63: goto L154;
                default: goto L43;
            }
        L43:
            switch(r1) {
                case 101: goto L13f;
                case 102: goto L132;
                case 103: goto L11e;
                case 104: goto L10a;
                case 105: goto Lf8;
                default: goto L46;
            }
        L46:
            switch(r1) {
                case 108: goto Le3;
                case 109: goto Lcf;
                case 110: goto Lbb;
                case 111: goto L96;
                case 112: goto L85;
                default: goto L49;
            }
        L49:
            switch(r1) {
                case 119: goto L74;
                case 120: goto L62;
                case 121: goto L4e;
                default: goto L4c;
            }
        L4c:
            goto L394
        L4e:
            r7 = 0
            r11 = 0
            r3 = 4503599627403264(0x10000000008000, double:2.225073858523391E-308)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L62:
            r7 = 0
            r11 = 32
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L74:
            r7 = 0
            r11 = 0
            r3 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L85:
            r7 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            r11 = 512(0x200, double:2.53E-321)
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L96:
            r1 = 4194304(0x400000, double:2.0722615E-317)
            long r1 = r1 & r14
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto La4
            r1 = 22
            r13.jjmatchedKind = r1
            r13.jjmatchedPos = r8
        La4:
            r7 = 34359738368(0x800000000, double:1.69759663277E-313)
            r11 = 8
            r3 = 864691684663365632(0xc00008180981000, double:6.984369973681817E-251)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lbb:
            r7 = 0
            r11 = 0
            r3 = 481069891584(0x7002000000, double:2.3768010668E-312)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lcf:
            r7 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            r11 = 128(0x80, double:6.3E-322)
            r3 = 51539607552(0xc00000000, double:2.54639494916E-313)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        Le3:
            r7 = 36028798126260224(0x80000042000000, double:2.848095239147829E-306)
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 1090535424(0x41004000, double:5.387960886E-315)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lf8:
            r7 = 0
            r11 = 0
            r3 = 805306368(0x30000000, double:3.97874211E-315)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L10a:
            r7 = 0
            r11 = 0
            r3 = 3513089184325959680(0x30c1000000040000, double:7.516921110766009E-74)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L11e:
            r7 = 4303355904(0x100800000, double:2.126140314E-314)
            r11 = 0
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L132:
            long r1 = r14 & r10
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L394
            r1 = 33
            int r1 = r13.jjStartNfaWithStates_0(r8, r1, r7)
            return r1
        L13f:
            r7 = 0
            r11 = 67108864(0x4000000, double:3.3156184E-316)
            r3 = 142936513708032(0x820000200000, double:7.0620020959455E-310)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L154:
            r1 = 524288(0x80000, double:2.590327E-318)
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L163
            r1 = 147(0x93, float:2.06E-43)
            r13.jjmatchedKind = r1
            r13.jjmatchedPos = r8
        L163:
            r7 = 0
            r11 = 262144(0x40000, double:1.295163E-318)
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L175:
            r1 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L184
            r1 = 120(0x78, float:1.68E-43)
            r13.jjmatchedKind = r1
            r13.jjmatchedPos = r8
            goto L194
        L184:
            r1 = 65536(0x10000, double:3.2379E-319)
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L194
            r1 = 144(0x90, float:2.02E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L194:
            r7 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            r11 = 20480(0x5000, double:1.01185E-319)
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1a5:
            r1 = 268435456(0x10000000, double:1.32624737E-315)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1b5
            r1 = 92
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L1b5:
            r1 = 536870912(0x20000000, double:2.65249474E-315)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1c6
            r1 = 93
            r13.jjmatchedKind = r1
            r13.jjmatchedPos = r8
            goto L259
        L1c6:
            r1 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1d8
            r1 = 95
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L1d8:
            long r1 = r16 & r10
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1e3
            int r1 = r13.jjStopAtPos(r8, r9)
            return r1
        L1e3:
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1f0
            int r1 = r13.jjStopAtPos(r8, r5)
            return r1
        L1f0:
            r1 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1ff
            r1 = 125(0x7d, float:1.75E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L1ff:
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L20e
            r1 = 126(0x7e, float:1.77E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L20e:
            r1 = -9223372036854775808
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L21d
            r1 = 127(0x7f, float:1.78E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L21d:
            r1 = 1
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L22c
            r1 = 128(0x80, float:1.8E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L22c:
            r1 = 4
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L23b
            r1 = 130(0x82, float:1.82E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L23b:
            r1 = 16
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L24a
            r1 = 132(0x84, float:1.85E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L24a:
            r1 = 64
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L259
            r1 = 134(0x86, float:1.88E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L259:
            r7 = 0
            r11 = 131072(0x20000, double:6.4758E-319)
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L26b:
            r1 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L279
            r1 = 118(0x76, float:1.65E-43)
            r13.jjmatchedKind = r1
            r13.jjmatchedPos = r8
        L279:
            r7 = 0
            r11 = 1024(0x400, double:5.06E-321)
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L28a:
            r7 = 0
            r11 = 0
            r3 = 74766790688768(0x440000000000, double:3.69397027291235E-310)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L29e:
            r7 = 0
            r11 = 0
            r3 = 1688849860263936(0x6000000000000, double:8.344026969402005E-309)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L2af:
            r7 = 738871813865472(0x2a00000000000, double:3.650511799113377E-309)
            r11 = 0
            r3 = 2048(0x800, double:1.012E-320)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L2c3:
            r7 = 137438953472(0x2000000000, double:6.7903865311E-313)
            r11 = 2
            r3 = 9895739064320(0x90008030000, double:4.8891447118897E-311)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L2da:
            r1 = 33554432(0x2000000, double:1.6578092E-316)
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L2ea
            r1 = 153(0x99, float:2.14E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L2ea:
            r7 = 0
            r11 = 16777216(0x1000000, double:8.289046E-317)
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L2fc:
            r1 = 549755813888(0x8000000000, double:2.716154612436E-312)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L394
            r1 = 103(0x67, float:1.44E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L30e:
            r1 = 274877906944(0x4000000000, double:1.35807730622E-312)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L394
            r1 = 102(0x66, float:1.43E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L320:
            r1 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L32c
            r13.jjmatchedKind = r6
            r13.jjmatchedPos = r8
        L32c:
            r7 = 0
            r11 = 256(0x100, double:1.265E-321)
            r3 = 0
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L33d:
            r5 = 17179869184(0x400000000, double:8.487983164E-314)
            long r5 = r16 & r5
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L394
            int r1 = r13.jjStopAtPos(r8, r2)
            return r1
        L34d:
            r7 = 720575940379279360(0xa00000000000000, double:1.6259745436952323E-260)
            r11 = 40960(0xa000, double:2.0237E-319)
            r3 = 225232757926666240(0x320300000002000, double:1.267284192488421E-293)
            r0 = r13
            r1 = r14
            r5 = r16
            r9 = r18
            int r1 = r0.jjMoveStringLiteralDfa2_0(r1, r3, r5, r7, r9, r11)
            return r1
        L362:
            r1 = 1048576(0x100000, double:5.180654E-318)
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L372
            r1 = 148(0x94, float:2.07E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L372:
            r1 = 8388608(0x800000, double:4.144523E-317)
            long r1 = r18 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L394
            r1 = 151(0x97, float:2.12E-43)
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L382:
            r1 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r1 = r16 & r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L394
            r1 = 100
            int r1 = r13.jjStopAtPos(r8, r1)
            return r1
        L394:
            r1 = 0
            r0 = r13
            r2 = r14
            r4 = r16
            r6 = r18
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L3a0:
            r1 = 0
            r0 = r13
            r2 = r14
            r4 = r16
            r6 = r18
            r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            return r8
    }

    private int jjMoveStringLiteralDfa20_0(long r14, long r16, long r18, long r20) {
            r13 = this;
            long r1 = r16 & r14
            long r5 = r20 & r18
            long r3 = r1 | r5
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L19
            r1 = 18
            r2 = 0
            r0 = r13
            r4 = r14
            r6 = r18
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L19:
            r3 = 20
            bsh.JavaCharStream r4 = r13.input_stream     // Catch: java.io.IOException -> L54
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L54
            r13.curChar = r4     // Catch: java.io.IOException -> L54
            r9 = 116(0x74, float:1.63E-43)
            if (r4 == r9) goto L38
            r3 = 19
            r7 = 0
            r14 = r13
            r18 = r1
            r15 = r3
            r20 = r5
            r16 = r7
            int r0 = r14.jjStartNfa_0(r15, r16, r18, r20)
            return r0
        L38:
            r9 = r5
            r4 = r1
            r11 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            long r11 = r11 & r4
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L47
            r0 = 123(0x7b, float:1.72E-43)
            r13.jjmatchedKind = r0
            r13.jjmatchedPos = r3
        L47:
            r1 = r4
            r3 = 0
            r7 = 32768(0x8000, double:1.61895E-319)
            r0 = r13
            r5 = r9
            int r1 = r0.jjMoveStringLiteralDfa21_0(r1, r3, r5, r7)
            return r1
        L54:
            r9 = r5
            r0 = 19
            r4 = 0
            r14 = r13
            r15 = r0
            r18 = r1
            r16 = r4
            r20 = r9
            r14.jjStopStringLiteralDfa_0(r15, r16, r18, r20)
            return r3
    }

    private int jjMoveStringLiteralDfa21_0(long r9, long r11, long r13, long r15) {
            r8 = this;
            long r0 = r11 & r9
            long r2 = r15 & r13
            long r0 = r0 | r2
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L17
            r1 = 19
            r2 = 0
            r0 = r8
            r4 = r9
            r6 = r13
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L17:
            bsh.JavaCharStream r1 = r8.input_stream     // Catch: java.io.IOException -> L3b
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L3b
            r8.curChar = r1     // Catch: java.io.IOException -> L3b
            r4 = 95
            if (r1 == r4) goto L33
            r4 = 0
            r6 = 0
            r1 = 20
            r9 = r8
            r10 = r1
            r15 = r2
            r11 = r4
            r13 = r6
            int r0 = r9.jjStartNfa_0(r10, r11, r13, r15)
            return r0
        L33:
            r4 = 32768(0x8000, double:1.61895E-319)
            int r0 = r8.jjMoveStringLiteralDfa22_0(r2, r4)
            return r0
        L3b:
            r4 = 0
            r6 = 0
            r0 = 20
            r9 = r8
            r10 = r0
            r15 = r2
            r11 = r4
            r13 = r6
            r9.jjStopStringLiteralDfa_0(r10, r11, r13, r15)
            r0 = 21
            return r0
    }

    private int jjMoveStringLiteralDfa22_0(long r9, long r11) {
            r8 = this;
            long r6 = r11 & r9
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r2 = 0
            r4 = 0
            r1 = 20
            r0 = r8
            r6 = r9
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L15:
            bsh.JavaCharStream r1 = r8.input_stream     // Catch: java.io.IOException -> L35
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L35
            r8.curChar = r1     // Catch: java.io.IOException -> L35
            r2 = 97
            if (r1 == r2) goto L2d
            r2 = 0
            r4 = 0
            r1 = 21
            r0 = r8
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L2d:
            r1 = 32768(0x8000, double:1.61895E-319)
            int r1 = r8.jjMoveStringLiteralDfa23_0(r6, r1)
            return r1
        L35:
            r2 = 0
            r4 = 0
            r1 = 21
            r0 = r8
            r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            r0 = 22
            return r0
    }

    private int jjMoveStringLiteralDfa23_0(long r9, long r11) {
            r8 = this;
            long r6 = r11 & r9
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r2 = 0
            r4 = 0
            r1 = 21
            r0 = r8
            r6 = r9
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L15:
            bsh.JavaCharStream r1 = r8.input_stream     // Catch: java.io.IOException -> L35
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L35
            r8.curChar = r1     // Catch: java.io.IOException -> L35
            r2 = 115(0x73, float:1.61E-43)
            if (r1 == r2) goto L2d
            r2 = 0
            r4 = 0
            r1 = 22
            r0 = r8
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L2d:
            r1 = 32768(0x8000, double:1.61895E-319)
            int r1 = r8.jjMoveStringLiteralDfa24_0(r6, r1)
            return r1
        L35:
            r2 = 0
            r4 = 0
            r1 = 22
            r0 = r8
            r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            r0 = 23
            return r0
    }

    private int jjMoveStringLiteralDfa24_0(long r9, long r11) {
            r8 = this;
            long r6 = r11 & r9
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r2 = 0
            r4 = 0
            r1 = 22
            r0 = r8
            r6 = r9
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L15:
            bsh.JavaCharStream r1 = r8.input_stream     // Catch: java.io.IOException -> L35
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L35
            r8.curChar = r1     // Catch: java.io.IOException -> L35
            r2 = 115(0x73, float:1.61E-43)
            if (r1 == r2) goto L2d
            r2 = 0
            r4 = 0
            r1 = 23
            r0 = r8
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L2d:
            r1 = 32768(0x8000, double:1.61895E-319)
            int r1 = r8.jjMoveStringLiteralDfa25_0(r6, r1)
            return r1
        L35:
            r2 = 0
            r4 = 0
            r1 = 23
            r0 = r8
            r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            r0 = 24
            return r0
    }

    private int jjMoveStringLiteralDfa25_0(long r9, long r11) {
            r8 = this;
            long r6 = r11 & r9
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r2 = 0
            r4 = 0
            r1 = 23
            r0 = r8
            r6 = r9
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L15:
            bsh.JavaCharStream r1 = r8.input_stream     // Catch: java.io.IOException -> L35
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L35
            r8.curChar = r1     // Catch: java.io.IOException -> L35
            r2 = 105(0x69, float:1.47E-43)
            if (r1 == r2) goto L2d
            r2 = 0
            r4 = 0
            r1 = 24
            r0 = r8
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L2d:
            r1 = 32768(0x8000, double:1.61895E-319)
            int r1 = r8.jjMoveStringLiteralDfa26_0(r6, r1)
            return r1
        L35:
            r2 = 0
            r4 = 0
            r1 = 24
            r0 = r8
            r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            r0 = 25
            return r0
    }

    private int jjMoveStringLiteralDfa26_0(long r9, long r11) {
            r8 = this;
            long r6 = r11 & r9
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L15
            r2 = 0
            r4 = 0
            r1 = 24
            r0 = r8
            r6 = r9
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L15:
            bsh.JavaCharStream r1 = r8.input_stream     // Catch: java.io.IOException -> L35
            char r1 = r1.readChar()     // Catch: java.io.IOException -> L35
            r8.curChar = r1     // Catch: java.io.IOException -> L35
            r2 = 103(0x67, float:1.44E-43)
            if (r1 == r2) goto L2d
            r2 = 0
            r4 = 0
            r1 = 25
            r0 = r8
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L2d:
            r1 = 32768(0x8000, double:1.61895E-319)
            int r1 = r8.jjMoveStringLiteralDfa27_0(r6, r1)
            return r1
        L35:
            r2 = 0
            r4 = 0
            r1 = 25
            r0 = r8
            r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            r0 = 26
            return r0
    }

    private int jjMoveStringLiteralDfa27_0(long r10, long r12) {
            r9 = this;
            long r6 = r12 & r10
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L15
            r2 = 0
            r4 = 0
            r1 = 25
            r0 = r9
            r6 = r10
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L15:
            r8 = 27
            bsh.JavaCharStream r3 = r9.input_stream     // Catch: java.io.IOException -> L3f
            char r3 = r3.readChar()     // Catch: java.io.IOException -> L3f
            r9.curChar = r3     // Catch: java.io.IOException -> L3f
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L24
            goto L33
        L24:
            r3 = 32768(0x8000, double:1.61895E-319)
            long r3 = r3 & r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L33
            r0 = 143(0x8f, float:2.0E-43)
            int r0 = r9.jjStopAtPos(r8, r0)
            return r0
        L33:
            r2 = 0
            r4 = 0
            r1 = 26
            r0 = r9
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L3f:
            r2 = 0
            r4 = 0
            r1 = 26
            r0 = r9
            r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            return r8
    }

    private int jjMoveStringLiteralDfa2_0(long r16, long r18, long r20, long r22, long r24, long r26) {
            r15 = this;
            long r1 = r18 & r16
            long r5 = r22 & r20
            long r3 = r1 | r5
            long r9 = r26 & r24
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1c
            r1 = 0
            r0 = r15
            r2 = r16
            r4 = r20
            r6 = r24
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1c:
            r3 = 2
            bsh.JavaCharStream r4 = r15.input_stream     // Catch: java.io.IOException -> L21d
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L21d
            r15.curChar = r4     // Catch: java.io.IOException -> L21d
            r11 = 46
            if (r4 == r11) goto L1fe
            r11 = 105(0x69, float:1.47E-43)
            if (r4 == r11) goto L1eb
            r11 = 108(0x6c, float:1.51E-43)
            if (r4 == r11) goto L1dc
            r11 = 119(0x77, float:1.67E-43)
            r12 = 42
            if (r4 == r11) goto L1cb
            r11 = 121(0x79, float:1.7E-43)
            if (r4 == r11) goto L1bd
            r11 = 61
            if (r4 == r11) goto L184
            r11 = 62
            if (r4 == r11) goto L15b
            r11 = 101(0x65, float:1.42E-43)
            if (r4 == r11) goto L14c
            r11 = 102(0x66, float:1.43E-43)
            if (r4 == r11) goto L13e
            switch(r4) {
                case 97: goto L12f;
                case 98: goto L120;
                case 99: goto L111;
                default: goto L4e;
            }
        L4e:
            switch(r4) {
                case 110: goto Lff;
                case 111: goto Lf0;
                case 112: goto Le1;
                default: goto L51;
            }
        L51:
            switch(r4) {
                case 114: goto Lb4;
                case 115: goto La5;
                case 116: goto L65;
                case 117: goto L56;
                default: goto L54;
            }
        L54:
            goto L20d
        L56:
            r7 = 0
            r11 = 0
            r3 = 72057594079870976(0x100000002800000, double:7.291122087460263E-304)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L65:
            r11 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L76
            r4 = 37
            r15.jjmatchedKind = r4
            r15.jjmatchedPos = r3
            goto L93
        L76:
            r11 = 8388608(0x800000, double:4.144523E-317)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L85
            r4 = 87
            r15.jjmatchedKind = r4
            r15.jjmatchedPos = r3
            goto L93
        L85:
            r11 = 33554432(0x2000000, double:1.6578092E-316)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L93
            r4 = 89
            r15.jjmatchedKind = r4
            r15.jjmatchedPos = r3
        L93:
            r7 = 5368709120(0x140000000, double:2.6524947387E-314)
            r11 = 0
            r3 = 142116240130048(0x814104028000, double:7.0214751964382E-310)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        La5:
            r7 = 0
            r11 = 0
            r3 = 68736321536(0x1001010800, double:3.39602550924E-313)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lb4:
            r13 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lc5
            r1 = 31
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Lc5:
            r11 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto Ld5
            r4 = 99
            r15.jjmatchedKind = r4
            r15.jjmatchedPos = r3
        Ld5:
            r7 = 0
            r11 = 8
            r3 = 55169095435288576(0xc4000000000000, double:5.696189077778436E-305)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        Le1:
            r7 = 0
            r11 = 0
            r3 = 51539607552(0xc00000000, double:2.54639494916E-313)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lf0:
            r7 = 11258999068426240(0x28000000000000, double:6.675221575521604E-308)
            r11 = 672(0x2a0, double:3.32E-321)
            r3 = 316660422545408(0x1200040001000, double:1.56451036177259E-309)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lff:
            r7 = 137438953472(0x2000000000, double:6.7903865311E-313)
            r11 = 2
            r3 = 4504150190063616(0x10008030180000, double:2.225345872619754E-308)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L111:
            r7 = 0
            r11 = 0
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L120:
            r7 = 0
            r11 = 0
            r3 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L12f:
            r7 = 0
            r11 = 0
            r3 = 9570149208440832(0x22000000044000, double:5.006416181916425E-308)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L13e:
            r7 = 0
            r11 = 67108864(0x4000000, double:3.3156184E-316)
            r3 = 2097152(0x200000, double:1.036131E-317)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L14c:
            r7 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 1152921504606855168(0x1000000000002000, double:1.28822975392177E-231)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L15b:
            r11 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L169
            r4 = 122(0x7a, float:1.71E-43)
            r15.jjmatchedKind = r4
            r15.jjmatchedPos = r3
            goto L178
        L169:
            r11 = 131072(0x20000, double:6.4758E-319)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L178
            r1 = 145(0x91, float:2.03E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L178:
            r7 = 0
            r11 = 16384(0x4000, double:8.095E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L184:
            r11 = 256(0x100, double:1.265E-321)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L192
            r1 = 136(0x88, float:1.9E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L192:
            r11 = 1024(0x400, double:5.06E-321)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L1a0
            r1 = 138(0x8a, float:1.93E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L1a0:
            r11 = 4096(0x1000, double:2.0237E-320)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L1ae
            r1 = 140(0x8c, float:1.96E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L1ae:
            r11 = 262144(0x40000, double:1.295163E-318)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L20d
            r1 = 146(0x92, float:2.05E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L1bd:
            r13 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto L20d
            r1 = 57
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        L1cb:
            r13 = 2199023255552(0x20000000000, double:1.086461844974E-311)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto L20d
            r1 = 41
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        L1dc:
            r7 = 0
            r11 = 0
            r3 = 576465150484152320(0x800040008000000, double:3.789464146640099E-270)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1eb:
            r7 = 721314812193144832(0xa02a00000000000, double:1.8927359922702314E-260)
            r11 = 40960(0xa000, double:2.0237E-319)
            r3 = 2596342777365135360(0x2408100000000000, double:4.1382116822613267E-135)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa3_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1fe:
            r11 = 16777216(0x1000000, double:8.289046E-317)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L20d
            r1 = 152(0x98, float:2.13E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L20d:
            r3 = 1
            r16 = r15
            r18 = r1
            r17 = r3
            r20 = r5
            r22 = r9
            int r0 = r16.jjStartNfa_0(r17, r18, r20, r22)
            return r0
        L21d:
            r0 = 1
            r16 = r15
            r17 = r0
            r18 = r1
            r20 = r5
            r22 = r9
            r16.jjStopStringLiteralDfa_0(r17, r18, r20, r22)
            return r3
    }

    private int jjMoveStringLiteralDfa3_0(long r15, long r17, long r19, long r21, long r23, long r25) {
            r14 = this;
            long r1 = r17 & r15
            long r5 = r21 & r19
            long r3 = r1 | r5
            long r9 = r25 & r23
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1b
            r1 = 1
            r0 = r14
            r2 = r15
            r4 = r19
            r6 = r23
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1b:
            r3 = 3
            bsh.JavaCharStream r4 = r14.input_stream     // Catch: java.io.IOException -> L237
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L237
            r14.curChar = r4     // Catch: java.io.IOException -> L237
            r11 = 61
            if (r4 == r11) goto L21a
            r11 = 95
            if (r4 == r11) goto L20e
            r11 = 105(0x69, float:1.47E-43)
            if (r4 == r11) goto L1ff
            r11 = 42
            switch(r4) {
                case 97: goto L1ef;
                case 98: goto L1e2;
                case 99: goto L1d3;
                case 100: goto L19b;
                case 101: goto L14e;
                case 102: goto L142;
                case 103: goto L124;
                default: goto L35;
            }
        L35:
            switch(r4) {
                case 107: goto L115;
                case 108: goto Lf7;
                case 109: goto Le8;
                case 110: goto Lce;
                case 111: goto Lae;
                default: goto L38;
            }
        L38:
            switch(r4) {
                case 114: goto L93;
                case 115: goto L86;
                case 116: goto L74;
                case 117: goto L65;
                case 118: goto L56;
                case 119: goto L3d;
                default: goto L3b;
            }
        L3b:
            goto L228
        L3d:
            r11 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L4a
            r4 = 117(0x75, float:1.64E-43)
            r14.jjmatchedKind = r4
            r14.jjmatchedPos = r3
        L4a:
            r7 = 0
            r11 = 512(0x200, double:2.53E-321)
            r3 = 0
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L56:
            r7 = 0
            r11 = 0
            r3 = 17592186044416(0x100000000000, double:8.691694759794E-311)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L65:
            r7 = 0
            r11 = 0
            r3 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L74:
            r7 = 738871813865472(0x2a00000000000, double:3.650511799113377E-309)
            r11 = 0
            r3 = 2850002859722752(0xa201000100800, double:1.408088503538321E-308)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L86:
            r7 = 0
            r11 = 0
            r3 = 134758400(0x8084000, double:6.6579496E-316)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L93:
            r12 = 262144(0x40000, double:1.295163E-318)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto La2
            r1 = 18
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        La2:
            r7 = 0
            r11 = 32
            r3 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lae:
            r12 = 4294967296(0x100000000, double:2.121995791E-314)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto Lbf
            r1 = 32
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        Lbf:
            r7 = 0
            r11 = 0
            r3 = 54043229888184320(0xc0000800000000, double:4.556986029001788E-305)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lce:
            r12 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto Ldc
            r1 = 60
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        Ldc:
            r7 = 0
            r11 = 0
            r3 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        Le8:
            r12 = 33554432(0x2000000, double:1.6578092E-316)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L228
            r1 = 25
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        Lf7:
            r12 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L106
            int r1 = r14.jjStartNfaWithStates_0(r3, r11, r11)
            return r1
        L106:
            r7 = 0
            r11 = 0
            r3 = 2305913395137744896(0x2000400400001000, double:1.5149811512887973E-154)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L115:
            r7 = 0
            r11 = 0
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L124:
            r12 = 549755813888(0x8000000000, double:2.716154612436E-312)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L135
            r1 = 39
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L135:
            r7 = 720575940379279360(0xa00000000000000, double:1.6259745436952323E-260)
            r11 = 40960(0xa000, double:2.0237E-319)
            r3 = 0
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L142:
            r7 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 0
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L14e:
            r12 = 32768(0x8000, double:1.61895E-319)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L15d
            r1 = 15
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L15d:
            r12 = 65536(0x10000, double:3.2379E-319)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L16c
            r1 = 16
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L16c:
            r12 = 16777216(0x1000000, double:8.289046E-317)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L17b
            r1 = 24
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L17b:
            r12 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L189
            r1 = 56
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L189:
            r7 = 5368709120(0x140000000, double:2.6524947387E-314)
            r11 = 0
            r3 = 274945015808(0x4004000000, double:1.35840886806E-312)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L19b:
            r12 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L1a9
            r1 = 58
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L1a9:
            r11 = 137438953472(0x2000000000, double:6.7903865311E-313)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L1ba
            r4 = 101(0x65, float:1.42E-43)
            r14.jjmatchedKind = r4
            r14.jjmatchedPos = r3
            goto L1c7
        L1ba:
            r11 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L1c7
            r4 = 115(0x73, float:1.61E-43)
            r14.jjmatchedKind = r4
            r14.jjmatchedPos = r3
        L1c7:
            r7 = 0
            r11 = 130(0x82, double:6.4E-322)
            r3 = 0
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1d3:
            r7 = 0
            r11 = 0
            r3 = 4503599627501568(0x10000000020000, double:2.2250738585719596E-308)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1e2:
            r7 = 0
            r11 = 0
            r3 = 8388608(0x800000, double:4.144523E-317)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1ef:
            r7 = 0
            r11 = 67108864(0x4000000, double:3.3156184E-316)
            r3 = 576460754184577024(0x800000070202000, double:3.785768577048529E-270)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1ff:
            r7 = 0
            r11 = 0
            r3 = 1126999418470400(0x4010000000000, double:5.568116955492875E-309)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L20e:
            r7 = 0
            r11 = 8
            r3 = 0
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa4_0(r1, r3, r5, r7, r9, r11)
            return r1
        L21a:
            r11 = 16384(0x4000, double:8.095E-320)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L228
            r1 = 142(0x8e, float:1.99E-43)
            int r1 = r14.jjStopAtPos(r3, r1)
            return r1
        L228:
            r3 = 2
            r15 = r14
            r17 = r1
            r16 = r3
            r19 = r5
            r21 = r9
            int r0 = r15.jjStartNfa_0(r16, r17, r19, r21)
            return r0
        L237:
            r0 = 2
            r15 = r14
            r16 = r0
            r17 = r1
            r19 = r5
            r21 = r9
            r15.jjStopStringLiteralDfa_0(r16, r17, r19, r21)
            return r3
    }

    private int jjMoveStringLiteralDfa4_0(long r17, long r19, long r21, long r23, long r25, long r27) {
            r16 = this;
            long r1 = r19 & r17
            long r5 = r23 & r21
            long r3 = r1 | r5
            long r9 = r27 & r25
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1d
            r1 = 2
            r0 = r16
            r2 = r17
            r4 = r21
            r6 = r25
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1d:
            r0 = r16
            r3 = 4
            bsh.JavaCharStream r4 = r0.input_stream     // Catch: java.io.IOException -> L1aa
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L1aa
            r0.curChar = r4     // Catch: java.io.IOException -> L1aa
            r11 = 1073741824(0x40000000, double:5.304989477E-315)
            r13 = 42
            switch(r4) {
                case 95: goto L19d;
                case 96: goto L30;
                case 97: goto L18d;
                case 98: goto L30;
                case 99: goto L180;
                case 100: goto L30;
                case 101: goto L155;
                case 102: goto L30;
                case 103: goto L30;
                case 104: goto L13a;
                case 105: goto L12a;
                case 106: goto L30;
                case 107: goto L10c;
                case 108: goto Lf2;
                case 109: goto L30;
                case 110: goto Le6;
                case 111: goto L30;
                case 112: goto L30;
                case 113: goto Lc9;
                case 114: goto Lb9;
                case 115: goto La0;
                case 116: goto L6c;
                case 117: goto L5d;
                case 118: goto L4d;
                case 119: goto L32;
                default: goto L30;
            }
        L30:
            goto L11a
        L32:
            r11 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L3f
            r4 = 54
            r0.jjmatchedKind = r4
            r0.jjmatchedPos = r3
        L3f:
            r7 = 738871813865472(0x2a00000000000, double:3.650511799113377E-309)
            r11 = 0
            r3 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L4d:
            r7 = 0
            r11 = 0
            r3 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            r0 = r16
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L5d:
            r7 = 0
            r11 = 67108864(0x4000000, double:3.3156184E-316)
            r3 = 2097152(0x200000, double:1.036131E-317)
            r0 = r16
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L6c:
            r14 = 524288(0x80000, double:2.590327E-318)
            long r14 = r14 & r1
            int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r4 == 0) goto L7b
            r1 = 19
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        L7b:
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L87
            r1 = 30
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        L87:
            r11 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L95
            r1 = 48
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        L95:
            r7 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        La0:
            r11 = 16384(0x4000, double:8.095E-320)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto Lae
            r1 = 14
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        Lae:
            r7 = 0
            r11 = 0
            r3 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lb9:
            r7 = 0
            r11 = 0
            r3 = 141046726002688(0x804800000800, double:6.96863417763114E-310)
            r0 = r16
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lc9:
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto Ld5
            r1 = 94
            int r1 = r0.jjStopAtPos(r3, r1)
            return r1
        Ld5:
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            long r11 = r11 & r5
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L11a
            r1 = 96
            int r1 = r0.jjStopAtPos(r3, r1)
            return r1
        Le6:
            r7 = 0
            r11 = 0
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lf2:
            r11 = 268435456(0x10000000, double:1.32624737E-315)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L100
            r4 = 28
            r0.jjmatchedKind = r4
            r0.jjmatchedPos = r3
        L100:
            r7 = 0
            r11 = 0
            r3 = 545259520(0x20800000, double:2.69393997E-315)
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L10c:
            r11 = 8192(0x2000, double:4.0474E-320)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L11a
            r1 = 13
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        L11a:
            r3 = 3
            r17 = r0
            r19 = r1
            r18 = r3
            r21 = r5
            r23 = r9
            int r0 = r17.jjStartNfa_0(r18, r19, r21, r23)
            return r0
        L12a:
            r7 = 0
            r11 = 0
            r3 = 633318698647552(0x2400000100000, double:3.129010118706406E-309)
            r0 = r16
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L13a:
            r11 = 131072(0x20000, double:6.4758E-319)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L149
            r1 = 17
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        L149:
            r7 = 720575940379279360(0xa00000000000000, double:1.6259745436952323E-260)
            r11 = 40960(0xa000, double:2.0237E-319)
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L155:
            r11 = 134217728(0x8000000, double:6.63123685E-316)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L164
            r1 = 27
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        L164:
            r11 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L172
            r1 = 61
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r13)
            return r1
        L172:
            r7 = 0
            r11 = 0
            r3 = 35201551962112(0x200400001000, double:1.7391877504775E-310)
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L180:
            r7 = 0
            r11 = 0
            r3 = 3377699720527872(0xc000000000000, double:1.668805393880401E-308)
            r0 = r16
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L18d:
            r7 = 0
            r11 = 8
            r3 = 26456998543360(0x181000000000, double:1.3071494072346E-310)
            r0 = r16
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L19d:
            r7 = 0
            r11 = 674(0x2a2, double:3.33E-321)
            r3 = 0
            r0 = r16
            int r1 = r0.jjMoveStringLiteralDfa5_0(r1, r3, r5, r7, r9, r11)
            return r1
        L1aa:
            r0 = 3
            r17 = r16
            r18 = r0
            r19 = r1
            r21 = r5
            r23 = r9
            r17.jjStopStringLiteralDfa_0(r18, r19, r21, r23)
            return r3
    }

    private int jjMoveStringLiteralDfa5_0(long r15, long r17, long r19, long r21, long r23, long r25) {
            r14 = this;
            long r1 = r17 & r15
            long r5 = r21 & r19
            long r3 = r1 | r5
            long r9 = r25 & r23
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1b
            r1 = 3
            r0 = r14
            r2 = r15
            r4 = r19
            r6 = r23
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1b:
            r3 = 5
            bsh.JavaCharStream r4 = r14.input_stream     // Catch: java.io.IOException -> L16c
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L16c
            r14.curChar = r4     // Catch: java.io.IOException -> L16c
            r11 = 42
            switch(r4) {
                case 95: goto L160;
                case 96: goto L29;
                case 97: goto L154;
                case 98: goto L29;
                case 99: goto L126;
                case 100: goto L119;
                case 101: goto Lea;
                case 102: goto Ldb;
                case 103: goto Lcc;
                case 104: goto Lbe;
                case 105: goto Laf;
                case 106: goto L29;
                case 107: goto L29;
                case 108: goto La1;
                case 109: goto L92;
                case 110: goto L72;
                case 111: goto L29;
                case 112: goto L29;
                case 113: goto L29;
                case 114: goto L66;
                case 115: goto L4c;
                case 116: goto L2b;
                default: goto L29;
            }
        L29:
            goto L10a
        L2b:
            r12 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L3c
            r1 = 35
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L3c:
            r7 = 720575940379279360(0xa00000000000000, double:1.6259745436952323E-260)
            r11 = 40960(0xa000, double:2.0237E-319)
            r3 = 1143492092887040(0x4100000000000, double:5.64960159386594E-309)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L4c:
            r12 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L5a
            r1 = 55
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L5a:
            r7 = 0
            r11 = 8
            r3 = 0
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L66:
            r7 = 0
            r11 = 0
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L72:
            r12 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L83
            r1 = 47
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L83:
            r7 = 0
            r11 = 0
            r3 = 68720525312(0x1000100000, double:3.3952450721E-313)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L92:
            r7 = 0
            r11 = 0
            r3 = 17179869184(0x400000000, double:8.487983164E-314)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        La1:
            r7 = 0
            r11 = 67108864(0x4000000, double:3.3156184E-316)
            r3 = 538968064(0x20200000, double:2.662856046E-315)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        Laf:
            r7 = 738871813865472(0x2a00000000000, double:3.650511799113377E-309)
            r11 = 0
            r3 = 585467951558164480(0x820000000000000, double:1.5143067982934716E-269)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lbe:
            r12 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L10a
            r1 = 51
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        Lcc:
            r7 = 0
            r11 = 0
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        Ldb:
            r7 = 0
            r11 = 0
            r3 = 274877906944(0x4000000000, double:1.35807730622E-312)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lea:
            r12 = 8388608(0x800000, double:4.144523E-317)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto Lf9
            r1 = 23
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        Lf9:
            r12 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L10a
            r1 = 40
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L10a:
            r3 = 4
            r15 = r14
            r17 = r1
            r16 = r3
            r19 = r5
            r21 = r9
            int r0 = r15.jjStartNfa_0(r16, r17, r19, r21)
            return r0
        L119:
            r7 = 0
            r11 = 0
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L126:
            r12 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L137
            r1 = 46
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L137:
            r12 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r12 = r12 & r1
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 == 0) goto L145
            r1 = 49
            int r1 = r14.jjStartNfaWithStates_0(r3, r1, r11)
            return r1
        L145:
            r7 = 0
            r11 = 0
            r3 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L154:
            r7 = 0
            r11 = 674(0x2a2, double:3.33E-321)
            r3 = 6144(0x1800, double:3.0355E-320)
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L160:
            r7 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 0
            r0 = r14
            int r1 = r0.jjMoveStringLiteralDfa6_0(r1, r3, r5, r7, r9, r11)
            return r1
        L16c:
            r0 = 4
            r15 = r14
            r16 = r0
            r17 = r1
            r19 = r5
            r21 = r9
            r15.jjStopStringLiteralDfa_0(r16, r17, r19, r21)
            return r3
    }

    private int jjMoveStringLiteralDfa6_0(long r16, long r18, long r20, long r22, long r24, long r26) {
            r15 = this;
            long r1 = r18 & r16
            long r5 = r22 & r20
            long r3 = r1 | r5
            long r9 = r26 & r24
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1c
            r1 = 4
            r0 = r15
            r2 = r16
            r4 = r20
            r6 = r24
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1c:
            r3 = 6
            bsh.JavaCharStream r4 = r15.input_stream     // Catch: java.io.IOException -> L146
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L146
            r15.curChar = r4     // Catch: java.io.IOException -> L146
            r11 = 95
            if (r4 == r11) goto L139
            r11 = 97
            if (r4 == r11) goto L12a
            r11 = 99
            if (r4 == r11) goto L11b
            r11 = 108(0x6c, float:1.51E-43)
            if (r4 == r11) goto L10f
            r11 = 121(0x79, float:1.7E-43)
            r12 = 42
            if (r4 == r11) goto Lf0
            r11 = 101(0x65, float:1.42E-43)
            if (r4 == r11) goto Lbf
            r11 = 102(0x66, float:1.43E-43)
            if (r4 == r11) goto Lb3
            r11 = 110(0x6e, float:1.54E-43)
            if (r4 == r11) goto La5
            r11 = 111(0x6f, float:1.56E-43)
            if (r4 == r11) goto L99
            switch(r4) {
                case 115: goto L7b;
                case 116: goto L5d;
                case 117: goto L50;
                default: goto L4e;
            }
        L4e:
            goto Lff
        L50:
            r7 = 0
            r11 = 0
            r3 = 1048576(0x100000, double:5.180654E-318)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        L5d:
            r11 = 2097152(0x200000, double:1.036131E-317)
            long r11 = r11 & r1
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L6b
            r4 = 21
            r15.jjmatchedKind = r4
            r15.jjmatchedPos = r3
        L6b:
            r7 = 0
            r11 = 67108864(0x4000000, double:3.3156184E-316)
            r3 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        L7b:
            r13 = 67108864(0x4000000, double:3.3156184E-316)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto L8a
            r1 = 26
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        L8a:
            r7 = 36767668832829440(0x82a00000000000, double:3.31536004917573E-306)
            r11 = 2730(0xaaa, double:1.349E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        L99:
            r7 = 0
            r11 = 0
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        La5:
            r13 = 4096(0x1000, double:2.0237E-320)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lff
            r1 = 12
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Lb3:
            r7 = 0
            r11 = 0
            r3 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lbf:
            r13 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Ld0
            r1 = 43
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Ld0:
            r13 = 17592186044416(0x100000000000, double:8.691694759794E-311)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Le1
            r1 = 44
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Le1:
            r7 = 0
            r11 = 0
            r3 = 9007216434610176(0x20000400000000, double:4.45016469298073E-308)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lf0:
            r13 = 536870912(0x20000000, double:2.65249474E-315)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lff
            r1 = 29
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Lff:
            r3 = 5
            r16 = r15
            r18 = r1
            r17 = r3
            r20 = r5
            r22 = r9
            int r0 = r16.jjStartNfa_0(r17, r18, r20, r22)
            return r0
        L10f:
            r7 = 0
            r11 = 0
            r3 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        L11b:
            r7 = 0
            r11 = 0
            r3 = 68719478784(0x1000000800, double:3.39519336673E-313)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        L12a:
            r7 = 0
            r11 = 0
            r3 = 274877906944(0x4000000000, double:1.35807730622E-312)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        L139:
            r7 = 720575940379279360(0xa00000000000000, double:1.6259745436952323E-260)
            r11 = 40960(0xa000, double:2.0237E-319)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa7_0(r1, r3, r5, r7, r9, r11)
            return r1
        L146:
            r0 = 5
            r16 = r15
            r17 = r0
            r18 = r1
            r20 = r5
            r22 = r9
            r16.jjStopStringLiteralDfa_0(r17, r18, r20, r22)
            return r3
    }

    private int jjMoveStringLiteralDfa7_0(long r16, long r18, long r20, long r22, long r24, long r26) {
            r15 = this;
            long r1 = r18 & r16
            long r5 = r22 & r20
            long r3 = r1 | r5
            long r9 = r26 & r24
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1c
            r1 = 5
            r0 = r15
            r2 = r16
            r4 = r20
            r6 = r24
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1c:
            r3 = 7
            bsh.JavaCharStream r4 = r15.input_stream     // Catch: java.io.IOException -> L101
            char r4 = r4.readChar()     // Catch: java.io.IOException -> L101
            r15.curChar = r4     // Catch: java.io.IOException -> L101
            r11 = 58
            if (r4 == r11) goto Le2
            r11 = 99
            if (r4 == r11) goto Ld3
            r11 = 101(0x65, float:1.42E-43)
            r12 = 42
            if (r4 == r11) goto La4
            r11 = 110(0x6e, float:1.54E-43)
            if (r4 == r11) goto L95
            r11 = 112(0x70, float:1.57E-43)
            if (r4 == r11) goto L87
            r11 = 104(0x68, float:1.46E-43)
            if (r4 == r11) goto L7b
            r11 = 105(0x69, float:1.47E-43)
            if (r4 == r11) goto L6f
            switch(r4) {
                case 115: goto L63;
                case 116: goto L55;
                case 117: goto L48;
                default: goto L46;
            }
        L46:
            goto Lf1
        L48:
            r7 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r11 = 32768(0x8000, double:1.61895E-319)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa8_0(r1, r3, r5, r7, r9, r11)
            return r1
        L55:
            r13 = 2048(0x800, double:1.012E-320)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lf1
            r1 = 11
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        L63:
            r7 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r11 = 8866(0x22a2, double:4.3804E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa8_0(r1, r3, r5, r7, r9, r11)
            return r1
        L6f:
            r7 = 0
            r11 = 8
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa8_0(r1, r3, r5, r7, r9, r11)
            return r1
        L7b:
            r7 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa8_0(r1, r3, r5, r7, r9, r11)
            return r1
        L87:
            r13 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lf1
            r1 = 50
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        L95:
            r7 = 0
            r11 = 0
            r3 = 13510816061980672(0x30000400000000, double:8.90032938596146E-308)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa8_0(r1, r3, r5, r7, r9, r11)
            return r1
        La4:
            r13 = 1048576(0x100000, double:5.180654E-318)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lb3
            r1 = 20
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Lb3:
            r13 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lc1
            r1 = 59
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Lc1:
            r7 = 738871813865472(0x2a00000000000, double:3.650511799113377E-309)
            r11 = 0
            r3 = 35253091565568(0x201000000000, double:1.7417341452243E-310)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa8_0(r1, r3, r5, r7, r9, r11)
            return r1
        Ld3:
            r7 = 0
            r11 = 0
            r3 = 274877906944(0x4000000000, double:1.35807730622E-312)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa8_0(r1, r3, r5, r7, r9, r11)
            return r1
        Le2:
            r11 = 67108864(0x4000000, double:3.3156184E-316)
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto Lf1
            r1 = 154(0x9a, float:2.16E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        Lf1:
            r3 = 6
            r16 = r15
            r18 = r1
            r17 = r3
            r20 = r5
            r22 = r9
            int r0 = r16.jjStartNfa_0(r17, r18, r20, r22)
            return r0
        L101:
            r0 = 6
            r16 = r15
            r17 = r0
            r18 = r1
            r20 = r5
            r22 = r9
            r16.jjStopStringLiteralDfa_0(r17, r18, r20, r22)
            return r3
    }

    private int jjMoveStringLiteralDfa8_0(long r18, long r20, long r22, long r24, long r26, long r28) {
            r17 = this;
            long r1 = r20 & r18
            long r5 = r24 & r22
            long r3 = r1 | r5
            long r9 = r28 & r26
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1d
            r1 = 6
            r0 = r17
            r2 = r18
            r4 = r22
            r6 = r26
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1d:
            r0 = r17
            r3 = 8
            bsh.JavaCharStream r4 = r0.input_stream     // Catch: java.io.IOException -> Lf3
            char r4 = r4.readChar()     // Catch: java.io.IOException -> Lf3
            r0.curChar = r4     // Catch: java.io.IOException -> Lf3
            r11 = 95
            if (r4 == r11) goto Le3
            r11 = 116(0x74, float:1.63E-43)
            r12 = 42
            if (r4 == r11) goto Lbe
            r11 = 100
            if (r4 == r11) goto L9b
            r11 = 101(0x65, float:1.42E-43)
            if (r4 == r11) goto L8a
            r3 = 110(0x6e, float:1.54E-43)
            if (r4 == r3) goto L7c
            r3 = 111(0x6f, float:1.56E-43)
            if (r4 == r3) goto L6c
            switch(r4) {
                case 103: goto L5f;
                case 104: goto L52;
                case 105: goto L47;
                default: goto L46;
            }
        L46:
            goto Lac
        L47:
            r7 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r11 = 2722(0xaa2, double:1.345E-320)
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            int r1 = r0.jjMoveStringLiteralDfa9_0(r1, r3, r5, r7, r9, r11)
            return r1
        L52:
            r7 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r11 = 8192(0x2000, double:4.0474E-320)
            r3 = 0
            r0 = r17
            int r1 = r0.jjMoveStringLiteralDfa9_0(r1, r3, r5, r7, r9, r11)
            return r1
        L5f:
            r7 = 0
            r11 = 8
            r3 = 0
            r0 = r17
            int r1 = r0.jjMoveStringLiteralDfa9_0(r1, r3, r5, r7, r9, r11)
            return r1
        L6c:
            r7 = 0
            r11 = 0
            r3 = 68719476736(0x1000000000, double:3.39519326554E-313)
            r0 = r17
            int r1 = r0.jjMoveStringLiteralDfa9_0(r1, r3, r5, r7, r9, r11)
            return r1
        L7c:
            r7 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r11 = 32768(0x8000, double:1.61895E-319)
            r3 = 0
            r0 = r17
            int r1 = r0.jjMoveStringLiteralDfa9_0(r1, r3, r5, r7, r9, r11)
            return r1
        L8a:
            r13 = 274877906944(0x4000000000, double:1.35807730622E-312)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lac
            r1 = 38
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        L9b:
            r13 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lac
            r1 = 45
            int r1 = r0.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Lac:
            r3 = 7
            r18 = r0
            r20 = r1
            r19 = r3
            r22 = r5
            r24 = r9
            int r0 = r18.jjStartNfa_0(r19, r20, r22, r24)
            r1 = r18
            return r0
        Lbe:
            r13 = r9
            r9 = r5
            r4 = r1
            r1 = r0
            r15 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            long r15 = r15 & r4
            int r0 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r0 == 0) goto Ld0
            r0 = 53
            int r0 = r1.jjStartNfaWithStates_0(r3, r0, r12)
            return r0
        Ld0:
            r7 = 0
            r11 = 0
            r1 = r4
            r3 = 17179869184(0x400000000, double:8.487983164E-314)
            r0 = r17
            r5 = r9
            r9 = r13
            int r1 = r0.jjMoveStringLiteralDfa9_0(r1, r3, r5, r7, r9, r11)
            return r1
        Le3:
            r7 = 738871813865472(0x2a00000000000, double:3.650511799113377E-309)
            r11 = 0
            r3 = 0
            r0 = r17
            int r1 = r0.jjMoveStringLiteralDfa9_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lf3:
            r0 = 7
            r18 = r17
            r19 = r0
            r20 = r1
            r22 = r5
            r24 = r9
            r18.jjStopStringLiteralDfa_0(r19, r20, r22, r24)
            return r3
    }

    private int jjMoveStringLiteralDfa9_0(long r16, long r18, long r20, long r22, long r24, long r26) {
            r15 = this;
            long r1 = r18 & r16
            long r5 = r22 & r20
            long r3 = r1 | r5
            long r9 = r26 & r24
            long r3 = r3 | r9
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L1c
            r1 = 7
            r0 = r15
            r2 = r16
            r4 = r20
            r6 = r24
            int r1 = r0.jjStartNfa_0(r1, r2, r4, r6)
            return r1
        L1c:
            r3 = 9
            bsh.JavaCharStream r4 = r15.input_stream     // Catch: java.io.IOException -> Lf5
            char r4 = r4.readChar()     // Catch: java.io.IOException -> Lf5
            r15.curChar = r4     // Catch: java.io.IOException -> Lf5
            r11 = 97
            if (r4 == r11) goto Le6
            r11 = 105(0x69, float:1.47E-43)
            if (r4 == r11) goto Lda
            r11 = 115(0x73, float:1.61E-43)
            r12 = 42
            if (r4 == r11) goto Lbc
            r11 = 120(0x78, float:1.68E-43)
            if (r4 == r11) goto Lb0
            r11 = 122(0x7a, float:1.71E-43)
            if (r4 == r11) goto La4
            r11 = 102(0x66, float:1.43E-43)
            if (r4 == r11) goto L87
            r11 = 103(0x67, float:1.44E-43)
            if (r4 == r11) goto L7b
            r11 = 110(0x6e, float:1.54E-43)
            if (r4 == r11) goto L5c
            r3 = 111(0x6f, float:1.56E-43)
            if (r4 == r3) goto L4d
            goto L6a
        L4d:
            r7 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            r11 = 0
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        L5c:
            r11 = 8
            long r11 = r11 & r9
            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r4 == 0) goto L6a
            r1 = 131(0x83, float:1.84E-43)
            int r1 = r15.jjStopAtPos(r3, r1)
            return r1
        L6a:
            r3 = 8
            r16 = r15
            r18 = r1
            r17 = r3
            r20 = r5
            r22 = r9
            int r0 = r16.jjStartNfa_0(r17, r18, r20, r22)
            return r0
        L7b:
            r7 = 0
            r11 = 674(0x2a2, double:3.33E-321)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        L87:
            r13 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto L98
            r1 = 36
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        L98:
            r7 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            r11 = 2048(0x800, double:1.012E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        La4:
            r7 = 0
            r11 = 0
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lb0:
            r7 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            r11 = 0
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lbc:
            r13 = 17179869184(0x400000000, double:8.487983164E-314)
            long r13 = r13 & r1
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto Lcd
            r1 = 34
            int r1 = r15.jjStartNfaWithStates_0(r3, r1, r12)
            return r1
        Lcd:
            r7 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            r11 = 32768(0x8000, double:1.61895E-319)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lda:
            r7 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            r11 = 8192(0x2000, double:4.0474E-320)
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        Le6:
            r7 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            r11 = 0
            r3 = 0
            r0 = r15
            int r1 = r0.jjMoveStringLiteralDfa10_0(r1, r3, r5, r7, r9, r11)
            return r1
        Lf5:
            r0 = 8
            r16 = r15
            r17 = r0
            r18 = r1
            r20 = r5
            r22 = r9
            r16.jjStopStringLiteralDfa_0(r17, r18, r20, r22)
            return r3
    }

    private int jjStartNfaWithStates_0(int r1, int r2, int r3) {
            r0 = this;
            r0.jjmatchedKind = r2
            r0.jjmatchedPos = r1
            bsh.JavaCharStream r2 = r0.input_stream     // Catch: java.io.IOException -> L13
            char r2 = r2.readChar()     // Catch: java.io.IOException -> L13
            r0.curChar = r2     // Catch: java.io.IOException -> L13
            int r1 = r1 + 1
            int r1 = r0.jjMoveNfa_0(r3, r1)
            return r1
        L13:
            int r1 = r1 + 1
            return r1
    }

    private final int jjStartNfa_0(int r1, long r2, long r4, long r6) {
            r0 = this;
            int r2 = r0.jjStopStringLiteralDfa_0(r1, r2, r4, r6)
            r3 = r1
            r1 = r0
            int r3 = r3 + 1
            int r2 = r0.jjMoveNfa_0(r2, r3)
            return r2
    }

    private int jjStopAtPos(int r1, int r2) {
            r0 = this;
            r0.jjmatchedKind = r2
            r0.jjmatchedPos = r1
            int r1 = r1 + 1
            return r1
    }

    private final int jjStopStringLiteralDfa_0(int r11, long r12, long r14, long r16) {
            r10 = this;
            r0 = 80
            r1 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            r3 = 67108864(0x4000000, double:3.3156184E-316)
            r5 = 73
            r6 = -1
            r7 = 42
            r8 = 0
            switch(r11) {
                case 0: goto L17d;
                case 1: goto L144;
                case 2: goto L11c;
                case 3: goto Lf4;
                case 4: goto Lcc;
                case 5: goto La8;
                case 6: goto L80;
                case 7: goto L63;
                case 8: goto L45;
                case 9: goto L2c;
                case 10: goto L1a;
                case 11: goto L12;
                default: goto L11;
            }
        L11:
            return r6
        L12:
            long r11 = r12 & r1
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L19
            return r7
        L19:
            return r6
        L1a:
            long r11 = r12 & r1
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L2b
            int r11 = r10.jjmatchedPos
            r12 = 10
            if (r11 == r12) goto L2a
            r10.jjmatchedKind = r5
            r10.jjmatchedPos = r12
        L2a:
            return r7
        L2b:
            return r6
        L2c:
            r14 = 85899345920(0x1400000000, double:4.24399158193E-313)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L37
            return r7
        L37:
            long r11 = r12 & r1
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L44
            r10.jjmatchedKind = r5
            r11 = 9
            r10.jjmatchedPos = r11
            return r7
        L44:
            return r6
        L45:
            r14 = 9042658504736768(0x20204000000000, double:4.485186111514821E-308)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L50
            return r7
        L50:
            r14 = 4503685526716416(0x10001400000000, double:2.2251162984230207E-308)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L62
            r10.jjmatchedKind = r5
            r11 = 8
            r10.jjmatchedPos = r11
            return r7
        L62:
            return r6
        L63:
            r14 = 577586652211316736(0x804000000100800, double:4.732208745550263E-270)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L6e
            return r7
        L6e:
            r14 = 13546344031453184(0x30205400000000, double:8.97054198269292E-308)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L7f
            r10.jjmatchedKind = r5
            r11 = 7
            r10.jjmatchedPos = r11
            return r7
        L7f:
            return r6
        L80:
            r14 = 26388885147648(0x180024201000, double:1.3037841583503E-310)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 != 0) goto La7
            long r14 = r16 & r3
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L91
            goto La7
        L91:
            r14 = 591132996242769920(0x834205400100800, double:3.809670658287662E-269)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto La6
            int r11 = r10.jjmatchedPos
            r12 = 6
            if (r11 == r12) goto La5
            r10.jjmatchedKind = r5
            r10.jjmatchedPos = r12
        La5:
            return r7
        La6:
            return r6
        La7:
            return r7
        La8:
            r14 = 591159385127917568(0x834385424301800, double:3.827416848661961E-269)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 != 0) goto Lc6
            long r14 = r16 & r3
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto Lb9
            goto Lc6
        Lb9:
            r14 = 39055786898358272(0x8ac10800800000, double:4.7623751273280834E-306)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto Lc5
            return r7
        Lc5:
            return r6
        Lc6:
            r10.jjmatchedKind = r5
            r11 = 5
            r10.jjmatchedPos = r11
            return r7
        Lcc:
            r14 = 2360167681732796416(0x20c10000780a6000, double:6.491742504685056E-151)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto Ld7
            return r7
        Ld7:
            r14 = 594186374470440960(0x83ef95c04b01800, double:5.863028767575536E-269)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto Lea
            long r11 = r16 & r3
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto Le9
            goto Lea
        Le9:
            return r6
        Lea:
            int r11 = r10.jjmatchedPos
            r12 = 4
            if (r11 == r12) goto Lf3
            r10.jjmatchedKind = r5
            r10.jjmatchedPos = r12
        Lf3:
            return r7
        Lf4:
            r14 = 1513214426944471040(0x1500048103058000, double:1.559086696276105E-207)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto Lff
            return r7
        Lff:
            r14 = 2954354056203237376(0x28fff95c7cba7800, double:3.3238353346396894E-111)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto L112
            long r11 = r16 & r3
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L111
            goto L112
        L111:
            return r6
        L112:
            int r11 = r10.jjmatchedPos
            r12 = 3
            if (r11 == r12) goto L11b
            r10.jjmatchedKind = r5
            r10.jjmatchedPos = r12
        L11b:
            return r7
        L11c:
            r14 = 144117801563455488(0x200026080000000, double:4.781082631579543E-299)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L127
            return r7
        L127:
            r14 = 4467568208269801472(0x3dfffd9d7fbff800, double:4.655257288594862E-10)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto L13a
            long r11 = r16 & r3
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L139
            goto L13a
        L139:
            return r6
        L13a:
            int r11 = r10.jjmatchedPos
            r12 = 2
            if (r11 == r12) goto L143
            r10.jjmatchedKind = r5
            r10.jjmatchedPos = r12
        L143:
            return r7
        L144:
            r1 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            long r14 = r14 & r1
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 != 0) goto L17c
            r14 = 1024(0x400, double:5.06E-321)
            long r14 = r16 & r14
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L154
            goto L17c
        L154:
            r14 = 8602517504(0x200c00000, double:4.2502083665E-314)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L15f
            return r7
        L15f:
            r14 = 4611686009824868352(0x3ffffffdff3ff800, double:1.9999980898569447)
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 != 0) goto L172
            long r11 = r16 & r3
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L171
            goto L172
        L171:
            return r6
        L172:
            int r11 = r10.jjmatchedPos
            r12 = 1
            if (r11 == r12) goto L17b
            r10.jjmatchedKind = r5
            r10.jjmatchedPos = r12
        L17b:
            return r7
        L17c:
            return r0
        L17d:
            r1 = 18014399063130112(0x40000021000000, double:1.780059305636577E-307)
            long r1 = r1 & r14
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 != 0) goto L1d2
            r1 = 132096(0x20400, double:6.5264E-319)
            long r1 = r16 & r1
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 == 0) goto L191
            goto L1d2
        L191:
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 & r14
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 != 0) goto L1cf
            r0 = 16777216(0x1000000, double:8.289046E-317)
            long r0 = r16 & r0
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 == 0) goto L1a3
            goto L1cf
        L1a3:
            r0 = -9223363240761753600(0x8000080000000000, double:-4.345847379897E-311)
            long r14 = r14 & r0
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L1b0
            r11 = 69
            return r11
        L1b0:
            r14 = 4611686018427385856(0x3ffffffffffff800, double:1.9999999999995453)
            long r14 = r14 & r12
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 != 0) goto L1cc
            long r14 = r16 & r3
            int r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r11 == 0) goto L1c1
            goto L1cc
        L1c1:
            r14 = 62
            long r11 = r12 & r14
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L1cb
            r11 = 0
            return r11
        L1cb:
            return r6
        L1cc:
            r10.jjmatchedKind = r5
            return r7
        L1cf:
            r11 = 18
            return r11
        L1d2:
            return r0
    }

    public void MoreLexicalActions() {
            r2 = this;
            int r0 = r2.jjimageLen
            int r1 = r2.jjmatchedPos
            int r1 = r1 + 1
            r2.lengthOfMatch = r1
            int r0 = r0 + r1
            r2.jjimageLen = r0
            return
    }

    public void ReInit(bsh.JavaCharStream r2) {
            r1 = this;
            r0 = 0
            r1.jjnewStateCnt = r0
            r1.jjmatchedPos = r0
            int r0 = r1.defaultLexState
            r1.curLexState = r0
            r1.input_stream = r2
            r1.ReInitRounds()
            return
    }

    public void ReInit(bsh.JavaCharStream r1, int r2) {
            r0 = this;
            r0.ReInit(r1)
            r0.SwitchTo(r2)
            return
    }

    public void SkipLexicalActions(bsh.Token r1) {
            r0 = this;
            return
    }

    public void SwitchTo(int r4) {
            r3 = this;
            r0 = 1
            if (r4 >= r0) goto L8
            if (r4 < 0) goto L8
            r3.curLexState = r4
            return
        L8:
            bsh.TokenMgrException r0 = new bsh.TokenMgrException
            java.lang.String r1 = "Error: Ignoring invalid lexical state : "
            java.lang.String r2 = ". State unchanged."
            java.lang.String r4 = eh.a.m(r4, r1, r2)
            r1 = 2
            r0.<init>(r4, r1)
            throw r0
    }

    public void TokenLexicalActions(bsh.Token r1) {
            r0 = this;
            return
    }

    public bsh.Token getNextToken() {
            r17 = this;
            r0 = r17
            java.lang.String r1 = ""
            r2 = 0
            r3 = r2
        L6:
            r4 = 0
            bsh.JavaCharStream r5 = r0.input_stream     // Catch: java.lang.Exception -> Lbb
            char r5 = r5.beginToken()     // Catch: java.lang.Exception -> Lbb
            r0.curChar = r5     // Catch: java.lang.Exception -> Lbb
            r5 = 2147483647(0x7fffffff, float:NaN)
            r0.jjmatchedKind = r5
            r0.jjmatchedPos = r4
            int r6 = r0.jjMoveStringLiteralDfa0_0()
            int r7 = r0.jjmatchedKind
            r8 = 1
            if (r7 == r5) goto L64
            int r4 = r0.jjmatchedPos
            int r5 = r4 + 1
            if (r5 >= r6) goto L2c
            bsh.JavaCharStream r5 = r0.input_stream
            int r6 = r6 - r4
            int r6 = r6 - r8
            r5.backup(r6)
        L2c:
            long[] r4 = bsh.ParserTokenManager.jjtoToken
            int r5 = r0.jjmatchedKind
            int r6 = r5 >> 6
            r6 = r4[r6]
            r4 = r5 & 63
            r8 = 1
            long r10 = r8 << r4
            long r6 = r6 & r10
            r10 = 0
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L48
            bsh.Token r1 = r0.jjFillToken()
            r1.specialToken = r3
            return r1
        L48:
            long[] r4 = bsh.ParserTokenManager.jjtoSpecial
            int r6 = r5 >> 6
            r6 = r4[r6]
            r4 = r5 & 63
            long r4 = r8 << r4
            long r4 = r4 & r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6
            bsh.Token r4 = r0.jjFillToken()
            if (r3 != 0) goto L5e
            goto L62
        L5e:
            r4.specialToken = r3
            r3.next = r4
        L62:
            r3 = r4
            goto L6
        L64:
            bsh.JavaCharStream r3 = r0.input_stream
            int r3 = r3.getEndLine()
            bsh.JavaCharStream r5 = r0.input_stream
            int r5 = r5.getEndColumn()
            bsh.JavaCharStream r7 = r0.input_stream     // Catch: java.io.IOException -> L7e
            r7.readChar()     // Catch: java.io.IOException -> L7e
            bsh.JavaCharStream r7 = r0.input_stream     // Catch: java.io.IOException -> L7e
            r7.backup(r8)     // Catch: java.io.IOException -> L7e
            r12 = r3
            r10 = r4
            r13 = r5
            goto L9c
        L7e:
            if (r6 > r8) goto L82
            r2 = r1
            goto L88
        L82:
            bsh.JavaCharStream r2 = r0.input_stream
            java.lang.String r2 = r2.getImage()
        L88:
            int r7 = r0.curChar
            r9 = 10
            if (r7 == r9) goto L99
            r9 = 13
            if (r7 != r9) goto L93
            goto L99
        L93:
            int r4 = r5 + 1
        L95:
            r12 = r3
            r13 = r4
            r10 = r8
            goto L9c
        L99:
            int r3 = r3 + 1
            goto L95
        L9c:
            if (r10 != 0) goto Lae
            bsh.JavaCharStream r2 = r0.input_stream
            r2.backup(r8)
            if (r6 > r8) goto La6
            goto Lac
        La6:
            bsh.JavaCharStream r1 = r0.input_stream
            java.lang.String r1 = r1.getImage()
        Lac:
            r14 = r1
            goto Laf
        Lae:
            r14 = r2
        Laf:
            bsh.TokenMgrException r9 = new bsh.TokenMgrException
            int r11 = r0.curLexState
            int r15 = r0.curChar
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            throw r9
        Lbb:
            r0.jjmatchedKind = r4
            r1 = -1
            r0.jjmatchedPos = r1
            bsh.Token r1 = r0.jjFillToken()
            r1.specialToken = r3
            return r1
    }

    public bsh.Token jjFillToken() {
            r7 = this;
            java.lang.String[] r0 = bsh.ParserTokenManager.jjstrLiteralImages
            int r1 = r7.jjmatchedKind
            r0 = r0[r1]
            if (r0 != 0) goto Le
            bsh.JavaCharStream r0 = r7.input_stream
            java.lang.String r0 = r0.getImage()
        Le:
            bsh.JavaCharStream r1 = r7.input_stream
            int r1 = r1.getBeginLine()
            bsh.JavaCharStream r2 = r7.input_stream
            int r2 = r2.getBeginColumn()
            bsh.JavaCharStream r3 = r7.input_stream
            int r3 = r3.getEndLine()
            bsh.JavaCharStream r4 = r7.input_stream
            int r4 = r4.getEndColumn()
            int r5 = r7.jjmatchedKind
            bsh.Token r5 = bsh.Token.newToken(r5)
            int r6 = r7.jjmatchedKind
            r5.kind = r6
            r5.image = r0
            r5.beginLine = r1
            r5.endLine = r3
            r5.beginColumn = r2
            r5.endColumn = r4
            return r5
    }
}
