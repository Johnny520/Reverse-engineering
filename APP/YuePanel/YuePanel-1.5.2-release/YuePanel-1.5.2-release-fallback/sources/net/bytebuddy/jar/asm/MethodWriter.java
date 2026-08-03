package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class MethodWriter extends net.bytebuddy.jar.asm.MethodVisitor {
    static final int COMPUTE_ALL_FRAMES = 4;
    static final int COMPUTE_INSERTED_FRAMES = 3;
    static final int COMPUTE_MAX_STACK_AND_LOCAL = 1;
    static final int COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES = 2;
    static final int COMPUTE_NOTHING = 0;
    private static final int NA = 0;
    private static final int[] STACK_SIZE_DELTA = null;
    private final int accessFlags;
    private final net.bytebuddy.jar.asm.ByteVector code;
    private final int compute;
    private net.bytebuddy.jar.asm.Label currentBasicBlock;
    private int[] currentFrame;
    private int currentLocals;
    private net.bytebuddy.jar.asm.ByteVector defaultValue;
    private final java.lang.String descriptor;
    private final int descriptorIndex;
    private final int[] exceptionIndexTable;
    private net.bytebuddy.jar.asm.Attribute firstAttribute;
    private net.bytebuddy.jar.asm.Label firstBasicBlock;
    private net.bytebuddy.jar.asm.Attribute firstCodeAttribute;
    private net.bytebuddy.jar.asm.Handler firstHandler;
    private boolean hasAsmInstructions;
    private boolean hasSubroutines;
    private int invisibleAnnotableParameterCount;
    private net.bytebuddy.jar.asm.Label lastBasicBlock;
    private int lastBytecodeOffset;
    private net.bytebuddy.jar.asm.AnnotationWriter lastCodeRuntimeInvisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastCodeRuntimeVisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.Handler lastHandler;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter[] lastRuntimeInvisibleParameterAnnotations;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter[] lastRuntimeVisibleParameterAnnotations;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.ByteVector lineNumberTable;
    private int lineNumberTableLength;
    private net.bytebuddy.jar.asm.ByteVector localVariableTable;
    private int localVariableTableLength;
    private net.bytebuddy.jar.asm.ByteVector localVariableTypeTable;
    private int localVariableTypeTableLength;
    private int maxLocals;
    private int maxRelativeStackSize;
    private int maxStack;
    private final java.lang.String name;
    private final int nameIndex;
    private final int numberOfExceptions;
    private net.bytebuddy.jar.asm.ByteVector parameters;
    private int parametersCount;
    private int[] previousFrame;
    private int previousFrameOffset;
    private int relativeStackSize;
    private final int signatureIndex;
    private int sourceLength;
    private int sourceOffset;
    private net.bytebuddy.jar.asm.ByteVector stackMapTableEntries;
    private int stackMapTableNumberOfEntries;
    private final net.bytebuddy.jar.asm.SymbolTable symbolTable;
    private int visibleAnnotableParameterCount;

    static {
            r0 = 202(0xca, float:2.83E-43)
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0} // fill-array
            net.bytebuddy.jar.asm.MethodWriter.STACK_SIZE_DELTA = r0
            return
    }

    public MethodWriter(net.bytebuddy.jar.asm.SymbolTable r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String[] r7, int r8) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r1.code = r0
            r1.symbolTable = r2
            java.lang.String r0 = "<init>"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L1a
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r3
            goto L1b
        L1a:
            r0 = r3
        L1b:
            r1.accessFlags = r0
            int r0 = r2.addConstantUtf8(r4)
            r1.nameIndex = r0
            r1.name = r4
            int r4 = r2.addConstantUtf8(r5)
            r1.descriptorIndex = r4
            r1.descriptor = r5
            r4 = 0
            if (r6 != 0) goto L32
            r6 = r4
            goto L36
        L32:
            int r6 = r2.addConstantUtf8(r6)
        L36:
            r1.signatureIndex = r6
            if (r7 == 0) goto L57
            int r6 = r7.length
            if (r6 <= 0) goto L57
            int r6 = r7.length
            r1.numberOfExceptions = r6
            int[] r6 = new int[r6]
            r1.exceptionIndexTable = r6
        L44:
            int r6 = r1.numberOfExceptions
            if (r4 >= r6) goto L5c
            int[] r6 = r1.exceptionIndexTable
            r0 = r7[r4]
            net.bytebuddy.jar.asm.Symbol r0 = r2.addConstantClass(r0)
            int r0 = r0.index
            r6[r4] = r0
            int r4 = r4 + 1
            goto L44
        L57:
            r1.numberOfExceptions = r4
            r2 = 0
            r1.exceptionIndexTable = r2
        L5c:
            r1.compute = r8
            if (r8 == 0) goto L7a
            int r2 = net.bytebuddy.jar.asm.Type.getArgumentsAndReturnSizes(r5)
            int r2 = r2 >> 2
            r3 = r3 & 8
            if (r3 == 0) goto L6c
            int r2 = r2 + (-1)
        L6c:
            r1.maxLocals = r2
            r1.currentLocals = r2
            net.bytebuddy.jar.asm.Label r2 = new net.bytebuddy.jar.asm.Label
            r2.<init>()
            r1.firstBasicBlock = r2
            r1.visitLabel(r2)
        L7a:
            return
    }

    private void addSuccessorToCurrentBasicBlock(int r4, net.bytebuddy.jar.asm.Label r5) {
            r3 = this;
            net.bytebuddy.jar.asm.Label r0 = r3.currentBasicBlock
            net.bytebuddy.jar.asm.Edge r1 = new net.bytebuddy.jar.asm.Edge
            net.bytebuddy.jar.asm.Edge r2 = r0.outgoingEdges
            r1.<init>(r4, r5, r2)
            r0.outgoingEdges = r1
            return
    }

    private void computeAllFrames() {
            r11 = this;
            net.bytebuddy.jar.asm.Handler r0 = r11.firstHandler
        L2:
            java.lang.String r1 = "java/lang/Throwable"
            if (r0 == 0) goto L3c
            java.lang.String r2 = r0.catchTypeDescriptor
            if (r2 != 0) goto Lb
            goto Lc
        Lb:
            r1 = r2
        Lc:
            net.bytebuddy.jar.asm.SymbolTable r2 = r11.symbolTable
            int r1 = net.bytebuddy.jar.asm.Frame.getAbstractTypeFromInternalName(r2, r1)
            net.bytebuddy.jar.asm.Label r2 = r0.handlerPc
            net.bytebuddy.jar.asm.Label r2 = r2.getCanonicalInstance()
            short r3 = r2.flags
            r3 = r3 | 2
            short r3 = (short) r3
            r2.flags = r3
            net.bytebuddy.jar.asm.Label r3 = r0.startPc
            net.bytebuddy.jar.asm.Label r3 = r3.getCanonicalInstance()
            net.bytebuddy.jar.asm.Label r4 = r0.endPc
            net.bytebuddy.jar.asm.Label r4 = r4.getCanonicalInstance()
        L2b:
            if (r3 == r4) goto L39
            net.bytebuddy.jar.asm.Edge r5 = new net.bytebuddy.jar.asm.Edge
            net.bytebuddy.jar.asm.Edge r6 = r3.outgoingEdges
            r5.<init>(r1, r2, r6)
            r3.outgoingEdges = r5
            net.bytebuddy.jar.asm.Label r3 = r3.nextBasicBlock
            goto L2b
        L39:
            net.bytebuddy.jar.asm.Handler r0 = r0.nextHandler
            goto L2
        L3c:
            net.bytebuddy.jar.asm.Label r0 = r11.firstBasicBlock
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            net.bytebuddy.jar.asm.SymbolTable r2 = r11.symbolTable
            int r3 = r11.accessFlags
            java.lang.String r4 = r11.descriptor
            int r5 = r11.maxLocals
            r0.setInputFrameFromDescriptor(r2, r3, r4, r5)
            r0.accept(r11)
            net.bytebuddy.jar.asm.Label r0 = r11.firstBasicBlock
            net.bytebuddy.jar.asm.Label r2 = net.bytebuddy.jar.asm.Label.EMPTY_LIST
            r0.nextListElement = r2
            r2 = 0
            r3 = r2
        L56:
            net.bytebuddy.jar.asm.Label r4 = net.bytebuddy.jar.asm.Label.EMPTY_LIST
            if (r0 == r4) goto L96
            net.bytebuddy.jar.asm.Label r4 = r0.nextListElement
            r5 = 0
            r0.nextListElement = r5
            short r5 = r0.flags
            r5 = r5 | 8
            short r5 = (short) r5
            r0.flags = r5
            net.bytebuddy.jar.asm.Frame r5 = r0.frame
            int r5 = r5.getInputStackSize()
            short r6 = r0.outputStackMax
            int r5 = r5 + r6
            if (r5 <= r3) goto L72
            r3 = r5
        L72:
            net.bytebuddy.jar.asm.Edge r5 = r0.outgoingEdges
        L74:
            if (r5 == 0) goto L94
            net.bytebuddy.jar.asm.Label r6 = r5.successor
            net.bytebuddy.jar.asm.Label r6 = r6.getCanonicalInstance()
            net.bytebuddy.jar.asm.Frame r7 = r0.frame
            net.bytebuddy.jar.asm.SymbolTable r8 = r11.symbolTable
            net.bytebuddy.jar.asm.Frame r9 = r6.frame
            int r10 = r5.info
            boolean r7 = r7.merge(r8, r9, r10)
            if (r7 == 0) goto L91
            net.bytebuddy.jar.asm.Label r7 = r6.nextListElement
            if (r7 != 0) goto L91
            r6.nextListElement = r4
            r4 = r6
        L91:
            net.bytebuddy.jar.asm.Edge r5 = r5.nextEdge
            goto L74
        L94:
            r0 = r4
            goto L56
        L96:
            net.bytebuddy.jar.asm.Label r0 = r11.firstBasicBlock
        L98:
            if (r0 == 0) goto Lf1
            short r4 = r0.flags
            r5 = 10
            r4 = r4 & r5
            if (r4 != r5) goto La6
            net.bytebuddy.jar.asm.Frame r4 = r0.frame
            r4.accept(r11)
        La6:
            short r4 = r0.flags
            r4 = r4 & 8
            if (r4 != 0) goto Lee
            net.bytebuddy.jar.asm.Label r4 = r0.nextBasicBlock
            int r5 = r0.bytecodeOffset
            if (r4 != 0) goto Lb7
            net.bytebuddy.jar.asm.ByteVector r6 = r11.code
            int r6 = r6.length
            goto Lb9
        Lb7:
            int r6 = r4.bytecodeOffset
        Lb9:
            r7 = 1
            int r6 = r6 - r7
            if (r6 < r5) goto Lee
            r8 = r5
        Lbe:
            if (r8 >= r6) goto Lc9
            net.bytebuddy.jar.asm.ByteVector r9 = r11.code
            byte[] r9 = r9.data
            r9[r8] = r2
            int r8 = r8 + 1
            goto Lbe
        Lc9:
            net.bytebuddy.jar.asm.ByteVector r8 = r11.code
            byte[] r8 = r8.data
            r9 = -65
            r8[r6] = r9
            int r5 = r11.visitFrameStart(r5, r2, r7)
            int[] r6 = r11.currentFrame
            net.bytebuddy.jar.asm.SymbolTable r8 = r11.symbolTable
            int r8 = net.bytebuddy.jar.asm.Frame.getAbstractTypeFromInternalName(r8, r1)
            r6[r5] = r8
            r11.visitFrameEnd()
            net.bytebuddy.jar.asm.Handler r5 = r11.firstHandler
            net.bytebuddy.jar.asm.Handler r4 = net.bytebuddy.jar.asm.Handler.removeRange(r5, r0, r4)
            r11.firstHandler = r4
            int r3 = java.lang.Math.max(r3, r7)
        Lee:
            net.bytebuddy.jar.asm.Label r0 = r0.nextBasicBlock
            goto L98
        Lf1:
            r11.maxStack = r3
            return
    }

    private void computeMaxStackAndLocal() {
            r8 = this;
            net.bytebuddy.jar.asm.Handler r0 = r8.firstHandler
        L2:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L32
            net.bytebuddy.jar.asm.Label r2 = r0.handlerPc
            net.bytebuddy.jar.asm.Label r3 = r0.startPc
            net.bytebuddy.jar.asm.Label r4 = r0.endPc
        Ld:
            if (r3 == r4) goto L2f
            short r5 = r3.flags
            r5 = r5 & 16
            if (r5 != 0) goto L1f
            net.bytebuddy.jar.asm.Edge r5 = new net.bytebuddy.jar.asm.Edge
            net.bytebuddy.jar.asm.Edge r6 = r3.outgoingEdges
            r5.<init>(r1, r2, r6)
            r3.outgoingEdges = r5
            goto L2c
        L1f:
            net.bytebuddy.jar.asm.Edge r5 = r3.outgoingEdges
            net.bytebuddy.jar.asm.Edge r5 = r5.nextEdge
            net.bytebuddy.jar.asm.Edge r6 = new net.bytebuddy.jar.asm.Edge
            net.bytebuddy.jar.asm.Edge r7 = r5.nextEdge
            r6.<init>(r1, r2, r7)
            r5.nextEdge = r6
        L2c:
            net.bytebuddy.jar.asm.Label r3 = r3.nextBasicBlock
            goto Ld
        L2f:
            net.bytebuddy.jar.asm.Handler r0 = r0.nextHandler
            goto L2
        L32:
            boolean r0 = r8.hasSubroutines
            r2 = 1
            if (r0 == 0) goto L7b
            net.bytebuddy.jar.asm.Label r0 = r8.firstBasicBlock
            r0.markSubroutine(r2)
            r0 = r2
            r3 = r0
        L3e:
            if (r0 > r3) goto L65
            net.bytebuddy.jar.asm.Label r4 = r8.firstBasicBlock
        L42:
            if (r4 == 0) goto L61
            short r5 = r4.flags
            r5 = r5 & 16
            if (r5 == 0) goto L5e
            short r5 = r4.subroutineId
            if (r5 != r0) goto L5e
            net.bytebuddy.jar.asm.Edge r5 = r4.outgoingEdges
            net.bytebuddy.jar.asm.Edge r5 = r5.nextEdge
            net.bytebuddy.jar.asm.Label r5 = r5.successor
            short r6 = r5.subroutineId
            if (r6 != 0) goto L5e
            int r3 = r3 + 1
            short r3 = (short) r3
            r5.markSubroutine(r3)
        L5e:
            net.bytebuddy.jar.asm.Label r4 = r4.nextBasicBlock
            goto L42
        L61:
            int r0 = r0 + 1
            short r0 = (short) r0
            goto L3e
        L65:
            net.bytebuddy.jar.asm.Label r0 = r8.firstBasicBlock
        L67:
            if (r0 == 0) goto L7b
            short r3 = r0.flags
            r3 = r3 & 16
            if (r3 == 0) goto L78
            net.bytebuddy.jar.asm.Edge r3 = r0.outgoingEdges
            net.bytebuddy.jar.asm.Edge r3 = r3.nextEdge
            net.bytebuddy.jar.asm.Label r3 = r3.successor
            r3.addSubroutineRetSuccessors(r0)
        L78:
            net.bytebuddy.jar.asm.Label r0 = r0.nextBasicBlock
            goto L67
        L7b:
            net.bytebuddy.jar.asm.Label r0 = r8.firstBasicBlock
            net.bytebuddy.jar.asm.Label r3 = net.bytebuddy.jar.asm.Label.EMPTY_LIST
            r0.nextListElement = r3
            int r3 = r8.maxStack
        L83:
            net.bytebuddy.jar.asm.Label r4 = net.bytebuddy.jar.asm.Label.EMPTY_LIST
            if (r0 == r4) goto Lb4
            net.bytebuddy.jar.asm.Label r4 = r0.nextListElement
            short r5 = r0.inputStackSize
            short r6 = r0.outputStackMax
            int r6 = r6 + r5
            if (r6 <= r3) goto L91
            r3 = r6
        L91:
            net.bytebuddy.jar.asm.Edge r6 = r0.outgoingEdges
            short r0 = r0.flags
            r0 = r0 & 16
            if (r0 == 0) goto L9b
            net.bytebuddy.jar.asm.Edge r6 = r6.nextEdge
        L9b:
            r0 = r4
        L9c:
            if (r6 == 0) goto L83
            net.bytebuddy.jar.asm.Label r4 = r6.successor
            net.bytebuddy.jar.asm.Label r7 = r4.nextListElement
            if (r7 != 0) goto Lb1
            int r7 = r6.info
            if (r7 != r1) goto Laa
            r7 = r2
            goto Lab
        Laa:
            int r7 = r7 + r5
        Lab:
            short r7 = (short) r7
            r4.inputStackSize = r7
            r4.nextListElement = r0
            r0 = r4
        Lb1:
            net.bytebuddy.jar.asm.Edge r6 = r6.nextEdge
            goto L9c
        Lb4:
            r8.maxStack = r3
            return
    }

    private void endCurrentBasicBlockWithNoSuccessor() {
            r5 = this;
            int r0 = r5.compute
            r1 = 4
            r2 = 0
            if (r0 != r1) goto L26
            net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
            r0.<init>()
            net.bytebuddy.jar.asm.Frame r1 = new net.bytebuddy.jar.asm.Frame
            r1.<init>(r0)
            r0.frame = r1
            net.bytebuddy.jar.asm.ByteVector r1 = r5.code
            byte[] r3 = r1.data
            net.bytebuddy.jar.asm.ByteVector r4 = r5.stackMapTableEntries
            int r1 = r1.length
            r0.resolve(r3, r4, r1)
            net.bytebuddy.jar.asm.Label r1 = r5.lastBasicBlock
            r1.nextBasicBlock = r0
            r5.lastBasicBlock = r0
            r5.currentBasicBlock = r2
            goto L32
        L26:
            r1 = 1
            if (r0 != r1) goto L32
            net.bytebuddy.jar.asm.Label r0 = r5.currentBasicBlock
            int r1 = r5.maxRelativeStackSize
            short r1 = (short) r1
            r0.outputStackMax = r1
            r5.currentBasicBlock = r2
        L32:
            return
    }

    private void putAbstractTypes(int r4, int r5) {
            r3 = this;
        L0:
            if (r4 >= r5) goto L10
            net.bytebuddy.jar.asm.SymbolTable r0 = r3.symbolTable
            int[] r1 = r3.currentFrame
            r1 = r1[r4]
            net.bytebuddy.jar.asm.ByteVector r2 = r3.stackMapTableEntries
            net.bytebuddy.jar.asm.Frame.putAbstractType(r0, r1, r2)
            int r4 = r4 + 1
            goto L0
        L10:
            return
    }

    private void putFrame() {
            r16 = this;
            r0 = r16
            int[] r1 = r0.currentFrame
            r2 = 1
            r3 = r1[r2]
            r4 = 2
            r1 = r1[r4]
            net.bytebuddy.jar.asm.SymbolTable r4 = r0.symbolTable
            int r4 = r4.getMajorVersion()
            r5 = 50
            r6 = 0
            r7 = 3
            if (r4 >= r5) goto L31
            net.bytebuddy.jar.asm.ByteVector r2 = r0.stackMapTableEntries
            int[] r4 = r0.currentFrame
            r4 = r4[r6]
            net.bytebuddy.jar.asm.ByteVector r2 = r2.putShort(r4)
            r2.putShort(r3)
            int r3 = r3 + r7
            r0.putAbstractTypes(r7, r3)
            net.bytebuddy.jar.asm.ByteVector r2 = r0.stackMapTableEntries
            r2.putShort(r1)
            int r1 = r1 + r3
            r0.putAbstractTypes(r3, r1)
            return
        L31:
            int r4 = r0.stackMapTableNumberOfEntries
            if (r4 != 0) goto L3a
            int[] r4 = r0.currentFrame
            r4 = r4[r6]
            goto L44
        L3a:
            int[] r4 = r0.currentFrame
            r4 = r4[r6]
            int[] r5 = r0.previousFrame
            r5 = r5[r6]
            int r4 = r4 - r5
            int r4 = r4 - r2
        L44:
            int[] r5 = r0.previousFrame
            r5 = r5[r2]
            int r8 = r3 - r5
            r9 = 248(0xf8, float:3.48E-43)
            r10 = 252(0xfc, float:3.53E-43)
            r11 = 247(0xf7, float:3.46E-43)
            r12 = 64
            r13 = 255(0xff, float:3.57E-43)
            r14 = 251(0xfb, float:3.52E-43)
            if (r1 != 0) goto L66
            switch(r8) {
                case -3: goto L64;
                case -2: goto L64;
                case -1: goto L64;
                case 0: goto L5e;
                case 1: goto L5c;
                case 2: goto L5c;
                case 3: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L72
        L5c:
            r2 = r10
            goto L73
        L5e:
            if (r4 >= r12) goto L62
            r2 = r6
            goto L73
        L62:
            r2 = r14
            goto L73
        L64:
            r2 = r9
            goto L73
        L66:
            if (r8 != 0) goto L72
            if (r1 != r2) goto L72
            r2 = 63
            if (r4 >= r2) goto L70
            r2 = r12
            goto L73
        L70:
            r2 = r11
            goto L73
        L72:
            r2 = r13
        L73:
            if (r2 == r13) goto L8f
            r15 = r7
        L76:
            if (r6 >= r5) goto L8f
            if (r6 >= r3) goto L8f
            int[] r7 = r0.currentFrame
            r7 = r7[r15]
            int[] r13 = r0.previousFrame
            r13 = r13[r15]
            if (r7 == r13) goto L87
            r2 = 255(0xff, float:3.57E-43)
            goto L8f
        L87:
            int r15 = r15 + 1
            int r6 = r6 + 1
            r7 = 3
            r13 = 255(0xff, float:3.57E-43)
            goto L76
        L8f:
            if (r2 == 0) goto Lfe
            if (r2 == r12) goto Lf0
            if (r2 == r11) goto Ldf
            if (r2 == r9) goto Ld4
            if (r2 == r14) goto Lca
            if (r2 == r10) goto Lb9
            net.bytebuddy.jar.asm.ByteVector r2 = r0.stackMapTableEntries
            r5 = 255(0xff, float:3.57E-43)
            net.bytebuddy.jar.asm.ByteVector r2 = r2.putByte(r5)
            net.bytebuddy.jar.asm.ByteVector r2 = r2.putShort(r4)
            r2.putShort(r3)
            r2 = 3
            int r3 = r3 + r2
            r0.putAbstractTypes(r2, r3)
            net.bytebuddy.jar.asm.ByteVector r2 = r0.stackMapTableEntries
            r2.putShort(r1)
            int r1 = r1 + r3
            r0.putAbstractTypes(r3, r1)
            goto L103
        Lb9:
            r2 = 3
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            int r8 = r8 + r14
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r8)
            r1.putShort(r4)
            int r5 = r5 + r2
            int r3 = r3 + r2
            r0.putAbstractTypes(r5, r3)
            goto L103
        Lca:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r14)
            r1.putShort(r4)
            goto L103
        Ld4:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            int r8 = r8 + r14
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r8)
            r1.putShort(r4)
            goto L103
        Ldf:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r11)
            r1.putShort(r4)
            int r1 = r3 + 3
            int r3 = r3 + 4
            r0.putAbstractTypes(r1, r3)
            goto L103
        Lf0:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            int r4 = r4 + r12
            r1.putByte(r4)
            int r1 = r3 + 3
            int r3 = r3 + 4
            r0.putAbstractTypes(r1, r3)
            goto L103
        Lfe:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            r1.putByte(r4)
        L103:
            return
    }

    private void putFrameType(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L10
            net.bytebuddy.jar.asm.ByteVector r0 = r2.stackMapTableEntries
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.putByte(r3)
            goto L37
        L10:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L29
            net.bytebuddy.jar.asm.ByteVector r0 = r2.stackMapTableEntries
            r1 = 7
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r1)
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            java.lang.String r3 = (java.lang.String) r3
            net.bytebuddy.jar.asm.Symbol r3 = r1.addConstantClass(r3)
            int r3 = r3.index
            r0.putShort(r3)
            goto L37
        L29:
            net.bytebuddy.jar.asm.ByteVector r0 = r2.stackMapTableEntries
            r1 = 8
            r0.putByte(r1)
            net.bytebuddy.jar.asm.Label r3 = (net.bytebuddy.jar.asm.Label) r3
            net.bytebuddy.jar.asm.ByteVector r0 = r2.stackMapTableEntries
            r3.put(r0)
        L37:
            return
    }

    private void visitSwitchInsn(net.bytebuddy.jar.asm.Label r5, net.bytebuddy.jar.asm.Label[] r6) {
            r4 = this;
            net.bytebuddy.jar.asm.Label r0 = r4.currentBasicBlock
            if (r0 == 0) goto L52
            int r1 = r4.compute
            r2 = 4
            r3 = 0
            if (r1 != r2) goto L37
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            r1 = 171(0xab, float:2.4E-43)
            r2 = 0
            r0.execute(r1, r3, r2, r2)
            r4.addSuccessorToCurrentBasicBlock(r3, r5)
            net.bytebuddy.jar.asm.Label r5 = r5.getCanonicalInstance()
            short r0 = r5.flags
            r0 = r0 | 2
            short r0 = (short) r0
            r5.flags = r0
            int r5 = r6.length
            r0 = r3
        L22:
            if (r0 >= r5) goto L4f
            r1 = r6[r0]
            r4.addSuccessorToCurrentBasicBlock(r3, r1)
            net.bytebuddy.jar.asm.Label r1 = r1.getCanonicalInstance()
            short r2 = r1.flags
            r2 = r2 | 2
            short r2 = (short) r2
            r1.flags = r2
            int r0 = r0 + 1
            goto L22
        L37:
            r0 = 1
            if (r1 != r0) goto L4f
            int r1 = r4.relativeStackSize
            int r1 = r1 - r0
            r4.relativeStackSize = r1
            r4.addSuccessorToCurrentBasicBlock(r1, r5)
            int r5 = r6.length
        L43:
            if (r3 >= r5) goto L4f
            r0 = r6[r3]
            int r1 = r4.relativeStackSize
            r4.addSuccessorToCurrentBasicBlock(r1, r0)
            int r3 = r3 + 1
            goto L43
        L4f:
            r4.endCurrentBasicBlockWithNoSuccessor()
        L52:
            return
    }

    public boolean canCopyMethodAttributes(net.bytebuddy.jar.asm.ClassReader r3, boolean r4, boolean r5, int r6, int r7, int r8) {
            r2 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            net.bytebuddy.jar.asm.ClassReader r0 = r0.getSource()
            r1 = 0
            if (r3 != r0) goto L5c
            int r0 = r2.descriptorIndex
            if (r6 != r0) goto L5c
            int r6 = r2.signatureIndex
            if (r7 != r6) goto L5c
            int r6 = r2.accessFlags
            r7 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 & r7
            r7 = 1
            if (r6 == 0) goto L1b
            r6 = r7
            goto L1c
        L1b:
            r6 = r1
        L1c:
            if (r5 == r6) goto L1f
            goto L5c
        L1f:
            net.bytebuddy.jar.asm.SymbolTable r5 = r2.symbolTable
            int r5 = r5.getMajorVersion()
            r6 = 49
            if (r5 >= r6) goto L31
            int r5 = r2.accessFlags
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L31
            r5 = r7
            goto L32
        L31:
            r5 = r1
        L32:
            if (r4 == r5) goto L35
            return r1
        L35:
            if (r8 != 0) goto L3c
            int r3 = r2.numberOfExceptions
            if (r3 == 0) goto L5b
            return r1
        L3c:
            int r4 = r3.readUnsignedShort(r8)
            int r5 = r2.numberOfExceptions
            if (r4 != r5) goto L5b
            int r8 = r8 + 2
            r4 = r1
        L47:
            int r5 = r2.numberOfExceptions
            if (r4 >= r5) goto L5b
            int r5 = r3.readUnsignedShort(r8)
            int[] r6 = r2.exceptionIndexTable
            r6 = r6[r4]
            if (r5 == r6) goto L56
            return r1
        L56:
            int r8 = r8 + 2
            int r4 = r4 + 1
            goto L47
        L5b:
            return r7
        L5c:
            return r1
    }

    public final void collectAttributePrototypes(net.bytebuddy.jar.asm.Attribute.Set r2) {
            r1 = this;
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstAttribute
            r2.addAttributes(r0)
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstCodeAttribute
            r2.addAttributes(r0)
            return
    }

    public int computeMethodInfoSize() {
            r9 = this;
            int r0 = r9.sourceOffset
            if (r0 == 0) goto L9
            int r0 = r9.sourceLength
            int r0 = r0 + 6
            return r0
        L9:
            net.bytebuddy.jar.asm.ByteVector r0 = r9.code
            int r0 = r0.length
            r1 = 8
            if (r0 <= 0) goto Lc5
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r2) goto Lb1
            net.bytebuddy.jar.asm.SymbolTable r0 = r9.symbolTable
            java.lang.String r2 = "Code"
            r0.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r0 = r9.code
            int r0 = r0.length
            int r0 = r0 + 16
            net.bytebuddy.jar.asm.Handler r2 = r9.firstHandler
            int r2 = net.bytebuddy.jar.asm.Handler.getExceptionTableSize(r2)
            int r0 = r0 + r2
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r2 = r9.stackMapTableEntries
            if (r2 == 0) goto L4e
            net.bytebuddy.jar.asm.SymbolTable r2 = r9.symbolTable
            int r2 = r2.getMajorVersion()
            r3 = 50
            if (r2 < r3) goto L3b
            r2 = 1
            goto L3c
        L3b:
            r2 = 0
        L3c:
            net.bytebuddy.jar.asm.SymbolTable r3 = r9.symbolTable
            if (r2 == 0) goto L43
            java.lang.String r2 = "StackMapTable"
            goto L45
        L43:
            java.lang.String r2 = "StackMap"
        L45:
            r3.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r2 = r9.stackMapTableEntries
            int r2 = r2.length
            int r2 = r2 + r1
            int r0 = r0 + r2
        L4e:
            net.bytebuddy.jar.asm.ByteVector r2 = r9.lineNumberTable
            if (r2 == 0) goto L5f
            net.bytebuddy.jar.asm.SymbolTable r2 = r9.symbolTable
            java.lang.String r3 = "LineNumberTable"
            r2.addConstantUtf8(r3)
            net.bytebuddy.jar.asm.ByteVector r2 = r9.lineNumberTable
            int r2 = r2.length
            int r2 = r2 + r1
            int r0 = r0 + r2
        L5f:
            net.bytebuddy.jar.asm.ByteVector r2 = r9.localVariableTable
            if (r2 == 0) goto L70
            net.bytebuddy.jar.asm.SymbolTable r2 = r9.symbolTable
            java.lang.String r3 = "LocalVariableTable"
            r2.addConstantUtf8(r3)
            net.bytebuddy.jar.asm.ByteVector r2 = r9.localVariableTable
            int r2 = r2.length
            int r2 = r2 + r1
            int r0 = r0 + r2
        L70:
            net.bytebuddy.jar.asm.ByteVector r2 = r9.localVariableTypeTable
            if (r2 == 0) goto L81
            net.bytebuddy.jar.asm.SymbolTable r2 = r9.symbolTable
            java.lang.String r3 = "LocalVariableTypeTable"
            r2.addConstantUtf8(r3)
            net.bytebuddy.jar.asm.ByteVector r2 = r9.localVariableTypeTable
            int r2 = r2.length
            int r2 = r2 + r1
            int r0 = r0 + r2
        L81:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r9.lastCodeRuntimeVisibleTypeAnnotation
            if (r2 == 0) goto L8c
            java.lang.String r3 = "RuntimeVisibleTypeAnnotations"
            int r2 = r2.computeAnnotationsSize(r3)
            int r0 = r0 + r2
        L8c:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r9.lastCodeRuntimeInvisibleTypeAnnotation
            if (r2 == 0) goto L97
            java.lang.String r3 = "RuntimeInvisibleTypeAnnotations"
            int r2 = r2.computeAnnotationsSize(r3)
            int r0 = r0 + r2
        L97:
            net.bytebuddy.jar.asm.Attribute r2 = r9.firstCodeAttribute
            if (r2 == 0) goto Lc6
            net.bytebuddy.jar.asm.SymbolTable r3 = r9.symbolTable
            net.bytebuddy.jar.asm.ByteVector r4 = r9.code
            byte[] r5 = r4.data
            int r6 = r4.length
            int r7 = r9.maxStack
            int r8 = r9.maxLocals
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            int r2 = r2.computeAttributesSize(r3, r4, r5, r6, r7)
            int r0 = r0 + r2
            goto Lc6
        Lb1:
            net.bytebuddy.jar.asm.MethodTooLargeException r0 = new net.bytebuddy.jar.asm.MethodTooLargeException
            net.bytebuddy.jar.asm.SymbolTable r1 = r9.symbolTable
            java.lang.String r1 = r1.getClassName()
            java.lang.String r2 = r9.name
            java.lang.String r3 = r9.descriptor
            net.bytebuddy.jar.asm.ByteVector r4 = r9.code
            int r4 = r4.length
            r0.<init>(r1, r2, r3, r4)
            throw r0
        Lc5:
            r0 = r1
        Lc6:
            int r2 = r9.numberOfExceptions
            if (r2 <= 0) goto Ld7
            net.bytebuddy.jar.asm.SymbolTable r2 = r9.symbolTable
            java.lang.String r3 = "Exceptions"
            r2.addConstantUtf8(r3)
            int r2 = r9.numberOfExceptions
            int r2 = r2 * 2
            int r2 = r2 + r1
            int r0 = r0 + r2
        Ld7:
            net.bytebuddy.jar.asm.SymbolTable r1 = r9.symbolTable
            int r2 = r9.accessFlags
            int r3 = r9.signatureIndex
            int r1 = net.bytebuddy.jar.asm.Attribute.computeAttributesSize(r1, r2, r3)
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.AnnotationWriter r1 = r9.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r9.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r3 = r9.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r9.lastRuntimeInvisibleTypeAnnotation
            int r1 = net.bytebuddy.jar.asm.AnnotationWriter.computeAnnotationsSize(r1, r2, r3, r4)
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.AnnotationWriter[] r1 = r9.lastRuntimeVisibleParameterAnnotations
            if (r1 == 0) goto Lff
            int r2 = r9.visibleAnnotableParameterCount
            if (r2 != 0) goto Lf8
            int r2 = r1.length
        Lf8:
            java.lang.String r3 = "RuntimeVisibleParameterAnnotations"
            int r1 = net.bytebuddy.jar.asm.AnnotationWriter.computeParameterAnnotationsSize(r3, r1, r2)
            int r0 = r0 + r1
        Lff:
            net.bytebuddy.jar.asm.AnnotationWriter[] r1 = r9.lastRuntimeInvisibleParameterAnnotations
            if (r1 == 0) goto L10f
            int r2 = r9.invisibleAnnotableParameterCount
            if (r2 != 0) goto L108
            int r2 = r1.length
        L108:
            java.lang.String r3 = "RuntimeInvisibleParameterAnnotations"
            int r1 = net.bytebuddy.jar.asm.AnnotationWriter.computeParameterAnnotationsSize(r3, r1, r2)
            int r0 = r0 + r1
        L10f:
            net.bytebuddy.jar.asm.ByteVector r1 = r9.defaultValue
            if (r1 == 0) goto L121
            net.bytebuddy.jar.asm.SymbolTable r1 = r9.symbolTable
            java.lang.String r2 = "AnnotationDefault"
            r1.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r1 = r9.defaultValue
            int r1 = r1.length
            int r1 = r1 + 6
            int r0 = r0 + r1
        L121:
            net.bytebuddy.jar.asm.ByteVector r1 = r9.parameters
            if (r1 == 0) goto L133
            net.bytebuddy.jar.asm.SymbolTable r1 = r9.symbolTable
            java.lang.String r2 = "MethodParameters"
            r1.addConstantUtf8(r2)
            net.bytebuddy.jar.asm.ByteVector r1 = r9.parameters
            int r1 = r1.length
            int r1 = r1 + 7
            int r0 = r0 + r1
        L133:
            net.bytebuddy.jar.asm.Attribute r1 = r9.firstAttribute
            if (r1 == 0) goto L13e
            net.bytebuddy.jar.asm.SymbolTable r2 = r9.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r0 = r0 + r1
        L13e:
            return r0
    }

    public boolean hasAsmInstructions() {
            r1 = this;
            boolean r0 = r1.hasAsmInstructions
            return r0
    }

    public boolean hasFrames() {
            r1 = this;
            int r0 = r1.stackMapTableNumberOfEntries
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void putMethodInfo(net.bytebuddy.jar.asm.ByteVector r14) {
            r13 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 49
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L14
            r1 = 4096(0x1000, float:5.74E-42)
            goto L15
        L14:
            r1 = r2
        L15:
            int r4 = r13.accessFlags
            int r1 = ~r1
            r1 = r1 & r4
            net.bytebuddy.jar.asm.ByteVector r1 = r14.putShort(r1)
            int r4 = r13.nameIndex
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r4)
            int r4 = r13.descriptorIndex
            r1.putShort(r4)
            int r1 = r13.sourceOffset
            if (r1 == 0) goto L3c
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            net.bytebuddy.jar.asm.ClassReader r0 = r0.getSource()
            byte[] r0 = r0.classFileBuffer
            int r1 = r13.sourceOffset
            int r2 = r13.sourceLength
            r14.putByteArray(r0, r1, r2)
            return
        L3c:
            net.bytebuddy.jar.asm.ByteVector r1 = r13.code
            int r1 = r1.length
            if (r1 <= 0) goto L44
            r1 = r3
            goto L45
        L44:
            r1 = r2
        L45:
            int r4 = r13.numberOfExceptions
            if (r4 <= 0) goto L4b
            int r1 = r1 + 1
        L4b:
            int r4 = r13.accessFlags
            r5 = r4 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L55
            if (r0 == 0) goto L55
            int r1 = r1 + 1
        L55:
            int r0 = r13.signatureIndex
            if (r0 == 0) goto L5b
            int r1 = r1 + 1
        L5b:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r4
            if (r0 == 0) goto L62
            int r1 = r1 + 1
        L62:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r13.lastRuntimeVisibleAnnotation
            if (r0 == 0) goto L68
            int r1 = r1 + 1
        L68:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r13.lastRuntimeInvisibleAnnotation
            if (r0 == 0) goto L6e
            int r1 = r1 + 1
        L6e:
            net.bytebuddy.jar.asm.AnnotationWriter[] r0 = r13.lastRuntimeVisibleParameterAnnotations
            if (r0 == 0) goto L74
            int r1 = r1 + 1
        L74:
            net.bytebuddy.jar.asm.AnnotationWriter[] r0 = r13.lastRuntimeInvisibleParameterAnnotations
            if (r0 == 0) goto L7a
            int r1 = r1 + 1
        L7a:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r13.lastRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L80
            int r1 = r1 + 1
        L80:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r13.lastRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L86
            int r1 = r1 + 1
        L86:
            net.bytebuddy.jar.asm.ByteVector r0 = r13.defaultValue
            if (r0 == 0) goto L8c
            int r1 = r1 + 1
        L8c:
            net.bytebuddy.jar.asm.ByteVector r0 = r13.parameters
            if (r0 == 0) goto L92
            int r1 = r1 + 1
        L92:
            net.bytebuddy.jar.asm.Attribute r0 = r13.firstAttribute
            if (r0 == 0) goto L9b
            int r0 = r0.getAttributeCount()
            int r1 = r1 + r0
        L9b:
            r14.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r13.code
            int r0 = r0.length
            if (r0 <= 0) goto L229
            int r0 = r0 + 10
            net.bytebuddy.jar.asm.Handler r1 = r13.firstHandler
            int r1 = net.bytebuddy.jar.asm.Handler.getExceptionTableSize(r1)
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.ByteVector r1 = r13.stackMapTableEntries
            if (r1 == 0) goto Lb8
            int r1 = r1.length
            int r1 = r1 + 8
            int r0 = r0 + r1
            r1 = r3
            goto Lb9
        Lb8:
            r1 = r2
        Lb9:
            net.bytebuddy.jar.asm.ByteVector r4 = r13.lineNumberTable
            if (r4 == 0) goto Lc4
            int r4 = r4.length
            int r4 = r4 + 8
            int r0 = r0 + r4
            int r1 = r1 + 1
        Lc4:
            net.bytebuddy.jar.asm.ByteVector r4 = r13.localVariableTable
            if (r4 == 0) goto Lcf
            int r4 = r4.length
            int r4 = r4 + 8
            int r0 = r0 + r4
            int r1 = r1 + 1
        Lcf:
            net.bytebuddy.jar.asm.ByteVector r4 = r13.localVariableTypeTable
            if (r4 == 0) goto Lda
            int r4 = r4.length
            int r4 = r4 + 8
            int r0 = r0 + r4
            int r1 = r1 + 1
        Lda:
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r13.lastCodeRuntimeVisibleTypeAnnotation
            java.lang.String r5 = "RuntimeVisibleTypeAnnotations"
            if (r4 == 0) goto Le7
            int r4 = r4.computeAnnotationsSize(r5)
            int r0 = r0 + r4
            int r1 = r1 + 1
        Le7:
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r13.lastCodeRuntimeInvisibleTypeAnnotation
            java.lang.String r6 = "RuntimeInvisibleTypeAnnotations"
            if (r4 == 0) goto Lf4
            int r4 = r4.computeAnnotationsSize(r6)
            int r0 = r0 + r4
            int r1 = r1 + 1
        Lf4:
            net.bytebuddy.jar.asm.Attribute r7 = r13.firstCodeAttribute
            if (r7 == 0) goto L110
            net.bytebuddy.jar.asm.SymbolTable r8 = r13.symbolTable
            net.bytebuddy.jar.asm.ByteVector r4 = r13.code
            byte[] r9 = r4.data
            int r10 = r4.length
            int r11 = r13.maxStack
            int r12 = r13.maxLocals
            int r4 = r7.computeAttributesSize(r8, r9, r10, r11, r12)
            int r0 = r0 + r4
            net.bytebuddy.jar.asm.Attribute r4 = r13.firstCodeAttribute
            int r4 = r4.getAttributeCount()
            int r1 = r1 + r4
        L110:
            net.bytebuddy.jar.asm.SymbolTable r4 = r13.symbolTable
            java.lang.String r7 = "Code"
            int r4 = r4.addConstantUtf8(r7)
            net.bytebuddy.jar.asm.ByteVector r4 = r14.putShort(r4)
            net.bytebuddy.jar.asm.ByteVector r0 = r4.putInt(r0)
            int r4 = r13.maxStack
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r4)
            int r4 = r13.maxLocals
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r4)
            net.bytebuddy.jar.asm.ByteVector r4 = r13.code
            int r4 = r4.length
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r4)
            net.bytebuddy.jar.asm.ByteVector r4 = r13.code
            byte[] r7 = r4.data
            int r4 = r4.length
            r0.putByteArray(r7, r2, r4)
            net.bytebuddy.jar.asm.Handler r0 = r13.firstHandler
            net.bytebuddy.jar.asm.Handler.putExceptionTable(r0, r14)
            r14.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r13.stackMapTableEntries
            if (r0 == 0) goto L180
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 50
            if (r0 < r1) goto L155
            r0 = r3
            goto L156
        L155:
            r0 = r2
        L156:
            net.bytebuddy.jar.asm.SymbolTable r1 = r13.symbolTable
            if (r0 == 0) goto L15d
            java.lang.String r0 = "StackMapTable"
            goto L15f
        L15d:
            java.lang.String r0 = "StackMap"
        L15f:
            int r0 = r1.addConstantUtf8(r0)
            net.bytebuddy.jar.asm.ByteVector r0 = r14.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.stackMapTableEntries
            int r1 = r1.length
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            int r1 = r13.stackMapTableNumberOfEntries
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.stackMapTableEntries
            byte[] r4 = r1.data
            int r1 = r1.length
            r0.putByteArray(r4, r2, r1)
        L180:
            net.bytebuddy.jar.asm.ByteVector r0 = r13.lineNumberTable
            if (r0 == 0) goto L1a9
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "LineNumberTable"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r14.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.lineNumberTable
            int r1 = r1.length
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            int r1 = r13.lineNumberTableLength
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.lineNumberTable
            byte[] r4 = r1.data
            int r1 = r1.length
            r0.putByteArray(r4, r2, r1)
        L1a9:
            net.bytebuddy.jar.asm.ByteVector r0 = r13.localVariableTable
            if (r0 == 0) goto L1d2
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "LocalVariableTable"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r14.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.localVariableTable
            int r1 = r1.length
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            int r1 = r13.localVariableTableLength
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.localVariableTable
            byte[] r4 = r1.data
            int r1 = r1.length
            r0.putByteArray(r4, r2, r1)
        L1d2:
            net.bytebuddy.jar.asm.ByteVector r0 = r13.localVariableTypeTable
            if (r0 == 0) goto L1fb
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "LocalVariableTypeTable"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r14.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.localVariableTypeTable
            int r1 = r1.length
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            int r1 = r13.localVariableTypeTableLength
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.localVariableTypeTable
            byte[] r4 = r1.data
            int r1 = r1.length
            r0.putByteArray(r4, r2, r1)
        L1fb:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r13.lastCodeRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L208
            net.bytebuddy.jar.asm.SymbolTable r1 = r13.symbolTable
            int r1 = r1.addConstantUtf8(r5)
            r0.putAnnotations(r1, r14)
        L208:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r13.lastCodeRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L215
            net.bytebuddy.jar.asm.SymbolTable r1 = r13.symbolTable
            int r1 = r1.addConstantUtf8(r6)
            r0.putAnnotations(r1, r14)
        L215:
            net.bytebuddy.jar.asm.Attribute r4 = r13.firstCodeAttribute
            if (r4 == 0) goto L229
            net.bytebuddy.jar.asm.SymbolTable r5 = r13.symbolTable
            net.bytebuddy.jar.asm.ByteVector r0 = r13.code
            byte[] r6 = r0.data
            int r7 = r0.length
            int r8 = r13.maxStack
            int r9 = r13.maxLocals
            r10 = r14
            r4.putAttributes(r5, r6, r7, r8, r9, r10)
        L229:
            int r0 = r13.numberOfExceptions
            if (r0 <= 0) goto L256
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "Exceptions"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r14.putShort(r0)
            int r1 = r13.numberOfExceptions
            int r1 = r1 * 2
            int r1 = r1 + 2
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            int r1 = r13.numberOfExceptions
            r0.putShort(r1)
            int[] r0 = r13.exceptionIndexTable
            int r1 = r0.length
            r4 = r2
        L24c:
            if (r4 >= r1) goto L256
            r5 = r0[r4]
            r14.putShort(r5)
            int r4 = r4 + 1
            goto L24c
        L256:
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            int r1 = r13.accessFlags
            int r4 = r13.signatureIndex
            net.bytebuddy.jar.asm.Attribute.putAttributes(r0, r1, r4, r14)
            net.bytebuddy.jar.asm.SymbolTable r5 = r13.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r6 = r13.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r7 = r13.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r8 = r13.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r9 = r13.lastRuntimeInvisibleTypeAnnotation
            r10 = r14
            net.bytebuddy.jar.asm.AnnotationWriter.putAnnotations(r5, r6, r7, r8, r9, r10)
            net.bytebuddy.jar.asm.AnnotationWriter[] r0 = r13.lastRuntimeVisibleParameterAnnotations
            if (r0 == 0) goto L283
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.AnnotationWriter[] r1 = r13.lastRuntimeVisibleParameterAnnotations
            int r4 = r13.visibleAnnotableParameterCount
            if (r4 != 0) goto L280
            int r4 = r1.length
        L280:
            net.bytebuddy.jar.asm.AnnotationWriter.putParameterAnnotations(r0, r1, r4, r14)
        L283:
            net.bytebuddy.jar.asm.AnnotationWriter[] r0 = r13.lastRuntimeInvisibleParameterAnnotations
            if (r0 == 0) goto L299
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.AnnotationWriter[] r1 = r13.lastRuntimeInvisibleParameterAnnotations
            int r4 = r13.invisibleAnnotableParameterCount
            if (r4 != 0) goto L296
            int r4 = r1.length
        L296:
            net.bytebuddy.jar.asm.AnnotationWriter.putParameterAnnotations(r0, r1, r4, r14)
        L299:
            net.bytebuddy.jar.asm.ByteVector r0 = r13.defaultValue
            if (r0 == 0) goto L2ba
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "AnnotationDefault"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r14.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.defaultValue
            int r1 = r1.length
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.defaultValue
            byte[] r4 = r1.data
            int r1 = r1.length
            r0.putByteArray(r4, r2, r1)
        L2ba:
            net.bytebuddy.jar.asm.ByteVector r0 = r13.parameters
            if (r0 == 0) goto L2e2
            net.bytebuddy.jar.asm.SymbolTable r0 = r13.symbolTable
            java.lang.String r1 = "MethodParameters"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r14.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.parameters
            int r1 = r1.length
            int r1 = r1 + r3
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            int r1 = r13.parametersCount
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r13.parameters
            byte[] r3 = r1.data
            int r1 = r1.length
            r0.putByteArray(r3, r2, r1)
        L2e2:
            net.bytebuddy.jar.asm.Attribute r0 = r13.firstAttribute
            if (r0 == 0) goto L2eb
            net.bytebuddy.jar.asm.SymbolTable r1 = r13.symbolTable
            r0.putAttributes(r1, r14)
        L2eb:
            return
    }

    public void setMethodAttributesSource(int r1, int r2) {
            r0 = this;
            int r1 = r1 + 6
            r0.sourceOffset = r1
            int r2 = r2 + (-6)
            r0.sourceLength = r2
            return
    }

    public void visitAbstractType(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.currentFrame
            r0[r2] = r3
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitAnnotableParameterCount(int r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.visibleAnnotableParameterCount = r1
            goto L7
        L5:
            r0.invisibleAnnotableParameterCount = r1
        L7:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Ld
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r3, r2, r0)
            r1.lastRuntimeVisibleAnnotation = r2
            return r2
        Ld:
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r3, r2, r0)
            r1.lastRuntimeInvisibleAnnotation = r2
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
            r5 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r5.defaultValue = r0
            net.bytebuddy.jar.asm.AnnotationWriter r1 = new net.bytebuddy.jar.asm.AnnotationWriter
            net.bytebuddy.jar.asm.SymbolTable r2 = r5.symbolTable
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitAttribute(net.bytebuddy.jar.asm.Attribute r2) {
            r1 = this;
            boolean r0 = r2.isCodeAttribute()
            if (r0 == 0) goto Ld
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstCodeAttribute
            r2.nextAttribute = r0
            r1.firstCodeAttribute = r2
            goto L13
        Ld:
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstAttribute
            r2.nextAttribute = r0
            r1.firstAttribute = r2
        L13:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitCode() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitEnd() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitFieldInsn(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.code
            int r0 = r0.length
            r3.lastBytecodeOffset = r0
            net.bytebuddy.jar.asm.SymbolTable r0 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r5 = r0.addConstantFieldref(r5, r6, r7)
            net.bytebuddy.jar.asm.ByteVector r6 = r3.code
            int r0 = r5.index
            r6.put12(r4, r0)
            net.bytebuddy.jar.asm.Label r6 = r3.currentBasicBlock
            if (r6 == 0) goto L61
            int r0 = r3.compute
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 3
            if (r0 != r1) goto L21
            goto L5a
        L21:
            char r5 = r7.charAt(r2)
            r6 = -2
            r7 = 1
            r0 = 74
            r1 = 68
            switch(r4) {
                case 178: goto L49;
                case 179: goto L40;
                case 180: goto L37;
                default: goto L2e;
            }
        L2e:
            int r4 = r3.relativeStackSize
            if (r5 == r1) goto L34
            if (r5 != r0) goto L35
        L34:
            r6 = -3
        L35:
            int r4 = r4 + r6
            goto L51
        L37:
            int r4 = r3.relativeStackSize
            if (r5 == r1) goto L3d
            if (r5 != r0) goto L3e
        L3d:
            r2 = r7
        L3e:
            int r4 = r4 + r2
            goto L51
        L40:
            int r4 = r3.relativeStackSize
            if (r5 == r1) goto L35
            if (r5 != r0) goto L47
            goto L35
        L47:
            r6 = -1
            goto L35
        L49:
            int r4 = r3.relativeStackSize
            if (r5 == r1) goto L4f
            if (r5 != r0) goto L50
        L4f:
            r7 = 2
        L50:
            int r4 = r4 + r7
        L51:
            int r5 = r3.maxRelativeStackSize
            if (r4 <= r5) goto L57
            r3.maxRelativeStackSize = r4
        L57:
            r3.relativeStackSize = r4
            goto L61
        L5a:
            net.bytebuddy.jar.asm.Frame r6 = r6.frame
            net.bytebuddy.jar.asm.SymbolTable r7 = r3.symbolTable
            r6.execute(r4, r2, r5, r7)
        L61:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitFrame(int r13, int r14, java.lang.Object[] r15, int r16, java.lang.Object[] r17) {
            r12 = this;
            r0 = r12
            r1 = r13
            r3 = r14
            r7 = r16
            int r2 = r0.compute
            r4 = 4
            if (r2 != r4) goto Lb
            return
        Lb:
            r5 = -1
            r8 = 2
            r6 = 3
            r9 = 0
            r10 = 1
            if (r2 != r6) goto L4c
            net.bytebuddy.jar.asm.Label r2 = r0.currentBasicBlock
            net.bytebuddy.jar.asm.Frame r4 = r2.frame
            if (r4 != 0) goto L35
            net.bytebuddy.jar.asm.CurrentFrame r1 = new net.bytebuddy.jar.asm.CurrentFrame
            r1.<init>(r2)
            r2.frame = r1
            net.bytebuddy.jar.asm.Label r1 = r0.currentBasicBlock
            net.bytebuddy.jar.asm.Frame r1 = r1.frame
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            int r4 = r0.accessFlags
            java.lang.String r5 = r0.descriptor
            r1.setInputFrameFromDescriptor(r2, r4, r5, r14)
            net.bytebuddy.jar.asm.Label r1 = r0.currentBasicBlock
            net.bytebuddy.jar.asm.Frame r1 = r1.frame
            r1.accept(r12)
            goto L178
        L35:
            if (r1 != r5) goto L43
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            r1 = r4
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r1.setInputFrameFromApiFormat(r2, r3, r4, r5, r6)
        L43:
            net.bytebuddy.jar.asm.Label r1 = r0.currentBasicBlock
            net.bytebuddy.jar.asm.Frame r1 = r1.frame
            r1.accept(r12)
            goto L178
        L4c:
            if (r1 != r5) goto La8
            int[] r1 = r0.previousFrame
            if (r1 != 0) goto L6f
            java.lang.String r1 = r0.descriptor
            int r1 = net.bytebuddy.jar.asm.Type.getArgumentsAndReturnSizes(r1)
            int r1 = r1 >> r8
            net.bytebuddy.jar.asm.Frame r2 = new net.bytebuddy.jar.asm.Frame
            net.bytebuddy.jar.asm.Label r4 = new net.bytebuddy.jar.asm.Label
            r4.<init>()
            r2.<init>(r4)
            net.bytebuddy.jar.asm.SymbolTable r4 = r0.symbolTable
            int r5 = r0.accessFlags
            java.lang.String r6 = r0.descriptor
            r2.setInputFrameFromDescriptor(r4, r5, r6, r1)
            r2.accept(r12)
        L6f:
            r0.currentLocals = r3
            net.bytebuddy.jar.asm.ByteVector r1 = r0.code
            int r1 = r1.length
            int r1 = r12.visitFrameStart(r1, r14, r7)
            r2 = r9
        L7a:
            if (r2 >= r3) goto L8e
            int[] r4 = r0.currentFrame
            int r5 = r1 + 1
            net.bytebuddy.jar.asm.SymbolTable r6 = r0.symbolTable
            r11 = r15[r2]
            int r6 = net.bytebuddy.jar.asm.Frame.getAbstractTypeFromApiFormat(r6, r11)
            r4[r1] = r6
            int r2 = r2 + 1
            r1 = r5
            goto L7a
        L8e:
            r2 = r9
        L8f:
            if (r2 >= r7) goto La3
            int[] r3 = r0.currentFrame
            int r4 = r1 + 1
            net.bytebuddy.jar.asm.SymbolTable r5 = r0.symbolTable
            r6 = r17[r2]
            int r5 = net.bytebuddy.jar.asm.Frame.getAbstractTypeFromApiFormat(r5, r6)
            r3[r1] = r5
            int r2 = r2 + 1
            r1 = r4
            goto L8f
        La3:
            r12.visitFrameEnd()
            goto L178
        La8:
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            int r2 = r2.getMajorVersion()
            r5 = 50
            if (r2 < r5) goto L1ad
            net.bytebuddy.jar.asm.ByteVector r2 = r0.stackMapTableEntries
            if (r2 != 0) goto Lc2
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>()
            r0.stackMapTableEntries = r2
            net.bytebuddy.jar.asm.ByteVector r2 = r0.code
            int r2 = r2.length
            goto Ld5
        Lc2:
            net.bytebuddy.jar.asm.ByteVector r2 = r0.code
            int r2 = r2.length
            int r5 = r0.previousFrameOffset
            int r2 = r2 - r5
            int r2 = r2 - r10
            if (r2 >= 0) goto Ld5
            if (r1 != r6) goto Lcf
            return
        Lcf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        Ld5:
            if (r1 == 0) goto L141
            if (r1 == r10) goto L126
            r5 = 251(0xfb, float:3.52E-43)
            if (r1 == r8) goto L116
            r3 = 64
            if (r1 == r6) goto L104
            if (r1 != r4) goto Lfe
            if (r2 >= r3) goto Lec
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            int r2 = r2 + r3
            r1.putByte(r2)
            goto Lf7
        Lec:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            r3 = 247(0xf7, float:3.46E-43)
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r3)
            r1.putShort(r2)
        Lf7:
            r1 = r17[r9]
            r12.putFrameType(r1)
            goto L16d
        Lfe:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L104:
            if (r2 >= r3) goto L10c
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            r1.putByte(r2)
            goto L16d
        L10c:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r5)
            r1.putShort(r2)
            goto L16d
        L116:
            int r1 = r0.currentLocals
            int r1 = r1 - r3
            r0.currentLocals = r1
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            int r5 = r5 - r3
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r5)
            r1.putShort(r2)
            goto L16d
        L126:
            int r1 = r0.currentLocals
            int r1 = r1 + r3
            r0.currentLocals = r1
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            int r4 = r3 + 251
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r4)
            r1.putShort(r2)
            r1 = r9
        L137:
            if (r1 >= r3) goto L16d
            r2 = r15[r1]
            r12.putFrameType(r2)
            int r1 = r1 + 1
            goto L137
        L141:
            r0.currentLocals = r3
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            r4 = 255(0xff, float:3.57E-43)
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putByte(r4)
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r2)
            r1.putShort(r14)
            r1 = r9
        L153:
            if (r1 >= r3) goto L15d
            r2 = r15[r1]
            r12.putFrameType(r2)
            int r1 = r1 + 1
            goto L153
        L15d:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.stackMapTableEntries
            r1.putShort(r7)
            r1 = r9
        L163:
            if (r1 >= r7) goto L16d
            r2 = r17[r1]
            r12.putFrameType(r2)
            int r1 = r1 + 1
            goto L163
        L16d:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.code
            int r1 = r1.length
            r0.previousFrameOffset = r1
            int r1 = r0.stackMapTableNumberOfEntries
            int r1 = r1 + r10
            r0.stackMapTableNumberOfEntries = r1
        L178:
            int r1 = r0.compute
            if (r1 != r8) goto L19a
            r0.relativeStackSize = r7
        L17e:
            if (r9 >= r7) goto L192
            r1 = r17[r9]
            java.lang.Integer r2 = net.bytebuddy.jar.asm.Opcodes.LONG
            if (r1 == r2) goto L18a
            java.lang.Integer r2 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            if (r1 != r2) goto L18f
        L18a:
            int r1 = r0.relativeStackSize
            int r1 = r1 + r10
            r0.relativeStackSize = r1
        L18f:
            int r9 = r9 + 1
            goto L17e
        L192:
            int r1 = r0.relativeStackSize
            int r2 = r0.maxRelativeStackSize
            if (r1 <= r2) goto L19a
            r0.maxRelativeStackSize = r1
        L19a:
            int r1 = r0.maxStack
            int r1 = java.lang.Math.max(r1, r7)
            r0.maxStack = r1
            int r1 = r0.maxLocals
            int r2 = r0.currentLocals
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            return
        L1ad:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Class versions V1_5 or less must use F_NEW frames."
            r1.<init>(r2)
            throw r1
    }

    public void visitFrameEnd() {
            r1 = this;
            int[] r0 = r1.previousFrame
            if (r0 == 0) goto L18
            net.bytebuddy.jar.asm.ByteVector r0 = r1.stackMapTableEntries
            if (r0 != 0) goto Lf
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r1.stackMapTableEntries = r0
        Lf:
            r1.putFrame()
            int r0 = r1.stackMapTableNumberOfEntries
            int r0 = r0 + 1
            r1.stackMapTableNumberOfEntries = r0
        L18:
            int[] r0 = r1.currentFrame
            r1.previousFrame = r0
            r0 = 0
            r1.currentFrame = r0
            return
    }

    public int visitFrameStart(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r4 + 3
            int r0 = r0 + r5
            int[] r1 = r2.currentFrame
            if (r1 == 0) goto La
            int r1 = r1.length
            if (r1 >= r0) goto Le
        La:
            int[] r0 = new int[r0]
            r2.currentFrame = r0
        Le:
            int[] r0 = r2.currentFrame
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r3 = 3
            return r3
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitIincInsn(int r4, int r5) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.code
            int r1 = r0.length
            r3.lastBytecodeOffset = r1
            r1 = 255(0xff, float:3.57E-43)
            r2 = 132(0x84, float:1.85E-43)
            if (r4 > r1) goto L1d
            r1 = 127(0x7f, float:1.78E-43)
            if (r5 > r1) goto L1d
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r5 >= r1) goto L15
            goto L1d
        L15:
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r2)
            r0.put11(r4, r5)
            goto L2a
        L1d:
            r1 = 196(0xc4, float:2.75E-43)
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r0.put12(r2, r4)
            r0.putShort(r5)
        L2a:
            net.bytebuddy.jar.asm.Label r5 = r3.currentBasicBlock
            if (r5 == 0) goto L3c
            int r0 = r3.compute
            r1 = 4
            if (r0 == r1) goto L36
            r1 = 3
            if (r0 != r1) goto L3c
        L36:
            net.bytebuddy.jar.asm.Frame r5 = r5.frame
            r0 = 0
            r5.execute(r2, r4, r0, r0)
        L3c:
            int r5 = r3.compute
            if (r5 == 0) goto L48
            int r4 = r4 + 1
            int r5 = r3.maxLocals
            if (r4 <= r5) goto L48
            r3.maxLocals = r4
        L48:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitInsn(int r4) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.code
            int r1 = r0.length
            r3.lastBytecodeOffset = r1
            r0.putByte(r4)
            net.bytebuddy.jar.asm.Label r0 = r3.currentBasicBlock
            if (r0 == 0) goto L3c
            int r1 = r3.compute
            r2 = 4
            if (r1 == r2) goto L26
            r2 = 3
            if (r1 != r2) goto L16
            goto L26
        L16:
            int r0 = r3.relativeStackSize
            int[] r1 = net.bytebuddy.jar.asm.MethodWriter.STACK_SIZE_DELTA
            r1 = r1[r4]
            int r0 = r0 + r1
            int r1 = r3.maxRelativeStackSize
            if (r0 <= r1) goto L23
            r3.maxRelativeStackSize = r0
        L23:
            r3.relativeStackSize = r0
            goto L2d
        L26:
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            r1 = 0
            r2 = 0
            r0.execute(r4, r1, r2, r2)
        L2d:
            r0 = 172(0xac, float:2.41E-43)
            if (r4 < r0) goto L35
            r0 = 177(0xb1, float:2.48E-43)
            if (r4 <= r0) goto L39
        L35:
            r0 = 191(0xbf, float:2.68E-43)
            if (r4 != r0) goto L3c
        L39:
            r3.endCurrentBasicBlockWithNoSuccessor()
        L3c:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitInsnAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            if (r5 == 0) goto L16
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            r2 = r2 & r0
            int r0 = r1.lastBytecodeOffset
            int r0 = r0 << 8
            r2 = r2 | r0
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastCodeRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastCodeRuntimeVisibleTypeAnnotation = r2
            return r2
        L16:
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            r2 = r2 & r0
            int r0 = r1.lastBytecodeOffset
            int r0 = r0 << 8
            r2 = r2 | r0
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastCodeRuntimeInvisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastCodeRuntimeInvisibleTypeAnnotation = r2
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitIntInsn(int r4, int r5) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.code
            int r1 = r0.length
            r3.lastBytecodeOffset = r1
            r1 = 17
            if (r4 != r1) goto Le
            r0.put12(r4, r5)
            goto L11
        Le:
            r0.put11(r4, r5)
        L11:
            net.bytebuddy.jar.asm.Label r0 = r3.currentBasicBlock
            if (r0 == 0) goto L35
            int r1 = r3.compute
            r2 = 4
            if (r1 == r2) goto L2f
            r2 = 3
            if (r1 != r2) goto L1e
            goto L2f
        L1e:
            r5 = 188(0xbc, float:2.63E-43)
            if (r4 == r5) goto L35
            int r4 = r3.relativeStackSize
            int r4 = r4 + 1
            int r5 = r3.maxRelativeStackSize
            if (r4 <= r5) goto L2c
            r3.maxRelativeStackSize = r4
        L2c:
            r3.relativeStackSize = r4
            goto L35
        L2f:
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            r1 = 0
            r0.execute(r4, r5, r1, r1)
        L35:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r3, java.lang.String r4, net.bytebuddy.jar.asm.Handle r5, java.lang.Object... r6) {
            r2 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r2.code
            int r0 = r0.length
            r2.lastBytecodeOffset = r0
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            net.bytebuddy.jar.asm.Symbol r3 = r0.addConstantInvokeDynamic(r3, r4, r5, r6)
            net.bytebuddy.jar.asm.ByteVector r4 = r2.code
            int r5 = r3.index
            r6 = 186(0xba, float:2.6E-43)
            r4.put12(r6, r5)
            net.bytebuddy.jar.asm.ByteVector r4 = r2.code
            r5 = 0
            r4.putShort(r5)
            net.bytebuddy.jar.asm.Label r4 = r2.currentBasicBlock
            if (r4 == 0) goto L46
            int r0 = r2.compute
            r1 = 4
            if (r0 == r1) goto L3f
            r1 = 3
            if (r0 != r1) goto L28
            goto L3f
        L28:
            int r3 = r3.getArgumentsAndReturnSizes()
            r4 = r3 & 3
            int r3 = r3 >> 2
            int r4 = r4 - r3
            int r4 = r4 + 1
            int r3 = r2.relativeStackSize
            int r3 = r3 + r4
            int r4 = r2.maxRelativeStackSize
            if (r3 <= r4) goto L3c
            r2.maxRelativeStackSize = r3
        L3c:
            r2.relativeStackSize = r3
            goto L46
        L3f:
            net.bytebuddy.jar.asm.Frame r4 = r4.frame
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            r4.execute(r6, r5, r3, r0)
        L46:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitJumpInsn(int r11, net.bytebuddy.jar.asm.Label r12) {
            r10 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r10.code
            int r1 = r0.length
            r10.lastBytecodeOffset = r1
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 < r2) goto Ld
            int r3 = r11 + (-33)
            goto Le
        Ld:
            r3 = r11
        Le:
            short r4 = r12.flags
            r5 = 4
            r4 = r4 & r5
            r6 = 168(0xa8, float:2.35E-43)
            r7 = 167(0xa7, float:2.34E-43)
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L58
            int r4 = r12.bytecodeOffset
            int r4 = r4 - r1
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r4 >= r1) goto L58
            if (r3 != r7) goto L27
            r0.putByte(r2)
            goto L2e
        L27:
            if (r3 != r6) goto L30
            r11 = 201(0xc9, float:2.82E-43)
            r0.putByte(r11)
        L2e:
            r11 = r8
            goto L4f
        L30:
            r11 = 198(0xc6, float:2.77E-43)
            if (r3 < r11) goto L37
            r11 = r3 ^ 1
            goto L3b
        L37:
            int r11 = r3 + 1
            r11 = r11 ^ r9
            int r11 = r11 - r9
        L3b:
            r0.putByte(r11)
            net.bytebuddy.jar.asm.ByteVector r11 = r10.code
            r0 = 8
            r11.putShort(r0)
            net.bytebuddy.jar.asm.ByteVector r11 = r10.code
            r0 = 220(0xdc, float:3.08E-43)
            r11.putByte(r0)
            r10.hasAsmInstructions = r9
            r11 = r9
        L4f:
            net.bytebuddy.jar.asm.ByteVector r0 = r10.code
            int r1 = r0.length
            int r1 = r1 - r9
            r12.put(r0, r1, r9)
            goto L72
        L58:
            if (r3 == r11) goto L66
            r0.putByte(r11)
            net.bytebuddy.jar.asm.ByteVector r11 = r10.code
            int r0 = r11.length
            int r0 = r0 - r9
            r12.put(r11, r0, r9)
            goto L71
        L66:
            r0.putByte(r3)
            net.bytebuddy.jar.asm.ByteVector r11 = r10.code
            int r0 = r11.length
            int r0 = r0 - r9
            r12.put(r11, r0, r8)
        L71:
            r11 = r8
        L72:
            net.bytebuddy.jar.asm.Label r0 = r10.currentBasicBlock
            if (r0 == 0) goto Leb
            int r1 = r10.compute
            r2 = 2
            r4 = 0
            if (r1 != r5) goto L96
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            r0.execute(r3, r8, r4, r4)
            net.bytebuddy.jar.asm.Label r0 = r12.getCanonicalInstance()
            short r1 = r0.flags
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r10.addSuccessorToCurrentBasicBlock(r8, r12)
            if (r3 == r7) goto Ld9
            net.bytebuddy.jar.asm.Label r4 = new net.bytebuddy.jar.asm.Label
            r4.<init>()
            goto Ld9
        L96:
            r5 = 3
            if (r1 != r5) goto L9f
            net.bytebuddy.jar.asm.Frame r12 = r0.frame
            r12.execute(r3, r8, r4, r4)
            goto Ld9
        L9f:
            if (r1 != r2) goto Lab
            int r12 = r10.relativeStackSize
            int[] r0 = net.bytebuddy.jar.asm.MethodWriter.STACK_SIZE_DELTA
            r0 = r0[r3]
            int r12 = r12 + r0
            r10.relativeStackSize = r12
            goto Ld9
        Lab:
            if (r3 != r6) goto Lcd
            short r1 = r12.flags
            r4 = r1 & 32
            if (r4 != 0) goto Lba
            r1 = r1 | 32
            short r1 = (short) r1
            r12.flags = r1
            r10.hasSubroutines = r9
        Lba:
            short r1 = r0.flags
            r1 = r1 | 16
            short r1 = (short) r1
            r0.flags = r1
            int r0 = r10.relativeStackSize
            int r0 = r0 + r9
            r10.addSuccessorToCurrentBasicBlock(r0, r12)
            net.bytebuddy.jar.asm.Label r4 = new net.bytebuddy.jar.asm.Label
            r4.<init>()
            goto Ld9
        Lcd:
            int r0 = r10.relativeStackSize
            int[] r1 = net.bytebuddy.jar.asm.MethodWriter.STACK_SIZE_DELTA
            r1 = r1[r3]
            int r0 = r0 + r1
            r10.relativeStackSize = r0
            r10.addSuccessorToCurrentBasicBlock(r0, r12)
        Ld9:
            if (r4 == 0) goto Le6
            if (r11 == 0) goto Le3
            short r11 = r4.flags
            r11 = r11 | r2
            short r11 = (short) r11
            r4.flags = r11
        Le3:
            r10.visitLabel(r4)
        Le6:
            if (r3 != r7) goto Leb
            r10.endCurrentBasicBlockWithNoSuccessor()
        Leb:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLabel(net.bytebuddy.jar.asm.Label r7) {
            r6 = this;
            boolean r0 = r6.hasAsmInstructions
            net.bytebuddy.jar.asm.ByteVector r1 = r6.code
            byte[] r2 = r1.data
            net.bytebuddy.jar.asm.ByteVector r3 = r6.stackMapTableEntries
            int r1 = r1.length
            boolean r1 = r7.resolve(r2, r3, r1)
            r0 = r0 | r1
            r6.hasAsmInstructions = r0
            short r0 = r7.flags
            r1 = r0 & 1
            if (r1 == 0) goto L18
            return
        L18:
            int r1 = r6.compute
            r2 = 4
            r3 = 0
            r4 = 2
            if (r1 != r2) goto L60
            net.bytebuddy.jar.asm.Label r1 = r6.currentBasicBlock
            if (r1 == 0) goto L38
            int r2 = r7.bytecodeOffset
            int r5 = r1.bytecodeOffset
            if (r2 != r5) goto L35
            short r2 = r1.flags
            r0 = r0 & r4
            r0 = r0 | r2
            short r0 = (short) r0
            r1.flags = r0
            net.bytebuddy.jar.asm.Frame r0 = r1.frame
            r7.frame = r0
            return
        L35:
            r6.addSuccessorToCurrentBasicBlock(r3, r7)
        L38:
            net.bytebuddy.jar.asm.Label r0 = r6.lastBasicBlock
            if (r0 == 0) goto L54
            int r1 = r7.bytecodeOffset
            int r2 = r0.bytecodeOffset
            if (r1 != r2) goto L52
            short r1 = r0.flags
            short r2 = r7.flags
            r2 = r2 & r4
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            net.bytebuddy.jar.asm.Frame r1 = r0.frame
            r7.frame = r1
            r6.currentBasicBlock = r0
            return
        L52:
            r0.nextBasicBlock = r7
        L54:
            r6.lastBasicBlock = r7
            r6.currentBasicBlock = r7
            net.bytebuddy.jar.asm.Frame r0 = new net.bytebuddy.jar.asm.Frame
            r0.<init>(r7)
            r7.frame = r0
            goto L97
        L60:
            r0 = 3
            if (r1 != r0) goto L6f
            net.bytebuddy.jar.asm.Label r0 = r6.currentBasicBlock
            if (r0 != 0) goto L6a
            r6.currentBasicBlock = r7
            goto L97
        L6a:
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            r0.owner = r7
            goto L97
        L6f:
            r0 = 1
            if (r1 != r0) goto L8f
            net.bytebuddy.jar.asm.Label r0 = r6.currentBasicBlock
            if (r0 == 0) goto L80
            int r1 = r6.maxRelativeStackSize
            short r1 = (short) r1
            r0.outputStackMax = r1
            int r0 = r6.relativeStackSize
            r6.addSuccessorToCurrentBasicBlock(r0, r7)
        L80:
            r6.currentBasicBlock = r7
            r6.relativeStackSize = r3
            r6.maxRelativeStackSize = r3
            net.bytebuddy.jar.asm.Label r0 = r6.lastBasicBlock
            if (r0 == 0) goto L8c
            r0.nextBasicBlock = r7
        L8c:
            r6.lastBasicBlock = r7
            goto L97
        L8f:
            if (r1 != r4) goto L97
            net.bytebuddy.jar.asm.Label r0 = r6.currentBasicBlock
            if (r0 != 0) goto L97
            r6.currentBasicBlock = r7
        L97:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r8) {
            r7 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r7.code
            int r0 = r0.length
            r7.lastBytecodeOffset = r0
            net.bytebuddy.jar.asm.SymbolTable r0 = r7.symbolTable
            net.bytebuddy.jar.asm.Symbol r8 = r0.addConstant(r8)
            int r0 = r8.index
            int r1 = r8.tag
            r2 = 5
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L2d
            r2 = 6
            if (r1 == r2) goto L2d
            r2 = 17
            if (r1 != r2) goto L2b
            java.lang.String r1 = r8.value
            char r1 = r1.charAt(r4)
            r2 = 74
            if (r1 == r2) goto L2d
            r2 = 68
            if (r1 != r2) goto L2b
            goto L2d
        L2b:
            r1 = r4
            goto L2e
        L2d:
            r1 = r3
        L2e:
            r2 = 18
            if (r1 == 0) goto L3a
            net.bytebuddy.jar.asm.ByteVector r5 = r7.code
            r6 = 20
            r5.put12(r6, r0)
            goto L4b
        L3a:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 < r5) goto L46
            net.bytebuddy.jar.asm.ByteVector r5 = r7.code
            r6 = 19
            r5.put12(r6, r0)
            goto L4b
        L46:
            net.bytebuddy.jar.asm.ByteVector r5 = r7.code
            r5.put11(r2, r0)
        L4b:
            net.bytebuddy.jar.asm.Label r0 = r7.currentBasicBlock
            if (r0 == 0) goto L6e
            int r5 = r7.compute
            r6 = 4
            if (r5 == r6) goto L67
            r6 = 3
            if (r5 != r6) goto L58
            goto L67
        L58:
            int r8 = r7.relativeStackSize
            if (r1 == 0) goto L5d
            r3 = 2
        L5d:
            int r8 = r8 + r3
            int r0 = r7.maxRelativeStackSize
            if (r8 <= r0) goto L64
            r7.maxRelativeStackSize = r8
        L64:
            r7.relativeStackSize = r8
            goto L6e
        L67:
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            net.bytebuddy.jar.asm.SymbolTable r1 = r7.symbolTable
            r0.execute(r2, r4, r8, r1)
        L6e:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLineNumber(int r2, net.bytebuddy.jar.asm.Label r3) {
            r1 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r1.lineNumberTable
            if (r0 != 0) goto Lb
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r1.lineNumberTable = r0
        Lb:
            int r0 = r1.lineNumberTableLength
            int r0 = r0 + 1
            r1.lineNumberTableLength = r0
            net.bytebuddy.jar.asm.ByteVector r0 = r1.lineNumberTable
            int r3 = r3.bytecodeOffset
            r0.putShort(r3)
            net.bytebuddy.jar.asm.ByteVector r3 = r1.lineNumberTable
            r3.putShort(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r5, java.lang.String r6, java.lang.String r7, net.bytebuddy.jar.asm.Label r8, net.bytebuddy.jar.asm.Label r9, int r10) {
            r4 = this;
            r0 = 1
            if (r7 == 0) goto L3b
            net.bytebuddy.jar.asm.ByteVector r1 = r4.localVariableTypeTable
            if (r1 != 0) goto Le
            net.bytebuddy.jar.asm.ByteVector r1 = new net.bytebuddy.jar.asm.ByteVector
            r1.<init>()
            r4.localVariableTypeTable = r1
        Le:
            int r1 = r4.localVariableTypeTableLength
            int r1 = r1 + r0
            r4.localVariableTypeTableLength = r1
            net.bytebuddy.jar.asm.ByteVector r1 = r4.localVariableTypeTable
            int r2 = r8.bytecodeOffset
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r2)
            int r2 = r9.bytecodeOffset
            int r3 = r8.bytecodeOffset
            int r2 = r2 - r3
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r2)
            net.bytebuddy.jar.asm.SymbolTable r2 = r4.symbolTable
            int r2 = r2.addConstantUtf8(r5)
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r2)
            net.bytebuddy.jar.asm.SymbolTable r2 = r4.symbolTable
            int r7 = r2.addConstantUtf8(r7)
            net.bytebuddy.jar.asm.ByteVector r7 = r1.putShort(r7)
            r7.putShort(r10)
        L3b:
            net.bytebuddy.jar.asm.ByteVector r7 = r4.localVariableTable
            if (r7 != 0) goto L46
            net.bytebuddy.jar.asm.ByteVector r7 = new net.bytebuddy.jar.asm.ByteVector
            r7.<init>()
            r4.localVariableTable = r7
        L46:
            int r7 = r4.localVariableTableLength
            int r7 = r7 + r0
            r4.localVariableTableLength = r7
            net.bytebuddy.jar.asm.ByteVector r7 = r4.localVariableTable
            int r1 = r8.bytecodeOffset
            net.bytebuddy.jar.asm.ByteVector r7 = r7.putShort(r1)
            int r9 = r9.bytecodeOffset
            int r8 = r8.bytecodeOffset
            int r9 = r9 - r8
            net.bytebuddy.jar.asm.ByteVector r7 = r7.putShort(r9)
            net.bytebuddy.jar.asm.SymbolTable r8 = r4.symbolTable
            int r5 = r8.addConstantUtf8(r5)
            net.bytebuddy.jar.asm.ByteVector r5 = r7.putShort(r5)
            net.bytebuddy.jar.asm.SymbolTable r7 = r4.symbolTable
            int r7 = r7.addConstantUtf8(r6)
            net.bytebuddy.jar.asm.ByteVector r5 = r5.putShort(r7)
            r5.putShort(r10)
            int r5 = r4.compute
            if (r5 == 0) goto L8c
            r5 = 0
            char r5 = r6.charAt(r5)
            r6 = 74
            if (r5 == r6) goto L84
            r6 = 68
            if (r5 != r6) goto L85
        L84:
            r0 = 2
        L85:
            int r10 = r10 + r0
            int r5 = r4.maxLocals
            if (r10 <= r5) goto L8c
            r4.maxLocals = r10
        L8c:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitLocalVariableAnnotation(int r6, net.bytebuddy.jar.asm.TypePath r7, net.bytebuddy.jar.asm.Label[] r8, net.bytebuddy.jar.asm.Label[] r9, int[] r10, java.lang.String r11, boolean r12) {
            r5 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            int r6 = r6 >>> 24
            net.bytebuddy.jar.asm.ByteVector r6 = r0.putByte(r6)
            int r1 = r8.length
            r6.putShort(r1)
            r6 = 0
            r1 = r6
        L11:
            int r2 = r8.length
            if (r1 >= r2) goto L31
            r2 = r8[r1]
            int r2 = r2.bytecodeOffset
            net.bytebuddy.jar.asm.ByteVector r2 = r0.putShort(r2)
            r3 = r9[r1]
            int r3 = r3.bytecodeOffset
            r4 = r8[r1]
            int r4 = r4.bytecodeOffset
            int r3 = r3 - r4
            net.bytebuddy.jar.asm.ByteVector r2 = r2.putShort(r3)
            r3 = r10[r1]
            r2.putShort(r3)
            int r1 = r1 + 1
            goto L11
        L31:
            net.bytebuddy.jar.asm.TypePath.put(r7, r0)
            net.bytebuddy.jar.asm.SymbolTable r7 = r5.symbolTable
            int r7 = r7.addConstantUtf8(r11)
            net.bytebuddy.jar.asm.ByteVector r7 = r0.putShort(r7)
            r7.putShort(r6)
            r6 = 1
            if (r12 == 0) goto L50
            net.bytebuddy.jar.asm.AnnotationWriter r7 = new net.bytebuddy.jar.asm.AnnotationWriter
            net.bytebuddy.jar.asm.SymbolTable r8 = r5.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r9 = r5.lastCodeRuntimeVisibleTypeAnnotation
            r7.<init>(r8, r6, r0, r9)
            r5.lastCodeRuntimeVisibleTypeAnnotation = r7
            return r7
        L50:
            net.bytebuddy.jar.asm.AnnotationWriter r7 = new net.bytebuddy.jar.asm.AnnotationWriter
            net.bytebuddy.jar.asm.SymbolTable r8 = r5.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r9 = r5.lastCodeRuntimeInvisibleTypeAnnotation
            r7.<init>(r8, r6, r0, r9)
            r5.lastCodeRuntimeInvisibleTypeAnnotation = r7
            return r7
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLookupSwitchInsn(net.bytebuddy.jar.asm.Label r6, int[] r7, net.bytebuddy.jar.asm.Label[] r8) {
            r5 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r5.code
            int r1 = r0.length
            r5.lastBytecodeOffset = r1
            r1 = 171(0xab, float:2.4E-43)
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r5.code
            int r1 = r1.length
            int r1 = r1 % 4
            int r1 = 4 - r1
            int r1 = r1 % 4
            r2 = 0
            r3 = 0
            r0.putByteArray(r2, r3, r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r5.code
            int r1 = r5.lastBytecodeOffset
            r2 = 1
            r6.put(r0, r1, r2)
            net.bytebuddy.jar.asm.ByteVector r0 = r5.code
            int r1 = r8.length
            r0.putInt(r1)
        L29:
            int r0 = r8.length
            if (r3 >= r0) goto L3f
            net.bytebuddy.jar.asm.ByteVector r0 = r5.code
            r1 = r7[r3]
            r0.putInt(r1)
            r0 = r8[r3]
            net.bytebuddy.jar.asm.ByteVector r1 = r5.code
            int r4 = r5.lastBytecodeOffset
            r0.put(r1, r4, r2)
            int r3 = r3 + 1
            goto L29
        L3f:
            r5.visitSwitchInsn(r6, r8)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMaxs(int r3, int r4) {
            r2 = this;
            int r0 = r2.compute
            r1 = 4
            if (r0 != r1) goto L9
            r2.computeAllFrames()
            goto L1c
        L9:
            r1 = 1
            if (r0 != r1) goto L10
            r2.computeMaxStackAndLocal()
            goto L1c
        L10:
            r1 = 2
            if (r0 != r1) goto L18
            int r3 = r2.maxRelativeStackSize
            r2.maxStack = r3
            goto L1c
        L18:
            r2.maxStack = r3
            r2.maxLocals = r4
        L1c:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMethodInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r1 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r1.code
            int r0 = r0.length
            r1.lastBytecodeOffset = r0
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r3 = r0.addConstantMethodref(r3, r4, r5, r6)
            r4 = 0
            r5 = 185(0xb9, float:2.59E-43)
            if (r2 != r5) goto L23
            net.bytebuddy.jar.asm.ByteVector r6 = r1.code
            int r0 = r3.index
            net.bytebuddy.jar.asm.ByteVector r5 = r6.put12(r5, r0)
            int r6 = r3.getArgumentsAndReturnSizes()
            int r6 = r6 >> 2
            r5.put11(r6, r4)
            goto L2a
        L23:
            net.bytebuddy.jar.asm.ByteVector r5 = r1.code
            int r6 = r3.index
            r5.put12(r2, r6)
        L2a:
            net.bytebuddy.jar.asm.Label r5 = r1.currentBasicBlock
            if (r5 == 0) goto L5d
            int r6 = r1.compute
            r0 = 4
            if (r6 == r0) goto L56
            r0 = 3
            if (r6 != r0) goto L37
            goto L56
        L37:
            int r3 = r3.getArgumentsAndReturnSizes()
            r4 = r3 & 3
            int r3 = r3 >> 2
            int r4 = r4 - r3
            r3 = 184(0xb8, float:2.58E-43)
            if (r2 != r3) goto L4a
            int r2 = r1.relativeStackSize
            int r2 = r2 + r4
            int r2 = r2 + 1
            goto L4d
        L4a:
            int r2 = r1.relativeStackSize
            int r2 = r2 + r4
        L4d:
            int r3 = r1.maxRelativeStackSize
            if (r2 <= r3) goto L53
            r1.maxRelativeStackSize = r2
        L53:
            r1.relativeStackSize = r2
            goto L5d
        L56:
            net.bytebuddy.jar.asm.Frame r5 = r5.frame
            net.bytebuddy.jar.asm.SymbolTable r6 = r1.symbolTable
            r5.execute(r2, r4, r3, r6)
        L5d:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r5, int r6) {
            r4 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r4.code
            int r0 = r0.length
            r4.lastBytecodeOffset = r0
            net.bytebuddy.jar.asm.SymbolTable r0 = r4.symbolTable
            net.bytebuddy.jar.asm.Symbol r5 = r0.addConstantClass(r5)
            net.bytebuddy.jar.asm.ByteVector r0 = r4.code
            int r1 = r5.index
            r2 = 197(0xc5, float:2.76E-43)
            net.bytebuddy.jar.asm.ByteVector r0 = r0.put12(r2, r1)
            r0.putByte(r6)
            net.bytebuddy.jar.asm.Label r0 = r4.currentBasicBlock
            if (r0 == 0) goto L35
            int r1 = r4.compute
            r3 = 4
            if (r1 == r3) goto L2e
            r3 = 3
            if (r1 != r3) goto L26
            goto L2e
        L26:
            int r5 = r4.relativeStackSize
            int r6 = 1 - r6
            int r5 = r5 + r6
            r4.relativeStackSize = r5
            goto L35
        L2e:
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            net.bytebuddy.jar.asm.SymbolTable r1 = r4.symbolTable
            r0.execute(r2, r6, r5, r1)
        L35:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitParameter(java.lang.String r3, int r4) {
            r2 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r2.parameters
            if (r0 != 0) goto Lb
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r2.parameters = r0
        Lb:
            int r0 = r2.parametersCount
            int r0 = r0 + 1
            r2.parametersCount = r0
            net.bytebuddy.jar.asm.ByteVector r0 = r2.parameters
            if (r3 != 0) goto L17
            r3 = 0
            goto L1d
        L17:
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            int r3 = r1.addConstantUtf8(r3)
        L1d:
            net.bytebuddy.jar.asm.ByteVector r3 = r0.putShort(r3)
            r3.putShort(r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitParameterAnnotation(int r3, java.lang.String r4, boolean r5) {
            r2 = this;
            if (r5 == 0) goto L1d
            net.bytebuddy.jar.asm.AnnotationWriter[] r5 = r2.lastRuntimeVisibleParameterAnnotations
            if (r5 != 0) goto L10
            java.lang.String r5 = r2.descriptor
            int r5 = net.bytebuddy.jar.asm.Type.getArgumentCount(r5)
            net.bytebuddy.jar.asm.AnnotationWriter[] r5 = new net.bytebuddy.jar.asm.AnnotationWriter[r5]
            r2.lastRuntimeVisibleParameterAnnotations = r5
        L10:
            net.bytebuddy.jar.asm.AnnotationWriter[] r5 = r2.lastRuntimeVisibleParameterAnnotations
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            r1 = r5[r3]
            net.bytebuddy.jar.asm.AnnotationWriter r4 = net.bytebuddy.jar.asm.AnnotationWriter.create(r0, r4, r1)
            r5[r3] = r4
            return r4
        L1d:
            net.bytebuddy.jar.asm.AnnotationWriter[] r5 = r2.lastRuntimeInvisibleParameterAnnotations
            if (r5 != 0) goto L2b
            java.lang.String r5 = r2.descriptor
            int r5 = net.bytebuddy.jar.asm.Type.getArgumentCount(r5)
            net.bytebuddy.jar.asm.AnnotationWriter[] r5 = new net.bytebuddy.jar.asm.AnnotationWriter[r5]
            r2.lastRuntimeInvisibleParameterAnnotations = r5
        L2b:
            net.bytebuddy.jar.asm.AnnotationWriter[] r5 = r2.lastRuntimeInvisibleParameterAnnotations
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            r1 = r5[r3]
            net.bytebuddy.jar.asm.AnnotationWriter r4 = net.bytebuddy.jar.asm.AnnotationWriter.create(r0, r4, r1)
            r5[r3] = r4
            return r4
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTableSwitchInsn(int r5, int r6, net.bytebuddy.jar.asm.Label r7, net.bytebuddy.jar.asm.Label... r8) {
            r4 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r4.code
            int r1 = r0.length
            r4.lastBytecodeOffset = r1
            r1 = 170(0xaa, float:2.38E-43)
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r4.code
            int r1 = r1.length
            int r1 = r1 % 4
            int r1 = 4 - r1
            int r1 = r1 % 4
            r2 = 0
            r3 = 0
            r0.putByteArray(r2, r3, r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r4.code
            int r1 = r4.lastBytecodeOffset
            r2 = 1
            r7.put(r0, r1, r2)
            net.bytebuddy.jar.asm.ByteVector r0 = r4.code
            net.bytebuddy.jar.asm.ByteVector r5 = r0.putInt(r5)
            r5.putInt(r6)
            int r5 = r8.length
        L2d:
            if (r3 >= r5) goto L3b
            r6 = r8[r3]
            net.bytebuddy.jar.asm.ByteVector r0 = r4.code
            int r1 = r4.lastBytecodeOffset
            r6.put(r0, r1, r2)
            int r3 = r3 + 1
            goto L2d
        L3b:
            r4.visitSwitchInsn(r7, r8)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitTryCatchAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto Ld
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastCodeRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastCodeRuntimeVisibleTypeAnnotation = r2
            return r2
        Ld:
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastCodeRuntimeInvisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastCodeRuntimeInvisibleTypeAnnotation = r2
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTryCatchBlock(net.bytebuddy.jar.asm.Label r8, net.bytebuddy.jar.asm.Label r9, net.bytebuddy.jar.asm.Label r10, java.lang.String r11) {
            r7 = this;
            net.bytebuddy.jar.asm.Handler r6 = new net.bytebuddy.jar.asm.Handler
            if (r11 == 0) goto Le
            net.bytebuddy.jar.asm.SymbolTable r0 = r7.symbolTable
            net.bytebuddy.jar.asm.Symbol r0 = r0.addConstantClass(r11)
            int r0 = r0.index
        Lc:
            r4 = r0
            goto L10
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.jar.asm.Handler r8 = r7.firstHandler
            if (r8 != 0) goto L1f
            r7.firstHandler = r6
            goto L23
        L1f:
            net.bytebuddy.jar.asm.Handler r8 = r7.lastHandler
            r8.nextHandler = r6
        L23:
            r7.lastHandler = r6
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto Ld
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastRuntimeVisibleTypeAnnotation = r2
            return r2
        Ld:
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeInvisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastRuntimeInvisibleTypeAnnotation = r2
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTypeInsn(int r4, java.lang.String r5) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.code
            int r0 = r0.length
            r3.lastBytecodeOffset = r0
            net.bytebuddy.jar.asm.SymbolTable r0 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r5 = r0.addConstantClass(r5)
            net.bytebuddy.jar.asm.ByteVector r0 = r3.code
            int r1 = r5.index
            r0.put12(r4, r1)
            net.bytebuddy.jar.asm.Label r0 = r3.currentBasicBlock
            if (r0 == 0) goto L3a
            int r1 = r3.compute
            r2 = 4
            if (r1 == r2) goto L31
            r2 = 3
            if (r1 != r2) goto L20
            goto L31
        L20:
            r5 = 187(0xbb, float:2.62E-43)
            if (r4 != r5) goto L3a
            int r4 = r3.relativeStackSize
            int r4 = r4 + 1
            int r5 = r3.maxRelativeStackSize
            if (r4 <= r5) goto L2e
            r3.maxRelativeStackSize = r4
        L2e:
            r3.relativeStackSize = r4
            goto L3a
        L31:
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            int r1 = r3.lastBytecodeOffset
            net.bytebuddy.jar.asm.SymbolTable r2 = r3.symbolTable
            r0.execute(r4, r1, r5, r2)
        L3a:
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitVarInsn(int r7, int r8) {
            r6 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r6.code
            int r1 = r0.length
            r6.lastBytecodeOffset = r1
            r1 = 169(0xa9, float:2.37E-43)
            r2 = 54
            r3 = 4
            if (r8 >= r3) goto L24
            if (r7 == r1) goto L24
            if (r7 >= r2) goto L19
            int r4 = r7 + (-21)
            int r4 = r4 << 2
            int r4 = r4 + 26
        L17:
            int r4 = r4 + r8
            goto L20
        L19:
            int r4 = r7 + (-54)
            int r4 = r4 << 2
            int r4 = r4 + 59
            goto L17
        L20:
            r0.putByte(r4)
            goto L35
        L24:
            r4 = 256(0x100, float:3.59E-43)
            if (r8 < r4) goto L32
            r4 = 196(0xc4, float:2.75E-43)
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putByte(r4)
            r0.put12(r7, r8)
            goto L35
        L32:
            r0.put11(r7, r8)
        L35:
            net.bytebuddy.jar.asm.Label r0 = r6.currentBasicBlock
            if (r0 == 0) goto L69
            int r4 = r6.compute
            if (r4 == r3) goto L63
            r5 = 3
            if (r4 != r5) goto L41
            goto L63
        L41:
            if (r7 != r1) goto L53
            short r1 = r0.flags
            r1 = r1 | 64
            short r1 = (short) r1
            r0.flags = r1
            int r1 = r6.relativeStackSize
            short r1 = (short) r1
            r0.outputStackSize = r1
            r6.endCurrentBasicBlockWithNoSuccessor()
            goto L69
        L53:
            int r0 = r6.relativeStackSize
            int[] r1 = net.bytebuddy.jar.asm.MethodWriter.STACK_SIZE_DELTA
            r1 = r1[r7]
            int r0 = r0 + r1
            int r1 = r6.maxRelativeStackSize
            if (r0 <= r1) goto L60
            r6.maxRelativeStackSize = r0
        L60:
            r6.relativeStackSize = r0
            goto L69
        L63:
            net.bytebuddy.jar.asm.Frame r0 = r0.frame
            r1 = 0
            r0.execute(r7, r8, r1, r1)
        L69:
            int r0 = r6.compute
            if (r0 == 0) goto L89
            r1 = 22
            if (r7 == r1) goto L81
            r1 = 24
            if (r7 == r1) goto L81
            r1 = 55
            if (r7 == r1) goto L81
            r1 = 57
            if (r7 != r1) goto L7e
            goto L81
        L7e:
            int r8 = r8 + 1
            goto L83
        L81:
            int r8 = r8 + 2
        L83:
            int r1 = r6.maxLocals
            if (r8 <= r1) goto L89
            r6.maxLocals = r8
        L89:
            if (r7 < r2) goto L99
            if (r0 != r3) goto L99
            net.bytebuddy.jar.asm.Handler r7 = r6.firstHandler
            if (r7 == 0) goto L99
            net.bytebuddy.jar.asm.Label r7 = new net.bytebuddy.jar.asm.Label
            r7.<init>()
            r6.visitLabel(r7)
        L99:
            return
    }
}
