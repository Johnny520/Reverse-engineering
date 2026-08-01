package com.alibaba.fastjson2.internal.asm;

import com.alibaba.fastjson2.JSONB;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 67108864;
    private static final int BOOLEAN = 4194313;
    private static final int BYTE = 4194314;
    private static final int CHAR = 4194315;
    static final int CHOP_FRAME = 248;
    static final int CONSTANT_KIND = 4194304;
    static final int DIM_MASK = -67108864;
    static final int DIM_SHIFT = 26;
    static final int DIM_SIZE = 6;
    private static final int DOUBLE = 4194307;
    static final int ELEMENT_OF = -67108864;
    static final int FLAGS_SHIFT = 20;
    static final int FLAGS_SIZE = 2;
    private static final int FLOAT = 4194306;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 4194305;
    static final int ITEM_ASM_BOOLEAN = 9;
    static final int ITEM_ASM_BYTE = 10;
    static final int ITEM_ASM_CHAR = 11;
    static final int ITEM_ASM_SHORT = 12;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_TOP = 0;
    static final int ITEM_UNINITIALIZED = 8;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    static final int KIND_MASK = 62914560;
    static final int KIND_SHIFT = 22;
    static final int KIND_SIZE = 4;
    static final int LOCAL_KIND = 16777216;
    private static final int LONG = 4194308;
    private static final int NULL = 4194309;
    static final int REFERENCE_KIND = 8388608;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 4194316;
    static final int STACK_KIND = 20971520;
    private static final int TOP = 4194304;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    static final int UNINITIALIZED_KIND = 12582912;
    private static final int UNINITIALIZED_THIS = 4194310;
    static final int VALUE_MASK = 1048575;
    static final int VALUE_SIZE = 20;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    final Label owner;

    public Frame(Label label) {
        this.owner = label;
    }

    private void addInitializedType(int i10) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i11 = this.initializationCount;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(i11 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i12 = this.initializationCount;
        this.initializationCount = i12 + 1;
        iArr2[i12] = i10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getAbstractTypeFromDescriptor(com.alibaba.fastjson2.internal.asm.SymbolTable r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.internal.asm.Frame.getAbstractTypeFromDescriptor(com.alibaba.fastjson2.internal.asm.SymbolTable, java.lang.String, int):int");
    }

    private int getConcreteOutputType(int i10, int i11) {
        int i12 = (-67108864) & i10;
        int i13 = KIND_MASK & i10;
        if (i13 == 16777216) {
            int i14 = i12 + this.inputLocals[i10 & VALUE_MASK];
            if ((i10 & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || !(i14 == LONG || i14 == DOUBLE)) {
                return i14;
            }
            return 4194304;
        }
        if (i13 != STACK_KIND) {
            return i10;
        }
        int i15 = i12 + this.inputStack[i11 - (i10 & VALUE_MASK)];
        if ((i10 & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || !(i15 == LONG || i15 == DOUBLE)) {
            return i15;
        }
        return 4194304;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getInitializedType(com.alibaba.fastjson2.internal.asm.SymbolTable r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto Lc
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r2) goto L52
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.initializationCount
            if (r1 >= r2) goto L52
            int[] r2 = r8.initializations
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r7) goto L2a
            int[] r2 = r8.inputLocals
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L35
            int[] r2 = r8.inputStack
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L4f
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L43
            java.lang.String r10 = r9.className
            int r9 = r9.addType(r10)
        L41:
            r9 = r9 | r1
            return r9
        L43:
            com.alibaba.fastjson2.internal.asm.Symbol[] r0 = r9.typeTable
            r10 = r10 & r5
            r10 = r0[r10]
            java.lang.String r10 = r10.value
            int r9 = r9.addType(r10)
            goto L41
        L4f:
            int r1 = r1 + 1
            goto Ld
        L52:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.internal.asm.Frame.getInitializedType(com.alibaba.fastjson2.internal.asm.SymbolTable, int):int");
    }

    private int getLocal(int i10) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i10 >= iArr.length) {
            return i10 | 16777216;
        }
        int i11 = iArr[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = 16777216 | i10;
        iArr[i10] = i12;
        return i12;
    }

    private void pop(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            pop((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            pop(2);
        } else {
            pop(1);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void push(SymbolTable symbolTable, String str) {
        str.getClass();
        int i10 = 20;
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2043530993:
                if (str.equals("(Ljava/lang/Enum;)V")) {
                    b10 = 0;
                }
                break;
            case -1428966913:
                if (str.equals("(Ljava/lang/String;)V")) {
                    b10 = 1;
                }
                break;
            case -470836938:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V")) {
                    b10 = 2;
                }
                break;
            case -263498853:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;")) {
                    b10 = 3;
                }
                break;
            case -176321095:
                if (str.equals("(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V")) {
                    b10 = 4;
                }
                break;
            case -126180830:
                if (str.equals("()Ljava/lang/Class;")) {
                    b10 = 5;
                }
                break;
            case 39784:
                if (str.equals("()I")) {
                    b10 = 6;
                }
                break;
            case 39785:
                if (str.equals("()J")) {
                    b10 = 7;
                }
                break;
            case 39797:
                if (str.equals("()V")) {
                    b10 = 8;
                }
                break;
            case 39801:
                if (str.equals("()Z")) {
                    b10 = 9;
                }
                break;
            case 1263150:
                if (str.equals("(I)V")) {
                    b10 = 10;
                }
                break;
            case 1264111:
                if (str.equals("(J)V")) {
                    b10 = 11;
                }
                break;
            case 1264115:
                if (str.equals("(J)Z")) {
                    b10 = 12;
                }
                break;
            case 149404307:
                if (str.equals("(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;")) {
                    b10 = 13;
                }
                break;
            case 162211716:
                if (str.equals("(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z")) {
                    b10 = 14;
                }
                break;
            case 204540071:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;)V")) {
                    b10 = 15;
                }
                break;
            case 204540075:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;)Z")) {
                    b10 = JSONB.Constants.BC_INT32_NUM_16;
                }
                break;
            case 438407678:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V")) {
                    b10 = 17;
                }
                break;
            case 1192622657:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V")) {
                    b10 = 18;
                }
                break;
            case 1422865092:
                if (str.equals("(I)Ljava/lang/Object;")) {
                    b10 = 19;
                }
                break;
            case 1565685777:
                if (str.equals("(Ljava/lang/Object;)V")) {
                    b10 = 20;
                }
                break;
            case 1565685781:
                if (str.equals("(Ljava/lang/Object;)Z")) {
                    b10 = 21;
                }
                break;
            case 1638725077:
                if (str.equals("(I)Ljava/lang/Integer;")) {
                    b10 = 22;
                }
                break;
            case 1655445243:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;")) {
                    b10 = 23;
                }
                break;
            case 2045804348:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;I)V")) {
                    b10 = 24;
                }
                break;
            case 2045805309:
                if (str.equals("(Lcom/alibaba/fastjson2/JSONWriter;J)V")) {
                    b10 = 25;
                }
                break;
        }
        switch (b10) {
            case 0:
                i10 = 18;
                break;
            case 1:
            case 20:
            case Opcodes.ILOAD /* 21 */:
                break;
            case 2:
                i10 = 97;
                break;
            case 3:
                i10 = 60;
                break;
            case 4:
                i10 = 72;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i10 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 19:
            case 22:
                i10 = 3;
                break;
            case Opcodes.FCONST_2 /* 13 */:
                i10 = 62;
                break;
            case Opcodes.DCONST_0 /* 14 */:
                i10 = 44;
                break;
            case 15:
            case 16:
                i10 = 36;
                break;
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.FLOAD /* 23 */:
                i10 = 53;
                break;
            case Opcodes.LDC /* 18 */:
                i10 = 52;
                break;
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
                i10 = 37;
                break;
            default:
                if (str.charAt(0) != '(') {
                    i10 = 0;
                } else {
                    int iMax = 1;
                    while (str.charAt(iMax) != ')') {
                        while (str.charAt(iMax) == '[') {
                            iMax++;
                        }
                        int i11 = iMax + 1;
                        iMax = str.charAt(iMax) == 'L' ? Math.max(i11, str.indexOf(59, i11) + 1) : i11;
                    }
                    i10 = iMax + 1;
                }
                break;
        }
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, i10);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                push(4194304);
            }
        }
    }

    private void setLocal(int i10, int i11) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i10 >= length) {
            int[] iArr = new int[Math.max(i10 + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i10] = i11;
    }

    public final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 2;
            if (i11 >= iArr.length) {
                break;
            }
            int i15 = iArr[i11];
            if (i15 != LONG && i15 != DOUBLE) {
                i14 = 1;
            }
            i11 += i14;
            if (i15 == 4194304) {
                i13++;
            } else {
                i12 += i13 + 1;
                i13 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i16 = 0;
        int i17 = 0;
        while (i16 < iArr2.length) {
            int i18 = iArr2[i16];
            i16 += (i18 == LONG || i18 == DOUBLE) ? 2 : 1;
            i17++;
        }
        int iVisitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i12, i17);
        int i19 = 0;
        while (true) {
            int i20 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            int i21 = iArr[i19];
            i19 += (i21 == LONG || i21 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i21);
            i12 = i20;
            iVisitFrameStart++;
        }
        while (true) {
            int i22 = i17 - 1;
            if (i17 <= 0) {
                methodWriter.visitFrameEnd();
                return;
            }
            int i23 = iArr2[i10];
            i10 += (i23 == LONG || i23 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i23);
            iVisitFrameStart++;
            i17 = i22;
        }
    }

    public void execute(int i10, int i11, Symbol symbol, SymbolTable symbolTable) {
        switch (i10) {
            case 0:
            case Opcodes.INEG /* 116 */:
            case Opcodes.LNEG /* 117 */:
            case Opcodes.FNEG /* 118 */:
            case Opcodes.DNEG /* 119 */:
            case Opcodes.I2B /* 145 */:
            case Opcodes.I2C /* 146 */:
            case Opcodes.I2S /* 147 */:
            case Opcodes.GOTO /* 167 */:
            case Opcodes.RETURN /* 177 */:
                return;
            case 1:
                push(NULL);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.ILOAD /* 21 */:
                push(INTEGER);
                return;
            case 9:
            case 10:
            case 22:
                push(LONG);
                push(4194304);
                return;
            case 11:
            case 12:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.FLOAD /* 23 */:
                push(FLOAT);
                return;
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case Opcodes.DLOAD /* 24 */:
                push(DOUBLE);
                push(4194304);
                return;
            case Opcodes.LDC /* 18 */:
                int i12 = symbol.tag;
                switch (i12) {
                    case 3:
                        push(INTEGER);
                        return;
                    case 4:
                        push(FLOAT);
                        return;
                    case 5:
                        push(LONG);
                        push(4194304);
                        return;
                    case 6:
                        push(DOUBLE);
                        push(4194304);
                        return;
                    case 7:
                        push(symbolTable.addType("java/lang/Class") | REFERENCE_KIND);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | REFERENCE_KIND);
                        return;
                    default:
                        switch (i12) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | REFERENCE_KIND);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | REFERENCE_KIND);
                                return;
                            case Opcodes.SIPUSH /* 17 */:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            case 19:
            case 20:
            case DIM_SHIFT /* 26 */:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 90:
            case 91:
            case 93:
            case 94:
            case 98:
            case 99:
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
            case 106:
            case 107:
            case 110:
            case 111:
            case 114:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case Opcodes.JSR /* 168 */:
            case Opcodes.RET /* 169 */:
            case 186:
            case Opcodes.NEWARRAY /* 188 */:
            case 196:
            case 197:
            default:
                throw new IllegalArgumentException();
            case Opcodes.ALOAD /* 25 */:
                push(getLocal(i11));
                return;
            case Opcodes.IALOAD /* 46 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
            case Opcodes.IADD /* 96 */:
            case 100:
            case Opcodes.IMUL /* 104 */:
            case Opcodes.IDIV /* 108 */:
            case Opcodes.IREM /* 112 */:
            case Opcodes.ISHL /* 120 */:
            case Opcodes.ISHR /* 122 */:
            case Opcodes.IUSHR /* 124 */:
            case 126:
            case 128:
            case Opcodes.IXOR /* 130 */:
            case Opcodes.L2I /* 136 */:
            case Opcodes.D2I /* 142 */:
            case Opcodes.FCMPL /* 149 */:
            case Opcodes.FCMPG /* 150 */:
                pop(2);
                push(INTEGER);
                return;
            case 47:
            case Opcodes.D2L /* 143 */:
                pop(2);
                push(LONG);
                push(4194304);
                return;
            case Opcodes.AALOAD /* 50 */:
                pop(1);
                int iPop = pop();
                if (iPop != NULL) {
                    iPop -= 67108864;
                }
                push(iPop);
                return;
            case Opcodes.ISTORE /* 54 */:
            case Opcodes.FSTORE /* 56 */:
            case Opcodes.ASTORE /* 58 */:
                setLocal(i11, pop());
                if (i11 > 0) {
                    int i13 = i11 - 1;
                    int local = getLocal(i13);
                    if (local == LONG || local == DOUBLE) {
                        setLocal(i13, 4194304);
                        return;
                    }
                    int i14 = local & KIND_MASK;
                    if (i14 == 16777216 || i14 == STACK_KIND) {
                        setLocal(i13, local | TOP_IF_LONG_OR_DOUBLE_FLAG);
                        return;
                    }
                    return;
                }
                return;
            case Opcodes.LSTORE /* 55 */:
            case Opcodes.DSTORE /* 57 */:
                pop(1);
                setLocal(i11, pop());
                setLocal(i11 + 1, 4194304);
                if (i11 > 0) {
                    int i15 = i11 - 1;
                    int local2 = getLocal(i15);
                    if (local2 == LONG || local2 == DOUBLE) {
                        setLocal(i15, 4194304);
                        return;
                    }
                    int i16 = local2 & KIND_MASK;
                    if (i16 == 16777216 || i16 == STACK_KIND) {
                        setLocal(i15, local2 | TOP_IF_LONG_OR_DOUBLE_FLAG);
                        return;
                    }
                    return;
                }
                return;
            case Opcodes.IASTORE /* 79 */:
            case Opcodes.AASTORE /* 83 */:
            case Opcodes.BASTORE /* 84 */:
            case Opcodes.CASTORE /* 85 */:
                pop(3);
                return;
            case Opcodes.POP /* 87 */:
            case Opcodes.IFEQ /* 153 */:
            case Opcodes.IFNE /* 154 */:
            case Opcodes.IFLT /* 155 */:
            case Opcodes.IFGE /* 156 */:
            case Opcodes.IFGT /* 157 */:
            case Opcodes.IFLE /* 158 */:
            case Opcodes.TABLESWITCH /* 170 */:
            case Opcodes.LOOKUPSWITCH /* 171 */:
            case Opcodes.IRETURN /* 172 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.ATHROW /* 191 */:
            case Opcodes.MONITORENTER /* 194 */:
            case Opcodes.MONITOREXIT /* 195 */:
            case Opcodes.IFNULL /* 198 */:
            case Opcodes.IFNONNULL /* 199 */:
                pop(1);
                return;
            case Opcodes.POP2 /* 88 */:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGE /* 162 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ICMPLE /* 164 */:
            case Opcodes.IF_ACMPEQ /* 165 */:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.LRETURN /* 173 */:
            case Opcodes.DRETURN /* 175 */:
                pop(2);
                return;
            case Opcodes.DUP /* 89 */:
                int iPop2 = pop();
                push(iPop2);
                push(iPop2);
                return;
            case Opcodes.DUP2 /* 92 */:
                int iPop3 = pop();
                int iPop4 = pop();
                push(iPop4);
                push(iPop3);
                push(iPop4);
                push(iPop3);
                return;
            case Opcodes.SWAP /* 95 */:
                int iPop5 = pop();
                int iPop6 = pop();
                push(iPop5);
                push(iPop6);
                return;
            case Opcodes.LADD /* 97 */:
            case 101:
            case Opcodes.LMUL /* 105 */:
            case Opcodes.LDIV /* 109 */:
            case Opcodes.LREM /* 113 */:
            case 127:
            case Opcodes.LOR /* 129 */:
            case Opcodes.LXOR /* 131 */:
                pop(4);
                push(LONG);
                push(4194304);
                return;
            case Opcodes.LSHL /* 121 */:
            case Opcodes.LSHR /* 123 */:
            case Opcodes.LUSHR /* 125 */:
                pop(3);
                push(LONG);
                push(4194304);
                return;
            case Opcodes.IINC /* 132 */:
                setLocal(i11, INTEGER);
                return;
            case Opcodes.I2L /* 133 */:
            case Opcodes.F2L /* 140 */:
                pop(1);
                push(LONG);
                push(4194304);
                return;
            case Opcodes.I2F /* 134 */:
                pop(1);
                push(FLOAT);
                return;
            case Opcodes.I2D /* 135 */:
                pop(1);
                push(DOUBLE);
                push(4194304);
                return;
            case Opcodes.F2I /* 139 */:
            case Opcodes.ARRAYLENGTH /* 190 */:
            case Opcodes.INSTANCEOF /* 193 */:
                pop(1);
                push(INTEGER);
                return;
            case Opcodes.LCMP /* 148 */:
            case Opcodes.DCMPL /* 151 */:
            case Opcodes.DCMPG /* 152 */:
                pop(4);
                push(INTEGER);
                return;
            case Opcodes.GETSTATIC /* 178 */:
                push(symbolTable, symbol.value);
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                pop(symbol.value);
                return;
            case Opcodes.GETFIELD /* 180 */:
                pop(1);
                push(symbolTable, symbol.value);
                return;
            case Opcodes.PUTFIELD /* 181 */:
                pop(symbol.value);
                pop();
                return;
            case Opcodes.INVOKEVIRTUAL /* 182 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.INVOKESTATIC /* 184 */:
            case Opcodes.INVOKEINTERFACE /* 185 */:
                pop(symbol.value);
                if (i10 != 184) {
                    int iPop7 = pop();
                    if (i10 == 183 && symbol.name.charAt(0) == '<') {
                        addInitializedType(iPop7);
                    }
                }
                push(symbolTable, symbol.value);
                return;
            case Opcodes.NEW /* 187 */:
                push(symbolTable.addUninitializedType(symbol.value, i11) | UNINITIALIZED_KIND);
                return;
            case Opcodes.ANEWARRAY /* 189 */:
                String str = symbol.value;
                pop();
                if (str.charAt(0) == '[') {
                    push(symbolTable, "[".concat(str));
                    return;
                } else {
                    push(symbolTable.addType(str) | 75497472);
                    return;
                }
            case Opcodes.CHECKCAST /* 192 */:
                String str2 = symbol.value;
                pop();
                if (str2.charAt(0) == '[') {
                    push(symbolTable, str2);
                    return;
                } else {
                    push(symbolTable.addType(str2) | REFERENCE_KIND);
                    return;
                }
        }
    }

    public final boolean merge(SymbolTable symbolTable, Frame frame) {
        int i10;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean zMerge = true;
        boolean zMerge2 = frame.inputLocals == null;
        if (zMerge2) {
            frame.inputLocals = new int[length];
        }
        int i11 = 0;
        while (i11 < length) {
            int[] iArr = this.outputLocals;
            int initializedType = (iArr == null || i11 >= iArr.length || (i10 = iArr[i11]) == 0) ? this.inputLocals[i11] : getConcreteOutputType(i10, length2);
            if (this.initializations != null) {
                initializedType = getInitializedType(symbolTable, initializedType);
            }
            zMerge2 |= merge(symbolTable, initializedType, frame.inputLocals, i11);
            i11++;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            zMerge = zMerge2;
        }
        for (int i12 = 0; i12 < length3; i12++) {
            int initializedType2 = this.inputStack[i12];
            if (this.initializations != null) {
                initializedType2 = getInitializedType(symbolTable, initializedType2);
            }
            zMerge |= merge(symbolTable, initializedType2, frame.inputStack, i12);
        }
        for (int i13 = 0; i13 < this.outputStackTop; i13++) {
            int concreteOutputType = getConcreteOutputType(this.outputStack[i13], length2);
            if (this.initializations != null) {
                concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
            }
            zMerge |= merge(symbolTable, concreteOutputType, frame.inputStack, length3 + i13);
        }
        return zMerge;
    }

    public final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i10, String str, int i11) {
        int i12;
        int[] iArr = new int[i11];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i10 & 8) == 0) {
            i12 = 1;
            if ((i10 & 262144) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.className) | REFERENCE_KIND;
            } else {
                iArr[0] = UNINITIALIZED_THIS;
            }
        } else {
            i12 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i13 = i12 + 1;
            iArr2[i12] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                i12 += 2;
                iArr2[i13] = 4194304;
            } else {
                i12 = i13;
            }
        }
        while (i12 < i11) {
            this.inputLocals[i12] = 4194304;
            i12++;
        }
    }

    private void pop(int i10) {
        short s10 = this.outputStackTop;
        if (s10 >= i10) {
            this.outputStackTop = (short) (s10 - i10);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i10 - s10));
            this.outputStackTop = (short) 0;
        }
    }

    private int pop() {
        short s10 = this.outputStackTop;
        if (s10 > 0) {
            int[] iArr = this.outputStack;
            short s11 = (short) (s10 - 1);
            this.outputStackTop = s11;
            return iArr[s11];
        }
        short s12 = (short) (this.outputStackStart - 1);
        this.outputStackStart = s12;
        return (-s12) | STACK_KIND;
    }

    private static boolean merge(SymbolTable symbolTable, int i10, int[] iArr, int i11) {
        int iMin;
        int iAddType;
        int i12 = iArr[i11];
        if (i12 == i10) {
            return false;
        }
        if ((67108863 & i10) == NULL) {
            if (i12 == NULL) {
                return false;
            }
            i10 = NULL;
        }
        if (i12 == 0) {
            iArr[i11] = i10;
            return true;
        }
        int i13 = i12 & (-67108864);
        int iAddMergedType = 4194304;
        if (i13 == 0 && (i12 & KIND_MASK) != REFERENCE_KIND) {
            if (i12 != NULL || ((i10 & (-67108864)) == 0 && (i10 & KIND_MASK) != REFERENCE_KIND)) {
                i10 = 4194304;
            }
            iAddMergedType = i10;
        } else {
            if (i10 == NULL) {
                return false;
            }
            if ((i10 & (-4194304)) != ((-4194304) & i12)) {
                int i14 = i10 & (-67108864);
                if (i14 != 0 || (i10 & KIND_MASK) == REFERENCE_KIND) {
                    if (i14 != 0 && (i10 & KIND_MASK) != REFERENCE_KIND) {
                        i14 -= 67108864;
                    }
                    if (i13 != 0 && (i12 & KIND_MASK) != REFERENCE_KIND) {
                        i13 -= 67108864;
                    }
                    iMin = Math.min(i14, i13) | REFERENCE_KIND;
                    iAddType = symbolTable.addType(ASMUtils.TYPE_OBJECT);
                    iAddMergedType = iMin | iAddType;
                }
            } else if ((i12 & KIND_MASK) == REFERENCE_KIND) {
                iAddMergedType = (i10 & (-67108864)) | REFERENCE_KIND | symbolTable.addMergedType(i10 & VALUE_MASK, VALUE_MASK & i12);
            } else {
                iMin = ((i10 & (-67108864)) - 67108864) | REFERENCE_KIND;
                iAddType = symbolTable.addType(ASMUtils.TYPE_OBJECT);
                iAddMergedType = iMin | iAddType;
            }
        }
        if (iAddMergedType == i12) {
            return false;
        }
        iArr[i11] = iAddMergedType;
        return true;
    }

    private void push(int i10) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s10 = this.outputStackTop;
        if (s10 >= length) {
            int[] iArr = new int[Math.max(s10 + 1, length * 2)];
            System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s11 = this.outputStackTop;
        short s12 = (short) (s11 + 1);
        this.outputStackTop = s12;
        iArr2[s11] = i10;
        short s13 = (short) (this.outputStackStart + s12);
        Label label = this.owner;
        if (s13 > label.outputStackMax) {
            label.outputStackMax = s13;
        }
    }
}
