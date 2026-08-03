package bsh;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.codec.FieldInfo;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.p221ws.RealWebSocket;
import okhttp3.internal.p221ws.WebSocketProtocol;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ParserTokenManager implements ParserConstants {
    protected int curChar;
    int curLexState;
    int defaultLexState;
    private StringBuilder image;
    protected JavaCharStream input_stream;
    private final StringBuilder jjimage;
    private int jjimageLen;
    int jjmatchedKind;
    int jjmatchedPos;
    int jjnewStateCnt;
    int jjround;
    private final int[] jjrounds;
    private final int[] jjstateSet;
    private int lengthOfMatch;
    static final long[] jjbitVec0 = {0, 0, -1, -1};
    static final long[] jjbitVec1 = {-2, -1, -1, -1};
    static final long[] jjbitVec3 = {2301339413881290750L, -16384, 4294967295L, 432345564227567616L};
    static final long[] jjbitVec4 = {0, 0, 0, -36028797027352577L};
    static final long[] jjbitVec5 = {0, -1, -1, -1};
    static final long[] jjbitVec6 = {-1, -1, WebSocketProtocol.PAYLOAD_SHORT_MAX, 0};
    static final long[] jjbitVec7 = {-1, -1, 0, 0};
    static final long[] jjbitVec8 = {70368744177663L, 0, 0, 0};
    public static final String[] jjstrLiteralImages = {HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, null, null, null, null, null, null, null, "abstract", "boolean", "break", "class", "byte", "case", "catch", "char", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "switch", "synchronized", "transient", "throw", "throws", "true", "try", "void", "volatile", "when", "while", null, null, null, null, null, null, null, null, null, null, null, null, null, null, "(", ")", "{", "}", "[", "]", ";", ",", ".", "=", ">", "@gt", "<", "@lt", "!", "~", "==", "<=", "@lteq", ">=", "@gteq", "!=", "||", "@or", "&&", "@and", "++", "--", "+", "-", "*", "/", "&", "@bitwise_and", "|", "@bitwise_or", "^", "@bitwise_xor", "%", "@mod", "**", "@pow", "<<", "@left_shift", ">>", "@right_shift", ">>>", "@right_unsigned_shift", "+=", "-=", "*=", "/=", "&=", "@and_assign", "|=", "@or_assign", "^=", "@xor_assign", "%=", "@mod_assign", "**=", "@pow_assign", "<<=", "@left_shift_assign", ">>=", "@right_shift_assign", ">>>=", "@right_unsigned_shift_assign", "->", "<=>", "??=", "??", "?:", "?", ":", "::", "...", "?.", "default:"};
    static final int[] jjnextStates = {2, 4, 6, 7, 44, 45, 50, 51, 55, 56, 59, 60, 69, 74, 24, 25, 27, 62, 64, 67, 16, 29, 30, 32, 70, 71, 73, 9, 10, 12, 18, 19, 22, 34, 35, 38, 46, 47, 22, 65, 66, 16, 76, 77, 79, 20, 21, 48, 49, 53, 54, 57, 58};
    public static final String[] lexStateNames = {"DEFAULT"};
    public static final int[] jjnewLexState = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    static final long[] jjtoToken = {9223372036854773761L, -3128, 134217727};
    static final long[] jjtoSkip = {2046, 0, 0};
    static final long[] jjtoSpecial = {1792, 0, 0};
    static final long[] jjtoMore = {0, 0, 0};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParserTokenManager(JavaCharStream javaCharStream, int i9) {
        this.curLexState = 0;
        this.defaultLexState = 0;
        this.jjrounds = new int[80];
        this.jjstateSet = new int[Opcodes.IF_ICMPNE];
        StringBuilder sb2 = new StringBuilder();
        this.jjimage = sb2;
        this.image = sb2;
        ReInit(javaCharStream);
        SwitchTo(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void ReInitRounds() {
        this.jjround = -2147483647;
        int i9 = 80;
        while (true) {
            int i10 = i9 - 1;
            if (i9 <= 0) {
                return;
            }
            this.jjrounds[i10] = Integer.MIN_VALUE;
            i9 = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void jjAddStates(int i9, int i10) {
        while (true) {
            int[] iArr = this.jjstateSet;
            int i11 = this.jjnewStateCnt;
            this.jjnewStateCnt = i11 + 1;
            iArr[i11] = jjnextStates[i9];
            int i12 = i9 + 1;
            if (i9 == i10) {
                return;
            } else {
                i9 = i12;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final boolean jjCanMove_0(int i9, int i10, int i11, long j3, long j4) {
        return i9 == 0 && (jjbitVec0[i11] & j4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final boolean jjCanMove_1(int i9, int i10, int i11, long j3, long j4) {
        return i9 != 0 ? (jjbitVec1[i10] & j3) != 0 : (jjbitVec0[i11] & j4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final boolean jjCanMove_2(int i9, int i10, int i11, long j3, long j4) {
        return i9 != 0 ? i9 != 51 ? i9 != 61 ? i9 != 48 ? i9 != 49 ? (jjbitVec3[i10] & j3) != 0 : (jjbitVec6[i11] & j4) != 0 : (jjbitVec5[i11] & j4) != 0 : (jjbitVec8[i11] & j4) != 0 : (jjbitVec7[i11] & j4) != 0 : (jjbitVec4[i11] & j4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void jjCheckNAdd(int i9) {
        int[] iArr = this.jjrounds;
        int i10 = iArr[i9];
        int i11 = this.jjround;
        if (i10 != i11) {
            int[] iArr2 = this.jjstateSet;
            int i12 = this.jjnewStateCnt;
            this.jjnewStateCnt = i12 + 1;
            iArr2[i12] = i9;
            iArr[i9] = i11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void jjCheckNAddStates(int i9, int i10) {
        while (true) {
            jjCheckNAdd(jjnextStates[i9]);
            int i11 = i9 + 1;
            if (i9 == i10) {
                return;
            } else {
                i9 = i11;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void jjCheckNAddTwoStates(int i9, int i10) {
        jjCheckNAdd(i9);
        jjCheckNAdd(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05db A[PHI: r4
  0x05db: PHI (r4v27 int) = 
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v21 int)
  (r4v13 int)
  (r4v13 int)
  (r4v13 int)
  (r4v22 int)
  (r4v13 int)
  (r4v24 int)
  (r4v28 int)
 binds: [B:419:0x0704, B:416:0x06ee, B:417:0x06f0, B:413:0x06d7, B:414:0x06d9, B:411:0x06c6, B:409:0x06bb, B:410:0x06bd, B:406:0x06a4, B:407:0x06a6, B:404:0x068f, B:403:0x0682, B:401:0x0677, B:402:0x0679, B:398:0x065f, B:399:0x0661, B:395:0x0648, B:396:0x064a, B:389:0x062f, B:392:0x0635, B:386:0x061c, B:387:0x061e, B:380:0x0601, B:384:0x0607, B:374:0x05ea, B:378:0x05f0, B:371:0x05d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int jjMoveNfa_0(int i9, int i10) {
        int i11;
        this.jjnewStateCnt = 80;
        this.jjstateSet[0] = i9;
        int i12 = 1;
        int i13 = 1;
        int i14 = 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = i10;
        while (true) {
            int i17 = this.jjround + i12;
            this.jjround = i17;
            if (i17 == Integer.MAX_VALUE) {
                ReInitRounds();
            }
            int i18 = this.curChar;
            int i19 = 26;
            if (i18 < 64) {
                long j3 = 1 << i18;
                while (true) {
                    int[] iArr = this.jjstateSet;
                    i13--;
                    switch (iArr[i13]) {
                        case 0:
                            if ((j3 & 8589934591L) != 0) {
                                if (i15 > 6) {
                                    i15 = 6;
                                }
                                jjCheckNAdd(0);
                            }
                            break;
                        case 1:
                            if ((j3 & 8589934591L) != 0) {
                                if (i15 > 6) {
                                    i15 = 6;
                                }
                                jjCheckNAdd(0);
                            } else if ((j3 & 287948901175001088L) != 0) {
                                jjCheckNAddStates(4, 11);
                            } else {
                                int i20 = this.curChar;
                                if (i20 == 47) {
                                    jjAddStates(12, 13);
                                } else if (i20 == 36) {
                                    if (i15 > 73) {
                                        i15 = 73;
                                    }
                                    jjCheckNAdd(42);
                                } else if (i20 == 34) {
                                    int i21 = this.jjnewStateCnt;
                                    this.jjnewStateCnt = i21 + 1;
                                    iArr[i21] = 39;
                                } else if (i20 == 39) {
                                    jjCheckNAddStates(14, 16);
                                } else if (i20 == 46) {
                                    jjCheckNAdd(18);
                                } else if (i20 == 35) {
                                    int i22 = this.jjnewStateCnt;
                                    this.jjnewStateCnt = i22 + 1;
                                    iArr[i22] = 8;
                                } else if (i20 == 60) {
                                    jjCheckNAddStates(0, 3);
                                }
                            }
                            if ((j3 & 287667426198290432L) == 0) {
                                int i23 = this.curChar;
                                if (i23 == 48) {
                                    if (i15 > 62) {
                                        i15 = 62;
                                    }
                                    jjCheckNAddStates(17, 20);
                                } else if (i23 == 34) {
                                    jjCheckNAddStates(21, 23);
                                }
                            } else {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddTwoStates(15, 16);
                            }
                            break;
                        case 2:
                            if ((j3 & (-7493990054822421505L)) != 0) {
                                jjCheckNAddStates(0, 3);
                            }
                            break;
                        case 3:
                            if (this.curChar == 32) {
                                jjCheckNAddStates(0, 3);
                            }
                            break;
                        case 4:
                            if (this.curChar == 38) {
                                int i24 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i24 + 1;
                                iArr[i24] = 3;
                            }
                            break;
                        case 5:
                            if (this.curChar == 44) {
                                jjCheckNAddStates(0, 3);
                            }
                            break;
                        case 6:
                            if (this.curChar == 62) {
                                int i25 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i25 + 1;
                                iArr[i25] = 5;
                            }
                            break;
                        case 7:
                            if (this.curChar == 62) {
                                if (i15 > 7) {
                                    i15 = 7;
                                }
                                jjCheckNAdd(7);
                            }
                            break;
                        case 8:
                            if (this.curChar == 33) {
                                jjCheckNAddStates(27, 29);
                            }
                            break;
                        case 9:
                            if ((j3 & (-9217)) != 0) {
                                jjCheckNAddStates(27, 29);
                            }
                            break;
                        case 10:
                            if ((j3 & 9216) != 0 && i15 > 9) {
                                i15 = 9;
                            }
                            break;
                        case 11:
                            if (this.curChar == 10 && i15 > 9) {
                            }
                            break;
                        case 12:
                            if (this.curChar == 13) {
                                int i26 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i26 + 1;
                                iArr[i26] = 11;
                            }
                            break;
                        case 13:
                            if (this.curChar == 35) {
                                int i27 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i27 + 1;
                                iArr[i27] = 8;
                            }
                            break;
                        case 14:
                            if ((j3 & 287667426198290432L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddTwoStates(15, 16);
                            }
                            break;
                        case 15:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddTwoStates(15, 16);
                            }
                            break;
                        case 17:
                            if (this.curChar == 46) {
                                jjCheckNAdd(18);
                            }
                            break;
                        case 18:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                                jjCheckNAddStates(30, 32);
                            }
                            break;
                        case 20:
                            if ((j3 & 43980465111040L) != 0) {
                                jjCheckNAdd(21);
                            }
                            break;
                        case 21:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                                jjCheckNAddTwoStates(21, 22);
                            }
                            break;
                        case 23:
                            if (this.curChar == 39) {
                                jjCheckNAddStates(14, 16);
                            }
                            break;
                        case 24:
                            if ((j3 & (-549755823105L)) != 0) {
                                jjCheckNAddStates(14, 16);
                            }
                            break;
                        case 26:
                            jjCheckNAddStates(14, 16);
                            break;
                        case 27:
                            if (this.curChar == 39 && i15 > 70) {
                                i15 = 70;
                            }
                            break;
                        case 28:
                            if (this.curChar == 34) {
                                jjCheckNAddStates(21, 23);
                            }
                            break;
                        case 29:
                            if ((j3 & (-17179878401L)) != 0) {
                                jjCheckNAddStates(21, 23);
                            }
                            break;
                        case 31:
                            jjCheckNAddStates(21, 23);
                            break;
                        case 32:
                            if (this.curChar == 34 && i15 > 71) {
                                i15 = 71;
                            }
                            break;
                        case 33:
                        case 35:
                            if (this.curChar == 34) {
                                jjCheckNAddTwoStates(34, 38);
                            }
                            break;
                        case 34:
                            if ((j3 & (-17179869185L)) != 0) {
                                jjCheckNAddStates(33, 35);
                            }
                            break;
                        case 36:
                            if (this.curChar == 34 && i15 > 72) {
                                i15 = 72;
                            }
                            break;
                        case 37:
                            if (this.curChar == 34) {
                                int i28 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i28 + 1;
                                iArr[i28] = 36;
                            }
                            break;
                        case 38:
                            if (this.curChar == 34) {
                                int i29 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i29 + 1;
                                iArr[i29] = 37;
                            }
                            break;
                        case 39:
                            if (this.curChar == 34) {
                                int i30 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i30 + 1;
                                iArr[i30] = 33;
                            }
                            break;
                        case 40:
                            if (this.curChar == 34) {
                                int i31 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i31 + 1;
                                iArr[i31] = 39;
                            }
                            break;
                        case 41:
                            if (this.curChar == 36) {
                                if (i15 > 73) {
                                    i15 = 73;
                                }
                                jjCheckNAdd(42);
                            }
                            break;
                        case 42:
                            if ((j3 & 287948969894477824L) != 0) {
                                int i32 = i15 > 73 ? 73 : i15;
                                jjCheckNAdd(42);
                                i15 = i32;
                            }
                            break;
                        case 43:
                            if ((j3 & 287948901175001088L) != 0) {
                                jjCheckNAddStates(4, 11);
                            }
                            break;
                        case 44:
                            if ((j3 & 287948901175001088L) != 0) {
                                jjCheckNAddTwoStates(44, 45);
                            }
                            break;
                        case ParserConstants.PROTECTED /* 45 */:
                            if (this.curChar == 46) {
                                jjCheckNAdd(46);
                            }
                            break;
                        case 46:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                                jjCheckNAddStates(36, 38);
                            }
                            break;
                        case 48:
                            if ((j3 & 43980465111040L) != 0) {
                                jjCheckNAdd(49);
                            }
                            break;
                        case 49:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                                jjCheckNAddTwoStates(49, 22);
                            }
                            break;
                        case 50:
                            if ((j3 & 287948901175001088L) != 0) {
                                jjCheckNAddTwoStates(50, 51);
                            }
                            break;
                        case 51:
                            if (this.curChar == 46) {
                                int i33 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i33 + 1;
                                iArr[i33] = 52;
                            }
                            break;
                        case 53:
                            if ((j3 & 43980465111040L) != 0) {
                                jjCheckNAdd(54);
                            }
                            break;
                        case 54:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                                jjCheckNAddTwoStates(54, 22);
                            }
                            break;
                        case 55:
                            if ((j3 & 287948901175001088L) != 0) {
                                jjCheckNAddTwoStates(55, 56);
                            }
                            break;
                        case 57:
                            if ((j3 & 43980465111040L) != 0) {
                                jjCheckNAdd(58);
                            }
                            break;
                        case 58:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                                jjCheckNAddTwoStates(58, 22);
                            }
                            break;
                        case ParserConstants.VOLATILE /* 59 */:
                            if ((j3 & 287948901175001088L) != 0) {
                                jjCheckNAddTwoStates(59, 60);
                            }
                            break;
                        case ParserConstants.WHILE /* 61 */:
                            if (this.curChar == 48) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddStates(17, 20);
                            }
                            break;
                        case ParserConstants.DECIMAL_LITERAL /* 63 */:
                            if ((j3 & 287948901175001088L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddTwoStates(63, 16);
                            }
                            break;
                        case 65:
                            if ((j3 & 844424930131968L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddStates(39, 41);
                            }
                            break;
                        case 66:
                            if ((j3 & 844424930131968L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAdd(16);
                            }
                            break;
                        case 67:
                            if ((j3 & 71776119061217280L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddTwoStates(67, 16);
                            }
                            break;
                        case 68:
                            if (this.curChar == 47) {
                                jjAddStates(12, 13);
                            }
                            break;
                        case 69:
                            int i34 = this.curChar;
                            if (i34 == 42) {
                                jjCheckNAddTwoStates(75, 76);
                            } else if (i34 == 47) {
                                if (i15 > 8) {
                                    i15 = 8;
                                }
                                jjCheckNAddStates(24, i19);
                            }
                            break;
                        case 70:
                            if ((j3 & (-9217)) != 0) {
                                if (i15 > 8) {
                                    i15 = 8;
                                }
                                jjCheckNAddStates(24, i19);
                            }
                            break;
                        case 71:
                            if ((j3 & 9216) != 0 && i15 > 8) {
                                i15 = 8;
                            }
                            break;
                        case 72:
                            if (this.curChar == 10 && i15 > 8) {
                            }
                            break;
                        case 73:
                            if (this.curChar == 13) {
                                int i35 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i35 + 1;
                                iArr[i35] = 72;
                            }
                            break;
                        case 74:
                            if (this.curChar == 42) {
                                jjCheckNAddTwoStates(75, 76);
                            }
                            break;
                        case 75:
                            if ((j3 & (-4398046511105L)) != 0) {
                                jjCheckNAddTwoStates(75, 76);
                            }
                            break;
                        case ParserConstants.LPAREN /* 76 */:
                            if (this.curChar == 42) {
                                jjCheckNAddStates(42, 44);
                            }
                            break;
                        case ParserConstants.RPAREN /* 77 */:
                            if ((j3 & (-145135534866433L)) != 0) {
                                jjCheckNAddTwoStates(78, 76);
                            }
                            break;
                        case ParserConstants.LBRACE /* 78 */:
                            if ((j3 & (-4398046511105L)) != 0) {
                                jjCheckNAddTwoStates(78, 76);
                            }
                            break;
                        case 79:
                            if (this.curChar == 47 && i15 > 10) {
                                i15 = 10;
                            }
                            break;
                        case 80:
                            if ((j3 & (-7493990054822421505L)) != 0) {
                                jjCheckNAddStates(0, 3);
                            } else {
                                int i36 = this.curChar;
                                if (i36 == 62) {
                                    if (i15 > 7) {
                                        i15 = 7;
                                    }
                                    jjCheckNAdd(7);
                                } else if (i36 == 38) {
                                    int i37 = this.jjnewStateCnt;
                                    this.jjnewStateCnt = i37 + 1;
                                    iArr[i37] = 3;
                                }
                            }
                            if (this.curChar == 62) {
                                int[] iArr2 = this.jjstateSet;
                                int i38 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i38 + 1;
                                iArr2[i38] = 5;
                            }
                            break;
                    }
                    if (i13 != i14) {
                        i19 = 26;
                    }
                }
            } else if (i18 < 128) {
                long j4 = 1 << (i18 & 63);
                do {
                    int[] iArr3 = this.jjstateSet;
                    i13--;
                    switch (iArr3[i13]) {
                        case 1:
                        case 42:
                            if ((j4 & 576460745995190270L) != 0) {
                                if (i15 > 73) {
                                    i15 = 73;
                                }
                                jjCheckNAdd(42);
                            }
                            break;
                        case 2:
                        case 80:
                            if ((j4 & (-1152921504606846977L)) != 0) {
                                jjCheckNAddStates(0, 3);
                            }
                            break;
                        case 9:
                            jjAddStates(27, 29);
                            break;
                        case 15:
                            if (this.curChar == 95) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddTwoStates(15, 16);
                            }
                            break;
                        case 16:
                            if ((j4 & 38441125539254784L) != 0 && i15 > 62) {
                                i15 = 62;
                            }
                            break;
                        case 19:
                            if ((j4 & 137438953504L) != 0) {
                                jjAddStates(45, 46);
                            }
                            break;
                        case 22:
                            if ((j4 & 36029140624736336L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                            }
                            break;
                        case 24:
                            if ((j4 & (-268435457)) != 0) {
                                jjCheckNAddStates(14, 16);
                            }
                            break;
                        case 25:
                            if (this.curChar == 92) {
                                int i39 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i39 + 1;
                                iArr3[i39] = 26;
                            }
                            break;
                        case 26:
                            jjCheckNAddStates(14, 16);
                            break;
                        case 29:
                            if ((j4 & (-268435457)) != 0) {
                                jjCheckNAddStates(21, 23);
                            }
                            break;
                        case 30:
                            if (this.curChar == 92) {
                                int i40 = this.jjnewStateCnt;
                                this.jjnewStateCnt = i40 + 1;
                                iArr3[i40] = 31;
                            }
                            break;
                        case 31:
                            jjCheckNAddStates(21, 23);
                            break;
                        case 34:
                            jjAddStates(33, 35);
                            break;
                        case 47:
                            if ((j4 & 137438953504L) != 0) {
                                jjAddStates(47, 48);
                            }
                            break;
                        case 52:
                            if ((j4 & 137438953504L) != 0) {
                                jjAddStates(49, 50);
                            }
                            break;
                        case 56:
                            if ((j4 & 137438953504L) != 0) {
                                jjAddStates(51, 52);
                            }
                            break;
                        case ParserConstants.WHEN /* 60 */:
                            if ((j4 & 343597383760L) != 0) {
                                if (i15 > 67) {
                                    i15 = 67;
                                }
                                break;
                            }
                            break;
                        case ParserConstants.INTEGER_LITERAL /* 62 */:
                            if ((j4 & 72057594054705152L) != 0) {
                                jjCheckNAdd(63);
                            }
                            break;
                        case ParserConstants.DECIMAL_LITERAL /* 63 */:
                            if ((j4 & 543313363070L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddTwoStates(63, 16);
                            }
                            break;
                        case 64:
                            if ((j4 & 17179869188L) != 0) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddStates(39, 41);
                            }
                            break;
                        case 65:
                            if (this.curChar == 95) {
                                if (i15 > 62) {
                                    i15 = 62;
                                }
                                jjCheckNAddStates(39, 41);
                            }
                            break;
                        case 70:
                            if (i15 > 8) {
                                i15 = 8;
                            }
                            jjAddStates(24, 26);
                            break;
                        case 75:
                            jjCheckNAddTwoStates(75, 76);
                            break;
                        case ParserConstants.RPAREN /* 77 */:
                        case ParserConstants.LBRACE /* 78 */:
                            jjCheckNAddTwoStates(78, 76);
                            break;
                    }
                } while (i13 != i14);
            } else {
                int i41 = i18 >> 8;
                int i42 = i18 >> 14;
                long j5 = 1 << (i41 & 63);
                int i43 = (i18 & 255) >> 6;
                long j10 = 1 << (i18 & 63);
                do {
                    i13--;
                    int i44 = this.jjstateSet[i13];
                    if (i44 != 0) {
                        if (i44 != 1) {
                            if (i44 != 2) {
                                if (i44 != 9) {
                                    if (i44 == 24 || i44 == 26) {
                                        if (jjCanMove_1(i41, i42, i43, j5, j10)) {
                                            jjCheckNAddStates(14, 16);
                                        }
                                    } else if (i44 == 29 || i44 == 31) {
                                        if (jjCanMove_1(i41, i42, i43, j5, j10)) {
                                            jjCheckNAddStates(21, 23);
                                        }
                                    } else if (i44 != 34) {
                                        if (i44 != 70) {
                                            if (i44 != 75) {
                                                if (i44 != 80) {
                                                    if (i44 == 41 || i44 == 42) {
                                                        if (jjCanMove_2(i41, i42, i43, j5, j10)) {
                                                            int i45 = i15 > 73 ? 73 : i15;
                                                            jjCheckNAdd(42);
                                                            i15 = i45;
                                                        }
                                                    } else if ((i44 == 77 || i44 == 78) && jjCanMove_1(i41, i42, i43, j5, j10)) {
                                                        jjCheckNAddTwoStates(78, 76);
                                                    }
                                                }
                                            } else if (jjCanMove_1(i41, i42, i43, j5, j10)) {
                                                jjCheckNAddTwoStates(75, 76);
                                            }
                                        } else if (jjCanMove_1(i41, i42, i43, j5, j10)) {
                                            if (i15 > 8) {
                                                i15 = 8;
                                            }
                                            jjAddStates(24, 26);
                                        }
                                    } else if (jjCanMove_1(i41, i42, i43, j5, j10)) {
                                        jjAddStates(33, 35);
                                    }
                                } else if (jjCanMove_1(i41, i42, i43, j5, j10)) {
                                    jjAddStates(27, 29);
                                }
                            }
                            if (jjCanMove_1(i41, i42, i43, j5, j10)) {
                                jjCheckNAddStates(0, 3);
                            }
                        } else {
                            if (jjCanMove_0(i41, i42, i43, j5, j10)) {
                                int i46 = i15 > 6 ? 6 : i15;
                                jjCheckNAdd(0);
                                i11 = i46;
                            } else {
                                i11 = i15;
                            }
                            if (jjCanMove_2(i41, i42, i43, j5, j10)) {
                                if (i11 > 73) {
                                    i11 = 73;
                                }
                                jjCheckNAdd(42);
                            }
                            i15 = i11;
                        }
                    } else if (jjCanMove_0(i41, i42, i43, j5, j10)) {
                        if (i15 > 6) {
                            i15 = 6;
                        }
                        jjCheckNAdd(0);
                    }
                } while (i13 != i14);
            }
            if (i15 != Integer.MAX_VALUE) {
                this.jjmatchedKind = i15;
                this.jjmatchedPos = i16;
                i15 = Integer.MAX_VALUE;
            }
            i16++;
            i13 = this.jjnewStateCnt;
            this.jjnewStateCnt = i14;
            i14 = 80 - i14;
            if (i13 != i14) {
                try {
                    this.curChar = this.input_stream.readChar();
                    i12 = 1;
                } catch (IOException unused) {
                }
            }
            return i16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa0_0() {
        int i9 = this.curChar;
        if (i9 == 9) {
            return jjStartNfaWithStates_0(0, 2, 0);
        }
        if (i9 == 10) {
            return jjStartNfaWithStates_0(0, 5, 0);
        }
        if (i9 == 12) {
            return jjStartNfaWithStates_0(0, 4, 0);
        }
        if (i9 == 13) {
            return jjStartNfaWithStates_0(0, 3, 0);
        }
        if (i9 == 32) {
            return jjStartNfaWithStates_0(0, 1, 0);
        }
        if (i9 == 33) {
            this.jjmatchedKind = 90;
            return jjMoveStringLiteralDfa1_0(0L, 8589934592L, 0L);
        }
        if (i9 == 37) {
            this.jjmatchedKind = 114;
            return jjMoveStringLiteralDfa1_0(0L, 0L, 64L);
        }
        if (i9 == 38) {
            this.jjmatchedKind = 108;
            return jjMoveStringLiteralDfa1_0(0L, 68719476736L, 1L);
        }
        if (i9 == 93) {
            return jjStopAtPos(0, 81);
        }
        if (i9 == 94) {
            this.jjmatchedKind = 112;
            return jjMoveStringLiteralDfa1_0(0L, 0L, 16L);
        }
        if (i9 == 118) {
            return jjMoveStringLiteralDfa1_0(864691128455135232L, 0L, 0L);
        }
        if (i9 == 119) {
            return jjMoveStringLiteralDfa1_0(3458764513820540928L, 0L, 0L);
        }
        switch (i9) {
            case 40:
                return jjStopAtPos(0, 76);
            case 41:
                return jjStopAtPos(0, 77);
            case 42:
                this.jjmatchedKind = 106;
                return jjMoveStringLiteralDfa1_0(0L, 4616189618054758400L, 256L);
            case 43:
                this.jjmatchedKind = 104;
                return jjMoveStringLiteralDfa1_0(0L, 1152921779484753920L, 0L);
            case 44:
                return jjStopAtPos(0, 83);
            case ParserConstants.PROTECTED /* 45 */:
                this.jjmatchedKind = 105;
                return jjMoveStringLiteralDfa1_0(0L, 2305843558969507840L, 65536L);
            case 46:
                this.jjmatchedKind = 84;
                return jjMoveStringLiteralDfa1_0(0L, 0L, 16777216L);
            case 47:
                this.jjmatchedKind = 107;
                return jjMoveStringLiteralDfa1_0(0L, Long.MIN_VALUE, 0L);
            case 91:
                return jjStopAtPos(0, 80);
            case 105:
                return jjMoveStringLiteralDfa1_0(541165879296L, 0L, 0L);
            case 108:
                return jjMoveStringLiteralDfa1_0(549755813888L, 0L, 0L);
            case 110:
                return jjMoveStringLiteralDfa1_0(7696581394432L, 0L, 0L);
            case 112:
                return jjMoveStringLiteralDfa1_0(131941395333120L, 0L, 0L);
            case 123:
                return jjStopAtPos(0, 78);
            case 124:
                this.jjmatchedKind = 110;
                return jjMoveStringLiteralDfa1_0(0L, 17179869184L, 4L);
            case 125:
                return jjStopAtPos(0, 79);
            case 126:
                return jjStopAtPos(0, 91);
            default:
                switch (i9) {
                    case 58:
                        this.jjmatchedKind = 150;
                        return jjMoveStringLiteralDfa1_0(0L, 0L, 8388608L);
                    case ParserConstants.VOLATILE /* 59 */:
                        return jjStopAtPos(0, 82);
                    case ParserConstants.WHEN /* 60 */:
                        this.jjmatchedKind = 88;
                        return jjMoveStringLiteralDfa1_0(0L, 18014399046352896L, 132096L);
                    case ParserConstants.WHILE /* 61 */:
                        this.jjmatchedKind = 85;
                        return jjMoveStringLiteralDfa1_0(0L, 268435456L, 0L);
                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                        this.jjmatchedKind = 86;
                        return jjMoveStringLiteralDfa1_0(0L, 360287972337123328L, 20480L);
                    case ParserConstants.DECIMAL_LITERAL /* 63 */:
                        this.jjmatchedKind = 149;
                        return jjMoveStringLiteralDfa1_0(0L, 0L, 35389440L);
                    case 64:
                        return jjMoveStringLiteralDfa1_0(0L, 768602785489879040L, 43690L);
                    default:
                        switch (i9) {
                            case 97:
                                return jjMoveStringLiteralDfa1_0(2048L, 0L, 0L);
                            case 98:
                                return jjMoveStringLiteralDfa1_0(45056L, 0L, 0L);
                            case 99:
                                return jjMoveStringLiteralDfa1_0(2048000L, 0L, 0L);
                            case 100:
                                return jjMoveStringLiteralDfa1_0(14680064L, 0L, 67108864L);
                            case 101:
                                return jjMoveStringLiteralDfa1_0(117440512L, 0L, 0L);
                            case 102:
                                return jjMoveStringLiteralDfa1_0(4160749568L, 0L, 0L);
                            case 103:
                                return jjMoveStringLiteralDfa1_0(4294967296L, 0L, 0L);
                            default:
                                switch (i9) {
                                    case 114:
                                        return jjMoveStringLiteralDfa1_0(140737488355328L, 0L, 0L);
                                    case 115:
                                        return jjMoveStringLiteralDfa1_0(8725724278030336L, 0L, 0L);
                                    case 116:
                                        return jjMoveStringLiteralDfa1_0(279223176896970752L, 0L, 0L);
                                    default:
                                        return jjMoveNfa_0(1, 0);
                                }
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa10_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(8, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 == 'e') {
                return jjMoveStringLiteralDfa11_0(j13, FieldInfo.FIELD_MASK, j14, 0L, j15, 0L);
            }
            if (c10 == 'f') {
                return jjMoveStringLiteralDfa11_0(j13, 0L, j14, FieldInfo.DISABLE_SMART_MATCH, j15, 8192L);
            }
            if (c10 == 'i') {
                return jjMoveStringLiteralDfa11_0(j13, 0L, j14, 576460752303423488L, j15, 32768L);
            }
            if (c10 != 'r') {
                if (c10 == 't') {
                    if ((FieldInfo.DISABLE_UNSAFE & j14) != 0) {
                        this.jjmatchedKind = 119;
                        this.jjmatchedPos = 10;
                    }
                    return jjMoveStringLiteralDfa11_0(j13, 0L, j14, 0L, j15, 2048L);
                }
                if (c10 == 'n') {
                    return (2 & j15) != 0 ? jjStopAtPos(10, 129) : (32 & j15) != 0 ? jjStopAtPos(10, 133) : (128 & j15) != 0 ? jjStopAtPos(10, 135) : (512 & j15) != 0 ? jjStopAtPos(10, 137) : jjMoveStringLiteralDfa11_0(j13, 0L, j14, 35184372088832L, j15, 0L);
                }
                if (c10 == 'o') {
                    return jjMoveStringLiteralDfa11_0(j13, 0L, j14, FieldInfo.UNWRAPPED_MASK, j15, 0L);
                }
            } else if ((140737488355328L & j14) != 0) {
                return jjStopAtPos(10, 111);
            }
            return jjStartNfa_0(9, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(9, j13, j14, j15);
            return 10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa11_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(9, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 == '_') {
                return jjMoveStringLiteralDfa12_0(j13, 0L, j14, 0L, j15, 2048L);
            }
            if (c10 != 'd') {
                if (c10 == 'g') {
                    return jjMoveStringLiteralDfa12_0(j13, 0L, j14, 576460752303423488L, j15, 32768L);
                }
                if (c10 != 'r') {
                    if (c10 == 't') {
                        if ((FieldInfo.DISABLE_SMART_MATCH & j14) != 0) {
                            this.jjmatchedKind = 121;
                            this.jjmatchedPos = 11;
                        }
                        return jjMoveStringLiteralDfa12_0(j13, 0L, j14, 0L, j15, 8192L);
                    }
                } else if ((FieldInfo.UNWRAPPED_MASK & j14) != 0) {
                    return jjStopAtPos(11, 113);
                }
            } else {
                if ((FieldInfo.FIELD_MASK & j13) != 0) {
                    return jjStartNfaWithStates_0(11, 52, 42);
                }
                if ((35184372088832L & j14) != 0) {
                    return jjStopAtPos(11, 109);
                }
            }
            return jjStartNfa_0(10, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(10, j13, j14, j15);
            return 11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa12_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j10 & j5;
        long j14 = j12 & j11;
        if (((j4 & j3) | j13 | j14) == 0) {
            return jjStartNfa_0(10, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != '_' ? c10 != 'a' ? c10 != 'n' ? jjStartNfa_0(11, 0L, j13, j14) : jjMoveStringLiteralDfa13_0(j13, 576460752303423488L, j14, 32768L) : jjMoveStringLiteralDfa13_0(j13, 0L, j14, 2048L) : jjMoveStringLiteralDfa13_0(j13, 0L, j14, 8192L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(11, 0L, j13, j14);
            return 12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa13_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(11, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'a' ? c10 != 'e' ? c10 != 's' ? jjStartNfa_0(12, 0L, j11, j12) : jjMoveStringLiteralDfa14_0(j11, 0L, j12, 2048L) : jjMoveStringLiteralDfa14_0(j11, 576460752303423488L, j12, 32768L) : jjMoveStringLiteralDfa14_0(j11, 0L, j12, 8192L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(12, 0L, j11, j12);
            return 13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa14_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(12, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'd' ? c10 != 's' ? jjStartNfa_0(13, 0L, j11, j12) : jjMoveStringLiteralDfa15_0(j11, 0L, j12, 10240L) : jjMoveStringLiteralDfa15_0(j11, 576460752303423488L, j12, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(13, 0L, j11, j12);
            return 14;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa15_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(13, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != '_' ? c10 != 'i' ? c10 != 's' ? jjStartNfa_0(14, 0L, j11, j12) : jjMoveStringLiteralDfa16_0(j11, 0L, j12, 8192L) : jjMoveStringLiteralDfa16_0(j11, 0L, j12, 2048L) : jjMoveStringLiteralDfa16_0(j11, 576460752303423488L, j12, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(14, 0L, j11, j12);
            return 15;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa16_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(14, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'g' ? c10 != 'i' ? c10 != 's' ? jjStartNfa_0(15, 0L, j11, j12) : jjMoveStringLiteralDfa17_0(j11, 576460752303423488L, j12, 32768L) : jjMoveStringLiteralDfa17_0(j11, 0L, j12, 8192L) : jjMoveStringLiteralDfa17_0(j11, 0L, j12, 2048L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(15, 0L, j11, j12);
            return 16;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa17_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(15, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'g' ? c10 != 'h' ? (c10 == 'n' && (2048 & j12) != 0) ? jjStopAtPos(17, 139) : jjStartNfa_0(16, 0L, j11, j12) : jjMoveStringLiteralDfa18_0(j11, 576460752303423488L, j12, 32768L) : jjMoveStringLiteralDfa18_0(j11, 0L, j12, 8192L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(16, 0L, j11, j12);
            return 17;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa18_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(16, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'i' ? (c10 == 'n' && (8192 & j12) != 0) ? jjStopAtPos(18, 141) : jjStartNfa_0(17, 0L, j11, j12) : jjMoveStringLiteralDfa19_0(j11, 576460752303423488L, j12, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(17, 0L, j11, j12);
            return 18;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa19_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(17, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'f' ? jjStartNfa_0(18, 0L, j11, j12) : jjMoveStringLiteralDfa20_0(j11, 576460752303423488L, j12, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(18, 0L, j11, j12);
            return 19;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa1_0(long j3, long j4, long j5) {
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 != '&') {
                if (c10 != ':') {
                    if (c10 == 'r') {
                        return jjMoveStringLiteralDfa2_0(j3, 225232757926666240L, j4, 720575940379279360L, j5, 40960L);
                    }
                    if (c10 != '|') {
                        if (c10 == '*') {
                            if ((j4 & FieldInfo.FIELD_MASK) != 0) {
                                this.jjmatchedKind = 116;
                                this.jjmatchedPos = 1;
                            }
                            return jjMoveStringLiteralDfa2_0(j3, 0L, j4, 0L, j5, 256L);
                        }
                        if (c10 != '+') {
                            if (c10 != '-') {
                                if (c10 == '.') {
                                    return (j5 & 33554432) != 0 ? jjStopAtPos(1, Opcodes.IFEQ) : jjMoveStringLiteralDfa2_0(j3, 0L, j4, 0L, j5, 16777216L);
                                }
                                if (c10 == 'a') {
                                    return jjMoveStringLiteralDfa2_0(j3, 9895739064320L, j4, 137438953472L, j5, 2L);
                                }
                                if (c10 == 'b') {
                                    return jjMoveStringLiteralDfa2_0(j3, 2048L, j4, 738871813865472L, j5, 0L);
                                }
                                if (c10 == 't') {
                                    return jjMoveStringLiteralDfa2_0(j3, 1688849860263936L, j4, 0L, j5, 0L);
                                }
                                if (c10 == 'u') {
                                    return jjMoveStringLiteralDfa2_0(j3, 74766790688768L, j4, 0L, j5, 0L);
                                }
                                switch (c10) {
                                    case ParserConstants.WHEN /* 60 */:
                                        if ((j4 & 18014398509481984L) != 0) {
                                            this.jjmatchedKind = 118;
                                            this.jjmatchedPos = 1;
                                        }
                                        return jjMoveStringLiteralDfa2_0(j3, 0L, j4, 0L, j5, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                                    case ParserConstants.WHILE /* 61 */:
                                        if ((j4 & 268435456) != 0) {
                                            return jjStopAtPos(1, 92);
                                        }
                                        if ((j4 & 536870912) != 0) {
                                            this.jjmatchedKind = 93;
                                            this.jjmatchedPos = 1;
                                        } else {
                                            if ((j4 & 2147483648L) != 0) {
                                                return jjStopAtPos(1, 95);
                                            }
                                            if ((j4 & 8589934592L) != 0) {
                                                return jjStopAtPos(1, 97);
                                            }
                                            if ((j4 & 1152921504606846976L) != 0) {
                                                return jjStopAtPos(1, 124);
                                            }
                                            if ((j4 & FieldInfo.BACKR_EFERENCE) != 0) {
                                                return jjStopAtPos(1, 125);
                                            }
                                            if ((j4 & FieldInfo.RECORD) != 0) {
                                                return jjStopAtPos(1, 126);
                                            }
                                            if ((j4 & Long.MIN_VALUE) != 0) {
                                                return jjStopAtPos(1, 127);
                                            }
                                            if ((j5 & 1) != 0) {
                                                return jjStopAtPos(1, 128);
                                            }
                                            if ((j5 & 4) != 0) {
                                                return jjStopAtPos(1, 130);
                                            }
                                            if ((j5 & 16) != 0) {
                                                return jjStopAtPos(1, 132);
                                            }
                                            if ((j5 & 64) != 0) {
                                                return jjStopAtPos(1, 134);
                                            }
                                        }
                                        return jjMoveStringLiteralDfa2_0(j3, 0L, j4, 0L, j5, 131072L);
                                    case ParserConstants.INTEGER_LITERAL /* 62 */:
                                        if ((j4 & FieldInfo.READ_ONLY) != 0) {
                                            this.jjmatchedKind = 120;
                                            this.jjmatchedPos = 1;
                                        } else if ((j5 & 65536) != 0) {
                                            return jjStopAtPos(1, 144);
                                        }
                                        return jjMoveStringLiteralDfa2_0(j3, 0L, j4, FieldInfo.DISABLE_REFERENCE_DETECT, j5, 20480L);
                                    case ParserConstants.DECIMAL_LITERAL /* 63 */:
                                        if ((j5 & 524288) != 0) {
                                            this.jjmatchedKind = 147;
                                            this.jjmatchedPos = 1;
                                        }
                                        return jjMoveStringLiteralDfa2_0(j3, 0L, j4, 0L, j5, 262144L);
                                    default:
                                        switch (c10) {
                                            case 'e':
                                                return jjMoveStringLiteralDfa2_0(j3, 142936513708032L, j4, 0L, j5, 67108864L);
                                            case 'f':
                                                if ((j3 & 8589934592L) != 0) {
                                                    return jjStartNfaWithStates_0(1, 33, 42);
                                                }
                                                break;
                                            case 'g':
                                                return jjMoveStringLiteralDfa2_0(j3, 0L, j4, 4303355904L, j5, 0L);
                                            case 'h':
                                                return jjMoveStringLiteralDfa2_0(j3, 3513089184325959680L, j4, 0L, j5, 0L);
                                            case 'i':
                                                return jjMoveStringLiteralDfa2_0(j3, 805306368L, j4, 0L, j5, 0L);
                                            default:
                                                switch (c10) {
                                                    case 'l':
                                                        return jjMoveStringLiteralDfa2_0(j3, 1090535424L, j4, 36028798126260224L, j5, 2048L);
                                                    case 'm':
                                                        return jjMoveStringLiteralDfa2_0(j3, 51539607552L, j4, FieldInfo.READ_USING_MASK, j5, 128L);
                                                    case 'n':
                                                        return jjMoveStringLiteralDfa2_0(j3, 481069891584L, j4, 0L, j5, 0L);
                                                    case 'o':
                                                        if ((4194304 & j3) != 0) {
                                                            this.jjmatchedKind = 22;
                                                            this.jjmatchedPos = 1;
                                                        }
                                                        return jjMoveStringLiteralDfa2_0(j3, 864691684663365632L, j4, 34359738368L, j5, 8L);
                                                    case 'p':
                                                        return jjMoveStringLiteralDfa2_0(j3, 0L, j4, 9007199254740992L, j5, 512L);
                                                    default:
                                                        switch (c10) {
                                                            case 'w':
                                                                return jjMoveStringLiteralDfa2_0(j3, FieldInfo.READ_USING_MASK, j4, 0L, j5, 0L);
                                                            case 'x':
                                                                return jjMoveStringLiteralDfa2_0(j3, 67108864L, j4, 0L, j5, 32L);
                                                            case 'y':
                                                                return jjMoveStringLiteralDfa2_0(j3, 4503599627403264L, j4, 0L, j5, 0L);
                                                        }
                                                }
                                        }
                                        break;
                                }
                            } else if ((j4 & 549755813888L) != 0) {
                                return jjStopAtPos(1, 103);
                            }
                        } else if ((j4 & 274877906944L) != 0) {
                            return jjStopAtPos(1, 102);
                        }
                    } else if ((j4 & 17179869184L) != 0) {
                        return jjStopAtPos(1, 98);
                    }
                } else {
                    if ((j5 & 1048576) != 0) {
                        return jjStopAtPos(1, 148);
                    }
                    if ((j5 & 8388608) != 0) {
                        return jjStopAtPos(1, 151);
                    }
                }
            } else if ((j4 & 68719476736L) != 0) {
                return jjStopAtPos(1, 100);
            }
            return jjStartNfa_0(0, j3, j4, j5);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(0, j3, j4, j5);
            return 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa20_0(long j3, long j4, long j5, long j10) {
        long j11 = j4 & j3;
        long j12 = j10 & j5;
        if ((j11 | j12) == 0) {
            return jjStartNfa_0(18, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 != 't') {
                return jjStartNfa_0(19, 0L, j11, j12);
            }
            if ((576460752303423488L & j11) != 0) {
                this.jjmatchedKind = 123;
                this.jjmatchedPos = 20;
            }
            return jjMoveStringLiteralDfa21_0(j11, 0L, j12, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(19, 0L, j11, j12);
            return 20;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa21_0(long j3, long j4, long j5, long j10) {
        long j11 = j10 & j5;
        if (((j4 & j3) | j11) == 0) {
            return jjStartNfa_0(19, 0L, j3, j5);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != '_' ? jjStartNfa_0(20, 0L, 0L, j11) : jjMoveStringLiteralDfa22_0(j11, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(20, 0L, 0L, j11);
            return 21;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa22_0(long j3, long j4) {
        long j5 = j4 & j3;
        if (j5 == 0) {
            return jjStartNfa_0(20, 0L, 0L, j3);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'a' ? jjStartNfa_0(21, 0L, 0L, j5) : jjMoveStringLiteralDfa23_0(j5, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(21, 0L, 0L, j5);
            return 22;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa23_0(long j3, long j4) {
        long j5 = j4 & j3;
        if (j5 == 0) {
            return jjStartNfa_0(21, 0L, 0L, j3);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 's' ? jjStartNfa_0(22, 0L, 0L, j5) : jjMoveStringLiteralDfa24_0(j5, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(22, 0L, 0L, j5);
            return 23;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa24_0(long j3, long j4) {
        long j5 = j4 & j3;
        if (j5 == 0) {
            return jjStartNfa_0(22, 0L, 0L, j3);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 's' ? jjStartNfa_0(23, 0L, 0L, j5) : jjMoveStringLiteralDfa25_0(j5, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(23, 0L, 0L, j5);
            return 24;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa25_0(long j3, long j4) {
        long j5 = j4 & j3;
        if (j5 == 0) {
            return jjStartNfa_0(23, 0L, 0L, j3);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'i' ? jjStartNfa_0(24, 0L, 0L, j5) : jjMoveStringLiteralDfa26_0(j5, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(24, 0L, 0L, j5);
            return 25;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa26_0(long j3, long j4) {
        long j5 = j4 & j3;
        if (j5 == 0) {
            return jjStartNfa_0(24, 0L, 0L, j3);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return c10 != 'g' ? jjStartNfa_0(25, 0L, 0L, j5) : jjMoveStringLiteralDfa27_0(j5, 32768L);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(25, 0L, 0L, j5);
            return 26;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa27_0(long j3, long j4) {
        long j5 = j4 & j3;
        if (j5 == 0) {
            return jjStartNfa_0(25, 0L, 0L, j3);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            return (c10 == 'n' && (32768 & j5) != 0) ? jjStopAtPos(27, 143) : jjStartNfa_0(26, 0L, 0L, j5);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(26, 0L, 0L, j5);
            return 27;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa2_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(0, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 != '.') {
                if (c10 == 'i') {
                    return jjMoveStringLiteralDfa3_0(j13, 2596342777365135360L, j14, 721314812193144832L, j15, 40960L);
                }
                if (c10 == 'l') {
                    return jjMoveStringLiteralDfa3_0(j13, 576465150484152320L, j14, 0L, j15, 0L);
                }
                if (c10 != 'w') {
                    if (c10 != 'y') {
                        if (c10 != '=') {
                            if (c10 == '>') {
                                if ((FieldInfo.DISABLE_REFERENCE_DETECT & j14) != 0) {
                                    this.jjmatchedKind = 122;
                                    this.jjmatchedPos = 2;
                                } else if ((131072 & j15) != 0) {
                                    return jjStopAtPos(2, 145);
                                }
                                return jjMoveStringLiteralDfa3_0(j13, 0L, j14, 0L, j15, Http2Stream.EMIT_BUFFER_SIZE);
                            }
                            if (c10 == 'e') {
                                return jjMoveStringLiteralDfa3_0(j13, 1152921504606855168L, j14, FieldInfo.DISABLE_UNSAFE, j15, 2048L);
                            }
                            if (c10 == 'f') {
                                return jjMoveStringLiteralDfa3_0(j13, 2097152L, j14, 0L, j15, 67108864L);
                            }
                            switch (c10) {
                                case 'a':
                                    return jjMoveStringLiteralDfa3_0(j13, 9570149208440832L, j14, 0L, j15, 0L);
                                case 'b':
                                    return jjMoveStringLiteralDfa3_0(j13, 70368744177664L, j14, 0L, j15, 0L);
                                case 'c':
                                    return jjMoveStringLiteralDfa3_0(j13, 8796093022208L, j14, 0L, j15, 0L);
                                default:
                                    switch (c10) {
                                        case 'n':
                                            return jjMoveStringLiteralDfa3_0(j13, 4504150190063616L, j14, 137438953472L, j15, 2L);
                                        case 'o':
                                            return jjMoveStringLiteralDfa3_0(j13, 316660422545408L, j14, 11258999068426240L, j15, 672L);
                                        case 'p':
                                            return jjMoveStringLiteralDfa3_0(j13, 51539607552L, j14, 0L, j15, 0L);
                                        default:
                                            switch (c10) {
                                                case 'r':
                                                    if ((2147483648L & j13) != 0) {
                                                        return jjStartNfaWithStates_0(2, 31, 42);
                                                    }
                                                    if ((34359738368L & j14) != 0) {
                                                        this.jjmatchedKind = 99;
                                                        this.jjmatchedPos = 2;
                                                    }
                                                    return jjMoveStringLiteralDfa3_0(j13, 55169095435288576L, j14, 0L, j15, 8L);
                                                case 's':
                                                    return jjMoveStringLiteralDfa3_0(j13, 68736321536L, j14, 0L, j15, 0L);
                                                case 't':
                                                    if ((137438953472L & j13) != 0) {
                                                        this.jjmatchedKind = 37;
                                                        this.jjmatchedPos = 2;
                                                    } else if ((8388608 & j14) != 0) {
                                                        this.jjmatchedKind = 87;
                                                        this.jjmatchedPos = 2;
                                                    } else if ((33554432 & j14) != 0) {
                                                        this.jjmatchedKind = 89;
                                                        this.jjmatchedPos = 2;
                                                    }
                                                    return jjMoveStringLiteralDfa3_0(j13, 142116240130048L, j14, 5368709120L, j15, 0L);
                                                case 'u':
                                                    return jjMoveStringLiteralDfa3_0(j13, 72057594079870976L, j14, 0L, j15, 0L);
                                            }
                                    }
                            }
                        }
                        if ((256 & j15) != 0) {
                            return jjStopAtPos(2, 136);
                        }
                        if ((RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE & j15) != 0) {
                            return jjStopAtPos(2, 138);
                        }
                        if ((4096 & j15) != 0) {
                            return jjStopAtPos(2, 140);
                        }
                        if ((262144 & j15) != 0) {
                            return jjStopAtPos(2, 146);
                        }
                    } else if ((FieldInfo.DISABLE_SMART_MATCH & j13) != 0) {
                        return jjStartNfaWithStates_0(2, 57, 42);
                    }
                } else if ((2199023255552L & j13) != 0) {
                    return jjStartNfaWithStates_0(2, 41, 42);
                }
            } else if ((16777216 & j15) != 0) {
                return jjStopAtPos(2, 152);
            }
            return jjStartNfa_0(1, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(1, j13, j14, j15);
            return 2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa3_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(1, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 != '=') {
                if (c10 == '_') {
                    return jjMoveStringLiteralDfa4_0(j13, 0L, j14, 0L, j15, 8L);
                }
                if (c10 == 'i') {
                    return jjMoveStringLiteralDfa4_0(j13, 1126999418470400L, j14, 0L, j15, 0L);
                }
                switch (c10) {
                    case 'a':
                        return jjMoveStringLiteralDfa4_0(j13, 576460754184577024L, j14, 0L, j15, 67108864L);
                    case 'b':
                        return jjMoveStringLiteralDfa4_0(j13, 8388608L, j14, 0L, j15, 0L);
                    case 'c':
                        return jjMoveStringLiteralDfa4_0(j13, 4503599627501568L, j14, 0L, j15, 0L);
                    case 'd':
                        if ((FieldInfo.DISABLE_REFERENCE_DETECT & j13) != 0) {
                            return jjStartNfaWithStates_0(3, 58, 42);
                        }
                        if ((137438953472L & j14) != 0) {
                            this.jjmatchedKind = 101;
                            this.jjmatchedPos = 3;
                        } else if ((FieldInfo.READ_USING_MASK & j14) != 0) {
                            this.jjmatchedKind = 115;
                            this.jjmatchedPos = 3;
                        }
                        return jjMoveStringLiteralDfa4_0(j13, 0L, j14, 0L, j15, 130L);
                    case 'e':
                        return (32768 & j13) != 0 ? jjStartNfaWithStates_0(3, 15, 42) : (65536 & j13) != 0 ? jjStartNfaWithStates_0(3, 16, 42) : (16777216 & j13) != 0 ? jjStartNfaWithStates_0(3, 24, 42) : (FieldInfo.READ_ONLY & j13) != 0 ? jjStartNfaWithStates_0(3, 56, 42) : jjMoveStringLiteralDfa4_0(j13, 274945015808L, j14, 5368709120L, j15, 0L);
                    case 'f':
                        return jjMoveStringLiteralDfa4_0(j13, 0L, j14, FieldInfo.DISABLE_UNSAFE, j15, 2048L);
                    case 'g':
                        return (549755813888L & j13) != 0 ? jjStartNfaWithStates_0(3, 39, 42) : jjMoveStringLiteralDfa4_0(j13, 0L, j14, 720575940379279360L, j15, 40960L);
                    default:
                        switch (c10) {
                            case 'k':
                                return jjMoveStringLiteralDfa4_0(j13, 8796093022208L, j14, 0L, j15, 0L);
                            case 'l':
                                return (4398046511104L & j13) != 0 ? jjStartNfaWithStates_0(3, 42, 42) : jjMoveStringLiteralDfa4_0(j13, 2305913395137744896L, j14, 0L, j15, 0L);
                            case 'm':
                                if ((33554432 & j13) != 0) {
                                    return jjStartNfaWithStates_0(3, 25, 42);
                                }
                                break;
                            case 'n':
                                return (1152921504606846976L & j13) != 0 ? jjStartNfaWithStates_0(3, 60, 42) : jjMoveStringLiteralDfa4_0(j13, 9007199254740992L, j14, 0L, j15, 0L);
                            case 'o':
                                return (4294967296L & j13) != 0 ? jjStartNfaWithStates_0(3, 32, 42) : jjMoveStringLiteralDfa4_0(j13, 54043229888184320L, j14, 0L, j15, 0L);
                            default:
                                switch (c10) {
                                    case 'r':
                                        return (262144 & j13) != 0 ? jjStartNfaWithStates_0(3, 18, 42) : jjMoveStringLiteralDfa4_0(j13, FieldInfo.VALUE_MASK, j14, 0L, j15, 32L);
                                    case 's':
                                        return jjMoveStringLiteralDfa4_0(j13, 134758400L, j14, 0L, j15, 0L);
                                    case 't':
                                        return jjMoveStringLiteralDfa4_0(j13, 2850002859722752L, j14, 738871813865472L, j15, 0L);
                                    case 'u':
                                        return jjMoveStringLiteralDfa4_0(j13, 140737488355328L, j14, 0L, j15, 0L);
                                    case 'v':
                                        return jjMoveStringLiteralDfa4_0(j13, 17592186044416L, j14, 0L, j15, 0L);
                                    case 'w':
                                        if ((9007199254740992L & j14) != 0) {
                                            this.jjmatchedKind = 117;
                                            this.jjmatchedPos = 3;
                                        }
                                        return jjMoveStringLiteralDfa4_0(j13, 0L, j14, 0L, j15, 512L);
                                }
                        }
                        break;
                }
            } else if ((Http2Stream.EMIT_BUFFER_SIZE & j15) != 0) {
                return jjStopAtPos(3, 142);
            }
            return jjStartNfa_0(2, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(2, j13, j14, j15);
            return 3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa4_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(2, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            switch (c10) {
                case '_':
                    return jjMoveStringLiteralDfa5_0(j13, 0L, j14, 0L, j15, 674L);
                case 'a':
                    return jjMoveStringLiteralDfa5_0(j13, 26456998543360L, j14, 0L, j15, 8L);
                case 'c':
                    return jjMoveStringLiteralDfa5_0(j13, 3377699720527872L, j14, 0L, j15, 0L);
                case 'e':
                    return (134217728 & j13) != 0 ? jjStartNfaWithStates_0(4, 27, 42) : (FieldInfo.BACKR_EFERENCE & j13) != 0 ? jjStartNfaWithStates_0(4, 61, 42) : jjMoveStringLiteralDfa5_0(j13, 35201551962112L, j14, 0L, j15, 0L);
                case 'h':
                    return (131072 & j13) != 0 ? jjStartNfaWithStates_0(4, 17, 42) : jjMoveStringLiteralDfa5_0(j13, FieldInfo.FIELD_MASK, j14, 720575940379279360L, j15, 40960L);
                case 'i':
                    return jjMoveStringLiteralDfa5_0(j13, 633318698647552L, j14, 0L, j15, 0L);
                case 'k':
                    if ((8192 & j13) != 0) {
                        return jjStartNfaWithStates_0(4, 13, 42);
                    }
                    break;
                case 'l':
                    if ((268435456 & j13) != 0) {
                        this.jjmatchedKind = 28;
                        this.jjmatchedPos = 4;
                    }
                    return jjMoveStringLiteralDfa5_0(j13, 545259520L, j14, 0L, j15, 0L);
                case 'n':
                    return jjMoveStringLiteralDfa5_0(j13, 67108864L, j14, 0L, j15, 0L);
                case 'q':
                    if ((1073741824 & j14) != 0) {
                        return jjStopAtPos(4, 94);
                    }
                    if ((4294967296L & j14) != 0) {
                        return jjStopAtPos(4, 96);
                    }
                    break;
                case 'r':
                    return jjMoveStringLiteralDfa5_0(j13, 141046726002688L, j14, 0L, j15, 0L);
                case 's':
                    return (Http2Stream.EMIT_BUFFER_SIZE & j13) != 0 ? jjStartNfaWithStates_0(4, 14, 42) : jjMoveStringLiteralDfa5_0(j13, 9007199254740992L, j14, 0L, j15, 0L);
                case 't':
                    return (524288 & j13) != 0 ? jjStartNfaWithStates_0(4, 19, 42) : (1073741824 & j13) != 0 ? jjStartNfaWithStates_0(4, 30, 42) : (FieldInfo.VALUE_MASK & j13) != 0 ? jjStartNfaWithStates_0(4, 48, 42) : jjMoveStringLiteralDfa5_0(j13, 576460752303423488L, j14, FieldInfo.DISABLE_UNSAFE, j15, 2048L);
                case 'u':
                    return jjMoveStringLiteralDfa5_0(j13, 2097152L, j14, 0L, j15, 67108864L);
                case 'v':
                    return jjMoveStringLiteralDfa5_0(j13, 1099511627776L, j14, 0L, j15, 0L);
                case 'w':
                    if ((18014398509481984L & j13) != 0) {
                        this.jjmatchedKind = 54;
                        this.jjmatchedPos = 4;
                    }
                    return jjMoveStringLiteralDfa5_0(j13, FieldInfo.DISABLE_UNSAFE, j14, 738871813865472L, j15, 0L);
            }
            return jjStartNfa_0(3, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(3, j13, j14, j15);
            return 4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa5_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(3, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            switch (c10) {
                case '_':
                    return jjMoveStringLiteralDfa6_0(j13, 0L, j14, FieldInfo.DISABLE_UNSAFE, j15, 2048L);
                case 'a':
                    return jjMoveStringLiteralDfa6_0(j13, 6144L, j14, 0L, j15, 674L);
                case 'c':
                    return (70368744177664L & j13) != 0 ? jjStartNfaWithStates_0(5, 46, 42) : (FieldInfo.UNWRAPPED_MASK & j13) != 0 ? jjStartNfaWithStates_0(5, 49, 42) : jjMoveStringLiteralDfa6_0(j13, 35184372088832L, j14, 0L, j15, 0L);
                case 'd':
                    return jjMoveStringLiteralDfa6_0(j13, 67108864L, j14, 0L, j15, 0L);
                case 'e':
                    if ((8388608 & j13) != 0) {
                        return jjStartNfaWithStates_0(5, 23, 42);
                    }
                    if ((1099511627776L & j13) != 0) {
                        return jjStartNfaWithStates_0(5, 40, 42);
                    }
                    break;
                case 'f':
                    return jjMoveStringLiteralDfa6_0(j13, 274877906944L, j14, 0L, j15, 0L);
                case 'g':
                    return jjMoveStringLiteralDfa6_0(j13, 8796093022208L, j14, 0L, j15, 0L);
                case 'h':
                    if ((FieldInfo.READ_USING_MASK & j13) != 0) {
                        return jjStartNfaWithStates_0(5, 51, 42);
                    }
                    break;
                case 'i':
                    return jjMoveStringLiteralDfa6_0(j13, 585467951558164480L, j14, 738871813865472L, j15, 0L);
                case 'l':
                    return jjMoveStringLiteralDfa6_0(j13, 538968064L, j14, 0L, j15, 67108864L);
                case 'm':
                    return jjMoveStringLiteralDfa6_0(j13, 17179869184L, j14, 0L, j15, 0L);
                case 'n':
                    return (140737488355328L & j13) != 0 ? jjStartNfaWithStates_0(5, 47, 42) : jjMoveStringLiteralDfa6_0(j13, 68720525312L, j14, 0L, j15, 0L);
                case 'r':
                    return jjMoveStringLiteralDfa6_0(j13, FieldInfo.FIELD_MASK, j14, 0L, j15, 0L);
                case 's':
                    return (FieldInfo.DISABLE_UNSAFE & j13) != 0 ? jjStartNfaWithStates_0(5, 55, 42) : jjMoveStringLiteralDfa6_0(j13, 0L, j14, 0L, j15, 8L);
                case 't':
                    return (34359738368L & j13) != 0 ? jjStartNfaWithStates_0(5, 35, 42) : jjMoveStringLiteralDfa6_0(j13, 1143492092887040L, j14, 720575940379279360L, j15, 40960L);
            }
            return jjStartNfa_0(4, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(4, j13, j14, j15);
            return 5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa6_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(4, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 == '_') {
                return jjMoveStringLiteralDfa7_0(j13, 0L, j14, 720575940379279360L, j15, 40960L);
            }
            if (c10 == 'a') {
                return jjMoveStringLiteralDfa7_0(j13, 274877906944L, j14, 0L, j15, 0L);
            }
            if (c10 == 'c') {
                return jjMoveStringLiteralDfa7_0(j13, 68719478784L, j14, 0L, j15, 0L);
            }
            if (c10 == 'l') {
                return jjMoveStringLiteralDfa7_0(j13, 576460752303423488L, j14, 0L, j15, 0L);
            }
            if (c10 != 'y') {
                if (c10 == 'e') {
                    return (8796093022208L & j13) != 0 ? jjStartNfaWithStates_0(6, 43, 42) : (17592186044416L & j13) != 0 ? jjStartNfaWithStates_0(6, 44, 42) : jjMoveStringLiteralDfa7_0(j13, 9007216434610176L, j14, 0L, j15, 0L);
                }
                if (c10 == 'f') {
                    return jjMoveStringLiteralDfa7_0(j13, FieldInfo.RAW_VALUE_MASK, j14, 0L, j15, 0L);
                }
                if (c10 != 'n') {
                    if (c10 == 'o') {
                        return jjMoveStringLiteralDfa7_0(j13, FieldInfo.FIELD_MASK, j14, 0L, j15, 0L);
                    }
                    switch (c10) {
                        case 's':
                            return (67108864 & j13) != 0 ? jjStartNfaWithStates_0(6, 26, 42) : jjMoveStringLiteralDfa7_0(j13, 0L, j14, 36767668832829440L, j15, 2730L);
                        case 't':
                            if ((2097152 & j13) != 0) {
                                this.jjmatchedKind = 21;
                                this.jjmatchedPos = 6;
                            }
                            return jjMoveStringLiteralDfa7_0(j13, 35184372088832L, j14, 0L, j15, 67108864L);
                        case 'u':
                            return jjMoveStringLiteralDfa7_0(j13, 1048576L, j14, 0L, j15, 0L);
                    }
                }
                if ((4096 & j13) != 0) {
                    return jjStartNfaWithStates_0(6, 12, 42);
                }
            } else if ((536870912 & j13) != 0) {
                return jjStartNfaWithStates_0(6, 29, 42);
            }
            return jjStartNfa_0(5, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(5, j13, j14, j15);
            return 6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa7_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(5, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 != ':') {
                if (c10 == 'c') {
                    return jjMoveStringLiteralDfa8_0(j13, 274877906944L, j14, 0L, j15, 0L);
                }
                if (c10 == 'e') {
                    return (1048576 & j13) != 0 ? jjStartNfaWithStates_0(7, 20, 42) : (576460752303423488L & j13) != 0 ? jjStartNfaWithStates_0(7, 59, 42) : jjMoveStringLiteralDfa8_0(j13, 35253091565568L, j14, 738871813865472L, j15, 0L);
                }
                if (c10 == 'n') {
                    return jjMoveStringLiteralDfa8_0(j13, 13510816061980672L, j14, 0L, j15, 0L);
                }
                if (c10 != 'p') {
                    if (c10 == 'h') {
                        return jjMoveStringLiteralDfa8_0(j13, 0L, j14, FieldInfo.DISABLE_UNSAFE, j15, 2048L);
                    }
                    if (c10 == 'i') {
                        return jjMoveStringLiteralDfa8_0(j13, 0L, j14, 0L, j15, 8L);
                    }
                    switch (c10) {
                        case 's':
                            return jjMoveStringLiteralDfa8_0(j13, 0L, j14, FieldInfo.DISABLE_SMART_MATCH, j15, 8866L);
                        case 't':
                            if ((2048 & j13) != 0) {
                                return jjStartNfaWithStates_0(7, 11, 42);
                            }
                            break;
                        case 'u':
                            return jjMoveStringLiteralDfa8_0(j13, 0L, j14, 576460752303423488L, j15, 32768L);
                    }
                } else if ((FieldInfo.RAW_VALUE_MASK & j13) != 0) {
                    return jjStartNfaWithStates_0(7, 50, 42);
                }
            } else if ((67108864 & j15) != 0) {
                return jjStopAtPos(7, Opcodes.IFNE);
            }
            return jjStartNfa_0(6, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(6, j13, j14, j15);
            return 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa8_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(6, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 == '_') {
                return jjMoveStringLiteralDfa9_0(j13, 0L, j14, 738871813865472L, j15, 0L);
            }
            if (c10 == 't') {
                return (9007199254740992L & j13) != 0 ? jjStartNfaWithStates_0(8, 53, 42) : jjMoveStringLiteralDfa9_0(j13, 17179869184L, j14, 0L, j15, 0L);
            }
            if (c10 != 'd') {
                if (c10 != 'e') {
                    if (c10 == 'n') {
                        return jjMoveStringLiteralDfa9_0(j13, 0L, j14, 576460752303423488L, j15, 32768L);
                    }
                    if (c10 == 'o') {
                        return jjMoveStringLiteralDfa9_0(j13, 68719476736L, j14, 0L, j15, 0L);
                    }
                    switch (c10) {
                        case 'g':
                            return jjMoveStringLiteralDfa9_0(j13, 0L, j14, 0L, j15, 8L);
                        case 'h':
                            return jjMoveStringLiteralDfa9_0(j13, 0L, j14, FieldInfo.DISABLE_SMART_MATCH, j15, 8192L);
                        case 'i':
                            return jjMoveStringLiteralDfa9_0(j13, FieldInfo.FIELD_MASK, j14, FieldInfo.DISABLE_UNSAFE, j15, 2722L);
                    }
                }
                if ((274877906944L & j13) != 0) {
                    return jjStartNfaWithStates_0(8, 38, 42);
                }
            } else if ((35184372088832L & j13) != 0) {
                return jjStartNfaWithStates_0(8, 45, 42);
            }
            return jjStartNfa_0(7, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(7, j13, j14, j15);
            return 8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjMoveStringLiteralDfa9_0(long j3, long j4, long j5, long j10, long j11, long j12) {
        long j13 = j4 & j3;
        long j14 = j10 & j5;
        long j15 = j12 & j11;
        if ((j13 | j14 | j15) == 0) {
            return jjStartNfa_0(7, j3, j5, j11);
        }
        try {
            char c10 = this.input_stream.readChar();
            this.curChar = c10;
            if (c10 == 'a') {
                return jjMoveStringLiteralDfa10_0(j13, 0L, j14, 35184372088832L, j15, 0L);
            }
            if (c10 == 'i') {
                return jjMoveStringLiteralDfa10_0(j13, 0L, j14, FieldInfo.DISABLE_SMART_MATCH, j15, 8192L);
            }
            if (c10 == 's') {
                return (17179869184L & j13) != 0 ? jjStartNfaWithStates_0(9, 34, 42) : jjMoveStringLiteralDfa10_0(j13, 0L, j14, 576460752303423488L, j15, 32768L);
            }
            if (c10 == 'x') {
                return jjMoveStringLiteralDfa10_0(j13, 0L, j14, FieldInfo.UNWRAPPED_MASK, j15, 0L);
            }
            if (c10 == 'z') {
                return jjMoveStringLiteralDfa10_0(j13, FieldInfo.FIELD_MASK, j14, 0L, j15, 0L);
            }
            if (c10 == 'f') {
                return (68719476736L & j13) != 0 ? jjStartNfaWithStates_0(9, 36, 42) : jjMoveStringLiteralDfa10_0(j13, 0L, j14, FieldInfo.DISABLE_UNSAFE, j15, 2048L);
            }
            if (c10 == 'g') {
                return jjMoveStringLiteralDfa10_0(j13, 0L, j14, 0L, j15, 674L);
            }
            if (c10 != 'n') {
                if (c10 == 'o') {
                    return jjMoveStringLiteralDfa10_0(j13, 0L, j14, 140737488355328L, j15, 0L);
                }
            } else if ((8 & j15) != 0) {
                return jjStopAtPos(9, 131);
            }
            return jjStartNfa_0(8, j13, j14, j15);
        } catch (IOException unused) {
            jjStopStringLiteralDfa_0(8, j13, j14, j15);
            return 9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjStartNfaWithStates_0(int i9, int i10, int i11) {
        this.jjmatchedKind = i10;
        this.jjmatchedPos = i9;
        try {
            this.curChar = this.input_stream.readChar();
            return jjMoveNfa_0(i11, i9 + 1);
        } catch (IOException unused) {
            return i9 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int jjStartNfa_0(int i9, long j3, long j4, long j5) {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(i9, j3, j4, j5), i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int jjStopAtPos(int i9, int i10) {
        this.jjmatchedKind = i10;
        this.jjmatchedPos = i9;
        return i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int jjStopStringLiteralDfa_0(int i9, long j3, long j4, long j5) {
        switch (i9) {
            case 0:
                if ((18014399063130112L & j4) != 0 || (j5 & 132096) != 0) {
                    return 80;
                }
                if ((1048576 & j4) != 0 || (j5 & 16777216) != 0) {
                    return 18;
                }
                if ((j4 & (-9223363240761753600L)) != 0) {
                    return 69;
                }
                if ((4611686018427385856L & j3) == 0 && (j5 & 67108864) == 0) {
                    return (j3 & 62) != 0 ? 0 : -1;
                }
                this.jjmatchedKind = 73;
                return 42;
            case 1:
                if ((j4 & 18014398509481984L) != 0 || (j5 & RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) != 0) {
                    return 80;
                }
                if ((8602517504L & j3) != 0) {
                    return 42;
                }
                if ((j3 & 4611686009824868352L) == 0 && (j5 & 67108864) == 0) {
                    return -1;
                }
                if (this.jjmatchedPos != 1) {
                    this.jjmatchedKind = 73;
                    this.jjmatchedPos = 1;
                }
                return 42;
            case 2:
                if ((144117801563455488L & j3) != 0) {
                    return 42;
                }
                if ((j3 & 4467568208269801472L) == 0 && (j5 & 67108864) == 0) {
                    return -1;
                }
                if (this.jjmatchedPos != 2) {
                    this.jjmatchedKind = 73;
                    this.jjmatchedPos = 2;
                }
                return 42;
            case 3:
                if ((1513214426944471040L & j3) != 0) {
                    return 42;
                }
                if ((j3 & 2954354056203237376L) == 0 && (j5 & 67108864) == 0) {
                    return -1;
                }
                if (this.jjmatchedPos != 3) {
                    this.jjmatchedKind = 73;
                    this.jjmatchedPos = 3;
                }
                return 42;
            case 4:
                if ((2360167681732796416L & j3) != 0) {
                    return 42;
                }
                if ((j3 & 594186374470440960L) == 0 && (j5 & 67108864) == 0) {
                    return -1;
                }
                if (this.jjmatchedPos != 4) {
                    this.jjmatchedKind = 73;
                    this.jjmatchedPos = 4;
                }
                return 42;
            case 5:
                if ((591159385127917568L & j3) == 0 && (j5 & 67108864) == 0) {
                    return (j3 & 39055786898358272L) != 0 ? 42 : -1;
                }
                this.jjmatchedKind = 73;
                this.jjmatchedPos = 5;
                return 42;
            case 6:
                if ((26388885147648L & j3) != 0 || (j5 & 67108864) != 0) {
                    return 42;
                }
                if ((j3 & 591132996242769920L) == 0) {
                    return -1;
                }
                if (this.jjmatchedPos != 6) {
                    this.jjmatchedKind = 73;
                    this.jjmatchedPos = 6;
                }
                return 42;
            case 7:
                if ((577586652211316736L & j3) != 0) {
                    return 42;
                }
                if ((j3 & 13546344031453184L) == 0) {
                    return -1;
                }
                this.jjmatchedKind = 73;
                this.jjmatchedPos = 7;
                return 42;
            case 8:
                if ((9042658504736768L & j3) != 0) {
                    return 42;
                }
                if ((j3 & 4503685526716416L) == 0) {
                    return -1;
                }
                this.jjmatchedKind = 73;
                this.jjmatchedPos = 8;
                return 42;
            case 9:
                if ((85899345920L & j3) != 0) {
                    return 42;
                }
                if ((j3 & FieldInfo.FIELD_MASK) == 0) {
                    return -1;
                }
                this.jjmatchedKind = 73;
                this.jjmatchedPos = 9;
                return 42;
            case 10:
                if ((j3 & FieldInfo.FIELD_MASK) == 0) {
                    return -1;
                }
                if (this.jjmatchedPos != 10) {
                    this.jjmatchedKind = 73;
                    this.jjmatchedPos = 10;
                }
                return 42;
            case 11:
                return (j3 & FieldInfo.FIELD_MASK) != 0 ? 42 : -1;
            default:
                return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void MoreLexicalActions() {
        int i9 = this.jjimageLen;
        int i10 = this.jjmatchedPos + 1;
        this.lengthOfMatch = i10;
        this.jjimageLen = i9 + i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void ReInit(JavaCharStream javaCharStream) {
        this.jjnewStateCnt = 0;
        this.jjmatchedPos = 0;
        this.curLexState = this.defaultLexState;
        this.input_stream = javaCharStream;
        ReInitRounds();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void SwitchTo(int i9) {
        if (i9 >= 1 || i9 < 0) {
            throw new TokenMgrException(AbstractC0921a.m2250m(i9, "Error: Ignoring invalid lexical state : ", ". State unchanged."), 2);
        }
        this.curLexState = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Token getNextToken() {
        int i9;
        int i10;
        boolean z9;
        String str;
        String image = HttpUrl.FRAGMENT_ENCODE_SET;
        String image2 = null;
        Token token = null;
        while (true) {
            int i11 = 0;
            try {
                this.curChar = this.input_stream.beginToken();
                this.jjmatchedKind = Integer.MAX_VALUE;
                this.jjmatchedPos = 0;
                int iJjMoveStringLiteralDfa0_0 = jjMoveStringLiteralDfa0_0();
                if (this.jjmatchedKind == Integer.MAX_VALUE) {
                    int endLine = this.input_stream.getEndLine();
                    int endColumn = this.input_stream.getEndColumn();
                    try {
                        this.input_stream.readChar();
                        this.input_stream.backup(1);
                        i9 = endLine;
                        z9 = false;
                        i10 = endColumn;
                    } catch (IOException unused) {
                        image2 = iJjMoveStringLiteralDfa0_0 <= 1 ? HttpUrl.FRAGMENT_ENCODE_SET : this.input_stream.getImage();
                        int i12 = this.curChar;
                        if (i12 == 10 || i12 == 13) {
                            endLine++;
                        } else {
                            i11 = endColumn + 1;
                        }
                        i9 = endLine;
                        i10 = i11;
                        z9 = true;
                    }
                    if (z9) {
                        str = image2;
                    } else {
                        this.input_stream.backup(1);
                        if (iJjMoveStringLiteralDfa0_0 > 1) {
                            image = this.input_stream.getImage();
                        }
                        str = image;
                    }
                    throw new TokenMgrException(z9, this.curLexState, i9, i10, str, this.curChar, 0);
                }
                int i13 = this.jjmatchedPos;
                if (i13 + 1 < iJjMoveStringLiteralDfa0_0) {
                    this.input_stream.backup((iJjMoveStringLiteralDfa0_0 - i13) - 1);
                }
                long[] jArr = jjtoToken;
                int i14 = this.jjmatchedKind;
                if ((jArr[i14 >> 6] & (1 << (i14 & 63))) != 0) {
                    Token tokenJjFillToken = jjFillToken();
                    tokenJjFillToken.specialToken = token;
                    return tokenJjFillToken;
                }
                if (((1 << (i14 & 63)) & jjtoSpecial[i14 >> 6]) != 0) {
                    Token tokenJjFillToken2 = jjFillToken();
                    if (token != null) {
                        tokenJjFillToken2.specialToken = token;
                        token.next = tokenJjFillToken2;
                    }
                    token = tokenJjFillToken2;
                }
            } catch (Exception unused2) {
                this.jjmatchedKind = 0;
                this.jjmatchedPos = -1;
                Token tokenJjFillToken3 = jjFillToken();
                tokenJjFillToken3.specialToken = token;
                return tokenJjFillToken3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Token jjFillToken() {
        String image = jjstrLiteralImages[this.jjmatchedKind];
        if (image == null) {
            image = this.input_stream.getImage();
        }
        int beginLine = this.input_stream.getBeginLine();
        int beginColumn = this.input_stream.getBeginColumn();
        int endLine = this.input_stream.getEndLine();
        int endColumn = this.input_stream.getEndColumn();
        Token tokenNewToken = Token.newToken(this.jjmatchedKind);
        tokenNewToken.kind = this.jjmatchedKind;
        tokenNewToken.image = image;
        tokenNewToken.beginLine = beginLine;
        tokenNewToken.endLine = endLine;
        tokenNewToken.beginColumn = beginColumn;
        tokenNewToken.endColumn = endColumn;
        return tokenNewToken;
    }

    public void ReInit(JavaCharStream javaCharStream, int i9) {
        ReInit(javaCharStream);
        SwitchTo(i9);
    }

    public void SkipLexicalActions(Token token) {
    }

    public void TokenLexicalActions(Token token) {
    }

    public ParserTokenManager(JavaCharStream javaCharStream) {
        this.curLexState = 0;
        this.defaultLexState = 0;
        this.jjrounds = new int[80];
        this.jjstateSet = new int[Opcodes.IF_ICMPNE];
        StringBuilder sb2 = new StringBuilder();
        this.jjimage = sb2;
        this.image = sb2;
        this.input_stream = javaCharStream;
    }
}
