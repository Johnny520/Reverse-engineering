package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 67108864;
    private static final int BOOLEAN = 4194313;
    private static final int BYTE = 4194314;
    private static final int CHAR = 4194315;
    static final int CHOP_FRAME = 248;
    private static final int CONSTANT_KIND = 4194304;
    private static final int DIM_MASK = -67108864;
    private static final int DIM_SHIFT = 26;
    private static final int DIM_SIZE = 6;
    private static final int DOUBLE = 4194307;
    private static final int ELEMENT_OF = -67108864;
    private static final int FLAGS_SHIFT = 20;
    private static final int FLAGS_SIZE = 2;
    private static final int FLOAT = 4194306;
    private static final int FORWARD_UNINITIALIZED_KIND = 16777216;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 4194305;
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
    private static final int KIND_MASK = 62914560;
    private static final int KIND_SHIFT = 22;
    private static final int KIND_SIZE = 4;
    private static final int LOCAL_KIND = 20971520;
    private static final int LONG = 4194308;
    private static final int NULL = 4194309;
    private static final int REFERENCE_KIND = 8388608;
    static final int RESERVED = 128;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 4194316;
    private static final int STACK_KIND = 25165824;
    private static final int TOP = 4194304;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    private static final int UNINITIALIZED_KIND = 12582912;
    private static final int UNINITIALIZED_THIS = 4194310;
    private static final int VALUE_MASK = 1048575;
    private static final int VALUE_SIZE = 20;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    net.bytebuddy.jar.asm.Label owner;

    public Frame(net.bytebuddy.jar.asm.Label r1) {
            r0 = this;
            r0.<init>()
            r0.owner = r1
            return
    }

    private void addInitializedType(int r5) {
            r4 = this;
            int[] r0 = r4.initializations
            if (r0 != 0) goto L9
            r0 = 2
            int[] r0 = new int[r0]
            r4.initializations = r0
        L9:
            int[] r0 = r4.initializations
            int r0 = r0.length
            int r1 = r4.initializationCount
            if (r1 < r0) goto L22
            int r1 = r1 + 1
            int r2 = r0 * 2
            int r1 = java.lang.Math.max(r1, r2)
            int[] r1 = new int[r1]
            int[] r2 = r4.initializations
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            r4.initializations = r1
        L22:
            int[] r0 = r4.initializations
            int r1 = r4.initializationCount
            int r2 = r1 + 1
            r4.initializationCount = r2
            r0[r1] = r5
            return
    }

    public static int getAbstractTypeFromApiFormat(net.bytebuddy.jar.asm.SymbolTable r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto Le
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 | r3
            return r2
        Le:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r3 = (java.lang.String) r3
            net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getObjectType(r3)
            java.lang.String r3 = r3.getDescriptor()
            r0 = 0
            int r2 = getAbstractTypeFromDescriptor(r2, r3, r0)
            return r2
        L22:
            net.bytebuddy.jar.asm.Label r3 = (net.bytebuddy.jar.asm.Label) r3
            short r0 = r3.flags
            r0 = r0 & 4
            java.lang.String r1 = ""
            if (r0 == 0) goto L36
            int r3 = r3.bytecodeOffset
            int r2 = r2.addUninitializedType(r1, r3)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r3
            return r2
        L36:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            int r2 = r2.addForwardUninitializedType(r1, r3)
            r2 = r2 | r0
            return r2
    }

    private static int getAbstractTypeFromDescriptor(net.bytebuddy.jar.asm.SymbolTable r16, java.lang.String r17, int r18) {
            r0 = r16
            r1 = r17
            char r2 = r17.charAt(r18)
            r3 = 4194306(0x400002, float:5.877475E-39)
            r4 = 70
            if (r2 == r4) goto Ld2
            r5 = 8388608(0x800000, float:1.1754944E-38)
            r6 = 76
            if (r2 == r6) goto Lc0
            r7 = 4194305(0x400001, float:5.877473E-39)
            r8 = 83
            if (r2 == r8) goto Lbf
            r9 = 86
            if (r2 == r9) goto Lbd
            r9 = 73
            if (r2 == r9) goto Lbf
            r10 = 4194308(0x400004, float:5.877477E-39)
            r11 = 74
            if (r2 == r11) goto Lbc
            r12 = 90
            if (r2 == r12) goto Lbf
            r13 = 4194307(0x400003, float:5.877476E-39)
            r14 = 91
            if (r2 == r14) goto L55
            switch(r2) {
                case 66: goto Lbf;
                case 67: goto Lbf;
                case 68: goto L54;
                default: goto L39;
            }
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid descriptor: "
            r2.append(r3)
            java.lang.String r1 = r17.substring(r18)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L54:
            return r13
        L55:
            int r2 = r18 + 1
        L57:
            char r15 = r1.charAt(r2)
            if (r15 != r14) goto L60
            int r2 = r2 + 1
            goto L57
        L60:
            char r14 = r1.charAt(r2)
            if (r14 == r4) goto Lb6
            if (r14 == r6) goto La4
            if (r14 == r8) goto La0
            if (r14 == r12) goto L9c
            if (r14 == r9) goto L9a
            if (r14 == r11) goto L98
            switch(r14) {
                case 66: goto L94;
                case 67: goto L90;
                case 68: goto L8e;
                default: goto L73;
            }
        L73:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid descriptor fragment: "
            r3.append(r4)
            java.lang.String r1 = r1.substring(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L8e:
            r3 = r13
            goto Lb6
        L90:
            r3 = 4194315(0x40000b, float:5.877487E-39)
            goto Lb6
        L94:
            r3 = 4194314(0x40000a, float:5.877486E-39)
            goto Lb6
        L98:
            r3 = r10
            goto Lb6
        L9a:
            r3 = r7
            goto Lb6
        L9c:
            r3 = 4194313(0x400009, float:5.877484E-39)
            goto Lb6
        La0:
            r3 = 4194316(0x40000c, float:5.877489E-39)
            goto Lb6
        La4:
            int r3 = r2 + 1
            int r4 = r17.length()
            int r4 = r4 + (-1)
            java.lang.String r1 = r1.substring(r3, r4)
            int r0 = r0.addType(r1)
            r3 = r0 | r5
        Lb6:
            int r2 = r2 - r18
            int r0 = r2 << 26
            r0 = r0 | r3
            return r0
        Lbc:
            return r10
        Lbd:
            r0 = 0
            return r0
        Lbf:
            return r7
        Lc0:
            int r2 = r18 + 1
            int r3 = r17.length()
            int r3 = r3 + (-1)
            java.lang.String r1 = r1.substring(r2, r3)
            int r0 = r0.addType(r1)
            r0 = r0 | r5
            return r0
        Ld2:
            return r3
    }

    public static int getAbstractTypeFromInternalName(net.bytebuddy.jar.asm.SymbolTable r1, java.lang.String r2) {
            r0 = 8388608(0x800000, float:1.1754944E-38)
            int r1 = r1.addType(r2)
            r1 = r1 | r0
            return r1
    }

    private int getConcreteOutputType(int r9, int r10) {
            r8 = this;
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r9
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r1 = r1 & r9
            r2 = 20971520(0x1400000, float:3.526483E-38)
            r3 = 4194304(0x400000, float:5.877472E-39)
            r4 = 4194307(0x400003, float:5.877476E-39)
            r5 = 4194308(0x400004, float:5.877477E-39)
            r6 = 1048576(0x100000, float:1.469368E-39)
            r7 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r2) goto L28
            int[] r10 = r8.inputLocals
            r1 = r9 & r7
            r10 = r10[r1]
            int r0 = r0 + r10
            r9 = r9 & r6
            if (r9 == 0) goto L26
            if (r0 == r5) goto L27
            if (r0 != r4) goto L26
            goto L27
        L26:
            r3 = r0
        L27:
            return r3
        L28:
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            if (r1 != r2) goto L3e
            int[] r1 = r8.inputStack
            r2 = r9 & r7
            int r10 = r10 - r2
            r10 = r1[r10]
            int r0 = r0 + r10
            r9 = r9 & r6
            if (r9 == 0) goto L3c
            if (r0 == r5) goto L3d
            if (r0 != r4) goto L3c
            goto L3d
        L3c:
            r3 = r0
        L3d:
            return r3
        L3e:
            return r9
    }

    private int getInitializedType(net.bytebuddy.jar.asm.SymbolTable r9, int r10) {
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto L10
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == r2) goto L10
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r2) goto L58
        L10:
            r1 = 0
        L11:
            int r2 = r8.initializationCount
            if (r1 >= r2) goto L58
            int[] r2 = r8.initializations
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L2e
            int[] r2 = r8.inputLocals
            r2 = r2[r6]
        L2c:
            int r2 = r2 + r3
            goto L39
        L2e:
            r7 = 25165824(0x1800000, float:4.7019774E-38)
            if (r4 != r7) goto L39
            int[] r2 = r8.inputStack
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L2c
        L39:
            if (r10 != r2) goto L55
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L49
            java.lang.String r10 = r9.getClassName()
            int r9 = r9.addType(r10)
        L47:
            r9 = r9 | r1
            return r9
        L49:
            r10 = r10 & r5
            net.bytebuddy.jar.asm.Symbol r10 = r9.getType(r10)
            java.lang.String r10 = r10.value
            int r9 = r9.addType(r10)
            goto L47
        L55:
            int r1 = r1 + 1
            goto L11
        L58:
            return r10
    }

    private int getLocal(int r4) {
            r3 = this;
            int[] r0 = r3.outputLocals
            r1 = 20971520(0x1400000, float:3.526483E-38)
            if (r0 == 0) goto L13
            int r2 = r0.length
            if (r4 < r2) goto La
            goto L13
        La:
            r2 = r0[r4]
            if (r2 != 0) goto L12
            r2 = r4 | r1
            r0[r4] = r2
        L12:
            return r2
        L13:
            r4 = r4 | r1
            return r4
    }

    private static boolean merge(net.bytebuddy.jar.asm.SymbolTable r11, int r12, int[] r13, int r14) {
            r0 = r13[r14]
            r1 = 0
            if (r0 != r12) goto L6
            return r1
        L6:
            r2 = 67108863(0x3ffffff, float:1.5046327E-36)
            r2 = r2 & r12
            r3 = 4194309(0x400005, float:5.877479E-39)
            if (r2 != r3) goto L13
            if (r0 != r3) goto L12
            return r1
        L12:
            r12 = r3
        L13:
            r2 = 1
            if (r0 != 0) goto L19
            r13[r14] = r12
            return r2
        L19:
            r4 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r5 = r0 & r4
            r6 = 4194304(0x400000, float:5.877472E-39)
            r7 = 62914560(0x3c00000, float:1.1284746E-36)
            r8 = 8388608(0x800000, float:1.1754944E-38)
            if (r5 != 0) goto L38
            r9 = r0 & r7
            if (r9 != r8) goto L2a
            goto L38
        L2a:
            if (r0 != r3) goto L80
            r11 = r12 & r4
            if (r11 != 0) goto L36
            r11 = r12 & r7
            if (r11 != r8) goto L35
            goto L36
        L35:
            r12 = r6
        L36:
            r6 = r12
            goto L80
        L38:
            if (r12 != r3) goto L3b
            return r1
        L3b:
            r3 = -4194304(0xffffffffffc00000, float:NaN)
            r9 = r12 & r3
            r3 = r3 & r0
            java.lang.String r10 = "java/lang/Object"
            if (r9 != r3) goto L61
            r3 = r0 & r7
            if (r3 != r8) goto L57
            r3 = r12 & r4
            r3 = r3 | r8
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r12 & r4
            r4 = r4 & r0
            int r11 = r11.addMergedType(r12, r4)
            r6 = r3 | r11
            goto L80
        L57:
            r12 = r12 & r4
            int r12 = r12 + r4
            r12 = r12 | r8
            int r11 = r11.addType(r10)
        L5e:
            r6 = r12 | r11
            goto L80
        L61:
            r3 = r12 & r4
            if (r3 != 0) goto L69
            r9 = r12 & r7
            if (r9 != r8) goto L80
        L69:
            if (r3 == 0) goto L6f
            r12 = r12 & r7
            if (r12 == r8) goto L6f
            int r3 = r3 + r4
        L6f:
            if (r5 == 0) goto L76
            r12 = r0 & r7
            if (r12 == r8) goto L76
            int r5 = r5 + r4
        L76:
            int r12 = java.lang.Math.min(r3, r5)
            r12 = r12 | r8
            int r11 = r11.addType(r10)
            goto L5e
        L80:
            if (r6 == r0) goto L85
            r13[r14] = r6
            return r2
        L85:
            return r1
    }

    private int pop() {
            r2 = this;
            short r0 = r2.outputStackTop
            if (r0 <= 0) goto Le
            int[] r1 = r2.outputStack
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r2.outputStackTop = r0
            r0 = r1[r0]
            return r0
        Le:
            short r0 = r2.outputStackStart
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r2.outputStackStart = r0
            int r0 = -r0
            r1 = 25165824(0x1800000, float:4.7019774E-38)
            r0 = r0 | r1
            return r0
    }

    private void pop(int r3) {
            r2 = this;
            short r0 = r2.outputStackTop
            if (r0 < r3) goto L9
            int r0 = r0 - r3
            short r3 = (short) r0
            r2.outputStackTop = r3
            goto L13
        L9:
            short r1 = r2.outputStackStart
            int r3 = r3 - r0
            int r1 = r1 - r3
            short r3 = (short) r1
            r2.outputStackStart = r3
            r3 = 0
            r2.outputStackTop = r3
        L13:
            return
    }

    private void pop(java.lang.String r5) {
            r4 = this;
            r0 = 0
            char r0 = r5.charAt(r0)
            r1 = 40
            r2 = 1
            r3 = 2
            if (r0 != r1) goto L15
            int r5 = net.bytebuddy.jar.asm.Type.getArgumentsAndReturnSizes(r5)
            int r5 = r5 >> r3
            int r5 = r5 - r2
            r4.pop(r5)
            goto L25
        L15:
            r5 = 74
            if (r0 == r5) goto L22
            r5 = 68
            if (r0 != r5) goto L1e
            goto L22
        L1e:
            r4.pop(r2)
            goto L25
        L22:
            r4.pop(r3)
        L25:
            return
    }

    private void push(int r5) {
            r4 = this;
            int[] r0 = r4.outputStack
            if (r0 != 0) goto La
            r0 = 10
            int[] r0 = new int[r0]
            r4.outputStack = r0
        La:
            int[] r0 = r4.outputStack
            int r0 = r0.length
            short r1 = r4.outputStackTop
            if (r1 < r0) goto L23
            int r1 = r1 + 1
            int r2 = r0 * 2
            int r1 = java.lang.Math.max(r1, r2)
            int[] r1 = new int[r1]
            int[] r2 = r4.outputStack
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            r4.outputStack = r1
        L23:
            int[] r0 = r4.outputStack
            short r1 = r4.outputStackTop
            int r2 = r1 + 1
            short r2 = (short) r2
            r4.outputStackTop = r2
            r0[r1] = r5
            short r5 = r4.outputStackStart
            int r5 = r5 + r2
            short r5 = (short) r5
            net.bytebuddy.jar.asm.Label r0 = r4.owner
            short r1 = r0.outputStackMax
            if (r5 <= r1) goto L3a
            r0.outputStackMax = r5
        L3a:
            return
    }

    private void push(net.bytebuddy.jar.asm.SymbolTable r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 40
            if (r1 != r2) goto Ld
            int r0 = net.bytebuddy.jar.asm.Type.getReturnTypeOffset(r5)
        Ld:
            int r4 = getAbstractTypeFromDescriptor(r4, r5, r0)
            if (r4 == 0) goto L25
            r3.push(r4)
            r5 = 4194308(0x400004, float:5.877477E-39)
            if (r4 == r5) goto L20
            r5 = 4194307(0x400003, float:5.877476E-39)
            if (r4 != r5) goto L25
        L20:
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3.push(r4)
        L25:
            return
    }

    public static void putAbstractType(net.bytebuddy.jar.asm.SymbolTable r7, int r8, net.bytebuddy.jar.asm.ByteVector r9) {
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r8
            int r0 = r0 >> 26
            r1 = 7
            r2 = 8388608(0x800000, float:1.1754944E-38)
            r3 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L5e
            r0 = r8 & r4
            r8 = r8 & r3
            r3 = 4194304(0x400000, float:5.877472E-39)
            if (r8 == r3) goto L59
            if (r8 == r2) goto L44
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = 8
            if (r8 == r1) goto L34
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r8 != r1) goto L2e
            r9.putByte(r2)
            net.bytebuddy.jar.asm.Label r7 = r7.getForwardUninitializedLabel(r0)
            r7.put(r9)
            goto Ldd
        L2e:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L34:
            net.bytebuddy.jar.asm.ByteVector r8 = r9.putByte(r2)
            net.bytebuddy.jar.asm.Symbol r7 = r7.getType(r0)
            long r0 = r7.data
            int r7 = (int) r0
            r8.putShort(r7)
            goto Ldd
        L44:
            net.bytebuddy.jar.asm.ByteVector r8 = r9.putByte(r1)
            net.bytebuddy.jar.asm.Symbol r9 = r7.getType(r0)
            java.lang.String r9 = r9.value
            net.bytebuddy.jar.asm.Symbol r7 = r7.addConstantClass(r9)
            int r7 = r7.index
            r8.putShort(r7)
            goto Ldd
        L59:
            r9.putByte(r0)
            goto Ldd
        L5e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L63:
            int r6 = r0 + (-1)
            if (r0 <= 0) goto L6e
            r0 = 91
            r5.append(r0)
            r0 = r6
            goto L63
        L6e:
            r0 = r8 & r3
            if (r0 != r2) goto L87
            r0 = 76
            r5.append(r0)
            r8 = r8 & r4
            net.bytebuddy.jar.asm.Symbol r8 = r7.getType(r8)
            java.lang.String r8 = r8.value
            r5.append(r8)
            r8 = 59
            r5.append(r8)
            goto Lcc
        L87:
            r8 = r8 & r4
            r0 = 1
            if (r8 == r0) goto Lc7
            r0 = 2
            if (r8 == r0) goto Lc1
            r0 = 3
            if (r8 == r0) goto Lbb
            r0 = 4
            if (r8 == r0) goto Lb5
            switch(r8) {
                case 9: goto Laf;
                case 10: goto La9;
                case 11: goto La3;
                case 12: goto L9d;
                default: goto L97;
            }
        L97:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L9d:
            r8 = 83
            r5.append(r8)
            goto Lcc
        La3:
            r8 = 67
            r5.append(r8)
            goto Lcc
        La9:
            r8 = 66
            r5.append(r8)
            goto Lcc
        Laf:
            r8 = 90
            r5.append(r8)
            goto Lcc
        Lb5:
            r8 = 74
            r5.append(r8)
            goto Lcc
        Lbb:
            r8 = 68
            r5.append(r8)
            goto Lcc
        Lc1:
            r8 = 70
            r5.append(r8)
            goto Lcc
        Lc7:
            r8 = 73
            r5.append(r8)
        Lcc:
            net.bytebuddy.jar.asm.ByteVector r8 = r9.putByte(r1)
            java.lang.String r9 = r5.toString()
            net.bytebuddy.jar.asm.Symbol r7 = r7.addConstantClass(r9)
            int r7 = r7.index
            r8.putShort(r7)
        Ldd:
            return
    }

    private void setLocal(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.outputLocals
            if (r0 != 0) goto La
            r0 = 10
            int[] r0 = new int[r0]
            r4.outputLocals = r0
        La:
            int[] r0 = r4.outputLocals
            int r0 = r0.length
            if (r5 < r0) goto L21
            int r1 = r5 + 1
            int r2 = r0 * 2
            int r1 = java.lang.Math.max(r1, r2)
            int[] r1 = new int[r1]
            int[] r2 = r4.outputLocals
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            r4.outputLocals = r1
        L21:
            int[] r0 = r4.outputLocals
            r0[r5] = r6
            return
    }

    public final void accept(net.bytebuddy.jar.asm.MethodWriter r14) {
            r13 = this;
            int[] r0 = r13.inputLocals
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L6:
            int r5 = r0.length
            r6 = 2
            r7 = 4194307(0x400003, float:5.877476E-39)
            r8 = 4194308(0x400004, float:5.877477E-39)
            r9 = 1
            if (r2 >= r5) goto L26
            r5 = r0[r2]
            if (r5 == r8) goto L19
            if (r5 != r7) goto L18
            goto L19
        L18:
            r6 = r9
        L19:
            int r2 = r2 + r6
            r6 = 4194304(0x400000, float:5.877472E-39)
            if (r5 != r6) goto L21
            int r4 = r4 + 1
            goto L6
        L21:
            int r4 = r4 + 1
            int r3 = r3 + r4
            r4 = r1
            goto L6
        L26:
            int[] r2 = r13.inputStack
            r4 = r1
            r5 = r4
        L2a:
            int r10 = r2.length
            if (r4 >= r10) goto L3b
            r10 = r2[r4]
            if (r10 == r8) goto L36
            if (r10 != r7) goto L34
            goto L36
        L34:
            r10 = r9
            goto L37
        L36:
            r10 = r6
        L37:
            int r4 = r4 + r10
            int r5 = r5 + 1
            goto L2a
        L3b:
            net.bytebuddy.jar.asm.Label r4 = r13.owner
            int r4 = r4.bytecodeOffset
            int r4 = r14.visitFrameStart(r4, r3, r5)
            r10 = r1
        L44:
            int r11 = r3 + (-1)
            if (r3 <= 0) goto L5b
            r3 = r0[r10]
            if (r3 == r8) goto L51
            if (r3 != r7) goto L4f
            goto L51
        L4f:
            r12 = r9
            goto L52
        L51:
            r12 = r6
        L52:
            int r10 = r10 + r12
            int r12 = r4 + 1
            r14.visitAbstractType(r4, r3)
            r3 = r11
            r4 = r12
            goto L44
        L5b:
            int r0 = r5 + (-1)
            if (r5 <= 0) goto L72
            r3 = r2[r1]
            if (r3 == r8) goto L68
            if (r3 != r7) goto L66
            goto L68
        L66:
            r5 = r9
            goto L69
        L68:
            r5 = r6
        L69:
            int r1 = r1 + r5
            int r5 = r4 + 1
            r14.visitAbstractType(r4, r3)
            r4 = r5
            r5 = r0
            goto L5b
        L72:
            r14.visitFrameEnd()
            return
    }

    public final void copyFrom(net.bytebuddy.jar.asm.Frame r2) {
            r1 = this;
            int[] r0 = r2.inputLocals
            r1.inputLocals = r0
            int[] r0 = r2.inputStack
            r1.inputStack = r0
            r0 = 0
            r1.outputStackStart = r0
            int[] r0 = r2.outputLocals
            r1.outputLocals = r0
            int[] r0 = r2.outputStack
            r1.outputStack = r0
            short r0 = r2.outputStackTop
            r1.outputStackTop = r0
            int r0 = r2.initializationCount
            r1.initializationCount = r0
            int[] r2 = r2.initializations
            r1.initializations = r2
            return
    }

    public void execute(int r17, int r18, net.bytebuddy.jar.asm.Symbol r19, net.bytebuddy.jar.asm.SymbolTable r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = 4194306(0x400002, float:5.877475E-39)
            r7 = 8388608(0x800000, float:1.1754944E-38)
            r8 = 4194305(0x400001, float:5.877473E-39)
            r9 = 4194307(0x400003, float:5.877476E-39)
            r10 = 4194308(0x400004, float:5.877477E-39)
            r11 = 4194304(0x400000, float:5.877472E-39)
            switch(r1) {
                case 0: goto L360;
                case 1: goto L35a;
                case 2: goto L356;
                case 3: goto L356;
                case 4: goto L356;
                case 5: goto L356;
                case 6: goto L356;
                case 7: goto L356;
                case 8: goto L356;
                case 9: goto L34f;
                case 10: goto L34f;
                case 11: goto L34b;
                case 12: goto L34b;
                case 13: goto L34b;
                case 14: goto L344;
                case 15: goto L344;
                case 16: goto L356;
                case 17: goto L356;
                case 18: goto L2ee;
                default: goto L1d;
            }
        L1d:
            switch(r1) {
                case 21: goto L356;
                case 22: goto L34f;
                case 23: goto L34b;
                case 24: goto L344;
                case 25: goto L2e5;
                default: goto L20;
            }
        L20:
            r13 = 25165824(0x1800000, float:4.7019774E-38)
            r14 = 20971520(0x1400000, float:3.526483E-38)
            r15 = 62914560(0x3c00000, float:1.1284746E-36)
            r12 = 1
            switch(r1) {
                case 46: goto L19c;
                case 47: goto L147;
                case 48: goto L18e;
                case 49: goto L152;
                case 50: goto L2aa;
                case 51: goto L19c;
                case 52: goto L19c;
                case 53: goto L19c;
                case 54: goto L283;
                case 55: goto L254;
                case 56: goto L283;
                case 57: goto L254;
                case 58: goto L283;
                default: goto L2a;
            }
        L2a:
            r13 = 3
            r14 = 91
            r15 = 0
            r5 = 4
            switch(r1) {
                case 79: goto L24f;
                case 80: goto L24a;
                case 81: goto L24f;
                case 82: goto L24a;
                case 83: goto L24f;
                case 84: goto L24f;
                case 85: goto L24f;
                case 86: goto L24f;
                case 87: goto L245;
                case 88: goto L23f;
                case 89: goto L233;
                case 90: goto L220;
                case 91: goto L206;
                case 92: goto L1f0;
                case 93: goto L1d3;
                case 94: goto L1af;
                case 95: goto L19f;
                case 96: goto L19c;
                case 97: goto L191;
                case 98: goto L18e;
                case 99: goto L183;
                case 100: goto L19c;
                case 101: goto L191;
                case 102: goto L18e;
                case 103: goto L183;
                case 104: goto L19c;
                case 105: goto L191;
                case 106: goto L18e;
                case 107: goto L183;
                case 108: goto L19c;
                case 109: goto L191;
                case 110: goto L18e;
                case 111: goto L183;
                case 112: goto L19c;
                case 113: goto L191;
                case 114: goto L18e;
                case 115: goto L183;
                case 116: goto L360;
                case 117: goto L360;
                case 118: goto L360;
                case 119: goto L360;
                case 120: goto L19c;
                case 121: goto L178;
                case 122: goto L19c;
                case 123: goto L178;
                case 124: goto L19c;
                case 125: goto L178;
                case 126: goto L19c;
                case 127: goto L191;
                case 128: goto L19c;
                case 129: goto L191;
                case 130: goto L19c;
                case 131: goto L191;
                case 132: goto L173;
                case 133: goto L168;
                case 134: goto L160;
                case 135: goto L155;
                case 136: goto L19c;
                case 137: goto L18e;
                case 138: goto L152;
                case 139: goto L14a;
                case 140: goto L168;
                case 141: goto L155;
                case 142: goto L19c;
                case 143: goto L147;
                case 144: goto L18e;
                case 145: goto L360;
                case 146: goto L360;
                case 147: goto L360;
                case 148: goto L13f;
                case 149: goto L19c;
                case 150: goto L19c;
                case 151: goto L13f;
                case 152: goto L13f;
                case 153: goto L245;
                case 154: goto L245;
                case 155: goto L245;
                case 156: goto L245;
                case 157: goto L245;
                case 158: goto L245;
                case 159: goto L23f;
                case 160: goto L23f;
                case 161: goto L23f;
                case 162: goto L23f;
                case 163: goto L23f;
                case 164: goto L23f;
                case 165: goto L23f;
                case 166: goto L23f;
                case 167: goto L360;
                case 168: goto L137;
                case 169: goto L137;
                case 170: goto L245;
                case 171: goto L245;
                case 172: goto L245;
                case 173: goto L23f;
                case 174: goto L245;
                case 175: goto L23f;
                case 176: goto L245;
                case 177: goto L360;
                case 178: goto L130;
                case 179: goto L129;
                case 180: goto L11f;
                case 181: goto L115;
                case 182: goto Lf0;
                case 183: goto Lf0;
                case 184: goto Lf0;
                case 185: goto Lf0;
                case 186: goto Le4;
                case 187: goto Ld6;
                case 188: goto L8a;
                case 189: goto L5f;
                case 190: goto L14a;
                case 191: goto L245;
                case 192: goto L45;
                case 193: goto L14a;
                case 194: goto L245;
                case 195: goto L245;
                default: goto L32;
            }
        L32:
            switch(r1) {
                case 197: goto L3b;
                case 198: goto L245;
                case 199: goto L245;
                default: goto L35;
            }
        L35:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L3b:
            r0.pop(r2)
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            goto L360
        L45:
            java.lang.String r1 = r3.value
            r16.pop()
            char r2 = r1.charAt(r15)
            if (r2 != r14) goto L55
            r0.push(r4, r1)
            goto L360
        L55:
            int r1 = r4.addType(r1)
            r1 = r1 | r7
            r0.push(r1)
            goto L360
        L5f:
            java.lang.String r1 = r3.value
            r16.pop()
            char r2 = r1.charAt(r15)
            if (r2 != r14) goto L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.push(r4, r1)
            goto L360
        L7e:
            r2 = 75497472(0x4800000, float:3.0092655E-36)
            int r1 = r4.addType(r1)
            r1 = r1 | r2
            r0.push(r1)
            goto L360
        L8a:
            r16.pop()
            switch(r2) {
                case 4: goto Lce;
                case 5: goto Lc6;
                case 6: goto Lbe;
                case 7: goto Lb6;
                case 8: goto Lae;
                case 9: goto La6;
                case 10: goto L9e;
                case 11: goto L96;
                default: goto L90;
            }
        L90:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L96:
            r1 = 71303172(0x4400004, float:2.2569499E-36)
            r0.push(r1)
            goto L360
        L9e:
            r1 = 71303169(0x4400001, float:2.2569493E-36)
            r0.push(r1)
            goto L360
        La6:
            r1 = 71303180(0x440000c, float:2.2569513E-36)
            r0.push(r1)
            goto L360
        Lae:
            r1 = 71303178(0x440000a, float:2.256951E-36)
            r0.push(r1)
            goto L360
        Lb6:
            r1 = 71303171(0x4400003, float:2.2569497E-36)
            r0.push(r1)
            goto L360
        Lbe:
            r1 = 71303170(0x4400002, float:2.2569495E-36)
            r0.push(r1)
            goto L360
        Lc6:
            r1 = 71303179(0x440000b, float:2.2569511E-36)
            r0.push(r1)
            goto L360
        Lce:
            r1 = 71303177(0x4400009, float:2.2569508E-36)
            r0.push(r1)
            goto L360
        Ld6:
            java.lang.String r1 = r3.value
            int r1 = r4.addUninitializedType(r1, r2)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r2
            r0.push(r1)
            goto L360
        Le4:
            java.lang.String r1 = r3.value
            r0.pop(r1)
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            goto L360
        Lf0:
            java.lang.String r2 = r3.value
            r0.pop(r2)
            r2 = 184(0xb8, float:2.58E-43)
            if (r1 == r2) goto L10e
            int r2 = r16.pop()
            r5 = 183(0xb7, float:2.56E-43)
            if (r1 != r5) goto L10e
            java.lang.String r1 = r3.name
            char r1 = r1.charAt(r15)
            r5 = 60
            if (r1 != r5) goto L10e
            r0.addInitializedType(r2)
        L10e:
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            goto L360
        L115:
            java.lang.String r1 = r3.value
            r0.pop(r1)
            r16.pop()
            goto L360
        L11f:
            r0.pop(r12)
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            goto L360
        L129:
            java.lang.String r1 = r3.value
            r0.pop(r1)
            goto L360
        L130:
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            goto L360
        L137:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "JSR/RET are not supported with computeFrames option"
            r1.<init>(r2)
            throw r1
        L13f:
            r0.pop(r5)
            r0.push(r8)
            goto L360
        L147:
            r1 = 2
            goto L2d2
        L14a:
            r0.pop(r12)
            r0.push(r8)
            goto L360
        L152:
            r1 = 2
            goto L2bf
        L155:
            r0.pop(r12)
            r0.push(r9)
            r0.push(r11)
            goto L360
        L160:
            r0.pop(r12)
            r0.push(r6)
            goto L360
        L168:
            r0.pop(r12)
            r0.push(r10)
            r0.push(r11)
            goto L360
        L173:
            r0.setLocal(r2, r8)
            goto L360
        L178:
            r0.pop(r13)
            r0.push(r10)
            r0.push(r11)
            goto L360
        L183:
            r0.pop(r5)
            r0.push(r9)
            r0.push(r11)
            goto L360
        L18e:
            r1 = 2
            goto L2ca
        L191:
            r0.pop(r5)
            r0.push(r10)
            r0.push(r11)
            goto L360
        L19c:
            r1 = 2
            goto L2dd
        L19f:
            int r1 = r16.pop()
            int r2 = r16.pop()
            r0.push(r1)
            r0.push(r2)
            goto L360
        L1af:
            int r1 = r16.pop()
            int r2 = r16.pop()
            int r3 = r16.pop()
            int r4 = r16.pop()
            r0.push(r2)
            r0.push(r1)
            r0.push(r4)
            r0.push(r3)
            r0.push(r2)
            r0.push(r1)
            goto L360
        L1d3:
            int r1 = r16.pop()
            int r2 = r16.pop()
            int r3 = r16.pop()
            r0.push(r2)
            r0.push(r1)
            r0.push(r3)
            r0.push(r2)
            r0.push(r1)
            goto L360
        L1f0:
            int r1 = r16.pop()
            int r2 = r16.pop()
            r0.push(r2)
            r0.push(r1)
            r0.push(r2)
            r0.push(r1)
            goto L360
        L206:
            int r1 = r16.pop()
            int r2 = r16.pop()
            int r3 = r16.pop()
            r0.push(r1)
            r0.push(r3)
            r0.push(r2)
            r0.push(r1)
            goto L360
        L220:
            int r1 = r16.pop()
            int r2 = r16.pop()
            r0.push(r1)
            r0.push(r2)
            r0.push(r1)
            goto L360
        L233:
            int r1 = r16.pop()
            r0.push(r1)
            r0.push(r1)
            goto L360
        L23f:
            r1 = 2
            r0.pop(r1)
            goto L360
        L245:
            r0.pop(r12)
            goto L360
        L24a:
            r0.pop(r5)
            goto L360
        L24f:
            r0.pop(r13)
            goto L360
        L254:
            r0.pop(r12)
            int r1 = r16.pop()
            r0.setLocal(r2, r1)
            int r1 = r2 + 1
            r0.setLocal(r1, r11)
            if (r2 <= 0) goto L360
            int r1 = r2 + (-1)
            int r2 = r0.getLocal(r1)
            if (r2 == r10) goto L27e
            if (r2 != r9) goto L270
            goto L27e
        L270:
            r3 = r2 & r15
            if (r3 == r14) goto L276
            if (r3 != r13) goto L360
        L276:
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r3
            r0.setLocal(r1, r2)
            goto L360
        L27e:
            r0.setLocal(r1, r11)
            goto L360
        L283:
            int r1 = r16.pop()
            r0.setLocal(r2, r1)
            if (r2 <= 0) goto L360
            int r1 = r2 + (-1)
            int r2 = r0.getLocal(r1)
            if (r2 == r10) goto L2a5
            if (r2 != r9) goto L297
            goto L2a5
        L297:
            r3 = r2 & r15
            if (r3 == r14) goto L29d
            if (r3 != r13) goto L360
        L29d:
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r3
            r0.setLocal(r1, r2)
            goto L360
        L2a5:
            r0.setLocal(r1, r11)
            goto L360
        L2aa:
            r0.pop(r12)
            int r1 = r16.pop()
            r2 = 4194309(0x400005, float:5.877479E-39)
            if (r1 != r2) goto L2b7
            goto L2ba
        L2b7:
            r2 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            int r1 = r1 + r2
        L2ba:
            r0.push(r1)
            goto L360
        L2bf:
            r0.pop(r1)
            r0.push(r9)
            r0.push(r11)
            goto L360
        L2ca:
            r0.pop(r1)
            r0.push(r6)
            goto L360
        L2d2:
            r0.pop(r1)
            r0.push(r10)
            r0.push(r11)
            goto L360
        L2dd:
            r0.pop(r1)
            r0.push(r8)
            goto L360
        L2e5:
            int r1 = r0.getLocal(r2)
            r0.push(r1)
            goto L360
        L2ee:
            int r1 = r3.tag
            switch(r1) {
                case 3: goto L340;
                case 4: goto L33c;
                case 5: goto L335;
                case 6: goto L32e;
                case 7: goto L323;
                case 8: goto L318;
                default: goto L2f3;
            }
        L2f3:
            switch(r1) {
                case 15: goto L30d;
                case 16: goto L302;
                case 17: goto L2fc;
                default: goto L2f6;
            }
        L2f6:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L2fc:
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            goto L360
        L302:
            java.lang.String r1 = "java/lang/invoke/MethodType"
            int r1 = r4.addType(r1)
            r1 = r1 | r7
            r0.push(r1)
            goto L360
        L30d:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            int r1 = r4.addType(r1)
            r1 = r1 | r7
            r0.push(r1)
            goto L360
        L318:
            java.lang.String r1 = "java/lang/String"
            int r1 = r4.addType(r1)
            r1 = r1 | r7
            r0.push(r1)
            goto L360
        L323:
            java.lang.String r1 = "java/lang/Class"
            int r1 = r4.addType(r1)
            r1 = r1 | r7
            r0.push(r1)
            goto L360
        L32e:
            r0.push(r9)
            r0.push(r11)
            goto L360
        L335:
            r0.push(r10)
            r0.push(r11)
            goto L360
        L33c:
            r0.push(r6)
            goto L360
        L340:
            r0.push(r8)
            goto L360
        L344:
            r0.push(r9)
            r0.push(r11)
            goto L360
        L34b:
            r0.push(r6)
            goto L360
        L34f:
            r0.push(r10)
            r0.push(r11)
            goto L360
        L356:
            r0.push(r8)
            goto L360
        L35a:
            r1 = 4194309(0x400005, float:5.877479E-39)
            r0.push(r1)
        L360:
            return
    }

    public final int getInputStackSize() {
            r1 = this;
            int[] r0 = r1.inputStack
            int r0 = r0.length
            return r0
    }

    public final boolean merge(net.bytebuddy.jar.asm.SymbolTable r9, net.bytebuddy.jar.asm.Frame r10, int r11) {
            r8 = this;
            int[] r0 = r8.inputLocals
            int r0 = r0.length
            int[] r1 = r8.inputStack
            int r1 = r1.length
            int[] r2 = r10.inputLocals
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L12
            int[] r2 = new int[r0]
            r10.inputLocals = r2
            r2 = r3
            goto L13
        L12:
            r2 = r4
        L13:
            r5 = r4
        L14:
            if (r5 >= r0) goto L41
            int[] r6 = r8.outputLocals
            if (r6 == 0) goto L2b
            int r7 = r6.length
            if (r5 >= r7) goto L2b
            r6 = r6[r5]
            if (r6 != 0) goto L26
            int[] r6 = r8.inputLocals
            r6 = r6[r5]
            goto L2f
        L26:
            int r6 = r8.getConcreteOutputType(r6, r1)
            goto L2f
        L2b:
            int[] r6 = r8.inputLocals
            r6 = r6[r5]
        L2f:
            int[] r7 = r8.initializations
            if (r7 == 0) goto L37
            int r6 = r8.getInitializedType(r9, r6)
        L37:
            int[] r7 = r10.inputLocals
            boolean r6 = merge(r9, r6, r7, r5)
            r2 = r2 | r6
            int r5 = r5 + 1
            goto L14
        L41:
            if (r11 <= 0) goto L66
            r1 = r4
        L44:
            if (r1 >= r0) goto L54
            int[] r5 = r8.inputLocals
            r5 = r5[r1]
            int[] r6 = r10.inputLocals
            boolean r5 = merge(r9, r5, r6, r1)
            r2 = r2 | r5
            int r1 = r1 + 1
            goto L44
        L54:
            int[] r0 = r10.inputStack
            if (r0 != 0) goto L5d
            int[] r0 = new int[r3]
            r10.inputStack = r0
            goto L5e
        L5d:
            r3 = r2
        L5e:
            int[] r10 = r10.inputStack
            boolean r9 = merge(r9, r11, r10, r4)
            r9 = r9 | r3
            return r9
        L66:
            int[] r11 = r8.inputStack
            int r11 = r11.length
            short r0 = r8.outputStackStart
            int r11 = r11 + r0
            int[] r0 = r10.inputStack
            if (r0 != 0) goto L78
            short r0 = r8.outputStackTop
            int r0 = r0 + r11
            int[] r0 = new int[r0]
            r10.inputStack = r0
            goto L79
        L78:
            r3 = r2
        L79:
            r0 = r4
        L7a:
            if (r0 >= r11) goto L92
            int[] r2 = r8.inputStack
            r2 = r2[r0]
            int[] r5 = r8.initializations
            if (r5 == 0) goto L88
            int r2 = r8.getInitializedType(r9, r2)
        L88:
            int[] r5 = r10.inputStack
            boolean r2 = merge(r9, r2, r5, r0)
            r3 = r3 | r2
            int r0 = r0 + 1
            goto L7a
        L92:
            short r0 = r8.outputStackTop
            if (r4 >= r0) goto Lb2
            int[] r0 = r8.outputStack
            r0 = r0[r4]
            int r0 = r8.getConcreteOutputType(r0, r1)
            int[] r2 = r8.initializations
            if (r2 == 0) goto La6
            int r0 = r8.getInitializedType(r9, r0)
        La6:
            int[] r2 = r10.inputStack
            int r5 = r11 + r4
            boolean r0 = merge(r9, r0, r2, r5)
            r3 = r3 | r0
            int r4 = r4 + 1
            goto L92
        Lb2:
            return r3
    }

    public final void setInputFrameFromApiFormat(net.bytebuddy.jar.asm.SymbolTable r8, int r9, java.lang.Object[] r10, int r11, java.lang.Object[] r12) {
            r7 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            r3 = 4194304(0x400000, float:5.877472E-39)
            if (r1 >= r9) goto L29
            int[] r4 = r7.inputLocals
            int r5 = r2 + 1
            r6 = r10[r1]
            int r6 = getAbstractTypeFromApiFormat(r8, r6)
            r4[r2] = r6
            r4 = r10[r1]
            java.lang.Integer r6 = net.bytebuddy.jar.asm.Opcodes.LONG
            if (r4 == r6) goto L20
            java.lang.Integer r6 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            if (r4 != r6) goto L1e
            goto L20
        L1e:
            r2 = r5
            goto L26
        L20:
            int[] r4 = r7.inputLocals
            int r2 = r2 + 2
            r4[r5] = r3
        L26:
            int r1 = r1 + 1
            goto L3
        L29:
            int[] r9 = r7.inputLocals
            int r10 = r9.length
            if (r2 >= r10) goto L34
            int r10 = r2 + 1
            r9[r2] = r3
            r2 = r10
            goto L29
        L34:
            r9 = r0
            r10 = r9
        L36:
            if (r9 >= r11) goto L47
            r1 = r12[r9]
            java.lang.Integer r2 = net.bytebuddy.jar.asm.Opcodes.LONG
            if (r1 == r2) goto L42
            java.lang.Integer r2 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            if (r1 != r2) goto L44
        L42:
            int r10 = r10 + 1
        L44:
            int r9 = r9 + 1
            goto L36
        L47:
            int r10 = r10 + r11
            int[] r9 = new int[r10]
            r7.inputStack = r9
            r9 = r0
            r10 = r9
        L4e:
            if (r9 >= r11) goto L72
            int[] r1 = r7.inputStack
            int r2 = r10 + 1
            r4 = r12[r9]
            int r4 = getAbstractTypeFromApiFormat(r8, r4)
            r1[r10] = r4
            r1 = r12[r9]
            java.lang.Integer r4 = net.bytebuddy.jar.asm.Opcodes.LONG
            if (r1 == r4) goto L69
            java.lang.Integer r4 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
            if (r1 != r4) goto L67
            goto L69
        L67:
            r10 = r2
            goto L6f
        L69:
            int[] r1 = r7.inputStack
            int r10 = r10 + 2
            r1[r2] = r3
        L6f:
            int r9 = r9 + 1
            goto L4e
        L72:
            r7.outputStackTop = r0
            r7.initializationCount = r0
            return
    }

    public final void setInputFrameFromDescriptor(net.bytebuddy.jar.asm.SymbolTable r9, int r10, java.lang.String r11, int r12) {
            r8 = this;
            int[] r0 = new int[r12]
            r8.inputLocals = r0
            r1 = 0
            int[] r2 = new int[r1]
            r8.inputStack = r2
            r2 = r10 & 8
            if (r2 != 0) goto L27
            r2 = 262144(0x40000, float:3.67342E-40)
            r10 = r10 & r2
            r2 = 1
            if (r10 != 0) goto L21
            java.lang.String r10 = r9.getClassName()
            int r10 = r9.addType(r10)
            r3 = 8388608(0x800000, float:1.1754944E-38)
            r10 = r10 | r3
            r0[r1] = r10
            goto L28
        L21:
            r10 = 4194310(0x400006, float:5.87748E-39)
            r0[r1] = r10
            goto L28
        L27:
            r2 = r1
        L28:
            net.bytebuddy.jar.asm.Type[] r10 = net.bytebuddy.jar.asm.Type.getArgumentTypes(r11)
            int r11 = r10.length
            r0 = r1
        L2e:
            r3 = 4194304(0x400000, float:5.877472E-39)
            if (r0 >= r11) goto L56
            r4 = r10[r0]
            java.lang.String r4 = r4.getDescriptor()
            int r4 = getAbstractTypeFromDescriptor(r9, r4, r1)
            int[] r5 = r8.inputLocals
            int r6 = r2 + 1
            r5[r2] = r4
            r7 = 4194308(0x400004, float:5.877477E-39)
            if (r4 == r7) goto L4f
            r7 = 4194307(0x400003, float:5.877476E-39)
            if (r4 != r7) goto L4d
            goto L4f
        L4d:
            r2 = r6
            goto L53
        L4f:
            int r2 = r2 + 2
            r5[r6] = r3
        L53:
            int r0 = r0 + 1
            goto L2e
        L56:
            if (r2 >= r12) goto L60
            int[] r9 = r8.inputLocals
            int r10 = r2 + 1
            r9[r2] = r3
            r2 = r10
            goto L56
        L60:
            return
    }
}
