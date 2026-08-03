package bsh.org.objectweb.asm;

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
    bsh.org.objectweb.asm.Label owner;

    public Frame(bsh.org.objectweb.asm.Label r1) {
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

    public static int getAbstractTypeFromApiFormat(bsh.org.objectweb.asm.SymbolTable r1, java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto Le
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r2
            return r1
        Le:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            bsh.org.objectweb.asm.Type r2 = bsh.org.objectweb.asm.Type.getObjectType(r2)
            java.lang.String r2 = r2.getDescriptor()
            r0 = 0
            int r1 = getAbstractTypeFromDescriptor(r1, r2, r0)
            return r1
        L22:
            bsh.org.objectweb.asm.Label r2 = (bsh.org.objectweb.asm.Label) r2
            int r2 = r2.bytecodeOffset
            java.lang.String r0 = ""
            int r1 = r1.addUninitializedType(r0, r2)
            r2 = 50331648(0x3000000, float:3.761582E-37)
            r1 = r1 | r2
            return r1
    }

    private static int getAbstractTypeFromDescriptor(bsh.org.objectweb.asm.SymbolTable r17, java.lang.String r18, int r19) {
            r0 = r17
            r1 = r18
            char r2 = r18.charAt(r19)
            r4 = 70
            if (r2 == r4) goto L9e
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r6 = 76
            r7 = 1
            if (r2 == r6) goto L92
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 83
            if (r2 == r9) goto L91
            r10 = 86
            if (r2 == r10) goto L8f
            r10 = 73
            if (r2 == r10) goto L91
            r11 = 16777220(0x1000004, float:2.3509898E-38)
            r12 = 74
            if (r2 == r12) goto L8e
            r13 = 90
            if (r2 == r13) goto L91
            r14 = 16777219(0x1000003, float:2.3509895E-38)
            r15 = 91
            if (r2 == r15) goto L3d
            switch(r2) {
                case 66: goto L91;
                case 67: goto L91;
                case 68: goto L3c;
                default: goto L37;
            }
        L37:
            j8.o.o()
            r0 = 0
            return r0
        L3c:
            return r14
        L3d:
            int r2 = r19 + 1
            r16 = 16777218(0x1000002, float:2.3509893E-38)
        L42:
            char r3 = r1.charAt(r2)
            if (r3 != r15) goto L4b
            int r2 = r2 + 1
            goto L42
        L4b:
            char r3 = r1.charAt(r2)
            if (r3 == r4) goto L86
            if (r3 == r6) goto L79
            if (r3 == r9) goto L75
            if (r3 == r13) goto L71
            if (r3 == r10) goto L6f
            if (r3 == r12) goto L6d
            switch(r3) {
                case 66: goto L69;
                case 67: goto L65;
                case 68: goto L63;
                default: goto L5e;
            }
        L5e:
            j8.o.o()
            r0 = 0
            return r0
        L63:
            r3 = r14
            goto L88
        L65:
            r3 = 16777227(0x100000b, float:2.3509918E-38)
            goto L88
        L69:
            r3 = 16777226(0x100000a, float:2.3509915E-38)
            goto L88
        L6d:
            r3 = r11
            goto L88
        L6f:
            r3 = r8
            goto L88
        L71:
            r3 = 16777225(0x1000009, float:2.3509912E-38)
            goto L88
        L75:
            r3 = 16777228(0x100000c, float:2.350992E-38)
            goto L88
        L79:
            int r3 = r2 + 1
            java.lang.String r1 = wb.en.f(r7, r3, r1)
            int r0 = r0.addType(r1)
            r3 = r0 | r5
            goto L88
        L86:
            r3 = r16
        L88:
            int r2 = r2 - r19
            int r0 = r2 << 28
            r0 = r0 | r3
            return r0
        L8e:
            return r11
        L8f:
            r0 = 0
            return r0
        L91:
            return r8
        L92:
            int r2 = r19 + 1
            java.lang.String r1 = wb.en.f(r7, r2, r1)
            int r0 = r0.addType(r1)
            r0 = r0 | r5
            return r0
        L9e:
            r16 = 16777218(0x1000002, float:2.3509893E-38)
            return r16
    }

    public static int getAbstractTypeFromInternalName(bsh.org.objectweb.asm.SymbolTable r1, java.lang.String r2) {
            r0 = 33554432(0x2000000, float:9.403955E-38)
            int r1 = r1.addType(r2)
            r1 = r1 | r0
            return r1
    }

    private int getInitializedType(bsh.org.objectweb.asm.SymbolTable r9, int r10) {
            r8 = this;
            r0 = 16777222(0x1000006, float:2.3509904E-38)
            if (r10 == r0) goto Lc
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r10
            r2 = 50331648(0x3000000, float:3.761582E-37)
            if (r1 != r2) goto L54
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.initializationCount
            if (r1 >= r2) goto L54
            int[] r2 = r8.initializations
            r2 = r2[r1]
            r3 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r3 = r3 & r2
            r4 = 251658240(0xf000000, float:6.3108872E-30)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r4 != r7) goto L2a
            int[] r2 = r8.inputLocals
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 83886080(0x5000000, float:6.018531E-36)
            if (r4 != r7) goto L35
            int[] r2 = r8.inputStack
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L51
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r10 != r0) goto L45
            java.lang.String r10 = r9.getClassName()
            int r9 = r9.addType(r10)
        L43:
            r9 = r9 | r1
            return r9
        L45:
            r10 = r10 & r5
            bsh.org.objectweb.asm.Symbol r10 = r9.getType(r10)
            java.lang.String r10 = r10.value
            int r9 = r9.addType(r10)
            goto L43
        L51:
            int r1 = r1 + 1
            goto Ld
        L54:
            return r10
    }

    private int getLocal(int r4) {
            r3 = this;
            int[] r0 = r3.outputLocals
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            if (r0 == 0) goto L13
            int r2 = r0.length
            if (r4 < r2) goto La
            goto L13
        La:
            r2 = r0[r4]
            if (r2 != 0) goto L12
            r1 = r1 | r4
            r0[r4] = r1
            return r1
        L12:
            return r2
        L13:
            r4 = r4 | r1
            return r4
    }

    private static boolean merge(bsh.org.objectweb.asm.SymbolTable r11, int r12, int[] r13, int r14) {
            r0 = r13[r14]
            r1 = 0
            if (r0 != r12) goto L6
            return r1
        L6:
            r2 = 268435455(0xfffffff, float:2.5243547E-29)
            r2 = r2 & r12
            r3 = 16777221(0x1000005, float:2.35099E-38)
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
            r4 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r5 = r0 & r4
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r7 = 251658240(0xf000000, float:6.3108872E-30)
            r8 = 33554432(0x2000000, float:9.403955E-38)
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
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
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
            r1 = 83886080(0x5000000, float:6.018531E-36)
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
            return
        L9:
            short r1 = r2.outputStackStart
            int r3 = r3 - r0
            int r1 = r1 - r3
            short r3 = (short) r1
            r2.outputStackStart = r3
            r3 = 0
            r2.outputStackTop = r3
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
            int r5 = bsh.org.objectweb.asm.Type.getArgumentsAndReturnSizes(r5)
            int r5 = r5 >> r3
            int r5 = r5 - r2
            r4.pop(r5)
            return
        L15:
            r5 = 74
            if (r0 == r5) goto L22
            r5 = 68
            if (r0 != r5) goto L1e
            goto L22
        L1e:
            r4.pop(r2)
            return
        L22:
            r4.pop(r3)
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
            bsh.org.objectweb.asm.Label r0 = r4.owner
            short r1 = r0.outputStackMax
            if (r5 <= r1) goto L3a
            r0.outputStackMax = r5
        L3a:
            return
    }

    private void push(bsh.org.objectweb.asm.SymbolTable r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 40
            if (r1 != r2) goto L11
            r0 = 41
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
        L11:
            int r4 = getAbstractTypeFromDescriptor(r4, r5, r0)
            if (r4 == 0) goto L29
            r3.push(r4)
            r5 = 16777220(0x1000004, float:2.3509898E-38)
            if (r4 == r5) goto L24
            r5 = 16777219(0x1000003, float:2.3509895E-38)
            if (r4 != r5) goto L29
        L24:
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3.push(r4)
        L29:
            return
    }

    public static void putAbstractType(bsh.org.objectweb.asm.SymbolTable r7, int r8, bsh.org.objectweb.asm.ByteVector r9) {
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r0 = r0 & r8
            int r0 = r0 >> 28
            r1 = 7
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r3 = 251658240(0xf000000, float:6.3108872E-30)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L4b
            r0 = r8 & r4
            r8 = r8 & r3
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r8 == r3) goto L47
            if (r8 == r2) goto L33
            r1 = 50331648(0x3000000, float:3.761582E-37)
            if (r8 != r1) goto L2d
            r8 = 8
            bsh.org.objectweb.asm.ByteVector r8 = r9.putByte(r8)
            bsh.org.objectweb.asm.Symbol r7 = r7.getType(r0)
            long r0 = r7.data
            int r7 = (int) r0
            r8.putShort(r7)
            return
        L2d:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L33:
            bsh.org.objectweb.asm.ByteVector r8 = r9.putByte(r1)
            bsh.org.objectweb.asm.Symbol r9 = r7.getType(r0)
            java.lang.String r9 = r9.value
            bsh.org.objectweb.asm.Symbol r7 = r7.addConstantClass(r9)
            int r7 = r7.index
            r8.putShort(r7)
            return
        L47:
            r9.putByte(r0)
            return
        L4b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L50:
            int r6 = r0 + (-1)
            if (r0 <= 0) goto L5b
            r0 = 91
            r5.append(r0)
            r0 = r6
            goto L50
        L5b:
            r0 = r8 & r3
            if (r0 != r2) goto L74
            r0 = 76
            r5.append(r0)
            r8 = r8 & r4
            bsh.org.objectweb.asm.Symbol r8 = r7.getType(r8)
            java.lang.String r8 = r8.value
            r5.append(r8)
            r8 = 59
            r5.append(r8)
            goto Lb9
        L74:
            r8 = r8 & r4
            r0 = 1
            if (r8 == r0) goto Lb4
            r0 = 2
            if (r8 == r0) goto Lae
            r0 = 3
            if (r8 == r0) goto La8
            r0 = 4
            if (r8 == r0) goto La2
            switch(r8) {
                case 9: goto L9c;
                case 10: goto L96;
                case 11: goto L90;
                case 12: goto L8a;
                default: goto L84;
            }
        L84:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L8a:
            r8 = 83
            r5.append(r8)
            goto Lb9
        L90:
            r8 = 67
            r5.append(r8)
            goto Lb9
        L96:
            r8 = 66
            r5.append(r8)
            goto Lb9
        L9c:
            r8 = 90
            r5.append(r8)
            goto Lb9
        La2:
            r8 = 74
            r5.append(r8)
            goto Lb9
        La8:
            r8 = 68
            r5.append(r8)
            goto Lb9
        Lae:
            r8 = 70
            r5.append(r8)
            goto Lb9
        Lb4:
            r8 = 73
            r5.append(r8)
        Lb9:
            bsh.org.objectweb.asm.ByteVector r8 = r9.putByte(r1)
            java.lang.String r9 = r5.toString()
            bsh.org.objectweb.asm.Symbol r7 = r7.addConstantClass(r9)
            int r7 = r7.index
            r8.putShort(r7)
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

    public final void accept(bsh.org.objectweb.asm.MethodWriter r14) {
            r13 = this;
            int[] r0 = r13.inputLocals
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L6:
            int r5 = r0.length
            r6 = 2
            r7 = 16777219(0x1000003, float:2.3509895E-38)
            r8 = 16777220(0x1000004, float:2.3509898E-38)
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
            r6 = 16777216(0x1000000, float:2.3509887E-38)
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
            bsh.org.objectweb.asm.Label r4 = r13.owner
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

    public final void copyFrom(bsh.org.objectweb.asm.Frame r2) {
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

    public void execute(int r19, int r20, bsh.org.objectweb.asm.Symbol r21, bsh.org.objectweb.asm.SymbolTable r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = 16777221(0x1000005, float:2.35099E-38)
            r6 = 16777218(0x1000002, float:2.3509893E-38)
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 16777219(0x1000003, float:2.3509895E-38)
            r10 = 16777220(0x1000004, float:2.3509898E-38)
            r11 = 16777216(0x1000000, float:2.3509887E-38)
            switch(r1) {
                case 0: goto L317;
                case 1: goto L314;
                case 2: goto L310;
                case 3: goto L310;
                case 4: goto L310;
                case 5: goto L310;
                case 6: goto L310;
                case 7: goto L310;
                case 8: goto L310;
                case 9: goto L309;
                case 10: goto L309;
                case 11: goto L305;
                case 12: goto L305;
                case 13: goto L305;
                case 14: goto L2fe;
                case 15: goto L2fe;
                case 16: goto L310;
                case 17: goto L310;
                case 18: goto L2a2;
                default: goto L1e;
            }
        L1e:
            switch(r1) {
                case 21: goto L310;
                case 22: goto L309;
                case 23: goto L305;
                case 24: goto L2fe;
                case 25: goto L29a;
                default: goto L21;
            }
        L21:
            r13 = 83886080(0x5000000, float:6.018531E-36)
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            r15 = 251658240(0xf000000, float:6.3108872E-30)
            r16 = 33554432(0x2000000, float:9.403955E-38)
            r7 = 2
            r17 = 1048576(0x100000, float:1.469368E-39)
            r12 = 1
            switch(r1) {
                case 46: goto L293;
                case 47: goto L289;
                case 48: goto L282;
                case 49: goto L278;
                case 50: goto L267;
                case 51: goto L293;
                case 52: goto L293;
                case 53: goto L293;
                case 54: goto L243;
                case 55: goto L217;
                case 56: goto L243;
                case 57: goto L217;
                case 58: goto L243;
                default: goto L30;
            }
        L30:
            r5 = 3
            r13 = 91
            r14 = 0
            r15 = 4
            switch(r1) {
                case 79: goto L213;
                case 80: goto L20f;
                case 81: goto L213;
                case 82: goto L20f;
                case 83: goto L213;
                case 84: goto L213;
                case 85: goto L213;
                case 86: goto L213;
                case 87: goto L20b;
                case 88: goto L207;
                case 89: goto L1fc;
                case 90: goto L1ea;
                case 91: goto L1d1;
                case 92: goto L1bc;
                case 93: goto L1a0;
                case 94: goto L17d;
                case 95: goto L16e;
                case 96: goto L293;
                case 97: goto L164;
                case 98: goto L282;
                case 99: goto L15a;
                case 100: goto L293;
                case 101: goto L164;
                case 102: goto L282;
                case 103: goto L15a;
                case 104: goto L293;
                case 105: goto L164;
                case 106: goto L282;
                case 107: goto L15a;
                case 108: goto L293;
                case 109: goto L164;
                case 110: goto L282;
                case 111: goto L15a;
                case 112: goto L293;
                case 113: goto L164;
                case 114: goto L282;
                case 115: goto L15a;
                case 116: goto L317;
                case 117: goto L317;
                case 118: goto L317;
                case 119: goto L317;
                case 120: goto L293;
                case 121: goto L150;
                case 122: goto L293;
                case 123: goto L150;
                case 124: goto L293;
                case 125: goto L150;
                case 126: goto L293;
                case 127: goto L164;
                case 128: goto L293;
                case 129: goto L164;
                case 130: goto L293;
                case 131: goto L164;
                case 132: goto L14c;
                case 133: goto L142;
                case 134: goto L13b;
                case 135: goto L131;
                case 136: goto L293;
                case 137: goto L282;
                case 138: goto L278;
                case 139: goto L12a;
                case 140: goto L142;
                case 141: goto L131;
                case 142: goto L293;
                case 143: goto L289;
                case 144: goto L282;
                case 145: goto L317;
                case 146: goto L317;
                case 147: goto L317;
                case 148: goto L123;
                case 149: goto L293;
                case 150: goto L293;
                case 151: goto L123;
                case 152: goto L123;
                case 153: goto L20b;
                case 154: goto L20b;
                case 155: goto L20b;
                case 156: goto L20b;
                case 157: goto L20b;
                case 158: goto L20b;
                case 159: goto L207;
                case 160: goto L207;
                case 161: goto L207;
                case 162: goto L207;
                case 163: goto L207;
                case 164: goto L207;
                case 165: goto L207;
                case 166: goto L207;
                case 167: goto L317;
                case 168: goto L11d;
                case 169: goto L11d;
                case 170: goto L20b;
                case 171: goto L20b;
                case 172: goto L20b;
                case 173: goto L207;
                case 174: goto L20b;
                case 175: goto L207;
                case 176: goto L20b;
                case 177: goto L317;
                case 178: goto L117;
                case 179: goto L111;
                case 180: goto L108;
                case 181: goto Lff;
                case 182: goto Ldb;
                case 183: goto Ldb;
                case 184: goto Ldb;
                case 185: goto Ldb;
                case 186: goto Ld0;
                case 187: goto Lc3;
                case 188: goto L81;
                case 189: goto L61;
                case 190: goto L12a;
                case 191: goto L20b;
                case 192: goto L48;
                case 193: goto L12a;
                case 194: goto L20b;
                case 195: goto L20b;
                default: goto L38;
            }
        L38:
            switch(r1) {
                case 197: goto L3f;
                case 198: goto L20b;
                case 199: goto L20b;
                default: goto L3b;
            }
        L3b:
            j8.o.o()
            return
        L3f:
            r0.pop(r2)
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            return
        L48:
            java.lang.String r1 = r3.value
            r0.pop()
            char r2 = r1.charAt(r14)
            if (r2 != r13) goto L57
            r0.push(r4, r1)
            return
        L57:
            int r1 = r4.addType(r1)
            r1 = r1 | r16
            r0.push(r1)
            return
        L61:
            java.lang.String r1 = r3.value
            r0.pop()
            char r2 = r1.charAt(r14)
            if (r2 != r13) goto L76
            java.lang.String r2 = "["
            java.lang.String r1 = r2.concat(r1)
            r0.push(r4, r1)
            return
        L76:
            r2 = 301989888(0x12000000, float:4.038968E-28)
            int r1 = r4.addType(r1)
            r1 = r1 | r2
            r0.push(r1)
            return
        L81:
            r0.pop()
            switch(r2) {
                case 4: goto Lbc;
                case 5: goto Lb5;
                case 6: goto Lae;
                case 7: goto La7;
                case 8: goto La0;
                case 9: goto L99;
                case 10: goto L92;
                case 11: goto L8b;
                default: goto L87;
            }
        L87:
            j8.o.o()
            return
        L8b:
            r1 = 285212676(0x11000004, float:1.0097424E-28)
            r0.push(r1)
            return
        L92:
            r1 = 285212673(0x11000001, float:1.0097421E-28)
            r0.push(r1)
            return
        L99:
            r1 = 285212684(0x1100000c, float:1.0097434E-28)
            r0.push(r1)
            return
        La0:
            r1 = 285212682(0x1100000a, float:1.0097432E-28)
            r0.push(r1)
            return
        La7:
            r1 = 285212675(0x11000003, float:1.0097423E-28)
            r0.push(r1)
            return
        Lae:
            r1 = 285212674(0x11000002, float:1.0097422E-28)
            r0.push(r1)
            return
        Lb5:
            r1 = 285212683(0x1100000b, float:1.0097433E-28)
            r0.push(r1)
            return
        Lbc:
            r1 = 285212681(0x11000009, float:1.009743E-28)
            r0.push(r1)
            return
        Lc3:
            java.lang.String r1 = r3.value
            int r1 = r4.addUninitializedType(r1, r2)
            r2 = 50331648(0x3000000, float:3.761582E-37)
            r1 = r1 | r2
            r0.push(r1)
            return
        Ld0:
            java.lang.String r1 = r3.value
            r0.pop(r1)
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            return
        Ldb:
            java.lang.String r2 = r3.value
            r0.pop(r2)
            r2 = 184(0xb8, float:2.58E-43)
            if (r1 == r2) goto Lf9
            int r2 = r0.pop()
            r5 = 183(0xb7, float:2.56E-43)
            if (r1 != r5) goto Lf9
            java.lang.String r1 = r3.name
            char r1 = r1.charAt(r14)
            r5 = 60
            if (r1 != r5) goto Lf9
            r0.addInitializedType(r2)
        Lf9:
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            return
        Lff:
            java.lang.String r1 = r3.value
            r0.pop(r1)
            r0.pop()
            return
        L108:
            r0.pop(r12)
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            return
        L111:
            java.lang.String r1 = r3.value
            r0.pop(r1)
            return
        L117:
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            return
        L11d:
            java.lang.String r1 = "JSR/RET are not supported with computeFrames option"
            j8.o.t(r1)
            return
        L123:
            r0.pop(r15)
            r0.push(r8)
            return
        L12a:
            r0.pop(r12)
            r0.push(r8)
            return
        L131:
            r0.pop(r12)
            r0.push(r9)
            r0.push(r11)
            return
        L13b:
            r0.pop(r12)
            r0.push(r6)
            return
        L142:
            r0.pop(r12)
            r0.push(r10)
            r0.push(r11)
            return
        L14c:
            r0.setLocal(r2, r8)
            return
        L150:
            r0.pop(r5)
            r0.push(r10)
            r0.push(r11)
            return
        L15a:
            r0.pop(r15)
            r0.push(r9)
            r0.push(r11)
            return
        L164:
            r0.pop(r15)
            r0.push(r10)
            r0.push(r11)
            return
        L16e:
            int r1 = r0.pop()
            int r2 = r0.pop()
            r0.push(r1)
            r0.push(r2)
            return
        L17d:
            int r1 = r0.pop()
            int r2 = r0.pop()
            int r3 = r0.pop()
            int r4 = r0.pop()
            r0.push(r2)
            r0.push(r1)
            r0.push(r4)
            r0.push(r3)
            r0.push(r2)
            r0.push(r1)
            return
        L1a0:
            int r1 = r0.pop()
            int r2 = r0.pop()
            int r3 = r0.pop()
            r0.push(r2)
            r0.push(r1)
            r0.push(r3)
            r0.push(r2)
            r0.push(r1)
            return
        L1bc:
            int r1 = r0.pop()
            int r2 = r0.pop()
            r0.push(r2)
            r0.push(r1)
            r0.push(r2)
            r0.push(r1)
            return
        L1d1:
            int r1 = r0.pop()
            int r2 = r0.pop()
            int r3 = r0.pop()
            r0.push(r1)
            r0.push(r3)
            r0.push(r2)
            r0.push(r1)
            return
        L1ea:
            int r1 = r0.pop()
            int r2 = r0.pop()
            r0.push(r1)
            r0.push(r2)
            r0.push(r1)
            return
        L1fc:
            int r1 = r0.pop()
            r0.push(r1)
            r0.push(r1)
            return
        L207:
            r0.pop(r7)
            return
        L20b:
            r0.pop(r12)
            return
        L20f:
            r0.pop(r15)
            return
        L213:
            r0.pop(r5)
            return
        L217:
            r0.pop(r12)
            int r1 = r0.pop()
            r0.setLocal(r2, r1)
            int r1 = r2 + 1
            r0.setLocal(r1, r11)
            if (r2 <= 0) goto L317
            int r1 = r2 + (-1)
            int r2 = r0.getLocal(r1)
            if (r2 == r10) goto L23f
            if (r2 != r9) goto L233
            goto L23f
        L233:
            r3 = r2 & r15
            if (r3 == r14) goto L239
            if (r3 != r13) goto L317
        L239:
            r2 = r2 | r17
            r0.setLocal(r1, r2)
            return
        L23f:
            r0.setLocal(r1, r11)
            return
        L243:
            int r1 = r0.pop()
            r0.setLocal(r2, r1)
            if (r2 <= 0) goto L317
            int r1 = r2 + (-1)
            int r2 = r0.getLocal(r1)
            if (r2 == r10) goto L263
            if (r2 != r9) goto L257
            goto L263
        L257:
            r3 = r2 & r15
            if (r3 == r14) goto L25d
            if (r3 != r13) goto L317
        L25d:
            r2 = r2 | r17
            r0.setLocal(r1, r2)
            return
        L263:
            r0.setLocal(r1, r11)
            return
        L267:
            r0.pop(r12)
            int r1 = r0.pop()
            if (r1 != r5) goto L271
            goto L274
        L271:
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            int r1 = r1 + r2
        L274:
            r0.push(r1)
            return
        L278:
            r0.pop(r7)
            r0.push(r9)
            r0.push(r11)
            return
        L282:
            r0.pop(r7)
            r0.push(r6)
            return
        L289:
            r0.pop(r7)
            r0.push(r10)
            r0.push(r11)
            return
        L293:
            r0.pop(r7)
            r0.push(r8)
            return
        L29a:
            int r1 = r0.getLocal(r2)
            r0.push(r1)
            return
        L2a2:
            r16 = 33554432(0x2000000, float:9.403955E-38)
            int r1 = r3.tag
            switch(r1) {
                case 3: goto L2fa;
                case 4: goto L2f6;
                case 5: goto L2ef;
                case 6: goto L2e8;
                case 7: goto L2dc;
                case 8: goto L2d0;
                default: goto L2a9;
            }
        L2a9:
            switch(r1) {
                case 15: goto L2c4;
                case 16: goto L2b8;
                case 17: goto L2b2;
                default: goto L2ac;
            }
        L2ac:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L2b2:
            java.lang.String r1 = r3.value
            r0.push(r4, r1)
            return
        L2b8:
            java.lang.String r1 = "java/lang/invoke/MethodType"
            int r1 = r4.addType(r1)
            r1 = r1 | r16
            r0.push(r1)
            return
        L2c4:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            int r1 = r4.addType(r1)
            r1 = r1 | r16
            r0.push(r1)
            return
        L2d0:
            java.lang.String r1 = "java/lang/String"
            int r1 = r4.addType(r1)
            r1 = r1 | r16
            r0.push(r1)
            return
        L2dc:
            java.lang.String r1 = "java/lang/Class"
            int r1 = r4.addType(r1)
            r1 = r1 | r16
            r0.push(r1)
            return
        L2e8:
            r0.push(r9)
            r0.push(r11)
            return
        L2ef:
            r0.push(r10)
            r0.push(r11)
            return
        L2f6:
            r0.push(r6)
            return
        L2fa:
            r0.push(r8)
            return
        L2fe:
            r0.push(r9)
            r0.push(r11)
            return
        L305:
            r0.push(r6)
            return
        L309:
            r0.push(r10)
            r0.push(r11)
            return
        L310:
            r0.push(r8)
            return
        L314:
            r0.push(r5)
        L317:
            return
    }

    public final int getInputStackSize() {
            r1 = this;
            int[] r0 = r1.inputStack
            int r0 = r0.length
            return r0
    }

    public final boolean merge(bsh.org.objectweb.asm.SymbolTable r21, bsh.org.objectweb.asm.Frame r22, int r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            int[] r4 = r0.inputLocals
            int r4 = r4.length
            int[] r5 = r0.inputStack
            int r5 = r5.length
            int[] r6 = r2.inputLocals
            r7 = 1
            if (r6 != 0) goto L19
            int[] r6 = new int[r4]
            r2.inputLocals = r6
            r6 = r7
            goto L1a
        L19:
            r6 = 0
        L1a:
            r9 = 0
        L1b:
            r10 = 83886080(0x5000000, float:6.018531E-36)
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            r15 = 16777219(0x1000003, float:2.3509895E-38)
            r16 = 251658240(0xf000000, float:6.3108872E-30)
            r12 = 16777220(0x1000004, float:2.3509898E-38)
            r17 = 1048576(0x100000, float:1.469368E-39)
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r9 >= r4) goto L84
            r19 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            int[] r13 = r0.outputLocals
            if (r13 == 0) goto L6e
            int r14 = r13.length
            if (r9 >= r14) goto L6e
            r13 = r13[r9]
            if (r13 != 0) goto L40
            int[] r10 = r0.inputLocals
            r14 = r10[r9]
            goto L72
        L40:
            r14 = r13 & r19
            r8 = r13 & r16
            if (r8 != r11) goto L58
            int[] r8 = r0.inputLocals
            r10 = r13 & r18
            r8 = r8[r10]
            int r14 = r14 + r8
            r8 = r13 & r17
            if (r8 == 0) goto L72
            if (r14 == r12) goto L55
            if (r14 != r15) goto L72
        L55:
            r14 = 16777216(0x1000000, float:2.3509887E-38)
            goto L72
        L58:
            if (r8 != r10) goto L6c
            int[] r8 = r0.inputStack
            r10 = r13 & r18
            int r10 = r5 - r10
            r8 = r8[r10]
            int r14 = r14 + r8
            r8 = r13 & r17
            if (r8 == 0) goto L72
            if (r14 == r12) goto L55
            if (r14 != r15) goto L72
            goto L55
        L6c:
            r14 = r13
            goto L72
        L6e:
            int[] r8 = r0.inputLocals
            r14 = r8[r9]
        L72:
            int[] r8 = r0.initializations
            if (r8 == 0) goto L7a
            int r14 = r0.getInitializedType(r1, r14)
        L7a:
            int[] r8 = r2.inputLocals
            boolean r8 = merge(r1, r14, r8, r9)
            r6 = r6 | r8
            int r9 = r9 + 1
            goto L1b
        L84:
            r19 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            if (r3 <= 0) goto Lac
            r5 = 0
        L89:
            if (r5 >= r4) goto L99
            int[] r8 = r0.inputLocals
            r8 = r8[r5]
            int[] r9 = r2.inputLocals
            boolean r8 = merge(r1, r8, r9, r5)
            r6 = r6 | r8
            int r5 = r5 + 1
            goto L89
        L99:
            int[] r4 = r2.inputStack
            if (r4 != 0) goto La2
            int[] r4 = new int[r7]
            r2.inputStack = r4
            goto La3
        La2:
            r7 = r6
        La3:
            int[] r2 = r2.inputStack
            r4 = 0
            boolean r1 = merge(r1, r3, r2, r4)
            r1 = r1 | r7
            return r1
        Lac:
            r4 = 0
            int[] r3 = r0.inputStack
            int r3 = r3.length
            short r8 = r0.outputStackStart
            int r3 = r3 + r8
            int[] r8 = r2.inputStack
            if (r8 != 0) goto Lbf
            short r6 = r0.outputStackTop
            int r6 = r6 + r3
            int[] r6 = new int[r6]
            r2.inputStack = r6
            goto Lc0
        Lbf:
            r7 = r6
        Lc0:
            r6 = r4
        Lc1:
            if (r6 >= r3) goto Ld9
            int[] r8 = r0.inputStack
            r8 = r8[r6]
            int[] r9 = r0.initializations
            if (r9 == 0) goto Lcf
            int r8 = r0.getInitializedType(r1, r8)
        Lcf:
            int[] r9 = r2.inputStack
            boolean r8 = merge(r1, r8, r9, r6)
            r7 = r7 | r8
            int r6 = r6 + 1
            goto Lc1
        Ld9:
            r8 = r4
        Lda:
            short r4 = r0.outputStackTop
            if (r8 >= r4) goto L124
            int[] r4 = r0.outputStack
            r4 = r4[r8]
            r6 = r4 & r19
            r9 = r4 & r16
            if (r9 != r11) goto Lfc
            int[] r9 = r0.inputLocals
            r13 = r4 & r18
            r9 = r9[r13]
            int r6 = r6 + r9
            r4 = r4 & r17
            if (r4 == 0) goto Lfa
            if (r6 == r12) goto Lf7
            if (r6 != r15) goto Lfa
        Lf7:
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            goto L110
        Lfa:
            r4 = r6
            goto L110
        Lfc:
            if (r9 != r10) goto L110
            int[] r9 = r0.inputStack
            r13 = r4 & r18
            int r13 = r5 - r13
            r9 = r9[r13]
            int r6 = r6 + r9
            r4 = r4 & r17
            if (r4 == 0) goto Lfa
            if (r6 == r12) goto Lf7
            if (r6 != r15) goto Lfa
            goto Lf7
        L110:
            int[] r6 = r0.initializations
            if (r6 == 0) goto L118
            int r4 = r0.getInitializedType(r1, r4)
        L118:
            int[] r6 = r2.inputStack
            int r9 = r3 + r8
            boolean r4 = merge(r1, r4, r6, r9)
            r7 = r7 | r4
            int r8 = r8 + 1
            goto Lda
        L124:
            return r7
    }

    public final void setInputFrameFromApiFormat(bsh.org.objectweb.asm.SymbolTable r8, int r9, java.lang.Object[] r10, int r11, java.lang.Object[] r12) {
            r7 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 >= r9) goto L29
            int[] r4 = r7.inputLocals
            int r5 = r2 + 1
            r6 = r10[r1]
            int r6 = getAbstractTypeFromApiFormat(r8, r6)
            r4[r2] = r6
            r4 = r10[r1]
            java.lang.Integer r6 = bsh.org.objectweb.asm.Opcodes.LONG
            if (r4 == r6) goto L20
            java.lang.Integer r6 = bsh.org.objectweb.asm.Opcodes.DOUBLE
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
            java.lang.Integer r2 = bsh.org.objectweb.asm.Opcodes.LONG
            if (r1 == r2) goto L42
            java.lang.Integer r2 = bsh.org.objectweb.asm.Opcodes.DOUBLE
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
            java.lang.Integer r4 = bsh.org.objectweb.asm.Opcodes.LONG
            if (r1 == r4) goto L69
            java.lang.Integer r4 = bsh.org.objectweb.asm.Opcodes.DOUBLE
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

    public final void setInputFrameFromDescriptor(bsh.org.objectweb.asm.SymbolTable r9, int r10, java.lang.String r11, int r12) {
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
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r10 = r10 | r3
            r0[r1] = r10
            goto L28
        L21:
            r10 = 16777222(0x1000006, float:2.3509904E-38)
            r0[r1] = r10
            goto L28
        L27:
            r2 = r1
        L28:
            bsh.org.objectweb.asm.Type[] r10 = bsh.org.objectweb.asm.Type.getArgumentTypes(r11)
            int r11 = r10.length
            r0 = r1
        L2e:
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 >= r11) goto L56
            r4 = r10[r0]
            java.lang.String r4 = r4.getDescriptor()
            int r4 = getAbstractTypeFromDescriptor(r9, r4, r1)
            int[] r5 = r8.inputLocals
            int r6 = r2 + 1
            r5[r2] = r4
            r7 = 16777220(0x1000004, float:2.3509898E-38)
            if (r4 == r7) goto L4f
            r7 = 16777219(0x1000003, float:2.3509895E-38)
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
