package bsh.org.objectweb.asm;

import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;
import p136j8.C2104o;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 268435456;
    private static final int BOOLEAN = 16777225;
    private static final int BYTE = 16777226;
    private static final int CHAR = 16777227;
    static final int CHOP_FRAME = 248;
    private static final int CONSTANT_KIND = 16777216;
    private static final int DIM_MASK = -268435456;
    private static final int DIM_SHIFT = 28;
    private static final int DOUBLE = 16777219;
    private static final int ELEMENT_OF = -268435456;
    private static final int FLAGS_MASK = 15728640;
    private static final int FLOAT = 16777218;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 16777217;
    private static final int ITEM_ASM_BOOLEAN = 9;
    private static final int ITEM_ASM_BYTE = 10;
    private static final int ITEM_ASM_CHAR = 11;
    private static final int ITEM_ASM_SHORT = 12;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_TOP = 0;
    static final int ITEM_UNINITIALIZED = 8;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    private static final int KIND_MASK = 251658240;
    private static final int LOCAL_KIND = 67108864;
    private static final int LONG = 16777220;
    private static final int NULL = 16777221;
    private static final int REFERENCE_KIND = 33554432;
    static final int RESERVED = 128;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 16777228;
    private static final int STACK_KIND = 83886080;
    private static final int TOP = 16777216;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    private static final int UNINITIALIZED_KIND = 50331648;
    private static final int UNINITIALIZED_THIS = 16777222;
    private static final int VALUE_MASK = 1048575;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    Label owner;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Frame(Label label) {
        this.owner = label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void addInitializedType(int i9) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i10 = this.initializationCount;
        if (i10 >= length) {
            int[] iArr = new int[Math.max(i10 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i11 = this.initializationCount;
        this.initializationCount = i11 + 1;
        iArr2[i11] = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getAbstractTypeFromApiFormat(SymbolTable symbolTable, Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : obj instanceof String ? getAbstractTypeFromDescriptor(symbolTable, Type.getObjectType((String) obj).getDescriptor(), 0) : symbolTable.addUninitializedType(HttpUrl.FRAGMENT_ENCODE_SET, ((Label) obj).bytecodeOffset) | UNINITIALIZED_KIND;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static int getAbstractTypeFromDescriptor(SymbolTable symbolTable, String str, int i9) {
        int iAddType;
        char cCharAt = str.charAt(i9);
        if (cCharAt == 'F') {
            return FLOAT;
        }
        if (cCharAt == 'L') {
            return symbolTable.addType(AbstractC4855en.m9262f(1, i9 + 1, str)) | REFERENCE_KIND;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return LONG;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i10 = i9 + 1;
                        while (str.charAt(i10) == '[') {
                            i10++;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 == 'F') {
                            iAddType = FLOAT;
                        } else if (cCharAt2 == 'L') {
                            iAddType = symbolTable.addType(AbstractC4855en.m9262f(1, i10 + 1, str)) | REFERENCE_KIND;
                        } else if (cCharAt2 == 'S') {
                            iAddType = SHORT;
                        } else if (cCharAt2 == 'Z') {
                            iAddType = BOOLEAN;
                        } else if (cCharAt2 == 'I') {
                            iAddType = INTEGER;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iAddType = BYTE;
                                    break;
                                case 'C':
                                    iAddType = CHAR;
                                    break;
                                case 'D':
                                    iAddType = DOUBLE;
                                    break;
                                default:
                                    C2104o.m5289o();
                                    return 0;
                            }
                        } else {
                            iAddType = LONG;
                        }
                        return ((i10 - i9) << 28) | iAddType;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return DOUBLE;
                        default:
                            C2104o.m5289o();
                            return 0;
                    }
                }
            }
        }
        return INTEGER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getAbstractTypeFromInternalName(SymbolTable symbolTable, String str) {
        return symbolTable.addType(str) | REFERENCE_KIND;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getInitializedType(SymbolTable symbolTable, int i9) {
        int i10;
        if (i9 == UNINITIALIZED_THIS || ((-16777216) & i9) == UNINITIALIZED_KIND) {
            for (int i11 = 0; i11 < this.initializationCount; i11++) {
                int i12 = this.initializations[i11];
                int i13 = (-268435456) & i12;
                int i14 = KIND_MASK & i12;
                int i15 = i12 & VALUE_MASK;
                if (i14 == LOCAL_KIND) {
                    i10 = this.inputLocals[i15];
                } else {
                    if (i14 == STACK_KIND) {
                        int[] iArr = this.inputStack;
                        i10 = iArr[iArr.length - i15];
                    }
                    if (i9 != i12) {
                        return (i9 == UNINITIALIZED_THIS ? symbolTable.addType(symbolTable.getClassName()) : symbolTable.addType(symbolTable.getType(i9 & VALUE_MASK).value)) | REFERENCE_KIND;
                    }
                }
                i12 = i10 + i13;
                if (i9 != i12) {
                }
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getLocal(int i9) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i9 >= iArr.length) {
            return i9 | LOCAL_KIND;
        }
        int i10 = iArr[i9];
        if (i10 != 0) {
            return i10;
        }
        int i11 = LOCAL_KIND | i9;
        iArr[i9] = i11;
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void push(int i9) {
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
        iArr2[s11] = i9;
        short s13 = (short) (this.outputStackStart + s12);
        Label label = this.owner;
        if (s13 > label.outputStackMax) {
            label.outputStackMax = s13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void putAbstractType(SymbolTable symbolTable, int i9, ByteVector byteVector) {
        int i10 = ((-268435456) & i9) >> 28;
        if (i10 == 0) {
            int i11 = i9 & VALUE_MASK;
            int i12 = i9 & KIND_MASK;
            if (i12 == 16777216) {
                byteVector.putByte(i11);
                return;
            } else if (i12 == REFERENCE_KIND) {
                byteVector.putByte(7).putShort(symbolTable.addConstantClass(symbolTable.getType(i11).value).index);
                return;
            } else {
                if (i12 != UNINITIALIZED_KIND) {
                    throw new AssertionError();
                }
                byteVector.putByte(8).putShort((int) symbolTable.getType(i11).data);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            sb2.append('[');
            i10 = i13;
        }
        if ((i9 & KIND_MASK) == REFERENCE_KIND) {
            sb2.append('L');
            sb2.append(symbolTable.getType(i9 & VALUE_MASK).value);
            sb2.append(';');
        } else {
            int i14 = i9 & VALUE_MASK;
            if (i14 == 1) {
                sb2.append('I');
            } else if (i14 == 2) {
                sb2.append('F');
            } else if (i14 == 3) {
                sb2.append('D');
            } else if (i14 != 4) {
                switch (i14) {
                    case 9:
                        sb2.append('Z');
                        break;
                    case 10:
                        sb2.append('B');
                        break;
                    case 11:
                        sb2.append('C');
                        break;
                    case 12:
                        sb2.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb2.append('J');
            }
        }
        byteVector.putByte(7).putShort(symbolTable.addConstantClass(sb2.toString()).index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setLocal(int i9, int i10) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i9 >= length) {
            int[] iArr = new int[Math.max(i9 + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i9] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i10 >= iArr.length) {
                break;
            }
            int i14 = iArr[i10];
            if (i14 != LONG && i14 != DOUBLE) {
                i13 = 1;
            }
            i10 += i13;
            if (i14 == 16777216) {
                i12++;
            } else {
                i11 += i12 + 1;
                i12 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i15 = 0;
        int i16 = 0;
        while (i15 < iArr2.length) {
            int i17 = iArr2[i15];
            i15 += (i17 == LONG || i17 == DOUBLE) ? 2 : 1;
            i16++;
        }
        int iVisitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i11, i16);
        int i18 = 0;
        while (true) {
            int i19 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            int i20 = iArr[i18];
            i18 += (i20 == LONG || i20 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i20);
            i11 = i19;
            iVisitFrameStart++;
        }
        while (true) {
            int i21 = i16 - 1;
            if (i16 <= 0) {
                methodWriter.visitFrameEnd();
                return;
            }
            int i22 = iArr2[i9];
            i9 += (i22 == LONG || i22 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i22);
            iVisitFrameStart++;
            i16 = i21;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void copyFrom(Frame frame) {
        this.inputLocals = frame.inputLocals;
        this.inputStack = frame.inputStack;
        this.outputStackStart = (short) 0;
        this.outputLocals = frame.outputLocals;
        this.outputStack = frame.outputStack;
        this.outputStackTop = frame.outputStackTop;
        this.initializationCount = frame.initializationCount;
        this.initializations = frame.initializations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void execute(int i9, int i10, Symbol symbol, SymbolTable symbolTable) {
        switch (i9) {
            case 0:
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
            case 17:
                push(INTEGER);
                return;
            case 9:
            case 10:
                push(LONG);
                push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case 11:
            case 12:
            case 13:
                push(FLOAT);
                return;
            case 14:
            case 15:
                push(DOUBLE);
                push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                return;
            case 18:
                int i11 = symbol.tag;
                switch (i11) {
                    case 3:
                        push(INTEGER);
                        return;
                    case 4:
                        push(FLOAT);
                        return;
                    case 5:
                        push(LONG);
                        push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 6:
                        push(DOUBLE);
                        push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                        return;
                    case 7:
                        push(symbolTable.addType("java/lang/Class") | REFERENCE_KIND);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | REFERENCE_KIND);
                        return;
                    default:
                        switch (i11) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | REFERENCE_KIND);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | REFERENCE_KIND);
                                return;
                            case 17:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i9) {
                    case 21:
                        break;
                    case 22:
                        break;
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        push(getLocal(i10));
                        return;
                    default:
                        switch (i9) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                pop(2);
                                push(INTEGER);
                                return;
                            case 47:
                                pop(2);
                                push(LONG);
                                push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case 48:
                                pop(2);
                                push(FLOAT);
                                return;
                            case 49:
                                pop(2);
                                push(DOUBLE);
                                push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                return;
                            case 50:
                                pop(1);
                                int iPop = pop();
                                if (iPop != NULL) {
                                    iPop -= 268435456;
                                }
                                push(iPop);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                setLocal(i10, pop());
                                if (i10 > 0) {
                                    int i12 = i10 - 1;
                                    int local = getLocal(i12);
                                    if (local == LONG || local == DOUBLE) {
                                        setLocal(i12, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i13 = local & KIND_MASK;
                                    if (i13 == LOCAL_KIND || i13 == STACK_KIND) {
                                        setLocal(i12, local | TOP_IF_LONG_OR_DOUBLE_FLAG);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                pop(1);
                                setLocal(i10, pop());
                                setLocal(i10 + 1, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                if (i10 > 0) {
                                    int i14 = i10 - 1;
                                    int local2 = getLocal(i14);
                                    if (local2 == LONG || local2 == DOUBLE) {
                                        setLocal(i14, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    }
                                    int i15 = local2 & KIND_MASK;
                                    if (i15 == LOCAL_KIND || i15 == STACK_KIND) {
                                        setLocal(i14, local2 | TOP_IF_LONG_OR_DOUBLE_FLAG);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i9) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        pop(3);
                                        return;
                                    case 80:
                                    case 82:
                                        pop(4);
                                        return;
                                    case 87:
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
                                        break;
                                    case 88:
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
                                    case 89:
                                        int iPop2 = pop();
                                        push(iPop2);
                                        push(iPop2);
                                        return;
                                    case 90:
                                        int iPop3 = pop();
                                        int iPop4 = pop();
                                        push(iPop3);
                                        push(iPop4);
                                        push(iPop3);
                                        return;
                                    case 91:
                                        int iPop5 = pop();
                                        int iPop6 = pop();
                                        int iPop7 = pop();
                                        push(iPop5);
                                        push(iPop7);
                                        push(iPop6);
                                        push(iPop5);
                                        return;
                                    case 92:
                                        int iPop8 = pop();
                                        int iPop9 = pop();
                                        push(iPop9);
                                        push(iPop8);
                                        push(iPop9);
                                        push(iPop8);
                                        return;
                                    case 93:
                                        int iPop10 = pop();
                                        int iPop11 = pop();
                                        int iPop12 = pop();
                                        push(iPop11);
                                        push(iPop10);
                                        push(iPop12);
                                        push(iPop11);
                                        push(iPop10);
                                        return;
                                    case 94:
                                        int iPop13 = pop();
                                        int iPop14 = pop();
                                        int iPop15 = pop();
                                        int iPop16 = pop();
                                        push(iPop14);
                                        push(iPop13);
                                        push(iPop16);
                                        push(iPop15);
                                        push(iPop14);
                                        push(iPop13);
                                        return;
                                    case 95:
                                        int iPop17 = pop();
                                        int iPop18 = pop();
                                        push(iPop17);
                                        push(iPop18);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case 131:
                                        pop(4);
                                        push(LONG);
                                        push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case 137:
                                    case 144:
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        pop(4);
                                        push(DOUBLE);
                                        push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case Opcodes.GOTO /* 167 */:
                                    case Opcodes.RETURN /* 177 */:
                                        return;
                                    case 121:
                                    case 123:
                                    case 125:
                                        pop(3);
                                        push(LONG);
                                        push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 132:
                                        setLocal(i10, INTEGER);
                                        return;
                                    case 133:
                                    case 140:
                                        pop(1);
                                        push(LONG);
                                        push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 134:
                                        pop(1);
                                        push(FLOAT);
                                        return;
                                    case 135:
                                    case 141:
                                        pop(1);
                                        push(DOUBLE);
                                        push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                                        return;
                                    case 138:
                                        break;
                                    case 139:
                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        pop(1);
                                        push(INTEGER);
                                        return;
                                    case 143:
                                        break;
                                    case 148:
                                    case 151:
                                    case 152:
                                        pop(4);
                                        push(INTEGER);
                                        return;
                                    case Opcodes.JSR /* 168 */:
                                    case Opcodes.RET /* 169 */:
                                        C2104o.m5294t("JSR/RET are not supported with computeFrames option");
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
                                        if (i9 != 184) {
                                            int iPop19 = pop();
                                            if (i9 == 183 && symbol.name.charAt(0) == '<') {
                                                addInitializedType(iPop19);
                                            }
                                        }
                                        push(symbolTable, symbol.value);
                                        return;
                                    case Opcodes.INVOKEDYNAMIC /* 186 */:
                                        pop(symbol.value);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case Opcodes.NEW /* 187 */:
                                        push(symbolTable.addUninitializedType(symbol.value, i10) | UNINITIALIZED_KIND);
                                        return;
                                    case Opcodes.NEWARRAY /* 188 */:
                                        pop();
                                        switch (i10) {
                                            case 4:
                                                push(285212681);
                                                return;
                                            case 5:
                                                push(285212683);
                                                return;
                                            case 6:
                                                push(285212674);
                                                return;
                                            case 7:
                                                push(285212675);
                                                return;
                                            case 8:
                                                push(285212682);
                                                return;
                                            case 9:
                                                push(285212684);
                                                return;
                                            case 10:
                                                push(285212673);
                                                return;
                                            case 11:
                                                push(285212676);
                                                return;
                                            default:
                                                C2104o.m5289o();
                                                return;
                                        }
                                    case Opcodes.ANEWARRAY /* 189 */:
                                        String str = symbol.value;
                                        pop();
                                        if (str.charAt(0) == '[') {
                                            push(symbolTable, "[".concat(str));
                                            return;
                                        } else {
                                            push(symbolTable.addType(str) | 301989888);
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
                                    default:
                                        switch (i9) {
                                            case Opcodes.MULTIANEWARRAY /* 197 */:
                                                pop(i10);
                                                push(symbolTable, symbol.value);
                                                return;
                                            case Opcodes.IFNULL /* 198 */:
                                            case Opcodes.IFNONNULL /* 199 */:
                                                break;
                                            default:
                                                C2104o.m5289o();
                                                return;
                                        }
                                        break;
                                }
                                pop(1);
                                return;
                        }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInputStackSize() {
        return this.inputStack.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa A[PHI: r6
  0x00fa: PHI (r6v8 int) = (r6v7 int), (r6v7 int), (r6v11 int), (r6v11 int) binds: [B:69:0x0109, B:71:0x010d, B:62:0x00f1, B:64:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean merge(SymbolTable symbolTable, Frame frame, int i9) {
        boolean zMerge;
        int i10;
        int initializedType;
        int i11;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean zMerge2 = true;
        if (frame.inputLocals == null) {
            frame.inputLocals = new int[length];
            zMerge = true;
        } else {
            zMerge = false;
        }
        int i12 = 0;
        while (i12 < length) {
            int[] iArr = this.outputLocals;
            if (iArr == null || i12 >= iArr.length || (i11 = iArr[i12]) == 0) {
                initializedType = this.inputLocals[i12];
            } else {
                int i13 = i11 & (-268435456);
                int i14 = i11 & KIND_MASK;
                if (i14 == LOCAL_KIND) {
                    initializedType = i13 + this.inputLocals[i11 & VALUE_MASK];
                    if ((i11 & TOP_IF_LONG_OR_DOUBLE_FLAG) != 0 && (initializedType == LONG || initializedType == DOUBLE)) {
                        initializedType = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                    }
                } else if (i14 == STACK_KIND) {
                    initializedType = i13 + this.inputStack[length2 - (i11 & VALUE_MASK)];
                    if ((i11 & TOP_IF_LONG_OR_DOUBLE_FLAG) != 0 && (initializedType == LONG || initializedType == DOUBLE)) {
                    }
                } else {
                    initializedType = i11;
                }
            }
            if (this.initializations != null) {
                initializedType = getInitializedType(symbolTable, initializedType);
            }
            zMerge |= merge(symbolTable, initializedType, frame.inputLocals, i12);
            i12++;
        }
        if (i9 > 0) {
            for (int i15 = 0; i15 < length; i15++) {
                zMerge |= merge(symbolTable, this.inputLocals[i15], frame.inputLocals, i15);
            }
            if (frame.inputStack == null) {
                frame.inputStack = new int[1];
            } else {
                zMerge2 = zMerge;
            }
            return merge(symbolTable, i9, frame.inputStack, 0) | zMerge2;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            zMerge2 = zMerge;
        }
        for (int i16 = 0; i16 < length3; i16++) {
            int initializedType2 = this.inputStack[i16];
            if (this.initializations != null) {
                initializedType2 = getInitializedType(symbolTable, initializedType2);
            }
            zMerge2 |= merge(symbolTable, initializedType2, frame.inputStack, i16);
        }
        for (int i17 = 0; i17 < this.outputStackTop; i17++) {
            int initializedType3 = this.outputStack[i17];
            int i18 = initializedType3 & (-268435456);
            int i19 = initializedType3 & KIND_MASK;
            if (i19 == LOCAL_KIND) {
                i10 = i18 + this.inputLocals[initializedType3 & VALUE_MASK];
                initializedType3 = ((initializedType3 & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || !(i10 == LONG || i10 == DOUBLE)) ? i10 : Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            } else if (i19 == STACK_KIND) {
                i10 = i18 + this.inputStack[length2 - (initializedType3 & VALUE_MASK)];
                if ((initializedType3 & TOP_IF_LONG_OR_DOUBLE_FLAG) == 0 || (i10 != LONG && i10 != DOUBLE)) {
                }
            }
            if (this.initializations != null) {
                initializedType3 = getInitializedType(symbolTable, initializedType3);
            }
            zMerge2 |= merge(symbolTable, initializedType3, frame.inputStack, length3 + i17);
        }
        return zMerge2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setInputFrameFromApiFormat(SymbolTable symbolTable, int i9, Object[] objArr, int i10, Object[] objArr2) {
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = i11 + 1;
            this.inputLocals[i11] = getAbstractTypeFromApiFormat(symbolTable, objArr[i12]);
            Object obj = objArr[i12];
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                i11 += 2;
                this.inputLocals[i13] = 16777216;
            } else {
                i11 = i13;
            }
        }
        while (true) {
            int[] iArr = this.inputLocals;
            if (i11 >= iArr.length) {
                break;
            }
            iArr[i11] = 16777216;
            i11++;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            Object obj2 = objArr2[i15];
            if (obj2 == Opcodes.LONG || obj2 == Opcodes.DOUBLE) {
                i14++;
            }
        }
        this.inputStack = new int[i14 + i10];
        int i16 = 0;
        for (int i17 = 0; i17 < i10; i17++) {
            int i18 = i16 + 1;
            this.inputStack[i16] = getAbstractTypeFromApiFormat(symbolTable, objArr2[i17]);
            Object obj3 = objArr2[i17];
            if (obj3 == Opcodes.LONG || obj3 == Opcodes.DOUBLE) {
                i16 += 2;
                this.inputStack[i18] = 16777216;
            } else {
                i16 = i18;
            }
        }
        this.outputStackTop = (short) 0;
        this.initializationCount = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i9, String str, int i10) {
        int i11;
        int[] iArr = new int[i10];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i9 & 8) == 0) {
            i11 = 1;
            if ((i9 & Opcodes.ASM4) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.getClassName()) | REFERENCE_KIND;
            } else {
                iArr[0] = UNINITIALIZED_THIS;
            }
        } else {
            i11 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i12 = i11 + 1;
            iArr2[i11] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                i11 += 2;
                iArr2[i12] = 16777216;
            } else {
                i11 = i12;
            }
        }
        while (i11 < i10) {
            this.inputLocals[i11] = 16777216;
            i11++;
        }
    }

    private void pop(int i9) {
        short s10 = this.outputStackTop;
        if (s10 >= i9) {
            this.outputStackTop = (short) (s10 - i9);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i9 - s10));
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

    private void push(SymbolTable symbolTable, String str) {
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                push(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
        }
    }

    private static boolean merge(SymbolTable symbolTable, int i9, int[] iArr, int i10) {
        int iMin;
        int iAddType;
        int i11 = iArr[i10];
        if (i11 == i9) {
            return false;
        }
        if ((268435455 & i9) == NULL) {
            if (i11 == NULL) {
                return false;
            }
            i9 = NULL;
        }
        if (i11 == 0) {
            iArr[i10] = i9;
            return true;
        }
        int i12 = i11 & (-268435456);
        int iAddMergedType = Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        if (i12 != 0 || (i11 & KIND_MASK) == REFERENCE_KIND) {
            if (i9 == NULL) {
                return false;
            }
            if ((i9 & (-16777216)) != ((-16777216) & i11)) {
                int i13 = i9 & (-268435456);
                if (i13 != 0 || (i9 & KIND_MASK) == REFERENCE_KIND) {
                    if (i13 != 0 && (i9 & KIND_MASK) != REFERENCE_KIND) {
                        i13 -= 268435456;
                    }
                    if (i12 != 0 && (i11 & KIND_MASK) != REFERENCE_KIND) {
                        i12 -= 268435456;
                    }
                    iMin = Math.min(i13, i12) | REFERENCE_KIND;
                    iAddType = symbolTable.addType("java/lang/Object");
                    iAddMergedType = iMin | iAddType;
                }
            } else if ((i11 & KIND_MASK) == REFERENCE_KIND) {
                iAddMergedType = (i9 & (-268435456)) | REFERENCE_KIND | symbolTable.addMergedType(i9 & VALUE_MASK, VALUE_MASK & i11);
            } else {
                iMin = ((i9 & (-268435456)) - 268435456) | REFERENCE_KIND;
                iAddType = symbolTable.addType("java/lang/Object");
                iAddMergedType = iMin | iAddType;
            }
        } else if (i11 == NULL) {
            if ((i9 & (-268435456)) == 0 && (i9 & KIND_MASK) != REFERENCE_KIND) {
                i9 = 16777216;
            }
            iAddMergedType = i9;
        }
        if (iAddMergedType == i11) {
            return false;
        }
        iArr[i10] = iAddMergedType;
        return true;
    }
}
