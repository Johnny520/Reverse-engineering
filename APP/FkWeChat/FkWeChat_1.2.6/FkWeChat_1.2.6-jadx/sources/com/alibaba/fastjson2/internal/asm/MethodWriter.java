package com.alibaba.fastjson2.internal.asm;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import p215oc.C5725t;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class MethodWriter {
    private final int accessFlags;
    private final ByteVector code;
    private Label currentBasicBlock;
    private int[] currentFrame;
    private final String descriptor;
    private final int descriptorIndex;
    private final Label firstBasicBlock;
    boolean hasAsmInstructions;
    private Label lastBasicBlock;
    private int lastBytecodeOffset;
    private int maxLocals;
    private int maxStack;

    /* JADX INFO: renamed from: mv */
    MethodWriter f4559mv;
    private final String name;
    private final int nameIndex;
    private int[] previousFrame;
    private ByteVector stackMapTableEntries;
    int stackMapTableNumberOfEntries;
    private final SymbolTable symbolTable;

    public MethodWriter(SymbolTable symbolTable, int i10, String str, String str2, int i11) {
        this.symbolTable = symbolTable;
        this.accessFlags = "<init>".equals(str) ? 262144 | i10 : i10;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.name = str;
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        this.descriptor = str2;
        this.code = new ByteVector(i11);
        int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2) >> 2;
        this.maxLocals = (i10 & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
        Label label = new Label();
        this.firstBasicBlock = label;
        visitLabel(label);
    }

    private void addSuccessorToCurrentBasicBlock(Label label) {
        Label label2 = this.currentBasicBlock;
        label2.outgoingEdges = new Edge(label, label2.outgoingEdges);
    }

    private void endCurrentBasicBlockWithNoSuccessor() {
        Label label = new Label();
        label.frame = new Frame(label);
        ByteVector byteVector = this.code;
        label.resolve(byteVector.data, byteVector.length);
        this.lastBasicBlock.nextBasicBlock = label;
        this.lastBasicBlock = label;
        this.currentBasicBlock = null;
    }

    private void putAbstractTypes(int i10, int i11) {
        while (i10 < i11) {
            int i12 = this.currentFrame[i10];
            ByteVector byteVector = this.stackMapTableEntries;
            int i13 = ((-67108864) & i12) >> 26;
            if (i13 == 0) {
                int i14 = i12 & 1048575;
                int i15 = i12 & 62914560;
                if (i15 == 4194304) {
                    byteVector.putByte(i14);
                } else if (i15 == 8388608) {
                    ByteVector byteVectorPutByte = byteVector.putByte(7);
                    SymbolTable symbolTable = this.symbolTable;
                    byteVectorPutByte.putShort(symbolTable.addConstantUtf8Reference(7, symbolTable.typeTable[i14].value).index);
                } else {
                    if (i15 != 12582912) {
                        throw new AssertionError();
                    }
                    byteVector.putByte(8).putShort((int) this.symbolTable.typeTable[i14].data);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int i16 = i13 - 1;
                    if (i13 > 0) {
                        sb2.append('[');
                        i13 = i16;
                    } else {
                        if ((i12 & 62914560) == 8388608) {
                            sb2.append('L');
                            sb2.append(this.symbolTable.typeTable[i12 & 1048575].value);
                            sb2.append(';');
                        } else {
                            int i17 = i12 & 1048575;
                            if (i17 == 1) {
                                sb2.append('I');
                            } else if (i17 == 2) {
                                sb2.append('F');
                            } else if (i17 == 3) {
                                sb2.append('D');
                            } else if (i17 != 4) {
                                switch (i17) {
                                    case 9:
                                        sb2.append('Z');
                                        break;
                                    case 10:
                                        sb2.append('B');
                                        break;
                                    case Opcodes.FCONST_0 /* 11 */:
                                        sb2.append('C');
                                        break;
                                    case Opcodes.FCONST_1 /* 12 */:
                                        sb2.append('S');
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                            } else {
                                sb2.append('J');
                            }
                        }
                        byteVector.putByte(7).putShort(this.symbolTable.addConstantUtf8Reference(7, sb2.toString()).index);
                    }
                }
            }
            i10++;
        }
    }

    private void putFrame() {
        char c10;
        int i10;
        int[] iArr = this.currentFrame;
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = this.stackMapTableNumberOfEntries == 0 ? iArr[0] : (iArr[0] - this.previousFrame[0]) - 1;
        int i14 = this.previousFrame[1];
        int i15 = i11 - i14;
        if (i12 == 0) {
            switch (i15) {
                case -3:
                case -2:
                case -1:
                    c10 = 248;
                    break;
                case 0:
                    c10 = i13 < 64 ? (char) 0 : (char) 251;
                    break;
                case 1:
                case 2:
                case 3:
                    c10 = 252;
                    break;
                default:
                    c10 = 255;
                    break;
            }
        } else {
            c10 = (i15 == 0 && i12 == 1) ? i13 < 63 ? '@' : (char) 247 : (char) 255;
        }
        if (c10 != 255) {
            int i16 = 3;
            for (int i17 = 0; i17 < i14 && i17 < i11; i17++) {
                i10 = 3;
                if (this.currentFrame[i16] != this.previousFrame[i16]) {
                    c10 = 255;
                } else {
                    i16++;
                }
            }
            i10 = 3;
        } else {
            i10 = 3;
        }
        if (c10 == 0) {
            this.stackMapTableEntries.putByte(i13);
            return;
        }
        if (c10 == '@') {
            this.stackMapTableEntries.putByte(i13 + 64);
            putAbstractTypes(i11 + 3, i11 + 4);
            return;
        }
        if (c10 == 247) {
            this.stackMapTableEntries.putByte(247).putShort(i13);
            putAbstractTypes(i11 + 3, i11 + 4);
            return;
        }
        if (c10 == 248) {
            this.stackMapTableEntries.putByte(i15 + 251).putShort(i13);
            return;
        }
        if (c10 == 251) {
            this.stackMapTableEntries.putByte(251).putShort(i13);
            return;
        }
        ByteVector byteVector = this.stackMapTableEntries;
        if (c10 == 252) {
            int i18 = i10;
            byteVector.putByte(i15 + 251).putShort(i13);
            putAbstractTypes(i14 + i18, i11 + i18);
        } else {
            byteVector.putByte(255).putShort(i13).putShort(i11);
            int i19 = i11 + 3;
            putAbstractTypes(i10, i19);
            this.stackMapTableEntries.putShort(i12);
            putAbstractTypes(i19, i12 + i19);
        }
    }

    private void visitFieldInsn(int i10, String str, String str2, String str3) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantMemberReference = this.symbolTable.addConstantMemberReference(9, str, str2, str3);
        this.code.put12(i10, symbolAddConstantMemberReference.index);
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(i10, 0, symbolAddConstantMemberReference, this.symbolTable);
        }
    }

    private void visitInsn(int i10) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(i10);
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(i10, 0, null, null);
            if ((i10 < 172 || i10 > 177) && i10 != 191) {
                return;
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    private void visitIntInsn(int i10, int i11) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i10 == 17) {
            byteVector.put12(i10, i11);
        } else {
            byteVector.put11(i10, i11);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(i10, i11, null, null);
        }
    }

    private void visitJumpInsn(int i10, Label label) {
        boolean z10;
        ByteVector byteVector = this.code;
        int i11 = byteVector.length;
        this.lastBytecodeOffset = i11;
        int i12 = i10 >= 200 ? i10 - 33 : i10;
        if ((label.flags & 4) == 0 || label.bytecodeOffset - i11 >= -32768) {
            if (i12 != i10) {
                byteVector.putByte(i10);
                ByteVector byteVector2 = this.code;
                label.put(byteVector2, byteVector2.length - 1, true);
            } else {
                byteVector.putByte(i12);
                ByteVector byteVector3 = this.code;
                label.put(byteVector3, byteVector3.length - 1, false);
            }
            z10 = false;
        } else {
            if (i12 == 167) {
                byteVector.putByte(200);
            } else if (i12 == 168) {
                byteVector.putByte(201);
            } else {
                byteVector.putByte(i12 >= 198 ? i12 ^ 1 : ((i12 + 1) ^ 1) - 1);
                this.code.putShort(8);
                this.code.putByte(220);
                this.hasAsmInstructions = true;
                z10 = true;
                ByteVector byteVector4 = this.code;
                label.put(byteVector4, byteVector4.length - 1, true);
            }
            z10 = false;
            ByteVector byteVector42 = this.code;
            label.put(byteVector42, byteVector42.length - 1, true);
        }
        Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            label2.frame.execute(i12, 0, null, null);
            Label canonicalInstance = label.getCanonicalInstance();
            canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
            addSuccessorToCurrentBasicBlock(label);
            Label label3 = i12 != 167 ? new Label() : null;
            if (label3 != null) {
                if (z10) {
                    label3.flags = (short) (label3.flags | 2);
                }
                visitLabel(label3);
            }
            if (i12 == 167) {
                endCurrentBasicBlockWithNoSuccessor();
            }
        }
    }

    private void visitMethodInsn(int i10, String str, String str2, String str3, boolean z10) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantMemberReference = this.symbolTable.addConstantMemberReference(z10 ? 11 : 10, str, str2, str3);
        ByteVector byteVector = this.code;
        if (i10 == 185) {
            byteVector.put12(Opcodes.INVOKEINTERFACE, symbolAddConstantMemberReference.index).put11(symbolAddConstantMemberReference.getArgumentsAndReturnSizes() >> 2, 0);
        } else {
            byteVector.put12(i10, symbolAddConstantMemberReference.index);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(i10, 0, symbolAddConstantMemberReference, this.symbolTable);
        }
    }

    private void visitSwitchInsn(Label label, Label[] labelArr) {
        Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            label2.frame.execute(Opcodes.LOOKUPSWITCH, 0, null, null);
            addSuccessorToCurrentBasicBlock(label);
            Label canonicalInstance = label.getCanonicalInstance();
            canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
            for (Label label3 : labelArr) {
                addSuccessorToCurrentBasicBlock(label3);
                Label canonicalInstance2 = label3.getCanonicalInstance();
                canonicalInstance2.flags = (short) (canonicalInstance2.flags | 2);
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    private void visitTypeInsn(int i10, String str) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantUtf8Reference = this.symbolTable.addConstantUtf8Reference(7, str);
        this.code.put12(i10, symbolAddConstantUtf8Reference.index);
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(i10, this.lastBytecodeOffset, symbolAddConstantUtf8Reference, this.symbolTable);
        }
    }

    public void aaload() {
        visitInsn(50);
    }

    public void aastore() {
        visitInsn(83);
    }

    public void aconst_null() {
        visitInsn(1);
    }

    public void aload(int i10) {
        visitVarInsn(25, i10);
    }

    public void anewArray(String str) {
        visitTypeInsn(Opcodes.ANEWARRAY, str);
    }

    public void areturn() {
        visitInsn(Opcodes.ARETURN);
    }

    public void arraylength() {
        visitInsn(Opcodes.ARRAYLENGTH);
    }

    public void astore(int i10) {
        visitVarInsn(58, i10);
    }

    public void bastore() {
        visitInsn(84);
    }

    public void bipush(int i10) {
        visitIntInsn(16, i10);
    }

    public void castore() {
        visitInsn(85);
    }

    public void checkcast(String str) {
        visitTypeInsn(Opcodes.CHECKCAST, str);
    }

    public void cmpWithZero(Class<?> cls) {
        if (cls == Long.TYPE) {
            visitInsn(9);
            visitInsn(Opcodes.LCMP);
        } else if (cls == Double.TYPE) {
            visitInsn(14);
            visitInsn(Opcodes.DCMPL);
        } else if (cls == Float.TYPE) {
            visitInsn(11);
            visitInsn(Opcodes.FCMPL);
        }
    }

    public int computeMethodInfoSize() {
        int i10 = this.code.length;
        if (i10 <= 0) {
            return 8;
        }
        SymbolTable symbolTable = this.symbolTable;
        if (i10 <= 65535) {
            symbolTable.addConstantUtf8("Code");
            int i11 = this.code.length + 26;
            if (this.stackMapTableEntries == null) {
                return i11;
            }
            this.symbolTable.addConstantUtf8("StackMapTable");
            return i11 + this.stackMapTableEntries.length + 8;
        }
        throw new JSONException("Method too large: " + symbolTable.className + "." + this.name + " " + this.descriptor + ", length " + this.code.length);
    }

    public void dstore(int i10) {
        visitVarInsn(57, i10);
    }

    public void dup(Class<?> cls) {
        if (cls == Long.TYPE || cls == Double.TYPE) {
            visitInsn(92);
        } else {
            visitInsn(89);
        }
    }

    public void dup2() {
        visitInsn(92);
    }

    public void fstore(int i10) {
        visitVarInsn(56, i10);
    }

    public void getfield(String str, String str2, String str3) {
        visitFieldInsn(Opcodes.GETFIELD, str, str2, str3);
    }

    public void getstatic(String str, String str2, String str3) {
        visitFieldInsn(Opcodes.GETSTATIC, str, str2, str3);
    }

    public void goto_(Label label) {
        visitJumpInsn(Opcodes.GOTO, label);
    }

    public void i2d() {
        visitInsn(Opcodes.I2D);
    }

    public void i2f() {
        visitInsn(Opcodes.I2F);
    }

    public void i2l() {
        visitInsn(Opcodes.I2L);
    }

    public void iadd() {
        visitInsn(96);
    }

    public void iconst_0() {
        visitInsn(3);
    }

    public void iconst_1() {
        visitInsn(4);
    }

    public void iconst_2() {
        visitInsn(5);
    }

    public void iconst_3() {
        visitInsn(6);
    }

    public void iconst_4() {
        visitInsn(7);
    }

    public void iconst_5() {
        visitInsn(8);
    }

    public void iconst_m1() {
        visitInsn(2);
    }

    public void iconst_n(int i10) {
        switch (i10) {
            case -1:
                iconst_m1();
                break;
            case 0:
                iconst_0();
                break;
            case 1:
                iconst_1();
                break;
            case 2:
                iconst_2();
                break;
            case 3:
                iconst_3();
                break;
            case 4:
                iconst_4();
                break;
            case 5:
                iconst_5();
                break;
            default:
                if (i10 >= -128 && i10 < 127) {
                    bipush(i10);
                } else if (i10 >= -32768 && i10 < 32767) {
                    sipush(i10);
                } else {
                    visitLdcInsn(i10);
                }
                break;
        }
    }

    public void if_acmpeq(Label label) {
        visitJumpInsn(Opcodes.IF_ACMPEQ, label);
    }

    public void if_acmpne(Label label) {
        visitJumpInsn(Opcodes.IF_ACMPNE, label);
    }

    public void if_icmpeq(Label label) {
        visitJumpInsn(Opcodes.IF_ICMPEQ, label);
    }

    public void if_icmpge(Label label) {
        visitJumpInsn(Opcodes.IF_ICMPGE, label);
    }

    public void if_icmple(Label label) {
        visitJumpInsn(Opcodes.IF_ICMPLE, label);
    }

    public void if_icmpne(Label label) {
        visitJumpInsn(Opcodes.IF_ICMPNE, label);
    }

    public void ifeq(Label label) {
        visitJumpInsn(Opcodes.IFEQ, label);
    }

    public void ifge(Label label) {
        visitJumpInsn(Opcodes.IFGE, label);
    }

    public void ifne(Label label) {
        visitJumpInsn(Opcodes.IFNE, label);
    }

    public void ifnonnull(Label label) {
        visitJumpInsn(Opcodes.IFNONNULL, label);
    }

    public void ifnull(Label label) {
        visitJumpInsn(Opcodes.IFNULL, label);
    }

    public void iload(int i10) {
        visitVarInsn(21, i10);
    }

    public void imul() {
        visitInsn(Opcodes.IMUL);
    }

    public void ineg() {
        visitInsn(Opcodes.INEG);
    }

    public void instanceOf(String str) {
        visitTypeInsn(Opcodes.INSTANCEOF, str);
    }

    public void invokeinterface(String str, String str2, String str3) {
        visitMethodInsn(Opcodes.INVOKEINTERFACE, str, str2, str3, true);
    }

    public void invokespecial(String str, String str2, String str3) {
        visitMethodInsn(Opcodes.INVOKESPECIAL, str, str2, str3, false);
    }

    public void invokestatic(String str, String str2, String str3) {
        visitMethodInsn(Opcodes.INVOKESTATIC, str, str2, str3, false);
    }

    public void invokevirtual(String str, String str2, String str3) {
        visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, str2, str3, false);
    }

    public void ireturn() {
        visitInsn(Opcodes.IRETURN);
    }

    public void istore(int i10) {
        visitVarInsn(54, i10);
    }

    public void isub() {
        visitInsn(100);
    }

    public void ixor() {
        visitInsn(Opcodes.IXOR);
    }

    public void l2i() {
        visitInsn(Opcodes.L2I);
    }

    public void land() {
        visitInsn(127);
    }

    public void lcmp() {
        visitInsn(Opcodes.LCMP);
    }

    public void lconst_0() {
        visitInsn(9);
    }

    public void lload(int i10) {
        visitVarInsn(22, i10);
    }

    public void loadLocal(Class<?> cls, int i10) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            visitVarInsn(21, i10);
            return;
        }
        if (cls == Long.TYPE) {
            visitVarInsn(22, i10);
            return;
        }
        if (cls == Float.TYPE) {
            visitVarInsn(23, i10);
        } else if (cls == Double.TYPE) {
            visitVarInsn(24, i10);
        } else {
            visitVarInsn(25, i10);
        }
    }

    public void lor() {
        visitInsn(Opcodes.LOR);
    }

    public void lstore(int i10) {
        visitVarInsn(55, i10);
    }

    public void lushr() {
        visitInsn(Opcodes.LUSHR);
    }

    public void lxor() {
        visitInsn(Opcodes.LXOR);
    }

    public void new_(String str) {
        visitTypeInsn(Opcodes.NEW, str);
    }

    public void pop() {
        visitInsn(87);
    }

    public void putMethodInfo(ByteVector byteVector) {
        byteVector.putShort(this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        int i10 = 1;
        byteVector.putShort(this.code.length > 0 ? 1 : 0);
        int i11 = this.code.length;
        if (i11 > 0) {
            int i12 = i11 + 12;
            ByteVector byteVector2 = this.stackMapTableEntries;
            if (byteVector2 != null) {
                i12 += byteVector2.length + 8;
            } else {
                i10 = 0;
            }
            ByteVector byteVectorPutInt = byteVector.putShort(this.symbolTable.addConstantUtf8("Code")).putInt(i12).putShort(this.maxStack).putShort(this.maxLocals).putInt(this.code.length);
            ByteVector byteVector3 = this.code;
            byteVectorPutInt.putByteArray(byteVector3.data, 0, byteVector3.length);
            byteVector.putShort(0);
            byteVector.putShort(i10);
            if (this.stackMapTableEntries != null) {
                ByteVector byteVectorPutShort = byteVector.putShort(this.symbolTable.addConstantUtf8("StackMapTable")).putInt(this.stackMapTableEntries.length + 2).putShort(this.stackMapTableNumberOfEntries);
                ByteVector byteVector4 = this.stackMapTableEntries;
                byteVectorPutShort.putByteArray(byteVector4.data, 0, byteVector4.length);
            }
        }
    }

    public void putfield(String str, String str2, String str3) {
        visitFieldInsn(Opcodes.PUTFIELD, str, str2, str3);
    }

    public void return_() {
        visitInsn(Opcodes.RETURN);
    }

    public void sipush(int i10) {
        visitIntInsn(17, i10);
    }

    public void storeLocal(Class<?> cls, int i10) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            visitVarInsn(54, i10);
            return;
        }
        if (cls == Long.TYPE) {
            visitVarInsn(55, i10);
            return;
        }
        if (cls == Float.TYPE) {
            visitVarInsn(56, i10);
        } else if (cls == Double.TYPE) {
            visitVarInsn(57, i10);
        } else {
            visitVarInsn(58, i10);
        }
    }

    public void swap() {
        visitInsn(95);
    }

    public void visitAbstractType(int i10, int i11) {
        this.currentFrame[i10] = i11;
    }

    public void visitFrameEnd() {
        if (this.previousFrame != null) {
            if (this.stackMapTableEntries == null) {
                this.stackMapTableEntries = new ByteVector(2048);
            }
            putFrame();
            this.stackMapTableNumberOfEntries++;
        }
        this.previousFrame = this.currentFrame;
        this.currentFrame = null;
    }

    public int visitFrameStart(int i10, int i11, int i12) {
        int i13 = i11 + 3 + i12;
        int[] iArr = this.currentFrame;
        if (iArr == null || iArr.length < i13) {
            this.currentFrame = new int[i13];
        }
        int[] iArr2 = this.currentFrame;
        iArr2[0] = i10;
        iArr2[1] = i11;
        iArr2[2] = i12;
        return 3;
    }

    public void visitIincInsn(int i10, int i11) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i10 > 255 || i11 > 127 || i11 < -128) {
            byteVector.putByte(196).put12(Opcodes.IINC, i10).putShort(i11);
        } else {
            byteVector.putByte(Opcodes.IINC).put11(i10, i11);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(Opcodes.IINC, i10, null, null);
        }
    }

    public void visitLabel(Label label) {
        boolean z10 = this.hasAsmInstructions;
        ByteVector byteVector = this.code;
        this.hasAsmInstructions = z10 | label.resolve(byteVector.data, byteVector.length);
        short s10 = label.flags;
        if ((s10 & 1) != 0) {
            return;
        }
        Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            if (label.bytecodeOffset == label2.bytecodeOffset) {
                label2.flags = (short) ((s10 & 2) | label2.flags);
                label.frame = label2.frame;
                return;
            }
            addSuccessorToCurrentBasicBlock(label);
        }
        Label label3 = this.lastBasicBlock;
        if (label3 != null) {
            if (label.bytecodeOffset == label3.bytecodeOffset) {
                label3.flags = (short) (label3.flags | (label.flags & 2));
                label.frame = label3.frame;
                this.currentBasicBlock = label3;
                return;
            }
            label3.nextBasicBlock = label;
        }
        this.lastBasicBlock = label;
        this.currentBasicBlock = label;
        label.frame = new Frame(label);
    }

    public void visitLdcInsn(Class cls) {
        String strDesc = ASMUtils.desc(cls);
        Type typeInternal = Type.getTypeInternal(strDesc, 0, strDesc.length());
        this.lastBytecodeOffset = this.code.length;
        int i10 = typeInternal.sort;
        if (i10 == 12) {
            i10 = 10;
        }
        SymbolTable symbolTable = this.symbolTable;
        Symbol symbolAddConstantUtf8Reference = i10 == 10 ? symbolTable.addConstantUtf8Reference(7, typeInternal.valueBuffer.substring(typeInternal.valueBegin, typeInternal.valueEnd)) : symbolTable.addConstantUtf8Reference(7, typeInternal.getDescriptor());
        int i11 = symbolAddConstantUtf8Reference.index;
        ByteVector byteVector = this.code;
        if (i11 >= 256) {
            byteVector.put12(19, i11);
        } else {
            byteVector.put11(18, i11);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(18, 0, symbolAddConstantUtf8Reference, this.symbolTable);
        }
    }

    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(Opcodes.LOOKUPSWITCH).putByteArray(null, 0, (4 - (this.code.length % 4)) % 4);
        label.put(this.code, this.lastBytecodeOffset, true);
        this.code.putInt(labelArr.length);
        for (int i10 = 0; i10 < labelArr.length; i10++) {
            this.code.putInt(iArr[i10]);
            labelArr[i10].put(this.code, this.lastBytecodeOffset, true);
        }
        visitSwitchInsn(label, labelArr);
    }

    public void visitMaxs(int i10, int i11) {
        ByteVector byteVector;
        Frame frame = this.firstBasicBlock.frame;
        frame.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, this.maxLocals);
        frame.accept(this);
        Label label = this.firstBasicBlock;
        label.nextListElement = Label.EMPTY_LIST;
        int iMax = 0;
        while (label != Label.EMPTY_LIST) {
            Label label2 = label.nextListElement;
            label.nextListElement = null;
            label.flags = (short) (label.flags | 8);
            int length = label.frame.inputStack.length + label.outputStackMax;
            if (length > iMax) {
                iMax = length;
            }
            for (Edge edge = label.outgoingEdges; edge != null; edge = edge.nextEdge) {
                Label canonicalInstance = edge.successor.getCanonicalInstance();
                if (label.frame.merge(this.symbolTable, canonicalInstance.frame) && canonicalInstance.nextListElement == null) {
                    canonicalInstance.nextListElement = label2;
                    label2 = canonicalInstance;
                }
            }
            label = label2;
        }
        for (Label label3 = this.firstBasicBlock; label3 != null; label3 = label3.nextBasicBlock) {
            if ((label3.flags & 10) == 10) {
                label3.frame.accept(this);
            }
            if ((label3.flags & 8) == 0) {
                Label label4 = label3.nextBasicBlock;
                int i12 = label3.bytecodeOffset;
                int i13 = (label4 == null ? this.code.length : label4.bytecodeOffset) - 1;
                if (i13 >= i12) {
                    int i14 = i12;
                    while (true) {
                        byteVector = this.code;
                        if (i14 >= i13) {
                            break;
                        }
                        byteVector.data[i14] = 0;
                        i14++;
                    }
                    byteVector.data[i13] = JSONB.Constants.BC_INT64_INT;
                    this.currentFrame[visitFrameStart(i12, 0, 1)] = this.symbolTable.addType("java/lang/Throwable") | 8388608;
                    visitFrameEnd();
                    iMax = Math.max(iMax, 1);
                }
            }
        }
        this.maxStack = iMax;
    }

    public void visitVarInsn(int i10, int i11) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i11 < 4 && i10 != 169) {
            byteVector.putByte((i10 < 54 ? ((i10 - 21) << 2) + 26 : ((i10 - 54) << 2) + 59) + i11);
        } else if (i11 >= 256) {
            byteVector.putByte(196).put12(i10, i11);
        } else {
            byteVector.put11(i10, i11);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(i10, i11, null, null);
        }
        int i12 = (i10 == 22 || i10 == 24 || i10 == 55 || i10 == 57) ? i11 + 2 : i11 + 1;
        if (i12 > this.maxLocals) {
            this.maxLocals = i12;
        }
    }

    public void invokestatic(String str, String str2, String str3, boolean z10) {
        visitMethodInsn(Opcodes.INVOKESTATIC, str, str2, str3, z10);
    }

    public void dup() {
        visitInsn(89);
    }

    public void visitLdcInsn(String str) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantUtf8Reference = this.symbolTable.addConstantUtf8Reference(8, str);
        int i10 = symbolAddConstantUtf8Reference.index;
        ByteVector byteVector = this.code;
        if (i10 >= 256) {
            byteVector.put12(19, i10);
        } else {
            byteVector.put11(18, i10);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(18, 0, symbolAddConstantUtf8Reference, this.symbolTable);
        }
    }

    public void visitLdcInsn(Number number) {
        if (number instanceof Integer) {
            visitLdcInsn(number.intValue());
        } else if (number instanceof Long) {
            visitLdcInsn(number.longValue());
        } else {
            C5725t.m23179a(number.getClass().getName());
        }
    }

    public void visitLdcInsn(int i10) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantIntegerOrFloat = this.symbolTable.addConstantIntegerOrFloat(i10);
        int i11 = symbolAddConstantIntegerOrFloat.index;
        ByteVector byteVector = this.code;
        if (i11 >= 256) {
            byteVector.put12(19, i11);
        } else {
            byteVector.put11(18, i11);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(18, 0, symbolAddConstantIntegerOrFloat, this.symbolTable);
        }
    }

    public void visitLdcInsn(long j10) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantLongOrDouble = this.symbolTable.addConstantLongOrDouble(j10);
        this.code.put12(20, symbolAddConstantLongOrDouble.index);
        Label label = this.currentBasicBlock;
        if (label != null) {
            label.frame.execute(18, 0, symbolAddConstantLongOrDouble, this.symbolTable);
        }
    }
}
