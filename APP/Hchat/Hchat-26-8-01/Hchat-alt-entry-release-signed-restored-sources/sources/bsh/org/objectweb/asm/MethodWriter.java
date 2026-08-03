package bsh.org.objectweb.asm;

import bsh.org.objectweb.asm.Attribute;
import com.alibaba.fastjson2.JSONB;
import okio.C3193a;
import p136j8.C2104o;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class MethodWriter extends MethodVisitor {
    static final int COMPUTE_ALL_FRAMES = 4;
    static final int COMPUTE_INSERTED_FRAMES = 3;
    static final int COMPUTE_MAX_STACK_AND_LOCAL = 1;
    static final int COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES = 2;
    static final int COMPUTE_NOTHING = 0;

    /* JADX INFO: renamed from: NA */
    private static final int f1005NA = 0;
    private static final int[] STACK_SIZE_DELTA = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    private final int accessFlags;
    private final ByteVector code;
    private final int compute;
    private Label currentBasicBlock;
    private int[] currentFrame;
    private int currentLocals;
    private ByteVector defaultValue;
    private final String descriptor;
    private final int descriptorIndex;
    private final int[] exceptionIndexTable;
    private Attribute firstAttribute;
    private Label firstBasicBlock;
    private Attribute firstCodeAttribute;
    private Handler firstHandler;
    private boolean hasAsmInstructions;
    private boolean hasSubroutines;
    private Label lastBasicBlock;
    private int lastBytecodeOffset;
    private Handler lastHandler;
    private ByteVector lineNumberTable;
    private int lineNumberTableLength;
    private ByteVector localVariableTable;
    private int localVariableTableLength;
    private ByteVector localVariableTypeTable;
    private int localVariableTypeTableLength;
    private int maxLocals;
    private int maxRelativeStackSize;
    private int maxStack;
    private final int nameIndex;
    private final int numberOfExceptions;
    private ByteVector parameters;
    private int parametersCount;
    private int[] previousFrame;
    private int previousFrameOffset;
    private int relativeStackSize;
    private final int signatureIndex;
    private int sourceLength;
    private int sourceOffset;
    private ByteVector stackMapTableEntries;
    private int stackMapTableNumberOfEntries;
    private final SymbolTable symbolTable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodWriter(SymbolTable symbolTable, int i9, String str, String str2, String str3, String[] strArr, int i10) {
        super(Opcodes.ASM6);
        this.code = new ByteVector();
        this.symbolTable = symbolTable;
        this.accessFlags = "<init>".equals(str) ? 262144 | i9 : i9;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        this.descriptor = str2;
        this.signatureIndex = str3 == null ? 0 : symbolTable.addConstantUtf8(str3);
        if (strArr == null || strArr.length <= 0) {
            this.numberOfExceptions = 0;
            this.exceptionIndexTable = null;
        } else {
            int length = strArr.length;
            this.numberOfExceptions = length;
            this.exceptionIndexTable = new int[length];
            for (int i11 = 0; i11 < this.numberOfExceptions; i11++) {
                this.exceptionIndexTable[i11] = symbolTable.addConstantClass(strArr[i11]).index;
            }
        }
        this.compute = i10;
        if (i10 != 0) {
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2) >> 2;
            argumentsAndReturnSizes = (i9 & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.maxLocals = argumentsAndReturnSizes;
            this.currentLocals = argumentsAndReturnSizes;
            Label label = new Label();
            this.firstBasicBlock = label;
            visitLabel(label);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void addSuccessorToCurrentBasicBlock(int i9, Label label) {
        Label label2 = this.currentBasicBlock;
        label2.outgoingEdges = new Edge(i9, label, label2.outgoingEdges);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void computeAllFrames() {
        ByteVector byteVector;
        Handler handler = this.firstHandler;
        while (true) {
            if (handler == null) {
                break;
            }
            String str = handler.catchTypeDescriptor;
            int abstractTypeFromInternalName = Frame.getAbstractTypeFromInternalName(this.symbolTable, str != null ? str : "java/lang/Throwable");
            Label canonicalInstance = handler.handlerPc.getCanonicalInstance();
            canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
            Label canonicalInstance2 = handler.endPc.getCanonicalInstance();
            for (Label canonicalInstance3 = handler.startPc.getCanonicalInstance(); canonicalInstance3 != canonicalInstance2; canonicalInstance3 = canonicalInstance3.nextBasicBlock) {
                canonicalInstance3.outgoingEdges = new Edge(abstractTypeFromInternalName, canonicalInstance, canonicalInstance3.outgoingEdges);
            }
            handler = handler.nextHandler;
        }
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
            int inputStackSize = label.frame.getInputStackSize() + label.outputStackMax;
            if (inputStackSize > iMax) {
                iMax = inputStackSize;
            }
            for (Edge edge = label.outgoingEdges; edge != null; edge = edge.nextEdge) {
                Label canonicalInstance4 = edge.successor.getCanonicalInstance();
                if (label.frame.merge(this.symbolTable, canonicalInstance4.frame, edge.info) && canonicalInstance4.nextListElement == null) {
                    canonicalInstance4.nextListElement = label2;
                    label2 = canonicalInstance4;
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
                int i9 = label3.bytecodeOffset;
                int i10 = (label4 == null ? this.code.length : label4.bytecodeOffset) - 1;
                if (i10 >= i9) {
                    int i11 = i9;
                    while (true) {
                        byteVector = this.code;
                        if (i11 >= i10) {
                            break;
                        }
                        byteVector.data[i11] = 0;
                        i11++;
                    }
                    byteVector.data[i10] = JSONB.Constants.BC_INT64_INT;
                    this.currentFrame[visitFrameStart(i9, 0, 1)] = Frame.getAbstractTypeFromInternalName(this.symbolTable, "java/lang/Throwable");
                    visitFrameEnd();
                    this.firstHandler = Handler.removeRange(this.firstHandler, label3, label4);
                    iMax = Math.max(iMax, 1);
                }
            }
        }
        this.maxStack = iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void computeMaxStackAndLocal() {
        Label label;
        for (Handler handler = this.firstHandler; handler != null; handler = handler.nextHandler) {
            Label label2 = handler.handlerPc;
            Label label3 = handler.endPc;
            for (Label label4 = handler.startPc; label4 != label3; label4 = label4.nextBasicBlock) {
                int i9 = label4.flags & 16;
                Edge edge = label4.outgoingEdges;
                if (i9 == 0) {
                    label4.outgoingEdges = new Edge(Integer.MAX_VALUE, label2, edge);
                } else {
                    Edge edge2 = edge.nextEdge;
                    edge2.nextEdge = new Edge(Integer.MAX_VALUE, label2, edge2.nextEdge);
                }
            }
        }
        if (this.hasSubroutines) {
            this.firstBasicBlock.markSubroutine((short) 1);
            short s10 = 1;
            short s11 = 1;
            while (true) {
                label = this.firstBasicBlock;
                if (s10 > s11) {
                    break;
                }
                while (label != null) {
                    if ((label.flags & 16) != 0 && label.subroutineId == s10) {
                        Label label5 = label.outgoingEdges.nextEdge.successor;
                        if (label5.subroutineId == 0) {
                            s11 = (short) (s11 + 1);
                            label5.markSubroutine(s11);
                        }
                    }
                    label = label.nextBasicBlock;
                }
                s10 = (short) (s10 + 1);
            }
            while (label != null) {
                if ((label.flags & 16) != 0) {
                    label.outgoingEdges.nextEdge.successor.addSubroutineRetSuccessors(label);
                }
                label = label.nextBasicBlock;
            }
        }
        Label label6 = this.firstBasicBlock;
        label6.nextListElement = Label.EMPTY_LIST;
        int i10 = this.maxStack;
        while (label6 != Label.EMPTY_LIST) {
            Label label7 = label6.nextListElement;
            short s12 = label6.inputStackSize;
            int i11 = label6.outputStackMax + s12;
            if (i11 > i10) {
                i10 = i11;
            }
            Edge edge3 = label6.outgoingEdges;
            if ((label6.flags & 16) != 0) {
                edge3 = edge3.nextEdge;
            }
            label6 = label7;
            while (edge3 != null) {
                Label label8 = edge3.successor;
                if (label8.nextListElement == null) {
                    int i12 = edge3.info;
                    label8.inputStackSize = (short) (i12 == Integer.MAX_VALUE ? 1 : i12 + s12);
                    label8.nextListElement = label6;
                    label6 = label8;
                }
                edge3 = edge3.nextEdge;
            }
        }
        this.maxStack = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void endCurrentBasicBlockWithNoSuccessor() {
        int i9 = this.compute;
        if (i9 != 4) {
            if (i9 == 1) {
                this.currentBasicBlock.outputStackMax = (short) this.maxRelativeStackSize;
                this.currentBasicBlock = null;
                return;
            }
            return;
        }
        Label label = new Label();
        label.frame = new Frame(label);
        ByteVector byteVector = this.code;
        label.resolve(byteVector.data, byteVector.length);
        this.lastBasicBlock.nextBasicBlock = label;
        this.lastBasicBlock = label;
        this.currentBasicBlock = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void putAbstractTypes(int i9, int i10) {
        while (i9 < i10) {
            Frame.putAbstractType(this.symbolTable, this.currentFrame[i9], this.stackMapTableEntries);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void putFrame() {
        char c10;
        int i9;
        int[] iArr = this.currentFrame;
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = 0;
        int i13 = 3;
        if (this.symbolTable.getMajorVersion() < 50) {
            this.stackMapTableEntries.putShort(this.currentFrame[0]).putShort(i10);
            int i14 = i10 + 3;
            putAbstractTypes(3, i14);
            this.stackMapTableEntries.putShort(i11);
            putAbstractTypes(i14, i11 + i14);
            return;
        }
        int i15 = this.stackMapTableNumberOfEntries;
        int[] iArr2 = this.currentFrame;
        int i16 = i15 == 0 ? iArr2[0] : (iArr2[0] - this.previousFrame[0]) - 1;
        int i17 = this.previousFrame[1];
        int i18 = i10 - i17;
        if (i11 == 0) {
            switch (i18) {
                case -3:
                case -2:
                case Opcodes.F_NEW /* -1 */:
                    c10 = 248;
                    break;
                case 0:
                    c10 = i16 >= 64 ? (char) 251 : (char) 0;
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
            c10 = (i18 == 0 && i11 == 1) ? i16 < 63 ? '@' : (char) 247 : (char) 255;
        }
        if (c10 != 255) {
            int i19 = 3;
            while (i12 < i17 && i12 < i10) {
                i9 = i13;
                if (this.currentFrame[i19] != this.previousFrame[i19]) {
                    c10 = 255;
                } else {
                    i19++;
                    i12++;
                    i13 = i9;
                }
            }
            i9 = i13;
        } else {
            i9 = i13;
        }
        if (c10 == 0) {
            this.stackMapTableEntries.putByte(i16);
            return;
        }
        if (c10 == '@') {
            this.stackMapTableEntries.putByte(i16 + 64);
            putAbstractTypes(i10 + 3, i10 + 4);
            return;
        }
        if (c10 == 247) {
            this.stackMapTableEntries.putByte(247).putShort(i16);
            putAbstractTypes(i10 + 3, i10 + 4);
            return;
        }
        if (c10 == 248) {
            this.stackMapTableEntries.putByte(i18 + 251).putShort(i16);
            return;
        }
        if (c10 == 251) {
            this.stackMapTableEntries.putByte(251).putShort(i16);
            return;
        }
        ByteVector byteVector = this.stackMapTableEntries;
        if (c10 == 252) {
            int i20 = i9;
            byteVector.putByte(i18 + 251).putShort(i16);
            putAbstractTypes(i17 + i20, i10 + i20);
        } else {
            byteVector.putByte(255).putShort(i16).putShort(i10);
            int i21 = i10 + 3;
            putAbstractTypes(i9, i21);
            this.stackMapTableEntries.putShort(i11);
            putAbstractTypes(i21, i11 + i21);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void putFrameType(Object obj) {
        if (obj instanceof Integer) {
            this.stackMapTableEntries.putByte(((Integer) obj).intValue());
            return;
        }
        boolean z9 = obj instanceof String;
        ByteVector byteVector = this.stackMapTableEntries;
        if (z9) {
            byteVector.putByte(7).putShort(this.symbolTable.addConstantClass((String) obj).index);
        } else {
            byteVector.putByte(8).putShort(((Label) obj).bytecodeOffset);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void visitSwitchInsn(Label label, Label[] labelArr) {
        Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            int i9 = this.compute;
            if (i9 == 4) {
                label2.frame.execute(Opcodes.LOOKUPSWITCH, 0, null, null);
                addSuccessorToCurrentBasicBlock(0, label);
                Label canonicalInstance = label.getCanonicalInstance();
                canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
                for (Label label3 : labelArr) {
                    addSuccessorToCurrentBasicBlock(0, label3);
                    Label canonicalInstance2 = label3.getCanonicalInstance();
                    canonicalInstance2.flags = (short) (canonicalInstance2.flags | 2);
                }
            } else if (i9 == 1) {
                int i10 = this.relativeStackSize - 1;
                this.relativeStackSize = i10;
                addSuccessorToCurrentBasicBlock(i10, label);
                for (Label label4 : labelArr) {
                    addSuccessorToCurrentBasicBlock(this.relativeStackSize, label4);
                }
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean canCopyMethodAttributes(int i9, int i10, boolean z9, boolean z10, int i11, int i12) {
        if (z9 != (this.symbolTable.getMajorVersion() < 49 && (this.accessFlags & 4096) != 0)) {
            return false;
        }
        if (i12 == 0 && this.numberOfExceptions != 0) {
            return false;
        }
        this.sourceOffset = i9 + 6;
        this.sourceLength = i10 - 6;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void collectAttributePrototypes(Attribute.Set set) {
        set.addAttributes(this.firstAttribute);
        set.addAttributes(this.firstCodeAttribute);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int computeMethodInfoSize() {
        int iM6834g;
        if (this.sourceOffset != 0) {
            return this.sourceLength + 6;
        }
        int i9 = this.code.length;
        if (i9 <= 0) {
            iM6834g = 8;
        } else {
            if (i9 > 65535) {
                C3193a.m6820i("Method code too large!");
                return 0;
            }
            this.symbolTable.addConstantUtf8("Code");
            iM6834g = this.code.length + 16 + Handler.getExceptionTableSize(this.firstHandler) + 8;
            if (this.stackMapTableEntries != null) {
                this.symbolTable.addConstantUtf8(this.symbolTable.getMajorVersion() >= 50 ? "StackMapTable" : "StackMap");
                iM6834g += this.stackMapTableEntries.length + 8;
            }
            if (this.lineNumberTable != null) {
                this.symbolTable.addConstantUtf8("LineNumberTable");
                iM6834g += this.lineNumberTable.length + 8;
            }
            if (this.localVariableTable != null) {
                this.symbolTable.addConstantUtf8("LocalVariableTable");
                iM6834g += this.localVariableTable.length + 8;
            }
            if (this.localVariableTypeTable != null) {
                this.symbolTable.addConstantUtf8("LocalVariableTypeTable");
                iM6834g += this.localVariableTypeTable.length + 8;
            }
            Attribute attribute = this.firstCodeAttribute;
            if (attribute != null) {
                SymbolTable symbolTable = this.symbolTable;
                ByteVector byteVector = this.code;
                iM6834g += attribute.computeAttributesSize(symbolTable, byteVector.data, byteVector.length, this.maxStack, this.maxLocals);
            }
        }
        if (this.numberOfExceptions > 0) {
            this.symbolTable.addConstantUtf8("Exceptions");
            iM6834g = AbstractC3199a.m6834g(this.numberOfExceptions, 2, 8, iM6834g);
        }
        boolean z9 = this.symbolTable.getMajorVersion() < 49;
        if ((this.accessFlags & 4096) != 0 && z9) {
            this.symbolTable.addConstantUtf8("Synthetic");
            iM6834g += 6;
        }
        if (this.signatureIndex != 0) {
            this.symbolTable.addConstantUtf8("Signature");
            iM6834g += 8;
        }
        if ((this.accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
            this.symbolTable.addConstantUtf8("Deprecated");
            iM6834g += 6;
        }
        if (this.defaultValue != null) {
            this.symbolTable.addConstantUtf8("AnnotationDefault");
            iM6834g += this.defaultValue.length + 6;
        }
        if (this.parameters != null) {
            this.symbolTable.addConstantUtf8("MethodParameters");
            iM6834g += this.parameters.length + 7;
        }
        Attribute attribute2 = this.firstAttribute;
        return attribute2 != null ? attribute2.computeAttributesSize(this.symbolTable) + iM6834g : iM6834g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasAsmInstructions() {
        return this.hasAsmInstructions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasFrames() {
        return this.stackMapTableNumberOfEntries > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void putMethodInfo(ByteVector byteVector) {
        int attributeCount;
        boolean z9 = this.symbolTable.getMajorVersion() < 49;
        byteVector.putShort((~(z9 ? 4096 : 0)) & this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        int attributeCount2 = this.code.length > 0 ? 1 : 0;
        if (this.numberOfExceptions > 0) {
            attributeCount2++;
        }
        int i9 = this.accessFlags;
        if ((i9 & 4096) != 0 && z9) {
            attributeCount2++;
        }
        if (this.signatureIndex != 0) {
            attributeCount2++;
        }
        if ((i9 & Opcodes.ACC_DEPRECATED) != 0) {
            attributeCount2++;
        }
        if (this.defaultValue != null) {
            attributeCount2++;
        }
        if (this.parameters != null) {
            attributeCount2++;
        }
        Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            attributeCount2 += attribute.getAttributeCount();
        }
        byteVector.putShort(attributeCount2);
        int i10 = this.code.length;
        if (i10 > 0) {
            int exceptionTableSize = i10 + 10 + Handler.getExceptionTableSize(this.firstHandler);
            ByteVector byteVector2 = this.stackMapTableEntries;
            if (byteVector2 != null) {
                exceptionTableSize += byteVector2.length + 8;
                attributeCount = 1;
            } else {
                attributeCount = 0;
            }
            ByteVector byteVector3 = this.lineNumberTable;
            if (byteVector3 != null) {
                exceptionTableSize += byteVector3.length + 8;
                attributeCount++;
            }
            ByteVector byteVector4 = this.localVariableTable;
            if (byteVector4 != null) {
                exceptionTableSize += byteVector4.length + 8;
                attributeCount++;
            }
            ByteVector byteVector5 = this.localVariableTypeTable;
            if (byteVector5 != null) {
                exceptionTableSize += byteVector5.length + 8;
                attributeCount++;
            }
            Attribute attribute2 = this.firstCodeAttribute;
            if (attribute2 != null) {
                SymbolTable symbolTable = this.symbolTable;
                ByteVector byteVector6 = this.code;
                exceptionTableSize += attribute2.computeAttributesSize(symbolTable, byteVector6.data, byteVector6.length, this.maxStack, this.maxLocals);
                attributeCount += this.firstCodeAttribute.getAttributeCount();
            }
            ByteVector byteVectorPutInt = byteVector.putShort(this.symbolTable.addConstantUtf8("Code")).putInt(exceptionTableSize).putShort(this.maxStack).putShort(this.maxLocals).putInt(this.code.length);
            ByteVector byteVector7 = this.code;
            byteVectorPutInt.putByteArray(byteVector7.data, 0, byteVector7.length);
            Handler.putExceptionTable(this.firstHandler, byteVector);
            byteVector.putShort(attributeCount);
            if (this.stackMapTableEntries != null) {
                ByteVector byteVectorPutShort = byteVector.putShort(this.symbolTable.addConstantUtf8(this.symbolTable.getMajorVersion() >= 50 ? "StackMapTable" : "StackMap")).putInt(this.stackMapTableEntries.length + 2).putShort(this.stackMapTableNumberOfEntries);
                ByteVector byteVector8 = this.stackMapTableEntries;
                byteVectorPutShort.putByteArray(byteVector8.data, 0, byteVector8.length);
            }
            if (this.lineNumberTable != null) {
                ByteVector byteVectorPutShort2 = byteVector.putShort(this.symbolTable.addConstantUtf8("LineNumberTable")).putInt(this.lineNumberTable.length + 2).putShort(this.lineNumberTableLength);
                ByteVector byteVector9 = this.lineNumberTable;
                byteVectorPutShort2.putByteArray(byteVector9.data, 0, byteVector9.length);
            }
            if (this.localVariableTable != null) {
                ByteVector byteVectorPutShort3 = byteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTable")).putInt(this.localVariableTable.length + 2).putShort(this.localVariableTableLength);
                ByteVector byteVector10 = this.localVariableTable;
                byteVectorPutShort3.putByteArray(byteVector10.data, 0, byteVector10.length);
            }
            if (this.localVariableTypeTable != null) {
                ByteVector byteVectorPutShort4 = byteVector.putShort(this.symbolTable.addConstantUtf8("LocalVariableTypeTable")).putInt(this.localVariableTypeTable.length + 2).putShort(this.localVariableTypeTableLength);
                ByteVector byteVector11 = this.localVariableTypeTable;
                byteVectorPutShort4.putByteArray(byteVector11.data, 0, byteVector11.length);
            }
            Attribute attribute3 = this.firstCodeAttribute;
            if (attribute3 != null) {
                SymbolTable symbolTable2 = this.symbolTable;
                ByteVector byteVector12 = this.code;
                attribute3.putAttributes(symbolTable2, byteVector12.data, byteVector12.length, this.maxStack, this.maxLocals, byteVector);
            }
        }
        if (this.numberOfExceptions > 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Exceptions")).putInt((this.numberOfExceptions * 2) + 2).putShort(this.numberOfExceptions);
            for (int i11 : this.exceptionIndexTable) {
                byteVector.putShort(i11);
            }
        }
        if ((this.accessFlags & 4096) != 0 && z9) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (this.signatureIndex != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(this.signatureIndex);
        }
        if ((this.accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Deprecated")).putInt(0);
        }
        if (this.defaultValue != null) {
            ByteVector byteVectorPutInt2 = byteVector.putShort(this.symbolTable.addConstantUtf8("AnnotationDefault")).putInt(this.defaultValue.length);
            ByteVector byteVector13 = this.defaultValue;
            byteVectorPutInt2.putByteArray(byteVector13.data, 0, byteVector13.length);
        }
        if (this.parameters != null) {
            ByteVector byteVectorPutByte = byteVector.putShort(this.symbolTable.addConstantUtf8("MethodParameters")).putInt(this.parameters.length + 1).putByte(this.parametersCount);
            ByteVector byteVector14 = this.parameters;
            byteVectorPutByte.putByteArray(byteVector14.data, 0, byteVector14.length);
        }
        Attribute attribute4 = this.firstAttribute;
        if (attribute4 != null) {
            attribute4.putAttributes(this.symbolTable, byteVector);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitAbstractType(int i9, int i10) {
        this.currentFrame[i9] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.nextAttribute = this.firstCodeAttribute;
            this.firstCodeAttribute = attribute;
        } else {
            attribute.nextAttribute = this.firstAttribute;
            this.firstAttribute = attribute;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i9, String str, String str2, String str3) {
        int i10;
        int i11;
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantFieldref = this.symbolTable.addConstantFieldref(str, str2, str3);
        this.code.put12(i9, symbolAddConstantFieldref.index);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i12 = this.compute;
            if (i12 == 4 || i12 == 3) {
                label.frame.execute(i9, 0, symbolAddConstantFieldref, this.symbolTable);
                return;
            }
            char cCharAt = str3.charAt(0);
            int i13 = -2;
            switch (i9) {
                case Opcodes.GETSTATIC /* 178 */:
                    i10 = this.relativeStackSize + ((cCharAt == 'D' || cCharAt == 'J') ? 2 : 1);
                    break;
                case Opcodes.PUTSTATIC /* 179 */:
                    i11 = this.relativeStackSize;
                    if (cCharAt != 'D' && cCharAt != 'J') {
                        i13 = -1;
                    }
                    i10 = i11 + i13;
                    break;
                case Opcodes.GETFIELD /* 180 */:
                    i10 = this.relativeStackSize + ((cCharAt == 'D' || cCharAt == 'J') ? 1 : 0);
                    break;
                default:
                    i11 = this.relativeStackSize;
                    if (cCharAt == 'D' || cCharAt == 'J') {
                        i13 = -3;
                    }
                    i10 = i11 + i13;
                    break;
            }
            if (i10 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i10;
            }
            this.relativeStackSize = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitFrame(int i9, int i10, Object[] objArr, int i11, Object[] objArr2) {
        int i12;
        int i13;
        int i14 = this.compute;
        if (i14 == 4) {
            return;
        }
        if (i14 == 3) {
            Label label = this.currentBasicBlock;
            Frame frame = label.frame;
            if (frame == null) {
                label.frame = new CurrentFrame(label);
                this.currentBasicBlock.frame.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, i10);
                this.currentBasicBlock.frame.accept(this);
                i12 = i11;
            } else {
                if (i9 == -1) {
                    i12 = i11;
                    frame.setInputFrameFromApiFormat(this.symbolTable, i10, objArr, i12, objArr2);
                } else {
                    i12 = i11;
                }
                this.currentBasicBlock.frame.accept(this);
            }
        } else {
            i12 = i11;
            int i15 = 0;
            if (i9 == -1) {
                if (this.previousFrame == null) {
                    int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.descriptor) >> 2;
                    Frame frame2 = new Frame(new Label());
                    frame2.setInputFrameFromDescriptor(this.symbolTable, this.accessFlags, this.descriptor, argumentsAndReturnSizes);
                    frame2.accept(this);
                }
                this.currentLocals = i10;
                int iVisitFrameStart = visitFrameStart(this.code.length, i10, i12);
                int i16 = 0;
                while (i16 < i10) {
                    this.currentFrame[iVisitFrameStart] = Frame.getAbstractTypeFromApiFormat(this.symbolTable, objArr[i16]);
                    i16++;
                    iVisitFrameStart++;
                }
                while (i15 < i12) {
                    this.currentFrame[iVisitFrameStart] = Frame.getAbstractTypeFromApiFormat(this.symbolTable, objArr2[i15]);
                    i15++;
                    iVisitFrameStart++;
                }
                visitFrameEnd();
            } else {
                if (this.stackMapTableEntries == null) {
                    this.stackMapTableEntries = new ByteVector();
                    i13 = this.code.length;
                } else {
                    i13 = (this.code.length - this.previousFrameOffset) - 1;
                    if (i13 < 0) {
                        if (i9 != 3) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                }
                if (i9 == 0) {
                    this.currentLocals = i10;
                    this.stackMapTableEntries.putByte(255).putShort(i13).putShort(i10);
                    for (int i17 = 0; i17 < i10; i17++) {
                        putFrameType(objArr[i17]);
                    }
                    this.stackMapTableEntries.putShort(i12);
                    while (i15 < i12) {
                        putFrameType(objArr2[i15]);
                        i15++;
                    }
                } else if (i9 == 1) {
                    this.currentLocals += i10;
                    this.stackMapTableEntries.putByte(i10 + 251).putShort(i13);
                    while (i15 < i10) {
                        putFrameType(objArr[i15]);
                        i15++;
                    }
                } else if (i9 == 2) {
                    this.currentLocals -= i10;
                    this.stackMapTableEntries.putByte(251 - i10).putShort(i13);
                } else if (i9 == 3) {
                    ByteVector byteVector = this.stackMapTableEntries;
                    if (i13 < 64) {
                        byteVector.putByte(i13);
                    } else {
                        byteVector.putByte(251).putShort(i13);
                    }
                } else {
                    if (i9 != 4) {
                        C2104o.m5289o();
                        return;
                    }
                    ByteVector byteVector2 = this.stackMapTableEntries;
                    if (i13 < 64) {
                        byteVector2.putByte(i13 + 64);
                    } else {
                        byteVector2.putByte(247).putShort(i13);
                    }
                    putFrameType(objArr2[0]);
                }
                this.previousFrameOffset = this.code.length;
                this.stackMapTableNumberOfEntries++;
            }
        }
        if (this.compute == 2) {
            this.relativeStackSize = i12;
            if (i12 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i12;
            }
        }
        this.maxStack = Math.max(this.maxStack, i12);
        this.maxLocals = Math.max(this.maxLocals, this.currentLocals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitFrameEnd() {
        if (this.previousFrame != null) {
            if (this.stackMapTableEntries == null) {
                this.stackMapTableEntries = new ByteVector();
            }
            putFrame();
            this.stackMapTableNumberOfEntries++;
        }
        this.previousFrame = this.currentFrame;
        this.currentFrame = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int visitFrameStart(int i9, int i10, int i11) {
        int i12 = i10 + 3 + i11;
        int[] iArr = this.currentFrame;
        if (iArr == null || iArr.length < i12) {
            this.currentFrame = new int[i12];
        }
        int[] iArr2 = this.currentFrame;
        iArr2[0] = i9;
        iArr2[1] = i10;
        iArr2[2] = i11;
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i9, int i10) {
        int i11;
        int i12;
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i9 > 255 || i10 > 127 || i10 < -128) {
            byteVector.putByte(196).put12(132, i9).putShort(i10);
        } else {
            byteVector.putByte(132).put11(i9, i10);
        }
        Label label = this.currentBasicBlock;
        if (label != null && ((i12 = this.compute) == 4 || i12 == 3)) {
            label.frame.execute(132, i9, null, null);
        }
        if (this.compute == 0 || (i11 = i9 + 1) <= this.maxLocals) {
            return;
        }
        this.maxLocals = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitInsn(int i9) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(i9);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i10 = this.compute;
            if (i10 == 4 || i10 == 3) {
                label.frame.execute(i9, 0, null, null);
            } else {
                int i11 = this.relativeStackSize + STACK_SIZE_DELTA[i9];
                if (i11 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i11;
                }
                this.relativeStackSize = i11;
            }
            if ((i9 < 172 || i9 > 177) && i9 != 191) {
                return;
            }
            endCurrentBasicBlockWithNoSuccessor();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i9, int i10) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i9 == 17) {
            byteVector.put12(i9, i10);
        } else {
            byteVector.put11(i9, i10);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i11 = this.compute;
            if (i11 == 4 || i11 == 3) {
                label.frame.execute(i9, i10, null, null);
            } else if (i9 != 188) {
                int i12 = this.relativeStackSize + 1;
                if (i12 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i12;
                }
                this.relativeStackSize = i12;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantInvokeDynamic = this.symbolTable.addConstantInvokeDynamic(str, str2, handle, objArr);
        this.code.put12(Opcodes.INVOKEDYNAMIC, symbolAddConstantInvokeDynamic.index);
        this.code.putShort(0);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i9 = this.compute;
            if (i9 == 4 || i9 == 3) {
                label.frame.execute(Opcodes.INVOKEDYNAMIC, 0, symbolAddConstantInvokeDynamic, this.symbolTable);
                return;
            }
            int argumentsAndReturnSizes = symbolAddConstantInvokeDynamic.getArgumentsAndReturnSizes();
            int i10 = this.relativeStackSize + ((argumentsAndReturnSizes & 3) - (argumentsAndReturnSizes >> 2)) + 1;
            if (i10 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i10;
            }
            this.relativeStackSize = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i9, Label label) {
        boolean z9;
        ByteVector byteVector = this.code;
        int i10 = byteVector.length;
        this.lastBytecodeOffset = i10;
        int i11 = i9 >= 200 ? i9 - 33 : i9;
        if ((label.flags & 4) == 0 || label.bytecodeOffset - i10 >= -32768) {
            if (i11 != i9) {
                byteVector.putByte(i9);
                ByteVector byteVector2 = this.code;
                label.put(byteVector2, byteVector2.length - 1, true);
            } else {
                byteVector.putByte(i11);
                ByteVector byteVector3 = this.code;
                label.put(byteVector3, byteVector3.length - 1, false);
            }
            z9 = false;
        } else {
            if (i11 == 167) {
                byteVector.putByte(200);
            } else if (i11 == 168) {
                byteVector.putByte(201);
            } else {
                byteVector.putByte(i11 >= 198 ? i11 ^ 1 : ((i11 + 1) ^ 1) - 1);
                this.code.putShort(8);
                this.code.putByte(220);
                this.hasAsmInstructions = true;
                z9 = true;
                ByteVector byteVector4 = this.code;
                label.put(byteVector4, byteVector4.length - 1, true);
            }
            z9 = false;
            ByteVector byteVector42 = this.code;
            label.put(byteVector42, byteVector42.length - 1, true);
        }
        Label label2 = this.currentBasicBlock;
        if (label2 != null) {
            int i12 = this.compute;
            Label label3 = null;
            if (i12 == 4) {
                label2.frame.execute(i11, 0, null, null);
                Label canonicalInstance = label.getCanonicalInstance();
                canonicalInstance.flags = (short) (canonicalInstance.flags | 2);
                addSuccessorToCurrentBasicBlock(0, label);
                if (i11 != 167) {
                    label3 = new Label();
                }
            } else if (i12 == 3) {
                label2.frame.execute(i11, 0, null, null);
            } else if (i12 == 2) {
                this.relativeStackSize += STACK_SIZE_DELTA[i11];
            } else if (i11 == 168) {
                short s10 = label.flags;
                if ((s10 & 32) == 0) {
                    label.flags = (short) (s10 | 32);
                    this.hasSubroutines = true;
                }
                label2.flags = (short) (label2.flags | 16);
                addSuccessorToCurrentBasicBlock(this.relativeStackSize + 1, label);
                label3 = new Label();
            } else {
                int i13 = this.relativeStackSize + STACK_SIZE_DELTA[i11];
                this.relativeStackSize = i13;
                addSuccessorToCurrentBasicBlock(i13, label);
            }
            if (label3 != null) {
                if (z9) {
                    label3.flags = (short) (label3.flags | 2);
                }
                visitLabel(label3);
            }
            if (i11 == 167) {
                endCurrentBasicBlockWithNoSuccessor();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        boolean z9 = this.hasAsmInstructions;
        ByteVector byteVector = this.code;
        this.hasAsmInstructions = z9 | label.resolve(byteVector.data, byteVector.length);
        short s10 = label.flags;
        if ((s10 & 1) != 0) {
            return;
        }
        int i9 = this.compute;
        if (i9 == 4) {
            Label label2 = this.currentBasicBlock;
            if (label2 != null) {
                if (label.bytecodeOffset == label2.bytecodeOffset) {
                    label2.flags = (short) ((s10 & 2) | label2.flags);
                    label.frame = label2.frame;
                    return;
                }
                addSuccessorToCurrentBasicBlock(0, label);
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
            return;
        }
        if (i9 == 3) {
            Label label4 = this.currentBasicBlock;
            if (label4 == null) {
                this.currentBasicBlock = label;
                return;
            } else {
                label4.frame.owner = label;
                return;
            }
        }
        if (i9 != 1) {
            if (i9 == 2 && this.currentBasicBlock == null) {
                this.currentBasicBlock = label;
                return;
            }
            return;
        }
        Label label5 = this.currentBasicBlock;
        if (label5 != null) {
            label5.outputStackMax = (short) this.maxRelativeStackSize;
            addSuccessorToCurrentBasicBlock(this.relativeStackSize, label);
        }
        this.currentBasicBlock = label;
        this.relativeStackSize = 0;
        this.maxRelativeStackSize = 0;
        Label label6 = this.lastBasicBlock;
        if (label6 != null) {
            label6.nextBasicBlock = label;
        }
        this.lastBasicBlock = label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstant = this.symbolTable.addConstant(obj);
        int i9 = symbolAddConstant.index;
        int i10 = symbolAddConstant.tag;
        boolean z9 = i10 == 5 || i10 == 6;
        if (z9) {
            this.code.put12(20, i9);
        } else {
            ByteVector byteVector = this.code;
            if (i9 >= 256) {
                byteVector.put12(19, i9);
            } else {
                byteVector.put11(18, i9);
            }
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i11 = this.compute;
            if (i11 == 4 || i11 == 3) {
                label.frame.execute(18, 0, symbolAddConstant, this.symbolTable);
                return;
            }
            int i12 = this.relativeStackSize + (z9 ? 2 : 1);
            if (i12 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i12;
            }
            this.relativeStackSize = i12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i9, Label label) {
        if (this.lineNumberTable == null) {
            this.lineNumberTable = new ByteVector();
        }
        this.lineNumberTableLength++;
        this.lineNumberTable.putShort(label.bytecodeOffset);
        this.lineNumberTable.putShort(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i9) {
        if (str3 != null) {
            if (this.localVariableTypeTable == null) {
                this.localVariableTypeTable = new ByteVector();
            }
            this.localVariableTypeTableLength++;
            this.localVariableTypeTable.putShort(label.bytecodeOffset).putShort(label2.bytecodeOffset - label.bytecodeOffset).putShort(this.symbolTable.addConstantUtf8(str)).putShort(this.symbolTable.addConstantUtf8(str3)).putShort(i9);
        }
        if (this.localVariableTable == null) {
            this.localVariableTable = new ByteVector();
        }
        this.localVariableTableLength++;
        this.localVariableTable.putShort(label.bytecodeOffset).putShort(label2.bytecodeOffset - label.bytecodeOffset).putShort(this.symbolTable.addConstantUtf8(str)).putShort(this.symbolTable.addConstantUtf8(str2)).putShort(i9);
        if (this.compute != 0) {
            char cCharAt = str2.charAt(0);
            int i10 = i9 + ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1);
            if (i10 > this.maxLocals) {
                this.maxLocals = i10;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(Opcodes.LOOKUPSWITCH).putByteArray(null, 0, (4 - (this.code.length % 4)) % 4);
        label.put(this.code, this.lastBytecodeOffset, true);
        this.code.putInt(labelArr.length);
        for (int i9 = 0; i9 < labelArr.length; i9++) {
            this.code.putInt(iArr[i9]);
            labelArr[i9].put(this.code, this.lastBytecodeOffset, true);
        }
        visitSwitchInsn(label, labelArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i9, int i10) {
        int i11 = this.compute;
        if (i11 == 4) {
            computeAllFrames();
            return;
        }
        if (i11 == 1) {
            computeMaxStackAndLocal();
        } else if (i11 == 2) {
            this.maxStack = this.maxRelativeStackSize;
        } else {
            this.maxStack = i9;
            this.maxLocals = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i9, String str, String str2, String str3, boolean z9) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantMethodref = this.symbolTable.addConstantMethodref(str, str2, str3, z9);
        ByteVector byteVector = this.code;
        if (i9 == 185) {
            byteVector.put12(Opcodes.INVOKEINTERFACE, symbolAddConstantMethodref.index).put11(symbolAddConstantMethodref.getArgumentsAndReturnSizes() >> 2, 0);
        } else {
            byteVector.put12(i9, symbolAddConstantMethodref.index);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i10 = this.compute;
            if (i10 == 4 || i10 == 3) {
                label.frame.execute(i9, 0, symbolAddConstantMethodref, this.symbolTable);
                return;
            }
            int argumentsAndReturnSizes = symbolAddConstantMethodref.getArgumentsAndReturnSizes();
            int i11 = (argumentsAndReturnSizes & 3) - (argumentsAndReturnSizes >> 2);
            int i12 = this.relativeStackSize;
            int i13 = i9 == 184 ? i12 + i11 + 1 : i12 + i11;
            if (i13 > this.maxRelativeStackSize) {
                this.maxRelativeStackSize = i13;
            }
            this.relativeStackSize = i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i9) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantClass = this.symbolTable.addConstantClass(str);
        this.code.put12(Opcodes.MULTIANEWARRAY, symbolAddConstantClass.index).putByte(i9);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i10 = this.compute;
            if (i10 == 4 || i10 == 3) {
                label.frame.execute(Opcodes.MULTIANEWARRAY, i9, symbolAddConstantClass, this.symbolTable);
            } else {
                this.relativeStackSize = (1 - i9) + this.relativeStackSize;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitParameter(String str, int i9) {
        if (this.parameters == null) {
            this.parameters = new ByteVector();
        }
        this.parametersCount++;
        this.parameters.putShort(str == null ? 0 : this.symbolTable.addConstantUtf8(str)).putShort(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i9, int i10, Label label, Label... labelArr) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        byteVector.putByte(Opcodes.TABLESWITCH).putByteArray(null, 0, (4 - (this.code.length % 4)) % 4);
        label.put(this.code, this.lastBytecodeOffset, true);
        this.code.putInt(i9).putInt(i10);
        for (Label label2 : labelArr) {
            label2.put(this.code, this.lastBytecodeOffset, true);
        }
        visitSwitchInsn(label, labelArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        Handler handler = new Handler(label, label2, label3, str != null ? this.symbolTable.addConstantClass(str).index : 0, str);
        if (this.firstHandler == null) {
            this.firstHandler = handler;
        } else {
            this.lastHandler.nextHandler = handler;
        }
        this.lastHandler = handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i9, String str) {
        this.lastBytecodeOffset = this.code.length;
        Symbol symbolAddConstantClass = this.symbolTable.addConstantClass(str);
        this.code.put12(i9, symbolAddConstantClass.index);
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i10 = this.compute;
            if (i10 == 4 || i10 == 3) {
                label.frame.execute(i9, this.lastBytecodeOffset, symbolAddConstantClass, this.symbolTable);
            } else if (i9 == 187) {
                int i11 = this.relativeStackSize + 1;
                if (i11 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i11;
                }
                this.relativeStackSize = i11;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i9, int i10) {
        ByteVector byteVector = this.code;
        this.lastBytecodeOffset = byteVector.length;
        if (i10 < 4 && i9 != 169) {
            byteVector.putByte((i9 < 54 ? ((i9 - 21) << 2) + 26 : ((i9 - 54) << 2) + 59) + i10);
        } else if (i10 >= 256) {
            byteVector.putByte(196).put12(i9, i10);
        } else {
            byteVector.put11(i9, i10);
        }
        Label label = this.currentBasicBlock;
        if (label != null) {
            int i11 = this.compute;
            if (i11 == 4 || i11 == 3) {
                label.frame.execute(i9, i10, null, null);
            } else if (i9 == 169) {
                label.flags = (short) (label.flags | 64);
                label.outputStackSize = (short) this.relativeStackSize;
                endCurrentBasicBlockWithNoSuccessor();
            } else {
                int i12 = this.relativeStackSize + STACK_SIZE_DELTA[i9];
                if (i12 > this.maxRelativeStackSize) {
                    this.maxRelativeStackSize = i12;
                }
                this.relativeStackSize = i12;
            }
        }
        int i13 = this.compute;
        if (i13 != 0) {
            int i14 = (i9 == 22 || i9 == 24 || i9 == 55 || i9 == 57) ? i10 + 2 : i10 + 1;
            if (i14 > this.maxLocals) {
                this.maxLocals = i14;
            }
        }
        if (i9 < 54 || i13 != 4 || this.firstHandler == null) {
            return;
        }
        visitLabel(new Label());
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitEnd() {
    }
}
