package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class MethodWriter extends bsh.org.objectweb.asm.MethodVisitor {
    static final int COMPUTE_ALL_FRAMES = 4;
    static final int COMPUTE_INSERTED_FRAMES = 3;
    static final int COMPUTE_MAX_STACK_AND_LOCAL = 1;
    static final int COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES = 2;
    static final int COMPUTE_NOTHING = 0;
    private static final int NA = 0;
    private static final int[] STACK_SIZE_DELTA = null;
    private final int accessFlags;
    private final bsh.org.objectweb.asm.ByteVector code;
    private final int compute;
    private bsh.org.objectweb.asm.Label currentBasicBlock;
    private int[] currentFrame;
    private int currentLocals;
    private bsh.org.objectweb.asm.ByteVector defaultValue;
    private final java.lang.String descriptor;
    private final int descriptorIndex;
    private final int[] exceptionIndexTable;
    private bsh.org.objectweb.asm.Attribute firstAttribute;
    private bsh.org.objectweb.asm.Label firstBasicBlock;
    private bsh.org.objectweb.asm.Attribute firstCodeAttribute;
    private bsh.org.objectweb.asm.Handler firstHandler;
    private boolean hasAsmInstructions;
    private boolean hasSubroutines;
    private bsh.org.objectweb.asm.Label lastBasicBlock;
    private int lastBytecodeOffset;
    private bsh.org.objectweb.asm.Handler lastHandler;
    private bsh.org.objectweb.asm.ByteVector lineNumberTable;
    private int lineNumberTableLength;
    private bsh.org.objectweb.asm.ByteVector localVariableTable;
    private int localVariableTableLength;
    private bsh.org.objectweb.asm.ByteVector localVariableTypeTable;
    private int localVariableTypeTableLength;
    private int maxLocals;
    private int maxRelativeStackSize;
    private int maxStack;
    private final int nameIndex;
    private final int numberOfExceptions;
    private bsh.org.objectweb.asm.ByteVector parameters;
    private int parametersCount;
    private int[] previousFrame;
    private int previousFrameOffset;
    private int relativeStackSize;
    private final int signatureIndex;
    private int sourceLength;
    private int sourceOffset;
    private bsh.org.objectweb.asm.ByteVector stackMapTableEntries;
    private int stackMapTableNumberOfEntries;
    private final bsh.org.objectweb.asm.SymbolTable symbolTable;

    static {
            r0 = 202(0xca, float:2.83E-43)
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0} // fill-array
            bsh.org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA = r0
            return
    }

    public MethodWriter(bsh.org.objectweb.asm.SymbolTable r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String[] r7, int r8) {
            r1 = this;
            r0 = 393216(0x60000, float:5.51013E-40)
            r1.<init>(r0)
            bsh.org.objectweb.asm.ByteVector r0 = new bsh.org.objectweb.asm.ByteVector
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
            int r4 = r2.addConstantUtf8(r4)
            r1.nameIndex = r4
            int r4 = r2.addConstantUtf8(r5)
            r1.descriptorIndex = r4
            r1.descriptor = r5
            r4 = 0
            if (r6 != 0) goto L30
            r6 = r4
            goto L34
        L30:
            int r6 = r2.addConstantUtf8(r6)
        L34:
            r1.signatureIndex = r6
            if (r7 == 0) goto L55
            int r6 = r7.length
            if (r6 <= 0) goto L55
            int r6 = r7.length
            r1.numberOfExceptions = r6
            int[] r6 = new int[r6]
            r1.exceptionIndexTable = r6
        L42:
            int r6 = r1.numberOfExceptions
            if (r4 >= r6) goto L5a
            int[] r6 = r1.exceptionIndexTable
            r0 = r7[r4]
            bsh.org.objectweb.asm.Symbol r0 = r2.addConstantClass(r0)
            int r0 = r0.index
            r6[r4] = r0
            int r4 = r4 + 1
            goto L42
        L55:
            r1.numberOfExceptions = r4
            r2 = 0
            r1.exceptionIndexTable = r2
        L5a:
            r1.compute = r8
            if (r8 == 0) goto L78
            int r2 = bsh.org.objectweb.asm.Type.getArgumentsAndReturnSizes(r5)
            int r2 = r2 >> 2
            r3 = r3 & 8
            if (r3 == 0) goto L6a
            int r2 = r2 + (-1)
        L6a:
            r1.maxLocals = r2
            r1.currentLocals = r2
            bsh.org.objectweb.asm.Label r2 = new bsh.org.objectweb.asm.Label
            r2.<init>()
            r1.firstBasicBlock = r2
            r1.visitLabel(r2)
        L78:
            return
    }

    private void addSuccessorToCurrentBasicBlock(int r4, bsh.org.objectweb.asm.Label r5) {
            r3 = this;
            bsh.org.objectweb.asm.Label r0 = r3.currentBasicBlock
            bsh.org.objectweb.asm.Edge r1 = new bsh.org.objectweb.asm.Edge
            bsh.org.objectweb.asm.Edge r2 = r0.outgoingEdges
            r1.<init>(r4, r5, r2)
            r0.outgoingEdges = r1
            return
    }

    private void computeAllFrames() {
            r11 = this;
            bsh.org.objectweb.asm.Handler r0 = r11.firstHandler
        L2:
            java.lang.String r1 = "java/lang/Throwable"
            if (r0 == 0) goto L3c
            java.lang.String r2 = r0.catchTypeDescriptor
            if (r2 != 0) goto Lb
            goto Lc
        Lb:
            r1 = r2
        Lc:
            bsh.org.objectweb.asm.SymbolTable r2 = r11.symbolTable
            int r1 = bsh.org.objectweb.asm.Frame.getAbstractTypeFromInternalName(r2, r1)
            bsh.org.objectweb.asm.Label r2 = r0.handlerPc
            bsh.org.objectweb.asm.Label r2 = r2.getCanonicalInstance()
            short r3 = r2.flags
            r3 = r3 | 2
            short r3 = (short) r3
            r2.flags = r3
            bsh.org.objectweb.asm.Label r3 = r0.startPc
            bsh.org.objectweb.asm.Label r3 = r3.getCanonicalInstance()
            bsh.org.objectweb.asm.Label r4 = r0.endPc
            bsh.org.objectweb.asm.Label r4 = r4.getCanonicalInstance()
        L2b:
            if (r3 == r4) goto L39
            bsh.org.objectweb.asm.Edge r5 = new bsh.org.objectweb.asm.Edge
            bsh.org.objectweb.asm.Edge r6 = r3.outgoingEdges
            r5.<init>(r1, r2, r6)
            r3.outgoingEdges = r5
            bsh.org.objectweb.asm.Label r3 = r3.nextBasicBlock
            goto L2b
        L39:
            bsh.org.objectweb.asm.Handler r0 = r0.nextHandler
            goto L2
        L3c:
            bsh.org.objectweb.asm.Label r0 = r11.firstBasicBlock
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            bsh.org.objectweb.asm.SymbolTable r2 = r11.symbolTable
            int r3 = r11.accessFlags
            java.lang.String r4 = r11.descriptor
            int r5 = r11.maxLocals
            r0.setInputFrameFromDescriptor(r2, r3, r4, r5)
            r0.accept(r11)
            bsh.org.objectweb.asm.Label r0 = r11.firstBasicBlock
            bsh.org.objectweb.asm.Label r2 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            r0.nextListElement = r2
            r2 = 0
            r3 = r2
        L56:
            bsh.org.objectweb.asm.Label r4 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r4) goto L96
            bsh.org.objectweb.asm.Label r4 = r0.nextListElement
            r5 = 0
            r0.nextListElement = r5
            short r5 = r0.flags
            r5 = r5 | 8
            short r5 = (short) r5
            r0.flags = r5
            bsh.org.objectweb.asm.Frame r5 = r0.frame
            int r5 = r5.getInputStackSize()
            short r6 = r0.outputStackMax
            int r5 = r5 + r6
            if (r5 <= r3) goto L72
            r3 = r5
        L72:
            bsh.org.objectweb.asm.Edge r5 = r0.outgoingEdges
        L74:
            if (r5 == 0) goto L94
            bsh.org.objectweb.asm.Label r6 = r5.successor
            bsh.org.objectweb.asm.Label r6 = r6.getCanonicalInstance()
            bsh.org.objectweb.asm.Frame r7 = r0.frame
            bsh.org.objectweb.asm.SymbolTable r8 = r11.symbolTable
            bsh.org.objectweb.asm.Frame r9 = r6.frame
            int r10 = r5.info
            boolean r7 = r7.merge(r8, r9, r10)
            if (r7 == 0) goto L91
            bsh.org.objectweb.asm.Label r7 = r6.nextListElement
            if (r7 != 0) goto L91
            r6.nextListElement = r4
            r4 = r6
        L91:
            bsh.org.objectweb.asm.Edge r5 = r5.nextEdge
            goto L74
        L94:
            r0 = r4
            goto L56
        L96:
            bsh.org.objectweb.asm.Label r0 = r11.firstBasicBlock
        L98:
            if (r0 == 0) goto Lef
            short r4 = r0.flags
            r5 = 10
            r4 = r4 & r5
            if (r4 != r5) goto La6
            bsh.org.objectweb.asm.Frame r4 = r0.frame
            r4.accept(r11)
        La6:
            short r4 = r0.flags
            r4 = r4 & 8
            if (r4 != 0) goto Lec
            bsh.org.objectweb.asm.Label r4 = r0.nextBasicBlock
            int r5 = r0.bytecodeOffset
            if (r4 != 0) goto Lb7
            bsh.org.objectweb.asm.ByteVector r6 = r11.code
            int r6 = r6.length
            goto Lb9
        Lb7:
            int r6 = r4.bytecodeOffset
        Lb9:
            r7 = 1
            int r6 = r6 - r7
            if (r6 < r5) goto Lec
            r8 = r5
        Lbe:
            bsh.org.objectweb.asm.ByteVector r9 = r11.code
            if (r8 >= r6) goto Lc9
            byte[] r9 = r9.data
            r9[r8] = r2
            int r8 = r8 + 1
            goto Lbe
        Lc9:
            byte[] r8 = r9.data
            r9 = -65
            r8[r6] = r9
            int r5 = r11.visitFrameStart(r5, r2, r7)
            int[] r6 = r11.currentFrame
            bsh.org.objectweb.asm.SymbolTable r8 = r11.symbolTable
            int r8 = bsh.org.objectweb.asm.Frame.getAbstractTypeFromInternalName(r8, r1)
            r6[r5] = r8
            r11.visitFrameEnd()
            bsh.org.objectweb.asm.Handler r5 = r11.firstHandler
            bsh.org.objectweb.asm.Handler r4 = bsh.org.objectweb.asm.Handler.removeRange(r5, r0, r4)
            r11.firstHandler = r4
            int r3 = java.lang.Math.max(r3, r7)
        Lec:
            bsh.org.objectweb.asm.Label r0 = r0.nextBasicBlock
            goto L98
        Lef:
            r11.maxStack = r3
            return
    }

    private void computeMaxStackAndLocal() {
            r8 = this;
            bsh.org.objectweb.asm.Handler r0 = r8.firstHandler
        L2:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L30
            bsh.org.objectweb.asm.Label r2 = r0.handlerPc
            bsh.org.objectweb.asm.Label r3 = r0.startPc
            bsh.org.objectweb.asm.Label r4 = r0.endPc
        Ld:
            if (r3 == r4) goto L2d
            short r5 = r3.flags
            r5 = r5 & 16
            bsh.org.objectweb.asm.Edge r6 = r3.outgoingEdges
            if (r5 != 0) goto L1f
            bsh.org.objectweb.asm.Edge r5 = new bsh.org.objectweb.asm.Edge
            r5.<init>(r1, r2, r6)
            r3.outgoingEdges = r5
            goto L2a
        L1f:
            bsh.org.objectweb.asm.Edge r5 = r6.nextEdge
            bsh.org.objectweb.asm.Edge r6 = new bsh.org.objectweb.asm.Edge
            bsh.org.objectweb.asm.Edge r7 = r5.nextEdge
            r6.<init>(r1, r2, r7)
            r5.nextEdge = r6
        L2a:
            bsh.org.objectweb.asm.Label r3 = r3.nextBasicBlock
            goto Ld
        L2d:
            bsh.org.objectweb.asm.Handler r0 = r0.nextHandler
            goto L2
        L30:
            boolean r0 = r8.hasSubroutines
            r2 = 1
            if (r0 == 0) goto L77
            bsh.org.objectweb.asm.Label r0 = r8.firstBasicBlock
            r0.markSubroutine(r2)
            r0 = r2
            r3 = r0
        L3c:
            bsh.org.objectweb.asm.Label r4 = r8.firstBasicBlock
            if (r0 > r3) goto L63
        L40:
            if (r4 == 0) goto L5f
            short r5 = r4.flags
            r5 = r5 & 16
            if (r5 == 0) goto L5c
            short r5 = r4.subroutineId
            if (r5 != r0) goto L5c
            bsh.org.objectweb.asm.Edge r5 = r4.outgoingEdges
            bsh.org.objectweb.asm.Edge r5 = r5.nextEdge
            bsh.org.objectweb.asm.Label r5 = r5.successor
            short r6 = r5.subroutineId
            if (r6 != 0) goto L5c
            int r3 = r3 + 1
            short r3 = (short) r3
            r5.markSubroutine(r3)
        L5c:
            bsh.org.objectweb.asm.Label r4 = r4.nextBasicBlock
            goto L40
        L5f:
            int r0 = r0 + 1
            short r0 = (short) r0
            goto L3c
        L63:
            if (r4 == 0) goto L77
            short r0 = r4.flags
            r0 = r0 & 16
            if (r0 == 0) goto L74
            bsh.org.objectweb.asm.Edge r0 = r4.outgoingEdges
            bsh.org.objectweb.asm.Edge r0 = r0.nextEdge
            bsh.org.objectweb.asm.Label r0 = r0.successor
            r0.addSubroutineRetSuccessors(r4)
        L74:
            bsh.org.objectweb.asm.Label r4 = r4.nextBasicBlock
            goto L63
        L77:
            bsh.org.objectweb.asm.Label r0 = r8.firstBasicBlock
            bsh.org.objectweb.asm.Label r3 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            r0.nextListElement = r3
            int r3 = r8.maxStack
        L7f:
            bsh.org.objectweb.asm.Label r4 = bsh.org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r4) goto Lb0
            bsh.org.objectweb.asm.Label r4 = r0.nextListElement
            short r5 = r0.inputStackSize
            short r6 = r0.outputStackMax
            int r6 = r6 + r5
            if (r6 <= r3) goto L8d
            r3 = r6
        L8d:
            bsh.org.objectweb.asm.Edge r6 = r0.outgoingEdges
            short r0 = r0.flags
            r0 = r0 & 16
            if (r0 == 0) goto L97
            bsh.org.objectweb.asm.Edge r6 = r6.nextEdge
        L97:
            r0 = r4
        L98:
            if (r6 == 0) goto L7f
            bsh.org.objectweb.asm.Label r4 = r6.successor
            bsh.org.objectweb.asm.Label r7 = r4.nextListElement
            if (r7 != 0) goto Lad
            int r7 = r6.info
            if (r7 != r1) goto La6
            r7 = r2
            goto La7
        La6:
            int r7 = r7 + r5
        La7:
            short r7 = (short) r7
            r4.inputStackSize = r7
            r4.nextListElement = r0
            r0 = r4
        Lad:
            bsh.org.objectweb.asm.Edge r6 = r6.nextEdge
            goto L98
        Lb0:
            r8.maxStack = r3
            return
    }

    private void endCurrentBasicBlockWithNoSuccessor() {
            r4 = this;
            int r0 = r4.compute
            r1 = 4
            r2 = 0
            if (r0 != r1) goto L24
            bsh.org.objectweb.asm.Label r0 = new bsh.org.objectweb.asm.Label
            r0.<init>()
            bsh.org.objectweb.asm.Frame r1 = new bsh.org.objectweb.asm.Frame
            r1.<init>(r0)
            r0.frame = r1
            bsh.org.objectweb.asm.ByteVector r1 = r4.code
            byte[] r3 = r1.data
            int r1 = r1.length
            r0.resolve(r3, r1)
            bsh.org.objectweb.asm.Label r1 = r4.lastBasicBlock
            r1.nextBasicBlock = r0
            r4.lastBasicBlock = r0
            r4.currentBasicBlock = r2
            return
        L24:
            r1 = 1
            if (r0 != r1) goto L30
            bsh.org.objectweb.asm.Label r0 = r4.currentBasicBlock
            int r1 = r4.maxRelativeStackSize
            short r1 = (short) r1
            r0.outputStackMax = r1
            r4.currentBasicBlock = r2
        L30:
            return
    }

    private void putAbstractTypes(int r4, int r5) {
            r3 = this;
        L0:
            if (r4 >= r5) goto L10
            bsh.org.objectweb.asm.SymbolTable r0 = r3.symbolTable
            int[] r1 = r3.currentFrame
            r1 = r1[r4]
            bsh.org.objectweb.asm.ByteVector r2 = r3.stackMapTableEntries
            bsh.org.objectweb.asm.Frame.putAbstractType(r0, r1, r2)
            int r4 = r4 + 1
            goto L0
        L10:
            return
    }

    private void putFrame() {
            r17 = this;
            r0 = r17
            int[] r1 = r0.currentFrame
            r2 = 1
            r3 = r1[r2]
            r4 = 2
            r1 = r1[r4]
            bsh.org.objectweb.asm.SymbolTable r4 = r0.symbolTable
            int r4 = r4.getMajorVersion()
            r5 = 50
            r6 = 0
            r7 = 3
            if (r4 >= r5) goto L31
            bsh.org.objectweb.asm.ByteVector r2 = r0.stackMapTableEntries
            int[] r4 = r0.currentFrame
            r4 = r4[r6]
            bsh.org.objectweb.asm.ByteVector r2 = r2.putShort(r4)
            r2.putShort(r3)
            int r3 = r3 + r7
            r0.putAbstractTypes(r7, r3)
            bsh.org.objectweb.asm.ByteVector r2 = r0.stackMapTableEntries
            r2.putShort(r1)
            int r1 = r1 + r3
            r0.putAbstractTypes(r3, r1)
            return
        L31:
            int r4 = r0.stackMapTableNumberOfEntries
            int[] r5 = r0.currentFrame
            if (r4 != 0) goto L3a
            r4 = r5[r6]
            goto L42
        L3a:
            r4 = r5[r6]
            int[] r5 = r0.previousFrame
            r5 = r5[r6]
            int r4 = r4 - r5
            int r4 = r4 - r2
        L42:
            int[] r5 = r0.previousFrame
            r5 = r5[r2]
            int r8 = r3 - r5
            r9 = 248(0xf8, float:3.48E-43)
            r10 = 252(0xfc, float:3.53E-43)
            r11 = 247(0xf7, float:3.46E-43)
            r12 = 64
            r13 = 255(0xff, float:3.57E-43)
            r14 = 251(0xfb, float:3.52E-43)
            if (r1 != 0) goto L64
            switch(r8) {
                case -3: goto L62;
                case -2: goto L62;
                case -1: goto L62;
                case 0: goto L5c;
                case 1: goto L5a;
                case 2: goto L5a;
                case 3: goto L5a;
                default: goto L59;
            }
        L59:
            goto L70
        L5a:
            r2 = r10
            goto L71
        L5c:
            if (r4 >= r12) goto L60
            r2 = r6
            goto L71
        L60:
            r2 = r14
            goto L71
        L62:
            r2 = r9
            goto L71
        L64:
            if (r8 != 0) goto L70
            if (r1 != r2) goto L70
            r2 = 63
            if (r4 >= r2) goto L6e
            r2 = r12
            goto L71
        L6e:
            r2 = r11
            goto L71
        L70:
            r2 = r13
        L71:
            if (r2 == r13) goto L90
            r15 = r7
        L74:
            if (r6 >= r5) goto L90
            if (r6 >= r3) goto L90
            r16 = r7
            int[] r7 = r0.currentFrame
            r7 = r7[r15]
            int[] r13 = r0.previousFrame
            r13 = r13[r15]
            if (r7 == r13) goto L87
            r2 = 255(0xff, float:3.57E-43)
            goto L92
        L87:
            int r15 = r15 + 1
            int r6 = r6 + 1
            r7 = r16
            r13 = 255(0xff, float:3.57E-43)
            goto L74
        L90:
            r16 = r7
        L92:
            if (r2 == 0) goto L102
            if (r2 == r12) goto Lf4
            if (r2 == r11) goto Le3
            if (r2 == r9) goto Ld8
            if (r2 == r14) goto Lce
            bsh.org.objectweb.asm.ByteVector r6 = r0.stackMapTableEntries
            if (r2 == r10) goto Lbe
            r2 = 255(0xff, float:3.57E-43)
            bsh.org.objectweb.asm.ByteVector r2 = r6.putByte(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r2.putShort(r4)
            r2.putShort(r3)
            int r3 = r3 + 3
            r2 = r16
            r0.putAbstractTypes(r2, r3)
            bsh.org.objectweb.asm.ByteVector r2 = r0.stackMapTableEntries
            r2.putShort(r1)
            int r1 = r1 + r3
            r0.putAbstractTypes(r3, r1)
            return
        Lbe:
            r2 = r16
            int r8 = r8 + r14
            bsh.org.objectweb.asm.ByteVector r1 = r6.putByte(r8)
            r1.putShort(r4)
            int r5 = r5 + r2
            int r3 = r3 + r2
            r0.putAbstractTypes(r5, r3)
            return
        Lce:
            bsh.org.objectweb.asm.ByteVector r1 = r0.stackMapTableEntries
            bsh.org.objectweb.asm.ByteVector r1 = r1.putByte(r14)
            r1.putShort(r4)
            return
        Ld8:
            bsh.org.objectweb.asm.ByteVector r1 = r0.stackMapTableEntries
            int r8 = r8 + r14
            bsh.org.objectweb.asm.ByteVector r1 = r1.putByte(r8)
            r1.putShort(r4)
            return
        Le3:
            bsh.org.objectweb.asm.ByteVector r1 = r0.stackMapTableEntries
            bsh.org.objectweb.asm.ByteVector r1 = r1.putByte(r11)
            r1.putShort(r4)
            int r1 = r3 + 3
            int r3 = r3 + 4
            r0.putAbstractTypes(r1, r3)
            return
        Lf4:
            bsh.org.objectweb.asm.ByteVector r1 = r0.stackMapTableEntries
            int r4 = r4 + r12
            r1.putByte(r4)
            int r1 = r3 + 3
            int r3 = r3 + 4
            r0.putAbstractTypes(r1, r3)
            return
        L102:
            bsh.org.objectweb.asm.ByteVector r1 = r0.stackMapTableEntries
            r1.putByte(r4)
            return
    }

    private void putFrameType(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L10
            bsh.org.objectweb.asm.ByteVector r0 = r2.stackMapTableEntries
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.putByte(r3)
            return
        L10:
            boolean r0 = r3 instanceof java.lang.String
            bsh.org.objectweb.asm.ByteVector r1 = r2.stackMapTableEntries
            if (r0 == 0) goto L29
            r0 = 7
            bsh.org.objectweb.asm.ByteVector r0 = r1.putByte(r0)
            bsh.org.objectweb.asm.SymbolTable r1 = r2.symbolTable
            java.lang.String r3 = (java.lang.String) r3
            bsh.org.objectweb.asm.Symbol r3 = r1.addConstantClass(r3)
            int r3 = r3.index
            r0.putShort(r3)
            return
        L29:
            r0 = 8
            bsh.org.objectweb.asm.ByteVector r0 = r1.putByte(r0)
            bsh.org.objectweb.asm.Label r3 = (bsh.org.objectweb.asm.Label) r3
            int r3 = r3.bytecodeOffset
            r0.putShort(r3)
            return
    }

    private void visitSwitchInsn(bsh.org.objectweb.asm.Label r5, bsh.org.objectweb.asm.Label[] r6) {
            r4 = this;
            bsh.org.objectweb.asm.Label r0 = r4.currentBasicBlock
            if (r0 == 0) goto L52
            int r1 = r4.compute
            r2 = 4
            r3 = 0
            if (r1 != r2) goto L37
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            r1 = 171(0xab, float:2.4E-43)
            r2 = 0
            r0.execute(r1, r3, r2, r2)
            r4.addSuccessorToCurrentBasicBlock(r3, r5)
            bsh.org.objectweb.asm.Label r5 = r5.getCanonicalInstance()
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
            bsh.org.objectweb.asm.Label r1 = r1.getCanonicalInstance()
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

    public boolean canCopyMethodAttributes(int r3, int r4, boolean r5, boolean r6, int r7, int r8) {
            r2 = this;
            bsh.org.objectweb.asm.SymbolTable r6 = r2.symbolTable
            int r6 = r6.getMajorVersion()
            r7 = 49
            r0 = 1
            r1 = 0
            if (r6 >= r7) goto L14
            int r6 = r2.accessFlags
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L14
            r6 = r0
            goto L15
        L14:
            r6 = r1
        L15:
            if (r5 == r6) goto L18
            return r1
        L18:
            if (r8 != 0) goto L1f
            int r5 = r2.numberOfExceptions
            if (r5 == 0) goto L1f
            return r1
        L1f:
            int r3 = r3 + 6
            r2.sourceOffset = r3
            int r4 = r4 + (-6)
            r2.sourceLength = r4
            return r0
    }

    public final void collectAttributePrototypes(bsh.org.objectweb.asm.Attribute.Set r2) {
            r1 = this;
            bsh.org.objectweb.asm.Attribute r0 = r1.firstAttribute
            r2.addAttributes(r0)
            bsh.org.objectweb.asm.Attribute r0 = r1.firstCodeAttribute
            r2.addAttributes(r0)
            return
    }

    public int computeMethodInfoSize() {
            r10 = this;
            int r0 = r10.sourceOffset
            if (r0 == 0) goto L9
            int r0 = r10.sourceLength
            int r0 = r0 + 6
            return r0
        L9:
            bsh.org.objectweb.asm.ByteVector r0 = r10.code
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = 8
            if (r0 <= 0) goto La1
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r4) goto L9a
            bsh.org.objectweb.asm.SymbolTable r0 = r10.symbolTable
            java.lang.String r4 = "Code"
            r0.addConstantUtf8(r4)
            bsh.org.objectweb.asm.ByteVector r0 = r10.code
            int r0 = r0.length
            int r0 = r0 + 16
            bsh.org.objectweb.asm.Handler r4 = r10.firstHandler
            int r4 = bsh.org.objectweb.asm.Handler.getExceptionTableSize(r4)
            int r0 = r0 + r4
            int r0 = r0 + r3
            bsh.org.objectweb.asm.ByteVector r4 = r10.stackMapTableEntries
            if (r4 == 0) goto L50
            bsh.org.objectweb.asm.SymbolTable r4 = r10.symbolTable
            int r4 = r4.getMajorVersion()
            r5 = 50
            if (r4 < r5) goto L3d
            r4 = r2
            goto L3e
        L3d:
            r4 = r1
        L3e:
            bsh.org.objectweb.asm.SymbolTable r5 = r10.symbolTable
            if (r4 == 0) goto L45
            java.lang.String r4 = "StackMapTable"
            goto L47
        L45:
            java.lang.String r4 = "StackMap"
        L47:
            r5.addConstantUtf8(r4)
            bsh.org.objectweb.asm.ByteVector r4 = r10.stackMapTableEntries
            int r4 = r4.length
            int r4 = r4 + r3
            int r0 = r0 + r4
        L50:
            bsh.org.objectweb.asm.ByteVector r4 = r10.lineNumberTable
            if (r4 == 0) goto L61
            bsh.org.objectweb.asm.SymbolTable r4 = r10.symbolTable
            java.lang.String r5 = "LineNumberTable"
            r4.addConstantUtf8(r5)
            bsh.org.objectweb.asm.ByteVector r4 = r10.lineNumberTable
            int r4 = r4.length
            int r4 = r4 + r3
            int r0 = r0 + r4
        L61:
            bsh.org.objectweb.asm.ByteVector r4 = r10.localVariableTable
            if (r4 == 0) goto L72
            bsh.org.objectweb.asm.SymbolTable r4 = r10.symbolTable
            java.lang.String r5 = "LocalVariableTable"
            r4.addConstantUtf8(r5)
            bsh.org.objectweb.asm.ByteVector r4 = r10.localVariableTable
            int r4 = r4.length
            int r4 = r4 + r3
            int r0 = r0 + r4
        L72:
            bsh.org.objectweb.asm.ByteVector r4 = r10.localVariableTypeTable
            if (r4 == 0) goto L83
            bsh.org.objectweb.asm.SymbolTable r4 = r10.symbolTable
            java.lang.String r5 = "LocalVariableTypeTable"
            r4.addConstantUtf8(r5)
            bsh.org.objectweb.asm.ByteVector r4 = r10.localVariableTypeTable
            int r4 = r4.length
            int r4 = r4 + r3
            int r0 = r0 + r4
        L83:
            bsh.org.objectweb.asm.Attribute r4 = r10.firstCodeAttribute
            if (r4 == 0) goto La2
            bsh.org.objectweb.asm.SymbolTable r5 = r10.symbolTable
            bsh.org.objectweb.asm.ByteVector r6 = r10.code
            r7 = r6
            byte[] r6 = r7.data
            int r7 = r7.length
            int r8 = r10.maxStack
            int r9 = r10.maxLocals
            int r4 = r4.computeAttributesSize(r5, r6, r7, r8, r9)
            int r0 = r0 + r4
            goto La2
        L9a:
            java.lang.String r0 = "Method code too large!"
            okio.a.i(r0)
            r0 = 0
            return r0
        La1:
            r0 = r3
        La2:
            int r4 = r10.numberOfExceptions
            if (r4 <= 0) goto Lb4
            bsh.org.objectweb.asm.SymbolTable r4 = r10.symbolTable
            java.lang.String r5 = "Exceptions"
            r4.addConstantUtf8(r5)
            r4 = 2
            int r5 = r10.numberOfExceptions
            int r0 = p.a.g(r5, r4, r3, r0)
        Lb4:
            bsh.org.objectweb.asm.SymbolTable r3 = r10.symbolTable
            int r3 = r3.getMajorVersion()
            r4 = 49
            if (r3 >= r4) goto Lbf
            r1 = r2
        Lbf:
            int r2 = r10.accessFlags
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto Ld0
            if (r1 == 0) goto Ld0
            bsh.org.objectweb.asm.SymbolTable r1 = r10.symbolTable
            java.lang.String r2 = "Synthetic"
            r1.addConstantUtf8(r2)
            int r0 = r0 + 6
        Ld0:
            int r1 = r10.signatureIndex
            if (r1 == 0) goto Ldd
            bsh.org.objectweb.asm.SymbolTable r1 = r10.symbolTable
            java.lang.String r2 = "Signature"
            r1.addConstantUtf8(r2)
            int r0 = r0 + 8
        Ldd:
            int r1 = r10.accessFlags
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 == 0) goto Led
            bsh.org.objectweb.asm.SymbolTable r1 = r10.symbolTable
            java.lang.String r2 = "Deprecated"
            r1.addConstantUtf8(r2)
            int r0 = r0 + 6
        Led:
            bsh.org.objectweb.asm.ByteVector r1 = r10.defaultValue
            if (r1 == 0) goto Lff
            bsh.org.objectweb.asm.SymbolTable r1 = r10.symbolTable
            java.lang.String r2 = "AnnotationDefault"
            r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r10.defaultValue
            int r1 = r1.length
            int r1 = r1 + 6
            int r0 = r0 + r1
        Lff:
            bsh.org.objectweb.asm.ByteVector r1 = r10.parameters
            if (r1 == 0) goto L111
            bsh.org.objectweb.asm.SymbolTable r1 = r10.symbolTable
            java.lang.String r2 = "MethodParameters"
            r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r10.parameters
            int r1 = r1.length
            int r1 = r1 + 7
            int r0 = r0 + r1
        L111:
            bsh.org.objectweb.asm.Attribute r1 = r10.firstAttribute
            if (r1 == 0) goto L11d
            bsh.org.objectweb.asm.SymbolTable r2 = r10.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r1 = r1 + r0
            return r1
        L11d:
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
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void putMethodInfo(bsh.org.objectweb.asm.ByteVector r22) {
            r21 = this;
            r0 = r21
            r7 = r22
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.getMajorVersion()
            r2 = 49
            r8 = 0
            r9 = 1
            if (r1 >= r2) goto L12
            r10 = r9
            goto L13
        L12:
            r10 = r8
        L13:
            r11 = 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L19
            r1 = r11
            goto L1a
        L19:
            r1 = r8
        L1a:
            int r2 = r0.accessFlags
            int r1 = ~r1
            r1 = r1 & r2
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            int r2 = r0.nameIndex
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            int r2 = r0.descriptorIndex
            r1.putShort(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r0.code
            int r1 = r1.length
            if (r1 <= 0) goto L35
            r1 = r9
            goto L36
        L35:
            r1 = r8
        L36:
            int r2 = r0.numberOfExceptions
            if (r2 <= 0) goto L3c
            int r1 = r1 + 1
        L3c:
            int r2 = r0.accessFlags
            r3 = r2 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L46
            if (r10 == 0) goto L46
            int r1 = r1 + 1
        L46:
            int r3 = r0.signatureIndex
            if (r3 == 0) goto L4c
            int r1 = r1 + 1
        L4c:
            r12 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r12
            if (r2 == 0) goto L53
            int r1 = r1 + 1
        L53:
            bsh.org.objectweb.asm.ByteVector r2 = r0.defaultValue
            if (r2 == 0) goto L59
            int r1 = r1 + 1
        L59:
            bsh.org.objectweb.asm.ByteVector r2 = r0.parameters
            if (r2 == 0) goto L5f
            int r1 = r1 + 1
        L5f:
            bsh.org.objectweb.asm.Attribute r2 = r0.firstAttribute
            if (r2 == 0) goto L68
            int r2 = r2.getAttributeCount()
            int r1 = r1 + r2
        L68:
            r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r1 = r0.code
            int r1 = r1.length
            r13 = 2
            if (r1 <= 0) goto L1cb
            int r1 = r1 + 10
            bsh.org.objectweb.asm.Handler r2 = r0.firstHandler
            int r2 = bsh.org.objectweb.asm.Handler.getExceptionTableSize(r2)
            int r1 = r1 + r2
            bsh.org.objectweb.asm.ByteVector r2 = r0.stackMapTableEntries
            if (r2 == 0) goto L86
            int r2 = r2.length
            int r2 = r2 + 8
            int r1 = r1 + r2
            r2 = r9
            goto L87
        L86:
            r2 = r8
        L87:
            bsh.org.objectweb.asm.ByteVector r3 = r0.lineNumberTable
            if (r3 == 0) goto L92
            int r3 = r3.length
            int r3 = r3 + 8
            int r1 = r1 + r3
            int r2 = r2 + 1
        L92:
            bsh.org.objectweb.asm.ByteVector r3 = r0.localVariableTable
            if (r3 == 0) goto L9d
            int r3 = r3.length
            int r3 = r3 + 8
            int r1 = r1 + r3
            int r2 = r2 + 1
        L9d:
            bsh.org.objectweb.asm.ByteVector r3 = r0.localVariableTypeTable
            if (r3 == 0) goto La8
            int r3 = r3.length
            int r3 = r3 + 8
            int r1 = r1 + r3
            int r2 = r2 + 1
        La8:
            bsh.org.objectweb.asm.Attribute r14 = r0.firstCodeAttribute
            if (r14 == 0) goto Lcc
            bsh.org.objectweb.asm.SymbolTable r15 = r0.symbolTable
            bsh.org.objectweb.asm.ByteVector r3 = r0.code
            byte[] r4 = r3.data
            int r3 = r3.length
            int r5 = r0.maxStack
            int r6 = r0.maxLocals
            r17 = r3
            r16 = r4
            r18 = r5
            r19 = r6
            int r3 = r14.computeAttributesSize(r15, r16, r17, r18, r19)
            int r1 = r1 + r3
            bsh.org.objectweb.asm.Attribute r3 = r0.firstCodeAttribute
            int r3 = r3.getAttributeCount()
            int r2 = r2 + r3
        Lcc:
            bsh.org.objectweb.asm.SymbolTable r3 = r0.symbolTable
            java.lang.String r4 = "Code"
            int r3 = r3.addConstantUtf8(r4)
            bsh.org.objectweb.asm.ByteVector r3 = r7.putShort(r3)
            bsh.org.objectweb.asm.ByteVector r1 = r3.putInt(r1)
            int r3 = r0.maxStack
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r3)
            int r3 = r0.maxLocals
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r3)
            bsh.org.objectweb.asm.ByteVector r3 = r0.code
            int r3 = r3.length
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r3)
            bsh.org.objectweb.asm.ByteVector r3 = r0.code
            byte[] r4 = r3.data
            int r3 = r3.length
            r1.putByteArray(r4, r8, r3)
            bsh.org.objectweb.asm.Handler r1 = r0.firstHandler
            bsh.org.objectweb.asm.Handler.putExceptionTable(r1, r7)
            r7.putShort(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r0.stackMapTableEntries
            if (r1 == 0) goto L13b
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.getMajorVersion()
            r2 = 50
            if (r1 < r2) goto L111
            r1 = r9
            goto L112
        L111:
            r1 = r8
        L112:
            bsh.org.objectweb.asm.SymbolTable r2 = r0.symbolTable
            if (r1 == 0) goto L119
            java.lang.String r1 = "StackMapTable"
            goto L11b
        L119:
            java.lang.String r1 = "StackMap"
        L11b:
            int r1 = r2.addConstantUtf8(r1)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r2 = r0.stackMapTableEntries
            int r2 = r2.length
            int r2 = r2 + r13
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r2)
            int r2 = r0.stackMapTableNumberOfEntries
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r0.stackMapTableEntries
            byte[] r3 = r2.data
            int r2 = r2.length
            r1.putByteArray(r3, r8, r2)
        L13b:
            bsh.org.objectweb.asm.ByteVector r1 = r0.lineNumberTable
            if (r1 == 0) goto L163
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "LineNumberTable"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r2 = r0.lineNumberTable
            int r2 = r2.length
            int r2 = r2 + r13
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r2)
            int r2 = r0.lineNumberTableLength
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r0.lineNumberTable
            byte[] r3 = r2.data
            int r2 = r2.length
            r1.putByteArray(r3, r8, r2)
        L163:
            bsh.org.objectweb.asm.ByteVector r1 = r0.localVariableTable
            if (r1 == 0) goto L18b
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "LocalVariableTable"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r2 = r0.localVariableTable
            int r2 = r2.length
            int r2 = r2 + r13
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r2)
            int r2 = r0.localVariableTableLength
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r0.localVariableTable
            byte[] r3 = r2.data
            int r2 = r2.length
            r1.putByteArray(r3, r8, r2)
        L18b:
            bsh.org.objectweb.asm.ByteVector r1 = r0.localVariableTypeTable
            if (r1 == 0) goto L1b3
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "LocalVariableTypeTable"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r2 = r0.localVariableTypeTable
            int r2 = r2.length
            int r2 = r2 + r13
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r2)
            int r2 = r0.localVariableTypeTableLength
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r0.localVariableTypeTable
            byte[] r3 = r2.data
            int r2 = r2.length
            r1.putByteArray(r3, r8, r2)
        L1b3:
            bsh.org.objectweb.asm.Attribute r1 = r0.firstCodeAttribute
            if (r1 == 0) goto L1cb
            bsh.org.objectweb.asm.SymbolTable r2 = r0.symbolTable
            bsh.org.objectweb.asm.ByteVector r3 = r0.code
            byte[] r4 = r3.data
            int r3 = r3.length
            int r5 = r0.maxStack
            int r6 = r0.maxLocals
            r20 = r4
            r4 = r3
            r3 = r20
            r1.putAttributes(r2, r3, r4, r5, r6, r7)
        L1cb:
            int r1 = r0.numberOfExceptions
            if (r1 <= 0) goto L1f6
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "Exceptions"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            int r2 = r0.numberOfExceptions
            int r2 = r2 * r13
            int r2 = r2 + r13
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r2)
            int r2 = r0.numberOfExceptions
            r1.putShort(r2)
            int[] r1 = r0.exceptionIndexTable
            int r2 = r1.length
            r3 = r8
        L1ec:
            if (r3 >= r2) goto L1f6
            r4 = r1[r3]
            r7.putShort(r4)
            int r3 = r3 + 1
            goto L1ec
        L1f6:
            int r1 = r0.accessFlags
            r1 = r1 & r11
            if (r1 == 0) goto L20c
            if (r10 == 0) goto L20c
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "Synthetic"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            r1.putInt(r8)
        L20c:
            int r1 = r0.signatureIndex
            if (r1 == 0) goto L225
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "Signature"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r13)
            int r2 = r0.signatureIndex
            r1.putShort(r2)
        L225:
            int r1 = r0.accessFlags
            r1 = r1 & r12
            if (r1 == 0) goto L239
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "Deprecated"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            r1.putInt(r8)
        L239:
            bsh.org.objectweb.asm.ByteVector r1 = r0.defaultValue
            if (r1 == 0) goto L25a
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "AnnotationDefault"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r2 = r0.defaultValue
            int r2 = r2.length
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r0.defaultValue
            byte[] r3 = r2.data
            int r2 = r2.length
            r1.putByteArray(r3, r8, r2)
        L25a:
            bsh.org.objectweb.asm.ByteVector r1 = r0.parameters
            if (r1 == 0) goto L282
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            java.lang.String r2 = "MethodParameters"
            int r1 = r1.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r1 = r7.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r2 = r0.parameters
            int r2 = r2.length
            int r2 = r2 + r9
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r2)
            int r2 = r0.parametersCount
            bsh.org.objectweb.asm.ByteVector r1 = r1.putByte(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r0.parameters
            byte[] r3 = r2.data
            int r2 = r2.length
            r1.putByteArray(r3, r8, r2)
        L282:
            bsh.org.objectweb.asm.Attribute r1 = r0.firstAttribute
            if (r1 == 0) goto L28b
            bsh.org.objectweb.asm.SymbolTable r2 = r0.symbolTable
            r1.putAttributes(r2, r7)
        L28b:
            return
    }

    public void visitAbstractType(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.currentFrame
            r0[r2] = r3
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitAttribute(bsh.org.objectweb.asm.Attribute r2) {
            r1 = this;
            boolean r0 = r2.isCodeAttribute()
            if (r0 == 0) goto Ld
            bsh.org.objectweb.asm.Attribute r0 = r1.firstCodeAttribute
            r2.nextAttribute = r0
            r1.firstCodeAttribute = r2
            return
        Ld:
            bsh.org.objectweb.asm.Attribute r0 = r1.firstAttribute
            r2.nextAttribute = r0
            r1.firstAttribute = r2
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitCode() {
            r0 = this;
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitEnd() {
            r0 = this;
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r3.code
            int r0 = r0.length
            r3.lastBytecodeOffset = r0
            bsh.org.objectweb.asm.SymbolTable r0 = r3.symbolTable
            bsh.org.objectweb.asm.Symbol r5 = r0.addConstantFieldref(r5, r6, r7)
            bsh.org.objectweb.asm.ByteVector r6 = r3.code
            int r0 = r5.index
            r6.put12(r4, r0)
            bsh.org.objectweb.asm.Label r6 = r3.currentBasicBlock
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
            r6 = 1
            r7 = -2
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
            r7 = -3
        L35:
            int r4 = r4 + r7
            goto L51
        L37:
            int r4 = r3.relativeStackSize
            if (r5 == r1) goto L3d
            if (r5 != r0) goto L3e
        L3d:
            r2 = r6
        L3e:
            int r4 = r4 + r2
            goto L51
        L40:
            int r4 = r3.relativeStackSize
            if (r5 == r1) goto L35
            if (r5 != r0) goto L47
            goto L35
        L47:
            r7 = -1
            goto L35
        L49:
            int r4 = r3.relativeStackSize
            if (r5 == r1) goto L4f
            if (r5 != r0) goto L50
        L4f:
            r6 = 2
        L50:
            int r4 = r4 + r6
        L51:
            int r5 = r3.maxRelativeStackSize
            if (r4 <= r5) goto L57
            r3.maxRelativeStackSize = r4
        L57:
            r3.relativeStackSize = r4
            return
        L5a:
            bsh.org.objectweb.asm.Frame r6 = r6.frame
            bsh.org.objectweb.asm.SymbolTable r7 = r3.symbolTable
            r6.execute(r4, r2, r5, r7)
        L61:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitFrame(int r11, int r12, java.lang.Object[] r13, int r14, java.lang.Object[] r15) {
            r10 = this;
            int r0 = r10.compute
            r1 = 4
            if (r0 != r1) goto L7
            goto Lc3
        L7:
            r2 = -1
            r3 = 2
            r4 = 3
            if (r0 != r4) goto L46
            bsh.org.objectweb.asm.Label r0 = r10.currentBasicBlock
            bsh.org.objectweb.asm.Frame r4 = r0.frame
            if (r4 != 0) goto L30
            bsh.org.objectweb.asm.CurrentFrame r11 = new bsh.org.objectweb.asm.CurrentFrame
            r11.<init>(r0)
            r0.frame = r11
            bsh.org.objectweb.asm.Label r11 = r10.currentBasicBlock
            bsh.org.objectweb.asm.Frame r11 = r11.frame
            bsh.org.objectweb.asm.SymbolTable r13 = r10.symbolTable
            int r15 = r10.accessFlags
            java.lang.String r0 = r10.descriptor
            r11.setInputFrameFromDescriptor(r13, r15, r0, r12)
            bsh.org.objectweb.asm.Label r11 = r10.currentBasicBlock
            bsh.org.objectweb.asm.Frame r11 = r11.frame
            r11.accept(r10)
            r8 = r14
            goto L164
        L30:
            if (r11 != r2) goto L3c
            bsh.org.objectweb.asm.SymbolTable r5 = r10.symbolTable
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r4.setInputFrameFromApiFormat(r5, r6, r7, r8, r9)
            goto L3d
        L3c:
            r8 = r14
        L3d:
            bsh.org.objectweb.asm.Label r11 = r10.currentBasicBlock
            bsh.org.objectweb.asm.Frame r11 = r11.frame
            r11.accept(r10)
            goto L164
        L46:
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r12 = 0
            if (r11 != r2) goto La6
            int[] r11 = r10.previousFrame
            if (r11 != 0) goto L6e
            java.lang.String r11 = r10.descriptor
            int r11 = bsh.org.objectweb.asm.Type.getArgumentsAndReturnSizes(r11)
            int r11 = r11 >> r3
            bsh.org.objectweb.asm.Frame r13 = new bsh.org.objectweb.asm.Frame
            bsh.org.objectweb.asm.Label r14 = new bsh.org.objectweb.asm.Label
            r14.<init>()
            r13.<init>(r14)
            bsh.org.objectweb.asm.SymbolTable r14 = r10.symbolTable
            int r15 = r10.accessFlags
            java.lang.String r0 = r10.descriptor
            r13.setInputFrameFromDescriptor(r14, r15, r0, r11)
            r13.accept(r10)
        L6e:
            r10.currentLocals = r6
            bsh.org.objectweb.asm.ByteVector r11 = r10.code
            int r11 = r11.length
            int r11 = r10.visitFrameStart(r11, r6, r8)
            r13 = r12
        L79:
            if (r13 >= r6) goto L8d
            int[] r14 = r10.currentFrame
            int r15 = r11 + 1
            bsh.org.objectweb.asm.SymbolTable r0 = r10.symbolTable
            r1 = r7[r13]
            int r0 = bsh.org.objectweb.asm.Frame.getAbstractTypeFromApiFormat(r0, r1)
            r14[r11] = r0
            int r13 = r13 + 1
            r11 = r15
            goto L79
        L8d:
            if (r12 >= r8) goto La1
            int[] r13 = r10.currentFrame
            int r14 = r11 + 1
            bsh.org.objectweb.asm.SymbolTable r15 = r10.symbolTable
            r0 = r9[r12]
            int r15 = bsh.org.objectweb.asm.Frame.getAbstractTypeFromApiFormat(r15, r0)
            r13[r11] = r15
            int r12 = r12 + 1
            r11 = r14
            goto L8d
        La1:
            r10.visitFrameEnd()
            goto L164
        La6:
            bsh.org.objectweb.asm.ByteVector r13 = r10.stackMapTableEntries
            r14 = 1
            if (r13 != 0) goto Lb7
            bsh.org.objectweb.asm.ByteVector r13 = new bsh.org.objectweb.asm.ByteVector
            r13.<init>()
            r10.stackMapTableEntries = r13
            bsh.org.objectweb.asm.ByteVector r13 = r10.code
            int r13 = r13.length
            goto Lca
        Lb7:
            bsh.org.objectweb.asm.ByteVector r13 = r10.code
            int r13 = r13.length
            int r15 = r10.previousFrameOffset
            int r13 = r13 - r15
            int r13 = r13 - r14
            if (r13 >= 0) goto Lca
            if (r11 != r4) goto Lc4
        Lc3:
            return
        Lc4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        Lca:
            if (r11 == 0) goto L12e
            if (r11 == r14) goto L114
            r15 = 251(0xfb, float:3.52E-43)
            if (r11 == r3) goto L104
            r0 = 64
            if (r11 == r4) goto Lf4
            if (r11 != r1) goto Lf0
            bsh.org.objectweb.asm.ByteVector r11 = r10.stackMapTableEntries
            if (r13 >= r0) goto Le1
            int r13 = r13 + r0
            r11.putByte(r13)
            goto Lea
        Le1:
            r15 = 247(0xf7, float:3.46E-43)
            bsh.org.objectweb.asm.ByteVector r11 = r11.putByte(r15)
            r11.putShort(r13)
        Lea:
            r11 = r9[r12]
            r10.putFrameType(r11)
            goto L159
        Lf0:
            j8.o.o()
            return
        Lf4:
            bsh.org.objectweb.asm.ByteVector r11 = r10.stackMapTableEntries
            if (r13 >= r0) goto Lfc
            r11.putByte(r13)
            goto L159
        Lfc:
            bsh.org.objectweb.asm.ByteVector r11 = r11.putByte(r15)
            r11.putShort(r13)
            goto L159
        L104:
            int r11 = r10.currentLocals
            int r11 = r11 - r6
            r10.currentLocals = r11
            bsh.org.objectweb.asm.ByteVector r11 = r10.stackMapTableEntries
            int r15 = r15 - r6
            bsh.org.objectweb.asm.ByteVector r11 = r11.putByte(r15)
            r11.putShort(r13)
            goto L159
        L114:
            int r11 = r10.currentLocals
            int r11 = r11 + r6
            r10.currentLocals = r11
            bsh.org.objectweb.asm.ByteVector r11 = r10.stackMapTableEntries
            int r15 = r6 + 251
            bsh.org.objectweb.asm.ByteVector r11 = r11.putByte(r15)
            r11.putShort(r13)
        L124:
            if (r12 >= r6) goto L159
            r11 = r7[r12]
            r10.putFrameType(r11)
            int r12 = r12 + 1
            goto L124
        L12e:
            r10.currentLocals = r6
            bsh.org.objectweb.asm.ByteVector r11 = r10.stackMapTableEntries
            r15 = 255(0xff, float:3.57E-43)
            bsh.org.objectweb.asm.ByteVector r11 = r11.putByte(r15)
            bsh.org.objectweb.asm.ByteVector r11 = r11.putShort(r13)
            r11.putShort(r6)
            r11 = r12
        L140:
            if (r11 >= r6) goto L14a
            r13 = r7[r11]
            r10.putFrameType(r13)
            int r11 = r11 + 1
            goto L140
        L14a:
            bsh.org.objectweb.asm.ByteVector r11 = r10.stackMapTableEntries
            r11.putShort(r8)
        L14f:
            if (r12 >= r8) goto L159
            r11 = r9[r12]
            r10.putFrameType(r11)
            int r12 = r12 + 1
            goto L14f
        L159:
            bsh.org.objectweb.asm.ByteVector r11 = r10.code
            int r11 = r11.length
            r10.previousFrameOffset = r11
            int r11 = r10.stackMapTableNumberOfEntries
            int r11 = r11 + r14
            r10.stackMapTableNumberOfEntries = r11
        L164:
            int r11 = r10.compute
            if (r11 != r3) goto L170
            r10.relativeStackSize = r8
            int r11 = r10.maxRelativeStackSize
            if (r8 <= r11) goto L170
            r10.maxRelativeStackSize = r8
        L170:
            int r11 = r10.maxStack
            int r11 = java.lang.Math.max(r11, r8)
            r10.maxStack = r11
            int r11 = r10.maxLocals
            int r12 = r10.currentLocals
            int r11 = java.lang.Math.max(r11, r12)
            r10.maxLocals = r11
            return
    }

    public void visitFrameEnd() {
            r1 = this;
            int[] r0 = r1.previousFrame
            if (r0 == 0) goto L18
            bsh.org.objectweb.asm.ByteVector r0 = r1.stackMapTableEntries
            if (r0 != 0) goto Lf
            bsh.org.objectweb.asm.ByteVector r0 = new bsh.org.objectweb.asm.ByteVector
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

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r4, int r5) {
            r3 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r3.code
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
            bsh.org.objectweb.asm.ByteVector r0 = r0.putByte(r2)
            r0.put11(r4, r5)
            goto L2a
        L1d:
            r1 = 196(0xc4, float:2.75E-43)
            bsh.org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            bsh.org.objectweb.asm.ByteVector r0 = r0.put12(r2, r4)
            r0.putShort(r5)
        L2a:
            bsh.org.objectweb.asm.Label r5 = r3.currentBasicBlock
            if (r5 == 0) goto L3c
            int r0 = r3.compute
            r1 = 4
            if (r0 == r1) goto L36
            r1 = 3
            if (r0 != r1) goto L3c
        L36:
            bsh.org.objectweb.asm.Frame r5 = r5.frame
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

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitInsn(int r4) {
            r3 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r3.code
            int r1 = r0.length
            r3.lastBytecodeOffset = r1
            r0.putByte(r4)
            bsh.org.objectweb.asm.Label r0 = r3.currentBasicBlock
            if (r0 == 0) goto L3c
            int r1 = r3.compute
            r2 = 4
            if (r1 == r2) goto L26
            r2 = 3
            if (r1 != r2) goto L16
            goto L26
        L16:
            int r0 = r3.relativeStackSize
            int[] r1 = bsh.org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
            r1 = r1[r4]
            int r0 = r0 + r1
            int r1 = r3.maxRelativeStackSize
            if (r0 <= r1) goto L23
            r3.maxRelativeStackSize = r0
        L23:
            r3.relativeStackSize = r0
            goto L2d
        L26:
            bsh.org.objectweb.asm.Frame r0 = r0.frame
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

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r4, int r5) {
            r3 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r3.code
            int r1 = r0.length
            r3.lastBytecodeOffset = r1
            r1 = 17
            if (r4 != r1) goto Le
            r0.put12(r4, r5)
            goto L11
        Le:
            r0.put11(r4, r5)
        L11:
            bsh.org.objectweb.asm.Label r0 = r3.currentBasicBlock
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
            return
        L2f:
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            r1 = 0
            r0.execute(r4, r5, r1, r1)
        L35:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r3, java.lang.String r4, bsh.org.objectweb.asm.Handle r5, java.lang.Object... r6) {
            r2 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r2.code
            int r0 = r0.length
            r2.lastBytecodeOffset = r0
            bsh.org.objectweb.asm.SymbolTable r0 = r2.symbolTable
            bsh.org.objectweb.asm.Symbol r3 = r0.addConstantInvokeDynamic(r3, r4, r5, r6)
            bsh.org.objectweb.asm.ByteVector r4 = r2.code
            int r5 = r3.index
            r6 = 186(0xba, float:2.6E-43)
            r4.put12(r6, r5)
            bsh.org.objectweb.asm.ByteVector r4 = r2.code
            r5 = 0
            r4.putShort(r5)
            bsh.org.objectweb.asm.Label r4 = r2.currentBasicBlock
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
            return
        L3f:
            bsh.org.objectweb.asm.Frame r4 = r4.frame
            bsh.org.objectweb.asm.SymbolTable r0 = r2.symbolTable
            r4.execute(r6, r5, r3, r0)
        L46:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r11, bsh.org.objectweb.asm.Label r12) {
            r10 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r10.code
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
            bsh.org.objectweb.asm.ByteVector r11 = r10.code
            r0 = 8
            r11.putShort(r0)
            bsh.org.objectweb.asm.ByteVector r11 = r10.code
            r0 = 220(0xdc, float:3.08E-43)
            r11.putByte(r0)
            r10.hasAsmInstructions = r9
            r11 = r9
        L4f:
            bsh.org.objectweb.asm.ByteVector r0 = r10.code
            int r1 = r0.length
            int r1 = r1 - r9
            r12.put(r0, r1, r9)
            goto L72
        L58:
            if (r3 == r11) goto L66
            r0.putByte(r11)
            bsh.org.objectweb.asm.ByteVector r11 = r10.code
            int r0 = r11.length
            int r0 = r0 - r9
            r12.put(r11, r0, r9)
            goto L71
        L66:
            r0.putByte(r3)
            bsh.org.objectweb.asm.ByteVector r11 = r10.code
            int r0 = r11.length
            int r0 = r0 - r9
            r12.put(r11, r0, r8)
        L71:
            r11 = r8
        L72:
            bsh.org.objectweb.asm.Label r0 = r10.currentBasicBlock
            if (r0 == 0) goto Leb
            int r1 = r10.compute
            r2 = 2
            r4 = 0
            if (r1 != r5) goto L96
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            r0.execute(r3, r8, r4, r4)
            bsh.org.objectweb.asm.Label r0 = r12.getCanonicalInstance()
            short r1 = r0.flags
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r10.addSuccessorToCurrentBasicBlock(r8, r12)
            if (r3 == r7) goto Ld9
            bsh.org.objectweb.asm.Label r4 = new bsh.org.objectweb.asm.Label
            r4.<init>()
            goto Ld9
        L96:
            r5 = 3
            if (r1 != r5) goto L9f
            bsh.org.objectweb.asm.Frame r12 = r0.frame
            r12.execute(r3, r8, r4, r4)
            goto Ld9
        L9f:
            if (r1 != r2) goto Lab
            int r12 = r10.relativeStackSize
            int[] r0 = bsh.org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
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
            bsh.org.objectweb.asm.Label r4 = new bsh.org.objectweb.asm.Label
            r4.<init>()
            goto Ld9
        Lcd:
            int r0 = r10.relativeStackSize
            int[] r1 = bsh.org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
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

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLabel(bsh.org.objectweb.asm.Label r7) {
            r6 = this;
            boolean r0 = r6.hasAsmInstructions
            bsh.org.objectweb.asm.ByteVector r1 = r6.code
            byte[] r2 = r1.data
            int r1 = r1.length
            boolean r1 = r7.resolve(r2, r1)
            r0 = r0 | r1
            r6.hasAsmInstructions = r0
            short r0 = r7.flags
            r1 = r0 & 1
            if (r1 == 0) goto L17
            goto L96
        L17:
            int r1 = r6.compute
            r2 = 4
            r3 = 0
            r4 = 2
            if (r1 != r2) goto L5f
            bsh.org.objectweb.asm.Label r1 = r6.currentBasicBlock
            if (r1 == 0) goto L37
            int r2 = r7.bytecodeOffset
            int r5 = r1.bytecodeOffset
            if (r2 != r5) goto L34
            short r2 = r1.flags
            r0 = r0 & r4
            r0 = r0 | r2
            short r0 = (short) r0
            r1.flags = r0
            bsh.org.objectweb.asm.Frame r0 = r1.frame
            r7.frame = r0
            return
        L34:
            r6.addSuccessorToCurrentBasicBlock(r3, r7)
        L37:
            bsh.org.objectweb.asm.Label r0 = r6.lastBasicBlock
            if (r0 == 0) goto L53
            int r1 = r7.bytecodeOffset
            int r2 = r0.bytecodeOffset
            if (r1 != r2) goto L51
            short r1 = r0.flags
            short r2 = r7.flags
            r2 = r2 & r4
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            bsh.org.objectweb.asm.Frame r1 = r0.frame
            r7.frame = r1
            r6.currentBasicBlock = r0
            return
        L51:
            r0.nextBasicBlock = r7
        L53:
            r6.lastBasicBlock = r7
            r6.currentBasicBlock = r7
            bsh.org.objectweb.asm.Frame r0 = new bsh.org.objectweb.asm.Frame
            r0.<init>(r7)
            r7.frame = r0
            return
        L5f:
            r0 = 3
            if (r1 != r0) goto L6e
            bsh.org.objectweb.asm.Label r0 = r6.currentBasicBlock
            if (r0 != 0) goto L69
            r6.currentBasicBlock = r7
            return
        L69:
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            r0.owner = r7
            return
        L6e:
            r0 = 1
            if (r1 != r0) goto L8e
            bsh.org.objectweb.asm.Label r0 = r6.currentBasicBlock
            if (r0 == 0) goto L7f
            int r1 = r6.maxRelativeStackSize
            short r1 = (short) r1
            r0.outputStackMax = r1
            int r0 = r6.relativeStackSize
            r6.addSuccessorToCurrentBasicBlock(r0, r7)
        L7f:
            r6.currentBasicBlock = r7
            r6.relativeStackSize = r3
            r6.maxRelativeStackSize = r3
            bsh.org.objectweb.asm.Label r0 = r6.lastBasicBlock
            if (r0 == 0) goto L8b
            r0.nextBasicBlock = r7
        L8b:
            r6.lastBasicBlock = r7
            return
        L8e:
            if (r1 != r4) goto L96
            bsh.org.objectweb.asm.Label r0 = r6.currentBasicBlock
            if (r0 != 0) goto L96
            r6.currentBasicBlock = r7
        L96:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r8) {
            r7 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r7.code
            int r0 = r0.length
            r7.lastBytecodeOffset = r0
            bsh.org.objectweb.asm.SymbolTable r0 = r7.symbolTable
            bsh.org.objectweb.asm.Symbol r8 = r0.addConstant(r8)
            int r0 = r8.index
            int r1 = r8.tag
            r2 = 5
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L1b
            r2 = 6
            if (r1 != r2) goto L19
            goto L1b
        L19:
            r1 = r4
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r2 = 18
            if (r1 == 0) goto L28
            bsh.org.objectweb.asm.ByteVector r5 = r7.code
            r6 = 20
            r5.put12(r6, r0)
            goto L37
        L28:
            bsh.org.objectweb.asm.ByteVector r5 = r7.code
            r6 = 256(0x100, float:3.59E-43)
            if (r0 < r6) goto L34
            r6 = 19
            r5.put12(r6, r0)
            goto L37
        L34:
            r5.put11(r2, r0)
        L37:
            bsh.org.objectweb.asm.Label r0 = r7.currentBasicBlock
            if (r0 == 0) goto L5a
            int r5 = r7.compute
            r6 = 4
            if (r5 == r6) goto L53
            r6 = 3
            if (r5 != r6) goto L44
            goto L53
        L44:
            int r8 = r7.relativeStackSize
            if (r1 == 0) goto L49
            r3 = 2
        L49:
            int r8 = r8 + r3
            int r0 = r7.maxRelativeStackSize
            if (r8 <= r0) goto L50
            r7.maxRelativeStackSize = r8
        L50:
            r7.relativeStackSize = r8
            return
        L53:
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            bsh.org.objectweb.asm.SymbolTable r1 = r7.symbolTable
            r0.execute(r2, r4, r8, r1)
        L5a:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int r2, bsh.org.objectweb.asm.Label r3) {
            r1 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r1.lineNumberTable
            if (r0 != 0) goto Lb
            bsh.org.objectweb.asm.ByteVector r0 = new bsh.org.objectweb.asm.ByteVector
            r0.<init>()
            r1.lineNumberTable = r0
        Lb:
            int r0 = r1.lineNumberTableLength
            int r0 = r0 + 1
            r1.lineNumberTableLength = r0
            bsh.org.objectweb.asm.ByteVector r0 = r1.lineNumberTable
            int r3 = r3.bytecodeOffset
            r0.putShort(r3)
            bsh.org.objectweb.asm.ByteVector r3 = r1.lineNumberTable
            r3.putShort(r2)
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r5, java.lang.String r6, java.lang.String r7, bsh.org.objectweb.asm.Label r8, bsh.org.objectweb.asm.Label r9, int r10) {
            r4 = this;
            r0 = 1
            if (r7 == 0) goto L3b
            bsh.org.objectweb.asm.ByteVector r1 = r4.localVariableTypeTable
            if (r1 != 0) goto Le
            bsh.org.objectweb.asm.ByteVector r1 = new bsh.org.objectweb.asm.ByteVector
            r1.<init>()
            r4.localVariableTypeTable = r1
        Le:
            int r1 = r4.localVariableTypeTableLength
            int r1 = r1 + r0
            r4.localVariableTypeTableLength = r1
            bsh.org.objectweb.asm.ByteVector r1 = r4.localVariableTypeTable
            int r2 = r8.bytecodeOffset
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            int r2 = r9.bytecodeOffset
            int r3 = r8.bytecodeOffset
            int r2 = r2 - r3
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            bsh.org.objectweb.asm.SymbolTable r2 = r4.symbolTable
            int r2 = r2.addConstantUtf8(r5)
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r2)
            bsh.org.objectweb.asm.SymbolTable r2 = r4.symbolTable
            int r7 = r2.addConstantUtf8(r7)
            bsh.org.objectweb.asm.ByteVector r7 = r1.putShort(r7)
            r7.putShort(r10)
        L3b:
            bsh.org.objectweb.asm.ByteVector r7 = r4.localVariableTable
            if (r7 != 0) goto L46
            bsh.org.objectweb.asm.ByteVector r7 = new bsh.org.objectweb.asm.ByteVector
            r7.<init>()
            r4.localVariableTable = r7
        L46:
            int r7 = r4.localVariableTableLength
            int r7 = r7 + r0
            r4.localVariableTableLength = r7
            bsh.org.objectweb.asm.ByteVector r7 = r4.localVariableTable
            int r1 = r8.bytecodeOffset
            bsh.org.objectweb.asm.ByteVector r7 = r7.putShort(r1)
            int r9 = r9.bytecodeOffset
            int r8 = r8.bytecodeOffset
            int r9 = r9 - r8
            bsh.org.objectweb.asm.ByteVector r7 = r7.putShort(r9)
            bsh.org.objectweb.asm.SymbolTable r8 = r4.symbolTable
            int r5 = r8.addConstantUtf8(r5)
            bsh.org.objectweb.asm.ByteVector r5 = r7.putShort(r5)
            bsh.org.objectweb.asm.SymbolTable r7 = r4.symbolTable
            int r7 = r7.addConstantUtf8(r6)
            bsh.org.objectweb.asm.ByteVector r5 = r5.putShort(r7)
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

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(bsh.org.objectweb.asm.Label r6, int[] r7, bsh.org.objectweb.asm.Label[] r8) {
            r5 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r5.code
            int r1 = r0.length
            r5.lastBytecodeOffset = r1
            r1 = 171(0xab, float:2.4E-43)
            bsh.org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            bsh.org.objectweb.asm.ByteVector r1 = r5.code
            int r1 = r1.length
            int r1 = r1 % 4
            int r1 = 4 - r1
            int r1 = r1 % 4
            r2 = 0
            r3 = 0
            r0.putByteArray(r2, r3, r1)
            bsh.org.objectweb.asm.ByteVector r0 = r5.code
            int r1 = r5.lastBytecodeOffset
            r2 = 1
            r6.put(r0, r1, r2)
            bsh.org.objectweb.asm.ByteVector r0 = r5.code
            int r1 = r8.length
            r0.putInt(r1)
        L29:
            int r0 = r8.length
            if (r3 >= r0) goto L3f
            bsh.org.objectweb.asm.ByteVector r0 = r5.code
            r1 = r7[r3]
            r0.putInt(r1)
            r0 = r8[r3]
            bsh.org.objectweb.asm.ByteVector r1 = r5.code
            int r4 = r5.lastBytecodeOffset
            r0.put(r1, r4, r2)
            int r3 = r3 + 1
            goto L29
        L3f:
            r5.visitSwitchInsn(r6, r8)
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitMaxs(int r3, int r4) {
            r2 = this;
            int r0 = r2.compute
            r1 = 4
            if (r0 != r1) goto L9
            r2.computeAllFrames()
            return
        L9:
            r1 = 1
            if (r0 != r1) goto L10
            r2.computeMaxStackAndLocal()
            return
        L10:
            r1 = 2
            if (r0 != r1) goto L18
            int r3 = r2.maxRelativeStackSize
            r2.maxStack = r3
            return
        L18:
            r2.maxStack = r3
            r2.maxLocals = r4
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r1 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r1.code
            int r0 = r0.length
            r1.lastBytecodeOffset = r0
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r3 = r0.addConstantMethodref(r3, r4, r5, r6)
            bsh.org.objectweb.asm.ByteVector r4 = r1.code
            r5 = 0
            r6 = 185(0xb9, float:2.59E-43)
            if (r2 != r6) goto L23
            int r0 = r3.index
            bsh.org.objectweb.asm.ByteVector r4 = r4.put12(r6, r0)
            int r6 = r3.getArgumentsAndReturnSizes()
            int r6 = r6 >> 2
            r4.put11(r6, r5)
            goto L28
        L23:
            int r6 = r3.index
            r4.put12(r2, r6)
        L28:
            bsh.org.objectweb.asm.Label r4 = r1.currentBasicBlock
            if (r4 == 0) goto L59
            int r6 = r1.compute
            r0 = 4
            if (r6 == r0) goto L52
            r0 = 3
            if (r6 != r0) goto L35
            goto L52
        L35:
            int r3 = r3.getArgumentsAndReturnSizes()
            r4 = r3 & 3
            int r3 = r3 >> 2
            int r4 = r4 - r3
            int r3 = r1.relativeStackSize
            r5 = 184(0xb8, float:2.58E-43)
            if (r2 != r5) goto L48
            int r3 = r3 + r4
            int r3 = r3 + 1
            goto L49
        L48:
            int r3 = r3 + r4
        L49:
            int r2 = r1.maxRelativeStackSize
            if (r3 <= r2) goto L4f
            r1.maxRelativeStackSize = r3
        L4f:
            r1.relativeStackSize = r3
            return
        L52:
            bsh.org.objectweb.asm.Frame r4 = r4.frame
            bsh.org.objectweb.asm.SymbolTable r6 = r1.symbolTable
            r4.execute(r2, r5, r3, r6)
        L59:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r5, int r6) {
            r4 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r4.code
            int r0 = r0.length
            r4.lastBytecodeOffset = r0
            bsh.org.objectweb.asm.SymbolTable r0 = r4.symbolTable
            bsh.org.objectweb.asm.Symbol r5 = r0.addConstantClass(r5)
            bsh.org.objectweb.asm.ByteVector r0 = r4.code
            int r1 = r5.index
            r2 = 197(0xc5, float:2.76E-43)
            bsh.org.objectweb.asm.ByteVector r0 = r0.put12(r2, r1)
            r0.putByte(r6)
            bsh.org.objectweb.asm.Label r0 = r4.currentBasicBlock
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
            int r6 = r6 + r5
            r4.relativeStackSize = r6
            return
        L2e:
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            bsh.org.objectweb.asm.SymbolTable r1 = r4.symbolTable
            r0.execute(r2, r6, r5, r1)
        L35:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitParameter(java.lang.String r3, int r4) {
            r2 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r2.parameters
            if (r0 != 0) goto Lb
            bsh.org.objectweb.asm.ByteVector r0 = new bsh.org.objectweb.asm.ByteVector
            r0.<init>()
            r2.parameters = r0
        Lb:
            int r0 = r2.parametersCount
            int r0 = r0 + 1
            r2.parametersCount = r0
            bsh.org.objectweb.asm.ByteVector r0 = r2.parameters
            if (r3 != 0) goto L17
            r3 = 0
            goto L1d
        L17:
            bsh.org.objectweb.asm.SymbolTable r1 = r2.symbolTable
            int r3 = r1.addConstantUtf8(r3)
        L1d:
            bsh.org.objectweb.asm.ByteVector r3 = r0.putShort(r3)
            r3.putShort(r4)
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int r5, int r6, bsh.org.objectweb.asm.Label r7, bsh.org.objectweb.asm.Label... r8) {
            r4 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r4.code
            int r1 = r0.length
            r4.lastBytecodeOffset = r1
            r1 = 170(0xaa, float:2.38E-43)
            bsh.org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            bsh.org.objectweb.asm.ByteVector r1 = r4.code
            int r1 = r1.length
            int r1 = r1 % 4
            int r1 = 4 - r1
            int r1 = r1 % 4
            r2 = 0
            r3 = 0
            r0.putByteArray(r2, r3, r1)
            bsh.org.objectweb.asm.ByteVector r0 = r4.code
            int r1 = r4.lastBytecodeOffset
            r2 = 1
            r7.put(r0, r1, r2)
            bsh.org.objectweb.asm.ByteVector r0 = r4.code
            bsh.org.objectweb.asm.ByteVector r5 = r0.putInt(r5)
            r5.putInt(r6)
            int r5 = r8.length
        L2d:
            if (r3 >= r5) goto L3b
            r6 = r8[r3]
            bsh.org.objectweb.asm.ByteVector r0 = r4.code
            int r1 = r4.lastBytecodeOffset
            r6.put(r0, r1, r2)
            int r3 = r3 + 1
            goto L2d
        L3b:
            r4.visitSwitchInsn(r7, r8)
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(bsh.org.objectweb.asm.Label r7, bsh.org.objectweb.asm.Label r8, bsh.org.objectweb.asm.Label r9, java.lang.String r10) {
            r6 = this;
            bsh.org.objectweb.asm.Handler r0 = new bsh.org.objectweb.asm.Handler
            if (r10 == 0) goto L12
            bsh.org.objectweb.asm.SymbolTable r1 = r6.symbolTable
            bsh.org.objectweb.asm.Symbol r1 = r1.addConstantClass(r10)
            int r1 = r1.index
        Lc:
            r2 = r8
            r3 = r9
            r5 = r10
            r4 = r1
            r1 = r7
            goto L14
        L12:
            r1 = 0
            goto Lc
        L14:
            r0.<init>(r1, r2, r3, r4, r5)
            bsh.org.objectweb.asm.Handler r7 = r6.firstHandler
            if (r7 != 0) goto L1e
            r6.firstHandler = r0
            goto L22
        L1e:
            bsh.org.objectweb.asm.Handler r7 = r6.lastHandler
            r7.nextHandler = r0
        L22:
            r6.lastHandler = r0
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r4, java.lang.String r5) {
            r3 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r3.code
            int r0 = r0.length
            r3.lastBytecodeOffset = r0
            bsh.org.objectweb.asm.SymbolTable r0 = r3.symbolTable
            bsh.org.objectweb.asm.Symbol r5 = r0.addConstantClass(r5)
            bsh.org.objectweb.asm.ByteVector r0 = r3.code
            int r1 = r5.index
            r0.put12(r4, r1)
            bsh.org.objectweb.asm.Label r0 = r3.currentBasicBlock
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
            return
        L31:
            bsh.org.objectweb.asm.Frame r0 = r0.frame
            int r1 = r3.lastBytecodeOffset
            bsh.org.objectweb.asm.SymbolTable r2 = r3.symbolTable
            r0.execute(r4, r1, r5, r2)
        L3a:
            return
    }

    @Override // bsh.org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r7, int r8) {
            r6 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r6.code
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
            bsh.org.objectweb.asm.ByteVector r0 = r0.putByte(r4)
            r0.put12(r7, r8)
            goto L35
        L32:
            r0.put11(r7, r8)
        L35:
            bsh.org.objectweb.asm.Label r0 = r6.currentBasicBlock
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
            int[] r1 = bsh.org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
            r1 = r1[r7]
            int r0 = r0 + r1
            int r1 = r6.maxRelativeStackSize
            if (r0 <= r1) goto L60
            r6.maxRelativeStackSize = r0
        L60:
            r6.relativeStackSize = r0
            goto L69
        L63:
            bsh.org.objectweb.asm.Frame r0 = r0.frame
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
            bsh.org.objectweb.asm.Handler r7 = r6.firstHandler
            if (r7 == 0) goto L99
            bsh.org.objectweb.asm.Label r7 = new bsh.org.objectweb.asm.Label
            r7.<init>()
            r6.visitLabel(r7)
        L99:
            return
    }
}
